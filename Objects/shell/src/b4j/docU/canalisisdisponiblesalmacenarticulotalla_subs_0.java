package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class canalisisdisponiblesalmacenarticulotalla_subs_0 {


public static void  _actualizardatos(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("actualizardatos")) { __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","actualizardatos", __ref); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _senderfilter = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatos (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,170);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 172;BA.debugLine="Wait For(ActualizarDatosDisponiblesNAV) complete";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), __ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_actualizardatosdisponiblesnav" /*RemoteObject*/ ));
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 173;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(4096);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 174;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(8192);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 175;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 176;BA.debugLine="SalirModulo";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 177;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 181;BA.debugLine="Wait For(ActualizarDatosEstadoComentariosAlmacenA";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), __ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_actualizardatosestadocomentariosalmacenarticulotalla" /*RemoteObject*/ ));
this.state = 35;
return;
case 35:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 182;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(2097152);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 183;BA.debugLine="If Accion<>\"OK\" Then";
Debug.ShouldStop(4194304);
if (true) break;

case 5:
//if
this.state = 8;
if (RemoteObject.solveBoolean("!",_accion,BA.ObjectToString("OK"))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 184;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(8388608);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 185;BA.debugLine="SalirModulo";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 186;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 BA.debugLineNum = 189;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(268435456);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 190;BA.debugLine="sb.Initialize";
Debug.ShouldStop(536870912);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 191;BA.debugLine="sb.Append(\"update tblAnalisisDisponiblesAlmacenAr";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblAnalisisDisponiblesAlmacenArticuloTalla set Comentarios=1 from ")));
 BA.debugLineNum = 192;BA.debugLine="sb.append(\" (select Almacen,Articulo,Talla from t";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" (select Almacen,Articulo,Talla from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla where Comentario<>? group by Almacen,Articulo,Talla having count(*)>0) as tNumLin")));
 BA.debugLineNum = 193;BA.debugLine="sb.Append(\" where tblAnalisisDisponiblesAlmacenAr";
Debug.ShouldStop(1);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where tblAnalisisDisponiblesAlmacenArticuloTalla.Almacen=tNumLin.Almacen and")));
 BA.debugLineNum = 194;BA.debugLine="sb.Append(\" tblAnalisisDisponiblesAlmacenArticulo";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" tblAnalisisDisponiblesAlmacenArticuloTalla.Articulo=tNumLin.Articulo and tblAnalisisDisponiblesAlmacenArticuloTalla.Talla=tNumLin.Talla")));
 BA.debugLineNum = 195;BA.debugLine="mSQL.AddNonQueryToBatch(sb.ToString, Array As Obj";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 197;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(16);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 198;BA.debugLine="sb.Initialize";
Debug.ShouldStop(32);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="sb.Append(\"update tblAnalisisDisponiblesAlmacenAr";
Debug.ShouldStop(64);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=tEst.Estado from ")));
 BA.debugLineNum = 200;BA.debugLine="sb.append(\" (select Almacen,Articulo,Talla, Estad";
Debug.ShouldStop(128);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" (select Almacen,Articulo,Talla, Estado from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla) as tEst")));
 BA.debugLineNum = 201;BA.debugLine="sb.Append(\" where tblAnalisisDisponiblesAlmacenAr";
Debug.ShouldStop(256);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" where tblAnalisisDisponiblesAlmacenArticuloTalla.Almacen=tEst.Almacen")));
 BA.debugLineNum = 202;BA.debugLine="sb.Append(\" and tblAnalisisDisponiblesAlmacenArti";
Debug.ShouldStop(512);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" and tblAnalisisDisponiblesAlmacenArticuloTalla.Articulo=tEst.Articulo")));
 BA.debugLineNum = 203;BA.debugLine="sb.Append(\" and tblAnalisisDisponiblesAlmacenArti";
Debug.ShouldStop(1024);
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" and tblAnalisisDisponiblesAlmacenArticuloTalla.Talla=tEst.Talla")));
 BA.debugLineNum = 204;BA.debugLine="mSQL.AddNonQueryToBatch(sb.ToString, Null)";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("AddNonQueryToBatch",(Object)(_sb.runMethod(true,"ToString")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 206;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
Debug.ShouldStop(8192);
_senderfilter = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecNonQueryBatch",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SQL")));Debug.locals.put("SenderFilter", _senderfilter);Debug.locals.put("SenderFilter", _senderfilter);
 BA.debugLineNum = 207;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","sql_nonquerycomplete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _senderfilter);
this.state = 36;
return;
case 36:
//C
this.state = 9;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 208;BA.debugLine="Log(\"NonQuery: \" & Success)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","841877542",RemoteObject.concat(RemoteObject.createImmutable("NonQuery: "),_success),0);
 BA.debugLineNum = 209;BA.debugLine="If Success=False Then";
Debug.ShouldStop(65536);
if (true) break;

case 9:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 210;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 211;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Error\",\"No ha sid";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Error")),(Object)(RemoteObject.createImmutable("No ha sido posible actualizar los datos SQLite."))));
this.state = 37;
return;
case 37:
//C
this.state = 12;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 212;BA.debugLine="SalirModulo";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 213;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 216;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(8388608);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblAnalisisDisponiblesAlmacenArticuloTalla order by Almacen, Articulo, Talla")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 218;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 219;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _rsub);
this.state = 38;
return;
case 38:
//C
this.state = 13;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 220;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 221;BA.debugLine="rs.Close";
Debug.ShouldStop(268435456);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 222;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(536870912);
if (true) break;

case 13:
//if
this.state = 33;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 223;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 16:
//if
this.state = 23;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 224;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(-2147483648);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 225;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 19;
;
 BA.debugLineNum = 227;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(4);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 228;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 19;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 229;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(16);
if (true) break;

case 19:
//if
this.state = 22;
if (RemoteObject.solveBoolean("=",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 230;BA.debugLine="jamTableView1.AbrirCamposBuilder";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 231;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 23;
;
 BA.debugLineNum = 234;BA.debugLine="ExitApplication";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("ExitApplication");
 if (true) break;
;
 BA.debugLineNum = 236;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(2048);

case 23:
//if
this.state = 32;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 237;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(4096);
if (true) break;

case 26:
//if
this.state = 31;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
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
 BA.debugLineNum = 238;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 239;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
 BA.debugLineNum = 244;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_fx" /*RemoteObject*/ ).runVoidMethodAndSync ("Msgbox",(Object)(__ref.getField(false,"_frm" /*RemoteObject*/ )),(Object)(BA.ObjectToString("Datos actualizados.")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mres) throws Exception{
}
public static void  _sql_nonquerycomplete(RemoteObject __ref,RemoteObject _success) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatosdisponiblesnav(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosDisponiblesNAV (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("actualizardatosdisponiblesnav")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","actualizardatosdisponiblesnav", __ref);}
ResumableSub_ActualizarDatosDisponiblesNAV rsub = new ResumableSub_ActualizarDatosDisponiblesNAV(null,__ref);
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
public static class ResumableSub_ActualizarDatosDisponiblesNAV extends BA.ResumableSub {
public ResumableSub_ActualizarDatosDisponiblesNAV(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
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
		Debug.PushSubsStack("ActualizarDatosDisponiblesNAV (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,282);
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
 BA.debugLineNum = 283;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Actualizando datos Disponible por Almacén Artículo Talla...")));
 BA.debugLineNum = 284;BA.debugLine="jamLoadingIndicator1.Show";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 285;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAnalisisDisponi";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE from tblAnalisisDisponiblesAlmacenArticuloTalla")));
 BA.debugLineNum = 286;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(536870912);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 287;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1073741824);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 288;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(-2147483648);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 289;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
Debug.ShouldStop(1);
_slinkjrdc = parent._main._rdclinknav /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 290;BA.debugLine="Dim Comando As String=\"AnalisisDisponiblesAlmacen";
Debug.ShouldStop(2);
_comando = BA.ObjectToString("AnalisisDisponiblesAlmacenArticuloTalla");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 291;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
Debug.ShouldStop(4);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 293;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosdisponiblesnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 294;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(32);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 295;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 296;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(128);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 297;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosdisponiblesnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 298;BA.debugLine="Accion=\"Salir\"";
Debug.ShouldStop(512);
_accion = BA.ObjectToString("Salir");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 299;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1024);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 302;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 303;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 304;BA.debugLine="Accion=\"Sin Datos\"";
Debug.ShouldStop(32768);
_accion = BA.ObjectToString("Sin Datos");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 305;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(65536);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 306;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
Debug.ShouldStop(131072);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No hay datos de Analisis Disponibles Almacen Articulo Talla")),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 307;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosdisponiblesnav"), _msa);
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
 BA.debugLineNum = 309;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(1048576);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 310;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(2097152);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 313;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(16777216);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 317;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
