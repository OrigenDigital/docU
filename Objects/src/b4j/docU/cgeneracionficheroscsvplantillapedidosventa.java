package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cgeneracionficheroscsvplantillapedidosventa extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cgeneracionficheroscsvplantillapedidosventa", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cgeneracionficheroscsvplantillapedidosventa.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tipodatosplantillapedidoventacab{
public boolean IsInitialized;
public String CodigoCliente;
public String NombreCliente;
public String GRPCliente;
public String CIFCliente;
public String CodigoDireccionEnvio;
public String NombreDireccionEnvio;
public long FechaPedidoCliente;
public String AlmacenOrigen;
public String DocumentoExterno;
public void Initialize() {
IsInitialized = true;
CodigoCliente = "";
NombreCliente = "";
GRPCliente = "";
CIFCliente = "";
CodigoDireccionEnvio = "";
NombreDireccionEnvio = "";
FechaPedidoCliente = 0L;
AlmacenOrigen = "";
DocumentoExterno = "";
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
public b4j.docU.b4xdialog _dialog = null;
public String _permisomodulousuario = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsalir = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public String _rutaficheroseleccionado = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _btnselficheroftp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtficheroseleccionado = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtcifcliente = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondogeneracionficheroscsvpedidosventa = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblitembuscarcientedireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcancelarbuscarclientedireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitlebuscarclientedireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbltitledatobuscar = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlfondobuscarclientedireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtbuscarclientedireccionenvio = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxfiltrocif = null;
public b4j.example.customlistview _clvbuscarclientedireccionenvio = null;
public double _anchoclv = 0;
public double _malturaitems = 0;
public int _colorfondopanelitemsimpares = 0;
public int _colorfondopanelitemspares = 0;
public int[] _arraycoloresitems = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _backgroundbuscarclientedireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _basebuscarclientedireccionenvio = null;
public String _campobusqueda = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _txtcodigocliente = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombrecliente = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtcodigodireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombredireccionenvio = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnseldocumentoexterno = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtdocumentoexterno = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnselfechapedidocliente = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtfechapedidocliente = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnselalmacen = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtalmacen = null;
public b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab _datosplantillapedidoventacab = null;
public b4j.docU.jamtableview _jamtableview1 = null;
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
public String  _initialize(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=35848198;
 //BA.debugLineNum = 35848198;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=35848199;
 //BA.debugLineNum = 35848199;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
String _accion = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=35913734;
 //BA.debugLineNum = 35913734;BA.debugLine="frm.RootPane.LoadLayout(\"scrGeneracionFicherosCSV";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrGeneracionFicherosCSVPedidosVenta");
RDebugUtils.currentLine=35913736;
 //BA.debugLineNum = 35913736;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=35913738;
 //BA.debugLineNum = 35913738;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Generación Fi";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Generación Ficheros CSV Plantilla Pedidos Venta");
RDebugUtils.currentLine=35913740;
 //BA.debugLineNum = 35913740;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=35913741;
 //BA.debugLineNum = 35913741;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=35913743;
 //BA.debugLineNum = 35913743;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Procesar datos plantilla","ProcesarDatosPlantilla",BA.ObjectToString(parent.__c.Chr(((int)0xf1c3))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=35913744;
 //BA.debugLineNum = 35913744;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Generar Fichero CSV","GenerarFicheroCSV",BA.ObjectToString(parent.__c.Chr(((int)0xf016))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=35913750;
 //BA.debugLineNum = 35913750;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaGeneracionFicherosCSVPedidosVentaLineasPedido.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=35913751;
 //BA.debugLineNum = 35913751;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"), _rsub);
this.state = 10;
return;
case 10:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35913752;
 //BA.debugLineNum = 35913752;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("835913752",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=35913753;
 //BA.debugLineNum = 35913753;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=35913754;
 //BA.debugLineNum = 35913754;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=35913755;
 //BA.debugLineNum = 35913755;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=35913756;
 //BA.debugLineNum = 35913756;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=35913757;
 //BA.debugLineNum = 35913757;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=35913760;
 //BA.debugLineNum = 35913760;BA.debugLine="jamTableView1.AlturaFilas=0";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=35913762;
 //BA.debugLineNum = 35913762;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=35913763;
 //BA.debugLineNum = 35913763;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=35913765;
 //BA.debugLineNum = 35913765;BA.debugLine="ColorFondoPanelItemsImpares=0xFFF1F1F1";
__ref._colorfondopanelitemsimpares /*int*/  = ((int)0xfff1f1f1);
RDebugUtils.currentLine=35913766;
 //BA.debugLineNum = 35913766;BA.debugLine="ColorFondoPanelItemsPares=xui.Color_White";
__ref._colorfondopanelitemspares /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=35913768;
 //BA.debugLineNum = 35913768;BA.debugLine="ArrayColoresItems(0)=ColorFondoPanelItemsImpares";
__ref._arraycoloresitems /*int[]*/ [(int) (0)] = __ref._colorfondopanelitemsimpares /*int*/ ;
RDebugUtils.currentLine=35913769;
 //BA.debugLineNum = 35913769;BA.debugLine="ArrayColoresItems(1)=ColorFondoPanelItemsPares";
__ref._arraycoloresitems /*int[]*/ [(int) (1)] = __ref._colorfondopanelitemspares /*int*/ ;
RDebugUtils.currentLine=35913771;
 //BA.debugLineNum = 35913771;BA.debugLine="LimpiarDatos";
__ref._limpiardatos /*String*/ (null);
RDebugUtils.currentLine=35913773;
 //BA.debugLineNum = 35913773;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=35913775;
 //BA.debugLineNum = 35913775;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos clientes/direcciones envío..."));
RDebugUtils.currentLine=35913776;
 //BA.debugLineNum = 35913776;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=35913777;
 //BA.debugLineNum = 35913777;BA.debugLine="Wait For(CargaClientesDireccionesEnvioDW) complet";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "show"), __ref._cargaclientesdireccionesenviodw /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35913778;
 //BA.debugLineNum = 35913778;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35913779;
 //BA.debugLineNum = 35913779;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35913780;
 //BA.debugLineNum = 35913780;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_accion).equals("NOK")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=35913781;
 //BA.debugLineNum = 35913781;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=35913782;
 //BA.debugLineNum = 35913782;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=35913785;
 //BA.debugLineNum = 35913785;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _actualizardatosclv(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "actualizardatosclv", false))
	 {return ((String) Debug.delegate(ba, "actualizardatosclv", null));}
int _numpanel = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
String _scombi = "";
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Sub ActualizarDatosCLV";
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="CLVBuscarClienteDireccionEnvio.Clear";
__ref._clvbuscarclientedireccionenvio /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="Dim NumPanel As Int";
_numpanel = 0;
RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="AnchoCLV=CLVBuscarClienteDireccionEnvio.AsView.Wi";
__ref._anchoclv /*double*/  = __ref._clvbuscarclientedireccionenvio /*b4j.example.customlistview*/ ._asview().getWidth();
RDebugUtils.currentLine=36634631;
 //BA.debugLineNum = 36634631;BA.debugLine="mAlturaItems=25dip";
__ref._malturaitems /*double*/  = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=36634636;
 //BA.debugLineNum = 36634636;BA.debugLine="Select Case CampoBusqueda";
switch (BA.switchObjectToInt(__ref._campobusqueda /*String*/ ,"Cliente","DireccionEnvio")) {
case 0: {
RDebugUtils.currentLine=36634638;
 //BA.debugLineNum = 36634638;BA.debugLine="If chkboxFiltroCIF.Checked Then";
if (__ref._chkboxfiltrocif /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
RDebugUtils.currentLine=36634639;
 //BA.debugLineNum = 36634639;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select d";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb like ? order by CodigoCliente"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{("%"+__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CIFCliente /*String*/ ))+"%")}));
 }else {
RDebugUtils.currentLine=36634642;
 //BA.debugLineNum = 36634642;BA.debugLine="If txtBuscarClienteDireccionEnvio.Text=\"\" Then";
if ((__ref._txtbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=36634643;
 //BA.debugLineNum = 36634643;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery($\"Select d";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW order by CodigoCliente"));
 }else {
RDebugUtils.currentLine=36634645;
 //BA.debugLineNum = 36634645;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select distinct ClienteComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb like ? order by CodigoCliente"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{("%"+__c.SmartStringFormatter("",(Object)(__ref._txtbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()))+"%")}));
 };
 };
 break; }
case 1: {
RDebugUtils.currentLine=36634651;
 //BA.debugLineNum = 36634651;BA.debugLine="If txtBuscarClienteDireccionEnvio.Text=\"\" Then";
if ((__ref._txtbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("")) { 
RDebugUtils.currentLine=36634652;
 //BA.debugLineNum = 36634652;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select D";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select DireccionEnvioComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? order by CodigoDireccionEnvio"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ }));
 }else {
RDebugUtils.currentLine=36634655;
 //BA.debugLineNum = 36634655;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2($\"Select D";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select DireccionEnvioComb from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and DireccionEnvioComb like ? order by CodigoDireccionEnvio"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ,("%"+__c.SmartStringFormatter("",(Object)(__ref._txtbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()))+"%")}));
 };
 break; }
}
;
RDebugUtils.currentLine=36634661;
 //BA.debugLineNum = 36634661;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=36634662;
 //BA.debugLineNum = 36634662;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(Null)";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,BA.ObjectToString(__c.Null));
RDebugUtils.currentLine=36634663;
 //BA.debugLineNum = 36634663;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoCLV, mAltura";
_pnl.SetLayoutAnimated((int) (0),0,0,__ref._anchoclv /*double*/ ,__ref._malturaitems /*double*/ );
RDebugUtils.currentLine=36634667;
 //BA.debugLineNum = 36634667;BA.debugLine="pnl.Color=0xFFDCDCDC";
_pnl.setColor(((int)0xffdcdcdc));
RDebugUtils.currentLine=36634668;
 //BA.debugLineNum = 36634668;BA.debugLine="Dim sCombi As String=rs.GetString2(0)";
_scombi = _rs.GetString2((int) (0));
RDebugUtils.currentLine=36634669;
 //BA.debugLineNum = 36634669;BA.debugLine="CLVBuscarClienteDireccionEnvio.Add(pnl,sCombi)";
__ref._clvbuscarclientedireccionenvio /*b4j.example.customlistview*/ ._add(_pnl,(Object)(_scombi));
RDebugUtils.currentLine=36634670;
 //BA.debugLineNum = 36634670;BA.debugLine="NumPanel=NumPanel+1";
_numpanel = (int) (_numpanel+1);
 }
;
RDebugUtils.currentLine=36634672;
 //BA.debugLineNum = 36634672;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=36634675;
 //BA.debugLineNum = 36634675;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="LimpiarDatos";
__ref._limpiardatos /*String*/ (null);
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="End Sub";
return "";
}
public void  _btnselalmacen_click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "btnselalmacen_click", false))
	 {Debug.delegate(ba, "btnselalmacen_click", null); return;}
ResumableSub_btnSelAlmacen_Click rsub = new ResumableSub_btnSelAlmacen_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelAlmacen_Click extends BA.ResumableSub {
public ResumableSub_btnSelAlmacen_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
b4j.docU.b4xinputtemplate _b4xinput = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Dialog.Title=\"Indica el Almacén Origen\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica el Almacén Origen");
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="Dim B4XInput As B4XInputTemplate";
_b4xinput = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="B4XInput.Initialize";
_b4xinput._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="B4XInput.Text=IIf(DatosPlantillaPedidoVentaCab.Al";
_b4xinput._text /*String*/  = BA.ObjectToString((((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/ ).equals("")) ? ((Object)("0001")) : ((Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/ ))));
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="B4XInput.lblTitle.Text=$\"\"$";
_b4xinput._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""));
RDebugUtils.currentLine=37355527;
 //BA.debugLineNum = 37355527;BA.debugLine="B4XInput.mBase.Width=450dip";
_b4xinput._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=37355528;
 //BA.debugLineNum = 37355528;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XI";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xinput),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=37355530;
 //BA.debugLineNum = 37355530;BA.debugLine="bOk.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=37355531;
 //BA.debugLineNum = 37355531;BA.debugLine="bOk.Left=(Dialog.Base.Width-bOk.Width)/2";
_bok.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_bok.getWidth())/(double)2);
RDebugUtils.currentLine=37355532;
 //BA.debugLineNum = 37355532;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=37355533;
 //BA.debugLineNum = 37355533;BA.debugLine="bCancel.TextSize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=37355534;
 //BA.debugLineNum = 37355534;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=37355535;
 //BA.debugLineNum = 37355535;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=37355536;
 //BA.debugLineNum = 37355536;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselalmacen_click"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=37355537;
 //BA.debugLineNum = 37355537;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=37355538;
 //BA.debugLineNum = 37355538;BA.debugLine="DatosPlantillaPedidoVentaCab.AlmacenOrigen=B4XInp";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/  = _b4xinput._text /*String*/ ;
RDebugUtils.currentLine=37355539;
 //BA.debugLineNum = 37355539;BA.debugLine="txtAlmacen.Text=DatosPlantillaPedidoVentaCab.Alma";
__ref._txtalmacen /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/ );
RDebugUtils.currentLine=37355540;
 //BA.debugLineNum = 37355540;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselcliente_click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "btnselcliente_click", false))
	 {Debug.delegate(ba, "btnselcliente_click", null); return;}
