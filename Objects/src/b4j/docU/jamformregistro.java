package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jamformregistro extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamformregistro", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jamformregistro.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _tipoorigendatosjamformregistro{
public boolean IsInitialized;
public String IpJRDC;
public String PuertoJRDC;
public String NombreTabla;
public String DBMS;
public void Initialize() {
IsInitialized = true;
IpJRDC = "";
PuertoJRDC = "";
NombreTabla = "";
DBMS = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _infocampojamformregistro{
public boolean IsInitialized;
public String CampoSQL;
public String TipoDatoSQL;
public String TipoColumnaSQL;
public boolean NoNuloSQL;
public boolean PrimaryKeySQL;
public boolean AutoIncrementalSQL;
public Object ValorCampoPorDefectoSQL;
public Object ValorInputCampo;
public String TituloCampo;
public String TipoDato;
public boolean EsFecha;
public boolean CampoObligatorioCumplimentar;
public String TipoControl;
public String InfoCampo;
public boolean ControlEditable;
public Object ControlDatoCampo;
public String TipoDatosAux;
public anywheresoftware.b4a.objects.collections.List ListaValoresDatosAux;
public String IPJrdcOrigenDatosAux;
public String PuertoJrdcOrigenDatosAux;
public String ComandoConfigDatosAux;
public anywheresoftware.b4a.objects.collections.List ParametrosComandoDatosAux;
public int NumCamposDatosAux;
public Object ValorOutputCampo;
public Object ValorMostrarCampoFormulario;
public int OrdenCampo;
public void Initialize() {
IsInitialized = true;
CampoSQL = "";
TipoDatoSQL = "";
TipoColumnaSQL = "";
NoNuloSQL = false;
PrimaryKeySQL = false;
AutoIncrementalSQL = false;
ValorCampoPorDefectoSQL = new Object();
ValorInputCampo = new Object();
TituloCampo = "";
TipoDato = "";
EsFecha = false;
CampoObligatorioCumplimentar = false;
TipoControl = "";
InfoCampo = "";
ControlEditable = false;
ControlDatoCampo = new Object();
TipoDatosAux = "";
ListaValoresDatosAux = new anywheresoftware.b4a.objects.collections.List();
IPJrdcOrigenDatosAux = "";
PuertoJrdcOrigenDatosAux = "";
ComandoConfigDatosAux = "";
ParametrosComandoDatosAux = new anywheresoftware.b4a.objects.collections.List();
NumCamposDatosAux = 0;
ValorOutputCampo = new Object();
ValorMostrarCampoFormulario = new Object();
OrdenCampo = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frmreg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _meventname = "";
public Object _mcallback = null;
public String _mmodoregistro = "";
public anywheresoftware.b4j.objects.ButtonWrapper _btncancelar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnok = null;
public b4j.example.customlistview _clvcamposregistro = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmodoregistro = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmodoregistrofaweeditar = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmodoregistrofawenuevo = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblmodoregistrofawever = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitlemodoregistro = null;
public b4j.docU.jamformregistro._tipoorigendatosjamformregistro _datosorigendatosformregistro = null;
public anywheresoftware.b4a.objects.collections.List _lstitemsclv = null;
public boolean _cargandodatos = false;
public boolean _errorcargadatos = false;
public String _msgerrorcargadatos = "";
public int _colitemsimpares = 0;
public int _colitemspares = 0;
public String _tipocontrol_textfield = "";
public String _tipocontrol_b4xinputdialogtextfield = "";
public String _tipocontrol_b4xlistdialogtextfield = "";
public String _tipocontrol_b4xsearchlistdialogtextfield = "";
public String _tipocontrol_combobox = "";
public String _tipocontrol_lmb4xcombobox = "";
public String _tipocontrol_checkbox = "";
public String _tipocontrol_textfieldbuttonselfecha = "";
public String _tipocontrol_textfieldbuttonselfile = "";
public String _tipocontrol_textfieldbuttonselext = "";
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.b4xdatetemplate _datetemplate = null;
public b4j.docU.b4xinputtemplate _inputtemplate = null;
public anywheresoftware.b4a.objects.collections.Map _dragcoords = null;
public String _mnombreficherojson = "";
public anywheresoftware.b4a.objects.collections.Map _mdatosinputregistro = null;
public anywheresoftware.b4a.objects.collections.List _mlstinfocampossql = null;
public anywheresoftware.b4a.objects.collections.List _mlstinfocampos = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pnlfondoformregistro = null;
public anywheresoftware.b4j.objects.LabelWrapper _lbltitleitemcampo = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselficheroitemcampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtselficheroitemcampo = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkboxitemcampo = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechaitemcampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtselfechaitemcampo = null;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cboitemcampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtitemcampo = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblitemcampoobligatorio = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselvalorextitemcampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtselvalorextitemcampo = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnb4xinputdialogitemcampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtb4xinputdialogitemcampo = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnb4xlisttemplateitemcampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtb4xlisttemplateitemcampo = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnconfigurarjson = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnb4xsearchlisttemplateitemcampo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtb4xsearchlisttemplateitemcampo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnb4xinputdialogselficheroitemcampo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblinfocampotooltip = null;
public anywheresoftware.b4a.objects.collections.List _lstinfocampostooltip = null;
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
public String  _initialize(b4j.docU.jamformregistro __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4j.objects.Form _owner,String _title,String _modo,String _nombreficherojson,anywheresoftware.b4a.objects.collections.Map _datosinputregistro) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_owner,_title,_modo,_nombreficherojson,_datosinputregistro}));}
Object _k = null;
RDebugUtils.currentLine=124125184;
 //BA.debugLineNum = 124125184;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=124125186;
 //BA.debugLineNum = 124125186;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=124125187;
 //BA.debugLineNum = 124125187;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=124125188;
 //BA.debugLineNum = 124125188;BA.debugLine="frmReg.Initialize(\"frmReg\",500,0)";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frmReg",500,0);
RDebugUtils.currentLine=124125189;
 //BA.debugLineNum = 124125189;BA.debugLine="frmReg.SetOwner(Owner)";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .SetOwner(_owner);
RDebugUtils.currentLine=124125190;
 //BA.debugLineNum = 124125190;BA.debugLine="frmReg.BackColor = fx.Colors.Transparent";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .setBackColor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.Transparent);
RDebugUtils.currentLine=124125195;
 //BA.debugLineNum = 124125195;BA.debugLine="frmReg.SetFormStyle(\"UTILITY\")";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .SetFormStyle("UTILITY");
RDebugUtils.currentLine=124125196;
 //BA.debugLineNum = 124125196;BA.debugLine="frmReg.RootPane.Style = \"-fx-background-color:red";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setStyle("-fx-background-color:red;-fx-background-radius:48px;");
RDebugUtils.currentLine=124125197;
 //BA.debugLineNum = 124125197;BA.debugLine="frmReg.RootPane.LoadLayout(\"scrFormRegistro\")";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrFormRegistro");
RDebugUtils.currentLine=124125198;
 //BA.debugLineNum = 124125198;BA.debugLine="frmReg.Title=Title";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .setTitle(_title);
RDebugUtils.currentLine=124125201;
 //BA.debugLineNum = 124125201;BA.debugLine="btnConfigurarJSON.Visible=False";
__ref._btnconfigurarjson /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=124125203;
 //BA.debugLineNum = 124125203;BA.debugLine="btnConfigurarJSON.Visible=True";
__ref._btnconfigurarjson /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=124125205;
 //BA.debugLineNum = 124125205;BA.debugLine="lstItemsCLV.Initialize";
__ref._lstitemsclv /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=124125206;
 //BA.debugLineNum = 124125206;BA.debugLine="DatosOrigenDatosFormRegistro=CreateTipoOrigenDato";
__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/  = __ref._createtipoorigendatos /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ (null,"","","","");
RDebugUtils.currentLine=124125227;
 //BA.debugLineNum = 124125227;BA.debugLine="ColItemsPares=0xFFDCDCDC";
__ref._colitemspares /*int*/  = ((int)0xffdcdcdc);
RDebugUtils.currentLine=124125228;
 //BA.debugLineNum = 124125228;BA.debugLine="ColItemsImpares=0xFFEFEBE9";
__ref._colitemsimpares /*int*/  = ((int)0xffefebe9);
RDebugUtils.currentLine=124125230;
 //BA.debugLineNum = 124125230;BA.debugLine="mlstInfoCamposSQL.Initialize";
__ref._mlstinfocampossql /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=124125233;
 //BA.debugLineNum = 124125233;BA.debugLine="mModoRegistro=Modo";
__ref._mmodoregistro /*String*/  = _modo;
RDebugUtils.currentLine=124125234;
 //BA.debugLineNum = 124125234;BA.debugLine="If mModoRegistro=\"Editar\" Or mModoRegistro=\"Nuevo";
if ((__ref._mmodoregistro /*String*/ ).equals("Editar") || (__ref._mmodoregistro /*String*/ ).equals("Nuevo")) { 
RDebugUtils.currentLine=124125235;
 //BA.debugLineNum = 124125235;BA.debugLine="btnOK.Text=Chr(0xF0C7) & \" Grabar\"";
__ref._btnok /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xf0c7)))+" Grabar");
 };
RDebugUtils.currentLine=124125237;
 //BA.debugLineNum = 124125237;BA.debugLine="mDatosInputRegistro.Initialize";
__ref._mdatosinputregistro /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=124125238;
 //BA.debugLineNum = 124125238;BA.debugLine="For Each k In DatosInputRegistro.Keys";
{
final anywheresoftware.b4a.BA.IterableList group22 = _datosinputregistro.Keys();
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_k = group22.Get(index22);
RDebugUtils.currentLine=124125239;
 //BA.debugLineNum = 124125239;BA.debugLine="mDatosInputRegistro.Put(k,DatosInputRegistro.Get";
__ref._mdatosinputregistro /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_k,_datosinputregistro.Get(_k));
 }
};
RDebugUtils.currentLine=124125241;
 //BA.debugLineNum = 124125241;BA.debugLine="mNombreFicheroJSON=NombreFicheroJSON";
__ref._mnombreficherojson /*String*/  = _nombreficherojson;
RDebugUtils.currentLine=124125243;
 //BA.debugLineNum = 124125243;BA.debugLine="If mNombreFicheroJSON=\"\" Then";
if ((__ref._mnombreficherojson /*String*/ ).equals("")) { 
 };
RDebugUtils.currentLine=124125247;
 //BA.debugLineNum = 124125247;BA.debugLine="InicioPrev";
__ref._inicioprev /*void*/ (null);
RDebugUtils.currentLine=124125248;
 //BA.debugLineNum = 124125248;BA.debugLine="End Sub";
return "";
}
public b4j.docU.jamformregistro._infocampojamformregistro  _datoscamposeleccionado(b4j.docU.jamformregistro __ref,String _camposel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "datoscamposeleccionado", true))
	 {return ((b4j.docU.jamformregistro._infocampojamformregistro) Debug.delegate(ba, "datoscamposeleccionado", new Object[] {_camposel}));}
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfrnoencontrado = null;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
RDebugUtils.currentLine=125042688;
 //BA.debugLineNum = 125042688;BA.debugLine="public Sub DatosCampoSeleccionado(CampoSel As Stri";
RDebugUtils.currentLine=125042689;
 //BA.debugLineNum = 125042689;BA.debugLine="Dim infoCampojFrNoEncontrado As InfoCampoJamFormR";
_infocampojfrnoencontrado = new b4j.docU.jamformregistro._infocampojamformregistro();
RDebugUtils.currentLine=125042690;
 //BA.debugLineNum = 125042690;BA.debugLine="infoCampojFrNoEncontrado.Initialize";
_infocampojfrnoencontrado.Initialize();
RDebugUtils.currentLine=125042691;
 //BA.debugLineNum = 125042691;BA.debugLine="For Each infoCampojFr As InfoCampoJamFormRegistro";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(group3.Get(index3));
RDebugUtils.currentLine=125042692;
 //BA.debugLineNum = 125042692;BA.debugLine="If infoCampojFr.CampoSQL=CampoSel Then";
if ((_infocampojfr.CampoSQL /*String*/ ).equals(_camposel)) { 
RDebugUtils.currentLine=125042693;
 //BA.debugLineNum = 125042693;BA.debugLine="If infoCampojFr.ValorOutputCampo=Null Then";
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
RDebugUtils.currentLine=125042694;
 //BA.debugLineNum = 125042694;BA.debugLine="LogColor(\"ATENCION, posible error: ValorOutPut";
__c.LogImpl("9125042694","ATENCION, posible error: ValorOutPutCampo=NULL. Comprobar si se ha pasado el valor del campo "+_infocampojfr.CampoSQL /*String*/ +" en el mapa de initialize",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta);
 };
RDebugUtils.currentLine=125042696;
 //BA.debugLineNum = 125042696;BA.debugLine="Return infoCampojFr";
if (true) return _infocampojfr;
RDebugUtils.currentLine=125042697;
 //BA.debugLineNum = 125042697;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=125042700;
 //BA.debugLineNum = 125042700;BA.debugLine="LogColor(\"ERROR. No existe campo \" & CampoSel & \"";
__c.LogImpl("9125042700","ERROR. No existe campo "+_camposel+"!",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta);
RDebugUtils.currentLine=125042701;
 //BA.debugLineNum = 125042701;BA.debugLine="LogColor(\"Comprobar el parámetro \" & CampoSel & \"";
__c.LogImpl("9125042701","Comprobar el parámetro "+_camposel+" pasado al método DatosCampoSeleccionado de jamFormRegistro",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Magenta);
RDebugUtils.currentLine=125042702;
 //BA.debugLineNum = 125042702;BA.debugLine="fx.Msgbox(frmReg,\"ERROR. No existe campo \" & Camp";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ ,"ERROR. No existe campo "+_camposel+"!"+__c.CRLF+__c.CRLF+"Comprobar el parámetro "+_camposel+" pasado al método DatosCampoSeleccionado de jamFormRegistro"+__c.CRLF+__c.CRLF+"Avisa al administrador de la aplicación","Error");
RDebugUtils.currentLine=125042704;
 //BA.debugLineNum = 125042704;BA.debugLine="ExitApplication";
__c.ExitApplication();
RDebugUtils.currentLine=125042706;
 //BA.debugLineNum = 125042706;BA.debugLine="Return Null";
if (true) return (b4j.docU.jamformregistro._infocampojamformregistro)(__c.Null);
RDebugUtils.currentLine=125042723;
 //BA.debugLineNum = 125042723;BA.debugLine="End Sub";
return null;
}
public String  _cerrarformregistro(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cerrarformregistro", true))
	 {return ((String) Debug.delegate(ba, "cerrarformregistro", null));}
RDebugUtils.currentLine=125829120;
 //BA.debugLineNum = 125829120;BA.debugLine="public Sub CerrarFormRegistro";
RDebugUtils.currentLine=125829121;
 //BA.debugLineNum = 125829121;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=125829122;
 //BA.debugLineNum = 125829122;BA.debugLine="End Sub";
return "";
}
public String  _abrireditordecampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "abrireditordecampo", true))
	 {return ((String) Debug.delegate(ba, "abrireditordecampo", new Object[] {_idx}));}
b4j.docU.jamformregistro._infocampojamformregistro _clviv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xcontroldatocampo = null;
RDebugUtils.currentLine=127401984;
 //BA.debugLineNum = 127401984;BA.debugLine="Private Sub AbrirEditorDeCampo(idX As Int)";
RDebugUtils.currentLine=127401985;
 //BA.debugLineNum = 127401985;BA.debugLine="If idX<clvCamposRegistro.Size Then";
if (_idx<__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getsize()) { 
RDebugUtils.currentLine=127401986;
 //BA.debugLineNum = 127401986;BA.debugLine="Dim ClvIV As InfoCampoJamFormRegistro=clvCamposR";
_clviv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=127401987;
 //BA.debugLineNum = 127401987;BA.debugLine="If ClvIV.ControlEditable Then";
if (_clviv.ControlEditable /*boolean*/ ) { 
RDebugUtils.currentLine=127401988;
 //BA.debugLineNum = 127401988;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,(_clviv.TipoControl /*String*/ ).equals(__ref._tipocontrol_b4xinputdialogtextfield /*String*/ ),(_clviv.TipoControl /*String*/ ).equals(__ref._tipocontrol_b4xlistdialogtextfield /*String*/ ),(_clviv.TipoControl /*String*/ ).equals(__ref._tipocontrol_b4xsearchlistdialogtextfield /*String*/ ),(_clviv.TipoControl /*String*/ ).equals(__ref._tipocontrol_textfieldbuttonselext /*String*/ ),(_clviv.TipoControl /*String*/ ).equals(__ref._tipocontrol_textfieldbuttonselfecha /*String*/ ),(_clviv.TipoControl /*String*/ ).equals(__ref._tipocontrol_textfieldbuttonselfile /*String*/ ))) {
case 0: {
RDebugUtils.currentLine=127401990;
 //BA.debugLineNum = 127401990;BA.debugLine="MostrarB4XInputDialogItemCampo(idX)";
__ref._mostrarb4xinputdialogitemcampo /*void*/ (null,_idx);
 break; }
case 1: {
RDebugUtils.currentLine=127401992;
 //BA.debugLineNum = 127401992;BA.debugLine="MostrarB4XListTemplateItemCampo(idX)";
__ref._mostrarb4xlisttemplateitemcampo /*void*/ (null,_idx);
 break; }
case 2: {
RDebugUtils.currentLine=127401994;
 //BA.debugLineNum = 127401994;BA.debugLine="MostrarB4XSearchListTemplateItemCampo(idX)";
__ref._mostrarb4xsearchlisttemplateitemcampo /*void*/ (null,_idx);
 break; }
case 3: {
RDebugUtils.currentLine=127401996;
 //BA.debugLineNum = 127401996;BA.debugLine="MostrarSelValorExtItemCampo(idX)";
__ref._mostrarselvalorextitemcampo /*void*/ (null,_idx);
 break; }
case 4: {
RDebugUtils.currentLine=127401998;
 //BA.debugLineNum = 127401998;BA.debugLine="MostrarSelFechaItemCampo(idX)";
__ref._mostrarselfechaitemcampo /*void*/ (null,_idx);
 break; }
case 5: {
RDebugUtils.currentLine=127402000;
 //BA.debugLineNum = 127402000;BA.debugLine="MostrarSelFicheroItemCampo(idX)";
__ref._mostrarselficheroitemcampo /*void*/ (null,_idx);
 break; }
default: {
RDebugUtils.currentLine=127402002;
 //BA.debugLineNum = 127402002;BA.debugLine="Dim B4XControlDatoCampo As B4XView=ClvIV.Cont";
_b4xcontroldatocampo = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xcontroldatocampo = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_clviv.ControlDatoCampo /*Object*/ ));
RDebugUtils.currentLine=127402003;
 //BA.debugLineNum = 127402003;BA.debugLine="B4XControlDatoCampo.RequestFocus";
_b4xcontroldatocampo.RequestFocus();
 break; }
}
;
 }else {
RDebugUtils.currentLine=127402007;
 //BA.debugLineNum = 127402007;BA.debugLine="AbrirEditorDeCampo((idX+1))";
__ref._abrireditordecampo /*String*/ (null,(int) ((_idx+1)));
 };
 }else {
RDebugUtils.currentLine=127402010;
 //BA.debugLineNum = 127402010;BA.debugLine="btnOK.RequestFocus";
__ref._btnok /*anywheresoftware.b4j.objects.ButtonWrapper*/ .RequestFocus();
 };
RDebugUtils.currentLine=127402012;
 //BA.debugLineNum = 127402012;BA.debugLine="End Sub";
return "";
}
public void  _mostrarb4xinputdialogitemcampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "mostrarb4xinputdialogitemcampo", true))
	 {Debug.delegate(ba, "mostrarb4xinputdialogitemcampo", new Object[] {_idx}); return;}
ResumableSub_MostrarB4XInputDialogItemCampo rsub = new ResumableSub_MostrarB4XInputDialogItemCampo(this,__ref,_idx);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarB4XInputDialogItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarB4XInputDialogItemCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,int _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
int _idx;
b4j.docU.jamformregistro._infocampojamformregistro _clviv = null;
String _campo = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btokdlg = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btcanceldlg = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126091265;
 //BA.debugLineNum = 126091265;BA.debugLine="Dim clvIV As InfoCampoJamFormRegistro=clvCamposRe";
_clviv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=126091267;
 //BA.debugLineNum = 126091267;BA.debugLine="Dim Campo As String=clvIV.CampoSQL";
_campo = _clviv.CampoSQL /*String*/ ;
RDebugUtils.currentLine=126091270;
 //BA.debugLineNum = 126091270;BA.debugLine="Dialog.Title=\"Indica \" & clvIV.TituloCampo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica "+_clviv.TituloCampo /*String*/ );
RDebugUtils.currentLine=126091271;
 //BA.debugLineNum = 126091271;BA.debugLine="InputTemplate.Initialize";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=126091272;
 //BA.debugLineNum = 126091272;BA.debugLine="If clvIV.ValorOutputCampo<>Null Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_clviv.ValorOutputCampo /*Object*/ != null) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126091273;
 //BA.debugLineNum = 126091273;BA.debugLine="InputTemplate.Text=clvIV.ValorOutputCampo";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._text /*String*/  = BA.ObjectToString(_clviv.ValorOutputCampo /*Object*/ );
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=126091275;
 //BA.debugLineNum = 126091275;BA.debugLine="InputTemplate.lblTitle.Text=\"\"";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=126091276;
 //BA.debugLineNum = 126091276;BA.debugLine="Select True";
if (true) break;

case 5:
//select
this.state = 12;
switch (BA.switchObjectToInt(parent.__c.True,(_clviv.TipoDato /*String*/ ).equals("INTEGER"),(_clviv.TipoDato /*String*/ ).equals("TEXT"),(_clviv.TipoDato /*String*/ ).equals("REAL"))) {
case 0: {
this.state = 7;
if (true) break;
}
case 1: {
this.state = 9;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=126091278;
 //BA.debugLineNum = 126091278;BA.debugLine="InputTemplate.ConfigureForNumbers(False,True)";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._configurefornumbers /*String*/ (null,parent.__c.False,parent.__c.True);
 if (true) break;

case 9:
//C
this.state = 12;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=126091282;
 //BA.debugLineNum = 126091282;BA.debugLine="InputTemplate.ConfigureForNumbers(True,True)";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._configurefornumbers /*String*/ (null,parent.__c.True,parent.__c.True);
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=126091284;
 //BA.debugLineNum = 126091284;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=126091285;
 //BA.debugLineNum = 126091285;BA.debugLine="Dim btOKDlg As B4XView=Dialog.GetButton(xui.Dialo";
_btokdlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btokdlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=126091286;
 //BA.debugLineNum = 126091286;BA.debugLine="btOKDlg.TextSize=14";
_btokdlg.setTextSize(14);
RDebugUtils.currentLine=126091287;
 //BA.debugLineNum = 126091287;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
_btcanceldlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btcanceldlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=126091288;
 //BA.debugLineNum = 126091288;BA.debugLine="btCancelDlg.TextSize=14";
_btcanceldlg.setTextSize(14);
RDebugUtils.currentLine=126091290;
 //BA.debugLineNum = 126091290;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarb4xinputdialogitemcampo"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 13;
_result = (int) result[1];
;
RDebugUtils.currentLine=126091291;
 //BA.debugLineNum = 126091291;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=126091292;
 //BA.debugLineNum = 126091292;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV\":";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_clviv),(Object)("ValorValidacion"),(Object)(__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._text /*String*/ )});
RDebugUtils.currentLine=126091293;
 //BA.debugLineNum = 126091293;BA.debugLine="BeforeUpdate(mData)";
__ref._beforeupdate /*String*/ (null,_mdata);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=126091295;
 //BA.debugLineNum = 126091295;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarb4xlisttemplateitemcampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "mostrarb4xlisttemplateitemcampo", true))
	 {Debug.delegate(ba, "mostrarb4xlisttemplateitemcampo", new Object[] {_idx}); return;}
ResumableSub_MostrarB4XListTemplateItemCampo rsub = new ResumableSub_MostrarB4XListTemplateItemCampo(this,__ref,_idx);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarB4XListTemplateItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarB4XListTemplateItemCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,int _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
int _idx;
b4j.docU.jamformregistro._infocampojamformregistro _clviv = null;
String _campo = "";
anywheresoftware.b4a.objects.collections.List _lstoptionsdlg = null;
int _numcamposdatosaux = 0;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstitemsaux = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mp = null;
anywheresoftware.b4a.objects.collections.List _lstidsitemsaux = null;
anywheresoftware.b4a.objects.collections.List _lstvaloresitemsaux = null;
anywheresoftware.b4a.objects.collections.Map _mdataaux = null;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btcanceldlg = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _idxvalores = 0;
int step17;
int limit17;
int step27;
int limit27;
int step32;
int limit32;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126222337;
 //BA.debugLineNum = 126222337;BA.debugLine="Dim clvIV As InfoCampoJamFormRegistro=clvCamposRe";
_clviv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=126222338;
 //BA.debugLineNum = 126222338;BA.debugLine="Dim Campo As String=clvIV.CampoSQL";
_campo = _clviv.CampoSQL /*String*/ ;
RDebugUtils.currentLine=126222340;
 //BA.debugLineNum = 126222340;BA.debugLine="Dim lstOptionsDlg As List";
_lstoptionsdlg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=126222341;
 //BA.debugLineNum = 126222341;BA.debugLine="lstOptionsDlg.Initialize";
_lstoptionsdlg.Initialize();
RDebugUtils.currentLine=126222342;
 //BA.debugLineNum = 126222342;BA.debugLine="If clvIV.TipoDatosAux=\"Lista\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_clviv.TipoDatosAux /*String*/ ).equals("Lista")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126222344;
 //BA.debugLineNum = 126222344;BA.debugLine="lstOptionsDlg=clvIV.ListaValoresDatosAux";
_lstoptionsdlg = _clviv.ListaValoresDatosAux /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=126222345;
 //BA.debugLineNum = 126222345;BA.debugLine="Dim NumCamposDatosAux As Int=1";
_numcamposdatosaux = (int) (1);
 if (true) break;
;
RDebugUtils.currentLine=126222348;
 //BA.debugLineNum = 126222348;BA.debugLine="If clvIV.TipoDatosAux=\"Consulta\" Then";

case 4:
//if
this.state = 31;
if ((_clviv.TipoDatosAux /*String*/ ).equals("Consulta")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=126222349;
 //BA.debugLineNum = 126222349;BA.debugLine="Dim NumCamposDatosAux As Int=clvIV.NumCamposDato";
_numcamposdatosaux = _clviv.NumCamposDatosAux /*int*/ ;
RDebugUtils.currentLine=126222350;
 //BA.debugLineNum = 126222350;BA.debugLine="CargaItemsAuxControl(clvIV.IPJrdcOrigenDatosAux,";
__ref._cargaitemsauxcontrol /*void*/ (null,_clviv.IPJrdcOrigenDatosAux /*String*/ ,_clviv.PuertoJrdcOrigenDatosAux /*String*/ ,_clviv.ComandoConfigDatosAux /*String*/ ,_clviv.ParametrosComandoDatosAux /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=126222351;
 //BA.debugLineNum = 126222351;BA.debugLine="Wait For CargaItemsAuxControl_Completed(Accion A";
parent.__c.WaitFor("cargaitemsauxcontrol_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarb4xlisttemplateitemcampo"), null);
this.state = 46;
return;
case 46:
//C
this.state = 7;
_accion = (String) result[1];
_lstitemsaux = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=126222352;
 //BA.debugLineNum = 126222352;BA.debugLine="If Accion.StartsWith(\"Err\") Then";
if (true) break;

case 7:
//if
this.state = 30;
if (_accion.startsWith("Err")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 30;
RDebugUtils.currentLine=126222353;
 //BA.debugLineNum = 126222353;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=126222355;
 //BA.debugLineNum = 126222355;BA.debugLine="If clvIV.NumCamposDatosAux=1 Then";
if (true) break;

case 12:
//if
this.state = 19;
if (_clviv.NumCamposDatosAux /*int*/ ==1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=126222356;
 //BA.debugLineNum = 126222356;BA.debugLine="For i=0 To lstItemsAux.Size-1";
if (true) break;

case 15:
//for
this.state = 18;
step17 = 1;
limit17 = (int) (_lstitemsaux.getSize()-1);
_i = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 18;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 17;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step17)) ;
if (true) break;

case 17:
//C
this.state = 48;
RDebugUtils.currentLine=126222358;
 //BA.debugLineNum = 126222358;BA.debugLine="Dim mP As Map=lstItemsAux.Get(i)";
_mp = new anywheresoftware.b4a.objects.collections.Map();
_mp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstitemsaux.Get(_i)));
RDebugUtils.currentLine=126222359;
 //BA.debugLineNum = 126222359;BA.debugLine="lstOptionsDlg.Add(mP.GetValueAt(0))";
_lstoptionsdlg.Add(_mp.GetValueAt((int) (0)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;
;
RDebugUtils.currentLine=126222362;
 //BA.debugLineNum = 126222362;BA.debugLine="If NumCamposDatosAux=2 Then";

case 19:
//if
this.state = 29;
if (_numcamposdatosaux==2) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=126222363;
 //BA.debugLineNum = 126222363;BA.debugLine="Dim lstIDsItemsAux As List";
_lstidsitemsaux = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=126222364;
 //BA.debugLineNum = 126222364;BA.debugLine="lstIDsItemsAux.Initialize";
_lstidsitemsaux.Initialize();
RDebugUtils.currentLine=126222365;
 //BA.debugLineNum = 126222365;BA.debugLine="Dim lstValoresItemsAux As List";
_lstvaloresitemsaux = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=126222366;
 //BA.debugLineNum = 126222366;BA.debugLine="lstValoresItemsAux.Initialize";
_lstvaloresitemsaux.Initialize();
RDebugUtils.currentLine=126222367;
 //BA.debugLineNum = 126222367;BA.debugLine="For i=0 To lstItemsAux.Size-1";
if (true) break;

case 22:
//for
this.state = 25;
step27 = 1;
limit27 = (int) (_lstitemsaux.getSize()-1);
_i = (int) (0) ;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 25;
if ((step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27)) this.state = 24;
if (true) break;

case 50:
//C
this.state = 49;
_i = ((int)(0 + _i + step27)) ;
if (true) break;

case 24:
//C
this.state = 50;
RDebugUtils.currentLine=126222368;
 //BA.debugLineNum = 126222368;BA.debugLine="Dim mDataAux As Map=lstItemsAux.Get(i)";
_mdataaux = new anywheresoftware.b4a.objects.collections.Map();
_mdataaux = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstitemsaux.Get(_i)));
RDebugUtils.currentLine=126222369;
 //BA.debugLineNum = 126222369;BA.debugLine="lstIDsItemsAux.Add(mDataAux.GetValueAt(0))";
_lstidsitemsaux.Add(_mdataaux.GetValueAt((int) (0)));
RDebugUtils.currentLine=126222370;
 //BA.debugLineNum = 126222370;BA.debugLine="lstValoresItemsAux.Add(mDataAux.GetValueAt(1)";
_lstvaloresitemsaux.Add(_mdataaux.GetValueAt((int) (1)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=126222372;
 //BA.debugLineNum = 126222372;BA.debugLine="For i=0 To lstValoresItemsAux.Size-1";

case 25:
//for
this.state = 28;
step32 = 1;
limit32 = (int) (_lstvaloresitemsaux.getSize()-1);
_i = (int) (0) ;
this.state = 51;
if (true) break;

case 51:
//C
this.state = 28;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 27;
if (true) break;

case 52:
//C
this.state = 51;
_i = ((int)(0 + _i + step32)) ;
if (true) break;

case 27:
//C
this.state = 52;
RDebugUtils.currentLine=126222373;
 //BA.debugLineNum = 126222373;BA.debugLine="lstOptionsDlg.Add(lstValoresItemsAux.Get(i))";
_lstoptionsdlg.Add(_lstvaloresitemsaux.Get(_i));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
RDebugUtils.currentLine=126222379;
 //BA.debugLineNum = 126222379;BA.debugLine="If lstOptionsDlg.Size>0 Then";

case 31:
//if
this.state = 45;
if (_lstoptionsdlg.getSize()>0) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=126222381;
 //BA.debugLineNum = 126222381;BA.debugLine="Dialog.Title=\"Selecciona \" & clvIV.TituloCampo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona "+_clviv.TituloCampo /*String*/ );
RDebugUtils.currentLine=126222382;
 //BA.debugLineNum = 126222382;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=126222383;
 //BA.debugLineNum = 126222383;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=126222384;
 //BA.debugLineNum = 126222384;BA.debugLine="B4XListDlg.AllowMultiSelection=False";
_b4xlistdlg._allowmultiselection /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=126222385;
 //BA.debugLineNum = 126222385;BA.debugLine="B4XListDlg.Options=lstOptionsDlg";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstoptionsdlg;
RDebugUtils.currentLine=126222386;
 //BA.debugLineNum = 126222386;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=126222389;
 //BA.debugLineNum = 126222389;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.";
_btcanceldlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btcanceldlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=126222390;
 //BA.debugLineNum = 126222390;BA.debugLine="btCancelDlg.TextSize=14";
_btcanceldlg.setTextSize(14);
RDebugUtils.currentLine=126222392;
 //BA.debugLineNum = 126222392;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarb4xlisttemplateitemcampo"), _rsub);
this.state = 53;
return;
case 53:
//C
this.state = 34;
_result = (int) result[1];
;
RDebugUtils.currentLine=126222393;
 //BA.debugLineNum = 126222393;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 34:
//if
this.state = 44;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=126222394;
 //BA.debugLineNum = 126222394;BA.debugLine="If NumCamposDatosAux=1 Then";
if (true) break;

case 37:
//if
this.state = 40;
if (_numcamposdatosaux==1) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=126222395;
 //BA.debugLineNum = 126222395;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_clviv),(Object)("ValorValidacion"),(Object)(_b4xlistdlg._selecteditem /*String*/ )});
 if (true) break;
;
RDebugUtils.currentLine=126222397;
 //BA.debugLineNum = 126222397;BA.debugLine="If NumCamposDatosAux=2 Then";

case 40:
//if
this.state = 43;
if (_numcamposdatosaux==2) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=126222398;
 //BA.debugLineNum = 126222398;BA.debugLine="Dim idxValores As Int=lstValoresItemsAux.Index";
_idxvalores = _lstvaloresitemsaux.IndexOf((Object)(_b4xlistdlg._selecteditem /*String*/ ));
RDebugUtils.currentLine=126222399;
 //BA.debugLineNum = 126222399;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_clviv),(Object)("ValorValidacion"),_lstidsitemsaux.Get(_idxvalores),(Object)("ValorMostrarValidacion"),(Object)(_b4xlistdlg._selecteditem /*String*/ )});
 if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=126222401;
 //BA.debugLineNum = 126222401;BA.debugLine="BeforeUpdate(mData)";
__ref._beforeupdate /*String*/ (null,_mdata);
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=126222404;
 //BA.debugLineNum = 126222404;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarb4xsearchlisttemplateitemcampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "mostrarb4xsearchlisttemplateitemcampo", true))
	 {Debug.delegate(ba, "mostrarb4xsearchlisttemplateitemcampo", new Object[] {_idx}); return;}
ResumableSub_MostrarB4XSearchListTemplateItemCampo rsub = new ResumableSub_MostrarB4XSearchListTemplateItemCampo(this,__ref,_idx);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarB4XSearchListTemplateItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarB4XSearchListTemplateItemCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,int _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
int _idx;
b4j.docU.jamformregistro._infocampojamformregistro _clviv = null;
String _campo = "";
anywheresoftware.b4a.objects.collections.List _lstoptionsdlg = null;
int _numcamposdatosaux = 0;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstitemsaux = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mp = null;
anywheresoftware.b4a.objects.collections.List _lstidsitemsaux = null;
anywheresoftware.b4a.objects.collections.List _lstvaloresitemsaux = null;
anywheresoftware.b4a.objects.collections.Map _mdataaux = null;
b4j.docU.b4xsearchtemplate _b4xsearchlistdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btcanceldlg = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _idxvalores = 0;
int step17;
int limit17;
int step27;
int limit27;
int step32;
int limit32;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126353409;
 //BA.debugLineNum = 126353409;BA.debugLine="Dim clvIV As InfoCampoJamFormRegistro=clvCamposRe";
_clviv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=126353410;
 //BA.debugLineNum = 126353410;BA.debugLine="Dim Campo As String=clvIV.CampoSQL";
_campo = _clviv.CampoSQL /*String*/ ;
RDebugUtils.currentLine=126353412;
 //BA.debugLineNum = 126353412;BA.debugLine="Dim lstOptionsDlg As List";
_lstoptionsdlg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=126353413;
 //BA.debugLineNum = 126353413;BA.debugLine="lstOptionsDlg.Initialize";
_lstoptionsdlg.Initialize();
RDebugUtils.currentLine=126353414;
 //BA.debugLineNum = 126353414;BA.debugLine="If clvIV.TipoDatosAux=\"Lista\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_clviv.TipoDatosAux /*String*/ ).equals("Lista")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126353416;
 //BA.debugLineNum = 126353416;BA.debugLine="lstOptionsDlg=clvIV.ListaValoresDatosAux";
_lstoptionsdlg = _clviv.ListaValoresDatosAux /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=126353417;
 //BA.debugLineNum = 126353417;BA.debugLine="Dim NumCamposDatosAux As Int=1";
_numcamposdatosaux = (int) (1);
 if (true) break;
;
RDebugUtils.currentLine=126353420;
 //BA.debugLineNum = 126353420;BA.debugLine="If clvIV.TipoDatosAux=\"Consulta\" Then";

case 4:
//if
this.state = 31;
if ((_clviv.TipoDatosAux /*String*/ ).equals("Consulta")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=126353421;
 //BA.debugLineNum = 126353421;BA.debugLine="Dim NumCamposDatosAux As Int=clvIV.NumCamposDato";
_numcamposdatosaux = _clviv.NumCamposDatosAux /*int*/ ;
RDebugUtils.currentLine=126353422;
 //BA.debugLineNum = 126353422;BA.debugLine="CargaItemsAuxControl(clvIV.IPJrdcOrigenDatosAux,";
__ref._cargaitemsauxcontrol /*void*/ (null,_clviv.IPJrdcOrigenDatosAux /*String*/ ,_clviv.PuertoJrdcOrigenDatosAux /*String*/ ,_clviv.ComandoConfigDatosAux /*String*/ ,_clviv.ParametrosComandoDatosAux /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=126353423;
 //BA.debugLineNum = 126353423;BA.debugLine="Wait For CargaItemsAuxControl_Completed(Accion A";
parent.__c.WaitFor("cargaitemsauxcontrol_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarb4xsearchlisttemplateitemcampo"), null);
this.state = 46;
return;
case 46:
//C
this.state = 7;
_accion = (String) result[1];
_lstitemsaux = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=126353424;
 //BA.debugLineNum = 126353424;BA.debugLine="If Accion.StartsWith(\"Err\") Then";
if (true) break;

case 7:
//if
this.state = 30;
if (_accion.startsWith("Err")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 30;
RDebugUtils.currentLine=126353425;
 //BA.debugLineNum = 126353425;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=126353427;
 //BA.debugLineNum = 126353427;BA.debugLine="If clvIV.NumCamposDatosAux=1 Then";
if (true) break;

case 12:
//if
this.state = 19;
if (_clviv.NumCamposDatosAux /*int*/ ==1) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=126353428;
 //BA.debugLineNum = 126353428;BA.debugLine="For i=0 To lstItemsAux.Size-1";
if (true) break;

case 15:
//for
this.state = 18;
step17 = 1;
limit17 = (int) (_lstitemsaux.getSize()-1);
_i = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 18;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 17;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step17)) ;
if (true) break;

case 17:
//C
this.state = 48;
RDebugUtils.currentLine=126353430;
 //BA.debugLineNum = 126353430;BA.debugLine="Dim mP As Map=lstItemsAux.Get(i)";
_mp = new anywheresoftware.b4a.objects.collections.Map();
_mp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstitemsaux.Get(_i)));
RDebugUtils.currentLine=126353431;
 //BA.debugLineNum = 126353431;BA.debugLine="lstOptionsDlg.Add(mP.GetValueAt(0))";
_lstoptionsdlg.Add(_mp.GetValueAt((int) (0)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;
;
RDebugUtils.currentLine=126353434;
 //BA.debugLineNum = 126353434;BA.debugLine="If NumCamposDatosAux=2 Then";

case 19:
//if
this.state = 29;
if (_numcamposdatosaux==2) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=126353435;
 //BA.debugLineNum = 126353435;BA.debugLine="Dim lstIDsItemsAux As List";
_lstidsitemsaux = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=126353436;
 //BA.debugLineNum = 126353436;BA.debugLine="lstIDsItemsAux.Initialize";
_lstidsitemsaux.Initialize();
RDebugUtils.currentLine=126353437;
 //BA.debugLineNum = 126353437;BA.debugLine="Dim lstValoresItemsAux As List";
_lstvaloresitemsaux = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=126353438;
 //BA.debugLineNum = 126353438;BA.debugLine="lstValoresItemsAux.Initialize";
_lstvaloresitemsaux.Initialize();
RDebugUtils.currentLine=126353439;
 //BA.debugLineNum = 126353439;BA.debugLine="For i=0 To lstItemsAux.Size-1";
if (true) break;

case 22:
//for
this.state = 25;
step27 = 1;
limit27 = (int) (_lstitemsaux.getSize()-1);
_i = (int) (0) ;
this.state = 49;
if (true) break;

case 49:
//C
this.state = 25;
if ((step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27)) this.state = 24;
if (true) break;

case 50:
//C
this.state = 49;
_i = ((int)(0 + _i + step27)) ;
if (true) break;

case 24:
//C
this.state = 50;
RDebugUtils.currentLine=126353440;
 //BA.debugLineNum = 126353440;BA.debugLine="Dim mDataAux As Map=lstItemsAux.Get(i)";
_mdataaux = new anywheresoftware.b4a.objects.collections.Map();
_mdataaux = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstitemsaux.Get(_i)));
RDebugUtils.currentLine=126353441;
 //BA.debugLineNum = 126353441;BA.debugLine="lstIDsItemsAux.Add(mDataAux.GetValueAt(0))";
_lstidsitemsaux.Add(_mdataaux.GetValueAt((int) (0)));
RDebugUtils.currentLine=126353442;
 //BA.debugLineNum = 126353442;BA.debugLine="lstValoresItemsAux.Add(mDataAux.GetValueAt(1)";
_lstvaloresitemsaux.Add(_mdataaux.GetValueAt((int) (1)));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=126353444;
 //BA.debugLineNum = 126353444;BA.debugLine="For i=0 To lstValoresItemsAux.Size-1";

case 25:
//for
this.state = 28;
step32 = 1;
limit32 = (int) (_lstvaloresitemsaux.getSize()-1);
_i = (int) (0) ;
this.state = 51;
if (true) break;

case 51:
//C
this.state = 28;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 27;
if (true) break;

case 52:
//C
this.state = 51;
_i = ((int)(0 + _i + step32)) ;
if (true) break;

case 27:
//C
this.state = 52;
RDebugUtils.currentLine=126353445;
 //BA.debugLineNum = 126353445;BA.debugLine="lstOptionsDlg.Add(lstValoresItemsAux.Get(i))";
_lstoptionsdlg.Add(_lstvaloresitemsaux.Get(_i));
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
RDebugUtils.currentLine=126353451;
 //BA.debugLineNum = 126353451;BA.debugLine="If lstOptionsDlg.Size>0 Then";

case 31:
//if
this.state = 45;
if (_lstoptionsdlg.getSize()>0) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=126353453;
 //BA.debugLineNum = 126353453;BA.debugLine="Dialog.Title=\"Selecciona \" & clvIV.TituloCampo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona "+_clviv.TituloCampo /*String*/ );
RDebugUtils.currentLine=126353454;
 //BA.debugLineNum = 126353454;BA.debugLine="Dim B4XSearchListDlg As B4XSearchTemplate";
_b4xsearchlistdlg = new b4j.docU.b4xsearchtemplate();
RDebugUtils.currentLine=126353455;
 //BA.debugLineNum = 126353455;BA.debugLine="B4XSearchListDlg.Initialize";
_b4xsearchlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=126353456;
 //BA.debugLineNum = 126353456;BA.debugLine="B4XSearchListDlg.SetItems(lstOptionsDlg)";
_b4xsearchlistdlg._setitems /*Object*/ (null,_lstoptionsdlg);
RDebugUtils.currentLine=126353457;
 //BA.debugLineNum = 126353457;BA.debugLine="B4XSearchListDlg.SearchField.HintText=\"Buscar\"";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._hinttext /*String*/  = "Buscar";
RDebugUtils.currentLine=126353458;
 //BA.debugLineNum = 126353458;BA.debugLine="B4XSearchListDlg.SearchField.Update";
_b4xsearchlistdlg._searchfield /*b4j.docU.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=126353459;
 //BA.debugLineNum = 126353459;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xsearchlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=126353462;
 //BA.debugLineNum = 126353462;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.";
_btcanceldlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btcanceldlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=126353463;
 //BA.debugLineNum = 126353463;BA.debugLine="btCancelDlg.TextSize=14";
_btcanceldlg.setTextSize(14);
RDebugUtils.currentLine=126353465;
 //BA.debugLineNum = 126353465;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarb4xsearchlisttemplateitemcampo"), _rsub);
this.state = 53;
return;
case 53:
//C
this.state = 34;
_result = (int) result[1];
;
RDebugUtils.currentLine=126353466;
 //BA.debugLineNum = 126353466;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 34:
//if
this.state = 44;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=126353467;
 //BA.debugLineNum = 126353467;BA.debugLine="If NumCamposDatosAux=1 Then";
if (true) break;

case 37:
//if
this.state = 40;
if (_numcamposdatosaux==1) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=126353468;
 //BA.debugLineNum = 126353468;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_clviv),(Object)("ValorValidacion"),(Object)(_b4xsearchlistdlg._selecteditem /*String*/ )});
 if (true) break;
