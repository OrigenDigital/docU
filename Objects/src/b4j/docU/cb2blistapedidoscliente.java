package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cb2blistapedidoscliente extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cb2blistapedidoscliente", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cb2blistapedidoscliente.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tipodatoscabecerapedidob2b{
public boolean IsInitialized;
public int IDPedido;
public boolean PedidoPunchout;
public String Pedido;
public int IDTienda;
public String NombreTienda;
public long FechaCreacion;
public long FechaActualizacion;
public String OrdenCompra;
public String EmailComprador;
public String NombreUsuarioComprador;
public String ApellidoUsuarioComprador;
public int IDCliente;
public String CodigoClienteERP;
public String NombreCliente;
public int IDGRP;
public String CodigoGRPERP;
public String NombreGRP;
public int IDDireccionEnvio;
public String CodigoDireccionEnvioERP;
public String NombreDireccionEnvio;
public String DireccionEnvio;
public String IDDireccionFacturacion;
public String NombreDireccionFacturacion;
public String DireccionFacturacion;
public int TotalQtyPedida;
public int TotalQtyEnviada;
public int TotalQtyPendienteEnvio;
public int TotalQtyFacturada;
public int TotalQtyPendienteFacturar;
public String Moneda;
public double ImporteTotalSinIVA;
public double ImporteTotalIVA;
public double ImporteTotalFacturadoSinIVA;
public double ImporteTotalFacturadoIVA;
public String EstadoPedido;
public void Initialize() {
IsInitialized = true;
IDPedido = 0;
PedidoPunchout = false;
Pedido = "";
IDTienda = 0;
NombreTienda = "";
FechaCreacion = 0L;
FechaActualizacion = 0L;
OrdenCompra = "";
EmailComprador = "";
NombreUsuarioComprador = "";
ApellidoUsuarioComprador = "";
IDCliente = 0;
CodigoClienteERP = "";
NombreCliente = "";
IDGRP = 0;
CodigoGRPERP = "";
NombreGRP = "";
IDDireccionEnvio = 0;
CodigoDireccionEnvioERP = "";
NombreDireccionEnvio = "";
DireccionEnvio = "";
IDDireccionFacturacion = "";
NombreDireccionFacturacion = "";
DireccionFacturacion = "";
TotalQtyPedida = 0;
TotalQtyEnviada = 0;
TotalQtyPendienteEnvio = 0;
TotalQtyFacturada = 0;
TotalQtyPendienteFacturar = 0;
Moneda = "";
ImporteTotalSinIVA = 0;
ImporteTotalIVA = 0;
ImporteTotalFacturadoSinIVA = 0;
ImporteTotalFacturadoIVA = 0;
EstadoPedido = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public b4j.docU.jamtableview _jamtableview1 = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _permisousuariomodulo = "";
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public String _tk = "";
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.docU.main _main = null;
public b4j.docU.mainmenu2 _mainmenu2 = null;
public b4j.docU.utilidades _utilidades = null;
public b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public b4j.docU.cmauxtxt _cmauxtxt = null;
public b4j.docU.jrdcquery _jrdcquery = null;
public b4j.docU.dbutils _dbutils = null;
public b4j.docU.transfermode _transfermode = null;
public b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public b4j.docU.b4xcollections _b4xcollections = null;
public b4j.docU.jamlinknavision _jamlinknavision = null;
public b4j.docU.cmpermisos _cmpermisos = null;
public b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public b4j.docU.httputils2service _httputils2service = null;
public b4j.docU.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.docU.cb2blistapedidoscliente __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
if (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();};
RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=50462728;
 //BA.debugLineNum = 50462728;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=50462729;
 //BA.debugLineNum = 50462729;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatos(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatos", null));}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
Object _robj = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;
boolean _success = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(""));
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=50855940;
 //BA.debugLineNum = 50855940;BA.debugLine="Wait For(CargaDatosCredenciales) complete (mRes A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref._cargadatoscredenciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 44;
return;
case 44:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=50855941;
 //BA.debugLineNum = 50855941;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=50855942;
 //BA.debugLineNum = 50855942;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=50855943;
 //BA.debugLineNum = 50855943;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error cre";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error credenciales."));
this.state = 45;
return;
case 45:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=50855944;
 //BA.debugLineNum = 50855944;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=50855946;
 //BA.debugLineNum = 50855946;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=50855947;
 //BA.debugLineNum = 50855947;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=50855948;
 //BA.debugLineNum = 50855948;BA.debugLine="tk=mData0.GetValueAt(0)";
__ref._tk /*String*/  = BA.ObjectToString(_mdata0.GetValueAt((int) (0)));
RDebugUtils.currentLine=50855950;
 //BA.debugLineNum = 50855950;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando Sto";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Stores..."));
RDebugUtils.currentLine=50855952;
 //BA.debugLineNum = 50855952;BA.debugLine="Wait For(CargaListaStoresMagento) complete (Succe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref._cargalistastoresmagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 46;
return;
case 46:
//C
this.state = 5;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=50855953;
 //BA.debugLineNum = 50855953;BA.debugLine="If Not(Success) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(_success)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=50855954;
 //BA.debugLineNum = 50855954;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=50855955;
 //BA.debugLineNum = 50855955;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=50855958;
 //BA.debugLineNum = 50855958;BA.debugLine="wait for(CargaValoresAtributoSizeProductos) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref._cargavaloresatributosizeproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 47;
return;
case 47:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=50855959;
 //BA.debugLineNum = 50855959;BA.debugLine="If Not(Success) Then Return False";
if (true) break;

case 9:
//if
this.state = 14;
if (parent.__c.Not(_success)) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=50855961;
 //BA.debugLineNum = 50855961;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando Cli";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Clientes..."));
RDebugUtils.currentLine=50855962;
 //BA.debugLineNum = 50855962;BA.debugLine="Wait For(CargaListaClientesMagento) complete (Suc";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref._cargalistaclientesmagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 48;
return;
case 48:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=50855963;
 //BA.debugLineNum = 50855963;BA.debugLine="If Not(Success) Then";
if (true) break;

case 15:
//if
this.state = 18;
if (parent.__c.Not(_success)) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=50855964;
 //BA.debugLineNum = 50855964;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=50855965;
 //BA.debugLineNum = 50855965;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Clientes B2B"));
this.state = 49;
return;
case 49:
//C
this.state = 18;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=50855966;
 //BA.debugLineNum = 50855966;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=50855969;
 //BA.debugLineNum = 50855969;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando Ped";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Pedidos..."));
RDebugUtils.currentLine=50855970;
 //BA.debugLineNum = 50855970;BA.debugLine="Wait For(CargaPedidos) complete (Success As Boole";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), __ref._cargapedidos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 50;
return;
case 50:
//C
this.state = 19;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=50855971;
 //BA.debugLineNum = 50855971;BA.debugLine="If Not(Success) Then";
if (true) break;

case 19:
//if
this.state = 22;
if (parent.__c.Not(_success)) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=50855972;
 //BA.debugLineNum = 50855972;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=50855973;
 //BA.debugLineNum = 50855973;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Pedidos (Orders) B2B"));
this.state = 51;
return;
case 51:
//C
this.state = 22;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=50855974;
 //BA.debugLineNum = 50855974;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=50855977;
 //BA.debugLineNum = 50855977;BA.debugLine="mSQL.ExecNonQuery(\"update tblB2BOrdersTotales set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("update tblB2BOrdersTotales set TotalQtyPendienteEnvio=TotalQtyPedida-TotalQtyEnviada");
RDebugUtils.currentLine=50855978;
 //BA.debugLineNum = 50855978;BA.debugLine="mSQL.ExecNonQuery(\"update tblB2BOrdersTotales set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("update tblB2BOrdersTotales set TotalQtyPendienteFacturar=TotalQtyPedida-TotalQtyFacturada");
RDebugUtils.currentLine=50855980;
 //BA.debugLineNum = 50855980;BA.debugLine="Dim rsData As ResultSet=mSQL.ExecQuery(\"select *";
_rsdata = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdata = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BOrdersTotales");
RDebugUtils.currentLine=50855982;
 //BA.debugLineNum = 50855982;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdata.getObject()));
RDebugUtils.currentLine=50855983;
 //BA.debugLineNum = 50855983;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), _rsub);
this.state = 52;
return;
case 52:
//C
this.state = 23;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=50855984;
 //BA.debugLineNum = 50855984;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 23:
//if
this.state = 43;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=50855985;
 //BA.debugLineNum = 50855985;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 26:
//if
this.state = 33;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=50855986;
 //BA.debugLineNum = 50855986;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=50855987;
 //BA.debugLineNum = 50855987;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=50855988;
 //BA.debugLineNum = 50855988;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 29;
;
RDebugUtils.currentLine=50855990;
 //BA.debugLineNum = 50855990;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=50855991;
 //BA.debugLineNum = 50855991;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 29;
_rint = (int) result[1];
;
RDebugUtils.currentLine=50855992;
 //BA.debugLineNum = 50855992;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 29:
//if
this.state = 32;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=50855993;
 //BA.debugLineNum = 50855993;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=50855994;
 //BA.debugLineNum = 50855994;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=50855997;
 //BA.debugLineNum = 50855997;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=50855999;
 //BA.debugLineNum = 50855999;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 33:
//if
this.state = 42;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=50856000;
 //BA.debugLineNum = 50856000;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 36:
//if
this.state = 41;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=50856001;
 //BA.debugLineNum = 50856001;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=50856002;
 //BA.debugLineNum = 50856002;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=50856003;
 //BA.debugLineNum = 50856003;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "actualizardatos"), _msa);
this.state = 55;
return;
case 55:
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
RDebugUtils.currentLine=50856007;
 //BA.debugLineNum = 50856007;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=50856010;
 //BA.debugLineNum = 50856010;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=50856013;
 //BA.debugLineNum = 50856013;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatoscredenciales(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "cargadatoscredenciales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatoscredenciales", null));}
