package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cgestionventas_subs_0 {


public static RemoteObject  _abrirventanaoutlookemail(RemoteObject __ref,RemoteObject _titulowindow,RemoteObject _documento) throws Exception{
try {
		Debug.PushSubsStack("AbrirVentanaOutlookEmail (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3954);
if (RapidSub.canDelegate("abrirventanaoutlookemail")) { return __ref.runUserSub(false, "cgestionventas","abrirventanaoutlookemail", __ref, _titulowindow, _documento);}
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
public ResumableSub_AbrirVentanaOutlookEmail(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _titulowindow,RemoteObject _documento) {
this.parent = parent;
this.__ref = __ref;
this._titulowindow = _titulowindow;
this._documento = _documento;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
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
		Debug.PushSubsStack("AbrirVentanaOutlookEmail (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3954);
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
 BA.debugLineNum = 3957;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","815204355",RemoteObject.concat(RemoteObject.createImmutable("Buscando window title "),_titulowindow),0);
 BA.debugLineNum = 3960;BA.debugLine="Dim WU As JavaObject";
Debug.ShouldStop(8388608);
_wu = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("WU", _wu);
 BA.debugLineNum = 3961;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
Debug.ShouldStop(16777216);
_wu.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.WindowUtils")));
 BA.debugLineNum = 3962;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
Debug.ShouldStop(33554432);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _wu.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllWindows")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"False"))}))));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 3963;BA.debugLine="Dim FlagOk As Boolean";
Debug.ShouldStop(67108864);
_flagok = RemoteObject.createImmutable(false);Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 3964;BA.debugLine="For Each JO As JavaObject In L";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 3965;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
Debug.ShouldStop(268435456);
_t = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((parent.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 3967;BA.debugLine="Log(\"window title\" & t)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","815204365",RemoteObject.concat(RemoteObject.createImmutable("window title"),_t),0);
 BA.debugLineNum = 3971;BA.debugLine="If t.Contains(TituloWindow) Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 3978;BA.debugLine="FlagOk=True";
Debug.ShouldStop(512);
_flagok = parent.__c.getField(true,"True");Debug.locals.put("FlagOk", _flagok);
 BA.debugLineNum = 3979;BA.debugLine="Exit";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 3983;BA.debugLine="If FlagOk Then";
Debug.ShouldStop(16384);

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
 BA.debugLineNum = 3984;BA.debugLine="SetForegroundWindowREPSOL(t,False)";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_setforegroundwindowrepsol" /*RemoteObject*/ ,(Object)(_t),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 3985;BA.debugLine="Return True";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 3987;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No se ha enc";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No se ha encontrado la ventana de Outlook con el correo correspondiente al documento "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("Busca manualmente la ventana en outlook para enviar el email.\n"),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3990;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "abrirventanaoutlookemail"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 13;
;
 BA.debugLineNum = 3991;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 13:
//C
this.state = -1;
;
 BA.debugLineNum = 3995;BA.debugLine="End Sub";
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
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizaciondatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizacionDatos (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,907);
if (RapidSub.canDelegate("actualizaciondatos")) { return __ref.runUserSub(false, "cgestionventas","actualizaciondatos", __ref);}
ResumableSub_ActualizacionDatos rsub = new ResumableSub_ActualizacionDatos(null,__ref);
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
public static class ResumableSub_ActualizacionDatos extends BA.ResumableSub {
public ResumableSub_ActualizacionDatos(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreggv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _regins = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fechahoy = RemoteObject.createImmutable(0L);
RemoteObject _datetimeformatant = RemoteObject.createImmutable("");
RemoteObject _sfechahoy = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstregstockalmnogv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mstnogv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _qstock = RemoteObject.createImmutable(0);
RemoteObject _lstregresalmzen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstregfp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstregpcrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstregosubrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _tickshoracerodia = RemoteObject.createImmutable(0L);
RemoteObject _periodo = RemoteObject.declareNull("b4j.example.dateutils._period");
RemoteObject _tickshoracerodiasiguiente = RemoteObject.createImmutable(0L);
RemoteObject _lstregconfpl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sbcp = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _tpd = RemoteObject.createImmutable(0L);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _doc = RemoteObject.createImmutable("");
RemoteObject _numlindocsinfechacalcprevventas = RemoteObject.createImmutable(0);
RemoteObject _maxfechacalcprevventasdoc = RemoteObject.createImmutable(0L);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject group49;
int index49;
int groupLen49;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizacionDatos (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,907);
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
 BA.debugLineNum = 909;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
Debug.ShouldStop(4096);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("delete from tblGestionVentas")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 910;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(8192);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 911;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 320;
return;
case 320:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 912;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","812976133",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 928;BA.debugLine="DatosGestionVentas";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_datosgestionventas" /*void*/ );
 BA.debugLineNum = 929;BA.debugLine="Wait For DatosGestionVentas_Completed (Accion As";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","datosgestionventas_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 321;
return;
case 321:
//C
this.state = 1;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstreggv = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstRegGV", _lstreggv);
;
 BA.debugLineNum = 930;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 933;BA.debugLine="Return Accion";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 940;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
Debug.ShouldStop(2048);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("delete from tblGestionVentasCalculos")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 941;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(4096);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 942;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 322;
return;
case 322:
//C
this.state = 5;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 943;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","812976164",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 945;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblGestion";
Debug.ShouldStop(65536);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblGestionVentasCalculos")),(Object)(_lstreggv));
 BA.debugLineNum = 947;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySing";
Debug.ShouldStop(262144);
_regins = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblGestionVentasCalculos"))));Debug.locals.put("regIns", _regins);Debug.locals.put("regIns", _regins);
 BA.debugLineNum = 948;BA.debugLine="If regIns<>lstRegGV.Size Then";
Debug.ShouldStop(524288);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",_regins,BA.numberCast(double.class, _lstreggv.runMethod(true,"getSize")))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 949;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite,";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error SQLite, revisar logs.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 950;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 323;
return;
case 323:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 953;BA.debugLine="lstRegGV.Clear";
Debug.ShouldStop(16777216);
_lstreggv.runVoidMethod ("Clear");
 BA.debugLineNum = 958;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("delete from tblGestionVentasCalculos where AlmOrigen=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("0026"))})))));
 BA.debugLineNum = 959;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(1073741824);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 960;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 324;
return;
case 324:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 961;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","812976182",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 989;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(268435456);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 990;BA.debugLine="sb.Initialize";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 991;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set CompraFab = iif(Fabricacion=0,?,?)")));
 BA.debugLineNum = 992;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Compra"),RemoteObject.createImmutable("Fab")})))));
 BA.debugLineNum = 994;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(2);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 995;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 325;
return;
case 325:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 996;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","812976217",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 999;BA.debugLine="Dim FechaHOY As Long=DateUtils.SetDate(DateTime.G";
Debug.ShouldStop(64);
_fechahoy = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("FechaHOY", _fechahoy);Debug.locals.put("FechaHOY", _fechahoy);
 BA.debugLineNum = 1000;BA.debugLine="Dim DateTimeFormatAnt As String=DateTime.DateForm";
Debug.ShouldStop(128);
_datetimeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateTimeFormatAnt", _datetimeformatant);Debug.locals.put("DateTimeFormatAnt", _datetimeformatant);
 BA.debugLineNum = 1001;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 1002;BA.debugLine="Dim sFechaHOY As String=DateTime.Date(FechaHOY)";
Debug.ShouldStop(512);
_sfechahoy = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechahoy));Debug.locals.put("sFechaHOY", _sfechahoy);Debug.locals.put("sFechaHOY", _sfechahoy);
 BA.debugLineNum = 1003;BA.debugLine="Log(\"sFECHA \" & sFechaHOY)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","812976224",RemoteObject.concat(RemoteObject.createImmutable("sFECHA "),_sfechahoy),0);
 BA.debugLineNum = 1004;BA.debugLine="DateTime.DateFormat=DateTimeFormatAnt";
Debug.ShouldStop(2048);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_datetimeformatant);
 BA.debugLineNum = 1007;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
Debug.ShouldStop(16384);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("delete from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1008;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(32768);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1009;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 326;
return;
case 326:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1010;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","812976231",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1012;BA.debugLine="wait for (ExistenciasArtTallaAlmacenLineasGestion";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_existenciasarttallaalmacenlineasgestionventasalmnogv" /*RemoteObject*/ ));
this.state = 327;
return;
case 327:
//C
this.state = 9;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1013;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1014;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(2097152);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1015;BA.debugLine="Return Accion";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 1017;BA.debugLine="Dim lstRegStockAlmNoGV As List=mRes.Get(\"lstRegis";
Debug.ShouldStop(16777216);
_lstregstockalmnogv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstregstockalmnogv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRegistros")))));Debug.locals.put("lstRegStockAlmNoGV", _lstregstockalmnogv);Debug.locals.put("lstRegStockAlmNoGV", _lstregstockalmnogv);
 BA.debugLineNum = 1018;BA.debugLine="If lstRegStockAlmNoGV.Size>0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 13:
//if
this.state = 20;
if (RemoteObject.solveBoolean(">",_lstregstockalmnogv.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 1019;BA.debugLine="For Each mStNoGV As Map In lstRegStockAlmNoGV";
Debug.ShouldStop(67108864);
if (true) break;

case 16:
//for
this.state = 19;
_mstnogv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group49 = _lstregstockalmnogv;
index49 = 0;
groupLen49 = group49.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mStNoGV", _mstnogv);
this.state = 328;
if (true) break;

case 328:
//C
this.state = 19;
if (index49 < groupLen49) {
this.state = 18;
_mstnogv = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group49.runMethod(false,"Get",index49));Debug.locals.put("mStNoGV", _mstnogv);}
if (true) break;

case 329:
//C
this.state = 328;
index49++;
Debug.locals.put("mStNoGV", _mstnogv);
if (true) break;

case 18:
//C
this.state = 329;
 BA.debugLineNum = 1020;BA.debugLine="Dim QStock As Int=mStNoGV.Get(\"Stock\")";
Debug.ShouldStop(134217728);
_qstock = BA.numberCast(int.class, _mstnogv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Stock")))));Debug.locals.put("QStock", _qstock);Debug.locals.put("QStock", _qstock);
 BA.debugLineNum = 1021;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"insert in";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV (Almacen, Articulo, Talla, Fecha, QtyDisponible, sFecha) values (?,?,?,?,?,?)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {_mstnogv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("AlmOrigenDoc")))),_mstnogv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Articulo")))),_mstnogv.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Talla")))),(_fechahoy),(_qstock),(_sfechahoy)})))));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
Debug.locals.put("mStNoGV", _mstnogv);
;
 BA.debugLineNum = 1025;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(1);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1026;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 330;
return;
case 330:
//C
this.state = 20;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1027;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","812976248",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 1031;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(64);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1032;BA.debugLine="sb.Initialize";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1033;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos as t1";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos as t1 set StockAlmNoGV = ifnull((Select Stock from (Select Almacen, Articulo, Talla, QtyDisponible As Stock from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV) t2 ")));
 BA.debugLineNum = 1034;BA.debugLine="sb.Append(\" where t1.AlmOrigenGV=0 And t1.AlmOrig";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where t1.AlmOrigenGV=0 And t1.AlmOrigen=t2.Almacen And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla),0)")));
 BA.debugLineNum = 1036;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(2048);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1037;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(4096);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1038;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 331;
return;
case 331:
//C
this.state = 21;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1039;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","812976260",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1040;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(32768);
if (true) break;

case 21:
//if
this.state = 26;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
 BA.debugLineNum = 1041;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1042;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 332;
return;
case 332:
//C
this.state = 26;
;
 BA.debugLineNum = 1043;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1044;BA.debugLine="Return Accion";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1046;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","812976267",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Stock Alm No GV"),0);
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 1051;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("delete from tblStockDisponibleArticuloTallaFecha")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1052;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(134217728);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1053;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 333;
return;
case 333:
//C
this.state = 27;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1054;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","812976275",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1059;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"insert into";
Debug.ShouldStop(4);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(RemoteObject.concat(RemoteObject.createImmutable("insert into tblStockDisponibleArticuloTallaFecha select distinct Articulo, Talla, "),_fechahoy,RemoteObject.createImmutable(", StockLibre, '"),_sfechahoy,RemoteObject.createImmutable("' from tblGestionVentasCalculos where StockLibre>0"))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1061;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(16);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1062;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 334;
return;
case 334:
//C
this.state = 27;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1063;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","812976284",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1064;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(128);
if (true) break;

case 27:
//if
this.state = 32;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 1065;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1066;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 335;
return;
case 335:
//C
this.state = 32;
;
 BA.debugLineNum = 1067;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1068;BA.debugLine="Return Accion";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1070;BA.debugLine="Log(\"Success insert into tblStockDisponibleArtic";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","812976291",RemoteObject.createImmutable("Success insert into tblStockDisponibleArticuloTallaFecha (Stock libre-> fecha hoy)"),0);
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 1074;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(131072);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1075;BA.debugLine="sb.Initialize";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1076;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set QtyPteNetaAcum = ")));
 BA.debugLineNum = 1077;BA.debugLine="sb.append(\"(Select sum(QtyPteNeta) from tblGestio";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select sum(QtyPteNeta) from tblGestionVentasCalculos t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and AlmOrigenGV=1)")));
 BA.debugLineNum = 1078;BA.debugLine="sb.Append(\" where AlmOrigenGV=1\")";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmOrigenGV=1")));
 BA.debugLineNum = 1079;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1080;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(8388608);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1081;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 336;
return;
case 336:
//C
this.state = 33;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1082;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","812976303",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1083;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(67108864);
if (true) break;

case 33:
//if
this.state = 38;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 38;
 BA.debugLineNum = 1084;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1085;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 337;
return;
case 337:
//C
this.state = 38;
;
 BA.debugLineNum = 1086;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1087;BA.debugLine="Return Accion";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 37:
//C
this.state = 38;
 BA.debugLineNum = 1089;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","812976310",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos  Running Sum de QtyPteNeta en GestionVentas por artículo-talla"),0);
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 1093;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1094;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1095;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set QtyPteNetaAcum = ")));
 BA.debugLineNum = 1096;BA.debugLine="sb.append(\"(Select sum(QtyPteNeta) from tblGestio";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select sum(QtyPteNeta) from tblGestionVentasCalculos t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and t1.AlmOrigen=t2.AlmOrigen)")));
 BA.debugLineNum = 1097;BA.debugLine="sb.Append(\" where AlmOrigenGV=0\")";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmOrigenGV=0")));
 BA.debugLineNum = 1098;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(512);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1099;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(1024);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1100;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 338;
return;
case 338:
//C
this.state = 39;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1101;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","812976322",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1102;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8192);
if (true) break;

case 39:
//if
this.state = 44;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 41;
}else {
this.state = 43;
}if (true) break;

case 41:
//C
this.state = 44;
 BA.debugLineNum = 1103;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1104;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 339;
return;
case 339:
//C
this.state = 44;
;
 BA.debugLineNum = 1105;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1106;BA.debugLine="Return Accion";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 1108;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","812976329",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos  Running Sum de QtyPteNeta en GestionVentas por artículo-talla  almNoGV"),0);
 if (true) break;

case 44:
//C
this.state = 45;
;
 BA.debugLineNum = 1120;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(-2147483648);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1121;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1122;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set QtyDisponibleAcum = ")));
 BA.debugLineNum = 1124;BA.debugLine="sb.append(\"(Select (StockLibre-QtyPteNetaAcum) fr";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select (StockLibre-QtyPteNetaAcum) from tblGestionVentasCalculos t2 where t2.ROWID=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and AlmOrigenGV=1)")));
 BA.debugLineNum = 1125;BA.debugLine="sb.Append(\" where AlmOrigenGV=1\")";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmOrigenGV=1")));
 BA.debugLineNum = 1126;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(32);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1127;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(64);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1128;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 340;
return;
case 340:
//C
this.state = 45;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1129;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","812976350",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1130;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(512);
if (true) break;

case 45:
//if
this.state = 50;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 1131;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1132;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 341;
return;
case 341:
//C
this.state = 50;
;
 BA.debugLineNum = 1133;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1134;BA.debugLine="Return Accion";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 1136;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","812976357",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla"),0);
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 1141;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1048576);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1142;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1143;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set QtyDisponibleAcum = ")));
 BA.debugLineNum = 1145;BA.debugLine="sb.append(\"(Select (StockAlmNoGV-QtyPteNetaAcum)";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select (StockAlmNoGV-QtyPteNetaAcum) from tblGestionVentasCalculos t2 where t2.ROWID=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")));
 BA.debugLineNum = 1146;BA.debugLine="sb.Append(\" where AlmOrigenGV=0\")";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmOrigenGV=0")));
 BA.debugLineNum = 1147;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1148;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(134217728);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1149;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 342;
return;
case 342:
//C
this.state = 51;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1150;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","812976371",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1151;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 51:
//if
this.state = 56;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 53;
}else {
this.state = 55;
}if (true) break;

case 53:
//C
this.state = 56;
 BA.debugLineNum = 1152;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1153;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 343;
return;
case 343:
//C
this.state = 56;
;
 BA.debugLineNum = 1154;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1155;BA.debugLine="Return Accion";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 55:
//C
this.state = 56;
 BA.debugLineNum = 1157;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","812976378",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla"),0);
 if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 1163;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1024);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1164;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1165;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set St";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos set Status = ?")));
 BA.debugLineNum = 1166;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(8192);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("")})))));
 BA.debugLineNum = 1167;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(16384);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1168;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 344;
return;
case 344:
//C
this.state = 57;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1169;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","812976390",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1170;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(131072);
if (true) break;

case 57:
//if
this.state = 62;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 1171;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1172;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 345;
return;
case 345:
//C
this.state = 62;
;
 BA.debugLineNum = 1173;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1174;BA.debugLine="Return Accion";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 1176;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","812976397",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Limpiar Status"),0);
 if (true) break;

case 62:
//C
this.state = 63;
;
 BA.debugLineNum = 1179;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(67108864);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1180;BA.debugLine="sb.Initialize";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1181;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set Status = ?")));
 BA.debugLineNum = 1182;BA.debugLine="sb.append(\" where (StockLibre-QtyPteNeta)>=0 and";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where (StockLibre-QtyPteNeta)>=0 and QtyDisponibleAcum>=0 and AlmOrigenGV=1")));
 BA.debugLineNum = 1183;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("L+")})))));
 BA.debugLineNum = 1184;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(-2147483648);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1185;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 346;
return;
case 346:
//C
this.state = 63;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1186;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","812976407",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1187;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(4);
if (true) break;

case 63:
//if
this.state = 68;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
 BA.debugLineNum = 1188;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1189;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 347;
return;
case 347:
//C
this.state = 68;
;
 BA.debugLineNum = 1190;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(32);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1191;BA.debugLine="Return Accion";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 1193;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","812976414",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Status L+"),0);
 if (true) break;

case 68:
//C
this.state = 69;
;
 BA.debugLineNum = 1196;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1197;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1198;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set Status = ?")));
 BA.debugLineNum = 1199;BA.debugLine="sb.append(\" where (StockAlmNoGV-QtyPteNeta)>=0 an";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where (StockAlmNoGV-QtyPteNeta)>=0 and QtyDisponibleAcum>=0 and AlmOrigenGV=0")));
 BA.debugLineNum = 1200;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(32768);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("L+")})))));
 BA.debugLineNum = 1201;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(65536);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1202;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 348;
return;
case 348:
//C
this.state = 69;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1203;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","812976424",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1204;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(524288);
if (true) break;

case 69:
//if
this.state = 74;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 74;
 BA.debugLineNum = 1205;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1206;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 349;
return;
case 349:
//C
this.state = 74;
;
 BA.debugLineNum = 1207;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1208;BA.debugLine="Return Accion";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 73:
//C
this.state = 74;
 BA.debugLineNum = 1210;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","812976431",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Status L+"),0);
 if (true) break;

case 74:
//C
this.state = 75;
;
 BA.debugLineNum = 1213;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(268435456);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1214;BA.debugLine="sb.Initialize";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1215;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set Status = ?")));
 BA.debugLineNum = 1216;BA.debugLine="sb.append(\" where (StockLibre-QtyPteNeta)>=0 and";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where (StockLibre-QtyPteNeta)>=0 and QtyDisponibleAcum<0  and AlmOrigenGV=1")));
 BA.debugLineNum = 1217;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(1);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("L-")})))));
 BA.debugLineNum = 1218;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(2);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1219;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 350;
return;
case 350:
//C
this.state = 75;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1220;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","812976441",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1221;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(16);
if (true) break;

case 75:
//if
this.state = 80;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 77;
}else {
this.state = 79;
}if (true) break;

case 77:
//C
this.state = 80;
 BA.debugLineNum = 1222;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1223;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 351;
return;
case 351:
//C
this.state = 80;
;
 BA.debugLineNum = 1224;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1225;BA.debugLine="Return Accion";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 79:
//C
this.state = 80;
 BA.debugLineNum = 1227;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","812976448",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Status L-"),0);
 if (true) break;

case 80:
//C
this.state = 81;
;
 BA.debugLineNum = 1230;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8192);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1231;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1232;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set Status = ?")));
 BA.debugLineNum = 1233;BA.debugLine="sb.append(\" where (StockAlmNoGV-QtyPteNeta)>=0 an";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where (StockAlmNoGV-QtyPteNeta)>=0 and QtyDisponibleAcum<0 and AlmOrigenGV=0")));
 BA.debugLineNum = 1234;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(131072);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("L-")})))));
 BA.debugLineNum = 1235;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(262144);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1236;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 352;
return;
case 352:
//C
this.state = 81;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1237;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","812976458",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1238;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 81:
//if
this.state = 86;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
 BA.debugLineNum = 1239;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1240;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 353;
return;
case 353:
//C
this.state = 86;
;
 BA.debugLineNum = 1241;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1242;BA.debugLine="Return Accion";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 85:
//C
this.state = 86;
 BA.debugLineNum = 1244;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","812976465",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Status L-"),0);
 if (true) break;

case 86:
//C
this.state = 87;
;
 BA.debugLineNum = 1248;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(-2147483648);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1249;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1250;BA.debugLine="sb.Append(\"UPDATE tblGestionVentasCalculos SET ST";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("UPDATE tblGestionVentasCalculos SET STATUS=? WHERE Documento in (")));
 BA.debugLineNum = 1251;BA.debugLine="sb.Append(\"Select tLineasDoc.Documento \")";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select tLineasDoc.Documento ")));
 BA.debugLineNum = 1252;BA.debugLine="sb.append(\"FROM \")";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FROM ")));
 BA.debugLineNum = 1253;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select Documento, count(Linea) As NumLineas from tblGestionVentasCalculos group by Documento) tLineasDoc ")));
 BA.debugLineNum = 1254;BA.debugLine="sb.append(\"LEFT JOIN \")";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("LEFT JOIN ")));
 BA.debugLineNum = 1255;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select Documento, count(Linea) As NumLineasCompletas FROM tblGestionVentasCalculos WHERE Status='L+' GROUP BY Documento) tLineasDocCompletas ")));
 BA.debugLineNum = 1256;BA.debugLine="sb.append(\"USING (Documento) \")";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("USING (Documento) ")));
 BA.debugLineNum = 1257;BA.debugLine="sb.append(\"WHERE  tLineasDoc.NumLineas=coalesce(t";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("WHERE  tLineasDoc.NumLineas=coalesce(tLineasDocCompletas.NumLineasCompletas,0))")));
 BA.debugLineNum = 1258;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(512);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("P+"))})))));
 BA.debugLineNum = 1259;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(1024);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1260;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 354;
return;
case 354:
//C
this.state = 87;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1261;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","812976482",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1262;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8192);
if (true) break;

case 87:
//if
this.state = 92;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 89;
}else {
this.state = 91;
}if (true) break;

case 89:
//C
this.state = 92;
 BA.debugLineNum = 1263;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1264;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 355;
return;
case 355:
//C
this.state = 92;
;
 BA.debugLineNum = 1265;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1266;BA.debugLine="Return Accion";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 91:
//C
this.state = 92;
 BA.debugLineNum = 1268;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","812976489",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Status P+"),0);
 if (true) break;

case 92:
//C
this.state = 93;
;
 BA.debugLineNum = 1271;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4194304);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1272;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1273;BA.debugLine="sb.Append(\"UPDATE tblGestionVentasCalculos SET ST";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("UPDATE tblGestionVentasCalculos SET STATUS=? WHERE Documento in (")));
 BA.debugLineNum = 1274;BA.debugLine="sb.Append(\"Select tLineasDoc.Documento \")";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select tLineasDoc.Documento ")));
 BA.debugLineNum = 1275;BA.debugLine="sb.append(\"FROM \")";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FROM ")));
 BA.debugLineNum = 1276;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select Documento, count(Linea) As NumLineas from tblGestionVentasCalculos group by Documento) tLineasDoc ")));
 BA.debugLineNum = 1277;BA.debugLine="sb.append(\"LEFT JOIN \")";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("LEFT JOIN ")));
 BA.debugLineNum = 1278;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select Documento, count(Linea) As NumLineasCompletas FROM tblGestionVentasCalculos WHERE Status='L+' or Status='L-' GROUP BY Documento) tLineasDocCompletas ")));
 BA.debugLineNum = 1279;BA.debugLine="sb.append(\"USING (Documento) \")";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("USING (Documento) ")));
 BA.debugLineNum = 1280;BA.debugLine="sb.append(\"LEFT JOIN \")";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("LEFT JOIN ")));
 BA.debugLineNum = 1281;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select Documento, count(Linea) As NumLineasCompletasDispNeg FROM tblGestionVentasCalculos WHERE Status='L-' GROUP BY Documento) tLineasDocCompletasDispNeg ")));
 BA.debugLineNum = 1282;BA.debugLine="sb.append(\"USING (Documento) \")";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("USING (Documento) ")));
 BA.debugLineNum = 1283;BA.debugLine="sb.append(\"WHERE  tLineasDoc.NumLineas=coalesce(t";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("WHERE  tLineasDoc.NumLineas=coalesce(tLineasDocCompletas.NumLineasCompletas,0) and coalesce(tLineasDocCompletasDispNeg.NumLineasCompletasDispNeg,0)>0)")));
 BA.debugLineNum = 1284;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(8);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("P-"))})))));
 BA.debugLineNum = 1285;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(16);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1286;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 356;
return;
case 356:
//C
this.state = 93;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1287;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","812976508",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1288;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(128);
if (true) break;

case 93:
//if
this.state = 98;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 95;
}else {
this.state = 97;
}if (true) break;

case 95:
//C
this.state = 98;
 BA.debugLineNum = 1289;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1290;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 357;
return;
case 357:
//C
this.state = 98;
;
 BA.debugLineNum = 1291;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1292;BA.debugLine="Return Accion";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 97:
//C
this.state = 98;
 BA.debugLineNum = 1294;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","812976515",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos Status P-"),0);
 if (true) break;

case 98:
//C
this.state = 99;
;
 BA.debugLineNum = 1297;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblRe";
Debug.ShouldStop(65536);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblReservasDocumentoAlmZen")));
 BA.debugLineNum = 1298;BA.debugLine="Wait For (ReservasDocumentoAlmZenProin) complete";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_reservasdocumentoalmzenproin" /*RemoteObject*/ ));
this.state = 358;
return;
case 358:
//C
this.state = 99;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1299;BA.debugLine="If mRes.Get(\"Accion\")=\"Salir\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 99:
//if
this.state = 102;
if (RemoteObject.solveBoolean("=",_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))),RemoteObject.createImmutable(("Salir")))) { 
this.state = 101;
}if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 1300;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1301;BA.debugLine="Return Accion";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 102:
//C
this.state = 103;
;
 BA.debugLineNum = 1303;BA.debugLine="Dim lstRegResAlmZen As List=mRes.Get(\"lstRegistro";
Debug.ShouldStop(4194304);
_lstregresalmzen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstregresalmzen = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRegistros")))));Debug.locals.put("lstRegResAlmZen", _lstregresalmzen);Debug.locals.put("lstRegResAlmZen", _lstregresalmzen);
 BA.debugLineNum = 1305;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblReserva";
Debug.ShouldStop(16777216);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblReservasDocumentoAlmZen")),(Object)(_lstregresalmzen));
 BA.debugLineNum = 1311;BA.debugLine="lstRegResAlmZen.Clear";
Debug.ShouldStop(1073741824);
_lstregresalmzen.runVoidMethod ("Clear");
 BA.debugLineNum = 1314;BA.debugLine="Wait For (ReservasDocumentoAlmZenProtec) complete";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_reservasdocumentoalmzenprotec" /*RemoteObject*/ ));
this.state = 359;
return;
case 359:
//C
this.state = 103;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 1315;BA.debugLine="If mRes.Get(\"Accion\")=\"Salir\" Then";
Debug.ShouldStop(4);
if (true) break;

case 103:
//if
this.state = 106;
if (RemoteObject.solveBoolean("=",_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))),RemoteObject.createImmutable(("Salir")))) { 
this.state = 105;
}if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 1316;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1317;BA.debugLine="Return Accion";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 106:
//C
this.state = 107;
;
 BA.debugLineNum = 1319;BA.debugLine="Dim lstRegResAlmZen As List=mRes.Get(\"lstRegistro";
Debug.ShouldStop(64);
_lstregresalmzen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstregresalmzen = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRegistros")))));Debug.locals.put("lstRegResAlmZen", _lstregresalmzen);Debug.locals.put("lstRegResAlmZen", _lstregresalmzen);
 BA.debugLineNum = 1321;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblReserva";
Debug.ShouldStop(256);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblReservasDocumentoAlmZen")),(Object)(_lstregresalmzen));
 BA.debugLineNum = 1327;BA.debugLine="lstRegResAlmZen.Clear";
Debug.ShouldStop(16384);
_lstregresalmzen.runVoidMethod ("Clear");
 BA.debugLineNum = 1331;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(262144);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1332;BA.debugLine="sb.Initialize";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1333;BA.debugLine="sb.append(\"update tblGestionVentasCalculos as t1";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos as t1 set ReservaAlmacen = ifnull((Select QtyReservaAlmZen from ")));
 BA.debugLineNum = 1334;BA.debugLine="sb.append(\"(Select DocumentoReserva, Articulo, Ta";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select DocumentoReserva, Articulo, Talla, Sum(qty) As QtyReservaAlmZen from tblReservasDocumentoAlmZen group by DocumentoReserva, Articulo, Talla) t2 ")));
 BA.debugLineNum = 1335;BA.debugLine="sb.append(\"where t1.Documento=t2.DocumentoReserva";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("where t1.Documento=t2.DocumentoReserva And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla),0)")));
 BA.debugLineNum = 1336;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1337;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(16777216);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1338;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 360;
return;
case 360:
//C
this.state = 107;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1339;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","812976560",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1340;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(134217728);
if (true) break;

case 107:
//if
this.state = 112;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 109;
}else {
this.state = 111;
}if (true) break;

case 109:
//C
this.state = 112;
 BA.debugLineNum = 1341;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1342;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 361;
return;
case 361:
//C
this.state = 112;
;
 BA.debugLineNum = 1343;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1073741824);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1344;BA.debugLine="Return Accion";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 1346;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","812976567",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos reservasAlmzen"),0);
 if (true) break;

case 112:
//C
this.state = 113;
;
 BA.debugLineNum = 1349;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1350;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1351;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set ID";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos set IDPrioridad=ROWID, IDPrioridadUsuario=ROWID")));
 BA.debugLineNum = 1352;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(128);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1353;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(256);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1354;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 362;
return;
case 362:
//C
this.state = 113;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1355;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","812976576",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1356;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2048);
if (true) break;

case 113:
//if
this.state = 118;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 118;
 BA.debugLineNum = 1357;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1358;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 363;
return;
case 363:
//C
this.state = 118;
;
 BA.debugLineNum = 1359;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1360;BA.debugLine="Return Accion";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 117:
//C
this.state = 118;
 BA.debugLineNum = 1362;BA.debugLine="Log(\"Success SQLite update IDPrioridadUsuario\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","812976583",RemoteObject.createImmutable("Success SQLite update IDPrioridadUsuario"),0);
 if (true) break;
;
 BA.debugLineNum = 1367;BA.debugLine="If CalcularFechas Then";
Debug.ShouldStop(4194304);

case 118:
//if
this.state = 313;
if (__ref.getField(true,"_calcularfechas" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 120;
}else {
this.state = 306;
}if (true) break;

case 120:
//C
this.state = 121;
 BA.debugLineNum = 1372;BA.debugLine="FechasPrometidasCompras";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_fechasprometidascompras" /*void*/ );
 BA.debugLineNum = 1373;BA.debugLine="Wait For FechasPrometidasCompras_Completed (Acci";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","fechasprometidascompras_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 364;
return;
case 364:
//C
this.state = 121;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstregfp = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstRegFP", _lstregfp);
;
 BA.debugLineNum = 1374;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 121:
//if
this.state = 124;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 123;
}if (true) break;

case 123:
//C
this.state = 124;
 BA.debugLineNum = 1377;BA.debugLine="Return Accion";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 124:
//C
this.state = 125;
;
 BA.debugLineNum = 1379;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblF";
Debug.ShouldStop(4);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblFechasPrometidasCompra")));
 BA.debugLineNum = 1380;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblFechas";
Debug.ShouldStop(8);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblFechasPrometidasCompra")),(Object)(_lstregfp));
 BA.debugLineNum = 1381;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
Debug.ShouldStop(16);
_regins = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblFechasPrometidasCompra"))));Debug.locals.put("regIns", _regins);Debug.locals.put("regIns", _regins);
 BA.debugLineNum = 1382;BA.debugLine="If regIns<>lstRegFP.Size Then";
Debug.ShouldStop(32);
if (true) break;

case 125:
//if
this.state = 128;
if (RemoteObject.solveBoolean("!",_regins,BA.numberCast(double.class, _lstregfp.runMethod(true,"getSize")))) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
 BA.debugLineNum = 1383;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error SQLite, revisar logs.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1384;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 365;
return;
case 365:
//C
this.state = 128;
;
 if (true) break;

case 128:
//C
this.state = 129;
;
 BA.debugLineNum = 1386;BA.debugLine="lstRegFP.Clear";
Debug.ShouldStop(512);
_lstregfp.runVoidMethod ("Clear");
 BA.debugLineNum = 1388;BA.debugLine="PedidosComprasRecibidosPtesRecepcionar";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_pedidoscomprasrecibidosptesrecepcionar" /*void*/ );
 BA.debugLineNum = 1389;BA.debugLine="Wait For PedidosComprasRecibidosPtesRecepcionar_";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","pedidoscomprasrecibidosptesrecepcionar_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 366;
return;
case 366:
//C
this.state = 129;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstregpcrec = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstRegPCRec", _lstregpcrec);
;
 BA.debugLineNum = 1390;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 129:
//if
this.state = 132;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 131;
}if (true) break;

case 131:
//C
this.state = 132;
 BA.debugLineNum = 1393;BA.debugLine="Return Accion";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 132:
//C
this.state = 133;
;
 BA.debugLineNum = 1395;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblP";
Debug.ShouldStop(262144);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblPedidosCompraRecibidosPtesRecepcionar")));
 BA.debugLineNum = 1396;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblPedido";
Debug.ShouldStop(524288);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblPedidosCompraRecibidosPtesRecepcionar")),(Object)(_lstregpcrec));
 BA.debugLineNum = 1397;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
Debug.ShouldStop(1048576);
_regins = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblPedidosCompraRecibidosPtesRecepcionar"))));Debug.locals.put("regIns", _regins);Debug.locals.put("regIns", _regins);
 BA.debugLineNum = 1398;BA.debugLine="If regIns<>lstRegPCRec.Size Then";
Debug.ShouldStop(2097152);
if (true) break;

case 133:
//if
this.state = 136;
if (RemoteObject.solveBoolean("!",_regins,BA.numberCast(double.class, _lstregpcrec.runMethod(true,"getSize")))) { 
this.state = 135;
}if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 1399;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error SQLite, revisar logs.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1400;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 367;
return;
case 367:
//C
this.state = 136;
;
 if (true) break;

case 136:
//C
this.state = 137;
;
 BA.debugLineNum = 1402;BA.debugLine="lstRegPCRec.Clear";
Debug.ShouldStop(33554432);
_lstregpcrec.runVoidMethod ("Clear");
 BA.debugLineNum = 1406;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(536870912);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1407;BA.debugLine="sb.Initialize";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1408;BA.debugLine="sb.Append(\"delete from tblFechasPrometidasCompra";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("delete from tblFechasPrometidasCompra As t1 where Not exists (")));
 BA.debugLineNum = 1413;BA.debugLine="sb.Append(\"Select distinct Articulo, Talla from";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")));
 BA.debugLineNum = 1414;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(32);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1417;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(256);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1418;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 368;
return;
case 368:
//C
this.state = 137;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1419;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","812976640",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1420;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2048);
if (true) break;

case 137:
//if
this.state = 142;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 139;
}else {
this.state = 141;
}if (true) break;

case 139:
//C
this.state = 142;
 BA.debugLineNum = 1421;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1422;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 369;
return;
case 369:
//C
this.state = 142;
;
 BA.debugLineNum = 1423;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1424;BA.debugLine="Return Accion";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 141:
//C
this.state = 142;
 BA.debugLineNum = 1426;BA.debugLine="Log(\"Success delete from tblFechasPrometidasCom";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","812976647",RemoteObject.createImmutable("Success delete from tblFechasPrometidasCompra arts-tallas no en GV"),0);
 if (true) break;

case 142:
//C
this.state = 143;
;
 BA.debugLineNum = 1430;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"update tblFechas";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("update tblFechasPrometidasCompra set sFechaProm=DATE(ROUND(FechaProm / 1000), 'unixepoch') ")));
 BA.debugLineNum = 1434;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(33554432);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1435;BA.debugLine="sb.Initialize";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1436;BA.debugLine="sb.Append(\"delete from tblPedidosCompraRecibidos";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("delete from tblPedidosCompraRecibidosPtesRecepcionar As t1 where Not exists (")));
 BA.debugLineNum = 1441;BA.debugLine="sb.Append(\"Select distinct Articulo, Talla from";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)")));
 BA.debugLineNum = 1442;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(2);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1445;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(16);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1446;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 370;