;
RDebugUtils.currentLine=126353470;
 //BA.debugLineNum = 126353470;BA.debugLine="If NumCamposDatosAux=2 Then";

case 40:
//if
this.state = 43;
if (_numcamposdatosaux==2) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=126353471;
 //BA.debugLineNum = 126353471;BA.debugLine="Dim idxValores As Int=lstValoresItemsAux.Index";
_idxvalores = _lstvaloresitemsaux.IndexOf((Object)(_b4xsearchlistdlg._selecteditem /*String*/ ));
RDebugUtils.currentLine=126353472;
 //BA.debugLineNum = 126353472;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":iDx, \"clvIV";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_clviv),(Object)("ValorValidacion"),_lstidsitemsaux.Get(_idxvalores),(Object)("ValorMostrarValidacion"),(Object)(_b4xsearchlistdlg._selecteditem /*String*/ )});
 if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=126353474;
 //BA.debugLineNum = 126353474;BA.debugLine="BeforeUpdate(mData)";
__ref._beforeupdate /*String*/ (null,_mdata);
 if (true) break;

case 44:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=126353477;
 //BA.debugLineNum = 126353477;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarselvalorextitemcampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "mostrarselvalorextitemcampo", true))
	 {Debug.delegate(ba, "mostrarselvalorextitemcampo", new Object[] {_idx}); return;}
ResumableSub_MostrarSelValorExtItemCampo rsub = new ResumableSub_MostrarSelValorExtItemCampo(this,__ref,_idx);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarSelValorExtItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelValorExtItemCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,int _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
int _idx;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=127008769;
 //BA.debugLineNum = 127008769;BA.debugLine="Dim InfoCampojFR  As InfoCampoJamFormRegistro=clv";
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=127008771;
 //BA.debugLineNum = 127008771;BA.debugLine="If SubExists(mCallBack,mEventName & \"_btnSelValor";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_btnSelValorExtItemCampo_Click")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=127008773;
 //BA.debugLineNum = 127008773;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_btnSel";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_btnSelValorExtItemCampo_Click",(Object)(_infocampojfr));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=127008775;
 //BA.debugLineNum = 127008775;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay creada";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay creada SUB "+__ref._meventname /*String*/ +"_btnSelValorExtItemCampo_Click en el módulo CallBack."+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador del sistema.","Error");
RDebugUtils.currentLine=127008776;
 //BA.debugLineNum = 127008776;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarselvalorextitemcampo"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=127008778;
 //BA.debugLineNum = 127008778;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarselfechaitemcampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "mostrarselfechaitemcampo", true))
	 {Debug.delegate(ba, "mostrarselfechaitemcampo", new Object[] {_idx}); return;}
ResumableSub_MostrarSelFechaItemCampo rsub = new ResumableSub_MostrarSelFechaItemCampo(this,__ref,_idx);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarSelFechaItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelFechaItemCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,int _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
int _idx;
b4j.docU.jamformregistro._infocampojamformregistro _iv = null;
long _fechasel = 0L;
String _datetimeformatant = "";
long _fechaact = 0L;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bnok = null;
int _rint = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126877697;
 //BA.debugLineNum = 126877697;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
_iv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=126877698;
 //BA.debugLineNum = 126877698;BA.debugLine="Dim FechaSel As Long";
_fechasel = 0L;
RDebugUtils.currentLine=126877699;
 //BA.debugLineNum = 126877699;BA.debugLine="Dim DatetimeFormatAnt As String=DateTime.DateForm";
_datetimeformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=126877700;
 //BA.debugLineNum = 126877700;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=126877701;
 //BA.debugLineNum = 126877701;BA.debugLine="InicializarCalendario";
__ref._inicializarcalendario /*String*/ (null);
RDebugUtils.currentLine=126877703;
 //BA.debugLineNum = 126877703;BA.debugLine="Dim FechaAct As Long=FixNullLong(iv.ValorOutputCa";
_fechaact = (long) (__ref._fixnulllong /*double*/ (null,_iv.ValorOutputCampo /*Object*/ ));
RDebugUtils.currentLine=126877704;
 //BA.debugLineNum = 126877704;BA.debugLine="If FechaAct<>0 Then DateTemplate.Date=FechaAct";
if (true) break;