ResumableSub_CargaDatosCredenciales rsub = new ResumableSub_CargaDatosCredenciales(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosCredenciales extends BA.ResumableSub {
public ResumableSub_CargaDatosCredenciales(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=51380227;
 //BA.debugLineNum = 51380227;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=51380228;
 //BA.debugLineNum = 51380228;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=51380229;
 //BA.debugLineNum = 51380229;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=51380230;
 //BA.debugLineNum = 51380230;BA.debugLine="ComandoJRDC=\"TokenB2BPruebas\"";
_comandojrdc = "TokenB2BPruebas";
RDebugUtils.currentLine=51380231;
 //BA.debugLineNum = 51380231;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comandojrdc,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=51380232;
 //BA.debugLineNum = 51380232;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargadatoscredenciales"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=51380233;
 //BA.debugLineNum = 51380233;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=51380234;
 //BA.debugLineNum = 51380234;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=51380236;
 //BA.debugLineNum = 51380236;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=51380237;
 //BA.debugLineNum = 51380237;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=51380239;
 //BA.debugLineNum = 51380239;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=51380240;
 //BA.debugLineNum = 51380240;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=51380241;
 //BA.debugLineNum = 51380241;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
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
RDebugUtils.currentLine=51380244;
 //BA.debugLineNum = 51380244;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=51380245;
 //BA.debugLineNum = 51380245;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=51380246;
 //BA.debugLineNum = 51380246;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistastoresmagento(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "cargalistastoresmagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistastoresmagento", null));}
ResumableSub_CargaListaStoresMagento rsub = new ResumableSub_CargaListaStoresMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaStoresMagento extends BA.ResumableSub {
public ResumableSub_CargaListaStoresMagento(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _sresp = "";
Object _robj = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _code = "";
int _default_store_id = 0;
String _name = "";
int _root_category_id = 0;
int _id = 0;
int _website_id = 0;
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51707905;
 //BA.debugLineNum = 51707905;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BStores\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BStores");
RDebugUtils.currentLine=51707906;
 //BA.debugLineNum = 51707906;BA.debugLine="wait for(EnvioDatosAPIMagentoListaStores(tk)) com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargalistastoresmagento"), __ref._enviodatosapimagentolistastores /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=51707907;
 //BA.debugLineNum = 51707907;BA.debugLine="If sResp.StartsWith(\"ERROR\") Or sResp.Contains(\"U";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("ERROR") || _sresp.contains("Uncaught ReflectionException")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=51707908;
 //BA.debugLineNum = 51707908;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",$\"Error ca";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargalistastoresmagento"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso",("Error cargando Stores B2B \n"+""+parent.__c.SmartStringFormatter("",(Object)(_sresp))+"")));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=51707910;
 //BA.debugLineNum = 51707910;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=51707912;
 //BA.debugLineNum = 51707912;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=51707913;
 //BA.debugLineNum = 51707913;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=51707914;
 //BA.debugLineNum = 51707914;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=51707915;
 //BA.debugLineNum = 51707915;BA.debugLine="For Each colroot As Map In root";
if (true) break;

case 5:
//for
this.state = 8;
_colroot = new anywheresoftware.b4a.objects.collections.Map();
group10 = _root;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 11;
if (true) break;

case 11:
//C
this.state = 8;
if (index10 < groupLen10) {
this.state = 7;
_colroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group10.Get(index10)));}
if (true) break;

case 12:
//C
this.state = 11;
index10++;
if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=51707916;
 //BA.debugLineNum = 51707916;BA.debugLine="Dim code As String = colroot.Get(\"code\")";
_code = BA.ObjectToString(_colroot.Get((Object)("code")));
RDebugUtils.currentLine=51707917;
 //BA.debugLineNum = 51707917;BA.debugLine="Dim default_store_id As Int = colroot.Getdefault";
_default_store_id = (int)(BA.ObjectToNumber(_colroot.GetDefault((Object)("default_store_id"),(Object)(-1))));
RDebugUtils.currentLine=51707918;
 //BA.debugLineNum = 51707918;BA.debugLine="Dim name As String = colroot.Get(\"name\")";
_name = BA.ObjectToString(_colroot.Get((Object)("name")));
RDebugUtils.currentLine=51707919;
 //BA.debugLineNum = 51707919;BA.debugLine="Dim root_category_id As Int = colroot.Getdefault";
_root_category_id = (int)(BA.ObjectToNumber(_colroot.GetDefault((Object)("root_category_id"),(Object)(-1))));
RDebugUtils.currentLine=51707920;
 //BA.debugLineNum = 51707920;BA.debugLine="Dim id As Int = colroot.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colroot.Get((Object)("id"))));
RDebugUtils.currentLine=51707921;
 //BA.debugLineNum = 51707921;BA.debugLine="Dim website_id As Int = colroot.Get(\"website_id\"";
_website_id = (int)(BA.ObjectToNumber(_colroot.Get((Object)("website_id"))));
RDebugUtils.currentLine=51707923;
 //BA.debugLineNum = 51707923;BA.debugLine="Log(\"code: \" & code & \" Name: \" & name & \" ID: \"";
parent.__c.LogImpl("851707923","code: "+_code+" Name: "+_name+" ID: "+BA.NumberToString(_id),0);
RDebugUtils.currentLine=51707924;
 //BA.debugLineNum = 51707924;BA.debugLine="Log(\" \")";
parent.__c.LogImpl("851707924"," ",0);
RDebugUtils.currentLine=51707925;
 //BA.debugLineNum = 51707925;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BStores (c";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("insert into tblB2BStores (code, default_store_id, name, root_category_id, id, website_id) values (?,?,?,?,?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_code),(Object)(_default_store_id),(Object)(_name),(Object)(_root_category_id),(Object)(_id),(Object)(_website_id)}));
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=51707930;
 //BA.debugLineNum = 51707930;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=51707931;
 //BA.debugLineNum = 51707931;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargavaloresatributosizeproductos(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "cargavaloresatributosizeproductos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargavaloresatributosizeproductos", null));}
ResumableSub_CargaValoresAtributoSizeProductos rsub = new ResumableSub_CargaValoresAtributoSizeProductos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_CargaValoresAtributoSizeProductos(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _sresp = "";
Object _robj = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _label = "";
String _value = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51445761;
 //BA.debugLineNum = 51445761;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BAtributoSize";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BAtributoSizeProducts");
RDebugUtils.currentLine=51445762;
 //BA.debugLineNum = 51445762;BA.debugLine="wait for(EnvioDatosAPIMagentoValoresAtributoSizeP";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargavaloresatributosizeproductos"), __ref._enviodatosapimagentovaloresatributosizeproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=51445763;
 //BA.debugLineNum = 51445763;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=51445764;
 //BA.debugLineNum = 51445764;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=51445765;
 //BA.debugLineNum = 51445765;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargavaloresatributosizeproductos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Valores atributo size (talla) B2B"));
this.state = 10;
return;
case 10:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=51445766;
 //BA.debugLineNum = 51445766;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=51445769;
 //BA.debugLineNum = 51445769;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=51445770;
 //BA.debugLineNum = 51445770;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=51445771;
 //BA.debugLineNum = 51445771;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=51445772;
 //BA.debugLineNum = 51445772;BA.debugLine="For Each colroot As Map In root";
if (true) break;

case 5:
//for
this.state = 8;
_colroot = new anywheresoftware.b4a.objects.collections.Map();
group11 = _root;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 11;
if (true) break;

case 11:
//C
this.state = 8;
if (index11 < groupLen11) {
this.state = 7;
_colroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group11.Get(index11)));}
if (true) break;

case 12:
//C
this.state = 11;
index11++;
if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=51445773;
 //BA.debugLineNum = 51445773;BA.debugLine="Dim label As String = colroot.Get(\"label\")";
_label = BA.ObjectToString(_colroot.Get((Object)("label")));
RDebugUtils.currentLine=51445774;
 //BA.debugLineNum = 51445774;BA.debugLine="Dim value As String = colroot.Get(\"value\")";
_value = BA.ObjectToString(_colroot.Get((Object)("value")));
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=51445779;
 //BA.debugLineNum = 51445779;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BAtributoSizeProducts",_root);
RDebugUtils.currentLine=51445780;
 //BA.debugLineNum = 51445780;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=51445781;
 //BA.debugLineNum = 51445781;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistaclientesmagento(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "cargalistaclientesmagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistaclientesmagento", null));}
ResumableSub_CargaListaClientesMagento rsub = new ResumableSub_CargaListaClientesMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaClientesMagento extends BA.ResumableSub {
public ResumableSub_CargaListaClientesMagento(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _total_count = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
int _id = 0;
String _sk = "";
int _store_id = 0;
String _firstname = "";
anywheresoftware.b4a.objects.collections.List _addresses = null;
anywheresoftware.b4a.objects.collections.Map _coladdresses = null;
String _city = "";
int _region_id = 0;
String _postcode = "";
String _telephone = "";
String _default_shipping = "";
String _lastname = "";
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
int _customer_id = 0;
anywheresoftware.b4a.objects.collections.Map _region = null;
String _regiona = "";
String _region_code = "";
String _default_billing = "";
String _country_id = "";
int _gender = 0;
String _created_at = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
String _is_subscribed = "";
String _updated_at = "";
int _disable_auto_group_change = 0;
int _group_id = 0;
String _dob = "";
int _website_id = 0;
String _email = "";
String _created_in = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
int _is_blocked = 0;
int _is_commercial = 0;
String _company = "";
String _code = "";
String _customer_group_code = "";
String _customer_group_name = "";
String _language = "";
anywheresoftware.b4a.objects.collections.Map _mattribute = null;
anywheresoftware.b4a.objects.collections.Map _search_criteria = null;
anywheresoftware.b4a.objects.collections.List _filter_groups = null;
anywheresoftware.b4a.objects.collections.Map _colfilter_groups = null;
anywheresoftware.b4a.objects.collections.List _filters = null;
anywheresoftware.b4a.objects.collections.Map _colfilters = null;
String _field = "";
String _condition_type = "";
String _value = "";
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;
anywheresoftware.b4a.BA.IterableList group68;
int index68;
int groupLen68;
anywheresoftware.b4a.BA.IterableList group91;
int index91;
int groupLen91;
anywheresoftware.b4a.BA.IterableList group93;
int index93;
int groupLen93;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51838977;
 //BA.debugLineNum = 51838977;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BClientes\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BClientes");
RDebugUtils.currentLine=51838978;
 //BA.debugLineNum = 51838978;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaClientes(tk)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargalistaclientesmagento"), __ref._enviodatosapimagentobusquedaclientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 90;
return;
case 90:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=51838979;
 //BA.debugLineNum = 51838979;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=51838980;
 //BA.debugLineNum = 51838980;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=51838981;
 //BA.debugLineNum = 51838981;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=51838982;
 //BA.debugLineNum = 51838982;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=51838983;
 //BA.debugLineNum = 51838983;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
_total_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_count"))));
RDebugUtils.currentLine=51838984;
 //BA.debugLineNum = 51838984;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=51838985;
 //BA.debugLineNum = 51838985;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 7:
//for
this.state = 81;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group9 = _items;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 91;
if (true) break;

case 91:
//C
this.state = 81;
if (index9 < groupLen9) {
this.state = 9;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));}
if (true) break;

case 92:
//C
this.state = 91;
index9++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=51838986;
 //BA.debugLineNum = 51838986;BA.debugLine="Log(\"ColItems: \" & colitems)";
parent.__c.LogImpl("851838986","ColItems: "+BA.ObjectToString(_colitems),0);
RDebugUtils.currentLine=51838988;
 //BA.debugLineNum = 51838988;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("id"))));
RDebugUtils.currentLine=51838989;
 //BA.debugLineNum = 51838989;BA.debugLine="If id=66 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_id==66) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=51838990;
 //BA.debugLineNum = 51838990;BA.debugLine="Log(\"Mary J\")";
parent.__c.LogImpl("851838990","Mary J",0);
 if (true) break;
;
RDebugUtils.currentLine=51838993;
 //BA.debugLineNum = 51838993;BA.debugLine="For Each sK As String In colitems.Keys";

case 13:
//for
this.state = 16;
group15 = _colitems.Keys();
index15 = 0;
groupLen15 = group15.getSize();
this.state = 93;
if (true) break;

case 93:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 15;
_sk = BA.ObjectToString(group15.Get(index15));}
if (true) break;

case 94:
//C
this.state = 93;
index15++;
if (true) break;

case 15:
//C
this.state = 94;
RDebugUtils.currentLine=51838994;
 //BA.debugLineNum = 51838994;BA.debugLine="Log(sK & \": \" & colitems.Get(sK))";
parent.__c.LogImpl("851838994",_sk+": "+BA.ObjectToString(_colitems.Get((Object)(_sk))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=51838996;
 //BA.debugLineNum = 51838996;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("store_id"))));
RDebugUtils.currentLine=51838997;
 //BA.debugLineNum = 51838997;BA.debugLine="Dim firstname As String = colitems.Get(\"firstnam";
_firstname = BA.ObjectToString(_colitems.Get((Object)("firstname")));
RDebugUtils.currentLine=51838998;
 //BA.debugLineNum = 51838998;BA.debugLine="Dim addresses As List = colitems.Get(\"addresses\"";
_addresses = new anywheresoftware.b4a.objects.collections.List();
_addresses = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("addresses"))));
RDebugUtils.currentLine=51838999;
 //BA.debugLineNum = 51838999;BA.debugLine="For Each coladdresses As Map In addresses";
if (true) break;

case 17:
//for
this.state = 24;
_coladdresses = new anywheresoftware.b4a.objects.collections.Map();
group21 = _addresses;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 95;
if (true) break;

case 95:
//C
this.state = 24;
if (index21 < groupLen21) {
this.state = 19;
_coladdresses = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 96:
//C
this.state = 95;
index21++;
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=51839001;
 //BA.debugLineNum = 51839001;BA.debugLine="Log(\"coladdresses: \" & coladdresses)";
parent.__c.LogImpl("851839001","coladdresses: "+BA.ObjectToString(_coladdresses),0);
RDebugUtils.currentLine=51839002;
 //BA.debugLineNum = 51839002;BA.debugLine="Dim firstname As String = coladdresses.Get(\"fir";
_firstname = BA.ObjectToString(_coladdresses.Get((Object)("firstname")));
RDebugUtils.currentLine=51839003;
 //BA.debugLineNum = 51839003;BA.debugLine="Dim city As String = coladdresses.Get(\"city\")";
_city = BA.ObjectToString(_coladdresses.Get((Object)("city")));
RDebugUtils.currentLine=51839004;
 //BA.debugLineNum = 51839004;BA.debugLine="Dim region_id As Int = coladdresses.Get(\"region";
_region_id = (int)(BA.ObjectToNumber(_coladdresses.Get((Object)("region_id"))));
RDebugUtils.currentLine=51839005;
 //BA.debugLineNum = 51839005;BA.debugLine="Dim postcode As String = coladdresses.Get(\"post";
_postcode = BA.ObjectToString(_coladdresses.Get((Object)("postcode")));
RDebugUtils.currentLine=51839006;
 //BA.debugLineNum = 51839006;BA.debugLine="Dim telephone As String = coladdresses.Get(\"tel";
_telephone = BA.ObjectToString(_coladdresses.Get((Object)("telephone")));
RDebugUtils.currentLine=51839007;
 //BA.debugLineNum = 51839007;BA.debugLine="Dim default_shipping As String = coladdresses.G";
_default_shipping = BA.ObjectToString(_coladdresses.Get((Object)("default_shipping")));
RDebugUtils.currentLine=51839008;
 //BA.debugLineNum = 51839008;BA.debugLine="Dim lastname As String = coladdresses.Get(\"last";
_lastname = BA.ObjectToString(_coladdresses.Get((Object)("lastname")));
RDebugUtils.currentLine=51839009;
 //BA.debugLineNum = 51839009;BA.debugLine="Dim street As List = coladdresses.Get(\"street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_coladdresses.Get((Object)("street"))));
RDebugUtils.currentLine=51839010;
 //BA.debugLineNum = 51839010;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 20:
//for
this.state = 23;
group31 = _street;
index31 = 0;
groupLen31 = group31.getSize();
this.state = 97;
if (true) break;

case 97:
//C
this.state = 23;
if (index31 < groupLen31) {
this.state = 22;
_colstreet = BA.ObjectToString(group31.Get(index31));}
if (true) break;

case 98:
//C
this.state = 97;
index31++;
if (true) break;

case 22:
//C
this.state = 98;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 96;
;
RDebugUtils.currentLine=51839012;
 //BA.debugLineNum = 51839012;BA.debugLine="Dim id As Int = coladdresses.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_coladdresses.Get((Object)("id"))));
RDebugUtils.currentLine=51839013;
 //BA.debugLineNum = 51839013;BA.debugLine="Dim customer_id As Int = coladdresses.Get(\"cust";
_customer_id = (int)(BA.ObjectToNumber(_coladdresses.Get((Object)("customer_id"))));
RDebugUtils.currentLine=51839014;
 //BA.debugLineNum = 51839014;BA.debugLine="Dim region As Map = coladdresses.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_coladdresses.Get((Object)("region"))));
RDebugUtils.currentLine=51839015;
 //BA.debugLineNum = 51839015;BA.debugLine="Dim region_id As Int = region.Get(\"region_id\")";
_region_id = (int)(BA.ObjectToNumber(_region.Get((Object)("region_id"))));
RDebugUtils.currentLine=51839016;
 //BA.debugLineNum = 51839016;BA.debugLine="Dim regionA As String = region.Get(\"region\")";
_regiona = BA.ObjectToString(_region.Get((Object)("region")));
RDebugUtils.currentLine=51839017;
 //BA.debugLineNum = 51839017;BA.debugLine="Dim region_code As String = region.Get(\"region_";
_region_code = BA.ObjectToString(_region.Get((Object)("region_code")));
RDebugUtils.currentLine=51839018;
 //BA.debugLineNum = 51839018;BA.debugLine="Dim default_billing As String = coladdresses.Ge";
_default_billing = BA.ObjectToString(_coladdresses.Get((Object)("default_billing")));
RDebugUtils.currentLine=51839019;
 //BA.debugLineNum = 51839019;BA.debugLine="Dim country_id As String = coladdresses.Get(\"co";
_country_id = BA.ObjectToString(_coladdresses.Get((Object)("country_id")));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=51839021;
 //BA.debugLineNum = 51839021;BA.debugLine="Dim gender As Int = colitems.Getdefault(\"gender\"";
_gender = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("gender"),(Object)(0))));
RDebugUtils.currentLine=51839022;
 //BA.debugLineNum = 51839022;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=51839023;
 //BA.debugLineNum = 51839023;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=51839024;
 //BA.debugLineNum = 51839024;BA.debugLine="Dim is_subscribed As String = extension_attribut";
_is_subscribed = BA.ObjectToString(_extension_attributes.Get((Object)("is_subscribed")));
RDebugUtils.currentLine=51839025;
 //BA.debugLineNum = 51839025;BA.debugLine="Dim default_shipping As String = colitems.Get(\"d";
_default_shipping = BA.ObjectToString(_colitems.Get((Object)("default_shipping")));
RDebugUtils.currentLine=51839026;
 //BA.debugLineNum = 51839026;BA.debugLine="Dim lastname As String = colitems.Get(\"lastname\"";
_lastname = BA.ObjectToString(_colitems.Get((Object)("lastname")));
RDebugUtils.currentLine=51839027;
 //BA.debugLineNum = 51839027;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=51839028;
 //BA.debugLineNum = 51839028;BA.debugLine="Dim disable_auto_group_change As Int = colitems.";
_disable_auto_group_change = (int)(BA.ObjectToNumber(_colitems.Get((Object)("disable_auto_group_change"))));
RDebugUtils.currentLine=51839029;
 //BA.debugLineNum = 51839029;BA.debugLine="Dim group_id As Int = colitems.Get(\"group_id\")";
_group_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("group_id"))));
RDebugUtils.currentLine=51839030;
 //BA.debugLineNum = 51839030;BA.debugLine="Dim dob As String = colitems.Get(\"dob\")";
_dob = BA.ObjectToString(_colitems.Get((Object)("dob")));
RDebugUtils.currentLine=51839031;
 //BA.debugLineNum = 51839031;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("id"))));
RDebugUtils.currentLine=51839032;
 //BA.debugLineNum = 51839032;BA.debugLine="Dim default_billing As String = colitems.Get(\"de";
_default_billing = BA.ObjectToString(_colitems.Get((Object)("default_billing")));
RDebugUtils.currentLine=51839033;
 //BA.debugLineNum = 51839033;BA.debugLine="Dim website_id As Int = colitems.Get(\"website_id";
_website_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("website_id"))));
RDebugUtils.currentLine=51839034;
 //BA.debugLineNum = 51839034;BA.debugLine="Dim email As String = colitems.Get(\"email\")";
_email = BA.ObjectToString(_colitems.Get((Object)("email")));
RDebugUtils.currentLine=51839035;
 //BA.debugLineNum = 51839035;BA.debugLine="Dim created_in As String = colitems.Get(\"created";
_created_in = BA.ObjectToString(_colitems.Get((Object)("created_in")));
RDebugUtils.currentLine=51839036;
 //BA.debugLineNum = 51839036;BA.debugLine="Dim custom_attributes As List=colitems.Get(\"cust";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=51839037;
 //BA.debugLineNum = 51839037;BA.debugLine="Dim is_blocked As Int=0";
_is_blocked = (int) (0);
RDebugUtils.currentLine=51839038;
 //BA.debugLineNum = 51839038;BA.debugLine="Dim is_commercial As Int=0";
_is_commercial = (int) (0);
RDebugUtils.currentLine=51839039;
 //BA.debugLineNum = 51839039;BA.debugLine="Dim company As String=\"\"";
_company = "";
RDebugUtils.currentLine=51839040;
 //BA.debugLineNum = 51839040;BA.debugLine="Dim code As String=\"\"";
_code = "";
RDebugUtils.currentLine=51839041;
 //BA.debugLineNum = 51839041;BA.debugLine="Dim customer_group_code As String=\"\"";
_customer_group_code = "";
RDebugUtils.currentLine=51839042;
 //BA.debugLineNum = 51839042;BA.debugLine="Dim customer_group_name As String=\"\"";
_customer_group_name = "";
RDebugUtils.currentLine=51839043;
 //BA.debugLineNum = 51839043;BA.debugLine="Dim language As String=\"\"";
_language = "";
RDebugUtils.currentLine=51839044;
 //BA.debugLineNum = 51839044;BA.debugLine="Dim country_id As String=\"\"";
_country_id = "";
RDebugUtils.currentLine=51839045;
 //BA.debugLineNum = 51839045;BA.debugLine="If custom_attributes.IsInitialized Then";
if (true) break;

