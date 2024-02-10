
package b4j.docU;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new main();
		remoteMe = RemoteObject.declareNull("b4j.docU.main");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4j.docU.main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, main.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _version = RemoteObject.createImmutable("");
public static RemoteObject _nombreaplicacion = RemoteObject.createImmutable("");
public static RemoteObject _nombreaplicacionforms = RemoteObject.createImmutable("");
public static RemoteObject _datosconfiguracionaplicacion = RemoteObject.declareNull("b4j.docU.main._datosconfiguracionaplicacion");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _prefijotitleforms = RemoteObject.createImmutable("");
public static RemoteObject _iconoformularios = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
public static RemoteObject _sufijotitleforms = RemoteObject.createImmutable("");
public static RemoteObject _nombreficheroiconoaplicacion = RemoteObject.createImmutable("");
public static RemoteObject _rdclinkmysqlalmconexion = RemoteObject.createImmutable("");
public static RemoteObject _almacenconexion = RemoteObject.createImmutable("");
public static RemoteObject _rdclinkmysqldatoscomunes = RemoteObject.createImmutable("");
public static RemoteObject _rdclinknav = RemoteObject.createImmutable("");
public static RemoteObject _rdclinkmysqlalmproin = RemoteObject.createImmutable("");
public static RemoteObject _rdclinkmysqlalmprotec = RemoteObject.createImmutable("");
public static RemoteObject _configuracionusuario = RemoteObject.declareNull("b4j.docU.main._configuracionusuario");
public static RemoteObject _mconfiguracionusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _xscreen = RemoteObject.createImmutable(0);
public static RemoteObject _yscreen = RemoteObject.createImmutable(0);
public static RemoteObject _treeitemmenuabreform = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper");
public static RemoteObject _alineacioncentroderecha = RemoteObject.createImmutable("");
public static RemoteObject _alineacioncentro = RemoteObject.createImmutable("");
public static RemoteObject _alineacioncentroizquierda = RemoteObject.createImmutable("");
public static RemoteObject _userfolder = RemoteObject.createImmutable("");
public static RemoteObject _usertempfolder = RemoteObject.createImmutable("");
public static RemoteObject _datosusuario = RemoteObject.declareNull("b4j.docU.main._datosusuario");
public static RemoteObject _awesome = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _lstselitem = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _robot = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _almacenipconexion = RemoteObject.createImmutable("");
public static RemoteObject _imageviewsplashscreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblsplashscreenappversion = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlfondosplashscreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _scamposfiltradoslistaincidenciasproveedor = RemoteObject.createImmutable("");
public static RemoteObject _lstvaloresfiltroslistaincidenciasproveedor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
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
  public Object[] GetGlobals() {
		return new Object[] {"AlineacionCentro",main._alineacioncentro,"AlineacionCentroDerecha",main._alineacioncentroderecha,"AlineacionCentroIzquierda",main._alineacioncentroizquierda,"AlmacenConexion",main._almacenconexion,"AlmacenIPConexion",main._almacenipconexion,"awesome",main._awesome,"B4XCollections",Debug.moduleToString(b4j.docU.b4xcollections.class),"cmAuxCorreosExpress",Debug.moduleToString(b4j.docU.cmauxcorreosexpress.class),"cmAuxTxT",Debug.moduleToString(b4j.docU.cmauxtxt.class),"cmPermisos",Debug.moduleToString(b4j.docU.cmpermisos.class),"ConfiguracionUsuario",main._configuracionusuario,"CSSUtils",main._cssutils,"cvs",main._cvs,"DateUtils",main._dateutils,"DatosConfiguracionAplicacion",main._datosconfiguracionaplicacion,"DatosUsuario",main._datosusuario,"DBUtils",Debug.moduleToString(b4j.docU.dbutils.class),"frm",main._frm,"fx",main._fx,"HttpUtils2Service",Debug.moduleToString(b4j.docU.httputils2service.class),"IconoFormularios",main._iconoformularios,"ImageViewSplashScreen",main._imageviewsplashscreen,"jamLinkNavision",Debug.moduleToString(b4j.docU.jamlinknavision.class),"jamRecordFormBuilder",Debug.moduleToString(b4j.docU.jamrecordformbuilder.class),"jamTableViewCamposBuilder",Debug.moduleToString(b4j.docU.jamtableviewcamposbuilder.class),"JRDCQuery",Debug.moduleToString(b4j.docU.jrdcquery.class),"lblSplashScreenAppVersion",main._lblsplashscreenappversion,"lstSelItem",main._lstselitem,"lstValoresFiltrosListaIncidenciasProveedor",main._lstvaloresfiltroslistaincidenciasproveedor,"MainMenu2",Debug.moduleToString(b4j.docU.mainmenu2.class),"mConfiguracionUsuario",main._mconfiguracionusuario,"NombreAplicacion",main._nombreaplicacion,"NombreAplicacionForms",main._nombreaplicacionforms,"NombreFicheroIconoAplicacion",main._nombreficheroiconoaplicacion,"pnlFondoSplashScreen",main._pnlfondosplashscreen,"PrefijoTitleForms",main._prefijotitleforms,"rdclinkMySqlAlmConexion",main._rdclinkmysqlalmconexion,"rdclinkMySqlAlmProin",main._rdclinkmysqlalmproin,"rdclinkMySqlAlmProtec",main._rdclinkmysqlalmprotec,"rdclinkMySqlDatosComunes",main._rdclinkmysqldatoscomunes,"rdcLinkNav",main._rdclinknav,"Robot",main._robot,"sCamposFiltradosListaIncidenciasProveedor",main._scamposfiltradoslistaincidenciasproveedor,"SufijoTitleForms",main._sufijotitleforms,"TransferMode",Debug.moduleToString(b4j.docU.transfermode.class),"TreeItemMenuAbreForm",main._treeitemmenuabreform,"UserFolder",main._userfolder,"UserTempFolder",main._usertempfolder,"Utilidades",Debug.moduleToString(b4j.docU.utilidades.class),"Version",main._version,"xScreen",main._xscreen,"xui",main._xui,"XUIViewsUtils",Debug.moduleToString(b4j.docU.xuiviewsutils.class),"yScreen",main._yscreen};
}
}