return;
case 370:
//C
this.state = 143;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1447;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","812976668",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1448;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(128);
if (true) break;

case 143:
//if
this.state = 148;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 145;
}else {
this.state = 147;
}if (true) break;

case 145:
//C
this.state = 148;
 BA.debugLineNum = 1449;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1450;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 371;
return;
case 371:
//C
this.state = 148;
;
 BA.debugLineNum = 1451;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1452;BA.debugLine="Return Accion";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 147:
//C
this.state = 148;
 BA.debugLineNum = 1454;BA.debugLine="Log(\"Success delete from tblPedidosCompraRecibi";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","812976675",RemoteObject.createImmutable("Success delete from tblPedidosCompraRecibidosPtesRecepcionar arts-tallas no vendedor actual"),0);
 if (true) break;

case 148:
//C
this.state = 149;
;
 BA.debugLineNum = 1457;BA.debugLine="OSUBsPendientesTerminaProductoNoCorteNoConfeccio";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_osubspendientesterminaproductonocortenoconfeccion" /*void*/ );
 BA.debugLineNum = 1458;BA.debugLine="Wait For OSUBsPendientesTerminaProductoNoCorteNo";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","osubspendientesterminaproductonocortenoconfeccion_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 372;
return;
case 372:
//C
this.state = 149;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstregosubrec = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstRegOSUBRec", _lstregosubrec);
;
 BA.debugLineNum = 1459;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 149:
//if
this.state = 152;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 151;
}if (true) break;

case 151:
//C
this.state = 152;
 BA.debugLineNum = 1462;BA.debugLine="Return Accion";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 152:
//C
this.state = 153;
;
 BA.debugLineNum = 1464;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblO";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")));
 BA.debugLineNum = 1465;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblOSUBsP";
Debug.ShouldStop(16777216);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")),(Object)(_lstregosubrec));
 BA.debugLineNum = 1466;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
Debug.ShouldStop(33554432);
_regins = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion"))));Debug.locals.put("regIns", _regins);Debug.locals.put("regIns", _regins);
 BA.debugLineNum = 1467;BA.debugLine="If regIns<>lstRegOSUBRec.Size Then";
Debug.ShouldStop(67108864);
if (true) break;

case 153:
//if
this.state = 156;
if (RemoteObject.solveBoolean("!",_regins,BA.numberCast(double.class, _lstregosubrec.runMethod(true,"getSize")))) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 1468;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error SQLite, revisar logs.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1469;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 373;
return;
case 373:
//C
this.state = 156;
;
 if (true) break;

case 156:
//C
this.state = 157;
;
 BA.debugLineNum = 1471;BA.debugLine="lstRegOSUBRec.Clear";
Debug.ShouldStop(1073741824);
_lstregosubrec.runVoidMethod ("Clear");
 BA.debugLineNum = 1474;BA.debugLine="Dim TicksHoraCeroDia As Long=DateUtils.SetDate(D";
Debug.ShouldStop(2);
_tickshoracerodia = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("TicksHoraCeroDia", _tickshoracerodia);Debug.locals.put("TicksHoraCeroDia", _tickshoracerodia);
 BA.debugLineNum = 1475;BA.debugLine="Dim Periodo As Period";
Debug.ShouldStop(4);
_periodo = RemoteObject.createNew ("b4j.example.dateutils._period");Debug.locals.put("Periodo", _periodo);
 BA.debugLineNum = 1476;BA.debugLine="Periodo.Initialize";
Debug.ShouldStop(8);
_periodo.runVoidMethod ("Initialize");
 BA.debugLineNum = 1477;BA.debugLine="Periodo.Days=1";
Debug.ShouldStop(16);
_periodo.setField ("Days",BA.numberCast(int.class, 1));
 BA.debugLineNum = 1478;BA.debugLine="Dim TicksHoraCeroDiaSiguiente As Long=DateUtils.";
Debug.ShouldStop(32);
_tickshoracerodiasiguiente = parent._dateutils.runMethod(true,"_addperiod",(Object)(_tickshoracerodia),(Object)(_periodo));Debug.locals.put("TicksHoraCeroDiaSiguiente", _tickshoracerodiasiguiente);Debug.locals.put("TicksHoraCeroDiaSiguiente", _tickshoracerodiasiguiente);
 BA.debugLineNum = 1483;BA.debugLine="Log(\"Mañana \" & DateTime.Date(TicksHoraCeroDiaSi";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","812976704",RemoteObject.concat(RemoteObject.createImmutable("Mañana "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_tickshoracerodiasiguiente))),0);
 BA.debugLineNum = 1484;BA.debugLine="mSQLGestionventas.ExecNonQuery2(\"update tblOSUBs";
Debug.ShouldStop(2048);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set FechaVencimientoAj=FechaVencimiento+?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"))})))));
 BA.debugLineNum = 1485;BA.debugLine="mSQLGestionventas.ExecNonQuery2(\"update tblOSUBs";
Debug.ShouldStop(4096);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set FechaVencimientoAj=? where FechaVencimiento<=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_tickshoracerodiasiguiente),(_tickshoracerodiasiguiente)})))));
 BA.debugLineNum = 1487;BA.debugLine="mSQLGestionventas.ExecNonQuery2(\"update tblOSUBs";
Debug.ShouldStop(16384);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set sFechaProm=DATE(ROUND(FechaVencimiento+?/ 1000), 'unixepoch') ")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"))})))));
 BA.debugLineNum = 1493;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1048576);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1494;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1495;BA.debugLine="sb.Append(\"insert into tblStockDisponibleArticul";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblStockDisponibleArticuloTallaFecha select Articulo, Talla, FechaProm+? , sum(QtyPteRecibir), sFechaProm from tblFechasPrometidasCompra")));
 BA.debugLineNum = 1496;BA.debugLine="sb.Append(\" where AlmacenGV=1\")";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmacenGV=1")));
 BA.debugLineNum = 1497;BA.debugLine="sb.Append(\" group by Articulo, Talla, FechaProm,";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" group by Articulo, Talla, FechaProm, sFechaProm")));
 BA.debugLineNum = 1498;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"))})))));
 BA.debugLineNum = 1499;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(67108864);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1500;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 374;
return;
case 374:
//C
this.state = 157;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1501;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","812976722",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1502;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 157:
//if
this.state = 162;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 159;
}else {
this.state = 161;
}if (true) break;

case 159:
//C
this.state = 162;
 BA.debugLineNum = 1503;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1504;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 375;
return;
case 375:
//C
this.state = 162;
;
 BA.debugLineNum = 1505;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1506;BA.debugLine="Return Accion";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 161:
//C
this.state = 162;
 BA.debugLineNum = 1509;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","812976730",RemoteObject.createImmutable("Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaProm , sum(QtyPteRecibir) desde tblFechasPrometidasCompra"),0);
 if (true) break;

case 162:
//C
this.state = 163;
;
 BA.debugLineNum = 1512;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(128);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1513;BA.debugLine="sb.Initialize";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1514;BA.debugLine="sb.Append(\"insert into tblStockDisponibleArticul";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV select Almacen, Articulo, Talla, FechaProm+? , sum(QtyPteRecibir), sFechaProm from tblFechasPrometidasCompra")));
 BA.debugLineNum = 1515;BA.debugLine="sb.Append(\" where AlmacenGV=0\")";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmacenGV=0")));
 BA.debugLineNum = 1516;BA.debugLine="sb.Append(\" group by Almacen,Articulo, Talla, Fe";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" group by Almacen,Articulo, Talla, FechaProm, sFechaProm")));
 BA.debugLineNum = 1517;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(4096);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay"))})))));
 BA.debugLineNum = 1518;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(8192);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1519;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 376;
return;
case 376:
//C
this.state = 163;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1520;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","812976741",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1521;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(65536);
if (true) break;

case 163:
//if
this.state = 168;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 165;
}else {
this.state = 167;
}if (true) break;

case 165:
//C
this.state = 168;
 BA.debugLineNum = 1522;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1523;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 377;
return;
case 377:
//C
this.state = 168;
;
 BA.debugLineNum = 1524;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1525;BA.debugLine="Return Accion";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 167:
//C
this.state = 168;
 BA.debugLineNum = 1528;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","812976749",RemoteObject.createImmutable("Success SQLite insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV datos FechaProm , sum(QtyPteRecibir) desde tblFechasPrometidasCompra"),0);
 if (true) break;

case 168:
//C
this.state = 169;
;
 BA.debugLineNum = 1532;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"insert int";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("insert into tblStockDisponibleArticuloTallaFecha select Articulo, Talla, FechaVencimientoAj, sum(TQtyPte), sFechaProm from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion where FechaVencimientoAj>=? group by Articulo, Talla, FechaVencimientoAj,sFechaProm")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fechahoy)})))));
 BA.debugLineNum = 1533;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(268435456);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1534;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 378;
return;
case 378:
//C
this.state = 169;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1535;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","812976756",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1536;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 169:
//if
this.state = 174;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 171;
}else {
this.state = 173;
}if (true) break;

case 171:
//C
this.state = 174;
 BA.debugLineNum = 1537;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1538;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 379;
return;
case 379:
//C
this.state = 174;
;
 BA.debugLineNum = 1539;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1540;BA.debugLine="Return Accion";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 173:
//C
this.state = 174;
 BA.debugLineNum = 1542;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","812976763",RemoteObject.createImmutable("Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaVencimientoAj , sum(TQtyPte) desde tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion"),0);
 if (true) break;

case 174:
//C
this.state = 175;
;
 BA.debugLineNum = 1548;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1549;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1550;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set RutaAplicable = Ruta, PlazoRutaAplicable=PlazoRuta")));
 BA.debugLineNum = 1551;BA.debugLine="sb.append(\" where ArticuloCorte=? and Dual=?\")";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where ArticuloCorte=? and Dual=?")));
 BA.debugLineNum = 1552;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(32768);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("SI"),BA.NumberToString(0)})))));
 BA.debugLineNum = 1554;BA.debugLine="sb.Initialize";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1555;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set RutaAplicable = RutaDual, PlazoRutaAplicable=PlazoRutaDual")));
 BA.debugLineNum = 1556;BA.debugLine="sb.append(\" where ArticuloCorte=? and Dual=?\")";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where ArticuloCorte=? and Dual=?")));
 BA.debugLineNum = 1557;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("SI"),BA.NumberToString(1)})))));
 BA.debugLineNum = 1560;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1561;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1562;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set RutaAplicable = Ruta, PlazoRutaAplicable=PlazoRuta")));
 BA.debugLineNum = 1563;BA.debugLine="sb.append(\" where ArticuloCorte=?\")";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where ArticuloCorte=?")));
 BA.debugLineNum = 1564;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("NO")})))));
 BA.debugLineNum = 1566;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(536870912);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1567;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 380;
return;
case 380:
//C
this.state = 175;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1568;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","812976789",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1569;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(1);
if (true) break;

case 175:
//if
this.state = 180;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 177;
}else {
this.state = 179;
}if (true) break;

case 177:
//C
this.state = 180;
 BA.debugLineNum = 1570;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1571;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 381;
return;
case 381:
//C
this.state = 180;
;
 BA.debugLineNum = 1572;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1573;BA.debugLine="Return Accion";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 179:
//C
this.state = 180;
 BA.debugLineNum = 1575;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","812976796",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos"),0);
 if (true) break;

case 180:
//C
this.state = 181;
;
 BA.debugLineNum = 1581;BA.debugLine="ConfPlazoFechaEntregaPlan";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_confplazofechaentregaplan" /*void*/ );
 BA.debugLineNum = 1582;BA.debugLine="Wait For ConfPlazoFechaEntregaPlan_Completed (Ac";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","confplazofechaentregaplan_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 382;
return;
case 382:
//C
this.state = 181;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
_lstregconfpl = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(2));Debug.locals.put("lstRegConfPL", _lstregconfpl);
;
 BA.debugLineNum = 1583;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 181:
//if
this.state = 184;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 183;
}if (true) break;

case 183:
//C
this.state = 184;
 BA.debugLineNum = 1586;BA.debugLine="Return Accion";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 184:
//C
this.state = 185;
;
 BA.debugLineNum = 1588;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblC";
Debug.ShouldStop(524288);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblConfPlazoFechaEntregaPlan")));
 BA.debugLineNum = 1589;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblConfPl";
Debug.ShouldStop(1048576);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblConfPlazoFechaEntregaPlan")),(Object)(_lstregconfpl));
 BA.debugLineNum = 1590;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
Debug.ShouldStop(2097152);
_regins = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult",(Object)(RemoteObject.createImmutable("select count(*) from tblConfPlazoFechaEntregaPlan"))));Debug.locals.put("regIns", _regins);Debug.locals.put("regIns", _regins);
 BA.debugLineNum = 1591;BA.debugLine="If regIns<>lstRegConfPL.Size Then";
Debug.ShouldStop(4194304);
if (true) break;

case 185:
//if
this.state = 188;
if (RemoteObject.solveBoolean("!",_regins,BA.numberCast(double.class, _lstregconfpl.runMethod(true,"getSize")))) { 
this.state = 187;
}if (true) break;

case 187:
//C
this.state = 188;
 BA.debugLineNum = 1592;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error SQLite, revisar logs.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1593;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 383;
return;
case 383:
//C
this.state = 188;
;
 if (true) break;

case 188:
//C
this.state = 189;
;
 BA.debugLineNum = 1595;BA.debugLine="lstRegConfPL.Clear";
Debug.ShouldStop(67108864);
_lstregconfpl.runVoidMethod ("Clear");
 BA.debugLineNum = 1603;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblC";
Debug.ShouldStop(4);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblConfPlazoFechaEntregaPlanArticulosFabGV")));
 BA.debugLineNum = 1604;BA.debugLine="Dim sbCP As StringBuilder";
Debug.ShouldStop(8);
_sbcp = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCP", _sbcp);
 BA.debugLineNum = 1605;BA.debugLine="sbCP.Initialize";
Debug.ShouldStop(16);
_sbcp.runVoidMethod ("Initialize");
 BA.debugLineNum = 1607;BA.debugLine="sbCP.Append(\"insert into tblConfPlazoFechaEntreg";
Debug.ShouldStop(64);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblConfPlazoFechaEntregaPlanArticulosFabGV ")));
 BA.debugLineNum = 1609;BA.debugLine="sbCP.Append(\"Select tGV.Documento, tGV.Linea, tG";
Debug.ShouldStop(256);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select tGV.Documento, tGV.Linea, tGV.FechaDocumento, tGV.Articulo, tGV.Cliente, tGV.GRP, tGV.Ruta,")));
 BA.debugLineNum = 1611;BA.debugLine="sbCP.Append(\"coalesce(t1.Plazo,0) As Plazo1,\")";
Debug.ShouldStop(1024);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t1.Plazo,0) As Plazo1,")));
 BA.debugLineNum = 1612;BA.debugLine="sbCP.Append(\"coalesce(t2.Plazo,0) As Plazo2,\")";
Debug.ShouldStop(2048);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t2.Plazo,0) As Plazo2,")));
 BA.debugLineNum = 1613;BA.debugLine="sbCP.Append(\"coalesce(t3.Plazo,0) As Plazo3,\")";
Debug.ShouldStop(4096);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t3.Plazo,0) As Plazo3,")));
 BA.debugLineNum = 1614;BA.debugLine="sbCP.Append(\"coalesce(t4.Plazo,0) As Plazo4,\")";
Debug.ShouldStop(8192);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t4.Plazo,0) As Plazo4,")));
 BA.debugLineNum = 1615;BA.debugLine="sbCP.Append(\"coalesce(t5.Plazo,0) As Plazo5,\")";
Debug.ShouldStop(16384);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t5.Plazo,0) As Plazo5,")));
 BA.debugLineNum = 1616;BA.debugLine="sbCP.Append(\"coalesce(t6.Plazo,0) As Plazo6,\")";
Debug.ShouldStop(32768);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t6.Plazo,0) As Plazo6,")));
 BA.debugLineNum = 1617;BA.debugLine="sbCP.Append(\"coalesce(t7.Plazo,0) As Plazo7,\")";
Debug.ShouldStop(65536);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t7.Plazo,0) As Plazo7,")));
 BA.debugLineNum = 1618;BA.debugLine="sbCP.Append(\"coalesce(t8.Plazo,0) As Plazo8,\")";
Debug.ShouldStop(131072);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t8.Plazo,0) As Plazo8,")));
 BA.debugLineNum = 1619;BA.debugLine="sbCP.Append(\"coalesce(t9.Plazo,0) As Plazo9,\")";
Debug.ShouldStop(262144);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t9.Plazo,0) As Plazo9,")));
 BA.debugLineNum = 1620;BA.debugLine="sbCP.Append(\"coalesce(t10.Plazo,0) As Plazo10,\")";
Debug.ShouldStop(524288);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("coalesce(t10.Plazo,0) As Plazo10,")));
 BA.debugLineNum = 1622;BA.debugLine="sbCP.Append(\"tGV.PlazoRutaAplicable,\")";
Debug.ShouldStop(2097152);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("tGV.PlazoRutaAplicable,")));
 BA.debugLineNum = 1624;BA.debugLine="sbCP.Append(\"iif(coalesce(t1.Plazo,0)>0, t1.Plaz";
Debug.ShouldStop(8388608);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t1.Plazo,0)>0, t1.Plazo,")));
 BA.debugLineNum = 1625;BA.debugLine="sbCP.Append(\"iif(coalesce(t2.Plazo,0)>0, t2.Plaz";
Debug.ShouldStop(16777216);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t2.Plazo,0)>0, t2.Plazo,")));
 BA.debugLineNum = 1626;BA.debugLine="sbCP.Append(\"iif(coalesce(t3.Plazo,0)>0, t3.Plaz";
Debug.ShouldStop(33554432);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t3.Plazo,0)>0, t3.Plazo,")));
 BA.debugLineNum = 1627;BA.debugLine="sbCP.Append(\"iif(coalesce(t4.Plazo,0)>0, t4.Plaz";
Debug.ShouldStop(67108864);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t4.Plazo,0)>0, t4.Plazo,")));
 BA.debugLineNum = 1628;BA.debugLine="sbCP.Append(\"iif(coalesce(t5.Plazo,0)>0, t5.Plaz";
Debug.ShouldStop(134217728);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t5.Plazo,0)>0, t5.Plazo,")));
 BA.debugLineNum = 1629;BA.debugLine="sbCP.Append(\"iif(coalesce(t6.Plazo,0)>0, t6.Plaz";
Debug.ShouldStop(268435456);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t6.Plazo,0)>0, t6.Plazo,")));
 BA.debugLineNum = 1630;BA.debugLine="sbCP.Append(\"iif(coalesce(t7.Plazo,0)>0, t7.Plaz";
Debug.ShouldStop(536870912);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t7.Plazo,0)>0, t7.Plazo,")));
 BA.debugLineNum = 1631;BA.debugLine="sbCP.Append(\"iif(coalesce(t8.Plazo,0)>0, t8.Plaz";
Debug.ShouldStop(1073741824);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t8.Plazo,0)>0, t8.Plazo,")));
 BA.debugLineNum = 1632;BA.debugLine="sbCP.Append(\"iif(coalesce(t9.Plazo,0)>0, t9.Plaz";
Debug.ShouldStop(-2147483648);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t9.Plazo,0)>0, t9.Plazo,")));
 BA.debugLineNum = 1633;BA.debugLine="sbCP.Append(\"iif(coalesce(t10.Plazo,0)>0,t10.Pla";
Debug.ShouldStop(1);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(t10.Plazo,0)>0,t10.Plazo,")));
 BA.debugLineNum = 1634;BA.debugLine="sbCP.Append(\"iif(coalesce(tGV.PlazoRutaAplicable";
Debug.ShouldStop(2);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("iif(coalesce(tGV.PlazoRutaAplicable,0)>0,tGV.PlazoRutaAplicable,0))))))))))) As PlazoArtLinea, ")));
 BA.debugLineNum = 1636;BA.debugLine="sbCP.Append(\"0 \") ' sumaremos luego los ticks de";
Debug.ShouldStop(8);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("0 ")));
 BA.debugLineNum = 1638;BA.debugLine="sbCP.Append(\"from tblGestionVentasCalculos tGV \"";
Debug.ShouldStop(32);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("from tblGestionVentasCalculos tGV ")));
 BA.debugLineNum = 1641;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(256);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente <>'' and GRP='' and Ruta<>'') t1 on tGV.Articulo=t1.Articulo and tGV.Cliente=t1.Cliente and tGV.RutaAplicable=t1.Ruta ")));
 BA.debugLineNum = 1642;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(512);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente <>'' and GRP='' and Ruta='') t2 using(Articulo, Cliente) ")));
 BA.debugLineNum = 1644;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(2048);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP<>'' and Ruta<>'') t3 on tGV.Articulo=t3.Articulo and tGV.GRP=t3.GRP and tGV.RutaAplicable=t3.Ruta ")));
 BA.debugLineNum = 1645;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(4096);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP<>'' and Ruta='') t4 using(Articulo, GRP) ")));
 BA.debugLineNum = 1647;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(16384);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP='' and Ruta<>'') t5 on tGV.Articulo=t5.Articulo and tGV.RutaAplicable=t5.Ruta ")));
 BA.debugLineNum = 1648;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(32768);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP='' and Ruta='') t6 using(Articulo) ")));
 BA.debugLineNum = 1650;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(131072);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente <>'' and GRP='' and Ruta<>'') t7 on tGV.Cliente=t7.Cliente and tGV.RutaAplicable=t7.Ruta ")));
 BA.debugLineNum = 1651;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(262144);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente <>'' and GRP='' and Ruta='') t8 using(Cliente) ")));
 BA.debugLineNum = 1653;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(1048576);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente ='' and GRP<>'' and Ruta<>'') t9 on tGV.GRP=t9.GRP and tGV.RutaAplicable=t9.Ruta ")));
 BA.debugLineNum = 1654;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
Debug.ShouldStop(2097152);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente ='' and GRP<>'' and Ruta='') t10 using(GRP) ")));
 BA.debugLineNum = 1658;BA.debugLine="sbCP.Append(\"where tGV.Fabricacion=?\")";
Debug.ShouldStop(33554432);
_sbcp.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("where tGV.Fabricacion=?")));
 BA.debugLineNum = 1659;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sbCP.ToStri";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sbcp.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((1))})))));
 BA.debugLineNum = 1662;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(536870912);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1663;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 384;
return;
case 384:
//C
this.state = 189;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1664;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","812976885",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1665;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(1);
if (true) break;

case 189:
//if
this.state = 194;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 191;
}else {
this.state = 193;
}if (true) break;

case 191:
//C
this.state = 194;
 BA.debugLineNum = 1666;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1667;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 385;
return;
case 385:
//C
this.state = 194;
;
 BA.debugLineNum = 1668;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1669;BA.debugLine="Return Accion";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 193:
//C
this.state = 194;
 BA.debugLineNum = 1671;BA.debugLine="Log(\"Success insert into tblConfPlazoFechaEntre";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","812976892",RemoteObject.createImmutable("Success insert into tblConfPlazoFechaEntregaPlanArticulosFabGV"),0);
 if (true) break;

case 194:
//C
this.state = 195;
;
 BA.debugLineNum = 1676;BA.debugLine="Dim TpD As Long=DateTime.TicksPerDay";
Debug.ShouldStop(2048);
_tpd = parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay");Debug.locals.put("TpD", _tpd);Debug.locals.put("TpD", _tpd);
 BA.debugLineNum = 1677;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4096);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1678;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1679;BA.debugLine="sb.Append(\"update tblConfPlazoFechaEntregaPlanAr";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblConfPlazoFechaEntregaPlanArticulosFabGV set FechaDocumentoMasPlazoArtLinea= FechaDocumento+(PlazoArtLinea * ?)")));
 BA.debugLineNum = 1682;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(131072);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_tpd)})))));
 BA.debugLineNum = 1683;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(262144);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1684;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 386;
return;
case 386:
//C
this.state = 195;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1685;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","812976906",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1686;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2097152);
if (true) break;

case 195:
//if
this.state = 200;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 197;
}else {
this.state = 199;
}if (true) break;

case 197:
//C
this.state = 200;
 BA.debugLineNum = 1687;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1688;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 387;
return;
case 387:
//C
this.state = 200;
;
 BA.debugLineNum = 1689;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1690;BA.debugLine="Return Accion";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 199:
//C
this.state = 200;
 BA.debugLineNum = 1692;BA.debugLine="Log(\"Success SQLite update tblConfPlazoFechaEnt";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","812976913",RemoteObject.createImmutable("Success SQLite update tblConfPlazoFechaEntregaPlanArticulosFabGV"),0);
 if (true) break;

case 200:
//C
this.state = 201;
;
 BA.debugLineNum = 1697;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1698;BA.debugLine="sb.Initialize";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1699;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos \")";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos ")));
 BA.debugLineNum = 1700;BA.debugLine="sb.Append(\"set PlazoTeoricoFabLinea = t2.PlazoAr";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("set PlazoTeoricoFabLinea = t2.PlazoArtLinea  ")));
 BA.debugLineNum = 1701;BA.debugLine="sb.append(\"from (select Documento, Linea, PlazoA";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("from (select Documento, Linea, PlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV) as t2 ")));
 BA.debugLineNum = 1702;BA.debugLine="sb.Append(\" where tblGestionVentasCalculos.Docum";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where tblGestionVentasCalculos.Documento=t2.Documento and tblGestionVentasCalculos.Linea=t2.Linea")));
 BA.debugLineNum = 1703;BA.debugLine="sb.Append(\" and tblGestionVentasCalculos.Articul";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" and tblGestionVentasCalculos.ArticuloCorte=?")));
 BA.debugLineNum = 1704;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(128);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("SI"))})))));
 BA.debugLineNum = 1708;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2048);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1709;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1710;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos \")";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos ")));
 BA.debugLineNum = 1711;BA.debugLine="sb.Append(\"set FechaTeoricaFabLinea = t2.FechaDo";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("set FechaTeoricaFabLinea = t2.FechaDocumentoMasPlazoArtLinea  ")));
 BA.debugLineNum = 1712;BA.debugLine="sb.append(\"from (select Documento, Linea, FechaD";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("from (select Documento, Linea, FechaDocumentoMasPlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV) as t2 ")));
 BA.debugLineNum = 1713;BA.debugLine="sb.Append(\" where tblGestionVentasCalculos.Docum";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where tblGestionVentasCalculos.Documento=t2.Documento and tblGestionVentasCalculos.Linea=t2.Linea")));
 BA.debugLineNum = 1714;BA.debugLine="sb.Append(\" and tblGestionVentasCalculos.Articul";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" and tblGestionVentasCalculos.ArticuloCorte=?")));
 BA.debugLineNum = 1715;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(262144);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("SI"))})))));
 BA.debugLineNum = 1717;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(1048576);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1718;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 388;
return;
case 388:
//C
this.state = 201;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1719;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","812976940",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1720;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 201:
//if
this.state = 206;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
 BA.debugLineNum = 1721;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1722;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 389;
return;
case 389:
//C
this.state = 206;
;
 BA.debugLineNum = 1723;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1724;BA.debugLine="Return Accion";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 205:
//C
this.state = 206;
 BA.debugLineNum = 1726;BA.debugLine="Log(\"Success SQLite update FechaPlazoRutaAplica";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","812976947",RemoteObject.createImmutable("Success SQLite update FechaPlazoRutaAplicable"),0);
 if (true) break;

case 206:
//C
this.state = 207;
;
 BA.debugLineNum = 1730;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1731;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1732;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos \")";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos ")));
 BA.debugLineNum = 1733;BA.debugLine="sb.Append(\"set FechaTeoricaEntrega= iif(FechaMat";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("set FechaTeoricaEntrega= iif(FechaMaterial>0 and ArticuloCorte=?, FechaMaterial, FechaTeoricaFabLinea)")));
 BA.debugLineNum = 1734;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(32);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("SI"))})))));
 BA.debugLineNum = 1736;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(128);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1737;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 390;
return;
case 390:
//C
this.state = 207;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1738;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","812976959",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1739;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(1024);
if (true) break;

case 207:
//if
this.state = 212;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 209;
}else {
this.state = 211;
}if (true) break;

case 209:
//C
this.state = 212;
 BA.debugLineNum = 1740;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1741;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 391;
return;
case 391:
//C
this.state = 212;
;
 BA.debugLineNum = 1742;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1743;BA.debugLine="Return Accion";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 211:
//C
this.state = 212;
 BA.debugLineNum = 1745;BA.debugLine="Log(\"Success SQLite update FechaTeoricaEntrega\"";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","812976966",RemoteObject.createImmutable("Success SQLite update FechaTeoricaEntrega"),0);
 if (true) break;

case 212:
//C
this.state = 213;
;
 BA.debugLineNum = 1750;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblS";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblStockDisponibleAcumuladoArticuloTallaFecha")));
 BA.debugLineNum = 1751;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4194304);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1752;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1753;BA.debugLine="sb.Append(\"insert into tblStockDisponibleAcumula";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblStockDisponibleAcumuladoArticuloTallaFecha (Articulo, Talla, Fecha, QtyDisponible, QtyDisponibleAcumulada, sFecha) ")));
 BA.debugLineNum = 1754;BA.debugLine="sb.Append(\"Select Articulo, Talla, Fecha,QtyDisp";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select Articulo, Talla, Fecha,QtyDisponible,")));
 BA.debugLineNum = 1755;BA.debugLine="sb.Append(\"(Select sum(tS1.QtyDisponible) from t";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select sum(tS1.QtyDisponible) from tblStockDisponibleArticuloTallaFecha tS1 ")));
 BA.debugLineNum = 1756;BA.debugLine="sb.Append(\"where tS1.Articulo=tS.Articulo And tS";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("where tS1.Articulo=tS.Articulo And tS1.Talla=tS.Talla And tS1.Fecha<=tS.Fecha group by tS1.Articulo, tS1.Talla) QtyDisponibleAcumulada, ")));
 BA.debugLineNum = 1757;BA.debugLine="sb.Append(\"sFecha \")";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFecha ")));
 BA.debugLineNum = 1758;BA.debugLine="sb.Append(\"from tblStockDisponibleArticuloTallaF";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("from tblStockDisponibleArticuloTallaFecha tS ORDER BY Articulo, Talla, Fecha")));
 BA.debugLineNum = 1759;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1760;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(-2147483648);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1761;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 392;
return;
case 392:
//C
this.state = 213;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1762;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","812976983",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1763;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(4);
if (true) break;

case 213:
//if
this.state = 218;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 215;
}else {
this.state = 217;
}if (true) break;

case 215:
//C
this.state = 218;
 BA.debugLineNum = 1764;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1765;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 393;
return;
case 393:
//C
this.state = 218;
;
 BA.debugLineNum = 1766;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(32);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1767;BA.debugLine="Return Accion";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 217:
//C
this.state = 218;
 BA.debugLineNum = 1769;BA.debugLine="Log(\"Success SQLite delete from tblStockDisponi";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","812976990",RemoteObject.createImmutable("Success SQLite delete from tblStockDisponibleAcumuladoArticuloTallaFecha"),0);
 if (true) break;

case 218:
//C
this.state = 219;
;
 BA.debugLineNum = 1774;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8192);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1775;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1777;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=")));
 BA.debugLineNum = 1778;BA.debugLine="sb.Append(\"ifnull((Select Fecha from tblStockDis";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ifnull((Select Fecha from tblStockDisponibleAcumuladoArticuloTallaFecha As t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla ")));
 BA.debugLineNum = 1779;BA.debugLine="sb.Append(\"And t2.QtyDisponibleAcumulada>=t1.Qty";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("And t2.QtyDisponibleAcumulada>=t1.QtyPteNetaAcum and AlmOrigenGV=1 limit 1),0)")));
 BA.debugLineNum = 1780;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(524288);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1781;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(1048576);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1782;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 394;
return;
case 394:
//C
this.state = 219;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1783;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","812977004",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1784;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 219:
//if
this.state = 224;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 221;
}else {
this.state = 223;
}if (true) break;

case 221:
//C
this.state = 224;
 BA.debugLineNum = 1785;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1786;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 395;
return;
case 395:
//C
this.state = 224;
;
 BA.debugLineNum = 1787;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1788;BA.debugLine="Return Accion";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 223:
//C
this.state = 224;
 BA.debugLineNum = 1790;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","812977011",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos"),0);
 if (true) break;

case 224:
//C
this.state = 225;
;
 BA.debugLineNum = 1799;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(64);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1800;BA.debugLine="sb.Initialize";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1801;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=")));
 BA.debugLineNum = 1803;BA.debugLine="sb.append(\"(Select FechaDocumentoMasPlazoArtLine";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select FechaDocumentoMasPlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV t2")));
 BA.debugLineNum = 1804;BA.debugLine="sb.Append(\" where t1.Documento=t2.Documento and";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where t1.Documento=t2.Documento and t1.Linea=t2.Linea)")));
 BA.debugLineNum = 1806;BA.debugLine="sb.Append(\" where t1.Fabricacion=? and t1.QtyDis";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where t1.Fabricacion=? and t1.QtyDisponibleAcum<?")));
 BA.debugLineNum = 1808;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(32768);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((1)),RemoteObject.createImmutable((0))})))));
 BA.debugLineNum = 1809;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(65536);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1810;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 396;
return;
case 396:
//C
this.state = 225;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1811;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","812977032",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1812;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(524288);
if (true) break;

case 225:
//if
this.state = 230;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 227;
}else {
this.state = 229;
}if (true) break;

case 227:
//C
this.state = 230;
 BA.debugLineNum = 1813;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1814;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 397;
return;
case 397:
//C
this.state = 230;
;
 BA.debugLineNum = 1815;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1816;BA.debugLine="Return Accion";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 229:
//C
this.state = 230;
 BA.debugLineNum = 1818;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","812977039",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos"),0);
 if (true) break;

case 230:
//C
this.state = 231;
;
 BA.debugLineNum = 1823;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(1073741824);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1824;BA.debugLine="sb.Initialize";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1825;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=FechaMaterial")));
 BA.debugLineNum = 1826;BA.debugLine="sb.Append(\" where FechaMaterial>0 and ArticuloCo";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where FechaMaterial>0 and ArticuloCorte=?")));
 BA.debugLineNum = 1827;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(4);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("SI"))})))));
 BA.debugLineNum = 1828;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(8);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1829;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 398;
return;
case 398:
//C
this.state = 231;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1830;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","812977051",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1831;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(64);
if (true) break;

case 231:
//if
this.state = 236;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 233;
}else {
this.state = 235;
}if (true) break;

case 233:
//C
this.state = 236;
 BA.debugLineNum = 1832;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1833;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 399;
return;
case 399:
//C
this.state = 236;
;
 BA.debugLineNum = 1834;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1835;BA.debugLine="Return Accion";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 235:
//C
this.state = 236;
 BA.debugLineNum = 1837;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","812977058",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos"),0);
 if (true) break;

case 236:
//C
this.state = 237;
;
 BA.debugLineNum = 1842;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(131072);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1843;BA.debugLine="sb.Initialize";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1844;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=FechaPlanificada")));
 BA.debugLineNum = 1845;BA.debugLine="sb.Append(\" where FechaPlanificada>0 and Articul";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where FechaPlanificada>0 and ArticuloCorte=?")));
 BA.debugLineNum = 1846;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("SI"))})))));
 BA.debugLineNum = 1847;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(4194304);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1848;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 400;
return;
case 400:
//C
this.state = 237;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1849;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","812977070",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1850;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(33554432);
if (true) break;

case 237:
//if
this.state = 242;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 239;
}else {
this.state = 241;
}if (true) break;

case 239:
//C
this.state = 242;
 BA.debugLineNum = 1851;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(67108864);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1852;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 401;
return;
case 401:
//C
this.state = 242;
;
 BA.debugLineNum = 1853;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1854;BA.debugLine="Return Accion";
Debug.ShouldStop(536870912);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 241:
//C
this.state = 242;
 BA.debugLineNum = 1856;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","812977077",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos"),0);
 if (true) break;

case 242:
//C
this.state = 243;
;
 BA.debugLineNum = 1883;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(67108864);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1884;BA.debugLine="sb.Initialize";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1885;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos set FechaDisponibilidad=FechaDisponibilidad + ? where Personalizado=? and FechaDisponibilidad>0")));
 BA.debugLineNum = 1886;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10),parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "*",0, 2))),RemoteObject.createImmutable((1))})))));
 BA.debugLineNum = 1887;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(1073741824);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1888;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 402;
return;
case 402:
//C
this.state = 243;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1889;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","812977110",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1890;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2);
if (true) break;

case 243:
//if
this.state = 248;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 245;
}else {
this.state = 247;
}if (true) break;

case 245:
//C
this.state = 248;
 BA.debugLineNum = 1891;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1892;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 403;
return;
case 403:
//C
this.state = 248;
;
 BA.debugLineNum = 1893;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1894;BA.debugLine="Return Accion";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 247:
//C
this.state = 248;
 BA.debugLineNum = 1896;BA.debugLine="Log(\"Success SQLite update FechaDisponibilidad\"";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","812977117",RemoteObject.createImmutable("Success SQLite update FechaDisponibilidad"),0);
 if (true) break;

