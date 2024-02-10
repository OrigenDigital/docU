
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xlworkbookwriter {
    public static RemoteObject myClass;
	public xlworkbookwriter() {
	}
    public static PCBA staticBA = new PCBA(null, xlworkbookwriter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _poiworkbook = RemoteObject.declareNull("anywheresoftware.b4j.objects.PoiWorkbookWrapper");
public static RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
public static RemoteObject _fromtemplate = RemoteObject.createImmutable(false);
public static RemoteObject _jworkbook = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
public static RemoteObject _maxrows = RemoteObject.createImmutable(0);
public static RemoteObject _maxcolumns = RemoteObject.createImmutable(0);
public static RemoteObject _mversionname = RemoteObject.createImmutable("");
public static RemoteObject _isxlsx = RemoteObject.createImmutable(false);
public static RemoteObject _defaultfontname = RemoteObject.createImmutable("");
public static RemoteObject _defaultfontsize = RemoteObject.createImmutable((short)0);
public static RemoteObject _defaultextension = RemoteObject.createImmutable("");
public static RemoteObject _internalstylescache = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _internalstyleshorts = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _internalstylebooleans = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _internalstyleints = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _internalstylestrings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _internalallsimplemethods = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _internalnameregex = RemoteObject.createImmutable("");
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
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultExtension",_ref.getField(false, "_defaultextension"),"DefaultFontName",_ref.getField(false, "_defaultfontname"),"DefaultFontSize",_ref.getField(false, "_defaultfontsize"),"FromTemplate",_ref.getField(false, "_fromtemplate"),"InternalAllSimpleMethods",_ref.getField(false, "_internalallsimplemethods"),"InternalNameRegex",_ref.getField(false, "_internalnameregex"),"InternalStyleBooleans",_ref.getField(false, "_internalstylebooleans"),"InternalStyleInts",_ref.getField(false, "_internalstyleints"),"InternalStylesCache",_ref.getField(false, "_internalstylescache"),"InternalStyleShorts",_ref.getField(false, "_internalstyleshorts"),"InternalStyleStrings",_ref.getField(false, "_internalstylestrings"),"IsXLSX",_ref.getField(false, "_isxlsx"),"jWorkbook",_ref.getField(false, "_jworkbook"),"MaxColumns",_ref.getField(false, "_maxcolumns"),"MaxRows",_ref.getField(false, "_maxrows"),"mVersionName",_ref.getField(false, "_mversionname"),"PoiWorkbook",_ref.getField(false, "_poiworkbook"),"xl",_ref.getField(false, "_xl")};
}
}