Debug.ShouldStop(268435456);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblAnalisisDisponiblesAlmacenArticuloTalla")),(Object)(_lstreg));
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
 BA.debugLineNum = 320;BA.debugLine="Return mRes";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 321;BA.debugLine="End Sub";
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
public static void  _datosjrdc_completed(RemoteObject __ref,RemoteObject _mresult) throws Exception{
}
public static RemoteObject  _actualizardatosestadocomentariosalmacenarticulotalla(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosEstadoComentariosAlmacenArticuloTalla (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("actualizardatosestadocomentariosalmacenarticulotalla")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","actualizardatosestadocomentariosalmacenarticulotalla", __ref);}
ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla rsub = new ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla(null,__ref);
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
public static class ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla extends BA.ResumableSub {
public ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
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
		Debug.PushSubsStack("ActualizarDatosEstadoComentariosAlmacenArticuloTalla (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,323);
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
 BA.debugLineNum = 324;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
Debug.ShouldStop(8);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setmensajeloading",RemoteObject.createImmutable(("Actualizando datos Estado-Comentarios por Almacén Artículo Talla...")));
 BA.debugLineNum = 327;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(64);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 328;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(128);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 329;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(256);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 330;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
Debug.ShouldStop(512);
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ;Debug.locals.put("sLinkJRDC", _slinkjrdc);Debug.locals.put("sLinkJRDC", _slinkjrdc);
 BA.debugLineNum = 331;BA.debugLine="Dim Comando As String=\"AnalisisDisponiblesEstadoC";
Debug.ShouldStop(1024);
_comando = BA.ObjectToString("AnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla");Debug.locals.put("Comando", _comando);Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 332;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
Debug.ShouldStop(2048);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(_slinkjrdc),(Object)(_comando),(Object)((parent.__c.getField(false,"Null"))),(Object)(__ref));
 BA.debugLineNum = 334;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosestadocomentariosalmacenarticulotalla"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 335;BA.debugLine="jamLoadingIndicator1.close";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 336;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 337;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando,RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 338;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosestadocomentariosalmacenarticulotalla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 BA.debugLineNum = 339;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(262144);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 340;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(524288);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 343;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
 BA.debugLineNum = 345;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(16777216);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 346;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(33554432);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 350;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(536870912);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 351;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(1073741824);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 354;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
Debug.ShouldStop(2);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 358;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblAnalisisDisponibles";
Debug.ShouldStop(32);
parent._dbutils.runVoidMethod ("_insertmaps" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla")),(Object)(_lstreg));
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
 BA.debugLineNum = 361;BA.debugLine="Return mRes";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 362;BA.debugLine="End Sub";
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
public static RemoteObject  _asjo(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("asJO (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("asjo")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","asjo", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 151;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Return o";
Debug.ShouldStop(8388608);
if (true) return _o;
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnSalir_Click (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("btnsalir_click")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","btnsalir_click", __ref);}
 BA.debugLineNum = 160;BA.debugLine="Sub btnSalir_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 161;BA.debugLine="SalirModulo";
Debug.ShouldStop(1);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
canalisisdisponiblesalmacenarticulotalla._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",canalisisdisponiblesalmacenarticulotalla._fx);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
canalisisdisponiblesalmacenarticulotalla._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",canalisisdisponiblesalmacenarticulotalla._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private frm As Form";
canalisisdisponiblesalmacenarticulotalla._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",canalisisdisponiblesalmacenarticulotalla._frm);
 //BA.debugLineNum = 9;BA.debugLine="Private btnSalir As Button";
canalisisdisponiblesalmacenarticulotalla._btnsalir = RemoteObject.createNew ("anywheresoftware.b4j.objects.ButtonWrapper");__ref.setField("_btnsalir",canalisisdisponiblesalmacenarticulotalla._btnsalir);
 //BA.debugLineNum = 10;BA.debugLine="Private jamTableView1 As jamTableView";
canalisisdisponiblesalmacenarticulotalla._jamtableview1 = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableview1",canalisisdisponiblesalmacenarticulotalla._jamtableview1);
 //BA.debugLineNum = 12;BA.debugLine="Dim Dialog As B4XDialog";
canalisisdisponiblesalmacenarticulotalla._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",canalisisdisponiblesalmacenarticulotalla._dialog);
 //BA.debugLineNum = 13;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
canalisisdisponiblesalmacenarticulotalla._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",canalisisdisponiblesalmacenarticulotalla._jamloadingindicator1);
 //BA.debugLineNum = 14;BA.debugLine="Dim mSQL As SQL";
canalisisdisponiblesalmacenarticulotalla._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",canalisisdisponiblesalmacenarticulotalla._msql);
 //BA.debugLineNum = 16;BA.debugLine="Public PermisoModuloUsuario As String";
canalisisdisponiblesalmacenarticulotalla._permisomodulousuario = RemoteObject.createImmutable("");__ref.setField("_permisomodulousuario",canalisisdisponiblesalmacenarticulotalla._permisomodulousuario);
 //BA.debugLineNum = 18;BA.debugLine="Private imagencomentario() As Byte";
canalisisdisponiblesalmacenarticulotalla._imagencomentario = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});__ref.setField("_imagencomentario",canalisisdisponiblesalmacenarticulotalla._imagencomentario);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _copiarestadocomentarioanalisisdispalmarttalla(RemoteObject __ref,RemoteObject _almacendestino,RemoteObject _articulodestino,RemoteObject _talladestino,RemoteObject _estadocopiado,RemoteObject _comentariocopiado) throws Exception{
try {
		Debug.PushSubsStack("CopiarEstadoComentarioAnalisisDispAlmArtTalla (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,486);
if (RapidSub.canDelegate("copiarestadocomentarioanalisisdispalmarttalla")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","copiarestadocomentarioanalisisdispalmarttalla", __ref, _almacendestino, _articulodestino, _talladestino, _estadocopiado, _comentariocopiado);}
ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla rsub = new ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla(null,__ref,_almacendestino,_articulodestino,_talladestino,_estadocopiado,_comentariocopiado);
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
public static class ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla extends BA.ResumableSub {
public ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,RemoteObject __ref,RemoteObject _almacendestino,RemoteObject _articulodestino,RemoteObject _talladestino,RemoteObject _estadocopiado,RemoteObject _comentariocopiado) {
this.parent = parent;
this.__ref = __ref;
this._almacendestino = _almacendestino;
this._articulodestino = _articulodestino;
this._talladestino = _talladestino;
this._estadocopiado = _estadocopiado;
this._comentariocopiado = _comentariocopiado;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
RemoteObject _almacendestino;
RemoteObject _articulodestino;
RemoteObject _talladestino;
RemoteObject _estadocopiado;
RemoteObject _comentariocopiado;
RemoteObject _lstreg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _comando = RemoteObject.createImmutable("");
RemoteObject _mresult = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _mresp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sresp = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CopiarEstadoComentarioAnalisisDispAlmArtTalla (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,486);
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
Debug.locals.put("AlmacenDestino", _almacendestino);
Debug.locals.put("ArticuloDestino", _articulodestino);
Debug.locals.put("TallaDestino", _talladestino);
Debug.locals.put("EstadoCopiado", _estadocopiado);
Debug.locals.put("ComentarioCopiado", _comentariocopiado);
 BA.debugLineNum = 488;BA.debugLine="Dim lstReg As List";
Debug.ShouldStop(128);
_lstreg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 489;BA.debugLine="lstReg.Initialize";
Debug.ShouldStop(256);
_lstreg.runVoidMethod ("Initialize");
 BA.debugLineNum = 490;BA.debugLine="Dim Accion As String";
Debug.ShouldStop(512);
_accion = RemoteObject.createImmutable("");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 491;BA.debugLine="Dim mRes As Map";
Debug.ShouldStop(1024);
_mres = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mRes", _mres);
 BA.debugLineNum = 492;BA.debugLine="mRes.Initialize";
Debug.ShouldStop(2048);
_mres.runVoidMethod ("Initialize");
 BA.debugLineNum = 493;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(4096);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 BA.debugLineNum = 494;BA.debugLine="mRes.Put(\"lstRegistros\",lstReg)";
Debug.ShouldStop(8192);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lstRegistros"))),(Object)((_lstreg.getObject())));
 BA.debugLineNum = 495;BA.debugLine="Dim Comando As String";
Debug.ShouldStop(16384);
_comando = RemoteObject.createImmutable("");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 496;BA.debugLine="Comando=\"NuevoEditarEstadoComentarioAnalisisDispA";
Debug.ShouldStop(32768);
_comando = BA.ObjectToString("NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla");Debug.locals.put("Comando", _comando);
 BA.debugLineNum = 497;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
Debug.ShouldStop(65536);
parent._jrdcquery.runVoidMethod ("_datosjrdc" /*void*/ ,(Object)(parent._main._rdclinkmysqldatoscomunes /*RemoteObject*/ ),(Object)(_comando),(Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")),(parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreUsuarioWindows" /*RemoteObject*/ )),(_almacendestino),(_articulodestino),(_talladestino),(_comentariocopiado),(_estadocopiado)})),(Object)(__ref));
 BA.debugLineNum = 500;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","datosjrdc_completed", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "copiarestadocomentarioanalisisdispalmarttalla"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResult", _mresult);
;
 BA.debugLineNum = 502;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
 BA.debugLineNum = 503;BA.debugLine="jamLoadingIndicator1.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 505;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
Debug.ShouldStop(16777216);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error de conexion servidor/query "),_comando)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 506;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "copiarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
 BA.debugLineNum = 507;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(67108864);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 508;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(134217728);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 510;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 512;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(-2147483648);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 513;BA.debugLine="mRes.Put(\"Accion\",Accion)";
Debug.ShouldStop(1);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 515;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
Debug.ShouldStop(4);
_lstreg = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mresult.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lstRes")))));Debug.locals.put("lstReg", _lstreg);
 BA.debugLineNum = 516;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
Debug.ShouldStop(8);
_mresp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mresp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lstreg.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mResp", _mresp);Debug.locals.put("mResp", _mresp);
 BA.debugLineNum = 517;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
Debug.ShouldStop(16);
_sresp = BA.ObjectToString(_mresp.runMethod(false,"GetValueAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("sResp", _sresp);Debug.locals.put("sResp", _sresp);
 BA.debugLineNum = 518;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
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
 BA.debugLineNum = 519;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Nu";
Debug.ShouldStop(64);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Error SP NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla"),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),_sresp)),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 520;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "copiarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 BA.debugLineNum = 521;BA.debugLine="Accion=\"NOK\"";
Debug.ShouldStop(256);
_accion = BA.ObjectToString("NOK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 522;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(512);
_mres.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Accion"))),(Object)((_accion)));
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 524;BA.debugLine="Accion=\"OK\"";
Debug.ShouldStop(2048);
_accion = BA.ObjectToString("OK");Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 525;BA.debugLine="mRes.Put(\"Accion\", Accion)";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 529;BA.debugLine="Return mRes";
Debug.ShouldStop(65536);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_mres));return;};
 BA.debugLineNum = 530;BA.debugLine="End Sub";
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
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","creaciontablassqlite", __ref);}
RemoteObject _ntfp = RemoteObject.createImmutable(0);
RemoteObject _sbcreartabla = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 250;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(67108864);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(canalisisdisponiblesalmacenarticulotalla.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblAnalisisDisponiblesAlmacenArticuloTalla")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 252;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 253;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAnalisisDisponi";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblAnalisisDisponiblesAlmacenArticuloTalla")));
 };
 BA.debugLineNum = 255;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(1073741824);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 256;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(-2147483648);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 257;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
Debug.ShouldStop(1);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesAlmacenArticuloTalla] ([Almacen] TEXT, [NombreAlmacen] TEXT")));
 BA.debugLineNum = 258;BA.debugLine="sbCrearTabla.Append(\", [Bloqueado] TEXT, [Computa";
Debug.ShouldStop(2);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [Bloqueado] TEXT, [ComputableExistencias] TEXT, [Inactivo] TEXT, [AlmacenGestCompras] TEXT, [AlmacenInterno] TEXT")));
 BA.debugLineNum = 259;BA.debugLine="sbCrearTabla.Append(\", [Taller] TEXT, [Deposito]";
Debug.ShouldStop(4);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [Taller] TEXT, [Deposito] TEXT, [Renting] TEXT, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Stock] REAL")));
 BA.debugLineNum = 260;BA.debugLine="sbCrearTabla.Append(\", [CosteUnitario] REAL, [Tot";
Debug.ShouldStop(8);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [CosteUnitario] REAL, [TotalCosteStock] REAL, [ClienteExclusiva] TEXT, [NombreClienteExclusiva] TEXT, [StockNoConfigurado] TEXT")));
 BA.debugLineNum = 261;BA.debugLine="sbCrearTabla.Append(\", [SistemaReposicion] TEXT,";
Debug.ShouldStop(16);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [SistemaReposicion] TEXT, [ArticuloBloqueado] TEXT, [ArticuloBloqueadoNoDisponible] TEXT, [GrupoContable] TEXT, [NombreRuta] TEXT")));
 BA.debugLineNum = 262;BA.debugLine="sbCrearTabla.Append(\", [RutaCorte] TEXT, [Proveed";
Debug.ShouldStop(32);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [RutaCorte] TEXT, [ProveedorPredeterminado] TEXT, [NombreProveedorPredeterminado] TEXT, [UltimoMovPositivo] INTEGER, [UltimoMovVenta] INTEGER,[Cantidad3M] REAL")));
 BA.debugLineNum = 263;BA.debugLine="sbCrearTabla.Append(\", [Cantidad6M] REAL, [Cantid";
Debug.ShouldStop(64);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [Cantidad6M] REAL, [Cantidad9M] REAL, [Cantidad12M] REAL, [Cantidad24M] REAL, [ArtTallaConMaxMin] TEXT, [StockMax] REAL, [StockMin] REAL, [NecConsumo] REAL")));
 BA.debugLineNum = 264;BA.debugLine="sbCrearTabla.Append(\", [NecVenta] REAL, [NecEnvio";
Debug.ShouldStop(128);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [NecVenta] REAL, [NecEnvioTransf] REAL, [QtyPteRecTransf] REAL,[PteRecepcionTransf] REAL, [NecNeta] REAL, [Disponible] REAL, [CosteDisponible] REAL")));
 BA.debugLineNum = 265;BA.debugLine="sbCrearTabla.Append(\", [MesesConsumo6M] REAL, [Se";
Debug.ShouldStop(256);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", [MesesConsumo6M] REAL, [SegConsumo] TEXT, [Comentarios] INTEGER default 0, [Estado] TEXT default '')")));
 BA.debugLineNum = 266;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 269;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
Debug.ShouldStop(4096);
_ntfp = BA.numberCast(int.class, __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?")),(Object)(canalisisdisponiblesalmacenarticulotalla.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla")}))))));Debug.locals.put("ntFP", _ntfp);Debug.locals.put("ntFP", _ntfp);
 BA.debugLineNum = 270;BA.debugLine="If ntFP>0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_ntfp,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 271;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAnalisisDisponi";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla")));
 };
 BA.debugLineNum = 273;BA.debugLine="Dim sbCrearTabla As StringBuilder";