case 248:
//C
this.state = 249;
;
 BA.debugLineNum = 1901;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4096);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1902;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1903;BA.debugLine="sb.Append(\"insert into tblStockDisponibleArticul";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV select AlmDest, Articulo, Talla, FechaDisponibilidad+? as Fecha, sum(QtyPte) as QtyDisponible, DATE(ROUND(FechaDisponibilidad+?/ 1000), 'unixepoch') as sFecha")));
 BA.debugLineNum = 1904;BA.debugLine="sb.Append(\" from tblGestionVentasCalculos\")";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" from tblGestionVentasCalculos")));
 BA.debugLineNum = 1905;BA.debugLine="sb.Append(\" where AlmDest<>? and FechaDisponibil";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmDest<>? and FechaDisponibilidad>0")));
 BA.debugLineNum = 1906;BA.debugLine="sb.Append(\" group by AlmDest,Articulo, Talla, Fe";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" group by AlmDest,Articulo, Talla, Fecha, sFecha")));
 BA.debugLineNum = 1907;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(262144);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")),(parent.__c.getField(false,"DateTime").getField(true,"TicksPerDay")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 1908;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(524288);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1909;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 404;
return;
case 404:
//C
this.state = 249;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1910;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","812977131",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1911;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(4194304);
if (true) break;

case 249:
//if
this.state = 254;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 251;
}else {
this.state = 253;
}if (true) break;

case 251:
//C
this.state = 254;
 BA.debugLineNum = 1912;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1913;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 405;
return;
case 405:
//C
this.state = 254;
;
 BA.debugLineNum = 1914;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(33554432);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1915;BA.debugLine="Return Accion";
Debug.ShouldStop(67108864);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 253:
//C
this.state = 254;
 BA.debugLineNum = 1918;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","812977139",RemoteObject.createImmutable("Success SQLite insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV datos documentos alm destino<>'' , con fechadisponbilidad>0"),0);
 if (true) break;

case 254:
//C
this.state = 255;
;
 BA.debugLineNum = 1922;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblS";
Debug.ShouldStop(2);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV")));
 BA.debugLineNum = 1923;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1924;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1925;BA.debugLine="sb.Append(\"insert into tblStockDisponibleAcumula";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV (Almacen, Articulo, Talla, Fecha, QtyDisponible, QtyDisponibleAcumulada, sFecha) ")));
 BA.debugLineNum = 1926;BA.debugLine="sb.Append(\"Select Almacen, Articulo, Talla, Fech";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select Almacen, Articulo, Talla, Fecha,QtyDisponible,")));
 BA.debugLineNum = 1927;BA.debugLine="sb.Append(\"(Select sum(tS1.QtyDisponible) from t";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Select sum(tS1.QtyDisponible) from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV tS1 ")));
 BA.debugLineNum = 1928;BA.debugLine="sb.Append(\"where tS1.Almacen=tS.Almacen and tS1.";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("where tS1.Almacen=tS.Almacen and tS1.Articulo=tS.Articulo And tS1.Talla=tS.Talla And tS1.Fecha<=tS.Fecha group by tS1.Almacen, tS1.Articulo, tS1.Talla) QtyDisponibleAcumulada, ")));
 BA.debugLineNum = 1929;BA.debugLine="sb.Append(\"sFecha \")";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFecha ")));
 BA.debugLineNum = 1930;BA.debugLine="sb.Append(\"from tblStockDisponibleArticuloTallaF";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV tS ORDER BY Almacen, Articulo, Talla, Fecha")));
 BA.debugLineNum = 1931;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(1024);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1932;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(2048);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1933;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 406;
return;
case 406:
//C
this.state = 255;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1934;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","812977155",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1935;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(16384);
if (true) break;

case 255:
//if
this.state = 260;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 257;
}else {
this.state = 259;
}if (true) break;

case 257:
//C
this.state = 260;
 BA.debugLineNum = 1936;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1937;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 407;
return;
case 407:
//C
this.state = 260;
;
 BA.debugLineNum = 1938;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(131072);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1939;BA.debugLine="Return Accion";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 259:
//C
this.state = 260;
 BA.debugLineNum = 1941;BA.debugLine="Log(\"Success SQLite delete from tblStockDisponi";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","812977162",RemoteObject.createImmutable("Success SQLite delete from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV"),0);
 if (true) break;

case 260:
//C
this.state = 261;
;
 BA.debugLineNum = 1946;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(33554432);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1947;BA.debugLine="sb.Initialize";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1949;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=")));
 BA.debugLineNum = 1950;BA.debugLine="sb.Append(\"ifnull((Select Fecha from tblStockDis";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ifnull((Select Fecha from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV As t2 where t1.AlmOrigen=t2.Almacen and t1.Articulo=t2.Articulo And t1.Talla=t2.Talla ")));
 BA.debugLineNum = 1951;BA.debugLine="sb.Append(\"And t2.QtyDisponibleAcumulada>=t1.Qty";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("And t2.QtyDisponibleAcumulada>=t1.QtyPteNetaAcum and AlmOrigenGV=0 limit 1),0)")));
 BA.debugLineNum = 1952;BA.debugLine="sb.Append(\" where AlmOrigenGV=0\")";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where AlmOrigenGV=0")));
 BA.debugLineNum = 1953;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(1);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1954;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(2);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1955;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 408;
return;
case 408:
//C
this.state = 261;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1956;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","812977177",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1957;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(16);
if (true) break;

case 261:
//if
this.state = 266;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 263;
}else {
this.state = 265;
}if (true) break;

case 263:
//C
this.state = 266;
 BA.debugLineNum = 1958;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1959;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 409;
return;
case 409:
//C
this.state = 266;
;
 BA.debugLineNum = 1960;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1961;BA.debugLine="Return Accion";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 265:
//C
this.state = 266;
 BA.debugLineNum = 1963;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","812977184",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos"),0);
 if (true) break;

case 266:
//C
this.state = 267;
;
 BA.debugLineNum = 1968;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32768);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1969;BA.debugLine="sb.Initialize";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1970;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaDisponibilidadVencida=iif(FechaDisponibilidad<?,'SI','NO') ")));
 BA.debugLineNum = 1971;BA.debugLine="sb.Append(\" where FechaDisponibilidad>0\")";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where FechaDisponibilidad>0")));
 BA.debugLineNum = 1972;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(524288);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fechahoy)})))));
 BA.debugLineNum = 1973;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(1048576);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1974;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 410;
return;
case 410:
//C
this.state = 267;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1975;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","812977196",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1976;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8388608);
if (true) break;

case 267:
//if
this.state = 272;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 269;
}else {
this.state = 271;
}if (true) break;

case 269:
//C
this.state = 272;
 BA.debugLineNum = 1977;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1978;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 411;
return;
case 411:
//C
this.state = 272;
;
 BA.debugLineNum = 1979;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 1980;BA.debugLine="Return Accion";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 271:
//C
this.state = 272;
 BA.debugLineNum = 1982;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","812977203",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos FechaDisponibilidadVencida"),0);
 if (true) break;

case 272:
//C
this.state = 273;
;
 BA.debugLineNum = 1988;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1989;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1991;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos set FechaPrevVentasLinea=FechaDisponibilidad where PedidoAbierto=0 and FechaDisponibilidad>0 and FechaDisponibilidad>=FechaRequerida")));
 BA.debugLineNum = 1992;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(128);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 1993;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(256);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1994;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 412;
return;
case 412:
//C
this.state = 273;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1995;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","812977216",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 1996;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(2048);
if (true) break;

case 273:
//if
this.state = 278;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 275;
}else {
this.state = 277;
}if (true) break;

case 275:
//C
this.state = 278;
 BA.debugLineNum = 1997;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1998;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 413;
return;
case 413:
//C
this.state = 278;
;
 BA.debugLineNum = 1999;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16384);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2000;BA.debugLine="Return Accion";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 277:
//C
this.state = 278;
 BA.debugLineNum = 2002;BA.debugLine="Log(\"Success SQLite update FechaPrevVentasLinea";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","812977223",RemoteObject.createImmutable("Success SQLite update FechaPrevVentasLinea"),0);
 if (true) break;

case 278:
//C
this.state = 279;
;
 BA.debugLineNum = 2007;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4194304);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2008;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2009;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos set FechaPrevVentasLinea=FechaRequerida where PedidoAbierto=0 and FechaRequerida>0 and FechaDisponibilidad>0 and FechaRequerida>FechaDisponibilidad")));
 BA.debugLineNum = 2010;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 2011;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(67108864);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 2012;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 414;
return;
case 414:
//C
this.state = 279;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2013;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","812977234",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 2014;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 279:
//if
this.state = 284;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 281;
}else {
this.state = 283;
}if (true) break;

case 281:
//C
this.state = 284;
 BA.debugLineNum = 2015;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2016;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 415;
return;
case 415:
//C
this.state = 284;
;
 BA.debugLineNum = 2017;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2018;BA.debugLine="Return Accion";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 283:
//C
this.state = 284;
 BA.debugLineNum = 2020;BA.debugLine="Log(\"Success SQLite update FechaPrevVentasLinea";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","812977241",RemoteObject.createImmutable("Success SQLite update FechaPrevVentasLinea"),0);
 if (true) break;

case 284:
//C
this.state = 285;
;
 BA.debugLineNum = 2025;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(256);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2026;BA.debugLine="sb.Initialize";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2027;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaPrevVentasLineaVencida=iif(FechaPrevVentasLinea<?,'SI','NO') ")));
 BA.debugLineNum = 2028;BA.debugLine="sb.Append(\" where FechaPrevVentasLinea>0\")";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where FechaPrevVentasLinea>0")));
 BA.debugLineNum = 2029;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(4096);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fechahoy)})))));
 BA.debugLineNum = 2030;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(8192);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 2031;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 416;
return;
case 416:
//C
this.state = 285;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2032;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","812977253",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 2033;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(65536);
if (true) break;

case 285:
//if
this.state = 290;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 287;
}else {
this.state = 289;
}if (true) break;

case 287:
//C
this.state = 290;
 BA.debugLineNum = 2034;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2035;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 417;
return;
case 417:
//C
this.state = 290;
;
 BA.debugLineNum = 2036;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(524288);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2037;BA.debugLine="Return Accion";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 289:
//C
this.state = 290;
 BA.debugLineNum = 2039;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","812977260",RemoteObject.createImmutable("Success SQLite update tblGestionVentasCalculos FechaPrevVentasLineaVencida"),0);
 if (true) break;

case 290:
//C
this.state = 291;
;
 BA.debugLineNum = 2043;BA.debugLine="Dim rs As ResultSet=mSQLGestionventas.ExecQuery(";
Debug.ShouldStop(67108864);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select distinct Documento from tblGestionVentasCalculos")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2044;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(134217728);
if (true) break;

case 291:
//do while
this.state = 298;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 293;
if (true) break;
}
if (true) break;

case 293:
//C
this.state = 294;
 BA.debugLineNum = 2045;BA.debugLine="Dim Doc As String=rs.GetString(\"Documento\")";
Debug.ShouldStop(268435456);
_doc = _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Documento")));Debug.locals.put("Doc", _doc);Debug.locals.put("Doc", _doc);
 BA.debugLineNum = 2046;BA.debugLine="Dim NumLinDocSinFechaCalcPrevVentas As Int=jamT";
Debug.ShouldStop(536870912);
_numlindocsinfechacalcprevventas = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblGestionVentasCalculos where Documento=? and FechaPrevVentasLinea<?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {_doc,BA.NumberToString(_fechahoy)}))))))));Debug.locals.put("NumLinDocSinFechaCalcPrevVentas", _numlindocsinfechacalcprevventas);Debug.locals.put("NumLinDocSinFechaCalcPrevVentas", _numlindocsinfechacalcprevventas);
 BA.debugLineNum = 2048;BA.debugLine="If NumLinDocSinFechaCalcPrevVentas=0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 294:
//if
this.state = 297;
if (RemoteObject.solveBoolean("=",_numlindocsinfechacalcprevventas,BA.numberCast(double.class, 0))) { 
this.state = 296;
}if (true) break;

case 296:
//C
this.state = 297;
 BA.debugLineNum = 2049;BA.debugLine="Dim MaxFechaCalcPrevVentasDoc As Long=mSQLGest";
Debug.ShouldStop(1);
_maxfechacalcprevventasdoc = BA.numberCast(long.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select max(FechaPrevVentasLinea) from tblGestionVentasCalculos where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_doc}))))));Debug.locals.put("MaxFechaCalcPrevVentasDoc", _maxfechacalcprevventasdoc);Debug.locals.put("MaxFechaCalcPrevVentasDoc", _maxfechacalcprevventasdoc);
 BA.debugLineNum = 2051;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"update t";
Debug.ShouldStop(4);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblGestionVentasCalculos set FechaPrevVentasDocumento=? where Documento=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_maxfechacalcprevventasdoc),(_doc)})))));
 if (true) break;

case 297:
//C
this.state = 291;
;
 if (true) break;

case 298:
//C
this.state = 299;
;
 BA.debugLineNum = 2054;BA.debugLine="rs.Close";
Debug.ShouldStop(32);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 2055;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(64);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 2056;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 418;
return;
case 418:
//C
this.state = 299;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2057;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","812977278",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 2061;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"update tbl";
Debug.ShouldStop(4096);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("update tblGestionVentasCalculos set FechaPrevVentasDocumento=FechaPrevVentasLinea where FechaPrevVentasLinea>? and FechaRequerida>0")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_fechahoy)})))));
 BA.debugLineNum = 2062;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(8192);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 2063;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 419;
return;
case 419:
//C
this.state = 299;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2064;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","812977285",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 2069;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(1048576);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 2070;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(2097152);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 2071;BA.debugLine="Log(DateTime.DateParse(\"01/01/2000\"))";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","812977292",BA.NumberToString(parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("01/01/2000")))),0);
 BA.debugLineNum = 2072;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8388608);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2073;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2074;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("update tblGestionVentasCalculos set FechaCalculoActualCliente=0 where FechaCalculoActualCliente<"),parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("01/02/2000"))))));
 BA.debugLineNum = 2075;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 2076;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 2077;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(268435456);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 2078;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 420;
return;
case 420:
//C
this.state = 299;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2079;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","812977300",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 2080;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 299:
//if
this.state = 304;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 301;
}else {
this.state = 303;
}if (true) break;

case 301:
//C
this.state = 304;
 BA.debugLineNum = 2081;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2082;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 421;
return;
case 421:
//C
this.state = 304;
;
 BA.debugLineNum = 2083;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2084;BA.debugLine="Return Accion";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 303:
//C
this.state = 304;
 BA.debugLineNum = 2086;BA.debugLine="Log(\"Success SQLite update FechaCalculoActualCl";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","812977307",RemoteObject.createImmutable("Success SQLite update FechaCalculoActualCliente=01/01/2000"),0);
 if (true) break;

case 304:
//C
this.state = 313;
;
 if (true) break;

case 306:
//C
this.state = 307;
 BA.debugLineNum = 2109;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(268435456);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2110;BA.debugLine="sb.Initialize";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2111;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=0, FechaDisponibilidadVencida='', FechaPrevVentasLinea=0, FechaPrevVentasdocumento=0")));
 BA.debugLineNum = 2112;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 2113;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
Debug.ShouldStop(1);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 2114;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 422;
return;
case 422:
//C
this.state = 307;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2115;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","812977336",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 2116;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(8);
if (true) break;

case 307:
//if
this.state = 312;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 309;
}else {
this.state = 311;
}if (true) break;

case 309:
//C
this.state = 312;
 BA.debugLineNum = 2117;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2118;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 423;
return;
case 423:
//C
this.state = 312;
;
 BA.debugLineNum = 2119;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2120;BA.debugLine="Return Accion";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 311:
//C
this.state = 312;
 BA.debugLineNum = 2122;BA.debugLine="Log(\"Success SQLite update FechaDisponibilidad=";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","812977343",RemoteObject.createImmutable("Success SQLite update FechaDisponibilidad=0"),0);
 if (true) break;

case 312:
//C
this.state = 313;
;
 if (true) break;

case 313:
//C
this.state = 314;
;
 BA.debugLineNum = 2147;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2148;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2149;BA.debugLine="sb.Append(\"insert into tblGestionVentas (\")";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("insert into tblGestionVentas (")));
 BA.debugLineNum = 2150;BA.debugLine="sb.Append(\"IDPrioridad, IDPrioridadUsuario, Codig";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDPrioridad, IDPrioridadUsuario, CodigoResponsableCuenta,NombreResponsableCuenta, CodigoVendedor, NombreVendedor,")));
 BA.debugLineNum = 2151;BA.debugLine="sb.Append(\"Documento,FechaDocumento, FechaPrometi";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento,FechaDocumento, FechaPrometida, Cliente, NombreCliente, GRP, NombreGRP, DirEnv, CiudadDirEnvio, PedidoCliente, Stand_By,")));
 BA.debugLineNum = 2152;BA.debugLine="sb.Append(\"PedidoBloqueado, PedidoAbierto, Linea,";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoBloqueado, PedidoAbierto, Linea, AlmOrigen, AlmOrigenGV, AlmDest, Personalizado, Fabricacion, CompraFab, Dual, Ruta, PlazoRuta, RutaDual, PlazoRutaDual, ArticuloCorte,FechaMaterial, FechaPlanificada, FechaRequerida, ")));
 BA.debugLineNum = 2153;BA.debugLine="sb.Append(\"Ruta, Articulo, DescripcionArticulo, T";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Ruta, Articulo, DescripcionArticulo, Talla,")));
 BA.debugLineNum = 2154;BA.debugLine="sb.Append(\"QtyPte, Reserva, StockLibre, StockAlmN";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPte, Reserva, StockLibre, StockAlmNoGV, QtyPteNeta,QtyPteNetaAcum, QtyDisponibleAcum, Status, ReservaAlmacen, ImportePendiente, FechaDisponibilidad, FechaDisponibilidadVencida, FechaCalculoActualCliente, ")));
 BA.debugLineNum = 2155;BA.debugLine="sb.Append(\"RutaAplicable, PlazoRutaAplicable,\")";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaAplicable, PlazoRutaAplicable,")));
 BA.debugLineNum = 2156;BA.debugLine="sb.Append(\"PlazoTeoricoFabLinea, FechaTeoricaFabL";
Debug.ShouldStop(2048);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoTeoricoFabLinea, FechaTeoricaFabLinea, FechaTeoricaEntrega,")));
 BA.debugLineNum = 2157;BA.debugLine="sb.Append(\"FechaPrevVentasLinea,FechaPrevVentasLi";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasLinea,FechaPrevVentasLineaVencida, FechaPrevVentasDocumento) ")));
 BA.debugLineNum = 2158;BA.debugLine="sb.Append(\"Select \")";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Select ")));
 BA.debugLineNum = 2159;BA.debugLine="sb.Append(\"IDPrioridad, IDPrioridadUsuario, Codig";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDPrioridad, IDPrioridadUsuario, CodigoResponsableCuenta,NombreResponsableCuenta, CodigoVendedor, NombreVendedor,")));
 BA.debugLineNum = 2160;BA.debugLine="sb.Append(\"Documento,FechaDocumento, FechaPrometi";
Debug.ShouldStop(32768);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento,FechaDocumento, FechaPrometida, Cliente, NombreCliente, GRP, NombreGRP, DirEnv, CiudadDirEnvio, PedidoCliente, Stand_By,")));
 BA.debugLineNum = 2161;BA.debugLine="sb.Append(\"PedidoBloqueado, PedidoAbierto, Linea,";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoBloqueado, PedidoAbierto, Linea, AlmOrigen, AlmOrigenGV, AlmDest, Personalizado, Fabricacion, CompraFab, Dual, Ruta, PlazoRuta, RutaDual, PlazoRutaDual, ArticuloCorte,FechaMaterial, FechaPlanificada, FechaRequerida,")));
 BA.debugLineNum = 2162;BA.debugLine="sb.Append(\"Ruta, Articulo, DescripcionArticulo, T";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Ruta, Articulo, DescripcionArticulo, Talla,")));
 BA.debugLineNum = 2163;BA.debugLine="sb.Append(\"QtyPte, Reserva, StockLibre, StockAlmN";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPte, Reserva, StockLibre, StockAlmNoGV, QtyPteNeta,QtyPteNetaAcum, QtyDisponibleAcum, Status, ReservaAlmacen, ImportePendiente, FechaDisponibilidad, FechaDisponibilidadVencida, FechaCalculoActualCliente, ")));
 BA.debugLineNum = 2164;BA.debugLine="sb.Append(\"RutaAplicable, PlazoRutaAplicable,\")";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaAplicable, PlazoRutaAplicable,")));
 BA.debugLineNum = 2165;BA.debugLine="sb.Append(\"PlazoTeoricoFabLinea, FechaTeoricaFabL";
Debug.ShouldStop(1048576);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoTeoricoFabLinea, FechaTeoricaFabLinea,FechaTeoricaEntrega,")));
 BA.debugLineNum = 2166;BA.debugLine="sb.Append(\"FechaPrevVentasLinea, FechaPrevVentasL";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasLinea, FechaPrevVentasLineaVencida,FechaPrevVentasDocumento ")));
 BA.debugLineNum = 2167;BA.debugLine="sb.Append(\"from tblGestionVentasCalculos\")";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("from tblGestionVentasCalculos")));
 BA.debugLineNum = 2170;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 2171;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
Debug.ShouldStop(67108864);
_senderfilter = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 2172;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 424;
return;
case 424:
//C
this.state = 314;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2173;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","812977394",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 2174;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 314:
//if
this.state = 319;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 316;
}else {
this.state = 318;
}if (true) break;

case 316:
//C
this.state = 319;
 BA.debugLineNum = 2175;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SQLite "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2176;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 425;
return;
case 425:
//C
this.state = 319;
;
 BA.debugLineNum = 2177;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2178;BA.debugLine="Return Accion";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 if (true) break;

case 318:
//C
this.state = 319;
 BA.debugLineNum = 2180;BA.debugLine="Log(\"Success SQLite update tblGestionVentas\")";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","812977401",RemoteObject.createImmutable("Success SQLite update tblGestionVentas"),0);
 if (true) break;

case 319:
//C
this.state = -1;
;
 BA.debugLineNum = 2183;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2184;BA.debugLine="Return Accion";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_accion));return;};
 BA.debugLineNum = 2185;BA.debugLine="End Sub";
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
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _datosgestionventas_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstreggv) throws Exception{
}
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _fechasprometidascompras_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstregfp) throws Exception{
}
public static void  _pedidoscomprasrecibidosptesrecepcionar_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstregpcrec) throws Exception{
}
public static void  _osubspendientesterminaproductonocortenoconfeccion_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstregosubrec) throws Exception{
}
public static void  _confplazofechaentregaplan_completed(RemoteObject __ref,RemoteObject _accion,RemoteObject _lstregconfpl) throws Exception{
}
public static RemoteObject  _borrarvbsscriptdireccionremitenteemailoutlookrepsol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarVBSScriptDireccionRemitenteEmailOutlookREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3681);
if (RapidSub.canDelegate("borrarvbsscriptdireccionremitenteemailoutlookrepsol")) { return __ref.runUserSub(false, "cgestionventas","borrarvbsscriptdireccionremitenteemailoutlookrepsol", __ref);}
 BA.debugLineNum = 3681;BA.debugLine="Sub BorrarVBSScriptDireccionRemitenteEmailOutlookR";
Debug.ShouldStop(1);
 BA.debugLineNum = 3682;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc.vbs\")";
Debug.ShouldStop(2);
if (cgestionventas.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc.vbs"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3683;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc.vbs\")";
Debug.ShouldStop(4);
cgestionventas.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc.vbs")));
 };
 BA.debugLineNum = 3685;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _borrarvbsscriptenvioemailoutlookrepsol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BorrarVBSScriptEnvioEmailOutlookREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3947);
if (RapidSub.canDelegate("borrarvbsscriptenvioemailoutlookrepsol")) { return __ref.runUserSub(false, "cgestionventas","borrarvbsscriptenvioemailoutlookrepsol", __ref);}
 BA.debugLineNum = 3947;BA.debugLine="Sub BorrarVBSScriptEnvioEmailOutlookREPSOL";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3948;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc2.vbs\")";
Debug.ShouldStop(2048);
if (cgestionventas.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc2.vbs"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3949;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc2.vbs\")";
Debug.ShouldStop(4096);
cgestionventas.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.createImmutable("smfpromc2.vbs")));
 };
 BA.debugLineNum = 3951;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("btnSalir_Click (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cgestionventas","btnsalir_click", __ref);}
 BA.debugLineNum = 317;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 318;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookREPS";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptdireccionremitenteemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 319;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptenvioemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 320;BA.debugLine="jamTableViewGestionVentas.GuardarConfiguracionCol";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 323;BA.debugLine="jamTableViewGestionVentas.LimpiarTabla";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 324;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(8);
cgestionventas._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 325;BA.debugLine="frm.Close";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("CargaRepsolConfiguracionLogisticaAlbaranesVenta (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3265);
if (RapidSub.canDelegate("cargarepsolconfiguracionlogisticaalbaranesventa")) { return __ref.runUserSub(false, "cgestionventas","cargarepsolconfiguracionlogisticaalbaranesventa", __ref);}
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
public ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
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
		Debug.PushSubsStack("CargaRepsolConfiguracionLogisticaAlbaranesVenta (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3265);
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
 BA.debugLineNum = 3267;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3268;BA.debugLine="Dim mDataConf As Map";
Debug.ShouldStop(8);
_mdataconf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataConf", _mdataconf);
 BA.debugLineNum = 3269;BA.debugLine="mDataConf.Initialize";
Debug.ShouldStop(16);
_mdataconf.runVoidMethod ("Initialize");
 BA.debugLineNum = 3270;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(32);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 3271;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 3272;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 3273;BA.debugLine="mRes.Put(\"mDataConf\",mDataConf)";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mDataConf"))),(Object)((_mdataconf.getObject())));
 BA.debugLineNum = 3274;BA.debugLine="Dim Comando As String=\"RepsolConfiguracionLogisti";
Debug.ShouldStop(512);
_comando = BA.ObjectToString("RepsolConfiguracionLogisticaAlbaranesVenta");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 3275;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(1024);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 3277;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "cargarepsolconfiguracionlogisticaalbaranesventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 3279;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 3280;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3281;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3282;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 3283;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3284;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3287;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 3288;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3289;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.createImmutable("No existe la configuración necesaria para la conexión."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3290;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 3291;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3292;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3294;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(536870912);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3295;BA.debugLine="mDataConf=lstReg.Get(0)";
Debug.ShouldStop(1073741824);
_mdataconf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mDataConf", _mdataconf);
 BA.debugLineNum = 3296;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3297;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 3298;BA.debugLine="mRes.Put(\"mDataConf\", mDataConf)";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 3302;BA.debugLine="Return mRes";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 3303;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _cargarepsolinformacionlogisticaalbaranventa(RemoteObject __ref,RemoteObject _albarannav) throws Exception{
try {
		Debug.PushSubsStack("CargaRepsolInformacionLogisticaAlbaranVenta (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3307);
if (RapidSub.canDelegate("cargarepsolinformacionlogisticaalbaranventa")) { return __ref.runUserSub(false, "cgestionventas","cargarepsolinformacionlogisticaalbaranventa", __ref, _albarannav);}
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
public ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _albarannav) {
this.parent = parent;
this.__ref = __ref;
this._albarannav = _albarannav;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
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
		Debug.PushSubsStack("CargaRepsolInformacionLogisticaAlbaranVenta (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3307);
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
 BA.debugLineNum = 3308;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2048);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3309;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(4096);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3310;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(8192);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 3311;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(16384);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 3312;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(32768);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 3313;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 3314;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 3315;BA.debugLine="Dim Comando As String=\"RepsolInformacionLogistica";
Debug.ShouldStop(262144);
_comando = BA.ObjectToString("RepsolInformacionLogisticaAlbaranVenta");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 3316;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(524288);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_albarannav)})),(Object)(__ref));
 BA.debugLineNum = 3318;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "cargarepsolinformacionlogisticaalbaranventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 3319;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 3320;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3321;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3322;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 3323;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3324;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3326;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 3327;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3328;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe e";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No existe el documento "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_albarannav))),RemoteObject.createImmutable(" en navision, o no tiene lineas no corregidas de tipo producto.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3329;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 3330;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(2);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3331;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3333;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3334;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(32);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3335;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(64);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 3336;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
 BA.debugLineNum = 3339;BA.debugLine="Return mRes";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 3340;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
cgestionventas._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cgestionventas._xui);
 //BA.debugLineNum = 3;BA.debugLine="Private jamTableViewGestionVentas As jamTableView";
cgestionventas._jamtableviewgestionventas = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewgestionventas",cgestionventas._jamtableviewgestionventas);
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
cgestionventas._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cgestionventas._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private frm As Form";
cgestionventas._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cgestionventas._frm);
 //BA.debugLineNum = 7;BA.debugLine="Private Dialog As B4XDialog";
cgestionventas._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cgestionventas._dialog);
 //BA.debugLineNum = 8;BA.debugLine="Dim JamLoadingIndicator1  As JamLoadingIndicator";
cgestionventas._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cgestionventas._jamloadingindicator1);
 //BA.debugLineNum = 14;BA.debugLine="Private mSQLGestionventas As SQL";
cgestionventas._msqlgestionventas = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msqlgestionventas",cgestionventas._msqlgestionventas);
 //BA.debugLineNum = 17;BA.debugLine="Private txtCodigoVendedor As TextField";
cgestionventas._txtcodigovendedor = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtcodigovendedor",cgestionventas._txtcodigovendedor);
 //BA.debugLineNum = 18;BA.debugLine="Private txtNombreVendedor As TextField";
cgestionventas._txtnombrevendedor = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtnombrevendedor",cgestionventas._txtnombrevendedor);
 //BA.debugLineNum = 19;BA.debugLine="Private btnSalir As Button";
cgestionventas._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cgestionventas._btnsalir);
 //BA.debugLineNum = 21;BA.debugLine="Private CalcularFechas As Boolean";
cgestionventas._calcularfechas = RemoteObject.createImmutable(false);__ref.setField("_calcularfechas",cgestionventas._calcularfechas);
 //BA.debugLineNum = 22;BA.debugLine="Dim Cal As GregorianCalendar";
cgestionventas._cal = RemoteObject.createNew ("flm.b4j.calendar.b4jCalendar");__ref.setField("_cal",cgestionventas._cal);
 //BA.debugLineNum = 23;BA.debugLine="Dim Locale As Locale";
cgestionventas._locale = RemoteObject.createNew ("flm.b4j.calendar.b4jLocale");__ref.setField("_locale",cgestionventas._locale);
 //BA.debugLineNum = 25;BA.debugLine="Public PermisoModuloUsuario As String";
cgestionventas._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",cgestionventas._permisomodulousuario);
 //BA.debugLineNum = 27;BA.debugLine="Private CarpetaFicherosCSVRepsol As String";
cgestionventas._carpetaficheroscsvrepsol = RemoteObject.createImmutable("");__ref.setField("_carpetaficheroscsvrepsol",cgestionventas._carpetaficheroscsvrepsol);
 //BA.debugLineNum = 28;BA.debugLine="Private CarpetaFicherosPDFRepsol As String";
cgestionventas._carpetaficherospdfrepsol = RemoteObject.createImmutable("");__ref.setField("_carpetaficherospdfrepsol",cgestionventas._carpetaficherospdfrepsol);
 //BA.debugLineNum = 29;BA.debugLine="Private BuzonCompartidoEmailEnvioInfoRepsol As St";
cgestionventas._buzoncompartidoemailenvioinforepsol = RemoteObject.createImmutable("");__ref.setField("_buzoncompartidoemailenvioinforepsol",cgestionventas._buzoncompartidoemailenvioinforepsol);
 //BA.debugLineNum = 30;BA.debugLine="Private BuzonCompartidoEmailEnvioInfoRepsol As St";
cgestionventas._buzoncompartidoemailenvioinforepsol = RemoteObject.createImmutable("");__ref.setField("_buzoncompartidoemailenvioinforepsol",cgestionventas._buzoncompartidoemailenvioinforepsol);
 //BA.debugLineNum = 31;BA.debugLine="Private DireccionSeleccionadaRemitenteEmailsRepso";
cgestionventas._direccionseleccionadaremitenteemailsrepsol = RemoteObject.createImmutable("");__ref.setField("_direccionseleccionadaremitenteemailsrepsol",cgestionventas._direccionseleccionadaremitenteemailsrepsol);
 //BA.debugLineNum = 32;BA.debugLine="Private DireccionDestinoEmailsRepsol As String";
cgestionventas._direcciondestinoemailsrepsol = RemoteObject.createImmutable("");__ref.setField("_direcciondestinoemailsrepsol",cgestionventas._direcciondestinoemailsrepsol);
 //BA.debugLineNum = 33;BA.debugLine="Private DireccionCCDestinoEmailsRepsol As String";
