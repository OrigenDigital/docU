package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jamtableclvcamposbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamtableclvcamposbuilder", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jamtableclvcamposbuilder.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _clvjamtablecvlcamposbuilderitemvalue{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtID;
public anywheresoftware.b4j.objects.ComboBoxWrapper cboCampo;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper txtAliasCampo;
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
public anywheresoftware.b4j.objects.ComboBoxWrapper cboTipoControlFiltro;
public void Initialize() {
IsInitialized = true;
txtID = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
cboCampo = new anywheresoftware.b4j.objects.ComboBoxWrapper();
txtAliasCampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
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
cboTipoControlFiltro = new anywheresoftware.b4j.objects.ComboBoxWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _tipoorigendatosjamtableclv{
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
public anywheresoftware.b4a.keywords.Common __c = null;
public float _version = 0f;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public b4j.example.customlistview _clvlistacampos = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.docU.jamtableclvclvdragger _dragger = null;
public anywheresoftware.b4j.objects.FileChooserWrapper _filechooser = null;
public String _currentfile = "";
public String _currentfilestring = "";
public anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _menubar1 = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cmbtheme = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtid = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cbocampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtaliascampo = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipodato = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxesfecha = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxcampocalculado = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cbotipocontrolfiltro = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxkeyid = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblordenkeyid = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxnonulo = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxconvalordefecto = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvalordefecto = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxesbooleano = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvalortruecampobooleano = null;
public String _tipocontrolfiltro_textfield = "";
public String _tipocontrolfiltro_combobox = "";
public String _tipocontrolfiltro_checkbox = "";
public String _tipocontrolfiltro_textfieldbutton = "";
public boolean _cargandodatos = false;
public anywheresoftware.b4j.objects.ButtonWrapper _btncargarlistacamposquerysql = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btncampostotext = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btntexttocampos = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlecampo = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleencabezado = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitletipodato = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblinfo = null;
public int _colactualclv = 0;
public int _col1 = 0;
public int _col2 = 0;
public b4j.docU.preferencesdialog _prefdialog = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtipjrdc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpuertojrdc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcomandojrdc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtparametrosjrdc = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttipoorigendatos = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlorigensql = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitletipoorigendatos = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleipjrdc = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlepuertojrdc = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlecomandojrdc = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleparametrosjrdc = null;
public b4j.docU.jamtableviewcamposbuilder._tipoorigendatos _datosorigendatos = null;
public long _fechaultimamodificacion = 0L;
public anywheresoftware.b4j.objects.ButtonWrapper _btneditarorigenjrdc = null;
public anywheresoftware.b4a.objects.collections.List _lstprimarykey = null;
public boolean _corrigiendochkboxesfecha = false;
public boolean _corrigiendochkboxkeyid = false;
public boolean _corrigiendochkboxesbooleano = false;
public anywheresoftware.b4j.objects.ButtonWrapper _btnvaloresestilodefecto = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnvaloresestilodefectotodos = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondoencabezados = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolortextoencabezados = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondoencabezados = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolortextoencabezados = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondoencabezados = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolortextoencabezados = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondopanelinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolortextopanelinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondopanelinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondopanelinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolortextopanelinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolortextopanelinfo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondofilasimpares = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondofilaspares = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondofilasimpares = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondofilaspares = null;
public anywheresoftware.b4j.objects.LabelWrapper _resetcolorfondofilasimpares = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblresetcolorfondofilaspares = null;
public b4j.docU.b4xplusminus _b4xplusminusanchobordeitems = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorbordeitems = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtrgbcolorbordeitems = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorbordeitems = null;
public b4j.docU.bccolorpicker _bccolorpickerjamtableview = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolorfondoencabezadocolumna = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolorfondoencabezadocolumna = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolorfondoencabezadocolumna = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblcolortextoencabezadocolumna = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtrgbcolortextoencabezadocolumna = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblresetcolortextoencabezadocolumna = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnbuscaraliascampo = null;
public boolean _mmodosnap = false;
public int _offsetanterior = 0;
public int _primerpanelvisibleanterior = 0;
public boolean _scrollingdown = false;
public b4j.example.cssutils _cssutils = null;
public b4j.example.dateutils _dateutils = null;
public b4j.docU.main _main = null;
public b4j.docU.mainmenu2 _mainmenu2 = null;
public b4j.docU.utilidades _utilidades = null;
public b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public b4j.docU.cmauxtxt _cmauxtxt = null;
public b4j.docU.jrdcquery _jrdcquery = null;
public b4j.docU.dbutils _dbutils = null;
public b4j.docU.transfermode _transfermode = null;
public b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public b4j.docU.b4xcollections _b4xcollections = null;
public b4j.docU.jamlinknavision _jamlinknavision = null;
public b4j.docU.cmpermisos _cmpermisos = null;
public b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public b4j.docU.httputils2service _httputils2service = null;
public b4j.docU.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=176029696;
 //BA.debugLineNum = 176029696;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=176029698;
 //BA.debugLineNum = 176029698;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.docU.jamtableclvcamposbuilder __ref,String _rutaficherojsonjamtableclv) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_rutaficherojsonjamtableclv}));}
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.object.JavaObject _joclvdatosscrollpane = null;
RDebugUtils.currentLine=176095232;
 //BA.debugLineNum = 176095232;BA.debugLine="Sub Show(RutaFicheroJSONjamTableCLV As String)";
RDebugUtils.currentLine=176095234;
 //BA.debugLineNum = 176095234;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(\"\",\"\",\"\",\"";
__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/  = __ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,"","","","",BA.ObjectToString(__c.Null));
RDebugUtils.currentLine=176095235;
 //BA.debugLineNum = 176095235;BA.debugLine="FechaUltimaModificacion=-1";
__ref._fechaultimamodificacion /*long*/  = (long) (-1);
RDebugUtils.currentLine=176095237;
 //BA.debugLineNum = 176095237;BA.debugLine="If frm.IsInitialized=False Then";
if (__ref._frm /*anywheresoftware.b4j.objects.Form*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=176095238;
 //BA.debugLineNum = 176095238;BA.debugLine="Col2=0XFF696969";
__ref._col2 /*int*/  = ((int)0xff696969);
RDebugUtils.currentLine=176095240;
 //BA.debugLineNum = 176095240;BA.debugLine="Col1=0xFF424242";
__ref._col1 /*int*/  = ((int)0xff424242);
RDebugUtils.currentLine=176095242;
 //BA.debugLineNum = 176095242;BA.debugLine="frm.Initialize(\"frm\",1024,768)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",1024,768);
RDebugUtils.currentLine=176095243;
 //BA.debugLineNum = 176095243;BA.debugLine="frm.RootPane.LoadLayout(\"scrCamposJamTableCLVBui";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrCamposJamTableCLVBuilder");
RDebugUtils.currentLine=176095244;
 //BA.debugLineNum = 176095244;BA.debugLine="B4XPlusMinusAnchoBordeItems.SetNumericRange(0,3,";
__ref._b4xplusminusanchobordeitems /*b4j.docU.b4xplusminus*/ ._setnumericrange /*String*/ (null,0,3,1);
RDebugUtils.currentLine=176095245;
 //BA.debugLineNum = 176095245;BA.debugLine="clvListaCampos.DefaultTextColor = xui.Color_Whit";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=176095246;
 //BA.debugLineNum = 176095246;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=176095247;
 //BA.debugLineNum = 176095247;BA.debugLine="Dialog.Title = \"Campos Builder\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Campos Builder");
RDebugUtils.currentLine=176095248;
 //BA.debugLineNum = 176095248;BA.debugLine="Dim n As Node = clvListaCampos.sv";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=176095249;
 //BA.debugLineNum = 176095249;BA.debugLine="n.StyleClasses.Add(\"b4xdialog\")";
_n.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=176095250;
 //BA.debugLineNum = 176095250;BA.debugLine="pnlOrigenSQL.Visible=False";
__ref._pnlorigensql /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=176095252;
 //BA.debugLineNum = 176095252;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=clvListaC";
_joclvdatosscrollpane = new anywheresoftware.b4j.object.JavaObject();
_joclvdatosscrollpane = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=176095253;
 //BA.debugLineNum = 176095253;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",A";
_joclvdatosscrollpane.RunMethod("setHbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=176095254;
 //BA.debugLineNum = 176095254;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",A";
_joclvdatosscrollpane.RunMethod("setVbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=176095256;
 //BA.debugLineNum = 176095256;BA.debugLine="dragger.Initialize(Me,clvListaCampos)";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._initialize /*String*/ (null,ba,this,__ref._clvlistacampos /*b4j.example.customlistview*/ );
RDebugUtils.currentLine=176095258;
 //BA.debugLineNum = 176095258;BA.debugLine="FileChooser.Initialize";
__ref._filechooser /*anywheresoftware.b4j.objects.FileChooserWrapper*/ .Initialize();
RDebugUtils.currentLine=176095260;
 //BA.debugLineNum = 176095260;BA.debugLine="FileChooser.SetExtensionFilter(\"JSON\", Array(\"*.";
__ref._filechooser /*anywheresoftware.b4j.objects.FileChooserWrapper*/ .SetExtensionFilter("JSON",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*.json")}));
 };
RDebugUtils.currentLine=176095265;
 //BA.debugLineNum = 176095265;BA.debugLine="CurrentFile=\"\"";
__ref._currentfile /*String*/  = "";
RDebugUtils.currentLine=176095266;
 //BA.debugLineNum = 176095266;BA.debugLine="SetFormMaximized(frm)";
__ref._setformmaximized /*String*/ (null,__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=176095267;
 //BA.debugLineNum = 176095267;BA.debugLine="clvListaCampos.Clear";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=176095268;
 //BA.debugLineNum = 176095268;BA.debugLine="MostrarDatosOrigenDatos";
__ref._mostrardatosorigendatos /*String*/ (null);
RDebugUtils.currentLine=176095269;
 //BA.debugLineNum = 176095269;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=176095271;
 //BA.debugLineNum = 176095271;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(("CamposBuilder ("+__c.SmartStringFormatter("1.2",(Object)(__ref._version /*float*/ ))+")"));
RDebugUtils.currentLine=176095272;
 //BA.debugLineNum = 176095272;BA.debugLine="Inicio(RutaFicheroJSONjamTableCLV)";
__ref._inicio /*void*/ (null,_rutaficherojsonjamtableclv);
RDebugUtils.currentLine=176095273;
 //BA.debugLineNum = 176095273;BA.debugLine="End Sub";
return "";
}
public void  _additem(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4a.objects.collections.Map _minfo) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "additem", true))
	 {Debug.delegate(ba, "additem", new Object[] {_minfo}); return;}
ResumableSub_AddItem rsub = new ResumableSub_AddItem(this,__ref,_minfo);
rsub.resume(ba, null);
}
public static class ResumableSub_AddItem extends BA.ResumableSub {
public ResumableSub_AddItem(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4a.objects.collections.Map _minfo) {
this.parent = parent;
this.__ref = __ref;
this._minfo = _minfo;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4a.objects.collections.Map _minfo;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176947202;
 //BA.debugLineNum = 176947202;BA.debugLine="If ColActualCLV=Col1 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._colactualclv /*int*/ ==__ref._col1 /*int*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=176947203;
 //BA.debugLineNum = 176947203;BA.debugLine="ColActualCLV=Col2";
__ref._colactualclv /*int*/  = __ref._col2 /*int*/ ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=176947205;
 //BA.debugLineNum = 176947205;BA.debugLine="ColActualCLV=Col1";
__ref._colactualclv /*int*/  = __ref._col1 /*int*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=176947208;
 //BA.debugLineNum = 176947208;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=176947209;
 //BA.debugLineNum = 176947209;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, clvListaCampos.AsV";
_pnl.SetLayoutAnimated((int) (0),0,0,__ref._clvlistacampos /*b4j.example.customlistview*/ ._asview().getWidth(),parent.__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=176947210;
 //BA.debugLineNum = 176947210;BA.debugLine="pnl.LoadLayout(\"scrItemJamTableCLVCamposBuilder\")";
_pnl.LoadLayout("scrItemJamTableCLVCamposBuilder",ba);
RDebugUtils.currentLine=176947211;
 //BA.debugLineNum = 176947211;BA.debugLine="pnl.Color=ColActualCLV";
_pnl.setColor(__ref._colactualclv /*int*/ );
RDebugUtils.currentLine=176947213;
 //BA.debugLineNum = 176947213;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = new b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue();
RDebugUtils.currentLine=176947215;
 //BA.debugLineNum = 176947215;BA.debugLine="clvIV.txtID=txtID";
_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = __ref._txtid /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=176947218;
 //BA.debugLineNum = 176947218;BA.debugLine="clvIV.chkboxKeyID=chkboxKeyID";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = __ref._chkboxkeyid /*anywheresoftware.b4j.objects.CheckboxWrapper*/ ;
RDebugUtils.currentLine=176947219;
 //BA.debugLineNum = 176947219;BA.debugLine="clvIV.lblOrdenKeyID=lblOrdenKeyID";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/  = __ref._lblordenkeyid /*anywheresoftware.b4j.objects.LabelWrapper*/ ;
RDebugUtils.currentLine=176947220;
 //BA.debugLineNum = 176947220;BA.debugLine="clvIV.cboCampo=cboCampo";
_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = __ref._cbocampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ ;
RDebugUtils.currentLine=176947221;
 //BA.debugLineNum = 176947221;BA.debugLine="clvIV.txtAliasCampo=txtAliasCampo";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = __ref._txtaliascampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=176947224;
 //BA.debugLineNum = 176947224;BA.debugLine="clvIV.chkBoxCampoCalculado=chkBoxCampoCalculado";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = __ref._chkboxcampocalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ ;
RDebugUtils.currentLine=176947225;
 //BA.debugLineNum = 176947225;BA.debugLine="clvIV.cboTipoControlFiltro=cboTipoControlFiltro";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = __ref._cbotipocontrolfiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ ;
RDebugUtils.currentLine=176947226;
 //BA.debugLineNum = 176947226;BA.debugLine="clvIV.cboTipoDato=cboTipoDato";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/  = __ref._cbotipodato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ ;
RDebugUtils.currentLine=176947227;
 //BA.debugLineNum = 176947227;BA.debugLine="clvIV.chkBoxEsFecha=chkBoxEsFecha";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = __ref._chkboxesfecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ ;
RDebugUtils.currentLine=176947228;
 //BA.debugLineNum = 176947228;BA.debugLine="clvIV.chkBoxEsBooleano=chkBoxEsBooleano";
_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = __ref._chkboxesbooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ ;
RDebugUtils.currentLine=176947229;
 //BA.debugLineNum = 176947229;BA.debugLine="clvIV.txtValorTrueCampoBooleano=txtValorTrueCampo";
_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = __ref._txtvalortruecampobooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=176947233;
 //BA.debugLineNum = 176947233;BA.debugLine="clvIV.chkNoNulo=chkBoxNoNulo";
_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = __ref._chkboxnonulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ ;
RDebugUtils.currentLine=176947234;
 //BA.debugLineNum = 176947234;BA.debugLine="clvIV.chkBoxConValorDefecto=chkBoxConValorDefecto";
_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/  = __ref._chkboxconvalordefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ ;
RDebugUtils.currentLine=176947235;
 //BA.debugLineNum = 176947235;BA.debugLine="clvIV.txtValorDefecto=txtValorDefecto";
_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/  = __ref._txtvalordefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=176947259;
 //BA.debugLineNum = 176947259;BA.debugLine="clvIV.txtID.Text=0";
_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=176947260;
 //BA.debugLineNum = 176947260;BA.debugLine="clvIV.cboCampo.Value=\"\"";
_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=176947261;
 //BA.debugLineNum = 176947261;BA.debugLine="clvIV.txtAliasCampo.text=\"\"";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=176947266;
 //BA.debugLineNum = 176947266;BA.debugLine="clvIV.cboTipoControlFiltro.Items.AddAll(Array As";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","TextField","ComboBox","CheckBox","TextFieldBtn"}));
RDebugUtils.currentLine=176947268;
 //BA.debugLineNum = 176947268;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=176947269;
 //BA.debugLineNum = 176947269;BA.debugLine="clvIV.cboTipoDato.Items.AddAll(Array As String(\"\"";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","TEXT","REAL","INTEGER","BLOB"}));
RDebugUtils.currentLine=176947270;
 //BA.debugLineNum = 176947270;BA.debugLine="clvIV.cboTipoDato.Value=\"\"";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=176947275;
 //BA.debugLineNum = 176947275;BA.debugLine="clvIV.chkboxKeyID.Checked=False";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
RDebugUtils.currentLine=176947276;
 //BA.debugLineNum = 176947276;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=176947277;
 //BA.debugLineNum = 176947277;BA.debugLine="clvIV.chkBoxEsFecha.Checked=False";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
RDebugUtils.currentLine=176947278;
 //BA.debugLineNum = 176947278;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=False";
_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
RDebugUtils.currentLine=176947279;
 //BA.debugLineNum = 176947279;BA.debugLine="clvIV.txtValorTrueCampoBooleano.Text=\"\"";
_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=176947280;
 //BA.debugLineNum = 176947280;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=False";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
RDebugUtils.currentLine=176947309;
 //BA.debugLineNum = 176947309;BA.debugLine="clvIV.chkNoNulo.Checked=False";
_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
RDebugUtils.currentLine=176947310;
 //BA.debugLineNum = 176947310;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=False";
_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
RDebugUtils.currentLine=176947311;
 //BA.debugLineNum = 176947311;BA.debugLine="clvIV.txtValorDefecto.Text=\"\"";
_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=176947318;
 //BA.debugLineNum = 176947318;BA.debugLine="If mInfo.IsInitialized Then";
if (true) break;

case 7:
//if
this.state = 28;
if (_minfo.IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=176947319;
 //BA.debugLineNum = 176947319;BA.debugLine="clvIV.cboCampo.Value=mInfo.GetDefault(\"Campo\",\"\"";
_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("Campo"),(Object)("")));
RDebugUtils.currentLine=176947320;
 //BA.debugLineNum = 176947320;BA.debugLine="If False=mInfo.GetDefault(\"CampoCalculado\",False";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.False==BA.ObjectToBoolean(_minfo.GetDefault((Object)("CampoCalculado"),(Object)(parent.__c.False)))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=176947321;
 //BA.debugLineNum = 176947321;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("AliasCampo"),_minfo.GetDefault((Object)("Campo"),(Object)("")))));
RDebugUtils.currentLine=176947322;
 //BA.debugLineNum = 176947322;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then clvIV.txtAl";
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
RDebugUtils.currentLine=176947324;
 //BA.debugLineNum = 176947324;BA.debugLine="clvIV.txtAliasCampo.text=mInfo.GetDefault(\"Alia";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("AliasCampo"),(Object)(""))));
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=176947332;
 //BA.debugLineNum = 176947332;BA.debugLine="clvIV.lblOrdenKeyID.Text=mInfo.GetDefault(\"KeyID";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("KeyID"),(Object)(0))));
RDebugUtils.currentLine=176947333;
 //BA.debugLineNum = 176947333;BA.debugLine="clvIV.chkboxKeyID.Checked=0<>mInfo.GetDefault(\"K";
_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(0!=(double)(BA.ObjectToNumber(_minfo.GetDefault((Object)("KeyID"),(Object)(0)))));
RDebugUtils.currentLine=176947334;
 //BA.debugLineNum = 176947334;BA.debugLine="If 0<>mInfo.GetDefault(\"KeyID\",0) Then lstPrimar";
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
__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .Add(_minfo.GetDefault((Object)("Campo"),(Object)("")));
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=176947335;
 //BA.debugLineNum = 176947335;BA.debugLine="clvIV.cboTipoControlFiltro.Value=mInfo.GetDefaul";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("TipoControlFiltro"),(Object)("")));
RDebugUtils.currentLine=176947337;
 //BA.debugLineNum = 176947337;BA.debugLine="clvIV.cboTipoDato.Value=mInfo.GetDefault(\"TipoDa";
_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue(_minfo.GetDefault((Object)("TipoDato"),(Object)("")));
RDebugUtils.currentLine=176947339;
 //BA.debugLineNum = 176947339;BA.debugLine="clvIV.chkBoxEsFecha.Checked=mInfo.GetDefault(\"Es";
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("EsFecha"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=176947340;
 //BA.debugLineNum = 176947340;BA.debugLine="clvIV.chkBoxEsBooleano.Checked=mInfo.GetDefault(";
_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("EsBooleano"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=176947341;
 //BA.debugLineNum = 176947341;BA.debugLine="clvIV.txtValorTrueCampoBooleano.text=mInfo.GetDe";
_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("ValorTrueCampoBooleano"),(Object)(""))));
RDebugUtils.currentLine=176947342;
 //BA.debugLineNum = 176947342;BA.debugLine="clvIV.chkBoxCampoCalculado.Checked=mInfo.GetDefa";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("CampoCalculado"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=176947343;
 //BA.debugLineNum = 176947343;BA.debugLine="clvIV.chkNoNulo.Checked=mInfo.GetDefault(\"NoNulo";
_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("NoNulo"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=176947344;
 //BA.debugLineNum = 176947344;BA.debugLine="clvIV.chkBoxConValorDefecto.Checked=mInfo.GetDef";
_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(BA.ObjectToBoolean(_minfo.GetDefault((Object)("ConValorDefecto"),(Object)(parent.__c.False))));
RDebugUtils.currentLine=176947345;
 //BA.debugLineNum = 176947345;BA.debugLine="clvIV.txtValorDefecto.Text=mInfo.GetDefault(\"Val";
_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_minfo.GetDefault((Object)("ValorDefecto"),(Object)(""))));
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=176947446;
 //BA.debugLineNum = 176947446;BA.debugLine="clvIV.chkBoxCampoCalculado.Enabled= True";
_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=176947450;
 //BA.debugLineNum = 176947450;BA.debugLine="txtValorDefecto.Visible= clvIV.chkBoxConValorDefe";
__ref._txtvalordefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setVisible(_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked());
RDebugUtils.currentLine=176947453;
 //BA.debugLineNum = 176947453;BA.debugLine="clvListaCampos.Add(pnl, clvIV)";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._add(_pnl,(Object)(_clviv));
RDebugUtils.currentLine=176947456;
 //BA.debugLineNum = 176947456;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "additem"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=176947457;
 //BA.debugLineNum = 176947457;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _additemsfromstring(b4j.docU.jamtableclvcamposbuilder __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "additemsfromstring", true))
	 {return ((String) Debug.delegate(ba, "additemsfromstring", new Object[] {_s}));}
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _item = null;
RDebugUtils.currentLine=177340416;
 //BA.debugLineNum = 177340416;BA.debugLine="private Sub AddItemsFromString (s As String)";
RDebugUtils.currentLine=177340418;
 //BA.debugLineNum = 177340418;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=177340419;
 //BA.debugLineNum = 177340419;BA.debugLine="parser.Initialize(s)";
_parser.Initialize(_s);
RDebugUtils.currentLine=177340420;
 //BA.debugLineNum = 177340420;BA.debugLine="Dim m As Map = parser.NextObject";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = _parser.NextObject();
RDebugUtils.currentLine=177340421;
 //BA.debugLineNum = 177340421;BA.debugLine="FechaUltimaModificacion=m.getdefault(\"FechaUltima";
__ref._fechaultimamodificacion /*long*/  = BA.ObjectToLongNumber(_m.GetDefault((Object)("FechaUltimaModificacion"),(Object)(-1)));
RDebugUtils.currentLine=177340422;
 //BA.debugLineNum = 177340422;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(m.Get(\"Tip";
__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/  = __ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,BA.ObjectToString(_m.Get((Object)("TipoOrigenDatos"))),BA.ObjectToString(_m.Get((Object)("IpJRDC"))),BA.ObjectToString(_m.Get((Object)("PuertoJRDC"))),BA.ObjectToString(_m.Get((Object)("ComandoJRDC"))),BA.ObjectToString(_m.Get((Object)("ParametrosJRDC"))));
RDebugUtils.currentLine=177340423;
 //BA.debugLineNum = 177340423;BA.debugLine="MostrarDatosOrigenDatos";
__ref._mostrardatosorigendatos /*String*/ (null);
RDebugUtils.currentLine=177340425;
 //BA.debugLineNum = 177340425;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=177340427;
 //BA.debugLineNum = 177340427;BA.debugLine="txtRGBColorFondoEncabezados.Text=m.Getdefault(\"Co";
__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoEncabezados"),(Object)("#004B55"))));
RDebugUtils.currentLine=177340428;
 //BA.debugLineNum = 177340428;BA.debugLine="If txtRGBColorFondoEncabezados.Text=\"transparent\"";
if ((__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("transparent")) { 
RDebugUtils.currentLine=177340429;
 //BA.debugLineNum = 177340429;BA.debugLine="lblColorFondoEncabezados.Color=0";
__ref._lblcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int) (0));
 }else {
RDebugUtils.currentLine=177340432;
 //BA.debugLineNum = 177340432;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(";
__ref._lblcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=177340435;
 //BA.debugLineNum = 177340435;BA.debugLine="txtRGBColorTextoEncabezados.Text=m.Getdefault(\"Co";
__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.GetDefault((Object)("ColorTextoEncabezados"),(Object)(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White)))));
RDebugUtils.currentLine=177340436;
 //BA.debugLineNum = 177340436;BA.debugLine="If txtRGBColorTextoEncabezados.text=\"transparent\"";
if ((__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("transparent")) { 
RDebugUtils.currentLine=177340437;
 //BA.debugLineNum = 177340437;BA.debugLine="lblColorTextoEncabezados.Color=0";
__ref._lblcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int) (0));
 }else {
RDebugUtils.currentLine=177340440;
 //BA.debugLineNum = 177340440;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(";
__ref._lblcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=177340444;
 //BA.debugLineNum = 177340444;BA.debugLine="txtRGBColorFondoPanelInfo.Text=m.Getdefault(\"Colo";
__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoPanelInfo"),(Object)("#FFF8C3"))));
RDebugUtils.currentLine=177340445;
 //BA.debugLineNum = 177340445;BA.debugLine="If txtRGBColorFondoPanelInfo.Text=\"transparent\" T";
if ((__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("transparent")) { 
RDebugUtils.currentLine=177340446;
 //BA.debugLineNum = 177340446;BA.debugLine="lblColorFondoPanelInfo.Color=0";
__ref._lblcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int) (0));
 }else {
RDebugUtils.currentLine=177340448;
 //BA.debugLineNum = 177340448;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc";
__ref._lblcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=177340451;
 //BA.debugLineNum = 177340451;BA.debugLine="txtRGBColorTextoPanelInfo.Text=m.Getdefault(\"Colo";
__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.GetDefault((Object)("ColorTextoPanelInfo"),(Object)(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black)))));
RDebugUtils.currentLine=177340452;
 //BA.debugLineNum = 177340452;BA.debugLine="If txtRGBColorTextoPanelInfo.text=\"transparent\" T";
if ((__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("transparent")) { 
RDebugUtils.currentLine=177340453;
 //BA.debugLineNum = 177340453;BA.debugLine="lblColorTextoPanelInfo.Color=0";
__ref._lblcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int) (0));
 }else {
RDebugUtils.currentLine=177340455;
 //BA.debugLineNum = 177340455;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc";
__ref._lblcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=177340458;
 //BA.debugLineNum = 177340458;BA.debugLine="txtRGBColorFondoFilasImpares.Text=m.Getdefault(\"C";
__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoPanelItemsImpares"),(Object)(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White)))));
RDebugUtils.currentLine=177340459;
 //BA.debugLineNum = 177340459;BA.debugLine="If txtRGBColorFondoFilasImpares.Text=\"transparent";
if ((__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("transparent")) { 
RDebugUtils.currentLine=177340460;
 //BA.debugLineNum = 177340460;BA.debugLine="lblColorFondoFilasImpares.Color=0";
__ref._lblcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int) (0));
 }else {
RDebugUtils.currentLine=177340463;
 //BA.debugLineNum = 177340463;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes";
__ref._lblcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=177340466;
 //BA.debugLineNum = 177340466;BA.debugLine="txtRGBColorFondoFilasPares.Text=m.Getdefault(\"Col";
__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_m.GetDefault((Object)("ColorFondoPanelItemsPares"),(Object)("#F1F1F1"))));
RDebugUtils.currentLine=177340467;
 //BA.debugLineNum = 177340467;BA.debugLine="If txtRGBColorFondoFilasPares.Text=\"transparent\"";
if ((__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("transparent")) { 
RDebugUtils.currentLine=177340468;
 //BA.debugLineNum = 177340468;BA.debugLine="lblColorFondoFilasPares.Color=0";
__ref._lblcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int) (0));
 }else {
RDebugUtils.currentLine=177340471;
 //BA.debugLineNum = 177340471;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(b";
__ref._lblcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=177340474;
 //BA.debugLineNum = 177340474;BA.debugLine="txtRGBColorBordeItems.Text=m.Getdefault(\"ColorBor";
__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_m.GetDefault((Object)("ColorBordeItems"),(Object)("#808080"))));
RDebugUtils.currentLine=177340475;
 //BA.debugLineNum = 177340475;BA.debugLine="If txtRGBColorBordeItems.Text=\"\" Then txtRGBColor";
if ((__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("#808080");};
RDebugUtils.currentLine=177340476;
 //BA.debugLineNum = 177340476;BA.debugLine="If txtRGBColorBordeItems.Text=\"transparent\" Then";
if ((__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("transparent")) { 
RDebugUtils.currentLine=177340477;
 //BA.debugLineNum = 177340477;BA.debugLine="lblColorBordeItems.Color=0";
__ref._lblcolorbordeitems /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor((int) (0));
 }else {
RDebugUtils.currentLine=177340480;
 //BA.debugLineNum = 177340480;BA.debugLine="lblColorBordeItems.Color=bc.IntsFromBytes(bc.Hex";
__ref._lblcolorbordeitems /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText().replace("#","")))[(int) (0)]);
 };
RDebugUtils.currentLine=177340483;
 //BA.debugLineNum = 177340483;BA.debugLine="B4XPlusMinusAnchoBordeItems.SelectedValue=m.Getde";
__ref._b4xplusminusanchobordeitems /*b4j.docU.b4xplusminus*/ ._setselectedvalue /*Object*/ (null,_m.GetDefault((Object)("AnchoBordeItems"),(Object)(1)));
RDebugUtils.currentLine=177340490;
 //BA.debugLineNum = 177340490;BA.debugLine="Dim Items As List = m.Get(\"Items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_m.Get((Object)("Items"))));
RDebugUtils.currentLine=177340491;
 //BA.debugLineNum = 177340491;BA.debugLine="For Each item As Map In Items";
_item = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group53 = _items;
final int groupLen53 = group53.getSize()
;int index53 = 0;
;
for (; index53 < groupLen53;index53++){
_item = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group53.Get(index53)));
RDebugUtils.currentLine=177340493;
 //BA.debugLineNum = 177340493;BA.debugLine="AddItem(item)";
__ref._additem /*void*/ (null,_item);
 }
};
RDebugUtils.currentLine=177340498;
 //BA.debugLineNum = 177340498;BA.debugLine="CallSubDelayed(Me,\"AddItemsFromString_Completed\")";
__c.CallSubDelayed(ba,this,"AddItemsFromString_Completed");
RDebugUtils.currentLine=177340499;
 //BA.debugLineNum = 177340499;BA.debugLine="End Sub";
return "";
}
public b4j.docU.jamtableviewcamposbuilder._tipoorigendatos  _createtipoorigendatos(b4j.docU.jamtableclvcamposbuilder __ref,String _tipoorigendatos,String _ipjrdc,String _puertojrdc,String _comandojrdc,String _parametrosjrdc) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "createtipoorigendatos", true))
	 {return ((b4j.docU.jamtableviewcamposbuilder._tipoorigendatos) Debug.delegate(ba, "createtipoorigendatos", new Object[] {_tipoorigendatos,_ipjrdc,_puertojrdc,_comandojrdc,_parametrosjrdc}));}
b4j.docU.jamtableviewcamposbuilder._tipoorigendatos _t1 = null;
RDebugUtils.currentLine=179306496;
 //BA.debugLineNum = 179306496;BA.debugLine="private Sub CreateTipoOrigenDatos (TipoOrigenDatos";
RDebugUtils.currentLine=179306497;
 //BA.debugLineNum = 179306497;BA.debugLine="Dim t1 As TipoOrigenDatos";
_t1 = new b4j.docU.jamtableviewcamposbuilder._tipoorigendatos();
RDebugUtils.currentLine=179306498;
 //BA.debugLineNum = 179306498;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=179306499;
 //BA.debugLineNum = 179306499;BA.debugLine="t1.TipoOrigenDatos = TipoOrigenDatos";
_t1.TipoOrigenDatos /*String*/  = _tipoorigendatos;
RDebugUtils.currentLine=179306500;
 //BA.debugLineNum = 179306500;BA.debugLine="t1.IpJRDC = IpJRDC";
_t1.IpJRDC /*String*/  = _ipjrdc;
RDebugUtils.currentLine=179306501;
 //BA.debugLineNum = 179306501;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
_t1.PuertoJRDC /*String*/  = _puertojrdc;
RDebugUtils.currentLine=179306502;
 //BA.debugLineNum = 179306502;BA.debugLine="t1.ComandoJRDC = ComandoJRDC";
