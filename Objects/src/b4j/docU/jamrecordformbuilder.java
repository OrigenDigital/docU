package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class jamrecordformbuilder extends Object{
public static jamrecordformbuilder mostCurrent = new jamrecordformbuilder();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamrecordformbuilder", null);
		ba.loadHtSubs(jamrecordformbuilder.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.jamrecordformbuilder", ba);
		}
	}
    public static Class<?> getObject() {
		return jamrecordformbuilder.class;
	}

 
public static class _clvrecordformitemvalue{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxControlIndependiente;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtCampo;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtTituloCampo;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtTipoDatoMySQL;
public anywheresoftware.b4j.objects.CheckboxWrapper chkboxKeyID;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboTipoDato;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxEsFecha;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxNoNulo;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxAutoIncremental;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtValorCampoPorDefecto;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboTipoControl;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxControlEditable;
public anywheresoftware.b4j.objects.LabelWrapper lblTitleTipoDatosAux;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboTipoDatosAux;
public anywheresoftware.b4j.objects.LabelWrapper lblTitleListaValoresDatosAux;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtListaValoresDatosAux;
public anywheresoftware.b4j.objects.ButtonWrapper btnIgualOrigenDatosAux;
public anywheresoftware.b4j.objects.LabelWrapper lblTitleIPJrdcOrigenDatosAux;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtIPJrdcOrigenDatosAux;
public anywheresoftware.b4j.objects.LabelWrapper lblTitlePuertoJrdcOrigenDatosAux;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtPuertoJrdcOrigenDatosAux;
public anywheresoftware.b4j.objects.LabelWrapper lblTitleComandoConfigDatosAux;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtComandoConfigDatosAux;
public anywheresoftware.b4j.objects.LabelWrapper lblTitleParametrosComandoDatosAux;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtParametrosComandoDatosAux;
public anywheresoftware.b4j.objects.LabelWrapper lblTitleNumCamposDatosAux;
public b4j.docU.b4xplusminus B4XPlusMinusNumCamposDatosAux;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtInfoCampo;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtOrdenColumna;
public anywheresoftware.b4j.objects.ButtonWrapper btnBorrarItem;
public void Initialize() {
IsInitialized = true;
chkBoxControlIndependiente = new anywheresoftware.b4j.objects.CheckboxWrapper();
txtCampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
txtTituloCampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
txtTipoDatoMySQL = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
chkboxKeyID = new anywheresoftware.b4j.objects.CheckboxWrapper();
cboTipoDato = new anywheresoftware.b4j.objects.ComboBoxWrapper();
chkBoxEsFecha = new anywheresoftware.b4j.objects.CheckboxWrapper();
chkBoxNoNulo = new anywheresoftware.b4j.objects.CheckboxWrapper();
chkBoxAutoIncremental = new anywheresoftware.b4j.objects.CheckboxWrapper();
txtValorCampoPorDefecto = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
cboTipoControl = new anywheresoftware.b4j.objects.ComboBoxWrapper();
chkBoxControlEditable = new anywheresoftware.b4j.objects.CheckboxWrapper();
lblTitleTipoDatosAux = new anywheresoftware.b4j.objects.LabelWrapper();
cboTipoDatosAux = new anywheresoftware.b4j.objects.ComboBoxWrapper();
lblTitleListaValoresDatosAux = new anywheresoftware.b4j.objects.LabelWrapper();
txtListaValoresDatosAux = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
btnIgualOrigenDatosAux = new anywheresoftware.b4j.objects.ButtonWrapper();
lblTitleIPJrdcOrigenDatosAux = new anywheresoftware.b4j.objects.LabelWrapper();
txtIPJrdcOrigenDatosAux = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
lblTitlePuertoJrdcOrigenDatosAux = new anywheresoftware.b4j.objects.LabelWrapper();
txtPuertoJrdcOrigenDatosAux = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
lblTitleComandoConfigDatosAux = new anywheresoftware.b4j.objects.LabelWrapper();
txtComandoConfigDatosAux = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
lblTitleParametrosComandoDatosAux = new anywheresoftware.b4j.objects.LabelWrapper();
txtParametrosComandoDatosAux = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
lblTitleNumCamposDatosAux = new anywheresoftware.b4j.objects.LabelWrapper();
B4XPlusMinusNumCamposDatosAux = new b4j.docU.b4xplusminus();
txtInfoCampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
txtOrdenColumna = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
btnBorrarItem = new anywheresoftware.b4j.objects.ButtonWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static String _version = "";
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static b4j.example.customlistview _clvlistacampos = null;
public static b4j.docU.b4xdialog _dialog = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.docU.jamrecordformclvdragger _dragger = null;
public static anywheresoftware.b4j.objects.FileChooserWrapper _filechooser = null;
public static String _currentfile = "";
public static String _currentfilestring = "";
public static String _newfilestring = "";
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static b4j.docU.recentfilesmanagerrecordformbuilder _recentmanager = null;
public static String _mmodo = "";
public static String _tipocontrol_textfield = "";
public static String _tipocontrol_b4xinputdialogtextfield = "";
public static String _tipocontrol_b4xlistdialogtextfield = "";
public static String _tipocontrol_b4xsearchlistdialogtextfield = "";
public static String _tipocontrol_combobox = "";
public static String _tipocontrol_lmb4xcombobox = "";
public static String _tipocontrol_checkbox = "";
public static String _tipocontrol_textfieldbuttonselfile = "";
public static String _tipocontrol_textfieldbuttonselfecha = "";
public static String _tipocontrol_textfieldbuttonselext = "";
public static String _tipocontrol_textfieldindependiente = "";
public static boolean _cargandodatos = false;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textareacampostotext = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlecampo = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitletipodato = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblinfo = null;
public static int _colactual = 0;
public static int _col1 = 0;
public static int _col2 = 0;
public static int _colitemsimpares = 0;
public static int _colitemspares = 0;
public static int _colitemsimparespredeterminado = 0;
public static int _colitemsparespredeterminado = 0;
public static b4j.docU.preferencesdialog _prefdialog = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtipjrdc = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpuertojrdc = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombretabla = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlorigensql = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitleipjrdc = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlepuertojrdc = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlenombretabla = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitledbms = null;
public static b4j.docU.jamformregistro._tipoorigendatosjamformregistro _datosorigendatos = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btneditarorigenjrdc = null;
public static anywheresoftware.b4a.objects.collections.List _lstnombrescampossql = null;
public static anywheresoftware.b4a.objects.collections.List _lstprimarykey = null;
public static boolean _corrigiendochkboxesfecha = false;
public static boolean _corrigiendochkboxcontroleditable = false;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipocontrol = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipodato = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxesfecha = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxkeyid = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcampo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttitulocampo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtordencolumna = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxautoincremental = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxnonulo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttipodatomysql = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvalorcampopordefecto = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxcontroleditable = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinfocampo = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlecampojointablaauxlmb4xcbo = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlelistavalorescbo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtlistavalorescbo = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlecomandoconfiglmb4xcbo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcomandoconfiglmb4xcbo = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitleparametroscomandolmb4xcbo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtparametroscomandolmb4xcbo = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitletipodatosaux = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipodatosaux = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlecomandoconfigdatosaux = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcomandoconfigdatosaux = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitleparametroscomandodatosaux = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtparametroscomandodatosaux = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlenumcamposdatosaux = null;
public static b4j.docU.b4xplusminus _b4xplusminusnumcamposdatosaux = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlelistavaloresdatosaux = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtlistavaloresdatosaux = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitleipjrdcorigendatosaux = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtipjrdcorigendatosaux = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnigualorigendatosaux = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlepuertojrdcorigendatosaux = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpuertojrdcorigendatosaux = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnadd = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxcontrolindependiente = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btndelete = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondoitemsimpares = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondoitemspares = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondoitemsimpares = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondoitemspares = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtrgbcolorfondoitemsimpares = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtrgbcolorfondoitemspares = null;
public static b4j.docU.bccolorpicker _bccolorpickerjamtableview = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdbms = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
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
public static void  _show(String _modo,String _nombreficherojson) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_modo,_nombreficherojson}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,_modo,_nombreficherojson);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.jamrecordformbuilder parent,String _modo,String _nombreficherojson) {
this.parent = parent;
this._modo = _modo;
this._nombreficherojson = _nombreficherojson;
}
b4j.docU.jamrecordformbuilder parent;
String _modo;
String _nombreficherojson;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.object.JavaObject _joclvdatosscrollpane = null;
Object _robj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128450561;
 //BA.debugLineNum = 128450561;BA.debugLine="mModo=Modo";
parent._mmodo = _modo;
RDebugUtils.currentLine=128450564;
 //BA.debugLineNum = 128450564;BA.debugLine="Col1=0XFF696969";
parent._col1 = ((int)0xff696969);
RDebugUtils.currentLine=128450565;
 //BA.debugLineNum = 128450565;BA.debugLine="Col2=0xFFA1A1A1";
parent._col2 = ((int)0xffa1a1a1);
RDebugUtils.currentLine=128450567;
 //BA.debugLineNum = 128450567;BA.debugLine="ColItemsParesPredeterminado=0xFFD7CCC8";
parent._colitemsparespredeterminado = ((int)0xffd7ccc8);
RDebugUtils.currentLine=128450568;
 //BA.debugLineNum = 128450568;BA.debugLine="ColItemsImparesPredeterminado=0xFFEFEBE9";
parent._colitemsimparespredeterminado = ((int)0xffefebe9);
RDebugUtils.currentLine=128450571;
 //BA.debugLineNum = 128450571;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(\"\",\"\",\"\",\"";
parent._datosorigendatos = _createtipoorigendatos("","","","");
RDebugUtils.currentLine=128450572;
 //BA.debugLineNum = 128450572;BA.debugLine="lstPrimaryKey.Initialize";
parent._lstprimarykey.Initialize();
RDebugUtils.currentLine=128450575;
 //BA.debugLineNum = 128450575;BA.debugLine="frm.Initialize(\"frm\",1024,768)";
parent._frm.Initialize(ba,"frm",1024,768);
RDebugUtils.currentLine=128450576;
 //BA.debugLineNum = 128450576;BA.debugLine="frm.RootPane.LoadLayout(\"scrRecordFormBuilder\")";
parent._frm.getRootPane().LoadLayout(ba,"scrRecordFormBuilder");
RDebugUtils.currentLine=128450577;
 //BA.debugLineNum = 128450577;BA.debugLine="Log(\"scrRecordFormBuilder cargado\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9128450577","scrRecordFormBuilder cargado",0);
RDebugUtils.currentLine=128450578;
 //BA.debugLineNum = 128450578;BA.debugLine="clvListaCampos.DefaultTextColor = xui.Color_White";
parent._clvlistacampos._defaulttextcolor = parent._xui.Color_White;
RDebugUtils.currentLine=128450579;
 //BA.debugLineNum = 128450579;BA.debugLine="Dialog.Initialize(frm.RootPane)";
parent._dialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=128450580;
 //BA.debugLineNum = 128450580;BA.debugLine="Dialog.Title = \"Record Form Builder\"";
parent._dialog._title /*Object*/  = (Object)("Record Form Builder");
RDebugUtils.currentLine=128450581;
 //BA.debugLineNum = 128450581;BA.debugLine="Dim n As Node = clvListaCampos.sv";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(parent._clvlistacampos._sv.getObject()));
RDebugUtils.currentLine=128450582;
 //BA.debugLineNum = 128450582;BA.debugLine="n.StyleClasses.Add(\"b4xdialog\")";
_n.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=128450583;
 //BA.debugLineNum = 128450583;BA.debugLine="pnlOrigenSQL.Visible=False";
parent._pnlorigensql.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=128450584;
 //BA.debugLineNum = 128450584;BA.debugLine="SetFormMaximized(frm)";
_setformmaximized(parent._frm);
RDebugUtils.currentLine=128450585;
 //BA.debugLineNum = 128450585;BA.debugLine="frm.Show";
parent._frm.Show();
RDebugUtils.currentLine=128450587;
 //BA.debugLineNum = 128450587;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=clvListaCa";
_joclvdatosscrollpane = new anywheresoftware.b4j.object.JavaObject();
_joclvdatosscrollpane = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent._clvlistacampos._sv.getObject()));
RDebugUtils.currentLine=128450588;
 //BA.debugLineNum = 128450588;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",Ar";
_joclvdatosscrollpane.RunMethod("setHbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=128450589;
 //BA.debugLineNum = 128450589;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",Ar";
_joclvdatosscrollpane.RunMethod("setVbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=128450591;
 //BA.debugLineNum = 128450591;BA.debugLine="dragger.Initialize(clvListaCampos)";
parent._dragger._initialize /*String*/ (null,ba,parent._clvlistacampos);
RDebugUtils.currentLine=128450592;
 //BA.debugLineNum = 128450592;BA.debugLine="frm.Stylesheets.Add(File.GetUri(File.DirAssets, \"";
parent._frm.getStylesheets().Add((Object)(anywheresoftware.b4a.keywords.Common.File.GetUri(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"styleRecordFormBuilder.css")));
RDebugUtils.currentLine=128450593;
 //BA.debugLineNum = 128450593;BA.debugLine="AddKeyPressedListener";
_addkeypressedlistener();
RDebugUtils.currentLine=128450594;
 //BA.debugLineNum = 128450594;BA.debugLine="FileChooser.Initialize";
parent._filechooser.Initialize();
RDebugUtils.currentLine=128450596;
 //BA.debugLineNum = 128450596;BA.debugLine="FileChooser.SetExtensionFilter(\"JSON\", Array(\"*.j";
parent._filechooser.SetExtensionFilter("JSON",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*.json")}));
RDebugUtils.currentLine=128450597;
 //BA.debugLineNum = 128450597;BA.debugLine="xui.SetDataFolder(\"RecordFormBuilder\")";
parent._xui.SetDataFolder("RecordFormBuilder");
RDebugUtils.currentLine=128450598;
 //BA.debugLineNum = 128450598;BA.debugLine="RecentManager.Initialize(Me, \"Recent\", MenuBar1.M";
parent._recentmanager._initialize /*String*/ (null,ba,jamrecordformbuilder.getObject(),"Recent",(anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper(), (javafx.scene.control.Menu)(parent._menubar1.getMenus().Get((int) (0)))));
RDebugUtils.currentLine=128450605;
 //BA.debugLineNum = 128450605;BA.debugLine="frm.Title = $\"Record Form Builder ($1.2{Version})";
parent._frm.setTitle(("Record Form Builder ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(parent._version))+")"));
RDebugUtils.currentLine=128450607;
 //BA.debugLineNum = 128450607;BA.debugLine="If mModo=\"Nuevo\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._mmodo).equals("Nuevo")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=128450608;
 //BA.debugLineNum = 128450608;BA.debugLine="wait for(NuevoDesdeFormRegistro) complete (rObj";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "show"), _nuevodesdeformregistro());
this.state = 7;
return;
case 7:
//C
this.state = 6;
_robj = (Object) result[0];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=128450611;
 //BA.debugLineNum = 128450611;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=128450612;
 //BA.debugLineNum = 128450612;BA.debugLine="lstPrimaryKey.Clear";
parent._lstprimarykey.Clear();
RDebugUtils.currentLine=128450613;
 //BA.debugLineNum = 128450613;BA.debugLine="DatosOrigenDatos.Initialize";
parent._datosorigendatos.Initialize();
RDebugUtils.currentLine=128450614;
 //BA.debugLineNum = 128450614;BA.debugLine="CargarDatosDesdeFichero(\"../files/\" & NombreFich";
_cargardatosdesdefichero("../files/"+_nombreficherojson);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=128450616;
 //BA.debugLineNum = 128450616;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _additem(anywheresoftware.b4a.objects.collections.Map _minfo) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_minfo}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
anywheresoftware.b4a.objects.collections.Map _mextras = null;
RDebugUtils.currentLine=129105920;
 //BA.debugLineNum = 129105920;BA.debugLine="Sub AddItem (mInfo As Map)";
RDebugUtils.currentLine=129105922;
 //BA.debugLineNum = 129105922;BA.debugLine="If ColActual=Col1 Then";
if (_colactual==_col1) { 
RDebugUtils.currentLine=129105923;
 //BA.debugLineNum = 129105923;BA.debugLine="ColActual=Col2";
_colactual = _col2;
 }else {
RDebugUtils.currentLine=129105925;
 //BA.debugLineNum = 129105925;BA.debugLine="ColActual=Col1";
_colactual = _col1;
 };
RDebugUtils.currentLine=129105928;
 //BA.debugLineNum = 129105928;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=129105929;
 //BA.debugLineNum = 129105929;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, clvListaCampos.AsV";
_pnl.SetLayoutAnimated((int) (0),0,0,_clvlistacampos._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (105)));
RDebugUtils.currentLine=129105930;
 //BA.debugLineNum = 129105930;BA.debugLine="pnl.LoadLayout(\"scrItemRecordForm2\")";
_pnl.LoadLayout("scrItemRecordForm2",ba);
RDebugUtils.currentLine=129105931;
 //BA.debugLineNum = 129105931;BA.debugLine="pnl.Color=ColActual";
_pnl.setColor(_colactual);
RDebugUtils.currentLine=129105933;
 //BA.debugLineNum = 129105933;BA.debugLine="Dim clvIV As clvRecordFormItemValue";
_clviv = new b4j.docU.jamrecordformbuilder._clvrecordformitemvalue();
RDebugUtils.currentLine=129105935;
 //BA.debugLineNum = 129105935;BA.debugLine="clvIV.btnBorrarItem=btnDelete";
_clviv.btnBorrarItem /*anywheresoftware.b4j.objects.ButtonWrapper*/  = _btndelete;
RDebugUtils.currentLine=129105936;
 //BA.debugLineNum = 129105936;BA.debugLine="clvIV.chkBoxControlIndependiente=chkBoxControlInd";
_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = _chkboxcontrolindependiente;
RDebugUtils.currentLine=129105937;
 //BA.debugLineNum = 129105937;BA.debugLine="clvIV.chkboxKeyID=chkboxKeyID";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = _chkboxkeyid;
RDebugUtils.currentLine=129105939;
 //BA.debugLineNum = 129105939;BA.debugLine="clvIV.txtCampo=txtCampo";
_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtcampo;
RDebugUtils.currentLine=129105940;
 //BA.debugLineNum = 129105940;BA.debugLine="clvIV.cboTipoDato=cboTipoDato";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = _cbotipodato;
RDebugUtils.currentLine=129105941;
 //BA.debugLineNum = 129105941;BA.debugLine="clvIV.chkBoxEsFecha=chkBoxEsFecha";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = _chkboxesfecha;
RDebugUtils.currentLine=129105942;
 //BA.debugLineNum = 129105942;BA.debugLine="clvIV.txtTituloCampo=txtTituloCampo";
_clviv.txtTituloCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txttitulocampo;
RDebugUtils.currentLine=129105943;
 //BA.debugLineNum = 129105943;BA.debugLine="clvIV.txtOrdenColumna=txtOrdenColumna";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtordencolumna;
RDebugUtils.currentLine=129105944;
 //BA.debugLineNum = 129105944;BA.debugLine="clvIV.cboTipoControl=cboTipoControl";
_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = _cbotipocontrol;
RDebugUtils.currentLine=129105945;
 //BA.debugLineNum = 129105945;BA.debugLine="clvIV.chkBoxControlEditable=chkBoxControlEditable";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = _chkboxcontroleditable;
RDebugUtils.currentLine=129105946;
 //BA.debugLineNum = 129105946;BA.debugLine="clvIV.chkBoxAutoIncremental=chkBoxAutoIncremental";
_clviv.chkBoxAutoIncremental /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = _chkboxautoincremental;
RDebugUtils.currentLine=129105947;
 //BA.debugLineNum = 129105947;BA.debugLine="clvIV.chkBoxNoNulo=chkBoxNoNulo";
_clviv.chkBoxNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = _chkboxnonulo;
RDebugUtils.currentLine=129105948;
 //BA.debugLineNum = 129105948;BA.debugLine="clvIV.txtTipoDatoMySQL=txtTipoDatoMySQL";
_clviv.txtTipoDatoMySQL /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txttipodatomysql;
RDebugUtils.currentLine=129105949;
 //BA.debugLineNum = 129105949;BA.debugLine="clvIV.txtValorCampoPorDefecto=txtValorCampoPorDef";
_clviv.txtValorCampoPorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtvalorcampopordefecto;
RDebugUtils.currentLine=129105950;
 //BA.debugLineNum = 129105950;BA.debugLine="clvIV.txtInfoCampo=txtInfoCampo";
_clviv.txtInfoCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtinfocampo;
RDebugUtils.currentLine=129105964;
 //BA.debugLineNum = 129105964;BA.debugLine="clvIV.lblTitleTipoDatosAux=lblTitleTipoDatosAux";
_clviv.lblTitleTipoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/  = _lbltitletipodatosaux;
RDebugUtils.currentLine=129105965;
 //BA.debugLineNum = 129105965;BA.debugLine="clvIV.cboTipoDatosAux=cboTipoDatosAux";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = _cbotipodatosaux;
RDebugUtils.currentLine=129105967;
 //BA.debugLineNum = 129105967;BA.debugLine="clvIV.lblTitleListaValoresDatosAux=lblTitleListaV";
_clviv.lblTitleListaValoresDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/  = _lbltitlelistavaloresdatosaux;
RDebugUtils.currentLine=129105968;
 //BA.debugLineNum = 129105968;BA.debugLine="clvIV.txtListaValoresDatosAux=txtListaValoresDato";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtlistavaloresdatosaux;
RDebugUtils.currentLine=129105970;
 //BA.debugLineNum = 129105970;BA.debugLine="clvIV.btnIgualOrigenDatosAux=btnIgualOrigenDatosA";
_clviv.btnIgualOrigenDatosAux /*anywheresoftware.b4j.objects.ButtonWrapper*/  = _btnigualorigendatosaux;
RDebugUtils.currentLine=129105971;
 //BA.debugLineNum = 129105971;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux=lblTitleIPJrdc";
_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/  = _lbltitleipjrdcorigendatosaux;
RDebugUtils.currentLine=129105972;
 //BA.debugLineNum = 129105972;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux=txtIPJrdcOrigenDato";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtipjrdcorigendatosaux;
RDebugUtils.currentLine=129105973;
 //BA.debugLineNum = 129105973;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux=lblTitlePu";
_clviv.lblTitlePuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/  = _lbltitlepuertojrdcorigendatosaux;
RDebugUtils.currentLine=129105974;
 //BA.debugLineNum = 129105974;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux=txtPuertoJrdcOr";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtpuertojrdcorigendatosaux;
RDebugUtils.currentLine=129105975;
 //BA.debugLineNum = 129105975;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux=lblTitleComan";
_clviv.lblTitleComandoConfigDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/  = _lbltitlecomandoconfigdatosaux;
RDebugUtils.currentLine=129105976;
 //BA.debugLineNum = 129105976;BA.debugLine="clvIV.txtComandoConfigDatosAux=txtComandoConfigDa";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtcomandoconfigdatosaux;
RDebugUtils.currentLine=129105977;
 //BA.debugLineNum = 129105977;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux=lblTitleP";
_clviv.lblTitleParametrosComandoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/  = _lbltitleparametroscomandodatosaux;
RDebugUtils.currentLine=129105978;
 //BA.debugLineNum = 129105978;BA.debugLine="clvIV.txtParametrosComandoDatosAux=txtParametrosC";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = _txtparametroscomandodatosaux;
RDebugUtils.currentLine=129105979;
 //BA.debugLineNum = 129105979;BA.debugLine="clvIV.lblTitleNumCamposDatosAux=lblTitleNumCampos";
_clviv.lblTitleNumCamposDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/  = _lbltitlenumcamposdatosaux;
RDebugUtils.currentLine=129105980;
 //BA.debugLineNum = 129105980;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux=B4XPlusMinusN";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/  = _b4xplusminusnumcamposdatosaux;
RDebugUtils.currentLine=129105982;
 //BA.debugLineNum = 129105982;BA.debugLine="clvIV.btnBorrarItem.Visible=False";
_clviv.btnBorrarItem /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129105983;
 //BA.debugLineNum = 129105983;BA.debugLine="clvIV.chkBoxControlIndependiente.Checked=False";
_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129105984;
 //BA.debugLineNum = 129105984;BA.debugLine="clvIV.txtCampo.text=\"\"";
_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=129105986;
 //BA.debugLineNum = 129105986;BA.debugLine="clvIV.cboTipoControl.Items.AddAll(Array As String";
_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"",_tipocontrol_textfield,_tipocontrol_b4xinputdialogtextfield,_tipocontrol_b4xlistdialogtextfield,_tipocontrol_b4xsearchlistdialogtextfield,_tipocontrol_checkbox,_tipocontrol_textfieldbuttonselfecha,_tipocontrol_textfieldbuttonselfile,_tipocontrol_textfieldbuttonselext}));
RDebugUtils.currentLine=129105989;
 //BA.debugLineNum = 129105989;BA.debugLine="clvIV.cboTipoControl.Value=\"\"";
_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=129105990;
 //BA.debugLineNum = 129105990;BA.debugLine="clvIV.cboTipoDato.Items.AddAll(Array As String(\"\"";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","TEXT","REAL","INTEGER","BLOB"}));
RDebugUtils.currentLine=129105991;
 //BA.debugLineNum = 129105991;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=129105992;
 //BA.debugLineNum = 129105992;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129105993;
 //BA.debugLineNum = 129105993;BA.debugLine="clvIV.txtTipoDatoMySQL.Text=\"\"";
_clviv.txtTipoDatoMySQL /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=129105994;
 //BA.debugLineNum = 129105994;BA.debugLine="clvIV.chkboxKeyID.Checked=False";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129105996;
 //BA.debugLineNum = 129105996;BA.debugLine="clvIV.chkBoxEsFecha.Checked=False";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129105997;
 //BA.debugLineNum = 129105997;BA.debugLine="clvIV.txtValorCampoPorDefecto.Text=Null";
_clviv.txtValorCampoPorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=129105998;
 //BA.debugLineNum = 129105998;BA.debugLine="clvIV.txtInfoCampo.Text=\"\"";
_clviv.txtInfoCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=129106025;
 //BA.debugLineNum = 129106025;BA.debugLine="clvIV.cboTipoDatosAux.Items.AddAll(Array As Strin";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Lista","Consulta"}));
RDebugUtils.currentLine=129106026;
 //BA.debugLineNum = 129106026;BA.debugLine="clvIV.cboTipoDatosAux.Value=\"\"";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=129106028;
 //BA.debugLineNum = 129106028;BA.debugLine="B4XPlusMinusNumCamposDatosAux.SetNumericRange(1,2";
_b4xplusminusnumcamposdatosaux._setnumericrange /*String*/ (null,1,2,1);
RDebugUtils.currentLine=129106030;
 //BA.debugLineNum = 129106030;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=False";
_clviv.lblTitleTipoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106031;
 //BA.debugLineNum = 129106031;BA.debugLine="clvIV.cboTipoDatosAux.Visible=False";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106033;
 //BA.debugLineNum = 129106033;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=False";
_clviv.lblTitleListaValoresDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106034;
 //BA.debugLineNum = 129106034;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=False";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106036;
 //BA.debugLineNum = 129106036;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=False";
_clviv.btnIgualOrigenDatosAux /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106037;
 //BA.debugLineNum = 129106037;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=False";
_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106038;
 //BA.debugLineNum = 129106038;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=False";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106039;
 //BA.debugLineNum = 129106039;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=Fa";
_clviv.lblTitlePuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106040;
 //BA.debugLineNum = 129106040;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=False";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106041;
 //BA.debugLineNum = 129106041;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=False";