cgestionventas._direccionccdestinoemailsrepsol = RemoteObject.createImmutable("");__ref.setField("_direccionccdestinoemailsrepsol",cgestionventas._direccionccdestinoemailsrepsol);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _confplazofechaentregaplan(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfPlazoFechaEntregaPlan (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2329);
if (RapidSub.canDelegate("confplazofechaentregaplan")) { __ref.runUserSub(false, "cgestionventas","confplazofechaentregaplan", __ref); return;}
ResumableSub_ConfPlazoFechaEntregaPlan rsub = new ResumableSub_ConfPlazoFechaEntregaPlan(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ConfPlazoFechaEntregaPlan extends BA.ResumableSub {
public ResumableSub_ConfPlazoFechaEntregaPlan(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ConfPlazoFechaEntregaPlan (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2329);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2330;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(33554432);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2331;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(67108864);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2332;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(134217728);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2333;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"ConfPlazoFec";
Debug.ShouldStop(268435456);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("ConfPlazoFechaEntregaPlan")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2334;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "confplazofechaentregaplan"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2337;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 2338;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query ConfPlazoFechaEntregaPlan ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2339;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "confplazofechaentregaplan"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2340;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2345;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 2349;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2351;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(16384);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2352;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 2355;BA.debugLine="CallSubDelayed3(Me,\"ConfPlazoFechaEntregaPlan_Com";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("ConfPlazoFechaEntregaPlan_Completed")),(Object)((_accion)),(Object)((_lstregistros)));
 BA.debugLineNum = 2356;BA.debugLine="End Sub";
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
public static void  _crearemailinfologistica(RemoteObject __ref,RemoteObject _documento) throws Exception{
try {
		Debug.PushSubsStack("CrearEmailInfoLogistica (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3374);
if (RapidSub.canDelegate("crearemailinfologistica")) { __ref.runUserSub(false, "cgestionventas","crearemailinfologistica", __ref, _documento); return;}
ResumableSub_CrearEmailInfoLogistica rsub = new ResumableSub_CrearEmailInfoLogistica(null,__ref,_documento);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CrearEmailInfoLogistica extends BA.ResumableSub {
public ResumableSub_CrearEmailInfoLogistica(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _documento) {
this.parent = parent;
this.__ref = __ref;
this._documento = _documento;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _documento;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rutaficheropdfdocumento = RemoteObject.createImmutable("");
RemoteObject _nombreficheropdfdocumento = RemoteObject.createImmutable("");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _lstlineasalbaran = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _arrh = null;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _row = null;
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
RemoteObject group37;
int index37;
int groupLen37;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CrearEmailInfoLogistica (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3374);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Documento", _documento);
 BA.debugLineNum = 3376;BA.debugLine="JamLoadingIndicator1.MensajeLoading=$\"Cargando in";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Cargando información logística documento "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3377;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 3378;BA.debugLine="Wait For(CargaRepsolInformacionLogisticaAlbaranVe";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_cargarepsolinformacionlogisticaalbaranventa" /*RemoteObject*/ ,(Object)(_documento)));
this.state = 46;
return;
case 46:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 3379;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3380;BA.debugLine="If Accion=\"NOK\" Then";
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
 BA.debugLineNum = 3381;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3382;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 3384;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(8388608);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3385;BA.debugLine="Log(lstReg)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","814352395",BA.ObjectToString(_lstreg),0);
 BA.debugLineNum = 3387;BA.debugLine="If lstReg.Size=0 Then";
Debug.ShouldStop(67108864);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_lstreg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 3388;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3389;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay datos";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay datos en el documento "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable(" para generar el fichero. Revisar información en navision.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3390;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 47;
return;
case 47:
//C
this.state = 8;
;
 BA.debugLineNum = 3391;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 3394;BA.debugLine="Dim RutaFicheroPDFDocumento As String";
Debug.ShouldStop(2);
_rutaficheropdfdocumento = RemoteObject.createImmutable("");Debug.locals.put("RutaFicheroPDFDocumento", _rutaficheropdfdocumento);
 BA.debugLineNum = 3395;BA.debugLine="Dim NombreFicheroPDFDocumento As String=$\"${Docum";
Debug.ShouldStop(4);
_nombreficheropdfdocumento = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable(".pdf")));Debug.locals.put("NombreFicheroPDFDocumento", _nombreficheropdfdocumento);Debug.locals.put("NombreFicheroPDFDocumento", _nombreficheropdfdocumento);
 BA.debugLineNum = 3396;BA.debugLine="If File.Exists(CarpetaFicherosPDFRepsol,NombreFic";
Debug.ShouldStop(8);
if (true) break;

case 9:
//if
this.state = 18;
if (parent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(true,"_carpetaficherospdfrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropdfdocumento)).<Boolean>get().booleanValue()) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 18;
 BA.debugLineNum = 3397;BA.debugLine="RutaFicheroPDFDocumento=File.Combine(CarpetaFich";
Debug.ShouldStop(16);
_rutaficheropdfdocumento = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(__ref.getField(true,"_carpetaficherospdfrepsol" /*RemoteObject*/ )),(Object)(_nombreficheropdfdocumento));Debug.locals.put("RutaFicheroPDFDocumento", _rutaficheropdfdocumento);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 3399;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"No e";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No existe el fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficheropdfdocumento))),RemoteObject.createImmutable(" en la carpeta "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_carpetaficherospdfrepsol" /*RemoteObject*/ )))),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("¿Continuar? (Puedes añadir manualmente el PDF en el email")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 48;
return;
case 48:
//C
this.state = 14;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3401;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(256);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 3402;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3403;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 3407;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(16384);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 3408;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(32768);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 3410;BA.debugLine="Dim lstLineasAlbaran As List";
Debug.ShouldStop(131072);
_lstlineasalbaran = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasAlbaran", _lstlineasalbaran);
 BA.debugLineNum = 3411;BA.debugLine="lstLineasAlbaran.Initialize";
Debug.ShouldStop(262144);
_lstlineasalbaran.runVoidMethod ("Initialize");
 BA.debugLineNum = 3413;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
Debug.ShouldStop(1048576);
_mdata0 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata0 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mData0", _mdata0);Debug.locals.put("mData0", _mdata0);
 BA.debugLineNum = 3415;BA.debugLine="Dim iDX As Int";
Debug.ShouldStop(4194304);
_idx = RemoteObject.createImmutable(0);Debug.locals.put("iDX", _idx);
 BA.debugLineNum = 3416;BA.debugLine="Dim arrH(mData0.size) As String=mapKeysToArray(mD";
Debug.ShouldStop(8388608);
_arrh = __ref.runClassMethod (b4j.docU.cgestionventas.class, "_mapkeystoarray" /*RemoteObject*/ ,(Object)(_mdata0));Debug.locals.put("arrH", _arrh);Debug.locals.put("arrH", _arrh);
 BA.debugLineNum = 3417;BA.debugLine="lstLineasAlbaran.Add(arrH)";
Debug.ShouldStop(16777216);
_lstlineasalbaran.runVoidMethod ("Add",(Object)((_arrh)));
 BA.debugLineNum = 3419;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(67108864);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 3420;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(134217728);
if (true) break;

case 19:
//for
this.state = 22;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group37 = _lstreg;
index37 = 0;
groupLen37 = group37.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 49;
if (true) break;

case 49:
//C
this.state = 22;
if (index37 < groupLen37) {
this.state = 21;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group37.runMethod(false,"Get",index37));Debug.locals.put("mData", _mdata);}
if (true) break;

case 50:
//C
this.state = 49;
index37++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 21:
//C
this.state = 50;
 BA.debugLineNum = 3421;BA.debugLine="Log(mData)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","814352431",BA.ObjectToString(_mdata),0);
 BA.debugLineNum = 3422;BA.debugLine="Dim row() As Object=mapValuesToArrayOfStringsCon";
Debug.ShouldStop(536870912);
_row = __ref.runClassMethod (b4j.docU.cgestionventas.class, "_mapvaluestoarrayofstringsconcamposfecha" /*RemoteObject*/ ,(Object)(_mdata));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 3426;BA.debugLine="lstLineasAlbaran.Add(row)";
Debug.ShouldStop(2);
_lstlineasalbaran.runVoidMethod ("Add",(Object)((_row)));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 3429;BA.debugLine="DateTime.DateFormat=DateTime.DateFormat";
Debug.ShouldStop(16);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat"));
 BA.debugLineNum = 3432;BA.debugLine="Dim DirFicherosAlbaranesVentaRepsol As String=Car";
Debug.ShouldStop(128);
_dirficherosalbaranesventarepsol = __ref.getField(true,"_carpetaficheroscsvrepsol" /*RemoteObject*/ );Debug.locals.put("DirFicherosAlbaranesVentaRepsol", _dirficherosalbaranesventarepsol);Debug.locals.put("DirFicherosAlbaranesVentaRepsol", _dirficherosalbaranesventarepsol);
 BA.debugLineNum = 3450;BA.debugLine="Dim NombreFichero As String=$\"${Documento}.csv\"$";
Debug.ShouldStop(33554432);
_nombrefichero = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFichero", _nombrefichero);Debug.locals.put("NombreFichero", _nombrefichero);
 BA.debugLineNum = 3453;BA.debugLine="Dim parser As CSVParser";
Debug.ShouldStop(268435456);
_parser = RemoteObject.createNew ("b4j.docU.csvparser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 3454;BA.debugLine="parser.Initialize";
Debug.ShouldStop(536870912);
_parser.runClassMethod (b4j.docU.csvparser.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3455;BA.debugLine="Dim s As String = parser.GenerateString(lstLineas";
Debug.ShouldStop(1073741824);
_s = _parser.runClassMethod (b4j.docU.csvparser.class, "_generatestring" /*RemoteObject*/ ,(Object)(_lstlineasalbaran),(Object)(parent.__c.getField(true,"TAB")));Debug.locals.put("s", _s);Debug.locals.put("s", _s);
 BA.debugLineNum = 3456;BA.debugLine="File.WriteString(DirFicherosAlbaranesVentaRepsol,";
Debug.ShouldStop(-2147483648);
parent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(_dirficherosalbaranesventarepsol),(Object)(_nombrefichero),(Object)(_s));
 BA.debugLineNum = 3458;BA.debugLine="Dim RutaFicheroDocumento As String=File.Combine(D";
Debug.ShouldStop(2);
_rutaficherodocumento = parent.__c.getField(false,"File").runMethod(true,"Combine",(Object)(_dirficherosalbaranesventarepsol),(Object)(_nombrefichero));Debug.locals.put("RutaFicheroDocumento", _rutaficherodocumento);Debug.locals.put("RutaFicheroDocumento", _rutaficherodocumento);
 BA.debugLineNum = 3465;BA.debugLine="wait for(SeleccionarDireccionRemitenteEmailsREPSO";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_seleccionardireccionremitenteemailsrepsol" /*RemoteObject*/ ));
this.state = 51;
return;
case 51:
//C
this.state = 23;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3466;BA.debugLine="If Not(Success) Then";
Debug.ShouldStop(512);
if (true) break;

case 23:
//if
this.state = 32;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 32;
 BA.debugLineNum = 3467;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3468;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es necesario";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Es necesario seleccionar la dirección desde la que enviar el correo al operador logístico.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3469;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 32;
;
 BA.debugLineNum = 3470;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 3472;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La direcci";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La dirección DESDE la que se enviará el correo será:"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),__ref.getField(true,"_direccionseleccionadaremitenteemailsrepsol" /*RemoteObject*/ ))),(Object)(BA.ObjectToString("Direccion envío email")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3473;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 28;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3474;BA.debugLine="Select rInt";
Debug.ShouldStop(131072);
if (true) break;

case 28:
//select
this.state = 31;
switch (BA.switchObjectToInt(_rint,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel"))) {
case 0: {
this.state = 30;
if (true) break;
}
}
if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 3476;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3477;BA.debugLine="Return";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 3481;BA.debugLine="Dim sbBody As String=HTMLBodyEmail";
Debug.ShouldStop(16777216);
_sbbody = __ref.runClassMethod (b4j.docU.cgestionventas.class, "_htmlbodyemail" /*RemoteObject*/ );Debug.locals.put("sbBody", _sbbody);Debug.locals.put("sbBody", _sbbody);
 BA.debugLineNum = 3482;BA.debugLine="If DireccionCCDestinoEmailsRepsol=\"\" Then Direcci";
Debug.ShouldStop(33554432);
if (true) break;

case 33:
//if
this.state = 38;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_direccionccdestinoemailsrepsol" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
__ref.setField ("_direccionccdestinoemailsrepsol" /*RemoteObject*/ ,BA.ObjectToString("None"));
if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 3484;BA.debugLine="Dim EmailSubject As String=$\"Albarán venta REPSOL";
Debug.ShouldStop(134217728);
_emailsubject = (RemoteObject.concat(RemoteObject.createImmutable("Albarán venta REPSOL "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_documento))),RemoteObject.createImmutable("")));Debug.locals.put("EmailSubject", _emailsubject);Debug.locals.put("EmailSubject", _emailsubject);
 BA.debugLineNum = 3486;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Creando emai";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Creando email...")));
 BA.debugLineNum = 3487;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 3488;BA.debugLine="wait for(EjecutarVBSScriptEnviarEmailREPSOL(Direc";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_ejecutarvbsscriptenviaremailrepsol" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_direccionseleccionadaremitenteemailsrepsol" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_direcciondestinoemailsrepsol" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_direccionccdestinoemailsrepsol" /*RemoteObject*/ )),(Object)(_emailsubject),(Object)(_sbbody),(Object)(_rutaficherodocumento),(Object)(_rutaficheropdfdocumento)));
this.state = 54;
return;
case 54:
//C
this.state = 39;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 3490;BA.debugLine="Log(\"mRes: \" & mRes)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","814352500",RemoteObject.concat(RemoteObject.createImmutable("mRes: "),_mres),0);
 BA.debugLineNum = 3491;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(4);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 3492;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
Debug.ShouldStop(8);
_exitcode = BA.numberCast(int.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExitCode")))));Debug.locals.put("ExitCode", _exitcode);Debug.locals.put("ExitCode", _exitcode);
 BA.debugLineNum = 3493;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
Debug.ShouldStop(16);
_stdout = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdOut")))));Debug.locals.put("StdOut", _stdout);Debug.locals.put("StdOut", _stdout);
 BA.debugLineNum = 3494;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
Debug.ShouldStop(32);
_stderr = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdErr")))));Debug.locals.put("StdErr", _stderr);Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 3495;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3496;BA.debugLine="If Success=False Then";
Debug.ShouldStop(128);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 3497;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt creación de email"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3498;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 55;
return;
case 55:
//C
this.state = 42;
;
 BA.debugLineNum = 3499;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 3501;BA.debugLine="If ExitCode=1 Then";
Debug.ShouldStop(4096);

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 1))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 3502;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt creación email"),parent.__c.getField(true,"CRLF"),_stderr)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3503;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 56;
return;
case 56:
//C
this.state = 45;
;
 BA.debugLineNum = 3504;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 45:
//C
this.state = -1;
;
 BA.debugLineNum = 3507;BA.debugLine="Sleep(250)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"),BA.numberCast(int.class, 250));
this.state = 57;
return;
case 57:
//C
this.state = -1;
;
 BA.debugLineNum = 3509;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Email creado\",";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Email creado")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3510;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = -1;
;
 BA.debugLineNum = 3512;BA.debugLine="Wait For(AbrirVentanaOutlookEmail($\"${EmailSubjec";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "crearemailinfologistica"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_abrirventanaoutlookemail" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_emailsubject))),RemoteObject.createImmutable(" - Mensaje (HTML)")))),(Object)(_documento)));
this.state = 59;
return;
case 59:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 3514;BA.debugLine="End Sub";
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
public static RemoteObject  _creartablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearTablasSQLite (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,505);
if (RapidSub.canDelegate("creartablassqlite")) { return __ref.runUserSub(false, "cgestionventas","creartablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 505;BA.debugLine="Sub CrearTablasSQLite";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 513;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(1);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblFechasPrometidasCompra")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 514;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 515;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblFe";
Debug.ShouldStop(4);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblFechasPrometidasCompra")));
 };
 BA.debugLineNum = 517;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(16);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 518;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 519;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblFechasPrometidasCompra (")));
 BA.debugLineNum = 520;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 521;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Linea INTEGER,")));
 BA.debugLineNum = 522;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 523;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 524;BA.debugLine="sbCrearTabla.Append(\"FechaProm INTEGER,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaProm INTEGER,")));
 BA.debugLineNum = 525;BA.debugLine="sbCrearTabla.Append(\"FechaPromAj INTEGER,\")";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPromAj INTEGER,")));
 BA.debugLineNum = 526;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE,";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Almacen TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 527;BA.debugLine="sbCrearTabla.Append(\"AlmacenGV INTEGER,\")";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmacenGV INTEGER,")));
 BA.debugLineNum = 528;BA.debugLine="sbCrearTabla.Append(\"QtyPteRecibir INTEGER,\")";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPteRecibir INTEGER,")));
 BA.debugLineNum = 529;BA.debugLine="sbCrearTabla.Append(\"sFechaProm TEXT)\")";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFechaProm TEXT)")));
 BA.debugLineNum = 530;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(131072);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 532;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(524288);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblPedidosCompraRecibidosPtesRecepcionar")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 533;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 534;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblPe";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblPedidosCompraRecibidosPtesRecepcionar")));
 };
 BA.debugLineNum = 536;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(8388608);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 537;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 538;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblPedidosCompraRecibidosPtesRecepcionar (")));
 BA.debugLineNum = 539;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 540;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Linea INTEGER,")));
 BA.debugLineNum = 541;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 542;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 543;BA.debugLine="sbCrearTabla.Append(\"QtyARecepcionar INTEGER)\")";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyARecepcionar INTEGER)")));
 BA.debugLineNum = 544;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 546;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(2);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 547;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 548;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblOS";
Debug.ShouldStop(8);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")));
 };
 BA.debugLineNum = 550;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(32);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 551;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 552;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion (")));
 BA.debugLineNum = 553;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 554;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 555;BA.debugLine="sbCrearTabla.Append(\"TQtyPte INTEGER,\")";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("TQtyPte INTEGER,")));
 BA.debugLineNum = 556;BA.debugLine="sbCrearTabla.Append(\"FechaVencimiento INTEGER,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaVencimiento INTEGER,")));
 BA.debugLineNum = 557;BA.debugLine="sbCrearTabla.Append(\"FechaVencimientoAj INTEGER,\"";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaVencimientoAj INTEGER,")));
 BA.debugLineNum = 558;BA.debugLine="sbCrearTabla.Append(\"sFechaProm TEXT)\")";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFechaProm TEXT)")));
 BA.debugLineNum = 559;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(16384);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 562;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(131072);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblStockDisponibleArticuloTallaFecha")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 563;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 564;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
Debug.ShouldStop(524288);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblStockDisponibleArticuloTallaFecha")));
 };
 BA.debugLineNum = 566;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(2097152);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 567;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 568;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblStockDisponibleArticuloTallaFecha (")));
 BA.debugLineNum = 569;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 570;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 571;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha INTEGER,")));
 BA.debugLineNum = 572;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponible INTEGER,")));
 BA.debugLineNum = 573;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFecha TEXT)")));
 BA.debugLineNum = 574;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 577;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(1);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblStockDisponibleArticuloTallaFechaAlmacenesNoGV")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 578;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 579;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
Debug.ShouldStop(4);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblStockDisponibleArticuloTallaFechaAlmacenesNoGV")));
 };
 BA.debugLineNum = 581;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(16);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 582;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 583;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblStockDisponibleArticuloTallaFechaAlmacenesNoGV (")));
 BA.debugLineNum = 584;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE,";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Almacen TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 585;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 586;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 587;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha INTEGER,")));
 BA.debugLineNum = 588;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponible INTEGER,")));
 BA.debugLineNum = 589;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFecha TEXT)")));
 BA.debugLineNum = 590;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(8192);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 592;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(32768);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblStockDisponibleAcumuladoArticuloTallaFecha")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 593;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 594;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
Debug.ShouldStop(131072);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblStockDisponibleAcumuladoArticuloTallaFecha")));
 };
 BA.debugLineNum = 596;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(524288);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 597;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 598;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblStockDisponibleAcumuladoArticuloTallaFecha (")));
 BA.debugLineNum = 599;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 600;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 601;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha INTEGER,")));
 BA.debugLineNum = 602;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponible INTEGER,")));
 BA.debugLineNum = 603;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcumulada INTEG";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponibleAcumulada INTEGER,")));
 BA.debugLineNum = 604;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFecha TEXT)")));
 BA.debugLineNum = 605;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 607;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(1073741824);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 608;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 609;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
Debug.ShouldStop(1);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV")));
 };
 BA.debugLineNum = 611;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(4);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 612;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 613;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV (")));
 BA.debugLineNum = 614;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE,";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Almacen TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 615;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 616;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 617;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fecha INTEGER,")));
 BA.debugLineNum = 618;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponible INTEGER,")));
 BA.debugLineNum = 619;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcumulada INTEG";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponibleAcumulada INTEGER,")));
 BA.debugLineNum = 620;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("sFecha TEXT)")));
 BA.debugLineNum = 621;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(4096);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 623;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(16384);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblReservasDocumentoAlmZen")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 624;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 625;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblRe";
Debug.ShouldStop(65536);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblReservasDocumentoAlmZen")));
 };
 BA.debugLineNum = 627;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(262144);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 628;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 629;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblReservasDocumentoAlmZen (")));
 BA.debugLineNum = 630;BA.debugLine="sbCrearTabla.Append(\"IDEmbalajeReserva TEXT COLLA";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDEmbalajeReserva TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 631;BA.debugLine="sbCrearTabla.Append(\"AlmacenFisico TEXT COLLATE N";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmacenFisico TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 632;BA.debugLine="sbCrearTabla.Append(\"DocumentoReserva TEXT COLLAT";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DocumentoReserva TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 633;BA.debugLine="sbCrearTabla.Append(\"IDEmbalajeReservaDocumento I";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDEmbalajeReservaDocumento INTEGER,")));
 BA.debugLineNum = 634;BA.debugLine="sbCrearTabla.Append(\"LoteRecepcion INTEGER,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("LoteRecepcion INTEGER,")));
 BA.debugLineNum = 635;BA.debugLine="sbCrearTabla.Append(\"Estado INTEGER,\")";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Estado INTEGER,")));
 BA.debugLineNum = 636;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 637;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DescripcionArticulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 638;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 639;BA.debugLine="sbCrearTabla.Append(\"Qty REAL)\")";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Qty REAL)")));
 BA.debugLineNum = 640;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 645;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(16);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblGestionVentasCalculos")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 646;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 647;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblGe";
Debug.ShouldStop(64);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblGestionVentasCalculos")));
 };
 BA.debugLineNum = 649;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(256);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 650;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 651;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblGestionVentasCalculos (")));
 BA.debugLineNum = 652;BA.debugLine="sbCrearTabla.Append(\"IDPrioridad INTEGER,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDPrioridad INTEGER,")));
 BA.debugLineNum = 653;BA.debugLine="sbCrearTabla.Append(\"IDPrioridadUsuario INTEGER,\"";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDPrioridadUsuario INTEGER,")));
 BA.debugLineNum = 654;BA.debugLine="sbCrearTabla.Append(\"CodigoResponsableCuenta TEXT";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CodigoResponsableCuenta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 655;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 656;BA.debugLine="sbCrearTabla.Append(\"CodigoVendedor TEXT COLLATE";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CodigoVendedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 657;BA.debugLine="sbCrearTabla.Append(\"NombreVendedor TEXT COLLATE";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreVendedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 658;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 659;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDocumento INTEGER,")));
 BA.debugLineNum = 660;BA.debugLine="sbCrearTabla.Append(\"FechaPrometida INTEGER,\")";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrometida INTEGER,")));
 BA.debugLineNum = 661;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 662;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 663;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("GRP TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 664;BA.debugLine="sbCrearTabla.Append(\"NombreGRP TEXT COLLATE NOCAS";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreGRP TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 665;BA.debugLine="sbCrearTabla.Append(\"DirEnv TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DirEnv TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 666;BA.debugLine="sbCrearTabla.Append(\"CiudadDirEnvio TEXT COLLATE";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CiudadDirEnvio TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 667;BA.debugLine="sbCrearTabla.Append(\"PedidoCliente TEXT COLLATE N";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 668;BA.debugLine="sbCrearTabla.Append(\"Stand_By INTEGER,\")";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Stand_By INTEGER,")));
 BA.debugLineNum = 669;BA.debugLine="sbCrearTabla.Append(\"PedidoBloqueado INTEGER,\")";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoBloqueado INTEGER,")));
 BA.debugLineNum = 670;BA.debugLine="sbCrearTabla.Append(\"PedidoAbierto INTEGER,\")";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoAbierto INTEGER,")));
 BA.debugLineNum = 671;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Linea INTEGER,")));
 BA.debugLineNum = 672;BA.debugLine="sbCrearTabla.Append(\"AlmOrigen TEXT COLLATE NOCAS";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmOrigen TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 673;BA.debugLine="sbCrearTabla.Append(\"AlmOrigenGV INTEGER DEFAULT";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmOrigenGV INTEGER DEFAULT 0,")));
 BA.debugLineNum = 674;BA.debugLine="sbCrearTabla.Append(\"AlmDest TEXT COLLATE NOCASE,";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmDest TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 675;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado INTEGER,")));
 BA.debugLineNum = 676;BA.debugLine="sbCrearTabla.Append(\"Fabricacion INTEGER,\")";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fabricacion INTEGER,")));
 BA.debugLineNum = 677;BA.debugLine="sbCrearTabla.Append(\"CompraFab TEXT COLLATE NOCAS";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CompraFab TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 678;BA.debugLine="sbCrearTabla.Append(\"Dual INTEGER,\")";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Dual INTEGER,")));
 BA.debugLineNum = 679;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Ruta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 680;BA.debugLine="sbCrearTabla.Append(\"PlazoRuta TEXT COLLATE NOCAS";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoRuta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 681;BA.debugLine="sbCrearTabla.Append(\"RutaDual TEXT COLLATE NOCASE";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaDual TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 682;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaDual TEXT COLLATE N";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoRutaDual TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 683;BA.debugLine="sbCrearTabla.Append(\"ArticuloCorte TEXT COLLATE N";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ArticuloCorte TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 684;BA.debugLine="sbCrearTabla.Append(\"RutaAplicable TEXT COLLATE N";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaAplicable TEXT COLLATE NOCASE DEFAULT '',")));
 BA.debugLineNum = 685;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaAplicable INTEGER D";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoRutaAplicable INTEGER DEFAULT 0,")));
 BA.debugLineNum = 686;BA.debugLine="sbCrearTabla.Append(\"PlazoTeoricoFabLinea INTEGER";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoTeoricoFabLinea INTEGER DEFAULT 0,")));
 BA.debugLineNum = 687;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaFabLinea INTEGER";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaTeoricaFabLinea INTEGER DEFAULT 0,")));
 BA.debugLineNum = 688;BA.debugLine="sbCrearTabla.Append(\"FechaMaterial INTEGER,\")";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaMaterial INTEGER,")));
 BA.debugLineNum = 689;BA.debugLine="sbCrearTabla.Append(\"FechaPlanificada INTEGER,\")";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPlanificada INTEGER,")));
 BA.debugLineNum = 690;BA.debugLine="sbCrearTabla.Append(\"FechaRequerida INTEGER,\")";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaRequerida INTEGER,")));
 BA.debugLineNum = 691;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaEntrega INTEGER";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaTeoricaEntrega INTEGER DEFAULT 0,")));
 BA.debugLineNum = 692;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 693;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DescripcionArticulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 694;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 695;BA.debugLine="sbCrearTabla.Append(\"QtyPte INTEGER,\")";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPte INTEGER,")));
 BA.debugLineNum = 696;BA.debugLine="sbCrearTabla.Append(\"Reserva INTEGER,\")";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Reserva INTEGER,")));
 BA.debugLineNum = 697;BA.debugLine="sbCrearTabla.Append(\"QtyPteNeta INTEGER,\")";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPteNeta INTEGER,")));
 BA.debugLineNum = 698;BA.debugLine="sbCrearTabla.Append(\"StockLibre INTEGER,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("StockLibre INTEGER,")));
 BA.debugLineNum = 699;BA.debugLine="sbCrearTabla.Append(\"StockAlmNoGV INTEGER DEFAULT";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("StockAlmNoGV INTEGER DEFAULT 0,")));
 BA.debugLineNum = 700;BA.debugLine="sbCrearTabla.Append(\"QtyPteNetaAcum INTEGER DEFAU";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPteNetaAcum INTEGER DEFAULT 0,")));
 BA.debugLineNum = 701;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcum INTEGER DE";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponibleAcum INTEGER DEFAULT 0,")));
 BA.debugLineNum = 704;BA.debugLine="sbCrearTabla.Append(\"Status TEXT,\")";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Status TEXT,")));
 BA.debugLineNum = 705;BA.debugLine="sbCrearTabla.Append(\"ReservaAlmacen INTEGER,\")";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ReservaAlmacen INTEGER,")));
 BA.debugLineNum = 706;BA.debugLine="sbCrearTabla.Append(\"ImportePendiente REAL,\")";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ImportePendiente REAL,")));
 BA.debugLineNum = 707;BA.debugLine="sbCrearTabla.Append(\"FechaCalculoActualCliente IN";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaCalculoActualCliente INTEGER,")));
 BA.debugLineNum = 708;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidad INTEGER";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDisponibilidad INTEGER DEFAULT 0,")));
 BA.debugLineNum = 709;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidadVencida T";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDisponibilidadVencida TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 710;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLinea INTEGER";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasLinea INTEGER DEFAULT 0,")));
 BA.debugLineNum = 711;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLineaVencida";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasLineaVencida TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 713;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasDocumento INT";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasDocumento INTEGER DEFAULT 0)")));
 BA.debugLineNum = 716;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(2048);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 718;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 719;BA.debugLine="sbCrearTabla.Append(\"CREATE INDEX idxArticuloTall";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE INDEX idxArticuloTallatblGestionVentasCalculos ")));
 BA.debugLineNum = 720;BA.debugLine="sbCrearTabla.Append(\"ON tblGestionVentasCalculos";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ON tblGestionVentasCalculos (Articulo, Talla)")));
 BA.debugLineNum = 721;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(65536);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 723;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(262144);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblGestionVentas")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 724;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 725;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblGe";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblGestionVentas")));
 };
 BA.debugLineNum = 727;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(4194304);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 728;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 729;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblGestionVentas (")));
 BA.debugLineNum = 730;BA.debugLine="sbCrearTabla.Append(\"IDPrioridad INTEGER,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDPrioridad INTEGER,")));
 BA.debugLineNum = 731;BA.debugLine="sbCrearTabla.Append(\"IDPrioridadUsuario INTEGER,\"";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("IDPrioridadUsuario INTEGER,")));
 BA.debugLineNum = 732;BA.debugLine="sbCrearTabla.Append(\"CodigoResponsableCuenta TEXT";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CodigoResponsableCuenta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 733;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreResponsableCuenta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 734;BA.debugLine="sbCrearTabla.Append(\"CodigoVendedor TEXT COLLATE";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CodigoVendedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 735;BA.debugLine="sbCrearTabla.Append(\"NombreVendedor TEXT COLLATE";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreVendedor TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 736;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 737;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDocumento INTEGER,")));
 BA.debugLineNum = 738;BA.debugLine="sbCrearTabla.Append(\"FechaPrometida INTEGER,\")";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrometida INTEGER,")));
 BA.debugLineNum = 739;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 740;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 741;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("GRP TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 742;BA.debugLine="sbCrearTabla.Append(\"NombreGRP TEXT COLLATE NOCAS";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NombreGRP TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 743;BA.debugLine="sbCrearTabla.Append(\"DirEnv TEXT COLLATE NOCASE,\"";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DirEnv TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 744;BA.debugLine="sbCrearTabla.Append(\"CiudadDirEnvio TEXT COLLATE";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CiudadDirEnvio TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 745;BA.debugLine="sbCrearTabla.Append(\"PedidoCliente TEXT COLLATE N";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoCliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 746;BA.debugLine="sbCrearTabla.Append(\"Stand_By INTEGER,\")";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Stand_By INTEGER,")));
 BA.debugLineNum = 747;BA.debugLine="sbCrearTabla.Append(\"PedidoBloqueado INTEGER,\")";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoBloqueado INTEGER,")));
 BA.debugLineNum = 748;BA.debugLine="sbCrearTabla.Append(\"PedidoAbierto INTEGER,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PedidoAbierto INTEGER,")));
 BA.debugLineNum = 749;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Linea INTEGER,")));
 BA.debugLineNum = 750;BA.debugLine="sbCrearTabla.Append(\"AlmOrigen TEXT COLLATE NOCAS";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmOrigen TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 751;BA.debugLine="sbCrearTabla.Append(\"AlmOrigenGV INTEGER DEFAULT";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmOrigenGV INTEGER DEFAULT 0,")));
 BA.debugLineNum = 752;BA.debugLine="sbCrearTabla.Append(\"AlmDest TEXT COLLATE NOCASE,";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("AlmDest TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 753;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Personalizado INTEGER,")));
 BA.debugLineNum = 754;BA.debugLine="sbCrearTabla.Append(\"Fabricacion INTEGER,\")";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Fabricacion INTEGER,")));
 BA.debugLineNum = 755;BA.debugLine="sbCrearTabla.Append(\"CompraFab TEXT COLLATE NOCAS";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CompraFab TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 756;BA.debugLine="sbCrearTabla.Append(\"Dual INTEGER,\")";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Dual INTEGER,")));
 BA.debugLineNum = 757;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Ruta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 758;BA.debugLine="sbCrearTabla.Append(\"PlazoRuta TEXT COLLATE NOCAS";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoRuta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 759;BA.debugLine="sbCrearTabla.Append(\"RutaDual TEXT COLLATE NOCASE";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaDual TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 760;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaDual TEXT COLLATE N";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoRutaDual TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 761;BA.debugLine="sbCrearTabla.Append(\"ArticuloCorte TEXT COLLATE N";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ArticuloCorte TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 762;BA.debugLine="sbCrearTabla.Append(\"RutaAplicable TEXT COLLATE N";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("RutaAplicable TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 763;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaAplicable INTEGER D";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoRutaAplicable INTEGER DEFAULT 0,")));
 BA.debugLineNum = 764;BA.debugLine="sbCrearTabla.Append(\"PlazoTeoricoFabLinea INTEGER";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoTeoricoFabLinea INTEGER DEFAULT 0,")));
 BA.debugLineNum = 765;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaFabLinea INTEGER";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaTeoricaFabLinea INTEGER DEFAULT 0,")));
 BA.debugLineNum = 766;BA.debugLine="sbCrearTabla.Append(\"FechaMaterial INTEGER,\")";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaMaterial INTEGER,")));
 BA.debugLineNum = 767;BA.debugLine="sbCrearTabla.Append(\"FechaPlanificada INTEGER,\")";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPlanificada INTEGER,")));
 BA.debugLineNum = 768;BA.debugLine="sbCrearTabla.Append(\"FechaRequerida INTEGER,\")";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaRequerida INTEGER,")));
 BA.debugLineNum = 769;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaEntrega INTEGER";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaTeoricaEntrega INTEGER DEFAULT 0,")));
 BA.debugLineNum = 770;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 771;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("DescripcionArticulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 772;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Talla TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 773;BA.debugLine="sbCrearTabla.Append(\"QtyPte INTEGER,\")";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPte INTEGER,")));
 BA.debugLineNum = 774;BA.debugLine="sbCrearTabla.Append(\"Reserva INTEGER,\")";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Reserva INTEGER,")));
 BA.debugLineNum = 775;BA.debugLine="sbCrearTabla.Append(\"StockLibre INTEGER,\")";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("StockLibre INTEGER,")));
 BA.debugLineNum = 776;BA.debugLine="sbCrearTabla.Append(\"StockAlmNoGV INTEGER default";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("StockAlmNoGV INTEGER default 0,")));
 BA.debugLineNum = 777;BA.debugLine="sbCrearTabla.Append(\"QtyPteNeta INTEGER,\")";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPteNeta INTEGER,")));
 BA.debugLineNum = 778;BA.debugLine="sbCrearTabla.Append(\"QtyPteNetaAcum INTEGER defau";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPteNetaAcum INTEGER default 0,")));
 BA.debugLineNum = 779;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcum INTEGER de";
Debug.ShouldStop(1024);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyDisponibleAcum INTEGER default 0,")));
 BA.debugLineNum = 780;BA.debugLine="sbCrearTabla.Append(\"Status TEXT,\")";
Debug.ShouldStop(2048);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Status TEXT,")));
 BA.debugLineNum = 781;BA.debugLine="sbCrearTabla.Append(\"ReservaAlmacen INTEGER,\")";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ReservaAlmacen INTEGER,")));
 BA.debugLineNum = 782;BA.debugLine="sbCrearTabla.Append(\"QtyPteRecibir REAL default 0";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("QtyPteRecibir REAL default 0,")));
 BA.debugLineNum = 783;BA.debugLine="sbCrearTabla.Append(\"ImportePendiente REAL,\")";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ImportePendiente REAL,")));
 BA.debugLineNum = 784;BA.debugLine="sbCrearTabla.Append(\"FechaCalculoActualCliente IN";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaCalculoActualCliente INTEGER,")));
 BA.debugLineNum = 785;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidad INTEGER";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDisponibilidad INTEGER default 0,")));
 BA.debugLineNum = 786;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidadVencida T";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDisponibilidadVencida TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 787;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLinea INTEGER";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasLinea INTEGER default 0,")));
 BA.debugLineNum = 788;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLineaVencida";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasLineaVencida TEXT COLLATE NOCASE default '',")));
 BA.debugLineNum = 790;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasDocumento INT";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaPrevVentasDocumento INTEGER default 0)")));
 BA.debugLineNum = 792;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 794;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 795;BA.debugLine="sbCrearTabla.Append(\"CREATE INDEX idxArticuloTall";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE INDEX idxArticuloTallatblGestionVentas ")));
 BA.debugLineNum = 796;BA.debugLine="sbCrearTabla.Append(\"ON tblGestionVentas (Articul";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("ON tblGestionVentas (Articulo, Talla)")));
 BA.debugLineNum = 797;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 799;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(1073741824);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblConfPlazoFechaEntregaPlan")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 800;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 801;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblCo";
Debug.ShouldStop(1);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblConfPlazoFechaEntregaPlan")));
 };
 BA.debugLineNum = 803;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(4);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 804;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 805;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblConfPlazoFechaEntregaPlan (")));
 BA.debugLineNum = 806;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 807;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 808;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("GRP TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 809;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Ruta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 810;BA.debugLine="sbCrearTabla.Append(\"Plazo INTEGER)\")";
Debug.ShouldStop(512);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo INTEGER)")));
 BA.debugLineNum = 811;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(1024);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 835;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(4);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblConfPlazoFechaEntregaPlanArticulosCorteGV")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 836;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 837;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblCo";
Debug.ShouldStop(16);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblConfPlazoFechaEntregaPlanArticulosCorteGV")));
 };
 BA.debugLineNum = 840;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
Debug.ShouldStop(128);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(cgestionventas.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblConfPlazoFechaEntregaPlanArticulosFabGV")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 841;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 842;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblCo";
Debug.ShouldStop(512);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblConfPlazoFechaEntregaPlanArticulosFabGV")));
 };
 BA.debugLineNum = 844;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(2048);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 845;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(4096);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 846;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
Debug.ShouldStop(8192);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS tblConfPlazoFechaEntregaPlanArticulosFabGV (")));
 BA.debugLineNum = 847;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
Debug.ShouldStop(16384);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Documento TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 848;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
Debug.ShouldStop(32768);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Linea INTEGER,")));
 BA.debugLineNum = 849;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento Long,\")";
Debug.ShouldStop(65536);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDocumento Long,")));
 BA.debugLineNum = 850;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Articulo TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 851;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Cliente TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 852;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("GRP TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 853;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
Debug.ShouldStop(1048576);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Ruta TEXT COLLATE NOCASE,")));
 BA.debugLineNum = 854;BA.debugLine="sbCrearTabla.Append(\"Plazo1 INTEGER,\")";
Debug.ShouldStop(2097152);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo1 INTEGER,")));
 BA.debugLineNum = 855;BA.debugLine="sbCrearTabla.Append(\"Plazo2 INTEGER,\")";
Debug.ShouldStop(4194304);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo2 INTEGER,")));
 BA.debugLineNum = 856;BA.debugLine="sbCrearTabla.Append(\"Plazo3 INTEGER,\")";
Debug.ShouldStop(8388608);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo3 INTEGER,")));
 BA.debugLineNum = 857;BA.debugLine="sbCrearTabla.Append(\"Plazo4 INTEGER,\")";
Debug.ShouldStop(16777216);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo4 INTEGER,")));
 BA.debugLineNum = 858;BA.debugLine="sbCrearTabla.Append(\"Plazo5 INTEGER,\")";
Debug.ShouldStop(33554432);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo5 INTEGER,")));
 BA.debugLineNum = 859;BA.debugLine="sbCrearTabla.Append(\"Plazo6 INTEGER,\")";
Debug.ShouldStop(67108864);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo6 INTEGER,")));
 BA.debugLineNum = 860;BA.debugLine="sbCrearTabla.Append(\"Plazo7 INTEGER,\")";
Debug.ShouldStop(134217728);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo7 INTEGER,")));
 BA.debugLineNum = 861;BA.debugLine="sbCrearTabla.Append(\"Plazo8 INTEGER,\")";
Debug.ShouldStop(268435456);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo8 INTEGER,")));
 BA.debugLineNum = 862;BA.debugLine="sbCrearTabla.Append(\"Plazo9 INTEGER,\")";
Debug.ShouldStop(536870912);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo9 INTEGER,")));
 BA.debugLineNum = 863;BA.debugLine="sbCrearTabla.Append(\"Plazo10 INTEGER,\")";
Debug.ShouldStop(1073741824);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Plazo10 INTEGER,")));
 BA.debugLineNum = 864;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaAplicable INTEGER D";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoRutaAplicable INTEGER DEFAULT 0,")));
 BA.debugLineNum = 865;BA.debugLine="sbCrearTabla.Append(\"PlazoArtLinea INTEGER,\")";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("PlazoArtLinea INTEGER,")));
 BA.debugLineNum = 866;BA.debugLine="sbCrearTabla.Append(\"FechaDocumentoMasPlazoArtLin";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("FechaDocumentoMasPlazoArtLinea Long)")));
 BA.debugLineNum = 868;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
Debug.ShouldStop(8);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 905;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearvbsscriptdireccionremitenteemailoutlookrepsol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearVBSScriptDireccionRemitenteEmailOutlookREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3615);
if (RapidSub.canDelegate("crearvbsscriptdireccionremitenteemailoutlookrepsol")) { return __ref.runUserSub(false, "cgestionventas","crearvbsscriptdireccionremitenteemailoutlookrepsol", __ref);}
RemoteObject _svbscript = RemoteObject.createImmutable("");
 BA.debugLineNum = 3615;BA.debugLine="Sub CrearVBSScriptDireccionRemitenteEmailOutlookRE";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 3617;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookREPS";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptdireccionremitenteemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 3619;BA.debugLine="Dim sVBscript As String";
