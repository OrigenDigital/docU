
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class crepsol {
    public static RemoteObject myClass;
	public crepsol() {
	}
    public static PCBA staticBA = new PCBA(null, crepsol.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _msql = RemoteObject.declareNull("anywheresoftware.b4j.objects.SQL");
public static RemoteObject _draganddrop1 = RemoteObject.declareNull("b4j.docU.draganddrop");
public static RemoteObject _splitpane1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SplitPaneWrapper");
public static RemoteObject _treeviewlocal = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper");
public static RemoteObject _treeviewftp = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper");
public static RemoteObject _vlocalpath = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _vftppath = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textftp = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textuser = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textpassword = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textinfo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _sd_loadingindicator1 = RemoteObject.declareNull("b4j.docU.sd_loadingindicator");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _permisomodulousuario = RemoteObject.createImmutable("");
public static RemoteObject _btnsalir = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _jamloadingindicator1 = RemoteObject.declareNull("b4j.docU.jamloadingindicator");
public static RemoteObject _mcodigonavgrprepsoleess = RemoteObject.createImmutable("");
public static RemoteObject _sftprepsol = RemoteObject.declareNull("anywheresoftware.b4a.objects.SFtpWrapper");
public static RemoteObject _filesfoldersftprepsol = RemoteObject.createImmutable("");
public static RemoteObject _errorfilesfoldersftprepsol = RemoteObject.createImmutable("");
public static RemoteObject _carpetadestinoficherosdescargadosftppedidosrepsol = RemoteObject.createImmutable("");
public static RemoteObject _carpetadestinoficherospedidosokrepsol = RemoteObject.createImmutable("");
public static RemoteObject _carpetadestinoficherospedidoserrorrepsol = RemoteObject.createImmutable("");
public static RemoteObject _cuentaemailremitenteavisos = RemoteObject.createImmutable("");
public static RemoteObject _cuentaemaildestinatariodev1 = RemoteObject.createImmutable("");
public static RemoteObject _cuentaemaildestinatariodev2 = RemoteObject.createImmutable("");
public static RemoteObject _cuentaemaildestinatarioproinpedidosrepsol = RemoteObject.createImmutable("");
public static RemoteObject _btnselficheroftp = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtficheroseleccionado = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnprocesar = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _textareadatosproceso = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _btnselficherowindows = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dirficheroprocesar = RemoteObject.createImmutable("");
public static RemoteObject _nombreficheroprocesar = RemoteObject.createImmutable("");
public static RemoteObject _btncheckftpinbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnuploadfile = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnprocesocompleto = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"btnCheckFTPInbox",_ref.getField(false, "_btncheckftpinbox"),"btnProcesar",_ref.getField(false, "_btnprocesar"),"btnProcesoCompleto",_ref.getField(false, "_btnprocesocompleto"),"btnSalir",_ref.getField(false, "_btnsalir"),"btnSelFicheroFTP",_ref.getField(false, "_btnselficheroftp"),"btnSelFicheroWindows",_ref.getField(false, "_btnselficherowindows"),"btnUploadFile",_ref.getField(false, "_btnuploadfile"),"CarpetaDestinoFicherosDescargadosFTPPedidosRepsol",_ref.getField(false, "_carpetadestinoficherosdescargadosftppedidosrepsol"),"CarpetaDestinoFicherosPedidosErrorRepsol",_ref.getField(false, "_carpetadestinoficherospedidoserrorrepsol"),"CarpetaDestinoFicherosPedidosOKRepsol",_ref.getField(false, "_carpetadestinoficherospedidosokrepsol"),"CSSUtils",_ref.getField(false, "_cssutils"),"CuentaEmailDestinatarioDev1",_ref.getField(false, "_cuentaemaildestinatariodev1"),"CuentaEmailDestinatarioDev2",_ref.getField(false, "_cuentaemaildestinatariodev2"),"CuentaEmailDestinatarioProinPedidosRepsol",_ref.getField(false, "_cuentaemaildestinatarioproinpedidosrepsol"),"CuentaEmailRemitenteAvisos",_ref.getField(false, "_cuentaemailremitenteavisos"),"DateUtils",_ref.getField(false, "_dateutils"),"Dialog",_ref.getField(false, "_dialog"),"DirFicheroProcesar",_ref.getField(false, "_dirficheroprocesar"),"DragAndDrop1",_ref.getField(false, "_draganddrop1"),"ErrorFilesFoldersFtpRepsol",_ref.getField(false, "_errorfilesfoldersftprepsol"),"FilesFoldersFtpRepsol",_ref.getField(false, "_filesfoldersftprepsol"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"jamLoadingIndicator1",_ref.getField(false, "_jamloadingindicator1"),"mCodigoNAVGRPRepsolEESS",_ref.getField(false, "_mcodigonavgrprepsoleess"),"mSQL",_ref.getField(false, "_msql"),"NombreFicheroProcesar",_ref.getField(false, "_nombreficheroprocesar"),"PermisoModuloUsuario",_ref.getField(false, "_permisomodulousuario"),"SD_LoadingIndicator1",_ref.getField(false, "_sd_loadingindicator1"),"sFtpRepsol",_ref.getField(false, "_sftprepsol"),"SplitPane1",_ref.getField(false, "_splitpane1"),"TextAreaDatosProceso",_ref.getField(false, "_textareadatosproceso"),"TextFTP",_ref.getField(false, "_textftp"),"TextInfo",_ref.getField(false, "_textinfo"),"TextPassword",_ref.getField(false, "_textpassword"),"TextUser",_ref.getField(false, "_textuser"),"TreeViewFTP",_ref.getField(false, "_treeviewftp"),"TreeViewLocal",_ref.getField(false, "_treeviewlocal"),"txtFicheroSeleccionado",_ref.getField(false, "_txtficheroseleccionado"),"vFTPpath",_ref.getField(false, "_vftppath"),"vLocalPath",_ref.getField(false, "_vlocalpath"),"xui",_ref.getField(false, "_xui")};
}
}