_clviv.lblTitleComandoConfigDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106042;
 //BA.debugLineNum = 129106042;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=False";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106043;
 //BA.debugLineNum = 129106043;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=F";
_clviv.lblTitleParametrosComandoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106044;
 //BA.debugLineNum = 129106044;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=False";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106045;
 //BA.debugLineNum = 129106045;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=False";
_clviv.lblTitleNumCamposDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106046;
 //BA.debugLineNum = 129106046;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visible";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106049;
 //BA.debugLineNum = 129106049;BA.debugLine="clvIV.cboTipoDatosAux.Value=\"\"";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=129106050;
 //BA.debugLineNum = 129106050;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=\"\"";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=129106051;
 //BA.debugLineNum = 129106051;BA.debugLine="clvIV.txtComandoConfigDatosAux.Text=\"\"";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=129106052;
 //BA.debugLineNum = 129106052;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Text=\"\"";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=129106053;
 //BA.debugLineNum = 129106053;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedValue";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,(Object)(1));
RDebugUtils.currentLine=129106055;
 //BA.debugLineNum = 129106055;BA.debugLine="If mInfo.IsInitialized Then";
if (_minfo.IsInitialized()) { 
RDebugUtils.currentLine=129106057;
 //BA.debugLineNum = 129106057;BA.debugLine="clvIV.chkBoxControlIndependiente.Checked=mInfo.G";
_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("ControlIndependiente"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=129106058;
 //BA.debugLineNum = 129106058;BA.debugLine="clvIV.txtCampo.Text=mInfo.GetDefault(\"Campo\",\"\")";
_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("Campo"),(Object)(""))));
RDebugUtils.currentLine=129106059;
 //BA.debugLineNum = 129106059;BA.debugLine="clvIV.txtTituloCampo.text=mInfo.GetDefault(\"Titu";
_clviv.txtTituloCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("TituloCampo"),(Object)(_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))));
RDebugUtils.currentLine=129106061;
 //BA.debugLineNum = 129106061;BA.debugLine="clvIV.chkboxKeyID.Checked=mInfo.GetDefault(\"Prim";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("PrimaryKey"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=129106062;
 //BA.debugLineNum = 129106062;BA.debugLine="clvIV.txtTipoDatoMySQL.Text=mInfo.Get(\"TipoDatoM";
_clviv.txtTipoDatoMySQL /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.Get((Object)("TipoDatoMySQL"))));
RDebugUtils.currentLine=129106063;
 //BA.debugLineNum = 129106063;BA.debugLine="If mInfo.Getdefault(\"PrimaryKey\",False) Then lst";
if (BA.ObjectToBoolean(_minfo.GetDefault((Object)("PrimaryKey"),(Object)(anywheresoftware.b4a.keywords.Common.False)))) { 
_lstprimarykey.Add(_minfo.GetDefault((Object)("Campo"),(Object)("")));};
RDebugUtils.currentLine=129106064;
 //BA.debugLineNum = 129106064;BA.debugLine="clvIV.cboTipoControl.Value=mInfo.GetDefault(\"Tip";
_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("TipoControl"),(Object)("")));
RDebugUtils.currentLine=129106065;
 //BA.debugLineNum = 129106065;BA.debugLine="clvIV.chkBoxControlEditable.Checked=mInfo.GetDef";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("ControlEditable"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=129106066;
 //BA.debugLineNum = 129106066;BA.debugLine="clvIV.cboTipoDato.Value=mInfo.GetDefault(\"TipoDa";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("TipoDato"),(Object)("")));
RDebugUtils.currentLine=129106067;
 //BA.debugLineNum = 129106067;BA.debugLine="clvIV.chkBoxEsFecha.Checked=mInfo.GetDefault(\"Es";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("EsFecha"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=129106068;
 //BA.debugLineNum = 129106068;BA.debugLine="clvIV.chkBoxAutoIncremental.Checked=mInfo.Getdef";
_clviv.chkBoxAutoIncremental /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("AutoIncremental"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=129106069;
 //BA.debugLineNum = 129106069;BA.debugLine="clvIV.chkBoxNoNulo.Checked=mInfo.Getdefault(\"NoN";
_clviv.chkBoxNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("NoNulo"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=129106070;
 //BA.debugLineNum = 129106070;BA.debugLine="clvIV.txtValorCampoPorDefecto.Text=mInfo.Getdefa";
_clviv.txtValorCampoPorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("ValorCampoPorDefecto"),anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=129106071;
 //BA.debugLineNum = 129106071;BA.debugLine="clvIV.txtInfoCampo.Text=mInfo.GetDefault(\"InfoCa";
_clviv.txtInfoCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("InfoCampo"),(Object)(""))));
RDebugUtils.currentLine=129106072;
 //BA.debugLineNum = 129106072;BA.debugLine="If mInfo.Get(\"Extras\")<>Null Then";
if (_minfo.Get((Object)("Extras"))!= null) { 
RDebugUtils.currentLine=129106073;
 //BA.debugLineNum = 129106073;BA.debugLine="Dim mExtras As Map=mInfo.Get(\"Extras\")";
_mextras = new anywheresoftware.b4a.objects.collections.Map();
_mextras = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_minfo.Get((Object)("Extras"))));
RDebugUtils.currentLine=129106074;
 //BA.debugLineNum = 129106074;BA.debugLine="clvIV.cboTipoDatosAux.Value=mExtras.Getdefault(";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_mextras.GetDefault((Object)("TipoDatosAux"),(Object)("")));
RDebugUtils.currentLine=129106075;
 //BA.debugLineNum = 129106075;BA.debugLine="If mExtras.Getdefault(\"TipoDatosAux\",\"\")=\"Lista";
if ((_mextras.GetDefault((Object)("TipoDatosAux"),(Object)(""))).equals((Object)("Lista"))) { 
RDebugUtils.currentLine=129106076;
 //BA.debugLineNum = 129106076;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=True";
_clviv.lblTitleTipoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106077;
 //BA.debugLineNum = 129106077;BA.debugLine="clvIV.cboTipoDatosAux.Visible=True";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106078;
 //BA.debugLineNum = 129106078;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=Tru";
_clviv.lblTitleListaValoresDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106079;
 //BA.debugLineNum = 129106079;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=True";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106080;
 //BA.debugLineNum = 129106080;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=mExtras.Get";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mextras.Get((Object)("ListaValoresDatosAux"))));
 };
RDebugUtils.currentLine=129106082;
 //BA.debugLineNum = 129106082;BA.debugLine="If mExtras.Getdefault(\"TipoDatosAux\",\"\")=\"Consu";
if ((_mextras.GetDefault((Object)("TipoDatosAux"),(Object)(""))).equals((Object)("Consulta"))) { 
RDebugUtils.currentLine=129106083;
 //BA.debugLineNum = 129106083;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=True";
_clviv.lblTitleTipoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106084;
 //BA.debugLineNum = 129106084;BA.debugLine="clvIV.cboTipoDatosAux.Visible=True";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106085;
 //BA.debugLineNum = 129106085;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=True";
_clviv.btnIgualOrigenDatosAux /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106086;
 //BA.debugLineNum = 129106086;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=Tru";
_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106087;
 //BA.debugLineNum = 129106087;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=True";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106088;
 //BA.debugLineNum = 129106088;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.text=mExtras.Get";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mextras.Get((Object)("IPJrdcOrigenDatosAux"))));
RDebugUtils.currentLine=129106089;
 //BA.debugLineNum = 129106089;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible";
_clviv.lblTitlePuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106090;
 //BA.debugLineNum = 129106090;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=True";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106091;
 //BA.debugLineNum = 129106091;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.text=mExtras";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mextras.Get((Object)("PuertoJrdcOrigenDatosAux"))));
RDebugUtils.currentLine=129106092;
 //BA.debugLineNum = 129106092;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=Tr";
_clviv.lblTitleComandoConfigDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106093;
 //BA.debugLineNum = 129106093;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=True";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106094;
 //BA.debugLineNum = 129106094;BA.debugLine="clvIV.txtComandoConfigDatosAux.text=mExtras.Ge";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mextras.Get((Object)("ComandoConfigDatosAux"))));
RDebugUtils.currentLine=129106095;
 //BA.debugLineNum = 129106095;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visibl";
_clviv.lblTitleParametrosComandoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106096;
 //BA.debugLineNum = 129106096;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=Tru";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106097;
 //BA.debugLineNum = 129106097;BA.debugLine="clvIV.txtParametrosComandoDatosAux.text=mExtra";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mextras.Get((Object)("ParametrosComandoDatosAux"))));
RDebugUtils.currentLine=129106098;
 //BA.debugLineNum = 129106098;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=True";
_clviv.lblTitleNumCamposDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106099;
 //BA.debugLineNum = 129106099;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visi";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106100;
 //BA.debugLineNum = 129106100;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedVa";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,_mextras.Get((Object)("NumCamposDatosAux")));
 };
 };
RDebugUtils.currentLine=129106135;
 //BA.debugLineNum = 129106135;BA.debugLine="If True=mInfo.GetDefault(\"ControlIndependiente\",";
if (anywheresoftware.b4a.keywords.Common.True==BA.ObjectToBoolean(_minfo.GetDefault((Object)("ControlIndependiente"),(Object)(anywheresoftware.b4a.keywords.Common.False)))) { 
RDebugUtils.currentLine=129106136;
 //BA.debugLineNum = 129106136;BA.debugLine="clvIV.btnBorrarItem.Visible=True";
_clviv.btnBorrarItem /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106137;
 //BA.debugLineNum = 129106137;BA.debugLine="clvIV.cboTipoControl.Items.Clear";
_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=129106139;
 //BA.debugLineNum = 129106139;BA.debugLine="clvIV.cboTipoControl.Value=TipoControl_TextFiel";
_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(_tipocontrol_textfield));
RDebugUtils.currentLine=129106145;
 //BA.debugLineNum = 129106145;BA.debugLine="clvIV.txtCampo.Editable=True";
_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129106146;
 //BA.debugLineNum = 129106146;BA.debugLine="clvIV.cboTipoDato.Items.Clear";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
RDebugUtils.currentLine=129106147;
 //BA.debugLineNum = 129106147;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=129106148;
 //BA.debugLineNum = 129106148;BA.debugLine="clvIV.chkBoxEsFecha.Enabled=False";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106149;
 //BA.debugLineNum = 129106149;BA.debugLine="clvIV.chkBoxControlEditable.Enabled=False";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=129106150;
 //BA.debugLineNum = 129106150;BA.debugLine="clvIV.txtValorCampoPorDefecto.Text=\"\"";
_clviv.txtValorCampoPorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=129106151;
 //BA.debugLineNum = 129106151;BA.debugLine="clvIV.txtTipoDatoMySQL.text=\"\"";
_clviv.txtTipoDatoMySQL /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
 };
 };
RDebugUtils.currentLine=129106156;
 //BA.debugLineNum = 129106156;BA.debugLine="clvIV.txtOrdenColumna.Text=clvListaCampos.Size";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_clvlistacampos._getsize()));
RDebugUtils.currentLine=129106158;
 //BA.debugLineNum = 129106158;BA.debugLine="clvListaCampos.Add(pnl, clvIV)";
_clvlistacampos._add(_pnl,(Object)(_clviv));
RDebugUtils.currentLine=129106159;
 //BA.debugLineNum = 129106159;BA.debugLine="dragger.AddDragButtons";
_dragger._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=129106161;
 //BA.debugLineNum = 129106161;BA.debugLine="CallSubDelayed(Me,\"AddItem_Completed\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,jamrecordformbuilder.getObject(),"AddItem_Completed");
RDebugUtils.currentLine=129106162;
 //BA.debugLineNum = 129106162;BA.debugLine="End Sub";
return "";
}
public static String  _addkeypressedlistener() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "addkeypressedlistener", true))
	 {return ((String) Debug.delegate(ba, "addkeypressedlistener", null));}
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=128843776;
 //BA.debugLineNum = 128843776;BA.debugLine="Sub AddKeyPressedListener";
RDebugUtils.currentLine=128843777;
 //BA.debugLineNum = 128843777;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=128843778;
 //BA.debugLineNum = 128843778;BA.debugLine="r.Target = frm.RootPane";
_r.Target = (Object)(_frm.getRootPane().getObject());
RDebugUtils.currentLine=128843779;
 //BA.debugLineNum = 128843779;BA.debugLine="r.AddEventHandler(\"keypressed\", \"javafx.scene.inp";
_r.AddEventHandler(ba,"keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED");
RDebugUtils.currentLine=128843780;
 //BA.debugLineNum = 128843780;BA.debugLine="End Sub";
return "";
}
public static void  _btnadd_click() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "btnadd_click", true))
	 {Debug.delegate(ba, "btnadd_click", null); return;}
ResumableSub_btnAdd_Click rsub = new ResumableSub_btnAdd_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAdd_Click extends BA.ResumableSub {
public ResumableSub_btnAdd_Click(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
Object _msa = null;
int _result = 0;
int _numeradorcamposindep = 0;
int _i = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
String _nombrecampo = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
int step10;
int limit10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131465217;
 //BA.debugLineNum = 131465217;BA.debugLine="If clvListaCampos.Size=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._clvlistacampos._getsize()==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=131465218;
 //BA.debugLineNum = 131465218;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"para poder";
_msa = parent._xui.MsgboxAsync(ba,"para poder añadir un control independiente, debe haber al menos un campo dependiente de la tabla.","Aviso");
RDebugUtils.currentLine=131465219;
 //BA.debugLineNum = 131465219;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btnadd_click"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=131465220;
 //BA.debugLineNum = 131465220;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=131465222;
 //BA.debugLineNum = 131465222;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Sólo es pos";
_msa = parent._xui.Msgbox2Async(ba,"Sólo es posible añadir controles independientes de la tabla. ¿Añadir control independiente?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=131465223;
 //BA.debugLineNum = 131465223;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btnadd_click"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 5;
_result = (int) result[0];
;
RDebugUtils.currentLine=131465224;
 //BA.debugLineNum = 131465224;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 5:
//if
this.state = 10;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=131465225;
 //BA.debugLineNum = 131465225;BA.debugLine="Dim NumeradorCamposIndep As Int=1";
_numeradorcamposindep = (int) (1);
RDebugUtils.currentLine=131465226;
 //BA.debugLineNum = 131465226;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
if (true) break;

case 11:
//for
this.state = 22;
step10 = 1;
limit10 = (int) (parent._clvlistacampos._getsize()-1);
_i = (int) (0) ;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 22;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 13;
if (true) break;

case 26:
//C
this.state = 25;
_i = ((int)(0 + _i + step10)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=131465227;
 //BA.debugLineNum = 131465227;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(parent._clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=131465228;
 //BA.debugLineNum = 131465228;BA.debugLine="If clvIV.chkBoxControlIndependiente.Checked Then";
if (true) break;

case 14:
//if
this.state = 21;
if (_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=131465229;
 //BA.debugLineNum = 131465229;BA.debugLine="Dim NombreCampo As String=clvIV.txtCampo.Text";
_nombrecampo = _clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=131465230;
 //BA.debugLineNum = 131465230;BA.debugLine="If NombreCampo.StartsWith(\"ControlIndependiente";
if (true) break;

case 17:
//if
this.state = 20;
if (_nombrecampo.startsWith("ControlIndependiente")) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=131465231;
 //BA.debugLineNum = 131465231;BA.debugLine="NumeradorCamposIndep=NumeradorCamposIndep+1";
_numeradorcamposindep = (int) (_numeradorcamposindep+1);
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 26;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=131465235;
 //BA.debugLineNum = 131465235;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=131465236;
 //BA.debugLineNum = 131465236;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=131465237;
 //BA.debugLineNum = 131465237;BA.debugLine="m.Put(\"ControlIndependiente\",True)";
_m.Put((Object)("ControlIndependiente"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=131465238;
 //BA.debugLineNum = 131465238;BA.debugLine="m.put(\"Campo\",\"ControlIndependiente\" & NumeradorC";
_m.Put((Object)("Campo"),(Object)("ControlIndependiente"+BA.NumberToString(_numeradorcamposindep)));
RDebugUtils.currentLine=131465239;
 //BA.debugLineNum = 131465239;BA.debugLine="m.put(\"TituloCampo\",\"TituloControlIndependiente\"";
_m.Put((Object)("TituloCampo"),(Object)("TituloControlIndependiente"+BA.NumberToString(_numeradorcamposindep)));
RDebugUtils.currentLine=131465240;
 //BA.debugLineNum = 131465240;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131465241;
 //BA.debugLineNum = 131465241;BA.debugLine="AddItem(m)";
_additem(_m);
RDebugUtils.currentLine=131465242;
 //BA.debugLineNum = 131465242;BA.debugLine="Wait For AddItemControlIndependiente_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("additemcontrolindependiente_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btnadd_click"), null);
this.state = 27;
return;
case 27:
//C
this.state = -1;
;
RDebugUtils.currentLine=131465243;
 //BA.debugLineNum = 131465243;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=131465244;
 //BA.debugLineNum = 131465244;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btndelete_click() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "btndelete_click", true))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
int _index = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131530753;
 //BA.debugLineNum = 131530753;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba))));
RDebugUtils.currentLine=131530754;
 //BA.debugLineNum = 131530754;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=131530755;
 //BA.debugLineNum = 131530755;BA.debugLine="If clvIV.chkBoxControlIndependiente.Checked Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=131530756;
 //BA.debugLineNum = 131530756;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Borrar el";
_msa = parent._xui.Msgbox2Async(ba,"¿Borrar el ítem del control independiente "+_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+"?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=131530757;
 //BA.debugLineNum = 131530757;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btndelete_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=131530758;
 //BA.debugLineNum = 131530758;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Ret";
if (true) break;

case 4:
//if
this.state = 9;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=131530759;
 //BA.debugLineNum = 131530759;BA.debugLine="clvListaCampos.RemoveAt(index)";
parent._clvlistacampos._removeat(_index);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=131530761;
 //BA.debugLineNum = 131530761;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btneditarorigenjrdc_click() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "btneditarorigenjrdc_click", true))
	 {Debug.delegate(ba, "btneditarorigenjrdc_click", null); return;}
ResumableSub_btnEditarOrigenJRDC_Click rsub = new ResumableSub_btnEditarOrigenJRDC_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEditarOrigenJRDC_Click extends BA.ResumableSub {
public ResumableSub_btnEditarOrigenJRDC_Click(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130940931;
 //BA.debugLineNum = 130940931;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Editar el";
_msa = parent._xui.Msgbox2Async(ba,"¿Editar el origen de datos actual?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=130940932;
 //BA.debugLineNum = 130940932;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=130940933;
 //BA.debugLineNum = 130940933;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=130940935;
 //BA.debugLineNum = 130940935;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
parent._prefdialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=130940937;
 //BA.debugLineNum = 130940937;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
parent._prefdialog._loadfromjson /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"OrigenDatosJrdcRecordFormBuilder.json"));
RDebugUtils.currentLine=130940938;
 //BA.debugLineNum = 130940938;BA.debugLine="Dim mData As Map=CreateMap(\"IpJRDC\":DatosOrigenDa";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("IpJRDC"),(Object)(parent._datosorigendatos.IpJRDC /*String*/ ),(Object)("PuertoJRDC"),(Object)(parent._datosorigendatos.PuertoJRDC /*String*/ ),(Object)("NombreTabla"),(Object)(parent._datosorigendatos.NombreTabla /*String*/ )});
RDebugUtils.currentLine=130940939;
 //BA.debugLineNum = 130940939;BA.debugLine="Dim rSub As ResumableSub=prefDialog.ShowDialog(mD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._prefdialog._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL"));
RDebugUtils.currentLine=130940941;
 //BA.debugLineNum = 130940941;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), _rsub);
this.state = 20;
return;
case 20:
//C
this.state = 7;
_result = (int) result[0];
;
RDebugUtils.currentLine=130940942;
 //BA.debugLineNum = 130940942;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 7:
//if
this.state = 12;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) return ;
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=130940944;
 //BA.debugLineNum = 130940944;BA.debugLine="LimpiarControlesOrigenDatos";
_limpiarcontrolesorigendatos();
RDebugUtils.currentLine=130940945;
 //BA.debugLineNum = 130940945;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=130940947;
 //BA.debugLineNum = 130940947;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
parent._lbltitleipjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=130940948;
 //BA.debugLineNum = 130940948;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
parent._lbltitlepuertojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=130940949;
 //BA.debugLineNum = 130940949;BA.debugLine="lblTitleNombreTabla.TextColor=fx.Colors.From32Bit";
parent._lbltitlenombretabla.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=130940950;
 //BA.debugLineNum = 130940950;BA.debugLine="lblTitleDBMS.TextColor=fx.Colors.From32Bit(0xFFFF";
parent._lbltitledbms.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=130940951;
 //BA.debugLineNum = 130940951;BA.debugLine="txtIpJRDC.Enabled=True";
parent._txtipjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=130940952;
 //BA.debugLineNum = 130940952;BA.debugLine="txtPuertoJRDC.Enabled=True";
parent._txtpuertojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=130940953;
 //BA.debugLineNum = 130940953;BA.debugLine="txtNombreTabla.ENABLED=True";
parent._txtnombretabla.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=130940954;
 //BA.debugLineNum = 130940954;BA.debugLine="txtDBMS.ENABLED=True";
parent._txtdbms.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=130940956;
 //BA.debugLineNum = 130940956;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(mData.GetD";
parent._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("NombreTabla"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("NombreTabla"),(Object)("MySQL"))));
RDebugUtils.currentLine=130940957;
 //BA.debugLineNum = 130940957;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=130940960;
 //BA.debugLineNum = 130940960;BA.debugLine="Select Case txtDBMS.Text";
if (true) break;

case 13:
//select
this.state = 18;
switch (BA.switchObjectToInt(parent._txtdbms.getText(),"MySQL","SQLServer")) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=130940962;
 //BA.debugLineNum = 130940962;BA.debugLine="CargaCamposJRDCMySQL(txtIpJRDC.Text,txtPuertoJR";
_cargacamposjrdcmysql(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtnombretabla.getText());
RDebugUtils.currentLine=130940963;
 //BA.debugLineNum = 130940963;BA.debugLine="Wait For CargaCamposJRDCMySQL_Completed (Accion";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcmysql_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), null);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_accion = (String) result[0];
_lstcampossql = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=130940966;
 //BA.debugLineNum = 130940966;BA.debugLine="CargaCamposJRDCSQLServer(txtIpJRDC.Text,txtPuer";
_cargacamposjrdcsqlserver(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtnombretabla.getText());
RDebugUtils.currentLine=130940967;
 //BA.debugLineNum = 130940967;BA.debugLine="Wait For CargaCamposJRDCSQLServer_Completed (Ac";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcsqlserver_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "btneditarorigenjrdc_click"), null);
this.state = 22;
return;
case 22:
//C
this.state = 18;
_accion = (String) result[0];
_lstcampossql = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=130940971;
 //BA.debugLineNum = 130940971;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _limpiarcontrolesorigendatos() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "limpiarcontrolesorigendatos", true))
	 {return ((String) Debug.delegate(ba, "limpiarcontrolesorigendatos", null));}
RDebugUtils.currentLine=128974848;
 //BA.debugLineNum = 128974848;BA.debugLine="Sub LimpiarControlesOrigenDatos";
RDebugUtils.currentLine=128974849;
 //BA.debugLineNum = 128974849;BA.debugLine="txtIpJRDC.Text=\"\"";
_txtipjrdc.setText("");
RDebugUtils.currentLine=128974850;
 //BA.debugLineNum = 128974850;BA.debugLine="txtPuertoJRDC.Text=\"\"";
_txtpuertojrdc.setText("");
RDebugUtils.currentLine=128974851;
 //BA.debugLineNum = 128974851;BA.debugLine="txtNombreTabla.Text=\"\"";
_txtnombretabla.setText("");
RDebugUtils.currentLine=128974852;
 //BA.debugLineNum = 128974852;BA.debugLine="Log(\"txtDBMS.Text=\"\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9128974852","txtDBMS.Text=\"",0);
RDebugUtils.currentLine=128974853;
 //BA.debugLineNum = 128974853;BA.debugLine="txtDBMS.Text=\"\"";
_txtdbms.setText("");
RDebugUtils.currentLine=128974854;
 //BA.debugLineNum = 128974854;BA.debugLine="End Sub";
return "";
}
public static b4j.docU.jamformregistro._tipoorigendatosjamformregistro  _createtipoorigendatos(String _ipjrdc,String _puertojrdc,String _nombretabla,String _dbms) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "createtipoorigendatos", true))
	 {return ((b4j.docU.jamformregistro._tipoorigendatosjamformregistro) Debug.delegate(ba, "createtipoorigendatos", new Object[] {_ipjrdc,_puertojrdc,_nombretabla,_dbms}));}
b4j.docU.jamformregistro._tipoorigendatosjamformregistro _t1 = null;
RDebugUtils.currentLine=130875392;
 //BA.debugLineNum = 130875392;BA.debugLine="Public Sub CreateTipoOrigenDatos (IpJRDC As String";
RDebugUtils.currentLine=130875393;
 //BA.debugLineNum = 130875393;BA.debugLine="Dim t1 As TipoOrigenDatosJamFormRegistro";
_t1 = new b4j.docU.jamformregistro._tipoorigendatosjamformregistro();
RDebugUtils.currentLine=130875394;
 //BA.debugLineNum = 130875394;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=130875396;
 //BA.debugLineNum = 130875396;BA.debugLine="t1.IpJRDC = IpJRDC";
_t1.IpJRDC /*String*/  = _ipjrdc;
RDebugUtils.currentLine=130875397;
 //BA.debugLineNum = 130875397;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
_t1.PuertoJRDC /*String*/  = _puertojrdc;
RDebugUtils.currentLine=130875398;
 //BA.debugLineNum = 130875398;BA.debugLine="t1.NombreTabla = NombreTabla";
_t1.NombreTabla /*String*/  = _nombretabla;
RDebugUtils.currentLine=130875399;
 //BA.debugLineNum = 130875399;BA.debugLine="t1.DBMS = DBMS";
_t1.DBMS /*String*/  = _dbms;
RDebugUtils.currentLine=130875402;
 //BA.debugLineNum = 130875402;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=130875403;
 //BA.debugLineNum = 130875403;BA.debugLine="End Sub";
return null;
}
public static String  _mostrardatosorigendatos() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "mostrardatosorigendatos", true))
	 {return ((String) Debug.delegate(ba, "mostrardatosorigendatos", null));}
RDebugUtils.currentLine=129761280;
 //BA.debugLineNum = 129761280;BA.debugLine="Sub MostrarDatosOrigenDatos";
RDebugUtils.currentLine=129761282;
 //BA.debugLineNum = 129761282;BA.debugLine="txtIpJRDC.Text=DatosOrigenDatos.IpJRDC";
_txtipjrdc.setText(_datosorigendatos.IpJRDC /*String*/ );
RDebugUtils.currentLine=129761283;
 //BA.debugLineNum = 129761283;BA.debugLine="txtPuertoJRDC.Text=DatosOrigenDatos.PuertoJRDC";
_txtpuertojrdc.setText(_datosorigendatos.PuertoJRDC /*String*/ );
RDebugUtils.currentLine=129761284;
 //BA.debugLineNum = 129761284;BA.debugLine="txtNombreTabla.Text=DatosOrigenDatos.NombreTabla";
_txtnombretabla.setText(_datosorigendatos.NombreTabla /*String*/ );
RDebugUtils.currentLine=129761285;
 //BA.debugLineNum = 129761285;BA.debugLine="txtDBMS.Text=DatosOrigenDatos.DBMS";