Debug.ShouldStop(65536);
_sbcreartabla = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sbCrearTabla", _sbcreartabla);
 BA.debugLineNum = 274;BA.debugLine="sbCrearTabla.Initialize";
Debug.ShouldStop(131072);
_sbcreartabla.runVoidMethod ("Initialize");
 BA.debugLineNum = 275;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
Debug.ShouldStop(262144);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla] ")));
 BA.debugLineNum = 276;BA.debugLine="sbCrearTabla.Append(\"([IDLin] INTEGER, [FechaLong";
Debug.ShouldStop(524288);
_sbcreartabla.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("([IDLin] INTEGER, [FechaLong] INTEGER, [Usuario] TEXT, [Almacen] TEXT, [Articulo] TEXT, [Talla] TEXT, [Comentario] TEXT, [Estado] TEXT)")));
 BA.debugLineNum = 277;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_sbcreartabla.runMethod(true,"ToString")));
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("frm_CloseRequest (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 156;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 157;BA.debugLine="EventData.Consume";
Debug.ShouldStop(268435456);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("Initialize (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_accionsalirjamtableview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_AccionSalirJamTableView (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,366);
if (RapidSub.canDelegate("jamtableview1_accionsalirjamtableview")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","jamtableview1_accionsalirjamtableview", __ref);}
 BA.debugLineNum = 366;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="SalirModulo";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jamtableview1_cambioenceldaseleccionada(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CambioEnCeldaSeleccionada (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("jamtableview1_cambioenceldaseleccionada")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","jamtableview1_cambioenceldaseleccionada", __ref, _datosceldaseleccionada);}
RemoteObject _lineaseltv = RemoteObject.createImmutable(0);
RemoteObject _alm = RemoteObject.createImmutable("");
RemoteObject _art = RemoteObject.createImmutable("");
RemoteObject _desart = RemoteObject.createImmutable("");
RemoteObject _tal = RemoteObject.createImmutable("");
RemoteObject _stock = RemoteObject.createImmutable(0);
RemoteObject _necneta = RemoteObject.createImmutable(0);
RemoteObject _disponible = RemoteObject.createImmutable(0);
RemoteObject _cantidad6m = RemoteObject.createImmutable(0);
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 533;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 534;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
Debug.ShouldStop(2097152);
_lineaseltv = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("LineaSelTV", _lineaseltv);Debug.locals.put("LineaSelTV", _lineaseltv);
 BA.debugLineNum = 535;BA.debugLine="Dim Alm As String=jamTableView1.GetValorSQLCampoF";
Debug.ShouldStop(4194304);
_alm = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Almacen"))));Debug.locals.put("Alm", _alm);Debug.locals.put("Alm", _alm);
 BA.debugLineNum = 536;BA.debugLine="Dim Art As String=jamTableView1.GetValorSQLCampoF";
Debug.ShouldStop(8388608);
_art = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("Art", _art);Debug.locals.put("Art", _art);
 BA.debugLineNum = 537;BA.debugLine="Dim DesArt As String=jamTableView1.GetValorSQLCam";
Debug.ShouldStop(16777216);
_desart = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("DesArt", _desart);Debug.locals.put("DesArt", _desart);
 BA.debugLineNum = 538;BA.debugLine="Dim Tal As String=jamTableView1.GetValorSQLCampoF";
Debug.ShouldStop(33554432);
_tal = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("Tal", _tal);Debug.locals.put("Tal", _tal);
 BA.debugLineNum = 539;BA.debugLine="Dim Stock As Double=jamTableView1.GetValorSQLCamp";
Debug.ShouldStop(67108864);
_stock = BA.numberCast(double.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Stock"))));Debug.locals.put("Stock", _stock);Debug.locals.put("Stock", _stock);
 BA.debugLineNum = 540;BA.debugLine="Dim NecNeta As Double=jamTableView1.GetValorSQLCa";
Debug.ShouldStop(134217728);
_necneta = BA.numberCast(double.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("NecNeta"))));Debug.locals.put("NecNeta", _necneta);Debug.locals.put("NecNeta", _necneta);
 BA.debugLineNum = 541;BA.debugLine="Dim Disponible As Double=jamTableView1.GetValorSQ";
Debug.ShouldStop(268435456);
_disponible = BA.numberCast(double.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Disponible"))));Debug.locals.put("Disponible", _disponible);Debug.locals.put("Disponible", _disponible);
 BA.debugLineNum = 542;BA.debugLine="Dim Cantidad6M As Double=jamTableView1.GetValorSQ";
Debug.ShouldStop(536870912);
_cantidad6m = BA.numberCast(double.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_lineaseltv),(Object)(RemoteObject.createImmutable("Cantidad6M"))));Debug.locals.put("Cantidad6M", _cantidad6m);Debug.locals.put("Cantidad6M", _cantidad6m);
 BA.debugLineNum = 543;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Almacén";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_settextopanelinfojamtableview" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("Almacén: "),_alm,RemoteObject.createImmutable(" Artículo: "),_art,RemoteObject.createImmutable("  "),_desart,RemoteObject.createImmutable(" Talla "),_tal,RemoteObject.createImmutable("  STOCK: "),canalisisdisponiblesalmacenarticulotalla._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_stock),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(canalisisdisponiblesalmacenarticulotalla.__c.getField(true,"True"))),RemoteObject.createImmutable("  NecNeta: "),canalisisdisponiblesalmacenarticulotalla._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_necneta),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(canalisisdisponiblesalmacenarticulotalla.__c.getField(true,"True"))),RemoteObject.createImmutable("  Disponible: "),canalisisdisponiblesalmacenarticulotalla._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_disponible),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(canalisisdisponiblesalmacenarticulotalla.__c.getField(true,"True"))),RemoteObject.createImmutable("  Cantidad6M: "),canalisisdisponiblesalmacenarticulotalla._utilidades.runMethod(true,"_formatonumerico2" /*RemoteObject*/ ,(Object)(_cantidad6m),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)),(Object)(canalisisdisponiblesalmacenarticulotalla.__c.getField(true,"True"))))));
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableview1_celldobleclick(RemoteObject __ref,RemoteObject _datosceldaseleccionada) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellDobleClick (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,558);
if (RapidSub.canDelegate("jamtableview1_celldobleclick")) { __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","jamtableview1_celldobleclick", __ref, _datosceldaseleccionada); return;}
ResumableSub_jamTableView1_CellDobleClick rsub = new ResumableSub_jamTableView1_CellDobleClick(null,__ref,_datosceldaseleccionada);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_CellDobleClick extends BA.ResumableSub {
public ResumableSub_jamTableView1_CellDobleClick(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,RemoteObject __ref,RemoteObject _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
RemoteObject _datosceldaseleccionada;
RemoteObject _filaseleccionada = RemoteObject.createImmutable(0);
RemoteObject _almacensel = RemoteObject.createImmutable("");
RemoteObject _nombrealmacensel = RemoteObject.createImmutable("");
RemoteObject _articulosel = RemoteObject.createImmutable("");
RemoteObject _descripcionarticulosel = RemoteObject.createImmutable("");
RemoteObject _tallasel = RemoteObject.createImmutable("");
RemoteObject _cestcom = RemoteObject.declareNull("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla");
RemoteObject _datosanalisisdisponiblefichaalmacenarticulotalla = RemoteObject.declareNull("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla");
RemoteObject _intcom = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_CellDobleClick (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,558);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("DatosCeldaSeleccionada", _datosceldaseleccionada);
 BA.debugLineNum = 559;BA.debugLine="Dim FilaSeleccionada As Int=DatosCeldaSeleccionad";
Debug.ShouldStop(16384);
_filaseleccionada = _datosceldaseleccionada.getField(true,"Fila" /*RemoteObject*/ );Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 560;BA.debugLine="Dim AlmacenSel As String=jamTableView1.GetValorSQ";
Debug.ShouldStop(32768);
_almacensel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Almacen"))));Debug.locals.put("AlmacenSel", _almacensel);Debug.locals.put("AlmacenSel", _almacensel);
 BA.debugLineNum = 561;BA.debugLine="Dim NombreAlmacenSel As String=jamTableView1.GetV";
Debug.ShouldStop(65536);
_nombrealmacensel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("NombreAlmacen"))));Debug.locals.put("NombreAlmacenSel", _nombrealmacensel);Debug.locals.put("NombreAlmacenSel", _nombrealmacensel);
 BA.debugLineNum = 562;BA.debugLine="Dim ArticuloSel As String=jamTableView1.GetValorS";
