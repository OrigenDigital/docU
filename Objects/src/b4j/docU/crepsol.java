package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class crepsol extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.crepsol", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.crepsol.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tipodatoslineapedidorepsol{
public boolean IsInitialized;
public String Linea;
public int ErrorLongitudLineaCabeceraEstacion;
public String Sede;
public int ErrorSede;
public String CodigoClienteERP;
public String CodigoDireccionEnvioERP;
public String CodigoPedido;
public String FechaPedido;
public int ErrorFechaPedido;
public String NombreEstacion;
public String Calle;
public String CodigoPostal;
public String Poblacion;
public String CodigoProvincia;
public String Telefono;
public String TipoEstacion;
public String Marca;
public int ErrorMarca;
public int ErrorCabeceraEstacion;
public int ErrorLongitudLineaEmpleado;
public String DNI;
public int ErrorDNI;
public String NombreEmpleado;
public String Cargo;
public int ErrorCargo;
public String Sexo;
public int ErrorSexo;
public String Embarazo;
public int ErrorEmbarazo;
public int ErrorLongitudLineaProducto;
public String CodigoPrenda;
public String DescripcionCodigoPrenda;
public int ErrorCodigoPrenda;
public String CodigoProductoERP;
public int ErrorCodigoProductoERP;
public String Talla;
public String TallaERP;
public int ErrorTalla;
public int Cantidad;
public int ErrorCantidad;
public int LineaConError;
public void Initialize() {
IsInitialized = true;
Linea = "";
ErrorLongitudLineaCabeceraEstacion = 0;
Sede = "";
ErrorSede = 0;
CodigoClienteERP = "";
CodigoDireccionEnvioERP = "";
CodigoPedido = "";
FechaPedido = "";
ErrorFechaPedido = 0;
NombreEstacion = "";
Calle = "";
CodigoPostal = "";
Poblacion = "";
CodigoProvincia = "";
Telefono = "";
TipoEstacion = "";
Marca = "";
ErrorMarca = 0;
ErrorCabeceraEstacion = 0;
ErrorLongitudLineaEmpleado = 0;
DNI = "";
ErrorDNI = 0;
NombreEmpleado = "";
Cargo = "";
ErrorCargo = 0;
Sexo = "";
ErrorSexo = 0;
Embarazo = "";
ErrorEmbarazo = 0;
ErrorLongitudLineaProducto = 0;
CodigoPrenda = "";
DescripcionCodigoPrenda = "";
ErrorCodigoPrenda = 0;
CodigoProductoERP = "";
ErrorCodigoProductoERP = 0;
Talla = "";
TallaERP = "";
ErrorTalla = 0;
Cantidad = 0;
ErrorCantidad = 0;
LineaConError = 0;
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
public b4j.docU.draganddrop _draganddrop1 = null;
public anywheresoftware.b4j.objects.SplitPaneWrapper _splitpane1 = null;
public anywheresoftware.b4j.objects.TreeViewWrapper _treeviewlocal = null;
public anywheresoftware.b4j.objects.TreeViewWrapper _treeviewftp = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _vlocalpath = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _vftppath = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textftp = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textuser = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textpassword = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textinfo = null;
public b4j.docU.sd_loadingindicator _sd_loadingindicator1 = null;
public b4j.docU.b4xdialog _dialog = null;
public String _permisomodulousuario = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsalir = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public String _mcodigonavgrprepsoleess = "";
public anywheresoftware.b4a.objects.SFtpWrapper _sftprepsol = null;
public String _filesfoldersftprepsol = "";
public String _errorfilesfoldersftprepsol = "";
public String _carpetadestinoficherosdescargadosftppedidosrepsol = "";
public String _carpetadestinoficherospedidosokrepsol = "";
public String _carpetadestinoficherospedidoserrorrepsol = "";
public String _cuentaemailremitenteavisos = "";
public String _cuentaemaildestinatariodev1 = "";
public String _cuentaemaildestinatariodev2 = "";
public String _cuentaemaildestinatarioproinpedidosrepsol = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _btnselficheroftp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtficheroseleccionado = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnprocesar = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textareadatosproceso = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnselficherowindows = null;
public String _dirficheroprocesar = "";
public String _nombreficheroprocesar = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _btncheckftpinbox = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnuploadfile = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnprocesocompleto = null;
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
public String  _initialize(b4j.docU.crepsol __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=33226758;
 //BA.debugLineNum = 33226758;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=33226759;
 //BA.debugLineNum = 33226759;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
b4j.docU.main._tiporespuestajrdc _respjrdc = null;
long _fechahorainicializaciondatos = 0L;
String _error = "";
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=33357828;
 //BA.debugLineNum = 33357828;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=33357829;
 //BA.debugLineNum = 33357829;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=33357830;
 //BA.debugLineNum = 33357830;BA.debugLine="frm.RootPane.LoadLayout(\"scrRepsol\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrRepsol");
RDebugUtils.currentLine=33357833;
 //BA.debugLineNum = 33357833;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Repsol\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Repsol");
RDebugUtils.currentLine=33357835;
 //BA.debugLineNum = 33357835;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=33357836;
 //BA.debugLineNum = 33357836;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=33357838;
 //BA.debugLineNum = 33357838;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=33357927;
 //BA.debugLineNum = 33357927;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Inicializand";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Inicializando datos Repsol EESS..."));
RDebugUtils.currentLine=33357928;
 //BA.debugLineNum = 33357928;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=33357930;
 //BA.debugLineNum = 33357930;BA.debugLine="Wait For(InicializacionDatos) complete (respJRDC";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "show"), __ref._inicializaciondatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_respjrdc = (b4j.docU.main._tiporespuestajrdc) result[1];
;
RDebugUtils.currentLine=33357931;
 //BA.debugLineNum = 33357931;BA.debugLine="Dim FechaHoraInicializacionDatos As Long=DateTime";
_fechahorainicializaciondatos = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=33357932;
 //BA.debugLineNum = 33357932;BA.debugLine="If respJRDC.Accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_respjrdc.Accion /*String*/ ).equals("NOK")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=33357933;
 //BA.debugLineNum = 33357933;BA.debugLine="Dim Error As String=respJRDC.Error";
_error = _respjrdc.Error /*String*/ ;
RDebugUtils.currentLine=33357934;
 //BA.debugLineNum = 33357934;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR inicializa";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "show"), __ref._enviaremailaviso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.True,"ERROR inicializacion datos Proceso Pedidos OnLine REPSOL EESS",_error));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=33357936;
 //BA.debugLineNum = 33357936;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=33357942;
 //BA.debugLineNum = 33357942;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=33357944;
 //BA.debugLineNum = 33357944;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btncheckftpinbox_click(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "btncheckftpinbox_click", false))
	 {Debug.delegate(ba, "btncheckftpinbox_click", null); return;}
ResumableSub_btnCheckFTPInbox_Click rsub = new ResumableSub_btnCheckFTPInbox_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCheckFTPInbox_Click extends BA.ResumableSub {
public ResumableSub_btnCheckFTPInbox_Click(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _folders = null;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _files = null;
Object _msa = null;
int _i = 0;
int step17;
int limit17;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35258390;
 //BA.debugLineNum = 35258390;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Buscando Fic";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Buscando Fichero Pedido en carpeta errores FTP..."));
RDebugUtils.currentLine=35258391;
 //BA.debugLineNum = 35258391;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=35258393;
 //BA.debugLineNum = 35258393;BA.debugLine="sFtpRepsol.List(ErrorFilesFoldersFtpRepsol)";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .List(ba,__ref._errorfilesfoldersftprepsol /*String*/ );
RDebugUtils.currentLine=35258394;
 //BA.debugLineNum = 35258394;BA.debugLine="Wait For sFtpRepsol_ListCompleted (ServerPath As";
parent.__c.WaitFor("sftprepsol_listcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btncheckftpinbox_click"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_serverpath = (String) result[1];
_success = (boolean) result[2];
_folders = (anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[]) result[3];
_files = (anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[]) result[4];
;
RDebugUtils.currentLine=35258395;
 //BA.debugLineNum = 35258395;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35258396;
 //BA.debugLineNum = 35258396;BA.debugLine="If Success = False Then";
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
RDebugUtils.currentLine=35258397;
 //BA.debugLineNum = 35258397;BA.debugLine="Log(LastException.Message)";
parent.__c.LogImpl("835258397",parent.__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=35258398;
 //BA.debugLineNum = 35258398;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error listand";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error listando carpeta de errores FTP."+parent.__c.CRLF+parent.__c.CRLF+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=35258399;
 //BA.debugLineNum = 35258399;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btncheckftpinbox_click"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
;
RDebugUtils.currentLine=35258400;
 //BA.debugLineNum = 35258400;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=35258403;
 //BA.debugLineNum = 35258403;BA.debugLine="If Files.Length=0 Then";

case 4:
//if
this.state = 7;
if (_files.length==0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=35258405;
 //BA.debugLineNum = 35258405;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Carpeta error";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Carpeta errores FTP sin ficheros","Aviso");
RDebugUtils.currentLine=35258406;
 //BA.debugLineNum = 35258406;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btncheckftpinbox_click"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 7;
;
RDebugUtils.currentLine=35258407;
 //BA.debugLineNum = 35258407;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=35258410;
 //BA.debugLineNum = 35258410;BA.debugLine="For i = 0 To Folders.Length - 1";

case 7:
//for
this.state = 10;
step17 = 1;
limit17 = (int) (_folders.length-1);
_i = (int) (0) ;
this.state = 14;
if (true) break;

case 14:
//C
this.state = 10;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 9;
if (true) break;

case 15:
//C
this.state = 14;
_i = ((int)(0 + _i + step17)) ;
if (true) break;

case 9:
//C
this.state = 15;
RDebugUtils.currentLine=35258411;
 //BA.debugLineNum = 35258411;BA.debugLine="Log(Folders(i).Name)";
parent.__c.LogImpl("835258411",_folders[_i].getName(),0);
RDebugUtils.currentLine=35258412;
 //BA.debugLineNum = 35258412;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
parent.__c.LogImpl("835258412",parent.__c.DateTime.Date(_folders[_i].getTimestamp()),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=35258414;
 //BA.debugLineNum = 35258414;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnprocesar_click(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "btnprocesar_click", false))
	 {Debug.delegate(ba, "btnprocesar_click", null); return;}
ResumableSub_btnProcesar_Click rsub = new ResumableSub_btnProcesar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnProcesar_Click extends BA.ResumableSub {
public ResumableSub_btnProcesar_Click(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
Object _msa = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="If File.Exists(DirFicheroProcesar,NombreFicheroPr";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.File.Exists(__ref._dirficheroprocesar /*String*/ ,__ref._nombreficheroprocesar /*String*/ )==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe el";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No existe el fichero "+parent.__c.SmartStringFormatter("",(Object)(parent.__c.File.Combine(__ref._dirficheroprocesar /*String*/ ,__ref._nombreficheroprocesar /*String*/ )))+""),"Aviso");
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnprocesar_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=34603012;
 //BA.debugLineNum = 34603012;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=34603016;
 //BA.debugLineNum = 34603016;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Procesando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Procesando Fichero Pedido "+parent.__c.SmartStringFormatter("",(Object)(__ref._txtficheroseleccionado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()))+"...")));
RDebugUtils.currentLine=34603017;
 //BA.debugLineNum = 34603017;BA.debugLine="wait for(ProcesarFichero3(DirFicheroProcesar,Nomb";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnprocesar_click"), __ref._procesarfichero3 /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._dirficheroprocesar /*String*/ ,__ref._nombreficheroprocesar /*String*/ ,__ref._dirficheroprocesar /*String*/ ,__ref._nombreficheroprocesar /*String*/ ));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=34603018;
 //BA.debugLineNum = 34603018;BA.debugLine="If Not(Success) Then";
if (true) break;

case 5:
//if
this.state = 10;
if (parent.__c.Not(_success)) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=34603019;
 //BA.debugLineNum = 34603019;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible completar el proceso","Error");
RDebugUtils.currentLine=34603020;
 //BA.debugLineNum = 34603020;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnprocesar_click"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=34603022;
 //BA.debugLineNum = 34603022;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se ha complet";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Se ha completado el proceso con éxito.","Aviso");
RDebugUtils.currentLine=34603023;
 //BA.debugLineNum = 34603023;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnprocesar_click"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=34603025;
 //BA.debugLineNum = 34603025;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _procesarfichero3(b4j.docU.crepsol __ref,String _carpetaficheroorigen,String _nombreficheroorigen,String _carpetadestinofichero,String _nombreficherodestino) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "procesarfichero3", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "procesarfichero3", new Object[] {_carpetaficheroorigen,_nombreficheroorigen,_carpetadestinofichero,_nombreficherodestino}));}
ResumableSub_ProcesarFichero3 rsub = new ResumableSub_ProcesarFichero3(this,__ref,_carpetaficheroorigen,_nombreficheroorigen,_carpetadestinofichero,_nombreficherodestino);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ProcesarFichero3 extends BA.ResumableSub {
public ResumableSub_ProcesarFichero3(b4j.docU.crepsol parent,b4j.docU.crepsol __ref,String _carpetaficheroorigen,String _nombreficheroorigen,String _carpetadestinofichero,String _nombreficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._carpetaficheroorigen = _carpetaficheroorigen;
this._nombreficheroorigen = _nombreficheroorigen;
this._carpetadestinofichero = _carpetadestinofichero;
this._nombreficherodestino = _nombreficherodestino;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _carpetaficheroorigen;
String _nombreficheroorigen;
String _carpetadestinofichero;
String _nombreficherodestino;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdataconn = null;
anywheresoftware.b4a.objects.collections.List _lstlineasfichero = null;
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _dniempleadosel = "";
int _idxfila = 0;
String _dateformatant = "";
String _slinea = "";
int _numcharlinea = 0;
Object[] _csvline = null;
String _numlinea = "";
int _tipolinea = 0;
String _lineanumeropedido = "";
String[] _arrlineanumeropedido = null;
String _numeropedido = "";
b4j.docU.crepsol._tipodatoslineapedidorepsol _datoslineapedido = null;
String _idsedeempresa = "";
String _numeropedidoestacion = "";
String _fechapedido = "";
long _fechapedidolong = 0L;
String _nombreestacion = "";
String _calle = "";
String _codigopostal = "";
String _poblacion = "";
String _codigoprovincia = "";
String _telefono = "";
String _stipoestacion = "";
String _tipoestacion = "";
String _marca = "";
String _dni = "";
boolean _dniempleadoselok = false;
String _nombreempleado = "";
String _scargo = "";
String _ssexoempleado = "";
String _sembarazoempleado = "";
String _codigoprenda = "";
int _nummapeocodigoprenda = 0;
String _talla = "";
int _cantidad = 0;
Object _senderfilter = null;
boolean _success = false;
int _numlineasconerror = 0;
boolean _csverroressubidookftp = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rssedepedidodni = null;
String _sede = "";
String _pedidosede = "";
boolean _errorlongitudlineacabeceraestacion = false;
boolean _errorsede = false;
boolean _errorfechapedido = false;
boolean _errormarca = false;
boolean _errorlongitudlineaempleado = false;
boolean _errordni = false;
boolean _errorcargo = false;
boolean _errorsexo = false;
boolean _errorembarazo = false;
boolean _errorlongitudlineaproducto = false;
boolean _errorcodigoprenda = false;
boolean _errorcodigoproductoerp = false;
boolean _errortalla = false;
boolean _errorcantidad = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rslineassedepedidodni = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbtextoerror = null;
anywheresoftware.b4a.objects.collections.List _lsterrores = null;
anywheresoftware.b4a.objects.collections.List _lstencabezadoserrores = null;
String _sficheroerrores = "";
String _nombreficheroerrores = "";
Object _msa = null;
String _rutaftpficheropedidoerrores = "";
int _numlineassinerror = 0;
boolean _csvsficherospedidosok = false;
int _numpedidosincluidosenfichero = 0;
int _numficherospedidoscsvcreadosenservidor = 0;
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
String _carpetaficherocsv = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rscabecerapedidoslineassinerror = null;
String _uuidpedido = "";
String _idpedido = "";
String _nombreficherocsv = "";
anywheresoftware.b4a.objects.collections.List _lstlineaspedidoventa = null;
String _codigoclientenav = "";
String _codigodireccionenvionav = "";
String _codigopedido = "";
String _documentoexterno = "";
String _fechapedidocliente = "";
String _fechapedidoclientenav = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rslineaspedido = null;
double _precio = 0;
String[] _arrdatoslineapedido = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _bodyemailinfoproceso = "";
String _sresp = "";
anywheresoftware.b4a.BA.IterableList group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando con";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando configuración FTP..."));
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=35061765;
 //BA.debugLineNum = 35061765;BA.debugLine="Wait For(CargaDatosConnSFTP) complete (mRes As Ma";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero3"), __ref._cargadatosconnsftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 389;
return;
case 389:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35061766;
 //BA.debugLineNum = 35061766;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35061767;
 //BA.debugLineNum = 35061767;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=35061768;
 //BA.debugLineNum = 35061768;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35061769;
 //BA.debugLineNum = 35061769;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=35061770;
 //BA.debugLineNum = 35061770;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=35061772;
 //BA.debugLineNum = 35061772;BA.debugLine="Dim mDataConn As Map=mRes.Get(\"mDataConn\")";
_mdataconn = new anywheresoftware.b4a.objects.collections.Map();
_mdataconn = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mDataConn"))));
RDebugUtils.currentLine=35061775;
 //BA.debugLineNum = 35061775;BA.debugLine="sFtpRepsol.Initialize(\"sFtpRepsol\", mDataConn.Get";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .Initialize(ba,"sFtpRepsol",BA.ObjectToString(_mdataconn.Get((Object)("CampoString2"))),BA.ObjectToString(_mdataconn.Get((Object)("CampoString3"))),BA.ObjectToString(_mdataconn.Get((Object)("CampoString1"))),(int)(BA.ObjectToNumber(_mdataconn.Get((Object)("CampoInt1")))));
RDebugUtils.currentLine=35061776;
 //BA.debugLineNum = 35061776;BA.debugLine="FilesFoldersFtpRepsol=mDataConn.Get(\"CampoString4";
__ref._filesfoldersftprepsol /*String*/  = BA.ObjectToString(_mdataconn.Get((Object)("CampoString4")));
RDebugUtils.currentLine=35061777;
 //BA.debugLineNum = 35061777;BA.debugLine="ErrorFilesFoldersFtpRepsol=mDataConn.Get(\"CampoSt";
__ref._errorfilesfoldersftprepsol /*String*/  = BA.ObjectToString(_mdataconn.Get((Object)("CampoString5")));
RDebugUtils.currentLine=35061779;
 //BA.debugLineNum = 35061779;BA.debugLine="sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder,";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .SetKnownHostsStore(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"aJma.txt");
RDebugUtils.currentLine=35061781;
 //BA.debugLineNum = 35061781;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolLineasFic";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolLineasFicheroPedido");
RDebugUtils.currentLine=35061782;
 //BA.debugLineNum = 35061782;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolErroresSe";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolErroresSedePedidoDNIFicheroPedido");
RDebugUtils.currentLine=35061784;
 //BA.debugLineNum = 35061784;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Procesando f";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Procesando fichero..."));
RDebugUtils.currentLine=35061785;
 //BA.debugLineNum = 35061785;BA.debugLine="jamLoadingIndicator1.IniciarControlTiempoProceso";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._iniciarcontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=35061786;
 //BA.debugLineNum = 35061786;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=35061788;
 //BA.debugLineNum = 35061788;BA.debugLine="Dim lstLineasFichero As List";
_lstlineasfichero = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35061789;
 //BA.debugLineNum = 35061789;BA.debugLine="lstLineasFichero.Initialize";
_lstlineasfichero.Initialize();
RDebugUtils.currentLine=35061793;
 //BA.debugLineNum = 35061793;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=35061795;
 //BA.debugLineNum = 35061795;BA.debugLine="tr.Initialize2(File.OpenInput(CarpetaFicheroOrige";
_tr.Initialize2((java.io.InputStream)(parent.__c.File.OpenInput(_carpetaficheroorigen,_nombreficheroorigen).getObject()),"UTF-8");
RDebugUtils.currentLine=35061796;
 //BA.debugLineNum = 35061796;BA.debugLine="lstLineasFichero=tr.ReadList";
_lstlineasfichero = _tr.ReadList();
RDebugUtils.currentLine=35061816;
 //BA.debugLineNum = 35061816;BA.debugLine="Dim DNIEmpleadoSel As String";
_dniempleadosel = "";
RDebugUtils.currentLine=35061856;
 //BA.debugLineNum = 35061856;BA.debugLine="Dim idxFila As Int=1";
_idxfila = (int) (1);
RDebugUtils.currentLine=35061863;
 //BA.debugLineNum = 35061863;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=35061864;
 //BA.debugLineNum = 35061864;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=35061866;
 //BA.debugLineNum = 35061866;BA.debugLine="For Each sLinea As String In lstLineasFichero";
if (true) break;

case 5:
//for
this.state = 162;
group29 = _lstlineasfichero;
index29 = 0;
groupLen29 = group29.getSize();
this.state = 390;
if (true) break;

case 390:
//C
this.state = 162;
if (index29 < groupLen29) {
this.state = 7;
_slinea = BA.ObjectToString(group29.Get(index29));}
if (true) break;

case 391:
//C
this.state = 390;
index29++;
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=35061871;
 //BA.debugLineNum = 35061871;BA.debugLine="Dim NumCharLinea As Int=sLinea.Length";
_numcharlinea = _slinea.length();
RDebugUtils.currentLine=35061873;
 //BA.debugLineNum = 35061873;BA.debugLine="Dim csvLine(20) As Object";
_csvline = new Object[(int) (20)];
{
int d0 = _csvline.length;
for (int i0 = 0;i0 < d0;i0++) {
_csvline[i0] = new Object();
}
}
;
RDebugUtils.currentLine=35061875;
 //BA.debugLineNum = 35061875;BA.debugLine="If NumCharLinea<6 Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_numcharlinea<6) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=35061881;
 //BA.debugLineNum = 35061881;BA.debugLine="mSQL.AddNonQueryToBatch($\"insert into tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(("insert into tblRepsolLineasFicheroPedido (IDxFila, LineaConError) values (?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_idxfila),(Object)(1)}));
RDebugUtils.currentLine=35061882;
 //BA.debugLineNum = 35061882;BA.debugLine="Continue";
this.state = 391;
if (true) break;;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=35061884;
 //BA.debugLineNum = 35061884;BA.debugLine="Dim NumLinea As String=sLinea.SubString2(0,6)";
_numlinea = _slinea.substring((int) (0),(int) (6));
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=35061889;
 //BA.debugLineNum = 35061889;BA.debugLine="csvLine(0)=NumLinea";
_csvline[(int) (0)] = (Object)(_numlinea);
RDebugUtils.currentLine=35061893;
 //BA.debugLineNum = 35061893;BA.debugLine="Dim TipoLinea As Int=sLinea.SubString2(6,7)";
_tipolinea = (int)(Double.parseDouble(_slinea.substring((int) (6),(int) (7))));
RDebugUtils.currentLine=35061894;
 //BA.debugLineNum = 35061894;BA.debugLine="csvLine(2)=TipoLinea";
_csvline[(int) (2)] = (Object)(_tipolinea);
RDebugUtils.currentLine=35061896;
 //BA.debugLineNum = 35061896;BA.debugLine="Select Case TipoLinea";
if (true) break;

case 14:
//select
this.state = 161;
switch (_tipolinea) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
case 3: {
this.state = 75;
if (true) break;
}
case 9: {
this.state = 158;
if (true) break;
}
default: {
this.state = 160;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 161;
RDebugUtils.currentLine=35061903;
 //BA.debugLineNum = 35061903;BA.debugLine="Dim LineaNumeroPedido As String=sLinea.SubStri";
_lineanumeropedido = _slinea.substring((int) (7));
RDebugUtils.currentLine=35061904;
 //BA.debugLineNum = 35061904;BA.debugLine="Dim ArrLineaNumeroPedido() As String=Regex.Spl";
_arrlineanumeropedido = parent.__c.Regex.Split(".TXT",_lineanumeropedido);
RDebugUtils.currentLine=35061905;
 //BA.debugLineNum = 35061905;BA.debugLine="Dim NumeroPedido As String=ArrLineaNumeroPedid";
_numeropedido = _arrlineanumeropedido[(int) (0)];
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=35061908;
 //BA.debugLineNum = 35061908;BA.debugLine="Dim DatosLineaPedido As TipoDatosLineaPedidoRe";
_datoslineapedido = new b4j.docU.crepsol._tipodatoslineapedidorepsol();
RDebugUtils.currentLine=35061909;
 //BA.debugLineNum = 35061909;BA.debugLine="DatosLineaPedido.Initialize";
_datoslineapedido.Initialize();
RDebugUtils.currentLine=35061910;
 //BA.debugLineNum = 35061910;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
_datoslineapedido.Linea /*String*/  = _numlinea;
RDebugUtils.currentLine=35061913;
 //BA.debugLineNum = 35061913;BA.debugLine="If NumCharLinea<>236 Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_numcharlinea!=236) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=35061916;
 //BA.debugLineNum = 35061916;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaCabeceraEs";
_datoslineapedido.ErrorLongitudLineaCabeceraEstacion /*int*/  = (int) (1);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=35061931;
 //BA.debugLineNum = 35061931;BA.debugLine="Dim IDSedeEmpresa As String=sLinea.SubString2";
_idsedeempresa = _slinea.substring((int) (7),(int) (15));
RDebugUtils.currentLine=35061932;
 //BA.debugLineNum = 35061932;BA.debugLine="DatosLineaPedido.Sede=IDSedeEmpresa";
_datoslineapedido.Sede /*String*/  = _idsedeempresa;
RDebugUtils.currentLine=35061933;
 //BA.debugLineNum = 35061933;BA.debugLine="DatosLineaPedido.CodigoClienteERP=Utilidades.";
_datoslineapedido.CodigoClienteERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select CodigoClienteNAV from tblRepsolMapeoSedesEESS where Sede=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Sede /*String*/ )}))));
RDebugUtils.currentLine=35061934;
 //BA.debugLineNum = 35061934;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
_datoslineapedido.ErrorSede /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.CodigoClienteERP /*String*/ ).equals("")) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35061935;
 //BA.debugLineNum = 35061935;BA.debugLine="DatosLineaPedido.CodigoDireccionEnvioERP=Util";
_datoslineapedido.CodigoDireccionEnvioERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select CodigoDireccionEnvioNAV from tblRepsolMapeoSedesEESS where Sede=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Sede /*String*/ )}))));
RDebugUtils.currentLine=35061936;
 //BA.debugLineNum = 35061936;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
_datoslineapedido.ErrorSede /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.CodigoDireccionEnvioERP /*String*/ ).equals("")) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35061958;
 //BA.debugLineNum = 35061958;BA.debugLine="Dim NumeroPedidoEstacion As String=sLinea.Sub";
_numeropedidoestacion = _slinea.substring((int) (15),(int) (19));
RDebugUtils.currentLine=35061959;
 //BA.debugLineNum = 35061959;BA.debugLine="DatosLineaPedido.CodigoPedido=NumeroPedidoEst";
_datoslineapedido.CodigoPedido /*String*/  = _numeropedidoestacion;
RDebugUtils.currentLine=35061969;
 //BA.debugLineNum = 35061969;BA.debugLine="Dim FechaPedido As String=sLinea.SubString2(1";
_fechapedido = _slinea.substring((int) (19),(int) (29));
RDebugUtils.currentLine=35061970;
 //BA.debugLineNum = 35061970;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
RDebugUtils.currentLine=35061971;
 //BA.debugLineNum = 35061971;BA.debugLine="Dim FechaPedidoLong As Long=DateTime.DatePar";
_fechapedidolong = parent.__c.DateTime.DateParse(_fechapedido);
RDebugUtils.currentLine=35061972;
 //BA.debugLineNum = 35061972;BA.debugLine="DatosLineaPedido.FechaPedido=FechaPedido";
_datoslineapedido.FechaPedido /*String*/  = _fechapedido;
RDebugUtils.currentLine=35061973;
 //BA.debugLineNum = 35061973;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=0";
_datoslineapedido.ErrorFechaPedido /*int*/  = (int) (0);
 if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
RDebugUtils.currentLine=35061977;
 //BA.debugLineNum = 35061977;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=1";
_datoslineapedido.ErrorFechaPedido /*int*/  = (int) (1);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
;
RDebugUtils.currentLine=35061992;
 //BA.debugLineNum = 35061992;BA.debugLine="Dim NombreEstacion As String=sLinea.SubString";
_nombreestacion = _slinea.substring((int) (29),(int) (94));
RDebugUtils.currentLine=35061993;
 //BA.debugLineNum = 35061993;BA.debugLine="DatosLineaPedido.NombreEstacion=NombreEstacio";
_datoslineapedido.NombreEstacion /*String*/  = _nombreestacion;
RDebugUtils.currentLine=35062003;
 //BA.debugLineNum = 35062003;BA.debugLine="Dim Calle As String=sLinea.SubString2(94,159)";
_calle = _slinea.substring((int) (94),(int) (159));
RDebugUtils.currentLine=35062004;
 //BA.debugLineNum = 35062004;BA.debugLine="DatosLineaPedido.Calle=Calle";
_datoslineapedido.Calle /*String*/  = _calle;
RDebugUtils.currentLine=35062014;
 //BA.debugLineNum = 35062014;BA.debugLine="Dim CodigoPostal As String=sLinea.SubString2(";
_codigopostal = _slinea.substring((int) (159),(int) (164));
RDebugUtils.currentLine=35062015;
 //BA.debugLineNum = 35062015;BA.debugLine="DatosLineaPedido.CodigoPostal=CodigoPostal";
_datoslineapedido.CodigoPostal /*String*/  = _codigopostal;
RDebugUtils.currentLine=35062025;
 //BA.debugLineNum = 35062025;BA.debugLine="Dim Poblacion As String=sLinea.SubString2(164";
_poblacion = _slinea.substring((int) (164),(int) (194));
RDebugUtils.currentLine=35062026;
 //BA.debugLineNum = 35062026;BA.debugLine="DatosLineaPedido.Poblacion=Poblacion";
_datoslineapedido.Poblacion /*String*/  = _poblacion;
RDebugUtils.currentLine=35062036;
 //BA.debugLineNum = 35062036;BA.debugLine="Dim CodigoProvincia As String=sLinea.SubStrin";
_codigoprovincia = _slinea.substring((int) (194),(int) (196));
RDebugUtils.currentLine=35062037;
 //BA.debugLineNum = 35062037;BA.debugLine="DatosLineaPedido.CodigoProvincia=CodigoProvin";
_datoslineapedido.CodigoProvincia /*String*/  = _codigoprovincia;
RDebugUtils.currentLine=35062047;
 //BA.debugLineNum = 35062047;BA.debugLine="Dim Telefono As String=sLinea.SubString2(196,";
_telefono = _slinea.substring((int) (196),(int) (211));
RDebugUtils.currentLine=35062048;
 //BA.debugLineNum = 35062048;BA.debugLine="DatosLineaPedido.Telefono=Telefono";
_datoslineapedido.Telefono /*String*/  = _telefono;
RDebugUtils.currentLine=35062058;
 //BA.debugLineNum = 35062058;BA.debugLine="Dim sTipoEstacion As String=sLinea.SubString2";
_stipoestacion = _slinea.substring((int) (211),(int) (226));
RDebugUtils.currentLine=35062059;
 //BA.debugLineNum = 35062059;BA.debugLine="Dim TipoEstacion As String=sTipoEstacion";
_tipoestacion = _stipoestacion;
RDebugUtils.currentLine=35062069;
 //BA.debugLineNum = 35062069;BA.debugLine="DatosLineaPedido.TipoEstacion=TipoEstacion";
_datoslineapedido.TipoEstacion /*String*/  = _tipoestacion;
RDebugUtils.currentLine=35062082;
 //BA.debugLineNum = 35062082;BA.debugLine="Try";
if (true) break;

case 29:
//try
this.state = 34;
this.catchState = 33;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 34;
this.catchState = 33;
RDebugUtils.currentLine=35062083;
 //BA.debugLineNum = 35062083;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,236";
_marca = _slinea.substring((int) (226),(int) (236)).trim().toUpperCase();
 if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
RDebugUtils.currentLine=35062085;
 //BA.debugLineNum = 35062085;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835062085",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=35062086;
 //BA.debugLineNum = 35062086;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,Num";
_marca = _slinea.substring((int) (226),_numcharlinea).trim().toUpperCase();
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=35062099;
 //BA.debugLineNum = 35062099;BA.debugLine="If Not(Marca=\"REPSOL\" Or Marca=\"CAMPSA\" Or Ma";

case 34:
//if
this.state = 39;
this.catchState = 0;
if (parent.__c.Not((_marca).equals("REPSOL") || (_marca).equals("CAMPSA") || (_marca).equals("PETRONOR"))) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
RDebugUtils.currentLine=35062100;
 //BA.debugLineNum = 35062100;BA.debugLine="DatosLineaPedido.ErrorMarca=1";
_datoslineapedido.ErrorMarca /*int*/  = (int) (1);
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=35062107;
 //BA.debugLineNum = 35062107;BA.debugLine="DatosLineaPedido.Marca=Marca";
_datoslineapedido.Marca /*String*/  = _marca;
 if (true) break;

case 39:
//C
this.state = 161;
;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=35062136;
 //BA.debugLineNum = 35062136;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
_datoslineapedido.Linea /*String*/  = _numlinea;
RDebugUtils.currentLine=35062139;
 //BA.debugLineNum = 35062139;BA.debugLine="If NumCharLinea<>141 Then";
if (true) break;

case 42:
//if
this.state = 45;
if (_numcharlinea!=141) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=35062141;
 //BA.debugLineNum = 35062141;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaEmpleado=1";
_datoslineapedido.ErrorLongitudLineaEmpleado /*int*/  = (int) (1);
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=35062146;
 //BA.debugLineNum = 35062146;BA.debugLine="Dim DNI As String=sLinea.SubString2(29,38)   '";
_dni = _slinea.substring((int) (29),(int) (38));
RDebugUtils.currentLine=35062150;
 //BA.debugLineNum = 35062150;BA.debugLine="If DNIEmpleadoSel<>DNI Then";
if (true) break;

case 46:
//if
this.state = 73;
if ((_dniempleadosel).equals(_dni) == false) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=35062151;
 //BA.debugLineNum = 35062151;BA.debugLine="DNIEmpleadoSel=DNI";
_dniempleadosel = _dni;
RDebugUtils.currentLine=35062153;
 //BA.debugLineNum = 35062153;BA.debugLine="DatosLineaPedido.DNI=\"\"";
_datoslineapedido.DNI /*String*/  = "";
RDebugUtils.currentLine=35062154;
 //BA.debugLineNum = 35062154;BA.debugLine="DatosLineaPedido.ErrorDNI=0";
_datoslineapedido.ErrorDNI /*int*/  = (int) (0);
RDebugUtils.currentLine=35062155;
 //BA.debugLineNum = 35062155;BA.debugLine="DatosLineaPedido.NombreEmpleado=\"\"";
_datoslineapedido.NombreEmpleado /*String*/  = "";
RDebugUtils.currentLine=35062156;
 //BA.debugLineNum = 35062156;BA.debugLine="DatosLineaPedido.Cargo=\"\"";
_datoslineapedido.Cargo /*String*/  = "";
RDebugUtils.currentLine=35062157;
 //BA.debugLineNum = 35062157;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
_datoslineapedido.ErrorCargo /*int*/  = (int) (0);
RDebugUtils.currentLine=35062158;
 //BA.debugLineNum = 35062158;BA.debugLine="DatosLineaPedido.Sexo=\"\"";
_datoslineapedido.Sexo /*String*/  = "";
RDebugUtils.currentLine=35062159;
 //BA.debugLineNum = 35062159;BA.debugLine="DatosLineaPedido.errorSexo=0";
_datoslineapedido.ErrorSexo /*int*/  = (int) (0);
RDebugUtils.currentLine=35062160;
 //BA.debugLineNum = 35062160;BA.debugLine="DatosLineaPedido.Embarazo=\"\"";
_datoslineapedido.Embarazo /*String*/  = "";
RDebugUtils.currentLine=35062161;
 //BA.debugLineNum = 35062161;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
_datoslineapedido.ErrorEmbarazo /*int*/  = (int) (0);
RDebugUtils.currentLine=35062164;
 //BA.debugLineNum = 35062164;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
_datoslineapedido.CodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35062165;
 //BA.debugLineNum = 35062165;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
_datoslineapedido.DescripcionCodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35062166;
 //BA.debugLineNum = 35062166;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int) (0);
RDebugUtils.currentLine=35062167;
 //BA.debugLineNum = 35062167;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
_datoslineapedido.CodigoProductoERP /*String*/  = "";
RDebugUtils.currentLine=35062168;
 //BA.debugLineNum = 35062168;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
_datoslineapedido.ErrorCodigoProductoERP /*int*/  = (int) (0);
RDebugUtils.currentLine=35062169;
 //BA.debugLineNum = 35062169;BA.debugLine="DatosLineaPedido.Talla=\"\"";
_datoslineapedido.Talla /*String*/  = "";
RDebugUtils.currentLine=35062170;
 //BA.debugLineNum = 35062170;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
_datoslineapedido.TallaERP /*String*/  = "";
RDebugUtils.currentLine=35062171;
 //BA.debugLineNum = 35062171;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
_datoslineapedido.ErrorTalla /*int*/  = (int) (0);
RDebugUtils.currentLine=35062172;
 //BA.debugLineNum = 35062172;BA.debugLine="DatosLineaPedido.Cantidad=0";
_datoslineapedido.Cantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35062173;
 //BA.debugLineNum = 35062173;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