case 25:
//if
this.state = 80;
if (_custom_attributes.IsInitialized()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=51839046;
 //BA.debugLineNum = 51839046;BA.debugLine="Log(custom_attributes)";
parent.__c.LogImpl("851839046",BA.ObjectToString(_custom_attributes),0);
RDebugUtils.currentLine=51839047;
 //BA.debugLineNum = 51839047;BA.debugLine="For Each mAttribute As Map In custom_attributes";
if (true) break;

case 28:
//for
this.state = 79;
_mattribute = new anywheresoftware.b4a.objects.collections.Map();
group68 = _custom_attributes;
index68 = 0;
groupLen68 = group68.getSize();
this.state = 99;
if (true) break;

case 99:
//C
this.state = 79;
if (index68 < groupLen68) {
this.state = 30;
_mattribute = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group68.Get(index68)));}
if (true) break;

case 100:
//C
this.state = 99;
index68++;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=51839048;
 //BA.debugLineNum = 51839048;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_blocke";
if (true) break;

case 31:
//if
this.state = 36;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("is_blocked"))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_is_blocked = (int)(BA.ObjectToNumber(_mattribute.Get((Object)("value"))));
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=51839049;
 //BA.debugLineNum = 51839049;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_commer";
if (true) break;

case 37:
//if
this.state = 42;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("is_commercial"))) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_is_commercial = (int)(BA.ObjectToNumber(_mattribute.Get((Object)("value"))));
if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=51839050;
 //BA.debugLineNum = 51839050;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"company\"";
if (true) break;

case 43:
//if
this.state = 48;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("company"))) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
_company = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=51839051;
 //BA.debugLineNum = 51839051;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"code\" The";
if (true) break;

case 49:
//if
this.state = 54;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("code"))) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_code = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=51839052;
 //BA.debugLineNum = 51839052;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
if (true) break;

case 55:
//if
this.state = 60;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("customer_group_code"))) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
_customer_group_code = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=51839053;
 //BA.debugLineNum = 51839053;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
if (true) break;

case 61:
//if
this.state = 66;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("customer_group_name"))) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
_customer_group_name = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=51839054;
 //BA.debugLineNum = 51839054;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"language\"";
if (true) break;

case 67:
//if
this.state = 72;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("language"))) { 
this.state = 69;
;}if (true) break;

case 69:
//C
this.state = 72;
_language = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 72:
//C
this.state = 73;
;
RDebugUtils.currentLine=51839055;
 //BA.debugLineNum = 51839055;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"country_i";
if (true) break;

case 73:
//if
this.state = 78;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("country_id"))) { 
this.state = 75;
;}if (true) break;

case 75:
//C
this.state = 78;
_country_id = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 78:
//C
this.state = 100;
;
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
;
RDebugUtils.currentLine=51839058;
 //BA.debugLineNum = 51839058;BA.debugLine="colitems.put(\"is_blocked\",is_blocked)";
_colitems.Put((Object)("is_blocked"),(Object)(_is_blocked));
RDebugUtils.currentLine=51839059;
 //BA.debugLineNum = 51839059;BA.debugLine="colitems.put(\"is_commercial\",is_commercial)";
_colitems.Put((Object)("is_commercial"),(Object)(_is_commercial));
RDebugUtils.currentLine=51839060;
 //BA.debugLineNum = 51839060;BA.debugLine="colitems.put(\"company\",company)";
_colitems.Put((Object)("company"),(Object)(_company));
RDebugUtils.currentLine=51839061;
 //BA.debugLineNum = 51839061;BA.debugLine="colitems.put(\"code\",code)";
_colitems.Put((Object)("code"),(Object)(_code));
RDebugUtils.currentLine=51839062;
 //BA.debugLineNum = 51839062;BA.debugLine="colitems.put(\"customer_group_code\",customer_gro";
_colitems.Put((Object)("customer_group_code"),(Object)(_customer_group_code));
RDebugUtils.currentLine=51839063;
 //BA.debugLineNum = 51839063;BA.debugLine="colitems.put(\"customer_group_name\",customer_gro";
_colitems.Put((Object)("customer_group_name"),(Object)(_customer_group_name));
RDebugUtils.currentLine=51839064;
 //BA.debugLineNum = 51839064;BA.debugLine="colitems.put(\"language\",language)";
_colitems.Put((Object)("language"),(Object)(_language));
RDebugUtils.currentLine=51839065;
 //BA.debugLineNum = 51839065;BA.debugLine="colitems.put(\"country_id\",country_id)";
_colitems.Put((Object)("country_id"),(Object)(_country_id));
 if (true) break;

case 80:
//C
this.state = 92;
;
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
;
RDebugUtils.currentLine=51839071;
 //BA.debugLineNum = 51839071;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BClientes",_items);
RDebugUtils.currentLine=51839072;
 //BA.debugLineNum = 51839072;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
_search_criteria = new anywheresoftware.b4a.objects.collections.Map();
_search_criteria = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("search_criteria"))));
RDebugUtils.currentLine=51839073;
 //BA.debugLineNum = 51839073;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
_filter_groups = new anywheresoftware.b4a.objects.collections.List();
_filter_groups = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_criteria.Get((Object)("filter_groups"))));
RDebugUtils.currentLine=51839074;
 //BA.debugLineNum = 51839074;BA.debugLine="For Each colfilter_groups As Map In filter_groups";
if (true) break;

case 82:
//for
this.state = 89;
_colfilter_groups = new anywheresoftware.b4a.objects.collections.Map();
group91 = _filter_groups;
index91 = 0;
groupLen91 = group91.getSize();
this.state = 101;
if (true) break;

case 101:
//C
this.state = 89;
if (index91 < groupLen91) {
this.state = 84;
_colfilter_groups = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group91.Get(index91)));}
if (true) break;

case 102:
//C
this.state = 101;
index91++;
if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=51839075;
 //BA.debugLineNum = 51839075;BA.debugLine="Dim filters As List = colfilter_groups.Get(\"filt";
_filters = new anywheresoftware.b4a.objects.collections.List();
_filters = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colfilter_groups.Get((Object)("filters"))));
RDebugUtils.currentLine=51839076;
 //BA.debugLineNum = 51839076;BA.debugLine="For Each colfilters As Map In filters";
if (true) break;

case 85:
//for
this.state = 88;
_colfilters = new anywheresoftware.b4a.objects.collections.Map();
group93 = _filters;
index93 = 0;
groupLen93 = group93.getSize();
this.state = 103;
if (true) break;

case 103:
//C
this.state = 88;
if (index93 < groupLen93) {
this.state = 87;
_colfilters = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group93.Get(index93)));}
if (true) break;

case 104:
//C
this.state = 103;
index93++;
if (true) break;

case 87:
//C
this.state = 104;
RDebugUtils.currentLine=51839077;
 //BA.debugLineNum = 51839077;BA.debugLine="Dim field As String = colfilters.Get(\"field\")";
_field = BA.ObjectToString(_colfilters.Get((Object)("field")));
RDebugUtils.currentLine=51839078;
 //BA.debugLineNum = 51839078;BA.debugLine="Dim condition_type As String = colfilters.Get(\"";
_condition_type = BA.ObjectToString(_colfilters.Get((Object)("condition_type")));
RDebugUtils.currentLine=51839079;
 //BA.debugLineNum = 51839079;BA.debugLine="Dim value As String = colfilters.Get(\"value\")";
_value = BA.ObjectToString(_colfilters.Get((Object)("value")));
 if (true) break;
if (true) break;

case 88:
//C
this.state = 102;
;
 if (true) break;
if (true) break;

case 89:
//C
this.state = -1;
;
RDebugUtils.currentLine=51839082;
 //BA.debugLineNum = 51839082;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=51839083;
 //BA.debugLineNum = 51839083;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargapedidos(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "cargapedidos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargapedidos", null));}