Debug.ShouldStop(131072);
_articulosel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("ArticuloSel", _articulosel);Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 563;BA.debugLine="Dim DescripcionArticuloSel As String=jamTableView";
Debug.ShouldStop(262144);
_descripcionarticulosel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("DescripcionArticuloSel", _descripcionarticulosel);Debug.locals.put("DescripcionArticuloSel", _descripcionarticulosel);
 BA.debugLineNum = 564;BA.debugLine="Dim TallaSel As String=jamTableView1.GetValorSQLC";
Debug.ShouldStop(524288);
_tallasel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("TallaSel", _tallasel);Debug.locals.put("TallaSel", _tallasel);
 BA.debugLineNum = 565;BA.debugLine="Dim cEstCom As cAnalisisDisponibleFichaEstadoCome";
Debug.ShouldStop(1048576);
_cestcom = RemoteObject.createNew ("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla");Debug.locals.put("cEstCom", _cestcom);
 BA.debugLineNum = 566;BA.debugLine="cEstCom.Initialize(Me, frm.RootPane,AlmacenSel, N";
Debug.ShouldStop(2097152);
_cestcom.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(_almacensel),(Object)(_nombrealmacensel),(Object)(_articulosel),(Object)(_descripcionarticulosel),(Object)(_tallasel));
 BA.debugLineNum = 567;BA.debugLine="cEstCom.Show";
