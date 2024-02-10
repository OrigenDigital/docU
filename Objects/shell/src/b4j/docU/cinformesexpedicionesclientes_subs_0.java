package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cinformesexpedicionesclientes_subs_0 {


public static RemoteObject  _actualizarlistacontactos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarListaContactos (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1077);
if (RapidSub.canDelegate("actualizarlistacontactos")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","actualizarlistacontactos", __ref);}
ResumableSub_ActualizarListaContactos rsub = new ResumableSub_ActualizarListaContactos(null,__ref);
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
public static class ResumableSub_ActualizarListaContactos extends BA.ResumableSub {
public ResumableSub_ActualizarListaContactos(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _i = 0;
RemoteObject _ccli = RemoteObject.declareNull("b4j.docU.main._contactocliente");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _cvend = RemoteObject.declareNull("b4j.docU.main._vendedor");
int step5;
int limit5;
int step13;
int limit13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarListaContactos (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1077);
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
 BA.debugLineNum = 1079;BA.debugLine="tvDestinatarios.Items.Clear";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 1080;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDestinatarios\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblDestinatarios")));
 BA.debugLineNum = 1081;BA.debugLine="Select True";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//select
this.state = 14;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1083;BA.debugLine="For i=0 To lstContactosPedidos.Size-1";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//for
this.state = 7;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 16;
 BA.debugLineNum = 1084;BA.debugLine="Dim cCli As ContactoCliente=lstContactosPedido";
Debug.ShouldStop(134217728);
_ccli = (__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cCli", _ccli);Debug.locals.put("cCli", _ccli);
 BA.debugLineNum = 1085;BA.debugLine="mSQL.AddNonQueryToBatch(\"insert into tblDestin";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("insert into tblDestinatarios (ClienteProtec,Tipo, Codigo, Nombre, Email, Seleccionado, EnviadoEmail, Cliente, NombreCliente, NombreResponsableCuenta) values (?,?,?,?,?,?,?,?,?,?)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {10},new Object[] {(_ccli.getField(true,"ClienteProtec" /*RemoteObject*/ )),RemoteObject.createImmutable(("Cliente")),(_ccli.getField(true,"Codigo" /*RemoteObject*/ )),(_ccli.getField(true,"Nombre" /*RemoteObject*/ )),(_ccli.getField(true,"Email" /*RemoteObject*/ )),(_ccli.getField(true,"Seleccionado" /*RemoteObject*/ )),RemoteObject.createImmutable((0)),(_ccli.getField(true,"Cliente" /*RemoteObject*/ )),(_ccli.getField(true,"NombreCliente" /*RemoteObject*/ )),(_ccli.getField(true,"NombreResponsableCuenta" /*RemoteObject*/ ))})))));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 14;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1089;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
Debug.ShouldStop(1);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1090;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "actualizarlistacontactos"), _senderfilter);
this.state = 17;
return;
case 17:
//C
this.state = 14;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1091;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","890701838",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1094;BA.debugLine="For i=0 To lstVendedores.Size-1";
Debug.ShouldStop(32);
if (true) break;

case 10:
//for
this.state = 13;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 13;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 12;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 19;
 BA.debugLineNum = 1095;BA.debugLine="Dim cVend As Vendedor=lstVendedores.Get(i)";
Debug.ShouldStop(64);
_cvend = (__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("cVend", _cvend);Debug.locals.put("cVend", _cvend);
 BA.debugLineNum = 1096;BA.debugLine="mSQL.AddNonQueryToBatch(\"insert into tblDestin";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(BA.ObjectToString("insert into tblDestinatarios (ClienteProtec,Tipo, Codigo, Nombre, Email, Seleccionado, EnviadoEmail, Cliente, NombreCliente, NombreResponsableCuenta) values (?,?,?,?,?,?,?,?,?,?)")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {10},new Object[] {RemoteObject.createImmutable((0)),RemoteObject.createImmutable(("Comercial")),(_cvend.getField(true,"Codigo" /*RemoteObject*/ )),(_cvend.getField(true,"Nombre" /*RemoteObject*/ )),(_cvend.getField(true,"Email" /*RemoteObject*/ )),(_cvend.getField(true,"Seleccionado" /*RemoteObject*/ )),RemoteObject.createImmutable((0)),RemoteObject.createImmutable(("")),RemoteObject.createImmutable(("")),(RemoteObject.createImmutable(""))})))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1100;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
Debug.ShouldStop(2048);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 1101;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "actualizarlistacontactos"), _senderfilter);
this.state = 20;
return;
case 20:
//C
this.state = 14;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1102;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","890701849",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1104;BA.debugLine="CargandoDatos=True";
Debug.ShouldStop(32768);
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1105;BA.debugLine="ActualizarTableViewDestinatarios";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_actualizartableviewdestinatarios" /*void*/ );
 BA.debugLineNum = 1106;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","actualizartableviewdestinatarios_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "actualizarlistacontactos"), null);
this.state = 21;
return;
case 21:
//C
this.state = -1;
;
 BA.debugLineNum = 1107;BA.debugLine="CargandoDatos=False";
Debug.ShouldStop(262144);
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1108;BA.debugLine="pnlFondoDestinatarios.Visible=True";
Debug.ShouldStop(524288);
__ref.getField(false,"_pnlfondodestinatarios" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 1109;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1110;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static void  _actualizartableviewdestinatarios_completed(RemoteObject __ref) throws Exception{
}
public static void  _actualizartableviewdestinatarios(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTableViewDestinatarios (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1168);
if (RapidSub.canDelegate("actualizartableviewdestinatarios")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","actualizartableviewdestinatarios", __ref); return;}
ResumableSub_ActualizarTableViewDestinatarios rsub = new ResumableSub_ActualizarTableViewDestinatarios(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActualizarTableViewDestinatarios extends BA.ResumableSub {
public ResumableSub_ActualizarTableViewDestinatarios(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _ridx = RemoteObject.createImmutable(0);
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _row = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarTableViewDestinatarios (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1168);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1169;BA.debugLine="tvDestinatarios.Items.Clear";
Debug.ShouldStop(65536);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 1170;BA.debugLine="Dim rIDx As Int";
Debug.ShouldStop(131072);
_ridx = RemoteObject.createImmutable(0);Debug.locals.put("rIDx", _ridx);
 BA.debugLineNum = 1171;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(262144);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblDestinatarios")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1172;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//do while
this.state = 4;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 1173;BA.debugLine="Dim Row() As Object=CrearFila(rIDx,rs.GetString(";
Debug.ShouldStop(1048576);
_row = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_crearfila" /*RemoteObject*/ ,(Object)(_ridx),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")))),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Nombre")))),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Email")))),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("Seleccionado")))),(Object)(_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("EnviadoEmail")))));Debug.locals.put("Row", _row);Debug.locals.put("Row", _row);
 BA.debugLineNum = 1175;BA.debugLine="rIDx=rIDx+1";
Debug.ShouldStop(4194304);
_ridx = RemoteObject.solve(new RemoteObject[] {_ridx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("rIDx", _ridx);
 BA.debugLineNum = 1176;BA.debugLine="tvDestinatarios.Items.Add(Row)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Add",(Object)((_row)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1178;BA.debugLine="rs.Close";
Debug.ShouldStop(33554432);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1179;BA.debugLine="Sleep(0)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "actualizartableviewdestinatarios"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 1180;BA.debugLine="CallSubDelayed(Me,\"ActualizarTableViewDestinatari";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("ActualizarTableViewDestinatarios_Completed")));
 BA.debugLineNum = 1181;BA.debugLine="End Sub";
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
public static RemoteObject  _analisisdestinatarios(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AnalisisDestinatarios (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,966);
if (RapidSub.canDelegate("analisisdestinatarios")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","analisisdestinatarios", __ref);}
ResumableSub_AnalisisDestinatarios rsub = new ResumableSub_AnalisisDestinatarios(null,__ref);
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
public static class ResumableSub_AnalisisDestinatarios extends BA.ResumableSub {
public ResumableSub_AnalisisDestinatarios(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("b4j.docU.main._vendedor");
RemoteObject _r = RemoteObject.declareNull("b4j.docU.main._responsablecuenta");
RemoteObject _c = RemoteObject.declareNull("b4j.docU.main._contactocliente");
RemoteObject _ml = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _flagenlista = RemoteObject.createImmutable(false);
int _j = 0;
RemoteObject _vlist = RemoteObject.declareNull("b4j.docU.main._vendedor");
RemoteObject _rlist = RemoteObject.declareNull("b4j.docU.main._responsablecuenta");
RemoteObject _clist = RemoteObject.declareNull("b4j.docU.main._contactocliente");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _robj = RemoteObject.declareNull("Object");
int step5;
int limit5;
int step17;
int limit17;
int step32;
int limit32;
int step53;
int limit53;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnalisisDestinatarios (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,966);
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
 BA.debugLineNum = 967;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(64);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 970;BA.debugLine="lstVendedores.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 971;BA.debugLine="lstResponsablesCuenta.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_lstresponsablescuenta" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 972;BA.debugLine="lstContactosPedidos.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 974;BA.debugLine="For i=0 To lstInfoDocumentos.Size-1";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//for
this.state = 37;
step5 = 1;
limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 56;
if (true) break;

case 56:
//C
this.state = 37;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 3;
if (true) break;

case 57:
//C
this.state = 56;
_i = ((int)(0 + _i + step5)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 977;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Analizando";
Debug.ShouldStop(65536);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Analizando Destinatarios Email "),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runMethod(true,"getSize")}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)),RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 978;BA.debugLine="Dim V As Vendedor";
Debug.ShouldStop(131072);
_v = RemoteObject.createNew ("b4j.docU.main._vendedor");Debug.locals.put("V", _v);
 BA.debugLineNum = 979;BA.debugLine="Dim R As ResponsableCuenta";
Debug.ShouldStop(262144);
_r = RemoteObject.createNew ("b4j.docU.main._responsablecuenta");Debug.locals.put("R", _r);
 BA.debugLineNum = 980;BA.debugLine="Dim C As ContactoCliente";
Debug.ShouldStop(524288);
_c = RemoteObject.createNew ("b4j.docU.main._contactocliente");Debug.locals.put("C", _c);
 BA.debugLineNum = 982;BA.debugLine="Dim mL As Map=lstInfoDocumentos.Get(i)";
Debug.ShouldStop(2097152);
_ml = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ml = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), __ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mL", _ml);Debug.locals.put("mL", _ml);
 BA.debugLineNum = 983;BA.debugLine="V.Initialize";
Debug.ShouldStop(4194304);
_v.runVoidMethod ("Initialize");
 BA.debugLineNum = 984;BA.debugLine="V.Codigo=mL.Get(\"Comercial\")";
Debug.ShouldStop(8388608);
_v.setField ("Codigo" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Comercial"))))));
 BA.debugLineNum = 985;BA.debugLine="V.Nombre=mL.Get(\"NombreComercial\")";
Debug.ShouldStop(16777216);
_v.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreComercial"))))));
 BA.debugLineNum = 986;BA.debugLine="V.Email=mL.Get(\"EmailComercial\")";
Debug.ShouldStop(33554432);
_v.setField ("Email" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EmailComercial"))))));
 BA.debugLineNum = 987;BA.debugLine="V.Email=V.Email.ToLowerCase";
Debug.ShouldStop(67108864);
_v.setField ("Email" /*RemoteObject*/ ,_v.getField(true,"Email" /*RemoteObject*/ ).runMethod(true,"toLowerCase"));
 BA.debugLineNum = 989;BA.debugLine="Dim FlagEnLista As Boolean";
Debug.ShouldStop(268435456);
_flagenlista = RemoteObject.createImmutable(false);Debug.locals.put("FlagEnLista", _flagenlista);
 BA.debugLineNum = 990;BA.debugLine="For j=0 To lstVendedores.Size-1";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//for
this.state = 11;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
Debug.locals.put("j", _j);
this.state = 58;
if (true) break;

case 58:
//C
this.state = 11;
if ((step17 > 0 && _j <= limit17) || (step17 < 0 && _j >= limit17)) this.state = 6;
if (true) break;

case 59:
//C
this.state = 58;
_j = ((int)(0 + _j + step17)) ;
Debug.locals.put("j", _j);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 991;BA.debugLine="Dim vList As Vendedor=lstVendedores.Get(j)";
Debug.ShouldStop(1073741824);
_vlist = (__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("vList", _vlist);Debug.locals.put("vList", _vlist);
 BA.debugLineNum = 992;BA.debugLine="If vList.Codigo=V.Codigo Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_vlist.getField(true,"Codigo" /*RemoteObject*/ ),_v.getField(true,"Codigo" /*RemoteObject*/ ))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 993;BA.debugLine="FlagEnLista=True";
Debug.ShouldStop(1);
_flagenlista = parent.__c.getField(true,"True");Debug.locals.put("FlagEnLista", _flagenlista);
 BA.debugLineNum = 994;BA.debugLine="Exit";
Debug.ShouldStop(2);
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 59;
;
 if (true) break;
if (true) break;
Debug.locals.put("j", _j);
;
 BA.debugLineNum = 997;BA.debugLine="If FlagEnLista=False Then";
Debug.ShouldStop(16);

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_flagenlista,parent.__c.getField(true,"False"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 998;BA.debugLine="lstVendedores.Add(V)";
Debug.ShouldStop(32);
__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_v)));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 1001;BA.debugLine="R.Initialize";
Debug.ShouldStop(256);
_r.runVoidMethod ("Initialize");
 BA.debugLineNum = 1002;BA.debugLine="R.Codigo=mL.Get(\"ResponsableCuenta\")";
Debug.ShouldStop(512);
_r.setField ("Codigo" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ResponsableCuenta"))))));
 BA.debugLineNum = 1003;BA.debugLine="R.Nombre=mL.Get(\"NombreResponsableCuenta\")";
Debug.ShouldStop(1024);
_r.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreResponsableCuenta"))))));
 BA.debugLineNum = 1004;BA.debugLine="R.Email=mL.Get(\"EmailResponsableCuenta\")";
Debug.ShouldStop(2048);
_r.setField ("Email" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EmailResponsableCuenta"))))));
 BA.debugLineNum = 1006;BA.debugLine="Dim FlagEnLista As Boolean";
Debug.ShouldStop(8192);
_flagenlista = RemoteObject.createImmutable(false);Debug.locals.put("FlagEnLista", _flagenlista);
 BA.debugLineNum = 1007;BA.debugLine="For j=0 To lstResponsablesCuenta.Size-1";
Debug.ShouldStop(16384);
if (true) break;

case 15:
//for
this.state = 22;
step32 = 1;
limit32 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstresponsablescuenta" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
Debug.locals.put("j", _j);
this.state = 60;
if (true) break;

case 60:
//C
this.state = 22;
if ((step32 > 0 && _j <= limit32) || (step32 < 0 && _j >= limit32)) this.state = 17;
if (true) break;

case 61:
//C
this.state = 60;
_j = ((int)(0 + _j + step32)) ;
Debug.locals.put("j", _j);
if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1008;BA.debugLine="Dim RList As ResponsableCuenta=lstResponsablesC";
Debug.ShouldStop(32768);
_rlist = (__ref.getField(false,"_lstresponsablescuenta" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("RList", _rlist);Debug.locals.put("RList", _rlist);
 BA.debugLineNum = 1009;BA.debugLine="If RList.Codigo=R.Codigo Then";
Debug.ShouldStop(65536);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_rlist.getField(true,"Codigo" /*RemoteObject*/ ),_r.getField(true,"Codigo" /*RemoteObject*/ ))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1010;BA.debugLine="FlagEnLista=True";
Debug.ShouldStop(131072);
_flagenlista = parent.__c.getField(true,"True");Debug.locals.put("FlagEnLista", _flagenlista);
 BA.debugLineNum = 1011;BA.debugLine="Exit";
Debug.ShouldStop(262144);
this.state = 22;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 61;
;
 if (true) break;
if (true) break;
Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1014;BA.debugLine="If FlagEnLista=False Then";
Debug.ShouldStop(2097152);

case 22:
//if
this.state = 25;
if (RemoteObject.solveBoolean("=",_flagenlista,parent.__c.getField(true,"False"))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
 BA.debugLineNum = 1015;BA.debugLine="lstResponsablesCuenta.Add(R)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lstresponsablescuenta" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_r)));
 if (true) break;

case 25:
//C
this.state = 26;
;
 BA.debugLineNum = 1018;BA.debugLine="C.Initialize";
Debug.ShouldStop(33554432);
_c.runVoidMethod ("Initialize");
 BA.debugLineNum = 1019;BA.debugLine="C.ClienteProtec=Utilidades.FixNullInt(mL.Get(\"Cl";
Debug.ShouldStop(67108864);
_c.setField ("ClienteProtec" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ClienteProtec")))))));
 BA.debugLineNum = 1020;BA.debugLine="C.Codigo=mL.Get(\"Contacto\")";
Debug.ShouldStop(134217728);
_c.setField ("Codigo" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Contacto"))))));
 BA.debugLineNum = 1021;BA.debugLine="C.Nombre=mL.Get(\"NombreContacto\")";
Debug.ShouldStop(268435456);
_c.setField ("Nombre" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreContacto"))))));
 BA.debugLineNum = 1022;BA.debugLine="C.Email=mL.Get(\"EmailContacto\")";
Debug.ShouldStop(536870912);
_c.setField ("Email" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("EmailContacto"))))));
 BA.debugLineNum = 1023;BA.debugLine="C.Email=C.Email.ToLowerCase";
Debug.ShouldStop(1073741824);
_c.setField ("Email" /*RemoteObject*/ ,_c.getField(true,"Email" /*RemoteObject*/ ).runMethod(true,"toLowerCase"));
 BA.debugLineNum = 1024;BA.debugLine="C.Seleccionado=False";
Debug.ShouldStop(-2147483648);
_c.setField ("Seleccionado" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1025;BA.debugLine="C.Cliente=mL.Get(\"Cliente\")";
Debug.ShouldStop(1);
_c.setField ("Cliente" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cliente"))))));
 BA.debugLineNum = 1026;BA.debugLine="C.NombreCliente=mL.Get(\"NombreCliente\")";
Debug.ShouldStop(2);
_c.setField ("NombreCliente" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreCliente"))))));
 BA.debugLineNum = 1027;BA.debugLine="C.NombreResponsableCuenta=mL.Get(\"NombreResponsa";
Debug.ShouldStop(4);
_c.setField ("NombreResponsableCuenta" /*RemoteObject*/ ,BA.ObjectToString(_ml.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NombreResponsableCuenta"))))));
 BA.debugLineNum = 1029;BA.debugLine="Dim FlagEnLista As Boolean";
Debug.ShouldStop(16);
_flagenlista = RemoteObject.createImmutable(false);Debug.locals.put("FlagEnLista", _flagenlista);
 BA.debugLineNum = 1030;BA.debugLine="For j=0 To lstContactosPedidos.Size-1";
Debug.ShouldStop(32);
if (true) break;

case 26:
//for
this.state = 33;
step53 = 1;
limit53 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
Debug.locals.put("j", _j);
this.state = 62;
if (true) break;

case 62:
//C
this.state = 33;
if ((step53 > 0 && _j <= limit53) || (step53 < 0 && _j >= limit53)) this.state = 28;
if (true) break;

case 63:
//C
this.state = 62;
_j = ((int)(0 + _j + step53)) ;
Debug.locals.put("j", _j);
if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1031;BA.debugLine="Dim cList As ContactoCliente=lstContactosPedido";
Debug.ShouldStop(64);
_clist = (__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("cList", _clist);Debug.locals.put("cList", _clist);
 BA.debugLineNum = 1032;BA.debugLine="If cList.Codigo=C.Codigo Then";
Debug.ShouldStop(128);
if (true) break;

case 29:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_clist.getField(true,"Codigo" /*RemoteObject*/ ),_c.getField(true,"Codigo" /*RemoteObject*/ ))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1033;BA.debugLine="FlagEnLista=True";
Debug.ShouldStop(256);
_flagenlista = parent.__c.getField(true,"True");Debug.locals.put("FlagEnLista", _flagenlista);
 BA.debugLineNum = 1034;BA.debugLine="Exit";
Debug.ShouldStop(512);
this.state = 33;
if (true) break;
 if (true) break;

case 32:
//C
this.state = 63;
;
 if (true) break;
if (true) break;
Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1037;BA.debugLine="If FlagEnLista=False Then";
Debug.ShouldStop(4096);

case 33:
//if
this.state = 36;
if (RemoteObject.solveBoolean("=",_flagenlista,parent.__c.getField(true,"False"))) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1038;BA.debugLine="lstContactosPedidos.Add(C)";
Debug.ShouldStop(8192);
__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_c)));
 if (true) break;

case 36:
//C
this.state = 57;
;
 if (true) break;
if (true) break;

case 37:
//C
this.state = 38;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1045;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 1046;BA.debugLine="Select True";
Debug.ShouldStop(2097152);
if (true) break;

case 38:
//select
this.state = 55;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
this.state = 40;
if (true) break;
}
case 1: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 40:
//C
this.state = 41;
 BA.debugLineNum = 1048;BA.debugLine="If lstContactosPedidos.Size=0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 41:
//if
this.state = 46;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
 BA.debugLineNum = 1049;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay cont";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay contactos con direcciones de email para los documentos del periodo")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1050;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 46;
;
 if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1053;BA.debugLine="wait for (ActualizarListaContactos) complete (";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_actualizarlistacontactos" /*RemoteObject*/ ));
this.state = 65;
return;
case 65:
//C
this.state = 46;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 46:
//C
this.state = 55;
;
 if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1056;BA.debugLine="If lstVendedores.Size=0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 49:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 51;
}else {
this.state = 53;
}if (true) break;

case 51:
//C
this.state = 54;
 BA.debugLineNum = 1057;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay cont";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay contactos de comercial con direcciones de email para los documentos del periodo")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1058;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), _msa);
this.state = 66;
return;
case 66:
//C
this.state = 54;
;
 if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 1061;BA.debugLine="wait for (ActualizarListaContactos) complete (";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "analisisdestinatarios"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_actualizarlistacontactos" /*RemoteObject*/ ));
this.state = 67;
return;
case 67:
//C
this.state = 54;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
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
 BA.debugLineNum = 1065;BA.debugLine="Return Null";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 1066;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _robj) throws Exception{
}
public static void  _btnactualizarinfo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizarInfo_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,469);
if (RapidSub.canDelegate("btnactualizarinfo_click")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","btnactualizarinfo_click", __ref); return;}
ResumableSub_btnActualizarInfo_Click rsub = new ResumableSub_btnActualizarInfo_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnActualizarInfo_Click extends BA.ResumableSub {
public ResumableSub_btnActualizarInfo_Click(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActualizarInfo_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,469);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 473;BA.debugLine="lblTipoInforme.Visible=False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lbltipoinforme" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 474;BA.debugLine="cboTipoInforme.Visible=False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_cbotipoinforme" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 476;BA.debugLine="pnlFondoDestinatarios.Visible=False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlfondodestinatarios" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 478;BA.debugLine="If FechaFinal=0 And FechaInicial=0 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechafinal" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_fechainicial" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 479;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica Fecha";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Indica Fecha Inicial y Fecha Final")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 480;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 4;
;
 BA.debugLineNum = 481;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 483;BA.debugLine="If FechaFinal=0 And FechaInicial<>0 Then";
Debug.ShouldStop(4);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_fechafinal" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("!",__ref.getField(true,"_fechainicial" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 484;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica Fecha";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Indica Fecha Final")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 485;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 7;
;
 BA.debugLineNum = 486;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 488;BA.debugLine="If FechaFinal<>0 And FechaInicial=0 Then";
Debug.ShouldStop(128);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_fechafinal" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_fechainicial" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 489;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica Fecha";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Indica Fecha Inicial")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 490;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 10;
;
 BA.debugLineNum = 491;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 493;BA.debugLine="If DateTime.Date(FechaInicial)=DateTime.date(Fech";
Debug.ShouldStop(4096);

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechainicial" /*RemoteObject*/ ))),parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinal" /*RemoteObject*/ ))))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 495;BA.debugLine="PeriodoInforme=txtFechaFinal.Text.Replace(\"/\",\"-";
Debug.ShouldStop(16384);
__ref.setField ("_periodoinforme" /*RemoteObject*/ ,__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-"))));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 498;BA.debugLine="PeriodoInforme=\"Periodo \" & txtFechaFinal.Text.R";
Debug.ShouldStop(131072);
__ref.setField ("_periodoinforme" /*RemoteObject*/ ,RemoteObject.concat(RemoteObject.createImmutable("Periodo "),__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-"))),RemoteObject.createImmutable(" a "),__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")))));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 501;BA.debugLine="CargandoItemsCboTipoInforme=True";
Debug.ShouldStop(1048576);
__ref.setField ("_cargandoitemscbotipoinforme" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 502;BA.debugLine="cboTipoInforme.Value=\"\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_cbotipoinforme" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 507;BA.debugLine="lstDocumentosExpedidos.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_lstdocumentosexpedidos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 508;BA.debugLine="lstDocumentosExpedidosUnicos.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 509;BA.debugLine="lstInfoDocumentos.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 510;BA.debugLine="Log(\"inicio CargaDocumentosExpedidosPeriodoTransp";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","890046505",RemoteObject.createImmutable("inicio CargaDocumentosExpedidosPeriodoTransporteExterno"),0);
 BA.debugLineNum = 511;BA.debugLine="Wait For (CargaDocumentosExpedidosPeriodoTranspor";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargadocumentosexpedidosperiodotransporteexterno" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_fechainicial" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_fechafinal" /*RemoteObject*/ ))));
this.state = 33;
return;
case 33:
//C
this.state = 16;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 512;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 16:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 513;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error en quer";
Debug.ShouldStop(1);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error en query DocumentosExpedidosPeriodoTransporteExterno /Conexion servidor ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 514;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 19;
;
 BA.debugLineNum = 515;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return ;
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 517;BA.debugLine="Log(\"fin CargaDocumentosExpedidosPeriodoTransport";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","890046512",RemoteObject.createImmutable("fin CargaDocumentosExpedidosPeriodoTransporteExterno"),0);
 BA.debugLineNum = 518;BA.debugLine="Log(\"inicio CargaDocumentosAsignadosARepartoPerio";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","890046513",RemoteObject.createImmutable("inicio CargaDocumentosAsignadosARepartoPeriodo"),0);
 BA.debugLineNum = 519;BA.debugLine="Wait For (CargaDocumentosAsignadosARepartoPeriodo";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargadocumentosasignadosarepartoperiodo" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_fechainicial" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_fechafinal" /*RemoteObject*/ ))));
this.state = 35;
return;
case 35:
//C
this.state = 20;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 520;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(128);
if (true) break;

case 20:
//if
this.state = 23;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 521;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error en quer";
Debug.ShouldStop(256);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error en query DocumentosAsignadosARepartoPeriodo /Conexion servidor ")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 522;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 23;
;
 BA.debugLineNum = 523;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 24;
;
 BA.debugLineNum = 525;BA.debugLine="Log(\"fin CargaDocumentosAsignadosARepartoPeriodo\"";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","890046520",RemoteObject.createImmutable("fin CargaDocumentosAsignadosARepartoPeriodo"),0);
 BA.debugLineNum = 526;BA.debugLine="Log(\"fin carga docs\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","890046521",RemoteObject.createImmutable("fin carga docs"),0);
 BA.debugLineNum = 527;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(16384);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 528;BA.debugLine="If lstDocumentosExpedidos.Size=0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 24:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lstdocumentosexpedidos" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 BA.debugLineNum = 529;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay docume";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay documentos expedidos/asignados a reparto en el periodo seleccionado")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 530;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnactualizarinfo_click"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 532;BA.debugLine="lblTipoInforme.Visible=True";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbltipoinforme" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 BA.debugLineNum = 533;BA.debugLine="cboTipoInforme.Visible=True";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cbotipoinforme" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"True"));
 if (true) break;