_txtdbms.setText(_datosorigendatos.DBMS /*String*/ );
RDebugUtils.currentLine=129761286;
 //BA.debugLineNum = 129761286;BA.debugLine="pnlOrigenSQL.Visible=True";
_pnlorigensql.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129761287;
 //BA.debugLineNum = 129761287;BA.debugLine="End Sub";
return "";
}
public static void  _cargacamposjrdcmysql(String _ipjrdc,int _puertojrdc,String _nombretabla) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cargacamposjrdcmysql", true))
	 {Debug.delegate(ba, "cargacamposjrdcmysql", new Object[] {_ipjrdc,_puertojrdc,_nombretabla}); return;}
ResumableSub_CargaCamposJRDCMySQL rsub = new ResumableSub_CargaCamposJRDCMySQL(null,_ipjrdc,_puertojrdc,_nombretabla);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaCamposJRDCMySQL extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCMySQL(b4j.docU.jamrecordformbuilder parent,String _ipjrdc,int _puertojrdc,String _nombretabla) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
}
b4j.docU.jamrecordformbuilder parent;
String _ipjrdc;
int _puertojrdc;
String _nombretabla;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;
String _rdclinkquery = "";
String _comandoconfigprop = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _tipodato = "";
String _tipodatomysql = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mreg = null;
anywheresoftware.b4a.objects.collections.Map _mdatacampo = null;
int step20;
int limit20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129826817;
 //BA.debugLineNum = 129826817;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=129826818;
 //BA.debugLineNum = 129826818;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=129826819;
 //BA.debugLineNum = 129826819;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=129826820;
 //BA.debugLineNum = 129826820;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=129826821;
 //BA.debugLineNum = 129826821;BA.debugLine="Dim ComandoConfigProp As String=\"InfoCamposTabla\"";
_comandoconfigprop = "InfoCamposTabla";
RDebugUtils.currentLine=129826823;
 //BA.debugLineNum = 129826823;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigprop,new Object[]{(Object)(_nombretabla)},jamrecordformbuilder.getObject());
RDebugUtils.currentLine=129826824;
 //BA.debugLineNum = 129826824;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargacamposjrdcmysql"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=129826825;
 //BA.debugLineNum = 129826825;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=129826826;
 //BA.debugLineNum = 129826826;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 55;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
RDebugUtils.currentLine=129826827;
 //BA.debugLineNum = 129826827;BA.debugLine="Accion=\"ErrorServer\"";
_accion = "ErrorServer";
RDebugUtils.currentLine=129826828;
 //BA.debugLineNum = 129826828;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
parent._fx.Msgbox(parent._frm,"Sin conexión con el servidor / base de datos / error de consulta"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Avisa al administrador de la aplicación","Error");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=129826830;
 //BA.debugLineNum = 129826830;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 54;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
RDebugUtils.currentLine=129826831;
 //BA.debugLineNum = 129826831;BA.debugLine="Accion=\"TablaNoExiste\"";
_accion = "TablaNoExiste";
RDebugUtils.currentLine=129826832;
 //BA.debugLineNum = 129826832;BA.debugLine="fx.Msgbox(frm,\"La tabla \" & NombreTabla & \" no";
parent._fx.Msgbox(parent._frm,"La tabla "+_nombretabla+" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos.","Aviso");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=129826834;
 //BA.debugLineNum = 129826834;BA.debugLine="Dim TipoDato As String";
_tipodato = "";
RDebugUtils.currentLine=129826835;
 //BA.debugLineNum = 129826835;BA.debugLine="Dim TipoDatoMySQL As String";
_tipodatomysql = "";
RDebugUtils.currentLine=129826836;
 //BA.debugLineNum = 129826836;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=129826839;
 //BA.debugLineNum = 129826839;BA.debugLine="For i=0 To lstRes.Size-1";
if (true) break;

case 11:
//for
this.state = 48;
step20 = 1;
limit20 = (int) (_lstres.getSize()-1);
_i = (int) (0) ;
this.state = 57;
if (true) break;

case 57:
//C
this.state = 48;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 13;
if (true) break;

case 58:
//C
this.state = 57;
_i = ((int)(0 + _i + step20)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=129826840;
 //BA.debugLineNum = 129826840;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
_mreg = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get(_i)));
RDebugUtils.currentLine=129826841;
 //BA.debugLineNum = 129826841;BA.debugLine="Dim mDataCampo As Map";
_mdatacampo = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=129826842;
 //BA.debugLineNum = 129826842;BA.debugLine="mDataCampo.Initialize";
_mdatacampo.Initialize();
RDebugUtils.currentLine=129826843;
 //BA.debugLineNum = 129826843;BA.debugLine="mDataCampo.Put(\"Campo\",mReg.Get(\"COLUMN_NAME\")";
_mdatacampo.Put((Object)("Campo"),_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=129826844;
 //BA.debugLineNum = 129826844;BA.debugLine="mDataCampo.Put(\"TituloCampo\",mReg.Get(\"COLUMN_";
_mdatacampo.Put((Object)("TituloCampo"),_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=129826845;
 //BA.debugLineNum = 129826845;BA.debugLine="mDataCampo.Put(\"TipoDatoMySQL\",mReg.Get(\"DATA_";
_mdatacampo.Put((Object)("TipoDatoMySQL"),_mreg.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=129826846;
 //BA.debugLineNum = 129826846;BA.debugLine="mDataCampo.Put(\"TipoColumna\",mReg.Get(\"COLUMN_";
_mdatacampo.Put((Object)("TipoColumna"),_mreg.Get((Object)("COLUMN_TYPE")));
RDebugUtils.currentLine=129826847;
 //BA.debugLineNum = 129826847;BA.debugLine="mDataCampo.Put(\"NoNulo\",\"NO\"=mReg.Get(\"IS_NULL";
_mdatacampo.Put((Object)("NoNulo"),(Object)(("NO").equals(BA.ObjectToString(_mreg.Get((Object)("IS_NULLABLE"))))));
RDebugUtils.currentLine=129826848;
 //BA.debugLineNum = 129826848;BA.debugLine="mDataCampo.Put(\"PrimaryKey\",\"PRI\"=mReg.Get(\"CO";
_mdatacampo.Put((Object)("PrimaryKey"),(Object)(("PRI").equals(BA.ObjectToString(_mreg.Get((Object)("COLUMN_KEY"))))));
RDebugUtils.currentLine=129826849;
 //BA.debugLineNum = 129826849;BA.debugLine="mDataCampo.Put(\"AutoIncremental\",\"auto_increme";
_mdatacampo.Put((Object)("AutoIncremental"),(Object)(("auto_increment").equals(BA.ObjectToString(_mreg.Get((Object)("EXTRA"))))));
RDebugUtils.currentLine=129826850;
 //BA.debugLineNum = 129826850;BA.debugLine="mDataCampo.Put(\"ValorCampoPorDefecto\",mReg.Get";
_mdatacampo.Put((Object)("ValorCampoPorDefecto"),_mreg.Get((Object)("COLUMN_DEFAULT")));
RDebugUtils.currentLine=129826852;
 //BA.debugLineNum = 129826852;BA.debugLine="TipoDatoMySQL=mReg.Get(\"DATA_TYPE\")";
_tipodatomysql = BA.ObjectToString(_mreg.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=129826854;
 //BA.debugLineNum = 129826854;BA.debugLine="Select TipoDatoMySQL";
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_tipodatomysql,"smallint","int","tinyint","bit","bigint","varchar","char","text","nchar","ntext","nvarchar","enum","double","decimal","float")) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
case 5: {
this.state = 26;
if (true) break;
}
case 6: {
this.state = 28;
if (true) break;
}
case 7: {
this.state = 30;
if (true) break;
}
case 8: {
this.state = 32;
if (true) break;
}
case 9: {
this.state = 34;
if (true) break;
}
case 10: {
this.state = 36;
if (true) break;
}
case 11: {
this.state = 38;
if (true) break;
}
case 12: {
this.state = 40;
if (true) break;
}
case 13: {
this.state = 42;
if (true) break;
}
case 14: {
this.state = 44;
if (true) break;
}
default: {
this.state = 46;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 47;
RDebugUtils.currentLine=129826881;
 //BA.debugLineNum = 129826881;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 18:
//C
this.state = 47;
RDebugUtils.currentLine=129826883;
 //BA.debugLineNum = 129826883;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 20:
//C
this.state = 47;
RDebugUtils.currentLine=129826885;
 //BA.debugLineNum = 129826885;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 22:
//C
this.state = 47;
RDebugUtils.currentLine=129826887;
 //BA.debugLineNum = 129826887;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 24:
//C
this.state = 47;
RDebugUtils.currentLine=129826889;
 //BA.debugLineNum = 129826889;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 26:
//C
this.state = 47;
RDebugUtils.currentLine=129826891;
 //BA.debugLineNum = 129826891;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 28:
//C
this.state = 47;
RDebugUtils.currentLine=129826893;
 //BA.debugLineNum = 129826893;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 30:
//C
this.state = 47;
RDebugUtils.currentLine=129826895;
 //BA.debugLineNum = 129826895;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 32:
//C
this.state = 47;
RDebugUtils.currentLine=129826897;
 //BA.debugLineNum = 129826897;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 34:
//C
this.state = 47;
RDebugUtils.currentLine=129826899;
 //BA.debugLineNum = 129826899;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 36:
//C
this.state = 47;
RDebugUtils.currentLine=129826901;
 //BA.debugLineNum = 129826901;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 38:
//C
this.state = 47;
RDebugUtils.currentLine=129826903;
 //BA.debugLineNum = 129826903;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 40:
//C
this.state = 47;
RDebugUtils.currentLine=129826905;
 //BA.debugLineNum = 129826905;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 42:
//C
this.state = 47;
RDebugUtils.currentLine=129826907;
 //BA.debugLineNum = 129826907;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=129826909;
 //BA.debugLineNum = 129826909;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=129826912;
 //BA.debugLineNum = 129826912;BA.debugLine="TipoDato=\"\"";
_tipodato = "";
 if (true) break;

case 47:
//C
this.state = 58;
;
RDebugUtils.currentLine=129826915;
 //BA.debugLineNum = 129826915;BA.debugLine="mDataCampo.Put(\"TipoDato\",TipoDato)";
_mdatacampo.Put((Object)("TipoDato"),(Object)(_tipodato));
RDebugUtils.currentLine=129826916;
 //BA.debugLineNum = 129826916;BA.debugLine="lstCamposSQL.Add(mDataCampo)";
_lstcampossql.Add((Object)(_mdatacampo.getObject()));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=129826919;
 //BA.debugLineNum = 129826919;BA.debugLine="If lstCamposSQL.Size=0 Then";

case 48:
//if
this.state = 53;
if (_lstcampossql.getSize()==0) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
RDebugUtils.currentLine=129826920;
 //BA.debugLineNum = 129826920;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
_accion = "TablaExisteSinCampos";
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=129826922;
 //BA.debugLineNum = 129826922;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
RDebugUtils.currentLine=129826926;
 //BA.debugLineNum = 129826926;BA.debugLine="CallSubDelayed3(Me,\"CargaCamposJRDCMySQL_Complete";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(ba,jamrecordformbuilder.getObject(),"CargaCamposJRDCMySQL_Completed",(Object)(_accion),(Object)(_lstcampossql));
RDebugUtils.currentLine=129826927;
 //BA.debugLineNum = 129826927;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cargacamposjrdcsqlserver(String _ipjrdc,int _puertojrdc,String _nombretabla) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cargacamposjrdcsqlserver", true))
	 {Debug.delegate(ba, "cargacamposjrdcsqlserver", new Object[] {_ipjrdc,_puertojrdc,_nombretabla}); return;}
ResumableSub_CargaCamposJRDCSQLServer rsub = new ResumableSub_CargaCamposJRDCSQLServer(null,_ipjrdc,_puertojrdc,_nombretabla);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaCamposJRDCSQLServer extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCSQLServer(b4j.docU.jamrecordformbuilder parent,String _ipjrdc,int _puertojrdc,String _nombretabla) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
}
b4j.docU.jamrecordformbuilder parent;
String _ipjrdc;
int _puertojrdc;
String _nombretabla;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;
String _rdclinkquery = "";
String _comandoconfigprop = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
String _tipodato = "";
String _tipodatosqlserver = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mreg = null;
anywheresoftware.b4a.objects.collections.Map _mdatacampo = null;
int step24;
int limit24;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129892353;
 //BA.debugLineNum = 129892353;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=129892354;
 //BA.debugLineNum = 129892354;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=129892355;
 //BA.debugLineNum = 129892355;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=129892357;
 //BA.debugLineNum = 129892357;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=129892359;
 //BA.debugLineNum = 129892359;BA.debugLine="Dim ComandoConfigProp As String=\"InfoTotalCamposT";
_comandoconfigprop = "InfoTotalCamposTabla";
RDebugUtils.currentLine=129892361;
 //BA.debugLineNum = 129892361;BA.debugLine="Log(\"Antes de CargaCamposJRDC \" & IPJrdc & \", \" &";
anywheresoftware.b4a.keywords.Common.LogImpl("9129892361","Antes de CargaCamposJRDC "+_ipjrdc+", "+BA.NumberToString(_puertojrdc)+", "+_nombretabla,0);
RDebugUtils.currentLine=129892362;
 //BA.debugLineNum = 129892362;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigprop,new Object[]{(Object)(_nombretabla),(Object)(_nombretabla)},jamrecordformbuilder.getObject());
RDebugUtils.currentLine=129892363;
 //BA.debugLineNum = 129892363;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargacamposjrdcsqlserver"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=129892364;
 //BA.debugLineNum = 129892364;BA.debugLine="Log (\"Despues de CargaCamposJRDC, mresult \" & mre";
anywheresoftware.b4a.keywords.Common.LogImpl("9129892364","Despues de CargaCamposJRDC, mresult "+BA.ObjectToString(_mresult),0);
RDebugUtils.currentLine=129892365;
 //BA.debugLineNum = 129892365;BA.debugLine="frm.rootpane.MouseCursor = fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=129892366;
 //BA.debugLineNum = 129892366;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 55;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
RDebugUtils.currentLine=129892367;
 //BA.debugLineNum = 129892367;BA.debugLine="Accion=\"ErrorServer\"";
_accion = "ErrorServer";
RDebugUtils.currentLine=129892369;
 //BA.debugLineNum = 129892369;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sin conexión";
_msa = parent._xui.MsgboxAsync(ba,"Sin conexión con el servidor / base de datos / error de consulta"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Avisa al administrador de la aplicación","Error");
RDebugUtils.currentLine=129892370;
 //BA.debugLineNum = 129892370;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargacamposjrdcsqlserver"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 55;
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=129892372;
 //BA.debugLineNum = 129892372;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 54;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
RDebugUtils.currentLine=129892373;
 //BA.debugLineNum = 129892373;BA.debugLine="Accion=\"TablaNoExiste\"";
_accion = "TablaNoExiste";
RDebugUtils.currentLine=129892375;
 //BA.debugLineNum = 129892375;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La tabla \" &";
_msa = parent._xui.MsgboxAsync(ba,"La tabla "+_nombretabla+" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos.","Error");
RDebugUtils.currentLine=129892376;
 //BA.debugLineNum = 129892376;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargacamposjrdcsqlserver"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=129892378;
 //BA.debugLineNum = 129892378;BA.debugLine="Dim TipoDato As String";
_tipodato = "";
RDebugUtils.currentLine=129892379;
 //BA.debugLineNum = 129892379;BA.debugLine="Dim TipoDatoSQLServer As String";
_tipodatosqlserver = "";
RDebugUtils.currentLine=129892380;
 //BA.debugLineNum = 129892380;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=129892383;
 //BA.debugLineNum = 129892383;BA.debugLine="For i=0 To lstRes.Size-1";
if (true) break;

case 11:
//for
this.state = 48;
step24 = 1;
limit24 = (int) (_lstres.getSize()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 48;
if ((step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24)) this.state = 13;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step24)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=129892384;
 //BA.debugLineNum = 129892384;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
_mreg = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get(_i)));
RDebugUtils.currentLine=129892385;
 //BA.debugLineNum = 129892385;BA.debugLine="Dim mDataCampo As Map";
_mdatacampo = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=129892386;
 //BA.debugLineNum = 129892386;BA.debugLine="mDataCampo.Initialize";
_mdatacampo.Initialize();
RDebugUtils.currentLine=129892387;
 //BA.debugLineNum = 129892387;BA.debugLine="mDataCampo.Put(\"Campo\",mReg.Get(\"COLUMN_NAME\")";
_mdatacampo.Put((Object)("Campo"),_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=129892388;
 //BA.debugLineNum = 129892388;BA.debugLine="mDataCampo.Put(\"TituloCampo\",mReg.Get(\"COLUMN_";
_mdatacampo.Put((Object)("TituloCampo"),_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=129892389;
 //BA.debugLineNum = 129892389;BA.debugLine="mDataCampo.Put(\"TipoDatoMySQL\",mReg.Get(\"DATA_";
_mdatacampo.Put((Object)("TipoDatoMySQL"),_mreg.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=129892390;
 //BA.debugLineNum = 129892390;BA.debugLine="mDataCampo.Put(\"TipoColumna\",mReg.Get(\"COLUMN_";
_mdatacampo.Put((Object)("TipoColumna"),_mreg.Get((Object)("COLUMN_TYPE")));
RDebugUtils.currentLine=129892391;
 //BA.debugLineNum = 129892391;BA.debugLine="mDataCampo.Put(\"NoNulo\",\"NO\"=mReg.Get(\"IS_NULL";
_mdatacampo.Put((Object)("NoNulo"),(Object)(("NO").equals(BA.ObjectToString(_mreg.Get((Object)("IS_NULLABLE"))))));
RDebugUtils.currentLine=129892392;
 //BA.debugLineNum = 129892392;BA.debugLine="mDataCampo.Put(\"PrimaryKey\",mReg.Get(\"PK\")=mRe";
_mdatacampo.Put((Object)("PrimaryKey"),(Object)((_mreg.Get((Object)("PK"))).equals(_mreg.Get((Object)("COLUMN_NAME")))));
RDebugUtils.currentLine=129892393;
 //BA.debugLineNum = 129892393;BA.debugLine="mDataCampo.Put(\"AutoIncremental\",1=mReg.Get(\"I";
_mdatacampo.Put((Object)("AutoIncremental"),(Object)(1==(double)(BA.ObjectToNumber(_mreg.Get((Object)("Identidad"))))));
RDebugUtils.currentLine=129892394;
 //BA.debugLineNum = 129892394;BA.debugLine="mDataCampo.Put(\"ValorCampoPorDefecto\",mReg.Get";
_mdatacampo.Put((Object)("ValorCampoPorDefecto"),_mreg.Get((Object)("COLUMN_DEFAULT")));
RDebugUtils.currentLine=129892396;
 //BA.debugLineNum = 129892396;BA.debugLine="TipoDatoSQLServer=mReg.Get(\"DATA_TYPE\")";
_tipodatosqlserver = BA.ObjectToString(_mreg.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=129892397;
 //BA.debugLineNum = 129892397;BA.debugLine="Log(\"TipoDatoSQLServer \" & TipoDatoSQLServer)";
anywheresoftware.b4a.keywords.Common.LogImpl("9129892397","TipoDatoSQLServer "+_tipodatosqlserver,0);
RDebugUtils.currentLine=129892398;
 //BA.debugLineNum = 129892398;BA.debugLine="Select TipoDatoSQLServer";
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_tipodatosqlserver,"smallint","int","tinyint","bit","bigint","varchar","char","text","nchar","ntext","nvarchar","enum","double","decimal","float")) {
case 0: {
this.state = 16;
if (true) break;
}
case 1: {
this.state = 18;
if (true) break;
}
case 2: {
this.state = 20;
if (true) break;
}
case 3: {
this.state = 22;
if (true) break;
}
case 4: {
this.state = 24;
if (true) break;
}
case 5: {
this.state = 26;
if (true) break;
}
case 6: {
this.state = 28;
if (true) break;
}
case 7: {
this.state = 30;
if (true) break;
}
case 8: {
this.state = 32;
if (true) break;
}
case 9: {
this.state = 34;
if (true) break;
}
case 10: {
this.state = 36;
if (true) break;
}
case 11: {
this.state = 38;
if (true) break;
}
case 12: {
this.state = 40;
if (true) break;
}
case 13: {
this.state = 42;
if (true) break;
}
case 14: {
this.state = 44;
if (true) break;
}
default: {
this.state = 46;
if (true) break;
}
}
if (true) break;

case 16:
//C
this.state = 47;
RDebugUtils.currentLine=129892400;
 //BA.debugLineNum = 129892400;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 18:
//C
this.state = 47;
RDebugUtils.currentLine=129892402;
 //BA.debugLineNum = 129892402;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 20:
//C
this.state = 47;
RDebugUtils.currentLine=129892404;
 //BA.debugLineNum = 129892404;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 22:
//C
this.state = 47;
RDebugUtils.currentLine=129892406;
 //BA.debugLineNum = 129892406;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 24:
//C
this.state = 47;
RDebugUtils.currentLine=129892408;
 //BA.debugLineNum = 129892408;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 26:
//C
this.state = 47;
RDebugUtils.currentLine=129892410;
 //BA.debugLineNum = 129892410;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 28:
//C
this.state = 47;
RDebugUtils.currentLine=129892412;
 //BA.debugLineNum = 129892412;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 30:
//C
this.state = 47;
RDebugUtils.currentLine=129892414;
 //BA.debugLineNum = 129892414;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 32:
//C
this.state = 47;
RDebugUtils.currentLine=129892416;
 //BA.debugLineNum = 129892416;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 34:
//C
this.state = 47;
RDebugUtils.currentLine=129892418;
 //BA.debugLineNum = 129892418;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 36:
//C
this.state = 47;
RDebugUtils.currentLine=129892420;
 //BA.debugLineNum = 129892420;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 38:
//C
this.state = 47;
RDebugUtils.currentLine=129892422;
 //BA.debugLineNum = 129892422;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 40:
//C
this.state = 47;
RDebugUtils.currentLine=129892424;
 //BA.debugLineNum = 129892424;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 42:
//C
this.state = 47;
RDebugUtils.currentLine=129892426;
 //BA.debugLineNum = 129892426;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=129892428;
 //BA.debugLineNum = 129892428;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=129892431;
 //BA.debugLineNum = 129892431;BA.debugLine="TipoDato=\"\"";
_tipodato = "";
 if (true) break;

case 47:
//C
this.state = 60;
;
RDebugUtils.currentLine=129892433;
 //BA.debugLineNum = 129892433;BA.debugLine="Log(\"TipoDato=\" & TipoDato)";
anywheresoftware.b4a.keywords.Common.LogImpl("9129892433","TipoDato="+_tipodato,0);
RDebugUtils.currentLine=129892434;
 //BA.debugLineNum = 129892434;BA.debugLine="mDataCampo.Put(\"TipoDato\",TipoDato)";
_mdatacampo.Put((Object)("TipoDato"),(Object)(_tipodato));
RDebugUtils.currentLine=129892436;
 //BA.debugLineNum = 129892436;BA.debugLine="lstCamposSQL.Add(mDataCampo)";
_lstcampossql.Add((Object)(_mdatacampo.getObject()));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=129892440;
 //BA.debugLineNum = 129892440;BA.debugLine="If lstCamposSQL.Size=0 Then";

case 48:
//if
this.state = 53;
if (_lstcampossql.getSize()==0) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
RDebugUtils.currentLine=129892442;
 //BA.debugLineNum = 129892442;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
_accion = "TablaExisteSinCampos";
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=129892444;
 //BA.debugLineNum = 129892444;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;

case 55:
//C
this.state = -1;
;
RDebugUtils.currentLine=129892449;
 //BA.debugLineNum = 129892449;BA.debugLine="CallSubDelayed3(Me,\"CargaCamposJRDCSQLServer_Comp";
anywheresoftware.b4a.keywords.Common.CallSubDelayed3(ba,jamrecordformbuilder.getObject(),"CargaCamposJRDCSQLServer_Completed",(Object)(_accion),(Object)(_lstcampossql));
RDebugUtils.currentLine=129892451;
 //BA.debugLineNum = 129892451;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnigualorigendatosaux_click() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "btnigualorigendatosaux_click", true))
	 {return ((String) Debug.delegate(ba, "btnigualorigendatosaux_click", null));}
int _index = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
RDebugUtils.currentLine=131399680;
 //BA.debugLineNum = 131399680;BA.debugLine="Sub btnIgualOrigenDatosAux_Click";
RDebugUtils.currentLine=131399681;
 //BA.debugLineNum = 131399681;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
_index = _clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba))));
RDebugUtils.currentLine=131399682;
 //BA.debugLineNum = 131399682;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(_clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=131399683;
 //BA.debugLineNum = 131399683;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" Then";
if ((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Consulta"))) { 
RDebugUtils.currentLine=131399684;
 //BA.debugLineNum = 131399684;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Text=DatosOrigenDa";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_datosorigendatos.IpJRDC /*String*/ );
RDebugUtils.currentLine=131399685;
 //BA.debugLineNum = 131399685;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Text=DatosOrig";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_datosorigendatos.PuertoJRDC /*String*/ );
 };
RDebugUtils.currentLine=131399687;
 //BA.debugLineNum = 131399687;BA.debugLine="End Sub";
return "";
}
public static String  _btnorigenjrdc_click() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "btnorigenjrdc_click", true))
	 {return ((String) Debug.delegate(ba, "btnorigenjrdc_click", null));}
RDebugUtils.currentLine=130613248;
 //BA.debugLineNum = 130613248;BA.debugLine="Sub btnOrigenJRDC_Click";
RDebugUtils.currentLine=130613250;
 //BA.debugLineNum = 130613250;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargaitemsclv(anywheresoftware.b4a.objects.collections.List _lstmapsdata) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cargaitemsclv", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargaitemsclv", new Object[] {_lstmapsdata}));}
ResumableSub_CargaItemsCLV rsub = new ResumableSub_CargaItemsCLV(null,_lstmapsdata);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaItemsCLV extends BA.ResumableSub {
public ResumableSub_CargaItemsCLV(b4j.docU.jamrecordformbuilder parent,anywheresoftware.b4a.objects.collections.List _lstmapsdata) {
this.parent = parent;
this._lstmapsdata = _lstmapsdata;
}
b4j.docU.jamrecordformbuilder parent;
anywheresoftware.b4a.objects.collections.List _lstmapsdata;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mdatacampo = null;
int step1;
int limit1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129957889;
 //BA.debugLineNum = 129957889;BA.debugLine="For i=0 To lstMapsData.Size-1";
if (true) break;

case 1:
//for
this.state = 4;
step1 = 1;
limit1 = (int) (_lstmapsdata.getSize()-1);
_i = (int) (0) ;
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 6:
//C
this.state = 5;
_i = ((int)(0 + _i + step1)) ;
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=129957890;
 //BA.debugLineNum = 129957890;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=129957891;
 //BA.debugLineNum = 129957891;BA.debugLine="Dim mDatacampo As Map=lstMapsData.Get(i)";
_mdatacampo = new anywheresoftware.b4a.objects.collections.Map();
_mdatacampo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstmapsdata.Get(_i)));
RDebugUtils.currentLine=129957892;
 //BA.debugLineNum = 129957892;BA.debugLine="AddItem(mDatacampo)";
_additem(_mdatacampo);
RDebugUtils.currentLine=129957893;
 //BA.debugLineNum = 129957893;BA.debugLine="Wait For AddItem_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("additem_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargaitemsclv"), null);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=129957894;
 //BA.debugLineNum = 129957894;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=129957896;
 //BA.debugLineNum = 129957896;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=129957897;
 //BA.debugLineNum = 129957897;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cargardatosdesdefichero(String _f) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cargardatosdesdefichero", true))
	 {Debug.delegate(ba, "cargardatosdesdefichero", new Object[] {_f}); return;}