Debug.ShouldStop(4194304);
_cestcom.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_show" /*void*/ );
 BA.debugLineNum = 568;BA.debugLine="wait for cAnalisisDisponibleFichaEstadoComentario";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla_done", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_celldobleclick"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_datosanalisisdisponiblefichaalmacenarticulotalla = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DatosAnalisisDisponibleFichaAlmacenArticuloTalla", _datosanalisisdisponiblefichaalmacenarticulotalla);
;
 BA.debugLineNum = 569;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticuloTal";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 10;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"DatosModificados" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 570;BA.debugLine="Dim intCom As Int";
Debug.ShouldStop(33554432);
_intcom = RemoteObject.createImmutable(0);Debug.locals.put("intCom", _intcom);
 BA.debugLineNum = 571;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticuloTa";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//if
this.state = 9;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"ConComentario" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 572;BA.debugLine="intCom=1";
Debug.ShouldStop(134217728);
_intcom = BA.numberCast(int.class, 1);Debug.locals.put("intCom", _intcom);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 574;BA.debugLine="intCom=0";
Debug.ShouldStop(536870912);
_intcom = BA.numberCast(int.class, 0);Debug.locals.put("intCom", _intcom);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 576;BA.debugLine="jamTableView1.SQL.ExecNonQuery2(\"update tblOrige";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Estado" /*RemoteObject*/ )),(_intcom),(_almacensel),(_articulosel),(_tallasel)})))));
 BA.debugLineNum = 578;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponible";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Estado" /*RemoteObject*/ )),(_intcom),(_almacensel),(_articulosel),(_tallasel)})))));
 BA.debugLineNum = 580;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponible";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Estado" /*RemoteObject*/ )),(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Comentario" /*RemoteObject*/ )),(_almacensel),(_articulosel),(_tallasel)})))));
 BA.debugLineNum = 582;BA.debugLine="jamTableView1.RefrescarFilaTVMetodoSQL(FilaSelec";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(_filaseleccionada));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 584;BA.debugLine="End Sub";
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
public static void  _canalisisdisponiblefichaestadocomentarioalmacenarticulotalla_done(RemoteObject __ref,RemoteObject _datosanalisisdisponiblefichaalmacenarticulotalla) throws Exception{
}
public static void  _jamtableview1_contextmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("jamtableview1_contextmenuitem_action")) { __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","jamtableview1_contextmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableView1_ContextMenuItem_Action rsub = new ResumableSub_jamTableView1_ContextMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableView1_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
RemoteObject _tagmenuitem;
RemoteObject _articulosel = RemoteObject.createImmutable("");
RemoteObject _filaseleccionada = RemoteObject.createImmutable(0);
RemoteObject _lstinfofila = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _dc = RemoteObject.declareNull("b4j.docU.jamtableview._datoscamporegistrojamtableview");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _success = RemoteObject.createImmutable(false);
RemoteObject _almacensel = RemoteObject.createImmutable("");
RemoteObject _nombrealmacensel = RemoteObject.createImmutable("");
RemoteObject _descripcionarticulosel = RemoteObject.createImmutable("");
RemoteObject _tallasel = RemoteObject.createImmutable("");
RemoteObject _cestcom = RemoteObject.declareNull("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla");
RemoteObject _datosanalisisdisponiblefichaalmacenarticulotalla = RemoteObject.declareNull("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla");
RemoteObject _intcom = RemoteObject.createImmutable(0);
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _filadestino = RemoteObject.createImmutable(0);
RemoteObject _almacendestino = RemoteObject.createImmutable("");
RemoteObject _articulodestino = RemoteObject.createImmutable("");
RemoteObject _talladestino = RemoteObject.createImmutable("");
RemoteObject _estadocopiado = RemoteObject.createImmutable("");
RemoteObject _comentariocopiado = RemoteObject.createImmutable("");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _accion = RemoteObject.createImmutable("");
RemoteObject group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_ContextMenuItem_Action (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,382);
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
 BA.debugLineNum = 383;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//select
this.state = 61;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("VerArticuloNAV"),BA.ObjectToString("EstadoComentario"),BA.ObjectToString("CopiarEstadoComentarioALineaSiguiente"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 26;
if (true) break;
}
case 2: {
this.state = 38;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 386;BA.debugLine="Dim ArticuloSel As String";
Debug.ShouldStop(2);
_articulosel = RemoteObject.createImmutable("");Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 387;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
Debug.ShouldStop(4);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 388;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
Debug.ShouldStop(8);
_lstinfofila = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstinfofila = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_datosregistroindicefila" /*RemoteObject*/ ,(Object)(_filaseleccionada));Debug.locals.put("lstInfoFila", _lstinfofila);Debug.locals.put("lstInfoFila", _lstinfofila);
 BA.debugLineNum = 389;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
Debug.ShouldStop(16);
if (true) break;

case 4:
//for
this.state = 11;
group6 = _lstinfofila;
index6 = 0;
groupLen6 = group6.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("dc", _dc);
this.state = 62;
if (true) break;

case 62:
//C
this.state = 11;
if (index6 < groupLen6) {
this.state = 6;
_dc = (group6.runMethod(false,"Get",index6));Debug.locals.put("dc", _dc);}
if (true) break;

case 63:
//C
this.state = 62;
index6++;
Debug.locals.put("dc", _dc);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 390;BA.debugLine="If dc.Campo=\"Articulo\" Then";
Debug.ShouldStop(32);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_dc.getField(true,"Campo" /*RemoteObject*/ ),BA.ObjectToString("Articulo"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 391;BA.debugLine="ArticuloSel=dc.ValorCampo";
Debug.ShouldStop(64);
_articulosel = BA.ObjectToString(_dc.getField(false,"ValorCampo" /*RemoteObject*/ ));Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 392;BA.debugLine="Exit";
Debug.ShouldStop(128);
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 63;
;
 if (true) break;
if (true) break;
Debug.locals.put("dc", _dc);
;
 BA.debugLineNum = 395;BA.debugLine="If ArticuloSel=\"\" Then";
Debug.ShouldStop(1024);

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_articulosel,BA.ObjectToString(""))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 396;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No se ha encontrado el campo Artículo.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 397;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 14;
;
 BA.debugLineNum = 398;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 BA.debugLineNum = 400;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Mos";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("¿Mostrar en Navision la ficha del artículo "),_articulosel,RemoteObject.createImmutable("?"))),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 65;
return;
case 65:
//C
this.state = 15;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 401;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(65536);
if (true) break;

case 15:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
if (true) return ;
if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 405;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
Debug.ShouldStop(1048576);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = parent._jamlinknavision.runMethod(false,"_abrirlinkfichanav" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Ficha producto")),(Object)(BA.numberCast(int.class, 30)),(Object)(BA.ObjectToString("No.")),(Object)(_articulosel));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 406;BA.debugLine="wait for(rSub) complete (success As Boolean)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 66;
return;
case 66:
//C
this.state = 21;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("success", _success);
;
 BA.debugLineNum = 407;BA.debugLine="If success=False Then";
Debug.ShouldStop(4194304);
if (true) break;

case 21:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 408;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("No ha sido posible abrir el artículo seleccionado en Navision.")),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 409;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 67;
return;
case 67:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 61;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 413;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
Debug.ShouldStop(268435456);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 414;BA.debugLine="Dim AlmacenSel As String=jamTableView1.GetValor";
Debug.ShouldStop(536870912);
_almacensel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Almacen"))));Debug.locals.put("AlmacenSel", _almacensel);Debug.locals.put("AlmacenSel", _almacensel);
 BA.debugLineNum = 415;BA.debugLine="Dim NombreAlmacenSel As String=jamTableView1.Ge";
Debug.ShouldStop(1073741824);
_nombrealmacensel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("NombreAlmacen"))));Debug.locals.put("NombreAlmacenSel", _nombrealmacensel);Debug.locals.put("NombreAlmacenSel", _nombrealmacensel);
 BA.debugLineNum = 416;BA.debugLine="Dim ArticuloSel As String=jamTableView1.GetValo";
