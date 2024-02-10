package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cb2bfichapedidocliente_subs_0 {


public static RemoteObject  _actualizardatoscabecera(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosCabecera (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,924);
if (RapidSub.canDelegate("actualizardatoscabecera")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","actualizardatoscabecera", __ref);}
RemoteObject _dateformatant = RemoteObject.createImmutable("");
 BA.debugLineNum = 924;BA.debugLine="Sub ActualizarDatosCabecera";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 926;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(536870912);
_dateformatant = cb2bfichapedidocliente.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 927;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
Debug.ShouldStop(1073741824);
cb2bfichapedidocliente.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy HH:mm:ss"));
 BA.debugLineNum = 929;BA.debugLine="txtClienteERP.Text=mDatosCabeceraPedidoCliente.Co";
Debug.ShouldStop(1);
__ref.getField(false,"_txtclienteerp" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"CodigoClienteERP" /*RemoteObject*/ ));
 BA.debugLineNum = 930;BA.debugLine="txtComprador.Text=$\"${mDatosCabeceraPedidoCliente";
Debug.ShouldStop(2);
__ref.getField(false,"_txtcomprador" /*RemoteObject*/ ).runMethod(true,"setText",(RemoteObject.concat(RemoteObject.createImmutable(""),cb2bfichapedidocliente.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"NombreUsuarioComprador" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),cb2bfichapedidocliente.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"ApellidoUsuarioComprador" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "))));
 BA.debugLineNum = 931;BA.debugLine="txtCodigoDireccionEnvioERP.Text=mDatosCabeceraPed";
Debug.ShouldStop(4);
__ref.getField(false,"_txtcodigodireccionenvioerp" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"CodigoDireccionEnvioERP" /*RemoteObject*/ ));
 BA.debugLineNum = 932;BA.debugLine="txtEmailComprador.Text=mDatosCabeceraPedidoClient";
Debug.ShouldStop(8);
__ref.getField(false,"_txtemailcomprador" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"EmailComprador" /*RemoteObject*/ ));
 BA.debugLineNum = 933;BA.debugLine="txtFechaCreacion.Text=DateTime.Date(mDatosCabecer";
Debug.ShouldStop(16);
__ref.getField(false,"_txtfechacreacion" /*RemoteObject*/ ).runMethod(true,"setText",cb2bfichapedidocliente.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"FechaCreacion" /*RemoteObject*/ ))));
 BA.debugLineNum = 934;BA.debugLine="txtFechaModificacion.Text=DateTime.date(mDatosCab";
Debug.ShouldStop(32);
__ref.getField(false,"_txtfechamodificacion" /*RemoteObject*/ ).runMethod(true,"setText",cb2bfichapedidocliente.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"FechaActualizacion" /*RemoteObject*/ ))));
 BA.debugLineNum = 935;BA.debugLine="txtIDPedido.Text=mDatosCabeceraPedidoCliente.IDPe";
Debug.ShouldStop(64);
__ref.getField(false,"_txtidpedido" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDPedido" /*RemoteObject*/ )));
 BA.debugLineNum = 936;BA.debugLine="txtNombreClienteERP.Text=mDatosCabeceraPedidoClie";
Debug.ShouldStop(128);
__ref.getField(false,"_txtnombreclienteerp" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"NombreCliente" /*RemoteObject*/ ));
 BA.debugLineNum = 938;BA.debugLine="txtNombreTienda.Text=mDatosCabeceraPedidoCliente.";
Debug.ShouldStop(512);
__ref.getField(false,"_txtnombretienda" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"NombreTienda" /*RemoteObject*/ ));
 BA.debugLineNum = 939;BA.debugLine="txtOrdenCompra.Text=mDatosCabeceraPedidoCliente.O";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtordencompra" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"OrdenCompra" /*RemoteObject*/ ));
 BA.debugLineNum = 940;BA.debugLine="txtPedido.Text=mDatosCabeceraPedidoCliente.Pedido";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtpedido" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"Pedido" /*RemoteObject*/ ));
 BA.debugLineNum = 942;BA.debugLine="txtIDDireccionFacturacion.Text=mDatosCabeceraPedi";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtiddireccionfacturacion" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDDireccionFacturacion" /*RemoteObject*/ ));
 BA.debugLineNum = 943;BA.debugLine="txtNombreDireccionFacturacion.Text=mDatosCabecera";
Debug.ShouldStop(16384);
__ref.getField(false,"_txtnombredireccionfacturacion" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"NombreDireccionFacturacion" /*RemoteObject*/ ));
 BA.debugLineNum = 944;BA.debugLine="txtDireccionFacturacion.Text=mDatosCabeceraPedido";
Debug.ShouldStop(32768);
__ref.getField(false,"_txtdireccionfacturacion" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"DireccionFacturacion" /*RemoteObject*/ ));
 BA.debugLineNum = 945;BA.debugLine="txtIDDireccionEnvio.Text=mDatosCabeceraPedidoClie";
Debug.ShouldStop(65536);
__ref.getField(false,"_txtiddireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",BA.NumberToString(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDDireccionEnvio" /*RemoteObject*/ )));
 BA.debugLineNum = 946;BA.debugLine="txtNombreDireccionEnvio.Text=mDatosCabeceraPedido";
Debug.ShouldStop(131072);
__ref.getField(false,"_txtnombredireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"NombreDireccionEnvio" /*RemoteObject*/ ));
 BA.debugLineNum = 947;BA.debugLine="txtDireccionEnvio.Text=mDatosCabeceraPedidoClient";
Debug.ShouldStop(262144);
__ref.getField(false,"_txtdireccionenvio" /*RemoteObject*/ ).runMethod(true,"setText",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"DireccionEnvio" /*RemoteObject*/ ));
 BA.debugLineNum = 949;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(1048576);
cb2bfichapedidocliente.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 950;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actualizardatoslineasalbaranespedido(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLineasAlbaranesPedido (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1134);
if (RapidSub.canDelegate("actualizardatoslineasalbaranespedido")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","actualizardatoslineasalbaranespedido", __ref);}
ResumableSub_ActualizarDatosLineasAlbaranesPedido rsub = new ResumableSub_ActualizarDatosLineasAlbaranesPedido(null,__ref);
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
public static class ResumableSub_ActualizarDatosLineasAlbaranesPedido extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLineasAlbaranesPedido(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLineasAlbaranesPedido (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1134);
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
 BA.debugLineNum = 1135;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(16384);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BLineasAlbaranPedidoCliente order by FechaAlbaran, Albaran, LineaAlbaran")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1136;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasAlbara";
Debug.ShouldStop(32768);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 1137;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 1138;BA.debugLine="rs.Close";
Debug.ShouldStop(131072);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1139;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 21;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1140;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1141;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1048576);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1142;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
 BA.debugLineNum = 1144;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(8388608);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1145;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 1146;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 1147;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Ab";
Debug.ShouldStop(67108864);
__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 1148;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1151;BA.debugLine="ExitApplication";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 1152;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 1154;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(2);

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1155;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(4);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 1156;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1157;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _msa);
this.state = 25;
return;
case 25:
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
this.state = -1;
;
 BA.debugLineNum = 1162;BA.debugLine="Return True";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1163;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _mresultsetdata) throws Exception{
}
public static void  _msgbox_result(RemoteObject __ref) throws Exception{
}
public static RemoteObject  _actualizardatoslineaspedido(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLineasPedido (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,952);
if (RapidSub.canDelegate("actualizardatoslineaspedido")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","actualizardatoslineaspedido", __ref);}
ResumableSub_ActualizarDatosLineasPedido rsub = new ResumableSub_ActualizarDatosLineasPedido(null,__ref);
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
public static class ResumableSub_ActualizarDatosLineasPedido extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLineasPedido(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mresultsetdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _rint = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ActualizarDatosLineasPedido (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,952);
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
 BA.debugLineNum = 953;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
Debug.ShouldStop(16777216);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("select * from tblB2BLineasPedidoCliente order by IDLinea")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 954;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasPedido";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setdata" /*RemoteObject*/ ,(Object)((_rs.getObject())));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 955;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_mresultsetdata = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mResultSetData", _mresultsetdata);
;
 BA.debugLineNum = 956;BA.debugLine="rs.Close";
Debug.ShouldStop(134217728);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 957;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 21;
if (parent.__c.runMethod(true,"Not",(Object)(BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FlagOK"))))))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 958;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 11;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError"))))))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 959;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 960;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
 BA.debugLineNum = 962;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
Debug.ShouldStop(2);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"Msgbox2Async",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("¿Abrir CamposBuilder?")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 963;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 7;
_rint = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("rInt", _rint);
;
 BA.debugLineNum = 964;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 965;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AbrirCampos";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_abrircamposbuilder" /*void*/ );
 BA.debugLineNum = 966;BA.debugLine="Return True";
Debug.ShouldStop(32);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 969;BA.debugLine="ExitApplication";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("ExitApplication");
 BA.debugLineNum = 970;BA.debugLine="Return False";
Debug.ShouldStop(512);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;
;
 BA.debugLineNum = 972;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
Debug.ShouldStop(2048);

case 11:
//if
this.state = 20;
if (RemoteObject.solveBoolean("!",RemoteObject.createImmutable(""),BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso"))))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 973;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
Debug.ShouldStop(4096);
if (true) break;

case 14:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",parent.__c.getField(true,"True"),BA.ObjectToBoolean(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ListaVacia"))))))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 974;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
Debug.ShouldStop(8192);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToString(_mresultsetdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgAviso")))))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 975;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _msa);
this.state = 25;
return;
case 25:
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
this.state = -1;
;
 BA.debugLineNum = 980;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 981;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadatosalbaranespedidocliente(RemoteObject __ref,RemoteObject _idpedidosel) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosAlbaranesPedidoCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1035);
if (RapidSub.canDelegate("cargadatosalbaranespedidocliente")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","cargadatosalbaranespedidocliente", __ref, _idpedidosel);}
ResumableSub_CargaDatosAlbaranesPedidoCliente rsub = new ResumableSub_CargaDatosAlbaranesPedidoCliente(null,__ref,_idpedidosel);
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
public static class ResumableSub_CargaDatosAlbaranesPedidoCliente extends BA.ResumableSub {
public ResumableSub_CargaDatosAlbaranesPedidoCliente(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._idpedidosel = _idpedidosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _idpedidosel;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _msa = RemoteObject.declareNull("Object");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstalbaranes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataalbaran = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idalbaran = RemoteObject.createImmutable("");
RemoteObject _albaran = RemoteObject.createImmutable("");
RemoteObject _fechaalbaran = RemoteObject.createImmutable(0L);
RemoteObject _iddireccionenvio = RemoteObject.createImmutable(0);
RemoteObject _lstlineasalbaran = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lineaalbaran = RemoteObject.createImmutable(0);
RemoteObject _mdatalineaalbaran = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _idproductob2b = RemoteObject.createImmutable(0);
RemoteObject _itemsku = RemoteObject.createImmutable("");
RemoteObject _itemparentsku = RemoteObject.createImmutable("");
RemoteObject _codigoarticulonav = RemoteObject.createImmutable("");
RemoteObject _descripcionproductob2b = RemoteObject.createImmutable("");
RemoteObject _tallab2b = RemoteObject.createImmutable("");
RemoteObject _qtylineaalbaran = RemoteObject.createImmutable(0);
RemoteObject _uomb2b = RemoteObject.createImmutable("");
RemoteObject group14;
int index14;
int groupLen14;
RemoteObject group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosAlbaranesPedidoCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1035);
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
Debug.locals.put("IDPedidoSel", _idpedidosel);
 BA.debugLineNum = 1037;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BLineasAlbara";
Debug.ShouldStop(4096);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BLineasAlbaranPedidoCliente")));
 BA.debugLineNum = 1039;BA.debugLine="wait for(EnvioDatosAPIMagentoAlbaranesPedido(mTk,";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "cargadatosalbaranespedidocliente"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_enviodatosapimagentoalbaranespedido" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtk" /*RemoteObject*/ )),(Object)(_idpedidosel)));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1040;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1041;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error en la";
Debug.ShouldStop(65536);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Error en la descarga de albaranes del pedido.\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sresp))),RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1043;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "cargadatosalbaranespedidocliente"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
 BA.debugLineNum = 1044;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1047;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(4194304);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1048;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(8388608);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 1050;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(33554432);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1051;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(67108864);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1052;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(134217728);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1053;BA.debugLine="Dim lstAlbaranes As List=root.Get(\"items\")";
Debug.ShouldStop(268435456);
_lstalbaranes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstalbaranes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("lstAlbaranes", _lstalbaranes);Debug.locals.put("lstAlbaranes", _lstalbaranes);
 BA.debugLineNum = 1054;BA.debugLine="For Each mDataAlbaran As Map In lstAlbaranes";
Debug.ShouldStop(536870912);
if (true) break;

case 5:
//for
this.state = 12;
_mdataalbaran = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group14 = _lstalbaranes;
index14 = 0;
groupLen14 = group14.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataAlbaran", _mdataalbaran);
this.state = 15;
if (true) break;

case 15:
//C
this.state = 12;
if (index14 < groupLen14) {
this.state = 7;
_mdataalbaran = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group14.runMethod(false,"Get",index14));Debug.locals.put("mDataAlbaran", _mdataalbaran);}
if (true) break;

case 16:
//C
this.state = 15;
index14++;
Debug.locals.put("mDataAlbaran", _mdataalbaran);
if (true) break;

case 7:
//C
this.state = 8;
 BA.debugLineNum = 1055;BA.debugLine="Log(mDataAlbaran)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","849414164",BA.ObjectToString(_mdataalbaran),0);
 BA.debugLineNum = 1056;BA.debugLine="Dim IDAlbaran As String=mDataAlbaran.Get(\"entity";
Debug.ShouldStop(-2147483648);
_idalbaran = BA.ObjectToString(_mdataalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDAlbaran", _idalbaran);Debug.locals.put("IDAlbaran", _idalbaran);
 BA.debugLineNum = 1057;BA.debugLine="Dim Albaran As String=mDataAlbaran.Get(\"incremen";
Debug.ShouldStop(1);
_albaran = BA.ObjectToString(_mdataalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("increment_id")))));Debug.locals.put("Albaran", _albaran);Debug.locals.put("Albaran", _albaran);
 BA.debugLineNum = 1058;BA.debugLine="Dim FechaAlbaran As Long=DateTime.DateParse(mDat";
Debug.ShouldStop(2);
_fechaalbaran = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(BA.ObjectToString(_mdataalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))))));Debug.locals.put("FechaAlbaran", _fechaalbaran);Debug.locals.put("FechaAlbaran", _fechaalbaran);
 BA.debugLineNum = 1059;BA.debugLine="Dim IDDireccionEnvio As Int=mDataAlbaran.Get(\"sh";
Debug.ShouldStop(4);
_iddireccionenvio = BA.numberCast(int.class, _mdataalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_address_id")))));Debug.locals.put("IDDireccionEnvio", _iddireccionenvio);Debug.locals.put("IDDireccionEnvio", _iddireccionenvio);
 BA.debugLineNum = 1060;BA.debugLine="Dim lstLineasAlbaran As List=mDataAlbaran.Get(\"i";
Debug.ShouldStop(8);
_lstlineasalbaran = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstlineasalbaran = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mdataalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("lstLineasAlbaran", _lstlineasalbaran);Debug.locals.put("lstLineasAlbaran", _lstlineasalbaran);
 BA.debugLineNum = 1061;BA.debugLine="Dim LineaAlbaran As Int";
Debug.ShouldStop(16);
_lineaalbaran = RemoteObject.createImmutable(0);Debug.locals.put("LineaAlbaran", _lineaalbaran);
 BA.debugLineNum = 1062;BA.debugLine="For Each mDataLineaAlbaran As Map In lstLineasAl";
Debug.ShouldStop(32);
if (true) break;

case 8:
//for
this.state = 11;
_mdatalineaalbaran = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group22 = _lstlineasalbaran;
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataLineaAlbaran", _mdatalineaalbaran);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index22 < groupLen22) {
this.state = 10;
_mdatalineaalbaran = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group22.runMethod(false,"Get",index22));Debug.locals.put("mDataLineaAlbaran", _mdatalineaalbaran);}
if (true) break;

case 18:
//C
this.state = 17;
index22++;
Debug.locals.put("mDataLineaAlbaran", _mdatalineaalbaran);
if (true) break;

case 10:
//C
this.state = 18;
 BA.debugLineNum = 1063;BA.debugLine="Log(mDataLineaAlbaran)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","849414172",BA.ObjectToString(_mdatalineaalbaran),0);
 BA.debugLineNum = 1064;BA.debugLine="Dim IDProductoB2B As Int=mDataLineaAlbaran.Get(";
Debug.ShouldStop(128);
_idproductob2b = BA.numberCast(int.class, _mdatalineaalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_id")))));Debug.locals.put("IDProductoB2B", _idproductob2b);Debug.locals.put("IDProductoB2B", _idproductob2b);
 BA.debugLineNum = 1065;BA.debugLine="Dim ItemSKU As String=mDataLineaAlbaran.get(\"sk";
Debug.ShouldStop(256);
_itemsku = BA.ObjectToString(_mdatalineaalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("ItemSKU", _itemsku);Debug.locals.put("ItemSKU", _itemsku);
 BA.debugLineNum = 1066;BA.debugLine="Dim ItemParentSKU As String=mSQL.ExecQuerySingl";
Debug.ShouldStop(512);
_itemparentsku = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select ItemParentSKU from tblB2BLineasPedidoCliente where ItemSKU=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_itemsku})))));Debug.locals.put("ItemParentSKU", _itemparentsku);Debug.locals.put("ItemParentSKU", _itemparentsku);
 BA.debugLineNum = 1067;BA.debugLine="Dim CodigoArticuloNAV As String=mSQL.ExecQueryS";
Debug.ShouldStop(1024);
_codigoarticulonav = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select CodigoArticuloNav from tblB2BLineasPedidoCliente where ItemSKU=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_itemsku})))));Debug.locals.put("CodigoArticuloNAV", _codigoarticulonav);Debug.locals.put("CodigoArticuloNAV", _codigoarticulonav);
 BA.debugLineNum = 1068;BA.debugLine="Dim DescripcionProductoB2B As String=mSQL.ExecQ";
Debug.ShouldStop(2048);
_descripcionproductob2b = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select DescripcionProductoB2B from tblB2BLineasPedidoCliente where ItemSKU=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_itemsku})))));Debug.locals.put("DescripcionProductoB2B", _descripcionproductob2b);Debug.locals.put("DescripcionProductoB2B", _descripcionproductob2b);
 BA.debugLineNum = 1069;BA.debugLine="Dim TallaB2B As String=mSQL.ExecQuerySingleResu";
Debug.ShouldStop(4096);
_tallab2b = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select TallaB2B from tblB2BLineasPedidoCliente where ItemSKU=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_itemsku})))));Debug.locals.put("TallaB2B", _tallab2b);Debug.locals.put("TallaB2B", _tallab2b);
 BA.debugLineNum = 1070;BA.debugLine="Dim QtyLineaAlbaran As Int=mDataLineaAlbaran.ge";
Debug.ShouldStop(8192);
_qtylineaalbaran = BA.numberCast(int.class, _mdatalineaalbaran.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty")))));Debug.locals.put("QtyLineaAlbaran", _qtylineaalbaran);Debug.locals.put("QtyLineaAlbaran", _qtylineaalbaran);
 BA.debugLineNum = 1071;BA.debugLine="Dim UOMB2B As String=mSQL.ExecQuerySingleResult";
Debug.ShouldStop(16384);
_uomb2b = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select UOMB2B from tblB2BLineasPedidoCliente where ItemSKU=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_itemsku})))));Debug.locals.put("UOMB2B", _uomb2b);Debug.locals.put("UOMB2B", _uomb2b);
 BA.debugLineNum = 1072;BA.debugLine="LineaAlbaran=LineaAlbaran+1";
Debug.ShouldStop(32768);
_lineaalbaran = RemoteObject.solve(new RemoteObject[] {_lineaalbaran,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("LineaAlbaran", _lineaalbaran);
 BA.debugLineNum = 1074;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BLineasAl";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)((RemoteObject.concat(RemoteObject.createImmutable("insert into tblB2BLineasAlbaranPedidoCliente (\n"),RemoteObject.createImmutable("			Albaran,FechaAlbaran,\n"),RemoteObject.createImmutable("			LineaAlbaran, IDProductoB2B,\n"),RemoteObject.createImmutable("			ItemSKU, \n"),RemoteObject.createImmutable("			DescripcionProductoB2B, TallaB2B,\n"),RemoteObject.createImmutable("			QtyEnviada, UOMB2B ,\n"),RemoteObject.createImmutable("			ItemParentSKU, CodigoArticuloNAV\n"),RemoteObject.createImmutable("			)\n"),RemoteObject.createImmutable("			values(?,?,?,?,?,?,?,?,?,?,?)\n"),RemoteObject.createImmutable("			")))),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {11},new Object[] {(_albaran),(_fechaalbaran),(_lineaalbaran),(_idproductob2b),(_itemsku),(_descripcionproductob2b),(_tallab2b),(_qtylineaalbaran),(_uomb2b),(_itemparentsku),(_codigoarticulonav)})))));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 16;
Debug.locals.put("mDataLineaAlbaran", _mdatalineaalbaran);
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
Debug.locals.put("mDataAlbaran", _mdataalbaran);
;
 BA.debugLineNum = 1091;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1093;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1094;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadatosdireccioncliente(RemoteObject __ref,RemoteObject _iddireccionsel,RemoteObject _tipodireccion) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosDireccionCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1233);
if (RapidSub.canDelegate("cargadatosdireccioncliente")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","cargadatosdireccioncliente", __ref, _iddireccionsel, _tipodireccion);}
ResumableSub_CargaDatosDireccionCliente rsub = new ResumableSub_CargaDatosDireccionCliente(null,__ref,_iddireccionsel,_tipodireccion);
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
public static class ResumableSub_CargaDatosDireccionCliente extends BA.ResumableSub {
public ResumableSub_CargaDatosDireccionCliente(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _iddireccionsel,RemoteObject _tipodireccion) {
this.parent = parent;
this.__ref = __ref;
this._iddireccionsel = _iddireccionsel;
this._tipodireccion = _tipodireccion;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _iddireccionsel;
RemoteObject _tipodireccion;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _mdatapedido = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstcustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mcustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _attribute_code = RemoteObject.createImmutable("");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosDireccionCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1233);
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
Debug.locals.put("IDDireccionSel", _iddireccionsel);
Debug.locals.put("TipoDireccion", _tipodireccion);
 BA.debugLineNum = 1238;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionDireccion";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "cargadatosdireccioncliente"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_enviodatosapimagentoinformaciondireccioncliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtk" /*RemoteObject*/ )),(Object)(_iddireccionsel)));
this.state = 31;
return;
case 31:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1239;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
Debug.ShouldStop(4194304);
if (true) break;

case 1:
//if
this.state = 16;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1240;BA.debugLine="If sResp.StartsWith($\"ERROR HTTPJob {\"message\":\"";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//if
this.state = 15;
if (_sresp.runMethod(true,"startsWith",(Object)((RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob {\"message\":\"No such entity with %fieldName = %fieldValue\",\"parameters\":{\"fieldName\":\"addressId\",\"fieldValue\":"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_iddireccionsel))),RemoteObject.createImmutable("}"))))).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1241;BA.debugLine="Select Case TipoDireccion";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tipodireccion,BA.ObjectToString("Facturacion"),BA.ObjectToString("Envio"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 1244;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1246;BA.debugLine="mDatosCabeceraPedidoCliente.CodigoDireccionEn";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("CodigoDireccionEnvioERP" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1247;BA.debugLine="Return True";
Debug.ShouldStop(1073741824);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 1250;BA.debugLine="Return False";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 1255;BA.debugLine="Dim mDataPedido As Map";
Debug.ShouldStop(64);
_mdatapedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataPedido", _mdatapedido);
 BA.debugLineNum = 1256;BA.debugLine="mDataPedido.Initialize";
Debug.ShouldStop(128);
_mdatapedido.runVoidMethod ("Initialize");
 BA.debugLineNum = 1261;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(4096);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1262;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(8192);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 1264;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(32768);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1265;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(65536);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1266;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(131072);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1267;BA.debugLine="Dim lstCustomAttributes As List=root.Get(\"custom_";
Debug.ShouldStop(262144);
_lstcustomattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstcustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("lstCustomAttributes", _lstcustomattributes);Debug.locals.put("lstCustomAttributes", _lstcustomattributes);
 BA.debugLineNum = 1268;BA.debugLine="For Each mCustomAttributes As Map In lstCustomAtt";
Debug.ShouldStop(524288);
if (true) break;

case 17:
//for
this.state = 30;
_mcustomattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group23 = _lstcustomattributes;
index23 = 0;
groupLen23 = group23.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mCustomAttributes", _mcustomattributes);
this.state = 32;
if (true) break;

case 32:
//C
this.state = 30;
if (index23 < groupLen23) {
this.state = 19;
_mcustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group23.runMethod(false,"Get",index23));Debug.locals.put("mCustomAttributes", _mcustomattributes);}
if (true) break;

case 33:
//C
this.state = 32;
index23++;
Debug.locals.put("mCustomAttributes", _mcustomattributes);
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 1269;BA.debugLine="Dim attribute_code As String = mCustomAttributes";
Debug.ShouldStop(1048576);
_attribute_code = BA.ObjectToString(_mcustomattributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))));Debug.locals.put("attribute_code", _attribute_code);Debug.locals.put("attribute_code", _attribute_code);
 BA.debugLineNum = 1270;BA.debugLine="Dim value As String = mCustomAttributes.Get(\"val";
Debug.ShouldStop(2097152);
_value = BA.ObjectToString(_mcustomattributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1274;BA.debugLine="If attribute_code=\"code\" Then";
Debug.ShouldStop(33554432);
if (true) break;

case 20:
//if
this.state = 29;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("code"))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 1275;BA.debugLine="Select Case TipoDireccion";
Debug.ShouldStop(67108864);
if (true) break;

case 23:
//select
this.state = 28;
switch (BA.switchObjectToInt(_tipodireccion,BA.ObjectToString("Facturacion"),BA.ObjectToString("Envio"))) {
case 0: {
this.state = 25;
if (true) break;
}
case 1: {
this.state = 27;
if (true) break;
}
}
if (true) break;

case 25:
//C
this.state = 28;
 if (true) break;

case 27:
//C
this.state = 28;
 BA.debugLineNum = 1279;BA.debugLine="mDatosCabeceraPedidoCliente.CodigoDireccionEn";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("CodigoDireccionEnvioERP" /*RemoteObject*/ ,_value);
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
Debug.locals.put("mCustomAttributes", _mcustomattributes);
;
 BA.debugLineNum = 1286;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(32);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1288;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1290;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadatospedidocliente(RemoteObject __ref,RemoteObject _idpedidosel) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosPedidoCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("cargadatospedidocliente")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","cargadatospedidocliente", __ref, _idpedidosel);}