ResumableSub_CargarDatosDesdeFichero rsub = new ResumableSub_CargarDatosDesdeFichero(null,_f);
rsub.resume(ba, null);
}
public static class ResumableSub_CargarDatosDesdeFichero extends BA.ResumableSub {
public ResumableSub_CargarDatosDesdeFichero(b4j.docU.jamrecordformbuilder parent,String _f) {
this.parent = parent;
this._f = _f;
}
b4j.docU.jamrecordformbuilder parent;
String _f;
anywheresoftware.b4a.objects.collections.List _lstitemsjson = null;
Object _robj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129302529;
 //BA.debugLineNum = 129302529;BA.debugLine="wait for (CargarDatosJSON(f)) complete (lstItemsJ";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargardatosdesdefichero"), _cargardatosjson(_f));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_lstitemsjson = (anywheresoftware.b4a.objects.collections.List) result[0];
;
RDebugUtils.currentLine=129302530;
 //BA.debugLineNum = 129302530;BA.debugLine="If lstItemsJSON.Size>0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_lstitemsjson.getSize()>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=129302531;
 //BA.debugLineNum = 129302531;BA.debugLine="WAIT FOR (CargaItemsCLV(lstItemsJSON)) COMPLETE";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargardatosdesdefichero"), _cargaitemsclv(_lstitemsjson));
this.state = 6;
return;
case 6:
//C
this.state = 4;
_robj = (Object) result[0];
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=129302533;
 //BA.debugLineNum = 129302533;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargardatosjson(String _f) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cargardatosjson", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargardatosjson", new Object[] {_f}));}
ResumableSub_CargarDatosJSON rsub = new ResumableSub_CargarDatosJSON(null,_f);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargarDatosJSON extends BA.ResumableSub {
public ResumableSub_CargarDatosJSON(b4j.docU.jamrecordformbuilder parent,String _f) {
this.parent = parent;
this._f = _f;
}
b4j.docU.jamrecordformbuilder parent;
String _f;
anywheresoftware.b4a.objects.collections.List _lstitemsfromstring = null;
String _s = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstdatoscampossql = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _modificacionendatosjson = null;
anywheresoftware.b4a.objects.collections.List _lstidxdel = null;
int _idxjson = 0;
anywheresoftware.b4a.objects.collections.Map _mjson = null;
String _campojson = "";
boolean _flagcampojsonok = false;
int _idxmysql = 0;
anywheresoftware.b4a.objects.collections.Map _mmysql = null;
String _campomysql = "";
boolean _controlindep = false;
int _idxdel = 0;
anywheresoftware.b4a.objects.collections.List _lstcamposadd = null;
int _idxsql = 0;
anywheresoftware.b4a.objects.collections.Map _msql = null;
String _tipodatomysqlmysql = "";
boolean _nonulomysql = false;
boolean _primarykeymysql = false;
boolean _autoincrementalmysql = false;
String _valorcampopordefectomysql = "";
boolean _flagcampomysqlexisteenjson = false;
String _tipodatomysqljson = "";
boolean _nonulojson = false;
boolean _primarykeyjson = false;
boolean _autoincrementaljson = false;
String _valorcampopordefectojson = "";
String _tipodato = "";
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _rint = 0;
int step43;
int limit43;
int step47;
int limit47;
anywheresoftware.b4a.BA.IterableList group67;
int index67;
int groupLen67;
int step72;
int limit72;
int step82;
int limit82;
anywheresoftware.b4a.BA.IterableList group147;
int index147;
int groupLen147;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129368066;
 //BA.debugLineNum = 129368066;BA.debugLine="Dim lstItemsFromString As List";
_lstitemsfromstring = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=129368067;
 //BA.debugLineNum = 129368067;BA.debugLine="lstItemsFromString.Initialize";
_lstitemsfromstring.Initialize();
RDebugUtils.currentLine=129368069;
 //BA.debugLineNum = 129368069;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 126;
this.catchState = 125;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 125;
RDebugUtils.currentLine=129368070;
 //BA.debugLineNum = 129368070;BA.debugLine="Dim s As String = File.ReadString(f, \"\")";
_s = anywheresoftware.b4a.keywords.Common.File.ReadString(_f,"");
RDebugUtils.currentLine=129368071;
 //BA.debugLineNum = 129368071;BA.debugLine="CurrentFileString = s";
parent._currentfilestring = _s;
RDebugUtils.currentLine=129368073;
 //BA.debugLineNum = 129368073;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=129368074;
 //BA.debugLineNum = 129368074;BA.debugLine="lstPrimaryKey.Initialize";
parent._lstprimarykey.Initialize();
RDebugUtils.currentLine=129368075;
 //BA.debugLineNum = 129368075;BA.debugLine="SetCurrentFile(f)";
_setcurrentfile(_f);
RDebugUtils.currentLine=129368077;
 //BA.debugLineNum = 129368077;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=129368078;
 //BA.debugLineNum = 129368078;BA.debugLine="parser.Initialize(s)";
_parser.Initialize(_s);
RDebugUtils.currentLine=129368079;
 //BA.debugLineNum = 129368079;BA.debugLine="Dim m As Map = parser.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _parser.NextObject();
RDebugUtils.currentLine=129368082;
 //BA.debugLineNum = 129368082;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(m.Get(\"Ip";
parent._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_m.Get((Object)("IpJRDC"))),BA.ObjectToString(_m.Get((Object)("PuertoJRDC"))),BA.ObjectToString(_m.Get((Object)("NombreTabla"))),BA.ObjectToString(_m.GetDefault((Object)("DBMS"),(Object)("MySQL"))));
RDebugUtils.currentLine=129368085;
 //BA.debugLineNum = 129368085;BA.debugLine="ColItemsImpares=m.GetDefault(\"ColorItemsImpares\"";
parent._colitemsimpares = (int)(BA.ObjectToNumber(_m.GetDefault((Object)("ColorItemsImpares"),(Object)(parent._colitemsimparespredeterminado))));
RDebugUtils.currentLine=129368086;
 //BA.debugLineNum = 129368086;BA.debugLine="ColItemsPares=m.GetDefault(\"ColorItemsPares\",Col";
parent._colitemspares = (int)(BA.ObjectToNumber(_m.GetDefault((Object)("ColorItemsPares"),(Object)(parent._colitemsparespredeterminado))));
RDebugUtils.currentLine=129368088;
 //BA.debugLineNum = 129368088;BA.debugLine="txtRGBColorFondoItemsImpares.Text=GetCssColorStr";
parent._txtrgbcolorfondoitemsimpares.setText(_getcsscolorstringfromintcolor(parent._colitemsimpares));
RDebugUtils.currentLine=129368089;
 //BA.debugLineNum = 129368089;BA.debugLine="If txtRGBColorFondoItemsImpares.Text=\"transparen";
if (true) break;

case 4:
//if
this.state = 9;
if ((parent._txtrgbcolorfondoitemsimpares.getText()).equals("transparent")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=129368090;
 //BA.debugLineNum = 129368090;BA.debugLine="lblColorFondoItemsImpares.Color=0";
parent._lblcolorfondoitemsimpares.setColor((int) (0));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=129368093;
 //BA.debugLineNum = 129368093;BA.debugLine="lblColorFondoItemsImpares.Color=ColItemsImpares";
parent._lblcolorfondoitemsimpares.setColor(parent._colitemsimpares);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=129368096;
 //BA.debugLineNum = 129368096;BA.debugLine="txtRGBColorFondoItemsPares.Text=GetCssColorStrin";
parent._txtrgbcolorfondoitemspares.setText(_getcsscolorstringfromintcolor(parent._colitemspares));
RDebugUtils.currentLine=129368097;
 //BA.debugLineNum = 129368097;BA.debugLine="If txtRGBColorFondoItemsPares.Text=\"transparent\"";
if (true) break;

case 10:
//if
this.state = 15;
if ((parent._txtrgbcolorfondoitemspares.getText()).equals("transparent")) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=129368098;
 //BA.debugLineNum = 129368098;BA.debugLine="lblColorFondoItemsPares.Color=0";
parent._lblcolorfondoitemspares.setColor((int) (0));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=129368101;
 //BA.debugLineNum = 129368101;BA.debugLine="lblColorFondoItemsPares.Color=ColItemsPares";
parent._lblcolorfondoitemspares.setColor(parent._colitemspares);
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=129368104;
 //BA.debugLineNum = 129368104;BA.debugLine="lstNombresCamposSQL.Initialize";
parent._lstnombrescampossql.Initialize();
RDebugUtils.currentLine=129368105;
 //BA.debugLineNum = 129368105;BA.debugLine="Select Case DatosOrigenDatos.DBMS";
if (true) break;

case 16:
//select
this.state = 21;
switch (BA.switchObjectToInt(parent._datosorigendatos.DBMS /*String*/ ,"MySQL","SQLServer")) {
case 0: {
this.state = 18;
if (true) break;
}
case 1: {
this.state = 20;
if (true) break;
}
}
if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=129368107;
 //BA.debugLineNum = 129368107;BA.debugLine="CargaCamposJRDCMySQL(DatosOrigenDatos.IpJRDC,D";
_cargacamposjrdcmysql(parent._datosorigendatos.IpJRDC /*String*/ ,(int)(Double.parseDouble(parent._datosorigendatos.PuertoJRDC /*String*/ )),parent._datosorigendatos.NombreTabla /*String*/ );
RDebugUtils.currentLine=129368108;
 //BA.debugLineNum = 129368108;BA.debugLine="Wait For CargaCamposJRDCMySQL_Completed(Accion";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcmysql_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargardatosjson"), null);
this.state = 127;
return;
case 127:
//C
this.state = 21;
_accion = (String) result[0];
_lstdatoscampossql = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=129368110;
 //BA.debugLineNum = 129368110;BA.debugLine="CargaCamposJRDCSQLServer(DatosOrigenDatos.IpJR";
_cargacamposjrdcsqlserver(parent._datosorigendatos.IpJRDC /*String*/ ,(int)(Double.parseDouble(parent._datosorigendatos.PuertoJRDC /*String*/ )),parent._datosorigendatos.NombreTabla /*String*/ );
RDebugUtils.currentLine=129368111;
 //BA.debugLineNum = 129368111;BA.debugLine="Wait For CargaCamposJRDCSQLServer_Completed(Ac";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcsqlserver_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargardatosjson"), null);
this.state = 128;
return;
case 128:
//C
this.state = 21;
_accion = (String) result[0];
_lstdatoscampossql = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 if (true) break;
;
RDebugUtils.currentLine=129368114;
 //BA.debugLineNum = 129368114;BA.debugLine="If Accion<>\"OK\" Then Return lstItemsFromString";

case 21:
//if
this.state = 26;
if ((_accion).equals("OK") == false) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_lstitemsfromstring));return;};
if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=129368116;
 //BA.debugLineNum = 129368116;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=129368118;
 //BA.debugLineNum = 129368118;BA.debugLine="lstItemsFromString= m.Get(\"Items\")";
_lstitemsfromstring = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=129368123;
 //BA.debugLineNum = 129368123;BA.debugLine="Dim ModificacionEnDatosJSON As StringBuilder";
_modificacionendatosjson = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=129368124;
 //BA.debugLineNum = 129368124;BA.debugLine="ModificacionEnDatosJSON.Initialize";
_modificacionendatosjson.Initialize();
RDebugUtils.currentLine=129368129;
 //BA.debugLineNum = 129368129;BA.debugLine="Dim lstIDxDel As List";
_lstidxdel = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=129368130;
 //BA.debugLineNum = 129368130;BA.debugLine="lstIDxDel.Initialize";
_lstidxdel.Initialize();
RDebugUtils.currentLine=129368131;
 //BA.debugLineNum = 129368131;BA.debugLine="For idxJSON =0 To lstItemsFromString.Size-1";
if (true) break;

case 27:
//for
this.state = 47;
step43 = 1;
limit43 = (int) (_lstitemsfromstring.getSize()-1);
_idxjson = (int) (0) ;
this.state = 129;
if (true) break;

case 129:
//C
this.state = 47;
if ((step43 > 0 && _idxjson <= limit43) || (step43 < 0 && _idxjson >= limit43)) this.state = 29;
if (true) break;

case 130:
//C
this.state = 129;
_idxjson = ((int)(0 + _idxjson + step43)) ;
if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=129368132;
 //BA.debugLineNum = 129368132;BA.debugLine="Dim mJSON As Map=lstItemsFromString.Get(idxJSON";
_mjson = new anywheresoftware.b4a.objects.collections.Map();
_mjson = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstitemsfromstring.Get(_idxjson)));
RDebugUtils.currentLine=129368133;
 //BA.debugLineNum = 129368133;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
_campojson = BA.ObjectToString(_mjson.Get((Object)("Campo")));
RDebugUtils.currentLine=129368134;
 //BA.debugLineNum = 129368134;BA.debugLine="Dim FlagCampoJSONOK As Boolean=False";
_flagcampojsonok = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=129368135;
 //BA.debugLineNum = 129368135;BA.debugLine="For idxMySQL=0 To lstDatosCamposSQL.Size-1";
if (true) break;

case 30:
//for
this.state = 37;
step47 = 1;
limit47 = (int) (_lstdatoscampossql.getSize()-1);
_idxmysql = (int) (0) ;
this.state = 131;
if (true) break;

case 131:
//C
this.state = 37;
if ((step47 > 0 && _idxmysql <= limit47) || (step47 < 0 && _idxmysql >= limit47)) this.state = 32;
if (true) break;

case 132:
//C
this.state = 131;
_idxmysql = ((int)(0 + _idxmysql + step47)) ;
if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=129368136;
 //BA.debugLineNum = 129368136;BA.debugLine="Dim mMySQl As Map=lstDatosCamposSQL.Get(idxMyS";
_mmysql = new anywheresoftware.b4a.objects.collections.Map();
_mmysql = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatoscampossql.Get(_idxmysql)));
RDebugUtils.currentLine=129368137;
 //BA.debugLineNum = 129368137;BA.debugLine="Dim CampoMySQL As String=mMySQl.Get(\"Campo\")";
_campomysql = BA.ObjectToString(_mmysql.Get((Object)("Campo")));
RDebugUtils.currentLine=129368138;
 //BA.debugLineNum = 129368138;BA.debugLine="lstNombresCamposSQL.Add(CampoMySQL)";
parent._lstnombrescampossql.Add((Object)(_campomysql));
RDebugUtils.currentLine=129368139;
 //BA.debugLineNum = 129368139;BA.debugLine="If CampoJSON=CampoMySQL Then";
if (true) break;

case 33:
//if
this.state = 36;
if ((_campojson).equals(_campomysql)) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=129368140;
 //BA.debugLineNum = 129368140;BA.debugLine="FlagCampoJSONOK=True";
_flagcampojsonok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=129368141;
 //BA.debugLineNum = 129368141;BA.debugLine="Exit";
this.state = 37;
if (true) break;
 if (true) break;

case 36:
//C
this.state = 132;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=129368145;
 //BA.debugLineNum = 129368145;BA.debugLine="If FlagCampoJSONOK=False Then";

case 37:
//if
this.state = 46;
if (_flagcampojsonok==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=129368146;
 //BA.debugLineNum = 129368146;BA.debugLine="Dim ControlIndep As Boolean=mJSON.Get(\"Control";
_controlindep = BA.ObjectToBoolean(_mjson.Get((Object)("ControlIndependiente")));
RDebugUtils.currentLine=129368147;
 //BA.debugLineNum = 129368147;BA.debugLine="If Not(ControlIndep) Then";
if (true) break;

case 40:
//if
this.state = 45;
if (anywheresoftware.b4a.keywords.Common.Not(_controlindep)) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
RDebugUtils.currentLine=129368148;
 //BA.debugLineNum = 129368148;BA.debugLine="Log(\"se elimina Campo \" & CampoJSON & \" por n";
anywheresoftware.b4a.keywords.Common.LogImpl("9129368148","se elimina Campo "+_campojson+" por no existir en tabla de la BBDD, index "+BA.NumberToString(_idxjson),0);
RDebugUtils.currentLine=129368150;
 //BA.debugLineNum = 129368150;BA.debugLine="lstIDxDel.Add(idxJSON)";
_lstidxdel.Add((Object)(_idxjson));
RDebugUtils.currentLine=129368151;
 //BA.debugLineNum = 129368151;BA.debugLine="ModificacionEnDatosJSON.Append(\"Campo JSON \"";
_modificacionendatosjson.Append("Campo JSON "+_campojson+" se elimina, por no existir en tabla de la BBDD").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=129368153;
 //BA.debugLineNum = 129368153;BA.debugLine="Log(\"Campo \" & CampoJSON & \" en Control Indep";
anywheresoftware.b4a.keywords.Common.LogImpl("9129368153","Campo "+_campojson+" en Control Independiente, index "+BA.NumberToString(_idxjson),0);
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = 130;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=129368159;
 //BA.debugLineNum = 129368159;BA.debugLine="For Each IDxDel As Int In lstIDxDel";

case 47:
//for
this.state = 50;
group67 = _lstidxdel;
index67 = 0;
groupLen67 = group67.getSize();
this.state = 133;
if (true) break;

case 133:
//C
this.state = 50;
if (index67 < groupLen67) {
this.state = 49;
_idxdel = (int)(BA.ObjectToNumber(group67.Get(index67)));}
if (true) break;

case 134:
//C
this.state = 133;
index67++;
if (true) break;

case 49:
//C
this.state = 134;
RDebugUtils.currentLine=129368160;
 //BA.debugLineNum = 129368160;BA.debugLine="lstItemsFromString.RemoveAt(IDxDel)";
_lstitemsfromstring.RemoveAt(_idxdel);
 if (true) break;
if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=129368170;
 //BA.debugLineNum = 129368170;BA.debugLine="Dim lstCamposAdd As List";
_lstcamposadd = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=129368171;
 //BA.debugLineNum = 129368171;BA.debugLine="lstCamposAdd.Initialize";
_lstcamposadd.Initialize();
RDebugUtils.currentLine=129368174;
 //BA.debugLineNum = 129368174;BA.debugLine="For idxSQL =0 To lstDatosCamposSQL.Size-1";
if (true) break;

case 51:
//for
this.state = 117;
step72 = 1;
limit72 = (int) (_lstdatoscampossql.getSize()-1);
_idxsql = (int) (0) ;
this.state = 135;
if (true) break;

case 135:
//C
this.state = 117;
if ((step72 > 0 && _idxsql <= limit72) || (step72 < 0 && _idxsql >= limit72)) this.state = 53;
if (true) break;

case 136:
//C
this.state = 135;
_idxsql = ((int)(0 + _idxsql + step72)) ;
if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=129368175;
 //BA.debugLineNum = 129368175;BA.debugLine="Dim mSQL As Map=lstDatosCamposSQL.Get(idxSQL)";
_msql = new anywheresoftware.b4a.objects.collections.Map();
_msql = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatoscampossql.Get(_idxsql)));
RDebugUtils.currentLine=129368177;
 //BA.debugLineNum = 129368177;BA.debugLine="Dim CampoMySQL As String=mSQL.Get(\"Campo\")";
_campomysql = BA.ObjectToString(_msql.Get((Object)("Campo")));
RDebugUtils.currentLine=129368178;
 //BA.debugLineNum = 129368178;BA.debugLine="Dim TipoDatoMySQLMySQL As String=mSQL.Get(\"Tipo";
_tipodatomysqlmysql = BA.ObjectToString(_msql.Get((Object)("TipoDatoMySQL")));
RDebugUtils.currentLine=129368179;
 //BA.debugLineNum = 129368179;BA.debugLine="Dim NoNuloMySQL As Boolean=mSQL.Get(\"NoNulo\")";
_nonulomysql = BA.ObjectToBoolean(_msql.Get((Object)("NoNulo")));
RDebugUtils.currentLine=129368180;
 //BA.debugLineNum = 129368180;BA.debugLine="Dim PrimaryKeyMySQL As Boolean=mSQL.Get(\"Primar";
_primarykeymysql = BA.ObjectToBoolean(_msql.Get((Object)("PrimaryKey")));
RDebugUtils.currentLine=129368181;
 //BA.debugLineNum = 129368181;BA.debugLine="Dim AutoIncrementalMySQL As Boolean=mSQL.Get(\"A";
_autoincrementalmysql = BA.ObjectToBoolean(_msql.Get((Object)("AutoIncremental")));
RDebugUtils.currentLine=129368182;
 //BA.debugLineNum = 129368182;BA.debugLine="Dim ValorCampoPorDefectoMySQL As String=mSQL.Ge";
_valorcampopordefectomysql = BA.ObjectToString(_msql.Get((Object)("ValorCampoPorDefecto")));
RDebugUtils.currentLine=129368184;
 //BA.debugLineNum = 129368184;BA.debugLine="Dim FlagCampoJSONOK As Boolean=False";
_flagcampojsonok = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=129368185;
 //BA.debugLineNum = 129368185;BA.debugLine="Dim FlagCampoMySQLExisteEnJSON As Boolean=False";
_flagcampomysqlexisteenjson = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=129368187;
 //BA.debugLineNum = 129368187;BA.debugLine="For idxJSON =0 To lstItemsFromString.Size-1";
if (true) break;

case 54:
//for
this.state = 67;
step82 = 1;
limit82 = (int) (_lstitemsfromstring.getSize()-1);
_idxjson = (int) (0) ;
this.state = 137;
if (true) break;

case 137:
//C
this.state = 67;
if ((step82 > 0 && _idxjson <= limit82) || (step82 < 0 && _idxjson >= limit82)) this.state = 56;
if (true) break;

case 138:
//C
this.state = 137;
_idxjson = ((int)(0 + _idxjson + step82)) ;
if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=129368189;
 //BA.debugLineNum = 129368189;BA.debugLine="Dim mJSON As Map=lstItemsFromString.Get(idxJSO";
_mjson = new anywheresoftware.b4a.objects.collections.Map();
_mjson = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstitemsfromstring.Get(_idxjson)));
RDebugUtils.currentLine=129368190;
 //BA.debugLineNum = 129368190;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
_campojson = BA.ObjectToString(_mjson.Get((Object)("Campo")));
RDebugUtils.currentLine=129368191;
 //BA.debugLineNum = 129368191;BA.debugLine="If CampoJSON=CampoMySQL Then  ' el campo MySQL";
if (true) break;

case 57:
//if
this.state = 66;
if ((_campojson).equals(_campomysql)) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=129368192;
 //BA.debugLineNum = 129368192;BA.debugLine="FlagCampoMySQLExisteEnJSON=True";
_flagcampomysqlexisteenjson = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=129368193;
 //BA.debugLineNum = 129368193;BA.debugLine="Dim TipoDatoMySQLJSON As String=mJSON.Get(\"Ti";
_tipodatomysqljson = BA.ObjectToString(_mjson.Get((Object)("TipoDatoMySQL")));
RDebugUtils.currentLine=129368194;
 //BA.debugLineNum = 129368194;BA.debugLine="Dim NoNuloJSON As Boolean=mJSON.Get(\"NoNulo\")";
_nonulojson = BA.ObjectToBoolean(_mjson.Get((Object)("NoNulo")));
RDebugUtils.currentLine=129368195;
 //BA.debugLineNum = 129368195;BA.debugLine="Dim PrimaryKeyJSON As Boolean=mJSON.Get(\"Prim";
_primarykeyjson = BA.ObjectToBoolean(_mjson.Get((Object)("PrimaryKey")));
RDebugUtils.currentLine=129368196;
 //BA.debugLineNum = 129368196;BA.debugLine="Dim AutoIncrementalJSON As Boolean=mJSON.Get(";
_autoincrementaljson = BA.ObjectToBoolean(_mjson.Get((Object)("AutoIncremental")));
RDebugUtils.currentLine=129368197;
 //BA.debugLineNum = 129368197;BA.debugLine="Dim ValorCampoPorDefectoJSON As String=mJSON.";
_valorcampopordefectojson = BA.ObjectToString(_mjson.Get((Object)("ValorCampoPorDefecto")));
RDebugUtils.currentLine=129368199;
 //BA.debugLineNum = 129368199;BA.debugLine="If TipoDatoMySQLJSON=TipoDatoMySQLMySQL And N";
if (true) break;

case 60:
//if
this.state = 65;
if ((_tipodatomysqljson).equals(_tipodatomysqlmysql) && _nonulojson==_nonulomysql && _primarykeyjson==_primarykeymysql && _autoincrementaljson==_autoincrementalmysql && (_valorcampopordefectojson).equals(_valorcampopordefectomysql)) { 
this.state = 62;
}else {
this.state = 64;
}if (true) break;

case 62:
//C
this.state = 65;
RDebugUtils.currentLine=129368201;
 //BA.debugLineNum = 129368201;BA.debugLine="FlagCampoJSONOK=True   ' si todos los valore";
_flagcampojsonok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=129368202;
 //BA.debugLineNum = 129368202;BA.debugLine="Exit";
this.state = 67;
if (true) break;
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=129368206;
 //BA.debugLineNum = 129368206;BA.debugLine="ModificacionEnDatosJSON.Append(\"Campo JSON \"";
_modificacionendatosjson.Append("Campo JSON "+_campojson+" se modifica, por no coincidir datos con los de la tabla de la BBDD").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=129368210;
 //BA.debugLineNum = 129368210;BA.debugLine="Exit";
this.state = 67;
if (true) break;
 if (true) break;

case 65:
//C
this.state = 66;
;
 if (true) break;

case 66:
//C
this.state = 138;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=129368217;
 //BA.debugLineNum = 129368217;BA.debugLine="If FlagCampoMySQLExisteEnJSON=False Then Modifi";

case 67:
//if
this.state = 72;
if (_flagcampomysqlexisteenjson==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 69;
;}if (true) break;

case 69:
//C
this.state = 72;
_modificacionendatosjson.Append("Campo JSON "+_campomysql+" se añade a JSON, por existir en tabla de la BBDD, y no existir en JSON").Append(anywheresoftware.b4a.keywords.Common.CRLF);
if (true) break;

case 72:
//C
this.state = 73;
;
RDebugUtils.currentLine=129368218;
 //BA.debugLineNum = 129368218;BA.debugLine="If FlagCampoJSONOK=False Then ' o bien el campo";
if (true) break;