case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 535;BA.debugLine="CargandoItemsCboTipoInforme=False";
Debug.ShouldStop(4194304);
__ref.setField ("_cargandoitemscbotipoinforme" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 537;BA.debugLine="End Sub";
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
public static RemoteObject  _btnfechafinal_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnFechaFinal_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,400);
if (RapidSub.canDelegate("btnfechafinal_click")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","btnfechafinal_click", __ref);}
 BA.debugLineNum = 400;BA.debugLine="Sub btnFechaFinal_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 401;BA.debugLine="SeleccionFecha(\"Final\")";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_seleccionfecha" /*void*/ ,(Object)(RemoteObject.createImmutable("Final")));
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnfechainicial_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnFechaInicial_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,396);
if (RapidSub.canDelegate("btnfechainicial_click")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","btnfechainicial_click", __ref);}
 BA.debugLineNum = 396;BA.debugLine="Sub btnFechaInicial_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 397;BA.debugLine="SeleccionFecha(\"Inicial\")";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_seleccionfecha" /*void*/ ,(Object)(RemoteObject.createImmutable("Inicial")));
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btngenerarinformesemail_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnGenerarInformesEmail_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1345);
if (RapidSub.canDelegate("btngenerarinformesemail_click")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","btngenerarinformesemail_click", __ref); return;}
ResumableSub_btnGenerarInformesEmail_Click rsub = new ResumableSub_btnGenerarInformesEmail_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnGenerarInformesEmail_Click extends BA.ResumableSub {
public ResumableSub_btnGenerarInformesEmail_Click(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _sbaviso = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _ncontactosseleccionadossinemail = RemoteObject.createImmutable(0);
RemoteObject _ncontactosseleccionadosconemail = RemoteObject.createImmutable(0);
RemoteObject _ncontactosemailenviado = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _lstemaddrerr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sbemadderr = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _emailaddress = RemoteObject.createImmutable("");
RemoteObject _lstpedptes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _numemailsenviar = RemoteObject.createImmutable(0);
RemoteObject _intervalo = RemoteObject.createImmutable(0);
RemoteObject _lstinfodocsenviadoscontacto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstpedptescontacto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _codigodestinatario = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ctaprotec = RemoteObject.createImmutable(false);
RemoteObject _rbool = RemoteObject.createImmutable(false);
RemoteObject _lstinfodocsenviadoscomercial = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lstpedptescomercial = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject group83;
int index83;
int groupLen83;
RemoteObject group110;
int index110;
int groupLen110;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnGenerarInformesEmail_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1345);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1347;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
Debug.ShouldStop(4);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtemailalternativo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1348;BA.debugLine="If IsEmail(txtEmailAlternativo.Text)=False Then";
Debug.ShouldStop(8);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_isemail" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txtemailalternativo" /*RemoteObject*/ ).runMethod(true,"getText"))),parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1349;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La dirección";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("La dirección de email "),__ref.getField(false,"_txtemailalternativo" /*RemoteObject*/ ).runMethod(true,"getText"),RemoteObject.createImmutable(" no es una dirección de email válida"))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1350;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 85;
return;
case 85:
//C
this.state = 7;
;
 BA.debugLineNum = 1351;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
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
 BA.debugLineNum = 1355;BA.debugLine="Dim sbAviso As StringBuilder";
Debug.ShouldStop(1024);
_sbaviso = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbAviso", _sbaviso);
 BA.debugLineNum = 1356;BA.debugLine="sbAviso.Initialize";
Debug.ShouldStop(2048);
_sbaviso.runVoidMethod ("Initialize");
 BA.debugLineNum = 1357;BA.debugLine="sbAviso.Append(\"¿Enviar los informes para los des";
Debug.ShouldStop(4096);
_sbaviso.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("¿Enviar los informes para los destinatarios seleccionados?")));
 BA.debugLineNum = 1358;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtemailalternativo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 1359;BA.debugLine="sbAviso.Append(CRLF).append(CRLF).Append(\"Se ha";
Debug.ShouldStop(16384);
_sbaviso.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Se ha indicado una dirección de email alternativo. Todos los informes seleccionados se enviarán a esa dirección, en lugar del destinatario correspondiente.")));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1361;BA.debugLine="sbAviso.Append(CRLF).append(CRLF).Append(\"NO se";
Debug.ShouldStop(65536);
_sbaviso.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("NO se ha indicado una dirección de email alternativo. Todos los informes seleccionados se enviarán al destinatario correspondiente.")));
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 1364;BA.debugLine="Dim msa As Object=xui.Msgbox2Async(sbAviso.ToStri";
Debug.ShouldStop(524288);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(_sbaviso.runMethod(true,"ToString")),(Object)(BA.ObjectToString("Confirma:")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1366;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 86;
return;
case 86:
//C
this.state = 15;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1367;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.ShouldStop(4194304);
if (true) break;

case 15:
//if
this.state = 18;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 1368;BA.debugLine="Log(\"envío de informes cancelado\")";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","891095063",RemoteObject.createImmutable("envío de informes cancelado"),0);
 BA.debugLineNum = 1369;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1373;BA.debugLine="lblProgress.Text=\"Generando informes y enviando e";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblprogress" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString("Generando informes y enviando emails."));
 BA.debugLineNum = 1374;BA.debugLine="lstErrores.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lsterrores" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1375;BA.debugLine="Dim nContactosSeleccionadosSinEmail As Int=mSQL.E";
Debug.ShouldStop(1073741824);
_ncontactosseleccionadossinemail = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((1)),(RemoteObject.createImmutable(""))}))))));Debug.locals.put("nContactosSeleccionadosSinEmail", _ncontactosseleccionadossinemail);Debug.locals.put("nContactosSeleccionadosSinEmail", _ncontactosseleccionadossinemail);
 BA.debugLineNum = 1377;BA.debugLine="Dim nContactosSeleccionadosConEmail As Int=mSQL.E";
Debug.ShouldStop(1);
_ncontactosseleccionadosconemail = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((1)),(RemoteObject.createImmutable(""))}))))));Debug.locals.put("nContactosSeleccionadosConEmail", _ncontactosseleccionadosconemail);Debug.locals.put("nContactosSeleccionadosConEmail", _ncontactosseleccionadosconemail);
 BA.debugLineNum = 1379;BA.debugLine="If nContactosSeleccionadosConEmail=0 Then";
Debug.ShouldStop(4);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_ncontactosseleccionadosconemail,BA.numberCast(double.class, 0))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1380;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay selecc";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay seleccionado ningún destinatario para el informe")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1381;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 22;
;
 BA.debugLineNum = 1382;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 1387;BA.debugLine="Dim nContactosEmailEnviado As Int=mSQL.ExecQueryS";
Debug.ShouldStop(1024);
_ncontactosemailenviado = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(Codigo) from tblDestinatarios where Seleccionado=? and Email=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {RemoteObject.createImmutable((1)),(RemoteObject.createImmutable(""))}))))));Debug.locals.put("nContactosEmailEnviado", _ncontactosemailenviado);Debug.locals.put("nContactosEmailEnviado", _ncontactosemailenviado);
 BA.debugLineNum = 1391;BA.debugLine="If nContactosSeleccionadosSinEmail>0 Then";
Debug.ShouldStop(16384);
if (true) break;

case 23:
//if
this.state = 30;
if (RemoteObject.solveBoolean(">",_ncontactosseleccionadossinemail,BA.numberCast(double.class, 0))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 1392;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32768);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1393;BA.debugLine="sb.Initialize";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1394;BA.debugLine="sb.Append(\"Hay contactos seleccionados sin direc";
Debug.ShouldStop(131072);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Hay contactos seleccionados sin dirección de email.")));
 BA.debugLineNum = 1395;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(262144);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1396;BA.debugLine="sb.Append(\"¿Continuar sin enviar informe a estos";
Debug.ShouldStop(524288);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("¿Continuar sin enviar informe a estos contactos?")));
 BA.debugLineNum = 1397;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(1048576);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1398;BA.debugLine="sb.Append(\"(Puedes cancelar esta acción, configu";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(Puedes cancelar esta acción, configurar la dirección de email en navision, y volver a lanzar el informe.)")));
 BA.debugLineNum = 1399;BA.debugLine="Dim msa As Object=xui.Msgbox2Async(sb.ToString,\"";
Debug.ShouldStop(4194304);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(_sb.runMethod(true,"ToString")),(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1400;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 88;
return;
case 88:
//C
this.state = 26;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1401;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
Debug.ShouldStop(16777216);
if (true) break;

case 26:
//if
this.state = 29;
if (RemoteObject.solveBoolean("!",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 1402;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
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
 BA.debugLineNum = 1407;BA.debugLine="Dim lstEmAddrErr As List";
Debug.ShouldStop(1073741824);
_lstemaddrerr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstEmAddrErr", _lstemaddrerr);
 BA.debugLineNum = 1408;BA.debugLine="lstEmAddrErr.Initialize";
Debug.ShouldStop(-2147483648);
_lstemaddrerr.runVoidMethod ("Initialize");
 BA.debugLineNum = 1409;BA.debugLine="Dim sbEmAddErr As StringBuilder";
Debug.ShouldStop(1);
_sbemadderr = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbEmAddErr", _sbemadderr);
 BA.debugLineNum = 1410;BA.debugLine="sbEmAddErr.Initialize";
Debug.ShouldStop(2);
_sbemadderr.runVoidMethod ("Initialize");
 BA.debugLineNum = 1411;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select * fro";
Debug.ShouldStop(4);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select * from tblDestinatarios where Seleccionado=? and Email<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(1),RemoteObject.createImmutable("")})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1412;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(8);
if (true) break;

case 31:
//do while
this.state = 38;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 33;
if (true) break;
}
if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 1413;BA.debugLine="Dim EmailAddress As String=rs.GetString(\"Email\")";
Debug.ShouldStop(16);
_emailaddress = _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Email")));Debug.locals.put("EmailAddress", _emailaddress);Debug.locals.put("EmailAddress", _emailaddress);
 BA.debugLineNum = 1414;BA.debugLine="If IsEmail(EmailAddress.Trim)=False Then";
Debug.ShouldStop(32);
if (true) break;

case 34:
//if
this.state = 37;
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_isemail" /*RemoteObject*/ ,(Object)(_emailaddress.runMethod(true,"trim"))),parent.__c.getField(true,"False"))) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 1415;BA.debugLine="lstEmAddrErr.Add(EmailAddress)";
Debug.ShouldStop(64);
_lstemaddrerr.runVoidMethod ("Add",(Object)((_emailaddress)));
 BA.debugLineNum = 1416;BA.debugLine="sbEmAddErr.Append(EmailAddress).Append(\",\")";
Debug.ShouldStop(128);
_sbemadderr.runMethod(false,"Append",(Object)(_emailaddress)).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(",")));
 if (true) break;

case 37:
//C
this.state = 31;
;
 if (true) break;

case 38:
//C
this.state = 39;
;
 BA.debugLineNum = 1419;BA.debugLine="rs.close";
Debug.ShouldStop(1024);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1421;BA.debugLine="If lstEmAddrErr.Size>0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean(">",_lstemaddrerr.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 1422;BA.debugLine="sbEmAddErr.Remove(sbEmAddErr.Length-1,sbEmAddErr";
Debug.ShouldStop(8192);
_sbemadderr.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sbemadderr.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sbemadderr.runMethod(true,"getLength")));
 BA.debugLineNum = 1423;BA.debugLine="Dim msa As Object=xui.Msgbox2Async(\"Las siguient";
Debug.ShouldStop(16384);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Las siguientes direcciones de email seleccionadas son erróneas."),parent.__c.getField(true,"CRLF"),_sbemadderr.runMethod(true,"ToString"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Es necesario corregirlas, o desmarcarlas."))),(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1424;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha inic";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha inicial no puede ser posterior a la fecha final")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1425;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 89;
return;
case 89:
//C
this.state = 42;
;
 BA.debugLineNum = 1426;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 1429;BA.debugLine="jamCircularProgressBar1.Value=0";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 1430;BA.debugLine="jamCircularProgressBar1.Visible=True";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvisible" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1432;BA.debugLine="Select True";
Debug.ShouldStop(8388608);
if (true) break;

case 43:
//select
this.state = 78;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
this.state = 45;
if (true) break;
}
case 1: {
this.state = 65;
if (true) break;
}
}
if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 1436;BA.debugLine="Dim lstPedPtes As List";
Debug.ShouldStop(134217728);
_lstpedptes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPedPtes", _lstpedptes);
 BA.debugLineNum = 1437;BA.debugLine="Dim NumEmailsEnviar As Int=Utilidades.FixNullIn";
Debug.ShouldStop(268435456);
_numemailsenviar = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblDestinatarios where Seleccionado=? and Email<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(1),RemoteObject.createImmutable("")}))))))));Debug.locals.put("NumEmailsEnviar", _numemailsenviar);Debug.locals.put("NumEmailsEnviar", _numemailsenviar);
 BA.debugLineNum = 1438;BA.debugLine="Dim Intervalo As Int=Round((100/NumEmailsEnviar";
Debug.ShouldStop(536870912);
_intervalo = BA.numberCast(int.class, parent.__c.runMethod(true,"Round",(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_numemailsenviar}, "/",0, 0)))));Debug.locals.put("Intervalo", _intervalo);Debug.locals.put("Intervalo", _intervalo);
 BA.debugLineNum = 1439;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select * f";
Debug.ShouldStop(1073741824);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select * from tblDestinatarios where Seleccionado=? and Email<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(1),RemoteObject.createImmutable("")})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1440;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(-2147483648);
if (true) break;

case 46:
//do while
this.state = 63;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 48;
if (true) break;
}
if (true) break;

case 48:
//C
this.state = 49;
 BA.debugLineNum = 1442;BA.debugLine="Dim lstInfoDocsEnviadosContacto As List";
Debug.ShouldStop(2);
_lstinfodocsenviadoscontacto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstInfoDocsEnviadosContacto", _lstinfodocsenviadoscontacto);
 BA.debugLineNum = 1443;BA.debugLine="lstInfoDocsEnviadosContacto.Initialize";
Debug.ShouldStop(4);
_lstinfodocsenviadoscontacto.runVoidMethod ("Initialize");
 BA.debugLineNum = 1445;BA.debugLine="Dim lstPedPtesContacto As List";
Debug.ShouldStop(16);
_lstpedptescontacto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPedPtesContacto", _lstpedptescontacto);
 BA.debugLineNum = 1446;BA.debugLine="lstPedPtesContacto.Initialize";
Debug.ShouldStop(32);
_lstpedptescontacto.runVoidMethod ("Initialize");
 BA.debugLineNum = 1447;BA.debugLine="Dim CodigoDestinatario As String=rs.GetString(";
Debug.ShouldStop(64);
_codigodestinatario = _rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")));Debug.locals.put("CodigoDestinatario", _codigodestinatario);Debug.locals.put("CodigoDestinatario", _codigodestinatario);
 BA.debugLineNum = 1448;BA.debugLine="Wait For (CargaPedidosVentaNoAbiertosPendiente";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargapedidosventanoabiertospendientescontacto" /*RemoteObject*/ ,(Object)(_codigodestinatario)));
this.state = 90;
return;
case 90:
//C
this.state = 49;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1449;BA.debugLine="If mResult.Get(\"ReqOK\")=True Then";
Debug.ShouldStop(256);
if (true) break;

case 49:
//if
this.state = 56;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"True")))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 BA.debugLineNum = 1450;BA.debugLine="Dim lstPedPtes As List=mResult.Get(\"lstPedido";
Debug.ShouldStop(512);
_lstpedptes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstpedptes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstPedidosPendientesContacto")))));Debug.locals.put("lstPedPtes", _lstpedptes);Debug.locals.put("lstPedPtes", _lstpedptes);
 BA.debugLineNum = 1451;BA.debugLine="For Each mP As Map In lstPedPtes";
Debug.ShouldStop(1024);
if (true) break;

case 52:
//for
this.state = 55;
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group83 = _lstpedptes;
index83 = 0;
groupLen83 = group83.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mP", _mp);
this.state = 91;
if (true) break;

case 91:
//C
this.state = 55;
if (index83 < groupLen83) {
this.state = 54;
_mp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group83.runMethod(false,"Get",index83));Debug.locals.put("mP", _mp);}
if (true) break;

case 92:
//C
this.state = 91;
index83++;
Debug.locals.put("mP", _mp);
if (true) break;

case 54:
//C
this.state = 92;
 BA.debugLineNum = 1452;BA.debugLine="lstPedPtesContacto.Add(mP)";
Debug.ShouldStop(2048);
_lstpedptescontacto.runVoidMethod ("Add",(Object)((_mp.getObject())));
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
Debug.locals.put("mP", _mp);
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 BA.debugLineNum = 1455;BA.debugLine="Dim CtaProtec As Boolean";
Debug.ShouldStop(16384);
_ctaprotec = RemoteObject.createImmutable(false);Debug.locals.put("CtaProtec", _ctaprotec);
 BA.debugLineNum = 1456;BA.debugLine="If rs.GetInt(\"ClienteProtec\")=1 Then";
Debug.ShouldStop(32768);
if (true) break;

case 57:
//if
this.state = 62;
if (RemoteObject.solveBoolean("=",_rs.runMethod(true,"GetInt",(Object)(RemoteObject.createImmutable("ClienteProtec"))),BA.numberCast(double.class, 1))) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
 BA.debugLineNum = 1457;BA.debugLine="CtaProtec=True";
Debug.ShouldStop(65536);
_ctaprotec = parent.__c.getField(true,"True");Debug.locals.put("CtaProtec", _ctaprotec);
 if (true) break;

case 61:
//C
this.state = 62;
 BA.debugLineNum = 1459;BA.debugLine="CtaProtec=False";
Debug.ShouldStop(262144);
_ctaprotec = parent.__c.getField(true,"False");Debug.locals.put("CtaProtec", _ctaprotec);
 if (true) break;

case 62:
//C
this.state = 46;
;
 BA.debugLineNum = 1462;BA.debugLine="wait for(ExportarDatosInformeAExcel(CtaProtec,";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_exportardatosinformeaexcel" /*RemoteObject*/ ,(Object)(_ctaprotec),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")))),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Nombre")))),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Email")))),(Object)(_lstpedptescontacto)));
this.state = 93;
return;
case 93:
//C
this.state = 46;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1468;BA.debugLine="jamCircularProgressBar1.Value=Min(jamCircularP";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_getvalue" /*RemoteObject*/ ),_intervalo}, "+",1, 0)),(Object)(BA.numberCast(double.class, 100)))));
 BA.debugLineNum = 1469;BA.debugLine="Sleep(0)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"),BA.numberCast(int.class, 0));
this.state = 94;
return;
case 94:
//C
this.state = 46;
;
 if (true) break;

case 63:
//C
this.state = 78;
;
 BA.debugLineNum = 1471;BA.debugLine="rs.Close";
Debug.ShouldStop(1073741824);
_rs.runVoidMethod ("Close");
 if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 1480;BA.debugLine="Dim NumEmailsEnviar As Int=Utilidades.FixNullIn";
Debug.ShouldStop(128);
_numemailsenviar = parent._utilidades.runMethod(true,"_fixnullint" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select count(*) from tblDestinatarios where Seleccionado=? and Email<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(1),RemoteObject.createImmutable("")}))))))));Debug.locals.put("NumEmailsEnviar", _numemailsenviar);Debug.locals.put("NumEmailsEnviar", _numemailsenviar);
 BA.debugLineNum = 1481;BA.debugLine="Dim Intervalo As Int=Round((100/NumEmailsEnviar";
Debug.ShouldStop(256);
_intervalo = BA.numberCast(int.class, parent.__c.runMethod(true,"Round",(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_numemailsenviar}, "/",0, 0)))));Debug.locals.put("Intervalo", _intervalo);Debug.locals.put("Intervalo", _intervalo);
 BA.debugLineNum = 1482;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select * f";
Debug.ShouldStop(512);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery2",(Object)(BA.ObjectToString("select * from tblDestinatarios where Seleccionado=? and Email<>?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.NumberToString(1),RemoteObject.createImmutable("")})))));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1483;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1024);
if (true) break;

case 66:
//do while
this.state = 77;
while (_rs.runMethod(true,"NextRow").<Boolean>get().booleanValue()) {
this.state = 68;
if (true) break;
}
if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 1486;BA.debugLine="Dim lstInfoDocsEnviadosComercial As List";
Debug.ShouldStop(8192);
_lstinfodocsenviadoscomercial = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstInfoDocsEnviadosComercial", _lstinfodocsenviadoscomercial);
 BA.debugLineNum = 1487;BA.debugLine="lstInfoDocsEnviadosComercial.Initialize";
Debug.ShouldStop(16384);
_lstinfodocsenviadoscomercial.runVoidMethod ("Initialize");
 BA.debugLineNum = 1488;BA.debugLine="Dim lstPedPtesComercial As List";
Debug.ShouldStop(32768);
_lstpedptescomercial = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPedPtesComercial", _lstpedptescomercial);
 BA.debugLineNum = 1489;BA.debugLine="lstPedPtesComercial.Initialize";
Debug.ShouldStop(65536);
_lstpedptescomercial.runVoidMethod ("Initialize");
 BA.debugLineNum = 1492;BA.debugLine="Wait For (CargaPedidosVentaNoAbiertosPendiente";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargapedidosventanoabiertospendientescomercial" /*RemoteObject*/ ,(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo"))))));
this.state = 95;
return;
case 95:
//C
this.state = 69;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 1493;BA.debugLine="If mResult.Get(\"ReqOK\")=True Then";
Debug.ShouldStop(1048576);
if (true) break;

case 69:
//if
this.state = 76;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"True")))) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 1494;BA.debugLine="Dim lstPedPtes As List=mResult.Get(\"lstPedido";
Debug.ShouldStop(2097152);
_lstpedptes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstpedptes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstPedidosPendientesComercial")))));Debug.locals.put("lstPedPtes", _lstpedptes);Debug.locals.put("lstPedPtes", _lstpedptes);
 BA.debugLineNum = 1495;BA.debugLine="For Each mP As Map In lstPedPtes";
Debug.ShouldStop(4194304);
if (true) break;

case 72:
//for
this.state = 75;
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group110 = _lstpedptes;
index110 = 0;
groupLen110 = group110.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mP", _mp);
this.state = 96;
if (true) break;

case 96:
//C
this.state = 75;
if (index110 < groupLen110) {
this.state = 74;
_mp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group110.runMethod(false,"Get",index110));Debug.locals.put("mP", _mp);}
if (true) break;

case 97:
//C
this.state = 96;
index110++;
Debug.locals.put("mP", _mp);
if (true) break;

case 74:
//C
this.state = 97;
 BA.debugLineNum = 1496;BA.debugLine="lstPedPtesComercial.Add(mP)";
Debug.ShouldStop(8388608);
_lstpedptescomercial.runVoidMethod ("Add",(Object)((_mp.getObject())));
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
Debug.locals.put("mP", _mp);
;
 if (true) break;

case 76:
//C
this.state = 66;
;
 BA.debugLineNum = 1499;BA.debugLine="wait for(ExportarDatosInformeAExcel(False, rs.";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_exportardatosinformeaexcel" /*RemoteObject*/ ,(Object)(parent.__c.getField(true,"False")),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Codigo")))),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Nombre")))),(Object)(_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("Email")))),(Object)(_lstpedptescomercial)));
this.state = 98;
return;
case 98:
//C
this.state = 66;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 1501;BA.debugLine="jamCircularProgressBar1.Value=Min(jamCircularP";
Debug.ShouldStop(268435456);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, parent.__c.runMethod(true,"Min",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_getvalue" /*RemoteObject*/ ),_intervalo}, "+",1, 0)),(Object)(BA.numberCast(double.class, 100)))));
 BA.debugLineNum = 1502;BA.debugLine="Sleep(0)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"),BA.numberCast(int.class, 0));
this.state = 99;
return;
case 99:
//C
this.state = 66;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 BA.debugLineNum = 1504;BA.debugLine="rs.Close";
Debug.ShouldStop(-2147483648);
_rs.runVoidMethod ("Close");
 if (true) break;

case 78:
//C
this.state = 79;
;
 BA.debugLineNum = 1507;BA.debugLine="lblProgress.Text=\"\"";
Debug.ShouldStop(4);
__ref.getField(false,"_lblprogress" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToString(""));
 BA.debugLineNum = 1508;BA.debugLine="btnInformeErroresUltimoEnvio.Visible=lstErrores.S";
Debug.ShouldStop(8);
__ref.getField(false,"_btninformeerroresultimoenvio" /*RemoteObject*/ ).runMethod(true,"setVisible",BA.ObjectToBoolean(RemoteObject.solveBoolean(">",__ref.getField(false,"_lsterrores" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))));
 BA.debugLineNum = 1509;BA.debugLine="jamCircularProgressBar1.Value=0";
Debug.ShouldStop(16);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvalue" /*RemoteObject*/ ,BA.numberCast(float.class, 0));
 BA.debugLineNum = 1510;BA.debugLine="jamCircularProgressBar1.Visible=False";
Debug.ShouldStop(32);
__ref.getField(false,"_jamcircularprogressbar1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamcircularprogressbar.class, "_setvisible" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1511;BA.debugLine="If lstErrores.Size>0 Then";
Debug.ShouldStop(64);
if (true) break;

case 79:
//if
this.state = 84;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lsterrores" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 81;
}else {
this.state = 83;
}if (true) break;

case 81:
//C
this.state = 84;
 BA.debugLineNum = 1523;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Proceso ejecu";
Debug.ShouldStop(262144);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Proceso ejecutado con "),__ref.getField(false,"_lsterrores" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(" errores. Consulta el informe de errores mediante el botón Informe Errores ültimo Envío."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable(" IMPORTANTE:Este informe se elimina al ejecutar un nuevo envío o al salir de la aplicación."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1525;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 100;
return;
case 100:
//C
this.state = 84;
;
 if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 1528;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Proceso final";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Proceso finalizado sin errores")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1529;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), _msa);
this.state = 101;
return;
case 101:
//C
this.state = 84;
;
 if (true) break;

case 84:
//C
this.state = -1;
;
 BA.debugLineNum = 1531;BA.debugLine="ActualizarTableViewDestinatarios";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_actualizartableviewdestinatarios" /*void*/ );
 BA.debugLineNum = 1532;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","actualizartableviewdestinatarios_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btngenerarinformesemail_click"), null);
this.state = 102;
return;
case 102:
//C
this.state = -1;
;
 BA.debugLineNum = 1533;BA.debugLine="End Sub";
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
public static void  _btninformeerroresultimoenvio_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnInformeErroresUltimoEnvio_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2191);
if (RapidSub.canDelegate("btninformeerroresultimoenvio_click")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","btninformeerroresultimoenvio_click", __ref); return;}
ResumableSub_btnInformeErroresUltimoEnvio_Click rsub = new ResumableSub_btnInformeErroresUltimoEnvio_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnInformeErroresUltimoEnvio_Click extends BA.ResumableSub {
public ResumableSub_btnInformeErroresUltimoEnvio_Click(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _userfolder = RemoteObject.createImmutable("");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _timeformatant = RemoteObject.createImmutable("");
RemoteObject _fch = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
RemoteObject _nombrefichero = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnInformeErroresUltimoEnvio_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2191);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 2192;BA.debugLine="If lstErrores.Size=0 Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lsterrores" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 2193;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de errores del último envío de correos.")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2194;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btninformeerroresultimoenvio_click"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 4;
;
 BA.debugLineNum = 2195;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 2198;BA.debugLine="Dim UserFolder As String=FindUserDocumentsFolder";
Debug.ShouldStop(2097152);
_userfolder = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_finduserdocumentsfolder" /*RemoteObject*/ );Debug.locals.put("UserFolder", _userfolder);Debug.locals.put("UserFolder", _userfolder);
 BA.debugLineNum = 2200;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(8388608);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 2201;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyy\"";
Debug.ShouldStop(16777216);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyy"));
 BA.debugLineNum = 2202;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
Debug.ShouldStop(33554432);
_timeformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getTimeFormat");Debug.locals.put("TimeFormatAnt", _timeformatant);Debug.locals.put("TimeFormatAnt", _timeformatant);
 BA.debugLineNum = 2203;BA.debugLine="DateTime.Timeformat=\"HH-mm-ss\"";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",BA.ObjectToString("HH-mm-ss"));
 BA.debugLineNum = 2205;BA.debugLine="Dim fCH As FileChooser";
Debug.ShouldStop(268435456);
_fch = RemoteObject.createNew ("anywheresoftware.b4j.objects.FileChooserWrapper");Debug.locals.put("fCH", _fch);
 BA.debugLineNum = 2206;BA.debugLine="fCH.Initialize";
Debug.ShouldStop(536870912);
_fch.runVoidMethod ("Initialize");
 BA.debugLineNum = 2207;BA.debugLine="fCH.InitialDirectory=UserFolder";
Debug.ShouldStop(1073741824);
_fch.runMethod(true,"setInitialDirectory",_userfolder);
 BA.debugLineNum = 2208;BA.debugLine="fCH.InitialFileName=$\"ErroresEnvioEmail $DateTime";
Debug.ShouldStop(-2147483648);
_fch.runMethod(true,"setInitialFileName",(RemoteObject.concat(RemoteObject.createImmutable("ErroresEnvioEmail "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("datetime")),(Object)((parent.__c.getField(false,"DateTime").runMethod(true,"getNow")))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 2209;BA.debugLine="fCH.SetExtensionFilter(\"Ficheros Excel\",Array As";
Debug.ShouldStop(1);
_fch.runVoidMethod ("SetExtensionFilter",(Object)(BA.ObjectToString("Ficheros Excel")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("*.xlsx")})))));
 BA.debugLineNum = 2210;BA.debugLine="Dim NombreFichero As String=fCH.ShowSave(frm)";
Debug.ShouldStop(2);
_nombrefichero = _fch.runMethodAndSync(true,"ShowSave",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )));Debug.locals.put("NombreFichero", _nombrefichero);Debug.locals.put("NombreFichero", _nombrefichero);
 BA.debugLineNum = 2211;BA.debugLine="If NombreFichero=\"\" Then Return";
Debug.ShouldStop(4);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_nombrefichero,BA.ObjectToString(""))) { 
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
 BA.debugLineNum = 2228;BA.debugLine="wait for(CreateWorkbook(NombreFichero)) complete";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btninformeerroresultimoenvio_click"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createworkbook" /*RemoteObject*/ ,(Object)(_nombrefichero)));
