
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class jamloadingindicator {
    public static RemoteObject myClass;
	public jamloadingindicator() {
	}
    public static PCBA staticBA = new PCBA(null, jamloadingindicator.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mparent = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mbaseloadingindicator = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _index = RemoteObject.createImmutable(0);
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
public static RemoteObject _mancholoadingindicator = RemoteObject.createImmutable(0);
public static RemoteObject _mdrawingsubname = RemoteObject.createImmutable("");
public static RemoteObject _background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mcolorpanelfondo = RemoteObject.createImmutable(0);
public static RemoteObject _mestilo = RemoteObject.createImmutable("");
public static RemoteObject _mcolorindicator = RemoteObject.createImmutable(0);
public static RemoteObject _mduracionciclo = RemoteObject.createImmutable(0);
public static RemoteObject _mpanelfondoloadingindicatorcanvasmensaje = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mcolorpanelfondoloadingindicatorcanvasmensaje = RemoteObject.createImmutable(0);
public static RemoteObject _mlabelmensaje = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mmensajeloading = RemoteObject.declareNull("Object");
public static RemoteObject _mtamanofuentemensaje = RemoteObject.createImmutable(0f);
public static RemoteObject _mcolorfondolabelmensaje = RemoteObject.createImmutable(0);
public static RemoteObject _mcolormensaje = RemoteObject.createImmutable(0);
public static RemoteObject _mancholabelmensaje = RemoteObject.createImmutable(0);
public static RemoteObject _malineacionhorizontalmensaje = RemoteObject.createImmutable("");
public static RemoteObject _mlabelcontroltiempoproceso = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mlstestilos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mmostrartiempoproceso = RemoteObject.createImmutable(false);
public static RemoteObject _ticksiniciocontroltiempoproceso = RemoteObject.createImmutable(0L);
public static RemoteObject _timercontroltiempoproceso = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static RemoteObject _mintervalotimercontroltiempoproceso = RemoteObject.createImmutable(0);
public static RemoteObject _mtextocontroltiempoproceso = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_threecircles1 = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_threecircles1b = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_threecircles2 = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_threecircles3 = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_singlecircle = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_fivelines1 = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_tenlines = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_arc1 = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_arc2 = RemoteObject.createImmutable("");
public static RemoteObject _jamloadingindicatorestilo_pacman = RemoteObject.createImmutable("");
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
		return new Object[] {"Background",_ref.getField(false, "_background"),"CSSUtils",_ref.getField(false, "_cssutils"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"index",_ref.getField(false, "_index"),"JamLoadingIndicatorEstilo_Arc1",_ref.getField(false, "_jamloadingindicatorestilo_arc1"),"JamLoadingIndicatorEstilo_Arc2",_ref.getField(false, "_jamloadingindicatorestilo_arc2"),"JamLoadingIndicatorEstilo_FiveLines1",_ref.getField(false, "_jamloadingindicatorestilo_fivelines1"),"JamLoadingIndicatorEstilo_PacMan",_ref.getField(false, "_jamloadingindicatorestilo_pacman"),"JamLoadingIndicatorEstilo_SingleCircle",_ref.getField(false, "_jamloadingindicatorestilo_singlecircle"),"JamLoadingIndicatorEstilo_TenLines",_ref.getField(false, "_jamloadingindicatorestilo_tenlines"),"JamLoadingIndicatorEstilo_ThreeCircles1",_ref.getField(false, "_jamloadingindicatorestilo_threecircles1"),"JamLoadingIndicatorEstilo_ThreeCircles1b",_ref.getField(false, "_jamloadingindicatorestilo_threecircles1b"),"JamLoadingIndicatorEstilo_ThreeCircles2",_ref.getField(false, "_jamloadingindicatorestilo_threecircles2"),"JamLoadingIndicatorEstilo_ThreeCircles3",_ref.getField(false, "_jamloadingindicatorestilo_threecircles3"),"mAlineacionHorizontalMensaje",_ref.getField(false, "_malineacionhorizontalmensaje"),"mAnchoLabelMensaje",_ref.getField(false, "_mancholabelmensaje"),"mAnchoLoadingIndicator",_ref.getField(false, "_mancholoadingindicator"),"mBaseLoadingIndicator",_ref.getField(false, "_mbaseloadingindicator"),"mCallBack",_ref.getField(false, "_mcallback"),"mColorFondoLabelMensaje",_ref.getField(false, "_mcolorfondolabelmensaje"),"mColorIndicator",_ref.getField(false, "_mcolorindicator"),"mColorMensaje",_ref.getField(false, "_mcolormensaje"),"mColorPanelFondo",_ref.getField(false, "_mcolorpanelfondo"),"mColorPanelFondoLoadingIndicatorCanvasMensaje",_ref.getField(false, "_mcolorpanelfondoloadingindicatorcanvasmensaje"),"mDrawingSubName",_ref.getField(false, "_mdrawingsubname"),"mDuracionCiclo",_ref.getField(false, "_mduracionciclo"),"mEstilo",_ref.getField(false, "_mestilo"),"mIntervaloTimerControlTiempoProceso",_ref.getField(false, "_mintervalotimercontroltiempoproceso"),"mLabelControlTiempoProceso",_ref.getField(false, "_mlabelcontroltiempoproceso"),"mLabelMensaje",_ref.getField(false, "_mlabelmensaje"),"mlstEstilos",_ref.getField(false, "_mlstestilos"),"mMensajeLoading",_ref.getField(false, "_mmensajeloading"),"mMostrarTiempoProceso",_ref.getField(false, "_mmostrartiempoproceso"),"mPanelFondoLoadingIndicatorCanvasMensaje",_ref.getField(false, "_mpanelfondoloadingindicatorcanvasmensaje"),"mParent",_ref.getField(false, "_mparent"),"mTamanoFuenteMensaje",_ref.getField(false, "_mtamanofuentemensaje"),"mTextoControlTiempoProceso",_ref.getField(false, "_mtextocontroltiempoproceso"),"TicksInicioControlTiempoProceso",_ref.getField(false, "_ticksiniciocontroltiempoproceso"),"TimerControlTiempoProceso",_ref.getField(false, "_timercontroltiempoproceso"),"xui",_ref.getField(false, "_xui")};
}
}