Debug.ShouldStop(-2147483648);
_articulosel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("ArticuloSel", _articulosel);Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 417;BA.debugLine="Dim DescripcionArticuloSel As String=jamTableVi";
Debug.ShouldStop(1);
_descripcionarticulosel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("DescripcionArticulo"))));Debug.locals.put("DescripcionArticuloSel", _descripcionarticulosel);Debug.locals.put("DescripcionArticuloSel", _descripcionarticulosel);
 BA.debugLineNum = 418;BA.debugLine="Dim TallaSel As String=jamTableView1.GetValorSQ";
Debug.ShouldStop(2);
_tallasel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("TallaSel", _tallasel);Debug.locals.put("TallaSel", _tallasel);
 BA.debugLineNum = 419;BA.debugLine="Dim cEstCom As cAnalisisDisponibleFichaEstadoCo";
Debug.ShouldStop(4);
_cestcom = RemoteObject.createNew ("b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla");Debug.locals.put("cEstCom", _cestcom);
 BA.debugLineNum = 420;BA.debugLine="cEstCom.Initialize(Me, frm.RootPane,AlmacenSel,";
Debug.ShouldStop(8);
_cestcom.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()),(Object)(_almacensel),(Object)(_nombrealmacensel),(Object)(_articulosel),(Object)(_descripcionarticulosel),(Object)(_tallasel));
 BA.debugLineNum = 421;BA.debugLine="cEstCom.Show";
Debug.ShouldStop(16);
_cestcom.runClassMethod (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla.class, "_show" /*void*/ );
 BA.debugLineNum = 422;BA.debugLine="wait for cAnalisisDisponibleFichaEstadoComentar";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","canalisisdisponiblefichaestadocomentarioalmacenarticulotalla_done", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), null);
this.state = 68;
return;
case 68:
//C
this.state = 27;
_datosanalisisdisponiblefichaalmacenarticulotalla = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("DatosAnalisisDisponibleFichaAlmacenArticuloTalla", _datosanalisisdisponiblefichaalmacenarticulotalla);
;
 BA.debugLineNum = 423;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticuloT";
Debug.ShouldStop(64);
if (true) break;

case 27:
//if
this.state = 36;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"DatosModificados" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 424;BA.debugLine="Dim intCom As Int";
Debug.ShouldStop(128);
_intcom = RemoteObject.createImmutable(0);Debug.locals.put("intCom", _intcom);
 BA.debugLineNum = 425;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticulo";
Debug.ShouldStop(256);
if (true) break;

case 30:
//if
this.state = 35;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"ConComentario" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 32;
}else {
this.state = 34;
}if (true) break;

case 32:
//C
this.state = 35;
 BA.debugLineNum = 426;BA.debugLine="intCom=1";
Debug.ShouldStop(512);
_intcom = BA.numberCast(int.class, 1);Debug.locals.put("intCom", _intcom);
 if (true) break;

case 34:
//C
this.state = 35;
 BA.debugLineNum = 428;BA.debugLine="intCom=0";
Debug.ShouldStop(2048);
_intcom = BA.numberCast(int.class, 0);Debug.locals.put("intCom", _intcom);
 if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 430;BA.debugLine="jamTableView1.SQL.ExecNonQuery2(\"update tblOri";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Estado" /*RemoteObject*/ )),(_intcom),(_almacensel),(_articulosel),(_tallasel)})))));
 BA.debugLineNum = 432;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponib";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Estado" /*RemoteObject*/ )),(_intcom),(_almacensel),(_articulosel),(_tallasel)})))));
 BA.debugLineNum = 434;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponib";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Estado" /*RemoteObject*/ )),(_datosanalisisdisponiblefichaalmacenarticulotalla.getField(true,"Comentario" /*RemoteObject*/ )),(_almacensel),(_articulosel),(_tallasel)})))));
 BA.debugLineNum = 436;BA.debugLine="jamTableView1.RefrescarFilaTVMetodoSQL(FilaSel";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(_filaseleccionada));
 if (true) break;

case 36:
//C
this.state = 61;
;
 if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 440;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