this.state = 16;
return;
case 16:
//C
this.state = 11;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2229;BA.debugLine="If Success=False Then";
Debug.ShouldStop(1048576);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2230;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error generan";
Debug.ShouldStop(2097152);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Error generando fichero excel.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2231;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btninformeerroresultimoenvio_click"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 2234;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(33554432);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 2235;BA.debugLine="DateTime.Timeformat=TimeFormatAnt";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setTimeFormat",_timeformatant);
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
public static RemoteObject  _btnsalir_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSalir_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1068);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","btnsalir_click", __ref);}
 BA.debugLineNum = 1068;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1069;BA.debugLine="SalirModulo";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1070;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnseleccionarninguncontacto_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSeleccionarNingunContacto_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1303);
if (RapidSub.canDelegate("btnseleccionarninguncontacto_click")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","btnseleccionarninguncontacto_click", __ref); return;}
ResumableSub_btnSeleccionarNingunContacto_Click rsub = new ResumableSub_btnSeleccionarNingunContacto_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSeleccionarNingunContacto_Click extends BA.ResumableSub {
public ResumableSub_btnSeleccionarNingunContacto_Click(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSeleccionarNingunContacto_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1303);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1304;BA.debugLine="mSQL.ExecNonQuery(\"update tblDestinatarios set Se";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("update tblDestinatarios set Seleccionado=0")));
 BA.debugLineNum = 1305;BA.debugLine="CargandoDatos=True";
Debug.ShouldStop(16777216);
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1306;BA.debugLine="ActualizarTableViewDestinatarios";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_actualizartableviewdestinatarios" /*void*/ );
 BA.debugLineNum = 1307;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","actualizartableviewdestinatarios_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnseleccionarninguncontacto_click"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1308;BA.debugLine="CargandoDatos=False";
Debug.ShouldStop(134217728);
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1309;BA.debugLine="End Sub";
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
public static void  _btnseleccionartodoscontactos_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnSeleccionarTodosContactos_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1295);
if (RapidSub.canDelegate("btnseleccionartodoscontactos_click")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","btnseleccionartodoscontactos_click", __ref); return;}
ResumableSub_btnSeleccionarTodosContactos_Click rsub = new ResumableSub_btnSeleccionarTodosContactos_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnSeleccionarTodosContactos_Click extends BA.ResumableSub {
public ResumableSub_btnSeleccionarTodosContactos_Click(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnSeleccionarTodosContactos_Click (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1295);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1296;BA.debugLine="mSQL.ExecNonQuery(\"update tblDestinatarios set Se";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("update tblDestinatarios set Seleccionado=1")));
 BA.debugLineNum = 1297;BA.debugLine="CargandoDatos=True";
Debug.ShouldStop(65536);
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1298;BA.debugLine="ActualizarTableViewDestinatarios";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_actualizartableviewdestinatarios" /*void*/ );
 BA.debugLineNum = 1299;BA.debugLine="Wait For ActualizarTableViewDestinatarios_Complet";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","actualizartableviewdestinatarios_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "btnseleccionartodoscontactos_click"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 1300;BA.debugLine="CargandoDatos=False";
Debug.ShouldStop(524288);
__ref.setField ("_cargandodatos" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 1301;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadatosnavdocumentoinformeclientes(RemoteObject __ref,RemoteObject _doc) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosNAVDocumentoInformeClientes (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,754);
if (RapidSub.canDelegate("cargadatosnavdocumentoinformeclientes")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cargadatosnavdocumentoinformeclientes", __ref, _doc);}
ResumableSub_CargaDatosNAVDocumentoInformeClientes rsub = new ResumableSub_CargaDatosNAVDocumentoInformeClientes(null,__ref,_doc);
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
public static class ResumableSub_CargaDatosNAVDocumentoInformeClientes extends BA.ResumableSub {
public ResumableSub_CargaDatosNAVDocumentoInformeClientes(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _doc;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _records = null;
RemoteObject _mdoc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject group15;
int index15;
int groupLen15;
int step18;
int limit18;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosNAVDocumentoInformeClientes (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,754);
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
 BA.debugLineNum = 755;BA.debugLine="Dim m As Map";
Debug.ShouldStop(262144);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 756;BA.debugLine="m.Initialize";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 757;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 758;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 759;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 760;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
Debug.ShouldStop(8388608);
_req = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createrequestnav" /*RemoteObject*/ );Debug.locals.put("Req", _req);Debug.locals.put("Req", _req);
 BA.debugLineNum = 761;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InfoDocInfo";
Debug.ShouldStop(16777216);
_cmd = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InfoDocInformeExpediciones")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_doc)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 762;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformeclientes"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 763;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 20;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 764;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.ShouldStop(134217728);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 765;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(268435456);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 766;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformeclientes"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 767;BA.debugLine="If res.Rows.Size>0 Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 768;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 769;BA.debugLine="For Each records() As Object In res.Rows";
Debug.ShouldStop(1);
if (true) break;

case 7:
//for
this.state = 14;
group15 = _res.getField(false,"Rows" /*RemoteObject*/ );
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("records", _records);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index15 < groupLen15) {
this.state = 9;
_records = (group15.runMethod(false,"Get",index15));Debug.locals.put("records", _records);}
if (true) break;

case 24:
//C
this.state = 23;
index15++;
Debug.locals.put("records", _records);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 770;BA.debugLine="Dim mDoc As Map";
Debug.ShouldStop(2);
_mdoc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDoc", _mdoc);
 BA.debugLineNum = 771;BA.debugLine="mDoc.Initialize";
Debug.ShouldStop(4);
_mdoc.runVoidMethod ("Initialize");
 BA.debugLineNum = 772;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.ShouldStop(8);
if (true) break;

case 10:
//for
this.state = 13;
step18 = 1;
limit18 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 13;
if ((step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18)) this.state = 12;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step18)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 26;
 BA.debugLineNum = 774;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),records(i))";
Debug.ShouldStop(32);
_mdoc.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_records.getArrayElement(false,BA.numberCast(int.class, _i))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 24;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 778;BA.debugLine="lstInfoDocumentos.Add(mDoc)";
Debug.ShouldStop(512);
__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mdoc.getObject())));
 BA.debugLineNum = 779;BA.debugLine="Log (mDoc)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","890308633",BA.ObjectToString(_mdoc),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
Debug.locals.put("records", _records);
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 782;BA.debugLine="Log(\"Documento sin info \" & Doc)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","890308636",RemoteObject.concat(RemoteObject.createImmutable("Documento sin info "),_doc),0);
 if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 787;BA.debugLine="j.Release";
Debug.ShouldStop(262144);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 788;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.ShouldStop(524288);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 789;BA.debugLine="Return Null";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 791;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _cargadatosnavdocumentoinformecomerciales(RemoteObject __ref,RemoteObject _doc,RemoteObject _tipo) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosNAVDocumentoInformeComerciales (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,859);
if (RapidSub.canDelegate("cargadatosnavdocumentoinformecomerciales")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cargadatosnavdocumentoinformecomerciales", __ref, _doc, _tipo);}
ResumableSub_CargaDatosNAVDocumentoInformeComerciales rsub = new ResumableSub_CargaDatosNAVDocumentoInformeComerciales(null,__ref,_doc,_tipo);
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
public static class ResumableSub_CargaDatosNAVDocumentoInformeComerciales extends BA.ResumableSub {
public ResumableSub_CargaDatosNAVDocumentoInformeComerciales(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _doc,RemoteObject _tipo) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
this._tipo = _tipo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _doc;
RemoteObject _tipo;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _records = null;
RemoteObject _mdoc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject group20;
int index20;
int groupLen20;
int step23;
int limit23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosNAVDocumentoInformeComerciales (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,859);
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
Debug.locals.put("Tipo", _tipo);
 BA.debugLineNum = 860;BA.debugLine="Dim m As Map";
Debug.ShouldStop(134217728);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 861;BA.debugLine="m.Initialize";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 862;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.ShouldStop(536870912);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 863;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.ShouldStop(1073741824);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 864;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 865;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
Debug.ShouldStop(1);
_req = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createrequestnav" /*RemoteObject*/ );Debug.locals.put("Req", _req);Debug.locals.put("Req", _req);
 BA.debugLineNum = 866;BA.debugLine="Select True";
Debug.ShouldStop(2);
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("ALBV"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("RT"))))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 868;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"AlbaranVe";
Debug.ShouldStop(8);
_cmd = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("AlbaranVentaInformeExpedicionComerciales")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_doc)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 870;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"RTInforme";
Debug.ShouldStop(32);
_cmd = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("RTInformeExpedicionComerciales")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_doc)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 873;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformecomerciales"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 27;
return;
case 27:
//C
this.state = 7;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 874;BA.debugLine="If j.Success Then";
Debug.ShouldStop(512);
if (true) break;

case 7:
//if
this.state = 26;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 25;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 875;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.ShouldStop(1024);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 876;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2048);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 877;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadatosnavdocumentoinformecomerciales"), (_req));
this.state = 28;
return;
case 28:
//C
this.state = 10;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 878;BA.debugLine="If res.Rows.Size>0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 10:
//if
this.state = 23;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 22;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 879;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.ShouldStop(16384);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 880;BA.debugLine="For Each records() As Object In res.Rows";
Debug.ShouldStop(32768);
if (true) break;

case 13:
//for
this.state = 20;
group20 = _res.getField(false,"Rows" /*RemoteObject*/ );
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("records", _records);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 20;
if (index20 < groupLen20) {
this.state = 15;
_records = (group20.runMethod(false,"Get",index20));Debug.locals.put("records", _records);}
if (true) break;

case 30:
//C
this.state = 29;
index20++;
Debug.locals.put("records", _records);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 881;BA.debugLine="Dim mDoc As Map";
Debug.ShouldStop(65536);
_mdoc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDoc", _mdoc);
 BA.debugLineNum = 882;BA.debugLine="mDoc.Initialize";
Debug.ShouldStop(131072);
_mdoc.runVoidMethod ("Initialize");
 BA.debugLineNum = 883;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.ShouldStop(262144);
if (true) break;

case 16:
//for
this.state = 19;
step23 = 1;
limit23 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 31;
if (true) break;

case 31:
//C
this.state = 19;
if ((step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23)) this.state = 18;
if (true) break;

case 32:
//C
this.state = 31;
_i = ((int)(0 + _i + step23)) ;
Debug.locals.put("i", _i);
if (true) break;

case 18:
//C
this.state = 32;
 BA.debugLineNum = 885;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),records(i))";
Debug.ShouldStop(1048576);
_mdoc.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_records.getArrayElement(false,BA.numberCast(int.class, _i))));
 BA.debugLineNum = 886;BA.debugLine="Log(res.Columns.GetKeyAt(i) & \": \" & records(";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","890439707",RemoteObject.concat(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(": "),_records.getArrayElement(false,BA.numberCast(int.class, _i))),0);
 if (true) break;
if (true) break;

case 19:
//C
this.state = 30;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 888;BA.debugLine="lstInfoDocumentos.Add(mDoc)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mdoc.getObject())));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
Debug.locals.put("records", _records);
;
 if (true) break;

case 22:
//C
this.state = 23;
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
 if (true) break;

case 26:
//C
this.state = -1;
;
 BA.debugLineNum = 896;BA.debugLine="j.Release";
Debug.ShouldStop(-2147483648);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 897;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.ShouldStop(1);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 898;BA.debugLine="Return m";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m));return;};
 BA.debugLineNum = 899;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadocumentosasignadosarepartoperiodo(RemoteObject __ref,RemoteObject _fechin,RemoteObject _fechfin) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAsignadosARepartoPeriodo (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("cargadocumentosasignadosarepartoperiodo")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cargadocumentosasignadosarepartoperiodo", __ref, _fechin, _fechfin);}
ResumableSub_CargaDocumentosAsignadosARepartoPeriodo rsub = new ResumableSub_CargaDocumentosAsignadosARepartoPeriodo(null,__ref,_fechin,_fechfin);
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
public static class ResumableSub_CargaDocumentosAsignadosARepartoPeriodo extends BA.ResumableSub {
public ResumableSub_CargaDocumentosAsignadosARepartoPeriodo(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _fechin,RemoteObject _fechfin) {
this.parent = parent;
this.__ref = __ref;
this._fechin = _fechin;
this._fechfin = _fechfin;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _fechin;
RemoteObject _fechfin;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _records = null;
RemoteObject _mdoc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _sval = RemoteObject.createImmutable("");
RemoteObject group16;
int index16;
int groupLen16;
int step19;
int limit19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosAsignadosARepartoPeriodo (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,638);
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
Debug.locals.put("FechIn", _fechin);
Debug.locals.put("FechFin", _fechfin);
 BA.debugLineNum = 639;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 640;BA.debugLine="m.Initialize";
Debug.ShouldStop(-2147483648);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 641;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 642;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.ShouldStop(2);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 643;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
Debug.ShouldStop(4);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 644;BA.debugLine="Dim Req As DBRequestManager = CreateRequest";
Debug.ShouldStop(8);
_req = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createrequest" /*RemoteObject*/ );Debug.locals.put("Req", _req);Debug.locals.put("Req", _req);
 BA.debugLineNum = 645;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"DocumentosA";
Debug.ShouldStop(16);
_cmd = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DocumentosAsignadosARepartoPeriodo")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fechin),(_fechfin)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 646;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadocumentosasignadosarepartoperiodo"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 647;BA.debugLine="If j.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 24;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 648;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 649;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(256);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 650;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadocumentosasignadosarepartoperiodo"), (_req));
this.state = 26;
return;
case 26:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 651;BA.debugLine="If res.Rows.Size>0 Then";
Debug.ShouldStop(1024);
if (true) break;

case 4:
//if
this.state = 21;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 652;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.ShouldStop(2048);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 653;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 654;BA.debugLine="For Each records() As Object In res.Rows";
Debug.ShouldStop(8192);
if (true) break;

case 7:
//for
this.state = 18;
group16 = _res.getField(false,"Rows" /*RemoteObject*/ );
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("records", _records);
this.state = 27;
if (true) break;

case 27:
//C
this.state = 18;
if (index16 < groupLen16) {
this.state = 9;
_records = (group16.runMethod(false,"Get",index16));Debug.locals.put("records", _records);}
if (true) break;

case 28:
//C
this.state = 27;
index16++;
Debug.locals.put("records", _records);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 655;BA.debugLine="Dim mDoc As Map";
Debug.ShouldStop(16384);
_mdoc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDoc", _mdoc);
 BA.debugLineNum = 656;BA.debugLine="mDoc.Initialize";
Debug.ShouldStop(32768);
_mdoc.runVoidMethod ("Initialize");
 BA.debugLineNum = 657;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.ShouldStop(65536);
if (true) break;

case 10:
//for
this.state = 13;
step19 = 1;
limit19 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 13;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 12;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step19)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 30;
 BA.debugLineNum = 659;BA.debugLine="Dim sVal As String=records(i)";
Debug.ShouldStop(262144);
_sval = BA.ObjectToString(_records.getArrayElement(false,BA.numberCast(int.class, _i)));Debug.locals.put("sVal", _sval);Debug.locals.put("sVal", _sval);
 BA.debugLineNum = 661;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),sVal.ToUpper";
Debug.ShouldStop(1048576);
_mdoc.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)((_sval.runMethod(true,"toUpperCase"))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 664;BA.debugLine="lstDocumentosExpedidos.Add(mDoc)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lstdocumentosexpedidos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mdoc.getObject())));
 BA.debugLineNum = 665;BA.debugLine="If lstDocumentosExpedidosUnicos.IndexOf(mDoc.G";
Debug.ShouldStop(16777216);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_mdoc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 666;BA.debugLine="lstDocumentosExpedidosUnicos.Add(mDoc.Get(\"Do";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_mdoc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))));
 if (true) break;

case 17:
//C
this.state = 28;
;
 BA.debugLineNum = 668;BA.debugLine="Log(\"Doc Reparto: \" &  mDoc.Get(\"Documento\"))";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","890177566",RemoteObject.concat(RemoteObject.createImmutable("Doc Reparto: "),_mdoc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))),0);
 BA.debugLineNum = 670;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Documento";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Documentos Expedidos Transporte Externo y Asignados a Reparto: "),__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
Debug.locals.put("records", _records);
;
 BA.debugLineNum = 672;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 679;BA.debugLine="j.Release";
Debug.ShouldStop(64);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 680;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 681;BA.debugLine="Return m";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m));return;};
 BA.debugLineNum = 682;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadocumentosexpedidosperiodotransporteexterno(RemoteObject __ref,RemoteObject _fechin,RemoteObject _fechfin) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosExpedidosPeriodoTransporteExterno (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,576);
if (RapidSub.canDelegate("cargadocumentosexpedidosperiodotransporteexterno")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cargadocumentosexpedidosperiodotransporteexterno", __ref, _fechin, _fechfin);}
ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno rsub = new ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno(null,__ref,_fechin,_fechfin);
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
public static class ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno extends BA.ResumableSub {
public ResumableSub_CargaDocumentosExpedidosPeriodoTransporteExterno(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _fechin,RemoteObject _fechfin) {
this.parent = parent;
this.__ref = __ref;
this._fechin = _fechin;
this._fechfin = _fechfin;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _fechin;
RemoteObject _fechfin;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _records = null;
RemoteObject _mdoc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _sval = RemoteObject.createImmutable("");
RemoteObject group16;
int index16;
int groupLen16;
int step19;
int limit19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDocumentosExpedidosPeriodoTransporteExterno (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,576);
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
Debug.locals.put("FechIn", _fechin);
Debug.locals.put("FechFin", _fechfin);
 BA.debugLineNum = 577;BA.debugLine="Dim m As Map";
Debug.ShouldStop(1);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 578;BA.debugLine="m.Initialize";
Debug.ShouldStop(2);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 579;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.ShouldStop(4);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 580;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 581;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 582;BA.debugLine="Dim Req As DBRequestManager = CreateRequest";
Debug.ShouldStop(32);
_req = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createrequest" /*RemoteObject*/ );Debug.locals.put("Req", _req);Debug.locals.put("Req", _req);
 BA.debugLineNum = 583;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"DocumentosE";
Debug.ShouldStop(64);
_cmd = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("DocumentosExpedidosPeriodoTransporteExterno")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_fechin),(_fechfin)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 584;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadocumentosexpedidosperiodotransporteexterno"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 585;BA.debugLine="If j.Success Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 24;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 23;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 586;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 587;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1024);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 588;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargadocumentosexpedidosperiodotransporteexterno"), (_req));
this.state = 26;
return;
case 26:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 589;BA.debugLine="If res.Rows.Size>0 Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 21;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 20;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 590;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.ShouldStop(8192);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 591;BA.debugLine="jamLoadingIndicator1.show";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 592;BA.debugLine="For Each records() As Object In res.Rows";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//for
this.state = 18;
group16 = _res.getField(false,"Rows" /*RemoteObject*/ );
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("records", _records);
this.state = 27;
if (true) break;

case 27:
//C
this.state = 18;
if (index16 < groupLen16) {
this.state = 9;
_records = (group16.runMethod(false,"Get",index16));Debug.locals.put("records", _records);}
if (true) break;

case 28:
//C
this.state = 27;
index16++;
Debug.locals.put("records", _records);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 593;BA.debugLine="Dim mDoc As Map";
Debug.ShouldStop(65536);
_mdoc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDoc", _mdoc);
 BA.debugLineNum = 594;BA.debugLine="mDoc.Initialize";
Debug.ShouldStop(131072);
_mdoc.runVoidMethod ("Initialize");
 BA.debugLineNum = 595;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.ShouldStop(262144);
if (true) break;

case 10:
//for
this.state = 13;
step19 = 1;
limit19 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 29;
if (true) break;

case 29:
//C
this.state = 13;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 12;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step19)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 30;
 BA.debugLineNum = 600;BA.debugLine="Dim sVal As String=records(i)";
Debug.ShouldStop(8388608);
_sval = BA.ObjectToString(_records.getArrayElement(false,BA.numberCast(int.class, _i)));Debug.locals.put("sVal", _sval);Debug.locals.put("sVal", _sval);
 BA.debugLineNum = 602;BA.debugLine="mDoc.Put(res.Columns.GetKeyAt(i),sVal.ToUpper";
Debug.ShouldStop(33554432);
_mdoc.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)((_sval.runMethod(true,"toUpperCase"))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 604;BA.debugLine="lstDocumentosExpedidos.Add(mDoc)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lstdocumentosexpedidos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_mdoc.getObject())));
 BA.debugLineNum = 605;BA.debugLine="If lstDocumentosExpedidosUnicos.IndexOf(mDoc.G";
Debug.ShouldStop(268435456);
if (true) break;

case 14:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)(_mdoc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento")))))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 606;BA.debugLine="lstDocumentosExpedidosUnicos.Add(mDoc.Get(\"Do";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_mdoc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))));
 if (true) break;

case 17:
//C
this.state = 28;
;
 BA.debugLineNum = 608;BA.debugLine="Log(\"Doc tte externo: \" & mDoc.Get(\"Documento\"";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","890112032",RemoteObject.concat(RemoteObject.createImmutable("Doc tte externo: "),_mdoc.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Documento"))))),0);
 BA.debugLineNum = 610;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Documento";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Documentos Expedidos Transporte Externo y Asignados a Reparto: "),__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 21;
Debug.locals.put("records", _records);
;
 BA.debugLineNum = 612;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 if (true) break;

case 20:
//C
this.state = 21;
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
 if (true) break;

case 24:
//C
this.state = -1;
;
 BA.debugLineNum = 619;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 620;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 621;BA.debugLine="Return m";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m));return;};
 BA.debugLineNum = 622;BA.debugLine="End Sub";
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
public static RemoteObject  _cargaitemscbo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CargaItemsCbo (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("cargaitemscbo")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cargaitemscbo", __ref);}
 BA.debugLineNum = 359;BA.debugLine="Sub CargaItemsCbo";
Debug.ShouldStop(64);
 BA.debugLineNum = 360;BA.debugLine="cboTipoInforme.Items.AddAll(Array As String(\"\",\"C";
Debug.ShouldStop(128);
__ref.getField(false,"_cbotipoinforme" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("AddAll",(Object)(cinformesexpedicionesclientes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString(""),BA.ObjectToString("Clientes"),RemoteObject.createImmutable("Comerciales")})))));
 BA.debugLineNum = 361;BA.debugLine="cboTipoInforme.Value=\"\"";
Debug.ShouldStop(256);
__ref.getField(false,"_cbotipoinforme" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 362;BA.debugLine="CallSubDelayed(Me,\"CargaItemsCbo_Completed\")";
Debug.ShouldStop(512);
cinformesexpedicionesclientes.__c.runVoidMethod ("CallSubDelayed",__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("CargaItemsCbo_Completed")));
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargapedidosventanoabiertospendientescomercial(RemoteObject __ref,RemoteObject _comercial) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidosVentaNoAbiertosPendientesComercial (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1647);
if (RapidSub.canDelegate("cargapedidosventanoabiertospendientescomercial")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cargapedidosventanoabiertospendientescomercial", __ref, _comercial);}
ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial rsub = new ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial(null,__ref,_comercial);
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
public static class ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial extends BA.ResumableSub {
public ResumableSub_CargaPedidosVentaNoAbiertosPendientesComercial(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _comercial) {
this.parent = parent;
this.__ref = __ref;
this._comercial = _comercial;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _comercial;
RemoteObject _lstpedidospendientescomercial = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _records = null;
RemoteObject _mped = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject group18;
int index18;
int groupLen18;
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidosVentaNoAbiertosPendientesComercial (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1647);
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
Debug.locals.put("Comercial", _comercial);
 BA.debugLineNum = 1648;BA.debugLine="Dim lstPedidosPendientesComercial As List";
Debug.ShouldStop(32768);
_lstpedidospendientescomercial = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPedidosPendientesComercial", _lstpedidospendientescomercial);
 BA.debugLineNum = 1649;BA.debugLine="lstPedidosPendientesComercial.Initialize";
Debug.ShouldStop(65536);
_lstpedidospendientescomercial.runVoidMethod ("Initialize");
 BA.debugLineNum = 1650;BA.debugLine="Dim m As Map";
Debug.ShouldStop(131072);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1651;BA.debugLine="m.Initialize";
Debug.ShouldStop(262144);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1652;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 1653;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.ShouldStop(1048576);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 1654;BA.debugLine="m.Put(\"lstPedidosPendientesComercial\",lstPedidosP";
Debug.ShouldStop(2097152);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstPedidosPendientesComercial"))),(Object)((_lstpedidospendientescomercial.getObject())));
 BA.debugLineNum = 1655;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
Debug.ShouldStop(4194304);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 1656;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
Debug.ShouldStop(8388608);
_req = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createrequestnav" /*RemoteObject*/ );Debug.locals.put("Req", _req);Debug.locals.put("Req", _req);
 BA.debugLineNum = 1658;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InfoPedidos";
Debug.ShouldStop(33554432);
_cmd = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InfoPedidosVentaTransferenciaPendientesVendedor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_comercial)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1659;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescomercial"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1660;BA.debugLine="If j.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 20;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1661;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.ShouldStop(268435456);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1662;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 1663;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescomercial"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1664;BA.debugLine="If res.Rows.Size>0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1665;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.ShouldStop(1);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1666;BA.debugLine="For Each records() As Object In res.Rows";
Debug.ShouldStop(2);
if (true) break;

case 7:
//for
this.state = 14;
group18 = _res.getField(false,"Rows" /*RemoteObject*/ );
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("records", _records);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index18 < groupLen18) {
this.state = 9;
_records = (group18.runMethod(false,"Get",index18));Debug.locals.put("records", _records);}
if (true) break;

case 24:
//C
this.state = 23;
index18++;
Debug.locals.put("records", _records);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1667;BA.debugLine="Dim mPed As Map";
Debug.ShouldStop(4);
_mped = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mPed", _mped);
 BA.debugLineNum = 1668;BA.debugLine="mPed.Initialize";
Debug.ShouldStop(8);
_mped.runVoidMethod ("Initialize");
 BA.debugLineNum = 1669;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.ShouldStop(16);
if (true) break;

case 10:
//for
this.state = 13;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 13;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 12;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step21)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 26;
 BA.debugLineNum = 1670;BA.debugLine="Log(res.Columns.GetKeyAt(i))";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","891226135",BA.ObjectToString(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 1671;BA.debugLine="mPed.Put(res.Columns.GetKeyAt(i),records(i))";
Debug.ShouldStop(64);
_mped.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_records.getArrayElement(false,BA.numberCast(int.class, _i))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 24;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1676;BA.debugLine="lstPedidosPendientesComercial.Add(mPed)";
Debug.ShouldStop(2048);
_lstpedidospendientescomercial.runVoidMethod ("Add",(Object)((_mped.getObject())));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
Debug.locals.put("records", _records);
;
 if (true) break;

case 16:
//C
this.state = 17;
 if (true) break;

case 17:
//C
this.state = 20;
;
 BA.debugLineNum = 1681;BA.debugLine="m.Put(\"lstPedidosPendientesComercial\",lstPedidos";
Debug.ShouldStop(65536);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstPedidosPendientesComercial"))),(Object)((_lstpedidospendientescomercial.getObject())));
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1685;BA.debugLine="j.Release";
Debug.ShouldStop(1048576);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1686;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1687;BA.debugLine="Return m";
Debug.ShouldStop(4194304);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m));return;};
 BA.debugLineNum = 1688;BA.debugLine="End Sub";
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
public static RemoteObject  _cargapedidosventanoabiertospendientescontacto(RemoteObject __ref,RemoteObject _contacto) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidosVentaNoAbiertosPendientesContacto (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1571);
if (RapidSub.canDelegate("cargapedidosventanoabiertospendientescontacto")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cargapedidosventanoabiertospendientescontacto", __ref, _contacto);}
ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto rsub = new ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto(null,__ref,_contacto);
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
public static class ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto extends BA.ResumableSub {
public ResumableSub_CargaPedidosVentaNoAbiertosPendientesContacto(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _contacto) {
this.parent = parent;
this.__ref = __ref;
this._contacto = _contacto;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _contacto;
RemoteObject _lstpedidospendientescontacto = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4j.docU.main._dbresult");
RemoteObject _records = null;
RemoteObject _mped = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject group18;
int index18;
int groupLen18;
int step21;
int limit21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaPedidosVentaNoAbiertosPendientesContacto (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1571);
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
Debug.locals.put("Contacto", _contacto);
 BA.debugLineNum = 1572;BA.debugLine="Dim lstPedidosPendientesContacto As List";
Debug.ShouldStop(8);
_lstpedidospendientescontacto = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstPedidosPendientesContacto", _lstpedidospendientescontacto);
 BA.debugLineNum = 1573;BA.debugLine="lstPedidosPendientesContacto.Initialize";
Debug.ShouldStop(16);
_lstpedidospendientescontacto.runVoidMethod ("Initialize");
 BA.debugLineNum = 1574;BA.debugLine="Dim m As Map";
Debug.ShouldStop(32);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("m", _m);
 BA.debugLineNum = 1575;BA.debugLine="m.Initialize";
Debug.ShouldStop(64);
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 1576;BA.debugLine="m.Put(\"ConnOK\",False)";
Debug.ShouldStop(128);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 1577;BA.debugLine="m.Put(\"ReqOK\",False)";
Debug.ShouldStop(256);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"False"))));
 BA.debugLineNum = 1578;BA.debugLine="m.Put(\"lstPedidosPendientesContacto\",lstPedidosPe";