ResumableSub_btnSelCliente_Click rsub = new ResumableSub_btnSelCliente_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelCliente_Click extends BA.ResumableSub {
public ResumableSub_btnSelCliente_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoCliente<>\"\"";
if (true) break;

case 1:
//if
this.state = 10;
if ((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Ya h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselcliente_click"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("Ya hay seleccionado un cliente.\n"+"Seleccionar otro cliente?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=37158916;
 //BA.debugLineNum = 37158916;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=37158919;
 //BA.debugLineNum = 37158919;BA.debugLine="CampoBusqueda=\"Cliente\"";
__ref._campobusqueda /*String*/  = "Cliente";
RDebugUtils.currentLine=37158920;
 //BA.debugLineNum = 37158920;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoCliente=\"\"";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/  = "";
RDebugUtils.currentLine=37158921;
 //BA.debugLineNum = 37158921;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreCliente=\"\"";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .NombreCliente /*String*/  = "";
RDebugUtils.currentLine=37158922;
 //BA.debugLineNum = 37158922;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoDireccionEnvio /*String*/  = "";
RDebugUtils.currentLine=37158923;
 //BA.debugLineNum = 37158923;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreDireccionEnvio";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .NombreDireccionEnvio /*String*/  = "";
RDebugUtils.currentLine=37158924;
 //BA.debugLineNum = 37158924;BA.debugLine="txtCodigoCliente.Text=\"\"";
__ref._txtcodigocliente /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=37158925;
 //BA.debugLineNum = 37158925;BA.debugLine="txtNombreCliente.Text=\"\"";
__ref._txtnombrecliente /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=37158926;
 //BA.debugLineNum = 37158926;BA.debugLine="txtCodigoDireccionEnvio.Text=\"\"";
__ref._txtcodigodireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=37158927;
 //BA.debugLineNum = 37158927;BA.debugLine="txtNombreDireccionEnvio.Text=\"\"";
__ref._txtnombredireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=37158929;
 //BA.debugLineNum = 37158929;BA.debugLine="MostrarPanelBuscarClienteDireccionEnvio";
__ref._mostrarpanelbuscarclientedireccionenvio /*String*/ (null);
RDebugUtils.currentLine=37158931;
 //BA.debugLineNum = 37158931;BA.debugLine="chkboxFiltroCIF.Checked=True";
__ref._chkboxfiltrocif /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.True);
RDebugUtils.currentLine=37158932;
 //BA.debugLineNum = 37158932;BA.debugLine="ActualizarDatosCLV";
__ref._actualizardatosclv /*String*/ (null);
RDebugUtils.currentLine=37158933;
 //BA.debugLineNum = 37158933;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mostrarpanelbuscarclientedireccionenvio(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "mostrarpanelbuscarclientedireccionenvio", false))
	 {return ((String) Debug.delegate(ba, "mostrarpanelbuscarclientedireccionenvio", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Sub MostrarPanelBuscarClienteDireccionEnvio";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="For Each xNode As B4XView In frm.RootPane";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group1.Get(index1)));
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="If xNode Is Pane Then";
if (_xnode.getObjectOrNull() instanceof javafx.scene.layout.Pane) { 
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="If xNode.Tag=\"BackgroundBuscarClienteDireccionE";
if ((_xnode.getTag()).equals((Object)("BackgroundBuscarClienteDireccionEnvio"))) { 
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="xNode.RemoveViewFromParent";
_xnode.RemoveViewFromParent();
RDebugUtils.currentLine=37289989;
 //BA.debugLineNum = 37289989;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=37289994;
 //BA.debugLineNum = 37289994;BA.debugLine="BackgroundBuscarClienteDireccionEnvio= xui.Create";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"BackgroundBuscarClienteDireccionEnvio");
RDebugUtils.currentLine=37289995;
 //BA.debugLineNum = 37289995;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.Tag = \"Back";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("BackgroundBuscarClienteDireccionEnvio"));
RDebugUtils.currentLine=37289997;
 //BA.debugLineNum = 37289997;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.Color=0x3FD";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x3fd3d3d3));
RDebugUtils.currentLine=37289998;
 //BA.debugLineNum = 37289998;BA.debugLine="frm.RootPane.AddNode(BackgroundBuscarClienteDirec";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().AddNode((javafx.scene.Node)(__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getWidth(),__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getHeight());
RDebugUtils.currentLine=37290000;
 //BA.debugLineNum = 37290000;BA.debugLine="BaseBuscarClienteDireccionEnvio=xui.CreatePanel(\"";
__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnlBaseBuscarClienteDireccionEnvio");
RDebugUtils.currentLine=37290001;
 //BA.debugLineNum = 37290001;BA.debugLine="BaseBuscarClienteDireccionEnvio.SetLayoutAnimated";
__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (1000)),__c.DipToCurrent((int) (750)));
RDebugUtils.currentLine=37290002;
 //BA.debugLineNum = 37290002;BA.debugLine="BaseBuscarClienteDireccionEnvio.LoadLayout(\"scrGe";
__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("scrGeneracionFicherosCSVPlantillaPedidosVentaBuscarClienteDireccionEnvio",ba);
RDebugUtils.currentLine=37290004;
 //BA.debugLineNum = 37290004;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.AddView(Bas";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2),(__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2),__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._basebuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37290007;
 //BA.debugLineNum = 37290007;BA.debugLine="chkboxFiltroCIF.Visible=CampoBusqueda=\"Cliente\"";
__ref._chkboxfiltrocif /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setVisible((__ref._campobusqueda /*String*/ ).equals("Cliente"));
RDebugUtils.currentLine=37290009;
 //BA.debugLineNum = 37290009;BA.debugLine="lblTitleDatoBuscar.Text=IIf(CampoBusqueda=\"Client";
__ref._lbltitledatobuscar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString((((__ref._campobusqueda /*String*/ ).equals("Cliente")) ? ((Object)("Cliente")) : ((Object)("Dirección Envío")))));
RDebugUtils.currentLine=37290011;
 //BA.debugLineNum = 37290011;BA.debugLine="End Sub";
return "";
}
public void  _btnseldireccionenvio_click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "btnseldireccionenvio_click", false))
	 {Debug.delegate(ba, "btnseldireccionenvio_click", null); return;}
ResumableSub_btnSelDireccionEnvio_Click rsub = new ResumableSub_btnSelDireccionEnvio_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelDireccionEnvio_Click extends BA.ResumableSub {
public ResumableSub_btnSelDireccionEnvio_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
Object _msa = null;
int _rint = 0;
int _numdirenv = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoCliente=\"\"";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado cliente","Aviso");
RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldireccionenvio_click"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 4;
;
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=37224455;
 //BA.debugLineNum = 37224455;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoDireccionEn";

case 4:
//if
this.state = 13;
if ((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoDireccionEnvio /*String*/ ).equals("") == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=37224456;
 //BA.debugLineNum = 37224456;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Ya h";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldireccionenvio_click"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("Ya hay seleccionada una dirección de envío.\n"+"Seleccionar otra dirección de envío?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 19;
return;
case 19:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=37224458;
 //BA.debugLineNum = 37224458;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=37224461;
 //BA.debugLineNum = 37224461;BA.debugLine="Dim NumDirEnv As Int=mSQL.ExecQuerySingleResult2(";
_numdirenv = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and CodigoDireccionEnvio<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ,""}))));
RDebugUtils.currentLine=37224464;
 //BA.debugLineNum = 37224464;BA.debugLine="If NumDirEnv=0 Then";
if (true) break;

case 14:
//if
this.state = 17;
if (_numdirenv==0) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=37224465;
 //BA.debugLineNum = 37224465;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El Cliente s";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El Cliente seleccionado ("+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ))+") no tiene direcciones de envío."),"Aviso");
RDebugUtils.currentLine=37224466;
 //BA.debugLineNum = 37224466;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldireccionenvio_click"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 17;
;
RDebugUtils.currentLine=37224467;
 //BA.debugLineNum = 37224467;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=37224470;
 //BA.debugLineNum = 37224470;BA.debugLine="CampoBusqueda=\"DireccionEnvio\"";
__ref._campobusqueda /*String*/  = "DireccionEnvio";
RDebugUtils.currentLine=37224471;
 //BA.debugLineNum = 37224471;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoDireccionEnvio";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoDireccionEnvio /*String*/  = "";
RDebugUtils.currentLine=37224472;
 //BA.debugLineNum = 37224472;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreDireccionEnvio";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .NombreDireccionEnvio /*String*/  = "";
RDebugUtils.currentLine=37224473;
 //BA.debugLineNum = 37224473;BA.debugLine="txtCodigoDireccionEnvio.Text=\"\"";
__ref._txtcodigodireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=37224474;
 //BA.debugLineNum = 37224474;BA.debugLine="txtNombreDireccionEnvio.Text=\"\"";
__ref._txtnombredireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=37224475;
 //BA.debugLineNum = 37224475;BA.debugLine="MostrarPanelBuscarClienteDireccionEnvio";
__ref._mostrarpanelbuscarclientedireccionenvio /*String*/ (null);
RDebugUtils.currentLine=37224477;
 //BA.debugLineNum = 37224477;BA.debugLine="chkboxFiltroCIF.Checked=True";
__ref._chkboxfiltrocif /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.True);
RDebugUtils.currentLine=37224478;
 //BA.debugLineNum = 37224478;BA.debugLine="ActualizarDatosCLV";
__ref._actualizardatosclv /*String*/ (null);
RDebugUtils.currentLine=37224481;
 //BA.debugLineNum = 37224481;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnseldocumentoexterno_click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "btnseldocumentoexterno_click", false))
	 {Debug.delegate(ba, "btnseldocumentoexterno_click", null); return;}
ResumableSub_btnSelDocumentoExterno_Click rsub = new ResumableSub_btnSelDocumentoExterno_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelDocumentoExterno_Click extends BA.ResumableSub {
public ResumableSub_btnSelDocumentoExterno_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
b4j.docU.b4xinputtemplate _b4xinput = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="Dialog.Title=\"Indica el Documento Externo\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica el Documento Externo");
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="Dim B4XInput As B4XInputTemplate";
_b4xinput = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="B4XInput.Initialize";
_b4xinput._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="B4XInput.Text=DatosPlantillaPedidoVentaCab.Docume";
_b4xinput._text /*String*/  = __ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .DocumentoExterno /*String*/ ;
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="B4XInput.lblTitle.Text=$\"(Pedido del Cliente)\"$";
_b4xinput._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(("(Pedido del Cliente)"));
RDebugUtils.currentLine=37486599;
 //BA.debugLineNum = 37486599;BA.debugLine="B4XInput.mBase.Width=450dip";
_b4xinput._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=37486600;
 //BA.debugLineNum = 37486600;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XI";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xinput),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=37486601;
 //BA.debugLineNum = 37486601;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=37486602;
 //BA.debugLineNum = 37486602;BA.debugLine="bOk.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=37486603;
 //BA.debugLineNum = 37486603;BA.debugLine="bOk.Left=(Dialog.Base.Width-bOk.Width)/2";
_bok.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_bok.getWidth())/(double)2);
RDebugUtils.currentLine=37486604;
 //BA.debugLineNum = 37486604;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=37486605;
 //BA.debugLineNum = 37486605;BA.debugLine="bCancel.TextSize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=37486606;
 //BA.debugLineNum = 37486606;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=37486607;
 //BA.debugLineNum = 37486607;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=37486608;
 //BA.debugLineNum = 37486608;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnseldocumentoexterno_click"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=37486609;
 //BA.debugLineNum = 37486609;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=37486610;
 //BA.debugLineNum = 37486610;BA.debugLine="DatosPlantillaPedidoVentaCab.DocumentoExterno=B4X";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .DocumentoExterno /*String*/  = _b4xinput._text /*String*/ .toUpperCase();
RDebugUtils.currentLine=37486611;
 //BA.debugLineNum = 37486611;BA.debugLine="txtDocumentoExterno.Text=DatosPlantillaPedidoVent";
__ref._txtdocumentoexterno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .DocumentoExterno /*String*/ );
RDebugUtils.currentLine=37486612;
 //BA.debugLineNum = 37486612;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselfechapedidocliente_click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "btnselfechapedidocliente_click", false))
	 {Debug.delegate(ba, "btnselfechapedidocliente_click", null); return;}
ResumableSub_btnSelFechaPedidoCliente_Click rsub = new ResumableSub_btnSelFechaPedidoCliente_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFechaPedidoCliente_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaPedidoCliente_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
String _dateformatant = "";
b4j.docU.b4xdatetemplate _b4xdatedlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
long _fechapedcli = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=37421062;
 //BA.debugLineNum = 37421062;BA.debugLine="Dialog.Title=\"Indica Fecha Pedido Cliente\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Pedido Cliente");
RDebugUtils.currentLine=37421064;
 //BA.debugLineNum = 37421064;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=37421065;
 //BA.debugLineNum = 37421065;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37421066;
 //BA.debugLineNum = 37421066;BA.debugLine="If DatosPlantillaPedidoVentaCab.FechaPedidoClient";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/ ==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=37421067;
 //BA.debugLineNum = 37421067;BA.debugLine="B4XDateDlg.Date=DateTime.now";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=37421069;
 //BA.debugLineNum = 37421069;BA.debugLine="B4XDateDlg.Date=DatosPlantillaPedidoVentaCab.Fec";