ResumableSub_CargaPedidos rsub = new ResumableSub_CargaPedidos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaPedidos extends BA.ResumableSub {
public ResumableSub_CargaPedidos(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
de.amberhome.locale.AHLocale _locale = null;
de.amberhome.locale.AHNumeric _ahnum = null;
String _sresp = "";
Object _robj = null;
String _dateformatant = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _total_count = 0;
anywheresoftware.b4a.objects.collections.List _lstpedidos = null;
anywheresoftware.b4a.objects.collections.Map _mdatapedido = null;
int _idpedido = 0;
int _idtienda = 0;
String _nombretienda = "";
String _pedido = "";
String _fechacreacion = "";
String _fechaactualizacion = "";
long _fechacreacionlong = 0L;
long _fechaactualizacionlong = 0L;
String _ordencompra = "";
String _emailcomprador = "";
String _nombreusuariocomprador = "";
String _apellidousuariocomprador = "";
int _idcliente = 0;
int _idgrpcliente = 0;
String _clienteerp = "";
String _nombreclienteerp = "";
String _grpclienteerp = "";
String _nombregrpclienteerp = "";
int _iddireccionenvioclienteerp = 0;
String _nombredireccionenvioclienteerp = "";
int _iddireccionfacturacion = 0;
String _nombredireccionfacturacion = "";
double _totalqtypedida = 0;
double _totalqtyenviada = 0;
double _totalqtyfacturada = 0;
String _statuspedido = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributespedido = null;
String _po_number = "";
double _tipoivapedido = 0;
double _importeivapedido = 0;
anywheresoftware.b4a.objects.collections.Map _pgw = null;
String _sextradatapgw = "";
anywheresoftware.b4j.objects.collections.JSONParser _parserextradatapgw = null;
anywheresoftware.b4a.objects.collections.Map _mextradatapgw = null;
anywheresoftware.b4a.objects.collections.List _lstextradatapgwtaxdetails = null;
anywheresoftware.b4a.objects.collections.Map _mdatataxespedido = null;
String _customer_firstname = "";
anywheresoftware.b4a.objects.collections.Map _billing_address = null;
String _firstname = "";
String _address_type = "";
int _customer_address_id = 0;
String _city = "";
String _postcode = "";
int _region_id = 0;
String _telephone = "";
int _entity_id = 0;
String _lastname = "";
int _parent_id = 0;
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
String _region = "";
String _country_id = "";
String _email = "";
String _region_code = "";
anywheresoftware.b4a.objects.collections.Map _billingextensionattributes = null;
double _total_paid = 0;
String _increment_id = "";
anywheresoftware.b4a.objects.collections.Map _payment = null;
double _base_amount_ordered = 0;
double _amount_paid = 0;
String _method = "";
String _cc_last4 = "";
String _account_status = "";
double _amount_ordered = 0;
int _paymententity_id = 0;
double _base_amount_paid = 0;
int _shipping_amount = 0;
anywheresoftware.b4a.objects.collections.List _additional_information = null;
String _coladditional_information = "";
double _base_shipping_amount = 0;
int _paymentparent_id = 0;
String _state = "";
double _base_grand_total = 0;
int _billing_address_id = 0;
String _customer_lastname = "";
int _quote_id = 0;
int _shipping_invoiced = 0;
int _discount_tax_compensation_amount = 0;
int _weight = 0;
double _base_total_invoiced = 0;
int _base_subtotal_invoiced = 0;
String _applied_rule_ids = "";
double _subtotal_incl_tax = 0;
int _base_shipping_discount_tax_compensation_amnt = 0;
double _subtotal = 0;
int _base_shipping_incl_tax = 0;
String _customer_email = "";
int _base_discount_invoiced = 0;
double _total_invoiced = 0;
int _base_to_global_rate = 0;
int _customer_is_guest = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
String _product_type = "";
double _tax_amount = 0;
double _tax_invoiced = 0;
int _original_price = 0;
int _free_shipping = 0;
int _base_discount_tax_compensation_invoiced = 0;
int _discount_amount = 0;
double _tax_percent = 0;
double _price_incl_tax = 0;
int _price = 0;
int _product_id = 0;
int _base_row_total = 0;
String _sku = "";
int _base_original_price = 0;
int _row_weight = 0;
int _base_amount_refunded = 0;
double _base_price_incl_tax = 0;
int _no_discount = 0;
String _name = "";
int _discount_percent = 0;
int _order_id = 0;
int _discount_tax_compensation_invoiced = 0;
String _created_at = "";
int _qty_shipped = 0;
int _qty_ordered = 0;
int _row_total = 0;
int _qty_canceled = 0;
anywheresoftware.b4a.objects.collections.Map _product_option = null;
String _talla = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributesproductoption = null;
anywheresoftware.b4a.objects.collections.List _configurable_item_options = null;
anywheresoftware.b4a.objects.collections.Map _colconfigurable_item_options = null;
int _option_value = 0;
String _option_id = "";
int _amount_refunded = 0;
String _updated_at = "";
double _base_price = 0;
int _qty_invoiced = 0;
int _row_invoiced = 0;
double _row_total_incl_tax = 0;
double _base_tax_amount = 0;
int _store_id = 0;
int _item_id = 0;
int _base_discount_amount = 0;
double _base_row_total_incl_tax = 0;
int _base_discount_tax_compensation_amount = 0;
int _qty_refunded = 0;
int _base_row_invoiced = 0;
int _is_qty_decimal = 0;
int _discount_invoiced = 0;
double _base_tax_invoiced = 0;
anywheresoftware.b4a.objects.collections.Map _parent_item = null;
anywheresoftware.b4a.objects.collections.Map _mcolitemsextensionattributes = null;
String _global_currency_code = "";
String _status = "";
int _is_virtual = 0;
int _base_total_invoiced_cost = 0;
anywheresoftware.b4a.objects.collections.List _status_histories = null;
String _store_currency_code = "";
int _total_item_count = 0;
int _shipping_tax_amount = 0;
int _store_to_base_rate = 0;
int _base_shipping_discount_amount = 0;
double _grand_total = 0;
String _base_currency_code = "";
double _base_total_paid = 0;
int _shipping_discount_tax_compensation_amount = 0;
int _total_due = 0;
int _total_qty_ordered = 0;
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
anywheresoftware.b4a.objects.collections.List _shipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _pgwshipping = null;
anywheresoftware.b4a.objects.collections.List _payment_additional_info = null;
anywheresoftware.b4a.objects.collections.Map _colpayment_additional_info = null;
String _value = "";
String _key = "";
anywheresoftware.b4a.objects.collections.List _applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colapplied_taxes = null;
double _amount = 0;
String _code = "";
double _base_amount = 0;
String _title = "";
double _percent = 0;
anywheresoftware.b4a.objects.collections.List _item_applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colitem_applied_taxes = null;
String _type = "";
String _converting_from_quote = "";
String _shipping_description = "";
int _store_to_order_rate = 0;
int _subtotal_invoiced = 0;
int _base_to_order_rate = 0;
int _base_subtotal = 0;
String _protect_code = "";
String _customer_dob = "";
int _base_total_due = 0;
double _base_subtotal_incl_tax = 0;
int _customer_id = 0;
int _customer_group_id = 0;
String _order_currency_code = "";
int _customer_gender = 0;
int _shipping_incl_tax = 0;
int _base_shipping_invoiced = 0;
String _ssql = "";
anywheresoftware.b4a.objects.collections.Map _search_criteria = null;
anywheresoftware.b4a.objects.collections.List _filter_groups = null;
int _page_size = 0;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
anywheresoftware.b4a.BA.IterableList group52;
int index52;
int groupLen52;
anywheresoftware.b4a.BA.IterableList group76;
int index76;
int groupLen76;
anywheresoftware.b4a.BA.IterableList group100;
int index100;
int groupLen100;
anywheresoftware.b4a.BA.IterableList group131;
int index131;
int groupLen131;
anywheresoftware.b4a.BA.IterableList group172;
int index172;
int groupLen172;
anywheresoftware.b4a.BA.IterableList group248;
int index248;
int groupLen248;
anywheresoftware.b4a.BA.IterableList group255;
int index255;
int groupLen255;
anywheresoftware.b4a.BA.IterableList group265;
int index265;
int groupLen265;
anywheresoftware.b4a.BA.IterableList group267;
int index267;
int groupLen267;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51576834;
 //BA.debugLineNum = 51576834;BA.debugLine="Dim Locale As AHLocale";
_locale = new de.amberhome.locale.AHLocale();
RDebugUtils.currentLine=51576835;
 //BA.debugLineNum = 51576835;BA.debugLine="Locale.Initialize";
_locale.Initialize();
RDebugUtils.currentLine=51576836;
 //BA.debugLineNum = 51576836;BA.debugLine="Dim AHNum As AHNumeric";
_ahnum = new de.amberhome.locale.AHNumeric();
RDebugUtils.currentLine=51576837;
 //BA.debugLineNum = 51576837;BA.debugLine="AHNum.InitializeNumber2(Locale)";
_ahnum.InitializeNumber2(_locale);
RDebugUtils.currentLine=51576839;
 //BA.debugLineNum = 51576839;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BOrders\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BOrders");
RDebugUtils.currentLine=51576840;
 //BA.debugLineNum = 51576840;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BOrdersTotale";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BOrdersTotales");
RDebugUtils.currentLine=51576841;
 //BA.debugLineNum = 51576841;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidos(t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargapedidos"), __ref._enviodatosapimagentoinformacionpedidos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 105;
return;
case 105:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=51576842;
 //BA.debugLineNum = 51576842;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=51576843;
 //BA.debugLineNum = 51576843;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=51576844;
 //BA.debugLineNum = 51576844;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "cargapedidos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Pedidos B2B"));
this.state = 106;
return;
case 106:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=51576845;
 //BA.debugLineNum = 51576845;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=51576848;
 //BA.debugLineNum = 51576848;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=51576849;
 //BA.debugLineNum = 51576849;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=51576851;
 //BA.debugLineNum = 51576851;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=51576852;
 //BA.debugLineNum = 51576852;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=51576853;
 //BA.debugLineNum = 51576853;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=51576854;
 //BA.debugLineNum = 51576854;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
_total_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_count"))));
RDebugUtils.currentLine=51576856;
 //BA.debugLineNum = 51576856;BA.debugLine="Dim lstPedidos As List = root.Get(\"items\")";
_lstpedidos = new anywheresoftware.b4a.objects.collections.List();
_lstpedidos = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=51576858;
 //BA.debugLineNum = 51576858;BA.debugLine="For Each mDataPedido As Map In lstPedidos";
if (true) break;

case 5:
//for
this.state = 104;
_mdatapedido = new anywheresoftware.b4a.objects.collections.Map();
group20 = _lstpedidos;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 107;
if (true) break;

case 107:
//C
this.state = 104;
if (index20 < groupLen20) {
this.state = 7;
_mdatapedido = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 108:
//C
this.state = 107;
index20++;
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=51576860;
 //BA.debugLineNum = 51576860;BA.debugLine="Log(\"mDataPedido: \" & mDataPedido)";
parent.__c.LogImpl("851576860","mDataPedido: "+BA.ObjectToString(_mdatapedido),0);
RDebugUtils.currentLine=51576866;
 //BA.debugLineNum = 51576866;BA.debugLine="Dim IDPedido, IDTienda As Int";
_idpedido = 0;
_idtienda = 0;
RDebugUtils.currentLine=51576867;
 //BA.debugLineNum = 51576867;BA.debugLine="Dim NombreTienda As String";
_nombretienda = "";
RDebugUtils.currentLine=51576868;
 //BA.debugLineNum = 51576868;BA.debugLine="Dim Pedido, FechaCreacion, FechaActualizacion As";
_pedido = "";
_fechacreacion = "";
_fechaactualizacion = "";
RDebugUtils.currentLine=51576869;
 //BA.debugLineNum = 51576869;BA.debugLine="Dim FechaCreacionLong, FechaActualizacionLong As";
_fechacreacionlong = 0L;
_fechaactualizacionlong = 0L;
RDebugUtils.currentLine=51576870;
 //BA.debugLineNum = 51576870;BA.debugLine="Dim OrdenCompra As String";
_ordencompra = "";
RDebugUtils.currentLine=51576871;
 //BA.debugLineNum = 51576871;BA.debugLine="Dim EmailComprador, NombreUsuarioComprador, Apel";
_emailcomprador = "";
_nombreusuariocomprador = "";
_apellidousuariocomprador = "";
RDebugUtils.currentLine=51576872;
 //BA.debugLineNum = 51576872;BA.debugLine="Dim IDCliente, IDGRPCliente As Int";
_idcliente = 0;
_idgrpcliente = 0;
RDebugUtils.currentLine=51576873;
 //BA.debugLineNum = 51576873;BA.debugLine="Dim ClienteERP, NombreClienteERP, GRPClienteERP,";
_clienteerp = "";
_nombreclienteerp = "";
_grpclienteerp = "";
_nombregrpclienteerp = "";
RDebugUtils.currentLine=51576874;
 //BA.debugLineNum = 51576874;BA.debugLine="Dim IDDireccionEnvioClienteERP As Int";
_iddireccionenvioclienteerp = 0;
RDebugUtils.currentLine=51576875;
 //BA.debugLineNum = 51576875;BA.debugLine="Dim NombreDireccionEnvioClienteERP As String";
_nombredireccionenvioclienteerp = "";
RDebugUtils.currentLine=51576876;
 //BA.debugLineNum = 51576876;BA.debugLine="Dim IDDireccionFacturacion As Int";
_iddireccionfacturacion = 0;
RDebugUtils.currentLine=51576877;
 //BA.debugLineNum = 51576877;BA.debugLine="Dim NombreDireccionFacturacion As String";
_nombredireccionfacturacion = "";
RDebugUtils.currentLine=51576878;
 //BA.debugLineNum = 51576878;BA.debugLine="Dim TotalQtyPedida, TotalQtyEnviada, TotalQtyFac";
_totalqtypedida = 0;
_totalqtyenviada = 0;
_totalqtyfacturada = 0;
RDebugUtils.currentLine=51576879;
 //BA.debugLineNum = 51576879;BA.debugLine="Dim StatusPedido As String";
_statuspedido = "";
RDebugUtils.currentLine=51576882;
 //BA.debugLineNum = 51576882;BA.debugLine="Dim extension_attributesPedido As Map = mDataPed";
_extension_attributespedido = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributespedido = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdatapedido.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=51576883;
 //BA.debugLineNum = 51576883;BA.debugLine="Dim po_number As String";
_po_number = "";
RDebugUtils.currentLine=51576884;
 //BA.debugLineNum = 51576884;BA.debugLine="Dim TipoIVAPedido As Double";
_tipoivapedido = 0;
RDebugUtils.currentLine=51576885;
 //BA.debugLineNum = 51576885;BA.debugLine="Dim ImporteIVAPedido As Double    ' .... NO TIEN";
_importeivapedido = 0;
RDebugUtils.currentLine=51576886;
 //BA.debugLineNum = 51576886;BA.debugLine="If extension_attributesPedido.IsInitialized Then";
if (true) break;

case 8:
//if
this.state = 25;
if (_extension_attributespedido.IsInitialized()) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=51576887;
 //BA.debugLineNum = 51576887;BA.debugLine="Dim pgw As Map=extension_attributesPedido.Get(\"";
_pgw = new anywheresoftware.b4a.objects.collections.Map();
_pgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_extension_attributespedido.Get((Object)("pgw"))));
RDebugUtils.currentLine=51576888;
 //BA.debugLineNum = 51576888;BA.debugLine="If pgw.IsInitialized Then";
if (true) break;

case 11:
//if
this.state = 24;
if (_pgw.IsInitialized()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=51576889;
 //BA.debugLineNum = 51576889;BA.debugLine="po_number=pgw.Getdefault(\"po_number\",\"\")";
_po_number = BA.ObjectToString(_pgw.GetDefault((Object)("po_number"),(Object)("")));
RDebugUtils.currentLine=51576890;
 //BA.debugLineNum = 51576890;BA.debugLine="OrdenCompra=po_number";
_ordencompra = _po_number;
RDebugUtils.currentLine=51576891;
 //BA.debugLineNum = 51576891;BA.debugLine="Dim sExtraDataPgw As String=pgw.Get(\"extra_dat";
_sextradatapgw = BA.ObjectToString(_pgw.Get((Object)("extra_data")));
RDebugUtils.currentLine=51576893;
 //BA.debugLineNum = 51576893;BA.debugLine="Try";
if (true) break;

case 14:
//try
this.state = 23;
this.catchState = 22;
this.state = 16;
if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 22;
RDebugUtils.currentLine=51576894;
 //BA.debugLineNum = 51576894;BA.debugLine="Dim parserExtraDataPgw As JSONParser";
_parserextradatapgw = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=51576895;
 //BA.debugLineNum = 51576895;BA.debugLine="parserExtraDataPgw.Initialize(sExtraDataPgw)";
_parserextradatapgw.Initialize(_sextradatapgw);
RDebugUtils.currentLine=51576896;
 //BA.debugLineNum = 51576896;BA.debugLine="Dim mExtraDataPgw As Map = parserExtraDataPgw";
_mextradatapgw = new anywheresoftware.b4a.objects.collections.Map();
_mextradatapgw = _parserextradatapgw.NextObject();
RDebugUtils.currentLine=51576897;
 //BA.debugLineNum = 51576897;BA.debugLine="Dim TipoIVAPedido As Double=mExtraDataPgw.Get";
_tipoivapedido = (double)(BA.ObjectToNumber(_mextradatapgw.Get((Object)("tax_rate"))));
RDebugUtils.currentLine=51576898;
 //BA.debugLineNum = 51576898;BA.debugLine="Dim lstExtraDataPgwTaxDetails As List=mExtraD";
_lstextradatapgwtaxdetails = new anywheresoftware.b4a.objects.collections.List();
_lstextradatapgwtaxdetails = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mextradatapgw.Get((Object)("Tax Details"))));
RDebugUtils.currentLine=51576899;
 //BA.debugLineNum = 51576899;BA.debugLine="For Each mDataTaxesPedido As Map In lstExtraD";
if (true) break;

case 17:
//for
this.state = 20;
_mdatataxespedido = new anywheresoftware.b4a.objects.collections.Map();
group52 = _lstextradatapgwtaxdetails;
index52 = 0;
groupLen52 = group52.getSize();
this.state = 109;
if (true) break;

case 109:
//C
this.state = 20;
if (index52 < groupLen52) {
this.state = 19;
_mdatataxespedido = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group52.Get(index52)));}
if (true) break;

case 110:
//C
this.state = 109;
index52++;
if (true) break;

case 19:
//C
this.state = 110;
RDebugUtils.currentLine=51576901;
 //BA.debugLineNum = 51576901;BA.debugLine="ImporteIVAPedido=mDataTaxesPedido.Get(\"Amoun";
_importeivapedido = (double)(BA.ObjectToNumber(_mdatataxespedido.Get((Object)("Amount"))));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
RDebugUtils.currentLine=51576904;
 //BA.debugLineNum = 51576904;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("851576904",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=51576922;
 //BA.debugLineNum = 51576922;BA.debugLine="Dim customer_firstname As String = mDataPedido.G";
_customer_firstname = BA.ObjectToString(_mdatapedido.Get((Object)("customer_firstname")));
RDebugUtils.currentLine=51576923;
 //BA.debugLineNum = 51576923;BA.debugLine="NombreUsuarioComprador=customer_firstname";
_nombreusuariocomprador = _customer_firstname;
RDebugUtils.currentLine=51576926;
 //BA.debugLineNum = 51576926;BA.debugLine="Dim billing_address As Map = mDataPedido.Get(\"bi";
_billing_address = new anywheresoftware.b4a.objects.collections.Map();
_billing_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdatapedido.Get((Object)("billing_address"))));
RDebugUtils.currentLine=51576927;
 //BA.debugLineNum = 51576927;BA.debugLine="IDDireccionFacturacion=billing_address.Get(\"enti";
_iddireccionfacturacion = (int)(BA.ObjectToNumber(_billing_address.Get((Object)("entity_id"))));
RDebugUtils.currentLine=51576928;
 //BA.debugLineNum = 51576928;BA.debugLine="Dim firstname As String = billing_address.Get(\"f";
_firstname = BA.ObjectToString(_billing_address.Get((Object)("firstname")));
RDebugUtils.currentLine=51576929;
 //BA.debugLineNum = 51576929;BA.debugLine="Dim address_type As String = billing_address.Get";
_address_type = BA.ObjectToString(_billing_address.Get((Object)("address_type")));
RDebugUtils.currentLine=51576930;
 //BA.debugLineNum = 51576930;BA.debugLine="Dim customer_address_id As Int = billing_address";
_customer_address_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("customer_address_id"),(Object)(-1))));
RDebugUtils.currentLine=51576931;
 //BA.debugLineNum = 51576931;BA.debugLine="IDDireccionEnvioClienteERP=customer_address_id";
_iddireccionenvioclienteerp = _customer_address_id;
RDebugUtils.currentLine=51576933;
 //BA.debugLineNum = 51576933;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
_city = BA.ObjectToString(_billing_address.Get((Object)("city")));
RDebugUtils.currentLine=51576934;
 //BA.debugLineNum = 51576934;BA.debugLine="Dim postcode As String = billing_address.Get(\"po";
_postcode = BA.ObjectToString(_billing_address.Get((Object)("postcode")));
RDebugUtils.currentLine=51576935;
 //BA.debugLineNum = 51576935;BA.debugLine="Dim region_id As Int = billing_address.Getdefaul";
_region_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("region_id"),(Object)(0))));
RDebugUtils.currentLine=51576936;
 //BA.debugLineNum = 51576936;BA.debugLine="Dim telephone As String = billing_address.Get(\"t";
_telephone = BA.ObjectToString(_billing_address.Get((Object)("telephone")));
RDebugUtils.currentLine=51576937;
 //BA.debugLineNum = 51576937;BA.debugLine="Dim entity_id As Int = billing_address.Get(\"enti";
_entity_id = (int)(BA.ObjectToNumber(_billing_address.Get((Object)("entity_id"))));
RDebugUtils.currentLine=51576938;
 //BA.debugLineNum = 51576938;BA.debugLine="Dim lastname As String = billing_address.Get(\"la";
_lastname = BA.ObjectToString(_billing_address.Get((Object)("lastname")));
RDebugUtils.currentLine=51576939;
 //BA.debugLineNum = 51576939;BA.debugLine="Dim parent_id As Int = billing_address.Get(\"pare";
_parent_id = (int)(BA.ObjectToNumber(_billing_address.Get((Object)("parent_id"))));
RDebugUtils.currentLine=51576940;
 //BA.debugLineNum = 51576940;BA.debugLine="Dim street As List = billing_address.Get(\"street";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_billing_address.Get((Object)("street"))));
RDebugUtils.currentLine=51576941;
 //BA.debugLineNum = 51576941;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 26:
//for
this.state = 29;
group76 = _street;
index76 = 0;
groupLen76 = group76.getSize();
this.state = 111;
if (true) break;

case 111:
//C
this.state = 29;
if (index76 < groupLen76) {
this.state = 28;
_colstreet = BA.ObjectToString(group76.Get(index76));}
if (true) break;

case 112:
//C
this.state = 111;
index76++;
if (true) break;

case 28:
//C
this.state = 112;
RDebugUtils.currentLine=51576943;
 //BA.debugLineNum = 51576943;BA.debugLine="NombreDireccionFacturacion=NombreDireccionFactu";
_nombredireccionfacturacion = _nombredireccionfacturacion+" "+_colstreet;
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=51576945;
 //BA.debugLineNum = 51576945;BA.debugLine="Dim region As String = billing_address.Get(\"regi";
_region = BA.ObjectToString(_billing_address.Get((Object)("region")));
RDebugUtils.currentLine=51576946;
 //BA.debugLineNum = 51576946;BA.debugLine="Dim country_id As String = billing_address.Get(\"";
_country_id = BA.ObjectToString(_billing_address.Get((Object)("country_id")));
RDebugUtils.currentLine=51576947;
 //BA.debugLineNum = 51576947;BA.debugLine="Dim email As String = billing_address.Get(\"email";
_email = BA.ObjectToString(_billing_address.Get((Object)("email")));
RDebugUtils.currentLine=51576948;
 //BA.debugLineNum = 51576948;BA.debugLine="Dim region_code As String = billing_address.Get(";
_region_code = BA.ObjectToString(_billing_address.Get((Object)("region_code")));
RDebugUtils.currentLine=51576949;
 //BA.debugLineNum = 51576949;BA.debugLine="NombreDireccionFacturacion=NombreDireccionFactur";
_nombredireccionfacturacion = _nombredireccionfacturacion+", "+_postcode+" "+_city+" "+_region+" "+_country_id;
RDebugUtils.currentLine=51576950;
 //BA.debugLineNum = 51576950;BA.debugLine="NombreDireccionFacturacion=NombreDireccionFactur";