Debug.ShouldStop(512);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstPedidosPendientesContacto"))),(Object)((_lstpedidospendientescontacto.getObject())));
 BA.debugLineNum = 1579;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.WAIT";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"WAIT"));
 BA.debugLineNum = 1580;BA.debugLine="Dim Req As DBRequestManager = CreateRequestNav";
Debug.ShouldStop(2048);
_req = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createrequestnav" /*RemoteObject*/ );Debug.locals.put("Req", _req);Debug.locals.put("Req", _req);
 BA.debugLineNum = 1581;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"InfoPedidos";
Debug.ShouldStop(4096);
_cmd = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("InfoPedidosVentaNoAbiertosPendientesContacto")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_contacto)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1582;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescontacto"), (_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1583;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16384);
if (true) break;

case 1:
//if
this.state = 20;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1584;BA.debugLine="m.Put(\"ConnOK\",True)";
Debug.ShouldStop(32768);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ConnOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1585;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(65536);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 1586;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "cargapedidosventanoabiertospendientescontacto"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1587;BA.debugLine="If res.Rows.Size>0 Then";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//if
this.state = 17;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 16;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1588;BA.debugLine="m.Put(\"ReqOK\",True)";
Debug.ShouldStop(524288);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ReqOK"))),(Object)((parent.__c.getField(true,"True"))));
 BA.debugLineNum = 1589;BA.debugLine="For Each records() As Object In res.Rows";
Debug.ShouldStop(1048576);
if (true) break;

case 7:
//for
this.state = 14;
group18 = _res.getField(false,"Rows" /*RemoteObject*/ );
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("records", _records);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index18 < groupLen18) {
this.state = 9;
_records = (group18.runMethod(false,"Get",index18));Debug.locals.put("records", _records);}
if (true) break;

case 24:
//C
this.state = 23;
index18++;
Debug.locals.put("records", _records);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1590;BA.debugLine="Dim mPed As Map";
Debug.ShouldStop(2097152);
_mped = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mPed", _mped);
 BA.debugLineNum = 1591;BA.debugLine="mPed.Initialize";
Debug.ShouldStop(4194304);
_mped.runVoidMethod ("Initialize");
 BA.debugLineNum = 1592;BA.debugLine="For i=0 To  res.Columns.Size-1";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//for
this.state = 13;
step21 = 1;
limit21 = RemoteObject.solve(new RemoteObject[] {_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 13;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 12;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step21)) ;
Debug.locals.put("i", _i);
if (true) break;

case 12:
//C
this.state = 26;
 BA.debugLineNum = 1594;BA.debugLine="mPed.Put(res.Columns.GetKeyAt(i),records(i))";
Debug.ShouldStop(33554432);
_mped.runVoidMethod ("Put",(Object)(_res.getField(false,"Columns" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _i)))),(Object)(_records.getArrayElement(false,BA.numberCast(int.class, _i))));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 24;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1599;BA.debugLine="lstPedidosPendientesContacto.Add(mPed)";
Debug.ShouldStop(1073741824);
_lstpedidospendientescontacto.runVoidMethod ("Add",(Object)((_mped.getObject())));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
Debug.locals.put("records", _records);
;
 if (true) break;

case 16:
//C
this.state = 17;
 if (true) break;

case 17:
//C
this.state = 20;
;
 BA.debugLineNum = 1604;BA.debugLine="m.Put(\"lstPedidosPendientesContacto\",lstPedidosP";