_datoslineapedido.ErrorCantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35062175;
 //BA.debugLineNum = 35062175;BA.debugLine="DatosLineaPedido.DNI=DNIEmpleadoSel";
_datoslineapedido.DNI /*String*/  = _dniempleadosel;
RDebugUtils.currentLine=35062176;
 //BA.debugLineNum = 35062176;BA.debugLine="Dim DNIEmpleadoSelOK As Boolean=checkDNI(DNIE";
_dniempleadoselok = BA.ObjectToBoolean(__ref._checkdni /*String*/ (null,_dniempleadosel));
RDebugUtils.currentLine=35062177;
 //BA.debugLineNum = 35062177;BA.debugLine="If Not(DNIEmpleadoSelOK) Then DatosLineaPedid";
if (true) break;

case 49:
//if
this.state = 54;
if (parent.__c.Not(_dniempleadoselok)) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_datoslineapedido.ErrorDNI /*int*/  = (int) (1);
if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=35062205;
 //BA.debugLineNum = 35062205;BA.debugLine="Dim NombreEmpleado As String=sLinea.SubStrin";
_nombreempleado = _slinea.substring((int) (38),(int) (138));
RDebugUtils.currentLine=35062206;
 //BA.debugLineNum = 35062206;BA.debugLine="DatosLineaPedido.NombreEmpleado=NombreEmplea";
_datoslineapedido.NombreEmpleado /*String*/  = _nombreempleado;
RDebugUtils.currentLine=35062207;
 //BA.debugLineNum = 35062207;BA.debugLine="Dim sCargo As String=sLinea.SubString2(138,1";
_scargo = _slinea.substring((int) (138),(int) (139));
RDebugUtils.currentLine=35062217;
 //BA.debugLineNum = 35062217;BA.debugLine="DatosLineaPedido.Cargo=sCargo";
_datoslineapedido.Cargo /*String*/  = _scargo;
RDebugUtils.currentLine=35062218;
 //BA.debugLineNum = 35062218;BA.debugLine="If Not(sCargo=\"G\" Or sCargo=\"E\" Or sCargo=\"V";
if (true) break;

case 55:
//if
this.state = 60;
if (parent.__c.Not((_scargo).equals("G") || (_scargo).equals("E") || (_scargo).equals("V"))) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
RDebugUtils.currentLine=35062219;
 //BA.debugLineNum = 35062219;BA.debugLine="DatosLineaPedido.ErrorCargo=1";
_datoslineapedido.ErrorCargo /*int*/  = (int) (1);
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=35062222;
 //BA.debugLineNum = 35062222;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
_datoslineapedido.ErrorCargo /*int*/  = (int) (0);
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=35062226;
 //BA.debugLineNum = 35062226;BA.debugLine="Dim sSexoEmpleado As String=sLinea.SubString";
_ssexoempleado = _slinea.substring((int) (139),(int) (140));
RDebugUtils.currentLine=35062234;
 //BA.debugLineNum = 35062234;BA.debugLine="DatosLineaPedido.Sexo=sSexoEmpleado";
_datoslineapedido.Sexo /*String*/  = _ssexoempleado;
RDebugUtils.currentLine=35062235;
 //BA.debugLineNum = 35062235;BA.debugLine="If Not(sSexoEmpleado=\"H\" Or sSexoEmpleado=\"M";
if (true) break;

case 61:
//if
this.state = 66;
if (parent.__c.Not((_ssexoempleado).equals("H") || (_ssexoempleado).equals("M"))) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
RDebugUtils.currentLine=35062236;
 //BA.debugLineNum = 35062236;BA.debugLine="DatosLineaPedido.ErrorSexo=1";
_datoslineapedido.ErrorSexo /*int*/  = (int) (1);
 if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=35062240;
 //BA.debugLineNum = 35062240;BA.debugLine="DatosLineaPedido.ErrorSexo=0";
_datoslineapedido.ErrorSexo /*int*/  = (int) (0);
 if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=35062243;
 //BA.debugLineNum = 35062243;BA.debugLine="Dim sEmbarazoEmpleado As String=sLinea.SubSt";
_sembarazoempleado = _slinea.substring((int) (140),(int) (141));
RDebugUtils.currentLine=35062252;
 //BA.debugLineNum = 35062252;BA.debugLine="DatosLineaPedido.Embarazo=sEmbarazoEmpleado";
_datoslineapedido.Embarazo /*String*/  = _sembarazoempleado;
RDebugUtils.currentLine=35062253;
 //BA.debugLineNum = 35062253;BA.debugLine="If Not(sEmbarazoEmpleado=\"S\" Or sEmbarazoEmp";
if (true) break;

case 67:
//if
this.state = 72;
if (parent.__c.Not((_sembarazoempleado).equals("S") || (_sembarazoempleado).equals("N"))) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
RDebugUtils.currentLine=35062254;
 //BA.debugLineNum = 35062254;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=1";
_datoslineapedido.ErrorEmbarazo /*int*/  = (int) (1);
 if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=35062258;
 //BA.debugLineNum = 35062258;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
_datoslineapedido.ErrorEmbarazo /*int*/  = (int) (0);
 if (true) break;

case 72:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 161;
;
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=35062302;
 //BA.debugLineNum = 35062302;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
_datoslineapedido.Linea /*String*/  = _numlinea;
RDebugUtils.currentLine=35062305;
 //BA.debugLineNum = 35062305;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
_datoslineapedido.CodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35062306;
 //BA.debugLineNum = 35062306;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
_datoslineapedido.DescripcionCodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35062307;
 //BA.debugLineNum = 35062307;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int) (0);
RDebugUtils.currentLine=35062308;
 //BA.debugLineNum = 35062308;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
_datoslineapedido.CodigoProductoERP /*String*/  = "";
RDebugUtils.currentLine=35062309;
 //BA.debugLineNum = 35062309;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
_datoslineapedido.ErrorCodigoProductoERP /*int*/  = (int) (0);
RDebugUtils.currentLine=35062310;
 //BA.debugLineNum = 35062310;BA.debugLine="DatosLineaPedido.Talla=\"\"";
_datoslineapedido.Talla /*String*/  = "";
RDebugUtils.currentLine=35062311;
 //BA.debugLineNum = 35062311;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
_datoslineapedido.TallaERP /*String*/  = "";
RDebugUtils.currentLine=35062312;
 //BA.debugLineNum = 35062312;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
_datoslineapedido.ErrorTalla /*int*/  = (int) (0);
RDebugUtils.currentLine=35062313;
 //BA.debugLineNum = 35062313;BA.debugLine="DatosLineaPedido.Cantidad=0";
_datoslineapedido.Cantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35062314;
 //BA.debugLineNum = 35062314;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
_datoslineapedido.ErrorCantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35062315;
 //BA.debugLineNum = 35062315;BA.debugLine="Try";
if (true) break;

case 76:
//try
this.state = 81;
this.catchState = 80;
this.state = 78;
if (true) break;

case 78:
//C
this.state = 81;
this.catchState = 80;
RDebugUtils.currentLine=35062316;
 //BA.debugLineNum = 35062316;BA.debugLine="Dim CodigoPrenda As String=sLinea.SubString2(";
_codigoprenda = _slinea.substring((int) (38),(int) (40));
RDebugUtils.currentLine=35062320;
 //BA.debugLineNum = 35062320;BA.debugLine="DatosLineaPedido.CodigoPrenda=CodigoPrenda";
_datoslineapedido.CodigoPrenda /*String*/  = _codigoprenda;
RDebugUtils.currentLine=35062321;
 //BA.debugLineNum = 35062321;BA.debugLine="Dim NumMapeoCodigoPrenda As Int=Utilidades.Fi";
_nummapeocodigoprenda = (int)(Double.parseDouble(parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_datoslineapedido.CodigoPrenda /*String*/ }))))));
RDebugUtils.currentLine=35062323;
 //BA.debugLineNum = 35062323;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=IIf(NumMap";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int)(BA.ObjectToNumber(((_nummapeocodigoprenda==0) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35062324;
 //BA.debugLineNum = 35062324;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=Util";
_datoslineapedido.DescripcionCodigoPrenda /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NombreCodigoPrenda from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_datoslineapedido.CodigoPrenda /*String*/ }))));
 if (true) break;

case 80:
//C
this.state = 81;
this.catchState = 0;
RDebugUtils.currentLine=35062327;
 //BA.debugLineNum = 35062327;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835062327",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=35062328;
 //BA.debugLineNum = 35062328;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=1";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int) (1);
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
this.catchState = 0;
;
RDebugUtils.currentLine=35062341;
 //BA.debugLineNum = 35062341;BA.debugLine="DatosLineaPedido.CodigoProductoERP=Utilidade";
_datoslineapedido.CodigoProductoERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Cargo=? and Sexo=? and CodigoPrenda=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Marca /*String*/ ),(Object)(_datoslineapedido.Cargo /*String*/ ),(Object)(_datoslineapedido.Sexo /*String*/ ),(Object)(_datoslineapedido.CodigoPrenda /*String*/ )}))));
RDebugUtils.currentLine=35062345;
 //BA.debugLineNum = 35062345;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=IIf(D";
_datoslineapedido.ErrorCodigoProductoERP /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.CodigoProductoERP /*String*/ ).equals("")) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35062350;
 //BA.debugLineNum = 35062350;BA.debugLine="Dim Talla As String=sLinea.SubString2(40,44).";
_talla = _slinea.substring((int) (40),(int) (44)).trim();
RDebugUtils.currentLine=35062351;
 //BA.debugLineNum = 35062351;BA.debugLine="DatosLineaPedido.Talla=Talla";
_datoslineapedido.Talla /*String*/  = _talla;
RDebugUtils.currentLine=35062352;
 //BA.debugLineNum = 35062352;BA.debugLine="DatosLineaPedido.TallaERP=Utilidades.FixNull(";
_datoslineapedido.TallaERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select Talla from tblRepsolTallasArticulosEESS where Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_datoslineapedido.CodigoProductoERP /*String*/ ,_datoslineapedido.Talla /*String*/ }))));
RDebugUtils.currentLine=35062355;
 //BA.debugLineNum = 35062355;BA.debugLine="DatosLineaPedido.ErrorTalla=IIf(DatosLineaPed";
_datoslineapedido.ErrorTalla /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.TallaERP /*String*/ ).equals(_datoslineapedido.Talla /*String*/ )) ? ((Object)(0)) : ((Object)(1)))));
RDebugUtils.currentLine=35062360;
 //BA.debugLineNum = 35062360;BA.debugLine="Try";
if (true) break;

case 82:
//try
this.state = 87;
this.catchState = 86;
this.state = 84;
if (true) break;

case 84:
//C
this.state = 87;
this.catchState = 86;
RDebugUtils.currentLine=35062361;
 //BA.debugLineNum = 35062361;BA.debugLine="Dim Cantidad As Int=sLinea.SubString2(44,45)";
_cantidad = (int)(Double.parseDouble(_slinea.substring((int) (44),(int) (45))));
RDebugUtils.currentLine=35062362;
 //BA.debugLineNum = 35062362;BA.debugLine="DatosLineaPedido.Cantidad=Cantidad";
_datoslineapedido.Cantidad /*int*/  = _cantidad;
 if (true) break;

case 86:
//C
this.state = 87;
this.catchState = 0;
RDebugUtils.currentLine=35062364;
 //BA.debugLineNum = 35062364;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835062364",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=35062365;
 //BA.debugLineNum = 35062365;BA.debugLine="DatosLineaPedido.ErrorCantidad=1";
