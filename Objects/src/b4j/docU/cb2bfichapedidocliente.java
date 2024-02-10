package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cb2bfichapedidocliente extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cb2bfichapedidocliente", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cb2bfichapedidocliente.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tipodatoslineapedidoclienteb2b{
public boolean IsInitialized;
public int IDLinea;
public int LineaPedido;
public int IDProductoB2B;
public String TipoItem;
public String ItemSKU;
public String UNSPSC;
public String DescripcionProductoB2B;
public String TallaB2B;
public int QtyPedida;
public int QtyEnviada;
public int QtyFacturada;
public double Precio;
public String UOMB2B;
public double TipoIVA;
public double ImporteIVA;
public String ItemParentSKU;
public String CodigoArticuloNAV;
public void Initialize() {
IsInitialized = true;
IDLinea = 0;
LineaPedido = 0;
IDProductoB2B = 0;
TipoItem = "";
ItemSKU = "";
UNSPSC = "";
DescripcionProductoB2B = "";
TallaB2B = "";
QtyPedida = 0;
QtyEnviada = 0;
QtyFacturada = 0;
Precio = 0;
UOMB2B = "";
TipoIVA = 0;
ImporteIVA = 0;
ItemParentSKU = "";
CodigoArticuloNAV = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public int _midpedidocliente = 0;
public b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b _mdatoscabecerapedidocliente = null;
public String _mtk = "";
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsalirb2bpedidoclienteficha = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtclienteerp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtcomprador = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtdireccionenvioerp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtemailcomprador = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtfechacreacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtfechamodificacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtidpedido = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombreclienteerp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombredireccionenvioerp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombretienda = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtordencompra = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtpedido = null;
public anywheresoftware.b4j.objects.TabPaneWrapper _tabpaneinfopedidocliente = null;
public b4j.docU.jamtableview _jamtableviewlineaspedidoclienteb2b = null;
public b4j.docU.jamtableview _jamtableviewlineasalbaranespedidoclienteb2b = null;
public b4j.docU.jamtableview _jamtableviewlineasfacturaspedidoclienteb2b = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtdireccionfacturacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombredireccionfacturacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtiddireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtcodigodireccionenvioerp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombredireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtiddireccionfacturacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtcodigodireccionfacturacion = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtdireccionenvio = null;
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
public String  _actualizardatoscabecera(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "actualizardatoscabecera", false))
	 {return ((String) Debug.delegate(ba, "actualizardatoscabecera", null));}
String _dateformatant = "";
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Sub ActualizarDatosCabecera";
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=49152003;
 //BA.debugLineNum = 49152003;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy HH:mm:ss\"";
__c.DateTime.setDateFormat("dd/MM/yyyy HH:mm:ss");
RDebugUtils.currentLine=49152005;
 //BA.debugLineNum = 49152005;BA.debugLine="txtClienteERP.Text=mDatosCabeceraPedidoCliente.Co";
__ref._txtclienteerp /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .CodigoClienteERP /*String*/ );
RDebugUtils.currentLine=49152006;
 //BA.debugLineNum = 49152006;BA.debugLine="txtComprador.Text=$\"${mDatosCabeceraPedidoCliente";
__ref._txtcomprador /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+__c.SmartStringFormatter("",(Object)(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreUsuarioComprador /*String*/ ))+" "+__c.SmartStringFormatter("",(Object)(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .ApellidoUsuarioComprador /*String*/ ))+" "));
RDebugUtils.currentLine=49152007;
 //BA.debugLineNum = 49152007;BA.debugLine="txtCodigoDireccionEnvioERP.Text=mDatosCabeceraPed";
__ref._txtcodigodireccionenvioerp /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .CodigoDireccionEnvioERP /*String*/ );
RDebugUtils.currentLine=49152008;
 //BA.debugLineNum = 49152008;BA.debugLine="txtEmailComprador.Text=mDatosCabeceraPedidoClient";
__ref._txtemailcomprador /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .EmailComprador /*String*/ );
RDebugUtils.currentLine=49152009;
 //BA.debugLineNum = 49152009;BA.debugLine="txtFechaCreacion.Text=DateTime.Date(mDatosCabecer";
__ref._txtfechacreacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__c.DateTime.Date(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .FechaCreacion /*long*/ ));
RDebugUtils.currentLine=49152010;
 //BA.debugLineNum = 49152010;BA.debugLine="txtFechaModificacion.Text=DateTime.date(mDatosCab";
__ref._txtfechamodificacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__c.DateTime.Date(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .FechaActualizacion /*long*/ ));
RDebugUtils.currentLine=49152011;
 //BA.debugLineNum = 49152011;BA.debugLine="txtIDPedido.Text=mDatosCabeceraPedidoCliente.IDPe";
__ref._txtidpedido /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.NumberToString(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDPedido /*int*/ ));
RDebugUtils.currentLine=49152012;
 //BA.debugLineNum = 49152012;BA.debugLine="txtNombreClienteERP.Text=mDatosCabeceraPedidoClie";
__ref._txtnombreclienteerp /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreCliente /*String*/ );
RDebugUtils.currentLine=49152014;
 //BA.debugLineNum = 49152014;BA.debugLine="txtNombreTienda.Text=mDatosCabeceraPedidoCliente.";
__ref._txtnombretienda /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreTienda /*String*/ );
RDebugUtils.currentLine=49152015;
 //BA.debugLineNum = 49152015;BA.debugLine="txtOrdenCompra.Text=mDatosCabeceraPedidoCliente.O";
__ref._txtordencompra /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .OrdenCompra /*String*/ );
RDebugUtils.currentLine=49152016;
 //BA.debugLineNum = 49152016;BA.debugLine="txtPedido.Text=mDatosCabeceraPedidoCliente.Pedido";
__ref._txtpedido /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .Pedido /*String*/ );
RDebugUtils.currentLine=49152018;
 //BA.debugLineNum = 49152018;BA.debugLine="txtIDDireccionFacturacion.Text=mDatosCabeceraPedi";
__ref._txtiddireccionfacturacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDDireccionFacturacion /*String*/ );
RDebugUtils.currentLine=49152019;
 //BA.debugLineNum = 49152019;BA.debugLine="txtNombreDireccionFacturacion.Text=mDatosCabecera";
__ref._txtnombredireccionfacturacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreDireccionFacturacion /*String*/ );
RDebugUtils.currentLine=49152020;
 //BA.debugLineNum = 49152020;BA.debugLine="txtDireccionFacturacion.Text=mDatosCabeceraPedido";
__ref._txtdireccionfacturacion /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .DireccionFacturacion /*String*/ );
RDebugUtils.currentLine=49152021;
 //BA.debugLineNum = 49152021;BA.debugLine="txtIDDireccionEnvio.Text=mDatosCabeceraPedidoClie";
__ref._txtiddireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.NumberToString(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDDireccionEnvio /*int*/ ));
RDebugUtils.currentLine=49152022;
 //BA.debugLineNum = 49152022;BA.debugLine="txtNombreDireccionEnvio.Text=mDatosCabeceraPedido";
__ref._txtnombredireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreDireccionEnvio /*String*/ );
RDebugUtils.currentLine=49152023;
 //BA.debugLineNum = 49152023;BA.debugLine="txtDireccionEnvio.Text=mDatosCabeceraPedidoClient";
__ref._txtdireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .DireccionEnvio /*String*/ );
RDebugUtils.currentLine=49152025;
 //BA.debugLineNum = 49152025;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=49152026;
 //BA.debugLineNum = 49152026;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatoslineasalbaranespedido(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "actualizardatoslineasalbaranespedido", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatoslineasalbaranespedido", null));}
ResumableSub_ActualizarDatosLineasAlbaranesPedido rsub = new ResumableSub_ActualizarDatosLineasAlbaranesPedido(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosLineasAlbaranesPedido extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLineasAlbaranesPedido(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BLineasAlbaranPedidoCliente order by FechaAlbaran, Albaran, LineaAlbaran");
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasAlbara";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=49545219;
 //BA.debugLineNum = 49545219;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=49545220;
 //BA.debugLineNum = 49545220;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=49545221;
 //BA.debugLineNum = 49545221;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 1:
//if
this.state = 21;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=49545222;
 //BA.debugLineNum = 49545222;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 4:
//if
this.state = 11;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=49545223;
 //BA.debugLineNum = 49545223;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=49545224;
 //BA.debugLineNum = 49545224;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
RDebugUtils.currentLine=49545226;
 //BA.debugLineNum = 49545226;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=49545227;
 //BA.debugLineNum = 49545227;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=49545228;
 //BA.debugLineNum = 49545228;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=49545229;
 //BA.debugLineNum = 49545229;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Ab";
__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=49545230;
 //BA.debugLineNum = 49545230;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=49545233;
 //BA.debugLineNum = 49545233;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
RDebugUtils.currentLine=49545234;
 //BA.debugLineNum = 49545234;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=49545236;
 //BA.debugLineNum = 49545236;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 11:
//if
this.state = 20;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=49545237;
 //BA.debugLineNum = 49545237;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 14:
//if
this.state = 19;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=49545238;
 //BA.debugLineNum = 49545238;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=49545239;
 //BA.debugLineNum = 49545239;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineasalbaranespedido"), _msa);
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
RDebugUtils.currentLine=49545244;
 //BA.debugLineNum = 49545244;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=49545245;
 //BA.debugLineNum = 49545245;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatoslineaspedido(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "actualizardatoslineaspedido", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatoslineaspedido", null));}
ResumableSub_ActualizarDatosLineasPedido rsub = new ResumableSub_ActualizarDatosLineasPedido(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosLineasPedido extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLineasPedido(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BLineasPedidoCliente order by IDLinea");
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasPedido";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=49217539;
 //BA.debugLineNum = 49217539;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=49217540;
 //BA.debugLineNum = 49217540;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=49217541;
 //BA.debugLineNum = 49217541;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 1:
//if
this.state = 21;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=49217542;
 //BA.debugLineNum = 49217542;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 4:
//if
this.state = 11;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=49217543;
 //BA.debugLineNum = 49217543;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=49217544;
 //BA.debugLineNum = 49217544;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
RDebugUtils.currentLine=49217546;
 //BA.debugLineNum = 49217546;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=49217547;
 //BA.debugLineNum = 49217547;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=49217548;
 //BA.debugLineNum = 49217548;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=49217549;
 //BA.debugLineNum = 49217549;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AbrirCampos";
__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=49217550;
 //BA.debugLineNum = 49217550;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=49217553;
 //BA.debugLineNum = 49217553;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
RDebugUtils.currentLine=49217554;
 //BA.debugLineNum = 49217554;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=49217556;
 //BA.debugLineNum = 49217556;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 11:
//if
this.state = 20;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=49217557;
 //BA.debugLineNum = 49217557;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 14:
//if
this.state = 19;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=49217558;
 //BA.debugLineNum = 49217558;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=49217559;
 //BA.debugLineNum = 49217559;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "actualizardatoslineaspedido"), _msa);
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
RDebugUtils.currentLine=49217564;
 //BA.debugLineNum = 49217564;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=49217565;
 //BA.debugLineNum = 49217565;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatosalbaranespedidocliente(b4j.docU.cb2bfichapedidocliente __ref,int _idpedidosel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "cargadatosalbaranespedidocliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatosalbaranespedidocliente", new Object[] {_idpedidosel}));}
ResumableSub_CargaDatosAlbaranesPedidoCliente rsub = new ResumableSub_CargaDatosAlbaranesPedidoCliente(this,__ref,_idpedidosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosAlbaranesPedidoCliente extends BA.ResumableSub {
public ResumableSub_CargaDatosAlbaranesPedidoCliente(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,int _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._idpedidosel = _idpedidosel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
int _idpedidosel;
String _sresp = "";
Object _msa = null;
String _dateformatant = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _lstalbaranes = null;
anywheresoftware.b4a.objects.collections.Map _mdataalbaran = null;
String _idalbaran = "";
String _albaran = "";
long _fechaalbaran = 0L;
int _iddireccionenvio = 0;
anywheresoftware.b4a.objects.collections.List _lstlineasalbaran = null;
int _lineaalbaran = 0;
anywheresoftware.b4a.objects.collections.Map _mdatalineaalbaran = null;
int _idproductob2b = 0;
String _itemsku = "";
String _itemparentsku = "";
String _codigoarticulonav = "";
String _descripcionproductob2b = "";
String _tallab2b = "";
int _qtylineaalbaran = 0;
String _uomb2b = "";
anywheresoftware.b4a.BA.IterableList group14;
int index14;
int groupLen14;
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BLineasAlbara";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BLineasAlbaranPedidoCliente");
RDebugUtils.currentLine=49414148;
 //BA.debugLineNum = 49414148;BA.debugLine="wait for(EnvioDatosAPIMagentoAlbaranesPedido(mTk,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "cargadatosalbaranespedidocliente"), __ref._enviodatosapimagentoalbaranespedido /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mtk /*String*/ ,_idpedidosel));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=49414149;
 //BA.debugLineNum = 49414149;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
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
RDebugUtils.currentLine=49414150;
 //BA.debugLineNum = 49414150;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error en la";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Error en la descarga de albaranes del pedido.\n"+""+parent.__c.SmartStringFormatter("",(Object)(_sresp))+""),"Error");
RDebugUtils.currentLine=49414152;
 //BA.debugLineNum = 49414152;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "cargadatosalbaranespedidocliente"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 4;
;
RDebugUtils.currentLine=49414153;
 //BA.debugLineNum = 49414153;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=49414156;
 //BA.debugLineNum = 49414156;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=49414157;
 //BA.debugLineNum = 49414157;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=49414159;
 //BA.debugLineNum = 49414159;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=49414160;
 //BA.debugLineNum = 49414160;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=49414161;
 //BA.debugLineNum = 49414161;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=49414162;
 //BA.debugLineNum = 49414162;BA.debugLine="Dim lstAlbaranes As List=root.Get(\"items\")";
_lstalbaranes = new anywheresoftware.b4a.objects.collections.List();
_lstalbaranes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=49414163;
 //BA.debugLineNum = 49414163;BA.debugLine="For Each mDataAlbaran As Map In lstAlbaranes";
if (true) break;

case 5:
//for
this.state = 12;
_mdataalbaran = new anywheresoftware.b4a.objects.collections.Map();
group14 = _lstalbaranes;
index14 = 0;
groupLen14 = group14.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 12;
if (index14 < groupLen14) {
this.state = 7;
_mdataalbaran = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group14.Get(index14)));}
if (true) break;

case 16:
//C
this.state = 15;
index14++;
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=49414164;
 //BA.debugLineNum = 49414164;BA.debugLine="Log(mDataAlbaran)";
parent.__c.LogImpl("849414164",BA.ObjectToString(_mdataalbaran),0);
RDebugUtils.currentLine=49414165;
 //BA.debugLineNum = 49414165;BA.debugLine="Dim IDAlbaran As String=mDataAlbaran.Get(\"entity";
_idalbaran = BA.ObjectToString(_mdataalbaran.Get((Object)("entity_id")));
RDebugUtils.currentLine=49414166;
 //BA.debugLineNum = 49414166;BA.debugLine="Dim Albaran As String=mDataAlbaran.Get(\"incremen";
_albaran = BA.ObjectToString(_mdataalbaran.Get((Object)("increment_id")));
RDebugUtils.currentLine=49414167;
 //BA.debugLineNum = 49414167;BA.debugLine="Dim FechaAlbaran As Long=DateTime.DateParse(mDat";
_fechaalbaran = parent.__c.DateTime.DateParse(BA.ObjectToString(_mdataalbaran.Get((Object)("created_at"))));
RDebugUtils.currentLine=49414168;
 //BA.debugLineNum = 49414168;BA.debugLine="Dim IDDireccionEnvio As Int=mDataAlbaran.Get(\"sh";
_iddireccionenvio = (int)(BA.ObjectToNumber(_mdataalbaran.Get((Object)("shipping_address_id"))));
RDebugUtils.currentLine=49414169;
 //BA.debugLineNum = 49414169;BA.debugLine="Dim lstLineasAlbaran As List=mDataAlbaran.Get(\"i";
_lstlineasalbaran = new anywheresoftware.b4a.objects.collections.List();
_lstlineasalbaran = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mdataalbaran.Get((Object)("items"))));
RDebugUtils.currentLine=49414170;
 //BA.debugLineNum = 49414170;BA.debugLine="Dim LineaAlbaran As Int";
_lineaalbaran = 0;
RDebugUtils.currentLine=49414171;
 //BA.debugLineNum = 49414171;BA.debugLine="For Each mDataLineaAlbaran As Map In lstLineasAl";
if (true) break;

case 8:
//for
this.state = 11;
_mdatalineaalbaran = new anywheresoftware.b4a.objects.collections.Map();
group22 = _lstlineasalbaran;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index22 < groupLen22) {
this.state = 10;
_mdatalineaalbaran = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group22.Get(index22)));}
if (true) break;

case 18:
//C
this.state = 17;
index22++;
if (true) break;

case 10:
//C
this.state = 18;
RDebugUtils.currentLine=49414172;
 //BA.debugLineNum = 49414172;BA.debugLine="Log(mDataLineaAlbaran)";
parent.__c.LogImpl("849414172",BA.ObjectToString(_mdatalineaalbaran),0);
RDebugUtils.currentLine=49414173;
 //BA.debugLineNum = 49414173;BA.debugLine="Dim IDProductoB2B As Int=mDataLineaAlbaran.Get(";
_idproductob2b = (int)(BA.ObjectToNumber(_mdatalineaalbaran.Get((Object)("product_id"))));
RDebugUtils.currentLine=49414174;
 //BA.debugLineNum = 49414174;BA.debugLine="Dim ItemSKU As String=mDataLineaAlbaran.get(\"sk";
_itemsku = BA.ObjectToString(_mdatalineaalbaran.Get((Object)("sku")));
RDebugUtils.currentLine=49414175;
 //BA.debugLineNum = 49414175;BA.debugLine="Dim ItemParentSKU As String=mSQL.ExecQuerySingl";
_itemparentsku = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select ItemParentSKU from tblB2BLineasPedidoCliente where ItemSKU=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_itemsku}));
RDebugUtils.currentLine=49414176;
 //BA.debugLineNum = 49414176;BA.debugLine="Dim CodigoArticuloNAV As String=mSQL.ExecQueryS";
_codigoarticulonav = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select CodigoArticuloNav from tblB2BLineasPedidoCliente where ItemSKU=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_itemsku}));
RDebugUtils.currentLine=49414177;
 //BA.debugLineNum = 49414177;BA.debugLine="Dim DescripcionProductoB2B As String=mSQL.ExecQ";
_descripcionproductob2b = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select DescripcionProductoB2B from tblB2BLineasPedidoCliente where ItemSKU=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_itemsku}));
RDebugUtils.currentLine=49414178;
 //BA.debugLineNum = 49414178;BA.debugLine="Dim TallaB2B As String=mSQL.ExecQuerySingleResu";
_tallab2b = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select TallaB2B from tblB2BLineasPedidoCliente where ItemSKU=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_itemsku}));
RDebugUtils.currentLine=49414179;
 //BA.debugLineNum = 49414179;BA.debugLine="Dim QtyLineaAlbaran As Int=mDataLineaAlbaran.ge";
_qtylineaalbaran = (int)(BA.ObjectToNumber(_mdatalineaalbaran.Get((Object)("qty"))));
RDebugUtils.currentLine=49414180;
 //BA.debugLineNum = 49414180;BA.debugLine="Dim UOMB2B As String=mSQL.ExecQuerySingleResult";
_uomb2b = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select UOMB2B from tblB2BLineasPedidoCliente where ItemSKU=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_itemsku}));
RDebugUtils.currentLine=49414181;
 //BA.debugLineNum = 49414181;BA.debugLine="LineaAlbaran=LineaAlbaran+1";
_lineaalbaran = (int) (_lineaalbaran+1);
RDebugUtils.currentLine=49414183;
 //BA.debugLineNum = 49414183;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BLineasAl";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("insert into tblB2BLineasAlbaranPedidoCliente (\n"+"			Albaran,FechaAlbaran,\n"+"			LineaAlbaran, IDProductoB2B,\n"+"			ItemSKU, \n"+"			DescripcionProductoB2B, TallaB2B,\n"+"			QtyEnviada, UOMB2B ,\n"+"			ItemParentSKU, CodigoArticuloNAV\n"+"			)\n"+"			values(?,?,?,?,?,?,?,?,?,?,?)\n"+"			"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_albaran),(Object)(_fechaalbaran),(Object)(_lineaalbaran),(Object)(_idproductob2b),(Object)(_itemsku),(Object)(_descripcionproductob2b),(Object)(_tallab2b),(Object)(_qtylineaalbaran),(Object)(_uomb2b),(Object)(_itemparentsku),(Object)(_codigoarticulonav)}));
 if (true) break;
if (true) break;

