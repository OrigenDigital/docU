
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class canalisistarifasinfoventas {
    public static RemoteObject myClass;
	public canalisistarifasinfoventas() {
	}
    public static PCBA staticBA = new PCBA(null, canalisistarifasinfoventas.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _jamtableview1 = RemoteObject.declareNull("b4j.docU.jamtableview");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mdatoslineaseleccionada = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mtipotarifa = RemoteObject.createImmutable(0);
public static RemoteObject _mcodigotarifa = RemoteObject.createImmutable("");
public static RemoteObject _marticulo = RemoteObject.createImmutable("");
public static RemoteObject _mdescripcionarticulo = RemoteObject.createImmutable("");
public static RemoteObject _mfechainicialventas = RemoteObject.createImmutable(0L);
public static RemoteObject _mfechafinalventas = RemoteObject.createImmutable(0L);
public static RemoteObject _btnsalir = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _txtarticulo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtdescripcionarticulo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
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
		return new Object[] {"Background",_ref.getField(false, "_background"),"btnSalir",_ref.getField(false, "_btnsalir"),"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"Dialog",_ref.getField(false, "_dialog"),"frm",_ref.getField(false, "_frm"),"fx",_ref.getField(false, "_fx"),"jamTableView1",_ref.getField(false, "_jamtableview1"),"mArticulo",_ref.getField(false, "_marticulo"),"mCallBack",_ref.getField(false, "_mcallback"),"mCodigoTarifa",_ref.getField(false, "_mcodigotarifa"),"mDatosLineaSeleccionada",_ref.getField(false, "_mdatoslineaseleccionada"),"mDescripcionArticulo",_ref.getField(false, "_mdescripcionarticulo"),"mFechaFinalVentas",_ref.getField(false, "_mfechafinalventas"),"mFechaInicialVentas",_ref.getField(false, "_mfechainicialventas"),"mParent",_ref.getField(false, "_mparent"),"mTipoTarifa",_ref.getField(false, "_mtipotarifa"),"txtArticulo",_ref.getField(false, "_txtarticulo"),"txtDescripcionArticulo",_ref.getField(false, "_txtdescripcionarticulo"),"xui",_ref.getField(false, "_xui")};
}
}