package b4j.docU;

import anywheresoftware.b4a.debug.*;
import javafx.scene.paint.Color;
import java.lang.Math;

import anywheresoftware.b4a.BA;

public class jamtableviewcamposbuilder extends Object{
public static jamtableviewcamposbuilder mostCurrent = new jamtableviewcamposbuilder();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamtableviewcamposbuilder", null);
		ba.loadHtSubs(jamtableviewcamposbuilder.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.jamtableviewcamposbuilder", ba);
		}
	}
    public static Class<?> getObject() {
		return jamtableviewcamposbuilder.class;
	}

 
public static class _clvcamposbuilderitemvalue{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtID;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboCampo;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtAliasCampo;
public anywheresoftware.b4j.objects.CheckboxWrapper chkColumnaTableView;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtEncabezadoColumna;
public anywheresoftware.b4j.objects.CheckboxWrapper chkboxKeyID;
public anywheresoftware.b4j.objects.LabelWrapper lblOrdenKeyID;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboTipoDato;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxEsFecha;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxEsBooleano;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtValorTrueCampoBooleano;
public anywheresoftware.b4j.objects.CheckboxWrapper chkNoNulo;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxConValorDefecto;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtValorDefecto;
public anywheresoftware.b4j.objects.CheckboxWrapper chkBoxCampoCalculado;
public b4j.docU.b4xplusminus B4XPlusMinusAncho;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtOrdenColumna;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboTipoControlFiltro;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboAlineacionColumna;
public anywheresoftware.b4a.objects.B4XViewWrapper lblColorTextoEncabezadoColumna;
public anywheresoftware.b4a.objects.B4XViewWrapper txtRGBColorTextoEncabezadoColumna;
public anywheresoftware.b4a.objects.B4XViewWrapper lblColorFondoEncabezadoColumna;
public anywheresoftware.b4a.objects.B4XViewWrapper txtRGBColorFondoEncabezadoColumna;
public anywheresoftware.b4a.objects.B4XViewWrapper lblColorTexto;
public anywheresoftware.b4a.objects.B4XViewWrapper txtRGBColorTexto;
public anywheresoftware.b4a.objects.B4XViewWrapper lblColorFondo;
public anywheresoftware.b4a.objects.B4XViewWrapper txtRGBColorFondo;
public anywheresoftware.b4a.objects.B4XViewWrapper lblColorBorde;
public anywheresoftware.b4a.objects.B4XViewWrapper txtRGBColorBorde;
public b4j.docU.b4xplusminus B4XPlusMinusAnchoBorde;
public anywheresoftware.b4j.objects.CheckboxWrapper chkColumnaOcultable;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboTipoControlEdicion;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtNombreCampoDialogosAux;
public void Initialize() {
IsInitialized = true;
txtID = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
cboCampo = new anywheresoftware.b4j.objects.ComboBoxWrapper();
txtAliasCampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
chkColumnaTableView = new anywheresoftware.b4j.objects.CheckboxWrapper();
txtEncabezadoColumna = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
chkboxKeyID = new anywheresoftware.b4j.objects.CheckboxWrapper();
lblOrdenKeyID = new anywheresoftware.b4j.objects.LabelWrapper();
cboTipoDato = new anywheresoftware.b4j.objects.ComboBoxWrapper();
chkBoxEsFecha = new anywheresoftware.b4j.objects.CheckboxWrapper();
chkBoxEsBooleano = new anywheresoftware.b4j.objects.CheckboxWrapper();
txtValorTrueCampoBooleano = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
chkNoNulo = new anywheresoftware.b4j.objects.CheckboxWrapper();
chkBoxConValorDefecto = new anywheresoftware.b4j.objects.CheckboxWrapper();
txtValorDefecto = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
chkBoxCampoCalculado = new anywheresoftware.b4j.objects.CheckboxWrapper();
B4XPlusMinusAncho = new b4j.docU.b4xplusminus();
txtOrdenColumna = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
cboTipoControlFiltro = new anywheresoftware.b4j.objects.ComboBoxWrapper();
cboAlineacionColumna = new anywheresoftware.b4j.objects.ComboBoxWrapper();
lblColorTextoEncabezadoColumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
txtRGBColorTextoEncabezadoColumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
lblColorFondoEncabezadoColumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
txtRGBColorFondoEncabezadoColumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
lblColorTexto = new anywheresoftware.b4a.objects.B4XViewWrapper();
txtRGBColorTexto = new anywheresoftware.b4a.objects.B4XViewWrapper();
lblColorFondo = new anywheresoftware.b4a.objects.B4XViewWrapper();
txtRGBColorFondo = new anywheresoftware.b4a.objects.B4XViewWrapper();
lblColorBorde = new anywheresoftware.b4a.objects.B4XViewWrapper();
txtRGBColorBorde = new anywheresoftware.b4a.objects.B4XViewWrapper();
B4XPlusMinusAnchoBorde = new b4j.docU.b4xplusminus();
chkColumnaOcultable = new anywheresoftware.b4j.objects.CheckboxWrapper();
cboTipoControlEdicion = new anywheresoftware.b4j.objects.ComboBoxWrapper();
txtNombreCampoDialogosAux = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _tipoorigendatos{
public boolean IsInitialized;
public String TipoOrigenDatos;
public String IpJRDC;
public String PuertoJRDC;
public String ComandoJRDC;
public String ParametrosJRDC;
public void Initialize() {
IsInitialized = true;
TipoOrigenDatos = "";
IpJRDC = "";
PuertoJRDC = "";
ComandoJRDC = "";
ParametrosJRDC = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static anywheresoftware.b4a.keywords.Common __c = null;
public static float _version = 0f;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _frm = null;
public static b4j.example.customlistview _clvlistacampos = null;
public static b4j.docU.b4xdialog _dialog = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.docU.jamtableviewclvdragger _dragger = null;
public static anywheresoftware.b4j.objects.FileChooserWrapper _filechooser = null;
public static String _currentfile = "";
public static String _currentfilestring = "";
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cmbtheme = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtid = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbocampo = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtaliascampo = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipodato = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkcolumnatableview = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxesfecha = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxcampocalculado = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtencabezadocolumna = null;
public static b4j.docU.b4xplusminus _b4xplusminusancho = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtordencolumna = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkcolumnaocultable = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipocontrolfiltro = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxkeyid = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblordenkeyid = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxnonulo = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxconvalordefecto = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvalordefecto = null;
public static b4j.docU.b4xplusminus _b4xplusminusanchobordecelda = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cboalineacioncolumna = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipocontroledicion = null;
public static anywheresoftware.b4j.objects.CheckboxWrapper _chkboxesbooleano = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvalortruecampobooleano = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombrecampodialogosaux = null;
public static String _tipocontrolfiltro_textfield = "";
public static String _tipocontrolfiltro_combobox = "";
public static String _tipocontrolfiltro_checkbox = "";
public static String _tipocontrolfiltro_textfieldbutton = "";
public static boolean _cargandodatos = false;
public static anywheresoftware.b4j.objects.ButtonWrapper _btncargarlistacamposquerysql = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btncampostotext = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btntexttocampos = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlecampo = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitleencabezado = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitletipodato = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblinfo = null;
public static int _colactual = 0;
public static int _col1 = 0;
public static int _col2 = 0;
public static b4j.docU.preferencesdialog _prefdialog = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtipjrdc = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpuertojrdc = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcomandojrdc = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtparametrosjrdc = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttipoorigendatos = null;
public static anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlorigensql = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitletipoorigendatos = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitleipjrdc = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlepuertojrdc = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitlecomandojrdc = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbltitleparametrosjrdc = null;
public static b4j.docU.jamtableviewcamposbuilder._tipoorigendatos _datosorigendatos = null;
public static long _fechaultimamodificacion = 0L;
public static anywheresoftware.b4j.objects.ButtonWrapper _btneditarorigenjrdc = null;
public static anywheresoftware.b4a.objects.collections.List _lstprimarykey = null;
public static boolean _corrigiendochkboxesfecha = false;
public static boolean _corrigiendochkboxkeyid = false;
public static boolean _corrigiendochkboxesbooleano = false;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnvaloresestilodefecto = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnvaloresestilodefectotodos = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondoencabezados = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolortextoencabezados = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondoencabezados = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolortextoencabezados = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondoencabezados = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolortextoencabezados = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondopanelinfo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolortextopanelinfo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondopanelinfo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondopanelinfo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolortextopanelinfo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolortextopanelinfo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolortexto = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorborde = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondofilasimpares = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondofilaspares = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondofilasimpares = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondofilaspares = null;
public static anywheresoftware.b4j.objects.LabelWrapper _resetcolorfondofilasimpares = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblresetcolorfondofilaspares = null;
public static b4j.docU.bccolorpicker _bccolorpickerjamtableview = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondoencabezadocolumna = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondoencabezadocolumna = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondoencabezadocolumna = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblcolortextoencabezadocolumna = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolortextoencabezadocolumna = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolortextoencabezadocolumna = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolortexto = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorborde = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorborde = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolortexto = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btnayudacolorcontrastebordeseleccion = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lblcontrastefondovsbordeseleccionok = null;
public static boolean _mmodosnap = false;
public static int _offsetanterior = 0;
public static int _primerpanelvisibleanterior = 0;
public static boolean _scrollingdown = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper _btnbuscaraliascampo = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper _btneditarencabezadocolumna = null;
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
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static String  _show(String _rutaficherojsonjamtableview) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_rutaficherojsonjamtableview}));}
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.object.JavaObject _joclvdatosscrollpane = null;
RDebugUtils.currentLine=203489280;
 //BA.debugLineNum = 203489280;BA.debugLine="Sub Show(RutaFicheroJSONjamTableView As String)";
RDebugUtils.currentLine=203489283;
 //BA.debugLineNum = 203489283;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(\"\",\"\",\"\",\"";
_datosorigendatos = _createtipoorigendatos("","","","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=203489284;
 //BA.debugLineNum = 203489284;BA.debugLine="FechaUltimaModificacion=-1";
_fechaultimamodificacion = (long) (-1);
RDebugUtils.currentLine=203489286;
 //BA.debugLineNum = 203489286;BA.debugLine="If frm.IsInitialized=False Then";
if (_frm.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=203489287;
 //BA.debugLineNum = 203489287;BA.debugLine="Col2=0XFF696969";
_col2 = ((int)0xff696969);
RDebugUtils.currentLine=203489289;
 //BA.debugLineNum = 203489289;BA.debugLine="Col1=0xFF424242";
_col1 = ((int)0xff424242);
RDebugUtils.currentLine=203489291;
 //BA.debugLineNum = 203489291;BA.debugLine="frm.Initialize(\"frm\",1024,768)";
_frm.Initialize(ba,"frm",1024,768);
RDebugUtils.currentLine=203489292;
 //BA.debugLineNum = 203489292;BA.debugLine="frm.RootPane.LoadLayout(\"scrCamposJAMTableViewBu";
_frm.getRootPane().LoadLayout(ba,"scrCamposJAMTableViewBuilder");
RDebugUtils.currentLine=203489293;
 //BA.debugLineNum = 203489293;BA.debugLine="clvListaCampos.DefaultTextColor = xui.Color_Whit";
_clvlistacampos._defaulttextcolor = _xui.Color_White;
RDebugUtils.currentLine=203489294;
 //BA.debugLineNum = 203489294;BA.debugLine="Dialog.Initialize(frm.RootPane)";
_dialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
RDebugUtils.currentLine=203489295;
 //BA.debugLineNum = 203489295;BA.debugLine="Dialog.Title = \"Campos Builder\"";
_dialog._title /*Object*/  = (Object)("Campos Builder");
RDebugUtils.currentLine=203489296;
 //BA.debugLineNum = 203489296;BA.debugLine="Dim n As Node = clvListaCampos.sv";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_clvlistacampos._sv.getObject()));
RDebugUtils.currentLine=203489297;
 //BA.debugLineNum = 203489297;BA.debugLine="n.StyleClasses.Add(\"b4xdialog\")";
_n.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=203489298;
 //BA.debugLineNum = 203489298;BA.debugLine="Log(\"pnlOrigenSQL.IsInitialized: \" & pnlOrigenSQ";
anywheresoftware.b4a.keywords.Common.LogImpl("9203489298","pnlOrigenSQL.IsInitialized: "+BA.ObjectToString(_pnlorigensql.IsInitialized()),0);
RDebugUtils.currentLine=203489299;
 //BA.debugLineNum = 203489299;BA.debugLine="pnlOrigenSQL.Visible=False";
_pnlorigensql.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=203489303;
 //BA.debugLineNum = 203489303;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=clvListaC";
_joclvdatosscrollpane = new anywheresoftware.b4j.object.JavaObject();
_joclvdatosscrollpane = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_clvlistacampos._sv.getObject()));
RDebugUtils.currentLine=203489304;
 //BA.debugLineNum = 203489304;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",A";
_joclvdatosscrollpane.RunMethod("setHbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=203489305;
 //BA.debugLineNum = 203489305;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",A";
_joclvdatosscrollpane.RunMethod("setVbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=203489307;
 //BA.debugLineNum = 203489307;BA.debugLine="dragger.Initialize(clvListaCampos)";
_dragger._initialize /*String*/ (null,ba,_clvlistacampos);
RDebugUtils.currentLine=203489310;
 //BA.debugLineNum = 203489310;BA.debugLine="FileChooser.Initialize";
_filechooser.Initialize();
RDebugUtils.currentLine=203489312;
 //BA.debugLineNum = 203489312;BA.debugLine="FileChooser.SetExtensionFilter(\"JSON\", Array(\"*.";
_filechooser.SetExtensionFilter("JSON",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*.json")}));
RDebugUtils.currentLine=203489316;
 //BA.debugLineNum = 203489316;BA.debugLine="cmbTheme.SelectedIndex = 0";
_cmbtheme.setSelectedIndex((int) (0));
 };
RDebugUtils.currentLine=203489321;
 //BA.debugLineNum = 203489321;BA.debugLine="CurrentFile=\"\"";
_currentfile = "";
RDebugUtils.currentLine=203489322;
 //BA.debugLineNum = 203489322;BA.debugLine="SetFormMaximized(frm)";
_setformmaximized(_frm);
RDebugUtils.currentLine=203489323;
 //BA.debugLineNum = 203489323;BA.debugLine="clvListaCampos.Clear";
_clvlistacampos._clear();
RDebugUtils.currentLine=203489324;
 //BA.debugLineNum = 203489324;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=203489325;
 //BA.debugLineNum = 203489325;BA.debugLine="frm.Show";
_frm.Show();
RDebugUtils.currentLine=203489327;
 //BA.debugLineNum = 203489327;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
_frm.setTitle(("CamposBuilder ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_version))+")"));
RDebugUtils.currentLine=203489328;
 //BA.debugLineNum = 203489328;BA.debugLine="Inicio(RutaFicheroJSONjamTableView)";
_inicio(_rutaficherojsonjamtableview);
RDebugUtils.currentLine=203489329;
 //BA.debugLineNum = 203489329;BA.debugLine="End Sub";
return "";
}
public static void  _additem(anywheresoftware.b4a.objects.collections.Map _minfo) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "additem", true))
	 {Debug.delegate(ba, "additem", new Object[] {_minfo}); return;}
ResumableSub_AddItem rsub = new ResumableSub_AddItem(null,_minfo);
rsub.resume(ba, null);
}
public static class ResumableSub_AddItem extends BA.ResumableSub {
public ResumableSub_AddItem(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4a.objects.collections.Map _minfo) {
this.parent = parent;
this._minfo = _minfo;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4a.objects.collections.Map _minfo;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
String _scolorborde = "";
String _scolorfondo = "";
String _scolortexto = "";
String _scolortextoencabezadocolumna = "";
String _scolorfondoencabezadocolumna = "";
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
anywheresoftware.b4j.object.JavaObject _nativeme = null;
double _indicecontraste = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=204603394;
 //BA.debugLineNum = 204603394;BA.debugLine="If ColActual=Col1 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._colactual==parent._col1) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=204603395;
 //BA.debugLineNum = 204603395;BA.debugLine="ColActual=Col2";
parent._colactual = parent._col2;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=204603397;
 //BA.debugLineNum = 204603397;BA.debugLine="ColActual=Col1";
parent._colactual = parent._col1;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=204603400;
 //BA.debugLineNum = 204603400;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=204603401;
 //BA.debugLineNum = 204603401;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, clvListaCampos.AsV";
_pnl.SetLayoutAnimated((int) (0),0,0,parent._clvlistacampos._asview().getWidth(),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)));
RDebugUtils.currentLine=204603403;
 //BA.debugLineNum = 204603403;BA.debugLine="pnl.LoadLayout(\"scrItemCamposBuilder4\")";
_pnl.LoadLayout("scrItemCamposBuilder4",ba);
RDebugUtils.currentLine=204603404;
 //BA.debugLineNum = 204603404;BA.debugLine="pnl.Color=ColActual";
_pnl.setColor(parent._colactual);
RDebugUtils.currentLine=204603406;
 //BA.debugLineNum = 204603406;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue";
_clviv = new b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue();
RDebugUtils.currentLine=204603408;
 //BA.debugLineNum = 204603408;BA.debugLine="clvIV.txtID=txtID";
_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = parent._txtid;
RDebugUtils.currentLine=204603409;
 //BA.debugLineNum = 204603409;BA.debugLine="clvIV.B4XPlusMinusAncho=B4XPlusMinusAncho";
_clviv.B4XPlusMinusAncho /*b4j.docU.b4xplusminus*/  = parent._b4xplusminusancho;
RDebugUtils.currentLine=204603411;
 //BA.debugLineNum = 204603411;BA.debugLine="clvIV.chkboxKeyID=chkboxKeyID";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkboxkeyid;
RDebugUtils.currentLine=204603412;
 //BA.debugLineNum = 204603412;BA.debugLine="clvIV.lblOrdenKeyID=lblOrdenKeyID";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/  = parent._lblordenkeyid;
RDebugUtils.currentLine=204603413;
 //BA.debugLineNum = 204603413;BA.debugLine="clvIV.cboCampo=cboCampo";
_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = parent._cbocampo;
RDebugUtils.currentLine=204603414;
 //BA.debugLineNum = 204603414;BA.debugLine="clvIV.txtAliasCampo=txtAliasCampo";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = parent._txtaliascampo;
RDebugUtils.currentLine=204603415;
 //BA.debugLineNum = 204603415;BA.debugLine="clvIV.chkColumnaTableView=chkColumnaTableView";
_clviv.chkColumnaTableView /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkcolumnatableview;
RDebugUtils.currentLine=204603416;
 //BA.debugLineNum = 204603416;BA.debugLine="clvIV.chkColumnaOcultable=chkColumnaOcultable";
_clviv.chkColumnaOcultable /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkcolumnaocultable;
RDebugUtils.currentLine=204603417;
 //BA.debugLineNum = 204603417;BA.debugLine="clvIV.chkBoxCampoCalculado=chkBoxCampoCalculado";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkboxcampocalculado;
RDebugUtils.currentLine=204603418;
 //BA.debugLineNum = 204603418;BA.debugLine="clvIV.cboTipoControlFiltro=cboTipoControlFiltro";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = parent._cbotipocontrolfiltro;
RDebugUtils.currentLine=204603419;
 //BA.debugLineNum = 204603419;BA.debugLine="clvIV.txtNombreCampoDialogosAux=txtNombreCampoDia";
_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = parent._txtnombrecampodialogosaux;
RDebugUtils.currentLine=204603420;
 //BA.debugLineNum = 204603420;BA.debugLine="clvIV.cboTipoDato=cboTipoDato";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = parent._cbotipodato;
RDebugUtils.currentLine=204603421;
 //BA.debugLineNum = 204603421;BA.debugLine="clvIV.chkBoxEsFecha=chkBoxEsFecha";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkboxesfecha;
RDebugUtils.currentLine=204603422;
 //BA.debugLineNum = 204603422;BA.debugLine="clvIV.chkBoxEsBooleano=chkBoxEsBooleano";
_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkboxesbooleano;
RDebugUtils.currentLine=204603423;
 //BA.debugLineNum = 204603423;BA.debugLine="clvIV.txtValorTrueCampoBooleano=txtValorTrueCampo";
_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = parent._txtvalortruecampobooleano;
RDebugUtils.currentLine=204603424;
 //BA.debugLineNum = 204603424;BA.debugLine="clvIV.txtEncabezadoColumna=txtEncabezadoColumna";
_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = parent._txtencabezadocolumna;
RDebugUtils.currentLine=204603425;
 //BA.debugLineNum = 204603425;BA.debugLine="clvIV.txtOrdenColumna=txtOrdenColumna";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = parent._txtordencolumna;
RDebugUtils.currentLine=204603426;
 //BA.debugLineNum = 204603426;BA.debugLine="clvIV.cboAlineacionColumna=cboAlineacionColumna";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = parent._cboalineacioncolumna;
RDebugUtils.currentLine=204603427;
 //BA.debugLineNum = 204603427;BA.debugLine="clvIV.chkNoNulo=chkBoxNoNulo";
_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkboxnonulo;
RDebugUtils.currentLine=204603428;
 //BA.debugLineNum = 204603428;BA.debugLine="clvIV.chkBoxConValorDefecto=chkBoxConValorDefecto";
_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = parent._chkboxconvalordefecto;
RDebugUtils.currentLine=204603429;
 //BA.debugLineNum = 204603429;BA.debugLine="clvIV.txtValorDefecto=txtValorDefecto";
_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = parent._txtvalordefecto;
RDebugUtils.currentLine=204603430;
 //BA.debugLineNum = 204603430;BA.debugLine="clvIV.cboTipoControlEdicion=cboTipoControlEdicion";
_clviv.cboTipoControlEdicion /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = parent._cbotipocontroledicion;
RDebugUtils.currentLine=204603434;
 //BA.debugLineNum = 204603434;BA.debugLine="clvIV.lblColorBorde=lblColorBorde";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._lblcolorborde;
RDebugUtils.currentLine=204603436;
 //BA.debugLineNum = 204603436;BA.debugLine="clvIV.txtRGBColorBorde=txtRGBColorBorde";
_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._txtrgbcolorborde;
RDebugUtils.currentLine=204603437;
 //BA.debugLineNum = 204603437;BA.debugLine="clvIV.lblColorFondo=lblColorFondo";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._lblcolorfondo;
RDebugUtils.currentLine=204603439;
 //BA.debugLineNum = 204603439;BA.debugLine="clvIV.txtRGBColorFondo=txtRGBColorFondo";
_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._txtrgbcolorfondo;
RDebugUtils.currentLine=204603440;
 //BA.debugLineNum = 204603440;BA.debugLine="clvIV.lblColorTexto=lblColorTexto";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._lblcolortexto;
RDebugUtils.currentLine=204603442;
 //BA.debugLineNum = 204603442;BA.debugLine="clvIV.txtRGBColorTexto=txtRGBColorTexto";
_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._txtrgbcolortexto;
RDebugUtils.currentLine=204603443;
 //BA.debugLineNum = 204603443;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde=B4XPlusMinusAnchoBor";
_clviv.B4XPlusMinusAnchoBorde /*b4j.docU.b4xplusminus*/  = parent._b4xplusminusanchobordecelda;
RDebugUtils.currentLine=204603447;
 //BA.debugLineNum = 204603447;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna=lblColorFond";
_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._lblcolorfondoencabezadocolumna;
RDebugUtils.currentLine=204603448;
 //BA.debugLineNum = 204603448;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna=lblColorText";
_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._lblcolortextoencabezadocolumna;
RDebugUtils.currentLine=204603450;
 //BA.debugLineNum = 204603450;BA.debugLine="clvIV.txtrgbColorFondoEncabezadoColumna=txtRGBCol";
_clviv.txtRGBColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._txtrgbcolorfondoencabezadocolumna;
RDebugUtils.currentLine=204603451;
 //BA.debugLineNum = 204603451;BA.debugLine="clvIV.txtrgbColorTextoEncabezadoColumna=txtRGBCol";
_clviv.txtRGBColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = parent._txtrgbcolortextoencabezadocolumna;
RDebugUtils.currentLine=204603453;
 //BA.debugLineNum = 204603453;BA.debugLine="clvIV.txtID.Text=0";
_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=204603454;
 //BA.debugLineNum = 204603454;BA.debugLine="clvIV.cboCampo.Value=\"\"";
_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=204603455;
 //BA.debugLineNum = 204603455;BA.debugLine="clvIV.txtAliasCampo.text=\"\"";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=204603456;
 //BA.debugLineNum = 204603456;BA.debugLine="clvIV.chkColumnaTableView.Checked=True";
_clviv.chkColumnaTableView /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=204603457;
 //BA.debugLineNum = 204603457;BA.debugLine="clvIV.txtEncabezadoColumna.Text=\"\"";
_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=204603458;
 //BA.debugLineNum = 204603458;BA.debugLine="clvIV.txtOrdenColumna.Text=0";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=204603459;
 //BA.debugLineNum = 204603459;BA.debugLine="clvIV.chkColumnaOcultable.Checked=False";
_clviv.chkColumnaOcultable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=204603460;
 //BA.debugLineNum = 204603460;BA.debugLine="clvIV.cboTipoControlFiltro.Items.AddAll(Array As";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","TextField","ComboBox","CheckBox","TextFieldBtn"}));
RDebugUtils.currentLine=204603461;
 //BA.debugLineNum = 204603461;BA.debugLine="clvIV.cboTipoControlEdicion.Items.AddAll(Array As";
_clviv.cboTipoControlEdicion /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","TextField","ComboBox","CheckBox","TextFieldBtn"}));
RDebugUtils.currentLine=204603462;
 //BA.debugLineNum = 204603462;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=204603463;
 //BA.debugLineNum = 204603463;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=\"\"";
_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=204603464;
 //BA.debugLineNum = 204603464;BA.debugLine="clvIV.cboTipoDato.Items.AddAll(Array As String(\"\"";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","TEXT","REAL","INTEGER","BLOB"}));
RDebugUtils.currentLine=204603465;
 //BA.debugLineNum = 204603465;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=204603466;
 //BA.debugLineNum = 204603466;BA.debugLine="clvIV.B4XPlusMinusAncho.SetNumericRange(0,1000,10";
_clviv.B4XPlusMinusAncho /*b4j.docU.b4xplusminus*/ ._setnumericrange /*String*/ (null,0,1000,10);
RDebugUtils.currentLine=204603467;
 //BA.debugLineNum = 204603467;BA.debugLine="clvIV.B4XPlusMinusAncho.SelectedValue=100";
_clviv.B4XPlusMinusAncho /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,(Object)(100));
RDebugUtils.currentLine=204603470;
 //BA.debugLineNum = 204603470;BA.debugLine="clvIV.chkboxKeyID.Checked=False";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=204603471;
 //BA.debugLineNum = 204603471;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=204603472;
 //BA.debugLineNum = 204603472;BA.debugLine="clvIV.chkBoxEsFecha.Checked=False";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=204603473;
 //BA.debugLineNum = 204603473;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=False";
_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=204603474;
 //BA.debugLineNum = 204603474;BA.debugLine="clvIV.txtValorTrueCampoBooleano.Text=\"\"";
_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=204603475;
 //BA.debugLineNum = 204603475;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=False";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=204603476;
 //BA.debugLineNum = 204603476;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SetNumericRange(0.5,";
_clviv.B4XPlusMinusAnchoBorde /*b4j.docU.b4xplusminus*/ ._setnumericrange /*String*/ (null,0.5,3.0,0.5);
RDebugUtils.currentLine=204603477;
 //BA.debugLineNum = 204603477;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SelectedValue=0.5";
_clviv.B4XPlusMinusAnchoBorde /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,(Object)(0.5));
RDebugUtils.currentLine=204603482;
 //BA.debugLineNum = 204603482;BA.debugLine="clvIV.lblColorBorde.Color=0xFF00BFFF";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff00bfff));
RDebugUtils.currentLine=204603484;
 //BA.debugLineNum = 204603484;BA.debugLine="clvIV.txtRGBColorBorde.Text=GetCssColorStringFrom";
_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(((int)0xff00bfff)));
RDebugUtils.currentLine=204603485;
 //BA.debugLineNum = 204603485;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x00ffffff));
RDebugUtils.currentLine=204603487;
 //BA.debugLineNum = 204603487;BA.debugLine="clvIV.txtRGBColorFondo.Text=\"transparent\"";
_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("transparent");
RDebugUtils.currentLine=204603488;
 //BA.debugLineNum = 204603488;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff000000));
RDebugUtils.currentLine=204603490;
 //BA.debugLineNum = 204603490;BA.debugLine="clvIV.txtRGBColorTexto.Text=GetCssColorStringFrom";
_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(((int)0xff000000)));
RDebugUtils.currentLine=204603494;
 //BA.debugLineNum = 204603494;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna.Color=lblCol";
_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._lblcolorfondoencabezados.getColor());
RDebugUtils.currentLine=204603495;
 //BA.debugLineNum = 204603495;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna.Color=lblCol";
_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._lblcolortextoencabezados.getColor());
RDebugUtils.currentLine=204603496;
 //BA.debugLineNum = 204603496;BA.debugLine="clvIV.txtRGBColorFondoEncabezadoColumna.Text=txtR";
_clviv.txtRGBColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent._txtrgbcolorfondoencabezados.getText());
RDebugUtils.currentLine=204603497;
 //BA.debugLineNum = 204603497;BA.debugLine="clvIV.txtRGBColorTextoEncabezadoColumna.Text=txtR";
_clviv.txtRGBColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent._txtrgbcolortextoencabezados.getText());
RDebugUtils.currentLine=204603501;
 //BA.debugLineNum = 204603501;BA.debugLine="clvIV.cboAlineacionColumna.Items.AddAll(Array As";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"CENTER","CENTER-LEFT","CENTER-RIGHT"}));
RDebugUtils.currentLine=204603502;
 //BA.debugLineNum = 204603502;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-LEFT\"";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)("CENTER-LEFT"));
RDebugUtils.currentLine=204603504;
 //BA.debugLineNum = 204603504;BA.debugLine="clvIV.chkNoNulo.Checked=False";
_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=204603505;
 //BA.debugLineNum = 204603505;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=False";
_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=204603506;
 //BA.debugLineNum = 204603506;BA.debugLine="clvIV.txtValorDefecto.Text=\"\"";
_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=204603513;
 //BA.debugLineNum = 204603513;BA.debugLine="If mInfo.IsInitialized Then";
if (true) break;

case 7:
//if
this.state = 62;
if (_minfo.IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=204603514;
 //BA.debugLineNum = 204603514;BA.debugLine="clvIV.cboCampo.Value=mInfo.GetDefault(\"Campo\",\"\"";
_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("Campo"),(Object)("")));
RDebugUtils.currentLine=204603515;
 //BA.debugLineNum = 204603515;BA.debugLine="If False=mInfo.GetDefault(\"CampoCalculado\",False";
if (true) break;

case 10:
//if
this.state = 21;
if (anywheresoftware.b4a.keywords.Common.False==BA.ObjectToBoolean(_minfo.GetDefault((Object)("CampoCalculado"),(Object)(anywheresoftware.b4a.keywords.Common.False)))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=204603516;
 //BA.debugLineNum = 204603516;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("AliasCampo"),_minfo.GetDefault((Object)("Campo"),(Object)("")))));
RDebugUtils.currentLine=204603517;
 //BA.debugLineNum = 204603517;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then clvIV.txtAl";
if (true) break;

case 13:
//if
this.state = 18;
if ((_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
if (true) break;

case 18:
//C
this.state = 21;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=204603519;
 //BA.debugLineNum = 204603519;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("AliasCampo"),(Object)(""))));
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=204603522;
 //BA.debugLineNum = 204603522;BA.debugLine="clvIV.chkColumnaTableView.Checked=mInfo.GetDefau";
_clviv.chkColumnaTableView /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("ColumnaTableView"),(Object)(anywheresoftware.b4a.keywords.Common.True))));
RDebugUtils.currentLine=204603523;
 //BA.debugLineNum = 204603523;BA.debugLine="clvIV.chkColumnaOcultable.Checked=mInfo.GetDefau";
_clviv.chkColumnaOcultable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("ColumnaOcultable"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=204603524;
 //BA.debugLineNum = 204603524;BA.debugLine="clvIV.txtEncabezadoColumna.text=mInfo.GetDefault";
_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("EncabezadoColumna"),_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())));
RDebugUtils.currentLine=204603525;
 //BA.debugLineNum = 204603525;BA.debugLine="clvIV.B4XPlusMinusAncho.SelectedValue=mInfo.GetD";
_clviv.B4XPlusMinusAncho /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,_minfo.GetDefault((Object)("AnchoColumna"),(Object)(100)));
RDebugUtils.currentLine=204603527;
 //BA.debugLineNum = 204603527;BA.debugLine="clvIV.lblOrdenKeyID.Text=mInfo.GetDefault(\"KeyID";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("KeyID"),(Object)(0))));
RDebugUtils.currentLine=204603528;
 //BA.debugLineNum = 204603528;BA.debugLine="clvIV.chkboxKeyID.Checked=0<>mInfo.GetDefault(\"K";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(0!=(double)(BA.ObjectToNumber(_minfo.GetDefault((Object)("KeyID"),(Object)(0)))));
RDebugUtils.currentLine=204603529;
 //BA.debugLineNum = 204603529;BA.debugLine="If 0<>mInfo.GetDefault(\"KeyID\",0) Then lstPrimar";
if (true) break;

case 22:
//if
this.state = 27;
if (0!=(double)(BA.ObjectToNumber(_minfo.GetDefault((Object)("KeyID"),(Object)(0))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
parent._lstprimarykey.Add(_minfo.GetDefault((Object)("Campo"),(Object)("")));
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=204603530;
 //BA.debugLineNum = 204603530;BA.debugLine="clvIV.cboTipoControlFiltro.Value=mInfo.GetDefaul";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("TipoControlFiltro"),(Object)("")));
RDebugUtils.currentLine=204603534;
 //BA.debugLineNum = 204603534;BA.debugLine="If mInfo.GetDefault(\"NombreCampoDialogosAux\",\"\"";
if (true) break;

case 28:
//if
this.state = 33;
if ((_minfo.GetDefault((Object)("NombreCampoDialogosAux"),(Object)(""))).equals((Object)(""))) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
RDebugUtils.currentLine=204603535;
 //BA.debugLineNum = 204603535;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=clvIV.txt";
_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=204603537;
 //BA.debugLineNum = 204603537;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=mInfo.Get";
_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("NombreCampoDialogosAux"),(Object)(""))));
 if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=204603540;
 //BA.debugLineNum = 204603540;BA.debugLine="clvIV.cboTipoControlEdicion.Value=mInfo.GetDefau";
_clviv.cboTipoControlEdicion /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("TipoControlEdicion"),(Object)("")));
RDebugUtils.currentLine=204603541;
 //BA.debugLineNum = 204603541;BA.debugLine="clvIV.cboTipoDato.Value=mInfo.GetDefault(\"TipoDa";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("TipoDato"),(Object)("")));
RDebugUtils.currentLine=204603542;
 //BA.debugLineNum = 204603542;BA.debugLine="If clvIV.cboTipoDato.Value=\"REAL\" Or clvIV.cboTi";
if (true) break;

case 34:
//if
this.state = 39;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("REAL")) || (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) && (_minfo.GetDefault((Object)("AlineacionColumna"),(Object)(""))).equals((Object)(""))) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
RDebugUtils.currentLine=204603543;
 //BA.debugLineNum = 204603543;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-RIGHT\"";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)("CENTER-RIGHT"));
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=204603545;
 //BA.debugLineNum = 204603545;BA.debugLine="clvIV.cboAlineacionColumna.Value=mInfo.GetDefau";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("AlineacionColumna"),(Object)("CENTER-LEFT")));
 if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=204603547;
 //BA.debugLineNum = 204603547;BA.debugLine="clvIV.chkBoxEsFecha.Checked=mInfo.GetDefault(\"Es";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("EsFecha"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=204603548;
 //BA.debugLineNum = 204603548;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=mInfo.GetDefault(";
_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("EsBooleano"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=204603549;
 //BA.debugLineNum = 204603549;BA.debugLine="clvIV.txtValorTrueCampoBooleano.text=mInfo.GetDe";
_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("ValorTrueCampoBooleano"),(Object)(""))));
RDebugUtils.currentLine=204603550;
 //BA.debugLineNum = 204603550;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=mInfo.GetDefa";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("CampoCalculado"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=204603551;
 //BA.debugLineNum = 204603551;BA.debugLine="clvIV.chkNoNulo.Checked=mInfo.GetDefault(\"NoNulo";
_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("NoNulo"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=204603552;
 //BA.debugLineNum = 204603552;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=mInfo.GetDef";
_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("ConValorDefecto"),(Object)(anywheresoftware.b4a.keywords.Common.False))));
RDebugUtils.currentLine=204603553;
 //BA.debugLineNum = 204603553;BA.debugLine="clvIV.txtValorDefecto.Text=mInfo.GetDefault(\"Val";
_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("ValorDefecto"),(Object)(""))));
RDebugUtils.currentLine=204603554;
 //BA.debugLineNum = 204603554;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SelectedValue=mInfo";
_clviv.B4XPlusMinusAnchoBorde /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,_minfo.GetDefault((Object)("AnchoBorde"),(Object)(1)));
RDebugUtils.currentLine=204603566;
 //BA.debugLineNum = 204603566;BA.debugLine="Dim sColorBorde As String=mInfo.GetDefault(\"Colo";
_scolorborde = BA.ObjectToString(_minfo.GetDefault((Object)("ColorBordeCeldaSeleccionada"),(Object)("#00BFFF")));
RDebugUtils.currentLine=204603567;
 //BA.debugLineNum = 204603567;BA.debugLine="Dim sColorFondo As String=mInfo.GetDefault(\"Colo";
_scolorfondo = BA.ObjectToString(_minfo.GetDefault((Object)("ColorFondo"),(Object)("transparent")));
RDebugUtils.currentLine=204603568;
 //BA.debugLineNum = 204603568;BA.debugLine="Dim sColorTexto As String=mInfo.GetDefault(\"Colo";
_scolortexto = BA.ObjectToString(_minfo.GetDefault((Object)("ColorTexto"),(Object)("black")));
RDebugUtils.currentLine=204603570;
 //BA.debugLineNum = 204603570;BA.debugLine="Dim sColorTextoEncabezadoColumna As String=mInfo";
_scolortextoencabezadocolumna = BA.ObjectToString(_minfo.GetDefault((Object)("ColorTextoEncabezadoColumna"),(Object)(parent._txtrgbcolortextoencabezados.getText())));
RDebugUtils.currentLine=204603571;
 //BA.debugLineNum = 204603571;BA.debugLine="Dim sColorFondoEncabezadoColumna As String=mInfo";
_scolorfondoencabezadocolumna = BA.ObjectToString(_minfo.GetDefault((Object)("ColorFondoEncabezadoColumna"),(Object)(parent._txtrgbcolorfondoencabezados.getText())));
RDebugUtils.currentLine=204603573;
 //BA.debugLineNum = 204603573;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=204603578;
 //BA.debugLineNum = 204603578;BA.debugLine="clvIV.txtRGBColorBorde.Text=sColorBorde";
_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_scolorborde);
RDebugUtils.currentLine=204603579;
 //BA.debugLineNum = 204603579;BA.debugLine="clvIV.txtRGBColorFondo.Text=sColorFondo";
_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_scolorfondo);
RDebugUtils.currentLine=204603580;
 //BA.debugLineNum = 204603580;BA.debugLine="clvIV.txtRGBColorTexto.Text=sColorTexto";
_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_scolortexto);
RDebugUtils.currentLine=204603582;
 //BA.debugLineNum = 204603582;BA.debugLine="clvIV.txtRGBColorTextoEncabezadoColumna.text=sCo";
_clviv.txtRGBColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_scolortextoencabezadocolumna);
RDebugUtils.currentLine=204603583;
 //BA.debugLineNum = 204603583;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna.color=bc.In";
_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_scolortextoencabezadocolumna.replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=204603584;
 //BA.debugLineNum = 204603584;BA.debugLine="clvIV.txtRGBColorFondoEncabezadoColumna.text=sCo";
_clviv.txtRGBColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_scolorfondoencabezadocolumna);
RDebugUtils.currentLine=204603585;
 //BA.debugLineNum = 204603585;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna.color=bc.In";
_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_scolorfondoencabezadocolumna.replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=204603590;
 //BA.debugLineNum = 204603590;BA.debugLine="If sColorBorde=\"transparent\" Then";
if (true) break;

case 40:
//if
this.state = 45;
if ((_scolorborde).equals("transparent")) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
RDebugUtils.currentLine=204603592;
 //BA.debugLineNum = 204603592;BA.debugLine="clvIV.lblColorBorde.Color=0x00FFFFFF";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x00ffffff));
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=204603596;
 //BA.debugLineNum = 204603596;BA.debugLine="clvIV.lblColorBorde.Color=bc.IntsFromBytes(bc.H";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_scolorborde.replace("#","")))[(int) (0)]);
 if (true) break;
;
RDebugUtils.currentLine=204603599;
 //BA.debugLineNum = 204603599;BA.debugLine="If sColorFondo=\"transparent\" Then";

case 45:
//if
this.state = 50;
if ((_scolorfondo).equals("transparent")) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=204603601;
 //BA.debugLineNum = 204603601;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x00ffffff));
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=204603605;
 //BA.debugLineNum = 204603605;BA.debugLine="clvIV.lblColorFondo.Color=bc.IntsFromBytes(bc.H";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_scolorfondo.replace("#","")))[(int) (0)]);
 if (true) break;
;
RDebugUtils.currentLine=204603608;
 //BA.debugLineNum = 204603608;BA.debugLine="If sColorTexto=\"transparent\" Then";

case 50:
//if
this.state = 61;
if ((_scolortexto).equals("transparent")) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 61;
RDebugUtils.currentLine=204603610;
 //BA.debugLineNum = 204603610;BA.debugLine="clvIV.lblColorTexto.Color=0x00FFFFFF";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x00ffffff));
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=204603614;
 //BA.debugLineNum = 204603614;BA.debugLine="If sColorTexto=\"black\" Then";
if (true) break;

case 55:
//if
this.state = 60;
if ((_scolortexto).equals("black")) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
RDebugUtils.currentLine=204603616;
 //BA.debugLineNum = 204603616;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff000000));
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=204603622;
 //BA.debugLineNum = 204603622;BA.debugLine="clvIV.lblColorTexto.Color=bc.IntsFromBytes(bc.";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_scolortexto.replace("#","")))[(int) (0)]);
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 62;
;
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=204603654;
 //BA.debugLineNum = 204603654;BA.debugLine="clvIV.chkBoxCampoCalculado.Enabled= True";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=204603658;
 //BA.debugLineNum = 204603658;BA.debugLine="txtValorDefecto.Visible= clvIV.chkBoxConValorDefe";
parent._txtvalordefecto.setVisible(_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked());
RDebugUtils.currentLine=204603661;
 //BA.debugLineNum = 204603661;BA.debugLine="clvListaCampos.Add(pnl, clvIV)";
parent._clvlistacampos._add(_pnl,(Object)(_clviv));
RDebugUtils.currentLine=204603666;
 //BA.debugLineNum = 204603666;BA.debugLine="If clvIV.chkColumnaTableView.Checked Then";
if (true) break;

case 63:
//if
this.state = 80;
if (_clviv.chkColumnaTableView /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 65;
}else {
this.state = 79;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=204603668;
 //BA.debugLineNum = 204603668;BA.debugLine="Dim NativeMe As JavaObject=Me";
_nativeme = new anywheresoftware.b4j.object.JavaObject();
_nativeme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(jamtableviewcamposbuilder.getObject()));
RDebugUtils.currentLine=204603669;
 //BA.debugLineNum = 204603669;BA.debugLine="Dim sColorFondo As String=clvIV.txtRGBColorFondo";
_scolorfondo = _clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=204603670;
 //BA.debugLineNum = 204603670;BA.debugLine="Select sColorFondo";
if (true) break;

case 66:
//select
this.state = 71;
switch (BA.switchObjectToInt(_scolorfondo,"transparent","black")) {
case 0: {
this.state = 68;
if (true) break;
}
case 1: {
this.state = 70;
if (true) break;
}
}
if (true) break;

case 68:
//C
this.state = 71;
RDebugUtils.currentLine=204603672;
 //BA.debugLineNum = 204603672;BA.debugLine="sColorFondo=\"#ffffffff\"";
_scolorfondo = "#ffffffff";
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=204603674;
 //BA.debugLineNum = 204603674;BA.debugLine="sColorFondo=\"#00000000\"";
_scolorfondo = "#00000000";
 if (true) break;

case 71:
//C
this.state = 72;
;
RDebugUtils.currentLine=204603676;
 //BA.debugLineNum = 204603676;BA.debugLine="Dim sColorBorde As String=clvIV.txtRGBColorBorde";
_scolorborde = _clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText();
RDebugUtils.currentLine=204603677;
 //BA.debugLineNum = 204603677;BA.debugLine="Select sColorBorde";
if (true) break;

case 72:
//select
this.state = 77;
switch (BA.switchObjectToInt(_scolorborde,"transparent","black")) {
case 0: {
this.state = 74;
if (true) break;
}
case 1: {
this.state = 76;
if (true) break;
}
}
if (true) break;

case 74:
//C
this.state = 77;
RDebugUtils.currentLine=204603679;
 //BA.debugLineNum = 204603679;BA.debugLine="sColorBorde=\"#ffffffff\"";
_scolorborde = "#ffffffff";
 if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=204603681;
 //BA.debugLineNum = 204603681;BA.debugLine="sColorBorde=\"#00000000\"";
_scolorborde = "#00000000";
 if (true) break;

case 77:
//C
this.state = 80;
;
RDebugUtils.currentLine=204603683;
 //BA.debugLineNum = 204603683;BA.debugLine="Dim IndiceContraste As Double=NativeMe.RunMethod";
_indicecontraste = (double)(BA.ObjectToNumber(_nativeme.RunMethod("DistanceLuminosityColors",new Object[]{(Object)(_scolorfondo),(Object)(_scolorborde)})));
RDebugUtils.currentLine=204603684;
 //BA.debugLineNum = 204603684;BA.debugLine="lblContrasteFondoVsBordeSeleccionOK.Text= Round2";
parent._lblcontrastefondovsbordeseleccionok.setText(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_indicecontraste,(int) (2))));
 if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=204603686;
 //BA.debugLineNum = 204603686;BA.debugLine="lblContrasteFondoVsBordeSeleccionOK.Text= 100";
parent._lblcontrastefondovsbordeseleccionok.setText(BA.NumberToString(100));
 if (true) break;

case 80:
//C
this.state = -1;
;
RDebugUtils.currentLine=204603688;
 //BA.debugLineNum = 204603688;BA.debugLine="lblContrasteFondoVsBordeSeleccionOK.TextColor=fx.";
parent._lblcontrastefondovsbordeseleccionok.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=204603689;
 //BA.debugLineNum = 204603689;BA.debugLine="Log(\"** Contraste \" & clvIV.txtAliasCampo.Text)";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603689","** Contraste "+_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),0);
RDebugUtils.currentLine=204603690;
 //BA.debugLineNum = 204603690;BA.debugLine="Log(\"clvIV.txtRGBColorFondo.Text \" & clvIV.txtRGB";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603690","clvIV.txtRGBColorFondo.Text "+_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),0);
RDebugUtils.currentLine=204603691;
 //BA.debugLineNum = 204603691;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603691","",0);
RDebugUtils.currentLine=204603692;
 //BA.debugLineNum = 204603692;BA.debugLine="Log(\"scolorfondo \" & sColorFondo)";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603692","scolorfondo "+_scolorfondo,0);
RDebugUtils.currentLine=204603693;
 //BA.debugLineNum = 204603693;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603693","",0);
RDebugUtils.currentLine=204603694;
 //BA.debugLineNum = 204603694;BA.debugLine="Log(\"scolorBorde \" & sColorBorde)";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603694","scolorBorde "+_scolorborde,0);
RDebugUtils.currentLine=204603695;
 //BA.debugLineNum = 204603695;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603695","",0);
RDebugUtils.currentLine=204603696;
 //BA.debugLineNum = 204603696;BA.debugLine="Log(\"IndiceContraste \" & IndiceContraste)";
anywheresoftware.b4a.keywords.Common.LogImpl("9204603696","IndiceContraste "+BA.NumberToString(_indicecontraste),0);
RDebugUtils.currentLine=204603698;
 //BA.debugLineNum = 204603698;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "additem"),(int) (0));
this.state = 81;
return;
case 81:
//C
this.state = -1;
;
RDebugUtils.currentLine=204603700;
 //BA.debugLineNum = 204603700;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _getcsscolorstringfromintcolor(int _value) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "getcsscolorstringfromintcolor", true))
	 {return ((String) Debug.delegate(ba, "getcsscolorstringfromintcolor", new Object[] {_value}));}
String _hexargb = "";
String _hexrgb = "";
RDebugUtils.currentLine=204210176;
 //BA.debugLineNum = 204210176;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
RDebugUtils.currentLine=204210177;
 //BA.debugLineNum = 204210177;BA.debugLine="Select value";
switch (BA.switchObjectToInt(_value,_fx.Colors.To32Bit(_fx.Colors.Transparent))) {
case 0: {
RDebugUtils.currentLine=204210179;
 //BA.debugLineNum = 204210179;BA.debugLine="Return \"transparent\"";
if (true) return "transparent";
 break; }
default: {
RDebugUtils.currentLine=204210183;
 //BA.debugLineNum = 204210183;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
_hexargb = _colortohex(_value);
RDebugUtils.currentLine=204210184;
 //BA.debugLineNum = 204210184;BA.debugLine="If HexARGB.Length=6 Then";
if (_hexargb.length()==6) { 
RDebugUtils.currentLine=204210185;
 //BA.debugLineNum = 204210185;BA.debugLine="Return \"#\" & HexARGB";
if (true) return "#"+_hexargb;
 }else {
RDebugUtils.currentLine=204210187;
 //BA.debugLineNum = 204210187;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
_hexrgb = _hexargb.substring((int) (2),(int) (8));
RDebugUtils.currentLine=204210188;
 //BA.debugLineNum = 204210188;BA.debugLine="Return \"#\" & HexRGB";
if (true) return "#"+_hexrgb;
 };
 break; }
}
;
RDebugUtils.currentLine=204210191;
 //BA.debugLineNum = 204210191;BA.debugLine="End Sub";
return "";
}
public static String  _additemsfromstring(String _s) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "additemsfromstring", true))
	 {return ((String) Debug.delegate(ba, "additemsfromstring", new Object[] {_s}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=205258752;
 //BA.debugLineNum = 205258752;BA.debugLine="private Sub AddItemsFromString (s As String)";
RDebugUtils.currentLine=205258754;
 //BA.debugLineNum = 205258754;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=205258755;
 //BA.debugLineNum = 205258755;BA.debugLine="parser.Initialize(s)";
_parser.Initialize(_s);
RDebugUtils.currentLine=205258756;
 //BA.debugLineNum = 205258756;BA.debugLine="Dim m As Map = parser.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _parser.NextObject();
RDebugUtils.currentLine=205258757;
 //BA.debugLineNum = 205258757;BA.debugLine="FechaUltimaModificacion=m.getdefault(\"FechaUltima";
_fechaultimamodificacion = BA.ObjectToLongNumber(_m.GetDefault((Object)("FechaUltimaModificacion"),(Object)(-1)));
RDebugUtils.currentLine=205258758;
 //BA.debugLineNum = 205258758;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(m.Get(\"Tip";
_datosorigendatos = _createtipoorigendatos(BA.ObjectToString(_m.Get((Object)("TipoOrigenDatos"))),BA.ObjectToString(_m.Get((Object)("IpJRDC"))),BA.ObjectToString(_m.Get((Object)("PuertoJRDC"))),BA.ObjectToString(_m.Get((Object)("ComandoJRDC"))),BA.ObjectToString(_m.Get((Object)("ParametrosJRDC"))));
RDebugUtils.currentLine=205258759;
 //BA.debugLineNum = 205258759;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=205258761;
 //BA.debugLineNum = 205258761;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=205258763;
 //BA.debugLineNum = 205258763;BA.debugLine="txtRGBColorFondoEncabezados.Text=m.Getdefault(\"Co";
_txtrgbcolorfondoencabezados.setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoEncabezados"),(Object)("#004B55"))));
RDebugUtils.currentLine=205258764;
 //BA.debugLineNum = 205258764;BA.debugLine="If txtRGBColorFondoEncabezados.Text=\"transparent\"";
if ((_txtrgbcolorfondoencabezados.getText()).equals("transparent")) { 
RDebugUtils.currentLine=205258765;
 //BA.debugLineNum = 205258765;BA.debugLine="lblColorFondoEncabezados.Color=0";
_lblcolorfondoencabezados.setColor((int) (0));
 }else {
RDebugUtils.currentLine=205258768;
 //BA.debugLineNum = 205258768;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(";
_lblcolorfondoencabezados.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_txtrgbcolorfondoencabezados.getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=205258771;
 //BA.debugLineNum = 205258771;BA.debugLine="txtRGBColorTextoEncabezados.Text=m.Getdefault(\"Co";
_txtrgbcolortextoencabezados.setText(BA.ObjectToString(_m.GetDefault((Object)("ColorTextoEncabezados"),(Object)(_getcsscolorstringfromintcolor(_xui.Color_White)))));
RDebugUtils.currentLine=205258772;
 //BA.debugLineNum = 205258772;BA.debugLine="If txtRGBColorTextoEncabezados.text=\"transparent\"";
if ((_txtrgbcolortextoencabezados.getText()).equals("transparent")) { 
RDebugUtils.currentLine=205258773;
 //BA.debugLineNum = 205258773;BA.debugLine="lblColorTextoEncabezados.Color=0";
_lblcolortextoencabezados.setColor((int) (0));
 }else {
RDebugUtils.currentLine=205258776;
 //BA.debugLineNum = 205258776;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(";
_lblcolortextoencabezados.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_txtrgbcolortextoencabezados.getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=205258780;
 //BA.debugLineNum = 205258780;BA.debugLine="txtRGBColorFondoPanelInfo.Text=m.Getdefault(\"Colo";
_txtrgbcolorfondopanelinfo.setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoPanelInfo"),(Object)("#FFF8C3"))));
RDebugUtils.currentLine=205258781;
 //BA.debugLineNum = 205258781;BA.debugLine="If txtRGBColorFondoPanelInfo.Text=\"transparent\" T";
if ((_txtrgbcolorfondopanelinfo.getText()).equals("transparent")) { 
RDebugUtils.currentLine=205258782;
 //BA.debugLineNum = 205258782;BA.debugLine="lblColorFondoPanelInfo.Color=0";
_lblcolorfondopanelinfo.setColor((int) (0));
 }else {
RDebugUtils.currentLine=205258784;
 //BA.debugLineNum = 205258784;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc";
_lblcolorfondopanelinfo.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_txtrgbcolorfondopanelinfo.getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=205258787;
 //BA.debugLineNum = 205258787;BA.debugLine="txtRGBColorTextoPanelInfo.Text=m.Getdefault(\"Colo";
_txtrgbcolortextopanelinfo.setText(BA.ObjectToString(_m.GetDefault((Object)("ColorTextoPanelInfo"),(Object)(_getcsscolorstringfromintcolor(_xui.Color_Black)))));
RDebugUtils.currentLine=205258788;
 //BA.debugLineNum = 205258788;BA.debugLine="If txtRGBColorTextoPanelInfo.text=\"transparent\" T";
if ((_txtrgbcolortextopanelinfo.getText()).equals("transparent")) { 
RDebugUtils.currentLine=205258789;
 //BA.debugLineNum = 205258789;BA.debugLine="lblColorTextoPanelInfo.Color=0";
_lblcolortextopanelinfo.setColor((int) (0));
 }else {
RDebugUtils.currentLine=205258791;
 //BA.debugLineNum = 205258791;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc";
_lblcolortextopanelinfo.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_txtrgbcolortextopanelinfo.getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=205258794;
 //BA.debugLineNum = 205258794;BA.debugLine="txtRGBColorFondoFilasImpares.Text=m.Getdefault(\"C";
_txtrgbcolorfondofilasimpares.setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoFilasImpares"),(Object)(_getcsscolorstringfromintcolor(_xui.Color_White)))));
RDebugUtils.currentLine=205258795;
 //BA.debugLineNum = 205258795;BA.debugLine="If txtRGBColorFondoFilasImpares.Text=\"transparent";
if ((_txtrgbcolorfondofilasimpares.getText()).equals("transparent")) { 
RDebugUtils.currentLine=205258796;
 //BA.debugLineNum = 205258796;BA.debugLine="lblColorFondoFilasImpares.Color=0";
_lblcolorfondofilasimpares.setColor((int) (0));
 }else {
RDebugUtils.currentLine=205258799;
 //BA.debugLineNum = 205258799;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes";
_lblcolorfondofilasimpares.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_txtrgbcolorfondofilasimpares.getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=205258802;
 //BA.debugLineNum = 205258802;BA.debugLine="txtRGBColorFondoFilasPares.Text=m.Getdefault(\"Col";
_txtrgbcolorfondofilaspares.setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoFilasPares"),(Object)("#F1F1F1"))));
RDebugUtils.currentLine=205258803;
 //BA.debugLineNum = 205258803;BA.debugLine="If txtRGBColorFondoFilasPares.Text=\"transparent\"";
if ((_txtrgbcolorfondofilaspares.getText()).equals("transparent")) { 
RDebugUtils.currentLine=205258804;
 //BA.debugLineNum = 205258804;BA.debugLine="lblColorFondoFilasPares.Color=0";
_lblcolorfondofilaspares.setColor((int) (0));
 }else {
RDebugUtils.currentLine=205258807;
 //BA.debugLineNum = 205258807;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(b";
_lblcolorfondofilaspares.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+_txtrgbcolorfondofilaspares.getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=205258815;
 //BA.debugLineNum = 205258815;BA.debugLine="Dim Items As List = m.Get(\"Items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=205258816;
 //BA.debugLineNum = 205258816;BA.debugLine="For Each item As Map In Items";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group45 = _items;
final int groupLen45 = group45.getSize()
;int index45 = 0;
;
for (; index45 < groupLen45;index45++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group45.Get(index45)));
RDebugUtils.currentLine=205258818;
 //BA.debugLineNum = 205258818;BA.debugLine="AddItem(item)";
_additem(_item);
 }
};
RDebugUtils.currentLine=205258823;
 //BA.debugLineNum = 205258823;BA.debugLine="CallSubDelayed(Me,\"AddItemsFromString_Completed\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,jamtableviewcamposbuilder.getObject(),"AddItemsFromString_Completed");
RDebugUtils.currentLine=205258824;
 //BA.debugLineNum = 205258824;BA.debugLine="End Sub";
return "";
}
public static b4j.docU.jamtableviewcamposbuilder._tipoorigendatos  _createtipoorigendatos(String _tipoorigendatos,String _ipjrdc,String _puertojrdc,String _comandojrdc,String _parametrosjrdc) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "createtipoorigendatos", true))
	 {return ((b4j.docU.jamtableviewcamposbuilder._tipoorigendatos) Debug.delegate(ba, "createtipoorigendatos", new Object[] {_tipoorigendatos,_ipjrdc,_puertojrdc,_comandojrdc,_parametrosjrdc}));}
b4j.docU.jamtableviewcamposbuilder._tipoorigendatos _t1 = null;
RDebugUtils.currentLine=207224832;
 //BA.debugLineNum = 207224832;BA.debugLine="private Sub CreateTipoOrigenDatos (TipoOrigenDatos";
RDebugUtils.currentLine=207224833;
 //BA.debugLineNum = 207224833;BA.debugLine="Dim t1 As TipoOrigenDatos";
_t1 = new b4j.docU.jamtableviewcamposbuilder._tipoorigendatos();
RDebugUtils.currentLine=207224834;
 //BA.debugLineNum = 207224834;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=207224835;
 //BA.debugLineNum = 207224835;BA.debugLine="t1.TipoOrigenDatos = TipoOrigenDatos";
_t1.TipoOrigenDatos /*String*/  = _tipoorigendatos;
RDebugUtils.currentLine=207224836;
 //BA.debugLineNum = 207224836;BA.debugLine="t1.IpJRDC = IpJRDC";
_t1.IpJRDC /*String*/  = _ipjrdc;
RDebugUtils.currentLine=207224837;
 //BA.debugLineNum = 207224837;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
_t1.PuertoJRDC /*String*/  = _puertojrdc;
RDebugUtils.currentLine=207224838;
 //BA.debugLineNum = 207224838;BA.debugLine="t1.ComandoJRDC = ComandoJRDC";
_t1.ComandoJRDC /*String*/  = _comandojrdc;
RDebugUtils.currentLine=207224839;
 //BA.debugLineNum = 207224839;BA.debugLine="t1.ParametrosJRDC = ParametrosJRDC";
_t1.ParametrosJRDC /*String*/  = _parametrosjrdc;
RDebugUtils.currentLine=207224840;
 //BA.debugLineNum = 207224840;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=207224841;
 //BA.debugLineNum = 207224841;BA.debugLine="End Sub";
return null;
}
public static String  _mostrardatosorigendatos() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mostrardatosorigendatos", true))
	 {return ((String) Debug.delegate(ba, "mostrardatosorigendatos", null));}
String _paramtext = "";
RDebugUtils.currentLine=205520896;
 //BA.debugLineNum = 205520896;BA.debugLine="private Sub MostrarDatosOrigenDatos";
RDebugUtils.currentLine=205520897;
 //BA.debugLineNum = 205520897;BA.debugLine="txtTipoOrigenDatos.Text=DatosOrigenDatos.TipoOrig";
_txttipoorigendatos.setText(_datosorigendatos.TipoOrigenDatos /*String*/ );
RDebugUtils.currentLine=205520898;
 //BA.debugLineNum = 205520898;BA.debugLine="txtIpJRDC.Text=DatosOrigenDatos.IpJRDC";
_txtipjrdc.setText(_datosorigendatos.IpJRDC /*String*/ );
RDebugUtils.currentLine=205520899;
 //BA.debugLineNum = 205520899;BA.debugLine="txtPuertoJRDC.Text=DatosOrigenDatos.PuertoJRDC";
_txtpuertojrdc.setText(_datosorigendatos.PuertoJRDC /*String*/ );
RDebugUtils.currentLine=205520900;
 //BA.debugLineNum = 205520900;BA.debugLine="txtComandoJRDC.Text=DatosOrigenDatos.ComandoJRDC";
_txtcomandojrdc.setText(_datosorigendatos.ComandoJRDC /*String*/ );
RDebugUtils.currentLine=205520901;
 //BA.debugLineNum = 205520901;BA.debugLine="Dim paramText As String=DatosOrigenDatos.Parametr";
_paramtext = _datosorigendatos.ParametrosJRDC /*String*/ ;
RDebugUtils.currentLine=205520902;
 //BA.debugLineNum = 205520902;BA.debugLine="txtParametrosJRDC.Text=paramText.Trim";
_txtparametrosjrdc.setText(_paramtext.trim());
RDebugUtils.currentLine=205520903;
 //BA.debugLineNum = 205520903;BA.debugLine="pnlOrigenSQL.Visible=True";
_pnlorigensql.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205520904;
 //BA.debugLineNum = 205520904;BA.debugLine="End Sub";
return "";
}
public static String  _addkeypressedlistener() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "addkeypressedlistener", true))
	 {return ((String) Debug.delegate(ba, "addkeypressedlistener", null));}
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=203882496;
 //BA.debugLineNum = 203882496;BA.debugLine="private Sub AddKeyPressedListener";
RDebugUtils.currentLine=203882497;
 //BA.debugLineNum = 203882497;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=203882498;
 //BA.debugLineNum = 203882498;BA.debugLine="r.Target = frm.RootPane";
_r.Target = (Object)(_frm.getRootPane().getObject());
RDebugUtils.currentLine=203882499;
 //BA.debugLineNum = 203882499;BA.debugLine="r.AddEventHandler(\"keypressed\", \"javafx.scene.inp";
_r.AddEventHandler(ba,"keypressed","javafx.scene.input.KeyEvent.KEY_PRESSED");
RDebugUtils.currentLine=203882500;
 //BA.debugLineNum = 203882500;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _asjo(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "asjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=203948032;
 //BA.debugLineNum = 203948032;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=203948033;
 //BA.debugLineNum = 203948033;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=203948034;
 //BA.debugLineNum = 203948034;BA.debugLine="End Sub";
return null;
}
public static void  _btnadd_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btnadd_click", true))
	 {Debug.delegate(ba, "btnadd_click", null); return;}
ResumableSub_btnAdd_Click rsub = new ResumableSub_btnAdd_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAdd_Click extends BA.ResumableSub {
public ResumableSub_btnAdd_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=204800001;
 //BA.debugLineNum = 204800001;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._datosorigendatos.TipoOrigenDatos /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=204800002;
 //BA.debugLineNum = 204800002;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
_msa = parent._xui.MsgboxAsync(ba,"Aún no se ha definido el tipo de origen de datos.","Aviso");
RDebugUtils.currentLine=204800003;
 //BA.debugLineNum = 204800003;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btnadd_click"), _msa);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=204800004;
 //BA.debugLineNum = 204800004;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=204800006;
 //BA.debugLineNum = 204800006;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=204800013;
 //BA.debugLineNum = 204800013;BA.debugLine="AddItem(Null)";
_additem((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=204800017;
 //BA.debugLineNum = 204800017;BA.debugLine="dragger.AddDragButtons";
parent._dragger._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=204800018;
 //BA.debugLineNum = 204800018;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=204800019;
 //BA.debugLineNum = 204800019;BA.debugLine="RecalcularIDOrdenColumnas";
_recalcularidordencolumnas();
RDebugUtils.currentLine=204800020;
 //BA.debugLineNum = 204800020;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btnadd_click"),(int) (100));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=204800021;
 //BA.debugLineNum = 204800021;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size - 1";
parent._clvlistacampos._jumptoitem((int) (parent._clvlistacampos._getsize()-1));
RDebugUtils.currentLine=204800022;
 //BA.debugLineNum = 204800022;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _recalcularidordencolumnas() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "recalcularidordencolumnas", true))
	 {return ((String) Debug.delegate(ba, "recalcularidordencolumnas", null));}
int _ordencolacum = 0;
int _i = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=206831616;
 //BA.debugLineNum = 206831616;BA.debugLine="private Sub RecalcularIDOrdenColumnas";
RDebugUtils.currentLine=206831617;
 //BA.debugLineNum = 206831617;BA.debugLine="Dim OrdenColAcum As Int";
_ordencolacum = 0;
RDebugUtils.currentLine=206831618;
 //BA.debugLineNum = 206831618;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=206831619;
 //BA.debugLineNum = 206831619;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(_clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=206831620;
 //BA.debugLineNum = 206831620;BA.debugLine="clvIV.txtID.Text=i";
_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_i));
RDebugUtils.currentLine=206831621;
 //BA.debugLineNum = 206831621;BA.debugLine="If clvIV.chkColumnaTableView.Checked Then";
if (_clviv.chkColumnaTableView /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
RDebugUtils.currentLine=206831622;
 //BA.debugLineNum = 206831622;BA.debugLine="clvIV.txtOrdenColumna.Text=OrdenColAcum";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_ordencolacum));
RDebugUtils.currentLine=206831623;
 //BA.debugLineNum = 206831623;BA.debugLine="OrdenColAcum=OrdenColAcum+1";
_ordencolacum = (int) (_ordencolacum+1);
 }else {
RDebugUtils.currentLine=206831625;
 //BA.debugLineNum = 206831625;BA.debugLine="clvIV.txtOrdenColumna.Text=-1";
_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(-1));
 };
RDebugUtils.currentLine=206831627;
 //BA.debugLineNum = 206831627;BA.debugLine="If ColActual=Col1 Then";
if (_colactual==_col1) { 
RDebugUtils.currentLine=206831628;
 //BA.debugLineNum = 206831628;BA.debugLine="ColActual=Col2";
_colactual = _col2;
 }else {
RDebugUtils.currentLine=206831630;
 //BA.debugLineNum = 206831630;BA.debugLine="ColActual=Col1";
_colactual = _col1;
 };
RDebugUtils.currentLine=206831632;
 //BA.debugLineNum = 206831632;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _clvlistacampos._getpanel(_i);
RDebugUtils.currentLine=206831633;
 //BA.debugLineNum = 206831633;BA.debugLine="p.Color=ColActual";
_p.setColor(_colactual);
 }
};
RDebugUtils.currentLine=206831635;
 //BA.debugLineNum = 206831635;BA.debugLine="Log(\"RecalcularIDOrdenColumnas\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9206831635","RecalcularIDOrdenColumnas",0);
RDebugUtils.currentLine=206831636;
 //BA.debugLineNum = 206831636;BA.debugLine="End Sub";
return "";
}
public static void  _btnayudacolorcontrastebordeseleccion_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btnayudacolorcontrastebordeseleccion_click", true))
	 {Debug.delegate(ba, "btnayudacolorcontrastebordeseleccion_click", null); return;}
ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click rsub = new ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click extends BA.ResumableSub {
public ResumableSub_btnAyudaColorContrasteBordeSeleccion_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbl = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209518593;
 //BA.debugLineNum = 209518593;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209518594;
 //BA.debugLineNum = 209518594;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209518595;
 //BA.debugLineNum = 209518595;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209518596;
 //BA.debugLineNum = 209518596;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209518597;
 //BA.debugLineNum = 209518597;BA.debugLine="Select clvIV.txtRGBColorFondo.Text";
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText(),"transparent","black")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
default: {
this.state = 7;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 8;
RDebugUtils.currentLine=209518599;
 //BA.debugLineNum = 209518599;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"En el caso";
_msa = parent._xui.MsgboxAsync(ba,"En el caso de color de fondo transparente, dejar el color de borde por defecto","Información");
RDebugUtils.currentLine=209518600;
 //BA.debugLineNum = 209518600;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btnayudacolorcontrastebordeseleccion_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=209518601;
 //BA.debugLineNum = 209518601;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=209518603;
 //BA.debugLineNum = 209518603;BA.debugLine="fx.Clipboard.SetString(\"#ffffff\")";
parent._fx.Clipboard.SetString("#ffffff");
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=209518605;
 //BA.debugLineNum = 209518605;BA.debugLine="fx.Clipboard.SetString(clvIV.txtRGBColorFondo.T";
parent._fx.Clipboard.SetString(_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=209518608;
 //BA.debugLineNum = 209518608;BA.debugLine="Dim sbl As StringBuilder";
_sbl = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=209518609;
 //BA.debugLineNum = 209518609;BA.debugLine="sbl.Initialize";
_sbl.Initialize();
RDebugUtils.currentLine=209518613;
 //BA.debugLineNum = 209518613;BA.debugLine="sbl.Append(\"Buscar en la web www.color-hex.com el";
_sbl.Append("Buscar en la web www.color-hex.com el color que mejor constraste genere con respecto al fondo.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=209518614;
 //BA.debugLineNum = 209518614;BA.debugLine="sbl.Append(\"Mirar entre los shades, tints, blanco";
_sbl.Append("Mirar entre los shades, tints, blanco o negro");
RDebugUtils.currentLine=209518615;
 //BA.debugLineNum = 209518615;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sbl.ToString";
_msa = parent._xui.MsgboxAsync(ba,_sbl.ToString(),"Información");
RDebugUtils.currentLine=209518616;
 //BA.debugLineNum = 209518616;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btnayudacolorcontrastebordeseleccion_click"), _msa);
this.state = 10;
return;
case 10:
//C
this.state = -1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209518618;
 //BA.debugLineNum = 209518618;BA.debugLine="fx.ShowExternalDocument(\"https://www.color-hex.co";
parent._fx.ShowExternalDocument("https://www.color-hex.com/color/"+_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#",""));
RDebugUtils.currentLine=209518619;
 //BA.debugLineNum = 209518619;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnbuscaraliascampo_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btnbuscaraliascampo_click", true))
	 {Debug.delegate(ba, "btnbuscaraliascampo_click", null); return;}
ResumableSub_btnBuscarAliasCampo_Click rsub = new ResumableSub_btnBuscarAliasCampo_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBuscarAliasCampo_Click extends BA.ResumableSub {
public ResumableSub_btnBuscarAliasCampo_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4a.objects.collections.List _lstcamposclv = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.objects.collections.Map _mdatacampo = null;
b4j.docU.b4xsearchtemplate _b4xsearchlistdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btcanceldlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lblb4xv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _sopcionsel = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209584129;
 //BA.debugLineNum = 209584129;BA.debugLine="Dialog.Title=\"Selecciona Campo\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona Campo");
RDebugUtils.currentLine=209584130;
 //BA.debugLineNum = 209584130;BA.debugLine="Dialog.TitleBarHeight=60dip";
parent._dialog._titlebarheight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=209584131;
 //BA.debugLineNum = 209584131;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
parent._dialog._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateDefaultFont((float) (18));
RDebugUtils.currentLine=209584132;
 //BA.debugLineNum = 209584132;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
parent._dialog._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateDefaultFont((float) (20));
RDebugUtils.currentLine=209584134;
 //BA.debugLineNum = 209584134;BA.debugLine="Dim lstCamposCLV As List=CargaCamposCLV";
_lstcamposclv = new anywheresoftware.b4a.objects.collections.List();
_lstcamposclv = _cargacamposclv();
RDebugUtils.currentLine=209584136;
 //BA.debugLineNum = 209584136;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=209584137;
 //BA.debugLineNum = 209584137;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=209584139;
 //BA.debugLineNum = 209584139;BA.debugLine="For Each mDataCampo As Map In lstCamposCLV";
if (true) break;

case 1:
//for
this.state = 4;
_mdatacampo = new anywheresoftware.b4a.objects.collections.Map();
group8 = _lstcamposclv;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 4;
if (index8 < groupLen8) {
this.state = 3;
_mdatacampo = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group8.Get(index8)));}
if (true) break;

case 16:
//C
this.state = 15;
index8++;
if (true) break;

case 3:
//C
this.state = 16;
RDebugUtils.currentLine=209584140;
 //BA.debugLineNum = 209584140;BA.debugLine="lstOpciones.Add(mDataCampo.Get(\"AliasCampo\"))";
_lstopciones.Add(_mdatacampo.Get((Object)("AliasCampo")));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=209584143;
 //BA.debugLineNum = 209584143;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
_b4xsearchlistdlg = new b4j.docU.b4xsearchtemplate();
RDebugUtils.currentLine=209584144;
 //BA.debugLineNum = 209584144;BA.debugLine="B4XSearchListDlg.Initialize";
_b4xsearchlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=209584145;
 //BA.debugLineNum = 209584145;BA.debugLine="B4XSearchListDlg.SetItems(lstOpciones)";
_b4xsearchlistdlg._setitems /*Object*/ (null,_lstopciones);
RDebugUtils.currentLine=209584146;
 //BA.debugLineNum = 209584146;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._hinttext /*String*/  = "Buscar";
RDebugUtils.currentLine=209584147;
 //BA.debugLineNum = 209584147;BA.debugLine="B4XSearchListDlg.SearchField.Update";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=209584148;
 //BA.debugLineNum = 209584148;BA.debugLine="B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA";
_b4xsearchlistdlg._itemhightlightcolor /*int*/  = ((int)0xff87cefa);
RDebugUtils.currentLine=209584149;
 //BA.debugLineNum = 209584149;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xsearchlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=209584150;
 //BA.debugLineNum = 209584150;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
_btcanceldlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btcanceldlg = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=209584151;
 //BA.debugLineNum = 209584151;BA.debugLine="btCancelDlg.TextSize=14";
_btcanceldlg.setTextSize(14);
RDebugUtils.currentLine=209584153;
 //BA.debugLineNum = 209584153;BA.debugLine="SetLightThemeDialog(Dialog)";
_setlightthemedialog(parent._dialog);
RDebugUtils.currentLine=209584154;
 //BA.debugLineNum = 209584154;BA.debugLine="SetLightThemeSearch(B4XSearchListDlg)";
_setlightthemesearch(_b4xsearchlistdlg);
RDebugUtils.currentLine=209584156;
 //BA.debugLineNum = 209584156;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=209584157;
 //BA.debugLineNum = 209584157;BA.debugLine="Dim xclv As CustomListView=B4XSearchListDlg.Custo";
_xclv = _b4xsearchlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=209584158;
 //BA.debugLineNum = 209584158;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(parent._xui.Color_Gray);
RDebugUtils.currentLine=209584160;
 //BA.debugLineNum = 209584160;BA.debugLine="B4XSearchListDlg.Resize(400dip,0.75*Dialog.mParen";
_b4xsearchlistdlg._resize /*String*/ (null,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (400)),(int) (0.75*parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=209584162;
 //BA.debugLineNum = 209584162;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xsearchlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=209584168;
 //BA.debugLineNum = 209584168;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=209584169;
 //BA.debugLineNum = 209584169;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=209584170;
 //BA.debugLineNum = 209584170;BA.debugLine="Dim lblB4Xv As B4XView=dlbl";
_lblb4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lblb4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_dlbl.getObject()));
RDebugUtils.currentLine=209584171;
 //BA.debugLineNum = 209584171;BA.debugLine="lblB4Xv.SetTextAlignment(\"CENTER\",\"LEFT\")";
_lblb4xv.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=209584173;
 //BA.debugLineNum = 209584173;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=209584174;
 //BA.debugLineNum = 209584174;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_bcancel.IsInitialized()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=209584175;
 //BA.debugLineNum = 209584175;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=209584176;
 //BA.debugLineNum = 209584176;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)));
RDebugUtils.currentLine=209584177;
 //BA.debugLineNum = 209584177;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=209584180;
 //BA.debugLineNum = 209584180;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btnbuscaraliascampo_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_rint = (int) result[0];
;
RDebugUtils.currentLine=209584181;
 //BA.debugLineNum = 209584181;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 9:
//if
this.state = 14;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) return ;
if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=209584183;
 //BA.debugLineNum = 209584183;BA.debugLine="Dim sOpcionSel As String=B4XSearchListDlg.Selecte";
_sopcionsel = _b4xsearchlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=209584185;
 //BA.debugLineNum = 209584185;BA.debugLine="clvListaCampos.ScrollToItem(lstOpciones.IndexOf(s";
parent._clvlistacampos._scrolltoitem(_lstopciones.IndexOf((Object)(_sopcionsel)));
RDebugUtils.currentLine=209584187;
 //BA.debugLineNum = 209584187;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _cargacamposclv() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacamposclv", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "cargacamposclv", null));}
anywheresoftware.b4a.objects.collections.List _lstcamposenclv = null;
int _i = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.collections.Map _mc = null;
RDebugUtils.currentLine=205848576;
 //BA.debugLineNum = 205848576;BA.debugLine="private Sub CargaCamposCLV As List";
RDebugUtils.currentLine=205848577;
 //BA.debugLineNum = 205848577;BA.debugLine="Dim lstCamposEnCLV As List";
_lstcamposenclv = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205848578;
 //BA.debugLineNum = 205848578;BA.debugLine="lstCamposEnCLV.Initialize";
_lstcamposenclv.Initialize();
RDebugUtils.currentLine=205848579;
 //BA.debugLineNum = 205848579;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=205848580;
 //BA.debugLineNum = 205848580;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(_clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=205848581;
 //BA.debugLineNum = 205848581;BA.debugLine="If clvIV.cboCampo.Value<>\"\" Then";
if ((_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("")) == false) { 
RDebugUtils.currentLine=205848582;
 //BA.debugLineNum = 205848582;BA.debugLine="Dim mC As Map=ItemValueToMap(clvIV)";
_mc = new anywheresoftware.b4a.objects.collections.Map();
_mc = _itemvaluetomap(_clviv);
RDebugUtils.currentLine=205848583;
 //BA.debugLineNum = 205848583;BA.debugLine="lstCamposEnCLV.Add(mC)";
_lstcamposenclv.Add((Object)(_mc.getObject()));
 };
 }
};
RDebugUtils.currentLine=205848586;
 //BA.debugLineNum = 205848586;BA.debugLine="Return lstCamposEnCLV";
if (true) return _lstcamposenclv;
RDebugUtils.currentLine=205848587;
 //BA.debugLineNum = 205848587;BA.debugLine="End Sub";
return null;
}
public static String  _setlightthemedialog(b4j.docU.b4xdialog _dlg) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemedialog", true))
	 {return ((String) Debug.delegate(ba, "setlightthemedialog", new Object[] {_dlg}));}
RDebugUtils.currentLine=209649664;
 //BA.debugLineNum = 209649664;BA.debugLine="Sub SetLightThemeDialog(dlg As B4XDialog)";
RDebugUtils.currentLine=209649665;
 //BA.debugLineNum = 209649665;BA.debugLine="dlg.BackgroundColor = xui.Color_White";
_dlg._backgroundcolor /*int*/  = _xui.Color_White;
RDebugUtils.currentLine=209649666;
 //BA.debugLineNum = 209649666;BA.debugLine="dlg.ButtonsColor = xui.Color_White";
_dlg._buttonscolor /*int*/  = _xui.Color_White;
RDebugUtils.currentLine=209649667;
 //BA.debugLineNum = 209649667;BA.debugLine="dlg.BorderColor = xui.Color_Gray";
_dlg._bordercolor /*int*/  = _xui.Color_Gray;
RDebugUtils.currentLine=209649668;
 //BA.debugLineNum = 209649668;BA.debugLine="dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
_dlg._buttonstextcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0x00),((int)0x7d),((int)0xc3));
RDebugUtils.currentLine=209649669;
 //BA.debugLineNum = 209649669;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemesearch(b4j.docU.b4xsearchtemplate _search) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemesearch", true))
	 {return ((String) Debug.delegate(ba, "setlightthemesearch", new Object[] {_search}));}
int _textcolor = 0;
RDebugUtils.currentLine=209846272;
 //BA.debugLineNum = 209846272;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
RDebugUtils.currentLine=209846273;
 //BA.debugLineNum = 209846273;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=209846274;
 //BA.debugLineNum = 209846274;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(_textcolor);
RDebugUtils.currentLine=209846275;
 //BA.debugLineNum = 209846275;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=209846276;
 //BA.debugLineNum = 209846276;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(_xui.Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=209846277;
 //BA.debugLineNum = 209846277;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(_xui.Color_White);
RDebugUtils.currentLine=209846278;
 //BA.debugLineNum = 209846278;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = _xui.Color_White;
RDebugUtils.currentLine=209846279;
 //BA.debugLineNum = 209846279;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=209846280;
 //BA.debugLineNum = 209846280;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=209846281;
 //BA.debugLineNum = 209846281;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=209846282;
 //BA.debugLineNum = 209846282;BA.debugLine="End Sub";
return "";
}
public static void  _btncopy_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btncopy_click", true))
	 {Debug.delegate(ba, "btncopy_click", null); return;}
ResumableSub_btnCopy_Click rsub = new ResumableSub_btnCopy_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCopy_Click extends BA.ResumableSub {
public ResumableSub_btnCopy_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _minfo = null;
String _he = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=204537857;
 //BA.debugLineNum = 204537857;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba))))));
RDebugUtils.currentLine=204537858;
 //BA.debugLineNum = 204537858;BA.debugLine="Dialog.Title=\"Copiar Campo\"";
parent._dialog._title /*Object*/  = (Object)("Copiar Campo");
RDebugUtils.currentLine=204537859;
 //BA.debugLineNum = 204537859;BA.debugLine="Wait For (Dialog.Show(\"¿Crear un campo nuevo copi";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btncopy_click"), parent._dialog._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)("¿Crear un campo nuevo copiando los datos del campo "+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+"?"),(Object)("Sí"),(Object)("No"),(Object)("")));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=204537860;
 //BA.debugLineNum = 204537860;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 13;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=204537861;
 //BA.debugLineNum = 204537861;BA.debugLine="Dim mInfo As Map=ItemValueToMap(clvIV)";
_minfo = new anywheresoftware.b4a.objects.collections.Map();
_minfo = _itemvaluetomap(_clviv);
RDebugUtils.currentLine=204537862;
 //BA.debugLineNum = 204537862;BA.debugLine="If mInfo.Get(\"EncabezadoColumna\")<>\"\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_minfo.Get((Object)("EncabezadoColumna"))).equals((Object)("")) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=204537863;
 //BA.debugLineNum = 204537863;BA.debugLine="Dim he As String = mInfo.Get(\"EncabezadoColumna";
_he = BA.ObjectToString(_minfo.Get((Object)("EncabezadoColumna")));
RDebugUtils.currentLine=204537864;
 //BA.debugLineNum = 204537864;BA.debugLine="mInfo.put(\"EncabezadoColumna\", he & \"2\")";
_minfo.Put((Object)("EncabezadoColumna"),(Object)(_he+"2"));
 if (true) break;
;
RDebugUtils.currentLine=204537866;
 //BA.debugLineNum = 204537866;BA.debugLine="If 0<>mInfo.Get(\"KeyID\") Then mInfo.put(\"KeyID\",";

case 7:
//if
this.state = 12;
if (0!=(double)(BA.ObjectToNumber(_minfo.Get((Object)("KeyID"))))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_minfo.Put((Object)("KeyID"),(Object)(0));
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=204537868;
 //BA.debugLineNum = 204537868;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=204537869;
 //BA.debugLineNum = 204537869;BA.debugLine="AddItem(mInfo)";
_additem(_minfo);
RDebugUtils.currentLine=204537871;
 //BA.debugLineNum = 204537871;BA.debugLine="dragger.AddDragButtons";
parent._dragger._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=204537872;
 //BA.debugLineNum = 204537872;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=204537873;
 //BA.debugLineNum = 204537873;BA.debugLine="RecalcularIDOrdenColumnas";
_recalcularidordencolumnas();
RDebugUtils.currentLine=204537874;
 //BA.debugLineNum = 204537874;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btncopy_click"),(int) (100));
this.state = 15;
return;
case 15:
//C
this.state = 13;
;
RDebugUtils.currentLine=204537875;
 //BA.debugLineNum = 204537875;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size -";
parent._clvlistacampos._jumptoitem((int) (parent._clvlistacampos._getsize()-1));
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=204537877;
 //BA.debugLineNum = 204537877;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.Map  _itemvaluetomap(b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "itemvaluetomap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "itemvaluetomap", new Object[] {_clviv}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=204079104;
 //BA.debugLineNum = 204079104;BA.debugLine="private Sub ItemValueToMap (clvIV As clvCamposBuil";
RDebugUtils.currentLine=204079105;
 //BA.debugLineNum = 204079105;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=204079106;
 //BA.debugLineNum = 204079106;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=204079107;
 //BA.debugLineNum = 204079107;BA.debugLine="m.put(\"ID\",clvIV.txtID.Text)";
_m.Put((Object)("ID"),(Object)(_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=204079108;
 //BA.debugLineNum = 204079108;BA.debugLine="m.Put(\"Campo\",clvIV.cboCampo.Value)";
_m.Put((Object)("Campo"),_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=204079109;
 //BA.debugLineNum = 204079109;BA.debugLine="m.Put(\"AliasCampo\",clvIV.txtAliasCampo.text)";
_m.Put((Object)("AliasCampo"),(Object)(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=204079110;
 //BA.debugLineNum = 204079110;BA.debugLine="m.Put(\"EncabezadoColumna\",clvIV.txtEncabezadoColu";
_m.Put((Object)("EncabezadoColumna"),(Object)(_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=204079111;
 //BA.debugLineNum = 204079111;BA.debugLine="m.Put(\"AnchoColumna\",clvIV.B4XPlusMinusAncho.Sele";
_m.Put((Object)("AnchoColumna"),_clviv.B4XPlusMinusAncho /*b4j.docU.b4xplusminus*/ ._getselectedvalue /*Object*/ (null));
RDebugUtils.currentLine=204079112;
 //BA.debugLineNum = 204079112;BA.debugLine="m.Put(\"KeyID\",clvIV.lblOrdenKeyID.Text)";
_m.Put((Object)("KeyID"),(Object)(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=204079113;
 //BA.debugLineNum = 204079113;BA.debugLine="m.Put(\"TipoControlFiltro\",clvIV.cboTipoControlFil";
_m.Put((Object)("TipoControlFiltro"),_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=204079114;
 //BA.debugLineNum = 204079114;BA.debugLine="m.Put(\"NombreCampoDialogosAux\",clvIV.txtNombreCam";
_m.Put((Object)("NombreCampoDialogosAux"),(Object)(_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=204079116;
 //BA.debugLineNum = 204079116;BA.debugLine="m.Put(\"TipoDato\",clvIV.cboTipoDato.Value)";
_m.Put((Object)("TipoDato"),_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=204079117;
 //BA.debugLineNum = 204079117;BA.debugLine="m.Put(\"EsFecha\",clvIV.chkBoxEsFecha.Checked)";
_m.Put((Object)("EsFecha"),(Object)(_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=204079118;
 //BA.debugLineNum = 204079118;BA.debugLine="m.Put(\"EsBooleano\",clvIV.chkBoxEsBooleano.Checked";
_m.Put((Object)("EsBooleano"),(Object)(_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=204079119;
 //BA.debugLineNum = 204079119;BA.debugLine="m.Put(\"ValorTrueCampoBooleano\",clvIV.txtValorTrue";
_m.Put((Object)("ValorTrueCampoBooleano"),(Object)(_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=204079120;
 //BA.debugLineNum = 204079120;BA.debugLine="m.Put(\"ColumnaTableView\",clvIV.chkColumnaTableVie";
_m.Put((Object)("ColumnaTableView"),(Object)(_clviv.chkColumnaTableView /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=204079121;
 //BA.debugLineNum = 204079121;BA.debugLine="m.Put(\"ColumnaOcultable\",clvIV.chkColumnaOcultabl";
_m.Put((Object)("ColumnaOcultable"),(Object)(_clviv.chkColumnaOcultable /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=204079122;
 //BA.debugLineNum = 204079122;BA.debugLine="m.Put(\"CampoCalculado\",clvIV.chkBoxCampoCalculado";
_m.Put((Object)("CampoCalculado"),(Object)(_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=204079123;
 //BA.debugLineNum = 204079123;BA.debugLine="m.put(\"OrdenColumna\",clvIV.txtOrdenColumna.Text)";
_m.Put((Object)("OrdenColumna"),(Object)(_clviv.txtOrdenColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=204079124;
 //BA.debugLineNum = 204079124;BA.debugLine="m.put(\"AlineacionColumna\",clvIV.cboAlineacionColu";
_m.Put((Object)("AlineacionColumna"),_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=204079125;
 //BA.debugLineNum = 204079125;BA.debugLine="m.put(\"NoNulo\",clvIV.chkNoNulo.Checked)";
_m.Put((Object)("NoNulo"),(Object)(_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=204079126;
 //BA.debugLineNum = 204079126;BA.debugLine="m.put(\"ConValorDefecto\",clvIV.chkBoxConValorDefec";
_m.Put((Object)("ConValorDefecto"),(Object)(_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=204079127;
 //BA.debugLineNum = 204079127;BA.debugLine="m.put(\"ValorDefecto\",clvIV.txtValorDefecto.text)";
_m.Put((Object)("ValorDefecto"),(Object)(_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=204079134;
 //BA.debugLineNum = 204079134;BA.debugLine="m.put(\"ColorTexto\",clvIV.txtRGBColorTexto.Text)";
_m.Put((Object)("ColorTexto"),(Object)(_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
RDebugUtils.currentLine=204079135;
 //BA.debugLineNum = 204079135;BA.debugLine="m.put(\"ColorFondo\",clvIV.txtRGBColorFondo.Text)";
_m.Put((Object)("ColorFondo"),(Object)(_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
RDebugUtils.currentLine=204079136;
 //BA.debugLineNum = 204079136;BA.debugLine="m.put(\"ColorBorde\",clvIV.txtRGBColorBorde.Text)";
_m.Put((Object)("ColorBorde"),(Object)(_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
RDebugUtils.currentLine=204079137;
 //BA.debugLineNum = 204079137;BA.debugLine="m.put(\"ColorBordeCeldaSeleccionada\",clvIV.txtRGBC";
_m.Put((Object)("ColorBordeCeldaSeleccionada"),(Object)(_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
RDebugUtils.currentLine=204079138;
 //BA.debugLineNum = 204079138;BA.debugLine="m.Put(\"AnchoBorde\",clvIV.B4XPlusMinusAnchoBorde.S";
_m.Put((Object)("AnchoBorde"),_clviv.B4XPlusMinusAnchoBorde /*b4j.docU.b4xplusminus*/ ._getselectedvalue /*Object*/ (null));
RDebugUtils.currentLine=204079139;
 //BA.debugLineNum = 204079139;BA.debugLine="m.Put(\"TipoControlEdicion\",clvIV.cboTipoControlEd";
_m.Put((Object)("TipoControlEdicion"),_clviv.cboTipoControlEdicion /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=204079141;
 //BA.debugLineNum = 204079141;BA.debugLine="m.Put(\"ColorTextoEncabezadoColumna\",clvIV.txtRGBC";
_m.Put((Object)("ColorTextoEncabezadoColumna"),(Object)(_clviv.txtRGBColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
RDebugUtils.currentLine=204079142;
 //BA.debugLineNum = 204079142;BA.debugLine="m.Put(\"ColorFondoEncabezadoColumna\",clvIV.txtRGBC";
_m.Put((Object)("ColorFondoEncabezadoColumna"),(Object)(_clviv.txtRGBColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()));
RDebugUtils.currentLine=204079143;
 //BA.debugLineNum = 204079143;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=204079144;
 //BA.debugLineNum = 204079144;BA.debugLine="End Sub";
return null;
}
public static void  _btndelete_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btndelete_click", true))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.ButtonWrapper _btndel = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=204472321;
 //BA.debugLineNum = 204472321;BA.debugLine="Dim btnDel As Button=Sender";
_btndel = new anywheresoftware.b4j.objects.ButtonWrapper();
_btndel = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=204472322;
 //BA.debugLineNum = 204472322;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(b";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btndel.getObject())));
RDebugUtils.currentLine=204472323;
 //BA.debugLineNum = 204472323;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=204472329;
 //BA.debugLineNum = 204472329;BA.debugLine="Dialog.Title=\"Borrar Campo\"";
parent._dialog._title /*Object*/  = (Object)("Borrar Campo");
RDebugUtils.currentLine=204472331;
 //BA.debugLineNum = 204472331;BA.debugLine="Wait For (Dialog.Show(\"Confirma eliminación del c";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btndelete_click"), parent._dialog._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)("Confirma eliminación del campo "+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+"."),(Object)("Sí"),(Object)("No"),(Object)("")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=204472332;
 //BA.debugLineNum = 204472332;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=204472333;
 //BA.debugLineNum = 204472333;BA.debugLine="clvListaCampos.RemoveAt(index)";
parent._clvlistacampos._removeat(_index);
RDebugUtils.currentLine=204472334;
 //BA.debugLineNum = 204472334;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._lstprimarykey.IndexOf(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())>-1) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent._lstprimarykey.RemoveAt(parent._lstprimarykey.IndexOf(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=204472335;
 //BA.debugLineNum = 204472335;BA.debugLine="RecalcularIDOrdenColumnas";
_recalcularidordencolumnas();
RDebugUtils.currentLine=204472336;
 //BA.debugLineNum = 204472336;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btndelete_click"),(int) (100));
this.state = 16;
return;
case 16:
//C
this.state = 10;
;
RDebugUtils.currentLine=204472337;
 //BA.debugLineNum = 204472337;BA.debugLine="If clvListaCampos.Size>0 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (parent._clvlistacampos._getsize()>0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=204472338;
 //BA.debugLineNum = 204472338;BA.debugLine="clvListaCampos.JumpToItem(Max(0,(clvListaCampos";
parent._clvlistacampos._jumptoitem((int) (anywheresoftware.b4a.keywords.Common.Max(0,(parent._clvlistacampos._getsize()-1))));
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=204472341;
 //BA.debugLineNum = 204472341;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btneditarencabezadocolumna_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btneditarencabezadocolumna_click", true))
	 {Debug.delegate(ba, "btneditarencabezadocolumna_click", null); return;}
ResumableSub_btnEditarEncabezadoColumna_Click rsub = new ResumableSub_btnEditarEncabezadoColumna_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEditarEncabezadoColumna_Click extends BA.ResumableSub {
public ResumableSub_btnEditarEncabezadoColumna_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
b4j.docU.b4xinputtemplate _b4xinputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btnok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btncancel = null;
int _rint = 0;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=210173953;
 //BA.debugLineNum = 210173953;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=210173954;
 //BA.debugLineNum = 210173954;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())))));
RDebugUtils.currentLine=210173955;
 //BA.debugLineNum = 210173955;BA.debugLine="Dialog.Title=\"Indica encabezado de la columna\"";
parent._dialog._title /*Object*/  = (Object)("Indica encabezado de la columna");
RDebugUtils.currentLine=210173956;
 //BA.debugLineNum = 210173956;BA.debugLine="Dialog.TitleBarHeight=60dip";
parent._dialog._titlebarheight /*int*/  = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60));
RDebugUtils.currentLine=210173957;
 //BA.debugLineNum = 210173957;BA.debugLine="Dim b4xInputDlg As B4XInputTemplate";
_b4xinputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=210173958;
 //BA.debugLineNum = 210173958;BA.debugLine="b4xInputDlg.Initialize";
_b4xinputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=210173959;
 //BA.debugLineNum = 210173959;BA.debugLine="b4xInputDlg.lblTitle.Text=clvIV.txtAliasCampo.tex";
_b4xinputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=210173960;
 //BA.debugLineNum = 210173960;BA.debugLine="b4xInputDlg.Text=clvIV.txtEncabezadoColumna.Text";
_b4xinputdlg._text /*String*/  = _clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=210173962;
 //BA.debugLineNum = 210173962;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(b4xI";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xinputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=210173963;
 //BA.debugLineNum = 210173963;BA.debugLine="Dim btnOK As B4XView=Dialog.GetButton(xui.DialogR";
_btnok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btnok = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Positive);
RDebugUtils.currentLine=210173964;
 //BA.debugLineNum = 210173964;BA.debugLine="btnOK.Left=10dip";
_btnok.setLeft(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=210173966;
 //BA.debugLineNum = 210173966;BA.debugLine="Dim btnCancel As B4XView=Dialog.GetButton(xui.Dia";
_btncancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btncancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=210173967;
 //BA.debugLineNum = 210173967;BA.debugLine="btnCancel.Left=btnCancel.Left-40dip";
_btncancel.setLeft(_btncancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=210173968;
 //BA.debugLineNum = 210173968;BA.debugLine="btnCancel.width=btnCancel.width+10dip";
_btncancel.setWidth(_btncancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (10)));
RDebugUtils.currentLine=210173969;
 //BA.debugLineNum = 210173969;BA.debugLine="btnCancel.SetTextAlignment(\"CENTER\",\"LEFT\")";
_btncancel.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=210173971;
 //BA.debugLineNum = 210173971;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarencabezadocolumna_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 1;
_rint = (int) result[0];
;
RDebugUtils.currentLine=210173972;
 //BA.debugLineNum = 210173972;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_rint!=parent._xui.DialogResponse_Positive) { 
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
RDebugUtils.currentLine=210173973;
 //BA.debugLineNum = 210173973;BA.debugLine="clvIV.txtEncabezadoColumna.Text=b4xInputDlg.Text";
_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_b4xinputdlg._text /*String*/ );
RDebugUtils.currentLine=210173974;
 //BA.debugLineNum = 210173974;BA.debugLine="If clvIV.txtEncabezadoColumna.Text<>\"\" And clvIV.";
if (true) break;

case 7:
//if
this.state = 16;
if ((_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false && (_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals(_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=210173975;
 //BA.debugLineNum = 210173975;BA.debugLine="Dim msa As Object = xui.Msgbox2Async($\"El encabe";
_msa = parent._xui.Msgbox2Async(ba,("El encabezado de la columna "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+" es distinto al Nombre del campo utilizado en los filtros y diálogos auxiliares.\n"+"¿Cambiar el nombre del campo para los diálogos auxiliares a "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))+"?"),"Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=210173977;
 //BA.debugLineNum = 210173977;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarencabezadocolumna_click"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 10;
_rint = (int) result[0];
;
RDebugUtils.currentLine=210173978;
 //BA.debugLineNum = 210173978;BA.debugLine="If rInt <> xui.DialogResponse_Positive Then Retu";
if (true) break;

case 10:
//if
this.state = 15;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=210173979;
 //BA.debugLineNum = 210173979;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=clvIV.txtEn";
_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=210173982;
 //BA.debugLineNum = 210173982;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btneditarorigenjrdc_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btneditarorigenjrdc_click", true))
	 {Debug.delegate(ba, "btneditarorigenjrdc_click", null); return;}
ResumableSub_btnEditarOrigenJRDC_Click rsub = new ResumableSub_btnEditarOrigenJRDC_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEditarOrigenJRDC_Click extends BA.ResumableSub {
public ResumableSub_btnEditarOrigenJRDC_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=207290369;
 //BA.debugLineNum = 207290369;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._datosorigendatos.TipoOrigenDatos /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=207290370;
 //BA.debugLineNum = 207290370;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
_msa = parent._xui.MsgboxAsync(ba,"Aún no se ha definido un tipo de datos","Aviso");
RDebugUtils.currentLine=207290371;
 //BA.debugLineNum = 207290371;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=207290372;
 //BA.debugLineNum = 207290372;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=207290374;
 //BA.debugLineNum = 207290374;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"Manual\" Then";

case 4:
//if
this.state = 7;
if ((parent._datosorigendatos.TipoOrigenDatos /*String*/ ).equals("Manual")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=207290375;
 //BA.debugLineNum = 207290375;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No se puede";
_msa = parent._xui.MsgboxAsync(ba,"No se puede editar un origen de datos manual","Aviso");
RDebugUtils.currentLine=207290376;
 //BA.debugLineNum = 207290376;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 7;
_result = (int) result[0];
;
RDebugUtils.currentLine=207290377;
 //BA.debugLineNum = 207290377;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=207290382;
 //BA.debugLineNum = 207290382;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Editar el";
_msa = parent._xui.Msgbox2Async(ba,"¿Editar el origen de datos actual?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=207290383;
 //BA.debugLineNum = 207290383;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=207290384;
 //BA.debugLineNum = 207290384;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 8:
//if
this.state = 13;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
if (true) return ;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=207290386;
 //BA.debugLineNum = 207290386;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
parent._prefdialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=207290388;
 //BA.debugLineNum = 207290388;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
parent._prefdialog._loadfromjson /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"OrigenDatosJRDC.json"));
RDebugUtils.currentLine=207290389;
 //BA.debugLineNum = 207290389;BA.debugLine="Dim mData As Map=CreateMap(\"TipoOrigenDatos\": Dat";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("TipoOrigenDatos"),(Object)(parent._datosorigendatos.TipoOrigenDatos /*String*/ ),(Object)("IpJRDC"),(Object)(parent._datosorigendatos.IpJRDC /*String*/ ),(Object)("PuertoJRDC"),(Object)(parent._datosorigendatos.PuertoJRDC /*String*/ ),(Object)("ComandoJRDC"),(Object)(parent._datosorigendatos.ComandoJRDC /*String*/ ),(Object)("ParametrosJRDC"),(Object)(parent._datosorigendatos.ParametrosJRDC /*String*/ )});
RDebugUtils.currentLine=207290390;
 //BA.debugLineNum = 207290390;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"CAN";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), parent._prefdialog._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL")));
this.state = 30;
return;
case 30:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=207290391;
 //BA.debugLineNum = 207290391;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 14:
//if
this.state = 19;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
if (true) return ;
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=207290392;
 //BA.debugLineNum = 207290392;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
parent._lbltitleipjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=207290393;
 //BA.debugLineNum = 207290393;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
parent._lbltitlepuertojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=207290394;
 //BA.debugLineNum = 207290394;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32Bit";
parent._lbltitlecomandojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=207290395;
 //BA.debugLineNum = 207290395;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.From32";
parent._lbltitleparametrosjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=207290396;
 //BA.debugLineNum = 207290396;BA.debugLine="txtIpJRDC.Enabled=True";
parent._txtipjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=207290397;
 //BA.debugLineNum = 207290397;BA.debugLine="txtParametrosJRDC.Enabled=True";
parent._txtparametrosjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=207290398;
 //BA.debugLineNum = 207290398;BA.debugLine="txtPuertoJRDC.Enabled=True";
parent._txtpuertojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=207290399;
 //BA.debugLineNum = 207290399;BA.debugLine="txtComandoJRDC.ENABLED=True";
parent._txtcomandojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=207290401;
 //BA.debugLineNum = 207290401;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(DatosOrige";
parent._datosorigendatos = _createtipoorigendatos(parent._datosorigendatos.TipoOrigenDatos /*String*/ ,BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ComandoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ParametrosJRDC"),(Object)(""))));
RDebugUtils.currentLine=207290402;
 //BA.debugLineNum = 207290402;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=207290403;
 //BA.debugLineNum = 207290403;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=207290404;
 //BA.debugLineNum = 207290404;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
if (true) break;

case 20:
//if
this.state = 23;
if ((parent._datosorigendatos.TipoOrigenDatos /*String*/ ).equals("JRDC Query")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=207290405;
 //BA.debugLineNum = 207290405;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJRD";
_cargacamposjrdcquery(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtcomandojrdc.getText(),parent._txtparametrosjrdc.getText());
RDebugUtils.currentLine=207290406;
 //BA.debugLineNum = 207290406;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcquery_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), null);
this.state = 31;
return;
case 31:
//C
this.state = 23;
;
 if (true) break;
;
RDebugUtils.currentLine=207290408;
 //BA.debugLineNum = 207290408;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";

case 23:
//if
this.state = 26;
if ((parent._datosorigendatos.TipoOrigenDatos /*String*/ ).equals("JRDC Table")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=207290409;
 //BA.debugLineNum = 207290409;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJRD";
_cargacamposjrdctable(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtcomandojrdc.getText(),parent._txtparametrosjrdc.getText());
RDebugUtils.currentLine=207290410;
 //BA.debugLineNum = 207290410;BA.debugLine="wait for CargaCamposJRDCTable_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdctable_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btneditarorigenjrdc_click"), null);
this.state = 32;
return;
case 32:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=207290413;
 //BA.debugLineNum = 207290413;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=207290414;
 //BA.debugLineNum = 207290414;BA.debugLine="RecalcularIDOrdenColumnas";
_recalcularidordencolumnas();
RDebugUtils.currentLine=207290415;
 //BA.debugLineNum = 207290415;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cargacamposjrdcquery(String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacamposjrdcquery", true))
	 {Debug.delegate(ba, "cargacamposjrdcquery", new Object[] {_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros}); return;}
ResumableSub_CargaCamposJRDCQuery rsub = new ResumableSub_CargaCamposJRDCQuery(null,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaCamposJRDCQuery extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCQuery(b4j.docU.jamtableviewcamposbuilder parent,String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
}
b4j.docU.jamtableviewcamposbuilder parent;
String _ipjrdc;
int _puertojrdc;
String _comandoconfigprop;
String _parametros;
String _rdclinkquery = "";
String[] _params = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _mprimerregistro = null;
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvnocalculados = null;
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;
int _i = 0;
String _nombrecampoquerysql = "";
anywheresoftware.b4a.objects.collections.Map _minfocamposql = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _msa = null;
int _result = 0;
int step22;
int limit22;
int step37;
int limit37;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=205717505;
 //BA.debugLineNum = 205717505;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=205717506;
 //BA.debugLineNum = 205717506;BA.debugLine="If Parametros=\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_parametros).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=205717508;
 //BA.debugLineNum = 205717508;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
_cargadatosjrdcquerytop1(_rdclinkquery,_comandoconfigprop,(Object[])(anywheresoftware.b4a.keywords.Common.Null),jamtableviewcamposbuilder.getObject());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=205717511;
 //BA.debugLineNum = 205717511;BA.debugLine="Parametros=Parametros.Replace(\" \",\"\")";
_parametros = _parametros.replace(" ","");
RDebugUtils.currentLine=205717512;
 //BA.debugLineNum = 205717512;BA.debugLine="Dim Params() As String=Regex.Split(\";\",Parametro";
_params = anywheresoftware.b4a.keywords.Common.Regex.Split(";",_parametros);
RDebugUtils.currentLine=205717514;
 //BA.debugLineNum = 205717514;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
_cargadatosjrdcquerytop1(_rdclinkquery,_comandoconfigprop,(Object[])(_params),jamtableviewcamposbuilder.getObject());
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=205717517;
 //BA.debugLineNum = 205717517;BA.debugLine="Wait For  CargaDatosJRDCQueryTop1_Completed (mRes";
anywheresoftware.b4a.keywords.Common.WaitFor("cargadatosjrdcquerytop1_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cargacamposjrdcquery"), null);
this.state = 36;
return;
case 36:
//C
this.state = 7;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=205717518;
 //BA.debugLineNum = 205717518;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=205717519;
 //BA.debugLineNum = 205717519;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 7:
//if
this.state = 35;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 35;
RDebugUtils.currentLine=205717520;
 //BA.debugLineNum = 205717520;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
parent._fx.Msgbox(parent._frm,"Sin conexión con el servidor / base de datos / error de consulta"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Avisa al administrador de la aplicación","Error");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=205717522;
 //BA.debugLineNum = 205717522;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 12:
//if
this.state = 34;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 34;
RDebugUtils.currentLine=205717523;
 //BA.debugLineNum = 205717523;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
parent._fx.Msgbox(parent._frm,"La consulta no devuelve datos, no es posible configurar sus campos.","Aviso");
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=205717525;
 //BA.debugLineNum = 205717525;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=205717526;
 //BA.debugLineNum = 205717526;BA.debugLine="Dim mPrimerRegistro As Map=lstRes.get(0)";
_mprimerregistro = new anywheresoftware.b4a.objects.collections.Map();
_mprimerregistro = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=205717527;
 //BA.debugLineNum = 205717527;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvnocalculados = _nombrescamposclvnocalculados();
RDebugUtils.currentLine=205717528;
 //BA.debugLineNum = 205717528;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205717529;
 //BA.debugLineNum = 205717529;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=205717531;
 //BA.debugLineNum = 205717531;BA.debugLine="For i=0 To mPrimerRegistro.Size-1";
if (true) break;

case 17:
//for
this.state = 26;
step22 = 1;
limit22 = (int) (_mprimerregistro.getSize()-1);
_i = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if ((step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22)) this.state = 19;
if (true) break;

case 38:
//C
this.state = 37;
_i = ((int)(0 + _i + step22)) ;
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=205717532;
 //BA.debugLineNum = 205717532;BA.debugLine="Dim NombreCampoQuerySQL As String=mPrimerRegis";
_nombrecampoquerysql = BA.ObjectToString(_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=205717533;
 //BA.debugLineNum = 205717533;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
_lstcampossql.Add((Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=205717536;
 //BA.debugLineNum = 205717536;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
if (true) break;

case 20:
//if
this.state = 25;
if (_lstnombrescamposclvnocalculados.IndexOf((Object)(_nombrecampoquerysql))==-1) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=205717537;
 //BA.debugLineNum = 205717537;BA.debugLine="Dim mInfoCampoSQL As Map";
_minfocamposql = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=205717538;
 //BA.debugLineNum = 205717538;BA.debugLine="mInfoCampoSQL.Initialize";
_minfocamposql.Initialize();
RDebugUtils.currentLine=205717539;
 //BA.debugLineNum = 205717539;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mPrimerRegistro.Get";
_minfocamposql.Put((Object)("Campo"),_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=205717540;
 //BA.debugLineNum = 205717540;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mPrimerRegistr";
_minfocamposql.Put((Object)("AliasCampo"),_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=205717541;
 //BA.debugLineNum = 205717541;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mPrimer";
_minfocamposql.Put((Object)("EncabezadoColumna"),_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=205717542;
 //BA.debugLineNum = 205717542;BA.debugLine="mInfoCampoSQL.Put(\"NombreCampoDialogosAux\",mP";
_minfocamposql.Put((Object)("NombreCampoDialogosAux"),_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=205717543;
 //BA.debugLineNum = 205717543;BA.debugLine="AddItem(mInfoCampoSQL)";
_additem(_minfocamposql);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=205717545;
 //BA.debugLineNum = 205717545;BA.debugLine="Continue";
this.state = 38;
if (true) break;;
 if (true) break;

case 25:
//C
this.state = 38;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=205717549;
 //BA.debugLineNum = 205717549;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";

case 26:
//for
this.state = 33;
step37 = 1;
limit37 = (int) (_lstnombrescamposclvnocalculados.getSize()-1);
_i = (int) (0) ;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 33;
if ((step37 > 0 && _i <= limit37) || (step37 < 0 && _i >= limit37)) this.state = 28;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step37)) ;
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=205717550;
 //BA.debugLineNum = 205717550;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
if (true) break;

case 29:
//if
this.state = 32;
if (_lstcampossql.IndexOf(_lstnombrescamposclvnocalculados.Get(_i))==-1) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=205717551;
 //BA.debugLineNum = 205717551;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=205717552;
 //BA.debugLineNum = 205717552;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=205717553;
 //BA.debugLineNum = 205717553;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
_sb.Append("El campo no calculado "+BA.ObjectToString(_lstnombrescamposclvnocalculados.Get(_i))+" no ha sido devuelto por la SQL.");
RDebugUtils.currentLine=205717554;
 //BA.debugLineNum = 205717554;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
_sb.Append(" Si esto es un error, se debería eliminar el campo del CLV.");
RDebugUtils.currentLine=205717557;
 //BA.debugLineNum = 205717557;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
_msa = parent._xui.MsgboxAsync(ba,_sb.ToString(),"Aviso");
RDebugUtils.currentLine=205717558;
 //BA.debugLineNum = 205717558;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cargacamposjrdcquery"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 32;
_result = (int) result[0];
;
 if (true) break;

case 32:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=205717561;
 //BA.debugLineNum = 205717561;BA.debugLine="dragger.AddDragButtons";
parent._dragger._adddragbuttons /*String*/ (null);
 if (true) break;

case 34:
//C
this.state = 35;
;
 if (true) break;

case 35:
//C
this.state = -1;
;
RDebugUtils.currentLine=205717564;
 //BA.debugLineNum = 205717564;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCQuery_Complete";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,jamtableviewcamposbuilder.getObject(),"CargaCamposJRDCQuery_Completed");
RDebugUtils.currentLine=205717565;
 //BA.debugLineNum = 205717565;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cargacamposjrdctable(String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacamposjrdctable", true))
	 {Debug.delegate(ba, "cargacamposjrdctable", new Object[] {_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros}); return;}
ResumableSub_CargaCamposJRDCTable rsub = new ResumableSub_CargaCamposJRDCTable(null,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaCamposJRDCTable extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCTable(b4j.docU.jamtableviewcamposbuilder parent,String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) {
this.parent = parent;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
}
b4j.docU.jamtableviewcamposbuilder parent;
String _ipjrdc;
int _puertojrdc;
String _comandoconfigprop;
String _parametros;
String _rdclinkquery = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvnocalculados = null;
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _nombrecampoquerysql = "";
anywheresoftware.b4a.objects.collections.Map _minfocamposql = null;
String _tipodatomysqlmysql = "";
String _tipodato = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _msa = null;
int _result = 0;
int step15;
int limit15;
int step68;
int limit68;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=205783041;
 //BA.debugLineNum = 205783041;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=205783042;
 //BA.debugLineNum = 205783042;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigprop,(Object[])(new String[]{_parametros}),jamtableviewcamposbuilder.getObject());
RDebugUtils.currentLine=205783043;
 //BA.debugLineNum = 205783043;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cargacamposjrdctable"), null);
this.state = 64;
return;
case 64:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=205783044;
 //BA.debugLineNum = 205783044;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=205783045;
 //BA.debugLineNum = 205783045;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 63;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 63;
RDebugUtils.currentLine=205783046;
 //BA.debugLineNum = 205783046;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
parent._fx.Msgbox(parent._frm,"Sin conexión con el servidor / base de datos / error de consulta"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"Avisa al administrador de la aplicación","Error");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=205783048;
 //BA.debugLineNum = 205783048;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 62;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 62;
RDebugUtils.currentLine=205783049;
 //BA.debugLineNum = 205783049;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
parent._fx.Msgbox(parent._frm,"La consulta no devuelve datos, no es posible configurar sus campos.","Aviso");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=205783051;
 //BA.debugLineNum = 205783051;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=205783052;
 //BA.debugLineNum = 205783052;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvnocalculados = _nombrescamposclvnocalculados();
RDebugUtils.currentLine=205783053;
 //BA.debugLineNum = 205783053;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205783054;
 //BA.debugLineNum = 205783054;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=205783055;
 //BA.debugLineNum = 205783055;BA.debugLine="For i=0 To lstRes.Size-1";
if (true) break;

case 11:
//for
this.state = 54;
step15 = 1;
limit15 = (int) (_lstres.getSize()-1);
_i = (int) (0) ;
this.state = 65;
if (true) break;

case 65:
//C
this.state = 54;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 13;
if (true) break;

case 66:
//C
this.state = 65;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=205783056;
 //BA.debugLineNum = 205783056;BA.debugLine="Dim mRes As Map=lstRes.Get(i)";
_mres = new anywheresoftware.b4a.objects.collections.Map();
_mres = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get(_i)));
RDebugUtils.currentLine=205783057;
 //BA.debugLineNum = 205783057;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"CO";
_nombrecampoquerysql = BA.ObjectToString(_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=205783058;
 //BA.debugLineNum = 205783058;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
_lstcampossql.Add((Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=205783060;
 //BA.debugLineNum = 205783060;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
if (true) break;

case 14:
//if
this.state = 53;
if (_lstnombrescamposclvnocalculados.IndexOf((Object)(_nombrecampoquerysql))==-1) { 
this.state = 16;
}else {
this.state = 52;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=205783061;
 //BA.debugLineNum = 205783061;BA.debugLine="Dim mInfoCampoSQL As Map";
_minfocamposql = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=205783062;
 //BA.debugLineNum = 205783062;BA.debugLine="mInfoCampoSQL.Initialize";
_minfocamposql.Initialize();
RDebugUtils.currentLine=205783063;
 //BA.debugLineNum = 205783063;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mRes.Get(\"COLUMN_NA";
_minfocamposql.Put((Object)("Campo"),_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=205783064;
 //BA.debugLineNum = 205783064;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mRes.Get(\"COLU";
_minfocamposql.Put((Object)("AliasCampo"),_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=205783065;
 //BA.debugLineNum = 205783065;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mRes.Ge";
_minfocamposql.Put((Object)("EncabezadoColumna"),_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=205783066;
 //BA.debugLineNum = 205783066;BA.debugLine="mInfoCampoSQL.Put(\"NombreCampoDialogosAux\",mR";
_minfocamposql.Put((Object)("NombreCampoDialogosAux"),_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=205783067;
 //BA.debugLineNum = 205783067;BA.debugLine="Dim TipoDatoMySQLMySQL As String=mRes.Get(\"DA";
_tipodatomysqlmysql = BA.ObjectToString(_mres.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=205783068;
 //BA.debugLineNum = 205783068;BA.debugLine="Dim TipoDato As String";
_tipodato = "";
RDebugUtils.currentLine=205783069;
 //BA.debugLineNum = 205783069;BA.debugLine="Select TipoDatoMySQLMySQL";
if (true) break;

case 17:
//select
this.state = 50;
switch (BA.switchObjectToInt(_tipodatomysqlmysql,"smallint","int","tinyint","bit","bigint","varchar","char","text","nchar","ntext","nvarchar","enum","double","decimal","float")) {
case 0: {
this.state = 19;
if (true) break;
}
case 1: {
this.state = 21;
if (true) break;
}
case 2: {
this.state = 23;
if (true) break;
}
case 3: {
this.state = 25;
if (true) break;
}
case 4: {
this.state = 27;
if (true) break;
}
case 5: {
this.state = 29;
if (true) break;
}
case 6: {
this.state = 31;
if (true) break;
}
case 7: {
this.state = 33;
if (true) break;
}
case 8: {
this.state = 35;
if (true) break;
}
case 9: {
this.state = 37;
if (true) break;
}
case 10: {
this.state = 39;
if (true) break;
}
case 11: {
this.state = 41;
if (true) break;
}
case 12: {
this.state = 43;
if (true) break;
}
case 13: {
this.state = 45;
if (true) break;
}
case 14: {
this.state = 47;
if (true) break;
}
default: {
this.state = 49;
if (true) break;
}
}
if (true) break;

case 19:
//C
this.state = 50;
RDebugUtils.currentLine=205783091;
 //BA.debugLineNum = 205783091;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 21:
//C
this.state = 50;
RDebugUtils.currentLine=205783093;
 //BA.debugLineNum = 205783093;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 23:
//C
this.state = 50;
RDebugUtils.currentLine=205783095;
 //BA.debugLineNum = 205783095;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 25:
//C
this.state = 50;
RDebugUtils.currentLine=205783097;
 //BA.debugLineNum = 205783097;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 27:
//C
this.state = 50;
RDebugUtils.currentLine=205783099;
 //BA.debugLineNum = 205783099;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 29:
//C
this.state = 50;
RDebugUtils.currentLine=205783101;
 //BA.debugLineNum = 205783101;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 31:
//C
this.state = 50;
RDebugUtils.currentLine=205783103;
 //BA.debugLineNum = 205783103;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 33:
//C
this.state = 50;
RDebugUtils.currentLine=205783105;
 //BA.debugLineNum = 205783105;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 35:
//C
this.state = 50;
RDebugUtils.currentLine=205783107;
 //BA.debugLineNum = 205783107;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 37:
//C
this.state = 50;
RDebugUtils.currentLine=205783109;
 //BA.debugLineNum = 205783109;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 39:
//C
this.state = 50;
RDebugUtils.currentLine=205783111;
 //BA.debugLineNum = 205783111;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 41:
//C
this.state = 50;
RDebugUtils.currentLine=205783113;
 //BA.debugLineNum = 205783113;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 43:
//C
this.state = 50;
RDebugUtils.currentLine=205783115;
 //BA.debugLineNum = 205783115;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 45:
//C
this.state = 50;
RDebugUtils.currentLine=205783117;
 //BA.debugLineNum = 205783117;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=205783119;
 //BA.debugLineNum = 205783119;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=205783122;
 //BA.debugLineNum = 205783122;BA.debugLine="TipoDato=\"\"";
_tipodato = "";
 if (true) break;

case 50:
//C
this.state = 53;
;
RDebugUtils.currentLine=205783124;
 //BA.debugLineNum = 205783124;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDato)";
_minfocamposql.Put((Object)("TipoDato"),(Object)(_tipodato));
RDebugUtils.currentLine=205783125;
 //BA.debugLineNum = 205783125;BA.debugLine="AddItem(mInfoCampoSQL)";
_additem(_minfocamposql);
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=205783127;
 //BA.debugLineNum = 205783127;BA.debugLine="Continue";
this.state = 66;
if (true) break;;
 if (true) break;

case 53:
//C
this.state = 66;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=205783131;
 //BA.debugLineNum = 205783131;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";

case 54:
//for
this.state = 61;
step68 = 1;
limit68 = (int) (_lstnombrescamposclvnocalculados.getSize()-1);
_i = (int) (0) ;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 61;
if ((step68 > 0 && _i <= limit68) || (step68 < 0 && _i >= limit68)) this.state = 56;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step68)) ;
if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=205783132;
 //BA.debugLineNum = 205783132;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
if (true) break;

case 57:
//if
this.state = 60;
if (_lstcampossql.IndexOf(_lstnombrescamposclvnocalculados.Get(_i))==-1) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=205783133;
 //BA.debugLineNum = 205783133;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=205783134;
 //BA.debugLineNum = 205783134;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=205783135;
 //BA.debugLineNum = 205783135;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
_sb.Append("El campo no calculado "+BA.ObjectToString(_lstnombrescamposclvnocalculados.Get(_i))+" no ha sido devuelto por la SQL.");
RDebugUtils.currentLine=205783136;
 //BA.debugLineNum = 205783136;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
_sb.Append(" Si esto es un error, se debería eliminar el campo del CLV.");
RDebugUtils.currentLine=205783139;
 //BA.debugLineNum = 205783139;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
_msa = parent._xui.MsgboxAsync(ba,_sb.ToString(),"Aviso");
RDebugUtils.currentLine=205783140;
 //BA.debugLineNum = 205783140;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cargacamposjrdctable"), _msa);
this.state = 69;
return;
case 69:
//C
this.state = 60;
_result = (int) result[0];
;
 if (true) break;

case 60:
//C
this.state = 68;
;
 if (true) break;
if (true) break;

case 61:
//C
this.state = 62;
;
RDebugUtils.currentLine=205783145;
 //BA.debugLineNum = 205783145;BA.debugLine="dragger.AddDragButtons";
parent._dragger._adddragbuttons /*String*/ (null);
 if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = -1;
;
RDebugUtils.currentLine=205783148;
 //BA.debugLineNum = 205783148;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCTable_Complete";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,jamtableviewcamposbuilder.getObject(),"CargaCamposJRDCTable_Completed");
RDebugUtils.currentLine=205783149;
 //BA.debugLineNum = 205783149;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnorigenjrdc_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btnorigenjrdc_click", true))
	 {return ((String) Debug.delegate(ba, "btnorigenjrdc_click", null));}
RDebugUtils.currentLine=207028224;
 //BA.debugLineNum = 207028224;BA.debugLine="private Sub btnOrigenJRDC_Click";
RDebugUtils.currentLine=207028226;
 //BA.debugLineNum = 207028226;BA.debugLine="End Sub";
return "";
}
public static void  _btnvaloresestilodefecto_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btnvaloresestilodefecto_click", true))
	 {Debug.delegate(ba, "btnvaloresestilodefecto_click", null); return;}
ResumableSub_btnValoresEstiloDefecto_Click rsub = new ResumableSub_btnValoresEstiloDefecto_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnValoresEstiloDefecto_Click extends BA.ResumableSub {
public ResumableSub_btnValoresEstiloDefecto_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
Object _msa = null;
int _result = 0;
anywheresoftware.b4j.objects.ButtonWrapper _b = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=207945730;
 //BA.debugLineNum = 207945730;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Funcion desh";
_msa = parent._xui.MsgboxAsync(ba,"Funcion deshabilitada desde v6.43.","Aviso");
RDebugUtils.currentLine=207945731;
 //BA.debugLineNum = 207945731;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btnvaloresestilodefecto_click"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[0];
;
RDebugUtils.currentLine=207945732;
 //BA.debugLineNum = 207945732;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=207945734;
 //BA.debugLineNum = 207945734;BA.debugLine="Dim b As Button=Sender";
_b = new anywheresoftware.b4j.objects.ButtonWrapper();
_b = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=207945735;
 //BA.debugLineNum = 207945735;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(b";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_b.getObject())));
RDebugUtils.currentLine=207945736;
 //BA.debugLineNum = 207945736;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=207945742;
 //BA.debugLineNum = 207945742;BA.debugLine="clvIV.lblColorBorde.Color=0xFFD3D3D3";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xffd3d3d3));
RDebugUtils.currentLine=207945744;
 //BA.debugLineNum = 207945744;BA.debugLine="clvIV.txtRGBColorBorde.Text=GetCssColorStringFrom";
_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(((int)0xffd3d3d3)));
RDebugUtils.currentLine=207945745;
 //BA.debugLineNum = 207945745;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x00ffffff));
RDebugUtils.currentLine=207945747;
 //BA.debugLineNum = 207945747;BA.debugLine="clvIV.txtRGBColorFondo.Text=\"transparent\"";
_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("transparent");
RDebugUtils.currentLine=207945748;
 //BA.debugLineNum = 207945748;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff000000));
RDebugUtils.currentLine=207945750;
 //BA.debugLineNum = 207945750;BA.debugLine="clvIV.txtRGBColorTexto.Text=\"black\"";
_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("black");
RDebugUtils.currentLine=207945752;
 //BA.debugLineNum = 207945752;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-LEFT\"";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)("CENTER-LEFT"));
RDebugUtils.currentLine=207945753;
 //BA.debugLineNum = 207945753;BA.debugLine="clvIV.B4XPlusMinusAnchoBorde.SelectedValue=0.5";
_clviv.B4XPlusMinusAnchoBorde /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,(Object)(0.5));
RDebugUtils.currentLine=207945754;
 //BA.debugLineNum = 207945754;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnvaloresestilodefectotodos_click() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "btnvaloresestilodefectotodos_click", true))
	 {Debug.delegate(ba, "btnvaloresestilodefectotodos_click", null); return;}
ResumableSub_btnValoresEstiloDefectoTodos_Click rsub = new ResumableSub_btnValoresEstiloDefectoTodos_Click(null);
rsub.resume(ba, null);
}
public static class ResumableSub_btnValoresEstiloDefectoTodos_Click extends BA.ResumableSub {
public ResumableSub_btnValoresEstiloDefectoTodos_Click(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
Object _msa = null;
int _result = 0;
int _i = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208011266;
 //BA.debugLineNum = 208011266;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Funcion desh";
_msa = parent._xui.MsgboxAsync(ba,"Funcion deshabilitada desde v6.43.","Aviso");
RDebugUtils.currentLine=208011267;
 //BA.debugLineNum = 208011267;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "btnvaloresestilodefectotodos_click"), _msa);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208011268;
 //BA.debugLineNum = 208011268;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=208011270;
 //BA.debugLineNum = 208011270;BA.debugLine="For i=0 To clvListaCampos.Size-1";
if (true) break;

case 1:
//for
this.state = 4;
step4 = 1;
limit4 = (int) (parent._clvlistacampos._getsize()-1);
_i = (int) (0) ;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 4;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 7:
//C
this.state = 6;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 3:
//C
this.state = 7;
RDebugUtils.currentLine=208011271;
 //BA.debugLineNum = 208011271;BA.debugLine="Dim clviv As clvCamposBuilderItemValue=clvListaC";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=208011276;
 //BA.debugLineNum = 208011276;BA.debugLine="clviv.lblColorBorde.Color=0xFFD3D3D3";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xffd3d3d3));
RDebugUtils.currentLine=208011278;
 //BA.debugLineNum = 208011278;BA.debugLine="clviv.txtRGBColorBorde.Text=GetCssColorStringFro";
_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(((int)0xffd3d3d3)));
RDebugUtils.currentLine=208011279;
 //BA.debugLineNum = 208011279;BA.debugLine="clviv.lblColorFondo.Color=0x00FFFFFF";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x00ffffff));
RDebugUtils.currentLine=208011281;
 //BA.debugLineNum = 208011281;BA.debugLine="clviv.txtRGBColorFondo.Text=\"transparent\"";
_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("transparent");
RDebugUtils.currentLine=208011282;
 //BA.debugLineNum = 208011282;BA.debugLine="clviv.lblColorTexto.Color=0xFF000000";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff000000));
RDebugUtils.currentLine=208011284;
 //BA.debugLineNum = 208011284;BA.debugLine="clviv.txtRGBColorTexto.Text=\"black\"";
_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("black");
RDebugUtils.currentLine=208011286;
 //BA.debugLineNum = 208011286;BA.debugLine="clviv.cboAlineacionColumna.Value=\"CENTER-LEFT\"";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)("CENTER-LEFT"));
RDebugUtils.currentLine=208011287;
 //BA.debugLineNum = 208011287;BA.debugLine="clviv.B4XPlusMinusAnchoBorde.SelectedValue=0.5";
_clviv.B4XPlusMinusAnchoBorde /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,(Object)(0.5));
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=208011289;
 //BA.debugLineNum = 208011289;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cargadatosjrdcquerytop1(String _rdclink,String _comandoconfigproperties,Object[] _parametros,Object _callmodule) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cargadatosjrdcquerytop1", true))
	 {Debug.delegate(ba, "cargadatosjrdcquerytop1", new Object[] {_rdclink,_comandoconfigproperties,_parametros,_callmodule}); return;}
ResumableSub_CargaDatosJRDCQueryTop1 rsub = new ResumableSub_CargaDatosJRDCQueryTop1(null,_rdclink,_comandoconfigproperties,_parametros,_callmodule);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaDatosJRDCQueryTop1 extends BA.ResumableSub {
public ResumableSub_CargaDatosJRDCQueryTop1(b4j.docU.jamtableviewcamposbuilder parent,String _rdclink,String _comandoconfigproperties,Object[] _parametros,Object _callmodule) {
this.parent = parent;
this._rdclink = _rdclink;
this._comandoconfigproperties = _comandoconfigproperties;
this._parametros = _parametros;
this._callmodule = _callmodule;
}
b4j.docU.jamtableviewcamposbuilder parent;
String _rdclink;
String _comandoconfigproperties;
Object[] _parametros;
Object _callmodule;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
b4j.docU.dbrequestmanager _req = null;
b4j.docU.main._dbcommand _cmd = null;
b4j.docU.httpjob _j = null;
b4j.docU.main._dbresult _res = null;
Object[] _record = null;
anywheresoftware.b4a.objects.collections.Map _mreg = null;
int _i = 0;
int step20;
int limit20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=207880194;
 //BA.debugLineNum = 207880194;BA.debugLine="Dim lstRes As List";
_lstres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=207880195;
 //BA.debugLineNum = 207880195;BA.debugLine="lstRes.Initialize";
_lstres.Initialize();
RDebugUtils.currentLine=207880196;
 //BA.debugLineNum = 207880196;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=207880197;
 //BA.debugLineNum = 207880197;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=207880198;
 //BA.debugLineNum = 207880198;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=207880199;
 //BA.debugLineNum = 207880199;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=207880200;
 //BA.debugLineNum = 207880200;BA.debugLine="m.Put(\"lstRes\",lstRes)";
_m.Put((Object)("lstRes"),(Object)(_lstres.getObject()));
RDebugUtils.currentLine=207880201;
 //BA.debugLineNum = 207880201;BA.debugLine="Dim req As DBRequestManager = CreateRequest(rdcLi";
_req = _createrequest(_rdclink);
RDebugUtils.currentLine=207880202;
 //BA.debugLineNum = 207880202;BA.debugLine="Dim cmd As DBCommand = CreateCommand(ComandoConfi";
_cmd = _createcommand(_comandoconfigproperties,_parametros);
RDebugUtils.currentLine=207880204;
 //BA.debugLineNum = 207880204;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cargadatosjrdcquerytop1"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),anywheresoftware.b4a.keywords.Common.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=207880205;
 //BA.debugLineNum = 207880205;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 16;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 15;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=207880206;
 //BA.debugLineNum = 207880206;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=207880207;
 //BA.debugLineNum = 207880207;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=207880208;
 //BA.debugLineNum = 207880208;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cargadatosjrdcquerytop1"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_res = (b4j.docU.main._dbresult) result[0];
;
RDebugUtils.currentLine=207880210;
 //BA.debugLineNum = 207880210;BA.debugLine="If res.Rows.Size>0 Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=207880211;
 //BA.debugLineNum = 207880211;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=207880213;
 //BA.debugLineNum = 207880213;BA.debugLine="Dim record() As Object=res.Rows.Get(0)";
_record = (Object[])(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=207880214;
 //BA.debugLineNum = 207880214;BA.debugLine="Dim mReg As Map";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=207880215;
 //BA.debugLineNum = 207880215;BA.debugLine="mReg.Initialize";
_mreg.Initialize();
RDebugUtils.currentLine=207880216;
 //BA.debugLineNum = 207880216;BA.debugLine="For i=0 To  res.Columns.Size-1";
if (true) break;

case 7:
//for
this.state = 10;
step20 = 1;
limit20 = (int) (_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_i = (int) (0) ;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if ((step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20)) this.state = 9;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step20)) ;
if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=207880217;
 //BA.debugLineNum = 207880217;BA.debugLine="mReg.Put(res.Columns.GetKeyAt(i),record(i))";
_mreg.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),_record[_i]);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=207880219;
 //BA.debugLineNum = 207880219;BA.debugLine="lstRes.Add(mReg)";
_lstres.Add((Object)(_mreg.getObject()));
 if (true) break;

case 12:
//C
this.state = 13;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=207880226;
 //BA.debugLineNum = 207880226;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=207880227;
 //BA.debugLineNum = 207880227;BA.debugLine="CallSubDelayed2(CallModule, \"CargaDatosJRDCQueryT";
anywheresoftware.b4a.keywords.Common.CallSubDelayed2(ba,_callmodule,"CargaDatosJRDCQueryTop1_Completed",(Object)(_m));
RDebugUtils.currentLine=207880229;
 //BA.debugLineNum = 207880229;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _nombrescamposclvnocalculados() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "nombrescamposclvnocalculados", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "nombrescamposclvnocalculados", null));}
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvnocalculados = null;
anywheresoftware.b4a.objects.collections.List _lstcamposenclv = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=205914112;
 //BA.debugLineNum = 205914112;BA.debugLine="private Sub NombresCamposCLVNoCalculados As List";
RDebugUtils.currentLine=205914113;
 //BA.debugLineNum = 205914113;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205914114;
 //BA.debugLineNum = 205914114;BA.debugLine="lstNombresCamposCLVNoCalculados.Initialize";
_lstnombrescamposclvnocalculados.Initialize();
RDebugUtils.currentLine=205914115;
 //BA.debugLineNum = 205914115;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
_lstcamposenclv = new anywheresoftware.b4a.objects.collections.List();
_lstcamposenclv = _cargacamposclv();
RDebugUtils.currentLine=205914116;
 //BA.debugLineNum = 205914116;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstcamposenclv.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=205914117;
 //BA.debugLineNum = 205914117;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstcamposenclv.Get(_i)));
RDebugUtils.currentLine=205914118;
 //BA.debugLineNum = 205914118;BA.debugLine="If False=m.Get(\"CampoCalculado\") Then";
if (anywheresoftware.b4a.keywords.Common.False==BA.ObjectToBoolean(_m.Get((Object)("CampoCalculado")))) { 
RDebugUtils.currentLine=205914119;
 //BA.debugLineNum = 205914119;BA.debugLine="lstNombresCamposCLVNoCalculados.Add(m.Get(\"Camp";
_lstnombrescamposclvnocalculados.Add(_m.Get((Object)("Campo")));
 };
 }
};
RDebugUtils.currentLine=205914122;
 //BA.debugLineNum = 205914122;BA.debugLine="Return lstNombresCamposCLVNoCalculados";
if (true) return _lstnombrescamposclvnocalculados;
RDebugUtils.currentLine=205914123;
 //BA.debugLineNum = 205914123;BA.debugLine="End Sub";
return null;
}
public static String  _cargacampostablasqlite(anywheresoftware.b4a.objects.collections.List _lstcampostablasqlite) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacampostablasqlite", true))
	 {return ((String) Debug.delegate(ba, "cargacampostablasqlite", new Object[] {_lstcampostablasqlite}));}
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvnocalculados = null;
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _nombrecampoquerysql = "";
anywheresoftware.b4a.objects.collections.Map _minfocamposql = null;
String _tipodatosqlite = "";
RDebugUtils.currentLine=205651968;
 //BA.debugLineNum = 205651968;BA.debugLine="private Sub CargaCamposTablaSQLite(lstCamposTablaS";
RDebugUtils.currentLine=205651969;
 //BA.debugLineNum = 205651969;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nombr";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvnocalculados = _nombrescamposclvnocalculados();
RDebugUtils.currentLine=205651970;
 //BA.debugLineNum = 205651970;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205651971;
 //BA.debugLineNum = 205651971;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=205651972;
 //BA.debugLineNum = 205651972;BA.debugLine="For i=0 To lstCamposTablaSQLite.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstcampostablasqlite.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=205651973;
 //BA.debugLineNum = 205651973;BA.debugLine="Dim mRes As Map=lstCamposTablaSQLite.Get(i)";
_mres = new anywheresoftware.b4a.objects.collections.Map();
_mres = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstcampostablasqlite.Get(_i)));
RDebugUtils.currentLine=205651974;
 //BA.debugLineNum = 205651974;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"name";
_nombrecampoquerysql = BA.ObjectToString(_mres.Get((Object)("name")));
RDebugUtils.currentLine=205651975;
 //BA.debugLineNum = 205651975;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
_lstcampossql.Add((Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=205651977;
 //BA.debugLineNum = 205651977;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nombr";
if (_lstnombrescamposclvnocalculados.IndexOf((Object)(_nombrecampoquerysql))==-1) { 
RDebugUtils.currentLine=205651978;
 //BA.debugLineNum = 205651978;BA.debugLine="Dim mInfoCampoSQL As Map";
_minfocamposql = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=205651979;
 //BA.debugLineNum = 205651979;BA.debugLine="mInfoCampoSQL.Initialize";
_minfocamposql.Initialize();
RDebugUtils.currentLine=205651980;
 //BA.debugLineNum = 205651980;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",NombreCampoQuerySQL)";
_minfocamposql.Put((Object)("Campo"),(Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=205651981;
 //BA.debugLineNum = 205651981;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",NombreCampoQuery";
_minfocamposql.Put((Object)("AliasCampo"),(Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=205651982;
 //BA.debugLineNum = 205651982;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",NombreCam";
_minfocamposql.Put((Object)("EncabezadoColumna"),(Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=205651983;
 //BA.debugLineNum = 205651983;BA.debugLine="mInfoCampoSQL.Put(\"NombreCampoDialogosAux\",Nomb";
_minfocamposql.Put((Object)("NombreCampoDialogosAux"),(Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=205651984;
 //BA.debugLineNum = 205651984;BA.debugLine="Dim TipoDatoSQLite As String=mRes.Get(\"type\")";
_tipodatosqlite = BA.ObjectToString(_mres.Get((Object)("type")));
RDebugUtils.currentLine=205651985;
 //BA.debugLineNum = 205651985;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDatoSQLite)";
_minfocamposql.Put((Object)("TipoDato"),(Object)(_tipodatosqlite));
RDebugUtils.currentLine=205651986;
 //BA.debugLineNum = 205651986;BA.debugLine="AddItem(mInfoCampoSQL)";
_additem(_minfocamposql);
 }else {
RDebugUtils.currentLine=205651988;
 //BA.debugLineNum = 205651988;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=205651991;
 //BA.debugLineNum = 205651991;BA.debugLine="End Sub";
return "";
}
public static b4j.docU.dbrequestmanager  _createrequest(String _rdclink) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "createrequest", true))
	 {return ((b4j.docU.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_rdclink}));}
b4j.docU.dbrequestmanager _req = null;
RDebugUtils.currentLine=207749120;
 //BA.debugLineNum = 207749120;BA.debugLine="private Sub CreateRequest(rdcLink As String) As DB";
RDebugUtils.currentLine=207749121;
 //BA.debugLineNum = 207749121;BA.debugLine="Dim req As DBRequestManager";
_req = new b4j.docU.dbrequestmanager();
RDebugUtils.currentLine=207749122;
 //BA.debugLineNum = 207749122;BA.debugLine="req.Initialize(Me, rdcLink)";
_req._initialize /*String*/ (null,ba,jamtableviewcamposbuilder.getObject(),_rdclink);
RDebugUtils.currentLine=207749123;
 //BA.debugLineNum = 207749123;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=207749124;
 //BA.debugLineNum = 207749124;BA.debugLine="End Sub";
return null;
}
public static b4j.docU.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "createcommand", true))
	 {return ((b4j.docU.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4j.docU.main._dbcommand _cmd = null;
RDebugUtils.currentLine=207814656;
 //BA.debugLineNum = 207814656;BA.debugLine="private Sub CreateCommand(name As String, Paramete";
RDebugUtils.currentLine=207814657;
 //BA.debugLineNum = 207814657;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4j.docU.main._dbcommand();
RDebugUtils.currentLine=207814658;
 //BA.debugLineNum = 207814658;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=207814659;
 //BA.debugLineNum = 207814659;BA.debugLine="cmd.Name = name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=207814660;
 //BA.debugLineNum = 207814660;BA.debugLine="If Parameters <> Null Then";
if (_parameters!= null) { 
RDebugUtils.currentLine=207814661;
 //BA.debugLineNum = 207814661;BA.debugLine="cmd.Parameters = Parameters";
_cmd.Parameters /*Object[]*/  = _parameters;
 };
RDebugUtils.currentLine=207814663;
 //BA.debugLineNum = 207814663;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=207814664;
 //BA.debugLineNum = 207814664;BA.debugLine="End Sub";
return null;
}
public static String  _cboalineacioncolumna_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cboalineacioncolumna_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cboalineacioncolumna_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=207355904;
 //BA.debugLineNum = 207355904;BA.debugLine="private Sub cboAlineacionColumna_ValueChanged (Val";
RDebugUtils.currentLine=207355905;
 //BA.debugLineNum = 207355905;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=207355906;
 //BA.debugLineNum = 207355906;BA.debugLine="End Sub";
return "";
}
public static String  _cbocampo_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cbocampo_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cbocampo_valuechanged", new Object[] {_value}));}
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
RDebugUtils.currentLine=206766080;
 //BA.debugLineNum = 206766080;BA.debugLine="private Sub cboCampo_ValueChanged (Value As Object";
RDebugUtils.currentLine=206766081;
 //BA.debugLineNum = 206766081;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=206766082;
 //BA.debugLineNum = 206766082;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
_index = _clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba))));
RDebugUtils.currentLine=206766083;
 //BA.debugLineNum = 206766083;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(_clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=206766085;
 //BA.debugLineNum = 206766085;BA.debugLine="If Not(clvIV.chkBoxCampoCalculado.Checked) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked())) { 
RDebugUtils.currentLine=206766086;
 //BA.debugLineNum = 206766086;BA.debugLine="clvIV.txtEncabezadoColumna.Text=Value";
_clviv.txtEncabezadoColumna /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_value));
RDebugUtils.currentLine=206766087;
 //BA.debugLineNum = 206766087;BA.debugLine="clvIV.txtAliasCampo.Text=Value";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_value));
RDebugUtils.currentLine=206766088;
 //BA.debugLineNum = 206766088;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=Value";
_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_value));
RDebugUtils.currentLine=206766092;
 //BA.debugLineNum = 206766092;BA.debugLine="clvIV.txtNombreCampoDialogosAux.Text=Value";
_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_value));
 };
RDebugUtils.currentLine=206766095;
 //BA.debugLineNum = 206766095;BA.debugLine="End Sub";
return "";
}
public static void  _cbotipocontrolfiltro_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cbotipocontrolfiltro_valuechanged", true))
	 {Debug.delegate(ba, "cbotipocontrolfiltro_valuechanged", new Object[] {_value}); return;}
ResumableSub_cboTipoControlFiltro_ValueChanged rsub = new ResumableSub_cboTipoControlFiltro_ValueChanged(null,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_cboTipoControlFiltro_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoControlFiltro_ValueChanged(b4j.docU.jamtableviewcamposbuilder parent,Object _value) {
this.parent = parent;
this._value = _value;
}
b4j.docU.jamtableviewcamposbuilder parent;
Object _value;
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotcf = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206307329;
 //BA.debugLineNum = 206307329;BA.debugLine="If CargandoDatos Then Return";
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
RDebugUtils.currentLine=206307330;
 //BA.debugLineNum = 206307330;BA.debugLine="If Value=\"\" Or Value=Null Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if ((_value).equals((Object)("")) || _value== null) { 
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
RDebugUtils.currentLine=206307331;
 //BA.debugLineNum = 206307331;BA.debugLine="Dim cboTCF As ComboBox=Sender";
_cbotcf = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotcf = (anywheresoftware.b4j.objects.ComboBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ComboBoxWrapper(), (javafx.scene.control.ComboBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=206307332;
 //BA.debugLineNum = 206307332;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cbotcf.getObject())));
RDebugUtils.currentLine=206307333;
 //BA.debugLineNum = 206307333;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=206307334;
 //BA.debugLineNum = 206307334;BA.debugLine="If Value=TipoControlFiltro_TextFieldButton And cl";
if (true) break;

case 13:
//if
this.state = 16;
if ((_value).equals((Object)(parent._tipocontrolfiltro_textfieldbutton)) && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=206307335;
 //BA.debugLineNum = 206307335;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control filtro = "+parent._tipocontrolfiltro_textfieldbutton+" sólo es válidos para campos tipo fecha.","");
RDebugUtils.currentLine=206307336;
 //BA.debugLineNum = 206307336;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 16;
_result = (int) result[0];
;
RDebugUtils.currentLine=206307337;
 //BA.debugLineNum = 206307337;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=206307339;
 //BA.debugLineNum = 206307339;BA.debugLine="If (Value<>TipoControlFiltro_TextFieldButton And";

case 16:
//if
this.state = 19;
if (((_value).equals((Object)(parent._tipocontrolfiltro_textfieldbutton)) == false && (_value).equals((Object)("")) == false) && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=206307340;
 //BA.debugLineNum = 206307340;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
_msa = parent._xui.MsgboxAsync(ba,"Los campos tipo fecha sólo admiten tipo de control filtro = "+parent._tipocontrolfiltro_textfieldbutton+".","");
RDebugUtils.currentLine=206307341;
 //BA.debugLineNum = 206307341;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_result = (int) result[0];
;
RDebugUtils.currentLine=206307342;
 //BA.debugLineNum = 206307342;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=206307344;
 //BA.debugLineNum = 206307344;BA.debugLine="If Value=TipoControlFiltro_CheckBox And clvIV.cbo";

case 19:
//if
this.state = 22;
if ((_value).equals((Object)(parent._tipocontrolfiltro_checkbox)) && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=206307345;
 //BA.debugLineNum = 206307345;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control filtro = "+parent._tipocontrolfiltro_checkbox+" sólo es válidos para campos con tipo de dato = INTEGER.","");
RDebugUtils.currentLine=206307346;
 //BA.debugLineNum = 206307346;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
_result = (int) result[0];
;
RDebugUtils.currentLine=206307347;
 //BA.debugLineNum = 206307347;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=206307349;
 //BA.debugLineNum = 206307349;BA.debugLine="If (Value<>TipoControlFiltro_CheckBox And Value<>";

case 22:
//if
this.state = 25;
if (((_value).equals((Object)(parent._tipocontrolfiltro_checkbox)) == false && (_value).equals((Object)("")) == false) && _clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=206307350;
 //BA.debugLineNum = 206307350;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
_msa = parent._xui.MsgboxAsync(ba,"Los campos tipo booleano sólo admiten tipo de control filtro = "+parent._tipocontrolfiltro_checkbox+".","");
RDebugUtils.currentLine=206307351;
 //BA.debugLineNum = 206307351;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 25;
_result = (int) result[0];
;
RDebugUtils.currentLine=206307352;
 //BA.debugLineNum = 206307352;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=206307354;
 //BA.debugLineNum = 206307354;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _cbotipodato_valuechanged(Object _value) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "cbotipodato_valuechanged", true))
	 {Debug.delegate(ba, "cbotipodato_valuechanged", new Object[] {_value}); return;}
ResumableSub_cboTipoDato_ValueChanged rsub = new ResumableSub_cboTipoDato_ValueChanged(null,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_cboTipoDato_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoDato_ValueChanged(b4j.docU.jamtableviewcamposbuilder parent,Object _value) {
this.parent = parent;
this._value = _value;
}
b4j.docU.jamtableviewcamposbuilder parent;
Object _value;
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotd = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206700545;
 //BA.debugLineNum = 206700545;BA.debugLine="If CargandoDatos Then Return";
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
RDebugUtils.currentLine=206700546;
 //BA.debugLineNum = 206700546;BA.debugLine="Dim cboTD As ComboBox=Sender";
_cbotd = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotd = (anywheresoftware.b4j.objects.ComboBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ComboBoxWrapper(), (javafx.scene.control.ComboBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=206700547;
 //BA.debugLineNum = 206700547;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cbotd.getObject())));
RDebugUtils.currentLine=206700548;
 //BA.debugLineNum = 206700548;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=206700549;
 //BA.debugLineNum = 206700549;BA.debugLine="If cboTD.Value<>\"REAL\" And clvIV.chkBoxEsFecha.Ch";
if (true) break;

case 7:
//if
this.state = 12;
if ((_cbotd.getValue()).equals((Object)("REAL")) == false && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(anywheresoftware.b4a.keywords.Common.False);
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=206700550;
 //BA.debugLineNum = 206700550;BA.debugLine="If  cboTD.value<>\"INTEGER\" And clvIV.cboTipoContr";
if (true) break;

case 13:
//if
this.state = 16;
if ((_cbotd.getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrolfiltro_checkbox))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=206700551;
 //BA.debugLineNum = 206700551;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=206700552;
 //BA.debugLineNum = 206700552;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control de filtro checkbox, sólo es compatible con tipo de datos INTEGER. Se quita el tipo de control de filtro.","Aviso");
RDebugUtils.currentLine=206700553;
 //BA.debugLineNum = 206700553;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "cbotipodato_valuechanged"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 16;
_result = (int) result[0];
;
RDebugUtils.currentLine=206700554;
 //BA.debugLineNum = 206700554;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=206700556;
 //BA.debugLineNum = 206700556;BA.debugLine="If cboTD.Value=\"REAL\" Or cboTD.Value=\"INTEGER\" Th";

case 16:
//if
this.state = 19;
if ((_cbotd.getValue()).equals((Object)("REAL")) || (_cbotd.getValue()).equals((Object)("INTEGER"))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=206700557;
 //BA.debugLineNum = 206700557;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER-RIGHT\"";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)("CENTER-RIGHT"));
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=206700559;
 //BA.debugLineNum = 206700559;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkchanges() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "checkchanges", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkchanges", null));}
ResumableSub_CheckChanges rsub = new ResumableSub_CheckChanges(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckChanges extends BA.ResumableSub {
public ResumableSub_CheckChanges(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _haycambios = false;
String _sclv = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _msclv = null;
anywheresoftware.b4a.objects.collections.Map _mscheck = null;
boolean _check1 = false;
boolean _check2 = false;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206045185;
 //BA.debugLineNum = 206045185;BA.debugLine="If CurrentFile=\"\" Then Return False";
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
RDebugUtils.currentLine=206045187;
 //BA.debugLineNum = 206045187;BA.debugLine="Dim HayCambios As Boolean=False";
_haycambios = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=206045191;
 //BA.debugLineNum = 206045191;BA.debugLine="Dim sCLV As String = ExportToString";
_sclv = _exporttostring();
RDebugUtils.currentLine=206045193;
 //BA.debugLineNum = 206045193;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=206045194;
 //BA.debugLineNum = 206045194;BA.debugLine="parser.Initialize(sCLV)";
_parser.Initialize(_sclv);
RDebugUtils.currentLine=206045195;
 //BA.debugLineNum = 206045195;BA.debugLine="Dim msCLV As Map = parser.NextObject";
_msclv = new anywheresoftware.b4a.objects.collections.Map();
_msclv = _parser.NextObject();
RDebugUtils.currentLine=206045197;
 //BA.debugLineNum = 206045197;BA.debugLine="parser.Initialize(CurrentFileString)";
_parser.Initialize(parent._currentfilestring);
RDebugUtils.currentLine=206045198;
 //BA.debugLineNum = 206045198;BA.debugLine="Dim msCheck As Map = parser.NextObject";
_mscheck = new anywheresoftware.b4a.objects.collections.Map();
_mscheck = _parser.NextObject();
RDebugUtils.currentLine=206045201;
 //BA.debugLineNum = 206045201;BA.debugLine="msCLV.Remove(\"FechaUltimaModificacion\")";
_msclv.Remove((Object)("FechaUltimaModificacion"));
RDebugUtils.currentLine=206045202;
 //BA.debugLineNum = 206045202;BA.debugLine="msCheck.Remove(\"FechaUltimaModificacion\")";
_mscheck.Remove((Object)("FechaUltimaModificacion"));
RDebugUtils.currentLine=206045204;
 //BA.debugLineNum = 206045204;BA.debugLine="Dim Check1 As Boolean=Comparar2Mapas(msCLV,msChec";
_check1 = _comparar2mapas(_msclv,_mscheck);
RDebugUtils.currentLine=206045205;
 //BA.debugLineNum = 206045205;BA.debugLine="Dim Check2 As Boolean=Comparar2Mapas(msCheck,msCL";
_check2 = _comparar2mapas(_mscheck,_msclv);
RDebugUtils.currentLine=206045207;
 //BA.debugLineNum = 206045207;BA.debugLine="HayCambios=(Not(Check1) Or Not(Check2))";
_haycambios = (anywheresoftware.b4a.keywords.Common.Not(_check1) || anywheresoftware.b4a.keywords.Common.Not(_check2));
RDebugUtils.currentLine=206045210;
 //BA.debugLineNum = 206045210;BA.debugLine="If HayCambios Then";
if (true) break;

case 7:
//if
this.state = 22;
if (_haycambios) { 
this.state = 9;
}else {
this.state = 21;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=206045211;
 //BA.debugLineNum = 206045211;BA.debugLine="Wait For (Dialog.Show(\"¿Grabar Cambios?\", \"Sí\",";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkchanges"), parent._dialog._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)("¿Grabar Cambios?"),(Object)("Sí"),(Object)("No"),(Object)("Cancel")));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_result = (int) result[0];
;
RDebugUtils.currentLine=206045212;
 //BA.debugLineNum = 206045212;BA.debugLine="Select Result";
if (true) break;

case 10:
//select
this.state = 19;
switch (BA.switchObjectToInt(_result,parent._xui.DialogResponse_Cancel,parent._xui.DialogResponse_Positive,parent._xui.DialogResponse_Negative)) {
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
default: {
this.state = 18;
if (true) break;
}
}
if (true) break;

case 12:
//C
this.state = 19;
RDebugUtils.currentLine=206045214;
 //BA.debugLineNum = 206045214;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 14:
//C
this.state = 19;
RDebugUtils.currentLine=206045216;
 //BA.debugLineNum = 206045216;BA.debugLine="mnuSave_Action";
_mnusave_action();
RDebugUtils.currentLine=206045217;
 //BA.debugLineNum = 206045217;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=206045219;
 //BA.debugLineNum = 206045219;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=206045221;
 //BA.debugLineNum = 206045221;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=206045224;
 //BA.debugLineNum = 206045224;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=206045226;
 //BA.debugLineNum = 206045226;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _exporttostring() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "exporttostring", true))
	 {return ((String) Debug.delegate(ba, "exporttostring", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=204865536;
 //BA.debugLineNum = 204865536;BA.debugLine="private Sub ExportToString As String";
RDebugUtils.currentLine=204865537;
 //BA.debugLineNum = 204865537;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=204865538;
 //BA.debugLineNum = 204865538;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=204865539;
 //BA.debugLineNum = 204865539;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=204865540;
 //BA.debugLineNum = 204865540;BA.debugLine="Items.Add(ItemValueToMap(clvListaCampos.GetValue";
_items.Add((Object)(_itemvaluetomap((b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(_clvlistacampos._getvalue(_i))).getObject()));
 }
};
RDebugUtils.currentLine=204865552;
 //BA.debugLineNum = 204865552;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=204865558;
 //BA.debugLineNum = 204865558;BA.debugLine="jg.Initialize(CreateMap(\"FechaUltimaModificacion\"";
_jg.Initialize(anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("FechaUltimaModificacion"),(Object)(anywheresoftware.b4a.keywords.Common.DateTime.getNow()),(Object)("TipoOrigenDatos"),(Object)(_datosorigendatos.TipoOrigenDatos /*String*/ ),(Object)("IpJRDC"),(Object)(_datosorigendatos.IpJRDC /*String*/ ),(Object)("PuertoJRDC"),(Object)(_datosorigendatos.PuertoJRDC /*String*/ ),(Object)("ComandoJRDC"),(Object)(_datosorigendatos.ComandoJRDC /*String*/ ),(Object)("ParametrosJRDC"),(Object)(_datosorigendatos.ParametrosJRDC /*String*/ ),(Object)("ColorFondoEncabezados"),(Object)(_txtrgbcolorfondoencabezados.getText()),(Object)("ColorTextoEncabezados"),(Object)(_txtrgbcolortextoencabezados.getText()),(Object)("ColorFondoPanelInfo"),(Object)(_txtrgbcolorfondopanelinfo.getText()),(Object)("ColorTextoPanelInfo"),(Object)(_txtrgbcolortextopanelinfo.getText()),(Object)("ColorFondoFilasImpares"),(Object)(_txtrgbcolorfondofilasimpares.getText()),(Object)("ColorFondoFilasPares"),(Object)(_txtrgbcolorfondofilaspares.getText()),(Object)("Items"),(Object)(_items.getObject())}));
RDebugUtils.currentLine=204865565;
 //BA.debugLineNum = 204865565;BA.debugLine="Return jg.ToPrettyString(4)";
if (true) return _jg.ToPrettyString((int) (4));
RDebugUtils.currentLine=204865566;
 //BA.debugLineNum = 204865566;BA.debugLine="End Sub";
return "";
}
public static boolean  _comparar2mapas(anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "comparar2mapas", true))
	 {return ((Boolean) Debug.delegate(ba, "comparar2mapas", new Object[] {_map1,_map2}));}
boolean _flagallkeysok = false;
String _key1 = "";
String _value1 = "";
boolean _keyvaluesame = false;
String _value2 = "";
String _key2 = "";
RDebugUtils.currentLine=207421440;
 //BA.debugLineNum = 207421440;BA.debugLine="Sub Comparar2Mapas(Map1 As Map, Map2 As Map) As Bo";
RDebugUtils.currentLine=207421441;
 //BA.debugLineNum = 207421441;BA.debugLine="Dim FlagAllkeysOK As Boolean=True";
_flagallkeysok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=207421442;
 //BA.debugLineNum = 207421442;BA.debugLine="For Each Key1 As String In Map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _map1.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key1 = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=207421443;
 //BA.debugLineNum = 207421443;BA.debugLine="Dim Value1 As String = Map1.Get(Key1)";
_value1 = BA.ObjectToString(_map1.Get((Object)(_key1)));
RDebugUtils.currentLine=207421444;
 //BA.debugLineNum = 207421444;BA.debugLine="Dim KeyValueSame As Boolean = False";
_keyvaluesame = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=207421445;
 //BA.debugLineNum = 207421445;BA.debugLine="If Map2.ContainsKey(Key1) Then";
if (_map2.ContainsKey((Object)(_key1))) { 
RDebugUtils.currentLine=207421446;
 //BA.debugLineNum = 207421446;BA.debugLine="Dim Value2 As String = Map2.Get(Key1)";
_value2 = BA.ObjectToString(_map2.Get((Object)(_key1)));
RDebugUtils.currentLine=207421447;
 //BA.debugLineNum = 207421447;BA.debugLine="KeyValueSame = Value1 = Value2";
_keyvaluesame = (_value1).equals(_value2);
RDebugUtils.currentLine=207421448;
 //BA.debugLineNum = 207421448;BA.debugLine="If KeyValueSame = False Then";
if (_keyvaluesame==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=207421449;
 //BA.debugLineNum = 207421449;BA.debugLine="Log($\"Key: ${Key1} is different\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("9207421449",("Key: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key1))+" is different"),0);
RDebugUtils.currentLine=207421450;
 //BA.debugLineNum = 207421450;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = anywheresoftware.b4a.keywords.Common.False;
 };
 }else {
RDebugUtils.currentLine=207421453;
 //BA.debugLineNum = 207421453;BA.debugLine="Log($\"Key: ${Key1} is not in Map2\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("9207421453",("Key: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key1))+" is not in Map2"),0);
RDebugUtils.currentLine=207421454;
 //BA.debugLineNum = 207421454;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=207421457;
 //BA.debugLineNum = 207421457;BA.debugLine="For Each Key2 As String In Map2.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _map2.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key2 = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=207421458;
 //BA.debugLineNum = 207421458;BA.debugLine="Dim Value2 As String = Map2.Get(Key2)";
_value2 = BA.ObjectToString(_map2.Get((Object)(_key2)));
RDebugUtils.currentLine=207421459;
 //BA.debugLineNum = 207421459;BA.debugLine="Dim KeyValueSame As Boolean = False";
_keyvaluesame = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=207421460;
 //BA.debugLineNum = 207421460;BA.debugLine="If Map1.ContainsKey(Key2) Then";
if (_map1.ContainsKey((Object)(_key2))) { 
RDebugUtils.currentLine=207421461;
 //BA.debugLineNum = 207421461;BA.debugLine="Dim Value1 As String = Map1.Get(Key2)";
_value1 = BA.ObjectToString(_map1.Get((Object)(_key2)));
RDebugUtils.currentLine=207421462;
 //BA.debugLineNum = 207421462;BA.debugLine="KeyValueSame = Value1 = Value2";
_keyvaluesame = (_value1).equals(_value2);
RDebugUtils.currentLine=207421463;
 //BA.debugLineNum = 207421463;BA.debugLine="If KeyValueSame = False Then";
if (_keyvaluesame==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=207421464;
 //BA.debugLineNum = 207421464;BA.debugLine="Log($\"Key: ${Key2} is different\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("9207421464",("Key: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key2))+" is different"),0);
RDebugUtils.currentLine=207421465;
 //BA.debugLineNum = 207421465;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = anywheresoftware.b4a.keywords.Common.False;
 };
 }else {
RDebugUtils.currentLine=207421468;
 //BA.debugLineNum = 207421468;BA.debugLine="Log($\"Key: ${Key2} is not in Map1\"$)";
anywheresoftware.b4a.keywords.Common.LogImpl("9207421468",("Key: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_key2))+" is not in Map1"),0);
RDebugUtils.currentLine=207421469;
 //BA.debugLineNum = 207421469;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = anywheresoftware.b4a.keywords.Common.False;
 };
 }
};
RDebugUtils.currentLine=207421472;
 //BA.debugLineNum = 207421472;BA.debugLine="Return FlagAllkeysOK";
if (true) return _flagallkeysok;
RDebugUtils.currentLine=207421473;
 //BA.debugLineNum = 207421473;BA.debugLine="End Sub";
return false;
}
public static void  _mnusave_action() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mnusave_action", true))
	 {Debug.delegate(ba, "mnusave_action", null); return;}
ResumableSub_mnuSave_Action rsub = new ResumableSub_mnuSave_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSave_Action extends BA.ResumableSub {
public ResumableSub_mnuSave_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _camposok = false;
String _dirjson = "";
String _nombrejson = "";
String _nombrecss = "";
String _scss = "";
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206110721;
 //BA.debugLineNum = 206110721;BA.debugLine="If CurrentFile = \"\" Then";
if (true) break;

case 1:
//if
this.state = 24;
if ((parent._currentfile).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 24;
RDebugUtils.currentLine=206110722;
 //BA.debugLineNum = 206110722;BA.debugLine="mnuSaveAs_Action";
_mnusaveas_action();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=206110725;
 //BA.debugLineNum = 206110725;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _checkforwarnings());
this.state = 25;
return;
case 25:
//C
this.state = 6;
_camposok = (boolean) result[0];
;
RDebugUtils.currentLine=206110726;
 //BA.debugLineNum = 206110726;BA.debugLine="If CamposOK Then";
if (true) break;

case 6:
//if
this.state = 23;
if (_camposok) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=206110727;
 //BA.debugLineNum = 206110727;BA.debugLine="CurrentFileString = ExportToString";
parent._currentfilestring = _exporttostring();
RDebugUtils.currentLine=206110728;
 //BA.debugLineNum = 206110728;BA.debugLine="Dim DirJSON As String=File.GetFileParent(Curren";
_dirjson = anywheresoftware.b4a.keywords.Common.File.GetFileParent(parent._currentfile);
RDebugUtils.currentLine=206110729;
 //BA.debugLineNum = 206110729;BA.debugLine="Dim NombreJSON As String=File.GetName(CurrentFi";
_nombrejson = anywheresoftware.b4a.keywords.Common.File.GetName(parent._currentfile);
RDebugUtils.currentLine=206110730;
 //BA.debugLineNum = 206110730;BA.debugLine="Dim NombreCSS As String=NombreJSON.Replace(\".js";
_nombrecss = _nombrejson.replace(".json",".css");
RDebugUtils.currentLine=206110731;
 //BA.debugLineNum = 206110731;BA.debugLine="Dim sCSS As String=ExportToCSS(NombreJSON.Repla";
_scss = _exporttocss(_nombrejson.replace(".json",""));
RDebugUtils.currentLine=206110732;
 //BA.debugLineNum = 206110732;BA.debugLine="Try";
if (true) break;

case 9:
//try
this.state = 18;
this.catchState = 17;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 17;
RDebugUtils.currentLine=206110733;
 //BA.debugLineNum = 206110733;BA.debugLine="File.WriteString(CurrentFile, \"\", CurrentFileS";
anywheresoftware.b4a.keywords.Common.File.WriteString(parent._currentfile,"",parent._currentfilestring);
RDebugUtils.currentLine=206110735;
 //BA.debugLineNum = 206110735;BA.debugLine="File.Delete(DirJSON,NombreCSS)";
anywheresoftware.b4a.keywords.Common.File.Delete(_dirjson,_nombrecss);
RDebugUtils.currentLine=206110736;
 //BA.debugLineNum = 206110736;BA.debugLine="If sCSS.Length>0 Then";
if (true) break;

case 12:
//if
this.state = 15;
if (_scss.length()>0) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=206110737;
 //BA.debugLineNum = 206110737;BA.debugLine="File.WriteString(DirJSON,NombreCSS, sCSS)";
anywheresoftware.b4a.keywords.Common.File.WriteString(_dirjson,_nombrecss,_scss);
 if (true) break;

case 15:
//C
this.state = 18;
;
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=206110740;
 //BA.debugLineNum = 206110740;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sid";
_msa = parent._xui.MsgboxAsync(ba,"No ha sido posible grabar el fichero."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=206110741;
 //BA.debugLineNum = 206110741;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 18;
_result = (int) result[0];
;
RDebugUtils.currentLine=206110742;
 //BA.debugLineNum = 206110742;BA.debugLine="Return";
if (true) return ;
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
;
RDebugUtils.currentLine=206110744;
 //BA.debugLineNum = 206110744;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Fichero gr";
_msa = parent._xui.MsgboxAsync(ba,"Fichero grabado."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"("+parent._currentfile+")","Aviso");
RDebugUtils.currentLine=206110745;
 //BA.debugLineNum = 206110745;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_result = (int) result[0];
;
RDebugUtils.currentLine=206110746;
 //BA.debugLineNum = 206110746;BA.debugLine="If sCSS.Length>0 Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_scss.length()>0) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=206110747;
 //BA.debugLineNum = 206110747;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Fichero g";
_msa = parent._xui.MsgboxAsync(ba,"Fichero grabado."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"("+anywheresoftware.b4a.keywords.Common.File.GetUri(_dirjson,_nombrecss)+")","Aviso");
RDebugUtils.currentLine=206110748;
 //BA.debugLineNum = 206110748;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
_result = (int) result[0];
;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=206110750;
 //BA.debugLineNum = 206110750;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No olvides";
_msa = parent._xui.MsgboxAsync(ba,"No olvides SINCRONIZAR la carpeta Files en el IDE","IMPORTANTE");
RDebugUtils.currentLine=206110751;
 //BA.debugLineNum = 206110751;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusave_action"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 23;
_result = (int) result[0];
;
 if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=206110754;
 //BA.debugLineNum = 206110754;BA.debugLine="End Sub";
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkforwarnings() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "checkforwarnings", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkforwarnings", null));}
ResumableSub_CheckForWarnings rsub = new ResumableSub_CheckForWarnings(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckForWarnings extends BA.ResumableSub {
public ResumableSub_CheckForWarnings(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4a.objects.collections.List _lstcampos = null;
anywheresoftware.b4a.objects.collections.List _lstaliascampos = null;
anywheresoftware.b4a.objects.collections.List _lstencabezados = null;
anywheresoftware.b4a.objects.collections.List _lstnombrescamposdialogosaux = null;
anywheresoftware.b4a.objects.collections.List _lstprimarykeys = null;
b4j.docU.b4xorderedmap _omprimarykeys = null;
int _numcolumnastableview = 0;
int _i = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
String _nombrecampopk = "";
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvincluidosenformulascamposcalculados = null;
int step14;
int limit14;
anywheresoftware.b4a.BA.IterableList group102;
int index102;
int groupLen102;
int step113;
int limit113;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206176257;
 //BA.debugLineNum = 206176257;BA.debugLine="Dim lstCampos As List";
_lstcampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=206176258;
 //BA.debugLineNum = 206176258;BA.debugLine="lstCampos.Initialize";
_lstcampos.Initialize();
RDebugUtils.currentLine=206176259;
 //BA.debugLineNum = 206176259;BA.debugLine="Dim lstAliasCampos As List";
_lstaliascampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=206176260;
 //BA.debugLineNum = 206176260;BA.debugLine="lstAliasCampos.Initialize";
_lstaliascampos.Initialize();
RDebugUtils.currentLine=206176261;
 //BA.debugLineNum = 206176261;BA.debugLine="Dim lstEncabezados As List";
_lstencabezados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=206176262;
 //BA.debugLineNum = 206176262;BA.debugLine="lstEncabezados.Initialize";
_lstencabezados.Initialize();
RDebugUtils.currentLine=206176263;
 //BA.debugLineNum = 206176263;BA.debugLine="Dim lstNombresCamposDialogosAux As List";
_lstnombrescamposdialogosaux = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=206176264;
 //BA.debugLineNum = 206176264;BA.debugLine="lstNombresCamposDialogosAux.Initialize";
_lstnombrescamposdialogosaux.Initialize();
RDebugUtils.currentLine=206176266;
 //BA.debugLineNum = 206176266;BA.debugLine="Dim lstPrimaryKeys As List";
_lstprimarykeys = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=206176267;
 //BA.debugLineNum = 206176267;BA.debugLine="lstPrimaryKeys.Initialize";
_lstprimarykeys.Initialize();
RDebugUtils.currentLine=206176270;
 //BA.debugLineNum = 206176270;BA.debugLine="Dim omPrimaryKeys As B4XOrderedMap";
_omprimarykeys = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=206176271;
 //BA.debugLineNum = 206176271;BA.debugLine="omPrimaryKeys.Initialize";
_omprimarykeys._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=206176273;
 //BA.debugLineNum = 206176273;BA.debugLine="Dim NumColumnasTableView As Int";
_numcolumnastableview = 0;
RDebugUtils.currentLine=206176275;
 //BA.debugLineNum = 206176275;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
if (true) break;

case 1:
//for
this.state = 68;
step14 = 1;
limit14 = (int) (parent._clvlistacampos._getsize()-1);
_i = (int) (0) ;
this.state = 100;
if (true) break;

case 100:
//C
this.state = 68;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 3;
if (true) break;

case 101:
//C
this.state = 100;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=206176277;
 //BA.debugLineNum = 206176277;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=206176279;
 //BA.debugLineNum = 206176279;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
if (true) break;

case 4:
//if
this.state = 15;
if ((_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(""))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
RDebugUtils.currentLine=206176280;
 //BA.debugLineNum = 206176280;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo n";
_msa = parent._xui.MsgboxAsync(ba,"El campo nº "+BA.NumberToString(_i)+" está en blanco. Es un dato obligatorio","Error!");
RDebugUtils.currentLine=206176281;
 //BA.debugLineNum = 206176281;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 102;
return;
case 102:
//C
this.state = 15;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176282;
 //BA.debugLineNum = 206176282;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=206176284;
 //BA.debugLineNum = 206176284;BA.debugLine="If lstCampos.IndexOf(clvIV.cboCampo.Value)=-1 T";
if (true) break;

case 9:
//if
this.state = 14;
if (_lstcampos.IndexOf(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())==-1) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=206176285;
 //BA.debugLineNum = 206176285;BA.debugLine="lstCampos.Add(clvIV.cboCampo.Value)";
_lstcampos.Add(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=206176288;
 //BA.debugLineNum = 206176288;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
_msa = parent._xui.MsgboxAsync(ba,"El campo nº "+BA.NumberToString(_i)+"("+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+") está repetido.","Error!");
RDebugUtils.currentLine=206176289;
 //BA.debugLineNum = 206176289;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 103;
return;
case 103:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176290;
 //BA.debugLineNum = 206176290;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;
;
RDebugUtils.currentLine=206176294;
 //BA.debugLineNum = 206176294;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then";

case 15:
//if
this.state = 26;
if ((_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 26;
RDebugUtils.currentLine=206176295;
 //BA.debugLineNum = 206176295;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
_msa = parent._xui.MsgboxAsync(ba,"El alias del campo nº "+BA.NumberToString(_i)+" está en blanco. Es un dato obligatorio","Error!");
RDebugUtils.currentLine=206176296;
 //BA.debugLineNum = 206176296;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 104;
return;
case 104:
//C
this.state = 26;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176297;
 //BA.debugLineNum = 206176297;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=206176299;
 //BA.debugLineNum = 206176299;BA.debugLine="If lstAliasCampos.IndexOf(clvIV.txtAliasCampo.t";
if (true) break;

case 20:
//if
this.state = 25;
if (_lstaliascampos.IndexOf((Object)(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))==-1) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=206176300;
 //BA.debugLineNum = 206176300;BA.debugLine="lstAliasCampos.Add(clvIV.txtAliasCampo.text)";
_lstaliascampos.Add((Object)(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=206176302;
 //BA.debugLineNum = 206176302;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias";
_msa = parent._xui.MsgboxAsync(ba,"El alias del campo nº "+BA.NumberToString(_i)+"("+_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+") está repetido.","Error!");
RDebugUtils.currentLine=206176303;
 //BA.debugLineNum = 206176303;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 105;
return;
case 105:
//C
this.state = 25;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176304;
 //BA.debugLineNum = 206176304;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;
;
RDebugUtils.currentLine=206176319;
 //BA.debugLineNum = 206176319;BA.debugLine="If clvIV.cboTipoDato.value=\"\" Then";

case 26:
//if
this.state = 29;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(""))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=206176320;
 //BA.debugLineNum = 206176320;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de dato de la columna nº "+BA.NumberToString(_i)+" está en blanco. Es un dato obligatorio.","Error!");
RDebugUtils.currentLine=206176321;
 //BA.debugLineNum = 206176321;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 106;
return;
case 106:
//C
this.state = 29;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176322;
 //BA.debugLineNum = 206176322;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=206176337;
 //BA.debugLineNum = 206176337;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";

case 29:
//if
this.state = 32;
if (_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True && (_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=206176338;
 //BA.debugLineNum = 206176338;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
_msa = parent._xui.MsgboxAsync(ba,"El alias de la columna nº "+BA.NumberToString(_i)+" está en blanco. Un campo calculado siempre debe tener un alias de campo.","Error!");
RDebugUtils.currentLine=206176339;
 //BA.debugLineNum = 206176339;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 107;
return;
case 107:
//C
this.state = 32;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176340;
 //BA.debugLineNum = 206176340;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=206176343;
 //BA.debugLineNum = 206176343;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";

case 32:
//if
this.state = 35;
if (_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True && _clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==anywheresoftware.b4a.keywords.Common.True) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=206176344;
 //BA.debugLineNum = 206176344;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
_msa = parent._xui.MsgboxAsync(ba,"Un campo calculado no puede ser clave primaria de la tabla.","Error!");
RDebugUtils.currentLine=206176345;
 //BA.debugLineNum = 206176345;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 108;
return;
case 108:
//C
this.state = 35;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176346;
 //BA.debugLineNum = 206176346;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=206176360;
 //BA.debugLineNum = 206176360;BA.debugLine="If clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV.";

case 35:
//if
this.state = 38;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrolfiltro_checkbox))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=206176361;
 //BA.debugLineNum = 206176361;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo co";
_msa = parent._xui.MsgboxAsync(ba,"El tipo control de filtro "+parent._tipocontrolfiltro_checkbox+" sólo es compatible con tipo de datos INTEGER .","Error!");
RDebugUtils.currentLine=206176362;
 //BA.debugLineNum = 206176362;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 109;
return;
case 109:
//C
this.state = 38;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176363;
 //BA.debugLineNum = 206176363;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=206176367;
 //BA.debugLineNum = 206176367;BA.debugLine="If clvIV.cboTipoDato.Value<>\"REAL\"  And clvIV.cb";

case 38:
//if
this.state = 41;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("REAL")) == false && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=206176368;
 //BA.debugLineNum = 206176368;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
_msa = parent._xui.MsgboxAsync(ba,"Un campo tipo fecha sólo es compatible con tipo de datos REAL o INTEGER .","Error!");
RDebugUtils.currentLine=206176369;
 //BA.debugLineNum = 206176369;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 110;
return;
case 110:
//C
this.state = 41;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176370;
 //BA.debugLineNum = 206176370;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=206176374;
 //BA.debugLineNum = 206176374;BA.debugLine="If (clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV";

case 41:
//if
this.state = 44;
if (((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("TEXT")) == false) && _clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=206176375;
 //BA.debugLineNum = 206176375;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
_msa = parent._xui.MsgboxAsync(ba,"Un campo tipo booleano sólo es compatible con tipos de datos INTEGER y TEXT ."+anywheresoftware.b4a.keywords.Common.CRLF+"("+_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+")","Error!");
RDebugUtils.currentLine=206176376;
 //BA.debugLineNum = 206176376;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 111;
return;
case 111:
//C
this.state = 44;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176377;
 //BA.debugLineNum = 206176377;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=206176382;
 //BA.debugLineNum = 206176382;BA.debugLine="If clvIV.chkboxKeyID.Checked Then";

case 44:
//if
this.state = 47;
if (_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=206176383;
 //BA.debugLineNum = 206176383;BA.debugLine="omPrimaryKeys.Put(clvIV.lblOrdenKeyID.Text,clvI";
_omprimarykeys._put /*String*/ (null,(Object)(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()),_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
 if (true) break;
;
RDebugUtils.currentLine=206176386;
 //BA.debugLineNum = 206176386;BA.debugLine="If clvIV.cboTipoControlFiltro.Value<>\"\" Then";

case 47:
//if
this.state = 64;
if ((_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("")) == false) { 
this.state = 49;
}else {
this.state = 63;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=206176387;
 //BA.debugLineNum = 206176387;BA.debugLine="If clvIV.txtNombreCampoDialogosAux.Text=\"\" Then";
if (true) break;

case 50:
//if
this.state = 61;
if ((_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 52;
}else {
this.state = 54;
}if (true) break;

case 52:
//C
this.state = 61;
RDebugUtils.currentLine=206176388;
 //BA.debugLineNum = 206176388;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo";
_msa = parent._xui.MsgboxAsync(ba,"Un campo con Tipo Control Filtro<>vacío, debe tener un NombreCampoDialogosAux<>vacío."+anywheresoftware.b4a.keywords.Common.CRLF+"Este nombre se mostrará en los selectores de filtros, diálogos tipo ordenación, ..."+anywheresoftware.b4a.keywords.Common.CRLF+"("+_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+")","Error!");
RDebugUtils.currentLine=206176389;
 //BA.debugLineNum = 206176389;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 112;
return;
case 112:
//C
this.state = 61;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176390;
 //BA.debugLineNum = 206176390;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=206176392;
 //BA.debugLineNum = 206176392;BA.debugLine="If lstNombresCamposDialogosAux.IndexOf(clvIV.t";
if (true) break;

case 55:
//if
this.state = 60;
if (_lstnombrescamposdialogosaux.IndexOf((Object)(_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()))>-1) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
RDebugUtils.currentLine=206176393;
 //BA.debugLineNum = 206176393;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombr";
_msa = parent._xui.MsgboxAsync(ba,"El nombre de campo dialogos aux para el alias campo nº "+BA.NumberToString(_i)+"("+_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+") está repetido.","Error!");
RDebugUtils.currentLine=206176394;
 //BA.debugLineNum = 206176394;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 113;
return;
case 113:
//C
this.state = 60;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176395;
 //BA.debugLineNum = 206176395;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=206176397;
 //BA.debugLineNum = 206176397;BA.debugLine="lstNombresCamposDialogosAux.Add(clvIV.txtNomb";
_lstnombrescamposdialogosaux.Add((Object)(_clviv.txtNombreCampoDialogosAux /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 64;
;
 if (true) break;

case 63:
//C
this.state = 64;
 if (true) break;
;
RDebugUtils.currentLine=206176409;
 //BA.debugLineNum = 206176409;BA.debugLine="If clvIV.chkColumnaTableView.Checked Then";

case 64:
//if
this.state = 67;
if (_clviv.chkColumnaTableView /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=206176418;
 //BA.debugLineNum = 206176418;BA.debugLine="NumColumnasTableView=NumColumnasTableView+1";
_numcolumnastableview = (int) (_numcolumnastableview+1);
 if (true) break;

case 67:
//C
this.state = 101;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=206176428;
 //BA.debugLineNum = 206176428;BA.debugLine="If NumColumnasTableView=0 Then";

case 68:
//if
this.state = 71;
if (_numcolumnastableview==0) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=206176429;
 //BA.debugLineNum = 206176429;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Debe haber";
_msa = parent._xui.MsgboxAsync(ba,"Debe haber al menos una columna para mostrar en la tabla (se crearán las columnas para los campo con checkbox = true.","Error!");
RDebugUtils.currentLine=206176430;
 //BA.debugLineNum = 206176430;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 114;
return;
case 114:
//C
this.state = 71;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176431;
 //BA.debugLineNum = 206176431;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=206176434;
 //BA.debugLineNum = 206176434;BA.debugLine="If omPrimaryKeys.Size>0 Then";

case 71:
//if
this.state = 78;
if (_omprimarykeys._getsize /*int*/ (null)>0) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=206176435;
 //BA.debugLineNum = 206176435;BA.debugLine="omPrimaryKeys.Keys.Sort(True)";
_omprimarykeys._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=206176436;
 //BA.debugLineNum = 206176436;BA.debugLine="For Each NombreCampoPK As String In omPrimaryKey";
if (true) break;

case 74:
//for
this.state = 77;
group102 = _omprimarykeys._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
index102 = 0;
groupLen102 = group102.getSize();
this.state = 115;
if (true) break;

case 115:
//C
this.state = 77;
if (index102 < groupLen102) {
this.state = 76;
_nombrecampopk = BA.ObjectToString(group102.Get(index102));}
if (true) break;

case 116:
//C
this.state = 115;
index102++;
if (true) break;

case 76:
//C
this.state = 116;
RDebugUtils.currentLine=206176437;
 //BA.debugLineNum = 206176437;BA.debugLine="lstPrimaryKeys.Add(NombreCampoPK)";
_lstprimarykeys.Add((Object)(_nombrecampopk));
 if (true) break;
if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;
;
RDebugUtils.currentLine=206176441;
 //BA.debugLineNum = 206176441;BA.debugLine="If lstPrimaryKeys.Size=0 Then";

case 78:
//if
this.state = 87;
if (_lstprimarykeys.getSize()==0) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=206176448;
 //BA.debugLineNum = 206176448;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
_msa = parent._xui.Msgbox2Async(ba,"No hay ningún campo definido como clave primaria"+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"La tabla será de tipo ReadOnly (SIN control por medio de la clase. Controlar via código)."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"¿Continuar?","No hay clave primaria definida","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=206176449;
 //BA.debugLineNum = 206176449;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 117;
return;
case 117:
//C
this.state = 81;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176450;
 //BA.debugLineNum = 206176450;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
if (true) break;

case 81:
//if
this.state = 86;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 83;
;}if (true) break;

case 83:
//C
this.state = 86;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 86:
//C
this.state = 87;
;
 if (true) break;

case 87:
//C
this.state = 88;
;
RDebugUtils.currentLine=206176482;
 //BA.debugLineNum = 206176482;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
_lstnombrescamposclvincluidosenformulascamposcalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvincluidosenformulascamposcalculados = _nombrescamposclvincluidosenformulascamposcalculados();
RDebugUtils.currentLine=206176483;
 //BA.debugLineNum = 206176483;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCamposCa";
if (true) break;

case 88:
//if
this.state = 99;
if (_lstnombrescamposclvincluidosenformulascamposcalculados.getSize()>0) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=206176484;
 //BA.debugLineNum = 206176484;BA.debugLine="For i=0 To lstNombresCamposCLVIncluidosEnFormula";
if (true) break;

case 91:
//for
this.state = 98;
step113 = 1;
limit113 = (int) (_lstnombrescamposclvincluidosenformulascamposcalculados.getSize()-1);
_i = (int) (0) ;
this.state = 118;
if (true) break;

case 118:
//C
this.state = 98;
if ((step113 > 0 && _i <= limit113) || (step113 < 0 && _i >= limit113)) this.state = 93;
if (true) break;

case 119:
//C
this.state = 118;
_i = ((int)(0 + _i + step113)) ;
if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=206176486;
 //BA.debugLineNum = 206176486;BA.debugLine="If lstAliasCampos.IndexOf(lstNombresCamposCLVIn";
if (true) break;

case 94:
//if
this.state = 97;
if (_lstaliascampos.IndexOf(_lstnombrescamposclvincluidosenformulascamposcalculados.Get(_i))==-1) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=206176488;
 //BA.debugLineNum = 206176488;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
_msa = parent._xui.MsgboxAsync(ba,"El campo "+BA.ObjectToString(_lstnombrescamposclvincluidosenformulascamposcalculados.Get(_i))+" está incluido en un campo calculado, pero no está en los alias de campos definidos.","Error!");
RDebugUtils.currentLine=206176489;
 //BA.debugLineNum = 206176489;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "checkforwarnings"), _msa);
this.state = 120;
return;
case 120:
//C
this.state = 97;
_result = (int) result[0];
;
RDebugUtils.currentLine=206176490;
 //BA.debugLineNum = 206176490;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 97:
//C
this.state = 119;
;
 if (true) break;
if (true) break;

case 98:
//C
this.state = 99;
;
 if (true) break;

case 99:
//C
this.state = -1;
;
RDebugUtils.currentLine=206176501;
 //BA.debugLineNum = 206176501;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=206176502;
 //BA.debugLineNum = 206176502;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.collections.List  _nombrescamposclvincluidosenformulascamposcalculados() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "nombrescamposclvincluidosenformulascamposcalculados", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "nombrescamposclvincluidosenformulascamposcalculados", null));}
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvincluidosenformulascamposcalculados = null;
anywheresoftware.b4a.objects.collections.List _lstcamposenclv = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _formulacampocalculado = "";
anywheresoftware.b4a.objects.collections.List _lstnombrescamposincluidosenformula = null;
String _pattern = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher1 = null;
int _k = 0;
RDebugUtils.currentLine=205979648;
 //BA.debugLineNum = 205979648;BA.debugLine="private Sub NombresCamposCLVIncluidosEnFormulasCam";
RDebugUtils.currentLine=205979649;
 //BA.debugLineNum = 205979649;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
_lstnombrescamposclvincluidosenformulascamposcalculados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205979650;
 //BA.debugLineNum = 205979650;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposCalcu";
_lstnombrescamposclvincluidosenformulascamposcalculados.Initialize();
RDebugUtils.currentLine=205979651;
 //BA.debugLineNum = 205979651;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
_lstcamposenclv = new anywheresoftware.b4a.objects.collections.List();
_lstcamposenclv = _cargacamposclv();
RDebugUtils.currentLine=205979652;
 //BA.debugLineNum = 205979652;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstcamposenclv.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=205979653;
 //BA.debugLineNum = 205979653;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstcamposenclv.Get(_i)));
RDebugUtils.currentLine=205979654;
 //BA.debugLineNum = 205979654;BA.debugLine="If True=m.Get(\"CampoCalculado\") Then";
if (anywheresoftware.b4a.keywords.Common.True==BA.ObjectToBoolean(_m.Get((Object)("CampoCalculado")))) { 
RDebugUtils.currentLine=205979655;
 //BA.debugLineNum = 205979655;BA.debugLine="Dim FormulaCampoCalculado As String=m.Get(\"Camp";
_formulacampocalculado = BA.ObjectToString(_m.Get((Object)("Campo")));
RDebugUtils.currentLine=205979656;
 //BA.debugLineNum = 205979656;BA.debugLine="Dim lstNombresCamposIncluidosEnFormula As List";
_lstnombrescamposincluidosenformula = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205979657;
 //BA.debugLineNum = 205979657;BA.debugLine="lstNombresCamposIncluidosEnFormula.Initialize";
_lstnombrescamposincluidosenformula.Initialize();
RDebugUtils.currentLine=205979658;
 //BA.debugLineNum = 205979658;BA.debugLine="Dim pattern As String";
_pattern = "";
RDebugUtils.currentLine=205979659;
 //BA.debugLineNum = 205979659;BA.debugLine="pattern = \"\\[(.*?)\\]\"  ' texto entre brackets";
_pattern = "\\[(.*?)\\]";
RDebugUtils.currentLine=205979660;
 //BA.debugLineNum = 205979660;BA.debugLine="Dim Matcher1 As Matcher";
_matcher1 = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=205979661;
 //BA.debugLineNum = 205979661;BA.debugLine="Matcher1 = Regex.Matcher(pattern, FormulaCampoC";
_matcher1 = anywheresoftware.b4a.keywords.Common.Regex.Matcher(_pattern,_formulacampocalculado);
RDebugUtils.currentLine=205979662;
 //BA.debugLineNum = 205979662;BA.debugLine="Do While Matcher1.Find";
while (_matcher1.Find()) {
RDebugUtils.currentLine=205979663;
 //BA.debugLineNum = 205979663;BA.debugLine="Log(\"Found: \" & Matcher1.Match)";
anywheresoftware.b4a.keywords.Common.LogImpl("9205979663","Found: "+_matcher1.getMatch(),0);
RDebugUtils.currentLine=205979665;
 //BA.debugLineNum = 205979665;BA.debugLine="lstNombresCamposIncluidosEnFormula.Add(Matcher";
_lstnombrescamposincluidosenformula.Add((Object)(_matcher1.getMatch().replace("[","").replace("]","")));
 }
;
RDebugUtils.currentLine=205979668;
 //BA.debugLineNum = 205979668;BA.debugLine="For k=0 To lstNombresCamposIncluidosEnFormula.S";
{
final int step18 = 1;
final int limit18 = (int) (_lstnombrescamposincluidosenformula.getSize()-1);
_k = (int) (0) ;
for (;_k <= limit18 ;_k = _k + step18 ) {
RDebugUtils.currentLine=205979669;
 //BA.debugLineNum = 205979669;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCampo";
if (_lstnombrescamposclvincluidosenformulascamposcalculados.IndexOf(_lstnombrescamposincluidosenformula.Get(_k))==-1) { 
RDebugUtils.currentLine=205979670;
 //BA.debugLineNum = 205979670;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposC";
_lstnombrescamposclvincluidosenformulascamposcalculados.Add(_lstnombrescamposincluidosenformula.Get(_k));
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=205979675;
 //BA.debugLineNum = 205979675;BA.debugLine="Return lstNombresCamposCLVIncluidosEnFormulasCamp";
if (true) return _lstnombrescamposclvincluidosenformulascamposcalculados;
RDebugUtils.currentLine=205979676;
 //BA.debugLineNum = 205979676;BA.debugLine="End Sub";
return null;
}
public static String  _chkboxcampocalculado_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxcampocalculado_checkedchange", true))
	 {return ((String) Debug.delegate(ba, "chkboxcampocalculado_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=206635008;
 //BA.debugLineNum = 206635008;BA.debugLine="private Sub chkBoxCampoCalculado_CheckedChange(Che";
RDebugUtils.currentLine=206635009;
 //BA.debugLineNum = 206635009;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=206635022;
 //BA.debugLineNum = 206635022;BA.debugLine="End Sub";
return "";
}
public static String  _chkboxconvalordefecto_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxconvalordefecto_checkedchange", true))
	 {return ((String) Debug.delegate(ba, "chkboxconvalordefecto_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4j.objects.CheckboxWrapper _chkvf = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvf = null;
RDebugUtils.currentLine=207552512;
 //BA.debugLineNum = 207552512;BA.debugLine="Private Sub chkBoxConValorDefecto_CheckedChange(Ch";
RDebugUtils.currentLine=207552513;
 //BA.debugLineNum = 207552513;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=207552514;
 //BA.debugLineNum = 207552514;BA.debugLine="Dim chkVF As CheckBox=Sender";
_chkvf = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkvf = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=207552515;
 //BA.debugLineNum = 207552515;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = _clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkvf.getObject())));
RDebugUtils.currentLine=207552516;
 //BA.debugLineNum = 207552516;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(_clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=207552517;
 //BA.debugLineNum = 207552517;BA.debugLine="Dim txtVF As TextField=clvIV.txtValorDefecto";
_txtvf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_txtvf = _clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=207552518;
 //BA.debugLineNum = 207552518;BA.debugLine="txtVF.Visible= chkVF.Checked";
_txtvf.setVisible(_chkvf.getChecked());
RDebugUtils.currentLine=207552519;
 //BA.debugLineNum = 207552519;BA.debugLine="If chkVF.Checked=False Then txtVF.Text=\"\"";
if (_chkvf.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
_txtvf.setText("");};
RDebugUtils.currentLine=207552520;
 //BA.debugLineNum = 207552520;BA.debugLine="End Sub";
return "";
}
public static void  _chkboxesbooleano_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxesbooleano_checkedchange", true))
	 {Debug.delegate(ba, "chkboxesbooleano_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkBoxEsBooleano_CheckedChange rsub = new ResumableSub_chkBoxEsBooleano_CheckedChange(null,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkBoxEsBooleano_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsBooleano_CheckedChange(b4j.docU.jamtableviewcamposbuilder parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkesb = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtesb = null;
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206438401;
 //BA.debugLineNum = 206438401;BA.debugLine="If CargandoDatos Then Return";
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
RDebugUtils.currentLine=206438403;
 //BA.debugLineNum = 206438403;BA.debugLine="If CorrigiendoChkBoxEsBooleano Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxesbooleano) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=206438404;
 //BA.debugLineNum = 206438404;BA.debugLine="CorrigiendoChkBoxEsBooleano=False";
parent._corrigiendochkboxesbooleano = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=206438405;
 //BA.debugLineNum = 206438405;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=206438408;
 //BA.debugLineNum = 206438408;BA.debugLine="Dim chkEsB As CheckBox=Sender";
_chkesb = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkesb = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=206438409;
 //BA.debugLineNum = 206438409;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkesb.getObject())));
RDebugUtils.currentLine=206438410;
 //BA.debugLineNum = 206438410;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=206438411;
 //BA.debugLineNum = 206438411;BA.debugLine="If Checked And (clvIV.cboTipoDato.Value<>\"INTEGER";
if (true) break;

case 11:
//if
this.state = 14;
if (_checked && ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("TEXT")) == false)) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=206438412;
 //BA.debugLineNum = 206438412;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo bo";
_msa = parent._xui.MsgboxAsync(ba,"Un campo booleano sólo puede corresponder a tipos de datos TEXT o INTEGER.","");
RDebugUtils.currentLine=206438413;
 //BA.debugLineNum = 206438413;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=206438414;
 //BA.debugLineNum = 206438414;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
parent._corrigiendochkboxesbooleano = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=206438415;
 //BA.debugLineNum = 206438415;BA.debugLine="chkEsB.Checked=False";
_chkesb.setChecked(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=206438418;
 //BA.debugLineNum = 206438418;BA.debugLine="If Checked And (clvIV.cboTipoControlFiltro.Value<";

case 14:
//if
this.state = 17;
if (_checked && ((_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrolfiltro_checkbox)) == false && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("")) == false)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=206438419;
 //BA.debugLineNum = 206438419;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = parent._xui.MsgboxAsync(ba,"El tipo de control de filtro para un campo tipo Booleano tiene que ser "+parent._tipocontrolfiltro_checkbox+" o estar en blanco (si no se quiere filtrar por este campo)."+anywheresoftware.b4a.keywords.Common.CRLF+"Si es necesario, deja el tipo de control filtro en blanco.","");
RDebugUtils.currentLine=206438420;
 //BA.debugLineNum = 206438420;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 17;
_result = (int) result[0];
;
RDebugUtils.currentLine=206438421;
 //BA.debugLineNum = 206438421;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
parent._corrigiendochkboxesbooleano = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=206438422;
 //BA.debugLineNum = 206438422;BA.debugLine="chkEsB.Checked=False";
_chkesb.setChecked(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=206438425;
 //BA.debugLineNum = 206438425;BA.debugLine="Dim txtEsB As TextField=clvIV.txtValorTrueCampoBo";
_txtesb = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_txtesb = _clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=206438426;
 //BA.debugLineNum = 206438426;BA.debugLine="If chkEsB.Checked=False Then txtEsB.Text=\"\"";
if (true) break;

case 18:
//if
this.state = 23;
if (_chkesb.getChecked()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_txtesb.setText("");
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=206438427;
 //BA.debugLineNum = 206438427;BA.debugLine="If chkEsB.Checked Then";
if (true) break;

case 24:
//if
this.state = 33;
if (_chkesb.getChecked()) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=206438428;
 //BA.debugLineNum = 206438428;BA.debugLine="Dim cboTD As ComboBox=clvIV.cboTipoDato";
_cbotd = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotd = _clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ ;
RDebugUtils.currentLine=206438429;
 //BA.debugLineNum = 206438429;BA.debugLine="If cboTD.Value=\"TEXT\" Then";
if (true) break;

case 27:
//if
this.state = 32;
if ((_cbotd.getValue()).equals((Object)("TEXT"))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=206438430;
 //BA.debugLineNum = 206438430;BA.debugLine="txtEsB.Text=\"\"";
_txtesb.setText("");
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=206438432;
 //BA.debugLineNum = 206438432;BA.debugLine="txtEsB.Text=1";
_txtesb.setText(BA.NumberToString(1));
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=206438435;
 //BA.debugLineNum = 206438435;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _chkboxesfecha_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxesfecha_checkedchange", true))
	 {Debug.delegate(ba, "chkboxesfecha_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkBoxEsFecha_CheckedChange rsub = new ResumableSub_chkBoxEsFecha_CheckedChange(null,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkBoxEsFecha_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsFecha_CheckedChange(b4j.docU.jamtableviewcamposbuilder parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkesf = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206372865;
 //BA.debugLineNum = 206372865;BA.debugLine="If CargandoDatos Then Return";
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
RDebugUtils.currentLine=206372867;
 //BA.debugLineNum = 206372867;BA.debugLine="If CorrigiendoChkBoxEsFecha Then";
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
RDebugUtils.currentLine=206372868;
 //BA.debugLineNum = 206372868;BA.debugLine="CorrigiendoChkBoxEsFecha=False";
parent._corrigiendochkboxesfecha = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=206372869;
 //BA.debugLineNum = 206372869;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=206372872;
 //BA.debugLineNum = 206372872;BA.debugLine="Dim chkEsF As CheckBox=Sender";
_chkesf = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkesf = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=206372873;
 //BA.debugLineNum = 206372873;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkesf.getObject())));
RDebugUtils.currentLine=206372874;
 //BA.debugLineNum = 206372874;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=206372875;
 //BA.debugLineNum = 206372875;BA.debugLine="If Checked And clvIV.cboTipoDato.Value<>\"REAL\" An";
if (true) break;

case 11:
//if
this.state = 14;
if (_checked && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("REAL")) == false && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=206372876;
 //BA.debugLineNum = 206372876;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = parent._xui.MsgboxAsync(ba,"Un tipo de dato="+BA.ObjectToString(_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+" no puede ser una fecha.","");
RDebugUtils.currentLine=206372877;
 //BA.debugLineNum = 206372877;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=206372878;
 //BA.debugLineNum = 206372878;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
parent._corrigiendochkboxesfecha = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=206372879;
 //BA.debugLineNum = 206372879;BA.debugLine="chkEsF.Checked=False";
_chkesf.setChecked(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;
;
RDebugUtils.currentLine=206372882;
 //BA.debugLineNum = 206372882;BA.debugLine="If Checked=False And clvIV.cboTipoControlFiltro.V";

case 14:
//if
this.state = 17;
if (_checked==anywheresoftware.b4a.keywords.Common.False && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(parent._tipocontrolfiltro_textfieldbutton))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=206372883;
 //BA.debugLineNum = 206372883;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
_msa = parent._xui.MsgboxAsync(ba,"Si el tipo de control filtro es = "+parent._tipocontrolfiltro_textfieldbutton+" , el campo tiene que ser tipo fecha. Si no lo es, deja primero el tipo control filtro en blanco.","");
RDebugUtils.currentLine=206372884;
 //BA.debugLineNum = 206372884;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 17;
_result = (int) result[0];
;
RDebugUtils.currentLine=206372885;
 //BA.debugLineNum = 206372885;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
parent._corrigiendochkboxesfecha = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=206372886;
 //BA.debugLineNum = 206372886;BA.debugLine="chkEsF.Checked=True";
_chkesf.setChecked(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=206372889;
 //BA.debugLineNum = 206372889;BA.debugLine="If chkEsF.Checked Then";

case 17:
//if
this.state = 20;
if (_chkesf.getChecked()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=206372890;
 //BA.debugLineNum = 206372890;BA.debugLine="clvIV.cboAlineacionColumna.Value=\"CENTER\"";
_clviv.cboAlineacionColumna /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)("CENTER"));
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=206372893;
 //BA.debugLineNum = 206372893;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _chkboxkeyid_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxkeyid_checkedchange", true))
	 {Debug.delegate(ba, "chkboxkeyid_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkboxKeyID_CheckedChange rsub = new ResumableSub_chkboxKeyID_CheckedChange(null,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkboxKeyID_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkboxKeyID_CheckedChange(b4j.docU.jamtableviewcamposbuilder parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkkid = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
String _nombrecampokeyeliminada = "";
int _keyideliminada = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206503937;
 //BA.debugLineNum = 206503937;BA.debugLine="If CargandoDatos Then Return";
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
RDebugUtils.currentLine=206503939;
 //BA.debugLineNum = 206503939;BA.debugLine="If CorrigiendoChkBoxKeyID Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._corrigiendochkboxkeyid) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=206503940;
 //BA.debugLineNum = 206503940;BA.debugLine="CorrigiendoChkBoxKeyID=False";
parent._corrigiendochkboxkeyid = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=206503941;
 //BA.debugLineNum = 206503941;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=206503944;
 //BA.debugLineNum = 206503944;BA.debugLine="Dim chkKID As CheckBox=Sender";
_chkkid = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkkid = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=206503945;
 //BA.debugLineNum = 206503945;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkkid.getObject())));
RDebugUtils.currentLine=206503946;
 //BA.debugLineNum = 206503946;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=206503947;
 //BA.debugLineNum = 206503947;BA.debugLine="If Checked Then";
if (true) break;

case 11:
//if
this.state = 28;
if (_checked) { 
this.state = 13;
}else {
this.state = 27;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=206503948;
 //BA.debugLineNum = 206503948;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(""))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=206503949;
 //BA.debugLineNum = 206503949;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
_msa = parent._xui.MsgboxAsync(ba,"El nombre del campo no puede estar vacío.","");
RDebugUtils.currentLine=206503950;
 //BA.debugLineNum = 206503950;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 17;
_result = (int) result[0];
;
RDebugUtils.currentLine=206503951;
 //BA.debugLineNum = 206503951;BA.debugLine="CorrigiendoChkBoxKeyID=True";
parent._corrigiendochkboxkeyid = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=206503952;
 //BA.debugLineNum = 206503952;BA.debugLine="chkKID.Checked=False";
_chkkid.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=206503953;
 //BA.debugLineNum = 206503953;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=206503956;
 //BA.debugLineNum = 206503956;BA.debugLine="If Checked And clvIV.chkBoxCampoCalculado.Checke";

case 17:
//if
this.state = 20;
if (_checked && _clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=206503957;
 //BA.debugLineNum = 206503957;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
_msa = parent._xui.MsgboxAsync(ba,"Un campo calculado no puede pertenecer a la clave principal.","");
RDebugUtils.currentLine=206503958;
 //BA.debugLineNum = 206503958;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 20;
_result = (int) result[0];
;
RDebugUtils.currentLine=206503959;
 //BA.debugLineNum = 206503959;BA.debugLine="CorrigiendoChkBoxKeyID=True";
parent._corrigiendochkboxkeyid = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=206503960;
 //BA.debugLineNum = 206503960;BA.debugLine="chkKID.Checked=False";
_chkkid.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=206503961;
 //BA.debugLineNum = 206503961;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=206503965;
 //BA.debugLineNum = 206503965;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";

case 20:
//if
this.state = 25;
if (parent._lstprimarykey.IndexOf(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())>-1) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=206503966;
 //BA.debugLineNum = 206503966;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo \"";
_msa = parent._xui.MsgboxAsync(ba,"El campo "+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+" ya pertenece a la clave principal.","");
RDebugUtils.currentLine=206503967;
 //BA.debugLineNum = 206503967;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 25;
_result = (int) result[0];
;
RDebugUtils.currentLine=206503968;
 //BA.debugLineNum = 206503968;BA.debugLine="CorrigiendoChkBoxKeyID=True";
parent._corrigiendochkboxkeyid = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=206503969;
 //BA.debugLineNum = 206503969;BA.debugLine="chkKID.Checked=False";
_chkkid.setChecked(anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=206503971;
 //BA.debugLineNum = 206503971;BA.debugLine="lstPrimaryKey.Add(clvIV.cboCampo.Value)";
parent._lstprimarykey.Add(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=206503972;
 //BA.debugLineNum = 206503972;BA.debugLine="clvIV.lblOrdenKeyID.Text=lstPrimaryKey.Size";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(parent._lstprimarykey.getSize()));
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=206503976;
 //BA.debugLineNum = 206503976;BA.debugLine="Dim NombreCampoKeyEliminada As String=clvIV.cboC";
_nombrecampokeyeliminada = BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=206503977;
 //BA.debugLineNum = 206503977;BA.debugLine="lstPrimaryKey.RemoveAt(lstPrimaryKey.IndexOf(Nom";
parent._lstprimarykey.RemoveAt(parent._lstprimarykey.IndexOf((Object)(_nombrecampokeyeliminada)));
RDebugUtils.currentLine=206503978;
 //BA.debugLineNum = 206503978;BA.debugLine="Dim KeyIDEliminada As Int=clvIV.lblOrdenKeyID.Te";
_keyideliminada = (int)(Double.parseDouble(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=206503979;
 //BA.debugLineNum = 206503979;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=206503980;
 //BA.debugLineNum = 206503980;BA.debugLine="RecalcularOrdenKeyID(KeyIDEliminada)";
_recalcularordenkeyid(_keyideliminada);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=206503983;
 //BA.debugLineNum = 206503983;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _recalcularordenkeyid(int _keyideliminada) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "recalcularordenkeyid", true))
	 {return ((String) Debug.delegate(ba, "recalcularordenkeyid", new Object[] {_keyideliminada}));}
int _i = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
int _keyidlineaclv = 0;
RDebugUtils.currentLine=206897152;
 //BA.debugLineNum = 206897152;BA.debugLine="private Sub RecalcularOrdenKeyID(KeyIDEliminada As";
RDebugUtils.currentLine=206897153;
 //BA.debugLineNum = 206897153;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=206897154;
 //BA.debugLineNum = 206897154;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaC";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(_clvlistacampos._getvalue(_i));
RDebugUtils.currentLine=206897155;
 //BA.debugLineNum = 206897155;BA.debugLine="Dim KeyIDLineaCLV As Int=clvIV.lblOrdenKeyID.Tex";
_keyidlineaclv = (int)(Double.parseDouble(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=206897156;
 //BA.debugLineNum = 206897156;BA.debugLine="If KeyIDLineaCLV>KeyIDEliminada Then";
if (_keyidlineaclv>_keyideliminada) { 
RDebugUtils.currentLine=206897157;
 //BA.debugLineNum = 206897157;BA.debugLine="clvIV.lblOrdenKeyID.Text=(KeyIDLineaCLV-1)";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString((_keyidlineaclv-1)));
 };
 }
};
RDebugUtils.currentLine=206897160;
 //BA.debugLineNum = 206897160;BA.debugLine="End Sub";
return "";
}
public static String  _chkcolumnatableview_checkedchange(boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "chkcolumnatableview_checkedchange", true))
	 {return ((String) Debug.delegate(ba, "chkcolumnatableview_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=207486976;
 //BA.debugLineNum = 207486976;BA.debugLine="private Sub chkColumnaTableView_CheckedChange(Chec";
RDebugUtils.currentLine=207486977;
 //BA.debugLineNum = 207486977;BA.debugLine="If CargandoDatos Then Return";
if (_cargandodatos) { 
if (true) return "";};
RDebugUtils.currentLine=207486978;
 //BA.debugLineNum = 207486978;BA.debugLine="RecalcularIDOrdenColumnas";
_recalcularidordencolumnas();
RDebugUtils.currentLine=207486979;
 //BA.debugLineNum = 207486979;BA.debugLine="End Sub";
return "";
}
public static String  _clvlistacampos_reachend() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "clvlistacampos_reachend", true))
	 {return ((String) Debug.delegate(ba, "clvlistacampos_reachend", null));}
RDebugUtils.currentLine=204668928;
 //BA.debugLineNum = 204668928;BA.debugLine="Sub clvListaCampos_ReachEnd";
RDebugUtils.currentLine=204668929;
 //BA.debugLineNum = 204668929;BA.debugLine="OffsetAnterior=clvListaCampos.sv.ScrollViewOffset";
_offsetanterior = (int) (_clvlistacampos._sv.getScrollViewOffsetY());
RDebugUtils.currentLine=204668930;
 //BA.debugLineNum = 204668930;BA.debugLine="End Sub";
return "";
}
public static String  _clvlistacampos_scrollchanged(int _offset) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "clvlistacampos_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "clvlistacampos_scrollchanged", new Object[] {_offset}));}
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
int _visiblepart = 0;
RDebugUtils.currentLine=204734464;
 //BA.debugLineNum = 204734464;BA.debugLine="Sub clvListaCampos_ScrollChanged (Offset As Int)";
RDebugUtils.currentLine=204734465;
 //BA.debugLineNum = 204734465;BA.debugLine="If mModoSnap=False Then Return";
if (_mmodosnap==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return "";};
RDebugUtils.currentLine=204734469;
 //BA.debugLineNum = 204734469;BA.debugLine="Log(\"clvDatos_ScrollChanged, Offset:\" & Offset)";
anywheresoftware.b4a.keywords.Common.LogImpl("9204734469","clvDatos_ScrollChanged, Offset:"+BA.NumberToString(_offset),0);
RDebugUtils.currentLine=204734472;
 //BA.debugLineNum = 204734472;BA.debugLine="If Offset=OffsetAnterior Then Return";
if (_offset==_offsetanterior) { 
if (true) return "";};
RDebugUtils.currentLine=204734474;
 //BA.debugLineNum = 204734474;BA.debugLine="If Offset>OffsetAnterior Then";
if (_offset>_offsetanterior) { 
RDebugUtils.currentLine=204734475;
 //BA.debugLineNum = 204734475;BA.debugLine="ScrollingDown=True";
_scrollingdown = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=204734477;
 //BA.debugLineNum = 204734477;BA.debugLine="ScrollingDown=False";
_scrollingdown = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=204734480;
 //BA.debugLineNum = 204734480;BA.debugLine="Dim i As Int = clvListaCampos.FirstVisibleIndex";
_i = _clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=204734481;
 //BA.debugLineNum = 204734481;BA.debugLine="Dim item As CLVItem	 = clvListaCampos.GetRawListI";
_item = _clvlistacampos._getrawlistitem(_i);
RDebugUtils.currentLine=204734482;
 //BA.debugLineNum = 204734482;BA.debugLine="Dim visiblepart As Int = item.Offset + item.Size";
_visiblepart = (int) (_item.Offset+_item.Size-_offset);
RDebugUtils.currentLine=204734484;
 //BA.debugLineNum = 204734484;BA.debugLine="If visiblepart<item.Size Then";
if (_visiblepart<_item.Size) { 
RDebugUtils.currentLine=204734485;
 //BA.debugLineNum = 204734485;BA.debugLine="If ScrollingDown Then";
if (_scrollingdown) { 
RDebugUtils.currentLine=204734487;
 //BA.debugLineNum = 204734487;BA.debugLine="clvListaCampos.JumpToItem(i+1)";
_clvlistacampos._jumptoitem((int) (_i+1));
 }else {
RDebugUtils.currentLine=204734490;
 //BA.debugLineNum = 204734490;BA.debugLine="clvListaCampos.JumpToItem(i)";
_clvlistacampos._jumptoitem(_i);
 };
 }else {
RDebugUtils.currentLine=204734493;
 //BA.debugLineNum = 204734493;BA.debugLine="OffsetAnterior=Offset";
_offsetanterior = _offset;
 };
RDebugUtils.currentLine=204734495;
 //BA.debugLineNum = 204734495;BA.debugLine="End Sub";
return "";
}
public static String  _colortohex(int _clr) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=204341248;
 //BA.debugLineNum = 204341248;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=204341249;
 //BA.debugLineNum = 204341249;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=204341250;
 //BA.debugLineNum = 204341250;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=204341251;
 //BA.debugLineNum = 204341251;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _configurarorigendatos() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "configurarorigendatos", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "configurarorigendatos", null));}
ResumableSub_ConfigurarOrigenDatos rsub = new ResumableSub_ConfigurarOrigenDatos(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ConfigurarOrigenDatos extends BA.ResumableSub {
public ResumableSub_ConfigurarOrigenDatos(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
b4j.docU.b4xlisttemplate _opttipoorigen = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btncancelar = null;
int _result = 0;
String _tipoorigendatos = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4j.objects.FileChooserWrapper _fcdb = null;
String _sfchdb = "";
anywheresoftware.b4j.objects.SQL _sqlorigendatos = null;
anywheresoftware.b4a.objects.collections.List _lsttablassqlite = null;
String _tbname = "";
String _dbquery = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdb = null;
Object _msa = null;
b4j.docU.b4xdialog _dlg = null;
b4j.docU.b4xlisttemplate _b4xlist = null;
anywheresoftware.b4j.objects.ButtonWrapper _bcancel = null;
int _rint = 0;
String _nombretabla = "";
anywheresoftware.b4a.objects.collections.List _lstfields = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=205455362;
 //BA.debugLineNum = 205455362;BA.debugLine="Dialog.Title=\"Selecciona tipo de origen de datos\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona tipo de origen de datos");
RDebugUtils.currentLine=205455363;
 //BA.debugLineNum = 205455363;BA.debugLine="Dim OptTipoOrigen As B4XListTemplate";
_opttipoorigen = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=205455364;
 //BA.debugLineNum = 205455364;BA.debugLine="OptTipoOrigen.Initialize";
_opttipoorigen._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=205455366;
 //BA.debugLineNum = 205455366;BA.debugLine="OptTipoOrigen.Options=Array As String(\"JRDC Table";
_opttipoorigen._options /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"JRDC Table","JRDC Query","Manual","SQLite Table"});
RDebugUtils.currentLine=205455367;
 //BA.debugLineNum = 205455367;BA.debugLine="OptTipoOrigen.AllowMultiSelection=False";
_opttipoorigen._allowmultiselection /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=205455368;
 //BA.debugLineNum = 205455368;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(OptTip";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_opttipoorigen),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=205455369;
 //BA.debugLineNum = 205455369;BA.debugLine="Dim btnCancelar As B4XView=Dialog.GetButton(xui.D";
_btncancelar = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btncancelar = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=205455370;
 //BA.debugLineNum = 205455370;BA.debugLine="btnCancelar.Left=btnCancelar.Left-20dip";
_btncancelar.setLeft(_btncancelar.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=205455371;
 //BA.debugLineNum = 205455371;BA.debugLine="btnCancelar.Width=btnCancelar.Width+20dip";
_btncancelar.setWidth(_btncancelar.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=205455372;
 //BA.debugLineNum = 205455372;BA.debugLine="Wait For (rs) complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _rs);
this.state = 59;
return;
case 59:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=205455373;
 //BA.debugLineNum = 205455373;BA.debugLine="If result=xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 58;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 57;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=205455374;
 //BA.debugLineNum = 205455374;BA.debugLine="SetCurrentFile(\"\")";
_setcurrentfile("");
RDebugUtils.currentLine=205455375;
 //BA.debugLineNum = 205455375;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=205455376;
 //BA.debugLineNum = 205455376;BA.debugLine="lstPrimaryKey.Initialize";
parent._lstprimarykey.Initialize();
RDebugUtils.currentLine=205455378;
 //BA.debugLineNum = 205455378;BA.debugLine="Dim TipoOrigenDatos As String=OptTipoOrigen.Sele";
_tipoorigendatos = _opttipoorigen._selecteditem /*String*/ ;
RDebugUtils.currentLine=205455379;
 //BA.debugLineNum = 205455379;BA.debugLine="Select True";
if (true) break;

case 4:
//select
this.state = 55;
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.True,(_tipoorigendatos).equals("JRDC Table"),(_tipoorigendatos).equals("JRDC Query"),(_tipoorigendatos).equals("Manual"),(_tipoorigendatos).equals("SQLite Table"))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 14;
if (true) break;
}
case 2: {
this.state = 22;
if (true) break;
}
case 3: {
this.state = 24;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=205455381;
 //BA.debugLineNum = 205455381;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
parent._prefdialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=205455383;
 //BA.debugLineNum = 205455383;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
parent._prefdialog._loadfromjson /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"OrigenDatosJRDCTable.json"));
RDebugUtils.currentLine=205455384;
 //BA.debugLineNum = 205455384;BA.debugLine="Dim mData As Map=CreateMap(\"ComandoJRDC\": \"Inf";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("ComandoJRDC"),(Object)("InfoCamposTabla")});
RDebugUtils.currentLine=205455385;
 //BA.debugLineNum = 205455385;BA.debugLine="Dim rSub As ResumableSub=prefDialog.ShowDialog";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._prefdialog._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL"));
RDebugUtils.currentLine=205455386;
 //BA.debugLineNum = 205455386;BA.debugLine="Wait For (rSub) Complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 60;
return;
case 60:
//C
this.state = 7;
_result = (int) result[0];
;
RDebugUtils.currentLine=205455388;
 //BA.debugLineNum = 205455388;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
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
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 12:
//C
this.state = 55;
;
RDebugUtils.currentLine=205455400;
 //BA.debugLineNum = 205455400;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
parent._lbltitleipjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455401;
 //BA.debugLineNum = 205455401;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
parent._lbltitlepuertojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455402;
 //BA.debugLineNum = 205455402;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
parent._lbltitlecomandojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455403;
 //BA.debugLineNum = 205455403;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
parent._lbltitleparametrosjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455404;
 //BA.debugLineNum = 205455404;BA.debugLine="txtIpJRDC.Enabled=True";
parent._txtipjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455405;
 //BA.debugLineNum = 205455405;BA.debugLine="txtParametrosJRDC.Enabled=True";
parent._txtparametrosjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455406;
 //BA.debugLineNum = 205455406;BA.debugLine="txtPuertoJRDC.Enabled=True";
parent._txtpuertojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455407;
 //BA.debugLineNum = 205455407;BA.debugLine="txtComandoJRDC.Enabled=True";
parent._txtcomandojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455408;
 //BA.debugLineNum = 205455408;BA.debugLine="mData.put(\"ParametrosJRDC\",mData.get(\"NombreTa";
_mdata.Put((Object)("ParametrosJRDC"),_mdata.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=205455410;
 //BA.debugLineNum = 205455410;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.Get((Object)("ComandoJRDC"))),BA.ObjectToString(_mdata.GetDefault((Object)("ParametrosJRDC"),(Object)(""))));
RDebugUtils.currentLine=205455411;
 //BA.debugLineNum = 205455411;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=205455412;
 //BA.debugLineNum = 205455412;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=205455413;
 //BA.debugLineNum = 205455413;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJ";
_cargacamposjrdctable(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtcomandojrdc.getText(),parent._txtparametrosjrdc.getText());
RDebugUtils.currentLine=205455414;
 //BA.debugLineNum = 205455414;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdctable_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), null);
this.state = 61;
return;
case 61:
//C
this.state = 55;
;
RDebugUtils.currentLine=205455415;
 //BA.debugLineNum = 205455415;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=205455417;
 //BA.debugLineNum = 205455417;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
parent._prefdialog._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=205455419;
 //BA.debugLineNum = 205455419;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
parent._prefdialog._loadfromjson /*String*/ (null,anywheresoftware.b4a.keywords.Common.File.ReadString(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"OrigenDatosJRDCQuery.json"));
RDebugUtils.currentLine=205455420;
 //BA.debugLineNum = 205455420;BA.debugLine="Dim mData As Map=CreateMap()";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {});
RDebugUtils.currentLine=205455421;
 //BA.debugLineNum = 205455421;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), parent._prefdialog._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL")));
this.state = 62;
return;
case 62:
//C
this.state = 15;
_result = (int) result[0];
;
RDebugUtils.currentLine=205455422;
 //BA.debugLineNum = 205455422;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_result!=parent._xui.DialogResponse_Positive) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 20:
//C
this.state = 55;
;
RDebugUtils.currentLine=205455425;
 //BA.debugLineNum = 205455425;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
parent._lbltitleipjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455426;
 //BA.debugLineNum = 205455426;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
parent._lbltitlepuertojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455427;
 //BA.debugLineNum = 205455427;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
parent._lbltitlecomandojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455428;
 //BA.debugLineNum = 205455428;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
parent._lbltitleparametrosjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=205455429;
 //BA.debugLineNum = 205455429;BA.debugLine="txtIpJRDC.Enabled=True";
parent._txtipjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455430;
 //BA.debugLineNum = 205455430;BA.debugLine="txtParametrosJRDC.Enabled=True";
parent._txtparametrosjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455431;
 //BA.debugLineNum = 205455431;BA.debugLine="txtPuertoJRDC.Enabled=True";
parent._txtpuertojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455432;
 //BA.debugLineNum = 205455432;BA.debugLine="txtComandoJRDC.Enabled=True";
parent._txtcomandojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455434;
 //BA.debugLineNum = 205455434;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ComandoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ParametrosJRDC"),(Object)(""))));
RDebugUtils.currentLine=205455435;
 //BA.debugLineNum = 205455435;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=205455436;
 //BA.debugLineNum = 205455436;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=205455437;
 //BA.debugLineNum = 205455437;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJ";
_cargacamposjrdcquery(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtcomandojrdc.getText(),parent._txtparametrosjrdc.getText());
RDebugUtils.currentLine=205455438;
 //BA.debugLineNum = 205455438;BA.debugLine="Wait For CargaCamposJRDCQuery_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcquery_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), null);
this.state = 63;
return;
case 63:
//C
this.state = 55;
;
RDebugUtils.currentLine=205455439;
 //BA.debugLineNum = 205455439;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 22:
//C
this.state = 55;
RDebugUtils.currentLine=205455442;
 //BA.debugLineNum = 205455442;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,"","","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=205455443;
 //BA.debugLineNum = 205455443;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
parent._lbltitleipjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455444;
 //BA.debugLineNum = 205455444;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
parent._lbltitlepuertojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455445;
 //BA.debugLineNum = 205455445;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
parent._lbltitlecomandojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455446;
 //BA.debugLineNum = 205455446;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
parent._lbltitleparametrosjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455447;
 //BA.debugLineNum = 205455447;BA.debugLine="txtIpJRDC.Enabled=False";
parent._txtipjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455448;
 //BA.debugLineNum = 205455448;BA.debugLine="txtParametrosJRDC.Enabled=False";
parent._txtparametrosjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455449;
 //BA.debugLineNum = 205455449;BA.debugLine="txtPuertoJRDC.Enabled=False";
parent._txtpuertojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455450;
 //BA.debugLineNum = 205455450;BA.debugLine="txtComandoJRDC.ENABLED=False";
parent._txtcomandojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455455;
 //BA.debugLineNum = 205455455;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=205455458;
 //BA.debugLineNum = 205455458;BA.debugLine="Dim FcDb As FileChooser";
_fcdb = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=205455459;
 //BA.debugLineNum = 205455459;BA.debugLine="FcDb.Initialize";
_fcdb.Initialize();
RDebugUtils.currentLine=205455460;
 //BA.debugLineNum = 205455460;BA.debugLine="FcDb.SetExtensionFilter(\"Ficheros db SQLite\",A";
_fcdb.SetExtensionFilter("Ficheros db SQLite",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.db"}));
RDebugUtils.currentLine=205455461;
 //BA.debugLineNum = 205455461;BA.debugLine="Dim sFchDB As String=FcDb.ShowOpen(frm)";
_sfchdb = _fcdb.ShowOpen(parent._frm);
RDebugUtils.currentLine=205455462;
 //BA.debugLineNum = 205455462;BA.debugLine="If sFchDB=\"\" Then Return False";
if (true) break;

case 25:
//if
this.state = 30;
if ((_sfchdb).equals("")) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=205455463;
 //BA.debugLineNum = 205455463;BA.debugLine="Dim SQLOrigenDatos As SQL";
_sqlorigendatos = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=205455464;
 //BA.debugLineNum = 205455464;BA.debugLine="SQLOrigenDatos.InitializeSQLite(File.GetFilePa";
_sqlorigendatos.InitializeSQLite(anywheresoftware.b4a.keywords.Common.File.GetFileParent(_sfchdb),anywheresoftware.b4a.keywords.Common.File.GetName(_sfchdb),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=205455466;
 //BA.debugLineNum = 205455466;BA.debugLine="Dim lstTablasSQLite As List";
_lsttablassqlite = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205455467;
 //BA.debugLineNum = 205455467;BA.debugLine="lstTablasSQLite.Initialize";
_lsttablassqlite.Initialize();
RDebugUtils.currentLine=205455468;
 //BA.debugLineNum = 205455468;BA.debugLine="Dim TBName As String";
_tbname = "";
RDebugUtils.currentLine=205455469;
 //BA.debugLineNum = 205455469;BA.debugLine="Dim DBQuery As String= \"Select name FROM sqlit";
_dbquery = "Select name FROM sqlite_master WHERE Type='table' ORDER BY name";
RDebugUtils.currentLine=205455470;
 //BA.debugLineNum = 205455470;BA.debugLine="Dim rsDB As ResultSet=SQLOrigenDatos.ExecQuery";
_rsdb = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdb = _sqlorigendatos.ExecQuery(_dbquery);
RDebugUtils.currentLine=205455471;
 //BA.debugLineNum = 205455471;BA.debugLine="Do While rsDB.NextRow";
if (true) break;

case 31:
//do while
this.state = 40;
while (_rsdb.NextRow()) {
this.state = 33;
if (true) break;
}
if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=205455472;
 //BA.debugLineNum = 205455472;BA.debugLine="TBName=rsDB.GetString2(0)";
_tbname = _rsdb.GetString2((int) (0));
RDebugUtils.currentLine=205455473;
 //BA.debugLineNum = 205455473;BA.debugLine="Log(\"   Table: \" & TBName)";
anywheresoftware.b4a.keywords.Common.LogImpl("9205455473","   Table: "+_tbname,0);
RDebugUtils.currentLine=205455474;
 //BA.debugLineNum = 205455474;BA.debugLine="If TBName.StartsWith(\"SQlite\") = False Then l";
if (true) break;

case 34:
//if
this.state = 39;
if (_tbname.startsWith("SQlite")==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_lsttablassqlite.Add((Object)(_tbname));
if (true) break;

case 39:
//C
this.state = 31;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=205455476;
 //BA.debugLineNum = 205455476;BA.debugLine="rsDB.Close";
_rsdb.Close();
RDebugUtils.currentLine=205455478;
 //BA.debugLineNum = 205455478;BA.debugLine="If lstTablasSQLite.Size=0 Then";
if (true) break;

case 41:
//if
this.state = 44;
if (_lsttablassqlite.getSize()==0) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=205455479;
 //BA.debugLineNum = 205455479;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La base";
_msa = parent._xui.MsgboxAsync(ba,"La base de datos SQLite"+_sfchdb+" no contiene tablas.","Aviso");
RDebugUtils.currentLine=205455480;
 //BA.debugLineNum = 205455480;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 44;
_result = (int) result[0];
;
RDebugUtils.currentLine=205455481;
 //BA.debugLineNum = 205455481;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=205455484;
 //BA.debugLineNum = 205455484;BA.debugLine="Dim Dlg As B4XDialog";
_dlg = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=205455485;
 //BA.debugLineNum = 205455485;BA.debugLine="Dlg.Initialize(frm.RootPane)";
_dlg._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._frm.getRootPane().getObject())));
RDebugUtils.currentLine=205455486;
 //BA.debugLineNum = 205455486;BA.debugLine="Dlg.Title=\"Indica Nombre de la Tabla\"";
_dlg._title /*Object*/  = (Object)("Indica Nombre de la Tabla");
RDebugUtils.currentLine=205455487;
 //BA.debugLineNum = 205455487;BA.debugLine="Dim B4XList As B4XListTemplate";
_b4xlist = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=205455488;
 //BA.debugLineNum = 205455488;BA.debugLine="B4XList.Initialize";
_b4xlist._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=205455489;
 //BA.debugLineNum = 205455489;BA.debugLine="B4XList.Options=lstTablasSQLite";
_b4xlist._options /*anywheresoftware.b4a.objects.collections.List*/  = _lsttablassqlite;
RDebugUtils.currentLine=205455490;
 //BA.debugLineNum = 205455490;BA.debugLine="B4XList.mBase.Width=500dip";
_b4xlist._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (500)));
RDebugUtils.currentLine=205455491;
 //BA.debugLineNum = 205455491;BA.debugLine="Dim rSub As ResumableSub=Dlg.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = _dlg._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlist),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=205455492;
 //BA.debugLineNum = 205455492;BA.debugLine="Dim bCancel As Button=Dlg.GetButton(xui.Dialog";
_bcancel = new anywheresoftware.b4j.objects.ButtonWrapper();
_bcancel = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(_dlg._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel).getObject()));
RDebugUtils.currentLine=205455493;
 //BA.debugLineNum = 205455493;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=205455494;
 //BA.debugLineNum = 205455494;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 65;
return;
case 65:
//C
this.state = 45;
_rint = (int) result[0];
;
RDebugUtils.currentLine=205455495;
 //BA.debugLineNum = 205455495;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 45:
//if
this.state = 50;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 47;
;}if (true) break;

case 47:
//C
this.state = 50;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=205455496;
 //BA.debugLineNum = 205455496;BA.debugLine="Dim NombreTabla As String=B4XList.SelectedItem";
_nombretabla = _b4xlist._selecteditem /*String*/ ;
RDebugUtils.currentLine=205455497;
 //BA.debugLineNum = 205455497;BA.debugLine="Dim lstFields As List=GetTablePragma(SQLOrigen";
_lstfields = new anywheresoftware.b4a.objects.collections.List();
_lstfields = _gettablepragma(_sqlorigendatos,_nombretabla);
RDebugUtils.currentLine=205455498;
 //BA.debugLineNum = 205455498;BA.debugLine="If lstFields.Size=0 Then";
if (true) break;

case 51:
//if
this.state = 54;
if (_lstfields.getSize()==0) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=205455499;
 //BA.debugLineNum = 205455499;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La tabla";
_msa = parent._xui.MsgboxAsync(ba,"La tabla "+_nombretabla+" no existe en la base de datos SQLite "+_sfchdb,"Error");
RDebugUtils.currentLine=205455500;
 //BA.debugLineNum = 205455500;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "configurarorigendatos"), _msa);
this.state = 66;
return;
case 66:
//C
this.state = 54;
_result = (int) result[0];
;
RDebugUtils.currentLine=205455501;
 //BA.debugLineNum = 205455501;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=205455504;
 //BA.debugLineNum = 205455504;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
parent._datosorigendatos = _createtipoorigendatos(_tipoorigendatos,"","","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=205455505;
 //BA.debugLineNum = 205455505;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
parent._lbltitleipjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455506;
 //BA.debugLineNum = 205455506;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
parent._lbltitlepuertojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455507;
 //BA.debugLineNum = 205455507;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
parent._lbltitlecomandojrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455508;
 //BA.debugLineNum = 205455508;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
parent._lbltitleparametrosjrdc.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=205455509;
 //BA.debugLineNum = 205455509;BA.debugLine="txtIpJRDC.Enabled=False";
parent._txtipjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455510;
 //BA.debugLineNum = 205455510;BA.debugLine="txtParametrosJRDC.Enabled=False";
parent._txtparametrosjrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455511;
 //BA.debugLineNum = 205455511;BA.debugLine="txtPuertoJRDC.Enabled=False";
parent._txtpuertojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455512;
 //BA.debugLineNum = 205455512;BA.debugLine="txtComandoJRDC.ENABLED=False";
parent._txtcomandojrdc.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=205455513;
 //BA.debugLineNum = 205455513;BA.debugLine="MostrarDatosOrigenDatos";
_mostrardatosorigendatos();
RDebugUtils.currentLine=205455515;
 //BA.debugLineNum = 205455515;BA.debugLine="CargaCamposTablaSQLite(lstFields)";
_cargacampostablasqlite(_lstfields);
RDebugUtils.currentLine=205455516;
 //BA.debugLineNum = 205455516;BA.debugLine="SQLOrigenDatos.Close";
_sqlorigendatos.Close();
 if (true) break;

case 55:
//C
this.state = 58;
;
RDebugUtils.currentLine=205455523;
 //BA.debugLineNum = 205455523;BA.debugLine="dragger.AddDragButtons";
parent._dragger._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=205455524;
 //BA.debugLineNum = 205455524;BA.debugLine="pnlOrigenSQL.Visible=True";
parent._pnlorigensql.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=205455526;
 //BA.debugLineNum = 205455526;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=205455528;
 //BA.debugLineNum = 205455528;BA.debugLine="RecalcularIDOrdenColumnas";
_recalcularidordencolumnas();
RDebugUtils.currentLine=205455529;
 //BA.debugLineNum = 205455529;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=205455530;
 //BA.debugLineNum = 205455530;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setcurrentfile(String _f) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "setcurrentfile", true))
	 {return ((String) Debug.delegate(ba, "setcurrentfile", new Object[] {_f}));}
RDebugUtils.currentLine=205193216;
 //BA.debugLineNum = 205193216;BA.debugLine="private Sub SetCurrentFile (f As String)";
RDebugUtils.currentLine=205193217;
 //BA.debugLineNum = 205193217;BA.debugLine="CurrentFile = f";
_currentfile = _f;
RDebugUtils.currentLine=205193218;
 //BA.debugLineNum = 205193218;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
_frm.setTitle(("CamposBuilder ("+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.2",(Object)(_version))+")"));
RDebugUtils.currentLine=205193219;
 //BA.debugLineNum = 205193219;BA.debugLine="If f <> \"\" Then";
if ((_f).equals("") == false) { 
RDebugUtils.currentLine=205193220;
 //BA.debugLineNum = 205193220;BA.debugLine="frm.Title = frm.Title & \" - \" & File.GetName(f)";
_frm.setTitle(_frm.getTitle()+" - "+anywheresoftware.b4a.keywords.Common.File.GetName(_f));
 };
RDebugUtils.currentLine=205193223;
 //BA.debugLineNum = 205193223;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _gettablepragma(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "gettablepragma", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettablepragma", new Object[] {_sql,_tablename}));}
anywheresoftware.b4a.objects.collections.List _lstfields = null;
String _tbquery = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.objects.collections.Map _columnparmsmap = null;
int _i = 0;
RDebugUtils.currentLine=205586432;
 //BA.debugLineNum = 205586432;BA.debugLine="Sub GetTablePragma(SQL As SQL,TableName As String)";
RDebugUtils.currentLine=205586433;
 //BA.debugLineNum = 205586433;BA.debugLine="Private lstFields As List";
_lstfields = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=205586434;
 //BA.debugLineNum = 205586434;BA.debugLine="lstFields.Initialize";
_lstfields.Initialize();
RDebugUtils.currentLine=205586435;
 //BA.debugLineNum = 205586435;BA.debugLine="Private TBQuery As String";
_tbquery = "";
RDebugUtils.currentLine=205586436;
 //BA.debugLineNum = 205586436;BA.debugLine="TBQuery = \"PRAGMA table_info(\" & TableName & \")\"";
_tbquery = "PRAGMA table_info("+_tablename+")";
RDebugUtils.currentLine=205586437;
 //BA.debugLineNum = 205586437;BA.debugLine="Dim rs As ResultSet=SQL.ExecQuery(TBQuery)";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = _sql.ExecQuery(_tbquery);
RDebugUtils.currentLine=205586438;
 //BA.debugLineNum = 205586438;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=205586439;
 //BA.debugLineNum = 205586439;BA.debugLine="Dim ColumnParmsMap As Map";
_columnparmsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=205586440;
 //BA.debugLineNum = 205586440;BA.debugLine="ColumnParmsMap.Initialize";
_columnparmsmap.Initialize();
RDebugUtils.currentLine=205586441;
 //BA.debugLineNum = 205586441;BA.debugLine="For i=0 To rs.ColumnCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_rs.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=205586442;
 //BA.debugLineNum = 205586442;BA.debugLine="Log (\"     \" & i & \": \" &  rs.GetColumnName(i)";
anywheresoftware.b4a.keywords.Common.LogImpl("9205586442","     "+BA.NumberToString(_i)+": "+_rs.GetColumnName(_i)+"->"+_rs.GetString2(_i),0);
RDebugUtils.currentLine=205586443;
 //BA.debugLineNum = 205586443;BA.debugLine="ColumnParmsMap.Put(rs.GetColumnName(i), rs.GetS";
_columnparmsmap.Put((Object)(_rs.GetColumnName(_i)),(Object)(_rs.GetString2(_i)));
 }
};
RDebugUtils.currentLine=205586445;
 //BA.debugLineNum = 205586445;BA.debugLine="lstFields.Add(ColumnParmsMap)";
_lstfields.Add((Object)(_columnparmsmap.getObject()));
 }
;
RDebugUtils.currentLine=205586447;
 //BA.debugLineNum = 205586447;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=205586448;
 //BA.debugLineNum = 205586448;BA.debugLine="Return lstFields";
if (true) return _lstfields;
RDebugUtils.currentLine=205586449;
 //BA.debugLineNum = 205586449;BA.debugLine="End Sub";
return null;
}
public static String  _convertintcolor2hexargb(anywheresoftware.b4j.objects.JFX.PaintWrapper _paintcol) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "convertintcolor2hexargb", true))
	 {return ((String) Debug.delegate(ba, "convertintcolor2hexargb", new Object[] {_paintcol}));}
String _hexargb2 = "";
RDebugUtils.currentLine=204275712;
 //BA.debugLineNum = 204275712;BA.debugLine="Sub ConvertIntColor2HexARGB(PaintCol As Paint) As";
RDebugUtils.currentLine=204275713;
 //BA.debugLineNum = 204275713;BA.debugLine="If PaintCol=fx.Colors.From32Bit(0x00FFFFFF) Then";
if ((_paintcol).equals((javafx.scene.paint.Paint)(_fx.Colors.From32Bit(((int)0x00ffffff))))) { 
RDebugUtils.currentLine=204275714;
 //BA.debugLineNum = 204275714;BA.debugLine="Return \"transparent\"";
if (true) return "transparent";
 };
RDebugUtils.currentLine=204275717;
 //BA.debugLineNum = 204275717;BA.debugLine="Dim HexARGB2 As String=fx.Colors.To32Bit(PaintCol";
_hexargb2 = BA.NumberToString(_fx.Colors.To32Bit((javafx.scene.paint.Paint)(_paintcol.getObject())));
RDebugUtils.currentLine=204275719;
 //BA.debugLineNum = 204275719;BA.debugLine="Return HexARGB2";
if (true) return _hexargb2;
RDebugUtils.currentLine=204275720;
 //BA.debugLineNum = 204275720;BA.debugLine="End Sub";
return "";
}
public static String  _deshabilitarnodos() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "deshabilitarnodos", true))
	 {return ((String) Debug.delegate(ba, "deshabilitarnodos", null));}
anywheresoftware.b4a.objects.collections.List _lstnodosdeshabilitados = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=207618048;
 //BA.debugLineNum = 207618048;BA.debugLine="private Sub DeshabilitarNodos";
RDebugUtils.currentLine=207618049;
 //BA.debugLineNum = 207618049;BA.debugLine="Dim lstNodosDeshabilitados As List";
_lstnodosdeshabilitados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=207618050;
 //BA.debugLineNum = 207618050;BA.debugLine="lstNodosDeshabilitados.Initialize";
_lstnodosdeshabilitados.Initialize();
RDebugUtils.currentLine=207618051;
 //BA.debugLineNum = 207618051;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = _frm.getRootPane().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group3.Get(index3)));
RDebugUtils.currentLine=207618052;
 //BA.debugLineNum = 207618052;BA.debugLine="If n.Enabled=True Then";
if (_n.getEnabled()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=207618053;
 //BA.debugLineNum = 207618053;BA.debugLine="n.Enabled=False";
_n.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=207618054;
 //BA.debugLineNum = 207618054;BA.debugLine="lstNodosDeshabilitados.Add(n)";
_lstnodosdeshabilitados.Add((Object)(_n.getObject()));
 };
 }
};
RDebugUtils.currentLine=207618057;
 //BA.debugLineNum = 207618057;BA.debugLine="End Sub";
return "";
}
public static String  _exporttocss(String _nombrejsontv) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "exporttocss", true))
	 {return ((String) Debug.delegate(ba, "exporttocss", new Object[] {_nombrejsontv}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcsstotal = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mitem = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcsscolumna = null;
String _colortexto = "";
String _colorfondo = "";
String _colorborde = "";
String _alineacion = "";
String _colorfondoencabezadocolumna = "";
String _colortextoencabezadocolumna = "";
anywheresoftware.b4j.object.JavaObject _nativeme = null;
String _shexstringcolorfondosemitransparente = "";
RDebugUtils.currentLine=204931072;
 //BA.debugLineNum = 204931072;BA.debugLine="private Sub ExportToCSS(NombreJSONTV As String) As";
RDebugUtils.currentLine=204931073;
 //BA.debugLineNum = 204931073;BA.debugLine="Dim sbCSSTotal As StringBuilder";
_sbcsstotal = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=204931074;
 //BA.debugLineNum = 204931074;BA.debugLine="sbCSSTotal.Initialize";
_sbcsstotal.Initialize();
RDebugUtils.currentLine=204931076;
 //BA.debugLineNum = 204931076;BA.debugLine="sbCSSTotal.Append(\"/* tamaño, bordes y color de f";
_sbcsstotal.Append("/* tamaño, bordes y color de fondo de los titulos*/").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931077;
 //BA.debugLineNum = 204931077;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(".column-header,").Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .filler {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931078;
 //BA.debugLineNum = 204931078;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color: \" & txtR";
_sbcsstotal.Append("-fx-background-color: "+_txtrgbcolorfondoencabezados.getText()+";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931079;
 //BA.debugLineNum = 204931079;BA.debugLine="sbCSSTotal.Append(\"-fx-size: 30;\").Append(CRLF)";
_sbcsstotal.Append("-fx-size: 30;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931080;
 //BA.debugLineNum = 204931080;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color: -fx-box-bord";
_sbcsstotal.Append("-fx-border-color: -fx-box-border;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931081;
 //BA.debugLineNum = 204931081;BA.debugLine="sbCSSTotal.Append(\"-fx-border-width: 0 1 1 0;\").A";
_sbcsstotal.Append("-fx-border-width: 0 1 1 0;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931082;
 //BA.debugLineNum = 204931082;BA.debugLine="sbCSSTotal.Append(\"-fx-border-insets: 0;\").Append";
_sbcsstotal.Append("-fx-border-insets: 0;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931083;
 //BA.debugLineNum = 204931083;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931084;
 //BA.debugLineNum = 204931084;BA.debugLine="sbCSSTotal.Append(CRLF)";
_sbcsstotal.Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931086;
 //BA.debugLineNum = 204931086;BA.debugLine="sbCSSTotal.Append(\"/* centrar y cambiar color de";
_sbcsstotal.Append("/* centrar y cambiar color de los titulos de columnas*/").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931087;
 //BA.debugLineNum = 204931087;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .column-header .label{").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931088;
 //BA.debugLineNum = 204931088;BA.debugLine="sbCSSTotal.Append(\"-fx-text-fill: \" & txtRGBColor";
_sbcsstotal.Append("-fx-text-fill: "+_txtrgbcolortextoencabezados.getText()+";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931089;
 //BA.debugLineNum = 204931089;BA.debugLine="sbCSSTotal.Append(\"-fx-alignment: CENTER;\").Appen";
_sbcsstotal.Append("-fx-alignment: CENTER;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931090;
 //BA.debugLineNum = 204931090;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931091;
 //BA.debugLineNum = 204931091;BA.debugLine="sbCSSTotal.Append(CRLF)";
_sbcsstotal.Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931098;
 //BA.debugLineNum = 204931098;BA.debugLine="sbCSSTotal.Append(\"/*ScrollBars*/\").Append(CRLF)";
_sbcsstotal.Append("/*ScrollBars*/").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931099;
 //BA.debugLineNum = 204931099;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .scroll-bar:horizontal ,").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931100;
 //BA.debugLineNum = 204931100;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .scroll-bar:vertical{").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931101;
 //BA.debugLineNum = 204931101;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color:dimgray;\"";
_sbcsstotal.Append("-fx-background-color:dimgray;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931102;
 //BA.debugLineNum = 204931102;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931104;
 //BA.debugLineNum = 204931104;BA.debugLine="sbCSSTotal.Append(\"/* The increment And decrement";
_sbcsstotal.Append("/* The increment And decrement button CSS class of scrollbar */").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931105;
 //BA.debugLineNum = 204931105;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .increment-button ,").Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .decrement-button {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931106;
 //BA.debugLineNum = 204931106;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color:transpare";
_sbcsstotal.Append("-fx-background-color:transparent;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931107;
 //BA.debugLineNum = 204931107;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color:derive(gray,8";
_sbcsstotal.Append("-fx-border-color:derive(gray,80%);").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931108;
 //BA.debugLineNum = 204931108;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931118;
 //BA.debugLineNum = 204931118;BA.debugLine="sbCSSTotal.Append(\"/* The Main scrollbar **thumb*";
_sbcsstotal.Append("/* The Main scrollbar **thumb** CSS class which we drag every time (movable) */").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931119;
 //BA.debugLineNum = 204931119;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .scroll-bar:horizontal .thumb,").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931120;
 //BA.debugLineNum = 204931120;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(" .scroll-bar:vertical .thumb {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931121;
 //BA.debugLineNum = 204931121;BA.debugLine="sbCSSTotal.Append(\"-fx-background-color:#AEAEAE;\"";
_sbcsstotal.Append("-fx-background-color:#AEAEAE;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931122;
 //BA.debugLineNum = 204931122;BA.debugLine="sbCSSTotal.Append(\"-fx-background-insets: 1.5, 1,";
_sbcsstotal.Append("-fx-background-insets: 1.5, 1, 1.5, 1;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931123;
 //BA.debugLineNum = 204931123;BA.debugLine="sbCSSTotal.Append(\"-fx-background-radius: 0.5em;\"";
_sbcsstotal.Append("-fx-background-radius: 0.5em;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931124;
 //BA.debugLineNum = 204931124;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931125;
 //BA.debugLineNum = 204931125;BA.debugLine="sbCSSTotal.Append(\"/*Fin Scrollbars*/\").Append(CR";
_sbcsstotal.Append("/*Fin Scrollbars*/").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931157;
 //BA.debugLineNum = 204931157;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(".table-row-cell:odd:contains-selection {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931164;
 //BA.debugLineNum = 204931164;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color: darkred;\").A";
_sbcsstotal.Append("-fx-border-color: darkred;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931165;
 //BA.debugLineNum = 204931165;BA.debugLine="sbCSSTotal.Append(\"-fx-border-width: 1;\").Append(";
_sbcsstotal.Append("-fx-border-width: 1;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931166;
 //BA.debugLineNum = 204931166;BA.debugLine="sbCSSTotal.Append(\"-fx-border-insets: 0 -1 0 -1;\"";
_sbcsstotal.Append("-fx-border-insets: 0 -1 0 -1;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931167;
 //BA.debugLineNum = 204931167;BA.debugLine="sbCSSTotal.Append(\"-fx-border-style: segments(4,4";
_sbcsstotal.Append("-fx-border-style: segments(4,4) hidden segments(4,4) hidden;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931169;
 //BA.debugLineNum = 204931169;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931170;
 //BA.debugLineNum = 204931170;BA.debugLine="sbCSSTotal.Append(CRLF)";
_sbcsstotal.Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931172;
 //BA.debugLineNum = 204931172;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(".table-row-cell:even:contains-selection {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931179;
 //BA.debugLineNum = 204931179;BA.debugLine="sbCSSTotal.Append(\"-fx-border-color: darkred;\").A";
_sbcsstotal.Append("-fx-border-color: darkred;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931180;
 //BA.debugLineNum = 204931180;BA.debugLine="sbCSSTotal.Append(\"-fx-border-width: 1;\").Append(";
_sbcsstotal.Append("-fx-border-width: 1;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931181;
 //BA.debugLineNum = 204931181;BA.debugLine="sbCSSTotal.Append(\"-fx-border-insets: 0 -1 0 -1;\"";
_sbcsstotal.Append("-fx-border-insets: 0 -1 0 -1;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931182;
 //BA.debugLineNum = 204931182;BA.debugLine="sbCSSTotal.Append(\"-fx-border-style: segments(4,4";
_sbcsstotal.Append("-fx-border-style: segments(4,4) hidden segments(4,4) hidden;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931184;
 //BA.debugLineNum = 204931184;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931185;
 //BA.debugLineNum = 204931185;BA.debugLine="sbCSSTotal.Append(CRLF)";
_sbcsstotal.Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931194;
 //BA.debugLineNum = 204931194;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(".table-row-cell:odd{").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931195;
 //BA.debugLineNum = 204931195;BA.debugLine="sbCSSTotal.Append(\"-fx-background:\").Append(txtRG";
_sbcsstotal.Append("-fx-background:").Append(_txtrgbcolorfondofilasimpares.getText()+";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931196;
 //BA.debugLineNum = 204931196;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931197;
 //BA.debugLineNum = 204931197;BA.debugLine="sbCSSTotal.Append(CRLF)";
_sbcsstotal.Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931199;
 //BA.debugLineNum = 204931199;BA.debugLine="sbCSSTotal.Append(\".\").Append(NombreJSONTV).Appen";
_sbcsstotal.Append(".").Append(_nombrejsontv).Append(".table-view ").Append(".table-row-cell:even{").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931200;
 //BA.debugLineNum = 204931200;BA.debugLine="sbCSSTotal.Append(\"-fx-background:\").Append(txtRG";
_sbcsstotal.Append("-fx-background:").Append(_txtrgbcolorfondofilaspares.getText()+";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931201;
 //BA.debugLineNum = 204931201;BA.debugLine="sbCSSTotal.Append(\"}\").Append(CRLF)";
_sbcsstotal.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931202;
 //BA.debugLineNum = 204931202;BA.debugLine="sbCSSTotal.Append(CRLF)";
_sbcsstotal.Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931204;
 //BA.debugLineNum = 204931204;BA.debugLine="sbCSSTotal.Append(\"/* COLUMNAS*/\").Append(CRLF)";
_sbcsstotal.Append("/* COLUMNAS*/").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931206;
 //BA.debugLineNum = 204931206;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
{
final int step59 = 1;
final int limit59 = (int) (_clvlistacampos._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit59 ;_i = _i + step59 ) {
RDebugUtils.currentLine=204931208;
 //BA.debugLineNum = 204931208;BA.debugLine="Dim mItem As Map=ItemValueToMap(clvListaCampos.G";
_mitem = new anywheresoftware.b4a.objects.collections.Map();
_mitem = _itemvaluetomap((b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(_clvlistacampos._getvalue(_i)));
RDebugUtils.currentLine=204931209;
 //BA.debugLineNum = 204931209;BA.debugLine="If False=mItem.get(\"ColumnaTableView\") Then Cont";
if (anywheresoftware.b4a.keywords.Common.False==BA.ObjectToBoolean(_mitem.Get((Object)("ColumnaTableView")))) { 
if (true) continue;};
RDebugUtils.currentLine=204931210;
 //BA.debugLineNum = 204931210;BA.debugLine="Dim sbCSSColumna As StringBuilder";
_sbcsscolumna = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=204931211;
 //BA.debugLineNum = 204931211;BA.debugLine="sbCSSColumna.Initialize";
_sbcsscolumna.Initialize();
RDebugUtils.currentLine=204931212;
 //BA.debugLineNum = 204931212;BA.debugLine="Dim ColorTexto As String=mItem.Get(\"ColorTexto\")";
_colortexto = BA.ObjectToString(_mitem.Get((Object)("ColorTexto")));
RDebugUtils.currentLine=204931213;
 //BA.debugLineNum = 204931213;BA.debugLine="Dim ColorFondo As String=mItem.Get(\"ColorFondo\")";
_colorfondo = BA.ObjectToString(_mitem.Get((Object)("ColorFondo")));
RDebugUtils.currentLine=204931215;
 //BA.debugLineNum = 204931215;BA.debugLine="Dim ColorBorde As String=mItem.Get(\"ColorBordeCe";
_colorborde = BA.ObjectToString(_mitem.Get((Object)("ColorBordeCeldaSeleccionada")));
RDebugUtils.currentLine=204931217;
 //BA.debugLineNum = 204931217;BA.debugLine="Dim Alineacion As String=mItem.Get(\"AlineacionCo";
_alineacion = BA.ObjectToString(_mitem.Get((Object)("AlineacionColumna")));
RDebugUtils.currentLine=204931219;
 //BA.debugLineNum = 204931219;BA.debugLine="Dim ColorFondoEncabezadoColumna As String=mItem.";
_colorfondoencabezadocolumna = BA.ObjectToString(_mitem.GetDefault((Object)("ColorFondoEncabezadoColumna"),(Object)(_txtrgbcolorfondoencabezados.getText())));
RDebugUtils.currentLine=204931220;
 //BA.debugLineNum = 204931220;BA.debugLine="Dim ColorTextoEncabezadoColumna As String=mItem.";
_colortextoencabezadocolumna = BA.ObjectToString(_mitem.GetDefault((Object)("ColorTextoEncabezadoColumna"),(Object)(_txtrgbcolortextoencabezados.getText())));
RDebugUtils.currentLine=204931236;
 //BA.debugLineNum = 204931236;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).A";
_sbcsscolumna.Append(".").Append(_nombrejsontv).Append("-").Append(BA.ObjectToString(_mitem.Get((Object)("AliasCampo")))).Append(".table-cell {");
RDebugUtils.currentLine=204931241;
 //BA.debugLineNum = 204931241;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"-fx-text-fil";
_sbcsscolumna.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append("-fx-text-fill: ").Append(_colortexto).Append(";");
RDebugUtils.currentLine=204931247;
 //BA.debugLineNum = 204931247;BA.debugLine="If ColorFondo<>\"transparent\" Then";
if ((_colorfondo).equals("transparent") == false) { 
RDebugUtils.currentLine=204931249;
 //BA.debugLineNum = 204931249;BA.debugLine="Dim NativeMe As JavaObject=Me";
_nativeme = new anywheresoftware.b4j.object.JavaObject();
_nativeme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(jamtableviewcamposbuilder.getObject()));
RDebugUtils.currentLine=204931250;
 //BA.debugLineNum = 204931250;BA.debugLine="Dim sHexStringColorFondoSemitransparente As St";
_shexstringcolorfondosemitransparente = BA.ObjectToString(_nativeme.RunMethod("ColorStringToHexStringSemiTransparent",new Object[]{(Object)(_colorfondo)}));
RDebugUtils.currentLine=204931252;
 //BA.debugLineNum = 204931252;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"-fx-backgrou";
_sbcsscolumna.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append("-fx-background-color: ").Append(_shexstringcolorfondosemitransparente).Append(";");
RDebugUtils.currentLine=204931253;
 //BA.debugLineNum = 204931253;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"-fx-backgrou";
_sbcsscolumna.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append("-fx-background-insets: 1;");
 };
RDebugUtils.currentLine=204931264;
 //BA.debugLineNum = 204931264;BA.debugLine="sbCSSColumna.Append(CRLF).Append(\"}\").Append(CR";
_sbcsscolumna.Append(anywheresoftware.b4a.keywords.Common.CRLF).Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931269;
 //BA.debugLineNum = 204931269;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).Ap";
_sbcsscolumna.Append(".").Append(_nombrejsontv).Append("-").Append(BA.ObjectToString(_mitem.Get((Object)("AliasCampo")))).Append(".table-cell:selected {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931281;
 //BA.debugLineNum = 204931281;BA.debugLine="If ColorFondo<>\"transparent\" Then";
if ((_colorfondo).equals("transparent") == false) { 
RDebugUtils.currentLine=204931282;
 //BA.debugLineNum = 204931282;BA.debugLine="sbCSSColumna.Append(\"-fx-background-color: \").A";
_sbcsscolumna.Append("-fx-background-color: ").Append(_shexstringcolorfondosemitransparente).Append(";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 }else {
RDebugUtils.currentLine=204931285;
 //BA.debugLineNum = 204931285;BA.debugLine="sbCSSColumna.Append(\"-fx-background-color: tran";
_sbcsscolumna.Append("-fx-background-color: transparent;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
 };
RDebugUtils.currentLine=204931292;
 //BA.debugLineNum = 204931292;BA.debugLine="sbCSSColumna.Append(\"-fx-border-width: 3 4 3 4;\"";
_sbcsscolumna.Append("-fx-border-width: 3 4 3 4;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931293;
 //BA.debugLineNum = 204931293;BA.debugLine="sbCSSColumna.Append(\"-fx-border-insets: 0 1 1 1;";
_sbcsscolumna.Append("-fx-border-insets: 0 1 1 1;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931294;
 //BA.debugLineNum = 204931294;BA.debugLine="sbCSSColumna.Append(\"-fx-border-color: \").Append";
_sbcsscolumna.Append("-fx-border-color: ").Append(_colorborde).Append(";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931308;
 //BA.debugLineNum = 204931308;BA.debugLine="sbCSSColumna.Append(\"}\").Append(CRLF)";
_sbcsscolumna.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931310;
 //BA.debugLineNum = 204931310;BA.debugLine="If ColorFondoEncabezadoColumna<>txtRGBColorFondo";
if ((_colorfondoencabezadocolumna).equals(_txtrgbcolorfondoencabezados.getText()) == false) { 
RDebugUtils.currentLine=204931311;
 //BA.debugLineNum = 204931311;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).A";
_sbcsscolumna.Append(".").Append(_nombrejsontv).Append(".table-view .column-header.").Append(_nombrejsontv).Append("-").Append(BA.ObjectToString(_mitem.Get((Object)("AliasCampo")))).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931312;
 //BA.debugLineNum = 204931312;BA.debugLine="sbCSSColumna.Append(\" {\").Append(CRLF)";
_sbcsscolumna.Append(" {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931313;
 //BA.debugLineNum = 204931313;BA.debugLine="sbCSSColumna.Append(\"-fx-background-color: \").A";
_sbcsscolumna.Append("-fx-background-color: ").Append(_colorfondoencabezadocolumna).Append(";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931314;
 //BA.debugLineNum = 204931314;BA.debugLine="sbCSSColumna.Append(\"-fx-size: 30;\").Append(CRL";
_sbcsscolumna.Append("-fx-size: 30;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931315;
 //BA.debugLineNum = 204931315;BA.debugLine="sbCSSColumna.Append(\"-fx-border-color: -fx-box-";
_sbcsscolumna.Append("-fx-border-color: -fx-box-border;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931316;
 //BA.debugLineNum = 204931316;BA.debugLine="sbCSSColumna.Append(\"-fx-border-width: 0 1 1 0;";
_sbcsscolumna.Append("-fx-border-width: 0 1 1 0;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931317;
 //BA.debugLineNum = 204931317;BA.debugLine="sbCSSColumna.Append(\"-fx-border-insets: 0;\").Ap";
_sbcsscolumna.Append("-fx-border-insets: 0;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931319;
 //BA.debugLineNum = 204931319;BA.debugLine="sbCSSColumna.Append(\"}\").Append(CRLF)";
_sbcsscolumna.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931320;
 //BA.debugLineNum = 204931320;BA.debugLine="sbCSSColumna.Append(CRLF)";
_sbcsscolumna.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 };
RDebugUtils.currentLine=204931323;
 //BA.debugLineNum = 204931323;BA.debugLine="If ColorTextoEncabezadoColumna<>txtRGBColorTexto";
if ((_colortextoencabezadocolumna).equals(_txtrgbcolortextoencabezados.getText()) == false) { 
RDebugUtils.currentLine=204931324;
 //BA.debugLineNum = 204931324;BA.debugLine="sbCSSColumna.Append(\".\").append(NombreJSONTV).A";
_sbcsscolumna.Append(".").Append(_nombrejsontv).Append(".table-view .column-header.").Append(_nombrejsontv).Append("-").Append(BA.ObjectToString(_mitem.Get((Object)("AliasCampo")))).Append(" .label").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931325;
 //BA.debugLineNum = 204931325;BA.debugLine="sbCSSColumna.Append(\" {\").Append(CRLF)";
_sbcsscolumna.Append(" {").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931326;
 //BA.debugLineNum = 204931326;BA.debugLine="sbCSSColumna.Append(\"-fx-text-fill: \" & ColorTe";
_sbcsscolumna.Append("-fx-text-fill: "+_colortextoencabezadocolumna+";").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931327;
 //BA.debugLineNum = 204931327;BA.debugLine="sbCSSColumna.Append(\"-fx-alignment: CENTER;\").A";
_sbcsscolumna.Append("-fx-alignment: CENTER;").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931328;
 //BA.debugLineNum = 204931328;BA.debugLine="sbCSSColumna.Append(\"}\").Append(CRLF)";
_sbcsscolumna.Append("}").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=204931329;
 //BA.debugLineNum = 204931329;BA.debugLine="sbCSSColumna.Append(CRLF)";
_sbcsscolumna.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 };
RDebugUtils.currentLine=204931333;
 //BA.debugLineNum = 204931333;BA.debugLine="sbCSSTotal.Append(sbCSSColumna.ToString)";
_sbcsstotal.Append(_sbcsscolumna.ToString());
 }
};
RDebugUtils.currentLine=204931336;
 //BA.debugLineNum = 204931336;BA.debugLine="Return sbCSSTotal.ToString";
if (true) return _sbcsstotal.ToString();
RDebugUtils.currentLine=204931357;
 //BA.debugLineNum = 204931357;BA.debugLine="End Sub";
return "";
}
public static String  _frm_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "frm_closerequest", true))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=203685888;
 //BA.debugLineNum = 203685888;BA.debugLine="private Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=203685889;
 //BA.debugLineNum = 203685889;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=203685890;
 //BA.debugLineNum = 203685890;BA.debugLine="End Sub";
return "";
}
public static String  _getcsscolorstringfrompaint(anywheresoftware.b4j.objects.JFX.PaintWrapper _value) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "getcsscolorstringfrompaint", true))
	 {return ((String) Debug.delegate(ba, "getcsscolorstringfrompaint", new Object[] {_value}));}
int _colorint = 0;
String _hexargb = "";
String _hexrgb = "";
RDebugUtils.currentLine=204144640;
 //BA.debugLineNum = 204144640;BA.debugLine="Private Sub GetCssColorStringFromPaint(value As Pa";
RDebugUtils.currentLine=204144641;
 //BA.debugLineNum = 204144641;BA.debugLine="Select value";
switch (BA.switchObjectToInt(_value,(javafx.scene.paint.Paint)(_fx.Colors.Transparent),(javafx.scene.paint.Paint)(_fx.Colors.Black))) {
case 0: {
RDebugUtils.currentLine=204144643;
 //BA.debugLineNum = 204144643;BA.debugLine="Return \"transparent\"";
if (true) return "transparent";
 break; }
case 1: {
RDebugUtils.currentLine=204144645;
 //BA.debugLineNum = 204144645;BA.debugLine="Return \"black\"";
if (true) return "black";
 break; }
default: {
RDebugUtils.currentLine=204144647;
 //BA.debugLineNum = 204144647;BA.debugLine="Dim ColorInt As Int=fx.Colors.To32Bit(value)";
_colorint = _fx.Colors.To32Bit((javafx.scene.paint.Paint)(_value.getObject()));
RDebugUtils.currentLine=204144649;
 //BA.debugLineNum = 204144649;BA.debugLine="Dim HexARGB As String=ColorToHex(ColorInt)";
_hexargb = _colortohex(_colorint);
RDebugUtils.currentLine=204144650;
 //BA.debugLineNum = 204144650;BA.debugLine="If HexARGB.Length=6 Then";
if (_hexargb.length()==6) { 
RDebugUtils.currentLine=204144651;
 //BA.debugLineNum = 204144651;BA.debugLine="Return \"#\" & HexARGB";
if (true) return "#"+_hexargb;
 }else {
RDebugUtils.currentLine=204144653;
 //BA.debugLineNum = 204144653;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
_hexrgb = _hexargb.substring((int) (2),(int) (8));
RDebugUtils.currentLine=204144654;
 //BA.debugLineNum = 204144654;BA.debugLine="Return \"#\" & HexRGB";
if (true) return "#"+_hexrgb;
 };
 break; }
}
;
RDebugUtils.currentLine=204144657;
 //BA.debugLineNum = 204144657;BA.debugLine="End Sub";
return "";
}
public static String  _habilitardeshabilitarcheckbox(anywheresoftware.b4j.objects.CheckboxWrapper _chkboxsel,boolean _habilitado) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "habilitardeshabilitarcheckbox", true))
	 {return ((String) Debug.delegate(ba, "habilitardeshabilitarcheckbox", new Object[] {_chkboxsel,_habilitado}));}
RDebugUtils.currentLine=206569472;
 //BA.debugLineNum = 206569472;BA.debugLine="private Sub HabilitarDeshabilitarCheckBox(chkboxSe";
RDebugUtils.currentLine=206569473;
 //BA.debugLineNum = 206569473;BA.debugLine="chkboxSel.Enabled=Habilitado";
_chkboxsel.setEnabled(_habilitado);
RDebugUtils.currentLine=206569474;
 //BA.debugLineNum = 206569474;BA.debugLine="If Habilitado Then";
if (_habilitado) { 
RDebugUtils.currentLine=206569475;
 //BA.debugLineNum = 206569475;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:black; -fx-border";
_chkboxsel.setStyle("-fx-text-fill:black; -fx-border-color: black");
 }else {
RDebugUtils.currentLine=206569477;
 //BA.debugLineNum = 206569477;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:lightgray; -fx-bo";
_chkboxsel.setStyle("-fx-text-fill:lightgray; -fx-border-color: lightgray");
 };
RDebugUtils.currentLine=206569479;
 //BA.debugLineNum = 206569479;BA.debugLine="End Sub";
return "";
}
public static String  _habilitarnodos() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "habilitarnodos", true))
	 {return ((String) Debug.delegate(ba, "habilitarnodos", null));}
anywheresoftware.b4a.objects.collections.List _lstnodosdeshabilitados = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=207683584;
 //BA.debugLineNum = 207683584;BA.debugLine="private Sub HabilitarNodos";
RDebugUtils.currentLine=207683585;
 //BA.debugLineNum = 207683585;BA.debugLine="Dim lstNodosDeshabilitados As List";
_lstnodosdeshabilitados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=207683586;
 //BA.debugLineNum = 207683586;BA.debugLine="lstNodosDeshabilitados.Initialize";
_lstnodosdeshabilitados.Initialize();
RDebugUtils.currentLine=207683587;
 //BA.debugLineNum = 207683587;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = _frm.getRootPane().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group3.Get(index3)));
RDebugUtils.currentLine=207683588;
 //BA.debugLineNum = 207683588;BA.debugLine="If n.Enabled=False Then";
if (_n.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=207683589;
 //BA.debugLineNum = 207683589;BA.debugLine="n.Enabled=True";
_n.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=207683590;
 //BA.debugLineNum = 207683590;BA.debugLine="lstNodosDeshabilitados.Add(n)";
_lstnodosdeshabilitados.Add((Object)(_n.getObject()));
 };
 }
};
RDebugUtils.currentLine=207683593;
 //BA.debugLineNum = 207683593;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _help() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "help", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "help", null));}
ResumableSub_Help rsub = new ResumableSub_Help(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Help extends BA.ResumableSub {
public ResumableSub_Help(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
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
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=207159297;
 //BA.debugLineNum = 207159297;BA.debugLine="Dialog.Title=\"Información\"";
parent._dialog._title /*Object*/  = (Object)("Información");
RDebugUtils.currentLine=207159300;
 //BA.debugLineNum = 207159300;BA.debugLine="Dim DlgInfo As B4XLongTextTemplate";
_dlginfo = new b4j.docU.b4xlongtexttemplate();
RDebugUtils.currentLine=207159301;
 //BA.debugLineNum = 207159301;BA.debugLine="DlgInfo.Initialize";
_dlginfo._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=207159302;
 //BA.debugLineNum = 207159302;BA.debugLine="Dim sbInfo As StringBuilder";
_sbinfo = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=207159303;
 //BA.debugLineNum = 207159303;BA.debugLine="sbInfo.Initialize";
_sbinfo.Initialize();
RDebugUtils.currentLine=207159304;
 //BA.debugLineNum = 207159304;BA.debugLine="sbInfo.Append(\"Instrucciones:\").Append(CRLF).Appe";
_sbinfo.Append("Instrucciones:").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159305;
 //BA.debugLineNum = 207159305;BA.debugLine="sbInfo.Append(\"1) El nombre del campo y su tipo s";
_sbinfo.Append("1) El nombre del campo y su tipo son obligatorios").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159306;
 //BA.debugLineNum = 207159306;BA.debugLine="sbInfo.Append(\"Los campos tipo fecha (se recupera";
_sbinfo.Append("Los campos tipo fecha (se recuperará un Long del origen de datos), hay que marcarlos como \"Es Fecha\".").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159307;
 //BA.debugLineNum = 207159307;BA.debugLine="sbInfo.Append(\"Si el origen de datos se obtiene m";
_sbinfo.Append("Si el origen de datos se obtiene mediante tabla / vista / query SQL , TODOS los campos devueltos por SQL deben estar definidos. NO se puede eliminar un campo obtenido mediante SQL").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159309;
 //BA.debugLineNum = 207159309;BA.debugLine="sbInfo.Append(\"En caso de origen de datos tipo Qu";
_sbinfo.Append("En caso de origen de datos tipo Query, si no hay parámetros, dejar en blanco. Si hay más de 1 parámetro, separarlos mediante punto y coma (;)").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159310;
 //BA.debugLineNum = 207159310;BA.debugLine="sbInfo.Append(\"En caso de carga de 1 JSON ya exis";
_sbinfo.Append("En caso de carga de 1 JSON ya existente, se comparán los campos del JSON, con los devueltos actualmente por la consulta SQL. Casos:").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159311;
 //BA.debugLineNum = 207159311;BA.debugLine="sbInfo.Append(\"   - El campo de SQL ya existe en";
_sbinfo.Append("   - El campo de SQL ya existe en el JSON: Se mantiene como está definido en el JSON.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159312;
 //BA.debugLineNum = 207159312;BA.debugLine="sbInfo.Append(\"   - El campo de SQL NO existe en";
_sbinfo.Append("   - El campo de SQL NO existe en el JSON: Se añade al CLV con el nombre de campo, alias y encabezado de columna = nombre de campo. El resto de datos estará en blanco.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159313;
 //BA.debugLineNum = 207159313;BA.debugLine="sbInfo.Append(\"   - El campo está en el JSON, per";
_sbinfo.Append("   - El campo está en el JSON, pero la SQL no lo ha devuelto: Se mostrará una advertencia para confirmar si continuar o detener el proceso (para revisar la SQL por parte del programador.").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159316;
 //BA.debugLineNum = 207159316;BA.debugLine="sbInfo.Append(\"Es posible indicar varios campos d";
_sbinfo.Append("Es posible indicar varios campos de clave primeria, ordenados del 1 al X, indicándolo en el valor del KeyID.").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159317;
 //BA.debugLineNum = 207159317;BA.debugLine="sbInfo.Append(\"2) Para los campos que se quiera m";
_sbinfo.Append("2) Para los campos que se quiera mostrar en columnas, hay que marcar el checkbox Columna.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159318;
 //BA.debugLineNum = 207159318;BA.debugLine="sbInfo.Append(\"Por defecto, salvo que sea campo c";
_sbinfo.Append("Por defecto, salvo que sea campo calculado, se copia el valor del nombre del campo al alias de campo y al encabezado. Se puede editar posteriormente.").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159319;
 //BA.debugLineNum = 207159319;BA.debugLine="sbInfo.Append(\"3) Para los campos por los que se";
_sbinfo.Append("3) Para los campos por los que se quiera poder filtrar, definir un tipo de control para el filtro. Si no se quiere permitir filtrar por un campo, dejarlo en blanco.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159320;
 //BA.debugLineNum = 207159320;BA.debugLine="sbInfo.Append(\"En el selector del filtro se mostr";
_sbinfo.Append("En el selector del filtro se mostrará el alias del campo.").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159321;
 //BA.debugLineNum = 207159321;BA.debugLine="sbInfo.Append(\"4) Es posible añadir o eliminar ca";
_sbinfo.Append("4) Es posible añadir o eliminar campos manualmente. Los campos calculados deben introducirse en el combo Campo, con sintaxis válida de SQLite, con los ALIAS DE CAMPO correspondientes a los campos entre corchetes.");
RDebugUtils.currentLine=207159322;
 //BA.debugLineNum = 207159322;BA.debugLine="sbInfo.Append(\"Si el origen de datos es de tipo S";
_sbinfo.Append("Si el origen de datos es de tipo SQL , solo se podrán añadir campos calculados").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159324;
 //BA.debugLineNum = 207159324;BA.debugLine="sbInfo.Append(\"Un campo transformado a partir de";
_sbinfo.Append("Un campo transformado a partir de 1 sola columna no es un campo calculado, se trata como un formato. Ver punto siguiente.").Append(anywheresoftware.b4a.keywords.Common.CRLF).Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159325;
 //BA.debugLineNum = 207159325;BA.debugLine="sbInfo.Append(\"5) Los formatos de las columnas se";
_sbinfo.Append("5) Los formatos de las columnas se definen en el evento SetCellFactory las columnas que lo necesiten .").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159326;
 //BA.debugLineNum = 207159326;BA.debugLine="sbInfo.Append(\" Los formatos de las columnas se c";
_sbinfo.Append(" Los formatos de las columnas se crean mediante código INLINE java. Existen unos formatos predefinidos en la propia clase. Se llaman mediante constantes _CellFactory,").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159327;
 //BA.debugLineNum = 207159327;BA.debugLine="sbInfo.Append(\" indicando en el método Create que";
_sbinfo.Append(" indicando en el método Create que NO están en el módulo CallBack. Para formatos que no estén predefinidos, hay que escribir el código INLINE JAVA en el módulo CallBack.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159328;
 //BA.debugLineNum = 207159328;BA.debugLine="sbInfo.Append(\"6) Hay que tener en cuenta , para";
_sbinfo.Append("6) Hay que tener en cuenta , para todos los métodos que busquen datos a partir del jamTableView, que la tabla SQLinterna (tblOrigenDatos),se construye con los ALIAS de los campos.").Append(anywheresoftware.b4a.keywords.Common.CRLF);
RDebugUtils.currentLine=207159330;
 //BA.debugLineNum = 207159330;BA.debugLine="sbInfo.Append(\"\")";
_sbinfo.Append("");
RDebugUtils.currentLine=207159332;
 //BA.debugLineNum = 207159332;BA.debugLine="DlgInfo.Text=sbInfo.ToString";
_dlginfo._text /*Object*/  = (Object)(_sbinfo.ToString());
RDebugUtils.currentLine=207159333;
 //BA.debugLineNum = 207159333;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(DlgInf";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_dlginfo),(Object)("Ok"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=207159335;
 //BA.debugLineNum = 207159335;BA.debugLine="Dialog.Base.SetLayoutAnimated(0,0.1*Dialog.mParen";
parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0.1*parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*0.8,0.1*parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.8,parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*0.8,parent._dialog._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.8);
RDebugUtils.currentLine=207159337;
 //BA.debugLineNum = 207159337;BA.debugLine="Dialog.TitleBar.SetLayoutAnimated(0,0,0,Dialog.Ba";
parent._dialog._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),parent._dialog._titlebarheight /*int*/ );
RDebugUtils.currentLine=207159338;
 //BA.debugLineNum = 207159338;BA.debugLine="Dim bOk As Button=Dialog.GetButton(xui.DialogResp";
_bok = new anywheresoftware.b4j.objects.ButtonWrapper();
_bok = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Positive).getObject()));
RDebugUtils.currentLine=207159339;
 //BA.debugLineNum = 207159339;BA.debugLine="bOk.Top=Dialog.Base.Height-Dialog.ButtonsHeight-5";
_bok.setTop(parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-parent._dialog._buttonsheight /*int*/ -5);
RDebugUtils.currentLine=207159341;
 //BA.debugLineNum = 207159341;BA.debugLine="Dim pT As Pane=Dialog.TitleBar";
_pt = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pt = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(parent._dialog._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=207159342;
 //BA.debugLineNum = 207159342;BA.debugLine="Dim lblT As Label=pT.GetNode(0)";
_lblt = new anywheresoftware.b4j.objects.LabelWrapper();
_lblt = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_pt.GetNode((int) (0)).getObject()));
RDebugUtils.currentLine=207159343;
 //BA.debugLineNum = 207159343;BA.debugLine="lblT.PrefWidth=lblT.Parent.PrefWidth";
_lblt.setPrefWidth(_lblt.getParent().getPrefWidth());
RDebugUtils.currentLine=207159345;
 //BA.debugLineNum = 207159345;BA.debugLine="DlgInfo.mBase.SetLayoutAnimated(100,5,Dialog.Titl";
_dlginfo._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (100),5,parent._dialog._titlebarheight /*int*/ ,parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-10,parent._dialog._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-parent._dialog._titlebarheight /*int*/ -parent._dialog._buttonsheight /*int*/ );
RDebugUtils.currentLine=207159347;
 //BA.debugLineNum = 207159347;BA.debugLine="Dim p As Pane=DlgInfo.CustomListView1.GetPanel(0)";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_dlginfo._customlistview1 /*b4j.example.customlistview*/ ._getpanel((int) (0)).getObject()));
RDebugUtils.currentLine=207159348;
 //BA.debugLineNum = 207159348;BA.debugLine="Dim lbl As Label=p.GetNode(0)";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_p.GetNode((int) (0)).getObject()));
RDebugUtils.currentLine=207159349;
 //BA.debugLineNum = 207159349;BA.debugLine="lbl.Font=fx.DefaultFont(8)";
_lbl.setFont(parent._fx.DefaultFont(8));
RDebugUtils.currentLine=207159350;
 //BA.debugLineNum = 207159350;BA.debugLine="lbl.TextColor=fx.Colors.From32Bit(0xFFFFFFFF)";
_lbl.setTextColor((javafx.scene.paint.Paint)(parent._fx.Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=207159359;
 //BA.debugLineNum = 207159359;BA.debugLine="wait for (rs) complete (result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "help"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[0];
;
RDebugUtils.currentLine=207159360;
 //BA.debugLineNum = 207159360;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=207159361;
 //BA.debugLineNum = 207159361;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _hextocolor(String _hex) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "hextocolor", true))
	 {return ((Integer) Debug.delegate(ba, "hextocolor", new Object[] {_hex}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int[] _ints = null;
RDebugUtils.currentLine=204406784;
 //BA.debugLineNum = 204406784;BA.debugLine="Private Sub HexToColor(Hex As String) As Int";
RDebugUtils.currentLine=204406785;
 //BA.debugLineNum = 204406785;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=204406786;
 //BA.debugLineNum = 204406786;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=204406787;
 //BA.debugLineNum = 204406787;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=204406788;
 //BA.debugLineNum = 204406788;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=204406789;
 //BA.debugLineNum = 204406789;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=204406791;
 //BA.debugLineNum = 204406791;BA.debugLine="If Hex.Length=6 Then Hex=\"FF\" & Hex";
if (_hex.length()==6) { 
_hex = "FF"+_hex;};
RDebugUtils.currentLine=204406792;
 //BA.debugLineNum = 204406792;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=204406793;
 //BA.debugLineNum = 204406793;BA.debugLine="Return ints(0)";
if (true) return _ints[(int) (0)];
RDebugUtils.currentLine=204406794;
 //BA.debugLineNum = 204406794;BA.debugLine="End Sub";
return 0;
}
public static void  _inicio(String _rutaficherojsonjamtableview) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "inicio", true))
	 {Debug.delegate(ba, "inicio", new Object[] {_rutaficherojsonjamtableview}); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(null,_rutaficherojsonjamtableview);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.jamtableviewcamposbuilder parent,String _rutaficherojsonjamtableview) {
this.parent = parent;
this._rutaficherojsonjamtableview = _rutaficherojsonjamtableview;
}
b4j.docU.jamtableviewcamposbuilder parent;
String _rutaficherojsonjamtableview;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=203554817;
 //BA.debugLineNum = 203554817;BA.debugLine="If RutaFicheroJSONjamTableView=\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_rutaficherojsonjamtableview).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=203554820;
 //BA.debugLineNum = 203554820;BA.debugLine="mnuNew_Action";
_mnunew_action();
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=203554822;
 //BA.debugLineNum = 203554822;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.WAIT);
RDebugUtils.currentLine=203554823;
 //BA.debugLineNum = 203554823;BA.debugLine="DeshabilitarNodos";
_deshabilitarnodos();
RDebugUtils.currentLine=203554824;
 //BA.debugLineNum = 203554824;BA.debugLine="wait for (LoadFile(RutaFicheroJSONjamTableView))";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "inicio"), _loadfile(_rutaficherojsonjamtableview));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_rbool = (boolean) result[0];
;
RDebugUtils.currentLine=203554825;
 //BA.debugLineNum = 203554825;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=203554826;
 //BA.debugLineNum = 203554826;BA.debugLine="HabilitarNodos";
_habilitarnodos();
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=203554828;
 //BA.debugLineNum = 203554828;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _mnunew_action() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mnunew_action", true))
	 {Debug.delegate(ba, "mnunew_action", null); return;}
ResumableSub_mnuNew_Action rsub = new ResumableSub_mnuNew_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuNew_Action extends BA.ResumableSub {
public ResumableSub_mnuNew_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _cancel = false;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=205324289;
 //BA.debugLineNum = 205324289;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnunew_action"), _checkchanges());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (boolean) result[0];
;
RDebugUtils.currentLine=205324290;
 //BA.debugLineNum = 205324290;BA.debugLine="If Cancel Then Return";
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
RDebugUtils.currentLine=205324291;
 //BA.debugLineNum = 205324291;BA.debugLine="CreateTipoOrigenDatos(\"\",\"\",\"\",\"\",Null)";
_createtipoorigendatos("","","","",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=205324294;
 //BA.debugLineNum = 205324294;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=205324295;
 //BA.debugLineNum = 205324295;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
parent._txtrgbcolorfondoencabezados.setText("#004B55");
RDebugUtils.currentLine=205324296;
 //BA.debugLineNum = 205324296;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(b";
parent._lblcolorfondoencabezados.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+parent._txtrgbcolorfondoencabezados.getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=205324298;
 //BA.debugLineNum = 205324298;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
parent._txtrgbcolortextoencabezados.setText(_getcsscolorstringfromintcolor(parent._xui.Color_White));
RDebugUtils.currentLine=205324299;
 //BA.debugLineNum = 205324299;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(b";
parent._lblcolortextoencabezados.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+parent._txtrgbcolortextoencabezados.getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=205324301;
 //BA.debugLineNum = 205324301;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
parent._txtrgbcolorfondopanelinfo.setText("#FFF8C3");
RDebugUtils.currentLine=205324302;
 //BA.debugLineNum = 205324302;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc.";
parent._lblcolorfondopanelinfo.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+parent._txtrgbcolorfondopanelinfo.getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=205324304;
 //BA.debugLineNum = 205324304;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
parent._txtrgbcolortextopanelinfo.setText(_getcsscolorstringfromintcolor(parent._xui.Color_Black));
RDebugUtils.currentLine=205324305;
 //BA.debugLineNum = 205324305;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc.";
parent._lblcolortextopanelinfo.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+parent._txtrgbcolortextopanelinfo.getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=205324307;
 //BA.debugLineNum = 205324307;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
parent._txtrgbcolorfondofilasimpares.setText(_getcsscolorstringfromintcolor(parent._xui.Color_White));
RDebugUtils.currentLine=205324308;
 //BA.debugLineNum = 205324308;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes(";
parent._lblcolorfondofilasimpares.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+parent._txtrgbcolorfondofilasimpares.getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=205324310;
 //BA.debugLineNum = 205324310;BA.debugLine="txtRGBColorFondoFilasPares.Text=\"#F1F1F1\"";
parent._txtrgbcolorfondofilaspares.setText("#F1F1F1");
RDebugUtils.currentLine=205324311;
 //BA.debugLineNum = 205324311;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(bc";
parent._lblcolorfondofilaspares.setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+parent._txtrgbcolorfondofilaspares.getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=205324313;
 //BA.debugLineNum = 205324313;BA.debugLine="NewFile";
_newfile();
RDebugUtils.currentLine=205324314;
 //BA.debugLineNum = 205324314;BA.debugLine="wait for NewFile_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("newfile_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnunew_action"), null);
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=205324316;
 //BA.debugLineNum = 205324316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadfile(String _f) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "loadfile", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "loadfile", new Object[] {_f}));}
ResumableSub_LoadFile rsub = new ResumableSub_LoadFile(null,_f);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadFile extends BA.ResumableSub {
public ResumableSub_LoadFile(b4j.docU.jamtableviewcamposbuilder parent,String _f) {
this.parent = parent;
this._f = _f;
}
b4j.docU.jamtableviewcamposbuilder parent;
String _f;
boolean _cancel = false;
String _s = "";
String _datetimeformatant = "";
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=205127681;
 //BA.debugLineNum = 205127681;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "loadfile"), _checkchanges());
this.state = 23;
return;
case 23:
//C
this.state = 1;
_cancel = (boolean) result[0];
;
RDebugUtils.currentLine=205127682;
 //BA.debugLineNum = 205127682;BA.debugLine="If Cancel Then Return False";
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
RDebugUtils.currentLine=205127683;
 //BA.debugLineNum = 205127683;BA.debugLine="CargandoDatos=True";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=205127684;
 //BA.debugLineNum = 205127684;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 22;
this.catchState = 21;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 21;
RDebugUtils.currentLine=205127685;
 //BA.debugLineNum = 205127685;BA.debugLine="Dim s As String = File.ReadString(f, \"\")";
_s = anywheresoftware.b4a.keywords.Common.File.ReadString(_f,"");
RDebugUtils.currentLine=205127686;
 //BA.debugLineNum = 205127686;BA.debugLine="CurrentFileString = s";
parent._currentfilestring = _s;
RDebugUtils.currentLine=205127687;
 //BA.debugLineNum = 205127687;BA.debugLine="clvListaCampos.Clear";
parent._clvlistacampos._clear();
RDebugUtils.currentLine=205127688;
 //BA.debugLineNum = 205127688;BA.debugLine="lstPrimaryKey.Initialize";
parent._lstprimarykey.Initialize();
RDebugUtils.currentLine=205127689;
 //BA.debugLineNum = 205127689;BA.debugLine="SetCurrentFile(f)";
_setcurrentfile(_f);
RDebugUtils.currentLine=205127691;
 //BA.debugLineNum = 205127691;BA.debugLine="AddItemsFromString(s)";
_additemsfromstring(_s);
RDebugUtils.currentLine=205127692;
 //BA.debugLineNum = 205127692;BA.debugLine="Wait For AddItemsFromString_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("additemsfromstring_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "loadfile"), null);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
RDebugUtils.currentLine=205127694;
 //BA.debugLineNum = 205127694;BA.debugLine="dragger.AddDragButtons";
parent._dragger._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=205127696;
 //BA.debugLineNum = 205127696;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
if (true) break;

case 10:
//if
this.state = 13;
if ((parent._datosorigendatos.TipoOrigenDatos /*String*/ ).equals("JRDC Query")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=205127697;
 //BA.debugLineNum = 205127697;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJR";
_cargacamposjrdcquery(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtcomandojrdc.getText(),parent._txtparametrosjrdc.getText());
RDebugUtils.currentLine=205127698;
 //BA.debugLineNum = 205127698;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdcquery_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "loadfile"), null);
this.state = 25;
return;
case 25:
//C
this.state = 13;
;
 if (true) break;
;
RDebugUtils.currentLine=205127700;
 //BA.debugLineNum = 205127700;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";

case 13:
//if
this.state = 16;
if ((parent._datosorigendatos.TipoOrigenDatos /*String*/ ).equals("JRDC Table")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=205127701;
 //BA.debugLineNum = 205127701;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJR";
_cargacamposjrdctable(parent._txtipjrdc.getText(),(int)(Double.parseDouble(parent._txtpuertojrdc.getText())),parent._txtcomandojrdc.getText(),parent._txtparametrosjrdc.getText());
RDebugUtils.currentLine=205127702;
 //BA.debugLineNum = 205127702;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
anywheresoftware.b4a.keywords.Common.WaitFor("cargacamposjrdctable_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "loadfile"), null);
this.state = 26;
return;
case 26:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=205127704;
 //BA.debugLineNum = 205127704;BA.debugLine="If FechaUltimaModificacion>-1 Then";

case 16:
//if
this.state = 19;
if (parent._fechaultimamodificacion>-1) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=205127705;
 //BA.debugLineNum = 205127705;BA.debugLine="Dim DateTimeFormatAnt As String=DateTime.DateFo";
_datetimeformatant = anywheresoftware.b4a.keywords.Common.DateTime.getDateFormat();
RDebugUtils.currentLine=205127706;
 //BA.debugLineNum = 205127706;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=205127707;
 //BA.debugLineNum = 205127707;BA.debugLine="frm.Title=frm.Title & \"   Fecha última modifica";
parent._frm.setTitle(parent._frm.getTitle()+"   Fecha última modificación: "+anywheresoftware.b4a.keywords.Common.DateTime.Date(parent._fechaultimamodificacion));
RDebugUtils.currentLine=205127708;
 //BA.debugLineNum = 205127708;BA.debugLine="DateTime.DateFormat=DateTimeFormatAnt";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat(_datetimeformatant);
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=205127711;
 //BA.debugLineNum = 205127711;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=205127712;
 //BA.debugLineNum = 205127712;BA.debugLine="wait for (Dialog.Show(LastException.Message, \"Ok";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "loadfile"), parent._dialog._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage()),(Object)("Ok"),(Object)(""),(Object)("")));
this.state = 27;
return;
case 27:
//C
this.state = 22;
_rint = (int) result[0];
;
RDebugUtils.currentLine=205127713;
 //BA.debugLineNum = 205127713;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=205127716;
 //BA.debugLineNum = 205127716;BA.debugLine="RecalcularIDOrdenColumnas";
_recalcularidordencolumnas();
RDebugUtils.currentLine=205127717;
 //BA.debugLineNum = 205127717;BA.debugLine="CargandoDatos=False";
parent._cargandodatos = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=205127718;
 //BA.debugLineNum = 205127718;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
RDebugUtils.currentLine=205127719;
 //BA.debugLineNum = 205127719;BA.debugLine="End Sub";
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
public static void  _lblcolorborde_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorborde_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorborde_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorBorde_MouseClicked rsub = new ResumableSub_lblColorBorde_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorBorde_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorBorde_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208470027;
 //BA.debugLineNum = 208470027;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=208470029;
 //BA.debugLineNum = 208470029;BA.debugLine="Dim lbl As Label=Sender";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=208470030;
 //BA.debugLineNum = 208470030;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
RDebugUtils.currentLine=208470031;
 //BA.debugLineNum = 208470031;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=208470033;
 //BA.debugLineNum = 208470033;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"desde versio";
_msa = parent._xui.MsgboxAsync(ba,"desde version 6.44, el color del borde es sólo para el formato de celda SELECCIONADA.","Aviso");
RDebugUtils.currentLine=208470034;
 //BA.debugLineNum = 208470034;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorborde_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208470057;
 //BA.debugLineNum = 208470057;BA.debugLine="Dialog.Title=\"Selecciona color Borde Celda SELECC";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Borde Celda SELECCIONADA");
RDebugUtils.currentLine=208470058;
 //BA.debugLineNum = 208470058;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208470059;
 //BA.debugLineNum = 208470059;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208470060;
 //BA.debugLineNum = 208470060;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208470061;
 //BA.debugLineNum = 208470061;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorborde_mouseclicked"),(int) (0));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=208470063;
 //BA.debugLineNum = 208470063;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208470064;
 //BA.debugLineNum = 208470064;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208470065;
 //BA.debugLineNum = 208470065;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=208470066;
 //BA.debugLineNum = 208470066;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208470067;
 //BA.debugLineNum = 208470067;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208470068;
 //BA.debugLineNum = 208470068;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208470069;
 //BA.debugLineNum = 208470069;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208470070;
 //BA.debugLineNum = 208470070;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorborde_mouseclicked"), _rsub);
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208470071;
 //BA.debugLineNum = 208470071;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208470072;
 //BA.debugLineNum = 208470072;BA.debugLine="clvIV.lblColorBorde.Color=BCColorPickerjamTableVi";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208470073;
 //BA.debugLineNum = 208470073;BA.debugLine="clvIV.txtRGBColorBorde.Text=GetCssColorStringFrom";
_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=208470075;
 //BA.debugLineNum = 208470075;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=208470076;
 //BA.debugLineNum = 208470076;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondo_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondo_MouseClicked rsub = new ResumableSub_lblColorFondo_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208535558;
 //BA.debugLineNum = 208535558;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=208535560;
 //BA.debugLineNum = 208535560;BA.debugLine="Dim lbl As Label=Sender";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=208535561;
 //BA.debugLineNum = 208535561;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
RDebugUtils.currentLine=208535562;
 //BA.debugLineNum = 208535562;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=208535584;
 //BA.debugLineNum = 208535584;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Celdas Colum";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Celdas Columna");
RDebugUtils.currentLine=208535585;
 //BA.debugLineNum = 208535585;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208535586;
 //BA.debugLineNum = 208535586;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208535587;
 //BA.debugLineNum = 208535587;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208535588;
 //BA.debugLineNum = 208535588;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondo_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=208535590;
 //BA.debugLineNum = 208535590;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208535591;
 //BA.debugLineNum = 208535591;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208535592;
 //BA.debugLineNum = 208535592;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=208535593;
 //BA.debugLineNum = 208535593;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208535594;
 //BA.debugLineNum = 208535594;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208535595;
 //BA.debugLineNum = 208535595;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208535596;
 //BA.debugLineNum = 208535596;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208535597;
 //BA.debugLineNum = 208535597;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208535598;
 //BA.debugLineNum = 208535598;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208535599;
 //BA.debugLineNum = 208535599;BA.debugLine="clvIV.lblColorFondo.Color=BCColorPickerjamTableVi";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208535600;
 //BA.debugLineNum = 208535600;BA.debugLine="clvIV.txtRGBColorfondo.Text=GetCssColorStringFrom";
_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=208535601;
 //BA.debugLineNum = 208535601;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=208535602;
 //BA.debugLineNum = 208535602;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondoencabezadocolumna_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondoencabezadocolumna_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondoencabezadocolumna_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209387521;
 //BA.debugLineNum = 209387521;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209387522;
 //BA.debugLineNum = 209387522;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209387523;
 //BA.debugLineNum = 209387523;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209387524;
 //BA.debugLineNum = 209387524;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209387526;
 //BA.debugLineNum = 209387526;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Encabezado C";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Encabezado Columna");
RDebugUtils.currentLine=209387527;
 //BA.debugLineNum = 209387527;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=209387528;
 //BA.debugLineNum = 209387528;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=209387529;
 //BA.debugLineNum = 209387529;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=209387530;
 //BA.debugLineNum = 209387530;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezadocolumna_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=209387532;
 //BA.debugLineNum = 209387532;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=209387533;
 //BA.debugLineNum = 209387533;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=209387534;
 //BA.debugLineNum = 209387534;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=209387535;
 //BA.debugLineNum = 209387535;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=209387536;
 //BA.debugLineNum = 209387536;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=209387537;
 //BA.debugLineNum = 209387537;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=209387538;
 //BA.debugLineNum = 209387538;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=209387539;
 //BA.debugLineNum = 209387539;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezadocolumna_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209387540;
 //BA.debugLineNum = 209387540;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=209387541;
 //BA.debugLineNum = 209387541;BA.debugLine="clvIV.lblColorFondoEncabezadocolumna.Color=BCColo";
_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=209387542;
 //BA.debugLineNum = 209387542;BA.debugLine="clvIV.txtRGBColorFondoEncabezadocolumna.Text=GetC";
_clviv.txtRGBColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=209387543;
 //BA.debugLineNum = 209387543;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=209387544;
 //BA.debugLineNum = 209387544;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondoencabezados_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblColorFondoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;
Object _msa = null;
int _rint = 0;
int _idx = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208142337;
 //BA.debugLineNum = 208142337;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Encabezados\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Encabezados");
RDebugUtils.currentLine=208142338;
 //BA.debugLineNum = 208142338;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208142339;
 //BA.debugLineNum = 208142339;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208142340;
 //BA.debugLineNum = 208142340;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208142341;
 //BA.debugLineNum = 208142341;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezados_mouseclicked"),(int) (0));
this.state = 21;
return;
case 21:
//C
this.state = 1;
;
RDebugUtils.currentLine=208142343;
 //BA.debugLineNum = 208142343;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208142344;
 //BA.debugLineNum = 208142344;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208142345;
 //BA.debugLineNum = 208142345;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolorfondoencabezados.getColor());
RDebugUtils.currentLine=208142346;
 //BA.debugLineNum = 208142346;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208142347;
 //BA.debugLineNum = 208142347;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208142348;
 //BA.debugLineNum = 208142348;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208142349;
 //BA.debugLineNum = 208142349;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208142350;
 //BA.debugLineNum = 208142350;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezados_mouseclicked"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208142351;
 //BA.debugLineNum = 208142351;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208142352;
 //BA.debugLineNum = 208142352;BA.debugLine="lblColorFondoEncabezados.Color=BCColorPickerjamTa";
parent._lblcolorfondoencabezados.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208142353;
 //BA.debugLineNum = 208142353;BA.debugLine="txtRGBColorFondoEncabezados.Text=GetCssColorStrin";
parent._txtrgbcolorfondoencabezados.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondoencabezados.getColor()));
RDebugUtils.currentLine=208142354;
 //BA.debugLineNum = 208142354;BA.debugLine="If clvListaCampos.Size>0 Then";
if (true) break;

case 7:
//if
this.state = 20;
if (parent._clvlistacampos._getsize()>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=208142355;
 //BA.debugLineNum = 208142355;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualiza";
_msa = parent._xui.Msgbox2Async(ba,"¿Actualizar el color fondo encabezados para todos los campos?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208142356;
 //BA.debugLineNum = 208142356;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondoencabezados_mouseclicked"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 10;
_rint = (int) result[0];
;
RDebugUtils.currentLine=208142357;
 //BA.debugLineNum = 208142357;BA.debugLine="If rInt <> xui.DialogResponse_Positive Then Retu";
if (true) break;

case 10:
//if
this.state = 15;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=208142358;
 //BA.debugLineNum = 208142358;BA.debugLine="For iDx=0 To clvListaCampos.Size-1";
if (true) break;

case 16:
//for
this.state = 19;
step21 = 1;
limit21 = (int) (parent._clvlistacampos._getsize()-1);
_idx = (int) (0) ;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 19;
if ((step21 > 0 && _idx <= limit21) || (step21 < 0 && _idx >= limit21)) this.state = 18;
if (true) break;

case 25:
//C
this.state = 24;
_idx = ((int)(0 + _idx + step21)) ;
if (true) break;

case 18:
//C
this.state = 25;
RDebugUtils.currentLine=208142359;
 //BA.debugLineNum = 208142359;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvLista";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_idx));
RDebugUtils.currentLine=208142360;
 //BA.debugLineNum = 208142360;BA.debugLine="clvIV.lblColorFondoEncabezadocolumna.Color=BCCo";
_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208142361;
 //BA.debugLineNum = 208142361;BA.debugLine="clvIV.txtRGBColorFondoEncabezadocolumna.Text=Ge";
_clviv.txtRGBColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(parent._lblcolorfondoencabezados.getColor()));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=208142364;
 //BA.debugLineNum = 208142364;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondofilasimpares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondofilasimpares_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondofilasimpares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasImpares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208338945;
 //BA.debugLineNum = 208338945;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Filas Impares");
RDebugUtils.currentLine=208338946;
 //BA.debugLineNum = 208338946;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208338947;
 //BA.debugLineNum = 208338947;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208338948;
 //BA.debugLineNum = 208338948;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208338949;
 //BA.debugLineNum = 208338949;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=208338951;
 //BA.debugLineNum = 208338951;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208338952;
 //BA.debugLineNum = 208338952;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208338953;
 //BA.debugLineNum = 208338953;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolorfondofilasimpares.getColor());
RDebugUtils.currentLine=208338954;
 //BA.debugLineNum = 208338954;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208338955;
 //BA.debugLineNum = 208338955;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208338956;
 //BA.debugLineNum = 208338956;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208338957;
 //BA.debugLineNum = 208338957;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208338958;
 //BA.debugLineNum = 208338958;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208338959;
 //BA.debugLineNum = 208338959;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208338960;
 //BA.debugLineNum = 208338960;BA.debugLine="lblColorFondoFilasImpares.Color=BCColorPickerjamT";
parent._lblcolorfondofilasimpares.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208338961;
 //BA.debugLineNum = 208338961;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
parent._txtrgbcolorfondofilasimpares.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondofilasimpares.getColor()));
RDebugUtils.currentLine=208338962;
 //BA.debugLineNum = 208338962;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondofilaspares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondofilaspares_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondofilaspares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasPares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasPares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208404481;
 //BA.debugLineNum = 208404481;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Filas Impares");
RDebugUtils.currentLine=208404482;
 //BA.debugLineNum = 208404482;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208404483;
 //BA.debugLineNum = 208404483;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208404484;
 //BA.debugLineNum = 208404484;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208404485;
 //BA.debugLineNum = 208404485;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilaspares_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=208404487;
 //BA.debugLineNum = 208404487;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208404488;
 //BA.debugLineNum = 208404488;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208404489;
 //BA.debugLineNum = 208404489;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolorfondofilaspares.getColor());
RDebugUtils.currentLine=208404490;
 //BA.debugLineNum = 208404490;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208404491;
 //BA.debugLineNum = 208404491;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208404492;
 //BA.debugLineNum = 208404492;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208404493;
 //BA.debugLineNum = 208404493;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208404494;
 //BA.debugLineNum = 208404494;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondofilaspares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208404495;
 //BA.debugLineNum = 208404495;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208404496;
 //BA.debugLineNum = 208404496;BA.debugLine="lblColorFondoFilasPares.Color=BCColorPickerjamTab";
parent._lblcolorfondofilaspares.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208404497;
 //BA.debugLineNum = 208404497;BA.debugLine="txtRGBColorFondoFilasPares.Text=GetCssColorString";
parent._txtrgbcolorfondofilaspares.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondofilaspares.getColor()));
RDebugUtils.currentLine=208404498;
 //BA.debugLineNum = 208404498;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolorfondopanelinfo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorFondoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208273409;
 //BA.debugLineNum = 208273409;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Panel Info\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Fondo Panel Info");
RDebugUtils.currentLine=208273410;
 //BA.debugLineNum = 208273410;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208273411;
 //BA.debugLineNum = 208273411;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208273412;
 //BA.debugLineNum = 208273412;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208273413;
 //BA.debugLineNum = 208273413;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=208273415;
 //BA.debugLineNum = 208273415;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208273416;
 //BA.debugLineNum = 208273416;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208273417;
 //BA.debugLineNum = 208273417;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolorfondopanelinfo.getColor());
RDebugUtils.currentLine=208273418;
 //BA.debugLineNum = 208273418;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208273419;
 //BA.debugLineNum = 208273419;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208273420;
 //BA.debugLineNum = 208273420;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208273421;
 //BA.debugLineNum = 208273421;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208273422;
 //BA.debugLineNum = 208273422;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208273423;
 //BA.debugLineNum = 208273423;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208273424;
 //BA.debugLineNum = 208273424;BA.debugLine="lblColorFondoPanelInfo.Color=BCColorPickerjamTabl";
parent._lblcolorfondopanelinfo.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208273425;
 //BA.debugLineNum = 208273425;BA.debugLine="txtRGBColorFondoPanelInfo.Text=GetCssColorStringF";
parent._txtrgbcolorfondopanelinfo.setText(_getcsscolorstringfromintcolor(parent._lblcolorfondopanelinfo.getColor()));
RDebugUtils.currentLine=208273426;
 //BA.debugLineNum = 208273426;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolortexto_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolortexto_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolortexto_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorTexto_MouseClicked rsub = new ResumableSub_lblColorTexto_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorTexto_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTexto_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208601090;
 //BA.debugLineNum = 208601090;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=208601091;
 //BA.debugLineNum = 208601091;BA.debugLine="Dim lbl As Label=Sender";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=208601092;
 //BA.debugLineNum = 208601092;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
RDebugUtils.currentLine=208601093;
 //BA.debugLineNum = 208601093;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=208601116;
 //BA.debugLineNum = 208601116;BA.debugLine="Dialog.Title=\"Selecciona color Texto Celdas Colum";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Texto Celdas Columna");
RDebugUtils.currentLine=208601117;
 //BA.debugLineNum = 208601117;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208601118;
 //BA.debugLineNum = 208601118;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208601119;
 //BA.debugLineNum = 208601119;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208601120;
 //BA.debugLineNum = 208601120;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortexto_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=208601122;
 //BA.debugLineNum = 208601122;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208601123;
 //BA.debugLineNum = 208601123;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208601124;
 //BA.debugLineNum = 208601124;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=208601125;
 //BA.debugLineNum = 208601125;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208601126;
 //BA.debugLineNum = 208601126;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208601127;
 //BA.debugLineNum = 208601127;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208601128;
 //BA.debugLineNum = 208601128;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208601129;
 //BA.debugLineNum = 208601129;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortexto_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208601130;
 //BA.debugLineNum = 208601130;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208601131;
 //BA.debugLineNum = 208601131;BA.debugLine="clvIV.lblColorTexto.Color=BCColorPickerjamTableVi";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208601132;
 //BA.debugLineNum = 208601132;BA.debugLine="clvIV.txtRGBColorTexto.Text=GetCssColorStringFrom";
_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=208601133;
 //BA.debugLineNum = 208601133;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=208601134;
 //BA.debugLineNum = 208601134;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolortextoencabezadocolumna_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolortextoencabezadocolumna_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolortextoencabezadocolumna_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209256449;
 //BA.debugLineNum = 209256449;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209256450;
 //BA.debugLineNum = 209256450;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209256451;
 //BA.debugLineNum = 209256451;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209256452;
 //BA.debugLineNum = 209256452;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209256454;
 //BA.debugLineNum = 209256454;BA.debugLine="Dialog.Title=\"Selecciona color Texto Encabezado C";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Texto Encabezado Columna");
RDebugUtils.currentLine=209256455;
 //BA.debugLineNum = 209256455;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=209256456;
 //BA.debugLineNum = 209256456;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=209256457;
 //BA.debugLineNum = 209256457;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=209256458;
 //BA.debugLineNum = 209256458;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezadocolumna_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=209256460;
 //BA.debugLineNum = 209256460;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=209256461;
 //BA.debugLineNum = 209256461;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=209256462;
 //BA.debugLineNum = 209256462;BA.debugLine="BCColorPickerjamTableView.SelectedColor=clvIV.lbl";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=209256463;
 //BA.debugLineNum = 209256463;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=209256464;
 //BA.debugLineNum = 209256464;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=209256465;
 //BA.debugLineNum = 209256465;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=209256466;
 //BA.debugLineNum = 209256466;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=209256467;
 //BA.debugLineNum = 209256467;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezadocolumna_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209256468;
 //BA.debugLineNum = 209256468;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=209256469;
 //BA.debugLineNum = 209256469;BA.debugLine="clvIV.lblColorTextoEncabezadocolumna.Color=BCColo";
_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=209256470;
 //BA.debugLineNum = 209256470;BA.debugLine="clvIV.txtRGBColorTextoEncabezadocolumna.Text=GetC";
_clviv.txtRGBColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=209256471;
 //BA.debugLineNum = 209256471;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=209256472;
 //BA.debugLineNum = 209256472;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolortextoencabezados_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolortextoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolortextoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblColorTextoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;
Object _msa = null;
int _rint = 0;
int _idx = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208076801;
 //BA.debugLineNum = 208076801;BA.debugLine="Dialog.Title=\"Selecciona color Texto Encabezados\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Texto Encabezados");
RDebugUtils.currentLine=208076802;
 //BA.debugLineNum = 208076802;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208076803;
 //BA.debugLineNum = 208076803;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208076804;
 //BA.debugLineNum = 208076804;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208076805;
 //BA.debugLineNum = 208076805;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezados_mouseclicked"),(int) (0));
this.state = 21;
return;
case 21:
//C
this.state = 1;
;
RDebugUtils.currentLine=208076807;
 //BA.debugLineNum = 208076807;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208076808;
 //BA.debugLineNum = 208076808;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208076809;
 //BA.debugLineNum = 208076809;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolortextoencabezados.getColor());
RDebugUtils.currentLine=208076810;
 //BA.debugLineNum = 208076810;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208076811;
 //BA.debugLineNum = 208076811;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208076812;
 //BA.debugLineNum = 208076812;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208076813;
 //BA.debugLineNum = 208076813;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208076814;
 //BA.debugLineNum = 208076814;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezados_mouseclicked"), _rsub);
this.state = 22;
return;
case 22:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208076815;
 //BA.debugLineNum = 208076815;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208076816;
 //BA.debugLineNum = 208076816;BA.debugLine="lblColorTextoEncabezados.Color=BCColorPickerjamTa";
parent._lblcolortextoencabezados.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208076817;
 //BA.debugLineNum = 208076817;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
parent._txtrgbcolortextoencabezados.setText(_getcsscolorstringfromintcolor(parent._lblcolortextoencabezados.getColor()));
RDebugUtils.currentLine=208076818;
 //BA.debugLineNum = 208076818;BA.debugLine="If clvListaCampos.Size>0 Then";
if (true) break;

case 7:
//if
this.state = 20;
if (parent._clvlistacampos._getsize()>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=208076819;
 //BA.debugLineNum = 208076819;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualiza";
_msa = parent._xui.Msgbox2Async(ba,"¿Actualizar el color texto encabezados para todos los campos?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208076820;
 //BA.debugLineNum = 208076820;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortextoencabezados_mouseclicked"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 10;
_rint = (int) result[0];
;
RDebugUtils.currentLine=208076821;
 //BA.debugLineNum = 208076821;BA.debugLine="If rInt <> xui.DialogResponse_Positive Then Retu";
if (true) break;

case 10:
//if
this.state = 15;
if (_rint!=parent._xui.DialogResponse_Positive) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=208076822;
 //BA.debugLineNum = 208076822;BA.debugLine="For iDx=0 To clvListaCampos.Size-1";
if (true) break;

case 16:
//for
this.state = 19;
step21 = 1;
limit21 = (int) (parent._clvlistacampos._getsize()-1);
_idx = (int) (0) ;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 19;
if ((step21 > 0 && _idx <= limit21) || (step21 < 0 && _idx >= limit21)) this.state = 18;
if (true) break;

case 25:
//C
this.state = 24;
_idx = ((int)(0 + _idx + step21)) ;
if (true) break;

case 18:
//C
this.state = 25;
RDebugUtils.currentLine=208076823;
 //BA.debugLineNum = 208076823;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvLista";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_idx));
RDebugUtils.currentLine=208076824;
 //BA.debugLineNum = 208076824;BA.debugLine="clvIV.lblColorTextoEncabezadocolumna.Color=BCCo";
_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208076825;
 //BA.debugLineNum = 208076825;BA.debugLine="clvIV.txtRGBColorTextoEncabezadocolumna.Text=Ge";
_clviv.txtRGBColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_getcsscolorstringfromintcolor(parent._lblcolortextoencabezados.getColor()));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=208076828;
 //BA.debugLineNum = 208076828;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblcolortextopanelinfo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolortextopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolortextopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorTextoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208207873;
 //BA.debugLineNum = 208207873;BA.debugLine="Dialog.Title=\"Selecciona color Texto Panel Info\"";
parent._dialog._title /*Object*/  = (Object)("Selecciona color Texto Panel Info");
RDebugUtils.currentLine=208207874;
 //BA.debugLineNum = 208207874;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
RDebugUtils.currentLine=208207875;
 //BA.debugLineNum = 208207875;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (600)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (300)));
RDebugUtils.currentLine=208207876;
 //BA.debugLineNum = 208207876;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=208207877;
 //BA.debugLineNum = 208207877;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortextopanelinfo_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=208207879;
 //BA.debugLineNum = 208207879;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
parent._dialog._putattop /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=208207880;
 //BA.debugLineNum = 208207880;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=208207881;
 //BA.debugLineNum = 208207881;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
parent._bccolorpickerjamtableview._setselectedcolor /*int*/ (null,parent._lblcolortextopanelinfo.getColor());
RDebugUtils.currentLine=208207882;
 //BA.debugLineNum = 208207882;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,parent._xui.DialogResponse_Cancel);
RDebugUtils.currentLine=208207883;
 //BA.debugLineNum = 208207883;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208207884;
 //BA.debugLineNum = 208207884;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)));
RDebugUtils.currentLine=208207885;
 //BA.debugLineNum = 208207885;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=208207886;
 //BA.debugLineNum = 208207886;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblcolortextopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208207887;
 //BA.debugLineNum = 208207887;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
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
RDebugUtils.currentLine=208207888;
 //BA.debugLineNum = 208207888;BA.debugLine="lblColorTextoPanelInfo.Color=BCColorPickerjamTabl";
parent._lblcolortextopanelinfo.setColor(parent._bccolorpickerjamtableview._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=208207889;
 //BA.debugLineNum = 208207889;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
parent._txtrgbcolortextopanelinfo.setText(_getcsscolorstringfromintcolor(parent._lblcolortextopanelinfo.getColor()));
RDebugUtils.currentLine=208207890;
 //BA.debugLineNum = 208207890;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _lblinfo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblinfo_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblinfo_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=206962688;
 //BA.debugLineNum = 206962688;BA.debugLine="private Sub lblInfo_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=206962690;
 //BA.debugLineNum = 206962690;BA.debugLine="End Sub";
return "";
}
public static void  _lblresetcolorborde_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorborde_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorborde_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorBorde_MouseClicked rsub = new ResumableSub_lblResetColorBorde_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorBorde_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorBorde_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209059841;
 //BA.debugLineNum = 209059841;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209059842;
 //BA.debugLineNum = 209059842;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209059843;
 //BA.debugLineNum = 209059843;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209059844;
 //BA.debugLineNum = 209059844;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209059847;
 //BA.debugLineNum = 209059847;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color del borde de las celda SELECCIONADA a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=209059848;
 //BA.debugLineNum = 209059848;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolorborde_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209059849;
 //BA.debugLineNum = 209059849;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=209059852;
 //BA.debugLineNum = 209059852;BA.debugLine="clvIV.txtRGBColorBorde.Text=\"#00BFFF\"";
_clviv.txtRGBColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("#00BFFF");
RDebugUtils.currentLine=209059854;
 //BA.debugLineNum = 209059854;BA.debugLine="clvIV.lblColorBorde.Color=HexToColor(\"#00BFFF\")";
_clviv.lblColorBorde /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_hextocolor("#00BFFF"));
RDebugUtils.currentLine=209059859;
 //BA.debugLineNum = 209059859;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=209059861;
 //BA.debugLineNum = 209059861;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolorfondo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondo_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondo_MouseClicked rsub = new ResumableSub_lblResetColorFondo_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209125377;
 //BA.debugLineNum = 209125377;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209125378;
 //BA.debugLineNum = 209125378;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209125379;
 //BA.debugLineNum = 209125379;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209125380;
 //BA.debugLineNum = 209125380;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209125382;
 //BA.debugLineNum = 209125382;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de Fondo de las celdas de la columna a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=209125383;
 //BA.debugLineNum = 209125383;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209125384;
 //BA.debugLineNum = 209125384;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=209125386;
 //BA.debugLineNum = 209125386;BA.debugLine="clvIV.txtRGBColorFondo.Text=\"transparent\"";
_clviv.txtRGBColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("transparent");
RDebugUtils.currentLine=209125387;
 //BA.debugLineNum = 209125387;BA.debugLine="clvIV.lblColorFondo.Color=0x00FFFFFF";
_clviv.lblColorFondo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0x00ffffff));
RDebugUtils.currentLine=209125388;
 //BA.debugLineNum = 209125388;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=209125389;
 //BA.debugLineNum = 209125389;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolorfondoencabezadocolumna_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondoencabezadocolumna_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondoencabezadocolumna_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209321985;
 //BA.debugLineNum = 209321985;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209321986;
 //BA.debugLineNum = 209321986;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209321987;
 //BA.debugLineNum = 209321987;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209321988;
 //BA.debugLineNum = 209321988;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209321989;
 //BA.debugLineNum = 209321989;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de Fondo del Encabezado de la columna a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=209321991;
 //BA.debugLineNum = 209321991;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondoencabezadocolumna_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209321992;
 //BA.debugLineNum = 209321992;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=209321994;
 //BA.debugLineNum = 209321994;BA.debugLine="clvIV.txtRGBColorFondoEncabezadoColumna.Text=txtR";
_clviv.txtRGBColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent._txtrgbcolorfondoencabezados.getText());
RDebugUtils.currentLine=209321995;
 //BA.debugLineNum = 209321995;BA.debugLine="clvIV.lblColorFondoEncabezadoColumna.Color=lblCol";
_clviv.lblColorFondoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._lblcolorfondoencabezados.getColor());
RDebugUtils.currentLine=209321996;
 //BA.debugLineNum = 209321996;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=209321997;
 //BA.debugLineNum = 209321997;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolorfondoencabezados_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorFondoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208666625;
 //BA.debugLineNum = 208666625;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de Fondo de los Encabezados a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208666626;
 //BA.debugLineNum = 208666626;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208666627;
 //BA.debugLineNum = 208666627;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=208666628;
 //BA.debugLineNum = 208666628;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
parent._txtrgbcolorfondoencabezados.setText("#004B55");
RDebugUtils.currentLine=208666629;
 //BA.debugLineNum = 208666629;BA.debugLine="lblColorFondoEncabezados.Color=HexToColor(\"#004B5";
parent._lblcolorfondoencabezados.setColor(_hextocolor("#004B55"));
RDebugUtils.currentLine=208666630;
 //BA.debugLineNum = 208666630;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolorfondofilaspares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondofilaspares_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondofilaspares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblResetColorFondoFilasPares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoFilasPares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208994305;
 //BA.debugLineNum = 208994305;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de Fondo de las Filas Pares a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208994306;
 //BA.debugLineNum = 208994306;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondofilaspares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208994307;
 //BA.debugLineNum = 208994307;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=208994308;
 //BA.debugLineNum = 208994308;BA.debugLine="txtRGBColorFondoFilasPares.Text=\"black\"";
parent._txtrgbcolorfondofilaspares.setText("black");
RDebugUtils.currentLine=208994309;
 //BA.debugLineNum = 208994309;BA.debugLine="lblColorFondoFilasPares.Color=HexToColor(\"#F1F1F1";
parent._lblcolorfondofilaspares.setColor(_hextocolor("#F1F1F1"));
RDebugUtils.currentLine=208994310;
 //BA.debugLineNum = 208994310;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolorfondopanelinfo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208797697;
 //BA.debugLineNum = 208797697;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de Fondo del Panel Info a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208797698;
 //BA.debugLineNum = 208797698;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolorfondopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208797699;
 //BA.debugLineNum = 208797699;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=208797700;
 //BA.debugLineNum = 208797700;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
parent._txtrgbcolorfondopanelinfo.setText("#FFF8C3");
RDebugUtils.currentLine=208797701;
 //BA.debugLineNum = 208797701;BA.debugLine="lblColorFondoPanelInfo.Color=HexToColor(\"#FFF8C3\"";
parent._lblcolorfondopanelinfo.setColor(_hextocolor("#FFF8C3"));
RDebugUtils.currentLine=208797702;
 //BA.debugLineNum = 208797702;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolortexto_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolortexto_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolortexto_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorTexto_MouseClicked rsub = new ResumableSub_lblResetColorTexto_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorTexto_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTexto_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209453057;
 //BA.debugLineNum = 209453057;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209453058;
 //BA.debugLineNum = 209453058;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209453059;
 //BA.debugLineNum = 209453059;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209453060;
 //BA.debugLineNum = 209453060;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209453062;
 //BA.debugLineNum = 209453062;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de texto de las celdas de la columna a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=209453063;
 //BA.debugLineNum = 209453063;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolortexto_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209453064;
 //BA.debugLineNum = 209453064;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=209453066;
 //BA.debugLineNum = 209453066;BA.debugLine="clvIV.txtRGBColorTexto.Text=\"black\"";
_clviv.txtRGBColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("black");
RDebugUtils.currentLine=209453067;
 //BA.debugLineNum = 209453067;BA.debugLine="clvIV.lblColorTexto.Color=0xFF000000";
_clviv.lblColorTexto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff000000));
RDebugUtils.currentLine=209453068;
 //BA.debugLineNum = 209453068;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=209453069;
 //BA.debugLineNum = 209453069;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolortextoencabezadocolumna_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolortextoencabezadocolumna_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolortextoencabezadocolumna_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked rsub = new ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoEncabezadoColumna_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
int _fvidx = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=209190913;
 //BA.debugLineNum = 209190913;BA.debugLine="Dim FVidx As Int=clvListaCampos.FirstVisibleIndex";
_fvidx = parent._clvlistacampos._getfirstvisibleindex();
RDebugUtils.currentLine=209190914;
 //BA.debugLineNum = 209190914;BA.debugLine="Dim lbl As B4XView=Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
RDebugUtils.currentLine=209190915;
 //BA.debugLineNum = 209190915;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(l";
_index = parent._clvlistacampos._getitemfromview(_lbl);
RDebugUtils.currentLine=209190916;
 //BA.debugLineNum = 209190916;BA.debugLine="Dim clvIV As clvCamposBuilderItemValue=clvListaCa";
_clviv = (b4j.docU.jamtableviewcamposbuilder._clvcamposbuilderitemvalue)(parent._clvlistacampos._getvalue(_index));
RDebugUtils.currentLine=209190918;
 //BA.debugLineNum = 209190918;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color del texto del encabezado de la columna a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=209190919;
 //BA.debugLineNum = 209190919;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolortextoencabezadocolumna_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=209190920;
 //BA.debugLineNum = 209190920;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=209190921;
 //BA.debugLineNum = 209190921;BA.debugLine="clvIV.txtRGBColorTextoEncabezadoColumna.Text=txtR";
_clviv.txtRGBColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(parent._txtrgbcolortextoencabezados.getText());
RDebugUtils.currentLine=209190922;
 //BA.debugLineNum = 209190922;BA.debugLine="clvIV.lblColorTextoEncabezadoColumna.Color=lblCol";
_clviv.lblColorTextoEncabezadoColumna /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(parent._lblcolortextoencabezadocolumna.getColor());
RDebugUtils.currentLine=209190923;
 //BA.debugLineNum = 209190923;BA.debugLine="clvListaCampos.ScrollToItem(FVidx)";
parent._clvlistacampos._scrolltoitem(_fvidx);
RDebugUtils.currentLine=209190924;
 //BA.debugLineNum = 209190924;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolortextoencabezados_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolortextoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolortextoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorTextoEncabezados_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoEncabezados_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208732161;
 //BA.debugLineNum = 208732161;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color del Texto de los Encabezados a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208732162;
 //BA.debugLineNum = 208732162;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolortextoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208732163;
 //BA.debugLineNum = 208732163;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=208732164;
 //BA.debugLineNum = 208732164;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
parent._txtrgbcolortextoencabezados.setText(_getcsscolorstringfromintcolor(parent._xui.Color_White));
RDebugUtils.currentLine=208732165;
 //BA.debugLineNum = 208732165;BA.debugLine="lblColorTextoEncabezados.Color=xui.Color_White";
parent._lblcolortextoencabezados.setColor(parent._xui.Color_White);
RDebugUtils.currentLine=208732166;
 //BA.debugLineNum = 208732166;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _lblresetcolortextopanelinfo_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolortextopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolortextopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208863233;
 //BA.debugLineNum = 208863233;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color del Texto del Panel Info a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208863234;
 //BA.debugLineNum = 208863234;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "lblresetcolortextopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208863235;
 //BA.debugLineNum = 208863235;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=208863236;
 //BA.debugLineNum = 208863236;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
parent._txtrgbcolortextopanelinfo.setText(_getcsscolorstringfromintcolor(parent._xui.Color_Black));
RDebugUtils.currentLine=208863237;
 //BA.debugLineNum = 208863237;BA.debugLine="lblColorTextoPanelInfo.Color=xui.Color_Black";
parent._lblcolortextopanelinfo.setColor(parent._xui.Color_Black);
RDebugUtils.currentLine=208863238;
 //BA.debugLineNum = 208863238;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=204013568;
 //BA.debugLineNum = 204013568;BA.debugLine="private Sub MainForm_Resize (Width As Double, Heig";
RDebugUtils.currentLine=204013569;
 //BA.debugLineNum = 204013569;BA.debugLine="dragger.Resize";
_dragger._resize /*String*/ (null);
RDebugUtils.currentLine=204013570;
 //BA.debugLineNum = 204013570;BA.debugLine="End Sub";
return "";
}
public static void  _mnuhelp_action() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mnuhelp_action", true))
	 {Debug.delegate(ba, "mnuhelp_action", null); return;}
ResumableSub_mnuHelp_Action rsub = new ResumableSub_mnuHelp_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuHelp_Action extends BA.ResumableSub {
public ResumableSub_mnuHelp_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=207093761;
 //BA.debugLineNum = 207093761;BA.debugLine="wait for (Help) complete (rBool As Boolean)";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnuhelp_action"), _help());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (boolean) result[0];
;
RDebugUtils.currentLine=207093762;
 //BA.debugLineNum = 207093762;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _mnuload_action() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mnuload_action", true))
	 {Debug.delegate(ba, "mnuload_action", null); return;}
ResumableSub_mnuLoad_Action rsub = new ResumableSub_mnuLoad_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuLoad_Action extends BA.ResumableSub {
public ResumableSub_mnuLoad_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
String _f = "";
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=205062145;
 //BA.debugLineNum = 205062145;BA.debugLine="Dim f As String = FileChooser.ShowOpen(frm)";
_f = parent._filechooser.ShowOpen(parent._frm);
RDebugUtils.currentLine=205062146;
 //BA.debugLineNum = 205062146;BA.debugLine="If f <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_f).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=205062147;
 //BA.debugLineNum = 205062147;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.WAIT);
RDebugUtils.currentLine=205062148;
 //BA.debugLineNum = 205062148;BA.debugLine="DeshabilitarNodos";
_deshabilitarnodos();
RDebugUtils.currentLine=205062149;
 //BA.debugLineNum = 205062149;BA.debugLine="wait for (LoadFile(f)) complete (rBool As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnuload_action"), _loadfile(_f));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_rbool = (boolean) result[0];
;
RDebugUtils.currentLine=205062150;
 //BA.debugLineNum = 205062150;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=205062151;
 //BA.debugLineNum = 205062151;BA.debugLine="HabilitarNodos";
_habilitarnodos();
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=205062153;
 //BA.debugLineNum = 205062153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _newfile() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "newfile", true))
	 {Debug.delegate(ba, "newfile", null); return;}
ResumableSub_NewFile rsub = new ResumableSub_NewFile(null);
rsub.resume(ba, null);
}
public static class ResumableSub_NewFile extends BA.ResumableSub {
public ResumableSub_NewFile(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=205389825;
 //BA.debugLineNum = 205389825;BA.debugLine="wait for (ConfigurarOrigenDatos) complete (rBool";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "newfile"), _configurarorigendatos());
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (boolean) result[0];
;
RDebugUtils.currentLine=205389826;
 //BA.debugLineNum = 205389826;BA.debugLine="CurrentFileString=ExportToString  ' crea un JSON";
parent._currentfilestring = _exporttostring();
RDebugUtils.currentLine=205389827;
 //BA.debugLineNum = 205389827;BA.debugLine="CallSubDelayed(Me,\"NewFile_Completed\")";
anywheresoftware.b4a.keywords.Common.CallSubDelayed(ba,jamtableviewcamposbuilder.getObject(),"NewFile_Completed");
RDebugUtils.currentLine=205389828;
 //BA.debugLineNum = 205389828;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _mnusalir_action() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mnusalir_action", true))
	 {Debug.delegate(ba, "mnusalir_action", null); return;}
ResumableSub_mnuSalir_Action rsub = new ResumableSub_mnuSalir_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSalir_Action extends BA.ResumableSub {
public ResumableSub_mnuSalir_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _cancel = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=203751425;
 //BA.debugLineNum = 203751425;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusalir_action"), _checkchanges());
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (boolean) result[0];
;
RDebugUtils.currentLine=203751426;
 //BA.debugLineNum = 203751426;BA.debugLine="If Cancel Then Return";
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
RDebugUtils.currentLine=203751432;
 //BA.debugLineNum = 203751432;BA.debugLine="frm.Close";
parent._frm.Close();
RDebugUtils.currentLine=203751433;
 //BA.debugLineNum = 203751433;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _mnusaveas_action() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "mnusaveas_action", true))
	 {Debug.delegate(ba, "mnusaveas_action", null); return;}
ResumableSub_mnuSaveAs_Action rsub = new ResumableSub_mnuSaveAs_Action(null);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSaveAs_Action extends BA.ResumableSub {
public ResumableSub_mnuSaveAs_Action(b4j.docU.jamtableviewcamposbuilder parent) {
this.parent = parent;
}
b4j.docU.jamtableviewcamposbuilder parent;
boolean _camposok = false;
Object _msa = null;
int _result = 0;
String _f = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=206241793;
 //BA.debugLineNum = 206241793;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusaveas_action"), _checkforwarnings());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_camposok = (boolean) result[0];
;
RDebugUtils.currentLine=206241794;
 //BA.debugLineNum = 206241794;BA.debugLine="If CamposOK Then";
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
RDebugUtils.currentLine=206241795;
 //BA.debugLineNum = 206241795;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ubicar el f";
_msa = parent._xui.MsgboxAsync(ba,"Ubicar el fichero en el directorio FILES de la aplicación en la que se vaya a usar.","Aviso");
RDebugUtils.currentLine=206241796;
 //BA.debugLineNum = 206241796;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "mnusaveas_action"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=206241797;
 //BA.debugLineNum = 206241797;BA.debugLine="Dim f As String = FileChooser.ShowSave(frm)";
_f = parent._filechooser.ShowSave(parent._frm);
RDebugUtils.currentLine=206241798;
 //BA.debugLineNum = 206241798;BA.debugLine="If f = \"\" Then Return";
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
RDebugUtils.currentLine=206241799;
 //BA.debugLineNum = 206241799;BA.debugLine="SetCurrentFile(f)";
_setcurrentfile(_f);
RDebugUtils.currentLine=206241800;
 //BA.debugLineNum = 206241800;BA.debugLine="mnuSave_Action";
_mnusave_action();
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=206241802;
 //BA.debugLineNum = 206241802;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _recent_click(String _recentfile) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "recent_click", true))
	 {Debug.delegate(ba, "recent_click", new Object[] {_recentfile}); return;}
ResumableSub_Recent_Click rsub = new ResumableSub_Recent_Click(null,_recentfile);
rsub.resume(ba, null);
}
public static class ResumableSub_Recent_Click extends BA.ResumableSub {
public ResumableSub_Recent_Click(b4j.docU.jamtableviewcamposbuilder parent,String _recentfile) {
this.parent = parent;
this._recentfile = _recentfile;
}
b4j.docU.jamtableviewcamposbuilder parent;
String _recentfile;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=203816961;
 //BA.debugLineNum = 203816961;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.WAIT);
RDebugUtils.currentLine=203816962;
 //BA.debugLineNum = 203816962;BA.debugLine="DeshabilitarNodos";
_deshabilitarnodos();
RDebugUtils.currentLine=203816963;
 //BA.debugLineNum = 203816963;BA.debugLine="wait for (LoadFile(RecentFile)) complete (rBool A";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "recent_click"), _loadfile(_recentfile));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (boolean) result[0];
;
RDebugUtils.currentLine=203816964;
 //BA.debugLineNum = 203816964;BA.debugLine="HabilitarNodos";
_habilitarnodos();
RDebugUtils.currentLine=203816965;
 //BA.debugLineNum = 203816965;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
parent._frm.getRootPane().setMouseCursor(parent._fx.Cursors.DEFAULT);
RDebugUtils.currentLine=203816966;
 //BA.debugLineNum = 203816966;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _removecss(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n,String _csselement) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "removecss", true))
	 {return ((String) Debug.delegate(ba, "removecss", new Object[] {_n,_csselement}));}
String[] _elements = null;
String _style = "";
anywheresoftware.b4a.objects.collections.List _l = null;
String _e = "";
anywheresoftware.b4j.object.JavaObject _stringclass = null;
RDebugUtils.currentLine=204996608;
 //BA.debugLineNum = 204996608;BA.debugLine="private Sub RemoveCSS(N As Node, CSSElement As Str";
RDebugUtils.currentLine=204996610;
 //BA.debugLineNum = 204996610;BA.debugLine="Dim Elements() As String = Regex.Split(\";\",N.Styl";
_elements = anywheresoftware.b4a.keywords.Common.Regex.Split(";",_n.getStyle());
RDebugUtils.currentLine=204996611;
 //BA.debugLineNum = 204996611;BA.debugLine="Dim Style As String";
_style = "";
RDebugUtils.currentLine=204996612;
 //BA.debugLineNum = 204996612;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=204996613;
 //BA.debugLineNum = 204996613;BA.debugLine="L.Initialize";
_l.Initialize();
RDebugUtils.currentLine=204996614;
 //BA.debugLineNum = 204996614;BA.debugLine="For Each E As String In Elements";
{
final String[] group5 = _elements;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_e = group5[index5];
RDebugUtils.currentLine=204996615;
 //BA.debugLineNum = 204996615;BA.debugLine="If E.Contains(CSSElement) Then Continue";
if (_e.contains(_csselement)) { 
if (true) continue;};
RDebugUtils.currentLine=204996616;
 //BA.debugLineNum = 204996616;BA.debugLine="L.Add(E)";
_l.Add((Object)(_e));
 }
};
RDebugUtils.currentLine=204996620;
 //BA.debugLineNum = 204996620;BA.debugLine="Dim StringClass As JavaObject = \"\"											'ign";
_stringclass = new anywheresoftware.b4j.object.JavaObject();
_stringclass = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(""));
RDebugUtils.currentLine=204996621;
 //BA.debugLineNum = 204996621;BA.debugLine="Style = StringClass.RunMethod(\"join\",Array(\";\",L)";
_style = BA.ObjectToString(_stringclass.RunMethod("join",new Object[]{(Object)(";"),(Object)(_l.getObject())}));
RDebugUtils.currentLine=204996622;
 //BA.debugLineNum = 204996622;BA.debugLine="Return Style";
if (true) return _style;
RDebugUtils.currentLine=204996623;
 //BA.debugLineNum = 204996623;BA.debugLine="End Sub";
return "";
}
public static void  _resetcolorfondofilasimpares_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "resetcolorfondofilasimpares_mouseclicked", true))
	 {Debug.delegate(ba, "resetcolorfondofilasimpares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_ResetColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_ResetColorFondoFilasImpares_MouseClicked(null,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_ResetColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_ResetColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableviewcamposbuilder parent,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this._eventdata = _eventdata;
}
b4j.docU.jamtableviewcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=208928769;
 //BA.debugLineNum = 208928769;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = parent._xui.Msgbox2Async(ba,"¿Resetear el color de Fondo de las Filas Impares a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=208928770;
 //BA.debugLineNum = 208928770;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableviewcamposbuilder", "resetcolorfondofilasimpares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[0];
;
RDebugUtils.currentLine=208928771;
 //BA.debugLineNum = 208928771;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
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
RDebugUtils.currentLine=208928772;
 //BA.debugLineNum = 208928772;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
parent._txtrgbcolorfondofilasimpares.setText(_getcsscolorstringfromintcolor(parent._xui.Color_White));
RDebugUtils.currentLine=208928773;
 //BA.debugLineNum = 208928773;BA.debugLine="lblColorFondoFilasImpares.Color=xui.Color_White";
parent._lblcolorfondofilasimpares.setColor(parent._xui.Color_White);
RDebugUtils.currentLine=208928774;
 //BA.debugLineNum = 208928774;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _setformmaximized(anywheresoftware.b4j.objects.Form _f) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "setformmaximized", true))
	 {return ((String) Debug.delegate(ba, "setformmaximized", new Object[] {_f}));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=203620352;
 //BA.debugLineNum = 203620352;BA.debugLine="private Sub SetFormMaximized(f As Form)";
RDebugUtils.currentLine=203620354;
 //BA.debugLineNum = 203620354;BA.debugLine="Dim joForm As JavaObject = f";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=203620356;
 //BA.debugLineNum = 203620356;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=203620358;
 //BA.debugLineNum = 203620358;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=203620359;
 //BA.debugLineNum = 203620359;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemedate(b4j.docU.b4xdatetemplate _datetemplate) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemedate", true))
	 {return ((String) Debug.delegate(ba, "setlightthemedate", new Object[] {_datetemplate}));}
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=209911808;
 //BA.debugLineNum = 209911808;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
RDebugUtils.currentLine=209911809;
 //BA.debugLineNum = 209911809;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=209911810;
 //BA.debugLineNum = 209911810;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
_datetemplate._daysinweekcolor /*int*/  = _xui.Color_Black;
RDebugUtils.currentLine=209911811;
 //BA.debugLineNum = 209911811;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0x39),((int)0xd7),((int)0xce));
RDebugUtils.currentLine=209911812;
 //BA.debugLineNum = 209911812;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
_datetemplate._highlightedcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0x00),((int)0xce),((int)0xff));
RDebugUtils.currentLine=209911813;
 //BA.debugLineNum = 209911813;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
_datetemplate._daysinmonthcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=209911814;
 //BA.debugLineNum = 209911814;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
_datetemplate._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=209911815;
 //BA.debugLineNum = 209911815;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
_datetemplate._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=209911816;
 //BA.debugLineNum = 209911816;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0xff),((int)0xa7),((int)0x61));
RDebugUtils.currentLine=209911817;
 //BA.debugLineNum = 209911817;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group9 = new Object[]{(Object)(_datetemplate._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen9 = group9.length
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group9[index9]));
RDebugUtils.currentLine=209911818;
 //BA.debugLineNum = 209911818;BA.debugLine="x.Color = xui.Color_Transparent";
_x.setColor(_xui.Color_Transparent);
 }
};
RDebugUtils.currentLine=209911820;
 //BA.debugLineNum = 209911820;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemeinput(b4j.docU.b4xinputtemplate _input) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemeinput", true))
	 {return ((String) Debug.delegate(ba, "setlightthemeinput", new Object[] {_input}));}
int _textcolor = 0;
RDebugUtils.currentLine=209780736;
 //BA.debugLineNum = 209780736;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
RDebugUtils.currentLine=209780737;
 //BA.debugLineNum = 209780737;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=209780738;
 //BA.debugLineNum = 209780738;BA.debugLine="input.TextField1.TextColor = TextColor";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=209780739;
 //BA.debugLineNum = 209780739;BA.debugLine="input.lblTitle.TextColor = TextColor";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=209780740;
 //BA.debugLineNum = 209780740;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
_input._setbordercolor /*String*/ (null,_textcolor,_xui.Color_Red);
RDebugUtils.currentLine=209780741;
 //BA.debugLineNum = 209780741;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemelist(b4j.docU.b4xlisttemplate _list) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemelist", true))
	 {return ((String) Debug.delegate(ba, "setlightthemelist", new Object[] {_list}));}
int _textcolor = 0;
RDebugUtils.currentLine=209715200;
 //BA.debugLineNum = 209715200;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
RDebugUtils.currentLine=209715201;
 //BA.debugLineNum = 209715201;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=209715202;
 //BA.debugLineNum = 209715202;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(_xui.Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=209715203;
 //BA.debugLineNum = 209715203;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(_xui.Color_White);
RDebugUtils.currentLine=209715204;
 //BA.debugLineNum = 209715204;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = _xui.Color_White;
RDebugUtils.currentLine=209715205;
 //BA.debugLineNum = 209715205;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=209715206;
 //BA.debugLineNum = 209715206;BA.debugLine="End Sub";
return "";
}
public static String  _txtencabezadocolumna_action() throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "txtencabezadocolumna_action", true))
	 {return ((String) Debug.delegate(ba, "txtencabezadocolumna_action", null));}
RDebugUtils.currentLine=209977344;
 //BA.debugLineNum = 209977344;BA.debugLine="Private Sub txtEncabezadoColumna_Action";
RDebugUtils.currentLine=209977346;
 //BA.debugLineNum = 209977346;BA.debugLine="End Sub";
return "";
}
public static String  _txtencabezadocolumna_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "txtencabezadocolumna_focuschanged", true))
	 {return ((String) Debug.delegate(ba, "txtencabezadocolumna_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=210042880;
 //BA.debugLineNum = 210042880;BA.debugLine="Private Sub txtEncabezadoColumna_FocusChanged (Has";
RDebugUtils.currentLine=210042882;
 //BA.debugLineNum = 210042882;BA.debugLine="End Sub";
return "";
}
public static String  _txtencabezadocolumna_textchanged(String _old,String _new) throws Exception{
RDebugUtils.currentModule="jamtableviewcamposbuilder";
if (Debug.shouldDelegate(ba, "txtencabezadocolumna_textchanged", true))
	 {return ((String) Debug.delegate(ba, "txtencabezadocolumna_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=210108416;
 //BA.debugLineNum = 210108416;BA.debugLine="Private Sub txtEncabezadoColumna_TextChanged (Old";
RDebugUtils.currentLine=210108418;
 //BA.debugLineNum = 210108418;BA.debugLine="End Sub";
return "";
}


//import javafx.scene.paint.Paint;


public static String toHexString(Color value) {
    return "#" + (format(value.getRed()) + format(value.getGreen()) + format(value.getBlue()) + format(value.getOpacity()))
            .toUpperCase();
}

public static String format(double val) {
    String in = Integer.toHexString((int) Math.round(val * 255));
    return in.length() == 1 ? "0" + in : in;
}


	public static String ColorStringToHexStringSemiTransparent(String sColor){
		Color colorT = Color.valueOf(sColor);
		Color colorTSemiTransparent=colorT.deriveColor(1,1,1,0.7);
		String hexColorT = toHexString(colorTSemiTransparent);
						 
		return hexColorT;	
	}
	

/*	
	public Color[] generateColors(int n)
{
    Color[] cols = new Color[n];
    for(int i = 0; i < n; i++)
    {
        cols[i] = Color.getHSBColor((float) i / (float) n, 0.85f, 1.0f);
    }
    return cols;
}


public function luminance(r, g, b) {
    var a = [r, g, b].map(function (v) {
        v /= 255;
        return v <= 0.03928
            ? v / 12.92
            : Math.pow( (v + 0.055) / 1.055, 2.4 );
    });
    return a[0] * 0.2126 + a[1] * 0.7152 + a[2] * 0.0722;
}

public function contrast(rgb1, rgb2) {
    var lum1 = luminance(rgb1[0], rgb1[1], rgb1[2]);
    var lum2 = luminance(rgb2[0], rgb2[1], rgb2[2]);
    var brightest = Math.max(lum1, lum2);
    var darkest = Math.min(lum1, lum2);
    return (brightest + 0.05)
         / (darkest + 0.05);
}

*/

public static Double DistanceLuminosityColors(String sColor1, String sColor2){


	String sColorHex1 = ColorStringToHexStringSemiTransparent(sColor1);
	Color color1 = Color.valueOf(sColorHex1);
	System.out.println("Color1 " + sColor1 + " " + color1);
	
	String sColorHex2 = ColorStringToHexStringSemiTransparent(sColor2);
	Color color2 = Color.valueOf(sColorHex2);
	System.out.println("Color2 " + sColor2 + " " + color2);

	Double avghue = (color1.getHue() + color2.getHue())/2;
	Double distance = Math.abs(color1.getHue()-avghue);
 	System.out.println("distance " + distance);
 
 	return distance;
 }

	
}