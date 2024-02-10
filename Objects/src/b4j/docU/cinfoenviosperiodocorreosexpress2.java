package b4j.docU;

import anywheresoftware.b4a.debug.*;
import javafx.scene.control.*; 
import javafx.util.Callback;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.control.TableColumn;
import java.util.Arrays;
import java.util.List;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cinfoenviosperiodocorreosexpress2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cinfoenviosperiodocorreosexpress2", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cinfoenviosperiodocorreosexpress2.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _usuariows = "";
public String _passwordws = "";
public String _urlws = "";
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechainicial = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechainicial = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechafinal = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechafinal = null;
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.jamtableview _jamtableviewinfotrackingenviosperiodo = null;
public anywheresoftware.b4a.objects.collections.List _lstinfoenviosfechas = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
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
public String  _initialize(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=85983232;
 //BA.debugLineNum = 85983232;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=85983234;
 //BA.debugLineNum = 85983234;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_show rsub = new ResumableSub_show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_show extends BA.ResumableSub {
public ResumableSub_show(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.objects.collections.List _lstcf = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86114311;
 //BA.debugLineNum = 86114311;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=86114312;
 //BA.debugLineNum = 86114312;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=86114313;
 //BA.debugLineNum = 86114313;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=86114314;
 //BA.debugLineNum = 86114314;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=86114315;
 //BA.debugLineNum = 86114315;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=86114317;
 //BA.debugLineNum = 86114317;BA.debugLine="frm.RootPane.LoadLayout(\"scrInfoTrackingEnviosPer";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrInfoTrackingEnviosPeriodo");
RDebugUtils.currentLine=86114318;
 //BA.debugLineNum = 86114318;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "show"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=86114319;
 //BA.debugLineNum = 86114319;BA.debugLine="frm.Title=\"Tracking Envío Periodo Correos Express";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Tracking Envío Periodo Correos Express");
RDebugUtils.currentLine=86114321;
 //BA.debugLineNum = 86114321;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=86114323;
 //BA.debugLineNum = 86114323;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=86114325;
 //BA.debugLineNum = 86114325;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=86114326;
 //BA.debugLineNum = 86114326;BA.debugLine="mSQL.InitializeSQLite(\"\", \":memory:\", True)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite("",":memory:",parent.__c.True);
RDebugUtils.currentLine=86114329;
 //BA.debugLineNum = 86114329;BA.debugLine="cmAuxCorreosExpress.CargaListaEstadosCorreosExpre";
parent._cmauxcorreosexpress._cargalistaestadoscorreosexpress /*String*/ ();
RDebugUtils.currentLine=86114330;
 //BA.debugLineNum = 86114330;BA.debugLine="cmAuxCorreosExpress.CargaListaIncidenciasCorreosE";
parent._cmauxcorreosexpress._cargalistaincidenciascorreosexpress /*String*/ ();
RDebugUtils.currentLine=86114332;
 //BA.debugLineNum = 86114332;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.EstadoMenuI";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=86114333;
 //BA.debugLineNum = 86114333;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.EstadoMenuI";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=86114335;
 //BA.debugLineNum = 86114335;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.AlturaFilas";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=86114337;
 //BA.debugLineNum = 86114337;BA.debugLine="Dim lstCF As List";
_lstcf = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=86114338;
 //BA.debugLineNum = 86114338;BA.debugLine="lstCF.initialize";
_lstcf.Initialize();
RDebugUtils.currentLine=86114340;
 //BA.debugLineNum = 86114340;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=86114341;
 //BA.debugLineNum = 86114341;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=86114342;
 //BA.debugLineNum = 86114342;BA.debugLine="cF.AliasCampoColumna=\"FechaEstadoEnvio\"";
_cf.AliasCampoColumna /*String*/  = "FechaEstadoEnvio";
RDebugUtils.currentLine=86114343;
 //BA.debugLineNum = 86114343;BA.debugLine="cF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=86114344;
 //BA.debugLineNum = 86114344;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewInfoTrack";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=86114345;
 //BA.debugLineNum = 86114345;BA.debugLine="lstCF.Add(cF)";
_lstcf.Add((Object)(_cf));
RDebugUtils.currentLine=86114347;
 //BA.debugLineNum = 86114347;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=86114348;
 //BA.debugLineNum = 86114348;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=86114349;
 //BA.debugLineNum = 86114349;BA.debugLine="cF.AliasCampoColumna=\"NombreEstadoEnvio\"";
_cf.AliasCampoColumna /*String*/  = "NombreEstadoEnvio";
RDebugUtils.currentLine=86114350;
 //BA.debugLineNum = 86114350;BA.debugLine="cF.CellFactoryEnCallBack=True";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=86114351;
 //BA.debugLineNum = 86114351;BA.debugLine="cF.NombreFuncionCellFactory=\"setFormatoColumnaNom";
_cf.NombreFuncionCellFactory /*String*/  = "setFormatoColumnaNombreEstadoEnvio";
RDebugUtils.currentLine=86114352;
 //BA.debugLineNum = 86114352;BA.debugLine="lstCF.Add(cF)";
_lstcf.Add((Object)(_cf));
RDebugUtils.currentLine=86114354;
 //BA.debugLineNum = 86114354;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=86114355;
 //BA.debugLineNum = 86114355;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=86114356;
 //BA.debugLineNum = 86114356;BA.debugLine="cF.AliasCampoColumna=\"DescripcionEstadoEnvio\"";
_cf.AliasCampoColumna /*String*/  = "DescripcionEstadoEnvio";
RDebugUtils.currentLine=86114357;
 //BA.debugLineNum = 86114357;BA.debugLine="cF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=86114358;
 //BA.debugLineNum = 86114358;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewInfoTrack";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._cellfactory_columnawraptext /*String*/ ;
RDebugUtils.currentLine=86114359;
 //BA.debugLineNum = 86114359;BA.debugLine="lstCF.Add(cF)";
_lstcf.Add((Object)(_cf));
RDebugUtils.currentLine=86114361;
 //BA.debugLineNum = 86114361;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=86114362;
 //BA.debugLineNum = 86114362;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=86114363;
 //BA.debugLineNum = 86114363;BA.debugLine="cF.AliasCampoColumna=\"NombreCliente\"";
_cf.AliasCampoColumna /*String*/  = "NombreCliente";
RDebugUtils.currentLine=86114364;
 //BA.debugLineNum = 86114364;BA.debugLine="cF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=86114365;
 //BA.debugLineNum = 86114365;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewInfoTrack";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._cellfactory_columnawraptext /*String*/ ;
RDebugUtils.currentLine=86114366;
 //BA.debugLineNum = 86114366;BA.debugLine="lstCF.Add(cF)";
_lstcf.Add((Object)(_cf));
RDebugUtils.currentLine=86114370;
 //BA.debugLineNum = 86114370;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTracking";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"FasesTrackingExpedicionesPeriodoCorreosExpress.json",_lstcf);
RDebugUtils.currentLine=86114371;
 //BA.debugLineNum = 86114371;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=86114372;
 //BA.debugLineNum = 86114372;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("886114372",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=86114373;
 //BA.debugLineNum = 86114373;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 7:
//if
this.state = 10;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=86114374;
 //BA.debugLineNum = 86114374;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=86114375;
 //BA.debugLineNum = 86114375;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
RDebugUtils.currentLine=86114376;
 //BA.debugLineNum = 86114376;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=86114377;
 //BA.debugLineNum = 86114377;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=86114379;
 //BA.debugLineNum = 86114379;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.AddContextM";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._addcontextmenuitem /*String*/ (null,"Ver trazabilidad envío","TrazabilidadEnvio");
RDebugUtils.currentLine=86114380;
 //BA.debugLineNum = 86114380;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.AddContextM";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._addcontextmenuitem /*String*/ (null,"Ver Documento NAV","VerDocumentoNAV");
RDebugUtils.currentLine=86114383;
 //BA.debugLineNum = 86114383;BA.debugLine="lstInfoEnviosFechas.Initialize";
__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=86114384;
 //BA.debugLineNum = 86114384;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=86114389;
 //BA.debugLineNum = 86114389;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=86114391;
 //BA.debugLineNum = 86114391;BA.debugLine="FechasUltimaSemana";
__ref._fechasultimasemana /*String*/ (null);
RDebugUtils.currentLine=86114392;
 //BA.debugLineNum = 86114392;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnactualizarinfotracking_click(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "btnactualizarinfotracking_click", false))
	 {Debug.delegate(ba, "btnactualizarinfotracking_click", null); return;}
ResumableSub_btnActualizarInfoTracking_Click rsub = new ResumableSub_btnActualizarInfoTracking_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnActualizarInfoTracking_Click extends BA.ResumableSub {
public ResumableSub_btnActualizarInfoTracking_Click(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
Object _msa = null;
String _datetimeant = "";
long _lfitf = 0L;
long _lfftf = 0L;
String _sfinicial = "";
String _sffinal = "";
b4j.example.dateutils._period _p = null;
String _sresult = "";
int _i = 0;
long _ldia = 0L;
boolean _success = false;
int step29;
int limit29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86769665;
 //BA.debugLineNum = 86769665;BA.debugLine="lstInfoEnviosFechas.Initialize";
__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=86769680;
 //BA.debugLineNum = 86769680;BA.debugLine="If txtfechaInicial.Text=\"\" Or txtFechaFinal.Text=";
if (true) break;

case 1:
//if
this.state = 4;
if ((__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") || (__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=86769681;
 //BA.debugLineNum = 86769681;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha esta";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha establecido el periodo de consulta.","Aviso");
RDebugUtils.currentLine=86769682;
 //BA.debugLineNum = 86769682;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 4;
;
RDebugUtils.currentLine=86769683;
 //BA.debugLineNum = 86769683;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=86769686;
 //BA.debugLineNum = 86769686;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
_datetimeant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=86769687;
 //BA.debugLineNum = 86769687;BA.debugLine="DateTime.dateformat=\"dd/MM/yy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=86769688;
 //BA.debugLineNum = 86769688;BA.debugLine="Dim lFItF As Long=DateTime.DateParse(txtfechaInic";
_lfitf = parent.__c.DateTime.DateParse(__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=86769689;
 //BA.debugLineNum = 86769689;BA.debugLine="Dim lFFtF As Long=DateTime.DateParse(txtFechaFina";
_lfftf = parent.__c.DateTime.DateParse(__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=86769691;
 //BA.debugLineNum = 86769691;BA.debugLine="DateTime.dateformat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=86769692;
 //BA.debugLineNum = 86769692;BA.debugLine="Dim sFInicial As String=DateTime.Date(lFItF)";
_sfinicial = parent.__c.DateTime.Date(_lfitf);
RDebugUtils.currentLine=86769693;
 //BA.debugLineNum = 86769693;BA.debugLine="Dim sFFinal As String=DateTime.Date(lFFtF)";
_sffinal = parent.__c.DateTime.Date(_lfftf);
RDebugUtils.currentLine=86769694;
 //BA.debugLineNum = 86769694;BA.debugLine="Log( sFInicial & \",\" & sFFinal)";
parent.__c.LogImpl("886769694",_sfinicial+","+_sffinal,0);
RDebugUtils.currentLine=86769695;
 //BA.debugLineNum = 86769695;BA.debugLine="DateTime.dateformat=DateTimeAnt";
parent.__c.DateTime.setDateFormat(_datetimeant);
RDebugUtils.currentLine=86769699;
 //BA.debugLineNum = 86769699;BA.debugLine="Dim p As Period=DateUtils.PeriodBetweenInDays (lF";
_p = parent._dateutils._periodbetweenindays(_lfitf,_lfftf);
RDebugUtils.currentLine=86769700;
 //BA.debugLineNum = 86769700;BA.debugLine="If p.Days>45 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_p.Days>45) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=86769701;
 //BA.debugLineNum = 86769701;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El periodo má";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El periodo máximo de análisis son 45 días.","Aviso");
RDebugUtils.currentLine=86769702;
 //BA.debugLineNum = 86769702;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 8;
;
RDebugUtils.currentLine=86769703;
 //BA.debugLineNum = 86769703;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=86769706;
 //BA.debugLineNum = 86769706;BA.debugLine="Wait For (CargaCredenciales) complete (sResult As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), __ref._cargacredenciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 29;
return;
case 29:
//C
this.state = 9;
_sresult = (String) result[1];
;
RDebugUtils.currentLine=86769707;
 //BA.debugLineNum = 86769707;BA.debugLine="If sResult<>\"OK\" Then Return";
if (true) break;

case 9:
//if
this.state = 14;
if ((_sresult).equals("OK") == false) { 
this.state = 11;
;}if (true) break;

case 11:
//C
this.state = 14;
if (true) return ;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=86769710;
 //BA.debugLineNum = 86769710;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
_datetimeant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=86769711;
 //BA.debugLineNum = 86769711;BA.debugLine="DateTime.dateformat=\"dd/MM/yy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=86769713;
 //BA.debugLineNum = 86769713;BA.debugLine="jamLoadingIndicator1.DuracionCiclo=1000";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setduracionciclo(null,(int) (1000));
RDebugUtils.currentLine=86769715;
 //BA.debugLineNum = 86769715;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(""));
RDebugUtils.currentLine=86769719;
 //BA.debugLineNum = 86769719;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=86769723;
 //BA.debugLineNum = 86769723;BA.debugLine="For i=0 To p.Days";
if (true) break;

case 15:
//for
this.state = 26;
step29 = 1;
limit29 = _p.Days;
_i = (int) (0) ;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 26;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 17;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step29)) ;
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=86769724;
 //BA.debugLineNum = 86769724;BA.debugLine="Dim LDia As Long=lFItF+(i*DateTime.TicksPerDay)";
_ldia = (long) (_lfitf+(_i*parent.__c.DateTime.TicksPerDay));
RDebugUtils.currentLine=86769725;
 //BA.debugLineNum = 86769725;BA.debugLine="wait for (InfoEnviosFecha(\"519390001\", LDia)) co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), __ref._infoenviosfecha /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"519390001",_ldia));
this.state = 32;
return;
case 32:
//C
this.state = 18;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=86769726;
 //BA.debugLineNum = 86769726;BA.debugLine="If Not(success) Then";
if (true) break;

case 18:
//if
this.state = 21;
if (parent.__c.Not(_success)) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=86769727;
 //BA.debugLineNum = 86769727;BA.debugLine="Exit";
this.state = 26;
if (true) break;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=86769729;
 //BA.debugLineNum = 86769729;BA.debugLine="wait for (InfoEnviosFecha(\"519390002\", LDia)) co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnactualizarinfotracking_click"), __ref._infoenviosfecha /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"519390002",_ldia));
this.state = 33;
return;
case 33:
//C
this.state = 22;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=86769730;
 //BA.debugLineNum = 86769730;BA.debugLine="If Not(success) Then";
if (true) break;

case 22:
//if
this.state = 25;
if (parent.__c.Not(_success)) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=86769731;
 //BA.debugLineNum = 86769731;BA.debugLine="Exit";
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 31;
;
RDebugUtils.currentLine=86769733;
 //BA.debugLineNum = 86769733;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando in";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando info expediciones fecha "+parent.__c.DateTime.Date(_ldia)+"..."));
 if (true) break;
if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=86769737;
 //BA.debugLineNum = 86769737;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=86769740;
 //BA.debugLineNum = 86769740;BA.debugLine="DateTime.dateformat=DateTimeAnt";
parent.__c.DateTime.setDateFormat(_datetimeant);
RDebugUtils.currentLine=86769742;
 //BA.debugLineNum = 86769742;BA.debugLine="TotalDatosPeriodo(lstInfoEnviosFechas)";
__ref._totaldatosperiodo /*void*/ (null,__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=86769744;
 //BA.debugLineNum = 86769744;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargacredenciales(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "cargacredenciales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargacredenciales", null));}
ResumableSub_CargaCredenciales rsub = new ResumableSub_CargaCredenciales(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaCredenciales extends BA.ResumableSub {
public ResumableSub_CargaCredenciales(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstresws = null;
anywheresoftware.b4a.objects.collections.Map _mdatosws = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86507522;
 //BA.debugLineNum = 86507522;BA.debugLine="CargaDatosWebServiceTransporte(17)   '17 es el ID";
__ref._cargadatoswebservicetransporte /*void*/ (null,(int) (17));
RDebugUtils.currentLine=86507523;
 //BA.debugLineNum = 86507523;BA.debugLine="Wait For CargaDatosWebServiceTransporte_Completed";
parent.__c.WaitFor("cargadatoswebservicetransporte_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "cargacredenciales"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_accion = (String) result[1];
_lstresws = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=86507524;
 //BA.debugLineNum = 86507524;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=86507525;
 //BA.debugLineNum = 86507525;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=86507527;
 //BA.debugLineNum = 86507527;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
_mdatosws = new anywheresoftware.b4a.objects.collections.Map();
_mdatosws = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstresws.Get((int) (0))));
RDebugUtils.currentLine=86507529;
 //BA.debugLineNum = 86507529;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
__ref._usuariows /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("UsuarioWS")));
RDebugUtils.currentLine=86507530;
 //BA.debugLineNum = 86507530;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
__ref._passwordws /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("PasswordWS")));
RDebugUtils.currentLine=86507531;
 //BA.debugLineNum = 86507531;BA.debugLine="Dim URLWS As String=mDatosWS.Get(\"URLWebServiceSe";
parent._urlws = BA.ObjectToString(_mdatosws.Get((Object)("URLWebServiceSeguimiento")));
RDebugUtils.currentLine=86507535;
 //BA.debugLineNum = 86507535;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Or URLWS=\"\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._usuariows /*String*/ ).equals("") || (__ref._passwordws /*String*/ ).equals("") || (__ref._urlws /*String*/ ).equals("")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=86507536;
 //BA.debugLineNum = 86507536;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=86507538;
 //BA.debugLineNum = 86507538;BA.debugLine="Return \"OK\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("OK"));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=86507540;
 //BA.debugLineNum = 86507540;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _infoenviosfecha(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _clifac,long _lfecha) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "infoenviosfecha", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "infoenviosfecha", new Object[] {_clifac,_lfecha}));}
ResumableSub_InfoEnviosFecha rsub = new ResumableSub_InfoEnviosFecha(this,__ref,_clifac,_lfecha);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InfoEnviosFecha extends BA.ResumableSub {
public ResumableSub_InfoEnviosFecha(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _clifac,long _lfecha) {
this.parent = parent;
this.__ref = __ref;
this._clifac = _clifac;
this._lfecha = _lfecha;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _clifac;
long _lfecha;
anywheresoftware.b4a.objects.collections.List _lstinfoenviosfecha = null;
String _wsresponse = "";
Object _msa = null;
int _result = 0;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _mresponse = null;
String _mensajeerror = "";
anywheresoftware.b4a.objects.collections.List _lstseguimientoenviofecha = null;
int _error = 0;
anywheresoftware.b4a.objects.collections.Map _mestadoactualenvio = null;
String _codigoestadoenvio = "";
String _nombreestadoenvio = "";
String _descripcionestadoenvio = "";
String[] _infoestado = null;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;
anywheresoftware.b4a.BA.IterableList group37;
int index37;
int groupLen37;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86835201;
 //BA.debugLineNum = 86835201;BA.debugLine="Dim lstInfoEnviosFecha As List";
_lstinfoenviosfecha = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=86835202;
 //BA.debugLineNum = 86835202;BA.debugLine="lstInfoEnviosFecha.Initialize";
_lstinfoenviosfecha.Initialize();
RDebugUtils.currentLine=86835203;
 //BA.debugLineNum = 86835203;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCur";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=86835204;
 //BA.debugLineNum = 86835204;BA.debugLine="wait for (InfoExpedicionesCorreosExpressEntreFech";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), __ref._infoexpedicionescorreosexpressentrefechas /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_clifac,_lfecha,_lfecha));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_wsresponse = (String) result[1];
;
RDebugUtils.currentLine=86835205;
 //BA.debugLineNum = 86835205;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCur";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=86835206;
 //BA.debugLineNum = 86835206;BA.debugLine="Log(\"WSResponse \" & WSResponse)";
parent.__c.LogImpl("886835206","WSResponse "+_wsresponse,0);
RDebugUtils.currentLine=86835207;
 //BA.debugLineNum = 86835207;BA.debugLine="If WSResponse.StartsWith(\"ERROR de comunicacion :";
if (true) break;

case 1:
//if
this.state = 4;
if (_wsresponse.startsWith("ERROR de comunicacion :")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=86835209;
 //BA.debugLineNum = 86835209;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=86835210;
 //BA.debugLineNum = 86835210;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(WSResponse,\"";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_wsresponse,"Error");
RDebugUtils.currentLine=86835211;
 //BA.debugLineNum = 86835211;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 4;
_result = (int) result[1];
;
RDebugUtils.currentLine=86835212;
 //BA.debugLineNum = 86835212;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=86835215;
 //BA.debugLineNum = 86835215;BA.debugLine="If WSResponse.StartsWith(\"Error carga credenciale";

case 4:
//if
this.state = 7;
if (_wsresponse.startsWith("Error carga credenciales")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=86835216;
 //BA.debugLineNum = 86835216;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=86835217;
 //BA.debugLineNum = 86835217;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible cargar los credenciales de acceso al web service de Correos Express","Error");
RDebugUtils.currentLine=86835218;
 //BA.debugLineNum = 86835218;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), _msa);
this.state = 31;
return;
case 31:
//C
this.state = 7;
_result = (int) result[1];
;
RDebugUtils.currentLine=86835219;
 //BA.debugLineNum = 86835219;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=86835223;
 //BA.debugLineNum = 86835223;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=86835224;
 //BA.debugLineNum = 86835224;BA.debugLine="parser.Initialize(WSResponse)";
_parser.Initialize(_wsresponse);
RDebugUtils.currentLine=86835225;
 //BA.debugLineNum = 86835225;BA.debugLine="Dim mResponse As Map = parser.NextObject";
_mresponse = new anywheresoftware.b4a.objects.collections.Map();
_mresponse = _parser.NextObject();
RDebugUtils.currentLine=86835226;
 //BA.debugLineNum = 86835226;BA.debugLine="Dim mensajeError As String = mResponse.Get(\"mensa";
_mensajeerror = BA.ObjectToString(_mresponse.Get((Object)("mensajeError")));
RDebugUtils.currentLine=86835227;
 //BA.debugLineNum = 86835227;BA.debugLine="Dim lstSeguimientoEnvioFecha As List = mResponse.";
_lstseguimientoenviofecha = new anywheresoftware.b4a.objects.collections.List();
_lstseguimientoenviofecha = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresponse.Get((Object)("seguimientoEnvioFecha"))));
RDebugUtils.currentLine=86835228;
 //BA.debugLineNum = 86835228;BA.debugLine="Dim error As Int = mResponse.Get(\"error\")";
_error = (int)(BA.ObjectToNumber(_mresponse.Get((Object)("error"))));
RDebugUtils.currentLine=86835230;
 //BA.debugLineNum = 86835230;BA.debugLine="If error<>0 And error <>402 Then";
if (true) break;

case 8:
//if
this.state = 11;
if (_error!=0 && _error!=402) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=86835231;
 //BA.debugLineNum = 86835231;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=86835232;
 //BA.debugLineNum = 86835232;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(mensajeError";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_mensajeerror,"Error");
RDebugUtils.currentLine=86835233;
 //BA.debugLineNum = 86835233;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infoenviosfecha"), _msa);
this.state = 32;
return;
case 32:
//C
this.state = 11;
_result = (int) result[1];
;
RDebugUtils.currentLine=86835234;
 //BA.debugLineNum = 86835234;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=86835243;
 //BA.debugLineNum = 86835243;BA.debugLine="For Each mEstadoActualEnvio As Map In lstSeguimie";

case 11:
//for
this.state = 28;
_mestadoactualenvio = new anywheresoftware.b4a.objects.collections.Map();
group31 = _lstseguimientoenviofecha;
index31 = 0;
groupLen31 = group31.getSize();
this.state = 33;
if (true) break;

case 33:
//C
this.state = 28;
if (index31 < groupLen31) {
this.state = 13;
_mestadoactualenvio = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group31.Get(index31)));}
if (true) break;

case 34:
//C
this.state = 33;
index31++;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=86835246;
 //BA.debugLineNum = 86835246;BA.debugLine="Dim CodigoEstadoEnvio As String=mEstadoActualEnv";
_codigoestadoenvio = BA.ObjectToString(_mestadoactualenvio.Get((Object)("estadoEnvio")));
RDebugUtils.currentLine=86835247;
 //BA.debugLineNum = 86835247;BA.debugLine="mEstadoActualEnvio.Put(\"EstadoEnvio\",CodigoEstad";
_mestadoactualenvio.Put((Object)("EstadoEnvio"),(Object)(_codigoestadoenvio));
RDebugUtils.currentLine=86835248;
 //BA.debugLineNum = 86835248;BA.debugLine="mEstadoActualEnvio.Put(\"NumEnvio\",mEstadoActualE";
_mestadoactualenvio.Put((Object)("NumEnvio"),_mestadoactualenvio.Get((Object)("numEnvio")));
RDebugUtils.currentLine=86835249;
 //BA.debugLineNum = 86835249;BA.debugLine="Dim NombreEstadoEnvio As String";
_nombreestadoenvio = "";
RDebugUtils.currentLine=86835250;
 //BA.debugLineNum = 86835250;BA.debugLine="Dim DescripcionEstadoEnvio As String";
_descripcionestadoenvio = "";
RDebugUtils.currentLine=86835251;
 //BA.debugLineNum = 86835251;BA.debugLine="For Each InfoEstado() As String In cmAuxCorreosE";
if (true) break;

case 14:
//for
this.state = 21;
group37 = parent._cmauxcorreosexpress._lstestadoscorreosexpress /*anywheresoftware.b4a.objects.collections.List*/ ;
index37 = 0;
groupLen37 = group37.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 21;
if (index37 < groupLen37) {
this.state = 16;
_infoestado = (String[])(group37.Get(index37));}
if (true) break;

case 36:
//C
this.state = 35;
index37++;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=86835252;
 //BA.debugLineNum = 86835252;BA.debugLine="If InfoEstado(0)=CodigoEstadoEnvio Then";
if (true) break;

case 17:
//if
this.state = 20;
if ((_infoestado[(int) (0)]).equals(_codigoestadoenvio)) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=86835253;
 //BA.debugLineNum = 86835253;BA.debugLine="NombreEstadoEnvio=InfoEstado(1)";
_nombreestadoenvio = _infoestado[(int) (1)];
RDebugUtils.currentLine=86835254;
 //BA.debugLineNum = 86835254;BA.debugLine="DescripcionEstadoEnvio=InfoEstado(2)";
_descripcionestadoenvio = _infoestado[(int) (2)];
RDebugUtils.currentLine=86835255;
 //BA.debugLineNum = 86835255;BA.debugLine="mEstadoActualEnvio.Put(\"NombreEstadoEnvio\",Nom";
_mestadoactualenvio.Put((Object)("NombreEstadoEnvio"),(Object)(_nombreestadoenvio));
RDebugUtils.currentLine=86835256;
 //BA.debugLineNum = 86835256;BA.debugLine="mEstadoActualEnvio.Put(\"DescripcionEstadoEnvio";
_mestadoactualenvio.Put((Object)("DescripcionEstadoEnvio"),(Object)(_descripcionestadoenvio));
RDebugUtils.currentLine=86835257;
 //BA.debugLineNum = 86835257;BA.debugLine="Exit";
this.state = 21;
if (true) break;
 if (true) break;

case 20:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=86835260;
 //BA.debugLineNum = 86835260;BA.debugLine="mEstadoActualEnvio.Put(\"FechaEstadoEnvio\",LFecha";
_mestadoactualenvio.Put((Object)("FechaEstadoEnvio"),(Object)(_lfecha));
RDebugUtils.currentLine=86835265;
 //BA.debugLineNum = 86835265;BA.debugLine="If mEstadoActualEnvio.ContainsKey(\"referencia\")=";
if (true) break;

case 22:
//if
this.state = 27;
if (_mestadoactualenvio.ContainsKey((Object)("referencia"))==parent.__c.False) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
RDebugUtils.currentLine=86835266;
 //BA.debugLineNum = 86835266;BA.debugLine="mEstadoActualEnvio.put(\"Referencia\",\"\")";
_mestadoactualenvio.Put((Object)("Referencia"),(Object)(""));
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=86835268;
 //BA.debugLineNum = 86835268;BA.debugLine="mEstadoActualEnvio.Put(\"Referencia\",jamTableVie";
_mestadoactualenvio.Put((Object)("Referencia"),(Object)(__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._fixnull /*String*/ (null,_mestadoactualenvio.Get((Object)("referencia")))));
 if (true) break;

case 27:
//C
this.state = 34;
;
RDebugUtils.currentLine=86835272;
 //BA.debugLineNum = 86835272;BA.debugLine="mEstadoActualEnvio.Put(\"Cliente\",\"\")";
_mestadoactualenvio.Put((Object)("Cliente"),(Object)(""));
RDebugUtils.currentLine=86835273;
 //BA.debugLineNum = 86835273;BA.debugLine="mEstadoActualEnvio.Put(\"NombreCliente\",\"\")";
_mestadoactualenvio.Put((Object)("NombreCliente"),(Object)(""));
RDebugUtils.currentLine=86835274;
 //BA.debugLineNum = 86835274;BA.debugLine="mEstadoActualEnvio.Put(\"NombreResponsableCuenta\"";
_mestadoactualenvio.Put((Object)("NombreResponsableCuenta"),(Object)(""));
RDebugUtils.currentLine=86835275;
 //BA.debugLineNum = 86835275;BA.debugLine="lstInfoEnviosFechas.Add(mEstadoActualEnvio)";
__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mestadoactualenvio.getObject()));
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=86835278;
 //BA.debugLineNum = 86835278;BA.debugLine="Log(\"lstInfoEnviosFechas \" & lstInfoEnviosFechas)";
parent.__c.LogImpl("886835278","lstInfoEnviosFechas "+BA.ObjectToString(__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ ),0);
RDebugUtils.currentLine=86835280;
 //BA.debugLineNum = 86835280;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=86835282;
 //BA.debugLineNum = 86835282;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _totaldatosperiodo(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,anywheresoftware.b4a.objects.collections.List _lsttotalinfoenviosfechas) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "totaldatosperiodo", false))
	 {Debug.delegate(ba, "totaldatosperiodo", new Object[] {_lsttotalinfoenviosfechas}); return;}
ResumableSub_TotalDatosPeriodo rsub = new ResumableSub_TotalDatosPeriodo(this,__ref,_lsttotalinfoenviosfechas);
rsub.resume(ba, null);
}
public static class ResumableSub_TotalDatosPeriodo extends BA.ResumableSub {
public ResumableSub_TotalDatosPeriodo(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,anywheresoftware.b4a.objects.collections.List _lsttotalinfoenviosfechas) {
this.parent = parent;
this.__ref = __ref;
this._lsttotalinfoenviosfechas = _lsttotalinfoenviosfechas;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
anywheresoftware.b4a.objects.collections.List _lsttotalinfoenviosfechas;
Object _msa = null;
int _rint = 0;
boolean _rbool = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86966274;
 //BA.debugLineNum = 86966274;BA.debugLine="EliminarEnviosSinRecepcionErroneos";
__ref._eliminarenviossinrecepcionerroneos /*String*/ (null);
RDebugUtils.currentLine=86966276;
 //BA.debugLineNum = 86966276;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualizar";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Actualizar información documentos navision?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=86966277;
 //BA.debugLineNum = 86966277;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=86966280;
 //BA.debugLineNum = 86966280;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=86966281;
 //BA.debugLineNum = 86966281;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=86966282;
 //BA.debugLineNum = 86966282;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCu";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._setmousecursorwaitdeshabilitartableview /*String*/ (null);
RDebugUtils.currentLine=86966283;
 //BA.debugLineNum = 86966283;BA.debugLine="Wait For(InfoDocsNav) complete (rBool As Boolean";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), __ref._infodocsnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 21;
return;
case 21:
//C
this.state = 4;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=86966284;
 //BA.debugLineNum = 86966284;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.SetMouseCu";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=86966285;
 //BA.debugLineNum = 86966285;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=86966286;
 //BA.debugLineNum = 86966286;BA.debugLine="If rBool=False Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_rbool==parent.__c.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=86966288;
 //BA.debugLineNum = 86966288;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha act";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha actualizado la informacion de documentos NAV.","Error");
RDebugUtils.currentLine=86966289;
 //BA.debugLineNum = 86966289;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 7;
;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=86966293;
 //BA.debugLineNum = 86966293;BA.debugLine="Dim rSub As ResumableSub=jamTableViewInfoTracking";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_lsttotalinfoenviosfechas.getObject()));
RDebugUtils.currentLine=86966294;
 //BA.debugLineNum = 86966294;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _rsub);
this.state = 23;
return;
case 23:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=86966295;
 //BA.debugLineNum = 86966295;BA.debugLine="lstTotalInfoEnviosFechas.Initialize";
_lsttotalinfoenviosfechas.Initialize();
RDebugUtils.currentLine=86966296;
 //BA.debugLineNum = 86966296;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 19;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=86966297;
 //BA.debugLineNum = 86966297;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 15;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=86966298;
 //BA.debugLineNum = 86966298;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=86966299;
 //BA.debugLineNum = 86966299;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 15;
;
RDebugUtils.currentLine=86966300;
 //BA.debugLineNum = 86966300;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=86966302;
 //BA.debugLineNum = 86966302;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 15:
//if
this.state = 18;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=86966303;
 //BA.debugLineNum = 86966303;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=86966304;
 //BA.debugLineNum = 86966304;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "totaldatosperiodo"), _msa);
this.state = 25;
return;
case 25:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=86966308;
 //BA.debugLineNum = 86966308;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=86310912;
 //BA.debugLineNum = 86310912;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=86310913;
 //BA.debugLineNum = 86310913;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=86310914;
 //BA.debugLineNum = 86310914;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=86376448;
 //BA.debugLineNum = 86376448;BA.debugLine="Sub SalirModulo";
RDebugUtils.currentLine=86376449;
 //BA.debugLineNum = 86376449;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.GuardarConf";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=86376450;
 //BA.debugLineNum = 86376450;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.LimpiarTabl";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=86376451;
 //BA.debugLineNum = 86376451;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=86376452;
 //BA.debugLineNum = 86376452;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=86376453;
 //BA.debugLineNum = 86376453;BA.debugLine="End Sub";
return "";
}
public void  _btnselfechafinal_click(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "btnselfechafinal_click", false))
	 {Debug.delegate(ba, "btnselfechafinal_click", null); return;}
ResumableSub_btnSelFechaFinal_Click rsub = new ResumableSub_btnSelFechaFinal_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFechaFinal_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaFinal_Click(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _datetimeant = "";
b4j.docU.b4xdatetemplate _b4xdate = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
long _fechafinprev = 0L;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86704129;
 //BA.debugLineNum = 86704129;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
_datetimeant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=86704130;
 //BA.debugLineNum = 86704130;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=86704131;
 //BA.debugLineNum = 86704131;BA.debugLine="Dim B4XDate As B4XDateTemplate";
_b4xdate = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=86704132;
 //BA.debugLineNum = 86704132;BA.debugLine="B4XDate.Initialize";
_b4xdate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=86704133;
 //BA.debugLineNum = 86704133;BA.debugLine="B4XDate.FirstDay=1";
_b4xdate._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=86704134;
 //BA.debugLineNum = 86704134;BA.debugLine="If txtFechaFinal.Text<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=86704135;
 //BA.debugLineNum = 86704135;BA.debugLine="B4XDate.Date=DateTime.DateParse(txtFechaFinal.te";
_b4xdate._setdate /*long*/ (null,parent.__c.DateTime.DateParse(__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=86704137;
 //BA.debugLineNum = 86704137;BA.debugLine="B4XDate.Date=DateTime.now";
_b4xdate._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=86704139;
 //BA.debugLineNum = 86704139;BA.debugLine="Dialog.Title=\"Selecciona Fecha Final\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Fecha Final");
RDebugUtils.currentLine=86704140;
 //BA.debugLineNum = 86704140;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdate),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=86704141;
 //BA.debugLineNum = 86704141;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=86704142;
 //BA.debugLineNum = 86704142;BA.debugLine="bOk.Left=bOk.Left-20dip";
_bok.setLeft(_bok.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=86704143;
 //BA.debugLineNum = 86704143;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=86704144;
 //BA.debugLineNum = 86704144;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=86704145;
 //BA.debugLineNum = 86704145;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=86704146;
 //BA.debugLineNum = 86704146;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechafinal_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=86704147;
 //BA.debugLineNum = 86704147;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=86704148;
 //BA.debugLineNum = 86704148;BA.debugLine="Dim FechaFinPrev As Long=B4XDate.Date";
_fechafinprev = _b4xdate._getdate /*long*/ (null);
RDebugUtils.currentLine=86704149;
 //BA.debugLineNum = 86704149;BA.debugLine="If txtfechaInicial.Text<>\"\" Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=86704150;
 //BA.debugLineNum = 86704150;BA.debugLine="If DateTime.DateParse(txtfechaInicial.Text)>Fech";
if (true) break;

case 16:
//if
this.state = 19;
if (parent.__c.DateTime.DateParse(__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())>_fechafinprev) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=86704151;
 //BA.debugLineNum = 86704151;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fin";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha final no puede ser anterior a la inicial.","Error");
RDebugUtils.currentLine=86704152;
 //BA.debugLineNum = 86704152;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechafinal_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 19;
;
RDebugUtils.currentLine=86704153;
 //BA.debugLineNum = 86704153;BA.debugLine="Return";
if (true) return ;
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
RDebugUtils.currentLine=86704156;
 //BA.debugLineNum = 86704156;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinPrev)";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(_fechafinprev));
RDebugUtils.currentLine=86704157;
 //BA.debugLineNum = 86704157;BA.debugLine="DateTime.DateFormat=DateTimeAnt";
parent.__c.DateTime.setDateFormat(_datetimeant);
RDebugUtils.currentLine=86704158;
 //BA.debugLineNum = 86704158;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselfechainicial_click(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "btnselfechainicial_click", false))
	 {Debug.delegate(ba, "btnselfechainicial_click", null); return;}
ResumableSub_btnSelFechaInicial_Click rsub = new ResumableSub_btnSelFechaInicial_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFechaInicial_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaInicial_Click(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _datetimeant = "";
b4j.docU.b4xdatetemplate _b4xdate = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
long _fechainprev = 0L;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86638593;
 //BA.debugLineNum = 86638593;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
_datetimeant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=86638594;
 //BA.debugLineNum = 86638594;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=86638595;
 //BA.debugLineNum = 86638595;BA.debugLine="Dim B4XDate As B4XDateTemplate";
_b4xdate = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=86638596;
 //BA.debugLineNum = 86638596;BA.debugLine="B4XDate.Initialize";
_b4xdate._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=86638597;
 //BA.debugLineNum = 86638597;BA.debugLine="B4XDate.FirstDay=1";
_b4xdate._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=86638599;
 //BA.debugLineNum = 86638599;BA.debugLine="If txtfechaInicial.Text<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=86638600;
 //BA.debugLineNum = 86638600;BA.debugLine="B4XDate.Date=DateTime.DateParse(txtfechaInicial.";
_b4xdate._setdate /*long*/ (null,parent.__c.DateTime.DateParse(__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=86638602;
 //BA.debugLineNum = 86638602;BA.debugLine="B4XDate.Date=DateTime.now";
_b4xdate._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=86638606;
 //BA.debugLineNum = 86638606;BA.debugLine="Dialog.Title=\"Selecciona Fecha Inicial\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Fecha Inicial");
RDebugUtils.currentLine=86638607;
 //BA.debugLineNum = 86638607;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdate),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=86638608;
 //BA.debugLineNum = 86638608;BA.debugLine="Dim bOk As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=86638609;
 //BA.debugLineNum = 86638609;BA.debugLine="bOk.Left=bOk.Left-20dip";
_bok.setLeft(_bok.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=86638610;
 //BA.debugLineNum = 86638610;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=86638611;
 //BA.debugLineNum = 86638611;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=86638612;
 //BA.debugLineNum = 86638612;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=86638613;
 //BA.debugLineNum = 86638613;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechainicial_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=86638614;
 //BA.debugLineNum = 86638614;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 7:
//if
this.state = 12;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=86638615;
 //BA.debugLineNum = 86638615;BA.debugLine="Dim FechaInPrev As Long=B4XDate.Date";
_fechainprev = _b4xdate._getdate /*long*/ (null);
RDebugUtils.currentLine=86638616;
 //BA.debugLineNum = 86638616;BA.debugLine="If txtFechaFinal.Text<>\"\" Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=86638617;
 //BA.debugLineNum = 86638617;BA.debugLine="If DateTime.DateParse(txtFechaFinal.Text)<FechaI";
if (true) break;

case 16:
//if
this.state = 19;
if (parent.__c.DateTime.DateParse(__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())<_fechainprev) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=86638618;
 //BA.debugLineNum = 86638618;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha ini";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha inicial no puede ser posterior a la final.","Error");
RDebugUtils.currentLine=86638619;
 //BA.debugLineNum = 86638619;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "btnselfechainicial_click"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 19;
;
RDebugUtils.currentLine=86638620;
 //BA.debugLineNum = 86638620;BA.debugLine="Return";
if (true) return ;
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
RDebugUtils.currentLine=86638623;
 //BA.debugLineNum = 86638623;BA.debugLine="txtfechaInicial.Text=DateTime.Date(FechaInPrev)";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(_fechainprev));
RDebugUtils.currentLine=86638624;
 //BA.debugLineNum = 86638624;BA.debugLine="DateTime.DateFormat=DateTimeAnt";
parent.__c.DateTime.setDateFormat(_datetimeant);
RDebugUtils.currentLine=86638625;
 //BA.debugLineNum = 86638625;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _cargadatoswebservicetransporte(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,int _idtransportista) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "cargadatoswebservicetransporte", false))
	 {Debug.delegate(ba, "cargadatoswebservicetransporte", new Object[] {_idtransportista}); return;}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(this,__ref,_idtransportista);
rsub.resume(ba, null);
}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,int _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
int _idtransportista;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=86573058;
 //BA.debugLineNum = 86573058;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=86573059;
 //BA.debugLineNum = 86573059;BA.debugLine="Dim lstRes As List";
_lstres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=86573060;
 //BA.debugLineNum = 86573060;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=86573061;
 //BA.debugLineNum = 86573061;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
_comandojrdc = "DatosWebServiceTransporte";
RDebugUtils.currentLine=86573062;
 //BA.debugLineNum = 86573062;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
parent._jrdcquery._datosjrdc /*void*/ ("http://192.168.10.20:17179/rdc",_comandojrdc,(Object[])(new String[]{BA.NumberToString(_idtransportista)}),parent);
RDebugUtils.currentLine=86573063;
 //BA.debugLineNum = 86573063;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=86573064;
 //BA.debugLineNum = 86573064;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=86573065;
 //BA.debugLineNum = 86573065;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=86573067;
 //BA.debugLineNum = 86573067;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=86573068;
 //BA.debugLineNum = 86573068;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=86573070;
 //BA.debugLineNum = 86573070;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=86573071;
 //BA.debugLineNum = 86573071;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=86573074;
 //BA.debugLineNum = 86573074;BA.debugLine="CallSubDelayed3(Me,\"CargaDatosWebServiceTransport";
parent.__c.CallSubDelayed3(ba,parent,"CargaDatosWebServiceTransporte_Completed",(Object)(_accion),(Object)(_lstres));
RDebugUtils.currentLine=86573075;
 //BA.debugLineNum = 86573075;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
RDebugUtils.currentLine=85917696;
 //BA.debugLineNum = 85917696;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=85917697;
 //BA.debugLineNum = 85917697;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=85917698;
 //BA.debugLineNum = 85917698;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=85917699;
 //BA.debugLineNum = 85917699;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=85917701;
 //BA.debugLineNum = 85917701;BA.debugLine="Private UsuarioWS As String";
_usuariows = "";
RDebugUtils.currentLine=85917702;
 //BA.debugLineNum = 85917702;BA.debugLine="Private PasswordWs As String";
_passwordws = "";
RDebugUtils.currentLine=85917703;
 //BA.debugLineNum = 85917703;BA.debugLine="Private URLWS As String";
_urlws = "";
RDebugUtils.currentLine=85917705;
 //BA.debugLineNum = 85917705;BA.debugLine="Private txtfechaInicial As TextField";
_txtfechainicial = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=85917706;
 //BA.debugLineNum = 85917706;BA.debugLine="Private btnSelFechaInicial As Button";
_btnselfechainicial = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=85917707;
 //BA.debugLineNum = 85917707;BA.debugLine="Private txtFechaFinal As TextField";
_txtfechafinal = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=85917708;
 //BA.debugLineNum = 85917708;BA.debugLine="Private btnSelFechaFinal As Button";
_btnselfechafinal = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=85917710;
 //BA.debugLineNum = 85917710;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=85917714;
 //BA.debugLineNum = 85917714;BA.debugLine="Private jamTableViewInfoTrackingEnviosPeriodo As";
_jamtableviewinfotrackingenviosperiodo = new b4j.docU.jamtableview();
RDebugUtils.currentLine=85917716;
 //BA.debugLineNum = 85917716;BA.debugLine="Private lstInfoEnviosFechas As List";
_lstinfoenviosfechas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=85917718;
 //BA.debugLineNum = 85917718;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=85917720;
 //BA.debugLineNum = 85917720;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=85917722;
 //BA.debugLineNum = 85917722;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _clienteresponsablecuentadocumento(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _doc) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "clienteresponsablecuentadocumento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "clienteresponsablecuentadocumento", new Object[] {_doc}));}
ResumableSub_ClienteResponsableCuentaDocumento rsub = new ResumableSub_ClienteResponsableCuentaDocumento(this,__ref,_doc);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ClienteResponsableCuentaDocumento extends BA.ResumableSub {
public ResumableSub_ClienteResponsableCuentaDocumento(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _doc;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87621633;
 //BA.debugLineNum = 87621633;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=87621636;
 //BA.debugLineNum = 87621636;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87621637;
 //BA.debugLineNum = 87621637;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=87621640;
 //BA.debugLineNum = 87621640;BA.debugLine="Dim comando As String";
_comando = "";
RDebugUtils.currentLine=87621641;
 //BA.debugLineNum = 87621641;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(parent.__c.True,_doc.startsWith("ALBV"),_doc.startsWith("RT"))) {
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
RDebugUtils.currentLine=87621643;
 //BA.debugLineNum = 87621643;BA.debugLine="comando=\"ClienteResponsableCuentaALBV\"";
_comando = "ClienteResponsableCuentaALBV";
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=87621645;
 //BA.debugLineNum = 87621645;BA.debugLine="comando=\"ClienteResponsableCuentaRT\"";
_comando = "ClienteResponsableCuentaRT";
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=87621647;
 //BA.debugLineNum = 87621647;BA.debugLine="Accion=\"ErrTipoDoc\"";
_accion = "ErrTipoDoc";
RDebugUtils.currentLine=87621648;
 //BA.debugLineNum = 87621648;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=87621649;
 //BA.debugLineNum = 87621649;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=87621651;
 //BA.debugLineNum = 87621651;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_doc)},parent);
RDebugUtils.currentLine=87621653;
 //BA.debugLineNum = 87621653;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "clienteresponsablecuentadocumento"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87621654;
 //BA.debugLineNum = 87621654;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 9:
//if
this.state = 20;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 20;
RDebugUtils.currentLine=87621656;
 //BA.debugLineNum = 87621656;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=87621657;
 //BA.debugLineNum = 87621657;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "clienteresponsablecuentadocumento"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
RDebugUtils.currentLine=87621658;
 //BA.debugLineNum = 87621658;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=87621659;
 //BA.debugLineNum = 87621659;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=87621662;
 //BA.debugLineNum = 87621662;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 14:
//if
this.state = 19;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
RDebugUtils.currentLine=87621663;
 //BA.debugLineNum = 87621663;BA.debugLine="Accion=\"SinResultado\"";
_accion = "SinResultado";
RDebugUtils.currentLine=87621664;
 //BA.debugLineNum = 87621664;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=87621666;
 //BA.debugLineNum = 87621666;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=87621667;
 //BA.debugLineNum = 87621667;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=87621668;
 //BA.debugLineNum = 87621668;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=87621669;
 //BA.debugLineNum = 87621669;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
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
RDebugUtils.currentLine=87621673;
 //BA.debugLineNum = 87621673;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=87621674;
 //BA.debugLineNum = 87621674;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _creaciontablassqlite(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=86179840;
 //BA.debugLineNum = 86179840;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=86179841;
 //BA.debugLineNum = 86179841;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblDocumentosExpediciones"}))));
RDebugUtils.currentLine=86179842;
 //BA.debugLineNum = 86179842;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=86179843;
 //BA.debugLineNum = 86179843;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDocumentosExped";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblDocumentosExpediciones");
 };
RDebugUtils.currentLine=86179845;
 //BA.debugLineNum = 86179845;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=86179846;
 //BA.debugLineNum = 86179846;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=86179847;
 //BA.debugLineNum = 86179847;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblDocumentosExpediciones (");
RDebugUtils.currentLine=86179849;
 //BA.debugLineNum = 86179849;BA.debugLine="sbCrearTabla.Append(\"NumExpedicion TEXT COLLATE N";
_sbcreartabla.Append("NumExpedicion TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=86179850;
 //BA.debugLineNum = 86179850;BA.debugLine="sbCrearTabla.Append(\"Referencia TEXT COLLATE NOCA";
_sbcreartabla.Append("Referencia TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=86179851;
 //BA.debugLineNum = 86179851;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=86179852;
 //BA.debugLineNum = 86179852;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=86179853;
 //BA.debugLineNum = 86179853;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=86179854;
 //BA.debugLineNum = 86179854;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '')");
RDebugUtils.currentLine=86179855;
 //BA.debugLineNum = 86179855;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=86179858;
 //BA.debugLineNum = 86179858;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _creartablatemporaldocumentosreferenciastte(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "creartablatemporaldocumentosreferenciastte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "creartablatemporaldocumentosreferenciastte", null));}
ResumableSub_CrearTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87425025;
 //BA.debugLineNum = 87425025;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=87425028;
 //BA.debugLineNum = 87425028;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87425029;
 //BA.debugLineNum = 87425029;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=87425032;
 //BA.debugLineNum = 87425032;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"CrearTablaTemporalDocumentosReferenciasTte",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=87425034;
 //BA.debugLineNum = 87425034;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "creartablatemporaldocumentosreferenciastte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87425035;
 //BA.debugLineNum = 87425035;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 18;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=87425036;
 //BA.debugLineNum = 87425036;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query CrearTablaTemporalDocumentosReferenciasTte","Error");
RDebugUtils.currentLine=87425037;
 //BA.debugLineNum = 87425037;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=87425038;
 //BA.debugLineNum = 87425038;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=87425039;
 //BA.debugLineNum = 87425039;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=87425042;
 //BA.debugLineNum = 87425042;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 17;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 17;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=87425045;
 //BA.debugLineNum = 87425045;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=87425046;
 //BA.debugLineNum = 87425046;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=87425047;
 //BA.debugLineNum = 87425047;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=87425048;
 //BA.debugLineNum = 87425048;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.toUpperCase().startsWith("ERR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=87425049;
 //BA.debugLineNum = 87425049;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP CrearTablaTemporalDocumentosReferenciasTte"+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=87425050;
 //BA.debugLineNum = 87425050;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=87425051;
 //BA.debugLineNum = 87425051;BA.debugLine="Accion=\"ERROR SP\"";
_accion = "ERROR SP";
RDebugUtils.currentLine=87425052;
 //BA.debugLineNum = 87425052;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=87425054;
 //BA.debugLineNum = 87425054;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=87425055;
 //BA.debugLineNum = 87425055;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
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
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=87425059;
 //BA.debugLineNum = 87425059;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=87425060;
 //BA.debugLineNum = 87425060;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpedicionescorreosperiodobatch(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "documentosexpedicionescorreosperiodobatch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpedicionescorreosperiodobatch", null));}
ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch rsub = new ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesCorreosPeriodoBatch(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
anywheresoftware.b4a.objects.collections.Map _mie = null;
String _refenvio = "";
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87359490;
 //BA.debugLineNum = 87359490;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87359491;
 //BA.debugLineNum = 87359491;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=87359492;
 //BA.debugLineNum = 87359492;BA.debugLine="mResult.Put(\"Success\", False)";
_mresult.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=87359497;
 //BA.debugLineNum = 87359497;BA.debugLine="Wait For(CrearTablaTemporalDocumentosReferenciasT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), __ref._creartablatemporaldocumentosreferenciastte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87359498;
 //BA.debugLineNum = 87359498;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=87359499;
 //BA.debugLineNum = 87359499;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
if (true) break;

case 1:
//if
this.state = 6;
if ((_accion).equals("OK") == false) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=87359502;
 //BA.debugLineNum = 87359502;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=87359503;
 //BA.debugLineNum = 87359503;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=87359511;
 //BA.debugLineNum = 87359511;BA.debugLine="For Each mIE As Map In lstInfoEnviosFechas";
if (true) break;

case 7:
//for
this.state = 14;
_mie = new anywheresoftware.b4a.objects.collections.Map();
group9 = __ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ ;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 26;
if (true) break;

case 26:
//C
this.state = 14;
if (index9 < groupLen9) {
this.state = 9;
_mie = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));}
if (true) break;

case 27:
//C
this.state = 26;
index9++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=87359514;
 //BA.debugLineNum = 87359514;BA.debugLine="Log(\"Referencia \" & mIE.Get(\"Referencia\"))";
parent.__c.LogImpl("887359514","Referencia "+BA.ObjectToString(_mie.Get((Object)("Referencia"))),0);
RDebugUtils.currentLine=87359517;
 //BA.debugLineNum = 87359517;BA.debugLine="Dim refEnvio As String=mIE.Get(\"Referencia\")";
_refenvio = BA.ObjectToString(_mie.Get((Object)("Referencia")));
RDebugUtils.currentLine=87359518;
 //BA.debugLineNum = 87359518;BA.debugLine="If refEnvio.StartsWith(\"EXP\")=False And refEnvio";
if (true) break;

case 10:
//if
this.state = 13;
if (_refenvio.startsWith("EXP")==parent.__c.False && (_refenvio).equals("") == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=87359519;
 //BA.debugLineNum = 87359519;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarDatosTablaTemporalDocumentosReferenciasTte",new Object[]{(Object)(_refenvio)});
RDebugUtils.currentLine=87359520;
 //BA.debugLineNum = 87359520;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
 if (true) break;

case 13:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=87359526;
 //BA.debugLineNum = 87359526;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 28;
return;
case 28:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=87359527;
 //BA.debugLineNum = 87359527;BA.debugLine="If Success=False Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_success==parent.__c.False) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=87359528;
 //BA.debugLineNum = 87359528;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.","Error");
RDebugUtils.currentLine=87359529;
 //BA.debugLineNum = 87359529;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 18;
;
RDebugUtils.currentLine=87359530;
 //BA.debugLineNum = 87359530;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=87359533;
 //BA.debugLineNum = 87359533;BA.debugLine="Wait For(DocumentosExpedicionesPeriodo) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionescorreosperiodobatch"), __ref._documentosexpedicionesperiodo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 19;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87359534;
 //BA.debugLineNum = 87359534;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=87359535;
 //BA.debugLineNum = 87359535;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
if (true) break;

case 19:
//if
this.state = 24;
if ((_accion).equals("OK") == false) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=87359537;
 //BA.debugLineNum = 87359537;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=87359538;
 //BA.debugLineNum = 87359538;BA.debugLine="mResult.put(\"Success\", True)";
_mresult.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=87359539;
 //BA.debugLineNum = 87359539;BA.debugLine="mResult.put(\"lstReg\", lstReg)";
_mresult.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=87359541;
 //BA.debugLineNum = 87359541;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=87359542;
 //BA.debugLineNum = 87359542;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpedicionesperiodo(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "documentosexpedicionesperiodo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpedicionesperiodo", null));}
ResumableSub_DocumentosExpedicionesPeriodo rsub = new ResumableSub_DocumentosExpedicionesPeriodo(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicionesPeriodo extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPeriodo(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87490561;
 //BA.debugLineNum = 87490561;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=87490564;
 //BA.debugLineNum = 87490564;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87490565;
 //BA.debugLineNum = 87490565;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=87490568;
 //BA.debugLineNum = 87490568;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"DocumentosReferenciasExpedicionesTte",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=87490570;
 //BA.debugLineNum = 87490570;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionesperiodo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87490571;
 //BA.debugLineNum = 87490571;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=87490572;
 //BA.debugLineNum = 87490572;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query DocumentosReferenciasExpedicionesTte","Error");
RDebugUtils.currentLine=87490573;
 //BA.debugLineNum = 87490573;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "documentosexpedicionesperiodo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=87490574;
 //BA.debugLineNum = 87490574;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=87490575;
 //BA.debugLineNum = 87490575;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=87490578;
 //BA.debugLineNum = 87490578;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=87490579;
 //BA.debugLineNum = 87490579;BA.debugLine="Accion=\"SinDocumentos\"";
_accion = "SinDocumentos";
RDebugUtils.currentLine=87490580;
 //BA.debugLineNum = 87490580;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=87490582;
 //BA.debugLineNum = 87490582;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=87490583;
 //BA.debugLineNum = 87490583;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=87490584;
 //BA.debugLineNum = 87490584;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=87490585;
 //BA.debugLineNum = 87490585;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=87490588;
 //BA.debugLineNum = 87490588;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=87490589;
 //BA.debugLineNum = 87490589;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _eliminarenviossinrecepcionerroneos(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "eliminarenviossinrecepcionerroneos", false))
	 {return ((String) Debug.delegate(ba, "eliminarenviossinrecepcionerroneos", null));}
anywheresoftware.b4a.objects.collections.List _lstenviossinrecepcion = null;
anywheresoftware.b4a.objects.collections.List _lstenviossinrecepcioneliminar = null;
anywheresoftware.b4a.objects.collections.Map _mestenv = null;
String _ref = "";
int _i = 0;
RDebugUtils.currentLine=86900736;
 //BA.debugLineNum = 86900736;BA.debugLine="Sub EliminarEnviosSinRecepcionErroneos";
RDebugUtils.currentLine=86900737;
 //BA.debugLineNum = 86900737;BA.debugLine="Dim lstEnviosSinRecepcion As List";
_lstenviossinrecepcion = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=86900738;
 //BA.debugLineNum = 86900738;BA.debugLine="lstEnviosSinRecepcion.Initialize";
_lstenviossinrecepcion.Initialize();
RDebugUtils.currentLine=86900739;
 //BA.debugLineNum = 86900739;BA.debugLine="Dim lstEnviosSinRecepcionEliminar As List";
_lstenviossinrecepcioneliminar = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=86900740;
 //BA.debugLineNum = 86900740;BA.debugLine="lstEnviosSinRecepcionEliminar.Initialize";
_lstenviossinrecepcioneliminar.Initialize();
RDebugUtils.currentLine=86900741;
 //BA.debugLineNum = 86900741;BA.debugLine="For Each mEstEnv As Map In lstInfoEnviosFechas";
_mestenv = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_mestenv = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group5.Get(index5)));
RDebugUtils.currentLine=86900742;
 //BA.debugLineNum = 86900742;BA.debugLine="If 1=mEstEnv.Get(\"estadoEnvio\") Then";
if (1==(double)(BA.ObjectToNumber(_mestenv.Get((Object)("estadoEnvio"))))) { 
RDebugUtils.currentLine=86900743;
 //BA.debugLineNum = 86900743;BA.debugLine="lstEnviosSinRecepcion.add(mEstEnv.Get(\"referenc";
_lstenviossinrecepcion.Add(_mestenv.Get((Object)("referencia")));
 }else {
RDebugUtils.currentLine=86900745;
 //BA.debugLineNum = 86900745;BA.debugLine="If lstEnviosSinRecepcion.IndexOf(mEstEnv.Get(\"r";
if (_lstenviossinrecepcion.IndexOf(_mestenv.Get((Object)("referencia")))>-1) { 
RDebugUtils.currentLine=86900746;
 //BA.debugLineNum = 86900746;BA.debugLine="lstEnviosSinRecepcionEliminar.Add(mEstEnv.Get(";
_lstenviossinrecepcioneliminar.Add(_mestenv.Get((Object)("referencia")));
 };
 };
 }
};
RDebugUtils.currentLine=86900750;
 //BA.debugLineNum = 86900750;BA.debugLine="For Each ref As String In lstEnviosSinRecepcionEl";
{
final anywheresoftware.b4a.BA.IterableList group14 = _lstenviossinrecepcioneliminar;
final int groupLen14 = group14.getSize()
;int index14 = 0;
;
for (; index14 < groupLen14;index14++){
_ref = BA.ObjectToString(group14.Get(index14));
RDebugUtils.currentLine=86900751;
 //BA.debugLineNum = 86900751;BA.debugLine="For i=0 To lstInfoEnviosFechas.Size-1";
{
final int step15 = 1;
final int limit15 = (int) (__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=86900752;
 //BA.debugLineNum = 86900752;BA.debugLine="Dim mEstEnv As Map=lstInfoEnviosFechas.Get(i)";
_mestenv = new anywheresoftware.b4a.objects.collections.Map();
_mestenv = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=86900753;
 //BA.debugLineNum = 86900753;BA.debugLine="If ref= mEstEnv.Get(\"referencia\") And 1=mEstEnv";
if ((_ref).equals(BA.ObjectToString(_mestenv.Get((Object)("referencia")))) && 1==(double)(BA.ObjectToNumber(_mestenv.Get((Object)("estadoEnvio"))))) { 
RDebugUtils.currentLine=86900754;
 //BA.debugLineNum = 86900754;BA.debugLine="lstInfoEnviosFechas.RemoveAt(i)";
__ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=86900755;
 //BA.debugLineNum = 86900755;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=86900759;
 //BA.debugLineNum = 86900759;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _eliminartablatemporaldocumentosreferenciastte(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "eliminartablatemporaldocumentosreferenciastte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "eliminartablatemporaldocumentosreferenciastte", null));}
ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=87556097;
 //BA.debugLineNum = 87556097;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"E";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EliminarTablaTemporalDocumentosReferenciasTte",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=87556098;
 //BA.debugLineNum = 87556098;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "eliminartablatemporaldocumentosreferenciastte"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=87556104;
 //BA.debugLineNum = 87556104;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=87556105;
 //BA.debugLineNum = 87556105;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _fechasultimasemana(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "fechasultimasemana", false))
	 {return ((String) Debug.delegate(ba, "fechasultimasemana", null));}
String _datetimeant = "";
long _nw = 0L;
long _hoy0 = 0L;
long _hoy0menos7 = 0L;
b4j.example.dateutils._period _p = null;
RDebugUtils.currentLine=86245376;
 //BA.debugLineNum = 86245376;BA.debugLine="Sub FechasUltimaSemana";
RDebugUtils.currentLine=86245377;
 //BA.debugLineNum = 86245377;BA.debugLine="Dim DateTimeAnt As String=DateTime.DateFormat";
_datetimeant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=86245378;
 //BA.debugLineNum = 86245378;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=86245379;
 //BA.debugLineNum = 86245379;BA.debugLine="Dim nw As Long=DateTime.Now";
_nw = __c.DateTime.getNow();
RDebugUtils.currentLine=86245380;
 //BA.debugLineNum = 86245380;BA.debugLine="Dim hoy0 As Long=DateUtils.SetDate(DateTime.GetYe";
_hoy0 = _dateutils._setdate(__c.DateTime.GetYear(_nw),__c.DateTime.GetMonth(_nw),__c.DateTime.GetDayOfMonth(_nw));
RDebugUtils.currentLine=86245381;
 //BA.debugLineNum = 86245381;BA.debugLine="Dim hoy0menos7 As Long";
_hoy0menos7 = 0L;
RDebugUtils.currentLine=86245382;
 //BA.debugLineNum = 86245382;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=86245383;
 //BA.debugLineNum = 86245383;BA.debugLine="p.Days=-7";
_p.Days = (int) (-7);
RDebugUtils.currentLine=86245384;
 //BA.debugLineNum = 86245384;BA.debugLine="hoy0menos7=DateUtils.AddPeriod(hoy0,p)";
_hoy0menos7 = _dateutils._addperiod(_hoy0,_p);
RDebugUtils.currentLine=86245385;
 //BA.debugLineNum = 86245385;BA.debugLine="txtFechaFinal.Text=DateTime.Date(hoy0)";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(_hoy0));
RDebugUtils.currentLine=86245386;
 //BA.debugLineNum = 86245386;BA.debugLine="txtfechaInicial.Text=DateTime.Date(hoy0menos7)";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(_hoy0menos7));
RDebugUtils.currentLine=86245387;
 //BA.debugLineNum = 86245387;BA.debugLine="DateTime.DateFormat=DateTimeAnt";
__c.DateTime.setDateFormat(_datetimeant);
RDebugUtils.currentLine=86245388;
 //BA.debugLineNum = 86245388;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=86441984;
 //BA.debugLineNum = 86441984;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=86441985;
 //BA.debugLineNum = 86441985;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=86441986;
 //BA.debugLineNum = 86441986;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getelements(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,anywheresoftware.b4a.objects.collections.Map _m,String _key) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "getelements", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getelements", new Object[] {_m,_key}));}
anywheresoftware.b4a.objects.collections.List _res = null;
Object _value = null;
RDebugUtils.currentLine=87097344;
 //BA.debugLineNum = 87097344;BA.debugLine="Sub GetElements (m As Map, key As String) As List";
RDebugUtils.currentLine=87097345;
 //BA.debugLineNum = 87097345;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=87097346;
 //BA.debugLineNum = 87097346;BA.debugLine="If m.ContainsKey(key) = False Then";
if (_m.ContainsKey((Object)(_key))==__c.False) { 
RDebugUtils.currentLine=87097347;
 //BA.debugLineNum = 87097347;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=87097348;
 //BA.debugLineNum = 87097348;BA.debugLine="Return res";
if (true) return _res;
 }else {
RDebugUtils.currentLine=87097350;
 //BA.debugLineNum = 87097350;BA.debugLine="Dim value As Object = m.Get(key)";
_value = _m.Get((Object)(_key));
RDebugUtils.currentLine=87097351;
 //BA.debugLineNum = 87097351;BA.debugLine="If value Is List Then Return value";
if (_value instanceof java.util.List) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value));};
RDebugUtils.currentLine=87097352;
 //BA.debugLineNum = 87097352;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=87097353;
 //BA.debugLineNum = 87097353;BA.debugLine="res.Add(value)";
_res.Add(_value);
RDebugUtils.currentLine=87097354;
 //BA.debugLineNum = 87097354;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=87097356;
 //BA.debugLineNum = 87097356;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _infodocsnav(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "infodocsnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "infodocsnav", null));}
ResumableSub_InfoDocsNav rsub = new ResumableSub_InfoDocsNav(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InfoDocsNav extends BA.ResumableSub {
public ResumableSub_InfoDocsNav(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
anywheresoftware.b4a.objects.collections.List _lstregdocsexpptes = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
boolean _success = false;
Object _robj = null;
int _ndoc = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _micli = null;
anywheresoftware.b4a.objects.collections.Map _minfoexp = null;
String _refexp = "";
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;
anywheresoftware.b4a.BA.IterableList group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87293953;
 //BA.debugLineNum = 87293953;BA.debugLine="Dim lstRegDocsExpPtes As List";
_lstregdocsexpptes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=87293954;
 //BA.debugLineNum = 87293954;BA.debugLine="lstRegDocsExpPtes.Initialize";
_lstregdocsexpptes.Initialize();
RDebugUtils.currentLine=87293955;
 //BA.debugLineNum = 87293955;BA.debugLine="Wait For(DocumentosExpedicionesCorreosPeriodoBatc";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infodocsnav"), __ref._documentosexpedicionescorreosperiodobatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 32;
return;
case 32:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87293956;
 //BA.debugLineNum = 87293956;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=87293957;
 //BA.debugLineNum = 87293957;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_success) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=87293958;
 //BA.debugLineNum = 87293958;BA.debugLine="Dim lstRegDocsExpPtes As List=mRes.Get(\"lstReg\")";
_lstregdocsexpptes = new anywheresoftware.b4a.objects.collections.List();
_lstregdocsexpptes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=87293960;
 //BA.debugLineNum = 87293960;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=87293963;
 //BA.debugLineNum = 87293963;BA.debugLine="Wait For(EliminarTablaTemporalDocumentosReferenci";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infodocsnav"), __ref._eliminartablatemporaldocumentosreferenciastte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 33;
return;
case 33:
//C
this.state = 7;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=87293966;
 //BA.debugLineNum = 87293966;BA.debugLine="If lstRegDocsExpPtes.Size>0 Then";
if (true) break;

case 7:
//if
this.state = 31;
if (_lstregdocsexpptes.getSize()>0) { 
this.state = 9;
}else {
this.state = 30;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=87293997;
 //BA.debugLineNum = 87293997;BA.debugLine="Dim nDoc As Int=1";
_ndoc = (int) (1);
RDebugUtils.currentLine=87293998;
 //BA.debugLineNum = 87293998;BA.debugLine="For Each m As Map In lstRegDocsExpPtes";
if (true) break;

case 10:
//for
this.state = 28;
_m = new anywheresoftware.b4a.objects.collections.Map();
group13 = _lstregdocsexpptes;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 34;
if (true) break;

case 34:
//C
this.state = 28;
if (index13 < groupLen13) {
this.state = 12;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group13.Get(index13)));}
if (true) break;

case 35:
//C
this.state = 34;
index13++;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=87294000;
 //BA.debugLineNum = 87294000;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizan";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando info "+BA.ObjectToString(_m.Get((Object)("Documento")))+" ("+BA.NumberToString(_ndoc)+" de "+BA.NumberToString(_lstregdocsexpptes.getSize())+") ..."));
RDebugUtils.currentLine=87294001;
 //BA.debugLineNum = 87294001;BA.debugLine="Wait For(ClienteResponsableCuentaDocumento(m.Ge";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infodocsnav"), __ref._clienteresponsablecuentadocumento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,BA.ObjectToString(_m.Get((Object)("Documento")))));
this.state = 36;
return;
case 36:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=87294002;
 //BA.debugLineNum = 87294002;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=87294003;
 //BA.debugLineNum = 87294003;BA.debugLine="If Accion=\"ErrConn\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_accion).equals("ErrConn")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=87294004;
 //BA.debugLineNum = 87294004;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=87294006;
 //BA.debugLineNum = 87294006;BA.debugLine="If Accion=\"OK\" Then";

case 16:
//if
this.state = 27;
if ((_accion).equals("OK")) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=87294007;
 //BA.debugLineNum = 87294007;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=87294008;
 //BA.debugLineNum = 87294008;BA.debugLine="Dim mICli As Map=lstReg.Get(0)";
_micli = new anywheresoftware.b4a.objects.collections.Map();
_micli = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=87294013;
 //BA.debugLineNum = 87294013;BA.debugLine="For Each mInfoExp As Map In lstInfoEnviosFecha";
if (true) break;

case 19:
//for
this.state = 26;
_minfoexp = new anywheresoftware.b4a.objects.collections.Map();
group23 = __ref._lstinfoenviosfechas /*anywheresoftware.b4a.objects.collections.List*/ ;
index23 = 0;
groupLen23 = group23.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if (index23 < groupLen23) {
this.state = 21;
_minfoexp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group23.Get(index23)));}
if (true) break;

case 38:
//C
this.state = 37;
index23++;
if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=87294014;
 //BA.debugLineNum = 87294014;BA.debugLine="Dim RefExp As String=mInfoExp.Get(\"Referencia";
_refexp = BA.ObjectToString(_minfoexp.Get((Object)("Referencia")));
RDebugUtils.currentLine=87294015;
 //BA.debugLineNum = 87294015;BA.debugLine="If RefExp=m.Get(\"ReferenciaExpedicionTranspor";
if (true) break;

case 22:
//if
this.state = 25;
if ((_refexp).equals(BA.ObjectToString(_m.Get((Object)("ReferenciaExpedicionTransporte"))))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=87294016;
 //BA.debugLineNum = 87294016;BA.debugLine="mInfoExp.Put(\"Cliente\",mICli.Get(\"Cliente\"))";
_minfoexp.Put((Object)("Cliente"),_micli.Get((Object)("Cliente")));
RDebugUtils.currentLine=87294017;
 //BA.debugLineNum = 87294017;BA.debugLine="mInfoExp.Put(\"NombreCliente\",mICli.Get(\"Nomb";
_minfoexp.Put((Object)("NombreCliente"),_micli.Get((Object)("NombreCliente")));
RDebugUtils.currentLine=87294018;
 //BA.debugLineNum = 87294018;BA.debugLine="mInfoExp.Put(\"NombreResponsableCuenta\",mICli";
_minfoexp.Put((Object)("NombreResponsableCuenta"),_micli.Get((Object)("ResponsableCuenta")));
RDebugUtils.currentLine=87294019;
 //BA.debugLineNum = 87294019;BA.debugLine="Exit";
this.state = 26;
if (true) break;
 if (true) break;

case 25:
//C
this.state = 38;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 35;
;
RDebugUtils.currentLine=87294023;
 //BA.debugLineNum = 87294023;BA.debugLine="nDoc=nDoc+1";
_ndoc = (int) (_ndoc+1);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 31;
;
RDebugUtils.currentLine=87294033;
 //BA.debugLineNum = 87294033;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=87294035;
 //BA.debugLineNum = 87294035;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=87294038;
 //BA.debugLineNum = 87294038;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _infoexpedicionescorreosexpressentrefechas(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _clifac,long _fechainl,long _fechafinl) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "infoexpedicionescorreosexpressentrefechas", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "infoexpedicionescorreosexpressentrefechas", new Object[] {_clifac,_fechainl,_fechafinl}));}
ResumableSub_InfoExpedicionesCorreosExpressEntreFechas rsub = new ResumableSub_InfoExpedicionesCorreosExpressEntreFechas(this,__ref,_clifac,_fechainl,_fechafinl);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InfoExpedicionesCorreosExpressEntreFechas extends BA.ResumableSub {
public ResumableSub_InfoExpedicionesCorreosExpressEntreFechas(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _clifac,long _fechainl,long _fechafinl) {
this.parent = parent;
this.__ref = __ref;
this._clifac = _clifac;
this._fechainl = _fechainl;
this._fechafinl = _fechafinl;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _clifac;
long _fechainl;
long _fechafinl;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.Map _mseguimientoenviosfechasrequest = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jp = null;
String _infoenviosentrefechasjsonstring = "";
b4j.docU.httpjob _job = null;
String _urlcorreosexpressfechas = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87031825;
 //BA.debugLineNum = 87031825;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=87031826;
 //BA.debugLineNum = 87031826;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"   ' el formato t";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=87031828;
 //BA.debugLineNum = 87031828;BA.debugLine="Dim mSeguimientoEnviosFechasRequest As Map";
_mseguimientoenviosfechasrequest = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=87031829;
 //BA.debugLineNum = 87031829;BA.debugLine="mSeguimientoEnviosFechasRequest.Initialize";
_mseguimientoenviosfechasrequest.Initialize();
RDebugUtils.currentLine=87031830;
 //BA.debugLineNum = 87031830;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"keyCliFac\",C";
_mseguimientoenviosfechasrequest.Put((Object)("keyCliFac"),(Object)(_clifac));
RDebugUtils.currentLine=87031831;
 //BA.debugLineNum = 87031831;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"fechaInicial";
_mseguimientoenviosfechasrequest.Put((Object)("fechaInicial"),(Object)(parent.__c.DateTime.Date(_fechainl)));
RDebugUtils.currentLine=87031832;
 //BA.debugLineNum = 87031832;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"fechaFinal\",";
_mseguimientoenviosfechasrequest.Put((Object)("fechaFinal"),(Object)(parent.__c.DateTime.Date(_fechafinl)));
RDebugUtils.currentLine=87031833;
 //BA.debugLineNum = 87031833;BA.debugLine="mSeguimientoEnviosFechasRequest.Put(\"idioma\",\"ES\"";
_mseguimientoenviosfechasrequest.Put((Object)("idioma"),(Object)("ES"));
RDebugUtils.currentLine=87031835;
 //BA.debugLineNum = 87031835;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=87031837;
 //BA.debugLineNum = 87031837;BA.debugLine="Dim jp As JSONGenerator";
_jp = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=87031838;
 //BA.debugLineNum = 87031838;BA.debugLine="jp.Initialize(mSeguimientoEnviosFechasRequest)";
_jp.Initialize(_mseguimientoenviosfechasrequest);
RDebugUtils.currentLine=87031839;
 //BA.debugLineNum = 87031839;BA.debugLine="Dim InfoEnviosEntreFechasJSONstring As String";
_infoenviosentrefechasjsonstring = "";
RDebugUtils.currentLine=87031840;
 //BA.debugLineNum = 87031840;BA.debugLine="InfoEnviosEntreFechasJSONstring=jp.ToString";
_infoenviosentrefechasjsonstring = _jp.ToString();
RDebugUtils.currentLine=87031843;
 //BA.debugLineNum = 87031843;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=87031844;
 //BA.debugLineNum = 87031844;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=87031846;
 //BA.debugLineNum = 87031846;BA.debugLine="Dim URLCorreosExpressFechas As String=\"https://ww";
_urlcorreosexpressfechas = "https://www.cexpr.es/wspsc/apiRestSeguimientoEnviosk8s/json/seguimientoEnviosFechas";
RDebugUtils.currentLine=87031848;
 //BA.debugLineNum = 87031848;BA.debugLine="job.Username=UsuarioWS";
_job._username /*String*/  = __ref._usuariows /*String*/ ;
RDebugUtils.currentLine=87031849;
 //BA.debugLineNum = 87031849;BA.debugLine="job.Password=PasswordWs";
_job._password /*String*/  = __ref._passwordws /*String*/ ;
RDebugUtils.currentLine=87031850;
 //BA.debugLineNum = 87031850;BA.debugLine="job.PostString(URLCorreosExpressFechas,InfoEnvios";
_job._poststring /*String*/ (null,_urlcorreosexpressfechas,_infoenviosentrefechasjsonstring);
RDebugUtils.currentLine=87031852;
 //BA.debugLineNum = 87031852;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=87031853;
 //BA.debugLineNum = 87031853;BA.debugLine="job.GetRequest.SetContentEncoding(\"UTF8\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentEncoding("UTF8");
RDebugUtils.currentLine=87031855;
 //BA.debugLineNum = 87031855;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "infoexpedicionescorreosexpressentrefechas"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=87031856;
 //BA.debugLineNum = 87031856;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=87031858;
 //BA.debugLineNum = 87031858;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=87031859;
 //BA.debugLineNum = 87031859;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=87031860;
 //BA.debugLineNum = 87031860;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=87031862;
 //BA.debugLineNum = 87031862;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=87031863;
 //BA.debugLineNum = 87031863;BA.debugLine="Return \"ERROR de comunicacion :\" & j.ErrorMessag";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("ERROR de comunicacion :"+_j._errormessage /*String*/ ));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=87031865;
 //BA.debugLineNum = 87031865;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableviewinfotrackingenviosperiodo_contextmenuitem_action(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "jamtableviewinfotrackingenviosperiodo_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewinfotrackingenviosperiodo_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewInfoTrackingEnviosPeriodo_ContextMenuItem_Action(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _tagmenuitem;
String _numenvio = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
b4j.docU.jamtableview._datoscamporegistrojamtableview _dcrs = null;
b4j.docU.cinfoexpedicioncorreosexpress _cinfoexpce = null;
String _documentosel = "";
int _filaseleccionada = 0;
anywheresoftware.b4a.objects.collections.List _lstinfofila = null;
b4j.docU.jamtableview._datoscamporegistrojamtableview _dc = null;
Object _msa = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group5;
int index5;
int groupLen5;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87162881;
 //BA.debugLineNum = 87162881;BA.debugLine="Select TagMenuItem";
if (true) break;

case 1:
//select
this.state = 30;
switch (BA.switchObjectToInt(_tagmenuitem,"TrazabilidadEnvio","VerDocumentoNAV")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 16;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=87162883;
 //BA.debugLineNum = 87162883;BA.debugLine="Dim NumEnvio As String";
_numenvio = "";
RDebugUtils.currentLine=87162884;
 //BA.debugLineNum = 87162884;BA.debugLine="Dim lstReg As List=jamTableViewInfoTrackingEnvi";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = __ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._datosregistroindicefila /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null));
RDebugUtils.currentLine=87162885;
 //BA.debugLineNum = 87162885;BA.debugLine="For Each dcRS As DatosCampoRegistroJamTableView";
if (true) break;

case 4:
//for
this.state = 11;
group5 = _lstreg;
index5 = 0;
groupLen5 = group5.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 11;
if (index5 < groupLen5) {
this.state = 6;
_dcrs = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group5.Get(index5));}
if (true) break;

case 32:
//C
this.state = 31;
index5++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=87162886;
 //BA.debugLineNum = 87162886;BA.debugLine="If dcRS.AliasCampo=\"NumEnvio\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_dcrs.AliasCampo /*String*/ ).equals("NumEnvio")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=87162887;
 //BA.debugLineNum = 87162887;BA.debugLine="NumEnvio=dcRS.ValorCampo";
_numenvio = BA.ObjectToString(_dcrs.ValorCampo /*Object*/ );
RDebugUtils.currentLine=87162888;
 //BA.debugLineNum = 87162888;BA.debugLine="Exit";
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 32;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=87162891;
 //BA.debugLineNum = 87162891;BA.debugLine="If NumEnvio<>\"\" Then";

case 11:
//if
this.state = 14;
if ((_numenvio).equals("") == false) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=87162892;
 //BA.debugLineNum = 87162892;BA.debugLine="jamTableViewInfoTrackingEnviosPeriodo.GuardarC";
__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=87162897;
 //BA.debugLineNum = 87162897;BA.debugLine="Dim cInfoExpCE As cInfoExpedicionCorreosExpres";
_cinfoexpce = new b4j.docU.cinfoexpedicioncorreosexpress();
RDebugUtils.currentLine=87162898;
 //BA.debugLineNum = 87162898;BA.debugLine="cInfoExpCE.Initialize(NumEnvio)";
_cinfoexpce._initialize /*String*/ (null,ba,_numenvio);
RDebugUtils.currentLine=87162899;
 //BA.debugLineNum = 87162899;BA.debugLine="cInfoExpCE.Show";
_cinfoexpce._show /*void*/ (null);
 if (true) break;

case 14:
//C
this.state = 30;
;
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=87162903;
 //BA.debugLineNum = 87162903;BA.debugLine="Dim DocumentoSel As String";
_documentosel = "";
RDebugUtils.currentLine=87162904;
 //BA.debugLineNum = 87162904;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewInfoTra";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=87162905;
 //BA.debugLineNum = 87162905;BA.debugLine="Dim lstInfoFila As List=jamTableViewInfoTrackin";
_lstinfofila = new anywheresoftware.b4a.objects.collections.List();
_lstinfofila = __ref._jamtableviewinfotrackingenviosperiodo /*b4j.docU.jamtableview*/ ._datosregistroindicefila /*anywheresoftware.b4a.objects.collections.List*/ (null,_filaseleccionada);
RDebugUtils.currentLine=87162906;
 //BA.debugLineNum = 87162906;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
if (true) break;

case 17:
//for
this.state = 24;
group21 = _lstinfofila;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 33;
if (true) break;

case 33:
//C
this.state = 24;
if (index21 < groupLen21) {
this.state = 19;
_dc = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group21.Get(index21));}
if (true) break;

case 34:
//C
this.state = 33;
index21++;
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=87162907;
 //BA.debugLineNum = 87162907;BA.debugLine="If dc.Campo=\"Referencia\" Then";
if (true) break;

case 20:
//if
this.state = 23;
if ((_dc.Campo /*String*/ ).equals("Referencia")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=87162908;
 //BA.debugLineNum = 87162908;BA.debugLine="DocumentoSel=dc.ValorCampo";
_documentosel = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
RDebugUtils.currentLine=87162909;
 //BA.debugLineNum = 87162909;BA.debugLine="Exit";
this.state = 24;
if (true) break;
 if (true) break;

case 23:
//C
this.state = 34;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=87162912;
 //BA.debugLineNum = 87162912;BA.debugLine="If DocumentoSel=\"\" Then";

case 24:
//if
this.state = 29;
if ((_documentosel).equals("")) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=87162913;
 //BA.debugLineNum = 87162913;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Documento.","Error");
RDebugUtils.currentLine=87162914;
 //BA.debugLineNum = 87162914;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "jamtableviewinfotrackingenviosperiodo_contextmenuitem_action"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 29;
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=87162917;
 //BA.debugLineNum = 87162917;BA.debugLine="WAIT FOR (VerDocumentoNAV(DocumentoSel)) COMPL";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "jamtableviewinfotrackingenviosperiodo_contextmenuitem_action"), __ref._verdocumentonav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_documentosel));
this.state = 36;
return;
case 36:
//C
this.state = 29;
_success = (boolean) result[1];
;
 if (true) break;

case 29:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=87162924;
 //BA.debugLineNum = 87162924;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _verdocumentonav(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _documentosel) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "verdocumentonav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "verdocumentonav", new Object[] {_documentosel}));}
ResumableSub_VerDocumentoNAV rsub = new ResumableSub_VerDocumentoNAV(this,__ref,_documentosel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_VerDocumentoNAV extends BA.ResumableSub {
public ResumableSub_VerDocumentoNAV(b4j.docU.cinfoenviosperiodocorreosexpress2 parent,b4j.docU.cinfoenviosperiodocorreosexpress2 __ref,String _documentosel) {
this.parent = parent;
this.__ref = __ref;
this._documentosel = _documentosel;
this.__ref = parent;
}
b4j.docU.cinfoenviosperiodocorreosexpress2 __ref;
b4j.docU.cinfoenviosperiodocorreosexpress2 parent;
String _documentosel;
anywheresoftware.b4j.object.JavaObject _wu = null;
anywheresoftware.b4a.objects.collections.List _l = null;
boolean _flagok = false;
anywheresoftware.b4j.object.JavaObject _jo = null;
String _t = "";
Object _msa = null;
int _rint = 0;
anywheresoftware.b4j.object.JavaObject _user32 = null;
Object _hwnd = null;
int _pagnavtipodoc = 0;
String _navfilepath = "";
String _navhyperlink = "";
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
String _line = "";
int _i = 0;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;
String[] group49;
int index49;
int groupLen49;
int step53;
int limit53;
anywheresoftware.b4a.BA.IterableList group61;
int index61;
int groupLen61;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=87228420;
 //BA.debugLineNum = 87228420;BA.debugLine="Log(\"Buscando window title \" & DocumentoSel)";
parent.__c.LogImpl("887228420","Buscando window title "+_documentosel,0);
RDebugUtils.currentLine=87228422;
 //BA.debugLineNum = 87228422;BA.debugLine="Dim WU As JavaObject";
_wu = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=87228423;
 //BA.debugLineNum = 87228423;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
_wu.InitializeStatic("com.sun.jna.platform.WindowUtils");
RDebugUtils.currentLine=87228424;
 //BA.debugLineNum = 87228424;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_wu.RunMethod("getAllWindows",new Object[]{(Object)(parent.__c.False)})));
RDebugUtils.currentLine=87228425;
 //BA.debugLineNum = 87228425;BA.debugLine="Dim FlagOk As Boolean";
_flagok = false;
RDebugUtils.currentLine=87228426;
 //BA.debugLineNum = 87228426;BA.debugLine="For Each JO As JavaObject In L";
if (true) break;

case 1:
//for
this.state = 8;
_jo = new anywheresoftware.b4j.object.JavaObject();
group6 = _l;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 75;
if (true) break;

case 75:
//C
this.state = 8;
if (index6 < groupLen6) {
this.state = 3;
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group6.Get(index6)));}
if (true) break;

case 76:
//C
this.state = 75;
index6++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=87228427;
 //BA.debugLineNum = 87228427;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
_t = BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=87228428;
 //BA.debugLineNum = 87228428;BA.debugLine="Log(\"window title\" & t)";
parent.__c.LogImpl("887228428","window title"+_t,0);
RDebugUtils.currentLine=87228429;
 //BA.debugLineNum = 87228429;BA.debugLine="If t.Contains(DocumentoSel) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_t.contains(_documentosel)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=87228430;
 //BA.debugLineNum = 87228430;BA.debugLine="FlagOk=True";
_flagok = parent.__c.True;
RDebugUtils.currentLine=87228431;
 //BA.debugLineNum = 87228431;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 76;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=87228435;
 //BA.debugLineNum = 87228435;BA.debugLine="If FlagOk Then";

case 8:
//if
this.state = 21;
if (_flagok) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=87228436;
 //BA.debugLineNum = 87228436;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Ya hay una";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Ya hay una ventana abierta con el título: "+parent.__c.CRLF+parent.__c.CRLF+BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(parent.__c.Null)))+parent.__c.CRLF,"Aviso","Abrir Nueva","Cancelar","Abrir Actual",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=87228437;
 //BA.debugLineNum = 87228437;BA.debugLine="Wait For (msa) Msgbox_Result (RInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 77;
return;
case 77:
//C
this.state = 11;
_rint = (int) result[1];
;
RDebugUtils.currentLine=87228438;
 //BA.debugLineNum = 87228438;BA.debugLine="If RInt=xui.DialogResponse_Cancel Then Return Fa";
if (true) break;

case 11:
//if
this.state = 16;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=87228439;
 //BA.debugLineNum = 87228439;BA.debugLine="If RInt <>xui.DialogResponse_Positive Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=87228440;
 //BA.debugLineNum = 87228440;BA.debugLine="Dim user32 As JavaObject";
_user32 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=87228441;
 //BA.debugLineNum = 87228441;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.p";
_user32 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")));
RDebugUtils.currentLine=87228442;
 //BA.debugLineNum = 87228442;BA.debugLine="Dim hwnd As Object = JO.RunMethod(\"getHWND\", Nu";
_hwnd = _jo.RunMethod("getHWND",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=87228443;
 //BA.debugLineNum = 87228443;BA.debugLine="user32.RunMethod(\"SetForegroundWindow\", Array(h";
_user32.RunMethod("SetForegroundWindow",new Object[]{_hwnd});
RDebugUtils.currentLine=87228444;
 //BA.debugLineNum = 87228444;BA.debugLine="user32.RunMethod(\"SetFocus\", Array(hwnd))";
_user32.RunMethod("SetFocus",new Object[]{_hwnd});
RDebugUtils.currentLine=87228445;
 //BA.debugLineNum = 87228445;BA.debugLine="user32.RunMethod(\"ShowWindow\", Array(hwnd, 9))'";
_user32.RunMethod("ShowWindow",new Object[]{_hwnd,(Object)(9)});
RDebugUtils.currentLine=87228446;
 //BA.debugLineNum = 87228446;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=87228450;
 //BA.debugLineNum = 87228450;BA.debugLine="Dim  PagNAVTipoDoc As Int";
_pagnavtipodoc = 0;
RDebugUtils.currentLine=87228451;
 //BA.debugLineNum = 87228451;BA.debugLine="Select True";
if (true) break;

case 22:
//select
this.state = 29;
switch (BA.switchObjectToInt(parent.__c.True,_documentosel.startsWith("ALBV"),_documentosel.startsWith("RT"))) {
case 0: {
this.state = 24;
if (true) break;
}
case 1: {
this.state = 26;
if (true) break;
}
default: {
this.state = 28;
if (true) break;
}
}
if (true) break;

case 24:
//C
this.state = 29;
RDebugUtils.currentLine=87228453;
 //BA.debugLineNum = 87228453;BA.debugLine="PagNAVTipoDoc=130";
_pagnavtipodoc = (int) (130);
 if (true) break;

case 26:
//C
this.state = 29;
RDebugUtils.currentLine=87228455;
 //BA.debugLineNum = 87228455;BA.debugLine="PagNAVTipoDoc=5745";
_pagnavtipodoc = (int) (5745);
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=87228457;
 //BA.debugLineNum = 87228457;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Sólo es posi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Sólo es posible navegar a documentos tipo ALBV o RT.","Aviso");
RDebugUtils.currentLine=87228458;
 //BA.debugLineNum = 87228458;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 78;
return;
case 78:
//C
this.state = 29;
;
RDebugUtils.currentLine=87228459;
 //BA.debugLineNum = 87228459;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=87228462;
 //BA.debugLineNum = 87228462;BA.debugLine="Dim NavFilePath As String=\"C:\\Program Files (x86)";
_navfilepath = "C:\\Program Files (x86)\\Microsoft Dynamics NAV\\90\\RoleTailored Client\\Microsoft.Dynamics.Nav.Client.exe";
RDebugUtils.currentLine=87228465;
 //BA.debugLineNum = 87228465;BA.debugLine="Dim NAVHyperlink As String=\"Dynamicsnav://NAVISIO";
_navhyperlink = "Dynamicsnav://NAVISION2012:7046/PROIN/PROIN%20PINILLA/runpage?page="+BA.NumberToString(_pagnavtipodoc)+"&$filter='No.'%20IS%20"+_documentosel;
RDebugUtils.currentLine=87228466;
 //BA.debugLineNum = 87228466;BA.debugLine="Log(\"Microsoft.Dynamics.Nav.Client.exe \" & NAVHyp";
parent.__c.LogImpl("887228466","Microsoft.Dynamics.Nav.Client.exe "+_navhyperlink,0);
RDebugUtils.currentLine=87228467;
 //BA.debugLineNum = 87228467;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=87228468;
 //BA.debugLineNum = 87228468;BA.debugLine="shl.Initialize(\"shl\",NavFilePath, Array As String";
_shl.Initialize("shl",_navfilepath,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_navhyperlink}));
RDebugUtils.currentLine=87228470;
 //BA.debugLineNum = 87228470;BA.debugLine="Try";
if (true) break;

case 30:
//try
this.state = 74;
this.catchState = 67;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 33;
this.catchState = 67;
RDebugUtils.currentLine=87228471;
 //BA.debugLineNum = 87228471;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=87228472;
 //BA.debugLineNum = 87228472;BA.debugLine="Log(\"try Success\")";
parent.__c.LogImpl("887228472","try Success",0);
RDebugUtils.currentLine=87228473;
 //BA.debugLineNum = 87228473;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolea";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), null);
this.state = 79;
return;
case 79:
//C
this.state = 33;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=87228474;
 //BA.debugLineNum = 87228474;BA.debugLine="If Success Then";
if (true) break;

case 33:
//if
this.state = 65;
if (_success) { 
this.state = 35;
}else {
this.state = 58;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=87228475;
 //BA.debugLineNum = 87228475;BA.debugLine="For Each line As String In Regex.Split(\"[\\r\\n]+";
if (true) break;

case 36:
//for
this.state = 39;
group49 = parent.__c.Regex.Split("[\\r\\n]+",_stdout);
index49 = 0;
groupLen49 = group49.length;
this.state = 80;
if (true) break;

case 80:
//C
this.state = 39;
if (index49 < groupLen49) {
this.state = 38;
_line = group49[index49];}
if (true) break;

case 81:
//C
this.state = 80;
index49++;
if (true) break;

case 38:
//C
this.state = 81;
RDebugUtils.currentLine=87228476;
 //BA.debugLineNum = 87228476;BA.debugLine="Log(\"line shell \" & line)";
parent.__c.LogImpl("887228476","line shell "+_line,0);
 if (true) break;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=87228478;
 //BA.debugLineNum = 87228478;BA.debugLine="Dim FlagOk As Boolean";
_flagok = false;
RDebugUtils.currentLine=87228479;
 //BA.debugLineNum = 87228479;BA.debugLine="For i=0 To 3 ' intentarlo 3 veces ... por si na";
if (true) break;

case 40:
//for
this.state = 56;
step53 = 1;
limit53 = (int) (3);
_i = (int) (0) ;
this.state = 82;
if (true) break;

case 82:
//C
this.state = 56;
if ((step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53)) this.state = 42;
if (true) break;

case 83:
//C
this.state = 82;
_i = ((int)(0 + _i + step53)) ;
if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=87228480;
 //BA.debugLineNum = 87228480;BA.debugLine="Sleep(1000) ' dar tiempo a que la ventana se a";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"),(int) (1000));
this.state = 84;
return;
case 84:
//C
this.state = 43;
;
RDebugUtils.currentLine=87228481;
 //BA.debugLineNum = 87228481;BA.debugLine="Log(\"Buscando window title \" & DocumentoSel)";
parent.__c.LogImpl("887228481","Buscando window title "+_documentosel,0);
RDebugUtils.currentLine=87228482;
 //BA.debugLineNum = 87228482;BA.debugLine="Dim WU As JavaObject";
_wu = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=87228483;
 //BA.debugLineNum = 87228483;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.Wind";
_wu.InitializeStatic("com.sun.jna.platform.WindowUtils");
RDebugUtils.currentLine=87228484;
 //BA.debugLineNum = 87228484;BA.debugLine="Dim user32 As JavaObject";
_user32 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=87228485;
 //BA.debugLineNum = 87228485;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.";
_user32 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")));
RDebugUtils.currentLine=87228486;
 //BA.debugLineNum = 87228486;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",A";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_wu.RunMethod("getAllWindows",new Object[]{(Object)(parent.__c.False)})));
RDebugUtils.currentLine=87228487;
 //BA.debugLineNum = 87228487;BA.debugLine="For Each JO As JavaObject In L";
if (true) break;

case 43:
//for
this.state = 50;
_jo = new anywheresoftware.b4j.object.JavaObject();
group61 = _l;
index61 = 0;
groupLen61 = group61.getSize();
this.state = 85;
if (true) break;

case 85:
//C
this.state = 50;
if (index61 < groupLen61) {
this.state = 45;
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group61.Get(index61)));}
if (true) break;

case 86:
//C
this.state = 85;
index61++;
if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=87228488;
 //BA.debugLineNum = 87228488;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Nul";
_t = BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=87228489;
 //BA.debugLineNum = 87228489;BA.debugLine="Log(\"window title\" & t)";
parent.__c.LogImpl("887228489","window title"+_t,0);
RDebugUtils.currentLine=87228490;
 //BA.debugLineNum = 87228490;BA.debugLine="If t.Contains(DocumentoSel) Then";
if (true) break;

case 46:
//if
this.state = 49;
if (_t.contains(_documentosel)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=87228491;
 //BA.debugLineNum = 87228491;BA.debugLine="Dim hwnd As Object = JO.RunMethod(\"getHWND\",";
_hwnd = _jo.RunMethod("getHWND",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=87228492;
 //BA.debugLineNum = 87228492;BA.debugLine="user32.RunMethod(\"SetForegroundWindow\", Arra";
_user32.RunMethod("SetForegroundWindow",new Object[]{_hwnd});
RDebugUtils.currentLine=87228493;
 //BA.debugLineNum = 87228493;BA.debugLine="user32.RunMethod(\"SetFocus\", Array(hwnd))";
_user32.RunMethod("SetFocus",new Object[]{_hwnd});
RDebugUtils.currentLine=87228494;
 //BA.debugLineNum = 87228494;BA.debugLine="user32.RunMethod(\"ShowWindow\", Array(hwnd, 9";
_user32.RunMethod("ShowWindow",new Object[]{_hwnd,(Object)(9)});
RDebugUtils.currentLine=87228495;
 //BA.debugLineNum = 87228495;BA.debugLine="FlagOk=True";
_flagok = parent.__c.True;
RDebugUtils.currentLine=87228496;
 //BA.debugLineNum = 87228496;BA.debugLine="Exit";
this.state = 50;
if (true) break;
 if (true) break;

case 49:
//C
this.state = 86;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=87228499;
 //BA.debugLineNum = 87228499;BA.debugLine="If FlagOk Then Exit";

case 50:
//if
this.state = 55;
if (_flagok) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
this.state = 56;
if (true) break;
if (true) break;

case 55:
//C
this.state = 83;
;
 if (true) break;
if (true) break;

case 56:
//C
this.state = 65;
;
RDebugUtils.currentLine=87228501;
 //BA.debugLineNum = 87228501;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=87228503;
 //BA.debugLineNum = 87228503;BA.debugLine="If StdErr.Contains(shl.WorkingDirectory) Then";
if (true) break;

case 59:
//if
this.state = 64;
if (_stderr.contains(_shl.getWorkingDirectory())) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
RDebugUtils.currentLine=87228504;
 //BA.debugLineNum = 87228504;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicaci";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La aplicación NAVISION no está instalada en el directorio predeterminado.","Error");
RDebugUtils.currentLine=87228505;
 //BA.debugLineNum = 87228505;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 64;
;
 if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=87228507;
 //BA.debugLineNum = 87228507;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(StdErr,\"Erro";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_stderr,"Error");
RDebugUtils.currentLine=87228508;
 //BA.debugLineNum = 87228508;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 88;
return;
case 88:
//C
this.state = 64;
;
 if (true) break;

case 64:
//C
this.state = 65;
;
RDebugUtils.currentLine=87228510;
 //BA.debugLineNum = 87228510;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 65:
//C
this.state = 74;
;
 if (true) break;

case 67:
//C
this.state = 68;
this.catchState = 0;
RDebugUtils.currentLine=87228514;
 //BA.debugLineNum = 87228514;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("887228514",BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=87228515;
 //BA.debugLineNum = 87228515;BA.debugLine="If LastException.Message.Contains(shl.WorkingDir";
if (true) break;

case 68:
//if
this.state = 73;
if (parent.__c.LastException(ba).getMessage().contains(_shl.getWorkingDirectory())) { 
this.state = 70;
}else {
this.state = 72;
}if (true) break;

case 70:
//C
this.state = 73;
RDebugUtils.currentLine=87228516;
 //BA.debugLineNum = 87228516;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicació";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La aplicación NAVISION no está instalada en el directorio predeterminado.","Error");
RDebugUtils.currentLine=87228517;
 //BA.debugLineNum = 87228517;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 89;
return;
case 89:
//C
this.state = 73;
;
 if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=87228519;
 //BA.debugLineNum = 87228519;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(LastException";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=87228520;
 //BA.debugLineNum = 87228520;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoenviosperiodocorreosexpress2", "verdocumentonav"), _msa);
this.state = 90;
return;
case 90:
//C
this.state = 73;
;
 if (true) break;

case 73:
//C
this.state = 74;
;
RDebugUtils.currentLine=87228522;
 //BA.debugLineNum = 87228522;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
if (true) break;

case 74:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=87228525;
 //BA.debugLineNum = 87228525;BA.debugLine="End Sub";
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
public String  _process_globals(b4j.docU.cinfoenviosperiodocorreosexpress2 __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoenviosperiodocorreosexpress2";
if (Debug.shouldDelegate(ba, "process_globals", false))
	 {return ((String) Debug.delegate(ba, "process_globals", null));}
RDebugUtils.currentLine=86048768;
 //BA.debugLineNum = 86048768;BA.debugLine="Sub Process_Globals";
RDebugUtils.currentLine=86048770;
 //BA.debugLineNum = 86048770;BA.debugLine="End Sub";
return "";
}



public static Color getColorByName(String name) {
    try {
        return (Color)Color.class.getField(name.toUpperCase()).get(null);
    } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
        e.printStackTrace();
        return null;
    }
}

public static String format(double val) {
    String in = Integer.toHexString((int) Math.round(val * 255));
    return in.length() == 1 ? "0" + in : in;
}

public static String toHexString(Color value) {
    return "#" + (format(value.getRed()) + format(value.getGreen()) + format(value.getBlue()) + format(value.getOpacity()))
            .toUpperCase();
}


public static void setFormatoColumnaNombreEstadoEnvio(TableColumn tc, final Object[] args)  throws Exception {


    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Object>() {
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
					
						String EstadoEnvio=(String)item;
						
						String sColorF=new String("");
						
						String sColorT=new String("");
						
						String sColorB=new String("");
						
					     switch (EstadoEnvio) 
					        {
					            case "ENTREGADO":
									sColorT = "lime";
									//sColorF = "lime";
									//sColorB = "lightgray";
					                break;

					            default: 
									sColorT = "red";
									//sColorF = "red";
									//sColorB = "lightgray";
					                break;
					        }
					
						//Color colorF = Color.valueOf(sColorF);
						// String hexColorF = toHexString(colorF);
						 //Color colorB = Color.valueOf(sColorB);
						// String hexColorB = toHexString(colorB);
						//System.out.println("hexColor "+ hexColor);
						//setStyle("-fx-background-color: #baffba;");
						//setStyle("-fx-alignment: CENTER;-fx-border-color: #D3D3D3;-fx-border-width: 1;-fx-background-color: " + hexColorF +";");
						//setStyle("-fx-alignment: CENTER;-fx-border-color: "+ hexColorB + ";-fx-border-width: 1;-fx-background-color: " + hexColorF +";");
						//String sColorT =  String.valueOf(args[0]);
						Color colorT = Color.valueOf(sColorT);
						setTextFill(colorT);
       						setText(""+item);
							}
	 				else {
	          			setText(null);
              			setTextFill(null);
						setStyle(null);
              			return;
	 				}
                }
            };
        }
    });
}
}