case 11:
//C
this.state = 16;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=49414200;
 //BA.debugLineNum = 49414200;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=49414202;
 //BA.debugLineNum = 49414202;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=49414203;
 //BA.debugLineNum = 49414203;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoalbaranespedido(b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idpedidosel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoalbaranespedido", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoalbaranespedido", new Object[] {_token,_idpedidosel}));}
ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido rsub = new ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido(this,__ref,_token,_idpedidosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoAlbaranesPedido(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idpedidosel = _idpedidosel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _token;
int _idpedidosel;
String _squeryapi = "";
b4j.docU.httpjob _job = null;
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49479683;
 //BA.debugLineNum = 49479683;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/shipments/?\n"+"	searchCriteria[pageSize] = 0&\n"+"	searchCriteria[filterGroups][0][filters][0][field]=order_id&\n"+"	searchCriteria[filterGroups][0][filters][0][value]="+parent.__c.SmartStringFormatter("",(Object)(_idpedidosel))+"&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=eq");
RDebugUtils.currentLine=49479690;
 //BA.debugLineNum = 49479690;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=49479691;
 //BA.debugLineNum = 49479691;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=49479693;
 //BA.debugLineNum = 49479693;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=49479695;
 //BA.debugLineNum = 49479695;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=49479696;
 //BA.debugLineNum = 49479696;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=49479698;
 //BA.debugLineNum = 49479698;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=49479700;
 //BA.debugLineNum = 49479700;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoalbaranespedido"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=49479702;
 //BA.debugLineNum = 49479702;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=49479703;
 //BA.debugLineNum = 49479703;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("849479703","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=49479704;
 //BA.debugLineNum = 49479704;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("849479704",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=49479705;
 //BA.debugLineNum = 49479705;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=49479706;
 //BA.debugLineNum = 49479706;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49479707;
 //BA.debugLineNum = 49479707;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=49479710;
 //BA.debugLineNum = 49479710;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=49479711;
 //BA.debugLineNum = 49479711;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49479712;
 //BA.debugLineNum = 49479712;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=49479714;
 //BA.debugLineNum = 49479714;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatosdireccioncliente(b4j.docU.cb2bfichapedidocliente __ref,int _iddireccionsel,String _tipodireccion) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "cargadatosdireccioncliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatosdireccioncliente", new Object[] {_iddireccionsel,_tipodireccion}));}
ResumableSub_CargaDatosDireccionCliente rsub = new ResumableSub_CargaDatosDireccionCliente(this,__ref,_iddireccionsel,_tipodireccion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosDireccionCliente extends BA.ResumableSub {
public ResumableSub_CargaDatosDireccionCliente(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,int _iddireccionsel,String _tipodireccion) {
this.parent = parent;
this.__ref = __ref;
this._iddireccionsel = _iddireccionsel;
this._tipodireccion = _tipodireccion;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
int _iddireccionsel;
String _tipodireccion;
String _sresp = "";
anywheresoftware.b4a.objects.collections.Map _mdatapedido = null;
String _dateformatant = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _lstcustomattributes = null;
anywheresoftware.b4a.objects.collections.Map _mcustomattributes = null;
String _attribute_code = "";
String _value = "";
anywheresoftware.b4a.BA.IterableList group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49741829;
 //BA.debugLineNum = 49741829;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionDireccion";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "cargadatosdireccioncliente"), __ref._enviodatosapimagentoinformaciondireccioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mtk /*String*/ ,_iddireccionsel));
this.state = 31;
return;
case 31:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=49741830;
 //BA.debugLineNum = 49741830;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=49741831;
 //BA.debugLineNum = 49741831;BA.debugLine="If sResp.StartsWith($\"ERROR HTTPJob {\"message\":\"";
if (true) break;

case 4:
//if
this.state = 15;
if (_sresp.startsWith(("ERROR HTTPJob {\"message\":\"No such entity with %fieldName = %fieldValue\",\"parameters\":{\"fieldName\":\"addressId\",\"fieldValue\":"+parent.__c.SmartStringFormatter("",(Object)(_iddireccionsel))+"}"))) { 
this.state = 6;
}else {
this.state = 14;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=49741832;
 //BA.debugLineNum = 49741832;BA.debugLine="Select Case TipoDireccion";
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tipodireccion,"Facturacion","Envio")) {
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
RDebugUtils.currentLine=49741835;
 //BA.debugLineNum = 49741835;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=49741837;
 //BA.debugLineNum = 49741837;BA.debugLine="mDatosCabeceraPedidoCliente.CodigoDireccionEn";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .CodigoDireccionEnvioERP /*String*/  = "";
RDebugUtils.currentLine=49741838;
 //BA.debugLineNum = 49741838;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 12:
//C
this.state = 15;
;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=49741841;
 //BA.debugLineNum = 49741841;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
RDebugUtils.currentLine=49741846;
 //BA.debugLineNum = 49741846;BA.debugLine="Dim mDataPedido As Map";
_mdatapedido = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49741847;
 //BA.debugLineNum = 49741847;BA.debugLine="mDataPedido.Initialize";
_mdatapedido.Initialize();
RDebugUtils.currentLine=49741852;
 //BA.debugLineNum = 49741852;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=49741853;
 //BA.debugLineNum = 49741853;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=49741855;
 //BA.debugLineNum = 49741855;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=49741856;
 //BA.debugLineNum = 49741856;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=49741857;
 //BA.debugLineNum = 49741857;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=49741858;
 //BA.debugLineNum = 49741858;BA.debugLine="Dim lstCustomAttributes As List=root.Get(\"custom_";
_lstcustomattributes = new anywheresoftware.b4a.objects.collections.List();
_lstcustomattributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=49741859;
 //BA.debugLineNum = 49741859;BA.debugLine="For Each mCustomAttributes As Map In lstCustomAtt";
if (true) break;

case 17:
//for
this.state = 30;
_mcustomattributes = new anywheresoftware.b4a.objects.collections.Map();
group23 = _lstcustomattributes;
index23 = 0;
groupLen23 = group23.getSize();
this.state = 32;
if (true) break;

case 32:
//C
this.state = 30;
if (index23 < groupLen23) {
this.state = 19;
_mcustomattributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group23.Get(index23)));}
if (true) break;

case 33:
//C
this.state = 32;
index23++;
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=49741860;
 //BA.debugLineNum = 49741860;BA.debugLine="Dim attribute_code As String = mCustomAttributes";
_attribute_code = BA.ObjectToString(_mcustomattributes.Get((Object)("attribute_code")));
RDebugUtils.currentLine=49741861;
 //BA.debugLineNum = 49741861;BA.debugLine="Dim value As String = mCustomAttributes.Get(\"val";
_value = BA.ObjectToString(_mcustomattributes.Get((Object)("value")));
RDebugUtils.currentLine=49741865;
 //BA.debugLineNum = 49741865;BA.debugLine="If attribute_code=\"code\" Then";
if (true) break;

case 20:
//if
this.state = 29;
if ((_attribute_code).equals("code")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=49741866;
 //BA.debugLineNum = 49741866;BA.debugLine="Select Case TipoDireccion";
if (true) break;

case 23:
//select
this.state = 28;
switch (BA.switchObjectToInt(_tipodireccion,"Facturacion","Envio")) {
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
RDebugUtils.currentLine=49741870;
 //BA.debugLineNum = 49741870;BA.debugLine="mDatosCabeceraPedidoCliente.CodigoDireccionEn";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .CodigoDireccionEnvioERP /*String*/  = _value;
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
;
RDebugUtils.currentLine=49741877;
 //BA.debugLineNum = 49741877;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=49741879;
 //BA.debugLineNum = 49741879;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=49741881;
 //BA.debugLineNum = 49741881;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformaciondireccioncliente(b4j.docU.cb2bfichapedidocliente __ref,String _token,int _iddireccionsel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformaciondireccioncliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformaciondireccioncliente", new Object[] {_token,_iddireccionsel}));}
ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente(this,__ref,_token,_iddireccionsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionDireccionCliente(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,String _token,int _iddireccionsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._iddireccionsel = _iddireccionsel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _token;
int _iddireccionsel;
String _squeryapi = "";
b4j.docU.httpjob _job = null;
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49807363;
 //BA.debugLineNum = 49807363;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/addresses/"+parent.__c.SmartStringFormatter("",(Object)(_iddireccionsel))+"");
RDebugUtils.currentLine=49807365;
 //BA.debugLineNum = 49807365;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=49807366;
 //BA.debugLineNum = 49807366;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=49807368;
 //BA.debugLineNum = 49807368;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=49807370;
 //BA.debugLineNum = 49807370;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=49807371;
 //BA.debugLineNum = 49807371;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=49807373;
 //BA.debugLineNum = 49807373;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=49807375;
 //BA.debugLineNum = 49807375;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformaciondireccioncliente"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=49807377;
 //BA.debugLineNum = 49807377;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=49807378;
 //BA.debugLineNum = 49807378;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("849807378","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=49807379;
 //BA.debugLineNum = 49807379;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("849807379",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=49807380;
 //BA.debugLineNum = 49807380;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=49807381;
 //BA.debugLineNum = 49807381;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49807382;
 //BA.debugLineNum = 49807382;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=49807385;
 //BA.debugLineNum = 49807385;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=49807386;
 //BA.debugLineNum = 49807386;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49807387;
 //BA.debugLineNum = 49807387;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=49807389;
 //BA.debugLineNum = 49807389;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatospedidocliente(b4j.docU.cb2bfichapedidocliente __ref,int _idpedidosel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "cargadatospedidocliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatospedidocliente", new Object[] {_idpedidosel}));}
ResumableSub_CargaDatosPedidoCliente rsub = new ResumableSub_CargaDatosPedidoCliente(this,__ref,_idpedidosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosPedidoCliente extends BA.ResumableSub {
public ResumableSub_CargaDatosPedidoCliente(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,int _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._idpedidosel = _idpedidosel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
int _idpedidosel;
String _sresp = "";
String _dateformatant = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
anywheresoftware.b4a.objects.collections.Map _pgw = null;
String _spunchout = "";
int _idpunchout = 0;
anywheresoftware.b4a.objects.collections.List _extrinsic = null;
anywheresoftware.b4a.objects.collections.List _extra_data = null;
anywheresoftware.b4a.objects.collections.List _posr_data = null;
anywheresoftware.b4a.objects.collections.List _originator = null;
String _entity_id = "";
anywheresoftware.b4a.objects.collections.List _poom_data = null;
String _po_number = "";
double _tax_amount = 0;
double _tax_invoiced = 0;
int _customer_note_notify = 0;
int _shipping_discount_amount = 0;
int _base_discount_tax_compensation_invoiced = 0;
double _discount_amount = 0;
anywheresoftware.b4a.objects.collections.Map _billing_address = null;
String _firstname = "";
String _address_type = "";
int _billing_customer_address_id = 0;
int _idbilling_address = 0;
String _billingcompany = "";
String _city = "";
String _postcode = "";
int _region_id = 0;
String _telephone = "";
String _lastname = "";
int _parent_id = 0;
anywheresoftware.b4a.objects.collections.List _street = null;
String _direccionfisicafacturacion = "";
String _colstreet = "";
String _region = "";
String _country_id = "";
String _email = "";
String _region_code = "";
anywheresoftware.b4a.objects.collections.Map _billingaddress_extensionattributes = null;
anywheresoftware.b4a.objects.collections.Map _billingaddress_extensionattributes_pgw = null;
double _total_paid = 0;
String _increment_id = "";
anywheresoftware.b4a.objects.collections.Map _payment = null;
double _base_amount_ordered = 0;
double _amount_paid = 0;
String _method = "";
String _cc_last4 = "";
int _shipping_captured = 0;
String _account_status = "";
double _amount_ordered = 0;
int _paymentid = 0;
double _base_amount_paid = 0;
int _shipping_amount = 0;
anywheresoftware.b4a.objects.collections.List _additional_information = null;
String _coladditional_information = "";
double _base_shipping_amount = 0;
int _base_shipping_captured = 0;
String _state = "";
int _base_shipping_tax_amount = 0;
double _base_grand_total = 0;
int _billing_address_id = 0;
int _quote_id = 0;
int _shipping_invoiced = 0;
int _discount_tax_compensation_amount = 0;
int _weight = 0;
int _idpedido = 0;
double _base_total_invoiced = 0;
int _base_subtotal_invoiced = 0;
String _applied_rule_ids = "";
double _subtotal_incl_tax = 0;
int _base_shipping_discount_tax_compensation_amnt = 0;
double _subtotal = 0;
int _base_shipping_incl_tax = 0;
int _base_discount_invoiced = 0;
int _base_to_global_rate = 0;
int _customer_is_guest = 0;
String _global_currency_code = "";
String _status = "";
int _is_virtual = 0;
int _base_total_invoiced_cost = 0;
int _discount_tax_compensation_invoiced = 0;
anywheresoftware.b4a.objects.collections.List _status_histories = null;
String _store_currency_code = "";
String _created_at = "";
int _total_item_count = 0;
int _shipping_tax_amount = 0;
int _store_to_base_rate = 0;
String _updated_at = "";
int _base_shipping_discount_amount = 0;
int _store_id = 0;
String _store_name = "";
double _grand_total = 0;
String _base_currency_code = "";
double _base_total_paid = 0;
double _base_tax_amount = 0;
int _shipping_discount_tax_compensation_amount = 0;
int _total_due = 0;
int _total_qty_ordered = 0;
int _base_discount_amount = 0;
anywheresoftware.b4a.objects.collections.List _carts = null;
anywheresoftware.b4a.objects.collections.Map _mcart = null;
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
String _tipoimpuestoaplicado = "";
String _converting_from_quote = "";
anywheresoftware.b4a.objects.collections.List _contacts = null;
anywheresoftware.b4a.objects.collections.Map _mcontacts = null;
String _shipping_description = "";
int _store_to_order_rate = 0;
int _base_discount_tax_compensation_amount = 0;
int _subtotal_invoiced = 0;
int _base_to_order_rate = 0;
int _base_subtotal = 0;
String _protect_code = "";
String _customer_dob = "";
int _base_total_due = 0;
double _base_subtotal_incl_tax = 0;
int _customer_id = 0;
int _customer_group_id = 0;
int _discount_invoiced = 0;
String _order_currency_code = "";
double _base_tax_invoiced = 0;
int _customer_gender = 0;
int _shipping_incl_tax = 0;
int _base_shipping_invoiced = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _lineapedido = 0;
anywheresoftware.b4a.objects.collections.List _lstproductosconfigurables = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
b4j.docU.cb2bfichapedidocliente._tipodatoslineapedidoclienteb2b _datoslineapedidoclienteb2b = null;
String _sku = "";
String _product_type = "";
double _original_price = 0;
int _free_shipping = 0;
double _tax_percent = 0;
double _price_incl_tax = 0;
double _price = 0;
int _product_id = 0;
double _base_row_total = 0;
int _base_original_price = 0;
int _row_weight = 0;
int _base_amount_refunded = 0;
double _base_price_incl_tax = 0;
int _no_discount = 0;
String _name = "";
int _discount_percent = 0;
int _order_id = 0;
int _qty_shipped = 0;
int _qty_ordered = 0;
int _row_total = 0;
int _qty_canceled = 0;
String _talla = "";
anywheresoftware.b4a.objects.collections.Map _product_option = null;
anywheresoftware.b4a.objects.collections.Map _itemproductoptionextension_attributes = null;
anywheresoftware.b4a.objects.collections.List _configurable_item_options = null;
anywheresoftware.b4a.objects.collections.Map _colconfigurable_item_options = null;
int _option_value = 0;
String _option_id = "";
anywheresoftware.b4a.objects.collections.Map _itemextensionattributes = null;
anywheresoftware.b4a.objects.collections.Map _itempgw = null;
int _amount_refunded = 0;
double _base_price = 0;
int _qty_invoiced = 0;
int _row_invoiced = 0;
double _row_total_incl_tax = 0;
int _item_id = 0;
double _base_row_total_incl_tax = 0;
int _qty_refunded = 0;
int _base_row_invoiced = 0;
int _is_qty_decimal = 0;
int _idparentitem = 0;
anywheresoftware.b4a.objects.collections.Map _mparent_item = null;
anywheresoftware.b4a.objects.collections.Map _mproductoptionparentitem = null;
anywheresoftware.b4a.objects.collections.Map _mextensionattributesproductoptionparentitem = null;
anywheresoftware.b4a.objects.collections.Map _mdataconfigurable_item_options = null;
anywheresoftware.b4a.objects.collections.Map _mextensionattributesparentitem = null;
anywheresoftware.b4a.objects.collections.Map _mpgwextensionattributesparentitem = null;
String[] _partessku = null;
String _ssql = "";
anywheresoftware.b4a.objects.collections.List _shipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _colshipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _shipping = null;
anywheresoftware.b4a.objects.collections.Map _total = null;
anywheresoftware.b4a.objects.collections.Map _address = null;
int _shipping_customer_address_id = 0;
int _iddireccionenvio = 0;
String _company = "";
String _direccionenvio = "";
anywheresoftware.b4a.objects.collections.Map _addressextensionattributes = null;
anywheresoftware.b4a.objects.collections.Map _addresspgw = null;
anywheresoftware.b4a.objects.collections.List _itemsshipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _colitemsshipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _itemsshipping_assignmentsproduct_option = null;
anywheresoftware.b4a.objects.collections.Map _itemsshipping_assignmentsproduct_optionextension_attributes = null;
String _tallalineaalbaran = "";
anywheresoftware.b4a.objects.collections.List _itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options = null;
anywheresoftware.b4a.objects.collections.Map _itemsshippingcolconfigurable_item_options = null;
anywheresoftware.b4a.BA.IterableList group62;
int index62;
int groupLen62;
anywheresoftware.b4a.BA.IterableList group91;
int index91;
int groupLen91;
anywheresoftware.b4a.BA.IterableList group150;
int index150;
int groupLen150;
anywheresoftware.b4a.BA.IterableList group155;
int index155;
int groupLen155;
anywheresoftware.b4a.BA.IterableList group162;
int index162;
int groupLen162;
anywheresoftware.b4a.BA.IterableList group172;
int index172;
int groupLen172;
anywheresoftware.b4a.BA.IterableList group174;
int index174;
int groupLen174;
anywheresoftware.b4a.BA.IterableList group186;
int index186;
int groupLen186;
anywheresoftware.b4a.BA.IterableList group219;
int index219;
int groupLen219;
anywheresoftware.b4a.BA.IterableList group268;
int index268;
int groupLen268;
anywheresoftware.b4a.BA.IterableList group321;
int index321;
int groupLen321;
anywheresoftware.b4a.BA.IterableList group350;
int index350;
int groupLen350;
anywheresoftware.b4a.BA.IterableList group385;
int index385;
int groupLen385;
anywheresoftware.b4a.BA.IterableList group399;
int index399;
int groupLen399;
anywheresoftware.b4a.BA.IterableList group434;
int index434;
int groupLen434;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BLineasPedido";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BLineasPedidoCliente");
RDebugUtils.currentLine=49086467;
 //BA.debugLineNum = 49086467;BA.debugLine="mDatosCabeceraPedidoCliente.Initialize";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .Initialize();
RDebugUtils.currentLine=49086471;
 //BA.debugLineNum = 49086471;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidoCli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "cargadatospedidocliente"), __ref._enviodatosapimagentoinformacionpedidocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mtk /*String*/ ,_idpedidosel));
this.state = 167;
return;
case 167:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=49086472;
 //BA.debugLineNum = 49086472;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
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
RDebugUtils.currentLine=49086481;
 //BA.debugLineNum = 49086481;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=49086482;
 //BA.debugLineNum = 49086482;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=49086484;
 //BA.debugLineNum = 49086484;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=49086485;
 //BA.debugLineNum = 49086485;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=49086486;
 //BA.debugLineNum = 49086486;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=49086488;
 //BA.debugLineNum = 49086488;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49086489;
 //BA.debugLineNum = 49086489;BA.debugLine="Log(\"extension_attributes\" & extension_attributes";
parent.__c.LogImpl("849086489","extension_attributes"+BA.ObjectToString(_extension_attributes),0);
RDebugUtils.currentLine=49086490;
 //BA.debugLineNum = 49086490;BA.debugLine="Dim pgw As Map = extension_attributes.Get(\"pgw\")";
_pgw = new anywheresoftware.b4a.objects.collections.Map();
_pgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_extension_attributes.Get((Object)("pgw"))));
RDebugUtils.currentLine=49086491;
 //BA.debugLineNum = 49086491;BA.debugLine="Log(\"pgw\" & pgw)";
parent.__c.LogImpl("849086491","pgw"+BA.ObjectToString(_pgw),0);
RDebugUtils.currentLine=49086492;
 //BA.debugLineNum = 49086492;BA.debugLine="Dim sPunchout As String=pgw.Get(\"entity_id\")";
_spunchout = BA.ObjectToString(_pgw.Get((Object)("entity_id")));
RDebugUtils.currentLine=49086493;
 //BA.debugLineNum = 49086493;BA.debugLine="If sPunchout=\"null\" Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((_spunchout).equals("null")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
RDebugUtils.currentLine=49086494;
 //BA.debugLineNum = 49086494;BA.debugLine="mDatosCabeceraPedidoCliente.PedidoPunchout=False";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .PedidoPunchout /*boolean*/  = parent.__c.False;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=49086496;
 //BA.debugLineNum = 49086496;BA.debugLine="Dim IDPunchout As Int=pgw.Get(\"entity_id\")";
_idpunchout = (int)(BA.ObjectToNumber(_pgw.Get((Object)("entity_id"))));
RDebugUtils.currentLine=49086497;
 //BA.debugLineNum = 49086497;BA.debugLine="If IDPunchout>0 Then";
if (true) break;

case 12:
//if
this.state = 17;
if (_idpunchout>0) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=49086498;
 //BA.debugLineNum = 49086498;BA.debugLine="mDatosCabeceraPedidoCliente.PedidoPunchout=True";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .PedidoPunchout /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=49086499;
 //BA.debugLineNum = 49086499;BA.debugLine="Dim extrinsic As List = pgw.Get(\"extrinsic\")";
_extrinsic = new anywheresoftware.b4a.objects.collections.List();
_extrinsic = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("extrinsic"))));
RDebugUtils.currentLine=49086500;
 //BA.debugLineNum = 49086500;BA.debugLine="Dim extra_data As List = pgw.Get(\"extra_data\")";
_extra_data = new anywheresoftware.b4a.objects.collections.List();
_extra_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("extra_data"))));
RDebugUtils.currentLine=49086501;
 //BA.debugLineNum = 49086501;BA.debugLine="Dim posr_data As List = pgw.Get(\"posr_data\")";
_posr_data = new anywheresoftware.b4a.objects.collections.List();
_posr_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("posr_data"))));
RDebugUtils.currentLine=49086502;
 //BA.debugLineNum = 49086502;BA.debugLine="Dim originator As List = pgw.Get(\"originator\")";
_originator = new anywheresoftware.b4a.objects.collections.List();
_originator = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("originator"))));
RDebugUtils.currentLine=49086503;
 //BA.debugLineNum = 49086503;BA.debugLine="Dim entity_id As String = pgw.Get(\"entity_id\")";
_entity_id = BA.ObjectToString(_pgw.Get((Object)("entity_id")));
RDebugUtils.currentLine=49086504;
 //BA.debugLineNum = 49086504;BA.debugLine="Dim poom_data As List = pgw.Get(\"poom_data\")";
_poom_data = new anywheresoftware.b4a.objects.collections.List();
_poom_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("poom_data"))));
RDebugUtils.currentLine=49086505;
 //BA.debugLineNum = 49086505;BA.debugLine="Dim po_number As String=pgw.Getdefault(\"po_numb";
_po_number = BA.ObjectToString(_pgw.GetDefault((Object)("po_number"),(Object)("")));
RDebugUtils.currentLine=49086506;
 //BA.debugLineNum = 49086506;BA.debugLine="mDatosCabeceraPedidoCliente.OrdenCompra=po_numb";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .OrdenCompra /*String*/  = _po_number;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=49086508;
 //BA.debugLineNum = 49086508;BA.debugLine="mDatosCabeceraPedidoCliente.PedidoPunchout=Fals";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .PedidoPunchout /*boolean*/  = parent.__c.False;
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
RDebugUtils.currentLine=49086513;
 //BA.debugLineNum = 49086513;BA.debugLine="Dim tax_amount As Double = root.Getdefault(\"tax_a";
_tax_amount = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("tax_amount"),(Object)(0))));
RDebugUtils.currentLine=49086514;
 //BA.debugLineNum = 49086514;BA.debugLine="Dim tax_invoiced As Double = root.Getdefault(\"tax";
_tax_invoiced = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086515;
 //BA.debugLineNum = 49086515;BA.debugLine="Dim customer_note_notify As Int = root.Getdefault";
_customer_note_notify = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_note_notify"),(Object)(0))));
RDebugUtils.currentLine=49086516;
 //BA.debugLineNum = 49086516;BA.debugLine="Dim shipping_discount_amount As Int = root.Getdef";
_shipping_discount_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49086517;
 //BA.debugLineNum = 49086517;BA.debugLine="Dim base_discount_tax_compensation_invoiced As In";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086519;
 //BA.debugLineNum = 49086519;BA.debugLine="mDatosCabeceraPedidoCliente.NombreUsuarioComprado";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreUsuarioComprador /*String*/  = (""+parent.__c.SmartStringFormatter("",_root.Get((Object)("customer_firstname")))+"");
RDebugUtils.currentLine=49086520;
 //BA.debugLineNum = 49086520;BA.debugLine="mDatosCabeceraPedidoCliente.ApellidoUsuarioCompra";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .ApellidoUsuarioComprador /*String*/  = (""+parent.__c.SmartStringFormatter("",_root.Get((Object)("customer_lastname")))+"");
RDebugUtils.currentLine=49086523;
 //BA.debugLineNum = 49086523;BA.debugLine="Dim discount_amount As Double = root.Getdefault(\"";
_discount_amount = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49086524;
 //BA.debugLineNum = 49086524;BA.debugLine="Dim billing_address As Map = root.Get(\"billing_ad";
_billing_address = new anywheresoftware.b4a.objects.collections.Map();
_billing_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("billing_address"))));
RDebugUtils.currentLine=49086525;
 //BA.debugLineNum = 49086525;BA.debugLine="Log(\"billing_address\" & billing_address)";
parent.__c.LogImpl("849086525","billing_address"+BA.ObjectToString(_billing_address),0);
RDebugUtils.currentLine=49086527;
 //BA.debugLineNum = 49086527;BA.debugLine="Dim firstname As String = billing_address.Get(\"fi";
_firstname = BA.ObjectToString(_billing_address.Get((Object)("firstname")));
RDebugUtils.currentLine=49086528;
 //BA.debugLineNum = 49086528;BA.debugLine="Dim address_type As String = billing_address.Get(";
_address_type = BA.ObjectToString(_billing_address.Get((Object)("address_type")));
RDebugUtils.currentLine=49086529;
 //BA.debugLineNum = 49086529;BA.debugLine="Dim Billing_Customer_address_id As Int = billing_";
_billing_customer_address_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("customer_address_id"),(Object)(0))));
RDebugUtils.currentLine=49086530;
 //BA.debugLineNum = 49086530;BA.debugLine="Dim IDBilling_address As Int = billing_address.Ge";
_idbilling_address = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("entity_id"),(Object)(0))));
RDebugUtils.currentLine=49086532;
 //BA.debugLineNum = 49086532;BA.debugLine="If mDatosCabeceraPedidoCliente.PedidoPunchout The";
if (true) break;

case 19:
//if
this.state = 24;
if (__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .PedidoPunchout /*boolean*/ ) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=49086533;
 //BA.debugLineNum = 49086533;BA.debugLine="mDatosCabeceraPedidoCliente.IDDireccionFacturaci";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDDireccionFacturacion /*String*/  = BA.NumberToString(_idbilling_address);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=49086535;
 //BA.debugLineNum = 49086535;BA.debugLine="mDatosCabeceraPedidoCliente.IDDireccionFacturaci";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDDireccionFacturacion /*String*/  = BA.NumberToString(_billing_customer_address_id);
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=49086538;
 //BA.debugLineNum = 49086538;BA.debugLine="Dim Billingcompany As String=billing_address.Getd";
_billingcompany = BA.ObjectToString(_billing_address.GetDefault((Object)("company"),(Object)("")));
RDebugUtils.currentLine=49086540;
 //BA.debugLineNum = 49086540;BA.debugLine="mDatosCabeceraPedidoCliente.NombreDireccionFactur";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreDireccionFacturacion /*String*/  = _billingcompany;
RDebugUtils.currentLine=49086542;
 //BA.debugLineNum = 49086542;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
_city = BA.ObjectToString(_billing_address.Get((Object)("city")));
RDebugUtils.currentLine=49086543;
 //BA.debugLineNum = 49086543;BA.debugLine="Dim postcode As String = billing_address.Get(\"pos";
_postcode = BA.ObjectToString(_billing_address.Get((Object)("postcode")));
RDebugUtils.currentLine=49086544;
 //BA.debugLineNum = 49086544;BA.debugLine="Dim region_id As Int = billing_address.Getdefault";
_region_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("region_id"),(Object)(0))));
RDebugUtils.currentLine=49086545;
 //BA.debugLineNum = 49086545;BA.debugLine="Dim telephone As String = billing_address.Get(\"te";