case 1:
//if
this.state = 6;
if (_fechaact!=0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._setdate /*long*/ (null,_fechaact);
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=126877705;
 //BA.debugLineNum = 126877705;BA.debugLine="Dialog.Title=\"Selecciona \" & iv.TituloCampo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona "+_iv.TituloCampo /*String*/ );
RDebugUtils.currentLine=126877706;
 //BA.debugLineNum = 126877706;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Date";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ),(Object)("OK"),(Object)("Borrar"),(Object)("Cancelar"));
RDebugUtils.currentLine=126877707;
 //BA.debugLineNum = 126877707;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=126877708;
 //BA.debugLineNum = 126877708;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
RDebugUtils.currentLine=126877709;
 //BA.debugLineNum = 126877709;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=126877710;
 //BA.debugLineNum = 126877710;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=126877711;
 //BA.debugLineNum = 126877711;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=126877712;
 //BA.debugLineNum = 126877712;BA.debugLine="bOk.TextSize=18";
_bok.setTextSize(18);
RDebugUtils.currentLine=126877713;
 //BA.debugLineNum = 126877713;BA.debugLine="bOk.Left=bOk.Left-20dip";
_bok.setLeft(_bok.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=126877714;
 //BA.debugLineNum = 126877714;BA.debugLine="bOk.Width=bOk.Width+20dip";
_bok.setWidth(_bok.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=126877715;
 //BA.debugLineNum = 126877715;BA.debugLine="Dim bNOk As B4XView=Dialog.GetButton(xui.DialogRe";
_bnok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bnok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative);
RDebugUtils.currentLine=126877716;
 //BA.debugLineNum = 126877716;BA.debugLine="bNOk.TextSize=18";
_bnok.setTextSize(18);
RDebugUtils.currentLine=126877717;
 //BA.debugLineNum = 126877717;BA.debugLine="bNOk.Left=bNOk.Left-20dip";
_bnok.setLeft(_bnok.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=126877718;
 //BA.debugLineNum = 126877718;BA.debugLine="bNOk.Width=bNOk.Width+20dip";
_bnok.setWidth(_bnok.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=126877719;
 //BA.debugLineNum = 126877719;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarselfechaitemcampo"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=126877720;
 //BA.debugLineNum = 126877720;BA.debugLine="Select Case rInt";
if (true) break;

case 7:
//select
this.state = 14;
switch (BA.switchObjectToInt(_rint,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive)) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=126877722;
 //BA.debugLineNum = 126877722;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=126877724;
 //BA.debugLineNum = 126877724;BA.debugLine="FechaSel=0";
_fechasel = (long) (0);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=126877726;
 //BA.debugLineNum = 126877726;BA.debugLine="FechaSel=DateTemplate.Date";
_fechasel = __ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._getdate /*long*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=126877729;
 //BA.debugLineNum = 126877729;BA.debugLine="DateTime.DateFormat=DatetimeFormatAnt";
parent.__c.DateTime.setDateFormat(_datetimeformatant);
RDebugUtils.currentLine=126877730;
 //BA.debugLineNum = 126877730;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":IDx, \"clvIV\":i";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_iv),(Object)("ValorValidacion"),(Object)(_fechasel)});
RDebugUtils.currentLine=126877731;
 //BA.debugLineNum = 126877731;BA.debugLine="BeforeUpdate(mData)";
__ref._beforeupdate /*String*/ (null,_mdata);
RDebugUtils.currentLine=126877732;
 //BA.debugLineNum = 126877732;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarselficheroitemcampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "mostrarselficheroitemcampo", true))
	 {Debug.delegate(ba, "mostrarselficheroitemcampo", new Object[] {_idx}); return;}
ResumableSub_MostrarSelFicheroItemCampo rsub = new ResumableSub_MostrarSelFicheroItemCampo(this,__ref,_idx);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarSelFicheroItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelFicheroItemCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,int _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
int _idx;
b4j.docU.jamformregistro._infocampojamformregistro _iv = null;
anywheresoftware.b4j.objects.FileChooserWrapper _fch = null;
Object _msa = null;
int _rint = 0;
String _ficherobasefullpath = "";
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126681091;
 //BA.debugLineNum = 126681091;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
_iv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=126681093;
 //BA.debugLineNum = 126681093;BA.debugLine="Dim fch As FileChooser";
_fch = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=126681094;
 //BA.debugLineNum = 126681094;BA.debugLine="fch.Initialize";
_fch.Initialize();
RDebugUtils.currentLine=126681096;
 //BA.debugLineNum = 126681096;BA.debugLine="fch.Title=\"Selecciona Fichero para el campo \" & i";
_fch.setTitle("Selecciona Fichero para el campo "+_iv.TituloCampo /*String*/ );
RDebugUtils.currentLine=126681101;
 //BA.debugLineNum = 126681101;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" And \"\"<>iv.Va";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._fixnull /*String*/ (null,_iv.ValorOutputCampo /*Object*/ )).equals("") == false && ("").equals(BA.ObjectToString(_iv.ValorOutputCampo /*Object*/ )) == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126681103;
 //BA.debugLineNum = 126681103;BA.debugLine="fch.InitialDirectory=File.GetFileParent(iv.Valor";
_fch.setInitialDirectory(parent.__c.File.GetFileParent(BA.ObjectToString(_iv.ValorOutputCampo /*Object*/ )));
RDebugUtils.currentLine=126681105;
 //BA.debugLineNum = 126681105;BA.debugLine="fch.InitialFileName=File.GetName(iv.ValorOutputC";
_fch.setInitialFileName(parent.__c.File.GetName(BA.ObjectToString(_iv.ValorOutputCampo /*Object*/ )));
 if (true) break;
;
RDebugUtils.currentLine=126681108;
 //BA.debugLineNum = 126681108;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" Then";

case 4:
//if
this.state = 17;
if ((__ref._fixnull /*String*/ (null,_iv.ValorOutputCampo /*Object*/ )).equals("") == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=126681109;
 //BA.debugLineNum = 126681109;BA.debugLine="If File.Exists(File.GetFileParent(iv.ValorOutput";
if (true) break;

case 7:
//if
this.state = 16;
if (parent.__c.File.Exists(parent.__c.File.GetFileParent(BA.ObjectToString(_iv.ValorOutputCampo /*Object*/ )),"")==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=126681110;
 //BA.debugLineNum = 126681110;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"NO existe";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"NO existe, o no se tiene acceso a la carpeta "+parent.__c.File.GetFileParent(BA.ObjectToString(_iv.ValorOutputCampo /*Object*/ ))+parent.__c.CRLF+parent.__c.CRLF+"¿Continuar?","Aviso","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=126681111;
 //BA.debugLineNum = 126681111;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarselficheroitemcampo"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 10;
_rint = (int) result[1];
;
RDebugUtils.currentLine=126681112;
 //BA.debugLineNum = 126681112;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 10:
//if
this.state = 15;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=126681113;
 //BA.debugLineNum = 126681113;BA.debugLine="fch.Initialize";
_fch.Initialize();
 if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=126681117;
 //BA.debugLineNum = 126681117;BA.debugLine="Dim FicheroBaseFullPath As String = fch.ShowOpen(";
_ficherobasefullpath = _fch.ShowOpen(__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=126681119;
 //BA.debugLineNum = 126681119;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarselficheroitemcampo"),(int) (0));
this.state = 31;
return;
case 31:
//C
this.state = 18;
;
RDebugUtils.currentLine=126681120;
 //BA.debugLineNum = 126681120;BA.debugLine="If FicheroBaseFullPath = \"\" Then";
if (true) break;

case 18:
//if
this.state = 29;
if ((_ficherobasefullpath).equals("")) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=126681121;
 //BA.debugLineNum = 126681121;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" Then";
if (true) break;

case 21:
//if
this.state = 28;
if ((__ref._fixnull /*String*/ (null,_iv.ValorOutputCampo /*Object*/ )).equals("") == false) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=126681122;
 //BA.debugLineNum = 126681122;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"NO se ha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"NO se ha seleccionado fichero. ¿Eliminar el enlace al fichero y grabar el campo en blanco?","Sin Fichero seleccionado","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=126681123;
 //BA.debugLineNum = 126681123;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarselficheroitemcampo"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 24;
_result = (int) result[1];
;
RDebugUtils.currentLine=126681124;
 //BA.debugLineNum = 126681124;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 24:
//if
this.state = 27;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=126681125;
 //BA.debugLineNum = 126681125;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 29;
;
 if (true) break;

case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=126681143;
 //BA.debugLineNum = 126681143;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":IDx, \"clvIV\":i";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_iv),(Object)("ValorValidacion"),(Object)(_ficherobasefullpath)});
RDebugUtils.currentLine=126681144;
 //BA.debugLineNum = 126681144;BA.debugLine="BeforeUpdate(mData)";
__ref._beforeupdate /*String*/ (null,_mdata);
RDebugUtils.currentLine=126681145;
 //BA.debugLineNum = 126681145;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _abrirrecordformbuilder(b4j.docU.jamformregistro __ref,String _modo,String _ficherojson) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "abrirrecordformbuilder", true))
	 {Debug.delegate(ba, "abrirrecordformbuilder", new Object[] {_modo,_ficherojson}); return;}
ResumableSub_AbrirRecordFormBuilder rsub = new ResumableSub_AbrirRecordFormBuilder(this,__ref,_modo,_ficherojson);
rsub.resume(ba, null);
}
public static class ResumableSub_AbrirRecordFormBuilder extends BA.ResumableSub {
public ResumableSub_AbrirRecordFormBuilder(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,String _modo,String _ficherojson) {
this.parent = parent;
this.__ref = __ref;
this._modo = _modo;
this._ficherojson = _ficherojson;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
String _modo;
String _ficherojson;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128122881;
 //BA.debugLineNum = 128122881;BA.debugLine="If mNombreFicheroJSON<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 14;
if ((__ref._mnombreficherojson /*String*/ ).equals("") == false) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=128122882;
 //BA.debugLineNum = 128122882;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=128122883;
 //BA.debugLineNum = 128122883;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=128122884;
 //BA.debugLineNum = 128122884;BA.debugLine="sb.Append(\"El Registro ya tiene un fichero JSON";
_sb.Append("El Registro ya tiene un fichero JSON de configuración (").Append(__ref._mnombreficherojson /*String*/ ).Append(")").Append(parent.__c.CRLF).Append(parent.__c.CRLF);
RDebugUtils.currentLine=128122885;
 //BA.debugLineNum = 128122885;BA.debugLine="sb.Append(\"¿Editar este fichero o crear uno nuev";
_sb.Append("¿Editar este fichero o crear uno nuevo?");
RDebugUtils.currentLine=128122887;
 //BA.debugLineNum = 128122887;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(sb.tostring";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,_sb.ToString(),"Confirma","Editar","Cancelar","Nuevo",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=128122888;
 //BA.debugLineNum = 128122888;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "abrirrecordformbuilder"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=128122889;
 //BA.debugLineNum = 128122889;BA.debugLine="Select True";
if (true) break;

case 4:
//select
this.state = 11;
switch (BA.switchObjectToInt(parent.__c.True,_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive,_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative,_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel)) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
case 2: {
this.state = 10;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=128122893;
 //BA.debugLineNum = 128122893;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=128122894;
 //BA.debugLineNum = 128122894;BA.debugLine="jamRecordFormBuilder.show(\"Edicion\",mNombreFic";
parent._jamrecordformbuilder._show /*void*/ ("Edicion",__ref._mnombreficherojson /*String*/ );
 if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=128122897;
 //BA.debugLineNum = 128122897;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=128122898;
 //BA.debugLineNum = 128122898;BA.debugLine="jamRecordFormBuilder.show(\"Nuevo\",\"\")";
parent._jamrecordformbuilder._show /*void*/ ("Nuevo","");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=128122901;
 //BA.debugLineNum = 128122901;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=128122905;
 //BA.debugLineNum = 128122905;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=128122906;
 //BA.debugLineNum = 128122906;BA.debugLine="jamRecordFormBuilder.show(\"Nuevo\",\"\")";
parent._jamrecordformbuilder._show /*void*/ ("Nuevo","");
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=128122909;
 //BA.debugLineNum = 128122909;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatoscampo(b4j.docU.jamformregistro __ref,anywheresoftware.b4a.objects.collections.Map _mdataactualizacion) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "actualizardatoscampo", true))
	 {Debug.delegate(ba, "actualizardatoscampo", new Object[] {_mdataactualizacion}); return;}
ResumableSub_ActualizarDatosCampo rsub = new ResumableSub_ActualizarDatosCampo(this,__ref,_mdataactualizacion);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatosCampo extends BA.ResumableSub {
public ResumableSub_ActualizarDatosCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,anywheresoftware.b4a.objects.collections.Map _mdataactualizacion) {
this.parent = parent;
this.__ref = __ref;
this._mdataactualizacion = _mdataactualizacion;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
anywheresoftware.b4a.objects.collections.Map _mdataactualizacion;
b4j.docU.jamformregistro._infocampojamformregistro _clviveditado = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _idxreplace = 0;
String _campoeditado = "";
b4j.docU.jamformregistro._infocampojamformregistro _infocampofr = null;
int _numeroitemclveditado = 0;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=127336449;
 //BA.debugLineNum = 127336449;BA.debugLine="Log(\"**** ActualizarDatosCampo jamFormRegistro***";
parent.__c.LogImpl("9127336449","**** ActualizarDatosCampo jamFormRegistro****",0);
RDebugUtils.currentLine=127336450;
 //BA.debugLineNum = 127336450;BA.debugLine="Log(\"mdataActualizacion \" & mdataActualizacion)";
parent.__c.LogImpl("9127336450","mdataActualizacion "+BA.ObjectToString(_mdataactualizacion),0);
RDebugUtils.currentLine=127336452;
 //BA.debugLineNum = 127336452;BA.debugLine="Dim clvivEditado As InfoCampoJamFormRegistro=mdat";
_clviveditado = (b4j.docU.jamformregistro._infocampojamformregistro)(_mdataactualizacion.Get((Object)("clvIV")));
RDebugUtils.currentLine=127336454;
 //BA.debugLineNum = 127336454;BA.debugLine="clvivEditado.ValorOutputCampo=mdataActualizacion.";
_clviveditado.ValorOutputCampo /*Object*/  = _mdataactualizacion.Get((Object)("ValorValidacion"));
RDebugUtils.currentLine=127336456;
 //BA.debugLineNum = 127336456;BA.debugLine="If clvivEditado.NumCamposDatosAux=2 Then clvivEdi";
if (true) break;

case 1:
//if
this.state = 6;
if (_clviveditado.NumCamposDatosAux /*int*/ ==2) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_clviveditado.ValorMostrarCampoFormulario /*Object*/  = _mdataactualizacion.Get((Object)("ValorMostrarValidacion"));
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=127336481;
 //BA.debugLineNum = 127336481;BA.debugLine="Dim rSUB As ResumableSub=CrearItemCLV(clvivEditad";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._crearitemclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_clviveditado);
RDebugUtils.currentLine=127336482;
 //BA.debugLineNum = 127336482;BA.debugLine="Wait For (rSUB) complete (mItem As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "actualizardatoscampo"), _rsub);
this.state = 38;
return;
case 38:
//C
this.state = 7;
_mitem = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=127336483;
 //BA.debugLineNum = 127336483;BA.debugLine="Dim pnl As B4XView=mItem.Get(\"Panel\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mitem.Get((Object)("Panel"))));
RDebugUtils.currentLine=127336484;
 //BA.debugLineNum = 127336484;BA.debugLine="Dim iDxReplace As Int=mdataActualizacion.Get(\"Ind";
_idxreplace = (int)(BA.ObjectToNumber(_mdataactualizacion.Get((Object)("Index"))));
RDebugUtils.currentLine=127336485;
 //BA.debugLineNum = 127336485;BA.debugLine="If iDxReplace Mod 2=0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_idxreplace%2==0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=127336486;
 //BA.debugLineNum = 127336486;BA.debugLine="pnl.Color=ColItemsPares";
_pnl.setColor(__ref._colitemspares /*int*/ );
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=127336488;
 //BA.debugLineNum = 127336488;BA.debugLine="pnl.Color=ColItemsImpares";
_pnl.setColor(__ref._colitemsimpares /*int*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=127336490;
 //BA.debugLineNum = 127336490;BA.debugLine="clvCamposRegistro.ReplaceAt(iDxReplace,pnl,pnl.He";
__ref._clvcamposregistro /*b4j.example.customlistview*/ ._replaceat(_idxreplace,_pnl,(int) (_pnl.getHeight()),(Object)(_clviveditado));
RDebugUtils.currentLine=127336492;
 //BA.debugLineNum = 127336492;BA.debugLine="clvCamposRegistro.Base_Resize(clvCamposRegistro.A";
__ref._clvcamposregistro /*b4j.example.customlistview*/ ._base_resize(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._asview().getWidth(),__ref._clvcamposregistro /*b4j.example.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=127336494;
 //BA.debugLineNum = 127336494;BA.debugLine="Dim CampoEditado As String=clvivEditado.CampoSQL";
_campoeditado = _clviveditado.CampoSQL /*String*/ ;
RDebugUtils.currentLine=127336497;
 //BA.debugLineNum = 127336497;BA.debugLine="For Each InfoCampoFR As InfoCampoJamFormRegistro";
if (true) break;

case 13:
//for
this.state = 26;
group18 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 26;
if (index18 < groupLen18) {
this.state = 15;
_infocampofr = (b4j.docU.jamformregistro._infocampojamformregistro)(group18.Get(index18));}
if (true) break;

case 40:
//C
this.state = 39;
index18++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=127336498;
 //BA.debugLineNum = 127336498;BA.debugLine="If InfoCampoFR.CampoSQL=CampoEditado Then";
if (true) break;

case 16:
//if
this.state = 25;
if ((_infocampofr.CampoSQL /*String*/ ).equals(_campoeditado)) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=127336499;
 //BA.debugLineNum = 127336499;BA.debugLine="InfoCampoFR.ValorOutputCampo=clvivEditado.Valor";
_infocampofr.ValorOutputCampo /*Object*/  = _clviveditado.ValorOutputCampo /*Object*/ ;
RDebugUtils.currentLine=127336500;
 //BA.debugLineNum = 127336500;BA.debugLine="If InfoCampoFR.NumCamposDatosAux=2 Then InfoCam";
if (true) break;

case 19:
//if
this.state = 24;
if (_infocampofr.NumCamposDatosAux /*int*/ ==2) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_infocampofr.ValorMostrarCampoFormulario /*Object*/  = _clviveditado.ValorMostrarCampoFormulario /*Object*/ ;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=127336502;
 //BA.debugLineNum = 127336502;BA.debugLine="Exit";
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=127336506;
 //BA.debugLineNum = 127336506;BA.debugLine="Dim NumeroItemCLVEditado As Int=mdataActualizacio";
_numeroitemclveditado = (int)(BA.ObjectToNumber(_mdataactualizacion.Get((Object)("Index"))));
RDebugUtils.currentLine=127336509;
 //BA.debugLineNum = 127336509;BA.debugLine="If mModoRegistro=\"Nuevo\" Then";
if (true) break;

case 27:
//if
this.state = 30;
if ((__ref._mmodoregistro /*String*/ ).equals("Nuevo")) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=127336511;
 //BA.debugLineNum = 127336511;BA.debugLine="AbrirEditorDeCampo((NumeroItemCLVEditado+1))";
__ref._abrireditordecampo /*String*/ (null,(int) ((_numeroitemclveditado+1)));
 if (true) break;
;
RDebugUtils.currentLine=127336513;
 //BA.debugLineNum = 127336513;BA.debugLine="If mModoRegistro=\"Editar\" Then";

case 30:
//if
this.state = 37;
if ((__ref._mmodoregistro /*String*/ ).equals("Editar")) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=127336514;
 //BA.debugLineNum = 127336514;BA.debugLine="If NumeroItemCLVEditado=clvCamposRegistro.Size-1";
if (true) break;

case 33:
//if
this.state = 36;
if (_numeroitemclveditado==__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getsize()-1) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=127336515;
 //BA.debugLineNum = 127336515;BA.debugLine="btnOK.RequestFocus";
__ref._btnok /*anywheresoftware.b4j.objects.ButtonWrapper*/ .RequestFocus();
 if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=127336518;
 //BA.debugLineNum = 127336518;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _crearitemclv(b4j.docU.jamformregistro __ref,b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "crearitemclv", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "crearitemclv", new Object[] {_infocampojfr}));}
ResumableSub_CrearItemCLV rsub = new ResumableSub_CrearItemCLV(this,__ref,_infocampojfr);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearItemCLV extends BA.ResumableSub {
public ResumableSub_CrearItemCLV(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr) {
this.parent = parent;
this.__ref = __ref;
this._infocampojfr = _infocampojfr;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr;
anywheresoftware.b4a.objects.collections.Map _mitemclv = null;
int _anchoclv = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _numcamposdatosaux = 0;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstitemsaux = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mdataaux = null;
int _valorcampodataauxint = 0;
String _valorcampodataauxstr = "";
String _valorcampodataauxreal = "";
int _valint = 0;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4j.objects.LabelWrapper _lblictoolt = null;
int step14;
int limit14;
anywheresoftware.b4a.BA.IterableList group173;
int index173;
int groupLen173;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125632515;
 //BA.debugLineNum = 125632515;BA.debugLine="Dim mItemCLV As Map";
_mitemclv = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=125632516;
 //BA.debugLineNum = 125632516;BA.debugLine="mItemCLV.Initialize";
_mitemclv.Initialize();
RDebugUtils.currentLine=125632518;
 //BA.debugLineNum = 125632518;BA.debugLine="Dim AnchoClv As Int=clvCamposRegistro.sv.ScrollVi";
_anchoclv = (int) (__ref._clvcamposregistro /*b4j.example.customlistview*/ ._sv.getScrollViewContentWidth());
RDebugUtils.currentLine=125632531;
 //BA.debugLineNum = 125632531;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=125632538;
 //BA.debugLineNum = 125632538;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" And InfoC";
if (true) break;

case 1:
//if
this.state = 44;
if ((_infocampojfr.TipoDatosAux /*String*/ ).equals("Consulta") && _infocampojfr.ValorOutputCampo /*Object*/ != null) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=125632541;
 //BA.debugLineNum = 125632541;BA.debugLine="Dim NumCamposDatosAux As Int=InfoCampojFR.NumCam";
_numcamposdatosaux = _infocampojfr.NumCamposDatosAux /*int*/ ;
RDebugUtils.currentLine=125632542;
 //BA.debugLineNum = 125632542;BA.debugLine="If NumCamposDatosAux=2 Then  ' hará falta cargar";
if (true) break;

case 4:
//if
this.state = 43;
if (_numcamposdatosaux==2) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=125632545;
 //BA.debugLineNum = 125632545;BA.debugLine="CargaItemsAuxControl(InfoCampojFR.IPJrdcOrigenD";
__ref._cargaitemsauxcontrol /*void*/ (null,_infocampojfr.IPJrdcOrigenDatosAux /*String*/ ,_infocampojfr.PuertoJrdcOrigenDatosAux /*String*/ ,_infocampojfr.ComandoConfigDatosAux /*String*/ ,_infocampojfr.ParametrosComandoDatosAux /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=125632546;
 //BA.debugLineNum = 125632546;BA.debugLine="Wait For CargaItemsAuxControl_Completed(Accion";
parent.__c.WaitFor("cargaitemsauxcontrol_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "crearitemclv"), null);
this.state = 165;
return;
case 165:
//C
this.state = 7;
_accion = (String) result[1];
_lstitemsaux = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=125632547;
 //BA.debugLineNum = 125632547;BA.debugLine="If Accion.StartsWith(\"Err\") Then";
if (true) break;

case 7:
//if
this.state = 42;
if (_accion.startsWith("Err")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 42;
RDebugUtils.currentLine=125632548;
 //BA.debugLineNum = 125632548;BA.debugLine="ErrorCargaDatos=True";
__ref._errorcargadatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=125632551;
 //BA.debugLineNum = 125632551;BA.debugLine="msgErrorCargaDatos=msgErrorCargaDatos & CRLF &";
__ref._msgerrorcargadatos /*String*/  = __ref._msgerrorcargadatos /*String*/ +parent.__c.CRLF+"Error carga datos aux "+_infocampojfr.CampoSQL /*String*/ ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=125632553;
 //BA.debugLineNum = 125632553;BA.debugLine="For i=0 To lstItemsAux.Size-1";
if (true) break;

case 12:
//for
this.state = 41;
step14 = 1;
limit14 = (int) (_lstitemsaux.getSize()-1);
_i = (int) (0) ;
this.state = 166;
if (true) break;

case 166:
//C
this.state = 41;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 14;
if (true) break;

case 167:
//C
this.state = 166;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=125632554;
 //BA.debugLineNum = 125632554;BA.debugLine="Dim mDataAux As Map=lstItemsAux.Get(i)";
_mdataaux = new anywheresoftware.b4a.objects.collections.Map();
_mdataaux = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstitemsaux.Get(_i)));
RDebugUtils.currentLine=125632555;
 //BA.debugLineNum = 125632555;BA.debugLine="Select True";
if (true) break;

case 15:
//select
this.state = 40;
switch (BA.switchObjectToInt(parent.__c.True,("INTEGER").equals(_infocampojfr.TipoDato /*String*/ ),("TEXT").equals(_infocampojfr.TipoDato /*String*/ ),("REAL").equals(_infocampojfr.TipoDato /*String*/ ))) {
case 0: {
this.state = 17;
if (true) break;
}
case 1: {
this.state = 23;
if (true) break;
}
case 2: {
this.state = 29;
if (true) break;
}
default: {
this.state = 35;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=125632559;
 //BA.debugLineNum = 125632559;BA.debugLine="Dim ValorCampoDataAuxInt As Int=mDataAux.Ge";
_valorcampodataauxint = (int)(BA.ObjectToNumber(_mdataaux.GetValueAt((int) (0))));
RDebugUtils.currentLine=125632562;
 //BA.debugLineNum = 125632562;BA.debugLine="If ValorCampoDataAuxInt=InfoCampojFR.ValorO";
if (true) break;

case 18:
//if
this.state = 21;
if (_valorcampodataauxint==(double)(BA.ObjectToNumber(_infocampojfr.ValorOutputCampo /*Object*/ ))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=125632565;
 //BA.debugLineNum = 125632565;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
_infocampojfr.ValorMostrarCampoFormulario /*Object*/  = _mdataaux.GetValueAt((int) (1));
RDebugUtils.currentLine=125632566;
 //BA.debugLineNum = 125632566;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
parent.__c.LogImpl("9125632566","mDataAux "+BA.ObjectToString(_mdataaux),0);
RDebugUtils.currentLine=125632567;
 //BA.debugLineNum = 125632567;BA.debugLine="Exit";
this.state = 40;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 40;
;
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=125632572;
 //BA.debugLineNum = 125632572;BA.debugLine="Dim ValorCampoDataAuxStr As String=mDataAux";
_valorcampodataauxstr = BA.ObjectToString(_mdataaux.GetValueAt((int) (0)));
RDebugUtils.currentLine=125632574;
 //BA.debugLineNum = 125632574;BA.debugLine="If ValorCampoDataAuxStr=InfoCampojFR.ValorO";
if (true) break;

case 24:
//if
this.state = 27;
if ((_valorcampodataauxstr).equals(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=125632577;
 //BA.debugLineNum = 125632577;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
_infocampojfr.ValorMostrarCampoFormulario /*Object*/  = _mdataaux.GetValueAt((int) (1));
RDebugUtils.currentLine=125632578;
 //BA.debugLineNum = 125632578;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
parent.__c.LogImpl("9125632578","mDataAux "+BA.ObjectToString(_mdataaux),0);
RDebugUtils.currentLine=125632579;
 //BA.debugLineNum = 125632579;BA.debugLine="Exit";
this.state = 40;
if (true) break;
 if (true) break;

case 27:
//C
this.state = 40;
;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=125632584;
 //BA.debugLineNum = 125632584;BA.debugLine="Dim ValorCampoDataAuxReal As String=mDataAu";
_valorcampodataauxreal = BA.ObjectToString(_mdataaux.GetValueAt((int) (0)));
RDebugUtils.currentLine=125632587;
 //BA.debugLineNum = 125632587;BA.debugLine="If ValorCampoDataAuxReal=InfoCampojFR.Valor";
if (true) break;

case 30:
//if
this.state = 33;
if ((_valorcampodataauxreal).equals(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ))) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=125632590;
 //BA.debugLineNum = 125632590;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
_infocampojfr.ValorMostrarCampoFormulario /*Object*/  = _mdataaux.GetValueAt((int) (1));
RDebugUtils.currentLine=125632591;
 //BA.debugLineNum = 125632591;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
parent.__c.LogImpl("9125632591","mDataAux "+BA.ObjectToString(_mdataaux),0);
RDebugUtils.currentLine=125632592;
 //BA.debugLineNum = 125632592;BA.debugLine="Exit";
this.state = 40;
if (true) break;
 if (true) break;

case 33:
//C
this.state = 40;
;
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=125632597;
 //BA.debugLineNum = 125632597;BA.debugLine="If InfoCampojFR.ValorOutputCampo=mDataAux.G";
if (true) break;

case 36:
//if
this.state = 39;
if ((_infocampojfr.ValorOutputCampo /*Object*/ ).equals(_mdataaux.GetValueAt((int) (0)))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=125632600;
 //BA.debugLineNum = 125632600;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=m";
_infocampojfr.ValorMostrarCampoFormulario /*Object*/  = _mdataaux.GetValueAt((int) (1));
RDebugUtils.currentLine=125632601;
 //BA.debugLineNum = 125632601;BA.debugLine="Log(\"mDataAux \" & mDataAux)";
parent.__c.LogImpl("9125632601","mDataAux "+BA.ObjectToString(_mdataaux),0);
RDebugUtils.currentLine=125632602;
 //BA.debugLineNum = 125632602;BA.debugLine="Exit";
this.state = 40;
if (true) break;
 if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 167;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;
;
RDebugUtils.currentLine=125632615;
 //BA.debugLineNum = 125632615;BA.debugLine="Select True";

case 44:
//select
this.state = 141;
switch (BA.switchObjectToInt(parent.__c.True,(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_checkbox /*String*/ ),(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_b4xlistdialogtextfield /*String*/ ),(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_b4xsearchlistdialogtextfield /*String*/ ),(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_textfield /*String*/ ),(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_b4xinputdialogtextfield /*String*/ ),(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_textfieldbuttonselfecha /*String*/ ),(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_textfieldbuttonselfile /*String*/ ),(_infocampojfr.TipoControl /*String*/ ).equals(__ref._tipocontrol_textfieldbuttonselext /*String*/ ))) {
case 0: {
this.state = 46;
if (true) break;
}
case 1: {
this.state = 54;
if (true) break;
}
case 2: {
this.state = 75;
if (true) break;
}
case 3: {
this.state = 96;
if (true) break;
}
case 4: {
this.state = 104;
if (true) break;
}
case 5: {
this.state = 112;
if (true) break;
}
case 6: {
this.state = 126;
if (true) break;
}
case 7: {
this.state = 134;
if (true) break;
}
}
if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=125632619;
 //BA.debugLineNum = 125632619;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 80dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=125632620;
 //BA.debugLineNum = 125632620;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemChkBox\")";
_pnl.LoadLayout("scrFormRegistroItemChkBox",ba);
RDebugUtils.currentLine=125632623;
 //BA.debugLineNum = 125632623;BA.debugLine="chkBoxItemCampo.Tag=InfoCampojFR.CampoSQL";
__ref._chkboxitemcampo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632628;
 //BA.debugLineNum = 125632628;BA.debugLine="chkBoxItemCampo.Enabled=InfoCampojFR.ControlEdi";
__ref._chkboxitemcampo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setEnabled(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632630;
 //BA.debugLineNum = 125632630;BA.debugLine="InfoCampojFR.ControlDatoCampo=chkBoxItemCampo";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._chkboxitemcampo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .getObject());
RDebugUtils.currentLine=125632641;
 //BA.debugLineNum = 125632641;BA.debugLine="Dim ValInt As Int=FixNullInt(InfoCampojFR.Val";
_valint = __ref._fixnullint /*int*/ (null,_infocampojfr.ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=125632642;
 //BA.debugLineNum = 125632642;BA.debugLine="If ValInt=1 Then";
if (true) break;

case 47:
//if
this.state = 52;
if (_valint==1) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=125632643;
 //BA.debugLineNum = 125632643;BA.debugLine="chkBoxItemCampo.checked=True";
__ref._chkboxitemcampo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.True);
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=125632645;
 //BA.debugLineNum = 125632645;BA.debugLine="chkBoxItemCampo.checked=False";
__ref._chkboxitemcampo /*anywheresoftware.b4j.objects.CheckboxWrapper*/ .setChecked(parent.__c.False);
 if (true) break;

case 52:
//C
this.state = 141;
;
RDebugUtils.currentLine=125632647;
 //BA.debugLineNum = 125632647;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValInt";
_infocampojfr.ValorOutputCampo /*Object*/  = (Object)(_valint);
 if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=125632656;
 //BA.debugLineNum = 125632656;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 80dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=125632657;
 //BA.debugLineNum = 125632657;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemBtnTxtB4XLis";
_pnl.LoadLayout("scrFormRegistroItemBtnTxtB4XListTemplate",ba);
RDebugUtils.currentLine=125632659;
 //BA.debugLineNum = 125632659;BA.debugLine="txtB4XListTemplateItemCampo.Tag=InfoCampojFR.Ca";
__ref._txtb4xlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632660;
 //BA.debugLineNum = 125632660;BA.debugLine="btnB4XListTemplateItemCampo.Enabled=InfoCampojF";
__ref._btnb4xlisttemplateitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632662;
 //BA.debugLineNum = 125632662;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtB4XListTemplat";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._txtb4xlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject());
RDebugUtils.currentLine=125632663;
 //BA.debugLineNum = 125632663;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
if (true) break;

case 55:
//if
this.state = 73;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 73;
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=125632666;
 //BA.debugLineNum = 125632666;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Lista\" Then";
if (true) break;

case 60:
//if
this.state = 63;
if ((_infocampojfr.TipoDatosAux /*String*/ ).equals("Lista")) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=125632667;
 //BA.debugLineNum = 125632667;BA.debugLine="txtB4XListTemplateItemCampo.text=InfoCampojFR";
__ref._txtb4xlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;
;
RDebugUtils.currentLine=125632670;
 //BA.debugLineNum = 125632670;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" Then";

case 63:
//if
this.state = 72;
if ((_infocampojfr.TipoDatosAux /*String*/ ).equals("Consulta")) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=125632671;
 //BA.debugLineNum = 125632671;BA.debugLine="If NumCamposDatosAux=2 Then";
if (true) break;

case 66:
//if
this.state = 71;
if (_numcamposdatosaux==2) { 
this.state = 68;
}else {
this.state = 70;
}if (true) break;

case 68:
//C
this.state = 71;
RDebugUtils.currentLine=125632672;
 //BA.debugLineNum = 125632672;BA.debugLine="txtB4XListTemplateItemCampo.text=InfoCampojF";
__ref._txtb4xlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorMostrarCampoFormulario /*Object*/ ));
 if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=125632674;
 //BA.debugLineNum = 125632674;BA.debugLine="txtB4XListTemplateItemCampo.text=InfoCampojF";
__ref._txtb4xlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;

case 71:
//C
this.state = 72;
;
 if (true) break;

case 72:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 141;
;
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=125632680;
 //BA.debugLineNum = 125632680;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 80dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (80)));
RDebugUtils.currentLine=125632681;
 //BA.debugLineNum = 125632681;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemBtnTxtB4XSea";
_pnl.LoadLayout("scrFormRegistroItemBtnTxtB4XSearchListTemplate",ba);
RDebugUtils.currentLine=125632684;
 //BA.debugLineNum = 125632684;BA.debugLine="txtB4XSearchListTemplateItemCampo.Tag=InfoCampo";
__ref._txtb4xsearchlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632689;
 //BA.debugLineNum = 125632689;BA.debugLine="btnB4XSearchListTemplateItemCampo.Enabled=InfoC";
__ref._btnb4xsearchlisttemplateitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632691;
 //BA.debugLineNum = 125632691;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtB4XSearchListT";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._txtb4xsearchlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject());
RDebugUtils.currentLine=125632694;
 //BA.debugLineNum = 125632694;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
if (true) break;

case 76:
//if
this.state = 94;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 78;
}else {
this.state = 80;
}if (true) break;

case 78:
//C
this.state = 94;
 if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=125632698;
 //BA.debugLineNum = 125632698;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Lista\" Then";
if (true) break;

case 81:
//if
this.state = 84;
if ((_infocampojfr.TipoDatosAux /*String*/ ).equals("Lista")) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=125632701;
 //BA.debugLineNum = 125632701;BA.debugLine="txtB4XSearchListTemplateItemCampo.text=InfoCa";
__ref._txtb4xsearchlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;
;
RDebugUtils.currentLine=125632704;
 //BA.debugLineNum = 125632704;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" Then";

case 84:
//if
this.state = 93;
if ((_infocampojfr.TipoDatosAux /*String*/ ).equals("Consulta")) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=125632705;
 //BA.debugLineNum = 125632705;BA.debugLine="If NumCamposDatosAux=2 Then";
if (true) break;

case 87:
//if
this.state = 92;
if (_numcamposdatosaux==2) { 
this.state = 89;
}else {
this.state = 91;
}if (true) break;

case 89:
//C
this.state = 92;
RDebugUtils.currentLine=125632708;
 //BA.debugLineNum = 125632708;BA.debugLine="txtB4XSearchListTemplateItemCampo.text=InfoC";
__ref._txtb4xsearchlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorMostrarCampoFormulario /*Object*/ ));
 if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=125632712;
 //BA.debugLineNum = 125632712;BA.debugLine="txtB4XSearchListTemplateItemCampo.text=InfoC";
__ref._txtb4xsearchlisttemplateitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;

case 92:
//C
this.state = 93;
;
 if (true) break;

case 93:
//C
this.state = 94;
;
 if (true) break;

case 94:
//C
this.state = 141;
;
 if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=125632791;
 //BA.debugLineNum = 125632791;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (75)));
RDebugUtils.currentLine=125632792;
 //BA.debugLineNum = 125632792;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemTextField\")";
_pnl.LoadLayout("scrFormRegistroItemTextField",ba);
RDebugUtils.currentLine=125632795;
 //BA.debugLineNum = 125632795;BA.debugLine="txtItemCampo.tag=InfoCampojFR.CampoSQL";
__ref._txtitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632800;
 //BA.debugLineNum = 125632800;BA.debugLine="txtItemCampo.Editable=InfoCampojFR.ControlEdita";
__ref._txtitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632802;
 //BA.debugLineNum = 125632802;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtItemCampo";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._txtitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject());
RDebugUtils.currentLine=125632806;
 //BA.debugLineNum = 125632806;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
if (true) break;

case 97:
//if
this.state = 102;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 99;
}else {
this.state = 101;
}if (true) break;

case 99:
//C
this.state = 102;
 if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=125632810;
 //BA.debugLineNum = 125632810;BA.debugLine="txtItemCampo.text=InfoCampojFR.ValorOutputCamp";
__ref._txtitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;

case 102:
//C
this.state = 141;
;
 if (true) break;

case 104:
//C
this.state = 105;
RDebugUtils.currentLine=125632817;
 //BA.debugLineNum = 125632817;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (75)));
RDebugUtils.currentLine=125632818;
 //BA.debugLineNum = 125632818;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItemB4XInputDial";
_pnl.LoadLayout("scrFormRegistroItemB4XInputDialogTextField",ba);
RDebugUtils.currentLine=125632821;
 //BA.debugLineNum = 125632821;BA.debugLine="btnB4XInputDialogItemCampo.tag=InfoCampojFR.Cam";
__ref._btnb4xinputdialogitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632824;
 //BA.debugLineNum = 125632824;BA.debugLine="btnB4XInputDialogItemCampo.Enabled=InfoCampojFR";
__ref._btnb4xinputdialogitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632827;
 //BA.debugLineNum = 125632827;BA.debugLine="txtB4XInputDialogItemCampo.Editable=False";
__ref._txtb4xinputdialogitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(parent.__c.False);
RDebugUtils.currentLine=125632828;
 //BA.debugLineNum = 125632828;BA.debugLine="txtB4XInputDialogItemCampo.tag=btnB4XInputDialo";
__ref._txtb4xinputdialogitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setTag(__ref._btnb4xinputdialogitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=125632831;
 //BA.debugLineNum = 125632831;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtB4XInputDialog";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._txtb4xinputdialogitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject());
RDebugUtils.currentLine=125632834;
 //BA.debugLineNum = 125632834;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
if (true) break;

case 105:
//if
this.state = 110;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 107;
}else {
this.state = 109;
}if (true) break;

case 107:
//C
this.state = 110;
 if (true) break;

case 109:
//C
this.state = 110;
RDebugUtils.currentLine=125632838;
 //BA.debugLineNum = 125632838;BA.debugLine="txtB4XInputDialogItemCampo.text=InfoCampojFR.V";
__ref._txtb4xinputdialogitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;

case 110:
//C
this.state = 141;
;
 if (true) break;

case 112:
//C
this.state = 113;
RDebugUtils.currentLine=125632846;
 //BA.debugLineNum = 125632846;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (75)));
RDebugUtils.currentLine=125632847;
 //BA.debugLineNum = 125632847;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItembtntxtSelFec";
_pnl.LoadLayout("scrFormRegistroItembtntxtSelFecha",ba);
RDebugUtils.currentLine=125632850;
 //BA.debugLineNum = 125632850;BA.debugLine="btnSelFechaItemCampo.tag=InfoCampojFR.CampoSQL";
__ref._btnselfechaitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632853;
 //BA.debugLineNum = 125632853;BA.debugLine="btnSelFechaItemCampo.Enabled=InfoCampojFR.Contr";
__ref._btnselfechaitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632855;
 //BA.debugLineNum = 125632855;BA.debugLine="txtSelFechaItemCampo.tag=btnSelFechaItemCampo.t";
__ref._txtselfechaitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setTag(__ref._btnselfechaitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=125632856;
 //BA.debugLineNum = 125632856;BA.debugLine="txtSelFechaItemCampo.Editable=False";
__ref._txtselfechaitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(parent.__c.False);
RDebugUtils.currentLine=125632868;
 //BA.debugLineNum = 125632868;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtSelFechaItemCa";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._txtselfechaitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject());
RDebugUtils.currentLine=125632870;
 //BA.debugLineNum = 125632870;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=125632871;
 //BA.debugLineNum = 125632871;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=125632873;
 //BA.debugLineNum = 125632873;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
if (true) break;

case 113:
//if
this.state = 124;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 124;
 if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=125632876;
 //BA.debugLineNum = 125632876;BA.debugLine="If 0=InfoCampojFR.ValorOutputCampo Then";
if (true) break;

case 118:
//if
this.state = 123;
if (0==(double)(BA.ObjectToNumber(_infocampojfr.ValorOutputCampo /*Object*/ ))) { 
this.state = 120;
}else {
this.state = 122;
}if (true) break;

case 120:
//C
this.state = 123;
RDebugUtils.currentLine=125632877;
 //BA.debugLineNum = 125632877;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=\"\"";
_infocampojfr.ValorMostrarCampoFormulario /*Object*/  = (Object)("");
 if (true) break;

case 122:
//C
this.state = 123;
RDebugUtils.currentLine=125632881;
 //BA.debugLineNum = 125632881;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=Date";
_infocampojfr.ValorMostrarCampoFormulario /*Object*/  = (Object)(parent.__c.DateTime.Date(BA.ObjectToLongNumber(_infocampojfr.ValorOutputCampo /*Object*/ )));
 if (true) break;

case 123:
//C
this.state = 124;
;
RDebugUtils.currentLine=125632884;
 //BA.debugLineNum = 125632884;BA.debugLine="txtSelFechaItemCampo.text=InfoCampojFR.ValorMo";
__ref._txtselfechaitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorMostrarCampoFormulario /*Object*/ ));
 if (true) break;

case 124:
//C
this.state = 141;
;
RDebugUtils.currentLine=125632886;
 //BA.debugLineNum = 125632886;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
 if (true) break;

case 126:
//C
this.state = 127;
RDebugUtils.currentLine=125632891;
 //BA.debugLineNum = 125632891;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (75)));
RDebugUtils.currentLine=125632892;
 //BA.debugLineNum = 125632892;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItembtntxtSelFic";
_pnl.LoadLayout("scrFormRegistroItembtntxtSelFichero",ba);
RDebugUtils.currentLine=125632895;
 //BA.debugLineNum = 125632895;BA.debugLine="btnSelFicheroItemCampo.tag=InfoCampojFR.CampoSQ";
__ref._btnselficheroitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632898;
 //BA.debugLineNum = 125632898;BA.debugLine="btnSelFicheroItemCampo.Enabled=InfoCampojFR.Con";
__ref._btnselficheroitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632901;
 //BA.debugLineNum = 125632901;BA.debugLine="txtSelFicheroItemCampo.Editable=False";
__ref._txtselficheroitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(parent.__c.False);
RDebugUtils.currentLine=125632902;
 //BA.debugLineNum = 125632902;BA.debugLine="txtSelFicheroItemCampo.tag=btnSelFicheroItemCam";
__ref._txtselficheroitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setTag(__ref._btnselficheroitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=125632914;
 //BA.debugLineNum = 125632914;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtSelFicheroItem";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._txtselficheroitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject());
RDebugUtils.currentLine=125632917;
 //BA.debugLineNum = 125632917;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then  'si";
if (true) break;

case 127:
//if
this.state = 132;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 129;
}else {
this.state = 131;
}if (true) break;

case 129:
//C
this.state = 132;
RDebugUtils.currentLine=125632919;
 //BA.debugLineNum = 125632919;BA.debugLine="InfoCampojFR.ValorMostrarCampoFormulario=\"\"";
_infocampojfr.ValorMostrarCampoFormulario /*Object*/  = (Object)("");
RDebugUtils.currentLine=125632920;
 //BA.debugLineNum = 125632920;BA.debugLine="txtSelFicheroItemCampo.text=InfoCampojFR.Valor";
__ref._txtselficheroitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorMostrarCampoFormulario /*Object*/ ));
 if (true) break;

case 131:
//C
this.state = 132;
RDebugUtils.currentLine=125632922;
 //BA.debugLineNum = 125632922;BA.debugLine="txtSelFicheroItemCampo.text=InfoCampojFR.Valor";
__ref._txtselficheroitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;

case 132:
//C
this.state = 141;
;
 if (true) break;

case 134:
//C
this.state = 135;
RDebugUtils.currentLine=125632933;
 //BA.debugLineNum = 125632933;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, AnchoClv, 75dip)";
_pnl.SetLayoutAnimated((int) (0),0,0,_anchoclv,parent.__c.DipToCurrent((int) (75)));
RDebugUtils.currentLine=125632934;
 //BA.debugLineNum = 125632934;BA.debugLine="pnl.LoadLayout(\"scrFormRegistroItembtntxtSelVal";
_pnl.LoadLayout("scrFormRegistroItembtntxtSelValorCampoExt",ba);
RDebugUtils.currentLine=125632937;
 //BA.debugLineNum = 125632937;BA.debugLine="btnSelValorExtItemCampo.tag=InfoCampojFR.CampoS";
__ref._btnselvalorextitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setTag((Object)(_infocampojfr.CampoSQL /*String*/ ));
RDebugUtils.currentLine=125632940;
 //BA.debugLineNum = 125632940;BA.debugLine="btnSelValorExtItemCampo.Enabled=InfoCampojFR.Co";
__ref._btnselvalorextitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125632943;
 //BA.debugLineNum = 125632943;BA.debugLine="txtSelValorExtItemCampo.Editable=False";
__ref._txtselvalorextitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setEditable(parent.__c.False);
RDebugUtils.currentLine=125632944;
 //BA.debugLineNum = 125632944;BA.debugLine="txtSelValorExtItemCampo.tag=btnSelValorExtItemC";
__ref._txtselvalorextitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setTag(__ref._btnselvalorextitemcampo /*anywheresoftware.b4j.objects.ButtonWrapper*/ .getTag());
RDebugUtils.currentLine=125632956;
 //BA.debugLineNum = 125632956;BA.debugLine="InfoCampojFR.ControlDatoCampo=txtSelValorExtIte";
_infocampojfr.ControlDatoCampo /*Object*/  = (Object)(__ref._txtselvalorextitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject());
RDebugUtils.currentLine=125632959;
 //BA.debugLineNum = 125632959;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
if (true) break;

case 135:
//if
this.state = 140;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 137;
}else {
this.state = 139;
}if (true) break;

case 137:
//C
this.state = 140;
 if (true) break;

case 139:
//C
this.state = 140;
RDebugUtils.currentLine=125632963;
 //BA.debugLineNum = 125632963;BA.debugLine="txtSelValorExtItemCampo.text=InfoCampojFR.Valo";
__ref._txtselvalorextitemcampo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ ));
 if (true) break;

case 140:
//C
this.state = 141;
;
 if (true) break;

case 141:
//C
this.state = 142;
;
RDebugUtils.currentLine=125632973;
 //BA.debugLineNum = 125632973;BA.debugLine="lblTitleItemCampo.Text=InfoCampojFR.TituloCampo";
__ref._lbltitleitemcampo /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(_infocampojfr.TituloCampo /*String*/ );
RDebugUtils.currentLine=125632989;
 //BA.debugLineNum = 125632989;BA.debugLine="lblItemCampoObligatorio.Visible=InfoCampojFR.Camp";
__ref._lblitemcampoobligatorio /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible(_infocampojfr.CampoObligatorioCumplimentar /*boolean*/  && _infocampojfr.ControlEditable /*boolean*/ );
RDebugUtils.currentLine=125633000;
 //BA.debugLineNum = 125633000;BA.debugLine="If lstInfoCamposToolTip.IsInitialized Then";
if (true) break;

case 142:
//if
this.state = 159;
if (__ref._lstinfocampostooltip /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
this.state = 144;
}if (true) break;

case 144:
//C
this.state = 145;
RDebugUtils.currentLine=125633001;
 //BA.debugLineNum = 125633001;BA.debugLine="For Each m As Map In lstInfoCamposToolTip";
if (true) break;

case 145:
//for
this.state = 158;
_m = new anywheresoftware.b4a.objects.collections.Map();
group173 = __ref._lstinfocampostooltip /*anywheresoftware.b4a.objects.collections.List*/ ;
index173 = 0;
groupLen173 = group173.getSize();
this.state = 168;
if (true) break;

case 168:
//C
this.state = 158;
if (index173 < groupLen173) {
this.state = 147;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group173.Get(index173)));}
if (true) break;

case 169:
//C
this.state = 168;
index173++;
if (true) break;

case 147:
//C
this.state = 148;
RDebugUtils.currentLine=125633002;
 //BA.debugLineNum = 125633002;BA.debugLine="If m.Get(\"CampoSQL\")=InfoCampojFR.CampoSQL Then";
if (true) break;

case 148:
//if
this.state = 157;
if ((_m.Get((Object)("CampoSQL"))).equals((Object)(_infocampojfr.CampoSQL /*String*/ ))) { 
this.state = 150;
}if (true) break;

case 150:
//C
this.state = 151;
RDebugUtils.currentLine=125633003;
 //BA.debugLineNum = 125633003;BA.debugLine="Dim lblICToolt As Label=lblInfoCampoTooltip";
_lblictoolt = new anywheresoftware.b4j.objects.LabelWrapper();
_lblictoolt = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._lblinfocampotooltip /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=125633004;
 //BA.debugLineNum = 125633004;BA.debugLine="If m.get(\"TextoToolTipInfo\")<>\"\" Then";
if (true) break;

case 151:
//if
this.state = 156;
if ((_m.Get((Object)("TextoToolTipInfo"))).equals((Object)("")) == false) { 
this.state = 153;
}else {
this.state = 155;
}if (true) break;

case 153:
//C
this.state = 156;
RDebugUtils.currentLine=125633005;
 //BA.debugLineNum = 125633005;BA.debugLine="lblInfoCampoTooltip.Visible=True";
__ref._lblinfocampotooltip /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.True);
RDebugUtils.currentLine=125633007;
 //BA.debugLineNum = 125633007;BA.debugLine="lblICToolt.TooltipText=m.get(\"TextoToolTipInf";
_lblictoolt.setTooltipText(BA.ObjectToString(_m.Get((Object)("TextoToolTipInfo"))));
 if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=125633009;
 //BA.debugLineNum = 125633009;BA.debugLine="lblInfoCampoTooltip.Visible=False";
__ref._lblinfocampotooltip /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=125633010;
 //BA.debugLineNum = 125633010;BA.debugLine="lblICToolt.TooltipText=m.get(\"TextoToolTipInf";
_lblictoolt.setTooltipText(BA.ObjectToString(_m.Get((Object)("TextoToolTipInfo"))));
 if (true) break;

case 156:
//C
this.state = 157;
;
RDebugUtils.currentLine=125633012;
 //BA.debugLineNum = 125633012;BA.debugLine="Exit";
this.state = 158;
if (true) break;
 if (true) break;

case 157:
//C
this.state = 169;
;
 if (true) break;
if (true) break;

case 158:
//C
this.state = 159;
;
 if (true) break;
;
RDebugUtils.currentLine=125633018;
 //BA.debugLineNum = 125633018;BA.debugLine="If clvCamposRegistro.Size Mod 2=0 Then";

case 159:
//if
this.state = 164;
if (__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getsize()%2==0) { 
this.state = 161;
}else {
this.state = 163;
}if (true) break;

case 161:
//C
this.state = 164;
RDebugUtils.currentLine=125633019;
 //BA.debugLineNum = 125633019;BA.debugLine="pnl.Color=ColItemsPares";
_pnl.setColor(__ref._colitemspares /*int*/ );
 if (true) break;

case 163:
//C
this.state = 164;
RDebugUtils.currentLine=125633021;
 //BA.debugLineNum = 125633021;BA.debugLine="pnl.Color=ColItemsImpares";
_pnl.setColor(__ref._colitemsimpares /*int*/ );
 if (true) break;

case 164:
//C
this.state = -1;
;
RDebugUtils.currentLine=125633024;
 //BA.debugLineNum = 125633024;BA.debugLine="mItemCLV.Put(\"Panel\",pnl)";
_mitemclv.Put((Object)("Panel"),(Object)(_pnl.getObject()));
RDebugUtils.currentLine=125633026;
 //BA.debugLineNum = 125633026;BA.debugLine="mItemCLV.Put(\"ItemValue\",InfoCampojFR)";
_mitemclv.Put((Object)("ItemValue"),(Object)(_infocampojfr));
RDebugUtils.currentLine=125633028;
 //BA.debugLineNum = 125633028;BA.debugLine="Return mItemCLV";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mitemclv));return;};
RDebugUtils.currentLine=125633029;
 //BA.debugLineNum = 125633029;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _afterupdate(b4j.docU.jamformregistro __ref,anywheresoftware.b4a.objects.collections.Map _mdataactualizacion) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "afterupdate", true))
	 {return ((String) Debug.delegate(ba, "afterupdate", new Object[] {_mdataactualizacion}));}
RDebugUtils.currentLine=127270912;
 //BA.debugLineNum = 127270912;BA.debugLine="Public Sub AfterUpdate(mDataActualizacion As Map)";
RDebugUtils.currentLine=127270913;
 //BA.debugLineNum = 127270913;BA.debugLine="If SubExists(mCallBack,mEventName & \"_AfterUpdate";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_AfterUpdate")) { 
RDebugUtils.currentLine=127270914;
 //BA.debugLineNum = 127270914;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_AfterUp";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_AfterUpdate",(Object)(_mdataactualizacion));
 }else {
RDebugUtils.currentLine=127270916;
 //BA.debugLineNum = 127270916;BA.debugLine="ActualizarDatosCampo(mDataActualizacion)";
__ref._actualizardatoscampo /*void*/ (null,_mdataactualizacion);
 };
RDebugUtils.currentLine=127270918;
 //BA.debugLineNum = 127270918;BA.debugLine="End Sub";
return "";
}
public String  _animatedialog(b4j.docU.jamformregistro __ref,b4j.docU.b4xdialog _dlg,String _fromedge) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "animatedialog", true))
	 {return ((String) Debug.delegate(ba, "animatedialog", new Object[] {_dlg,_fromedge}));}
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
int _top = 0;
int _left = 0;
RDebugUtils.currentLine=127074304;
 //BA.debugLineNum = 127074304;BA.debugLine="Sub AnimateDialog (dlg As B4XDialog, FromEdge As S";
RDebugUtils.currentLine=127074305;
 //BA.debugLineNum = 127074305;BA.debugLine="Dim base As B4XView = dlg.Base";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_base = _dlg._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=127074306;
 //BA.debugLineNum = 127074306;BA.debugLine="Dim top As Int = base.Top";
_top = (int) (_base.getTop());
RDebugUtils.currentLine=127074307;
 //BA.debugLineNum = 127074307;BA.debugLine="Dim left As Int = base.Left";
_left = (int) (_base.getLeft());
RDebugUtils.currentLine=127074308;
 //BA.debugLineNum = 127074308;BA.debugLine="Select FromEdge.ToLowerCase";
switch (BA.switchObjectToInt(_fromedge.toLowerCase(),"bottom","top","left","right")) {
case 0: {
RDebugUtils.currentLine=127074310;
 //BA.debugLineNum = 127074310;BA.debugLine="base.Top = base.Parent.Height";
_base.setTop(_base.getParent().getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=127074312;
 //BA.debugLineNum = 127074312;BA.debugLine="base.Top = -base.Height";
_base.setTop(-_base.getHeight());
 break; }
case 2: {
RDebugUtils.currentLine=127074314;
 //BA.debugLineNum = 127074314;BA.debugLine="base.Left = -base.Width";
_base.setLeft(-_base.getWidth());
 break; }
case 3: {
RDebugUtils.currentLine=127074316;
 //BA.debugLineNum = 127074316;BA.debugLine="base.Left = base.Parent.Width";
_base.setLeft(_base.getParent().getWidth());
 break; }
}
;
RDebugUtils.currentLine=127074318;
 //BA.debugLineNum = 127074318;BA.debugLine="base.SetLayoutAnimated(300, left, top, base.Width";
_base.SetLayoutAnimated((int) (300),_left,_top,_base.getWidth(),_base.getHeight());
RDebugUtils.currentLine=127074319;
 //BA.debugLineNum = 127074319;BA.debugLine="End Sub";
return "";
}
public void  _asignartooltipinfocampo(b4j.docU.jamformregistro __ref,String _camposql,String _textotooltipinfo,boolean _asignar) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "asignartooltipinfocampo", true))
	 {Debug.delegate(ba, "asignartooltipinfocampo", new Object[] {_camposql,_textotooltipinfo,_asignar}); return;}