ResumableSub_CargaDatosPedidoCliente rsub = new ResumableSub_CargaDatosPedidoCliente(null,__ref,_idpedidosel);
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
public static class ResumableSub_CargaDatosPedidoCliente extends BA.ResumableSub {
public ResumableSub_CargaDatosPedidoCliente(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._idpedidosel = _idpedidosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _idpedidosel;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _pgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _spunchout = RemoteObject.createImmutable("");
RemoteObject _idpunchout = RemoteObject.createImmutable(0);
RemoteObject _extrinsic = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _extra_data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _posr_data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _originator = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _entity_id = RemoteObject.createImmutable("");
RemoteObject _poom_data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _po_number = RemoteObject.createImmutable("");
RemoteObject _tax_amount = RemoteObject.createImmutable(0);
RemoteObject _tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _customer_note_notify = RemoteObject.createImmutable(0);
RemoteObject _shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_amount = RemoteObject.createImmutable(0);
RemoteObject _billing_address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _address_type = RemoteObject.createImmutable("");
RemoteObject _billing_customer_address_id = RemoteObject.createImmutable(0);
RemoteObject _idbilling_address = RemoteObject.createImmutable(0);
RemoteObject _billingcompany = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _postcode = RemoteObject.createImmutable("");
RemoteObject _region_id = RemoteObject.createImmutable(0);
RemoteObject _telephone = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _parent_id = RemoteObject.createImmutable(0);
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _direccionfisicafacturacion = RemoteObject.createImmutable("");
RemoteObject _colstreet = RemoteObject.createImmutable("");
RemoteObject _region = RemoteObject.createImmutable("");
RemoteObject _country_id = RemoteObject.createImmutable("");
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _region_code = RemoteObject.createImmutable("");
RemoteObject _billingaddress_extensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _billingaddress_extensionattributes_pgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total_paid = RemoteObject.createImmutable(0);
RemoteObject _increment_id = RemoteObject.createImmutable("");
RemoteObject _payment = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _base_amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _amount_paid = RemoteObject.createImmutable(0);
RemoteObject _method = RemoteObject.createImmutable("");
RemoteObject _cc_last4 = RemoteObject.createImmutable("");
RemoteObject _shipping_captured = RemoteObject.createImmutable(0);
RemoteObject _account_status = RemoteObject.createImmutable("");
RemoteObject _amount_ordered = RemoteObject.createImmutable(0);
RemoteObject _paymentid = RemoteObject.createImmutable(0);
RemoteObject _base_amount_paid = RemoteObject.createImmutable(0);
RemoteObject _shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _additional_information = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _coladditional_information = RemoteObject.createImmutable("");
RemoteObject _base_shipping_amount = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_captured = RemoteObject.createImmutable(0);
RemoteObject _state = RemoteObject.createImmutable("");
RemoteObject _base_shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _base_grand_total = RemoteObject.createImmutable(0);
RemoteObject _billing_address_id = RemoteObject.createImmutable(0);
RemoteObject _quote_id = RemoteObject.createImmutable(0);
RemoteObject _shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _weight = RemoteObject.createImmutable(0);
RemoteObject _idpedido = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _applied_rule_ids = RemoteObject.createImmutable("");
RemoteObject _subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_discount_tax_compensation_amnt = RemoteObject.createImmutable(0);
RemoteObject _subtotal = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_global_rate = RemoteObject.createImmutable(0);
RemoteObject _customer_is_guest = RemoteObject.createImmutable(0);
RemoteObject _global_currency_code = RemoteObject.createImmutable("");
RemoteObject _status = RemoteObject.createImmutable("");
RemoteObject _is_virtual = RemoteObject.createImmutable(0);
RemoteObject _base_total_invoiced_cost = RemoteObject.createImmutable(0);
RemoteObject _discount_tax_compensation_invoiced = RemoteObject.createImmutable(0);
RemoteObject _status_histories = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _store_currency_code = RemoteObject.createImmutable("");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _total_item_count = RemoteObject.createImmutable(0);
RemoteObject _shipping_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _store_to_base_rate = RemoteObject.createImmutable(0);
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _base_shipping_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _store_name = RemoteObject.createImmutable("");
RemoteObject _grand_total = RemoteObject.createImmutable(0);
RemoteObject _base_currency_code = RemoteObject.createImmutable("");
RemoteObject _base_total_paid = RemoteObject.createImmutable(0);
RemoteObject _base_tax_amount = RemoteObject.createImmutable(0);
RemoteObject _shipping_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _total_due = RemoteObject.createImmutable(0);
RemoteObject _total_qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _base_discount_amount = RemoteObject.createImmutable(0);
RemoteObject _carts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mcart = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _key = RemoteObject.createImmutable("");
RemoteObject _applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _amount = RemoteObject.createImmutable(0);
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _base_amount = RemoteObject.createImmutable(0);
RemoteObject _title = RemoteObject.createImmutable("");
RemoteObject _percent = RemoteObject.createImmutable(0);
RemoteObject _item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tipoimpuestoaplicado = RemoteObject.createImmutable("");
RemoteObject _converting_from_quote = RemoteObject.createImmutable("");
RemoteObject _contacts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mcontacts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping_description = RemoteObject.createImmutable("");
RemoteObject _store_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _base_discount_tax_compensation_amount = RemoteObject.createImmutable(0);
RemoteObject _subtotal_invoiced = RemoteObject.createImmutable(0);
RemoteObject _base_to_order_rate = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal = RemoteObject.createImmutable(0);
RemoteObject _protect_code = RemoteObject.createImmutable("");
RemoteObject _customer_dob = RemoteObject.createImmutable("");
RemoteObject _base_total_due = RemoteObject.createImmutable(0);
RemoteObject _base_subtotal_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _customer_id = RemoteObject.createImmutable(0);
RemoteObject _customer_group_id = RemoteObject.createImmutable(0);
RemoteObject _discount_invoiced = RemoteObject.createImmutable(0);
RemoteObject _order_currency_code = RemoteObject.createImmutable("");
RemoteObject _base_tax_invoiced = RemoteObject.createImmutable(0);
RemoteObject _customer_gender = RemoteObject.createImmutable(0);
RemoteObject _shipping_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _base_shipping_invoiced = RemoteObject.createImmutable(0);
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _lineapedido = RemoteObject.createImmutable(0);
RemoteObject _lstproductosconfigurables = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _datoslineapedidoclienteb2b = RemoteObject.declareNull("b4j.docU.cb2bfichapedidocliente._tipodatoslineapedidoclienteb2b");
RemoteObject _sku = RemoteObject.createImmutable("");
RemoteObject _product_type = RemoteObject.createImmutable("");
RemoteObject _original_price = RemoteObject.createImmutable(0);
RemoteObject _free_shipping = RemoteObject.createImmutable(0);
RemoteObject _tax_percent = RemoteObject.createImmutable(0);
RemoteObject _price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _price = RemoteObject.createImmutable(0);
RemoteObject _product_id = RemoteObject.createImmutable(0);
RemoteObject _base_row_total = RemoteObject.createImmutable(0);
RemoteObject _base_original_price = RemoteObject.createImmutable(0);
RemoteObject _row_weight = RemoteObject.createImmutable(0);
RemoteObject _base_amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_price_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _no_discount = RemoteObject.createImmutable(0);
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _discount_percent = RemoteObject.createImmutable(0);
RemoteObject _order_id = RemoteObject.createImmutable(0);
RemoteObject _qty_shipped = RemoteObject.createImmutable(0);
RemoteObject _qty_ordered = RemoteObject.createImmutable(0);
RemoteObject _row_total = RemoteObject.createImmutable(0);
RemoteObject _qty_canceled = RemoteObject.createImmutable(0);
RemoteObject _talla = RemoteObject.createImmutable("");
RemoteObject _product_option = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _itemproductoptionextension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _option_value = RemoteObject.createImmutable(0);
RemoteObject _option_id = RemoteObject.createImmutable("");
RemoteObject _itemextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _itempgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _amount_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_price = RemoteObject.createImmutable(0);
RemoteObject _qty_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _item_id = RemoteObject.createImmutable(0);
RemoteObject _base_row_total_incl_tax = RemoteObject.createImmutable(0);
RemoteObject _qty_refunded = RemoteObject.createImmutable(0);
RemoteObject _base_row_invoiced = RemoteObject.createImmutable(0);
RemoteObject _is_qty_decimal = RemoteObject.createImmutable(0);
RemoteObject _idparentitem = RemoteObject.createImmutable(0);
RemoteObject _mparent_item = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mproductoptionparentitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mextensionattributesproductoptionparentitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mdataconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mextensionattributesparentitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mpgwextensionattributesparentitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _partessku = null;
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _total = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _address = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _shipping_customer_address_id = RemoteObject.createImmutable(0);
RemoteObject _iddireccionenvio = RemoteObject.createImmutable(0);
RemoteObject _company = RemoteObject.createImmutable("");
RemoteObject _direccionenvio = RemoteObject.createImmutable("");
RemoteObject _addressextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _addresspgw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _itemsshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colitemsshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _itemsshipping_assignmentsproduct_option = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _itemsshipping_assignmentsproduct_optionextension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tallalineaalbaran = RemoteObject.createImmutable("");
RemoteObject _itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemsshippingcolconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group62;
int index62;
int groupLen62;
RemoteObject group91;
int index91;
int groupLen91;
RemoteObject group150;
int index150;
int groupLen150;
RemoteObject group155;
int index155;
int groupLen155;
RemoteObject group162;
int index162;
int groupLen162;
RemoteObject group172;
int index172;
int groupLen172;
RemoteObject group174;
int index174;
int groupLen174;
RemoteObject group186;
int index186;
int groupLen186;
RemoteObject group219;
int index219;
int groupLen219;
RemoteObject group268;
int index268;
int groupLen268;
RemoteObject group321;
int index321;
int groupLen321;
RemoteObject group350;
int index350;
int groupLen350;
RemoteObject group385;
int index385;
int groupLen385;
RemoteObject group399;
int index399;
int groupLen399;
RemoteObject group434;
int index434;
int groupLen434;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosPedidoCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,304);
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
Debug.locals.put("IDPedidoSel", _idpedidosel);
 BA.debugLineNum = 306;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BLineasPedido";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BLineasPedidoCliente")));
 BA.debugLineNum = 307;BA.debugLine="mDatosCabeceraPedidoCliente.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 311;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidoCli";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "cargadatospedidocliente"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_enviodatosapimagentoinformacionpedidocliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtk" /*RemoteObject*/ )),(Object)(_idpedidosel)));
this.state = 167;
return;
case 167:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 312;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 321;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(1);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 322;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(2);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 324;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(8);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 325;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(16);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 326;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(32);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 328;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
Debug.ShouldStop(128);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 329;BA.debugLine="Log(\"extension_attributes\" & extension_attributes";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","849086489",RemoteObject.concat(RemoteObject.createImmutable("extension_attributes"),_extension_attributes),0);
 BA.debugLineNum = 330;BA.debugLine="Dim pgw As Map = extension_attributes.Get(\"pgw\")";
Debug.ShouldStop(512);
_pgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("pgw", _pgw);Debug.locals.put("pgw", _pgw);
 BA.debugLineNum = 331;BA.debugLine="Log(\"pgw\" & pgw)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","849086491",RemoteObject.concat(RemoteObject.createImmutable("pgw"),_pgw),0);
 BA.debugLineNum = 332;BA.debugLine="Dim sPunchout As String=pgw.Get(\"entity_id\")";
Debug.ShouldStop(2048);
_spunchout = BA.ObjectToString(_pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("sPunchout", _spunchout);Debug.locals.put("sPunchout", _spunchout);
 BA.debugLineNum = 333;BA.debugLine="If sPunchout=\"null\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 7:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_spunchout,BA.ObjectToString("null"))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 334;BA.debugLine="mDatosCabeceraPedidoCliente.PedidoPunchout=False";
Debug.ShouldStop(8192);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("PedidoPunchout" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 336;BA.debugLine="Dim IDPunchout As Int=pgw.Get(\"entity_id\")";
Debug.ShouldStop(32768);
_idpunchout = BA.numberCast(int.class, _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDPunchout", _idpunchout);Debug.locals.put("IDPunchout", _idpunchout);
 BA.debugLineNum = 337;BA.debugLine="If IDPunchout>0 Then";
Debug.ShouldStop(65536);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean(">",_idpunchout,BA.numberCast(double.class, 0))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 338;BA.debugLine="mDatosCabeceraPedidoCliente.PedidoPunchout=True";
Debug.ShouldStop(131072);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("PedidoPunchout" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 339;BA.debugLine="Dim extrinsic As List = pgw.Get(\"extrinsic\")";
Debug.ShouldStop(262144);
_extrinsic = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_extrinsic = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extrinsic")))));Debug.locals.put("extrinsic", _extrinsic);Debug.locals.put("extrinsic", _extrinsic);
 BA.debugLineNum = 340;BA.debugLine="Dim extra_data As List = pgw.Get(\"extra_data\")";
Debug.ShouldStop(524288);
_extra_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_extra_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extra_data")))));Debug.locals.put("extra_data", _extra_data);Debug.locals.put("extra_data", _extra_data);
 BA.debugLineNum = 341;BA.debugLine="Dim posr_data As List = pgw.Get(\"posr_data\")";
Debug.ShouldStop(1048576);
_posr_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_posr_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("posr_data")))));Debug.locals.put("posr_data", _posr_data);Debug.locals.put("posr_data", _posr_data);
 BA.debugLineNum = 342;BA.debugLine="Dim originator As List = pgw.Get(\"originator\")";
Debug.ShouldStop(2097152);
_originator = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_originator = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("originator")))));Debug.locals.put("originator", _originator);Debug.locals.put("originator", _originator);
 BA.debugLineNum = 343;BA.debugLine="Dim entity_id As String = pgw.Get(\"entity_id\")";
Debug.ShouldStop(4194304);
_entity_id = BA.ObjectToString(_pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("entity_id", _entity_id);Debug.locals.put("entity_id", _entity_id);
 BA.debugLineNum = 344;BA.debugLine="Dim poom_data As List = pgw.Get(\"poom_data\")";
Debug.ShouldStop(8388608);
_poom_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_poom_data = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _pgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("poom_data")))));Debug.locals.put("poom_data", _poom_data);Debug.locals.put("poom_data", _poom_data);
 BA.debugLineNum = 345;BA.debugLine="Dim po_number As String=pgw.Getdefault(\"po_numb";
Debug.ShouldStop(16777216);
_po_number = BA.ObjectToString(_pgw.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("po_number"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("po_number", _po_number);Debug.locals.put("po_number", _po_number);
 BA.debugLineNum = 346;BA.debugLine="mDatosCabeceraPedidoCliente.OrdenCompra=po_numb";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("OrdenCompra" /*RemoteObject*/ ,_po_number);
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 348;BA.debugLine="mDatosCabeceraPedidoCliente.PedidoPunchout=Fals";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("PedidoPunchout" /*RemoteObject*/ ,parent.__c.getField(true,"False"));
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
 BA.debugLineNum = 353;BA.debugLine="Dim tax_amount As Double = root.Getdefault(\"tax_a";
Debug.ShouldStop(1);
_tax_amount = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 354;BA.debugLine="Dim tax_invoiced As Double = root.Getdefault(\"tax";
Debug.ShouldStop(2);
_tax_invoiced = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 355;BA.debugLine="Dim customer_note_notify As Int = root.Getdefault";
Debug.ShouldStop(4);
_customer_note_notify = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_note_notify"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_note_notify", _customer_note_notify);Debug.locals.put("customer_note_notify", _customer_note_notify);
 BA.debugLineNum = 356;BA.debugLine="Dim shipping_discount_amount As Int = root.Getdef";
Debug.ShouldStop(8);
_shipping_discount_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);
 BA.debugLineNum = 357;BA.debugLine="Dim base_discount_tax_compensation_invoiced As In";
Debug.ShouldStop(16);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 359;BA.debugLine="mDatosCabeceraPedidoCliente.NombreUsuarioComprado";
Debug.ShouldStop(64);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("NombreUsuarioComprador" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_firstname")))))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 360;BA.debugLine="mDatosCabeceraPedidoCliente.ApellidoUsuarioCompra";
Debug.ShouldStop(128);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("ApellidoUsuarioComprador" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_lastname")))))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 363;BA.debugLine="Dim discount_amount As Double = root.Getdefault(\"";
Debug.ShouldStop(1024);
_discount_amount = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 364;BA.debugLine="Dim billing_address As Map = root.Get(\"billing_ad";
Debug.ShouldStop(2048);
_billing_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billing_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address")))));Debug.locals.put("billing_address", _billing_address);Debug.locals.put("billing_address", _billing_address);
 BA.debugLineNum = 365;BA.debugLine="Log(\"billing_address\" & billing_address)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","849086525",RemoteObject.concat(RemoteObject.createImmutable("billing_address"),_billing_address),0);
 BA.debugLineNum = 367;BA.debugLine="Dim firstname As String = billing_address.Get(\"fi";
Debug.ShouldStop(16384);
_firstname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 368;BA.debugLine="Dim address_type As String = billing_address.Get(";
Debug.ShouldStop(32768);
_address_type = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 369;BA.debugLine="Dim Billing_Customer_address_id As Int = billing_";
Debug.ShouldStop(65536);
_billing_customer_address_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_address_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("Billing_Customer_address_id", _billing_customer_address_id);Debug.locals.put("Billing_Customer_address_id", _billing_customer_address_id);
 BA.debugLineNum = 370;BA.debugLine="Dim IDBilling_address As Int = billing_address.Ge";
Debug.ShouldStop(131072);
_idbilling_address = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("entity_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("IDBilling_address", _idbilling_address);Debug.locals.put("IDBilling_address", _idbilling_address);
 BA.debugLineNum = 372;BA.debugLine="If mDatosCabeceraPedidoCliente.PedidoPunchout The";
Debug.ShouldStop(524288);
if (true) break;

case 19:
//if
this.state = 24;
if (__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"PedidoPunchout" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
 BA.debugLineNum = 373;BA.debugLine="mDatosCabeceraPedidoCliente.IDDireccionFacturaci";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("IDDireccionFacturacion" /*RemoteObject*/ ,BA.NumberToString(_idbilling_address));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 375;BA.debugLine="mDatosCabeceraPedidoCliente.IDDireccionFacturaci";
Debug.ShouldStop(4194304);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("IDDireccionFacturacion" /*RemoteObject*/ ,BA.NumberToString(_billing_customer_address_id));
 if (true) break;

case 24:
//C
this.state = 25;
;
 BA.debugLineNum = 378;BA.debugLine="Dim Billingcompany As String=billing_address.Getd";
Debug.ShouldStop(33554432);
_billingcompany = BA.ObjectToString(_billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("company"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("Billingcompany", _billingcompany);Debug.locals.put("Billingcompany", _billingcompany);
 BA.debugLineNum = 380;BA.debugLine="mDatosCabeceraPedidoCliente.NombreDireccionFactur";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("NombreDireccionFacturacion" /*RemoteObject*/ ,_billingcompany);
 BA.debugLineNum = 382;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
Debug.ShouldStop(536870912);
_city = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 383;BA.debugLine="Dim postcode As String = billing_address.Get(\"pos";
Debug.ShouldStop(1073741824);
_postcode = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 384;BA.debugLine="Dim region_id As Int = billing_address.Getdefault";
Debug.ShouldStop(-2147483648);
_region_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("region_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 385;BA.debugLine="Dim telephone As String = billing_address.Get(\"te";
Debug.ShouldStop(1);
_telephone = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 388;BA.debugLine="Dim lastname As String = billing_address.Get(\"las";
Debug.ShouldStop(8);
_lastname = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 389;BA.debugLine="Dim parent_id As Int = billing_address.Getdefault";
Debug.ShouldStop(16);
_parent_id = BA.numberCast(int.class, _billing_address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("parent_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 390;BA.debugLine="Dim street As List = billing_address.Get(\"street\"";
Debug.ShouldStop(32);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 391;BA.debugLine="Dim DireccionFisicaFacturacion As String";
Debug.ShouldStop(64);
_direccionfisicafacturacion = RemoteObject.createImmutable("");Debug.locals.put("DireccionFisicaFacturacion", _direccionfisicafacturacion);
 BA.debugLineNum = 392;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(128);
if (true) break;

case 25:
//for
this.state = 28;
group62 = _street;
index62 = 0;
groupLen62 = group62.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 168;
if (true) break;

case 168:
//C
this.state = 28;
if (index62 < groupLen62) {
this.state = 27;
_colstreet = BA.ObjectToString(group62.runMethod(false,"Get",index62));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 169:
//C
this.state = 168;
index62++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 27:
//C
this.state = 169;
 BA.debugLineNum = 393;BA.debugLine="Log(colstreet)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","849086553",_colstreet,0);
 BA.debugLineNum = 394;BA.debugLine="DireccionFisicaFacturacion=DireccionFisicaFactur";
Debug.ShouldStop(512);
_direccionfisicafacturacion = RemoteObject.concat(_direccionfisicafacturacion,RemoteObject.createImmutable(" "),_colstreet);Debug.locals.put("DireccionFisicaFacturacion", _direccionfisicafacturacion);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 396;BA.debugLine="Dim region As String = billing_address.Get(\"regio";
Debug.ShouldStop(2048);
_region = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 397;BA.debugLine="Dim country_id As String = billing_address.Get(\"c";
Debug.ShouldStop(4096);
_country_id = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 398;BA.debugLine="Dim email As String = billing_address.Get(\"email\"";
Debug.ShouldStop(8192);
_email = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 399;BA.debugLine="Dim region_code As String = billing_address.Get(\"";
Debug.ShouldStop(16384);
_region_code = BA.ObjectToString(_billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 401;BA.debugLine="mDatosCabeceraPedidoCliente.DireccionFacturacion=";
Debug.ShouldStop(65536);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("DireccionFacturacion" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_direccionfisicafacturacion))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_postcode))),RemoteObject.createImmutable(", "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_city))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_region))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_country_id))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 403;BA.debugLine="Dim BillingAddress_ExtensionAttributes As Map=bil";
Debug.ShouldStop(262144);
_billingaddress_extensionattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billingaddress_extensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _billing_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("BillingAddress_ExtensionAttributes", _billingaddress_extensionattributes);Debug.locals.put("BillingAddress_ExtensionAttributes", _billingaddress_extensionattributes);
 BA.debugLineNum = 404;BA.debugLine="If BillingAddress_ExtensionAttributes.IsInitializ";
Debug.ShouldStop(524288);
if (true) break;

case 29:
//if
this.state = 32;
if (_billingaddress_extensionattributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 405;BA.debugLine="Dim BillingAddress_ExtensionAttributes_pgw As Ma";
Debug.ShouldStop(1048576);
_billingaddress_extensionattributes_pgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_billingaddress_extensionattributes_pgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _billingaddress_extensionattributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("BillingAddress_ExtensionAttributes_pgw", _billingaddress_extensionattributes_pgw);Debug.locals.put("BillingAddress_ExtensionAttributes_pgw", _billingaddress_extensionattributes_pgw);
 if (true) break;

case 32:
//C
this.state = 33;
;
 BA.debugLineNum = 408;BA.debugLine="Dim total_paid As Double = root.Getdefault(\"total";
Debug.ShouldStop(8388608);
_total_paid = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_paid", _total_paid);Debug.locals.put("total_paid", _total_paid);
 BA.debugLineNum = 409;BA.debugLine="Dim increment_id As String = root.Get(\"increment_";
Debug.ShouldStop(16777216);
_increment_id = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("increment_id")))));Debug.locals.put("increment_id", _increment_id);Debug.locals.put("increment_id", _increment_id);
 BA.debugLineNum = 411;BA.debugLine="mDatosCabeceraPedidoCliente.Pedido=increment_id";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("Pedido" /*RemoteObject*/ ,_increment_id);
 BA.debugLineNum = 413;BA.debugLine="Dim payment As Map = root.Get(\"payment\")";
Debug.ShouldStop(268435456);
_payment = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_payment = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment")))));Debug.locals.put("payment", _payment);Debug.locals.put("payment", _payment);
 BA.debugLineNum = 414;BA.debugLine="Log(\"payment\" & payment)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","849086574",RemoteObject.concat(RemoteObject.createImmutable("payment"),_payment),0);
 BA.debugLineNum = 415;BA.debugLine="Dim base_amount_ordered As Double = payment.Getde";
Debug.ShouldStop(1073741824);
_base_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_ordered", _base_amount_ordered);Debug.locals.put("base_amount_ordered", _base_amount_ordered);
 BA.debugLineNum = 416;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"a";
Debug.ShouldStop(-2147483648);
_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_paid", _amount_paid);Debug.locals.put("amount_paid", _amount_paid);
 BA.debugLineNum = 417;BA.debugLine="Dim method As String = payment.Get(\"method\")";
Debug.ShouldStop(1);
_method = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 418;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
Debug.ShouldStop(2);
_cc_last4 = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cc_last4")))));Debug.locals.put("cc_last4", _cc_last4);Debug.locals.put("cc_last4", _cc_last4);
 BA.debugLineNum = 419;BA.debugLine="Dim shipping_captured As Int = payment.Getdefault";
Debug.ShouldStop(4);
_shipping_captured = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_captured"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_captured", _shipping_captured);Debug.locals.put("shipping_captured", _shipping_captured);
 BA.debugLineNum = 420;BA.debugLine="Dim account_status As String = payment.Get(\"accou";
Debug.ShouldStop(8);
_account_status = BA.ObjectToString(_payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("account_status")))));Debug.locals.put("account_status", _account_status);Debug.locals.put("account_status", _account_status);
 BA.debugLineNum = 421;BA.debugLine="Dim amount_ordered As Double = payment.Getdefault";
Debug.ShouldStop(16);
_amount_ordered = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("amount_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("amount_ordered", _amount_ordered);Debug.locals.put("amount_ordered", _amount_ordered);
 BA.debugLineNum = 423;BA.debugLine="Dim PaymentID As Int = payment.Getdefault(\"entity";
Debug.ShouldStop(64);
_paymentid = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("entity_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("PaymentID", _paymentid);Debug.locals.put("PaymentID", _paymentid);
 BA.debugLineNum = 424;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefau";
Debug.ShouldStop(128);
_base_amount_paid = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_paid", _base_amount_paid);Debug.locals.put("base_amount_paid", _base_amount_paid);
 BA.debugLineNum = 425;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(\"";
Debug.ShouldStop(256);
_shipping_amount = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 426;BA.debugLine="Dim additional_information As List = payment.Get(";
Debug.ShouldStop(512);
_additional_information = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_additional_information = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("additional_information")))));Debug.locals.put("additional_information", _additional_information);Debug.locals.put("additional_information", _additional_information);
 BA.debugLineNum = 427;BA.debugLine="For Each coladditional_information As String In a";
Debug.ShouldStop(1024);
if (true) break;

case 33:
//for
this.state = 36;
group91 = _additional_information;
index91 = 0;
groupLen91 = group91.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("coladditional_information", _coladditional_information);
this.state = 170;
if (true) break;

case 170:
//C
this.state = 36;
if (index91 < groupLen91) {
this.state = 35;
_coladditional_information = BA.ObjectToString(group91.runMethod(false,"Get",index91));Debug.locals.put("coladditional_information", _coladditional_information);}
if (true) break;

case 171:
//C
this.state = 170;
index91++;
Debug.locals.put("coladditional_information", _coladditional_information);
if (true) break;

case 35:
//C
this.state = 171;
 BA.debugLineNum = 428;BA.debugLine="Log(coladditional_information)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","849086588",_coladditional_information,0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
Debug.locals.put("coladditional_information", _coladditional_information);
;
 BA.debugLineNum = 430;BA.debugLine="Dim base_shipping_amount As Double = payment.Getd";
Debug.ShouldStop(8192);
_base_shipping_amount = BA.numberCast(double.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 431;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
Debug.ShouldStop(16384);
_parent_id = BA.numberCast(int.class, _payment.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_id")))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 432;BA.debugLine="Dim base_shipping_captured As Int = payment.Getde";
Debug.ShouldStop(32768);
_base_shipping_captured = BA.numberCast(int.class, _payment.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_captured"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_captured", _base_shipping_captured);Debug.locals.put("base_shipping_captured", _base_shipping_captured);
 BA.debugLineNum = 433;BA.debugLine="Dim state As String = root.Get(\"state\")";
Debug.ShouldStop(65536);
_state = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("state")))));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 435;BA.debugLine="mDatosCabeceraPedidoCliente.EstadoPedido=state";
Debug.ShouldStop(262144);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("EstadoPedido" /*RemoteObject*/ ,_state);
 BA.debugLineNum = 437;BA.debugLine="Dim base_shipping_tax_amount As Int = root.Getdef";
Debug.ShouldStop(1048576);
_base_shipping_tax_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);
 BA.debugLineNum = 438;BA.debugLine="Dim base_grand_total As Double = root.Getdefault(";
Debug.ShouldStop(2097152);
_base_grand_total = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_grand_total"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_grand_total", _base_grand_total);Debug.locals.put("base_grand_total", _base_grand_total);
 BA.debugLineNum = 439;BA.debugLine="Dim billing_address_id As Int = root.Get(\"billing";
Debug.ShouldStop(4194304);
_billing_address_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("billing_address_id")))));Debug.locals.put("billing_address_id", _billing_address_id);Debug.locals.put("billing_address_id", _billing_address_id);
 BA.debugLineNum = 442;BA.debugLine="Dim quote_id As Int = root.Getdefault(\"quote_id\",";
Debug.ShouldStop(33554432);
_quote_id = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("quote_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("quote_id", _quote_id);Debug.locals.put("quote_id", _quote_id);
 BA.debugLineNum = 443;BA.debugLine="Dim shipping_invoiced As Int = root.Getdefault(\"s";
Debug.ShouldStop(67108864);
_shipping_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 444;BA.debugLine="Dim discount_tax_compensation_amount As Int = roo";
Debug.ShouldStop(134217728);
_discount_tax_compensation_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 445;BA.debugLine="Dim weight As Int = root.Getdefault(\"weight\",0)";
Debug.ShouldStop(268435456);
_weight = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("weight"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 447;BA.debugLine="Dim IDPedido As Int = root.Get(\"entity_id\")";
Debug.ShouldStop(1073741824);
_idpedido = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDPedido", _idpedido);Debug.locals.put("IDPedido", _idpedido);
 BA.debugLineNum = 449;BA.debugLine="mDatosCabeceraPedidoCliente.IDPedido=IDPedido";
Debug.ShouldStop(1);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("IDPedido" /*RemoteObject*/ ,_idpedido);
 BA.debugLineNum = 451;BA.debugLine="Dim base_total_invoiced As Double = root.Getdefau";
Debug.ShouldStop(4);
_base_total_invoiced = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_invoiced", _base_total_invoiced);Debug.locals.put("base_total_invoiced", _base_total_invoiced);
 BA.debugLineNum = 452;BA.debugLine="Dim base_shipping_amount As Double = root.Getdefa";
Debug.ShouldStop(8);
_base_shipping_amount = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_amount", _base_shipping_amount);Debug.locals.put("base_shipping_amount", _base_shipping_amount);
 BA.debugLineNum = 453;BA.debugLine="Dim base_subtotal_invoiced As Int = root.Getdefau";
Debug.ShouldStop(16);
_base_subtotal_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);Debug.locals.put("base_subtotal_invoiced", _base_subtotal_invoiced);
 BA.debugLineNum = 454;BA.debugLine="Dim applied_rule_ids As String = root.Get(\"applie";
Debug.ShouldStop(32);
_applied_rule_ids = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 455;BA.debugLine="Dim subtotal_incl_tax As Double = root.Getdefault";
Debug.ShouldStop(64);
_subtotal_incl_tax = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);Debug.locals.put("subtotal_incl_tax", _subtotal_incl_tax);
 BA.debugLineNum = 456;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