_b4xdatedlg._setdate /*long*/ (null,__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=37421071;
 //BA.debugLineNum = 37421071;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=37421072;
 //BA.debugLineNum = 37421072;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=37421073;
 //BA.debugLineNum = 37421073;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=37421076;
 //BA.debugLineNum = 37421076;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=37421077;
 //BA.debugLineNum = 37421077;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=37421078;
 //BA.debugLineNum = 37421078;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=37421079;
 //BA.debugLineNum = 37421079;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=37421080;
 //BA.debugLineNum = 37421080;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselfechapedidocliente_click"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=37421082;
 //BA.debugLineNum = 37421082;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=37421083;
 //BA.debugLineNum = 37421083;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=37421084;
 //BA.debugLineNum = 37421084;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=37421086;
 //BA.debugLineNum = 37421086;BA.debugLine="Dim FechaPedCli As Long=B4XDateDlg.Date";
_fechapedcli = _b4xdatedlg._getdate /*long*/ (null);
RDebugUtils.currentLine=37421087;
 //BA.debugLineNum = 37421087;BA.debugLine="DatosPlantillaPedidoVentaCab.FechaPedidoCliente=F";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/  = _fechapedcli;
RDebugUtils.currentLine=37421088;
 //BA.debugLineNum = 37421088;BA.debugLine="txtFechaPedidoCliente.Text=DateTime.Date(DatosPla";
__ref._txtfechapedidocliente /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.DateTime.Date(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/ ));
RDebugUtils.currentLine=37421090;
 //BA.debugLineNum = 37421090;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=37421091;
 //BA.debugLineNum = 37421091;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselficheroplantillapedidoventa_click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "btnselficheroplantillapedidoventa_click", false))
	 {Debug.delegate(ba, "btnselficheroplantillapedidoventa_click", null); return;}
ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click rsub = new ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click extends BA.ResumableSub {
public ResumableSub_btnSelFicheroPlantillaPedidoVenta_Click(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
int _rint = 0;
String _srutaficherosel = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="If RutaFicheroSeleccionado<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((__ref._rutaficheroseleccionado /*String*/ ).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Ya s";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselficheroplantillapedidoventa_click"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("Ya se ha seleccionado previamente un fichero.\n"+"¿Continuar?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=36306949;
 //BA.debugLineNum = 36306949;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=36306952;
 //BA.debugLineNum = 36306952;BA.debugLine="RutaFicheroSeleccionado=\"\"";
__ref._rutaficheroseleccionado /*String*/  = "";
RDebugUtils.currentLine=36306953;
 //BA.debugLineNum = 36306953;BA.debugLine="LimpiarDatos";
__ref._limpiardatos /*String*/ (null);
RDebugUtils.currentLine=36306955;
 //BA.debugLineNum = 36306955;BA.debugLine="wait for(SeleccionFicheroCarpetaRed) complete (sR";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselficheroplantillapedidoventa_click"), __ref._seleccionficherocarpetared /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 16;
return;
case 16:
//C
this.state = 11;
_srutaficherosel = (String) result[1];
;
RDebugUtils.currentLine=36306956;
 //BA.debugLineNum = 36306956;BA.debugLine="If sRutaFicheroSel=\"\" Then";
if (true) break;

case 11:
//if
this.state = 14;
if ((_srutaficherosel).equals("")) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=36306957;
 //BA.debugLineNum = 36306957;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado fichero","Aviso");
RDebugUtils.currentLine=36306958;
 //BA.debugLineNum = 36306958;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "btnselficheroplantillapedidoventa_click"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 14;
;
RDebugUtils.currentLine=36306959;
 //BA.debugLineNum = 36306959;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=36306961;
 //BA.debugLineNum = 36306961;BA.debugLine="RutaFicheroSeleccionado=sRutaFicheroSel";
__ref._rutaficheroseleccionado /*String*/  = _srutaficherosel;
RDebugUtils.currentLine=36306962;
 //BA.debugLineNum = 36306962;BA.debugLine="txtFicheroSeleccionado.Text=RutaFicheroSelecciona";
__ref._txtficheroseleccionado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._rutaficheroseleccionado /*String*/ );
RDebugUtils.currentLine=36306964;
 //BA.debugLineNum = 36306964;BA.debugLine="ProcesoCabeceraFicheroSeleccionado";
__ref._procesocabeceraficheroseleccionado /*String*/ (null);
RDebugUtils.currentLine=36306965;
 //BA.debugLineNum = 36306965;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _limpiardatos(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "limpiardatos", false))
	 {return ((String) Debug.delegate(ba, "limpiardatos", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xnode = null;
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Sub LimpiarDatos";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="DatosPlantillaPedidoVentaCab.Initialize";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .Initialize();
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="CampoBusqueda=\"Cliente\"";
__ref._campobusqueda /*String*/  = "Cliente";
RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="For Each xNode As B4XView In pnlFondoGeneracionFi";
_xnode = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._pnlfondogeneracionficheroscsvpedidosventa /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_xnode = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="If xNode Is TextField Then";
if (_xnode.getObjectOrNull() instanceof javafx.scene.control.TextField) { 
RDebugUtils.currentLine=36438025;
 //BA.debugLineNum = 36438025;BA.debugLine="xNode.Text=\"\"";
_xnode.setText("");
 };
 }
};
RDebugUtils.currentLine=36438029;
 //BA.debugLineNum = 36438029;BA.debugLine="jamTableView1.LimpiarTabla";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=36438030;
 //BA.debugLineNum = 36438030;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionficherocarpetared(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "seleccionficherocarpetared", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionficherocarpetared", null));}
ResumableSub_SeleccionFicheroCarpetaRed rsub = new ResumableSub_SeleccionFicheroCarpetaRed(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionFicheroCarpetaRed extends BA.ResumableSub {
public ResumableSub_SeleccionFicheroCarpetaRed(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _filename = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="fc.Title=\"Selecciona Fichero\"";
_fc.setTitle("Selecciona Fichero");
RDebugUtils.currentLine=36241413;
 //BA.debugLineNum = 36241413;BA.debugLine="fc.SetExtensionFilter(\"Ficheros texto\", Array As";
_fc.SetExtensionFilter("Ficheros texto",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.xlsx","*.xls"}));
RDebugUtils.currentLine=36241416;
 //BA.debugLineNum = 36241416;BA.debugLine="fc.InitialDirectory=Utilidades.FindUserDocumentsF";
_fc.setInitialDirectory(parent._utilidades._finduserdocumentsfolder /*String*/ ());
RDebugUtils.currentLine=36241417;
 //BA.debugLineNum = 36241417;BA.debugLine="Dim fileName As String = fc.ShowOpen(frm)";
_filename = _fc.ShowOpen(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=36241418;
 //BA.debugLineNum = 36241418;BA.debugLine="Return fileName";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_filename));return;};
RDebugUtils.currentLine=36241420;
 //BA.debugLineNum = 36241420;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _procesocabeceraficheroseleccionado(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "procesocabeceraficheroseleccionado", false))
	 {return ((String) Debug.delegate(ba, "procesocabeceraficheroseleccionado", null));}
b4j.docU.xlutils _xl = null;
b4j.docU.xlreaderresult _xlresult = null;
String _dateformatant = "";
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Sub ProcesoCabeceraFicheroSeleccionado";
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="Dim xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="xl.Initialize";
_xl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="Dim xlResult As XLReaderResult=xl.Reader.ReadShee";
_xlresult = _xl._reader /*b4j.docU.xlreader*/ ._readsheetbyindex /*b4j.docU.xlreaderresult*/ (null,__c.File.GetFileParent(__ref._rutaficheroseleccionado /*String*/ ),__c.File.GetName(__ref._rutaficheroseleccionado /*String*/ ),(int) (0));
RDebugUtils.currentLine=36372485;
 //BA.debugLineNum = 36372485;BA.debugLine="DatosPlantillaPedidoVentaCab.CIFCliente=xlResult.";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CIFCliente /*String*/  = BA.ObjectToString(_xlresult._get /*Object*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"C5")));
RDebugUtils.currentLine=36372486;
 //BA.debugLineNum = 36372486;BA.debugLine="DatosPlantillaPedidoVentaCab.DocumentoExterno=xlR";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .DocumentoExterno /*String*/  = BA.ObjectToString(_xlresult._get /*Object*/ (null,_xl._addressname /*b4j.docU.xlutils._xladdress*/ (null,"C13")));
RDebugUtils.currentLine=36372487;
 //BA.debugLineNum = 36372487;BA.debugLine="txtCIFCliente.text=DatosPlantillaPedidoVentaCab.C";
__ref._txtcifcliente /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CIFCliente /*String*/ );
RDebugUtils.currentLine=36372488;
 //BA.debugLineNum = 36372488;BA.debugLine="txtDocumentoExterno.text=DatosPlantillaPedidoVent";
__ref._txtdocumentoexterno /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .DocumentoExterno /*String*/ );
RDebugUtils.currentLine=36372489;
 //BA.debugLineNum = 36372489;BA.debugLine="DatosPlantillaPedidoVentaCab.FechaPedidoCliente=D";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=36372490;
 //BA.debugLineNum = 36372490;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=36372491;
 //BA.debugLineNum = 36372491;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=36372492;
 //BA.debugLineNum = 36372492;BA.debugLine="txtFechaPedidoCliente.Text=DateTime.Date(DatosPla";
__ref._txtfechapedidocliente /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__c.DateTime.Date(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/ ));
RDebugUtils.currentLine=36372493;
 //BA.debugLineNum = 36372493;BA.debugLine="DatosPlantillaPedidoVentaCab.AlmacenOrigen=\"0001\"";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/  = "0001";
RDebugUtils.currentLine=36372494;
 //BA.debugLineNum = 36372494;BA.debugLine="txtAlmacen.Text=DatosPlantillaPedidoVentaCab.Alma";
__ref._txtalmacen /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/ );
RDebugUtils.currentLine=36372495;
 //BA.debugLineNum = 36372495;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=36372496;
 //BA.debugLineNum = 36372496;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargaclientesdireccionesenviodw(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "cargaclientesdireccionesenviodw", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargaclientesdireccionesenviodw", null));}
ResumableSub_CargaClientesDireccionesEnvioDW rsub = new ResumableSub_CargaClientesDireccionesEnvioDW(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaClientesDireccionesEnvioDW extends BA.ResumableSub {
public ResumableSub_CargaClientesDireccionesEnvioDW(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFiche";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW");
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=36503557;
 //BA.debugLineNum = 36503557;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=36503559;
 //BA.debugLineNum = 36503559;BA.debugLine="Dim Comando As String=\"ClientesDireccionesEnvioDW";
_comando = "ClientesDireccionesEnvioDW";
RDebugUtils.currentLine=36503560;
 //BA.debugLineNum = 36503560;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=36503562;
 //BA.debugLineNum = 36503562;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargaclientesdireccionesenviodw"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=36503564;
 //BA.debugLineNum = 36503564;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=36503565;
 //BA.debugLineNum = 36503565;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=36503566;
 //BA.debugLineNum = 36503566;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=36503567;
 //BA.debugLineNum = 36503567;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargaclientesdireccionesenviodw"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=36503568;
 //BA.debugLineNum = 36503568;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=36503569;
 //BA.debugLineNum = 36503569;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=36503572;
 //BA.debugLineNum = 36503572;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=36503573;
 //BA.debugLineNum = 36503573;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=36503574;
 //BA.debugLineNum = 36503574;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de clientes-direcciones envío de navision.","Error");
RDebugUtils.currentLine=36503575;
 //BA.debugLineNum = 36503575;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargaclientesdireccionesenviodw"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=36503576;
 //BA.debugLineNum = 36503576;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=36503577;
 //BA.debugLineNum = 36503577;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=36503579;
 //BA.debugLineNum = 36503579;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=36503580;
 //BA.debugLineNum = 36503580;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=36503581;
 //BA.debugLineNum = 36503581;BA.debugLine="Utilidades.LogStringCrearTablaDesdeMap(\"tblEval";
parent._utilidades._logstringcreartabladesdemap /*String*/ ("tblEvaluacionProveedores",_mdata0,"");
RDebugUtils.currentLine=36503582;
 //BA.debugLineNum = 36503582;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=36503583;
 //BA.debugLineNum = 36503583;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=36503584;
 //BA.debugLineNum = 36503584;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW",_lstreg);
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
RDebugUtils.currentLine=36503587;
 //BA.debugLineNum = 36503587;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=36503588;
 //BA.debugLineNum = 36503588;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargagrpclientepedido(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "cargagrpclientepedido", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargagrpclientepedido", null));}
ResumableSub_CargaGRPClientePedido rsub = new ResumableSub_CargaGRPClientePedido(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaGRPClientePedido extends BA.ResumableSub {
public ResumableSub_CargaGRPClientePedido(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=37879817;
 //BA.debugLineNum = 37879817;BA.debugLine="Dim Comando As String=\"GRPCodigoCliente\"";
_comando = "GRPCodigoCliente";
RDebugUtils.currentLine=37879818;
 //BA.debugLineNum = 37879818;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ )},parent);
RDebugUtils.currentLine=37879819;
 //BA.debugLineNum = 37879819;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargagrpclientepedido"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=37879821;
 //BA.debugLineNum = 37879821;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=37879822;
 //BA.debugLineNum = 37879822;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=37879823;
 //BA.debugLineNum = 37879823;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=37879824;
 //BA.debugLineNum = 37879824;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargagrpclientepedido"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=37879825;
 //BA.debugLineNum = 37879825;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=37879826;
 //BA.debugLineNum = 37879826;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=37879828;
 //BA.debugLineNum = 37879828;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=37879829;
 //BA.debugLineNum = 37879829;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=37879830;
 //BA.debugLineNum = 37879830;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos navision para el cliente "+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ))+"."),"Error");
RDebugUtils.currentLine=37879831;
 //BA.debugLineNum = 37879831;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargagrpclientepedido"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=37879832;
 //BA.debugLineNum = 37879832;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=37879833;
 //BA.debugLineNum = 37879833;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=37879835;
 //BA.debugLineNum = 37879835;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=37879836;
 //BA.debugLineNum = 37879836;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=37879837;
 //BA.debugLineNum = 37879837;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=37879838;
 //BA.debugLineNum = 37879838;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=37879842;
 //BA.debugLineNum = 37879842;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=37879843;
 //BA.debugLineNum = 37879843;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargatarifaventavalidaactualaplicableclientepedido(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,int _tipotarifa,String _codigotarifa,boolean _borrartabla) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "cargatarifaventavalidaactualaplicableclientepedido", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargatarifaventavalidaactualaplicableclientepedido", new Object[] {_tipotarifa,_codigotarifa,_borrartabla}));}
ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido rsub = new ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido(this,__ref,_tipotarifa,_codigotarifa,_borrartabla);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido extends BA.ResumableSub {
public ResumableSub_CargaTarifaVentaValidaActualAplicableClientePedido(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,int _tipotarifa,String _codigotarifa,boolean _borrartabla) {
this.parent = parent;
this.__ref = __ref;
this._tipotarifa = _tipotarifa;
this._codigotarifa = _codigotarifa;
this._borrartabla = _borrartabla;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
int _tipotarifa;
String _codigotarifa;
boolean _borrartabla;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="If BorrarTabla Then mSQL.ExecNonQuery(\"delete fro";
if (true) break;

case 1:
//if
this.state = 6;
if (_borrartabla) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente");
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="Dim Comando As String=\"TarifaVentaActualTipoTarif";
_comando = "TarifaVentaActualTipoTarifaCodigoTarifa";
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_tipotarifa),(Object)(_codigotarifa)},parent);
RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargatarifaventavalidaactualaplicableclientepedido"), null);
this.state = 19;
return;
case 19:
//C
this.state = 7;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=37945360;
 //BA.debugLineNum = 37945360;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 7:
//if
this.state = 18;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
RDebugUtils.currentLine=37945361;
 //BA.debugLineNum = 37945361;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=37945362;
 //BA.debugLineNum = 37945362;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=37945363;
 //BA.debugLineNum = 37945363;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "cargatarifaventavalidaactualaplicableclientepedido"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=37945365;
 //BA.debugLineNum = 37945365;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=37945367;
 //BA.debugLineNum = 37945367;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 12:
//if
this.state = 17;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=37945368;
 //BA.debugLineNum = 37945368;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=37945371;
 //BA.debugLineNum = 37945371;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=37945372;
 //BA.debugLineNum = 37945372;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=37945374;
 //BA.debugLineNum = 37945374;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=37945375;
 //BA.debugLineNum = 37945375;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=37945376;
 //BA.debugLineNum = 37945376;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=37945377;
 //BA.debugLineNum = 37945377;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=37945380;
 //BA.debugLineNum = 37945380;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente",_lstreg);
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
RDebugUtils.currentLine=37945383;
 //BA.debugLineNum = 37945383;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=37945384;
 //BA.debugLineNum = 37945384;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkdatoscabeceraobligatorios(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "checkdatoscabeceraobligatorios", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkdatoscabeceraobligatorios", null));}
ResumableSub_CheckDatosCabeceraObligatorios rsub = new ResumableSub_CheckDatosCabeceraObligatorios(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckDatosCabeceraObligatorios extends BA.ResumableSub {
public ResumableSub_CheckDatosCabeceraObligatorios(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
Object _msa = null;
int _numdirenv = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="If DatosPlantillaPedidoVentaCab.CodigoCliente=\"\"";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El Código de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El Código de Cliente es obligatorio.","Aviso");
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 4;
;
RDebugUtils.currentLine=37683205;
 //BA.debugLineNum = 37683205;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="Dim NumDirEnv As Int=mSQL.ExecQuerySingleResult2(";
_numdirenv = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where CodigoCliente=? and CodigoDireccionEnvio<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ,""}))));
RDebugUtils.currentLine=37683211;
 //BA.debugLineNum = 37683211;BA.debugLine="If NumDirEnv>0 And DatosPlantillaPedidoVentaCab.C";
if (true) break;

case 5:
//if
this.state = 8;
if (_numdirenv>0 && (__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoDireccionEnvio /*String*/ ).equals("")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=37683212;
 //BA.debugLineNum = 37683212;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El Cliente s";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El Cliente seleccionado ("+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ))+") tiene direcciones de envío.\n"+"Es obligatorio seleccionar Dirección de envío."),"Aviso");
RDebugUtils.currentLine=37683214;
 //BA.debugLineNum = 37683214;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 8;
;
RDebugUtils.currentLine=37683215;
 //BA.debugLineNum = 37683215;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=37683218;
 //BA.debugLineNum = 37683218;BA.debugLine="If DatosPlantillaPedidoVentaCab.AlmacenOrigen=\"\"";

case 8:
//if
this.state = 11;
if ((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/ ).equals("")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=37683219;
 //BA.debugLineNum = 37683219;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El Almacén de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El Almacén de Origen es obligatorio.","Aviso");
RDebugUtils.currentLine=37683220;
 //BA.debugLineNum = 37683220;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 11;
;
RDebugUtils.currentLine=37683221;
 //BA.debugLineNum = 37683221;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=37683224;
 //BA.debugLineNum = 37683224;BA.debugLine="If DatosPlantillaPedidoVentaCab.FechaPedidoClient";

case 11:
//if
this.state = 14;
if (__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/ ==0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=37683225;
 //BA.debugLineNum = 37683225;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La Fecha de P";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La Fecha de Pedido de cliente es obligatoria.","Aviso");
RDebugUtils.currentLine=37683226;
 //BA.debugLineNum = 37683226;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 14;
;
RDebugUtils.currentLine=37683227;
 //BA.debugLineNum = 37683227;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=37683230;
 //BA.debugLineNum = 37683230;BA.debugLine="If DatosPlantillaPedidoVentaCab.DocumentoExterno=";

case 14:
//if
this.state = 17;
if ((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .DocumentoExterno /*String*/ ).equals(BA.NumberToString(0))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=37683231;
 //BA.debugLineNum = 37683231;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El documento";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El documento externo (Pedido de cliente) es obligatorio.","Aviso");
RDebugUtils.currentLine=37683232;
 //BA.debugLineNum = 37683232;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "checkdatoscabeceraobligatorios"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 17;
;
RDebugUtils.currentLine=37683233;
 //BA.debugLineNum = 37683233;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=37683236;
 //BA.debugLineNum = 37683236;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=37683237;
 //BA.debugLineNum = 37683237;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _chkboxfiltrocif_checkedchange(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "chkboxfiltrocif_checkedchange", false))
	 {return ((String) Debug.delegate(ba, "chkboxfiltrocif_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub chkboxFiltroCIF_CheckedChange(Checked";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="txtBuscarClienteDireccionEnvio.Text=\"\"";
__ref._txtbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="ActualizarDatosCLV";
__ref._actualizardatosclv /*String*/ (null);
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=35782661;
 //BA.debugLineNum = 35782661;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=35782663;
 //BA.debugLineNum = 35782663;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=35782665;
 //BA.debugLineNum = 35782665;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=35782666;
 //BA.debugLineNum = 35782666;BA.debugLine="Private btnSalir As B4XView";
_btnsalir = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782668;
 //BA.debugLineNum = 35782668;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=35782670;
 //BA.debugLineNum = 35782670;BA.debugLine="Private RutaFicheroSeleccionado As String";
_rutaficheroseleccionado = "";
RDebugUtils.currentLine=35782672;
 //BA.debugLineNum = 35782672;BA.debugLine="Private btnSelFicheroFTP As B4XView";
_btnselficheroftp = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782673;
 //BA.debugLineNum = 35782673;BA.debugLine="Private txtFicheroSeleccionado As B4XView";
_txtficheroseleccionado = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782674;
 //BA.debugLineNum = 35782674;BA.debugLine="Private txtCIFCliente As B4XView";
_txtcifcliente = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782675;
 //BA.debugLineNum = 35782675;BA.debugLine="Private pnlFondoGeneracionFicherosCSVPedidosVenta";
_pnlfondogeneracionficheroscsvpedidosventa = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782676;
 //BA.debugLineNum = 35782676;BA.debugLine="Private lblItemBuscarCienteDireccionEnvio As B4XV";
_lblitembuscarcientedireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782677;
 //BA.debugLineNum = 35782677;BA.debugLine="Private lblCancelarBuscarClienteDireccionEnvio As";
_lblcancelarbuscarclientedireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782678;
 //BA.debugLineNum = 35782678;BA.debugLine="Private lblTitleBuscarClienteDireccionEnvio As B4";
_lbltitlebuscarclientedireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782679;
 //BA.debugLineNum = 35782679;BA.debugLine="Private lblTitleDatoBuscar As B4XView";
_lbltitledatobuscar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782680;
 //BA.debugLineNum = 35782680;BA.debugLine="Private pnlFondoBuscarClienteDireccionEnvio As B4";
_pnlfondobuscarclientedireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782681;
 //BA.debugLineNum = 35782681;BA.debugLine="Private txtBuscarClienteDireccionEnvio As B4XView";
_txtbuscarclientedireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782682;
 //BA.debugLineNum = 35782682;BA.debugLine="Private chkboxFiltroCIF As CheckBox";
_chkboxfiltrocif = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=35782683;
 //BA.debugLineNum = 35782683;BA.debugLine="Private CLVBuscarClienteDireccionEnvio As CustomL";
_clvbuscarclientedireccionenvio = new b4j.example.customlistview();
RDebugUtils.currentLine=35782685;
 //BA.debugLineNum = 35782685;BA.debugLine="Private AnchoCLV As Double";
_anchoclv = 0;
RDebugUtils.currentLine=35782686;
 //BA.debugLineNum = 35782686;BA.debugLine="Private mAlturaItems As Double";
_malturaitems = 0;
RDebugUtils.currentLine=35782687;
 //BA.debugLineNum = 35782687;BA.debugLine="Public ColorFondoPanelItemsImpares As Int";
_colorfondopanelitemsimpares = 0;
RDebugUtils.currentLine=35782688;
 //BA.debugLineNum = 35782688;BA.debugLine="Public ColorFondoPanelItemsPares As Int";
_colorfondopanelitemspares = 0;
RDebugUtils.currentLine=35782689;
 //BA.debugLineNum = 35782689;BA.debugLine="Private ArrayColoresItems(2) As Int";
_arraycoloresitems = new int[(int) (2)];
;
RDebugUtils.currentLine=35782691;
 //BA.debugLineNum = 35782691;BA.debugLine="Private BackgroundBuscarClienteDireccionEnvio As";
_backgroundbuscarclientedireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782692;
 //BA.debugLineNum = 35782692;BA.debugLine="Private BaseBuscarClienteDireccionEnvio As B4XVie";
_basebuscarclientedireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782693;
 //BA.debugLineNum = 35782693;BA.debugLine="Private CampoBusqueda As String";
_campobusqueda = "";
RDebugUtils.currentLine=35782700;
 //BA.debugLineNum = 35782700;BA.debugLine="Private txtCodigoCliente As B4XView";
_txtcodigocliente = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782701;
 //BA.debugLineNum = 35782701;BA.debugLine="Private txtNombreCliente As B4XView";
_txtnombrecliente = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782702;
 //BA.debugLineNum = 35782702;BA.debugLine="Private txtCodigoDireccionEnvio As B4XView";
_txtcodigodireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782703;
 //BA.debugLineNum = 35782703;BA.debugLine="Private txtNombreDireccionEnvio As B4XView";
_txtnombredireccionenvio = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782704;
 //BA.debugLineNum = 35782704;BA.debugLine="Private btnSelDocumentoExterno As B4XView";
_btnseldocumentoexterno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782705;
 //BA.debugLineNum = 35782705;BA.debugLine="Private txtDocumentoExterno As B4XView";
_txtdocumentoexterno = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782706;
 //BA.debugLineNum = 35782706;BA.debugLine="Private btnSelFechaPedidoCliente As B4XView";
_btnselfechapedidocliente = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782707;
 //BA.debugLineNum = 35782707;BA.debugLine="Private txtFechaPedidoCliente As B4XView";
_txtfechapedidocliente = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782708;
 //BA.debugLineNum = 35782708;BA.debugLine="Private btnSelAlmacen As B4XView";
_btnselalmacen = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782709;
 //BA.debugLineNum = 35782709;BA.debugLine="Private txtAlmacen As B4XView";
_txtalmacen = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782711;
 //BA.debugLineNum = 35782711;BA.debugLine="Type TipoDatosPlantillaPedidoVentaCab (CodigoClie";
;
RDebugUtils.currentLine=35782714;
 //BA.debugLineNum = 35782714;BA.debugLine="Private DatosPlantillaPedidoVentaCab As TipoDatos";
_datosplantillapedidoventacab = new b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab();
RDebugUtils.currentLine=35782717;
 //BA.debugLineNum = 35782717;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=35782718;
 //BA.debugLineNum = 35782718;BA.debugLine="End Sub";
return "";
}
public void  _clvbuscarclientedireccionenvio_itemclick(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,int _index,Object _value) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "clvbuscarclientedireccionenvio_itemclick", false))
	 {Debug.delegate(ba, "clvbuscarclientedireccionenvio_itemclick", new Object[] {_index,_value}); return;}
ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick rsub = new ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick(this,__ref,_index,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick extends BA.ResumableSub {
public ResumableSub_CLVBuscarClienteDireccionEnvio_ItemClick(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,int _index,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._value = _value;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
int _index;
Object _value;
String _sdata = "";
String _clientesel = "";
int _primerguion = 0;
int _segundoguion = 0;
String _nombreclientesel = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdatareg = null;
String _direnviosel = "";
String _nombredirenviosel = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="Dim sData As String=Value";
_sdata = BA.ObjectToString(_value);
RDebugUtils.currentLine=36765699;
 //BA.debugLineNum = 36765699;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
parent.__c.LogImpl("836765699","Datos Item seleccionado ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=36765701;
 //BA.debugLineNum = 36765701;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveAllVi";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=36765702;
 //BA.debugLineNum = 36765702;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveViewF";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=36765704;
 //BA.debugLineNum = 36765704;BA.debugLine="Select Case CampoBusqueda";
if (true) break;

case 1:
//select
this.state = 21;
switch (BA.switchObjectToInt(__ref._campobusqueda /*String*/ ,"Cliente","DireccionEnvio")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 20;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=36765707;
 //BA.debugLineNum = 36765707;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Cargando datos de cliente...")));
RDebugUtils.currentLine=36765708;
 //BA.debugLineNum = 36765708;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=36765709;
 //BA.debugLineNum = 36765709;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFic";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente");
RDebugUtils.currentLine=36765711;
 //BA.debugLineNum = 36765711;BA.debugLine="Dim ClienteSel As String=mSQL.ExecQuerySingleRe";
_clientesel = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select distinct CodigoCliente from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where ClienteComb=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_sdata}));
RDebugUtils.currentLine=36765713;
 //BA.debugLineNum = 36765713;BA.debugLine="Dim PrimerGuion As Int=sData.IndexOf2(\"_\",0)";
_primerguion = _sdata.indexOf("_",(int) (0));
RDebugUtils.currentLine=36765714;
 //BA.debugLineNum = 36765714;BA.debugLine="Dim SegundoGuion As Int=sData.IndexOf2(\"_\",Prim";
_segundoguion = _sdata.indexOf("_",(int) (_primerguion+1));
RDebugUtils.currentLine=36765715;
 //BA.debugLineNum = 36765715;BA.debugLine="Dim NombreClienteSel As String=sData.SubString2";
_nombreclientesel = _sdata.substring((int) (_primerguion+1),_segundoguion);
RDebugUtils.currentLine=36765716;
 //BA.debugLineNum = 36765716;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoCliente=Clie";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/  = _clientesel;
RDebugUtils.currentLine=36765717;
 //BA.debugLineNum = 36765717;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreCliente=Nomb";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .NombreCliente /*String*/  = _nombreclientesel;
RDebugUtils.currentLine=36765718;
 //BA.debugLineNum = 36765718;BA.debugLine="txtCodigoCliente.Text=DatosPlantillaPedidoVenta";
__ref._txtcodigocliente /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ );
RDebugUtils.currentLine=36765719;
 //BA.debugLineNum = 36765719;BA.debugLine="txtNombreCliente.Text=DatosPlantillaPedidoVenta";
__ref._txtnombrecliente /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .NombreCliente /*String*/ );
RDebugUtils.currentLine=36765721;
 //BA.debugLineNum = 36765721;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Cargando datos de tipo tarifa y codigo tarifa precios venta cliente "+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ))+"...")));
RDebugUtils.currentLine=36765722;
 //BA.debugLineNum = 36765722;BA.debugLine="Wait For(CargaGRPClientePedido) complete (mRes";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), __ref._cargagrpclientepedido /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=36765723;
 //BA.debugLineNum = 36765723;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=36765724;
 //BA.debugLineNum = 36765724;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_accion).equals("NOK")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=36765725;
 //BA.debugLineNum = 36765725;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=36765726;
 //BA.debugLineNum = 36765726;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible cargar el tipo tarifa y código tarifa de precios aplicables al cliente seleccionado "+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ))+""),"Aviso");
RDebugUtils.currentLine=36765727;
 //BA.debugLineNum = 36765727;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
RDebugUtils.currentLine=36765728;
 //BA.debugLineNum = 36765728;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=36765730;
 //BA.debugLineNum = 36765730;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=36765731;
 //BA.debugLineNum = 36765731;BA.debugLine="Dim mDataReg As Map=lstReg.Get(0)";
_mdatareg = new anywheresoftware.b4a.objects.collections.Map();
_mdatareg = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=36765732;
 //BA.debugLineNum = 36765732;BA.debugLine="DatosPlantillaPedidoVentaCab.GRPCliente=mDataRe";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .GRPCliente /*String*/  = BA.ObjectToString(_mdatareg.Get((Object)("GRP")));
RDebugUtils.currentLine=36765734;
 //BA.debugLineNum = 36765734;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Cargando datos de precios venta del cliente "+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ))+"...")));
RDebugUtils.currentLine=36765735;
 //BA.debugLineNum = 36765735;BA.debugLine="Wait For(CargaTarifaVentaValidaActualAplicableC";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), __ref._cargatarifaventavalidaactualaplicableclientepedido /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ,parent.__c.True));
this.state = 24;
return;
case 24:
//C
this.state = 8;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=36765736;
 //BA.debugLineNum = 36765736;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=36765737;
 //BA.debugLineNum = 36765737;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((_accion).equals("NOK")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=36765738;
 //BA.debugLineNum = 36765738;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=36765739;
 //BA.debugLineNum = 36765739;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible cargar los datos de la tarifa de precios del cliente seleccionado "+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ))+""),"Aviso");
RDebugUtils.currentLine=36765740;
 //BA.debugLineNum = 36765740;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 11;
;
 if (true) break;
;
RDebugUtils.currentLine=36765743;
 //BA.debugLineNum = 36765743;BA.debugLine="If DatosPlantillaPedidoVentaCab.GRPCliente<>\"\"";

case 11:
//if
this.state = 18;
if ((__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .GRPCliente /*String*/ ).equals("") == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=36765744;
 //BA.debugLineNum = 36765744;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Cargando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Cargando datos de precios venta del grupo precios cliente "+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .GRPCliente /*String*/ ))+"...")));
RDebugUtils.currentLine=36765745;
 //BA.debugLineNum = 36765745;BA.debugLine="Wait For(CargaTarifaVentaValidaActualAplicable";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), __ref._cargatarifaventavalidaactualaplicableclientepedido /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (1),__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .GRPCliente /*String*/ ,parent.__c.False));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=36765746;
 //BA.debugLineNum = 36765746;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=36765747;
 //BA.debugLineNum = 36765747;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_accion).equals("NOK")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=36765748;
 //BA.debugLineNum = 36765748;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=36765749;
 //BA.debugLineNum = 36765749;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sid";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible cargar los datos de la tarifa de precios del grupo precios cliente seleccionado "+parent.__c.SmartStringFormatter("",(Object)(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .GRPCliente /*String*/ ))+""),"Aviso");
RDebugUtils.currentLine=36765750;
 //BA.debugLineNum = 36765750;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "clvbuscarclientedireccionenvio_itemclick"), _msa);
this.state = 27;
return;
case 27:
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
this.state = 21;
;
RDebugUtils.currentLine=36765754;
 //BA.debugLineNum = 36765754;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=36765759;
 //BA.debugLineNum = 36765759;BA.debugLine="Dim DirEnvioSel As String=mSQL.ExecQuerySingleR";
_direnviosel = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select distinct CodigoDireccionEnvio from tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW where DireccionEnvioComb=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_sdata}));
RDebugUtils.currentLine=36765761;
 //BA.debugLineNum = 36765761;BA.debugLine="Dim PrimerGuion As Int=sData.IndexOf2(\"_\",0)";
_primerguion = _sdata.indexOf("_",(int) (0));
RDebugUtils.currentLine=36765762;
 //BA.debugLineNum = 36765762;BA.debugLine="Dim SegundoGuion As Int=sData.IndexOf2(\"_\",Prim";
_segundoguion = _sdata.indexOf("_",(int) (_primerguion+1));
RDebugUtils.currentLine=36765763;
 //BA.debugLineNum = 36765763;BA.debugLine="Dim NombreDirEnvioSel As String=sData.SubString";
_nombredirenviosel = _sdata.substring((int) (_primerguion+1),_segundoguion);
RDebugUtils.currentLine=36765764;
 //BA.debugLineNum = 36765764;BA.debugLine="DatosPlantillaPedidoVentaCab.CodigoDireccionEnv";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoDireccionEnvio /*String*/  = _direnviosel;
RDebugUtils.currentLine=36765765;
 //BA.debugLineNum = 36765765;BA.debugLine="DatosPlantillaPedidoVentaCab.NombreDireccionEnv";
__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .NombreDireccionEnvio /*String*/  = _nombredirenviosel;
RDebugUtils.currentLine=36765766;
 //BA.debugLineNum = 36765766;BA.debugLine="txtCodigoDireccionEnvio.Text=DatosPlantillaPedi";
__ref._txtcodigodireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoDireccionEnvio /*String*/ );
RDebugUtils.currentLine=36765768;
 //BA.debugLineNum = 36765768;BA.debugLine="txtNombreDireccionEnvio.Text=sData.Replace(\"_\",";
__ref._txtnombredireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_sdata.replace("_","   "));
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=36765776;
 //BA.debugLineNum = 36765776;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _clvbuscarclientedireccionenvio_itemlongclick(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "clvbuscarclientedireccionenvio_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "clvbuscarclientedireccionenvio_itemlongclick", new Object[] {_index,_value}));}
String _sdata = "";
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Sub CLVBuscarClienteDireccionEnvio_ItemLongClick(I";
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="Dim sData As String=Value";
_sdata = BA.ObjectToString(_value);
RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
__c.LogImpl("836831235","Datos Item seleccionado botón secundario ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="End Sub";
return "";
}
public String  _clvbuscarclientedireccionenvio_visiblerangechanged(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "clvbuscarclientedireccionenvio_visiblerangechanged", false))
	 {return ((String) Debug.delegate(ba, "clvbuscarclientedireccionenvio_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _extrasize = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
String _sdata = "";
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Sub CLVBuscarClienteDireccionEnvio_VisibleRangeCha";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="Dim ExtraSize As Int = 30 'Add 5 items at a time,";
_extrasize = (int) (30);
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="For i = Max(0, FirstIndex - ExtraSize) To Min(Las";
{
final int step2 = 1;
final int limit2 = (int) (__c.Min(_lastindex+_extrasize,__ref._clvbuscarclientedireccionenvio /*b4j.example.customlistview*/ ._getsize()-1));
_i = (int) (__c.Max(0,_firstindex-_extrasize)) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=36700163;
 //BA.debugLineNum = 36700163;BA.debugLine="Dim Pnl As B4XView = CLVBuscarClienteDireccionEn";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._clvbuscarclientedireccionenvio /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=36700171;
 //BA.debugLineNum = 36700171;BA.debugLine="If i > FirstIndex - ExtraSize And i < LastIndex";
if (_i>_firstindex-_extrasize && _i<_lastindex+_extrasize) { 
RDebugUtils.currentLine=36700172;
 //BA.debugLineNum = 36700172;BA.debugLine="If Pnl.NumberOfViews = 0 Then 'Add items to the";
if (_pnl.getNumberOfViews()==0) { 
RDebugUtils.currentLine=36700174;
 //BA.debugLineNum = 36700174;BA.debugLine="Dim sData As String = CLVBuscarClienteDireccio";
_sdata = BA.ObjectToString(__ref._clvbuscarclientedireccionenvio /*b4j.example.customlistview*/ ._getvalue(_i));
RDebugUtils.currentLine=36700175;
 //BA.debugLineNum = 36700175;BA.debugLine="Pnl.LoadLayout(\"scrGeneracionFicherosCSVPlanti";
_pnl.LoadLayout("scrGeneracionFicherosCSVPlantillaPedidosVentaItemListaBuscar",ba);
RDebugUtils.currentLine=36700177;
 //BA.debugLineNum = 36700177;BA.debugLine="lblItemBuscarCienteDireccionEnvio.Text=sData";
__ref._lblitembuscarcientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_sdata);
 };
 }else {
RDebugUtils.currentLine=36700218;
 //BA.debugLineNum = 36700218;BA.debugLine="If Pnl.NumberOfViews > 0 Then";
if (_pnl.getNumberOfViews()>0) { 
RDebugUtils.currentLine=36700219;
 //BA.debugLineNum = 36700219;BA.debugLine="Pnl.RemoveAllViews 'Remove none visible item f";
_pnl.RemoveAllViews();
 };
 };
 }
};
RDebugUtils.currentLine=36700224;
 //BA.debugLineNum = 36700224;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW");
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaClientesDireccionesEnvioDW ([Fila] INTEGER, [CodigoCliente] TEXT, [ClienteComb] TEXT, [CodigoDireccionEnvio] TEXT, [DireccionEnvioComb] TEXT)");
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido");
RDebugUtils.currentLine=36175883;
 //BA.debugLineNum = 36175883;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido ( [ReferenciaCruzada] TEXT, [CodigoArticulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Cantidad] INTEGER, [Precio] REAL)");
RDebugUtils.currentLine=36175884;
 //BA.debugLineNum = 36175884;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=36175886;
 //BA.debugLineNum = 36175886;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo");
RDebugUtils.currentLine=36175888;
 //BA.debugLineNum = 36175888;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo ([CodigoArticulo] TEXT, [TotalCantidad] INTEGER)");
RDebugUtils.currentLine=36175889;
 //BA.debugLineNum = 36175889;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=36175891;
 //BA.debugLineNum = 36175891;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblGenera";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente");
RDebugUtils.currentLine=36175892;
 //BA.debugLineNum = 36175892;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente] ([TipoTarifa] INTEGER, [CodigoTarifa] TEXT\n"+"	, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Variante] TEXT, [Moneda] TEXT, [UM] TEXT, [CantidadMinima] REAL, [PrecioUnitario] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER\n"+"	, [NumTarifa] INTEGER, [UMVenta] TEXT, [FechaCreacion] INTEGER, [CosteUnitario] REAL, [CosteSTD] REAL, [FechaCosteSTD] INTEGER, [GRC] TEXT, [CompraFab] INTEGER\n"+"	, [CosteRazonable] REAL, [FechaCosteRazonable] INTEGER, [Ruta] TEXT, [NombreRuta] TEXT, [LM] TEXT\n"+"	)");
RDebugUtils.currentLine=36175897;
 //BA.debugLineNum = 36175897;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=36175899;
 //BA.debugLineNum = 36175899;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="End Sub";
return "";
}
public void  _generarficherocsvpedidoventa(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "generarficherocsvpedidoventa", false))
	 {Debug.delegate(ba, "generarficherocsvpedidoventa", null); return;}
ResumableSub_GenerarFicheroCSVPedidoVenta rsub = new ResumableSub_GenerarFicheroCSVPedidoVenta(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_GenerarFicheroCSVPedidoVenta extends BA.ResumableSub {
public ResumableSub_GenerarFicheroCSVPedidoVenta(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
int _numlinpedido = 0;
Object _msa = null;
int _rint = 0;
String _carpetaficherocsv = "";
String _uuidpedido = "";
String _idpedido = "";
String _nombreficherocsv = "";
String _codigoclientenav = "";
String _codigodireccionenvionav = "";
String _almacenorigen = "";
String _documentoexterno = "";
String _dateformatant = "";
String _sfechapedidocliente = "";
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
anywheresoftware.b4a.objects.collections.List _lstlineaspedidoventa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rslineaspedido = null;
String[] _arrdatoslineapedido = null;
anywheresoftware.b4a.objects.StringUtils _su = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="Dim NumLinPedido As Int=mSQL.ExecQuerySingleResul";
_numlinpedido = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")));
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="If NumLinPedido=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_numlinpedido==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se han pro";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se han procesado líneas de pedido","Aviso");
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 4;
;
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=37814281;
 //BA.debugLineNum = 37814281;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Gener";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma","¿Generar Fichero CSV para su integración en navision como pedido de venta?","Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=37814282;
 //BA.debugLineNum = 37814282;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=37814284;
 //BA.debugLineNum = 37814284;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\P";
_carpetaficherocsv = "\\\\192.168.10.6\\PendientesNAV";
RDebugUtils.currentLine=37814286;
 //BA.debugLineNum = 37814286;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUIDv4";
_uuidpedido = parent._utilidades._generaruuidv4 /*String*/ ();
RDebugUtils.currentLine=37814287;
 //BA.debugLineNum = 37814287;BA.debugLine="Dim IDPedido As String=$\"PlantillaPedidosVenta_${";
_idpedido = ("PlantillaPedidosVenta_"+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+"");
RDebugUtils.currentLine=37814288;
 //BA.debugLineNum = 37814288;BA.debugLine="Dim NombreFicheroCSV As String=$\"${IDPedido}.csv\"";
_nombreficherocsv = (""+parent.__c.SmartStringFormatter("",(Object)(_idpedido))+".csv");
RDebugUtils.currentLine=37814290;
 //BA.debugLineNum = 37814290;BA.debugLine="Dim CodigoClienteNAV As String=DatosPlantillaPedi";
_codigoclientenav = __ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ;
RDebugUtils.currentLine=37814291;
 //BA.debugLineNum = 37814291;BA.debugLine="Dim CodigoDireccionEnvioNAV As String=DatosPlanti";
_codigodireccionenvionav = __ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoDireccionEnvio /*String*/ ;
RDebugUtils.currentLine=37814292;
 //BA.debugLineNum = 37814292;BA.debugLine="Dim AlmacenOrigen As String=DatosPlantillaPedidoV";
_almacenorigen = __ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .AlmacenOrigen /*String*/ ;
RDebugUtils.currentLine=37814293;
 //BA.debugLineNum = 37814293;BA.debugLine="Dim DocumentoExterno As String=DatosPlantillaPedi";
_documentoexterno = __ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .DocumentoExterno /*String*/ ;
RDebugUtils.currentLine=37814294;
 //BA.debugLineNum = 37814294;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=37814295;
 //BA.debugLineNum = 37814295;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=37814296;
 //BA.debugLineNum = 37814296;BA.debugLine="Dim sFechaPedidoCliente As String=DateTime.Date(D";
_sfechapedidocliente = parent.__c.DateTime.Date(__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .FechaPedidoCliente /*long*/ );
RDebugUtils.currentLine=37814297;
 //BA.debugLineNum = 37814297;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=37814299;
 //BA.debugLineNum = 37814299;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
_lstheaders = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Docuware ID","Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen","FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio"});
RDebugUtils.currentLine=37814302;
 //BA.debugLineNum = 37814302;BA.debugLine="Dim lstLineasPedidoVenta As List";
_lstlineaspedidoventa = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37814303;
 //BA.debugLineNum = 37814303;BA.debugLine="lstLineasPedidoVenta.Initialize";
_lstlineaspedidoventa.Initialize();
RDebugUtils.currentLine=37814305;
 //BA.debugLineNum = 37814305;BA.debugLine="Dim rsLineasPedido As ResultSet=mSQL.ExecQuery(\"s";
_rslineaspedido = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rslineaspedido = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select ReferenciaCruzada, CodigoArticulo, DescripcionArticulo, Talla, Cantidad, Precio from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido");
RDebugUtils.currentLine=37814306;
 //BA.debugLineNum = 37814306;BA.debugLine="Do While rsLineasPedido.NextRow";
if (true) break;

case 11:
//do while
this.state = 14;
while (_rslineaspedido.NextRow()) {
this.state = 13;
if (true) break;
}
if (true) break;

case 13:
//C
this.state = 11;
RDebugUtils.currentLine=37814308;
 //BA.debugLineNum = 37814308;BA.debugLine="Dim ArrDatosLineaPedido(12) As String";
_arrdatoslineapedido = new String[(int) (12)];
java.util.Arrays.fill(_arrdatoslineapedido,"");
RDebugUtils.currentLine=37814309;
 //BA.debugLineNum = 37814309;BA.debugLine="ArrDatosLineaPedido(0)=$\"${UUIDPedido}\"$";
_arrdatoslineapedido[(int) (0)] = (""+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+"");
RDebugUtils.currentLine=37814310;
 //BA.debugLineNum = 37814310;BA.debugLine="ArrDatosLineaPedido(1)=Main.DatosUsuario.NombreA";
_arrdatoslineapedido[(int) (1)] = parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreADUsuarioWindows /*String*/ .toUpperCase();
RDebugUtils.currentLine=37814311;
 //BA.debugLineNum = 37814311;BA.debugLine="ArrDatosLineaPedido(2)=CodigoClienteNAV";
_arrdatoslineapedido[(int) (2)] = _codigoclientenav;
RDebugUtils.currentLine=37814312;
 //BA.debugLineNum = 37814312;BA.debugLine="ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV";
_arrdatoslineapedido[(int) (3)] = _codigodireccionenvionav;
RDebugUtils.currentLine=37814313;
 //BA.debugLineNum = 37814313;BA.debugLine="ArrDatosLineaPedido(4)=DocumentoExterno";
_arrdatoslineapedido[(int) (4)] = _documentoexterno;
RDebugUtils.currentLine=37814314;
 //BA.debugLineNum = 37814314;BA.debugLine="ArrDatosLineaPedido(5)=AlmacenOrigen";
_arrdatoslineapedido[(int) (5)] = _almacenorigen;
RDebugUtils.currentLine=37814315;
 //BA.debugLineNum = 37814315;BA.debugLine="ArrDatosLineaPedido(6)=sFechaPedidoCliente";
_arrdatoslineapedido[(int) (6)] = _sfechapedidocliente;
RDebugUtils.currentLine=37814316;
 //BA.debugLineNum = 37814316;BA.debugLine="ArrDatosLineaPedido(7)=rsLineasPedido.GetString(";
_arrdatoslineapedido[(int) (7)] = _rslineaspedido.GetString("CodigoArticulo");
RDebugUtils.currentLine=37814317;
 //BA.debugLineNum = 37814317;BA.debugLine="ArrDatosLineaPedido(8)=rsLineasPedido.GetString(";
_arrdatoslineapedido[(int) (8)] = _rslineaspedido.GetString("ReferenciaCruzada");
RDebugUtils.currentLine=37814318;
 //BA.debugLineNum = 37814318;BA.debugLine="ArrDatosLineaPedido(9)=rsLineasPedido.GetString(";
_arrdatoslineapedido[(int) (9)] = _rslineaspedido.GetString("Talla");
RDebugUtils.currentLine=37814319;
 //BA.debugLineNum = 37814319;BA.debugLine="ArrDatosLineaPedido(10)=rsLineasPedido.GetInt(\"C";
_arrdatoslineapedido[(int) (10)] = BA.NumberToString(_rslineaspedido.GetInt("Cantidad"));
RDebugUtils.currentLine=37814320;
 //BA.debugLineNum = 37814320;BA.debugLine="ArrDatosLineaPedido(11)=rsLineasPedido.GetDouble";
_arrdatoslineapedido[(int) (11)] = BA.NumberToString(_rslineaspedido.GetDouble("Precio"));
RDebugUtils.currentLine=37814322;
 //BA.debugLineNum = 37814322;BA.debugLine="lstLineasPedidoVenta.Add(ArrDatosLineaPedido)";
_lstlineaspedidoventa.Add((Object)(_arrdatoslineapedido));
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=37814325;
 //BA.debugLineNum = 37814325;BA.debugLine="rsLineasPedido.Close";
_rslineaspedido.Close();
RDebugUtils.currentLine=37814327;
 //BA.debugLineNum = 37814327;BA.debugLine="If lstLineasPedidoVenta.Size>0 Then";
if (true) break;

case 15:
//if
this.state = 24;
if (_lstlineaspedidoventa.getSize()>0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=37814328;
 //BA.debugLineNum = 37814328;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=37814329;
 //BA.debugLineNum = 37814329;BA.debugLine="Try";
if (true) break;

case 18:
//try
this.state = 23;
this.catchState = 22;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 23;
this.catchState = 22;
RDebugUtils.currentLine=37814330;
 //BA.debugLineNum = 37814330;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCSV,";
_su.SaveCSV2(_carpetaficherocsv,_nombreficherocsv,BA.ObjectToChar(";"),_lstlineaspedidoventa,_lstheaders);
RDebugUtils.currentLine=37814331;
 //BA.debugLineNum = 37814331;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero csv";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Fichero csv grabado en el servidor, OK","Aviso");
RDebugUtils.currentLine=37814332;
 //BA.debugLineNum = 37814332;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
RDebugUtils.currentLine=37814334;
 //BA.debugLineNum = 37814334;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("837814334",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=37814335;
 //BA.debugLineNum = 37814335;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No ha sido posible generar el fichero csv. \n"+""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.LastException(ba).getMessage()))+""),"ERROR");
RDebugUtils.currentLine=37814337;
 //BA.debugLineNum = 37814337;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "generarficherocsvpedidoventa"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 23;
;
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
this.state = -1;
;
RDebugUtils.currentLine=37814341;
 //BA.debugLineNum = 37814341;BA.debugLine="End Sub";
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
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
String _tagmenuitem;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,"ProcesarDatosPlantilla","GenerarFicheroCSV")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="Wait For(CheckDatosCabeceraObligatorios) comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "jamtableview1_menubarmenuitem_action"), __ref._checkdatoscabeceraobligatorios /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="If Not(Success) Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.Not(_success)) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=37617671;
 //BA.debugLineNum = 37617671;BA.debugLine="ProcesarLineasPlantillaPedidoVenta";
__ref._procesarlineasplantillapedidoventa /*void*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=37617675;
 //BA.debugLineNum = 37617675;BA.debugLine="GenerarFicheroCSVPedidoVenta";
__ref._generarficherocsvpedidoventa /*void*/ (null);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=37617679;
 //BA.debugLineNum = 37617679;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _procesarlineasplantillapedidoventa(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "procesarlineasplantillapedidoventa", false))
	 {Debug.delegate(ba, "procesarlineasplantillapedidoventa", null); return;}
ResumableSub_ProcesarLineasPlantillaPedidoVenta rsub = new ResumableSub_ProcesarLineasPlantillaPedidoVenta(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ProcesarLineasPlantillaPedidoVenta extends BA.ResumableSub {
public ResumableSub_ProcesarLineasPlantillaPedidoVenta(b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent,b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref;
b4j.docU.cgeneracionficheroscsvplantillapedidosventa parent;
int _numlineasprocesadas = 0;
Object _msa = null;
int _rint = 0;
b4j.docU.xlutils _xl = null;
b4j.docU.xlworkbookwriter _workbookwriter = null;
b4j.docU.xlsheetwriter _sheetwriter = null;
b4j.docU.xlreaderresult _xlresult = null;
b4j.docU.xlutils._xladdress _bottomrightaddress = null;
long _ultimafila = 0L;
long _primerafila = 0L;
int _idx = 0;
String _celdax = "";
String _reffila = "";
String _referenciacruzadafila = "";
String _articulofila = "";
double _qtyfila = 0;
String _descripcionarticulofila = "";
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
String _tallafila = "";
double _preciofila = 0;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsprecios = null;
String _artsel = "";
String _tallasel = "";
double _preciosel = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int step23;
int limit23;
int step35;
int limit35;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="Dim NumLineasProcesadas As Int=mSQL.ExecQuerySing";
_numlineasprocesadas = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido")));
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="If NumLineasProcesadas>0 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_numlineasprocesadas>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"Hay ${Num";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,("Hay "+parent.__c.SmartStringFormatter("",(Object)(_numlineasprocesadas))+" líneas procesadas.\n"+"¿Eliminar estas líneas y procesar de nuevo el fichero?"),"Confirma","Sí","Cancelar","",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 72;
return;
case 72:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=37748743;
 //BA.debugLineNum = 37748743;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=37748746;
 //BA.debugLineNum = 37748746;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFiche";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido");
RDebugUtils.currentLine=37748747;
 //BA.debugLineNum = 37748747;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblGeneracionFiche";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo");
RDebugUtils.currentLine=37748749;
 //BA.debugLineNum = 37748749;BA.debugLine="If File.Exists(File.GetFileParent(RutaFicheroSele";
if (true) break;

case 11:
//if
this.state = 14;
if (parent.__c.File.Exists(parent.__c.File.GetFileParent(__ref._rutaficheroseleccionado /*String*/ ),parent.__c.File.GetName(__ref._rutaficheroseleccionado /*String*/ ))==parent.__c.False) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=37748750;
 //BA.debugLineNum = 37748750;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El fichero s";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El fichero seleccionado "+parent.__c.SmartStringFormatter("",(Object)(__ref._rutaficheroseleccionado /*String*/ ))+" no existe."),"Aviso");
RDebugUtils.currentLine=37748751;
 //BA.debugLineNum = 37748751;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 73;
return;
case 73:
//C
this.state = 14;
;
RDebugUtils.currentLine=37748752;
 //BA.debugLineNum = 37748752;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=37748755;
 //BA.debugLineNum = 37748755;BA.debugLine="Dim xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=37748756;
 //BA.debugLineNum = 37748756;BA.debugLine="xl.Initialize";
_xl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=37748758;
 //BA.debugLineNum = 37748758;BA.debugLine="Dim WorkbookWriter As XLWorkbookWriter = xl.Creat";
_workbookwriter = _xl._createwriterfromtemplate /*b4j.docU.xlworkbookwriter*/ (null,__ref._rutaficheroseleccionado /*String*/ ,"");
RDebugUtils.currentLine=37748759;
 //BA.debugLineNum = 37748759;BA.debugLine="Dim SheetWriter As XLSheetWriter=WorkbookWriter.C";
_sheetwriter = _workbookwriter._createsheetwriterbyindex /*b4j.docU.xlsheetwriter*/ (null,(int) (0));
RDebugUtils.currentLine=37748771;
 //BA.debugLineNum = 37748771;BA.debugLine="Dim xlResult As XLReaderResult=xl.Reader.ReadShee";
_xlresult = _xl._reader /*b4j.docU.xlreader*/ ._readsheetbyindex /*b4j.docU.xlreaderresult*/ (null,parent.__c.File.GetFileParent(__ref._rutaficheroseleccionado /*String*/ ),parent.__c.File.GetName(__ref._rutaficheroseleccionado /*String*/ ),(int) (0));
RDebugUtils.currentLine=37748773;
 //BA.debugLineNum = 37748773;BA.debugLine="xlResult.LogResult(True)";
_xlresult._logresult /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=37748774;
 //BA.debugLineNum = 37748774;BA.debugLine="Dim BottomRightAddress As XLAddress= xlResult.Bot";
_bottomrightaddress = _xlresult._bottomright /*b4j.docU.xlutils._xladdress*/ ;
RDebugUtils.currentLine=37748775;
 //BA.debugLineNum = 37748775;BA.debugLine="Dim UltimaFila As Long=BottomRightAddress.Row0Bas";
_ultimafila = (long) (_bottomrightaddress.Row0Based /*int*/ );
RDebugUtils.currentLine=37748776;
 //BA.debugLineNum = 37748776;BA.debugLine="Dim PrimeraFila As Long";
_primerafila = 0L;
RDebugUtils.currentLine=37748778;
 //BA.debugLineNum = 37748778;BA.debugLine="For iDX=0 To UltimaFila";
if (true) break;

case 15:
//for
this.state = 22;
step23 = 1;
limit23 = (int) (_ultimafila);
_idx = (int) (0) ;
this.state = 74;
if (true) break;

case 74:
//C
this.state = 22;
if ((step23 > 0 && _idx <= limit23) || (step23 < 0 && _idx >= limit23)) this.state = 17;
if (true) break;

case 75:
//C
this.state = 74;
_idx = ((int)(0 + _idx + step23)) ;
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=37748779;
 //BA.debugLineNum = 37748779;BA.debugLine="Dim CeldaX As String=xlResult.Get(xl.AddressOne(";
_celdax = BA.ObjectToString(_xlresult._get /*Object*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"B",_idx)));
RDebugUtils.currentLine=37748780;
 //BA.debugLineNum = 37748780;BA.debugLine="If CeldaX=\"REFERENCIA\" Then";
if (true) break;

case 18:
//if
this.state = 21;
if ((_celdax).equals("REFERENCIA")) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=37748781;
 //BA.debugLineNum = 37748781;BA.debugLine="PrimeraFila=iDX+1";
_primerafila = (long) (_idx+1);
RDebugUtils.currentLine=37748782;
 //BA.debugLineNum = 37748782;BA.debugLine="Exit";
this.state = 22;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 75;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=37748785;
 //BA.debugLineNum = 37748785;BA.debugLine="If PrimeraFila=0 Then";

case 22:
//if
this.state = 25;
if (_primerafila==0) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=37748786;
 //BA.debugLineNum = 37748786;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha loca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha localizado el encabezado = REFERENCIA.","Error");
RDebugUtils.currentLine=37748787;
 //BA.debugLineNum = 37748787;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 76;
return;
case 76:
//C
this.state = 25;
;
RDebugUtils.currentLine=37748788;
 //BA.debugLineNum = 37748788;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=37748791;
 //BA.debugLineNum = 37748791;BA.debugLine="For iDX=PrimeraFila To UltimaFila";

case 25:
//for
this.state = 38;
step35 = 1;
limit35 = (int) (_ultimafila);
_idx = (int) (_primerafila) ;
this.state = 77;
if (true) break;

case 77:
//C
this.state = 38;
if ((step35 > 0 && _idx <= limit35) || (step35 < 0 && _idx >= limit35)) this.state = 27;
if (true) break;

case 78:
//C
this.state = 77;
_idx = ((int)(0 + _idx + step35)) ;
if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=37748792;
 //BA.debugLineNum = 37748792;BA.debugLine="Dim RefFila As String=xlResult.GetDefault(xl.Add";
_reffila = BA.ObjectToString(_xlresult._getdefault /*Object*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"B",_idx),(Object)("")));
RDebugUtils.currentLine=37748793;
 //BA.debugLineNum = 37748793;BA.debugLine="If RefFila=\"\" Then Exit ' se ha llegado al final";
if (true) break;

case 28:
//if
this.state = 33;
if ((_reffila).equals("")) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
this.state = 38;
if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=37748795;
 //BA.debugLineNum = 37748795;BA.debugLine="Dim ReferenciaCruzadaFila As String=\"\"";
_referenciacruzadafila = "";
RDebugUtils.currentLine=37748796;
 //BA.debugLineNum = 37748796;BA.debugLine="Dim ArticuloFila As String=RefFila";
_articulofila = _reffila;
RDebugUtils.currentLine=37748798;
 //BA.debugLineNum = 37748798;BA.debugLine="Dim QtyFila As Double=xlResult.GetDefault(xl.Add";
_qtyfila = (double)(BA.ObjectToNumber(_xlresult._getdefault /*Object*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"E",_idx),(Object)(0))));
RDebugUtils.currentLine=37748799;
 //BA.debugLineNum = 37748799;BA.debugLine="If QtyFila>0 Then";
if (true) break;

case 34:
//if
this.state = 37;
if (_qtyfila>0) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=37748800;
 //BA.debugLineNum = 37748800;BA.debugLine="Dim DescripcionArticuloFila As String=xlResult.";
_descripcionarticulofila = BA.ObjectToString(_xlresult._getdefault /*Object*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"C",_idx),(Object)("")));
RDebugUtils.currentLine=37748805;
 //BA.debugLineNum = 37748805;BA.debugLine="Dim Cell As PoiCell=SheetWriter.GetCell(xl.Addr";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _sheetwriter._getcell /*anywheresoftware.b4j.objects.PoiCellWrapper*/ (null,_xl._addressone /*b4j.docU.xlutils._xladdress*/ (null,"D",_idx));
RDebugUtils.currentLine=37748806;
 //BA.debugLineNum = 37748806;BA.debugLine="Cell.CellType=Cell.TYPE_STRING";
_cell.setCellType(_cell.TYPE_STRING);
RDebugUtils.currentLine=37748807;
 //BA.debugLineNum = 37748807;BA.debugLine="Dim TallaFila As String=Cell.ValueString";
_tallafila = _cell.getValueString();
RDebugUtils.currentLine=37748808;
 //BA.debugLineNum = 37748808;BA.debugLine="Dim PrecioFila As Double=0 ' los precios se eva";
_preciofila = 0;
RDebugUtils.currentLine=37748810;
 //BA.debugLineNum = 37748810;BA.debugLine="mSQL.AddNonQueryToBatch(\"insert into tblGenerac";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("insert into tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido (ReferenciaCruzada, CodigoArticulo, DescripcionArticulo, Talla, Cantidad, Precio) values (?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_referenciacruzadafila),(Object)(_articulofila),(Object)(_descripcionarticulofila),(Object)(_tallafila),(Object)(_qtyfila),(Object)(_preciofila)}));
 if (true) break;

case 37:
//C
this.state = 78;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=37748815;
 //BA.debugLineNum = 37748815;BA.debugLine="WorkbookWriter.PoiWorkbook.Close";
_workbookwriter._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ .Close();
RDebugUtils.currentLine=37748818;
 //BA.debugLineNum = 37748818;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=37748819;
 //BA.debugLineNum = 37748819;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _senderfilter);
this.state = 79;
return;
case 79:
//C
this.state = 39;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=37748820;
 //BA.debugLineNum = 37748820;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("837748820","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=37748822;
 //BA.debugLineNum = 37748822;BA.debugLine="If Success=False Then";
if (true) break;

case 39:
//if
this.state = 42;
if (_success==parent.__c.False) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=37748823;
 //BA.debugLineNum = 37748823;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido un";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Ha habido un error al procesar las líneas del fichero.\n"+""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.LastException(ba).getMessage()))+"\n"+""),"Error");
RDebugUtils.currentLine=37748826;
 //BA.debugLineNum = 37748826;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 80;
return;
case 80:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=37748829;
 //BA.debugLineNum = 37748829;BA.debugLine="mSQL.ExecNonQuery($\"insert into tblGeneracionFich";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("insert into tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo\n"+"		select CodigoArticulo, Sum(Cantidad) as TotalCantidad from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido group by CodigoArticulo"));
RDebugUtils.currentLine=37748832;
 //BA.debugLineNum = 37748832;BA.debugLine="Dim rsPrecios As ResultSet=mSQL.ExecQuery($\"selec";
_rsprecios = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsprecios = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("select CodigoArticulo, Talla from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido"));
RDebugUtils.currentLine=37748833;
 //BA.debugLineNum = 37748833;BA.debugLine="Do While rsPrecios.NextRow";
if (true) break;

case 43:
//do while
this.state = 46;
while (_rsprecios.NextRow()) {
this.state = 45;
if (true) break;
}
if (true) break;

case 45:
//C
this.state = 43;
RDebugUtils.currentLine=37748834;
 //BA.debugLineNum = 37748834;BA.debugLine="Dim ArtSel As String=rsPrecios.GetString(\"Codigo";
_artsel = _rsprecios.GetString("CodigoArticulo");
RDebugUtils.currentLine=37748835;
 //BA.debugLineNum = 37748835;BA.debugLine="Dim TallaSel As String=rsPrecios.GetString(\"Tall";
_tallasel = _rsprecios.GetString("Talla");
RDebugUtils.currentLine=37748836;
 //BA.debugLineNum = 37748836;BA.debugLine="Dim PrecioSel As Double=PrecioVentaArticuloTalla";
_preciosel = __ref._precioventaarticulotallacantidadtarifaaplicablecliente /*double*/ (null,_artsel,_tallasel);
RDebugUtils.currentLine=37748837;
 //BA.debugLineNum = 37748837;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblGeneracionFic";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido set precio=? where CodigoArticulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_preciosel),(Object)(_artsel),(Object)(_tallasel)}));
 if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=37748839;
 //BA.debugLineNum = 37748839;BA.debugLine="rsPrecios.Close";
_rsprecios.Close();
RDebugUtils.currentLine=37748841;
 //BA.debugLineNum = 37748841;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=37748842;
 //BA.debugLineNum = 37748842;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _senderfilter);
this.state = 81;
return;
case 81:
//C
this.state = 47;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=37748843;
 //BA.debugLineNum = 37748843;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("837748843","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=37748845;
 //BA.debugLineNum = 37748845;BA.debugLine="If Success=False Then";
if (true) break;

case 47:
//if
this.state = 50;
if (_success==parent.__c.False) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=37748846;
 //BA.debugLineNum = 37748846;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido un";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Ha habido un error al procesar las líneas del fichero.\n"+""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.LastException(ba).getMessage()))+"\n"+""),"Error");
RDebugUtils.currentLine=37748849;
 //BA.debugLineNum = 37748849;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 82;
return;
case 82:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=37748853;
 //BA.debugLineNum = 37748853;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblGeneracionFicherosCSVPlantillaPedidosVentaLineasPedido");
RDebugUtils.currentLine=37748855;
 //BA.debugLineNum = 37748855;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=37748856;
 //BA.debugLineNum = 37748856;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _rsub);
this.state = 83;
return;
case 83:
//C
this.state = 51;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=37748857;
 //BA.debugLineNum = 37748857;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=37748858;
 //BA.debugLineNum = 37748858;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 51:
//if
this.state = 71;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=37748859;
 //BA.debugLineNum = 37748859;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 54:
//if
this.state = 61;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=37748860;
 //BA.debugLineNum = 37748860;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=37748861;
 //BA.debugLineNum = 37748861;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 84;
return;
case 84:
//C
this.state = 57;
;
RDebugUtils.currentLine=37748863;
 //BA.debugLineNum = 37748863;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=37748864;
 //BA.debugLineNum = 37748864;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 85;
return;
case 85:
//C
this.state = 57;
_rint = (int) result[1];
;
RDebugUtils.currentLine=37748865;
 //BA.debugLineNum = 37748865;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 57:
//if
this.state = 60;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=37748866;
 //BA.debugLineNum = 37748866;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=37748867;
 //BA.debugLineNum = 37748867;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=37748870;
 //BA.debugLineNum = 37748870;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=37748872;
 //BA.debugLineNum = 37748872;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 61:
//if
this.state = 70;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=37748873;
 //BA.debugLineNum = 37748873;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 64:
//if
this.state = 69;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 66;
;}if (true) break;

case 66:
//C
this.state = 69;
if (true) return ;
if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=37748874;
 //BA.debugLineNum = 37748874;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=37748875;
 //BA.debugLineNum = 37748875;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgeneracionficheroscsvplantillapedidosventa", "procesarlineasplantillapedidoventa"), _msa);
this.state = 86;
return;
case 86:
//C
this.state = 70;
;
 if (true) break;

case 70:
//C
this.state = 71;
;
 if (true) break;

case 71:
//C
this.state = -1;
;
RDebugUtils.currentLine=37748879;
 //BA.debugLineNum = 37748879;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _lblcancelarbuscarclientedireccionenvio_mouseclicked(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "lblcancelarbuscarclientedireccionenvio_mouseclicked", false))
	 {return ((String) Debug.delegate(ba, "lblcancelarbuscarclientedireccionenvio_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveAllVi";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="BackgroundBuscarClienteDireccionEnvio.RemoveViewF";
__ref._backgroundbuscarclientedireccionenvio /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="End Sub";
return "";
}
public String  _lblcancelarbuscarclientedireccionenvio_mouseentered(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "lblcancelarbuscarclientedireccionenvio_mouseentered", false))
	 {return ((String) Debug.delegate(ba, "lblcancelarbuscarclientedireccionenvio_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="End Sub";
return "";
}
public String  _lblcancelarbuscarclientedireccionenvio_mouseexited(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "lblcancelarbuscarclientedireccionenvio_mouseexited", false))
	 {return ((String) Debug.delegate(ba, "lblcancelarbuscarclientedireccionenvio_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="End Sub";
return "";
}
public String  _lblcancelarbuscarclientedireccionenvio_mousepressed(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "lblcancelarbuscarclientedireccionenvio_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "lblcancelarbuscarclientedireccionenvio_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Private Sub lblCancelarBuscarClienteDireccionEnvio";
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="End Sub";
return "";
}
public String  _poigetformattedcellvalue(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,anywheresoftware.b4j.objects.PoiCellWrapper _excelcell) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "poigetformattedcellvalue", false))
	 {return ((String) Debug.delegate(ba, "poigetformattedcellvalue", new Object[] {_excelcell}));}
anywheresoftware.b4j.object.JavaObject _jocell = null;
anywheresoftware.b4j.object.JavaObject _jodataformatter = null;
anywheresoftware.b4j.object.JavaObject _joconditionalformattingevaluator = null;
anywheresoftware.b4j.object.JavaObject _joformulaevaluator = null;
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Sub PoiGetFormattedCellValue(ExcelCell As PoiCell)";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="Dim JOCell As JavaObject = ExcelCell";
_jocell = new anywheresoftware.b4j.object.JavaObject();
_jocell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_excelcell.getObject()));
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="Dim JODataFormatter As JavaObject";
_jodataformatter = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="Dim JOConditionalFormattingEvaluator As JavaObjec";
_joconditionalformattingevaluator = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="Dim JOFormulaEvaluator As JavaObject =JOCell.RunM";
_joformulaevaluator = new anywheresoftware.b4j.object.JavaObject();
_joformulaevaluator = _jocell.RunMethodJO("getSheet",(Object[])(__c.Null)).RunMethodJO("getWorkbook",(Object[])(__c.Null)).RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethodJO("createFormulaEvaluator",(Object[])(__c.Null));
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="JOConditionalFormattingEvaluator.InitializeNewIns";
_joconditionalformattingevaluator.InitializeNewInstance("org.apache.poi.ss.formula.ConditionalFormattingEvaluator",new Object[]{(Object)(_jocell.RunMethodJO("getSheet",(Object[])(__c.Null)).RunMethodJO("getWorkbook",(Object[])(__c.Null)).getObject()),(Object)(_jocell.RunMethodJO("getSheet",(Object[])(__c.Null)).RunMethodJO("getWorkbook",(Object[])(__c.Null)).RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethodJO("createFormulaEvaluator",(Object[])(__c.Null)).getObject())});
RDebugUtils.currentLine=38076422;
 //BA.debugLineNum = 38076422;BA.debugLine="Return JODataFormatter.InitializeNewInstance(\"org";
if (true) return BA.ObjectToString(_jodataformatter.InitializeNewInstance("org.apache.poi.ss.usermodel.DataFormatter",(Object[])(__c.Null)).RunMethod("formatCellValue",new Object[]{(Object)(_jocell.getObject()),(Object)(_joformulaevaluator.getObject()),(Object)(_joconditionalformattingevaluator.getObject())}));
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="End Sub";
return "";
}
public double  _precioventaarticulotallacantidadtarifaaplicablecliente(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,String _articulo,String _talla) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "precioventaarticulotallacantidadtarifaaplicablecliente", false))
	 {return ((Double) Debug.delegate(ba, "precioventaarticulotallacantidadtarifaaplicablecliente", new Object[] {_articulo,_talla}));}
int _qtytotalart = 0;
String _ssql = "";
double _precioclientearttalla = 0;
double _precioclienteartsintalla = 0;
double _preciogrparttalla = 0;
double _preciogrpartsintalla = 0;
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Sub PrecioVentaArticuloTallaCantidadTarifaAplicabl";
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Dim QtyTotalArt As Int=Utilidades.FixNullInt(mSQL";
_qtytotalart = _utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(("select TotalCantidad from tblGeneracionFicherosCSVPlantillaPedidosVentaTotalesLineasPedidoPorArticulo where CodigoArticulo=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_articulo}))));
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
_ssql = ("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente \n"+"		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, Variante asc, CantidadMinima desc LIMIT 1");
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="Dim PrecioClienteArtTalla As Double=Utilidades.Fi";
_precioclientearttalla = _utilidades._fixnulldouble /*double*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(_ssql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0),__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ,_articulo,_talla,BA.NumberToString(_qtytotalart)}))));
RDebugUtils.currentLine=38010888;
 //BA.debugLineNum = 38010888;BA.debugLine="If PrecioClienteArtTalla>0 Then";
if (_precioclientearttalla>0) { 
RDebugUtils.currentLine=38010889;
 //BA.debugLineNum = 38010889;BA.debugLine="Return PrecioClienteArtTalla";
if (true) return _precioclientearttalla;
 };
RDebugUtils.currentLine=38010892;
 //BA.debugLineNum = 38010892;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
_ssql = ("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente\n"+"		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, CantidadMinima desc LIMIT 1");
RDebugUtils.currentLine=38010894;
 //BA.debugLineNum = 38010894;BA.debugLine="Dim PrecioClienteArtSinTalla As Double=Utilidades";
_precioclienteartsintalla = _utilidades._fixnulldouble /*double*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(_ssql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0),__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .CodigoCliente /*String*/ ,_articulo,"",BA.NumberToString(_qtytotalart)}))));
RDebugUtils.currentLine=38010895;
 //BA.debugLineNum = 38010895;BA.debugLine="If PrecioClienteArtSinTalla>0 Then";
if (_precioclienteartsintalla>0) { 
RDebugUtils.currentLine=38010896;
 //BA.debugLineNum = 38010896;BA.debugLine="Return PrecioClienteArtSinTalla";
if (true) return _precioclienteartsintalla;
 };
RDebugUtils.currentLine=38010900;
 //BA.debugLineNum = 38010900;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
_ssql = ("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente\n"+"		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, Variante asc, CantidadMinima desc LIMIT 1");
RDebugUtils.currentLine=38010902;
 //BA.debugLineNum = 38010902;BA.debugLine="Dim PrecioGRPArtTalla As Double=Utilidades.FixNul";
_preciogrparttalla = _utilidades._fixnulldouble /*double*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(_ssql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1),__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .GRPCliente /*String*/ ,_articulo,_talla,BA.NumberToString(_qtytotalart)}))));
RDebugUtils.currentLine=38010903;
 //BA.debugLineNum = 38010903;BA.debugLine="If PrecioGRPArtTalla>0 Then";
