
package b4j.docU;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class jamtableviewcamposbuilder implements IRemote{
	public static jamtableviewcamposbuilder mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public jamtableviewcamposbuilder() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new jamtableviewcamposbuilder();
		remoteMe = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("jamtableviewcamposbuilder"), "b4j.docU.jamtableviewcamposbuilder");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, jamtableviewcamposbuilder.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, jamtableviewcamposbuilder.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _version = RemoteObject.createImmutable(0f);
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _clvlistacampos = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dragger = RemoteObject.declareNull("b4j.docU.jamtableviewclvdragger");
public static RemoteObject _filechooser = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
public static RemoteObject _currentfile = RemoteObject.createImmutable("");
public static RemoteObject _currentfilestring = RemoteObject.createImmutable("");
public static RemoteObject _menubar1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
public static RemoteObject _cmbtheme = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _txtid = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _cbocampo = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _txtaliascampo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _cbotipodato = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _chkcolumnatableview = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _chkboxesfecha = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _chkboxcampocalculado = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _txtencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _b4xplusminusancho = RemoteObject.declareNull("b4j.docU.b4xplusminus");
public static RemoteObject _txtordencolumna = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _chkcolumnaocultable = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _cbotipocontrolfiltro = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _chkboxkeyid = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _lblordenkeyid = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _chkboxnonulo = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _chkboxconvalordefecto = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _txtvalordefecto = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _b4xplusminusanchobordecelda = RemoteObject.declareNull("b4j.docU.b4xplusminus");
public static RemoteObject _cboalineacioncolumna = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _cbotipocontroledicion = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _chkboxesbooleano = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _txtvalortruecampobooleano = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnombrecampodialogosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _tipocontrolfiltro_textfield = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrolfiltro_combobox = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrolfiltro_checkbox = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrolfiltro_textfieldbutton = RemoteObject.createImmutable("");
public static RemoteObject _cargandodatos = RemoteObject.createImmutable(false);
public static RemoteObject _btncargarlistacamposquerysql = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btncampostotext = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btntexttocampos = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lbltitlecampo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitleencabezado = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitletipodato = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblinfo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _colactual = RemoteObject.createImmutable(0);
public static RemoteObject _col1 = RemoteObject.createImmutable(0);
public static RemoteObject _col2 = RemoteObject.createImmutable(0);
public static RemoteObject _prefdialog = RemoteObject.declareNull("b4j.docU.preferencesdialog");
public static RemoteObject _txtipjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtpuertojrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtcomandojrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtparametrosjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txttipoorigendatos = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _pnlorigensql = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _lbltitletipoorigendatos = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitleipjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitlepuertojrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitlecomandojrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitleparametrosjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _datosorigendatos = RemoteObject.declareNull("b4j.docU.jamtableviewcamposbuilder._tipoorigendatos");
public static RemoteObject _fechaultimamodificacion = RemoteObject.createImmutable(0L);
public static RemoteObject _btneditarorigenjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lstprimarykey = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _corrigiendochkboxesfecha = RemoteObject.createImmutable(false);
public static RemoteObject _corrigiendochkboxkeyid = RemoteObject.createImmutable(false);
public static RemoteObject _corrigiendochkboxesbooleano = RemoteObject.createImmutable(false);
public static RemoteObject _btnvaloresestilodefecto = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _btnvaloresestilodefectotodos = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lblcolorfondoencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolortextoencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorfondoencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolortextoencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolorfondoencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolortextoencabezados = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolorfondopanelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolortextopanelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorfondopanelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolorfondopanelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolortextopanelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolortextopanelinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolortexto = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolorfondo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolorborde = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolorfondofilasimpares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolorfondofilaspares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorfondofilasimpares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorfondofilaspares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _resetcolorfondofilasimpares = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblresetcolorfondofilaspares = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _bccolorpickerjamtableview = RemoteObject.declareNull("b4j.docU.bccolorpicker");
public static RemoteObject _lblcolorfondoencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorfondoencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolorfondoencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolortextoencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolortextoencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolortextoencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolortexto = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorfondo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolorfondo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorborde = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolorborde = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolortexto = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnayudacolorcontrastebordeseleccion = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lblcontrastefondovsbordeseleccionok = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _mmodosnap = RemoteObject.createImmutable(false);
public static RemoteObject _offsetanterior = RemoteObject.createImmutable(0);
public static RemoteObject _primerpanelvisibleanterior = RemoteObject.createImmutable(0);
public static RemoteObject _scrollingdown = RemoteObject.createImmutable(false);
public static RemoteObject _btnbuscaraliascampo = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btneditarencabezadocolumna = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
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
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.docU.b4xcollections.class),"B4XPlusMinusAncho",jamtableviewcamposbuilder._b4xplusminusancho,"B4XPlusMinusAnchoBordeCelda",jamtableviewcamposbuilder._b4xplusminusanchobordecelda,"BCColorPickerjamTableView",jamtableviewcamposbuilder._bccolorpickerjamtableview,"btnAyudaColorContrasteBordeSeleccion",jamtableviewcamposbuilder._btnayudacolorcontrastebordeseleccion,"btnBuscarAliasCampo",jamtableviewcamposbuilder._btnbuscaraliascampo,"btnCamposToText",jamtableviewcamposbuilder._btncampostotext,"btnCargarListaCamposQuerySQL",jamtableviewcamposbuilder._btncargarlistacamposquerysql,"btnEditarEncabezadoColumna",jamtableviewcamposbuilder._btneditarencabezadocolumna,"btnEditarOrigenJRDC",jamtableviewcamposbuilder._btneditarorigenjrdc,"btnTextToCampos",jamtableviewcamposbuilder._btntexttocampos,"btnValoresEstiloDefecto",jamtableviewcamposbuilder._btnvaloresestilodefecto,"btnValoresEstiloDefectoTodos",jamtableviewcamposbuilder._btnvaloresestilodefectotodos,"CargandoDatos",jamtableviewcamposbuilder._cargandodatos,"cboAlineacionColumna",jamtableviewcamposbuilder._cboalineacioncolumna,"cboCampo",jamtableviewcamposbuilder._cbocampo,"cboTipoControlEdicion",jamtableviewcamposbuilder._cbotipocontroledicion,"cboTipoControlFiltro",jamtableviewcamposbuilder._cbotipocontrolfiltro,"cboTipoDato",jamtableviewcamposbuilder._cbotipodato,"chkBoxCampoCalculado",jamtableviewcamposbuilder._chkboxcampocalculado,"chkBoxConValorDefecto",jamtableviewcamposbuilder._chkboxconvalordefecto,"chkBoxEsBooleano",jamtableviewcamposbuilder._chkboxesbooleano,"chkBoxEsFecha",jamtableviewcamposbuilder._chkboxesfecha,"chkboxKeyID",jamtableviewcamposbuilder._chkboxkeyid,"chkBoxNoNulo",jamtableviewcamposbuilder._chkboxnonulo,"chkColumnaOcultable",jamtableviewcamposbuilder._chkcolumnaocultable,"chkColumnaTableView",jamtableviewcamposbuilder._chkcolumnatableview,"clvListaCampos",jamtableviewcamposbuilder._clvlistacampos,"cmAuxCorreosExpress",Debug.moduleToString(b4j.docU.cmauxcorreosexpress.class),"cmAuxTxT",Debug.moduleToString(b4j.docU.cmauxtxt.class),"cmbTheme",jamtableviewcamposbuilder._cmbtheme,"cmPermisos",Debug.moduleToString(b4j.docU.cmpermisos.class),"Col1",jamtableviewcamposbuilder._col1,"Col2",jamtableviewcamposbuilder._col2,"ColActual",jamtableviewcamposbuilder._colactual,"CorrigiendoChkBoxEsBooleano",jamtableviewcamposbuilder._corrigiendochkboxesbooleano,"CorrigiendoChkBoxEsFecha",jamtableviewcamposbuilder._corrigiendochkboxesfecha,"CorrigiendoChkBoxKeyID",jamtableviewcamposbuilder._corrigiendochkboxkeyid,"CSSUtils",jamtableviewcamposbuilder._cssutils,"CurrentFile",jamtableviewcamposbuilder._currentfile,"CurrentFileString",jamtableviewcamposbuilder._currentfilestring,"DateUtils",jamtableviewcamposbuilder._dateutils,"DatosOrigenDatos",jamtableviewcamposbuilder._datosorigendatos,"DBUtils",Debug.moduleToString(b4j.docU.dbutils.class),"Dialog",jamtableviewcamposbuilder._dialog,"dragger",jamtableviewcamposbuilder._dragger,"FechaUltimaModificacion",jamtableviewcamposbuilder._fechaultimamodificacion,"FileChooser",jamtableviewcamposbuilder._filechooser,"frm",jamtableviewcamposbuilder._frm,"fx",jamtableviewcamposbuilder._fx,"HttpUtils2Service",Debug.moduleToString(b4j.docU.httputils2service.class),"jamLinkNavision",Debug.moduleToString(b4j.docU.jamlinknavision.class),"jamRecordFormBuilder",Debug.moduleToString(b4j.docU.jamrecordformbuilder.class),"JRDCQuery",Debug.moduleToString(b4j.docU.jrdcquery.class),"lblColorBorde",jamtableviewcamposbuilder._lblcolorborde,"lblColorFondo",jamtableviewcamposbuilder._lblcolorfondo,"lblColorFondoEncabezadoColumna",jamtableviewcamposbuilder._lblcolorfondoencabezadocolumna,"lblColorFondoEncabezados",jamtableviewcamposbuilder._lblcolorfondoencabezados,"lblColorFondoFilasImpares",jamtableviewcamposbuilder._lblcolorfondofilasimpares,"lblColorFondoFilasPares",jamtableviewcamposbuilder._lblcolorfondofilaspares,"lblColorFondoPanelInfo",jamtableviewcamposbuilder._lblcolorfondopanelinfo,"lblColorTexto",jamtableviewcamposbuilder._lblcolortexto,"lblColorTextoEncabezadoColumna",jamtableviewcamposbuilder._lblcolortextoencabezadocolumna,"lblColorTextoEncabezados",jamtableviewcamposbuilder._lblcolortextoencabezados,"lblColorTextoPanelInfo",jamtableviewcamposbuilder._lblcolortextopanelinfo,"lblContrasteFondoVsBordeSeleccionOK",jamtableviewcamposbuilder._lblcontrastefondovsbordeseleccionok,"lblInfo",jamtableviewcamposbuilder._lblinfo,"lblOrdenKeyID",jamtableviewcamposbuilder._lblordenkeyid,"lblResetColorBorde",jamtableviewcamposbuilder._lblresetcolorborde,"lblResetColorFondo",jamtableviewcamposbuilder._lblresetcolorfondo,"lblResetColorFondoEncabezadoColumna",jamtableviewcamposbuilder._lblresetcolorfondoencabezadocolumna,"lblResetColorFondoEncabezados",jamtableviewcamposbuilder._lblresetcolorfondoencabezados,"lblResetColorFondoFilasPares",jamtableviewcamposbuilder._lblresetcolorfondofilaspares,"lblResetColorFondoPanelInfo",jamtableviewcamposbuilder._lblresetcolorfondopanelinfo,"lblResetColorTexto",jamtableviewcamposbuilder._lblresetcolortexto,"lblResetColorTextoEncabezadoColumna",jamtableviewcamposbuilder._lblresetcolortextoencabezadocolumna,"lblResetColorTextoEncabezados",jamtableviewcamposbuilder._lblresetcolortextoencabezados,"lblResetColorTextoPanelInfo",jamtableviewcamposbuilder._lblresetcolortextopanelinfo,"lblTitleCampo",jamtableviewcamposbuilder._lbltitlecampo,"lblTitleComandoJRDC",jamtableviewcamposbuilder._lbltitlecomandojrdc,"lblTitleEncabezado",jamtableviewcamposbuilder._lbltitleencabezado,"lblTitleIpJRDC",jamtableviewcamposbuilder._lbltitleipjrdc,"lblTitleParametrosJRDC",jamtableviewcamposbuilder._lbltitleparametrosjrdc,"lblTitlePuertoJRDC",jamtableviewcamposbuilder._lbltitlepuertojrdc,"lblTitleTipoDato",jamtableviewcamposbuilder._lbltitletipodato,"lblTitleTipoOrigenDatos",jamtableviewcamposbuilder._lbltitletipoorigendatos,"lstPrimaryKey",jamtableviewcamposbuilder._lstprimarykey,"Main",Debug.moduleToString(b4j.docU.main.class),"MainMenu2",Debug.moduleToString(b4j.docU.mainmenu2.class),"MenuBar1",jamtableviewcamposbuilder._menubar1,"mModoSnap",jamtableviewcamposbuilder._mmodosnap,"OffsetAnterior",jamtableviewcamposbuilder._offsetanterior,"pnlOrigenSQL",jamtableviewcamposbuilder._pnlorigensql,"prefDialog",jamtableviewcamposbuilder._prefdialog,"PrimerPanelVisibleAnterior",jamtableviewcamposbuilder._primerpanelvisibleanterior,"ResetColorFondoFilasImpares",jamtableviewcamposbuilder._resetcolorfondofilasimpares,"ScrollingDown",jamtableviewcamposbuilder._scrollingdown,"TipoControlFiltro_CheckBox",jamtableviewcamposbuilder._tipocontrolfiltro_checkbox,"TipoControlFiltro_ComboBox",jamtableviewcamposbuilder._tipocontrolfiltro_combobox,"TipoControlFiltro_TextField",jamtableviewcamposbuilder._tipocontrolfiltro_textfield,"TipoControlFiltro_TextFieldButton",jamtableviewcamposbuilder._tipocontrolfiltro_textfieldbutton,"TransferMode",Debug.moduleToString(b4j.docU.transfermode.class),"txtAliasCampo",jamtableviewcamposbuilder._txtaliascampo,"txtComandoJRDC",jamtableviewcamposbuilder._txtcomandojrdc,"txtEncabezadoColumna",jamtableviewcamposbuilder._txtencabezadocolumna,"txtID",jamtableviewcamposbuilder._txtid,"txtIpJRDC",jamtableviewcamposbuilder._txtipjrdc,"txtNombreCampoDialogosAux",jamtableviewcamposbuilder._txtnombrecampodialogosaux,"txtOrdenColumna",jamtableviewcamposbuilder._txtordencolumna,"txtParametrosJRDC",jamtableviewcamposbuilder._txtparametrosjrdc,"txtPuertoJRDC",jamtableviewcamposbuilder._txtpuertojrdc,"txtRGBColorBorde",jamtableviewcamposbuilder._txtrgbcolorborde,"txtRGBColorFondo",jamtableviewcamposbuilder._txtrgbcolorfondo,"txtRGBColorFondoEncabezadoColumna",jamtableviewcamposbuilder._txtrgbcolorfondoencabezadocolumna,"txtRGBColorFondoEncabezados",jamtableviewcamposbuilder._txtrgbcolorfondoencabezados,"txtRGBColorFondoFilasImpares",jamtableviewcamposbuilder._txtrgbcolorfondofilasimpares,"txtRGBColorFondoFilasPares",jamtableviewcamposbuilder._txtrgbcolorfondofilaspares,"txtRGBColorFondoPanelInfo",jamtableviewcamposbuilder._txtrgbcolorfondopanelinfo,"txtRGBColorTexto",jamtableviewcamposbuilder._txtrgbcolortexto,"txtRGBColorTextoEncabezadoColumna",jamtableviewcamposbuilder._txtrgbcolortextoencabezadocolumna,"txtRGBColorTextoEncabezados",jamtableviewcamposbuilder._txtrgbcolortextoencabezados,"txtRGBColorTextoPanelInfo",jamtableviewcamposbuilder._txtrgbcolortextopanelinfo,"txtTipoOrigenDatos",jamtableviewcamposbuilder._txttipoorigendatos,"txtValorDefecto",jamtableviewcamposbuilder._txtvalordefecto,"txtValorTrueCampoBooleano",jamtableviewcamposbuilder._txtvalortruecampobooleano,"Utilidades",Debug.moduleToString(b4j.docU.utilidades.class),"version",jamtableviewcamposbuilder._version,"xui",jamtableviewcamposbuilder._xui,"XUIViewsUtils",Debug.moduleToString(b4j.docU.xuiviewsutils.class)};
}
}