ResumableSub_AsignarToolTipInfoCampo rsub = new ResumableSub_AsignarToolTipInfoCampo(this,__ref,_camposql,_textotooltipinfo,_asignar);
rsub.resume(ba, null);
}
public static class ResumableSub_AsignarToolTipInfoCampo extends BA.ResumableSub {
public ResumableSub_AsignarToolTipInfoCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,String _camposql,String _textotooltipinfo,boolean _asignar) {
this.parent = parent;
this.__ref = __ref;
this._camposql = _camposql;
this._textotooltipinfo = _textotooltipinfo;
this._asignar = _asignar;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
String _camposql;
String _textotooltipinfo;
boolean _asignar;
boolean _flagcampoencontrado = false;
int _idx = 0;
b4j.docU.jamformregistro._infocampojamformregistro _clviv = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _pcsql = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.objects.LabelWrapper _lblinfot = null;
boolean _camposqlenlista = false;
anywheresoftware.b4a.objects.collections.Map _m = null;
Object _msa = null;
int step2;
int limit2;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group35;
int index35;
int groupLen35;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128319489;
 //BA.debugLineNum = 128319489;BA.debugLine="Dim FlagCampoEncontrado As Boolean";
_flagcampoencontrado = false;
RDebugUtils.currentLine=128319490;
 //BA.debugLineNum = 128319490;BA.debugLine="For iDx=0 To clvCamposRegistro.Size-1";
if (true) break;

case 1:
//for
this.state = 8;
step2 = 1;
limit2 = (int) (__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getsize()-1);
_idx = (int) (0) ;
this.state = 57;
if (true) break;

case 57:
//C
this.state = 8;
if ((step2 > 0 && _idx <= limit2) || (step2 < 0 && _idx >= limit2)) this.state = 3;
if (true) break;

case 58:
//C
this.state = 57;
_idx = ((int)(0 + _idx + step2)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=128319491;
 //BA.debugLineNum = 128319491;BA.debugLine="Dim clviv As InfoCampoJamFormRegistro=clvCamposR";
_clviv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=128319492;
 //BA.debugLineNum = 128319492;BA.debugLine="If clviv.CampoSQL=CampoSQL Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_clviv.CampoSQL /*String*/ ).equals(_camposql)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=128319493;
 //BA.debugLineNum = 128319493;BA.debugLine="FlagCampoEncontrado=True";
_flagcampoencontrado = parent.__c.True;
RDebugUtils.currentLine=128319494;
 //BA.debugLineNum = 128319494;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 58;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=128319497;
 //BA.debugLineNum = 128319497;BA.debugLine="If FlagCampoEncontrado Then";

case 8:
//if
this.state = 56;
if (_flagcampoencontrado) { 
this.state = 10;
}else {
this.state = 55;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=128319498;
 //BA.debugLineNum = 128319498;BA.debugLine="If lstInfoCamposToolTip.IsInitialized=False Then";
if (true) break;

case 11:
//if
this.state = 16;
if (__ref._lstinfocampostooltip /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()==parent.__c.False) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
__ref._lstinfocampostooltip /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=128319499;
 //BA.debugLineNum = 128319499;BA.debugLine="Dim pCSQl As Pane=clvCamposRegistro.GetPanel(iDx";
_pcsql = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_pcsql = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getpanel(_idx).getObject()));
RDebugUtils.currentLine=128319500;
 //BA.debugLineNum = 128319500;BA.debugLine="For Each n As Node In pCSQl.GetAllViewsRecursive";
if (true) break;

case 17:
//for
this.state = 53;
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
group12 = _pcsql.GetAllViewsRecursive();
index12 = 0;
groupLen12 = group12.getSize();
this.state = 59;
if (true) break;

case 59:
//C
this.state = 53;
if (index12 < groupLen12) {
this.state = 19;
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group12.Get(index12)));}
if (true) break;

case 60:
//C
this.state = 59;
index12++;
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=128319501;
 //BA.debugLineNum = 128319501;BA.debugLine="If n Is Label Then";
if (true) break;

case 20:
//if
this.state = 52;
if (_n.getObjectOrNull() instanceof javafx.scene.control.Label) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=128319502;
 //BA.debugLineNum = 128319502;BA.debugLine="If n.Tag=\"lblInfoCampoTooltipFormRegistro\" The";
if (true) break;

case 23:
//if
this.state = 51;
if ((_n.getTag()).equals((Object)("lblInfoCampoTooltipFormRegistro"))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=128319503;
 //BA.debugLineNum = 128319503;BA.debugLine="Dim lblInfoT As Label=n";
_lblinfot = new anywheresoftware.b4j.objects.LabelWrapper();
_lblinfot = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(_n.getObject()));
RDebugUtils.currentLine=128319504;
 //BA.debugLineNum = 128319504;BA.debugLine="If Asignar Then";
if (true) break;

case 26:
//if
this.state = 50;
if (_asignar) { 
this.state = 28;
}else {
this.state = 41;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=128319505;
 //BA.debugLineNum = 128319505;BA.debugLine="lblInfoT.TextSize=18";
_lblinfot.setTextSize(18);
RDebugUtils.currentLine=128319506;
 //BA.debugLineNum = 128319506;BA.debugLine="lblInfoT.Visible=True";
_lblinfot.setVisible(parent.__c.True);
RDebugUtils.currentLine=128319507;
 //BA.debugLineNum = 128319507;BA.debugLine="lblInfoT.TooltipText=TextoToolTipInfo";
_lblinfot.setTooltipText(_textotooltipinfo);
RDebugUtils.currentLine=128319508;
 //BA.debugLineNum = 128319508;BA.debugLine="Dim CampoSQLEnLista As Boolean";
_camposqlenlista = false;
RDebugUtils.currentLine=128319509;
 //BA.debugLineNum = 128319509;BA.debugLine="For Each m As Map In lstInfoCamposToolTip";
if (true) break;

case 29:
//for
this.state = 36;
_m = new anywheresoftware.b4a.objects.collections.Map();
group21 = __ref._lstinfocampostooltip /*anywheresoftware.b4a.objects.collections.List*/ ;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 61;
if (true) break;

case 61:
//C
this.state = 36;
if (index21 < groupLen21) {
this.state = 31;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 62:
//C
this.state = 61;
index21++;
if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=128319510;
 //BA.debugLineNum = 128319510;BA.debugLine="If m.Get(\"CampoSQL\")=CampoSQL Then";
if (true) break;

case 32:
//if
this.state = 35;
if ((_m.Get((Object)("CampoSQL"))).equals((Object)(_camposql))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=128319511;
 //BA.debugLineNum = 128319511;BA.debugLine="m.Put(\"TextoToolTipInfo\",TextoToolTipInfo)";
_m.Put((Object)("TextoToolTipInfo"),(Object)(_textotooltipinfo));
RDebugUtils.currentLine=128319512;
 //BA.debugLineNum = 128319512;BA.debugLine="CampoSQLEnLista=True";
_camposqlenlista = parent.__c.True;
RDebugUtils.currentLine=128319513;
 //BA.debugLineNum = 128319513;BA.debugLine="Exit";
this.state = 36;
if (true) break;
 if (true) break;

case 35:
//C
this.state = 62;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=128319516;
 //BA.debugLineNum = 128319516;BA.debugLine="If CampoSQLEnLista=False Then";

case 36:
//if
this.state = 39;
if (_camposqlenlista==parent.__c.False) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=128319517;
 //BA.debugLineNum = 128319517;BA.debugLine="Dim m As Map=CreateMap(\"CampoSQL\":CampoSQL,";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = parent.__c.createMap(new Object[] {(Object)("CampoSQL"),(Object)(_camposql),(Object)("TextoToolTipInfo"),(Object)(_textotooltipinfo)});
RDebugUtils.currentLine=128319518;
 //BA.debugLineNum = 128319518;BA.debugLine="lstInfoCamposToolTip.Add(m)";
__ref._lstinfocampostooltip /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_m.getObject()));
 if (true) break;

case 39:
//C
this.state = 50;
;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=128319521;
 //BA.debugLineNum = 128319521;BA.debugLine="lblInfoT.Visible=False";
_lblinfot.setVisible(parent.__c.False);
RDebugUtils.currentLine=128319522;
 //BA.debugLineNum = 128319522;BA.debugLine="lblInfoT.TooltipText=\"\"";
_lblinfot.setTooltipText("");
RDebugUtils.currentLine=128319523;
 //BA.debugLineNum = 128319523;BA.debugLine="For Each m As Map In lstInfoCamposToolTip";
if (true) break;

case 42:
//for
this.state = 49;
_m = new anywheresoftware.b4a.objects.collections.Map();
group35 = __ref._lstinfocampostooltip /*anywheresoftware.b4a.objects.collections.List*/ ;
index35 = 0;
groupLen35 = group35.getSize();
this.state = 63;
if (true) break;

case 63:
//C
this.state = 49;
if (index35 < groupLen35) {
this.state = 44;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group35.Get(index35)));}
if (true) break;

case 64:
//C
this.state = 63;
index35++;
if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=128319524;
 //BA.debugLineNum = 128319524;BA.debugLine="If m.Get(\"CampoSQL\")=CampoSQL Then";
if (true) break;

case 45:
//if
this.state = 48;
if ((_m.Get((Object)("CampoSQL"))).equals((Object)(_camposql))) { 
this.state = 47;
}if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=128319525;
 //BA.debugLineNum = 128319525;BA.debugLine="m.Put(\"TextoToolTipInfo\",\"\")";
_m.Put((Object)("TextoToolTipInfo"),(Object)(""));
RDebugUtils.currentLine=128319526;
 //BA.debugLineNum = 128319526;BA.debugLine="Exit";
this.state = 49;
if (true) break;
 if (true) break;

case 48:
//C
this.state = 64;
;
 if (true) break;
if (true) break;

case 49:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=128319530;
 //BA.debugLineNum = 128319530;BA.debugLine="Exit";
this.state = 53;
if (true) break;
 if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 53:
//C
this.state = 56;
;
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=128319535;
 //BA.debugLineNum = 128319535;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"CampoSQL \"  &";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"CampoSQL "+_camposql+" no encontrado en el método AsignarToolTipInfoCampo."+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación","Error");
RDebugUtils.currentLine=128319536;
 //BA.debugLineNum = 128319536;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "asignartooltipinfocampo"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = -1;
;
RDebugUtils.currentLine=128319538;
 //BA.debugLineNum = 128319538;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _beforeupdate(b4j.docU.jamformregistro __ref,anywheresoftware.b4a.objects.collections.Map _mdatavalidacion) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "beforeupdate", true))
	 {return ((String) Debug.delegate(ba, "beforeupdate", new Object[] {_mdatavalidacion}));}
RDebugUtils.currentLine=127205376;
 //BA.debugLineNum = 127205376;BA.debugLine="private Sub BeforeUpdate(mDataValidacion As Map)";
RDebugUtils.currentLine=127205377;
 //BA.debugLineNum = 127205377;BA.debugLine="If SubExists(mCallBack,mEventName & \"_BeforeUpdat";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeUpdate")) { 
RDebugUtils.currentLine=127205378;
 //BA.debugLineNum = 127205378;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_BeforeU";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BeforeUpdate",(Object)(_mdatavalidacion));
 }else {
RDebugUtils.currentLine=127205380;
 //BA.debugLineNum = 127205380;BA.debugLine="AfterUpdate(mDataValidacion)";
__ref._afterupdate /*String*/ (null,_mdatavalidacion);
 };
RDebugUtils.currentLine=127205382;
 //BA.debugLineNum = 127205382;BA.debugLine="End Sub";
return "";
}
public String  _btnb4xinputdialogitemcampo_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnb4xinputdialogitemcampo_click", true))
	 {return ((String) Debug.delegate(ba, "btnb4xinputdialogitemcampo_click", null));}
int _idx = 0;
RDebugUtils.currentLine=126025728;
 //BA.debugLineNum = 126025728;BA.debugLine="private Sub btnB4XInputDialogItemCampo_Click";
RDebugUtils.currentLine=126025730;
 //BA.debugLineNum = 126025730;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=126025731;
 //BA.debugLineNum = 126025731;BA.debugLine="MostrarB4XInputDialogItemCampo(idx)";
__ref._mostrarb4xinputdialogitemcampo /*void*/ (null,_idx);
RDebugUtils.currentLine=126025764;
 //BA.debugLineNum = 126025764;BA.debugLine="End Sub";
return "";
}
public String  _btnb4xinputdialogselficheroitemcampo_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnb4xinputdialogselficheroitemcampo_click", true))
	 {return ((String) Debug.delegate(ba, "btnb4xinputdialogselficheroitemcampo_click", null));}
int _idx = 0;
RDebugUtils.currentLine=128188416;
 //BA.debugLineNum = 128188416;BA.debugLine="Private Sub btnB4XInputDialogSelFicheroItemCampo_C";
RDebugUtils.currentLine=128188417;
 //BA.debugLineNum = 128188417;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=128188420;
 //BA.debugLineNum = 128188420;BA.debugLine="MostrarSelFicheroInputDialogItemCampo(idx)";
__ref._mostrarselficheroinputdialogitemcampo /*void*/ (null,_idx);
RDebugUtils.currentLine=128188421;
 //BA.debugLineNum = 128188421;BA.debugLine="End Sub";
return "";
}
public void  _mostrarselficheroinputdialogitemcampo(b4j.docU.jamformregistro __ref,int _idx) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "mostrarselficheroinputdialogitemcampo", true))
	 {Debug.delegate(ba, "mostrarselficheroinputdialogitemcampo", new Object[] {_idx}); return;}
ResumableSub_MostrarSelFicheroInputDialogItemCampo rsub = new ResumableSub_MostrarSelFicheroInputDialogItemCampo(this,__ref,_idx);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarSelFicheroInputDialogItemCampo extends BA.ResumableSub {
public ResumableSub_MostrarSelFicheroInputDialogItemCampo(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,int _idx) {
this.parent = parent;
this.__ref = __ref;
this._idx = _idx;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
int _idx;
b4j.docU.jamformregistro._infocampojamformregistro _iv = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btokdlg = null;
anywheresoftware.b4a.objects.B4XViewWrapper _btcanceldlg = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=128253954;
 //BA.debugLineNum = 128253954;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
_iv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=128253956;
 //BA.debugLineNum = 128253956;BA.debugLine="Dialog.Title=\"Indica \" & iv.TituloCampo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica "+_iv.TituloCampo /*String*/ );
RDebugUtils.currentLine=128253957;
 //BA.debugLineNum = 128253957;BA.debugLine="InputTemplate.Initialize";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=128253958;
 //BA.debugLineNum = 128253958;BA.debugLine="If FixNull(iv.ValorOutputCampo)<>\"\" And \"\"<>iv.Va";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._fixnull /*String*/ (null,_iv.ValorOutputCampo /*Object*/ )).equals("") == false && ("").equals(BA.ObjectToString(_iv.ValorOutputCampo /*Object*/ )) == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=128253959;
 //BA.debugLineNum = 128253959;BA.debugLine="InputTemplate.Text=iv.ValorOutputCampo";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._text /*String*/  = BA.ObjectToString(_iv.ValorOutputCampo /*Object*/ );
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=128253961;
 //BA.debugLineNum = 128253961;BA.debugLine="InputTemplate.lblTitle.Text=\"\"";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=128253964;
 //BA.debugLineNum = 128253964;BA.debugLine="InputTemplate.mBase.Width = 0.9*frmReg.Width";
__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(0.9*__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getWidth());
RDebugUtils.currentLine=128253966;
 //BA.debugLineNum = 128253966;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=128253967;
 //BA.debugLineNum = 128253967;BA.debugLine="Dim btOKDlg As B4XView=Dialog.GetButton(xui.Dialo";
_btokdlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btokdlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=128253968;
 //BA.debugLineNum = 128253968;BA.debugLine="btOKDlg.TextSize=14";
_btokdlg.setTextSize(14);
RDebugUtils.currentLine=128253969;
 //BA.debugLineNum = 128253969;BA.debugLine="Dim btCancelDlg As B4XView=Dialog.GetButton(xui.D";
_btcanceldlg = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btcanceldlg = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=128253970;
 //BA.debugLineNum = 128253970;BA.debugLine="btCancelDlg.TextSize=14";
_btcanceldlg.setTextSize(14);
RDebugUtils.currentLine=128253972;
 //BA.debugLineNum = 128253972;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "mostrarselficheroinputdialogitemcampo"), _rsub);
this.state = 9;
return;
case 9:
//C
this.state = 5;
_result = (int) result[1];
;
RDebugUtils.currentLine=128253973;
 //BA.debugLineNum = 128253973;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=128253974;
 //BA.debugLineNum = 128253974;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":IDx, \"clvIV\":";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent.__c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_iv),(Object)("ValorValidacion"),(Object)(__ref._inputtemplate /*b4j.docU.b4xinputtemplate*/ ._text /*String*/ )});
RDebugUtils.currentLine=128253975;
 //BA.debugLineNum = 128253975;BA.debugLine="BeforeUpdate(mData)";
__ref._beforeupdate /*String*/ (null,_mdata);
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=128253977;
 //BA.debugLineNum = 128253977;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnb4xlisttemplateitemcampo_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnb4xlisttemplateitemcampo_click", true))
	 {return ((String) Debug.delegate(ba, "btnb4xlisttemplateitemcampo_click", null));}
int _idx = 0;
RDebugUtils.currentLine=126156800;
 //BA.debugLineNum = 126156800;BA.debugLine="private Sub btnB4XListTemplateItemCampo_Click";
RDebugUtils.currentLine=126156802;
 //BA.debugLineNum = 126156802;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=126156804;
 //BA.debugLineNum = 126156804;BA.debugLine="MostrarB4XListTemplateItemCampo(idx)";
__ref._mostrarb4xlisttemplateitemcampo /*void*/ (null,_idx);
RDebugUtils.currentLine=126156869;
 //BA.debugLineNum = 126156869;BA.debugLine="End Sub";
return "";
}
public String  _btnb4xsearchlisttemplateitemcampo_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnb4xsearchlisttemplateitemcampo_click", true))
	 {return ((String) Debug.delegate(ba, "btnb4xsearchlisttemplateitemcampo_click", null));}
int _idx = 0;
RDebugUtils.currentLine=126287872;
 //BA.debugLineNum = 126287872;BA.debugLine="Private Sub btnB4XSearchListTemplateItemCampo_Clic";
RDebugUtils.currentLine=126287873;
 //BA.debugLineNum = 126287873;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=126287875;
 //BA.debugLineNum = 126287875;BA.debugLine="MostrarB4XSearchListTemplateItemCampo(idx)";
__ref._mostrarb4xsearchlisttemplateitemcampo /*void*/ (null,_idx);
RDebugUtils.currentLine=126287876;
 //BA.debugLineNum = 126287876;BA.debugLine="End Sub";
return "";
}
public void  _btncancelar_click(b4j.docU.jamformregistro __ref) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btncancelar_click", true))
	 {Debug.delegate(ba, "btncancelar_click", null); return;}