if (_preciogrparttalla>0) { 
RDebugUtils.currentLine=38010904;
 //BA.debugLineNum = 38010904;BA.debugLine="Return PrecioGRPArtTalla";
if (true) return _preciogrparttalla;
 };
RDebugUtils.currentLine=38010907;
 //BA.debugLineNum = 38010907;BA.debugLine="Dim sSQL As String=$\"select PrecioUnitario from t";
_ssql = ("select PrecioUnitario from tblGeneracionFicherosCSVPlantillaPedidosVentaTarifaVentaAplicableCliente\n"+"		where TipoTarifa=? and CodigoTarifa=? and Articulo=? and Variante=? and CantidadMinima<=? order by Articulo asc, CantidadMinima desc LIMIT 1");
RDebugUtils.currentLine=38010909;
 //BA.debugLineNum = 38010909;BA.debugLine="Dim PrecioGRPArtSinTalla As Double=Utilidades.Fix";
_preciogrpartsintalla = _utilidades._fixnulldouble /*double*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(_ssql,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1),__ref._datosplantillapedidoventacab /*b4j.docU.cgeneracionficheroscsvplantillapedidosventa._tipodatosplantillapedidoventacab*/ .GRPCliente /*String*/ ,_articulo,"",BA.NumberToString(_qtytotalart)}))));
RDebugUtils.currentLine=38010910;
 //BA.debugLineNum = 38010910;BA.debugLine="If PrecioGRPArtSinTalla>0 Then";
if (_preciogrpartsintalla>0) { 
RDebugUtils.currentLine=38010911;
 //BA.debugLineNum = 38010911;BA.debugLine="Return PrecioGRPArtSinTalla";
if (true) return _preciogrpartsintalla;
 };
RDebugUtils.currentLine=38010915;
 //BA.debugLineNum = 38010915;BA.debugLine="Return 0";
if (true) return 0;
RDebugUtils.currentLine=38010916;
 //BA.debugLineNum = 38010916;BA.debugLine="End Sub";
return 0;
}
public String  _txtbuscarclientedireccionenvio_textchanged(b4j.docU.cgeneracionficheroscsvplantillapedidosventa __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgeneracionficheroscsvplantillapedidosventa";
if (Debug.shouldDelegate(ba, "txtbuscarclientedireccionenvio_textchanged", false))
	 {return ((String) Debug.delegate(ba, "txtbuscarclientedireccionenvio_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Private Sub txtBuscarClienteDireccionEnvio_TextCha";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="ActualizarDatosCLV";
__ref._actualizardatosclv /*String*/ (null);
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="End Sub";
return "";
}
}