_telephone = BA.ObjectToString(_billing_address.Get((Object)("telephone")));
RDebugUtils.currentLine=49086548;
 //BA.debugLineNum = 49086548;BA.debugLine="Dim lastname As String = billing_address.Get(\"las";
_lastname = BA.ObjectToString(_billing_address.Get((Object)("lastname")));
RDebugUtils.currentLine=49086549;
 //BA.debugLineNum = 49086549;BA.debugLine="Dim parent_id As Int = billing_address.Getdefault";
_parent_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("parent_id"),(Object)(0))));
RDebugUtils.currentLine=49086550;
 //BA.debugLineNum = 49086550;BA.debugLine="Dim street As List = billing_address.Get(\"street\"";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_billing_address.Get((Object)("street"))));
RDebugUtils.currentLine=49086551;
 //BA.debugLineNum = 49086551;BA.debugLine="Dim DireccionFisicaFacturacion As String";
_direccionfisicafacturacion = "";
RDebugUtils.currentLine=49086552;
 //BA.debugLineNum = 49086552;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 25:
//for
this.state = 28;
group62 = _street;
index62 = 0;
groupLen62 = group62.getSize();
this.state = 168;
if (true) break;

case 168:
//C
this.state = 28;
if (index62 < groupLen62) {
this.state = 27;
_colstreet = BA.ObjectToString(group62.Get(index62));}
if (true) break;

case 169:
//C
this.state = 168;
index62++;
if (true) break;

case 27:
//C
this.state = 169;
RDebugUtils.currentLine=49086553;
 //BA.debugLineNum = 49086553;BA.debugLine="Log(colstreet)";
parent.__c.LogImpl("849086553",_colstreet,0);
RDebugUtils.currentLine=49086554;
 //BA.debugLineNum = 49086554;BA.debugLine="DireccionFisicaFacturacion=DireccionFisicaFactur";
_direccionfisicafacturacion = _direccionfisicafacturacion+" "+_colstreet;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=49086556;
 //BA.debugLineNum = 49086556;BA.debugLine="Dim region As String = billing_address.Get(\"regio";
_region = BA.ObjectToString(_billing_address.Get((Object)("region")));
RDebugUtils.currentLine=49086557;
 //BA.debugLineNum = 49086557;BA.debugLine="Dim country_id As String = billing_address.Get(\"c";
_country_id = BA.ObjectToString(_billing_address.Get((Object)("country_id")));
RDebugUtils.currentLine=49086558;
 //BA.debugLineNum = 49086558;BA.debugLine="Dim email As String = billing_address.Get(\"email\"";
_email = BA.ObjectToString(_billing_address.Get((Object)("email")));
RDebugUtils.currentLine=49086559;
 //BA.debugLineNum = 49086559;BA.debugLine="Dim region_code As String = billing_address.Get(\"";
_region_code = BA.ObjectToString(_billing_address.Get((Object)("region_code")));
RDebugUtils.currentLine=49086561;
 //BA.debugLineNum = 49086561;BA.debugLine="mDatosCabeceraPedidoCliente.DireccionFacturacion=";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .DireccionFacturacion /*String*/  = (""+parent.__c.SmartStringFormatter("",(Object)(_direccionfisicafacturacion))+" "+parent.__c.SmartStringFormatter("",(Object)(_postcode))+", "+parent.__c.SmartStringFormatter("",(Object)(_city))+" "+parent.__c.SmartStringFormatter("",(Object)(_region))+" "+parent.__c.SmartStringFormatter("",(Object)(_country_id))+"");
RDebugUtils.currentLine=49086563;
 //BA.debugLineNum = 49086563;BA.debugLine="Dim BillingAddress_ExtensionAttributes As Map=bil";
_billingaddress_extensionattributes = new anywheresoftware.b4a.objects.collections.Map();
_billingaddress_extensionattributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_billing_address.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49086564;
 //BA.debugLineNum = 49086564;BA.debugLine="If BillingAddress_ExtensionAttributes.IsInitializ";
if (true) break;

case 29:
//if
this.state = 32;
if (_billingaddress_extensionattributes.IsInitialized()) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=49086565;
 //BA.debugLineNum = 49086565;BA.debugLine="Dim BillingAddress_ExtensionAttributes_pgw As Ma";
_billingaddress_extensionattributes_pgw = new anywheresoftware.b4a.objects.collections.Map();
_billingaddress_extensionattributes_pgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_billingaddress_extensionattributes.Get((Object)("pgw"))));
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=49086568;
 //BA.debugLineNum = 49086568;BA.debugLine="Dim total_paid As Double = root.Getdefault(\"total";
_total_paid = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("total_paid"),(Object)(0))));
RDebugUtils.currentLine=49086569;
 //BA.debugLineNum = 49086569;BA.debugLine="Dim increment_id As String = root.Get(\"increment_";
_increment_id = BA.ObjectToString(_root.Get((Object)("increment_id")));
RDebugUtils.currentLine=49086571;
 //BA.debugLineNum = 49086571;BA.debugLine="mDatosCabeceraPedidoCliente.Pedido=increment_id";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .Pedido /*String*/  = _increment_id;
RDebugUtils.currentLine=49086573;
 //BA.debugLineNum = 49086573;BA.debugLine="Dim payment As Map = root.Get(\"payment\")";
_payment = new anywheresoftware.b4a.objects.collections.Map();
_payment = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("payment"))));
RDebugUtils.currentLine=49086574;
 //BA.debugLineNum = 49086574;BA.debugLine="Log(\"payment\" & payment)";
parent.__c.LogImpl("849086574","payment"+BA.ObjectToString(_payment),0);
RDebugUtils.currentLine=49086575;
 //BA.debugLineNum = 49086575;BA.debugLine="Dim base_amount_ordered As Double = payment.Getde";
_base_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=49086576;
 //BA.debugLineNum = 49086576;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"a";
_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_paid"),(Object)(0))));
RDebugUtils.currentLine=49086577;
 //BA.debugLineNum = 49086577;BA.debugLine="Dim method As String = payment.Get(\"method\")";
_method = BA.ObjectToString(_payment.Get((Object)("method")));
RDebugUtils.currentLine=49086578;
 //BA.debugLineNum = 49086578;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
_cc_last4 = BA.ObjectToString(_payment.Get((Object)("cc_last4")));
RDebugUtils.currentLine=49086579;
 //BA.debugLineNum = 49086579;BA.debugLine="Dim shipping_captured As Int = payment.Getdefault";
_shipping_captured = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("shipping_captured"),(Object)(0))));
RDebugUtils.currentLine=49086580;
 //BA.debugLineNum = 49086580;BA.debugLine="Dim account_status As String = payment.Get(\"accou";
_account_status = BA.ObjectToString(_payment.Get((Object)("account_status")));
RDebugUtils.currentLine=49086581;
 //BA.debugLineNum = 49086581;BA.debugLine="Dim amount_ordered As Double = payment.Getdefault";
_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=49086583;
 //BA.debugLineNum = 49086583;BA.debugLine="Dim PaymentID As Int = payment.Getdefault(\"entity";
_paymentid = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("entity_id"),(Object)(0))));
RDebugUtils.currentLine=49086584;
 //BA.debugLineNum = 49086584;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefau";
_base_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_paid"),(Object)(0))));
RDebugUtils.currentLine=49086585;
 //BA.debugLineNum = 49086585;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(\"";
_shipping_amount = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=49086586;
 //BA.debugLineNum = 49086586;BA.debugLine="Dim additional_information As List = payment.Get(";
_additional_information = new anywheresoftware.b4a.objects.collections.List();
_additional_information = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_payment.Get((Object)("additional_information"))));
RDebugUtils.currentLine=49086587;
 //BA.debugLineNum = 49086587;BA.debugLine="For Each coladditional_information As String In a";
if (true) break;

case 33:
//for
this.state = 36;
group91 = _additional_information;
index91 = 0;
groupLen91 = group91.getSize();
this.state = 170;
if (true) break;

case 170:
//C
this.state = 36;
if (index91 < groupLen91) {
this.state = 35;
_coladditional_information = BA.ObjectToString(group91.Get(index91));}
if (true) break;

case 171:
//C
this.state = 170;
index91++;
if (true) break;

case 35:
//C
this.state = 171;
RDebugUtils.currentLine=49086588;
 //BA.debugLineNum = 49086588;BA.debugLine="Log(coladditional_information)";
parent.__c.LogImpl("849086588",_coladditional_information,0);
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=49086590;
 //BA.debugLineNum = 49086590;BA.debugLine="Dim base_shipping_amount As Double = payment.Getd";
_base_shipping_amount = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=49086591;
 //BA.debugLineNum = 49086591;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
_parent_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("parent_id"))));
RDebugUtils.currentLine=49086592;
 //BA.debugLineNum = 49086592;BA.debugLine="Dim base_shipping_captured As Int = payment.Getde";
_base_shipping_captured = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_shipping_captured"),(Object)(0))));
RDebugUtils.currentLine=49086593;
 //BA.debugLineNum = 49086593;BA.debugLine="Dim state As String = root.Get(\"state\")";
_state = BA.ObjectToString(_root.Get((Object)("state")));
RDebugUtils.currentLine=49086595;
 //BA.debugLineNum = 49086595;BA.debugLine="mDatosCabeceraPedidoCliente.EstadoPedido=state";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .EstadoPedido /*String*/  = _state;
RDebugUtils.currentLine=49086597;
 //BA.debugLineNum = 49086597;BA.debugLine="Dim base_shipping_tax_amount As Int = root.Getdef";
_base_shipping_tax_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=49086598;
 //BA.debugLineNum = 49086598;BA.debugLine="Dim base_grand_total As Double = root.Getdefault(";
_base_grand_total = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_grand_total"),(Object)(0))));
RDebugUtils.currentLine=49086599;
 //BA.debugLineNum = 49086599;BA.debugLine="Dim billing_address_id As Int = root.Get(\"billing";
_billing_address_id = (int)(BA.ObjectToNumber(_root.Get((Object)("billing_address_id"))));
RDebugUtils.currentLine=49086602;
 //BA.debugLineNum = 49086602;BA.debugLine="Dim quote_id As Int = root.Getdefault(\"quote_id\",";
_quote_id = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("quote_id"),(Object)(0))));
RDebugUtils.currentLine=49086603;
 //BA.debugLineNum = 49086603;BA.debugLine="Dim shipping_invoiced As Int = root.Getdefault(\"s";
_shipping_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086604;
 //BA.debugLineNum = 49086604;BA.debugLine="Dim discount_tax_compensation_amount As Int = roo";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=49086605;
 //BA.debugLineNum = 49086605;BA.debugLine="Dim weight As Int = root.Getdefault(\"weight\",0)";
_weight = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("weight"),(Object)(0))));
RDebugUtils.currentLine=49086607;
 //BA.debugLineNum = 49086607;BA.debugLine="Dim IDPedido As Int = root.Get(\"entity_id\")";
_idpedido = (int)(BA.ObjectToNumber(_root.Get((Object)("entity_id"))));
RDebugUtils.currentLine=49086609;
 //BA.debugLineNum = 49086609;BA.debugLine="mDatosCabeceraPedidoCliente.IDPedido=IDPedido";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDPedido /*int*/  = _idpedido;
RDebugUtils.currentLine=49086611;
 //BA.debugLineNum = 49086611;BA.debugLine="Dim base_total_invoiced As Double = root.Getdefau";
_base_total_invoiced = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086612;
 //BA.debugLineNum = 49086612;BA.debugLine="Dim base_shipping_amount As Double = root.Getdefa";
_base_shipping_amount = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=49086613;
 //BA.debugLineNum = 49086613;BA.debugLine="Dim base_subtotal_invoiced As Int = root.Getdefau";
_base_subtotal_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_subtotal_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086614;
 //BA.debugLineNum = 49086614;BA.debugLine="Dim applied_rule_ids As String = root.Get(\"applie";
_applied_rule_ids = BA.ObjectToString(_root.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=49086615;
 //BA.debugLineNum = 49086615;BA.debugLine="Dim subtotal_incl_tax As Double = root.Getdefault";
_subtotal_incl_tax = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("subtotal_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086616;
 //BA.debugLineNum = 49086616;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_discount_tax_compensation_amnt"),(Object)(0))));
RDebugUtils.currentLine=49086617;
 //BA.debugLineNum = 49086617;BA.debugLine="Dim subtotal As Double = root.Getdefault(\"subtota";
_subtotal = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("subtotal"),(Object)(0))));
RDebugUtils.currentLine=49086618;
 //BA.debugLineNum = 49086618;BA.debugLine="Dim base_shipping_incl_tax As Int = root.Getdefau";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086621;
 //BA.debugLineNum = 49086621;BA.debugLine="mDatosCabeceraPedidoCliente.EmailComprador=root.G";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .EmailComprador /*String*/  = BA.ObjectToString(_root.Get((Object)("customer_email")));
RDebugUtils.currentLine=49086623;
 //BA.debugLineNum = 49086623;BA.debugLine="Dim base_discount_invoiced As Int = root.Getdefau";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086626;
 //BA.debugLineNum = 49086626;BA.debugLine="mDatosCabeceraPedidoCliente.ImporteTotalFacturado";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .ImporteTotalFacturadoSinIVA /*double*/  = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086628;
 //BA.debugLineNum = 49086628;BA.debugLine="Dim base_to_global_rate As Int = root.Getdefault(";
_base_to_global_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_to_global_rate"),(Object)(0))));
RDebugUtils.currentLine=49086629;
 //BA.debugLineNum = 49086629;BA.debugLine="Dim customer_is_guest As Int = root.Getdefault(\"c";
_customer_is_guest = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_is_guest"),(Object)(0))));
RDebugUtils.currentLine=49086633;
 //BA.debugLineNum = 49086633;BA.debugLine="Dim global_currency_code As String = root.Get(\"gl";
_global_currency_code = BA.ObjectToString(_root.Get((Object)("global_currency_code")));
RDebugUtils.currentLine=49086634;
 //BA.debugLineNum = 49086634;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=49086635;
 //BA.debugLineNum = 49086635;BA.debugLine="Dim is_virtual As Int = root.Getdefault(\"is_virtu";
_is_virtual = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("is_virtual"),(Object)(0))));
RDebugUtils.currentLine=49086636;
 //BA.debugLineNum = 49086636;BA.debugLine="Dim base_total_invoiced_cost As Int = root.Getdef";
_base_total_invoiced_cost = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_invoiced_cost"),(Object)(0))));
RDebugUtils.currentLine=49086637;
 //BA.debugLineNum = 49086637;BA.debugLine="Dim discount_tax_compensation_invoiced As Int = r";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086638;
 //BA.debugLineNum = 49086638;BA.debugLine="Dim status_histories As List = root.Get(\"status_h";
_status_histories = new anywheresoftware.b4a.objects.collections.List();
_status_histories = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("status_histories"))));
RDebugUtils.currentLine=49086639;
 //BA.debugLineNum = 49086639;BA.debugLine="Dim store_currency_code As String = root.Get(\"sto";
_store_currency_code = BA.ObjectToString(_root.Get((Object)("store_currency_code")));
RDebugUtils.currentLine=49086640;
 //BA.debugLineNum = 49086640;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
_created_at = BA.ObjectToString(_root.Get((Object)("created_at")));
RDebugUtils.currentLine=49086642;
 //BA.debugLineNum = 49086642;BA.debugLine="mDatosCabeceraPedidoCliente.FechaCreacion=DateTim";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .FechaCreacion /*long*/  = parent.__c.DateTime.DateParse(_created_at);
RDebugUtils.currentLine=49086644;
 //BA.debugLineNum = 49086644;BA.debugLine="Dim total_item_count As Int = root.Get(\"total_ite";
_total_item_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_item_count"))));
RDebugUtils.currentLine=49086645;
 //BA.debugLineNum = 49086645;BA.debugLine="Dim shipping_tax_amount As Int = root.Getdefault(";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=49086646;
 //BA.debugLineNum = 49086646;BA.debugLine="Dim store_to_base_rate As Int = root.Getdefault(\"";
_store_to_base_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("store_to_base_rate"),(Object)(0))));
RDebugUtils.currentLine=49086647;
 //BA.debugLineNum = 49086647;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
_updated_at = BA.ObjectToString(_root.Get((Object)("updated_at")));
RDebugUtils.currentLine=49086649;
 //BA.debugLineNum = 49086649;BA.debugLine="mDatosCabeceraPedidoCliente.FechaActualizacion=Da";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .FechaActualizacion /*long*/  = parent.__c.DateTime.DateParse(_updated_at);
RDebugUtils.currentLine=49086651;
 //BA.debugLineNum = 49086651;BA.debugLine="Dim base_shipping_discount_amount As Int = root.G";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49086652;
 //BA.debugLineNum = 49086652;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_root.Get((Object)("store_id"))));
RDebugUtils.currentLine=49086653;
 //BA.debugLineNum = 49086653;BA.debugLine="mDatosCabeceraPedidoCliente.IDTienda=store_id";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDTienda /*int*/  = _store_id;
RDebugUtils.currentLine=49086654;
 //BA.debugLineNum = 49086654;BA.debugLine="Dim store_name As String = root.Get(\"store_name\")";
_store_name = BA.ObjectToString(_root.Get((Object)("store_name")));
RDebugUtils.currentLine=49086657;
 //BA.debugLineNum = 49086657;BA.debugLine="mDatosCabeceraPedidoCliente.NombreTienda=Utilidad";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreTienda /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select name from tblB2BStores where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDTienda /*int*/ )}))));
RDebugUtils.currentLine=49086659;
 //BA.debugLineNum = 49086659;BA.debugLine="Dim grand_total As Double = root.Get(\"grand_total";
_grand_total = (double)(BA.ObjectToNumber(_root.Get((Object)("grand_total"))));
RDebugUtils.currentLine=49086660;
 //BA.debugLineNum = 49086660;BA.debugLine="Dim base_currency_code As String = root.Get(\"base";
_base_currency_code = BA.ObjectToString(_root.Get((Object)("base_currency_code")));
RDebugUtils.currentLine=49086662;
 //BA.debugLineNum = 49086662;BA.debugLine="mDatosCabeceraPedidoCliente.Moneda=base_currency_";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .Moneda /*String*/  = _base_currency_code;
RDebugUtils.currentLine=49086664;
 //BA.debugLineNum = 49086664;BA.debugLine="Dim base_total_paid As Double = root.Getdefault(\"";
_base_total_paid = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_paid"),(Object)(0))));
RDebugUtils.currentLine=49086665;
 //BA.debugLineNum = 49086665;BA.debugLine="Dim base_tax_amount As Double = root.Getdefault(\"";
_base_tax_amount = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=49086667;
 //BA.debugLineNum = 49086667;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=49086668;
 //BA.debugLineNum = 49086668;BA.debugLine="Dim total_due As Int = root.Get(\"total_due\")";
_total_due = (int)(BA.ObjectToNumber(_root.Get((Object)("total_due"))));
RDebugUtils.currentLine=49086669;
 //BA.debugLineNum = 49086669;BA.debugLine="Dim total_qty_ordered As Int = root.Getdefault(\"t";
_total_qty_ordered = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("total_qty_ordered"),(Object)(0))));
RDebugUtils.currentLine=49086670;
 //BA.debugLineNum = 49086670;BA.debugLine="Dim base_discount_amount As Int = root.Getdefault";
_base_discount_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49086672;
 //BA.debugLineNum = 49086672;BA.debugLine="Dim carts As List = extension_attributes.Get(\"car";
_carts = new anywheresoftware.b4a.objects.collections.List();
_carts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("carts"))));
RDebugUtils.currentLine=49086673;
 //BA.debugLineNum = 49086673;BA.debugLine="For Each mCart As Map In carts";
if (true) break;

case 37:
//for
this.state = 40;
_mcart = new anywheresoftware.b4a.objects.collections.Map();
group150 = _carts;
index150 = 0;
groupLen150 = group150.getSize();
this.state = 172;
if (true) break;

case 172:
//C
this.state = 40;
if (index150 < groupLen150) {
this.state = 39;
_mcart = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group150.Get(index150)));}
if (true) break;

case 173:
//C
this.state = 172;
index150++;
if (true) break;

case 39:
//C
this.state = 173;
RDebugUtils.currentLine=49086674;
 //BA.debugLineNum = 49086674;BA.debugLine="Log(mCart)";
parent.__c.LogImpl("849086674",BA.ObjectToString(_mcart),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=49086676;
 //BA.debugLineNum = 49086676;BA.debugLine="If extension_attributes.ContainsKey(\"payment_addi";

case 40:
//if
this.state = 47;
if (_extension_attributes.ContainsKey((Object)("payment_additional_info"))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=49086677;
 //BA.debugLineNum = 49086677;BA.debugLine="Dim payment_additional_info As List = extension_";
_payment_additional_info = new anywheresoftware.b4a.objects.collections.List();
_payment_additional_info = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("payment_additional_info"))));
RDebugUtils.currentLine=49086678;
 //BA.debugLineNum = 49086678;BA.debugLine="For Each colpayment_additional_info As Map In pa";
if (true) break;

case 43:
//for
this.state = 46;
_colpayment_additional_info = new anywheresoftware.b4a.objects.collections.Map();
group155 = _payment_additional_info;
index155 = 0;
groupLen155 = group155.getSize();
this.state = 174;
if (true) break;

case 174:
//C
this.state = 46;
if (index155 < groupLen155) {
this.state = 45;
_colpayment_additional_info = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group155.Get(index155)));}
if (true) break;

case 175:
//C
this.state = 174;
index155++;
if (true) break;

case 45:
//C
this.state = 175;
RDebugUtils.currentLine=49086679;
 //BA.debugLineNum = 49086679;BA.debugLine="Dim value As String = colpayment_additional_inf";
_value = BA.ObjectToString(_colpayment_additional_info.Get((Object)("value")));
RDebugUtils.currentLine=49086680;
 //BA.debugLineNum = 49086680;BA.debugLine="Dim key As String = colpayment_additional_info.";
_key = BA.ObjectToString(_colpayment_additional_info.Get((Object)("key")));
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;
;
RDebugUtils.currentLine=49086683;
 //BA.debugLineNum = 49086683;BA.debugLine="If extension_attributes.ContainsKey(\"applied_taxe";

case 47:
//if
this.state = 54;
if (_extension_attributes.ContainsKey((Object)("applied_taxes"))) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=49086684;
 //BA.debugLineNum = 49086684;BA.debugLine="Dim applied_taxes As List = extension_attributes";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=49086685;
 //BA.debugLineNum = 49086685;BA.debugLine="For Each colapplied_taxes As Map In applied_taxe";
if (true) break;

case 50:
//for
this.state = 53;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group162 = _applied_taxes;
index162 = 0;
groupLen162 = group162.getSize();
this.state = 176;
if (true) break;

case 176:
//C
this.state = 53;
if (index162 < groupLen162) {
this.state = 52;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group162.Get(index162)));}
if (true) break;

case 177:
//C
this.state = 176;
index162++;
if (true) break;

case 52:
//C
this.state = 177;
RDebugUtils.currentLine=49086686;
 //BA.debugLineNum = 49086686;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"am";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=49086687;
 //BA.debugLineNum = 49086687;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"code";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=49086688;
 //BA.debugLineNum = 49086688;BA.debugLine="Dim base_amount As Double = colapplied_taxes.Ge";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=49086689;
 //BA.debugLineNum = 49086689;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"tit";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=49086690;
 //BA.debugLineNum = 49086690;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"p";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;
;
RDebugUtils.currentLine=49086693;
 //BA.debugLineNum = 49086693;BA.debugLine="If extension_attributes.ContainsKey(\"item_applied";

case 54:
//if
this.state = 65;
if (_extension_attributes.ContainsKey((Object)("item_applied_taxes"))) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=49086694;
 //BA.debugLineNum = 49086694;BA.debugLine="Dim item_applied_taxes As List = extension_attri";
_item_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_item_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("item_applied_taxes"))));
RDebugUtils.currentLine=49086695;
 //BA.debugLineNum = 49086695;BA.debugLine="For Each colitem_applied_taxes As Map In item_ap";
if (true) break;

case 57:
//for
this.state = 64;
_colitem_applied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group172 = _item_applied_taxes;
index172 = 0;
groupLen172 = group172.getSize();
this.state = 178;
if (true) break;

case 178:
//C
this.state = 64;
if (index172 < groupLen172) {
this.state = 59;
_colitem_applied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group172.Get(index172)));}
if (true) break;

case 179:
//C
this.state = 178;
index172++;
if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=49086696;
 //BA.debugLineNum = 49086696;BA.debugLine="Dim applied_taxes As List = colitem_applied_tax";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitem_applied_taxes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=49086697;
 //BA.debugLineNum = 49086697;BA.debugLine="For Each colapplied_taxes As Map In applied_tax";
if (true) break;

case 60:
//for
this.state = 63;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group174 = _applied_taxes;
index174 = 0;
groupLen174 = group174.getSize();
this.state = 180;
if (true) break;

case 180:
//C
this.state = 63;
if (index174 < groupLen174) {
this.state = 62;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group174.Get(index174)));}
if (true) break;

case 181:
//C
this.state = 180;
index174++;
if (true) break;

