
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

public class cmauxcorreosexpress implements IRemote{
	public static cmauxcorreosexpress mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public cmauxcorreosexpress() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new cmauxcorreosexpress();
		remoteMe = RemoteObject.declareNull("b4j.docU.cmauxcorreosexpress");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("cmauxcorreosexpress"), "b4j.docU.cmauxcorreosexpress");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, cmauxcorreosexpress.class);
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
		pcBA = new PCBA(this, cmauxcorreosexpress.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _lstcodigosincidenciascorreosexpress = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstestadoscorreosexpress = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
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
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.docU.b4xcollections.class),"cmAuxTxT",Debug.moduleToString(b4j.docU.cmauxtxt.class),"cmPermisos",Debug.moduleToString(b4j.docU.cmpermisos.class),"CSSUtils",cmauxcorreosexpress._cssutils,"DateUtils",cmauxcorreosexpress._dateutils,"DBUtils",Debug.moduleToString(b4j.docU.dbutils.class),"fx",cmauxcorreosexpress._fx,"HttpUtils2Service",Debug.moduleToString(b4j.docU.httputils2service.class),"jamLinkNavision",Debug.moduleToString(b4j.docU.jamlinknavision.class),"jamRecordFormBuilder",Debug.moduleToString(b4j.docU.jamrecordformbuilder.class),"jamTableViewCamposBuilder",Debug.moduleToString(b4j.docU.jamtableviewcamposbuilder.class),"JRDCQuery",Debug.moduleToString(b4j.docU.jrdcquery.class),"lstCodigosIncidenciasCorreosExpress",cmauxcorreosexpress._lstcodigosincidenciascorreosexpress,"lstEstadosCorreosExpress",cmauxcorreosexpress._lstestadoscorreosexpress,"Main",Debug.moduleToString(b4j.docU.main.class),"MainMenu2",Debug.moduleToString(b4j.docU.mainmenu2.class),"TransferMode",Debug.moduleToString(b4j.docU.transfermode.class),"Utilidades",Debug.moduleToString(b4j.docU.utilidades.class),"XUIViewsUtils",Debug.moduleToString(b4j.docU.xuiviewsutils.class)};
}
}