Debug.ShouldStop(8);
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstPedidosPendientesContacto"))),(Object)((_lstpedidospendientescontacto.getObject())));
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 1608;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1609;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
Debug.ShouldStop(256);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"DEFAULT"));
 BA.debugLineNum = 1610;BA.debugLine="Return m";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_m));return;};
 BA.debugLineNum = 1611;BA.debugLine="End Sub";
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
public static RemoteObject  _cbotipoinforme_valuechanged(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("cboTipoInforme_ValueChanged (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2122);
if (RapidSub.canDelegate("cbotipoinforme_valuechanged")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","cbotipoinforme_valuechanged", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 2122;BA.debugLine="Sub cboTipoInforme_ValueChanged (Value As Object)";
Debug.ShouldStop(512);
 BA.debugLineNum = 2123;BA.debugLine="If CargandoItemsCboTipoInforme Then";
Debug.ShouldStop(1024);
if (__ref.getField(true,"_cargandoitemscbotipoinforme" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2124;BA.debugLine="Log(\"Cargando items cbo\")";
Debug.ShouldStop(2048);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891488258",RemoteObject.createImmutable("Cargando items cbo"),0);
 BA.debugLineNum = 2125;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 2127;BA.debugLine="Log(\"Cambio en items cbo, no carga\")";
Debug.ShouldStop(16384);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891488261",RemoteObject.createImmutable("Cambio en items cbo, no carga"),0);
 BA.debugLineNum = 2130;BA.debugLine="TipoDestinatarioInforme=Value";
Debug.ShouldStop(131072);
__ref.setField ("_tipodestinatarioinforme" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 2131;BA.debugLine="Log(\"Tipo Destinatario Informe \" & TipoDestinata";
Debug.ShouldStop(262144);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891488265",RemoteObject.concat(RemoteObject.createImmutable("Tipo Destinatario Informe "),__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ )),0);
 BA.debugLineNum = 2132;BA.debugLine="Select True";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Clientes")))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("Comerciales")))))) {
case 0: {
 BA.debugLineNum = 2134;BA.debugLine="lstInfoDocumentos.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 2135;BA.debugLine="lstVendedores.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_lstvendedores" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 2136;BA.debugLine="lstResponsablesCuenta.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lstresponsablescuenta" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 2137;BA.debugLine="lstContactosPedidos.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lstcontactospedidos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 2138;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDestinatario";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblDestinatarios")));
 BA.debugLineNum = 2139;BA.debugLine="tvDestinatarios.Items.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runMethod(false,"getItems").runVoidMethod ("Clear");
 BA.debugLineNum = 2140;BA.debugLine="pnlFondoDestinatarios.Visible=False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_pnlfondodestinatarios" /*RemoteObject*/ ).runMethod(true,"setVisible",cinformesexpedicionesclientes.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 2142;BA.debugLine="InformeClientes";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_informeclientes" /*void*/ );
 break; }
case 2: {
 BA.debugLineNum = 2144;BA.debugLine="InformeComerciales";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_informecomerciales" /*void*/ );
 break; }
}
;
 };
 BA.debugLineNum = 2148;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chbsel_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chbSel_CheckedChange (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1311);
if (RapidSub.canDelegate("chbsel_checkedchange")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","chbsel_checkedchange", __ref, _checked);}
RemoteObject _chb = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _ci = RemoteObject.declareNull("b4j.docU.main._cellindex");
RemoteObject _ridx = RemoteObject.createImmutable(0);
RemoteObject _row = null;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _n = RemoteObject.createImmutable(0);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 1311;BA.debugLine="Sub chbSel_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1312;BA.debugLine="If CargandoDatos Then Return";
Debug.ShouldStop(-2147483648);
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1313;BA.debugLine="Dim chb As CheckBox=Sender";
Debug.ShouldStop(1);
_chb = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");
_chb = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.CheckboxWrapper"), cinformesexpedicionesclientes.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("chb", _chb);Debug.locals.put("chb", _chb);
 BA.debugLineNum = 1314;BA.debugLine="Dim ci As CellIndex=chb.Tag";
Debug.ShouldStop(2);
_ci = (_chb.runMethod(false,"getTag"));Debug.locals.put("ci", _ci);Debug.locals.put("ci", _ci);
 BA.debugLineNum = 1315;BA.debugLine="Dim rIdx As Int=ci.Row";
Debug.ShouldStop(4);
_ridx = _ci.getField(true,"Row" /*RemoteObject*/ );Debug.locals.put("rIdx", _ridx);Debug.locals.put("rIdx", _ridx);
 BA.debugLineNum = 1316;BA.debugLine="Dim row() As Object=tvDestinatarios.Items.Get(rId";
Debug.ShouldStop(8);
_row = (__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runMethod(false,"getItems").runMethod(false,"Get",(Object)(_ridx)));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 1317;BA.debugLine="Dim p As AnchorPane=row(1)";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");
_p = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper"), _row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 1318;BA.debugLine="Dim Codigo As String=p.Tag";
Debug.ShouldStop(32);
_codigo = BA.ObjectToString(_p.runMethod(false,"getTag"));Debug.locals.put("Codigo", _codigo);Debug.locals.put("Codigo", _codigo);
 BA.debugLineNum = 1319;BA.debugLine="Dim n As Int";
Debug.ShouldStop(64);
_n = RemoteObject.createImmutable(0);Debug.locals.put("n", _n);
 BA.debugLineNum = 1320;BA.debugLine="If Checked Then";
Debug.ShouldStop(128);
if (_checked.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1321;BA.debugLine="n=1";
Debug.ShouldStop(256);
_n = BA.numberCast(int.class, 1);Debug.locals.put("n", _n);
 }else {
 BA.debugLineNum = 1323;BA.debugLine="n=0";
Debug.ShouldStop(1024);
_n = BA.numberCast(int.class, 0);Debug.locals.put("n", _n);
 };
 BA.debugLineNum = 1325;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDestinatarios set S";
Debug.ShouldStop(4096);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDestinatarios set Seleccionado=? where Codigo=?")),(Object)(cinformesexpedicionesclientes.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_n),(_codigo)})))));
 BA.debugLineNum = 1326;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _chkfechaunica_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("chkFechaUnica_CheckedChange (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,451);
if (RapidSub.canDelegate("chkfechaunica_checkedchange")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","chkfechaunica_checkedchange", __ref, _checked);}
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 451;BA.debugLine="Sub chkFechaUnica_CheckedChange(Checked As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 452;BA.debugLine="If CargandoDatos Then Return";
Debug.ShouldStop(8);
if (__ref.getField(true,"_cargandodatos" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 453;BA.debugLine="FechaUnica=Checked";
Debug.ShouldStop(16);
__ref.setField ("_fechaunica" /*RemoteObject*/ ,_checked);
 BA.debugLineNum = 454;BA.debugLine="If FechaUnica Then";
Debug.ShouldStop(32);
if (__ref.getField(true,"_fechaunica" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 455;BA.debugLine="If FechaInicial>0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_fechainicial" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 456;BA.debugLine="FechaFinal=FechaInicial+DateTime.TicksPerDay";
Debug.ShouldStop(128);
__ref.setField ("_fechafinal" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fechainicial" /*RemoteObject*/ ),cinformesexpedicionesclientes.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "+",1, 2));
 BA.debugLineNum = 457;BA.debugLine="txtFechaFinal.Text=txtFechaInicial.text";
Debug.ShouldStop(256);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText"));
 }else {
 BA.debugLineNum = 459;BA.debugLine="If FechaFinal>0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_fechafinal" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 460;BA.debugLine="FechaInicial=FechaFinal-DateTime.TicksPerDay";
Debug.ShouldStop(2048);
__ref.setField ("_fechainicial" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_fechafinal" /*RemoteObject*/ ),cinformesexpedicionesclientes.__c.getField(false,"DateTime").getField(true,"TicksPerDay")}, "-",1, 2));
 BA.debugLineNum = 461;BA.debugLine="txtFechaInicial.Text=txtFechaFinal.text";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText"));
 };
 };
 };
 BA.debugLineNum = 465;BA.debugLine="Log(\"fecha Inicial: \" & CRLF & FechaInicial)";
Debug.ShouldStop(65536);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","889980942",RemoteObject.concat(RemoteObject.createImmutable("fecha Inicial: "),cinformesexpedicionesclientes.__c.getField(true,"CRLF"),__ref.getField(true,"_fechainicial" /*RemoteObject*/ )),0);
 BA.debugLineNum = 466;BA.debugLine="Log(\"Fecha Final: \" & CRLF &  FechaFinal)";
Debug.ShouldStop(131072);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","889980943",RemoteObject.concat(RemoteObject.createImmutable("Fecha Final: "),cinformesexpedicionesclientes.__c.getField(true,"CRLF"),__ref.getField(true,"_fechafinal" /*RemoteObject*/ )),0);
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cinformesexpedicionesclientes._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cinformesexpedicionesclientes._fx);
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
cinformesexpedicionesclientes._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cinformesexpedicionesclientes._frm);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
cinformesexpedicionesclientes._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cinformesexpedicionesclientes._xui);
 //BA.debugLineNum = 8;BA.debugLine="Dim lblVersion As Label";
cinformesexpedicionesclientes._lblversion = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblversion",cinformesexpedicionesclientes._lblversion);
 //BA.debugLineNum = 9;BA.debugLine="Dim lblProgress As Label";
cinformesexpedicionesclientes._lblprogress = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblprogress",cinformesexpedicionesclientes._lblprogress);
 //BA.debugLineNum = 11;BA.debugLine="Dim mSQL As SQL";
cinformesexpedicionesclientes._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cinformesexpedicionesclientes._msql);
 //BA.debugLineNum = 13;BA.debugLine="Private lstDocumentosExpedidos As List";
cinformesexpedicionesclientes._lstdocumentosexpedidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstdocumentosexpedidos",cinformesexpedicionesclientes._lstdocumentosexpedidos);
 //BA.debugLineNum = 14;BA.debugLine="Private lstDocumentosExpedidosUnicos As List";
cinformesexpedicionesclientes._lstdocumentosexpedidosunicos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstdocumentosexpedidosunicos",cinformesexpedicionesclientes._lstdocumentosexpedidosunicos);
 //BA.debugLineNum = 15;BA.debugLine="Private lstInfoDocumentos As List";
cinformesexpedicionesclientes._lstinfodocumentos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstinfodocumentos",cinformesexpedicionesclientes._lstinfodocumentos);
 //BA.debugLineNum = 16;BA.debugLine="Private lstVendedores As List";
cinformesexpedicionesclientes._lstvendedores = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstvendedores",cinformesexpedicionesclientes._lstvendedores);
 //BA.debugLineNum = 17;BA.debugLine="Private lstResponsablesCuenta As List";
cinformesexpedicionesclientes._lstresponsablescuenta = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstresponsablescuenta",cinformesexpedicionesclientes._lstresponsablescuenta);
 //BA.debugLineNum = 18;BA.debugLine="Private lstContactosPedidos As List";
cinformesexpedicionesclientes._lstcontactospedidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstcontactospedidos",cinformesexpedicionesclientes._lstcontactospedidos);
 //BA.debugLineNum = 22;BA.debugLine="Private Dialog As B4XDialog";
cinformesexpedicionesclientes._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cinformesexpedicionesclientes._dialog);
 //BA.debugLineNum = 24;BA.debugLine="Private Base As B4XView";
cinformesexpedicionesclientes._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",cinformesexpedicionesclientes._base);
 //BA.debugLineNum = 25;BA.debugLine="Private DateTemplate As B4XDateTemplate";
cinformesexpedicionesclientes._datetemplate = RemoteObject.createNew ("b4j.docU.b4xdatetemplate");__ref.setField("_datetemplate",cinformesexpedicionesclientes._datetemplate);
 //BA.debugLineNum = 27;BA.debugLine="Private btnFechaFinal As Button";
cinformesexpedicionesclientes._btnfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnfechafinal",cinformesexpedicionesclientes._btnfechafinal);
 //BA.debugLineNum = 28;BA.debugLine="Private btnFechaInicial As Button";
cinformesexpedicionesclientes._btnfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnfechainicial",cinformesexpedicionesclientes._btnfechainicial);
 //BA.debugLineNum = 29;BA.debugLine="Private lblTitleFechaFIn As Label";
cinformesexpedicionesclientes._lbltitlefechafin = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlefechafin",cinformesexpedicionesclientes._lbltitlefechafin);
 //BA.debugLineNum = 30;BA.debugLine="Private lblTitleFechaIn As Label";
cinformesexpedicionesclientes._lbltitlefechain = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltitlefechain",cinformesexpedicionesclientes._lbltitlefechain);
 //BA.debugLineNum = 31;BA.debugLine="Private pnlFondoInformeExpediciones As Pane";
cinformesexpedicionesclientes._pnlfondoinformeexpediciones = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pnlfondoinformeexpediciones",cinformesexpedicionesclientes._pnlfondoinformeexpediciones);
 //BA.debugLineNum = 32;BA.debugLine="Private txtFechaInicial As TextField";
cinformesexpedicionesclientes._txtfechainicial = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechainicial",cinformesexpedicionesclientes._txtfechainicial);
 //BA.debugLineNum = 33;BA.debugLine="Private txtFechaFinal As TextField";
cinformesexpedicionesclientes._txtfechafinal = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtfechafinal",cinformesexpedicionesclientes._txtfechafinal);
 //BA.debugLineNum = 34;BA.debugLine="Private FechaInicial, FechaFinal As Long";
cinformesexpedicionesclientes._fechainicial = RemoteObject.createImmutable(0L);__ref.setField("_fechainicial",cinformesexpedicionesclientes._fechainicial);
cinformesexpedicionesclientes._fechafinal = RemoteObject.createImmutable(0L);__ref.setField("_fechafinal",cinformesexpedicionesclientes._fechafinal);
 //BA.debugLineNum = 35;BA.debugLine="Private btnSalir As Button";
cinformesexpedicionesclientes._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",cinformesexpedicionesclientes._btnsalir);
 //BA.debugLineNum = 36;BA.debugLine="Private chkFechaUnica As CheckBox";
cinformesexpedicionesclientes._chkfechaunica = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");__ref.setField("_chkfechaunica",cinformesexpedicionesclientes._chkfechaunica);
 //BA.debugLineNum = 37;BA.debugLine="Private FechaUnica As Boolean";
cinformesexpedicionesclientes._fechaunica = RemoteObject.createImmutable(false);__ref.setField("_fechaunica",cinformesexpedicionesclientes._fechaunica);
 //BA.debugLineNum = 40;BA.debugLine="Private btnActualizarInfo As Button";
cinformesexpedicionesclientes._btnactualizarinfo = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnactualizarinfo",cinformesexpedicionesclientes._btnactualizarinfo);
 //BA.debugLineNum = 47;BA.debugLine="Private pnlFondoDestinatarios As Pane";
cinformesexpedicionesclientes._pnlfondodestinatarios = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");__ref.setField("_pnlfondodestinatarios",cinformesexpedicionesclientes._pnlfondodestinatarios);
 //BA.debugLineNum = 48;BA.debugLine="Private tvDestinatarios As TableView";
cinformesexpedicionesclientes._tvdestinatarios = RemoteObject.createNew ("anywheresoftware.b4j.objects.TableViewWrapper");__ref.setField("_tvdestinatarios",cinformesexpedicionesclientes._tvdestinatarios);
 //BA.debugLineNum = 49;BA.debugLine="Private btnSeleccionarTodosContactos As Button";
cinformesexpedicionesclientes._btnseleccionartodoscontactos = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnseleccionartodoscontactos",cinformesexpedicionesclientes._btnseleccionartodoscontactos);
 //BA.debugLineNum = 50;BA.debugLine="Private btnSeleccionarNingunContacto As Button";
cinformesexpedicionesclientes._btnseleccionarninguncontacto = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnseleccionarninguncontacto",cinformesexpedicionesclientes._btnseleccionarninguncontacto);
 //BA.debugLineNum = 51;BA.debugLine="Private CargandoDatos As Boolean";
cinformesexpedicionesclientes._cargandodatos = RemoteObject.createImmutable(false);__ref.setField("_cargandodatos",cinformesexpedicionesclientes._cargandodatos);
 //BA.debugLineNum = 52;BA.debugLine="Private btnGenerarInformesEmail As Button";
cinformesexpedicionesclientes._btngenerarinformesemail = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btngenerarinformesemail",cinformesexpedicionesclientes._btngenerarinformesemail);
 //BA.debugLineNum = 53;BA.debugLine="Private TipoDestinatarioInforme As String";
cinformesexpedicionesclientes._tipodestinatarioinforme = RemoteObject.createImmutable("");__ref.setField("_tipodestinatarioinforme",cinformesexpedicionesclientes._tipodestinatarioinforme);
 //BA.debugLineNum = 54;BA.debugLine="Private PeriodoInforme As String";
cinformesexpedicionesclientes._periodoinforme = RemoteObject.createImmutable("");__ref.setField("_periodoinforme",cinformesexpedicionesclientes._periodoinforme);
 //BA.debugLineNum = 56;BA.debugLine="Private lstErrores As List";
cinformesexpedicionesclientes._lsterrores = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lsterrores",cinformesexpedicionesclientes._lsterrores);
 //BA.debugLineNum = 57;BA.debugLine="Private cboTipoInforme As ComboBox";
cinformesexpedicionesclientes._cbotipoinforme = RemoteObject.createNew ("anywheresoftware.b4j.objects.ComboBoxWrapper");__ref.setField("_cbotipoinforme",cinformesexpedicionesclientes._cbotipoinforme);
 //BA.debugLineNum = 58;BA.debugLine="Private CargandoItemsCboTipoInforme As Boolean";
cinformesexpedicionesclientes._cargandoitemscbotipoinforme = RemoteObject.createImmutable(false);__ref.setField("_cargandoitemscbotipoinforme",cinformesexpedicionesclientes._cargandoitemscbotipoinforme);
 //BA.debugLineNum = 61;BA.debugLine="Private lstCamposInformeDocumentosExpedidosClient";
cinformesexpedicionesclientes._lstcamposinformedocumentosexpedidosclientes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstcamposinformedocumentosexpedidosclientes",cinformesexpedicionesclientes._lstcamposinformedocumentosexpedidosclientes);
 //BA.debugLineNum = 62;BA.debugLine="Private lstCamposInformeDocumentosExpedidosComerc";
cinformesexpedicionesclientes._lstcamposinformedocumentosexpedidoscomerciales = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstcamposinformedocumentosexpedidoscomerciales",cinformesexpedicionesclientes._lstcamposinformedocumentosexpedidoscomerciales);
 //BA.debugLineNum = 63;BA.debugLine="Private lstCamposInformePedidosPendientesClientes";
cinformesexpedicionesclientes._lstcamposinformepedidospendientesclientes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstcamposinformepedidospendientesclientes",cinformesexpedicionesclientes._lstcamposinformepedidospendientesclientes);
 //BA.debugLineNum = 64;BA.debugLine="Private lstCamposInformePedidosPendientesComercia";
cinformesexpedicionesclientes._lstcamposinformepedidospendientescomerciales = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_lstcamposinformepedidospendientescomerciales",cinformesexpedicionesclientes._lstcamposinformepedidospendientescomerciales);
 //BA.debugLineNum = 66;BA.debugLine="Private lblTipoInforme As Label";
cinformesexpedicionesclientes._lbltipoinforme = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lbltipoinforme",cinformesexpedicionesclientes._lbltipoinforme);
 //BA.debugLineNum = 67;BA.debugLine="Private txtEmailAlternativo As TextField";
cinformesexpedicionesclientes._txtemailalternativo = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");__ref.setField("_txtemailalternativo",cinformesexpedicionesclientes._txtemailalternativo);
 //BA.debugLineNum = 68;BA.debugLine="Private lblInfoEmailAlternativo As Label";
cinformesexpedicionesclientes._lblinfoemailalternativo = RemoteObject.createNew ("anywheresoftware.b4j.objects.LabelWrapper");__ref.setField("_lblinfoemailalternativo",cinformesexpedicionesclientes._lblinfoemailalternativo);
 //BA.debugLineNum = 69;BA.debugLine="Private EmProin As String";
cinformesexpedicionesclientes._emproin = RemoteObject.createImmutable("");__ref.setField("_emproin",cinformesexpedicionesclientes._emproin);
 //BA.debugLineNum = 70;BA.debugLine="Private EmProtec As String";
cinformesexpedicionesclientes._emprotec = RemoteObject.createImmutable("");__ref.setField("_emprotec",cinformesexpedicionesclientes._emprotec);
 //BA.debugLineNum = 71;BA.debugLine="Private PasswProin As String";
cinformesexpedicionesclientes._passwproin = RemoteObject.createImmutable("");__ref.setField("_passwproin",cinformesexpedicionesclientes._passwproin);
 //BA.debugLineNum = 72;BA.debugLine="Private PassProtec As String";
cinformesexpedicionesclientes._passprotec = RemoteObject.createImmutable("");__ref.setField("_passprotec",cinformesexpedicionesclientes._passprotec);
 //BA.debugLineNum = 75;BA.debugLine="Private btnInformeErroresUltimoEnvio As B4XView";
cinformesexpedicionesclientes._btninformeerroresultimoenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_btninformeerroresultimoenvio",cinformesexpedicionesclientes._btninformeerroresultimoenvio);
 //BA.debugLineNum = 77;BA.debugLine="Private jamCircularProgressBar1 As jamCircularPro";
cinformesexpedicionesclientes._jamcircularprogressbar1 = RemoteObject.createNew ("b4j.docU.jamcircularprogressbar");__ref.setField("_jamcircularprogressbar1",cinformesexpedicionesclientes._jamcircularprogressbar1);
 //BA.debugLineNum = 78;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cinformesexpedicionesclientes._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cinformesexpedicionesclientes._jamloadingindicator1);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _crearfila(RemoteObject __ref,RemoteObject _rowindex,RemoteObject _codigo,RemoteObject _nombre,RemoteObject _email,RemoteObject _sel,RemoteObject _envemail) throws Exception{
try {
		Debug.PushSubsStack("CrearFila (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1183);
if (RapidSub.canDelegate("crearfila")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","crearfila", __ref, _rowindex, _codigo, _nombre, _email, _sel, _envemail);}
RemoteObject _fila = null;
RemoteObject _ap = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");
RemoteObject _ci = RemoteObject.declareNull("b4j.docU.main._cellindex");
RemoteObject _chbsel = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
RemoteObject _jo1 = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject _txtemail = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
RemoteObject _chbenviado = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
Debug.locals.put("RowIndex", _rowindex);
Debug.locals.put("Codigo", _codigo);
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Email", _email);
Debug.locals.put("Sel", _sel);
Debug.locals.put("EnvEmail", _envemail);
 BA.debugLineNum = 1183;BA.debugLine="Sub CrearFila(RowIndex As Int, Codigo As String, N";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 1184;BA.debugLine="Dim Fila(4) As Object";
Debug.ShouldStop(-2147483648);
_fila = RemoteObject.createNewArray ("Object", new int[] {4}, new Object[]{});Debug.locals.put("Fila", _fila);
 BA.debugLineNum = 1186;BA.debugLine="Dim ap As AnchorPane";
Debug.ShouldStop(2);
_ap = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("ap", _ap);
 BA.debugLineNum = 1187;BA.debugLine="ap.Initialize(\"\")";
Debug.ShouldStop(4);
_ap.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1188;BA.debugLine="Dim ci As CellIndex";
Debug.ShouldStop(8);
_ci = RemoteObject.createNew ("b4j.docU.main._cellindex");Debug.locals.put("ci", _ci);
 BA.debugLineNum = 1189;BA.debugLine="ci.Initialize";
Debug.ShouldStop(16);
_ci.runVoidMethod ("Initialize");
 BA.debugLineNum = 1190;BA.debugLine="ci.Column=0";
Debug.ShouldStop(32);
_ci.setField ("Column" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1191;BA.debugLine="ci.Row=RowIndex";
Debug.ShouldStop(64);
_ci.setField ("Row" /*RemoteObject*/ ,_rowindex);
 BA.debugLineNum = 1192;BA.debugLine="Dim chbSel As CheckBox";
Debug.ShouldStop(128);
_chbsel = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");Debug.locals.put("chbSel", _chbsel);
 BA.debugLineNum = 1193;BA.debugLine="chbSel.Initialize(\"chbSel\")";
Debug.ShouldStop(256);
_chbsel.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("chbSel")));
 BA.debugLineNum = 1194;BA.debugLine="chbSel.Tag=ci";
Debug.ShouldStop(512);
_chbsel.runMethod(false,"setTag",(_ci));
 BA.debugLineNum = 1201;BA.debugLine="CSSUtils.SetStyleProperty(chbSel,\"-fx-text-fill\",";
Debug.ShouldStop(65536);
cinformesexpedicionesclientes._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _chbsel.getObject()),(Object)(BA.ObjectToString("-fx-text-fill")),(Object)(RemoteObject.createImmutable("red")));
 BA.debugLineNum = 1202;BA.debugLine="chbSel.Visible=True";
Debug.ShouldStop(131072);
_chbsel.runMethod(true,"setVisible",cinformesexpedicionesclientes.__c.getField(true,"True"));
 BA.debugLineNum = 1203;BA.debugLine="If Sel=0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_sel,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1204;BA.debugLine="chbSel.Checked=False";
Debug.ShouldStop(524288);
_chbsel.runMethod(true,"setChecked",cinformesexpedicionesclientes.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1206;BA.debugLine="chbSel.Checked=True";
Debug.ShouldStop(2097152);
_chbsel.runMethod(true,"setChecked",cinformesexpedicionesclientes.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1208;BA.debugLine="ap.AddNode(chbSel,0,0,-1,-1)";
Debug.ShouldStop(8388608);
_ap.runVoidMethod ("AddNode",(Object)((_chbsel.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 1209;BA.debugLine="Dim jo1 = chbSel As JavaObject";
Debug.ShouldStop(16777216);
_jo1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _chbsel.getObject());Debug.locals.put("jo1", _jo1);Debug.locals.put("jo1", _jo1);
 BA.debugLineNum = 1210;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"CE";
Debug.ShouldStop(33554432);
_jo1.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CENTER"))})));
 BA.debugLineNum = 1211;BA.debugLine="ap.FillHorizontally(chbSel, 0, 0)";
Debug.ShouldStop(67108864);
_ap.runVoidMethod ("FillHorizontally",(Object)((_chbsel.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1212;BA.debugLine="Fila(0)=ap";
Debug.ShouldStop(134217728);
_fila.setArrayElement ((_ap.getObject()),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1214;BA.debugLine="Dim ap As AnchorPane";
Debug.ShouldStop(536870912);
_ap = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("ap", _ap);
 BA.debugLineNum = 1215;BA.debugLine="ap.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_ap.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1216;BA.debugLine="ap.Tag=Codigo";
Debug.ShouldStop(-2147483648);
_ap.runMethod(false,"setTag",(_codigo));
 BA.debugLineNum = 1217;BA.debugLine="Dim ci As CellIndex";
Debug.ShouldStop(1);
_ci = RemoteObject.createNew ("b4j.docU.main._cellindex");Debug.locals.put("ci", _ci);
 BA.debugLineNum = 1218;BA.debugLine="ci.Initialize";
Debug.ShouldStop(2);
_ci.runVoidMethod ("Initialize");
 BA.debugLineNum = 1219;BA.debugLine="ci.Column=0";
Debug.ShouldStop(4);
_ci.setField ("Column" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1220;BA.debugLine="ci.Row=RowIndex";
Debug.ShouldStop(8);
_ci.setField ("Row" /*RemoteObject*/ ,_rowindex);
 BA.debugLineNum = 1221;BA.debugLine="Dim txtNombre As TextField";
Debug.ShouldStop(16);
_txtnombre = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");Debug.locals.put("txtNombre", _txtnombre);
 BA.debugLineNum = 1222;BA.debugLine="txtNombre.Initialize(\"\")";
Debug.ShouldStop(32);
_txtnombre.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1223;BA.debugLine="txtNombre.Text=Nombre";
Debug.ShouldStop(64);
_txtnombre.runMethod(true,"setText",_nombre);
 BA.debugLineNum = 1224;BA.debugLine="txtNombre.Tag=ci";
Debug.ShouldStop(128);
_txtnombre.runMethod(false,"setTag",(_ci));
 BA.debugLineNum = 1225;BA.debugLine="txtNombre.Editable=False";
Debug.ShouldStop(256);
_txtnombre.runMethod(true,"setEditable",cinformesexpedicionesclientes.__c.getField(true,"False"));
 BA.debugLineNum = 1226;BA.debugLine="ap.AddNode(txtNombre,0,0,-1,-1)";
Debug.ShouldStop(512);
_ap.runVoidMethod ("AddNode",(Object)((_txtnombre.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 1227;BA.debugLine="ap.FillHorizontally(txtNombre, 0, 0)";
Debug.ShouldStop(1024);
_ap.runVoidMethod ("FillHorizontally",(Object)((_txtnombre.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1228;BA.debugLine="Dim jo1 = txtNombre As JavaObject";
Debug.ShouldStop(2048);
_jo1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _txtnombre.getObject());Debug.locals.put("jo1", _jo1);Debug.locals.put("jo1", _jo1);
 BA.debugLineNum = 1229;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"BA";
Debug.ShouldStop(4096);
_jo1.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("BASELINE_LEFT"))})));
 BA.debugLineNum = 1230;BA.debugLine="Fila(1)=ap";
Debug.ShouldStop(8192);
_fila.setArrayElement ((_ap.getObject()),BA.numberCast(int.class, 1));
 BA.debugLineNum = 1232;BA.debugLine="Dim ap As AnchorPane";
Debug.ShouldStop(32768);
_ap = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("ap", _ap);
 BA.debugLineNum = 1233;BA.debugLine="ap.Initialize(\"\")";
Debug.ShouldStop(65536);
_ap.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1234;BA.debugLine="ap.Tag=Codigo";
Debug.ShouldStop(131072);
_ap.runMethod(false,"setTag",(_codigo));
 BA.debugLineNum = 1235;BA.debugLine="Dim ci As CellIndex";
Debug.ShouldStop(262144);
_ci = RemoteObject.createNew ("b4j.docU.main._cellindex");Debug.locals.put("ci", _ci);
 BA.debugLineNum = 1236;BA.debugLine="ci.Initialize";
Debug.ShouldStop(524288);
_ci.runVoidMethod ("Initialize");
 BA.debugLineNum = 1237;BA.debugLine="ci.Column=0";
Debug.ShouldStop(1048576);
_ci.setField ("Column" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1238;BA.debugLine="ci.Row=RowIndex";
Debug.ShouldStop(2097152);
_ci.setField ("Row" /*RemoteObject*/ ,_rowindex);
 BA.debugLineNum = 1239;BA.debugLine="Dim txtEmail As TextField";
Debug.ShouldStop(4194304);
_txtemail = RemoteObject.createNew ("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");Debug.locals.put("txtEmail", _txtemail);
 BA.debugLineNum = 1240;BA.debugLine="txtEmail.Initialize(\"\")";
Debug.ShouldStop(8388608);
_txtemail.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1241;BA.debugLine="txtEmail.Text=Email";
Debug.ShouldStop(16777216);
_txtemail.runMethod(true,"setText",_email);
 BA.debugLineNum = 1242;BA.debugLine="txtEmail.Tag=ci";
Debug.ShouldStop(33554432);
_txtemail.runMethod(false,"setTag",(_ci));
 BA.debugLineNum = 1243;BA.debugLine="txtEmail.Editable=False";
Debug.ShouldStop(67108864);
_txtemail.runMethod(true,"setEditable",cinformesexpedicionesclientes.__c.getField(true,"False"));
 BA.debugLineNum = 1244;BA.debugLine="ap.AddNode(txtEmail,0,0,-1,-1)";
Debug.ShouldStop(134217728);
_ap.runVoidMethod ("AddNode",(Object)((_txtemail.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 1245;BA.debugLine="ap.FillHorizontally(txtEmail, 0, 0)";
Debug.ShouldStop(268435456);
_ap.runVoidMethod ("FillHorizontally",(Object)((_txtemail.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1246;BA.debugLine="Dim jo1 = txtEmail As JavaObject";
Debug.ShouldStop(536870912);
_jo1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _txtemail.getObject());Debug.locals.put("jo1", _jo1);Debug.locals.put("jo1", _jo1);
 BA.debugLineNum = 1247;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"BA";
Debug.ShouldStop(1073741824);
_jo1.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("BASELINE_LEFT"))})));
 BA.debugLineNum = 1248;BA.debugLine="Fila(2)=ap";
Debug.ShouldStop(-2147483648);
_fila.setArrayElement ((_ap.getObject()),BA.numberCast(int.class, 2));
 BA.debugLineNum = 1269;BA.debugLine="Dim ap As AnchorPane";
Debug.ShouldStop(1048576);
_ap = RemoteObject.createNew ("anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper");Debug.locals.put("ap", _ap);
 BA.debugLineNum = 1270;BA.debugLine="ap.Initialize(\"\")";
Debug.ShouldStop(2097152);
_ap.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1271;BA.debugLine="Dim ci As CellIndex";
Debug.ShouldStop(4194304);
_ci = RemoteObject.createNew ("b4j.docU.main._cellindex");Debug.locals.put("ci", _ci);
 BA.debugLineNum = 1272;BA.debugLine="ci.Initialize";
Debug.ShouldStop(8388608);
_ci.runVoidMethod ("Initialize");
 BA.debugLineNum = 1273;BA.debugLine="ci.Column=0";
Debug.ShouldStop(16777216);
_ci.setField ("Column" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1274;BA.debugLine="ci.Row=RowIndex";
Debug.ShouldStop(33554432);
_ci.setField ("Row" /*RemoteObject*/ ,_rowindex);
 BA.debugLineNum = 1275;BA.debugLine="Dim chbEnviado As CheckBox";
Debug.ShouldStop(67108864);
_chbenviado = RemoteObject.createNew ("anywheresoftware.b4j.objects.CheckboxWrapper");Debug.locals.put("chbEnviado", _chbenviado);
 BA.debugLineNum = 1276;BA.debugLine="chbEnviado.Initialize(\"\")";
Debug.ShouldStop(134217728);
_chbenviado.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1277;BA.debugLine="chbEnviado.Tag=ci";
Debug.ShouldStop(268435456);
_chbenviado.runMethod(false,"setTag",(_ci));
 BA.debugLineNum = 1278;BA.debugLine="CSSUtils.SetStyleProperty(chbEnviado,\"-fx-text-fi";
Debug.ShouldStop(536870912);
cinformesexpedicionesclientes._cssutils.runVoidMethod ("_setstyleproperty",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper"), _chbenviado.getObject()),(Object)(BA.ObjectToString("-fx-text-fill")),(Object)(RemoteObject.createImmutable("green")));
 BA.debugLineNum = 1279;BA.debugLine="chbEnviado.Visible=True";
Debug.ShouldStop(1073741824);
_chbenviado.runMethod(true,"setVisible",cinformesexpedicionesclientes.__c.getField(true,"True"));
 BA.debugLineNum = 1280;BA.debugLine="If EnvEmail=0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_envemail,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1281;BA.debugLine="chbEnviado.Checked=False";
Debug.ShouldStop(1);
_chbenviado.runMethod(true,"setChecked",cinformesexpedicionesclientes.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 1283;BA.debugLine="chbEnviado.Checked=True";
Debug.ShouldStop(4);
_chbenviado.runMethod(true,"setChecked",cinformesexpedicionesclientes.__c.getField(true,"True"));
 };
 BA.debugLineNum = 1285;BA.debugLine="chbEnviado.Enabled=False";
Debug.ShouldStop(16);
_chbenviado.runMethod(true,"setEnabled",cinformesexpedicionesclientes.__c.getField(true,"False"));
 BA.debugLineNum = 1286;BA.debugLine="ap.AddNode(chbEnviado,0,0,-1,-1)";
Debug.ShouldStop(32);
_ap.runVoidMethod ("AddNode",(Object)((_chbenviado.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, -(double) (0 + 1))),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 1287;BA.debugLine="Dim jo1 = chbEnviado As JavaObject";
Debug.ShouldStop(64);
_jo1 = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo1 = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _chbenviado.getObject());Debug.locals.put("jo1", _jo1);Debug.locals.put("jo1", _jo1);
 BA.debugLineNum = 1288;BA.debugLine="jo1.RunMethod(\"setAlignment\", Array As Object(\"CE";
Debug.ShouldStop(128);
_jo1.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setAlignment")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("CENTER"))})));
 BA.debugLineNum = 1289;BA.debugLine="ap.FillHorizontally(chbEnviado, 0, 0)";
Debug.ShouldStop(256);
_ap.runVoidMethod ("FillHorizontally",(Object)((_chbenviado.getObject())),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 0)));
 BA.debugLineNum = 1290;BA.debugLine="Fila(3)=ap";
Debug.ShouldStop(512);
_fila.setArrayElement ((_ap.getObject()),BA.numberCast(int.class, 3));
 BA.debugLineNum = 1292;BA.debugLine="Return Fila";
Debug.ShouldStop(2048);
if (true) return _fila;
 BA.debugLineNum = 1293;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearinformeexcel(RemoteObject __ref,RemoteObject _nombreficheroexcel,RemoteObject _codigocontacto,RemoteObject _nombrecontacto,RemoteObject _lstdatosdocumentos,RemoteObject _lstdatospedidospendientes) throws Exception{
try {
		Debug.PushSubsStack("CrearInformeExcel (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1737);
if (RapidSub.canDelegate("crearinformeexcel")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","crearinformeexcel", __ref, _nombreficheroexcel, _codigocontacto, _nombrecontacto, _lstdatosdocumentos, _lstdatospedidospendientes);}
RemoteObject _wb = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
RemoteObject _csfecha = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellStyleWrapper");
RemoteObject _fnegritaazul = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiFontWrapper");
RemoteObject _csencabezado = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellStyleWrapper");
RemoteObject _sheet1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiSheetWrapper");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _filaencabezados = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiRowWrapper");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nk = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _c = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiCellWrapper");
RemoteObject _numfilaexcel = RemoteObject.createImmutable(0);
RemoteObject _campo = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _filaexcel = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiRowWrapper");
int _j = 0;
RemoteObject _ky = RemoteObject.createImmutable("");
RemoteObject _sheet2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiSheetWrapper");
RemoteObject _filaencabezados2 = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiRowWrapper");
RemoteObject _e = RemoteObject.declareNull("b4j.docU.main._errorprocesoinformecliente");
Debug.locals.put("NombreFicheroExcel", _nombreficheroexcel);
Debug.locals.put("CodigoContacto", _codigocontacto);
Debug.locals.put("NombreContacto", _nombrecontacto);
Debug.locals.put("lstDatosDocumentos", _lstdatosdocumentos);
Debug.locals.put("lstDatosPedidosPendientes", _lstdatospedidospendientes);
 BA.debugLineNum = 1737;BA.debugLine="public Sub CrearInformeExcel(NombreFicheroExcel As";
Debug.ShouldStop(256);
 BA.debugLineNum = 1739;BA.debugLine="Dim wb As PoiWorkbook";
Debug.ShouldStop(1024);
_wb = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiWorkbookWrapper");Debug.locals.put("wb", _wb);
 BA.debugLineNum = 1740;BA.debugLine="wb.InitializeNew(True) 'crear nuevo libro";
Debug.ShouldStop(2048);
_wb.runVoidMethod ("InitializeNew",(Object)(cinformesexpedicionesclientes.__c.getField(true,"True")));
 BA.debugLineNum = 1742;BA.debugLine="Dim csFecha As PoiCellStyle";
Debug.ShouldStop(8192);
_csfecha = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellStyleWrapper");Debug.locals.put("csFecha", _csfecha);
 BA.debugLineNum = 1743;BA.debugLine="csFecha.Initialize(wb)";
Debug.ShouldStop(16384);
_csfecha.runVoidMethod ("Initialize",(Object)(_wb));
 BA.debugLineNum = 1744;BA.debugLine="csFecha.SetDataFormat(wb,\"dd/MM/yyyy\")";
Debug.ShouldStop(32768);
_csfecha.runVoidMethod ("SetDataFormat",(Object)(_wb),(Object)(RemoteObject.createImmutable("dd/MM/yyyy")));
 BA.debugLineNum = 1746;BA.debugLine="Dim fNegritaAzul As PoiFont";
Debug.ShouldStop(131072);
_fnegritaazul = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiFontWrapper");Debug.locals.put("fNegritaAzul", _fnegritaazul);
 BA.debugLineNum = 1747;BA.debugLine="fNegritaAzul.Initialize(wb)";
Debug.ShouldStop(262144);
_fnegritaazul.runVoidMethod ("Initialize",(Object)(_wb));
 BA.debugLineNum = 1748;BA.debugLine="fNegritaAzul.Bold = True";
Debug.ShouldStop(524288);
_fnegritaazul.runMethod(true,"setBold",cinformesexpedicionesclientes.__c.getField(true,"True"));
 BA.debugLineNum = 1750;BA.debugLine="fNegritaAzul.SetColor(0xFF1E90FF)";
Debug.ShouldStop(2097152);
_fnegritaazul.runVoidMethod ("SetColor",(Object)(BA.numberCast(int.class, ((int)0xff1e90ff))));
 BA.debugLineNum = 1753;BA.debugLine="Dim csEncabezado As PoiCellStyle";
Debug.ShouldStop(16777216);
_csencabezado = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellStyleWrapper");Debug.locals.put("csEncabezado", _csencabezado);
 BA.debugLineNum = 1754;BA.debugLine="csEncabezado.Initialize(wb)";
Debug.ShouldStop(33554432);
_csencabezado.runVoidMethod ("Initialize",(Object)(_wb));
 BA.debugLineNum = 1755;BA.debugLine="csEncabezado.SetFont(fNegritaAzul)";
Debug.ShouldStop(67108864);
_csencabezado.runVoidMethod ("SetFont",(Object)(_fnegritaazul));
 BA.debugLineNum = 1774;BA.debugLine="Dim sheet1 As PoiSheet";
Debug.ShouldStop(8192);
_sheet1 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiSheetWrapper");Debug.locals.put("sheet1", _sheet1);
 BA.debugLineNum = 1775;BA.debugLine="sheet1 = wb.AddSheet(\"Documentos Expedidos\",0)";
Debug.ShouldStop(16384);
_sheet1 = _wb.runMethod(false,"AddSheet",(Object)(BA.ObjectToString("Documentos Expedidos")),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("sheet1", _sheet1);
 BA.debugLineNum = 1777;BA.debugLine="Dim jo As JavaObject=sheet1";
Debug.ShouldStop(65536);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _sheet1.getObject());Debug.locals.put("jo", _jo);Debug.locals.put("jo", _jo);
 BA.debugLineNum = 1778;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 1779;BA.debugLine="jo.RunMethod(\"trackAllColumnsForAutoSizing\",Null";
Debug.ShouldStop(262144);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("trackAllColumnsForAutoSizing")),(Object)((cinformesexpedicionesclientes.__c.getField(false,"Null"))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e19) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e19.toString()); BA.debugLineNum = 1782;BA.debugLine="Log(LastException)";
Debug.ShouldStop(2097152);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891357229",BA.ObjectToString(cinformesexpedicionesclientes.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 1788;BA.debugLine="Dim FilaEncabezados As PoiRow = sheet1.CreateRow(";
Debug.ShouldStop(134217728);
_filaencabezados = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_filaencabezados = _sheet1.runMethod(false,"CreateRow",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("FilaEncabezados", _filaencabezados);Debug.locals.put("FilaEncabezados", _filaencabezados);
 BA.debugLineNum = 1791;BA.debugLine="Dim m As Map=lstDatosDocumentos.Get(0)";
Debug.ShouldStop(1073741824);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatosdocumentos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1792;BA.debugLine="Dim nK As Int";
Debug.ShouldStop(-2147483648);
_nk = RemoteObject.createImmutable(0);Debug.locals.put("nK", _nk);
 BA.debugLineNum = 1793;BA.debugLine="For Each k As String In m.Keys";
Debug.ShouldStop(1);
{
final RemoteObject group24 = _m.runMethod(false,"Keys");
final int groupLen24 = group24.runMethod(true,"getSize").<Integer>get()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_k = BA.ObjectToString(group24.runMethod(false,"Get",index24));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1795;BA.debugLine="Select True";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
 BA.debugLineNum = 1797;BA.debugLine="If lstCamposInformeDocumentosExpedidosClientes";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformedocumentosexpedidosclientes" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_k))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1798;BA.debugLine="FilaEncabezados.CreateCellString(nK,k)";
Debug.ShouldStop(32);
_filaencabezados.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(_k));
 BA.debugLineNum = 1799;BA.debugLine="Dim c As PoiCell=FilaEncabezados.GetCell(nK)";
Debug.ShouldStop(64);
_c = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_c = _filaencabezados.runMethod(false,"GetCell",(Object)(_nk));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1800;BA.debugLine="c.CellStyle=csEncabezado";
Debug.ShouldStop(128);
_c.runMethod(false,"setCellStyle",_csencabezado);
 BA.debugLineNum = 1801;BA.debugLine="nK=nK+1";
Debug.ShouldStop(256);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 break; }
case 1: {
 BA.debugLineNum = 1808;BA.debugLine="If lstCamposInformeDocumentosExpedidosComercia";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformedocumentosexpedidoscomerciales" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_k))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1809;BA.debugLine="FilaEncabezados.CreateCellString(nK,k)";
Debug.ShouldStop(65536);
_filaencabezados.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(_k));
 BA.debugLineNum = 1810;BA.debugLine="Dim c As PoiCell=FilaEncabezados.GetCell(nK)";
Debug.ShouldStop(131072);
_c = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_c = _filaencabezados.runMethod(false,"GetCell",(Object)(_nk));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1811;BA.debugLine="c.CellStyle=csEncabezado";
Debug.ShouldStop(262144);
_c.runMethod(false,"setCellStyle",_csencabezado);
 BA.debugLineNum = 1812;BA.debugLine="nK=nK+1";
Debug.ShouldStop(524288);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 break; }
}
;
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1818;BA.debugLine="Dim NumFilaExcel As Int=1";
Debug.ShouldStop(33554432);
_numfilaexcel = BA.numberCast(int.class, 1);Debug.locals.put("NumFilaExcel", _numfilaexcel);Debug.locals.put("NumFilaExcel", _numfilaexcel);
 BA.debugLineNum = 1821;BA.debugLine="Dim Campo As String";
Debug.ShouldStop(268435456);
_campo = RemoteObject.createImmutable("");Debug.locals.put("Campo", _campo);
 BA.debugLineNum = 1822;BA.debugLine="Select True";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
 BA.debugLineNum = 1824;BA.debugLine="Campo=\"Contacto\"";
Debug.ShouldStop(-2147483648);
_campo = BA.ObjectToString("Contacto");Debug.locals.put("Campo", _campo);
 break; }
case 1: {
 BA.debugLineNum = 1826;BA.debugLine="Campo=\"Comercial\"";
Debug.ShouldStop(2);
_campo = BA.ObjectToString("Comercial");Debug.locals.put("Campo", _campo);
 break; }
}
;
 BA.debugLineNum = 1828;BA.debugLine="For i=0 To lstDatosDocumentos.Size-1";
Debug.ShouldStop(8);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {_lstdatosdocumentos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50) ;_i = ((int)(0 + _i + step50))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1829;BA.debugLine="Dim m As Map=lstDatosDocumentos.Get(i)";
Debug.ShouldStop(16);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatosdocumentos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1831;BA.debugLine="If m.Get(Campo)=CodigoContacto Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_m.runMethod(false,"Get",(Object)((_campo))),(_codigocontacto))) { 
 BA.debugLineNum = 1832;BA.debugLine="Dim FilaExcel As PoiRow = sheet1.CreateRow(NumF";
Debug.ShouldStop(128);
_filaexcel = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_filaexcel = _sheet1.runMethod(false,"CreateRow",(Object)(_numfilaexcel));Debug.locals.put("FilaExcel", _filaexcel);Debug.locals.put("FilaExcel", _filaexcel);
 BA.debugLineNum = 1833;BA.debugLine="Dim nK As Int";
Debug.ShouldStop(256);
_nk = RemoteObject.createImmutable(0);Debug.locals.put("nK", _nk);
 BA.debugLineNum = 1834;BA.debugLine="Select True";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
 BA.debugLineNum = 1836;BA.debugLine="For j=0 To m.Size-1";
Debug.ShouldStop(2048);
{
final int step57 = 1;
final int limit57 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step57 > 0 && _j <= limit57) || (step57 < 0 && _j >= limit57) ;_j = ((int)(0 + _j + step57))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1837;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
Debug.ShouldStop(4096);
_ky = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("ky", _ky);Debug.locals.put("ky", _ky);
 BA.debugLineNum = 1839;BA.debugLine="If lstCamposInformeDocumentosExpedidosClient";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformedocumentosexpedidosclientes" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_ky))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1841;BA.debugLine="Select True";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Cantidad"))),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Fecha"))))) {
case 0: {
 BA.debugLineNum = 1844;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
Debug.ShouldStop(524288);
_filaexcel.runVoidMethod ("CreateCellNumeric",(Object)(_nk),(Object)(BA.numberCast(double.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
case 1: {
 BA.debugLineNum = 1847;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.Da";
Debug.ShouldStop(4194304);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(cinformesexpedicionesclientes.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))))));
 break; }
default: {
 BA.debugLineNum = 1853;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
Debug.ShouldStop(268435456);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(BA.ObjectToString(_m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
}
;
 BA.debugLineNum = 1855;BA.debugLine="nK=nK+1";
Debug.ShouldStop(1073741824);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 }
}Debug.locals.put("j", _j);
;
 break; }
case 1: {
 BA.debugLineNum = 1861;BA.debugLine="For j=0 To m.Size-1";
Debug.ShouldStop(16);
{
final int step72 = 1;
final int limit72 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step72 > 0 && _j <= limit72) || (step72 < 0 && _j >= limit72) ;_j = ((int)(0 + _j + step72))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1862;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
Debug.ShouldStop(32);
_ky = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("ky", _ky);Debug.locals.put("ky", _ky);
 BA.debugLineNum = 1864;BA.debugLine="If lstCamposInformeDocumentosExpedidosComerc";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformedocumentosexpedidoscomerciales" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_ky))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1866;BA.debugLine="Select True";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Cantidad"))),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Fecha"))))) {
case 0: {
 BA.debugLineNum = 1869;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
Debug.ShouldStop(4096);
_filaexcel.runVoidMethod ("CreateCellNumeric",(Object)(_nk),(Object)(BA.numberCast(double.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
case 1: {
 BA.debugLineNum = 1872;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.Da";
Debug.ShouldStop(32768);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(cinformesexpedicionesclientes.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))))));
 break; }
default: {
 BA.debugLineNum = 1874;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
Debug.ShouldStop(131072);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(BA.ObjectToString(_m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
}
;
 BA.debugLineNum = 1876;BA.debugLine="nK=nK+1";
Debug.ShouldStop(524288);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 }
}Debug.locals.put("j", _j);
;
 break; }
}
;
 BA.debugLineNum = 1881;BA.debugLine="NumFilaExcel=NumFilaExcel+1";
Debug.ShouldStop(16777216);
_numfilaexcel = RemoteObject.solve(new RemoteObject[] {_numfilaexcel,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumFilaExcel", _numfilaexcel);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1885;BA.debugLine="Dim m As Map=lstDatosDocumentos.Get(0)";
Debug.ShouldStop(268435456);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatosdocumentos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1886;BA.debugLine="Dim nK As Int";
Debug.ShouldStop(536870912);
_nk = RemoteObject.createImmutable(0);Debug.locals.put("nK", _nk);
 BA.debugLineNum = 1887;BA.debugLine="For Each k As String In m.Keys";
Debug.ShouldStop(1073741824);
{
final RemoteObject group92 = _m.runMethod(false,"Keys");
final int groupLen92 = group92.runMethod(true,"getSize").<Integer>get()
;int index92 = 0;
;
for (; index92 < groupLen92;index92++){
_k = BA.ObjectToString(group92.runMethod(false,"Get",index92));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1888;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 1889;BA.debugLine="jo.RunMethod(\"autoSizeColumn\",Array(nK))";
Debug.ShouldStop(1);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("autoSizeColumn")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nk)})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e96) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e96.toString()); BA.debugLineNum = 1891;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891357338",BA.ObjectToString(cinformesexpedicionesclientes.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 1893;BA.debugLine="nK=nK+1";
Debug.ShouldStop(16);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1899;BA.debugLine="Dim sheet2 As PoiSheet";
Debug.ShouldStop(1024);
_sheet2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiSheetWrapper");Debug.locals.put("sheet2", _sheet2);
 BA.debugLineNum = 1900;BA.debugLine="sheet2 = wb.AddSheet(\"Pedidos Pendientes\",1)";
Debug.ShouldStop(2048);
_sheet2 = _wb.runMethod(false,"AddSheet",(Object)(BA.ObjectToString("Pedidos Pendientes")),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("sheet2", _sheet2);
 BA.debugLineNum = 1909;BA.debugLine="If lstDatosPedidosPendientes.Size>0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_lstdatospedidospendientes.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1913;BA.debugLine="Dim FilaEncabezados2 As PoiRow = sheet2.CreateRo";
Debug.ShouldStop(16777216);
_filaencabezados2 = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_filaencabezados2 = _sheet2.runMethod(false,"CreateRow",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("FilaEncabezados2", _filaencabezados2);Debug.locals.put("FilaEncabezados2", _filaencabezados2);
 BA.debugLineNum = 1915;BA.debugLine="Dim m As Map=lstDatosPedidosPendientes.Get(0)";
Debug.ShouldStop(67108864);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatospedidospendientes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1916;BA.debugLine="Dim nK As Int";
Debug.ShouldStop(134217728);
_nk = RemoteObject.createImmutable(0);Debug.locals.put("nK", _nk);
 BA.debugLineNum = 1917;BA.debugLine="Select True";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
 BA.debugLineNum = 1919;BA.debugLine="For Each k As String In m.Keys";
Debug.ShouldStop(1073741824);
{
final RemoteObject group108 = _m.runMethod(false,"Keys");
final int groupLen108 = group108.runMethod(true,"getSize").<Integer>get()
;int index108 = 0;
;
for (; index108 < groupLen108;index108++){
_k = BA.ObjectToString(group108.runMethod(false,"Get",index108));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1920;BA.debugLine="If lstCamposInformePedidosPendientesClientes.";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformepedidospendientesclientes" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_k))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1921;BA.debugLine="FilaEncabezados2.CreateCellString(nK,k)";
Debug.ShouldStop(1);
_filaencabezados2.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(_k));
 BA.debugLineNum = 1922;BA.debugLine="Dim c As PoiCell=FilaEncabezados2.GetCell(nK";
Debug.ShouldStop(2);
_c = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_c = _filaencabezados2.runMethod(false,"GetCell",(Object)(_nk));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1923;BA.debugLine="c.CellStyle=csEncabezado";
Debug.ShouldStop(4);
_c.runMethod(false,"setCellStyle",_csencabezado);
 BA.debugLineNum = 1924;BA.debugLine="nK=nK+1";
Debug.ShouldStop(8);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 }
}Debug.locals.put("k", _k);
;
 break; }
