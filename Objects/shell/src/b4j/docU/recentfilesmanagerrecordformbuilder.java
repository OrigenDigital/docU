
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class recentfilesmanagerrecordformbuilder {
    public static RemoteObject myClass;
	public recentfilesmanagerrecordformbuilder() {
	}
    public static PCBA staticBA = new PCBA(null, recentfilesmanagerrecordformbuilder.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _recentfiles = RemoteObject.declareNull("b4j.docU.b4xorderedmap");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _recentfileslistfile = RemoteObject.createImmutable("");
public static RemoteObject _mfilesmenu = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper");
public static RemoteObject _recentfiletag = RemoteObject.createImmutable("");
public static RemoteObject _maxfiles = RemoteObject.createImmutable(0);
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
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
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"MaxFiles",_ref.getField(false, "_maxfiles"),"mCallback",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mFilesMenu",_ref.getField(false, "_mfilesmenu"),"RecentFiles",_ref.getField(false, "_recentfiles"),"RecentFilesListFile",_ref.getField(false, "_recentfileslistfile"),"RecentFileTag",_ref.getField(false, "_recentfiletag"),"xui",_ref.getField(false, "_xui")};
}
}