_nombredireccionfacturacion = _nombredireccionfacturacion.trim();
RDebugUtils.currentLine=51576951;
 //BA.debugLineNum = 51576951;BA.debugLine="Dim BillingExtensionAttributes As Map=billing_ad";
_billingextensionattributes = new anywheresoftware.b4a.objects.collections.Map();
_billingextensionattributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_billing_address.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=51576953;
 //BA.debugLineNum = 51576953;BA.debugLine="Dim total_paid As Double = mDataPedido.Getdefaul";
_total_paid = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("total_paid"),(Object)(0))));
RDebugUtils.currentLine=51576955;
 //BA.debugLineNum = 51576955;BA.debugLine="Dim increment_id As String = mDataPedido.Get(\"in";
_increment_id = BA.ObjectToString(_mdatapedido.Get((Object)("increment_id")));
RDebugUtils.currentLine=51576956;
 //BA.debugLineNum = 51576956;BA.debugLine="Pedido=increment_id";
_pedido = _increment_id;
RDebugUtils.currentLine=51576958;
 //BA.debugLineNum = 51576958;BA.debugLine="Dim payment As Map = mDataPedido.Get(\"payment\")";
_payment = new anywheresoftware.b4a.objects.collections.Map();
_payment = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdatapedido.Get((Object)("payment"))));
RDebugUtils.currentLine=51576959;
 //BA.debugLineNum = 51576959;BA.debugLine="Dim base_amount_ordered As Double = payment.Getd";
_base_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=51576960;
 //BA.debugLineNum = 51576960;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"";
_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_paid"),(Object)(0))));
RDebugUtils.currentLine=51576961;
 //BA.debugLineNum = 51576961;BA.debugLine="Dim method As String = payment.Get(\"method\")";
_method = BA.ObjectToString(_payment.Get((Object)("method")));
RDebugUtils.currentLine=51576962;
 //BA.debugLineNum = 51576962;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
_cc_last4 = BA.ObjectToString(_payment.Get((Object)("cc_last4")));
RDebugUtils.currentLine=51576964;
 //BA.debugLineNum = 51576964;BA.debugLine="Dim account_status As String = payment.Get(\"acco";
_account_status = BA.ObjectToString(_payment.Get((Object)("account_status")));
RDebugUtils.currentLine=51576965;
 //BA.debugLineNum = 51576965;BA.debugLine="Dim amount_ordered As Double = payment.Getdefaul";
_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=51576966;
 //BA.debugLineNum = 51576966;BA.debugLine="Dim PaymentEntity_id As Int = payment.Get(\"entit";
_paymententity_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("entity_id"))));
RDebugUtils.currentLine=51576967;
 //BA.debugLineNum = 51576967;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefa";
_base_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_paid"),(Object)(0))));
RDebugUtils.currentLine=51576968;
 //BA.debugLineNum = 51576968;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(";
_shipping_amount = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=51576969;
 //BA.debugLineNum = 51576969;BA.debugLine="Dim additional_information As List = payment.Get";
_additional_information = new anywheresoftware.b4a.objects.collections.List();
_additional_information = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_payment.Get((Object)("additional_information"))));
RDebugUtils.currentLine=51576970;
 //BA.debugLineNum = 51576970;BA.debugLine="For Each coladditional_information As String In";
if (true) break;

case 30:
//for
this.state = 33;
group100 = _additional_information;
index100 = 0;
groupLen100 = group100.getSize();
this.state = 113;
if (true) break;

case 113:
//C
this.state = 33;
if (index100 < groupLen100) {
this.state = 32;
_coladditional_information = BA.ObjectToString(group100.Get(index100));}
if (true) break;

case 114:
//C
this.state = 113;
index100++;
if (true) break;

case 32:
//C
this.state = 114;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=51576972;
 //BA.debugLineNum = 51576972;BA.debugLine="Dim base_shipping_amount As Double = payment.Get";
_base_shipping_amount = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=51576973;
 //BA.debugLineNum = 51576973;BA.debugLine="Dim PaymentParent_id As Int = payment.Get(\"paren";
_paymentparent_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("parent_id"))));
RDebugUtils.currentLine=51576976;
 //BA.debugLineNum = 51576976;BA.debugLine="Dim state As String = mDataPedido.Get(\"state\")";
_state = BA.ObjectToString(_mdatapedido.Get((Object)("state")));
RDebugUtils.currentLine=51576979;
 //BA.debugLineNum = 51576979;BA.debugLine="Dim base_grand_total As Double = mDataPedido.Get";
_base_grand_total = (double)(BA.ObjectToNumber(_mdatapedido.Get((Object)("base_grand_total"))));
RDebugUtils.currentLine=51576981;
 //BA.debugLineNum = 51576981;BA.debugLine="Dim billing_address_id As Int = mDataPedido.Get(";
_billing_address_id = (int)(BA.ObjectToNumber(_mdatapedido.Get((Object)("billing_address_id"))));
RDebugUtils.currentLine=51576983;
 //BA.debugLineNum = 51576983;BA.debugLine="Dim customer_lastname As String = mDataPedido.Ge";
_customer_lastname = BA.ObjectToString(_mdatapedido.Get((Object)("customer_lastname")));
RDebugUtils.currentLine=51576984;
 //BA.debugLineNum = 51576984;BA.debugLine="ApellidoUsuarioComprador=customer_lastname";
_apellidousuariocomprador = _customer_lastname;
RDebugUtils.currentLine=51576986;
 //BA.debugLineNum = 51576986;BA.debugLine="Dim quote_id As Int = mDataPedido.Getdefault(\"qu";
_quote_id = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("quote_id"),(Object)(0))));
RDebugUtils.currentLine=51576988;
 //BA.debugLineNum = 51576988;BA.debugLine="Dim shipping_invoiced As Int = mDataPedido.Getde";
_shipping_invoiced = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("shipping_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=51576990;
 //BA.debugLineNum = 51576990;BA.debugLine="Dim discount_tax_compensation_amount As Int = mD";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=51576992;
 //BA.debugLineNum = 51576992;BA.debugLine="Dim weight As Int = mDataPedido.Getdefault(\"weig";
_weight = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("weight"),(Object)(0))));
RDebugUtils.currentLine=51576994;
 //BA.debugLineNum = 51576994;BA.debugLine="Dim entity_id As Int = mDataPedido.Get(\"entity_i";
_entity_id = (int)(BA.ObjectToNumber(_mdatapedido.Get((Object)("entity_id"))));
RDebugUtils.currentLine=51576996;
 //BA.debugLineNum = 51576996;BA.debugLine="Dim IDPedido As Int = mDataPedido.Get(\"entity_id";
_idpedido = (int)(BA.ObjectToNumber(_mdatapedido.Get((Object)("entity_id"))));
RDebugUtils.currentLine=51576997;
 //BA.debugLineNum = 51576997;BA.debugLine="Log($\"IDPedido: ${IDPedido}\"$)";
parent.__c.LogImpl("851576997",("IDPedido: "+parent.__c.SmartStringFormatter("",(Object)(_idpedido))+""),0);
RDebugUtils.currentLine=51576999;
 //BA.debugLineNum = 51576999;BA.debugLine="Dim base_total_invoiced As Double = mDataPedido.";
_base_total_invoiced = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577001;
 //BA.debugLineNum = 51577001;BA.debugLine="Dim base_shipping_amount As Double = mDataPedido";
_base_shipping_amount = (double)(BA.ObjectToNumber(_mdatapedido.Get((Object)("base_shipping_amount"))));
RDebugUtils.currentLine=51577003;
 //BA.debugLineNum = 51577003;BA.debugLine="Dim base_subtotal_invoiced As Int = mDataPedido.";
_base_subtotal_invoiced = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_subtotal_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577005;
 //BA.debugLineNum = 51577005;BA.debugLine="Dim applied_rule_ids As String = mDataPedido.Get";
_applied_rule_ids = BA.ObjectToString(_mdatapedido.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=51577007;
 //BA.debugLineNum = 51577007;BA.debugLine="Dim subtotal_incl_tax As Double = mDataPedido.Ge";
_subtotal_incl_tax = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("subtotal_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=51577009;
 //BA.debugLineNum = 51577009;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_shipping_discount_tax_compensation_amnt"),(Object)(0))));
RDebugUtils.currentLine=51577011;
 //BA.debugLineNum = 51577011;BA.debugLine="Dim subtotal As Double = mDataPedido.Get(\"subtot";
_subtotal = (double)(BA.ObjectToNumber(_mdatapedido.Get((Object)("subtotal"))));
RDebugUtils.currentLine=51577013;
 //BA.debugLineNum = 51577013;BA.debugLine="Dim base_shipping_incl_tax As Int = mDataPedido.";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=51577015;
 //BA.debugLineNum = 51577015;BA.debugLine="Dim customer_email As String = mDataPedido.Get(\"";
_customer_email = BA.ObjectToString(_mdatapedido.Get((Object)("customer_email")));
RDebugUtils.currentLine=51577016;
 //BA.debugLineNum = 51577016;BA.debugLine="EmailComprador=customer_email";
_emailcomprador = _customer_email;
RDebugUtils.currentLine=51577018;
 //BA.debugLineNum = 51577018;BA.debugLine="Dim base_discount_invoiced As Int = mDataPedido.";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577020;
 //BA.debugLineNum = 51577020;BA.debugLine="Dim total_invoiced As Double = mDataPedido.Getde";
_total_invoiced = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577022;
 //BA.debugLineNum = 51577022;BA.debugLine="Dim base_to_global_rate As Int = mDataPedido.Get";
_base_to_global_rate = (int)(BA.ObjectToNumber(_mdatapedido.Get((Object)("base_to_global_rate"))));
RDebugUtils.currentLine=51577024;
 //BA.debugLineNum = 51577024;BA.debugLine="Dim customer_is_guest As Int = mDataPedido.Get(\"";
_customer_is_guest = (int)(BA.ObjectToNumber(_mdatapedido.Get((Object)("customer_is_guest"))));
RDebugUtils.currentLine=51577026;
 //BA.debugLineNum = 51577026;BA.debugLine="Dim items As List = mDataPedido.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mdatapedido.Get((Object)("items"))));
RDebugUtils.currentLine=51577027;
 //BA.debugLineNum = 51577027;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 34:
//for
this.state = 63;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group131 = _items;
index131 = 0;
groupLen131 = group131.getSize();
this.state = 115;
if (true) break;

case 115:
//C
this.state = 63;
if (index131 < groupLen131) {
this.state = 36;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group131.Get(index131)));}
if (true) break;

case 116:
//C
this.state = 115;
index131++;
if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=51577029;
 //BA.debugLineNum = 51577029;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
_product_type = BA.ObjectToString(_colitems.Get((Object)("product_type")));
RDebugUtils.currentLine=51577030;
 //BA.debugLineNum = 51577030;BA.debugLine="If product_type=\"configurable\" Then Continue";
if (true) break;

case 37:
//if
this.state = 42;
if ((_product_type).equals("configurable")) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
this.state = 116;
if (true) break;;
if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=51577032;
 //BA.debugLineNum = 51577032;BA.debugLine="colitems.Put(\"po_number\",po_number)";
_colitems.Put((Object)("po_number"),(Object)(_po_number));
RDebugUtils.currentLine=51577033;
 //BA.debugLineNum = 51577033;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(";
_tax_amount = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_amount"),(Object)(0))));
RDebugUtils.currentLine=51577034;
 //BA.debugLineNum = 51577034;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"tax_";
_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("tax_invoiced"))));
RDebugUtils.currentLine=51577035;
 //BA.debugLineNum = 51577035;BA.debugLine="Dim original_price As Int = colitems.Get(\"origi";
_original_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("original_price"))));
RDebugUtils.currentLine=51577036;
 //BA.debugLineNum = 51577036;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"free_s";
_free_shipping = (int)(BA.ObjectToNumber(_colitems.Get((Object)("free_shipping"))));
RDebugUtils.currentLine=51577037;
 //BA.debugLineNum = 51577037;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577038;
 //BA.debugLineNum = 51577038;BA.debugLine="Dim discount_amount As Int = colitems.Getdefaul";
_discount_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_amount"),(Object)(0))));
RDebugUtils.currentLine=51577039;
 //BA.debugLineNum = 51577039;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault";
_tax_percent = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_percent"),(Object)(0))));
RDebugUtils.currentLine=51577040;
 //BA.debugLineNum = 51577040;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
_price_incl_tax = parent._utilidades._fixnulldouble /*double*/ (_colitems.GetDefault((Object)("price_incl_tax"),(Object)(0)));
RDebugUtils.currentLine=51577041;
 //BA.debugLineNum = 51577041;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("price"))));
RDebugUtils.currentLine=51577042;
 //BA.debugLineNum = 51577042;BA.debugLine="Dim product_id As Int = colitems.Getdefault(\"pr";
_product_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("product_id"),(Object)(-1))));
RDebugUtils.currentLine=51577043;
 //BA.debugLineNum = 51577043;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"base_";
_base_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total"))));
RDebugUtils.currentLine=51577044;
 //BA.debugLineNum = 51577044;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=51577045;
 //BA.debugLineNum = 51577045;BA.debugLine="Dim discount_tax_compensation_amount As Int = c";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=51577046;
 //BA.debugLineNum = 51577046;BA.debugLine="Dim weight As Int = colitems.Getdefault(\"weight";
_weight = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("weight"),(Object)(-1))));
RDebugUtils.currentLine=51577047;
 //BA.debugLineNum = 51577047;BA.debugLine="Dim base_original_price As Int = colitems.GetDE";
_base_original_price = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_original_price"),(Object)(0))));
RDebugUtils.currentLine=51577048;
 //BA.debugLineNum = 51577048;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weigh";
_row_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_weight"))));
RDebugUtils.currentLine=51577049;
 //BA.debugLineNum = 51577049;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=51577050;
 //BA.debugLineNum = 51577050;BA.debugLine="Dim base_amount_refunded As Int = colitems.Get(";
_base_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_amount_refunded"))));
RDebugUtils.currentLine=51577051;
 //BA.debugLineNum = 51577051;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Ge";
_base_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_price_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=51577052;
 //BA.debugLineNum = 51577052;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_disco";
_no_discount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("no_discount"))));
RDebugUtils.currentLine=51577053;
 //BA.debugLineNum = 51577053;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=51577054;
 //BA.debugLineNum = 51577054;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Ge";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_invoiced"))));
RDebugUtils.currentLine=51577055;
 //BA.debugLineNum = 51577055;BA.debugLine="Dim discount_percent As Int = colitems.Getdefau";
_discount_percent = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_percent"),(Object)(0))));
RDebugUtils.currentLine=51577056;
 //BA.debugLineNum = 51577056;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
_order_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("order_id"))));
RDebugUtils.currentLine=51577057;
 //BA.debugLineNum = 51577057;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577058;
 //BA.debugLineNum = 51577058;BA.debugLine="Dim created_at As String = colitems.Get(\"create";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=51577059;
 //BA.debugLineNum = 51577059;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_ship";
_qty_shipped = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_shipped"))));
RDebugUtils.currentLine=51577060;
 //BA.debugLineNum = 51577060;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_orde";
_qty_ordered = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_ordered"))));
RDebugUtils.currentLine=51577062;
 //BA.debugLineNum = 51577062;BA.debugLine="TotalQtyPedida=TotalQtyPedida+qty_ordered";
_totalqtypedida = _totalqtypedida+_qty_ordered;
RDebugUtils.currentLine=51577063;
 //BA.debugLineNum = 51577063;BA.debugLine="TotalQtyEnviada=TotalQtyEnviada+qty_shipped";
_totalqtyenviada = _totalqtyenviada+_qty_shipped;
RDebugUtils.currentLine=51577065;
 //BA.debugLineNum = 51577065;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_total\"";
_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_total"))));
RDebugUtils.currentLine=51577066;
 //BA.debugLineNum = 51577066;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_can";
_qty_canceled = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_canceled"))));
RDebugUtils.currentLine=51577067;
 //BA.debugLineNum = 51577067;BA.debugLine="Dim product_option As Map = colitems.Get(\"produ";
_product_option = new anywheresoftware.b4a.objects.collections.Map();
_product_option = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("product_option"))));
RDebugUtils.currentLine=51577068;
 //BA.debugLineNum = 51577068;BA.debugLine="Dim Talla As String";
_talla = "";
RDebugUtils.currentLine=51577069;
 //BA.debugLineNum = 51577069;BA.debugLine="If product_option.IsInitialized Then";