case 73:
//if
this.state = 116;
if (_flagcampojsonok==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=129368219;
 //BA.debugLineNum = 129368219;BA.debugLine="Dim TipoDato As String";
_tipodato = "";
RDebugUtils.currentLine=129368220;
 //BA.debugLineNum = 129368220;BA.debugLine="Select TipoDatoMySQLMySQL";
if (true) break;

case 76:
//select
this.state = 109;
switch (BA.switchObjectToInt(_tipodatomysqlmysql,"smallint","int","tinyint","bit","bigint","varchar","char","text","nchar","ntext","nvarchar","enum","double","decimal","float")) {
case 0: {
this.state = 78;
if (true) break;
}
case 1: {
this.state = 80;
if (true) break;
}
case 2: {
this.state = 82;
if (true) break;
}
case 3: {
this.state = 84;
if (true) break;
}
case 4: {
this.state = 86;
if (true) break;
}
case 5: {
this.state = 88;
if (true) break;
}
case 6: {
this.state = 90;
if (true) break;
}
case 7: {
this.state = 92;
if (true) break;
}
case 8: {
this.state = 94;
if (true) break;
}
case 9: {
this.state = 96;
if (true) break;
}
case 10: {
this.state = 98;
if (true) break;
}
case 11: {
this.state = 100;
if (true) break;
}
case 12: {
this.state = 102;
if (true) break;
}
case 13: {
this.state = 104;
if (true) break;
}
case 14: {
this.state = 106;
if (true) break;
}
default: {
this.state = 108;
if (true) break;
}
}
if (true) break;

case 78:
//C
this.state = 109;
RDebugUtils.currentLine=129368240;
 //BA.debugLineNum = 129368240;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 80:
//C
this.state = 109;
RDebugUtils.currentLine=129368242;
 //BA.debugLineNum = 129368242;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 82:
//C
this.state = 109;
RDebugUtils.currentLine=129368244;
 //BA.debugLineNum = 129368244;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 84:
//C
this.state = 109;
RDebugUtils.currentLine=129368246;
 //BA.debugLineNum = 129368246;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 86:
//C
this.state = 109;
RDebugUtils.currentLine=129368248;
 //BA.debugLineNum = 129368248;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 88:
//C
this.state = 109;
RDebugUtils.currentLine=129368250;
 //BA.debugLineNum = 129368250;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 90:
//C
this.state = 109;
RDebugUtils.currentLine=129368252;
 //BA.debugLineNum = 129368252;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 92:
//C
this.state = 109;
RDebugUtils.currentLine=129368254;
 //BA.debugLineNum = 129368254;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 94:
//C
this.state = 109;
RDebugUtils.currentLine=129368256;
 //BA.debugLineNum = 129368256;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 96:
//C
this.state = 109;
RDebugUtils.currentLine=129368258;
 //BA.debugLineNum = 129368258;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 98:
//C
this.state = 109;
RDebugUtils.currentLine=129368260;
 //BA.debugLineNum = 129368260;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 100:
//C
this.state = 109;
RDebugUtils.currentLine=129368262;
 //BA.debugLineNum = 129368262;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 102:
//C
this.state = 109;
RDebugUtils.currentLine=129368264;
 //BA.debugLineNum = 129368264;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 104:
//C
this.state = 109;
RDebugUtils.currentLine=129368266;
 //BA.debugLineNum = 129368266;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 106:
//C
this.state = 109;
RDebugUtils.currentLine=129368268;
 //BA.debugLineNum = 129368268;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 108:
//C
this.state = 109;
RDebugUtils.currentLine=129368271;
 //BA.debugLineNum = 129368271;BA.debugLine="TipoDato=\"\"";
_tipodato = "";
 if (true) break;

case 109:
//C
this.state = 110;
;
RDebugUtils.currentLine=129368274;
 //BA.debugLineNum = 129368274;BA.debugLine="mSQL.Put(\"TipoDato\",TipoDato)";
_msql.Put((Object)("TipoDato"),(Object)(_tipodato));
RDebugUtils.currentLine=129368276;
 //BA.debugLineNum = 129368276;BA.debugLine="If FlagCampoMySQLExisteEnJSON Then";
if (true) break;

case 110:
//if
this.state = 115;
if (_flagcampomysqlexisteenjson) { 
this.state = 112;
}else {
this.state = 114;
}if (true) break;

case 112:
//C
this.state = 115;
RDebugUtils.currentLine=129368277;
 //BA.debugLineNum = 129368277;BA.debugLine="lstItemsFromString.RemoveAt(idxJSON)";
_lstitemsfromstring.RemoveAt(_idxjson);
RDebugUtils.currentLine=129368279;
 //BA.debugLineNum = 129368279;BA.debugLine="lstItemsFromString.InsertAt(idxJSON,mSQL)";
_lstitemsfromstring.InsertAt(_idxjson,(Object)(_msql.getObject()));
 if (true) break;

case 114:
//C
this.state = 115;
RDebugUtils.currentLine=129368282;
 //BA.debugLineNum = 129368282;BA.debugLine="lstCamposAdd.Add(mSQL)";
_lstcamposadd.Add((Object)(_msql.getObject()));
 if (true) break;

case 115:
//C
this.state = 116;
;
 if (true) break;

case 116:
//C
this.state = 136;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=129368287;
 //BA.debugLineNum = 129368287;BA.debugLine="For Each m As Map In lstCamposAdd";

case 117:
//for
this.state = 120;
_m = new anywheresoftware.b4a.objects.collections.Map();
group147 = _lstcamposadd;
index147 = 0;
groupLen147 = group147.getSize();
this.state = 139;
if (true) break;

case 139:
//C
this.state = 120;
if (index147 < groupLen147) {
this.state = 119;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group147.Get(index147)));}
if (true) break;

case 140:
//C
this.state = 139;
index147++;
if (true) break;

case 119:
//C
this.state = 140;
RDebugUtils.currentLine=129368288;
 //BA.debugLineNum = 129368288;BA.debugLine="lstItemsFromString.Add(m)";
_lstitemsfromstring.Add((Object)(_m.getObject()));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=129368290;
 //BA.debugLineNum = 129368290;BA.debugLine="If ModificacionEnDatosJSON.Length>0 Then";

case 120:
//if
this.state = 123;
if (_modificacionendatosjson.getLength()>0) { 
this.state = 122;
}if (true) break;

case 122:
//C
this.state = 123;
RDebugUtils.currentLine=129368291;
 //BA.debugLineNum = 129368291;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(Modificacio";
_msa = parent._xui.MsgboxAsync(ba,_modificacionendatosjson.ToString(),"Aviso");
RDebugUtils.currentLine=129368292;
 //BA.debugLineNum = 129368292;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargardatosjson"), _msa);
this.state = 141;
return;
case 141:
//C
this.state = 123;
_result = (int) result[0];
;
 if (true) break;

case 123:
//C
this.state = 126;
;
 if (true) break;

case 125:
//C
this.state = 126;
this.catchState = 0;
RDebugUtils.currentLine=129368297;
 //BA.debugLineNum = 129368297;BA.debugLine="Dim rSub As ResumableSub=Dialog.Show(LastExcepti";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage()),(Object)("Ok"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=129368298;
 //BA.debugLineNum = 129368298;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cargardatosjson"), _rsub);
this.state = 142;
return;
case 142:
//C
this.state = 126;
_rint = (int) result[0];
;
 if (true) break;
if (true) break;

case 126:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=129368301;
 //BA.debugLineNum = 129368301;BA.debugLine="Return lstItemsFromString";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_lstitemsfromstring));return;};
RDebugUtils.currentLine=129368302;
 //BA.debugLineNum = 129368302;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static String  _setcurrentfile(String _f) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "setcurrentfile", true))
	 {return ((String) Debug.delegate(ba, "setcurrentfile", new Object[] {_f}));}
RDebugUtils.currentLine=129433600;
 //BA.debugLineNum = 129433600;BA.debugLine="Sub SetCurrentFile (f As String)";
RDebugUtils.currentLine=129433601;
 //BA.debugLineNum = 129433601;BA.debugLine="CurrentFile = f";
_currentfile = _f;
RDebugUtils.currentLine=129433602;
 //BA.debugLineNum = 129433602;BA.debugLine="frm.Title = $\"RecordsBuilder ($1.2{Version})\"$";
_frm.setTitle(("RecordsBuilder ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_version))+")"));
RDebugUtils.currentLine=129433603;
 //BA.debugLineNum = 129433603;BA.debugLine="If f <> \"\" Then";
if ((_f).equals("") == false) { 
RDebugUtils.currentLine=129433604;
 //BA.debugLineNum = 129433604;BA.debugLine="frm.Title = frm.Title & \" - \" & File.GetName(f)";
_frm.setTitle(_frm.getTitle()+" - "+anywheresoftware.b4a.keywords.Common.File.GetName(_f));
 };
RDebugUtils.currentLine=129433606;
 //BA.debugLineNum = 129433606;BA.debugLine="RecentManager.AddFile(f)";
_recentmanager._addfile /*String*/ (null,_f);
RDebugUtils.currentLine=129433607;
 //BA.debugLineNum = 129433607;BA.debugLine="End Sub";
return "";
}
public static String  _getcsscolorstringfromintcolor(int _value) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "getcsscolorstringfromintcolor", true))
	 {return ((String) Debug.delegate(ba, "getcsscolorstringfromintcolor", new Object[] {_value}));}
String _hexargb = "";
String _hexrgb = "";
RDebugUtils.currentLine=129499136;
 //BA.debugLineNum = 129499136;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
RDebugUtils.currentLine=129499137;
 //BA.debugLineNum = 129499137;BA.debugLine="Select value";
switch (BA.switchObjectToInt(_value,_fx.Colors.To32Bit(_fx.Colors.Transparent))) {
case 0: {
RDebugUtils.currentLine=129499139;
 //BA.debugLineNum = 129499139;BA.debugLine="Return \"transparent\"";
if (true) return "transparent";
 break; }
default: {
RDebugUtils.currentLine=129499143;
 //BA.debugLineNum = 129499143;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
_hexargb = _colortohex(_value);
RDebugUtils.currentLine=129499144;
 //BA.debugLineNum = 129499144;BA.debugLine="If HexARGB.Length=6 Then";
if (_hexargb.length()==6) { 
RDebugUtils.currentLine=129499145;
 //BA.debugLineNum = 129499145;BA.debugLine="Return \"#\" & HexARGB";
if (true) return "#"+_hexargb;
 }else {
RDebugUtils.currentLine=129499147;
 //BA.debugLineNum = 129499147;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
_hexrgb = _hexargb.substring((int) (2),(int) (8));
RDebugUtils.currentLine=129499148;
 //BA.debugLineNum = 129499148;BA.debugLine="Return \"#\" & HexRGB";
if (true) return "#"+_hexrgb;
 };
 break; }
}
;
RDebugUtils.currentLine=129499151;
 //BA.debugLineNum = 129499151;BA.debugLine="End Sub";
return "";
}
public static String  _cboalineacioncolumna_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cboalineacioncolumna_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cboalineacioncolumna_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=131006464;
 //BA.debugLineNum = 131006464;BA.debugLine="Sub cboAlineacionColumna_ValueChanged (Value As Ob";
RDebugUtils.currentLine=131006465;
 //BA.debugLineNum = 131006465;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=131006466;
 //BA.debugLineNum = 131006466;BA.debugLine="End Sub";
return "";
}
public static String  _cbocampomostrarlmb4xcbo_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cbocampomostrarlmb4xcbo_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cbocampomostrarlmb4xcbo_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=131268608;
 //BA.debugLineNum = 131268608;BA.debugLine="Sub cboCampoMostrarlmB4XCbo_ValueChanged (Value As";
RDebugUtils.currentLine=131268610;
 //BA.debugLineNum = 131268610;BA.debugLine="End Sub";
return "";
}
public static void  _cbotipocontrol_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cbotipocontrol_valuechanged", true))
	 {Debug.delegate(ba, "cbotipocontrol_valuechanged", new Object[] {_value}); return;}
