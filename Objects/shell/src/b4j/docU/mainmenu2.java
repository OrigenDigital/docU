
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

public class mainmenu2 implements IRemote{
	public static mainmenu2 mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public mainmenu2() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new mainmenu2();
		remoteMe = RemoteObject.declareNull("b4j.docU.mainmenu2");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("mainmenu2"), "b4j.docU.mainmenu2");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, mainmenu2.class);
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
		pcBA = new PCBA(this, mainmenu2.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _pnlfondomainmenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _treeviewmainmenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _splitpanemainmenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.SplitPaneWrapper");
public static RemoteObject _textengine1 = RemoteObject.declareNull("b4j.docU.bctextengine");
public static RemoteObject _bbcodeviewelementosmainmenu = RemoteObject.declareNull("b4j.docU.bbcodeview");
public static RemoteObject _jamloadingindicator1 = RemoteObject.declareNull("b4j.docU.jamloadingindicator");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
public static b4j.docU.main _main = null;
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
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.docU.b4xcollections.class),"BBCodeViewElementosMainMenu",mainmenu2._bbcodeviewelementosmainmenu,"cmAuxCorreosExpress",Debug.moduleToString(b4j.docU.cmauxcorreosexpress.class),"cmAuxTxT",Debug.moduleToString(b4j.docU.cmauxtxt.class),"cmPermisos",Debug.moduleToString(b4j.docU.cmpermisos.class),"CSSUtils",mainmenu2._cssutils,"DateUtils",mainmenu2._dateutils,"DBUtils",Debug.moduleToString(b4j.docU.dbutils.class),"Dialog",mainmenu2._dialog,"frm",mainmenu2._frm,"fx",mainmenu2._fx,"HttpUtils2Service",Debug.moduleToString(b4j.docU.httputils2service.class),"jamLinkNavision",Debug.moduleToString(b4j.docU.jamlinknavision.class),"jamLoadingIndicator1",mainmenu2._jamloadingindicator1,"jamRecordFormBuilder",Debug.moduleToString(b4j.docU.jamrecordformbuilder.class),"jamTableViewCamposBuilder",Debug.moduleToString(b4j.docU.jamtableviewcamposbuilder.class),"JRDCQuery",Debug.moduleToString(b4j.docU.jrdcquery.class),"Main",Debug.moduleToString(b4j.docU.main.class),"pnlFondoMainMenu",mainmenu2._pnlfondomainmenu,"SplitPaneMainMenu",mainmenu2._splitpanemainmenu,"TextEngine1",mainmenu2._textengine1,"TransferMode",Debug.moduleToString(b4j.docU.transfermode.class),"TreeViewMainMenu",mainmenu2._treeviewmainmenu,"Utilidades",Debug.moduleToString(b4j.docU.utilidades.class),"xui",mainmenu2._xui,"XUIViewsUtils",Debug.moduleToString(b4j.docU.xuiviewsutils.class)};
}
}