case 62:
//C
this.state = 181;
RDebugUtils.currentLine=49086698;
 //BA.debugLineNum = 49086698;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"a";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=49086699;
 //BA.debugLineNum = 49086699;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"cod";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=49086700;
 //BA.debugLineNum = 49086700;BA.debugLine="Dim base_amount As Double = colapplied_taxes.G";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=49086701;
 //BA.debugLineNum = 49086701;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"ti";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=49086702;
 //BA.debugLineNum = 49086702;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 63:
//C
this.state = 179;
;
RDebugUtils.currentLine=49086704;
 //BA.debugLineNum = 49086704;BA.debugLine="Dim TipoImpuestoAplicado As String = colitem_ap";
_tipoimpuestoaplicado = BA.ObjectToString(_colitem_applied_taxes.Get((Object)("type")));
 if (true) break;
if (true) break;

case 64:
//C
this.state = 65;
;
 if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=49086708;
 //BA.debugLineNum = 49086708;BA.debugLine="Dim converting_from_quote As String = extension_a";
_converting_from_quote = BA.ObjectToString(_extension_attributes.Get((Object)("converting_from_quote")));
RDebugUtils.currentLine=49086709;
 //BA.debugLineNum = 49086709;BA.debugLine="Dim contacts As List = extension_attributes.Get(\"";
_contacts = new anywheresoftware.b4a.objects.collections.List();
_contacts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("contacts"))));
RDebugUtils.currentLine=49086710;
 //BA.debugLineNum = 49086710;BA.debugLine="For Each mContacts As Map In contacts";
if (true) break;

case 66:
//for
this.state = 69;
_mcontacts = new anywheresoftware.b4a.objects.collections.Map();
group186 = _contacts;
index186 = 0;
groupLen186 = group186.getSize();
this.state = 182;
if (true) break;

case 182:
//C
this.state = 69;
if (index186 < groupLen186) {
this.state = 68;
_mcontacts = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group186.Get(index186)));}
if (true) break;

case 183:
//C
this.state = 182;
index186++;
if (true) break;

case 68:
//C
this.state = 183;
RDebugUtils.currentLine=49086711;
 //BA.debugLineNum = 49086711;BA.debugLine="Log(mContacts)";
parent.__c.LogImpl("849086711",BA.ObjectToString(_mcontacts),0);
 if (true) break;
if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=49086713;
 //BA.debugLineNum = 49086713;BA.debugLine="Dim shipping_description As String = root.Get(\"sh";
_shipping_description = BA.ObjectToString(_root.Get((Object)("shipping_description")));
RDebugUtils.currentLine=49086714;
 //BA.debugLineNum = 49086714;BA.debugLine="Dim store_to_order_rate As Int = root.Getdefault(";
_store_to_order_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("store_to_order_rate"),(Object)(0))));
RDebugUtils.currentLine=49086715;
 //BA.debugLineNum = 49086715;BA.debugLine="Dim shipping_amount As Int = root.Getdefault(\"shi";
_shipping_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=49086716;
 //BA.debugLineNum = 49086716;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=49086717;
 //BA.debugLineNum = 49086717;BA.debugLine="Dim subtotal_invoiced As Int = root.Getdefault(\"s";
_subtotal_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("subtotal_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086719;
 //BA.debugLineNum = 49086719;BA.debugLine="mDatosCabeceraPedidoCliente.ImporteTotalFacturado";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .ImporteTotalFacturadoSinIVA /*double*/  = _subtotal_invoiced;
RDebugUtils.currentLine=49086721;
 //BA.debugLineNum = 49086721;BA.debugLine="Dim base_to_order_rate As Int = root.Getdefault(\"";
_base_to_order_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_to_order_rate"),(Object)(0))));
RDebugUtils.currentLine=49086722;
 //BA.debugLineNum = 49086722;BA.debugLine="Dim base_subtotal As Int = root.Getdefault(\"base_";
_base_subtotal = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_subtotal"),(Object)(0))));
RDebugUtils.currentLine=49086724;
 //BA.debugLineNum = 49086724;BA.debugLine="mDatosCabeceraPedidoCliente.ImporteTotalSinIVA=ba";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .ImporteTotalSinIVA /*double*/  = _base_subtotal;
RDebugUtils.currentLine=49086726;
 //BA.debugLineNum = 49086726;BA.debugLine="Dim protect_code As String = root.Get(\"protect_co";
_protect_code = BA.ObjectToString(_root.Get((Object)("protect_code")));
RDebugUtils.currentLine=49086727;
 //BA.debugLineNum = 49086727;BA.debugLine="Dim customer_dob As String = root.Get(\"customer_d";
_customer_dob = BA.ObjectToString(_root.Get((Object)("customer_dob")));
RDebugUtils.currentLine=49086728;
 //BA.debugLineNum = 49086728;BA.debugLine="Dim base_total_due As Int = root.Getdefault(\"base";
_base_total_due = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_due"),(Object)(0))));
RDebugUtils.currentLine=49086729;
 //BA.debugLineNum = 49086729;BA.debugLine="Dim base_subtotal_incl_tax As Double = root.Getde";
_base_subtotal_incl_tax = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_subtotal_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086730;
 //BA.debugLineNum = 49086730;BA.debugLine="Dim customer_id As Int = root.Getdefault(\"custome";
_customer_id = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_id"),(Object)(0))));
RDebugUtils.currentLine=49086732;
 //BA.debugLineNum = 49086732;BA.debugLine="mDatosCabeceraPedidoCliente.IDCliente=customer_id";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDCliente /*int*/  = _customer_id;
RDebugUtils.currentLine=49086733;
 //BA.debugLineNum = 49086733;BA.debugLine="mDatosCabeceraPedidoCliente.CodigoClienteERP=Util";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .CodigoClienteERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select Code from tblB2BClientes where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDCliente /*int*/ )}))));
RDebugUtils.currentLine=49086734;
 //BA.debugLineNum = 49086734;BA.debugLine="mDatosCabeceraPedidoCliente.NombreCliente=Utilida";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreCliente /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select Company from tblB2BClientes where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDCliente /*int*/ )}))));
RDebugUtils.currentLine=49086736;
 //BA.debugLineNum = 49086736;BA.debugLine="Dim customer_group_id As Int = root.Getdefault(\"c";
_customer_group_id = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_group_id"),(Object)(0))));
RDebugUtils.currentLine=49086738;
 //BA.debugLineNum = 49086738;BA.debugLine="mDatosCabeceraPedidoCliente.IDGRP=customer_group_";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDGRP /*int*/  = _customer_group_id;
RDebugUtils.currentLine=49086740;
 //BA.debugLineNum = 49086740;BA.debugLine="Dim discount_invoiced As Int = root.Getdefault(\"d";
_discount_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086741;
 //BA.debugLineNum = 49086741;BA.debugLine="Dim order_currency_code As String = root.Get(\"ord";
_order_currency_code = BA.ObjectToString(_root.Get((Object)("order_currency_code")));
RDebugUtils.currentLine=49086743;
 //BA.debugLineNum = 49086743;BA.debugLine="mDatosCabeceraPedidoCliente.Moneda=order_currency";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .Moneda /*String*/  = _order_currency_code;
RDebugUtils.currentLine=49086745;
 //BA.debugLineNum = 49086745;BA.debugLine="Dim base_tax_invoiced As Double = root.Getdefault";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086746;
 //BA.debugLineNum = 49086746;BA.debugLine="Dim customer_gender As Int = root.Getdefault(\"cus";
_customer_gender = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_gender"),(Object)(0))));
RDebugUtils.currentLine=49086747;
 //BA.debugLineNum = 49086747;BA.debugLine="Dim shipping_incl_tax As Int = root.Getdefault(\"s";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086748;
 //BA.debugLineNum = 49086748;BA.debugLine="Dim base_shipping_invoiced As Int = root.Getdefau";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086750;
 //BA.debugLineNum = 49086750;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=49086758;
 //BA.debugLineNum = 49086758;BA.debugLine="Dim LineaPedido As Int";
_lineapedido = 0;
RDebugUtils.currentLine=49086759;
 //BA.debugLineNum = 49086759;BA.debugLine="Dim lstProductosConfigurables As List";
_lstproductosconfigurables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49086760;
 //BA.debugLineNum = 49086760;BA.debugLine="lstProductosConfigurables.Initialize";
_lstproductosconfigurables.Initialize();
RDebugUtils.currentLine=49086762;
 //BA.debugLineNum = 49086762;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 70:
//for
this.state = 132;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group219 = _items;
index219 = 0;
groupLen219 = group219.getSize();
this.state = 184;
if (true) break;

case 184:
//C
this.state = 132;
if (index219 < groupLen219) {
this.state = 72;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group219.Get(index219)));}
if (true) break;

case 185:
//C
this.state = 184;
index219++;
if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=49086764;
 //BA.debugLineNum = 49086764;BA.debugLine="Dim DatosLineaPedidoClienteB2B As TipoDatosLinea";
_datoslineapedidoclienteb2b = new b4j.docU.cb2bfichapedidocliente._tipodatoslineapedidoclienteb2b();
RDebugUtils.currentLine=49086765;
 //BA.debugLineNum = 49086765;BA.debugLine="DatosLineaPedidoClienteB2B.Initialize";
_datoslineapedidoclienteb2b.Initialize();
RDebugUtils.currentLine=49086767;
 //BA.debugLineNum = 49086767;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=49086768;
 //BA.debugLineNum = 49086768;BA.debugLine="DatosLineaPedidoClienteB2B.ItemSKU=sku";
_datoslineapedidoclienteb2b.ItemSKU /*String*/  = _sku;
RDebugUtils.currentLine=49086770;
 //BA.debugLineNum = 49086770;BA.debugLine="Dim product_type As String = colitems.Get(\"produ";
_product_type = BA.ObjectToString(_colitems.Get((Object)("product_type")));
RDebugUtils.currentLine=49086771;
 //BA.debugLineNum = 49086771;BA.debugLine="DatosLineaPedidoClienteB2B.TipoItem=product_type";
_datoslineapedidoclienteb2b.TipoItem /*String*/  = _product_type;
RDebugUtils.currentLine=49086784;
 //BA.debugLineNum = 49086784;BA.debugLine="If DatosLineaPedidoClienteB2B.TipoItem=\"configur";
if (true) break;

case 73:
//if
this.state = 78;
if ((_datoslineapedidoclienteb2b.TipoItem /*String*/ ).equals("configurable")) { 
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
RDebugUtils.currentLine=49086789;
 //BA.debugLineNum = 49086789;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(\"";
_tax_amount = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_amount"),(Object)(0))));
RDebugUtils.currentLine=49086790;
 //BA.debugLineNum = 49086790;BA.debugLine="DatosLineaPedidoClienteB2B.ImporteIVA=tax_amount";
_datoslineapedidoclienteb2b.ImporteIVA /*double*/  = _tax_amount;
RDebugUtils.currentLine=49086791;
 //BA.debugLineNum = 49086791;BA.debugLine="Dim tax_invoiced As Double = colitems.Getdefault";
_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086792;
 //BA.debugLineNum = 49086792;BA.debugLine="Dim original_price As Double = colitems.Getdefau";
_original_price = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("original_price"),(Object)(0))));
RDebugUtils.currentLine=49086793;
 //BA.debugLineNum = 49086793;BA.debugLine="Dim free_shipping As Int = colitems.Getdefault(\"";
_free_shipping = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("free_shipping"),(Object)(0))));
RDebugUtils.currentLine=49086794;
 //BA.debugLineNum = 49086794;BA.debugLine="Dim base_discount_tax_compensation_invoiced As I";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086795;
 //BA.debugLineNum = 49086795;BA.debugLine="Dim discount_amount As Double = colitems.Getdefa";
_discount_amount = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49086796;
 //BA.debugLineNum = 49086796;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault(";
_tax_percent = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_percent"),(Object)(0))));
RDebugUtils.currentLine=49086797;
 //BA.debugLineNum = 49086797;BA.debugLine="DatosLineaPedidoClienteB2B.TipoIVA=tax_percent";
_datoslineapedidoclienteb2b.TipoIVA /*double*/  = _tax_percent;
RDebugUtils.currentLine=49086798;
 //BA.debugLineNum = 49086798;BA.debugLine="Dim price_incl_tax As Double = colitems.Getdefau";
_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("price_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086799;
 //BA.debugLineNum = 49086799;BA.debugLine="Dim price As Double = colitems.Getdefault(\"price";
_price = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("price"),(Object)(0))));
RDebugUtils.currentLine=49086800;
 //BA.debugLineNum = 49086800;BA.debugLine="DatosLineaPedidoClienteB2B.Precio=price";
_datoslineapedidoclienteb2b.Precio /*double*/  = _price;
RDebugUtils.currentLine=49086801;
 //BA.debugLineNum = 49086801;BA.debugLine="Dim product_id As Int = colitems.Get(\"product_id";
_product_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("product_id"))));
RDebugUtils.currentLine=49086802;
 //BA.debugLineNum = 49086802;BA.debugLine="DatosLineaPedidoClienteB2B.IDProductoB2B=product";
_datoslineapedidoclienteb2b.IDProductoB2B /*int*/  = _product_id;
RDebugUtils.currentLine=49086803;
 //BA.debugLineNum = 49086803;BA.debugLine="Dim base_row_total As Double = colitems.Getdefau";
_base_row_total = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_row_total"),(Object)(0))));
RDebugUtils.currentLine=49086805;
 //BA.debugLineNum = 49086805;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=49086806;
 //BA.debugLineNum = 49086806;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("weight"))));
RDebugUtils.currentLine=49086807;
 //BA.debugLineNum = 49086807;BA.debugLine="Dim base_original_price As Int = colitems.Getdef";
_base_original_price = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_original_price"),(Object)(0))));
RDebugUtils.currentLine=49086808;
 //BA.debugLineNum = 49086808;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weight";
_row_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_weight"))));
RDebugUtils.currentLine=49086809;
 //BA.debugLineNum = 49086809;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=49086810;
 //BA.debugLineNum = 49086810;BA.debugLine="Dim base_amount_refunded As Int = colitems.Getde";
_base_amount_refunded = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_amount_refunded"),(Object)(0))));
RDebugUtils.currentLine=49086811;
 //BA.debugLineNum = 49086811;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Get";
_base_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_price_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086812;
 //BA.debugLineNum = 49086812;BA.debugLine="Dim no_discount As Int = colitems.Getdefault(\"no";
_no_discount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("no_discount"),(Object)(0))));
RDebugUtils.currentLine=49086813;
 //BA.debugLineNum = 49086813;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=49086814;
 //BA.debugLineNum = 49086814;BA.debugLine="DatosLineaPedidoClienteB2B.DescripcionProductoB2";
_datoslineapedidoclienteb2b.DescripcionProductoB2B /*String*/  = _name;
RDebugUtils.currentLine=49086815;
 //BA.debugLineNum = 49086815;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086816;
 //BA.debugLineNum = 49086816;BA.debugLine="Dim discount_percent As Int = colitems.Getdefaul";
_discount_percent = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_percent"),(Object)(0))));
RDebugUtils.currentLine=49086817;
 //BA.debugLineNum = 49086817;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
_order_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("order_id"))));
RDebugUtils.currentLine=49086818;
 //BA.debugLineNum = 49086818;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086819;
 //BA.debugLineNum = 49086819;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=49086820;
 //BA.debugLineNum = 49086820;BA.debugLine="Dim qty_shipped As Int = colitems.Getdefault(\"qt";
_qty_shipped = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("qty_shipped"),(Object)(0))));
RDebugUtils.currentLine=49086821;
 //BA.debugLineNum = 49086821;BA.debugLine="DatosLineaPedidoClienteB2B.QtyEnviada=qty_shippe";
_datoslineapedidoclienteb2b.QtyEnviada /*int*/  = _qty_shipped;
RDebugUtils.currentLine=49086822;
 //BA.debugLineNum = 49086822;BA.debugLine="Dim qty_ordered As Int = colitems.Getdefault(\"qt";
_qty_ordered = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("qty_ordered"),(Object)(0))));
RDebugUtils.currentLine=49086823;
 //BA.debugLineNum = 49086823;BA.debugLine="DatosLineaPedidoClienteB2B.QtyPedida=qty_ordered";
_datoslineapedidoclienteb2b.QtyPedida /*int*/  = _qty_ordered;
RDebugUtils.currentLine=49086824;
 //BA.debugLineNum = 49086824;BA.debugLine="Dim row_total As Int = colitems.Getdefault(\"row_";
_row_total = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("row_total"),(Object)(0))));
RDebugUtils.currentLine=49086825;
 //BA.debugLineNum = 49086825;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_canc";
_qty_canceled = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_canceled"))));
RDebugUtils.currentLine=49086826;
 //BA.debugLineNum = 49086826;BA.debugLine="Dim Talla As String";
_talla = "";
RDebugUtils.currentLine=49086827;
 //BA.debugLineNum = 49086827;BA.debugLine="Dim product_option As Map = IIf(colitems.Get(\"pr";
_product_option = new anywheresoftware.b4a.objects.collections.Map();
_product_option = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(((_colitems.Get((Object)("product_option"))== null) ? ((Object)(parent.__c.createMap(new Object[] {(Object)(""),(Object)("")}).getObject())) : (_colitems.Get((Object)("product_option"))))));
RDebugUtils.currentLine=49086828;
 //BA.debugLineNum = 49086828;BA.debugLine="Dim ItemProductOptionExtension_attributes As Map";
_itemproductoptionextension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_itemproductoptionextension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_product_option.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49086829;
 //BA.debugLineNum = 49086829;BA.debugLine="If ItemProductOptionExtension_attributes.IsIniti";
if (true) break;

case 79:
//if
this.state = 90;
if (_itemproductoptionextension_attributes.IsInitialized()) { 
this.state = 81;
}if (true) break;

case 81:
//C
this.state = 82;
RDebugUtils.currentLine=49086830;
 //BA.debugLineNum = 49086830;BA.debugLine="Dim configurable_item_options As List = ItemPro";
_configurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_configurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_itemproductoptionextension_attributes.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=49086832;
 //BA.debugLineNum = 49086832;BA.debugLine="For Each colconfigurable_item_options As Map In";
if (true) break;

case 82:
//for
this.state = 89;
_colconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group268 = _configurable_item_options;
index268 = 0;
groupLen268 = group268.getSize();
this.state = 186;
if (true) break;

case 186:
//C
this.state = 89;
if (index268 < groupLen268) {
this.state = 84;
_colconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group268.Get(index268)));}
if (true) break;

case 187:
//C
this.state = 186;
index268++;
if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=49086833;
 //BA.debugLineNum = 49086833;BA.debugLine="Dim option_value As Int = colconfigurable_item";
_option_value = (int)(BA.ObjectToNumber(_colconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=49086834;
 //BA.debugLineNum = 49086834;BA.debugLine="Dim option_id As String = colconfigurable_item";
_option_id = BA.ObjectToString(_colconfigurable_item_options.Get((Object)("option_id")));
RDebugUtils.currentLine=49086835;
 //BA.debugLineNum = 49086835;BA.debugLine="If option_id=142 Then";
if (true) break;

case 85:
//if
this.state = 88;
if ((_option_id).equals(BA.NumberToString(142))) { 
this.state = 87;
}if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=49086836;
 //BA.debugLineNum = 49086836;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select lab";
_talla = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_option_value)}));
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
;
 if (true) break;

case 90:
//C
this.state = 91;
;
RDebugUtils.currentLine=49086840;
 //BA.debugLineNum = 49086840;BA.debugLine="Dim ItemExtensionAttributes As Map=colitems.Get(";
_itemextensionattributes = new anywheresoftware.b4a.objects.collections.Map();
_itemextensionattributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49086841;
 //BA.debugLineNum = 49086841;BA.debugLine="If ItemExtensionAttributes.IsInitialized Then";
if (true) break;

case 91:
//if
this.state = 98;
if (_itemextensionattributes.IsInitialized()) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=49086842;
 //BA.debugLineNum = 49086842;BA.debugLine="Dim ItemPgw As Map=ItemExtensionAttributes.Get(";
_itempgw = new anywheresoftware.b4a.objects.collections.Map();
_itempgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemextensionattributes.Get((Object)("pgw"))));
RDebugUtils.currentLine=49086843;
 //BA.debugLineNum = 49086843;BA.debugLine="If ItemPgw.IsInitialized Then";
if (true) break;

case 94:
//if
this.state = 97;
if (_itempgw.IsInitialized()) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=49086844;
 //BA.debugLineNum = 49086844;BA.debugLine="Log(ItemPgw)";
parent.__c.LogImpl("849086844",BA.ObjectToString(_itempgw),0);
RDebugUtils.currentLine=49086845;
 //BA.debugLineNum = 49086845;BA.debugLine="DatosLineaPedidoClienteB2B.UNSPSC=ItemPgw.Get(";
_datoslineapedidoclienteb2b.UNSPSC /*String*/  = BA.ObjectToString(_itempgw.Get((Object)("unspsc")));
RDebugUtils.currentLine=49086846;
 //BA.debugLineNum = 49086846;BA.debugLine="DatosLineaPedidoClienteB2B.UOMB2B=ItemPgw.Get(";
_datoslineapedidoclienteb2b.UOMB2B /*String*/  = BA.ObjectToString(_itempgw.Get((Object)("uom")));
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;
;
RDebugUtils.currentLine=49086849;
 //BA.debugLineNum = 49086849;BA.debugLine="If DatosLineaPedidoClienteB2B.UNSPSC=\"\" Then";

case 98:
//if
this.state = 101;
if ((_datoslineapedidoclienteb2b.UNSPSC /*String*/ ).equals("")) { 
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
RDebugUtils.currentLine=49086852;
 //BA.debugLineNum = 49086852;BA.debugLine="DatosLineaPedidoClienteB2B.TallaB2B=Talla";
_datoslineapedidoclienteb2b.TallaB2B /*String*/  = _talla;
RDebugUtils.currentLine=49086853;
 //BA.debugLineNum = 49086853;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amoun";
_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("amount_refunded"))));
RDebugUtils.currentLine=49086854;
 //BA.debugLineNum = 49086854;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=49086855;
 //BA.debugLineNum = 49086855;BA.debugLine="Dim base_price As Double = colitems.Get(\"base_pr";
_base_price = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_price"))));
RDebugUtils.currentLine=49086856;
 //BA.debugLineNum = 49086856;BA.debugLine="Dim qty_invoiced As Int = colitems.Getdefault(\"q";
_qty_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("qty_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086857;
 //BA.debugLineNum = 49086857;BA.debugLine="Dim row_invoiced As Int = colitems.Getdefault(\"r";
_row_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("row_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086858;
 //BA.debugLineNum = 49086858;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get(";
_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("row_total_incl_tax"))));
RDebugUtils.currentLine=49086859;
 //BA.debugLineNum = 49086859;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=49086860;
 //BA.debugLineNum = 49086860;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"store";
_store_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_id"),(Object)(0))));
RDebugUtils.currentLine=49086862;
 //BA.debugLineNum = 49086862;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
_item_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("item_id"))));
RDebugUtils.currentLine=49086863;
 //BA.debugLineNum = 49086863;BA.debugLine="DatosLineaPedidoClienteB2B.IDLinea=item_id";
_datoslineapedidoclienteb2b.IDLinea /*int*/  = _item_id;
RDebugUtils.currentLine=49086864;
 //BA.debugLineNum = 49086864;BA.debugLine="LineaPedido=LineaPedido+1";
_lineapedido = (int) (_lineapedido+1);
RDebugUtils.currentLine=49086865;
 //BA.debugLineNum = 49086865;BA.debugLine="DatosLineaPedidoClienteB2B.LineaPedido=LineaPedi";
_datoslineapedidoclienteb2b.LineaPedido /*int*/  = _lineapedido;
RDebugUtils.currentLine=49086866;
 //BA.debugLineNum = 49086866;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=49086867;
 //BA.debugLineNum = 49086867;BA.debugLine="Dim base_row_total_incl_tax As Double = colitems";
_base_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total_incl_tax"))));
RDebugUtils.currentLine=49086868;
 //BA.debugLineNum = 49086868;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=49086870;
 //BA.debugLineNum = 49086870;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_refu";
_qty_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_refunded"))));
RDebugUtils.currentLine=49086871;
 //BA.debugLineNum = 49086871;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"bas";
_base_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_invoiced"))));
RDebugUtils.currentLine=49086872;
 //BA.debugLineNum = 49086872;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault(";
_is_qty_decimal = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("is_qty_decimal"),(Object)(0))));
RDebugUtils.currentLine=49086873;
 //BA.debugLineNum = 49086873;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086874;
 //BA.debugLineNum = 49086874;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Getde";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086876;
 //BA.debugLineNum = 49086876;BA.debugLine="Dim IDParentItem As Int= colitems.Getdefault(\"pa";
_idparentitem = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("parent_item_id"),(Object)(-1))));
RDebugUtils.currentLine=49086879;
 //BA.debugLineNum = 49086879;BA.debugLine="Dim mParent_item As Map=colitems.Get(\"parent_ite";
_mparent_item = new anywheresoftware.b4a.objects.collections.Map();
_mparent_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("parent_item"))));
RDebugUtils.currentLine=49086887;
 //BA.debugLineNum = 49086887;BA.debugLine="If mParent_item.IsInitialized Then";