case 1: {
 BA.debugLineNum = 1934;BA.debugLine="For Each k As String In m.Keys";
Debug.ShouldStop(8192);
{
final RemoteObject group117 = _m.runMethod(false,"Keys");
final int groupLen117 = group117.runMethod(true,"getSize").<Integer>get()
;int index117 = 0;
;
for (; index117 < groupLen117;index117++){
_k = BA.ObjectToString(group117.runMethod(false,"Get",index117));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1935;BA.debugLine="If lstCamposInformePedidosPendientesComercial";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformepedidospendientescomerciales" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_k))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1936;BA.debugLine="FilaEncabezados2.CreateCellString(nK,k)";
Debug.ShouldStop(32768);
_filaencabezados2.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(_k));
 BA.debugLineNum = 1937;BA.debugLine="Dim c As PoiCell=FilaEncabezados2.GetCell(nK";
Debug.ShouldStop(65536);
_c = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiCellWrapper");
_c = _filaencabezados2.runMethod(false,"GetCell",(Object)(_nk));Debug.locals.put("c", _c);Debug.locals.put("c", _c);
 BA.debugLineNum = 1938;BA.debugLine="c.CellStyle=csEncabezado";
Debug.ShouldStop(131072);
_c.runMethod(false,"setCellStyle",_csencabezado);
 BA.debugLineNum = 1939;BA.debugLine="nK=nK+1";
Debug.ShouldStop(262144);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 }
}Debug.locals.put("k", _k);
;
 break; }
}
;
 BA.debugLineNum = 1945;BA.debugLine="Dim NumFilaExcel As Int=1";
Debug.ShouldStop(16777216);
_numfilaexcel = BA.numberCast(int.class, 1);Debug.locals.put("NumFilaExcel", _numfilaexcel);Debug.locals.put("NumFilaExcel", _numfilaexcel);
 BA.debugLineNum = 1946;BA.debugLine="For i=0 To lstDatosPedidosPendientes.Size-1";
Debug.ShouldStop(33554432);
{
final int step127 = 1;
final int limit127 = RemoteObject.solve(new RemoteObject[] {_lstdatospedidospendientes.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step127 > 0 && _i <= limit127) || (step127 < 0 && _i >= limit127) ;_i = ((int)(0 + _i + step127))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1947;BA.debugLine="Dim m As Map=lstDatosPedidosPendientes.Get(i)";
Debug.ShouldStop(67108864);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatospedidospendientes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1948;BA.debugLine="Dim FilaExcel As PoiRow = sheet2.CreateRow(NumF";
Debug.ShouldStop(134217728);
_filaexcel = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_filaexcel = _sheet2.runMethod(false,"CreateRow",(Object)(_numfilaexcel));Debug.locals.put("FilaExcel", _filaexcel);Debug.locals.put("FilaExcel", _filaexcel);
 BA.debugLineNum = 1949;BA.debugLine="Dim nK As Int";
Debug.ShouldStop(268435456);
_nk = RemoteObject.createImmutable(0);Debug.locals.put("nK", _nk);
 BA.debugLineNum = 1950;BA.debugLine="Select True";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
 BA.debugLineNum = 1952;BA.debugLine="For j=0 To m.Size-1";
Debug.ShouldStop(-2147483648);
{
final int step133 = 1;
final int limit133 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step133 > 0 && _j <= limit133) || (step133 < 0 && _j >= limit133) ;_j = ((int)(0 + _j + step133))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1953;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
Debug.ShouldStop(1);
_ky = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("ky", _ky);Debug.locals.put("ky", _ky);
 BA.debugLineNum = 1955;BA.debugLine="If lstCamposInformePedidosPendientesClientes";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformepedidospendientesclientes" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_ky))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1956;BA.debugLine="Select True";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Cantidad"))),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Fecha"))))) {
case 0: {
 BA.debugLineNum = 1959;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
Debug.ShouldStop(64);
_filaexcel.runVoidMethod ("CreateCellNumeric",(Object)(_nk),(Object)(BA.numberCast(double.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
case 1: {
 BA.debugLineNum = 1963;BA.debugLine="If m.GetValueAt(j)<DateTime.DateParse(\"01";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j)))),BA.numberCast(double.class, cinformesexpedicionesclientes.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("01/01/2000")))))) { 
 BA.debugLineNum = 1964;BA.debugLine="FilaExcel.CreateCellString(nK,\"\")";
Debug.ShouldStop(2048);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(RemoteObject.createImmutable("")));
 }else {
 BA.debugLineNum = 1966;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.D";
Debug.ShouldStop(8192);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(cinformesexpedicionesclientes.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))))));
 };
 break; }
default: {
 BA.debugLineNum = 1969;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
Debug.ShouldStop(65536);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(BA.ObjectToString(_m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
}
;
 BA.debugLineNum = 1971;BA.debugLine="nK=nK+1";
Debug.ShouldStop(262144);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1975;BA.debugLine="NumFilaExcel=NumFilaExcel+1";
Debug.ShouldStop(4194304);
_numfilaexcel = RemoteObject.solve(new RemoteObject[] {_numfilaexcel,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumFilaExcel", _numfilaexcel);
 break; }
case 1: {
 BA.debugLineNum = 1979;BA.debugLine="For j=0 To m.Size-1";
Debug.ShouldStop(67108864);
{
final int step153 = 1;
final int limit153 = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_j = 0 ;
for (;(step153 > 0 && _j <= limit153) || (step153 < 0 && _j >= limit153) ;_j = ((int)(0 + _j + step153))  ) {
Debug.locals.put("j", _j);
 BA.debugLineNum = 1980;BA.debugLine="Dim ky As String=m.GetKeyAt(j)";
Debug.ShouldStop(134217728);
_ky = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _j))));Debug.locals.put("ky", _ky);Debug.locals.put("ky", _ky);
 BA.debugLineNum = 1982;BA.debugLine="If lstCamposInformePedidosPendientesComercia";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstcamposinformepedidospendientescomerciales" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_ky))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1983;BA.debugLine="Select True";
Debug.ShouldStop(1073741824);
switch (BA.switchObjectToInt(cinformesexpedicionesclientes.__c.getField(true,"True"),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Cantidad"))),_ky.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("Fecha"))))) {
case 0: {
 BA.debugLineNum = 1986;BA.debugLine="FilaExcel.CreateCellNumeric(nK,m.GetValue";
Debug.ShouldStop(2);
_filaexcel.runVoidMethod ("CreateCellNumeric",(Object)(_nk),(Object)(BA.numberCast(double.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
case 1: {
 BA.debugLineNum = 1989;BA.debugLine="If m.GetValueAt(j)<DateTime.DateParse(\"01";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j)))),BA.numberCast(double.class, cinformesexpedicionesclientes.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(RemoteObject.createImmutable("01/01/2000")))))) { 
 BA.debugLineNum = 1990;BA.debugLine="FilaExcel.CreateCellString(nK,\"\")";
Debug.ShouldStop(32);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(RemoteObject.createImmutable("")));
 }else {
 BA.debugLineNum = 1992;BA.debugLine="FilaExcel.CreateCellString(nK,DateTime.D";
Debug.ShouldStop(128);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(cinformesexpedicionesclientes.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))))));
 };
 break; }
default: {
 BA.debugLineNum = 1996;BA.debugLine="FilaExcel.CreateCellString(nK,m.GetValueA";
Debug.ShouldStop(2048);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(_nk),(Object)(BA.ObjectToString(_m.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, _j))))));
 break; }
}
;
 BA.debugLineNum = 1998;BA.debugLine="nK=nK+1";
Debug.ShouldStop(8192);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 };
 }
}Debug.locals.put("j", _j);
;
 BA.debugLineNum = 2001;BA.debugLine="NumFilaExcel=NumFilaExcel+1";
Debug.ShouldStop(65536);
_numfilaexcel = RemoteObject.solve(new RemoteObject[] {_numfilaexcel,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("NumFilaExcel", _numfilaexcel);
 break; }
}
;
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 2007;BA.debugLine="Dim m As Map=lstDatosPedidosPendientes.Get(0)";
Debug.ShouldStop(4194304);
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstdatospedidospendientes.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 2008;BA.debugLine="Dim nK As Int";
Debug.ShouldStop(8388608);
_nk = RemoteObject.createImmutable(0);Debug.locals.put("nK", _nk);
 BA.debugLineNum = 2009;BA.debugLine="For Each k As String In m.Keys";
Debug.ShouldStop(16777216);
{
final RemoteObject group176 = _m.runMethod(false,"Keys");
final int groupLen176 = group176.runMethod(true,"getSize").<Integer>get()
;int index176 = 0;
;
for (; index176 < groupLen176;index176++){
_k = BA.ObjectToString(group176.runMethod(false,"Get",index176));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 2010;BA.debugLine="Try";
Debug.ShouldStop(33554432);
try { BA.debugLineNum = 2011;BA.debugLine="jo.RunMethod(\"autoSizeColumn\",Array(nK))";
Debug.ShouldStop(67108864);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("autoSizeColumn")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nk)})));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e180) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e180.toString()); BA.debugLineNum = 2013;BA.debugLine="Log(LastException)";
Debug.ShouldStop(268435456);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891357460",BA.ObjectToString(cinformesexpedicionesclientes.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
 BA.debugLineNum = 2015;BA.debugLine="nK=nK+1";
Debug.ShouldStop(1073741824);
_nk = RemoteObject.solve(new RemoteObject[] {_nk,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nK", _nk);
 }
}Debug.locals.put("k", _k);
;
 }else {
 BA.debugLineNum = 2018;BA.debugLine="Dim FilaExcel As PoiRow = sheet2.CreateRow(0)";
Debug.ShouldStop(2);
_filaexcel = RemoteObject.createNew ("anywheresoftware.b4j.objects.PoiRowWrapper");
_filaexcel = _sheet2.runMethod(false,"CreateRow",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("FilaExcel", _filaexcel);Debug.locals.put("FilaExcel", _filaexcel);
 BA.debugLineNum = 2019;BA.debugLine="FilaExcel.CreateCellString(0,\"Sin pedidos pendie";
Debug.ShouldStop(4);
_filaexcel.runVoidMethod ("CreateCellString",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.createImmutable("Sin pedidos pendientes")));
 };
 BA.debugLineNum = 2024;BA.debugLine="Try";
Debug.ShouldStop(128);
try { BA.debugLineNum = 2025;BA.debugLine="wb.Save(File.DirData(\"Expediciones\"), NombreFich";
Debug.ShouldStop(256);
_wb.runVoidMethod ("Save",(Object)(cinformesexpedicionesclientes.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("Expediciones")))),(Object)(RemoteObject.concat(_nombreficheroexcel,RemoteObject.createImmutable(".xlsx"))));
 BA.debugLineNum = 2026;BA.debugLine="wb.Close";
Debug.ShouldStop(512);
_wb.runVoidMethod ("Close");
 BA.debugLineNum = 2027;BA.debugLine="lblProgress.Text=\"Excel informe para \" & NombreC";
Debug.ShouldStop(1024);
__ref.getField(false,"_lblprogress" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Excel informe para "),_nombrecontacto,RemoteObject.createImmutable(" grabada.")));
 BA.debugLineNum = 2028;BA.debugLine="Return True";
Debug.ShouldStop(2048);
Debug.CheckDeviceExceptions();if (true) return cinformesexpedicionesclientes.__c.getField(true,"True");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e194) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e194.toString()); BA.debugLineNum = 2032;BA.debugLine="Dim E As ErrorProcesoInformeCliente";
Debug.ShouldStop(32768);
_e = RemoteObject.createNew ("b4j.docU.main._errorprocesoinformecliente");Debug.locals.put("E", _e);
 BA.debugLineNum = 2033;BA.debugLine="E.Initialize";
Debug.ShouldStop(65536);
_e.runVoidMethod ("Initialize");
 BA.debugLineNum = 2034;BA.debugLine="E.CodigoContacto=CodigoContacto";
Debug.ShouldStop(131072);
_e.setField ("CodigoContacto" /*RemoteObject*/ ,_codigocontacto);
 BA.debugLineNum = 2035;BA.debugLine="E.NombreContacto=NombreContacto";
Debug.ShouldStop(262144);
_e.setField ("NombreContacto" /*RemoteObject*/ ,_nombrecontacto);
 BA.debugLineNum = 2036;BA.debugLine="E.ProcesoError=\"Creación Fichero Excel\"";
Debug.ShouldStop(524288);
_e.setField ("ProcesoError" /*RemoteObject*/ ,BA.ObjectToString("Creación Fichero Excel"));
 BA.debugLineNum = 2037;BA.debugLine="E.DescripcionError=LastException.Message";
Debug.ShouldStop(1048576);
_e.setField ("DescripcionError" /*RemoteObject*/ ,cinformesexpedicionesclientes.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"));
 BA.debugLineNum = 2038;BA.debugLine="lstErrores.Add(E)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_lsterrores" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_e)));
 BA.debugLineNum = 2039;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4194304);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891357486",cinformesexpedicionesclientes.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 2040;BA.debugLine="lblProgress.Text=\"Error al intentar grabar excel";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lblprogress" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Error al intentar grabar excel informe para "),_nombrecontacto,RemoteObject.createImmutable(".")));
 BA.debugLineNum = 2041;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) return cinformesexpedicionesclientes.__c.getField(true,"False");
 };
 BA.debugLineNum = 2044;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4j.docU.main._dbcommand");
Debug.locals.put("name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 98;BA.debugLine="Sub CreateCommand(name As String, Parameters() As";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(4);
_cmd = RemoteObject.createNew ("b4j.docU.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 100;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(8);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 101;BA.debugLine="cmd.Name = name";
Debug.ShouldStop(16);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 102;BA.debugLine="If Parameters <> Null Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_parameters)) { 
 BA.debugLineNum = 103;BA.debugLine="cmd.Parameters = Parameters";
Debug.ShouldStop(64);
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);
 };
 BA.debugLineNum = 106;BA.debugLine="Return cmd";
Debug.ShouldStop(512);
if (true) return _cmd;
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","createrequest", __ref);}
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
 BA.debugLineNum = 86;BA.debugLine="Sub CreateRequest As DBRequestManager";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(4194304);
_req = RemoteObject.createNew ("b4j.docU.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 88;BA.debugLine="req.Initialize(Me, Main.rdclinkMySqlDatosComunes)";
Debug.ShouldStop(8388608);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(cinformesexpedicionesclientes._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ));
 BA.debugLineNum = 89;BA.debugLine="Return req";
Debug.ShouldStop(16777216);
if (true) return _req;
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequestnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateRequestNav (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("createrequestnav")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","createrequestnav", __ref);}
RemoteObject _req = RemoteObject.declareNull("b4j.docU.dbrequestmanager");
 BA.debugLineNum = 92;BA.debugLine="Sub CreateRequestNav As DBRequestManager";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(268435456);
_req = RemoteObject.createNew ("b4j.docU.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 94;BA.debugLine="req.Initialize(Me, Main.rdcLinkNav)";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4j.docU.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(cinformesexpedicionesclientes._main._rdclinknav /*RemoteObject*/ ));
 BA.debugLineNum = 95;BA.debugLine="Return req";
Debug.ShouldStop(1073741824);
if (true) return _req;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createworkbook(RemoteObject __ref,RemoteObject _rutafichero) throws Exception{
try {
		Debug.PushSubsStack("CreateWorkbook (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2260);
if (RapidSub.canDelegate("createworkbook")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","createworkbook", __ref, _rutafichero);}
ResumableSub_CreateWorkbook rsub = new ResumableSub_CreateWorkbook(null,__ref,_rutafichero);
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
public static class ResumableSub_CreateWorkbook extends BA.ResumableSub {
public ResumableSub_CreateWorkbook(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _rutafichero) {
this.parent = parent;
this.__ref = __ref;
this._rutafichero = _rutafichero;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _rutafichero;
RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
RemoteObject _workbook = RemoteObject.declareNull("b4j.docU.xlworkbookwriter");
RemoteObject _sheet1 = RemoteObject.declareNull("b4j.docU.xlsheetwriter");
RemoteObject _titlestyle = RemoteObject.declareNull("b4j.docU.xlstyle");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _e = RemoteObject.declareNull("b4j.docU.main._errorprocesoinformecliente");
int _col0 = 0;
RemoteObject _f = RemoteObject.createImmutable("");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject group16;
int index16;
int groupLen16;
int step29;
int limit29;
int step32;
int limit32;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateWorkbook (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2260);
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
Debug.locals.put("RutaFichero", _rutafichero);
 BA.debugLineNum = 2261;BA.debugLine="Dim xl As XLUtils";
Debug.ShouldStop(1048576);
_xl = RemoteObject.createNew ("b4j.docU.xlutils");Debug.locals.put("xl", _xl);
 BA.debugLineNum = 2262;BA.debugLine="xl.Initialize";
Debug.ShouldStop(2097152);
_xl.runClassMethod (b4j.docU.xlutils.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 2263;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
Debug.ShouldStop(4194304);
_workbook = _xl.runClassMethod (b4j.docU.xlutils.class, "_createwriterblank" /*RemoteObject*/ );Debug.locals.put("Workbook", _workbook);Debug.locals.put("Workbook", _workbook);
 BA.debugLineNum = 2264;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
Debug.ShouldStop(8388608);
_sheet1 = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createsheetwriterbyname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Sheet1")));Debug.locals.put("sheet1", _sheet1);Debug.locals.put("sheet1", _sheet1);
 BA.debugLineNum = 2265;BA.debugLine="Dim TitleStyle As XLStyle = Workbook.CreateStyle";
Debug.ShouldStop(16777216);
_titlestyle = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ );Debug.locals.put("TitleStyle", _titlestyle);Debug.locals.put("TitleStyle", _titlestyle);
 BA.debugLineNum = 2266;BA.debugLine="TitleStyle.ForegroundColor(xl.COLOR_GREY_80_PERCE";
Debug.ShouldStop(33554432);
_titlestyle.runClassMethod (b4j.docU.xlstyle.class, "_foregroundcolor" /*RemoteObject*/ ,(Object)(_xl.getField(true,"_color_grey_80_percent" /*RemoteObject*/ ))).runClassMethod (b4j.docU.xlstyle.class, "_fontboldcolor" /*RemoteObject*/ ,(Object)(BA.numberCast(short.class, 12)),(Object)(BA.numberCast(int.class, _xl.getField(true,"_color_white" /*RemoteObject*/ )))).runClassMethod (b4j.docU.xlstyle.class, "_horizontalalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 2267;BA.debugLine="sheet1.PutString(xl.AddressName(\"A1\"), \"Proceso\")";
Debug.ShouldStop(67108864);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("A1")))),(Object)(RemoteObject.createImmutable("Proceso"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyles" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_titlestyle),(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_borderleft" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("THIN"))))})))));
 BA.debugLineNum = 2268;BA.debugLine="sheet1.PutString(xl.AddressName(\"B1\"), \"Cliente\")";
Debug.ShouldStop(134217728);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("B1")))),(Object)(RemoteObject.createImmutable("Cliente"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_titlestyle));
 BA.debugLineNum = 2269;BA.debugLine="sheet1.PutString(xl.AddressName(\"C1\"), \"NombreCli";
Debug.ShouldStop(268435456);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("C1")))),(Object)(RemoteObject.createImmutable("NombreCliente"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_titlestyle));
 BA.debugLineNum = 2270;BA.debugLine="sheet1.PutString(xl.AddressName(\"D1\"), \"Responsab";
Debug.ShouldStop(536870912);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("D1")))),(Object)(RemoteObject.createImmutable("Responsable Cuenta"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_titlestyle));
 BA.debugLineNum = 2271;BA.debugLine="sheet1.PutString(xl.AddressName(\"E1\"), \"Codigo Co";
Debug.ShouldStop(1073741824);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("E1")))),(Object)(RemoteObject.createImmutable("Codigo Contacto"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_titlestyle));
 BA.debugLineNum = 2272;BA.debugLine="sheet1.PutString(xl.AddressName(\"F1\"), \"Nombre Co";
Debug.ShouldStop(-2147483648);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("F1")))),(Object)(RemoteObject.createImmutable("Nombre Contacto"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(_titlestyle));
 BA.debugLineNum = 2273;BA.debugLine="sheet1.PutString(xl.AddressName(\"G1\"), \"Email\").S";
Debug.ShouldStop(1);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("G1")))),(Object)(RemoteObject.createImmutable("Email"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyles" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_titlestyle),(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_borderright" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("THIN"))))})))));
 BA.debugLineNum = 2274;BA.debugLine="sheet1.PutString(xl.AddressName(\"H1\"), \"Descripci";
Debug.ShouldStop(2);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("H1")))),(Object)(RemoteObject.createImmutable("Descripcion Error"))).runClassMethod (b4j.docU.xlsheetwriter.class, "_setstyles" /*RemoteObject*/ ,(Object)(_sheet1.getField(false,"_lastaccessed" /*RemoteObject*/ )),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_titlestyle),(_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_createstyle" /*RemoteObject*/ ).runClassMethod (b4j.docU.xlstyle.class, "_borderright" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("THIN"))))})))));
 BA.debugLineNum = 2276;BA.debugLine="Dim i As Int=2";
Debug.ShouldStop(8);
_i = BA.numberCast(int.class, 2);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 2277;BA.debugLine="For Each E As ErrorProcesoInformeCliente In lstEr";
Debug.ShouldStop(16);
if (true) break;

case 1:
//for
this.state = 4;
group16 = __ref.getField(false,"_lsterrores" /*RemoteObject*/ );
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("E", _e);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 4;
if (index16 < groupLen16) {
this.state = 3;
_e = (group16.runMethod(false,"Get",index16));Debug.locals.put("E", _e);}
if (true) break;

case 13:
//C
this.state = 12;
index16++;
Debug.locals.put("E", _e);
if (true) break;

case 3:
//C
this.state = 13;
 BA.debugLineNum = 2278;BA.debugLine="sheet1.PutString(xl.AddressOne(\"A\", i), E.Proces";
Debug.ShouldStop(32);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("A")),(Object)(_i))),(Object)(_e.getField(true,"ProcesoError" /*RemoteObject*/ )));
 BA.debugLineNum = 2279;BA.debugLine="sheet1.PutString(xl.AddressOne(\"B\", i), E.Client";
Debug.ShouldStop(64);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("B")),(Object)(_i))),(Object)(_e.getField(true,"Cliente" /*RemoteObject*/ )));
 BA.debugLineNum = 2280;BA.debugLine="sheet1.PutString(xl.AddressOne(\"C\", i), E.Nombre";
Debug.ShouldStop(128);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("C")),(Object)(_i))),(Object)(_e.getField(true,"NombreCliente" /*RemoteObject*/ )));
 BA.debugLineNum = 2281;BA.debugLine="sheet1.PutString(xl.AddressOne(\"D\", i), E.Nombre";
Debug.ShouldStop(256);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("D")),(Object)(_i))),(Object)(_e.getField(true,"NombreResponsableCuenta" /*RemoteObject*/ )));
 BA.debugLineNum = 2282;BA.debugLine="sheet1.PutString(xl.AddressOne(\"E\", i), E.Codigo";
Debug.ShouldStop(512);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("E")),(Object)(_i))),(Object)(_e.getField(true,"CodigoContacto" /*RemoteObject*/ )));
 BA.debugLineNum = 2283;BA.debugLine="sheet1.PutString(xl.AddressOne(\"F\", i), E.Nombre";
Debug.ShouldStop(1024);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("F")),(Object)(_i))),(Object)(_e.getField(true,"NombreContacto" /*RemoteObject*/ )));
 BA.debugLineNum = 2284;BA.debugLine="sheet1.PutString(xl.AddressOne(\"G\", i), E.Direcc";
Debug.ShouldStop(2048);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("G")),(Object)(_i))),(Object)(_e.getField(true,"DireccionEmail" /*RemoteObject*/ )));
 BA.debugLineNum = 2285;BA.debugLine="sheet1.PutString(xl.AddressOne(\"H\", i), E.Descri";
Debug.ShouldStop(4096);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_putstring" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("H")),(Object)(_i))),(Object)(_e.getField(true,"DescripcionError" /*RemoteObject*/ )));
 BA.debugLineNum = 2286;BA.debugLine="i=i+1";
Debug.ShouldStop(8192);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
Debug.locals.put("E", _e);
;
 BA.debugLineNum = 2290;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressN";
Debug.ShouldStop(131072);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_setautofilter" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_createxlrange" /*RemoteObject*/ ,(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("A1")))),(Object)(_xl.runClassMethod (b4j.docU.xlutils.class, "_addressone" /*RemoteObject*/ ,(Object)(BA.ObjectToString("E")),(Object)(_i))))));
 BA.debugLineNum = 2294;BA.debugLine="Workbook.EvaluateFormulas";
Debug.ShouldStop(2097152);
_workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_evaluateformulas" /*RemoteObject*/ );
 BA.debugLineNum = 2295;BA.debugLine="For col0 = xl.AddressName(\"A\").Col0Based To xl.Ad";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//for
this.state = 8;
step29 = 1;
limit29 = _xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("H"))).getField(true,"Col0Based" /*RemoteObject*/ ).<Integer>get().intValue();
_col0 = _xl.runClassMethod (b4j.docU.xlutils.class, "_addressname" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("A"))).getField(true,"Col0Based" /*RemoteObject*/ ).<Integer>get().intValue() ;
Debug.locals.put("col0", _col0);
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if ((step29 > 0 && _col0 <= limit29) || (step29 < 0 && _col0 >= limit29)) this.state = 7;
if (true) break;

case 15:
//C
this.state = 14;
_col0 = ((int)(0 + _col0 + step29)) ;
Debug.locals.put("col0", _col0);
if (true) break;

case 7:
//C
this.state = 15;
 BA.debugLineNum = 2296;BA.debugLine="sheet1.AutoSizeColumn(col0)";
Debug.ShouldStop(8388608);
_sheet1.runClassMethod (b4j.docU.xlsheetwriter.class, "_autosizecolumn" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _col0)));
 if (true) break;
if (true) break;
Debug.locals.put("col0", _col0);
;
 BA.debugLineNum = 2300;BA.debugLine="For col0  = 0 To 7";
Debug.ShouldStop(134217728);

case 8:
//for
this.state = 11;
step32 = 1;
limit32 = 7;
_col0 = 0 ;
Debug.locals.put("col0", _col0);
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if ((step32 > 0 && _col0 <= limit32) || (step32 < 0 && _col0 >= limit32)) this.state = 10;
if (true) break;

case 17:
//C
this.state = 16;
_col0 = ((int)(0 + _col0 + step32)) ;
Debug.locals.put("col0", _col0);
if (true) break;

case 10:
//C
this.state = 17;
 BA.debugLineNum = 2301;BA.debugLine="sheet1.PoiSheet.SetColumnWidth(col0, sheet1.PoiS";
Debug.ShouldStop(268435456);
_sheet1.getField(false,"_poisheet" /*RemoteObject*/ ).runVoidMethod ("SetColumnWidth",(Object)(BA.numberCast(int.class, _col0)),(Object)(RemoteObject.solve(new RemoteObject[] {_sheet1.getField(false,"_poisheet" /*RemoteObject*/ ).runMethod(true,"GetColumnWidth",(Object)(BA.numberCast(int.class, _col0))),RemoteObject.createImmutable(1200)}, "+",1, 1)));
 if (true) break;
if (true) break;

case 11:
//C
this.state = -1;
Debug.locals.put("col0", _col0);
;
 BA.debugLineNum = 2305;BA.debugLine="Dim f As String = Workbook.SaveAs(File.GetFilePar";