Debug.ShouldStop(8388608);
_filaseleccionada = BA.numberCast(int.class, __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_indicesfilasseleccionadas" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("FilaSeleccionada", _filaseleccionada);Debug.locals.put("FilaSeleccionada", _filaseleccionada);
 BA.debugLineNum = 441;BA.debugLine="If jamTableView1.IndiceUltimaFilaVisible=FilaSe";
Debug.ShouldStop(16777216);
if (true) break;

case 39:
//if
this.state = 42;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getindiceultimafilavisible" /*RemoteObject*/ ),BA.numberCast(double.class, _filaseleccionada))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 442;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"La fila";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), parent._utilidades.runMethod(false,"_msgboxxui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Aviso")),(Object)(RemoteObject.createImmutable("La fila a copiar no puede ser la última fila visible"))));
this.state = 69;
return;
case 69:
//C
this.state = 42;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 443;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 43;
;
 BA.debugLineNum = 445;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"Copi";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), parent._utilidades.runMethod(false,"_msgbox2xui" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Confirma")),(Object)(BA.ObjectToString("Copiar el Estado-Comentario correspondiente a la fila seleccionada, a la fila siguiente?")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper"), parent.__c.getField(false,"Null"))));
this.state = 70;
return;
case 70:
//C
this.state = 43;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 446;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
Debug.ShouldStop(536870912);
if (true) break;

case 43:
//if
this.state = 48;
if (RemoteObject.solveBoolean("!",_rint,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
if (true) return ;
if (true) break;

case 48:
//C
this.state = 49;
;
 BA.debugLineNum = 448;BA.debugLine="Dim AlmacenSel As String=jamTableView1.GetValor";
Debug.ShouldStop(-2147483648);
_almacensel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Almacen"))));Debug.locals.put("AlmacenSel", _almacensel);Debug.locals.put("AlmacenSel", _almacensel);
 BA.debugLineNum = 450;BA.debugLine="Dim ArticuloSel As String=jamTableView1.GetValo";
Debug.ShouldStop(2);
_articulosel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("ArticuloSel", _articulosel);Debug.locals.put("ArticuloSel", _articulosel);
 BA.debugLineNum = 452;BA.debugLine="Dim TallaSel As String=jamTableView1.GetValorSQ";
Debug.ShouldStop(8);
_tallasel = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("TallaSel", _tallasel);Debug.locals.put("TallaSel", _tallasel);
 BA.debugLineNum = 454;BA.debugLine="Dim FilaDestino As Int=FilaSeleccionada+1";
Debug.ShouldStop(32);
_filadestino = RemoteObject.solve(new RemoteObject[] {_filaseleccionada,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("FilaDestino", _filadestino);Debug.locals.put("FilaDestino", _filadestino);
 BA.debugLineNum = 455;BA.debugLine="Dim AlmacenDestino As String=jamTableView1.GetV";
Debug.ShouldStop(64);
_almacendestino = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filadestino),(Object)(RemoteObject.createImmutable("Almacen"))));Debug.locals.put("AlmacenDestino", _almacendestino);Debug.locals.put("AlmacenDestino", _almacendestino);
 BA.debugLineNum = 457;BA.debugLine="Dim ArticuloDestino As String=jamTableView1.Get";
Debug.ShouldStop(256);
_articulodestino = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filadestino),(Object)(RemoteObject.createImmutable("Articulo"))));Debug.locals.put("ArticuloDestino", _articulodestino);Debug.locals.put("ArticuloDestino", _articulodestino);
 BA.debugLineNum = 459;BA.debugLine="Dim TallaDestino As String=jamTableView1.GetVal";
Debug.ShouldStop(1024);
_talladestino = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filadestino),(Object)(RemoteObject.createImmutable("Talla"))));Debug.locals.put("TallaDestino", _talladestino);Debug.locals.put("TallaDestino", _talladestino);
 BA.debugLineNum = 461;BA.debugLine="Dim EstadoCopiado As String=jamTableView1.GetVa";
Debug.ShouldStop(4096);
_estadocopiado = BA.ObjectToString(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getvalorsqlcampofila" /*RemoteObject*/ ,(Object)(_filaseleccionada),(Object)(RemoteObject.createImmutable("Estado"))));Debug.locals.put("EstadoCopiado", _estadocopiado);Debug.locals.put("EstadoCopiado", _estadocopiado);
 BA.debugLineNum = 462;BA.debugLine="Dim ComentarioCopiado As String=Utilidades.FixN";
Debug.ShouldStop(8192);
_comentariocopiado = parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("Select Comentario from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {_almacensel,_articulosel,_tallasel}))))))));Debug.locals.put("ComentarioCopiado", _comentariocopiado);Debug.locals.put("ComentarioCopiado", _comentariocopiado);
 BA.debugLineNum = 464;BA.debugLine="Wait For(CopiarEstadoComentarioAnalisisDispAlmA";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), __ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_copiarestadocomentarioanalisisdispalmarttalla" /*RemoteObject*/ ,(Object)(_almacendestino),(Object)(_articulodestino),(Object)(_talladestino),(Object)(_estadocopiado),(Object)(_comentariocopiado)));
this.state = 71;
return;
case 71:
//C
this.state = 49;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 465;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
Debug.ShouldStop(65536);
_accion = BA.ObjectToString(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Accion")))));Debug.locals.put("Accion", _accion);Debug.locals.put("Accion", _accion);
 BA.debugLineNum = 466;BA.debugLine="If Accion=\"NOK\" Then Return";
Debug.ShouldStop(131072);
if (true) break;

case 49:
//if
this.state = 54;
if (RemoteObject.solveBoolean("=",_accion,BA.ObjectToString("NOK"))) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
if (true) return ;
if (true) break;

case 54:
//C
this.state = 55;
;
 BA.debugLineNum = 468;BA.debugLine="Dim intCom As Int";
Debug.ShouldStop(524288);
_intcom = RemoteObject.createImmutable(0);Debug.locals.put("intCom", _intcom);
 BA.debugLineNum = 469;BA.debugLine="If ComentarioCopiado<>\"\" Then";
Debug.ShouldStop(1048576);
if (true) break;

case 55:
//if
this.state = 60;
if (RemoteObject.solveBoolean("!",_comentariocopiado,BA.ObjectToString(""))) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
 BA.debugLineNum = 470;BA.debugLine="intCom=1";
Debug.ShouldStop(2097152);
_intcom = BA.numberCast(int.class, 1);Debug.locals.put("intCom", _intcom);
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 472;BA.debugLine="intCom=0";
Debug.ShouldStop(8388608);
_intcom = BA.numberCast(int.class, 0);Debug.locals.put("intCom", _intcom);
 if (true) break;

case 60:
//C
this.state = 61;
;
 BA.debugLineNum = 474;BA.debugLine="jamTableView1.SQL.ExecNonQuery2(\"update tblOrig";
Debug.ShouldStop(33554432);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_getsql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_estadocopiado),(_intcom),(_almacendestino),(_articulodestino),(_talladestino)})))));
 BA.debugLineNum = 476;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponibl";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_estadocopiado),(_intcom),(_almacendestino),(_articulodestino),(_talladestino)})))));
 BA.debugLineNum = 478;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponibl";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_estadocopiado),(_comentariocopiado),(_almacendestino),(_articulodestino),(_talladestino)})))));
 BA.debugLineNum = 480;BA.debugLine="jamTableView1.RefrescarFilaTVMetodoSQL(FilaDest";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_refrescarfilatvmetodosql" /*RemoteObject*/ ,(Object)(_filadestino));
 if (true) break;