Debug.ShouldStop(128);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_tax_compensation_amnt"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 457;BA.debugLine="Dim subtotal As Double = root.Getdefault(\"subtota";
Debug.ShouldStop(256);
_subtotal = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal", _subtotal);Debug.locals.put("subtotal", _subtotal);
 BA.debugLineNum = 458;BA.debugLine="Dim base_shipping_incl_tax As Int = root.Getdefau";
Debug.ShouldStop(512);
_base_shipping_incl_tax = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 461;BA.debugLine="mDatosCabeceraPedidoCliente.EmailComprador=root.G";
Debug.ShouldStop(4096);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("EmailComprador" /*RemoteObject*/ ,BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_email"))))));
 BA.debugLineNum = 463;BA.debugLine="Dim base_discount_invoiced As Int = root.Getdefau";
Debug.ShouldStop(16384);
_base_discount_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 466;BA.debugLine="mDatosCabeceraPedidoCliente.ImporteTotalFacturado";
Debug.ShouldStop(131072);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("ImporteTotalFacturadoSinIVA" /*RemoteObject*/ ,BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_invoiced"))),(Object)(RemoteObject.createImmutable((0))))));
 BA.debugLineNum = 468;BA.debugLine="Dim base_to_global_rate As Int = root.Getdefault(";
Debug.ShouldStop(524288);
_base_to_global_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_to_global_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_to_global_rate", _base_to_global_rate);Debug.locals.put("base_to_global_rate", _base_to_global_rate);
 BA.debugLineNum = 469;BA.debugLine="Dim customer_is_guest As Int = root.Getdefault(\"c";
Debug.ShouldStop(1048576);
_customer_is_guest = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_is_guest"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_is_guest", _customer_is_guest);Debug.locals.put("customer_is_guest", _customer_is_guest);
 BA.debugLineNum = 473;BA.debugLine="Dim global_currency_code As String = root.Get(\"gl";
Debug.ShouldStop(16777216);
_global_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("global_currency_code")))));Debug.locals.put("global_currency_code", _global_currency_code);Debug.locals.put("global_currency_code", _global_currency_code);
 BA.debugLineNum = 474;BA.debugLine="Dim status As String = root.Get(\"status\")";
Debug.ShouldStop(33554432);
_status = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status")))));Debug.locals.put("status", _status);Debug.locals.put("status", _status);
 BA.debugLineNum = 475;BA.debugLine="Dim is_virtual As Int = root.Getdefault(\"is_virtu";
Debug.ShouldStop(67108864);
_is_virtual = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_virtual"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_virtual", _is_virtual);Debug.locals.put("is_virtual", _is_virtual);
 BA.debugLineNum = 476;BA.debugLine="Dim base_total_invoiced_cost As Int = root.Getdef";
Debug.ShouldStop(134217728);
_base_total_invoiced_cost = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_invoiced_cost"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);Debug.locals.put("base_total_invoiced_cost", _base_total_invoiced_cost);
 BA.debugLineNum = 477;BA.debugLine="Dim discount_tax_compensation_invoiced As Int = r";
Debug.ShouldStop(268435456);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 478;BA.debugLine="Dim status_histories As List = root.Get(\"status_h";
Debug.ShouldStop(536870912);
_status_histories = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_status_histories = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("status_histories")))));Debug.locals.put("status_histories", _status_histories);Debug.locals.put("status_histories", _status_histories);
 BA.debugLineNum = 479;BA.debugLine="Dim store_currency_code As String = root.Get(\"sto";
Debug.ShouldStop(1073741824);
_store_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_currency_code")))));Debug.locals.put("store_currency_code", _store_currency_code);Debug.locals.put("store_currency_code", _store_currency_code);
 BA.debugLineNum = 480;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
Debug.ShouldStop(-2147483648);
_created_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 482;BA.debugLine="mDatosCabeceraPedidoCliente.FechaCreacion=DateTim";
Debug.ShouldStop(2);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("FechaCreacion" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_created_at)));
 BA.debugLineNum = 484;BA.debugLine="Dim total_item_count As Int = root.Get(\"total_ite";
Debug.ShouldStop(8);
_total_item_count = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_item_count")))));Debug.locals.put("total_item_count", _total_item_count);Debug.locals.put("total_item_count", _total_item_count);
 BA.debugLineNum = 485;BA.debugLine="Dim shipping_tax_amount As Int = root.Getdefault(";
Debug.ShouldStop(16);
_shipping_tax_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 486;BA.debugLine="Dim store_to_base_rate As Int = root.Getdefault(\"";
Debug.ShouldStop(32);
_store_to_base_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_base_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_to_base_rate", _store_to_base_rate);Debug.locals.put("store_to_base_rate", _store_to_base_rate);
 BA.debugLineNum = 487;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
Debug.ShouldStop(64);
_updated_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 489;BA.debugLine="mDatosCabeceraPedidoCliente.FechaActualizacion=Da";
Debug.ShouldStop(256);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("FechaActualizacion" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_updated_at)));
 BA.debugLineNum = 491;BA.debugLine="Dim base_shipping_discount_amount As Int = root.G";
Debug.ShouldStop(1024);
_base_shipping_discount_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 492;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
Debug.ShouldStop(2048);
_store_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 493;BA.debugLine="mDatosCabeceraPedidoCliente.IDTienda=store_id";
Debug.ShouldStop(4096);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("IDTienda" /*RemoteObject*/ ,_store_id);
 BA.debugLineNum = 494;BA.debugLine="Dim store_name As String = root.Get(\"store_name\")";
Debug.ShouldStop(8192);
_store_name = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_name")))));Debug.locals.put("store_name", _store_name);Debug.locals.put("store_name", _store_name);
 BA.debugLineNum = 497;BA.debugLine="mDatosCabeceraPedidoCliente.NombreTienda=Utilidad";
Debug.ShouldStop(65536);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("NombreTienda" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select name from tblB2BStores where id=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDTienda" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 499;BA.debugLine="Dim grand_total As Double = root.Get(\"grand_total";
Debug.ShouldStop(262144);
_grand_total = BA.numberCast(double.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("grand_total")))));Debug.locals.put("grand_total", _grand_total);Debug.locals.put("grand_total", _grand_total);
 BA.debugLineNum = 500;BA.debugLine="Dim base_currency_code As String = root.Get(\"base";
Debug.ShouldStop(524288);
_base_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_currency_code")))));Debug.locals.put("base_currency_code", _base_currency_code);Debug.locals.put("base_currency_code", _base_currency_code);
 BA.debugLineNum = 502;BA.debugLine="mDatosCabeceraPedidoCliente.Moneda=base_currency_";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("Moneda" /*RemoteObject*/ ,_base_currency_code);
 BA.debugLineNum = 504;BA.debugLine="Dim base_total_paid As Double = root.Getdefault(\"";
Debug.ShouldStop(8388608);
_base_total_paid = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_paid"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_paid", _base_total_paid);Debug.locals.put("base_total_paid", _base_total_paid);
 BA.debugLineNum = 505;BA.debugLine="Dim base_tax_amount As Double = root.Getdefault(\"";
Debug.ShouldStop(16777216);
_base_tax_amount = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 507;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
Debug.ShouldStop(67108864);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 508;BA.debugLine="Dim total_due As Int = root.Get(\"total_due\")";
Debug.ShouldStop(134217728);
_total_due = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total_due")))));Debug.locals.put("total_due", _total_due);Debug.locals.put("total_due", _total_due);
 BA.debugLineNum = 509;BA.debugLine="Dim total_qty_ordered As Int = root.Getdefault(\"t";
Debug.ShouldStop(268435456);
_total_qty_ordered = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("total_qty_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("total_qty_ordered", _total_qty_ordered);Debug.locals.put("total_qty_ordered", _total_qty_ordered);
 BA.debugLineNum = 510;BA.debugLine="Dim base_discount_amount As Int = root.Getdefault";
Debug.ShouldStop(536870912);
_base_discount_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 512;BA.debugLine="Dim carts As List = extension_attributes.Get(\"car";
Debug.ShouldStop(-2147483648);
_carts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_carts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("carts")))));Debug.locals.put("carts", _carts);Debug.locals.put("carts", _carts);
 BA.debugLineNum = 513;BA.debugLine="For Each mCart As Map In carts";
Debug.ShouldStop(1);
if (true) break;

case 37:
//for
this.state = 40;
_mcart = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group150 = _carts;
index150 = 0;
groupLen150 = group150.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mCart", _mcart);
this.state = 172;
if (true) break;

case 172:
//C
this.state = 40;
if (index150 < groupLen150) {
this.state = 39;
_mcart = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group150.runMethod(false,"Get",index150));Debug.locals.put("mCart", _mcart);}
if (true) break;

case 173:
//C
this.state = 172;
index150++;
Debug.locals.put("mCart", _mcart);
if (true) break;

case 39:
//C
this.state = 173;
 BA.debugLineNum = 514;BA.debugLine="Log(mCart)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","849086674",BA.ObjectToString(_mcart),0);
 if (true) break;
if (true) break;
Debug.locals.put("mCart", _mcart);
;
 BA.debugLineNum = 516;BA.debugLine="If extension_attributes.ContainsKey(\"payment_addi";
Debug.ShouldStop(8);

case 40:
//if
this.state = 47;
if (_extension_attributes.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("payment_additional_info")))).<Boolean>get().booleanValue()) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 517;BA.debugLine="Dim payment_additional_info As List = extension_";
Debug.ShouldStop(16);
_payment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_payment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("payment_additional_info")))));Debug.locals.put("payment_additional_info", _payment_additional_info);Debug.locals.put("payment_additional_info", _payment_additional_info);
 BA.debugLineNum = 518;BA.debugLine="For Each colpayment_additional_info As Map In pa";
Debug.ShouldStop(32);
if (true) break;

case 43:
//for
this.state = 46;
_colpayment_additional_info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group155 = _payment_additional_info;
index155 = 0;
groupLen155 = group155.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
this.state = 174;
if (true) break;

case 174:
//C
this.state = 46;
if (index155 < groupLen155) {
this.state = 45;
_colpayment_additional_info = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group155.runMethod(false,"Get",index155));Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);}
if (true) break;

case 175:
//C
this.state = 174;
index155++;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
if (true) break;

case 45:
//C
this.state = 175;
 BA.debugLineNum = 519;BA.debugLine="Dim value As String = colpayment_additional_inf";
Debug.ShouldStop(64);
_value = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 520;BA.debugLine="Dim key As String = colpayment_additional_info.";
Debug.ShouldStop(128);
_key = BA.ObjectToString(_colpayment_additional_info.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("key")))));Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
Debug.locals.put("colpayment_additional_info", _colpayment_additional_info);
;
 if (true) break;
;
 BA.debugLineNum = 523;BA.debugLine="If extension_attributes.ContainsKey(\"applied_taxe";
Debug.ShouldStop(1024);

case 47:
//if
this.state = 54;
if (_extension_attributes.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("applied_taxes")))).<Boolean>get().booleanValue()) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 524;BA.debugLine="Dim applied_taxes As List = extension_attributes";
Debug.ShouldStop(2048);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 525;BA.debugLine="For Each colapplied_taxes As Map In applied_taxe";
Debug.ShouldStop(4096);
if (true) break;

case 50:
//for
this.state = 53;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group162 = _applied_taxes;
index162 = 0;
groupLen162 = group162.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 176;
if (true) break;

case 176:
//C
this.state = 53;
if (index162 < groupLen162) {
this.state = 52;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group162.runMethod(false,"Get",index162));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 177:
//C
this.state = 176;
index162++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 52:
//C
this.state = 177;
 BA.debugLineNum = 526;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"am";
Debug.ShouldStop(8192);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 527;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"code";
Debug.ShouldStop(16384);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 528;BA.debugLine="Dim base_amount As Double = colapplied_taxes.Ge";
Debug.ShouldStop(32768);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 529;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"tit";
Debug.ShouldStop(65536);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 530;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"p";
Debug.ShouldStop(131072);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 if (true) break;
;
 BA.debugLineNum = 533;BA.debugLine="If extension_attributes.ContainsKey(\"item_applied";
Debug.ShouldStop(1048576);

case 54:
//if
this.state = 65;
if (_extension_attributes.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("item_applied_taxes")))).<Boolean>get().booleanValue()) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
 BA.debugLineNum = 534;BA.debugLine="Dim item_applied_taxes As List = extension_attri";
Debug.ShouldStop(2097152);
_item_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_item_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_applied_taxes")))));Debug.locals.put("item_applied_taxes", _item_applied_taxes);Debug.locals.put("item_applied_taxes", _item_applied_taxes);
 BA.debugLineNum = 535;BA.debugLine="For Each colitem_applied_taxes As Map In item_ap";
Debug.ShouldStop(4194304);
if (true) break;

case 57:
//for
this.state = 64;
_colitem_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group172 = _item_applied_taxes;
index172 = 0;
groupLen172 = group172.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
this.state = 178;
if (true) break;

case 178:
//C
this.state = 64;
if (index172 < groupLen172) {
this.state = 59;
_colitem_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group172.runMethod(false,"Get",index172));Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);}
if (true) break;

case 179:
//C
this.state = 178;
index172++;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 536;BA.debugLine="Dim applied_taxes As List = colitem_applied_tax";
Debug.ShouldStop(8388608);
_applied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_applied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_taxes")))));Debug.locals.put("applied_taxes", _applied_taxes);Debug.locals.put("applied_taxes", _applied_taxes);
 BA.debugLineNum = 537;BA.debugLine="For Each colapplied_taxes As Map In applied_tax";
Debug.ShouldStop(16777216);
if (true) break;

case 60:
//for
this.state = 63;
_colapplied_taxes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group174 = _applied_taxes;
index174 = 0;
groupLen174 = group174.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
this.state = 180;
if (true) break;

case 180:
//C
this.state = 63;
if (index174 < groupLen174) {
this.state = 62;
_colapplied_taxes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group174.runMethod(false,"Get",index174));Debug.locals.put("colapplied_taxes", _colapplied_taxes);}
if (true) break;

case 181:
//C
this.state = 180;
index174++;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
if (true) break;

case 62:
//C
this.state = 181;
 BA.debugLineNum = 538;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"a";
Debug.ShouldStop(33554432);
_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount")))));Debug.locals.put("amount", _amount);Debug.locals.put("amount", _amount);
 BA.debugLineNum = 539;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"cod";
Debug.ShouldStop(67108864);
_code = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("code")))));Debug.locals.put("code", _code);Debug.locals.put("code", _code);
 BA.debugLineNum = 540;BA.debugLine="Dim base_amount As Double = colapplied_taxes.G";
Debug.ShouldStop(134217728);
_base_amount = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount")))));Debug.locals.put("base_amount", _base_amount);Debug.locals.put("base_amount", _base_amount);
 BA.debugLineNum = 541;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"ti";
Debug.ShouldStop(268435456);
_title = BA.ObjectToString(_colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))));Debug.locals.put("title", _title);Debug.locals.put("title", _title);
 BA.debugLineNum = 542;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"";
Debug.ShouldStop(536870912);
_percent = BA.numberCast(double.class, _colapplied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("percent")))));Debug.locals.put("percent", _percent);Debug.locals.put("percent", _percent);
 if (true) break;
if (true) break;

case 63:
//C
this.state = 179;
Debug.locals.put("colapplied_taxes", _colapplied_taxes);
;
 BA.debugLineNum = 544;BA.debugLine="Dim TipoImpuestoAplicado As String = colitem_ap";
Debug.ShouldStop(-2147483648);
_tipoimpuestoaplicado = BA.ObjectToString(_colitem_applied_taxes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("TipoImpuestoAplicado", _tipoimpuestoaplicado);Debug.locals.put("TipoImpuestoAplicado", _tipoimpuestoaplicado);
 if (true) break;
if (true) break;

case 64:
//C
this.state = 65;
Debug.locals.put("colitem_applied_taxes", _colitem_applied_taxes);
;
 if (true) break;

case 65:
//C
this.state = 66;
;
 BA.debugLineNum = 548;BA.debugLine="Dim converting_from_quote As String = extension_a";
Debug.ShouldStop(8);
_converting_from_quote = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("converting_from_quote")))));Debug.locals.put("converting_from_quote", _converting_from_quote);Debug.locals.put("converting_from_quote", _converting_from_quote);
 BA.debugLineNum = 549;BA.debugLine="Dim contacts As List = extension_attributes.Get(\"";
Debug.ShouldStop(16);
_contacts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_contacts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contacts")))));Debug.locals.put("contacts", _contacts);Debug.locals.put("contacts", _contacts);
 BA.debugLineNum = 550;BA.debugLine="For Each mContacts As Map In contacts";
Debug.ShouldStop(32);
if (true) break;

case 66:
//for
this.state = 69;
_mcontacts = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group186 = _contacts;
index186 = 0;
groupLen186 = group186.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mContacts", _mcontacts);
this.state = 182;
if (true) break;

case 182:
//C
this.state = 69;
if (index186 < groupLen186) {
this.state = 68;
_mcontacts = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group186.runMethod(false,"Get",index186));Debug.locals.put("mContacts", _mcontacts);}
if (true) break;

case 183:
//C
this.state = 182;
index186++;
Debug.locals.put("mContacts", _mcontacts);
if (true) break;

case 68:
//C
this.state = 183;
 BA.debugLineNum = 551;BA.debugLine="Log(mContacts)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","849086711",BA.ObjectToString(_mcontacts),0);
 if (true) break;
if (true) break;

case 69:
//C
this.state = 70;
Debug.locals.put("mContacts", _mcontacts);
;
 BA.debugLineNum = 553;BA.debugLine="Dim shipping_description As String = root.Get(\"sh";
Debug.ShouldStop(256);
_shipping_description = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_description")))));Debug.locals.put("shipping_description", _shipping_description);Debug.locals.put("shipping_description", _shipping_description);
 BA.debugLineNum = 554;BA.debugLine="Dim store_to_order_rate As Int = root.Getdefault(";
Debug.ShouldStop(512);
_store_to_order_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_to_order_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_to_order_rate", _store_to_order_rate);Debug.locals.put("store_to_order_rate", _store_to_order_rate);
 BA.debugLineNum = 555;BA.debugLine="Dim shipping_amount As Int = root.Getdefault(\"shi";
Debug.ShouldStop(1024);
_shipping_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 556;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
Debug.ShouldStop(2048);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 557;BA.debugLine="Dim subtotal_invoiced As Int = root.Getdefault(\"s";
Debug.ShouldStop(4096);
_subtotal_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("subtotal_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);Debug.locals.put("subtotal_invoiced", _subtotal_invoiced);
 BA.debugLineNum = 559;BA.debugLine="mDatosCabeceraPedidoCliente.ImporteTotalFacturado";
Debug.ShouldStop(16384);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("ImporteTotalFacturadoSinIVA" /*RemoteObject*/ ,BA.numberCast(double.class, _subtotal_invoiced));
 BA.debugLineNum = 561;BA.debugLine="Dim base_to_order_rate As Int = root.Getdefault(\"";
Debug.ShouldStop(65536);
_base_to_order_rate = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_to_order_rate"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_to_order_rate", _base_to_order_rate);Debug.locals.put("base_to_order_rate", _base_to_order_rate);
 BA.debugLineNum = 562;BA.debugLine="Dim base_subtotal As Int = root.Getdefault(\"base_";
Debug.ShouldStop(131072);
_base_subtotal = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal", _base_subtotal);Debug.locals.put("base_subtotal", _base_subtotal);
 BA.debugLineNum = 564;BA.debugLine="mDatosCabeceraPedidoCliente.ImporteTotalSinIVA=ba";
Debug.ShouldStop(524288);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("ImporteTotalSinIVA" /*RemoteObject*/ ,BA.numberCast(double.class, _base_subtotal));
 BA.debugLineNum = 566;BA.debugLine="Dim protect_code As String = root.Get(\"protect_co";
Debug.ShouldStop(2097152);
_protect_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("protect_code")))));Debug.locals.put("protect_code", _protect_code);Debug.locals.put("protect_code", _protect_code);
 BA.debugLineNum = 567;BA.debugLine="Dim customer_dob As String = root.Get(\"customer_d";
Debug.ShouldStop(4194304);
_customer_dob = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("customer_dob")))));Debug.locals.put("customer_dob", _customer_dob);Debug.locals.put("customer_dob", _customer_dob);
 BA.debugLineNum = 568;BA.debugLine="Dim base_total_due As Int = root.Getdefault(\"base";
Debug.ShouldStop(8388608);
_base_total_due = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_total_due"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_total_due", _base_total_due);Debug.locals.put("base_total_due", _base_total_due);
 BA.debugLineNum = 569;BA.debugLine="Dim base_subtotal_incl_tax As Double = root.Getde";
Debug.ShouldStop(16777216);
_base_subtotal_incl_tax = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_subtotal_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);Debug.locals.put("base_subtotal_incl_tax", _base_subtotal_incl_tax);
 BA.debugLineNum = 570;BA.debugLine="Dim customer_id As Int = root.Getdefault(\"custome";
Debug.ShouldStop(33554432);
_customer_id = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_id", _customer_id);Debug.locals.put("customer_id", _customer_id);
 BA.debugLineNum = 572;BA.debugLine="mDatosCabeceraPedidoCliente.IDCliente=customer_id";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("IDCliente" /*RemoteObject*/ ,_customer_id);
 BA.debugLineNum = 573;BA.debugLine="mDatosCabeceraPedidoCliente.CodigoClienteERP=Util";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("CodigoClienteERP" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select Code from tblB2BClientes where id=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDCliente" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 574;BA.debugLine="mDatosCabeceraPedidoCliente.NombreCliente=Utilida";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("NombreCliente" /*RemoteObject*/ ,parent._utilidades.runMethod(true,"_fixnull" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select Company from tblB2BClientes where id=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDCliente" /*RemoteObject*/ ))})))))))));
 BA.debugLineNum = 576;BA.debugLine="Dim customer_group_id As Int = root.Getdefault(\"c";
Debug.ShouldStop(-2147483648);
_customer_group_id = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_group_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_group_id", _customer_group_id);Debug.locals.put("customer_group_id", _customer_group_id);
 BA.debugLineNum = 578;BA.debugLine="mDatosCabeceraPedidoCliente.IDGRP=customer_group_";
Debug.ShouldStop(2);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("IDGRP" /*RemoteObject*/ ,_customer_group_id);
 BA.debugLineNum = 580;BA.debugLine="Dim discount_invoiced As Int = root.Getdefault(\"d";
Debug.ShouldStop(8);
_discount_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 581;BA.debugLine="Dim order_currency_code As String = root.Get(\"ord";
Debug.ShouldStop(16);
_order_currency_code = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_currency_code")))));Debug.locals.put("order_currency_code", _order_currency_code);Debug.locals.put("order_currency_code", _order_currency_code);
 BA.debugLineNum = 583;BA.debugLine="mDatosCabeceraPedidoCliente.Moneda=order_currency";
Debug.ShouldStop(64);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("Moneda" /*RemoteObject*/ ,_order_currency_code);
 BA.debugLineNum = 585;BA.debugLine="Dim base_tax_invoiced As Double = root.Getdefault";