if (true) break;

case 43:
//if
this.state = 54;
if (_product_option.IsInitialized()) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=51577070;
 //BA.debugLineNum = 51577070;BA.debugLine="Dim extension_attributesProductOption As Map =";
_extension_attributesproductoption = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributesproductoption = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_product_option.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=51577071;
 //BA.debugLineNum = 51577071;BA.debugLine="Dim configurable_item_options As List = extens";
_configurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_configurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributesproductoption.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=51577072;
 //BA.debugLineNum = 51577072;BA.debugLine="For Each colconfigurable_item_options As Map I";
if (true) break;

case 46:
//for
this.state = 53;
_colconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group172 = _configurable_item_options;
index172 = 0;
groupLen172 = group172.getSize();
this.state = 117;
if (true) break;

case 117:
//C
this.state = 53;
if (index172 < groupLen172) {
this.state = 48;
_colconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group172.Get(index172)));}
if (true) break;

case 118:
//C
this.state = 117;
index172++;
if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=51577073;
 //BA.debugLineNum = 51577073;BA.debugLine="Dim option_value As Int = colconfigurable_ite";
_option_value = (int)(BA.ObjectToNumber(_colconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=51577074;
 //BA.debugLineNum = 51577074;BA.debugLine="Dim option_id As String = colconfigurable_ite";
_option_id = BA.ObjectToString(_colconfigurable_item_options.Get((Object)("option_id")));
RDebugUtils.currentLine=51577075;
 //BA.debugLineNum = 51577075;BA.debugLine="If option_id=142 Then";
if (true) break;

case 49:
//if
this.state = 52;
if ((_option_id).equals(BA.NumberToString(142))) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=51577076;
 //BA.debugLineNum = 51577076;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select la";
_talla = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_option_value)}));
 if (true) break;

case 52:
//C
this.state = 118;
;
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=51577080;
 //BA.debugLineNum = 51577080;BA.debugLine="colitems.Put(\"Talla\",Talla)";
_colitems.Put((Object)("Talla"),(Object)(_talla));
RDebugUtils.currentLine=51577081;
 //BA.debugLineNum = 51577081;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amou";
_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("amount_refunded"))));
RDebugUtils.currentLine=51577082;
 //BA.debugLineNum = 51577082;BA.debugLine="Dim updated_at As String = colitems.Get(\"update";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=51577083;
 //BA.debugLineNum = 51577083;BA.debugLine="Dim base_price As Double = colitems.Get(\"base_p";
_base_price = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_price"))));
RDebugUtils.currentLine=51577084;
 //BA.debugLineNum = 51577084;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_inv";
_qty_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_invoiced"))));
RDebugUtils.currentLine=51577086;
 //BA.debugLineNum = 51577086;BA.debugLine="TotalQtyFacturada=TotalQtyFacturada+qty_invoice";
_totalqtyfacturada = _totalqtyfacturada+_qty_invoiced;
RDebugUtils.currentLine=51577088;
 //BA.debugLineNum = 51577088;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_inv";
_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_invoiced"))));
RDebugUtils.currentLine=51577089;
 //BA.debugLineNum = 51577089;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get";
_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("row_total_incl_tax"))));
RDebugUtils.currentLine=51577090;
 //BA.debugLineNum = 51577090;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"b";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=51577091;
 //BA.debugLineNum = 51577091;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"stor";
_store_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_id"),(Object)(0))));
RDebugUtils.currentLine=51577092;
 //BA.debugLineNum = 51577092;BA.debugLine="IDTienda=store_id";
_idtienda = _store_id;
RDebugUtils.currentLine=51577093;
 //BA.debugLineNum = 51577093;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
_item_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("item_id"))));
RDebugUtils.currentLine=51577094;
 //BA.debugLineNum = 51577094;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=51577095;
 //BA.debugLineNum = 51577095;BA.debugLine="Dim base_row_total_incl_tax As Double = colitem";
_base_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total_incl_tax"))));
RDebugUtils.currentLine=51577096;
 //BA.debugLineNum = 51577096;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=51577097;
 //BA.debugLineNum = 51577097;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
_product_type = BA.ObjectToString(_colitems.Get((Object)("product_type")));
RDebugUtils.currentLine=51577098;
 //BA.debugLineNum = 51577098;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_ref";
_qty_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_refunded"))));
RDebugUtils.currentLine=51577099;
 //BA.debugLineNum = 51577099;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"ba";
_base_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_invoiced"))));
RDebugUtils.currentLine=51577100;
 //BA.debugLineNum = 51577100;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault";
_is_qty_decimal = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("is_qty_decimal"),(Object)(0))));
RDebugUtils.currentLine=51577101;
 //BA.debugLineNum = 51577101;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(\"di";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_invoiced"))));
RDebugUtils.currentLine=51577102;
 //BA.debugLineNum = 51577102;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_invoiced"))));
RDebugUtils.currentLine=51577103;
 //BA.debugLineNum = 51577103;BA.debugLine="Dim parent_item As Map=colitems.Get(\"parent_ite";
_parent_item = new anywheresoftware.b4a.objects.collections.Map();
_parent_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("parent_item"))));
RDebugUtils.currentLine=51577104;
 //BA.debugLineNum = 51577104;BA.debugLine="If parent_item.IsInitialized Then";
if (true) break;

case 55:
//if
this.state = 58;
if (_parent_item.IsInitialized()) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=51577105;
 //BA.debugLineNum = 51577105;BA.debugLine="Log(\"parent_item: \" & parent_item)";
parent.__c.LogImpl("851577105","parent_item: "+BA.ObjectToString(_parent_item),0);
 if (true) break;

case 58:
//C
this.state = 59;
;
RDebugUtils.currentLine=51577107;
 //BA.debugLineNum = 51577107;BA.debugLine="Dim mColItemsExtensionAttributes As Map=colitem";
_mcolitemsextensionattributes = new anywheresoftware.b4a.objects.collections.Map();
_mcolitemsextensionattributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=51577108;
 //BA.debugLineNum = 51577108;BA.debugLine="If mColItemsExtensionAttributes.IsInitialized T";
if (true) break;

case 59:
//if
this.state = 62;
if (_mcolitemsextensionattributes.IsInitialized()) { 
this.state = 61;
}if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=51577109;
 //BA.debugLineNum = 51577109;BA.debugLine="Log(mColItemsExtensionAttributes)";
parent.__c.LogImpl("851577109",BA.ObjectToString(_mcolitemsextensionattributes),0);
 if (true) break;

case 62:
//C
this.state = 116;
;
 if (true) break;
if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=51577113;
 //BA.debugLineNum = 51577113;BA.debugLine="Dim global_currency_code As String = mDataPedido";
_global_currency_code = BA.ObjectToString(_mdatapedido.Get((Object)("global_currency_code")));
RDebugUtils.currentLine=51577115;
 //BA.debugLineNum = 51577115;BA.debugLine="Dim status As String = mDataPedido.Get(\"status\")";
_status = BA.ObjectToString(_mdatapedido.Get((Object)("status")));
RDebugUtils.currentLine=51577116;
 //BA.debugLineNum = 51577116;BA.debugLine="StatusPedido=status";
_statuspedido = _status;
RDebugUtils.currentLine=51577118;
 //BA.debugLineNum = 51577118;BA.debugLine="Dim is_virtual As Int = mDataPedido.Getdefault(\"";
_is_virtual = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("is_virtual"),(Object)(0))));
RDebugUtils.currentLine=51577120;
 //BA.debugLineNum = 51577120;BA.debugLine="Dim base_total_invoiced_cost As Int = mDataPedid";
_base_total_invoiced_cost = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_total_invoiced_cost"),(Object)(-1))));
RDebugUtils.currentLine=51577122;
 //BA.debugLineNum = 51577122;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577124;
 //BA.debugLineNum = 51577124;BA.debugLine="Dim status_histories As List = mDataPedido.Get(\"";
_status_histories = new anywheresoftware.b4a.objects.collections.List();
_status_histories = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mdatapedido.Get((Object)("status_histories"))));
RDebugUtils.currentLine=51577126;
 //BA.debugLineNum = 51577126;BA.debugLine="Dim store_currency_code As String = mDataPedido.";
_store_currency_code = BA.ObjectToString(_mdatapedido.Get((Object)("store_currency_code")));
RDebugUtils.currentLine=51577128;
 //BA.debugLineNum = 51577128;BA.debugLine="Dim created_at As String = mDataPedido.Get(\"crea";
_created_at = BA.ObjectToString(_mdatapedido.Get((Object)("created_at")));
RDebugUtils.currentLine=51577129;
 //BA.debugLineNum = 51577129;BA.debugLine="FechaCreacion=created_at";
_fechacreacion = _created_at;
RDebugUtils.currentLine=51577130;
 //BA.debugLineNum = 51577130;BA.debugLine="FechaCreacionLong=DateTime.DateParse(FechaCreaci";
_fechacreacionlong = parent.__c.DateTime.DateParse(_fechacreacion);
RDebugUtils.currentLine=51577132;
 //BA.debugLineNum = 51577132;BA.debugLine="Dim total_item_count As Int = mDataPedido.Getdef";
_total_item_count = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("total_item_count"),(Object)(-1))));
RDebugUtils.currentLine=51577134;
 //BA.debugLineNum = 51577134;BA.debugLine="Dim shipping_tax_amount As Int = mDataPedido.Get";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("shipping_tax_amount"),(Object)(-1))));
RDebugUtils.currentLine=51577136;
 //BA.debugLineNum = 51577136;BA.debugLine="Dim store_to_base_rate As Int = mDataPedido.Getd";
_store_to_base_rate = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("store_to_base_rate"),(Object)(1))));
RDebugUtils.currentLine=51577138;
 //BA.debugLineNum = 51577138;BA.debugLine="Dim updated_at As String = mDataPedido.Get(\"upda";
_updated_at = BA.ObjectToString(_mdatapedido.Get((Object)("updated_at")));
RDebugUtils.currentLine=51577139;
 //BA.debugLineNum = 51577139;BA.debugLine="FechaActualizacion=updated_at";
_fechaactualizacion = _updated_at;
RDebugUtils.currentLine=51577140;
 //BA.debugLineNum = 51577140;BA.debugLine="FechaActualizacionLong=DateTime.DateParse(FechaA";
_fechaactualizacionlong = parent.__c.DateTime.DateParse(_fechaactualizacion);
RDebugUtils.currentLine=51577142;
 //BA.debugLineNum = 51577142;BA.debugLine="Dim base_shipping_discount_amount As Int = mData";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_shipping_discount_amount"),(Object)(-1))));
RDebugUtils.currentLine=51577145;
 //BA.debugLineNum = 51577145;BA.debugLine="NombreTienda=Utilidades.FixNull(mSQL.ExecQuerySi";
_nombretienda = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select name from tblB2BStores where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_idtienda)}))));
RDebugUtils.currentLine=51577147;
 //BA.debugLineNum = 51577147;BA.debugLine="Dim grand_total As Double = mDataPedido.Getdefau";
_grand_total = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("grand_total"),(Object)(-1))));
RDebugUtils.currentLine=51577149;
 //BA.debugLineNum = 51577149;BA.debugLine="Dim base_currency_code As String = mDataPedido.G";
_base_currency_code = BA.ObjectToString(_mdatapedido.Get((Object)("base_currency_code")));
RDebugUtils.currentLine=51577151;
 //BA.debugLineNum = 51577151;BA.debugLine="Dim base_total_paid As Double = mDataPedido.Getd";
_base_total_paid = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_total_paid"),(Object)(-1))));
RDebugUtils.currentLine=51577153;
 //BA.debugLineNum = 51577153;BA.debugLine="Dim base_tax_amount As Double = mDataPedido.Get(";
_base_tax_amount = (double)(BA.ObjectToNumber(_mdatapedido.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=51577155;
 //BA.debugLineNum = 51577155;BA.debugLine="Dim store_id As Int = mDataPedido.Getdefault(\"st";
_store_id = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("store_id"),(Object)(0))));
RDebugUtils.currentLine=51577157;
 //BA.debugLineNum = 51577157;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("shipping_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=51577159;
 //BA.debugLineNum = 51577159;BA.debugLine="Dim total_due As Int = mDataPedido.Getdefault(\"t";
_total_due = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("total_due"),(Object)(-1))));
RDebugUtils.currentLine=51577161;
 //BA.debugLineNum = 51577161;BA.debugLine="Dim total_qty_ordered As Int = mDataPedido.Getde";
_total_qty_ordered = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("total_qty_ordered"),(Object)(-1))));
RDebugUtils.currentLine=51577163;
 //BA.debugLineNum = 51577163;BA.debugLine="Dim base_discount_amount As Int = mDataPedido.Ge";
_base_discount_amount = (int)(BA.ObjectToNumber(_mdatapedido.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=51577165;
 //BA.debugLineNum = 51577165;BA.debugLine="Dim extension_attributes As Map = mDataPedido.Ge";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdatapedido.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=51577166;
 //BA.debugLineNum = 51577166;BA.debugLine="If extension_attributes.IsInitialized Then";
if (true) break;

case 64:
//if
this.state = 103;
if (_extension_attributes.IsInitialized()) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=51577167;
 //BA.debugLineNum = 51577167;BA.debugLine="Dim shipping_assignments As List = extension_at";
_shipping_assignments = new anywheresoftware.b4a.objects.collections.List();
_shipping_assignments = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("shipping_assignments"))));
RDebugUtils.currentLine=51577168;
 //BA.debugLineNum = 51577168;BA.debugLine="If shipping_assignments.IsInitialized Then";
if (true) break;

case 67:
//if
this.state = 74;
if (_shipping_assignments.IsInitialized()) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=51577169;
 //BA.debugLineNum = 51577169;BA.debugLine="Dim pgwShipping As Map=extension_attributes.Ge";
_pgwshipping = new anywheresoftware.b4a.objects.collections.Map();
_pgwshipping = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_extension_attributes.Get((Object)("pgw"))));
RDebugUtils.currentLine=51577170;
 //BA.debugLineNum = 51577170;BA.debugLine="If pgw.IsInitialized Then";
if (true) break;

case 70:
//if
this.state = 73;
if (_pgw.IsInitialized()) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
 if (true) break;

case 73:
//C
this.state = 74;
;
 if (true) break;

case 74:
//C
this.state = 75;
;
RDebugUtils.currentLine=51577269;
 //BA.debugLineNum = 51577269;BA.debugLine="Dim payment_additional_info As List = extension";
_payment_additional_info = new anywheresoftware.b4a.objects.collections.List();
_payment_additional_info = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("payment_additional_info"))));
RDebugUtils.currentLine=51577270;
 //BA.debugLineNum = 51577270;BA.debugLine="If payment_additional_info.IsInitialized Then";
if (true) break;

case 75:
//if
this.state = 82;
if (_payment_additional_info.IsInitialized()) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=51577271;
 //BA.debugLineNum = 51577271;BA.debugLine="For Each colpayment_additional_info As Map In";
if (true) break;

case 78:
//for
this.state = 81;
_colpayment_additional_info = new anywheresoftware.b4a.objects.collections.Map();
group248 = _payment_additional_info;
index248 = 0;
groupLen248 = group248.getSize();
this.state = 119;
if (true) break;

case 119:
//C
this.state = 81;
if (index248 < groupLen248) {
this.state = 80;
_colpayment_additional_info = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group248.Get(index248)));}
if (true) break;

case 120:
//C
this.state = 119;
index248++;
if (true) break;

case 80:
//C
this.state = 120;
RDebugUtils.currentLine=51577272;
 //BA.debugLineNum = 51577272;BA.debugLine="Dim value As String = colpayment_additional_i";
_value = BA.ObjectToString(_colpayment_additional_info.Get((Object)("value")));
RDebugUtils.currentLine=51577273;
 //BA.debugLineNum = 51577273;BA.debugLine="Dim key As String = colpayment_additional_inf";
_key = BA.ObjectToString(_colpayment_additional_info.Get((Object)("key")));
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
;
 if (true) break;

case 82:
//C
this.state = 83;
;
RDebugUtils.currentLine=51577276;
 //BA.debugLineNum = 51577276;BA.debugLine="Dim applied_taxes As List = extension_attribute";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=51577277;
 //BA.debugLineNum = 51577277;BA.debugLine="If applied_taxes.IsInitialized Then";
if (true) break;