_t1.ComandoJRDC /*String*/  = _comandojrdc;
RDebugUtils.currentLine=179306503;
 //BA.debugLineNum = 179306503;BA.debugLine="t1.ParametrosJRDC = ParametrosJRDC";
_t1.ParametrosJRDC /*String*/  = _parametrosjrdc;
RDebugUtils.currentLine=179306504;
 //BA.debugLineNum = 179306504;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=179306505;
 //BA.debugLineNum = 179306505;BA.debugLine="End Sub";
return null;
}
public String  _mostrardatosorigendatos(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mostrardatosorigendatos", true))
	 {return ((String) Debug.delegate(ba, "mostrardatosorigendatos", null));}
String _paramtext = "";
RDebugUtils.currentLine=177602560;
 //BA.debugLineNum = 177602560;BA.debugLine="private Sub MostrarDatosOrigenDatos";
RDebugUtils.currentLine=177602561;
 //BA.debugLineNum = 177602561;BA.debugLine="txtTipoOrigenDatos.Text=DatosOrigenDatos.TipoOrig";
__ref._txttipoorigendatos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ );
RDebugUtils.currentLine=177602562;
 //BA.debugLineNum = 177602562;BA.debugLine="txtIpJRDC.Text=DatosOrigenDatos.IpJRDC";
__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .IpJRDC /*String*/ );
RDebugUtils.currentLine=177602563;
 //BA.debugLineNum = 177602563;BA.debugLine="txtPuertoJRDC.Text=DatosOrigenDatos.PuertoJRDC";
__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .PuertoJRDC /*String*/ );
RDebugUtils.currentLine=177602564;
 //BA.debugLineNum = 177602564;BA.debugLine="txtComandoJRDC.Text=DatosOrigenDatos.ComandoJRDC";
__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .ComandoJRDC /*String*/ );
RDebugUtils.currentLine=177602565;
 //BA.debugLineNum = 177602565;BA.debugLine="Dim paramText As String=DatosOrigenDatos.Parametr";
_paramtext = __ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .ParametrosJRDC /*String*/ ;
RDebugUtils.currentLine=177602566;
 //BA.debugLineNum = 177602566;BA.debugLine="txtParametrosJRDC.Text=paramText.Trim";
__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_paramtext.trim());
RDebugUtils.currentLine=177602567;
 //BA.debugLineNum = 177602567;BA.debugLine="pnlOrigenSQL.Visible=True";
__ref._pnlorigensql /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=177602568;
 //BA.debugLineNum = 177602568;BA.debugLine="End Sub";
return "";
}
public String  _getcsscolorstringfromintcolor(b4j.docU.jamtableclvcamposbuilder __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "getcsscolorstringfromintcolor", true))
	 {return ((String) Debug.delegate(ba, "getcsscolorstringfromintcolor", new Object[] {_value}));}
String _hexargb = "";
String _hexrgb = "";
RDebugUtils.currentLine=176619520;
 //BA.debugLineNum = 176619520;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
RDebugUtils.currentLine=176619521;
 //BA.debugLineNum = 176619521;BA.debugLine="Select value";
switch (BA.switchObjectToInt(_value,__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.To32Bit(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.Transparent))) {
case 0: {
RDebugUtils.currentLine=176619523;
 //BA.debugLineNum = 176619523;BA.debugLine="Return \"transparent\"";
if (true) return "transparent";
 break; }
default: {
RDebugUtils.currentLine=176619527;
 //BA.debugLineNum = 176619527;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
_hexargb = __ref._colortohex /*String*/ (null,_value);
RDebugUtils.currentLine=176619528;
 //BA.debugLineNum = 176619528;BA.debugLine="If HexARGB.Length=6 Then";
if (_hexargb.length()==6) { 
RDebugUtils.currentLine=176619529;
 //BA.debugLineNum = 176619529;BA.debugLine="Return \"#\" & HexARGB";
if (true) return "#"+_hexargb;
 }else {
RDebugUtils.currentLine=176619531;
 //BA.debugLineNum = 176619531;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
_hexrgb = _hexargb.substring((int) (2),(int) (8));
RDebugUtils.currentLine=176619532;
 //BA.debugLineNum = 176619532;BA.debugLine="Return \"#\" & HexRGB";
if (true) return "#"+_hexrgb;
 };
 break; }
}
;
RDebugUtils.currentLine=176619535;
 //BA.debugLineNum = 176619535;BA.debugLine="End Sub";
return "";
}
public void  _btnadd_click(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "btnadd_click", true))
	 {Debug.delegate(ba, "btnadd_click", null); return;}
ResumableSub_btnAdd_Click rsub = new ResumableSub_btnAdd_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAdd_Click extends BA.ResumableSub {
public ResumableSub_btnAdd_Click(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177012737;
 //BA.debugLineNum = 177012737;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=177012738;
 //BA.debugLineNum = 177012738;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Aún no se ha definido el tipo de origen de datos.","Aviso");
RDebugUtils.currentLine=177012739;
 //BA.debugLineNum = 177012739;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btnadd_click"), _msa);
this.state = 5;
return;
case 5:
//C
this.state = 4;
_result = (int) result[1];
;
RDebugUtils.currentLine=177012740;
 //BA.debugLineNum = 177012740;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=177012742;
 //BA.debugLineNum = 177012742;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=177012749;
 //BA.debugLineNum = 177012749;BA.debugLine="AddItem(Null)";
__ref._additem /*void*/ (null,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(parent.__c.Null)));
RDebugUtils.currentLine=177012753;
 //BA.debugLineNum = 177012753;BA.debugLine="dragger.AddDragButtons";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=177012754;
 //BA.debugLineNum = 177012754;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=177012755;
 //BA.debugLineNum = 177012755;BA.debugLine="RecalcularIDOrdenColumnas";
__ref._recalcularidordencolumnas /*String*/ (null);
RDebugUtils.currentLine=177012756;
 //BA.debugLineNum = 177012756;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btnadd_click"),(int) (100));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=177012757;
 //BA.debugLineNum = 177012757;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size - 1";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._jumptoitem((int) (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=177012758;
 //BA.debugLineNum = 177012758;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _recalcularidordencolumnas(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "recalcularidordencolumnas", true))
	 {return ((String) Debug.delegate(ba, "recalcularidordencolumnas", null));}
int _ordencolacum = 0;
int _i = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=178913280;
 //BA.debugLineNum = 178913280;BA.debugLine="private Sub RecalcularIDOrdenColumnas";
RDebugUtils.currentLine=178913281;
 //BA.debugLineNum = 178913281;BA.debugLine="Dim OrdenColAcum As Int";
_ordencolacum = 0;
RDebugUtils.currentLine=178913282;
 //BA.debugLineNum = 178913282;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=178913283;
 //BA.debugLineNum = 178913283;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_i));
RDebugUtils.currentLine=178913284;
 //BA.debugLineNum = 178913284;BA.debugLine="clvIV.txtID.Text=i";
_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_i));
RDebugUtils.currentLine=178913287;
 //BA.debugLineNum = 178913287;BA.debugLine="OrdenColAcum=OrdenColAcum+1";
_ordencolacum = (int) (_ordencolacum+1);
RDebugUtils.currentLine=178913291;
 //BA.debugLineNum = 178913291;BA.debugLine="If ColActualCLV=Col1 Then";
if (__ref._colactualclv /*int*/ ==__ref._col1 /*int*/ ) { 
RDebugUtils.currentLine=178913292;
 //BA.debugLineNum = 178913292;BA.debugLine="ColActualCLV=Col2";
__ref._colactualclv /*int*/  = __ref._col2 /*int*/ ;
 }else {
RDebugUtils.currentLine=178913294;
 //BA.debugLineNum = 178913294;BA.debugLine="ColActualCLV=Col1";
__ref._colactualclv /*int*/  = __ref._col1 /*int*/ ;
 };
RDebugUtils.currentLine=178913296;
 //BA.debugLineNum = 178913296;BA.debugLine="Dim p As B4XView=clvListaCampos.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=178913297;
 //BA.debugLineNum = 178913297;BA.debugLine="p.Color=ColActualCLV";
_p.setColor(__ref._colactualclv /*int*/ );
 }
};
RDebugUtils.currentLine=178913299;
 //BA.debugLineNum = 178913299;BA.debugLine="Log(\"RecalcularIDOrdenColumnas\")";
__c.LogImpl("9178913299","RecalcularIDOrdenColumnas",0);
RDebugUtils.currentLine=178913300;
 //BA.debugLineNum = 178913300;BA.debugLine="End Sub";
return "";
}
public void  _btnbuscaraliascampo_click(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "btnbuscaraliascampo_click", true))
	 {Debug.delegate(ba, "btnbuscaraliascampo_click", null); return;}
ResumableSub_btnBuscarAliasCampo_Click rsub = new ResumableSub_btnBuscarAliasCampo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBuscarAliasCampo_Click extends BA.ResumableSub {
public ResumableSub_btnBuscarAliasCampo_Click(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
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
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180879361;
 //BA.debugLineNum = 180879361;BA.debugLine="Dialog.Title=\"Selecciona Campo\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Campo");
RDebugUtils.currentLine=180879362;
 //BA.debugLineNum = 180879362;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=180879363;
 //BA.debugLineNum = 180879363;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=180879364;
 //BA.debugLineNum = 180879364;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=180879366;
 //BA.debugLineNum = 180879366;BA.debugLine="Dim lstCamposCLV As List=CargaCamposCLV";
_lstcamposclv = new anywheresoftware.b4a.objects.collections.List();
_lstcamposclv = __ref._cargacamposclv /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=180879368;
 //BA.debugLineNum = 180879368;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=180879369;
 //BA.debugLineNum = 180879369;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=180879371;
 //BA.debugLineNum = 180879371;BA.debugLine="For Each mDataCampo As Map In lstCamposCLV";
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
RDebugUtils.currentLine=180879372;
 //BA.debugLineNum = 180879372;BA.debugLine="lstOpciones.Add(mDataCampo.Get(\"AliasCampo\"))";
_lstopciones.Add(_mdatacampo.Get((Object)("AliasCampo")));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=180879375;
 //BA.debugLineNum = 180879375;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
_b4xsearchlistdlg = new b4j.docU.b4xsearchtemplate();
RDebugUtils.currentLine=180879376;
 //BA.debugLineNum = 180879376;BA.debugLine="B4XSearchListDlg.Initialize";
_b4xsearchlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=180879377;
 //BA.debugLineNum = 180879377;BA.debugLine="B4XSearchListDlg.SetItems(lstOpciones)";
_b4xsearchlistdlg._setitems /*Object*/ (null,_lstopciones);
RDebugUtils.currentLine=180879378;
 //BA.debugLineNum = 180879378;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._hinttext /*String*/  = "Buscar";
RDebugUtils.currentLine=180879379;
 //BA.debugLineNum = 180879379;BA.debugLine="B4XSearchListDlg.SearchField.Update";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=180879380;
 //BA.debugLineNum = 180879380;BA.debugLine="B4XSearchListDlg.ItemHightlightColor=0xFF87CEFA";
_b4xsearchlistdlg._itemhightlightcolor /*int*/  = ((int)0xff87cefa);
RDebugUtils.currentLine=180879381;
 //BA.debugLineNum = 180879381;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xsearchlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180879382;
 //BA.debugLineNum = 180879382;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
_btcanceldlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btcanceldlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180879383;
 //BA.debugLineNum = 180879383;BA.debugLine="btCancelDlg.TextSize=14";
_btcanceldlg.setTextSize(14);
RDebugUtils.currentLine=180879385;
 //BA.debugLineNum = 180879385;BA.debugLine="SetLightThemeDialog(Dialog)";
__ref._setlightthemedialog /*String*/ (null,__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=180879386;
 //BA.debugLineNum = 180879386;BA.debugLine="SetLightThemeSearch(B4XSearchListDlg)";
__ref._setlightthemesearch /*String*/ (null,_b4xsearchlistdlg);
RDebugUtils.currentLine=180879388;
 //BA.debugLineNum = 180879388;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=180879389;
 //BA.debugLineNum = 180879389;BA.debugLine="Dim xclv As CustomListView=B4XSearchListDlg.Custo";
_xclv = _b4xsearchlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=180879390;
 //BA.debugLineNum = 180879390;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=180879392;
 //BA.debugLineNum = 180879392;BA.debugLine="B4XSearchListDlg.Resize(400dip,0.75*Dialog.mParen";
_b4xsearchlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (400)),(int) (0.75*__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=180879394;
 //BA.debugLineNum = 180879394;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XS";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xsearchlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180879400;
 //BA.debugLineNum = 180879400;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=180879401;
 //BA.debugLineNum = 180879401;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=180879402;
 //BA.debugLineNum = 180879402;BA.debugLine="Dim lblB4Xv As B4XView=dlbl";
_lblb4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lblb4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_dlbl.getObject()));
RDebugUtils.currentLine=180879403;
 //BA.debugLineNum = 180879403;BA.debugLine="lblB4Xv.SetTextAlignment(\"CENTER\",\"LEFT\")";
_lblb4xv.SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=180879405;
 //BA.debugLineNum = 180879405;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180879406;
 //BA.debugLineNum = 180879406;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=180879407;
 //BA.debugLineNum = 180879407;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=180879408;
 //BA.debugLineNum = 180879408;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=180879409;
 //BA.debugLineNum = 180879409;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=180879412;
 //BA.debugLineNum = 180879412;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btnbuscaraliascampo_click"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=180879413;
 //BA.debugLineNum = 180879413;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 9:
//if
this.state = 14;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180879415;
 //BA.debugLineNum = 180879415;BA.debugLine="Dim sOpcionSel As String=B4XSearchListDlg.Selecte";
_sopcionsel = _b4xsearchlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=180879417;
 //BA.debugLineNum = 180879417;BA.debugLine="clvListaCampos.ScrollToItem(lstOpciones.IndexOf(s";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._scrolltoitem(_lstopciones.IndexOf((Object)(_sopcionsel)));
RDebugUtils.currentLine=180879419;
 //BA.debugLineNum = 180879419;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.List  _cargacamposclv(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacamposclv", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "cargacamposclv", null));}
anywheresoftware.b4a.objects.collections.List _lstcamposenclv = null;
int _i = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4a.objects.collections.Map _mc = null;
RDebugUtils.currentLine=177930240;
 //BA.debugLineNum = 177930240;BA.debugLine="private Sub CargaCamposCLV As List";
RDebugUtils.currentLine=177930241;
 //BA.debugLineNum = 177930241;BA.debugLine="Dim lstCamposEnCLV As List";
_lstcamposenclv = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177930242;
 //BA.debugLineNum = 177930242;BA.debugLine="lstCamposEnCLV.Initialize";
_lstcamposenclv.Initialize();
RDebugUtils.currentLine=177930243;
 //BA.debugLineNum = 177930243;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=177930244;
 //BA.debugLineNum = 177930244;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_i));
RDebugUtils.currentLine=177930245;
 //BA.debugLineNum = 177930245;BA.debugLine="If clvIV.cboCampo.Value<>\"\" Then";
if ((_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("")) == false) { 
RDebugUtils.currentLine=177930246;
 //BA.debugLineNum = 177930246;BA.debugLine="Dim mC As Map=ItemValueToMap(clvIV)";
_mc = new anywheresoftware.b4a.objects.collections.Map();
_mc = __ref._itemvaluetomap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_clviv);
RDebugUtils.currentLine=177930247;
 //BA.debugLineNum = 177930247;BA.debugLine="lstCamposEnCLV.Add(mC)";
_lstcamposenclv.Add((Object)(_mc.getObject()));
 };
 }
};
RDebugUtils.currentLine=177930250;
 //BA.debugLineNum = 177930250;BA.debugLine="Return lstCamposEnCLV";
if (true) return _lstcamposenclv;
RDebugUtils.currentLine=177930251;
 //BA.debugLineNum = 177930251;BA.debugLine="End Sub";
return null;
}
public String  _setlightthemedialog(b4j.docU.jamtableclvcamposbuilder __ref,b4j.docU.b4xdialog _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemedialog", true))
	 {return ((String) Debug.delegate(ba, "setlightthemedialog", new Object[] {_dlg}));}
RDebugUtils.currentLine=181010432;
 //BA.debugLineNum = 181010432;BA.debugLine="Sub SetLightThemeDialog(dlg As B4XDialog)";
RDebugUtils.currentLine=181010433;
 //BA.debugLineNum = 181010433;BA.debugLine="dlg.BackgroundColor = xui.Color_White";
_dlg._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=181010434;
 //BA.debugLineNum = 181010434;BA.debugLine="dlg.ButtonsColor = xui.Color_White";
_dlg._buttonscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=181010435;
 //BA.debugLineNum = 181010435;BA.debugLine="dlg.BorderColor = xui.Color_Gray";
_dlg._bordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=181010436;
 //BA.debugLineNum = 181010436;BA.debugLine="dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
_dlg._buttonstextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x00),((int)0x7d),((int)0xc3));
RDebugUtils.currentLine=181010437;
 //BA.debugLineNum = 181010437;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemesearch(b4j.docU.jamtableclvcamposbuilder __ref,b4j.docU.b4xsearchtemplate _search) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemesearch", true))
	 {return ((String) Debug.delegate(ba, "setlightthemesearch", new Object[] {_search}));}
int _textcolor = 0;
RDebugUtils.currentLine=181207040;
 //BA.debugLineNum = 181207040;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
RDebugUtils.currentLine=181207041;
 //BA.debugLineNum = 181207041;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=181207042;
 //BA.debugLineNum = 181207042;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(_textcolor);
RDebugUtils.currentLine=181207043;
 //BA.debugLineNum = 181207043;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=181207044;
 //BA.debugLineNum = 181207044;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=181207045;
 //BA.debugLineNum = 181207045;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=181207046;
 //BA.debugLineNum = 181207046;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=181207047;
 //BA.debugLineNum = 181207047;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=181207048;
 //BA.debugLineNum = 181207048;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=181207049;
 //BA.debugLineNum = 181207049;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=181207050;
 //BA.debugLineNum = 181207050;BA.debugLine="End Sub";
return "";
}
public void  _btncopy_click(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "btncopy_click", true))
	 {Debug.delegate(ba, "btncopy_click", null); return;}