Debug.ShouldStop(1);
_f = _workbook.runClassMethod (b4j.docU.xlworkbookwriter.class, "_saveas" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"GetFileParent",(Object)(_rutafichero))),(Object)(parent.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_rutafichero))),(Object)(parent.__c.getField(true,"True")));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 2306;BA.debugLine="Wait For (xl.OpenExcel(f)) Complete (Success As B";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "createworkbook"), _xl.runClassMethod (b4j.docU.xlutils.class, "_openexcel" /*RemoteObject*/ ,(Object)(_f)));
this.state = 18;
return;
case 18:
//C
this.state = -1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2308;BA.debugLine="Return Success";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_success));return;};
 BA.debugLineNum = 2310;BA.debugLine="End Sub";
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
public static RemoteObject  _detectos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DetectOS (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2248);
if (RapidSub.canDelegate("detectos")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","detectos", __ref);}
RemoteObject _os = RemoteObject.createImmutable("");
 BA.debugLineNum = 2248;BA.debugLine="Sub DetectOS As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 2249;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
Debug.ShouldStop(256);
_os = cinformesexpedicionesclientes.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("os.name")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"toLowerCase");Debug.locals.put("os", _os);Debug.locals.put("os", _os);
 BA.debugLineNum = 2250;BA.debugLine="If os.Contains(\"win\") Then";
Debug.ShouldStop(512);
if (_os.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("win"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2251;BA.debugLine="Return \"windows\"";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToString("windows");
 }else 
{ BA.debugLineNum = 2252;BA.debugLine="Else If os.Contains(\"mac\") Then";
Debug.ShouldStop(2048);
if (_os.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("mac"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 2253;BA.debugLine="Return \"mac\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("mac");
 }else {
 BA.debugLineNum = 2255;BA.debugLine="Return \"linux\"";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString("linux");
 }}
;
 BA.debugLineNum = 2257;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enviaremailcontacto(RemoteObject __ref,RemoteObject _cuentaprotec,RemoteObject _codigocontacto,RemoteObject _nombrecontacto,RemoteObject _destinatario,RemoteObject _subject,RemoteObject _body,RemoteObject _dirfileatt,RemoteObject _fileatt) throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailContacto (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2046);
if (RapidSub.canDelegate("enviaremailcontacto")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","enviaremailcontacto", __ref, _cuentaprotec, _codigocontacto, _nombrecontacto, _destinatario, _subject, _body, _dirfileatt, _fileatt);}
ResumableSub_EnviarEmailContacto rsub = new ResumableSub_EnviarEmailContacto(null,__ref,_cuentaprotec,_codigocontacto,_nombrecontacto,_destinatario,_subject,_body,_dirfileatt,_fileatt);
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
public static class ResumableSub_EnviarEmailContacto extends BA.ResumableSub {
public ResumableSub_EnviarEmailContacto(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _cuentaprotec,RemoteObject _codigocontacto,RemoteObject _nombrecontacto,RemoteObject _destinatario,RemoteObject _subject,RemoteObject _body,RemoteObject _dirfileatt,RemoteObject _fileatt) {
this.parent = parent;
this.__ref = __ref;
this._cuentaprotec = _cuentaprotec;
this._codigocontacto = _codigocontacto;
this._nombrecontacto = _nombrecontacto;
this._destinatario = _destinatario;
this._subject = _subject;
this._body = _body;
this._dirfileatt = _dirfileatt;
this._fileatt = _fileatt;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _cuentaprotec;
RemoteObject _codigocontacto;
RemoteObject _nombrecontacto;
RemoteObject _destinatario;
RemoteObject _subject;
RemoteObject _body;
RemoteObject _dirfileatt;
RemoteObject _fileatt;
RemoteObject _envioemailok = RemoteObject.createImmutable(false);
RemoteObject _smtp = RemoteObject.declareNull("anywheresoftware.b4a.net.SMTPWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _e = RemoteObject.declareNull("b4j.docU.main._errorprocesoinformecliente");
RemoteObject _cliente = RemoteObject.createImmutable("");
RemoteObject _nombrecliente = RemoteObject.createImmutable("");
RemoteObject _nombreresponsablecuenta = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnviarEmailContacto (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2046);
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
Debug.locals.put("CuentaProtec", _cuentaprotec);
Debug.locals.put("CodigoContacto", _codigocontacto);
Debug.locals.put("NombreContacto", _nombrecontacto);
Debug.locals.put("Destinatario", _destinatario);
Debug.locals.put("Subject", _subject);
Debug.locals.put("Body", _body);
Debug.locals.put("DirFileAtt", _dirfileatt);
Debug.locals.put("FileAtt", _fileatt);
 BA.debugLineNum = 2047;BA.debugLine="Dim EnvioEmailOK As Boolean";
Debug.ShouldStop(1073741824);
_envioemailok = RemoteObject.createImmutable(false);Debug.locals.put("EnvioEmailOK", _envioemailok);
 BA.debugLineNum = 2049;BA.debugLine="Dim SMTP As SMTP";
Debug.ShouldStop(1);
_smtp = RemoteObject.createNew ("anywheresoftware.b4a.net.SMTPWrapper");Debug.locals.put("SMTP", _smtp);
 BA.debugLineNum = 2050;BA.debugLine="If CuentaProtec Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 6;
if (_cuentaprotec.<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 2051;BA.debugLine="SMTP.Initialize(\"smtp.office365.com\", 587, EmPro";
Debug.ShouldStop(4);
_smtp.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("smtp.office365.com")),(Object)(BA.numberCast(int.class, 587)),(Object)(__ref.getField(true,"_emprotec" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_passprotec" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("SMTP")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 2053;BA.debugLine="SMTP.Initialize(\"smtp.office365.com\", 587, EmPro";
Debug.ShouldStop(16);
_smtp.runVoidMethod ("Initialize",(Object)(BA.ObjectToString("smtp.office365.com")),(Object)(BA.numberCast(int.class, 587)),(Object)(__ref.getField(true,"_emproin" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_passwproin" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("SMTP")));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 2056;BA.debugLine="SMTP.StartTLSMode = True";
Debug.ShouldStop(128);
_smtp.runMethod(true,"setStartTLSMode",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2057;BA.debugLine="SMTP.UseSSL = True";
Debug.ShouldStop(256);
_smtp.runMethod(true,"setUseSSL",parent.__c.getField(true,"True"));
 BA.debugLineNum = 2058;BA.debugLine="SMTP.AuthMethod = SMTP.AUTH_LOGIN";
Debug.ShouldStop(512);
_smtp.runMethod(false,"setAuthMethod",_smtp.getField(false,"AUTH_LOGIN"));
 BA.debugLineNum = 2061;BA.debugLine="Log(\"Destinatario: \" & Destinatario)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","891422735",RemoteObject.concat(RemoteObject.createImmutable("Destinatario: "),_destinatario),0);
 BA.debugLineNum = 2063;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtemailalternativo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 2064;BA.debugLine="Destinatario=txtEmailAlternativo.Text.Trim";
Debug.ShouldStop(32768);
_destinatario = __ref.getField(false,"_txtemailalternativo" /*RemoteObject*/ ).runMethod(true,"getText").runMethod(true,"trim");Debug.locals.put("Destinatario", _destinatario);
 BA.debugLineNum = 2066;BA.debugLine="Log(\"Destinatario alternativo: \" & Destinatario)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","891422740",RemoteObject.concat(RemoteObject.createImmutable("Destinatario alternativo: "),_destinatario),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 2069;BA.debugLine="SMTP.To.Add(Destinatario)";
Debug.ShouldStop(1048576);
_smtp.runMethod(false,"getTo").runVoidMethod ("Add",(Object)((_destinatario)));
 BA.debugLineNum = 2071;BA.debugLine="SMTP.Subject = Subject";
Debug.ShouldStop(4194304);
_smtp.runMethod(true,"setSubject",_subject);
 BA.debugLineNum = 2072;BA.debugLine="SMTP.Body = Body";
Debug.ShouldStop(8388608);
_smtp.runMethod(true,"setBody",_body);
 BA.debugLineNum = 2073;BA.debugLine="If FileAtt<>\"\" And DirFileAtt<>\"\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("!",_fileatt,BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_dirfileatt,BA.ObjectToString(""))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 2074;BA.debugLine="SMTP.AddAttachment(DirFileAtt, FileAtt)";
Debug.ShouldStop(33554432);
_smtp.runVoidMethod ("AddAttachment",(Object)(_dirfileatt),(Object)(_fileatt));
 if (true) break;
;
 BA.debugLineNum = 2076;BA.debugLine="Try";
Debug.ShouldStop(134217728);

case 14:
//try
this.state = 25;
this.catchState = 24;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 24;
 BA.debugLineNum = 2077;BA.debugLine="SMTP.Send";
Debug.ShouldStop(268435456);
_smtp.runVoidMethod ("Send",__ref.getField(false, "ba"));
 BA.debugLineNum = 2078;BA.debugLine="Wait For SMTP_MessageSent(Success As Boolean)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","smtp_messagesent", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "enviaremailcontacto"), null);
this.state = 26;
return;
case 26:
//C
this.state = 17;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 2080;BA.debugLine="If Success Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 17:
//if
this.state = 22;
if (_success.<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 2081;BA.debugLine="EnvioEmailOK=True";
Debug.ShouldStop(1);
_envioemailok = parent.__c.getField(true,"True");Debug.locals.put("EnvioEmailOK", _envioemailok);
 BA.debugLineNum = 2084;BA.debugLine="Log(\"Email enviado con éxito a \"  & Destinatari";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","891422758",RemoteObject.concat(RemoteObject.createImmutable("Email enviado con éxito a "),_destinatario),0);
 BA.debugLineNum = 2085;BA.debugLine="lblProgress.Text=\"Email enviado a \"  & Destinat";
Debug.ShouldStop(16);
__ref.getField(false,"_lblprogress" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Email enviado a "),_destinatario));
 BA.debugLineNum = 2086;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDestinatarios set";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblDestinatarios set EnviadoEmail=? where Codigo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(parent.__c.getField(true,"True")),(_codigocontacto)})))));
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 2088;BA.debugLine="EnvioEmailOK=False";
Debug.ShouldStop(128);
_envioemailok = parent.__c.getField(true,"False");Debug.locals.put("EnvioEmailOK", _envioemailok);
 BA.debugLineNum = 2092;BA.debugLine="Dim E As ErrorProcesoInformeCliente";
Debug.ShouldStop(2048);
_e = RemoteObject.createNew ("b4j.docU.main._errorprocesoinformecliente");Debug.locals.put("E", _e);
 BA.debugLineNum = 2093;BA.debugLine="E.Initialize";
Debug.ShouldStop(4096);
_e.runVoidMethod ("Initialize");
 BA.debugLineNum = 2094;BA.debugLine="E.CodigoContacto=CodigoContacto";
Debug.ShouldStop(8192);
_e.setField ("CodigoContacto" /*RemoteObject*/ ,_codigocontacto);
 BA.debugLineNum = 2095;BA.debugLine="E.NombreContacto=NombreContacto";
Debug.ShouldStop(16384);
_e.setField ("NombreContacto" /*RemoteObject*/ ,_nombrecontacto);
 BA.debugLineNum = 2096;BA.debugLine="E.DireccionEmail=Destinatario";
Debug.ShouldStop(32768);
_e.setField ("DireccionEmail" /*RemoteObject*/ ,_destinatario);
 BA.debugLineNum = 2097;BA.debugLine="E.ProcesoError=\"Envio email\"";
Debug.ShouldStop(65536);
_e.setField ("ProcesoError" /*RemoteObject*/ ,BA.ObjectToString("Envio email"));
 BA.debugLineNum = 2098;BA.debugLine="E.DescripcionError=LastException.Message";
Debug.ShouldStop(131072);
_e.setField ("DescripcionError" /*RemoteObject*/ ,parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"));
 BA.debugLineNum = 2099;BA.debugLine="Dim Cliente As String=Utilidades.FixNull(mSQL.E";
Debug.ShouldStop(262144);
_cliente = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select Cliente from tblDestinatarios where Codigo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_codigocontacto}))))))));Debug.locals.put("Cliente", _cliente);Debug.locals.put("Cliente", _cliente);
 BA.debugLineNum = 2100;BA.debugLine="Dim NombreCliente As String=Utilidades.FixNull(";
Debug.ShouldStop(524288);
_nombrecliente = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NombreCliente from tblDestinatarios where Codigo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_codigocontacto}))))))));Debug.locals.put("NombreCliente", _nombrecliente);Debug.locals.put("NombreCliente", _nombrecliente);
 BA.debugLineNum = 2101;BA.debugLine="Dim NombreResponsableCuenta As String=Utilidade";
Debug.ShouldStop(1048576);
_nombreresponsablecuenta = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select NombreResponsableCuenta from tblDestinatarios where Codigo=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_codigocontacto}))))))));Debug.locals.put("NombreResponsableCuenta", _nombreresponsablecuenta);Debug.locals.put("NombreResponsableCuenta", _nombreresponsablecuenta);
 BA.debugLineNum = 2102;BA.debugLine="E.Cliente=Cliente";
Debug.ShouldStop(2097152);
_e.setField ("Cliente" /*RemoteObject*/ ,_cliente);
 BA.debugLineNum = 2103;BA.debugLine="E.NombreCliente=NombreCliente";
Debug.ShouldStop(4194304);
_e.setField ("NombreCliente" /*RemoteObject*/ ,_nombrecliente);
 BA.debugLineNum = 2104;BA.debugLine="E.NombreResponsableCuenta=NombreResponsableCuen";
Debug.ShouldStop(8388608);
_e.setField ("NombreResponsableCuenta" /*RemoteObject*/ ,_nombreresponsablecuenta);
 BA.debugLineNum = 2106;BA.debugLine="lstErrores.Add(E)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lsterrores" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_e)));
 BA.debugLineNum = 2107;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","891422781",parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 BA.debugLineNum = 2108;BA.debugLine="lblProgress.Text=\"Error al intentar enviar emai";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lblprogress" /*RemoteObject*/ ).runMethod(true,"setText",RemoteObject.concat(RemoteObject.createImmutable("Error al intentar enviar email a "),_destinatario,RemoteObject.createImmutable(".")));
 if (true) break;

case 22:
//C
this.state = 25;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
 BA.debugLineNum = 2114;BA.debugLine="EnvioEmailOK=False";
Debug.ShouldStop(2);
_envioemailok = parent.__c.getField(true,"False");Debug.locals.put("EnvioEmailOK", _envioemailok);
 BA.debugLineNum = 2115;BA.debugLine="Log(LastException.Message)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","891422789",parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage"),0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 2118;BA.debugLine="Return EnvioEmailOK";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_envioemailok));return;};
 BA.debugLineNum = 2119;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _smtp_messagesent(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static RemoteObject  _exportardatosinformeaexcel(RemoteObject __ref,RemoteObject _cuentaprotec,RemoteObject _codigocontacto,RemoteObject _nombrecontacto,RemoteObject _emailcontacto,RemoteObject _lstpedidospendientesdestinatario) throws Exception{
try {
		Debug.PushSubsStack("ExportarDatosInformeAExcel (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1690);
if (RapidSub.canDelegate("exportardatosinformeaexcel")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","exportardatosinformeaexcel", __ref, _cuentaprotec, _codigocontacto, _nombrecontacto, _emailcontacto, _lstpedidospendientesdestinatario);}
ResumableSub_ExportarDatosInformeAExcel rsub = new ResumableSub_ExportarDatosInformeAExcel(null,__ref,_cuentaprotec,_codigocontacto,_nombrecontacto,_emailcontacto,_lstpedidospendientesdestinatario);
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
public static class ResumableSub_ExportarDatosInformeAExcel extends BA.ResumableSub {
public ResumableSub_ExportarDatosInformeAExcel(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _cuentaprotec,RemoteObject _codigocontacto,RemoteObject _nombrecontacto,RemoteObject _emailcontacto,RemoteObject _lstpedidospendientesdestinatario) {
this.parent = parent;
this.__ref = __ref;
this._cuentaprotec = _cuentaprotec;
this._codigocontacto = _codigocontacto;
this._nombrecontacto = _nombrecontacto;
this._emailcontacto = _emailcontacto;
this._lstpedidospendientesdestinatario = _lstpedidospendientesdestinatario;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _cuentaprotec;
RemoteObject _codigocontacto;
RemoteObject _nombrecontacto;
RemoteObject _emailcontacto;
RemoteObject _lstpedidospendientesdestinatario;
RemoteObject _nombreinforme = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _fechahorageneracioninforme = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ExportarDatosInformeAExcel (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1690);
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
Debug.locals.put("CuentaProtec", _cuentaprotec);
Debug.locals.put("CodigoContacto", _codigocontacto);
Debug.locals.put("NombreContacto", _nombrecontacto);
Debug.locals.put("EmailContacto", _emailcontacto);
Debug.locals.put("lstPedidosPendientesDestinatario", _lstpedidospendientesdestinatario);
 BA.debugLineNum = 1691;BA.debugLine="If txtEmailAlternativo.Text<>\"\" Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_txtemailalternativo" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 1692;BA.debugLine="Dim NombreInforme As String=\"Informe Expedicione";
Debug.ShouldStop(134217728);
_nombreinforme = RemoteObject.concat(RemoteObject.createImmutable("Informe Expediciones - Pedidos Pendientes "),__ref.getField(true,"_periodoinforme" /*RemoteObject*/ ),RemoteObject.createImmutable("  "),_nombrecontacto);Debug.locals.put("NombreInforme", _nombreinforme);Debug.locals.put("NombreInforme", _nombreinforme);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1694;BA.debugLine="Dim NombreInforme As String=\"Informe Expedicione";
Debug.ShouldStop(536870912);
_nombreinforme = RemoteObject.concat(RemoteObject.createImmutable("Informe Expediciones - Pedidos Pendientes "),__ref.getField(true,"_periodoinforme" /*RemoteObject*/ ));Debug.locals.put("NombreInforme", _nombreinforme);Debug.locals.put("NombreInforme", _nombreinforme);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 1697;BA.debugLine="Dim result As Boolean=CrearInformeExcel(NombreInf";
Debug.ShouldStop(1);
_result = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_crearinformeexcel" /*RemoteObject*/ ,(Object)(_nombreinforme),(Object)(_codigocontacto),(Object)(_nombrecontacto),(Object)(__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ )),(Object)(_lstpedidospendientesdestinatario));Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 1698;BA.debugLine="If result Then";
Debug.ShouldStop(2);
if (true) break;

case 7:
//if
this.state = 16;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1699;BA.debugLine="Dim FechaHoraGeneracionInforme As String";
Debug.ShouldStop(4);
_fechahorageneracioninforme = RemoteObject.createImmutable("");Debug.locals.put("FechaHoraGeneracionInforme", _fechahorageneracioninforme);
 BA.debugLineNum = 1700;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
Debug.ShouldStop(8);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy HH:mm:ss"));
 BA.debugLineNum = 1701;BA.debugLine="FechaHoraGeneracionInforme=DateTime.Date(DateTim";
Debug.ShouldStop(16);
_fechahorageneracioninforme = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("FechaHoraGeneracionInforme", _fechahorageneracioninforme);
 BA.debugLineNum = 1702;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(32);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1703;BA.debugLine="sb.Initialize";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1704;BA.debugLine="Select True";
Debug.ShouldStop(128);
if (true) break;

case 10:
//select
this.state = 15;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Clientes"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_tipodestinatarioinforme" /*RemoteObject*/ ),BA.ObjectToString("Comerciales"))))) {
case 0: {
this.state = 12;
if (true) break;
}
case 1: {
this.state = 14;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 1707;BA.debugLine="sb.Append(\"Estimado cliente,\")";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Estimado cliente,")));
 BA.debugLineNum = 1708;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(2048);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1709;BA.debugLine="sb.Append(\"En la tabla adjunta se incluye la s";
Debug.ShouldStop(4096);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("En la tabla adjunta se incluye la siguiente información:")));
 BA.debugLineNum = 1710;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(8192);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1711;BA.debugLine="sb.Append(\"1) Datos relativos a las expedicion";
Debug.ShouldStop(16384);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("1) Datos relativos a las expediciones del periodo indicado en el asunto del mensaje.")));
 BA.debugLineNum = 1712;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(32768);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1713;BA.debugLine="sb.Append(\"2) Datos relativos a los pedidos pe";
Debug.ShouldStop(65536);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("2) Datos relativos a los pedidos pendientes. Estos se se refieren al momento de generación de este informe ("),_fechahorageneracioninforme,RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 1714;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(131072);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1715;BA.debugLine="sb.Append(\"Saludos\")";
Debug.ShouldStop(262144);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("Saludos")));
 BA.debugLineNum = 1716;BA.debugLine="sb.Append(CRLF).Append(CRLF).Append(CRLF)";
Debug.ShouldStop(524288);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1717;BA.debugLine="sb.Append(\"Este correo ha sido enviado desde u";
Debug.ShouldStop(1048576);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Este correo ha sido enviado desde una dirección de e-mail que no acepta correos entrantes. Por favor, no responda a este e-mail."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1718;BA.debugLine="sb.Append(\"En caso de duda, por favor contacte";
Debug.ShouldStop(2097152);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("En caso de duda, por favor contacte con su responsable de cuenta, indicado en la excel.")));
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1720;BA.debugLine="sb.Append(\"En la tabla adjunta se incluye la s";
Debug.ShouldStop(8388608);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("En la tabla adjunta se incluye la siguiente información:")));
 BA.debugLineNum = 1721;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(16777216);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1722;BA.debugLine="sb.Append(\"1) Datos relativos a las expedicion";
Debug.ShouldStop(33554432);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("1) Datos relativos a las expediciones del periodo indicado en el asunto del mensaje.")));
 BA.debugLineNum = 1723;BA.debugLine="sb.Append(CRLF).Append(CRLF)";
Debug.ShouldStop(67108864);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1724;BA.debugLine="sb.Append(\"2) Datos relativos a los pedidos pe";
Debug.ShouldStop(134217728);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.concat(RemoteObject.createImmutable("2) Datos relativos a los pedidos pendientes. Estos se se refieren al momento de generación de este informe ("),_fechahorageneracioninforme,RemoteObject.createImmutable(")"))));
 BA.debugLineNum = 1725;BA.debugLine="sb.Append(CRLF).Append(CRLF).Append(CRLF)";
Debug.ShouldStop(268435456);
_sb.runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runMethod(false,"Append",(Object)(parent.__c.getField(true,"CRLF"))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1726;BA.debugLine="sb.Append(\"Este correo ha sido enviado desde u";
Debug.ShouldStop(536870912);
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable("Este correo ha sido enviado desde una dirección de e-mail que no acepta correos entrantes. Por favor, no responda a este e-mail."))).runVoidMethod ("Append",(Object)(parent.__c.getField(true,"CRLF")));
 BA.debugLineNum = 1727;BA.debugLine="sb.Append(\"En caso de duda, por favor contacte";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("En caso de duda, por favor contacte con su responsable de cuenta, indicado en la excel.")));
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 1729;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
Debug.ShouldStop(1);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yy"));
 BA.debugLineNum = 1730;BA.debugLine="wait for (EnviarEmailContacto(CuentaProtec, Codi";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "exportardatosinformeaexcel"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_enviaremailcontacto" /*RemoteObject*/ ,(Object)(_cuentaprotec),(Object)(_codigocontacto),(Object)(_nombrecontacto),(Object)(_emailcontacto.runMethod(true,"trim")),(Object)(_nombreinforme),(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.getField(false,"File").runMethod(true,"DirData",(Object)(RemoteObject.createImmutable("Expediciones")))),(Object)(RemoteObject.concat(_nombreinforme,RemoteObject.createImmutable(".xlsx")))));