Debug.ShouldStop(256);
_base_tax_invoiced = BA.numberCast(double.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 BA.debugLineNum = 586;BA.debugLine="Dim customer_gender As Int = root.Getdefault(\"cus";
Debug.ShouldStop(512);
_customer_gender = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_gender"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("customer_gender", _customer_gender);Debug.locals.put("customer_gender", _customer_gender);
 BA.debugLineNum = 587;BA.debugLine="Dim shipping_incl_tax As Int = root.Getdefault(\"s";
Debug.ShouldStop(1024);
_shipping_incl_tax = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 588;BA.debugLine="Dim base_shipping_invoiced As Int = root.Getdefau";
Debug.ShouldStop(2048);
_base_shipping_invoiced = BA.numberCast(int.class, _root.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 BA.debugLineNum = 590;BA.debugLine="Dim items As List = root.Get(\"items\")";
Debug.ShouldStop(8192);
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("items", _items);Debug.locals.put("items", _items);
 BA.debugLineNum = 598;BA.debugLine="Dim LineaPedido As Int";
Debug.ShouldStop(2097152);
_lineapedido = RemoteObject.createImmutable(0);Debug.locals.put("LineaPedido", _lineapedido);
 BA.debugLineNum = 599;BA.debugLine="Dim lstProductosConfigurables As List";
Debug.ShouldStop(4194304);
_lstproductosconfigurables = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstProductosConfigurables", _lstproductosconfigurables);
 BA.debugLineNum = 600;BA.debugLine="lstProductosConfigurables.Initialize";
Debug.ShouldStop(8388608);
_lstproductosconfigurables.runVoidMethod ("Initialize");
 BA.debugLineNum = 602;BA.debugLine="For Each colitems As Map In items";
Debug.ShouldStop(33554432);
if (true) break;

case 70:
//for
this.state = 132;
_colitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group219 = _items;
index219 = 0;
groupLen219 = group219.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colitems", _colitems);
this.state = 184;
if (true) break;

case 184:
//C
this.state = 132;
if (index219 < groupLen219) {
this.state = 72;
_colitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group219.runMethod(false,"Get",index219));Debug.locals.put("colitems", _colitems);}
if (true) break;

case 185:
//C
this.state = 184;
index219++;
Debug.locals.put("colitems", _colitems);
if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 604;BA.debugLine="Dim DatosLineaPedidoClienteB2B As TipoDatosLinea";
Debug.ShouldStop(134217728);
_datoslineapedidoclienteb2b = RemoteObject.createNew ("b4j.docU.cb2bfichapedidocliente._tipodatoslineapedidoclienteb2b");Debug.locals.put("DatosLineaPedidoClienteB2B", _datoslineapedidoclienteb2b);
 BA.debugLineNum = 605;BA.debugLine="DatosLineaPedidoClienteB2B.Initialize";
Debug.ShouldStop(268435456);
_datoslineapedidoclienteb2b.runVoidMethod ("Initialize");
 BA.debugLineNum = 607;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
Debug.ShouldStop(1073741824);
_sku = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 608;BA.debugLine="DatosLineaPedidoClienteB2B.ItemSKU=sku";
Debug.ShouldStop(-2147483648);
_datoslineapedidoclienteb2b.setField ("ItemSKU" /*RemoteObject*/ ,_sku);
 BA.debugLineNum = 610;BA.debugLine="Dim product_type As String = colitems.Get(\"produ";
Debug.ShouldStop(2);
_product_type = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 611;BA.debugLine="DatosLineaPedidoClienteB2B.TipoItem=product_type";
Debug.ShouldStop(4);
_datoslineapedidoclienteb2b.setField ("TipoItem" /*RemoteObject*/ ,_product_type);
 BA.debugLineNum = 624;BA.debugLine="If DatosLineaPedidoClienteB2B.TipoItem=\"configur";
Debug.ShouldStop(32768);
if (true) break;

case 73:
//if
this.state = 78;
if (RemoteObject.solveBoolean("=",_datoslineapedidoclienteb2b.getField(true,"TipoItem" /*RemoteObject*/ ),BA.ObjectToString("configurable"))) { 
this.state = 75;
;}if (true) break;

case 75:
//C
this.state = 78;
this.state = 185;
if (true) break;;
if (true) break;

case 78:
//C
this.state = 79;
;
 BA.debugLineNum = 629;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(\"";
Debug.ShouldStop(1048576);
_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_amount", _tax_amount);Debug.locals.put("tax_amount", _tax_amount);
 BA.debugLineNum = 630;BA.debugLine="DatosLineaPedidoClienteB2B.ImporteIVA=tax_amount";
Debug.ShouldStop(2097152);
_datoslineapedidoclienteb2b.setField ("ImporteIVA" /*RemoteObject*/ ,_tax_amount);
 BA.debugLineNum = 631;BA.debugLine="Dim tax_invoiced As Double = colitems.Getdefault";
Debug.ShouldStop(4194304);
_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_invoiced", _tax_invoiced);Debug.locals.put("tax_invoiced", _tax_invoiced);
 BA.debugLineNum = 632;BA.debugLine="Dim original_price As Double = colitems.Getdefau";
Debug.ShouldStop(8388608);
_original_price = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("original_price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("original_price", _original_price);Debug.locals.put("original_price", _original_price);
 BA.debugLineNum = 633;BA.debugLine="Dim free_shipping As Int = colitems.Getdefault(\"";
Debug.ShouldStop(16777216);
_free_shipping = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("free_shipping"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("free_shipping", _free_shipping);Debug.locals.put("free_shipping", _free_shipping);
 BA.debugLineNum = 634;BA.debugLine="Dim base_discount_tax_compensation_invoiced As I";
Debug.ShouldStop(33554432);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 635;BA.debugLine="Dim discount_amount As Double = colitems.Getdefa";
Debug.ShouldStop(67108864);
_discount_amount = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 636;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault(";
Debug.ShouldStop(134217728);
_tax_percent = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("tax_percent", _tax_percent);Debug.locals.put("tax_percent", _tax_percent);
 BA.debugLineNum = 637;BA.debugLine="DatosLineaPedidoClienteB2B.TipoIVA=tax_percent";
Debug.ShouldStop(268435456);
_datoslineapedidoclienteb2b.setField ("TipoIVA" /*RemoteObject*/ ,_tax_percent);
 BA.debugLineNum = 638;BA.debugLine="Dim price_incl_tax As Double = colitems.Getdefau";
Debug.ShouldStop(536870912);
_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("price_incl_tax", _price_incl_tax);Debug.locals.put("price_incl_tax", _price_incl_tax);
 BA.debugLineNum = 639;BA.debugLine="Dim price As Double = colitems.Getdefault(\"price";
Debug.ShouldStop(1073741824);
_price = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 640;BA.debugLine="DatosLineaPedidoClienteB2B.Precio=price";
Debug.ShouldStop(-2147483648);
_datoslineapedidoclienteb2b.setField ("Precio" /*RemoteObject*/ ,_price);
 BA.debugLineNum = 641;BA.debugLine="Dim product_id As Int = colitems.Get(\"product_id";
Debug.ShouldStop(1);
_product_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_id")))));Debug.locals.put("product_id", _product_id);Debug.locals.put("product_id", _product_id);
 BA.debugLineNum = 642;BA.debugLine="DatosLineaPedidoClienteB2B.IDProductoB2B=product";
Debug.ShouldStop(2);
_datoslineapedidoclienteb2b.setField ("IDProductoB2B" /*RemoteObject*/ ,_product_id);
 BA.debugLineNum = 643;BA.debugLine="Dim base_row_total As Double = colitems.Getdefau";
Debug.ShouldStop(4);
_base_row_total = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_row_total"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_row_total", _base_row_total);Debug.locals.put("base_row_total", _base_row_total);
 BA.debugLineNum = 645;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
Debug.ShouldStop(16);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 646;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
Debug.ShouldStop(32);
_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 647;BA.debugLine="Dim base_original_price As Int = colitems.Getdef";
Debug.ShouldStop(64);
_base_original_price = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_original_price"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_original_price", _base_original_price);Debug.locals.put("base_original_price", _base_original_price);
 BA.debugLineNum = 648;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weight";
Debug.ShouldStop(128);
_row_weight = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_weight")))));Debug.locals.put("row_weight", _row_weight);Debug.locals.put("row_weight", _row_weight);
 BA.debugLineNum = 649;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
Debug.ShouldStop(256);
_applied_rule_ids = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 650;BA.debugLine="Dim base_amount_refunded As Int = colitems.Getde";
Debug.ShouldStop(512);
_base_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_amount_refunded"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_amount_refunded", _base_amount_refunded);Debug.locals.put("base_amount_refunded", _base_amount_refunded);
 BA.debugLineNum = 651;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Get";
Debug.ShouldStop(1024);
_base_price_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_price_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);
 BA.debugLineNum = 652;BA.debugLine="Dim no_discount As Int = colitems.Getdefault(\"no";
Debug.ShouldStop(2048);
_no_discount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("no_discount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("no_discount", _no_discount);Debug.locals.put("no_discount", _no_discount);
 BA.debugLineNum = 653;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
Debug.ShouldStop(4096);
_name = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 654;BA.debugLine="DatosLineaPedidoClienteB2B.DescripcionProductoB2";
Debug.ShouldStop(8192);
_datoslineapedidoclienteb2b.setField ("DescripcionProductoB2B" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 655;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
Debug.ShouldStop(16384);
_base_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 656;BA.debugLine="Dim discount_percent As Int = colitems.Getdefaul";
Debug.ShouldStop(32768);
_discount_percent = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_percent"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_percent", _discount_percent);Debug.locals.put("discount_percent", _discount_percent);
 BA.debugLineNum = 657;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
Debug.ShouldStop(65536);
_order_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_id")))));Debug.locals.put("order_id", _order_id);Debug.locals.put("order_id", _order_id);
 BA.debugLineNum = 658;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(131072);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 659;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
Debug.ShouldStop(262144);
_created_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 660;BA.debugLine="Dim qty_shipped As Int = colitems.Getdefault(\"qt";
Debug.ShouldStop(524288);
_qty_shipped = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("qty_shipped"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("qty_shipped", _qty_shipped);Debug.locals.put("qty_shipped", _qty_shipped);
 BA.debugLineNum = 661;BA.debugLine="DatosLineaPedidoClienteB2B.QtyEnviada=qty_shippe";
Debug.ShouldStop(1048576);
_datoslineapedidoclienteb2b.setField ("QtyEnviada" /*RemoteObject*/ ,_qty_shipped);
 BA.debugLineNum = 662;BA.debugLine="Dim qty_ordered As Int = colitems.Getdefault(\"qt";
Debug.ShouldStop(2097152);
_qty_ordered = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("qty_ordered"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("qty_ordered", _qty_ordered);Debug.locals.put("qty_ordered", _qty_ordered);
 BA.debugLineNum = 663;BA.debugLine="DatosLineaPedidoClienteB2B.QtyPedida=qty_ordered";
Debug.ShouldStop(4194304);
_datoslineapedidoclienteb2b.setField ("QtyPedida" /*RemoteObject*/ ,_qty_ordered);
 BA.debugLineNum = 664;BA.debugLine="Dim row_total As Int = colitems.Getdefault(\"row_";
Debug.ShouldStop(8388608);
_row_total = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("row_total"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("row_total", _row_total);Debug.locals.put("row_total", _row_total);
 BA.debugLineNum = 665;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_canc";
Debug.ShouldStop(16777216);
_qty_canceled = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_canceled")))));Debug.locals.put("qty_canceled", _qty_canceled);Debug.locals.put("qty_canceled", _qty_canceled);
 BA.debugLineNum = 666;BA.debugLine="Dim Talla As String";
Debug.ShouldStop(33554432);
_talla = RemoteObject.createImmutable("");Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 667;BA.debugLine="Dim product_option As Map = IIf(colitems.Get(\"pr";
Debug.ShouldStop(67108864);
_product_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_product_option = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), ((RemoteObject.solveBoolean("n",_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))))) ? ((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("")),(RemoteObject.createImmutable(""))})).getObject())) : (_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))))));Debug.locals.put("product_option", _product_option);Debug.locals.put("product_option", _product_option);
 BA.debugLineNum = 668;BA.debugLine="Dim ItemProductOptionExtension_attributes As Map";
Debug.ShouldStop(134217728);
_itemproductoptionextension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_itemproductoptionextension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _product_option.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("ItemProductOptionExtension_attributes", _itemproductoptionextension_attributes);Debug.locals.put("ItemProductOptionExtension_attributes", _itemproductoptionextension_attributes);
 BA.debugLineNum = 669;BA.debugLine="If ItemProductOptionExtension_attributes.IsIniti";
Debug.ShouldStop(268435456);
if (true) break;

case 79:
//if
this.state = 90;
if (_itemproductoptionextension_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
 BA.debugLineNum = 670;BA.debugLine="Dim configurable_item_options As List = ItemPro";
Debug.ShouldStop(536870912);
_configurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _itemproductoptionextension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("configurable_item_options", _configurable_item_options);Debug.locals.put("configurable_item_options", _configurable_item_options);
 BA.debugLineNum = 672;BA.debugLine="For Each colconfigurable_item_options As Map In";
Debug.ShouldStop(-2147483648);
if (true) break;

case 82:
//for
this.state = 89;
_colconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group268 = _configurable_item_options;
index268 = 0;
groupLen268 = group268.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
this.state = 186;
if (true) break;

case 186:
//C
this.state = 89;
if (index268 < groupLen268) {
this.state = 84;
_colconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group268.runMethod(false,"Get",index268));Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);}
if (true) break;

case 187:
//C
this.state = 186;
index268++;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
if (true) break;

case 84:
//C
this.state = 85;
 BA.debugLineNum = 673;BA.debugLine="Dim option_value As Int = colconfigurable_item";
Debug.ShouldStop(1);
_option_value = BA.numberCast(int.class, _colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 674;BA.debugLine="Dim option_id As String = colconfigurable_item";
Debug.ShouldStop(2);
_option_id = BA.ObjectToString(_colconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 BA.debugLineNum = 675;BA.debugLine="If option_id=142 Then";
Debug.ShouldStop(4);
if (true) break;

case 85:
//if
this.state = 88;
if (RemoteObject.solveBoolean("=",_option_id,BA.NumberToString(142))) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
 BA.debugLineNum = 676;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select lab";
Debug.ShouldStop(8);
_talla = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select label from tblB2BAtributoSizeProducts where value=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_option_value)})))));Debug.locals.put("Talla", _talla);
 if (true) break;

case 88:
//C
this.state = 187;
;
 if (true) break;
if (true) break;

case 89:
//C
this.state = 90;
Debug.locals.put("colconfigurable_item_options", _colconfigurable_item_options);
;
 if (true) break;

case 90:
//C
this.state = 91;
;
 BA.debugLineNum = 680;BA.debugLine="Dim ItemExtensionAttributes As Map=colitems.Get(";
Debug.ShouldStop(128);
_itemextensionattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_itemextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("ItemExtensionAttributes", _itemextensionattributes);Debug.locals.put("ItemExtensionAttributes", _itemextensionattributes);
 BA.debugLineNum = 681;BA.debugLine="If ItemExtensionAttributes.IsInitialized Then";
Debug.ShouldStop(256);
if (true) break;

case 91:
//if
this.state = 98;
if (_itemextensionattributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 682;BA.debugLine="Dim ItemPgw As Map=ItemExtensionAttributes.Get(";
Debug.ShouldStop(512);
_itempgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_itempgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemextensionattributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("ItemPgw", _itempgw);Debug.locals.put("ItemPgw", _itempgw);
 BA.debugLineNum = 683;BA.debugLine="If ItemPgw.IsInitialized Then";
Debug.ShouldStop(1024);
if (true) break;

case 94:
//if
this.state = 97;
if (_itempgw.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 684;BA.debugLine="Log(ItemPgw)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","849086844",BA.ObjectToString(_itempgw),0);
 BA.debugLineNum = 685;BA.debugLine="DatosLineaPedidoClienteB2B.UNSPSC=ItemPgw.Get(";
Debug.ShouldStop(4096);
_datoslineapedidoclienteb2b.setField ("UNSPSC" /*RemoteObject*/ ,BA.ObjectToString(_itempgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unspsc"))))));
 BA.debugLineNum = 686;BA.debugLine="DatosLineaPedidoClienteB2B.UOMB2B=ItemPgw.Get(";
Debug.ShouldStop(8192);
_datoslineapedidoclienteb2b.setField ("UOMB2B" /*RemoteObject*/ ,BA.ObjectToString(_itempgw.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uom"))))));
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;
;
 BA.debugLineNum = 689;BA.debugLine="If DatosLineaPedidoClienteB2B.UNSPSC=\"\" Then";
Debug.ShouldStop(65536);

case 98:
//if
this.state = 101;
if (RemoteObject.solveBoolean("=",_datoslineapedidoclienteb2b.getField(true,"UNSPSC" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
 if (true) break;

case 101:
//C
this.state = 102;
;
 BA.debugLineNum = 692;BA.debugLine="DatosLineaPedidoClienteB2B.TallaB2B=Talla";
Debug.ShouldStop(524288);
_datoslineapedidoclienteb2b.setField ("TallaB2B" /*RemoteObject*/ ,_talla);
 BA.debugLineNum = 693;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amoun";
Debug.ShouldStop(1048576);
_amount_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount_refunded")))));Debug.locals.put("amount_refunded", _amount_refunded);Debug.locals.put("amount_refunded", _amount_refunded);
 BA.debugLineNum = 694;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
Debug.ShouldStop(2097152);
_updated_at = BA.ObjectToString(_colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 695;BA.debugLine="Dim base_price As Double = colitems.Get(\"base_pr";
Debug.ShouldStop(4194304);
_base_price = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price")))));Debug.locals.put("base_price", _base_price);Debug.locals.put("base_price", _base_price);
 BA.debugLineNum = 696;BA.debugLine="Dim qty_invoiced As Int = colitems.Getdefault(\"q";
Debug.ShouldStop(8388608);
_qty_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("qty_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("qty_invoiced", _qty_invoiced);Debug.locals.put("qty_invoiced", _qty_invoiced);
 BA.debugLineNum = 697;BA.debugLine="Dim row_invoiced As Int = colitems.Getdefault(\"r";
Debug.ShouldStop(16777216);
_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("row_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("row_invoiced", _row_invoiced);Debug.locals.put("row_invoiced", _row_invoiced);
 BA.debugLineNum = 698;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get(";
Debug.ShouldStop(33554432);
_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total_incl_tax")))));Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);
 BA.debugLineNum = 699;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
Debug.ShouldStop(67108864);
_base_tax_amount = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 700;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"store";
Debug.ShouldStop(134217728);
_store_id = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("store_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 702;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
Debug.ShouldStop(536870912);
_item_id = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_id")))));Debug.locals.put("item_id", _item_id);Debug.locals.put("item_id", _item_id);
 BA.debugLineNum = 703;BA.debugLine="DatosLineaPedidoClienteB2B.IDLinea=item_id";
Debug.ShouldStop(1073741824);
_datoslineapedidoclienteb2b.setField ("IDLinea" /*RemoteObject*/ ,_item_id);
 BA.debugLineNum = 704;BA.debugLine="LineaPedido=LineaPedido+1";
Debug.ShouldStop(-2147483648);
_lineapedido = RemoteObject.solve(new RemoteObject[] {_lineapedido,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("LineaPedido", _lineapedido);
 BA.debugLineNum = 705;BA.debugLine="DatosLineaPedidoClienteB2B.LineaPedido=LineaPedi";
Debug.ShouldStop(1);
_datoslineapedidoclienteb2b.setField ("LineaPedido" /*RemoteObject*/ ,_lineapedido);
 BA.debugLineNum = 706;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
Debug.ShouldStop(2);
_base_discount_amount = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 707;BA.debugLine="Dim base_row_total_incl_tax As Double = colitems";
Debug.ShouldStop(4);
_base_row_total_incl_tax = BA.numberCast(double.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total_incl_tax")))));Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);
 BA.debugLineNum = 708;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
Debug.ShouldStop(8);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 710;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_refu";
Debug.ShouldStop(32);
_qty_refunded = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_refunded")))));Debug.locals.put("qty_refunded", _qty_refunded);Debug.locals.put("qty_refunded", _qty_refunded);
 BA.debugLineNum = 711;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"bas";
Debug.ShouldStop(64);
_base_row_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_invoiced")))));Debug.locals.put("base_row_invoiced", _base_row_invoiced);Debug.locals.put("base_row_invoiced", _base_row_invoiced);
 BA.debugLineNum = 712;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault(";
Debug.ShouldStop(128);
_is_qty_decimal = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_qty_decimal"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("is_qty_decimal", _is_qty_decimal);Debug.locals.put("is_qty_decimal", _is_qty_decimal);
 BA.debugLineNum = 713;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
Debug.ShouldStop(256);
_discount_invoiced = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 714;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Getde";
Debug.ShouldStop(512);
_base_tax_invoiced = BA.numberCast(double.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_tax_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 BA.debugLineNum = 716;BA.debugLine="Dim IDParentItem As Int= colitems.Getdefault(\"pa";
Debug.ShouldStop(2048);
_idparentitem = BA.numberCast(int.class, _colitems.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("parent_item_id"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("IDParentItem", _idparentitem);Debug.locals.put("IDParentItem", _idparentitem);
 BA.debugLineNum = 719;BA.debugLine="Dim mParent_item As Map=colitems.Get(\"parent_ite";
Debug.ShouldStop(16384);
_mparent_item = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mparent_item = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colitems.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("parent_item")))));Debug.locals.put("mParent_item", _mparent_item);Debug.locals.put("mParent_item", _mparent_item);
 BA.debugLineNum = 727;BA.debugLine="If mParent_item.IsInitialized Then";
Debug.ShouldStop(4194304);
if (true) break;

case 102:
//if
this.state = 131;
if (_mparent_item.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 104;
}else {
this.state = 130;
}if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 728;BA.debugLine="Log(\"parent_item: \" & mParent_item)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","849086888",RemoteObject.concat(RemoteObject.createImmutable("parent_item: "),_mparent_item),0);
 BA.debugLineNum = 729;BA.debugLine="DatosLineaPedidoClienteB2B.TipoItem=\"SimpleConP";
Debug.ShouldStop(16777216);
_datoslineapedidoclienteb2b.setField ("TipoItem" /*RemoteObject*/ ,BA.ObjectToString("SimpleConPadre"));
 BA.debugLineNum = 730;BA.debugLine="DatosLineaPedidoClienteB2B.Precio=mParent_item.";
Debug.ShouldStop(33554432);
_datoslineapedidoclienteb2b.setField ("Precio" /*RemoteObject*/ ,BA.numberCast(double.class, _mparent_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price"))))));
 BA.debugLineNum = 731;BA.debugLine="DatosLineaPedidoClienteB2B.QtyEnviada=mParent_i";
Debug.ShouldStop(67108864);
_datoslineapedidoclienteb2b.setField ("QtyEnviada" /*RemoteObject*/ ,BA.numberCast(int.class, _mparent_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_shipped"))))));
 BA.debugLineNum = 732;BA.debugLine="DatosLineaPedidoClienteB2B.QtyFacturada=mParent";
Debug.ShouldStop(134217728);
_datoslineapedidoclienteb2b.setField ("QtyFacturada" /*RemoteObject*/ ,BA.numberCast(int.class, _mparent_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_invoiced"))))));
 BA.debugLineNum = 734;BA.debugLine="Dim mProductOptionParentItem As Map=mParent_ite";
Debug.ShouldStop(536870912);
_mproductoptionparentitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mproductoptionparentitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparent_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))));Debug.locals.put("mProductOptionParentItem", _mproductoptionparentitem);Debug.locals.put("mProductOptionParentItem", _mproductoptionparentitem);
 BA.debugLineNum = 735;BA.debugLine="If mProductOptionParentItem.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 105:
//if
this.state = 120;
if (_mproductoptionparentitem.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
 BA.debugLineNum = 736;BA.debugLine="Dim mExtensionAttributesProductOptionParentIte";
Debug.ShouldStop(-2147483648);
_mextensionattributesproductoptionparentitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mextensionattributesproductoptionparentitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mproductoptionparentitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("mExtensionAttributesProductOptionParentItem", _mextensionattributesproductoptionparentitem);Debug.locals.put("mExtensionAttributesProductOptionParentItem", _mextensionattributesproductoptionparentitem);
 BA.debugLineNum = 737;BA.debugLine="If mExtensionAttributesProductOptionParentItem";
Debug.ShouldStop(1);
if (true) break;

case 108:
//if
this.state = 119;
if (_mextensionattributesproductoptionparentitem.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 110;
}if (true) break;

case 110:
//C
this.state = 111;
 BA.debugLineNum = 738;BA.debugLine="Dim configurable_item_options As List =mExten";
Debug.ShouldStop(2);
_configurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_configurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _mextensionattributesproductoptionparentitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("configurable_item_options", _configurable_item_options);Debug.locals.put("configurable_item_options", _configurable_item_options);
 BA.debugLineNum = 739;BA.debugLine="For Each mDataConfigurable_item_options As Ma";
Debug.ShouldStop(4);
if (true) break;

case 111:
//for
this.state = 118;
_mdataconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group321 = _configurable_item_options;
index321 = 0;
groupLen321 = group321.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataConfigurable_item_options", _mdataconfigurable_item_options);
this.state = 188;
if (true) break;

case 188:
//C
this.state = 118;
if (index321 < groupLen321) {
this.state = 113;
_mdataconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group321.runMethod(false,"Get",index321));Debug.locals.put("mDataConfigurable_item_options", _mdataconfigurable_item_options);}
if (true) break;

case 189:
//C
this.state = 188;
index321++;
Debug.locals.put("mDataConfigurable_item_options", _mdataconfigurable_item_options);
if (true) break;

case 113:
//C
this.state = 114;
 BA.debugLineNum = 740;BA.debugLine="Dim option_value As Int = mDataConfigurable_";
Debug.ShouldStop(8);
_option_value = BA.numberCast(int.class, _mdataconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 741;BA.debugLine="Dim option_id As String = mDataConfigurable_";
Debug.ShouldStop(16);
_option_id = BA.ObjectToString(_mdataconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 BA.debugLineNum = 742;BA.debugLine="If option_id=142 Then";
Debug.ShouldStop(32);
if (true) break;

case 114:
//if
this.state = 117;
if (RemoteObject.solveBoolean("=",_option_id,BA.NumberToString(142))) { 
this.state = 116;
}if (true) break;

case 116:
//C
this.state = 117;
 BA.debugLineNum = 743;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select l";
Debug.ShouldStop(64);
_talla = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select label from tblB2BAtributoSizeProducts where value=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_option_value)})))));Debug.locals.put("Talla", _talla);
 BA.debugLineNum = 744;BA.debugLine="DatosLineaPedidoClienteB2B.TallaB2B=Talla";
Debug.ShouldStop(128);
_datoslineapedidoclienteb2b.setField ("TallaB2B" /*RemoteObject*/ ,_talla);
 if (true) break;

case 117:
//C
this.state = 189;
;
 if (true) break;
if (true) break;

case 118:
//C
this.state = 119;
Debug.locals.put("mDataConfigurable_item_options", _mdataconfigurable_item_options);
;
 if (true) break;

case 119:
//C
this.state = 120;
;
 if (true) break;

case 120:
//C
this.state = 121;
;
 BA.debugLineNum = 749;BA.debugLine="Dim mExtensionAttributesParentItem As Map=mPare";
Debug.ShouldStop(4096);
_mextensionattributesparentitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mextensionattributesparentitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mparent_item.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("mExtensionAttributesParentItem", _mextensionattributesparentitem);Debug.locals.put("mExtensionAttributesParentItem", _mextensionattributesparentitem);
 BA.debugLineNum = 750;BA.debugLine="If mExtensionAttributesParentItem.IsInitialized";
Debug.ShouldStop(8192);
if (true) break;

case 121:
//if
this.state = 128;
if (_mextensionattributesparentitem.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 123;
}if (true) break;

case 123:
//C
this.state = 124;
 BA.debugLineNum = 751;BA.debugLine="Dim mPgwExtensionAttributesParentItem As Map=m";
Debug.ShouldStop(16384);
_mpgwextensionattributesparentitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mpgwextensionattributesparentitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mextensionattributesparentitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("mPgwExtensionAttributesParentItem", _mpgwextensionattributesparentitem);Debug.locals.put("mPgwExtensionAttributesParentItem", _mpgwextensionattributesparentitem);
 BA.debugLineNum = 752;BA.debugLine="If mPgwExtensionAttributesParentItem.IsInitial";
Debug.ShouldStop(32768);
if (true) break;

case 124:
//if
this.state = 127;
if (_mpgwextensionattributesparentitem.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 126;
}if (true) break;

case 126:
//C
this.state = 127;
 BA.debugLineNum = 754;BA.debugLine="DatosLineaPedidoClienteB2B.UNSPSC=mPgwExtensi";
Debug.ShouldStop(131072);
_datoslineapedidoclienteb2b.setField ("UNSPSC" /*RemoteObject*/ ,BA.ObjectToString(_mpgwextensionattributesparentitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("unspsc"))))));
 BA.debugLineNum = 755;BA.debugLine="DatosLineaPedidoClienteB2B.UOMB2B=mPgwExtensi";
Debug.ShouldStop(262144);
_datoslineapedidoclienteb2b.setField ("UOMB2B" /*RemoteObject*/ ,BA.ObjectToString(_mpgwextensionattributesparentitem.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("uom"))))));
 if (true) break;

case 127:
//C
this.state = 128;
;
 if (true) break;

case 128:
//C
this.state = 131;
;
 BA.debugLineNum = 758;BA.debugLine="Dim PartesSKU() As String=Regex.Split(\"_\",Datos";
Debug.ShouldStop(2097152);
_partessku = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("_")),(Object)(_datoslineapedidoclienteb2b.getField(true,"ItemSKU" /*RemoteObject*/ )));Debug.locals.put("PartesSKU", _partessku);Debug.locals.put("PartesSKU", _partessku);
 BA.debugLineNum = 759;BA.debugLine="DatosLineaPedidoClienteB2B.ItemParentSKU=Partes";
Debug.ShouldStop(4194304);
_datoslineapedidoclienteb2b.setField ("ItemParentSKU" /*RemoteObject*/ ,_partessku.getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 130:
//C
this.state = 131;
 BA.debugLineNum = 761;BA.debugLine="DatosLineaPedidoClienteB2B.TipoItem=\"SimpleSinP";
Debug.ShouldStop(16777216);
_datoslineapedidoclienteb2b.setField ("TipoItem" /*RemoteObject*/ ,BA.ObjectToString("SimpleSinPadre"));
 if (true) break;

case 131:
//C
this.state = 185;
;
 BA.debugLineNum = 765;BA.debugLine="DatosLineaPedidoClienteB2B.CodigoArticuloNAV=IIf";
Debug.ShouldStop(268435456);
_datoslineapedidoclienteb2b.setField ("CodigoArticuloNAV" /*RemoteObject*/ ,BA.ObjectToString(((RemoteObject.solveBoolean("=",_datoslineapedidoclienteb2b.getField(true,"TipoItem" /*RemoteObject*/ ),BA.ObjectToString("SimpleSinPadre"))) ? ((_datoslineapedidoclienteb2b.getField(true,"ItemSKU" /*RemoteObject*/ ))) : ((_datoslineapedidoclienteb2b.getField(true,"ItemParentSKU" /*RemoteObject*/ ))))));
 BA.debugLineNum = 767;BA.debugLine="Log($\"DatosLineaPedidoClienteB2B: ${DatosLineaPe";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","849086927",(RemoteObject.concat(RemoteObject.createImmutable("DatosLineaPedidoClienteB2B: "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datoslineapedidoclienteb2b))),RemoteObject.createImmutable(""))),0);
 BA.debugLineNum = 769;BA.debugLine="Dim sSQL As String=$\"insert into tblB2BLineasPed";
Debug.ShouldStop(1);
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("insert into tblB2BLineasPedidoCliente (\n"),RemoteObject.createImmutable("		IDLinea, LineaPedido, IDProductoB2B, TipoItem , \n"),RemoteObject.createImmutable("		ItemSKU , UNSPSC , \n"),RemoteObject.createImmutable("		DescripcionProductoB2B , TallaB2B , \n"),RemoteObject.createImmutable("		QtyPedida , QtyEnviada , QtyFacturada , Precio , UOMB2B , \n"),RemoteObject.createImmutable("		TipoIVA , ImporteIVA , ItemParentSKU, CodigoArticuloNAV\n"),RemoteObject.createImmutable("		) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 776;BA.debugLine="mSQL.ExecNonQuery2(sSQL,Array As Object(DatosLin";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery2",(Object)(_ssql),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {17},new Object[] {(_datoslineapedidoclienteb2b.getField(true,"IDLinea" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"LineaPedido" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"IDProductoB2B" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"TipoItem" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"ItemSKU" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"UNSPSC" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"DescripcionProductoB2B" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"TallaB2B" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"QtyPedida" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"QtyEnviada" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"QtyFacturada" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"Precio" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"UOMB2B" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"TipoIVA" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"ImporteIVA" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"ItemParentSKU" /*RemoteObject*/ )),(_datoslineapedidoclienteb2b.getField(true,"CodigoArticuloNAV" /*RemoteObject*/ ))})))));
 if (true) break;
if (true) break;

case 132:
//C
this.state = 133;
Debug.locals.put("colitems", _colitems);
;
 BA.debugLineNum = 785;BA.debugLine="Dim shipping_assignments As List = extension_attr";
Debug.ShouldStop(65536);
_shipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_shipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_assignments")))));Debug.locals.put("shipping_assignments", _shipping_assignments);Debug.locals.put("shipping_assignments", _shipping_assignments);
 BA.debugLineNum = 786;BA.debugLine="For Each colshipping_assignments As Map In shippi";
Debug.ShouldStop(131072);
if (true) break;

case 133:
//for
this.state = 166;
_colshipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group350 = _shipping_assignments;
index350 = 0;
groupLen350 = group350.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
this.state = 190;
if (true) break;

case 190:
//C
this.state = 166;
if (index350 < groupLen350) {
this.state = 135;
_colshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group350.runMethod(false,"Get",index350));Debug.locals.put("colshipping_assignments", _colshipping_assignments);}
if (true) break;

case 191:
//C
this.state = 190;
index350++;
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 787;BA.debugLine="Dim shipping As Map = colshipping_assignments.Ge";
Debug.ShouldStop(262144);
_shipping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_shipping = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _colshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping")))));Debug.locals.put("shipping", _shipping);Debug.locals.put("shipping", _shipping);
 BA.debugLineNum = 788;BA.debugLine="Log(\"shipping\" & shipping)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","849086948",RemoteObject.concat(RemoteObject.createImmutable("shipping"),_shipping),0);
 BA.debugLineNum = 789;BA.debugLine="Dim total As Map = shipping.Get(\"total\")";
Debug.ShouldStop(1048576);
_total = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_total = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("total")))));Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 790;BA.debugLine="Dim shipping_amount As Int = total.Get(\"shipping";
Debug.ShouldStop(2097152);
_shipping_amount = BA.numberCast(int.class, _total.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("shipping_amount")))));Debug.locals.put("shipping_amount", _shipping_amount);Debug.locals.put("shipping_amount", _shipping_amount);
 BA.debugLineNum = 791;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
