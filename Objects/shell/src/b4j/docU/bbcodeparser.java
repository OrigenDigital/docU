
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bbcodeparser {
    public static RemoteObject myClass;
	public bbcodeparser() {
	}
    public static PCBA staticBA = new PCBA(null, bbcodeparser.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _allowedtags = RemoteObject.declareNull("b4j.docU.b4xset");
public static RemoteObject _stack = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _start = RemoteObject.createImmutable(0);
public static RemoteObject _mtextengine = RemoteObject.declareNull("b4j.docU.bctextengine");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _urlcolor = RemoteObject.createImmutable(0);
public static RemoteObject _colorsmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _errorstring = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
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
		return new Object[] {"AllowedTags",_ref.getField(false, "_allowedtags"),"ColorsMap",_ref.getField(false, "_colorsmap"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"ErrorString",_ref.getField(false, "_errorstring"),"mTextEngine",_ref.getField(false, "_mtextengine"),"Stack",_ref.getField(false, "_stack"),"Start",_ref.getField(false, "_start"),"UrlColor",_ref.getField(false, "_urlcolor"),"xui",_ref.getField(false, "_xui")};
}
}