ResumableSub_btnCancelar_Click rsub = new ResumableSub_btnCancelar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCancelar_Click extends BA.ResumableSub {
public ResumableSub_btnCancelar_Click(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
boolean _flagcambios = false;
Object _msa = null;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125763585;
 //BA.debugLineNum = 125763585;BA.debugLine="Dim FlagCambios As Boolean=ComprobarCambiosEnRegi";
_flagcambios = __ref._comprobarcambiosenregistro /*boolean*/ (null);
RDebugUtils.currentLine=125763586;
 //BA.debugLineNum = 125763586;BA.debugLine="If FlagCambios Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_flagcambios) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=125763588;
 //BA.debugLineNum = 125763588;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Hay cambio";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Hay cambios no grabados. ¿Salir sin grabar?","Cambios no grabados","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=125763589;
 //BA.debugLineNum = 125763589;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "btncancelar_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_result = (int) result[1];
;
RDebugUtils.currentLine=125763590;
 //BA.debugLineNum = 125763590;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=125763591;
 //BA.debugLineNum = 125763591;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=125763594;
 //BA.debugLineNum = 125763594;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=125763597;
 //BA.debugLineNum = 125763597;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _comprobarcambiosenregistro(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "comprobarcambiosenregistro", true))
	 {return ((Boolean) Debug.delegate(ba, "comprobarcambiosenregistro", null));}
boolean _flagcambioenvalores = false;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
RDebugUtils.currentLine=125108224;
 //BA.debugLineNum = 125108224;BA.debugLine="Sub ComprobarCambiosEnRegistro As Boolean";
RDebugUtils.currentLine=125108226;
 //BA.debugLineNum = 125108226;BA.debugLine="Dim flagCambioEnValores As Boolean=False";
_flagcambioenvalores = __c.False;
RDebugUtils.currentLine=125108281;
 //BA.debugLineNum = 125108281;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(group2.Get(index2));
RDebugUtils.currentLine=125108282;
 //BA.debugLineNum = 125108282;BA.debugLine="If InfoCampojFR.ValorOutputCampo<>Null Then";
if (_infocampojfr.ValorOutputCampo /*Object*/ != null) { 
RDebugUtils.currentLine=125108283;
 //BA.debugLineNum = 125108283;BA.debugLine="If InfoCampojFR.ValorOutputCampo <>InfoCampojFR";
if ((_infocampojfr.ValorOutputCampo /*Object*/ ).equals(_infocampojfr.ValorInputCampo /*Object*/ ) == false) { 
RDebugUtils.currentLine=125108284;
 //BA.debugLineNum = 125108284;BA.debugLine="flagCambioEnValores=True";
_flagcambioenvalores = __c.True;
RDebugUtils.currentLine=125108285;
 //BA.debugLineNum = 125108285;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
RDebugUtils.currentLine=125108290;
 //BA.debugLineNum = 125108290;BA.debugLine="Return flagCambioEnValores";
if (true) return _flagcambioenvalores;
RDebugUtils.currentLine=125108291;
 //BA.debugLineNum = 125108291;BA.debugLine="End Sub";
return false;
}
public String  _btnconfigurarjson_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnconfigurarjson_click", true))
	 {return ((String) Debug.delegate(ba, "btnconfigurarjson_click", null));}
RDebugUtils.currentLine=128057344;
 //BA.debugLineNum = 128057344;BA.debugLine="Private Sub btnConfigurarJSON_Click";
RDebugUtils.currentLine=128057347;
 //BA.debugLineNum = 128057347;BA.debugLine="AbrirRecordFormBuilder(\"Edicion\",mNombreFicheroJS";
__ref._abrirrecordformbuilder /*void*/ (null,"Edicion",__ref._mnombreficherojson /*String*/ );
RDebugUtils.currentLine=128057348;
 //BA.debugLineNum = 128057348;BA.debugLine="End Sub";
return "";
}
public void  _btnok_click(b4j.docU.jamformregistro __ref) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnok_click", true))
	 {Debug.delegate(ba, "btnok_click", null); return;}
ResumableSub_btnOK_Click rsub = new ResumableSub_btnOK_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnOK_Click extends BA.ResumableSub {
public ResumableSub_btnOK_Click(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
boolean _flagcambios = false;
Object _msa = null;
int _result = 0;
int _i = 0;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
int _valorcampoint = 0;
String _valorcampostr = "";
double _valorcamporeal = 0;
int step16;
int limit16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125698049;
 //BA.debugLineNum = 125698049;BA.debugLine="If mModoRegistro<>\"Editar\" And mModoRegistro<>\"Nu";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._mmodoregistro /*String*/ ).equals("Editar") == false && (__ref._mmodoregistro /*String*/ ).equals("Nuevo") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=125698050;
 //BA.debugLineNum = 125698050;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=125698051;
 //BA.debugLineNum = 125698051;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=125698054;
 //BA.debugLineNum = 125698054;BA.debugLine="Dim FlagCambios As Boolean=ComprobarCambiosEnRegi";
_flagcambios = __ref._comprobarcambiosenregistro /*boolean*/ (null);
RDebugUtils.currentLine=125698055;
 //BA.debugLineNum = 125698055;BA.debugLine="If FlagCambios=False Then";
if (true) break;

case 5:
//if
this.state = 14;
if (_flagcambios==parent.__c.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=125698056;
 //BA.debugLineNum = 125698056;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"NO hay cam";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"NO hay cambios respecto al registro. ¿Salir sin grabar?","Sin cambios en el registro","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=125698057;
 //BA.debugLineNum = 125698057;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 8;
_result = (int) result[1];
;
RDebugUtils.currentLine=125698058;
 //BA.debugLineNum = 125698058;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=125698059;
 //BA.debugLineNum = 125698059;BA.debugLine="frmReg.Close";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=125698060;
 //BA.debugLineNum = 125698060;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=125698062;
 //BA.debugLineNum = 125698062;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
RDebugUtils.currentLine=125698069;
 //BA.debugLineNum = 125698069;BA.debugLine="For i=0 To clvCamposRegistro.Size-1";

case 14:
//for
this.state = 35;
step16 = 1;
limit16 = (int) (__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 55;
if (true) break;

case 55:
//C
this.state = 35;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 16;
if (true) break;

case 56:
//C
this.state = 55;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=125698071;
 //BA.debugLineNum = 125698071;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro=clv";
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_i));
RDebugUtils.currentLine=125698075;
 //BA.debugLineNum = 125698075;BA.debugLine="If InfoCampojFR.ValorOutputCampo=Null Then";
if (true) break;

case 17:
//if
this.state = 34;
if (_infocampojfr.ValorOutputCampo /*Object*/ == null) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=125698077;
 //BA.debugLineNum = 125698077;BA.debugLine="If InfoCampojFR.CampoObligatorioCumplimentar Th";
if (true) break;

case 20:
//if
this.state = 23;
if (_infocampojfr.CampoObligatorioCumplimentar /*boolean*/ ) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=125698079;
 //BA.debugLineNum = 125698079;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es obligato";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es obligatorio indicar un valor para el campo "+_infocampojfr.TituloCampo /*String*/ +"."+parent.__c.CRLF+parent.__c.CRLF+"No es posible grabar el registro.","Error");
RDebugUtils.currentLine=125698080;
 //BA.debugLineNum = 125698080;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 23;
;
RDebugUtils.currentLine=125698081;
 //BA.debugLineNum = 125698081;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 34;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=125698084;
 //BA.debugLineNum = 125698084;BA.debugLine="Select True";
if (true) break;

case 26:
//select
this.state = 33;
switch (BA.switchObjectToInt(parent.__c.True,(_infocampojfr.TipoDato /*String*/ ).equals("INTEGER"),(_infocampojfr.TipoDato /*String*/ ).equals("TEXT"),(_infocampojfr.TipoDato /*String*/ ).equals("REAL"))) {
case 0: {
this.state = 28;
if (true) break;
}
case 1: {
this.state = 30;
if (true) break;
}
case 2: {
this.state = 32;
if (true) break;
}
}
if (true) break;

case 28:
//C
this.state = 33;
RDebugUtils.currentLine=125698088;
 //BA.debugLineNum = 125698088;BA.debugLine="Dim ValorCampoInt As Int=InfoCampojFR.ValorOu";
_valorcampoint = (int)(BA.ObjectToNumber(_infocampojfr.ValorOutputCampo /*Object*/ ));
RDebugUtils.currentLine=125698090;
 //BA.debugLineNum = 125698090;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValorCampoInt";
_infocampojfr.ValorOutputCampo /*Object*/  = (Object)(_valorcampoint);
 if (true) break;

case 30:
//C
this.state = 33;
RDebugUtils.currentLine=125698094;
 //BA.debugLineNum = 125698094;BA.debugLine="Dim ValorCampoStr As String=InfoCampojFR.Valo";
_valorcampostr = BA.ObjectToString(_infocampojfr.ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=125698096;
 //BA.debugLineNum = 125698096;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValorCampoStr";
_infocampojfr.ValorOutputCampo /*Object*/  = (Object)(_valorcampostr);
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=125698100;
 //BA.debugLineNum = 125698100;BA.debugLine="Dim ValorCampoReal As Double=InfoCampojFR.Val";
_valorcamporeal = (double)(BA.ObjectToNumber(_infocampojfr.ValorOutputCampo /*Object*/ ));
RDebugUtils.currentLine=125698102;
 //BA.debugLineNum = 125698102;BA.debugLine="InfoCampojFR.ValorOutputCampo=ValorCampoReal";
_infocampojfr.ValorOutputCampo /*Object*/  = (Object)(_valorcamporeal);
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = 56;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=125698118;
 //BA.debugLineNum = 125698118;BA.debugLine="If mModoRegistro=\"Editar\" Then";

case 35:
//if
this.state = 44;
if ((__ref._mmodoregistro /*String*/ ).equals("Editar")) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=125698119;
 //BA.debugLineNum = 125698119;BA.debugLine="If SubExists(mCallBack,mEventName & \"_GrabarEdic";
if (true) break;

case 38:
//if
this.state = 43;
if (parent.__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_GrabarEdicionRegistro")) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
RDebugUtils.currentLine=125698121;
 //BA.debugLineNum = 125698121;BA.debugLine="Log(\"\")";
parent.__c.LogImpl("9125698121","",0);
RDebugUtils.currentLine=125698122;
 //BA.debugLineNum = 125698122;BA.debugLine="Log(\"CallSubDelayed2(mCallBack,mEventName & _Gr";
parent.__c.LogImpl("9125698122","CallSubDelayed2(mCallBack,mEventName & _GrabarEdicionRegistro",0);
RDebugUtils.currentLine=125698123;
 //BA.debugLineNum = 125698123;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_Grabar";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_GrabarEdicionRegistro",(Object)(__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ));
 if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=125698125;
 //BA.debugLineNum = 125698125;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha def";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha definido Sub para grabar la edición del registro en el módulo CallBack."+parent.__c.CRLF+parent.__c.CRLF+"No es posible grabar el registro."+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=125698126;
 //BA.debugLineNum = 125698126;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 43;
;
RDebugUtils.currentLine=125698127;
 //BA.debugLineNum = 125698127;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;
;
RDebugUtils.currentLine=125698131;
 //BA.debugLineNum = 125698131;BA.debugLine="If mModoRegistro=\"Nuevo\" Then";

case 44:
//if
this.state = 53;
if ((__ref._mmodoregistro /*String*/ ).equals("Nuevo")) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=125698132;
 //BA.debugLineNum = 125698132;BA.debugLine="If SubExists(mCallBack,mEventName & \"_GrabarNuev";
if (true) break;

case 47:
//if
this.state = 52;
if (parent.__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_GrabarNuevoRegistro")) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=125698134;
 //BA.debugLineNum = 125698134;BA.debugLine="Log(\"\")";
parent.__c.LogImpl("9125698134","",0);
RDebugUtils.currentLine=125698135;
 //BA.debugLineNum = 125698135;BA.debugLine="Log(\"CallSubDelayed2(mCallBack,mEventName & _Gr";
parent.__c.LogImpl("9125698135","CallSubDelayed2(mCallBack,mEventName & _GrabarNuevoRegistro",0);
RDebugUtils.currentLine=125698136;
 //BA.debugLineNum = 125698136;BA.debugLine="CallSubDelayed2(mCallBack,mEventName & \"_Grabar";
parent.__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_GrabarNuevoRegistro",(Object)(__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ));
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=125698138;
 //BA.debugLineNum = 125698138;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha def";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha definido Sub para la grabar nuevo registro en el módulo CallBack."+parent.__c.CRLF+parent.__c.CRLF+"No es posible grabar el registro."+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=125698139;
 //BA.debugLineNum = 125698139;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "btnok_click"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 52;
;
RDebugUtils.currentLine=125698140;
 //BA.debugLineNum = 125698140;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;

case 53:
//C
this.state = -1;
;
RDebugUtils.currentLine=125698143;
 //BA.debugLineNum = 125698143;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnselfechaitemcampo_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnselfechaitemcampo_click", true))
	 {return ((String) Debug.delegate(ba, "btnselfechaitemcampo_click", null));}
int _idx = 0;
RDebugUtils.currentLine=126812160;
 //BA.debugLineNum = 126812160;BA.debugLine="private Sub btnSelFechaItemCampo_Click";
RDebugUtils.currentLine=126812161;
 //BA.debugLineNum = 126812161;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=126812163;
 //BA.debugLineNum = 126812163;BA.debugLine="MostrarSelFechaItemCampo(idx)";
__ref._mostrarselfechaitemcampo /*void*/ (null,_idx);
RDebugUtils.currentLine=126812177;
 //BA.debugLineNum = 126812177;BA.debugLine="End Sub";
return "";
}
public String  _btnselficheroitemcampo_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnselficheroitemcampo_click", true))
	 {return ((String) Debug.delegate(ba, "btnselficheroitemcampo_click", null));}
int _idx = 0;
RDebugUtils.currentLine=126615552;
 //BA.debugLineNum = 126615552;BA.debugLine="private Sub btnSelFicheroItemCampo_Click";
RDebugUtils.currentLine=126615554;
 //BA.debugLineNum = 126615554;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=126615556;
 //BA.debugLineNum = 126615556;BA.debugLine="MostrarSelFicheroItemCampo(idx)";
__ref._mostrarselficheroitemcampo /*void*/ (null,_idx);
RDebugUtils.currentLine=126615601;
 //BA.debugLineNum = 126615601;BA.debugLine="End Sub";
return "";
}
public String  _btnselvalorextitemcampo_click(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "btnselvalorextitemcampo_click", true))
	 {return ((String) Debug.delegate(ba, "btnselvalorextitemcampo_click", null));}
int _idx = 0;
RDebugUtils.currentLine=126943232;
 //BA.debugLineNum = 126943232;BA.debugLine="private Sub btnSelValorExtItemCampo_Click";
RDebugUtils.currentLine=126943233;
 //BA.debugLineNum = 126943233;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=126943235;
 //BA.debugLineNum = 126943235;BA.debugLine="MostrarSelValorExtItemCampo(idx)";
__ref._mostrarselvalorextitemcampo /*void*/ (null,_idx);
RDebugUtils.currentLine=126943245;
 //BA.debugLineNum = 126943245;BA.debugLine="End Sub";
return "";
}
public void  _cargacamposclv(b4j.docU.jamformregistro __ref) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cargacamposclv", true))
	 {Debug.delegate(ba, "cargacamposclv", null); return;}
ResumableSub_CargaCamposCLV rsub = new ResumableSub_CargaCamposCLV(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaCamposCLV extends BA.ResumableSub {
public ResumableSub_CargaCamposCLV(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
b4j.docU.jamformregistro._infocampojamformregistro _iv = null;
anywheresoftware.b4a.BA.IterableList group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125566977;
 //BA.debugLineNum = 125566977;BA.debugLine="clvCamposRegistro.Clear";
__ref._clvcamposregistro /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=125566980;
 //BA.debugLineNum = 125566980;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";
if (true) break;

case 1:
//for
this.state = 8;
group2 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
index2 = 0;
groupLen2 = group2.getSize();
this.state = 9;
if (true) break;

case 9:
//C
this.state = 8;
if (index2 < groupLen2) {
this.state = 3;
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(group2.Get(index2));}
if (true) break;

case 10:
//C
this.state = 9;
index2++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=125566985;
 //BA.debugLineNum = 125566985;BA.debugLine="If InfoCampojFR.TipoControl<>\"\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_infocampojfr.TipoControl /*String*/ ).equals("") == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=125566987;
 //BA.debugLineNum = 125566987;BA.debugLine="Dim rSUB As ResumableSub=CrearItemCLV(InfoCampo";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._crearitemclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_infocampojfr);
RDebugUtils.currentLine=125566988;
 //BA.debugLineNum = 125566988;BA.debugLine="Wait For (rSUB) complete (mItem As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargacamposclv"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 7;
_mitem = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=125566990;
 //BA.debugLineNum = 125566990;BA.debugLine="Dim p As B4XView=mItem.Get(\"Panel\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_mitem.Get((Object)("Panel"))));
RDebugUtils.currentLine=125566992;
 //BA.debugLineNum = 125566992;BA.debugLine="Dim IV As InfoCampoJamFormRegistro=mItem.Get(\"I";
_iv = (b4j.docU.jamformregistro._infocampojamformregistro)(_mitem.Get((Object)("ItemValue")));
RDebugUtils.currentLine=125566993;
 //BA.debugLineNum = 125566993;BA.debugLine="clvCamposRegistro.Add(p,IV)";
__ref._clvcamposregistro /*b4j.example.customlistview*/ ._add(_p,(Object)(_iv));
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=125566998;
 //BA.debugLineNum = 125566998;BA.debugLine="clvCamposRegistro.Base_Resize(clvCamposRegistro.A";
__ref._clvcamposregistro /*b4j.example.customlistview*/ ._base_resize(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._asview().getWidth(),__ref._clvcamposregistro /*b4j.example.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=125566999;
 //BA.debugLineNum = 125566999;BA.debugLine="CallSubDelayed(Me,\"CargaCamposCLV_Completed\")";
parent.__c.CallSubDelayed(ba,parent,"CargaCamposCLV_Completed");
RDebugUtils.currentLine=125567000;
 //BA.debugLineNum = 125567000;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargacamposjrdcmysql(b4j.docU.jamformregistro __ref,String _ipjrdc,int _puertojrdc,String _nombretabla) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cargacamposjrdcmysql", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargacamposjrdcmysql", new Object[] {_ipjrdc,_puertojrdc,_nombretabla}));}
ResumableSub_CargaCamposJRDCMySQL rsub = new ResumableSub_CargaCamposJRDCMySQL(this,__ref,_ipjrdc,_puertojrdc,_nombretabla);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaCamposJRDCMySQL extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCMySQL(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,String _ipjrdc,int _puertojrdc,String _nombretabla) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
String _ipjrdc;
int _puertojrdc;
String _nombretabla;
String _accion = "";
String _rdclinkquery = "";
String _comandoconfigprop = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
String _tipodato = "";
String _tipodatomysql = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mreg = null;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
int step23;
int limit23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125435905;
 //BA.debugLineNum = 125435905;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=125435908;
 //BA.debugLineNum = 125435908;BA.debugLine="mlstInfoCampos.Initialize";
__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=125435909;
 //BA.debugLineNum = 125435909;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=125435910;
 //BA.debugLineNum = 125435910;BA.debugLine="Dim ComandoConfigProp As String=\"InfoCamposTabla\"";
_comandoconfigprop = "InfoCamposTabla";
RDebugUtils.currentLine=125435912;
 //BA.debugLineNum = 125435912;BA.debugLine="Log(\"Antes de CargaCamposJRDC \" & IPJrdc & \", \" &";
parent.__c.LogImpl("9125435912","Antes de CargaCamposJRDC "+_ipjrdc+", "+BA.NumberToString(_puertojrdc)+", "+_nombretabla,0);
RDebugUtils.currentLine=125435913;
 //BA.debugLineNum = 125435913;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigprop,new Object[]{(Object)(_nombretabla)},parent);
RDebugUtils.currentLine=125435914;
 //BA.debugLineNum = 125435914;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargacamposjrdcmysql"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=125435915;
 //BA.debugLineNum = 125435915;BA.debugLine="Log (\"Despues de CargaCamposJRDC, mresult \" & mre";
parent.__c.LogImpl("9125435915","Despues de CargaCamposJRDC, mresult "+BA.ObjectToString(_mresult),0);
RDebugUtils.currentLine=125435916;
 //BA.debugLineNum = 125435916;BA.debugLine="frmReg.rootpane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=125435917;
 //BA.debugLineNum = 125435917;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 55;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
RDebugUtils.currentLine=125435918;
 //BA.debugLineNum = 125435918;BA.debugLine="Accion=\"ErrorServer\"";
_accion = "ErrorServer";
RDebugUtils.currentLine=125435920;
 //BA.debugLineNum = 125435920;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sin conexión";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sin conexión con el servidor / base de datos / error de consulta"+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación","Error");
RDebugUtils.currentLine=125435921;
 //BA.debugLineNum = 125435921;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargacamposjrdcmysql"), _msa);
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
RDebugUtils.currentLine=125435923;
 //BA.debugLineNum = 125435923;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 54;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
RDebugUtils.currentLine=125435924;
 //BA.debugLineNum = 125435924;BA.debugLine="Accion=\"TablaNoExiste\"";
_accion = "TablaNoExiste";
RDebugUtils.currentLine=125435926;
 //BA.debugLineNum = 125435926;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La tabla \" &";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La tabla "+_nombretabla+" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos.","Error");
RDebugUtils.currentLine=125435927;
 //BA.debugLineNum = 125435927;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargacamposjrdcmysql"), _msa);
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
RDebugUtils.currentLine=125435929;
 //BA.debugLineNum = 125435929;BA.debugLine="Dim TipoDato As String";
_tipodato = "";
RDebugUtils.currentLine=125435930;
 //BA.debugLineNum = 125435930;BA.debugLine="Dim TipoDatoMySQL As String";
_tipodatomysql = "";
RDebugUtils.currentLine=125435931;
 //BA.debugLineNum = 125435931;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=125435934;
 //BA.debugLineNum = 125435934;BA.debugLine="For i=0 To lstRes.Size-1";
if (true) break;

case 11:
//for
this.state = 48;
step23 = 1;
limit23 = (int) (_lstres.getSize()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 48;
if ((step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23)) this.state = 13;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step23)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=125435935;
 //BA.debugLineNum = 125435935;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
_mreg = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get(_i)));
RDebugUtils.currentLine=125435938;
 //BA.debugLineNum = 125435938;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro";
_infocampojfr = new b4j.docU.jamformregistro._infocampojamformregistro();
RDebugUtils.currentLine=125435939;
 //BA.debugLineNum = 125435939;BA.debugLine="InfoCampojFR.CampoSQL=mReg.Get(\"COLUMN_NAME\")";
_infocampojfr.CampoSQL /*String*/  = BA.ObjectToString(_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=125435940;
 //BA.debugLineNum = 125435940;BA.debugLine="InfoCampojFR.TituloCampo=mReg.Get(\"COLUMN_NAME";
_infocampojfr.TituloCampo /*String*/  = BA.ObjectToString(_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=125435941;
 //BA.debugLineNum = 125435941;BA.debugLine="InfoCampojFR.TipoDatoSQL=mReg.Get(\"DATA_TYPE\")";
_infocampojfr.TipoDatoSQL /*String*/  = BA.ObjectToString(_mreg.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=125435942;
 //BA.debugLineNum = 125435942;BA.debugLine="InfoCampojFR.TipoColumnaSQL=mReg.Get(\"COLUMN_T";
_infocampojfr.TipoColumnaSQL /*String*/  = BA.ObjectToString(_mreg.Get((Object)("COLUMN_TYPE")));
RDebugUtils.currentLine=125435943;
 //BA.debugLineNum = 125435943;BA.debugLine="InfoCampojFR.NoNuloSQL=\"NO\"=mReg.Get(\"IS_NULLA";
_infocampojfr.NoNuloSQL /*boolean*/  = ("NO").equals(BA.ObjectToString(_mreg.Get((Object)("IS_NULLABLE"))));
RDebugUtils.currentLine=125435944;
 //BA.debugLineNum = 125435944;BA.debugLine="InfoCampojFR.PrimaryKeySQL=\"PRI\"=mReg.Get(\"COL";
_infocampojfr.PrimaryKeySQL /*boolean*/  = ("PRI").equals(BA.ObjectToString(_mreg.Get((Object)("COLUMN_KEY"))));
RDebugUtils.currentLine=125435945;
 //BA.debugLineNum = 125435945;BA.debugLine="InfoCampojFR.AutoIncrementalSQL=\"auto_incremen";
_infocampojfr.AutoIncrementalSQL /*boolean*/  = ("auto_increment").equals(BA.ObjectToString(_mreg.Get((Object)("EXTRA"))));
RDebugUtils.currentLine=125435946;
 //BA.debugLineNum = 125435946;BA.debugLine="InfoCampojFR.ValorCampoPorDefectoSQL=mReg.Get(";
_infocampojfr.ValorCampoPorDefectoSQL /*Object*/  = _mreg.Get((Object)("COLUMN_DEFAULT"));
RDebugUtils.currentLine=125435950;
 //BA.debugLineNum = 125435950;BA.debugLine="Select InfoCampojFR.TipoDatoSQL";
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_infocampojfr.TipoDatoSQL /*String*/ ,"smallint","int","tinyint","bit","bigint","varchar","char","text","nchar","ntext","nvarchar","enum","double","decimal","float")) {
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
RDebugUtils.currentLine=125435968;
 //BA.debugLineNum = 125435968;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 18:
//C
this.state = 47;
RDebugUtils.currentLine=125435970;
 //BA.debugLineNum = 125435970;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 20:
//C
this.state = 47;
RDebugUtils.currentLine=125435972;
 //BA.debugLineNum = 125435972;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 22:
//C
this.state = 47;
RDebugUtils.currentLine=125435974;
 //BA.debugLineNum = 125435974;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 24:
//C
this.state = 47;
RDebugUtils.currentLine=125435976;
 //BA.debugLineNum = 125435976;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 26:
//C
this.state = 47;
RDebugUtils.currentLine=125435978;
 //BA.debugLineNum = 125435978;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 28:
//C
this.state = 47;
RDebugUtils.currentLine=125435980;
 //BA.debugLineNum = 125435980;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 30:
//C
this.state = 47;
RDebugUtils.currentLine=125435982;
 //BA.debugLineNum = 125435982;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 32:
//C
this.state = 47;
RDebugUtils.currentLine=125435984;
 //BA.debugLineNum = 125435984;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 34:
//C
this.state = 47;
RDebugUtils.currentLine=125435986;
 //BA.debugLineNum = 125435986;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 36:
//C
this.state = 47;
RDebugUtils.currentLine=125435988;
 //BA.debugLineNum = 125435988;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 38:
//C
this.state = 47;
RDebugUtils.currentLine=125435990;
 //BA.debugLineNum = 125435990;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 40:
//C
this.state = 47;
RDebugUtils.currentLine=125435992;
 //BA.debugLineNum = 125435992;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 42:
//C
this.state = 47;
RDebugUtils.currentLine=125435994;
 //BA.debugLineNum = 125435994;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=125435996;
 //BA.debugLineNum = 125435996;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=125435999;
 //BA.debugLineNum = 125435999;BA.debugLine="TipoDato=\"\"";
_tipodato = "";
 if (true) break;

case 47:
//C
this.state = 60;
;
RDebugUtils.currentLine=125436003;
 //BA.debugLineNum = 125436003;BA.debugLine="InfoCampojFR.TipoDato=TipoDato";
_infocampojfr.TipoDato /*String*/  = _tipodato;
RDebugUtils.currentLine=125436005;
 //BA.debugLineNum = 125436005;BA.debugLine="mlstInfoCampos.Add(InfoCampojFR)";
__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_infocampojfr));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=125436009;
 //BA.debugLineNum = 125436009;BA.debugLine="If mlstInfoCampos.Size=0 Then";

case 48:
//if
this.state = 53;
if (__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
RDebugUtils.currentLine=125436010;
 //BA.debugLineNum = 125436010;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
_accion = "TablaExisteSinCampos";
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=125436012;
 //BA.debugLineNum = 125436012;BA.debugLine="Accion=\"OK\"";
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
RDebugUtils.currentLine=125436018;
 //BA.debugLineNum = 125436018;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=125436019;
 //BA.debugLineNum = 125436019;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargacamposjrdcsqlserver(b4j.docU.jamformregistro __ref,String _ipjrdc,int _puertojrdc,String _nombretabla) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cargacamposjrdcsqlserver", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargacamposjrdcsqlserver", new Object[] {_ipjrdc,_puertojrdc,_nombretabla}));}
ResumableSub_CargaCamposJRDCSQLServer rsub = new ResumableSub_CargaCamposJRDCSQLServer(this,__ref,_ipjrdc,_puertojrdc,_nombretabla);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaCamposJRDCSQLServer extends BA.ResumableSub {
public ResumableSub_CargaCamposJRDCSQLServer(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,String _ipjrdc,int _puertojrdc,String _nombretabla) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdc = _ipjrdc;
this._puertojrdc = _puertojrdc;
this._nombretabla = _nombretabla;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
String _ipjrdc;
int _puertojrdc;
String _nombretabla;
String _accion = "";
String _rdclinkquery = "";
String _comandoconfigprop = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
String _tipodato = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mreg = null;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
int step22;
int limit22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125501441;
 //BA.debugLineNum = 125501441;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=125501444;
 //BA.debugLineNum = 125501444;BA.debugLine="mlstInfoCampos.Initialize";
__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=125501445;
 //BA.debugLineNum = 125501445;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdc & \"";
_rdclinkquery = "http://"+_ipjrdc+":"+BA.NumberToString(_puertojrdc)+"/rdc";
RDebugUtils.currentLine=125501447;
 //BA.debugLineNum = 125501447;BA.debugLine="Dim ComandoConfigProp As String=\"InfoTotalCamposT";
_comandoconfigprop = "InfoTotalCamposTabla";
RDebugUtils.currentLine=125501449;
 //BA.debugLineNum = 125501449;BA.debugLine="Log(\"Antes de CargaCamposJRDC \" & IPJrdc & \", \" &";
parent.__c.LogImpl("9125501449","Antes de CargaCamposJRDC "+_ipjrdc+", "+BA.NumberToString(_puertojrdc)+", "+_nombretabla,0);
RDebugUtils.currentLine=125501450;
 //BA.debugLineNum = 125501450;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigPro";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigprop,new Object[]{(Object)(_nombretabla),(Object)(_nombretabla)},parent);
RDebugUtils.currentLine=125501451;
 //BA.debugLineNum = 125501451;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargacamposjrdcsqlserver"), null);
this.state = 56;
return;
case 56:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=125501452;
 //BA.debugLineNum = 125501452;BA.debugLine="Log (\"Despues de CargaCamposJRDC, mresult \" & mre";
parent.__c.LogImpl("9125501452","Despues de CargaCamposJRDC, mresult "+BA.ObjectToString(_mresult),0);
RDebugUtils.currentLine=125501453;
 //BA.debugLineNum = 125501453;BA.debugLine="frmReg.rootpane.MouseCursor = fx.Cursors.DEFAULT";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=125501454;
 //BA.debugLineNum = 125501454;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 55;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 55;
RDebugUtils.currentLine=125501455;
 //BA.debugLineNum = 125501455;BA.debugLine="Accion=\"ErrorServer\"";
_accion = "ErrorServer";
RDebugUtils.currentLine=125501457;
 //BA.debugLineNum = 125501457;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sin conexión";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sin conexión con el servidor / base de datos / error de consulta"+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación","Error");
RDebugUtils.currentLine=125501458;
 //BA.debugLineNum = 125501458;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargacamposjrdcsqlserver"), _msa);
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
RDebugUtils.currentLine=125501460;
 //BA.debugLineNum = 125501460;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 54;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 54;
RDebugUtils.currentLine=125501461;
 //BA.debugLineNum = 125501461;BA.debugLine="Accion=\"TablaNoExiste\"";
_accion = "TablaNoExiste";
RDebugUtils.currentLine=125501463;
 //BA.debugLineNum = 125501463;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La tabla \" &";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La tabla "+_nombretabla+" no existe en la base de datos correspondiente a los parámetros JRDC, no es posible configurar sus campos.","Error");
RDebugUtils.currentLine=125501464;
 //BA.debugLineNum = 125501464;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargacamposjrdcsqlserver"), _msa);
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
RDebugUtils.currentLine=125501466;
 //BA.debugLineNum = 125501466;BA.debugLine="Dim TipoDato As String";
_tipodato = "";
RDebugUtils.currentLine=125501468;
 //BA.debugLineNum = 125501468;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=125501471;
 //BA.debugLineNum = 125501471;BA.debugLine="For i=0 To lstRes.Size-1";
if (true) break;

case 11:
//for
this.state = 48;
step22 = 1;
limit22 = (int) (_lstres.getSize()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 48;
if ((step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22)) this.state = 13;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step22)) ;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=125501472;
 //BA.debugLineNum = 125501472;BA.debugLine="Dim mReg As Map=lstRes.Get(i)";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
_mreg = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get(_i)));
RDebugUtils.currentLine=125501475;
 //BA.debugLineNum = 125501475;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro";
_infocampojfr = new b4j.docU.jamformregistro._infocampojamformregistro();
RDebugUtils.currentLine=125501476;
 //BA.debugLineNum = 125501476;BA.debugLine="InfoCampojFR.CampoSQL=mReg.Get(\"COLUMN_NAME\")";
_infocampojfr.CampoSQL /*String*/  = BA.ObjectToString(_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=125501477;
 //BA.debugLineNum = 125501477;BA.debugLine="InfoCampojFR.TituloCampo=mReg.Get(\"COLUMN_NAME";
_infocampojfr.TituloCampo /*String*/  = BA.ObjectToString(_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=125501478;
 //BA.debugLineNum = 125501478;BA.debugLine="InfoCampojFR.TipoDatoSQL=mReg.Get(\"DATA_TYPE\")";
_infocampojfr.TipoDatoSQL /*String*/  = BA.ObjectToString(_mreg.Get((Object)("DATA_TYPE")));
RDebugUtils.currentLine=125501479;
 //BA.debugLineNum = 125501479;BA.debugLine="InfoCampojFR.TipoColumnaSQL=mReg.Get(\"COLUMN_T";
_infocampojfr.TipoColumnaSQL /*String*/  = BA.ObjectToString(_mreg.Get((Object)("COLUMN_TYPE")));
RDebugUtils.currentLine=125501480;
 //BA.debugLineNum = 125501480;BA.debugLine="InfoCampojFR.NoNuloSQL=\"NO\"=mReg.Get(\"IS_NULLA";
_infocampojfr.NoNuloSQL /*boolean*/  = ("NO").equals(BA.ObjectToString(_mreg.Get((Object)("IS_NULLABLE"))));
RDebugUtils.currentLine=125501484;
 //BA.debugLineNum = 125501484;BA.debugLine="InfoCampojFR.PrimaryKeySQL=mReg.Get(\"PK\")=mReg";
_infocampojfr.PrimaryKeySQL /*boolean*/  = (_mreg.Get((Object)("PK"))).equals(_mreg.Get((Object)("COLUMN_NAME")));
RDebugUtils.currentLine=125501485;
 //BA.debugLineNum = 125501485;BA.debugLine="InfoCampojFR.AutoIncrementalSQL=1=mReg.Get(\"Id";
_infocampojfr.AutoIncrementalSQL /*boolean*/  = 1==(double)(BA.ObjectToNumber(_mreg.Get((Object)("Identidad"))));
RDebugUtils.currentLine=125501486;
 //BA.debugLineNum = 125501486;BA.debugLine="InfoCampojFR.ValorCampoPorDefectoSQL=mReg.Get(";
_infocampojfr.ValorCampoPorDefectoSQL /*Object*/  = _mreg.Get((Object)("COLUMN_DEFAULT"));
RDebugUtils.currentLine=125501490;
 //BA.debugLineNum = 125501490;BA.debugLine="Select InfoCampojFR.TipoDatoSQL";
if (true) break;

case 14:
//select
this.state = 47;
switch (BA.switchObjectToInt(_infocampojfr.TipoDatoSQL /*String*/ ,"smallint","int","tinyint","bit","varchar","char","text","nchar","ntext","nvarchar","enum","double","decimal","float","bigint")) {
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
RDebugUtils.currentLine=125501492;
 //BA.debugLineNum = 125501492;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 18:
//C
this.state = 47;
RDebugUtils.currentLine=125501494;
 //BA.debugLineNum = 125501494;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 20:
//C
this.state = 47;
RDebugUtils.currentLine=125501496;
 //BA.debugLineNum = 125501496;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 22:
//C
this.state = 47;
RDebugUtils.currentLine=125501498;
 //BA.debugLineNum = 125501498;BA.debugLine="TipoDato=\"INTEGER\"";
_tipodato = "INTEGER";
 if (true) break;

case 24:
//C
this.state = 47;
RDebugUtils.currentLine=125501500;
 //BA.debugLineNum = 125501500;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 26:
//C
this.state = 47;
RDebugUtils.currentLine=125501502;
 //BA.debugLineNum = 125501502;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 28:
//C
this.state = 47;
RDebugUtils.currentLine=125501504;
 //BA.debugLineNum = 125501504;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 30:
//C
this.state = 47;
RDebugUtils.currentLine=125501506;
 //BA.debugLineNum = 125501506;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 32:
//C
this.state = 47;
RDebugUtils.currentLine=125501508;
 //BA.debugLineNum = 125501508;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 34:
//C
this.state = 47;
RDebugUtils.currentLine=125501510;
 //BA.debugLineNum = 125501510;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 36:
//C
this.state = 47;
RDebugUtils.currentLine=125501512;
 //BA.debugLineNum = 125501512;BA.debugLine="TipoDato=\"TEXT\"";
_tipodato = "TEXT";
 if (true) break;

case 38:
//C
this.state = 47;
RDebugUtils.currentLine=125501514;
 //BA.debugLineNum = 125501514;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 40:
//C
this.state = 47;
RDebugUtils.currentLine=125501516;
 //BA.debugLineNum = 125501516;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 42:
//C
this.state = 47;
RDebugUtils.currentLine=125501518;
 //BA.debugLineNum = 125501518;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=125501520;
 //BA.debugLineNum = 125501520;BA.debugLine="TipoDato=\"REAL\"";
_tipodato = "REAL";
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=125501522;
 //BA.debugLineNum = 125501522;BA.debugLine="TipoDato=\"\"";
_tipodato = "";
 if (true) break;

case 47:
//C
this.state = 60;
;
RDebugUtils.currentLine=125501526;
 //BA.debugLineNum = 125501526;BA.debugLine="InfoCampojFR.TipoDato=TipoDato";
_infocampojfr.TipoDato /*String*/  = _tipodato;
RDebugUtils.currentLine=125501528;
 //BA.debugLineNum = 125501528;BA.debugLine="mlstInfoCampos.Add(InfoCampojFR)";
__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_infocampojfr));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=125501532;
 //BA.debugLineNum = 125501532;BA.debugLine="If mlstInfoCampos.Size=0 Then";

case 48:
//if
this.state = 53;
if (__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
this.state = 50;
}else {
this.state = 52;
}if (true) break;

case 50:
//C
this.state = 53;
RDebugUtils.currentLine=125501533;
 //BA.debugLineNum = 125501533;BA.debugLine="Accion=\"TablaExisteSinCampos\"";
_accion = "TablaExisteSinCampos";
 if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=125501535;
 //BA.debugLineNum = 125501535;BA.debugLine="Accion=\"OK\"";
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
RDebugUtils.currentLine=125501541;
 //BA.debugLineNum = 125501541;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=125501542;
 //BA.debugLineNum = 125501542;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cargaitemsauxcontrol(b4j.docU.jamformregistro __ref,String _ipjrdcorigendatosaux,String _puertojrdcorigendatosaux,String _comandoconfigdatosaux,anywheresoftware.b4a.objects.collections.List _lstparametroscomandodatosaux) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cargaitemsauxcontrol", true))
	 {Debug.delegate(ba, "cargaitemsauxcontrol", new Object[] {_ipjrdcorigendatosaux,_puertojrdcorigendatosaux,_comandoconfigdatosaux,_lstparametroscomandodatosaux}); return;}
ResumableSub_CargaItemsAuxControl rsub = new ResumableSub_CargaItemsAuxControl(this,__ref,_ipjrdcorigendatosaux,_puertojrdcorigendatosaux,_comandoconfigdatosaux,_lstparametroscomandodatosaux);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaItemsAuxControl extends BA.ResumableSub {
public ResumableSub_CargaItemsAuxControl(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,String _ipjrdcorigendatosaux,String _puertojrdcorigendatosaux,String _comandoconfigdatosaux,anywheresoftware.b4a.objects.collections.List _lstparametroscomandodatosaux) {
this.parent = parent;
this.__ref = __ref;
this._ipjrdcorigendatosaux = _ipjrdcorigendatosaux;
this._puertojrdcorigendatosaux = _puertojrdcorigendatosaux;
this._comandoconfigdatosaux = _comandoconfigdatosaux;
this._lstparametroscomandodatosaux = _lstparametroscomandodatosaux;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
String _ipjrdcorigendatosaux;
String _puertojrdcorigendatosaux;
String _comandoconfigdatosaux;
anywheresoftware.b4a.objects.collections.List _lstparametroscomandodatosaux;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _rdclinkquery = "";
String[] _params = null;
int _idxparam = 0;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=127139841;
 //BA.debugLineNum = 127139841;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=127139842;
 //BA.debugLineNum = 127139842;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=127139843;
 //BA.debugLineNum = 127139843;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=127139844;
 //BA.debugLineNum = 127139844;BA.debugLine="Dim rdcLinkQuery As String=\"http://\" & IPJrdcOrig";
_rdclinkquery = "http://"+_ipjrdcorigendatosaux+":"+_puertojrdcorigendatosaux+"/rdc";
RDebugUtils.currentLine=127139846;
 //BA.debugLineNum = 127139846;BA.debugLine="If lstParametrosComandoDatosAux.Size=0 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_lstparametroscomandodatosaux.getSize()==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=127139847;
 //BA.debugLineNum = 127139847;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigDa";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigdatosaux,(Object[])(parent.__c.Null),parent);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=127139850;
 //BA.debugLineNum = 127139850;BA.debugLine="Dim Params(lstParametrosComandoDatosAux.Size) As";
_params = new String[_lstparametroscomandodatosaux.getSize()];
java.util.Arrays.fill(_params,"");
RDebugUtils.currentLine=127139851;
 //BA.debugLineNum = 127139851;BA.debugLine="For iDxParam=0 To lstParametrosComandoDatosAux.S";
if (true) break;

case 6:
//for
this.state = 9;
step9 = 1;
limit9 = (int) (_lstparametroscomandodatosaux.getSize()-1);
_idxparam = (int) (0) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 9;
if ((step9 > 0 && _idxparam <= limit9) || (step9 < 0 && _idxparam >= limit9)) this.state = 8;
if (true) break;

case 24:
//C
this.state = 23;
_idxparam = ((int)(0 + _idxparam + step9)) ;
if (true) break;

case 8:
//C
this.state = 24;
RDebugUtils.currentLine=127139852;
 //BA.debugLineNum = 127139852;BA.debugLine="Params(iDxParam)=lstParametrosComandoDatosAux.G";
_params[_idxparam] = BA.ObjectToString(_lstparametroscomandodatosaux.Get(_idxparam));
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=127139854;
 //BA.debugLineNum = 127139854;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkQuery,ComandoConfigDa";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkquery,_comandoconfigdatosaux,(Object[])(_params),parent);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=127139856;
 //BA.debugLineNum = 127139856;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargaitemsauxcontrol"), null);
this.state = 25;
return;
case 25:
//C
this.state = 11;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=127139857;
 //BA.debugLineNum = 127139857;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 11:
//if
this.state = 22;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 22;
RDebugUtils.currentLine=127139858;
 //BA.debugLineNum = 127139858;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query","Error");
RDebugUtils.currentLine=127139859;
 //BA.debugLineNum = 127139859;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargaitemsauxcontrol"), _msa);
this.state = 26;
return;
case 26:
//C
this.state = 22;
;
RDebugUtils.currentLine=127139860;
 //BA.debugLineNum = 127139860;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=127139862;
 //BA.debugLineNum = 127139862;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 16:
//if
this.state = 21;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=127139863;
 //BA.debugLineNum = 127139863;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos auxiliares para la carga del control","Error");
RDebugUtils.currentLine=127139864;
 //BA.debugLineNum = 127139864;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "cargaitemsauxcontrol"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 21;
;
RDebugUtils.currentLine=127139865;
 //BA.debugLineNum = 127139865;BA.debugLine="Accion=\"ErrNoDataAux\"";
_accion = "ErrNoDataAux";
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=127139867;
 //BA.debugLineNum = 127139867;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=127139870;
 //BA.debugLineNum = 127139870;BA.debugLine="CallSubDelayed3(Me,\"CargaItemsAuxControl_Complete";
parent.__c.CallSubDelayed3(ba,parent,"CargaItemsAuxControl_Completed",(Object)(_accion),(Object)(_lstreg));
RDebugUtils.currentLine=127139871;
 //BA.debugLineNum = 127139871;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public double  _cdbl(b4j.docU.jamformregistro __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cdbl", true))
	 {return ((Double) Debug.delegate(ba, "cdbl", new Object[] {_o}));}
String _ox = "";
RDebugUtils.currentLine=127860736;
 //BA.debugLineNum = 127860736;BA.debugLine="private Sub CDbl(o As Object) As Double";
RDebugUtils.currentLine=127860737;
 //BA.debugLineNum = 127860737;BA.debugLine="Try";
try {RDebugUtils.currentLine=127860738;
 //BA.debugLineNum = 127860738;BA.debugLine="Dim ox As String = o";
_ox = BA.ObjectToString(_o);
RDebugUtils.currentLine=127860739;
 //BA.debugLineNum = 127860739;BA.debugLine="ox = GetNumbers(ox)";
_ox = __ref._getnumbers /*String*/ (null,_ox);
RDebugUtils.currentLine=127860740;
 //BA.debugLineNum = 127860740;BA.debugLine="If ox = \"\" Then ox = \"0\"";
if ((_ox).equals("")) { 
_ox = "0";};
RDebugUtils.currentLine=127860741;
 //BA.debugLineNum = 127860741;BA.debugLine="Return ox";
if (true) return (double)(Double.parseDouble(_ox));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=127860743;
 //BA.debugLineNum = 127860743;BA.debugLine="Return 0";
if (true) return 0;
 };
RDebugUtils.currentLine=127860745;
 //BA.debugLineNum = 127860745;BA.debugLine="End Sub";
return 0;
}
public String  _getnumbers(b4j.docU.jamformregistro __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "getnumbers", true))
	 {return ((String) Debug.delegate(ba, "getnumbers", new Object[] {_value}));}
int _strcnt = 0;
String _str = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _master = "";
RDebugUtils.currentLine=127991808;
 //BA.debugLineNum = 127991808;BA.debugLine="private Sub GetNumbers(value As String) As String";
RDebugUtils.currentLine=127991809;
 //BA.debugLineNum = 127991809;BA.debugLine="Dim strCnt As Int";
_strcnt = 0;
RDebugUtils.currentLine=127991810;
 //BA.debugLineNum = 127991810;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=127991811;
 //BA.debugLineNum = 127991811;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=127991812;
 //BA.debugLineNum = 127991812;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=127991813;
 //BA.debugLineNum = 127991813;BA.debugLine="Dim master As String = \"0123456789-.\"";
_master = "0123456789-.";
RDebugUtils.currentLine=127991814;
 //BA.debugLineNum = 127991814;BA.debugLine="For strCnt = 0 To value.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_value.length()-1);
_strcnt = (int) (0) ;
for (;_strcnt <= limit6 ;_strcnt = _strcnt + step6 ) {
RDebugUtils.currentLine=127991815;
 //BA.debugLineNum = 127991815;BA.debugLine="str = value.CharAt(strCnt)";
_str = BA.ObjectToString(_value.charAt(_strcnt));
RDebugUtils.currentLine=127991816;
 //BA.debugLineNum = 127991816;BA.debugLine="If master.IndexOf(str) >= 0 Then";
if (_master.indexOf(_str)>=0) { 
RDebugUtils.currentLine=127991817;
 //BA.debugLineNum = 127991817;BA.debugLine="sb.Append(str)";
_sb.Append(_str);
 };
 }
};
RDebugUtils.currentLine=127991820;
 //BA.debugLineNum = 127991820;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=127991821;
 //BA.debugLineNum = 127991821;BA.debugLine="End Sub";
return "";
}
public String  _chkboxitemcampo_mouseclicked(b4j.docU.jamformregistro __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "chkboxitemcampo_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "chkboxitemcampo_mouseclicked", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.CheckboxWrapper _chk = null;
int _idx = 0;
b4j.docU.jamformregistro._infocampojamformregistro _iv = null;
int _valorvalidacion = 0;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
RDebugUtils.currentLine=126746624;
 //BA.debugLineNum = 126746624;BA.debugLine="private Sub chkBoxItemCampo_MouseClicked (EventDat";
RDebugUtils.currentLine=126746625;
 //BA.debugLineNum = 126746625;BA.debugLine="Dim chk As CheckBox=Sender";
_chk = new anywheresoftware.b4j.objects.CheckboxWrapper();
_chk = (anywheresoftware.b4j.objects.CheckboxWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.CheckboxWrapper(), (javafx.scene.control.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=126746626;
 //BA.debugLineNum = 126746626;BA.debugLine="Log(\"chkBoxItemCampo_CheckedChange Checked \" & ch";
__c.LogImpl("9126746626","chkBoxItemCampo_CheckedChange Checked "+BA.ObjectToString(_chk.getChecked()),0);
RDebugUtils.currentLine=126746627;
 //BA.debugLineNum = 126746627;BA.debugLine="Dim idx As Int=clvCamposRegistro.GetItemFromView(";
_idx = __ref._clvcamposregistro /*b4j.example.customlistview*/ ._getitemfromview((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_chk.getObject())));
RDebugUtils.currentLine=126746628;
 //BA.debugLineNum = 126746628;BA.debugLine="Log(\"idx CheckBox: \" & idx)";
__c.LogImpl("9126746628","idx CheckBox: "+BA.NumberToString(_idx),0);
RDebugUtils.currentLine=126746629;
 //BA.debugLineNum = 126746629;BA.debugLine="Log(\"clvCamposRegistro.GetValue(idx) \" & clvCampo";
__c.LogImpl("9126746629","clvCamposRegistro.GetValue(idx) "+BA.ObjectToString(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx)),0);
RDebugUtils.currentLine=126746630;
 //BA.debugLineNum = 126746630;BA.debugLine="Dim iv As InfoCampoJamFormRegistro=clvCamposRegis";
_iv = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idx));
RDebugUtils.currentLine=126746631;
 //BA.debugLineNum = 126746631;BA.debugLine="Dim ValorValidacion As Int";
_valorvalidacion = 0;
RDebugUtils.currentLine=126746632;
 //BA.debugLineNum = 126746632;BA.debugLine="If chk.Checked Then";
if (_chk.getChecked()) { 
RDebugUtils.currentLine=126746633;
 //BA.debugLineNum = 126746633;BA.debugLine="ValorValidacion=1";
_valorvalidacion = (int) (1);
 }else {
RDebugUtils.currentLine=126746635;
 //BA.debugLineNum = 126746635;BA.debugLine="ValorValidacion=0";
_valorvalidacion = (int) (0);
 };
RDebugUtils.currentLine=126746637;
 //BA.debugLineNum = 126746637;BA.debugLine="Dim mData As Map=CreateMap(\"Index\":idx, \"clvIV\":i";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = __c.createMap(new Object[] {(Object)("Index"),(Object)(_idx),(Object)("clvIV"),(Object)(_iv),(Object)("ValorValidacion"),(Object)(_valorvalidacion)});
RDebugUtils.currentLine=126746638;
 //BA.debugLineNum = 126746638;BA.debugLine="BeforeUpdate(mData)";
__ref._beforeupdate /*String*/ (null,_mdata);
RDebugUtils.currentLine=126746639;
 //BA.debugLineNum = 126746639;BA.debugLine="End Sub";
return "";
}
public int  _cint(b4j.docU.jamformregistro __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cint", true))
	 {return ((Integer) Debug.delegate(ba, "cint", new Object[] {_o}));}
String _ox = "";
RDebugUtils.currentLine=127926272;
 //BA.debugLineNum = 127926272;BA.debugLine="private Sub CInt(o As Object) As Int";
RDebugUtils.currentLine=127926273;
 //BA.debugLineNum = 127926273;BA.debugLine="Try";
try {RDebugUtils.currentLine=127926274;
 //BA.debugLineNum = 127926274;BA.debugLine="Dim ox As String = o";
_ox = BA.ObjectToString(_o);
RDebugUtils.currentLine=127926275;
 //BA.debugLineNum = 127926275;BA.debugLine="ox = GetNumbers(ox)";
_ox = __ref._getnumbers /*String*/ (null,_ox);
RDebugUtils.currentLine=127926276;
 //BA.debugLineNum = 127926276;BA.debugLine="If ox = \"\" Then ox = \"0\"";
if ((_ox).equals("")) { 
_ox = "0";};
RDebugUtils.currentLine=127926277;
 //BA.debugLineNum = 127926277;BA.debugLine="Return Floor(ox)";
if (true) return (int) (__c.Floor((double)(Double.parseDouble(_ox))));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=127926279;
 //BA.debugLineNum = 127926279;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=127926281;
 //BA.debugLineNum = 127926281;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
RDebugUtils.currentLine=124059648;
 //BA.debugLineNum = 124059648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=124059649;
 //BA.debugLineNum = 124059649;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=124059650;
 //BA.debugLineNum = 124059650;BA.debugLine="Private frmReg As Form";
_frmreg = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=124059651;
 //BA.debugLineNum = 124059651;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=124059652;
 //BA.debugLineNum = 124059652;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=124059653;
 //BA.debugLineNum = 124059653;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=124059655;
 //BA.debugLineNum = 124059655;BA.debugLine="Private mModoRegistro As String";
_mmodoregistro = "";
RDebugUtils.currentLine=124059656;
 //BA.debugLineNum = 124059656;BA.debugLine="Private btnCancelar As Button";
_btncancelar = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059657;
 //BA.debugLineNum = 124059657;BA.debugLine="Private btnOK As Button";
_btnok = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059658;
 //BA.debugLineNum = 124059658;BA.debugLine="Private clvCamposRegistro As CustomListView";
_clvcamposregistro = new b4j.example.customlistview();
RDebugUtils.currentLine=124059659;
 //BA.debugLineNum = 124059659;BA.debugLine="Private lblModoRegistro As Label";
_lblmodoregistro = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=124059660;
 //BA.debugLineNum = 124059660;BA.debugLine="Private lblModoRegistroFAweEditar As Label";
_lblmodoregistrofaweeditar = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=124059661;
 //BA.debugLineNum = 124059661;BA.debugLine="Private lblModoRegistroFAweNuevo As Label";
_lblmodoregistrofawenuevo = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=124059662;
 //BA.debugLineNum = 124059662;BA.debugLine="Private lblModoRegistroFAweVer As Label";
_lblmodoregistrofawever = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=124059663;
 //BA.debugLineNum = 124059663;BA.debugLine="Private lblTitleModoRegistro As Label";
_lbltitlemodoregistro = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=124059665;
 //BA.debugLineNum = 124059665;BA.debugLine="Type TipoOrigenDatosJamFormRegistro (IpJRDC As St";
;
RDebugUtils.currentLine=124059666;
 //BA.debugLineNum = 124059666;BA.debugLine="Private DatosOrigenDatosFormRegistro As TipoOrige";
_datosorigendatosformregistro = new b4j.docU.jamformregistro._tipoorigendatosjamformregistro();
RDebugUtils.currentLine=124059681;
 //BA.debugLineNum = 124059681;BA.debugLine="Type InfoCampoJamFormRegistro(CampoSQL As String,";
;
RDebugUtils.currentLine=124059688;
 //BA.debugLineNum = 124059688;BA.debugLine="Private lstItemsCLV As List";
_lstitemsclv = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=124059691;
 //BA.debugLineNum = 124059691;BA.debugLine="Private CargandoDatos As Boolean";
_cargandodatos = false;
RDebugUtils.currentLine=124059693;
 //BA.debugLineNum = 124059693;BA.debugLine="Private ErrorCargaDatos As Boolean";
_errorcargadatos = false;
RDebugUtils.currentLine=124059694;
 //BA.debugLineNum = 124059694;BA.debugLine="Private msgErrorCargaDatos As String";
_msgerrorcargadatos = "";
RDebugUtils.currentLine=124059697;
 //BA.debugLineNum = 124059697;BA.debugLine="Private ColItemsImpares, ColItemsPares As Int";
_colitemsimpares = 0;
_colitemspares = 0;
RDebugUtils.currentLine=124059699;
 //BA.debugLineNum = 124059699;BA.debugLine="Private TipoControl_TextField, TipoControl_B4XInp";
_tipocontrol_textfield = "";
_tipocontrol_b4xinputdialogtextfield = "";
_tipocontrol_b4xlistdialogtextfield = "";
_tipocontrol_b4xsearchlistdialogtextfield = "";
_tipocontrol_combobox = "";
_tipocontrol_lmb4xcombobox = "";
_tipocontrol_checkbox = "";
_tipocontrol_textfieldbuttonselfecha = "";
_tipocontrol_textfieldbuttonselfile = "";
_tipocontrol_textfieldbuttonselext = "";
RDebugUtils.currentLine=124059701;
 //BA.debugLineNum = 124059701;BA.debugLine="TipoControl_TextField = \"TextField\"";
__ref._tipocontrol_textfield /*String*/  = "TextField";
RDebugUtils.currentLine=124059702;
 //BA.debugLineNum = 124059702;BA.debugLine="TipoControl_ComboBox = \"ComboBox\"";
__ref._tipocontrol_combobox /*String*/  = "ComboBox";
RDebugUtils.currentLine=124059703;
 //BA.debugLineNum = 124059703;BA.debugLine="TipoControl_lmB4XComboBox = \"lmB4XComboBox\"";
__ref._tipocontrol_lmb4xcombobox /*String*/  = "lmB4XComboBox";
RDebugUtils.currentLine=124059704;
 //BA.debugLineNum = 124059704;BA.debugLine="TipoControl_CheckBox = \"CheckBox\"";
__ref._tipocontrol_checkbox /*String*/  = "CheckBox";
RDebugUtils.currentLine=124059705;
 //BA.debugLineNum = 124059705;BA.debugLine="TipoControl_TextFieldButtonSelFecha = \"TextFieldB";
__ref._tipocontrol_textfieldbuttonselfecha /*String*/  = "TextFieldBtnSelFecha";
RDebugUtils.currentLine=124059706;
 //BA.debugLineNum = 124059706;BA.debugLine="TipoControl_TextFieldButtonSelFile = \"TextFieldBt";
__ref._tipocontrol_textfieldbuttonselfile /*String*/  = "TextFieldBtnSelFile";
RDebugUtils.currentLine=124059707;
 //BA.debugLineNum = 124059707;BA.debugLine="TipoControl_TextFieldButtonSelExt = \"TextFieldBtn";
__ref._tipocontrol_textfieldbuttonselext /*String*/  = "TextFieldBtnSelExt";
RDebugUtils.currentLine=124059708;
 //BA.debugLineNum = 124059708;BA.debugLine="TipoControl_B4XInputDialogTextField=\"B4XInputDial";
__ref._tipocontrol_b4xinputdialogtextfield /*String*/  = "B4XInputDialogTextField";
RDebugUtils.currentLine=124059709;
 //BA.debugLineNum = 124059709;BA.debugLine="TipoControl_B4XListDialogTextField=\"B4XListDialog";
__ref._tipocontrol_b4xlistdialogtextfield /*String*/  = "B4XListDialogTextField";
RDebugUtils.currentLine=124059710;
 //BA.debugLineNum = 124059710;BA.debugLine="TipoControl_B4XSearchListDialogTextField=\"B4XSear";
__ref._tipocontrol_b4xsearchlistdialogtextfield /*String*/  = "B4XSearchListDialogTextField";
RDebugUtils.currentLine=124059712;
 //BA.debugLineNum = 124059712;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=124059713;
 //BA.debugLineNum = 124059713;BA.debugLine="Private DateTemplate As B4XDateTemplate";
_datetemplate = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=124059714;
 //BA.debugLineNum = 124059714;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=124059716;
 //BA.debugLineNum = 124059716;BA.debugLine="Private DragCoords As Map";
_dragcoords = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=124059718;
 //BA.debugLineNum = 124059718;BA.debugLine="Private mNombreFicheroJSON As String";
_mnombreficherojson = "";
RDebugUtils.currentLine=124059719;
 //BA.debugLineNum = 124059719;BA.debugLine="Private mDatosInputRegistro As Map";
_mdatosinputregistro = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=124059721;
 //BA.debugLineNum = 124059721;BA.debugLine="Private mlstInfoCamposSQL As List";
_mlstinfocampossql = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=124059722;
 //BA.debugLineNum = 124059722;BA.debugLine="Private mlstInfoCampos As List";
_mlstinfocampos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=124059725;
 //BA.debugLineNum = 124059725;BA.debugLine="Private pnlFondoFormRegistro As Pane";
_pnlfondoformregistro = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=124059727;
 //BA.debugLineNum = 124059727;BA.debugLine="Private lblTitleItemCampo As Label";
_lbltitleitemcampo = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=124059728;
 //BA.debugLineNum = 124059728;BA.debugLine="Private btnSelFicheroItemCampo As Button";
_btnselficheroitemcampo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059729;
 //BA.debugLineNum = 124059729;BA.debugLine="Private txtSelFicheroItemCampo As TextField";
_txtselficheroitemcampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=124059730;
 //BA.debugLineNum = 124059730;BA.debugLine="Private chkBoxItemCampo As CheckBox";
_chkboxitemcampo = new anywheresoftware.b4j.objects.CheckboxWrapper();
RDebugUtils.currentLine=124059731;
 //BA.debugLineNum = 124059731;BA.debugLine="Private btnSelFechaItemCampo As Button";
_btnselfechaitemcampo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059732;
 //BA.debugLineNum = 124059732;BA.debugLine="Private txtSelFechaItemCampo As TextField";
_txtselfechaitemcampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=124059734;
 //BA.debugLineNum = 124059734;BA.debugLine="Private cboItemCampo As ComboBox";
_cboitemcampo = new anywheresoftware.b4j.objects.ComboBoxWrapper();
RDebugUtils.currentLine=124059735;
 //BA.debugLineNum = 124059735;BA.debugLine="Private txtItemCampo As TextField";
_txtitemcampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=124059736;
 //BA.debugLineNum = 124059736;BA.debugLine="Private lblItemCampoObligatorio As Label";
_lblitemcampoobligatorio = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=124059737;
 //BA.debugLineNum = 124059737;BA.debugLine="Private btnSelValorExtItemCampo As Button";
_btnselvalorextitemcampo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059738;
 //BA.debugLineNum = 124059738;BA.debugLine="Private txtSelValorExtItemCampo As TextField";
_txtselvalorextitemcampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=124059739;
 //BA.debugLineNum = 124059739;BA.debugLine="Private btnB4XInputDialogItemCampo As Button";
_btnb4xinputdialogitemcampo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059740;
 //BA.debugLineNum = 124059740;BA.debugLine="Private txtB4XInputDialogItemCampo As TextField";
_txtb4xinputdialogitemcampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=124059741;
 //BA.debugLineNum = 124059741;BA.debugLine="Private btnB4XListTemplateItemCampo As Button";
_btnb4xlisttemplateitemcampo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059742;
 //BA.debugLineNum = 124059742;BA.debugLine="Private txtB4XListTemplateItemCampo As TextField";
_txtb4xlisttemplateitemcampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=124059744;
 //BA.debugLineNum = 124059744;BA.debugLine="Private btnConfigurarJSON As Button";
_btnconfigurarjson = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059745;
 //BA.debugLineNum = 124059745;BA.debugLine="Private btnB4XSearchListTemplateItemCampo As Butt";
_btnb4xsearchlisttemplateitemcampo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=124059746;
 //BA.debugLineNum = 124059746;BA.debugLine="Private txtB4XSearchListTemplateItemCampo As Text";
_txtb4xsearchlisttemplateitemcampo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=124059748;
 //BA.debugLineNum = 124059748;BA.debugLine="Private btnB4XInputDialogSelFicheroItemCampo As B";
_btnb4xinputdialogselficheroitemcampo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=124059750;
 //BA.debugLineNum = 124059750;BA.debugLine="Private lblInfoCampoTooltip As B4XView";
_lblinfocampotooltip = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=124059752;
 //BA.debugLineNum = 124059752;BA.debugLine="Private lstInfoCamposToolTip As List";
_lstinfocampostooltip = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=124059753;
 //BA.debugLineNum = 124059753;BA.debugLine="End Sub";
return "";
}
public long  _clng(b4j.docU.jamformregistro __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "clng", true))
	 {return ((Long) Debug.delegate(ba, "clng", new Object[] {_o}));}
String _ox = "";
RDebugUtils.currentLine=127795200;
 //BA.debugLineNum = 127795200;BA.debugLine="private Sub CLng(o As Object) As Long";
RDebugUtils.currentLine=127795201;
 //BA.debugLineNum = 127795201;BA.debugLine="Try";
try {RDebugUtils.currentLine=127795202;
 //BA.debugLineNum = 127795202;BA.debugLine="Dim ox As String = o";
_ox = BA.ObjectToString(_o);
RDebugUtils.currentLine=127795203;
 //BA.debugLineNum = 127795203;BA.debugLine="ox = GetNumbers(ox)";
_ox = __ref._getnumbers /*String*/ (null,_ox);
RDebugUtils.currentLine=127795204;
 //BA.debugLineNum = 127795204;BA.debugLine="If ox = \"\" Then ox = \"0\"";
if ((_ox).equals("")) { 
_ox = "0";};
RDebugUtils.currentLine=127795205;
 //BA.debugLineNum = 127795205;BA.debugLine="Return Floor(ox)";
if (true) return (long) (__c.Floor((double)(Double.parseDouble(_ox))));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=127795207;
 //BA.debugLineNum = 127795207;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=127795209;
 //BA.debugLineNum = 127795209;BA.debugLine="End Sub";
return 0L;
}
public int  _fixnullint(b4j.docU.jamformregistro __ref,Object _sobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "fixnullint", true))
	 {return ((Integer) Debug.delegate(ba, "fixnullint", new Object[] {_sobj}));}
int _dvalue = 0;
RDebugUtils.currentLine=127664128;
 //BA.debugLineNum = 127664128;BA.debugLine="private Sub FixNullInt(sObj As Object) As Int";
RDebugUtils.currentLine=127664129;
 //BA.debugLineNum = 127664129;BA.debugLine="Dim dValue As Int";
_dvalue = 0;
RDebugUtils.currentLine=127664130;
 //BA.debugLineNum = 127664130;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=127664131;
 //BA.debugLineNum = 127664131;BA.debugLine="dValue = 0";
_dvalue = (int) (0);
 }else {
RDebugUtils.currentLine=127664133;
 //BA.debugLineNum = 127664133;BA.debugLine="dValue = CInt(sObj)";
_dvalue = __ref._cint /*int*/ (null,_sobj);
 };
RDebugUtils.currentLine=127664135;
 //BA.debugLineNum = 127664135;BA.debugLine="Return dValue";
if (true) return _dvalue;
RDebugUtils.currentLine=127664136;
 //BA.debugLineNum = 127664136;BA.debugLine="End Sub";
return 0;
}
public b4j.docU.jamformregistro._tipoorigendatosjamformregistro  _createtipoorigendatos(b4j.docU.jamformregistro __ref,String _ipjrdc,String _puertojrdc,String _nombretabla,String _dbms) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "createtipoorigendatos", true))
	 {return ((b4j.docU.jamformregistro._tipoorigendatosjamformregistro) Debug.delegate(ba, "createtipoorigendatos", new Object[] {_ipjrdc,_puertojrdc,_nombretabla,_dbms}));}