Debug.ShouldStop(4);
_svbscript = RemoteObject.createImmutable("");Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 3621;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
Debug.ShouldStop(16);
_svbscript = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Option Explicit\n"),RemoteObject.createImmutable("		On Error Resume Next\n"),RemoteObject.createImmutable("		Dim xOLApp, olAccounts\n"),RemoteObject.createImmutable("		Dim objStdOut,objStdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		Set objStdOut = WScript.StdOut\n"),RemoteObject.createImmutable("		Set objStdErr = WScript.StdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"),RemoteObject.createImmutable("		Set xOLApp =GetObject(, \"Outlook.Application\")\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			If Err.Number=429 Then\n"),RemoteObject.createImmutable("	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("			Else\n"),RemoteObject.createImmutable("	'MsgBox Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("				objStdErr.Write Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("			End If\n"),RemoteObject.createImmutable("			WScript.Quit (1) 'return code 1\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Dim i\n"),RemoteObject.createImmutable("		For i = 1 To xOLApp.Session.Accounts.count\n"),RemoteObject.createImmutable("			objStdOut.Write xOLApp.Session.Accounts.Item(i) & \",\"\n"),RemoteObject.createImmutable("		Next\n"),RemoteObject.createImmutable("		Set xOLApp = Nothing\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"),RemoteObject.createImmutable("			WScript.Quit (1)\n"),RemoteObject.createImmutable("		Else\n"),RemoteObject.createImmutable("			WScript.Quit (0)\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("			")));Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 3678;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc.vbs\"";
Debug.ShouldStop(536870912);
cgestionventas.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("smfpromc.vbs")),(Object)(_svbscript));
 BA.debugLineNum = 3679;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearvbsscriptenvioemailoutlookhtmlrepsol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CrearVBSScriptEnvioEmailOutlookHTMLREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3876);
if (RapidSub.canDelegate("crearvbsscriptenvioemailoutlookhtmlrepsol")) { return __ref.runUserSub(false, "cgestionventas","crearvbsscriptenvioemailoutlookhtmlrepsol", __ref);}
RemoteObject _svbscript = RemoteObject.createImmutable("");
 BA.debugLineNum = 3876;BA.debugLine="Sub CrearVBSScriptEnvioEmailOutlookHTMLREPSOL";
Debug.ShouldStop(8);
 BA.debugLineNum = 3878;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptenvioemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 3880;BA.debugLine="Dim sVBscript As String";
Debug.ShouldStop(128);
_svbscript = RemoteObject.createImmutable("");Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 3882;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
Debug.ShouldStop(512);
_svbscript = (RemoteObject.concat(RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Option Explicit\n"),RemoteObject.createImmutable("		On Error Resume Next\n"),RemoteObject.createImmutable("\n"),RemoteObject.createImmutable("		Dim objStdOut,objStdErr\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("		Set objStdOut = WScript.StdOut\n"),RemoteObject.createImmutable("		Set objStdErr = WScript.StdErr\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Dim xOLApp\n"),RemoteObject.createImmutable("		Dim objMailItem\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("	'Dim OutAccount\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		Dim signature\n"),RemoteObject.createImmutable("			\n"),RemoteObject.createImmutable("	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"),RemoteObject.createImmutable("		Set xOLApp =GetObject(, \"Outlook.Application\")\n"),RemoteObject.createImmutable("		If Err.Number<>0 Then\n"),RemoteObject.createImmutable("			If Err.Number=429 Then\n"),RemoteObject.createImmutable("	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"),RemoteObject.createImmutable("			Else\n"),RemoteObject.createImmutable("	'MsgBox Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("				objStdErr.Write Err.Number & \" \" & Err.Description\n"),RemoteObject.createImmutable("			End If\n"),RemoteObject.createImmutable("			WScript.Quit (1) 'return code 1\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("		Set objMailItem = xOLApp.CreateItem(0)\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("   		objMailItem.Display\n"),RemoteObject.createImmutable("		signature = objMailItem.HTMLBody\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("	'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)\n"),RemoteObject.createImmutable("	'objMailItem.SendUsingAccount = WScript.Arguments(0)\n"),RemoteObject.createImmutable("	'objMailItem.SendUsingAccount = OutAccount\n"),RemoteObject.createImmutable("	'objMailItem.SentOnBehalfOfName = OutAccount\n"),RemoteObject.createImmutable("		\n"),RemoteObject.createImmutable("		objMailItem.To = WScript.Arguments(1)\n"),RemoteObject.createImmutable("		if WScript.Arguments(2)<>\"None\" then\n"),RemoteObject.createImmutable("			objMailItem.CC = WScript.Arguments(2)\n"),RemoteObject.createImmutable("		end if\n"),RemoteObject.createImmutable("		objMailItem.Subject = WScript.Arguments(3)\n"),RemoteObject.createImmutable("	'objMailItem.HTMLBody = WScript.Arguments(4) & \"<br><br>\" & objMailItem.HTMLBody & \"</p>\"\n"),RemoteObject.createImmutable("		objMailItem.HTMLBody = \"<p><br>\" & WScript.Arguments(4) & \"<br>\" & signature & \"</p>\"\n"),RemoteObject.createImmutable("		objMailItem.Attachments.Add WScript.Arguments(5)\n"),RemoteObject.createImmutable("		if WScript.Arguments(6)<>\"\" then\n"),RemoteObject.createImmutable("			objMailItem.Attachments.Add WScript.Arguments(6)\n"),RemoteObject.createImmutable("		end if\n"),RemoteObject.createImmutable("	'objMailItem.Send\n"),RemoteObject.createImmutable("		Set xOLApp = Nothing\n"),RemoteObject.createImmutable("		Set objMailItem = Nothing\n"),RemoteObject.createImmutable("		If Err.Number = 0 Then\n"),RemoteObject.createImmutable("			objStdOut.Write \"Email enviado\"\n"),RemoteObject.createImmutable("			WScript.Quit (0)\n"),RemoteObject.createImmutable("		Else\n"),RemoteObject.createImmutable("			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"),RemoteObject.createImmutable("			WScript.Quit (1)\n"),RemoteObject.createImmutable("		End If\n"),RemoteObject.createImmutable("			")));Debug.locals.put("sVBscript", _svbscript);
 BA.debugLineNum = 3944;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc2.vbs";
Debug.ShouldStop(128);
cgestionventas.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(BA.ObjectToString("smfpromc2.vbs")),(Object)(_svbscript));
 BA.debugLineNum = 3945;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _datosgestionventas(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DatosGestionVentas (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2215);
if (RapidSub.canDelegate("datosgestionventas")) { __ref.runUserSub(false, "cgestionventas","datosgestionventas", __ref); return;}
ResumableSub_DatosGestionVentas rsub = new ResumableSub_DatosGestionVentas(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_DatosGestionVentas extends BA.ResumableSub {
public ResumableSub_DatosGestionVentas(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("DatosGestionVentas (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2215);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2216;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(128);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2217;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(256);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2218;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(512);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2219;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"GestionVenta";
Debug.ShouldStop(1024);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("GestionVentasAmpliadaPlazos2")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2220;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "datosgestionventas"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2221;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 2222;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query GestionVentas ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2223;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "datosgestionventas"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2224;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2226;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 2227;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos en Gestión de Ventas.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2228;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "datosgestionventas"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 2229;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2231;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(4194304);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2232;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(8388608);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 2235;BA.debugLine="CallSubDelayed3(Me,\"DatosGestionVentas_Completed\"";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("DatosGestionVentas_Completed")),(Object)((_accion)),(Object)((_lstregistros)));
 BA.debugLineNum = 2236;BA.debugLine="End Sub";
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
public static RemoteObject  _ejecutarvbsscriptdireccionesemailrepsol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptDireccionesEmailREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3824);
if (RapidSub.canDelegate("ejecutarvbsscriptdireccionesemailrepsol")) { return __ref.runUserSub(false, "cgestionventas","ejecutarvbsscriptdireccionesemailrepsol", __ref);}
ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL rsub = new ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL(null,__ref);
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
public static class ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shl = RemoteObject.declareNull("anywheresoftware.b4j.objects.Shell");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _exitcode = RemoteObject.createImmutable(0);
RemoteObject _stdout = RemoteObject.createImmutable("");
RemoteObject _stderr = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptDireccionesEmailREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3824);
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
 BA.debugLineNum = 3825;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(65536);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 3826;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 3827;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(262144);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 3828;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
Debug.ShouldStop(524288);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("c:\\windows\\system32\\cscript.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("//nologo"),RemoteObject.createImmutable("smfpromc.vbs")})))));
 BA.debugLineNum = 3829;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
Debug.ShouldStop(1048576);
_shl.runMethod(true,"setWorkingDirectory",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder"));
 BA.debugLineNum = 3830;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(2097152);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 3831;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 3832;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "ejecutarvbsscriptdireccionesemailrepsol"), null);
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
 BA.debugLineNum = 3833;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 3834;BA.debugLine="Log(\"Success\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","814876682",RemoteObject.createImmutable("Success"),0);
 BA.debugLineNum = 3835;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","814876683",_stdout,0);
 BA.debugLineNum = 3836;BA.debugLine="mRes.Put(\"Success\",True)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 3837;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
Debug.ShouldStop(268435456);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdOut"))),(Object)((_stdout)));
 BA.debugLineNum = 3838;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
Debug.ShouldStop(536870912);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdErr"))),(Object)((_stderr)));
 BA.debugLineNum = 3839;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ExitCode"))),(Object)((_exitcode)));
 BA.debugLineNum = 3840;BA.debugLine="Return mRes";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 3841;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _ejecutarvbsscriptenviaremailrepsol(RemoteObject __ref,RemoteObject _senderaddr,RemoteObject _receiveraddr,RemoteObject _ccreceiveraddr,RemoteObject _subject,RemoteObject _body,RemoteObject _fileattch,RemoteObject _fileattch2) throws Exception{
try {
		Debug.PushSubsStack("EjecutarVBSScriptEnviarEmailREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3843);
if (RapidSub.canDelegate("ejecutarvbsscriptenviaremailrepsol")) { return __ref.runUserSub(false, "cgestionventas","ejecutarvbsscriptenviaremailrepsol", __ref, _senderaddr, _receiveraddr, _ccreceiveraddr, _subject, _body, _fileattch, _fileattch2);}
ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL rsub = new ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL(null,__ref,_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2);
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
public static class ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _senderaddr,RemoteObject _receiveraddr,RemoteObject _ccreceiveraddr,RemoteObject _subject,RemoteObject _body,RemoteObject _fileattch,RemoteObject _fileattch2) {
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
b4j.docU.cgestionventas parent;
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
		Debug.PushSubsStack("EjecutarVBSScriptEnviarEmailREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3843);
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
 BA.debugLineNum = 3845;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
Debug.ShouldStop(16);
_body = _body.runMethod(true,"replace",(Object)(parent.__c.getField(true,"CRLF")),(Object)(RemoteObject.createImmutable("<br>")));Debug.locals.put("Body", _body);
 BA.debugLineNum = 3847;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(64);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 3848;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(128);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 3849;BA.debugLine="Dim shl As Shell";
Debug.ShouldStop(256);
_shl = RemoteObject.createNew ("anywheresoftware.b4j.objects.Shell");Debug.locals.put("shl", _shl);
 BA.debugLineNum = 3850;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
Debug.ShouldStop(512);
_shl.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("shl")),(Object)(BA.ObjectToString("c:\\windows\\system32\\cscript.exe")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString("//nologo"),BA.ObjectToString("smfpromc2.vbs"),_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2})))));
 BA.debugLineNum = 3851;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
Debug.ShouldStop(1024);
_shl.runMethod(true,"setWorkingDirectory",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder"));
 BA.debugLineNum = 3852;BA.debugLine="shl.Run(-1)";
Debug.ShouldStop(2048);
_shl.runVoidMethod ("Run",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, -(double) (0 + 1))));
 BA.debugLineNum = 3853;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
Debug.ShouldStop(4096);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 3854;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","shl_processcompleted", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "ejecutarvbsscriptenviaremailrepsol"), null);
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
 BA.debugLineNum = 3855;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 3856;BA.debugLine="Log(\"Success: \" & Success)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","814942221",RemoteObject.concat(RemoteObject.createImmutable("Success: "),_success),0);
 BA.debugLineNum = 3857;BA.debugLine="Log(StdOut)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","814942222",_stdout,0);
 BA.debugLineNum = 3858;BA.debugLine="mRes.Put(\"Success\",True)";
Debug.ShouldStop(131072);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Success"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 3859;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
Debug.ShouldStop(262144);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdOut"))),(Object)((_stdout)));
 BA.debugLineNum = 3860;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("StdErr"))),(Object)((_stderr)));
 BA.debugLineNum = 3861;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
Debug.ShouldStop(1048576);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ExitCode"))),(Object)((_exitcode)));
 BA.debugLineNum = 3862;BA.debugLine="Return mRes";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 3863;BA.debugLine="End Sub";
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
public static RemoteObject  _existenciasarttallaalmacenlineasgestionventasalmnogv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2238);
if (RapidSub.canDelegate("existenciasarttallaalmacenlineasgestionventasalmnogv")) { return __ref.runUserSub(false, "cgestionventas","existenciasarttallaalmacenlineasgestionventasalmnogv", __ref);}
ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV rsub = new ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV(null,__ref);
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
public static class ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV extends BA.ResumableSub {
public ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2238);
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
 BA.debugLineNum = 2239;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1073741824);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 2240;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 2241;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(1);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2242;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(2);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2243;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(4);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2244;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2245;BA.debugLine="mRes.Put(\"lstRegistros\", lstRegistros)";
Debug.ShouldStop(16);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
 BA.debugLineNum = 2246;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"ExistenciasA";
Debug.ShouldStop(32);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2247;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "existenciasarttallaalmacenlineasgestionventasalmnogv"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2250;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 2251;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query GestionVentas ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2252;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "existenciasarttallaalmacenlineasgestionventasalmnogv"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2253;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2254;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2256;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 2257;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos en Gestión de Ventas.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2258;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "existenciasarttallaalmacenlineasgestionventasalmnogv"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 2259;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2260;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2262;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(2097152);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2263;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(4194304);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2264;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2265;BA.debugLine="mRes.Put(\"lstRegistros\", lstRegistros)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
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
 BA.debugLineNum = 2268;BA.debugLine="Return mRes";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 2269;BA.debugLine="End Sub";
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
public static void  _fechasprometidascompras(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FechasPrometidasCompras (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2271);
if (RapidSub.canDelegate("fechasprometidascompras")) { __ref.runUserSub(false, "cgestionventas","fechasprometidascompras", __ref); return;}
ResumableSub_FechasPrometidasCompras rsub = new ResumableSub_FechasPrometidasCompras(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_FechasPrometidasCompras extends BA.ResumableSub {
public ResumableSub_FechasPrometidasCompras(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FechasPrometidasCompras (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2271);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2272;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(-2147483648);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2273;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(1);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2274;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(2);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2275;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"FechasPromet";
Debug.ShouldStop(4);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("FechasPrometidasCompra")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2276;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "fechasprometidascompras"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2279;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 2280;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query GestionVentas ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2281;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "fechasprometidascompras"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2282;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2287;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 2291;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2293;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(1048576);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2294;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 2297;BA.debugLine="CallSubDelayed3(Me,\"FechasPrometidasCompras_Compl";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("FechasPrometidasCompras_Completed")),(Object)((_accion)),(Object)((_lstregistros)));
 BA.debugLineNum = 2298;BA.debugLine="End Sub";
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
public static RemoteObject  _fechasprometidascomprasarticulotalla(RemoteObject __ref,RemoteObject _art,RemoteObject _talla) throws Exception{
try {
		Debug.PushSubsStack("FechasPrometidasComprasArticuloTalla (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3196);
if (RapidSub.canDelegate("fechasprometidascomprasarticulotalla")) { return __ref.runUserSub(false, "cgestionventas","fechasprometidascomprasarticulotalla", __ref, _art, _talla);}
ResumableSub_FechasPrometidasComprasArticuloTalla rsub = new ResumableSub_FechasPrometidasComprasArticuloTalla(null,__ref,_art,_talla);
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
public static class ResumableSub_FechasPrometidasComprasArticuloTalla extends BA.ResumableSub {
public ResumableSub_FechasPrometidasComprasArticuloTalla(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _art,RemoteObject _talla) {
this.parent = parent;
this.__ref = __ref;
this._art = _art;
this._talla = _talla;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _art;
RemoteObject _talla;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("FechasPrometidasComprasArticuloTalla (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3196);
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
Debug.locals.put("Art", _art);
Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 3197;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(268435456);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3198;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(536870912);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3199;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(1073741824);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 3201;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"FechasPromet";
Debug.ShouldStop(1);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("FechasPrometidasCompraArticuloTalla")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_art),(_talla)})),(Object)(__ref));
 BA.debugLineNum = 3202;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "fechasprometidascomprasarticulotalla"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 3205;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 3206;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(32);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query FechasPrometidasCompraArticuloTalla ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3207;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "fechasprometidascomprasarticulotalla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 3208;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(128);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3213;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 3214;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos de fecha prometidas para el artículo "),_art,RemoteObject.createImmutable(" talla "),_talla,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3215;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "fechasprometidascomprasarticulotalla"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 3216;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3218;BA.debugLine="lstReg=mresult.Get(\"lstRes\")";
Debug.ShouldStop(131072);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3219;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 3222;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2097152);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 3223;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 3224;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 3225;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 3226;BA.debugLine="Return mRes";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 3227;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cgestionventas","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 313;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 314;BA.debugLine="EventData.Consume";
Debug.ShouldStop(33554432);
_eventdata.runVoidMethod ("Consume");
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
public static void  _generarexcelprevisionsemanalventas(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GenerarExcelPrevisionSemanalVentas (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2453);
if (RapidSub.canDelegate("generarexcelprevisionsemanalventas")) { __ref.runUserSub(false, "cgestionventas","generarexcelprevisionsemanalventas", __ref); return;}
ResumableSub_GenerarExcelPrevisionSemanalVentas rsub = new ResumableSub_GenerarExcelPrevisionSemanalVentas(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GenerarExcelPrevisionSemanalVentas extends BA.ResumableSub {
public ResumableSub_GenerarExcelPrevisionSemanalVentas(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
RemoteObject _workbook = RemoteObject.declareNull("b4j.docU.xlworkbookwriter");
RemoteObject _sheet1 = RemoteObject.declareNull("b4j.docU.xlsheetwriter");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
RemoteObject _timezoneant = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _idxcolfechadisponibilidad = RemoteObject.createImmutable(0);
RemoteObject _idxcolfecharequerida = RemoteObject.createImmutable(0);
RemoteObject _idxcollineapedidoabierto = RemoteObject.createImmutable(0);
RemoteObject _numcolsrs = RemoteObject.createImmutable(0);
RemoteObject _headerstyle = RemoteObject.declareNull("b4j.docU.xlstyle");
int _idxcol = 0;
RemoteObject _columnwidth = null;
RemoteObject _cw = RemoteObject.createImmutable(0);
RemoteObject _fechasstyle = RemoteObject.declareNull("b4j.docU.xlstyle");
RemoteObject _rowstyles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _idxfila = RemoteObject.createImmutable(0);
RemoteObject _fechaprevventaslinea = RemoteObject.createImmutable(0L);
RemoteObject _fechaprevventasdocumento = RemoteObject.createImmutable(0L);
RemoteObject _aliascampo = RemoteObject.createImmutable("");
RemoteObject _ctv = RemoteObject.declareNull("b4j.docU.jamtableview._campoorigendatosjamtableview");
RemoteObject _ticks = RemoteObject.createImmutable(0L);
RemoteObject _tickshora0 = RemoteObject.createImmutable(0L);
RemoteObject _tickshora0fechaprevventaslinea = RemoteObject.createImmutable(0L);
RemoteObject _weekisofechaprevisionventas = RemoteObject.createImmutable(0);
RemoteObject _yearisoprevisionventas = RemoteObject.createImmutable(0);
RemoteObject _tickshora0fechaprevventasdocumento = RemoteObject.createImmutable(0L);
RemoteObject _lasttablerow1 = RemoteObject.createImmutable(0);
RemoteObject _ultimafila = RemoteObject.createImmutable(0);
RemoteObject _userdocfolder = RemoteObject.createImmutable("");
RemoteObject _fc = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _hora = RemoteObject.createImmutable(0);
RemoteObject _minutos = RemoteObject.createImmutable(0);
RemoteObject _segundos = RemoteObject.createImmutable(0);
RemoteObject _filename = RemoteObject.createImmutable("");
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
int step32;
int limit32;
int step47;
int limit47;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GenerarExcelPrevisionSemanalVentas (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2453);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2457;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Calcular P";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Calcular Previsión de Ventas?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2458;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 82;
return;
case 82:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 2459;BA.debugLine="CalcularFechas=Result=xui.DialogResponse_Positive";
Debug.ShouldStop(67108864);
__ref.setField ("_calcularfechas" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))));
 BA.debugLineNum = 2461;BA.debugLine="If CalcularFechas=False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_calcularfechas" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2462;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"En la última";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("En la última actualización de la tabla no se actualizó la Fecha de Disponibilidad."),RemoteObject.createImmutable(" Es necesario actualizar estas fechas para Generar Excel de Prevision Semanal Ventas."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2464;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 83;
return;
case 83:
//C
this.state = 4;
;
 BA.debugLineNum = 2465;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2491;BA.debugLine="Dim xl As XLUtils";
Debug.ShouldStop(67108864);
_xl = RemoteObject.createNew ("b4j.docU.xlutils");Debug.locals.put("xl", _xl);
 BA.debugLineNum = 2492;BA.debugLine="xl.Initialize";
Debug.ShouldStop(134217728);
_xl.runClassMethod (b4j.docU.xlutils.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2493;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
Debug.ShouldStop(268435456);
_workbook = _xl.runClassMethod (b4j.docU.xlutils.class, "_createwriterblank" /*RemoteObject*/ );Debug.locals.put("Workbook", _workbook);Debug.locals.put("Workbook", _workbook);
 BA.debugLineNum = 2494;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
Debug.ShouldStop(536870912);
_sheet1 = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createsheetwriterbyname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Datos")));Debug.locals.put("sheet1", _sheet1);Debug.locals.put("sheet1", _sheet1);
 BA.debugLineNum = 2503;BA.debugLine="If jamTableViewGestionVentas.NumeroTotalRegistros";
Debug.ShouldStop(64);
if (true) break;

case 5:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getnumerototalregistros" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getnumerototalregistrosfiltrados" /*RemoteObject*/ )))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 2504;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La tabla e";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La tabla está filtrada. El cálculo se realizará sobre los registros filtrados."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Continuar?"))),(Object)(BA.ObjectToString("Tabla filtrada")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2505;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 84;
return;
case 84:
//C
this.state = 8;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2506;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
Debug.ShouldStop(512);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
if (true) return ;
if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 2509;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(4096);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 2510;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
Debug.ShouldStop(8192);
_timeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 2511;BA.debugLine="Dim TimeZoneAnt As String=DateTime.TimeZoneOffset";
Debug.ShouldStop(16384);
_timezoneant = BA.NumberToString(parent.__c.getField(false,"DateTime").runMethod(true,"getTimeZoneOffset"));Debug.locals.put("TimeZoneAnt", _timezoneant);Debug.locals.put("TimeZoneAnt", _timezoneant);
 BA.debugLineNum = 2512;BA.debugLine="DateTime.DateFormat=\"dd-MM-yy\"";
Debug.ShouldStop(32768);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yy"));
 BA.debugLineNum = 2513;BA.debugLine="DateTime.TimeFormat=\"HH.mm.ss\"";
Debug.ShouldStop(65536);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH.mm.ss"));
 BA.debugLineNum = 2516;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadolabelsalirjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 2517;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 2518;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(F";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_habilitarjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 2520;BA.debugLine="Dim rs As ResultSet=jamTableViewGestionVentas.Get";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_gettableviewresultset" /*RemoteObject*/ );Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 2521;BA.debugLine="Dim idxColFechaDisponibilidad As Int";
Debug.ShouldStop(16777216);
_idxcolfechadisponibilidad = RemoteObject.createImmutable(0);Debug.locals.put("idxColFechaDisponibilidad", _idxcolfechadisponibilidad);
 BA.debugLineNum = 2522;BA.debugLine="Dim idxColFechaRequerida As Int";
Debug.ShouldStop(33554432);
_idxcolfecharequerida = RemoteObject.createImmutable(0);Debug.locals.put("idxColFechaRequerida", _idxcolfecharequerida);
 BA.debugLineNum = 2523;BA.debugLine="Dim idxColLineaPedidoAbierto As Int";
Debug.ShouldStop(67108864);
_idxcollineapedidoabierto = RemoteObject.createImmutable(0);Debug.locals.put("idxColLineaPedidoAbierto", _idxcollineapedidoabierto);
 BA.debugLineNum = 2524;BA.debugLine="Dim NumColsRs As Int=rs.ColumnCount";
Debug.ShouldStop(134217728);
_numcolsrs = _rs.runMethod(true,"getColumnCount");Debug.locals.put("NumColsRs", _numcolsrs);Debug.locals.put("NumColsRs", _numcolsrs);
 BA.debugLineNum = 2525;BA.debugLine="Dim HeaderStyle As XLStyle=Workbook.CreateStyle.F";
Debug.ShouldStop(268435456);
_headerstyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_fontcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(short.class, 12)),(Object)(BA.numberCast(int.class, _xl.getField(true,"_color_white" /*RemoteObject*/ )))).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_dark_teal" /*RemoteObject*/ )));Debug.locals.put("HeaderStyle", _headerstyle);Debug.locals.put("HeaderStyle", _headerstyle);
 BA.debugLineNum = 2527;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//for
this.state = 36;
step32 = 1;
limit32 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxcol = 0 ;
Debug.locals.put("idxCol", _idxcol);
this.state = 85;
if (true) break;

case 85:
//C
this.state = 36;
if ((step32 > 0 && _idxcol <= limit32) || (step32 < 0 && _idxcol >= limit32)) this.state = 17;
if (true) break;

case 86:
//C
this.state = 85;
_idxcol = ((int)(0 + _idxcol + step32)) ;
Debug.locals.put("idxCol", _idxcol);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 2528;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), rs.Ge";
Debug.ShouldStop(-2147483648);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(BA.numberCast(int.class, 0)))),(Object)(_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol))))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_headerstyle));
 BA.debugLineNum = 2529;BA.debugLine="If rs.GetColumnName(idxCol)=\"FechaDisponibilidad";
Debug.ShouldStop(1);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol))),BA.ObjectToString("FechaDisponibilidad"))) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_idxcolfechadisponibilidad = BA.numberCast(int.class, _idxcol);Debug.locals.put("idxColFechaDisponibilidad", _idxcolfechadisponibilidad);
if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 2530;BA.debugLine="If rs.GetColumnName(idxCol)=\"FechaRequerida\" The";
Debug.ShouldStop(2);
if (true) break;

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol))),BA.ObjectToString("FechaRequerida"))) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
_idxcolfecharequerida = BA.numberCast(int.class, _idxcol);Debug.locals.put("idxColFechaRequerida", _idxcolfecharequerida);
if (true) break;

case 29:
//C
this.state = 30;
;
 BA.debugLineNum = 2531;BA.debugLine="If rs.GetColumnName(idxCol)=\"PedidoAbierto\" Then";
Debug.ShouldStop(4);
if (true) break;

case 30:
//if
this.state = 35;
if (RemoteObject.solveBoolean("=",_rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol))),BA.ObjectToString("PedidoAbierto"))) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
_idxcollineapedidoabierto = BA.numberCast(int.class, _idxcol);Debug.locals.put("idxColLineaPedidoAbierto", _idxcollineapedidoabierto);
if (true) break;

case 35:
//C
this.state = 86;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
Debug.locals.put("idxCol", _idxcol);
;
 BA.debugLineNum = 2534;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0),\"Año-Se";
Debug.ShouldStop(32);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.createImmutable("Año-Semana Prev.Ventas Linea"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_headerstyle));
 BA.debugLineNum = 2536;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol+1,0),\"Año-";
Debug.ShouldStop(128);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_idxcol),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)))),(Object)(RemoteObject.createImmutable("Año-Semana Prev.Ventas Documento"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_headerstyle));
 BA.debugLineNum = 2538;BA.debugLine="Dim Columnwidth(idxCol+1),Cw As Int   ' variables";
Debug.ShouldStop(512);
_columnwidth = RemoteObject.createNewArray ("int", new int[] {RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_idxcol),RemoteObject.createImmutable(1)}, "+",1, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("Columnwidth", _columnwidth);
_cw = RemoteObject.createImmutable(0);Debug.locals.put("Cw", _cw);
 BA.debugLineNum = 2541;BA.debugLine="Dim FechasStyle As XLStyle = Workbook.CreateStyle";
Debug.ShouldStop(4096);
_fechasstyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_dataformat" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("dd\"/\"mm\"/\"yyyy"))));Debug.locals.put("FechasStyle", _fechasstyle);Debug.locals.put("FechasStyle", _fechasstyle);
 BA.debugLineNum = 2542;BA.debugLine="Dim RowStyles As List = Array(Workbook.CreateStyl";
Debug.ShouldStop(8192);
_rowstyles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_rowstyles = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_orange" /*RemoteObject*/ )))),(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_white" /*RemoteObject*/ ))))})));Debug.locals.put("RowStyles", _rowstyles);Debug.locals.put("RowStyles", _rowstyles);
 BA.debugLineNum = 2543;BA.debugLine="Dim idxFila As Int=1";
Debug.ShouldStop(16384);
_idxfila = BA.numberCast(int.class, 1);Debug.locals.put("idxFila", _idxfila);Debug.locals.put("idxFila", _idxfila);
 BA.debugLineNum = 2551;BA.debugLine="Dim FechaPrevVentasLinea As Long";
Debug.ShouldStop(4194304);
_fechaprevventaslinea = RemoteObject.createImmutable(0L);Debug.locals.put("FechaPrevVentasLinea", _fechaprevventaslinea);
 BA.debugLineNum = 2552;BA.debugLine="Dim FechaPrevVentasdocumento As Long";
Debug.ShouldStop(8388608);
_fechaprevventasdocumento = RemoteObject.createImmutable(0L);Debug.locals.put("FechaPrevVentasdocumento", _fechaprevventasdocumento);
 BA.debugLineNum = 2554;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(33554432);
if (true) break;

case 37:
//do while
this.state = 71;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 39;
if (true) break;
}
if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 2556;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
Debug.ShouldStop(134217728);
if (true) break;

case 40:
//for
this.state = 63;
step47 = 1;
limit47 = RemoteObject.solve(new RemoteObject[] {_rs.runMethod(true,"getColumnCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_idxcol = 0 ;
Debug.locals.put("idxCol", _idxcol);
this.state = 87;
if (true) break;

case 87:
//C
this.state = 63;
if ((step47 > 0 && _idxcol <= limit47) || (step47 < 0 && _idxcol >= limit47)) this.state = 42;
if (true) break;

case 88:
//C
this.state = 87;
_idxcol = ((int)(0 + _idxcol + step47)) ;
Debug.locals.put("idxCol", _idxcol);
if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 2557;BA.debugLine="Dim AliasCampo As String=rs.GetColumnName(idxCo";
Debug.ShouldStop(268435456);
_aliascampo = _rs.runMethod(true,"GetColumnName",(Object)(BA.numberCast(int.class, _idxcol)));Debug.locals.put("AliasCampo", _aliascampo);Debug.locals.put("AliasCampo", _aliascampo);
 BA.debugLineNum = 2558;BA.debugLine="Dim cTV As CampoOrigenDatosJamTableView=jamTabl";
Debug.ShouldStop(536870912);
_ctv = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getdatoscampoorigendatosjamtableviewaliascampo" /*RemoteObject*/ ,(Object)(_aliascampo));Debug.locals.put("cTV", _ctv);Debug.locals.put("cTV", _ctv);
 BA.debugLineNum = 2559;BA.debugLine="Select cTV.TipoDato";
Debug.ShouldStop(1073741824);
if (true) break;

case 43:
//select
this.state = 62;
switch (BA.switchObjectToInt(_ctv.getField(true,"TipoDato" /*RemoteObject*/ ),BA.ObjectToString("INTEGER"),BA.ObjectToString("REAL"),BA.ObjectToString("TEXT"))) {
case 0: {
this.state = 45;
if (true) break;
}
case 1: {
this.state = 47;
if (true) break;
}
case 2: {
this.state = 59;
if (true) break;
}
default: {
this.state = 61;
if (true) break;
}
}
if (true) break;

case 45:
//C
this.state = 62;
 BA.debugLineNum = 2562;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(2);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putnumber" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(BA.numberCast(double.class, _rs.runMethod(true,"GetInt",(Object)(_aliascampo)))));
 if (true) break;

case 47:
//C
this.state = 48;
 BA.debugLineNum = 2564;BA.debugLine="If cTV.EsFecha Then";
Debug.ShouldStop(8);
if (true) break;

case 48:
//if
this.state = 57;
if (_ctv.getField(true,"EsFecha" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 50;
}else {
this.state = 56;
}if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 2575;BA.debugLine="Dim ticks As Long = rs.GetLong(AliasCampo)";
Debug.ShouldStop(16384);
_ticks = _rs.runMethod(true,"GetLong",(Object)(_aliascampo));Debug.locals.put("ticks", _ticks);Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 2577;BA.debugLine="If ticks > 0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 51:
//if
this.state = 54;
if (RemoteObject.solveBoolean(">",_ticks,BA.numberCast(long.class, 0))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 2578;BA.debugLine="Dim TicksHora0 As Long=DateUtils.SetDate(Da";
Debug.ShouldStop(131072);
_tickshora0 = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_ticks))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_ticks))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_ticks))));Debug.locals.put("TicksHora0", _tickshora0);Debug.locals.put("TicksHora0", _tickshora0);
 BA.debugLineNum = 2580;BA.debugLine="sheet1.PutDate(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(524288);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putdate" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(_tickshora0)).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_fechasstyle));
 if (true) break;

case 54:
//C
this.state = 57;
;
 if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 2585;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFi";
Debug.ShouldStop(16777216);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putnumber" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(parent.__c.runMethod(true,"Round2",(Object)(_rs.runMethod(true,"GetDouble",(Object)(_aliascampo))),(Object)(BA.numberCast(int.class, 2)))));
 if (true) break;

case 57:
//C
this.state = 62;
;
 if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 2589;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(268435456);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(_rs.runMethod(true,"GetString",(Object)(_aliascampo))));
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 2592;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,idxFil";
Debug.ShouldStop(-2147483648);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _idxcol)),(Object)(_idxfila))),(Object)(_rs.runMethod(true,"GetString",(Object)(_aliascampo))));
 if (true) break;

case 62:
//C
this.state = 88;
;
 if (true) break;
if (true) break;

case 63:
//C
this.state = 64;
Debug.locals.put("idxCol", _idxcol);
;
 BA.debugLineNum = 2612;BA.debugLine="FechaPrevVentasLinea=rs.GetLong(\"FechaPrevVentas";
Debug.ShouldStop(524288);
_fechaprevventaslinea = _rs.runMethod(true,"GetLong",(Object)(RemoteObject.createImmutable("FechaPrevVentasLinea")));Debug.locals.put("FechaPrevVentasLinea", _fechaprevventaslinea);
 BA.debugLineNum = 2614;BA.debugLine="FechaPrevVentasdocumento=rs.GetLong(\"FechaPrevVe";
Debug.ShouldStop(2097152);
_fechaprevventasdocumento = _rs.runMethod(true,"GetLong",(Object)(RemoteObject.createImmutable("FechaPrevVentasdocumento")));Debug.locals.put("FechaPrevVentasdocumento", _fechaprevventasdocumento);
 BA.debugLineNum = 2617;BA.debugLine="If FechaPrevVentasLinea>0 Then";
Debug.ShouldStop(16777216);
if (true) break;

case 64:
//if
this.state = 67;
if (RemoteObject.solveBoolean(">",_fechaprevventaslinea,BA.numberCast(long.class, 0))) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
 BA.debugLineNum = 2618;BA.debugLine="Dim TicksHora0FechaPrevVentasLinea As Long=Date";
Debug.ShouldStop(33554432);
_tickshora0fechaprevventaslinea = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fechaprevventaslinea))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_fechaprevventaslinea))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_fechaprevventaslinea))));Debug.locals.put("TicksHora0FechaPrevVentasLinea", _tickshora0fechaprevventaslinea);Debug.locals.put("TicksHora0FechaPrevVentasLinea", _tickshora0fechaprevventaslinea);
 BA.debugLineNum = 2619;BA.debugLine="Cal.InitializeWith(TicksHora0FechaPrevVentasLin";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runVoidMethod ("InitializeWith",(Object)(_tickshora0fechaprevventaslinea));
 BA.debugLineNum = 2620;BA.debugLine="Cal.MinimalDaysInFirstWeek=4";
Debug.ShouldStop(134217728);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"setMinimalDaysInFirstWeek",BA.numberCast(int.class, 4));
 BA.debugLineNum = 2621;BA.debugLine="Cal.FirstDayOfWeek=Cal.MONDAY";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"setFirstDayOfWeek",__ref.getField(false,"_cal" /*RemoteObject*/ ).getField(true,"MONDAY"));
 BA.debugLineNum = 2622;BA.debugLine="Cal.toString";
Debug.ShouldStop(536870912);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runVoidMethod ("toString");
 BA.debugLineNum = 2623;BA.debugLine="Dim WeekISOFechaPrevisionVentas As Int= Cal.Get";
Debug.ShouldStop(1073741824);
_weekisofechaprevisionventas = __ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"Get",(Object)(__ref.getField(false,"_cal" /*RemoteObject*/ ).getField(true,"WEEK_OF_YEAR")));Debug.locals.put("WeekISOFechaPrevisionVentas", _weekisofechaprevisionventas);Debug.locals.put("WeekISOFechaPrevisionVentas", _weekisofechaprevisionventas);
 BA.debugLineNum = 2624;BA.debugLine="Dim YearISOPrevisionVentas As Int=Cal.WeekYear";