if (true) break;

case 102:
//if
this.state = 131;
if (_mparent_item.IsInitialized()) { 
this.state = 104;
}else {
this.state = 130;
}if (true) break;

case 104:
//C
this.state = 105;
RDebugUtils.currentLine=49086888;
 //BA.debugLineNum = 49086888;BA.debugLine="Log(\"parent_item: \" & mParent_item)";
parent.__c.LogImpl("849086888","parent_item: "+BA.ObjectToString(_mparent_item),0);
RDebugUtils.currentLine=49086889;
 //BA.debugLineNum = 49086889;BA.debugLine="DatosLineaPedidoClienteB2B.TipoItem=\"SimpleConP";
_datoslineapedidoclienteb2b.TipoItem /*String*/  = "SimpleConPadre";
RDebugUtils.currentLine=49086890;
 //BA.debugLineNum = 49086890;BA.debugLine="DatosLineaPedidoClienteB2B.Precio=mParent_item.";
_datoslineapedidoclienteb2b.Precio /*double*/  = (double)(BA.ObjectToNumber(_mparent_item.Get((Object)("price"))));
RDebugUtils.currentLine=49086891;
 //BA.debugLineNum = 49086891;BA.debugLine="DatosLineaPedidoClienteB2B.QtyEnviada=mParent_i";
_datoslineapedidoclienteb2b.QtyEnviada /*int*/  = (int)(BA.ObjectToNumber(_mparent_item.Get((Object)("qty_shipped"))));
RDebugUtils.currentLine=49086892;
 //BA.debugLineNum = 49086892;BA.debugLine="DatosLineaPedidoClienteB2B.QtyFacturada=mParent";
_datoslineapedidoclienteb2b.QtyFacturada /*int*/  = (int)(BA.ObjectToNumber(_mparent_item.Get((Object)("qty_invoiced"))));
RDebugUtils.currentLine=49086894;
 //BA.debugLineNum = 49086894;BA.debugLine="Dim mProductOptionParentItem As Map=mParent_ite";
_mproductoptionparentitem = new anywheresoftware.b4a.objects.collections.Map();
_mproductoptionparentitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparent_item.Get((Object)("product_option"))));
RDebugUtils.currentLine=49086895;
 //BA.debugLineNum = 49086895;BA.debugLine="If mProductOptionParentItem.IsInitialized Then";
if (true) break;

case 105:
//if
this.state = 120;
if (_mproductoptionparentitem.IsInitialized()) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
RDebugUtils.currentLine=49086896;
 //BA.debugLineNum = 49086896;BA.debugLine="Dim mExtensionAttributesProductOptionParentIte";
_mextensionattributesproductoptionparentitem = new anywheresoftware.b4a.objects.collections.Map();
_mextensionattributesproductoptionparentitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mproductoptionparentitem.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49086897;
 //BA.debugLineNum = 49086897;BA.debugLine="If mExtensionAttributesProductOptionParentItem";
if (true) break;

case 108:
//if
this.state = 119;
if (_mextensionattributesproductoptionparentitem.IsInitialized()) { 
this.state = 110;
}if (true) break;

case 110:
//C
this.state = 111;
RDebugUtils.currentLine=49086898;
 //BA.debugLineNum = 49086898;BA.debugLine="Dim configurable_item_options As List =mExten";
_configurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_configurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mextensionattributesproductoptionparentitem.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=49086899;
 //BA.debugLineNum = 49086899;BA.debugLine="For Each mDataConfigurable_item_options As Ma";
if (true) break;

case 111:
//for
this.state = 118;
_mdataconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group321 = _configurable_item_options;
index321 = 0;
groupLen321 = group321.getSize();
this.state = 188;
if (true) break;

case 188:
//C
this.state = 118;
if (index321 < groupLen321) {
this.state = 113;
_mdataconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group321.Get(index321)));}
if (true) break;

case 189:
//C
this.state = 188;
index321++;
if (true) break;

case 113:
//C
this.state = 114;
RDebugUtils.currentLine=49086900;
 //BA.debugLineNum = 49086900;BA.debugLine="Dim option_value As Int = mDataConfigurable_";
_option_value = (int)(BA.ObjectToNumber(_mdataconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=49086901;
 //BA.debugLineNum = 49086901;BA.debugLine="Dim option_id As String = mDataConfigurable_";
_option_id = BA.ObjectToString(_mdataconfigurable_item_options.Get((Object)("option_id")));
RDebugUtils.currentLine=49086902;
 //BA.debugLineNum = 49086902;BA.debugLine="If option_id=142 Then";
if (true) break;

case 114:
//if
this.state = 117;
if ((_option_id).equals(BA.NumberToString(142))) { 
this.state = 116;
}if (true) break;

case 116:
//C
this.state = 117;
RDebugUtils.currentLine=49086903;
 //BA.debugLineNum = 49086903;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select l";
_talla = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_option_value)}));
RDebugUtils.currentLine=49086904;
 //BA.debugLineNum = 49086904;BA.debugLine="DatosLineaPedidoClienteB2B.TallaB2B=Talla";
_datoslineapedidoclienteb2b.TallaB2B /*String*/  = _talla;
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
RDebugUtils.currentLine=49086909;
 //BA.debugLineNum = 49086909;BA.debugLine="Dim mExtensionAttributesParentItem As Map=mPare";
_mextensionattributesparentitem = new anywheresoftware.b4a.objects.collections.Map();
_mextensionattributesparentitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparent_item.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49086910;
 //BA.debugLineNum = 49086910;BA.debugLine="If mExtensionAttributesParentItem.IsInitialized";
if (true) break;

case 121:
//if
this.state = 128;
if (_mextensionattributesparentitem.IsInitialized()) { 
this.state = 123;
}if (true) break;

case 123:
//C
this.state = 124;
RDebugUtils.currentLine=49086911;
 //BA.debugLineNum = 49086911;BA.debugLine="Dim mPgwExtensionAttributesParentItem As Map=m";
_mpgwextensionattributesparentitem = new anywheresoftware.b4a.objects.collections.Map();
_mpgwextensionattributesparentitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mextensionattributesparentitem.Get((Object)("pgw"))));
RDebugUtils.currentLine=49086912;
 //BA.debugLineNum = 49086912;BA.debugLine="If mPgwExtensionAttributesParentItem.IsInitial";
if (true) break;

case 124:
//if
this.state = 127;
if (_mpgwextensionattributesparentitem.IsInitialized()) { 
this.state = 126;
}if (true) break;

case 126:
//C
this.state = 127;
RDebugUtils.currentLine=49086914;
 //BA.debugLineNum = 49086914;BA.debugLine="DatosLineaPedidoClienteB2B.UNSPSC=mPgwExtensi";
_datoslineapedidoclienteb2b.UNSPSC /*String*/  = BA.ObjectToString(_mpgwextensionattributesparentitem.Get((Object)("unspsc")));
RDebugUtils.currentLine=49086915;
 //BA.debugLineNum = 49086915;BA.debugLine="DatosLineaPedidoClienteB2B.UOMB2B=mPgwExtensi";
_datoslineapedidoclienteb2b.UOMB2B /*String*/  = BA.ObjectToString(_mpgwextensionattributesparentitem.Get((Object)("uom")));
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
RDebugUtils.currentLine=49086918;
 //BA.debugLineNum = 49086918;BA.debugLine="Dim PartesSKU() As String=Regex.Split(\"_\",Datos";
_partessku = parent.__c.Regex.Split("_",_datoslineapedidoclienteb2b.ItemSKU /*String*/ );
RDebugUtils.currentLine=49086919;
 //BA.debugLineNum = 49086919;BA.debugLine="DatosLineaPedidoClienteB2B.ItemParentSKU=Partes";
_datoslineapedidoclienteb2b.ItemParentSKU /*String*/  = _partessku[(int) (0)];
 if (true) break;

case 130:
//C
this.state = 131;
RDebugUtils.currentLine=49086921;
 //BA.debugLineNum = 49086921;BA.debugLine="DatosLineaPedidoClienteB2B.TipoItem=\"SimpleSinP";
_datoslineapedidoclienteb2b.TipoItem /*String*/  = "SimpleSinPadre";
 if (true) break;

case 131:
//C
this.state = 185;
;
RDebugUtils.currentLine=49086925;
 //BA.debugLineNum = 49086925;BA.debugLine="DatosLineaPedidoClienteB2B.CodigoArticuloNAV=IIf";
_datoslineapedidoclienteb2b.CodigoArticuloNAV /*String*/  = BA.ObjectToString((((_datoslineapedidoclienteb2b.TipoItem /*String*/ ).equals("SimpleSinPadre")) ? ((Object)(_datoslineapedidoclienteb2b.ItemSKU /*String*/ )) : ((Object)(_datoslineapedidoclienteb2b.ItemParentSKU /*String*/ ))));
RDebugUtils.currentLine=49086927;
 //BA.debugLineNum = 49086927;BA.debugLine="Log($\"DatosLineaPedidoClienteB2B: ${DatosLineaPe";
parent.__c.LogImpl("849086927",("DatosLineaPedidoClienteB2B: "+parent.__c.SmartStringFormatter("",(Object)(_datoslineapedidoclienteb2b))+""),0);
RDebugUtils.currentLine=49086929;
 //BA.debugLineNum = 49086929;BA.debugLine="Dim sSQL As String=$\"insert into tblB2BLineasPed";
_ssql = ("insert into tblB2BLineasPedidoCliente (\n"+"		IDLinea, LineaPedido, IDProductoB2B, TipoItem , \n"+"		ItemSKU , UNSPSC , \n"+"		DescripcionProductoB2B , TallaB2B , \n"+"		QtyPedida , QtyEnviada , QtyFacturada , Precio , UOMB2B , \n"+"		TipoIVA , ImporteIVA , ItemParentSKU, CodigoArticuloNAV\n"+"		) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
RDebugUtils.currentLine=49086936;
 //BA.debugLineNum = 49086936;BA.debugLine="mSQL.ExecNonQuery2(sSQL,Array As Object(DatosLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(_ssql,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedidoclienteb2b.IDLinea /*int*/ ),(Object)(_datoslineapedidoclienteb2b.LineaPedido /*int*/ ),(Object)(_datoslineapedidoclienteb2b.IDProductoB2B /*int*/ ),(Object)(_datoslineapedidoclienteb2b.TipoItem /*String*/ ),(Object)(_datoslineapedidoclienteb2b.ItemSKU /*String*/ ),(Object)(_datoslineapedidoclienteb2b.UNSPSC /*String*/ ),(Object)(_datoslineapedidoclienteb2b.DescripcionProductoB2B /*String*/ ),(Object)(_datoslineapedidoclienteb2b.TallaB2B /*String*/ ),(Object)(_datoslineapedidoclienteb2b.QtyPedida /*int*/ ),(Object)(_datoslineapedidoclienteb2b.QtyEnviada /*int*/ ),(Object)(_datoslineapedidoclienteb2b.QtyFacturada /*int*/ ),(Object)(_datoslineapedidoclienteb2b.Precio /*double*/ ),(Object)(_datoslineapedidoclienteb2b.UOMB2B /*String*/ ),(Object)(_datoslineapedidoclienteb2b.TipoIVA /*double*/ ),(Object)(_datoslineapedidoclienteb2b.ImporteIVA /*double*/ ),(Object)(_datoslineapedidoclienteb2b.ItemParentSKU /*String*/ ),(Object)(_datoslineapedidoclienteb2b.CodigoArticuloNAV /*String*/ )}));
 if (true) break;
if (true) break;

case 132:
//C
this.state = 133;
;
RDebugUtils.currentLine=49086945;
 //BA.debugLineNum = 49086945;BA.debugLine="Dim shipping_assignments As List = extension_attr";
_shipping_assignments = new anywheresoftware.b4a.objects.collections.List();
_shipping_assignments = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("shipping_assignments"))));
RDebugUtils.currentLine=49086946;
 //BA.debugLineNum = 49086946;BA.debugLine="For Each colshipping_assignments As Map In shippi";
if (true) break;

case 133:
//for
this.state = 166;
_colshipping_assignments = new anywheresoftware.b4a.objects.collections.Map();
group350 = _shipping_assignments;
index350 = 0;
groupLen350 = group350.getSize();
this.state = 190;
if (true) break;

case 190:
//C
this.state = 166;
if (index350 < groupLen350) {
this.state = 135;
_colshipping_assignments = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group350.Get(index350)));}
if (true) break;

case 191:
//C
this.state = 190;
index350++;
if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=49086947;
 //BA.debugLineNum = 49086947;BA.debugLine="Dim shipping As Map = colshipping_assignments.Ge";
_shipping = new anywheresoftware.b4a.objects.collections.Map();
_shipping = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colshipping_assignments.Get((Object)("shipping"))));
RDebugUtils.currentLine=49086948;
 //BA.debugLineNum = 49086948;BA.debugLine="Log(\"shipping\" & shipping)";
parent.__c.LogImpl("849086948","shipping"+BA.ObjectToString(_shipping),0);
RDebugUtils.currentLine=49086949;
 //BA.debugLineNum = 49086949;BA.debugLine="Dim total As Map = shipping.Get(\"total\")";
_total = new anywheresoftware.b4a.objects.collections.Map();
_total = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_shipping.Get((Object)("total"))));
RDebugUtils.currentLine=49086950;
 //BA.debugLineNum = 49086950;BA.debugLine="Dim shipping_amount As Int = total.Get(\"shipping";
_shipping_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_amount"))));
RDebugUtils.currentLine=49086951;
 //BA.debugLineNum = 49086951;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=49086952;
 //BA.debugLineNum = 49086952;BA.debugLine="Dim shipping_discount_amount As Int = total.Getd";
_shipping_discount_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49086953;
 //BA.debugLineNum = 49086953;BA.debugLine="Dim base_shipping_discount_amount As Int = total";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49086954;
 //BA.debugLineNum = 49086954;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_discount_tax_compensation_amnt"),(Object)(0))));
RDebugUtils.currentLine=49086955;
 //BA.debugLineNum = 49086955;BA.debugLine="Dim base_shipping_incl_tax As Int = total.Getdef";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086956;
 //BA.debugLineNum = 49086956;BA.debugLine="Dim shipping_invoiced As Int = total.Getdefault(";
_shipping_invoiced = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086957;
 //BA.debugLineNum = 49086957;BA.debugLine="Dim shipping_incl_tax As Int = total.Getdefault(";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=49086958;
 //BA.debugLineNum = 49086958;BA.debugLine="Dim base_shipping_invoiced As Int = total.Getdef";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=49086959;
 //BA.debugLineNum = 49086959;BA.debugLine="Dim base_shipping_tax_amount As Int = total.Getd";
_base_shipping_tax_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=49086960;
 //BA.debugLineNum = 49086960;BA.debugLine="Dim shipping_tax_amount As Int = total.Getdefaul";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=49086961;
 //BA.debugLineNum = 49086961;BA.debugLine="Dim address As Map = shipping.Get(\"address\")";
_address = new anywheresoftware.b4a.objects.collections.Map();
_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_shipping.Get((Object)("address"))));
RDebugUtils.currentLine=49086962;
 //BA.debugLineNum = 49086962;BA.debugLine="Dim firstname As String = address.Get(\"firstname";
_firstname = BA.ObjectToString(_address.Get((Object)("firstname")));
RDebugUtils.currentLine=49086963;
 //BA.debugLineNum = 49086963;BA.debugLine="Dim address_type As String = address.Get(\"addres";
_address_type = BA.ObjectToString(_address.Get((Object)("address_type")));
RDebugUtils.currentLine=49086964;
 //BA.debugLineNum = 49086964;BA.debugLine="Dim shipping_customer_address_id As Int = addres";
_shipping_customer_address_id = (int)(BA.ObjectToNumber(_address.GetDefault((Object)("customer_address_id"),(Object)(0))));
RDebugUtils.currentLine=49086965;
 //BA.debugLineNum = 49086965;BA.debugLine="If mDatosCabeceraPedidoCliente.PedidoPunchout Th";
if (true) break;

case 136:
//if
this.state = 141;
if (__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .PedidoPunchout /*boolean*/ ) { 
this.state = 138;
}else {
this.state = 140;
}if (true) break;

case 138:
//C
this.state = 141;
RDebugUtils.currentLine=49086966;
 //BA.debugLineNum = 49086966;BA.debugLine="Dim IDDireccionEnvio As Int = address.Get(\"enti";
_iddireccionenvio = (int)(BA.ObjectToNumber(_address.Get((Object)("entity_id"))));
 if (true) break;

case 140:
//C
this.state = 141;
RDebugUtils.currentLine=49086968;
 //BA.debugLineNum = 49086968;BA.debugLine="Dim IDDireccionEnvio As Int = shipping_customer";
_iddireccionenvio = _shipping_customer_address_id;
 if (true) break;

case 141:
//C
this.state = 142;
;
RDebugUtils.currentLine=49086972;
 //BA.debugLineNum = 49086972;BA.debugLine="mDatosCabeceraPedidoCliente.IDDireccionEnvio=IDD";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDDireccionEnvio /*int*/  = _iddireccionenvio;
RDebugUtils.currentLine=49086974;
 //BA.debugLineNum = 49086974;BA.debugLine="Dim company As String=address.Get(\"company\")";
_company = BA.ObjectToString(_address.Get((Object)("company")));
RDebugUtils.currentLine=49086976;
 //BA.debugLineNum = 49086976;BA.debugLine="mDatosCabeceraPedidoCliente.NombreDireccionEnvio";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .NombreDireccionEnvio /*String*/  = _company;
RDebugUtils.currentLine=49086978;
 //BA.debugLineNum = 49086978;BA.debugLine="Dim city As String = address.Get(\"city\")";
_city = BA.ObjectToString(_address.Get((Object)("city")));
RDebugUtils.currentLine=49086979;
 //BA.debugLineNum = 49086979;BA.debugLine="Dim postcode As String = address.Get(\"postcode\")";
_postcode = BA.ObjectToString(_address.Get((Object)("postcode")));
RDebugUtils.currentLine=49086980;
 //BA.debugLineNum = 49086980;BA.debugLine="Dim region_id As Int = address.Getdefault(\"regio";
_region_id = (int)(BA.ObjectToNumber(_address.GetDefault((Object)("region_id"),(Object)(0))));
RDebugUtils.currentLine=49086981;
 //BA.debugLineNum = 49086981;BA.debugLine="Dim telephone As String = address.Get(\"telephone";
_telephone = BA.ObjectToString(_address.Get((Object)("telephone")));
RDebugUtils.currentLine=49086985;
 //BA.debugLineNum = 49086985;BA.debugLine="Dim lastname As String = address.Get(\"lastname\")";
_lastname = BA.ObjectToString(_address.Get((Object)("lastname")));
RDebugUtils.currentLine=49086986;
 //BA.debugLineNum = 49086986;BA.debugLine="Dim parent_id As Int = address.Getdefault(\"paren";
_parent_id = (int)(BA.ObjectToNumber(_address.GetDefault((Object)("parent_id"),(Object)(0))));
RDebugUtils.currentLine=49086987;
 //BA.debugLineNum = 49086987;BA.debugLine="Dim DireccionEnvio As String";
_direccionenvio = "";
RDebugUtils.currentLine=49086988;
 //BA.debugLineNum = 49086988;BA.debugLine="Dim street As List = address.Get(\"street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_address.Get((Object)("street"))));
RDebugUtils.currentLine=49086989;
 //BA.debugLineNum = 49086989;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 142:
//for
this.state = 145;
group385 = _street;
index385 = 0;
groupLen385 = group385.getSize();
this.state = 192;
if (true) break;

case 192:
//C
this.state = 145;
if (index385 < groupLen385) {
this.state = 144;
_colstreet = BA.ObjectToString(group385.Get(index385));}
if (true) break;

case 193:
//C
this.state = 192;
index385++;
if (true) break;

case 144:
//C
this.state = 193;
RDebugUtils.currentLine=49086990;
 //BA.debugLineNum = 49086990;BA.debugLine="DireccionEnvio=DireccionEnvio & \" \" & colstreet";
_direccionenvio = _direccionenvio+" "+_colstreet;
 if (true) break;
if (true) break;

case 145:
//C
this.state = 146;
;
RDebugUtils.currentLine=49086992;
 //BA.debugLineNum = 49086992;BA.debugLine="Dim region As String = address.Get(\"region\")";
_region = BA.ObjectToString(_address.Get((Object)("region")));
RDebugUtils.currentLine=49086993;
 //BA.debugLineNum = 49086993;BA.debugLine="Dim country_id As String = address.Get(\"country_";
_country_id = BA.ObjectToString(_address.Get((Object)("country_id")));
RDebugUtils.currentLine=49086994;
 //BA.debugLineNum = 49086994;BA.debugLine="Dim email As String = address.Get(\"email\")";
_email = BA.ObjectToString(_address.Get((Object)("email")));
RDebugUtils.currentLine=49086995;
 //BA.debugLineNum = 49086995;BA.debugLine="Dim region_code As String = address.Get(\"region_";
_region_code = BA.ObjectToString(_address.Get((Object)("region_code")));
RDebugUtils.currentLine=49086997;
 //BA.debugLineNum = 49086997;BA.debugLine="mDatosCabeceraPedidoCliente.DireccionEnvio=$\"${m";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .DireccionEnvio /*String*/  = (""+parent.__c.SmartStringFormatter("",(Object)(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .DireccionEnvio /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(_postcode))+" "+parent.__c.SmartStringFormatter("",(Object)(_city))+" "+parent.__c.SmartStringFormatter("",(Object)(_region))+" "+parent.__c.SmartStringFormatter("",(Object)(_country_id))+"");
RDebugUtils.currentLine=49086999;
 //BA.debugLineNum = 49086999;BA.debugLine="Dim method As String = shipping.Get(\"method\")";
_method = BA.ObjectToString(_shipping.Get((Object)("method")));
RDebugUtils.currentLine=49087000;
 //BA.debugLineNum = 49087000;BA.debugLine="Dim AddressExtensionAttributes As Map=address.Ge";
_addressextensionattributes = new anywheresoftware.b4a.objects.collections.Map();
_addressextensionattributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_address.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49087001;
 //BA.debugLineNum = 49087001;BA.debugLine="If AddressExtensionAttributes.IsInitialized Then";
if (true) break;

case 146:
//if
this.state = 149;
if (_addressextensionattributes.IsInitialized()) { 
this.state = 148;
}if (true) break;

case 148:
//C
this.state = 149;
RDebugUtils.currentLine=49087002;
 //BA.debugLineNum = 49087002;BA.debugLine="Dim AddressPgW As Map=AddressExtensionAttribute";
_addresspgw = new anywheresoftware.b4a.objects.collections.Map();
_addresspgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_addressextensionattributes.Get((Object)("pgw"))));
 if (true) break;

case 149:
//C
this.state = 150;
;
RDebugUtils.currentLine=49087005;
 //BA.debugLineNum = 49087005;BA.debugLine="Dim ItemsShipping_Assignments As List = colshipp";
_itemsshipping_assignments = new anywheresoftware.b4a.objects.collections.List();
_itemsshipping_assignments = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colshipping_assignments.Get((Object)("items"))));
RDebugUtils.currentLine=49087006;
 //BA.debugLineNum = 49087006;BA.debugLine="For Each colItemsShipping_Assignments As Map In";
if (true) break;

case 150:
//for
this.state = 165;
_colitemsshipping_assignments = new anywheresoftware.b4a.objects.collections.Map();
group399 = _itemsshipping_assignments;
index399 = 0;
groupLen399 = group399.getSize();
this.state = 194;
if (true) break;

case 194:
//C
this.state = 165;
if (index399 < groupLen399) {
this.state = 152;
_colitemsshipping_assignments = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group399.Get(index399)));}
if (true) break;

case 195:
//C
this.state = 194;
index399++;
if (true) break;

case 152:
//C
this.state = 153;
RDebugUtils.currentLine=49087007;
 //BA.debugLineNum = 49087007;BA.debugLine="Log(\"colItemsShipping_Assignments\" & colItemsSh";
parent.__c.LogImpl("849087007","colItemsShipping_Assignments"+BA.ObjectToString(_colitemsshipping_assignments),0);
RDebugUtils.currentLine=49087010;
 //BA.debugLineNum = 49087010;BA.debugLine="Dim original_price As Double = colItemsShipping";
_original_price = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("original_price"))));
RDebugUtils.currentLine=49087011;
 //BA.debugLineNum = 49087011;BA.debugLine="Dim free_shipping As Int = colItemsShipping_Ass";
_free_shipping = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("free_shipping"))));
RDebugUtils.currentLine=49087012;
 //BA.debugLineNum = 49087012;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=49087013;
 //BA.debugLineNum = 49087013;BA.debugLine="Dim discount_amount As Double = colItemsShippin";
_discount_amount = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("discount_amount"),(Object)(0))));
RDebugUtils.currentLine=49087014;
 //BA.debugLineNum = 49087014;BA.debugLine="Dim tax_percent As Double = colItemsShipping_As";
_tax_percent = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("tax_percent"),(Object)(-1))));
RDebugUtils.currentLine=49087015;
 //BA.debugLineNum = 49087015;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