ResumableSub_cboTipoControl_ValueChanged rsub = new ResumableSub_cboTipoControl_ValueChanged(null,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_cboTipoControl_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoControl_ValueChanged(b4j.docU.jamrecordformbuilder parent,Object _value) {
this.parent = parent;
this._value = _value;
}
b4j.docU.jamrecordformbuilder parent;
Object _value;
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotc = null;
int _index = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
anywheresoftware.b4j.objects.CheckboxWrapper _chk = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131072001;
 //BA.debugLineNum = 131072001;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=131072002;
 //BA.debugLineNum = 131072002;BA.debugLine="Dim cboTC As ComboBox=Sender";
_cbotc = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotc = (anywheresoftware.b4j.objects.ComboBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ComboBoxWrapper(), (javafx.scene.control.ComboBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=131072003;
 //BA.debugLineNum = 131072003;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cbotc.getObject())));
RDebugUtils.currentLine=131072004;
 //BA.debugLineNum = 131072004;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=131072008;
 //BA.debugLineNum = 131072008;BA.debugLine="clvIV.lblTitleTipoDatosAux.Visible=(Value=TipoCon";
_clviv.lblTitleTipoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(((_value).equals((Object)(parent._tipocontrol_b4xlistdialogtextfield)) || (_value).equals((Object)(parent._tipocontrol_combobox)) || (_value).equals((Object)(parent._tipocontrol_lmb4xcombobox)) || (_value).equals((Object)(parent._tipocontrol_b4xsearchlistdialogtextfield))));
RDebugUtils.currentLine=131072009;
 //BA.debugLineNum = 131072009;BA.debugLine="clvIV.cboTipoDatosAux.Visible=clvIV.lblTitleTipoD";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setVisible(_clviv.lblTitleTipoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072011;
 //BA.debugLineNum = 131072011;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=clvIV.";
_clviv.lblTitleListaValoresDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Lista")));
RDebugUtils.currentLine=131072012;
 //BA.debugLineNum = 131072012;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=clvIV.lblTi";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_clviv.lblTitleListaValoresDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072014;
 //BA.debugLineNum = 131072014;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=clvIV.";
_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Consulta")));
RDebugUtils.currentLine=131072015;
 //BA.debugLineNum = 131072015;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=clvIV.lblTit";
_clviv.btnIgualOrigenDatosAux /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072016;
 //BA.debugLineNum = 131072016;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=clvIV.lblTi";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072017;
 //BA.debugLineNum = 131072017;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=cl";
_clviv.lblTitlePuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072018;
 //BA.debugLineNum = 131072018;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=clvIV.l";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072019;
 //BA.debugLineNum = 131072019;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=clvIV";
_clviv.lblTitleComandoConfigDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072020;
 //BA.debugLineNum = 131072020;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=clvIV.lblT";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072021;
 //BA.debugLineNum = 131072021;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=c";
_clviv.lblTitleParametrosComandoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072022;
 //BA.debugLineNum = 131072022;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=clvIV.";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .getVisible());
RDebugUtils.currentLine=131072024;
 //BA.debugLineNum = 131072024;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Text=\"\"";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131072025;
 //BA.debugLineNum = 131072025;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Text=\"\"";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131072026;
 //BA.debugLineNum = 131072026;BA.debugLine="clvIV.cboTipoDatosAux.Value=\"\"";
_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=131072027;
 //BA.debugLineNum = 131072027;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=\"\"";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131072028;
 //BA.debugLineNum = 131072028;BA.debugLine="clvIV.txtComandoConfigDatosAux.Text=\"\"";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131072029;
 //BA.debugLineNum = 131072029;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Text=\"\"";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131072030;
 //BA.debugLineNum = 131072030;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedValue";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,(Object)(1));
RDebugUtils.currentLine=131072032;
 //BA.debugLineNum = 131072032;BA.debugLine="If Value=\"\" Or Value=Null Then";
if (true) break;

case 7:
//if
this.state = 16;
if ((_value).equals((Object)("")) || _value== null) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=131072033;
 //BA.debugLineNum = 131072033;BA.debugLine="Dim chk As CheckBox=clvIV.chkBoxControlEditable";
_chk = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chk = _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ ;
RDebugUtils.currentLine=131072034;
 //BA.debugLineNum = 131072034;BA.debugLine="If chk.Checked Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_chk.getChecked()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=131072035;
 //BA.debugLineNum = 131072035;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"un campo s";
_msa = parent._xui.MsgboxAsync(ba,"un campo sin control para mostrar su valor no puede ser editable. Se modifica el valor Editable a False.","Aviso");
RDebugUtils.currentLine=131072036;
 //BA.debugLineNum = 131072036;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 15;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072037;
 //BA.debugLineNum = 131072037;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131072038;
 //BA.debugLineNum = 131072038;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=131072040;
 //BA.debugLineNum = 131072040;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=131072044;
 //BA.debugLineNum = 131072044;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFecha And";

case 16:
//if
this.state = 19;
if ((_value).equals((Object)(parent._tipocontrol_textfieldbuttonselfecha)) && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=131072045;
 //BA.debugLineNum = 131072045;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_textfieldbuttonselfecha+" sólo es válidos para campos tipo fecha.","");
RDebugUtils.currentLine=131072046;
 //BA.debugLineNum = 131072046;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 19;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072047;
 //BA.debugLineNum = 131072047;BA.debugLine="cboTC.Value=\"\"";
_cbotc.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=131072049;
 //BA.debugLineNum = 131072049;BA.debugLine="If (Value<>TipoControl_TextFieldButtonSelFecha An";

case 19:
//if
this.state = 22;
if (((_value).equals((Object)(parent._tipocontrol_textfieldbuttonselfecha)) == false && (_value).equals((Object)("")) == false) && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=131072050;
 //BA.debugLineNum = 131072050;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
_msa = parent._xui.MsgboxAsync(ba,"Los campos tipo fecha sólo admiten tipo de control  = "+parent._tipocontrol_textfieldbuttonselfecha+".","");
RDebugUtils.currentLine=131072051;
 //BA.debugLineNum = 131072051;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 55;
return;
case 55:
//C
this.state = 22;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072052;
 //BA.debugLineNum = 131072052;BA.debugLine="cboTC.Value=\"\"";
_cbotc.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=131072054;
 //BA.debugLineNum = 131072054;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFecha And";

case 22:
//if
this.state = 25;
if ((_value).equals((Object)(parent._tipocontrol_textfieldbuttonselfecha)) && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=131072055;
 //BA.debugLineNum = 131072055;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_textfieldbuttonselfecha+" sólo es válidos para campos tipo fecha.","");
RDebugUtils.currentLine=131072056;
 //BA.debugLineNum = 131072056;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 56;
return;
case 56:
//C
this.state = 25;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072057;
 //BA.debugLineNum = 131072057;BA.debugLine="cboTC.Value=\"\"";
_cbotc.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=131072059;
 //BA.debugLineNum = 131072059;BA.debugLine="If Value=TipoControl_ComboBox And clvIV.chkBoxCon";

case 25:
//if
this.state = 28;
if ((_value).equals((Object)(parent._tipocontrol_combobox)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=131072060;
 //BA.debugLineNum = 131072060;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_combobox+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072061;
 //BA.debugLineNum = 131072061;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 28;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072062;
 //BA.debugLineNum = 131072062;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072064;
 //BA.debugLineNum = 131072064;BA.debugLine="If Value=TipoControl_lmB4XComboBox And clvIV.chkB";

case 28:
//if
this.state = 31;
if ((_value).equals((Object)(parent._tipocontrol_lmb4xcombobox)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=131072065;
 //BA.debugLineNum = 131072065;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_lmb4xcombobox+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072066;
 //BA.debugLineNum = 131072066;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 31;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072067;
 //BA.debugLineNum = 131072067;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072070;
 //BA.debugLineNum = 131072070;BA.debugLine="If Value=TipoControl_B4XInputDialogTextField And";

case 31:
//if
this.state = 34;
if ((_value).equals((Object)(parent._tipocontrol_b4xinputdialogtextfield)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=131072071;
 //BA.debugLineNum = 131072071;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_b4xinputdialogtextfield+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072072;
 //BA.debugLineNum = 131072072;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 34;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072073;
 //BA.debugLineNum = 131072073;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072076;
 //BA.debugLineNum = 131072076;BA.debugLine="If Value=TipoControl_B4XSearchListDialogTextField";

case 34:
//if
this.state = 37;
if ((_value).equals((Object)(parent._tipocontrol_b4xsearchlistdialogtextfield)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=131072077;
 //BA.debugLineNum = 131072077;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_b4xsearchlistdialogtextfield+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072078;
 //BA.debugLineNum = 131072078;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 37;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072079;
 //BA.debugLineNum = 131072079;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072082;
 //BA.debugLineNum = 131072082;BA.debugLine="If Value=TipoControl_B4XListDialogTextField And c";

case 37:
//if
this.state = 40;
if ((_value).equals((Object)(parent._tipocontrol_b4xlistdialogtextfield)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=131072083;
 //BA.debugLineNum = 131072083;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_b4xlistdialogtextfield+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072084;
 //BA.debugLineNum = 131072084;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 61;
return;
case 61:
//C
this.state = 40;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072085;
 //BA.debugLineNum = 131072085;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072088;
 //BA.debugLineNum = 131072088;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFecha And";

case 40:
//if
this.state = 43;
if ((_value).equals((Object)(parent._tipocontrol_textfieldbuttonselfecha)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=131072089;
 //BA.debugLineNum = 131072089;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_textfieldbuttonselfecha+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072090;
 //BA.debugLineNum = 131072090;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 62;
return;
case 62:
//C
this.state = 43;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072091;
 //BA.debugLineNum = 131072091;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072094;
 //BA.debugLineNum = 131072094;BA.debugLine="If Value=TipoControl_TextFieldButtonSelFile And c";

case 43:
//if
this.state = 46;
if ((_value).equals((Object)(parent._tipocontrol_textfieldbuttonselfile)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=131072095;
 //BA.debugLineNum = 131072095;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_textfieldbuttonselfile+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072096;
 //BA.debugLineNum = 131072096;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 46;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072097;
 //BA.debugLineNum = 131072097;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072100;
 //BA.debugLineNum = 131072100;BA.debugLine="If Value=TipoControl_TextFieldButtonSelExt And cl";

case 46:
//if
this.state = 49;
if ((_value).equals((Object)(parent._tipocontrol_textfieldbuttonselext)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=131072101;
 //BA.debugLineNum = 131072101;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_textfieldbuttonselext+" es siempre editable. Se modifica el valor Editable a true.","");
RDebugUtils.currentLine=131072102;
 //BA.debugLineNum = 131072102;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 49;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072103;
 //BA.debugLineNum = 131072103;BA.debugLine="clvIV.chkBoxControlEditable.Checked=True";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=131072106;
 //BA.debugLineNum = 131072106;BA.debugLine="If Value=TipoControl_TextField And clvIV.chkBoxCo";

case 49:
//if
this.state = 52;
if ((_value).equals((Object)(parent._tipocontrol_textfield)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=131072107;
 //BA.debugLineNum = 131072107;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control = "+parent._tipocontrol_textfield+" no puede ser editable."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Para los casos de campo editable, usar "+parent._tipocontrol_b4xinputdialogtextfield,"Aviso");
RDebugUtils.currentLine=131072108;
 //BA.debugLineNum = 131072108;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipocontrol_valuechanged"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 52;
_result = (int) result[0];
;
RDebugUtils.currentLine=131072109;
 //BA.debugLineNum = 131072109;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 52:
//C
this.state = -1;
;
RDebugUtils.currentLine=131072154;
 //BA.debugLineNum = 131072154;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _cbotipodato_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cbotipodato_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cbotipodato_valuechanged", new Object[] {_value}));}
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotd = null;
int _index = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
RDebugUtils.currentLine=130416640;
 //BA.debugLineNum = 130416640;BA.debugLine="Sub cboTipoDato_ValueChanged (Value As Object)";
RDebugUtils.currentLine=130416641;
 //BA.debugLineNum = 130416641;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=130416642;
 //BA.debugLineNum = 130416642;BA.debugLine="Dim cboTD As ComboBox=Sender";
_cbotd = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotd = (anywheresoftware.b4j.objects.ComboBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ComboBoxWrapper(), (javafx.scene.control.ComboBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=130416643;
 //BA.debugLineNum = 130416643;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = _clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cbotd.getObject())));
RDebugUtils.currentLine=130416644;
 //BA.debugLineNum = 130416644;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(_clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=130416645;
 //BA.debugLineNum = 130416645;BA.debugLine="If cboTD.value<>\"INTEGER\" And cboTD.Value<>\"REAL\"";
if ((_cbotd.getValue()).equals((Object)("INTEGER")) == false && (_cbotd.getValue()).equals((Object)("REAL")) == false && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);};
RDebugUtils.currentLine=130416646;
 //BA.debugLineNum = 130416646;BA.debugLine="End Sub";
return "";
}
public static String  _cbotipodatosaux_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cbotipodatosaux_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cbotipodatosaux_valuechanged", new Object[] {_value}));}
anywheresoftware.b4j.objects.ComboBoxWrapper _cbo = null;
int _index = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
RDebugUtils.currentLine=131334144;
 //BA.debugLineNum = 131334144;BA.debugLine="Sub cboTipoDatosAux_ValueChanged (Value As Object)";
RDebugUtils.currentLine=131334145;
 //BA.debugLineNum = 131334145;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=131334147;
 //BA.debugLineNum = 131334147;BA.debugLine="Dim cbo As ComboBox=Sender";
_cbo = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbo = (anywheresoftware.b4j.objects.ComboBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ComboBoxWrapper(), (javafx.scene.control.ComboBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=131334149;
 //BA.debugLineNum = 131334149;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = _clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cbo.getObject())));
RDebugUtils.currentLine=131334150;
 //BA.debugLineNum = 131334150;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(_clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=131334154;
 //BA.debugLineNum = 131334154;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=False";
_clviv.lblTitleListaValoresDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334155;
 //BA.debugLineNum = 131334155;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=False";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334157;
 //BA.debugLineNum = 131334157;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=False";
_clviv.btnIgualOrigenDatosAux /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334158;
 //BA.debugLineNum = 131334158;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=False";
_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334159;
 //BA.debugLineNum = 131334159;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=False";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334160;
 //BA.debugLineNum = 131334160;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=Fa";
_clviv.lblTitlePuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334161;
 //BA.debugLineNum = 131334161;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=False";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334162;
 //BA.debugLineNum = 131334162;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=False";
_clviv.lblTitleComandoConfigDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334163;
 //BA.debugLineNum = 131334163;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=False";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334164;
 //BA.debugLineNum = 131334164;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=F";
_clviv.lblTitleParametrosComandoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334165;
 //BA.debugLineNum = 131334165;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=False";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334166;
 //BA.debugLineNum = 131334166;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=False";
_clviv.lblTitleNumCamposDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334167;
 //BA.debugLineNum = 131334167;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visible";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131334170;
 //BA.debugLineNum = 131334170;BA.debugLine="clvIV.txtListaValoresDatosAux.Text=\"\"";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131334171;
 //BA.debugLineNum = 131334171;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.text=\"\"";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131334172;
 //BA.debugLineNum = 131334172;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.text=\"\"";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131334173;
 //BA.debugLineNum = 131334173;BA.debugLine="clvIV.txtComandoConfigDatosAux.Text=\"\"";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131334174;
 //BA.debugLineNum = 131334174;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Text=\"\"";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=131334175;
 //BA.debugLineNum = 131334175;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.SelectedValue";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,(Object)(1));
RDebugUtils.currentLine=131334178;
 //BA.debugLineNum = 131334178;BA.debugLine="clvIV.lblTitleListaValoresDatosAux.Visible=Value=";
_clviv.lblTitleListaValoresDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_value).equals((Object)("Lista")));
RDebugUtils.currentLine=131334179;
 //BA.debugLineNum = 131334179;BA.debugLine="clvIV.txtListaValoresDatosAux.Visible=Value=\"List";
_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible((_value).equals((Object)("Lista")));
RDebugUtils.currentLine=131334181;
 //BA.debugLineNum = 131334181;BA.debugLine="clvIV.btnIgualOrigenDatosAux.Visible=Value=\"Consu";
_clviv.btnIgualOrigenDatosAux /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334182;
 //BA.debugLineNum = 131334182;BA.debugLine="clvIV.lblTitleIPJrdcOrigenDatosAux.Visible=Value=";
_clviv.lblTitleIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334183;
 //BA.debugLineNum = 131334183;BA.debugLine="clvIV.txtIPJrdcOrigenDatosAux.Visible=Value=\"Cons";
_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334184;
 //BA.debugLineNum = 131334184;BA.debugLine="clvIV.lblTitlePuertoJrdcOrigenDatosAux.Visible=Va";
_clviv.lblTitlePuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334185;
 //BA.debugLineNum = 131334185;BA.debugLine="clvIV.txtPuertoJrdcOrigenDatosAux.Visible=Value=\"";
_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334186;
 //BA.debugLineNum = 131334186;BA.debugLine="clvIV.lblTitleComandoConfigDatosAux.Visible=Value";
_clviv.lblTitleComandoConfigDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334187;
 //BA.debugLineNum = 131334187;BA.debugLine="clvIV.txtComandoConfigDatosAux.Visible=Value=\"Con";
_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334188;
 //BA.debugLineNum = 131334188;BA.debugLine="clvIV.lblTitleParametrosComandoDatosAux.Visible=V";
_clviv.lblTitleParametrosComandoDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334189;
 //BA.debugLineNum = 131334189;BA.debugLine="clvIV.txtParametrosComandoDatosAux.Visible=Value=";
_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334190;
 //BA.debugLineNum = 131334190;BA.debugLine="clvIV.lblTitleNumCamposDatosAux.Visible=Value=\"Co";
_clviv.lblTitleNumCamposDatosAux /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334191;
 //BA.debugLineNum = 131334191;BA.debugLine="clvIV.B4XPlusMinusNumCamposDatosAux.mBase.Visible";
_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible((_value).equals((Object)("Consulta")));
RDebugUtils.currentLine=131334194;
 //BA.debugLineNum = 131334194;BA.debugLine="End Sub";
return "";
}
public static void  _cbotipoorigendatos_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "cbotipoorigendatos_valuechanged", true))
	 {Debug.delegate(ba, "cbotipoorigendatos_valuechanged", new Object[] {_value}); return;}
ResumableSub_cboTipoOrigenDatos_ValueChanged rsub = new ResumableSub_cboTipoOrigenDatos_ValueChanged(null,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_cboTipoOrigenDatos_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoOrigenDatos_ValueChanged(b4j.docU.jamrecordformbuilder parent,Object _value) {
this.parent = parent;
this._value = _value;
}
b4j.docU.jamrecordformbuilder parent;
Object _value;
anywheresoftware.b4a.objects.collections.Map _data = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130678785;
 //BA.debugLineNum = 130678785;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=130678786;
 //BA.debugLineNum = 130678786;BA.debugLine="If Value=\"JRDC Query\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_value).equals((Object)("JRDC Query"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=130678787;
 //BA.debugLineNum = 130678787;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",";
parent._prefdialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=130678789;
 //BA.debugLineNum = 130678789;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.Dir";
parent._prefdialog._loadfromjson /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"OrigenDatosJrdcRecordFormBuilder.json"));
RDebugUtils.currentLine=130678790;
 //BA.debugLineNum = 130678790;BA.debugLine="Dim data As Map=CreateMap(\"DBMS\":\"MySQL\")";
_data = new anywheresoftware.b4a.objects.collections.Map();
_data = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("DBMS"),(Object)("MySQL")});
RDebugUtils.currentLine=130678791;
 //BA.debugLineNum = 130678791;BA.debugLine="Wait For (prefDialog.ShowDialog(data, \"OK\", \"CAN";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "cbotipoorigendatos_valuechanged"), parent._prefdialog._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_data,(Object)("OK"),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 10;
_result = (int) result[0];
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=130678796;
 //BA.debugLineNum = 130678796;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkchanges() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "checkchanges", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkchanges", null));}
ResumableSub_CheckChanges rsub = new ResumableSub_CheckChanges(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckChanges extends BA.ResumableSub {
public ResumableSub_CheckChanges(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
String _s = "";
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130023425;
 //BA.debugLineNum = 130023425;BA.debugLine="If CurrentFile = \"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((parent._currentfile).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=130023427;
 //BA.debugLineNum = 130023427;BA.debugLine="Dim s As String = ExportDataToString";
_s = _exportdatatostring();
RDebugUtils.currentLine=130023428;
 //BA.debugLineNum = 130023428;BA.debugLine="If s <> CurrentFileString And s <> NewFileString";
if (true) break;

case 7:
//if
this.state = 18;
if ((_s).equals(parent._currentfilestring) == false && (_s).equals(parent._newfilestring) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=130023429;
 //BA.debugLineNum = 130023429;BA.debugLine="Wait For (Dialog.Show(\"¿Grabar cambios?\", \"Sí\",";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "checkchanges"), parent._dialog._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)("¿Grabar cambios?"),(Object)("Sí"),(Object)("No"),(Object)("Cancelar")));
this.state = 19;
return;
case 19:
//C
this.state = 10;
_result = (int) result[0];
;
RDebugUtils.currentLine=130023430;
 //BA.debugLineNum = 130023430;BA.debugLine="Select Result";
if (true) break;

case 10:
//select
this.state = 17;
switch (BA.switchObjectToInt(_result,parent._xui.DialogResponse_Cancel,parent._xui.DialogResponse_Negative,parent._xui.DialogResponse_Positive)) {
case 0: {
this.state = 12;
if (true) break;
}
case 1: {
this.state = 14;
if (true) break;
}
case 2: {
this.state = 16;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 17;
RDebugUtils.currentLine=130023432;
 //BA.debugLineNum = 130023432;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=130023434;
 //BA.debugLineNum = 130023434;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=130023436;
 //BA.debugLineNum = 130023436;BA.debugLine="mnuSave_Action";
_mnusave_action();
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=130023439;
 //BA.debugLineNum = 130023439;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
RDebugUtils.currentLine=130023440;
 //BA.debugLineNum = 130023440;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _exportdatatostring() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "exportdatatostring", true))
	 {return ((String) Debug.delegate(ba, "exportdatatostring", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbprimarykey = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=129171456;
 //BA.debugLineNum = 129171456;BA.debugLine="Sub ExportDataToString As String";
RDebugUtils.currentLine=129171457;
 //BA.debugLineNum = 129171457;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=129171458;
 //BA.debugLineNum = 129171458;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=129171459;
 //BA.debugLineNum = 129171459;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=129171460;
 //BA.debugLineNum = 129171460;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(_clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=129171462;
 //BA.debugLineNum = 129171462;BA.debugLine="Items.Add(ItemValueToMap(clvIV))";
_items.Add((Object)(_itemvaluetomap(_clviv).getObject()));
 }
};
RDebugUtils.currentLine=129171465;
 //BA.debugLineNum = 129171465;BA.debugLine="Dim sbPrimaryKey As StringBuilder";
_sbprimarykey = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=129171466;
 //BA.debugLineNum = 129171466;BA.debugLine="sbPrimaryKey.Initialize";
_sbprimarykey.Initialize();
RDebugUtils.currentLine=129171467;
 //BA.debugLineNum = 129171467;BA.debugLine="If lstPrimaryKey.Size>0 Then";
if (_lstprimarykey.getSize()>0) { 
RDebugUtils.currentLine=129171469;
 //BA.debugLineNum = 129171469;BA.debugLine="For i=0 To lstPrimaryKey.Size-1";
{
final int step10 = 1;
final int limit10 = (int) (_lstprimarykey.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=129171470;
 //BA.debugLineNum = 129171470;BA.debugLine="sbPrimaryKey.Append(lstPrimaryKey.Get(i)).Appen";
_sbprimarykey.Append(BA.ObjectToString(_lstprimarykey.Get(_i))).Append(",");
 }
};
RDebugUtils.currentLine=129171472;
 //BA.debugLineNum = 129171472;BA.debugLine="sbPrimaryKey.Remove(sbPrimaryKey.Length-1,sbPrim";
_sbprimarykey.Remove((int) (_sbprimarykey.getLength()-1),_sbprimarykey.getLength());
 };
RDebugUtils.currentLine=129171475;
 //BA.debugLineNum = 129171475;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=129171477;
 //BA.debugLineNum = 129171477;BA.debugLine="jg.Initialize(CreateMap(\"Version\": Version,  \"IpJ";
_jg.Initialize(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Version"),(Object)(_version),(Object)("IpJRDC"),(Object)(_datosorigendatos.IpJRDC /*String*/ ),(Object)("PuertoJRDC"),(Object)(_datosorigendatos.PuertoJRDC /*String*/ ),(Object)("NombreTabla"),(Object)(_datosorigendatos.NombreTabla /*String*/ ),(Object)("DBMS"),(Object)(_datosorigendatos.DBMS /*String*/ ),(Object)("PrimaryKey"),(Object)(_sbprimarykey.ToString()),(Object)("Items"),(Object)(_items.getObject()),(Object)("ColorItemsImpares"),(Object)(_colitemsimpares),(Object)("ColorItemsPares"),(Object)(_colitemspares)}));
RDebugUtils.currentLine=129171480;
 //BA.debugLineNum = 129171480;BA.debugLine="Return jg.ToPrettyString(4)";
if (true) return _jg.ToPrettyString((int) (4));
RDebugUtils.currentLine=129171481;
 //BA.debugLineNum = 129171481;BA.debugLine="End Sub";
return "";
}
public static void  _mnusave_action() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "mnusave_action", true))
	 {Debug.delegate(ba, "mnusave_action", null); return;}
ResumableSub_mnuSave_Action rsub = new ResumableSub_mnuSave_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSave_Action extends BA.ResumableSub {
public ResumableSub_mnuSave_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
boolean _camposok = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130088961;
 //BA.debugLineNum = 130088961;BA.debugLine="If CurrentFile = \"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((parent._currentfile).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=130088962;
 //BA.debugLineNum = 130088962;BA.debugLine="mnuSaveAs_Action";
_mnusaveas_action();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=130088964;
 //BA.debugLineNum = 130088964;BA.debugLine="Wait For (ComprobarAvisosRegistro) Complete (Cam";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "mnusave_action"), _comprobaravisosregistro());
this.state = 11;
return;
case 11:
//C
this.state = 6;
_camposok = (boolean) result[0];
;
RDebugUtils.currentLine=130088965;
 //BA.debugLineNum = 130088965;BA.debugLine="If CamposOK Then";
if (true) break;

case 6:
//if
this.state = 9;
if (_camposok) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=130088966;
 //BA.debugLineNum = 130088966;BA.debugLine="CurrentFileString = ExportDataToString";
parent._currentfilestring = _exportdatatostring();
RDebugUtils.currentLine=130088967;
 //BA.debugLineNum = 130088967;BA.debugLine="File.WriteString(CurrentFile, \"\", CurrentFileSt";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._currentfile,"",parent._currentfilestring);
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=130088970;
 //BA.debugLineNum = 130088970;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _chkboxcontroleditable_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "chkboxcontroleditable_checkedchange", true))
	 {Debug.delegate(ba, "chkboxcontroleditable_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkBoxControlEditable_CheckedChange rsub = new ResumableSub_chkBoxControlEditable_CheckedChange(null,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkBoxControlEditable_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxControlEditable_CheckedChange(b4j.docU.jamrecordformbuilder parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4j.docU.jamrecordformbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkce = null;
int _index = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131203073;
 //BA.debugLineNum = 131203073;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=131203075;
 //BA.debugLineNum = 131203075;BA.debugLine="If CorrigiendoChkBoxControlEditable Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxcontroleditable) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=131203076;
 //BA.debugLineNum = 131203076;BA.debugLine="CorrigiendoChkBoxControlEditable=False";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=131203077;
 //BA.debugLineNum = 131203077;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=131203080;
 //BA.debugLineNum = 131203080;BA.debugLine="Dim chkCE As CheckBox=Sender";
_chkce = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkce = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=131203081;
 //BA.debugLineNum = 131203081;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkce.getObject())));
RDebugUtils.currentLine=131203082;
 //BA.debugLineNum = 131203082;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=131203083;
 //BA.debugLineNum = 131203083;BA.debugLine="If Checked And clvIV.chkBoxAutoIncremental.Checke";
if (true) break;

case 11:
//if
this.state = 14;
if (_checked && _clviv.chkBoxAutoIncremental /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=131203084;
 //BA.debugLineNum = 131203084;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de dato Autoincremental no puede ser ser editable.","");
RDebugUtils.currentLine=131203085;
 //BA.debugLineNum = 131203085;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203086;
 //BA.debugLineNum = 131203086;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203087;
 //BA.debugLineNum = 131203087;BA.debugLine="chkCE.Checked=False";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131203088;
 //BA.debugLineNum = 131203088;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203090;
 //BA.debugLineNum = 131203090;BA.debugLine="If Checked And clvIV.cboTipoControl.value=\"\" Then";

case 14:
//if
this.state = 17;
if (_checked && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(""))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=131203091;
 //BA.debugLineNum = 131203091;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control vacío no puede ser ser editable.","");
RDebugUtils.currentLine=131203092;
 //BA.debugLineNum = 131203092;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 17;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203093;
 //BA.debugLineNum = 131203093;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203094;
 //BA.debugLineNum = 131203094;BA.debugLine="chkCE.Checked=False";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131203095;
 //BA.debugLineNum = 131203095;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203097;
 //BA.debugLineNum = 131203097;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";

case 17:
//if
this.state = 20;
if (_checked==anywheresoftware.b4a.keywords.Common.False && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_combobox))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=131203098;
 //BA.debugLineNum = 131203098;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control ComboBox es siempre editable.","");
RDebugUtils.currentLine=131203099;
 //BA.debugLineNum = 131203099;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 20;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203100;
 //BA.debugLineNum = 131203100;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203101;
 //BA.debugLineNum = 131203101;BA.debugLine="chkCE.Checked=True";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131203102;
 //BA.debugLineNum = 131203102;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203104;
 //BA.debugLineNum = 131203104;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";

case 20:
//if
this.state = 23;
if (_checked==anywheresoftware.b4a.keywords.Common.False && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_lmb4xcombobox))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=131203105;
 //BA.debugLineNum = 131203105;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control lmB4XComboBox es siempre editable.","");
RDebugUtils.currentLine=131203106;
 //BA.debugLineNum = 131203106;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 23;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203107;
 //BA.debugLineNum = 131203107;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203108;
 //BA.debugLineNum = 131203108;BA.debugLine="chkCE.Checked=True";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131203109;
 //BA.debugLineNum = 131203109;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203112;
 //BA.debugLineNum = 131203112;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";

case 23:
//if
this.state = 26;
if (_checked==anywheresoftware.b4a.keywords.Common.False && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_b4xinputdialogtextfield))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=131203113;
 //BA.debugLineNum = 131203113;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control B4XInputDialogTextField es siempre editable."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"En caso de campo no editable, seleccionar "+parent._tipocontrol_textfield+".","");
RDebugUtils.currentLine=131203114;
 //BA.debugLineNum = 131203114;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 26;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203115;
 //BA.debugLineNum = 131203115;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203116;
 //BA.debugLineNum = 131203116;BA.debugLine="chkCE.Checked=True";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131203117;
 //BA.debugLineNum = 131203117;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203120;
 //BA.debugLineNum = 131203120;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";

case 26:
//if
this.state = 29;
if (_checked==anywheresoftware.b4a.keywords.Common.False && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_b4xlistdialogtextfield))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=131203121;
 //BA.debugLineNum = 131203121;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control "+parent._tipocontrol_b4xlistdialogtextfield+" es siempre editable."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"En caso de campo no editable, seleccionar "+parent._tipocontrol_textfield+".","");
RDebugUtils.currentLine=131203122;
 //BA.debugLineNum = 131203122;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 44;
return;
case 44:
//C
this.state = 29;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203123;
 //BA.debugLineNum = 131203123;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203124;
 //BA.debugLineNum = 131203124;BA.debugLine="chkCE.Checked=True";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131203125;
 //BA.debugLineNum = 131203125;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203128;
 //BA.debugLineNum = 131203128;BA.debugLine="If Checked=False And clvIV.cboTipoControl.value=T";

case 29:
//if
this.state = 32;
if (_checked==anywheresoftware.b4a.keywords.Common.False && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_b4xsearchlistdialogtextfield))) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=131203129;
 //BA.debugLineNum = 131203129;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control "+parent._tipocontrol_b4xsearchlistdialogtextfield+" es siempre editable."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"En caso de campo no editable, seleccionar "+parent._tipocontrol_textfield+".","");
RDebugUtils.currentLine=131203130;
 //BA.debugLineNum = 131203130;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 32;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203131;
 //BA.debugLineNum = 131203131;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203132;
 //BA.debugLineNum = 131203132;BA.debugLine="chkCE.Checked=True";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131203133;
 //BA.debugLineNum = 131203133;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203136;
 //BA.debugLineNum = 131203136;BA.debugLine="If Checked=True And clvIV.cboTipoControl.value=Ti";

case 32:
//if
this.state = 35;
if (_checked==anywheresoftware.b4a.keywords.Common.True && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_textfield))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=131203137;
 //BA.debugLineNum = 131203137;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control "+parent._tipocontrol_textfield+" es siempre no editable.","");
RDebugUtils.currentLine=131203138;
 //BA.debugLineNum = 131203138;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 46;
return;
case 46:
//C
this.state = 35;
_result = (int) result[0];
;
RDebugUtils.currentLine=131203139;
 //BA.debugLineNum = 131203139;BA.debugLine="CorrigiendoChkBoxControlEditable=True";
parent._corrigiendochkboxcontroleditable = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131203140;
 //BA.debugLineNum = 131203140;BA.debugLine="chkCE.Checked=False";
_chkce.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131203141;
 //BA.debugLineNum = 131203141;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=131203144;
 //BA.debugLineNum = 131203144;BA.debugLine="If Checked=True And clvIV.cboTipoControl.value=Ti";

case 35:
//if
this.state = 38;
if (_checked==anywheresoftware.b4a.keywords.Common.True && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_textfield))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=131203145;
 //BA.debugLineNum = 131203145;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de control "+parent._tipocontrol_textfield+" puede ser editable, pero no tendrá eventos BeforeUpdate ni AfterUpdate."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Para los casos de campo editable en los que sean necesarios los eventos, usar "+parent._tipocontrol_b4xinputdialogtextfield,"Aviso");
RDebugUtils.currentLine=131203146;
 //BA.debugLineNum = 131203146;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxcontroleditable_checkedchange"), _msa);
this.state = 47;
return;
case 47:
//C
this.state = 38;
_result = (int) result[0];
;
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=131203148;
 //BA.debugLineNum = 131203148;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _chkboxesfecha_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "chkboxesfecha_checkedchange", true))
	 {Debug.delegate(ba, "chkboxesfecha_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkBoxEsFecha_CheckedChange rsub = new ResumableSub_chkBoxEsFecha_CheckedChange(null,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkBoxEsFecha_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsFecha_CheckedChange(b4j.docU.jamrecordformbuilder parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4j.docU.jamrecordformbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkesf = null;
int _index = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130285569;
 //BA.debugLineNum = 130285569;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._cargandodatos) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=130285571;
 //BA.debugLineNum = 130285571;BA.debugLine="If CorrigiendoChkBoxEsFecha Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxesfecha) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=130285572;
 //BA.debugLineNum = 130285572;BA.debugLine="CorrigiendoChkBoxEsFecha=False";
parent._corrigiendochkboxesfecha = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=130285573;
 //BA.debugLineNum = 130285573;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=130285576;
 //BA.debugLineNum = 130285576;BA.debugLine="Dim chkEsF As CheckBox=Sender";
_chkesf = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkesf = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=130285577;
 //BA.debugLineNum = 130285577;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkesf.getObject())));
RDebugUtils.currentLine=130285578;
 //BA.debugLineNum = 130285578;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCampo";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=130285579;
 //BA.debugLineNum = 130285579;BA.debugLine="If Checked And clvIV.cboTipoDato.Value<>\"INTEGER\"";
if (true) break;

case 11:
//if
this.state = 14;
if (_checked && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("REAL")) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=130285580;
 //BA.debugLineNum = 130285580;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de dato="+BA.ObjectToString(_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+" no puede ser una fecha.","");
RDebugUtils.currentLine=130285581;
 //BA.debugLineNum = 130285581;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=130285582;
 //BA.debugLineNum = 130285582;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
parent._corrigiendochkboxesfecha = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=130285583;
 //BA.debugLineNum = 130285583;BA.debugLine="chkEsF.Checked=False";
_chkesf.setChecked(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=130285586;
 //BA.debugLineNum = 130285586;BA.debugLine="If Checked=False And clvIV.cboTipoControl.Value=T";

case 14:
//if
this.state = 17;
if (_checked==anywheresoftware.b4a.keywords.Common.False && (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_textfieldbuttonselfecha))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=130285587;
 //BA.debugLineNum = 130285587;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
_msa = parent._xui.MsgboxAsync(ba,"Si el tipo de control edicion es = "+parent._tipocontrol_textfieldbuttonselfecha+" , el campo tiene que ser tipo fecha. Si no lo es, deja primero el tipo control filtro en blanco.","");
RDebugUtils.currentLine=130285588;
 //BA.debugLineNum = 130285588;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 17;
_result = (int) result[0];
;
RDebugUtils.currentLine=130285589;
 //BA.debugLineNum = 130285589;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
parent._corrigiendochkboxesfecha = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=130285590;
 //BA.debugLineNum = 130285590;BA.debugLine="chkEsF.Checked=True";
_chkesf.setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=130285592;
 //BA.debugLineNum = 130285592;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _colortohex(int _clr) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=129564672;
 //BA.debugLineNum = 129564672;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=129564673;
 //BA.debugLineNum = 129564673;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=129564674;
 //BA.debugLineNum = 129564674;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=129564675;
 //BA.debugLineNum = 129564675;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _comprobaravisosregistro() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "comprobaravisosregistro", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "comprobaravisosregistro", null));}
ResumableSub_ComprobarAvisosRegistro rsub = new ResumableSub_ComprobarAvisosRegistro(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ComprobarAvisosRegistro extends BA.ResumableSub {
public ResumableSub_ComprobarAvisosRegistro(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
anywheresoftware.b4a.objects.collections.List _lstcampos = null;
anywheresoftware.b4a.objects.collections.List _lstencabezados = null;
anywheresoftware.b4a.objects.collections.List _lstprimarykeys = null;
int _numerocontrolesformulario = 0;
int _numerocontroleseditablesformulario = 0;
int _i = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
String _nombrecampocontrolindependiente = "";
Object _msa = null;
int _result = 0;
String _nombrecampo = "";
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130154497;
 //BA.debugLineNum = 130154497;BA.debugLine="Dim lstCampos As List";
_lstcampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=130154498;
 //BA.debugLineNum = 130154498;BA.debugLine="lstCampos.Initialize";
_lstcampos.Initialize();
RDebugUtils.currentLine=130154499;
 //BA.debugLineNum = 130154499;BA.debugLine="Dim lstEncabezados As List";
_lstencabezados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=130154500;
 //BA.debugLineNum = 130154500;BA.debugLine="lstEncabezados.Initialize";
_lstencabezados.Initialize();
RDebugUtils.currentLine=130154502;
 //BA.debugLineNum = 130154502;BA.debugLine="Dim lstPrimaryKeys As List";
_lstprimarykeys = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=130154503;
 //BA.debugLineNum = 130154503;BA.debugLine="lstPrimaryKeys.Initialize";
_lstprimarykeys.Initialize();
RDebugUtils.currentLine=130154508;
 //BA.debugLineNum = 130154508;BA.debugLine="Dim NumeroControlesFormulario As Int";
_numerocontrolesformulario = 0;
RDebugUtils.currentLine=130154509;
 //BA.debugLineNum = 130154509;BA.debugLine="Dim NumeroControlesEditablesFormulario As Int";
_numerocontroleseditablesformulario = 0;
RDebugUtils.currentLine=130154511;
 //BA.debugLineNum = 130154511;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
if (true) break;

case 1:
//for
this.state = 77;
step9 = 1;
limit9 = (int) (parent._clvlistacampos._getsize()-1);
_i = (int) (0) ;
this.state = 117;
if (true) break;

case 117:
//C
this.state = 77;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 3;
if (true) break;

case 118:
//C
this.state = 117;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=130154513;
 //BA.debugLineNum = 130154513;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(parent._clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=130154515;
 //BA.debugLineNum = 130154515;BA.debugLine="If clvIV.chkBoxControlIndependiente.Checked Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=130154516;
 //BA.debugLineNum = 130154516;BA.debugLine="Dim NombreCampoControlIndependiente As String=c";
_nombrecampocontrolindependiente = _clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=130154517;
 //BA.debugLineNum = 130154517;BA.debugLine="If lstNombresCamposSQL.IndexOf(NombreCampoContr";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._lstnombrescampossql.IndexOf((Object)(_nombrecampocontrolindependiente))>-1) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=130154518;
 //BA.debugLineNum = 130154518;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
_msa = parent._xui.MsgboxAsync(ba,"El nombre de campo del control independiente "+_nombrecampocontrolindependiente+" coincide con el campo de la tabla.","Error!");
RDebugUtils.currentLine=130154519;
 //BA.debugLineNum = 130154519;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 119;
return;
case 119:
//C
this.state = 10;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154520;
 //BA.debugLineNum = 130154520;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=130154526;
 //BA.debugLineNum = 130154526;BA.debugLine="Dim NombreCampo As String=clvIV.txtCampo.Text";
_nombrecampo = _clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=130154527;
 //BA.debugLineNum = 130154527;BA.debugLine="If lstCampos.IndexOf(NombreCampo)>-1 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_lstcampos.IndexOf((Object)(_nombrecampo))>-1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=130154528;
 //BA.debugLineNum = 130154528;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
_msa = parent._xui.MsgboxAsync(ba,"El nombre de campo "+_nombrecampo+" está repetido.","Error!");
RDebugUtils.currentLine=130154529;
 //BA.debugLineNum = 130154529;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 120;
return;
case 120:
//C
this.state = 15;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154530;
 //BA.debugLineNum = 130154530;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154533;
 //BA.debugLineNum = 130154533;BA.debugLine="If clvIV.txtTituloCampo.Text<>\"\" Then";

case 15:
//if
this.state = 24;
if ((_clviv.txtTituloCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=130154534;
 //BA.debugLineNum = 130154534;BA.debugLine="If lstEncabezados.IndexOf(clvIV.txtTituloCampo.";
if (true) break;

case 18:
//if
this.state = 23;
if (_lstencabezados.IndexOf((Object)(_clviv.txtTituloCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>-1) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=130154535;
 //BA.debugLineNum = 130154535;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El título";
_msa = parent._xui.MsgboxAsync(ba,"El título de campo "+_clviv.txtTituloCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+" está repetido.","Error!");
RDebugUtils.currentLine=130154536;
 //BA.debugLineNum = 130154536;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 121;
return;
case 121:
//C
this.state = 23;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154537;
 //BA.debugLineNum = 130154537;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=130154539;
 //BA.debugLineNum = 130154539;BA.debugLine="lstEncabezados.Add(clvIV.txtTituloCampo.Text)";
_lstencabezados.Add((Object)(_clviv.txtTituloCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;
;
RDebugUtils.currentLine=130154543;
 //BA.debugLineNum = 130154543;BA.debugLine="If clvIV.cboTipoDato.value=\"\" Then";

case 24:
//if
this.state = 31;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(""))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=130154544;
 //BA.debugLineNum = 130154544;BA.debugLine="If Not(clvIV.chkBoxControlIndependiente.Checked";
if (true) break;

case 27:
//if
this.state = 30;
if (anywheresoftware.b4a.keywords.Common.Not(_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked())) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=130154545;
 //BA.debugLineNum = 130154545;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo d";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de dato para el campo "+_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+" (fila nº "+BA.NumberToString(_i)+") está en blanco. Es un dato obligatorio.","Error!");
RDebugUtils.currentLine=130154546;
 //BA.debugLineNum = 130154546;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 122;
return;
case 122:
//C
this.state = 30;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154547;
 //BA.debugLineNum = 130154547;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
RDebugUtils.currentLine=130154551;
 //BA.debugLineNum = 130154551;BA.debugLine="If clvIV.chkboxKeyID.Checked Then";

case 31:
//if
this.state = 34;
if (_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=130154553;
 //BA.debugLineNum = 130154553;BA.debugLine="lstPrimaryKeys.Add(clvIV.txtCampo.text)";
_lstprimarykeys.Add((Object)(_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 if (true) break;
;
RDebugUtils.currentLine=130154556;
 //BA.debugLineNum = 130154556;BA.debugLine="If clvIV.cboTipoControl.Value<>\"\" Then NumeroCon";

case 34:
//if
this.state = 39;
if ((_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("")) == false) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_numerocontrolesformulario = (int) (_numerocontrolesformulario+1);
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=130154558;
 //BA.debugLineNum = 130154558;BA.debugLine="If clvIV.chkBoxControlEditable.Checked Then Nume";
if (true) break;

case 40:
//if
this.state = 45;
if (_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
_numerocontroleseditablesformulario = (int) (_numerocontroleseditablesformulario+1);
if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=130154560;
 //BA.debugLineNum = 130154560;BA.debugLine="If (clvIV.cboTipoControl.Value=TipoControl_B4XLi";
if (true) break;

case 46:
//if
this.state = 49;
if (((_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_b4xlistdialogtextfield)) || (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_combobox)) || (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_lmb4xcombobox)) || (_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_b4xsearchlistdialogtextfield))) && (_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(""))) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=130154561;
 //BA.debugLineNum = 130154561;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Hay algún";
_msa = parent._xui.MsgboxAsync(ba,"Hay algún control tipo Lista/Consulta con el campo TipoDatosAux en blanco.","Error!");
RDebugUtils.currentLine=130154562;
 //BA.debugLineNum = 130154562;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 123;
return;
case 123:
//C
this.state = 49;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154563;
 //BA.debugLineNum = 130154563;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154568;
 //BA.debugLineNum = 130154568;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_ComboB";

case 49:
//if
this.state = 52;
if ((_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_combobox)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=130154569;
 //BA.debugLineNum = 130154569;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
_msa = parent._xui.MsgboxAsync(ba,"Un control tipo ComboBox debe ser editable (en caso contrario debería ser un TextField).","Error!");
RDebugUtils.currentLine=130154570;
 //BA.debugLineNum = 130154570;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 124;
return;
case 124:
//C
this.state = 52;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154571;
 //BA.debugLineNum = 130154571;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154574;
 //BA.debugLineNum = 130154574;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_lmB4XC";

case 52:
//if
this.state = 55;
if ((_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_lmb4xcombobox)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 54;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=130154575;
 //BA.debugLineNum = 130154575;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
_msa = parent._xui.MsgboxAsync(ba,"Un control tipo lmB4XComboBox debe ser editable (en caso contrario debería ser un TextField).","Error!");
RDebugUtils.currentLine=130154576;
 //BA.debugLineNum = 130154576;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 125;
return;
case 125:
//C
this.state = 55;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154577;
 //BA.debugLineNum = 130154577;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154581;
 //BA.debugLineNum = 130154581;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_TextFi";

case 55:
//if
this.state = 58;
if ((_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_textfield)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=130154582;
 //BA.debugLineNum = 130154582;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
_msa = parent._xui.MsgboxAsync(ba,"Un control tipo "+parent._tipocontrol_textfield+" debe ser no editable (en caso contrario debería ser un "+parent._tipocontrol_b4xinputdialogtextfield+").","Error!");
RDebugUtils.currentLine=130154583;
 //BA.debugLineNum = 130154583;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 126;
return;
case 126:
//C
this.state = 58;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154584;
 //BA.debugLineNum = 130154584;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154587;
 //BA.debugLineNum = 130154587;BA.debugLine="If clvIV.cboTipoControl.Value=TipoControl_B4XInp";

case 58:
//if
this.state = 61;
if ((_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrol_b4xinputdialogtextfield)) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 60;
}if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=130154588;
 //BA.debugLineNum = 130154588;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un control";
_msa = parent._xui.MsgboxAsync(ba,"Un control tipo B4XInputDialogTextField debe ser editable (en caso contrario debería ser un TextField).","Error!");
RDebugUtils.currentLine=130154589;
 //BA.debugLineNum = 130154589;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 127;
return;
case 127:
//C
this.state = 61;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154590;
 //BA.debugLineNum = 130154590;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154599;
 //BA.debugLineNum = 130154599;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Lista\" And clvIV";

case 61:
//if
this.state = 64;
if ((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Lista")) && (_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=130154600;
 //BA.debugLineNum = 130154600;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
_msa = parent._xui.MsgboxAsync(ba,"Si el tipo de datos auxiliares es Lista,  debe haber una lista de valores asignada.","Error!");
RDebugUtils.currentLine=130154601;
 //BA.debugLineNum = 130154601;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 128;
return;
case 128:
//C
this.state = 64;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154602;
 //BA.debugLineNum = 130154602;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154605;
 //BA.debugLineNum = 130154605;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" And cl";

case 64:
//if
this.state = 67;
if ((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Consulta")) && (_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=130154606;
 //BA.debugLineNum = 130154606;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
_msa = parent._xui.MsgboxAsync(ba,"Si el tipo de datos auxiliares es Consulta,  la IP del JRDC da datos auxiliares debe estar asignado.","Error!");
RDebugUtils.currentLine=130154607;
 //BA.debugLineNum = 130154607;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 129;
return;
case 129:
//C
this.state = 67;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154608;
 //BA.debugLineNum = 130154608;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154611;
 //BA.debugLineNum = 130154611;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" And cl";

case 67:
//if
this.state = 70;
if ((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Consulta")) && (_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=130154612;
 //BA.debugLineNum = 130154612;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
_msa = parent._xui.MsgboxAsync(ba,"Si el tipo de datos auxiliares es Consulta,  el puerto del JRDC da datos auxiliares debe estar asignado.","Error!");
RDebugUtils.currentLine=130154613;
 //BA.debugLineNum = 130154613;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 130;
return;
case 130:
//C
this.state = 70;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154614;
 //BA.debugLineNum = 130154614;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154617;
 //BA.debugLineNum = 130154617;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Consulta\" And cl";

case 70:
//if
this.state = 73;
if ((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Consulta")) && (_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=130154618;
 //BA.debugLineNum = 130154618;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
_msa = parent._xui.MsgboxAsync(ba,"Si el tipo de datos auxiliares es Consulta,  debe haber un comando de config properties asignado.","Error!");
RDebugUtils.currentLine=130154619;
 //BA.debugLineNum = 130154619;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 131;
return;
case 131:
//C
this.state = 73;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154620;
 //BA.debugLineNum = 130154620;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154647;
 //BA.debugLineNum = 130154647;BA.debugLine="If (clvIV.cboTipoControl.Value=\"\" Or clvIV.cboTi";

case 73:
//if
this.state = 76;
if (((_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("")) || _clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()== null) && _clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=130154648;
 //BA.debugLineNum = 130154648;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"un campo s";
_msa = parent._xui.MsgboxAsync(ba,"un campo sin control para mostrar su valor (Tipo Control en blanco) no puede ser editable. Se modifica el valor Editable a False.","Aviso");
RDebugUtils.currentLine=130154649;
 //BA.debugLineNum = 130154649;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 132;
return;
case 132:
//C
this.state = 76;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154650;
 //BA.debugLineNum = 130154650;BA.debugLine="clvIV.chkBoxControlEditable.Checked=False";
_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=130154651;
 //BA.debugLineNum = 130154651;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 76:
//C
this.state = 118;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=130154656;
 //BA.debugLineNum = 130154656;BA.debugLine="If lstEncabezados.Size=0 Then";

case 77:
//if
this.state = 80;
if (_lstencabezados.getSize()==0) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=130154657;
 //BA.debugLineNum = 130154657;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Debe haber";
_msa = parent._xui.MsgboxAsync(ba,"Debe haber al menos una columna para mostrar en la tabla (se crearán las columnas cuyos encabezados sean <>\".","Error!");
RDebugUtils.currentLine=130154658;
 //BA.debugLineNum = 130154658;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 133;
return;
case 133:
//C
this.state = 80;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154659;
 //BA.debugLineNum = 130154659;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=130154673;
 //BA.debugLineNum = 130154673;BA.debugLine="If lstPrimaryKeys.Size=0 Then";

case 80:
//if
this.state = 89;
if (_lstprimarykeys.getSize()==0) { 
this.state = 82;
}if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=130154677;
 //BA.debugLineNum = 130154677;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
_msa = parent._xui.Msgbox2Async(ba,"No hay ningún campo definido como clave primaria"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"La acción de grabar registros no estará disponible en el formulario."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¿Continuar?","No hay clave primaria definida","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=130154678;
 //BA.debugLineNum = 130154678;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 134;
return;
case 134:
//C
this.state = 83;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154679;
 //BA.debugLineNum = 130154679;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
if (true) break;

case 83:
//if
this.state = 88;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 85;
;}if (true) break;

case 85:
//C
this.state = 88;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 88:
//C
this.state = 89;
;
 if (true) break;
;
RDebugUtils.currentLine=130154683;
 //BA.debugLineNum = 130154683;BA.debugLine="If NumeroControlesFormulario=0 Then";

case 89:
//if
this.state = 98;
if (_numerocontrolesformulario==0) { 
this.state = 91;
}if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=130154684;
 //BA.debugLineNum = 130154684;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
_msa = parent._xui.Msgbox2Async(ba,"No hay ningún campo definido con control en el formulario. El formulario estaría vacío."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¿Continuar?","Formulario sin controles","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=130154685;
 //BA.debugLineNum = 130154685;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 135;
return;
case 135:
//C
this.state = 92;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154686;
 //BA.debugLineNum = 130154686;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
if (true) break;

case 92:
//if
this.state = 97;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 94;
;}if (true) break;

case 94:
//C
this.state = 97;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;
;
RDebugUtils.currentLine=130154689;
 //BA.debugLineNum = 130154689;BA.debugLine="If NumeroControlesFormulario<clvListaCampos.Size";

case 98:
//if
this.state = 107;
if (_numerocontrolesformulario<parent._clvlistacampos._getsize()) { 
this.state = 100;
}if (true) break;

case 100:
//C
this.state = 101;
RDebugUtils.currentLine=130154690;
 //BA.debugLineNum = 130154690;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Hay \" & (c";
_msa = parent._xui.Msgbox2Async(ba,"Hay "+BA.NumberToString((parent._clvlistacampos._getsize()-_numerocontrolesformulario))+" campos sin Tipo de control asignado."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Estos campos no aparecerán en el formulario del registro, por lo que el módulo callback deberá tener controlados sus valores para grabar el registro."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¿Continuar?","Formulario con campos sin Tipo de Control","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=130154693;
 //BA.debugLineNum = 130154693;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 136;
return;
case 136:
//C
this.state = 101;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154694;
 //BA.debugLineNum = 130154694;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
if (true) break;

case 101:
//if
this.state = 106;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 103;
;}if (true) break;

case 103:
//C
this.state = 106;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 106:
//C
this.state = 107;
;
 if (true) break;
;
RDebugUtils.currentLine=130154697;
 //BA.debugLineNum = 130154697;BA.debugLine="If NumeroControlesEditablesFormulario=0 Then";

case 107:
//if
this.state = 116;
if (_numerocontroleseditablesformulario==0) { 
this.state = 109;
}if (true) break;

case 109:
//C
this.state = 110;
RDebugUtils.currentLine=130154698;
 //BA.debugLineNum = 130154698;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
_msa = parent._xui.Msgbox2Async(ba,"No hay ningún campo definido con control editable en el formulario."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¿Continuar?","Formulario sin controles editables","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=130154699;
 //BA.debugLineNum = 130154699;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "comprobaravisosregistro"), _msa);
this.state = 137;
return;
case 137:
//C
this.state = 110;
_result = (int) result[0];
;
RDebugUtils.currentLine=130154700;
 //BA.debugLineNum = 130154700;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
if (true) break;

case 110:
//if
this.state = 115;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 112;
;}if (true) break;

case 112:
//C
this.state = 115;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 115:
//C
this.state = 116;
;
 if (true) break;

case 116:
//C
this.state = -1;
;
RDebugUtils.currentLine=130154703;
 //BA.debugLineNum = 130154703;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=130154704;
 //BA.debugLineNum = 130154704;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _configurarorigendatos() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "configurarorigendatos", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "configurarorigendatos", null));}
ResumableSub_ConfigurarOrigenDatos rsub = new ResumableSub_ConfigurarOrigenDatos(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ConfigurarOrigenDatos extends BA.ResumableSub {
public ResumableSub_ConfigurarOrigenDatos(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _result = 0;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;
Object _robj = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129695746;
 //BA.debugLineNum = 129695746;BA.debugLine="SetCurrentFile(\"\")";
_setcurrentfile("");
RDebugUtils.currentLine=129695747;
 //BA.debugLineNum = 129695747;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=129695748;
 //BA.debugLineNum = 129695748;BA.debugLine="lstPrimaryKey.Initialize";
parent._lstprimarykey.Initialize();
RDebugUtils.currentLine=129695751;
 //BA.debugLineNum = 129695751;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
parent._prefdialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=129695753;
 //BA.debugLineNum = 129695753;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
parent._prefdialog._loadfromjson /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"OrigenDatosJrdcRecordFormBuilder.json"));
RDebugUtils.currentLine=129695754;
 //BA.debugLineNum = 129695754;BA.debugLine="Dim mData As Map=CreateMap()";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
RDebugUtils.currentLine=129695755;
 //BA.debugLineNum = 129695755;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"CAN";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "configurarorigendatos"), parent._prefdialog._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL")));
this.state = 18;
return;
case 18:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=129695756;
 //BA.debugLineNum = 129695756;BA.debugLine="If result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=129695757;
 //BA.debugLineNum = 129695757;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
parent._lbltitleipjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=129695758;
 //BA.debugLineNum = 129695758;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
parent._lbltitlepuertojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=129695759;
 //BA.debugLineNum = 129695759;BA.debugLine="lblTitleNombreTabla.TextColor=fx.Colors.From32Bit";
parent._lbltitlenombretabla.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=129695760;
 //BA.debugLineNum = 129695760;BA.debugLine="lblTitleDBMS.TextColor=fx.Colors.From32Bit(0xFFFF";
parent._lbltitledbms.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=129695761;
 //BA.debugLineNum = 129695761;BA.debugLine="txtIpJRDC.Enabled=True";
parent._txtipjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129695762;
 //BA.debugLineNum = 129695762;BA.debugLine="txtPuertoJRDC.Enabled=True";
parent._txtpuertojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129695763;
 //BA.debugLineNum = 129695763;BA.debugLine="txtNombreTabla.ENABLED=True";
parent._txtnombretabla.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129695764;
 //BA.debugLineNum = 129695764;BA.debugLine="txtDBMS.ENABLED=True";
parent._txtdbms.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129695766;
 //BA.debugLineNum = 129695766;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(mData.GetD";
parent._datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("NombreTabla"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("DBMS"),(Object)("MySQL"))));
RDebugUtils.currentLine=129695769;
 //BA.debugLineNum = 129695769;BA.debugLine="Select Case mData.GetDefault(\"DBMS\",\"MySQL\")";
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(_mdata.GetDefault((Object)("DBMS"),(Object)("MySQL")),(Object)("MySQL"),(Object)("SQLServer"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=129695771;
 //BA.debugLineNum = 129695771;BA.debugLine="CargaCamposJRDCMySQL(DatosOrigenDatos.IpJRDC,Da";
_cargacamposjrdcmysql(parent._datosorigendatos.IpJRDC /*String*/ ,(int)(Double.parseDouble(parent._datosorigendatos.PuertoJRDC /*String*/ )),parent._datosorigendatos.NombreTabla /*String*/ );
RDebugUtils.currentLine=129695772;
 //BA.debugLineNum = 129695772;BA.debugLine="Wait For CargaCamposJRDCMySQL_Completed (Accion";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcmysql_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "configurarorigendatos"), null);
this.state = 19;
return;
case 19:
//C
this.state = 12;
_accion = (String) result[0];
_lstcampossql = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=129695775;
 //BA.debugLineNum = 129695775;BA.debugLine="CargaCamposJRDCSQLServer(DatosOrigenDatos.IpJRD";
_cargacamposjrdcsqlserver(parent._datosorigendatos.IpJRDC /*String*/ ,(int)(Double.parseDouble(parent._datosorigendatos.PuertoJRDC /*String*/ )),parent._datosorigendatos.NombreTabla /*String*/ );
RDebugUtils.currentLine=129695776;
 //BA.debugLineNum = 129695776;BA.debugLine="Wait For CargaCamposJRDCSQLServer_Completed (Ac";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcsqlserver_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "configurarorigendatos"), null);
this.state = 20;
return;
case 20:
//C
this.state = 12;
_accion = (String) result[0];
_lstcampossql = (anywheresoftware.b4a.objects.collections.List) result[1];
;
 if (true) break;
;
RDebugUtils.currentLine=129695781;
 //BA.debugLineNum = 129695781;BA.debugLine="If Accion<>\"OK\" Then Return False";

case 12:
//if
this.state = 17;
if ((_accion).equals("OK") == false) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=129695782;
 //BA.debugLineNum = 129695782;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=129695783;
 //BA.debugLineNum = 129695783;BA.debugLine="pnlOrigenSQL.Visible=True";
parent._pnlorigensql.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=129695785;
 //BA.debugLineNum = 129695785;BA.debugLine="WAIT FOR (CargaItemsCLV(lstCamposSQL)) COMPLETE (";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "configurarorigendatos"), _cargaitemsclv(_lstcampossql));
this.state = 21;
return;
case 21:
//C
this.state = -1;
_robj = (Object) result[0];
;
RDebugUtils.currentLine=129695787;
 //BA.debugLineNum = 129695787;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=129695789;
 //BA.debugLineNum = 129695789;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.Map  _itemvaluetomap(b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "itemvaluetomap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "itemvaluetomap", new Object[] {_clviv}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.Map _mextras = null;
RDebugUtils.currentLine=129040384;
 //BA.debugLineNum = 129040384;BA.debugLine="Sub ItemValueToMap (clvIV As clvRecordFormItemValu";
RDebugUtils.currentLine=129040385;
 //BA.debugLineNum = 129040385;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=129040386;
 //BA.debugLineNum = 129040386;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=129040387;
 //BA.debugLineNum = 129040387;BA.debugLine="m.Put(\"ControlIndependiente\",clvIV.chkBoxControlI";
_m.Put((Object)("ControlIndependiente"),(Object)(_clviv.chkBoxControlIndependiente /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=129040388;
 //BA.debugLineNum = 129040388;BA.debugLine="m.Put(\"Campo\",clvIV.txtCampo.text)";
_m.Put((Object)("Campo"),(Object)(_clviv.txtCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040389;
 //BA.debugLineNum = 129040389;BA.debugLine="m.Put(\"TituloCampo\",clvIV.txtTituloCampo.text)";
_m.Put((Object)("TituloCampo"),(Object)(_clviv.txtTituloCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040390;
 //BA.debugLineNum = 129040390;BA.debugLine="m.Put(\"PrimaryKey\",clvIV.chkboxKeyID.Checked)";
_m.Put((Object)("PrimaryKey"),(Object)(_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=129040391;
 //BA.debugLineNum = 129040391;BA.debugLine="m.Put(\"TipoDatoMySQL\",clvIV.txtTipoDatoMySQL.text";
_m.Put((Object)("TipoDatoMySQL"),(Object)(_clviv.txtTipoDatoMySQL /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040392;
 //BA.debugLineNum = 129040392;BA.debugLine="m.Put(\"TipoDato\",clvIV.cboTipoDato.value)";
_m.Put((Object)("TipoDato"),_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=129040393;
 //BA.debugLineNum = 129040393;BA.debugLine="m.Put(\"EsFecha\",clvIV.chkBoxEsFecha.Checked)";
_m.Put((Object)("EsFecha"),(Object)(_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=129040394;
 //BA.debugLineNum = 129040394;BA.debugLine="m.Put(\"NoNulo\",clvIV.chkboxNoNulo.Checked)";
_m.Put((Object)("NoNulo"),(Object)(_clviv.chkBoxNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=129040395;
 //BA.debugLineNum = 129040395;BA.debugLine="m.Put(\"AutoIncremental\",clvIV.chkBoxAutoIncrement";
_m.Put((Object)("AutoIncremental"),(Object)(_clviv.chkBoxAutoIncremental /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=129040396;
 //BA.debugLineNum = 129040396;BA.debugLine="m.Put(\"TipoControl\",clvIV.cboTipoControl.value)";
_m.Put((Object)("TipoControl"),_clviv.cboTipoControl /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=129040397;
 //BA.debugLineNum = 129040397;BA.debugLine="m.Put(\"ControlEditable\",clvIV.chkBoxControlEditab";
_m.Put((Object)("ControlEditable"),(Object)(_clviv.chkBoxControlEditable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=129040398;
 //BA.debugLineNum = 129040398;BA.debugLine="m.Put(\"InfoCampo\",clvIV.txtInfoCampo.Text)";
_m.Put((Object)("InfoCampo"),(Object)(_clviv.txtInfoCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040399;
 //BA.debugLineNum = 129040399;BA.debugLine="m.Put(\"ValorCampoPorDefecto\",clvIV.txtValorCampoP";
_m.Put((Object)("ValorCampoPorDefecto"),(Object)(_clviv.txtValorCampoPorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040400;
 //BA.debugLineNum = 129040400;BA.debugLine="Dim mExtras As Map";
_mextras = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=129040401;
 //BA.debugLineNum = 129040401;BA.debugLine="mExtras.Initialize";
_mextras.Initialize();
RDebugUtils.currentLine=129040412;
 //BA.debugLineNum = 129040412;BA.debugLine="If clvIV.cboTipoDatosAux.value=\"Lista\" Then";
if ((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Lista"))) { 
RDebugUtils.currentLine=129040413;
 //BA.debugLineNum = 129040413;BA.debugLine="mExtras.Put(\"TipoDatosAux\",\"Lista\")";
_mextras.Put((Object)("TipoDatosAux"),(Object)("Lista"));
RDebugUtils.currentLine=129040414;
 //BA.debugLineNum = 129040414;BA.debugLine="mExtras.Put(\"ListaValoresDatosAux\",clvIV.txtList";
_mextras.Put((Object)("ListaValoresDatosAux"),(Object)(_clviv.txtListaValoresDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 };
RDebugUtils.currentLine=129040417;
 //BA.debugLineNum = 129040417;BA.debugLine="If clvIV.cboTipoDatosAux.Value=\"Consulta\" Then";
if ((_clviv.cboTipoDatosAux /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("Consulta"))) { 
RDebugUtils.currentLine=129040418;
 //BA.debugLineNum = 129040418;BA.debugLine="mExtras.Put(\"TipoDatosAux\",\"Consulta\")";
_mextras.Put((Object)("TipoDatosAux"),(Object)("Consulta"));
RDebugUtils.currentLine=129040419;
 //BA.debugLineNum = 129040419;BA.debugLine="mExtras.Put(\"IPJrdcOrigenDatosAux\",clvIV.txtIPJr";
_mextras.Put((Object)("IPJrdcOrigenDatosAux"),(Object)(_clviv.txtIPJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040420;
 //BA.debugLineNum = 129040420;BA.debugLine="mExtras.Put(\"PuertoJrdcOrigenDatosAux\",clvIV.txt";
_mextras.Put((Object)("PuertoJrdcOrigenDatosAux"),(Object)(_clviv.txtPuertoJrdcOrigenDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040421;
 //BA.debugLineNum = 129040421;BA.debugLine="mExtras.Put(\"ComandoConfigDatosAux\",clvIV.txtCom";
_mextras.Put((Object)("ComandoConfigDatosAux"),(Object)(_clviv.txtComandoConfigDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040422;
 //BA.debugLineNum = 129040422;BA.debugLine="mExtras.Put(\"ParametrosComandoDatosAux\",clvIV.tx";
_mextras.Put((Object)("ParametrosComandoDatosAux"),(Object)(_clviv.txtParametrosComandoDatosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=129040423;
 //BA.debugLineNum = 129040423;BA.debugLine="mExtras.Put(\"NumCamposDatosAux\",clvIV.B4XPlusMin";
_mextras.Put((Object)("NumCamposDatosAux"),_clviv.B4XPlusMinusNumCamposDatosAux /*b4j.docU.b4xplusminus*/ ._getselectedvalue /*Object*/ (null));
 };
RDebugUtils.currentLine=129040425;
 //BA.debugLineNum = 129040425;BA.debugLine="m.Put(\"Extras\",mExtras)";
_m.Put((Object)("Extras"),(Object)(_mextras.getObject()));
RDebugUtils.currentLine=129040426;
 //BA.debugLineNum = 129040426;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=129040427;
 //BA.debugLineNum = 129040427;BA.debugLine="End Sub";
return null;
}
public static String  _frm_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "frm_closerequest", true))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=128647168;
 //BA.debugLineNum = 128647168;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=128647169;
 //BA.debugLineNum = 128647169;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=128647170;
 //BA.debugLineNum = 128647170;BA.debugLine="End Sub";
return "";
}
public static String  _frm_resize(double _width,double _height) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "frm_resize", true))
	 {return ((String) Debug.delegate(ba, "frm_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=128909312;
 //BA.debugLineNum = 128909312;BA.debugLine="Sub frm_Resize (Width As Double, Height As Double)";
RDebugUtils.currentLine=128909313;
 //BA.debugLineNum = 128909313;BA.debugLine="dragger.Resize";
_dragger._resize /*String*/ (null);
RDebugUtils.currentLine=128909314;
 //BA.debugLineNum = 128909314;BA.debugLine="End Sub";
return "";
}
public static String  _habilitardeshabilitarcheckbox(anywheresoftware.b4j.objects.CheckboxWrapper _chkboxsel,boolean _habilitado) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "habilitardeshabilitarcheckbox", true))
	 {return ((String) Debug.delegate(ba, "habilitardeshabilitarcheckbox", new Object[] {_chkboxsel,_habilitado}));}
RDebugUtils.currentLine=130351104;
 //BA.debugLineNum = 130351104;BA.debugLine="Sub HabilitarDeshabilitarCheckBox(chkboxSel As Che";
RDebugUtils.currentLine=130351105;
 //BA.debugLineNum = 130351105;BA.debugLine="chkboxSel.Enabled=Habilitado";
_chkboxsel.setEnabled(_habilitado);
RDebugUtils.currentLine=130351106;
 //BA.debugLineNum = 130351106;BA.debugLine="If Habilitado Then";
if (_habilitado) { 
RDebugUtils.currentLine=130351107;
 //BA.debugLineNum = 130351107;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:black; -fx-border";
_chkboxsel.setStyle("-fx-text-fill:black; -fx-border-color: black");
 }else {
RDebugUtils.currentLine=130351109;
 //BA.debugLineNum = 130351109;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:lightgray; -fx-bo";
_chkboxsel.setStyle("-fx-text-fill:lightgray; -fx-border-color: lightgray");
 };
RDebugUtils.currentLine=130351111;
 //BA.debugLineNum = 130351111;BA.debugLine="End Sub";
return "";
}
public static void  _help() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "help", true))
	 {Debug.delegate(ba, "help", null); return;}
ResumableSub_Help rsub = new ResumableSub_Help(null);
rsub.resume(ba, null);
}
public static class ResumableSub_Help extends BA.ResumableSub {
public ResumableSub_Help(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
b4j.docU.b4xlongtexttemplate _dlginfo = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbinfo = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4j.objects.ButtonWrapper _bok = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pt = null;
anywheresoftware.b4j.objects.LabelWrapper _lblt = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=130809857;
 //BA.debugLineNum = 130809857;BA.debugLine="Dialog.Title=\"Información\"";
parent._dialog._title /*Object*/  = (Object)("Información");
RDebugUtils.currentLine=130809860;
 //BA.debugLineNum = 130809860;BA.debugLine="Dim DlgInfo As B4XLongTextTemplate";
_dlginfo = new b4j.docU.b4xlongtexttemplate();
RDebugUtils.currentLine=130809861;
 //BA.debugLineNum = 130809861;BA.debugLine="DlgInfo.Initialize";
_dlginfo._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=130809862;
 //BA.debugLineNum = 130809862;BA.debugLine="Dim sbInfo As StringBuilder";
_sbinfo = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=130809863;
 //BA.debugLineNum = 130809863;BA.debugLine="sbInfo.Initialize";
_sbinfo.Initialize();
RDebugUtils.currentLine=130809886;
 //BA.debugLineNum = 130809886;BA.debugLine="DlgInfo.Text=sbInfo.ToString";
_dlginfo._text /*Object*/  = (Object)(_sbinfo.ToString());
RDebugUtils.currentLine=130809887;
 //BA.debugLineNum = 130809887;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(DlgInf";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_dlginfo),(Object)("Ok"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=130809889;
 //BA.debugLineNum = 130809889;BA.debugLine="Dialog.Base.SetLayoutAnimated(0,0.1*Dialog.mParen";
parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0.1*parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*0.8,0.1*parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.8,parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*0.8,parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.8);
RDebugUtils.currentLine=130809891;
 //BA.debugLineNum = 130809891;BA.debugLine="Dialog.TitleBar.SetLayoutAnimated(0,0,0,Dialog.Ba";
parent._dialog._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),parent._dialog._titlebarheight /*int*/ );
RDebugUtils.currentLine=130809892;
 //BA.debugLineNum = 130809892;BA.debugLine="Dim bOk As Button=Dialog.GetButton(xui.DialogResp";
_bok = new anywheresoftware.b4j.objects.ButtonWrapper();
_bok = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Positive).getObject()));
RDebugUtils.currentLine=130809893;
 //BA.debugLineNum = 130809893;BA.debugLine="bOk.Top=Dialog.Base.Height-Dialog.ButtonsHeight-5";
_bok.setTop(parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-parent._dialog._buttonsheight /*int*/ -5);
RDebugUtils.currentLine=130809895;
 //BA.debugLineNum = 130809895;BA.debugLine="Dim pT As Pane=Dialog.TitleBar";
_pt = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pt = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(parent._dialog._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=130809896;
 //BA.debugLineNum = 130809896;BA.debugLine="Dim lblT As Label=pT.GetNode(0)";
_lblt = new anywheresoftware.b4j.objects.LabelWrapper();
_lblt = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_pt.GetNode((int) (0)).getObject()));
RDebugUtils.currentLine=130809897;
 //BA.debugLineNum = 130809897;BA.debugLine="lblT.PrefWidth=lblT.Parent.PrefWidth";
_lblt.setPrefWidth(_lblt.getParent().getPrefWidth());
RDebugUtils.currentLine=130809899;
 //BA.debugLineNum = 130809899;BA.debugLine="DlgInfo.mBase.SetLayoutAnimated(100,5,Dialog.Titl";
_dlginfo._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (100),5,parent._dialog._titlebarheight /*int*/ ,parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-10,parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-parent._dialog._titlebarheight /*int*/ -parent._dialog._buttonsheight /*int*/ );
RDebugUtils.currentLine=130809901;
 //BA.debugLineNum = 130809901;BA.debugLine="Dim p As Pane=DlgInfo.CustomListView1.GetPanel(0)";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_dlginfo._customlistview1 /*b4j.example.customlistview*/ ._getpanel((int) (0)).getObject()));
RDebugUtils.currentLine=130809902;
 //BA.debugLineNum = 130809902;BA.debugLine="Dim lbl As Label=p.GetNode(0)";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_p.GetNode((int) (0)).getObject()));
RDebugUtils.currentLine=130809903;
 //BA.debugLineNum = 130809903;BA.debugLine="lbl.Font=fx.DefaultFont(8)";
_lbl.setFont(parent._fx.DefaultFont(8));
RDebugUtils.currentLine=130809904;
 //BA.debugLineNum = 130809904;BA.debugLine="lbl.TextColor=fx.Colors.From32Bit(0xFFFFFFFF)";
_lbl.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=130809913;
 //BA.debugLineNum = 130809913;BA.debugLine="wait for (rs) complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "help"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[0];
;
RDebugUtils.currentLine=130809914;
 //BA.debugLineNum = 130809914;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondoitemsimpares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondoitemsimpares_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondoitemsimpares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoItemsImpares_MouseClicked rsub = new ResumableSub_lblColorFondoItemsImpares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoItemsImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoItemsImpares_MouseClicked(b4j.docU.jamrecordformbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamrecordformbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131661845;
 //BA.debugLineNum = 131661845;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Items Impare";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Items Impares");
RDebugUtils.currentLine=131661846;
 //BA.debugLineNum = 131661846;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=131661847;
 //BA.debugLineNum = 131661847;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=131661848;
 //BA.debugLineNum = 131661848;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=131661849;
 //BA.debugLineNum = 131661849;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "lblcolorfondoitemsimpares_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=131661851;
 //BA.debugLineNum = 131661851;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=131661852;
 //BA.debugLineNum = 131661852;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=131661853;
 //BA.debugLineNum = 131661853;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolorfondoitemsimpares.getColor());
RDebugUtils.currentLine=131661854;
 //BA.debugLineNum = 131661854;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=131661855;
 //BA.debugLineNum = 131661855;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=131661856;
 //BA.debugLineNum = 131661856;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=131661857;
 //BA.debugLineNum = 131661857;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=131661858;
 //BA.debugLineNum = 131661858;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "lblcolorfondoitemsimpares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=131661859;
 //BA.debugLineNum = 131661859;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=131661860;
 //BA.debugLineNum = 131661860;BA.debugLine="lblColorFondoItemsImpares.Color=BCColorPickerjamT";
parent._lblcolorfondoitemsimpares.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=131661861;
 //BA.debugLineNum = 131661861;BA.debugLine="txtRGBColorFondoItemsImpares.Text=GetCssColorStri";
parent._txtrgbcolorfondoitemsimpares.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondoitemsimpares.getColor()));
RDebugUtils.currentLine=131661862;
 //BA.debugLineNum = 131661862;BA.debugLine="ColItemsImpares=lblColorFondoItemsImpares.Color";
parent._colitemsimpares = parent._lblcolorfondoitemsimpares.getColor();
RDebugUtils.currentLine=131661864;
 //BA.debugLineNum = 131661864;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondoitemspares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondoitemspares_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondoitemspares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoItemsPares_MouseClicked rsub = new ResumableSub_lblColorFondoItemsPares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoItemsPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoItemsPares_MouseClicked(b4j.docU.jamrecordformbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamrecordformbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131727382;
 //BA.debugLineNum = 131727382;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Items Pares\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Items Pares");
RDebugUtils.currentLine=131727383;
 //BA.debugLineNum = 131727383;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=131727384;
 //BA.debugLineNum = 131727384;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=131727385;
 //BA.debugLineNum = 131727385;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=131727386;
 //BA.debugLineNum = 131727386;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "lblcolorfondoitemspares_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=131727388;
 //BA.debugLineNum = 131727388;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=131727389;
 //BA.debugLineNum = 131727389;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=131727390;
 //BA.debugLineNum = 131727390;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolorfondoitemspares.getColor());
RDebugUtils.currentLine=131727391;
 //BA.debugLineNum = 131727391;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=131727392;
 //BA.debugLineNum = 131727392;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=131727393;
 //BA.debugLineNum = 131727393;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=131727394;
 //BA.debugLineNum = 131727394;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=131727395;
 //BA.debugLineNum = 131727395;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "lblcolorfondoitemspares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=131727396;
 //BA.debugLineNum = 131727396;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=131727397;
 //BA.debugLineNum = 131727397;BA.debugLine="lblColorFondoItemsPares.Color=BCColorPickerjamTab";
parent._lblcolorfondoitemspares.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=131727398;
 //BA.debugLineNum = 131727398;BA.debugLine="txtRGBColorFondoItemsPares.Text=GetCssColorString";
parent._txtrgbcolorfondoitemspares.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondoitemspares.getColor()));
RDebugUtils.currentLine=131727399;
 //BA.debugLineNum = 131727399;BA.debugLine="ColItemsPares=lblColorFondoItemsPares.Color";
parent._colitemspares = parent._lblcolorfondoitemspares.getColor();
RDebugUtils.currentLine=131727401;
 //BA.debugLineNum = 131727401;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lblinfo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "lblinfo_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblinfo_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=130547712;
 //BA.debugLineNum = 130547712;BA.debugLine="Sub lblInfo_MouseClicked (EventData As MouseEvent)";
RDebugUtils.currentLine=130547714;
 //BA.debugLineNum = 130547714;BA.debugLine="End Sub";
return "";
}
public static void  _lblresetcolorfondoitemsimpares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondoitemsimpares_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondoitemsimpares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoItemsImpares_MouseClicked rsub = new ResumableSub_lblResetColorFondoItemsImpares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoItemsImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoItemsImpares_MouseClicked(b4j.docU.jamrecordformbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamrecordformbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131858433;
 //BA.debugLineNum = 131858433;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de los Items Impares al color por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=131858434;
 //BA.debugLineNum = 131858434;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "lblresetcolorfondoitemsimpares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=131858435;
 //BA.debugLineNum = 131858435;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=131858436;
 //BA.debugLineNum = 131858436;BA.debugLine="lblColorFondoItemsImpares.Color=ColItemsImparesPr";
parent._lblcolorfondoitemsimpares.setColor(parent._colitemsimparespredeterminado);
RDebugUtils.currentLine=131858438;
 //BA.debugLineNum = 131858438;BA.debugLine="txtRGBColorFondoItemsImpares.Text=GetCssColorStri";
parent._txtrgbcolorfondoitemsimpares.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondoitemsimpares.getColor()));
RDebugUtils.currentLine=131858439;
 //BA.debugLineNum = 131858439;BA.debugLine="ColItemsImpares=lblColorFondoItemsImpares.Color";
parent._colitemsimpares = parent._lblcolorfondoitemsimpares.getColor();
RDebugUtils.currentLine=131858440;
 //BA.debugLineNum = 131858440;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolorfondoitemspares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondoitemspares_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondoitemspares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoItemsPares_MouseClicked rsub = new ResumableSub_lblResetColorFondoItemsPares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoItemsPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoItemsPares_MouseClicked(b4j.docU.jamrecordformbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamrecordformbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=131792897;
 //BA.debugLineNum = 131792897;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de los items pares al color por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=131792898;
 //BA.debugLineNum = 131792898;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "lblresetcolorfondoitemspares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=131792899;
 //BA.debugLineNum = 131792899;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=131792900;
 //BA.debugLineNum = 131792900;BA.debugLine="lblColorFondoItemsPares.Color=ColItemsParesPredet";
parent._lblcolorfondoitemspares.setColor(parent._colitemsparespredeterminado);
RDebugUtils.currentLine=131792902;
 //BA.debugLineNum = 131792902;BA.debugLine="txtRGBColorFondoItemsPares.Text=GetCssColorString";
parent._txtrgbcolorfondoitemspares.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondoitemspares.getColor()));
RDebugUtils.currentLine=131792903;
 //BA.debugLineNum = 131792903;BA.debugLine="ColItemsPares=lblColorFondoItemsPares.Color";
parent._colitemspares = parent._lblcolorfondoitemspares.getColor();
RDebugUtils.currentLine=131792904;
 //BA.debugLineNum = 131792904;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mnuhelp_action() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "mnuhelp_action", true))
	 {return ((String) Debug.delegate(ba, "mnuhelp_action", null));}
RDebugUtils.currentLine=130744320;
 //BA.debugLineNum = 130744320;BA.debugLine="Sub mnuHelp_Action";
RDebugUtils.currentLine=130744321;
 //BA.debugLineNum = 130744321;BA.debugLine="Help";
_help();
RDebugUtils.currentLine=130744322;
 //BA.debugLineNum = 130744322;BA.debugLine="End Sub";
return "";
}
public static void  _mnuload_action() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "mnuload_action", true))
	 {Debug.delegate(ba, "mnuload_action", null); return;}
ResumableSub_mnuLoad_Action rsub = new ResumableSub_mnuLoad_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuLoad_Action extends BA.ResumableSub {
public ResumableSub_mnuLoad_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
boolean _cancel = false;
String _f = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129236993;
 //BA.debugLineNum = 129236993;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "mnuload_action"), _checkchanges());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_cancel = (boolean) result[0];
;
RDebugUtils.currentLine=129236994;
 //BA.debugLineNum = 129236994;BA.debugLine="If Cancel Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_cancel) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=129236995;
 //BA.debugLineNum = 129236995;BA.debugLine="Dim f As String = FileChooser.ShowOpen(frm)";
_f = parent._filechooser.ShowOpen(parent._frm);
RDebugUtils.currentLine=129236996;
 //BA.debugLineNum = 129236996;BA.debugLine="If f <> \"\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_f).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=129236997;
 //BA.debugLineNum = 129236997;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=129236998;
 //BA.debugLineNum = 129236998;BA.debugLine="lstPrimaryKey.Clear";
parent._lstprimarykey.Clear();
RDebugUtils.currentLine=129236999;
 //BA.debugLineNum = 129236999;BA.debugLine="DatosOrigenDatos.Initialize";
parent._datosorigendatos.Initialize();
RDebugUtils.currentLine=129237000;
 //BA.debugLineNum = 129237000;BA.debugLine="CargarDatosDesdeFichero(f)";
_cargardatosdesdefichero(_f);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=129237002;
 //BA.debugLineNum = 129237002;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mnunew_action() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "mnunew_action", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mnunew_action", null));}
ResumableSub_mnuNew_Action rsub = new ResumableSub_mnuNew_Action(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_mnuNew_Action extends BA.ResumableSub {
public ResumableSub_mnuNew_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
boolean _cancel = false;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=129630209;
 //BA.debugLineNum = 129630209;BA.debugLine="Log(\"mnuNew_Action\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9129630209","mnuNew_Action",0);
RDebugUtils.currentLine=129630210;
 //BA.debugLineNum = 129630210;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "mnunew_action"), _checkchanges());
this.state = 13;
return;
case 13:
//C
this.state = 1;
_cancel = (boolean) result[0];
;
RDebugUtils.currentLine=129630211;
 //BA.debugLineNum = 129630211;BA.debugLine="If Cancel Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_cancel) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=129630212;
 //BA.debugLineNum = 129630212;BA.debugLine="lstPrimaryKey.Initialize";
parent._lstprimarykey.Initialize();
RDebugUtils.currentLine=129630213;
 //BA.debugLineNum = 129630213;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=129630214;
 //BA.debugLineNum = 129630214;BA.debugLine="Log(\"LimpiarControlesOrigenDatos\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9129630214","LimpiarControlesOrigenDatos",0);
RDebugUtils.currentLine=129630215;
 //BA.debugLineNum = 129630215;BA.debugLine="LimpiarControlesOrigenDatos";
_limpiarcontrolesorigendatos();
RDebugUtils.currentLine=129630217;
 //BA.debugLineNum = 129630217;BA.debugLine="Wait For(ConfigurarOrigenDatos) complete (rBool A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "mnunew_action"), _configurarorigendatos());
this.state = 14;
return;
case 14:
//C
this.state = 7;
_rbool = (boolean) result[0];
;
RDebugUtils.currentLine=129630218;
 //BA.debugLineNum = 129630218;BA.debugLine="If rBool=False Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_rbool==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=129630219;
 //BA.debugLineNum = 129630219;BA.debugLine="ColItemsImpares=ColItemsImparesPredeterminado";
parent._colitemsimpares = parent._colitemsimparespredeterminado;
RDebugUtils.currentLine=129630220;
 //BA.debugLineNum = 129630220;BA.debugLine="ColItemsPares=ColItemsParesPredeterminado";
parent._colitemspares = parent._colitemsparespredeterminado;
RDebugUtils.currentLine=129630221;
 //BA.debugLineNum = 129630221;BA.debugLine="NewFileString=ExportDataToString";
parent._newfilestring = _exportdatatostring();
RDebugUtils.currentLine=129630222;
 //BA.debugLineNum = 129630222;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=129630223;
 //BA.debugLineNum = 129630223;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _mnusalir_action() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "mnusalir_action", true))
	 {Debug.delegate(ba, "mnusalir_action", null); return;}
ResumableSub_mnuSalir_Action rsub = new ResumableSub_mnuSalir_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSalir_Action extends BA.ResumableSub {
public ResumableSub_mnuSalir_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128712705;
 //BA.debugLineNum = 128712705;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"De momento";
_msa = parent._xui.Msgbox2Async(ba,"De momento no se ha implantado el control de cambios (no se grabarán los posibles cambios). ¿Salir de la aplicación?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=128712706;
 //BA.debugLineNum = 128712706;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "mnusalir_action"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=128712707;
 //BA.debugLineNum = 128712707;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=128712708;
 //BA.debugLineNum = 128712708;BA.debugLine="RecentManager.SaveList";
parent._recentmanager._savelist /*String*/ (null);
RDebugUtils.currentLine=128712709;
 //BA.debugLineNum = 128712709;BA.debugLine="frm.Close";
parent._frm.Close();
RDebugUtils.currentLine=128712710;
 //BA.debugLineNum = 128712710;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _mnusaveas_action() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "mnusaveas_action", true))
	 {Debug.delegate(ba, "mnusaveas_action", null); return;}
ResumableSub_mnuSaveAs_Action rsub = new ResumableSub_mnuSaveAs_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSaveAs_Action extends BA.ResumableSub {
public ResumableSub_mnuSaveAs_Action(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
boolean _camposok = false;
Object _msa = null;
int _result = 0;
String _f = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=130220033;
 //BA.debugLineNum = 130220033;BA.debugLine="Wait For (ComprobarAvisosRegistro) Complete (Camp";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "mnusaveas_action"), _comprobaravisosregistro());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_camposok = (boolean) result[0];
;
RDebugUtils.currentLine=130220034;
 //BA.debugLineNum = 130220034;BA.debugLine="If CamposOK Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_camposok) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=130220035;
 //BA.debugLineNum = 130220035;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ubicar el f";
_msa = parent._xui.MsgboxAsync(ba,"Ubicar el fichero en el directorio FILES de la aplicación en la que se vaya a usar."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Recuerda SINCRONIZAR la carpeta Files del proyecto después.","Aviso");
RDebugUtils.currentLine=130220036;
 //BA.debugLineNum = 130220036;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "mnusaveas_action"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=130220037;
 //BA.debugLineNum = 130220037;BA.debugLine="Dim f As String = FileChooser.ShowSave(frm)";
_f = parent._filechooser.ShowSave(parent._frm);
RDebugUtils.currentLine=130220038;
 //BA.debugLineNum = 130220038;BA.debugLine="If f = \"\" Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if ((_f).equals("")) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=130220039;
 //BA.debugLineNum = 130220039;BA.debugLine="SetCurrentFile(f)";
_setcurrentfile(_f);
RDebugUtils.currentLine=130220040;
 //BA.debugLineNum = 130220040;BA.debugLine="mnuSave_Action";
_mnusave_action();
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=130220042;
 //BA.debugLineNum = 130220042;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _nuevodesdeformregistro() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "nuevodesdeformregistro", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "nuevodesdeformregistro", null));}
ResumableSub_NuevoDesdeFormRegistro rsub = new ResumableSub_NuevoDesdeFormRegistro(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_NuevoDesdeFormRegistro extends BA.ResumableSub {
public ResumableSub_NuevoDesdeFormRegistro(b4j.docU.jamrecordformbuilder parent) {
this.parent = parent;
}
b4j.docU.jamrecordformbuilder parent;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128516097;
 //BA.debugLineNum = 128516097;BA.debugLine="lstPrimaryKey.Initialize";
parent._lstprimarykey.Initialize();
RDebugUtils.currentLine=128516098;
 //BA.debugLineNum = 128516098;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=128516099;
 //BA.debugLineNum = 128516099;BA.debugLine="LimpiarControlesOrigenDatos";
_limpiarcontrolesorigendatos();
RDebugUtils.currentLine=128516101;
 //BA.debugLineNum = 128516101;BA.debugLine="Wait For(ConfigurarOrigenDatos) complete (rBool A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "nuevodesdeformregistro"), _configurarorigendatos());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rbool = (boolean) result[0];
;
RDebugUtils.currentLine=128516102;
 //BA.debugLineNum = 128516102;BA.debugLine="If rBool=False Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_rbool==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=128516103;
 //BA.debugLineNum = 128516103;BA.debugLine="ColItemsImpares=ColItemsImparesPredeterminado";
parent._colitemsimpares = parent._colitemsimparespredeterminado;
RDebugUtils.currentLine=128516104;
 //BA.debugLineNum = 128516104;BA.debugLine="ColItemsPares=ColItemsParesPredeterminado";
parent._colitemspares = parent._colitemsparespredeterminado;
RDebugUtils.currentLine=128516105;
 //BA.debugLineNum = 128516105;BA.debugLine="NewFileString=ExportDataToString";
parent._newfilestring = _exportdatatostring();
RDebugUtils.currentLine=128516107;
 //BA.debugLineNum = 128516107;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=128516108;
 //BA.debugLineNum = 128516108;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _recalcularidordencolumnas() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "recalcularidordencolumnas", true))
	 {return ((String) Debug.delegate(ba, "recalcularidordencolumnas", null));}
int _ordencolacum = 0;
int _i = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=131596288;
 //BA.debugLineNum = 131596288;BA.debugLine="private Sub RecalcularIDOrdenColumnas";
RDebugUtils.currentLine=131596289;
 //BA.debugLineNum = 131596289;BA.debugLine="Dim OrdenColAcum As Int";
_ordencolacum = 0;
RDebugUtils.currentLine=131596290;
 //BA.debugLineNum = 131596290;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=131596291;
 //BA.debugLineNum = 131596291;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(_clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=131596292;
 //BA.debugLineNum = 131596292;BA.debugLine="clvIV.txtOrdenColumna.Text=i";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_i));
RDebugUtils.currentLine=131596299;
 //BA.debugLineNum = 131596299;BA.debugLine="If ColActual=Col1 Then";
if (_colactual==_col1) { 
RDebugUtils.currentLine=131596300;
 //BA.debugLineNum = 131596300;BA.debugLine="ColActual=Col2";
_colactual = _col2;
 }else {
RDebugUtils.currentLine=131596302;
 //BA.debugLineNum = 131596302;BA.debugLine="ColActual=Col1";
_colactual = _col1;
 };
RDebugUtils.currentLine=131596304;
 //BA.debugLineNum = 131596304;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _clvlistacampos._getpanel(_i);
RDebugUtils.currentLine=131596305;
 //BA.debugLineNum = 131596305;BA.debugLine="p.Color=ColActual";
_p.setColor(_colactual);
 }
};
RDebugUtils.currentLine=131596307;
 //BA.debugLineNum = 131596307;BA.debugLine="Log(\"RecalcularIDOrdenColumnas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9131596307","RecalcularIDOrdenColumnas",0);
RDebugUtils.currentLine=131596308;
 //BA.debugLineNum = 131596308;BA.debugLine="End Sub";
return "";
}
public static String  _recalcularordencolumnas() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "recalcularordencolumnas", true))
	 {return ((String) Debug.delegate(ba, "recalcularordencolumnas", null));}
int _i = 0;
b4j.docU.jamrecordformbuilder._clvrecordformitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=130482176;
 //BA.debugLineNum = 130482176;BA.debugLine="Sub RecalcularOrdenColumnas";
RDebugUtils.currentLine=130482177;
 //BA.debugLineNum = 130482177;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=130482178;
 //BA.debugLineNum = 130482178;BA.debugLine="Dim clvIV As clvRecordFormItemValue=clvListaCamp";
_clviv = (b4j.docU.jamrecordformbuilder._clvrecordformitemvalue)(_clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=130482179;
 //BA.debugLineNum = 130482179;BA.debugLine="clvIV.txtOrdenColumna.Text=i";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_i));
RDebugUtils.currentLine=130482180;
 //BA.debugLineNum = 130482180;BA.debugLine="If ColActual=Col1 Then";
if (_colactual==_col1) { 
RDebugUtils.currentLine=130482181;
 //BA.debugLineNum = 130482181;BA.debugLine="ColActual=Col2";
_colactual = _col2;
 }else {
RDebugUtils.currentLine=130482183;
 //BA.debugLineNum = 130482183;BA.debugLine="ColActual=Col1";
_colactual = _col1;
 };
RDebugUtils.currentLine=130482185;
 //BA.debugLineNum = 130482185;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _clvlistacampos._getpanel(_i);
RDebugUtils.currentLine=130482186;
 //BA.debugLineNum = 130482186;BA.debugLine="p.Color=ColActual";
_p.setColor(_colactual);
 }
};
RDebugUtils.currentLine=130482188;
 //BA.debugLineNum = 130482188;BA.debugLine="End Sub";
return "";
}
public static void  _recent_click(String _recentfile) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "recent_click", true))
	 {Debug.delegate(ba, "recent_click", new Object[] {_recentfile}); return;}
ResumableSub_Recent_Click rsub = new ResumableSub_Recent_Click(null,_recentfile);
rsub.resume(ba, null);
}
public static class ResumableSub_Recent_Click extends BA.ResumableSub {
public ResumableSub_Recent_Click(b4j.docU.jamrecordformbuilder parent,String _recentfile) {
this.parent = parent;
this._recentfile = _recentfile;
}
b4j.docU.jamrecordformbuilder parent;
String _recentfile;
boolean _cancel = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128778241;
 //BA.debugLineNum = 128778241;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamrecordformbuilder", "recent_click"), _checkchanges());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (boolean) result[0];
;
RDebugUtils.currentLine=128778242;
 //BA.debugLineNum = 128778242;BA.debugLine="If Cancel Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_cancel) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=128778243;
 //BA.debugLineNum = 128778243;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=128778244;
 //BA.debugLineNum = 128778244;BA.debugLine="lstPrimaryKey.Clear";
parent._lstprimarykey.Clear();
RDebugUtils.currentLine=128778245;
 //BA.debugLineNum = 128778245;BA.debugLine="DatosOrigenDatos.Initialize";
parent._datosorigendatos.Initialize();
RDebugUtils.currentLine=128778246;
 //BA.debugLineNum = 128778246;BA.debugLine="CargarDatosDesdeFichero(RecentFile)";
_cargardatosdesdefichero(_recentfile);
RDebugUtils.currentLine=128778247;
 //BA.debugLineNum = 128778247;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setformmaximized(anywheresoftware.b4j.objects.Form _f) throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "setformmaximized", true))
	 {return ((String) Debug.delegate(ba, "setformmaximized", new Object[] {_f}));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=128581632;
 //BA.debugLineNum = 128581632;BA.debugLine="Sub SetFormMaximized(f As Form)";
RDebugUtils.currentLine=128581634;
 //BA.debugLineNum = 128581634;BA.debugLine="Dim joForm As JavaObject = f";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=128581636;
 //BA.debugLineNum = 128581636;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=128581638;
 //BA.debugLineNum = 128581638;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=128581639;
 //BA.debugLineNum = 128581639;BA.debugLine="End Sub";
return "";
}
public static String  _txttitulocampo_action() throws Exception{
RDebugUtils.currentModule="jamrecordformbuilder";
if (Debug.shouldDelegate(ba, "txttitulocampo_action", true))
	 {return ((String) Debug.delegate(ba, "txttitulocampo_action", null));}
RDebugUtils.currentLine=131137536;
 //BA.debugLineNum = 131137536;BA.debugLine="Sub txtTituloCampo_Action";
RDebugUtils.currentLine=131137538;
 //BA.debugLineNum = 131137538;BA.debugLine="End Sub";
return "";
}
}