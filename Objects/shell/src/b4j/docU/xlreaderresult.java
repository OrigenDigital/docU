
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class xlreaderresult {
    public static RemoteObject myClass;
	public xlreaderresult() {
	}
    public static PCBA staticBA = new PCBA(null, xlreaderresult.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _topleft = RemoteObject.declareNull("b4j.docU.xlutils._xladdress");
public static RemoteObject _bottomright = RemoteObject.declareNull("b4j.docU.xlutils._xladdress");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _xl = RemoteObject.declareNull("b4j.docU.xlutils");
public static RemoteObject _defaultemptycellvalue = RemoteObject.declareNull("Object");
public static RemoteObject _hyperlinks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
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
		return new Object[] {"BottomRight",_ref.getField(false, "_bottomright"),"CSSUtils",_ref.getField(false, "_cssutils"),"Data",_ref.getField(false, "_data"),"DateUtils",_ref.getField(false, "_dateutils"),"DefaultEmptyCellValue",_ref.getField(false, "_defaultemptycellvalue"),"Hyperlinks",_ref.getField(false, "_hyperlinks"),"Name",_ref.getField(false, "_name"),"TopLeft",_ref.getField(false, "_topleft"),"xl",_ref.getField(false, "_xl")};
}
}