this.state = 17;
return;
case 17:
//C
this.state = 16;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 1734;BA.debugLine="Return result";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 1735;BA.debugLine="End Sub";
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
public static RemoteObject  _finduserdocumentsfolder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FindUserDocumentsFolder (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2238);
if (RapidSub.canDelegate("finduserdocumentsfolder")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","finduserdocumentsfolder", __ref);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _fs = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 2238;BA.debugLine="Sub FindUserDocumentsFolder As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 2239;BA.debugLine="If DetectOS = \"windows\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_detectos" /*RemoteObject*/ ),BA.ObjectToString("windows"))) { 
 BA.debugLineNum = 2240;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(-2147483648);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 2241;BA.debugLine="Dim fs As JavaObject = jo.InitializeStatic(\"java";
Debug.ShouldStop(1);
_fs = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_fs = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _jo.runMethod(false,"InitializeStatic",(Object)(RemoteObject.createImmutable("javax.swing.filechooser.FileSystemView"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFileSystemView")),(Object)((cinformesexpedicionesclientes.__c.getField(false,"Null")))));Debug.locals.put("fs", _fs);Debug.locals.put("fs", _fs);
 BA.debugLineNum = 2242;BA.debugLine="Return fs.RunMethodJO(\"getDefaultDirectory\", Nul";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString(_fs.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getDefaultDirectory")),(Object)((cinformesexpedicionesclientes.__c.getField(false,"Null")))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getPath")),(Object)((cinformesexpedicionesclientes.__c.getField(false,"Null")))));
 }else {
 BA.debugLineNum = 2244;BA.debugLine="Return GetSystemProperty(\"user.home\", \"\") & \"/Do";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(cinformesexpedicionesclientes.__c.runMethod(true,"GetSystemProperty",(Object)(BA.ObjectToString("user.home")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("/Documents"));
 };
 BA.debugLineNum = 2246;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("frm_CloseRequest (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 322;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(2);
 BA.debugLineNum = 323;BA.debugLine="EventData.Consume";
Debug.ShouldStop(4);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _informeclientes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InformeClientes (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,686);
if (RapidSub.canDelegate("informeclientes")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","informeclientes", __ref); return;}
ResumableSub_InformeClientes rsub = new ResumableSub_InformeClientes(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InformeClientes extends BA.ResumableSub {
public ResumableSub_InformeClientes(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _cont = RemoteObject.createImmutable(0);
RemoteObject _doc = RemoteObject.createImmutable("");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InformeClientes (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,686);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 687;BA.debugLine="lstInfoDocumentos.Initialize";
Debug.ShouldStop(16384);
__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 689;BA.debugLine="Dim Cont As Int=1";
Debug.ShouldStop(65536);
_cont = BA.numberCast(int.class, 1);Debug.locals.put("Cont", _cont);Debug.locals.put("Cont", _cont);
 BA.debugLineNum = 695;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 697;BA.debugLine="For Each Doc As String In lstDocumentosExpedidosU";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//for
this.state = 8;
group4 = __ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ );
index4 = 0;
groupLen4 = group4.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("Doc", _doc);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 8;
if (index4 < groupLen4) {
this.state = 3;
_doc = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("Doc", _doc);}
if (true) break;

case 16:
//C
this.state = 15;
index4++;
Debug.locals.put("Doc", _doc);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 705;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Analizando";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Analizando Documento "),_cont,RemoteObject.createImmutable(" de "),__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 709;BA.debugLine="Log(\"Documento único \" & Cont & \" \" & Doc)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","890243095",RemoteObject.concat(RemoteObject.createImmutable("Documento único "),_cont,RemoteObject.createImmutable(" "),_doc),0);
 BA.debugLineNum = 713;BA.debugLine="Doc=Doc.ToUpperCase";
Debug.ShouldStop(256);
_doc = _doc.runMethod(true,"toUpperCase");Debug.locals.put("Doc", _doc);
 BA.debugLineNum = 714;BA.debugLine="If Doc.StartsWith(\"ALBV\") Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 7;
if (_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 715;BA.debugLine="Log(\"DatosNAVDocumentoInformeClientes \" & Doc)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","890243101",RemoteObject.concat(RemoteObject.createImmutable("DatosNAVDocumentoInformeClientes "),_doc),0);
 BA.debugLineNum = 720;BA.debugLine="Dim rSub As ResumableSub=CargaDatosNAVDocumento";
Debug.ShouldStop(32768);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargadatosnavdocumentoinformeclientes" /*RemoteObject*/ ,(Object)(_doc));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 721;BA.debugLine="Wait For (rSub) complete (rObj As Object)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "informeclientes"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 7:
//C
this.state = 16;
;
 BA.debugLineNum = 724;BA.debugLine="Cont=Cont+1";
Debug.ShouldStop(524288);
_cont = RemoteObject.solve(new RemoteObject[] {_cont,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("Cont", _cont);
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
Debug.locals.put("Doc", _doc);
;
 BA.debugLineNum = 728;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 730;BA.debugLine="If lstInfoDocumentos.Size>0 Then";
Debug.ShouldStop(33554432);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 731;BA.debugLine="wait for (AnalisisDestinatarios) complete (rObj";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "informeclientes"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_analisisdestinatarios" /*RemoteObject*/ ));
this.state = 18;
return;
case 18:
//C
this.state = 14;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 733;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay docume";
Debug.ShouldStop(268435456);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay documentos para generar informe de expediciones-pedidos pendientes")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 734;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "informeclientes"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 14;
;
 BA.debugLineNum = 735;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 737;BA.debugLine="End Sub";
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
public static void  _informecomerciales(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InformeComerciales (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,793);
if (RapidSub.canDelegate("informecomerciales")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","informecomerciales", __ref); return;}
ResumableSub_InformeComerciales rsub = new ResumableSub_InformeComerciales(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_InformeComerciales extends BA.ResumableSub {
public ResumableSub_InformeComerciales(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
int _i = 0;
RemoteObject _doc = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _msa = RemoteObject.declareNull("Object");
int step3;
int limit3;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("InformeComerciales (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,793);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 794;BA.debugLine="lstInfoDocumentos.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 798;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 799;BA.debugLine="For i=0 To lstDocumentosExpedidosUnicos.Size-1";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//for
this.state = 11;
step3 = 1;
limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 3;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step3)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 802;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Analizando";
Debug.ShouldStop(2);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",(RemoteObject.concat(RemoteObject.createImmutable("Analizando Documento "),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(" de "),__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(true,"getSize"))));
 BA.debugLineNum = 806;BA.debugLine="Dim Doc As String=lstDocumentosExpedidosUnicos.G";
Debug.ShouldStop(32);
_doc = BA.ObjectToString(__ref.getField(false,"_lstdocumentosexpedidosunicos" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("Doc", _doc);Debug.locals.put("Doc", _doc);
 BA.debugLineNum = 809;BA.debugLine="If Doc.StartsWith(\"ALBV\") Then";
Debug.ShouldStop(256);
if (true) break;

case 4:
//if
this.state = 7;
if (_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ALBV"))).<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 815;BA.debugLine="Wait For(CargaDatosNAVDocumentoInformeComercial";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "informecomerciales"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargadatosnavdocumentoinformecomerciales" /*RemoteObject*/ ,(Object)(_doc.runMethod(true,"toUpperCase")),(Object)(RemoteObject.createImmutable("ALBV"))));
this.state = 20;
return;
case 20:
//C
this.state = 7;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 if (true) break;
;
 BA.debugLineNum = 819;BA.debugLine="If Doc.StartsWith(\"RT\") Then";
Debug.ShouldStop(262144);

case 7:
//if
this.state = 10;
if (_doc.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("RT"))).<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 824;BA.debugLine="Wait For(CargaDatosNAVDocumentoInformeComercial";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "informecomerciales"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargadatosnavdocumentoinformecomerciales" /*RemoteObject*/ ,(Object)(_doc.runMethod(true,"toUpperCase")),(Object)(RemoteObject.createImmutable("RT"))));
this.state = 21;
return;
case 21:
//C
this.state = 10;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 if (true) break;

case 10:
//C
this.state = 19;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 833;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(1);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 834;BA.debugLine="If lstInfoDocumentos.Size>0 Then";
Debug.ShouldStop(2);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_lstinfodocumentos" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 835;BA.debugLine="wait for (AnalisisDestinatarios) complete (rObj";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "informecomerciales"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_analisisdestinatarios" /*RemoteObject*/ ));
this.state = 22;
return;
case 22:
//C
this.state = 17;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 837;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay docume";
Debug.ShouldStop(16);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay documentos para generar informe de expediciones-pedidos pendientes")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 838;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "informecomerciales"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 17;
;
 BA.debugLineNum = 839;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = -1;
;
 BA.debugLineNum = 841;BA.debugLine="End Sub";
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
public static RemoteObject  _inicializarcalendario(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InicializarCalendario (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("inicializarcalendario")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","inicializarcalendario", __ref);}
 BA.debugLineNum = 387;BA.debugLine="Sub InicializarCalendario";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="DateTemplate.Initialize";
Debug.ShouldStop(8);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 389;BA.debugLine="DateTemplate.MinYear = 2018";
Debug.ShouldStop(16);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_minyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2018));
 BA.debugLineNum = 390;BA.debugLine="DateTemplate.MaxYear = 2050";
Debug.ShouldStop(32);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_maxyear" /*RemoteObject*/ ,BA.numberCast(int.class, 2050));
 BA.debugLineNum = 391;BA.debugLine="DateTemplate.FirstDay=1";
Debug.ShouldStop(64);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).setField ("_firstday" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 392;BA.debugLine="DateTemplate.Date=DateTime.Now";
Debug.ShouldStop(128);
__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_setdate" /*RemoteObject*/ ,cinformesexpedicionesclientes.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Initialize (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 82;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="mSQL.InitializeSQLite(\"\", \":memory:\", True)";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString(":memory:")),(Object)(cinformesexpedicionesclientes.__c.getField(true,"True")));
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
public static RemoteObject  _isemail(RemoteObject __ref,RemoteObject _emailaddress) throws Exception{
try {
		Debug.PushSubsStack("IsEmail (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2173);
if (RapidSub.canDelegate("isemail")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","isemail", __ref, _emailaddress);}
RemoteObject _matchemail = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
Debug.locals.put("EmailAddress", _emailaddress);
 BA.debugLineNum = 2173;BA.debugLine="Sub IsEmail(EmailAddress As String) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 2174;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
Debug.ShouldStop(536870912);
_matchemail = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matchemail = cinformesexpedicionesclientes.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$")),(Object)(_emailaddress));Debug.locals.put("MatchEmail", _matchemail);Debug.locals.put("MatchEmail", _matchemail);
 BA.debugLineNum = 2175;BA.debugLine="If MatchEmail.Find = True Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_matchemail.runMethod(true,"Find"),cinformesexpedicionesclientes.__c.getField(true,"True"))) { 
 BA.debugLineNum = 2176;BA.debugLine="Log(MatchEmail.Match)";
Debug.ShouldStop(-2147483648);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891553795",_matchemail.runMethod(true,"getMatch"),0);
 BA.debugLineNum = 2178;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) return cinformesexpedicionesclientes.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 2180;BA.debugLine="Log(\"Oops, please double check your email addres";
Debug.ShouldStop(8);
cinformesexpedicionesclientes.__c.runVoidMethod ("LogImpl","891553799",RemoteObject.createImmutable("Oops, please double check your email address"),0);
 BA.debugLineNum = 2181;BA.debugLine="Return False";
Debug.ShouldStop(16);
if (true) return cinformesexpedicionesclientes.__c.getField(true,"False");
 };
 BA.debugLineNum = 2183;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _lblinfoemailalternativo_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblInfoEmailAlternativo_MouseReleased (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2186);
if (RapidSub.canDelegate("lblinfoemailalternativo_mousereleased")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","lblinfoemailalternativo_mousereleased", __ref, _eventdata); return;}
ResumableSub_lblInfoEmailAlternativo_MouseReleased rsub = new ResumableSub_lblInfoEmailAlternativo_MouseReleased(null,__ref,_eventdata);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_lblInfoEmailAlternativo_MouseReleased extends BA.ResumableSub {
public ResumableSub_lblInfoEmailAlternativo_MouseReleased(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _eventdata;
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("lblInfoEmailAlternativo_MouseReleased (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,2186);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 2187;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El email alter";
Debug.ShouldStop(1024);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("El email alternativo se emplea para realizar pruebas. Los emails NO serán enviados a los emails de los destinatarios, sino al email alternativo indicado.")),(Object)(RemoteObject.createImmutable("Información")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 2188;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "lblinfoemailalternativo_mousereleased"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 2189;BA.debugLine="End Sub";
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
public static RemoteObject  _loadcred(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LoadCred (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("loadcred")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","loadcred", __ref);}
ResumableSub_LoadCred rsub = new ResumableSub_LoadCred(null,__ref);
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
public static class ResumableSub_LoadCred extends BA.ResumableSub {
public ResumableSub_LoadCred(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _emp = RemoteObject.createImmutable("");
RemoteObject group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LoadCred (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,326);
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
 BA.debugLineNum = 327;BA.debugLine="Dim Comando As String=\"ConfigNoReply\"";
Debug.ShouldStop(64);
_comando = BA.ObjectToString("ConfigNoReply");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 328;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(128);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 330;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "loadcred"), null);
this.state = 23;
return;
case 23:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 332;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ConnOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 22;
 BA.debugLineNum = 333;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(4096);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 334;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "loadcred"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 22;
;
 BA.debugLineNum = 335;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 337;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(65536);
if (true) break;

case 6:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ReqOK")))),(parent.__c.getField(true,"False")))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 21;
 BA.debugLineNum = 338;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay datos config. email."),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 339;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "loadcred"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 21;
;
 BA.debugLineNum = 340;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 342;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2097152);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 343;BA.debugLine="For Each mData As Map In lstReg";
Debug.ShouldStop(4194304);
if (true) break;

case 11:
//for
this.state = 20;
_mdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group15 = _lstreg;
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mData", _mdata);
this.state = 26;
if (true) break;

case 26:
//C
this.state = 20;
if (index15 < groupLen15) {
this.state = 13;
_mdata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group15.runMethod(false,"Get",index15));Debug.locals.put("mData", _mdata);}
if (true) break;

case 27:
//C
this.state = 26;
index15++;
Debug.locals.put("mData", _mdata);
if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 344;BA.debugLine="Dim Emp As String=mData.Get(\"Empresa\")";
Debug.ShouldStop(8388608);
_emp = BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Empresa")))));Debug.locals.put("Emp", _emp);Debug.locals.put("Emp", _emp);
 BA.debugLineNum = 345;BA.debugLine="Select Emp";
Debug.ShouldStop(16777216);
if (true) break;

case 14:
//select
this.state = 19;
switch (BA.switchObjectToInt(_emp,BA.ObjectToString("PROIN"),BA.ObjectToString("PROTEC"))) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 19;
 BA.debugLineNum = 347;BA.debugLine="EmProin=mData.Get(\"Cuenta\")";
Debug.ShouldStop(67108864);
__ref.setField ("_emproin" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cuenta"))))));
 BA.debugLineNum = 348;BA.debugLine="PasswProin=mData.Get(\"Passw\")";
Debug.ShouldStop(134217728);
__ref.setField ("_passwproin" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Passw"))))));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 350;BA.debugLine="EmProtec=mData.Get(\"Cuenta\")";
Debug.ShouldStop(536870912);
__ref.setField ("_emprotec" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Cuenta"))))));
 BA.debugLineNum = 351;BA.debugLine="PassProtec=mData.Get(\"Passw\")";
Debug.ShouldStop(1073741824);
__ref.setField ("_passprotec" /*RemoteObject*/ ,BA.ObjectToString(_mdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Passw"))))));
 if (true) break;

case 19:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
Debug.locals.put("mData", _mdata);
;
 BA.debugLineNum = 354;BA.debugLine="Return True";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
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
 BA.debugLineNum = 357;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,1072);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cinformesexpedicionesclientes","salirmodulo", __ref);}
 BA.debugLineNum = 1072;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1073;BA.debugLine="frm.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 1074;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(131072);
cinformesexpedicionesclientes._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 1075;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _seleccionfecha(RemoteObject __ref,RemoteObject _tipo) throws Exception{
try {
		Debug.PushSubsStack("SeleccionFecha (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,404);
if (RapidSub.canDelegate("seleccionfecha")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","seleccionfecha", __ref, _tipo); return;}
ResumableSub_SeleccionFecha rsub = new ResumableSub_SeleccionFecha(null,__ref,_tipo);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SeleccionFecha extends BA.ResumableSub {
public ResumableSub_SeleccionFecha(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref,RemoteObject _tipo) {
this.parent = parent;
this.__ref = __ref;
this._tipo = _tipo;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _tipo;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _setd = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SeleccionFecha (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,404);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Tipo", _tipo);
 BA.debugLineNum = 405;BA.debugLine="Dialog.Title = \"Fechas Informe\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Fechas Informe")));
 BA.debugLineNum = 406;BA.debugLine="InicializarCalendario";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_inicializarcalendario" /*RemoteObject*/ );
 BA.debugLineNum = 407;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"OK\",";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "seleccionfecha"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_datetemplate" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable(("OK"))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("Cancel")))));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 408;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 410;BA.debugLine="Select True";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//select
this.state = 33;
switch (BA.switchObjectToInt(parent.__c.getField(true,"True"),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("Inicial"))),BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_tipo,BA.ObjectToString("Final"))))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 20;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 412;BA.debugLine="If FechaFinal>0 And FechaUnica=False Then";
Debug.ShouldStop(134217728);
if (true) break;

case 7:
//if
this.state = 14;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_fechafinal" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_fechaunica" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 413;BA.debugLine="If DateTemplate.Date>FechaFinal Then";
Debug.ShouldStop(268435456);
if (true) break;

case 10:
//if
this.state = 13;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ ),__ref.getField(true,"_fechafinal" /*RemoteObject*/ ))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 414;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha inicial no puede ser posterior a la fecha final")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 415;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "seleccionfecha"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 13;
;
 BA.debugLineNum = 416;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 419;BA.debugLine="FechaInicial=DateTemplate.Date";
Debug.ShouldStop(4);
__ref.setField ("_fechainicial" /*RemoteObject*/ ,__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ ));
 BA.debugLineNum = 420;BA.debugLine="Log(\"fecha Inicial: \" & CRLF & FechaInicial)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","889915408",RemoteObject.concat(RemoteObject.createImmutable("fecha Inicial: "),parent.__c.getField(true,"CRLF"),__ref.getField(true,"_fechainicial" /*RemoteObject*/ )),0);
 BA.debugLineNum = 421;BA.debugLine="txtFechaInicial.Text=DateTime.Date(DateTemplat";
Debug.ShouldStop(16);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 422;BA.debugLine="If FechaUnica Then";
Debug.ShouldStop(32);
if (true) break;

case 15:
//if
this.state = 18;
if (__ref.getField(true,"_fechaunica" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 423;BA.debugLine="Dim SetD As Long= DateUtils.SetDateAndTime(Da";
Debug.ShouldStop(64);
_setd = parent._dateutils.runMethod(true,"_setdateandtime",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_fechainicial" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_fechainicial" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_fechainicial" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 23)),(Object)(BA.numberCast(int.class, 59)),(Object)(BA.numberCast(int.class, 59)));Debug.locals.put("SetD", _setd);Debug.locals.put("SetD", _setd);
 BA.debugLineNum = 424;BA.debugLine="FechaFinal=SetD";
Debug.ShouldStop(128);
__ref.setField ("_fechafinal" /*RemoteObject*/ ,_setd);
 BA.debugLineNum = 425;BA.debugLine="txtFechaFinal.Text=txtFechaInicial.text";
Debug.ShouldStop(256);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 426;BA.debugLine="Log(\"Fecha Final: \" & CRLF &  FechaFinal)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","889915414",RemoteObject.concat(RemoteObject.createImmutable("Fecha Final: "),parent.__c.getField(true,"CRLF"),__ref.getField(true,"_fechafinal" /*RemoteObject*/ )),0);
 if (true) break;

case 18:
//C
this.state = 33;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 430;BA.debugLine="If FechaInicial>0 And FechaUnica=False Then";
Debug.ShouldStop(8192);
if (true) break;

case 21:
//if
this.state = 28;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_fechainicial" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("=",__ref.getField(true,"_fechaunica" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 431;BA.debugLine="If DateTemplate.Date<FechaInicial Then";
Debug.ShouldStop(16384);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ ),__ref.getField(true,"_fechainicial" /*RemoteObject*/ ))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 432;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha";
Debug.ShouldStop(32768);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("La fecha final no puede ser anterior a la fecha final")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 433;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "seleccionfecha"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 27;
;
 BA.debugLineNum = 434;BA.debugLine="Return";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 438;BA.debugLine="Dim SetD As Long= DateUtils.SetDateAndTime(Dat";
Debug.ShouldStop(2097152);
_setd = parent._dateutils.runMethod(true,"_setdateandtime",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(false,"_datetemplate" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdatetemplate.class, "_getdate" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 23)),(Object)(BA.numberCast(int.class, 59)),(Object)(BA.numberCast(int.class, 59)));Debug.locals.put("SetD", _setd);Debug.locals.put("SetD", _setd);
 BA.debugLineNum = 439;BA.debugLine="FechaFinal=SetD";
Debug.ShouldStop(4194304);
__ref.setField ("_fechafinal" /*RemoteObject*/ ,_setd);
 BA.debugLineNum = 440;BA.debugLine="Log(\"Fecha Final: \" & CRLF &  FechaFinal)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","889915428",RemoteObject.concat(RemoteObject.createImmutable("Fecha Final: "),parent.__c.getField(true,"CRLF"),__ref.getField(true,"_fechafinal" /*RemoteObject*/ )),0);
 BA.debugLineNum = 441;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinal)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"setText",parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_fechafinal" /*RemoteObject*/ ))));
 BA.debugLineNum = 442;BA.debugLine="If FechaUnica Then";
Debug.ShouldStop(33554432);
if (true) break;

case 29:
//if
this.state = 32;
if (__ref.getField(true,"_fechaunica" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 443;BA.debugLine="FechaInicial=DateUtils.SetDateAndTime(DateTim";
Debug.ShouldStop(67108864);
__ref.setField ("_fechainicial" /*RemoteObject*/ ,parent._dateutils.runMethod(true,"_setdateandtime",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_fechafinal" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_fechafinal" /*RemoteObject*/ )))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_fechafinal" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 444;BA.debugLine="txtFechaInicial.Text=txtFechaFinal.text";
Debug.ShouldStop(134217728);
__ref.getField(false,"_txtfechainicial" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_txtfechafinal" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 445;BA.debugLine="Log(\"fecha Inicial: \" & CRLF & FechaInicial)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","889915433",RemoteObject.concat(RemoteObject.createImmutable("fecha Inicial: "),parent.__c.getField(true,"CRLF"),__ref.getField(true,"_fechainicial" /*RemoteObject*/ )),0);
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 449;BA.debugLine="End Sub";
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
public static void  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cinformesexpedicionesclientes","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cinformesexpedicionesclientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cinformesexpedicionesclientes parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _u = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rbool = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cinformesexpedicionesclientes) ","cinformesexpedicionesclientes",39,__ref.getField(false, "ba"),__ref,110);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 113;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 114;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(131072);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 115;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(262144);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 116;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(524288);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 117;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 118;BA.debugLine="frm.RootPane.LoadLayout(\"scrInformeExpediciones2\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrInformeExpediciones2")));
 BA.debugLineNum = 119;BA.debugLine="Sleep(0)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 121;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 123;BA.debugLine="frm.Title=Main.PrefijoTitleForms &  \"  \" & \"Exped";
Debug.ShouldStop(67108864);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("  "),RemoteObject.createImmutable("Expediciones Expediciones Cliente")));
 BA.debugLineNum = 125;BA.debugLine="lblInfoEmailAlternativo.MouseCursor= fx.cursors.H";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lblinfoemailalternativo" /*RemoteObject*/ ).runMethod(false,"setMouseCursor",__ref.getField(false,"_fx" /*RemoteObject*/ ).getField(false,"Cursors").getField(false,"HAND"));
 BA.debugLineNum = 141;BA.debugLine="CargandoItemsCboTipoInforme=True";
Debug.ShouldStop(4096);
__ref.setField ("_cargandoitemscbotipoinforme" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 142;BA.debugLine="cboTipoInforme.Value=\"\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_cbotipoinforme" /*RemoteObject*/ ).runMethod(false,"setValue",RemoteObject.createImmutable(("")));
 BA.debugLineNum = 143;BA.debugLine="CargaItemsCbo";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_cargaitemscbo" /*RemoteObject*/ );
 BA.debugLineNum = 144;BA.debugLine="Wait For CargaItemsCbo_Completed";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","cargaitemscbo_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "show"), null);
this.state = 6;
return;
case 6:
//C
this.state = 1;
;
 BA.debugLineNum = 146;BA.debugLine="CargandoItemsCboTipoInforme=False";
Debug.ShouldStop(131072);
__ref.setField ("_cargandoitemscbotipoinforme" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 148;BA.debugLine="lblTipoInforme.Visible=False";
Debug.ShouldStop(524288);
__ref.getField(false,"_lbltipoinforme" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="cboTipoInforme.Visible=False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cbotipoinforme" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 250;BA.debugLine="DBUtils.DropTable(mSQL,\"tblDestinatarios\")";
Debug.ShouldStop(33554432);
parent._dbutils.runVoidMethod ("_droptable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("tblDestinatarios")));
 BA.debugLineNum = 251;BA.debugLine="Dim u As Map";
Debug.ShouldStop(67108864);
_u = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("u", _u);
 BA.debugLineNum = 252;BA.debugLine="u.Initialize";
Debug.ShouldStop(134217728);
_u.runVoidMethod ("Initialize");
 BA.debugLineNum = 253;BA.debugLine="u.Put(\"ClienteProtec\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(268435456);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ClienteProtec"))),(Object)((parent._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 254;BA.debugLine="u.Put(\"Tipo\",DBUtils.DB_TEXT)";
Debug.ShouldStop(536870912);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Tipo"))),(Object)((parent._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 255;BA.debugLine="u.Put(\"Codigo\",DBUtils.DB_TEXT)";
Debug.ShouldStop(1073741824);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Codigo"))),(Object)((parent._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 256;BA.debugLine="u.Put(\"Nombre\",DBUtils.DB_TEXT)";
Debug.ShouldStop(-2147483648);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((parent._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 257;BA.debugLine="u.Put(\"Email\",DBUtils.DB_TEXT)";
Debug.ShouldStop(1);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Email"))),(Object)((parent._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 258;BA.debugLine="u.Put(\"Cliente\",DBUtils.DB_TEXT)";
Debug.ShouldStop(2);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Cliente"))),(Object)((parent._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 259;BA.debugLine="u.Put(\"NombreCliente\",DBUtils.DB_TEXT)";
Debug.ShouldStop(4);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreCliente"))),(Object)((parent._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 260;BA.debugLine="u.Put(\"NombreResponsableCuenta\",DBUtils.DB_TEXT)";
Debug.ShouldStop(8);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("NombreResponsableCuenta"))),(Object)((parent._dbutils._db_text /*RemoteObject*/ )));
 BA.debugLineNum = 261;BA.debugLine="u.Put(\"Seleccionado\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(16);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Seleccionado"))),(Object)((parent._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 263;BA.debugLine="u.Put(\"EnviadoEmail\",DBUtils.DB_INTEGER)";
Debug.ShouldStop(64);
_u.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("EnviadoEmail"))),(Object)((parent._dbutils._db_integer /*RemoteObject*/ )));
 BA.debugLineNum = 265;BA.debugLine="DBUtils.CreateTable(mSQL,\"tblDestinatarios\",u,\"\")";
Debug.ShouldStop(256);
parent._dbutils.runVoidMethod ("_createtable" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblDestinatarios")),(Object)(_u),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 270;BA.debugLine="tvDestinatarios.SetColumns(Array As String(\"Selec";
Debug.ShouldStop(8192);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runVoidMethod ("SetColumns",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("Seleccionado"),BA.ObjectToString("Nombre"),BA.ObjectToString("Email"),RemoteObject.createImmutable("Email Enviado")})))));
 BA.debugLineNum = 273;BA.debugLine="tvDestinatarios.SetColumnWidth(0,100)";
Debug.ShouldStop(65536);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runVoidMethod ("SetColumnWidth",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(double.class, 100)));
 BA.debugLineNum = 274;BA.debugLine="tvDestinatarios.SetColumnWidth(1,200)";
Debug.ShouldStop(131072);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runVoidMethod ("SetColumnWidth",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(double.class, 200)));
 BA.debugLineNum = 275;BA.debugLine="tvDestinatarios.SetColumnWidth(2,420)";
Debug.ShouldStop(262144);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runVoidMethod ("SetColumnWidth",(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(double.class, 420)));
 BA.debugLineNum = 276;BA.debugLine="tvDestinatarios.SetColumnWidth(3,100)";
Debug.ShouldStop(524288);
__ref.getField(false,"_tvdestinatarios" /*RemoteObject*/ ).runVoidMethod ("SetColumnWidth",(Object)(BA.numberCast(int.class, 3)),(Object)(BA.numberCast(double.class, 100)));
 BA.debugLineNum = 280;BA.debugLine="lstCamposInformeDocumentosExpedidosClientes.Initi";
Debug.ShouldStop(8388608);
__ref.getField(false,"_lstcamposinformedocumentosexpedidosclientes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 281;BA.debugLine="lstCamposInformeDocumentosExpedidosClientes.AddAl";
Debug.ShouldStop(16777216);
__ref.getField(false,"_lstcamposinformedocumentosexpedidosclientes" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {13},new Object[] {BA.ObjectToString("Documento"),BA.ObjectToString("FechaDocumento"),BA.ObjectToString("Pedido"),BA.ObjectToString("PedidoCliente"),BA.ObjectToString("NombreCliente"),BA.ObjectToString("Ciudad"),BA.ObjectToString("NombreResponsableCuenta"),BA.ObjectToString("EmailResponsableCuenta"),BA.ObjectToString("Articulo"),BA.ObjectToString("Descripcion"),BA.ObjectToString("Talla"),BA.ObjectToString("Cantidad"),RemoteObject.createImmutable("UM")})))));
 BA.debugLineNum = 284;BA.debugLine="lstCamposInformePedidosPendientesClientes.Initial";
Debug.ShouldStop(134217728);
__ref.getField(false,"_lstcamposinformepedidospendientesclientes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 285;BA.debugLine="lstCamposInformePedidosPendientesClientes.AddAll(";
Debug.ShouldStop(268435456);
__ref.getField(false,"_lstcamposinformepedidospendientesclientes" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {13},new Object[] {BA.ObjectToString("Pedido"),BA.ObjectToString("FechaPedido"),BA.ObjectToString("Pedido"),BA.ObjectToString("PedidoCliente"),BA.ObjectToString("NombreCliente"),BA.ObjectToString("Ciudad"),BA.ObjectToString("NombreResponsableCuenta"),BA.ObjectToString("EmailResponsableCuenta"),BA.ObjectToString("Articulo"),BA.ObjectToString("Descripcion"),BA.ObjectToString("Talla"),BA.ObjectToString("Cantidad"),RemoteObject.createImmutable("UM")})))));
 BA.debugLineNum = 288;BA.debugLine="lstCamposInformeDocumentosExpedidosComerciales.In";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lstcamposinformedocumentosexpedidoscomerciales" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 289;BA.debugLine="lstCamposInformeDocumentosExpedidosComerciales.Ad";
Debug.ShouldStop(1);
__ref.getField(false,"_lstcamposinformedocumentosexpedidoscomerciales" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {13},new Object[] {BA.ObjectToString("Documento"),BA.ObjectToString("Fecha"),BA.ObjectToString("PedidoCliente"),BA.ObjectToString("NombreCliente"),BA.ObjectToString("NombreDireccionEnvio"),BA.ObjectToString("Ciudad"),BA.ObjectToString("NombreResponsableCuenta"),BA.ObjectToString("EmailResponsableCuenta"),BA.ObjectToString("Articulo"),BA.ObjectToString("Descripcion"),BA.ObjectToString("Talla"),BA.ObjectToString("Cantidad"),RemoteObject.createImmutable("UM")})))));
 BA.debugLineNum = 292;BA.debugLine="lstCamposInformePedidosPendientesComerciales.Init";
Debug.ShouldStop(8);
__ref.getField(false,"_lstcamposinformepedidospendientescomerciales" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 293;BA.debugLine="lstCamposInformePedidosPendientesComerciales.AddA";
Debug.ShouldStop(16);
__ref.getField(false,"_lstcamposinformepedidospendientescomerciales" /*RemoteObject*/ ).runVoidMethod ("AddAll",(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Documento"),BA.ObjectToString("FechaDocumento"),BA.ObjectToString("NombreCliente"),BA.ObjectToString("PedidoCliente"),BA.ObjectToString("Ciudad"),BA.ObjectToString("NombreResponsableCuenta"),BA.ObjectToString("EmailResponsableCuenta"),BA.ObjectToString("Articulo"),BA.ObjectToString("Descripcion"),BA.ObjectToString("Talla"),BA.ObjectToString("CantidadPte"),RemoteObject.createImmutable("UM")})))));
 BA.debugLineNum = 296;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(128);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 297;BA.debugLine="chkFechaUnica.Checked=True";
Debug.ShouldStop(256);
__ref.getField(false,"_chkfechaunica" /*RemoteObject*/ ).runMethod(true,"setChecked",parent.__c.getField(true,"True"));
 BA.debugLineNum = 298;BA.debugLine="Base = frm.RootPane";
Debug.ShouldStop(512);
__ref.getField(false,"_base" /*RemoteObject*/ ).setObject (__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject());
 BA.debugLineNum = 299;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(1024);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 300;BA.debugLine="Dialog.BlurBackground=False";
Debug.ShouldStop(2048);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_blurbackground" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 302;BA.debugLine="Dialog.Title = \"Fechas Informe\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Fechas Informe")));
 BA.debugLineNum = 305;BA.debugLine="InicializarCalendario";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_inicializarcalendario" /*RemoteObject*/ );
 BA.debugLineNum = 306;BA.debugLine="pnlFondoDestinatarios.Visible=False";
Debug.ShouldStop(131072);
__ref.getField(false,"_pnlfondodestinatarios" /*RemoteObject*/ ).runMethod(true,"setVisible",parent.__c.getField(true,"False"));
 BA.debugLineNum = 309;BA.debugLine="frm.Show";
Debug.ShouldStop(1048576);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 311;BA.debugLine="wait for (LoadCred) complete (rBool As Boolean)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cinformesexpedicionesclientes", "show"), __ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_loadcred" /*RemoteObject*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rbool = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rBool", _rbool);
;
 BA.debugLineNum = 312;BA.debugLine="If rBool=False Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_rbool,parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 315;BA.debugLine="SalirModulo";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cinformesexpedicionesclientes.class, "_salirmodulo" /*RemoteObject*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
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
public static void  _cargaitemscbo_completed(RemoteObject __ref) throws Exception{
}
}