_datoslineapedido.ErrorCantidad /*int*/  = (int) (1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=35062410;
 //BA.debugLineNum = 35062410;BA.debugLine="If DatosLineaPedido.ErrorSede=1 Then DatosLine";

case 87:
//if
this.state = 92;
this.catchState = 0;
if (_datoslineapedido.ErrorSede /*int*/ ==1) { 
this.state = 89;
;}if (true) break;

case 89:
//C
this.state = 92;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 92:
//C
this.state = 93;
;
RDebugUtils.currentLine=35062411;
 //BA.debugLineNum = 35062411;BA.debugLine="If DatosLineaPedido.ErrorFechaPedido=1 Then Da";
if (true) break;

case 93:
//if
this.state = 98;
if (_datoslineapedido.ErrorFechaPedido /*int*/ ==1) { 
this.state = 95;
;}if (true) break;

case 95:
//C
this.state = 98;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 98:
//C
this.state = 99;
;
RDebugUtils.currentLine=35062412;
 //BA.debugLineNum = 35062412;BA.debugLine="If DatosLineaPedido.ErrorMarca=1 Then DatosLin";
if (true) break;

case 99:
//if
this.state = 104;
if (_datoslineapedido.ErrorMarca /*int*/ ==1) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 104:
//C
this.state = 105;
;
RDebugUtils.currentLine=35062413;
 //BA.debugLineNum = 35062413;BA.debugLine="If DatosLineaPedido.ErrorDNI=1 Then DatosLinea";
if (true) break;

case 105:
//if
this.state = 110;
if (_datoslineapedido.ErrorDNI /*int*/ ==1) { 
this.state = 107;
;}if (true) break;

case 107:
//C
this.state = 110;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 110:
//C
this.state = 111;
;
RDebugUtils.currentLine=35062414;
 //BA.debugLineNum = 35062414;BA.debugLine="If DatosLineaPedido.ErrorCargo=1 Then DatosLin";
if (true) break;

case 111:
//if
this.state = 116;
if (_datoslineapedido.ErrorCargo /*int*/ ==1) { 
this.state = 113;
;}if (true) break;

case 113:
//C
this.state = 116;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 116:
//C
this.state = 117;
;
RDebugUtils.currentLine=35062415;
 //BA.debugLineNum = 35062415;BA.debugLine="If DatosLineaPedido.ErrorSexo=1 Then DatosLine";
if (true) break;

case 117:
//if
this.state = 122;
if (_datoslineapedido.ErrorSexo /*int*/ ==1) { 
this.state = 119;
;}if (true) break;

case 119:
//C
this.state = 122;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 122:
//C
this.state = 123;
;
RDebugUtils.currentLine=35062416;
 //BA.debugLineNum = 35062416;BA.debugLine="If DatosLineaPedido.ErrorEmbarazo=1 Then Datos";
if (true) break;

case 123:
//if
this.state = 128;
if (_datoslineapedido.ErrorEmbarazo /*int*/ ==1) { 
this.state = 125;
;}if (true) break;

case 125:
//C
this.state = 128;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 128:
//C
this.state = 129;
;
RDebugUtils.currentLine=35062417;
 //BA.debugLineNum = 35062417;BA.debugLine="If DatosLineaPedido.ErrorCodigoPrenda=1 Then D";
if (true) break;

case 129:
//if
this.state = 134;
if (_datoslineapedido.ErrorCodigoPrenda /*int*/ ==1) { 
this.state = 131;
;}if (true) break;

case 131:
//C
this.state = 134;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 134:
//C
this.state = 135;
;
RDebugUtils.currentLine=35062418;
 //BA.debugLineNum = 35062418;BA.debugLine="If DatosLineaPedido.ErrorCodigoProductoERP=1 T";
if (true) break;

case 135:
//if
this.state = 140;
if (_datoslineapedido.ErrorCodigoProductoERP /*int*/ ==1) { 
this.state = 137;
;}if (true) break;

case 137:
//C
this.state = 140;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 140:
//C
this.state = 141;
;
RDebugUtils.currentLine=35062419;
 //BA.debugLineNum = 35062419;BA.debugLine="If DatosLineaPedido.ErrorTalla=1 Then DatosLin";
if (true) break;

case 141:
//if
this.state = 146;
if (_datoslineapedido.ErrorTalla /*int*/ ==1) { 
this.state = 143;
;}if (true) break;

case 143:
//C
this.state = 146;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 146:
//C
this.state = 147;
;
RDebugUtils.currentLine=35062420;
 //BA.debugLineNum = 35062420;BA.debugLine="If DatosLineaPedido.ErrorCantidad=1 Then Datos";
if (true) break;

case 147:
//if
this.state = 152;
if (_datoslineapedido.ErrorCantidad /*int*/ ==1) { 
this.state = 149;
;}if (true) break;

case 149:
//C
this.state = 152;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 152:
//C
this.state = 153;
;
RDebugUtils.currentLine=35062422;
 //BA.debugLineNum = 35062422;BA.debugLine="If DatosLineaPedido.LineaConError=1 Then";
if (true) break;

case 153:
//if
this.state = 156;
if (_datoslineapedido.LineaConError /*int*/ ==1) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=35062423;
 //BA.debugLineNum = 35062423;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
parent.__c.LogImpl("835062423","*********************",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=35062424;
 //BA.debugLineNum = 35062424;BA.debugLine="LogColor($\"DatosLineaPedido ERROR: ${DatosLin";
parent.__c.LogImpl("835062424",("DatosLineaPedido ERROR: "+parent.__c.SmartStringFormatter("",(Object)(_datoslineapedido))+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=35062425;
 //BA.debugLineNum = 35062425;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
parent.__c.LogImpl("835062425","*********************",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
 if (true) break;

case 156:
//C
this.state = 161;
;
RDebugUtils.currentLine=35062435;
 //BA.debugLineNum = 35062435;BA.debugLine="mSQL.AddNonQueryToBatch($\" 	insert into tblRep";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(("\n"+"	insert into tblRepsolLineasFicheroPedido\n"+"	(Linea, ErrorLongitudLineaCabeceraEstacion, Sede , ErrorSede , CodigoClienteERP , CodigoDireccionEnvioERP \n"+"	, CodigoPedido , FechaPedido ,ErrorFechaPedido, NombreEstacion ,Calle , CodigoPostal \n"+"	, Poblacion , CodigoProvincia , Telefono \n"+"	, TipoEstacion , Marca , ErrorMarca \n"+"	, DNI , ErrorDNI , NombreEmpleado , Cargo , ErrorCargo \n"+"	, Sexo , ErrorSexo ,  Embarazo , ErrorEmbarazo \n"+"	,CodigoPrenda , ErrorCodigoPrenda , CodigoProductoERP, ErrorCodigoProductoERP, Talla, TallaERP , ErrorTalla , Cantidad, ErrorCantidad\n"+"	, LineaConError) \n"+"	values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Linea /*String*/ ),(Object)(_datoslineapedido.ErrorLongitudLineaCabeceraEstacion /*int*/ ),(Object)(_datoslineapedido.Sede /*String*/ ),(Object)(_datoslineapedido.ErrorSede /*int*/ ),(Object)(_datoslineapedido.CodigoClienteERP /*String*/ ),(Object)(_datoslineapedido.CodigoDireccionEnvioERP /*String*/ ),(Object)(_datoslineapedido.CodigoPedido /*String*/ ),(Object)(_datoslineapedido.FechaPedido /*String*/ ),(Object)(_datoslineapedido.ErrorFechaPedido /*int*/ ),(Object)(_datoslineapedido.NombreEstacion /*String*/ ),(Object)(_datoslineapedido.Calle /*String*/ ),(Object)(_datoslineapedido.CodigoPostal /*String*/ ),(Object)(_datoslineapedido.Poblacion /*String*/ ),(Object)(_datoslineapedido.CodigoProvincia /*String*/ ),(Object)(_datoslineapedido.Telefono /*String*/ ),(Object)(_datoslineapedido.TipoEstacion /*String*/ ),(Object)(_datoslineapedido.Marca /*String*/ ),(Object)(_datoslineapedido.ErrorMarca /*int*/ ),(Object)(_datoslineapedido.DNI /*String*/ ),(Object)(_datoslineapedido.ErrorDNI /*int*/ ),(Object)(_datoslineapedido.NombreEmpleado /*String*/ ),(Object)(_datoslineapedido.Cargo /*String*/ ),(Object)(_datoslineapedido.ErrorCargo /*int*/ ),(Object)(_datoslineapedido.Sexo /*String*/ ),(Object)(_datoslineapedido.ErrorSexo /*int*/ ),(Object)(_datoslineapedido.Embarazo /*String*/ ),(Object)(_datoslineapedido.ErrorEmbarazo /*int*/ ),(Object)(_datoslineapedido.CodigoPrenda /*String*/ ),(Object)(_datoslineapedido.ErrorCodigoPrenda /*int*/ ),(Object)(_datoslineapedido.CodigoProductoERP /*String*/ ),(Object)(_datoslineapedido.ErrorCodigoProductoERP /*int*/ ),(Object)(_datoslineapedido.Talla /*String*/ ),(Object)(_datoslineapedido.TallaERP /*String*/ ),(Object)(_datoslineapedido.ErrorTalla /*int*/ ),(Object)(_datoslineapedido.Cantidad /*int*/ ),(Object)(_datoslineapedido.ErrorCantidad /*int*/ ),(Object)(_datoslineapedido.LineaConError /*int*/ )}));
RDebugUtils.currentLine=35062457;
 //BA.debugLineNum = 35062457;BA.debugLine="DatosLineaPedido.LineaConError=0  ' reseteamos la";
_datoslineapedido.LineaConError /*int*/  = (int) (0);
 if (true) break;

case 158:
//C
this.state = 161;
RDebugUtils.currentLine=35062470;
 //BA.debugLineNum = 35062470;BA.debugLine="Exit ' Salir del loop (ésta debería ser la últ";
this.state = 161;
if (true) break;
 if (true) break;

case 160:
//C
this.state = 161;
 if (true) break;

case 161:
//C
this.state = 391;
;
 if (true) break;
if (true) break;

case 162:
//C
this.state = 163;
;
RDebugUtils.currentLine=35062489;
 //BA.debugLineNum = 35062489;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=35062490;
 //BA.debugLineNum = 35062490;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero3"), _senderfilter);
this.state = 392;
return;
case 392:
//C
this.state = 163;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=35062491;
 //BA.debugLineNum = 35062491;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("835062491","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=35062504;
 //BA.debugLineNum = 35062504;BA.debugLine="Dim NumLineasConError As Int=mSQL.ExecQuerySingle";
_numlineasconerror = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(("select count(*) from tblRepsolLineasFicheroPedido where LineaConError=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1)}))));
RDebugUtils.currentLine=35062505;
 //BA.debugLineNum = 35062505;BA.debugLine="Dim CSVErroresSubidoOKFTP As Boolean";
_csverroressubidookftp = false;
RDebugUtils.currentLine=35062507;
 //BA.debugLineNum = 35062507;BA.debugLine="If NumLineasConError>0 Then";
if (true) break;

case 163:
//if
this.state = 366;
if (_numlineasconerror>0) { 
this.state = 165;
}if (true) break;

case 165:
//C
this.state = 166;
RDebugUtils.currentLine=35062509;
 //BA.debugLineNum = 35062509;BA.debugLine="Dim rsSedePedidoDNI As ResultSet=mSQL.ExecQuery(";
_rssedepedidodni = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rssedepedidodni = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("select distinct Sede, CodigoPedido, DNI from tblRepsolLineasFicheroPedido where LineaConError=1"));
RDebugUtils.currentLine=35062510;
 //BA.debugLineNum = 35062510;BA.debugLine="Do While rsSedePedidoDNI.NextRow";
if (true) break;

case 166:
//do while
this.state = 351;
while (_rssedepedidodni.NextRow()) {
this.state = 168;
if (true) break;
}
if (true) break;

case 168:
//C
this.state = 169;
RDebugUtils.currentLine=35062511;
 //BA.debugLineNum = 35062511;BA.debugLine="Dim Sede As String=rsSedePedidoDNI.GetString(\"S";
_sede = _rssedepedidodni.GetString("Sede");
RDebugUtils.currentLine=35062512;
 //BA.debugLineNum = 35062512;BA.debugLine="Dim PedidoSede As String=rsSedePedidoDNI.GetStr";
_pedidosede = _rssedepedidodni.GetString("CodigoPedido");
RDebugUtils.currentLine=35062513;
 //BA.debugLineNum = 35062513;BA.debugLine="Dim DNI As String=rsSedePedidoDNI.GetString(\"DN";
_dni = _rssedepedidodni.GetString("DNI");
RDebugUtils.currentLine=35062515;
 //BA.debugLineNum = 35062515;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolLineasFiche";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblRepsolLineasFicheroPedido set SedePedidoDNIConError=? where Sede=? and CodigoPedido=? and DNI=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(_sede),(Object)(_pedidosede),(Object)(_dni)}));
RDebugUtils.currentLine=35062518;
 //BA.debugLineNum = 35062518;BA.debugLine="mSQL.ExecNonQuery2(\"insert into tblRepsolErrore";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into tblRepsolErroresSedePedidoDNIFicheroPedido (Sede, PedidoSede, DNI, Errores) values (?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_sede))+"")),(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_pedidosede))+"")),(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_dni))+"")),(Object)("")}));
RDebugUtils.currentLine=35062521;
 //BA.debugLineNum = 35062521;BA.debugLine="Dim ErrorLongitudLineaCabeceraEstacion As Boole";
_errorlongitudlineacabeceraestacion = false;
RDebugUtils.currentLine=35062522;
 //BA.debugLineNum = 35062522;BA.debugLine="Dim ErrorSede As Boolean";
_errorsede = false;
RDebugUtils.currentLine=35062523;
 //BA.debugLineNum = 35062523;BA.debugLine="Dim ErrorFechaPedido As Boolean";
_errorfechapedido = false;
RDebugUtils.currentLine=35062524;
 //BA.debugLineNum = 35062524;BA.debugLine="Dim ErrorMarca As Boolean";
_errormarca = false;
RDebugUtils.currentLine=35062525;
 //BA.debugLineNum = 35062525;BA.debugLine="Dim ErrorLongitudLineaEmpleado As Boolean";
_errorlongitudlineaempleado = false;
RDebugUtils.currentLine=35062526;
 //BA.debugLineNum = 35062526;BA.debugLine="Dim ErrorDNI As Boolean";
_errordni = false;
RDebugUtils.currentLine=35062527;
 //BA.debugLineNum = 35062527;BA.debugLine="Dim ErrorCargo As Boolean";
_errorcargo = false;
RDebugUtils.currentLine=35062528;
 //BA.debugLineNum = 35062528;BA.debugLine="Dim ErrorSexo As Boolean";
_errorsexo = false;
RDebugUtils.currentLine=35062529;
 //BA.debugLineNum = 35062529;BA.debugLine="Dim ErrorEmbarazo As Boolean";
_errorembarazo = false;
RDebugUtils.currentLine=35062530;
 //BA.debugLineNum = 35062530;BA.debugLine="Dim ErrorLongitudLineaProducto As Boolean";
_errorlongitudlineaproducto = false;
RDebugUtils.currentLine=35062531;
 //BA.debugLineNum = 35062531;BA.debugLine="Dim ErrorCodigoPrenda As Boolean";
_errorcodigoprenda = false;
RDebugUtils.currentLine=35062532;
 //BA.debugLineNum = 35062532;BA.debugLine="Dim ErrorCodigoProductoERP As Boolean";
_errorcodigoproductoerp = false;
RDebugUtils.currentLine=35062533;
 //BA.debugLineNum = 35062533;BA.debugLine="Dim ErrorTalla As Boolean";
_errortalla = false;
RDebugUtils.currentLine=35062534;
 //BA.debugLineNum = 35062534;BA.debugLine="Dim ErrorCantidad As Boolean";
_errorcantidad = false;
RDebugUtils.currentLine=35062548;
 //BA.debugLineNum = 35062548;BA.debugLine="Dim rsLineasSedePedidoDNI As ResultSet= mSQL.Ex";
_rslineassedepedidodni = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rslineassedepedidodni = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select distinct Sede, CodigoPedido, DNI\n"+"	,ErrorLongitudLineaCabeceraEstacion,ErrorSede,ErrorFechaPedido,ErrorMarca\n"+"	,ErrorLongitudLineaEmpleado, ErrorDNI, ErrorCargo, ErrorSexo, ErrorEmbarazo\n"+"	 ,ErrorLongitudLineaProducto, ErrorCodigoPrenda,ErrorCodigoProductoERP,ErrorTalla, ErrorCantidad\n"+"	 from tblRepsolLineasFicheroPedido\n"+"	 where\n"+"	 Sede=? And CodigoPedido=? And DNI=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sede),(Object)(_pedidosede),(Object)(_dni)}));
RDebugUtils.currentLine=35062557;
 //BA.debugLineNum = 35062557;BA.debugLine="Do While rsLineasSedePedidoDNI.NextRow";
if (true) break;

case 169:
//do while
this.state = 262;
while (_rslineassedepedidodni.NextRow()) {
this.state = 171;
if (true) break;
}
if (true) break;

case 171:
//C
this.state = 172;
RDebugUtils.currentLine=35062558;
 //BA.debugLineNum = 35062558;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
if (true) break;

case 172:
//if
this.state = 177;
if (_rslineassedepedidodni.GetInt("ErrorLongitudLineaCabeceraEstacion")==1) { 
this.state = 174;
;}if (true) break;

case 174:
//C
this.state = 177;
_errorlongitudlineacabeceraestacion = parent.__c.True;
if (true) break;

case 177:
//C
this.state = 178;
;
RDebugUtils.currentLine=35062559;
 //BA.debugLineNum = 35062559;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSede\")=1";
if (true) break;

case 178:
//if
this.state = 183;
if (_rslineassedepedidodni.GetInt("ErrorSede")==1) { 
this.state = 180;
;}if (true) break;

case 180:
//C
this.state = 183;
_errorsede = parent.__c.True;
if (true) break;

case 183:
//C
this.state = 184;
;
RDebugUtils.currentLine=35062560;
 //BA.debugLineNum = 35062560;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorFechaPed";
if (true) break;

case 184:
//if
this.state = 189;
if (_rslineassedepedidodni.GetInt("ErrorFechaPedido")==1) { 
this.state = 186;
;}if (true) break;

case 186:
//C
this.state = 189;
_errorfechapedido = parent.__c.True;
if (true) break;

case 189:
//C
this.state = 190;
;
RDebugUtils.currentLine=35062561;
 //BA.debugLineNum = 35062561;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorMarca\")=";
if (true) break;

case 190:
//if
this.state = 195;
if (_rslineassedepedidodni.GetInt("ErrorMarca")==1) { 
this.state = 192;
;}if (true) break;

case 192:
//C
this.state = 195;
_errormarca = parent.__c.True;
if (true) break;

case 195:
//C
this.state = 196;
;
RDebugUtils.currentLine=35062562;
 //BA.debugLineNum = 35062562;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
if (true) break;

case 196:
//if
this.state = 201;
if (_rslineassedepedidodni.GetInt("ErrorLongitudLineaEmpleado")==1) { 
this.state = 198;
;}if (true) break;

case 198:
//C
this.state = 201;
_errorlongitudlineaempleado = parent.__c.True;
if (true) break;

case 201:
//C
this.state = 202;
;
RDebugUtils.currentLine=35062563;
 //BA.debugLineNum = 35062563;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorDNI\")=1";
if (true) break;

case 202:
//if
this.state = 207;
if (_rslineassedepedidodni.GetInt("ErrorDNI")==1) { 
this.state = 204;
;}if (true) break;

case 204:
//C
this.state = 207;
_errordni = parent.__c.True;
if (true) break;

case 207:
//C
this.state = 208;
;
RDebugUtils.currentLine=35062564;
 //BA.debugLineNum = 35062564;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCargo\")=";
if (true) break;

case 208:
//if
this.state = 213;
if (_rslineassedepedidodni.GetInt("ErrorCargo")==1) { 
this.state = 210;
;}if (true) break;

case 210:
//C
this.state = 213;
_errorcargo = parent.__c.True;
if (true) break;

case 213:
//C
this.state = 214;
;
RDebugUtils.currentLine=35062565;
 //BA.debugLineNum = 35062565;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSexo\")=1";
if (true) break;

case 214:
//if
this.state = 219;
if (_rslineassedepedidodni.GetInt("ErrorSexo")==1) { 
this.state = 216;
;}if (true) break;

case 216:
//C
this.state = 219;
_errorsexo = parent.__c.True;
if (true) break;

case 219:
//C
this.state = 220;
;
RDebugUtils.currentLine=35062566;
 //BA.debugLineNum = 35062566;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorEmbarazo";
if (true) break;

case 220:
//if
this.state = 225;
if (_rslineassedepedidodni.GetInt("ErrorEmbarazo")==1) { 
this.state = 222;
;}if (true) break;

case 222:
//C
this.state = 225;
_errorembarazo = parent.__c.True;
if (true) break;

case 225:
//C
this.state = 226;
;
RDebugUtils.currentLine=35062567;
 //BA.debugLineNum = 35062567;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
if (true) break;

case 226:
//if
this.state = 231;
if (_rslineassedepedidodni.GetInt("ErrorLongitudLineaProducto")==1) { 
this.state = 228;
;}if (true) break;

case 228:
//C
this.state = 231;
_errorlongitudlineaproducto = parent.__c.True;
if (true) break;

case 231:
//C
this.state = 232;
;
RDebugUtils.currentLine=35062568;
 //BA.debugLineNum = 35062568;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
if (true) break;

case 232:
//if
this.state = 237;
if (_rslineassedepedidodni.GetInt("ErrorCodigoPrenda")==1) { 
this.state = 234;
;}if (true) break;

case 234:
//C
this.state = 237;
_errorcodigoprenda = parent.__c.True;
if (true) break;

case 237:
//C
this.state = 238;
;
RDebugUtils.currentLine=35062569;
 //BA.debugLineNum = 35062569;BA.debugLine="If ErrorMarca Or ErrorCargo Or ErrorSexo Or Er";
if (true) break;

case 238:
//if
this.state = 243;
if (_errormarca || _errorcargo || _errorsexo || _errorembarazo || _errorcodigoprenda) { 
this.state = 240;
;}if (true) break;

case 240:
//C
this.state = 243;
this.state = 169;
if (true) break;;
if (true) break;

case 243:
//C
this.state = 244;
;
RDebugUtils.currentLine=35062570;
 //BA.debugLineNum = 35062570;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
if (true) break;

case 244:
//if
this.state = 249;
if (_rslineassedepedidodni.GetInt("ErrorCodigoProductoERP")==1) { 
this.state = 246;
;}if (true) break;

case 246:
//C
this.state = 249;
_errorcodigoproductoerp = parent.__c.True;
if (true) break;

case 249:
//C
this.state = 250;
;
RDebugUtils.currentLine=35062571;
 //BA.debugLineNum = 35062571;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorTalla\")=";
if (true) break;

case 250:
//if
this.state = 255;
if (_rslineassedepedidodni.GetInt("ErrorTalla")==1) { 
this.state = 252;
;}if (true) break;

case 252:
//C
this.state = 255;
_errortalla = parent.__c.True;
if (true) break;

case 255:
//C
this.state = 256;
;
RDebugUtils.currentLine=35062572;
 //BA.debugLineNum = 35062572;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCantidad";
if (true) break;

case 256:
//if
this.state = 261;
if (_rslineassedepedidodni.GetInt("ErrorCantidad")==1) { 
this.state = 258;
;}if (true) break;

case 258:
//C
this.state = 261;
_errorcantidad = parent.__c.True;
if (true) break;

case 261:
//C
this.state = 169;
;
 if (true) break;

case 262:
//C
this.state = 263;
;
RDebugUtils.currentLine=35062574;
 //BA.debugLineNum = 35062574;BA.debugLine="rsLineasSedePedidoDNI.close";
_rslineassedepedidodni.Close();
RDebugUtils.currentLine=35062576;
 //BA.debugLineNum = 35062576;BA.debugLine="Dim sbTextoError As StringBuilder";
_sbtextoerror = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35062577;
 //BA.debugLineNum = 35062577;BA.debugLine="sbTextoError.Initialize";
_sbtextoerror.Initialize();
RDebugUtils.currentLine=35062579;
 //BA.debugLineNum = 35062579;BA.debugLine="If ErrorLongitudLineaCabeceraEstacion Then sbTe";
if (true) break;

case 263:
//if
this.state = 268;
if (_errorlongitudlineacabeceraestacion) { 
this.state = 265;
;}if (true) break;

case 265:
//C
this.state = 268;
_sbtextoerror.Append(", ErrorLongitudLineaCabeceraEstacion");
if (true) break;

case 268:
//C
this.state = 269;
;
RDebugUtils.currentLine=35062580;
 //BA.debugLineNum = 35062580;BA.debugLine="If ErrorSede Then sbTextoError.Append(\", Sede n";
if (true) break;

case 269:
//if
this.state = 274;
if (_errorsede) { 
this.state = 271;
;}if (true) break;

case 271:
//C
this.state = 274;
_sbtextoerror.Append(", Sede no existe ERP Proin");
if (true) break;

case 274:
//C
this.state = 275;
;
RDebugUtils.currentLine=35062581;
 //BA.debugLineNum = 35062581;BA.debugLine="If ErrorFechaPedido Then sbTextoError.Append(\",";
if (true) break;

case 275:
//if
this.state = 280;
if (_errorfechapedido) { 
this.state = 277;
;}if (true) break;

case 277:
//C
this.state = 280;
_sbtextoerror.Append(", Error Fecha");
if (true) break;

case 280:
//C
this.state = 281;
;
RDebugUtils.currentLine=35062582;
 //BA.debugLineNum = 35062582;BA.debugLine="If ErrorMarca Then sbTextoError.Append(\", Error";
if (true) break;

case 281:
//if
this.state = 286;
if (_errormarca) { 
this.state = 283;
;}if (true) break;

case 283:
//C
this.state = 286;
_sbtextoerror.Append(", Error Marca");
if (true) break;

case 286:
//C
this.state = 287;
;
RDebugUtils.currentLine=35062583;
 //BA.debugLineNum = 35062583;BA.debugLine="If ErrorLongitudLineaEmpleado Then sbTextoError";
if (true) break;

case 287:
//if
this.state = 292;
if (_errorlongitudlineaempleado) { 
this.state = 289;
;}if (true) break;

case 289:
//C
this.state = 292;
_sbtextoerror.Append(", ErrorLongitudLineaEmpleado");
if (true) break;

case 292:
//C
this.state = 293;
;
RDebugUtils.currentLine=35062584;
 //BA.debugLineNum = 35062584;BA.debugLine="If ErrorDNI Then sbTextoError.Append(\", DNI no";
if (true) break;

case 293:
//if
this.state = 298;
if (_errordni) { 
this.state = 295;
;}if (true) break;

case 295:
//C
this.state = 298;
_sbtextoerror.Append(", DNI no válido");
if (true) break;

case 298:
//C
this.state = 299;
;
RDebugUtils.currentLine=35062585;
 //BA.debugLineNum = 35062585;BA.debugLine="If ErrorCargo Then sbTextoError.Append(\", Error";
if (true) break;

case 299:
//if
this.state = 304;
if (_errorcargo) { 
this.state = 301;
;}if (true) break;

case 301:
//C
this.state = 304;
_sbtextoerror.Append(", Error Cargo");
if (true) break;

case 304:
//C
this.state = 305;
;
RDebugUtils.currentLine=35062586;
 //BA.debugLineNum = 35062586;BA.debugLine="If ErrorSexo Then sbTextoError.Append(\", Error";
if (true) break;

case 305:
//if
this.state = 310;
if (_errorsexo) { 
this.state = 307;
;}if (true) break;

case 307:
//C
this.state = 310;
_sbtextoerror.Append(", Error Sexo");
if (true) break;

case 310:
//C
this.state = 311;
;
RDebugUtils.currentLine=35062587;
 //BA.debugLineNum = 35062587;BA.debugLine="If ErrorEmbarazo Then sbTextoError.Append(\", Er";
if (true) break;

case 311:
//if
this.state = 316;
if (_errorembarazo) { 
this.state = 313;
;}if (true) break;

case 313:
//C
this.state = 316;
_sbtextoerror.Append(", Error Embarazo");
if (true) break;

case 316:
//C
this.state = 317;
;
RDebugUtils.currentLine=35062588;
 //BA.debugLineNum = 35062588;BA.debugLine="If ErrorLongitudLineaProducto Then sbTextoError";
if (true) break;

case 317:
//if
this.state = 322;
if (_errorlongitudlineaproducto) { 
this.state = 319;
;}if (true) break;

case 319:
//C
this.state = 322;
_sbtextoerror.Append(", ErrorLongitudLineaProducto");
if (true) break;

case 322:
//C
this.state = 323;
;
RDebugUtils.currentLine=35062589;
 //BA.debugLineNum = 35062589;BA.debugLine="If ErrorCodigoPrenda Then sbTextoError.Append(\"";
if (true) break;

case 323:
//if
this.state = 328;
if (_errorcodigoprenda) { 
this.state = 325;
;}if (true) break;

case 325:
//C
this.state = 328;
_sbtextoerror.Append(", Error Código Prenda");
if (true) break;

case 328:
//C
this.state = 329;
;
RDebugUtils.currentLine=35062590;
 //BA.debugLineNum = 35062590;BA.debugLine="If ErrorCodigoProductoERP Then sbTextoError.App";
if (true) break;

case 329:
//if
this.state = 334;
if (_errorcodigoproductoerp) { 
this.state = 331;
;}if (true) break;

case 331:
//C
this.state = 334;
_sbtextoerror.Append(", ErrorCodigoProductoERP");
if (true) break;

case 334:
//C
this.state = 335;
;
RDebugUtils.currentLine=35062591;
 //BA.debugLineNum = 35062591;BA.debugLine="If ErrorTalla Then sbTextoError.Append(\", Error";
if (true) break;

case 335:
//if
this.state = 340;
if (_errortalla) { 
this.state = 337;
;}if (true) break;

case 337:
//C
this.state = 340;
_sbtextoerror.Append(", ErrorTalla");
if (true) break;

case 340:
//C
this.state = 341;
;
RDebugUtils.currentLine=35062592;
 //BA.debugLineNum = 35062592;BA.debugLine="If ErrorCantidad Then sbTextoError.Append(\", Er";
if (true) break;

case 341:
//if
this.state = 346;
if (_errorcantidad) { 
this.state = 343;
;}if (true) break;

case 343:
//C
this.state = 346;
_sbtextoerror.Append(", ErrorCantidad");
if (true) break;

case 346:
//C
this.state = 347;
;
RDebugUtils.currentLine=35062594;
 //BA.debugLineNum = 35062594;BA.debugLine="If sbTextoError.Length>2 Then";
if (true) break;

case 347:
//if
this.state = 350;
if (_sbtextoerror.getLength()>2) { 
this.state = 349;
}if (true) break;

case 349:
//C
this.state = 350;
RDebugUtils.currentLine=35062595;
 //BA.debugLineNum = 35062595;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolErroresSed";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblRepsolErroresSedePedidoDNIFicheroPedido set Errores=? where Sede=? and PedidoSede=? and DNI=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_sbtextoerror.ToString().substring((int) (2))))+"")),(Object)(_sede),(Object)(_pedidosede),(Object)(_dni)}));
 if (true) break;

case 350:
//C
this.state = 166;
;
 if (true) break;

case 351:
//C
this.state = 352;
;
RDebugUtils.currentLine=35062600;
 //BA.debugLineNum = 35062600;BA.debugLine="rsSedePedidoDNI.close";
_rssedepedidodni.Close();
RDebugUtils.currentLine=35062602;
 //BA.debugLineNum = 35062602;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=35062604;
 //BA.debugLineNum = 35062604;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Generando F";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Generando Fichero CSV ERRORES..."));
RDebugUtils.currentLine=35062605;
 //BA.debugLineNum = 35062605;BA.debugLine="Dim lstErrores As List=DBUtils.ExecuteMemoryTabl";
_lsterrores = new anywheresoftware.b4a.objects.collections.List();
_lsterrores = parent._dbutils._executememorytable /*anywheresoftware.b4a.objects.collections.List*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,("select * from tblRepsolErroresSedePedidoDNIFicheroPedido"),(String[])(parent.__c.Null),(int) (0));
RDebugUtils.currentLine=35062606;
 //BA.debugLineNum = 35062606;BA.debugLine="Dim lstEncabezadosErrores As List";
_lstencabezadoserrores = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35062607;
 //BA.debugLineNum = 35062607;BA.debugLine="lstEncabezadosErrores.Initialize";
_lstencabezadoserrores.Initialize();
RDebugUtils.currentLine=35062608;
 //BA.debugLineNum = 35062608;BA.debugLine="lstEncabezadosErrores.add(\"Sede\")";
_lstencabezadoserrores.Add((Object)("Sede"));
RDebugUtils.currentLine=35062609;
 //BA.debugLineNum = 35062609;BA.debugLine="lstEncabezadosErrores.add(\"PedidoSede\")";
_lstencabezadoserrores.Add((Object)("PedidoSede"));
RDebugUtils.currentLine=35062610;
 //BA.debugLineNum = 35062610;BA.debugLine="lstEncabezadosErrores.add(\"DNI\")";
_lstencabezadoserrores.Add((Object)("DNI"));
RDebugUtils.currentLine=35062611;
 //BA.debugLineNum = 35062611;BA.debugLine="lstEncabezadosErrores.add(\"ERROR\")";
_lstencabezadoserrores.Add((Object)("ERROR"));
RDebugUtils.currentLine=35062641;
 //BA.debugLineNum = 35062641;BA.debugLine="Dim sFicheroErrores As String=GenerarCSVSeparado";
_sficheroerrores = __ref._generarcsvseparadorcomasquotes /*String*/ (null,_lsterrores,",",_lstencabezadoserrores);
RDebugUtils.currentLine=35062642;
 //BA.debugLineNum = 35062642;BA.debugLine="Dim NombreFicheroErrores As String=$\"Errores_${N";
_nombreficheroerrores = ("Errores_"+parent.__c.SmartStringFormatter("",(Object)(_numeropedido))+".csv");
RDebugUtils.currentLine=35062643;
 //BA.debugLineNum = 35062643;BA.debugLine="File.WriteString(CarpetaDestinoFicherosPedidosEr";
parent.__c.File.WriteString(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores,_sficheroerrores);
RDebugUtils.currentLine=35062644;
 //BA.debugLineNum = 35062644;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
if (true) break;

case 352:
//if
this.state = 355;
if (parent.__c.File.Exists(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores)==parent.__c.False) { 
this.state = 354;
}if (true) break;

case 354:
//C
this.state = 355;
RDebugUtils.currentLine=35062645;
 //BA.debugLineNum = 35062645;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero erro";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Fichero error aun no existe!!","Error");
RDebugUtils.currentLine=35062646;
 //BA.debugLineNum = 35062646;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero3"), _msa);
this.state = 393;
return;
case 393:
//C
this.state = 355;
;
 if (true) break;

case 355:
//C
this.state = 356;
;
RDebugUtils.currentLine=35062648;
 //BA.debugLineNum = 35062648;BA.debugLine="Log(File.Exists(CarpetaDestinoFicherosPedidosErr";
parent.__c.LogImpl("835062648",BA.ObjectToString(parent.__c.File.Exists(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores)),0);
RDebugUtils.currentLine=35062654;
 //BA.debugLineNum = 35062654;BA.debugLine="Dim RutaFTPFicheroPedidoErrores As String=ErrorF";
_rutaftpficheropedidoerrores = __ref._errorfilesfoldersftprepsol /*String*/ +"/"+_nombreficheroerrores;
RDebugUtils.currentLine=35062656;
 //BA.debugLineNum = 35062656;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
if (true) break;

case 356:
//if
this.state = 365;
if (parent.__c.File.Exists(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores)) { 
this.state = 358;
}if (true) break;

case 358:
//C
this.state = 359;
RDebugUtils.currentLine=35062657;
 //BA.debugLineNum = 35062657;BA.debugLine="wait for(SubirFicheroACarpetaFTP(CarpetaDestino";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero3"), __ref._subirficheroacarpetaftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores,_rutaftpficheropedidoerrores));
this.state = 394;
return;
case 394:
//C
this.state = 359;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=35062658;
 //BA.debugLineNum = 35062658;BA.debugLine="If Not(Success) Then";
if (true) break;

case 359:
//if
this.state = 364;
if (parent.__c.Not(_success)) { 
this.state = 361;
}else {
this.state = 363;
}if (true) break;

case 361:
//C
this.state = 364;
RDebugUtils.currentLine=35062660;
 //BA.debugLineNum = 35062660;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Ha habido un error en la subida del fichero de errores"+parent.__c.SmartStringFormatter("",(Object)(_nombreficheroerrores))+""),"ATENCION!");
RDebugUtils.currentLine=35062661;
 //BA.debugLineNum = 35062661;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero3"), _msa);
this.state = 395;
return;
case 395:
//C
this.state = 364;
;
RDebugUtils.currentLine=35062662;
 //BA.debugLineNum = 35062662;BA.debugLine="CSVErroresSubidoOKFTP=False";
_csverroressubidookftp = parent.__c.False;
RDebugUtils.currentLine=35062663;
 //BA.debugLineNum = 35062663;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35062664;
 //BA.debugLineNum = 35062664;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 363:
//C
this.state = 364;
RDebugUtils.currentLine=35062666;
 //BA.debugLineNum = 35062666;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Se ha subi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Se ha subido el fichero de errores"+parent.__c.SmartStringFormatter("",(Object)(_nombreficheroerrores))+" correspondiente al fichero de pedido seleccionado."),"ATENCION!");
RDebugUtils.currentLine=35062667;
 //BA.debugLineNum = 35062667;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero3"), _msa);
this.state = 396;
return;
case 396:
//C
this.state = 364;
;
RDebugUtils.currentLine=35062668;
 //BA.debugLineNum = 35062668;BA.debugLine="CSVErroresSubidoOKFTP=True";
_csverroressubidookftp = parent.__c.True;
RDebugUtils.currentLine=35062671;
 //BA.debugLineNum = 35062671;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
 if (true) break;

case 364:
//C
this.state = 365;
;
 if (true) break;

case 365:
//C
this.state = 366;
;
 if (true) break;

case 366:
//C
this.state = 367;
;
RDebugUtils.currentLine=35062678;
 //BA.debugLineNum = 35062678;BA.debugLine="Dim NumLineasSinError As Int=mSQL.ExecQuerySingle";
_numlineassinerror = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(("select count(*) from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0)}))));
RDebugUtils.currentLine=35062679;
 //BA.debugLineNum = 35062679;BA.debugLine="Dim CSVsFicherosPedidosOK As Boolean=True";
_csvsficherospedidosok = parent.__c.True;
RDebugUtils.currentLine=35062680;
 //BA.debugLineNum = 35062680;BA.debugLine="Dim NumPedidosIncluidosEnFichero As Int";
_numpedidosincluidosenfichero = 0;
RDebugUtils.currentLine=35062681;
 //BA.debugLineNum = 35062681;BA.debugLine="Dim NumFicherosPedidosCSVCreadosEnServidor As Int";
_numficherospedidoscsvcreadosenservidor = 0;
RDebugUtils.currentLine=35062683;
 //BA.debugLineNum = 35062683;BA.debugLine="If NumLineasSinError>0 Then";
if (true) break;

case 367:
//if
this.state = 388;
if (_numlineassinerror>0) { 
this.state = 369;
}if (true) break;

case 369:
//C
this.state = 370;
RDebugUtils.currentLine=35062685;
 //BA.debugLineNum = 35062685;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
_lstheaders = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Docuware ID","Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen","FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio"});
RDebugUtils.currentLine=35062688;
 //BA.debugLineNum = 35062688;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\";
_carpetaficherocsv = "\\\\192.168.10.6\\PendientesNAV";
RDebugUtils.currentLine=35062690;
 //BA.debugLineNum = 35062690;BA.debugLine="Dim rsCabeceraPedidosLineasSinError As ResultSet";
_rscabecerapedidoslineassinerror = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rscabecerapedidoslineassinerror = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("select distinct CodigoClienteERP, CodigoDireccionEnvioERP, Sede, CodigoPedido, FechaPedido\n"+"			 from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0)}));
RDebugUtils.currentLine=35062692;
 //BA.debugLineNum = 35062692;BA.debugLine="Do While rsCabeceraPedidosLineasSinError.NextRow";
if (true) break;

case 370:
//do while
this.state = 387;
while (_rscabecerapedidoslineassinerror.NextRow()) {
this.state = 372;
if (true) break;
}
if (true) break;

case 372:
//C
this.state = 373;
RDebugUtils.currentLine=35062693;
 //BA.debugLineNum = 35062693;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUID";
_uuidpedido = parent._utilidades._generaruuidv4 /*String*/ ();
RDebugUtils.currentLine=35062694;
 //BA.debugLineNum = 35062694;BA.debugLine="Dim IDPedido As String=$\"REPSOL_${UUIDPedido}\"$";
_idpedido = ("REPSOL_"+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+"");
RDebugUtils.currentLine=35062695;
 //BA.debugLineNum = 35062695;BA.debugLine="Dim NombreFicheroCSV As String=$\"${IDPedido}.cs";
_nombreficherocsv = (""+parent.__c.SmartStringFormatter("",(Object)(_idpedido))+".csv");
RDebugUtils.currentLine=35062696;
 //BA.debugLineNum = 35062696;BA.debugLine="Dim lstLineasPedidoVenta As List";
_lstlineaspedidoventa = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35062697;
 //BA.debugLineNum = 35062697;BA.debugLine="lstLineasPedidoVenta.Initialize";
_lstlineaspedidoventa.Initialize();
RDebugUtils.currentLine=35062698;
 //BA.debugLineNum = 35062698;BA.debugLine="Dim CodigoClienteNAV As String=rsCabeceraPedido";
_codigoclientenav = _rscabecerapedidoslineassinerror.GetString("CodigoClienteERP");
RDebugUtils.currentLine=35062699;
 //BA.debugLineNum = 35062699;BA.debugLine="Dim CodigoDireccionEnvioNAV As String=rsCabecer";
_codigodireccionenvionav = _rscabecerapedidoslineassinerror.GetString("CodigoDireccionEnvioERP");
RDebugUtils.currentLine=35062700;
 //BA.debugLineNum = 35062700;BA.debugLine="Dim Sede As String=rsCabeceraPedidosLineasSinEr";
_sede = _rscabecerapedidoslineassinerror.GetString("Sede");
RDebugUtils.currentLine=35062701;
 //BA.debugLineNum = 35062701;BA.debugLine="Dim CodigoPedido As String=rsCabeceraPedidosLin";
_codigopedido = _rscabecerapedidoslineassinerror.GetString("CodigoPedido");
RDebugUtils.currentLine=35062702;
 //BA.debugLineNum = 35062702;BA.debugLine="Dim DocumentoExterno As String=Sede & CodigoPed";
_documentoexterno = _sede+_codigopedido;
RDebugUtils.currentLine=35062703;
 //BA.debugLineNum = 35062703;BA.debugLine="Dim FechaPedidoCliente As String=rsCabeceraPedi";
_fechapedidocliente = _rscabecerapedidoslineassinerror.GetString("FechaPedido");
RDebugUtils.currentLine=35062704;
 //BA.debugLineNum = 35062704;BA.debugLine="Dim FechaPedidoClienteNAV As String=FechaPedido";
_fechapedidoclientenav = _fechapedidocliente.replace("-","/");
RDebugUtils.currentLine=35062710;
 //BA.debugLineNum = 35062710;BA.debugLine="Dim rsLineasPedido As ResultSet=mSQL.ExecQuery2(";
_rslineaspedido = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rslineaspedido = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select CodigoProductoERP, TallaERP, sum(Cantidad) as TotalCantidad\n"+"			from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=? And CodigoClienteERP=? and CodigoDireccionEnvioERP=? and CodigoPedido=? and FechaPedido=?\n"+"			group by CodigoProductoERP,TallaERP"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0),_codigoclientenav,_codigodireccionenvionav,_codigopedido,_fechapedidocliente}));
RDebugUtils.currentLine=35062715;
 //BA.debugLineNum = 35062715;BA.debugLine="Do While rsLineasPedido.NextRow";
if (true) break;

case 373:
//do while
this.state = 376;
while (_rslineaspedido.NextRow()) {
this.state = 375;
if (true) break;
}
if (true) break;

case 375:
//C
this.state = 373;
RDebugUtils.currentLine=35062717;
 //BA.debugLineNum = 35062717;BA.debugLine="Dim Precio As Double=Utilidades.FixNullDouble(";
_precio = parent._utilidades._fixnulldouble /*double*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select PrecioUnitario from tblRepsolTarifaVentaGRP07506 where Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_rslineaspedido.GetString("CodigoProductoERP")}))));
RDebugUtils.currentLine=35062719;
 //BA.debugLineNum = 35062719;BA.debugLine="Dim ArrDatosLineaPedido(12) As String";
_arrdatoslineapedido = new String[(int) (12)];
java.util.Arrays.fill(_arrdatoslineapedido,"");
RDebugUtils.currentLine=35062720;
 //BA.debugLineNum = 35062720;BA.debugLine="ArrDatosLineaPedido(0)=$\"${UUIDPedido}\"$";
_arrdatoslineapedido[(int) (0)] = (""+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+"");
RDebugUtils.currentLine=35062722;
 //BA.debugLineNum = 35062722;BA.debugLine="ArrDatosLineaPedido(1)=\"PROIN\\SUSANA.DIEZ\"   '";
_arrdatoslineapedido[(int) (1)] = "PROIN\\SUSANA.DIEZ";
RDebugUtils.currentLine=35062723;
 //BA.debugLineNum = 35062723;BA.debugLine="ArrDatosLineaPedido(2)=CodigoClienteNAV";
_arrdatoslineapedido[(int) (2)] = _codigoclientenav;
RDebugUtils.currentLine=35062724;
 //BA.debugLineNum = 35062724;BA.debugLine="ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV";
_arrdatoslineapedido[(int) (3)] = _codigodireccionenvionav;
RDebugUtils.currentLine=35062725;
 //BA.debugLineNum = 35062725;BA.debugLine="ArrDatosLineaPedido(4)=DocumentoExterno";
_arrdatoslineapedido[(int) (4)] = _documentoexterno;
RDebugUtils.currentLine=35062726;
 //BA.debugLineNum = 35062726;BA.debugLine="ArrDatosLineaPedido(5)=\"0299\"";
_arrdatoslineapedido[(int) (5)] = "0299";
RDebugUtils.currentLine=35062727;
 //BA.debugLineNum = 35062727;BA.debugLine="ArrDatosLineaPedido(6)=FechaPedidoClienteNAV";
_arrdatoslineapedido[(int) (6)] = _fechapedidoclientenav;
RDebugUtils.currentLine=35062728;
 //BA.debugLineNum = 35062728;BA.debugLine="ArrDatosLineaPedido(7)=rsLineasPedido.GetStrin";
_arrdatoslineapedido[(int) (7)] = _rslineaspedido.GetString("CodigoProductoERP");
RDebugUtils.currentLine=35062729;
 //BA.debugLineNum = 35062729;BA.debugLine="ArrDatosLineaPedido(8)=\"\"";
_arrdatoslineapedido[(int) (8)] = "";
RDebugUtils.currentLine=35062730;
 //BA.debugLineNum = 35062730;BA.debugLine="ArrDatosLineaPedido(9)=rsLineasPedido.GetStrin";
_arrdatoslineapedido[(int) (9)] = _rslineaspedido.GetString("TallaERP");
RDebugUtils.currentLine=35062731;
 //BA.debugLineNum = 35062731;BA.debugLine="ArrDatosLineaPedido(10)=rsLineasPedido.GetInt(";
_arrdatoslineapedido[(int) (10)] = BA.NumberToString(_rslineaspedido.GetInt("TotalCantidad"));
RDebugUtils.currentLine=35062732;
 //BA.debugLineNum = 35062732;BA.debugLine="ArrDatosLineaPedido(11)=Precio";
_arrdatoslineapedido[(int) (11)] = BA.NumberToString(_precio);
RDebugUtils.currentLine=35062734;
 //BA.debugLineNum = 35062734;BA.debugLine="lstLineasPedidoVenta.Add(ArrDatosLineaPedido)";
_lstlineaspedidoventa.Add((Object)(_arrdatoslineapedido));
 if (true) break;

case 376:
//C
this.state = 377;
;
RDebugUtils.currentLine=35062738;
 //BA.debugLineNum = 35062738;BA.debugLine="rsLineasPedido.Close";
_rslineaspedido.Close();
RDebugUtils.currentLine=35062742;
 //BA.debugLineNum = 35062742;BA.debugLine="If lstLineasPedidoVenta.Size>0 Then";
if (true) break;

case 377:
//if
this.state = 386;
if (_lstlineaspedidoventa.getSize()>0) { 
this.state = 379;
}if (true) break;

case 379:
//C
this.state = 380;
RDebugUtils.currentLine=35062743;
 //BA.debugLineNum = 35062743;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=35062744;
 //BA.debugLineNum = 35062744;BA.debugLine="Try";
if (true) break;

case 380:
//try
this.state = 385;
this.catchState = 384;
this.state = 382;
if (true) break;

case 382:
//C
this.state = 385;
this.catchState = 384;
RDebugUtils.currentLine=35062745;
 //BA.debugLineNum = 35062745;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCS";
_su.SaveCSV2(_carpetaficherocsv,_nombreficherocsv,BA.ObjectToChar(";"),_lstlineaspedidoventa,_lstheaders);
RDebugUtils.currentLine=35062746;
 //BA.debugLineNum = 35062746;BA.debugLine="NumFicherosPedidosCSVCreadosEnServidor=NumFic";
_numficherospedidoscsvcreadosenservidor = (int) (_numficherospedidoscsvcreadosenservidor+1);
 if (true) break;

case 384:
//C
this.state = 385;
this.catchState = 0;
RDebugUtils.currentLine=35062761;
 //BA.debugLineNum = 35062761;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835062761",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=35062762;
 //BA.debugLineNum = 35062762;BA.debugLine="CSVsFicherosPedidosOK=False";
_csvsficherospedidosok = parent.__c.False;
 if (true) break;
if (true) break;

case 385:
//C
this.state = 386;
this.catchState = 0;
;
RDebugUtils.currentLine=35062768;
 //BA.debugLineNum = 35062768;BA.debugLine="NumPedidosIncluidosEnFichero=NumPedidosIncluid";
_numpedidosincluidosenfichero = (int) (_numpedidosincluidosenfichero+1);
 if (true) break;

case 386:
//C
this.state = 370;
;
 if (true) break;

case 387:
//C
this.state = 388;
;
RDebugUtils.currentLine=35062772;
 //BA.debugLineNum = 35062772;BA.debugLine="rsCabeceraPedidosLineasSinError.close";
_rscabecerapedidoslineassinerror.Close();
 if (true) break;

case 388:
//C
this.state = -1;
;
RDebugUtils.currentLine=35062776;
 //BA.debugLineNum = 35062776;BA.debugLine="jamLoadingIndicator1.DetenerControlTiempoProceso";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._detenercontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=35062777;
 //BA.debugLineNum = 35062777;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35062779;
 //BA.debugLineNum = 35062779;BA.debugLine="Dim BodyEmailInfoProceso As String=$\" 		<b>Número";
_bodyemailinfoproceso = ("\n"+"		<b>Número de errores: </b> "+parent.__c.SmartStringFormatter("",((_numlineasconerror==0) ? ((Object)("OK, SIN ERRORES")) : ((Object)(_numlineasconerror))))+"\n"+"		<b>CSV Errores subido a FTP REPSOL: </b> "+parent.__c.SmartStringFormatter("",((_numlineasconerror==0) ? ((Object)("No necesario")) : (((_csverroressubidookftp) ? ((Object)("SI, OK")) : ((Object)("NO, ERROR"))))))+"\n"+"		<b>Número de Pedidos incluidos en Fichero Pedido Repsol ("+parent.__c.SmartStringFormatter("",(Object)(_nombreficheroorigen))+") : </b> "+parent.__c.SmartStringFormatter("",((_numpedidosincluidosenfichero==0) ? ((Object)("FICHERO SIN PEDIDOS, OK")) : ((Object)(_numpedidosincluidosenfichero))))+"\n"+"		<b>Proceso generación Ficheros CSV de pedidos de venta: </b> "+parent.__c.SmartStringFormatter("",((_numpedidosincluidosenfichero==0) ? ((Object)("No necesario")) : (((_csvsficherospedidosok) ? ((Object)("OK")) : ((Object)("ATENCION, PROCESO CON ERRORES"))))))+"\n"+"		<b>Número de Ficheros CSV creados en nuestro Servidor : </b> "+parent.__c.SmartStringFormatter("",((_numpedidosincluidosenfichero==0) ? ((Object)("SIN PEDIDOS PARA GENERAR CSVs")) : ((Object)(_numficherospedidoscsvcreadosenservidor))))+"\n"+"		");
RDebugUtils.currentLine=35062787;
 //BA.debugLineNum = 35062787;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=35062788;
 //BA.debugLineNum = 35062788;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=35062789;
 //BA.debugLineNum = 35062789;BA.debugLine="Wait For(EnviarEmailAviso(False,$\"Información Pro";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero3"), __ref._enviaremailaviso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.False,("Información Proceso Pedidos OnLine Repsol "+parent.__c.SmartStringFormatter("datetime",(Object)(parent.__c.DateTime.getNow()))+""),_bodyemailinfoproceso));
this.state = 397;
return;
case 397:
//C
this.state = -1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=35062791;
 //BA.debugLineNum = 35062791;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=35062977;
 //BA.debugLineNum = 35062977;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=35062978;
 //BA.debugLineNum = 35062978;BA.debugLine="End Sub";
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
public String  _btnprocesocompleto_click(b4j.docU.crepsol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "btnprocesocompleto_click", false))
	 {return ((String) Debug.delegate(ba, "btnprocesocompleto_click", null));}
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Private Sub btnProcesoCompleto_Click";
RDebugUtils.currentLine=35454982;
 //BA.debugLineNum = 35454982;BA.debugLine="ProcesoCompleto";
__ref._procesocompleto /*void*/ (null);
RDebugUtils.currentLine=35454986;
 //BA.debugLineNum = 35454986;BA.debugLine="End Sub";
return "";
}
public void  _procesocompleto(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "procesocompleto", false))
	 {Debug.delegate(ba, "procesocompleto", null); return;}
ResumableSub_ProcesoCompleto rsub = new ResumableSub_ProcesoCompleto(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ProcesoCompleto extends BA.ResumableSub {
public ResumableSub_ProcesoCompleto(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _dateformatant = "";
String _diaactual = "";
long _fechahorainicioproceso = 0L;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
String _error = "";
String _sresp = "";
long _ultimodiaprocesado = 0L;
long _t = 0L;
long _dift = 0L;
b4j.docU.main._tiporespuestajrdc _respjrdc = null;
long _fechahorainicializaciondatos = 0L;
String _nombreficheropedido = "";
String _rutaftpficheropedido = "";
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="Dim DiaActual As String=DateTime.Date(DateTime.No";
_diaactual = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="Dim FechaHoraInicioProceso As Long=DateTime.now";
_fechahorainicioproceso = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=35717128;
 //BA.debugLineNum = 35717128;BA.debugLine="Wait For(CargaRepsolUltimoDiaProcesadoDatosPedido";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._cargarepsolultimodiaprocesadodatospedidosonline /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=35717131;
 //BA.debugLineNum = 35717131;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
_error = BA.ObjectToString(_mres.Get((Object)("Error")));
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR Carga Reps";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._enviaremailaviso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.True,"ERROR Carga Repsol Ultimo Dia ProcesadoDatos Pedidos OnLine EESS",_error));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=35717136;
 //BA.debugLineNum = 35717136;BA.debugLine="Dim UltimoDiaProcesado As Long=mRes.Get(\"UltimoDi";
_ultimodiaprocesado = BA.ObjectToLongNumber(_mres.Get((Object)("UltimoDiaPedidosOnlineProcesado")));
RDebugUtils.currentLine=35717138;
 //BA.debugLineNum = 35717138;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,UltimoDiaProc";
if (true) break;

case 5:
//if
this.state = 8;
if (parent._dateutils._issameday(parent.__c.DateTime.getNow(),_ultimodiaprocesado)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=35717140;
 //BA.debugLineNum = 35717140;BA.debugLine="Dim t As Long = Utilidades.FindNextTime(Array As";
_t = parent._utilidades._findnexttime /*long*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new double[]{6}));
RDebugUtils.currentLine=35717141;
 //BA.debugLineNum = 35717141;BA.debugLine="Log($\"Próxima ejecución proceso REPSOL Pedidos O";
parent.__c.LogImpl("835717141",("Próxima ejecución proceso REPSOL Pedidos Online EESS: "+parent.__c.SmartStringFormatter("datetime",(Object)(_t))+""),0);
RDebugUtils.currentLine=35717143;
 //BA.debugLineNum = 35717143;BA.debugLine="Dim DifT As Long=t-DateTime.Now";
_dift = (long) (_t-parent.__c.DateTime.getNow());
RDebugUtils.currentLine=35717146;
 //BA.debugLineNum = 35717146;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=35717149;
 //BA.debugLineNum = 35717149;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=35717152;
 //BA.debugLineNum = 35717152;BA.debugLine="Wait For(InicializacionDatos) complete (respJRDC";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._inicializaciondatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 37;
return;
case 37:
//C
this.state = 9;
_respjrdc = (b4j.docU.main._tiporespuestajrdc) result[1];
;
RDebugUtils.currentLine=35717153;
 //BA.debugLineNum = 35717153;BA.debugLine="Dim FechaHoraInicializacionDatos As Long=DateTime";
_fechahorainicializaciondatos = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=35717154;
 //BA.debugLineNum = 35717154;BA.debugLine="If respJRDC.Accion=\"NOK\" Then";
if (true) break;

case 9:
//if
this.state = 14;
if ((_respjrdc.Accion /*String*/ ).equals("NOK")) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=35717155;
 //BA.debugLineNum = 35717155;BA.debugLine="Dim Error As String=respJRDC.Error";
_error = _respjrdc.Error /*String*/ ;
RDebugUtils.currentLine=35717156;
 //BA.debugLineNum = 35717156;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR inicializa";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._enviaremailaviso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.True,"ERROR inicializacion datos Proceso Pedidos OnLine REPSOL EESS",_error));
this.state = 38;
return;
case 38:
//C
this.state = 14;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=35717158;
 //BA.debugLineNum = 35717158;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=35717163;
 //BA.debugLineNum = 35717163;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=35717164;
 //BA.debugLineNum = 35717164;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=35717168;
 //BA.debugLineNum = 35717168;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=35717178;
 //BA.debugLineNum = 35717178;BA.debugLine="Wait For(BuscarUltimoFicheroPedidoEnFTP) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._buscarultimoficheropedidoenftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 39;
return;
case 39:
//C
this.state = 15;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=35717179;
 //BA.debugLineNum = 35717179;BA.debugLine="If sResp.StartsWith(\"Error\") Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_sresp.startsWith("Error")) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=35717183;
 //BA.debugLineNum = 35717183;BA.debugLine="Dim Error As String=sResp";
_error = _sresp;
RDebugUtils.currentLine=35717184;
 //BA.debugLineNum = 35717184;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR buscar ult";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._enviaremailaviso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.True,"ERROR buscar ultimo fichero FTP Proceso Pedidos OnLine REPSOL EESS",_error));
this.state = 40;
return;
case 40:
//C
this.state = 18;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=35717186;
 //BA.debugLineNum = 35717186;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=35717196;
 //BA.debugLineNum = 35717196;BA.debugLine="Dim NombreFicheroPedido As String=sResp";
_nombreficheropedido = _sresp;
RDebugUtils.currentLine=35717198;
 //BA.debugLineNum = 35717198;BA.debugLine="If NombreFicheroPedido=\"\" Then 'NO HAY FICHERO";
if (true) break;

case 19:
//if
this.state = 22;
if ((_nombreficheropedido).equals("")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=35717199;
 //BA.debugLineNum = 35717199;BA.debugLine="Dim Error As String=sResp";
_error = _sresp;
RDebugUtils.currentLine=35717200;
 //BA.debugLineNum = 35717200;BA.debugLine="Wait For(EnviarEmailAviso(True,\"ERROR: No hay fi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._enviaremailaviso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.True,"ERROR: No hay fichero pedidos en FTP OUTBOX, Proceso Pedidos OnLine REPSOL EESS",_error));
this.state = 41;
return;
case 41:
//C
this.state = 22;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=35717202;
 //BA.debugLineNum = 35717202;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=35717205;
 //BA.debugLineNum = 35717205;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";

case 22:
//if
this.state = 25;
if (parent.__c.File.Exists(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreficheropedido)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=35717208;
 //BA.debugLineNum = 35717208;BA.debugLine="Log(\"segsdfg\")";
parent.__c.LogImpl("835717208","segsdfg",0);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=35717211;
 //BA.debugLineNum = 35717211;BA.debugLine="Dim RutaFTPFicheroPedido As String=FilesFoldersFt";
_rutaftpficheropedido = __ref._filesfoldersftprepsol /*String*/ +"/"+_nombreficheropedido;
RDebugUtils.currentLine=35717214;
 //BA.debugLineNum = 35717214;BA.debugLine="Wait For(DescargarFicheroDesdeCarpetaFTP(RutaFTPF";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), __ref._descargarficherodesdecarpetaftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_rutaftpficheropedido,__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreficheropedido));
this.state = 42;
return;
case 42:
//C
this.state = 26;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=35717216;
 //BA.debugLineNum = 35717216;BA.debugLine="If Not(Success) Then";
if (true) break;

case 26:
//if
this.state = 31;
if (parent.__c.Not(_success)) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=35717221;
 //BA.debugLineNum = 35717221;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=35717223;
 //BA.debugLineNum = 35717223;BA.debugLine="DirFicheroProcesar=CarpetaDestinoFicherosDescarg";
__ref._dirficheroprocesar /*String*/  = __ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ;
RDebugUtils.currentLine=35717224;
 //BA.debugLineNum = 35717224;BA.debugLine="NombreFicheroProcesar=NombreFicheroPedido";
__ref._nombreficheroprocesar /*String*/  = _nombreficheropedido;
 if (true) break;
;
RDebugUtils.currentLine=35717234;
 //BA.debugLineNum = 35717234;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";

case 31:
//if
this.state = 34;
if (parent.__c.File.Exists(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreficheropedido)==parent.__c.False) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=35717235;
 //BA.debugLineNum = 35717235;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El fichero $";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheropedido))+" descargado a carpeta destino Repsol "+parent.__c.SmartStringFormatter("",(Object)(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ))+" NO se encuentra en esa carpeta."),"ERROR");
RDebugUtils.currentLine=35717236;
 //BA.debugLineNum = 35717236;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesocompleto"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 34;
;
RDebugUtils.currentLine=35717237;
 //BA.debugLineNum = 35717237;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35717238;
 //BA.debugLineNum = 35717238;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=35717248;
 //BA.debugLineNum = 35717248;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.crepsol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.crepsol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="End Sub";
return "";
}
public void  _btnselficheroftp_click(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "btnselficheroftp_click", false))
	 {Debug.delegate(ba, "btnselficheroftp_click", null); return;}
ResumableSub_btnSelFicheroFTP_Click rsub = new ResumableSub_btnSelFicheroFTP_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFicheroFTP_Click extends BA.ResumableSub {
public ResumableSub_btnSelFicheroFTP_Click(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _sresp = "";
Object _msa = null;
String _nombreficheropedido = "";
String _rutaftpficheropedido = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="txtFicheroSeleccionado.Text=\"\"";
__ref._txtficheroseleccionado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="DirFicheroProcesar=\"\"";
__ref._dirficheroprocesar /*String*/  = "";
RDebugUtils.currentLine=34471939;
 //BA.debugLineNum = 34471939;BA.debugLine="NombreFicheroProcesar=\"\"";
__ref._nombreficheroprocesar /*String*/  = "";
RDebugUtils.currentLine=34471960;
 //BA.debugLineNum = 34471960;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Buscando Fic";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Buscando Fichero Pedido en carpeta FTP..."));
RDebugUtils.currentLine=34471961;
 //BA.debugLineNum = 34471961;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=34471962;
 //BA.debugLineNum = 34471962;BA.debugLine="Wait For(BuscarUltimoFicheroPedidoEnFTP) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficheroftp_click"), __ref._buscarultimoficheropedidoenftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=34471963;
 //BA.debugLineNum = 34471963;BA.debugLine="If sResp.StartsWith(\"Error\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("Error")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=34471964;
 //BA.debugLineNum = 34471964;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34471965;
 //BA.debugLineNum = 34471965;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sResp.Replace(";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sresp.replace("Error,",""),"Error");
RDebugUtils.currentLine=34471966;
 //BA.debugLineNum = 34471966;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 4;
;
RDebugUtils.currentLine=34471967;
 //BA.debugLineNum = 34471967;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=34471970;
 //BA.debugLineNum = 34471970;BA.debugLine="If sResp.StartsWith(\"Aviso\") Then";

case 4:
//if
this.state = 7;
if (_sresp.startsWith("Aviso")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=34471971;
 //BA.debugLineNum = 34471971;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34471972;
 //BA.debugLineNum = 34471972;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sResp.Replace(";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sresp.replace("Aviso,",""),"Aviso");
RDebugUtils.currentLine=34471973;
 //BA.debugLineNum = 34471973;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 7;
;
RDebugUtils.currentLine=34471974;
 //BA.debugLineNum = 34471974;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=34471977;
 //BA.debugLineNum = 34471977;BA.debugLine="Dim NombreFicheroPedido As String=sResp";
_nombreficheropedido = _sresp;
RDebugUtils.currentLine=34471979;
 //BA.debugLineNum = 34471979;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
if (true) break;

case 8:
//if
this.state = 11;
if (parent.__c.File.Exists(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreficheropedido)) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=34471982;
 //BA.debugLineNum = 34471982;BA.debugLine="Log(\"segsdfg\")";
parent.__c.LogImpl("834471982","segsdfg",0);
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=34471985;
 //BA.debugLineNum = 34471985;BA.debugLine="Dim RutaFTPFicheroPedido As String=FilesFoldersFt";
_rutaftpficheropedido = __ref._filesfoldersftprepsol /*String*/ +"/"+_nombreficheropedido;
RDebugUtils.currentLine=34471987;
 //BA.debugLineNum = 34471987;BA.debugLine="jamLoadingIndicator1.MensajeLoading=$\"Descargando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Descargando Fichero Pedido "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheropedido))+" desde carpeta FTP...")));
RDebugUtils.currentLine=34471988;
 //BA.debugLineNum = 34471988;BA.debugLine="jamLoadingIndicator1.IniciarControlTiempoProceso";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._iniciarcontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=34471989;
 //BA.debugLineNum = 34471989;BA.debugLine="Wait For(DescargarFicheroDesdeCarpetaFTP(RutaFTPF";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficheroftp_click"), __ref._descargarficherodesdecarpetaftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_rutaftpficheropedido,__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreficheropedido));
this.state = 24;
return;
case 24:
//C
this.state = 12;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=34471990;
 //BA.debugLineNum = 34471990;BA.debugLine="jamLoadingIndicator1.DetenerControlTiempoProceso";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._detenercontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=34471991;
 //BA.debugLineNum = 34471991;BA.debugLine="If Not(Success) Then";
if (true) break;

case 12:
//if
this.state = 17;
if (parent.__c.Not(_success)) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=34471993;
 //BA.debugLineNum = 34471993;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido un";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Ha habido un error en la descarga del fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheropedido))+""),"ATENCION!");
RDebugUtils.currentLine=34471994;
 //BA.debugLineNum = 34471994;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 17;
;
RDebugUtils.currentLine=34471995;
 //BA.debugLineNum = 34471995;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34471996;
 //BA.debugLineNum = 34471996;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=34471998;
 //BA.debugLineNum = 34471998;BA.debugLine="DirFicheroProcesar=CarpetaDestinoFicherosDescarg";
__ref._dirficheroprocesar /*String*/  = __ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ;
RDebugUtils.currentLine=34471999;
 //BA.debugLineNum = 34471999;BA.debugLine="NombreFicheroProcesar=NombreFicheroPedido";
__ref._nombreficheroprocesar /*String*/  = _nombreficheropedido;
RDebugUtils.currentLine=34472000;
 //BA.debugLineNum = 34472000;BA.debugLine="txtFicheroSeleccionado.Text=File.Combine(Carpeta";
__ref._txtficheroseleccionado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.File.Combine(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,__ref._nombreficheroprocesar /*String*/ ));
RDebugUtils.currentLine=34472002;
 //BA.debugLineNum = 34472002;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Fichero ${No";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheropedido))+" descargado a carpeta destino Repsol "+parent.__c.SmartStringFormatter("",(Object)(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ))+""),"Aviso");
RDebugUtils.currentLine=34472003;
 //BA.debugLineNum = 34472003;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 17;
;
 if (true) break;
;
RDebugUtils.currentLine=34472010;
 //BA.debugLineNum = 34472010;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";

case 17:
//if
this.state = 20;
if (parent.__c.File.Exists(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreficheropedido)==parent.__c.False) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=34472011;
 //BA.debugLineNum = 34472011;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El fichero $";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheropedido))+" descargado a carpeta destino Repsol "+parent.__c.SmartStringFormatter("",(Object)(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ))+" NO se encuentra en esa carpeta."),"ERROR");
RDebugUtils.currentLine=34472012;
 //BA.debugLineNum = 34472012;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficheroftp_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 20;
;
RDebugUtils.currentLine=34472013;
 //BA.debugLineNum = 34472013;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34472014;
 //BA.debugLineNum = 34472014;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=34472026;
 //BA.debugLineNum = 34472026;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34472027;
 //BA.debugLineNum = 34472027;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscarultimoficheropedidoenftp(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "buscarultimoficheropedidoenftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "buscarultimoficheropedidoenftp", null));}
ResumableSub_BuscarUltimoFicheroPedidoEnFTP rsub = new ResumableSub_BuscarUltimoFicheroPedidoEnFTP(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuscarUltimoFicheroPedidoEnFTP extends BA.ResumableSub {
public ResumableSub_BuscarUltimoFicheroPedidoEnFTP(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _folders = null;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _files = null;
int _i = 0;
String _nombreultimoficheropedido = "";
long _fechalongultimofichero = 0L;
int step10;
int limit10;
int step16;
int limit16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="sFtpRepsol.List(FilesFoldersFtpRepsol)";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .List(ba,__ref._filesfoldersftprepsol /*String*/ );
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="Wait For sFtpRepsol_ListCompleted (ServerPath As";
parent.__c.WaitFor("sftprepsol_listcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "buscarultimoficheropedidoenftp"), null);
this.state = 32;
return;
case 32:
//C
this.state = 1;
_serverpath = (String) result[1];
_success = (boolean) result[2];
_folders = (anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[]) result[3];
_files = (anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[]) result[4];
;
RDebugUtils.currentLine=33619974;
 //BA.debugLineNum = 33619974;BA.debugLine="If Success = False Then";
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
RDebugUtils.currentLine=33619975;
 //BA.debugLineNum = 33619975;BA.debugLine="Log(LastException.Message)";
parent.__c.LogImpl("833619975",parent.__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=33619977;
 //BA.debugLineNum = 33619977;BA.debugLine="Return \"Error listando carpeta FTP.\" & CRLF & CR";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error listando carpeta FTP."+parent.__c.CRLF+parent.__c.CRLF+parent.__c.LastException(ba).getMessage()));return;};
 if (true) break;
;
RDebugUtils.currentLine=33619980;
 //BA.debugLineNum = 33619980;BA.debugLine="If Files.Length=0 Then";

case 4:
//if
this.state = 7;
if (_files.length==0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=33619982;
 //BA.debugLineNum = 33619982;BA.debugLine="Return \"Aviso, Carpeta FTP sin ficheros\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Aviso, Carpeta FTP sin ficheros"));return;};
 if (true) break;
;
RDebugUtils.currentLine=33619985;
 //BA.debugLineNum = 33619985;BA.debugLine="For i = 0 To Folders.Length - 1";

case 7:
//for
this.state = 10;
step10 = 1;
limit10 = (int) (_folders.length-1);
_i = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 10;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 9;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step10)) ;
if (true) break;

case 9:
//C
this.state = 34;
RDebugUtils.currentLine=33619986;
 //BA.debugLineNum = 33619986;BA.debugLine="Log(Folders(i).Name)";
parent.__c.LogImpl("833619986",_folders[_i].getName(),0);
RDebugUtils.currentLine=33619987;
 //BA.debugLineNum = 33619987;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
parent.__c.LogImpl("833619987",parent.__c.DateTime.Date(_folders[_i].getTimestamp()),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=33619990;
 //BA.debugLineNum = 33619990;BA.debugLine="Dim NombreUltimoFicheroPedido As String";
_nombreultimoficheropedido = "";
RDebugUtils.currentLine=33619991;
 //BA.debugLineNum = 33619991;BA.debugLine="Dim FechaLongUltimoFichero As Long";
_fechalongultimofichero = 0L;
RDebugUtils.currentLine=33619992;
 //BA.debugLineNum = 33619992;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 11:
//for
this.state = 22;
step16 = 1;
limit16 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 22;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 13;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=33619993;
 //BA.debugLineNum = 33619993;BA.debugLine="Log(Files(i).Name & \", \" & Files(i).Size & \", \"";
parent.__c.LogImpl("833619993",_files[_i].getName()+", "+BA.NumberToString(_files[_i].getSize())+", "+parent.__c.DateTime.Date(_files[_i].getTimestamp()),0);
RDebugUtils.currentLine=33619994;
 //BA.debugLineNum = 33619994;BA.debugLine="If Files(i).Name.StartsWith(\"PEDVESTUARIO\") Then";
if (true) break;

case 14:
//if
this.state = 21;
if (_files[_i].getName().startsWith("PEDVESTUARIO")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=33619995;
 //BA.debugLineNum = 33619995;BA.debugLine="If Files(i).Timestamp> FechaLongUltimoFichero T";
if (true) break;

case 17:
//if
this.state = 20;
if (_files[_i].getTimestamp()>_fechalongultimofichero) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=33619996;
 //BA.debugLineNum = 33619996;BA.debugLine="NombreUltimoFicheroPedido=Files(i).Name";
_nombreultimoficheropedido = _files[_i].getName();
RDebugUtils.currentLine=33619997;
 //BA.debugLineNum = 33619997;BA.debugLine="FechaLongUltimoFichero=Files(i).Timestamp";
_fechalongultimofichero = _files[_i].getTimestamp();
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 36;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=33620001;
 //BA.debugLineNum = 33620001;BA.debugLine="If NombreUltimoFicheroPedido=\"\" Then Return \"Avis";

case 22:
//if
this.state = 27;
if ((_nombreultimoficheropedido).equals("")) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Aviso, Carpeta FTP sin fichero de pedido."));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=33620003;
 //BA.debugLineNum = 33620003;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
if (true) break;

case 28:
//if
this.state = 31;
if (parent.__c.File.Exists(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreultimoficheropedido)) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=33620004;
 //BA.debugLineNum = 33620004;BA.debugLine="Return $\"Aviso, El fichero ${NombreUltimoFichero";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(("Aviso, El fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreultimoficheropedido))+" ha sido descargado anteriormente.")));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=33620012;
 //BA.debugLineNum = 33620012;BA.debugLine="Return NombreUltimoFicheroPedido";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_nombreultimoficheropedido));return;};
RDebugUtils.currentLine=33620014;
 //BA.debugLineNum = 33620014;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _descargarficherodesdecarpetaftp(b4j.docU.crepsol __ref,String _rutafichero,String _carpetadestino,String _nombreficherodestino) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "descargarficherodesdecarpetaftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "descargarficherodesdecarpetaftp", new Object[] {_rutafichero,_carpetadestino,_nombreficherodestino}));}
ResumableSub_DescargarFicheroDesdeCarpetaFTP rsub = new ResumableSub_DescargarFicheroDesdeCarpetaFTP(this,__ref,_rutafichero,_carpetadestino,_nombreficherodestino);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DescargarFicheroDesdeCarpetaFTP extends BA.ResumableSub {
public ResumableSub_DescargarFicheroDesdeCarpetaFTP(b4j.docU.crepsol parent,b4j.docU.crepsol __ref,String _rutafichero,String _carpetadestino,String _nombreficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._rutafichero = _rutafichero;
this._carpetadestino = _carpetadestino;
this._nombreficherodestino = _nombreficherodestino;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _rutafichero;
String _carpetadestino;
String _nombreficherodestino;
String _serverpath = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="sFtpRepsol.DownloadFile(RutaFichero, CarpetaDesti";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .DownloadFile(ba,_rutafichero,_carpetadestino,_nombreficherodestino);
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="Wait For sFtpRepsol_DownloadCompleted (ServerPath";
parent.__c.WaitFor("sftprepsol_downloadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "descargarficherodesdecarpetaftp"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_serverpath = (String) result[1];
_success = (boolean) result[2];
;
RDebugUtils.currentLine=33751049;
 //BA.debugLineNum = 33751049;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=33751050;
 //BA.debugLineNum = 33751050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselficherowindows_click(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "btnselficherowindows_click", false))
	 {Debug.delegate(ba, "btnselficherowindows_click", null); return;}
ResumableSub_btnSelFicheroWindows_Click rsub = new ResumableSub_btnSelFicheroWindows_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFicheroWindows_Click extends BA.ResumableSub {
public ResumableSub_btnSelFicheroWindows_Click(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _filename = "";
String _dirfichero = "";
String _nombrefichero = "";
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="txtFicheroSeleccionado.Text=\"\"";
__ref._txtficheroseleccionado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="Dim FileName As String=SeleccionFicheroCarpetaRed";
_filename = __ref._seleccionficherocarpetared /*String*/ (null);
RDebugUtils.currentLine=34537477;
 //BA.debugLineNum = 34537477;BA.debugLine="Dim DirFichero As String=File.GetFileParent(FileN";
_dirfichero = parent.__c.File.GetFileParent(_filename);
RDebugUtils.currentLine=34537478;
 //BA.debugLineNum = 34537478;BA.debugLine="Dim NombreFichero As String=File.GetName(FileName";
_nombrefichero = parent.__c.File.GetName(_filename);
RDebugUtils.currentLine=34537480;
 //BA.debugLineNum = 34537480;BA.debugLine="If NombreFichero=\"\" Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((_nombrefichero).equals("")) { 
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
RDebugUtils.currentLine=34537482;
 //BA.debugLineNum = 34537482;BA.debugLine="If DirFichero<>CarpetaDestinoFicherosDescargadosF";
if (true) break;

case 7:
//if
this.state = 26;
if ((_dirfichero).equals(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=34537483;
 //BA.debugLineNum = 34537483;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"Se copiar";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,("Se copiará el fichero seleccionado a la carpeta "+parent.__c.SmartStringFormatter("",(Object)(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ))+". ¿Continuar?"),"Confirma","Sí","Cancelar","",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=34537484;
 //BA.debugLineNum = 34537484;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficherowindows_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 10;
_rint = (int) result[1];
;
RDebugUtils.currentLine=34537485;
 //BA.debugLineNum = 34537485;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 10:
//if
this.state = 15;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=34537486;
 //BA.debugLineNum = 34537486;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargados";
if (true) break;

case 16:
//if
this.state = 25;
if (parent.__c.File.Exists(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombrefichero)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=34537487;
 //BA.debugLineNum = 34537487;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"El fiche";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,("El fichero "+parent.__c.SmartStringFormatter("",(Object)(parent.__c.File.Combine(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombrefichero)))+" ya existe.\n"+"¿Reemplazarlo por el fichero seleccionado?"),"Confirma","Sí","Cancelar","",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=34537489;
 //BA.debugLineNum = 34537489;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnselficherowindows_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 19;
_rint = (int) result[1];
;
RDebugUtils.currentLine=34537490;
 //BA.debugLineNum = 34537490;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 19:
//if
this.state = 24;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) return ;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=34537491;
 //BA.debugLineNum = 34537491;BA.debugLine="File.Delete(CarpetaDestinoFicherosDescargadosFT";
parent.__c.File.Delete(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombrefichero);
 if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=34537493;
 //BA.debugLineNum = 34537493;BA.debugLine="File.Copy(DirFichero,NombreFichero,CarpetaDestin";
parent.__c.File.Copy(_dirfichero,_nombrefichero,__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombrefichero);
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=34537496;
 //BA.debugLineNum = 34537496;BA.debugLine="DirFicheroProcesar=CarpetaDestinoFicherosDescarga";
__ref._dirficheroprocesar /*String*/  = __ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ;
RDebugUtils.currentLine=34537497;
 //BA.debugLineNum = 34537497;BA.debugLine="NombreFicheroProcesar=NombreFichero";
__ref._nombreficheroprocesar /*String*/  = _nombrefichero;
RDebugUtils.currentLine=34537498;
 //BA.debugLineNum = 34537498;BA.debugLine="txtFicheroSeleccionado.Text=File.Combine(CarpetaD";
__ref._txtficheroseleccionado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent.__c.File.Combine(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,__ref._nombreficheroprocesar /*String*/ ));
RDebugUtils.currentLine=34537501;
 //BA.debugLineNum = 34537501;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _seleccionficherocarpetared(b4j.docU.crepsol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "seleccionficherocarpetared", false))
	 {return ((String) Debug.delegate(ba, "seleccionficherocarpetared", null));}
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _filename = "";
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Sub SeleccionFicheroCarpetaRed As String";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="fc.Title=\"Selecciona Fichero\"";
_fc.setTitle("Selecciona Fichero");
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="fc.SetExtensionFilter(\"Ficheros texto\", Array As";
_fc.SetExtensionFilter("Ficheros texto",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.txt"}));
RDebugUtils.currentLine=34209799;
 //BA.debugLineNum = 34209799;BA.debugLine="fc.InitialDirectory=CarpetaDestinoFicherosDescarg";
_fc.setInitialDirectory(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ );
RDebugUtils.currentLine=34209800;
 //BA.debugLineNum = 34209800;BA.debugLine="Dim fileName As String = fc.ShowOpen(frm)";
_filename = _fc.ShowOpen(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=34209801;
 //BA.debugLineNum = 34209801;BA.debugLine="Return fileName";
if (true) return _filename;
RDebugUtils.currentLine=34209827;
 //BA.debugLineNum = 34209827;BA.debugLine="End Sub";
return "";
}
public void  _btnuploadfile_click(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "btnuploadfile_click", false))
	 {Debug.delegate(ba, "btnuploadfile_click", null); return;}
ResumableSub_btnUploadFile_Click rsub = new ResumableSub_btnUploadFile_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnUploadFile_Click extends BA.ResumableSub {
public ResumableSub_btnUploadFile_Click(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _filename = "";
String _rutaftpficheropedidoerrores = "";
String _serverpath = "";
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35323922;
 //BA.debugLineNum = 35323922;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=35323923;
 //BA.debugLineNum = 35323923;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=35323924;
 //BA.debugLineNum = 35323924;BA.debugLine="fc.Title=\"Selecciona Fichero\"";
_fc.setTitle("Selecciona Fichero");
RDebugUtils.currentLine=35323925;
 //BA.debugLineNum = 35323925;BA.debugLine="fc.SetExtensionFilter(\"Ficheros texto\", Array As";
_fc.SetExtensionFilter("Ficheros texto",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.csv"}));
RDebugUtils.currentLine=35323928;
 //BA.debugLineNum = 35323928;BA.debugLine="fc.InitialDirectory=CarpetaDestinoFicherosDescarg";
_fc.setInitialDirectory(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ );
RDebugUtils.currentLine=35323929;
 //BA.debugLineNum = 35323929;BA.debugLine="Dim fileName As String = fc.ShowOpen(frm)";
_filename = _fc.ShowOpen(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=35323931;
 //BA.debugLineNum = 35323931;BA.debugLine="If fileName=\"\" Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if ((_filename).equals("")) { 
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
RDebugUtils.currentLine=35323935;
 //BA.debugLineNum = 35323935;BA.debugLine="Dim RutaFTPFicheroPedidoErrores As String=ErrorFi";
_rutaftpficheropedidoerrores = __ref._errorfilesfoldersftprepsol /*String*/ +"/"+parent.__c.File.GetName(_filename);
RDebugUtils.currentLine=35323938;
 //BA.debugLineNum = 35323938;BA.debugLine="sFtpRepsol.UploadFile(File.GetFileParent(fileName";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .UploadFile(ba,parent.__c.File.GetFileParent(_filename),parent.__c.File.GetName(_filename),_rutaftpficheropedidoerrores);
RDebugUtils.currentLine=35323939;
 //BA.debugLineNum = 35323939;BA.debugLine="Wait For sFtpRepsol_UploadCompleted (ServerPath A";
parent.__c.WaitFor("sftprepsol_uploadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnuploadfile_click"), null);
this.state = 13;
return;
case 13:
//C
this.state = 7;
_serverpath = (String) result[1];
_success = (boolean) result[2];
;
RDebugUtils.currentLine=35323941;
 //BA.debugLineNum = 35323941;BA.debugLine="If Not(Success) Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.Not(_success)) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=35323942;
 //BA.debugLineNum = 35323942;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error subien";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Error subiendo fichero de errores de pedido "+parent.__c.SmartStringFormatter("",(Object)(parent.__c.File.GetName(_filename)))+"\n"+""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.LastException(ba).getMessage()))+""),"Error");
RDebugUtils.currentLine=35323944;
 //BA.debugLineNum = 35323944;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnuploadfile_click"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=35323946;
 //BA.debugLineNum = 35323946;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Fichero subi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Fichero subido a carpeta de destino "+parent.__c.SmartStringFormatter("",(Object)(parent.__c.File.GetName(_filename)))+""),"Aviso");
RDebugUtils.currentLine=35323947;
 //BA.debugLineNum = 35323947;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "btnuploadfile_click"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=35323952;
 //BA.debugLineNum = 35323952;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _buscarprimerficheropedidoenftp(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "buscarprimerficheropedidoenftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "buscarprimerficheropedidoenftp", null));}
ResumableSub_BuscarPrimerFicheroPedidoEnFTP rsub = new ResumableSub_BuscarPrimerFicheroPedidoEnFTP(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BuscarPrimerFicheroPedidoEnFTP extends BA.ResumableSub {
public ResumableSub_BuscarPrimerFicheroPedidoEnFTP(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _folders = null;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _files = null;
int _i = 0;
String _nombreprimerficheropedido = "";
long _fechalongprimerfichero = 0L;
int step10;
int limit10;
int step16;
int limit16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="sFtpRepsol.List(FilesFoldersFtpRepsol)";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .List(ba,__ref._filesfoldersftprepsol /*String*/ );
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="Wait For sFtpRepsol_ListCompleted (ServerPath As";
parent.__c.WaitFor("sftprepsol_listcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "buscarprimerficheropedidoenftp"), null);
this.state = 32;
return;
case 32:
//C
this.state = 1;
_serverpath = (String) result[1];
_success = (boolean) result[2];
_folders = (anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[]) result[3];
_files = (anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[]) result[4];
;
RDebugUtils.currentLine=33685510;
 //BA.debugLineNum = 33685510;BA.debugLine="If Success = False Then";
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
RDebugUtils.currentLine=33685511;
 //BA.debugLineNum = 33685511;BA.debugLine="Log(LastException.Message)";
parent.__c.LogImpl("833685511",parent.__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=33685513;
 //BA.debugLineNum = 33685513;BA.debugLine="Return \"Error listando carpeta FTP.\" & CRLF & CR";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error listando carpeta FTP."+parent.__c.CRLF+parent.__c.CRLF+parent.__c.LastException(ba).getMessage()));return;};
 if (true) break;
;
RDebugUtils.currentLine=33685516;
 //BA.debugLineNum = 33685516;BA.debugLine="If Files.Length=0 Then";

case 4:
//if
this.state = 7;
if (_files.length==0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=33685518;
 //BA.debugLineNum = 33685518;BA.debugLine="Return \"Aviso, Carpeta FTP sin ficheros\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Aviso, Carpeta FTP sin ficheros"));return;};
 if (true) break;
;
RDebugUtils.currentLine=33685521;
 //BA.debugLineNum = 33685521;BA.debugLine="For i = 0 To Folders.Length - 1";

case 7:
//for
this.state = 10;
step10 = 1;
limit10 = (int) (_folders.length-1);
_i = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 10;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 9;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step10)) ;
if (true) break;

case 9:
//C
this.state = 34;
RDebugUtils.currentLine=33685522;
 //BA.debugLineNum = 33685522;BA.debugLine="Log(Folders(i).Name)";
parent.__c.LogImpl("833685522",_folders[_i].getName(),0);
RDebugUtils.currentLine=33685523;
 //BA.debugLineNum = 33685523;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
parent.__c.LogImpl("833685523",parent.__c.DateTime.Date(_folders[_i].getTimestamp()),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=33685526;
 //BA.debugLineNum = 33685526;BA.debugLine="Dim NombrePrimerFicheroPedido As String";
_nombreprimerficheropedido = "";
RDebugUtils.currentLine=33685527;
 //BA.debugLineNum = 33685527;BA.debugLine="Dim FechaLongPrimerFichero As Long";
_fechalongprimerfichero = 0L;
RDebugUtils.currentLine=33685528;
 //BA.debugLineNum = 33685528;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 11:
//for
this.state = 22;
step16 = 1;
limit16 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 22;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 13;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=33685529;
 //BA.debugLineNum = 33685529;BA.debugLine="Log(Files(i).Name & \", \" & Files(i).Size & \", \"";
parent.__c.LogImpl("833685529",_files[_i].getName()+", "+BA.NumberToString(_files[_i].getSize())+", "+parent.__c.DateTime.Date(_files[_i].getTimestamp()),0);
RDebugUtils.currentLine=33685530;
 //BA.debugLineNum = 33685530;BA.debugLine="If Files(i).Name.StartsWith(\"PEDVESTUARIO\") Then";
if (true) break;

case 14:
//if
this.state = 21;
if (_files[_i].getName().startsWith("PEDVESTUARIO")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=33685531;
 //BA.debugLineNum = 33685531;BA.debugLine="If Files(i).Timestamp<= FechaLongPrimerFichero";
if (true) break;

case 17:
//if
this.state = 20;
if (_files[_i].getTimestamp()<=_fechalongprimerfichero) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=33685532;
 //BA.debugLineNum = 33685532;BA.debugLine="NombrePrimerFicheroPedido=Files(i).Name";
_nombreprimerficheropedido = _files[_i].getName();
RDebugUtils.currentLine=33685533;
 //BA.debugLineNum = 33685533;BA.debugLine="FechaLongPrimerFichero=Files(i).Timestamp";
_fechalongprimerfichero = _files[_i].getTimestamp();
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 36;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=33685537;
 //BA.debugLineNum = 33685537;BA.debugLine="If NombrePrimerFicheroPedido=\"\" Then Return \"Avis";

case 22:
//if
this.state = 27;
if ((_nombreprimerficheropedido).equals("")) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Aviso, Carpeta FTP sin fichero de pedido."));return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=33685539;
 //BA.debugLineNum = 33685539;BA.debugLine="If File.Exists(CarpetaDestinoFicherosDescargadosF";
if (true) break;

case 28:
//if
this.state = 31;
if (parent.__c.File.Exists(__ref._carpetadestinoficherosdescargadosftppedidosrepsol /*String*/ ,_nombreprimerficheropedido)) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=33685540;
 //BA.debugLineNum = 33685540;BA.debugLine="Return $\"Aviso, El fichero ${NombrePrimerFichero";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(("Aviso, El fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreprimerficheropedido))+" ha sido descargado anteriormente.")));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=33685547;
 //BA.debugLineNum = 33685547;BA.debugLine="Return NombrePrimerFicheroPedido";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_nombreprimerficheropedido));return;};
RDebugUtils.currentLine=33685549;
 //BA.debugLineNum = 33685549;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatosconnsftp(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargadatosconnsftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatosconnsftp", null));}
ResumableSub_CargaDatosConnSFTP rsub = new ResumableSub_CargaDatosConnSFTP(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosConnSFTP extends BA.ResumableSub {
public ResumableSub_CargaDatosConnSFTP(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdataconn = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="LogColor(\"CargaDatosConnSFTP\", xui.Color_Green)";
parent.__c.LogImpl("833554433","CargaDatosConnSFTP",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green);
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="Dim mDataConn As Map";
_mdataconn = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33554436;
 //BA.debugLineNum = 33554436;BA.debugLine="mDataConn.Initialize";
_mdataconn.Initialize();
RDebugUtils.currentLine=33554437;
 //BA.debugLineNum = 33554437;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33554438;
 //BA.debugLineNum = 33554438;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=33554439;
 //BA.debugLineNum = 33554439;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=33554440;
 //BA.debugLineNum = 33554440;BA.debugLine="mRes.Put(\"mDataConn\",mDataConn)";
_mres.Put((Object)("mDataConn"),(Object)(_mdataconn.getObject()));
RDebugUtils.currentLine=33554442;
 //BA.debugLineNum = 33554442;BA.debugLine="Dim Comando As String=\"DatossFTPRepsolProduccion\"";
_comando = "DatossFTPRepsolProduccion";
RDebugUtils.currentLine=33554443;
 //BA.debugLineNum = 33554443;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=33554445;
 //BA.debugLineNum = 33554445;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargadatosconnsftp"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=33554447;
 //BA.debugLineNum = 33554447;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=33554448;
 //BA.debugLineNum = 33554448;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=33554449;
 //BA.debugLineNum = 33554449;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=33554450;
 //BA.debugLineNum = 33554450;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargadatosconnsftp"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=33554451;
 //BA.debugLineNum = 33554451;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=33554452;
 //BA.debugLineNum = 33554452;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=33554455;
 //BA.debugLineNum = 33554455;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=33554456;
 //BA.debugLineNum = 33554456;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=33554457;
 //BA.debugLineNum = 33554457;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No existe la configuración necesaria para la conexión."),"Aviso");
RDebugUtils.currentLine=33554458;
 //BA.debugLineNum = 33554458;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargadatosconnsftp"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=33554459;
 //BA.debugLineNum = 33554459;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=33554460;
 //BA.debugLineNum = 33554460;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=33554462;
 //BA.debugLineNum = 33554462;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=33554463;
 //BA.debugLineNum = 33554463;BA.debugLine="mDataConn=lstReg.Get(0)";
_mdataconn = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=33554464;
 //BA.debugLineNum = 33554464;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=33554465;
 //BA.debugLineNum = 33554465;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=33554466;
 //BA.debugLineNum = 33554466;BA.debugLine="mRes.Put(\"mDataConn\", mDataConn)";
_mres.Put((Object)("mDataConn"),(Object)(_mdataconn.getObject()));
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
RDebugUtils.currentLine=33554470;
 //BA.debugLineNum = 33554470;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=33554471;
 //BA.debugLineNum = 33554471;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadireccionesenviorepsoleessgrp(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargadireccionesenviorepsoleessgrp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadireccionesenviorepsoleessgrp", null));}
ResumableSub_CargaDireccionesEnvioRepsolEESSGRP rsub = new ResumableSub_CargaDireccionesEnvioRepsolEESSGRP(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDireccionesEnvioRepsolEESSGRP extends BA.ResumableSub {
public ResumableSub_CargaDireccionesEnvioRepsolEESSGRP(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _accion = "";
String _error = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolMapeoSede";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolMapeoSedesEESS");
RDebugUtils.currentLine=34668548;
 //BA.debugLineNum = 34668548;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=34668550;
 //BA.debugLineNum = 34668550;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34668551;
 //BA.debugLineNum = 34668551;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=34668552;
 //BA.debugLineNum = 34668552;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34668553;
 //BA.debugLineNum = 34668553;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=34668554;
 //BA.debugLineNum = 34668554;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34668555;
 //BA.debugLineNum = 34668555;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34668556;
 //BA.debugLineNum = 34668556;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=34668557;
 //BA.debugLineNum = 34668557;BA.debugLine="Dim Comando As String=\"RepsolDireccionesEnvioEESS";
_comando = "RepsolDireccionesEnvioEESSGRP";
RDebugUtils.currentLine=34668558;
 //BA.debugLineNum = 34668558;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(__ref._mcodigonavgrprepsoleess /*String*/ )},parent);
RDebugUtils.currentLine=34668560;
 //BA.debugLineNum = 34668560;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargadireccionesenviorepsoleessgrp"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=34668562;
 //BA.debugLineNum = 34668562;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=34668563;
 //BA.debugLineNum = 34668563;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34668566;
 //BA.debugLineNum = 34668566;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34668567;
 //BA.debugLineNum = 34668567;BA.debugLine="Error=\"Error de conexion servidor/query \" & Coma";
_error = "Error de conexion servidor/query "+_comando+".";
RDebugUtils.currentLine=34668568;
 //BA.debugLineNum = 34668568;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34668569;
 //BA.debugLineNum = 34668569;BA.debugLine="mRes.Put(\"Error\", Error)";
_mres.Put((Object)("Error"),(Object)(_error));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=34668571;
 //BA.debugLineNum = 34668571;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=34668572;
 //BA.debugLineNum = 34668572;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34668575;
 //BA.debugLineNum = 34668575;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34668576;
 //BA.debugLineNum = 34668576;BA.debugLine="Error=$\"No hay datos de direcciones de envío de";
_error = ("No hay datos de direcciones de envío de las EESS de España.");
RDebugUtils.currentLine=34668577;
 //BA.debugLineNum = 34668577;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34668578;
 //BA.debugLineNum = 34668578;BA.debugLine="mRes.Put(\"Error\", Error)";
_mres.Put((Object)("Error"),(Object)(_error));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=34668580;
 //BA.debugLineNum = 34668580;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=34668581;
 //BA.debugLineNum = 34668581;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=34668582;
 //BA.debugLineNum = 34668582;BA.debugLine="Error=\"\"";
_error = "";
RDebugUtils.currentLine=34668583;
 //BA.debugLineNum = 34668583;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34668584;
 //BA.debugLineNum = 34668584;BA.debugLine="mRes.Put(\"Error\", Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34668585;
 //BA.debugLineNum = 34668585;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=34668588;
 //BA.debugLineNum = 34668588;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRepsolMapeoSedesEESS",_lstreg);
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
RDebugUtils.currentLine=34668591;
 //BA.debugLineNum = 34668591;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=34668592;
 //BA.debugLineNum = 34668592;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargamapeoarticuloseess(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargamapeoarticuloseess", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargamapeoarticuloseess", null));}
ResumableSub_CargaMapeoArticulosEESS rsub = new ResumableSub_CargaMapeoArticulosEESS(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaMapeoArticulosEESS extends BA.ResumableSub {
public ResumableSub_CargaMapeoArticulosEESS(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolMapeoArti";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolMapeoArticulosEESS");
RDebugUtils.currentLine=34799619;
 //BA.debugLineNum = 34799619;BA.debugLine="LogColor(\"CargaMapeoArticulosEESS\",xui.Color_Mage";
parent.__c.LogImpl("834799619","CargaMapeoArticulosEESS",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta);
RDebugUtils.currentLine=34799620;
 //BA.debugLineNum = 34799620;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=34799621;
 //BA.debugLineNum = 34799621;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34799622;
 //BA.debugLineNum = 34799622;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=34799623;
 //BA.debugLineNum = 34799623;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34799624;
 //BA.debugLineNum = 34799624;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=34799625;
 //BA.debugLineNum = 34799625;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34799626;
 //BA.debugLineNum = 34799626;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=34799627;
 //BA.debugLineNum = 34799627;BA.debugLine="Dim Comando As String=\"RepsolMapeoArticulosEESS\"";
_comando = "RepsolMapeoArticulosEESS";
RDebugUtils.currentLine=34799628;
 //BA.debugLineNum = 34799628;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=34799630;
 //BA.debugLineNum = 34799630;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargamapeoarticuloseess"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=34799632;
 //BA.debugLineNum = 34799632;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=34799633;
 //BA.debugLineNum = 34799633;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34799634;
 //BA.debugLineNum = 34799634;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=34799635;
 //BA.debugLineNum = 34799635;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargamapeoarticuloseess"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=34799636;
 //BA.debugLineNum = 34799636;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34799637;
 //BA.debugLineNum = 34799637;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=34799639;
 //BA.debugLineNum = 34799639;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=34799640;
 //BA.debugLineNum = 34799640;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34799641;
 //BA.debugLineNum = 34799641;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos de mapeo artículos REPSOL."),"Error");
RDebugUtils.currentLine=34799642;
 //BA.debugLineNum = 34799642;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargamapeoarticuloseess"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=34799643;
 //BA.debugLineNum = 34799643;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34799644;
 //BA.debugLineNum = 34799644;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=34799646;
 //BA.debugLineNum = 34799646;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=34799647;
 //BA.debugLineNum = 34799647;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=34799648;
 //BA.debugLineNum = 34799648;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34799652;
 //BA.debugLineNum = 34799652;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRepsolMapeoArticulosEESS",_lstreg);
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
RDebugUtils.currentLine=34799655;
 //BA.debugLineNum = 34799655;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=34799656;
 //BA.debugLineNum = 34799656;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargamapeocodigosprendaeess(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargamapeocodigosprendaeess", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargamapeocodigosprendaeess", null));}
ResumableSub_CargaMapeoCodigosPrendaEESS rsub = new ResumableSub_CargaMapeoCodigosPrendaEESS(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaMapeoCodigosPrendaEESS extends BA.ResumableSub {
public ResumableSub_CargaMapeoCodigosPrendaEESS(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolMapeoCodi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolMapeoCodigosPrendaEESS");
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=34865157;
 //BA.debugLineNum = 34865157;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34865158;
 //BA.debugLineNum = 34865158;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=34865159;
 //BA.debugLineNum = 34865159;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34865160;
 //BA.debugLineNum = 34865160;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=34865161;
 //BA.debugLineNum = 34865161;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34865162;
 //BA.debugLineNum = 34865162;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=34865163;
 //BA.debugLineNum = 34865163;BA.debugLine="Dim Comando As String=\"RepsolMapeoCodigosPrendaEE";
_comando = "RepsolMapeoCodigosPrendaEESS";
RDebugUtils.currentLine=34865164;
 //BA.debugLineNum = 34865164;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=34865166;
 //BA.debugLineNum = 34865166;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargamapeocodigosprendaeess"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=34865168;
 //BA.debugLineNum = 34865168;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=34865169;
 //BA.debugLineNum = 34865169;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34865170;
 //BA.debugLineNum = 34865170;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=34865171;
 //BA.debugLineNum = 34865171;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargamapeocodigosprendaeess"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=34865172;
 //BA.debugLineNum = 34865172;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34865173;
 //BA.debugLineNum = 34865173;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=34865175;
 //BA.debugLineNum = 34865175;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=34865176;
 //BA.debugLineNum = 34865176;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34865177;
 //BA.debugLineNum = 34865177;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos de mapeo de tipo de prendas."),"Error");
RDebugUtils.currentLine=34865178;
 //BA.debugLineNum = 34865178;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargamapeocodigosprendaeess"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=34865179;
 //BA.debugLineNum = 34865179;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34865180;
 //BA.debugLineNum = 34865180;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=34865182;
 //BA.debugLineNum = 34865182;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=34865183;
 //BA.debugLineNum = 34865183;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=34865184;
 //BA.debugLineNum = 34865184;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34865188;
 //BA.debugLineNum = 34865188;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRepsolMapeoCodigosPrendaEESS",_lstreg);
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
RDebugUtils.currentLine=34865191;
 //BA.debugLineNum = 34865191;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=34865192;
 //BA.debugLineNum = 34865192;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargarepsolultimodiaprocesadodatospedidosonline(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargarepsolultimodiaprocesadodatospedidosonline", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargarepsolultimodiaprocesadodatospedidosonline", null));}
ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine rsub = new ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine extends BA.ResumableSub {
public ResumableSub_CargaRepsolUltimoDiaProcesadoDatosPedidosOnLine(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _accion = "";
String _error = "";
long _ultimodiapedidosonlineprocesado = 0L;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="Dim UltimoDiaPedidosOnlineProcesado As Long";
_ultimodiapedidosonlineprocesado = 0L;
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=35520519;
 //BA.debugLineNum = 35520519;BA.debugLine="Dim Comando As String=\"RepsolUltimoDiaProcesadoDa";
_comando = "RepsolUltimoDiaProcesadoDatosPedidosOnLine";
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargarepsolultimodiaprocesadodatospedidosonline"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=35520523;
 //BA.debugLineNum = 35520523;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=35520524;
 //BA.debugLineNum = 35520524;BA.debugLine="Error=$\"Error de conexion servidor/query ${Coman";
_error = ("Error de conexion servidor/query "+parent.__c.SmartStringFormatter("",(Object)(_comando))+".");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=35520527;
 //BA.debugLineNum = 35520527;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=35520531;
 //BA.debugLineNum = 35520531;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=35520532;
 //BA.debugLineNum = 35520532;BA.debugLine="Error=\"\"";
_error = "";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=35520535;
 //BA.debugLineNum = 35520535;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=35520536;
 //BA.debugLineNum = 35520536;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=35520537;
 //BA.debugLineNum = 35520537;BA.debugLine="Error=\"\"";
_error = "";
RDebugUtils.currentLine=35520540;
 //BA.debugLineNum = 35520540;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=35520541;
 //BA.debugLineNum = 35520541;BA.debugLine="UltimoDiaPedidosOnlineProcesado=Utilidades.FixN";
_ultimodiapedidosonlineprocesado = parent._utilidades._fixnulllong /*long*/ (_mdata0.Get((Object)("UltimoDiaPedidosOnlineProcesado")));
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
RDebugUtils.currentLine=35520544;
 //BA.debugLineNum = 35520544;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=35520545;
 //BA.debugLineNum = 35520545;BA.debugLine="mRes.Put(\"Error\", Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=35520546;
 //BA.debugLineNum = 35520546;BA.debugLine="mRes.Put(\"UltimoDiaPedidosOnlineProcesado\", Ultim";
_mres.Put((Object)("UltimoDiaPedidosOnlineProcesado"),(Object)(_ultimodiapedidosonlineprocesado));
RDebugUtils.currentLine=35520547;
 //BA.debugLineNum = 35520547;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=35520548;
 //BA.debugLineNum = 35520548;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargatallasarticuloseess(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargatallasarticuloseess", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargatallasarticuloseess", null));}
ResumableSub_CargaTallasArticulosEESS rsub = new ResumableSub_CargaTallasArticulosEESS(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaTallasArticulosEESS extends BA.ResumableSub {
public ResumableSub_CargaTallasArticulosEESS(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _accion = "";
String _error = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
String _uuidbatch = "";
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsartseess = null;
String _codigoarticulonav = "";
anywheresoftware.b4a.objects.collections.Map _mresbatch = null;
String _accionbatch = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=34930691;
 //BA.debugLineNum = 34930691;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=34930692;
 //BA.debugLineNum = 34930692;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34930693;
 //BA.debugLineNum = 34930693;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=34930694;
 //BA.debugLineNum = 34930694;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34930695;
 //BA.debugLineNum = 34930695;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34930697;
 //BA.debugLineNum = 34930697;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolTallasArt";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolTallasArticulosEESS");
RDebugUtils.currentLine=34930699;
 //BA.debugLineNum = 34930699;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasArticulosTallasBatchUsuarioDispositivo",new Object[]{(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ )});
RDebugUtils.currentLine=34930700;
 //BA.debugLineNum = 34930700;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatallasarticuloseess"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=34930701;
 //BA.debugLineNum = 34930701;BA.debugLine="If success=False Then";
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
RDebugUtils.currentLine=34930702;
 //BA.debugLineNum = 34930702;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34930706;
 //BA.debugLineNum = 34930706;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34930707;
 //BA.debugLineNum = 34930707;BA.debugLine="Error=\"No ha sido posible eliminar los datos bat";
_error = "No ha sido posible eliminar los datos batch anteriores del usuario/dispositivo actuales.";
RDebugUtils.currentLine=34930708;
 //BA.debugLineNum = 34930708;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34930709;
 //BA.debugLineNum = 34930709;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34930710;
 //BA.debugLineNum = 34930710;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=34930713;
 //BA.debugLineNum = 34930713;BA.debugLine="Dim UUIDBatch As String=Utilidades.GenerarUUIDv4";
_uuidbatch = parent._utilidades._generaruuidv4 /*String*/ ();
RDebugUtils.currentLine=34930714;
 //BA.debugLineNum = 34930714;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34930715;
 //BA.debugLineNum = 34930715;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=34930716;
 //BA.debugLineNum = 34930716;BA.debugLine="Dim rsArtsEESS As ResultSet=mSQL.ExecQuery(\"selec";
_rsartseess = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsartseess = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select DISTINCT CodigoArticuloNAV from tblRepsolMapeoArticulosEESS");
RDebugUtils.currentLine=34930717;
 //BA.debugLineNum = 34930717;BA.debugLine="Do While rsArtsEESS.NextRow";
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsartseess.NextRow()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
RDebugUtils.currentLine=34930718;
 //BA.debugLineNum = 34930718;BA.debugLine="Dim CodigoArticuloNAV As String=rsArtsEESS.GetSt";
_codigoarticulonav = _rsartseess.GetString("CodigoArticuloNAV");
RDebugUtils.currentLine=34930719;
 //BA.debugLineNum = 34930719;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarLineaArticuloTallaBatch",new Object[]{(Object)(_uuidbatch),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ),(Object)(_codigoarticulonav),(Object)(""),(Object)(0),(Object)(0),(Object)("")});
RDebugUtils.currentLine=34930721;
 //BA.debugLineNum = 34930721;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=34930723;
 //BA.debugLineNum = 34930723;BA.debugLine="rsArtsEESS.Close";
_rsartseess.Close();
RDebugUtils.currentLine=34930725;
 //BA.debugLineNum = 34930725;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatallasarticuloseess"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,_lstcommands));
this.state = 18;
return;
case 18:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=34930726;
 //BA.debugLineNum = 34930726;BA.debugLine="If success=False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=34930727;
 //BA.debugLineNum = 34930727;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34930731;
 //BA.debugLineNum = 34930731;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34930732;
 //BA.debugLineNum = 34930732;BA.debugLine="Error=\"No ha sido posible insertar las líneas ba";
_error = "No ha sido posible insertar las líneas batch de los artículos de Repsol.";
RDebugUtils.currentLine=34930733;
 //BA.debugLineNum = 34930733;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34930734;
 //BA.debugLineNum = 34930734;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34930735;
 //BA.debugLineNum = 34930735;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=34930739;
 //BA.debugLineNum = 34930739;BA.debugLine="Wait For(CargaTallasArticulosEESSBatch(UUIDBatch)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatallasarticuloseess"), __ref._cargatallasarticuloseessbatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_uuidbatch));
this.state = 19;
return;
case 19:
//C
this.state = 13;
_mresbatch = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=34930740;
 //BA.debugLineNum = 34930740;BA.debugLine="Dim AccionBatch As String=mResBatch.Get(\"Accion\")";
_accionbatch = BA.ObjectToString(_mresbatch.Get((Object)("Accion")));
RDebugUtils.currentLine=34930741;
 //BA.debugLineNum = 34930741;BA.debugLine="If AccionBatch=\"NOK\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_accionbatch).equals("NOK")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=34930742;
 //BA.debugLineNum = 34930742;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34930743;
 //BA.debugLineNum = 34930743;BA.debugLine="Error=mResBatch.Get(\"Error\")";
_error = BA.ObjectToString(_mresbatch.Get((Object)("Error")));
RDebugUtils.currentLine=34930744;
 //BA.debugLineNum = 34930744;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34930745;
 //BA.debugLineNum = 34930745;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34930746;
 //BA.debugLineNum = 34930746;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=34930749;
 //BA.debugLineNum = 34930749;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasArticulosTallasBatchUUID",new Object[]{(Object)(_uuidbatch)});
RDebugUtils.currentLine=34930750;
 //BA.debugLineNum = 34930750;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdcLinkNav,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatallasarticuloseess"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinknav /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 20;
return;
case 20:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=34930754;
 //BA.debugLineNum = 34930754;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=34930755;
 //BA.debugLineNum = 34930755;BA.debugLine="Error=\"\"";
_error = "";
RDebugUtils.currentLine=34930756;
 //BA.debugLineNum = 34930756;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34930757;
 //BA.debugLineNum = 34930757;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34930758;
 //BA.debugLineNum = 34930758;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=34930761;
 //BA.debugLineNum = 34930761;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargatallasarticuloseessbatch(b4j.docU.crepsol __ref,String _uuidsel) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargatallasarticuloseessbatch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargatallasarticuloseessbatch", new Object[] {_uuidsel}));}
ResumableSub_CargaTallasArticulosEESSBatch rsub = new ResumableSub_CargaTallasArticulosEESSBatch(this,__ref,_uuidsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaTallasArticulosEESSBatch extends BA.ResumableSub {
public ResumableSub_CargaTallasArticulosEESSBatch(b4j.docU.crepsol parent,b4j.docU.crepsol __ref,String _uuidsel) {
this.parent = parent;
this.__ref = __ref;
this._uuidsel = _uuidsel;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _uuidsel;
String _accion = "";
String _error = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolTallasArt";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolTallasArticulosEESS");
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="LogColor(\"CargaTallasArticulosEESSBatch\",xui.Colo";
parent.__c.LogImpl("834996227","CargaTallasArticulosEESSBatch",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta);
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=34996229;
 //BA.debugLineNum = 34996229;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=34996230;
 //BA.debugLineNum = 34996230;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=34996232;
 //BA.debugLineNum = 34996232;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34996233;
 //BA.debugLineNum = 34996233;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=34996234;
 //BA.debugLineNum = 34996234;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34996235;
 //BA.debugLineNum = 34996235;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34996236;
 //BA.debugLineNum = 34996236;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=34996237;
 //BA.debugLineNum = 34996237;BA.debugLine="Dim Comando As String=\"RepsolTallasArticulosBatch";
_comando = "RepsolTallasArticulosBatch";
RDebugUtils.currentLine=34996238;
 //BA.debugLineNum = 34996238;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_uuidsel)},parent);
RDebugUtils.currentLine=34996240;
 //BA.debugLineNum = 34996240;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatallasarticuloseessbatch"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=34996242;
 //BA.debugLineNum = 34996242;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=34996243;
 //BA.debugLineNum = 34996243;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34996246;
 //BA.debugLineNum = 34996246;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34996247;
 //BA.debugLineNum = 34996247;BA.debugLine="Error=$\"Error de conexion servidor/query ${Coman";
_error = ("Error de conexion servidor/query "+parent.__c.SmartStringFormatter("",(Object)(_comando))+".");
RDebugUtils.currentLine=34996248;
 //BA.debugLineNum = 34996248;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34996249;
 //BA.debugLineNum = 34996249;BA.debugLine="mRes.Put(\"Error\", Error)";
_mres.Put((Object)("Error"),(Object)(_error));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=34996251;
 //BA.debugLineNum = 34996251;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=34996252;
 //BA.debugLineNum = 34996252;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34996253;
 //BA.debugLineNum = 34996253;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos de tallas de artículos Repsol."),"Error");
RDebugUtils.currentLine=34996254;
 //BA.debugLineNum = 34996254;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatallasarticuloseessbatch"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 11;
;
RDebugUtils.currentLine=34996255;
 //BA.debugLineNum = 34996255;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34996256;
 //BA.debugLineNum = 34996256;BA.debugLine="Error=$\"No hay datos de tallas de artículos Rep";
_error = ("No hay datos de tallas de artículos Repsol.");
RDebugUtils.currentLine=34996257;
 //BA.debugLineNum = 34996257;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34996258;
 //BA.debugLineNum = 34996258;BA.debugLine="mRes.Put(\"Error\", Error)";
_mres.Put((Object)("Error"),(Object)(_error));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=34996260;
 //BA.debugLineNum = 34996260;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=34996261;
 //BA.debugLineNum = 34996261;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=34996262;
 //BA.debugLineNum = 34996262;BA.debugLine="Error=\"\"";
_error = "";
RDebugUtils.currentLine=34996263;
 //BA.debugLineNum = 34996263;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34996264;
 //BA.debugLineNum = 34996264;BA.debugLine="mRes.Put(\"Error\", Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=34996268;
 //BA.debugLineNum = 34996268;BA.debugLine="LogColor(\"InsertarMapsSoloCamposCoincidentes tb";
parent.__c.LogImpl("834996268","InsertarMapsSoloCamposCoincidentes tblRepsolTallasArticulosEESS",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Green);
RDebugUtils.currentLine=34996269;
 //BA.debugLineNum = 34996269;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRepsolTallasArticulosEESS",_lstreg);
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
RDebugUtils.currentLine=34996272;
 //BA.debugLineNum = 34996272;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=34996273;
 //BA.debugLineNum = 34996273;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargatarifaventavalidaactualgrprepsoleess(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "cargatarifaventavalidaactualgrprepsoleess", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargatarifaventavalidaactualgrprepsoleess", null));}
ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS rsub = new ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS extends BA.ResumableSub {
public ResumableSub_CargaTarifaVentaValidaActualGRPRepsolEESS(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolTarifaVen";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolTarifaVentaGRP07506");
RDebugUtils.currentLine=34734084;
 //BA.debugLineNum = 34734084;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=34734085;
 //BA.debugLineNum = 34734085;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34734086;
 //BA.debugLineNum = 34734086;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=34734087;
 //BA.debugLineNum = 34734087;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34734088;
 //BA.debugLineNum = 34734088;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=34734089;
 //BA.debugLineNum = 34734089;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34734090;
 //BA.debugLineNum = 34734090;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=34734091;
 //BA.debugLineNum = 34734091;BA.debugLine="Dim Comando As String=\"TarifaVentaActualTipoTarif";
_comando = "TarifaVentaActualTipoTarifaCodigoTarifa";
RDebugUtils.currentLine=34734092;
 //BA.debugLineNum = 34734092;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(1),(Object)(__ref._mcodigonavgrprepsoleess /*String*/ )},parent);
RDebugUtils.currentLine=34734094;
 //BA.debugLineNum = 34734094;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatarifaventavalidaactualgrprepsoleess"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=34734096;
 //BA.debugLineNum = 34734096;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=34734097;
 //BA.debugLineNum = 34734097;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34734098;
 //BA.debugLineNum = 34734098;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=34734099;
 //BA.debugLineNum = 34734099;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatarifaventavalidaactualgrprepsoleess"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=34734100;
 //BA.debugLineNum = 34734100;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=34734101;
 //BA.debugLineNum = 34734101;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=34734103;
 //BA.debugLineNum = 34734103;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=34734104;
 //BA.debugLineNum = 34734104;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=34734105;
 //BA.debugLineNum = 34734105;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay dato";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos de tarifa de precios de las EESS de España."),"Error");
RDebugUtils.currentLine=34734106;
 //BA.debugLineNum = 34734106;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "cargatarifaventavalidaactualgrprepsoleess"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=34734107;
 //BA.debugLineNum = 34734107;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=34734108;
 //BA.debugLineNum = 34734108;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=34734110;
 //BA.debugLineNum = 34734110;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=34734111;
 //BA.debugLineNum = 34734111;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=34734112;
 //BA.debugLineNum = 34734112;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=34734113;
 //BA.debugLineNum = 34734113;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=34734116;
 //BA.debugLineNum = 34734116;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblRepsolTarifaVentaGRP07506",_lstreg);
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
RDebugUtils.currentLine=34734119;
 //BA.debugLineNum = 34734119;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=34734120;
 //BA.debugLineNum = 34734120;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _checkdni(b4j.docU.crepsol __ref,String _dni) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "checkdni", false))
	 {return ((String) Debug.delegate(ba, "checkdni", new Object[] {_dni}));}
int _txtlongitud = 0;
String _letra = "";
String _letracalculada = "";
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Sub checkDNI(dni As String) As String";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="If dni.Length<>9 Then Return False 'longitud inco";
if (_dni.length()!=9) { 
if (true) return BA.ObjectToString(__c.False);};
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="dni = dni.ToUpperCase";
_dni = _dni.toUpperCase();
RDebugUtils.currentLine=34340867;
 //BA.debugLineNum = 34340867;BA.debugLine="Dim txtlongitud As Int = dni.Length";
_txtlongitud = _dni.length();
RDebugUtils.currentLine=34340868;
 //BA.debugLineNum = 34340868;BA.debugLine="Dim letra As String = dni.SubString2(txtlongitud-";
_letra = _dni.substring((int) (_txtlongitud-1),_txtlongitud);
RDebugUtils.currentLine=34340869;
 //BA.debugLineNum = 34340869;BA.debugLine="Try";
try {RDebugUtils.currentLine=34340870;
 //BA.debugLineNum = 34340870;BA.debugLine="Dim letracalculada As String = getLetraDNI(dni.S";
_letracalculada = __ref._getletradni /*String*/ (null,_dni.substring((int) (0),(int) (_txtlongitud-1)));
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=34340872;
 //BA.debugLineNum = 34340872;BA.debugLine="Log(LastException)";
__c.LogImpl("834340872",BA.ObjectToString(__c.LastException(ba)),0);
RDebugUtils.currentLine=34340873;
 //BA.debugLineNum = 34340873;BA.debugLine="Return False";
if (true) return BA.ObjectToString(__c.False);
 };
RDebugUtils.currentLine=34340876;
 //BA.debugLineNum = 34340876;BA.debugLine="If letra=letracalculada Then Return True Else Ret";
if ((_letra).equals(_letracalculada)) { 
if (true) return BA.ObjectToString(__c.True);}
else {
if (true) return BA.ObjectToString(__c.False);};
RDebugUtils.currentLine=34340877;
 //BA.debugLineNum = 34340877;BA.debugLine="End Sub";
return "";
}
public String  _getletradni(b4j.docU.crepsol __ref,String _dni) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "getletradni", false))
	 {return ((String) Debug.delegate(ba, "getletradni", new Object[] {_dni}));}
String _primeraletra = "";
String _letras = "";
int _character = 0;
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Sub getLetraDNI(dni As String) As String";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="If dni.Length<>8 Then Return \"\" 'longitud incorre";
if (_dni.length()!=8) { 
if (true) return "";};
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="dni = dni.ToUpperCase";
_dni = _dni.toUpperCase();
RDebugUtils.currentLine=34406404;
 //BA.debugLineNum = 34406404;BA.debugLine="Dim primeraletra As String = dni.SubString2(0,1)";
_primeraletra = _dni.substring((int) (0),(int) (1));
RDebugUtils.currentLine=34406405;
 //BA.debugLineNum = 34406405;BA.debugLine="Select Case primeraletra";
switch (BA.switchObjectToInt(_primeraletra,"X","Y","Z")) {
case 0: {
RDebugUtils.currentLine=34406407;
 //BA.debugLineNum = 34406407;BA.debugLine="dni = dni.Replace(\"X\",\"0\")";
_dni = _dni.replace("X","0");
 break; }
case 1: {
RDebugUtils.currentLine=34406409;
 //BA.debugLineNum = 34406409;BA.debugLine="dni = dni.Replace(\"Y\",\"1\")";
_dni = _dni.replace("Y","1");
 break; }
case 2: {
RDebugUtils.currentLine=34406411;
 //BA.debugLineNum = 34406411;BA.debugLine="dni = dni.Replace(\"Z\",\"2\")";
_dni = _dni.replace("Z","2");
 break; }
}
;
RDebugUtils.currentLine=34406413;
 //BA.debugLineNum = 34406413;BA.debugLine="Dim letras As String = \"TRWAGMYFPDXBNJZSQVHLCKE\"";
_letras = "TRWAGMYFPDXBNJZSQVHLCKE";
RDebugUtils.currentLine=34406414;
 //BA.debugLineNum = 34406414;BA.debugLine="Dim character As Int";
_character = 0;
RDebugUtils.currentLine=34406415;
 //BA.debugLineNum = 34406415;BA.debugLine="character = (1 + (dni) Mod 23)";
_character = (int) ((1+(double)(Double.parseDouble((_dni)))%23));
RDebugUtils.currentLine=34406416;
 //BA.debugLineNum = 34406416;BA.debugLine="Return letras.SubString2 ((character-1), (charact";
if (true) return _letras.substring((int) ((_character-1)),(int) ((_character-1)+1));
RDebugUtils.currentLine=34406417;
 //BA.debugLineNum = 34406417;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.crepsol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=33161223;
 //BA.debugLineNum = 33161223;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=33161224;
 //BA.debugLineNum = 33161224;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=33161226;
 //BA.debugLineNum = 33161226;BA.debugLine="Private DragAndDrop1 As DragAndDrop";
_draganddrop1 = new b4j.docU.draganddrop();
RDebugUtils.currentLine=33161228;
 //BA.debugLineNum = 33161228;BA.debugLine="Private SplitPane1 As SplitPane";
_splitpane1 = new anywheresoftware.b4j.objects.SplitPaneWrapper();
RDebugUtils.currentLine=33161229;
 //BA.debugLineNum = 33161229;BA.debugLine="Private TreeViewLocal As TreeView";
_treeviewlocal = new anywheresoftware.b4j.objects.TreeViewWrapper();
RDebugUtils.currentLine=33161230;
 //BA.debugLineNum = 33161230;BA.debugLine="Private TreeViewFTP As TreeView";
_treeviewftp = new anywheresoftware.b4j.objects.TreeViewWrapper();
RDebugUtils.currentLine=33161232;
 //BA.debugLineNum = 33161232;BA.debugLine="Private vLocalPath As TextField";
_vlocalpath = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=33161233;
 //BA.debugLineNum = 33161233;BA.debugLine="Private vFTPpath As TextField";
_vftppath = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=33161234;
 //BA.debugLineNum = 33161234;BA.debugLine="Private TextFTP As TextField";
_textftp = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=33161235;
 //BA.debugLineNum = 33161235;BA.debugLine="Private TextUser As TextField";
_textuser = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=33161236;
 //BA.debugLineNum = 33161236;BA.debugLine="Private TextPassword As TextField";
_textpassword = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=33161237;
 //BA.debugLineNum = 33161237;BA.debugLine="Private TextInfo As TextArea";
_textinfo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=33161238;
 //BA.debugLineNum = 33161238;BA.debugLine="Private SD_LoadingIndicator1 As SD_LoadingIndicat";
_sd_loadingindicator1 = new b4j.docU.sd_loadingindicator();
RDebugUtils.currentLine=33161240;
 //BA.debugLineNum = 33161240;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=33161242;
 //BA.debugLineNum = 33161242;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=33161243;
 //BA.debugLineNum = 33161243;BA.debugLine="Private btnSalir As B4XView";
_btnsalir = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161245;
 //BA.debugLineNum = 33161245;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=33161248;
 //BA.debugLineNum = 33161248;BA.debugLine="Private mCodigoNAVGRPRepsolEESS As String";
_mcodigonavgrprepsoleess = "";
RDebugUtils.currentLine=33161250;
 //BA.debugLineNum = 33161250;BA.debugLine="Private sFtpRepsol As SFtp";
_sftprepsol = new anywheresoftware.b4a.objects.SFtpWrapper();
RDebugUtils.currentLine=33161251;
 //BA.debugLineNum = 33161251;BA.debugLine="Private FilesFoldersFtpRepsol As String";
_filesfoldersftprepsol = "";
RDebugUtils.currentLine=33161252;
 //BA.debugLineNum = 33161252;BA.debugLine="Private ErrorFilesFoldersFtpRepsol As String";
_errorfilesfoldersftprepsol = "";
RDebugUtils.currentLine=33161254;
 //BA.debugLineNum = 33161254;BA.debugLine="Private CarpetaDestinoFicherosDescargadosFTPPedid";
_carpetadestinoficherosdescargadosftppedidosrepsol = "\\\\192.168.10.4\\Publico\\PedidosRepsolOnline\\FicherosDescargadosFTP";
RDebugUtils.currentLine=33161255;
 //BA.debugLineNum = 33161255;BA.debugLine="Private CarpetaDestinoFicherosPedidosOKRepsol As";
_carpetadestinoficherospedidosokrepsol = "\\\\192.168.10.4\\Publico\\PedidosRepsolOnline\\FicherosPedidosOK";
RDebugUtils.currentLine=33161256;
 //BA.debugLineNum = 33161256;BA.debugLine="Private CarpetaDestinoFicherosPedidosErrorRepsol";
_carpetadestinoficherospedidoserrorrepsol = "\\\\192.168.10.4\\Publico\\PedidosRepsolOnline\\FicherosPedidosError";
RDebugUtils.currentLine=33161258;
 //BA.debugLineNum = 33161258;BA.debugLine="Private Const CuentaEmailRemitenteAvisos As Strin";
_cuentaemailremitenteavisos = "noreply@proin-pinilla.com";
RDebugUtils.currentLine=33161259;
 //BA.debugLineNum = 33161259;BA.debugLine="Private Const CuentaEmailDestinatarioDev1 As Stri";
_cuentaemaildestinatariodev1 = "smarquina@proin-pinilla.com";
RDebugUtils.currentLine=33161260;
 //BA.debugLineNum = 33161260;BA.debugLine="Private Const CuentaEmailDestinatarioDev2 As Stri";
_cuentaemaildestinatariodev2 = "fblazquez@proin-pinilla.com";
RDebugUtils.currentLine=33161262;
 //BA.debugLineNum = 33161262;BA.debugLine="Private Const CuentaEmailDestinatarioProinPedidos";
_cuentaemaildestinatarioproinpedidosrepsol = "pedidosrepsol@proin-pinilla.com";
RDebugUtils.currentLine=33161268;
 //BA.debugLineNum = 33161268;BA.debugLine="Type TipoDatosLineaPedidoRepsol (Linea As String,";
;
RDebugUtils.currentLine=33161276;
 //BA.debugLineNum = 33161276;BA.debugLine="Private btnSelFicheroFTP As B4XView";
_btnselficheroftp = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161277;
 //BA.debugLineNum = 33161277;BA.debugLine="Private txtFicheroSeleccionado As B4XView";
_txtficheroseleccionado = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161278;
 //BA.debugLineNum = 33161278;BA.debugLine="Private btnProcesar As B4XView";
_btnprocesar = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161279;
 //BA.debugLineNum = 33161279;BA.debugLine="Private TextAreaDatosProceso As TextArea";
_textareadatosproceso = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=33161280;
 //BA.debugLineNum = 33161280;BA.debugLine="Private btnSelFicheroWindows As B4XView";
_btnselficherowindows = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161282;
 //BA.debugLineNum = 33161282;BA.debugLine="Private DirFicheroProcesar, NombreFicheroProcesar";
_dirficheroprocesar = "";
_nombreficheroprocesar = "";
RDebugUtils.currentLine=33161283;
 //BA.debugLineNum = 33161283;BA.debugLine="Private btnCheckFTPInbox As B4XView";
_btncheckftpinbox = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161284;
 //BA.debugLineNum = 33161284;BA.debugLine="Private btnUploadFile As B4XView";
_btnuploadfile = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161285;
 //BA.debugLineNum = 33161285;BA.debugLine="Private btnProcesoCompleto As B4XView";
_btnprocesocompleto = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33161286;
 //BA.debugLineNum = 33161286;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.crepsol __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=33292297;
 //BA.debugLineNum = 33292297;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblRepsolLineasFicheroPedido");
RDebugUtils.currentLine=33292298;
 //BA.debugLineNum = 33292298;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblRepso";
_screartabla = ("CREATE TABLE tblRepsolLineasFicheroPedido (Linea TEXT default '', ErrorLongitudLineaCabeceraEstacion TEXT default ''\n"+"	, Sede TEXT default '', CodigoClienteERP TEXT default '', CodigoDireccionEnvioERP TEXT default '', ErrorSede TEXT default ''\n"+"	, CodigoPedido TEXT default '', FechaPedido TEXT default '', ErrorFechaPedido TEXT default ''\n"+"	, NombreEstacion TEXT default '',Calle TEXT default '', CodigoPostal TEXT default '', Poblacion TEXT default '', CodigoProvincia TEXT default '', Telefono TEXT default ''\n"+"	, TipoEstacion TEXT default '', Marca TEXT default '', ErrorMarca TEXT default ''\n"+"	, ErrorLongitudLineaEmpleado TEXT default '', DNI TEXT default '', ErrorDNI TEXT default '', NombreEmpleado TEXT default ''\n"+"	, Cargo TEXT default '', ErrorCargo TEXT default '', Sexo TEXT default '', ErrorSexo TEXT default '',  Embarazo TEXT default '', ErrorEmbarazo TEXT default ''\n"+"	, ErrorLongitudLineaProducto TEXT default '', CodigoPrenda TEXT default '', ErrorCodigoPrenda TEXT default '', CodigoProductoERP TEXT default '', ErrorCodigoProductoERP TEXT default ''\n"+"	, Talla TEXT default '', TallaERP TEXT default '', ErrorTalla TEXT default '', Cantidad INTEGER default 0, ErrorCantidad INTEGER default 0\n"+"	, LineaConError INTEGER default 0, SedePedidoDNIConError INTEGER default 0\n"+"	)");
RDebugUtils.currentLine=33292309;
 //BA.debugLineNum = 33292309;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=33292311;
 //BA.debugLineNum = 33292311;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblRepsolMapeoCodigosPrendaEESS");
RDebugUtils.currentLine=33292312;
 //BA.debugLineNum = 33292312;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblRepsolMapeoCodigosPrendaEESS] (\n"+"	[CodigoPrenda] TEXT, [NombreCodigoPrenda] TEXT\n"+"	)");
RDebugUtils.currentLine=33292315;
 //BA.debugLineNum = 33292315;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=33292317;
 //BA.debugLineNum = 33292317;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblRepsolMapeoArticulosEESS");
RDebugUtils.currentLine=33292318;
 //BA.debugLineNum = 33292318;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblRepsolMapeoArticulosEESS] (\n"+"	[IDLinea] INTEGER, [Marca] TEXT, [Cargo] TEXT, [Sexo] TEXT, [CodigoPrenda] TEXT, [CodigoArticuloNAV] TEXT, [NombreCodigoPrenda] TEXT\n"+"	, [Combi] TEXT\n"+"	)");
RDebugUtils.currentLine=33292322;
 //BA.debugLineNum = 33292322;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=33292324;
 //BA.debugLineNum = 33292324;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblRepsolTallasArticulosEESS");
RDebugUtils.currentLine=33292325;
 //BA.debugLineNum = 33292325;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblRepsolTallasArticulosEESS] (\n"+"	[Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT\n"+"	)");
RDebugUtils.currentLine=33292328;
 //BA.debugLineNum = 33292328;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=33292330;
 //BA.debugLineNum = 33292330;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblRepsolMapeoSedesEESS");
RDebugUtils.currentLine=33292331;
 //BA.debugLineNum = 33292331;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblRepsolMapeoSedesEESS] (\n"+"	[Sede] TEXT default '',  [CodigoClienteNAV] TEXT default '', [CodigoDireccionEnvioNAV] TEXT default ''\n"+"	)");
RDebugUtils.currentLine=33292334;
 //BA.debugLineNum = 33292334;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=33292336;
 //BA.debugLineNum = 33292336;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblRepsolTarifaVentaGRP07506");
RDebugUtils.currentLine=33292337;
 //BA.debugLineNum = 33292337;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblRepsolTarifaVentaGRP07506] ([TipoTarifa] INTEGER, [CodigoTarifa] TEXT\n"+"	, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Variante] TEXT, [Moneda] TEXT, [UM] TEXT, [CantidadMinima] REAL, [PrecioUnitario] REAL, [FechaInicial] INTEGER, [FechaFinal] INTEGER\n"+"	, [NumTarifa] INTEGER, [UMVenta] TEXT, [FechaCreacion] INTEGER, [CosteUnitario] REAL, [CosteSTD] REAL, [FechaCosteSTD] INTEGER, [GRC] TEXT, [CompraFab] INTEGER\n"+"	, [CosteRazonable] REAL, [FechaCosteRazonable] INTEGER, [Ruta] TEXT, [NombreRuta] TEXT, [LM] TEXT\n"+"	)");
RDebugUtils.currentLine=33292342;
 //BA.debugLineNum = 33292342;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=33292348;
 //BA.debugLineNum = 33292348;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblRepsolErroresSedePedidoDNIFicheroPedido");
RDebugUtils.currentLine=33292349;
 //BA.debugLineNum = 33292349;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblRepsolErroresSedePedidoDNIFicheroPedido] (\n"+"	[Sede] TEXT, [PedidoSede] TEXT, [DNI] TEXT, [Errores] TEXT\n"+"	)");
RDebugUtils.currentLine=33292352;
 //BA.debugLineNum = 33292352;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=33292355;
 //BA.debugLineNum = 33292355;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviaremailaviso(b4j.docU.crepsol __ref,boolean _solodev,String _asunto,String _body) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "enviaremailaviso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviaremailaviso", new Object[] {_solodev,_asunto,_body}));}
ResumableSub_EnviarEmailAviso rsub = new ResumableSub_EnviarEmailAviso(this,__ref,_solodev,_asunto,_body);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnviarEmailAviso extends BA.ResumableSub {
public ResumableSub_EnviarEmailAviso(b4j.docU.crepsol parent,b4j.docU.crepsol __ref,boolean _solodev,String _asunto,String _body) {
this.parent = parent;
this.__ref = __ref;
this._solodev = _solodev;
this._asunto = _asunto;
this._body = _body;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
boolean _solodev;
String _asunto;
String _body;
String _destinatarios = "";
String _destinatarioscc = "";
String _destinatarioscco = "";
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Body=Body & $\"  No respondas a este correo. Ha si";
_body = _body+("\n"+"\n"+"No respondas a este correo. Ha sido generado por un proceso automático.\n"+"");
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
_body = _body.replace(parent.__c.CRLF,"<br>");
RDebugUtils.currentLine=35651590;
 //BA.debugLineNum = 35651590;BA.debugLine="Dim Destinatarios As String";
_destinatarios = "";
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="Dim DestinatariosCC As String";
_destinatarioscc = "";
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="Dim DestinatariosCCO As String";
_destinatarioscco = "";
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="If SoloDev Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_solodev) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=35651595;
 //BA.debugLineNum = 35651595;BA.debugLine="Destinatarios=$\"${CuentaEmailDestinatarioDev1}\"$";
_destinatarios = (""+parent.__c.SmartStringFormatter("",(Object)(__ref._cuentaemaildestinatariodev1 /*String*/ ))+"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=35651597;
 //BA.debugLineNum = 35651597;BA.debugLine="Destinatarios=$\"${CuentaEmailDestinatarioProinPe";
_destinatarios = (""+parent.__c.SmartStringFormatter("",(Object)(__ref._cuentaemaildestinatarioproinpedidosrepsol /*String*/ ))+"");
RDebugUtils.currentLine=35651599;
 //BA.debugLineNum = 35651599;BA.debugLine="DestinatariosCC=$\"${CuentaEmailDestinatarioDev1}";
_destinatarioscc = (""+parent.__c.SmartStringFormatter("",(Object)(__ref._cuentaemaildestinatariodev1 /*String*/ ))+"");
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=35651601;
 //BA.debugLineNum = 35651601;BA.debugLine="Wait For(Utilidades.EnviarMensajeHttpPA(CuentaEma";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "enviaremailaviso"), parent._utilidades._enviarmensajehttppa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (__ref._cuentaemailremitenteavisos /*String*/ ,_destinatarios,_destinatarioscc,_destinatarioscco,_asunto,_body));
this.state = 7;
return;
case 7:
//C
this.state = -1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=35651602;
 //BA.debugLineNum = 35651602;BA.debugLine="Return sResp";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_sresp));return;};
RDebugUtils.currentLine=35651603;
 //BA.debugLineNum = 35651603;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.crepsol __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="End Sub";
return "";
}
public String  _generarcsvseparadorcomasquotes(b4j.docU.crepsol __ref,anywheresoftware.b4a.objects.collections.List _lsttabla,String _separatorchar,anywheresoftware.b4a.objects.collections.List _lstencabezados) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "generarcsvseparadorcomasquotes", false))
	 {return ((String) Debug.delegate(ba, "generarcsvseparadorcomasquotes", new Object[] {_lsttabla,_separatorchar,_lstencabezados}));}
String _eol = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sh = "";
boolean _wrap = false;
String _word = "";
String[] _row = null;
int _i = 0;
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub GenerarCSVSeparadorComasQuotes (lstTabl";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Dim eol As String = Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="If lstTabla.Size = 0 Then Return \"\"";
if (_lsttabla.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35192838;
 //BA.debugLineNum = 35192838;BA.debugLine="For Each sH As String In lstEncabezados";
{
final anywheresoftware.b4a.BA.IterableList group5 = _lstencabezados;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_sh = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=35192839;
 //BA.debugLineNum = 35192839;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
RDebugUtils.currentLine=35192840;
 //BA.debugLineNum = 35192840;BA.debugLine="Dim word As String=sH";
_word = _sh;
RDebugUtils.currentLine=35192841;
 //BA.debugLineNum = 35192841;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = True";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
RDebugUtils.currentLine=35192842;
 //BA.debugLineNum = 35192842;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
RDebugUtils.currentLine=35192843;
 //BA.debugLineNum = 35192843;BA.debugLine="Wrap = True";
_wrap = __c.True;
RDebugUtils.currentLine=35192844;
 //BA.debugLineNum = 35192844;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
RDebugUtils.currentLine=35192846;
 //BA.debugLineNum = 35192846;BA.debugLine="If Wrap Then";
if (_wrap) { 
RDebugUtils.currentLine=35192847;
 //BA.debugLineNum = 35192847;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
RDebugUtils.currentLine=35192850;
 //BA.debugLineNum = 35192850;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)  '";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 };
RDebugUtils.currentLine=35192852;
 //BA.debugLineNum = 35192852;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
RDebugUtils.currentLine=35192854;
 //BA.debugLineNum = 35192854;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=35192855;
 //BA.debugLineNum = 35192855;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
RDebugUtils.currentLine=35192857;
 //BA.debugLineNum = 35192857;BA.debugLine="For Each row() As String In lstTabla";
{
final anywheresoftware.b4a.BA.IterableList group22 = _lsttabla;
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_row = (String[])(group22.Get(index22));
RDebugUtils.currentLine=35192858;
 //BA.debugLineNum = 35192858;BA.debugLine="For i = 0 To row.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_row.length-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=35192859;
 //BA.debugLineNum = 35192859;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
RDebugUtils.currentLine=35192860;
 //BA.debugLineNum = 35192860;BA.debugLine="Dim word As String = row(i)";
_word = _row[_i];
RDebugUtils.currentLine=35192861;
 //BA.debugLineNum = 35192861;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
RDebugUtils.currentLine=35192862;
 //BA.debugLineNum = 35192862;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
RDebugUtils.currentLine=35192863;
 //BA.debugLineNum = 35192863;BA.debugLine="Wrap = True";
_wrap = __c.True;
RDebugUtils.currentLine=35192864;
 //BA.debugLineNum = 35192864;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
RDebugUtils.currentLine=35192866;
 //BA.debugLineNum = 35192866;BA.debugLine="If Wrap Then";
if (_wrap) { 
RDebugUtils.currentLine=35192867;
 //BA.debugLineNum = 35192867;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
RDebugUtils.currentLine=35192870;
 //BA.debugLineNum = 35192870;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)  '";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 };
RDebugUtils.currentLine=35192872;
 //BA.debugLineNum = 35192872;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
RDebugUtils.currentLine=35192874;
 //BA.debugLineNum = 35192874;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=35192875;
 //BA.debugLineNum = 35192875;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
 }
};
RDebugUtils.currentLine=35192877;
 //BA.debugLineNum = 35192877;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_eol.length()),_sb.getLength());
RDebugUtils.currentLine=35192878;
 //BA.debugLineNum = 35192878;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=35192879;
 //BA.debugLineNum = 35192879;BA.debugLine="End Sub";
return "";
}
public String  _generatestring(b4j.docU.crepsol __ref,anywheresoftware.b4a.objects.collections.List _table,String _separatorchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "generatestring", false))
	 {return ((String) Debug.delegate(ba, "generatestring", new Object[] {_table,_separatorchar}));}
String _eol = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String[] _row = null;
int _i = 0;
boolean _wrap = false;
String _word = "";
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Public Sub GenerateString (Table As List, Separato";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Dim eol As String = Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="If Table.Size = 0 Then Return \"\"";
if (_table.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=35127299;
 //BA.debugLineNum = 35127299;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35127300;
 //BA.debugLineNum = 35127300;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35127301;
 //BA.debugLineNum = 35127301;BA.debugLine="For Each row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group5 = _table;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (String[])(group5.Get(index5));
RDebugUtils.currentLine=35127302;
 //BA.debugLineNum = 35127302;BA.debugLine="For i = 0 To row.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_row.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=35127303;
 //BA.debugLineNum = 35127303;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
RDebugUtils.currentLine=35127304;
 //BA.debugLineNum = 35127304;BA.debugLine="Dim word As String = row(i)";
_word = _row[_i];
RDebugUtils.currentLine=35127305;
 //BA.debugLineNum = 35127305;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
RDebugUtils.currentLine=35127306;
 //BA.debugLineNum = 35127306;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
RDebugUtils.currentLine=35127307;
 //BA.debugLineNum = 35127307;BA.debugLine="Wrap = True";
_wrap = __c.True;
RDebugUtils.currentLine=35127308;
 //BA.debugLineNum = 35127308;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
RDebugUtils.currentLine=35127310;
 //BA.debugLineNum = 35127310;BA.debugLine="If Wrap Then";
if (_wrap) { 
RDebugUtils.currentLine=35127311;
 //BA.debugLineNum = 35127311;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
RDebugUtils.currentLine=35127313;
 //BA.debugLineNum = 35127313;BA.debugLine="sb.Append(word)";
_sb.Append(_word);
 };
RDebugUtils.currentLine=35127315;
 //BA.debugLineNum = 35127315;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
RDebugUtils.currentLine=35127317;
 //BA.debugLineNum = 35127317;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=35127318;
 //BA.debugLineNum = 35127318;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
 }
};
RDebugUtils.currentLine=35127320;
 //BA.debugLineNum = 35127320;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_eol.length()),_sb.getLength());
RDebugUtils.currentLine=35127321;
 //BA.debugLineNum = 35127321;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=35127322;
 //BA.debugLineNum = 35127322;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _inicializaciondatos(b4j.docU.crepsol __ref) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "inicializaciondatos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "inicializaciondatos", null));}
ResumableSub_InicializacionDatos rsub = new ResumableSub_InicializacionDatos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InicializacionDatos extends BA.ResumableSub {
public ResumableSub_InicializacionDatos(b4j.docU.crepsol parent,b4j.docU.crepsol __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
b4j.docU.main._tiporespuestajrdc _respuestajrdc = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
String _error = "";
anywheresoftware.b4a.objects.collections.Map _mdataconn = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="mCodigoNAVGRPRepsolEESS=\"07506\"";
__ref._mcodigonavgrprepsoleess /*String*/  = "07506";
RDebugUtils.currentLine=35586052;
 //BA.debugLineNum = 35586052;BA.debugLine="Dim RespuestaJRDC As TipoRespuestaJRDC";
_respuestajrdc = new b4j.docU.main._tiporespuestajrdc();
RDebugUtils.currentLine=35586053;
 //BA.debugLineNum = 35586053;BA.debugLine="RespuestaJRDC.Initialize";
_respuestajrdc.Initialize();
RDebugUtils.currentLine=35586059;
 //BA.debugLineNum = 35586059;BA.debugLine="wait for(CargaDireccionesEnvioRepsolEESSGRP) comp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "inicializaciondatos"), __ref._cargadireccionesenviorepsoleessgrp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35586060;
 //BA.debugLineNum = 35586060;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35586061;
 //BA.debugLineNum = 35586061;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=35586064;
 //BA.debugLineNum = 35586064;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
_error = BA.ObjectToString(_mres.Get((Object)("Error")));
RDebugUtils.currentLine=35586065;
 //BA.debugLineNum = 35586065;BA.debugLine="RespuestaJRDC.Accion=Accion";
_respuestajrdc.Accion /*String*/  = _accion;
RDebugUtils.currentLine=35586066;
 //BA.debugLineNum = 35586066;BA.debugLine="RespuestaJRDC.Error=Error";
_respuestajrdc.Error /*String*/  = _error;
RDebugUtils.currentLine=35586067;
 //BA.debugLineNum = 35586067;BA.debugLine="Return RespuestaJRDC";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuestajrdc));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=35586070;
 //BA.debugLineNum = 35586070;BA.debugLine="wait for(CargaTarifaVentaValidaActualGRPRepsolEES";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "inicializaciondatos"), __ref._cargatarifaventavalidaactualgrprepsoleess /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35586071;
 //BA.debugLineNum = 35586071;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35586072;
 //BA.debugLineNum = 35586072;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=35586076;
 //BA.debugLineNum = 35586076;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
_error = BA.ObjectToString(_mres.Get((Object)("Error")));
RDebugUtils.currentLine=35586077;
 //BA.debugLineNum = 35586077;BA.debugLine="RespuestaJRDC.Accion=Accion";
_respuestajrdc.Accion /*String*/  = _accion;
RDebugUtils.currentLine=35586078;
 //BA.debugLineNum = 35586078;BA.debugLine="RespuestaJRDC.Error=Error";
_respuestajrdc.Error /*String*/  = _error;
RDebugUtils.currentLine=35586079;
 //BA.debugLineNum = 35586079;BA.debugLine="Return RespuestaJRDC";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuestajrdc));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=35586084;
 //BA.debugLineNum = 35586084;BA.debugLine="wait for(CargaMapeoCodigosPrendaEESS) complete (m";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "inicializaciondatos"), __ref._cargamapeocodigosprendaeess /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 27;
return;
case 27:
//C
this.state = 9;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35586085;
 //BA.debugLineNum = 35586085;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35586086;
 //BA.debugLineNum = 35586086;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_accion).equals("NOK")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=35586090;
 //BA.debugLineNum = 35586090;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
_error = BA.ObjectToString(_mres.Get((Object)("Error")));
RDebugUtils.currentLine=35586091;
 //BA.debugLineNum = 35586091;BA.debugLine="RespuestaJRDC.Accion=Accion";
_respuestajrdc.Accion /*String*/  = _accion;
RDebugUtils.currentLine=35586092;
 //BA.debugLineNum = 35586092;BA.debugLine="RespuestaJRDC.Error=Error";
_respuestajrdc.Error /*String*/  = _error;
RDebugUtils.currentLine=35586093;
 //BA.debugLineNum = 35586093;BA.debugLine="Return RespuestaJRDC";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuestajrdc));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=35586096;
 //BA.debugLineNum = 35586096;BA.debugLine="wait for(CargaMapeoArticulosEESS) complete (mRes";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "inicializaciondatos"), __ref._cargamapeoarticuloseess /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 28;
return;
case 28:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35586097;
 //BA.debugLineNum = 35586097;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35586098;
 //BA.debugLineNum = 35586098;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_accion).equals("NOK")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=35586102;
 //BA.debugLineNum = 35586102;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
_error = BA.ObjectToString(_mres.Get((Object)("Error")));
RDebugUtils.currentLine=35586103;
 //BA.debugLineNum = 35586103;BA.debugLine="RespuestaJRDC.Accion=Accion";
_respuestajrdc.Accion /*String*/  = _accion;
RDebugUtils.currentLine=35586104;
 //BA.debugLineNum = 35586104;BA.debugLine="RespuestaJRDC.Error=Error";
_respuestajrdc.Error /*String*/  = _error;
RDebugUtils.currentLine=35586105;
 //BA.debugLineNum = 35586105;BA.debugLine="Return RespuestaJRDC";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuestajrdc));return;};
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=35586108;
 //BA.debugLineNum = 35586108;BA.debugLine="wait for(CargaTallasArticulosEESS) complete (mRes";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "inicializaciondatos"), __ref._cargatallasarticuloseess /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 29;
return;
case 29:
//C
this.state = 17;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35586110;
 //BA.debugLineNum = 35586110;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35586111;
 //BA.debugLineNum = 35586111;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 17:
//if
this.state = 20;
if ((_accion).equals("NOK")) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=35586115;
 //BA.debugLineNum = 35586115;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
_error = BA.ObjectToString(_mres.Get((Object)("Error")));
RDebugUtils.currentLine=35586116;
 //BA.debugLineNum = 35586116;BA.debugLine="RespuestaJRDC.Accion=Accion";
_respuestajrdc.Accion /*String*/  = _accion;
RDebugUtils.currentLine=35586117;
 //BA.debugLineNum = 35586117;BA.debugLine="RespuestaJRDC.Error=Error";
_respuestajrdc.Error /*String*/  = _error;
RDebugUtils.currentLine=35586118;
 //BA.debugLineNum = 35586118;BA.debugLine="Return RespuestaJRDC";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuestajrdc));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=35586121;
 //BA.debugLineNum = 35586121;BA.debugLine="Wait For(CargaDatosConnSFTP) complete (mRes As Ma";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "inicializaciondatos"), __ref._cargadatosconnsftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35586122;
 //BA.debugLineNum = 35586122;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35586123;
 //BA.debugLineNum = 35586123;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 21:
//if
this.state = 24;
if ((_accion).equals("NOK")) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=35586124;
 //BA.debugLineNum = 35586124;BA.debugLine="Dim Error As String=mRes.Get(\"Error\")";
_error = BA.ObjectToString(_mres.Get((Object)("Error")));
RDebugUtils.currentLine=35586125;
 //BA.debugLineNum = 35586125;BA.debugLine="RespuestaJRDC.Accion=Accion";
_respuestajrdc.Accion /*String*/  = _accion;
RDebugUtils.currentLine=35586126;
 //BA.debugLineNum = 35586126;BA.debugLine="RespuestaJRDC.Error=Error";
_respuestajrdc.Error /*String*/  = _error;
RDebugUtils.currentLine=35586127;
 //BA.debugLineNum = 35586127;BA.debugLine="Return RespuestaJRDC";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuestajrdc));return;};
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=35586129;
 //BA.debugLineNum = 35586129;BA.debugLine="Dim mDataConn As Map=mRes.Get(\"mDataConn\")";
_mdataconn = new anywheresoftware.b4a.objects.collections.Map();
_mdataconn = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mDataConn"))));
RDebugUtils.currentLine=35586130;
 //BA.debugLineNum = 35586130;BA.debugLine="Log(mDataConn)";
parent.__c.LogImpl("835586130",BA.ObjectToString(_mdataconn),0);
RDebugUtils.currentLine=35586132;
 //BA.debugLineNum = 35586132;BA.debugLine="sFtpRepsol.Initialize(\"sFtpRepsol\", mDataConn.Get";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .Initialize(ba,"sFtpRepsol",BA.ObjectToString(_mdataconn.Get((Object)("CampoString2"))),BA.ObjectToString(_mdataconn.Get((Object)("CampoString3"))),BA.ObjectToString(_mdataconn.Get((Object)("CampoString1"))),(int)(BA.ObjectToNumber(_mdataconn.Get((Object)("CampoInt1")))));
RDebugUtils.currentLine=35586133;
 //BA.debugLineNum = 35586133;BA.debugLine="FilesFoldersFtpRepsol=mDataConn.Get(\"CampoString4";
__ref._filesfoldersftprepsol /*String*/  = BA.ObjectToString(_mdataconn.Get((Object)("CampoString4")));
RDebugUtils.currentLine=35586134;
 //BA.debugLineNum = 35586134;BA.debugLine="ErrorFilesFoldersFtpRepsol=mDataConn.Get(\"CampoSt";
__ref._errorfilesfoldersftprepsol /*String*/  = BA.ObjectToString(_mdataconn.Get((Object)("CampoString5")));
RDebugUtils.currentLine=35586136;
 //BA.debugLineNum = 35586136;BA.debugLine="sFtpRepsol.SetKnownHostsStore(File.DirData(Main.N";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .SetKnownHostsStore(parent.__c.File.DirData(parent._main._nombreaplicacion /*String*/ ),"aJma.txt");
RDebugUtils.currentLine=35586139;
 //BA.debugLineNum = 35586139;BA.debugLine="RespuestaJRDC.Accion=\"OK\"";
_respuestajrdc.Accion /*String*/  = "OK";
RDebugUtils.currentLine=35586140;
 //BA.debugLineNum = 35586140;BA.debugLine="RespuestaJRDC.Error=\"\"";
_respuestajrdc.Error /*String*/  = "";
RDebugUtils.currentLine=35586141;
 //BA.debugLineNum = 35586141;BA.debugLine="Return RespuestaJRDC";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_respuestajrdc));return;};
RDebugUtils.currentLine=35586143;
 //BA.debugLineNum = 35586143;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _subirficheroacarpetaftp(b4j.docU.crepsol __ref,String _carpetaorigen,String _nombreficheroorigen,String _rutaficherodestino) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "subirficheroacarpetaftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "subirficheroacarpetaftp", new Object[] {_carpetaorigen,_nombreficheroorigen,_rutaficherodestino}));}
ResumableSub_SubirFicheroACarpetaFTP rsub = new ResumableSub_SubirFicheroACarpetaFTP(this,__ref,_carpetaorigen,_nombreficheroorigen,_rutaficherodestino);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SubirFicheroACarpetaFTP extends BA.ResumableSub {
public ResumableSub_SubirFicheroACarpetaFTP(b4j.docU.crepsol parent,b4j.docU.crepsol __ref,String _carpetaorigen,String _nombreficheroorigen,String _rutaficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._carpetaorigen = _carpetaorigen;
this._nombreficheroorigen = _nombreficheroorigen;
this._rutaficherodestino = _rutaficherodestino;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _carpetaorigen;
String _nombreficheroorigen;
String _rutaficherodestino;
String _serverpath = "";
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="sFtpRepsol.UploadFile(CarpetaOrigen, NombreFicher";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .UploadFile(ba,_carpetaorigen,_nombreficheroorigen,_rutaficherodestino);
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="Wait For sFtpRepsol_UploadCompleted (ServerPath A";
parent.__c.WaitFor("sftprepsol_uploadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "subirficheroacarpetaftp"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_serverpath = (String) result[1];
_success = (boolean) result[2];
;
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=33947653;
 //BA.debugLineNum = 33947653;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error subien";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Error subiendo fichero de errores de pedido "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheroorigen))+"\n"+""+parent.__c.SmartStringFormatter("",(Object)(parent.__c.LastException(ba).getMessage()))+""),"Error");
RDebugUtils.currentLine=33947655;
 //BA.debugLineNum = 33947655;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "subirficheroacarpetaftp"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=33947658;
 //BA.debugLineNum = 33947658;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=33947659;
 //BA.debugLineNum = 33947659;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _procesarfichero4(b4j.docU.crepsol __ref,String _carpetaficheroorigen,String _nombreficheroorigen,String _carpetadestinofichero,String _nombreficherodestino) throws Exception{
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "procesarfichero4", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "procesarfichero4", new Object[] {_carpetaficheroorigen,_nombreficheroorigen,_carpetadestinofichero,_nombreficherodestino}));}
ResumableSub_ProcesarFichero4 rsub = new ResumableSub_ProcesarFichero4(this,__ref,_carpetaficheroorigen,_nombreficheroorigen,_carpetadestinofichero,_nombreficherodestino);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ProcesarFichero4 extends BA.ResumableSub {
public ResumableSub_ProcesarFichero4(b4j.docU.crepsol parent,b4j.docU.crepsol __ref,String _carpetaficheroorigen,String _nombreficheroorigen,String _carpetadestinofichero,String _nombreficherodestino) {
this.parent = parent;
this.__ref = __ref;
this._carpetaficheroorigen = _carpetaficheroorigen;
this._nombreficheroorigen = _nombreficheroorigen;
this._carpetadestinofichero = _carpetadestinofichero;
this._nombreficherodestino = _nombreficherodestino;
this.__ref = parent;
}
b4j.docU.crepsol __ref;
b4j.docU.crepsol parent;
String _carpetaficheroorigen;
String _nombreficheroorigen;
String _carpetadestinofichero;
String _nombreficherodestino;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdataconn = null;
anywheresoftware.b4a.objects.collections.List _lstlineasfichero = null;
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _dniempleadosel = "";
int _idxfila = 0;
String _dateformatant = "";
String _slinea = "";
int _numcharlinea = 0;
Object[] _csvline = null;
String _numlinea = "";
int _tipolinea = 0;
String _lineanumeropedido = "";
String[] _arrlineanumeropedido = null;
String _numeropedido = "";
b4j.docU.crepsol._tipodatoslineapedidorepsol _datoslineapedido = null;
String _idsedeempresa = "";
String _numeropedidoestacion = "";
String _fechapedido = "";
long _fechapedidolong = 0L;
String _nombreestacion = "";
String _calle = "";
String _codigopostal = "";
String _poblacion = "";
String _codigoprovincia = "";
String _telefono = "";
String _stipoestacion = "";
String _tipoestacion = "";
String _marca = "";
String _dni = "";
boolean _dniempleadoselok = false;
String _nombreempleado = "";
String _scargo = "";
String _ssexoempleado = "";
String _sembarazoempleado = "";
String _codigoprenda = "";
int _nummapeocodigoprenda = 0;
String _talla = "";
int _cantidad = 0;
Object _senderfilter = null;
boolean _success = false;
int _numlineasconerror = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rssedepedidodni = null;
String _sede = "";
String _pedidosede = "";
boolean _errorlongitudlineacabeceraestacion = false;
boolean _errorsede = false;
boolean _errorfechapedido = false;
boolean _errormarca = false;
boolean _errorlongitudlineaempleado = false;
boolean _errordni = false;
boolean _errorcargo = false;
boolean _errorsexo = false;
boolean _errorembarazo = false;
boolean _errorlongitudlineaproducto = false;
boolean _errorcodigoprenda = false;
boolean _errorcodigoproductoerp = false;
boolean _errortalla = false;
boolean _errorcantidad = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rslineassedepedidodni = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbtextoerror = null;
anywheresoftware.b4a.objects.collections.List _lsterrores = null;
anywheresoftware.b4a.objects.collections.List _lstencabezadoserrores = null;
String _sficheroerrores = "";
String _nombreficheroerrores = "";
Object _msa = null;
String _rutaftpficheropedidoerrores = "";
int _numlineassinerror = 0;
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
String _carpetaficherocsv = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rscabecerapedidoslineassinerror = null;
String _uuidpedido = "";
String _idpedido = "";
String _nombreficherocsv = "";
anywheresoftware.b4a.objects.collections.List _lstlineaspedidoventa = null;
String _codigoclientenav = "";
String _codigodireccionenvionav = "";
String _codigopedido = "";
String _documentoexterno = "";
String _fechapedidocliente = "";
String _fechapedidoclientenav = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rslineaspedido = null;
double _precio = 0;
String[] _arrdatoslineapedido = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.BA.IterableList group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="crepsol";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando con";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando configuración FTP..."));
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="Wait For(CargaDatosConnSFTP) complete (mRes As Ma";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero4"), __ref._cargadatosconnsftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 389;
return;
case 389:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=35389446;
 //BA.debugLineNum = 35389446;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=35389450;
 //BA.debugLineNum = 35389450;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=35389452;
 //BA.debugLineNum = 35389452;BA.debugLine="Dim mDataConn As Map=mRes.Get(\"mDataConn\")";
_mdataconn = new anywheresoftware.b4a.objects.collections.Map();
_mdataconn = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mDataConn"))));
RDebugUtils.currentLine=35389455;
 //BA.debugLineNum = 35389455;BA.debugLine="sFtpRepsol.Initialize(\"sFtpRepsol\", mDataConn.Get";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .Initialize(ba,"sFtpRepsol",BA.ObjectToString(_mdataconn.Get((Object)("CampoString2"))),BA.ObjectToString(_mdataconn.Get((Object)("CampoString3"))),BA.ObjectToString(_mdataconn.Get((Object)("CampoString1"))),(int)(BA.ObjectToNumber(_mdataconn.Get((Object)("CampoInt1")))));
RDebugUtils.currentLine=35389456;
 //BA.debugLineNum = 35389456;BA.debugLine="FilesFoldersFtpRepsol=mDataConn.Get(\"CampoString4";
__ref._filesfoldersftprepsol /*String*/  = BA.ObjectToString(_mdataconn.Get((Object)("CampoString4")));
RDebugUtils.currentLine=35389457;
 //BA.debugLineNum = 35389457;BA.debugLine="ErrorFilesFoldersFtpRepsol=mDataConn.Get(\"CampoSt";
__ref._errorfilesfoldersftprepsol /*String*/  = BA.ObjectToString(_mdataconn.Get((Object)("CampoString5")));
RDebugUtils.currentLine=35389459;
 //BA.debugLineNum = 35389459;BA.debugLine="sFtpRepsol.SetKnownHostsStore(xui.DefaultFolder,";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .SetKnownHostsStore(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"aJma.txt");
RDebugUtils.currentLine=35389461;
 //BA.debugLineNum = 35389461;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolLineasFic";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolLineasFicheroPedido");
RDebugUtils.currentLine=35389462;
 //BA.debugLineNum = 35389462;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblRepsolErroresSe";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblRepsolErroresSedePedidoDNIFicheroPedido");
RDebugUtils.currentLine=35389464;
 //BA.debugLineNum = 35389464;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Procesando f";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Procesando fichero..."));
RDebugUtils.currentLine=35389465;
 //BA.debugLineNum = 35389465;BA.debugLine="jamLoadingIndicator1.IniciarControlTiempoProceso";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._iniciarcontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=35389466;
 //BA.debugLineNum = 35389466;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=35389468;
 //BA.debugLineNum = 35389468;BA.debugLine="Dim lstLineasFichero As List";
_lstlineasfichero = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35389469;
 //BA.debugLineNum = 35389469;BA.debugLine="lstLineasFichero.Initialize";
_lstlineasfichero.Initialize();
RDebugUtils.currentLine=35389473;
 //BA.debugLineNum = 35389473;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=35389475;
 //BA.debugLineNum = 35389475;BA.debugLine="tr.Initialize2(File.OpenInput(CarpetaFicheroOrige";
_tr.Initialize2((java.io.InputStream)(parent.__c.File.OpenInput(_carpetaficheroorigen,_nombreficheroorigen).getObject()),"UTF-8");
RDebugUtils.currentLine=35389476;
 //BA.debugLineNum = 35389476;BA.debugLine="lstLineasFichero=tr.ReadList";
_lstlineasfichero = _tr.ReadList();
RDebugUtils.currentLine=35389486;
 //BA.debugLineNum = 35389486;BA.debugLine="Dim DNIEmpleadoSel As String";
_dniempleadosel = "";
RDebugUtils.currentLine=35389488;
 //BA.debugLineNum = 35389488;BA.debugLine="Dim idxFila As Int=1";
_idxfila = (int) (1);
RDebugUtils.currentLine=35389490;
 //BA.debugLineNum = 35389490;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=35389491;
 //BA.debugLineNum = 35389491;BA.debugLine="DateTime.DateFormat=\"dd-MM-yyyy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yyyy");
RDebugUtils.currentLine=35389493;
 //BA.debugLineNum = 35389493;BA.debugLine="For Each sLinea As String In lstLineasFichero";
if (true) break;

case 5:
//for
this.state = 162;
group29 = _lstlineasfichero;
index29 = 0;
groupLen29 = group29.getSize();
this.state = 390;
if (true) break;

case 390:
//C
this.state = 162;
if (index29 < groupLen29) {
this.state = 7;
_slinea = BA.ObjectToString(group29.Get(index29));}
if (true) break;

case 391:
//C
this.state = 390;
index29++;
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=35389498;
 //BA.debugLineNum = 35389498;BA.debugLine="Dim NumCharLinea As Int=sLinea.Length";
_numcharlinea = _slinea.length();
RDebugUtils.currentLine=35389500;
 //BA.debugLineNum = 35389500;BA.debugLine="Dim csvLine(20) As Object";
_csvline = new Object[(int) (20)];
{
int d0 = _csvline.length;
for (int i0 = 0;i0 < d0;i0++) {
_csvline[i0] = new Object();
}
}
;
RDebugUtils.currentLine=35389502;
 //BA.debugLineNum = 35389502;BA.debugLine="If NumCharLinea<6 Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_numcharlinea<6) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=35389504;
 //BA.debugLineNum = 35389504;BA.debugLine="mSQL.AddNonQueryToBatch($\"insert into tblRepsol";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(("insert into tblRepsolLineasFicheroPedido (IDxFila, LineaConError) values (?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_idxfila),(Object)(1)}));
RDebugUtils.currentLine=35389505;
 //BA.debugLineNum = 35389505;BA.debugLine="Continue";
this.state = 391;
if (true) break;;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=35389507;
 //BA.debugLineNum = 35389507;BA.debugLine="Dim NumLinea As String=sLinea.SubString2(0,6)";
_numlinea = _slinea.substring((int) (0),(int) (6));
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=35389512;
 //BA.debugLineNum = 35389512;BA.debugLine="csvLine(0)=NumLinea";
_csvline[(int) (0)] = (Object)(_numlinea);
RDebugUtils.currentLine=35389514;
 //BA.debugLineNum = 35389514;BA.debugLine="Dim TipoLinea As Int=sLinea.SubString2(6,7)";
_tipolinea = (int)(Double.parseDouble(_slinea.substring((int) (6),(int) (7))));
RDebugUtils.currentLine=35389515;
 //BA.debugLineNum = 35389515;BA.debugLine="csvLine(2)=TipoLinea";
_csvline[(int) (2)] = (Object)(_tipolinea);
RDebugUtils.currentLine=35389517;
 //BA.debugLineNum = 35389517;BA.debugLine="Select Case TipoLinea";
if (true) break;

case 14:
//select
this.state = 161;
switch (_tipolinea) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
case 3: {
this.state = 75;
if (true) break;
}
case 9: {
this.state = 158;
if (true) break;
}
default: {
this.state = 160;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 161;
RDebugUtils.currentLine=35389520;
 //BA.debugLineNum = 35389520;BA.debugLine="Dim LineaNumeroPedido As String=sLinea.SubStri";
_lineanumeropedido = _slinea.substring((int) (7));
RDebugUtils.currentLine=35389521;
 //BA.debugLineNum = 35389521;BA.debugLine="Dim ArrLineaNumeroPedido() As String=Regex.Spl";
_arrlineanumeropedido = parent.__c.Regex.Split(".TXT",_lineanumeropedido);
RDebugUtils.currentLine=35389522;
 //BA.debugLineNum = 35389522;BA.debugLine="Dim NumeroPedido As String=ArrLineaNumeroPedid";
_numeropedido = _arrlineanumeropedido[(int) (0)];
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=35389525;
 //BA.debugLineNum = 35389525;BA.debugLine="Dim DatosLineaPedido As TipoDatosLineaPedidoRe";
_datoslineapedido = new b4j.docU.crepsol._tipodatoslineapedidorepsol();
RDebugUtils.currentLine=35389526;
 //BA.debugLineNum = 35389526;BA.debugLine="DatosLineaPedido.Initialize";
_datoslineapedido.Initialize();
RDebugUtils.currentLine=35389527;
 //BA.debugLineNum = 35389527;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
_datoslineapedido.Linea /*String*/  = _numlinea;
RDebugUtils.currentLine=35389530;
 //BA.debugLineNum = 35389530;BA.debugLine="If NumCharLinea<>236 Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_numcharlinea!=236) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=35389533;
 //BA.debugLineNum = 35389533;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaCabeceraEs";
_datoslineapedido.ErrorLongitudLineaCabeceraEstacion /*int*/  = (int) (1);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=35389538;
 //BA.debugLineNum = 35389538;BA.debugLine="Dim IDSedeEmpresa As String=sLinea.SubString2";
_idsedeempresa = _slinea.substring((int) (7),(int) (15));
RDebugUtils.currentLine=35389539;
 //BA.debugLineNum = 35389539;BA.debugLine="DatosLineaPedido.Sede=IDSedeEmpresa";
_datoslineapedido.Sede /*String*/  = _idsedeempresa;
RDebugUtils.currentLine=35389540;
 //BA.debugLineNum = 35389540;BA.debugLine="DatosLineaPedido.CodigoClienteERP=Utilidades.";
_datoslineapedido.CodigoClienteERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select CodigoClienteNAV from tblRepsolMapeoSedesEESS where Sede=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Sede /*String*/ )}))));
RDebugUtils.currentLine=35389541;
 //BA.debugLineNum = 35389541;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
_datoslineapedido.ErrorSede /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.CodigoClienteERP /*String*/ ).equals("")) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35389542;
 //BA.debugLineNum = 35389542;BA.debugLine="DatosLineaPedido.CodigoDireccionEnvioERP=Util";
_datoslineapedido.CodigoDireccionEnvioERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select CodigoDireccionEnvioNAV from tblRepsolMapeoSedesEESS where Sede=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Sede /*String*/ )}))));
RDebugUtils.currentLine=35389543;
 //BA.debugLineNum = 35389543;BA.debugLine="DatosLineaPedido.ErrorSede=IIf(DatosLineaPedi";
_datoslineapedido.ErrorSede /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.CodigoDireccionEnvioERP /*String*/ ).equals("")) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35389545;
 //BA.debugLineNum = 35389545;BA.debugLine="Dim NumeroPedidoEstacion As String=sLinea.Sub";
_numeropedidoestacion = _slinea.substring((int) (15),(int) (19));
RDebugUtils.currentLine=35389546;
 //BA.debugLineNum = 35389546;BA.debugLine="DatosLineaPedido.CodigoPedido=NumeroPedidoEst";
_datoslineapedido.CodigoPedido /*String*/  = _numeropedidoestacion;
RDebugUtils.currentLine=35389548;
 //BA.debugLineNum = 35389548;BA.debugLine="Dim FechaPedido As String=sLinea.SubString2(1";
_fechapedido = _slinea.substring((int) (19),(int) (29));
RDebugUtils.currentLine=35389549;
 //BA.debugLineNum = 35389549;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 28;
this.catchState = 27;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 28;
this.catchState = 27;
RDebugUtils.currentLine=35389550;
 //BA.debugLineNum = 35389550;BA.debugLine="Dim FechaPedidoLong As Long=DateTime.DatePar";
_fechapedidolong = parent.__c.DateTime.DateParse(_fechapedido);
RDebugUtils.currentLine=35389551;
 //BA.debugLineNum = 35389551;BA.debugLine="DatosLineaPedido.FechaPedido=FechaPedido";
_datoslineapedido.FechaPedido /*String*/  = _fechapedido;
RDebugUtils.currentLine=35389552;
 //BA.debugLineNum = 35389552;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=0";
_datoslineapedido.ErrorFechaPedido /*int*/  = (int) (0);
 if (true) break;

case 27:
//C
this.state = 28;
this.catchState = 0;
RDebugUtils.currentLine=35389556;
 //BA.debugLineNum = 35389556;BA.debugLine="DatosLineaPedido.ErrorFechaPedido=1";
_datoslineapedido.ErrorFechaPedido /*int*/  = (int) (1);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
this.catchState = 0;
;
RDebugUtils.currentLine=35389560;
 //BA.debugLineNum = 35389560;BA.debugLine="Dim NombreEstacion As String=sLinea.SubString";
_nombreestacion = _slinea.substring((int) (29),(int) (94));
RDebugUtils.currentLine=35389561;
 //BA.debugLineNum = 35389561;BA.debugLine="DatosLineaPedido.NombreEstacion=NombreEstacio";
_datoslineapedido.NombreEstacion /*String*/  = _nombreestacion;
RDebugUtils.currentLine=35389563;
 //BA.debugLineNum = 35389563;BA.debugLine="Dim Calle As String=sLinea.SubString2(94,159)";
_calle = _slinea.substring((int) (94),(int) (159));
RDebugUtils.currentLine=35389564;
 //BA.debugLineNum = 35389564;BA.debugLine="DatosLineaPedido.Calle=Calle";
_datoslineapedido.Calle /*String*/  = _calle;
RDebugUtils.currentLine=35389566;
 //BA.debugLineNum = 35389566;BA.debugLine="Dim CodigoPostal As String=sLinea.SubString2(";
_codigopostal = _slinea.substring((int) (159),(int) (164));
RDebugUtils.currentLine=35389567;
 //BA.debugLineNum = 35389567;BA.debugLine="DatosLineaPedido.CodigoPostal=CodigoPostal";
_datoslineapedido.CodigoPostal /*String*/  = _codigopostal;
RDebugUtils.currentLine=35389569;
 //BA.debugLineNum = 35389569;BA.debugLine="Dim Poblacion As String=sLinea.SubString2(164";
_poblacion = _slinea.substring((int) (164),(int) (194));
RDebugUtils.currentLine=35389570;
 //BA.debugLineNum = 35389570;BA.debugLine="DatosLineaPedido.Poblacion=Poblacion";
_datoslineapedido.Poblacion /*String*/  = _poblacion;
RDebugUtils.currentLine=35389572;
 //BA.debugLineNum = 35389572;BA.debugLine="Dim CodigoProvincia As String=sLinea.SubStrin";
_codigoprovincia = _slinea.substring((int) (194),(int) (196));
RDebugUtils.currentLine=35389573;
 //BA.debugLineNum = 35389573;BA.debugLine="DatosLineaPedido.CodigoProvincia=CodigoProvin";
_datoslineapedido.CodigoProvincia /*String*/  = _codigoprovincia;
RDebugUtils.currentLine=35389575;
 //BA.debugLineNum = 35389575;BA.debugLine="Dim Telefono As String=sLinea.SubString2(196,";
_telefono = _slinea.substring((int) (196),(int) (211));
RDebugUtils.currentLine=35389576;
 //BA.debugLineNum = 35389576;BA.debugLine="DatosLineaPedido.Telefono=Telefono";
_datoslineapedido.Telefono /*String*/  = _telefono;
RDebugUtils.currentLine=35389578;
 //BA.debugLineNum = 35389578;BA.debugLine="Dim sTipoEstacion As String=sLinea.SubString2";
_stipoestacion = _slinea.substring((int) (211),(int) (226));
RDebugUtils.currentLine=35389579;
 //BA.debugLineNum = 35389579;BA.debugLine="Dim TipoEstacion As String=sTipoEstacion";
_tipoestacion = _stipoestacion;
RDebugUtils.currentLine=35389589;
 //BA.debugLineNum = 35389589;BA.debugLine="DatosLineaPedido.TipoEstacion=TipoEstacion";
_datoslineapedido.TipoEstacion /*String*/  = _tipoestacion;
RDebugUtils.currentLine=35389592;
 //BA.debugLineNum = 35389592;BA.debugLine="Try";
if (true) break;

case 29:
//try
this.state = 34;
this.catchState = 33;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 34;
this.catchState = 33;
RDebugUtils.currentLine=35389593;
 //BA.debugLineNum = 35389593;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,236";
_marca = _slinea.substring((int) (226),(int) (236)).trim().toUpperCase();
 if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
RDebugUtils.currentLine=35389595;
 //BA.debugLineNum = 35389595;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835389595",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=35389596;
 //BA.debugLineNum = 35389596;BA.debugLine="Dim Marca As String=sLinea.SubString2(226,Num";
_marca = _slinea.substring((int) (226),_numcharlinea).trim().toUpperCase();
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=35389599;
 //BA.debugLineNum = 35389599;BA.debugLine="If Not(Marca=\"REPSOL\" Or Marca=\"CAMPSA\" Or Ma";

case 34:
//if
this.state = 39;
this.catchState = 0;
if (parent.__c.Not((_marca).equals("REPSOL") || (_marca).equals("CAMPSA") || (_marca).equals("PETRONOR"))) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
RDebugUtils.currentLine=35389600;
 //BA.debugLineNum = 35389600;BA.debugLine="DatosLineaPedido.ErrorMarca=1";
_datoslineapedido.ErrorMarca /*int*/  = (int) (1);
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=35389603;
 //BA.debugLineNum = 35389603;BA.debugLine="DatosLineaPedido.Marca=Marca";
_datoslineapedido.Marca /*String*/  = _marca;
 if (true) break;

case 39:
//C
this.state = 161;
;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=35389608;
 //BA.debugLineNum = 35389608;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
_datoslineapedido.Linea /*String*/  = _numlinea;
RDebugUtils.currentLine=35389611;
 //BA.debugLineNum = 35389611;BA.debugLine="If NumCharLinea<>141 Then";
if (true) break;

case 42:
//if
this.state = 45;
if (_numcharlinea!=141) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=35389613;
 //BA.debugLineNum = 35389613;BA.debugLine="DatosLineaPedido.ErrorLongitudLineaEmpleado=1";
_datoslineapedido.ErrorLongitudLineaEmpleado /*int*/  = (int) (1);
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=35389618;
 //BA.debugLineNum = 35389618;BA.debugLine="Dim DNI As String=sLinea.SubString2(29,38)   '";
_dni = _slinea.substring((int) (29),(int) (38));
RDebugUtils.currentLine=35389622;
 //BA.debugLineNum = 35389622;BA.debugLine="If DNIEmpleadoSel<>DNI Then";
if (true) break;

case 46:
//if
this.state = 73;
if ((_dniempleadosel).equals(_dni) == false) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=35389623;
 //BA.debugLineNum = 35389623;BA.debugLine="DNIEmpleadoSel=DNI";
_dniempleadosel = _dni;
RDebugUtils.currentLine=35389625;
 //BA.debugLineNum = 35389625;BA.debugLine="DatosLineaPedido.DNI=\"\"";
_datoslineapedido.DNI /*String*/  = "";
RDebugUtils.currentLine=35389626;
 //BA.debugLineNum = 35389626;BA.debugLine="DatosLineaPedido.ErrorDNI=0";
_datoslineapedido.ErrorDNI /*int*/  = (int) (0);
RDebugUtils.currentLine=35389627;
 //BA.debugLineNum = 35389627;BA.debugLine="DatosLineaPedido.NombreEmpleado=\"\"";
_datoslineapedido.NombreEmpleado /*String*/  = "";
RDebugUtils.currentLine=35389628;
 //BA.debugLineNum = 35389628;BA.debugLine="DatosLineaPedido.Cargo=\"\"";
_datoslineapedido.Cargo /*String*/  = "";
RDebugUtils.currentLine=35389629;
 //BA.debugLineNum = 35389629;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
_datoslineapedido.ErrorCargo /*int*/  = (int) (0);
RDebugUtils.currentLine=35389630;
 //BA.debugLineNum = 35389630;BA.debugLine="DatosLineaPedido.Sexo=\"\"";
_datoslineapedido.Sexo /*String*/  = "";
RDebugUtils.currentLine=35389631;
 //BA.debugLineNum = 35389631;BA.debugLine="DatosLineaPedido.errorSexo=0";
_datoslineapedido.ErrorSexo /*int*/  = (int) (0);
RDebugUtils.currentLine=35389632;
 //BA.debugLineNum = 35389632;BA.debugLine="DatosLineaPedido.Embarazo=\"\"";
_datoslineapedido.Embarazo /*String*/  = "";
RDebugUtils.currentLine=35389633;
 //BA.debugLineNum = 35389633;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
_datoslineapedido.ErrorEmbarazo /*int*/  = (int) (0);
RDebugUtils.currentLine=35389636;
 //BA.debugLineNum = 35389636;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
_datoslineapedido.CodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35389637;
 //BA.debugLineNum = 35389637;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
_datoslineapedido.DescripcionCodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35389638;
 //BA.debugLineNum = 35389638;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int) (0);
RDebugUtils.currentLine=35389639;
 //BA.debugLineNum = 35389639;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
_datoslineapedido.CodigoProductoERP /*String*/  = "";
RDebugUtils.currentLine=35389640;
 //BA.debugLineNum = 35389640;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
_datoslineapedido.ErrorCodigoProductoERP /*int*/  = (int) (0);
RDebugUtils.currentLine=35389641;
 //BA.debugLineNum = 35389641;BA.debugLine="DatosLineaPedido.Talla=\"\"";
_datoslineapedido.Talla /*String*/  = "";
RDebugUtils.currentLine=35389642;
 //BA.debugLineNum = 35389642;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
_datoslineapedido.TallaERP /*String*/  = "";
RDebugUtils.currentLine=35389643;
 //BA.debugLineNum = 35389643;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
_datoslineapedido.ErrorTalla /*int*/  = (int) (0);
RDebugUtils.currentLine=35389644;
 //BA.debugLineNum = 35389644;BA.debugLine="DatosLineaPedido.Cantidad=0";
_datoslineapedido.Cantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35389645;
 //BA.debugLineNum = 35389645;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
_datoslineapedido.ErrorCantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35389647;
 //BA.debugLineNum = 35389647;BA.debugLine="DatosLineaPedido.DNI=DNIEmpleadoSel";
_datoslineapedido.DNI /*String*/  = _dniempleadosel;
RDebugUtils.currentLine=35389648;
 //BA.debugLineNum = 35389648;BA.debugLine="Dim DNIEmpleadoSelOK As Boolean=checkDNI(DNIE";
_dniempleadoselok = BA.ObjectToBoolean(__ref._checkdni /*String*/ (null,_dniempleadosel));
RDebugUtils.currentLine=35389649;
 //BA.debugLineNum = 35389649;BA.debugLine="If Not(DNIEmpleadoSelOK) Then DatosLineaPedid";
if (true) break;

case 49:
//if
this.state = 54;
if (parent.__c.Not(_dniempleadoselok)) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_datoslineapedido.ErrorDNI /*int*/  = (int) (1);
if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=35389652;
 //BA.debugLineNum = 35389652;BA.debugLine="Dim NombreEmpleado As String=sLinea.SubStrin";
_nombreempleado = _slinea.substring((int) (38),(int) (138));
RDebugUtils.currentLine=35389653;
 //BA.debugLineNum = 35389653;BA.debugLine="DatosLineaPedido.NombreEmpleado=NombreEmplea";
_datoslineapedido.NombreEmpleado /*String*/  = _nombreempleado;
RDebugUtils.currentLine=35389654;
 //BA.debugLineNum = 35389654;BA.debugLine="Dim sCargo As String=sLinea.SubString2(138,1";
_scargo = _slinea.substring((int) (138),(int) (139));
RDebugUtils.currentLine=35389664;
 //BA.debugLineNum = 35389664;BA.debugLine="DatosLineaPedido.Cargo=sCargo";
_datoslineapedido.Cargo /*String*/  = _scargo;
RDebugUtils.currentLine=35389665;
 //BA.debugLineNum = 35389665;BA.debugLine="If Not(sCargo=\"G\" Or sCargo=\"E\" Or sCargo=\"V";
if (true) break;

case 55:
//if
this.state = 60;
if (parent.__c.Not((_scargo).equals("G") || (_scargo).equals("E") || (_scargo).equals("V"))) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
RDebugUtils.currentLine=35389666;
 //BA.debugLineNum = 35389666;BA.debugLine="DatosLineaPedido.ErrorCargo=1";
_datoslineapedido.ErrorCargo /*int*/  = (int) (1);
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=35389669;
 //BA.debugLineNum = 35389669;BA.debugLine="DatosLineaPedido.ErrorCargo=0";
_datoslineapedido.ErrorCargo /*int*/  = (int) (0);
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=35389673;
 //BA.debugLineNum = 35389673;BA.debugLine="Dim sSexoEmpleado As String=sLinea.SubString";
_ssexoempleado = _slinea.substring((int) (139),(int) (140));
RDebugUtils.currentLine=35389681;
 //BA.debugLineNum = 35389681;BA.debugLine="DatosLineaPedido.Sexo=sSexoEmpleado";
_datoslineapedido.Sexo /*String*/  = _ssexoempleado;
RDebugUtils.currentLine=35389682;
 //BA.debugLineNum = 35389682;BA.debugLine="If Not(sSexoEmpleado=\"H\" Or sSexoEmpleado=\"M";
if (true) break;

case 61:
//if
this.state = 66;
if (parent.__c.Not((_ssexoempleado).equals("H") || (_ssexoempleado).equals("M"))) { 
this.state = 63;
}else {
this.state = 65;
}if (true) break;

case 63:
//C
this.state = 66;
RDebugUtils.currentLine=35389683;
 //BA.debugLineNum = 35389683;BA.debugLine="DatosLineaPedido.ErrorSexo=1";
_datoslineapedido.ErrorSexo /*int*/  = (int) (1);
 if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=35389687;
 //BA.debugLineNum = 35389687;BA.debugLine="DatosLineaPedido.ErrorSexo=0";
_datoslineapedido.ErrorSexo /*int*/  = (int) (0);
 if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=35389690;
 //BA.debugLineNum = 35389690;BA.debugLine="Dim sEmbarazoEmpleado As String=sLinea.SubSt";
_sembarazoempleado = _slinea.substring((int) (140),(int) (141));
RDebugUtils.currentLine=35389699;
 //BA.debugLineNum = 35389699;BA.debugLine="DatosLineaPedido.Embarazo=sEmbarazoEmpleado";
_datoslineapedido.Embarazo /*String*/  = _sembarazoempleado;
RDebugUtils.currentLine=35389700;
 //BA.debugLineNum = 35389700;BA.debugLine="If Not(sEmbarazoEmpleado=\"S\" Or sEmbarazoEmp";
if (true) break;

case 67:
//if
this.state = 72;
if (parent.__c.Not((_sembarazoempleado).equals("S") || (_sembarazoempleado).equals("N"))) { 
this.state = 69;
}else {
this.state = 71;
}if (true) break;

case 69:
//C
this.state = 72;
RDebugUtils.currentLine=35389701;
 //BA.debugLineNum = 35389701;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=1";
_datoslineapedido.ErrorEmbarazo /*int*/  = (int) (1);
 if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=35389705;
 //BA.debugLineNum = 35389705;BA.debugLine="DatosLineaPedido.ErrorEmbarazo=0";
_datoslineapedido.ErrorEmbarazo /*int*/  = (int) (0);
 if (true) break;

case 72:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 161;
;
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=35389714;
 //BA.debugLineNum = 35389714;BA.debugLine="DatosLineaPedido.Linea=NumLinea";
_datoslineapedido.Linea /*String*/  = _numlinea;
RDebugUtils.currentLine=35389717;
 //BA.debugLineNum = 35389717;BA.debugLine="DatosLineaPedido.CodigoPrenda=\"\"";
_datoslineapedido.CodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35389718;
 //BA.debugLineNum = 35389718;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=\"\"";
_datoslineapedido.DescripcionCodigoPrenda /*String*/  = "";
RDebugUtils.currentLine=35389719;
 //BA.debugLineNum = 35389719;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=0";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int) (0);
RDebugUtils.currentLine=35389720;
 //BA.debugLineNum = 35389720;BA.debugLine="DatosLineaPedido.CodigoProductoERP=\"\"";
_datoslineapedido.CodigoProductoERP /*String*/  = "";
RDebugUtils.currentLine=35389721;
 //BA.debugLineNum = 35389721;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=0";
_datoslineapedido.ErrorCodigoProductoERP /*int*/  = (int) (0);
RDebugUtils.currentLine=35389722;
 //BA.debugLineNum = 35389722;BA.debugLine="DatosLineaPedido.Talla=\"\"";
_datoslineapedido.Talla /*String*/  = "";
RDebugUtils.currentLine=35389723;
 //BA.debugLineNum = 35389723;BA.debugLine="DatosLineaPedido.TallaERP=\"\"";
_datoslineapedido.TallaERP /*String*/  = "";
RDebugUtils.currentLine=35389724;
 //BA.debugLineNum = 35389724;BA.debugLine="DatosLineaPedido.ErrorTalla=0";
_datoslineapedido.ErrorTalla /*int*/  = (int) (0);
RDebugUtils.currentLine=35389725;
 //BA.debugLineNum = 35389725;BA.debugLine="DatosLineaPedido.Cantidad=0";
_datoslineapedido.Cantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35389726;
 //BA.debugLineNum = 35389726;BA.debugLine="DatosLineaPedido.ErrorCantidad=0";
_datoslineapedido.ErrorCantidad /*int*/  = (int) (0);
RDebugUtils.currentLine=35389727;
 //BA.debugLineNum = 35389727;BA.debugLine="Try";
if (true) break;

case 76:
//try
this.state = 81;
this.catchState = 80;
this.state = 78;
if (true) break;

case 78:
//C
this.state = 81;
this.catchState = 80;
RDebugUtils.currentLine=35389728;
 //BA.debugLineNum = 35389728;BA.debugLine="Dim CodigoPrenda As String=sLinea.SubString2(";
_codigoprenda = _slinea.substring((int) (38),(int) (40));
RDebugUtils.currentLine=35389732;
 //BA.debugLineNum = 35389732;BA.debugLine="DatosLineaPedido.CodigoPrenda=CodigoPrenda";
_datoslineapedido.CodigoPrenda /*String*/  = _codigoprenda;
RDebugUtils.currentLine=35389733;
 //BA.debugLineNum = 35389733;BA.debugLine="Dim NumMapeoCodigoPrenda As Int=Utilidades.Fi";
_nummapeocodigoprenda = (int)(Double.parseDouble(parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_datoslineapedido.CodigoPrenda /*String*/ }))))));
RDebugUtils.currentLine=35389735;
 //BA.debugLineNum = 35389735;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=IIf(NumMap";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int)(BA.ObjectToNumber(((_nummapeocodigoprenda==0) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35389736;
 //BA.debugLineNum = 35389736;BA.debugLine="DatosLineaPedido.DescripcionCodigoPrenda=Util";
_datoslineapedido.DescripcionCodigoPrenda /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select NombreCodigoPrenda from tblRepsolMapeoCodigosPrendaEESS where CodigoPrenda=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_datoslineapedido.CodigoPrenda /*String*/ }))));
 if (true) break;

case 80:
//C
this.state = 81;
this.catchState = 0;
RDebugUtils.currentLine=35389739;
 //BA.debugLineNum = 35389739;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835389739",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=35389740;
 //BA.debugLineNum = 35389740;BA.debugLine="DatosLineaPedido.ErrorCodigoPrenda=1";
_datoslineapedido.ErrorCodigoPrenda /*int*/  = (int) (1);
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
this.catchState = 0;
;
RDebugUtils.currentLine=35389743;
 //BA.debugLineNum = 35389743;BA.debugLine="DatosLineaPedido.CodigoProductoERP=Utilidade";
_datoslineapedido.CodigoProductoERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select CodigoArticuloNAV from tblRepsolMapeoArticulosEESS where Marca=? and Cargo=? and Sexo=? and CodigoPrenda=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Marca /*String*/ ),(Object)(_datoslineapedido.Cargo /*String*/ ),(Object)(_datoslineapedido.Sexo /*String*/ ),(Object)(_datoslineapedido.CodigoPrenda /*String*/ )}))));
RDebugUtils.currentLine=35389747;
 //BA.debugLineNum = 35389747;BA.debugLine="DatosLineaPedido.ErrorCodigoProductoERP=IIf(D";
_datoslineapedido.ErrorCodigoProductoERP /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.CodigoProductoERP /*String*/ ).equals("")) ? ((Object)(1)) : ((Object)(0)))));
RDebugUtils.currentLine=35389749;
 //BA.debugLineNum = 35389749;BA.debugLine="Dim Talla As String=sLinea.SubString2(40,44).";
_talla = _slinea.substring((int) (40),(int) (44)).trim();
RDebugUtils.currentLine=35389750;
 //BA.debugLineNum = 35389750;BA.debugLine="DatosLineaPedido.Talla=Talla";
_datoslineapedido.Talla /*String*/  = _talla;
RDebugUtils.currentLine=35389751;
 //BA.debugLineNum = 35389751;BA.debugLine="DatosLineaPedido.TallaERP=Utilidades.FixNull(";
_datoslineapedido.TallaERP /*String*/  = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select Talla from tblRepsolTallasArticulosEESS where Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_datoslineapedido.CodigoProductoERP /*String*/ ,_datoslineapedido.Talla /*String*/ }))));
RDebugUtils.currentLine=35389754;
 //BA.debugLineNum = 35389754;BA.debugLine="DatosLineaPedido.ErrorTalla=IIf(DatosLineaPed";
_datoslineapedido.ErrorTalla /*int*/  = (int)(BA.ObjectToNumber((((_datoslineapedido.TallaERP /*String*/ ).equals(_datoslineapedido.Talla /*String*/ )) ? ((Object)(0)) : ((Object)(1)))));
RDebugUtils.currentLine=35389757;
 //BA.debugLineNum = 35389757;BA.debugLine="Try";
if (true) break;

case 82:
//try
this.state = 87;
this.catchState = 86;
this.state = 84;
if (true) break;

case 84:
//C
this.state = 87;
this.catchState = 86;
RDebugUtils.currentLine=35389758;
 //BA.debugLineNum = 35389758;BA.debugLine="Dim Cantidad As Int=sLinea.SubString2(44,45)";
_cantidad = (int)(Double.parseDouble(_slinea.substring((int) (44),(int) (45))));
RDebugUtils.currentLine=35389759;
 //BA.debugLineNum = 35389759;BA.debugLine="DatosLineaPedido.Cantidad=Cantidad";
_datoslineapedido.Cantidad /*int*/  = _cantidad;
 if (true) break;

case 86:
//C
this.state = 87;
this.catchState = 0;
RDebugUtils.currentLine=35389761;
 //BA.debugLineNum = 35389761;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835389761",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=35389762;
 //BA.debugLineNum = 35389762;BA.debugLine="DatosLineaPedido.ErrorCantidad=1";
_datoslineapedido.ErrorCantidad /*int*/  = (int) (1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=35389767;
 //BA.debugLineNum = 35389767;BA.debugLine="If DatosLineaPedido.ErrorSede=1 Then DatosLine";

case 87:
//if
this.state = 92;
this.catchState = 0;
if (_datoslineapedido.ErrorSede /*int*/ ==1) { 
this.state = 89;
;}if (true) break;

case 89:
//C
this.state = 92;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 92:
//C
this.state = 93;
;
RDebugUtils.currentLine=35389768;
 //BA.debugLineNum = 35389768;BA.debugLine="If DatosLineaPedido.ErrorFechaPedido=1 Then Da";
if (true) break;

case 93:
//if
this.state = 98;
if (_datoslineapedido.ErrorFechaPedido /*int*/ ==1) { 
this.state = 95;
;}if (true) break;

case 95:
//C
this.state = 98;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 98:
//C
this.state = 99;
;
RDebugUtils.currentLine=35389769;
 //BA.debugLineNum = 35389769;BA.debugLine="If DatosLineaPedido.ErrorMarca=1 Then DatosLin";
if (true) break;

case 99:
//if
this.state = 104;
if (_datoslineapedido.ErrorMarca /*int*/ ==1) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 104:
//C
this.state = 105;
;
RDebugUtils.currentLine=35389770;
 //BA.debugLineNum = 35389770;BA.debugLine="If DatosLineaPedido.ErrorDNI=1 Then DatosLinea";
if (true) break;

case 105:
//if
this.state = 110;
if (_datoslineapedido.ErrorDNI /*int*/ ==1) { 
this.state = 107;
;}if (true) break;

case 107:
//C
this.state = 110;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 110:
//C
this.state = 111;
;
RDebugUtils.currentLine=35389771;
 //BA.debugLineNum = 35389771;BA.debugLine="If DatosLineaPedido.ErrorCargo=1 Then DatosLin";
if (true) break;

case 111:
//if
this.state = 116;
if (_datoslineapedido.ErrorCargo /*int*/ ==1) { 
this.state = 113;
;}if (true) break;

case 113:
//C
this.state = 116;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 116:
//C
this.state = 117;
;
RDebugUtils.currentLine=35389772;
 //BA.debugLineNum = 35389772;BA.debugLine="If DatosLineaPedido.ErrorSexo=1 Then DatosLine";
if (true) break;

case 117:
//if
this.state = 122;
if (_datoslineapedido.ErrorSexo /*int*/ ==1) { 
this.state = 119;
;}if (true) break;

case 119:
//C
this.state = 122;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 122:
//C
this.state = 123;
;
RDebugUtils.currentLine=35389773;
 //BA.debugLineNum = 35389773;BA.debugLine="If DatosLineaPedido.ErrorEmbarazo=1 Then Datos";
if (true) break;

case 123:
//if
this.state = 128;
if (_datoslineapedido.ErrorEmbarazo /*int*/ ==1) { 
this.state = 125;
;}if (true) break;

case 125:
//C
this.state = 128;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 128:
//C
this.state = 129;
;
RDebugUtils.currentLine=35389774;
 //BA.debugLineNum = 35389774;BA.debugLine="If DatosLineaPedido.ErrorCodigoPrenda=1 Then D";
if (true) break;

case 129:
//if
this.state = 134;
if (_datoslineapedido.ErrorCodigoPrenda /*int*/ ==1) { 
this.state = 131;
;}if (true) break;

case 131:
//C
this.state = 134;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 134:
//C
this.state = 135;
;
RDebugUtils.currentLine=35389775;
 //BA.debugLineNum = 35389775;BA.debugLine="If DatosLineaPedido.ErrorCodigoProductoERP=1 T";
if (true) break;

case 135:
//if
this.state = 140;
if (_datoslineapedido.ErrorCodigoProductoERP /*int*/ ==1) { 
this.state = 137;
;}if (true) break;

case 137:
//C
this.state = 140;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 140:
//C
this.state = 141;
;
RDebugUtils.currentLine=35389776;
 //BA.debugLineNum = 35389776;BA.debugLine="If DatosLineaPedido.ErrorTalla=1 Then DatosLin";
if (true) break;

case 141:
//if
this.state = 146;
if (_datoslineapedido.ErrorTalla /*int*/ ==1) { 
this.state = 143;
;}if (true) break;

case 143:
//C
this.state = 146;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 146:
//C
this.state = 147;
;
RDebugUtils.currentLine=35389777;
 //BA.debugLineNum = 35389777;BA.debugLine="If DatosLineaPedido.ErrorCantidad=1 Then Datos";
if (true) break;

case 147:
//if
this.state = 152;
if (_datoslineapedido.ErrorCantidad /*int*/ ==1) { 
this.state = 149;
;}if (true) break;

case 149:
//C
this.state = 152;
_datoslineapedido.LineaConError /*int*/  = (int) (1);
if (true) break;

case 152:
//C
this.state = 153;
;
RDebugUtils.currentLine=35389779;
 //BA.debugLineNum = 35389779;BA.debugLine="If DatosLineaPedido.LineaConError=1 Then";
if (true) break;

case 153:
//if
this.state = 156;
if (_datoslineapedido.LineaConError /*int*/ ==1) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=35389780;
 //BA.debugLineNum = 35389780;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
parent.__c.LogImpl("835389780","*********************",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=35389781;
 //BA.debugLineNum = 35389781;BA.debugLine="LogColor($\"DatosLineaPedido ERROR: ${DatosLin";
parent.__c.LogImpl("835389781",("DatosLineaPedido ERROR: "+parent.__c.SmartStringFormatter("",(Object)(_datoslineapedido))+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=35389782;
 //BA.debugLineNum = 35389782;BA.debugLine="LogColor(\"*********************\",xui.Color_Bl";
parent.__c.LogImpl("835389782","*********************",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
 if (true) break;

case 156:
//C
this.state = 161;
;
RDebugUtils.currentLine=35389786;
 //BA.debugLineNum = 35389786;BA.debugLine="mSQL.AddNonQueryToBatch($\" 	insert into tblRep";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(("\n"+"	insert into tblRepsolLineasFicheroPedido\n"+"	(Linea, ErrorLongitudLineaCabeceraEstacion, Sede , ErrorSede , CodigoClienteERP , CodigoDireccionEnvioERP \n"+"	, CodigoPedido , FechaPedido ,ErrorFechaPedido, NombreEstacion ,Calle , CodigoPostal \n"+"	, Poblacion , CodigoProvincia , Telefono \n"+"	, TipoEstacion , Marca , ErrorMarca \n"+"	, DNI , ErrorDNI , NombreEmpleado , Cargo , ErrorCargo \n"+"	, Sexo , ErrorSexo ,  Embarazo , ErrorEmbarazo \n"+"	,CodigoPrenda , ErrorCodigoPrenda , CodigoProductoERP, ErrorCodigoProductoERP, Talla, TallaERP , ErrorTalla , Cantidad, ErrorCantidad\n"+"	, LineaConError) \n"+"	values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datoslineapedido.Linea /*String*/ ),(Object)(_datoslineapedido.ErrorLongitudLineaCabeceraEstacion /*int*/ ),(Object)(_datoslineapedido.Sede /*String*/ ),(Object)(_datoslineapedido.ErrorSede /*int*/ ),(Object)(_datoslineapedido.CodigoClienteERP /*String*/ ),(Object)(_datoslineapedido.CodigoDireccionEnvioERP /*String*/ ),(Object)(_datoslineapedido.CodigoPedido /*String*/ ),(Object)(_datoslineapedido.FechaPedido /*String*/ ),(Object)(_datoslineapedido.ErrorFechaPedido /*int*/ ),(Object)(_datoslineapedido.NombreEstacion /*String*/ ),(Object)(_datoslineapedido.Calle /*String*/ ),(Object)(_datoslineapedido.CodigoPostal /*String*/ ),(Object)(_datoslineapedido.Poblacion /*String*/ ),(Object)(_datoslineapedido.CodigoProvincia /*String*/ ),(Object)(_datoslineapedido.Telefono /*String*/ ),(Object)(_datoslineapedido.TipoEstacion /*String*/ ),(Object)(_datoslineapedido.Marca /*String*/ ),(Object)(_datoslineapedido.ErrorMarca /*int*/ ),(Object)(_datoslineapedido.DNI /*String*/ ),(Object)(_datoslineapedido.ErrorDNI /*int*/ ),(Object)(_datoslineapedido.NombreEmpleado /*String*/ ),(Object)(_datoslineapedido.Cargo /*String*/ ),(Object)(_datoslineapedido.ErrorCargo /*int*/ ),(Object)(_datoslineapedido.Sexo /*String*/ ),(Object)(_datoslineapedido.ErrorSexo /*int*/ ),(Object)(_datoslineapedido.Embarazo /*String*/ ),(Object)(_datoslineapedido.ErrorEmbarazo /*int*/ ),(Object)(_datoslineapedido.CodigoPrenda /*String*/ ),(Object)(_datoslineapedido.ErrorCodigoPrenda /*int*/ ),(Object)(_datoslineapedido.CodigoProductoERP /*String*/ ),(Object)(_datoslineapedido.ErrorCodigoProductoERP /*int*/ ),(Object)(_datoslineapedido.Talla /*String*/ ),(Object)(_datoslineapedido.TallaERP /*String*/ ),(Object)(_datoslineapedido.ErrorTalla /*int*/ ),(Object)(_datoslineapedido.Cantidad /*int*/ ),(Object)(_datoslineapedido.ErrorCantidad /*int*/ ),(Object)(_datoslineapedido.LineaConError /*int*/ )}));
RDebugUtils.currentLine=35389808;
 //BA.debugLineNum = 35389808;BA.debugLine="DatosLineaPedido.LineaConError=0  ' reseteamos la";
_datoslineapedido.LineaConError /*int*/  = (int) (0);
 if (true) break;

case 158:
//C
this.state = 161;
RDebugUtils.currentLine=35389813;
 //BA.debugLineNum = 35389813;BA.debugLine="Exit ' Salir del loop (ésta debería ser la últ";
this.state = 161;
if (true) break;
 if (true) break;

case 160:
//C
this.state = 161;
 if (true) break;

case 161:
//C
this.state = 391;
;
 if (true) break;
if (true) break;

case 162:
//C
this.state = 163;
;
RDebugUtils.currentLine=35389832;
 //BA.debugLineNum = 35389832;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=35389833;
 //BA.debugLineNum = 35389833;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero4"), _senderfilter);
this.state = 392;
return;
case 392:
//C
this.state = 163;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=35389834;
 //BA.debugLineNum = 35389834;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("835389834","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=35389837;
 //BA.debugLineNum = 35389837;BA.debugLine="Dim NumLineasConError As Int=mSQL.ExecQuerySingle";
_numlineasconerror = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(("select count(*) from tblRepsolLineasFicheroPedido where LineaConError=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(1)}))));
RDebugUtils.currentLine=35389839;
 //BA.debugLineNum = 35389839;BA.debugLine="If NumLineasConError>0 Then";
if (true) break;

case 163:
//if
this.state = 366;
if (_numlineasconerror>0) { 
this.state = 165;
}if (true) break;

case 165:
//C
this.state = 166;
RDebugUtils.currentLine=35389841;
 //BA.debugLineNum = 35389841;BA.debugLine="Dim rsSedePedidoDNI As ResultSet=mSQL.ExecQuery(";
_rssedepedidodni = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rssedepedidodni = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery(("select distinct Sede, CodigoPedido, DNI from tblRepsolLineasFicheroPedido where LineaConError=1"));
RDebugUtils.currentLine=35389842;
 //BA.debugLineNum = 35389842;BA.debugLine="Do While rsSedePedidoDNI.NextRow";
if (true) break;

case 166:
//do while
this.state = 351;
while (_rssedepedidodni.NextRow()) {
this.state = 168;
if (true) break;
}
if (true) break;

case 168:
//C
this.state = 169;
RDebugUtils.currentLine=35389843;
 //BA.debugLineNum = 35389843;BA.debugLine="Dim Sede As String=rsSedePedidoDNI.GetString(\"S";
_sede = _rssedepedidodni.GetString("Sede");
RDebugUtils.currentLine=35389844;
 //BA.debugLineNum = 35389844;BA.debugLine="Dim PedidoSede As String=rsSedePedidoDNI.GetStr";
_pedidosede = _rssedepedidodni.GetString("CodigoPedido");
RDebugUtils.currentLine=35389845;
 //BA.debugLineNum = 35389845;BA.debugLine="Dim DNI As String=rsSedePedidoDNI.GetString(\"DN";
_dni = _rssedepedidodni.GetString("DNI");
RDebugUtils.currentLine=35389847;
 //BA.debugLineNum = 35389847;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolLineasFiche";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblRepsolLineasFicheroPedido set SedePedidoDNIConError=? where Sede=? and CodigoPedido=? and DNI=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(_sede),(Object)(_pedidosede),(Object)(_dni)}));
RDebugUtils.currentLine=35389850;
 //BA.debugLineNum = 35389850;BA.debugLine="mSQL.ExecNonQuery2(\"insert into tblRepsolErrore";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("insert into tblRepsolErroresSedePedidoDNIFicheroPedido (Sede, PedidoSede, DNI, Errores) values (?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_sede))+"")),(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_pedidosede))+"")),(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_dni))+"")),(Object)("")}));
RDebugUtils.currentLine=35389853;
 //BA.debugLineNum = 35389853;BA.debugLine="Dim ErrorLongitudLineaCabeceraEstacion As Boole";
_errorlongitudlineacabeceraestacion = false;
RDebugUtils.currentLine=35389854;
 //BA.debugLineNum = 35389854;BA.debugLine="Dim ErrorSede As Boolean";
_errorsede = false;
RDebugUtils.currentLine=35389855;
 //BA.debugLineNum = 35389855;BA.debugLine="Dim ErrorFechaPedido As Boolean";
_errorfechapedido = false;
RDebugUtils.currentLine=35389856;
 //BA.debugLineNum = 35389856;BA.debugLine="Dim ErrorMarca As Boolean";
_errormarca = false;
RDebugUtils.currentLine=35389857;
 //BA.debugLineNum = 35389857;BA.debugLine="Dim ErrorLongitudLineaEmpleado As Boolean";
_errorlongitudlineaempleado = false;
RDebugUtils.currentLine=35389858;
 //BA.debugLineNum = 35389858;BA.debugLine="Dim ErrorDNI As Boolean";
_errordni = false;
RDebugUtils.currentLine=35389859;
 //BA.debugLineNum = 35389859;BA.debugLine="Dim ErrorCargo As Boolean";
_errorcargo = false;
RDebugUtils.currentLine=35389860;
 //BA.debugLineNum = 35389860;BA.debugLine="Dim ErrorSexo As Boolean";
_errorsexo = false;
RDebugUtils.currentLine=35389861;
 //BA.debugLineNum = 35389861;BA.debugLine="Dim ErrorEmbarazo As Boolean";
_errorembarazo = false;
RDebugUtils.currentLine=35389862;
 //BA.debugLineNum = 35389862;BA.debugLine="Dim ErrorLongitudLineaProducto As Boolean";
_errorlongitudlineaproducto = false;
RDebugUtils.currentLine=35389863;
 //BA.debugLineNum = 35389863;BA.debugLine="Dim ErrorCodigoPrenda As Boolean";
_errorcodigoprenda = false;
RDebugUtils.currentLine=35389864;
 //BA.debugLineNum = 35389864;BA.debugLine="Dim ErrorCodigoProductoERP As Boolean";
_errorcodigoproductoerp = false;
RDebugUtils.currentLine=35389865;
 //BA.debugLineNum = 35389865;BA.debugLine="Dim ErrorTalla As Boolean";
_errortalla = false;
RDebugUtils.currentLine=35389866;
 //BA.debugLineNum = 35389866;BA.debugLine="Dim ErrorCantidad As Boolean";
_errorcantidad = false;
RDebugUtils.currentLine=35389869;
 //BA.debugLineNum = 35389869;BA.debugLine="Dim rsLineasSedePedidoDNI As ResultSet= mSQL.Ex";
_rslineassedepedidodni = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rslineassedepedidodni = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select distinct Sede, CodigoPedido, DNI\n"+"	,ErrorLongitudLineaCabeceraEstacion,ErrorSede,ErrorFechaPedido,ErrorMarca\n"+"	,ErrorLongitudLineaEmpleado, ErrorDNI, ErrorCargo, ErrorSexo, ErrorEmbarazo\n"+"	 ,ErrorLongitudLineaProducto, ErrorCodigoPrenda,ErrorCodigoProductoERP,ErrorTalla, ErrorCantidad\n"+"	 from tblRepsolLineasFicheroPedido\n"+"	 where\n"+"	 Sede=? And CodigoPedido=? And DNI=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sede),(Object)(_pedidosede),(Object)(_dni)}));
RDebugUtils.currentLine=35389878;
 //BA.debugLineNum = 35389878;BA.debugLine="Do While rsLineasSedePedidoDNI.NextRow";
if (true) break;

case 169:
//do while
this.state = 262;
while (_rslineassedepedidodni.NextRow()) {
this.state = 171;
if (true) break;
}
if (true) break;

case 171:
//C
this.state = 172;
RDebugUtils.currentLine=35389879;
 //BA.debugLineNum = 35389879;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
if (true) break;

case 172:
//if
this.state = 177;
if (_rslineassedepedidodni.GetInt("ErrorLongitudLineaCabeceraEstacion")==1) { 
this.state = 174;
;}if (true) break;

case 174:
//C
this.state = 177;
_errorlongitudlineacabeceraestacion = parent.__c.True;
if (true) break;

case 177:
//C
this.state = 178;
;
RDebugUtils.currentLine=35389880;
 //BA.debugLineNum = 35389880;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSede\")=1";
if (true) break;

case 178:
//if
this.state = 183;
if (_rslineassedepedidodni.GetInt("ErrorSede")==1) { 
this.state = 180;
;}if (true) break;

case 180:
//C
this.state = 183;
_errorsede = parent.__c.True;
if (true) break;

case 183:
//C
this.state = 184;
;
RDebugUtils.currentLine=35389881;
 //BA.debugLineNum = 35389881;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorFechaPed";
if (true) break;

case 184:
//if
this.state = 189;
if (_rslineassedepedidodni.GetInt("ErrorFechaPedido")==1) { 
this.state = 186;
;}if (true) break;

case 186:
//C
this.state = 189;
_errorfechapedido = parent.__c.True;
if (true) break;

case 189:
//C
this.state = 190;
;
RDebugUtils.currentLine=35389882;
 //BA.debugLineNum = 35389882;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorMarca\")=";
if (true) break;

case 190:
//if
this.state = 195;
if (_rslineassedepedidodni.GetInt("ErrorMarca")==1) { 
this.state = 192;
;}if (true) break;

case 192:
//C
this.state = 195;
_errormarca = parent.__c.True;
if (true) break;

case 195:
//C
this.state = 196;
;
RDebugUtils.currentLine=35389883;
 //BA.debugLineNum = 35389883;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
if (true) break;

case 196:
//if
this.state = 201;
if (_rslineassedepedidodni.GetInt("ErrorLongitudLineaEmpleado")==1) { 
this.state = 198;
;}if (true) break;

case 198:
//C
this.state = 201;
_errorlongitudlineaempleado = parent.__c.True;
if (true) break;

case 201:
//C
this.state = 202;
;
RDebugUtils.currentLine=35389884;
 //BA.debugLineNum = 35389884;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorDNI\")=1";
if (true) break;

case 202:
//if
this.state = 207;
if (_rslineassedepedidodni.GetInt("ErrorDNI")==1) { 
this.state = 204;
;}if (true) break;

case 204:
//C
this.state = 207;
_errordni = parent.__c.True;
if (true) break;

case 207:
//C
this.state = 208;
;
RDebugUtils.currentLine=35389885;
 //BA.debugLineNum = 35389885;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCargo\")=";
if (true) break;

case 208:
//if
this.state = 213;
if (_rslineassedepedidodni.GetInt("ErrorCargo")==1) { 
this.state = 210;
;}if (true) break;

case 210:
//C
this.state = 213;
_errorcargo = parent.__c.True;
if (true) break;

case 213:
//C
this.state = 214;
;
RDebugUtils.currentLine=35389886;
 //BA.debugLineNum = 35389886;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorSexo\")=1";
if (true) break;

case 214:
//if
this.state = 219;
if (_rslineassedepedidodni.GetInt("ErrorSexo")==1) { 
this.state = 216;
;}if (true) break;

case 216:
//C
this.state = 219;
_errorsexo = parent.__c.True;
if (true) break;

case 219:
//C
this.state = 220;
;
RDebugUtils.currentLine=35389887;
 //BA.debugLineNum = 35389887;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorEmbarazo";
if (true) break;

case 220:
//if
this.state = 225;
if (_rslineassedepedidodni.GetInt("ErrorEmbarazo")==1) { 
this.state = 222;
;}if (true) break;

case 222:
//C
this.state = 225;
_errorembarazo = parent.__c.True;
if (true) break;

case 225:
//C
this.state = 226;
;
RDebugUtils.currentLine=35389888;
 //BA.debugLineNum = 35389888;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorLongitud";
if (true) break;

case 226:
//if
this.state = 231;
if (_rslineassedepedidodni.GetInt("ErrorLongitudLineaProducto")==1) { 
this.state = 228;
;}if (true) break;

case 228:
//C
this.state = 231;
_errorlongitudlineaproducto = parent.__c.True;
if (true) break;

case 231:
//C
this.state = 232;
;
RDebugUtils.currentLine=35389889;
 //BA.debugLineNum = 35389889;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
if (true) break;

case 232:
//if
this.state = 237;
if (_rslineassedepedidodni.GetInt("ErrorCodigoPrenda")==1) { 
this.state = 234;
;}if (true) break;

case 234:
//C
this.state = 237;
_errorcodigoprenda = parent.__c.True;
if (true) break;

case 237:
//C
this.state = 238;
;
RDebugUtils.currentLine=35389890;
 //BA.debugLineNum = 35389890;BA.debugLine="If ErrorMarca Or ErrorCargo Or ErrorSexo Or Er";
if (true) break;

case 238:
//if
this.state = 243;
if (_errormarca || _errorcargo || _errorsexo || _errorembarazo || _errorcodigoprenda) { 
this.state = 240;
;}if (true) break;

case 240:
//C
this.state = 243;
this.state = 169;
if (true) break;;
if (true) break;

case 243:
//C
this.state = 244;
;
RDebugUtils.currentLine=35389891;
 //BA.debugLineNum = 35389891;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCodigoPr";
if (true) break;

case 244:
//if
this.state = 249;
if (_rslineassedepedidodni.GetInt("ErrorCodigoProductoERP")==1) { 
this.state = 246;
;}if (true) break;

case 246:
//C
this.state = 249;
_errorcodigoproductoerp = parent.__c.True;
if (true) break;

case 249:
//C
this.state = 250;
;
RDebugUtils.currentLine=35389892;
 //BA.debugLineNum = 35389892;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorTalla\")=";
if (true) break;

case 250:
//if
this.state = 255;
if (_rslineassedepedidodni.GetInt("ErrorTalla")==1) { 
this.state = 252;
;}if (true) break;

case 252:
//C
this.state = 255;
_errortalla = parent.__c.True;
if (true) break;

case 255:
//C
this.state = 256;
;
RDebugUtils.currentLine=35389893;
 //BA.debugLineNum = 35389893;BA.debugLine="If rsLineasSedePedidoDNI.GetInt(\"ErrorCantidad";
if (true) break;

case 256:
//if
this.state = 261;
if (_rslineassedepedidodni.GetInt("ErrorCantidad")==1) { 
this.state = 258;
;}if (true) break;

case 258:
//C
this.state = 261;
_errorcantidad = parent.__c.True;
if (true) break;

case 261:
//C
this.state = 169;
;
 if (true) break;

case 262:
//C
this.state = 263;
;
RDebugUtils.currentLine=35389895;
 //BA.debugLineNum = 35389895;BA.debugLine="rsLineasSedePedidoDNI.close";
_rslineassedepedidodni.Close();
RDebugUtils.currentLine=35389897;
 //BA.debugLineNum = 35389897;BA.debugLine="Dim sbTextoError As StringBuilder";
_sbtextoerror = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35389898;
 //BA.debugLineNum = 35389898;BA.debugLine="sbTextoError.Initialize";
_sbtextoerror.Initialize();
RDebugUtils.currentLine=35389900;
 //BA.debugLineNum = 35389900;BA.debugLine="If ErrorLongitudLineaCabeceraEstacion Then sbTe";
if (true) break;

case 263:
//if
this.state = 268;
if (_errorlongitudlineacabeceraestacion) { 
this.state = 265;
;}if (true) break;

case 265:
//C
this.state = 268;
_sbtextoerror.Append(", ErrorLongitudLineaCabeceraEstacion");
if (true) break;

case 268:
//C
this.state = 269;
;
RDebugUtils.currentLine=35389901;
 //BA.debugLineNum = 35389901;BA.debugLine="If ErrorSede Then sbTextoError.Append(\", Sede n";
if (true) break;

case 269:
//if
this.state = 274;
if (_errorsede) { 
this.state = 271;
;}if (true) break;

case 271:
//C
this.state = 274;
_sbtextoerror.Append(", Sede no existe ERP Proin");
if (true) break;

case 274:
//C
this.state = 275;
;
RDebugUtils.currentLine=35389902;
 //BA.debugLineNum = 35389902;BA.debugLine="If ErrorFechaPedido Then sbTextoError.Append(\",";
if (true) break;

case 275:
//if
this.state = 280;
if (_errorfechapedido) { 
this.state = 277;
;}if (true) break;

case 277:
//C
this.state = 280;
_sbtextoerror.Append(", Error Fecha");
if (true) break;

case 280:
//C
this.state = 281;
;
RDebugUtils.currentLine=35389903;
 //BA.debugLineNum = 35389903;BA.debugLine="If ErrorMarca Then sbTextoError.Append(\", Error";
if (true) break;

case 281:
//if
this.state = 286;
if (_errormarca) { 
this.state = 283;
;}if (true) break;

case 283:
//C
this.state = 286;
_sbtextoerror.Append(", Error Marca");
if (true) break;

case 286:
//C
this.state = 287;
;
RDebugUtils.currentLine=35389904;
 //BA.debugLineNum = 35389904;BA.debugLine="If ErrorLongitudLineaEmpleado Then sbTextoError";
if (true) break;

case 287:
//if
this.state = 292;
if (_errorlongitudlineaempleado) { 
this.state = 289;
;}if (true) break;

case 289:
//C
this.state = 292;
_sbtextoerror.Append(", ErrorLongitudLineaEmpleado");
if (true) break;

case 292:
//C
this.state = 293;
;
RDebugUtils.currentLine=35389905;
 //BA.debugLineNum = 35389905;BA.debugLine="If ErrorDNI Then sbTextoError.Append(\", DNI no";
if (true) break;

case 293:
//if
this.state = 298;
if (_errordni) { 
this.state = 295;
;}if (true) break;

case 295:
//C
this.state = 298;
_sbtextoerror.Append(", DNI no válido");
if (true) break;

case 298:
//C
this.state = 299;
;
RDebugUtils.currentLine=35389906;
 //BA.debugLineNum = 35389906;BA.debugLine="If ErrorCargo Then sbTextoError.Append(\", Error";
if (true) break;

case 299:
//if
this.state = 304;
if (_errorcargo) { 
this.state = 301;
;}if (true) break;

case 301:
//C
this.state = 304;
_sbtextoerror.Append(", Error Cargo");
if (true) break;

case 304:
//C
this.state = 305;
;
RDebugUtils.currentLine=35389907;
 //BA.debugLineNum = 35389907;BA.debugLine="If ErrorSexo Then sbTextoError.Append(\", Error";
if (true) break;

case 305:
//if
this.state = 310;
if (_errorsexo) { 
this.state = 307;
;}if (true) break;

case 307:
//C
this.state = 310;
_sbtextoerror.Append(", Error Sexo");
if (true) break;

case 310:
//C
this.state = 311;
;
RDebugUtils.currentLine=35389908;
 //BA.debugLineNum = 35389908;BA.debugLine="If ErrorEmbarazo Then sbTextoError.Append(\", Er";
if (true) break;

case 311:
//if
this.state = 316;
if (_errorembarazo) { 
this.state = 313;
;}if (true) break;

case 313:
//C
this.state = 316;
_sbtextoerror.Append(", Error Embarazo");
if (true) break;

case 316:
//C
this.state = 317;
;
RDebugUtils.currentLine=35389909;
 //BA.debugLineNum = 35389909;BA.debugLine="If ErrorLongitudLineaProducto Then sbTextoError";
if (true) break;

case 317:
//if
this.state = 322;
if (_errorlongitudlineaproducto) { 
this.state = 319;
;}if (true) break;

case 319:
//C
this.state = 322;
_sbtextoerror.Append(", ErrorLongitudLineaProducto");
if (true) break;

case 322:
//C
this.state = 323;
;
RDebugUtils.currentLine=35389910;
 //BA.debugLineNum = 35389910;BA.debugLine="If ErrorCodigoPrenda Then sbTextoError.Append(\"";
if (true) break;

case 323:
//if
this.state = 328;
if (_errorcodigoprenda) { 
this.state = 325;
;}if (true) break;

case 325:
//C
this.state = 328;
_sbtextoerror.Append(", Error Código Prenda");
if (true) break;

case 328:
//C
this.state = 329;
;
RDebugUtils.currentLine=35389911;
 //BA.debugLineNum = 35389911;BA.debugLine="If ErrorCodigoProductoERP Then sbTextoError.App";
if (true) break;

case 329:
//if
this.state = 334;
if (_errorcodigoproductoerp) { 
this.state = 331;
;}if (true) break;

case 331:
//C
this.state = 334;
_sbtextoerror.Append(", ErrorCodigoProductoERP");
if (true) break;

case 334:
//C
this.state = 335;
;
RDebugUtils.currentLine=35389912;
 //BA.debugLineNum = 35389912;BA.debugLine="If ErrorTalla Then sbTextoError.Append(\", Error";
if (true) break;

case 335:
//if
this.state = 340;
if (_errortalla) { 
this.state = 337;
;}if (true) break;

case 337:
//C
this.state = 340;
_sbtextoerror.Append(", ErrorTalla");
if (true) break;

case 340:
//C
this.state = 341;
;
RDebugUtils.currentLine=35389913;
 //BA.debugLineNum = 35389913;BA.debugLine="If ErrorCantidad Then sbTextoError.Append(\", Er";
if (true) break;

case 341:
//if
this.state = 346;
if (_errorcantidad) { 
this.state = 343;
;}if (true) break;

case 343:
//C
this.state = 346;
_sbtextoerror.Append(", ErrorCantidad");
if (true) break;

case 346:
//C
this.state = 347;
;
RDebugUtils.currentLine=35389915;
 //BA.debugLineNum = 35389915;BA.debugLine="If sbTextoError.Length>2 Then";
if (true) break;

case 347:
//if
this.state = 350;
if (_sbtextoerror.getLength()>2) { 
this.state = 349;
}if (true) break;

case 349:
//C
this.state = 350;
RDebugUtils.currentLine=35389916;
 //BA.debugLineNum = 35389916;BA.debugLine="mSQL.ExecNonQuery2(\"update tblRepsolErroresSed";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblRepsolErroresSedePedidoDNIFicheroPedido set Errores=? where Sede=? and PedidoSede=? and DNI=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)((""+parent.__c.SmartStringFormatter("",(Object)(_sbtextoerror.ToString().substring((int) (2))))+"")),(Object)(_sede),(Object)(_pedidosede),(Object)(_dni)}));
 if (true) break;

case 350:
//C
this.state = 166;
;
 if (true) break;

case 351:
//C
this.state = 352;
;
RDebugUtils.currentLine=35389921;
 //BA.debugLineNum = 35389921;BA.debugLine="rsSedePedidoDNI.close";
_rssedepedidodni.Close();
RDebugUtils.currentLine=35389923;
 //BA.debugLineNum = 35389923;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=35389925;
 //BA.debugLineNum = 35389925;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Generando F";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Generando Fichero CSV ERRORES..."));
RDebugUtils.currentLine=35389926;
 //BA.debugLineNum = 35389926;BA.debugLine="Dim lstErrores As List=DBUtils.ExecuteMemoryTabl";
_lsterrores = new anywheresoftware.b4a.objects.collections.List();
_lsterrores = parent._dbutils._executememorytable /*anywheresoftware.b4a.objects.collections.List*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,("select * from tblRepsolErroresSedePedidoDNIFicheroPedido"),(String[])(parent.__c.Null),(int) (0));
RDebugUtils.currentLine=35389927;
 //BA.debugLineNum = 35389927;BA.debugLine="Dim lstEncabezadosErrores As List";
_lstencabezadoserrores = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35389928;
 //BA.debugLineNum = 35389928;BA.debugLine="lstEncabezadosErrores.Initialize";
_lstencabezadoserrores.Initialize();
RDebugUtils.currentLine=35389929;
 //BA.debugLineNum = 35389929;BA.debugLine="lstEncabezadosErrores.add(\"Sede\")";
_lstencabezadoserrores.Add((Object)("Sede"));
RDebugUtils.currentLine=35389930;
 //BA.debugLineNum = 35389930;BA.debugLine="lstEncabezadosErrores.add(\"PedidoSede\")";
_lstencabezadoserrores.Add((Object)("PedidoSede"));
RDebugUtils.currentLine=35389931;
 //BA.debugLineNum = 35389931;BA.debugLine="lstEncabezadosErrores.add(\"DNI\")";
_lstencabezadoserrores.Add((Object)("DNI"));
RDebugUtils.currentLine=35389932;
 //BA.debugLineNum = 35389932;BA.debugLine="lstEncabezadosErrores.add(\"ERROR\")";
_lstencabezadoserrores.Add((Object)("ERROR"));
RDebugUtils.currentLine=35389935;
 //BA.debugLineNum = 35389935;BA.debugLine="Dim sFicheroErrores As String=GenerarCSVSeparado";
_sficheroerrores = __ref._generarcsvseparadorcomasquotes /*String*/ (null,_lsterrores,",",_lstencabezadoserrores);
RDebugUtils.currentLine=35389936;
 //BA.debugLineNum = 35389936;BA.debugLine="Dim NombreFicheroErrores As String=$\"Errores_${N";
_nombreficheroerrores = ("Errores_"+parent.__c.SmartStringFormatter("",(Object)(_numeropedido))+".csv");
RDebugUtils.currentLine=35389937;
 //BA.debugLineNum = 35389937;BA.debugLine="File.WriteString(CarpetaDestinoFicherosPedidosEr";
parent.__c.File.WriteString(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores,_sficheroerrores);
RDebugUtils.currentLine=35389938;
 //BA.debugLineNum = 35389938;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
if (true) break;

case 352:
//if
this.state = 355;
if (parent.__c.File.Exists(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores)==parent.__c.False) { 
this.state = 354;
}if (true) break;

case 354:
//C
this.state = 355;
RDebugUtils.currentLine=35389939;
 //BA.debugLineNum = 35389939;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Fichero erro";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Fichero error aun no existe!!","Error");
RDebugUtils.currentLine=35389940;
 //BA.debugLineNum = 35389940;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero4"), _msa);
this.state = 393;
return;
case 393:
//C
this.state = 355;
;
 if (true) break;

case 355:
//C
this.state = 356;
;
RDebugUtils.currentLine=35389942;
 //BA.debugLineNum = 35389942;BA.debugLine="Log(File.Exists(CarpetaDestinoFicherosPedidosErr";
parent.__c.LogImpl("835389942",BA.ObjectToString(parent.__c.File.Exists(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores)),0);
RDebugUtils.currentLine=35389948;
 //BA.debugLineNum = 35389948;BA.debugLine="Dim RutaFTPFicheroPedidoErrores As String=ErrorF";
_rutaftpficheropedidoerrores = __ref._errorfilesfoldersftprepsol /*String*/ +"/"+_nombreficheroerrores;
RDebugUtils.currentLine=35389950;
 //BA.debugLineNum = 35389950;BA.debugLine="If File.Exists(CarpetaDestinoFicherosPedidosErro";
if (true) break;

case 356:
//if
this.state = 365;
if (parent.__c.File.Exists(__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores)) { 
this.state = 358;
}if (true) break;

case 358:
//C
this.state = 359;
RDebugUtils.currentLine=35389951;
 //BA.debugLineNum = 35389951;BA.debugLine="wait for(SubirFicheroACarpetaFTP(CarpetaDestino";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero4"), __ref._subirficheroacarpetaftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._carpetadestinoficherospedidoserrorrepsol /*String*/ ,_nombreficheroerrores,_rutaftpficheropedidoerrores));
this.state = 394;
return;
case 394:
//C
this.state = 359;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=35389952;
 //BA.debugLineNum = 35389952;BA.debugLine="If Not(Success) Then";
if (true) break;

case 359:
//if
this.state = 364;
if (parent.__c.Not(_success)) { 
this.state = 361;
}else {
this.state = 363;
}if (true) break;

case 361:
//C
this.state = 364;
RDebugUtils.currentLine=35389954;
 //BA.debugLineNum = 35389954;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Ha habido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Ha habido un error en la subida del fichero de errores"+parent.__c.SmartStringFormatter("",(Object)(_nombreficheroerrores))+""),"ATENCION!");
RDebugUtils.currentLine=35389955;
 //BA.debugLineNum = 35389955;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero4"), _msa);
this.state = 395;
return;
case 395:
//C
this.state = 364;
;
RDebugUtils.currentLine=35389956;
 //BA.debugLineNum = 35389956;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35389957;
 //BA.debugLineNum = 35389957;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 363:
//C
this.state = 364;
RDebugUtils.currentLine=35389959;
 //BA.debugLineNum = 35389959;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Se ha subi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Se ha subido el fichero de errores"+parent.__c.SmartStringFormatter("",(Object)(_nombreficheroerrores))+" correspondiente al fichero de pedido seleccionado."),"ATENCION!");
RDebugUtils.currentLine=35389960;
 //BA.debugLineNum = 35389960;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "crepsol", "procesarfichero4"), _msa);
this.state = 396;
return;
case 396:
//C
this.state = 364;
;
RDebugUtils.currentLine=35389961;
 //BA.debugLineNum = 35389961;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
 if (true) break;

case 364:
//C
this.state = 365;
;
 if (true) break;

case 365:
//C
this.state = 366;
;
 if (true) break;

case 366:
//C
this.state = 367;
;
RDebugUtils.currentLine=35389968;
 //BA.debugLineNum = 35389968;BA.debugLine="Dim NumLineasSinError As Int=mSQL.ExecQuerySingle";
_numlineassinerror = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2(("select count(*) from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0)}))));
RDebugUtils.currentLine=35389970;
 //BA.debugLineNum = 35389970;BA.debugLine="If NumLineasSinError>0 Then";
if (true) break;

case 367:
//if
this.state = 388;
if (_numlineassinerror>0) { 
this.state = 369;
}if (true) break;

case 369:
//C
this.state = 370;
RDebugUtils.currentLine=35389972;
 //BA.debugLineNum = 35389972;BA.debugLine="Dim lstHeaders As List=Array As String(\"Docuware";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
_lstheaders = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Docuware ID","Usuario","Cliente","DireccionEnvio","DocumentoExterno","AlmacenOrigen","FechaPedidoCliente","Articulo","ReferenciaCruzada","Talla","Cantidad","Precio"});
RDebugUtils.currentLine=35389975;
 //BA.debugLineNum = 35389975;BA.debugLine="Dim CarpetaFicheroCSV As String=\"\\\\192.168.10.6\\";
_carpetaficherocsv = "\\\\192.168.10.6\\PendientesNAV";
RDebugUtils.currentLine=35389977;
 //BA.debugLineNum = 35389977;BA.debugLine="Dim rsCabeceraPedidosLineasSinError As ResultSet";
_rscabecerapedidoslineassinerror = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rscabecerapedidoslineassinerror = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("select distinct CodigoClienteERP, CodigoDireccionEnvioERP, Sede, CodigoPedido, FechaPedido\n"+"			 from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=?"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0)}));
RDebugUtils.currentLine=35389979;
 //BA.debugLineNum = 35389979;BA.debugLine="Do While rsCabeceraPedidosLineasSinError.NextRow";
if (true) break;

case 370:
//do while
this.state = 387;
while (_rscabecerapedidoslineassinerror.NextRow()) {
this.state = 372;
if (true) break;
}
if (true) break;

case 372:
//C
this.state = 373;
RDebugUtils.currentLine=35389980;
 //BA.debugLineNum = 35389980;BA.debugLine="Dim UUIDPedido As String=Utilidades.GenerarUUID";
_uuidpedido = parent._utilidades._generaruuidv4 /*String*/ ();
RDebugUtils.currentLine=35389981;
 //BA.debugLineNum = 35389981;BA.debugLine="Dim IDPedido As String=$\"REPSOL_${UUIDPedido}\"$";
_idpedido = ("REPSOL_"+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+"");
RDebugUtils.currentLine=35389982;
 //BA.debugLineNum = 35389982;BA.debugLine="Dim NombreFicheroCSV As String=$\"${IDPedido}.cs";
_nombreficherocsv = (""+parent.__c.SmartStringFormatter("",(Object)(_idpedido))+".csv");
RDebugUtils.currentLine=35389983;
 //BA.debugLineNum = 35389983;BA.debugLine="Dim lstLineasPedidoVenta As List";
_lstlineaspedidoventa = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35389984;
 //BA.debugLineNum = 35389984;BA.debugLine="lstLineasPedidoVenta.Initialize";
_lstlineaspedidoventa.Initialize();
RDebugUtils.currentLine=35389985;
 //BA.debugLineNum = 35389985;BA.debugLine="Dim CodigoClienteNAV As String=rsCabeceraPedido";
_codigoclientenav = _rscabecerapedidoslineassinerror.GetString("CodigoClienteERP");
RDebugUtils.currentLine=35389986;
 //BA.debugLineNum = 35389986;BA.debugLine="Dim CodigoDireccionEnvioNAV As String=rsCabecer";
_codigodireccionenvionav = _rscabecerapedidoslineassinerror.GetString("CodigoDireccionEnvioERP");
RDebugUtils.currentLine=35389987;
 //BA.debugLineNum = 35389987;BA.debugLine="Dim Sede As String=rsCabeceraPedidosLineasSinEr";
_sede = _rscabecerapedidoslineassinerror.GetString("Sede");
RDebugUtils.currentLine=35389988;
 //BA.debugLineNum = 35389988;BA.debugLine="Dim CodigoPedido As String=rsCabeceraPedidosLin";
_codigopedido = _rscabecerapedidoslineassinerror.GetString("CodigoPedido");
RDebugUtils.currentLine=35389989;
 //BA.debugLineNum = 35389989;BA.debugLine="Dim DocumentoExterno As String=Sede & CodigoPed";
_documentoexterno = _sede+_codigopedido;
RDebugUtils.currentLine=35389990;
 //BA.debugLineNum = 35389990;BA.debugLine="Dim FechaPedidoCliente As String=rsCabeceraPedi";
_fechapedidocliente = _rscabecerapedidoslineassinerror.GetString("FechaPedido");
RDebugUtils.currentLine=35389991;
 //BA.debugLineNum = 35389991;BA.debugLine="Dim FechaPedidoClienteNAV As String=FechaPedido";
_fechapedidoclientenav = _fechapedidocliente.replace("-","/");
RDebugUtils.currentLine=35389994;
 //BA.debugLineNum = 35389994;BA.debugLine="Dim rsLineasPedido As ResultSet=mSQL.ExecQuery2(";
_rslineaspedido = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rslineaspedido = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2(("Select CodigoProductoERP, TallaERP, sum(Cantidad) as TotalCantidad\n"+"			from tblRepsolLineasFicheroPedido where SedePedidoDNIConError=? And CodigoClienteERP=? and CodigoDireccionEnvioERP=? and CodigoPedido=? and FechaPedido=?\n"+"			group by CodigoProductoERP,TallaERP"),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0),_codigoclientenav,_codigodireccionenvionav,_codigopedido,_fechapedidocliente}));
RDebugUtils.currentLine=35389999;
 //BA.debugLineNum = 35389999;BA.debugLine="Do While rsLineasPedido.NextRow";
if (true) break;

case 373:
//do while
this.state = 376;
while (_rslineaspedido.NextRow()) {
this.state = 375;
if (true) break;
}
if (true) break;

case 375:
//C
this.state = 373;
RDebugUtils.currentLine=35390001;
 //BA.debugLineNum = 35390001;BA.debugLine="Dim Precio As Double=Utilidades.FixNullDouble(";
_precio = parent._utilidades._fixnulldouble /*double*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select PrecioUnitario from tblRepsolTarifaVentaGRP07506 where Articulo=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_rslineaspedido.GetString("CodigoProductoERP")}))));
RDebugUtils.currentLine=35390003;
 //BA.debugLineNum = 35390003;BA.debugLine="Dim ArrDatosLineaPedido(12) As String";
_arrdatoslineapedido = new String[(int) (12)];
java.util.Arrays.fill(_arrdatoslineapedido,"");
RDebugUtils.currentLine=35390004;
 //BA.debugLineNum = 35390004;BA.debugLine="ArrDatosLineaPedido(0)=$\"${UUIDPedido}\"$";
_arrdatoslineapedido[(int) (0)] = (""+parent.__c.SmartStringFormatter("",(Object)(_uuidpedido))+"");
RDebugUtils.currentLine=35390006;
 //BA.debugLineNum = 35390006;BA.debugLine="ArrDatosLineaPedido(1)=\"PROIN\\SUSANA.DIEZ\"   '";
_arrdatoslineapedido[(int) (1)] = "PROIN\\SUSANA.DIEZ";
RDebugUtils.currentLine=35390007;
 //BA.debugLineNum = 35390007;BA.debugLine="ArrDatosLineaPedido(2)=CodigoClienteNAV";
_arrdatoslineapedido[(int) (2)] = _codigoclientenav;
RDebugUtils.currentLine=35390008;
 //BA.debugLineNum = 35390008;BA.debugLine="ArrDatosLineaPedido(3)=CodigoDireccionEnvioNAV";
_arrdatoslineapedido[(int) (3)] = _codigodireccionenvionav;
RDebugUtils.currentLine=35390009;
 //BA.debugLineNum = 35390009;BA.debugLine="ArrDatosLineaPedido(4)=DocumentoExterno";
_arrdatoslineapedido[(int) (4)] = _documentoexterno;
RDebugUtils.currentLine=35390010;
 //BA.debugLineNum = 35390010;BA.debugLine="ArrDatosLineaPedido(5)=\"0299\"";
_arrdatoslineapedido[(int) (5)] = "0299";
RDebugUtils.currentLine=35390011;
 //BA.debugLineNum = 35390011;BA.debugLine="ArrDatosLineaPedido(6)=FechaPedidoClienteNAV";
_arrdatoslineapedido[(int) (6)] = _fechapedidoclientenav;
RDebugUtils.currentLine=35390012;
 //BA.debugLineNum = 35390012;BA.debugLine="ArrDatosLineaPedido(7)=rsLineasPedido.GetStrin";
_arrdatoslineapedido[(int) (7)] = _rslineaspedido.GetString("CodigoProductoERP");
RDebugUtils.currentLine=35390013;
 //BA.debugLineNum = 35390013;BA.debugLine="ArrDatosLineaPedido(8)=\"\"";
_arrdatoslineapedido[(int) (8)] = "";
RDebugUtils.currentLine=35390014;
 //BA.debugLineNum = 35390014;BA.debugLine="ArrDatosLineaPedido(9)=rsLineasPedido.GetStrin";
_arrdatoslineapedido[(int) (9)] = _rslineaspedido.GetString("TallaERP");
RDebugUtils.currentLine=35390015;
 //BA.debugLineNum = 35390015;BA.debugLine="ArrDatosLineaPedido(10)=rsLineasPedido.GetInt(";
_arrdatoslineapedido[(int) (10)] = BA.NumberToString(_rslineaspedido.GetInt("TotalCantidad"));
RDebugUtils.currentLine=35390016;
 //BA.debugLineNum = 35390016;BA.debugLine="ArrDatosLineaPedido(11)=Precio";
_arrdatoslineapedido[(int) (11)] = BA.NumberToString(_precio);
RDebugUtils.currentLine=35390018;
 //BA.debugLineNum = 35390018;BA.debugLine="lstLineasPedidoVenta.Add(ArrDatosLineaPedido)";
_lstlineaspedidoventa.Add((Object)(_arrdatoslineapedido));
 if (true) break;

case 376:
//C
this.state = 377;
;
RDebugUtils.currentLine=35390022;
 //BA.debugLineNum = 35390022;BA.debugLine="rsLineasPedido.Close";
_rslineaspedido.Close();
RDebugUtils.currentLine=35390026;
 //BA.debugLineNum = 35390026;BA.debugLine="If lstLineasPedidoVenta.Size>0 Then";
if (true) break;

case 377:
//if
this.state = 386;
if (_lstlineaspedidoventa.getSize()>0) { 
this.state = 379;
}if (true) break;

case 379:
//C
this.state = 380;
RDebugUtils.currentLine=35390027;
 //BA.debugLineNum = 35390027;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=35390028;
 //BA.debugLineNum = 35390028;BA.debugLine="Try";
if (true) break;

case 380:
//try
this.state = 385;
this.catchState = 384;
this.state = 382;
if (true) break;

case 382:
//C
this.state = 385;
this.catchState = 384;
RDebugUtils.currentLine=35390029;
 //BA.debugLineNum = 35390029;BA.debugLine="su.SaveCSV2(CarpetaFicheroCSV,NombreFicheroCS";
_su.SaveCSV2(_carpetaficherocsv,_nombreficherocsv,BA.ObjectToChar(";"),_lstlineaspedidoventa,_lstheaders);
 if (true) break;

case 384:
//C
this.state = 385;
this.catchState = 0;
RDebugUtils.currentLine=35390032;
 //BA.debugLineNum = 35390032;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("835390032",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 385:
//C
this.state = 386;
this.catchState = 0;
;
 if (true) break;

case 386:
//C
this.state = 370;
;
 if (true) break;

case 387:
//C
this.state = 388;
;
RDebugUtils.currentLine=35390038;
 //BA.debugLineNum = 35390038;BA.debugLine="rsCabeceraPedidosLineasSinError.close";
_rscabecerapedidoslineassinerror.Close();
 if (true) break;

case 388:
//C
this.state = -1;
;
RDebugUtils.currentLine=35390042;
 //BA.debugLineNum = 35390042;BA.debugLine="jamLoadingIndicator1.DetenerControlTiempoProceso";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._detenercontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=35390043;
 //BA.debugLineNum = 35390043;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=35390046;
 //BA.debugLineNum = 35390046;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=35390047;
 //BA.debugLineNum = 35390047;BA.debugLine="End Sub";
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
public String  _sftprepsol_promptyesno(b4j.docU.crepsol __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "sftprepsol_promptyesno", false))
	 {return ((String) Debug.delegate(ba, "sftprepsol_promptyesno", new Object[] {_message}));}
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Sub sFtpRepsol_PromptYesNo (Message As String)";
RDebugUtils.currentLine=33816582;
 //BA.debugLineNum = 33816582;BA.debugLine="sFtpRepsol.SetPromptResult(True)";
__ref._sftprepsol /*anywheresoftware.b4a.objects.SFtpWrapper*/ .SetPromptResult(__c.True);
RDebugUtils.currentLine=33816583;
 //BA.debugLineNum = 33816583;BA.debugLine="End Sub";
return "";
}
public String  _sftprepsol_showmessage(b4j.docU.crepsol __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "sftprepsol_showmessage", false))
	 {return ((String) Debug.delegate(ba, "sftprepsol_showmessage", new Object[] {_message}));}
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Sub sFtpRepsol_ShowMessage (Message As String)";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="If Message.StartsWith(\"Welcome\")=False Then";
if (_message.startsWith("Welcome")==__c.False) { 
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="fx.Msgbox(frm,Message, \"\")";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,_message,"");
 };
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="End Sub";
return "";
}
public String  _sftprepsol_uploadcompleted(b4j.docU.crepsol __ref,String _serverpath,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "sftprepsol_uploadcompleted", false))
	 {return ((String) Debug.delegate(ba, "sftprepsol_uploadcompleted", new Object[] {_serverpath,_success}));}
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Sub sFtpRepsol_UploadCompleted (ServerPath As Stri";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
__c.LogImpl("834078721",_serverpath+", Success="+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="If Success = False Then Log(LastException.Message";
if (_success==__c.False) { 
__c.LogImpl("834078722",__c.LastException(ba).getMessage(),0);};
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="End Sub";
return "";
}
public String  _sftprepsol_uploadprogress(b4j.docU.crepsol __ref,String _serverpath,long _totaluploaded,long _total) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "sftprepsol_uploadprogress", false))
	 {return ((String) Debug.delegate(ba, "sftprepsol_uploadprogress", new Object[] {_serverpath,_totaluploaded,_total}));}