Debug.ShouldStop(-2147483648);
_yearisoprevisionventas = __ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"getWeekYear");Debug.locals.put("YearISOPrevisionVentas", _yearisoprevisionventas);Debug.locals.put("YearISOPrevisionVentas", _yearisoprevisionventas);
 BA.debugLineNum = 2625;BA.debugLine="sheet1.PutString(xl.AddressZero(NumColsRs,idxFi";
Debug.ShouldStop(1);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(_numcolsrs),(Object)(_idxfila))),(Object)(RemoteObject.concat(_yearisoprevisionventas,RemoteObject.createImmutable("-"),parent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _weekisofechaprevisionventas)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"False")))))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_fechasstyle));
 if (true) break;
;
 BA.debugLineNum = 2630;BA.debugLine="If FechaPrevVentasdocumento>0 Then";
Debug.ShouldStop(32);

case 67:
//if
this.state = 70;
if (RemoteObject.solveBoolean(">",_fechaprevventasdocumento,BA.numberCast(long.class, 0))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 BA.debugLineNum = 2631;BA.debugLine="Dim TicksHora0FechaPrevVentasDocumento As Long=";
Debug.ShouldStop(64);
_tickshora0fechaprevventasdocumento = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_fechaprevventasdocumento))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_fechaprevventasdocumento))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_fechaprevventasdocumento))));Debug.locals.put("TicksHora0FechaPrevVentasDocumento", _tickshora0fechaprevventasdocumento);Debug.locals.put("TicksHora0FechaPrevVentasDocumento", _tickshora0fechaprevventasdocumento);
 BA.debugLineNum = 2632;BA.debugLine="Cal.InitializeWith(TicksHora0FechaPrevVentasDoc";
Debug.ShouldStop(128);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runVoidMethod ("InitializeWith",(Object)(_tickshora0fechaprevventasdocumento));
 BA.debugLineNum = 2633;BA.debugLine="Cal.MinimalDaysInFirstWeek=4";
Debug.ShouldStop(256);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"setMinimalDaysInFirstWeek",BA.numberCast(int.class, 4));
 BA.debugLineNum = 2634;BA.debugLine="Cal.FirstDayOfWeek=Cal.MONDAY";
Debug.ShouldStop(512);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"setFirstDayOfWeek",__ref.getField(false,"_cal" /*RemoteObject*/ ).getField(true,"MONDAY"));
 BA.debugLineNum = 2635;BA.debugLine="Cal.toString";
Debug.ShouldStop(1024);
__ref.getField(false,"_cal" /*RemoteObject*/ ).runVoidMethod ("toString");
 BA.debugLineNum = 2636;BA.debugLine="Dim WeekISOFechaPrevisionVentas As Int= Cal.Get";
Debug.ShouldStop(2048);
_weekisofechaprevisionventas = __ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"Get",(Object)(__ref.getField(false,"_cal" /*RemoteObject*/ ).getField(true,"WEEK_OF_YEAR")));Debug.locals.put("WeekISOFechaPrevisionVentas", _weekisofechaprevisionventas);Debug.locals.put("WeekISOFechaPrevisionVentas", _weekisofechaprevisionventas);
 BA.debugLineNum = 2637;BA.debugLine="Dim YearISOPrevisionVentas As Int=Cal.WeekYear";
Debug.ShouldStop(4096);
_yearisoprevisionventas = __ref.getField(false,"_cal" /*RemoteObject*/ ).runMethod(true,"getWeekYear");Debug.locals.put("YearISOPrevisionVentas", _yearisoprevisionventas);Debug.locals.put("YearISOPrevisionVentas", _yearisoprevisionventas);
 BA.debugLineNum = 2638;BA.debugLine="sheet1.PutString(xl.AddressZero(NumColsRs+1,idx";
Debug.ShouldStop(8192);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_numcolsrs,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_idxfila))),(Object)(RemoteObject.concat(_yearisoprevisionventas,RemoteObject.createImmutable("-"),parent.__c.runMethod(true,"NumberFormat2",(Object)(BA.numberCast(double.class, _weekisofechaprevisionventas)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"False")))))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_fechasstyle));
 if (true) break;

case 70:
//C
this.state = 37;
;
 BA.debugLineNum = 2682;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTable";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Procesando Fila "),_idxfila)));
 BA.debugLineNum = 2683;BA.debugLine="Sleep(0)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"),BA.numberCast(int.class, 0));
this.state = 89;
return;
case 89:
//C
this.state = 37;
;
 BA.debugLineNum = 2684;BA.debugLine="idxFila=idxFila+1";
Debug.ShouldStop(134217728);
_idxfila = RemoteObject.solve(new RemoteObject[] {_idxfila,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("idxFila", _idxfila);
 if (true) break;

case 71:
//C
this.state = 72;
;
 BA.debugLineNum = 2688;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 2725;BA.debugLine="Dim LastTableRow1 As Int = sheet1.LastAccessed.Ro";
Debug.ShouldStop(16);
_lasttablerow1 = RemoteObject.solve(new RemoteObject[] {_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ ).getField(true,"Row0Based" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("LastTableRow1", _lasttablerow1);Debug.locals.put("LastTableRow1", _lasttablerow1);
 BA.debugLineNum = 2728;BA.debugLine="Dim UltimaFila As Int=idxFila";
Debug.ShouldStop(128);
_ultimafila = _idxfila;Debug.locals.put("UltimaFila", _ultimafila);Debug.locals.put("UltimaFila", _ultimafila);
 BA.debugLineNum = 2729;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTableV";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,RemoteObject.createImmutable(("Generando fichero excel...")));
 BA.debugLineNum = 2730;BA.debugLine="Sleep(0)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"),BA.numberCast(int.class, 0));
this.state = 90;
return;
case 90:
//C
this.state = 72;
;
 BA.debugLineNum = 2754;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZ";
Debug.ShouldStop(2);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_setautofilter" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_createxlrange" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addresszero" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_numcolsrs,RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_ultimafila))))));
 BA.debugLineNum = 2779;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 2780;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadolabelsalirjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 2781;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(T";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_habilitarjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 2783;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTableV";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,RemoteObject.createImmutable(("")));
 BA.debugLineNum = 2787;BA.debugLine="Dim UserDocFolder As String=jamTableViewGestionVe";
Debug.ShouldStop(4);
_userdocfolder = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_finduserdocumentsfolder" /*RemoteObject*/ );Debug.locals.put("UserDocFolder", _userdocfolder);Debug.locals.put("UserDocFolder", _userdocfolder);
 BA.debugLineNum = 2788;BA.debugLine="Dim fc As FileChooser";
Debug.ShouldStop(8);
_fc = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fc", _fc);
 BA.debugLineNum = 2789;BA.debugLine="fc.Initialize";
Debug.ShouldStop(16);
_fc.runVoidMethod ("Initialize");
 BA.debugLineNum = 2790;BA.debugLine="fc.Title=\"Exportación Excel\"";
Debug.ShouldStop(32);
_fc.runMethod(true,"setTitle",BA.ObjectToString("Exportación Excel"));
 BA.debugLineNum = 2791;BA.debugLine="fc.SetExtensionFilter(\"Ficheros Excel\", Array As";
Debug.ShouldStop(64);
_fc.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros Excel")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("*.xlsx"),BA.ObjectToString("*.xlsm"),RemoteObject.createImmutable("*.xls")})))));
 BA.debugLineNum = 2792;BA.debugLine="Dim Hora As Int=DateTime.GetHour(DateTime.Now)";
Debug.ShouldStop(128);
_hora = parent.__c.getField(false,"DateTime").runMethod(true,"GetHour",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Hora", _hora);Debug.locals.put("Hora", _hora);
 BA.debugLineNum = 2793;BA.debugLine="Dim Minutos As Int=DateTime.GetMinute(DateTime.No";
Debug.ShouldStop(256);
_minutos = parent.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Minutos", _minutos);Debug.locals.put("Minutos", _minutos);
 BA.debugLineNum = 2794;BA.debugLine="Dim Segundos As Int=DateTime.GetMinute(DateTime.N";
Debug.ShouldStop(512);
_segundos = parent.__c.getField(false,"DateTime").runMethod(true,"GetMinute",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("Segundos", _segundos);Debug.locals.put("Segundos", _segundos);
 BA.debugLineNum = 2795;BA.debugLine="fc.InitialFileName= \"Prevision Semanal Ventas \" &";
Debug.ShouldStop(1024);
_fc.runMethod(true,"setInitialFileName",RemoteObject.concat(RemoteObject.createImmutable("Prevision Semanal Ventas "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))),RemoteObject.createImmutable(" "),_hora,RemoteObject.createImmutable("h"),_minutos,RemoteObject.createImmutable("m"),_segundos,RemoteObject.createImmutable("s"),RemoteObject.createImmutable(".xlsx")));
 BA.debugLineNum = 2796;BA.debugLine="fc.InitialDirectory=UserDocFolder";
Debug.ShouldStop(2048);
_fc.runMethod(true,"setInitialDirectory",_userdocfolder);
 BA.debugLineNum = 2797;BA.debugLine="Dim fileName As String = fc.ShowSave(frm)";
Debug.ShouldStop(4096);
_filename = _fc.runMethodAndSync(true,"ShowSave",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("fileName", _filename);Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 2798;BA.debugLine="If fileName=\"\" Then Return";
Debug.ShouldStop(8192);
if (true) break;

case 72:
//if
this.state = 77;
if (RemoteObject.solveBoolean("=",_filename,BA.ObjectToString(""))) { 
this.state = 74;
;}if (true) break;

case 74:
//C
this.state = 77;
if (true) return ;
if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 2800;BA.debugLine="Dim f As String = Workbook.SaveAs(File.GetFilePar";
Debug.ShouldStop(32768);
_f = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_saveas" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_filename))),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_filename))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 2801;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(65536);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 2802;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
Debug.ShouldStop(131072);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
 BA.debugLineNum = 2803;BA.debugLine="Wait For (xl.OpenExcel(f)) Complete (Success As B";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _xl.runClassMethod (b4j.docU.xlutils.class, "_openexcel" /*RemoteObject*/ ,(Object)(_f)));
this.state = 91;
return;
case 91:
//C
this.state = 78;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2804;BA.debugLine="If Success=False Then";
Debug.ShouldStop(524288);
if (true) break;

case 78:
//if
this.state = 81;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 2805;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible abrir el fichero excel "),_f)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2806;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 92;
return;
case 92:
//C
this.state = 81;
;
 BA.debugLineNum = 2807;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return ;
 if (true) break;

case 81:
//C
this.state = -1;
;
 BA.debugLineNum = 2810;BA.debugLine="End Sub";
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
public static RemoteObject  _generatestring(RemoteObject __ref,RemoteObject _table,RemoteObject _separatorchar) throws Exception{
try {
		Debug.PushSubsStack("GenerateString (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3585);
if (RapidSub.canDelegate("generatestring")) { return __ref.runUserSub(false, "cgestionventas","generatestring", __ref, _table, _separatorchar);}
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _row = null;
int _i = 0;
RemoteObject _wrap = RemoteObject.createImmutable(false);
RemoteObject _word = RemoteObject.createImmutable("");
Debug.locals.put("Table", _table);
Debug.locals.put("SeparatorChar", _separatorchar);
 BA.debugLineNum = 3585;BA.debugLine="Sub GenerateString (Table As List, SeparatorChar A";
Debug.ShouldStop(1);
 BA.debugLineNum = 3586;BA.debugLine="Dim eol As String = Chr(10)";
Debug.ShouldStop(2);
_eol = BA.ObjectToString(cgestionventas.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 3587;BA.debugLine="If Table.Size = 0 Then Return \"\"";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_table.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 3588;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(8);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 3589;BA.debugLine="sb.Initialize";
Debug.ShouldStop(16);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 3590;BA.debugLine="For Each row() As String In Table";
Debug.ShouldStop(32);
{
final RemoteObject group5 = _table;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (group5.runMethod(false,"Get",index5));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 3591;BA.debugLine="For i = 0 To row.Length - 1";
Debug.ShouldStop(64);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 3592;BA.debugLine="Dim Wrap As Boolean";
Debug.ShouldStop(128);
_wrap = RemoteObject.createImmutable(false);Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 3593;BA.debugLine="Dim word As String = row(i)";
Debug.ShouldStop(256);
_word = _row.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("word", _word);Debug.locals.put("word", _word);
 BA.debugLineNum = 3594;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
Debug.ShouldStop(512);
if (_word.runMethod(true,"contains",(Object)(_separatorchar)).<Boolean>get().booleanValue()) { 
_wrap = cgestionventas.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);};
 BA.debugLineNum = 3595;BA.debugLine="If word.Contains(QUOTE) Then";
Debug.ShouldStop(1024);
if (_word.runMethod(true,"contains",(Object)(cgestionventas.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3596;BA.debugLine="Wrap = True";
Debug.ShouldStop(2048);
_wrap = cgestionventas.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 3597;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
Debug.ShouldStop(4096);
_word = _word.runMethod(true,"replace",(Object)(cgestionventas.__c.getField(true,"QUOTE")),(Object)((RemoteObject.createImmutable("\"\""))));Debug.locals.put("word", _word);
 };
 BA.debugLineNum = 3599;BA.debugLine="If Wrap Then";
Debug.ShouldStop(16384);
if (_wrap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3600;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(cgestionventas.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(cgestionventas.__c.getField(true,"QUOTE")));
 }else {
 BA.debugLineNum = 3602;BA.debugLine="sb.Append(word)";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(_word));
 };
 BA.debugLineNum = 3604;BA.debugLine="sb.Append(SeparatorChar)";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(_separatorchar));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 3606;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 3607;BA.debugLine="sb.Append(eol)";
Debug.ShouldStop(4194304);
_sb.runVoidMethod ("Append",(Object)(_eol));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 3609;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
Debug.ShouldStop(16777216);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_eol.runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 3610;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(33554432);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 3611;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("HTMLBodyEmail (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3866);
if (RapidSub.canDelegate("htmlbodyemail")) { return __ref.runUserSub(false, "cgestionventas","htmlbodyemail", __ref);}
RemoteObject _strbodyhtml = RemoteObject.createImmutable("");
 BA.debugLineNum = 3866;BA.debugLine="Sub HTMLBodyEmail As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 3867;BA.debugLine="Dim strBodyHTML As String";
Debug.ShouldStop(67108864);
_strbodyhtml = RemoteObject.createImmutable("");Debug.locals.put("strBodyHTML", _strbodyhtml);
 BA.debugLineNum = 3868;BA.debugLine="strBodyHTML = $\"<p>Buenos días<br><br> Adjunto el";
Debug.ShouldStop(134217728);
_strbodyhtml = (RemoteObject.concat(RemoteObject.createImmutable("<p>Buenos días<br><br>\n"),RemoteObject.createImmutable("Adjunto el albarán en pdf y el archivo csv para que procedáis a la preparación de la mercancía y su envío a la mayor brevedad posible.<br>\n"),RemoteObject.createImmutable("En caso de alguna incidencia por favor indicádnoslo.<br>\n"),RemoteObject.createImmutable("<br>Muchas gracias")));Debug.locals.put("strBodyHTML", _strbodyhtml);
 BA.debugLineNum = 3872;BA.debugLine="Return strBodyHTML";
Debug.ShouldStop(-2147483648);
if (true) return _strbodyhtml;
 BA.debugLineNum = 3873;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("Inicio (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("inicio")) { return __ref.runUserSub(false, "cgestionventas","inicio", __ref);}
 BA.debugLineNum = 343;BA.debugLine="Sub Inicio";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="frm.Show";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 345;BA.debugLine="Utilidades.SetFormMaximized(frm)";
Debug.ShouldStop(16777216);
cgestionventas._utilidades.runVoidMethod ("_setformmaximized" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));
 BA.debugLineNum = 346;BA.debugLine="ResfreshDatosGestionVentas";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_resfreshdatosgestionventas" /*void*/ );
 BA.debugLineNum = 347;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Initialize (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cgestionventas","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableviewgestionventas_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewGestionVentas_AccionSalirJamTableView (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3123);
if (RapidSub.canDelegate("jamtableviewgestionventas_accionsalirjamtableview")) { return __ref.runUserSub(false, "cgestionventas","jamtableviewgestionventas_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 3123;BA.debugLine="Sub jamTableViewGestionVentas_AccionSalirJamTableV";
Debug.ShouldStop(262144);
 BA.debugLineNum = 3124;BA.debugLine="jamTableViewGestionVentas.GuardarConfiguracionCol";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 3127;BA.debugLine="jamTableViewGestionVentas.LimpiarTabla";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 3128;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(8388608);
cgestionventas._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 3129;BA.debugLine="frm.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 3131;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableviewgestionventas_cambioenfilaseleccionada(RemoteObject __ref,RemoteObject _lstdatosfilaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewGestionVentas_CambioEnFilaSeleccionada (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3132);
if (RapidSub.canDelegate("jamtableviewgestionventas_cambioenfilaseleccionada")) { return __ref.runUserSub(false, "cgestionventas","jamtableviewgestionventas_cambioenfilaseleccionada", __ref, _lstdatosfilaseleccionada);}
RemoteObject _stexto = RemoteObject.createImmutable("");
RemoteObject _doc = RemoteObject.createImmutable("");
RemoteObject _linea = RemoteObject.createImmutable(0);
RemoteObject _cliente = RemoteObject.createImmutable("");
RemoteObject _nombrecliente = RemoteObject.createImmutable("");
RemoteObject _tipoartcomprafab = RemoteObject.createImmutable("");
RemoteObject _dc = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
Debug.locals.put("lstDatosFilaSeleccionada", _lstdatosfilaseleccionada);
 BA.debugLineNum = 3132;BA.debugLine="Sub jamTableViewGestionVentas_CambioEnFilaSeleccio";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 3133;BA.debugLine="Dim STexto As String";
Debug.ShouldStop(268435456);
_stexto = RemoteObject.createImmutable("");Debug.locals.put("STexto", _stexto);
 BA.debugLineNum = 3134;BA.debugLine="Dim Doc As String";
Debug.ShouldStop(536870912);
_doc = RemoteObject.createImmutable("");Debug.locals.put("Doc", _doc);
 BA.debugLineNum = 3135;BA.debugLine="Dim Linea As Int";
Debug.ShouldStop(1073741824);
_linea = RemoteObject.createImmutable(0);Debug.locals.put("Linea", _linea);
 BA.debugLineNum = 3136;BA.debugLine="Dim Cliente As String";
Debug.ShouldStop(-2147483648);
_cliente = RemoteObject.createImmutable("");Debug.locals.put("Cliente", _cliente);
 BA.debugLineNum = 3137;BA.debugLine="Dim NombreCliente As String";
Debug.ShouldStop(1);
_nombrecliente = RemoteObject.createImmutable("");Debug.locals.put("NombreCliente", _nombrecliente);
 BA.debugLineNum = 3138;BA.debugLine="Dim TipoArtCompraFab As String";
Debug.ShouldStop(2);
_tipoartcomprafab = RemoteObject.createImmutable("");Debug.locals.put("TipoArtCompraFab", _tipoartcomprafab);
 BA.debugLineNum = 3139;BA.debugLine="For Each dC As DatosCampoRegistroJamTableView In";
Debug.ShouldStop(4);
{
final RemoteObject group7 = _lstdatosfilaseleccionada;
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_dc = (group7.runMethod(false,"Get",index7));Debug.locals.put("dC", _dc);
Debug.locals.put("dC", _dc);
 BA.debugLineNum = 3140;BA.debugLine="If dC.AliasCampo=\"Documento\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_dc.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("Documento"))) { 
 BA.debugLineNum = 3141;BA.debugLine="Doc=dC.ValorCampo";
Debug.ShouldStop(16);
_doc = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("Doc", _doc);
 };
 BA.debugLineNum = 3143;BA.debugLine="If dC.AliasCampo=\"Linea\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_dc.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("Linea"))) { 
 BA.debugLineNum = 3144;BA.debugLine="Linea=dC.ValorCampo";
Debug.ShouldStop(128);
_linea = BA.numberCast(int.class, _dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("Linea", _linea);
 };
 BA.debugLineNum = 3146;BA.debugLine="If dC.AliasCampo=\"Cliente\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_dc.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("Cliente"))) { 
 BA.debugLineNum = 3147;BA.debugLine="Cliente=dC.ValorCampo";
Debug.ShouldStop(1024);
_cliente = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("Cliente", _cliente);
 };
 BA.debugLineNum = 3149;BA.debugLine="If dC.AliasCampo=\"NombreCliente\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_dc.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("NombreCliente"))) { 
 BA.debugLineNum = 3150;BA.debugLine="NombreCliente=dC.ValorCampo";
Debug.ShouldStop(8192);
_nombrecliente = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("NombreCliente", _nombrecliente);
 };
 BA.debugLineNum = 3152;BA.debugLine="If dC.AliasCampo=\"Fabricacion\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_dc.getField(true,"AliasCampo" /*RemoteObject*/ ),BA.ObjectToString("Fabricacion"))) { 
 BA.debugLineNum = 3153;BA.debugLine="If 0=dC.ValorCampo Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(0),BA.numberCast(double.class, _dc.getField(false,"ValorCampo" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 3154;BA.debugLine="TipoArtCompraFab=\"Compra\"";
Debug.ShouldStop(131072);
_tipoartcomprafab = BA.ObjectToString("Compra");Debug.locals.put("TipoArtCompraFab", _tipoartcomprafab);
 }else {
 BA.debugLineNum = 3156;BA.debugLine="TipoArtCompraFab=\"Fabricación\"";
Debug.ShouldStop(524288);
_tipoartcomprafab = BA.ObjectToString("Fabricación");Debug.locals.put("TipoArtCompraFab", _tipoartcomprafab);
 };
 };
 }
}Debug.locals.put("dC", _dc);
;
 BA.debugLineNum = 3162;BA.debugLine="STexto=\"Documento: \" & Doc & \" Línea: \" & Linea &";
Debug.ShouldStop(33554432);
_stexto = RemoteObject.concat(RemoteObject.createImmutable("Documento: "),_doc,RemoteObject.createImmutable(" Línea: "),_linea,RemoteObject.createImmutable(" Cliente: "),_cliente,RemoteObject.createImmutable(" "),_nombrecliente,RemoteObject.createImmutable(" Tipo Art: "),_tipoartcomprafab);Debug.locals.put("STexto", _stexto);
 BA.debugLineNum = 3163;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTableV";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(_stexto));
 BA.debugLineNum = 3164;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableviewgestionventas_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewGestionVentas_ContextMenuItem_Action (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2812);
if (RapidSub.canDelegate("jamtableviewgestionventas_contextmenuitem_action")) { __ref.runUserSub(false, "cgestionventas","jamtableviewgestionventas_contextmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _tagmenuitem;
RemoteObject _pedidosel = RemoteObject.createImmutable("");
RemoteObject _filaseleccionada = RemoteObject.createImmutable(0);
RemoteObject _pobj = RemoteObject.declareNull("Object");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _articulosel = RemoteObject.createImmutable("");
RemoteObject _lstinfofila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dc = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
RemoteObject _tallasel = RemoteObject.createImmutable("");
RemoteObject _sistrepoarticulosel = RemoteObject.createImmutable(0);
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _mf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _docfp = RemoteObject.createImmutable("");
RemoteObject _qtypterecfp = RemoteObject.createImmutable(0);
RemoteObject _sqtypterecfp = RemoteObject.createImmutable("");
RemoteObject _fechapromfp = RemoteObject.createImmutable(0L);
RemoteObject _b4xlongmsg = RemoteObject.declareNull("b4j.docU.b4xlongtexttemplate");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _clientesel = RemoteObject.createImmutable("");
RemoteObject _grpsel = RemoteObject.createImmutable("");
RemoteObject _lstalbaranespedido = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataalb = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _salb = RemoteObject.createImmutable("");
RemoteObject _b4xlistdlg = RemoteObject.declareNull("b4j.docU.b4xlisttemplate");
RemoteObject _textsize = RemoteObject.createImmutable(0f);
RemoteObject _xclv = RemoteObject.declareNull("b4j.example.customlistview");
RemoteObject _dlbl = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _sdocumentosel = RemoteObject.createImmutable("");
RemoteObject _malbaransel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _albaransel = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group28;
int index28;
int groupLen28;
RemoteObject group67;
int index67;
int groupLen67;
RemoteObject group124;
int index124;
int groupLen124;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewGestionVentas_ContextMenuItem_Action (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2812);
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
 BA.debugLineNum = 2813;BA.debugLine="Select TagMenuItem";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//select
this.state = 108;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("VerPedidoNAV"),BA.ObjectToString("VerArticuloNAV"),BA.ObjectToString("VerFechasPrometidasCompraArticuloNAV"),BA.ObjectToString("EnviarEmailAlbaranTransnaturREPSOL"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
case 3: {
this.state = 67;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2817;BA.debugLine="Dim PedidoSel As String";
Debug.ShouldStop(1);
_pedidosel = RemoteObject.createImmutable("");Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 2818;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
Debug.ShouldStop(2);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 2826;BA.debugLine="Dim pObj As Object=jamTableViewGestionVentas.Ge";
Debug.ShouldStop(512);
_pobj = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Documento")));Debug.locals.put("pObj", _pobj);Debug.locals.put("pObj", _pobj);
 BA.debugLineNum = 2827;BA.debugLine="PedidoSel=jamTableViewGestionVentas.FixNull(pOb";
Debug.ShouldStop(1024);
_pedidosel = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_fixnull" /*RemoteObject*/ ,(Object)(_pobj));Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 2828;BA.debugLine="If PedidoSel=\"\" Then";
Debug.ShouldStop(2048);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_pedidosel,BA.ObjectToString(""))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 2829;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Documento.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2830;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 109;
return;
case 109:
//C
this.state = 7;
;
 BA.debugLineNum = 2831;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 2870;BA.debugLine="Select True";
Debug.ShouldStop(2097152);

case 7:
//select
this.state = 14;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),_pedidosel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("PV"))),_pedidosel.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("PT"))))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
default: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 14;
 BA.debugLineNum = 2872;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.Abri";
Debug.ShouldStop(8388608);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Pedido venta")),(Object)(BA.numberCast(int.class, 42)),(Object)(BA.ObjectToString("No.")),(Object)(_pedidosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 2874;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.Abri";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Pedido venta")),(Object)(BA.numberCast(int.class, 5740)),(Object)(BA.ObjectToString("No.")),(Object)(_pedidosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2876;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 2878;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 110;
return;
case 110:
//C
this.state = 15;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 2879;BA.debugLine="If success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 15:
//if
this.state = 20;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = 108;
;
 if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 2886;BA.debugLine="Dim ArticuloSel As String";
Debug.ShouldStop(32);
_articulosel = RemoteObject.createImmutable("");Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 2887;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
Debug.ShouldStop(64);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 2888;BA.debugLine="Dim lstInfoFila As List=jamTableViewGestionVent";
Debug.ShouldStop(128);
_lstinfofila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstinfofila = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datosregistroindicefila" /*RemoteObject*/ ,(Object)(_filaseleccionada));Debug.locals.put("lstInfoFila", _lstinfofila);Debug.locals.put("lstInfoFila", _lstinfofila);
 BA.debugLineNum = 2889;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
Debug.ShouldStop(256);
if (true) break;

case 23:
//for
this.state = 30;
group28 = _lstinfofila;
index28 = 0;
groupLen28 = group28.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dc", _dc);
this.state = 111;
if (true) break;

case 111:
//C
this.state = 30;
if (index28 < groupLen28) {
this.state = 25;
_dc = (group28.runMethod(false,"Get",index28));Debug.locals.put("dc", _dc);}
if (true) break;

case 112:
//C
this.state = 111;
index28++;
Debug.locals.put("dc", _dc);
if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 2890;BA.debugLine="If dc.Campo=\"Articulo\" Then";
Debug.ShouldStop(512);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_dc.getField(true,"Campo" /*RemoteObject*/ ),BA.ObjectToString("Articulo"))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 2891;BA.debugLine="ArticuloSel=dc.ValorCampo";
Debug.ShouldStop(1024);
_articulosel = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 2892;BA.debugLine="Exit";
Debug.ShouldStop(2048);
this.state = 30;
if (true) break;
 if (true) break;

case 29:
//C
this.state = 112;
;
 if (true) break;
if (true) break;
Debug.locals.put("dc", _dc);
;
 BA.debugLineNum = 2895;BA.debugLine="If ArticuloSel=\"\" Then";
Debug.ShouldStop(16384);

case 30:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",_articulosel,BA.ObjectToString(""))) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 2896;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Artículo.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2897;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 113;
return;
case 113:
//C
this.state = 33;
;
 BA.debugLineNum = 2898;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 33:
//C
this.state = 34;
;
 BA.debugLineNum = 2900;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(524288);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha producto")),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.ObjectToString("No.")),(Object)(_articulosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2901;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 114;
return;
case 114:
//C
this.state = 34;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 2902;BA.debugLine="If success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 34:
//if
this.state = 39;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 if (true) break;

case 38:
//C
this.state = 39;
 if (true) break;

case 39:
//C
this.state = 108;
;
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 2909;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
Debug.ShouldStop(268435456);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 2917;BA.debugLine="Dim ArticuloSel As String=jamTableViewGestionVe";
Debug.ShouldStop(16);
_articulosel = BA.ObjectToString(__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("ArticuloSel", _articulosel);Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 2918;BA.debugLine="If ArticuloSel=\"\" Then";
Debug.ShouldStop(32);
if (true) break;

case 42:
//if
this.state = 45;
if (RemoteObject.solveBoolean("=",_articulosel,BA.ObjectToString(""))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 2919;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Artículo.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2920;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 115;
return;
case 115:
//C
this.state = 45;
;
 BA.debugLineNum = 2921;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
;
 BA.debugLineNum = 2924;BA.debugLine="Dim TallaSel As String=jamTableViewGestionVenta";
Debug.ShouldStop(2048);
_tallasel = BA.ObjectToString(__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("TallaSel", _tallasel);Debug.locals.put("TallaSel", _tallasel);
 BA.debugLineNum = 2925;BA.debugLine="Dim SistRepoArticuloSel As Int=jamTableViewGest";
Debug.ShouldStop(4096);
_sistrepoarticulosel = BA.numberCast(int.class, __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Fabricacion"))));Debug.locals.put("SistRepoArticuloSel", _sistrepoarticulosel);Debug.locals.put("SistRepoArticuloSel", _sistrepoarticulosel);
 BA.debugLineNum = 2934;BA.debugLine="If SistRepoArticuloSel=1 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 46:
//if
this.state = 49;
if (RemoteObject.solveBoolean("=",_sistrepoarticulosel,BA.numberCast(double.class, 1))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 2935;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El artículo";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("El artículo "),_articulosel,RemoteObject.createImmutable(" tiene sistema reposición Fabricación. No está disponible la información de fechas prometidas."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2936;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 116;
return;
case 116:
//C
this.state = 49;
;
 BA.debugLineNum = 2937;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 50;
;
 BA.debugLineNum = 2940;BA.debugLine="Wait For(FechasPrometidasComprasArticuloTalla(A";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_fechasprometidascomprasarticulotalla" /*RemoteObject*/ ,(Object)(_articulosel),(Object)(_tallasel)));
this.state = 117;
return;
case 117:
//C
this.state = 50;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 2941;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(268435456);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2942;BA.debugLine="If Accion<>\"Continuar\" Then Return";
Debug.ShouldStop(536870912);
if (true) break;

case 50:
//if
this.state = 55;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("Continuar"))) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
if (true) return ;
if (true) break;

case 55:
//C
this.state = 56;
;
 BA.debugLineNum = 2943;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 2944;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(-2147483648);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 2945;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
Debug.ShouldStop(1);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 2946;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(2);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 2947;BA.debugLine="sb.Initialize";
Debug.ShouldStop(4);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 2948;BA.debugLine="For Each mF As Map In lstReg";
Debug.ShouldStop(8);
if (true) break;

case 56:
//for
this.state = 65;
_mf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group67 = _lstreg;
index67 = 0;
groupLen67 = group67.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mF", _mf);
this.state = 118;
if (true) break;

case 118:
//C
this.state = 65;
if (index67 < groupLen67) {
this.state = 58;
_mf = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group67.runMethod(false,"Get",index67));Debug.locals.put("mF", _mf);}
if (true) break;

case 119:
//C
this.state = 118;
index67++;
Debug.locals.put("mF", _mf);
if (true) break;

case 58:
//C
this.state = 59;
 BA.debugLineNum = 2949;BA.debugLine="Dim DocFP As String=mF.Get(\"Documento\")";
Debug.ShouldStop(16);
_docfp = BA.ObjectToString(_mf.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("DocFP", _docfp);Debug.locals.put("DocFP", _docfp);
 BA.debugLineNum = 2950;BA.debugLine="Dim QtyPteRecFP As Double=mF.Get(\"QtyPteRecibi";
Debug.ShouldStop(32);
_qtypterecfp = BA.numberCast(double.class, _mf.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("QtyPteRecibir")))));Debug.locals.put("QtyPteRecFP", _qtypterecfp);Debug.locals.put("QtyPteRecFP", _qtypterecfp);
 BA.debugLineNum = 2951;BA.debugLine="Dim SQtyPteRecFP As String=NumberFormat2(QtyPt";
Debug.ShouldStop(64);
_sqtypterecfp = parent.__c.runMethod(true,"NumberFormat2",(Object)(_qtypterecfp),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"False")));Debug.locals.put("SQtyPteRecFP", _sqtypterecfp);Debug.locals.put("SQtyPteRecFP", _sqtypterecfp);
 BA.debugLineNum = 2953;BA.debugLine="Dim FechaPromFP As Long=mF.Get(\"FechaProm\")";
Debug.ShouldStop(256);
_fechapromfp = BA.numberCast(long.class, _mf.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaProm")))));Debug.locals.put("FechaPromFP", _fechapromfp);Debug.locals.put("FechaPromFP", _fechapromfp);
 BA.debugLineNum = 2954;BA.debugLine="sb.Append(\"Pedido: \" & DocFP & \"   Qty Pte: \"";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Pedido: "),_docfp,RemoteObject.createImmutable("   Qty Pte: "),_sqtypterecfp)));
 BA.debugLineNum = 2956;BA.debugLine="If FechaPromFP<DateUtils.SetDate(DateTime.GetY";
Debug.ShouldStop(2048);
if (true) break;

case 59:
//if
this.state = 64;
if (RemoteObject.solveBoolean("<",_fechapromfp,parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))))))) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
 BA.debugLineNum = 2957;BA.debugLine="sb.Append(\"   Fecha Prom: \" & DateTime.Date(F";
Debug.ShouldStop(4096);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("   Fecha Prom: "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechapromfp))))).runMethod(false,"Append",(Object)(RemoteObject.createImmutable("  (VENCIDA)"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;

case 63:
//C
this.state = 64;
 BA.debugLineNum = 2959;BA.debugLine="sb.Append(\"   Fecha Prom: \" & DateTime.Date(F";
Debug.ShouldStop(16384);
_sb.runMethod(false,"Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("   Fecha Prom: "),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fechapromfp))))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 if (true) break;

case 64:
//C
this.state = 119;
;
 if (true) break;
if (true) break;

case 65:
//C
this.state = 108;
Debug.locals.put("mF", _mf);
;
 BA.debugLineNum = 2964;BA.debugLine="Dialog.Title=\"Fechas Prometidas Compra\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Fechas Prometidas Compra")));
 BA.debugLineNum = 2965;BA.debugLine="Dim B4XLongMsg As B4XLongTextTemplate";
Debug.ShouldStop(1048576);
_b4xlongmsg = RemoteObject.createNew ("b4j.docU.b4xlongtexttemplate");Debug.locals.put("B4XLongMsg", _b4xlongmsg);
 BA.debugLineNum = 2966;BA.debugLine="B4XLongMsg.Initialize";
Debug.ShouldStop(2097152);
_b4xlongmsg.runClassMethod (b4j.docU.b4xlongtexttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2967;BA.debugLine="B4XLongMsg.Resize(700dip,300dip)";
Debug.ShouldStop(4194304);
_b4xlongmsg.runClassMethod (b4j.docU.b4xlongtexttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 700)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 2968;BA.debugLine="B4XLongMsg.Text=sb.ToString";
Debug.ShouldStop(8388608);
_b4xlongmsg.setField ("_text" /*RemoteObject*/ ,(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 2969;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4";
Debug.ShouldStop(16777216);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlongmsg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 2971;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 120;
return;
case 120:
//C
this.state = 108;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 2973;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 2976;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Comproband";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Comprobando permisos...")));
 BA.debugLineNum = 2977;BA.debugLine="JamLoadingIndicator1.show";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 2978;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cRepsol"))));
this.state = 121;
return;
case 121:
//C
this.state = 68;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 2979;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2980;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(8);
if (true) break;

case 68:
//if
this.state = 73;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
this.state = 70;
;}if (true) break;

case 70:
//C
this.state = 73;
if (true) return ;
if (true) break;

case 73:
//C
this.state = 74;
;
 BA.debugLineNum = 2983;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
Debug.ShouldStop(64);
_filaseleccionada = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindicefilaseleccionada" /*RemoteObject*/ );Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 2984;BA.debugLine="Dim PedidoSel As String";
Debug.ShouldStop(128);
_pedidosel = RemoteObject.createImmutable("");Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 2992;BA.debugLine="Dim PedidoSel As String=jamTableViewGestionVent";
Debug.ShouldStop(32768);
_pedidosel = BA.ObjectToString(__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Documento"))));Debug.locals.put("PedidoSel", _pedidosel);Debug.locals.put("PedidoSel", _pedidosel);
 BA.debugLineNum = 2993;BA.debugLine="Dim ClienteSel As String=jamTableViewGestionVen";
Debug.ShouldStop(65536);
_clientesel = BA.ObjectToString(__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Cliente"))));Debug.locals.put("ClienteSel", _clientesel);Debug.locals.put("ClienteSel", _clientesel);
 BA.debugLineNum = 2994;BA.debugLine="Dim GRPSel As String=jamTableViewGestionVentas.";
Debug.ShouldStop(131072);
_grpsel = BA.ObjectToString(__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("GRP"))));Debug.locals.put("GRPSel", _grpsel);Debug.locals.put("GRPSel", _grpsel);
 BA.debugLineNum = 2996;BA.debugLine="If GRPSel<>\"07506\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 74:
//if
this.state = 77;
if (RemoteObject.solveBoolean("!",_grpsel,BA.ObjectToString("07506"))) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
 BA.debugLineNum = 2997;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 2998;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El pedido";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("El pedido "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pedidosel))),RemoteObject.createImmutable(" no corresponde al GRP REPSOL")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2999;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 122;
return;
case 122:
//C
this.state = 77;
;
 BA.debugLineNum = 3000;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 3003;BA.debugLine="JamLoadingIndicator1.MensajeLoading=$\"Buscando";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",((RemoteObject.concat(RemoteObject.createImmutable("Buscando albaranes del pedido "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pedidosel))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 3004;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 3005;BA.debugLine="Wait For(ListaAlbaranesVentaRegistradosPedidoVe";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_listaalbaranesventaregistradospedidoventa" /*RemoteObject*/ ,(Object)(_pedidosel)));
this.state = 123;
return;
case 123:
//C
this.state = 78;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 3006;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3007;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 78:
//if
this.state = 81;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
 BA.debugLineNum = 3008;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3009;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;

case 81:
//C
this.state = 82;
;
 BA.debugLineNum = 3012;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
Debug.ShouldStop(8);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstReg")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3013;BA.debugLine="If lstReg.Size=0 Then";
Debug.ShouldStop(16);
if (true) break;

case 82:
//if
this.state = 85;
if (RemoteObject.solveBoolean("=",_lstreg.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 3014;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3015;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay alb";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay albaranes registrados para el pedido de venta "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pedidosel))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3016;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 124;
return;
case 124:
//C
this.state = 85;
;
 BA.debugLineNum = 3017;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 85:
//C
this.state = 86;
;
 BA.debugLineNum = 3020;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3021;BA.debugLine="Dim lstAlbaranesPedido As List";
Debug.ShouldStop(4096);
_lstalbaranespedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstAlbaranesPedido", _lstalbaranespedido);
 BA.debugLineNum = 3022;BA.debugLine="lstAlbaranesPedido.Initialize";
Debug.ShouldStop(8192);
_lstalbaranespedido.runVoidMethod ("Initialize");
 BA.debugLineNum = 3023;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(16384);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 3024;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(32768);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 3025;BA.debugLine="For Each mDataAlb As Map In lstReg";
Debug.ShouldStop(65536);
if (true) break;

case 86:
//for
this.state = 89;
_mdataalb = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group124 = _lstreg;
index124 = 0;
groupLen124 = group124.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataAlb", _mdataalb);
this.state = 125;
if (true) break;

case 125:
//C
this.state = 89;
if (index124 < groupLen124) {
this.state = 88;
_mdataalb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group124.runMethod(false,"Get",index124));Debug.locals.put("mDataAlb", _mdataalb);}
if (true) break;

case 126:
//C
this.state = 125;
index124++;
Debug.locals.put("mDataAlb", _mdataalb);
if (true) break;

case 88:
//C
this.state = 126;
 BA.debugLineNum = 3026;BA.debugLine="Dim sAlb As String=$\"${mDataAlb.Get(\"Documento";
Debug.ShouldStop(131072);
_salb = (RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_mdataalb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))))),RemoteObject.createImmutable("  Fecha: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("date")),(Object)(_mdataalb.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FechaDocumento")))))),RemoteObject.createImmutable(" ")));Debug.locals.put("sAlb", _salb);Debug.locals.put("sAlb", _salb);
 BA.debugLineNum = 3027;BA.debugLine="lstAlbaranesPedido.Add(sAlb)";
Debug.ShouldStop(262144);
_lstalbaranespedido.runVoidMethod ("Add",(Object)((_salb)));
 if (true) break;
if (true) break;

case 89:
//C
this.state = 90;
Debug.locals.put("mDataAlb", _mdataalb);
;
 BA.debugLineNum = 3029;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(1048576);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 3030;BA.debugLine="Dialog.Title=\"Selecciona ALBARAN\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona ALBARAN")));
 BA.debugLineNum = 3031;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 3032;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 3033;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 3034;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(33554432);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 3035;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(67108864);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3037;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(268435456);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 3038;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomLis";
Debug.ShouldStop(536870912);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 3039;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_";
Debug.ShouldStop(1073741824);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3041;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(1);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 3042;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(2);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 3044;BA.debugLine="B4XListDlg.Options=lstAlbaranesPedido";
Debug.ShouldStop(8);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstalbaranespedido);
 BA.debugLineNum = 3045;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
Debug.ShouldStop(16);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 3047;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3049;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dia";
Debug.ShouldStop(256);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3050;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(512);
if (true) break;

case 90:
//if
this.state = 93;
if (_bcancel.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
 BA.debugLineNum = 3052;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(2048);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 3053;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(4096);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 3054;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(8192);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 93:
//C
this.state = 94;
;
 BA.debugLineNum = 3057;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 127;
return;
case 127:
//C
this.state = 94;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3058;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(131072);
if (true) break;

case 94:
//if
this.state = 97;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 3059;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 97:
//C
this.state = 98;
;
 BA.debugLineNum = 3062;BA.debugLine="Dim sDocumentoSel As String=B4XListDlg.Selected";
Debug.ShouldStop(2097152);
_sdocumentosel = _b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("sDocumentoSel", _sdocumentosel);Debug.locals.put("sDocumentoSel", _sdocumentosel);
 BA.debugLineNum = 3063;BA.debugLine="Dim mAlbaranSel As Map=lstReg.Get(lstAlbaranesP";
Debug.ShouldStop(4194304);
_malbaransel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_malbaransel = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(_lstalbaranespedido.runMethod(true,"IndexOf",(Object)((_sdocumentosel))))));Debug.locals.put("mAlbaranSel", _malbaransel);Debug.locals.put("mAlbaranSel", _malbaransel);
 BA.debugLineNum = 3064;BA.debugLine="Dim AlbaranSel As String=mAlbaranSel.Get(\"Docum";
Debug.ShouldStop(8388608);
_albaransel = BA.ObjectToString(_malbaransel.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))));Debug.locals.put("AlbaranSel", _albaransel);Debug.locals.put("AlbaranSel", _albaransel);
 BA.debugLineNum = 3066;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿en";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("¿enviar email a Transnatur correspondiente al albarán "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_albaransel))),RemoteObject.createImmutable("?")))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 128;
return;
case 128:
//C
this.state = 98;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3067;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(67108864);
if (true) break;

case 98:
//if
this.state = 103;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 100;
;}if (true) break;

case 100:
//C
this.state = 103;
if (true) return ;
if (true) break;

case 103:
//C
this.state = 104;
;
 BA.debugLineNum = 3074;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando c";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando configuración...")));
 BA.debugLineNum = 3075;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(4);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 3077;BA.debugLine="Wait For(CargaRepsolConfiguracionLogisticaAlbar";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_cargarepsolconfiguracionlogisticaalbaranesventa" /*RemoteObject*/ ));
this.state = 129;
return;
case 129:
//C
this.state = 104;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 3078;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(32);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3079;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(64);
if (true) break;

case 104:
//if
this.state = 107;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 106;
}if (true) break;

case 106:
//C
this.state = 107;
 BA.debugLineNum = 3080;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3082;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 107:
//C
this.state = 108;
;
 BA.debugLineNum = 3084;BA.debugLine="Dim mData As Map=mRes.Get(\"mDataConf\")";
Debug.ShouldStop(2048);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mDataConf")))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 3085;BA.debugLine="CarpetaFicherosCSVRepsol=mData.Get(\"CampoString";
Debug.ShouldStop(4096);
__ref.setField ("_carpetaficheroscsvrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString1"))))));
 BA.debugLineNum = 3086;BA.debugLine="CarpetaFicherosPDFRepsol=mData.Get(\"CampoString";
Debug.ShouldStop(8192);
__ref.setField ("_carpetaficherospdfrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString5"))))));
 BA.debugLineNum = 3087;BA.debugLine="BuzonCompartidoEmailEnvioInfoRepsol=mData.Get(\"";
Debug.ShouldStop(16384);
__ref.setField ("_buzoncompartidoemailenvioinforepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString2"))))));
 BA.debugLineNum = 3088;BA.debugLine="DireccionDestinoEmailsRepsol=mData.Get(\"CampoSt";
Debug.ShouldStop(32768);
__ref.setField ("_direcciondestinoemailsrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString3"))))));
 BA.debugLineNum = 3089;BA.debugLine="DireccionCCDestinoEmailsRepsol=mData.Get(\"Campo";
Debug.ShouldStop(65536);
__ref.setField ("_direccionccdestinoemailsrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString4"))))));
 BA.debugLineNum = 3091;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookRE";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptdireccionremitenteemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 3092;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptenvioemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 3094;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlookREP";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_crearvbsscriptdireccionremitenteemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 3095;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTMLREPSOL";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_crearvbsscriptenvioemailoutlookhtmlrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 3097;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 3099;BA.debugLine="CrearEmailInfoLogistica(AlbaranSel)";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_crearemailinfologistica" /*void*/ ,(Object)(_albaransel));
 if (true) break;

case 108:
//C
this.state = -1;
;
 BA.debugLineNum = 3104;BA.debugLine="End Sub";
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
public static void  _jamtableviewgestionventas_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewGestionVentas_MenuBarMenuItem_Action (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("jamtableviewgestionventas_menubarmenuitem_action")) { __ref.runUserSub(false, "cgestionventas","jamtableviewgestionventas_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _tagmenuitem;
RemoteObject _sres = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _documentoseleccionado = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewGestionVentas_MenuBarMenuItem_Action (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,349);
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
 BA.debugLineNum = 350;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//select
this.state = 24;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"),BA.ObjectToString("PrevisionSemanalVentas"),BA.ObjectToString("EnviarEmailAlbaranTransnaturREPSOL"))) {
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
}
if (true) break;

case 3:
//C
this.state = 24;
 BA.debugLineNum = 352;BA.debugLine="ResfreshDatosGestionVentas";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_resfreshdatosgestionventas" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 24;
 BA.debugLineNum = 354;BA.debugLine="GenerarExcelPrevisionSemanalVentas";
Debug.ShouldStop(2);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_generarexcelprevisionsemanalventas" /*void*/ );
 if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 357;BA.debugLine="JamLoadingIndicator1.show";
Debug.ShouldStop(16);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 358;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_menubarmenuitem_action"), parent._utilidades.runMethod(false,"_checkpermisosaplicacionusuarioobjetopermiso" /*RemoteObject*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(BA.ObjectToString("PermisosAplicacion")),(Object)(parent._main._nombreaplicacion /*RemoteObject*/ ),(Object)(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("cRepsol"))));
this.state = 25;
return;
case 25:
//C
this.state = 8;
_sres = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sRes", _sres);
;
 BA.debugLineNum = 359;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 360;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
Debug.ShouldStop(128);
if (true) break;

case 8:
//if
this.state = 13;
if (RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("NO")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("ERROR")) || RemoteObject.solveBoolean("=",_sres,BA.ObjectToString("DENIED"))) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
if (true) return ;
if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 362;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando c";
Debug.ShouldStop(512);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Cargando configuración...")));
 BA.debugLineNum = 363;BA.debugLine="JamLoadingIndicator1.Show";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 365;BA.debugLine="Wait For(CargaRepsolConfiguracionLogisticaAlbar";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_cargarepsolconfiguracionlogisticaalbaranesventa" /*RemoteObject*/ ));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 366;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 367;BA.debugLine="If Accion=\"NOK\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 368;BA.debugLine="JamLoadingIndicator1.Close";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 370;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 BA.debugLineNum = 372;BA.debugLine="Dim mData As Map=mRes.Get(\"mDataConf\")";
Debug.ShouldStop(524288);
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("mDataConf")))));Debug.locals.put("mData", _mdata);Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 373;BA.debugLine="CarpetaFicherosCSVRepsol=mData.Get(\"CampoString";
Debug.ShouldStop(1048576);
__ref.setField ("_carpetaficheroscsvrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString1"))))));
 BA.debugLineNum = 374;BA.debugLine="CarpetaFicherosPDFRepsol=mData.Get(\"CampoString";
Debug.ShouldStop(2097152);
__ref.setField ("_carpetaficherospdfrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString5"))))));
 BA.debugLineNum = 375;BA.debugLine="BuzonCompartidoEmailEnvioInfoRepsol=mData.Get(\"";
Debug.ShouldStop(4194304);
__ref.setField ("_buzoncompartidoemailenvioinforepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString2"))))));
 BA.debugLineNum = 376;BA.debugLine="DireccionDestinoEmailsRepsol=mData.Get(\"CampoSt";
Debug.ShouldStop(8388608);
__ref.setField ("_direcciondestinoemailsrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString3"))))));
 BA.debugLineNum = 377;BA.debugLine="DireccionCCDestinoEmailsRepsol=mData.Get(\"Campo";
Debug.ShouldStop(16777216);
__ref.setField ("_direccionccdestinoemailsrepsol" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CampoString4"))))));
 BA.debugLineNum = 379;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookRE";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptdireccionremitenteemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 380;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_borrarvbsscriptenvioemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 382;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlookREP";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_crearvbsscriptdireccionremitenteemailoutlookrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 383;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTMLREPSOL";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_crearvbsscriptenvioemailoutlookhtmlrepsol" /*RemoteObject*/ );
 BA.debugLineNum = 385;BA.debugLine="JamLoadingIndicator1.close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 387;BA.debugLine="wait for(SeleccionarDocumentoREPSOL) complete (";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "jamtableviewgestionventas_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_seleccionardocumentorepsol" /*RemoteObject*/ ));
this.state = 27;
return;
case 27:
//C
this.state = 18;
_documentoseleccionado = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("DocumentoSeleccionado", _documentoseleccionado);
;
 BA.debugLineNum = 388;BA.debugLine="If DocumentoSeleccionado=\"\" Then Return";
Debug.ShouldStop(8);
if (true) break;

case 18:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_documentoseleccionado,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 390;BA.debugLine="CrearEmailInfoLogistica(DocumentoSeleccionado)";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_crearemailinfologistica" /*void*/ ,(Object)(_documentoseleccionado));
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 392;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableviewgestionventas_validacionediciontablecell(RemoteObject __ref,RemoteObject _datosceldaseleccionada,RemoteObject _valorvalidacion) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewGestionVentas_ValidacionEdicionTableCell (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3106);
if (RapidSub.canDelegate("jamtableviewgestionventas_validacionediciontablecell")) { return __ref.runUserSub(false, "cgestionventas","jamtableviewgestionventas_validacionediciontablecell", __ref, _datosceldaseleccionada, _valorvalidacion);}
RemoteObject _aliascampo = RemoteObject.createImmutable("");
RemoteObject _valorvalidacionnombrerespcuenta = RemoteObject.createImmutable("");
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
Debug.locals.put("ValorValidacion", _valorvalidacion);
 BA.debugLineNum = 3106;BA.debugLine="Sub jamTableViewGestionVentas_ValidacionEdicionTab";
Debug.ShouldStop(2);
 BA.debugLineNum = 3107;BA.debugLine="Dim AliasCampo As String=DatosCeldaSeleccionada.A";
Debug.ShouldStop(4);
_aliascampo = _datosceldaseleccionada.getField(true,"AliasCampo" /*RemoteObject*/ );Debug.locals.put("AliasCampo", _aliascampo);Debug.locals.put("AliasCampo", _aliascampo);
 BA.debugLineNum = 3108;BA.debugLine="Select AliasCampo";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_aliascampo,BA.ObjectToString("NombreResponsableCuenta"))) {
case 0: {
 BA.debugLineNum = 3110;BA.debugLine="Dim ValorValidacionNombreRespCuenta As String=V";
Debug.ShouldStop(32);
_valorvalidacionnombrerespcuenta = BA.ObjectToString(_valorvalidacion);Debug.locals.put("ValorValidacionNombreRespCuenta", _valorvalidacionnombrerespcuenta);Debug.locals.put("ValorValidacionNombreRespCuenta", _valorvalidacionnombrerespcuenta);
 BA.debugLineNum = 3111;BA.debugLine="If ValorValidacionNombreRespCuenta.ToUpperCase.";
Debug.ShouldStop(64);
if (_valorvalidacionnombrerespcuenta.runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ANA"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3112;BA.debugLine="jamTableViewGestionVentas.ValidacionEditedCell";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_validacioneditedcell" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada),(Object)((_valorvalidacionnombrerespcuenta.runMethod(true,"toUpperCase"))),(Object)(cgestionventas.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 3114;BA.debugLine="fx.Msgbox(frm,\"El nombre debe empezar por ANA.";
Debug.ShouldStop(512);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("El nombre debe empezar por ANA.")),(Object)(RemoteObject.createImmutable("Error garrafal!!!")));
 BA.debugLineNum = 3115;BA.debugLine="jamTableViewGestionVentas.ValidacionEditedCell";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_validacioneditedcell" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada),(Object)(_valorvalidacion),(Object)(cgestionventas.__c.getField(true,"False")));
 };
 break; }
default: {
 BA.debugLineNum = 3118;BA.debugLine="jamTableViewGestionVentas.ValidacionEditedCell(";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_validacioneditedcell" /*RemoteObject*/ ,(Object)(_datosceldaseleccionada),(Object)(_valorvalidacion),(Object)(cgestionventas.__c.getField(true,"True")));
 break; }
}
;
 BA.debugLineNum = 3121;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listaalbaranesventaregistradospedidoventa(RemoteObject __ref,RemoteObject _pedidoventasel) throws Exception{
try {
		Debug.PushSubsStack("ListaAlbaranesVentaRegistradosPedidoVenta (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3229);
if (RapidSub.canDelegate("listaalbaranesventaregistradospedidoventa")) { return __ref.runUserSub(false, "cgestionventas","listaalbaranesventaregistradospedidoventa", __ref, _pedidoventasel);}
ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta rsub = new ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta(null,__ref,_pedidoventasel);
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
public static class ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta extends BA.ResumableSub {
public ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _pedidoventasel) {
this.parent = parent;
this.__ref = __ref;
this._pedidoventasel = _pedidoventasel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _pedidoventasel;
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListaAlbaranesVentaRegistradosPedidoVenta (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3229);
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
Debug.locals.put("PedidoVentaSel", _pedidoventasel);
 BA.debugLineNum = 3230;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(536870912);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 3231;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(1073741824);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3232;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(-2147483648);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 3234;BA.debugLine="Dim Comando As String=\"ListaAlbaranesVentaRegistr";
Debug.ShouldStop(2);
_comando = BA.ObjectToString("ListaAlbaranesVentaRegistradosPedidoVenta");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 3236;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
Debug.ShouldStop(8);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pedidoventasel)})),(Object)(__ref));
 BA.debugLineNum = 3237;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "listaalbaranesventaregistradospedidoventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 3240;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 3241;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error de con";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_comando))),RemoteObject.createImmutable(" ")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3242;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "listaalbaranesventaregistradospedidoventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 3243;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(1024);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 3245;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 3246;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay alba";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No hay albaranes de venta registrados (no anulados) para el pedido de venta "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pedidoventasel))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3247;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "listaalbaranesventaregistradospedidoventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 3248;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 3250;BA.debugLine="lstReg=mresult.Get(\"lstRes\")";
Debug.ShouldStop(131072);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 3251;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 3254;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(2097152);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 3255;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(4194304);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 3256;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(8388608);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 3257;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
Debug.ShouldStop(16777216);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstReg"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 3258;BA.debugLine="Return mRes";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 3259;BA.debugLine="End Sub";
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
public static RemoteObject  _mapkeystoarray(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("mapKeysToArray (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3521);
if (RapidSub.canDelegate("mapkeystoarray")) { return __ref.runUserSub(false, "cgestionventas","mapkeystoarray", __ref, _mdata);}
RemoteObject _arr = null;
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 3521;BA.debugLine="Sub mapKeysToArray(mData As Map) As String()";
Debug.ShouldStop(1);
 BA.debugLineNum = 3522;BA.debugLine="Dim arr(mData.Size) As String";
Debug.ShouldStop(2);
_arr = RemoteObject.createNewArray ("String", new int[] {_mdata.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 3523;BA.debugLine="Dim iDx As Int";
Debug.ShouldStop(4);
_idx = RemoteObject.createImmutable(0);Debug.locals.put("iDx", _idx);
 BA.debugLineNum = 3524;BA.debugLine="For Each key As String In mData.Keys";
Debug.ShouldStop(8);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 3525;BA.debugLine="arr(iDx)=key";
Debug.ShouldStop(16);
_arr.setArrayElement (_key,_idx);
 BA.debugLineNum = 3526;BA.debugLine="iDx=iDx+1";
Debug.ShouldStop(32);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("iDx", _idx);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 3528;BA.debugLine="Return arr";
Debug.ShouldStop(128);
if (true) return _arr;
 BA.debugLineNum = 3529;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("mapToArrayOfStringsConCamposFecha (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3558);
if (RapidSub.canDelegate("maptoarrayofstringsconcamposfecha")) { return __ref.runUserSub(false, "cgestionventas","maptoarrayofstringsconcamposfecha", __ref, _m);}
RemoteObject _arr = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _key = RemoteObject.declareNull("Object");
RemoteObject _intvalue = RemoteObject.createImmutable(0);
RemoteObject _svalue = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 3558;BA.debugLine="public Sub mapToArrayOfStringsConCamposFecha(m As";
Debug.ShouldStop(32);
 BA.debugLineNum = 3559;BA.debugLine="Dim arr(m.Size * 2) As Object  'array size is dou";
Debug.ShouldStop(64);
_arr = RemoteObject.createNewArray ("Object", new int[] {RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "*",0, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 3560;BA.debugLine="Dim i As Int=0";
Debug.ShouldStop(128);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 3561;BA.debugLine="Dim value As Object";
Debug.ShouldStop(256);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 3562;BA.debugLine="For Each key As Object In m.Keys";
Debug.ShouldStop(512);
{
final RemoteObject group4 = _m.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 3564;BA.debugLine="value=m.Get(key)";
Debug.ShouldStop(2048);
_value = _m.runMethod(false,"Get",(Object)(_key));Debug.locals.put("value", _value);
 BA.debugLineNum = 3565;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
Debug.ShouldStop(4096);
cgestionventas.__c.runVoidMethod ("LogImpl","814548999",(RemoteObject.concat(RemoteObject.createImmutable("key="),cgestionventas.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_key)),RemoteObject.createImmutable(", value="),cgestionventas.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 3566;BA.debugLine="arr(i)=key";
Debug.ShouldStop(8192);
_arr.setArrayElement (_key,_i);
 BA.debugLineNum = 3567;BA.debugLine="i = i +1";
Debug.ShouldStop(16384);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 3568;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",(BA.ObjectToString(_key)).runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("FECHA")))) && RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 3569;BA.debugLine="arr(i)=DateTime.Date(value)";
Debug.ShouldStop(65536);
_arr.setArrayElement ((cgestionventas.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _value)))),_i);
 }else {
 BA.debugLineNum = 3571;BA.debugLine="If value Is String Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 3572;BA.debugLine="arr(i)=value";
Debug.ShouldStop(524288);
_arr.setArrayElement (_value,_i);
 }else {
 BA.debugLineNum = 3574;BA.debugLine="Dim intValue As Int=value";
Debug.ShouldStop(2097152);
_intvalue = BA.numberCast(int.class, _value);Debug.locals.put("intValue", _intvalue);Debug.locals.put("intValue", _intvalue);
 BA.debugLineNum = 3575;BA.debugLine="Dim sValue As String=intValue";
Debug.ShouldStop(4194304);
_svalue = BA.NumberToString(_intvalue);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 3576;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(8388608);
_arr.setArrayElement ((_svalue),_i);
 };
 };
 BA.debugLineNum = 3579;BA.debugLine="i =i +1";
Debug.ShouldStop(67108864);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 3582;BA.debugLine="Return arr";
Debug.ShouldStop(536870912);
if (true) return _arr;
 BA.debugLineNum = 3583;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("mapValuesToArrayOfStringsConCamposFecha (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3531);
if (RapidSub.canDelegate("mapvaluestoarrayofstringsconcamposfecha")) { return __ref.runUserSub(false, "cgestionventas","mapvaluestoarrayofstringsconcamposfecha", __ref, _m);}
RemoteObject _arr = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _key = RemoteObject.declareNull("Object");
RemoteObject _svalue = RemoteObject.createImmutable("");
RemoteObject _intvalue = RemoteObject.createImmutable(0);
Debug.locals.put("m", _m);
 BA.debugLineNum = 3531;BA.debugLine="public Sub mapValuesToArrayOfStringsConCamposFecha";
Debug.ShouldStop(1024);
 BA.debugLineNum = 3532;BA.debugLine="Dim arr(m.Size) As String  'array size is double";
Debug.ShouldStop(2048);
_arr = RemoteObject.createNewArray ("String", new int[] {_m.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 3533;BA.debugLine="Dim i As Int=0";
Debug.ShouldStop(4096);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 3534;BA.debugLine="Dim value As Object";
Debug.ShouldStop(8192);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 3535;BA.debugLine="For Each key As Object In m.Keys";
Debug.ShouldStop(16384);
{
final RemoteObject group4 = _m.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 3537;BA.debugLine="value=m.Get(key)";
Debug.ShouldStop(65536);
_value = _m.runMethod(false,"Get",(Object)(_key));Debug.locals.put("value", _value);
 BA.debugLineNum = 3538;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
Debug.ShouldStop(131072);
cgestionventas.__c.runVoidMethod ("LogImpl","814483463",(RemoteObject.concat(RemoteObject.createImmutable("key="),cgestionventas.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_key)),RemoteObject.createImmutable(", value="),cgestionventas.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 3539;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
Debug.ShouldStop(262144);
if ((BA.ObjectToString(_key)).runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("FECHA"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3540;BA.debugLine="arr(i)=DateTime.Date(value)";
Debug.ShouldStop(524288);
_arr.setArrayElement (cgestionventas.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _value))),_i);
 }else {
 BA.debugLineNum = 3542;BA.debugLine="If value Is String Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 3543;BA.debugLine="Dim sValue As String=value";
Debug.ShouldStop(4194304);
_svalue = BA.ObjectToString(_value);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 3544;BA.debugLine="sValue=sValue.Replace(TAB,\"\")";
Debug.ShouldStop(8388608);
_svalue = _svalue.runMethod(true,"replace",(Object)(cgestionventas.__c.getField(true,"TAB")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 3545;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(16777216);
_arr.setArrayElement (_svalue,_i);
 }else {
 BA.debugLineNum = 3547;BA.debugLine="Dim intValue As Int=value";
Debug.ShouldStop(67108864);
_intvalue = BA.numberCast(int.class, _value);Debug.locals.put("intValue", _intvalue);Debug.locals.put("intValue", _intvalue);
 BA.debugLineNum = 3548;BA.debugLine="Dim sValue As String=intValue";
Debug.ShouldStop(134217728);
_svalue = BA.NumberToString(_intvalue);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 3549;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(268435456);
_arr.setArrayElement (_svalue,_i);
 };
 };
 BA.debugLineNum = 3552;BA.debugLine="i =i +1";
Debug.ShouldStop(-2147483648);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 3555;BA.debugLine="Return arr";
Debug.ShouldStop(4);
if (true) return (_arr);
 BA.debugLineNum = 3556;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _nombrevendedor(RemoteObject __ref,RemoteObject _codigovendedorsel) throws Exception{
try {
		Debug.PushSubsStack("NombreVendedor (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2187);
if (RapidSub.canDelegate("nombrevendedor")) { __ref.runUserSub(false, "cgestionventas","nombrevendedor", __ref, _codigovendedorsel); return;}
ResumableSub_NombreVendedor rsub = new ResumableSub_NombreVendedor(null,__ref,_codigovendedorsel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_NombreVendedor extends BA.ResumableSub {
public ResumableSub_NombreVendedor(b4j.docU.cgestionventas parent,RemoteObject __ref,RemoteObject _codigovendedorsel) {
this.parent = parent;
this.__ref = __ref;
this._codigovendedorsel = _codigovendedorsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _codigovendedorsel;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("NombreVendedor (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2187);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("CodigoVendedorSel", _codigovendedorsel);
 BA.debugLineNum = 2188;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(2048);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2189;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(4096);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2190;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(8192);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2191;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"NombreVended";
Debug.ShouldStop(16384);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("NombreVendedor")),(Object)((RemoteObject.createNewArray("String",new int[] {1},new Object[] {_codigovendedorsel}))),(Object)(__ref));
 BA.debugLineNum = 2192;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "nombrevendedor"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2195;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 2196;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query NombreVendedor ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2197;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "nombrevendedor"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2198;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2203;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 2204;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay ningú";
Debug.ShouldStop(134217728);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay ningún vendedor registrado en Navision con el código "),_codigovendedorsel,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2205;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "nombrevendedor"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 BA.debugLineNum = 2206;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2208;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(-2147483648);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2209;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(1);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 2212;BA.debugLine="CallSubDelayed3(Me,\"NombreVendedor_Completed\",Acc";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("NombreVendedor_Completed")),(Object)((_accion)),(Object)((_lstregistros)));
 BA.debugLineNum = 2213;BA.debugLine="End Sub";
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
public static void  _osubspendientesterminaproductonocortenoconfeccion(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("OSUBsPendientesTerminaProductoNoCorteNoConfeccion (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2361);
if (RapidSub.canDelegate("osubspendientesterminaproductonocortenoconfeccion")) { __ref.runUserSub(false, "cgestionventas","osubspendientesterminaproductonocortenoconfeccion", __ref); return;}
ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion rsub = new ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion extends BA.ResumableSub {
public ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("OSUBsPendientesTerminaProductoNoCorteNoConfeccion (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2361);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2362;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(33554432);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2363;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(67108864);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2364;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(134217728);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2365;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"OSUBsPtesTer";
Debug.ShouldStop(268435456);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("OSUBsPtesTerminaProductoNoCorteNoConfeccionSumaArtVar")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2366;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "osubspendientesterminaproductonocortenoconfeccion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2369;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 2370;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query OSUBsPtesTerminaProductoNoCorteNoConfeccionSumaArtVar ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2371;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "osubspendientesterminaproductonocortenoconfeccion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2372;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(8);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2377;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 2381;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2383;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(16384);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2384;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 2387;BA.debugLine="CallSubDelayed3(Me,\"OSUBsPendientesTerminaProduct";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("OSUBsPendientesTerminaProductoNoCorteNoConfeccion_Completed")),(Object)((_accion)),(Object)((_lstregistros)));
 BA.debugLineNum = 2388;BA.debugLine="End Sub";
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
public static void  _pedidoscomprasrecibidosptesrecepcionar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PedidosComprasRecibidosPtesRecepcionar (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2300);
if (RapidSub.canDelegate("pedidoscomprasrecibidosptesrecepcionar")) { __ref.runUserSub(false, "cgestionventas","pedidoscomprasrecibidosptesrecepcionar", __ref); return;}
ResumableSub_PedidosComprasRecibidosPtesRecepcionar rsub = new ResumableSub_PedidosComprasRecibidosPtesRecepcionar(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PedidosComprasRecibidosPtesRecepcionar extends BA.ResumableSub {
public ResumableSub_PedidosComprasRecibidosPtesRecepcionar(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PedidosComprasRecibidosPtesRecepcionar (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2300);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2301;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(268435456);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2302;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(536870912);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2303;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(1073741824);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2304;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"PedidosCompr";
Debug.ShouldStop(-2147483648);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinknav /*RemoteObject*/ ),(Object)(BA.ObjectToString("PedidosCompraRecibidosPtesRecepcionar")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2305;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "pedidoscomprasrecibidosptesrecepcionar"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2308;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 2309;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query PedidosCompraRecibidosPtesRecepcionar ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2310;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "pedidoscomprasrecibidosptesrecepcionar"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2311;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(64);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2316;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 2320;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2322;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(131072);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2323;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
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
 BA.debugLineNum = 2326;BA.debugLine="CallSubDelayed3(Me,\"PedidosComprasRecibidosPtesRe";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("PedidosComprasRecibidosPtesRecepcionar_Completed")),(Object)((_accion)),(Object)((_lstregistros)));
 BA.debugLineNum = 2327;BA.debugLine="End Sub";
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
public static RemoteObject  _reservasdocumentoalmzenproin(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReservasDocumentoAlmZenProin (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2391);
if (RapidSub.canDelegate("reservasdocumentoalmzenproin")) { return __ref.runUserSub(false, "cgestionventas","reservasdocumentoalmzenproin", __ref);}
ResumableSub_ReservasDocumentoAlmZenProin rsub = new ResumableSub_ReservasDocumentoAlmZenProin(null,__ref);
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
public static class ResumableSub_ReservasDocumentoAlmZenProin extends BA.ResumableSub {
public ResumableSub_ReservasDocumentoAlmZenProin(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReservasDocumentoAlmZenProin (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2391);
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
 BA.debugLineNum = 2392;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(8388608);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2393;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(16777216);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2394;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(33554432);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2395;BA.debugLine="Dim mReg As Map";
Debug.ShouldStop(67108864);
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 2396;BA.debugLine="mReg.Initialize";
Debug.ShouldStop(134217728);
_mreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2397;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(268435456);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2398;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
Debug.ShouldStop(536870912);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
 BA.debugLineNum = 2399;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlAlmProin,\"Em";
Debug.ShouldStop(1073741824);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqlalmproin /*RemoteObject*/ ),(Object)(BA.ObjectToString("EmbalajesReservasActivas")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2400;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "reservasdocumentoalmzenproin"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2403;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 2404;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query EmbalajesReservasActivas Proin ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2405;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "reservasdocumentoalmzenproin"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2406;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(32);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2407;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(64);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2409;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 2410;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2411;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(1024);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2413;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(4096);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2414;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(8192);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2415;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(16384);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2416;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
Debug.ShouldStop(32768);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
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
 BA.debugLineNum = 2419;BA.debugLine="Return mReg";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mreg));return;};
 BA.debugLineNum = 2420;BA.debugLine="End Sub";
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
public static RemoteObject  _reservasdocumentoalmzenprotec(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReservasDocumentoAlmZenProtec (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2422);
if (RapidSub.canDelegate("reservasdocumentoalmzenprotec")) { return __ref.runUserSub(false, "cgestionventas","reservasdocumentoalmzenprotec", __ref);}
ResumableSub_ReservasDocumentoAlmZenProtec rsub = new ResumableSub_ReservasDocumentoAlmZenProtec(null,__ref);
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
public static class ResumableSub_ReservasDocumentoAlmZenProtec extends BA.ResumableSub {
public ResumableSub_ReservasDocumentoAlmZenProtec(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ReservasDocumentoAlmZenProtec (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,2422);
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
 BA.debugLineNum = 2423;BA.debugLine="Dim lstRegistros As List";
Debug.ShouldStop(4194304);
_lstregistros = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2424;BA.debugLine="lstRegistros.Initialize";
Debug.ShouldStop(8388608);
_lstregistros.runVoidMethod ("Initialize");
 BA.debugLineNum = 2425;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(16777216);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2426;BA.debugLine="Dim mReg As Map";
Debug.ShouldStop(33554432);
_mreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mReg", _mreg);
 BA.debugLineNum = 2427;BA.debugLine="mReg.Initialize";
Debug.ShouldStop(67108864);
_mreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 2428;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(134217728);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2429;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
Debug.ShouldStop(268435456);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
 BA.debugLineNum = 2430;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlAlmProtec,\"E";
Debug.ShouldStop(536870912);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqlalmprotec /*RemoteObject*/ ),(Object)(BA.ObjectToString("EmbalajesReservasActivas")),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 2431;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "reservasdocumentoalmzenprotec"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mresult", _mresult);
;
 BA.debugLineNum = 2434;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 2435;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error de conexion servidor/query EmbalajesReservasActivas Proin ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2436;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "reservasdocumentoalmzenprotec"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 2437;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(16);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2438;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(32);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2440;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 2441;BA.debugLine="Accion=\"SinDatos\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("SinDatos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2442;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 2444;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
Debug.ShouldStop(2048);
_lstregistros = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstRegistros", _lstregistros);
 BA.debugLineNum = 2445;BA.debugLine="Accion=\"Continuar\"";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString("Continuar");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 2446;BA.debugLine="mReg.Put(\"Accion\", Accion)";
Debug.ShouldStop(8192);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 2447;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
Debug.ShouldStop(16384);
_mreg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstregistros.getObject())));
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
 BA.debugLineNum = 2450;BA.debugLine="Return mReg";
Debug.ShouldStop(131072);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mreg));return;};
 BA.debugLineNum = 2451;BA.debugLine="End Sub";
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
public static void  _resfreshdatosgestionventas(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResfreshDatosGestionVentas (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,395);
if (RapidSub.canDelegate("resfreshdatosgestionventas")) { __ref.runUserSub(false, "cgestionventas","resfreshdatosgestionventas", __ref); return;}
ResumableSub_ResfreshDatosGestionVentas rsub = new ResumableSub_ResfreshDatosGestionVentas(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ResfreshDatosGestionVentas extends BA.ResumableSub {
public ResumableSub_ResfreshDatosGestionVentas(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _rsdata = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ResfreshDatosGestionVentas (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,395);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 397;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadolabelsalirjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 399;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Calcular d";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Calcular datos de fechas estimadas?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 400;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 401;BA.debugLine="CalcularFechas=Result=xui.DialogResponse_Positive";
Debug.ShouldStop(65536);
__ref.setField ("_calcularfechas" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))));
 BA.debugLineNum = 403;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Plaz";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcolumnavisible" /*RemoteObject*/ ,(Object)(BA.ObjectToString("PlazoTeoricoFabLinea")),(Object)(__ref.getField(true,"_calcularfechas" /*RemoteObject*/ )));
 BA.debugLineNum = 404;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcolumnavisible" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaTeoricaEntrega")),(Object)(__ref.getField(true,"_calcularfechas" /*RemoteObject*/ )));
 BA.debugLineNum = 405;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcolumnavisible" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaDisponibilidad")),(Object)(__ref.getField(true,"_calcularfechas" /*RemoteObject*/ )));
 BA.debugLineNum = 406;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcolumnavisible" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaPrevVentasLinea")),(Object)(__ref.getField(true,"_calcularfechas" /*RemoteObject*/ )));
 BA.debugLineNum = 407;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcolumnavisible" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaPrevVentasLineaVencida")),(Object)(__ref.getField(true,"_calcularfechas" /*RemoteObject*/ )));
 BA.debugLineNum = 408;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcolumnavisible" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaPrevVentasDocumento")),(Object)(__ref.getField(true,"_calcularfechas" /*RemoteObject*/ )));
 BA.debugLineNum = 410;BA.debugLine="If mSQLGestionventas.IsInitialized Then";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 411;BA.debugLine="mSQLGestionventas.Close";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("Close");
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 414;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(F";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_habilitarjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 416;BA.debugLine="mSQLGestionventas.InitializeSQLite(xui.DefaultFol";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 417;BA.debugLine="CrearTablasSQLite";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_creartablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 419;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 420;BA.debugLine="wait for(ActualizacionDatos) complete (Accion As";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "resfreshdatosgestionventas"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_actualizaciondatos" /*RemoteObject*/ ));
this.state = 25;
return;
case 25:
//C
this.state = 5;
_accion = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Accion", _accion);
;
 BA.debugLineNum = 423;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
Debug.ShouldStop(64);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 424;BA.debugLine="If Accion=\"Salir\" Then";
Debug.ShouldStop(128);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("Salir"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 425;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(256);
parent._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 426;BA.debugLine="frm.Close";
Debug.ShouldStop(512);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 428;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 431;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
Debug.ShouldStop(16384);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("cF", _cf);
 BA.debugLineNum = 432;BA.debugLine="cF.Initialize";
Debug.ShouldStop(32768);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 433;BA.debugLine="cF.AliasCampoColumna=\"QtyDisponibleAcum\"";
Debug.ShouldStop(65536);
_cf.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("QtyDisponibleAcum"));
 BA.debugLineNum = 434;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewGestionVe";
Debug.ShouldStop(131072);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_colorvalormenorcolorvalormayorigualcolumna" /*RemoteObject*/ ));
 BA.debugLineNum = 436;BA.debugLine="cF.CellFactoryEnCallBack=True";
Debug.ShouldStop(524288);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 437;BA.debugLine="cF.params=Array(0,\"Red\",\"Green\",\"#,##0.##\")";
Debug.ShouldStop(1048576);
_cf.setField ("params" /*RemoteObject*/ ,RemoteObject.createNewArray("Object",new int[] {4},new Object[] {RemoteObject.createImmutable((0)),RemoteObject.createImmutable(("Red")),RemoteObject.createImmutable(("Green")),(RemoteObject.createImmutable("#,##0.##"))}));
 BA.debugLineNum = 447;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(cF)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cf));
 BA.debugLineNum = 449;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