ResumableSub_btnCopy_Click rsub = new ResumableSub_btnCopy_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCopy_Click extends BA.ResumableSub {
public ResumableSub_btnCopy_Click(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _minfo = null;
String _he = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176881665;
 //BA.debugLineNum = 176881665;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba))))));
RDebugUtils.currentLine=176881666;
 //BA.debugLineNum = 176881666;BA.debugLine="Dialog.Title=\"Copiar Campo\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Copiar Campo");
RDebugUtils.currentLine=176881667;
 //BA.debugLineNum = 176881667;BA.debugLine="Wait For (Dialog.Show(\"¿Crear un campo nuevo copi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btncopy_click"), __ref._dialog /*b4j.docU.b4xdialog*/ ._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)("¿Crear un campo nuevo copiando los datos del campo "+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+"?"),(Object)("Sí"),(Object)("No"),(Object)("")));
this.state = 14;
return;
case 14:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=176881668;
 //BA.debugLineNum = 176881668;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 13;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=176881669;
 //BA.debugLineNum = 176881669;BA.debugLine="Dim mInfo As Map=ItemValueToMap(clvIV)";
_minfo = new anywheresoftware.b4a.objects.collections.Map();
_minfo = __ref._itemvaluetomap /*anywheresoftware.b4a.objects.collections.Map*/ (null,_clviv);
RDebugUtils.currentLine=176881670;
 //BA.debugLineNum = 176881670;BA.debugLine="If mInfo.Get(\"EncabezadoColumna\")<>\"\" Then";
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
RDebugUtils.currentLine=176881671;
 //BA.debugLineNum = 176881671;BA.debugLine="Dim he As String = mInfo.Get(\"EncabezadoColumna";
_he = BA.ObjectToString(_minfo.Get((Object)("EncabezadoColumna")));
RDebugUtils.currentLine=176881672;
 //BA.debugLineNum = 176881672;BA.debugLine="mInfo.put(\"EncabezadoColumna\", he & \"2\")";
_minfo.Put((Object)("EncabezadoColumna"),(Object)(_he+"2"));
 if (true) break;
;
RDebugUtils.currentLine=176881674;
 //BA.debugLineNum = 176881674;BA.debugLine="If 0<>mInfo.Get(\"KeyID\") Then mInfo.put(\"KeyID\",";

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
RDebugUtils.currentLine=176881676;
 //BA.debugLineNum = 176881676;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=176881677;
 //BA.debugLineNum = 176881677;BA.debugLine="AddItem(mInfo)";
__ref._additem /*void*/ (null,_minfo);
RDebugUtils.currentLine=176881679;
 //BA.debugLineNum = 176881679;BA.debugLine="dragger.AddDragButtons";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=176881680;
 //BA.debugLineNum = 176881680;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=176881681;
 //BA.debugLineNum = 176881681;BA.debugLine="RecalcularIDOrdenColumnas";
__ref._recalcularidordencolumnas /*String*/ (null);
RDebugUtils.currentLine=176881682;
 //BA.debugLineNum = 176881682;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btncopy_click"),(int) (100));
this.state = 15;
return;
case 15:
//C
this.state = 13;
;
RDebugUtils.currentLine=176881683;
 //BA.debugLineNum = 176881683;BA.debugLine="clvListaCampos.JumpToItem(clvListaCampos.Size -";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._jumptoitem((int) (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1));
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=176881685;
 //BA.debugLineNum = 176881685;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.Map  _itemvaluetomap(b4j.docU.jamtableclvcamposbuilder __ref,b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "itemvaluetomap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "itemvaluetomap", new Object[] {_clviv}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=176553984;
 //BA.debugLineNum = 176553984;BA.debugLine="private Sub ItemValueToMap (clvIV As clvJamTableCV";
RDebugUtils.currentLine=176553985;
 //BA.debugLineNum = 176553985;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=176553986;
 //BA.debugLineNum = 176553986;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=176553987;
 //BA.debugLineNum = 176553987;BA.debugLine="m.put(\"ID\",clvIV.txtID.Text)";
_m.Put((Object)("ID"),(Object)(_clviv.txtID /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=176553988;
 //BA.debugLineNum = 176553988;BA.debugLine="m.Put(\"Campo\",clvIV.cboCampo.Value)";
_m.Put((Object)("Campo"),_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=176553989;
 //BA.debugLineNum = 176553989;BA.debugLine="m.Put(\"AliasCampo\",clvIV.txtAliasCampo.text)";
_m.Put((Object)("AliasCampo"),(Object)(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=176553992;
 //BA.debugLineNum = 176553992;BA.debugLine="m.Put(\"KeyID\",clvIV.lblOrdenKeyID.Text)";
_m.Put((Object)("KeyID"),(Object)(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=176553993;
 //BA.debugLineNum = 176553993;BA.debugLine="m.Put(\"TipoControlFiltro\",clvIV.cboTipoControlFil";
_m.Put((Object)("TipoControlFiltro"),_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=176553995;
 //BA.debugLineNum = 176553995;BA.debugLine="m.Put(\"TipoDato\",clvIV.cboTipoDato.Value)";
_m.Put((Object)("TipoDato"),_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=176553996;
 //BA.debugLineNum = 176553996;BA.debugLine="m.Put(\"EsFecha\",clvIV.chkBoxEsFecha.Checked)";
_m.Put((Object)("EsFecha"),(Object)(_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=176553997;
 //BA.debugLineNum = 176553997;BA.debugLine="m.Put(\"EsBooleano\",clvIV.chkBoxEsBooleano.Checked";
_m.Put((Object)("EsBooleano"),(Object)(_clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=176553998;
 //BA.debugLineNum = 176553998;BA.debugLine="m.Put(\"ValorTrueCampoBooleano\",clvIV.txtValorTrue";
_m.Put((Object)("ValorTrueCampoBooleano"),(Object)(_clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=176554001;
 //BA.debugLineNum = 176554001;BA.debugLine="m.Put(\"CampoCalculado\",clvIV.chkBoxCampoCalculado";
_m.Put((Object)("CampoCalculado"),(Object)(_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=176554004;
 //BA.debugLineNum = 176554004;BA.debugLine="m.put(\"NoNulo\",clvIV.chkNoNulo.Checked)";
_m.Put((Object)("NoNulo"),(Object)(_clviv.chkNoNulo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=176554005;
 //BA.debugLineNum = 176554005;BA.debugLine="m.put(\"ConValorDefecto\",clvIV.chkBoxConValorDefec";
_m.Put((Object)("ConValorDefecto"),(Object)(_clviv.chkBoxConValorDefecto /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()));
RDebugUtils.currentLine=176554006;
 //BA.debugLineNum = 176554006;BA.debugLine="m.put(\"ValorDefecto\",clvIV.txtValorDefecto.text)";
_m.Put((Object)("ValorDefecto"),(Object)(_clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=176554022;
 //BA.debugLineNum = 176554022;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=176554023;
 //BA.debugLineNum = 176554023;BA.debugLine="End Sub";
return null;
}
public void  _btndelete_click(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "btndelete_click", true))
	 {Debug.delegate(ba, "btndelete_click", null); return;}
ResumableSub_btnDelete_Click rsub = new ResumableSub_btnDelete_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnDelete_Click extends BA.ResumableSub {
public ResumableSub_btnDelete_Click(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.ButtonWrapper _btndel = null;
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176816129;
 //BA.debugLineNum = 176816129;BA.debugLine="Dim btnDel As Button=Sender";
_btndel = new anywheresoftware.b4j.objects.ButtonWrapper();
_btndel = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=176816130;
 //BA.debugLineNum = 176816130;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(b";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btndel.getObject())));
RDebugUtils.currentLine=176816131;
 //BA.debugLineNum = 176816131;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=176816137;
 //BA.debugLineNum = 176816137;BA.debugLine="Dialog.Title=\"Borrar Campo\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Borrar Campo");
RDebugUtils.currentLine=176816139;
 //BA.debugLineNum = 176816139;BA.debugLine="Wait For (Dialog.Show(\"Confirma eliminación del c";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btndelete_click"), __ref._dialog /*b4j.docU.b4xdialog*/ ._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)("Confirma eliminación del campo "+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+"."),(Object)("Sí"),(Object)("No"),(Object)("")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=176816140;
 //BA.debugLineNum = 176816140;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=176816141;
 //BA.debugLineNum = 176816141;BA.debugLine="clvListaCampos.RemoveAt(index)";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=176816142;
 //BA.debugLineNum = 176816142;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())>-1) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=176816143;
 //BA.debugLineNum = 176816143;BA.debugLine="RecalcularIDOrdenColumnas";
__ref._recalcularidordencolumnas /*String*/ (null);
RDebugUtils.currentLine=176816144;
 //BA.debugLineNum = 176816144;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btndelete_click"),(int) (100));
this.state = 16;
return;
case 16:
//C
this.state = 10;
;
RDebugUtils.currentLine=176816145;
 //BA.debugLineNum = 176816145;BA.debugLine="If clvListaCampos.Size>0 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()>0) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=176816146;
 //BA.debugLineNum = 176816146;BA.debugLine="clvListaCampos.JumpToItem(Max(0,(clvListaCampos";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._jumptoitem((int) (parent.__c.Max(0,(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1))));
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
RDebugUtils.currentLine=176816149;
 //BA.debugLineNum = 176816149;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btneditarorigenjrdc_click(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "btneditarorigenjrdc_click", true))
	 {Debug.delegate(ba, "btneditarorigenjrdc_click", null); return;}
ResumableSub_btnEditarOrigenJRDC_Click rsub = new ResumableSub_btnEditarOrigenJRDC_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEditarOrigenJRDC_Click extends BA.ResumableSub {
public ResumableSub_btnEditarOrigenJRDC_Click(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=179372033;
 //BA.debugLineNum = 179372033;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=179372034;
 //BA.debugLineNum = 179372034;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Aún no se h";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Aún no se ha definido un tipo de datos","Aviso");
RDebugUtils.currentLine=179372035;
 //BA.debugLineNum = 179372035;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 4;
_result = (int) result[1];
;
RDebugUtils.currentLine=179372036;
 //BA.debugLineNum = 179372036;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=179372038;
 //BA.debugLineNum = 179372038;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"Manual\" Then";

case 4:
//if
this.state = 7;
if ((__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ).equals("Manual")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=179372039;
 //BA.debugLineNum = 179372039;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No se puede";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se puede editar un origen de datos manual","Aviso");
RDebugUtils.currentLine=179372040;
 //BA.debugLineNum = 179372040;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 7;
_result = (int) result[1];
;
RDebugUtils.currentLine=179372041;
 //BA.debugLineNum = 179372041;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=179372046;
 //BA.debugLineNum = 179372046;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Editar el";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Editar el origen de datos actual?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=179372047;
 //BA.debugLineNum = 179372047;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 8;
_result = (int) result[1];
;
RDebugUtils.currentLine=179372048;
 //BA.debugLineNum = 179372048;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 8:
//if
this.state = 13;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=179372050;
 //BA.debugLineNum = 179372050;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC\",8";
__ref._prefdialog /*b4j.docU.preferencesdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=179372052;
 //BA.debugLineNum = 179372052;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.DirA";
__ref._prefdialog /*b4j.docU.preferencesdialog*/ ._loadfromjson /*String*/ (null,parent.__c.File.ReadString(parent.__c.File.getDirAssets(),"OrigenDatosJRDC.json"));
RDebugUtils.currentLine=179372053;
 //BA.debugLineNum = 179372053;BA.debugLine="Dim mData As Map=CreateMap(\"TipoOrigenDatos\": Dat";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("TipoOrigenDatos"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ),(Object)("IpJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .IpJRDC /*String*/ ),(Object)("PuertoJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .PuertoJRDC /*String*/ ),(Object)("ComandoJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .ComandoJRDC /*String*/ ),(Object)("ParametrosJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .ParametrosJRDC /*String*/ )});
RDebugUtils.currentLine=179372054;
 //BA.debugLineNum = 179372054;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"CAN";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), __ref._prefdialog /*b4j.docU.preferencesdialog*/ ._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL")));
this.state = 30;
return;
case 30:
//C
this.state = 14;
_result = (int) result[1];
;
RDebugUtils.currentLine=179372055;
 //BA.debugLineNum = 179372055;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 14:
//if
this.state = 19;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=179372056;
 //BA.debugLineNum = 179372056;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0xFF";
__ref._lbltitleipjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=179372057;
 //BA.debugLineNum = 179372057;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32Bit(";
__ref._lbltitlepuertojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=179372058;
 //BA.debugLineNum = 179372058;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32Bit";
__ref._lbltitlecomandojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=179372059;
 //BA.debugLineNum = 179372059;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.From32";
__ref._lbltitleparametrosjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=179372060;
 //BA.debugLineNum = 179372060;BA.debugLine="txtIpJRDC.Enabled=True";
__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=179372061;
 //BA.debugLineNum = 179372061;BA.debugLine="txtParametrosJRDC.Enabled=True";
__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=179372062;
 //BA.debugLineNum = 179372062;BA.debugLine="txtPuertoJRDC.Enabled=True";
__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=179372063;
 //BA.debugLineNum = 179372063;BA.debugLine="txtComandoJRDC.ENABLED=True";
__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=179372065;
 //BA.debugLineNum = 179372065;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(DatosOrige";
__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/  = __ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ,BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ComandoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ParametrosJRDC"),(Object)(""))));
RDebugUtils.currentLine=179372066;
 //BA.debugLineNum = 179372066;BA.debugLine="MostrarDatosOrigenDatos";
__ref._mostrardatosorigendatos /*String*/ (null);
RDebugUtils.currentLine=179372067;
 //BA.debugLineNum = 179372067;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=179372068;
 //BA.debugLineNum = 179372068;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
if (true) break;

case 20:
//if
this.state = 23;
if ((__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ).equals("JRDC Query")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=179372069;
 //BA.debugLineNum = 179372069;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJRD";
__ref._cargacamposjrdcquery /*void*/ (null,__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=179372070;
 //BA.debugLineNum = 179372070;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
parent.__c.WaitFor("cargacamposjrdcquery_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), null);
this.state = 31;
return;
case 31:
//C
this.state = 23;
;
 if (true) break;
;
RDebugUtils.currentLine=179372072;
 //BA.debugLineNum = 179372072;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";

case 23:
//if
this.state = 26;
if ((__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ).equals("JRDC Table")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=179372073;
 //BA.debugLineNum = 179372073;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJRD";
__ref._cargacamposjrdctable /*void*/ (null,__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=179372074;
 //BA.debugLineNum = 179372074;BA.debugLine="wait for CargaCamposJRDCTable_Completed";
parent.__c.WaitFor("cargacamposjrdctable_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "btneditarorigenjrdc_click"), null);
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
RDebugUtils.currentLine=179372077;
 //BA.debugLineNum = 179372077;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=179372078;
 //BA.debugLineNum = 179372078;BA.debugLine="RecalcularIDOrdenColumnas";
__ref._recalcularidordencolumnas /*String*/ (null);
RDebugUtils.currentLine=179372079;
 //BA.debugLineNum = 179372079;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cargacamposjrdcquery(b4j.docU.jamtableclvcamposbuilder __ref,String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacamposjrdcquery", true))
	 {Debug.delegate(ba, "cargacamposjrdcquery", new Object[] {_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros}); return;}
ResumableSub_CargaCamposJRDCQuery rsub = new ResumableSub_CargaCamposJRDCQuery(this,__ref,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaCamposJRDCQuery extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCQuery(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
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
int step36;
int limit36;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177799169;
 //BA.debugLineNum = 177799169;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=177799170;
 //BA.debugLineNum = 177799170;BA.debugLine="If Parametros=\"\" Then";
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
RDebugUtils.currentLine=177799172;
 //BA.debugLineNum = 177799172;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
__ref._cargadatosjrdcquerytop1 /*void*/ (null,_rdclinkquery,_comandoconfigprop,(Object[])(parent.__c.Null),parent);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=177799175;
 //BA.debugLineNum = 177799175;BA.debugLine="Parametros=Parametros.Replace(\" \",\"\")";
_parametros = _parametros.replace(" ","");
RDebugUtils.currentLine=177799176;
 //BA.debugLineNum = 177799176;BA.debugLine="Dim Params() As String=Regex.Split(\";\",Parametro";
_params = parent.__c.Regex.Split(";",_parametros);
RDebugUtils.currentLine=177799178;
 //BA.debugLineNum = 177799178;BA.debugLine="CargaDatosJRDCQueryTop1(rdcLinkQuery,ComandoConf";
__ref._cargadatosjrdcquerytop1 /*void*/ (null,_rdclinkquery,_comandoconfigprop,(Object[])(_params),parent);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=177799181;
 //BA.debugLineNum = 177799181;BA.debugLine="Wait For  CargaDatosJRDCQueryTop1_Completed (mRes";
parent.__c.WaitFor("cargadatosjrdcquerytop1_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cargacamposjrdcquery"), null);
this.state = 36;
return;
case 36:
//C
this.state = 7;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=177799182;
 //BA.debugLineNum = 177799182;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=177799183;
 //BA.debugLineNum = 177799183;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 7:
//if
this.state = 35;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 35;
RDebugUtils.currentLine=177799184;
 //BA.debugLineNum = 177799184;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Sin conexión con el servidor / base de datos / error de consulta"+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación","Error");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=177799186;
 //BA.debugLineNum = 177799186;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 12:
//if
this.state = 34;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 34;
RDebugUtils.currentLine=177799187;
 //BA.debugLineNum = 177799187;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"La consulta no devuelve datos, no es posible configurar sus campos.","Aviso");
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=177799189;
 //BA.debugLineNum = 177799189;BA.debugLine="Dim lstRes As List=mResult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=177799190;
 //BA.debugLineNum = 177799190;BA.debugLine="Dim mPrimerRegistro As Map=lstRes.get(0)";
_mprimerregistro = new anywheresoftware.b4a.objects.collections.Map();
_mprimerregistro = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=177799191;
 //BA.debugLineNum = 177799191;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvnocalculados = __ref._nombrescamposclvnocalculados /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=177799192;
 //BA.debugLineNum = 177799192;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177799193;
 //BA.debugLineNum = 177799193;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=177799195;
 //BA.debugLineNum = 177799195;BA.debugLine="For i=0 To mPrimerRegistro.Size-1";
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
RDebugUtils.currentLine=177799196;
 //BA.debugLineNum = 177799196;BA.debugLine="Dim NombreCampoQuerySQL As String=mPrimerRegis";
_nombrecampoquerysql = BA.ObjectToString(_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=177799197;
 //BA.debugLineNum = 177799197;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
_lstcampossql.Add((Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=177799200;
 //BA.debugLineNum = 177799200;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
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
RDebugUtils.currentLine=177799201;
 //BA.debugLineNum = 177799201;BA.debugLine="Dim mInfoCampoSQL As Map";
_minfocamposql = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=177799202;
 //BA.debugLineNum = 177799202;BA.debugLine="mInfoCampoSQL.Initialize";
_minfocamposql.Initialize();
RDebugUtils.currentLine=177799203;
 //BA.debugLineNum = 177799203;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mPrimerRegistro.Get";
_minfocamposql.Put((Object)("Campo"),_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=177799204;
 //BA.debugLineNum = 177799204;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mPrimerRegistr";
_minfocamposql.Put((Object)("AliasCampo"),_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=177799205;
 //BA.debugLineNum = 177799205;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mPrimer";
_minfocamposql.Put((Object)("EncabezadoColumna"),_mprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=177799206;
 //BA.debugLineNum = 177799206;BA.debugLine="AddItem(mInfoCampoSQL)";
__ref._additem /*void*/ (null,_minfocamposql);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=177799208;
 //BA.debugLineNum = 177799208;BA.debugLine="Continue";
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
RDebugUtils.currentLine=177799212;
 //BA.debugLineNum = 177799212;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";

case 26:
//for
this.state = 33;
step36 = 1;
limit36 = (int) (_lstnombrescamposclvnocalculados.getSize()-1);
_i = (int) (0) ;
this.state = 39;
if (true) break;

case 39:
//C
this.state = 33;
if ((step36 > 0 && _i <= limit36) || (step36 < 0 && _i >= limit36)) this.state = 28;
if (true) break;

case 40:
//C
this.state = 39;
_i = ((int)(0 + _i + step36)) ;
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=177799213;
 //BA.debugLineNum = 177799213;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
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
RDebugUtils.currentLine=177799214;
 //BA.debugLineNum = 177799214;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=177799215;
 //BA.debugLineNum = 177799215;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=177799216;
 //BA.debugLineNum = 177799216;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
_sb.Append("El campo no calculado "+BA.ObjectToString(_lstnombrescamposclvnocalculados.Get(_i))+" no ha sido devuelto por la SQL.");
RDebugUtils.currentLine=177799217;
 //BA.debugLineNum = 177799217;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
_sb.Append(" Si esto es un error, se debería eliminar el campo del CLV.");
RDebugUtils.currentLine=177799220;
 //BA.debugLineNum = 177799220;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sb.ToString(),"Aviso");
RDebugUtils.currentLine=177799221;
 //BA.debugLineNum = 177799221;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cargacamposjrdcquery"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 32;
_result = (int) result[1];
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
RDebugUtils.currentLine=177799224;
 //BA.debugLineNum = 177799224;BA.debugLine="dragger.AddDragButtons";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._adddragbuttons /*String*/ (null);
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
RDebugUtils.currentLine=177799227;
 //BA.debugLineNum = 177799227;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCQuery_Complete";
parent.__c.CallSubDelayed(ba,parent,"CargaCamposJRDCQuery_Completed");
RDebugUtils.currentLine=177799228;
 //BA.debugLineNum = 177799228;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cargacamposjrdctable(b4j.docU.jamtableclvcamposbuilder __ref,String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacamposjrdctable", true))
	 {Debug.delegate(ba, "cargacamposjrdctable", new Object[] {_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros}); return;}
ResumableSub_CargaCamposJRDCTable rsub = new ResumableSub_CargaCamposJRDCTable(this,__ref,_ipjrdc,_puertojrdc,_comandoconfigprop,_parametros);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaCamposJRDCTable extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCTable(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,String _ipjrdc,int _puertojrdc,String _comandoconfigprop,String _parametros) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._comandoconfigprop = _comandoconfigprop;
this._parametros = _parametros;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
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
int step67;
int limit67;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177864705;
 //BA.debugLineNum = 177864705;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=177864706;
 //BA.debugLineNum = 177864706;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigprop,(Object[])(new String[]{_parametros}),parent);
RDebugUtils.currentLine=177864707;
 //BA.debugLineNum = 177864707;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cargacamposjrdctable"), null);
this.state = 64;
return;
case 64:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=177864708;
 //BA.debugLineNum = 177864708;BA.debugLine="frm.RootPane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=177864709;
 //BA.debugLineNum = 177864709;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 63;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 63;
RDebugUtils.currentLine=177864710;
 //BA.debugLineNum = 177864710;BA.debugLine="fx.Msgbox(frm,\"Sin conexión con el servidor / ba";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Sin conexión con el servidor / base de datos / error de consulta"+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación","Error");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=177864712;
 //BA.debugLineNum = 177864712;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 62;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 62;
RDebugUtils.currentLine=177864713;
 //BA.debugLineNum = 177864713;BA.debugLine="fx.Msgbox(frm,\"La consulta no devuelve datos, n";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"La consulta no devuelve datos, no es posible configurar sus campos.","Aviso");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=177864715;
 //BA.debugLineNum = 177864715;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=177864716;
 //BA.debugLineNum = 177864716;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nom";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvnocalculados = __ref._nombrescamposclvnocalculados /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=177864717;
 //BA.debugLineNum = 177864717;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177864718;
 //BA.debugLineNum = 177864718;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=177864719;
 //BA.debugLineNum = 177864719;BA.debugLine="For i=0 To lstRes.Size-1";
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
RDebugUtils.currentLine=177864720;
 //BA.debugLineNum = 177864720;BA.debugLine="Dim mRes As Map=lstRes.Get(i)";
_mres = new anywheresoftware.b4a.objects.collections.Map();
_mres = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get(_i)));
RDebugUtils.currentLine=177864721;
 //BA.debugLineNum = 177864721;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"CO";
_nombrecampoquerysql = BA.ObjectToString(_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=177864722;
 //BA.debugLineNum = 177864722;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
_lstcampossql.Add((Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=177864724;
 //BA.debugLineNum = 177864724;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nom";
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
RDebugUtils.currentLine=177864725;
 //BA.debugLineNum = 177864725;BA.debugLine="Dim mInfoCampoSQL As Map";
_minfocamposql = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=177864726;
 //BA.debugLineNum = 177864726;BA.debugLine="mInfoCampoSQL.Initialize";
_minfocamposql.Initialize();
RDebugUtils.currentLine=177864727;
 //BA.debugLineNum = 177864727;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",mRes.Get(\"COLUMN_NA";
_minfocamposql.Put((Object)("Campo"),_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=177864728;
 //BA.debugLineNum = 177864728;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",mRes.Get(\"COLU";
_minfocamposql.Put((Object)("AliasCampo"),_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=177864729;
 //BA.debugLineNum = 177864729;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",mRes.Ge";
_minfocamposql.Put((Object)("EncabezadoColumna"),_mres.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=177864730;
 //BA.debugLineNum = 177864730;BA.debugLine="Dim TipoDatoMySQLMySQL As String=mRes.Get(\"DA";
_tipodatomysqlmysql = BA.ObjectToString(_mres.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=177864731;
 //BA.debugLineNum = 177864731;BA.debugLine="Dim TipoDato As String";
_tipodato = "";
RDebugUtils.currentLine=177864732;
 //BA.debugLineNum = 177864732;BA.debugLine="Select TipoDatoMySQLMySQL";
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
RDebugUtils.currentLine=177864754;
 //BA.debugLineNum = 177864754;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 21:
//C
this.state = 50;
RDebugUtils.currentLine=177864756;
 //BA.debugLineNum = 177864756;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 23:
//C
this.state = 50;
RDebugUtils.currentLine=177864758;
 //BA.debugLineNum = 177864758;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 25:
//C
this.state = 50;
RDebugUtils.currentLine=177864760;
 //BA.debugLineNum = 177864760;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 27:
//C
this.state = 50;
RDebugUtils.currentLine=177864762;
 //BA.debugLineNum = 177864762;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 29:
//C
this.state = 50;
RDebugUtils.currentLine=177864764;
 //BA.debugLineNum = 177864764;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 31:
//C
this.state = 50;
RDebugUtils.currentLine=177864766;
 //BA.debugLineNum = 177864766;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 33:
//C
this.state = 50;
RDebugUtils.currentLine=177864768;
 //BA.debugLineNum = 177864768;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 35:
//C
this.state = 50;
RDebugUtils.currentLine=177864770;
 //BA.debugLineNum = 177864770;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 37:
//C
this.state = 50;
RDebugUtils.currentLine=177864772;
 //BA.debugLineNum = 177864772;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 39:
//C
this.state = 50;
RDebugUtils.currentLine=177864774;
 //BA.debugLineNum = 177864774;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 41:
//C
this.state = 50;
RDebugUtils.currentLine=177864776;
 //BA.debugLineNum = 177864776;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 43:
//C
this.state = 50;
RDebugUtils.currentLine=177864778;
 //BA.debugLineNum = 177864778;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 45:
//C
this.state = 50;
RDebugUtils.currentLine=177864780;
 //BA.debugLineNum = 177864780;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=177864782;
 //BA.debugLineNum = 177864782;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=177864785;
 //BA.debugLineNum = 177864785;BA.debugLine="TipoDato=\"\"";
_tipodato = "";
 if (true) break;

case 50:
//C
this.state = 53;
;
RDebugUtils.currentLine=177864787;
 //BA.debugLineNum = 177864787;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDato)";
_minfocamposql.Put((Object)("TipoDato"),(Object)(_tipodato));
RDebugUtils.currentLine=177864788;
 //BA.debugLineNum = 177864788;BA.debugLine="AddItem(mInfoCampoSQL)";
__ref._additem /*void*/ (null,_minfocamposql);
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=177864790;
 //BA.debugLineNum = 177864790;BA.debugLine="Continue";
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
RDebugUtils.currentLine=177864794;
 //BA.debugLineNum = 177864794;BA.debugLine="For i=0 To lstNombresCamposCLVNoCalculados.Size";

case 54:
//for
this.state = 61;
step67 = 1;
limit67 = (int) (_lstnombrescamposclvnocalculados.getSize()-1);
_i = (int) (0) ;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 61;
if ((step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67)) this.state = 56;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step67)) ;
if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=177864795;
 //BA.debugLineNum = 177864795;BA.debugLine="If lstCamposSQL.IndexOf(lstNombresCamposCLVNoC";
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
RDebugUtils.currentLine=177864796;
 //BA.debugLineNum = 177864796;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=177864797;
 //BA.debugLineNum = 177864797;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=177864798;
 //BA.debugLineNum = 177864798;BA.debugLine="sb.Append(\"El campo no calculado \" & lstNombr";
_sb.Append("El campo no calculado "+BA.ObjectToString(_lstnombrescamposclvnocalculados.Get(_i))+" no ha sido devuelto por la SQL.");
RDebugUtils.currentLine=177864799;
 //BA.debugLineNum = 177864799;BA.debugLine="sb.Append(\" Si esto es un error, se debería e";
_sb.Append(" Si esto es un error, se debería eliminar el campo del CLV.");
RDebugUtils.currentLine=177864802;
 //BA.debugLineNum = 177864802;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(sb.ToStri";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sb.ToString(),"Aviso");
RDebugUtils.currentLine=177864803;
 //BA.debugLineNum = 177864803;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cargacamposjrdctable"), _msa);
this.state = 69;
return;
case 69:
//C
this.state = 60;
_result = (int) result[1];
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
RDebugUtils.currentLine=177864808;
 //BA.debugLineNum = 177864808;BA.debugLine="dragger.AddDragButtons";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._adddragbuttons /*String*/ (null);
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
RDebugUtils.currentLine=177864811;
 //BA.debugLineNum = 177864811;BA.debugLine="CallSubDelayed(Me, \"CargaCamposJRDCTable_Complete";
parent.__c.CallSubDelayed(ba,parent,"CargaCamposJRDCTable_Completed");
RDebugUtils.currentLine=177864812;
 //BA.debugLineNum = 177864812;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnorigenjrdc_click(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "btnorigenjrdc_click", true))
	 {return ((String) Debug.delegate(ba, "btnorigenjrdc_click", null));}
RDebugUtils.currentLine=179109888;
 //BA.debugLineNum = 179109888;BA.debugLine="private Sub btnOrigenJRDC_Click";
RDebugUtils.currentLine=179109890;
 //BA.debugLineNum = 179109890;BA.debugLine="End Sub";
return "";
}
public void  _cargadatosjrdcquerytop1(b4j.docU.jamtableclvcamposbuilder __ref,String _rdclink,String _comandoconfigproperties,Object[] _parametros,Object _callmodule) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cargadatosjrdcquerytop1", true))
	 {Debug.delegate(ba, "cargadatosjrdcquerytop1", new Object[] {_rdclink,_comandoconfigproperties,_parametros,_callmodule}); return;}
ResumableSub_CargaDatosJRDCQueryTop1 rsub = new ResumableSub_CargaDatosJRDCQueryTop1(this,__ref,_rdclink,_comandoconfigproperties,_parametros,_callmodule);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaDatosJRDCQueryTop1 extends BA.ResumableSub {
public ResumableSub_CargaDatosJRDCQueryTop1(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,String _rdclink,String _comandoconfigproperties,Object[] _parametros,Object _callmodule) {
this.parent = parent;
this.__ref = __ref;
this._rdclink = _rdclink;
this._comandoconfigproperties = _comandoconfigproperties;
this._parametros = _parametros;
this._callmodule = _callmodule;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
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
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=179896322;
 //BA.debugLineNum = 179896322;BA.debugLine="Dim lstRes As List";
_lstres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=179896323;
 //BA.debugLineNum = 179896323;BA.debugLine="lstRes.Initialize";
_lstres.Initialize();
RDebugUtils.currentLine=179896324;
 //BA.debugLineNum = 179896324;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=179896325;
 //BA.debugLineNum = 179896325;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=179896326;
 //BA.debugLineNum = 179896326;BA.debugLine="m.Put(\"ConnOK\",False)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=179896327;
 //BA.debugLineNum = 179896327;BA.debugLine="m.Put(\"ReqOK\",False)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=179896328;
 //BA.debugLineNum = 179896328;BA.debugLine="m.Put(\"lstRes\",lstRes)";
_m.Put((Object)("lstRes"),(Object)(_lstres.getObject()));
RDebugUtils.currentLine=179896329;
 //BA.debugLineNum = 179896329;BA.debugLine="Dim req As DBRequestManager = CreateRequest(rdcLi";
_req = __ref._createrequest /*b4j.docU.dbrequestmanager*/ (null,_rdclink);
RDebugUtils.currentLine=179896330;
 //BA.debugLineNum = 179896330;BA.debugLine="Dim cmd As DBCommand = CreateCommand(ComandoConfi";
_cmd = __ref._createcommand /*b4j.docU.main._dbcommand*/ (null,_comandoconfigproperties,_parametros);
RDebugUtils.currentLine=179896332;
 //BA.debugLineNum = 179896332;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cargadatosjrdcquerytop1"), (Object)(_req._executequery /*b4j.docU.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=179896333;
 //BA.debugLineNum = 179896333;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=179896334;
 //BA.debugLineNum = 179896334;BA.debugLine="m.Put(\"ConnOK\",True)";
_m.Put((Object)("ConnOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=179896335;
 //BA.debugLineNum = 179896335;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=179896336;
 //BA.debugLineNum = 179896336;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cargadatosjrdcquerytop1"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 4;
_res = (b4j.docU.main._dbresult) result[1];
;
RDebugUtils.currentLine=179896338;
 //BA.debugLineNum = 179896338;BA.debugLine="If res.Rows.Size>0 Then";
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
RDebugUtils.currentLine=179896339;
 //BA.debugLineNum = 179896339;BA.debugLine="m.Put(\"ReqOK\",True)";
_m.Put((Object)("ReqOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=179896341;
 //BA.debugLineNum = 179896341;BA.debugLine="Dim record() As Object=res.Rows.Get(0)";
_record = (Object[])(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=179896342;
 //BA.debugLineNum = 179896342;BA.debugLine="Dim mReg As Map";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=179896343;
 //BA.debugLineNum = 179896343;BA.debugLine="mReg.Initialize";
_mreg.Initialize();
RDebugUtils.currentLine=179896344;
 //BA.debugLineNum = 179896344;BA.debugLine="For i=0 To  res.Columns.Size-1";
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
RDebugUtils.currentLine=179896345;
 //BA.debugLineNum = 179896345;BA.debugLine="mReg.Put(res.Columns.GetKeyAt(i),record(i))";
_mreg.Put(_res.Columns /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_i),_record[_i]);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=179896347;
 //BA.debugLineNum = 179896347;BA.debugLine="lstRes.Add(mReg)";
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
RDebugUtils.currentLine=179896354;
 //BA.debugLineNum = 179896354;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=179896355;
 //BA.debugLineNum = 179896355;BA.debugLine="CallSubDelayed2(CallModule, \"CargaDatosJRDCQueryT";
parent.__c.CallSubDelayed2(ba,_callmodule,"CargaDatosJRDCQueryTop1_Completed",(Object)(_m));
RDebugUtils.currentLine=179896357;
 //BA.debugLineNum = 179896357;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.List  _nombrescamposclvnocalculados(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "nombrescamposclvnocalculados", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "nombrescamposclvnocalculados", null));}
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvnocalculados = null;
anywheresoftware.b4a.objects.collections.List _lstcamposenclv = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=177995776;
 //BA.debugLineNum = 177995776;BA.debugLine="private Sub NombresCamposCLVNoCalculados As List";
RDebugUtils.currentLine=177995777;
 //BA.debugLineNum = 177995777;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177995778;
 //BA.debugLineNum = 177995778;BA.debugLine="lstNombresCamposCLVNoCalculados.Initialize";
_lstnombrescamposclvnocalculados.Initialize();
RDebugUtils.currentLine=177995779;
 //BA.debugLineNum = 177995779;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
_lstcamposenclv = new anywheresoftware.b4a.objects.collections.List();
_lstcamposenclv = __ref._cargacamposclv /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=177995780;
 //BA.debugLineNum = 177995780;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstcamposenclv.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=177995781;
 //BA.debugLineNum = 177995781;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstcamposenclv.Get(_i)));
RDebugUtils.currentLine=177995782;
 //BA.debugLineNum = 177995782;BA.debugLine="If False=m.Get(\"CampoCalculado\") Then";
if (__c.False==BA.ObjectToBoolean(_m.Get((Object)("CampoCalculado")))) { 
RDebugUtils.currentLine=177995783;
 //BA.debugLineNum = 177995783;BA.debugLine="lstNombresCamposCLVNoCalculados.Add(m.Get(\"Camp";
_lstnombrescamposclvnocalculados.Add(_m.Get((Object)("Campo")));
 };
 }
};
RDebugUtils.currentLine=177995786;
 //BA.debugLineNum = 177995786;BA.debugLine="Return lstNombresCamposCLVNoCalculados";
if (true) return _lstnombrescamposclvnocalculados;
RDebugUtils.currentLine=177995787;
 //BA.debugLineNum = 177995787;BA.debugLine="End Sub";
return null;
}
public String  _cargacampostablasqlite(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4a.objects.collections.List _lstcampostablasqlite) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cargacampostablasqlite", true))
	 {return ((String) Debug.delegate(ba, "cargacampostablasqlite", new Object[] {_lstcampostablasqlite}));}
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvnocalculados = null;
anywheresoftware.b4a.objects.collections.List _lstcampossql = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _nombrecampoquerysql = "";
anywheresoftware.b4a.objects.collections.Map _minfocamposql = null;
String _tipodatosqlite = "";
RDebugUtils.currentLine=177733632;
 //BA.debugLineNum = 177733632;BA.debugLine="private Sub CargaCamposTablaSQLite(lstCamposTablaS";
RDebugUtils.currentLine=177733633;
 //BA.debugLineNum = 177733633;BA.debugLine="Dim lstNombresCamposCLVNoCalculados As List=Nombr";
_lstnombrescamposclvnocalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvnocalculados = __ref._nombrescamposclvnocalculados /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=177733634;
 //BA.debugLineNum = 177733634;BA.debugLine="Dim lstCamposSQL As List";
_lstcampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177733635;
 //BA.debugLineNum = 177733635;BA.debugLine="lstCamposSQL.Initialize";
_lstcampossql.Initialize();
RDebugUtils.currentLine=177733636;
 //BA.debugLineNum = 177733636;BA.debugLine="For i=0 To lstCamposTablaSQLite.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstcampostablasqlite.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=177733637;
 //BA.debugLineNum = 177733637;BA.debugLine="Dim mRes As Map=lstCamposTablaSQLite.Get(i)";
_mres = new anywheresoftware.b4a.objects.collections.Map();
_mres = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstcampostablasqlite.Get(_i)));
RDebugUtils.currentLine=177733638;
 //BA.debugLineNum = 177733638;BA.debugLine="Dim NombreCampoQuerySQL As String=mRes.Get(\"name";
_nombrecampoquerysql = BA.ObjectToString(_mres.Get((Object)("name")));
RDebugUtils.currentLine=177733639;
 //BA.debugLineNum = 177733639;BA.debugLine="lstCamposSQL.Add(NombreCampoQuerySQL)";
_lstcampossql.Add((Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=177733641;
 //BA.debugLineNum = 177733641;BA.debugLine="If lstNombresCamposCLVNoCalculados.IndexOf(Nombr";
if (_lstnombrescamposclvnocalculados.IndexOf((Object)(_nombrecampoquerysql))==-1) { 
RDebugUtils.currentLine=177733642;
 //BA.debugLineNum = 177733642;BA.debugLine="Dim mInfoCampoSQL As Map";
_minfocamposql = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=177733643;
 //BA.debugLineNum = 177733643;BA.debugLine="mInfoCampoSQL.Initialize";
_minfocamposql.Initialize();
RDebugUtils.currentLine=177733644;
 //BA.debugLineNum = 177733644;BA.debugLine="mInfoCampoSQL.Put(\"Campo\",NombreCampoQuerySQL)";
_minfocamposql.Put((Object)("Campo"),(Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=177733645;
 //BA.debugLineNum = 177733645;BA.debugLine="mInfoCampoSQL.Put(\"AliasCampo\",NombreCampoQuery";
_minfocamposql.Put((Object)("AliasCampo"),(Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=177733646;
 //BA.debugLineNum = 177733646;BA.debugLine="mInfoCampoSQL.Put(\"EncabezadoColumna\",NombreCam";
_minfocamposql.Put((Object)("EncabezadoColumna"),(Object)(_nombrecampoquerysql));
RDebugUtils.currentLine=177733647;
 //BA.debugLineNum = 177733647;BA.debugLine="Dim TipoDatoSQLite As String=mRes.Get(\"type\")";
_tipodatosqlite = BA.ObjectToString(_mres.Get((Object)("type")));
RDebugUtils.currentLine=177733648;
 //BA.debugLineNum = 177733648;BA.debugLine="mInfoCampoSQL.Put(\"TipoDato\",TipoDatoSQLite)";
_minfocamposql.Put((Object)("TipoDato"),(Object)(_tipodatosqlite));
RDebugUtils.currentLine=177733649;
 //BA.debugLineNum = 177733649;BA.debugLine="AddItem(mInfoCampoSQL)";
__ref._additem /*void*/ (null,_minfocamposql);
 }else {
RDebugUtils.currentLine=177733651;
 //BA.debugLineNum = 177733651;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
RDebugUtils.currentLine=177733654;
 //BA.debugLineNum = 177733654;BA.debugLine="End Sub";
return "";
}
public b4j.docU.dbrequestmanager  _createrequest(b4j.docU.jamtableclvcamposbuilder __ref,String _rdclink) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "createrequest", true))
	 {return ((b4j.docU.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_rdclink}));}
b4j.docU.dbrequestmanager _req = null;
RDebugUtils.currentLine=179765248;
 //BA.debugLineNum = 179765248;BA.debugLine="private Sub CreateRequest(rdcLink As String) As DB";
RDebugUtils.currentLine=179765249;
 //BA.debugLineNum = 179765249;BA.debugLine="Dim req As DBRequestManager";
_req = new b4j.docU.dbrequestmanager();
RDebugUtils.currentLine=179765250;
 //BA.debugLineNum = 179765250;BA.debugLine="req.Initialize(Me, rdcLink)";
_req._initialize /*String*/ (null,ba,this,_rdclink);
RDebugUtils.currentLine=179765251;
 //BA.debugLineNum = 179765251;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=179765252;
 //BA.debugLineNum = 179765252;BA.debugLine="End Sub";
return null;
}
public b4j.docU.main._dbcommand  _createcommand(b4j.docU.jamtableclvcamposbuilder __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "createcommand", true))
	 {return ((b4j.docU.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4j.docU.main._dbcommand _cmd = null;
RDebugUtils.currentLine=179830784;
 //BA.debugLineNum = 179830784;BA.debugLine="private Sub CreateCommand(name As String, Paramete";
RDebugUtils.currentLine=179830785;
 //BA.debugLineNum = 179830785;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4j.docU.main._dbcommand();
RDebugUtils.currentLine=179830786;
 //BA.debugLineNum = 179830786;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=179830787;
 //BA.debugLineNum = 179830787;BA.debugLine="cmd.Name = name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=179830788;
 //BA.debugLineNum = 179830788;BA.debugLine="If Parameters <> Null Then";
if (_parameters!= null) { 
RDebugUtils.currentLine=179830789;
 //BA.debugLineNum = 179830789;BA.debugLine="cmd.Parameters = Parameters";
_cmd.Parameters /*Object[]*/  = _parameters;
 };
RDebugUtils.currentLine=179830791;
 //BA.debugLineNum = 179830791;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=179830792;
 //BA.debugLineNum = 179830792;BA.debugLine="End Sub";
return null;
}
public String  _cboalineacioncolumna_valuechanged(b4j.docU.jamtableclvcamposbuilder __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cboalineacioncolumna_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cboalineacioncolumna_valuechanged", new Object[] {_value}));}
RDebugUtils.currentLine=179437568;
 //BA.debugLineNum = 179437568;BA.debugLine="private Sub cboAlineacionColumna_ValueChanged (Val";
RDebugUtils.currentLine=179437569;
 //BA.debugLineNum = 179437569;BA.debugLine="If CargandoDatos Then Return";
if (__ref._cargandodatos /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=179437570;
 //BA.debugLineNum = 179437570;BA.debugLine="End Sub";
return "";
}
public String  _cbocampo_valuechanged(b4j.docU.jamtableclvcamposbuilder __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cbocampo_valuechanged", true))
	 {return ((String) Debug.delegate(ba, "cbocampo_valuechanged", new Object[] {_value}));}
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
RDebugUtils.currentLine=178847744;
 //BA.debugLineNum = 178847744;BA.debugLine="private Sub cboCampo_ValueChanged (Value As Object";
RDebugUtils.currentLine=178847745;
 //BA.debugLineNum = 178847745;BA.debugLine="If CargandoDatos Then Return";
if (__ref._cargandodatos /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=178847746;
 //BA.debugLineNum = 178847746;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(S";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=178847747;
 //BA.debugLineNum = 178847747;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=178847749;
 //BA.debugLineNum = 178847749;BA.debugLine="If Not(clvIV.chkBoxCampoCalculado.Checked) Then";
if (__c.Not(_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked())) { 
RDebugUtils.currentLine=178847751;
 //BA.debugLineNum = 178847751;BA.debugLine="clvIV.txtAliasCampo.Text=Value";
_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_value));
 };
RDebugUtils.currentLine=178847753;
 //BA.debugLineNum = 178847753;BA.debugLine="End Sub";
return "";
}
public void  _cbotipocontrolfiltro_valuechanged(b4j.docU.jamtableclvcamposbuilder __ref,Object _value) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cbotipocontrolfiltro_valuechanged", true))
	 {Debug.delegate(ba, "cbotipocontrolfiltro_valuechanged", new Object[] {_value}); return;}
ResumableSub_cboTipoControlFiltro_ValueChanged rsub = new ResumableSub_cboTipoControlFiltro_ValueChanged(this,__ref,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_cboTipoControlFiltro_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoControlFiltro_ValueChanged(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._value = _value;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
Object _value;
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotcf = null;
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178388993;
 //BA.debugLineNum = 178388993;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._cargandodatos /*boolean*/ ) { 
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
RDebugUtils.currentLine=178388994;
 //BA.debugLineNum = 178388994;BA.debugLine="If Value=\"\" Or Value=Null Then Return";
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
RDebugUtils.currentLine=178388995;
 //BA.debugLineNum = 178388995;BA.debugLine="Dim cboTCF As ComboBox=Sender";
_cbotcf = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotcf = (anywheresoftware.b4j.objects.ComboBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ComboBoxWrapper(), (javafx.scene.control.ComboBox)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=178388996;
 //BA.debugLineNum = 178388996;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cbotcf.getObject())));
RDebugUtils.currentLine=178388997;
 //BA.debugLineNum = 178388997;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=178388998;
 //BA.debugLineNum = 178388998;BA.debugLine="If Value=TipoControlFiltro_TextFieldButton And cl";
if (true) break;

case 13:
//if
this.state = 16;
if ((_value).equals((Object)(__ref._tipocontrolfiltro_textfieldbutton /*String*/ )) && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==parent.__c.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=178388999;
 //BA.debugLineNum = 178388999;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El tipo de control filtro = "+__ref._tipocontrolfiltro_textfieldbutton /*String*/ +" sólo es válidos para campos tipo fecha.","");
RDebugUtils.currentLine=178389000;
 //BA.debugLineNum = 178389000;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 16;
_result = (int) result[1];
;
RDebugUtils.currentLine=178389001;
 //BA.debugLineNum = 178389001;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=178389003;
 //BA.debugLineNum = 178389003;BA.debugLine="If (Value<>TipoControlFiltro_TextFieldButton And";

case 16:
//if
this.state = 19;
if (((_value).equals((Object)(__ref._tipocontrolfiltro_textfieldbutton /*String*/ )) == false && (_value).equals((Object)("")) == false) && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==parent.__c.True) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=178389004;
 //BA.debugLineNum = 178389004;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Los campos tipo fecha sólo admiten tipo de control filtro = "+__ref._tipocontrolfiltro_textfieldbutton /*String*/ +".","");
RDebugUtils.currentLine=178389005;
 //BA.debugLineNum = 178389005;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 19;
_result = (int) result[1];
;
RDebugUtils.currentLine=178389006;
 //BA.debugLineNum = 178389006;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=178389008;
 //BA.debugLineNum = 178389008;BA.debugLine="If Value=TipoControlFiltro_CheckBox And clvIV.cbo";

case 19:
//if
this.state = 22;
if ((_value).equals((Object)(__ref._tipocontrolfiltro_checkbox /*String*/ )) && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=178389009;
 //BA.debugLineNum = 178389009;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El tipo de control filtro = "+__ref._tipocontrolfiltro_checkbox /*String*/ +" sólo es válidos para campos con tipo de dato = INTEGER.","");
RDebugUtils.currentLine=178389010;
 //BA.debugLineNum = 178389010;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 22;
_result = (int) result[1];
;
RDebugUtils.currentLine=178389011;
 //BA.debugLineNum = 178389011;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;
;
RDebugUtils.currentLine=178389013;
 //BA.debugLineNum = 178389013;BA.debugLine="If (Value<>TipoControlFiltro_CheckBox And Value<>";

case 22:
//if
this.state = 25;
if (((_value).equals((Object)(__ref._tipocontrolfiltro_checkbox /*String*/ )) == false && (_value).equals((Object)("")) == false) && _clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==parent.__c.True) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=178389014;
 //BA.debugLineNum = 178389014;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Los campos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Los campos tipo booleano sólo admiten tipo de control filtro = "+__ref._tipocontrolfiltro_checkbox /*String*/ +".","");
RDebugUtils.currentLine=178389015;
 //BA.debugLineNum = 178389015;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cbotipocontrolfiltro_valuechanged"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 25;
_result = (int) result[1];
;
RDebugUtils.currentLine=178389016;
 //BA.debugLineNum = 178389016;BA.debugLine="cboTCF.Value=\"\"";
_cbotcf.setValue((Object)(""));
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=178389018;
 //BA.debugLineNum = 178389018;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cbotipodato_valuechanged(b4j.docU.jamtableclvcamposbuilder __ref,Object _value) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "cbotipodato_valuechanged", true))
	 {Debug.delegate(ba, "cbotipodato_valuechanged", new Object[] {_value}); return;}
ResumableSub_cboTipoDato_ValueChanged rsub = new ResumableSub_cboTipoDato_ValueChanged(this,__ref,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_cboTipoDato_ValueChanged extends BA.ResumableSub {
public ResumableSub_cboTipoDato_ValueChanged(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._value = _value;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
Object _value;
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotd = null;
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178782209;
 //BA.debugLineNum = 178782209;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._cargandodatos /*boolean*/ ) { 
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
RDebugUtils.currentLine=178782210;
 //BA.debugLineNum = 178782210;BA.debugLine="Dim cboTD As ComboBox=Sender";
_cbotd = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotd = (anywheresoftware.b4j.objects.ComboBoxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ComboBoxWrapper(), (javafx.scene.control.ComboBox)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=178782211;
 //BA.debugLineNum = 178782211;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_cbotd.getObject())));
RDebugUtils.currentLine=178782212;
 //BA.debugLineNum = 178782212;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=178782213;
 //BA.debugLineNum = 178782213;BA.debugLine="If cboTD.Value<>\"REAL\" And clvIV.chkBoxEsFecha.Ch";
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
_clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=178782214;
 //BA.debugLineNum = 178782214;BA.debugLine="If  cboTD.value<>\"INTEGER\" And clvIV.cboTipoContr";
if (true) break;

case 13:
//if
this.state = 16;
if ((_cbotd.getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(__ref._tipocontrolfiltro_checkbox /*String*/ ))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=178782215;
 //BA.debugLineNum = 178782215;BA.debugLine="clvIV.cboTipoControlFiltro.Value=\"\"";
_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .setValue((Object)(""));
RDebugUtils.currentLine=178782216;
 //BA.debugLineNum = 178782216;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El tipo de control de filtro checkbox, sólo es compatible con tipo de datos INTEGER. Se quita el tipo de control de filtro.","Aviso");
RDebugUtils.currentLine=178782217;
 //BA.debugLineNum = 178782217;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "cbotipodato_valuechanged"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 16;
_result = (int) result[1];
;
RDebugUtils.currentLine=178782218;
 //BA.debugLineNum = 178782218;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=178782220;
 //BA.debugLineNum = 178782220;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkchanges(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "checkchanges", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkchanges", null));}
ResumableSub_CheckChanges rsub = new ResumableSub_CheckChanges(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckChanges extends BA.ResumableSub {
public ResumableSub_CheckChanges(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
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
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178126849;
 //BA.debugLineNum = 178126849;BA.debugLine="If CurrentFile=\"\" Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._currentfile /*String*/ ).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=178126851;
 //BA.debugLineNum = 178126851;BA.debugLine="Dim HayCambios As Boolean=False";
_haycambios = parent.__c.False;
RDebugUtils.currentLine=178126855;
 //BA.debugLineNum = 178126855;BA.debugLine="Dim sCLV As String = ExportToString";
_sclv = __ref._exporttostring /*String*/ (null);
RDebugUtils.currentLine=178126857;
 //BA.debugLineNum = 178126857;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=178126858;
 //BA.debugLineNum = 178126858;BA.debugLine="parser.Initialize(sCLV)";
_parser.Initialize(_sclv);
RDebugUtils.currentLine=178126859;
 //BA.debugLineNum = 178126859;BA.debugLine="Dim msCLV As Map = parser.NextObject";
_msclv = new anywheresoftware.b4a.objects.collections.Map();
_msclv = _parser.NextObject();
RDebugUtils.currentLine=178126861;
 //BA.debugLineNum = 178126861;BA.debugLine="parser.Initialize(CurrentFileString)";
_parser.Initialize(__ref._currentfilestring /*String*/ );
RDebugUtils.currentLine=178126862;
 //BA.debugLineNum = 178126862;BA.debugLine="Dim msCheck As Map = parser.NextObject";
_mscheck = new anywheresoftware.b4a.objects.collections.Map();
_mscheck = _parser.NextObject();
RDebugUtils.currentLine=178126865;
 //BA.debugLineNum = 178126865;BA.debugLine="msCLV.Remove(\"FechaUltimaModificacion\")";
_msclv.Remove((Object)("FechaUltimaModificacion"));
RDebugUtils.currentLine=178126866;
 //BA.debugLineNum = 178126866;BA.debugLine="msCheck.Remove(\"FechaUltimaModificacion\")";
_mscheck.Remove((Object)("FechaUltimaModificacion"));
RDebugUtils.currentLine=178126868;
 //BA.debugLineNum = 178126868;BA.debugLine="Dim Check1 As Boolean=Comparar2Mapas(msCLV,msChec";
_check1 = __ref._comparar2mapas /*boolean*/ (null,_msclv,_mscheck);
RDebugUtils.currentLine=178126869;
 //BA.debugLineNum = 178126869;BA.debugLine="Dim Check2 As Boolean=Comparar2Mapas(msCheck,msCL";
_check2 = __ref._comparar2mapas /*boolean*/ (null,_mscheck,_msclv);
RDebugUtils.currentLine=178126871;
 //BA.debugLineNum = 178126871;BA.debugLine="HayCambios=(Not(Check1) Or Not(Check2))";
_haycambios = (parent.__c.Not(_check1) || parent.__c.Not(_check2));
RDebugUtils.currentLine=178126874;
 //BA.debugLineNum = 178126874;BA.debugLine="If HayCambios Then";
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
RDebugUtils.currentLine=178126875;
 //BA.debugLineNum = 178126875;BA.debugLine="Wait For (Dialog.Show(\"¿Grabar Cambios?\", \"Sí\",";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkchanges"), __ref._dialog /*b4j.docU.b4xdialog*/ ._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)("¿Grabar Cambios?"),(Object)("Sí"),(Object)("No"),(Object)("Cancelar")));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_result = (int) result[1];
;
RDebugUtils.currentLine=178126876;
 //BA.debugLineNum = 178126876;BA.debugLine="Select Result";
if (true) break;

case 10:
//select
this.state = 19;
switch (BA.switchObjectToInt(_result,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative)) {
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
RDebugUtils.currentLine=178126878;
 //BA.debugLineNum = 178126878;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 14:
//C
this.state = 19;
RDebugUtils.currentLine=178126880;
 //BA.debugLineNum = 178126880;BA.debugLine="mnuSave_Action";
__ref._mnusave_action /*void*/ (null);
RDebugUtils.currentLine=178126881;
 //BA.debugLineNum = 178126881;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=178126883;
 //BA.debugLineNum = 178126883;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=178126885;
 //BA.debugLineNum = 178126885;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=178126888;
 //BA.debugLineNum = 178126888;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=178126890;
 //BA.debugLineNum = 178126890;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _exporttostring(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "exporttostring", true))
	 {return ((String) Debug.delegate(ba, "exporttostring", null));}
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jg = null;
RDebugUtils.currentLine=177078272;
 //BA.debugLineNum = 177078272;BA.debugLine="private Sub ExportToString As String";
RDebugUtils.currentLine=177078273;
 //BA.debugLineNum = 177078273;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177078274;
 //BA.debugLineNum = 177078274;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=177078275;
 //BA.debugLineNum = 177078275;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=177078276;
 //BA.debugLineNum = 177078276;BA.debugLine="Items.Add(ItemValueToMap(clvListaCampos.GetValue";
_items.Add((Object)(__ref._itemvaluetomap /*anywheresoftware.b4a.objects.collections.Map*/ (null,(b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_i))).getObject()));
 }
};
RDebugUtils.currentLine=177078288;
 //BA.debugLineNum = 177078288;BA.debugLine="Dim jg As JSONGenerator";
_jg = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=177078301;
 //BA.debugLineNum = 177078301;BA.debugLine="jg.Initialize(CreateMap(\"FechaUltimaModificacion\"";
_jg.Initialize(__c.createMap(new Object[] {(Object)("FechaUltimaModificacion"),(Object)(__c.DateTime.getNow()),(Object)("TipoOrigenDatos"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ),(Object)("IpJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .IpJRDC /*String*/ ),(Object)("PuertoJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .PuertoJRDC /*String*/ ),(Object)("ComandoJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .ComandoJRDC /*String*/ ),(Object)("ParametrosJRDC"),(Object)(__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .ParametrosJRDC /*String*/ ),(Object)("ColorFondoEncabezados"),(Object)(__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),(Object)("ColorTextoEncabezados"),(Object)(__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),(Object)("ColorFondoPanelInfo"),(Object)(__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),(Object)("ColorTextoPanelInfo"),(Object)(__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),(Object)("ColorFondoPanelItemsImpares"),(Object)(__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),(Object)("ColorFondoPanelItemsPares"),(Object)(__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()),(Object)("AnchoBordeItems"),__ref._b4xplusminusanchobordeitems /*b4j.docU.b4xplusminus*/ ._getselectedvalue /*Object*/ (null),(Object)("ColorBordeItems"),(Object)(__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()),(Object)("Items"),(Object)(_items.getObject())}));
RDebugUtils.currentLine=177078309;
 //BA.debugLineNum = 177078309;BA.debugLine="Return jg.ToPrettyString(4)";
if (true) return _jg.ToPrettyString((int) (4));
RDebugUtils.currentLine=177078310;
 //BA.debugLineNum = 177078310;BA.debugLine="End Sub";
return "";
}
public boolean  _comparar2mapas(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4a.objects.collections.Map _map1,anywheresoftware.b4a.objects.collections.Map _map2) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "comparar2mapas", true))
	 {return ((Boolean) Debug.delegate(ba, "comparar2mapas", new Object[] {_map1,_map2}));}
boolean _flagallkeysok = false;
String _key1 = "";
String _value1 = "";
boolean _keyvaluesame = false;
String _value2 = "";
String _key2 = "";
RDebugUtils.currentLine=179503104;
 //BA.debugLineNum = 179503104;BA.debugLine="Sub Comparar2Mapas(Map1 As Map, Map2 As Map) As Bo";
RDebugUtils.currentLine=179503105;
 //BA.debugLineNum = 179503105;BA.debugLine="Dim FlagAllkeysOK As Boolean=True";
_flagallkeysok = __c.True;
RDebugUtils.currentLine=179503106;
 //BA.debugLineNum = 179503106;BA.debugLine="For Each Key1 As String In Map1.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _map1.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key1 = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=179503107;
 //BA.debugLineNum = 179503107;BA.debugLine="Dim Value1 As String = Map1.Get(Key1)";
_value1 = BA.ObjectToString(_map1.Get((Object)(_key1)));
RDebugUtils.currentLine=179503108;
 //BA.debugLineNum = 179503108;BA.debugLine="Dim KeyValueSame As Boolean = False";
_keyvaluesame = __c.False;
RDebugUtils.currentLine=179503109;
 //BA.debugLineNum = 179503109;BA.debugLine="If Map2.ContainsKey(Key1) Then";
if (_map2.ContainsKey((Object)(_key1))) { 
RDebugUtils.currentLine=179503110;
 //BA.debugLineNum = 179503110;BA.debugLine="Dim Value2 As String = Map2.Get(Key1)";
_value2 = BA.ObjectToString(_map2.Get((Object)(_key1)));
RDebugUtils.currentLine=179503111;
 //BA.debugLineNum = 179503111;BA.debugLine="KeyValueSame = Value1 = Value2";
_keyvaluesame = (_value1).equals(_value2);
RDebugUtils.currentLine=179503112;
 //BA.debugLineNum = 179503112;BA.debugLine="If KeyValueSame = False Then";
if (_keyvaluesame==__c.False) { 
RDebugUtils.currentLine=179503113;
 //BA.debugLineNum = 179503113;BA.debugLine="Log($\"Key: ${Key1} is different\"$)";
__c.LogImpl("9179503113",("Key: "+__c.SmartStringFormatter("",(Object)(_key1))+" is different"),0);
RDebugUtils.currentLine=179503114;
 //BA.debugLineNum = 179503114;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = __c.False;
 };
 }else {
RDebugUtils.currentLine=179503117;
 //BA.debugLineNum = 179503117;BA.debugLine="Log($\"Key: ${Key1} is not in Map2\"$)";
__c.LogImpl("9179503117",("Key: "+__c.SmartStringFormatter("",(Object)(_key1))+" is not in Map2"),0);
RDebugUtils.currentLine=179503118;
 //BA.debugLineNum = 179503118;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = __c.False;
 };
 }
};
RDebugUtils.currentLine=179503121;
 //BA.debugLineNum = 179503121;BA.debugLine="For Each Key2 As String In Map2.Keys";
{
final anywheresoftware.b4a.BA.IterableList group17 = _map2.Keys();
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_key2 = BA.ObjectToString(group17.Get(index17));
RDebugUtils.currentLine=179503122;
 //BA.debugLineNum = 179503122;BA.debugLine="Dim Value2 As String = Map2.Get(Key2)";
_value2 = BA.ObjectToString(_map2.Get((Object)(_key2)));
RDebugUtils.currentLine=179503123;
 //BA.debugLineNum = 179503123;BA.debugLine="Dim KeyValueSame As Boolean = False";
_keyvaluesame = __c.False;
RDebugUtils.currentLine=179503124;
 //BA.debugLineNum = 179503124;BA.debugLine="If Map1.ContainsKey(Key2) Then";
if (_map1.ContainsKey((Object)(_key2))) { 
RDebugUtils.currentLine=179503125;
 //BA.debugLineNum = 179503125;BA.debugLine="Dim Value1 As String = Map1.Get(Key2)";
_value1 = BA.ObjectToString(_map1.Get((Object)(_key2)));
RDebugUtils.currentLine=179503126;
 //BA.debugLineNum = 179503126;BA.debugLine="KeyValueSame = Value1 = Value2";
_keyvaluesame = (_value1).equals(_value2);
RDebugUtils.currentLine=179503127;
 //BA.debugLineNum = 179503127;BA.debugLine="If KeyValueSame = False Then";
if (_keyvaluesame==__c.False) { 
RDebugUtils.currentLine=179503128;
 //BA.debugLineNum = 179503128;BA.debugLine="Log($\"Key: ${Key2} is different\"$)";
__c.LogImpl("9179503128",("Key: "+__c.SmartStringFormatter("",(Object)(_key2))+" is different"),0);
RDebugUtils.currentLine=179503129;
 //BA.debugLineNum = 179503129;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = __c.False;
 };
 }else {
RDebugUtils.currentLine=179503132;
 //BA.debugLineNum = 179503132;BA.debugLine="Log($\"Key: ${Key2} is not in Map1\"$)";
__c.LogImpl("9179503132",("Key: "+__c.SmartStringFormatter("",(Object)(_key2))+" is not in Map1"),0);
RDebugUtils.currentLine=179503133;
 //BA.debugLineNum = 179503133;BA.debugLine="FlagAllkeysOK=False";
_flagallkeysok = __c.False;
 };
 }
};
RDebugUtils.currentLine=179503136;
 //BA.debugLineNum = 179503136;BA.debugLine="Return FlagAllkeysOK";
if (true) return _flagallkeysok;
RDebugUtils.currentLine=179503137;
 //BA.debugLineNum = 179503137;BA.debugLine="End Sub";
return false;
}
public void  _mnusave_action(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mnusave_action", true))
	 {Debug.delegate(ba, "mnusave_action", null); return;}
ResumableSub_mnuSave_Action rsub = new ResumableSub_mnuSave_Action(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSave_Action extends BA.ResumableSub {
public ResumableSub_mnuSave_Action(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _camposok = false;
String _dirjson = "";
String _nombrejson = "";
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178192385;
 //BA.debugLineNum = 178192385;BA.debugLine="If CurrentFile = \"\" Then";
if (true) break;

case 1:
//if
this.state = 16;
if ((__ref._currentfile /*String*/ ).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 16;
RDebugUtils.currentLine=178192386;
 //BA.debugLineNum = 178192386;BA.debugLine="mnuSaveAs_Action";
__ref._mnusaveas_action /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=178192389;
 //BA.debugLineNum = 178192389;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnusave_action"), __ref._checkforwarnings /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 17;
return;
case 17:
//C
this.state = 6;
_camposok = (boolean) result[1];
;
RDebugUtils.currentLine=178192390;
 //BA.debugLineNum = 178192390;BA.debugLine="If CamposOK Then";
if (true) break;

case 6:
//if
this.state = 15;
if (_camposok) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=178192391;
 //BA.debugLineNum = 178192391;BA.debugLine="CurrentFileString = ExportToString";
__ref._currentfilestring /*String*/  = __ref._exporttostring /*String*/ (null);
RDebugUtils.currentLine=178192392;
 //BA.debugLineNum = 178192392;BA.debugLine="Dim DirJSON As String=File.GetFileParent(Curren";
_dirjson = parent.__c.File.GetFileParent(__ref._currentfile /*String*/ );
RDebugUtils.currentLine=178192393;
 //BA.debugLineNum = 178192393;BA.debugLine="Dim NombreJSON As String=File.GetName(CurrentFi";
_nombrejson = parent.__c.File.GetName(__ref._currentfile /*String*/ );
RDebugUtils.currentLine=178192396;
 //BA.debugLineNum = 178192396;BA.debugLine="Try";
if (true) break;

case 9:
//try
this.state = 14;
this.catchState = 13;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 14;
this.catchState = 13;
RDebugUtils.currentLine=178192397;
 //BA.debugLineNum = 178192397;BA.debugLine="File.WriteString(CurrentFile, \"\", CurrentFileS";
parent.__c.File.WriteString(__ref._currentfile /*String*/ ,"",__ref._currentfilestring /*String*/ );
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=178192404;
 //BA.debugLineNum = 178192404;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sid";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible grabar el fichero."+parent.__c.CRLF+parent.__c.CRLF+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=178192405;
 //BA.debugLineNum = 178192405;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnusave_action"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (int) result[1];
;
RDebugUtils.currentLine=178192406;
 //BA.debugLineNum = 178192406;BA.debugLine="Return";
if (true) return ;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
this.catchState = 0;
;
RDebugUtils.currentLine=178192408;
 //BA.debugLineNum = 178192408;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Fichero gr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Fichero grabado."+parent.__c.CRLF+parent.__c.CRLF+"("+__ref._currentfile /*String*/ +")","Aviso");
RDebugUtils.currentLine=178192409;
 //BA.debugLineNum = 178192409;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnusave_action"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 15;
_result = (int) result[1];
;
RDebugUtils.currentLine=178192414;
 //BA.debugLineNum = 178192414;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No olvides";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No olvides SINCRONIZAR la carpeta Files en el IDE","IMPORTANTE");
RDebugUtils.currentLine=178192415;
 //BA.debugLineNum = 178192415;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnusave_action"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 15;
_result = (int) result[1];
;
 if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=178192418;
 //BA.debugLineNum = 178192418;BA.debugLine="End Sub";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkforwarnings(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "checkforwarnings", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkforwarnings", null));}
ResumableSub_CheckForWarnings rsub = new ResumableSub_CheckForWarnings(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckForWarnings extends BA.ResumableSub {
public ResumableSub_CheckForWarnings(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4a.objects.collections.List _lstcampos = null;
anywheresoftware.b4a.objects.collections.List _lstaliascampos = null;
anywheresoftware.b4a.objects.collections.List _lstencabezados = null;
anywheresoftware.b4a.objects.collections.List _lstprimarykeys = null;
b4j.docU.b4xorderedmap _omprimarykeys = null;
int _i = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
String _nombrecampopk = "";
anywheresoftware.b4a.objects.collections.List _lstnombrescamposclvincluidosenformulascamposcalculados = null;
int step11;
int limit11;
anywheresoftware.b4a.BA.IterableList group75;
int index75;
int groupLen75;
int step86;
int limit86;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178257921;
 //BA.debugLineNum = 178257921;BA.debugLine="Dim lstCampos As List";
_lstcampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=178257922;
 //BA.debugLineNum = 178257922;BA.debugLine="lstCampos.Initialize";
_lstcampos.Initialize();
RDebugUtils.currentLine=178257923;
 //BA.debugLineNum = 178257923;BA.debugLine="Dim lstAliasCampos As List";
_lstaliascampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=178257924;
 //BA.debugLineNum = 178257924;BA.debugLine="lstAliasCampos.Initialize";
_lstaliascampos.Initialize();
RDebugUtils.currentLine=178257925;
 //BA.debugLineNum = 178257925;BA.debugLine="Dim lstEncabezados As List";
_lstencabezados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=178257926;
 //BA.debugLineNum = 178257926;BA.debugLine="lstEncabezados.Initialize";
_lstencabezados.Initialize();
RDebugUtils.currentLine=178257928;
 //BA.debugLineNum = 178257928;BA.debugLine="Dim lstPrimaryKeys As List";
_lstprimarykeys = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=178257929;
 //BA.debugLineNum = 178257929;BA.debugLine="lstPrimaryKeys.Initialize";
_lstprimarykeys.Initialize();
RDebugUtils.currentLine=178257932;
 //BA.debugLineNum = 178257932;BA.debugLine="Dim omPrimaryKeys As B4XOrderedMap";
_omprimarykeys = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=178257933;
 //BA.debugLineNum = 178257933;BA.debugLine="omPrimaryKeys.Initialize";
_omprimarykeys._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=178257937;
 //BA.debugLineNum = 178257937;BA.debugLine="For i = 0 To clvListaCampos.Size - 1";
if (true) break;

case 1:
//for
this.state = 48;
step11 = 1;
limit11 = (int) (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 77;
if (true) break;

case 77:
//C
this.state = 48;
if ((step11 > 0 && _i <= limit11) || (step11 < 0 && _i >= limit11)) this.state = 3;
if (true) break;

case 78:
//C
this.state = 77;
_i = ((int)(0 + _i + step11)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=178257939;
 //BA.debugLineNum = 178257939;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_i));
RDebugUtils.currentLine=178257941;
 //BA.debugLineNum = 178257941;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
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
RDebugUtils.currentLine=178257942;
 //BA.debugLineNum = 178257942;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo n";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El campo nº "+BA.NumberToString(_i)+" está en blanco. Es un dato obligatorio","Error!");
RDebugUtils.currentLine=178257943;
 //BA.debugLineNum = 178257943;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 79;
return;
case 79:
//C
this.state = 15;
_result = (int) result[1];
;
RDebugUtils.currentLine=178257944;
 //BA.debugLineNum = 178257944;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=178257946;
 //BA.debugLineNum = 178257946;BA.debugLine="If lstCampos.IndexOf(clvIV.cboCampo.Value)=-1 T";
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
RDebugUtils.currentLine=178257947;
 //BA.debugLineNum = 178257947;BA.debugLine="lstCampos.Add(clvIV.cboCampo.Value)";
_lstcampos.Add(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=178257950;
 //BA.debugLineNum = 178257950;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El campo nº "+BA.NumberToString(_i)+"("+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+") está repetido.","Error!");
RDebugUtils.currentLine=178257951;
 //BA.debugLineNum = 178257951;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 80;
return;
case 80:
//C
this.state = 14;
_result = (int) result[1];
;
RDebugUtils.currentLine=178257952;
 //BA.debugLineNum = 178257952;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;
;
RDebugUtils.currentLine=178257956;
 //BA.debugLineNum = 178257956;BA.debugLine="If clvIV.txtAliasCampo.text=\"\" Then";

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
RDebugUtils.currentLine=178257957;
 //BA.debugLineNum = 178257957;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El alias del campo nº "+BA.NumberToString(_i)+" está en blanco. Es un dato obligatorio","Error!");
RDebugUtils.currentLine=178257958;
 //BA.debugLineNum = 178257958;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 81;
return;
case 81:
//C
this.state = 26;
_result = (int) result[1];
;
RDebugUtils.currentLine=178257959;
 //BA.debugLineNum = 178257959;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=178257961;
 //BA.debugLineNum = 178257961;BA.debugLine="If lstAliasCampos.IndexOf(clvIV.txtAliasCampo.t";
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
RDebugUtils.currentLine=178257962;
 //BA.debugLineNum = 178257962;BA.debugLine="lstAliasCampos.Add(clvIV.txtAliasCampo.text)";
_lstaliascampos.Add((Object)(_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=178257964;
 //BA.debugLineNum = 178257964;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El alias del campo nº "+BA.NumberToString(_i)+"("+_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+") está repetido.","Error!");
RDebugUtils.currentLine=178257965;
 //BA.debugLineNum = 178257965;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 82;
return;
case 82:
//C
this.state = 25;
_result = (int) result[1];
;
RDebugUtils.currentLine=178257966;
 //BA.debugLineNum = 178257966;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;
;
RDebugUtils.currentLine=178257981;
 //BA.debugLineNum = 178257981;BA.debugLine="If clvIV.cboTipoDato.value=\"\" Then";

case 26:
//if
this.state = 29;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(""))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=178257982;
 //BA.debugLineNum = 178257982;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El tipo de dato de la columna nº "+BA.NumberToString(_i)+" está en blanco. Es un dato obligatorio.","Error!");
RDebugUtils.currentLine=178257983;
 //BA.debugLineNum = 178257983;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 83;
return;
case 83:
//C
this.state = 29;
_result = (int) result[1];
;
RDebugUtils.currentLine=178257984;
 //BA.debugLineNum = 178257984;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=178257999;
 //BA.debugLineNum = 178257999;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";

case 29:
//if
this.state = 32;
if (_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==parent.__c.True && (_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=178258000;
 //BA.debugLineNum = 178258000;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El alias d";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El alias de la columna nº "+BA.NumberToString(_i)+" está en blanco. Un campo calculado siempre debe tener un alias de campo.","Error!");
RDebugUtils.currentLine=178258001;
 //BA.debugLineNum = 178258001;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 84;
return;
case 84:
//C
this.state = 32;
_result = (int) result[1];
;
RDebugUtils.currentLine=178258002;
 //BA.debugLineNum = 178258002;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=178258005;
 //BA.debugLineNum = 178258005;BA.debugLine="If clvIV.chkBoxCampoCalculado.Checked=True And c";

case 32:
//if
this.state = 35;
if (_clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==parent.__c.True && _clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()==parent.__c.True) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=178258006;
 //BA.debugLineNum = 178258006;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Un campo calculado no puede ser clave primaria de la tabla.","Error!");
RDebugUtils.currentLine=178258007;
 //BA.debugLineNum = 178258007;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 85;
return;
case 85:
//C
this.state = 35;
_result = (int) result[1];
;
RDebugUtils.currentLine=178258008;
 //BA.debugLineNum = 178258008;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=178258022;
 //BA.debugLineNum = 178258022;BA.debugLine="If clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV.";

case 35:
//if
this.state = 38;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(__ref._tipocontrolfiltro_checkbox /*String*/ ))) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=178258023;
 //BA.debugLineNum = 178258023;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo co";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El tipo control de filtro "+__ref._tipocontrolfiltro_checkbox /*String*/ +" sólo es compatible con tipo de datos INTEGER .","Error!");
RDebugUtils.currentLine=178258024;
 //BA.debugLineNum = 178258024;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 86;
return;
case 86:
//C
this.state = 38;
_result = (int) result[1];
;
RDebugUtils.currentLine=178258025;
 //BA.debugLineNum = 178258025;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=178258029;
 //BA.debugLineNum = 178258029;BA.debugLine="If clvIV.cboTipoDato.Value<>\"REAL\" And clvIV.cbo";

case 38:
//if
this.state = 41;
if ((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("REAL")) == false && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && _clviv.chkBoxEsFecha /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=178258030;
 //BA.debugLineNum = 178258030;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Un campo tipo fecha sólo es compatible con tipo de datos REAL o INTEGER.","Error!");
RDebugUtils.currentLine=178258031;
 //BA.debugLineNum = 178258031;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 41;
_result = (int) result[1];
;
RDebugUtils.currentLine=178258032;
 //BA.debugLineNum = 178258032;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=178258036;
 //BA.debugLineNum = 178258036;BA.debugLine="If (clvIV.cboTipoDato.Value<>\"INTEGER\" And clvIV";

case 41:
//if
this.state = 44;
if (((_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("INTEGER")) == false && (_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("TEXT")) == false) && _clviv.chkBoxEsBooleano /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=178258037;
 //BA.debugLineNum = 178258037;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo t";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Un campo tipo booleano sólo es compatible con tipos de datos INTEGER y TEXT ."+parent.__c.CRLF+"("+_clviv.txtAliasCampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()+")","Error!");
RDebugUtils.currentLine=178258038;
 //BA.debugLineNum = 178258038;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 88;
return;
case 88:
//C
this.state = 44;
_result = (int) result[1];
;
RDebugUtils.currentLine=178258039;
 //BA.debugLineNum = 178258039;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=178258044;
 //BA.debugLineNum = 178258044;BA.debugLine="If clvIV.chkboxKeyID.Checked Then";

case 44:
//if
this.state = 47;
if (_clviv.chkboxKeyID /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=178258045;
 //BA.debugLineNum = 178258045;BA.debugLine="omPrimaryKeys.Put(clvIV.lblOrdenKeyID.Text,clvI";
_omprimarykeys._put /*String*/ (null,(Object)(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()),_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
 if (true) break;

case 47:
//C
this.state = 78;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=178258074;
 //BA.debugLineNum = 178258074;BA.debugLine="If omPrimaryKeys.Size>0 Then";

case 48:
//if
this.state = 55;
if (_omprimarykeys._getsize /*int*/ (null)>0) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=178258075;
 //BA.debugLineNum = 178258075;BA.debugLine="omPrimaryKeys.Keys.Sort(True)";
_omprimarykeys._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(parent.__c.True);
RDebugUtils.currentLine=178258076;
 //BA.debugLineNum = 178258076;BA.debugLine="For Each NombreCampoPK As String In omPrimaryKey";
if (true) break;

case 51:
//for
this.state = 54;
group75 = _omprimarykeys._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
index75 = 0;
groupLen75 = group75.getSize();
this.state = 89;
if (true) break;

case 89:
//C
this.state = 54;
if (index75 < groupLen75) {
this.state = 53;
_nombrecampopk = BA.ObjectToString(group75.Get(index75));}
if (true) break;

case 90:
//C
this.state = 89;
index75++;
if (true) break;

case 53:
//C
this.state = 90;
RDebugUtils.currentLine=178258077;
 //BA.debugLineNum = 178258077;BA.debugLine="lstPrimaryKeys.Add(NombreCampoPK)";
_lstprimarykeys.Add((Object)(_nombrecampopk));
 if (true) break;
if (true) break;

case 54:
//C
this.state = 55;
;
 if (true) break;
;
RDebugUtils.currentLine=178258081;
 //BA.debugLineNum = 178258081;BA.debugLine="If lstPrimaryKeys.Size=0 Then";

case 55:
//if
this.state = 64;
if (_lstprimarykeys.getSize()==0) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=178258088;
 //BA.debugLineNum = 178258088;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"No hay nin";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"No hay ningún campo definido como clave primaria"+parent.__c.CRLF+parent.__c.CRLF+"La tabla será de tipo ReadOnly (SIN control por medio de la clase. Controlar via código)."+parent.__c.CRLF+parent.__c.CRLF+"¿Continuar?","No hay clave primaria definida","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=178258089;
 //BA.debugLineNum = 178258089;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 91;
return;
case 91:
//C
this.state = 58;
_result = (int) result[1];
;
RDebugUtils.currentLine=178258090;
 //BA.debugLineNum = 178258090;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Re";
if (true) break;

case 58:
//if
this.state = 63;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 63:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
RDebugUtils.currentLine=178258122;
 //BA.debugLineNum = 178258122;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
_lstnombrescamposclvincluidosenformulascamposcalculados = new anywheresoftware.b4a.objects.collections.List();
_lstnombrescamposclvincluidosenformulascamposcalculados = __ref._nombrescamposclvincluidosenformulascamposcalculados /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=178258123;
 //BA.debugLineNum = 178258123;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCamposCa";
if (true) break;

case 65:
//if
this.state = 76;
if (_lstnombrescamposclvincluidosenformulascamposcalculados.getSize()>0) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=178258124;
 //BA.debugLineNum = 178258124;BA.debugLine="For i=0 To lstNombresCamposCLVIncluidosEnFormula";
if (true) break;

case 68:
//for
this.state = 75;
step86 = 1;
limit86 = (int) (_lstnombrescamposclvincluidosenformulascamposcalculados.getSize()-1);
_i = (int) (0) ;
this.state = 92;
if (true) break;

case 92:
//C
this.state = 75;
if ((step86 > 0 && _i <= limit86) || (step86 < 0 && _i >= limit86)) this.state = 70;
if (true) break;

case 93:
//C
this.state = 92;
_i = ((int)(0 + _i + step86)) ;
if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=178258126;
 //BA.debugLineNum = 178258126;BA.debugLine="If lstAliasCampos.IndexOf(lstNombresCamposCLVIn";
if (true) break;

case 71:
//if
this.state = 74;
if (_lstaliascampos.IndexOf(_lstnombrescamposclvincluidosenformulascamposcalculados.Get(_i))==-1) { 
this.state = 73;
}if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=178258128;
 //BA.debugLineNum = 178258128;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El campo "+BA.ObjectToString(_lstnombrescamposclvincluidosenformulascamposcalculados.Get(_i))+" está incluido en un campo calculado, pero no está en los alias de campos definidos.","Error!");
RDebugUtils.currentLine=178258129;
 //BA.debugLineNum = 178258129;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "checkforwarnings"), _msa);
this.state = 94;
return;
case 94:
//C
this.state = 74;
_result = (int) result[1];
;
RDebugUtils.currentLine=178258130;
 //BA.debugLineNum = 178258130;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 74:
//C
this.state = 93;
;
 if (true) break;
if (true) break;

case 75:
//C
this.state = 76;
;
 if (true) break;

case 76:
//C
this.state = -1;
;
RDebugUtils.currentLine=178258141;
 //BA.debugLineNum = 178258141;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=178258142;
 //BA.debugLineNum = 178258142;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.collections.List  _nombrescamposclvincluidosenformulascamposcalculados(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
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
RDebugUtils.currentLine=178061312;
 //BA.debugLineNum = 178061312;BA.debugLine="private Sub NombresCamposCLVIncluidosEnFormulasCam";
RDebugUtils.currentLine=178061313;
 //BA.debugLineNum = 178061313;BA.debugLine="Dim lstNombresCamposCLVIncluidosEnFormulasCamposC";
_lstnombrescamposclvincluidosenformulascamposcalculados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=178061314;
 //BA.debugLineNum = 178061314;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposCalcu";
_lstnombrescamposclvincluidosenformulascamposcalculados.Initialize();
RDebugUtils.currentLine=178061315;
 //BA.debugLineNum = 178061315;BA.debugLine="Dim lstCamposEnCLV As List=CargaCamposCLV";
_lstcamposenclv = new anywheresoftware.b4a.objects.collections.List();
_lstcamposenclv = __ref._cargacamposclv /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=178061316;
 //BA.debugLineNum = 178061316;BA.debugLine="For i=0 To lstCamposEnCLV.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_lstcamposenclv.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=178061317;
 //BA.debugLineNum = 178061317;BA.debugLine="Dim m As Map=lstCamposEnCLV.Get(i)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstcamposenclv.Get(_i)));
RDebugUtils.currentLine=178061318;
 //BA.debugLineNum = 178061318;BA.debugLine="If True=m.Get(\"CampoCalculado\") Then";
if (__c.True==BA.ObjectToBoolean(_m.Get((Object)("CampoCalculado")))) { 
RDebugUtils.currentLine=178061319;
 //BA.debugLineNum = 178061319;BA.debugLine="Dim FormulaCampoCalculado As String=m.Get(\"Camp";
_formulacampocalculado = BA.ObjectToString(_m.Get((Object)("Campo")));
RDebugUtils.currentLine=178061320;
 //BA.debugLineNum = 178061320;BA.debugLine="Dim lstNombresCamposIncluidosEnFormula As List";
_lstnombrescamposincluidosenformula = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=178061321;
 //BA.debugLineNum = 178061321;BA.debugLine="lstNombresCamposIncluidosEnFormula.Initialize";
_lstnombrescamposincluidosenformula.Initialize();
RDebugUtils.currentLine=178061322;
 //BA.debugLineNum = 178061322;BA.debugLine="Dim pattern As String";
_pattern = "";
RDebugUtils.currentLine=178061323;
 //BA.debugLineNum = 178061323;BA.debugLine="pattern = \"\\[(.*?)\\]\"  ' texto entre brackets";
_pattern = "\\[(.*?)\\]";
RDebugUtils.currentLine=178061324;
 //BA.debugLineNum = 178061324;BA.debugLine="Dim Matcher1 As Matcher";
_matcher1 = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=178061325;
 //BA.debugLineNum = 178061325;BA.debugLine="Matcher1 = Regex.Matcher(pattern, FormulaCampoC";
_matcher1 = __c.Regex.Matcher(_pattern,_formulacampocalculado);
RDebugUtils.currentLine=178061326;
 //BA.debugLineNum = 178061326;BA.debugLine="Do While Matcher1.Find";
while (_matcher1.Find()) {
RDebugUtils.currentLine=178061327;
 //BA.debugLineNum = 178061327;BA.debugLine="Log(\"Found: \" & Matcher1.Match)";
__c.LogImpl("9178061327","Found: "+_matcher1.getMatch(),0);
RDebugUtils.currentLine=178061329;
 //BA.debugLineNum = 178061329;BA.debugLine="lstNombresCamposIncluidosEnFormula.Add(Matcher";
_lstnombrescamposincluidosenformula.Add((Object)(_matcher1.getMatch().replace("[","").replace("]","")));
 }
;
RDebugUtils.currentLine=178061332;
 //BA.debugLineNum = 178061332;BA.debugLine="For k=0 To lstNombresCamposIncluidosEnFormula.S";
{
final int step18 = 1;
final int limit18 = (int) (_lstnombrescamposincluidosenformula.getSize()-1);
_k = (int) (0) ;
for (;_k <= limit18 ;_k = _k + step18 ) {
RDebugUtils.currentLine=178061333;
 //BA.debugLineNum = 178061333;BA.debugLine="If lstNombresCamposCLVIncluidosEnFormulasCampo";
if (_lstnombrescamposclvincluidosenformulascamposcalculados.IndexOf(_lstnombrescamposincluidosenformula.Get(_k))==-1) { 
RDebugUtils.currentLine=178061334;
 //BA.debugLineNum = 178061334;BA.debugLine="lstNombresCamposCLVIncluidosEnFormulasCamposC";
_lstnombrescamposclvincluidosenformulascamposcalculados.Add(_lstnombrescamposincluidosenformula.Get(_k));
 };
 }
};
 };
 }
};
RDebugUtils.currentLine=178061339;
 //BA.debugLineNum = 178061339;BA.debugLine="Return lstNombresCamposCLVIncluidosEnFormulasCamp";
if (true) return _lstnombrescamposclvincluidosenformulascamposcalculados;
RDebugUtils.currentLine=178061340;
 //BA.debugLineNum = 178061340;BA.debugLine="End Sub";
return null;
}
public String  _chkboxcampocalculado_checkedchange(b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxcampocalculado_checkedchange", true))
	 {return ((String) Debug.delegate(ba, "chkboxcampocalculado_checkedchange", new Object[] {_checked}));}
RDebugUtils.currentLine=178716672;
 //BA.debugLineNum = 178716672;BA.debugLine="private Sub chkBoxCampoCalculado_CheckedChange(Che";
RDebugUtils.currentLine=178716673;
 //BA.debugLineNum = 178716673;BA.debugLine="If CargandoDatos Then Return";
if (__ref._cargandodatos /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=178716686;
 //BA.debugLineNum = 178716686;BA.debugLine="End Sub";
return "";
}
public String  _chkboxconvalordefecto_checkedchange(b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxconvalordefecto_checkedchange", true))
	 {return ((String) Debug.delegate(ba, "chkboxconvalordefecto_checkedchange", new Object[] {_checked}));}
anywheresoftware.b4j.objects.CheckboxWrapper _chkvf = null;
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvf = null;
RDebugUtils.currentLine=179568640;
 //BA.debugLineNum = 179568640;BA.debugLine="Private Sub chkBoxConValorDefecto_CheckedChange(Ch";
RDebugUtils.currentLine=179568641;
 //BA.debugLineNum = 179568641;BA.debugLine="If CargandoDatos Then Return";
if (__ref._cargandodatos /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=179568642;
 //BA.debugLineNum = 179568642;BA.debugLine="Dim chkVF As CheckBox=Sender";
_chkvf = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkvf = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=179568643;
 //BA.debugLineNum = 179568643;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkvf.getObject())));
RDebugUtils.currentLine=179568644;
 //BA.debugLineNum = 179568644;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=179568645;
 //BA.debugLineNum = 179568645;BA.debugLine="Dim txtVF As TextField=clvIV.txtValorDefecto";
_txtvf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_txtvf = _clviv.txtValorDefecto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=179568646;
 //BA.debugLineNum = 179568646;BA.debugLine="txtVF.Visible= chkVF.Checked";
_txtvf.setVisible(_chkvf.getChecked());
RDebugUtils.currentLine=179568647;
 //BA.debugLineNum = 179568647;BA.debugLine="If chkVF.Checked=False Then txtVF.Text=\"\"";
if (_chkvf.getChecked()==__c.False) { 
_txtvf.setText("");};
RDebugUtils.currentLine=179568648;
 //BA.debugLineNum = 179568648;BA.debugLine="End Sub";
return "";
}
public void  _chkboxesbooleano_checkedchange(b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxesbooleano_checkedchange", true))
	 {Debug.delegate(ba, "chkboxesbooleano_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkBoxEsBooleano_CheckedChange rsub = new ResumableSub_chkBoxEsBooleano_CheckedChange(this,__ref,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkBoxEsBooleano_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsBooleano_CheckedChange(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) {
this.parent = parent;
this.__ref = __ref;
this._checked = _checked;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkesb = null;
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtesb = null;
anywheresoftware.b4j.objects.ComboBoxWrapper _cbotd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178520065;
 //BA.debugLineNum = 178520065;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._cargandodatos /*boolean*/ ) { 
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
RDebugUtils.currentLine=178520067;
 //BA.debugLineNum = 178520067;BA.debugLine="If CorrigiendoChkBoxEsBooleano Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._corrigiendochkboxesbooleano /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=178520068;
 //BA.debugLineNum = 178520068;BA.debugLine="CorrigiendoChkBoxEsBooleano=False";
__ref._corrigiendochkboxesbooleano /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=178520069;
 //BA.debugLineNum = 178520069;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=178520072;
 //BA.debugLineNum = 178520072;BA.debugLine="Dim chkEsB As CheckBox=Sender";
_chkesb = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkesb = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=178520073;
 //BA.debugLineNum = 178520073;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkesb.getObject())));
RDebugUtils.currentLine=178520074;
 //BA.debugLineNum = 178520074;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=178520075;
 //BA.debugLineNum = 178520075;BA.debugLine="If Checked And (clvIV.cboTipoDato.Value<>\"INTEGER";
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
RDebugUtils.currentLine=178520076;
 //BA.debugLineNum = 178520076;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo bo";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Un campo booleano sólo puede corresponder a tipos de datos TEXT o INTEGER.","");
RDebugUtils.currentLine=178520077;
 //BA.debugLineNum = 178520077;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 14;
_result = (int) result[1];
;
RDebugUtils.currentLine=178520078;
 //BA.debugLineNum = 178520078;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
__ref._corrigiendochkboxesbooleano /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=178520079;
 //BA.debugLineNum = 178520079;BA.debugLine="chkEsB.Checked=False";
_chkesb.setChecked(parent.__c.False);
 if (true) break;
;
RDebugUtils.currentLine=178520082;
 //BA.debugLineNum = 178520082;BA.debugLine="If Checked And (clvIV.cboTipoControlFiltro.Value<";

case 14:
//if
this.state = 17;
if (_checked && ((_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(__ref._tipocontrolfiltro_checkbox /*String*/ )) == false && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)("")) == false)) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=178520083;
 //BA.debugLineNum = 178520083;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El tipo de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El tipo de control de filtro para un campo tipo Booleano tiene que ser "+__ref._tipocontrolfiltro_checkbox /*String*/ +" o estar en blanco (si no se quiere filtrar por este campo)."+parent.__c.CRLF+"Si es necesario, deja el tipo de control filtro en blanco.","");
RDebugUtils.currentLine=178520084;
 //BA.debugLineNum = 178520084;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "chkboxesbooleano_checkedchange"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 17;
_result = (int) result[1];
;
RDebugUtils.currentLine=178520085;
 //BA.debugLineNum = 178520085;BA.debugLine="CorrigiendoChkBoxEsBooleano=True";
__ref._corrigiendochkboxesbooleano /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=178520086;
 //BA.debugLineNum = 178520086;BA.debugLine="chkEsB.Checked=False";
_chkesb.setChecked(parent.__c.False);
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=178520089;
 //BA.debugLineNum = 178520089;BA.debugLine="Dim txtEsB As TextField=clvIV.txtValorTrueCampoBo";
_txtesb = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_txtesb = _clviv.txtValorTrueCampoBooleano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ;
RDebugUtils.currentLine=178520090;
 //BA.debugLineNum = 178520090;BA.debugLine="If chkEsB.Checked=False Then txtEsB.Text=\"\"";
if (true) break;

case 18:
//if
this.state = 23;
if (_chkesb.getChecked()==parent.__c.False) { 
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
RDebugUtils.currentLine=178520091;
 //BA.debugLineNum = 178520091;BA.debugLine="If chkEsB.Checked Then";
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
RDebugUtils.currentLine=178520092;
 //BA.debugLineNum = 178520092;BA.debugLine="Dim cboTD As ComboBox=clvIV.cboTipoDato";
_cbotd = new anywheresoftware.b4j.objects.ComboBoxWrapper();
_cbotd = _clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ ;
RDebugUtils.currentLine=178520093;
 //BA.debugLineNum = 178520093;BA.debugLine="If cboTD.Value=\"TEXT\" Then";
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
RDebugUtils.currentLine=178520094;
 //BA.debugLineNum = 178520094;BA.debugLine="txtEsB.Text=\"\"";
_txtesb.setText("");
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=178520096;
 //BA.debugLineNum = 178520096;BA.debugLine="txtEsB.Text=1";
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
RDebugUtils.currentLine=178520099;
 //BA.debugLineNum = 178520099;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _chkboxesfecha_checkedchange(b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxesfecha_checkedchange", true))
	 {Debug.delegate(ba, "chkboxesfecha_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkBoxEsFecha_CheckedChange rsub = new ResumableSub_chkBoxEsFecha_CheckedChange(this,__ref,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkBoxEsFecha_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkBoxEsFecha_CheckedChange(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) {
this.parent = parent;
this.__ref = __ref;
this._checked = _checked;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkesf = null;
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178454529;
 //BA.debugLineNum = 178454529;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._cargandodatos /*boolean*/ ) { 
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
RDebugUtils.currentLine=178454531;
 //BA.debugLineNum = 178454531;BA.debugLine="If CorrigiendoChkBoxEsFecha Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._corrigiendochkboxesfecha /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=178454532;
 //BA.debugLineNum = 178454532;BA.debugLine="CorrigiendoChkBoxEsFecha=False";
__ref._corrigiendochkboxesfecha /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=178454533;
 //BA.debugLineNum = 178454533;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=178454536;
 //BA.debugLineNum = 178454536;BA.debugLine="Dim chkEsF As CheckBox=Sender";
_chkesf = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkesf = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=178454537;
 //BA.debugLineNum = 178454537;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkesf.getObject())));
RDebugUtils.currentLine=178454538;
 //BA.debugLineNum = 178454538;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=178454539;
 //BA.debugLineNum = 178454539;BA.debugLine="If Checked And clvIV.cboTipoDato.Value<>\"REAL\" An";
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
RDebugUtils.currentLine=178454540;
 //BA.debugLineNum = 178454540;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un tipo de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Un tipo de dato="+BA.ObjectToString(_clviv.cboTipoDato /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+" no puede ser una fecha.","");
RDebugUtils.currentLine=178454541;
 //BA.debugLineNum = 178454541;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (int) result[1];
;
RDebugUtils.currentLine=178454542;
 //BA.debugLineNum = 178454542;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
__ref._corrigiendochkboxesfecha /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=178454543;
 //BA.debugLineNum = 178454543;BA.debugLine="chkEsF.Checked=False";
_chkesf.setChecked(parent.__c.False);
 if (true) break;
;
RDebugUtils.currentLine=178454546;
 //BA.debugLineNum = 178454546;BA.debugLine="If Checked=False And clvIV.cboTipoControlFiltro.V";

case 14:
//if
this.state = 17;
if (_checked==parent.__c.False && (_clviv.cboTipoControlFiltro /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()).equals((Object)(__ref._tipocontrolfiltro_textfieldbutton /*String*/ ))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=178454547;
 //BA.debugLineNum = 178454547;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Si el tipo";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Si el tipo de control filtro es = "+__ref._tipocontrolfiltro_textfieldbutton /*String*/ +" , el campo tiene que ser tipo fecha. Si no lo es, deja primero el tipo control filtro en blanco.","");
RDebugUtils.currentLine=178454548;
 //BA.debugLineNum = 178454548;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "chkboxesfecha_checkedchange"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 17;
_result = (int) result[1];
;
RDebugUtils.currentLine=178454549;
 //BA.debugLineNum = 178454549;BA.debugLine="CorrigiendoChkBoxEsFecha=True";
__ref._corrigiendochkboxesfecha /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=178454550;
 //BA.debugLineNum = 178454550;BA.debugLine="chkEsF.Checked=True";
_chkesf.setChecked(parent.__c.True);
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=178454552;
 //BA.debugLineNum = 178454552;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _chkboxkeyid_checkedchange(b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "chkboxkeyid_checkedchange", true))
	 {Debug.delegate(ba, "chkboxkeyid_checkedchange", new Object[] {_checked}); return;}
ResumableSub_chkboxKeyID_CheckedChange rsub = new ResumableSub_chkboxKeyID_CheckedChange(this,__ref,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkboxKeyID_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkboxKeyID_CheckedChange(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,boolean _checked) {
this.parent = parent;
this.__ref = __ref;
this._checked = _checked;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _checked;
anywheresoftware.b4j.objects.CheckboxWrapper _chkkid = null;
int _index = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
Object _msa = null;
int _result = 0;
String _nombrecampokeyeliminada = "";
int _keyideliminada = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178585601;
 //BA.debugLineNum = 178585601;BA.debugLine="If CargandoDatos Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._cargandodatos /*boolean*/ ) { 
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
RDebugUtils.currentLine=178585603;
 //BA.debugLineNum = 178585603;BA.debugLine="If CorrigiendoChkBoxKeyID Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._corrigiendochkboxkeyid /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=178585604;
 //BA.debugLineNum = 178585604;BA.debugLine="CorrigiendoChkBoxKeyID=False";
__ref._corrigiendochkboxkeyid /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=178585605;
 //BA.debugLineNum = 178585605;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=178585608;
 //BA.debugLineNum = 178585608;BA.debugLine="Dim chkKID As CheckBox=Sender";
_chkkid = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chkkid = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=178585609;
 //BA.debugLineNum = 178585609;BA.debugLine="Dim index As Int=clvListaCampos.GetItemFromView(c";
_index = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chkkid.getObject())));
RDebugUtils.currentLine=178585610;
 //BA.debugLineNum = 178585610;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValue";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_index));
RDebugUtils.currentLine=178585611;
 //BA.debugLineNum = 178585611;BA.debugLine="If Checked Then";
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
RDebugUtils.currentLine=178585612;
 //BA.debugLineNum = 178585612;BA.debugLine="If clvIV.cboCampo.Value=\"\" Then";
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
RDebugUtils.currentLine=178585613;
 //BA.debugLineNum = 178585613;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El nombre";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El nombre del campo no puede estar vacío.","");
RDebugUtils.currentLine=178585614;
 //BA.debugLineNum = 178585614;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 17;
_result = (int) result[1];
;
RDebugUtils.currentLine=178585615;
 //BA.debugLineNum = 178585615;BA.debugLine="CorrigiendoChkBoxKeyID=True";
__ref._corrigiendochkboxkeyid /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=178585616;
 //BA.debugLineNum = 178585616;BA.debugLine="chkKID.Checked=False";
_chkkid.setChecked(parent.__c.False);
RDebugUtils.currentLine=178585617;
 //BA.debugLineNum = 178585617;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=178585620;
 //BA.debugLineNum = 178585620;BA.debugLine="If Checked And clvIV.chkBoxCampoCalculado.Checke";

case 17:
//if
this.state = 20;
if (_checked && _clviv.chkBoxCampoCalculado /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getChecked()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=178585621;
 //BA.debugLineNum = 178585621;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Un campo c";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Un campo calculado no puede pertenecer a la clave principal.","");
RDebugUtils.currentLine=178585622;
 //BA.debugLineNum = 178585622;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 20;
_result = (int) result[1];
;
RDebugUtils.currentLine=178585623;
 //BA.debugLineNum = 178585623;BA.debugLine="CorrigiendoChkBoxKeyID=True";
__ref._corrigiendochkboxkeyid /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=178585624;
 //BA.debugLineNum = 178585624;BA.debugLine="chkKID.Checked=False";
_chkkid.setChecked(parent.__c.False);
RDebugUtils.currentLine=178585625;
 //BA.debugLineNum = 178585625;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=178585629;
 //BA.debugLineNum = 178585629;BA.debugLine="If lstPrimaryKey.IndexOf(clvIV.cboCampo.Value)>-";

case 20:
//if
this.state = 25;
if (__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())>-1) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=178585630;
 //BA.debugLineNum = 178585630;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El campo \"";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El campo "+BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())+" ya pertenece a la clave principal.","");
RDebugUtils.currentLine=178585631;
 //BA.debugLineNum = 178585631;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "chkboxkeyid_checkedchange"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 25;
_result = (int) result[1];
;
RDebugUtils.currentLine=178585632;
 //BA.debugLineNum = 178585632;BA.debugLine="CorrigiendoChkBoxKeyID=True";
__ref._corrigiendochkboxkeyid /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=178585633;
 //BA.debugLineNum = 178585633;BA.debugLine="chkKID.Checked=False";
_chkkid.setChecked(parent.__c.False);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=178585635;
 //BA.debugLineNum = 178585635;BA.debugLine="lstPrimaryKey.Add(clvIV.cboCampo.Value)";
__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .Add(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=178585636;
 //BA.debugLineNum = 178585636;BA.debugLine="clvIV.lblOrdenKeyID.Text=lstPrimaryKey.Size";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .getSize()));
 if (true) break;

case 25:
//C
this.state = 28;
;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=178585640;
 //BA.debugLineNum = 178585640;BA.debugLine="Dim NombreCampoKeyEliminada As String=clvIV.cboC";
_nombrecampokeyeliminada = BA.ObjectToString(_clviv.cboCampo /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
RDebugUtils.currentLine=178585641;
 //BA.debugLineNum = 178585641;BA.debugLine="lstPrimaryKey.RemoveAt(lstPrimaryKey.IndexOf(Nom";
__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_nombrecampokeyeliminada)));
RDebugUtils.currentLine=178585642;
 //BA.debugLineNum = 178585642;BA.debugLine="Dim KeyIDEliminada As Int=clvIV.lblOrdenKeyID.Te";
_keyideliminada = (int)(Double.parseDouble(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=178585643;
 //BA.debugLineNum = 178585643;BA.debugLine="clvIV.lblOrdenKeyID.Text=0";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString(0));
RDebugUtils.currentLine=178585644;
 //BA.debugLineNum = 178585644;BA.debugLine="RecalcularOrdenKeyID(KeyIDEliminada)";
__ref._recalcularordenkeyid /*String*/ (null,_keyideliminada);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=178585647;
 //BA.debugLineNum = 178585647;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _recalcularordenkeyid(b4j.docU.jamtableclvcamposbuilder __ref,int _keyideliminada) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "recalcularordenkeyid", true))
	 {return ((String) Debug.delegate(ba, "recalcularordenkeyid", new Object[] {_keyideliminada}));}
int _i = 0;
b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue _clviv = null;
int _keyidlineaclv = 0;
RDebugUtils.currentLine=178978816;
 //BA.debugLineNum = 178978816;BA.debugLine="private Sub RecalcularOrdenKeyID(KeyIDEliminada As";
RDebugUtils.currentLine=178978817;
 //BA.debugLineNum = 178978817;BA.debugLine="For i=0 To clvListaCampos.Size-1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._clvlistacampos /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=178978818;
 //BA.debugLineNum = 178978818;BA.debugLine="Dim clvIV As clvJamTableCVLCamposBuilderItemValu";
_clviv = (b4j.docU.jamtableclvcamposbuilder._clvjamtablecvlcamposbuilderitemvalue)(__ref._clvlistacampos /*b4j.example.customlistview*/ ._getvalue(_i));
RDebugUtils.currentLine=178978819;
 //BA.debugLineNum = 178978819;BA.debugLine="Dim KeyIDLineaCLV As Int=clvIV.lblOrdenKeyID.Tex";
_keyidlineaclv = (int)(Double.parseDouble(_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .getText()));
RDebugUtils.currentLine=178978820;
 //BA.debugLineNum = 178978820;BA.debugLine="If KeyIDLineaCLV>KeyIDEliminada Then";
if (_keyidlineaclv>_keyideliminada) { 
RDebugUtils.currentLine=178978821;
 //BA.debugLineNum = 178978821;BA.debugLine="clvIV.lblOrdenKeyID.Text=(KeyIDLineaCLV-1)";
_clviv.lblOrdenKeyID /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(BA.NumberToString((_keyidlineaclv-1)));
 };
 }
};
RDebugUtils.currentLine=178978824;
 //BA.debugLineNum = 178978824;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
RDebugUtils.currentLine=175964160;
 //BA.debugLineNum = 175964160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=175964161;
 //BA.debugLineNum = 175964161;BA.debugLine="Private version As Float = 0.01";
_version = (float) (0.01);
RDebugUtils.currentLine=175964163;
 //BA.debugLineNum = 175964163;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=175964167;
 //BA.debugLineNum = 175964167;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=175964168;
 //BA.debugLineNum = 175964168;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=175964169;
 //BA.debugLineNum = 175964169;BA.debugLine="Private clvListaCampos As CustomListView";
_clvlistacampos = new b4j.example.customlistview();
RDebugUtils.currentLine=175964170;
 //BA.debugLineNum = 175964170;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=175964171;
 //BA.debugLineNum = 175964171;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=175964172;
 //BA.debugLineNum = 175964172;BA.debugLine="Private dragger As jamTableCLVCLVDragger";
_dragger = new b4j.docU.jamtableclvclvdragger();
RDebugUtils.currentLine=175964173;
 //BA.debugLineNum = 175964173;BA.debugLine="Private FileChooser As FileChooser";
_filechooser = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=175964174;
 //BA.debugLineNum = 175964174;BA.debugLine="Private CurrentFile As String";
_currentfile = "";
RDebugUtils.currentLine=175964175;
 //BA.debugLineNum = 175964175;BA.debugLine="Private CurrentFileString As String";
_currentfilestring = "";
RDebugUtils.currentLine=175964178;
 //BA.debugLineNum = 175964178;BA.debugLine="Private MenuBar1 As MenuBar";
_menubar1 = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
RDebugUtils.currentLine=175964180;
 //BA.debugLineNum = 175964180;BA.debugLine="Private cmbTheme As ComboBox";
_cmbtheme = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=175964182;
 //BA.debugLineNum = 175964182;BA.debugLine="Private txtID As TextField";
_txtid = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964183;
 //BA.debugLineNum = 175964183;BA.debugLine="Private cboCampo As ComboBox";
_cbocampo = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=175964184;
 //BA.debugLineNum = 175964184;BA.debugLine="Private txtAliasCampo As TextField";
_txtaliascampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964185;
 //BA.debugLineNum = 175964185;BA.debugLine="Private cboTipoDato As ComboBox";
_cbotipodato = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=175964187;
 //BA.debugLineNum = 175964187;BA.debugLine="Private chkBoxEsFecha As CheckBox";
_chkboxesfecha = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=175964188;
 //BA.debugLineNum = 175964188;BA.debugLine="Private chkBoxCampoCalculado As CheckBox";
_chkboxcampocalculado = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=175964193;
 //BA.debugLineNum = 175964193;BA.debugLine="Private cboTipoControlFiltro As ComboBox";
_cbotipocontrolfiltro = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=175964194;
 //BA.debugLineNum = 175964194;BA.debugLine="Private chkboxKeyID As CheckBox";
_chkboxkeyid = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=175964195;
 //BA.debugLineNum = 175964195;BA.debugLine="Private lblOrdenKeyID As Label";
_lblordenkeyid = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964196;
 //BA.debugLineNum = 175964196;BA.debugLine="Private chkBoxNoNulo As CheckBox";
_chkboxnonulo = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=175964197;
 //BA.debugLineNum = 175964197;BA.debugLine="Private chkBoxConValorDefecto As CheckBox";
_chkboxconvalordefecto = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=175964198;
 //BA.debugLineNum = 175964198;BA.debugLine="Private txtValorDefecto As TextField";
_txtvalordefecto = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964205;
 //BA.debugLineNum = 175964205;BA.debugLine="Private chkBoxEsBooleano As CheckBox";
_chkboxesbooleano = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=175964206;
 //BA.debugLineNum = 175964206;BA.debugLine="Private txtValorTrueCampoBooleano As TextField";
_txtvalortruecampobooleano = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964217;
 //BA.debugLineNum = 175964217;BA.debugLine="Type clvJamTableCVLCamposBuilderItemValue(txtID A";
;
RDebugUtils.currentLine=175964223;
 //BA.debugLineNum = 175964223;BA.debugLine="Type TipoOrigenDatosJamTableCLV (TipoOrigenDatos";
;
RDebugUtils.currentLine=175964225;
 //BA.debugLineNum = 175964225;BA.debugLine="Public TipoControlFiltro_TextField, TipoControlFi";
_tipocontrolfiltro_textfield = "";
_tipocontrolfiltro_combobox = "";
_tipocontrolfiltro_checkbox = "";
_tipocontrolfiltro_textfieldbutton = "";
RDebugUtils.currentLine=175964226;
 //BA.debugLineNum = 175964226;BA.debugLine="TipoControlFiltro_TextField = \"TextField\"";
__ref._tipocontrolfiltro_textfield /*String*/  = "TextField";
RDebugUtils.currentLine=175964227;
 //BA.debugLineNum = 175964227;BA.debugLine="TipoControlFiltro_ComboBox = \"ComboBox\"";
__ref._tipocontrolfiltro_combobox /*String*/  = "ComboBox";
RDebugUtils.currentLine=175964228;
 //BA.debugLineNum = 175964228;BA.debugLine="TipoControlFiltro_CheckBox = \"CheckBox\"";
__ref._tipocontrolfiltro_checkbox /*String*/  = "CheckBox";
RDebugUtils.currentLine=175964229;
 //BA.debugLineNum = 175964229;BA.debugLine="TipoControlFiltro_TextFieldButton = \"TextFieldBtn";
__ref._tipocontrolfiltro_textfieldbutton /*String*/  = "TextFieldBtn";
RDebugUtils.currentLine=175964232;
 //BA.debugLineNum = 175964232;BA.debugLine="Private CargandoDatos As Boolean";
_cargandodatos = false;
RDebugUtils.currentLine=175964234;
 //BA.debugLineNum = 175964234;BA.debugLine="Private btnCargarListaCamposQuerySQL As Button";
_btncargarlistacamposquerysql = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=175964237;
 //BA.debugLineNum = 175964237;BA.debugLine="Private btnCamposToText As Button";
_btncampostotext = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=175964239;
 //BA.debugLineNum = 175964239;BA.debugLine="Private btnTextToCampos As Button";
_btntexttocampos = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=175964240;
 //BA.debugLineNum = 175964240;BA.debugLine="Private lblTitleCampo As Label";
_lbltitlecampo = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964241;
 //BA.debugLineNum = 175964241;BA.debugLine="Private lblTitleEncabezado As Label";
_lbltitleencabezado = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964242;
 //BA.debugLineNum = 175964242;BA.debugLine="Private lblTitleTipoDato As Label";
_lbltitletipodato = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964243;
 //BA.debugLineNum = 175964243;BA.debugLine="Private lblInfo As Label";
_lblinfo = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964245;
 //BA.debugLineNum = 175964245;BA.debugLine="Private ColActualCLV, Col1, Col2 As Int";
_colactualclv = 0;
_col1 = 0;
_col2 = 0;
RDebugUtils.currentLine=175964247;
 //BA.debugLineNum = 175964247;BA.debugLine="Private prefDialog As PreferencesDialog";
_prefdialog = new b4j.docU.preferencesdialog();
RDebugUtils.currentLine=175964249;
 //BA.debugLineNum = 175964249;BA.debugLine="Private txtIpJRDC As TextField";
_txtipjrdc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964250;
 //BA.debugLineNum = 175964250;BA.debugLine="Private txtPuertoJRDC As TextField";
_txtpuertojrdc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964251;
 //BA.debugLineNum = 175964251;BA.debugLine="Private txtComandoJRDC As TextField";
_txtcomandojrdc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964252;
 //BA.debugLineNum = 175964252;BA.debugLine="Private txtParametrosJRDC As TextField";
_txtparametrosjrdc = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964254;
 //BA.debugLineNum = 175964254;BA.debugLine="Private txtTipoOrigenDatos As TextField";
_txttipoorigendatos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964255;
 //BA.debugLineNum = 175964255;BA.debugLine="Private pnlOrigenSQL As Pane";
_pnlorigensql = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=175964256;
 //BA.debugLineNum = 175964256;BA.debugLine="Private lblTitleTipoOrigenDatos As Label";
_lbltitletipoorigendatos = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964257;
 //BA.debugLineNum = 175964257;BA.debugLine="Private lblTitleIpJRDC As Label";
_lbltitleipjrdc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964258;
 //BA.debugLineNum = 175964258;BA.debugLine="Private lblTitlePuertoJRDC As Label";
_lbltitlepuertojrdc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964259;
 //BA.debugLineNum = 175964259;BA.debugLine="Private lblTitleComandoJRDC As Label";
_lbltitlecomandojrdc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964260;
 //BA.debugLineNum = 175964260;BA.debugLine="Private lblTitleParametrosJRDC As Label";
_lbltitleparametrosjrdc = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964262;
 //BA.debugLineNum = 175964262;BA.debugLine="Public DatosOrigenDatos As TipoOrigenDatos";
_datosorigendatos = new b4j.docU.jamtableviewcamposbuilder._tipoorigendatos();
RDebugUtils.currentLine=175964263;
 //BA.debugLineNum = 175964263;BA.debugLine="Private FechaUltimaModificacion As Long";
_fechaultimamodificacion = 0L;
RDebugUtils.currentLine=175964264;
 //BA.debugLineNum = 175964264;BA.debugLine="Private btnEditarOrigenJRDC As Button";
_btneditarorigenjrdc = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=175964266;
 //BA.debugLineNum = 175964266;BA.debugLine="Private lstPrimaryKey As List";
_lstprimarykey = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=175964267;
 //BA.debugLineNum = 175964267;BA.debugLine="Private CorrigiendoChkBoxEsFecha, CorrigiendoChkB";
_corrigiendochkboxesfecha = false;
_corrigiendochkboxkeyid = false;
_corrigiendochkboxesbooleano = false;
RDebugUtils.currentLine=175964270;
 //BA.debugLineNum = 175964270;BA.debugLine="Private btnValoresEstiloDefecto As Button";
_btnvaloresestilodefecto = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=175964271;
 //BA.debugLineNum = 175964271;BA.debugLine="Private btnValoresEstiloDefectoTodos As Button";
_btnvaloresestilodefectotodos = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=175964273;
 //BA.debugLineNum = 175964273;BA.debugLine="Private lblColorFondoEncabezados As B4XView";
_lblcolorfondoencabezados = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964274;
 //BA.debugLineNum = 175964274;BA.debugLine="Private lblColorTextoEncabezados As B4XView";
_lblcolortextoencabezados = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964276;
 //BA.debugLineNum = 175964276;BA.debugLine="Private txtRGBColorFondoEncabezados As B4XView";
_txtrgbcolorfondoencabezados = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964278;
 //BA.debugLineNum = 175964278;BA.debugLine="Private txtRGBColorTextoEncabezados As B4XView";
_txtrgbcolortextoencabezados = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964279;
 //BA.debugLineNum = 175964279;BA.debugLine="Private lblResetColorFondoEncabezados As B4XView";
_lblresetcolorfondoencabezados = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964280;
 //BA.debugLineNum = 175964280;BA.debugLine="Private lblResetColorTextoEncabezados As B4XView";
_lblresetcolortextoencabezados = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964283;
 //BA.debugLineNum = 175964283;BA.debugLine="Private lblColorFondoPanelInfo As B4XView";
_lblcolorfondopanelinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964284;
 //BA.debugLineNum = 175964284;BA.debugLine="Private lblColorTextoPanelInfo As B4XView";
_lblcolortextopanelinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964286;
 //BA.debugLineNum = 175964286;BA.debugLine="Private txtRGBColorFondoPanelInfo As B4XView";
_txtrgbcolorfondopanelinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964287;
 //BA.debugLineNum = 175964287;BA.debugLine="Private lblResetColorFondoPanelInfo As B4XView";
_lblresetcolorfondopanelinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964288;
 //BA.debugLineNum = 175964288;BA.debugLine="Private txtRGBColorTextoPanelInfo As B4XView";
_txtrgbcolortextopanelinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964289;
 //BA.debugLineNum = 175964289;BA.debugLine="Private lblResetColorTextoPanelInfo As B4XView";
_lblresetcolortextopanelinfo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964301;
 //BA.debugLineNum = 175964301;BA.debugLine="Private lblColorFondoFilasImpares As B4XView";
_lblcolorfondofilasimpares = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964305;
 //BA.debugLineNum = 175964305;BA.debugLine="Private lblColorFondoFilasPares As B4XView";
_lblcolorfondofilaspares = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964307;
 //BA.debugLineNum = 175964307;BA.debugLine="Private txtRGBColorFondoFilasImpares As B4XView";
_txtrgbcolorfondofilasimpares = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964308;
 //BA.debugLineNum = 175964308;BA.debugLine="Private txtRGBColorFondoFilasPares As B4XView";
_txtrgbcolorfondofilaspares = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964309;
 //BA.debugLineNum = 175964309;BA.debugLine="Private ResetColorFondoFilasImpares As Label";
_resetcolorfondofilasimpares = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964310;
 //BA.debugLineNum = 175964310;BA.debugLine="Private lblResetColorFondoFilasPares As Label";
_lblresetcolorfondofilaspares = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=175964312;
 //BA.debugLineNum = 175964312;BA.debugLine="Private B4XPlusMinusAnchoBordeItems As B4XPlusMin";
_b4xplusminusanchobordeitems = new b4j.docU.b4xplusminus();
RDebugUtils.currentLine=175964313;
 //BA.debugLineNum = 175964313;BA.debugLine="Private lblColorBordeItems As B4XView";
_lblcolorbordeitems = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964314;
 //BA.debugLineNum = 175964314;BA.debugLine="Private txtRGBColorBordeItems As TextField";
_txtrgbcolorbordeitems = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=175964315;
 //BA.debugLineNum = 175964315;BA.debugLine="Private lblResetColorBordeItems As B4XView";
_lblresetcolorbordeitems = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964318;
 //BA.debugLineNum = 175964318;BA.debugLine="Private BCColorPickerjamTableView As BCColorPicke";
_bccolorpickerjamtableview = new b4j.docU.bccolorpicker();
RDebugUtils.currentLine=175964323;
 //BA.debugLineNum = 175964323;BA.debugLine="Private lblColorFondoEncabezadoColumna As B4XView";
_lblcolorfondoencabezadocolumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964324;
 //BA.debugLineNum = 175964324;BA.debugLine="Private txtRGBColorFondoEncabezadoColumna As B4XV";
_txtrgbcolorfondoencabezadocolumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964325;
 //BA.debugLineNum = 175964325;BA.debugLine="Private lblResetColorFondoEncabezadoColumna As B4";
_lblresetcolorfondoencabezadocolumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964326;
 //BA.debugLineNum = 175964326;BA.debugLine="Private lblColorTextoEncabezadoColumna As B4XView";
_lblcolortextoencabezadocolumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964327;
 //BA.debugLineNum = 175964327;BA.debugLine="Private txtRGBColorTextoEncabezadoColumna As B4XV";
_txtrgbcolortextoencabezadocolumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964328;
 //BA.debugLineNum = 175964328;BA.debugLine="Private lblResetColorTextoEncabezadoColumna As B4";
_lblresetcolortextoencabezadocolumna = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964338;
 //BA.debugLineNum = 175964338;BA.debugLine="Private btnBuscarAliasCampo As B4XView";
_btnbuscaraliascampo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=175964340;
 //BA.debugLineNum = 175964340;BA.debugLine="Private mModoSnap As Boolean=True  ' true: scroll";
_mmodosnap = __c.True;
RDebugUtils.currentLine=175964341;
 //BA.debugLineNum = 175964341;BA.debugLine="Private OffsetAnterior As Int=1";
_offsetanterior = (int) (1);
RDebugUtils.currentLine=175964342;
 //BA.debugLineNum = 175964342;BA.debugLine="Private PrimerPanelVisibleAnterior As Int";
_primerpanelvisibleanterior = 0;
RDebugUtils.currentLine=175964343;
 //BA.debugLineNum = 175964343;BA.debugLine="Private ScrollingDown As Boolean";
_scrollingdown = false;
RDebugUtils.currentLine=175964344;
 //BA.debugLineNum = 175964344;BA.debugLine="End Sub";
return "";
}
public String  _clvlistacampos_scrollchanged(b4j.docU.jamtableclvcamposbuilder __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "clvlistacampos_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "clvlistacampos_scrollchanged", new Object[] {_offset}));}
int _i = 0;
b4j.example.customlistview._clvitem _item = null;
int _visiblepart = 0;
RDebugUtils.currentLine=180944896;
 //BA.debugLineNum = 180944896;BA.debugLine="Sub clvListaCampos_ScrollChanged (Offset As Int)";
RDebugUtils.currentLine=180944897;
 //BA.debugLineNum = 180944897;BA.debugLine="If mModoSnap=False Then Return";
if (__ref._mmodosnap /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=180944901;
 //BA.debugLineNum = 180944901;BA.debugLine="Log(\"clvDatos_ScrollChanged, Offset:\" & Offset)";
__c.LogImpl("9180944901","clvDatos_ScrollChanged, Offset:"+BA.NumberToString(_offset),0);
RDebugUtils.currentLine=180944904;
 //BA.debugLineNum = 180944904;BA.debugLine="If Offset=OffsetAnterior Then Return";
if (_offset==__ref._offsetanterior /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=180944906;
 //BA.debugLineNum = 180944906;BA.debugLine="If Offset>OffsetAnterior Then";
if (_offset>__ref._offsetanterior /*int*/ ) { 
RDebugUtils.currentLine=180944907;
 //BA.debugLineNum = 180944907;BA.debugLine="ScrollingDown=True";
__ref._scrollingdown /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=180944909;
 //BA.debugLineNum = 180944909;BA.debugLine="ScrollingDown=False";
__ref._scrollingdown /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=180944912;
 //BA.debugLineNum = 180944912;BA.debugLine="Dim i As Int = clvListaCampos.FirstVisibleIndex";
_i = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getfirstvisibleindex();
RDebugUtils.currentLine=180944913;
 //BA.debugLineNum = 180944913;BA.debugLine="Dim item As CLVItem	 = clvListaCampos.GetRawListI";
_item = __ref._clvlistacampos /*b4j.example.customlistview*/ ._getrawlistitem(_i);
RDebugUtils.currentLine=180944914;
 //BA.debugLineNum = 180944914;BA.debugLine="Dim visiblepart As Int = item.Offset + item.Size";
_visiblepart = (int) (_item.Offset+_item.Size-_offset);
RDebugUtils.currentLine=180944916;
 //BA.debugLineNum = 180944916;BA.debugLine="If visiblepart<item.Size Then";
if (_visiblepart<_item.Size) { 
RDebugUtils.currentLine=180944917;
 //BA.debugLineNum = 180944917;BA.debugLine="If ScrollingDown Then";
if (__ref._scrollingdown /*boolean*/ ) { 
RDebugUtils.currentLine=180944919;
 //BA.debugLineNum = 180944919;BA.debugLine="clvListaCampos.JumpToItem(i+1)";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._jumptoitem((int) (_i+1));
 }else {
RDebugUtils.currentLine=180944922;
 //BA.debugLineNum = 180944922;BA.debugLine="clvListaCampos.JumpToItem(i)";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._jumptoitem(_i);
 };
 }else {
RDebugUtils.currentLine=180944925;
 //BA.debugLineNum = 180944925;BA.debugLine="OffsetAnterior=Offset";
__ref._offsetanterior /*int*/  = _offset;
 };
RDebugUtils.currentLine=180944927;
 //BA.debugLineNum = 180944927;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4j.docU.jamtableclvcamposbuilder __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=176685056;
 //BA.debugLineNum = 176685056;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=176685057;
 //BA.debugLineNum = 176685057;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=176685058;
 //BA.debugLineNum = 176685058;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=176685059;
 //BA.debugLineNum = 176685059;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _configurarorigendatos(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "configurarorigendatos", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "configurarorigendatos", null));}
ResumableSub_ConfigurarOrigenDatos rsub = new ResumableSub_ConfigurarOrigenDatos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ConfigurarOrigenDatos extends BA.ResumableSub {
public ResumableSub_ConfigurarOrigenDatos(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
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
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177537026;
 //BA.debugLineNum = 177537026;BA.debugLine="Dialog.Title=\"Selecciona tipo de origen de datos\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona tipo de origen de datos");
RDebugUtils.currentLine=177537027;
 //BA.debugLineNum = 177537027;BA.debugLine="Dim OptTipoOrigen As B4XListTemplate";
_opttipoorigen = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=177537028;
 //BA.debugLineNum = 177537028;BA.debugLine="OptTipoOrigen.Initialize";
_opttipoorigen._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=177537030;
 //BA.debugLineNum = 177537030;BA.debugLine="OptTipoOrigen.Options=Array As String(\"JRDC Table";
_opttipoorigen._options /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"JRDC Table","JRDC Query","Manual","SQLite Table"});
RDebugUtils.currentLine=177537031;
 //BA.debugLineNum = 177537031;BA.debugLine="OptTipoOrigen.AllowMultiSelection=False";
_opttipoorigen._allowmultiselection /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=177537032;
 //BA.debugLineNum = 177537032;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(OptTip";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_opttipoorigen),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=177537033;
 //BA.debugLineNum = 177537033;BA.debugLine="Dim btnCancelar As B4XView=Dialog.GetButton(xui.D";
_btncancelar = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btncancelar = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=177537034;
 //BA.debugLineNum = 177537034;BA.debugLine="btnCancelar.Left=btnCancelar.Left-20dip";
_btncancelar.setLeft(_btncancelar.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=177537035;
 //BA.debugLineNum = 177537035;BA.debugLine="btnCancelar.Width=btnCancelar.Width+20dip";
_btncancelar.setWidth(_btncancelar.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=177537036;
 //BA.debugLineNum = 177537036;BA.debugLine="Wait For (rs) complete (result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _rs);
this.state = 59;
return;
case 59:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=177537037;
 //BA.debugLineNum = 177537037;BA.debugLine="If result=xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 58;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 57;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=177537038;
 //BA.debugLineNum = 177537038;BA.debugLine="SetCurrentFile(\"\")";
__ref._setcurrentfile /*String*/ (null,"");
RDebugUtils.currentLine=177537039;
 //BA.debugLineNum = 177537039;BA.debugLine="clvListaCampos.Clear";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=177537040;
 //BA.debugLineNum = 177537040;BA.debugLine="lstPrimaryKey.Initialize";
__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=177537042;
 //BA.debugLineNum = 177537042;BA.debugLine="Dim TipoOrigenDatos As String=OptTipoOrigen.Sele";
_tipoorigendatos = _opttipoorigen._selecteditem /*String*/ ;
RDebugUtils.currentLine=177537043;
 //BA.debugLineNum = 177537043;BA.debugLine="Select True";
if (true) break;

case 4:
//select
this.state = 55;
switch (BA.switchObjectToInt(parent.__c.True,(_tipoorigendatos).equals("JRDC Table"),(_tipoorigendatos).equals("JRDC Query"),(_tipoorigendatos).equals("Manual"),(_tipoorigendatos).equals("SQLite Table"))) {
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
RDebugUtils.currentLine=177537045;
 //BA.debugLineNum = 177537045;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
__ref._prefdialog /*b4j.docU.preferencesdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=177537047;
 //BA.debugLineNum = 177537047;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
__ref._prefdialog /*b4j.docU.preferencesdialog*/ ._loadfromjson /*String*/ (null,parent.__c.File.ReadString(parent.__c.File.getDirAssets(),"OrigenDatosJRDCTable.json"));
RDebugUtils.currentLine=177537048;
 //BA.debugLineNum = 177537048;BA.debugLine="Dim mData As Map=CreateMap(\"ComandoJRDC\": \"Inf";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("ComandoJRDC"),(Object)("InfoCamposTabla")});
RDebugUtils.currentLine=177537049;
 //BA.debugLineNum = 177537049;BA.debugLine="Dim rSub As ResumableSub=prefDialog.ShowDialog";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._prefdialog /*b4j.docU.preferencesdialog*/ ._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL"));
RDebugUtils.currentLine=177537050;
 //BA.debugLineNum = 177537050;BA.debugLine="Wait For (rSub) Complete (result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 60;
return;
case 60:
//C
this.state = 7;
_result = (int) result[1];
;
RDebugUtils.currentLine=177537052;
 //BA.debugLineNum = 177537052;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 12:
//C
this.state = 55;
;
RDebugUtils.currentLine=177537064;
 //BA.debugLineNum = 177537064;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
__ref._lbltitleipjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537065;
 //BA.debugLineNum = 177537065;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
__ref._lbltitlepuertojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537066;
 //BA.debugLineNum = 177537066;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
__ref._lbltitlecomandojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537067;
 //BA.debugLineNum = 177537067;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
__ref._lbltitleparametrosjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537068;
 //BA.debugLineNum = 177537068;BA.debugLine="txtIpJRDC.Enabled=True";
__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537069;
 //BA.debugLineNum = 177537069;BA.debugLine="txtParametrosJRDC.Enabled=True";
__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537070;
 //BA.debugLineNum = 177537070;BA.debugLine="txtPuertoJRDC.Enabled=True";
__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537071;
 //BA.debugLineNum = 177537071;BA.debugLine="txtComandoJRDC.Enabled=True";
__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537072;
 //BA.debugLineNum = 177537072;BA.debugLine="mData.put(\"ParametrosJRDC\",mData.get(\"NombreTa";
_mdata.Put((Object)("ParametrosJRDC"),_mdata.Get((Object)("NombreTabla")));
RDebugUtils.currentLine=177537074;
 //BA.debugLineNum = 177537074;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/  = __ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,_tipoorigendatos,BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.Get((Object)("ComandoJRDC"))),BA.ObjectToString(_mdata.GetDefault((Object)("ParametrosJRDC"),(Object)(""))));
RDebugUtils.currentLine=177537075;
 //BA.debugLineNum = 177537075;BA.debugLine="MostrarDatosOrigenDatos";
__ref._mostrardatosorigendatos /*String*/ (null);
RDebugUtils.currentLine=177537076;
 //BA.debugLineNum = 177537076;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=177537077;
 //BA.debugLineNum = 177537077;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJ";
__ref._cargacamposjrdctable /*void*/ (null,__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=177537078;
 //BA.debugLineNum = 177537078;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
parent.__c.WaitFor("cargacamposjrdctable_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), null);
this.state = 61;
return;
case 61:
//C
this.state = 55;
;
RDebugUtils.currentLine=177537079;
 //BA.debugLineNum = 177537079;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=177537081;
 //BA.debugLineNum = 177537081;BA.debugLine="prefDialog.Initialize(frm.RootPane,\"Datos JRDC";
__ref._prefdialog /*b4j.docU.preferencesdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),(Object)("Datos JRDC"),(int) (800),(int) (600));
RDebugUtils.currentLine=177537083;
 //BA.debugLineNum = 177537083;BA.debugLine="prefDialog.LoadFromJson(File.ReadString(File.D";
__ref._prefdialog /*b4j.docU.preferencesdialog*/ ._loadfromjson /*String*/ (null,parent.__c.File.ReadString(parent.__c.File.getDirAssets(),"OrigenDatosJRDCQuery.json"));
RDebugUtils.currentLine=177537084;
 //BA.debugLineNum = 177537084;BA.debugLine="Dim mData As Map=CreateMap()";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {});
RDebugUtils.currentLine=177537085;
 //BA.debugLineNum = 177537085;BA.debugLine="Wait For (prefDialog.ShowDialog(mData, \"OK\", \"";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), __ref._prefdialog /*b4j.docU.preferencesdialog*/ ._showdialog /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_mdata,(Object)("OK"),(Object)("CANCEL")));
this.state = 62;
return;
case 62:
//C
this.state = 15;
_result = (int) result[1];
;
RDebugUtils.currentLine=177537086;
 //BA.debugLineNum = 177537086;BA.debugLine="If result <> xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 20:
//C
this.state = 55;
;
RDebugUtils.currentLine=177537089;
 //BA.debugLineNum = 177537089;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
__ref._lbltitleipjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537090;
 //BA.debugLineNum = 177537090;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
__ref._lbltitlepuertojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537091;
 //BA.debugLineNum = 177537091;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
__ref._lbltitlecomandojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537092;
 //BA.debugLineNum = 177537092;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
__ref._lbltitleparametrosjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=177537093;
 //BA.debugLineNum = 177537093;BA.debugLine="txtIpJRDC.Enabled=True";
__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537094;
 //BA.debugLineNum = 177537094;BA.debugLine="txtParametrosJRDC.Enabled=True";
__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537095;
 //BA.debugLineNum = 177537095;BA.debugLine="txtPuertoJRDC.Enabled=True";
__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537096;
 //BA.debugLineNum = 177537096;BA.debugLine="txtComandoJRDC.Enabled=True";
__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.True);
RDebugUtils.currentLine=177537098;
 //BA.debugLineNum = 177537098;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/  = __ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,_tipoorigendatos,BA.ObjectToString(_mdata.GetDefault((Object)("IpJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("PuertoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ComandoJRDC"),(Object)(""))),BA.ObjectToString(_mdata.GetDefault((Object)("ParametrosJRDC"),(Object)(""))));
RDebugUtils.currentLine=177537099;
 //BA.debugLineNum = 177537099;BA.debugLine="MostrarDatosOrigenDatos";
__ref._mostrardatosorigendatos /*String*/ (null);
RDebugUtils.currentLine=177537100;
 //BA.debugLineNum = 177537100;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=177537101;
 //BA.debugLineNum = 177537101;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJ";
__ref._cargacamposjrdcquery /*void*/ (null,__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=177537102;
 //BA.debugLineNum = 177537102;BA.debugLine="Wait For CargaCamposJRDCQuery_Completed";
parent.__c.WaitFor("cargacamposjrdcquery_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), null);
this.state = 63;
return;
case 63:
//C
this.state = 55;
;
RDebugUtils.currentLine=177537103;
 //BA.debugLineNum = 177537103;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
 if (true) break;

case 22:
//C
this.state = 55;
RDebugUtils.currentLine=177537106;
 //BA.debugLineNum = 177537106;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/  = __ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,_tipoorigendatos,"","","",BA.ObjectToString(parent.__c.Null));
RDebugUtils.currentLine=177537107;
 //BA.debugLineNum = 177537107;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
__ref._lbltitleipjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537108;
 //BA.debugLineNum = 177537108;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
__ref._lbltitlepuertojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537109;
 //BA.debugLineNum = 177537109;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
__ref._lbltitlecomandojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537110;
 //BA.debugLineNum = 177537110;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
__ref._lbltitleparametrosjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537111;
 //BA.debugLineNum = 177537111;BA.debugLine="txtIpJRDC.Enabled=False";
__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537112;
 //BA.debugLineNum = 177537112;BA.debugLine="txtParametrosJRDC.Enabled=False";
__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537113;
 //BA.debugLineNum = 177537113;BA.debugLine="txtPuertoJRDC.Enabled=False";
__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537114;
 //BA.debugLineNum = 177537114;BA.debugLine="txtComandoJRDC.ENABLED=False";
__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537119;
 //BA.debugLineNum = 177537119;BA.debugLine="MostrarDatosOrigenDatos";
__ref._mostrardatosorigendatos /*String*/ (null);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=177537122;
 //BA.debugLineNum = 177537122;BA.debugLine="Dim FcDb As FileChooser";
_fcdb = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=177537123;
 //BA.debugLineNum = 177537123;BA.debugLine="FcDb.Initialize";
_fcdb.Initialize();
RDebugUtils.currentLine=177537124;
 //BA.debugLineNum = 177537124;BA.debugLine="FcDb.SetExtensionFilter(\"Ficheros db SQLite\",A";
_fcdb.SetExtensionFilter("Ficheros db SQLite",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.db"}));
RDebugUtils.currentLine=177537125;
 //BA.debugLineNum = 177537125;BA.debugLine="Dim sFchDB As String=FcDb.ShowOpen(frm)";
_sfchdb = _fcdb.ShowOpen(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=177537126;
 //BA.debugLineNum = 177537126;BA.debugLine="If sFchDB=\"\" Then Return False";
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
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=177537127;
 //BA.debugLineNum = 177537127;BA.debugLine="Dim SQLOrigenDatos As SQL";
_sqlorigendatos = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=177537128;
 //BA.debugLineNum = 177537128;BA.debugLine="SQLOrigenDatos.InitializeSQLite(File.GetFilePa";
_sqlorigendatos.InitializeSQLite(parent.__c.File.GetFileParent(_sfchdb),parent.__c.File.GetName(_sfchdb),parent.__c.True);
RDebugUtils.currentLine=177537130;
 //BA.debugLineNum = 177537130;BA.debugLine="Dim lstTablasSQLite As List";
_lsttablassqlite = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177537131;
 //BA.debugLineNum = 177537131;BA.debugLine="lstTablasSQLite.Initialize";
_lsttablassqlite.Initialize();
RDebugUtils.currentLine=177537132;
 //BA.debugLineNum = 177537132;BA.debugLine="Dim TBName As String";
_tbname = "";
RDebugUtils.currentLine=177537133;
 //BA.debugLineNum = 177537133;BA.debugLine="Dim DBQuery As String= \"Select name FROM sqlit";
_dbquery = "Select name FROM sqlite_master WHERE Type='table' ORDER BY name";
RDebugUtils.currentLine=177537134;
 //BA.debugLineNum = 177537134;BA.debugLine="Dim rsDB As ResultSet=SQLOrigenDatos.ExecQuery";
_rsdb = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdb = _sqlorigendatos.ExecQuery(_dbquery);
RDebugUtils.currentLine=177537135;
 //BA.debugLineNum = 177537135;BA.debugLine="Do While rsDB.NextRow";
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
RDebugUtils.currentLine=177537136;
 //BA.debugLineNum = 177537136;BA.debugLine="TBName=rsDB.GetString2(0)";
_tbname = _rsdb.GetString2((int) (0));
RDebugUtils.currentLine=177537137;
 //BA.debugLineNum = 177537137;BA.debugLine="Log(\"   Table: \" & TBName)";
parent.__c.LogImpl("9177537137","   Table: "+_tbname,0);
RDebugUtils.currentLine=177537138;
 //BA.debugLineNum = 177537138;BA.debugLine="If TBName.StartsWith(\"SQlite\") = False Then l";
if (true) break;

case 34:
//if
this.state = 39;
if (_tbname.startsWith("SQlite")==parent.__c.False) { 
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
RDebugUtils.currentLine=177537140;
 //BA.debugLineNum = 177537140;BA.debugLine="rsDB.Close";
_rsdb.Close();
RDebugUtils.currentLine=177537142;
 //BA.debugLineNum = 177537142;BA.debugLine="If lstTablasSQLite.Size=0 Then";
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
RDebugUtils.currentLine=177537143;
 //BA.debugLineNum = 177537143;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La base";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La base de datos SQLite"+_sfchdb+" no contiene tablas.","Aviso");
RDebugUtils.currentLine=177537144;
 //BA.debugLineNum = 177537144;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 44;
_result = (int) result[1];
;
RDebugUtils.currentLine=177537145;
 //BA.debugLineNum = 177537145;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=177537148;
 //BA.debugLineNum = 177537148;BA.debugLine="Dim Dlg As B4XDialog";
_dlg = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=177537149;
 //BA.debugLineNum = 177537149;BA.debugLine="Dlg.Initialize(frm.RootPane)";
_dlg._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=177537150;
 //BA.debugLineNum = 177537150;BA.debugLine="Dlg.Title=\"Indica Nombre de la Tabla\"";
_dlg._title /*Object*/  = (Object)("Indica Nombre de la Tabla");
RDebugUtils.currentLine=177537151;
 //BA.debugLineNum = 177537151;BA.debugLine="Dim B4XList As B4XListTemplate";
_b4xlist = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=177537152;
 //BA.debugLineNum = 177537152;BA.debugLine="B4XList.Initialize";
_b4xlist._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=177537153;
 //BA.debugLineNum = 177537153;BA.debugLine="B4XList.Options=lstTablasSQLite";
_b4xlist._options /*anywheresoftware.b4a.objects.collections.List*/  = _lsttablassqlite;
RDebugUtils.currentLine=177537154;
 //BA.debugLineNum = 177537154;BA.debugLine="B4XList.mBase.Width=500dip";
_b4xlist._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(parent.__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=177537155;
 //BA.debugLineNum = 177537155;BA.debugLine="Dim rSub As ResumableSub=Dlg.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = _dlg._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlist),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=177537156;
 //BA.debugLineNum = 177537156;BA.debugLine="Dim bCancel As Button=Dlg.GetButton(xui.Dialog";
_bcancel = new anywheresoftware.b4j.objects.ButtonWrapper();
_bcancel = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(_dlg._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel).getObject()));
RDebugUtils.currentLine=177537157;
 //BA.debugLineNum = 177537157;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=177537158;
 //BA.debugLineNum = 177537158;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _rsub);
this.state = 65;
return;
case 65:
//C
this.state = 45;
_rint = (int) result[1];
;
RDebugUtils.currentLine=177537159;
 //BA.debugLineNum = 177537159;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 45:
//if
this.state = 50;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 47;
;}if (true) break;

case 47:
//C
this.state = 50;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=177537160;
 //BA.debugLineNum = 177537160;BA.debugLine="Dim NombreTabla As String=B4XList.SelectedItem";
_nombretabla = _b4xlist._selecteditem /*String*/ ;
RDebugUtils.currentLine=177537161;
 //BA.debugLineNum = 177537161;BA.debugLine="Dim lstFields As List=GetTablePragma(SQLOrigen";
_lstfields = new anywheresoftware.b4a.objects.collections.List();
_lstfields = __ref._gettablepragma /*anywheresoftware.b4a.objects.collections.List*/ (null,_sqlorigendatos,_nombretabla);
RDebugUtils.currentLine=177537162;
 //BA.debugLineNum = 177537162;BA.debugLine="If lstFields.Size=0 Then";
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
RDebugUtils.currentLine=177537163;
 //BA.debugLineNum = 177537163;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"La tabla";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La tabla "+_nombretabla+" no existe en la base de datos SQLite "+_sfchdb,"Error");
RDebugUtils.currentLine=177537164;
 //BA.debugLineNum = 177537164;BA.debugLine="Wait For (msa) Msgbox_Result (result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "configurarorigendatos"), _msa);
this.state = 66;
return;
case 66:
//C
this.state = 54;
_result = (int) result[1];
;
RDebugUtils.currentLine=177537165;
 //BA.debugLineNum = 177537165;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=177537168;
 //BA.debugLineNum = 177537168;BA.debugLine="DatosOrigenDatos=CreateTipoOrigenDatos(TipoOri";
__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/  = __ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,_tipoorigendatos,"","","",BA.ObjectToString(parent.__c.Null));
RDebugUtils.currentLine=177537169;
 //BA.debugLineNum = 177537169;BA.debugLine="lblTitleIpJRDC.TextColor=fx.Colors.From32Bit(0";
__ref._lbltitleipjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537170;
 //BA.debugLineNum = 177537170;BA.debugLine="lblTitlePuertoJRDC.TextColor=fx.Colors.From32B";
__ref._lbltitlepuertojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537171;
 //BA.debugLineNum = 177537171;BA.debugLine="lblTitleComandoJRDC.TextColor=fx.Colors.From32";
__ref._lbltitlecomandojrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537172;
 //BA.debugLineNum = 177537172;BA.debugLine="lblTitleParametrosJRDC.TextColor=fx.Colors.Fro";
__ref._lbltitleparametrosjrdc /*anywheresoftware.b4j.objects.LabelWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
RDebugUtils.currentLine=177537173;
 //BA.debugLineNum = 177537173;BA.debugLine="txtIpJRDC.Enabled=False";
__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537174;
 //BA.debugLineNum = 177537174;BA.debugLine="txtParametrosJRDC.Enabled=False";
__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537175;
 //BA.debugLineNum = 177537175;BA.debugLine="txtPuertoJRDC.Enabled=False";
__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537176;
 //BA.debugLineNum = 177537176;BA.debugLine="txtComandoJRDC.ENABLED=False";
__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEnabled(parent.__c.False);
RDebugUtils.currentLine=177537177;
 //BA.debugLineNum = 177537177;BA.debugLine="MostrarDatosOrigenDatos";
__ref._mostrardatosorigendatos /*String*/ (null);
RDebugUtils.currentLine=177537179;
 //BA.debugLineNum = 177537179;BA.debugLine="CargaCamposTablaSQLite(lstFields)";
__ref._cargacampostablasqlite /*String*/ (null,_lstfields);
RDebugUtils.currentLine=177537180;
 //BA.debugLineNum = 177537180;BA.debugLine="SQLOrigenDatos.Close";
_sqlorigendatos.Close();
 if (true) break;

case 55:
//C
this.state = 58;
;
RDebugUtils.currentLine=177537187;
 //BA.debugLineNum = 177537187;BA.debugLine="dragger.AddDragButtons";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=177537188;
 //BA.debugLineNum = 177537188;BA.debugLine="pnlOrigenSQL.Visible=True";
__ref._pnlorigensql /*anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper*/ .setVisible(parent.__c.True);
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=177537190;
 //BA.debugLineNum = 177537190;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=177537192;
 //BA.debugLineNum = 177537192;BA.debugLine="RecalcularIDOrdenColumnas";
__ref._recalcularidordencolumnas /*String*/ (null);
RDebugUtils.currentLine=177537193;
 //BA.debugLineNum = 177537193;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=177537194;
 //BA.debugLineNum = 177537194;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setcurrentfile(b4j.docU.jamtableclvcamposbuilder __ref,String _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "setcurrentfile", true))
	 {return ((String) Debug.delegate(ba, "setcurrentfile", new Object[] {_f}));}
RDebugUtils.currentLine=177274880;
 //BA.debugLineNum = 177274880;BA.debugLine="private Sub SetCurrentFile (f As String)";
RDebugUtils.currentLine=177274881;
 //BA.debugLineNum = 177274881;BA.debugLine="CurrentFile = f";
__ref._currentfile /*String*/  = _f;
RDebugUtils.currentLine=177274882;
 //BA.debugLineNum = 177274882;BA.debugLine="frm.Title = $\"CamposBuilder ($1.2{version})\"$";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(("CamposBuilder ("+__c.SmartStringFormatter("1.2",(Object)(__ref._version /*float*/ ))+")"));
RDebugUtils.currentLine=177274883;
 //BA.debugLineNum = 177274883;BA.debugLine="If f <> \"\" Then";
if ((_f).equals("") == false) { 
RDebugUtils.currentLine=177274884;
 //BA.debugLineNum = 177274884;BA.debugLine="frm.Title = frm.Title & \" - \" & File.GetName(f)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getTitle()+" - "+__c.File.GetName(_f));
 };
RDebugUtils.currentLine=177274887;
 //BA.debugLineNum = 177274887;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _gettablepragma(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "gettablepragma", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettablepragma", new Object[] {_sql,_tablename}));}
anywheresoftware.b4a.objects.collections.List _lstfields = null;
String _tbquery = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.objects.collections.Map _columnparmsmap = null;
int _i = 0;
RDebugUtils.currentLine=177668096;
 //BA.debugLineNum = 177668096;BA.debugLine="Sub GetTablePragma(SQL As SQL,TableName As String)";
RDebugUtils.currentLine=177668097;
 //BA.debugLineNum = 177668097;BA.debugLine="Private lstFields As List";
_lstfields = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=177668098;
 //BA.debugLineNum = 177668098;BA.debugLine="lstFields.Initialize";
_lstfields.Initialize();
RDebugUtils.currentLine=177668099;
 //BA.debugLineNum = 177668099;BA.debugLine="Private TBQuery As String";
_tbquery = "";
RDebugUtils.currentLine=177668100;
 //BA.debugLineNum = 177668100;BA.debugLine="TBQuery = \"PRAGMA table_info(\" & TableName & \")\"";
_tbquery = "PRAGMA table_info("+_tablename+")";
RDebugUtils.currentLine=177668101;
 //BA.debugLineNum = 177668101;BA.debugLine="Dim rs As ResultSet=SQL.ExecQuery(TBQuery)";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = _sql.ExecQuery(_tbquery);
RDebugUtils.currentLine=177668102;
 //BA.debugLineNum = 177668102;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=177668103;
 //BA.debugLineNum = 177668103;BA.debugLine="Dim ColumnParmsMap As Map";
_columnparmsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=177668104;
 //BA.debugLineNum = 177668104;BA.debugLine="ColumnParmsMap.Initialize";
_columnparmsmap.Initialize();
RDebugUtils.currentLine=177668105;
 //BA.debugLineNum = 177668105;BA.debugLine="For i=0 To rs.ColumnCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_rs.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=177668106;
 //BA.debugLineNum = 177668106;BA.debugLine="Log (\"     \" & i & \": \" &  rs.GetColumnName(i)";
__c.LogImpl("9177668106","     "+BA.NumberToString(_i)+": "+_rs.GetColumnName(_i)+"->"+_rs.GetString2(_i),0);
RDebugUtils.currentLine=177668107;
 //BA.debugLineNum = 177668107;BA.debugLine="ColumnParmsMap.Put(rs.GetColumnName(i), rs.GetS";
_columnparmsmap.Put((Object)(_rs.GetColumnName(_i)),(Object)(_rs.GetString2(_i)));
 }
};
RDebugUtils.currentLine=177668109;
 //BA.debugLineNum = 177668109;BA.debugLine="lstFields.Add(ColumnParmsMap)";
_lstfields.Add((Object)(_columnparmsmap.getObject()));
 }
;
RDebugUtils.currentLine=177668111;
 //BA.debugLineNum = 177668111;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=177668112;
 //BA.debugLineNum = 177668112;BA.debugLine="Return lstFields";
if (true) return _lstfields;
RDebugUtils.currentLine=177668113;
 //BA.debugLineNum = 177668113;BA.debugLine="End Sub";
return null;
}
public String  _deshabilitarnodos(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "deshabilitarnodos", true))
	 {return ((String) Debug.delegate(ba, "deshabilitarnodos", null));}
anywheresoftware.b4a.objects.collections.List _lstnodosdeshabilitados = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=179634176;
 //BA.debugLineNum = 179634176;BA.debugLine="private Sub DeshabilitarNodos";
RDebugUtils.currentLine=179634177;
 //BA.debugLineNum = 179634177;BA.debugLine="Dim lstNodosDeshabilitados As List";
_lstnodosdeshabilitados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=179634178;
 //BA.debugLineNum = 179634178;BA.debugLine="lstNodosDeshabilitados.Initialize";
_lstnodosdeshabilitados.Initialize();
RDebugUtils.currentLine=179634179;
 //BA.debugLineNum = 179634179;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group3.Get(index3)));
RDebugUtils.currentLine=179634180;
 //BA.debugLineNum = 179634180;BA.debugLine="If n.Enabled=True Then";
if (_n.getEnabled()==__c.True) { 
RDebugUtils.currentLine=179634181;
 //BA.debugLineNum = 179634181;BA.debugLine="n.Enabled=False";
_n.setEnabled(__c.False);
RDebugUtils.currentLine=179634182;
 //BA.debugLineNum = 179634182;BA.debugLine="lstNodosDeshabilitados.Add(n)";
_lstnodosdeshabilitados.Add((Object)(_n.getObject()));
 };
 }
};
RDebugUtils.currentLine=179634185;
 //BA.debugLineNum = 179634185;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "frm_closerequest", true))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=176291840;
 //BA.debugLineNum = 176291840;BA.debugLine="private Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=176291841;
 //BA.debugLineNum = 176291841;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=176291842;
 //BA.debugLineNum = 176291842;BA.debugLine="End Sub";
return "";
}
public String  _habilitardeshabilitarcheckbox(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.CheckboxWrapper _chkboxsel,boolean _habilitado) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "habilitardeshabilitarcheckbox", true))
	 {return ((String) Debug.delegate(ba, "habilitardeshabilitarcheckbox", new Object[] {_chkboxsel,_habilitado}));}
RDebugUtils.currentLine=178651136;
 //BA.debugLineNum = 178651136;BA.debugLine="private Sub HabilitarDeshabilitarCheckBox(chkboxSe";
RDebugUtils.currentLine=178651137;
 //BA.debugLineNum = 178651137;BA.debugLine="chkboxSel.Enabled=Habilitado";
_chkboxsel.setEnabled(_habilitado);
RDebugUtils.currentLine=178651138;
 //BA.debugLineNum = 178651138;BA.debugLine="If Habilitado Then";
if (_habilitado) { 
RDebugUtils.currentLine=178651139;
 //BA.debugLineNum = 178651139;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:black; -fx-border";
_chkboxsel.setStyle("-fx-text-fill:black; -fx-border-color: black");
 }else {
RDebugUtils.currentLine=178651141;
 //BA.debugLineNum = 178651141;BA.debugLine="chkboxSel.Style=\"-fx-text-fill:lightgray; -fx-bo";
_chkboxsel.setStyle("-fx-text-fill:lightgray; -fx-border-color: lightgray");
 };
RDebugUtils.currentLine=178651143;
 //BA.debugLineNum = 178651143;BA.debugLine="End Sub";
return "";
}
public String  _habilitarnodos(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "habilitarnodos", true))
	 {return ((String) Debug.delegate(ba, "habilitarnodos", null));}
anywheresoftware.b4a.objects.collections.List _lstnodosdeshabilitados = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
RDebugUtils.currentLine=179699712;
 //BA.debugLineNum = 179699712;BA.debugLine="private Sub HabilitarNodos";
RDebugUtils.currentLine=179699713;
 //BA.debugLineNum = 179699713;BA.debugLine="Dim lstNodosDeshabilitados As List";
_lstnodosdeshabilitados = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=179699714;
 //BA.debugLineNum = 179699714;BA.debugLine="lstNodosDeshabilitados.Initialize";
_lstnodosdeshabilitados.Initialize();
RDebugUtils.currentLine=179699715;
 //BA.debugLineNum = 179699715;BA.debugLine="For Each n As Node In frm.RootPane.GetAllViewsRec";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group3.Get(index3)));
RDebugUtils.currentLine=179699716;
 //BA.debugLineNum = 179699716;BA.debugLine="If n.Enabled=False Then";
if (_n.getEnabled()==__c.False) { 
RDebugUtils.currentLine=179699717;
 //BA.debugLineNum = 179699717;BA.debugLine="n.Enabled=True";
_n.setEnabled(__c.True);
RDebugUtils.currentLine=179699718;
 //BA.debugLineNum = 179699718;BA.debugLine="lstNodosDeshabilitados.Add(n)";
_lstnodosdeshabilitados.Add((Object)(_n.getObject()));
 };
 }
};
RDebugUtils.currentLine=179699721;
 //BA.debugLineNum = 179699721;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _help(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "help", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "help", null));}
ResumableSub_Help rsub = new ResumableSub_Help(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Help extends BA.ResumableSub {
public ResumableSub_Help(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
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
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=179240961;
 //BA.debugLineNum = 179240961;BA.debugLine="Dialog.Title=\"Información\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Información");
RDebugUtils.currentLine=179240964;
 //BA.debugLineNum = 179240964;BA.debugLine="Dim DlgInfo As B4XLongTextTemplate";
_dlginfo = new b4j.docU.b4xlongtexttemplate();
RDebugUtils.currentLine=179240965;
 //BA.debugLineNum = 179240965;BA.debugLine="DlgInfo.Initialize";
_dlginfo._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=179240966;
 //BA.debugLineNum = 179240966;BA.debugLine="Dim sbInfo As StringBuilder";
_sbinfo = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=179240967;
 //BA.debugLineNum = 179240967;BA.debugLine="sbInfo.Initialize";
_sbinfo.Initialize();
RDebugUtils.currentLine=179240968;
 //BA.debugLineNum = 179240968;BA.debugLine="sbInfo.Append(\"Instrucciones:\").Append(CRLF).Appe";
_sbinfo.Append("Instrucciones:").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240969;
 //BA.debugLineNum = 179240969;BA.debugLine="sbInfo.Append(\"1) El nombre del campo y su tipo s";
_sbinfo.Append("1) El nombre del campo y su tipo son obligatorios").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240970;
 //BA.debugLineNum = 179240970;BA.debugLine="sbInfo.Append(\"Los campos tipo fecha (se recupera";
_sbinfo.Append("Los campos tipo fecha (se recuperará un Long del origen de datos), hay que marcarlos como \"Es Fecha\".").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240971;
 //BA.debugLineNum = 179240971;BA.debugLine="sbInfo.Append(\"Si el origen de datos se obtiene m";
_sbinfo.Append("Si el origen de datos se obtiene mediante tabla / vista / query SQL , TODOS los campos devueltos por SQL deben estar definidos. NO se puede eliminar un campo obtenido mediante SQL").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240973;
 //BA.debugLineNum = 179240973;BA.debugLine="sbInfo.Append(\"En caso de origen de datos tipo Qu";
_sbinfo.Append("En caso de origen de datos tipo Query, si no hay parámetros, dejar en blanco. Si hay más de 1 parámetro, separarlos mediante punto y coma (;)").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240974;
 //BA.debugLineNum = 179240974;BA.debugLine="sbInfo.Append(\"En caso de carga de 1 JSON ya exis";
_sbinfo.Append("En caso de carga de 1 JSON ya existente, se comparán los campos del JSON, con los devueltos actualmente por la consulta SQL. Casos:").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240975;
 //BA.debugLineNum = 179240975;BA.debugLine="sbInfo.Append(\"   - El campo de SQL ya existe en";
_sbinfo.Append("   - El campo de SQL ya existe en el JSON: Se mantiene como está definido en el JSON.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240976;
 //BA.debugLineNum = 179240976;BA.debugLine="sbInfo.Append(\"   - El campo de SQL NO existe en";
_sbinfo.Append("   - El campo de SQL NO existe en el JSON: Se añade al CLV con el nombre de campo, alias y encabezado de columna = nombre de campo. El resto de datos estará en blanco.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240977;
 //BA.debugLineNum = 179240977;BA.debugLine="sbInfo.Append(\"   - El campo está en el JSON, per";
_sbinfo.Append("   - El campo está en el JSON, pero la SQL no lo ha devuelto: Se mostrará una advertencia para confirmar si continuar o detener el proceso (para revisar la SQL por parte del programador.").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240980;
 //BA.debugLineNum = 179240980;BA.debugLine="sbInfo.Append(\"Es posible indicar varios campos d";
_sbinfo.Append("Es posible indicar varios campos de clave primeria, ordenados del 1 al X, indicándolo en el valor del KeyID.").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240981;
 //BA.debugLineNum = 179240981;BA.debugLine="sbInfo.Append(\"2) Para los campos que se quiera m";
_sbinfo.Append("2) Para los campos que se quiera mostrar en columnas, hay que marcar el checkbox Columna.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240982;
 //BA.debugLineNum = 179240982;BA.debugLine="sbInfo.Append(\"Por defecto, salvo que sea campo c";
_sbinfo.Append("Por defecto, salvo que sea campo calculado, se copia el valor del nombre del campo al alias de campo y al encabezado. Se puede editar posteriormente.").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240983;
 //BA.debugLineNum = 179240983;BA.debugLine="sbInfo.Append(\"3) Para los campos por los que se";
_sbinfo.Append("3) Para los campos por los que se quiera poder filtrar, definir un tipo de control para el filtro. Si no se quiere permitir filtrar por un campo, dejarlo en blanco.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240984;
 //BA.debugLineNum = 179240984;BA.debugLine="sbInfo.Append(\"En el selector del filtro se mostr";
_sbinfo.Append("En el selector del filtro se mostrará el alias del campo.").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240985;
 //BA.debugLineNum = 179240985;BA.debugLine="sbInfo.Append(\"4) Es posible añadir o eliminar ca";
_sbinfo.Append("4) Es posible añadir o eliminar campos manualmente. Los campos calculados deben introducirse en el combo Campo, con sintaxis válida de SQLite, con los ALIAS DE CAMPO correspondientes a los campos entre corchetes.");
RDebugUtils.currentLine=179240986;
 //BA.debugLineNum = 179240986;BA.debugLine="sbInfo.Append(\"Si el origen de datos es de tipo S";
_sbinfo.Append("Si el origen de datos es de tipo SQL , solo se podrán añadir campos calculados").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240988;
 //BA.debugLineNum = 179240988;BA.debugLine="sbInfo.Append(\"Un campo transformado a partir de";
_sbinfo.Append("Un campo transformado a partir de 1 sola columna no es un campo calculado, se trata como un formato. Ver punto siguiente.").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240989;
 //BA.debugLineNum = 179240989;BA.debugLine="sbInfo.Append(\"5) Los formatos de las columnas se";
_sbinfo.Append("5) Los formatos de las columnas se definen en el evento SetCellFactory las columnas que lo necesiten .").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240990;
 //BA.debugLineNum = 179240990;BA.debugLine="sbInfo.Append(\" Los formatos de las columnas se c";
_sbinfo.Append(" Los formatos de las columnas se crean mediante código INLINE java. Existen unos formatos predefinidos en la propia clase. Se llaman mediante constantes _CellFactory,").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240991;
 //BA.debugLineNum = 179240991;BA.debugLine="sbInfo.Append(\" indicando en el método Create que";
_sbinfo.Append(" indicando en el método Create que NO están en el módulo CallBack. Para formatos que no estén predefinidos, hay que escribir el código INLINE JAVA en el módulo CallBack.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240992;
 //BA.debugLineNum = 179240992;BA.debugLine="sbInfo.Append(\"6) Hay que tener en cuenta , para";
_sbinfo.Append("6) Hay que tener en cuenta , para todos los métodos que busquen datos a partir del jamTableCLV, que la tabla SQLinterna (tblOrigenDatos),se construye con los ALIAS de los campos.").Append(parent.__c.CRLF);
RDebugUtils.currentLine=179240994;
 //BA.debugLineNum = 179240994;BA.debugLine="sbInfo.Append(\"\")";
_sbinfo.Append("");
RDebugUtils.currentLine=179240996;
 //BA.debugLineNum = 179240996;BA.debugLine="DlgInfo.Text=sbInfo.ToString";
_dlginfo._text /*Object*/  = (Object)(_sbinfo.ToString());
RDebugUtils.currentLine=179240997;
 //BA.debugLineNum = 179240997;BA.debugLine="Dim rs As ResumableSub=Dialog.ShowTemplate(DlgInf";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_dlginfo),(Object)("Ok"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=179240999;
 //BA.debugLineNum = 179240999;BA.debugLine="Dialog.Base.SetLayoutAnimated(0,0.1*Dialog.mParen";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0.1*__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*0.8,0.1*__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.8,__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()*0.8,__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*0.8);
RDebugUtils.currentLine=179241001;
 //BA.debugLineNum = 179241001;BA.debugLine="Dialog.TitleBar.SetLayoutAnimated(0,0,0,Dialog.Ba";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/ );
RDebugUtils.currentLine=179241002;
 //BA.debugLineNum = 179241002;BA.debugLine="Dim bOk As Button=Dialog.GetButton(xui.DialogResp";
_bok = new anywheresoftware.b4j.objects.ButtonWrapper();
_bok = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive).getObject()));
RDebugUtils.currentLine=179241003;
 //BA.debugLineNum = 179241003;BA.debugLine="bOk.Top=Dialog.Base.Height-Dialog.ButtonsHeight-5";
_bok.setTop(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -5);
RDebugUtils.currentLine=179241005;
 //BA.debugLineNum = 179241005;BA.debugLine="Dim pT As Pane=Dialog.TitleBar";
_pt = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pt = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=179241006;
 //BA.debugLineNum = 179241006;BA.debugLine="Dim lblT As Label=pT.GetNode(0)";
_lblt = new anywheresoftware.b4j.objects.LabelWrapper();
_lblt = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_pt.GetNode((int) (0)).getObject()));
RDebugUtils.currentLine=179241007;
 //BA.debugLineNum = 179241007;BA.debugLine="lblT.PrefWidth=lblT.Parent.PrefWidth";
_lblt.setPrefWidth(_lblt.getParent().getPrefWidth());
RDebugUtils.currentLine=179241009;
 //BA.debugLineNum = 179241009;BA.debugLine="DlgInfo.mBase.SetLayoutAnimated(100,5,Dialog.Titl";
_dlginfo._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (100),5,__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/ ,__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-10,__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/ -__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ );
RDebugUtils.currentLine=179241011;
 //BA.debugLineNum = 179241011;BA.debugLine="Dim p As Pane=DlgInfo.CustomListView1.GetPanel(0)";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_dlginfo._customlistview1 /*b4j.example.customlistview*/ ._getpanel((int) (0)).getObject()));
RDebugUtils.currentLine=179241012;
 //BA.debugLineNum = 179241012;BA.debugLine="Dim lbl As Label=p.GetNode(0)";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
_lbl = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_p.GetNode((int) (0)).getObject()));
RDebugUtils.currentLine=179241013;
 //BA.debugLineNum = 179241013;BA.debugLine="lbl.Font=fx.DefaultFont(8)";
_lbl.setFont(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .DefaultFont(8));
RDebugUtils.currentLine=179241014;
 //BA.debugLineNum = 179241014;BA.debugLine="lbl.TextColor=fx.Colors.From32Bit(0xFFFFFFFF)";
_lbl.setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffffffff))));
RDebugUtils.currentLine=179241023;
 //BA.debugLineNum = 179241023;BA.debugLine="wait for (rs) complete (result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "help"), _rs);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=179241024;
 //BA.debugLineNum = 179241024;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=179241025;
 //BA.debugLineNum = 179241025;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public int  _hextocolor(b4j.docU.jamtableclvcamposbuilder __ref,String _hex) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "hextocolor", true))
	 {return ((Integer) Debug.delegate(ba, "hextocolor", new Object[] {_hex}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
int[] _ints = null;
RDebugUtils.currentLine=176750592;
 //BA.debugLineNum = 176750592;BA.debugLine="Private Sub HexToColor(Hex As String) As Int";
RDebugUtils.currentLine=176750593;
 //BA.debugLineNum = 176750593;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=176750594;
 //BA.debugLineNum = 176750594;BA.debugLine="If Hex.StartsWith(\"#\") Then";
if (_hex.startsWith("#")) { 
RDebugUtils.currentLine=176750595;
 //BA.debugLineNum = 176750595;BA.debugLine="Hex = Hex.SubString(1)";
_hex = _hex.substring((int) (1));
 }else 
{RDebugUtils.currentLine=176750596;
 //BA.debugLineNum = 176750596;BA.debugLine="Else If Hex.StartsWith(\"0x\") Then";
if (_hex.startsWith("0x")) { 
RDebugUtils.currentLine=176750597;
 //BA.debugLineNum = 176750597;BA.debugLine="Hex = Hex.SubString(2)";
_hex = _hex.substring((int) (2));
 }}
;
RDebugUtils.currentLine=176750599;
 //BA.debugLineNum = 176750599;BA.debugLine="If Hex.Length=6 Then Hex=\"FF\" & Hex";
if (_hex.length()==6) { 
_hex = "FF"+_hex;};
RDebugUtils.currentLine=176750600;
 //BA.debugLineNum = 176750600;BA.debugLine="Dim ints() As Int = bc.IntsFromBytes(bc.HexToByte";
_ints = _bc.IntsFromBytes(_bc.HexToBytes(_hex));
RDebugUtils.currentLine=176750601;
 //BA.debugLineNum = 176750601;BA.debugLine="Return ints(0)";
if (true) return _ints[(int) (0)];
RDebugUtils.currentLine=176750602;
 //BA.debugLineNum = 176750602;BA.debugLine="End Sub";
return 0;
}
public void  _inicio(b4j.docU.jamtableclvcamposbuilder __ref,String _rutaficherojsonjamtableclv) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "inicio", true))
	 {Debug.delegate(ba, "inicio", new Object[] {_rutaficherojsonjamtableclv}); return;}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref,_rutaficherojsonjamtableclv);
rsub.resume(ba, null);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,String _rutaficherojsonjamtableclv) {
this.parent = parent;
this.__ref = __ref;
this._rutaficherojsonjamtableclv = _rutaficherojsonjamtableclv;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
String _rutaficherojsonjamtableclv;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176160769;
 //BA.debugLineNum = 176160769;BA.debugLine="If RutaFicheroJSONjamTableCLV=\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_rutaficherojsonjamtableclv).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=176160772;
 //BA.debugLineNum = 176160772;BA.debugLine="mnuNew_Action";
__ref._mnunew_action /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=176160774;
 //BA.debugLineNum = 176160774;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=176160775;
 //BA.debugLineNum = 176160775;BA.debugLine="DeshabilitarNodos";
__ref._deshabilitarnodos /*String*/ (null);
RDebugUtils.currentLine=176160776;
 //BA.debugLineNum = 176160776;BA.debugLine="wait for (LoadFile(RutaFicheroJSONjamTableCLV))";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "inicio"), __ref._loadfile /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_rutaficherojsonjamtableclv));
this.state = 7;
return;
case 7:
//C
this.state = 6;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=176160777;
 //BA.debugLineNum = 176160777;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=176160778;
 //BA.debugLineNum = 176160778;BA.debugLine="HabilitarNodos";
__ref._habilitarnodos /*String*/ (null);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=176160780;
 //BA.debugLineNum = 176160780;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mnunew_action(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mnunew_action", true))
	 {Debug.delegate(ba, "mnunew_action", null); return;}
ResumableSub_mnuNew_Action rsub = new ResumableSub_mnuNew_Action(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuNew_Action extends BA.ResumableSub {
public ResumableSub_mnuNew_Action(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _cancel = false;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177405953;
 //BA.debugLineNum = 177405953;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnunew_action"), __ref._checkchanges /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (boolean) result[1];
;
RDebugUtils.currentLine=177405954;
 //BA.debugLineNum = 177405954;BA.debugLine="If Cancel Then Return";
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
RDebugUtils.currentLine=177405955;
 //BA.debugLineNum = 177405955;BA.debugLine="CreateTipoOrigenDatos(\"\",\"\",\"\",\"\",Null)";
__ref._createtipoorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ (null,"","","","",BA.ObjectToString(parent.__c.Null));
RDebugUtils.currentLine=177405958;
 //BA.debugLineNum = 177405958;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=177405959;
 //BA.debugLineNum = 177405959;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("#004B55");
RDebugUtils.currentLine=177405960;
 //BA.debugLineNum = 177405960;BA.debugLine="lblColorFondoEncabezados.Color=bc.IntsFromBytes(b";
__ref._lblcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=177405962;
 //BA.debugLineNum = 177405962;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White));
RDebugUtils.currentLine=177405963;
 //BA.debugLineNum = 177405963;BA.debugLine="lblColorTextoEncabezados.Color=bc.IntsFromBytes(b";
__ref._lblcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=177405965;
 //BA.debugLineNum = 177405965;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("#FFF8C3");
RDebugUtils.currentLine=177405966;
 //BA.debugLineNum = 177405966;BA.debugLine="lblColorFondoPanelInfo.Color=bc.IntsFromBytes(bc.";
__ref._lblcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=177405968;
 //BA.debugLineNum = 177405968;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black));
RDebugUtils.currentLine=177405969;
 //BA.debugLineNum = 177405969;BA.debugLine="lblColorTextoPanelInfo.Color=bc.IntsFromBytes(bc.";
__ref._lblcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=177405971;
 //BA.debugLineNum = 177405971;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White));
RDebugUtils.currentLine=177405972;
 //BA.debugLineNum = 177405972;BA.debugLine="lblColorFondoFilasImpares.Color=bc.IntsFromBytes(";
__ref._lblcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=177405974;
 //BA.debugLineNum = 177405974;BA.debugLine="txtRGBColorFondoFilasPares.Text=\"#F1F1F1\"";
__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("#F1F1F1");
RDebugUtils.currentLine=177405975;
 //BA.debugLineNum = 177405975;BA.debugLine="lblColorFondoFilasPares.Color=bc.IntsFromBytes(bc";
__ref._lblcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_bc.IntsFromBytes(_bc.HexToBytes("FF"+__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText().replace("#","")))[(int) (0)]);
RDebugUtils.currentLine=177405977;
 //BA.debugLineNum = 177405977;BA.debugLine="NewFile";
__ref._newfile /*void*/ (null);
RDebugUtils.currentLine=177405978;
 //BA.debugLineNum = 177405978;BA.debugLine="wait for NewFile_Completed";
parent.__c.WaitFor("newfile_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnunew_action"), null);
this.state = 8;
return;
case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=177405980;
 //BA.debugLineNum = 177405980;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _loadfile(b4j.docU.jamtableclvcamposbuilder __ref,String _f) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "loadfile", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "loadfile", new Object[] {_f}));}
ResumableSub_LoadFile rsub = new ResumableSub_LoadFile(this,__ref,_f);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_LoadFile extends BA.ResumableSub {
public ResumableSub_LoadFile(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,String _f) {
this.parent = parent;
this.__ref = __ref;
this._f = _f;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
String _f;
boolean _cancel = false;
String _s = "";
String _datetimeformatant = "";
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177209345;
 //BA.debugLineNum = 177209345;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "loadfile"), __ref._checkchanges /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 23;
return;
case 23:
//C
this.state = 1;
_cancel = (boolean) result[1];
;
RDebugUtils.currentLine=177209346;
 //BA.debugLineNum = 177209346;BA.debugLine="If Cancel Then Return False";
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
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=177209347;
 //BA.debugLineNum = 177209347;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=177209348;
 //BA.debugLineNum = 177209348;BA.debugLine="Try";
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
RDebugUtils.currentLine=177209349;
 //BA.debugLineNum = 177209349;BA.debugLine="Dim s As String = File.ReadString(f, \"\")";
_s = parent.__c.File.ReadString(_f,"");
RDebugUtils.currentLine=177209350;
 //BA.debugLineNum = 177209350;BA.debugLine="CurrentFileString = s";
__ref._currentfilestring /*String*/  = _s;
RDebugUtils.currentLine=177209351;
 //BA.debugLineNum = 177209351;BA.debugLine="clvListaCampos.Clear";
__ref._clvlistacampos /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=177209352;
 //BA.debugLineNum = 177209352;BA.debugLine="lstPrimaryKey.Initialize";
__ref._lstprimarykey /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=177209353;
 //BA.debugLineNum = 177209353;BA.debugLine="SetCurrentFile(f)";
__ref._setcurrentfile /*String*/ (null,_f);
RDebugUtils.currentLine=177209355;
 //BA.debugLineNum = 177209355;BA.debugLine="AddItemsFromString(s)";
__ref._additemsfromstring /*String*/ (null,_s);
RDebugUtils.currentLine=177209356;
 //BA.debugLineNum = 177209356;BA.debugLine="Wait For AddItemsFromString_Completed";
parent.__c.WaitFor("additemsfromstring_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "loadfile"), null);
this.state = 24;
return;
case 24:
//C
this.state = 10;
;
RDebugUtils.currentLine=177209358;
 //BA.debugLineNum = 177209358;BA.debugLine="dragger.AddDragButtons";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._adddragbuttons /*String*/ (null);
RDebugUtils.currentLine=177209360;
 //BA.debugLineNum = 177209360;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Query\"";
if (true) break;

case 10:
//if
this.state = 13;
if ((__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ).equals("JRDC Query")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=177209361;
 //BA.debugLineNum = 177209361;BA.debugLine="CargaCamposJRDCQuery(txtIpJRDC.Text,txtPuertoJR";
__ref._cargacamposjrdcquery /*void*/ (null,__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=177209362;
 //BA.debugLineNum = 177209362;BA.debugLine="wait for CargaCamposJRDCQuery_Completed";
parent.__c.WaitFor("cargacamposjrdcquery_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "loadfile"), null);
this.state = 25;
return;
case 25:
//C
this.state = 13;
;
 if (true) break;
;
RDebugUtils.currentLine=177209364;
 //BA.debugLineNum = 177209364;BA.debugLine="If DatosOrigenDatos.TipoOrigenDatos=\"JRDC Table\"";

case 13:
//if
this.state = 16;
if ((__ref._datosorigendatos /*b4j.docU.jamtableviewcamposbuilder._tipoorigendatos*/ .TipoOrigenDatos /*String*/ ).equals("JRDC Table")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=177209365;
 //BA.debugLineNum = 177209365;BA.debugLine="CargaCamposJRDCTable(txtIpJRDC.Text,txtPuertoJR";
__ref._cargacamposjrdctable /*void*/ (null,__ref._txtipjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),(int)(Double.parseDouble(__ref._txtpuertojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())),__ref._txtcomandojrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._txtparametrosjrdc /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=177209366;
 //BA.debugLineNum = 177209366;BA.debugLine="Wait For CargaCamposJRDCTable_Completed";
parent.__c.WaitFor("cargacamposjrdctable_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "loadfile"), null);
this.state = 26;
return;
case 26:
//C
this.state = 16;
;
 if (true) break;
;
RDebugUtils.currentLine=177209368;
 //BA.debugLineNum = 177209368;BA.debugLine="If FechaUltimaModificacion>-1 Then";

case 16:
//if
this.state = 19;
if (__ref._fechaultimamodificacion /*long*/ >-1) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=177209369;
 //BA.debugLineNum = 177209369;BA.debugLine="Dim DateTimeFormatAnt As String=DateTime.DateFo";
_datetimeformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=177209370;
 //BA.debugLineNum = 177209370;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=177209371;
 //BA.debugLineNum = 177209371;BA.debugLine="frm.Title=frm.Title & \"   Fecha última modifica";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getTitle()+"   Fecha última modificación: "+parent.__c.DateTime.Date(__ref._fechaultimamodificacion /*long*/ ));
RDebugUtils.currentLine=177209372;
 //BA.debugLineNum = 177209372;BA.debugLine="DateTime.DateFormat=DateTimeFormatAnt";
parent.__c.DateTime.setDateFormat(_datetimeformatant);
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
RDebugUtils.currentLine=177209375;
 //BA.debugLineNum = 177209375;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=177209376;
 //BA.debugLineNum = 177209376;BA.debugLine="wait for (Dialog.Show(LastException.Message, \"Ok";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "loadfile"), __ref._dialog /*b4j.docU.b4xdialog*/ ._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(parent.__c.LastException(ba).getMessage()),(Object)("Ok"),(Object)(""),(Object)("")));
this.state = 27;
return;
case 27:
//C
this.state = 22;
_rint = (int) result[1];
;
RDebugUtils.currentLine=177209377;
 //BA.debugLineNum = 177209377;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=177209380;
 //BA.debugLineNum = 177209380;BA.debugLine="RecalcularIDOrdenColumnas";
__ref._recalcularidordencolumnas /*String*/ (null);
RDebugUtils.currentLine=177209381;
 //BA.debugLineNum = 177209381;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=177209382;
 //BA.debugLineNum = 177209382;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=177209383;
 //BA.debugLineNum = 177209383;BA.debugLine="End Sub";
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
public void  _lblcolorbordeitems_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorbordeitems_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorbordeitems_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorBordeItems_MouseClicked rsub = new ResumableSub_lblColorBordeItems_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorBordeItems_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorBordeItems_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180355073;
 //BA.debugLineNum = 180355073;BA.debugLine="Dialog.Title=\"Selecciona color Borde para los Ite";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona color Borde para los Items");
RDebugUtils.currentLine=180355074;
 //BA.debugLineNum = 180355074;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=180355075;
 //BA.debugLineNum = 180355075;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=180355076;
 //BA.debugLineNum = 180355076;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=180355077;
 //BA.debugLineNum = 180355077;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorbordeitems_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=180355079;
 //BA.debugLineNum = 180355079;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=180355080;
 //BA.debugLineNum = 180355080;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180355081;
 //BA.debugLineNum = 180355081;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorB";
__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._setselectedcolor /*int*/ (null,__ref._lblcolorbordeitems /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=180355082;
 //BA.debugLineNum = 180355082;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180355083;
 //BA.debugLineNum = 180355083;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180355084;
 //BA.debugLineNum = 180355084;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180355085;
 //BA.debugLineNum = 180355085;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=180355086;
 //BA.debugLineNum = 180355086;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorbordeitems_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180355087;
 //BA.debugLineNum = 180355087;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180355088;
 //BA.debugLineNum = 180355088;BA.debugLine="lblColorBordeItems.Color=BCColorPickerjamTableVie";
__ref._lblcolorbordeitems /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=180355089;
 //BA.debugLineNum = 180355089;BA.debugLine="txtRGBColorBordeItems.Text=GetCssColorStringFromI";
__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._lblcolorbordeitems /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=180355090;
 //BA.debugLineNum = 180355090;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblcolorfondoencabezados_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblColorFondoEncabezados_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180027393;
 //BA.debugLineNum = 180027393;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Encabezados\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona color Fondo Encabezados");
RDebugUtils.currentLine=180027394;
 //BA.debugLineNum = 180027394;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=180027395;
 //BA.debugLineNum = 180027395;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=180027396;
 //BA.debugLineNum = 180027396;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=180027397;
 //BA.debugLineNum = 180027397;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondoencabezados_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=180027399;
 //BA.debugLineNum = 180027399;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=180027400;
 //BA.debugLineNum = 180027400;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180027401;
 //BA.debugLineNum = 180027401;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._setselectedcolor /*int*/ (null,__ref._lblcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=180027402;
 //BA.debugLineNum = 180027402;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180027403;
 //BA.debugLineNum = 180027403;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180027404;
 //BA.debugLineNum = 180027404;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180027405;
 //BA.debugLineNum = 180027405;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=180027406;
 //BA.debugLineNum = 180027406;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondoencabezados_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180027407;
 //BA.debugLineNum = 180027407;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180027408;
 //BA.debugLineNum = 180027408;BA.debugLine="lblColorFondoEncabezados.Color=BCColorPickerjamTa";
__ref._lblcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=180027409;
 //BA.debugLineNum = 180027409;BA.debugLine="txtRGBColorFondoEncabezados.Text=GetCssColorStrin";
__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._lblcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=180027410;
 //BA.debugLineNum = 180027410;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblcolorfondofilasimpares_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondofilasimpares_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondofilasimpares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasImpares_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180224001;
 //BA.debugLineNum = 180224001;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona color Fondo Filas Impares");
RDebugUtils.currentLine=180224002;
 //BA.debugLineNum = 180224002;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=180224003;
 //BA.debugLineNum = 180224003;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=180224004;
 //BA.debugLineNum = 180224004;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=180224005;
 //BA.debugLineNum = 180224005;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=180224007;
 //BA.debugLineNum = 180224007;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=180224008;
 //BA.debugLineNum = 180224008;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180224009;
 //BA.debugLineNum = 180224009;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._setselectedcolor /*int*/ (null,__ref._lblcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=180224010;
 //BA.debugLineNum = 180224010;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180224011;
 //BA.debugLineNum = 180224011;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180224012;
 //BA.debugLineNum = 180224012;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180224013;
 //BA.debugLineNum = 180224013;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=180224014;
 //BA.debugLineNum = 180224014;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilasimpares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180224015;
 //BA.debugLineNum = 180224015;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180224016;
 //BA.debugLineNum = 180224016;BA.debugLine="lblColorFondoFilasImpares.Color=BCColorPickerjamT";
__ref._lblcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=180224017;
 //BA.debugLineNum = 180224017;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._lblcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=180224018;
 //BA.debugLineNum = 180224018;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblcolorfondofilaspares_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondofilaspares_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondofilaspares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblColorFondoFilasPares_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoFilasPares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180289537;
 //BA.debugLineNum = 180289537;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Filas Impare";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona color Fondo Filas Impares");
RDebugUtils.currentLine=180289538;
 //BA.debugLineNum = 180289538;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=180289539;
 //BA.debugLineNum = 180289539;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=180289540;
 //BA.debugLineNum = 180289540;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=180289541;
 //BA.debugLineNum = 180289541;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilaspares_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=180289543;
 //BA.debugLineNum = 180289543;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=180289544;
 //BA.debugLineNum = 180289544;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180289545;
 //BA.debugLineNum = 180289545;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._setselectedcolor /*int*/ (null,__ref._lblcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=180289546;
 //BA.debugLineNum = 180289546;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180289547;
 //BA.debugLineNum = 180289547;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180289548;
 //BA.debugLineNum = 180289548;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180289549;
 //BA.debugLineNum = 180289549;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=180289550;
 //BA.debugLineNum = 180289550;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondofilaspares_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180289551;
 //BA.debugLineNum = 180289551;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180289552;
 //BA.debugLineNum = 180289552;BA.debugLine="lblColorFondoFilasPares.Color=BCColorPickerjamTab";
__ref._lblcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=180289553;
 //BA.debugLineNum = 180289553;BA.debugLine="txtRGBColorFondoFilasPares.Text=GetCssColorString";
__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._lblcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=180289554;
 //BA.debugLineNum = 180289554;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblcolorfondopanelinfo_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolorfondopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolorfondopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorFondoPanelInfo_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180158465;
 //BA.debugLineNum = 180158465;BA.debugLine="Dialog.Title=\"Selecciona color Fondo Panel Info\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona color Fondo Panel Info");
RDebugUtils.currentLine=180158466;
 //BA.debugLineNum = 180158466;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=180158467;
 //BA.debugLineNum = 180158467;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=180158468;
 //BA.debugLineNum = 180158468;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=180158469;
 //BA.debugLineNum = 180158469;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=180158471;
 //BA.debugLineNum = 180158471;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=180158472;
 //BA.debugLineNum = 180158472;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180158473;
 //BA.debugLineNum = 180158473;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorF";
__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._setselectedcolor /*int*/ (null,__ref._lblcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=180158474;
 //BA.debugLineNum = 180158474;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180158475;
 //BA.debugLineNum = 180158475;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180158476;
 //BA.debugLineNum = 180158476;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180158477;
 //BA.debugLineNum = 180158477;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=180158478;
 //BA.debugLineNum = 180158478;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolorfondopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180158479;
 //BA.debugLineNum = 180158479;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180158480;
 //BA.debugLineNum = 180158480;BA.debugLine="lblColorFondoPanelInfo.Color=BCColorPickerjamTabl";
__ref._lblcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=180158481;
 //BA.debugLineNum = 180158481;BA.debugLine="txtRGBColorFondoPanelInfo.Text=GetCssColorStringF";
__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._lblcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=180158482;
 //BA.debugLineNum = 180158482;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblcolortextoencabezados_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolortextoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolortextoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblColorTextoEncabezados_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=179961857;
 //BA.debugLineNum = 179961857;BA.debugLine="Dialog.Title=\"Selecciona color Texto Encabezados\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona color Texto Encabezados");
RDebugUtils.currentLine=179961858;
 //BA.debugLineNum = 179961858;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=179961859;
 //BA.debugLineNum = 179961859;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=179961860;
 //BA.debugLineNum = 179961860;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=179961861;
 //BA.debugLineNum = 179961861;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolortextoencabezados_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=179961863;
 //BA.debugLineNum = 179961863;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=179961864;
 //BA.debugLineNum = 179961864;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=179961865;
 //BA.debugLineNum = 179961865;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._setselectedcolor /*int*/ (null,__ref._lblcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=179961866;
 //BA.debugLineNum = 179961866;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=179961867;
 //BA.debugLineNum = 179961867;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=179961868;
 //BA.debugLineNum = 179961868;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=179961869;
 //BA.debugLineNum = 179961869;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=179961870;
 //BA.debugLineNum = 179961870;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolortextoencabezados_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=179961871;
 //BA.debugLineNum = 179961871;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=179961872;
 //BA.debugLineNum = 179961872;BA.debugLine="lblColorTextoEncabezados.Color=BCColorPickerjamTa";
__ref._lblcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=179961873;
 //BA.debugLineNum = 179961873;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._lblcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=179961874;
 //BA.debugLineNum = 179961874;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblcolortextopanelinfo_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblcolortextopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblcolortextopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblColorTextoPanelInfo_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180092929;
 //BA.debugLineNum = 180092929;BA.debugLine="Dialog.Title=\"Selecciona color Texto Panel Info\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona color Texto Panel Info");
RDebugUtils.currentLine=180092930;
 //BA.debugLineNum = 180092930;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=180092931;
 //BA.debugLineNum = 180092931;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 600dip, 300dip)";
_p.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=180092932;
 //BA.debugLineNum = 180092932;BA.debugLine="p.LoadLayout(\"scrBCColorPickerJamTableView\")";
_p.LoadLayout("scrBCColorPickerJamTableView",ba);
RDebugUtils.currentLine=180092933;
 //BA.debugLineNum = 180092933;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolortextopanelinfo_mouseclicked"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=180092935;
 //BA.debugLineNum = 180092935;BA.debugLine="Dialog.PutAtTop = False 'put the dialog at the to";
__ref._dialog /*b4j.docU.b4xdialog*/ ._putattop /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=180092936;
 //BA.debugLineNum = 180092936;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(p, \"OK";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_p,(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=180092937;
 //BA.debugLineNum = 180092937;BA.debugLine="BCColorPickerjamTableView.SelectedColor=lblColorT";
__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._setselectedcolor /*int*/ (null,__ref._lblcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor());
RDebugUtils.currentLine=180092938;
 //BA.debugLineNum = 180092938;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=180092939;
 //BA.debugLineNum = 180092939;BA.debugLine="bCancel.left=bCancel.left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180092940;
 //BA.debugLineNum = 180092940;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=180092941;
 //BA.debugLineNum = 180092941;BA.debugLine="bCancel.Textsize=16";
_bcancel.setTextSize(16);
RDebugUtils.currentLine=180092942;
 //BA.debugLineNum = 180092942;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblcolortextopanelinfo_mouseclicked"), _rsub);
this.state = 8;
return;
case 8:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180092943;
 //BA.debugLineNum = 180092943;BA.debugLine="If Result <> xui.DialogResponse_Positive Then Ret";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180092944;
 //BA.debugLineNum = 180092944;BA.debugLine="lblColorTextoPanelInfo.Color=BCColorPickerjamTabl";
__ref._lblcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._bccolorpickerjamtableview /*b4j.docU.bccolorpicker*/ ._getselectedcolor /*int*/ (null));
RDebugUtils.currentLine=180092945;
 //BA.debugLineNum = 180092945;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._lblcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getColor()));
RDebugUtils.currentLine=180092946;
 //BA.debugLineNum = 180092946;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _lblinfo_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblinfo_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "lblinfo_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=179044352;
 //BA.debugLineNum = 179044352;BA.debugLine="private Sub lblInfo_MouseClicked (EventData As Mou";
RDebugUtils.currentLine=179044354;
 //BA.debugLineNum = 179044354;BA.debugLine="End Sub";
return "";
}
public void  _lblresetcolorbordeitems_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorbordeitems_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorbordeitems_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorBordeItems_MouseClicked rsub = new ResumableSub_lblResetColorBordeItems_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorBordeItems_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorBordeItems_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180813825;
 //BA.debugLineNum = 180813825;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear el color del Borde de los Items a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=180813826;
 //BA.debugLineNum = 180813826;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblresetcolorbordeitems_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180813827;
 //BA.debugLineNum = 180813827;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180813828;
 //BA.debugLineNum = 180813828;BA.debugLine="txtRGBColorBordeItems.Text=GetCssColorStringFromI";
__ref._txtrgbcolorbordeitems /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,((int)0xff808080)));
RDebugUtils.currentLine=180813829;
 //BA.debugLineNum = 180813829;BA.debugLine="lblColorBordeItems.Color=0xFF808080";
__ref._lblcolorbordeitems /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff808080));
RDebugUtils.currentLine=180813830;
 //BA.debugLineNum = 180813830;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblresetcolorfondoencabezados_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorFondoEncabezados_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180420609;
 //BA.debugLineNum = 180420609;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear el color de Fondo de los Encabezados a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=180420610;
 //BA.debugLineNum = 180420610;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblresetcolorfondoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180420611;
 //BA.debugLineNum = 180420611;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180420612;
 //BA.debugLineNum = 180420612;BA.debugLine="txtRGBColorFondoEncabezados.Text=\"#004B55\"";
__ref._txtrgbcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("#004B55");
RDebugUtils.currentLine=180420613;
 //BA.debugLineNum = 180420613;BA.debugLine="lblColorFondoEncabezados.Color=HexToColor(\"#004B5";
__ref._lblcolorfondoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._hextocolor /*int*/ (null,"#004B55"));
RDebugUtils.currentLine=180420614;
 //BA.debugLineNum = 180420614;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblresetcolorfondofilaspares_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondofilaspares_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondofilaspares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoFilasPares_MouseClicked rsub = new ResumableSub_lblResetColorFondoFilasPares_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoFilasPares_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoFilasPares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180748289;
 //BA.debugLineNum = 180748289;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear el color de Fondo de las Filas Pares a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=180748290;
 //BA.debugLineNum = 180748290;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblresetcolorfondofilaspares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180748291;
 //BA.debugLineNum = 180748291;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180748292;
 //BA.debugLineNum = 180748292;BA.debugLine="txtRGBColorFondoFilasPares.Text=GetCssColorString";
__ref._txtrgbcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,((int)0xfff1f1f1)));
RDebugUtils.currentLine=180748293;
 //BA.debugLineNum = 180748293;BA.debugLine="lblColorFondoFilasPares.Color=0xFFF1F1F1";
__ref._lblcolorfondofilaspares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xfff1f1f1));
RDebugUtils.currentLine=180748294;
 //BA.debugLineNum = 180748294;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblresetcolorfondopanelinfo_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolorfondopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolorfondopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorFondoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorFondoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorFondoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180551681;
 //BA.debugLineNum = 180551681;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear el color de Fondo del Panel Info a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=180551682;
 //BA.debugLineNum = 180551682;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblresetcolorfondopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180551683;
 //BA.debugLineNum = 180551683;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180551684;
 //BA.debugLineNum = 180551684;BA.debugLine="txtRGBColorFondoPanelInfo.Text=\"#FFF8C3\"";
__ref._txtrgbcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("#FFF8C3");
RDebugUtils.currentLine=180551685;
 //BA.debugLineNum = 180551685;BA.debugLine="lblColorFondoPanelInfo.Color=HexToColor(\"#FFF8C3\"";
__ref._lblcolorfondopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._hextocolor /*int*/ (null,"#FFF8C3"));
RDebugUtils.currentLine=180551686;
 //BA.debugLineNum = 180551686;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblresetcolortextoencabezados_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolortextoencabezados_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolortextoencabezados_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorTextoEncabezados_MouseClicked rsub = new ResumableSub_lblResetColorTextoEncabezados_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorTextoEncabezados_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoEncabezados_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180486145;
 //BA.debugLineNum = 180486145;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear el color del Texto de los Encabezados a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=180486146;
 //BA.debugLineNum = 180486146;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblresetcolortextoencabezados_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180486147;
 //BA.debugLineNum = 180486147;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180486148;
 //BA.debugLineNum = 180486148;BA.debugLine="txtRGBColorTextoEncabezados.Text=GetCssColorStrin";
__ref._txtrgbcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White));
RDebugUtils.currentLine=180486149;
 //BA.debugLineNum = 180486149;BA.debugLine="lblColorTextoEncabezados.Color=xui.Color_White";
__ref._lblcolortextoencabezados /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=180486150;
 //BA.debugLineNum = 180486150;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lblresetcolortextopanelinfo_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "lblresetcolortextopanelinfo_mouseclicked", true))
	 {Debug.delegate(ba, "lblresetcolortextopanelinfo_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_lblResetColorTextoPanelInfo_MouseClicked rsub = new ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_lblResetColorTextoPanelInfo_MouseClicked extends BA.ResumableSub {
public ResumableSub_lblResetColorTextoPanelInfo_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180617217;
 //BA.debugLineNum = 180617217;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear el color del Texto del Panel Info a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=180617218;
 //BA.debugLineNum = 180617218;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "lblresetcolortextopanelinfo_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180617219;
 //BA.debugLineNum = 180617219;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180617220;
 //BA.debugLineNum = 180617220;BA.debugLine="txtRGBColorTextoPanelInfo.Text=GetCssColorStringF";
__ref._txtrgbcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black));
RDebugUtils.currentLine=180617221;
 //BA.debugLineNum = 180617221;BA.debugLine="lblColorTextoPanelInfo.Color=xui.Color_Black";
__ref._lblcolortextopanelinfo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=180617222;
 //BA.debugLineNum = 180617222;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mainform_resize(b4j.docU.jamtableclvcamposbuilder __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=176488448;
 //BA.debugLineNum = 176488448;BA.debugLine="private Sub MainForm_Resize (Width As Double, Heig";
RDebugUtils.currentLine=176488449;
 //BA.debugLineNum = 176488449;BA.debugLine="dragger.Resize";
__ref._dragger /*b4j.docU.jamtableclvclvdragger*/ ._resize /*String*/ (null);
RDebugUtils.currentLine=176488450;
 //BA.debugLineNum = 176488450;BA.debugLine="End Sub";
return "";
}
public void  _mnuhelp_action(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mnuhelp_action", true))
	 {Debug.delegate(ba, "mnuhelp_action", null); return;}
ResumableSub_mnuHelp_Action rsub = new ResumableSub_mnuHelp_Action(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuHelp_Action extends BA.ResumableSub {
public ResumableSub_mnuHelp_Action(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=179175425;
 //BA.debugLineNum = 179175425;BA.debugLine="wait for (Help) complete (rBool As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnuhelp_action"), __ref._help /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=179175426;
 //BA.debugLineNum = 179175426;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mnuload_action(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mnuload_action", true))
	 {Debug.delegate(ba, "mnuload_action", null); return;}
ResumableSub_mnuLoad_Action rsub = new ResumableSub_mnuLoad_Action(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuLoad_Action extends BA.ResumableSub {
public ResumableSub_mnuLoad_Action(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
String _f = "";
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=177143809;
 //BA.debugLineNum = 177143809;BA.debugLine="Dim f As String = FileChooser.ShowOpen(frm)";
_f = __ref._filechooser /*anywheresoftware.b4j.objects.FileChooserWrapper*/ .ShowOpen(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=177143810;
 //BA.debugLineNum = 177143810;BA.debugLine="If f <> \"\" Then";
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
RDebugUtils.currentLine=177143811;
 //BA.debugLineNum = 177143811;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=177143812;
 //BA.debugLineNum = 177143812;BA.debugLine="DeshabilitarNodos";
__ref._deshabilitarnodos /*String*/ (null);
RDebugUtils.currentLine=177143813;
 //BA.debugLineNum = 177143813;BA.debugLine="wait for (LoadFile(f)) complete (rBool As Boolea";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnuload_action"), __ref._loadfile /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_f));
this.state = 5;
return;
case 5:
//C
this.state = 4;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=177143814;
 //BA.debugLineNum = 177143814;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=177143815;
 //BA.debugLineNum = 177143815;BA.debugLine="HabilitarNodos";
__ref._habilitarnodos /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=177143817;
 //BA.debugLineNum = 177143817;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _newfile(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "newfile", true))
	 {Debug.delegate(ba, "newfile", null); return;}
ResumableSub_NewFile rsub = new ResumableSub_NewFile(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_NewFile extends BA.ResumableSub {
public ResumableSub_NewFile(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=177471489;
 //BA.debugLineNum = 177471489;BA.debugLine="wait for (ConfigurarOrigenDatos) complete (rBool";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "newfile"), __ref._configurarorigendatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=177471490;
 //BA.debugLineNum = 177471490;BA.debugLine="CurrentFileString=ExportToString  ' crea un JSON";
__ref._currentfilestring /*String*/  = __ref._exporttostring /*String*/ (null);
RDebugUtils.currentLine=177471491;
 //BA.debugLineNum = 177471491;BA.debugLine="CallSubDelayed(Me,\"NewFile_Completed\")";
parent.__c.CallSubDelayed(ba,parent,"NewFile_Completed");
RDebugUtils.currentLine=177471492;
 //BA.debugLineNum = 177471492;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mnusalir_action(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mnusalir_action", true))
	 {Debug.delegate(ba, "mnusalir_action", null); return;}
ResumableSub_mnuSalir_Action rsub = new ResumableSub_mnuSalir_Action(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSalir_Action extends BA.ResumableSub {
public ResumableSub_mnuSalir_Action(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _cancel = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=176357377;
 //BA.debugLineNum = 176357377;BA.debugLine="Wait For (CheckChanges) Complete (Cancel As Boole";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnusalir_action"), __ref._checkchanges /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_cancel = (boolean) result[1];
;
RDebugUtils.currentLine=176357378;
 //BA.debugLineNum = 176357378;BA.debugLine="If Cancel Then Return";
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
RDebugUtils.currentLine=176357384;
 //BA.debugLineNum = 176357384;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=176357385;
 //BA.debugLineNum = 176357385;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mnusaveas_action(b4j.docU.jamtableclvcamposbuilder __ref) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "mnusaveas_action", true))
	 {Debug.delegate(ba, "mnusaveas_action", null); return;}
ResumableSub_mnuSaveAs_Action rsub = new ResumableSub_mnuSaveAs_Action(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_mnuSaveAs_Action extends BA.ResumableSub {
public ResumableSub_mnuSaveAs_Action(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
boolean _camposok = false;
Object _msa = null;
int _result = 0;
String _f = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=178323457;
 //BA.debugLineNum = 178323457;BA.debugLine="Wait For (CheckForWarnings) Complete (CamposOK As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnusaveas_action"), __ref._checkforwarnings /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_camposok = (boolean) result[1];
;
RDebugUtils.currentLine=178323458;
 //BA.debugLineNum = 178323458;BA.debugLine="If CamposOK Then";
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
RDebugUtils.currentLine=178323459;
 //BA.debugLineNum = 178323459;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ubicar el f";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Ubicar el fichero en el directorio FILES de la aplicación en la que se vaya a usar.","Aviso");
RDebugUtils.currentLine=178323460;
 //BA.debugLineNum = 178323460;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "mnusaveas_action"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
_result = (int) result[1];
;
RDebugUtils.currentLine=178323461;
 //BA.debugLineNum = 178323461;BA.debugLine="Dim f As String = FileChooser.ShowSave(frm)";
_f = __ref._filechooser /*anywheresoftware.b4j.objects.FileChooserWrapper*/ .ShowSave(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=178323462;
 //BA.debugLineNum = 178323462;BA.debugLine="If f = \"\" Then Return";
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
RDebugUtils.currentLine=178323463;
 //BA.debugLineNum = 178323463;BA.debugLine="SetCurrentFile(f)";
__ref._setcurrentfile /*String*/ (null,_f);
RDebugUtils.currentLine=178323464;
 //BA.debugLineNum = 178323464;BA.debugLine="mnuSave_Action";
__ref._mnusave_action /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=178323466;
 //BA.debugLineNum = 178323466;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _recent_click(b4j.docU.jamtableclvcamposbuilder __ref,String _recentfile) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "recent_click", true))
	 {Debug.delegate(ba, "recent_click", new Object[] {_recentfile}); return;}
ResumableSub_Recent_Click rsub = new ResumableSub_Recent_Click(this,__ref,_recentfile);
rsub.resume(ba, null);
}
public static class ResumableSub_Recent_Click extends BA.ResumableSub {
public ResumableSub_Recent_Click(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,String _recentfile) {
this.parent = parent;
this.__ref = __ref;
this._recentfile = _recentfile;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
String _recentfile;
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=176422913;
 //BA.debugLineNum = 176422913;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=176422914;
 //BA.debugLineNum = 176422914;BA.debugLine="DeshabilitarNodos";
__ref._deshabilitarnodos /*String*/ (null);
RDebugUtils.currentLine=176422915;
 //BA.debugLineNum = 176422915;BA.debugLine="wait for (LoadFile(RecentFile)) complete (rBool A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "recent_click"), __ref._loadfile /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_recentfile));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=176422916;
 //BA.debugLineNum = 176422916;BA.debugLine="HabilitarNodos";
__ref._habilitarnodos /*String*/ (null);
RDebugUtils.currentLine=176422917;
 //BA.debugLineNum = 176422917;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=176422918;
 //BA.debugLineNum = 176422918;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _resetcolorfondofilasimpares_mouseclicked(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "resetcolorfondofilasimpares_mouseclicked", true))
	 {Debug.delegate(ba, "resetcolorfondofilasimpares_mouseclicked", new Object[] {_eventdata}); return;}
ResumableSub_ResetColorFondoFilasImpares_MouseClicked rsub = new ResumableSub_ResetColorFondoFilasImpares_MouseClicked(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_ResetColorFondoFilasImpares_MouseClicked extends BA.ResumableSub {
public ResumableSub_ResetColorFondoFilasImpares_MouseClicked(b4j.docU.jamtableclvcamposbuilder parent,b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvcamposbuilder __ref;
b4j.docU.jamtableclvcamposbuilder parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvcamposbuilder";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=180682753;
 //BA.debugLineNum = 180682753;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear el color de Fondo de las Filas Impares a su valor por defecto?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=180682754;
 //BA.debugLineNum = 180682754;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvcamposbuilder", "resetcolorfondofilasimpares_mouseclicked"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=180682755;
 //BA.debugLineNum = 180682755;BA.debugLine="If Result <>xui.DialogResponse_Positive Then Retu";
if (true) break;

case 1:
//if
this.state = 6;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=180682756;
 //BA.debugLineNum = 180682756;BA.debugLine="txtRGBColorFondoFilasImpares.Text=GetCssColorStri";
__ref._txtrgbcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White));
RDebugUtils.currentLine=180682757;
 //BA.debugLineNum = 180682757;BA.debugLine="lblColorFondoFilasImpares.Color=xui.Color_White";
__ref._lblcolorfondofilasimpares /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=180682758;
 //BA.debugLineNum = 180682758;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setformmaximized(b4j.docU.jamtableclvcamposbuilder __ref,anywheresoftware.b4j.objects.Form _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "setformmaximized", true))
	 {return ((String) Debug.delegate(ba, "setformmaximized", new Object[] {_f}));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=176226304;
 //BA.debugLineNum = 176226304;BA.debugLine="private Sub SetFormMaximized(f As Form)";
RDebugUtils.currentLine=176226306;
 //BA.debugLineNum = 176226306;BA.debugLine="Dim joForm As JavaObject = f";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=176226308;
 //BA.debugLineNum = 176226308;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=176226310;
 //BA.debugLineNum = 176226310;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=176226311;
 //BA.debugLineNum = 176226311;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemedate(b4j.docU.jamtableclvcamposbuilder __ref,b4j.docU.b4xdatetemplate _datetemplate) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemedate", true))
	 {return ((String) Debug.delegate(ba, "setlightthemedate", new Object[] {_datetemplate}));}
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=181272576;
 //BA.debugLineNum = 181272576;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
RDebugUtils.currentLine=181272577;
 //BA.debugLineNum = 181272577;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=181272578;
 //BA.debugLineNum = 181272578;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
_datetemplate._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=181272579;
 //BA.debugLineNum = 181272579;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x39),((int)0xd7),((int)0xce));
RDebugUtils.currentLine=181272580;
 //BA.debugLineNum = 181272580;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
_datetemplate._highlightedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x00),((int)0xce),((int)0xff));
RDebugUtils.currentLine=181272581;
 //BA.debugLineNum = 181272581;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
_datetemplate._daysinmonthcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=181272582;
 //BA.debugLineNum = 181272582;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
_datetemplate._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=181272583;
 //BA.debugLineNum = 181272583;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
_datetemplate._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=181272584;
 //BA.debugLineNum = 181272584;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0xff),((int)0xa7),((int)0x61));
RDebugUtils.currentLine=181272585;
 //BA.debugLineNum = 181272585;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group9 = new Object[]{(Object)(_datetemplate._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen9 = group9.length
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group9[index9]));
RDebugUtils.currentLine=181272586;
 //BA.debugLineNum = 181272586;BA.debugLine="x.Color = xui.Color_Transparent";
_x.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
 }
};
RDebugUtils.currentLine=181272588;
 //BA.debugLineNum = 181272588;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemeinput(b4j.docU.jamtableclvcamposbuilder __ref,b4j.docU.b4xinputtemplate _input) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemeinput", true))
	 {return ((String) Debug.delegate(ba, "setlightthemeinput", new Object[] {_input}));}
int _textcolor = 0;
RDebugUtils.currentLine=181141504;
 //BA.debugLineNum = 181141504;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
RDebugUtils.currentLine=181141505;
 //BA.debugLineNum = 181141505;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=181141506;
 //BA.debugLineNum = 181141506;BA.debugLine="input.TextField1.TextColor = TextColor";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=181141507;
 //BA.debugLineNum = 181141507;BA.debugLine="input.lblTitle.TextColor = TextColor";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=181141508;
 //BA.debugLineNum = 181141508;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
_input._setbordercolor /*String*/ (null,_textcolor,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=181141509;
 //BA.debugLineNum = 181141509;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemelist(b4j.docU.jamtableclvcamposbuilder __ref,b4j.docU.b4xlisttemplate _list) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvcamposbuilder";
if (Debug.shouldDelegate(ba, "setlightthemelist", true))
	 {return ((String) Debug.delegate(ba, "setlightthemelist", new Object[] {_list}));}
int _textcolor = 0;
RDebugUtils.currentLine=181075968;
 //BA.debugLineNum = 181075968;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
RDebugUtils.currentLine=181075969;
 //BA.debugLineNum = 181075969;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=181075970;
 //BA.debugLineNum = 181075970;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=181075971;
 //BA.debugLineNum = 181075971;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=181075972;
 //BA.debugLineNum = 181075972;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=181075973;
 //BA.debugLineNum = 181075973;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=181075974;
 //BA.debugLineNum = 181075974;BA.debugLine="End Sub";
return "";
}
}