Debug.ShouldStop(4194304);
_shipping_discount_tax_compensation_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);Debug.locals.put("shipping_discount_tax_compensation_amount", _shipping_discount_tax_compensation_amount);
 BA.debugLineNum = 792;BA.debugLine="Dim shipping_discount_amount As Int = total.Getd";
Debug.ShouldStop(8388608);
_shipping_discount_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);Debug.locals.put("shipping_discount_amount", _shipping_discount_amount);
 BA.debugLineNum = 793;BA.debugLine="Dim base_shipping_discount_amount As Int = total";
Debug.ShouldStop(16777216);
_base_shipping_discount_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);Debug.locals.put("base_shipping_discount_amount", _base_shipping_discount_amount);
 BA.debugLineNum = 794;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
Debug.ShouldStop(33554432);
_base_shipping_discount_tax_compensation_amnt = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_discount_tax_compensation_amnt"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);Debug.locals.put("base_shipping_discount_tax_compensation_amnt", _base_shipping_discount_tax_compensation_amnt);
 BA.debugLineNum = 795;BA.debugLine="Dim base_shipping_incl_tax As Int = total.Getdef";
Debug.ShouldStop(67108864);
_base_shipping_incl_tax = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);Debug.locals.put("base_shipping_incl_tax", _base_shipping_incl_tax);
 BA.debugLineNum = 796;BA.debugLine="Dim shipping_invoiced As Int = total.Getdefault(";
Debug.ShouldStop(134217728);
_shipping_invoiced = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_invoiced", _shipping_invoiced);Debug.locals.put("shipping_invoiced", _shipping_invoiced);
 BA.debugLineNum = 797;BA.debugLine="Dim shipping_incl_tax As Int = total.Getdefault(";
Debug.ShouldStop(268435456);
_shipping_incl_tax = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_incl_tax"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);Debug.locals.put("shipping_incl_tax", _shipping_incl_tax);
 BA.debugLineNum = 798;BA.debugLine="Dim base_shipping_invoiced As Int = total.Getdef";
Debug.ShouldStop(536870912);
_base_shipping_invoiced = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_invoiced"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);Debug.locals.put("base_shipping_invoiced", _base_shipping_invoiced);
 BA.debugLineNum = 799;BA.debugLine="Dim base_shipping_tax_amount As Int = total.Getd";
Debug.ShouldStop(1073741824);
_base_shipping_tax_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);Debug.locals.put("base_shipping_tax_amount", _base_shipping_tax_amount);
 BA.debugLineNum = 800;BA.debugLine="Dim shipping_tax_amount As Int = total.Getdefaul";
Debug.ShouldStop(-2147483648);
_shipping_tax_amount = BA.numberCast(int.class, _total.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("shipping_tax_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);Debug.locals.put("shipping_tax_amount", _shipping_tax_amount);
 BA.debugLineNum = 801;BA.debugLine="Dim address As Map = shipping.Get(\"address\")";
Debug.ShouldStop(1);
_address = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_address = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address")))));Debug.locals.put("address", _address);Debug.locals.put("address", _address);
 BA.debugLineNum = 802;BA.debugLine="Dim firstname As String = address.Get(\"firstname";
Debug.ShouldStop(2);
_firstname = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 803;BA.debugLine="Dim address_type As String = address.Get(\"addres";
Debug.ShouldStop(4);
_address_type = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("address_type")))));Debug.locals.put("address_type", _address_type);Debug.locals.put("address_type", _address_type);
 BA.debugLineNum = 804;BA.debugLine="Dim shipping_customer_address_id As Int = addres";
Debug.ShouldStop(8);
_shipping_customer_address_id = BA.numberCast(int.class, _address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("customer_address_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("shipping_customer_address_id", _shipping_customer_address_id);Debug.locals.put("shipping_customer_address_id", _shipping_customer_address_id);
 BA.debugLineNum = 805;BA.debugLine="If mDatosCabeceraPedidoCliente.PedidoPunchout Th";
Debug.ShouldStop(16);
if (true) break;

case 136:
//if
this.state = 141;
if (__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"PedidoPunchout" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 138;
}else {
this.state = 140;
}if (true) break;

case 138:
//C
this.state = 141;
 BA.debugLineNum = 806;BA.debugLine="Dim IDDireccionEnvio As Int = address.Get(\"enti";
Debug.ShouldStop(32);
_iddireccionenvio = BA.numberCast(int.class, _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("entity_id")))));Debug.locals.put("IDDireccionEnvio", _iddireccionenvio);Debug.locals.put("IDDireccionEnvio", _iddireccionenvio);
 if (true) break;

case 140:
//C
this.state = 141;
 BA.debugLineNum = 808;BA.debugLine="Dim IDDireccionEnvio As Int = shipping_customer";
Debug.ShouldStop(128);
_iddireccionenvio = _shipping_customer_address_id;Debug.locals.put("IDDireccionEnvio", _iddireccionenvio);Debug.locals.put("IDDireccionEnvio", _iddireccionenvio);
 if (true) break;

case 141:
//C
this.state = 142;
;
 BA.debugLineNum = 812;BA.debugLine="mDatosCabeceraPedidoCliente.IDDireccionEnvio=IDD";
Debug.ShouldStop(2048);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("IDDireccionEnvio" /*RemoteObject*/ ,_iddireccionenvio);
 BA.debugLineNum = 814;BA.debugLine="Dim company As String=address.Get(\"company\")";
Debug.ShouldStop(8192);
_company = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("company")))));Debug.locals.put("company", _company);Debug.locals.put("company", _company);
 BA.debugLineNum = 816;BA.debugLine="mDatosCabeceraPedidoCliente.NombreDireccionEnvio";
Debug.ShouldStop(32768);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("NombreDireccionEnvio" /*RemoteObject*/ ,_company);
 BA.debugLineNum = 818;BA.debugLine="Dim city As String = address.Get(\"city\")";
Debug.ShouldStop(131072);
_city = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("city")))));Debug.locals.put("city", _city);Debug.locals.put("city", _city);
 BA.debugLineNum = 819;BA.debugLine="Dim postcode As String = address.Get(\"postcode\")";
Debug.ShouldStop(262144);
_postcode = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("postcode")))));Debug.locals.put("postcode", _postcode);Debug.locals.put("postcode", _postcode);
 BA.debugLineNum = 820;BA.debugLine="Dim region_id As Int = address.Getdefault(\"regio";
Debug.ShouldStop(524288);
_region_id = BA.numberCast(int.class, _address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("region_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("region_id", _region_id);Debug.locals.put("region_id", _region_id);
 BA.debugLineNum = 821;BA.debugLine="Dim telephone As String = address.Get(\"telephone";
Debug.ShouldStop(1048576);
_telephone = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telephone")))));Debug.locals.put("telephone", _telephone);Debug.locals.put("telephone", _telephone);
 BA.debugLineNum = 825;BA.debugLine="Dim lastname As String = address.Get(\"lastname\")";
Debug.ShouldStop(16777216);
_lastname = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 826;BA.debugLine="Dim parent_id As Int = address.Getdefault(\"paren";
Debug.ShouldStop(33554432);
_parent_id = BA.numberCast(int.class, _address.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("parent_id"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("parent_id", _parent_id);Debug.locals.put("parent_id", _parent_id);
 BA.debugLineNum = 827;BA.debugLine="Dim DireccionEnvio As String";
Debug.ShouldStop(67108864);
_direccionenvio = RemoteObject.createImmutable("");Debug.locals.put("DireccionEnvio", _direccionenvio);
 BA.debugLineNum = 828;BA.debugLine="Dim street As List = address.Get(\"street\")";
Debug.ShouldStop(134217728);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("street")))));Debug.locals.put("street", _street);Debug.locals.put("street", _street);
 BA.debugLineNum = 829;BA.debugLine="For Each colstreet As String In street";
Debug.ShouldStop(268435456);
if (true) break;

case 142:
//for
this.state = 145;
group385 = _street;
index385 = 0;
groupLen385 = group385.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colstreet", _colstreet);
this.state = 192;
if (true) break;

case 192:
//C
this.state = 145;
if (index385 < groupLen385) {
this.state = 144;
_colstreet = BA.ObjectToString(group385.runMethod(false,"Get",index385));Debug.locals.put("colstreet", _colstreet);}
if (true) break;

case 193:
//C
this.state = 192;
index385++;
Debug.locals.put("colstreet", _colstreet);
if (true) break;

case 144:
//C
this.state = 193;
 BA.debugLineNum = 830;BA.debugLine="DireccionEnvio=DireccionEnvio & \" \" & colstreet";
Debug.ShouldStop(536870912);
_direccionenvio = RemoteObject.concat(_direccionenvio,RemoteObject.createImmutable(" "),_colstreet);Debug.locals.put("DireccionEnvio", _direccionenvio);
 if (true) break;
if (true) break;

case 145:
//C
this.state = 146;
Debug.locals.put("colstreet", _colstreet);
;
 BA.debugLineNum = 832;BA.debugLine="Dim region As String = address.Get(\"region\")";
Debug.ShouldStop(-2147483648);
_region = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region")))));Debug.locals.put("region", _region);Debug.locals.put("region", _region);
 BA.debugLineNum = 833;BA.debugLine="Dim country_id As String = address.Get(\"country_";
Debug.ShouldStop(1);
_country_id = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("country_id")))));Debug.locals.put("country_id", _country_id);Debug.locals.put("country_id", _country_id);
 BA.debugLineNum = 834;BA.debugLine="Dim email As String = address.Get(\"email\")";
Debug.ShouldStop(2);
_email = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 835;BA.debugLine="Dim region_code As String = address.Get(\"region_";
Debug.ShouldStop(4);
_region_code = BA.ObjectToString(_address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("region_code")))));Debug.locals.put("region_code", _region_code);Debug.locals.put("region_code", _region_code);
 BA.debugLineNum = 837;BA.debugLine="mDatosCabeceraPedidoCliente.DireccionEnvio=$\"${m";
Debug.ShouldStop(16);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).setField ("DireccionEnvio" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"DireccionEnvio" /*RemoteObject*/ )))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_postcode))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_city))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_region))),RemoteObject.createImmutable(" "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_country_id))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 839;BA.debugLine="Dim method As String = shipping.Get(\"method\")";
Debug.ShouldStop(64);
_method = BA.ObjectToString(_shipping.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("method")))));Debug.locals.put("method", _method);Debug.locals.put("method", _method);
 BA.debugLineNum = 840;BA.debugLine="Dim AddressExtensionAttributes As Map=address.Ge";
Debug.ShouldStop(128);
_addressextensionattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_addressextensionattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _address.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("AddressExtensionAttributes", _addressextensionattributes);Debug.locals.put("AddressExtensionAttributes", _addressextensionattributes);
 BA.debugLineNum = 841;BA.debugLine="If AddressExtensionAttributes.IsInitialized Then";
Debug.ShouldStop(256);
if (true) break;

case 146:
//if
this.state = 149;
if (_addressextensionattributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
 BA.debugLineNum = 842;BA.debugLine="Dim AddressPgW As Map=AddressExtensionAttribute";
Debug.ShouldStop(512);
_addresspgw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_addresspgw = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _addressextensionattributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pgw")))));Debug.locals.put("AddressPgW", _addresspgw);Debug.locals.put("AddressPgW", _addresspgw);
 if (true) break;

case 149:
//C
this.state = 150;
;
 BA.debugLineNum = 845;BA.debugLine="Dim ItemsShipping_Assignments As List = colshipp";
Debug.ShouldStop(4096);
_itemsshipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_itemsshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _colshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("ItemsShipping_Assignments", _itemsshipping_assignments);Debug.locals.put("ItemsShipping_Assignments", _itemsshipping_assignments);
 BA.debugLineNum = 846;BA.debugLine="For Each colItemsShipping_Assignments As Map In";
Debug.ShouldStop(8192);
if (true) break;

case 150:
//for
this.state = 165;
_colitemsshipping_assignments = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group399 = _itemsshipping_assignments;
index399 = 0;
groupLen399 = group399.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colItemsShipping_Assignments", _colitemsshipping_assignments);
this.state = 194;
if (true) break;

case 194:
//C
this.state = 165;
if (index399 < groupLen399) {
this.state = 152;
_colitemsshipping_assignments = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group399.runMethod(false,"Get",index399));Debug.locals.put("colItemsShipping_Assignments", _colitemsshipping_assignments);}
if (true) break;

case 195:
//C
this.state = 194;
index399++;
Debug.locals.put("colItemsShipping_Assignments", _colitemsshipping_assignments);
if (true) break;

case 152:
//C
this.state = 153;
 BA.debugLineNum = 847;BA.debugLine="Log(\"colItemsShipping_Assignments\" & colItemsSh";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","849087007",RemoteObject.concat(RemoteObject.createImmutable("colItemsShipping_Assignments"),_colitemsshipping_assignments),0);
 BA.debugLineNum = 850;BA.debugLine="Dim original_price As Double = colItemsShipping";
Debug.ShouldStop(131072);
_original_price = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("original_price")))));Debug.locals.put("original_price", _original_price);Debug.locals.put("original_price", _original_price);
 BA.debugLineNum = 851;BA.debugLine="Dim free_shipping As Int = colItemsShipping_Ass";
Debug.ShouldStop(262144);
_free_shipping = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("free_shipping")))));Debug.locals.put("free_shipping", _free_shipping);Debug.locals.put("free_shipping", _free_shipping);
 BA.debugLineNum = 852;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
Debug.ShouldStop(524288);
_base_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);Debug.locals.put("base_discount_tax_compensation_invoiced", _base_discount_tax_compensation_invoiced);
 BA.debugLineNum = 853;BA.debugLine="Dim discount_amount As Double = colItemsShippin";
Debug.ShouldStop(1048576);
_discount_amount = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_amount"))),(Object)(RemoteObject.createImmutable((0)))));Debug.locals.put("discount_amount", _discount_amount);Debug.locals.put("discount_amount", _discount_amount);
 BA.debugLineNum = 854;BA.debugLine="Dim tax_percent As Double = colItemsShipping_As";
Debug.ShouldStop(2097152);
_tax_percent = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("tax_percent"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("tax_percent", _tax_percent);Debug.locals.put("tax_percent", _tax_percent);
 BA.debugLineNum = 855;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
Debug.ShouldStop(4194304);
_price_incl_tax = parent._utilidades.runMethod(true,"_fixnulldouble" /*RemoteObject*/ ,(Object)(_colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("price_incl_tax"))),(Object)(RemoteObject.createImmutable((0))))));Debug.locals.put("price_incl_tax", _price_incl_tax);Debug.locals.put("price_incl_tax", _price_incl_tax);
 BA.debugLineNum = 856;BA.debugLine="Dim price As Double = colItemsShipping_Assignme";
Debug.ShouldStop(8388608);
_price = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("price")))));Debug.locals.put("price", _price);Debug.locals.put("price", _price);
 BA.debugLineNum = 857;BA.debugLine="Dim product_id As Int = colItemsShipping_Assign";
Debug.ShouldStop(16777216);
_product_id = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_id")))));Debug.locals.put("product_id", _product_id);Debug.locals.put("product_id", _product_id);
 BA.debugLineNum = 858;BA.debugLine="Dim base_row_total As Double = colItemsShipping";
Debug.ShouldStop(33554432);
_base_row_total = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total")))));Debug.locals.put("base_row_total", _base_row_total);Debug.locals.put("base_row_total", _base_row_total);
 BA.debugLineNum = 859;BA.debugLine="Dim sku As String = colItemsShipping_Assignment";
Debug.ShouldStop(67108864);
_sku = BA.ObjectToString(_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("sku")))));Debug.locals.put("sku", _sku);Debug.locals.put("sku", _sku);
 BA.debugLineNum = 860;BA.debugLine="Dim discount_tax_compensation_amount As Int = c";
Debug.ShouldStop(134217728);
_discount_tax_compensation_amount = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);Debug.locals.put("discount_tax_compensation_amount", _discount_tax_compensation_amount);
 BA.debugLineNum = 861;BA.debugLine="Dim weight As Int = colItemsShipping_Assignment";
Debug.ShouldStop(268435456);
_weight = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("weight")))));Debug.locals.put("weight", _weight);Debug.locals.put("weight", _weight);
 BA.debugLineNum = 862;BA.debugLine="Dim base_original_price As Int = colItemsShippi";
Debug.ShouldStop(536870912);
_base_original_price = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_original_price"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_original_price", _base_original_price);Debug.locals.put("base_original_price", _base_original_price);
 BA.debugLineNum = 863;BA.debugLine="Dim row_weight As Int = colItemsShipping_Assign";
Debug.ShouldStop(1073741824);
_row_weight = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_weight")))));Debug.locals.put("row_weight", _row_weight);Debug.locals.put("row_weight", _row_weight);
 BA.debugLineNum = 864;BA.debugLine="Dim applied_rule_ids As String = colItemsShippi";
Debug.ShouldStop(-2147483648);
_applied_rule_ids = BA.ObjectToString(_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applied_rule_ids")))));Debug.locals.put("applied_rule_ids", _applied_rule_ids);Debug.locals.put("applied_rule_ids", _applied_rule_ids);
 BA.debugLineNum = 865;BA.debugLine="Dim base_amount_refunded As Int = colItemsShipp";
Debug.ShouldStop(1);
_base_amount_refunded = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_amount_refunded")))));Debug.locals.put("base_amount_refunded", _base_amount_refunded);Debug.locals.put("base_amount_refunded", _base_amount_refunded);
 BA.debugLineNum = 866;BA.debugLine="Dim base_price_incl_tax As Double = colItemsShi";
Debug.ShouldStop(2);
_base_price_incl_tax = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_price_incl_tax"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);Debug.locals.put("base_price_incl_tax", _base_price_incl_tax);
 BA.debugLineNum = 867;BA.debugLine="Dim no_discount As Int = colItemsShipping_Assig";
Debug.ShouldStop(4);
_no_discount = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("no_discount")))));Debug.locals.put("no_discount", _no_discount);Debug.locals.put("no_discount", _no_discount);
 BA.debugLineNum = 868;BA.debugLine="Dim name As String = colItemsShipping_Assignmen";
Debug.ShouldStop(8);
_name = BA.ObjectToString(_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 869;BA.debugLine="Dim base_discount_invoiced As Int = colItemsShi";
Debug.ShouldStop(16);
_base_discount_invoiced = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_invoiced")))));Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);Debug.locals.put("base_discount_invoiced", _base_discount_invoiced);
 BA.debugLineNum = 870;BA.debugLine="Dim discount_percent As Int = colItemsShipping_";
Debug.ShouldStop(32);
_discount_percent = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_percent"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("discount_percent", _discount_percent);Debug.locals.put("discount_percent", _discount_percent);
 BA.debugLineNum = 871;BA.debugLine="Dim order_id As Int = colItemsShipping_Assignme";
Debug.ShouldStop(64);
_order_id = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("order_id")))));Debug.locals.put("order_id", _order_id);Debug.locals.put("order_id", _order_id);
 BA.debugLineNum = 872;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
Debug.ShouldStop(128);
_discount_tax_compensation_invoiced = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("discount_tax_compensation_invoiced"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);Debug.locals.put("discount_tax_compensation_invoiced", _discount_tax_compensation_invoiced);
 BA.debugLineNum = 873;BA.debugLine="Dim created_at As String = colItemsShipping_Ass";
Debug.ShouldStop(256);
_created_at = BA.ObjectToString(_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 874;BA.debugLine="Dim qty_shipped As Int = colItemsShipping_Assig";
Debug.ShouldStop(512);
_qty_shipped = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_shipped")))));Debug.locals.put("qty_shipped", _qty_shipped);Debug.locals.put("qty_shipped", _qty_shipped);
 BA.debugLineNum = 875;BA.debugLine="Dim qty_ordered As Int = colItemsShipping_Assig";
Debug.ShouldStop(1024);
_qty_ordered = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_ordered")))));Debug.locals.put("qty_ordered", _qty_ordered);Debug.locals.put("qty_ordered", _qty_ordered);
 BA.debugLineNum = 876;BA.debugLine="Dim row_total As Int = colItemsShipping_Assignm";
Debug.ShouldStop(2048);
_row_total = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total")))));Debug.locals.put("row_total", _row_total);Debug.locals.put("row_total", _row_total);
 BA.debugLineNum = 877;BA.debugLine="Dim qty_canceled As Int = colItemsShipping_Assi";
Debug.ShouldStop(4096);
_qty_canceled = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_canceled")))));Debug.locals.put("qty_canceled", _qty_canceled);Debug.locals.put("qty_canceled", _qty_canceled);
 BA.debugLineNum = 878;BA.debugLine="Dim ItemsShipping_AssignmentsProduct_option As";
Debug.ShouldStop(8192);
_itemsshipping_assignmentsproduct_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_itemsshipping_assignmentsproduct_option = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), ((RemoteObject.solveBoolean("n",_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))))) ? ((parent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("")),(RemoteObject.createImmutable(""))})).getObject())) : (_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_option")))))));Debug.locals.put("ItemsShipping_AssignmentsProduct_option", _itemsshipping_assignmentsproduct_option);Debug.locals.put("ItemsShipping_AssignmentsProduct_option", _itemsshipping_assignmentsproduct_option);
 BA.debugLineNum = 879;BA.debugLine="Dim ItemsShipping_AssignmentsProduct_optionExte";
Debug.ShouldStop(16384);
_itemsshipping_assignmentsproduct_optionextension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_itemsshipping_assignmentsproduct_optionextension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _itemsshipping_assignmentsproduct_option.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("ItemsShipping_AssignmentsProduct_optionExtension_attributes", _itemsshipping_assignmentsproduct_optionextension_attributes);Debug.locals.put("ItemsShipping_AssignmentsProduct_optionExtension_attributes", _itemsshipping_assignmentsproduct_optionextension_attributes);
 BA.debugLineNum = 880;BA.debugLine="Dim TallaLineaAlbaran As String";
Debug.ShouldStop(32768);
_tallalineaalbaran = RemoteObject.createImmutable("");Debug.locals.put("TallaLineaAlbaran", _tallalineaalbaran);
 BA.debugLineNum = 881;BA.debugLine="If ItemsShipping_AssignmentsProduct_optionExten";
Debug.ShouldStop(65536);
if (true) break;

case 153:
//if
this.state = 164;
if (_itemsshipping_assignmentsproduct_optionextension_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
 BA.debugLineNum = 882;BA.debugLine="Dim ItemsShipping_AssignmentsProduct_optionExt";
Debug.ShouldStop(131072);
_itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _itemsshipping_assignmentsproduct_optionextension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("configurable_item_options")))));Debug.locals.put("ItemsShipping_AssignmentsProduct_optionExtension_attributesConfigurable_item_options", _itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options);Debug.locals.put("ItemsShipping_AssignmentsProduct_optionExtension_attributesConfigurable_item_options", _itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options);
 BA.debugLineNum = 883;BA.debugLine="For Each ItemsShippingcolconfigurable_item_opt";
Debug.ShouldStop(262144);
if (true) break;

case 156:
//for
this.state = 163;
_itemsshippingcolconfigurable_item_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group434 = _itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options;
index434 = 0;
groupLen434 = group434.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("ItemsShippingcolconfigurable_item_options", _itemsshippingcolconfigurable_item_options);
this.state = 196;
if (true) break;

case 196:
//C
this.state = 163;
if (index434 < groupLen434) {
this.state = 158;
_itemsshippingcolconfigurable_item_options = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group434.runMethod(false,"Get",index434));Debug.locals.put("ItemsShippingcolconfigurable_item_options", _itemsshippingcolconfigurable_item_options);}
if (true) break;

case 197:
//C
this.state = 196;
index434++;
Debug.locals.put("ItemsShippingcolconfigurable_item_options", _itemsshippingcolconfigurable_item_options);
if (true) break;

case 158:
//C
this.state = 159;
 BA.debugLineNum = 884;BA.debugLine="Dim option_value As Int = ItemsShippingcolcon";
Debug.ShouldStop(524288);
_option_value = BA.numberCast(int.class, _itemsshippingcolconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_value")))));Debug.locals.put("option_value", _option_value);Debug.locals.put("option_value", _option_value);
 BA.debugLineNum = 885;BA.debugLine="Dim option_id As String = ItemsShippingcolcon";
Debug.ShouldStop(1048576);
_option_id = BA.ObjectToString(_itemsshippingcolconfigurable_item_options.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("option_id")))));Debug.locals.put("option_id", _option_id);Debug.locals.put("option_id", _option_id);
 BA.debugLineNum = 886;BA.debugLine="If option_id=142 Then";
Debug.ShouldStop(2097152);
if (true) break;

case 159:
//if
this.state = 162;
if (RemoteObject.solveBoolean("=",_option_id,BA.NumberToString(142))) { 
this.state = 161;
}if (true) break;

case 161:
//C
this.state = 162;
 BA.debugLineNum = 887;BA.debugLine="TallaLineaAlbaran=mSQL.ExecQuerySingleResult";
Debug.ShouldStop(4194304);
_tallalineaalbaran = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"ExecQuerySingleResult2",(Object)(BA.ObjectToString("select label from tblB2BAtributoSizeProducts where value=?")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(_option_value)})))));Debug.locals.put("TallaLineaAlbaran", _tallalineaalbaran);
 if (true) break;

case 162:
//C
this.state = 197;
;
 if (true) break;
if (true) break;

case 163:
//C
this.state = 164;
Debug.locals.put("ItemsShippingcolconfigurable_item_options", _itemsshippingcolconfigurable_item_options);
;
 if (true) break;

case 164:
//C
this.state = 195;
;
 BA.debugLineNum = 891;BA.debugLine="Dim amount_refunded As Int = colItemsShipping_A";
Debug.ShouldStop(67108864);
_amount_refunded = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("amount_refunded")))));Debug.locals.put("amount_refunded", _amount_refunded);Debug.locals.put("amount_refunded", _amount_refunded);
 BA.debugLineNum = 892;BA.debugLine="Dim updated_at As String = colItemsShipping_Ass";
Debug.ShouldStop(134217728);
_updated_at = BA.ObjectToString(_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 893;BA.debugLine="Dim base_price As Double = colItemsShipping_Ass";
Debug.ShouldStop(268435456);
_base_price = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_price")))));Debug.locals.put("base_price", _base_price);Debug.locals.put("base_price", _base_price);
 BA.debugLineNum = 894;BA.debugLine="Dim qty_invoiced As Int = colItemsShipping_Assi";
Debug.ShouldStop(536870912);
_qty_invoiced = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_invoiced")))));Debug.locals.put("qty_invoiced", _qty_invoiced);Debug.locals.put("qty_invoiced", _qty_invoiced);
 BA.debugLineNum = 895;BA.debugLine="Dim row_invoiced As Int = colItemsShipping_Assi";
Debug.ShouldStop(1073741824);
_row_invoiced = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_invoiced")))));Debug.locals.put("row_invoiced", _row_invoiced);Debug.locals.put("row_invoiced", _row_invoiced);
 BA.debugLineNum = 896;BA.debugLine="Dim row_total_incl_tax As Double = colItemsShip";
Debug.ShouldStop(-2147483648);
_row_total_incl_tax = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("row_total_incl_tax")))));Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);Debug.locals.put("row_total_incl_tax", _row_total_incl_tax);
 BA.debugLineNum = 897;BA.debugLine="Dim base_tax_amount As Double = colItemsShippin";
Debug.ShouldStop(1);
_base_tax_amount = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_amount")))));Debug.locals.put("base_tax_amount", _base_tax_amount);Debug.locals.put("base_tax_amount", _base_tax_amount);
 BA.debugLineNum = 899;BA.debugLine="Dim item_id As Int = colItemsShipping_Assignmen";
Debug.ShouldStop(4);
_item_id = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("item_id")))));Debug.locals.put("item_id", _item_id);Debug.locals.put("item_id", _item_id);
 BA.debugLineNum = 900;BA.debugLine="Dim base_discount_amount As Int = colItemsShipp";
