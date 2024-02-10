
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

public class jamrecordformbuilder implements IRemote{
	public static jamrecordformbuilder mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public jamrecordformbuilder() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new jamrecordformbuilder();
		remoteMe = RemoteObject.declareNull("b4j.docU.jamrecordformbuilder");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("jamrecordformbuilder"), "b4j.docU.jamrecordformbuilder");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, jamrecordformbuilder.class);
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
		pcBA = new PCBA(this, jamrecordformbuilder.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _version = RemoteObject.createImmutable("");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _clvlistacampos = RemoteObject.declareNull("b4j.example.customlistview");
public static RemoteObject _dialog = RemoteObject.declareNull("b4j.docU.b4xdialog");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dragger = RemoteObject.declareNull("b4j.docU.jamrecordformclvdragger");
public static RemoteObject _filechooser = RemoteObject.declareNull("anywheresoftware.b4j.objects.FileChooserWrapper");
public static RemoteObject _currentfile = RemoteObject.createImmutable("");
public static RemoteObject _currentfilestring = RemoteObject.createImmutable("");
public static RemoteObject _newfilestring = RemoteObject.createImmutable("");
public static RemoteObject _menubar1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper");
public static RemoteObject _recentmanager = RemoteObject.declareNull("b4j.docU.recentfilesmanagerrecordformbuilder");
public static RemoteObject _mmodo = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_textfield = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_b4xinputdialogtextfield = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_b4xlistdialogtextfield = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_b4xsearchlistdialogtextfield = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_combobox = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_lmb4xcombobox = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_checkbox = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_textfieldbuttonselfile = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_textfieldbuttonselfecha = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_textfieldbuttonselext = RemoteObject.createImmutable("");
public static RemoteObject _tipocontrol_textfieldindependiente = RemoteObject.createImmutable("");
public static RemoteObject _cargandodatos = RemoteObject.createImmutable(false);
public static RemoteObject _textareacampostotext = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _lbltitlecampo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitletipodato = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lblinfo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _colactual = RemoteObject.createImmutable(0);
public static RemoteObject _col1 = RemoteObject.createImmutable(0);
public static RemoteObject _col2 = RemoteObject.createImmutable(0);
public static RemoteObject _colitemsimpares = RemoteObject.createImmutable(0);
public static RemoteObject _colitemspares = RemoteObject.createImmutable(0);
public static RemoteObject _colitemsimparespredeterminado = RemoteObject.createImmutable(0);
public static RemoteObject _colitemsparespredeterminado = RemoteObject.createImmutable(0);
public static RemoteObject _prefdialog = RemoteObject.declareNull("b4j.docU.preferencesdialog");
public static RemoteObject _txtipjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtpuertojrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtnombretabla = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _pnlorigensql = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _lbltitleipjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitlepuertojrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitlenombretabla = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitledbms = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _datosorigendatos = RemoteObject.declareNull("b4j.docU.jamformregistro._tipoorigendatosjamformregistro");
public static RemoteObject _btneditarorigenjrdc = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lstnombrescampossql = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _lstprimarykey = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _corrigiendochkboxesfecha = RemoteObject.createImmutable(false);
public static RemoteObject _corrigiendochkboxcontroleditable = RemoteObject.createImmutable(false);
public static RemoteObject _cbotipocontrol = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _cbotipodato = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _chkboxesfecha = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _chkboxkeyid = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _txtcampo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txttitulocampo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtordencolumna = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _chkboxautoincremental = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _chkboxnonulo = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _txttipodatomysql = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtvalorcampopordefecto = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _chkboxcontroleditable = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _txtinfocampo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitlecampojointablaauxlmb4xcbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _lbltitlelistavalorescbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtlistavalorescbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitlecomandoconfiglmb4xcbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtcomandoconfiglmb4xcbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitleparametroscomandolmb4xcbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtparametroscomandolmb4xcbo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitletipodatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _cbotipodatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.ComboBoxWrapper");
public static RemoteObject _lbltitlecomandoconfigdatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtcomandoconfigdatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitleparametroscomandodatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtparametroscomandodatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitlenumcamposdatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _b4xplusminusnumcamposdatosaux = RemoteObject.declareNull("b4j.docU.b4xplusminus");
public static RemoteObject _lbltitlelistavaloresdatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtlistavaloresdatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _lbltitleipjrdcorigendatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtipjrdcorigendatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnigualorigendatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lbltitlepuertojrdcorigendatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _txtpuertojrdcorigendatosaux = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _btnadd = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _chkboxcontrolindependiente = RemoteObject.declareNull("anywheresoftware.b4j.objects.CheckboxWrapper");
public static RemoteObject _btndelete = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _lblcolorfondoitemsimpares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblcolorfondoitemspares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolorfondoitemsimpares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _lblresetcolorfondoitemspares = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtrgbcolorfondoitemsimpares = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _txtrgbcolorfondoitemspares = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _bccolorpickerjamtableview = RemoteObject.declareNull("b4j.docU.bccolorpicker");
public static RemoteObject _txtdbms = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
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
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"B4XCollections",Debug.moduleToString(b4j.docU.b4xcollections.class),"B4XPlusMinusNumCamposDatosAux",jamrecordformbuilder._b4xplusminusnumcamposdatosaux,"BCColorPickerjamTableView",jamrecordformbuilder._bccolorpickerjamtableview,"btnAdd",jamrecordformbuilder._btnadd,"btnDelete",jamrecordformbuilder._btndelete,"btnEditarOrigenJRDC",jamrecordformbuilder._btneditarorigenjrdc,"btnIgualOrigenDatosAux",jamrecordformbuilder._btnigualorigendatosaux,"CargandoDatos",jamrecordformbuilder._cargandodatos,"cboTipoControl",jamrecordformbuilder._cbotipocontrol,"cboTipoDato",jamrecordformbuilder._cbotipodato,"cboTipoDatosAux",jamrecordformbuilder._cbotipodatosaux,"chkBoxAutoIncremental",jamrecordformbuilder._chkboxautoincremental,"chkBoxControlEditable",jamrecordformbuilder._chkboxcontroleditable,"chkBoxControlIndependiente",jamrecordformbuilder._chkboxcontrolindependiente,"chkBoxEsFecha",jamrecordformbuilder._chkboxesfecha,"chkboxKeyID",jamrecordformbuilder._chkboxkeyid,"chkBoxNoNulo",jamrecordformbuilder._chkboxnonulo,"clvListaCampos",jamrecordformbuilder._clvlistacampos,"cmAuxCorreosExpress",Debug.moduleToString(b4j.docU.cmauxcorreosexpress.class),"cmAuxTxT",Debug.moduleToString(b4j.docU.cmauxtxt.class),"cmPermisos",Debug.moduleToString(b4j.docU.cmpermisos.class),"Col1",jamrecordformbuilder._col1,"Col2",jamrecordformbuilder._col2,"ColActual",jamrecordformbuilder._colactual,"ColItemsImpares",jamrecordformbuilder._colitemsimpares,"ColItemsImparesPredeterminado",jamrecordformbuilder._colitemsimparespredeterminado,"ColItemsPares",jamrecordformbuilder._colitemspares,"ColItemsParesPredeterminado",jamrecordformbuilder._colitemsparespredeterminado,"CorrigiendoChkBoxControlEditable",jamrecordformbuilder._corrigiendochkboxcontroleditable,"CorrigiendoChkBoxEsFecha",jamrecordformbuilder._corrigiendochkboxesfecha,"CSSUtils",jamrecordformbuilder._cssutils,"CurrentFile",jamrecordformbuilder._currentfile,"CurrentFileString",jamrecordformbuilder._currentfilestring,"DateUtils",jamrecordformbuilder._dateutils,"DatosOrigenDatos",jamrecordformbuilder._datosorigendatos,"DBUtils",Debug.moduleToString(b4j.docU.dbutils.class),"Dialog",jamrecordformbuilder._dialog,"dragger",jamrecordformbuilder._dragger,"FileChooser",jamrecordformbuilder._filechooser,"frm",jamrecordformbuilder._frm,"fx",jamrecordformbuilder._fx,"HttpUtils2Service",Debug.moduleToString(b4j.docU.httputils2service.class),"jamLinkNavision",Debug.moduleToString(b4j.docU.jamlinknavision.class),"jamTableViewCamposBuilder",Debug.moduleToString(b4j.docU.jamtableviewcamposbuilder.class),"JRDCQuery",Debug.moduleToString(b4j.docU.jrdcquery.class),"lblColorFondoItemsImpares",jamrecordformbuilder._lblcolorfondoitemsimpares,"lblColorFondoItemsPares",jamrecordformbuilder._lblcolorfondoitemspares,"lblInfo",jamrecordformbuilder._lblinfo,"lblResetColorFondoItemsImpares",jamrecordformbuilder._lblresetcolorfondoitemsimpares,"lblResetColorFondoItemsPares",jamrecordformbuilder._lblresetcolorfondoitemspares,"lblTitleCampo",jamrecordformbuilder._lbltitlecampo,"lblTitleCampoJoinTablaAuxlmB4XCbo",jamrecordformbuilder._lbltitlecampojointablaauxlmb4xcbo,"lblTitleComandoConfigDatosAux",jamrecordformbuilder._lbltitlecomandoconfigdatosaux,"lblTitleComandoConfiglmB4XCbo",jamrecordformbuilder._lbltitlecomandoconfiglmb4xcbo,"lblTitleDBMS",jamrecordformbuilder._lbltitledbms,"lblTitleIpJRDC",jamrecordformbuilder._lbltitleipjrdc,"lblTitleIPJrdcOrigenDatosAux",jamrecordformbuilder._lbltitleipjrdcorigendatosaux,"lblTitleListaValoresCbo",jamrecordformbuilder._lbltitlelistavalorescbo,"lblTitleListaValoresDatosAux",jamrecordformbuilder._lbltitlelistavaloresdatosaux,"lblTitleNombreTabla",jamrecordformbuilder._lbltitlenombretabla,"lblTitleNumCamposDatosAux",jamrecordformbuilder._lbltitlenumcamposdatosaux,"lblTitleParametrosComandoDatosAux",jamrecordformbuilder._lbltitleparametroscomandodatosaux,"lblTitleParametrosComandolmB4XCbo",jamrecordformbuilder._lbltitleparametroscomandolmb4xcbo,"lblTitlePuertoJRDC",jamrecordformbuilder._lbltitlepuertojrdc,"lblTitlePuertoJrdcOrigenDatosAux",jamrecordformbuilder._lbltitlepuertojrdcorigendatosaux,"lblTitleTipoDato",jamrecordformbuilder._lbltitletipodato,"lblTitleTipoDatosAux",jamrecordformbuilder._lbltitletipodatosaux,"lstNombresCamposSQL",jamrecordformbuilder._lstnombrescampossql,"lstPrimaryKey",jamrecordformbuilder._lstprimarykey,"Main",Debug.moduleToString(b4j.docU.main.class),"MainMenu2",Debug.moduleToString(b4j.docU.mainmenu2.class),"MenuBar1",jamrecordformbuilder._menubar1,"mModo",jamrecordformbuilder._mmodo,"NewFileString",jamrecordformbuilder._newfilestring,"pnlOrigenSQL",jamrecordformbuilder._pnlorigensql,"prefDialog",jamrecordformbuilder._prefdialog,"RecentManager",jamrecordformbuilder._recentmanager,"TextAreaCamposToText",jamrecordformbuilder._textareacampostotext,"TipoControl_B4XInputDialogTextField",jamrecordformbuilder._tipocontrol_b4xinputdialogtextfield,"TipoControl_B4XListDialogTextField",jamrecordformbuilder._tipocontrol_b4xlistdialogtextfield,"TipoControl_B4XSearchListDialogTextField",jamrecordformbuilder._tipocontrol_b4xsearchlistdialogtextfield,"TipoControl_CheckBox",jamrecordformbuilder._tipocontrol_checkbox,"TipoControl_ComboBox",jamrecordformbuilder._tipocontrol_combobox,"TipoControl_lmB4XComboBox",jamrecordformbuilder._tipocontrol_lmb4xcombobox,"TipoControl_TextField",jamrecordformbuilder._tipocontrol_textfield,"TipoControl_TextFieldButtonSelExt",jamrecordformbuilder._tipocontrol_textfieldbuttonselext,"TipoControl_TextFieldButtonSelFecha",jamrecordformbuilder._tipocontrol_textfieldbuttonselfecha,"TipoControl_TextFieldButtonSelFile",jamrecordformbuilder._tipocontrol_textfieldbuttonselfile,"TipoControl_TextFieldIndependiente",jamrecordformbuilder._tipocontrol_textfieldindependiente,"TransferMode",Debug.moduleToString(b4j.docU.transfermode.class),"txtCampo",jamrecordformbuilder._txtcampo,"txtComandoConfigDatosAux",jamrecordformbuilder._txtcomandoconfigdatosaux,"txtComandoConfiglmB4XCbo",jamrecordformbuilder._txtcomandoconfiglmb4xcbo,"txtDBMS",jamrecordformbuilder._txtdbms,"txtInfoCampo",jamrecordformbuilder._txtinfocampo,"txtIpJRDC",jamrecordformbuilder._txtipjrdc,"txtIPJrdcOrigenDatosAux",jamrecordformbuilder._txtipjrdcorigendatosaux,"txtListaValoresCbo",jamrecordformbuilder._txtlistavalorescbo,"txtListaValoresDatosAux",jamrecordformbuilder._txtlistavaloresdatosaux,"txtNombreTabla",jamrecordformbuilder._txtnombretabla,"txtOrdenColumna",jamrecordformbuilder._txtordencolumna,"txtParametrosComandoDatosAux",jamrecordformbuilder._txtparametroscomandodatosaux,"txtParametrosComandolmB4XCbo",jamrecordformbuilder._txtparametroscomandolmb4xcbo,"txtPuertoJRDC",jamrecordformbuilder._txtpuertojrdc,"txtPuertoJrdcOrigenDatosAux",jamrecordformbuilder._txtpuertojrdcorigendatosaux,"txtRGBColorFondoItemsImpares",jamrecordformbuilder._txtrgbcolorfondoitemsimpares,"txtRGBColorFondoItemsPares",jamrecordformbuilder._txtrgbcolorfondoitemspares,"txtTipoDatoMySQL",jamrecordformbuilder._txttipodatomysql,"txtTituloCampo",jamrecordformbuilder._txttitulocampo,"txtValorCampoPorDefecto",jamrecordformbuilder._txtvalorcampopordefecto,"Utilidades",Debug.moduleToString(b4j.docU.utilidades.class),"Version",jamrecordformbuilder._version,"xui",jamrecordformbuilder._xui,"XUIViewsUtils",Debug.moduleToString(b4j.docU.xuiviewsutils.class)};
}
}