
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class jamcircularprogressbar {
    public static RemoteObject myClass;
	public jamcircularprogressbar() {
	}
    public static PCBA staticBA = new PCBA(null, jamcircularprogressbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _cx = RemoteObject.createImmutable(0f);
public static RemoteObject _cy = RemoteObject.createImmutable(0f);
public static RemoteObject _radius = RemoteObject.createImmutable(0f);
public static RemoteObject _stroke = RemoteObject.createImmutable(0f);
public static RemoteObject _clrfull = RemoteObject.createImmutable(0);
public static RemoteObject _clrempty = RemoteObject.createImmutable(0);
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _currentvalue = RemoteObject.createImmutable(0f);
public static RemoteObject _durationfromzeroto100 = RemoteObject.createImmutable(0);
public static RemoteObject _mupdatelblbycode = RemoteObject.createImmutable(false);
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
		return new Object[] {"clrEmpty",_ref.getField(false, "_clrempty"),"clrFull",_ref.getField(false, "_clrfull"),"CSSUtils",_ref.getField(false, "_cssutils"),"currentValue",_ref.getField(false, "_currentvalue"),"cvs",_ref.getField(false, "_cvs"),"cx",_ref.getField(false, "_cx"),"cy",_ref.getField(false, "_cy"),"DateUtils",_ref.getField(false, "_dateutils"),"DurationFromZeroTo100",_ref.getField(false, "_durationfromzeroto100"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mLbl",_ref.getField(false, "_mlbl"),"mUpdateLblByCode",_ref.getField(false, "_mupdatelblbycode"),"radius",_ref.getField(false, "_radius"),"stroke",_ref.getField(false, "_stroke"),"xui",_ref.getField(false, "_xui")};
}
}