case 83:
//if
this.state = 90;
if (_applied_taxes.IsInitialized()) { 
this.state = 85;
}if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=51577278;
 //BA.debugLineNum = 51577278;BA.debugLine="For Each colapplied_taxes As Map In applied_ta";
if (true) break;

case 86:
//for
this.state = 89;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group255 = _applied_taxes;
index255 = 0;
groupLen255 = group255.getSize();
this.state = 121;
if (true) break;

case 121:
//C
this.state = 89;
if (index255 < groupLen255) {
this.state = 88;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group255.Get(index255)));}
if (true) break;

case 122:
//C
this.state = 121;
index255++;
if (true) break;

case 88:
//C
this.state = 122;
RDebugUtils.currentLine=51577279;
 //BA.debugLineNum = 51577279;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=51577280;
 //BA.debugLineNum = 51577280;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"co";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=51577281;
 //BA.debugLineNum = 51577281;BA.debugLine="Dim base_amount As Double = colapplied_taxes.";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=51577282;
 //BA.debugLineNum = 51577282;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"t";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=51577283;
 //BA.debugLineNum = 51577283;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 89:
//C
this.state = 90;
;
 if (true) break;

case 90:
//C
this.state = 91;
;
RDebugUtils.currentLine=51577286;
 //BA.debugLineNum = 51577286;BA.debugLine="Dim item_applied_taxes As List = extension_attr";
_item_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_item_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("item_applied_taxes"))));
RDebugUtils.currentLine=51577287;
 //BA.debugLineNum = 51577287;BA.debugLine="If item_applied_taxes.IsInitialized Then";
if (true) break;

case 91:
//if
this.state = 102;
if (_item_applied_taxes.IsInitialized()) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=51577288;
 //BA.debugLineNum = 51577288;BA.debugLine="For Each colitem_applied_taxes As Map In item_";
if (true) break;

case 94:
//for
this.state = 101;
_colitem_applied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group265 = _item_applied_taxes;
index265 = 0;
groupLen265 = group265.getSize();
this.state = 123;
if (true) break;

case 123:
//C
this.state = 101;
if (index265 < groupLen265) {
this.state = 96;
_colitem_applied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group265.Get(index265)));}
if (true) break;

case 124:
//C
this.state = 123;
index265++;
if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=51577289;
 //BA.debugLineNum = 51577289;BA.debugLine="Dim applied_taxes As List = colitem_applied_t";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitem_applied_taxes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=51577290;
 //BA.debugLineNum = 51577290;BA.debugLine="For Each colapplied_taxes As Map In applied_t";
if (true) break;

case 97:
//for
this.state = 100;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group267 = _applied_taxes;
index267 = 0;
groupLen267 = group267.getSize();
this.state = 125;
if (true) break;

case 125:
//C
this.state = 100;
if (index267 < groupLen267) {
this.state = 99;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group267.Get(index267)));}
if (true) break;

case 126:
//C
this.state = 125;
index267++;
if (true) break;

case 99:
//C
this.state = 126;
RDebugUtils.currentLine=51577291;
 //BA.debugLineNum = 51577291;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=51577292;
 //BA.debugLineNum = 51577292;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"c";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=51577293;
 //BA.debugLineNum = 51577293;BA.debugLine="Dim base_amount As Double = colapplied_taxes";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=51577294;
 //BA.debugLineNum = 51577294;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=51577295;
 //BA.debugLineNum = 51577295;BA.debugLine="Dim percent As Double = colapplied_taxes.Get";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 100:
//C
this.state = 124;
;
RDebugUtils.currentLine=51577297;
 //BA.debugLineNum = 51577297;BA.debugLine="Dim Type As String = colitem_applied_taxes.Ge";
_type = BA.ObjectToString(_colitem_applied_taxes.Get((Object)("type")));
 if (true) break;
if (true) break;

case 101:
//C
this.state = 102;
;
 if (true) break;

case 102:
//C
this.state = 103;
;
RDebugUtils.currentLine=51577300;
 //BA.debugLineNum = 51577300;BA.debugLine="Dim converting_from_quote As String = extension";
_converting_from_quote = BA.ObjectToString(_extension_attributes.Get((Object)("converting_from_quote")));
RDebugUtils.currentLine=51577302;
 //BA.debugLineNum = 51577302;BA.debugLine="Dim pgw As Map=extension_attributes.Get(\"pgw\")";
_pgw = new anywheresoftware.b4a.objects.collections.Map();
_pgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_extension_attributes.Get((Object)("pgw"))));
 if (true) break;

case 103:
//C
this.state = 108;
;
RDebugUtils.currentLine=51577306;
 //BA.debugLineNum = 51577306;BA.debugLine="Dim shipping_description As String = mDataPedido";
_shipping_description = BA.ObjectToString(_mdatapedido.Get((Object)("shipping_description")));
RDebugUtils.currentLine=51577308;
 //BA.debugLineNum = 51577308;BA.debugLine="Dim store_to_order_rate As Int = mDataPedido.Get";
_store_to_order_rate = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("store_to_order_rate"),(Object)(-1))));
RDebugUtils.currentLine=51577310;
 //BA.debugLineNum = 51577310;BA.debugLine="Dim shipping_amount As Int = mDataPedido.Getdefa";
_shipping_amount = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("shipping_amount"),(Object)(-1))));
RDebugUtils.currentLine=51577312;
 //BA.debugLineNum = 51577312;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=51577314;
 //BA.debugLineNum = 51577314;BA.debugLine="Dim subtotal_invoiced As Int = mDataPedido.Getde";
_subtotal_invoiced = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("subtotal_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=51577316;
 //BA.debugLineNum = 51577316;BA.debugLine="Dim base_to_order_rate As Int = mDataPedido.Getd";
_base_to_order_rate = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_to_order_rate"),(Object)(-1))));
RDebugUtils.currentLine=51577318;
 //BA.debugLineNum = 51577318;BA.debugLine="Dim base_subtotal As Int = mDataPedido.Getdefaul";
_base_subtotal = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_subtotal"),(Object)(-1))));
RDebugUtils.currentLine=51577320;
 //BA.debugLineNum = 51577320;BA.debugLine="Dim protect_code As String = mDataPedido.Get(\"pr";
_protect_code = BA.ObjectToString(_mdatapedido.Get((Object)("protect_code")));
RDebugUtils.currentLine=51577322;
 //BA.debugLineNum = 51577322;BA.debugLine="Dim customer_dob As String = mDataPedido.Get(\"cu";
_customer_dob = BA.ObjectToString(_mdatapedido.Get((Object)("customer_dob")));
RDebugUtils.currentLine=51577324;
 //BA.debugLineNum = 51577324;BA.debugLine="Dim base_total_due As Int = mDataPedido.Getdefau";
_base_total_due = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_total_due"),(Object)(-1))));
RDebugUtils.currentLine=51577326;
 //BA.debugLineNum = 51577326;BA.debugLine="Dim base_subtotal_incl_tax As Double = mDataPedi";
_base_subtotal_incl_tax = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_subtotal_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=51577328;
 //BA.debugLineNum = 51577328;BA.debugLine="Dim customer_id As Int = mDataPedido.Getdefault(";
_customer_id = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("customer_id"),(Object)(-1))));
RDebugUtils.currentLine=51577329;
 //BA.debugLineNum = 51577329;BA.debugLine="IDCliente=customer_id";
_idcliente = _customer_id;
RDebugUtils.currentLine=51577332;
 //BA.debugLineNum = 51577332;BA.debugLine="ClienteERP=Utilidades.FixNull(mSQL.ExecQuerySing";
_clienteerp = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select Code from tblB2BClientes where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_idcliente)}))));
RDebugUtils.currentLine=51577333;
 //BA.debugLineNum = 51577333;BA.debugLine="NombreClienteERP=Utilidades.FixNull(mSQL.ExecQue";
_nombreclienteerp = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select Company from tblB2BClientes where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_idcliente)}))));
RDebugUtils.currentLine=51577334;
 //BA.debugLineNum = 51577334;BA.debugLine="Dim customer_group_id As Int = mDataPedido.Getde";
_customer_group_id = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("customer_group_id"),(Object)(-1))));
RDebugUtils.currentLine=51577335;
 //BA.debugLineNum = 51577335;BA.debugLine="IDGRPCliente=customer_group_id";
_idgrpcliente = _customer_group_id;
RDebugUtils.currentLine=51577338;
 //BA.debugLineNum = 51577338;BA.debugLine="Dim discount_invoiced As Int = mDataPedido.Getde";
_discount_invoiced = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("discount_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=51577340;
 //BA.debugLineNum = 51577340;BA.debugLine="Dim order_currency_code As String = mDataPedido.";
_order_currency_code = BA.ObjectToString(_mdatapedido.Get((Object)("order_currency_code")));
RDebugUtils.currentLine=51577342;
 //BA.debugLineNum = 51577342;BA.debugLine="Dim base_tax_invoiced As Double = mDataPedido.Ge";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=51577344;
 //BA.debugLineNum = 51577344;BA.debugLine="Dim customer_gender As Int = mDataPedido.Getdefa";
_customer_gender = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("customer_gender"),(Object)(-1))));
RDebugUtils.currentLine=51577346;
 //BA.debugLineNum = 51577346;BA.debugLine="Dim shipping_incl_tax As Int = mDataPedido.Getde";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("shipping_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=51577348;
 //BA.debugLineNum = 51577348;BA.debugLine="Dim base_shipping_invoiced As Int = mDataPedido.";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_mdatapedido.GetDefault((Object)("base_shipping_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=51577352;
 //BA.debugLineNum = 51577352;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BOrders",_items);
RDebugUtils.currentLine=51577354;
 //BA.debugLineNum = 51577354;BA.debugLine="Dim sSQL As String=$\"Insert into tblB2BOrdersTot";
_ssql = ("Insert into tblB2BOrdersTotales (IDPedido\n"+"		, IDTienda, NombreTienda\n"+"		, Pedido, FechaCreacion, FechaActualizacion\n"+"		, OrdenCompra\n"+"		, name\n"+"		, EmailComprador, NombreUsuarioComprador, ApellidoUsuarioComprador\n"+"		, IDGRPCliente,IDCliente,IDDireccionEnvioClienteERP\n"+"		, GRPClienteERP, ClienteERP, NombreClienteERP, IDDireccionEnvioClienteERP, NombreDireccionEnvioClienteERP, IDDireccionFacturacion, NombreDireccionFacturacion\n"+"		, TotalQtyPedida, TotalQtyEnviada, TotalQtyFacturada) \n"+"		values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)\n"+"		");
RDebugUtils.currentLine=51577366;
 //BA.debugLineNum = 51577366;BA.debugLine="mSQL.ExecNonQuery2(sSQL,Array As Object(IDPedido";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(_ssql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_idpedido),(Object)(_idtienda),(Object)(_nombretienda),(Object)(_pedido),(Object)(_fechacreacionlong),(Object)(_fechaactualizacionlong),(Object)(_ordencompra),(Object)(""),(Object)(_emailcomprador),(Object)(_nombreusuariocomprador),(Object)(_apellidousuariocomprador),(Object)(_idgrpcliente),(Object)(_idcliente),(Object)(_iddireccionenvioclienteerp),(Object)(_grpclienteerp),(Object)(_clienteerp),(Object)(_nombreclienteerp),(Object)(_nombredireccionenvioclienteerp),(Object)(_nombredireccionenvioclienteerp),(Object)(_iddireccionfacturacion),(Object)(_nombredireccionfacturacion),(Object)(_totalqtypedida),(Object)(_totalqtyenviada),(Object)(_totalqtyfacturada)}));
 if (true) break;
if (true) break;

case 104:
//C
this.state = -1;
;
RDebugUtils.currentLine=51577372;
 //BA.debugLineNum = 51577372;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
_search_criteria = new anywheresoftware.b4a.objects.collections.Map();
_search_criteria = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("search_criteria"))));
RDebugUtils.currentLine=51577373;
 //BA.debugLineNum = 51577373;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
_filter_groups = new anywheresoftware.b4a.objects.collections.List();
_filter_groups = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_criteria.Get((Object)("filter_groups"))));
RDebugUtils.currentLine=51577374;
 //BA.debugLineNum = 51577374;BA.debugLine="Dim page_size As Int = search_criteria.Get(\"page_";
