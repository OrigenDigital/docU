
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class draganddrop {
    public static RemoteObject myClass;
	public draganddrop() {
	}
    public static PCBA staticBA = new PCBA(null, draganddrop.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _mode = RemoteObject.declareNull("Object");
public static RemoteObject _dataid = null;
public static RemoteObject _dataobject = null;
public static RemoteObject _dragboardimg = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
public static RemoteObject _dragboardimgoffsetx = RemoteObject.createImmutable(0);
public static RemoteObject _dragboardimgoffsety = RemoteObject.createImmutable(0);
public static RemoteObject _startdrag = RemoteObject.createImmutable(false);
public static RemoteObject _callback = RemoteObject.declareNull("Object");
public static RemoteObject _seventname = RemoteObject.createImmutable("");
public static RemoteObject _teventname = RemoteObject.createImmutable("");
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
		return new Object[] {"CallBack",_ref.getField(false, "_callback"),"CSSUtils",_ref.getField(false, "_cssutils"),"DataID",_ref.getField(false, "_dataid"),"DataObject",_ref.getField(false, "_dataobject"),"DateUtils",_ref.getField(false, "_dateutils"),"DragboardImg",_ref.getField(false, "_dragboardimg"),"DragboardImgOffsetX",_ref.getField(false, "_dragboardimgoffsetx"),"DragboardImgOffsetY",_ref.getField(false, "_dragboardimgoffsety"),"fx",_ref.getField(false, "_fx"),"Mode",_ref.getField(false, "_mode"),"sEventName",_ref.getField(false, "_seventname"),"StartDrag",_ref.getField(false, "_startdrag"),"tEventName",_ref.getField(false, "_teventname")};
}
}