b4j.docU.jamformregistro._tipoorigendatosjamformregistro _t1 = null;
RDebugUtils.currentLine=125370368;
 //BA.debugLineNum = 125370368;BA.debugLine="Public Sub CreateTipoOrigenDatos (IpJRDC As String";
RDebugUtils.currentLine=125370369;
 //BA.debugLineNum = 125370369;BA.debugLine="Dim t1 As TipoOrigenDatosJamFormRegistro";
_t1 = new b4j.docU.jamformregistro._tipoorigendatosjamformregistro();
RDebugUtils.currentLine=125370370;
 //BA.debugLineNum = 125370370;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=125370372;
 //BA.debugLineNum = 125370372;BA.debugLine="t1.IpJRDC = IpJRDC";
_t1.IpJRDC /*String*/  = _ipjrdc;
RDebugUtils.currentLine=125370373;
 //BA.debugLineNum = 125370373;BA.debugLine="t1.PuertoJRDC = PuertoJRDC";
_t1.PuertoJRDC /*String*/  = _puertojrdc;
RDebugUtils.currentLine=125370374;
 //BA.debugLineNum = 125370374;BA.debugLine="t1.NombreTabla = NombreTabla";
_t1.NombreTabla /*String*/  = _nombretabla;
RDebugUtils.currentLine=125370375;
 //BA.debugLineNum = 125370375;BA.debugLine="t1.DBMS = DBMS";
_t1.DBMS /*String*/  = _dbms;
RDebugUtils.currentLine=125370377;
 //BA.debugLineNum = 125370377;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=125370378;
 //BA.debugLineNum = 125370378;BA.debugLine="End Sub";
return null;
}
public String  _cstr(b4j.docU.jamformregistro __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=127729664;
 //BA.debugLineNum = 127729664;BA.debugLine="private Sub CStr(o As Object) As String";
RDebugUtils.currentLine=127729665;
 //BA.debugLineNum = 127729665;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=127729666;
 //BA.debugLineNum = 127729666;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _dimensionespantalla(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "dimensionespantalla", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "dimensionespantalla", null));}
anywheresoftware.b4a.objects.collections.Map _mdim = null;
RDebugUtils.currentLine=124583936;
 //BA.debugLineNum = 124583936;BA.debugLine="Sub DimensionesPantalla As Map";
RDebugUtils.currentLine=124583937;
 //BA.debugLineNum = 124583937;BA.debugLine="Dim mDim As Map";
_mdim = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=124583938;
 //BA.debugLineNum = 124583938;BA.debugLine="mDim.Initialize";
_mdim.Initialize();
RDebugUtils.currentLine=124583939;
 //BA.debugLineNum = 124583939;BA.debugLine="mDim.Put(\"X\",fx.PrimaryScreen.MaxX - fx.PrimarySc";
_mdim.Put((Object)("X"),(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxX()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinX()));
RDebugUtils.currentLine=124583940;
 //BA.debugLineNum = 124583940;BA.debugLine="mDim.Put(\"Y\",fx.PrimaryScreen.MaxY - fx.PrimarySc";
_mdim.Put((Object)("Y"),(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY()));
RDebugUtils.currentLine=124583941;
 //BA.debugLineNum = 124583941;BA.debugLine="Return mDim";
if (true) return _mdim;
RDebugUtils.currentLine=124583942;
 //BA.debugLineNum = 124583942;BA.debugLine="End Sub";
return null;
}
public String  _fixnull(b4j.docU.jamformregistro __ref,Object _sobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "fixnull", true))
	 {return ((String) Debug.delegate(ba, "fixnull", new Object[] {_sobj}));}
String _svalue = "";
RDebugUtils.currentLine=127467520;
 //BA.debugLineNum = 127467520;BA.debugLine="private Sub FixNull(sObj As Object) As String";
RDebugUtils.currentLine=127467521;
 //BA.debugLineNum = 127467521;BA.debugLine="Dim sValue As String";
_svalue = "";
RDebugUtils.currentLine=127467522;
 //BA.debugLineNum = 127467522;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=127467523;
 //BA.debugLineNum = 127467523;BA.debugLine="sValue = \"\"";
_svalue = "";
 }else {
RDebugUtils.currentLine=127467525;
 //BA.debugLineNum = 127467525;BA.debugLine="sValue = CStr(sObj)";
_svalue = __ref._cstr /*String*/ (null,_sobj);
 };
RDebugUtils.currentLine=127467527;
 //BA.debugLineNum = 127467527;BA.debugLine="sValue = sValue.Replace(\"NULL\",\"\").Replace(\"null\"";
_svalue = _svalue.replace("NULL","").replace("null","");
RDebugUtils.currentLine=127467528;
 //BA.debugLineNum = 127467528;BA.debugLine="Return sValue";
if (true) return _svalue;
RDebugUtils.currentLine=127467529;
 //BA.debugLineNum = 127467529;BA.debugLine="End Sub";
return "";
}
public double  _fixnulldouble(b4j.docU.jamformregistro __ref,Object _sobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "fixnulldouble", true))
	 {return ((Double) Debug.delegate(ba, "fixnulldouble", new Object[] {_sobj}));}
double _dvalue = 0;
RDebugUtils.currentLine=127533056;
 //BA.debugLineNum = 127533056;BA.debugLine="private Sub FixNullDouble(sObj As Object) As Doubl";
RDebugUtils.currentLine=127533057;
 //BA.debugLineNum = 127533057;BA.debugLine="Dim dValue As Double";
_dvalue = 0;
RDebugUtils.currentLine=127533058;
 //BA.debugLineNum = 127533058;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=127533059;
 //BA.debugLineNum = 127533059;BA.debugLine="dValue = 0";
_dvalue = 0;
 }else {
RDebugUtils.currentLine=127533061;
 //BA.debugLineNum = 127533061;BA.debugLine="dValue = CDbl(sObj)";
_dvalue = __ref._cdbl /*double*/ (null,_sobj);
 };
RDebugUtils.currentLine=127533063;
 //BA.debugLineNum = 127533063;BA.debugLine="Return dValue";
if (true) return _dvalue;
RDebugUtils.currentLine=127533064;
 //BA.debugLineNum = 127533064;BA.debugLine="End Sub";
return 0;
}
public double  _fixnulllong(b4j.docU.jamformregistro __ref,Object _sobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "fixnulllong", true))
	 {return ((Double) Debug.delegate(ba, "fixnulllong", new Object[] {_sobj}));}
long _dvalue = 0L;
RDebugUtils.currentLine=127598592;
 //BA.debugLineNum = 127598592;BA.debugLine="private Sub FixNullLong(sObj As Object) As Double";
RDebugUtils.currentLine=127598593;
 //BA.debugLineNum = 127598593;BA.debugLine="Dim dValue As Long";
_dvalue = 0L;
RDebugUtils.currentLine=127598594;
 //BA.debugLineNum = 127598594;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=127598595;
 //BA.debugLineNum = 127598595;BA.debugLine="dValue = 0";
_dvalue = (long) (0);
 }else {
RDebugUtils.currentLine=127598597;
 //BA.debugLineNum = 127598597;BA.debugLine="dValue = CLng(sObj)";
_dvalue = __ref._clng /*long*/ (null,_sobj);
 };
RDebugUtils.currentLine=127598599;
 //BA.debugLineNum = 127598599;BA.debugLine="Return dValue";
if (true) return _dvalue;
RDebugUtils.currentLine=127598600;
 //BA.debugLineNum = 127598600;BA.debugLine="End Sub";
return 0;
}
public String  _frmreg_closerequest(b4j.docU.jamformregistro __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "frmreg_closerequest", true))
	 {return ((String) Debug.delegate(ba, "frmreg_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=124780544;
 //BA.debugLineNum = 124780544;BA.debugLine="Private Sub frmReg_CloseRequest (EventData As Even";
RDebugUtils.currentLine=124780545;
 //BA.debugLineNum = 124780545;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=124780546;
 //BA.debugLineNum = 124780546;BA.debugLine="End Sub";
return "";
}
public String  _frmreg_mousedragged(b4j.docU.jamformregistro __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "frmreg_mousedragged", true))
	 {return ((String) Debug.delegate(ba, "frmreg_mousedragged", new Object[] {_eventdata}));}
anywheresoftware.b4j.object.JavaObject _joeventdata = null;
double _mousex = 0;
double _mousey = 0;
RDebugUtils.currentLine=125960192;
 //BA.debugLineNum = 125960192;BA.debugLine="Sub frmReg_MouseDragged (EventData As MouseEvent)";
RDebugUtils.currentLine=125960193;
 //BA.debugLineNum = 125960193;BA.debugLine="Dim joEventData As JavaObject = EventData";
_joeventdata = new anywheresoftware.b4j.object.JavaObject();
_joeventdata = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_eventdata.getObject()));
RDebugUtils.currentLine=125960194;
 //BA.debugLineNum = 125960194;BA.debugLine="Dim mouseX As Double = joEventData.RunMethod(\"get";
_mousex = (double)(BA.ObjectToNumber(_joeventdata.RunMethod("getScreenX",(Object[])(__c.Null))));
RDebugUtils.currentLine=125960195;
 //BA.debugLineNum = 125960195;BA.debugLine="Dim mouseY As Double = joEventData.RunMethod(\"get";
_mousey = (double)(BA.ObjectToNumber(_joeventdata.RunMethod("getScreenY",(Object[])(__c.Null))));
RDebugUtils.currentLine=125960197;
 //BA.debugLineNum = 125960197;BA.debugLine="frmReg.WindowLeft = mouseX - DragCoords.Get(\"x\")";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .setWindowLeft(_mousex-(double)(BA.ObjectToNumber(__ref._dragcoords /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("x")))));
RDebugUtils.currentLine=125960198;
 //BA.debugLineNum = 125960198;BA.debugLine="frmReg.WindowTop = mouseY - DragCoords.Get(\"y\")";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .setWindowTop(_mousey-(double)(BA.ObjectToNumber(__ref._dragcoords /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("y")))));
RDebugUtils.currentLine=125960199;
 //BA.debugLineNum = 125960199;BA.debugLine="End Sub";
return "";
}
public String  _frmreg_mousepressed(b4j.docU.jamformregistro __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "frmreg_mousepressed", true))
	 {return ((String) Debug.delegate(ba, "frmreg_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=125894656;
 //BA.debugLineNum = 125894656;BA.debugLine="Sub frmReg_MousePressed (EventData As MouseEvent)";
RDebugUtils.currentLine=125894657;
 //BA.debugLineNum = 125894657;BA.debugLine="DragCoords = CreateMap(\"x\":EventData.X, \"y\":Event";
__ref._dragcoords /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("x"),(Object)(_eventdata.getX()),(Object)("y"),(Object)(_eventdata.getY())});
RDebugUtils.currentLine=125894658;
 //BA.debugLineNum = 125894658;BA.debugLine="End Sub";
return "";
}
public String  _frmreg_resize(b4j.docU.jamformregistro __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "frmreg_resize", true))
	 {return ((String) Debug.delegate(ba, "frmreg_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=124846080;
 //BA.debugLineNum = 124846080;BA.debugLine="private Sub frmReg_Resize (Width As Double, Height";
RDebugUtils.currentLine=124846081;
 //BA.debugLineNum = 124846081;BA.debugLine="SetCLVScrollBars(clvCamposRegistro, clvCamposRegi";
__ref._setclvscrollbars /*String*/ (null,__ref._clvcamposregistro /*b4j.example.customlistview*/ ,__ref._clvcamposregistro /*b4j.example.customlistview*/ ._sv.getScrollViewContentHeight()>__ref._clvcamposregistro /*b4j.example.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=124846082;
 //BA.debugLineNum = 124846082;BA.debugLine="End Sub";
return "";
}
public String  _setclvscrollbars(b4j.docU.jamformregistro __ref,b4j.example.customlistview _clv,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "setclvscrollbars", true))
	 {return ((String) Debug.delegate(ba, "setclvscrollbars", new Object[] {_clv,_visible}));}
anywheresoftware.b4j.objects.ScrollPaneWrapper _nsv = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=124911616;
 //BA.debugLineNum = 124911616;BA.debugLine="Sub SetCLVScrollBars(clv As CustomListView, Visibl";
RDebugUtils.currentLine=124911617;
 //BA.debugLineNum = 124911617;BA.debugLine="Dim nsv As ScrollPane = clv.sv";
_nsv = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_nsv = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(_clv._sv.getObject()));
RDebugUtils.currentLine=124911618;
 //BA.debugLineNum = 124911618;BA.debugLine="If Visible Then";
if (_visible) { 
RDebugUtils.currentLine=124911619;
 //BA.debugLineNum = 124911619;BA.debugLine="nsv.SetVScrollVisibility(\"ALWAYS\")";
_nsv.SetVScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"ALWAYS"));
 }else {
RDebugUtils.currentLine=124911621;
 //BA.debugLineNum = 124911621;BA.debugLine="nsv.SetVScrollVisibility(\"NEVER\")";
_nsv.SetVScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"NEVER"));
 };
RDebugUtils.currentLine=124911623;
 //BA.debugLineNum = 124911623;BA.debugLine="Dim jo As JavaObject = clv 'ignore";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_clv));
RDebugUtils.currentLine=124911624;
 //BA.debugLineNum = 124911624;BA.debugLine="jo.SetField(\"_scrollbarsvisible\", Visible)";
_jo.SetField("_scrollbarsvisible",(Object)(_visible));
RDebugUtils.currentLine=124911625;
 //BA.debugLineNum = 124911625;BA.debugLine="clv.Base_Resize(clv.AsView.Width, clv.AsView.Heig";
_clv._base_resize(_clv._asview().getWidth(),_clv._asview().getHeight());
RDebugUtils.currentLine=124911626;
 //BA.debugLineNum = 124911626;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.Form  _getformregistro(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "getformregistro", true))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getformregistro", null));}
RDebugUtils.currentLine=124518400;
 //BA.debugLineNum = 124518400;BA.debugLine="Sub getFormRegistro As Form";
RDebugUtils.currentLine=124518401;
 //BA.debugLineNum = 124518401;BA.debugLine="Return frmReg";
if (true) return __ref._frmreg /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=124518402;
 //BA.debugLineNum = 124518402;BA.debugLine="End Sub";
return null;
}
public String  _getmodoregistro(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "getmodoregistro", true))
	 {return ((String) Debug.delegate(ba, "getmodoregistro", null));}
RDebugUtils.currentLine=124387328;
 //BA.debugLineNum = 124387328;BA.debugLine="Sub getModoRegistro As String";
RDebugUtils.currentLine=124387329;
 //BA.debugLineNum = 124387329;BA.debugLine="Return mModoRegistro";
if (true) return __ref._mmodoregistro /*String*/ ;
RDebugUtils.currentLine=124387330;
 //BA.debugLineNum = 124387330;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper  _getpanelfondoformregistro(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "getpanelfondoformregistro", true))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper) Debug.delegate(ba, "getpanelfondoformregistro", null));}
RDebugUtils.currentLine=124452864;
 //BA.debugLineNum = 124452864;BA.debugLine="Sub getPanelFondoFormRegistro As AnchorPane";
RDebugUtils.currentLine=124452865;
 //BA.debugLineNum = 124452865;BA.debugLine="Return frmReg.RootPane";
if (true) return __ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getRootPane();
RDebugUtils.currentLine=124452866;
 //BA.debugLineNum = 124452866;BA.debugLine="End Sub";
return null;
}
public String  _habilitarbotongrabar(b4j.docU.jamformregistro __ref,boolean _habilitado) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "habilitarbotongrabar", true))
	 {return ((String) Debug.delegate(ba, "habilitarbotongrabar", new Object[] {_habilitado}));}
RDebugUtils.currentLine=124977152;
 //BA.debugLineNum = 124977152;BA.debugLine="public Sub HabilitarBotonGrabar(Habilitado As Bool";
RDebugUtils.currentLine=124977153;
 //BA.debugLineNum = 124977153;BA.debugLine="btnOK.Enabled=Habilitado";
__ref._btnok /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setEnabled(_habilitado);
RDebugUtils.currentLine=124977154;
 //BA.debugLineNum = 124977154;BA.debugLine="If Habilitado Then";
if (_habilitado) { 
RDebugUtils.currentLine=124977155;
 //BA.debugLineNum = 124977155;BA.debugLine="btnOK.TextColor=fx.Colors.From32Bit(0xFF000000)";
__ref._btnok /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xff000000))));
 }else {
RDebugUtils.currentLine=124977157;
 //BA.debugLineNum = 124977157;BA.debugLine="btnOK.TextColor=fx.Colors.From32Bit(0xFFD3D3D3)";
__ref._btnok /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setTextColor((javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xffd3d3d3))));
 };
RDebugUtils.currentLine=124977159;
 //BA.debugLineNum = 124977159;BA.debugLine="End Sub";
return "";
}
public String  _inicializarcalendario(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "inicializarcalendario", true))
	 {return ((String) Debug.delegate(ba, "inicializarcalendario", null));}
RDebugUtils.currentLine=125173760;
 //BA.debugLineNum = 125173760;BA.debugLine="private Sub InicializarCalendario";
RDebugUtils.currentLine=125173761;
 //BA.debugLineNum = 125173761;BA.debugLine="DateTemplate.Initialize";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=125173762;
 //BA.debugLineNum = 125173762;BA.debugLine="DateTemplate.MinYear = 2000";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._minyear /*int*/  = (int) (2000);
RDebugUtils.currentLine=125173763;
 //BA.debugLineNum = 125173763;BA.debugLine="DateTemplate.MaxYear = 2050";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._maxyear /*int*/  = (int) (2050);
RDebugUtils.currentLine=125173764;
 //BA.debugLineNum = 125173764;BA.debugLine="DateTemplate.FirstDay=1";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=125173765;
 //BA.debugLineNum = 125173765;BA.debugLine="DateTemplate.Date=DateTime.Now";