Debug.ShouldStop(1);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 450;BA.debugLine="Dim rsData As ResultSet=mSQLGestionventas.ExecQue";
Debug.ShouldStop(2);
_rsdata = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rsdata = __ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblGestionVentas")));Debug.locals.put("rsData", _rsdata);Debug.locals.put("rsData", _rsdata);
 BA.debugLineNum = 451;BA.debugLine="Dim rSub As ResumableSub=jamTableViewGestionVenta";
Debug.ShouldStop(4);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rsdata.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 452;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "resfreshdatosgestionventas"), _rsub);
this.state = 26;
return;
case 26:
//C
this.state = 9;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 453;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 454;BA.debugLine="rsData.Close";
Debug.ShouldStop(32);
_rsdata.runVoidMethod ("Close");
 BA.debugLineNum = 455;BA.debugLine="Log(mRes)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","812845116",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 457;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadolabelsalirjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 458;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(T";
Debug.ShouldStop(512);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_habilitarjamtableview" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 459;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1024);
if (true) break;

case 9:
//if
this.state = 23;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 460;BA.debugLine="If \"\"<>mRes.Get(\"msgAviso\") Then";
Debug.ShouldStop(2048);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 461;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 462;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 15;
;
 if (true) break;
;
 BA.debugLineNum = 464;BA.debugLine="If \"\"<>mRes.Get(\"msgError\") Then";
Debug.ShouldStop(32768);

case 15:
//if
this.state = 22;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 465;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 466;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 18;
;
 BA.debugLineNum = 468;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 469;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 18;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 470;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(2097152);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 471;BA.debugLine="jamTableViewGestionVentas.AbrirCamposBuilder";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 472;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 476;BA.debugLine="ExitApplication";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = -1;
;
 BA.debugLineNum = 480;BA.debugLine="mSQLGestionventas.close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msqlgestionventas" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 482;BA.debugLine="End Sub";
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
public static RemoteObject  _seleccionardireccionremitenteemailsrepsol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmailsREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3688);
if (RapidSub.canDelegate("seleccionardireccionremitenteemailsrepsol")) { return __ref.runUserSub(false, "cgestionventas","seleccionardireccionremitenteemailsrepsol", __ref);}
ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL rsub = new ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL(null,__ref);
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
public static class ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
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
		Debug.PushSubsStack("SeleccionarDireccionRemitenteEmailsREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3688);
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
 BA.debugLineNum = 3690;BA.debugLine="wait for(EjecutarVBSScriptDireccionesEmailREPSOL)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), __ref.runClassMethod (b4j.docU.cgestionventas.class, "_ejecutarvbsscriptdireccionesemailrepsol" /*RemoteObject*/ ));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 3691;BA.debugLine="Log(\"mRes: \" & mRes)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","814811139",RemoteObject.concat(RemoteObject.createImmutable("mRes: "),_mres),0);
 BA.debugLineNum = 3692;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
Debug.ShouldStop(2048);
_success = BA.ObjectToBoolean(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Success")))));Debug.locals.put("Success", _success);Debug.locals.put("Success", _success);
 BA.debugLineNum = 3693;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
Debug.ShouldStop(4096);
_exitcode = BA.numberCast(int.class, _mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ExitCode")))));Debug.locals.put("ExitCode", _exitcode);Debug.locals.put("ExitCode", _exitcode);
 BA.debugLineNum = 3694;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
Debug.ShouldStop(8192);
_stdout = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdOut")))));Debug.locals.put("StdOut", _stdout);Debug.locals.put("StdOut", _stdout);
 BA.debugLineNum = 3695;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
Debug.ShouldStop(16384);
_stderr = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("StdErr")))));Debug.locals.put("StdErr", _stderr);Debug.locals.put("StdErr", _stderr);
 BA.debugLineNum = 3698;BA.debugLine="If Success=False Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 3699;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt direcciones email"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3700;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
 BA.debugLineNum = 3701;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 3703;BA.debugLine="If ExitCode=1 Then";
Debug.ShouldStop(4194304);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_exitcode,BA.numberCast(double.class, 1))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 3704;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error spt direcciones email"),parent.__c.getField(true,"CRLF"),_stderr)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3705;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 7;
;
 BA.debugLineNum = 3706;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 3708;BA.debugLine="Dim sDireccionesCuentasEmail As String=StdOut.Sub";
Debug.ShouldStop(134217728);
_sdireccionescuentasemail = _stdout.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_stdout.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1)));Debug.locals.put("sDireccionesCuentasEmail", _sdireccionescuentasemail);Debug.locals.put("sDireccionesCuentasEmail", _sdireccionescuentasemail);
 BA.debugLineNum = 3709;BA.debugLine="If sDireccionesCuentasEmail=\"\" Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 3710;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay direcciones de email configuradas."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Outlook no instalado?"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3711;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
 BA.debugLineNum = 3712;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 3715;BA.debugLine="Dim ArrDireccionesCuentasEmail() As String=Regex.";
Debug.ShouldStop(4);
_arrdireccionescuentasemail = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_sdireccionescuentasemail));Debug.locals.put("ArrDireccionesCuentasEmail", _arrdireccionescuentasemail);Debug.locals.put("ArrDireccionesCuentasEmail", _arrdireccionescuentasemail);
 BA.debugLineNum = 3716;BA.debugLine="Dim lstDireccionesCuentasEmail As List";
Debug.ShouldStop(8);
_lstdireccionescuentasemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstDireccionesCuentasEmail", _lstdireccionescuentasemail);
 BA.debugLineNum = 3717;BA.debugLine="lstDireccionesCuentasEmail.Initialize";
Debug.ShouldStop(16);
_lstdireccionescuentasemail.runVoidMethod ("Initialize");
 BA.debugLineNum = 3719;BA.debugLine="For iDx =0 To ArrDireccionesCuentasEmail.Length-1";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 3720;BA.debugLine="lstDireccionesCuentasEmail.Add(ArrDireccionesCue";
Debug.ShouldStop(128);
_lstdireccionescuentasemail.runVoidMethod ("Add",(Object)((_arrdireccionescuentasemail.getArrayElement(true,BA.numberCast(int.class, _idx)))));
 if (true) break;
if (true) break;
Debug.locals.put("iDx", _idx);
;
 BA.debugLineNum = 3726;BA.debugLine="If lstDireccionesCuentasEmail.Size=0 Then";
Debug.ShouldStop(8192);

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_lstdireccionescuentasemail.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 3727;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay direcciones de email configuradas."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("¿Outlook no instalado?"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3728;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 18;
;
 BA.debugLineNum = 3729;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 3734;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
Debug.ShouldStop(2097152);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Selecciona Cuenta para Enviar los Emails")));
 BA.debugLineNum = 3735;BA.debugLine="Dialog.TitleBarHeight=60dip";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60))));
 BA.debugLineNum = 3736;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 18))));
 BA.debugLineNum = 3737;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_buttonsfont" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 3738;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
Debug.ShouldStop(33554432);
_b4xlistdlg = RemoteObject.createNew ("b4j.docU.b4xlisttemplate");Debug.locals.put("B4XListDlg", _b4xlistdlg);
 BA.debugLineNum = 3739;BA.debugLine="B4XListDlg.Initialize";
Debug.ShouldStop(67108864);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3741;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
Debug.ShouldStop(268435456);
_textsize = BA.numberCast(float.class, 18);Debug.locals.put("TextSize", _textsize);Debug.locals.put("TextSize", _textsize);
 BA.debugLineNum = 3742;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
Debug.ShouldStop(536870912);
_xclv = _b4xlistdlg.getField(false,"_customlistview1" /*RemoteObject*/ );Debug.locals.put("xclv", _xclv);Debug.locals.put("xclv", _xclv);
 BA.debugLineNum = 3743;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
Debug.ShouldStop(1073741824);
_xclv.getField(false,"_sv").runMethod(false,"getScrollViewInnerPanel").runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 3745;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
Debug.ShouldStop(1);
_dlbl = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");
_dlbl = _xclv.getField(false,"_designerlabel");Debug.locals.put("dlbl", _dlbl);Debug.locals.put("dlbl", _dlbl);
 BA.debugLineNum = 3746;BA.debugLine="dlbl.TextSize=TextSize";
Debug.ShouldStop(2);
_dlbl.runMethod(true,"setTextSize",BA.numberCast(double.class, _textsize));
 BA.debugLineNum = 3748;BA.debugLine="B4XListDlg.Options=lstDireccionesCuentasEmail";
Debug.ShouldStop(8);
_b4xlistdlg.setField ("_options" /*RemoteObject*/ ,_lstdireccionescuentasemail);
 BA.debugLineNum = 3749;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
Debug.ShouldStop(16);
_b4xlistdlg.runClassMethod (b4j.docU.b4xlisttemplate.class, "_resize" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 600)))),(Object)(parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))));
 BA.debugLineNum = 3751;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
Debug.ShouldStop(64);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_b4xlistdlg)),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3758;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(8192);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3759;BA.debugLine="If bCancel.IsInitialized Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 3761;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
Debug.ShouldStop(65536);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))}, "-",1, 0));
 BA.debugLineNum = 3762;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
Debug.ShouldStop(131072);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))}, "+",1, 0));
 BA.debugLineNum = 3763;BA.debugLine="bCancel.TextSize=18";
Debug.ShouldStop(262144);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 18));
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 3766;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 23;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3767;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 3770;BA.debugLine="Return False";
Debug.ShouldStop(33554432);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 3774;BA.debugLine="DireccionSeleccionadaRemitenteEmailsRepsol=B4XLis";
Debug.ShouldStop(536870912);
__ref.setField ("_direccionseleccionadaremitenteemailsrepsol" /*RemoteObject*/ ,_b4xlistdlg.getField(true,"_selecteditem" /*RemoteObject*/ ));
 BA.debugLineNum = 3776;BA.debugLine="If DireccionSeleccionadaRemitenteEmailsRepsol=\"at";
Debug.ShouldStop(-2147483648);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_direccionseleccionadaremitenteemailsrepsol" /*RemoteObject*/ ),BA.ObjectToString("atencionalcliente@proin-pinilla.com"))) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
__ref.setField ("_direccionseleccionadaremitenteemailsrepsol" /*RemoteObject*/ ,BA.ObjectToString("Servicio de Atención al Cliente"));
if (true) break;

case 32:
//C
this.state = -1;
;
 BA.debugLineNum = 3778;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 3821;BA.debugLine="End Sub";
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
public static RemoteObject  _seleccionardocumentorepsol(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDocumentoREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3342);
if (RapidSub.canDelegate("seleccionardocumentorepsol")) { return __ref.runUserSub(false, "cgestionventas","seleccionardocumentorepsol", __ref);}
ResumableSub_SeleccionarDocumentoREPSOL rsub = new ResumableSub_SeleccionarDocumentoREPSOL(null,__ref);
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
public static class ResumableSub_SeleccionarDocumentoREPSOL extends BA.ResumableSub {
public ResumableSub_SeleccionarDocumentoREPSOL(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _inputdlg = RemoteObject.declareNull("b4j.docU.b4xinputtemplate");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _bok = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _bcancel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _documento = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionarDocumentoREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3342);
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
 BA.debugLineNum = 3344;BA.debugLine="Dialog.Title=\"Indica Documento\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Indica Documento")));
 BA.debugLineNum = 3345;BA.debugLine="Dialog.TitleBarHeight=50dip";
Debug.ShouldStop(65536);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_titlebarheight" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 3346;BA.debugLine="Dim InputDlg As B4XInputTemplate";
Debug.ShouldStop(131072);
_inputdlg = RemoteObject.createNew ("b4j.docU.b4xinputtemplate");Debug.locals.put("InputDlg", _inputdlg);
 BA.debugLineNum = 3347;BA.debugLine="InputDlg.Initialize";
Debug.ShouldStop(262144);
_inputdlg.runClassMethod (b4j.docU.b4xinputtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 3348;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
Debug.ShouldStop(524288);
_inputdlg.getField(false,"_lbltitle" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 3349;BA.debugLine="InputDlg.Text=\"\"";
Debug.ShouldStop(1048576);
_inputdlg.setField ("_text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 3351;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
Debug.ShouldStop(4194304);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((_inputdlg)),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancelar"))));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 3352;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
Debug.ShouldStop(8388608);
_bok = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bok = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")));Debug.locals.put("bOK", _bok);Debug.locals.put("bOK", _bok);
 BA.debugLineNum = 3353;BA.debugLine="bOK.TextSize=15";
Debug.ShouldStop(16777216);
_bok.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 3354;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
Debug.ShouldStop(33554432);
_bcancel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_bcancel = __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_getbutton" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Cancel")));Debug.locals.put("bCancel", _bcancel);Debug.locals.put("bCancel", _bcancel);
 BA.debugLineNum = 3355;BA.debugLine="bCancel.TextSize=15";
Debug.ShouldStop(67108864);
_bcancel.runMethod(true,"setTextSize",BA.numberCast(double.class, 15));
 BA.debugLineNum = 3356;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
Debug.ShouldStop(134217728);
_bcancel.runMethod(true,"setLeft",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getLeft"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "-",1, 0));
 BA.debugLineNum = 3357;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
Debug.ShouldStop(268435456);
_bcancel.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_bcancel.runMethod(true,"getWidth"),parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))}, "+",1, 0));
 BA.debugLineNum = 3358;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardocumentorepsol"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 3359;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return \"\"";
Debug.ShouldStop(1073741824);
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
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("")));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 3361;BA.debugLine="Dim Documento As String=InputDlg.Text";
Debug.ShouldStop(1);
_documento = _inputdlg.getField(true,"_text" /*RemoteObject*/ );Debug.locals.put("Documento", _documento);Debug.locals.put("Documento", _documento);
 BA.debugLineNum = 3363;BA.debugLine="If Documento=\"\" Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 3364;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha indicado documento")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 3365;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "seleccionardocumentorepsol"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 BA.debugLineNum = 3366;BA.debugLine="Return \"\"";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 3369;BA.debugLine="Return Documento";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_documento));return;};
 BA.debugLineNum = 3371;BA.debugLine="End Sub";
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
public static RemoteObject  _setforegroundwindow(RemoteObject __ref,RemoteObject _title) throws Exception{
try {
		Debug.PushSubsStack("SetForegroundWindow (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3176);
if (RapidSub.canDelegate("setforegroundwindow")) { return __ref.runUserSub(false, "cgestionventas","setforegroundwindow", __ref, _title);}
RemoteObject _wu = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _user32 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _l = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _t = RemoteObject.createImmutable("");
RemoteObject _hwnd = RemoteObject.declareNull("Object");
Debug.locals.put("Title", _title);
 BA.debugLineNum = 3176;BA.debugLine="Sub SetForegroundWindow(Title As String)";
Debug.ShouldStop(128);
 BA.debugLineNum = 3177;BA.debugLine="Dim WU As JavaObject";
Debug.ShouldStop(256);
_wu = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("WU", _wu);
 BA.debugLineNum = 3178;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
Debug.ShouldStop(512);
_wu.runVoidMethod ("InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.WindowUtils")));
 BA.debugLineNum = 3179;BA.debugLine="Dim user32 As JavaObject";
Debug.ShouldStop(1024);
_user32 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("user32", _user32);
 BA.debugLineNum = 3180;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.pla";
Debug.ShouldStop(2048);
_user32 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _user32.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("com.sun.jna.platform.win32.User32"))).runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("INSTANCE"))));Debug.locals.put("user32", _user32);
 BA.debugLineNum = 3181;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
Debug.ShouldStop(4096);
_l = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_l = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _wu.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAllWindows")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(cgestionventas.__c.getField(true,"False"))}))));Debug.locals.put("L", _l);Debug.locals.put("L", _l);
 BA.debugLineNum = 3182;BA.debugLine="For Each JO As JavaObject In L";
Debug.ShouldStop(8192);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
{
final RemoteObject group6 = _l;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), group6.runMethod(false,"Get",index6));Debug.locals.put("JO", _jo);
Debug.locals.put("JO", _jo);
 BA.debugLineNum = 3183;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
Debug.ShouldStop(16384);
_t = BA.ObjectToString(_jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getTitle")),(Object)((cgestionventas.__c.getField(false,"Null")))));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 3184;BA.debugLine="Log(t)";
Debug.ShouldStop(32768);
cgestionventas.__c.runVoidMethod ("LogImpl","813959176",_t,0);
 BA.debugLineNum = 3185;BA.debugLine="If t.Contains(Title) Then";
Debug.ShouldStop(65536);
if (_t.runMethod(true,"contains",(Object)(_title)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 3186;BA.debugLine="Dim hwnd As Object = JO.RunMethod(\"getHWND\", Nu";
Debug.ShouldStop(131072);
_hwnd = _jo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getHWND")),(Object)((cgestionventas.__c.getField(false,"Null"))));Debug.locals.put("hwnd", _hwnd);Debug.locals.put("hwnd", _hwnd);
 BA.debugLineNum = 3187;BA.debugLine="user32.RunMethod(\"SetForegroundWindow\", Array(h";
Debug.ShouldStop(262144);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("SetForegroundWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_hwnd})));
 BA.debugLineNum = 3188;BA.debugLine="user32.RunMethod(\"SetFocus\", Array(hwnd))";
Debug.ShouldStop(524288);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("SetFocus")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_hwnd})));
 BA.debugLineNum = 3189;BA.debugLine="user32.RunMethod(\"ShowWindow\", Array(hwnd, 9))'";
Debug.ShouldStop(1048576);
_user32.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("ShowWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_hwnd,RemoteObject.createImmutable((9))})));
 BA.debugLineNum = 3190;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 }
}Debug.locals.put("JO", _jo);
;
 BA.debugLineNum = 3193;BA.debugLine="Log(\"Window not found\")";
Debug.ShouldStop(16777216);
cgestionventas.__c.runVoidMethod ("LogImpl","813959185",RemoteObject.createImmutable("Window not found"),0);
 BA.debugLineNum = 3194;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setforegroundwindowrepsol(RemoteObject __ref,RemoteObject _title,RemoteObject _justfind) throws Exception{
try {
		Debug.PushSubsStack("SetForegroundWindowREPSOL (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,3998);
if (RapidSub.canDelegate("setforegroundwindowrepsol")) { return __ref.runUserSub(false, "cgestionventas","setforegroundwindowrepsol", __ref, _title, _justfind);}
Debug.locals.put("Title", _title);
Debug.locals.put("JustFind", _justfind);
 BA.debugLineNum = 3998;BA.debugLine="Sub SetForegroundWindowREPSOL(Title As String, Jus";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 3999;BA.debugLine="Return Me.As(JavaObject).RunMethod(\"SetForeground";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToBoolean((RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref)).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("SetForegroundWindow")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_title),(_justfind)}))));
 BA.debugLineNum = 4000;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Show (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cgestionventas","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cgestionventas parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cgestionventas parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _cffechanav = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _cffecha = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _cffechav = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _fechahoy = RemoteObject.createImmutable(0L);
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _cfstatus = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _cfnumcurrency = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _cfnumdec2 = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");
RemoteObject _cfdesart = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cgestionventas) ","cgestionventas",5,__ref.getField(false, "ba"),__ref,42);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 43;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(2048);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 45;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
Debug.ShouldStop(4096);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 46;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(8192);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 47;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(16384);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 48;BA.debugLine="frm.RootPane.LoadLayout(\"scrGestionVentas\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrGestionVentas")));
 BA.debugLineNum = 50;BA.debugLine="Sleep(0)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 52;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Gestión";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("    Gestión Ventas")));
 BA.debugLineNum = 57;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 58;BA.debugLine="JamLoadingIndicator1.Initialize(Me, frm.RootPane";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 60;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curs";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"))));
 BA.debugLineNum = 63;BA.debugLine="Dim rSub As ResumableSub=jamTableViewGestionVent";
Debug.ShouldStop(1073741824);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("GestionVentasAmpliadaPlazos.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 64;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 66;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curs";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setmousecursor" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"))));
 BA.debugLineNum = 67;BA.debugLine="Log(mRes)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","812517401",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 68;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 69;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 70;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cgestionventas", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
 BA.debugLineNum = 71;BA.debugLine="frm.Close";
Debug.ShouldStop(64);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 73;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 76;BA.debugLine="jamTableViewGestionVentas.ToolTipTableColumn(\"Do";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Documento")),(Object)(RemoteObject.createImmutable("Tooltip para columna Documento")));
 BA.debugLineNum = 77;BA.debugLine="jamTableViewGestionVentas.EstadoMenuItem(\"MenuAc";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("MenuAccionesjamTableView")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 78;BA.debugLine="jamTableViewGestionVentas.EstadoMenuItem(\"MenuLi";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(BA.ObjectToString("MenuLineajamTableView")),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 80;BA.debugLine="Dim img As Image";
Debug.ShouldStop(32768);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 81;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.pn";
Debug.ShouldStop(65536);
_img.runVoidMethod ("InitializeSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("navision.png")),(Object)(BA.numberCast(double.class, 24)),(Object)(BA.numberCast(double.class, 24)));
 BA.debugLineNum = 82;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemImag";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ver Pedido NAV")),(Object)(BA.ObjectToString("VerPedidoNAV")),(Object)(_img));
 BA.debugLineNum = 86;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemImag";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimagecolumna" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Artículo")),(Object)(BA.ObjectToString("Ver Articulo NAV")),(Object)(BA.ObjectToString("VerArticuloNAV")),(Object)(_img));
 BA.debugLineNum = 87;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemImag";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimagecolumna" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaDisponibilidad")),(Object)(BA.ObjectToString("Ver Fechas Prometidas Compra")),(Object)(BA.ObjectToString("VerFechasPrometidasCompraArticuloNAV")),(Object)(_img));
 BA.debugLineNum = 88;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemFontM";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontmaterialiconstextcolumna" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Documento")),(Object)(BA.ObjectToString("Enviar Email Transnatur-Albarán REPSOL")),(Object)(BA.ObjectToString("EnviarEmailAlbaranTransnaturREPSOL")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe0be)))))));
 BA.debugLineNum = 90;BA.debugLine="jamTableViewGestionVentas.AddMenuItemImagenToMen";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemimagentomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Prevision semanal ventas")),(Object)(BA.ObjectToString("PrevisionSemanalVentas")),(Object)(__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("predecir.png")),(Object)(BA.numberCast(double.class, 32)),(Object)(BA.numberCast(double.class, 32)));
 BA.debugLineNum = 91;BA.debugLine="jamTableViewGestionVentas.AddMenuItemFontMaterial";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontmaterialiconstomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Enviar Email Transnatur-Albarán REPSOL")),(Object)(BA.ObjectToString("EnviarEmailAlbaranTransnaturREPSOL")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe0be)))))),(Object)(__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 139;BA.debugLine="Dim CFFechaNAV As DatosCellFactoryJamTableView";
Debug.ShouldStop(1024);
_cffechanav = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFFechaNAV", _cffechanav);
 BA.debugLineNum = 140;BA.debugLine="CFFechaNAV.Initialize";
Debug.ShouldStop(2048);
_cffechanav.runVoidMethod ("Initialize");
 BA.debugLineNum = 141;BA.debugLine="CFFechaNAV.NombreFuncionCellFactory=jamTableView";
Debug.ShouldStop(4096);
_cffechanav.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafechasqlserver" /*RemoteObject*/ ));
 BA.debugLineNum = 142;BA.debugLine="CFFechaNAV.CellFactoryEnCallBack=False";
Debug.ShouldStop(8192);
_cffechanav.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 143;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cffechanav),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable(("FechaDocumento")),RemoteObject.createImmutable(("FechaMaterial")),RemoteObject.createImmutable(("FechaPlanificada")),RemoteObject.createImmutable(("FechaPrometida")),(RemoteObject.createImmutable("FechaRequerida"))})))));
 BA.debugLineNum = 146;BA.debugLine="Dim CFFecha As DatosCellFactoryJamTableView";
Debug.ShouldStop(131072);
_cffecha = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFFecha", _cffecha);
 BA.debugLineNum = 147;BA.debugLine="CFFecha.Initialize";
Debug.ShouldStop(262144);
_cffecha.runVoidMethod ("Initialize");
 BA.debugLineNum = 148;BA.debugLine="CFFecha.NombreFuncionCellFactory=jamTableViewGes";
Debug.ShouldStop(524288);
_cffecha.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafecha" /*RemoteObject*/ ));
 BA.debugLineNum = 149;BA.debugLine="CFFecha.CellFactoryEnCallBack=False";
Debug.ShouldStop(1048576);
_cffecha.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 150;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cffecha),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("FechaPrevVentasDocumento"))})))));
 BA.debugLineNum = 154;BA.debugLine="Dim CFFechaV As DatosCellFactoryJamTableView";
Debug.ShouldStop(33554432);
_cffechav = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFFechaV", _cffechav);
 BA.debugLineNum = 155;BA.debugLine="CFFechaV.Initialize";
Debug.ShouldStop(67108864);
_cffechav.runVoidMethod ("Initialize");
 BA.debugLineNum = 156;BA.debugLine="CFFechaV.NombreFuncionCellFactory=\"setFormatoCol";
Debug.ShouldStop(134217728);
_cffechav.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,BA.ObjectToString("setFormatoColumnaFechaVencida"));
 BA.debugLineNum = 158;BA.debugLine="CFFechaV.CellFactoryEnCallBack=True";
Debug.ShouldStop(536870912);
_cffechav.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 160;BA.debugLine="Dim FechaHOY As Long=DateUtils.SetDate(DateTime.";
Debug.ShouldStop(-2147483648);
_fechahoy = parent._dateutils.runMethod(true,"_setdate",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))));Debug.locals.put("FechaHOY", _fechahoy);Debug.locals.put("FechaHOY", _fechahoy);
 BA.debugLineNum = 161;BA.debugLine="CFFechaV.params=Array(FechaHOY,\"red\",\"white\")";
Debug.ShouldStop(1);
_cffechav.setField ("params" /*RemoteObject*/ ,RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_fechahoy),RemoteObject.createImmutable(("red")),(RemoteObject.createImmutable("white"))}));
 BA.debugLineNum = 162;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cffechav),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("FechaDisponibilidad")),RemoteObject.createImmutable(("FechaPrevVentasLinea")),(RemoteObject.createImmutable("FechaTeoricaEntrega"))})))));
 BA.debugLineNum = 168;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(128);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 169;BA.debugLine="CF.Initialize";
Debug.ShouldStop(256);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 170;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewGestionV";
Debug.ShouldStop(512);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_columnabooleanatipointegercheckbox" /*RemoteObject*/ ));
 BA.debugLineNum = 171;BA.debugLine="CF.CellFactoryEnCallBack=False";
Debug.ShouldStop(1024);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 173;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("Personalizado"),BA.ObjectToString("PedidoBloqueado"),BA.ObjectToString("PedidoAbierto"),RemoteObject.createImmutable("Stand_By")})))));
 BA.debugLineNum = 175;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(16384);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 176;BA.debugLine="CF.Initialize";
Debug.ShouldStop(32768);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 177;BA.debugLine="CF.NombreFuncionCellFactory=\"setColumnaBooleanaN";
Debug.ShouldStop(65536);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,BA.ObjectToString("setColumnaBooleanaNumericaColorNOSITextoVacio"));
 BA.debugLineNum = 178;BA.debugLine="CF.CellFactoryEnCallBack=True";
Debug.ShouldStop(131072);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 179;BA.debugLine="CF.params=Array(\"orangered\")";
Debug.ShouldStop(262144);
_cf.setField ("params" /*RemoteObject*/ ,RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("orangered"))}));
 BA.debugLineNum = 180;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("AlmOrigenGV")})))));
 BA.debugLineNum = 240;BA.debugLine="Dim CFStatus As DatosCellFactoryJamTableView";
Debug.ShouldStop(32768);
_cfstatus = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFStatus", _cfstatus);
 BA.debugLineNum = 241;BA.debugLine="CFStatus.Initialize";
Debug.ShouldStop(65536);
_cfstatus.runVoidMethod ("Initialize");
 BA.debugLineNum = 242;BA.debugLine="CFStatus.AliasCampoColumna=\"Status\"";
Debug.ShouldStop(131072);
_cfstatus.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("Status"));
 BA.debugLineNum = 243;BA.debugLine="CFStatus.NombreFuncionCellFactory=\"setFormatoCol";
Debug.ShouldStop(262144);
_cfstatus.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,BA.ObjectToString("setFormatoColumnaStatus"));
 BA.debugLineNum = 244;BA.debugLine="CFStatus.CellFactoryEnCallBack=True";
Debug.ShouldStop(524288);
_cfstatus.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 245;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFStatu";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cfstatus));
 BA.debugLineNum = 256;BA.debugLine="Dim CFNumCurrency As DatosCellFactoryJamTableVie";
Debug.ShouldStop(-2147483648);
_cfnumcurrency = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFNumCurrency", _cfnumcurrency);
 BA.debugLineNum = 257;BA.debugLine="CFNumCurrency.Initialize";
Debug.ShouldStop(1);
_cfnumcurrency.runVoidMethod ("Initialize");
 BA.debugLineNum = 258;BA.debugLine="CFNumCurrency.AliasCampoColumna=\"ImportePendient";
Debug.ShouldStop(2);
_cfnumcurrency.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("ImportePendiente"));
 BA.debugLineNum = 259;BA.debugLine="CFNumCurrency.NombreFuncionCellFactory=jamTableV";
Debug.ShouldStop(4);
_cfnumcurrency.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_formatomonedacolumnanumerica" /*RemoteObject*/ ));
 BA.debugLineNum = 260;BA.debugLine="CFNumCurrency.CellFactoryEnCallBack=False";
Debug.ShouldStop(8);
_cfnumcurrency.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 261;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFNumCu";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cfnumcurrency));
 BA.debugLineNum = 263;BA.debugLine="Dim CFNumDec2 As DatosCellFactoryJamTableView";
Debug.ShouldStop(64);
_cfnumdec2 = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFNumDec2", _cfnumdec2);
 BA.debugLineNum = 264;BA.debugLine="CFNumDec2.Initialize";
Debug.ShouldStop(128);
_cfnumdec2.runVoidMethod ("Initialize");
 BA.debugLineNum = 265;BA.debugLine="CFNumDec2.AliasCampoColumna=\"QtyPteNeta\"";
Debug.ShouldStop(256);
_cfnumdec2.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("QtyPteNeta"));
 BA.debugLineNum = 266;BA.debugLine="CFNumDec2.NombreFuncionCellFactory=jamTableViewG";
Debug.ShouldStop(512);
_cfnumdec2.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_formatostringdecimalescolumnanumerica" /*RemoteObject*/ ));
 BA.debugLineNum = 267;BA.debugLine="CFNumDec2.CellFactoryEnCallBack=False";
Debug.ShouldStop(1024);
_cfnumdec2.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 268;BA.debugLine="CFNumDec2.params=Array(\"#,##0.##\")";
Debug.ShouldStop(2048);
_cfnumdec2.setField ("params" /*RemoteObject*/ ,RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("#,##0.##"))}));
 BA.debugLineNum = 269;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFNumDe";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cfnumdec2));
 BA.debugLineNum = 271;BA.debugLine="Dim CFNumDec2 As DatosCellFactoryJamTableView";
Debug.ShouldStop(16384);
_cfnumdec2 = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFNumDec2", _cfnumdec2);
 BA.debugLineNum = 272;BA.debugLine="CFNumDec2.Initialize";
Debug.ShouldStop(32768);
_cfnumdec2.runVoidMethod ("Initialize");
 BA.debugLineNum = 273;BA.debugLine="CFNumDec2.AliasCampoColumna=\"StockLibre\"";
Debug.ShouldStop(65536);
_cfnumdec2.setField ("AliasCampoColumna" /*RemoteObject*/ ,BA.ObjectToString("StockLibre"));
 BA.debugLineNum = 274;BA.debugLine="CFNumDec2.NombreFuncionCellFactory=jamTableViewG";
Debug.ShouldStop(131072);
_cfnumdec2.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_formatostringdecimalescolumnanumerica" /*RemoteObject*/ ));
 BA.debugLineNum = 275;BA.debugLine="CFNumDec2.CellFactoryEnCallBack=False";
Debug.ShouldStop(262144);
_cfnumdec2.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 276;BA.debugLine="CFNumDec2.params=Array(\"#,##0.##\")";
Debug.ShouldStop(524288);
_cfnumdec2.setField ("params" /*RemoteObject*/ ,RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("#,##0.##"))}));
 BA.debugLineNum = 277;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFNumDe";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactory" /*RemoteObject*/ ,(Object)(_cfnumdec2));
 BA.debugLineNum = 283;BA.debugLine="Dim CFDesArt As DatosCellFactoryJamTableView";
Debug.ShouldStop(67108864);
_cfdesart = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CFDesArt", _cfdesart);
 BA.debugLineNum = 284;BA.debugLine="CFDesArt.Initialize";
Debug.ShouldStop(134217728);
_cfdesart.runVoidMethod ("Initialize");
 BA.debugLineNum = 285;BA.debugLine="CFDesArt.NombreFuncionCellFactory=jamTableViewGe";
Debug.ShouldStop(268435456);
_cfdesart.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).getField(true,"_cellfactory_columnawraptext" /*RemoteObject*/ ));
 BA.debugLineNum = 286;BA.debugLine="CFDesArt.CellFactoryEnCallBack=False";
Debug.ShouldStop(536870912);
_cfdesart.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 287;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cfdesart),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("DescripcionArticulo"),BA.ObjectToString("PedidoCliente"),RemoteObject.createImmutable("NombreCliente")})))));
 BA.debugLineNum = 297;BA.debugLine="jamTableViewGestionVentas.ToolTipTableColumn(\"St";
Debug.ShouldStop(256);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Status")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("L:Linea Completa."),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("P:Pedido Completo"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("+: Diponible acum>=0"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("-: Diponible acum<0"))));
 BA.debugLineNum = 300;BA.debugLine="jamTableViewGestionVentas.TableViewEditable=True";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settablevieweditable" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 304;BA.debugLine="jamTableViewGestionVentas.AlturaFilas=0";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 306;BA.debugLine="jamTableViewGestionVentas.ToolTipTableColumnColo";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableviewgestionventas" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_tooltiptablecolumncolorfondocolortextosizefont" /*RemoteObject*/ ,(Object)(BA.ObjectToString("FechaTeoricaEntrega")),(Object)(BA.ObjectToString("Fecha Material, si existe, y si no existe, Fecha de documento+Plazo configurado según Artículo-Cliente-GRP-Ruta)")),(Object)(BA.ObjectToString("BLACK")),(Object)(BA.ObjectToString("LIGHTYELLOW")),(Object)(BA.numberCast(float.class, 14)));
 BA.debugLineNum = 310;BA.debugLine="Inicio";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cgestionventas.class, "_inicio" /*RemoteObject*/ );
 BA.debugLineNum = 311;BA.debugLine="End Sub";
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
}