Debug.ShouldStop(8);
_base_discount_amount = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_discount_amount")))));Debug.locals.put("base_discount_amount", _base_discount_amount);Debug.locals.put("base_discount_amount", _base_discount_amount);
 BA.debugLineNum = 901;BA.debugLine="Dim base_row_total_incl_tax As Double = colItem";
Debug.ShouldStop(16);
_base_row_total_incl_tax = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_total_incl_tax")))));Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);Debug.locals.put("base_row_total_incl_tax", _base_row_total_incl_tax);
 BA.debugLineNum = 902;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
Debug.ShouldStop(32);
_base_discount_tax_compensation_amount = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("base_discount_tax_compensation_amount"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);Debug.locals.put("base_discount_tax_compensation_amount", _base_discount_tax_compensation_amount);
 BA.debugLineNum = 903;BA.debugLine="Dim product_type As String = colItemsShipping_A";
Debug.ShouldStop(64);
_product_type = BA.ObjectToString(_colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("product_type")))));Debug.locals.put("product_type", _product_type);Debug.locals.put("product_type", _product_type);
 BA.debugLineNum = 904;BA.debugLine="Dim qty_refunded As Int = colItemsShipping_Assi";
Debug.ShouldStop(128);
_qty_refunded = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("qty_refunded")))));Debug.locals.put("qty_refunded", _qty_refunded);Debug.locals.put("qty_refunded", _qty_refunded);
 BA.debugLineNum = 905;BA.debugLine="Dim base_row_invoiced As Int = colItemsShipping";
Debug.ShouldStop(256);
_base_row_invoiced = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_row_invoiced")))));Debug.locals.put("base_row_invoiced", _base_row_invoiced);Debug.locals.put("base_row_invoiced", _base_row_invoiced);
 BA.debugLineNum = 906;BA.debugLine="Dim is_qty_decimal As Int = colItemsShipping_As";
Debug.ShouldStop(512);
_is_qty_decimal = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("is_qty_decimal"))),(Object)(RemoteObject.createImmutable((-(double) (0 + 1))))));Debug.locals.put("is_qty_decimal", _is_qty_decimal);Debug.locals.put("is_qty_decimal", _is_qty_decimal);
 BA.debugLineNum = 907;BA.debugLine="Dim discount_invoiced As Int = colItemsShipping";
Debug.ShouldStop(1024);
_discount_invoiced = BA.numberCast(int.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("discount_invoiced")))));Debug.locals.put("discount_invoiced", _discount_invoiced);Debug.locals.put("discount_invoiced", _discount_invoiced);
 BA.debugLineNum = 908;BA.debugLine="Dim base_tax_invoiced As Double = colItemsShipp";
Debug.ShouldStop(2048);
_base_tax_invoiced = BA.numberCast(double.class, _colitemsshipping_assignments.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("base_tax_invoiced")))));Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);Debug.locals.put("base_tax_invoiced", _base_tax_invoiced);
 if (true) break;
if (true) break;

case 165:
//C
this.state = 191;
Debug.locals.put("colItemsShipping_Assignments", _colitemsshipping_assignments);
;
 if (true) break;
if (true) break;

case 166:
//C
this.state = -1;
Debug.locals.put("colshipping_assignments", _colshipping_assignments);
;
 BA.debugLineNum = 915;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(262144);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 917;BA.debugLine="mSQL.ExecNonQuery($\"update tblB2BLineasPedidoClie";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.createImmutable("update tblB2BLineasPedidoCliente set QtyPteEnviar=QtyPedida-QtyEnviada"))));
 BA.debugLineNum = 918;BA.debugLine="mSQL.ExecNonQuery($\"update tblB2BLineasPedidoClie";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)((RemoteObject.createImmutable("update tblB2BLineasPedidoCliente set QtyEnviadaPteFacturar=QtyEnviada-QtyFacturada"))));
 BA.debugLineNum = 921;BA.debugLine="Return True";
Debug.ShouldStop(16777216);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 922;BA.debugLine="End Sub";
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
public static RemoteObject  _cargadatospedidoclientesearch(RemoteObject __ref,RemoteObject _idpedidosel) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosPedidoClienteSearch (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1166);
if (RapidSub.canDelegate("cargadatospedidoclientesearch")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","cargadatospedidoclientesearch", __ref, _idpedidosel);}
ResumableSub_CargaDatosPedidoClienteSearch rsub = new ResumableSub_CargaDatosPedidoClienteSearch(null,__ref,_idpedidosel);
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
public static class ResumableSub_CargaDatosPedidoClienteSearch extends BA.ResumableSub {
public ResumableSub_CargaDatosPedidoClienteSearch(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._idpedidosel = _idpedidosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _idpedidosel;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _mdatapedido = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstitems = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _mdataitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaDatosPedidoClienteSearch (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1166);
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
Debug.locals.put("IDPedidoSel", _idpedidosel);
 BA.debugLineNum = 1168;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BLineasPedido";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BLineasPedidoCliente")));
 BA.debugLineNum = 1171;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidoCli";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "cargadatospedidoclientesearch"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_enviodatosapimagentoinformacionpedidoclientesearch" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtk" /*RemoteObject*/ )),(Object)(_idpedidosel)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1172;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 1175;BA.debugLine="Dim mDataPedido As Map";
Debug.ShouldStop(4194304);
_mdatapedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mDataPedido", _mdatapedido);
 BA.debugLineNum = 1176;BA.debugLine="mDataPedido.Initialize";
Debug.ShouldStop(8388608);
_mdatapedido.runVoidMethod ("Initialize");
 BA.debugLineNum = 1181;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(268435456);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1182;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(536870912);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 1184;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(-2147483648);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1185;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(1);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1186;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(2);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1187;BA.debugLine="Dim lstItems As List=root.Get(\"items\")";
Debug.ShouldStop(4);
_lstitems = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstitems = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("items")))));Debug.locals.put("lstItems", _lstitems);Debug.locals.put("lstItems", _lstitems);
 BA.debugLineNum = 1188;BA.debugLine="For Each mDataItem As Map In lstItems";
Debug.ShouldStop(8);
if (true) break;

case 7:
//for
this.state = 10;
_mdataitem = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group12 = _lstitems;
index12 = 0;
groupLen12 = group12.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mDataItem", _mdataitem);
this.state = 12;
if (true) break;

case 12:
//C
this.state = 10;
if (index12 < groupLen12) {
this.state = 9;
_mdataitem = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group12.runMethod(false,"Get",index12));Debug.locals.put("mDataItem", _mdataitem);}
if (true) break;

case 13:
//C
this.state = 12;
index12++;
Debug.locals.put("mDataItem", _mdataitem);
if (true) break;

case 9:
//C
this.state = 13;
 BA.debugLineNum = 1189;BA.debugLine="Log(mDataItem)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","849610775",BA.ObjectToString(_mdataitem),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
Debug.locals.put("mDataItem", _mdataitem);
;
 BA.debugLineNum = 1192;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1194;BA.debugLine="End Sub";
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
public static RemoteObject  _cargainfodireccionesclientemagento(RemoteObject __ref,RemoteObject _idclientesel) throws Exception{
try {
		Debug.PushSubsStack("CargaInfoDireccionesClienteMagento (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1370);
if (RapidSub.canDelegate("cargainfodireccionesclientemagento")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","cargainfodireccionesclientemagento", __ref, _idclientesel);}
ResumableSub_CargaInfoDireccionesClienteMagento rsub = new ResumableSub_CargaInfoDireccionesClienteMagento(null,__ref,_idclientesel);
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
public static class ResumableSub_CargaInfoDireccionesClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaInfoDireccionesClienteMagento(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _idclientesel;
RemoteObject _sresp = RemoteObject.createImmutable("");
RemoteObject _parser = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _store_id = RemoteObject.createImmutable(0);
RemoteObject _firstname = RemoteObject.createImmutable("");
RemoteObject _addresses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _created_at = RemoteObject.createImmutable("");
RemoteObject _extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _is_subscribed = RemoteObject.createImmutable("");
RemoteObject _lastname = RemoteObject.createImmutable("");
RemoteObject _custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _code = RemoteObject.createImmutable("");
RemoteObject _customer_code = RemoteObject.createImmutable("");
RemoteObject _colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _attribute_code = RemoteObject.createImmutable("");
RemoteObject _updated_at = RemoteObject.createImmutable("");
RemoteObject _disable_auto_group_change = RemoteObject.createImmutable(0);
RemoteObject _group_id = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable(0);
RemoteObject _website_id = RemoteObject.createImmutable(0);
RemoteObject _email = RemoteObject.createImmutable("");
RemoteObject _created_in = RemoteObject.createImmutable("");
RemoteObject _maddress = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstaddresscustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _maddresscustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _street = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject group18;
int index18;
int groupLen18;
RemoteObject group32;
int index32;
int groupLen32;
RemoteObject group36;
int index36;
int groupLen36;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CargaInfoDireccionesClienteMagento (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1370);
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
Debug.locals.put("IDClienteSel", _idclientesel);
 BA.debugLineNum = 1378;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("delete from tblB2BDireccionesCliente")));
 BA.debugLineNum = 1380;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCliente(m";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "cargainfodireccionesclientemagento"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_enviodatosapimagentoinformacioncliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mtk" /*RemoteObject*/ )),(Object)(_idclientesel)));
this.state = 43;
return;
case 43:
//C
this.state = 1;
_sresp = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("sResp", _sresp);
;
 BA.debugLineNum = 1381;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("ERROR"))).<Boolean>get().booleanValue()) { 
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
 BA.debugLineNum = 1383;BA.debugLine="Dim parser As JSONParser";
Debug.ShouldStop(64);
_parser = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 1384;BA.debugLine="parser.Initialize(sResp)";
Debug.ShouldStop(128);
_parser.runVoidMethod ("Initialize",(Object)(_sresp));
 BA.debugLineNum = 1385;BA.debugLine="Dim root As Map = parser.NextObject";
Debug.ShouldStop(256);
_root = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_root = _parser.runMethod(false,"NextObject");Debug.locals.put("root", _root);Debug.locals.put("root", _root);
 BA.debugLineNum = 1389;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
Debug.ShouldStop(4096);
_store_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("store_id")))));Debug.locals.put("store_id", _store_id);Debug.locals.put("store_id", _store_id);
 BA.debugLineNum = 1390;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
Debug.ShouldStop(8192);
_firstname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("firstname")))));Debug.locals.put("firstname", _firstname);Debug.locals.put("firstname", _firstname);
 BA.debugLineNum = 1391;BA.debugLine="Dim addresses As List = root.Get(\"addresses\")";
Debug.ShouldStop(16384);
_addresses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_addresses = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("addresses")))));Debug.locals.put("addresses", _addresses);Debug.locals.put("addresses", _addresses);
 BA.debugLineNum = 1392;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
Debug.ShouldStop(32768);
_created_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_at")))));Debug.locals.put("created_at", _created_at);Debug.locals.put("created_at", _created_at);
 BA.debugLineNum = 1393;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
Debug.ShouldStop(65536);
_extension_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_extension_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("extension_attributes")))));Debug.locals.put("extension_attributes", _extension_attributes);Debug.locals.put("extension_attributes", _extension_attributes);
 BA.debugLineNum = 1394;BA.debugLine="Dim is_subscribed As String = extension_attribute";
Debug.ShouldStop(131072);
_is_subscribed = BA.ObjectToString(_extension_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("is_subscribed")))));Debug.locals.put("is_subscribed", _is_subscribed);Debug.locals.put("is_subscribed", _is_subscribed);
 BA.debugLineNum = 1395;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
Debug.ShouldStop(262144);
_lastname = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("lastname")))));Debug.locals.put("lastname", _lastname);Debug.locals.put("lastname", _lastname);
 BA.debugLineNum = 1396;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
Debug.ShouldStop(524288);
_custom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_custom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("custom_attributes", _custom_attributes);Debug.locals.put("custom_attributes", _custom_attributes);
 BA.debugLineNum = 1397;BA.debugLine="Dim code As String";
Debug.ShouldStop(1048576);
_code = RemoteObject.createImmutable("");Debug.locals.put("code", _code);
 BA.debugLineNum = 1398;BA.debugLine="Dim customer_code As String";
Debug.ShouldStop(2097152);
_customer_code = RemoteObject.createImmutable("");Debug.locals.put("customer_code", _customer_code);
 BA.debugLineNum = 1399;BA.debugLine="If custom_attributes.IsInitialized Then";
Debug.ShouldStop(4194304);
if (true) break;

case 7:
//if
this.state = 26;
if (_custom_attributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1400;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
Debug.ShouldStop(8388608);
if (true) break;

case 10:
//for
this.state = 25;
_colcustom_attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group18 = _custom_attributes;
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
this.state = 44;
if (true) break;

case 44:
//C
this.state = 25;
if (index18 < groupLen18) {
this.state = 12;
_colcustom_attributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group18.runMethod(false,"Get",index18));Debug.locals.put("colcustom_attributes", _colcustom_attributes);}
if (true) break;

case 45:
//C
this.state = 44;
index18++;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1401;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
Debug.ShouldStop(16777216);
_value = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("value")))));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 1402;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
Debug.ShouldStop(33554432);
_attribute_code = BA.ObjectToString(_colcustom_attributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))));Debug.locals.put("attribute_code", _attribute_code);Debug.locals.put("attribute_code", _attribute_code);
 BA.debugLineNum = 1403;BA.debugLine="If attribute_code=\"code\" Then code=value";
Debug.ShouldStop(67108864);
if (true) break;

case 13:
//if
this.state = 18;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("code"))) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_code = _value;Debug.locals.put("code", _code);
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 1404;BA.debugLine="If attribute_code=\"customer_code\" Then customer";
Debug.ShouldStop(134217728);
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",_attribute_code,BA.ObjectToString("customer_code"))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_customer_code = _value;Debug.locals.put("customer_code", _customer_code);
if (true) break;

case 24:
//C
this.state = 45;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
Debug.locals.put("colcustom_attributes", _colcustom_attributes);
;
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 1408;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
Debug.ShouldStop(-2147483648);
_updated_at = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("updated_at")))));Debug.locals.put("updated_at", _updated_at);Debug.locals.put("updated_at", _updated_at);
 BA.debugLineNum = 1409;BA.debugLine="Dim disable_auto_group_change As Int = root.Get(\"";
Debug.ShouldStop(1);
_disable_auto_group_change = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("disable_auto_group_change")))));Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);Debug.locals.put("disable_auto_group_change", _disable_auto_group_change);
 BA.debugLineNum = 1410;BA.debugLine="Dim group_id As Int = root.Get(\"group_id\")";
Debug.ShouldStop(2);
_group_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("group_id")))));Debug.locals.put("group_id", _group_id);Debug.locals.put("group_id", _group_id);
 BA.debugLineNum = 1411;BA.debugLine="Dim id As Int = root.Get(\"id\")";
Debug.ShouldStop(4);
_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id")))));Debug.locals.put("id", _id);Debug.locals.put("id", _id);
 BA.debugLineNum = 1412;BA.debugLine="Dim website_id As Int = root.Get(\"website_id\")";
Debug.ShouldStop(8);
_website_id = BA.numberCast(int.class, _root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("website_id")))));Debug.locals.put("website_id", _website_id);Debug.locals.put("website_id", _website_id);
 BA.debugLineNum = 1413;BA.debugLine="Dim email As String = root.Get(\"email\")";
Debug.ShouldStop(16);
_email = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("email")))));Debug.locals.put("email", _email);Debug.locals.put("email", _email);
 BA.debugLineNum = 1414;BA.debugLine="Dim created_in As String = root.Get(\"created_in\")";
Debug.ShouldStop(32);
_created_in = BA.ObjectToString(_root.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("created_in")))));Debug.locals.put("created_in", _created_in);Debug.locals.put("created_in", _created_in);
 BA.debugLineNum = 1415;BA.debugLine="For Each mAddress As Map In addresses";
Debug.ShouldStop(64);
if (true) break;

case 27:
//for
this.state = 42;
_maddress = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group32 = _addresses;
index32 = 0;
groupLen32 = group32.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mAddress", _maddress);
this.state = 46;
if (true) break;

case 46:
//C
this.state = 42;
if (index32 < groupLen32) {
this.state = 29;
_maddress = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group32.runMethod(false,"Get",index32));Debug.locals.put("mAddress", _maddress);}
if (true) break;

case 47:
//C
this.state = 46;
index32++;
Debug.locals.put("mAddress", _maddress);
if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 1416;BA.debugLine="Log(\"Address: \" & mAddress)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","849938478",RemoteObject.concat(RemoteObject.createImmutable("Address: "),_maddress),0);
 BA.debugLineNum = 1417;BA.debugLine="Dim lstAddressCustomAttributes As List=mAddress.";
Debug.ShouldStop(256);
_lstaddresscustomattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstaddresscustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _maddress.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("custom_attributes")))));Debug.locals.put("lstAddressCustomAttributes", _lstaddresscustomattributes);Debug.locals.put("lstAddressCustomAttributes", _lstaddresscustomattributes);
 BA.debugLineNum = 1418;BA.debugLine="If lstAddressCustomAttributes.IsInitialized Then";
Debug.ShouldStop(512);
if (true) break;

case 30:
//if
this.state = 41;
if (_lstaddresscustomattributes.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 1419;BA.debugLine="For Each mAddressCustomAttributes As Map In lst";
Debug.ShouldStop(1024);
if (true) break;

case 33:
//for
this.state = 40;
_maddresscustomattributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
group36 = _lstaddresscustomattributes;
index36 = 0;
groupLen36 = group36.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("mAddressCustomAttributes", _maddresscustomattributes);
this.state = 48;
if (true) break;

case 48:
//C
this.state = 40;
if (index36 < groupLen36) {
this.state = 35;
_maddresscustomattributes = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), group36.runMethod(false,"Get",index36));Debug.locals.put("mAddressCustomAttributes", _maddresscustomattributes);}
if (true) break;

case 49:
//C
this.state = 48;
index36++;
Debug.locals.put("mAddressCustomAttributes", _maddresscustomattributes);
if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 1420;BA.debugLine="Log(mAddressCustomAttributes)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","849938482",BA.ObjectToString(_maddresscustomattributes),0);
 BA.debugLineNum = 1421;BA.debugLine="If mAddressCustomAttributes.Get(\"attribute_cod";
Debug.ShouldStop(4096);
if (true) break;

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_maddresscustomattributes.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("attribute_code")))),RemoteObject.createImmutable(("code")))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 if (true) break;

case 39:
//C
this.state = 49;
;
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
Debug.locals.put("mAddressCustomAttributes", _maddresscustomattributes);
;
 if (true) break;

case 41:
//C
this.state = 47;
;
 BA.debugLineNum = 1426;BA.debugLine="Dim Street As List=mAddress.Get(\"Street\")";
Debug.ShouldStop(131072);
_street = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_street = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _maddress.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Street")))));Debug.locals.put("Street", _street);Debug.locals.put("Street", _street);
 BA.debugLineNum = 1435;BA.debugLine="mAddress.Put(\"code\",code)";
Debug.ShouldStop(67108864);
_maddress.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("code"))),(Object)((_code)));
 BA.debugLineNum = 1436;BA.debugLine="mAddress.Put(\"customer_code\",customer_code)";
Debug.ShouldStop(134217728);
_maddress.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("customer_code"))),(Object)((_customer_code)));
 BA.debugLineNum = 1445;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
Debug.ShouldStop(16);
parent._utilidades.runVoidMethod ("_insertarmapssolocamposcoincidentes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_msql" /*RemoteObject*/ )),(Object)(BA.ObjectToString("tblB2BDireccionesCliente")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_maddress.getObject())})))));
 if (true) break;
if (true) break;

case 42:
//C
this.state = -1;
Debug.locals.put("mAddress", _maddress);
;
 BA.debugLineNum = 1448;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 1449;BA.debugLine="End Sub";
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private fx As JFX";
cb2bfichapedidocliente._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");__ref.setField("_fx",cb2bfichapedidocliente._fx);
 //BA.debugLineNum = 3;BA.debugLine="Private frm As Form";
cb2bfichapedidocliente._frm = RemoteObject.createNew ("anywheresoftware.b4j.objects.Form");__ref.setField("_frm",cb2bfichapedidocliente._frm);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI";
cb2bfichapedidocliente._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cb2bfichapedidocliente._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private mSQL As SQL";
cb2bfichapedidocliente._msql = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL");__ref.setField("_msql",cb2bfichapedidocliente._msql);
 //BA.debugLineNum = 6;BA.debugLine="Private mIDPedidoCliente As Int";
cb2bfichapedidocliente._midpedidocliente = RemoteObject.createImmutable(0);__ref.setField("_midpedidocliente",cb2bfichapedidocliente._midpedidocliente);
 //BA.debugLineNum = 7;BA.debugLine="Private mDatosCabeceraPedidoCliente As TipoDatosC";
cb2bfichapedidocliente._mdatoscabecerapedidocliente = RemoteObject.createNew ("b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b");__ref.setField("_mdatoscabecerapedidocliente",cb2bfichapedidocliente._mdatoscabecerapedidocliente);
 //BA.debugLineNum = 8;BA.debugLine="Private mTk As String";
cb2bfichapedidocliente._mtk = RemoteObject.createImmutable("");__ref.setField("_mtk",cb2bfichapedidocliente._mtk);
 //BA.debugLineNum = 10;BA.debugLine="Private Dialog As B4XDialog";
cb2bfichapedidocliente._dialog = RemoteObject.createNew ("b4j.docU.b4xdialog");__ref.setField("_dialog",cb2bfichapedidocliente._dialog);
 //BA.debugLineNum = 11;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
cb2bfichapedidocliente._jamloadingindicator1 = RemoteObject.createNew ("b4j.docU.jamloadingindicator");__ref.setField("_jamloadingindicator1",cb2bfichapedidocliente._jamloadingindicator1);
 //BA.debugLineNum = 13;BA.debugLine="Private lblSalirB2BPedidoClienteFicha As B4XView";
cb2bfichapedidocliente._lblsalirb2bpedidoclienteficha = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lblsalirb2bpedidoclienteficha",cb2bfichapedidocliente._lblsalirb2bpedidoclienteficha);
 //BA.debugLineNum = 14;BA.debugLine="Private txtClienteERP As B4XView";
cb2bfichapedidocliente._txtclienteerp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtclienteerp",cb2bfichapedidocliente._txtclienteerp);
 //BA.debugLineNum = 15;BA.debugLine="Private txtComprador As B4XView";
cb2bfichapedidocliente._txtcomprador = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtcomprador",cb2bfichapedidocliente._txtcomprador);
 //BA.debugLineNum = 16;BA.debugLine="Private txtDireccionEnvioERP As B4XView";
cb2bfichapedidocliente._txtdireccionenvioerp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtdireccionenvioerp",cb2bfichapedidocliente._txtdireccionenvioerp);
 //BA.debugLineNum = 17;BA.debugLine="Private txtEmailComprador As B4XView";
cb2bfichapedidocliente._txtemailcomprador = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtemailcomprador",cb2bfichapedidocliente._txtemailcomprador);
 //BA.debugLineNum = 18;BA.debugLine="Private txtFechaCreacion As B4XView";
cb2bfichapedidocliente._txtfechacreacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtfechacreacion",cb2bfichapedidocliente._txtfechacreacion);
 //BA.debugLineNum = 19;BA.debugLine="Private txtFechaModificacion As B4XView";
cb2bfichapedidocliente._txtfechamodificacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtfechamodificacion",cb2bfichapedidocliente._txtfechamodificacion);
 //BA.debugLineNum = 20;BA.debugLine="Private txtIDPedido As B4XView";
cb2bfichapedidocliente._txtidpedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtidpedido",cb2bfichapedidocliente._txtidpedido);
 //BA.debugLineNum = 21;BA.debugLine="Private txtNombreClienteERP As B4XView";
cb2bfichapedidocliente._txtnombreclienteerp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombreclienteerp",cb2bfichapedidocliente._txtnombreclienteerp);
 //BA.debugLineNum = 22;BA.debugLine="Private txtNombreDireccionEnvioERP As B4XView";
cb2bfichapedidocliente._txtnombredireccionenvioerp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombredireccionenvioerp",cb2bfichapedidocliente._txtnombredireccionenvioerp);
 //BA.debugLineNum = 23;BA.debugLine="Private txtNombreTienda As B4XView";
cb2bfichapedidocliente._txtnombretienda = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombretienda",cb2bfichapedidocliente._txtnombretienda);
 //BA.debugLineNum = 24;BA.debugLine="Private txtOrdenCompra As B4XView";
cb2bfichapedidocliente._txtordencompra = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtordencompra",cb2bfichapedidocliente._txtordencompra);
 //BA.debugLineNum = 25;BA.debugLine="Private txtPedido As B4XView";
cb2bfichapedidocliente._txtpedido = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtpedido",cb2bfichapedidocliente._txtpedido);
 //BA.debugLineNum = 27;BA.debugLine="Type TipoDatosLineaPedidoClienteB2B (IDLinea As I";
;
 //BA.debugLineNum = 33;BA.debugLine="Private TabPaneInfoPedidoCliente As TabPane";
cb2bfichapedidocliente._tabpaneinfopedidocliente = RemoteObject.createNew ("anywheresoftware.b4j.objects.TabPaneWrapper");__ref.setField("_tabpaneinfopedidocliente",cb2bfichapedidocliente._tabpaneinfopedidocliente);
 //BA.debugLineNum = 34;BA.debugLine="Private jamTableViewLineasPedidoClienteB2B As jam";
cb2bfichapedidocliente._jamtableviewlineaspedidoclienteb2b = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewlineaspedidoclienteb2b",cb2bfichapedidocliente._jamtableviewlineaspedidoclienteb2b);
 //BA.debugLineNum = 35;BA.debugLine="Private jamTableViewLineasAlbaranesPedidoClienteB";
cb2bfichapedidocliente._jamtableviewlineasalbaranespedidoclienteb2b = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewlineasalbaranespedidoclienteb2b",cb2bfichapedidocliente._jamtableviewlineasalbaranespedidoclienteb2b);
 //BA.debugLineNum = 36;BA.debugLine="Private jamTableViewLineasFacturasPedidoClienteB2";
cb2bfichapedidocliente._jamtableviewlineasfacturaspedidoclienteb2b = RemoteObject.createNew ("b4j.docU.jamtableview");__ref.setField("_jamtableviewlineasfacturaspedidoclienteb2b",cb2bfichapedidocliente._jamtableviewlineasfacturaspedidoclienteb2b);
 //BA.debugLineNum = 39;BA.debugLine="Private txtDireccionFacturacion As B4XView";
cb2bfichapedidocliente._txtdireccionfacturacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtdireccionfacturacion",cb2bfichapedidocliente._txtdireccionfacturacion);
 //BA.debugLineNum = 40;BA.debugLine="Private txtNombreDireccionFacturacion As B4XView";
cb2bfichapedidocliente._txtnombredireccionfacturacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombredireccionfacturacion",cb2bfichapedidocliente._txtnombredireccionfacturacion);
 //BA.debugLineNum = 41;BA.debugLine="Private txtIDDireccionEnvio As B4XView";
cb2bfichapedidocliente._txtiddireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtiddireccionenvio",cb2bfichapedidocliente._txtiddireccionenvio);
 //BA.debugLineNum = 42;BA.debugLine="Private txtCodigoDireccionEnvioERP As B4XView";
cb2bfichapedidocliente._txtcodigodireccionenvioerp = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtcodigodireccionenvioerp",cb2bfichapedidocliente._txtcodigodireccionenvioerp);
 //BA.debugLineNum = 43;BA.debugLine="Private txtNombreDireccionEnvio As B4XView";
cb2bfichapedidocliente._txtnombredireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtnombredireccionenvio",cb2bfichapedidocliente._txtnombredireccionenvio);
 //BA.debugLineNum = 44;BA.debugLine="Private txtIDDireccionFacturacion As B4XView";
cb2bfichapedidocliente._txtiddireccionfacturacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtiddireccionfacturacion",cb2bfichapedidocliente._txtiddireccionfacturacion);
 //BA.debugLineNum = 45;BA.debugLine="Private txtCodigoDireccionFacturacion As B4XView";
cb2bfichapedidocliente._txtcodigodireccionfacturacion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtcodigodireccionfacturacion",cb2bfichapedidocliente._txtcodigodireccionfacturacion);
 //BA.debugLineNum = 46;BA.debugLine="Private txtDireccionEnvio As B4XView";
