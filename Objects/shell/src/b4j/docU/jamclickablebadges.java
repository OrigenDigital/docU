
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class jamclickablebadges {
    public static RemoteObject myClass;
	public jamclickablebadges() {
	}
    public static PCBA staticBA = new PCBA(null, jamclickablebadges.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mviews = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _stub = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lstbadges = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _datatypestring = RemoteObject.createImmutable("");
public static RemoteObject _datatypeint = RemoteObject.createImmutable("");
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
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DataTypeInt",_ref.getField(false, "_datatypeint"),"DataTypeString",_ref.getField(false, "_datatypestring"),"DateUtils",_ref.getField(false, "_dateutils"),"lstBadges",_ref.getField(false, "_lstbadges"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mViews",_ref.getField(false, "_mviews"),"stub",_ref.getField(false, "_stub"),"xui",_ref.getField(false, "_xui")};
}
}