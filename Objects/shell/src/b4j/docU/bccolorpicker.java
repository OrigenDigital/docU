
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bccolorpicker {
    public static RemoteObject myClass;
	public bccolorpicker() {
	}
    public static PCBA staticBA = new PCBA(null, bccolorpicker.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _selectedalpha = RemoteObject.createImmutable(0);
public static RemoteObject _bccolors = RemoteObject.declareNull("b4j.example.bitmapcreator");
public static RemoteObject _selectedh = RemoteObject.createImmutable(0f);
public static RemoteObject _selecteds = RemoteObject.createImmutable(0f);
public static RemoteObject _selectedv = RemoteObject.createImmutable(0f);
public static RemoteObject _devicescale = RemoteObject.createImmutable(0f);
public static RemoteObject _colorscale = RemoteObject.createImmutable(0f);
public static RemoteObject _dont_change = RemoteObject.createImmutable(0);
public static RemoteObject _huebar = RemoteObject.declareNull("b4j.docU.b4xcolortemplate._colorpickerpart");
public static RemoteObject _colorpicker = RemoteObject.declareNull("b4j.docU.b4xcolortemplate._colorpickerpart");
public static RemoteObject _alphabar = RemoteObject.declareNull("b4j.docU.b4xcolortemplate._colorpickerpart");
public static RemoteObject _borderscolor = RemoteObject.createImmutable(0);
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _lstcolors = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _byteconverter = RemoteObject.declareNull("anywheresoftware.b4a.agraham.byteconverter.ByteConverter");
public static RemoteObject _currentselectedhex = RemoteObject.createImmutable("");
public static RemoteObject _textchangedindex = RemoteObject.createImmutable(0);
public static RemoteObject _txtnewvalue = RemoteObject.declareNull("b4j.docU.b4xfloattextfield");
public static RemoteObject _colorpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _colorlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mapofnamedcolors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cselections = RemoteObject.declareNull("b4j.docU.clvselectionsjamtableview");
public static RemoteObject _pnlpreview = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _pnlprevvalue = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
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
		return new Object[] {"AlphaBar",_ref.getField(false, "_alphabar"),"bcColors",_ref.getField(false, "_bccolors"),"BordersColor",_ref.getField(false, "_borderscolor"),"ByteConverter",_ref.getField(false, "_byteconverter"),"ColorLabel",_ref.getField(false, "_colorlabel"),"ColorPanel",_ref.getField(false, "_colorpanel"),"ColorPicker",_ref.getField(false, "_colorpicker"),"ColorScale",_ref.getField(false, "_colorscale"),"CSelections",_ref.getField(false, "_cselections"),"CSSUtils",_ref.getField(false, "_cssutils"),"CurrentSelectedHex",_ref.getField(false, "_currentselectedhex"),"DateUtils",_ref.getField(false, "_dateutils"),"DeviceScale",_ref.getField(false, "_devicescale"),"DONT_CHANGE",_ref.getField(false, "_dont_change"),"HueBar",_ref.getField(false, "_huebar"),"lstColors",_ref.getField(false, "_lstcolors"),"MapOfNamedColors",_ref.getField(false, "_mapofnamedcolors"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"pnlPreview",_ref.getField(false, "_pnlpreview"),"pnlPrevValue",_ref.getField(false, "_pnlprevvalue"),"SelectedAlpha",_ref.getField(false, "_selectedalpha"),"selectedH",_ref.getField(false, "_selectedh"),"selectedS",_ref.getField(false, "_selecteds"),"selectedV",_ref.getField(false, "_selectedv"),"Tag",_ref.getField(false, "_tag"),"TextChangedIndex",_ref.getField(false, "_textchangedindex"),"txtNewValue",_ref.getField(false, "_txtnewvalue"),"xui",_ref.getField(false, "_xui")};
}
}