cb2bfichapedidocliente._txtdireccionenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_txtdireccionenvio",cb2bfichapedidocliente._txtdireccionenvio);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configuraciontableviews(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ConfiguracionTableViews (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("configuraciontableviews")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","configuraciontableviews", __ref);}
ResumableSub_ConfiguracionTableViews rsub = new ResumableSub_ConfiguracionTableViews(null,__ref);
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
public static class ResumableSub_ConfiguracionTableViews extends BA.ResumableSub {
public ResumableSub_ConfiguracionTableViews(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _rsub = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
RemoteObject _mres = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ConfiguracionTableViews (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,221);
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
 BA.debugLineNum = 226;BA.debugLine="jamTableViewLineasPedidoClienteB2B.EstadoMenuItem";
Debug.ShouldStop(2);
__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 227;BA.debugLine="jamTableViewLineasPedidoClienteB2B.EstadoMenuItem";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 229;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AddMenuItemFon";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Actualizar Datos Pedido")),(Object)(BA.ObjectToString("ActualizarDatosPedido")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf021)))))),(Object)(__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 230;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AddMenuItemFon";
Debug.ShouldStop(32);
__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_addmenuitemfontawesometomenuinmenubar" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Generar fichero CSV Pedido Venta")),(Object)(BA.ObjectToString("GenerarFicheroCSVPedido")),(Object)(BA.ObjectToString(parent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xf0f6)))))),(Object)(__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )));
 BA.debugLineNum = 232;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasPedido";
Debug.ShouldStop(128);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BLineasPedidoCliente.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 233;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _rsub);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 234;BA.debugLine="Log(mRes)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","848955405",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 235;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 236;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(2048);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 237;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _msa);
this.state = 10;
return;
case 10:
//C
this.state = 4;
;
 BA.debugLineNum = 238;BA.debugLine="frm.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 239;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 242;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AlturaFilas=0";
Debug.ShouldStop(131072);
__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 245;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Estad";
Debug.ShouldStop(1048576);
__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).getField(true,"_menubaracciones" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 246;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Estad";
Debug.ShouldStop(2097152);
__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_estadomenuitem" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).getField(true,"_menubarlinea" /*RemoteObject*/ )),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 250;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasAlbara";
Debug.ShouldStop(33554432);
_rsub = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper");
_rsub = __ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_configurartableview" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ListaB2BLineasAlbaranPedidoCliente.json")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));Debug.locals.put("rSub", _rsub);Debug.locals.put("rSub", _rsub);
 BA.debugLineNum = 251;BA.debugLine="wait for (rSub) complete (mRes As Map)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_mres = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("mRes", _mres);
;
 BA.debugLineNum = 252;BA.debugLine="Log(mRes)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","848955423",BA.ObjectToString(_mres),0);
 BA.debugLineNum = 253;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 254;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
Debug.ShouldStop(536870912);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)(RemoteObject.concat(_mres.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("msgError")))),parent.__c.getField(true,"CRLF"),parent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Avisa al administrador de la aplicación."))),(Object)(RemoteObject.createImmutable("Error")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 255;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 8;
;
 BA.debugLineNum = 256;BA.debugLine="frm.Close";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 257;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 260;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Altur";
Debug.ShouldStop(8);
__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_setalturafilas",BA.numberCast(double.class, 0));
 BA.debugLineNum = 261;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Asign";
Debug.ShouldStop(16);
__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_asignarcellfactorycolumnafecha" /*RemoteObject*/ ,(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("FechaAlbaran"))})))));
 BA.debugLineNum = 263;BA.debugLine="Return Null";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 BA.debugLineNum = 264;BA.debugLine="End Sub";
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
public static RemoteObject  _creaciontablassqlite(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreacionTablasSQLite (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("creaciontablassqlite")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","creaciontablassqlite", __ref);}
RemoteObject _screartabla = RemoteObject.createImmutable("");
 BA.debugLineNum = 197;BA.debugLine="Sub CreacionTablasSQLite";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BLin";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BLineasPedidoCliente")));
 BA.debugLineNum = 199;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(64);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BLineasPedidoCliente] (\n"),RemoteObject.createImmutable("		IDLinea INTEGER, LineaPedido INTEGER default 0, IDProductoB2B INTEGER, TipoItem TEXT, \n"),RemoteObject.createImmutable("		ItemSKU TEXT, UNSPSC TEXT, \n"),RemoteObject.createImmutable("		DescripcionProductoB2B TEXT, TallaB2B TEXT, \n"),RemoteObject.createImmutable("		QtyPedida INTEGER, QtyEnviada INTEGER, QtyFacturada INTEGER, QtyPteEnviar INTEGER default 0, QtyEnviadaPteFacturar INTEGER default 0, Precio REAL, UOMB2B TEXT, \n"),RemoteObject.createImmutable("		TipoIVA REAL, ImporteIVA REAL, ItemParentSKU TEXT, CodigoArticuloNAV TEXT default ''\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 206;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 208;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BLin";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("drop table if exists tblB2BLineasAlbaranPedidoCliente")));
 BA.debugLineNum = 209;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
Debug.ShouldStop(65536);
_screartabla = (RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE If Not EXISTS [tblB2BLineasAlbaranPedidoCliente] (\n"),RemoteObject.createImmutable("		Albaran TEXT, FechaAlbaran INTEGER,\n"),RemoteObject.createImmutable("		LineaAlbaran INTEGER default 0, LineaPedido INTEGER default 0, IDProductoB2B INTEGER,\n"),RemoteObject.createImmutable("		ItemSKU TEXT,\n"),RemoteObject.createImmutable("		DescripcionProductoB2B TEXT, TallaB2B TEXT, \n"),RemoteObject.createImmutable("		QtyEnviada INTEGER, UOMB2B TEXT, \n"),RemoteObject.createImmutable("		ItemParentSKU TEXT, CodigoArticuloNAV TEXT default ''\n"),RemoteObject.createImmutable("	)")));Debug.locals.put("sCrearTabla", _screartabla);Debug.locals.put("sCrearTabla", _screartabla);
 BA.debugLineNum = 217;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("ExecNonQuery",(Object)(_screartabla));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enviodatosapimagentoalbaranespedido(RemoteObject __ref,RemoteObject _token,RemoteObject _idpedidosel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoAlbaranesPedido (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1097);
if (RapidSub.canDelegate("enviodatosapimagentoalbaranespedido")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","enviodatosapimagentoalbaranespedido", __ref, _token, _idpedidosel);}
ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido rsub = new ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido(null,__ref,_token,_idpedidosel);
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
public static class ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idpedidosel = _idpedidosel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _token;
RemoteObject _idpedidosel;
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoAlbaranesPedido (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1097);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDPedidoSel", _idpedidosel);
 BA.debugLineNum = 1100;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(2048);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/shipments/?\n"),RemoteObject.createImmutable("	searchCriteria[pageSize] = 0&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][field]=order_id&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idpedidosel))),RemoteObject.createImmutable("&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=eq")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1107;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(262144);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1108;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(524288);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1110;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(2097152);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1112;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1113;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1115;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 1117;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoalbaranespedido"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1119;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 1120;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","849479703",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1121;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","849479704",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1122;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(2);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1123;BA.debugLine="j.Release";
Debug.ShouldStop(4);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1124;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1127;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(64);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1128;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1129;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(256);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1131;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static RemoteObject  _enviodatosapimagentoinformacioncliente(RemoteObject __ref,RemoteObject _token,RemoteObject _idcliente) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1454);
if (RapidSub.canDelegate("enviodatosapimagentoinformacioncliente")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","enviodatosapimagentoinformacioncliente", __ref, _token, _idcliente);}
ResumableSub_EnvioDatosAPIMagentoInformacionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionCliente(null,__ref,_token,_idcliente);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionCliente(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idcliente) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idcliente = _idcliente;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _token;
RemoteObject _idcliente;
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1454);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDCliente", _idcliente);
 BA.debugLineNum = 1456;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(32768);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1457;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(65536);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1459;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(262144);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idcliente))),RemoteObject.createImmutable("")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1461;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1463;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1464;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1466;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 1468;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacioncliente"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1470;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 1471;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","850003985",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1472;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","850003986",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1473;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(1);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1474;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1475;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1478;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(32);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1479;BA.debugLine="j.Release";
Debug.ShouldStop(64);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1480;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1482;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformaciondireccioncliente(RemoteObject __ref,RemoteObject _token,RemoteObject _iddireccionsel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionDireccionCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1293);
if (RapidSub.canDelegate("enviodatosapimagentoinformaciondireccioncliente")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","enviodatosapimagentoinformaciondireccioncliente", __ref, _token, _iddireccionsel);}
ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente(null,__ref,_token,_iddireccionsel);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _token,RemoteObject _iddireccionsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._iddireccionsel = _iddireccionsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _token;
RemoteObject _iddireccionsel;
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionDireccionCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1293);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDDireccionSel", _iddireccionsel);
 BA.debugLineNum = 1296;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(32768);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/customers/addresses/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_iddireccionsel))),RemoteObject.createImmutable("")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1298;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(131072);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1299;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(262144);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1301;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(1048576);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1303;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1304;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1306;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 1308;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformaciondireccioncliente"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1310;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 1311;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","849807378",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1312;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","849807379",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1313;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(1);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1314;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1315;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1318;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(32);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1319;BA.debugLine="j.Release";
Debug.ShouldStop(64);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1320;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1322;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacionpedidocliente(RemoteObject __ref,RemoteObject _token,RemoteObject _idsel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("enviodatosapimagentoinformacionpedidocliente")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","enviodatosapimagentoinformacionpedidocliente", __ref, _token, _idsel);}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(null,__ref,_token,_idsel);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idsel = _idsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _token;
RemoteObject _idsel;
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoCliente (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,267);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDSel", _idsel);
 BA.debugLineNum = 270;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-web";
Debug.ShouldStop(8192);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/orders/"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idsel))),RemoteObject.createImmutable("")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 278;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(2097152);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 279;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(4194304);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 281;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(16777216);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 283;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(67108864);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 284;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(134217728);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 286;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(536870912);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 288;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacionpedidocliente"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 290;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 291;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","849020952",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 292;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","849020953",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 293;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(16);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 294;BA.debugLine="j.Release";
Debug.ShouldStop(32);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 295;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 298;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(512);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 299;BA.debugLine="j.Release";
Debug.ShouldStop(1024);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 300;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(2048);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 302;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacionpedidoclientesearch(RemoteObject __ref,RemoteObject _token,RemoteObject _idsel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoClienteSearch (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1198);
if (RapidSub.canDelegate("enviodatosapimagentoinformacionpedidoclientesearch")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","enviodatosapimagentoinformacionpedidoclientesearch", __ref, _token, _idsel);}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch(null,__ref,_token,_idsel);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idsel = _idsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _token;
RemoteObject _idsel;
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoClienteSearch (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1198);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDSel", _idsel);
 BA.debugLineNum = 1201;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(65536);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][field]=entity_id&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idsel))),RemoteObject.createImmutable("&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=eq")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1207;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(4194304);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1208;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(8388608);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1210;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(33554432);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1212;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
Debug.ShouldStop(134217728);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1213;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
Debug.ShouldStop(268435456);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Bearer "),_token)));
 BA.debugLineNum = 1215;BA.debugLine="job.GetRequest.Timeout=15000";
Debug.ShouldStop(1073741824);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runMethod(true,"setTimeout",BA.numberCast(int.class, 15000));
 BA.debugLineNum = 1217;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacionpedidoclientesearch"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1219;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 1220;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","849676310",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1221;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","849676311",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1222;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(32);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1223;BA.debugLine="j.Release";
Debug.ShouldStop(64);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1224;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1227;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(1024);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1228;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1229;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(4096);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1231;BA.debugLine="End Sub";
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
public static RemoteObject  _enviodatosapimagentoinformacionpedidoclientesearchgraphql(RemoteObject __ref,RemoteObject _token,RemoteObject _idsel) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1325);
if (RapidSub.canDelegate("enviodatosapimagentoinformacionpedidoclientesearchgraphql")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","enviodatosapimagentoinformacionpedidoclientesearchgraphql", __ref, _token, _idsel);}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL(null,__ref,_token,_idsel);
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
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _token,RemoteObject _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idsel = _idsel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _token;
RemoteObject _idsel;
RemoteObject _squeryapi = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _j = RemoteObject.declareNull("b4j.docU.httpjob");
RemoteObject _srespuestawebservice = RemoteObject.createImmutable("");
RemoteObject _serrorjobresponse = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1325);
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
Debug.locals.put("Token", _token);
Debug.locals.put("IDSel", _idsel);
 BA.debugLineNum = 1328;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
Debug.ShouldStop(32768);
_squeryapi = (RemoteObject.concat(RemoteObject.createImmutable("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][field]=entity_id&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][value]="),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_idsel))),RemoteObject.createImmutable("&\n"),RemoteObject.createImmutable("	searchCriteria[filterGroups][0][filters][0][condition_type]=eq")));Debug.locals.put("sQueryAPI", _squeryapi);Debug.locals.put("sQueryAPI", _squeryapi);
 BA.debugLineNum = 1344;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(-2147483648);
_job = RemoteObject.createNew ("b4j.docU.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 1345;BA.debugLine="job.Initialize(\"\", Me)";
Debug.ShouldStop(1);
_job.runClassMethod (b4j.docU.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 1346;BA.debugLine="job.Download($\"https://www.../graphql?query={your";
Debug.ShouldStop(2);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("https://www.../graphql?query={yourQuery}"))));
 BA.debugLineNum = 1347;BA.debugLine="job.Download(sQueryAPI)";
Debug.ShouldStop(4);
_job.runClassMethod (b4j.docU.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(_squeryapi));
 BA.debugLineNum = 1349;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
Debug.ShouldStop(16);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1350;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", $\"Beare";
Debug.ShouldStop(32);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Authorization")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Bearer "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_token))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 1351;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"application/j";
Debug.ShouldStop(64);
_job.runClassMethod (b4j.docU.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetHeader",(Object)(BA.ObjectToString("Accept")),(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 1353;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacionpedidoclientesearchgraphql"), (_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1355;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 1356;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","849872927",RemoteObject.concat(RemoteObject.createImmutable("job.response.StatusCode: "),_job.getField(false,"_response" /*RemoteObject*/ ).runMethod(true,"getStatusCode")),0);
 BA.debugLineNum = 1357;BA.debugLine="Log(j.GetString)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","849872928",_j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1358;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
Debug.ShouldStop(8192);
_srespuestawebservice = _j.runClassMethod (b4j.docU.httpjob.class, "_getstring" /*RemoteObject*/ );Debug.locals.put("sRespuestaWebService", _srespuestawebservice);Debug.locals.put("sRespuestaWebService", _srespuestawebservice);
 BA.debugLineNum = 1359;BA.debugLine="j.Release";
Debug.ShouldStop(16384);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1360;BA.debugLine="Return sRespuestaWebService";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 1363;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
Debug.ShouldStop(262144);
_serrorjobresponse = RemoteObject.concat(RemoteObject.createImmutable("ERROR HTTPJob "),_j.getField(true,"_errormessage" /*RemoteObject*/ ));Debug.locals.put("sErrorJobResponse", _serrorjobresponse);Debug.locals.put("sErrorJobResponse", _serrorjobresponse);
 BA.debugLineNum = 1364;BA.debugLine="j.Release";
Debug.ShouldStop(524288);
_j.runClassMethod (b4j.docU.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 1365;BA.debugLine="Return sErrorJobResponse";
Debug.ShouldStop(1048576);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 1367;BA.debugLine="End Sub";
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
public static RemoteObject  _frm_closerequest(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("frm_CloseRequest (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("frm_closerequest")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","frm_closerequest", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 125;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="EventData.Consume";
Debug.ShouldStop(536870912);
_eventdata.runVoidMethod ("Consume");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _generarcsvpedidoventa(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GenerarCSVPedidoVenta (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1490);
if (RapidSub.canDelegate("generarcsvpedidoventa")) { __ref.runUserSub(false, "cb2bfichapedidocliente","generarcsvpedidoventa", __ref); return;}
ResumableSub_GenerarCSVPedidoVenta rsub = new ResumableSub_GenerarCSVPedidoVenta(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GenerarCSVPedidoVenta extends BA.ResumableSub {
public ResumableSub_GenerarCSVPedidoVenta(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _dateformatant = RemoteObject.createImmutable("");
RemoteObject _lstlineaspedidoventa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _uuidpedido = RemoteObject.createImmutable("");
RemoteObject _documentoexterno = RemoteObject.createImmutable("");
RemoteObject _sfechapedidocliente = RemoteObject.createImmutable("");
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _rs = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
RemoteObject _datoslineapedido = null;
RemoteObject _lstheaders = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _carpetaficherocsv = RemoteObject.createImmutable("");
RemoteObject _nombreficherocsv = RemoteObject.createImmutable("");
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _msa = RemoteObject.declareNull("Object");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GenerarCSVPedidoVenta (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1490);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1492;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
Debug.ShouldStop(524288);
_dateformatant = parent.__c.getField(false,"DateTime").runMethod(true,"getDateFormat");Debug.locals.put("DateFormatAnt", _dateformatant);Debug.locals.put("DateFormatAnt", _dateformatant);
 BA.debugLineNum = 1493;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(1048576);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1495;BA.debugLine="Dim lstLineasPedidoVenta As List";
Debug.ShouldStop(4194304);
_lstlineaspedidoventa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lstLineasPedidoVenta", _lstlineaspedidoventa);
 BA.debugLineNum = 1496;BA.debugLine="lstLineasPedidoVenta.Initialize";
Debug.ShouldStop(8388608);
_lstlineaspedidoventa.runVoidMethod ("Initialize");
 BA.debugLineNum = 1498;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUIDv4";
Debug.ShouldStop(33554432);
_uuidpedido = parent._utilidades.runMethod(true,"_generaruuidv4" /*RemoteObject*/ );Debug.locals.put("UUIDPedido", _uuidpedido);Debug.locals.put("UUIDPedido", _uuidpedido);
 BA.debugLineNum = 1499;BA.debugLine="Dim DocumentoExterno As String";
Debug.ShouldStop(67108864);
_documentoexterno = RemoteObject.createImmutable("");Debug.locals.put("DocumentoExterno", _documentoexterno);
 BA.debugLineNum = 1501;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
Debug.ShouldStop(268435456);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 1502;BA.debugLine="Dim sFechaPedidoCliente As String=DateTime.Date(m";
Debug.ShouldStop(536870912);
_sfechapedidocliente = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"FechaCreacion" /*RemoteObject*/ )));Debug.locals.put("sFechaPedidoCliente", _sfechapedidocliente);Debug.locals.put("sFechaPedidoCliente", _sfechapedidocliente);
 BA.debugLineNum = 1503;BA.debugLine="DateTime.Dateformat=DateFormatAnt";
Debug.ShouldStop(1073741824);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1505;BA.debugLine="Dim sSQL As String=\"select CodigoArticuloNAV, Tal";
Debug.ShouldStop(1);
_ssql = BA.ObjectToString("select CodigoArticuloNAV, TallaB2B, QtyPedida, Precio from tblB2BLineasPedidoCliente order by LineaPedido");Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 1506;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(sSQL)";
Debug.ShouldStop(2);
_rs = RemoteObject.createNew ("anywheresoftware.b4j.objects.SQL.ResultSetWrapper");
_rs = __ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(false,"ExecQuery",(Object)(_ssql));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 1507;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 1509;BA.debugLine="Dim DatosLineaPedido(12) As String";
Debug.ShouldStop(16);
_datoslineapedido = RemoteObject.createNewArray ("String", new int[] {12}, new Object[]{});Debug.locals.put("DatosLineaPedido", _datoslineapedido);
 BA.debugLineNum = 1510;BA.debugLine="DatosLineaPedido(0)=$\"${UUIDPedido}\"$";
Debug.ShouldStop(32);
_datoslineapedido.setArrayElement ((RemoteObject.concat(RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable(""))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1511;BA.debugLine="DatosLineaPedido(1)=Main.DatosUsuario.NombreADUs";
Debug.ShouldStop(64);
_datoslineapedido.setArrayElement (parent._main._datosusuario /*RemoteObject*/ .getField(true,"NombreADUsuarioWindows" /*RemoteObject*/ ),BA.numberCast(int.class, 1));
 BA.debugLineNum = 1512;BA.debugLine="DatosLineaPedido(2)=mDatosCabeceraPedidoCliente.";
Debug.ShouldStop(128);
_datoslineapedido.setArrayElement (__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"CodigoClienteERP" /*RemoteObject*/ ),BA.numberCast(int.class, 2));
 BA.debugLineNum = 1513;BA.debugLine="DatosLineaPedido(3)=mDatosCabeceraPedidoCliente.";
Debug.ShouldStop(256);
_datoslineapedido.setArrayElement (__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"CodigoDireccionEnvioERP" /*RemoteObject*/ ),BA.numberCast(int.class, 3));
 BA.debugLineNum = 1514;BA.debugLine="DatosLineaPedido(4)=mDatosCabeceraPedidoCliente.";
Debug.ShouldStop(512);
_datoslineapedido.setArrayElement (__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"OrdenCompra" /*RemoteObject*/ ),BA.numberCast(int.class, 4));
 BA.debugLineNum = 1515;BA.debugLine="DatosLineaPedido(5)=\"0001\"";
Debug.ShouldStop(1024);
_datoslineapedido.setArrayElement (BA.ObjectToString("0001"),BA.numberCast(int.class, 5));
 BA.debugLineNum = 1516;BA.debugLine="DatosLineaPedido(6)=sFechaPedidoCliente";
Debug.ShouldStop(2048);
_datoslineapedido.setArrayElement (_sfechapedidocliente,BA.numberCast(int.class, 6));
 BA.debugLineNum = 1517;BA.debugLine="DatosLineaPedido(7)=rs.GetString(\"CodigoArticulo";
Debug.ShouldStop(4096);
_datoslineapedido.setArrayElement (_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("CodigoArticuloNAV"))),BA.numberCast(int.class, 7));
 BA.debugLineNum = 1518;BA.debugLine="DatosLineaPedido(8)=\"\"";
Debug.ShouldStop(8192);
_datoslineapedido.setArrayElement (BA.ObjectToString(""),BA.numberCast(int.class, 8));
 BA.debugLineNum = 1519;BA.debugLine="DatosLineaPedido(9)=rs.GetString(\"TallaB2B\")";
Debug.ShouldStop(16384);
_datoslineapedido.setArrayElement (_rs.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("TallaB2B"))),BA.numberCast(int.class, 9));
 BA.debugLineNum = 1520;BA.debugLine="DatosLineaPedido(10)=rs.GetDouble(\"QtyPedida\")";
Debug.ShouldStop(32768);
_datoslineapedido.setArrayElement (BA.NumberToString(_rs.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("QtyPedida")))),BA.numberCast(int.class, 10));
 BA.debugLineNum = 1521;BA.debugLine="DatosLineaPedido(11)=rs.GetDouble(\"Precio\")";
Debug.ShouldStop(65536);
_datoslineapedido.setArrayElement (BA.NumberToString(_rs.runMethod(true,"GetDouble",(Object)(RemoteObject.createImmutable("Precio")))),BA.numberCast(int.class, 11));
 BA.debugLineNum = 1523;BA.debugLine="lstLineasPedidoVenta.Add(DatosLineaPedido)";
Debug.ShouldStop(262144);
_lstlineaspedidoventa.runVoidMethod ("Add",(Object)((_datoslineapedido)));
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 1525;BA.debugLine="rs.Close";
Debug.ShouldStop(1048576);
_rs.runVoidMethod ("Close");
 BA.debugLineNum = 1527;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
Debug.ShouldStop(4194304);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",_dateformatant);
 BA.debugLineNum = 1528;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
Debug.ShouldStop(8388608);
_lstheaders = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lstheaders = parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {12},new Object[] {BA.ObjectToString("Docuware ID"),BA.ObjectToString("Usuario"),BA.ObjectToString("Cliente"),BA.ObjectToString("DireccionEnvio"),BA.ObjectToString("DocumentoExterno"),BA.ObjectToString("AlmacenOrigen"),BA.ObjectToString("FechaPedidoCliente"),BA.ObjectToString("Articulo"),BA.ObjectToString("ReferenciaCruzada"),BA.ObjectToString("Talla"),BA.ObjectToString("Cantidad"),RemoteObject.createImmutable("Precio")})));Debug.locals.put("lstHeaders", _lstheaders);Debug.locals.put("lstHeaders", _lstheaders);
 BA.debugLineNum = 1530;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\P";
Debug.ShouldStop(33554432);
_carpetaficherocsv = BA.ObjectToString("\\\\192.168.10.6\\PendientesNAV");Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);Debug.locals.put("CarpetaFicheroCSV", _carpetaficherocsv);
 BA.debugLineNum = 1531;BA.debugLine="Dim NombreFicheroCSV As String=$\"B2B_${UUIDPedido";
Debug.ShouldStop(67108864);
_nombreficherocsv = (RemoteObject.concat(RemoteObject.createImmutable("B2B_"),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_uuidpedido))),RemoteObject.createImmutable(".csv")));Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);Debug.locals.put("NombreFicheroCSV", _nombreficherocsv);
 BA.debugLineNum = 1532;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(134217728);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 1533;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 5:
//try
this.state = 10;
this.catchState = 9;
this.state = 7;
if (true) break;

case 7:
//C
this.state = 10;
this.catchState = 9;
 BA.debugLineNum = 1534;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,\"";