_price_incl_tax = parent._utilidades._fixnulldouble /*double*/ (_colitemsshipping_assignments.GetDefault((Object)("price_incl_tax"),(Object)(0)));
RDebugUtils.currentLine=49087016;
 //BA.debugLineNum = 49087016;BA.debugLine="Dim price As Double = colItemsShipping_Assignme";
_price = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("price"))));
RDebugUtils.currentLine=49087017;
 //BA.debugLineNum = 49087017;BA.debugLine="Dim product_id As Int = colItemsShipping_Assign";
_product_id = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("product_id"))));
RDebugUtils.currentLine=49087018;
 //BA.debugLineNum = 49087018;BA.debugLine="Dim base_row_total As Double = colItemsShipping";
_base_row_total = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_row_total"))));
RDebugUtils.currentLine=49087019;
 //BA.debugLineNum = 49087019;BA.debugLine="Dim sku As String = colItemsShipping_Assignment";
_sku = BA.ObjectToString(_colitemsshipping_assignments.Get((Object)("sku")));
RDebugUtils.currentLine=49087020;
 //BA.debugLineNum = 49087020;BA.debugLine="Dim discount_tax_compensation_amount As Int = c";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=49087021;
 //BA.debugLineNum = 49087021;BA.debugLine="Dim weight As Int = colItemsShipping_Assignment";
_weight = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("weight"))));
RDebugUtils.currentLine=49087022;
 //BA.debugLineNum = 49087022;BA.debugLine="Dim base_original_price As Int = colItemsShippi";
_base_original_price = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("base_original_price"),(Object)(-1))));
RDebugUtils.currentLine=49087023;
 //BA.debugLineNum = 49087023;BA.debugLine="Dim row_weight As Int = colItemsShipping_Assign";
_row_weight = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("row_weight"))));
RDebugUtils.currentLine=49087024;
 //BA.debugLineNum = 49087024;BA.debugLine="Dim applied_rule_ids As String = colItemsShippi";
_applied_rule_ids = BA.ObjectToString(_colitemsshipping_assignments.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=49087025;
 //BA.debugLineNum = 49087025;BA.debugLine="Dim base_amount_refunded As Int = colItemsShipp";
_base_amount_refunded = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_amount_refunded"))));
RDebugUtils.currentLine=49087026;
 //BA.debugLineNum = 49087026;BA.debugLine="Dim base_price_incl_tax As Double = colItemsShi";
_base_price_incl_tax = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("base_price_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=49087027;
 //BA.debugLineNum = 49087027;BA.debugLine="Dim no_discount As Int = colItemsShipping_Assig";
_no_discount = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("no_discount"))));
RDebugUtils.currentLine=49087028;
 //BA.debugLineNum = 49087028;BA.debugLine="Dim name As String = colItemsShipping_Assignmen";
_name = BA.ObjectToString(_colitemsshipping_assignments.Get((Object)("name")));
RDebugUtils.currentLine=49087029;
 //BA.debugLineNum = 49087029;BA.debugLine="Dim base_discount_invoiced As Int = colItemsShi";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_discount_invoiced"))));
RDebugUtils.currentLine=49087030;
 //BA.debugLineNum = 49087030;BA.debugLine="Dim discount_percent As Int = colItemsShipping_";
_discount_percent = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("discount_percent"),(Object)(-1))));
RDebugUtils.currentLine=49087031;
 //BA.debugLineNum = 49087031;BA.debugLine="Dim order_id As Int = colItemsShipping_Assignme";
_order_id = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("order_id"))));
RDebugUtils.currentLine=49087032;
 //BA.debugLineNum = 49087032;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=49087033;
 //BA.debugLineNum = 49087033;BA.debugLine="Dim created_at As String = colItemsShipping_Ass";
_created_at = BA.ObjectToString(_colitemsshipping_assignments.Get((Object)("created_at")));
RDebugUtils.currentLine=49087034;
 //BA.debugLineNum = 49087034;BA.debugLine="Dim qty_shipped As Int = colItemsShipping_Assig";
_qty_shipped = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("qty_shipped"))));
RDebugUtils.currentLine=49087035;
 //BA.debugLineNum = 49087035;BA.debugLine="Dim qty_ordered As Int = colItemsShipping_Assig";
_qty_ordered = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("qty_ordered"))));
RDebugUtils.currentLine=49087036;
 //BA.debugLineNum = 49087036;BA.debugLine="Dim row_total As Int = colItemsShipping_Assignm";
_row_total = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("row_total"))));
RDebugUtils.currentLine=49087037;
 //BA.debugLineNum = 49087037;BA.debugLine="Dim qty_canceled As Int = colItemsShipping_Assi";
_qty_canceled = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("qty_canceled"))));
RDebugUtils.currentLine=49087038;
 //BA.debugLineNum = 49087038;BA.debugLine="Dim ItemsShipping_AssignmentsProduct_option As";
_itemsshipping_assignmentsproduct_option = new anywheresoftware.b4a.objects.collections.Map();
_itemsshipping_assignmentsproduct_option = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(((_colitemsshipping_assignments.Get((Object)("product_option"))== null) ? ((Object)(parent.__c.createMap(new Object[] {(Object)(""),(Object)("")}).getObject())) : (_colitemsshipping_assignments.Get((Object)("product_option"))))));
RDebugUtils.currentLine=49087039;
 //BA.debugLineNum = 49087039;BA.debugLine="Dim ItemsShipping_AssignmentsProduct_optionExte";
_itemsshipping_assignmentsproduct_optionextension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_itemsshipping_assignmentsproduct_optionextension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_itemsshipping_assignmentsproduct_option.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49087040;
 //BA.debugLineNum = 49087040;BA.debugLine="Dim TallaLineaAlbaran As String";
_tallalineaalbaran = "";
RDebugUtils.currentLine=49087041;
 //BA.debugLineNum = 49087041;BA.debugLine="If ItemsShipping_AssignmentsProduct_optionExten";
if (true) break;

case 153:
//if
this.state = 164;
if (_itemsshipping_assignmentsproduct_optionextension_attributes.IsInitialized()) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=49087042;
 //BA.debugLineNum = 49087042;BA.debugLine="Dim ItemsShipping_AssignmentsProduct_optionExt";
_itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_itemsshipping_assignmentsproduct_optionextension_attributes.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=49087043;
 //BA.debugLineNum = 49087043;BA.debugLine="For Each ItemsShippingcolconfigurable_item_opt";
if (true) break;

case 156:
//for
this.state = 163;
_itemsshippingcolconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group434 = _itemsshipping_assignmentsproduct_optionextension_attributesconfigurable_item_options;
index434 = 0;
groupLen434 = group434.getSize();
this.state = 196;
if (true) break;

case 196:
//C
this.state = 163;
if (index434 < groupLen434) {
this.state = 158;
_itemsshippingcolconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group434.Get(index434)));}
if (true) break;

case 197:
//C
this.state = 196;
index434++;
if (true) break;

case 158:
//C
this.state = 159;
RDebugUtils.currentLine=49087044;
 //BA.debugLineNum = 49087044;BA.debugLine="Dim option_value As Int = ItemsShippingcolcon";
_option_value = (int)(BA.ObjectToNumber(_itemsshippingcolconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=49087045;
 //BA.debugLineNum = 49087045;BA.debugLine="Dim option_id As String = ItemsShippingcolcon";
_option_id = BA.ObjectToString(_itemsshippingcolconfigurable_item_options.Get((Object)("option_id")));
RDebugUtils.currentLine=49087046;
 //BA.debugLineNum = 49087046;BA.debugLine="If option_id=142 Then";
if (true) break;

case 159:
//if
this.state = 162;
if ((_option_id).equals(BA.NumberToString(142))) { 
this.state = 161;
}if (true) break;

case 161:
//C
this.state = 162;
RDebugUtils.currentLine=49087047;
 //BA.debugLineNum = 49087047;BA.debugLine="TallaLineaAlbaran=mSQL.ExecQuerySingleResult";
_tallalineaalbaran = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_option_value)}));
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
;
 if (true) break;

case 164:
//C
this.state = 195;
;
RDebugUtils.currentLine=49087051;
 //BA.debugLineNum = 49087051;BA.debugLine="Dim amount_refunded As Int = colItemsShipping_A";
_amount_refunded = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("amount_refunded"))));
RDebugUtils.currentLine=49087052;
 //BA.debugLineNum = 49087052;BA.debugLine="Dim updated_at As String = colItemsShipping_Ass";
_updated_at = BA.ObjectToString(_colitemsshipping_assignments.Get((Object)("updated_at")));
RDebugUtils.currentLine=49087053;
 //BA.debugLineNum = 49087053;BA.debugLine="Dim base_price As Double = colItemsShipping_Ass";
_base_price = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_price"))));
RDebugUtils.currentLine=49087054;
 //BA.debugLineNum = 49087054;BA.debugLine="Dim qty_invoiced As Int = colItemsShipping_Assi";
_qty_invoiced = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("qty_invoiced"))));
RDebugUtils.currentLine=49087055;
 //BA.debugLineNum = 49087055;BA.debugLine="Dim row_invoiced As Int = colItemsShipping_Assi";
_row_invoiced = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("row_invoiced"))));
RDebugUtils.currentLine=49087056;
 //BA.debugLineNum = 49087056;BA.debugLine="Dim row_total_incl_tax As Double = colItemsShip";
_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("row_total_incl_tax"))));
RDebugUtils.currentLine=49087057;
 //BA.debugLineNum = 49087057;BA.debugLine="Dim base_tax_amount As Double = colItemsShippin";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=49087059;
 //BA.debugLineNum = 49087059;BA.debugLine="Dim item_id As Int = colItemsShipping_Assignmen";
_item_id = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("item_id"))));
RDebugUtils.currentLine=49087060;
 //BA.debugLineNum = 49087060;BA.debugLine="Dim base_discount_amount As Int = colItemsShipp";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=49087061;
 //BA.debugLineNum = 49087061;BA.debugLine="Dim base_row_total_incl_tax As Double = colItem";
_base_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_row_total_incl_tax"))));
RDebugUtils.currentLine=49087062;
 //BA.debugLineNum = 49087062;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=49087063;
 //BA.debugLineNum = 49087063;BA.debugLine="Dim product_type As String = colItemsShipping_A";
_product_type = BA.ObjectToString(_colitemsshipping_assignments.Get((Object)("product_type")));
RDebugUtils.currentLine=49087064;
 //BA.debugLineNum = 49087064;BA.debugLine="Dim qty_refunded As Int = colItemsShipping_Assi";
_qty_refunded = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("qty_refunded"))));
RDebugUtils.currentLine=49087065;
 //BA.debugLineNum = 49087065;BA.debugLine="Dim base_row_invoiced As Int = colItemsShipping";
_base_row_invoiced = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_row_invoiced"))));
RDebugUtils.currentLine=49087066;
 //BA.debugLineNum = 49087066;BA.debugLine="Dim is_qty_decimal As Int = colItemsShipping_As";
_is_qty_decimal = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.GetDefault((Object)("is_qty_decimal"),(Object)(-1))));
RDebugUtils.currentLine=49087067;
 //BA.debugLineNum = 49087067;BA.debugLine="Dim discount_invoiced As Int = colItemsShipping";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("discount_invoiced"))));
RDebugUtils.currentLine=49087068;
 //BA.debugLineNum = 49087068;BA.debugLine="Dim base_tax_invoiced As Double = colItemsShipp";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitemsshipping_assignments.Get((Object)("base_tax_invoiced"))));
 if (true) break;
if (true) break;

case 165:
//C
this.state = 191;
;
 if (true) break;
if (true) break;

case 166:
//C
this.state = -1;
;
RDebugUtils.currentLine=49087075;
 //BA.debugLineNum = 49087075;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=49087077;
 //BA.debugLineNum = 49087077;BA.debugLine="mSQL.ExecNonQuery($\"update tblB2BLineasPedidoClie";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("update tblB2BLineasPedidoCliente set QtyPteEnviar=QtyPedida-QtyEnviada"));
RDebugUtils.currentLine=49087078;
 //BA.debugLineNum = 49087078;BA.debugLine="mSQL.ExecNonQuery($\"update tblB2BLineasPedidoClie";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("update tblB2BLineasPedidoCliente set QtyEnviadaPteFacturar=QtyEnviada-QtyFacturada"));
RDebugUtils.currentLine=49087081;
 //BA.debugLineNum = 49087081;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=49087082;
 //BA.debugLineNum = 49087082;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacionpedidocliente(b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idsel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacionpedidocliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacionpedidocliente", new Object[] {_token,_idsel}));}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(this,__ref,_token,_idsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idsel = _idsel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _token;
int _idsel;
String _squeryapi = "";
b4j.docU.httpjob _job = null;
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49020931;
 //BA.debugLineNum = 49020931;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-web";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/orders/"+parent.__c.SmartStringFormatter("",(Object)(_idsel))+"");
RDebugUtils.currentLine=49020939;
 //BA.debugLineNum = 49020939;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=49020940;
 //BA.debugLineNum = 49020940;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=49020942;
 //BA.debugLineNum = 49020942;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=49020944;
 //BA.debugLineNum = 49020944;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=49020945;
 //BA.debugLineNum = 49020945;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=49020947;
 //BA.debugLineNum = 49020947;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=49020949;
 //BA.debugLineNum = 49020949;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacionpedidocliente"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=49020951;
 //BA.debugLineNum = 49020951;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=49020952;
 //BA.debugLineNum = 49020952;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("849020952","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=49020953;
 //BA.debugLineNum = 49020953;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("849020953",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=49020954;
 //BA.debugLineNum = 49020954;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=49020955;
 //BA.debugLineNum = 49020955;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49020956;
 //BA.debugLineNum = 49020956;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=49020959;
 //BA.debugLineNum = 49020959;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=49020960;
 //BA.debugLineNum = 49020960;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49020961;
 //BA.debugLineNum = 49020961;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=49020963;
 //BA.debugLineNum = 49020963;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatospedidoclientesearch(b4j.docU.cb2bfichapedidocliente __ref,int _idpedidosel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "cargadatospedidoclientesearch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatospedidoclientesearch", new Object[] {_idpedidosel}));}
ResumableSub_CargaDatosPedidoClienteSearch rsub = new ResumableSub_CargaDatosPedidoClienteSearch(this,__ref,_idpedidosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosPedidoClienteSearch extends BA.ResumableSub {
public ResumableSub_CargaDatosPedidoClienteSearch(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,int _idpedidosel) {
this.parent = parent;
this.__ref = __ref;
this._idpedidosel = _idpedidosel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
int _idpedidosel;
String _sresp = "";
anywheresoftware.b4a.objects.collections.Map _mdatapedido = null;
String _dateformatant = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
anywheresoftware.b4a.objects.collections.List _lstitems = null;
anywheresoftware.b4a.objects.collections.Map _mdataitem = null;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BLineasPedido";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BLineasPedidoCliente");
RDebugUtils.currentLine=49610757;
 //BA.debugLineNum = 49610757;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidoCli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "cargadatospedidoclientesearch"), __ref._enviodatosapimagentoinformacionpedidoclientesearch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mtk /*String*/ ,_idpedidosel));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=49610758;
 //BA.debugLineNum = 49610758;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
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
RDebugUtils.currentLine=49610761;
 //BA.debugLineNum = 49610761;BA.debugLine="Dim mDataPedido As Map";
_mdatapedido = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49610762;
 //BA.debugLineNum = 49610762;BA.debugLine="mDataPedido.Initialize";
_mdatapedido.Initialize();
RDebugUtils.currentLine=49610767;
 //BA.debugLineNum = 49610767;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=49610768;
 //BA.debugLineNum = 49610768;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=49610770;
 //BA.debugLineNum = 49610770;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=49610771;
 //BA.debugLineNum = 49610771;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=49610772;
 //BA.debugLineNum = 49610772;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=49610773;
 //BA.debugLineNum = 49610773;BA.debugLine="Dim lstItems As List=root.Get(\"items\")";
_lstitems = new anywheresoftware.b4a.objects.collections.List();
_lstitems = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=49610774;
 //BA.debugLineNum = 49610774;BA.debugLine="For Each mDataItem As Map In lstItems";
if (true) break;

case 7:
//for
this.state = 10;
_mdataitem = new anywheresoftware.b4a.objects.collections.Map();
group12 = _lstitems;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 10;
if (index12 < groupLen12) {
this.state = 9;
_mdataitem = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group12.Get(index12)));}
if (true) break;

case 13:
//C
this.state = 12;
index12++;
if (true) break;

case 9:
//C
this.state = 13;
RDebugUtils.currentLine=49610775;
 //BA.debugLineNum = 49610775;BA.debugLine="Log(mDataItem)";
parent.__c.LogImpl("849610775",BA.ObjectToString(_mdataitem),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=49610778;
 //BA.debugLineNum = 49610778;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=49610780;
 //BA.debugLineNum = 49610780;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacionpedidoclientesearch(b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idsel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacionpedidoclientesearch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacionpedidoclientesearch", new Object[] {_token,_idsel}));}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch(this,__ref,_token,_idsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearch(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idsel = _idsel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _token;
int _idsel;
String _squeryapi = "";
b4j.docU.httpjob _job = null;
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49676291;
 //BA.debugLineNum = 49676291;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?\n"+"	searchCriteria[filterGroups][0][filters][0][field]=entity_id&\n"+"	searchCriteria[filterGroups][0][filters][0][value]="+parent.__c.SmartStringFormatter("",(Object)(_idsel))+"&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=eq");
RDebugUtils.currentLine=49676297;
 //BA.debugLineNum = 49676297;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=49676298;
 //BA.debugLineNum = 49676298;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=49676300;
 //BA.debugLineNum = 49676300;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=49676302;
 //BA.debugLineNum = 49676302;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=49676303;
 //BA.debugLineNum = 49676303;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=49676305;
 //BA.debugLineNum = 49676305;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=49676307;
 //BA.debugLineNum = 49676307;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacionpedidoclientesearch"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=49676309;
 //BA.debugLineNum = 49676309;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=49676310;
 //BA.debugLineNum = 49676310;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("849676310","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=49676311;
 //BA.debugLineNum = 49676311;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("849676311",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=49676312;
 //BA.debugLineNum = 49676312;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=49676313;
 //BA.debugLineNum = 49676313;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49676314;
 //BA.debugLineNum = 49676314;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=49676317;
 //BA.debugLineNum = 49676317;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=49676318;
 //BA.debugLineNum = 49676318;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49676319;
 //BA.debugLineNum = 49676319;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=49676321;
 //BA.debugLineNum = 49676321;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargainfodireccionesclientemagento(b4j.docU.cb2bfichapedidocliente __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "cargainfodireccionesclientemagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargainfodireccionesclientemagento", new Object[] {_idclientesel}));}
ResumableSub_CargaInfoDireccionesClienteMagento rsub = new ResumableSub_CargaInfoDireccionesClienteMagento(this,__ref,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaInfoDireccionesClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaInfoDireccionesClienteMagento(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
int _idclientesel;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _store_id = 0;
String _firstname = "";
anywheresoftware.b4a.objects.collections.List _addresses = null;
String _created_at = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
String _is_subscribed = "";
String _lastname = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
String _code = "";
String _customer_code = "";
anywheresoftware.b4a.objects.collections.Map _colcustom_attributes = null;
String _value = "";
String _attribute_code = "";
String _updated_at = "";
int _disable_auto_group_change = 0;
int _group_id = 0;
int _id = 0;
int _website_id = 0;
String _email = "";
String _created_in = "";
anywheresoftware.b4a.objects.collections.Map _maddress = null;
anywheresoftware.b4a.objects.collections.List _lstaddresscustomattributes = null;
anywheresoftware.b4a.objects.collections.Map _maddresscustomattributes = null;
anywheresoftware.b4a.objects.collections.List _street = null;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
anywheresoftware.b4a.BA.IterableList group32;
int index32;
int groupLen32;
anywheresoftware.b4a.BA.IterableList group36;
int index36;
int groupLen36;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49938440;
 //BA.debugLineNum = 49938440;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BDireccionesCliente");
RDebugUtils.currentLine=49938442;
 //BA.debugLineNum = 49938442;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCliente(m";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "cargainfodireccionesclientemagento"), __ref._enviodatosapimagentoinformacioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mtk /*String*/ ,_idclientesel));
this.state = 43;
return;
case 43:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=49938443;
 //BA.debugLineNum = 49938443;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
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
RDebugUtils.currentLine=49938445;
 //BA.debugLineNum = 49938445;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=49938446;
 //BA.debugLineNum = 49938446;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=49938447;
 //BA.debugLineNum = 49938447;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=49938451;
 //BA.debugLineNum = 49938451;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_root.Get((Object)("store_id"))));
RDebugUtils.currentLine=49938452;
 //BA.debugLineNum = 49938452;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
_firstname = BA.ObjectToString(_root.Get((Object)("firstname")));
RDebugUtils.currentLine=49938453;
 //BA.debugLineNum = 49938453;BA.debugLine="Dim addresses As List = root.Get(\"addresses\")";
_addresses = new anywheresoftware.b4a.objects.collections.List();
_addresses = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("addresses"))));
RDebugUtils.currentLine=49938454;
 //BA.debugLineNum = 49938454;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
_created_at = BA.ObjectToString(_root.Get((Object)("created_at")));
RDebugUtils.currentLine=49938455;
 //BA.debugLineNum = 49938455;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=49938456;
 //BA.debugLineNum = 49938456;BA.debugLine="Dim is_subscribed As String = extension_attribute";
_is_subscribed = BA.ObjectToString(_extension_attributes.Get((Object)("is_subscribed")));
RDebugUtils.currentLine=49938457;
 //BA.debugLineNum = 49938457;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
_lastname = BA.ObjectToString(_root.Get((Object)("lastname")));
RDebugUtils.currentLine=49938458;
 //BA.debugLineNum = 49938458;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=49938459;
 //BA.debugLineNum = 49938459;BA.debugLine="Dim code As String";
_code = "";
RDebugUtils.currentLine=49938460;
 //BA.debugLineNum = 49938460;BA.debugLine="Dim customer_code As String";
_customer_code = "";
RDebugUtils.currentLine=49938461;
 //BA.debugLineNum = 49938461;BA.debugLine="If custom_attributes.IsInitialized Then";
if (true) break;

case 7:
//if
this.state = 26;
if (_custom_attributes.IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=49938462;
 //BA.debugLineNum = 49938462;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
if (true) break;

case 10:
//for
this.state = 25;
_colcustom_attributes = new anywheresoftware.b4a.objects.collections.Map();
group18 = _custom_attributes;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 44;
if (true) break;

case 44:
//C
this.state = 25;
if (index18 < groupLen18) {
this.state = 12;
_colcustom_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group18.Get(index18)));}
if (true) break;

case 45:
//C
this.state = 44;
index18++;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=49938463;
 //BA.debugLineNum = 49938463;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
_value = BA.ObjectToString(_colcustom_attributes.Get((Object)("value")));
RDebugUtils.currentLine=49938464;
 //BA.debugLineNum = 49938464;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
_attribute_code = BA.ObjectToString(_colcustom_attributes.Get((Object)("attribute_code")));
RDebugUtils.currentLine=49938465;
 //BA.debugLineNum = 49938465;BA.debugLine="If attribute_code=\"code\" Then code=value";
if (true) break;

case 13:
//if
this.state = 18;
if ((_attribute_code).equals("code")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_code = _value;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=49938466;
 //BA.debugLineNum = 49938466;BA.debugLine="If attribute_code=\"customer_code\" Then customer";
if (true) break;

case 19:
//if
this.state = 24;
if ((_attribute_code).equals("customer_code")) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_customer_code = _value;
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
;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=49938470;
 //BA.debugLineNum = 49938470;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
_updated_at = BA.ObjectToString(_root.Get((Object)("updated_at")));
RDebugUtils.currentLine=49938471;
 //BA.debugLineNum = 49938471;BA.debugLine="Dim disable_auto_group_change As Int = root.Get(\"";
_disable_auto_group_change = (int)(BA.ObjectToNumber(_root.Get((Object)("disable_auto_group_change"))));
RDebugUtils.currentLine=49938472;
 //BA.debugLineNum = 49938472;BA.debugLine="Dim group_id As Int = root.Get(\"group_id\")";
_group_id = (int)(BA.ObjectToNumber(_root.Get((Object)("group_id"))));
RDebugUtils.currentLine=49938473;
 //BA.debugLineNum = 49938473;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=49938474;
 //BA.debugLineNum = 49938474;BA.debugLine="Dim website_id As Int = root.Get(\"website_id\")";
_website_id = (int)(BA.ObjectToNumber(_root.Get((Object)("website_id"))));
RDebugUtils.currentLine=49938475;
 //BA.debugLineNum = 49938475;BA.debugLine="Dim email As String = root.Get(\"email\")";
_email = BA.ObjectToString(_root.Get((Object)("email")));
RDebugUtils.currentLine=49938476;
 //BA.debugLineNum = 49938476;BA.debugLine="Dim created_in As String = root.Get(\"created_in\")";
_created_in = BA.ObjectToString(_root.Get((Object)("created_in")));
RDebugUtils.currentLine=49938477;
 //BA.debugLineNum = 49938477;BA.debugLine="For Each mAddress As Map In addresses";
if (true) break;

case 27:
//for
this.state = 42;
_maddress = new anywheresoftware.b4a.objects.collections.Map();
group32 = _addresses;
index32 = 0;
groupLen32 = group32.getSize();
this.state = 46;
if (true) break;

case 46:
//C
this.state = 42;
if (index32 < groupLen32) {
this.state = 29;
_maddress = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group32.Get(index32)));}
if (true) break;