String _s = "";
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Sub sFtpRepsol_UploadProgress (ServerPath As Strin";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="Dim s As String";
_s = "";
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="s = \"Uploaded \" & Round(TotalUploaded / 1000) & \"";
_s = "Uploaded "+BA.NumberToString(__c.Round(_totaluploaded/(double)1000))+"KB";
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="If Total > 0 Then s = s & \" out of \" & Round(Tota";
if (_total>0) { 
_s = _s+" out of "+BA.NumberToString(__c.Round(_total/(double)1000))+"KB";};
RDebugUtils.currentLine=34013188;
 //BA.debugLineNum = 34013188;BA.debugLine="Log(s)";
__c.LogImpl("834013188",_s,0);
RDebugUtils.currentLine=34013189;
 //BA.debugLineNum = 34013189;BA.debugLine="End Sub";
return "";
}
public String  _utf2android(b4j.docU.crepsol __ref,String _utf) throws Exception{
__ref = this;
RDebugUtils.currentModule="crepsol";
if (Debug.shouldDelegate(ba, "utf2android", false))
	 {return ((String) Debug.delegate(ba, "utf2android", new Object[] {_utf}));}
int _m = 0;
int _i = 0;
byte[] _android = null;
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Sub utf2android(utf As String) As String";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Dim m As Int = utf.Length-1";
_m = (int) (_utf.length()-1);
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=34275331;
 //BA.debugLineNum = 34275331;BA.debugLine="Dim android(m+1) As Byte";
_android = new byte[(int) (_m+1)];
;
RDebugUtils.currentLine=34275332;
 //BA.debugLineNum = 34275332;BA.debugLine="For i=0 To m";
{
final int step4 = 1;
final int limit4 = _m;
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=34275333;
 //BA.debugLineNum = 34275333;BA.debugLine="android(i) = Asc(utf.CharAt(i))";
_android[_i] = (byte) (__c.Asc(_utf.charAt(_i)));
 }
};
RDebugUtils.currentLine=34275335;
 //BA.debugLineNum = 34275335;BA.debugLine="Return BytesToString(android, 0, android.Length,";
if (true) return __c.BytesToString(_android,(int) (0),_android.length,"UTF-8");
RDebugUtils.currentLine=34275336;
 //BA.debugLineNum = 34275336;BA.debugLine="End Sub";
return "";
}
}