_page_size = (int)(BA.ObjectToNumber(_search_criteria.Get((Object)("page_size"))));
RDebugUtils.currentLine=51577377;
 //BA.debugLineNum = 51577377;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=51577379;
 //BA.debugLineNum = 51577379;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=51577380;
 //BA.debugLineNum = 51577380;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public String  _alternarexcluidoreclamacion(b4j.docU.cb2blistapedidoscliente __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "alternarexcluidoreclamacion", false))
	 {return ((String) Debug.delegate(ba, "alternarexcluidoreclamacion", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
RDebugUtils.currentLine=51314705;
 //BA.debugLineNum = 51314705;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.cb2blistapedidoscliente __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=50659330;
 //BA.debugLineNum = 50659330;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Sub SalirModulo";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="If jamTableView1.IsInitialized Then";
if (__ref._jamtableview1 /*b4j.docU.jamtableview*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuari";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
 };
RDebugUtils.currentLine=50593796;
 //BA.debugLineNum = 50593796;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=50593797;
 //BA.debugLineNum = 50593797;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=50593798;
 //BA.debugLineNum = 50593798;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentobusquedaclientes(b4j.docU.cb2blistapedidoscliente __ref,String _token) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentobusquedaclientes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentobusquedaclientes", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoBusquedaClientes rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaClientes extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51904514;
 //BA.debugLineNum = 51904514;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=51904515;
 //BA.debugLineNum = 51904515;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=51904520;
 //BA.debugLineNum = 51904520;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/search?\n"+"	searchCriteria[filterGroups][0][filters][0][field]=firstname&\n"+"	searchCriteria[filterGroups][0][filters][0][value]=%&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=like");
RDebugUtils.currentLine=51904525;
 //BA.debugLineNum = 51904525;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=51904527;
 //BA.debugLineNum = 51904527;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=51904528;
 //BA.debugLineNum = 51904528;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=51904530;
 //BA.debugLineNum = 51904530;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=51904532;
 //BA.debugLineNum = 51904532;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "enviodatosapimagentobusquedaclientes"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=51904534;
 //BA.debugLineNum = 51904534;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=51904535;
 //BA.debugLineNum = 51904535;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("851904535","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=51904536;
 //BA.debugLineNum = 51904536;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("851904536",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=51904537;
 //BA.debugLineNum = 51904537;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=51904538;
 //BA.debugLineNum = 51904538;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51904539;
 //BA.debugLineNum = 51904539;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=51904542;
 //BA.debugLineNum = 51904542;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=51904543;
 //BA.debugLineNum = 51904543;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51904544;
 //BA.debugLineNum = 51904544;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=51904546;
 //BA.debugLineNum = 51904546;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentolistastores(b4j.docU.cb2blistapedidoscliente __ref,String _token) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentolistastores", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentolistastores", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoListaStores rsub = new ResumableSub_EnvioDatosAPIMagentoListaStores(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoListaStores extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoListaStores(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51773442;
 //BA.debugLineNum = 51773442;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=51773443;
 //BA.debugLineNum = 51773443;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=51773446;
 //BA.debugLineNum = 51773446;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/store/storeGroups");
RDebugUtils.currentLine=51773449;
 //BA.debugLineNum = 51773449;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=51773451;
 //BA.debugLineNum = 51773451;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=51773452;
 //BA.debugLineNum = 51773452;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=51773454;
 //BA.debugLineNum = 51773454;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=51773456;
 //BA.debugLineNum = 51773456;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "enviodatosapimagentolistastores"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=51773458;
 //BA.debugLineNum = 51773458;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=51773459;
 //BA.debugLineNum = 51773459;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("851773459","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=51773460;
 //BA.debugLineNum = 51773460;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("851773460",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=51773461;
 //BA.debugLineNum = 51773461;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=51773462;
 //BA.debugLineNum = 51773462;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51773463;
 //BA.debugLineNum = 51773463;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=51773466;
 //BA.debugLineNum = 51773466;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=51773467;
 //BA.debugLineNum = 51773467;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51773468;
 //BA.debugLineNum = 51773468;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=51773470;
 //BA.debugLineNum = 51773470;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacionpedidos(b4j.docU.cb2blistapedidoscliente __ref,String _token) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacionpedidos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacionpedidos", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51642370;
 //BA.debugLineNum = 51642370;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=51642371;
 //BA.debugLineNum = 51642371;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=51642375;
 //BA.debugLineNum = 51642375;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?searchCriteria[pageSize] = 0\n"+"	&searchCriteria[filterGroups][0][filters][0][field]=store_id&\n"+"	searchCriteria[filterGroups][0][filters][0][value]=32,35,37,38&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=in");
RDebugUtils.currentLine=51642380;
 //BA.debugLineNum = 51642380;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=51642382;
 //BA.debugLineNum = 51642382;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=51642383;
 //BA.debugLineNum = 51642383;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=51642385;
 //BA.debugLineNum = 51642385;BA.debugLine="job.GetRequest.Timeout=30000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (30000));
RDebugUtils.currentLine=51642387;
 //BA.debugLineNum = 51642387;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "enviodatosapimagentoinformacionpedidos"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=51642389;
 //BA.debugLineNum = 51642389;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=51642392;
 //BA.debugLineNum = 51642392;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=51642393;
 //BA.debugLineNum = 51642393;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51642394;
 //BA.debugLineNum = 51642394;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=51642397;
 //BA.debugLineNum = 51642397;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=51642398;
 //BA.debugLineNum = 51642398;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51642399;
 //BA.debugLineNum = 51642399;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=51642401;
 //BA.debugLineNum = 51642401;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentovaloresatributosizeproductos(b4j.docU.cb2blistapedidoscliente __ref,String _token) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentovaloresatributosizeproductos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentovaloresatributosizeproductos", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos rsub = new ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=51511298;
 //BA.debugLineNum = 51511298;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=51511299;
 //BA.debugLineNum = 51511299;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=51511301;
 //BA.debugLineNum = 51511301;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/products/attributes/size/options");
RDebugUtils.currentLine=51511303;
 //BA.debugLineNum = 51511303;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=51511305;
 //BA.debugLineNum = 51511305;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=51511306;
 //BA.debugLineNum = 51511306;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=51511308;
 //BA.debugLineNum = 51511308;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=51511310;
 //BA.debugLineNum = 51511310;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "enviodatosapimagentovaloresatributosizeproductos"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=51511312;
 //BA.debugLineNum = 51511312;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=51511313;
 //BA.debugLineNum = 51511313;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("851511313","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=51511314;
 //BA.debugLineNum = 51511314;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("851511314",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=51511315;
 //BA.debugLineNum = 51511315;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=51511316;
 //BA.debugLineNum = 51511316;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51511317;
 //BA.debugLineNum = 51511317;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=51511320;
 //BA.debugLineNum = 51511320;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=51511321;
 //BA.debugLineNum = 51511321;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=51511322;
 //BA.debugLineNum = 51511322;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=51511324;
 //BA.debugLineNum = 51511324;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=50397188;
 //BA.debugLineNum = 50397188;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=50397191;
 //BA.debugLineNum = 50397191;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=50397192;
 //BA.debugLineNum = 50397192;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=50397194;
 //BA.debugLineNum = 50397194;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=50397195;
 //BA.debugLineNum = 50397195;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=50397197;
 //BA.debugLineNum = 50397197;BA.debugLine="Public PermisoUsuarioModulo As String";
_permisousuariomodulo = "";
RDebugUtils.currentLine=50397198;
 //BA.debugLineNum = 50397198;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=50397200;
 //BA.debugLineNum = 50397200;BA.debugLine="Private tk As  String";
_tk = "";
RDebugUtils.currentLine=50397202;
 //BA.debugLineNum = 50397202;BA.debugLine="Type TipoDatosCabeceraPedidoB2B (IDPedido As Int,";
;
RDebugUtils.currentLine=50397213;
 //BA.debugLineNum = 50397213;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BSto";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BStores");
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BSt";
_screartabla = ("CREATE TABLE tblB2BStores (\n"+"	code TEXT,default_store_id INTEGER , name TEXT, root_category_id INT, id INTEGER, website_id INTEGER\n"+"	)");
RDebugUtils.currentLine=50921477;
 //BA.debugLineNum = 50921477;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921479;
 //BA.debugLineNum = 50921479;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BGru";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BGruposCliente");
RDebugUtils.currentLine=50921480;
 //BA.debugLineNum = 50921480;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BGr";
_screartabla = ("CREATE TABLE tblB2BGruposCliente (\n"+"	code TEXT,tax_class_id INTEGER , id INTEGER, tax_class_name TEXT\n"+"	)");
RDebugUtils.currentLine=50921483;
 //BA.debugLineNum = 50921483;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921485;
 //BA.debugLineNum = 50921485;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCli";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BClientes");
RDebugUtils.currentLine=50921486;
 //BA.debugLineNum = 50921486;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
_screartabla = ("CREATE TABLE IF NOT EXISTS [tblB2BClientes] ([store_id] INTEGER, [firstname] TEXT\n"+"	, [addresses] TEXT, [created_at] TEXT, [extension_attributes] TEXT, [default_shipping] INTEGER default 0, [lastname] TEXT, gender INTEGER default 0, dob INTEGER default 0\n"+"	, [custom_attributes] TEXT, [updated_at] TEXT, [disable_auto_group_change] INTEGER, [group_id] INTEGER, [id] INTEGER\n"+"	, [default_billing] INTEGER default 0, [website_id] INTEGER, [email] TEXT PRIMARY KEY, [created_in] TEXT, [is_blocked] INTEGER default 0\n"+"	, [is_commercial] INTEGER default 0, [company] TEXT default '', [code] TEXT default '', [customer_group_code] TEXT default '', [customer_group_name] TEXT default ''\n"+"	, [language] TEXT default '', [country_id] TEXT '')");
RDebugUtils.currentLine=50921492;
 //BA.debugLineNum = 50921492;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921494;
 //BA.debugLineNum = 50921494;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BPro";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BProductos");
RDebugUtils.currentLine=50921495;
 //BA.debugLineNum = 50921495;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BProductos] ([visibility] INTEGER, [type_id] TEXT, [created_at] TEXT\n"+"	, [extension_attributes] TEXT, [tier_prices] TEXT, [custom_attributes] TEXT, IDTalla INTEGER default -1, Talla TEXT default '', UnidadMedida TEXT default ''\n"+"	, [attribute_set_id] INTEGER, [updated_at] TEXT, [price] INTEGER default 0\n"+"	, [media_gallery_entries] TEXT, [name] TEXT, [options] TEXT, [id] INTEGER, [sku] TEXT PRIMARY KEY, [product_links] TEXT, [status] INTEGER, weight INTEGER default 0\n"+"	)");
RDebugUtils.currentLine=50921500;
 //BA.debugLineNum = 50921500;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921502;
 //BA.debugLineNum = 50921502;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BDir";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BDireccionesCliente");
RDebugUtils.currentLine=50921503;
 //BA.debugLineNum = 50921503;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BDireccionesCliente] ([firstname] TEXT,[lastname] TEXT, [city] TEXT\n"+"	, customer_code TEXT default'' , code TEXT default'', [region_id] INTEGER\n"+"	, [postcode] TEXT, [telephone] INTEGER, [default_shipping] TEXT default '', [default_billing] TEXT default '',[custom_attributes] TEXT\n"+"	, [street] TEXT default '', [street1] TEXT default '', [street2] TEXT default '', [street3] TEXT default '', [company] TEXT\n"+"	, [id] INTEGER, [customer_id] INTEGER, [region] TEXT, [country_id] TEXT)");
RDebugUtils.currentLine=50921508;
 //BA.debugLineNum = 50921508;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921511;
 //BA.debugLineNum = 50921511;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BAtributoSizeProducts");
RDebugUtils.currentLine=50921512;
 //BA.debugLineNum = 50921512;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BAtributoSizeProducts] ([label] TEXT, [value] INTEGER)");
RDebugUtils.currentLine=50921513;
 //BA.debugLineNum = 50921513;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921515;
 //BA.debugLineNum = 50921515;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BAtributoUnidadMedidaProductos");
RDebugUtils.currentLine=50921516;
 //BA.debugLineNum = 50921516;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BAtributoUnidadMedidaProductos] ([label] TEXT, [value] INTEGER)");
RDebugUtils.currentLine=50921517;
 //BA.debugLineNum = 50921517;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921532;
 //BA.debugLineNum = 50921532;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BOrd";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BOrders");
RDebugUtils.currentLine=50921533;
 //BA.debugLineNum = 50921533;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BOrders] ([item_id] INTEGER, [store_id] INTEGER default 0\n"+"	, [order_id] INTEGER,  [created_at] TEXT, [updated_at] TEXT\n"+"	, [po_number] TEXT default ''\n"+"	, [product_type] TEXT\n"+"	, [product_id] INTEGER default 0, parent_id TEXT default ''\n"+"	, line_number INTEGER\n"+"	, [product_option] TEXT\n"+"	, [sku] TEXT,[name] TEXT, [Talla] TEXT DEFAULT ''\n"+"	, [qty_ordered] INTEGER, [qty_canceled] INTEGER, [qty_refunded] INTEGER\n"+"	, [qty_shipped] INTEGER\n"+"	, [base_row_invoiced] INTEGER,[qty_invoiced] INTEGER, [row_invoiced] INTEGER\n"+"	, [base_original_price] REAL default 0, [original_price] REAL default 0, [base_price] REAL, [price] REAL default 0\n"+"	, [tax_percent] REAL default 0\n"+"	, [free_shipping] INTEGER default 0, [discount_amount] REAL default 0\n"+"	, [base_row_total] REAL, [row_total] REAL\n"+"	, [is_qty_decimal] INTEGER default 0)");
RDebugUtils.currentLine=50921549;
 //BA.debugLineNum = 50921549;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921552;
 //BA.debugLineNum = 50921552;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BOrd";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BOrdersTotales");
RDebugUtils.currentLine=50921553;
 //BA.debugLineNum = 50921553;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BOrdersTotales] ([IDPedido] INTEGER\n"+"	, [IDTienda] INTEGER default 0, [NombreTienda] TEXT ''\n"+"	, [Pedido] TEXT,  [FechaCreacion] INTEGER, [FechaActualizacion] INTEGER\n"+"	, [OrdenCompra] TEXT default ''\n"+"	, [name] TEXT\n"+"	, [EmailComprador] TEXT, [NombreUsuarioComprador] TEXT, [ApellidoUsuarioComprador] TEXT\n"+"	, [IDGRPCliente] INTEGER default 0, [IDCliente] INTEGER default 0, [IDDireccionEnvioClienteERP] INTEGER default 0\n"+"	, [GRPClienteERP] TEXT default '', [ClienteERP] TEXT default '', [NombreClienteERP] TEXT, [NombreDireccionEnvioClienteERP] TEXT default '', IDDireccionFacturacion INTEGER default 0, NombreDireccionFacturacion TEXT default ''\n"+"	, [TotalQtyPedida] INTEGER, [TotalQtyEnviada] INTEGER, [TotalQtyPendienteEnvio] INTEGER default 0, [TotalQtyFacturada] INTEGER, [TotalQtyPendienteFacturar] INTEGER default 0\n"+"	)");
RDebugUtils.currentLine=50921563;
 //BA.debugLineNum = 50921563;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921565;
 //BA.debugLineNum = 50921565;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCat";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BCategoriasProductos");
RDebugUtils.currentLine=50921566;
 //BA.debugLineNum = 50921566;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BCategoriasProductos] ([label] TEXT, [value] INTEGER)");
RDebugUtils.currentLine=50921567;
 //BA.debugLineNum = 50921567;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=50921569;
 //BA.debugLineNum = 50921569;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cb2blistapedidoscliente __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cb2blistapedidoscliente parent,b4j.docU.cb2blistapedidoscliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2blistapedidoscliente __ref;
b4j.docU.cb2blistapedidoscliente parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2blistapedidoscliente";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=50528259;
 //BA.debugLineNum = 50528259;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=50528261;
 //BA.debugLineNum = 50528261;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=50528262;
 //BA.debugLineNum = 50528262;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=50528263;
 //BA.debugLineNum = 50528263;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=50528265;
 //BA.debugLineNum = 50528265;BA.debugLine="frm.RootPane.LoadLayout(\"scrB2BListaPedidosClient";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrB2BListaPedidosCliente");
RDebugUtils.currentLine=50528266;
 //BA.debugLineNum = 50528266;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=50528268;
 //BA.debugLineNum = 50528268;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Pedidos";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Lista Pedidos Cliente B2B");
RDebugUtils.currentLine=50528270;
 //BA.debugLineNum = 50528270;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=50528294;
 //BA.debugLineNum = 50528294;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaPedidosClienteB2B.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=50528295;
 //BA.debugLineNum = 50528295;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=50528296;
 //BA.debugLineNum = 50528296;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("850528296",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=50528297;
 //BA.debugLineNum = 50528297;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=50528298;
 //BA.debugLineNum = 50528298;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=50528299;
 //BA.debugLineNum = 50528299;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2blistapedidoscliente", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=50528300;
 //BA.debugLineNum = 50528300;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=50528301;
 //BA.debugLineNum = 50528301;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=50528304;
 //BA.debugLineNum = 50528304;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=50528308;
 //BA.debugLineNum = 50528308;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaFecha(Arra";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnafecha /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaCreacion"),(Object)("FechaActualizacion")}));
RDebugUtils.currentLine=50528343;
 //BA.debugLineNum = 50528343;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=50528344;
 //BA.debugLineNum = 50528344;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=50528347;
 //BA.debugLineNum = 50528347;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=50528349;
 //BA.debugLineNum = 50528349;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
RDebugUtils.currentLine=50528351;
 //BA.debugLineNum = 50528351;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.cb2blistapedidoscliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=50987008;
 //BA.debugLineNum = 50987008;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cambioenceldaseleccionada(b4j.docU.cb2blistapedidoscliente __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "jamtableview1_cambioenceldaseleccionada", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cambioenceldaseleccionada", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
RDebugUtils.currentLine=51183637;
 //BA.debugLineNum = 51183637;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cellclick(b4j.docU.cb2blistapedidoscliente __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "jamtableview1_cellclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cellclick", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
switch (BA.switchObjectToInt(_datosceldaseleccionada.AliasCampo /*String*/ )) {
}
;
RDebugUtils.currentLine=51249157;
 //BA.debugLineNum = 51249157;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_celldobleclick(b4j.docU.cb2blistapedidoscliente __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}));}
int _filasel = 0;
int _idpedidosel = 0;
b4j.docU.cb2bfichapedidocliente _cpedidob2b = null;
RDebugUtils.currentLine=51970048;
 //BA.debugLineNum = 51970048;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
RDebugUtils.currentLine=51970049;
 //BA.debugLineNum = 51970049;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
_filasel = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=51970050;
 //BA.debugLineNum = 51970050;BA.debugLine="Dim IDPedidoSel As Int=jamTableView1.GetValorSQLC";
_idpedidosel = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDPedido")));
RDebugUtils.currentLine=51970077;
 //BA.debugLineNum = 51970077;BA.debugLine="Dim cPedidoB2B As cB2BFichaPedidoCliente";
_cpedidob2b = new b4j.docU.cb2bfichapedidocliente();
RDebugUtils.currentLine=51970078;
 //BA.debugLineNum = 51970078;BA.debugLine="cPedidoB2B.Initialize(IDPedidoSel,tk)";
_cpedidob2b._initialize /*String*/ (null,ba,_idpedidosel,__ref._tk /*String*/ );
RDebugUtils.currentLine=51970080;
 //BA.debugLineNum = 51970080;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=51970081;
 //BA.debugLineNum = 51970081;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_contextmenuitem_action(b4j.docU.cb2blistapedidoscliente __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}));}
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=51118081;
 //BA.debugLineNum = 51118081;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem)) {
}
;
RDebugUtils.currentLine=51118119;
 //BA.debugLineNum = 51118119;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_menubarmenuitem_action(b4j.docU.cb2blistapedidoscliente __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2blistapedidoscliente";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}));}
RDebugUtils.currentLine=51052544;
 //BA.debugLineNum = 51052544;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=51052545;
 //BA.debugLineNum = 51052545;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar")) {
case 0: {
RDebugUtils.currentLine=51052548;
 //BA.debugLineNum = 51052548;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 break; }
}
;
RDebugUtils.currentLine=51052553;
 //BA.debugLineNum = 51052553;BA.debugLine="End Sub";
return "";
}
}