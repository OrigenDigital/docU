
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

public class cmauxtxt implements IRemote{
	public static cmauxtxt mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public cmauxtxt() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new cmauxtxt();
		remoteMe = RemoteObject.declareNull("b4j.docU.cmauxtxt");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("cmauxtxt"), "b4j.docU.cmauxtxt");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, cmauxtxt.class);
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
		pcBA = new PCBA(this, cmauxtxt.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _usertxt = RemoteObject.createImmutable("");
public static RemoteObject _pswtxt = RemoteObject.createImmutable("");
public static RemoteObject _tokenwebtxt = RemoteObject.createImmutable("");
public static RemoteObject _codigoclientetxt = RemoteObject.createImmutable(0);
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
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
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.docU.b4xcollections.class),"cmAuxCorreosExpress",Debug.moduleToString(b4j.docU.cmauxcorreosexpress.class),"cmPermisos",Debug.moduleToString(b4j.docU.cmpermisos.class),"CodigoClienteTXT",cmauxtxt._codigoclientetxt,"CSSUtils",cmauxtxt._cssutils,"DateUtils",cmauxtxt._dateutils,"DBUtils",Debug.moduleToString(b4j.docU.dbutils.class),"HttpUtils2Service",Debug.moduleToString(b4j.docU.httputils2service.class),"jamLinkNavision",Debug.moduleToString(b4j.docU.jamlinknavision.class),"jamRecordFormBuilder",Debug.moduleToString(b4j.docU.jamrecordformbuilder.class),"jamTableViewCamposBuilder",Debug.moduleToString(b4j.docU.jamtableviewcamposbuilder.class),"JRDCQuery",Debug.moduleToString(b4j.docU.jrdcquery.class),"Main",Debug.moduleToString(b4j.docU.main.class),"MainMenu2",Debug.moduleToString(b4j.docU.mainmenu2.class),"PswTXT",cmauxtxt._pswtxt,"TokenWebTXT",cmauxtxt._tokenwebtxt,"TransferMode",Debug.moduleToString(b4j.docU.transfermode.class),"UserTXT",cmauxtxt._usertxt,"Utilidades",Debug.moduleToString(b4j.docU.utilidades.class),"xui",cmauxtxt._xui,"XUIViewsUtils",Debug.moduleToString(b4j.docU.xuiviewsutils.class)};
}
}