case 61:
//C
this.state = -1;
;
 BA.debugLineNum = 484;BA.debugLine="End Sub";
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
public static RemoteObject  _jamtableview1_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableView1_MenuBarMenuItem_Action (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("jamtableview1_menubarmenuitem_action")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","jamtableview1_menubarmenuitem_action", __ref, _tagmenuitem);}
Debug.locals.put("TagMenuItem", _tagmenuitem);
 BA.debugLineNum = 370;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
Debug.ShouldStop(131072);
 BA.debugLineNum = 371;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("Actualizar"))) {
case 0: {
 BA.debugLineNum = 374;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_actualizardatos" /*void*/ );
 break; }
}
;
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("SalirModulo (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","salirmodulo", __ref);}
 BA.debugLineNum = 164;BA.debugLine="private Sub SalirModulo";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 BA.debugLineNum = 166;BA.debugLine="frm.Close";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 167;BA.debugLine="MainMenu2.Show";
Debug.ShouldStop(64);
canalisisdisponiblesalmacenarticulotalla._mainmenu2.runVoidMethod ("_show" /*void*/ );
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Show (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "canalisisdisponiblesalmacenarticulotalla","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _imgcom = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _cf = RemoteObject.declareNull("b4j.docU.jamtableview._datoscellfactoryjamtableview");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (canalisisdisponiblesalmacenarticulotalla) ","canalisisdisponiblesalmacenarticulotalla",15,__ref.getField(false, "ba"),__ref,26);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 28;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(268435456);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 31;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(1073741824);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 32;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(-2147483648);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 33;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(1);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 35;BA.debugLine="frm.RootPane.LoadLayout(\"scrAnalisisDisponiblesAl";
Debug.ShouldStop(4);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrAnalisisDisponiblesAlmacenArticuloTalla")));
 BA.debugLineNum = 36;BA.debugLine="Sleep(0)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "show"),BA.numberCast(int.class, 0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 38;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Análisis Disp";
Debug.ShouldStop(32);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("Análisis Disponibles Almacén Artículo Talla")));
 BA.debugLineNum = 40;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 41;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(parent._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 43;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 52;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(524288);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 53;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 59;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemseparator" /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="Dim img As Image";
Debug.ShouldStop(134217728);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 61;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.png";
Debug.ShouldStop(268435456);
_img.runVoidMethod ("InitializeSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("navision.png")),(Object)(BA.numberCast(double.class, 24)),(Object)(BA.numberCast(double.class, 24)));
 BA.debugLineNum = 63;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Artículo N";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Artículo NAV")),(Object)(BA.ObjectToString("VerArticuloNAV")),(Object)(_img));
 BA.debugLineNum = 64;BA.debugLine="Dim imgCom As Image";
Debug.ShouldStop(-2147483648);
_imgcom = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("imgCom", _imgcom);
 BA.debugLineNum = 65;BA.debugLine="imgCom.InitializeSample(File.DirAssets,\"comment16";
Debug.ShouldStop(1);
_imgcom.runVoidMethod ("InitializeSample",(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("comment16Freepik.png")),(Object)(BA.numberCast(double.class, 16)),(Object)(BA.numberCast(double.class, 16)));
 BA.debugLineNum = 66;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Estado/Com";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemimage" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Estado/Comentario")),(Object)(BA.ObjectToString("EstadoComentario")),(Object)(_imgcom));
 BA.debugLineNum = 67;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addcontextmenuitemfontawesometext" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Copiar Estado-Comentario A Línea Siguiente")),(Object)(BA.ObjectToString("CopiarEstadoComentarioALineaSiguiente")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0c5)))))));
 BA.debugLineNum = 70;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
Debug.ShouldStop(32);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaAnalisisDisponiblesAlmacenArticuloTalla.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 71;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 72;BA.debugLine="Log(mRes)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","841549870",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 73;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 74;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(512);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 75;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "canalisisdisponiblesalmacenarticulotalla", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
 BA.debugLineNum = 76;BA.debugLine="frm.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 77;BA.debugLine="Return";
Debug.ShouldStop(4096);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 80;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
Debug.ShouldStop(32768);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 84;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(524288);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 85;BA.debugLine="CF.Initialize";
Debug.ShouldStop(1048576);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
Debug.ShouldStop(2097152);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnafechasqlserver" /*RemoteObject*/ ));
 BA.debugLineNum = 87;BA.debugLine="CF.CellFactoryEnCallBack=False";
Debug.ShouldStop(4194304);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 BA.debugLineNum = 88;BA.debugLine="CF.params=Null";
Debug.ShouldStop(8388608);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 89;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
Debug.ShouldStop(16777216);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("UltimoMovPositivo")})))));
 BA.debugLineNum = 91;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(67108864);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 92;BA.debugLine="CF.Initialize";
Debug.ShouldStop(134217728);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
Debug.ShouldStop(268435456);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).getField(true,"_cellfactory_columnawraptext" /*RemoteObject*/ ));
 BA.debugLineNum = 94;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF, Array";
Debug.ShouldStop(536870912);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("DescripcionArticulo")})))));
 BA.debugLineNum = 119;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
Debug.ShouldStop(4194304);
_cf = RemoteObject.createNew ("b4j.docU.jamtableview._datoscellfactoryjamtableview");Debug.locals.put("CF", _cf);
 BA.debugLineNum = 120;BA.debugLine="CF.Initialize";
Debug.ShouldStop(8388608);
_cf.runVoidMethod ("Initialize");
 BA.debugLineNum = 121;BA.debugLine="CF.NombreFuncionCellFactory=\"setColumnaImagenCome";
Debug.ShouldStop(16777216);
_cf.setField ("NombreFuncionCellFactory" /*RemoteObject*/ ,BA.ObjectToString("setColumnaImagenComentario"));
 BA.debugLineNum = 122;BA.debugLine="CF.CellFactoryEnCallBack=True";
Debug.ShouldStop(33554432);
_cf.setField ("CellFactoryEnCallBack" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 123;BA.debugLine="Dim img As Image";
Debug.ShouldStop(67108864);
_img = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 127;BA.debugLine="imagencomentario=Utilidades.GetImageBytes(File.Di";
Debug.ShouldStop(1073741824);
__ref.setField ("_imagencomentario" /*RemoteObject*/ ,parent._utilidades.runMethod(false,"_getimagebytes" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("comment16Freepik.png"))));
 BA.debugLineNum = 135;BA.debugLine="CF.params=Null";
Debug.ShouldStop(64);
_cf.setField ("params" /*RemoteObject*/ ,(parent.__c.getField(false,"Null")));
 BA.debugLineNum = 136;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
Debug.ShouldStop(128);
__ref.getField(false,"_jamtableview1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setcellfactorylistacampos" /*RemoteObject*/ ,(Object)(_cf),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("Comentarios")})))));
 BA.debugLineNum = 138;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(512);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 139;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(1024);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 140;BA.debugLine="jamLoadingIndicator1.EstiloLoadingIndicator=\"Five";
Debug.ShouldStop(2048);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setestiloloadingindicator",BA.ObjectToString("Five Lines 1"));
 BA.debugLineNum = 141;BA.debugLine="jamLoadingIndicator1.ColorPanelFondo=xui.Color_Tr";
Debug.ShouldStop(4096);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setcolorpanelfondo" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 142;BA.debugLine="jamLoadingIndicator1.ColorLoadingIndicator=0xFF69";
Debug.ShouldStop(8192);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setcolorloadingindicator",BA.numberCast(int.class, ((int)0xff696969)));
 BA.debugLineNum = 143;BA.debugLine="jamLoadingIndicator1.ColorMensaje=0xFF696969";
Debug.ShouldStop(16384);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_setcolormensaje",BA.numberCast(int.class, ((int)0xff696969)));
 BA.debugLineNum = 145;BA.debugLine="frm.Show";
Debug.ShouldStop(65536);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 147;BA.debugLine="ActualizarDatos";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.canalisisdisponiblesalmacenarticulotalla.class, "_actualizardatos" /*void*/ );
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
}