Debug.ShouldStop(536870912);
_su.runVoidMethod ("SaveCSV2",(Object)(_carpetaficherocsv),(Object)(_nombreficherocsv),(Object)(BA.ObjectToChar(";")),(Object)(_lstlineaspedidoventa),(Object)(_lstheaders));
 BA.debugLineNum = 1535;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Fichero ${No";
Debug.ShouldStop(1073741824);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("Fichero "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombreficherocsv))),RemoteObject.createImmutable(" creado en la carpeta del servidor.\n"),RemoteObject.createImmutable("Queda pendiente de convertir en Pedido de Venta en navision. Procésalo mediante el módulo de integración de pedidos de venta de navision.")))),(Object)(RemoteObject.createImmutable("Aviso")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1537;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "generarcsvpedidoventa"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 BA.debugLineNum = 1539;BA.debugLine="Log(LastException)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","850069553",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1540;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
Debug.ShouldStop(8);
_msa = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"MsgboxAsync",__ref.getField(false, "ba"),(Object)((RemoteObject.concat(RemoteObject.createImmutable("No ha sido posible generar el fichero CSV.\n"),RemoteObject.createImmutable(""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")))),RemoteObject.createImmutable(".")))),(Object)(RemoteObject.createImmutable("ERROR")));Debug.locals.put("msa", _msa);Debug.locals.put("msa", _msa);
 BA.debugLineNum = 1542;BA.debugLine="Wait For (msa) Msgbox_Result";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "generarcsvpedidoventa"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1545;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static RemoteObject  _generatestring(RemoteObject __ref,RemoteObject _table,RemoteObject _separatorchar) throws Exception{
try {
		Debug.PushSubsStack("GenerateString (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1610);
if (RapidSub.canDelegate("generatestring")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","generatestring", __ref, _table, _separatorchar);}
RemoteObject _eol = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _row = null;
int _i = 0;
RemoteObject _wrap = RemoteObject.createImmutable(false);
RemoteObject _word = RemoteObject.createImmutable("");
Debug.locals.put("Table", _table);
Debug.locals.put("SeparatorChar", _separatorchar);
 BA.debugLineNum = 1610;BA.debugLine="Sub GenerateString (Table As List, SeparatorChar A";
Debug.ShouldStop(512);
 BA.debugLineNum = 1611;BA.debugLine="Dim eol As String = Chr(10)";
Debug.ShouldStop(1024);
_eol = BA.ObjectToString(cb2bfichapedidocliente.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("eol", _eol);Debug.locals.put("eol", _eol);
 BA.debugLineNum = 1612;BA.debugLine="If Table.Size = 0 Then Return \"\"";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_table.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
if (true) return BA.ObjectToString("");};
 BA.debugLineNum = 1613;BA.debugLine="Dim sb As StringBuilder";
Debug.ShouldStop(4096);
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1614;BA.debugLine="sb.Initialize";
Debug.ShouldStop(8192);
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1615;BA.debugLine="For Each row() As String In Table";
Debug.ShouldStop(16384);
{
final RemoteObject group5 = _table;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (group5.runMethod(false,"Get",index5));Debug.locals.put("row", _row);
Debug.locals.put("row", _row);
 BA.debugLineNum = 1616;BA.debugLine="For i = 0 To row.Length - 1";
Debug.ShouldStop(32768);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_row.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1617;BA.debugLine="Dim Wrap As Boolean";
Debug.ShouldStop(65536);
_wrap = RemoteObject.createImmutable(false);Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 1618;BA.debugLine="Dim word As String = row(i)";
Debug.ShouldStop(131072);
_word = _row.getArrayElement(true,BA.numberCast(int.class, _i));Debug.locals.put("word", _word);Debug.locals.put("word", _word);
 BA.debugLineNum = 1619;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
Debug.ShouldStop(262144);
if (_word.runMethod(true,"contains",(Object)(_separatorchar)).<Boolean>get().booleanValue()) { 
_wrap = cb2bfichapedidocliente.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);};
 BA.debugLineNum = 1620;BA.debugLine="If word.Contains(QUOTE) Then";
Debug.ShouldStop(524288);
if (_word.runMethod(true,"contains",(Object)(cb2bfichapedidocliente.__c.getField(true,"QUOTE"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1621;BA.debugLine="Wrap = True";
Debug.ShouldStop(1048576);
_wrap = cb2bfichapedidocliente.__c.getField(true,"True");Debug.locals.put("Wrap", _wrap);
 BA.debugLineNum = 1622;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
Debug.ShouldStop(2097152);
_word = _word.runMethod(true,"replace",(Object)(cb2bfichapedidocliente.__c.getField(true,"QUOTE")),(Object)((RemoteObject.createImmutable("\"\""))));Debug.locals.put("word", _word);
 };
 BA.debugLineNum = 1624;BA.debugLine="If Wrap Then";
Debug.ShouldStop(8388608);
if (_wrap.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1625;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
Debug.ShouldStop(16777216);
_sb.runMethod(false,"Append",(Object)(cb2bfichapedidocliente.__c.getField(true,"QUOTE"))).runMethod(false,"Append",(Object)(_word)).runVoidMethod ("Append",(Object)(cb2bfichapedidocliente.__c.getField(true,"QUOTE")));
 }else {
 BA.debugLineNum = 1627;BA.debugLine="sb.Append(word)";
Debug.ShouldStop(67108864);
_sb.runVoidMethod ("Append",(Object)(_word));
 };
 BA.debugLineNum = 1629;BA.debugLine="sb.Append(SeparatorChar)";
Debug.ShouldStop(268435456);
_sb.runVoidMethod ("Append",(Object)(_separatorchar));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1631;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
Debug.ShouldStop(1073741824);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),RemoteObject.createImmutable(1)}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 1632;BA.debugLine="sb.Append(eol)";
Debug.ShouldStop(-2147483648);
_sb.runVoidMethod ("Append",(Object)(_eol));
 }
}Debug.locals.put("row", _row);
;
 BA.debugLineNum = 1634;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
Debug.ShouldStop(2);
_sb.runVoidMethod ("Remove",(Object)(RemoteObject.solve(new RemoteObject[] {_sb.runMethod(true,"getLength"),_eol.runMethod(true,"length")}, "-",1, 1)),(Object)(_sb.runMethod(true,"getLength")));
 BA.debugLineNum = 1635;BA.debugLine="Return sb.ToString";
Debug.ShouldStop(4);
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 1636;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getform(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getForm (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("getform")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","getform", __ref);}
 BA.debugLineNum = 121;BA.debugLine="Sub getForm As Form";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Return frm";
Debug.ShouldStop(33554432);
if (true) return __ref.getField(false,"_frm" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _inicio(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Inicio (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("inicio")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","inicio", __ref);}
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
public ResumableSub_Inicio(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _robj = RemoteObject.declareNull("Object");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Inicio (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,140);
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
 BA.debugLineNum = 144;BA.debugLine="wait for(ConfiguracionTableViews) complete (rObj";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "inicio"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_configuraciontableviews" /*RemoteObject*/ ));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_robj = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("rObj", _robj);
;
 BA.debugLineNum = 146;BA.debugLine="wait for (CargaDatosPedidoCliente(mIDPedidoClient";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "inicio"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_cargadatospedidocliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_midpedidocliente" /*RemoteObject*/ ))));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 147;BA.debugLine="If Success=False Then Return False";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
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
 BA.debugLineNum = 149;BA.debugLine="Wait For(ActualizarDatosLineasPedido) complete (S";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "inicio"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_actualizardatoslineaspedido" /*RemoteObject*/ ));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 150;BA.debugLine="If Success=False Then Return False";
Debug.ShouldStop(2097152);
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
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 152;BA.debugLine="Wait For(CargaInfoDireccionesClienteMagento(mDato";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "inicio"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_cargainfodireccionesclientemagento" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDCliente" /*RemoteObject*/ ))));
this.state = 32;
return;
case 32:
//C
this.state = 13;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 153;BA.debugLine="If Not(Success) Then Return False";
Debug.ShouldStop(16777216);
if (true) break;

case 13:
//if
this.state = 18;
if (parent.__c.runMethod(true,"Not",(Object)(_success)).<Boolean>get().booleanValue()) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
 BA.debugLineNum = 161;BA.debugLine="If mDatosCabeceraPedidoCliente.IDDireccionEnvio>0";
Debug.ShouldStop(1);
if (true) break;

case 19:
//if
this.state = 28;
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDDireccionEnvio" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 162;BA.debugLine="Wait For(CargaDatosDireccionCliente(mDatosCabece";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "inicio"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_cargadatosdireccioncliente" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).getField(true,"IDDireccionEnvio" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("Envio"))));
this.state = 33;
return;
case 33:
//C
this.state = 22;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 163;BA.debugLine="If Success=False Then Return False";
Debug.ShouldStop(4);
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"False")));return;};
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
 BA.debugLineNum = 166;BA.debugLine="ActualizarDatosCabecera";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_actualizardatoscabecera" /*RemoteObject*/ );
 BA.debugLineNum = 168;BA.debugLine="Return True";
Debug.ShouldStop(128);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(parent.__c.getField(true,"True")));return;};
 BA.debugLineNum = 169;BA.debugLine="End Sub";
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _idpedidocliente,RemoteObject _tk) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","initialize", __ref, _ba, _idpedidocliente, _tk);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("IDPedidoCliente", _idpedidocliente);
Debug.locals.put("tk", _tk);
 BA.debugLineNum = 50;BA.debugLine="Public Sub Initialize(IDPedidoCliente As Int, tk A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 54;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runVoidMethod ("InitializeSQLite",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(RemoteObject.concat(cb2bfichapedidocliente._main._nombreaplicacion /*RemoteObject*/ ,RemoteObject.createImmutable(".db"))),(Object)(cb2bfichapedidocliente.__c.getField(true,"True")));
 BA.debugLineNum = 60;BA.debugLine="mDatosCabeceraPedidoCliente.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_mdatoscabecerapedidocliente" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="mIDPedidoCliente=IDPedidoCliente";
Debug.ShouldStop(1073741824);
__ref.setField ("_midpedidocliente" /*RemoteObject*/ ,_idpedidocliente);
 BA.debugLineNum = 67;BA.debugLine="mTk=tk";
Debug.ShouldStop(4);
__ref.setField ("_mtk" /*RemoteObject*/ ,_tk);
 BA.debugLineNum = 69;BA.debugLine="CreacionTablasSQLite";
Debug.ShouldStop(16);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_creaciontablassqlite" /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="Show";
Debug.ShouldStop(64);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_show" /*void*/ );
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action(RemoteObject __ref,RemoteObject _tagmenuitem) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,983);
if (RapidSub.canDelegate("jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action")) { __ref.runUserSub(false, "cb2bfichapedidocliente","jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action", __ref, _tagmenuitem); return;}
ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action(null,__ref,_tagmenuitem);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _tagmenuitem;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,983);
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
 BA.debugLineNum = 985;BA.debugLine="Select Case TagMenuItem";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//select
this.state = 14;
switch (BA.switchObjectToInt(_tagmenuitem,BA.ObjectToString("ActualizarDatosPedido"),BA.ObjectToString("GenerarFicheroCSVPedido"))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 988;BA.debugLine="wait for (CargaDatosPedidoCliente(mIDPedidoClie";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_cargadatospedidocliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_midpedidocliente" /*RemoteObject*/ ))));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 989;BA.debugLine="If Success=False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 990;BA.debugLine="SalirModulo";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 991;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 993;BA.debugLine="Wait For(ActualizarDatosLineasPedido) complete";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_actualizardatoslineaspedido" /*RemoteObject*/ ));
this.state = 16;
return;
case 16:
//C
this.state = 8;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 994;BA.debugLine="If Success=False Then";
Debug.ShouldStop(2);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 995;BA.debugLine="SalirModulo";
Debug.ShouldStop(4);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 996;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 1007;BA.debugLine="GenerarCSVPedidoVenta";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_generarcsvpedidoventa" /*void*/ );
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1010;BA.debugLine="End Sub";
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
public static RemoteObject  _lblsalirb2bpedidoclienteficha_mouseclicked(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirB2BPedidoClienteFicha_MouseClicked (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("lblsalirb2bpedidoclienteficha_mouseclicked")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","lblsalirb2bpedidoclienteficha_mouseclicked", __ref, _eventdata);}
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 171;BA.debugLine="Private Sub lblSalirB2BPedidoClienteFicha_MouseCli";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="SalirModulo";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_salirmodulo" /*RemoteObject*/ );
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
public static RemoteObject  _lblsalirb2bpedidoclienteficha_mouseentered(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirB2BPedidoClienteFicha_MouseEntered (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("lblsalirb2bpedidoclienteficha_mouseentered")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","lblsalirb2bpedidoclienteficha_mouseentered", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 187;BA.debugLine="private Sub lblSalirB2BPedidoClienteFicha_MouseEnt";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(134217728);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cb2bfichapedidocliente.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 189;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
Debug.ShouldStop(268435456);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(_xnode.runMethod(true,"getColor")),(Object)(BA.numberCast(double.class, cb2bfichapedidocliente.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Cyan")),(Object)(BA.numberCast(double.class, 5)));
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
public static RemoteObject  _lblsalirb2bpedidoclienteficha_mouseexited(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirB2BPedidoClienteFicha_MouseExited (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("lblsalirb2bpedidoclienteficha_mouseexited")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","lblsalirb2bpedidoclienteficha_mouseexited", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 192;BA.debugLine="private Sub lblSalirB2BPedidoClienteFicha_MouseExi";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(1);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cb2bfichapedidocliente.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 194;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
Debug.ShouldStop(2);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(_xnode.runMethod(true,"getColor")),(Object)(BA.numberCast(double.class, cb2bfichapedidocliente.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(BA.numberCast(double.class, 5)));
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsalirb2bpedidoclienteficha_mousepressed(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirB2BPedidoClienteFicha_MousePressed (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("lblsalirb2bpedidoclienteficha_mousepressed")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","lblsalirb2bpedidoclienteficha_mousepressed", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 175;BA.debugLine="Private Sub lblSalirB2BPedidoClienteFicha_MousePre";
Debug.ShouldStop(16384);
 BA.debugLineNum = 176;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(32768);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cb2bfichapedidocliente.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 177;BA.debugLine="xNode.SetColorAndBorder(xui.Color_Cyan,1dip,xui.C";
Debug.ShouldStop(65536);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Cyan")),(Object)(BA.numberCast(double.class, cb2bfichapedidocliente.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(BA.numberCast(double.class, 5)));
 BA.debugLineNum = 178;BA.debugLine="xNode.TextColor=xui.Color_Black";
Debug.ShouldStop(131072);
_xnode.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblsalirb2bpedidoclienteficha_mousereleased(RemoteObject __ref,RemoteObject _eventdata) throws Exception{
try {
		Debug.PushSubsStack("lblSalirB2BPedidoClienteFicha_MouseReleased (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("lblsalirb2bpedidoclienteficha_mousereleased")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","lblsalirb2bpedidoclienteficha_mousereleased", __ref, _eventdata);}
RemoteObject _xnode = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("EventData", _eventdata);
 BA.debugLineNum = 181;BA.debugLine="Private Sub lblSalirB2BPedidoClienteFicha_MouseRel";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="Dim xNode As B4XView=Sender";
Debug.ShouldStop(2097152);
_xnode = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xnode = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), cb2bfichapedidocliente.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xNode", _xnode);Debug.locals.put("xNode", _xnode);
 BA.debugLineNum = 183;BA.debugLine="xNode.SetColorAndBorder(xui.Color_Transparent,1di";
Debug.ShouldStop(4194304);
_xnode.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(double.class, cb2bfichapedidocliente.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black")),(Object)(BA.numberCast(double.class, 5)));
 BA.debugLineNum = 184;BA.debugLine="xNode.TextColor=xui.Color_White";
Debug.ShouldStop(8388608);
_xnode.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
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
public static RemoteObject  _mapkeystoarray(RemoteObject __ref,RemoteObject _mdata) throws Exception{
try {
		Debug.PushSubsStack("mapKeysToArray (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1548);
if (RapidSub.canDelegate("mapkeystoarray")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","mapkeystoarray", __ref, _mdata);}
RemoteObject _arr = null;
RemoteObject _idx = RemoteObject.createImmutable(0);
RemoteObject _key = RemoteObject.createImmutable("");
Debug.locals.put("mData", _mdata);
 BA.debugLineNum = 1548;BA.debugLine="Sub mapKeysToArray(mData As Map) As String()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1549;BA.debugLine="Dim arr(mData.Size) As String";
Debug.ShouldStop(4096);
_arr = RemoteObject.createNewArray ("String", new int[] {_mdata.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 1550;BA.debugLine="Dim iDx As Int";
Debug.ShouldStop(8192);
_idx = RemoteObject.createImmutable(0);Debug.locals.put("iDx", _idx);
 BA.debugLineNum = 1551;BA.debugLine="For Each key As String In mData.Keys";
Debug.ShouldStop(16384);
{
final RemoteObject group3 = _mdata.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1552;BA.debugLine="arr(iDx)=key";
Debug.ShouldStop(32768);
_arr.setArrayElement (_key,_idx);
 BA.debugLineNum = 1553;BA.debugLine="iDx=iDx+1";
Debug.ShouldStop(65536);
_idx = RemoteObject.solve(new RemoteObject[] {_idx,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("iDx", _idx);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1555;BA.debugLine="Return arr";
Debug.ShouldStop(262144);
if (true) return _arr;
 BA.debugLineNum = 1556;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("mapToArrayOfStringsConCamposFecha (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1583);
if (RapidSub.canDelegate("maptoarrayofstringsconcamposfecha")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","maptoarrayofstringsconcamposfecha", __ref, _m);}
RemoteObject _arr = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _key = RemoteObject.declareNull("Object");
RemoteObject _intvalue = RemoteObject.createImmutable(0);
RemoteObject _svalue = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 1583;BA.debugLine="public Sub mapToArrayOfStringsConCamposFecha(m As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1584;BA.debugLine="Dim arr(m.Size * 2) As Object  'array size is dou";
Debug.ShouldStop(32768);
_arr = RemoteObject.createNewArray ("Object", new int[] {RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(2)}, "*",0, 1).<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 1585;BA.debugLine="Dim i As Int=0";
Debug.ShouldStop(65536);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1586;BA.debugLine="Dim value As Object";
Debug.ShouldStop(131072);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 1587;BA.debugLine="For Each key As Object In m.Keys";
Debug.ShouldStop(262144);
{
final RemoteObject group4 = _m.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1589;BA.debugLine="value=m.Get(key)";
Debug.ShouldStop(1048576);
_value = _m.runMethod(false,"Get",(Object)(_key));Debug.locals.put("value", _value);
 BA.debugLineNum = 1590;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
Debug.ShouldStop(2097152);
cb2bfichapedidocliente.__c.runVoidMethod ("LogImpl","850266119",(RemoteObject.concat(RemoteObject.createImmutable("key="),cb2bfichapedidocliente.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_key)),RemoteObject.createImmutable(", value="),cb2bfichapedidocliente.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 1591;BA.debugLine="arr(i)=key";
Debug.ShouldStop(4194304);
_arr.setArrayElement (_key,_i);
 BA.debugLineNum = 1592;BA.debugLine="i = i +1";
Debug.ShouldStop(8388608);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 BA.debugLineNum = 1593;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean(".",(BA.ObjectToString(_key)).runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("FECHA")))) && RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1594;BA.debugLine="arr(i)=DateTime.Date(value)";
Debug.ShouldStop(33554432);
_arr.setArrayElement ((cb2bfichapedidocliente.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _value)))),_i);
 }else {
 BA.debugLineNum = 1596;BA.debugLine="If value Is String Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 1597;BA.debugLine="arr(i)=value";
Debug.ShouldStop(268435456);
_arr.setArrayElement (_value,_i);
 }else {
 BA.debugLineNum = 1599;BA.debugLine="Dim intValue As Int=value";
Debug.ShouldStop(1073741824);
_intvalue = BA.numberCast(int.class, _value);Debug.locals.put("intValue", _intvalue);Debug.locals.put("intValue", _intvalue);
 BA.debugLineNum = 1600;BA.debugLine="Dim sValue As String=intValue";
Debug.ShouldStop(-2147483648);
_svalue = BA.NumberToString(_intvalue);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1601;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(1);
_arr.setArrayElement ((_svalue),_i);
 };
 };
 BA.debugLineNum = 1604;BA.debugLine="i =i +1";
Debug.ShouldStop(8);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1607;BA.debugLine="Return arr";
Debug.ShouldStop(64);
if (true) return _arr;
 BA.debugLineNum = 1608;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("mapValuesToArrayOfStringsConCamposFecha (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1558);
if (RapidSub.canDelegate("mapvaluestoarrayofstringsconcamposfecha")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","mapvaluestoarrayofstringsconcamposfecha", __ref, _m);}
RemoteObject _arr = null;
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.declareNull("Object");
RemoteObject _key = RemoteObject.declareNull("Object");
RemoteObject _intvalue = RemoteObject.createImmutable(0);
RemoteObject _svalue = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
 BA.debugLineNum = 1558;BA.debugLine="public Sub mapValuesToArrayOfStringsConCamposFecha";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1559;BA.debugLine="Dim arr(m.Size) As String  'array size is double";
Debug.ShouldStop(4194304);
_arr = RemoteObject.createNewArray ("String", new int[] {_m.runMethod(true,"getSize").<Integer>get().intValue()}, new Object[]{});Debug.locals.put("arr", _arr);
 BA.debugLineNum = 1560;BA.debugLine="Dim i As Int=0";
Debug.ShouldStop(8388608);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 1561;BA.debugLine="Dim value As Object";
Debug.ShouldStop(16777216);
_value = RemoteObject.createNew ("Object");Debug.locals.put("value", _value);
 BA.debugLineNum = 1562;BA.debugLine="For Each key As Object In m.Keys";
Debug.ShouldStop(33554432);
{
final RemoteObject group4 = _m.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.runMethod(false,"Get",index4);Debug.locals.put("key", _key);
Debug.locals.put("key", _key);
 BA.debugLineNum = 1564;BA.debugLine="value=m.Get(key)";
Debug.ShouldStop(134217728);
_value = _m.runMethod(false,"Get",(Object)(_key));Debug.locals.put("value", _value);
 BA.debugLineNum = 1565;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
Debug.ShouldStop(268435456);
cb2bfichapedidocliente.__c.runVoidMethod ("LogImpl","850200583",(RemoteObject.concat(RemoteObject.createImmutable("key="),cb2bfichapedidocliente.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_key)),RemoteObject.createImmutable(", value="),cb2bfichapedidocliente.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(""))),__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Blue"));
 BA.debugLineNum = 1566;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
Debug.ShouldStop(536870912);
if ((BA.ObjectToString(_key)).runMethod(true,"toUpperCase").runMethod(true,"startsWith",(Object)(RemoteObject.createImmutable("FECHA"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1567;BA.debugLine="arr(i)=DateTime.Date(value)";
Debug.ShouldStop(1073741824);
_arr.setArrayElement (cb2bfichapedidocliente.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _value))),_i);
 }else {
 BA.debugLineNum = 1569;BA.debugLine="If value Is String Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("i",_value, RemoteObject.createImmutable("String"))) { 
 BA.debugLineNum = 1570;BA.debugLine="arr(i)=value";
Debug.ShouldStop(2);
_arr.setArrayElement (BA.ObjectToString(_value),_i);
 }else {
 BA.debugLineNum = 1572;BA.debugLine="Dim intValue As Int=value";
Debug.ShouldStop(8);
_intvalue = BA.numberCast(int.class, _value);Debug.locals.put("intValue", _intvalue);Debug.locals.put("intValue", _intvalue);
 BA.debugLineNum = 1573;BA.debugLine="Dim sValue As String=intValue";
Debug.ShouldStop(16);
_svalue = BA.NumberToString(_intvalue);Debug.locals.put("sValue", _svalue);Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1574;BA.debugLine="arr(i)=sValue";
Debug.ShouldStop(32);
_arr.setArrayElement (_svalue,_i);
 };
 };
 BA.debugLineNum = 1577;BA.debugLine="i =i +1";
Debug.ShouldStop(256);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("key", _key);
;
 BA.debugLineNum = 1580;BA.debugLine="Return arr";
Debug.ShouldStop(2048);
if (true) return (_arr);
 BA.debugLineNum = 1581;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salirmodulo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SalirModulo (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("salirmodulo")) { return __ref.runUserSub(false, "cb2bfichapedidocliente","salirmodulo", __ref);}
RemoteObject _b2blistapedcli = RemoteObject.declareNull("b4j.docU.cb2blistapedidoscliente");
 BA.debugLineNum = 129;BA.debugLine="Sub SalirModulo";
Debug.ShouldStop(1);
 BA.debugLineNum = 130;BA.debugLine="If jamTableViewLineasPedidoClienteB2B.IsInitializ";
Debug.ShouldStop(2);
if (__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 131;BA.debugLine="jamTableViewLineasPedidoClienteB2B.GuardarConfig";
Debug.ShouldStop(4);
__ref.getField(false,"_jamtableviewlineaspedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_guardarconfiguracioncolumnasusuario" /*RemoteObject*/ );
 };
 BA.debugLineNum = 134;BA.debugLine="Dim B2BListaPedCli As cB2BListaPedidosCliente";
Debug.ShouldStop(32);
_b2blistapedcli = RemoteObject.createNew ("b4j.docU.cb2blistapedidoscliente");Debug.locals.put("B2BListaPedCli", _b2blistapedcli);
 BA.debugLineNum = 135;BA.debugLine="B2BListaPedCli.Initialize";
Debug.ShouldStop(64);
_b2blistapedcli.runClassMethod (b4j.docU.cb2blistapedidoscliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 136;BA.debugLine="frm.Close";
Debug.ShouldStop(128);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Close");
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Show (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "cb2bfichapedidocliente","show", __ref); return;}
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
public ResumableSub_Show(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _joform = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _jostage = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,74);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 75;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
Debug.ShouldStop(1024);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("frm")),(Object)(BA.numberCast(double.class, parent._main._xscreen /*RemoteObject*/ )),(Object)(BA.numberCast(double.class, parent._main._yscreen /*RemoteObject*/ )));
 BA.debugLineNum = 76;BA.debugLine="frm.Icon = Main.IconoFormularios";
Debug.ShouldStop(2048);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"setIcon",(parent._main._iconoformularios /*RemoteObject*/ .getObject()));
 BA.debugLineNum = 78;BA.debugLine="Dim joForm As JavaObject = frm";
Debug.ShouldStop(8192);
_joform = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_joform = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_frm" /*RemoteObject*/ ));Debug.locals.put("joForm", _joform);Debug.locals.put("joForm", _joform);
 BA.debugLineNum = 79;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
Debug.ShouldStop(16384);
_jostage = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jostage = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _joform.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("stage"))));Debug.locals.put("joStage", _jostage);Debug.locals.put("joStage", _jostage);
 BA.debugLineNum = 80;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
Debug.ShouldStop(32768);
_jostage.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setMaximized")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(parent.__c.getField(true,"True"))})));
 BA.debugLineNum = 82;BA.debugLine="Dialog.Initialize(frm.RootPane)";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 83;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
Debug.ShouldStop(262144);
__ref.getField(false,"_jamloadingindicator1" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamloadingindicator.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").getObject()));
 BA.debugLineNum = 86;BA.debugLine="frm.RootPane.LoadLayout(\"scrB2BFichaPedidoCliente";
Debug.ShouldStop(2097152);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(false,"getRootPane").runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("scrB2BFichaPedidoCliente2")));
 BA.debugLineNum = 88;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    B2B Pedid";
Debug.ShouldStop(8388608);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runMethod(true,"setTitle",RemoteObject.concat(parent._main._prefijotitleforms /*RemoteObject*/ ,RemoteObject.createImmutable("    B2B Pedido Cliente ")));
 BA.debugLineNum = 90;BA.debugLine="TabPaneInfoPedidoCliente.LoadLayout(\"scrB2BPedido";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tabpaneinfopedidocliente" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("scrB2BPedidoClienteLineasPedido")),(Object)(RemoteObject.createImmutable("Líneas Pedido")));
 BA.debugLineNum = 91;BA.debugLine="Sleep(0)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "show"),BA.numberCast(int.class, 0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 BA.debugLineNum = 92;BA.debugLine="TabPaneInfoPedidoCliente.LoadLayout(\"scrB2BPedido";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tabpaneinfopedidocliente" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("scrB2BPedidoClienteLineasAlbaranesPedido")),(Object)(RemoteObject.createImmutable("Líneas Albaranes Pedido")));
 BA.debugLineNum = 93;BA.debugLine="Sleep(0)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "show"),BA.numberCast(int.class, 0));
this.state = 6;
return;
case 6:
//C
this.state = 1;
;
 BA.debugLineNum = 94;BA.debugLine="TabPaneInfoPedidoCliente.LoadLayout(\"scrB2BPedido";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tabpaneinfopedidocliente" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("scrB2BPedidoClienteLineasFacturasPedido")),(Object)(RemoteObject.createImmutable("Líneas Facturas Pedido")));
 BA.debugLineNum = 95;BA.debugLine="Sleep(0)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "show"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 97;BA.debugLine="Utilidades.AddImageToLabel(lblSalirB2BPedidoClien";
Debug.ShouldStop(1);
parent._utilidades.runVoidMethod ("_addimagetolabel" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.LabelWrapper"), __ref.getField(false,"_lblsalirb2bpedidoclienteficha" /*RemoteObject*/ ).getObject()),(Object)(parent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("twotone_exit_black_24dp.png")));
 BA.debugLineNum = 101;BA.debugLine="frm.Show";
Debug.ShouldStop(16);
__ref.getField(false,"_frm" /*RemoteObject*/ ).runVoidMethodAndSync ("Show");
 BA.debugLineNum = 113;BA.debugLine="wait for(Inicio) complete (Success As Boolean)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "show"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_inicio" /*RemoteObject*/ ));
this.state = 8;
return;
case 8:
//C
this.state = 1;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 114;BA.debugLine="If Success=False Then";
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
 BA.debugLineNum = 115;BA.debugLine="SalirModulo";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 116;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 119;BA.debugLine="End Sub";
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
public static void  _tabpaneinfopedidocliente_tabchanged(RemoteObject __ref,RemoteObject _selectedtab) throws Exception{
try {
		Debug.PushSubsStack("TabPaneInfoPedidoCliente_TabChanged (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1012);
if (RapidSub.canDelegate("tabpaneinfopedidocliente_tabchanged")) { __ref.runUserSub(false, "cb2bfichapedidocliente","tabpaneinfopedidocliente_tabchanged", __ref, _selectedtab); return;}
ResumableSub_TabPaneInfoPedidoCliente_TabChanged rsub = new ResumableSub_TabPaneInfoPedidoCliente_TabChanged(null,__ref,_selectedtab);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_TabPaneInfoPedidoCliente_TabChanged extends BA.ResumableSub {
public ResumableSub_TabPaneInfoPedidoCliente_TabChanged(b4j.docU.cb2bfichapedidocliente parent,RemoteObject __ref,RemoteObject _selectedtab) {
this.parent = parent;
this.__ref = __ref;
this._selectedtab = _selectedtab;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.docU.cb2bfichapedidocliente parent;
RemoteObject _selectedtab;
RemoteObject _success = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("TabPaneInfoPedidoCliente_TabChanged (cb2bfichapedidocliente) ","cb2bfichapedidocliente",22,__ref.getField(false, "ba"),__ref,1012);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("SelectedTab", _selectedtab);
 BA.debugLineNum = 1013;BA.debugLine="Select Case SelectedTab.Text";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_selectedtab.runMethod(true,"getText"),BA.ObjectToString("Líneas Albaranes Pedido"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1015;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Lim";
Debug.ShouldStop(4194304);
__ref.getField(false,"_jamtableviewlineasalbaranespedidoclienteb2b" /*RemoteObject*/ ).runClassMethod (b4j.docU.jamtableview.class, "_limpiartabla" /*RemoteObject*/ );
 BA.debugLineNum = 1017;BA.debugLine="Wait For(CargaDatosAlbaranesPedidoCliente(mIDP";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "tabpaneinfopedidocliente_tabchanged"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_cargadatosalbaranespedidocliente" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_midpedidocliente" /*RemoteObject*/ ))));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1018;BA.debugLine="If Success=False Then";
Debug.ShouldStop(33554432);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1019;BA.debugLine="SalirModulo";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1020;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 1022;BA.debugLine="Wait For(ActualizarDatosLineasAlbaranesPedido)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "cb2bfichapedidocliente", "tabpaneinfopedidocliente_tabchanged"), __ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_actualizardatoslineasalbaranespedido" /*RemoteObject*/ ));
this.state = 14;
return;
case 14:
//C
this.state = 8;
_success = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Success", _success);
;
 BA.debugLineNum = 1023;BA.debugLine="If Success=False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 8:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_success,parent.__c.getField(true,"False"))) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 1024;BA.debugLine="SalirModulo";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4j.docU.cb2bfichapedidocliente.class, "_salirmodulo" /*RemoteObject*/ );
 BA.debugLineNum = 1025;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
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
 BA.debugLineNum = 1033;BA.debugLine="End Sub";
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