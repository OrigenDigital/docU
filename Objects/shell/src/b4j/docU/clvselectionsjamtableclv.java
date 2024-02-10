
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clvselectionsjamtableclv {
    public static RemoteObject myClass;
	public clvselectionsjamtableclv() {
	}
    public static PCBA staticBA = new PCBA(null, clvselectionsjamtableclv.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mode_single_item_temp = RemoteObject.createImmutable(0);
public static RemoteObject _mode_single_item_permanent = RemoteObject.createImmutable(0);
public static RemoteObject _mode_multiple_items = RemoteObject.createImmutable(0);
public static RemoteObject _mcurrentmode = RemoteObject.createImmutable(0);
public static RemoteObject _selecteditems = RemoteObject.declareNull("b4j.docU.b4xset");
public static RemoteObject _selectioncolor = RemoteObject.createImmutable(0);
public static RemoteObject _mclv = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _mpclv = RemoteObject.declareNull("b4j.docU.preoptimizedclv");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _unselectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _singlemode = RemoteObject.createImmutable(false);
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
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"mCLV",_ref.getField(false, "_mclv"),"mCurrentMode",_ref.getField(false, "_mcurrentmode"),"MODE_MULTIPLE_ITEMS",_ref.getField(false, "_mode_multiple_items"),"MODE_SINGLE_ITEM_PERMANENT",_ref.getField(false, "_mode_single_item_permanent"),"MODE_SINGLE_ITEM_TEMP",_ref.getField(false, "_mode_single_item_temp"),"mPCLV",_ref.getField(false, "_mpclv"),"SelectedItems",_ref.getField(false, "_selecteditems"),"SelectionColor",_ref.getField(false, "_selectioncolor"),"SingleMode",_ref.getField(false, "_singlemode"),"UnselectedColor",_ref.getField(false, "_unselectedcolor"),"xui",_ref.getField(false, "_xui")};
}
}