__ref._datetemplate /*b4j.docU.b4xdatetemplate*/ ._setdate /*long*/ (null,__c.DateTime.getNow());
RDebugUtils.currentLine=125173766;
 //BA.debugLineNum = 125173766;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _inicio(b4j.docU.jamformregistro __ref) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "inicio", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "inicio", null));}
ResumableSub_Inicio rsub = new ResumableSub_Inicio(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Inicio extends BA.ResumableSub {
public ResumableSub_Inicio(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=124321793;
 //BA.debugLineNum = 124321793;BA.debugLine="ErrorCargaDatos=False";
__ref._errorcargadatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=124321794;
 //BA.debugLineNum = 124321794;BA.debugLine="msgErrorCargaDatos=\"\"";
__ref._msgerrorcargadatos /*String*/  = "";
RDebugUtils.currentLine=124321795;
 //BA.debugLineNum = 124321795;BA.debugLine="SetModoRegistro(mModoRegistro)";
__ref._setmodoregistro /*String*/ (null,__ref._mmodoregistro /*String*/ );
RDebugUtils.currentLine=124321796;
 //BA.debugLineNum = 124321796;BA.debugLine="CargandoDatos=True";
__ref._cargandodatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=124321797;
 //BA.debugLineNum = 124321797;BA.debugLine="Dim rSub As ResumableSub=SetJSONCampos(mNombreFic";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._setjsoncampos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mnombreficherojson /*String*/ );
RDebugUtils.currentLine=124321798;
 //BA.debugLineNum = 124321798;BA.debugLine="wait for (rSub) complete (mResult As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "inicio"), _rsub);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=124321800;
 //BA.debugLineNum = 124321800;BA.debugLine="If mResult.get(\"FlagOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_mresult.Get((Object)("FlagOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=124321801;
 //BA.debugLineNum = 124321801;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=124321802;
 //BA.debugLineNum = 124321802;BA.debugLine="ErrorCargaDatos=True";
__ref._errorcargadatos /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=124321803;
 //BA.debugLineNum = 124321803;BA.debugLine="msgErrorCargaDatos=mResult.Get(\"msgError\")";
__ref._msgerrorcargadatos /*String*/  = BA.ObjectToString(_mresult.Get((Object)("msgError")));
RDebugUtils.currentLine=124321804;
 //BA.debugLineNum = 124321804;BA.debugLine="Log (\"ErrorCargaDatos \" & ErrorCargaDatos & msgE";
parent.__c.LogImpl("9124321804","ErrorCargaDatos "+BA.ObjectToString(__ref._errorcargadatos /*boolean*/ )+__ref._msgerrorcargadatos /*String*/ ,0);
RDebugUtils.currentLine=124321805;
 //BA.debugLineNum = 124321805;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(msgErrorCargaD";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,__ref._msgerrorcargadatos /*String*/ ,"Error");
RDebugUtils.currentLine=124321806;
 //BA.debugLineNum = 124321806;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "inicio"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=124321807;
 //BA.debugLineNum = 124321807;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=124321810;
 //BA.debugLineNum = 124321810;BA.debugLine="CargaCamposCLV";
__ref._cargacamposclv /*void*/ (null);
RDebugUtils.currentLine=124321811;
 //BA.debugLineNum = 124321811;BA.debugLine="Wait For CargaCamposCLV_Completed";
parent.__c.WaitFor("cargacamposclv_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "inicio"), null);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=124321813;
 //BA.debugLineNum = 124321813;BA.debugLine="Dialog.Initialize(frmReg.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=124321818;
 //BA.debugLineNum = 124321818;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=124321820;
 //BA.debugLineNum = 124321820;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setmodoregistro(b4j.docU.jamformregistro __ref,String _modo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "setmodoregistro", true))
	 {return ((String) Debug.delegate(ba, "setmodoregistro", new Object[] {_modo}));}
RDebugUtils.currentLine=125239296;
 //BA.debugLineNum = 125239296;BA.debugLine="private Sub SetModoRegistro(Modo As String)";
RDebugUtils.currentLine=125239297;
 //BA.debugLineNum = 125239297;BA.debugLine="mModoRegistro=Modo";
__ref._mmodoregistro /*String*/  = _modo;
RDebugUtils.currentLine=125239298;
 //BA.debugLineNum = 125239298;BA.debugLine="lblModoRegistro.Text=mModoRegistro";
__ref._lblmodoregistro /*anywheresoftware.b4j.objects.LabelWrapper*/ .setText(__ref._mmodoregistro /*String*/ );
RDebugUtils.currentLine=125239299;
 //BA.debugLineNum = 125239299;BA.debugLine="lblModoRegistroFAweEditar.Visible=mModoRegistro=\"";
__ref._lblmodoregistrofaweeditar /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((__ref._mmodoregistro /*String*/ ).equals("Editar"));
RDebugUtils.currentLine=125239300;
 //BA.debugLineNum = 125239300;BA.debugLine="lblModoRegistroFAweNuevo.Visible=mModoRegistro=\"N";
__ref._lblmodoregistrofawenuevo /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((__ref._mmodoregistro /*String*/ ).equals("Nuevo"));
RDebugUtils.currentLine=125239301;
 //BA.debugLineNum = 125239301;BA.debugLine="lblModoRegistroFAweVer.Visible=mModoRegistro=\"Ver";
__ref._lblmodoregistrofawever /*anywheresoftware.b4j.objects.LabelWrapper*/ .setVisible((__ref._mmodoregistro /*String*/ ).equals("Ver"));
RDebugUtils.currentLine=125239302;
 //BA.debugLineNum = 125239302;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setjsoncampos(b4j.docU.jamformregistro __ref,String _nombreficherojson) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "setjsoncampos", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "setjsoncampos", new Object[] {_nombreficherojson}));}
ResumableSub_SetJSONCampos rsub = new ResumableSub_SetJSONCampos(this,__ref,_nombreficherojson);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetJSONCampos extends BA.ResumableSub {
public ResumableSub_SetJSONCampos(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,String _nombreficherojson) {
this.parent = parent;
this.__ref = __ref;
this._nombreficherojson = _nombreficherojson;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
String _nombreficherojson;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
String _ficherojson = "";
anywheresoftware.b4j.objects.collections.JSONParser _p = null;
anywheresoftware.b4a.objects.collections.Map _mjson = null;
String _accion = "";
int _colitemsimparesjson = 0;
int _colitemsparesjson = 0;
anywheresoftware.b4a.objects.collections.List _lstitemsfromstring = null;
anywheresoftware.b4a.objects.collections.List _lstnombrescamposjson = null;
anywheresoftware.b4a.objects.collections.List _lstcontrolesindependientes = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _modificacionendatosjson = null;
int _idxorden = 0;
anywheresoftware.b4a.objects.collections.List _lstidxeliminar = null;
String _campojson = "";
boolean _flagcampojsonok = false;
b4j.docU.jamformregistro._infocampojamformregistro _infocampojfr = null;
anywheresoftware.b4a.objects.collections.Map _mextras = null;
int _idxjsonnok = 0;
int _idxdel = 0;
int _numcamposenformulario = 0;
boolean _flagtodoscamposmysqlok = false;
String _tipodatomysqljson = "";
boolean _nonulojson = false;
boolean _primarykeyjson = false;
boolean _autoincrementaljson = false;
String _valorcampopordefectojson = "";
anywheresoftware.b4a.objects.collections.List _lstvaloresdatosaux = null;
anywheresoftware.b4a.objects.collections.List _lstparams = null;
String _k = "";
boolean _campoobligatoriocumplimentar = false;
anywheresoftware.b4a.objects.collections.Map _mdimscreen = null;
double _frmh = 0;
anywheresoftware.b4a.BA.IterableList group41;
int index41;
int groupLen41;
anywheresoftware.b4a.BA.IterableList group65;
int index65;
int groupLen65;
anywheresoftware.b4a.BA.IterableList group83;
int index83;
int groupLen83;
anywheresoftware.b4a.BA.IterableList group88;
int index88;
int groupLen88;
anywheresoftware.b4a.BA.IterableList group94;
int index94;
int groupLen94;
anywheresoftware.b4a.BA.IterableList group160;
int index160;
int groupLen160;
anywheresoftware.b4a.BA.IterableList group176;
int index176;
int groupLen176;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=125304833;
 //BA.debugLineNum = 125304833;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=125304834;
 //BA.debugLineNum = 125304834;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=125304835;
 //BA.debugLineNum = 125304835;BA.debugLine="mResult.Put(\"FlagOK\",True)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=125304838;
 //BA.debugLineNum = 125304838;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=125304839;
 //BA.debugLineNum = 125304839;BA.debugLine="Dim FicheroJSON As String=File.ReadString(File.D";
_ficherojson = parent.__c.File.ReadString(parent.__c.File.getDirAssets(),_nombreficherojson);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=125304841;
 //BA.debugLineNum = 125304841;BA.debugLine="mResult.Put(\"FlagOK\",False)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=125304842;
 //BA.debugLineNum = 125304842;BA.debugLine="mResult.Put(\"msgError\",\"Fichero no encontrado \"";
_mresult.Put((Object)("msgError"),(Object)("Fichero no encontrado "+_nombreficherojson));
RDebugUtils.currentLine=125304843;
 //BA.debugLineNum = 125304843;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
 if (true) break;
if (true) break;

case 6:
//C
this.state = 7;
this.catchState = 0;
;
RDebugUtils.currentLine=125304846;
 //BA.debugLineNum = 125304846;BA.debugLine="Dim p As JSONParser";
_p = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=125304847;
 //BA.debugLineNum = 125304847;BA.debugLine="p.Initialize(FicheroJSON)";
_p.Initialize(_ficherojson);
RDebugUtils.currentLine=125304848;
 //BA.debugLineNum = 125304848;BA.debugLine="Dim mJSON As Map = p.NextObject";
_mjson = new anywheresoftware.b4a.objects.collections.Map();
_mjson = _p.NextObject();
RDebugUtils.currentLine=125304850;
 //BA.debugLineNum = 125304850;BA.debugLine="DatosOrigenDatosFormRegistro=CreateTipoOrigenDato";
__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/  = __ref._createtipoorigendatos /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ (null,BA.ObjectToString(_mjson.Get((Object)("IpJRDC"))),BA.ObjectToString(_mjson.Get((Object)("PuertoJRDC"))),BA.ObjectToString(_mjson.Get((Object)("NombreTabla"))),BA.ObjectToString(_mjson.GetDefault((Object)("DBMS"),(Object)("MySQL"))));
RDebugUtils.currentLine=125304852;
 //BA.debugLineNum = 125304852;BA.debugLine="Select DatosOrigenDatosFormRegistro.DBMS";
if (true) break;

case 7:
//select
this.state = 12;
switch (BA.switchObjectToInt(__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .DBMS /*String*/ ,"MySQL","SQLServer")) {
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
RDebugUtils.currentLine=125304857;
 //BA.debugLineNum = 125304857;BA.debugLine="WAIT FOR (CargaCamposJRDCMySQL(DatosOrigenDato";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "setjsoncampos"), __ref._cargacamposjrdcmysql /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .IpJRDC /*String*/ ,(int)(Double.parseDouble(__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .PuertoJRDC /*String*/ )),__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .NombreTabla /*String*/ ));
this.state = 123;
return;
case 123:
//C
this.state = 12;
_accion = (String) result[1];
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=125304860;
 //BA.debugLineNum = 125304860;BA.debugLine="WAIT FOR (CargaCamposJRDCSQLServer(DatosOrigenD";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "setjsoncampos"), __ref._cargacamposjrdcsqlserver /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .IpJRDC /*String*/ ,(int)(Double.parseDouble(__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .PuertoJRDC /*String*/ )),__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .NombreTabla /*String*/ ));
this.state = 124;
return;
case 124:
//C
this.state = 12;
_accion = (String) result[1];
;
 if (true) break;
;
RDebugUtils.currentLine=125304864;
 //BA.debugLineNum = 125304864;BA.debugLine="If Accion<>\"OK\" Then";

case 12:
//if
this.state = 15;
if ((_accion).equals("OK") == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=125304865;
 //BA.debugLineNum = 125304865;BA.debugLine="mResult.Put(\"FlagOK\",False)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=125304866;
 //BA.debugLineNum = 125304866;BA.debugLine="mResult.Put(\"msgError\",\"Error query/servidor Car";
_mresult.Put((Object)("msgError"),(Object)("Error query/servidor CargaCamposJRDC"));
RDebugUtils.currentLine=125304867;
 //BA.debugLineNum = 125304867;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=125304872;
 //BA.debugLineNum = 125304872;BA.debugLine="Dim ColItemsImparesJSON, ColItemsParesJSON As Int";
_colitemsimparesjson = 0;
_colitemsparesjson = 0;
RDebugUtils.currentLine=125304873;
 //BA.debugLineNum = 125304873;BA.debugLine="ColItemsImparesJSON=mJSON.Getdefault(\"ColorItemsI";
_colitemsimparesjson = (int)(BA.ObjectToNumber(_mjson.GetDefault((Object)("ColorItemsImpares"),(Object)(-1))));
RDebugUtils.currentLine=125304874;
 //BA.debugLineNum = 125304874;BA.debugLine="ColItemsParesJSON=mJSON.Getdefault(\"ColorItemsPar";
_colitemsparesjson = (int)(BA.ObjectToNumber(_mjson.GetDefault((Object)("ColorItemsPares"),(Object)(-1))));
RDebugUtils.currentLine=125304876;
 //BA.debugLineNum = 125304876;BA.debugLine="If ColItemsImparesJSON<>-1 Then ColItemsImpares=C";
if (true) break;

case 16:
//if
this.state = 21;
if (_colitemsimparesjson!=-1) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
__ref._colitemsimpares /*int*/  = _colitemsimparesjson;
if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=125304877;
 //BA.debugLineNum = 125304877;BA.debugLine="If ColItemsParesJSON<>-1 Then ColItemsPares=ColIt";
if (true) break;

case 22:
//if
this.state = 27;
if (_colitemsparesjson!=-1) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
__ref._colitemspares /*int*/  = _colitemsparesjson;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=125304880;
 //BA.debugLineNum = 125304880;BA.debugLine="Dim lstItemsFromString As List=mJSON.Get(\"Items\")";
_lstitemsfromstring = new anywheresoftware.b4a.objects.collections.List();
_lstitemsfromstring = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mjson.Get((Object)("Items"))));
RDebugUtils.currentLine=125304881;
 //BA.debugLineNum = 125304881;BA.debugLine="Dim lstNombresCamposJSON As List";
_lstnombrescamposjson = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=125304882;
 //BA.debugLineNum = 125304882;BA.debugLine="lstNombresCamposJSON.Initialize";
_lstnombrescamposjson.Initialize();
RDebugUtils.currentLine=125304884;
 //BA.debugLineNum = 125304884;BA.debugLine="Dim lstControlesIndependientes As List";
_lstcontrolesindependientes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=125304885;
 //BA.debugLineNum = 125304885;BA.debugLine="lstControlesIndependientes.Initialize";
_lstcontrolesindependientes.Initialize();
RDebugUtils.currentLine=125304889;
 //BA.debugLineNum = 125304889;BA.debugLine="Dim ModificacionEnDatosJSON As StringBuilder";
_modificacionendatosjson = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=125304890;
 //BA.debugLineNum = 125304890;BA.debugLine="ModificacionEnDatosJSON.Initialize";
_modificacionendatosjson.Initialize();
RDebugUtils.currentLine=125304899;
 //BA.debugLineNum = 125304899;BA.debugLine="Dim IDxOrden As Int";
_idxorden = 0;
RDebugUtils.currentLine=125304900;
 //BA.debugLineNum = 125304900;BA.debugLine="Dim lstIdxEliminar As List";
_lstidxeliminar = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=125304901;
 //BA.debugLineNum = 125304901;BA.debugLine="lstIdxEliminar.Initialize";
_lstidxeliminar.Initialize();
RDebugUtils.currentLine=125304902;
 //BA.debugLineNum = 125304902;BA.debugLine="For Each mJSON As Map In lstItemsFromString";
if (true) break;

case 28:
//for
this.state = 50;
_mjson = new anywheresoftware.b4a.objects.collections.Map();
group41 = _lstitemsfromstring;
index41 = 0;
groupLen41 = group41.getSize();
this.state = 125;
if (true) break;

case 125:
//C
this.state = 50;
if (index41 < groupLen41) {
this.state = 30;
_mjson = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group41.Get(index41)));}
if (true) break;

case 126:
//C
this.state = 125;
index41++;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=125304903;
 //BA.debugLineNum = 125304903;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
_campojson = BA.ObjectToString(_mjson.Get((Object)("Campo")));
RDebugUtils.currentLine=125304904;
 //BA.debugLineNum = 125304904;BA.debugLine="Dim FlagCampoJsonOK As Boolean=False";
_flagcampojsonok = parent.__c.False;
RDebugUtils.currentLine=125304905;
 //BA.debugLineNum = 125304905;BA.debugLine="If True=mJSON.Getdefault(\"ControlIndependiente\",";
if (true) break;

case 31:
//if
this.state = 49;
if (parent.__c.True==BA.ObjectToBoolean(_mjson.GetDefault((Object)("ControlIndependiente"),(Object)(parent.__c.False)))) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 49;
RDebugUtils.currentLine=125304906;
 //BA.debugLineNum = 125304906;BA.debugLine="FlagCampoJsonOK=True";
_flagcampojsonok = parent.__c.True;
RDebugUtils.currentLine=125304907;
 //BA.debugLineNum = 125304907;BA.debugLine="Dim InfoCampojFR As InfoCampoJamFormRegistro";
_infocampojfr = new b4j.docU.jamformregistro._infocampojamformregistro();
RDebugUtils.currentLine=125304909;
 //BA.debugLineNum = 125304909;BA.debugLine="InfoCampojFR.CampoSQL=CampoJSON";
_infocampojfr.CampoSQL /*String*/  = _campojson;
RDebugUtils.currentLine=125304910;
 //BA.debugLineNum = 125304910;BA.debugLine="InfoCampojFR.TituloCampo=mJSON.Get(\"TituloCampo";
_infocampojfr.TituloCampo /*String*/  = BA.ObjectToString(_mjson.Get((Object)("TituloCampo")));
RDebugUtils.currentLine=125304912;
 //BA.debugLineNum = 125304912;BA.debugLine="InfoCampojFR.TipoDatoSQL=mJSON.Get(\"TipoDatoSQL";
_infocampojfr.TipoDatoSQL /*String*/  = BA.ObjectToString(_mjson.Get((Object)("TipoDatoSQL")));
RDebugUtils.currentLine=125304914;
 //BA.debugLineNum = 125304914;BA.debugLine="InfoCampojFR.NoNuloSQL=mJSON.Get(\"NoNulo\")";
_infocampojfr.NoNuloSQL /*boolean*/  = BA.ObjectToBoolean(_mjson.Get((Object)("NoNulo")));
RDebugUtils.currentLine=125304915;
 //BA.debugLineNum = 125304915;BA.debugLine="InfoCampojFR.PrimaryKeySQL=mJSON.Get(\"PrimaryKe";
_infocampojfr.PrimaryKeySQL /*boolean*/  = BA.ObjectToBoolean(_mjson.Get((Object)("PrimaryKey")));
RDebugUtils.currentLine=125304916;
 //BA.debugLineNum = 125304916;BA.debugLine="InfoCampojFR.AutoIncrementalSQL=mJSON.Get(\"Auto";
_infocampojfr.AutoIncrementalSQL /*boolean*/  = BA.ObjectToBoolean(_mjson.Get((Object)("AutoIncremental")));
RDebugUtils.currentLine=125304917;
 //BA.debugLineNum = 125304917;BA.debugLine="InfoCampojFR.ValorCampoPorDefectoSQL=mJSON.Get(";
_infocampojfr.ValorCampoPorDefectoSQL /*Object*/  = _mjson.Get((Object)("ValorCampoPorDefecto"));
RDebugUtils.currentLine=125304919;
 //BA.debugLineNum = 125304919;BA.debugLine="InfoCampojFR.TipoControl=mJSON.Get(\"TipoControl";
_infocampojfr.TipoControl /*String*/  = BA.ObjectToString(_mjson.Get((Object)("TipoControl")));
RDebugUtils.currentLine=125304920;
 //BA.debugLineNum = 125304920;BA.debugLine="InfoCampojFR.ControlEditable=mJSON.Get(\"Control";
_infocampojfr.ControlEditable /*boolean*/  = BA.ObjectToBoolean(_mjson.Get((Object)("ControlEditable")));
RDebugUtils.currentLine=125304921;
 //BA.debugLineNum = 125304921;BA.debugLine="InfoCampojFR.EsFecha=mJSON.Get(\"EsFecha\")";
_infocampojfr.EsFecha /*boolean*/  = BA.ObjectToBoolean(_mjson.Get((Object)("EsFecha")));
RDebugUtils.currentLine=125304922;
 //BA.debugLineNum = 125304922;BA.debugLine="InfoCampojFR.InfoCampo=mJSON.Get(\"InfoCampo\")";
_infocampojfr.InfoCampo /*String*/  = BA.ObjectToString(_mjson.Get((Object)("InfoCampo")));
RDebugUtils.currentLine=125304923;
 //BA.debugLineNum = 125304923;BA.debugLine="Dim mExtras As Map=mJSON.Getdefault(\"Extras\",\"\"";
_mextras = new anywheresoftware.b4a.objects.collections.Map();
_mextras = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mjson.GetDefault((Object)("Extras"),(Object)(""))));
RDebugUtils.currentLine=125304924;
 //BA.debugLineNum = 125304924;BA.debugLine="InfoCampojFR.TipoDatosAux=\"\"";
_infocampojfr.TipoDatosAux /*String*/  = "";
RDebugUtils.currentLine=125304925;
 //BA.debugLineNum = 125304925;BA.debugLine="InfoCampojFR.OrdenCampo=IDxOrden";
_infocampojfr.OrdenCampo /*int*/  = _idxorden;
RDebugUtils.currentLine=125304927;
 //BA.debugLineNum = 125304927;BA.debugLine="lstControlesIndependientes.Add(InfoCampojFR)";
_lstcontrolesindependientes.Add((Object)(_infocampojfr));
RDebugUtils.currentLine=125304928;
 //BA.debugLineNum = 125304928;BA.debugLine="lstNombresCamposJSON.Add(CampoJSON)";
_lstnombrescamposjson.Add((Object)(_campojson));
RDebugUtils.currentLine=125304929;
 //BA.debugLineNum = 125304929;BA.debugLine="IDxOrden=IDxOrden+1";
_idxorden = (int) (_idxorden+1);
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=125304932;
 //BA.debugLineNum = 125304932;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegist";
if (true) break;

case 36:
//for
this.state = 43;
group65 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
index65 = 0;
groupLen65 = group65.getSize();
this.state = 127;
if (true) break;

case 127:
//C
this.state = 43;
if (index65 < groupLen65) {
this.state = 38;
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(group65.Get(index65));}
if (true) break;

case 128:
//C
this.state = 127;
index65++;
if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=125304936;
 //BA.debugLineNum = 125304936;BA.debugLine="If CampoJSON=InfoCampojFR.CampoSQL Then";
if (true) break;

case 39:
//if
this.state = 42;
if ((_campojson).equals(_infocampojfr.CampoSQL /*String*/ )) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=125304937;
 //BA.debugLineNum = 125304937;BA.debugLine="FlagCampoJsonOK=True";
_flagcampojsonok = parent.__c.True;
RDebugUtils.currentLine=125304938;
 //BA.debugLineNum = 125304938;BA.debugLine="Exit";
this.state = 43;
if (true) break;
 if (true) break;

case 42:
//C
this.state = 128;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=125304942;
 //BA.debugLineNum = 125304942;BA.debugLine="If FlagCampoJsonOK=False Then";

case 43:
//if
this.state = 48;
if (_flagcampojsonok==parent.__c.False) { 
this.state = 45;
}else {
this.state = 47;
}if (true) break;

case 45:
//C
this.state = 48;
RDebugUtils.currentLine=125304943;
 //BA.debugLineNum = 125304943;BA.debugLine="Dim idXJSONNok As Int=lstItemsFromString.Index";
_idxjsonnok = _lstitemsfromstring.IndexOf((Object)(_mjson.getObject()));
RDebugUtils.currentLine=125304944;
 //BA.debugLineNum = 125304944;BA.debugLine="Log(\"se elimina Campo \" & CampoJSON & \" por no";
parent.__c.LogImpl("9125304944","se elimina Campo "+_campojson+" por no existir en tabla MySQL, index "+BA.NumberToString(_idxjsonnok),0);
RDebugUtils.currentLine=125304946;
 //BA.debugLineNum = 125304946;BA.debugLine="lstIdxEliminar.Add(idXJSONNok)";
_lstidxeliminar.Add((Object)(_idxjsonnok));
RDebugUtils.currentLine=125304947;
 //BA.debugLineNum = 125304947;BA.debugLine="ModificacionEnDatosJSON.Append(\"Campo JSON \" &";
_modificacionendatosjson.Append("Campo JSON "+_campojson+"se elimina, por no existir en tabla MySQL").Append(parent.__c.CRLF);
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=125304949;
 //BA.debugLineNum = 125304949;BA.debugLine="InfoCampojFR.OrdenCampo=IDxOrden";
_infocampojfr.OrdenCampo /*int*/  = _idxorden;
RDebugUtils.currentLine=125304950;
 //BA.debugLineNum = 125304950;BA.debugLine="lstNombresCamposJSON.Add(CampoJSON)";
_lstnombrescamposjson.Add((Object)(_campojson));
RDebugUtils.currentLine=125304951;
 //BA.debugLineNum = 125304951;BA.debugLine="IDxOrden=IDxOrden+1";
_idxorden = (int) (_idxorden+1);
 if (true) break;

case 48:
//C
this.state = 49;
;
 if (true) break;

case 49:
//C
this.state = 126;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=125304957;
 //BA.debugLineNum = 125304957;BA.debugLine="For Each IDxDel As Int In lstIdxEliminar";

case 50:
//for
this.state = 53;
group83 = _lstidxeliminar;
index83 = 0;
groupLen83 = group83.getSize();
this.state = 129;
if (true) break;

case 129:
//C
this.state = 53;
if (index83 < groupLen83) {
this.state = 52;
_idxdel = (int)(BA.ObjectToNumber(group83.Get(index83)));}
if (true) break;

case 130:
//C
this.state = 129;
index83++;
if (true) break;

case 52:
//C
this.state = 130;
RDebugUtils.currentLine=125304958;
 //BA.debugLineNum = 125304958;BA.debugLine="lstItemsFromString.RemoveAt(IDxDel)";
_lstitemsfromstring.RemoveAt(_idxdel);
 if (true) break;
if (true) break;

case 53:
//C
this.state = 54;
;
RDebugUtils.currentLine=125304969;
 //BA.debugLineNum = 125304969;BA.debugLine="Dim NumCamposEnFormulario As Int";
_numcamposenformulario = 0;
RDebugUtils.currentLine=125304970;
 //BA.debugLineNum = 125304970;BA.debugLine="Dim FlagTodosCamposMySQLOK As Boolean=True";
_flagtodoscamposmysqlok = parent.__c.True;
RDebugUtils.currentLine=125304972;
 //BA.debugLineNum = 125304972;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";
if (true) break;

case 54:
//for
this.state = 116;
group88 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
index88 = 0;
groupLen88 = group88.getSize();
this.state = 131;
if (true) break;

case 131:
//C
this.state = 116;
if (index88 < groupLen88) {
this.state = 56;
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(group88.Get(index88));}
if (true) break;

case 132:
//C
this.state = 131;
index88++;
if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=125304978;
 //BA.debugLineNum = 125304978;BA.debugLine="If lstNombresCamposJSON.IndexOf(InfoCampojFR.Cam";
if (true) break;

case 57:
//if
this.state = 60;
if (_lstnombrescamposjson.IndexOf((Object)(_infocampojfr.CampoSQL /*String*/ ))==-1) { 
this.state = 59;
}if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=125304979;
 //BA.debugLineNum = 125304979;BA.debugLine="InfoCampojFR.TipoControl=\"\"";
_infocampojfr.TipoControl /*String*/  = "";
RDebugUtils.currentLine=125304980;
 //BA.debugLineNum = 125304980;BA.debugLine="Continue ' pasamos al siguiente campo MySQL";
this.state = 132;
if (true) break;;
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=125304994;
 //BA.debugLineNum = 125304994;BA.debugLine="Dim FlagCampoJsonOK As Boolean=False";
_flagcampojsonok = parent.__c.False;
RDebugUtils.currentLine=125304997;
 //BA.debugLineNum = 125304997;BA.debugLine="For Each mJSON As Map In lstItemsFromString";
if (true) break;

case 61:
//for
this.state = 99;
_mjson = new anywheresoftware.b4a.objects.collections.Map();
group94 = _lstitemsfromstring;
index94 = 0;
groupLen94 = group94.getSize();
this.state = 133;
if (true) break;

case 133:
//C
this.state = 99;
if (index94 < groupLen94) {
this.state = 63;
_mjson = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group94.Get(index94)));}
if (true) break;

case 134:
//C
this.state = 133;
index94++;
if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=125304999;
 //BA.debugLineNum = 125304999;BA.debugLine="Dim CampoJSON As String=mJSON.Get(\"Campo\")";
_campojson = BA.ObjectToString(_mjson.Get((Object)("Campo")));
RDebugUtils.currentLine=125305001;
 //BA.debugLineNum = 125305001;BA.debugLine="If CampoJSON=InfoCampojFR.CampoSQL Then  ' el c";
if (true) break;

case 64:
//if
this.state = 98;
if ((_campojson).equals(_infocampojfr.CampoSQL /*String*/ )) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=125305003;
 //BA.debugLineNum = 125305003;BA.debugLine="Dim TipoDatoMySQLJSON As String=mJSON.Get(\"Tip";
_tipodatomysqljson = BA.ObjectToString(_mjson.Get((Object)("TipoDatoMySQL")));
RDebugUtils.currentLine=125305004;
 //BA.debugLineNum = 125305004;BA.debugLine="Dim NoNuloJSON As Boolean=mJSON.Get(\"NoNulo\")";
_nonulojson = BA.ObjectToBoolean(_mjson.Get((Object)("NoNulo")));
RDebugUtils.currentLine=125305005;
 //BA.debugLineNum = 125305005;BA.debugLine="Dim PrimaryKeyJSON As Boolean=mJSON.Get(\"Prima";
_primarykeyjson = BA.ObjectToBoolean(_mjson.Get((Object)("PrimaryKey")));
RDebugUtils.currentLine=125305006;
 //BA.debugLineNum = 125305006;BA.debugLine="Dim AutoIncrementalJSON As Boolean=mJSON.Get(\"";
_autoincrementaljson = BA.ObjectToBoolean(_mjson.Get((Object)("AutoIncremental")));
RDebugUtils.currentLine=125305007;
 //BA.debugLineNum = 125305007;BA.debugLine="Dim ValorCampoPorDefectoJSON As String=mJSON.G";
_valorcampopordefectojson = BA.ObjectToString(_mjson.Get((Object)("ValorCampoPorDefecto")));
RDebugUtils.currentLine=125305011;
 //BA.debugLineNum = 125305011;BA.debugLine="If TipoDatoMySQLJSON=InfoCampojFR.TipoDatoSQL";
if (true) break;

case 67:
//if
this.state = 97;
if ((_tipodatomysqljson).equals(_infocampojfr.TipoDatoSQL /*String*/ ) && _nonulojson==_infocampojfr.NoNuloSQL /*boolean*/  && _primarykeyjson==_infocampojfr.PrimaryKeySQL /*boolean*/  && _autoincrementaljson==_infocampojfr.AutoIncrementalSQL /*boolean*/  && (_valorcampopordefectojson).equals(BA.ObjectToString(_infocampojfr.ValorCampoPorDefectoSQL /*Object*/ ))) { 
this.state = 69;
}else {
this.state = 96;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=125305013;
 //BA.debugLineNum = 125305013;BA.debugLine="FlagCampoJsonOK=True   ' si todos los valores";
_flagcampojsonok = parent.__c.True;
RDebugUtils.currentLine=125305015;
 //BA.debugLineNum = 125305015;BA.debugLine="InfoCampojFR.TipoControl=mJSON.Get(\"TipoContr";
_infocampojfr.TipoControl /*String*/  = BA.ObjectToString(_mjson.Get((Object)("TipoControl")));
RDebugUtils.currentLine=125305016;
 //BA.debugLineNum = 125305016;BA.debugLine="InfoCampojFR.ControlEditable=mJSON.Get(\"Contr";
_infocampojfr.ControlEditable /*boolean*/  = BA.ObjectToBoolean(_mjson.Get((Object)("ControlEditable")));
RDebugUtils.currentLine=125305017;
 //BA.debugLineNum = 125305017;BA.debugLine="InfoCampojFR.EsFecha=mJSON.Get(\"EsFecha\")";
_infocampojfr.EsFecha /*boolean*/  = BA.ObjectToBoolean(_mjson.Get((Object)("EsFecha")));
RDebugUtils.currentLine=125305018;
 //BA.debugLineNum = 125305018;BA.debugLine="InfoCampojFR.InfoCampo=mJSON.Get(\"InfoCampo\")";
_infocampojfr.InfoCampo /*String*/  = BA.ObjectToString(_mjson.Get((Object)("InfoCampo")));
RDebugUtils.currentLine=125305019;
 //BA.debugLineNum = 125305019;BA.debugLine="InfoCampojFR.TituloCampo=mJSON.Get(\"TituloCam";
_infocampojfr.TituloCampo /*String*/  = BA.ObjectToString(_mjson.Get((Object)("TituloCampo")));
RDebugUtils.currentLine=125305020;
 //BA.debugLineNum = 125305020;BA.debugLine="Dim mExtras As Map=mJSON.Getdefault(\"Extras\",";
_mextras = new anywheresoftware.b4a.objects.collections.Map();
_mextras = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mjson.GetDefault((Object)("Extras"),(Object)(""))));
RDebugUtils.currentLine=125305023;
 //BA.debugLineNum = 125305023;BA.debugLine="InfoCampojFR.TipoDatosAux=mExtras.GetDefault(";
_infocampojfr.TipoDatosAux /*String*/  = BA.ObjectToString(_mextras.GetDefault((Object)("TipoDatosAux"),(Object)("")));
RDebugUtils.currentLine=125305024;
 //BA.debugLineNum = 125305024;BA.debugLine="Dim lstValoresDatosAux As List";
_lstvaloresdatosaux = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=125305025;
 //BA.debugLineNum = 125305025;BA.debugLine="lstValoresDatosAux.Initialize";
_lstvaloresdatosaux.Initialize();
RDebugUtils.currentLine=125305026;
 //BA.debugLineNum = 125305026;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Lista\" Then";
if (true) break;

case 70:
//if
this.state = 77;
if ((_infocampojfr.TipoDatosAux /*String*/ ).equals("Lista")) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=125305027;
 //BA.debugLineNum = 125305027;BA.debugLine="If mExtras.GetDefault(\"ListaValoresDatosAux\"";
if (true) break;

case 73:
//if
this.state = 76;
if ((_mextras.GetDefault((Object)("ListaValoresDatosAux"),(Object)(""))).equals((Object)(""))) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=125305028;
 //BA.debugLineNum = 125305028;BA.debugLine="mResult.Put(\"FlagOK\",False)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=125305029;
 //BA.debugLineNum = 125305029;BA.debugLine="mResult.Put(\"msgError\",\"Error, La lista de";
_mresult.Put((Object)("msgError"),(Object)("Error, La lista de valores aux del campo "+_infocampojfr.CampoSQL /*String*/ +" está vacia"));
RDebugUtils.currentLine=125305030;
 //BA.debugLineNum = 125305030;BA.debugLine="Exit";