case 47:
//C
this.state = 46;
index32++;
if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=49938478;
 //BA.debugLineNum = 49938478;BA.debugLine="Log(\"Address: \" & mAddress)";
parent.__c.LogImpl("849938478","Address: "+BA.ObjectToString(_maddress),0);
RDebugUtils.currentLine=49938479;
 //BA.debugLineNum = 49938479;BA.debugLine="Dim lstAddressCustomAttributes As List=mAddress.";
_lstaddresscustomattributes = new anywheresoftware.b4a.objects.collections.List();
_lstaddresscustomattributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_maddress.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=49938480;
 //BA.debugLineNum = 49938480;BA.debugLine="If lstAddressCustomAttributes.IsInitialized Then";
if (true) break;

case 30:
//if
this.state = 41;
if (_lstaddresscustomattributes.IsInitialized()) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=49938481;
 //BA.debugLineNum = 49938481;BA.debugLine="For Each mAddressCustomAttributes As Map In lst";
if (true) break;

case 33:
//for
this.state = 40;
_maddresscustomattributes = new anywheresoftware.b4a.objects.collections.Map();
group36 = _lstaddresscustomattributes;
index36 = 0;
groupLen36 = group36.getSize();
this.state = 48;
if (true) break;

case 48:
//C
this.state = 40;
if (index36 < groupLen36) {
this.state = 35;
_maddresscustomattributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group36.Get(index36)));}
if (true) break;

case 49:
//C
this.state = 48;
index36++;
if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=49938482;
 //BA.debugLineNum = 49938482;BA.debugLine="Log(mAddressCustomAttributes)";
parent.__c.LogImpl("849938482",BA.ObjectToString(_maddresscustomattributes),0);
RDebugUtils.currentLine=49938483;
 //BA.debugLineNum = 49938483;BA.debugLine="If mAddressCustomAttributes.Get(\"attribute_cod";
if (true) break;