this.state = 99;
if (true) break;
 if (true) break;

case 76:
//C
this.state = 77;
;
RDebugUtils.currentLine=125305032;
 //BA.debugLineNum = 125305032;BA.debugLine="lstValoresDatosAux=Regex.Split(\";\",mExtras.G";
_lstvaloresdatosaux = anywheresoftware.b4a.keywords.Common.ArrayToList(parent.__c.Regex.Split(";",BA.ObjectToString(_mextras.GetDefault((Object)("ListaValoresDatosAux"),(Object)("")))));
 if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=125305034;
 //BA.debugLineNum = 125305034;BA.debugLine="InfoCampojFR.ListaValoresDatosAux=lstValoresD";
_infocampojfr.ListaValoresDatosAux /*anywheresoftware.b4a.objects.collections.List*/  = _lstvaloresdatosaux;
RDebugUtils.currentLine=125305036;
 //BA.debugLineNum = 125305036;BA.debugLine="InfoCampojFR.IPJrdcOrigenDatosAux=mExtras.Get";
_infocampojfr.IPJrdcOrigenDatosAux /*String*/  = BA.ObjectToString(_mextras.GetDefault((Object)("IPJrdcOrigenDatosAux"),(Object)("")));
RDebugUtils.currentLine=125305037;
 //BA.debugLineNum = 125305037;BA.debugLine="InfoCampojFR.PuertoJrdcOrigenDatosAux=mExtras";
_infocampojfr.PuertoJrdcOrigenDatosAux /*String*/  = BA.ObjectToString(_mextras.GetDefault((Object)("PuertoJrdcOrigenDatosAux"),(Object)("")));
RDebugUtils.currentLine=125305038;
 //BA.debugLineNum = 125305038;BA.debugLine="InfoCampojFR.ComandoConfigDatosAux=mExtras.Ge";
_infocampojfr.ComandoConfigDatosAux /*String*/  = BA.ObjectToString(_mextras.GetDefault((Object)("ComandoConfigDatosAux"),(Object)("")));
RDebugUtils.currentLine=125305040;
 //BA.debugLineNum = 125305040;BA.debugLine="Dim lstParams As List";
_lstparams = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=125305041;
 //BA.debugLineNum = 125305041;BA.debugLine="lstParams.Initialize";
_lstparams.Initialize();
RDebugUtils.currentLine=125305042;
 //BA.debugLineNum = 125305042;BA.debugLine="If InfoCampojFR.TipoDatosAux=\"Consulta\" Then";
if (true) break;

case 78:
//if
this.state = 94;
if ((_infocampojfr.TipoDatosAux /*String*/ ).equals("Consulta")) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=125305044;
 //BA.debugLineNum = 125305044;BA.debugLine="If InfoCampojFR.IPJrdcOrigenDatosAux=\"\" Then";
if (true) break;

case 81:
//if
this.state = 84;
if ((_infocampojfr.IPJrdcOrigenDatosAux /*String*/ ).equals("")) { 
this.state = 83;
}if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=125305045;
 //BA.debugLineNum = 125305045;BA.debugLine="mResult.Put(\"FlagOK\",False)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=125305046;
 //BA.debugLineNum = 125305046;BA.debugLine="mResult.Put(\"msgError\",\"Error, El IPJrdcOri";
_mresult.Put((Object)("msgError"),(Object)("Error, El IPJrdcOrigenDatosAux del campo "+_infocampojfr.CampoSQL /*String*/ +" está vacio"));
RDebugUtils.currentLine=125305047;
 //BA.debugLineNum = 125305047;BA.debugLine="Exit";
this.state = 99;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=125305049;
 //BA.debugLineNum = 125305049;BA.debugLine="If InfoCampojFR.PuertoJrdcOrigenDatosAux=\"\"";

case 84:
//if
this.state = 87;
if ((_infocampojfr.PuertoJrdcOrigenDatosAux /*String*/ ).equals("")) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=125305050;
 //BA.debugLineNum = 125305050;BA.debugLine="mResult.Put(\"FlagOK\",False)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=125305051;
 //BA.debugLineNum = 125305051;BA.debugLine="mResult.Put(\"msgError\",\"Error, El PuertoJrd";
_mresult.Put((Object)("msgError"),(Object)("Error, El PuertoJrdcOrigenDatosAux del campo "+_infocampojfr.CampoSQL /*String*/ +" está vacio"));
RDebugUtils.currentLine=125305052;
 //BA.debugLineNum = 125305052;BA.debugLine="Exit";
this.state = 99;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=125305054;
 //BA.debugLineNum = 125305054;BA.debugLine="If InfoCampojFR.ComandoConfigDatosAux=\"\" The";

case 87:
//if
this.state = 90;
if ((_infocampojfr.ComandoConfigDatosAux /*String*/ ).equals("")) { 
this.state = 89;
}if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=125305055;
 //BA.debugLineNum = 125305055;BA.debugLine="mResult.Put(\"FlagOK\",False)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=125305056;
 //BA.debugLineNum = 125305056;BA.debugLine="mResult.Put(\"msgError\",\"Error, El comandoCo";
_mresult.Put((Object)("msgError"),(Object)("Error, El comandoConfigDatosAux del campo "+_infocampojfr.CampoSQL /*String*/ +" está vacio"));
RDebugUtils.currentLine=125305057;
 //BA.debugLineNum = 125305057;BA.debugLine="Exit";
this.state = 99;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=125305060;
 //BA.debugLineNum = 125305060;BA.debugLine="If mExtras.GetDefault(\"ParametrosComandoDato";

case 90:
//if
this.state = 93;
if ((_mextras.GetDefault((Object)("ParametrosComandoDatosAux"),(Object)(""))).equals((Object)("")) == false) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
RDebugUtils.currentLine=125305061;
 //BA.debugLineNum = 125305061;BA.debugLine="lstParams=Regex.Split(\";\",mExtras.GetDefaul";
_lstparams = anywheresoftware.b4a.keywords.Common.ArrayToList(parent.__c.Regex.Split(";",BA.ObjectToString(_mextras.GetDefault((Object)("ParametrosComandoDatosAux"),(Object)("")))));
 if (true) break;

case 93:
//C
this.state = 94;
;
 if (true) break;

case 94:
//C
this.state = 97;
;
RDebugUtils.currentLine=125305065;
 //BA.debugLineNum = 125305065;BA.debugLine="InfoCampojFR.ParametrosComandoDatosAux=lstPar";
_infocampojfr.ParametrosComandoDatosAux /*anywheresoftware.b4a.objects.collections.List*/  = _lstparams;
RDebugUtils.currentLine=125305066;
 //BA.debugLineNum = 125305066;BA.debugLine="InfoCampojFR.NumCamposDatosAux=mExtras.GetDef";
_infocampojfr.NumCamposDatosAux /*int*/  = (int)(BA.ObjectToNumber(_mextras.GetDefault((Object)("NumCamposDatosAux"),(Object)(-1))));
 if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=125305071;
 //BA.debugLineNum = 125305071;BA.debugLine="FlagCampoJsonOK=False";
_flagcampojsonok = parent.__c.False;
RDebugUtils.currentLine=125305072;
 //BA.debugLineNum = 125305072;BA.debugLine="Exit";
this.state = 99;
if (true) break;
 if (true) break;

case 97:
//C
this.state = 98;
;
RDebugUtils.currentLine=125305074;
 //BA.debugLineNum = 125305074;BA.debugLine="Exit";
this.state = 99;
if (true) break;
 if (true) break;

case 98:
//C
this.state = 134;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=125305079;
 //BA.debugLineNum = 125305079;BA.debugLine="If Not(mResult.Get(\"FlagOK\")) Then Return mResul";

case 99:
//if
this.state = 104;
if (parent.__c.Not(BA.ObjectToBoolean(_mresult.Get((Object)("FlagOK"))))) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
if (true) break;

case 104:
//C
this.state = 105;
;
RDebugUtils.currentLine=125305082;
 //BA.debugLineNum = 125305082;BA.debugLine="If Not(FlagCampoJsonOK) Then";
if (true) break;

case 105:
//if
this.state = 108;
if (parent.__c.Not(_flagcampojsonok)) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
RDebugUtils.currentLine=125305083;
 //BA.debugLineNum = 125305083;BA.debugLine="FlagTodosCamposMySQLOK=False";
_flagtodoscamposmysqlok = parent.__c.False;
 if (true) break;
;
RDebugUtils.currentLine=125305089;
 //BA.debugLineNum = 125305089;BA.debugLine="For Each k As String In mDatosInputRegistro.Keys";

case 108:
//for
this.state = 115;
group160 = __ref._mdatosinputregistro /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
index160 = 0;
groupLen160 = group160.getSize();
this.state = 135;
if (true) break;

case 135:
//C
this.state = 115;
if (index160 < groupLen160) {
this.state = 110;
_k = BA.ObjectToString(group160.Get(index160));}
if (true) break;

case 136:
//C
this.state = 135;
index160++;
if (true) break;

case 110:
//C
this.state = 111;
RDebugUtils.currentLine=125305090;
 //BA.debugLineNum = 125305090;BA.debugLine="If k=InfoCampojFR.CampoSQL Then";
if (true) break;

case 111:
//if
this.state = 114;
if ((_k).equals(_infocampojfr.CampoSQL /*String*/ )) { 
this.state = 113;
}if (true) break;

case 113:
//C
this.state = 114;
RDebugUtils.currentLine=125305092;
 //BA.debugLineNum = 125305092;BA.debugLine="InfoCampojFR.ValorInputCampo=mDatosInputRegist";
_infocampojfr.ValorInputCampo /*Object*/  = __ref._mdatosinputregistro /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k));
RDebugUtils.currentLine=125305093;
 //BA.debugLineNum = 125305093;BA.debugLine="InfoCampojFR.ValorOutputCampo=InfoCampojFR.Val";
_infocampojfr.ValorOutputCampo /*Object*/  = _infocampojfr.ValorInputCampo /*Object*/ ;
RDebugUtils.currentLine=125305097;
 //BA.debugLineNum = 125305097;BA.debugLine="Exit";
this.state = 115;
if (true) break;
 if (true) break;

case 114:
//C
this.state = 136;
;
 if (true) break;
if (true) break;

case 115:
//C
this.state = 132;
;
RDebugUtils.currentLine=125305101;
 //BA.debugLineNum = 125305101;BA.debugLine="Dim CampoObligatorioCumplimentar As Boolean=(Fal";
_campoobligatoriocumplimentar = (parent.__c.False==_infocampojfr.AutoIncrementalSQL /*boolean*/  && parent.__c.True==_infocampojfr.NoNuloSQL /*boolean*/  && ("null").equals(BA.ObjectToString(_infocampojfr.ValorCampoPorDefectoSQL /*Object*/ )));
RDebugUtils.currentLine=125305102;
 //BA.debugLineNum = 125305102;BA.debugLine="InfoCampojFR.CampoObligatorioCumplimentar=CampoO";
_infocampojfr.CampoObligatorioCumplimentar /*boolean*/  = _campoobligatoriocumplimentar;
RDebugUtils.currentLine=125305104;
 //BA.debugLineNum = 125305104;BA.debugLine="NumCamposEnFormulario=NumCamposEnFormulario+1";
_numcamposenformulario = (int) (_numcamposenformulario+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=125305107;
 //BA.debugLineNum = 125305107;BA.debugLine="If FlagTodosCamposMySQLOK=False Then  ' o bien al";

case 116:
//if
this.state = 119;
if (_flagtodoscamposmysqlok==parent.__c.False) { 
this.state = 118;
}if (true) break;

case 118:
//C
this.state = 119;
RDebugUtils.currentLine=125305108;
 //BA.debugLineNum = 125305108;BA.debugLine="mResult.Put(\"FlagOK\",False)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.False));
RDebugUtils.currentLine=125305109;
 //BA.debugLineNum = 125305109;BA.debugLine="mResult.Put(\"msgError\",\"Campos Tabla \" & DatosOr";
_mresult.Put((Object)("msgError"),(Object)("Campos Tabla "+__ref._datosorigendatosformregistro /*b4j.docU.jamformregistro._tipoorigendatosjamformregistro*/ .NombreTabla /*String*/ +" no coinciden con los campos JSON (¿estructura de datos?)."+parent.__c.CRLF+parent.__c.CRLF+"(Revisar en Record Builder el fichero "+_nombreficherojson+")"+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador del sistema."));
RDebugUtils.currentLine=125305110;
 //BA.debugLineNum = 125305110;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
 if (true) break;
;
RDebugUtils.currentLine=125305116;
 //BA.debugLineNum = 125305116;BA.debugLine="For Each InfoCampojFR As InfoCampoJamFormRegistro";

case 119:
//for
this.state = 122;
group176 = _lstcontrolesindependientes;
index176 = 0;
groupLen176 = group176.getSize();
this.state = 137;
if (true) break;

case 137:
//C
this.state = 122;
if (index176 < groupLen176) {
this.state = 121;
_infocampojfr = (b4j.docU.jamformregistro._infocampojamformregistro)(group176.Get(index176));}
if (true) break;

case 138:
//C
this.state = 137;
index176++;
if (true) break;

case 121:
//C
this.state = 138;
RDebugUtils.currentLine=125305117;
 //BA.debugLineNum = 125305117;BA.debugLine="mlstInfoCampos.Add(InfoCampojFR)";
__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_infocampojfr));
RDebugUtils.currentLine=125305118;
 //BA.debugLineNum = 125305118;BA.debugLine="NumCamposEnFormulario=NumCamposEnFormulario+1";
_numcamposenformulario = (int) (_numcamposenformulario+1);
 if (true) break;
if (true) break;

case 122:
//C
this.state = -1;
;
RDebugUtils.currentLine=125305127;
 //BA.debugLineNum = 125305127;BA.debugLine="Dim mDimScreen As Map=DimensionesPantalla";
_mdimscreen = new anywheresoftware.b4a.objects.collections.Map();
_mdimscreen = __ref._dimensionespantalla /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=125305128;
 //BA.debugLineNum = 125305128;BA.debugLine="Dim frmH As Double=mDimScreen.Get(\"Y\")";
_frmh = (double)(BA.ObjectToNumber(_mdimscreen.Get((Object)("Y"))));
RDebugUtils.currentLine=125305131;
 //BA.debugLineNum = 125305131;BA.debugLine="frmReg.WindowHeight=Min(frmH*0.8,NumCamposEnFormu";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .setWindowHeight(parent.__c.Min(_frmh*0.8,_numcamposenformulario*parent.__c.DipToCurrent((int) (81))+parent.__c.DipToCurrent((int) (120))));
RDebugUtils.currentLine=125305133;
 //BA.debugLineNum = 125305133;BA.debugLine="frmReg.RootPane.PrefHeight=frmReg.WindowHeight";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setPrefHeight(__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .getWindowHeight());
RDebugUtils.currentLine=125305155;
 //BA.debugLineNum = 125305155;BA.debugLine="mlstInfoCampos.SortType(\"OrdenCampo\", True)";
__ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ .SortType("OrdenCampo",parent.__c.True);
RDebugUtils.currentLine=125305156;
 //BA.debugLineNum = 125305156;BA.debugLine="mResult.Put(\"FlagOK\",True)";
_mresult.Put((Object)("FlagOK"),(Object)(parent.__c.True));
RDebugUtils.currentLine=125305157;
 //BA.debugLineNum = 125305157;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=125305158;
 //BA.debugLineNum = 125305158;BA.debugLine="End Sub";
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
public void  _inicioprev(b4j.docU.jamformregistro __ref) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "inicioprev", true))
	 {Debug.delegate(ba, "inicioprev", null); return;}
ResumableSub_InicioPrev rsub = new ResumableSub_InicioPrev(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_InicioPrev extends BA.ResumableSub {
public ResumableSub_InicioPrev(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
boolean _success = false;
Object _msa = null;
int _result = 0;
b4j.docU.jamformregistro._infocampojamformregistro _icf = null;
anywheresoftware.b4a.BA.IterableList group26;
int index26;
int groupLen26;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=124256258;
 //BA.debugLineNum = 124256258;BA.debugLine="If mNombreFicheroJSON=\"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._mnombreficherojson /*String*/ ).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=124256259;
 //BA.debugLineNum = 124256259;BA.debugLine="jamRecordFormBuilder.Show(\"Nuevo\",\"\")";
parent._jamrecordformbuilder._show /*void*/ ("Nuevo","");
RDebugUtils.currentLine=124256260;
 //BA.debugLineNum = 124256260;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=124256263;
 //BA.debugLineNum = 124256263;BA.debugLine="wait for (Inicio) complete (Success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "inicioprev"), __ref._inicio /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 22;
return;
case 22:
//C
this.state = 5;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=124256265;
 //BA.debugLineNum = 124256265;BA.debugLine="If Success=False Then";
if (true) break;

case 5:
//if
this.state = 14;
if (_success==parent.__c.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=124256267;
 //BA.debugLineNum = 124256267;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La carga d";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"La carga del JSON "+__ref._mnombreficherojson /*String*/ +" ha dado error, ¿Cargar el RecordFormBuilder?","Error carga JSON","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=124256268;
 //BA.debugLineNum = 124256268;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "inicioprev"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 8;
_result = (int) result[1];
;
RDebugUtils.currentLine=124256269;
 //BA.debugLineNum = 124256269;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (true) break;

case 8:
//if
this.state = 13;
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=124256270;
 //BA.debugLineNum = 124256270;BA.debugLine="CerrarFormRegistro";
__ref._cerrarformregistro /*String*/ (null);
RDebugUtils.currentLine=124256271;
 //BA.debugLineNum = 124256271;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=124256273;
 //BA.debugLineNum = 124256273;BA.debugLine="jamRecordFormBuilder.Show(\"Edicion\",mNombreFich";
parent._jamrecordformbuilder._show /*void*/ ("Edicion",__ref._mnombreficherojson /*String*/ );
RDebugUtils.currentLine=124256274;
 //BA.debugLineNum = 124256274;BA.debugLine="CerrarFormRegistro";
__ref._cerrarformregistro /*String*/ (null);
RDebugUtils.currentLine=124256275;
 //BA.debugLineNum = 124256275;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=124256278;
 //BA.debugLineNum = 124256278;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La carga del";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La carga del JSON "+__ref._mnombreficherojson /*String*/ +" ha dado error. Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=124256279;
 //BA.debugLineNum = 124256279;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "inicioprev"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 14;
;
RDebugUtils.currentLine=124256280;
 //BA.debugLineNum = 124256280;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=124256284;
 //BA.debugLineNum = 124256284;BA.debugLine="Log(\"  \")";
parent.__c.LogImpl("9124256284","  ",0);
RDebugUtils.currentLine=124256285;
 //BA.debugLineNum = 124256285;BA.debugLine="Log(\"***********Inicio Form Registro Completed***";
parent.__c.LogImpl("9124256285","***********Inicio Form Registro Completed***********"+parent.__c.CRLF,0);
RDebugUtils.currentLine=124256286;
 //BA.debugLineNum = 124256286;BA.debugLine="Log(\"  \")";
parent.__c.LogImpl("9124256286","  ",0);
RDebugUtils.currentLine=124256287;
 //BA.debugLineNum = 124256287;BA.debugLine="Log(\"***********Lista de campos del registro: mls";
parent.__c.LogImpl("9124256287","***********Lista de campos del registro: mlstInfoCampos***********"+parent.__c.CRLF,0);
RDebugUtils.currentLine=124256288;
 //BA.debugLineNum = 124256288;BA.debugLine="Log(\"  \")";
parent.__c.LogImpl("9124256288","  ",0);
RDebugUtils.currentLine=124256289;
 //BA.debugLineNum = 124256289;BA.debugLine="For Each icF As InfoCampoJamFormRegistro In mlstI";
if (true) break;

case 15:
//for
this.state = 18;
group26 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
index26 = 0;
groupLen26 = group26.getSize();
this.state = 25;
if (true) break;

case 25:
//C
this.state = 18;
if (index26 < groupLen26) {
this.state = 17;
_icf = (b4j.docU.jamformregistro._infocampojamformregistro)(group26.Get(index26));}
if (true) break;

case 26:
//C
this.state = 25;
index26++;
if (true) break;

case 17:
//C
this.state = 26;
RDebugUtils.currentLine=124256290;
 //BA.debugLineNum = 124256290;BA.debugLine="Log(icF)";
parent.__c.LogImpl("9124256290",BA.ObjectToString(_icf),0);
RDebugUtils.currentLine=124256291;
 //BA.debugLineNum = 124256291;BA.debugLine="Log(\"  \")";
parent.__c.LogImpl("9124256291","  ",0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=124256294;
 //BA.debugLineNum = 124256294;BA.debugLine="If SubExists(mCallBack, mEventName & \"_AfterFormL";

case 18:
//if
this.state = 21;
if (parent.__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_AfterFormLoad")) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=124256295;
 //BA.debugLineNum = 124256295;BA.debugLine="CallSub(mCallBack,mEventName & \"_AfterFormLoad\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_AfterFormLoad");
 if (true) break;

case 21:
//C
this.state = -1;
;
RDebugUtils.currentLine=124256298;
 //BA.debugLineNum = 124256298;BA.debugLine="Show";
__ref._show /*String*/ (null);
RDebugUtils.currentLine=124256299;
 //BA.debugLineNum = 124256299;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _show(b4j.docU.jamformregistro __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=124649472;
 //BA.debugLineNum = 124649472;BA.debugLine="Private Sub Show";
RDebugUtils.currentLine=124649473;
 //BA.debugLineNum = 124649473;BA.debugLine="lblTitleModoRegistro.RequestFocus";
__ref._lbltitlemodoregistro /*anywheresoftware.b4j.objects.LabelWrapper*/ .RequestFocus();
RDebugUtils.currentLine=124649474;
 //BA.debugLineNum = 124649474;BA.debugLine="CargandoDatos=False";
__ref._cargandodatos /*boolean*/  = __c.False;
RDebugUtils.currentLine=124649477;
 //BA.debugLineNum = 124649477;BA.debugLine="If mModoRegistro=\"Nuevo\" Then";
if ((__ref._mmodoregistro /*String*/ ).equals("Nuevo")) { 
RDebugUtils.currentLine=124649478;
 //BA.debugLineNum = 124649478;BA.debugLine="AbrirEditorDeCampo(0)";
__ref._abrireditordecampo /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=124649481;
 //BA.debugLineNum = 124649481;BA.debugLine="frmReg.ShowAndWait";
__ref._frmreg /*anywheresoftware.b4j.objects.Form*/ .ShowAndWait();
RDebugUtils.currentLine=124649487;
 //BA.debugLineNum = 124649487;BA.debugLine="End Sub";
return "";
}
public String  _modificardatosauxconsultacampo(b4j.docU.jamformregistro __ref,String _campo,String _ipjrdcorigendatosaux,String _puertojrdcorigendatosaux,String _comandoconfigdatosaux,anywheresoftware.b4a.objects.collections.List _parametroscomandodatosaux) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "modificardatosauxconsultacampo", true))
	 {return ((String) Debug.delegate(ba, "modificardatosauxconsultacampo", new Object[] {_campo,_ipjrdcorigendatosaux,_puertojrdcorigendatosaux,_comandoconfigdatosaux,_parametroscomandodatosaux}));}
b4j.docU.jamformregistro._infocampojamformregistro _ic = null;
int _idxclv = 0;
b4j.docU.jamformregistro._infocampojamformregistro _icidx = null;
String _cpo = "";
RDebugUtils.currentLine=126418944;
 //BA.debugLineNum = 126418944;BA.debugLine="Public Sub ModificarDatosAuxConsultaCampo(Campo As";
RDebugUtils.currentLine=126418945;
 //BA.debugLineNum = 126418945;BA.debugLine="For Each IC As InfoCampoJamFormRegistro In mlstIn";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ic = (b4j.docU.jamformregistro._infocampojamformregistro)(group1.Get(index1));
RDebugUtils.currentLine=126418946;
 //BA.debugLineNum = 126418946;BA.debugLine="If IC.CampoSQL=Campo Then";
if ((_ic.CampoSQL /*String*/ ).equals(_campo)) { 
RDebugUtils.currentLine=126418947;
 //BA.debugLineNum = 126418947;BA.debugLine="IC.IPJrdcOrigenDatosAux=IPJrdcOrigenDatosAux";
_ic.IPJrdcOrigenDatosAux /*String*/  = _ipjrdcorigendatosaux;
RDebugUtils.currentLine=126418948;
 //BA.debugLineNum = 126418948;BA.debugLine="IC.PuertoJrdcOrigenDatosAux=PuertoJrdcOrigenDat";
_ic.PuertoJrdcOrigenDatosAux /*String*/  = _puertojrdcorigendatosaux;
RDebugUtils.currentLine=126418949;
 //BA.debugLineNum = 126418949;BA.debugLine="IC.ComandoConfigDatosAux=ComandoConfigDatosAux";
_ic.ComandoConfigDatosAux /*String*/  = _comandoconfigdatosaux;
RDebugUtils.currentLine=126418950;
 //BA.debugLineNum = 126418950;BA.debugLine="IC.ParametrosComandoDatosAux=ParametrosComandoD";
_ic.ParametrosComandoDatosAux /*anywheresoftware.b4a.objects.collections.List*/  = _parametroscomandodatosaux;
RDebugUtils.currentLine=126418952;
 //BA.debugLineNum = 126418952;BA.debugLine="For iDxCLV=0 To clvCamposRegistro.Size-1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getsize()-1);
_idxclv = (int) (0) ;
for (;_idxclv <= limit7 ;_idxclv = _idxclv + step7 ) {
RDebugUtils.currentLine=126418953;
 //BA.debugLineNum = 126418953;BA.debugLine="Dim ICIdx As InfoCampoJamFormRegistro=clvCampo";
_icidx = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idxclv));
RDebugUtils.currentLine=126418954;
 //BA.debugLineNum = 126418954;BA.debugLine="Dim cpo As String=ICIdx.CampoSQL";
_cpo = _icidx.CampoSQL /*String*/ ;
RDebugUtils.currentLine=126418955;
 //BA.debugLineNum = 126418955;BA.debugLine="If cpo=Campo Then";
if ((_cpo).equals(_campo)) { 
RDebugUtils.currentLine=126418956;
 //BA.debugLineNum = 126418956;BA.debugLine="ICIdx.IPJrdcOrigenDatosAux=IPJrdcOrigenDatosA";
_icidx.IPJrdcOrigenDatosAux /*String*/  = _ipjrdcorigendatosaux;
RDebugUtils.currentLine=126418957;
 //BA.debugLineNum = 126418957;BA.debugLine="ICIdx.PuertoJrdcOrigenDatosAux=PuertoJrdcOrig";
_icidx.PuertoJrdcOrigenDatosAux /*String*/  = _puertojrdcorigendatosaux;
RDebugUtils.currentLine=126418958;
 //BA.debugLineNum = 126418958;BA.debugLine="ICIdx.ComandoConfigDatosAux=ComandoConfigDato";
_icidx.ComandoConfigDatosAux /*String*/  = _comandoconfigdatosaux;
RDebugUtils.currentLine=126418959;
 //BA.debugLineNum = 126418959;BA.debugLine="ICIdx.ParametrosComandoDatosAux=ParametrosCom";
_icidx.ParametrosComandoDatosAux /*anywheresoftware.b4a.objects.collections.List*/  = _parametroscomandodatosaux;
RDebugUtils.currentLine=126418960;
 //BA.debugLineNum = 126418960;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=126418963;
 //BA.debugLineNum = 126418963;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=126418966;
 //BA.debugLineNum = 126418966;BA.debugLine="End Sub";
return "";
}
public String  _modificardatosauxlistavalorescampo(b4j.docU.jamformregistro __ref,String _campo,anywheresoftware.b4a.objects.collections.List _listavalores) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "modificardatosauxlistavalorescampo", true))
	 {return ((String) Debug.delegate(ba, "modificardatosauxlistavalorescampo", new Object[] {_campo,_listavalores}));}
b4j.docU.jamformregistro._infocampojamformregistro _ic = null;
int _idxclv = 0;
b4j.docU.jamformregistro._infocampojamformregistro _icidx = null;
String _cpo = "";
RDebugUtils.currentLine=126484480;
 //BA.debugLineNum = 126484480;BA.debugLine="Public Sub ModificarDatosAuxListaValoresCampo(Camp";
RDebugUtils.currentLine=126484481;
 //BA.debugLineNum = 126484481;BA.debugLine="For Each IC As InfoCampoJamFormRegistro In mlstIn";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_ic = (b4j.docU.jamformregistro._infocampojamformregistro)(group1.Get(index1));
RDebugUtils.currentLine=126484482;
 //BA.debugLineNum = 126484482;BA.debugLine="If IC.CampoSQL=Campo Then";
if ((_ic.CampoSQL /*String*/ ).equals(_campo)) { 
RDebugUtils.currentLine=126484483;
 //BA.debugLineNum = 126484483;BA.debugLine="IC.ListaValoresDatosAux=ListaValores";
_ic.ListaValoresDatosAux /*anywheresoftware.b4a.objects.collections.List*/  = _listavalores;
RDebugUtils.currentLine=126484484;
 //BA.debugLineNum = 126484484;BA.debugLine="For iDxCLV=0 To clvCamposRegistro.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getsize()-1);
_idxclv = (int) (0) ;
for (;_idxclv <= limit4 ;_idxclv = _idxclv + step4 ) {
RDebugUtils.currentLine=126484485;
 //BA.debugLineNum = 126484485;BA.debugLine="Dim ICIdx As InfoCampoJamFormRegistro=clvCampo";
_icidx = (b4j.docU.jamformregistro._infocampojamformregistro)(__ref._clvcamposregistro /*b4j.example.customlistview*/ ._getvalue(_idxclv));
RDebugUtils.currentLine=126484486;
 //BA.debugLineNum = 126484486;BA.debugLine="Dim cpo As String=ICIdx.CampoSQL";
_cpo = _icidx.CampoSQL /*String*/ ;
RDebugUtils.currentLine=126484487;
 //BA.debugLineNum = 126484487;BA.debugLine="If cpo=Campo Then";
if ((_cpo).equals(_campo)) { 
RDebugUtils.currentLine=126484488;
 //BA.debugLineNum = 126484488;BA.debugLine="ICIdx.ListaValoresDatosAux=ListaValores";
_icidx.ListaValoresDatosAux /*anywheresoftware.b4a.objects.collections.List*/  = _listavalores;
RDebugUtils.currentLine=126484489;
 //BA.debugLineNum = 126484489;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=126484492;
 //BA.debugLineNum = 126484492;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=126484495;
 //BA.debugLineNum = 126484495;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _modificarvalorcampoenformularioregistro(b4j.docU.jamformregistro __ref,String _campo,Object _valor,Object _valormostrado) throws Exception{
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "modificarvalorcampoenformularioregistro", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "modificarvalorcampoenformularioregistro", new Object[] {_campo,_valor,_valormostrado}));}
ResumableSub_ModificarValorCampoEnFormularioRegistro rsub = new ResumableSub_ModificarValorCampoEnFormularioRegistro(this,__ref,_campo,_valor,_valormostrado);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ModificarValorCampoEnFormularioRegistro extends BA.ResumableSub {
public ResumableSub_ModificarValorCampoEnFormularioRegistro(b4j.docU.jamformregistro parent,b4j.docU.jamformregistro __ref,String _campo,Object _valor,Object _valormostrado) {
this.parent = parent;
this.__ref = __ref;
this._campo = _campo;
this._valor = _valor;
this._valormostrado = _valormostrado;
this.__ref = parent;
}
b4j.docU.jamformregistro __ref;
b4j.docU.jamformregistro parent;
String _campo;
Object _valor;
Object _valormostrado;
b4j.docU.jamformregistro._infocampojamformregistro _ic = null;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamformregistro";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=126550017;
 //BA.debugLineNum = 126550017;BA.debugLine="For Each IC As InfoCampoJamFormRegistro In mlstIn";
if (true) break;

case 1:
//for
this.state = 12;
group1 = __ref._mlstinfocampos /*anywheresoftware.b4a.objects.collections.List*/ ;
index1 = 0;
groupLen1 = group1.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 12;
if (index1 < groupLen1) {
this.state = 3;
_ic = (b4j.docU.jamformregistro._infocampojamformregistro)(group1.Get(index1));}
if (true) break;

case 14:
//C
this.state = 13;
index1++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=126550018;
 //BA.debugLineNum = 126550018;BA.debugLine="If IC.CampoSQL=Campo Then";
if (true) break;

case 4:
//if
this.state = 11;
if ((_ic.CampoSQL /*String*/ ).equals(_campo)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=126550019;
 //BA.debugLineNum = 126550019;BA.debugLine="IC.ValorOutputCampo=Valor";
_ic.ValorOutputCampo /*Object*/  = _valor;
RDebugUtils.currentLine=126550020;
 //BA.debugLineNum = 126550020;BA.debugLine="If IC.NumCamposDatosAux>1 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_ic.NumCamposDatosAux /*int*/ >1) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=126550021;
 //BA.debugLineNum = 126550021;BA.debugLine="IC.ValorMostrarCampoFormulario=ValorMostrado";
_ic.ValorMostrarCampoFormulario /*Object*/  = _valormostrado;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=126550031;
 //BA.debugLineNum = 126550031;BA.debugLine="Exit";
this.state = 12;
if (true) break;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=126550034;
 //BA.debugLineNum = 126550034;BA.debugLine="CargaCamposCLV";
__ref._cargacamposclv /*void*/ (null);
RDebugUtils.currentLine=126550035;
 //BA.debugLineNum = 126550035;BA.debugLine="Wait For CargaCamposCLV_Completed";
parent.__c.WaitFor("cargacamposclv_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamformregistro", "modificarvalorcampoenformularioregistro"), null);
this.state = 15;
return;
case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=126550036;
 //BA.debugLineNum = 126550036;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=126550037;
 //BA.debugLineNum = 126550037;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _seteventslistener(b4j.docU.jamformregistro __ref,Object _callback,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "seteventslistener", true))
	 {return ((String) Debug.delegate(ba, "seteventslistener", new Object[] {_callback,_eventname}));}
RDebugUtils.currentLine=124190720;
 //BA.debugLineNum = 124190720;BA.debugLine="Public Sub SetEventsListener(Callback As Object, E";
RDebugUtils.currentLine=124190721;
 //BA.debugLineNum = 124190721;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=124190722;
 //BA.debugLineNum = 124190722;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=124190723;
 //BA.debugLineNum = 124190723;BA.debugLine="End Sub";
return "";
}
public String  _setformincenter(b4j.docU.jamformregistro __ref,anywheresoftware.b4j.objects.Form _parent,anywheresoftware.b4j.objects.Form _form) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamformregistro";
if (Debug.shouldDelegate(ba, "setformincenter", true))
	 {return ((String) Debug.delegate(ba, "setformincenter", new Object[] {_parent,_form}));}
RDebugUtils.currentLine=124715008;
 //BA.debugLineNum = 124715008;BA.debugLine="private Sub SetFormInCenter(Parent As Form, Form A";
RDebugUtils.currentLine=124715009;
 //BA.debugLineNum = 124715009;BA.debugLine="Form.WindowTop = Parent.WindowTop + (Parent.Windo";
_form.setWindowTop(_parent.getWindowTop()+(_parent.getWindowHeight()-_form.getWindowHeight())/(double)2);
RDebugUtils.currentLine=124715010;
 //BA.debugLineNum = 124715010;BA.debugLine="Form.WindowLeft = Parent.WindowLeft + (Parent.Win";
_form.setWindowLeft(_parent.getWindowLeft()+(_parent.getWindowWidth()-_form.getWindowWidth())/(double)2);
RDebugUtils.currentLine=124715011;
 //BA.debugLineNum = 124715011;BA.debugLine="End Sub";
return "";
}
}