case 36:
//if
this.state = 39;
if ((_maddresscustomattributes.Get((Object)("attribute_code"))).equals((Object)("code"))) { 
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
;
 if (true) break;

case 41:
//C
this.state = 47;
;
RDebugUtils.currentLine=49938488;
 //BA.debugLineNum = 49938488;BA.debugLine="Dim Street As List=mAddress.Get(\"Street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_maddress.Get((Object)("Street"))));
RDebugUtils.currentLine=49938497;
 //BA.debugLineNum = 49938497;BA.debugLine="mAddress.Put(\"code\",code)";
_maddress.Put((Object)("code"),(Object)(_code));
RDebugUtils.currentLine=49938498;
 //BA.debugLineNum = 49938498;BA.debugLine="mAddress.Put(\"customer_code\",customer_code)";
_maddress.Put((Object)("customer_code"),(Object)(_customer_code));
RDebugUtils.currentLine=49938507;
 //BA.debugLineNum = 49938507;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BDireccionesCliente",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_maddress.getObject())}));
 if (true) break;
if (true) break;

case 42:
//C
this.state = -1;
;
RDebugUtils.currentLine=49938510;
 //BA.debugLineNum = 49938510;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=49938511;
 //BA.debugLineNum = 49938511;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacioncliente(b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idcliente) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacioncliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacioncliente", new Object[] {_token,_idcliente}));}
ResumableSub_EnvioDatosAPIMagentoInformacionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionCliente(this,__ref,_token,_idcliente);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionCliente(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idcliente) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idcliente = _idcliente;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _token;
int _idcliente;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=50003971;
 //BA.debugLineNum = 50003971;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=50003973;
 //BA.debugLineNum = 50003973;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"+parent.__c.SmartStringFormatter("",(Object)(_idcliente))+"");
RDebugUtils.currentLine=50003975;
 //BA.debugLineNum = 50003975;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=50003977;
 //BA.debugLineNum = 50003977;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=50003978;
 //BA.debugLineNum = 50003978;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=50003980;
 //BA.debugLineNum = 50003980;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=50003982;
 //BA.debugLineNum = 50003982;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacioncliente"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=50003984;
 //BA.debugLineNum = 50003984;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=50003985;
 //BA.debugLineNum = 50003985;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("850003985","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=50003986;
 //BA.debugLineNum = 50003986;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("850003986",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=50003987;
 //BA.debugLineNum = 50003987;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=50003988;
 //BA.debugLineNum = 50003988;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=50003989;
 //BA.debugLineNum = 50003989;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=50003992;
 //BA.debugLineNum = 50003992;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=50003993;
 //BA.debugLineNum = 50003993;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=50003994;
 //BA.debugLineNum = 50003994;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=50003996;
 //BA.debugLineNum = 50003996;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=48103428;
 //BA.debugLineNum = 48103428;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=48103429;
 //BA.debugLineNum = 48103429;BA.debugLine="Private mIDPedidoCliente As Int";
_midpedidocliente = 0;
RDebugUtils.currentLine=48103430;
 //BA.debugLineNum = 48103430;BA.debugLine="Private mDatosCabeceraPedidoCliente As TipoDatosC";
_mdatoscabecerapedidocliente = new b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b();
RDebugUtils.currentLine=48103431;
 //BA.debugLineNum = 48103431;BA.debugLine="Private mTk As String";
_mtk = "";
RDebugUtils.currentLine=48103433;
 //BA.debugLineNum = 48103433;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=48103434;
 //BA.debugLineNum = 48103434;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=48103436;
 //BA.debugLineNum = 48103436;BA.debugLine="Private lblSalirB2BPedidoClienteFicha As B4XView";
_lblsalirb2bpedidoclienteficha = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103437;
 //BA.debugLineNum = 48103437;BA.debugLine="Private txtClienteERP As B4XView";
_txtclienteerp = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103438;
 //BA.debugLineNum = 48103438;BA.debugLine="Private txtComprador As B4XView";
_txtcomprador = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103439;
 //BA.debugLineNum = 48103439;BA.debugLine="Private txtDireccionEnvioERP As B4XView";
_txtdireccionenvioerp = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103440;
 //BA.debugLineNum = 48103440;BA.debugLine="Private txtEmailComprador As B4XView";
_txtemailcomprador = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103441;
 //BA.debugLineNum = 48103441;BA.debugLine="Private txtFechaCreacion As B4XView";
_txtfechacreacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103442;
 //BA.debugLineNum = 48103442;BA.debugLine="Private txtFechaModificacion As B4XView";
_txtfechamodificacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103443;
 //BA.debugLineNum = 48103443;BA.debugLine="Private txtIDPedido As B4XView";
_txtidpedido = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103444;
 //BA.debugLineNum = 48103444;BA.debugLine="Private txtNombreClienteERP As B4XView";
_txtnombreclienteerp = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103445;
 //BA.debugLineNum = 48103445;BA.debugLine="Private txtNombreDireccionEnvioERP As B4XView";
_txtnombredireccionenvioerp = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103446;
 //BA.debugLineNum = 48103446;BA.debugLine="Private txtNombreTienda As B4XView";
_txtnombretienda = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103447;
 //BA.debugLineNum = 48103447;BA.debugLine="Private txtOrdenCompra As B4XView";
_txtordencompra = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103448;
 //BA.debugLineNum = 48103448;BA.debugLine="Private txtPedido As B4XView";
_txtpedido = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103450;
 //BA.debugLineNum = 48103450;BA.debugLine="Type TipoDatosLineaPedidoClienteB2B (IDLinea As I";
;
RDebugUtils.currentLine=48103456;
 //BA.debugLineNum = 48103456;BA.debugLine="Private TabPaneInfoPedidoCliente As TabPane";
_tabpaneinfopedidocliente = new anywheresoftware.b4j.objects.TabPaneWrapper();
RDebugUtils.currentLine=48103457;
 //BA.debugLineNum = 48103457;BA.debugLine="Private jamTableViewLineasPedidoClienteB2B As jam";
_jamtableviewlineaspedidoclienteb2b = new b4j.docU.jamtableview();
RDebugUtils.currentLine=48103458;
 //BA.debugLineNum = 48103458;BA.debugLine="Private jamTableViewLineasAlbaranesPedidoClienteB";
_jamtableviewlineasalbaranespedidoclienteb2b = new b4j.docU.jamtableview();
RDebugUtils.currentLine=48103459;
 //BA.debugLineNum = 48103459;BA.debugLine="Private jamTableViewLineasFacturasPedidoClienteB2";
_jamtableviewlineasfacturaspedidoclienteb2b = new b4j.docU.jamtableview();
RDebugUtils.currentLine=48103462;
 //BA.debugLineNum = 48103462;BA.debugLine="Private txtDireccionFacturacion As B4XView";
_txtdireccionfacturacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103463;
 //BA.debugLineNum = 48103463;BA.debugLine="Private txtNombreDireccionFacturacion As B4XView";
_txtnombredireccionfacturacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103464;
 //BA.debugLineNum = 48103464;BA.debugLine="Private txtIDDireccionEnvio As B4XView";
_txtiddireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103465;
 //BA.debugLineNum = 48103465;BA.debugLine="Private txtCodigoDireccionEnvioERP As B4XView";
_txtcodigodireccionenvioerp = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103466;
 //BA.debugLineNum = 48103466;BA.debugLine="Private txtNombreDireccionEnvio As B4XView";
_txtnombredireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103467;
 //BA.debugLineNum = 48103467;BA.debugLine="Private txtIDDireccionFacturacion As B4XView";
_txtiddireccionfacturacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103468;
 //BA.debugLineNum = 48103468;BA.debugLine="Private txtCodigoDireccionFacturacion As B4XView";
_txtcodigodireccionfacturacion = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103469;
 //BA.debugLineNum = 48103469;BA.debugLine="Private txtDireccionEnvio As B4XView";
_txtdireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=48103470;
 //BA.debugLineNum = 48103470;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _configuraciontableviews(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "configuraciontableviews", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "configuraciontableviews", null));}
ResumableSub_ConfiguracionTableViews rsub = new ResumableSub_ConfiguracionTableViews(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ConfiguracionTableViews extends BA.ResumableSub {
public ResumableSub_ConfiguracionTableViews(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=48955397;
 //BA.debugLineNum = 48955397;BA.debugLine="jamTableViewLineasPedidoClienteB2B.EstadoMenuItem";
__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=48955398;
 //BA.debugLineNum = 48955398;BA.debugLine="jamTableViewLineasPedidoClienteB2B.EstadoMenuItem";
__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=48955400;
 //BA.debugLineNum = 48955400;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AddMenuItemFon";
__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Actualizar Datos Pedido","ActualizarDatosPedido",BA.ObjectToString(parent.__c.Chr(((int)0xf021))),__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=48955401;
 //BA.debugLineNum = 48955401;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AddMenuItemFon";
__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Generar fichero CSV Pedido Venta","GenerarFicheroCSVPedido",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))),__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=48955403;
 //BA.debugLineNum = 48955403;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasPedido";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BLineasPedidoCliente.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=48955404;
 //BA.debugLineNum = 48955404;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _rsub);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=48955405;
 //BA.debugLineNum = 48955405;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("848955405",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=48955406;
 //BA.debugLineNum = 48955406;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=48955407;
 //BA.debugLineNum = 48955407;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=48955408;
 //BA.debugLineNum = 48955408;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _msa);
this.state = 10;
return;
case 10:
//C
this.state = 4;
;
RDebugUtils.currentLine=48955409;
 //BA.debugLineNum = 48955409;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=48955410;
 //BA.debugLineNum = 48955410;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=48955413;
 //BA.debugLineNum = 48955413;BA.debugLine="jamTableViewLineasPedidoClienteB2B.AlturaFilas=0";
__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=48955416;
 //BA.debugLineNum = 48955416;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Estad";
__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=48955417;
 //BA.debugLineNum = 48955417;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Estad";
__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=48955421;
 //BA.debugLineNum = 48955421;BA.debugLine="Dim rSub As ResumableSub=jamTableViewLineasAlbara";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BLineasAlbaranPedidoCliente.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=48955422;
 //BA.debugLineNum = 48955422;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=48955423;
 //BA.debugLineNum = 48955423;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("848955423",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=48955424;
 //BA.debugLineNum = 48955424;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=48955425;
 //BA.debugLineNum = 48955425;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=48955426;
 //BA.debugLineNum = 48955426;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "configuraciontableviews"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 8;
;
RDebugUtils.currentLine=48955427;
 //BA.debugLineNum = 48955427;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=48955428;
 //BA.debugLineNum = 48955428;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=48955431;
 //BA.debugLineNum = 48955431;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Altur";
__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=48955432;
 //BA.debugLineNum = 48955432;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Asign";
__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnafecha /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaAlbaran")}));
RDebugUtils.currentLine=48955434;
 //BA.debugLineNum = 48955434;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=48955435;
 //BA.debugLineNum = 48955435;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _creaciontablassqlite(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=48889856;
 //BA.debugLineNum = 48889856;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=48889857;
 //BA.debugLineNum = 48889857;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BLineasPedidoCliente");
RDebugUtils.currentLine=48889858;
 //BA.debugLineNum = 48889858;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BLineasPedidoCliente] (\n"+"		IDLinea INTEGER, LineaPedido INTEGER default 0, IDProductoB2B INTEGER, TipoItem TEXT, \n"+"		ItemSKU TEXT, UNSPSC TEXT, \n"+"		DescripcionProductoB2B TEXT, TallaB2B TEXT, \n"+"		QtyPedida INTEGER, QtyEnviada INTEGER, QtyFacturada INTEGER, QtyPteEnviar INTEGER default 0, QtyEnviadaPteFacturar INTEGER default 0, Precio REAL, UOMB2B TEXT, \n"+"		TipoIVA REAL, ImporteIVA REAL, ItemParentSKU TEXT, CodigoArticuloNAV TEXT default ''\n"+"	)");
RDebugUtils.currentLine=48889865;
 //BA.debugLineNum = 48889865;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=48889867;
 //BA.debugLineNum = 48889867;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BLineasAlbaranPedidoCliente");
RDebugUtils.currentLine=48889868;
 //BA.debugLineNum = 48889868;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BLineasAlbaranPedidoCliente] (\n"+"		Albaran TEXT, FechaAlbaran INTEGER,\n"+"		LineaAlbaran INTEGER default 0, LineaPedido INTEGER default 0, IDProductoB2B INTEGER,\n"+"		ItemSKU TEXT,\n"+"		DescripcionProductoB2B TEXT, TallaB2B TEXT, \n"+"		QtyEnviada INTEGER, UOMB2B TEXT, \n"+"		ItemParentSKU TEXT, CodigoArticuloNAV TEXT default ''\n"+"	)");
RDebugUtils.currentLine=48889876;
 //BA.debugLineNum = 48889876;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=48889878;
 //BA.debugLineNum = 48889878;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacionpedidoclientesearchgraphql(b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idsel) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacionpedidoclientesearchgraphql", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacionpedidoclientesearchgraphql", new Object[] {_token,_idsel}));}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL(this,__ref,_token,_idsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoClienteSearchGraphQL(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,String _token,int _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idsel = _idsel;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _token;
int _idsel;
String _squeryapi = "";
b4j.docU.httpjob _job = null;
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49872899;
 //BA.debugLineNum = 49872899;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?\n"+"	searchCriteria[filterGroups][0][filters][0][field]=entity_id&\n"+"	searchCriteria[filterGroups][0][filters][0][value]="+parent.__c.SmartStringFormatter("",(Object)(_idsel))+"&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=eq");
RDebugUtils.currentLine=49872915;
 //BA.debugLineNum = 49872915;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=49872916;
 //BA.debugLineNum = 49872916;BA.debugLine="job.Initialize(\"\", Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=49872917;
 //BA.debugLineNum = 49872917;BA.debugLine="job.Download($\"https://www.../graphql?query={your";
_job._download /*String*/ (null,("https://www.../graphql?query={yourQuery}"));
RDebugUtils.currentLine=49872918;
 //BA.debugLineNum = 49872918;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=49872920;
 //BA.debugLineNum = 49872920;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=49872921;
 //BA.debugLineNum = 49872921;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", $\"Beare";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization",("Bearer "+parent.__c.SmartStringFormatter("",(Object)(_token))+""));
RDebugUtils.currentLine=49872922;
 //BA.debugLineNum = 49872922;BA.debugLine="job.GetRequest.SetHeader(\"Accept\", \"application/j";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=49872924;
 //BA.debugLineNum = 49872924;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "enviodatosapimagentoinformacionpedidoclientesearchgraphql"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=49872926;
 //BA.debugLineNum = 49872926;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=49872927;
 //BA.debugLineNum = 49872927;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("849872927","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=49872928;
 //BA.debugLineNum = 49872928;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("849872928",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=49872929;
 //BA.debugLineNum = 49872929;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=49872930;
 //BA.debugLineNum = 49872930;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49872931;
 //BA.debugLineNum = 49872931;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=49872934;
 //BA.debugLineNum = 49872934;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=49872935;
 //BA.debugLineNum = 49872935;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=49872936;
 //BA.debugLineNum = 49872936;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=49872938;
 //BA.debugLineNum = 49872938;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="End Sub";
return "";
}
public void  _generarcsvpedidoventa(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "generarcsvpedidoventa", false))
	 {Debug.delegate(ba, "generarcsvpedidoventa", null); return;}
ResumableSub_GenerarCSVPedidoVenta rsub = new ResumableSub_GenerarCSVPedidoVenta(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_GenerarCSVPedidoVenta extends BA.ResumableSub {
public ResumableSub_GenerarCSVPedidoVenta(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.List _lstlineaspedidoventa = null;
String _uuidpedido = "";
String _documentoexterno = "";
String _sfechapedidocliente = "";
String _ssql = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String[] _datoslineapedido = null;
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
String _carpetaficherocsv = "";
String _nombreficherocsv = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=50069507;
 //BA.debugLineNum = 50069507;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=50069509;
 //BA.debugLineNum = 50069509;BA.debugLine="Dim lstLineasPedidoVenta As List";
_lstlineaspedidoventa = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50069510;
 //BA.debugLineNum = 50069510;BA.debugLine="lstLineasPedidoVenta.Initialize";
_lstlineaspedidoventa.Initialize();
RDebugUtils.currentLine=50069512;
 //BA.debugLineNum = 50069512;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUIDv4";
_uuidpedido = parent._utilidades._generaruuidv4 /*String*/ ();
RDebugUtils.currentLine=50069513;
 //BA.debugLineNum = 50069513;BA.debugLine="Dim DocumentoExterno As String";
_documentoexterno = "";
RDebugUtils.currentLine=50069515;
 //BA.debugLineNum = 50069515;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=50069516;
 //BA.debugLineNum = 50069516;BA.debugLine="Dim sFechaPedidoCliente As String=DateTime.Date(m";
_sfechapedidocliente = parent.__c.DateTime.Date(__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .FechaCreacion /*long*/ );
RDebugUtils.currentLine=50069517;
 //BA.debugLineNum = 50069517;BA.debugLine="DateTime.Dateformat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=50069519;
 //BA.debugLineNum = 50069519;BA.debugLine="Dim sSQL As String=\"select CodigoArticuloNAV, Tal";
_ssql = "select CodigoArticuloNAV, TallaB2B, QtyPedida, Precio from tblB2BLineasPedidoCliente order by LineaPedido";
RDebugUtils.currentLine=50069520;
 //BA.debugLineNum = 50069520;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(sSQL)";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(_ssql);
RDebugUtils.currentLine=50069521;
 //BA.debugLineNum = 50069521;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 1:
//do while
this.state = 4;
while (_rs.NextRow()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=50069523;
 //BA.debugLineNum = 50069523;BA.debugLine="Dim DatosLineaPedido(12) As String";
_datoslineapedido = new String[(int) (12)];
java.util.Arrays.fill(_datoslineapedido,"");
RDebugUtils.currentLine=50069524;
 //BA.debugLineNum = 50069524;BA.debugLine="DatosLineaPedido(0)=$\"${UUIDPedido}\"$";
_datoslineapedido[(int) (0)] = (""+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+"");
RDebugUtils.currentLine=50069525;
 //BA.debugLineNum = 50069525;BA.debugLine="DatosLineaPedido(1)=Main.DatosUsuario.NombreADUs";
_datoslineapedido[(int) (1)] = parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ ;
RDebugUtils.currentLine=50069526;
 //BA.debugLineNum = 50069526;BA.debugLine="DatosLineaPedido(2)=mDatosCabeceraPedidoCliente.";
_datoslineapedido[(int) (2)] = __ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .CodigoClienteERP /*String*/ ;
RDebugUtils.currentLine=50069527;
 //BA.debugLineNum = 50069527;BA.debugLine="DatosLineaPedido(3)=mDatosCabeceraPedidoCliente.";
_datoslineapedido[(int) (3)] = __ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .CodigoDireccionEnvioERP /*String*/ ;
RDebugUtils.currentLine=50069528;
 //BA.debugLineNum = 50069528;BA.debugLine="DatosLineaPedido(4)=mDatosCabeceraPedidoCliente.";
_datoslineapedido[(int) (4)] = __ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .OrdenCompra /*String*/ ;
RDebugUtils.currentLine=50069529;
 //BA.debugLineNum = 50069529;BA.debugLine="DatosLineaPedido(5)=\"0001\"";
_datoslineapedido[(int) (5)] = "0001";
RDebugUtils.currentLine=50069530;
 //BA.debugLineNum = 50069530;BA.debugLine="DatosLineaPedido(6)=sFechaPedidoCliente";
_datoslineapedido[(int) (6)] = _sfechapedidocliente;
RDebugUtils.currentLine=50069531;
 //BA.debugLineNum = 50069531;BA.debugLine="DatosLineaPedido(7)=rs.GetString(\"CodigoArticulo";
_datoslineapedido[(int) (7)] = _rs.GetString("CodigoArticuloNAV");
RDebugUtils.currentLine=50069532;
 //BA.debugLineNum = 50069532;BA.debugLine="DatosLineaPedido(8)=\"\"";
_datoslineapedido[(int) (8)] = "";
RDebugUtils.currentLine=50069533;
 //BA.debugLineNum = 50069533;BA.debugLine="DatosLineaPedido(9)=rs.GetString(\"TallaB2B\")";
_datoslineapedido[(int) (9)] = _rs.GetString("TallaB2B");
RDebugUtils.currentLine=50069534;
 //BA.debugLineNum = 50069534;BA.debugLine="DatosLineaPedido(10)=rs.GetDouble(\"QtyPedida\")";
_datoslineapedido[(int) (10)] = BA.NumberToString(_rs.GetDouble("QtyPedida"));
RDebugUtils.currentLine=50069535;
 //BA.debugLineNum = 50069535;BA.debugLine="DatosLineaPedido(11)=rs.GetDouble(\"Precio\")";
_datoslineapedido[(int) (11)] = BA.NumberToString(_rs.GetDouble("Precio"));
RDebugUtils.currentLine=50069537;
 //BA.debugLineNum = 50069537;BA.debugLine="lstLineasPedidoVenta.Add(DatosLineaPedido)";
_lstlineaspedidoventa.Add((Object)(_datoslineapedido));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=50069539;
 //BA.debugLineNum = 50069539;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=50069541;
 //BA.debugLineNum = 50069541;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=50069542;
 //BA.debugLineNum = 50069542;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
_lstheaders = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Docuware ID","Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen","FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio"});
RDebugUtils.currentLine=50069544;
 //BA.debugLineNum = 50069544;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\P";
_carpetaficherocsv = "\\\\192.168.10.6\\PendientesNAV";
RDebugUtils.currentLine=50069545;
 //BA.debugLineNum = 50069545;BA.debugLine="Dim NombreFicheroCSV As String=$\"B2B_${UUIDPedido";
_nombreficherocsv = ("B2B_"+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+".csv");
RDebugUtils.currentLine=50069546;
 //BA.debugLineNum = 50069546;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=50069547;
 //BA.debugLineNum = 50069547;BA.debugLine="Try";
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
RDebugUtils.currentLine=50069548;
 //BA.debugLineNum = 50069548;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,\"";
_su.SaveCSV2(_carpetaficherocsv,_nombreficherocsv,BA.ObjectToChar(";"),_lstlineaspedidoventa,_lstheaders);
RDebugUtils.currentLine=50069549;
 //BA.debugLineNum = 50069549;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Fichero ${No";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreficherocsv))+" creado en la carpeta del servidor.\n"+"Queda pendiente de convertir en Pedido de Venta en navision. Procésalo mediante el módulo de integración de pedidos de venta de navision."),"Aviso");
RDebugUtils.currentLine=50069551;
 //BA.debugLineNum = 50069551;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "generarcsvpedidoventa"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=50069553;
 //BA.debugLineNum = 50069553;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("850069553",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=50069554;
 //BA.debugLineNum = 50069554;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible generar el fichero CSV.\n"+""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.LastException(ba).getMessage()))+"."),"ERROR");
RDebugUtils.currentLine=50069556;
 //BA.debugLineNum = 50069556;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "generarcsvpedidoventa"), _msa);
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
RDebugUtils.currentLine=50069559;
 //BA.debugLineNum = 50069559;BA.debugLine="End Sub";
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
public String  _generatestring(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4a.objects.collections.List _table,String _separatorchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "generatestring", false))
	 {return ((String) Debug.delegate(ba, "generatestring", new Object[] {_table,_separatorchar}));}
String _eol = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String[] _row = null;
int _i = 0;
boolean _wrap = false;
String _word = "";
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Sub GenerateString (Table As List, SeparatorChar A";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="Dim eol As String = Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="If Table.Size = 0 Then Return \"\"";
if (_table.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=50331652;
 //BA.debugLineNum = 50331652;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=50331653;
 //BA.debugLineNum = 50331653;BA.debugLine="For Each row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group5 = _table;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (String[])(group5.Get(index5));
RDebugUtils.currentLine=50331654;
 //BA.debugLineNum = 50331654;BA.debugLine="For i = 0 To row.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_row.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=50331655;
 //BA.debugLineNum = 50331655;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
RDebugUtils.currentLine=50331656;
 //BA.debugLineNum = 50331656;BA.debugLine="Dim word As String = row(i)";
_word = _row[_i];
RDebugUtils.currentLine=50331657;
 //BA.debugLineNum = 50331657;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
RDebugUtils.currentLine=50331658;
 //BA.debugLineNum = 50331658;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
RDebugUtils.currentLine=50331659;
 //BA.debugLineNum = 50331659;BA.debugLine="Wrap = True";
_wrap = __c.True;
RDebugUtils.currentLine=50331660;
 //BA.debugLineNum = 50331660;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
RDebugUtils.currentLine=50331662;
 //BA.debugLineNum = 50331662;BA.debugLine="If Wrap Then";
if (_wrap) { 
RDebugUtils.currentLine=50331663;
 //BA.debugLineNum = 50331663;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
RDebugUtils.currentLine=50331665;
 //BA.debugLineNum = 50331665;BA.debugLine="sb.Append(word)";
_sb.Append(_word);
 };
RDebugUtils.currentLine=50331667;
 //BA.debugLineNum = 50331667;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
RDebugUtils.currentLine=50331669;
 //BA.debugLineNum = 50331669;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=50331670;
 //BA.debugLineNum = 50331670;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
 }
};
RDebugUtils.currentLine=50331672;
 //BA.debugLineNum = 50331672;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_eol.length()),_sb.getLength());
RDebugUtils.currentLine=50331673;
 //BA.debugLineNum = 50331673;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=50331674;
 //BA.debugLineNum = 50331674;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.Form  _getform(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "getform", false))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getform", null));}
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Sub getForm As Form";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="Return frm";
if (true) return __ref._frm /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _inicio(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "inicio", null));}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
Object _robj = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=48496644;
 //BA.debugLineNum = 48496644;BA.debugLine="wait for(ConfiguracionTableViews) complete (rObj";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "inicio"), __ref._configuraciontableviews /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=48496646;
 //BA.debugLineNum = 48496646;BA.debugLine="wait for (CargaDatosPedidoCliente(mIDPedidoClient";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "inicio"), __ref._cargadatospedidocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._midpedidocliente /*int*/ ));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=48496647;
 //BA.debugLineNum = 48496647;BA.debugLine="If Success=False Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_success==parent.__c.False) { 
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
RDebugUtils.currentLine=48496649;
 //BA.debugLineNum = 48496649;BA.debugLine="Wait For(ActualizarDatosLineasPedido) complete (S";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "inicio"), __ref._actualizardatoslineaspedido /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=48496650;
 //BA.debugLineNum = 48496650;BA.debugLine="If Success=False Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_success==parent.__c.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=48496652;
 //BA.debugLineNum = 48496652;BA.debugLine="Wait For(CargaInfoDireccionesClienteMagento(mDato";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "inicio"), __ref._cargainfodireccionesclientemagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDCliente /*int*/ ));
this.state = 32;
return;
case 32:
//C
this.state = 13;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=48496653;
 //BA.debugLineNum = 48496653;BA.debugLine="If Not(Success) Then Return False";
if (true) break;

case 13:
//if
this.state = 18;
if (parent.__c.Not(_success)) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=48496661;
 //BA.debugLineNum = 48496661;BA.debugLine="If mDatosCabeceraPedidoCliente.IDDireccionEnvio>0";
if (true) break;

case 19:
//if
this.state = 28;
if (__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDDireccionEnvio /*int*/ >0) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=48496662;
 //BA.debugLineNum = 48496662;BA.debugLine="Wait For(CargaDatosDireccionCliente(mDatosCabece";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "inicio"), __ref._cargadatosdireccioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .IDDireccionEnvio /*int*/ ,"Envio"));
this.state = 33;
return;
case 33:
//C
this.state = 22;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=48496663;
 //BA.debugLineNum = 48496663;BA.debugLine="If Success=False Then Return False";
if (true) break;

case 22:
//if
this.state = 27;
if (_success==parent.__c.False) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
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
RDebugUtils.currentLine=48496666;
 //BA.debugLineNum = 48496666;BA.debugLine="ActualizarDatosCabecera";
__ref._actualizardatoscabecera /*String*/ (null);
RDebugUtils.currentLine=48496668;
 //BA.debugLineNum = 48496668;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=48496669;
 //BA.debugLineNum = 48496669;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4a.BA _ba,int _idpedidocliente,String _tk) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_idpedidocliente,_tk}));}
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Public Sub Initialize(IDPedidoCliente As Int, tk A";
RDebugUtils.currentLine=48168964;
 //BA.debugLineNum = 48168964;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=48168970;
 //BA.debugLineNum = 48168970;BA.debugLine="mDatosCabeceraPedidoCliente.Initialize";
__ref._mdatoscabecerapedidocliente /*b4j.docU.cb2blistapedidoscliente._tipodatoscabecerapedidob2b*/ .Initialize();
RDebugUtils.currentLine=48168973;
 //BA.debugLineNum = 48168973;BA.debugLine="mIDPedidoCliente=IDPedidoCliente";
__ref._midpedidocliente /*int*/  = _idpedidocliente;
RDebugUtils.currentLine=48168977;
 //BA.debugLineNum = 48168977;BA.debugLine="mTk=tk";
__ref._mtk /*String*/  = _tk;
RDebugUtils.currentLine=48168979;
 //BA.debugLineNum = 48168979;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=48168981;
 //BA.debugLineNum = 48168981;BA.debugLine="Show";
__ref._show /*void*/ (null);
RDebugUtils.currentLine=48168982;
 //BA.debugLineNum = 48168982;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=48234501;
 //BA.debugLineNum = 48234501;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=48234502;
 //BA.debugLineNum = 48234502;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=48234504;
 //BA.debugLineNum = 48234504;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=48234505;
 //BA.debugLineNum = 48234505;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=48234508;
 //BA.debugLineNum = 48234508;BA.debugLine="frm.RootPane.LoadLayout(\"scrB2BFichaPedidoCliente";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrB2BFichaPedidoCliente2");
RDebugUtils.currentLine=48234510;
 //BA.debugLineNum = 48234510;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    B2B Pedid";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"    B2B Pedido Cliente ");
RDebugUtils.currentLine=48234512;
 //BA.debugLineNum = 48234512;BA.debugLine="TabPaneInfoPedidoCliente.LoadLayout(\"scrB2BPedido";
__ref._tabpaneinfopedidocliente /*anywheresoftware.b4j.objects.TabPaneWrapper*/ .LoadLayout(ba,"scrB2BPedidoClienteLineasPedido","Líneas Pedido");
RDebugUtils.currentLine=48234513;
 //BA.debugLineNum = 48234513;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=48234514;
 //BA.debugLineNum = 48234514;BA.debugLine="TabPaneInfoPedidoCliente.LoadLayout(\"scrB2BPedido";
__ref._tabpaneinfopedidocliente /*anywheresoftware.b4j.objects.TabPaneWrapper*/ .LoadLayout(ba,"scrB2BPedidoClienteLineasAlbaranesPedido","Líneas Albaranes Pedido");
RDebugUtils.currentLine=48234515;
 //BA.debugLineNum = 48234515;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "show"),(int) (0));
this.state = 6;
return;
case 6:
//C
this.state = 1;
;
RDebugUtils.currentLine=48234516;
 //BA.debugLineNum = 48234516;BA.debugLine="TabPaneInfoPedidoCliente.LoadLayout(\"scrB2BPedido";
__ref._tabpaneinfopedidocliente /*anywheresoftware.b4j.objects.TabPaneWrapper*/ .LoadLayout(ba,"scrB2BPedidoClienteLineasFacturasPedido","Líneas Facturas Pedido");
RDebugUtils.currentLine=48234517;
 //BA.debugLineNum = 48234517;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "show"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=48234519;
 //BA.debugLineNum = 48234519;BA.debugLine="Utilidades.AddImageToLabel(lblSalirB2BPedidoClien";
parent._utilidades._addimagetolabel /*String*/ ((anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._lblsalirb2bpedidoclienteficha /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())),parent.__c.File.getDirAssets(),"twotone_exit_black_24dp.png");
RDebugUtils.currentLine=48234523;
 //BA.debugLineNum = 48234523;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=48234535;
 //BA.debugLineNum = 48234535;BA.debugLine="wait for(Inicio) complete (Success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "show"), __ref._inicio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 8;
return;
case 8:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=48234536;
 //BA.debugLineNum = 48234536;BA.debugLine="If Success=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=48234537;
 //BA.debugLineNum = 48234537;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=48234538;
 //BA.debugLineNum = 48234538;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=48234541;
 //BA.debugLineNum = 48234541;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action(b4j.docU.cb2bfichapedidocliente __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewLineasPedidoClienteB2B_MenuBarMenuItem_Action(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
String _tagmenuitem;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 14;
switch (BA.switchObjectToInt(_tagmenuitem,"ActualizarDatosPedido","GenerarFicheroCSVPedido")) {
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
RDebugUtils.currentLine=49283077;
 //BA.debugLineNum = 49283077;BA.debugLine="wait for (CargaDatosPedidoCliente(mIDPedidoClie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action"), __ref._cargadatospedidocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._midpedidocliente /*int*/ ));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=49283078;
 //BA.debugLineNum = 49283078;BA.debugLine="If Success=False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_success==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=49283079;
 //BA.debugLineNum = 49283079;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=49283080;
 //BA.debugLineNum = 49283080;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=49283082;
 //BA.debugLineNum = 49283082;BA.debugLine="Wait For(ActualizarDatosLineasPedido) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "jamtableviewlineaspedidoclienteb2b_menubarmenuitem_action"), __ref._actualizardatoslineaspedido /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 16;
return;
case 16:
//C
this.state = 8;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=49283083;
 //BA.debugLineNum = 49283083;BA.debugLine="If Success=False Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_success==parent.__c.False) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=49283084;
 //BA.debugLineNum = 49283084;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=49283085;
 //BA.debugLineNum = 49283085;BA.debugLine="Return";
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
RDebugUtils.currentLine=49283096;
 //BA.debugLineNum = 49283096;BA.debugLine="GenerarCSVPedidoVenta";
__ref._generarcsvpedidoventa /*void*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=49283099;
 //BA.debugLineNum = 49283099;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cb2bfichapedidocliente __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
b4j.docU.cb2blistapedidoscliente _b2blistapedcli = null;
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Sub SalirModulo";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="If jamTableViewLineasPedidoClienteB2B.IsInitializ";
if (__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="jamTableViewLineasPedidoClienteB2B.GuardarConfig";
__ref._jamtableviewlineaspedidoclienteb2b /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
 };
RDebugUtils.currentLine=48431109;
 //BA.debugLineNum = 48431109;BA.debugLine="Dim B2BListaPedCli As cB2BListaPedidosCliente";
_b2blistapedcli = new b4j.docU.cb2blistapedidoscliente();
RDebugUtils.currentLine=48431110;
 //BA.debugLineNum = 48431110;BA.debugLine="B2BListaPedCli.Initialize";
_b2blistapedcli._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=48431111;
 //BA.debugLineNum = 48431111;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=48431113;
 //BA.debugLineNum = 48431113;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirb2bpedidoclienteficha_mouseclicked(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "lblsalirb2bpedidoclienteficha_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblsalirb2bpedidoclienteficha_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Private Sub lblSalirB2BPedidoClienteFicha_MouseCli";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirb2bpedidoclienteficha_mouseentered(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "lblsalirb2bpedidoclienteficha_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lblsalirb2bpedidoclienteficha_mouseentered", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="private Sub lblSalirB2BPedidoClienteFicha_MouseEnt";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
_xnode.SetColorAndBorder(_xnode.getColor(),__c.DipToCurrent((int) (1)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan,5);
RDebugUtils.currentLine=48758787;
 //BA.debugLineNum = 48758787;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirb2bpedidoclienteficha_mouseexited(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "lblsalirb2bpedidoclienteficha_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lblsalirb2bpedidoclienteficha_mouseexited", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=48824320;
 //BA.debugLineNum = 48824320;BA.debugLine="private Sub lblSalirB2BPedidoClienteFicha_MouseExi";
RDebugUtils.currentLine=48824321;
 //BA.debugLineNum = 48824321;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=48824322;
 //BA.debugLineNum = 48824322;BA.debugLine="xNode.SetColorAndBorder(xNode.Color,1dip,xui.Colo";
_xnode.SetColorAndBorder(_xnode.getColor(),__c.DipToCurrent((int) (1)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,5);
RDebugUtils.currentLine=48824323;
 //BA.debugLineNum = 48824323;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirb2bpedidoclienteficha_mousepressed(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "lblsalirb2bpedidoclienteficha_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "lblsalirb2bpedidoclienteficha_mousepressed", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Private Sub lblSalirB2BPedidoClienteFicha_MousePre";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="xNode.SetColorAndBorder(xui.Color_Cyan,1dip,xui.C";
_xnode.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan,__c.DipToCurrent((int) (1)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,5);
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="xNode.TextColor=xui.Color_Black";
_xnode.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=48627716;
 //BA.debugLineNum = 48627716;BA.debugLine="End Sub";
return "";
}
public String  _lblsalirb2bpedidoclienteficha_mousereleased(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "lblsalirb2bpedidoclienteficha_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "lblsalirb2bpedidoclienteficha_mousereleased", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Private Sub lblSalirB2BPedidoClienteFicha_MouseRel";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="Dim xNode As B4XView=Sender";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="xNode.SetColorAndBorder(xui.Color_Transparent,1di";
_xnode.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,__c.DipToCurrent((int) (1)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,5);
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="xNode.TextColor=xui.Color_White";
_xnode.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=48693252;
 //BA.debugLineNum = 48693252;BA.debugLine="End Sub";
return "";
}
public String[]  _mapkeystoarray(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "mapkeystoarray", false))
	 {return ((String[]) Debug.delegate(ba, "mapkeystoarray", new Object[] {_mdata}));}
String[] _arr = null;
int _idx = 0;
String _key = "";
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Sub mapKeysToArray(mData As Map) As String()";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="Dim arr(mData.Size) As String";
_arr = new String[_mdata.getSize()];
java.util.Arrays.fill(_arr,"");
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="Dim iDx As Int";
_idx = 0;
RDebugUtils.currentLine=50135043;
 //BA.debugLineNum = 50135043;BA.debugLine="For Each key As String In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=50135044;
 //BA.debugLineNum = 50135044;BA.debugLine="arr(iDx)=key";
_arr[_idx] = _key;
RDebugUtils.currentLine=50135045;
 //BA.debugLineNum = 50135045;BA.debugLine="iDx=iDx+1";
_idx = (int) (_idx+1);
 }
};
RDebugUtils.currentLine=50135047;
 //BA.debugLineNum = 50135047;BA.debugLine="Return arr";
if (true) return _arr;
RDebugUtils.currentLine=50135048;
 //BA.debugLineNum = 50135048;BA.debugLine="End Sub";
return null;
}
public Object[]  _maptoarrayofstringsconcamposfecha(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "maptoarrayofstringsconcamposfecha", false))
	 {return ((Object[]) Debug.delegate(ba, "maptoarrayofstringsconcamposfecha", new Object[] {_m}));}
Object[] _arr = null;
int _i = 0;
Object _value = null;
Object _key = null;
int _intvalue = 0;
String _svalue = "";
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="public Sub mapToArrayOfStringsConCamposFecha(m As";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="Dim arr(m.Size * 2) As Object  'array size is dou";
_arr = new Object[(int) (_m.getSize()*2)];
{
int d0 = _arr.length;
for (int i0 = 0;i0 < d0;i0++) {
_arr[i0] = new Object();
}
}
;
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="Dim i As Int=0";
_i = (int) (0);
RDebugUtils.currentLine=50266115;
 //BA.debugLineNum = 50266115;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=50266116;
 //BA.debugLineNum = 50266116;BA.debugLine="For Each key As Object In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _m.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=50266118;
 //BA.debugLineNum = 50266118;BA.debugLine="value=m.Get(key)";
_value = _m.Get(_key);
RDebugUtils.currentLine=50266119;
 //BA.debugLineNum = 50266119;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
__c.LogImpl("850266119",("key="+__c.SmartStringFormatter("",_key)+", value="+__c.SmartStringFormatter("",_value)+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=50266120;
 //BA.debugLineNum = 50266120;BA.debugLine="arr(i)=key";
_arr[_i] = _key;
RDebugUtils.currentLine=50266121;
 //BA.debugLineNum = 50266121;BA.debugLine="i = i +1";
_i = (int) (_i+1);
RDebugUtils.currentLine=50266122;
 //BA.debugLineNum = 50266122;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
if ((BA.ObjectToString(_key)).toUpperCase().startsWith("FECHA") && _i%2==0) { 
RDebugUtils.currentLine=50266123;
 //BA.debugLineNum = 50266123;BA.debugLine="arr(i)=DateTime.Date(value)";
_arr[_i] = (Object)(__c.DateTime.Date(BA.ObjectToLongNumber(_value)));
 }else {
RDebugUtils.currentLine=50266125;
 //BA.debugLineNum = 50266125;BA.debugLine="If value Is String Then";
if (_value instanceof String) { 
RDebugUtils.currentLine=50266126;
 //BA.debugLineNum = 50266126;BA.debugLine="arr(i)=value";
_arr[_i] = _value;
 }else {
RDebugUtils.currentLine=50266128;
 //BA.debugLineNum = 50266128;BA.debugLine="Dim intValue As Int=value";
_intvalue = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=50266129;
 //BA.debugLineNum = 50266129;BA.debugLine="Dim sValue As String=intValue";
_svalue = BA.NumberToString(_intvalue);
RDebugUtils.currentLine=50266130;
 //BA.debugLineNum = 50266130;BA.debugLine="arr(i)=sValue";
_arr[_i] = (Object)(_svalue);
 };
 };
RDebugUtils.currentLine=50266133;
 //BA.debugLineNum = 50266133;BA.debugLine="i =i +1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=50266136;
 //BA.debugLineNum = 50266136;BA.debugLine="Return arr";
if (true) return _arr;
RDebugUtils.currentLine=50266137;
 //BA.debugLineNum = 50266137;BA.debugLine="End Sub";
return null;
}
public Object[]  _mapvaluestoarrayofstringsconcamposfecha(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "mapvaluestoarrayofstringsconcamposfecha", false))
	 {return ((Object[]) Debug.delegate(ba, "mapvaluestoarrayofstringsconcamposfecha", new Object[] {_m}));}
String[] _arr = null;
int _i = 0;
Object _value = null;
Object _key = null;
int _intvalue = 0;
String _svalue = "";
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="public Sub mapValuesToArrayOfStringsConCamposFecha";
RDebugUtils.currentLine=50200577;
 //BA.debugLineNum = 50200577;BA.debugLine="Dim arr(m.Size) As String  'array size is double";
_arr = new String[_m.getSize()];
java.util.Arrays.fill(_arr,"");
RDebugUtils.currentLine=50200578;
 //BA.debugLineNum = 50200578;BA.debugLine="Dim i As Int=0";
_i = (int) (0);
RDebugUtils.currentLine=50200579;
 //BA.debugLineNum = 50200579;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=50200580;
 //BA.debugLineNum = 50200580;BA.debugLine="For Each key As Object In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _m.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=50200582;
 //BA.debugLineNum = 50200582;BA.debugLine="value=m.Get(key)";
_value = _m.Get(_key);
RDebugUtils.currentLine=50200583;
 //BA.debugLineNum = 50200583;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
__c.LogImpl("850200583",("key="+__c.SmartStringFormatter("",_key)+", value="+__c.SmartStringFormatter("",_value)+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=50200584;
 //BA.debugLineNum = 50200584;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
if ((BA.ObjectToString(_key)).toUpperCase().startsWith("FECHA")) { 
RDebugUtils.currentLine=50200585;
 //BA.debugLineNum = 50200585;BA.debugLine="arr(i)=DateTime.Date(value)";
_arr[_i] = __c.DateTime.Date(BA.ObjectToLongNumber(_value));
 }else {
RDebugUtils.currentLine=50200587;
 //BA.debugLineNum = 50200587;BA.debugLine="If value Is String Then";
if (_value instanceof String) { 
RDebugUtils.currentLine=50200588;
 //BA.debugLineNum = 50200588;BA.debugLine="arr(i)=value";
_arr[_i] = BA.ObjectToString(_value);
 }else {
RDebugUtils.currentLine=50200590;
 //BA.debugLineNum = 50200590;BA.debugLine="Dim intValue As Int=value";
_intvalue = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=50200591;
 //BA.debugLineNum = 50200591;BA.debugLine="Dim sValue As String=intValue";
_svalue = BA.NumberToString(_intvalue);
RDebugUtils.currentLine=50200592;
 //BA.debugLineNum = 50200592;BA.debugLine="arr(i)=sValue";
_arr[_i] = _svalue;
 };
 };
RDebugUtils.currentLine=50200595;
 //BA.debugLineNum = 50200595;BA.debugLine="i =i +1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=50200598;
 //BA.debugLineNum = 50200598;BA.debugLine="Return arr";
if (true) return (Object[])(_arr);
RDebugUtils.currentLine=50200599;
 //BA.debugLineNum = 50200599;BA.debugLine="End Sub";
return null;
}
public void  _tabpaneinfopedidocliente_tabchanged(b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.TabPaneWrapper.TabWrapper _selectedtab) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";
if (Debug.shouldDelegate(ba, "tabpaneinfopedidocliente_tabchanged", false))
	 {Debug.delegate(ba, "tabpaneinfopedidocliente_tabchanged", new Object[] {_selectedtab}); return;}
ResumableSub_TabPaneInfoPedidoCliente_TabChanged rsub = new ResumableSub_TabPaneInfoPedidoCliente_TabChanged(this,__ref,_selectedtab);
rsub.resume(ba, null);
}
public static class ResumableSub_TabPaneInfoPedidoCliente_TabChanged extends BA.ResumableSub {
public ResumableSub_TabPaneInfoPedidoCliente_TabChanged(b4j.docU.cb2bfichapedidocliente parent,b4j.docU.cb2bfichapedidocliente __ref,anywheresoftware.b4j.objects.TabPaneWrapper.TabWrapper _selectedtab) {
this.parent = parent;
this.__ref = __ref;
this._selectedtab = _selectedtab;
this.__ref = parent;
}
b4j.docU.cb2bfichapedidocliente __ref;
b4j.docU.cb2bfichapedidocliente parent;
anywheresoftware.b4j.objects.TabPaneWrapper.TabWrapper _selectedtab;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cb2bfichapedidocliente";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="Select Case SelectedTab.Text";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_selectedtab.getText(),"Líneas Albaranes Pedido")) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="jamTableViewLineasAlbaranesPedidoClienteB2B.Lim";
__ref._jamtableviewlineasalbaranespedidoclienteb2b /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=49348613;
 //BA.debugLineNum = 49348613;BA.debugLine="Wait For(CargaDatosAlbaranesPedidoCliente(mIDP";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "tabpaneinfopedidocliente_tabchanged"), __ref._cargadatosalbaranespedidocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._midpedidocliente /*int*/ ));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=49348614;
 //BA.debugLineNum = 49348614;BA.debugLine="If Success=False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_success==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=49348615;
 //BA.debugLineNum = 49348615;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=49348616;
 //BA.debugLineNum = 49348616;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=49348618;
 //BA.debugLineNum = 49348618;BA.debugLine="Wait For(ActualizarDatosLineasAlbaranesPedido)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cb2bfichapedidocliente", "tabpaneinfopedidocliente_tabchanged"), __ref._actualizardatoslineasalbaranespedido /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 14;
return;
case 14:
//C
this.state = 8;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=49348619;
 //BA.debugLineNum = 49348619;BA.debugLine="If Success=False Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_success==parent.__c.False) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=49348620;
 //BA.debugLineNum = 49348620;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=49348621;
 //BA.debugLineNum = 49348621;BA.debugLine="Return";
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
RDebugUtils.currentLine=49348629;
 //BA.debugLineNum = 49348629;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}