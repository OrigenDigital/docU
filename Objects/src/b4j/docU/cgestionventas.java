package b4j.docU;

import anywheresoftware.b4a.debug.*;
import com.sun.jna.platform.win32.*;
import javafx.scene.control.*; 
import javafx.util.Callback;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.control.TableColumn;
import javafx.scene.paint.Paint;
import java.util.Arrays;
import java.util.List;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.text.SimpleDateFormat; 

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cgestionventas extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cgestionventas", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cgestionventas.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.docU.jamtableview _jamtableviewgestionventas = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4j.objects.SQL _msqlgestionventas = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodigovendedor = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombrevendedor = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public boolean _calcularfechas = false;
public flm.b4j.calendar.b4jCalendar _cal = null;
public flm.b4j.calendar.b4jLocale _locale = null;
public String _permisomodulousuario = "";
public String _carpetaficheroscsvrepsol = "";
public String _carpetaficherospdfrepsol = "";
public String _buzoncompartidoemailenvioinforepsol = "";
public String _direccionseleccionadaremitenteemailsrepsol = "";
public String _direcciondestinoemailsrepsol = "";
public String _direccionccdestinoemailsrepsol = "";
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
public String  _initialize(b4j.docU.cgestionventas __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cffechanav = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cffecha = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cffechav = null;
long _fechahoy = 0L;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cfstatus = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cfnumcurrency = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cfnumdec2 = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cfdesart = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="frm.RootPane.LoadLayout(\"scrGestionVentas\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrGestionVentas");
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=12517386;
 //BA.debugLineNum = 12517386;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"    Gestión";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"    Gestión Ventas");
RDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=12517392;
 //BA.debugLineNum = 12517392;BA.debugLine="JamLoadingIndicator1.Initialize(Me, frm.RootPane";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=12517394;
 //BA.debugLineNum = 12517394;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curs";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=12517397;
 //BA.debugLineNum = 12517397;BA.debugLine="Dim rSub As ResumableSub=jamTableViewGestionVent";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"GestionVentasAmpliadaPlazos.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12517398;
 //BA.debugLineNum = 12517398;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12517400;
 //BA.debugLineNum = 12517400;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curs";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=12517401;
 //BA.debugLineNum = 12517401;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("812517401",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=12517402;
 //BA.debugLineNum = 12517402;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12517403;
 //BA.debugLineNum = 12517403;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=12517404;
 //BA.debugLineNum = 12517404;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=12517405;
 //BA.debugLineNum = 12517405;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=12517407;
 //BA.debugLineNum = 12517407;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=12517410;
 //BA.debugLineNum = 12517410;BA.debugLine="jamTableViewGestionVentas.ToolTipTableColumn(\"Do";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._tooltiptablecolumn /*String*/ (null,"Documento","Tooltip para columna Documento");
RDebugUtils.currentLine=12517411;
 //BA.debugLineNum = 12517411;BA.debugLine="jamTableViewGestionVentas.EstadoMenuItem(\"MenuAc";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,"MenuAccionesjamTableView",parent.__c.True);
RDebugUtils.currentLine=12517412;
 //BA.debugLineNum = 12517412;BA.debugLine="jamTableViewGestionVentas.EstadoMenuItem(\"MenuLi";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,"MenuLineajamTableView",parent.__c.False);
RDebugUtils.currentLine=12517414;
 //BA.debugLineNum = 12517414;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=12517415;
 //BA.debugLineNum = 12517415;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.pn";
_img.InitializeSample(parent.__c.File.getDirAssets(),"navision.png",24,24);
RDebugUtils.currentLine=12517416;
 //BA.debugLineNum = 12517416;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemImag";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Ver Pedido NAV","VerPedidoNAV",_img);
RDebugUtils.currentLine=12517420;
 //BA.debugLineNum = 12517420;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemImag";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._addcontextmenuitemimagecolumna /*String*/ (null,"Artículo","Ver Articulo NAV","VerArticuloNAV",_img);
RDebugUtils.currentLine=12517421;
 //BA.debugLineNum = 12517421;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemImag";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._addcontextmenuitemimagecolumna /*String*/ (null,"FechaDisponibilidad","Ver Fechas Prometidas Compra","VerFechasPrometidasCompraArticuloNAV",_img);
RDebugUtils.currentLine=12517422;
 //BA.debugLineNum = 12517422;BA.debugLine="jamTableViewGestionVentas.AddContextMenuItemFontM";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontmaterialiconstextcolumna /*String*/ (null,"Documento","Enviar Email Transnatur-Albarán REPSOL","EnviarEmailAlbaranTransnaturREPSOL",BA.ObjectToString(parent.__c.Chr(((int)0xe0be))));
RDebugUtils.currentLine=12517424;
 //BA.debugLineNum = 12517424;BA.debugLine="jamTableViewGestionVentas.AddMenuItemImagenToMen";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._addmenuitemimagentomenuinmenubar /*String*/ (null,"Prevision semanal ventas","PrevisionSemanalVentas",__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.File.getDirAssets(),"predecir.png",32,32);
RDebugUtils.currentLine=12517425;
 //BA.debugLineNum = 12517425;BA.debugLine="jamTableViewGestionVentas.AddMenuItemFontMaterial";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Enviar Email Transnatur-Albarán REPSOL","EnviarEmailAlbaranTransnaturREPSOL",BA.ObjectToString(parent.__c.Chr(((int)0xe0be))),__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=12517473;
 //BA.debugLineNum = 12517473;BA.debugLine="Dim CFFechaNAV As DatosCellFactoryJamTableView";
_cffechanav = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517474;
 //BA.debugLineNum = 12517474;BA.debugLine="CFFechaNAV.Initialize";
_cffechanav.Initialize();
RDebugUtils.currentLine=12517475;
 //BA.debugLineNum = 12517475;BA.debugLine="CFFechaNAV.NombreFuncionCellFactory=jamTableView";
_cffechanav.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_columnafechasqlserver /*String*/ ;
RDebugUtils.currentLine=12517476;
 //BA.debugLineNum = 12517476;BA.debugLine="CFFechaNAV.CellFactoryEnCallBack=False";
_cffechanav.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=12517477;
 //BA.debugLineNum = 12517477;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cffechanav,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaDocumento"),(Object)("FechaMaterial"),(Object)("FechaPlanificada"),(Object)("FechaPrometida"),(Object)("FechaRequerida")}));
RDebugUtils.currentLine=12517480;
 //BA.debugLineNum = 12517480;BA.debugLine="Dim CFFecha As DatosCellFactoryJamTableView";
_cffecha = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517481;
 //BA.debugLineNum = 12517481;BA.debugLine="CFFecha.Initialize";
_cffecha.Initialize();
RDebugUtils.currentLine=12517482;
 //BA.debugLineNum = 12517482;BA.debugLine="CFFecha.NombreFuncionCellFactory=jamTableViewGes";
_cffecha.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=12517483;
 //BA.debugLineNum = 12517483;BA.debugLine="CFFecha.CellFactoryEnCallBack=False";
_cffecha.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=12517484;
 //BA.debugLineNum = 12517484;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cffecha,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaPrevVentasDocumento")}));
RDebugUtils.currentLine=12517488;
 //BA.debugLineNum = 12517488;BA.debugLine="Dim CFFechaV As DatosCellFactoryJamTableView";
_cffechav = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517489;
 //BA.debugLineNum = 12517489;BA.debugLine="CFFechaV.Initialize";
_cffechav.Initialize();
RDebugUtils.currentLine=12517490;
 //BA.debugLineNum = 12517490;BA.debugLine="CFFechaV.NombreFuncionCellFactory=\"setFormatoCol";
_cffechav.NombreFuncionCellFactory /*String*/  = "setFormatoColumnaFechaVencida";
RDebugUtils.currentLine=12517492;
 //BA.debugLineNum = 12517492;BA.debugLine="CFFechaV.CellFactoryEnCallBack=True";
_cffechav.CellFactoryEnCallBack /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=12517494;
 //BA.debugLineNum = 12517494;BA.debugLine="Dim FechaHOY As Long=DateUtils.SetDate(DateTime.";
_fechahoy = parent._dateutils._setdate(parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetMonth(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetDayOfMonth(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=12517495;
 //BA.debugLineNum = 12517495;BA.debugLine="CFFechaV.params=Array(FechaHOY,\"red\",\"white\")";
_cffechav.params /*Object[]*/  = new Object[]{(Object)(_fechahoy),(Object)("red"),(Object)("white")};
RDebugUtils.currentLine=12517496;
 //BA.debugLineNum = 12517496;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cffechav,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaDisponibilidad"),(Object)("FechaPrevVentasLinea"),(Object)("FechaTeoricaEntrega")}));
RDebugUtils.currentLine=12517502;
 //BA.debugLineNum = 12517502;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517503;
 //BA.debugLineNum = 12517503;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=12517504;
 //BA.debugLineNum = 12517504;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewGestionV";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_columnabooleanatipointegercheckbox /*String*/ ;
RDebugUtils.currentLine=12517505;
 //BA.debugLineNum = 12517505;BA.debugLine="CF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=12517507;
 //BA.debugLineNum = 12517507;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Personalizado","PedidoBloqueado","PedidoAbierto","Stand_By"}));
RDebugUtils.currentLine=12517509;
 //BA.debugLineNum = 12517509;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517510;
 //BA.debugLineNum = 12517510;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=12517511;
 //BA.debugLineNum = 12517511;BA.debugLine="CF.NombreFuncionCellFactory=\"setColumnaBooleanaN";
_cf.NombreFuncionCellFactory /*String*/  = "setColumnaBooleanaNumericaColorNOSITextoVacio";
RDebugUtils.currentLine=12517512;
 //BA.debugLineNum = 12517512;BA.debugLine="CF.CellFactoryEnCallBack=True";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=12517513;
 //BA.debugLineNum = 12517513;BA.debugLine="CF.params=Array(\"orangered\")";
_cf.params /*Object[]*/  = new Object[]{(Object)("orangered")};
RDebugUtils.currentLine=12517514;
 //BA.debugLineNum = 12517514;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"AlmOrigenGV"}));
RDebugUtils.currentLine=12517574;
 //BA.debugLineNum = 12517574;BA.debugLine="Dim CFStatus As DatosCellFactoryJamTableView";
_cfstatus = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517575;
 //BA.debugLineNum = 12517575;BA.debugLine="CFStatus.Initialize";
_cfstatus.Initialize();
RDebugUtils.currentLine=12517576;
 //BA.debugLineNum = 12517576;BA.debugLine="CFStatus.AliasCampoColumna=\"Status\"";
_cfstatus.AliasCampoColumna /*String*/  = "Status";
RDebugUtils.currentLine=12517577;
 //BA.debugLineNum = 12517577;BA.debugLine="CFStatus.NombreFuncionCellFactory=\"setFormatoCol";
_cfstatus.NombreFuncionCellFactory /*String*/  = "setFormatoColumnaStatus";
RDebugUtils.currentLine=12517578;
 //BA.debugLineNum = 12517578;BA.debugLine="CFStatus.CellFactoryEnCallBack=True";
_cfstatus.CellFactoryEnCallBack /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=12517579;
 //BA.debugLineNum = 12517579;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFStatu";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cfstatus);
RDebugUtils.currentLine=12517590;
 //BA.debugLineNum = 12517590;BA.debugLine="Dim CFNumCurrency As DatosCellFactoryJamTableVie";
_cfnumcurrency = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517591;
 //BA.debugLineNum = 12517591;BA.debugLine="CFNumCurrency.Initialize";
_cfnumcurrency.Initialize();
RDebugUtils.currentLine=12517592;
 //BA.debugLineNum = 12517592;BA.debugLine="CFNumCurrency.AliasCampoColumna=\"ImportePendient";
_cfnumcurrency.AliasCampoColumna /*String*/  = "ImportePendiente";
RDebugUtils.currentLine=12517593;
 //BA.debugLineNum = 12517593;BA.debugLine="CFNumCurrency.NombreFuncionCellFactory=jamTableV";
_cfnumcurrency.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_formatomonedacolumnanumerica /*String*/ ;
RDebugUtils.currentLine=12517594;
 //BA.debugLineNum = 12517594;BA.debugLine="CFNumCurrency.CellFactoryEnCallBack=False";
_cfnumcurrency.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=12517595;
 //BA.debugLineNum = 12517595;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFNumCu";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cfnumcurrency);
RDebugUtils.currentLine=12517597;
 //BA.debugLineNum = 12517597;BA.debugLine="Dim CFNumDec2 As DatosCellFactoryJamTableView";
_cfnumdec2 = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517598;
 //BA.debugLineNum = 12517598;BA.debugLine="CFNumDec2.Initialize";
_cfnumdec2.Initialize();
RDebugUtils.currentLine=12517599;
 //BA.debugLineNum = 12517599;BA.debugLine="CFNumDec2.AliasCampoColumna=\"QtyPteNeta\"";
_cfnumdec2.AliasCampoColumna /*String*/  = "QtyPteNeta";
RDebugUtils.currentLine=12517600;
 //BA.debugLineNum = 12517600;BA.debugLine="CFNumDec2.NombreFuncionCellFactory=jamTableViewG";
_cfnumdec2.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_formatostringdecimalescolumnanumerica /*String*/ ;
RDebugUtils.currentLine=12517601;
 //BA.debugLineNum = 12517601;BA.debugLine="CFNumDec2.CellFactoryEnCallBack=False";
_cfnumdec2.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=12517602;
 //BA.debugLineNum = 12517602;BA.debugLine="CFNumDec2.params=Array(\"#,##0.##\")";
_cfnumdec2.params /*Object[]*/  = new Object[]{(Object)("#,##0.##")};
RDebugUtils.currentLine=12517603;
 //BA.debugLineNum = 12517603;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFNumDe";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cfnumdec2);
RDebugUtils.currentLine=12517605;
 //BA.debugLineNum = 12517605;BA.debugLine="Dim CFNumDec2 As DatosCellFactoryJamTableView";
_cfnumdec2 = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517606;
 //BA.debugLineNum = 12517606;BA.debugLine="CFNumDec2.Initialize";
_cfnumdec2.Initialize();
RDebugUtils.currentLine=12517607;
 //BA.debugLineNum = 12517607;BA.debugLine="CFNumDec2.AliasCampoColumna=\"StockLibre\"";
_cfnumdec2.AliasCampoColumna /*String*/  = "StockLibre";
RDebugUtils.currentLine=12517608;
 //BA.debugLineNum = 12517608;BA.debugLine="CFNumDec2.NombreFuncionCellFactory=jamTableViewG";
_cfnumdec2.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_formatostringdecimalescolumnanumerica /*String*/ ;
RDebugUtils.currentLine=12517609;
 //BA.debugLineNum = 12517609;BA.debugLine="CFNumDec2.CellFactoryEnCallBack=False";
_cfnumdec2.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=12517610;
 //BA.debugLineNum = 12517610;BA.debugLine="CFNumDec2.params=Array(\"#,##0.##\")";
_cfnumdec2.params /*Object[]*/  = new Object[]{(Object)("#,##0.##")};
RDebugUtils.currentLine=12517611;
 //BA.debugLineNum = 12517611;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(CFNumDe";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cfnumdec2);
RDebugUtils.currentLine=12517617;
 //BA.debugLineNum = 12517617;BA.debugLine="Dim CFDesArt As DatosCellFactoryJamTableView";
_cfdesart = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12517618;
 //BA.debugLineNum = 12517618;BA.debugLine="CFDesArt.Initialize";
_cfdesart.Initialize();
RDebugUtils.currentLine=12517619;
 //BA.debugLineNum = 12517619;BA.debugLine="CFDesArt.NombreFuncionCellFactory=jamTableViewGe";
_cfdesart.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_columnawraptext /*String*/ ;
RDebugUtils.currentLine=12517620;
 //BA.debugLineNum = 12517620;BA.debugLine="CFDesArt.CellFactoryEnCallBack=False";
_cfdesart.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=12517621;
 //BA.debugLineNum = 12517621;BA.debugLine="jamTableViewGestionVentas.SetCellFactoryListaCam";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cfdesart,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"DescripcionArticulo","PedidoCliente","NombreCliente"}));
RDebugUtils.currentLine=12517631;
 //BA.debugLineNum = 12517631;BA.debugLine="jamTableViewGestionVentas.ToolTipTableColumn(\"St";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._tooltiptablecolumn /*String*/ (null,"Status","L:Linea Completa."+parent.__c.CRLF+"P:Pedido Completo"+parent.__c.CRLF+"+: Diponible acum>=0"+parent.__c.CRLF+"-: Diponible acum<0");
RDebugUtils.currentLine=12517634;
 //BA.debugLineNum = 12517634;BA.debugLine="jamTableViewGestionVentas.TableViewEditable=True";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._settablevieweditable /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=12517638;
 //BA.debugLineNum = 12517638;BA.debugLine="jamTableViewGestionVentas.AlturaFilas=0";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=12517640;
 //BA.debugLineNum = 12517640;BA.debugLine="jamTableViewGestionVentas.ToolTipTableColumnColo";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._tooltiptablecolumncolorfondocolortextosizefont /*String*/ (null,"FechaTeoricaEntrega","Fecha Material, si existe, y si no existe, Fecha de documento+Plazo configurado según Artículo-Cliente-GRP-Ruta)","BLACK","LIGHTYELLOW",(float) (14));
RDebugUtils.currentLine=12517644;
 //BA.debugLineNum = 12517644;BA.debugLine="Inicio";
__ref._inicio /*String*/ (null);
RDebugUtils.currentLine=12517645;
 //BA.debugLineNum = 12517645;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _abrirventanaoutlookemail(b4j.docU.cgestionventas __ref,String _titulowindow,String _documento) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "abrirventanaoutlookemail", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "abrirventanaoutlookemail", new Object[] {_titulowindow,_documento}));}
ResumableSub_AbrirVentanaOutlookEmail rsub = new ResumableSub_AbrirVentanaOutlookEmail(this,__ref,_titulowindow,_documento);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AbrirVentanaOutlookEmail extends BA.ResumableSub {
public ResumableSub_AbrirVentanaOutlookEmail(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _titulowindow,String _documento) {
this.parent = parent;
this.__ref = __ref;
this._titulowindow = _titulowindow;
this._documento = _documento;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _titulowindow;
String _documento;
anywheresoftware.b4j.object.JavaObject _wu = null;
anywheresoftware.b4a.objects.collections.List _l = null;
boolean _flagok = false;
anywheresoftware.b4j.object.JavaObject _jo = null;
String _t = "";
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
parent.__c.LogImpl("815204355","Buscando window title "+_titulowindow,0);
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="Dim WU As JavaObject";
_wu = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
_wu.InitializeStatic("com.sun.jna.platform.WindowUtils");
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_wu.RunMethod("getAllWindows",new Object[]{(Object)(parent.__c.False)})));
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="Dim FlagOk As Boolean";
_flagok = false;
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="For Each JO As JavaObject In L";
if (true) break;

case 1:
//for
this.state = 8;
_jo = new anywheresoftware.b4j.object.JavaObject();
group6 = _l;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 14;
if (true) break;

case 14:
//C
this.state = 8;
if (index6 < groupLen6) {
this.state = 3;
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group6.Get(index6)));}
if (true) break;

case 15:
//C
this.state = 14;
index6++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
_t = BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(parent.__c.Null)));
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="Log(\"window title\" & t)";
parent.__c.LogImpl("815204365","window title"+_t,0);
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="If t.Contains(TituloWindow) Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_t.contains(_titulowindow)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="FlagOk=True";
_flagok = parent.__c.True;
RDebugUtils.currentLine=15204377;
 //BA.debugLineNum = 15204377;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 15;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=15204381;
 //BA.debugLineNum = 15204381;BA.debugLine="If FlagOk Then";

case 8:
//if
this.state = 13;
if (_flagok) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=15204382;
 //BA.debugLineNum = 15204382;BA.debugLine="SetForegroundWindowREPSOL(t,False)";
__ref._setforegroundwindowrepsol /*boolean*/ (null,_t,parent.__c.False);
RDebugUtils.currentLine=15204383;
 //BA.debugLineNum = 15204383;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=15204385;
 //BA.debugLineNum = 15204385;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No se ha enc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No se ha encontrado la ventana de Outlook con el correo correspondiente al documento "+parent.__c.SmartStringFormatter("",(Object)(_documento))+"\n"+"Busca manualmente la ventana en outlook para enviar el email.\n"+""),"Aviso");
RDebugUtils.currentLine=15204388;
 //BA.debugLineNum = 15204388;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "abrirventanaoutlookemail"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 13;
;
RDebugUtils.currentLine=15204389;
 //BA.debugLineNum = 15204389;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=15204393;
 //BA.debugLineNum = 15204393;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public boolean  _setforegroundwindowrepsol(b4j.docU.cgestionventas __ref,String _title,boolean _justfind) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "setforegroundwindowrepsol", false))
	 {return ((Boolean) Debug.delegate(ba, "setforegroundwindowrepsol", new Object[] {_title,_justfind}));}
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub SetForegroundWindowREPSOL(Title As String, Jus";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Return Me.As(JavaObject).RunMethod(\"SetForeground";
if (true) return BA.ObjectToBoolean(((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this))).RunMethod("SetForegroundWindow",new Object[]{(Object)(_title),(Object)(_justfind)}));
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizaciondatos(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "actualizaciondatos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizaciondatos", null));}
ResumableSub_ActualizacionDatos rsub = new ResumableSub_ActualizacionDatos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizacionDatos extends BA.ResumableSub {
public ResumableSub_ActualizacionDatos(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
Object _senderfilter = null;
boolean _success = false;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreggv = null;
int _regins = 0;
Object _msa = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
long _fechahoy = 0L;
String _datetimeformatant = "";
String _sfechahoy = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.List _lstregstockalmnogv = null;
anywheresoftware.b4a.objects.collections.Map _mstnogv = null;
int _qstock = 0;
anywheresoftware.b4a.objects.collections.List _lstregresalmzen = null;
anywheresoftware.b4a.objects.collections.List _lstregfp = null;
anywheresoftware.b4a.objects.collections.List _lstregpcrec = null;
anywheresoftware.b4a.objects.collections.List _lstregosubrec = null;
long _tickshoracerodia = 0L;
b4j.example.dateutils._period _periodo = null;
long _tickshoracerodiasiguiente = 0L;
anywheresoftware.b4a.objects.collections.List _lstregconfpl = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcp = null;
long _tpd = 0L;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
String _doc = "";
int _numlindocsinfechacalcprevventas = 0;
long _maxfechacalcprevventasdoc = 0L;
String _dateformatant = "";
anywheresoftware.b4a.BA.IterableList group49;
int index49;
int groupLen49;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("delete from tblGestionVentas",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 320;
return;
case 320:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976133","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976149;
 //BA.debugLineNum = 12976149;BA.debugLine="DatosGestionVentas";
__ref._datosgestionventas /*void*/ (null);
RDebugUtils.currentLine=12976150;
 //BA.debugLineNum = 12976150;BA.debugLine="Wait For DatosGestionVentas_Completed (Accion As";
parent.__c.WaitFor("datosgestionventas_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 321;
return;
case 321:
//C
this.state = 1;
_accion = (String) result[1];
_lstreggv = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=12976151;
 //BA.debugLineNum = 12976151;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("Salir")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=12976161;
 //BA.debugLineNum = 12976161;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("delete from tblGestionVentasCalculos",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976162;
 //BA.debugLineNum = 12976162;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976163;
 //BA.debugLineNum = 12976163;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 322;
return;
case 322:
//C
this.state = 5;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976164;
 //BA.debugLineNum = 12976164;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976164","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976166;
 //BA.debugLineNum = 12976166;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblGestion";
parent._dbutils._insertmaps /*boolean*/ (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ ,"tblGestionVentasCalculos",_lstreggv);
RDebugUtils.currentLine=12976168;
 //BA.debugLineNum = 12976168;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySing";
_regins = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblGestionVentasCalculos")));
RDebugUtils.currentLine=12976169;
 //BA.debugLineNum = 12976169;BA.debugLine="If regIns<>lstRegGV.Size Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_regins!=_lstreggv.getSize()) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=12976170;
 //BA.debugLineNum = 12976170;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite,";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite, revisar logs.","Error");
RDebugUtils.currentLine=12976171;
 //BA.debugLineNum = 12976171;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 323;
return;
case 323:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=12976174;
 //BA.debugLineNum = 12976174;BA.debugLine="lstRegGV.Clear";
_lstreggv.Clear();
RDebugUtils.currentLine=12976179;
 //BA.debugLineNum = 12976179;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("delete from tblGestionVentasCalculos where AlmOrigen=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("0026")}));
RDebugUtils.currentLine=12976180;
 //BA.debugLineNum = 12976180;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976181;
 //BA.debugLineNum = 12976181;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 324;
return;
case 324:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976182;
 //BA.debugLineNum = 12976182;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976182","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976210;
 //BA.debugLineNum = 12976210;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976211;
 //BA.debugLineNum = 12976211;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976212;
 //BA.debugLineNum = 12976212;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set CompraFab = iif(Fabricacion=0,?,?)");
RDebugUtils.currentLine=12976213;
 //BA.debugLineNum = 12976213;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Compra","Fab"}));
RDebugUtils.currentLine=12976215;
 //BA.debugLineNum = 12976215;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976216;
 //BA.debugLineNum = 12976216;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 325;
return;
case 325:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976217;
 //BA.debugLineNum = 12976217;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976217","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976220;
 //BA.debugLineNum = 12976220;BA.debugLine="Dim FechaHOY As Long=DateUtils.SetDate(DateTime.G";
_fechahoy = parent._dateutils._setdate(parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetMonth(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetDayOfMonth(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=12976221;
 //BA.debugLineNum = 12976221;BA.debugLine="Dim DateTimeFormatAnt As String=DateTime.DateForm";
_datetimeformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=12976222;
 //BA.debugLineNum = 12976222;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=12976223;
 //BA.debugLineNum = 12976223;BA.debugLine="Dim sFechaHOY As String=DateTime.Date(FechaHOY)";
_sfechahoy = parent.__c.DateTime.Date(_fechahoy);
RDebugUtils.currentLine=12976224;
 //BA.debugLineNum = 12976224;BA.debugLine="Log(\"sFECHA \" & sFechaHOY)";
parent.__c.LogImpl("812976224","sFECHA "+_sfechahoy,0);
RDebugUtils.currentLine=12976225;
 //BA.debugLineNum = 12976225;BA.debugLine="DateTime.DateFormat=DateTimeFormatAnt";
parent.__c.DateTime.setDateFormat(_datetimeformatant);
RDebugUtils.currentLine=12976228;
 //BA.debugLineNum = 12976228;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("delete from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976229;
 //BA.debugLineNum = 12976229;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976230;
 //BA.debugLineNum = 12976230;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 326;
return;
case 326:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976231;
 //BA.debugLineNum = 12976231;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976231","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976233;
 //BA.debugLineNum = 12976233;BA.debugLine="wait for (ExistenciasArtTallaAlmacenLineasGestion";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), __ref._existenciasarttallaalmacenlineasgestionventasalmnogv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 327;
return;
case 327:
//C
this.state = 9;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12976234;
 //BA.debugLineNum = 12976234;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=12976235;
 //BA.debugLineNum = 12976235;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_accion).equals("Salir")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=12976236;
 //BA.debugLineNum = 12976236;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=12976238;
 //BA.debugLineNum = 12976238;BA.debugLine="Dim lstRegStockAlmNoGV As List=mRes.Get(\"lstRegis";
_lstregstockalmnogv = new anywheresoftware.b4a.objects.collections.List();
_lstregstockalmnogv = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRegistros"))));
RDebugUtils.currentLine=12976239;
 //BA.debugLineNum = 12976239;BA.debugLine="If lstRegStockAlmNoGV.Size>0 Then";
if (true) break;

case 13:
//if
this.state = 20;
if (_lstregstockalmnogv.getSize()>0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12976240;
 //BA.debugLineNum = 12976240;BA.debugLine="For Each mStNoGV As Map In lstRegStockAlmNoGV";
if (true) break;

case 16:
//for
this.state = 19;
_mstnogv = new anywheresoftware.b4a.objects.collections.Map();
group49 = _lstregstockalmnogv;
index49 = 0;
groupLen49 = group49.getSize();
this.state = 328;
if (true) break;

case 328:
//C
this.state = 19;
if (index49 < groupLen49) {
this.state = 18;
_mstnogv = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group49.Get(index49)));}
if (true) break;

case 329:
//C
this.state = 328;
index49++;
if (true) break;

case 18:
//C
this.state = 329;
RDebugUtils.currentLine=12976241;
 //BA.debugLineNum = 12976241;BA.debugLine="Dim QStock As Int=mStNoGV.Get(\"Stock\")";
_qstock = (int)(BA.ObjectToNumber(_mstnogv.Get((Object)("Stock"))));
RDebugUtils.currentLine=12976242;
 //BA.debugLineNum = 12976242;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"insert in";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV (Almacen, Articulo, Talla, Fecha, QtyDisponible, sFecha) values (?,?,?,?,?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_mstnogv.Get((Object)("AlmOrigenDoc")),_mstnogv.Get((Object)("Articulo")),_mstnogv.Get((Object)("Talla")),(Object)(_fechahoy),(Object)(_qstock),(Object)(_sfechahoy)}));
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=12976246;
 //BA.debugLineNum = 12976246;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976247;
 //BA.debugLineNum = 12976247;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 330;
return;
case 330:
//C
this.state = 20;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976248;
 //BA.debugLineNum = 12976248;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976248","NonQuery: "+BA.ObjectToString(_success),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=12976252;
 //BA.debugLineNum = 12976252;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976253;
 //BA.debugLineNum = 12976253;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976254;
 //BA.debugLineNum = 12976254;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos as t1";
_sb.Append("update tblGestionVentasCalculos as t1 set StockAlmNoGV = ifnull((Select Stock from (Select Almacen, Articulo, Talla, QtyDisponible As Stock from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV) t2 ");
RDebugUtils.currentLine=12976255;
 //BA.debugLineNum = 12976255;BA.debugLine="sb.Append(\" where t1.AlmOrigenGV=0 And t1.AlmOrig";
_sb.Append(" where t1.AlmOrigenGV=0 And t1.AlmOrigen=t2.Almacen And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla),0)");
RDebugUtils.currentLine=12976257;
 //BA.debugLineNum = 12976257;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976258;
 //BA.debugLineNum = 12976258;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976259;
 //BA.debugLineNum = 12976259;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 331;
return;
case 331:
//C
this.state = 21;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976260;
 //BA.debugLineNum = 12976260;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976260","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976261;
 //BA.debugLineNum = 12976261;BA.debugLine="If Not(Success) Then";
if (true) break;

case 21:
//if
this.state = 26;
if (parent.__c.Not(_success)) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=12976262;
 //BA.debugLineNum = 12976262;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976263;
 //BA.debugLineNum = 12976263;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 332;
return;
case 332:
//C
this.state = 26;
;
RDebugUtils.currentLine=12976264;
 //BA.debugLineNum = 12976264;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976265;
 //BA.debugLineNum = 12976265;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=12976267;
 //BA.debugLineNum = 12976267;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976267","Success SQLite update tblGestionVentasCalculos Stock Alm No GV",0);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=12976272;
 //BA.debugLineNum = 12976272;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"delete from";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("delete from tblStockDisponibleArticuloTallaFecha",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976273;
 //BA.debugLineNum = 12976273;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976274;
 //BA.debugLineNum = 12976274;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 333;
return;
case 333:
//C
this.state = 27;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976275;
 //BA.debugLineNum = 12976275;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976275","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976280;
 //BA.debugLineNum = 12976280;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"insert into";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFecha select distinct Articulo, Talla, "+BA.NumberToString(_fechahoy)+", StockLibre, '"+_sfechahoy+"' from tblGestionVentasCalculos where StockLibre>0",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976282;
 //BA.debugLineNum = 12976282;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976283;
 //BA.debugLineNum = 12976283;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 334;
return;
case 334:
//C
this.state = 27;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976284;
 //BA.debugLineNum = 12976284;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976284","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976285;
 //BA.debugLineNum = 12976285;BA.debugLine="If Not(Success) Then";
if (true) break;

case 27:
//if
this.state = 32;
if (parent.__c.Not(_success)) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=12976286;
 //BA.debugLineNum = 12976286;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976287;
 //BA.debugLineNum = 12976287;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 335;
return;
case 335:
//C
this.state = 32;
;
RDebugUtils.currentLine=12976288;
 //BA.debugLineNum = 12976288;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976289;
 //BA.debugLineNum = 12976289;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=12976291;
 //BA.debugLineNum = 12976291;BA.debugLine="Log(\"Success insert into tblStockDisponibleArtic";
parent.__c.LogImpl("812976291","Success insert into tblStockDisponibleArticuloTallaFecha (Stock libre-> fecha hoy)",0);
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=12976295;
 //BA.debugLineNum = 12976295;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976296;
 //BA.debugLineNum = 12976296;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976297;
 //BA.debugLineNum = 12976297;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set QtyPteNetaAcum = ");
RDebugUtils.currentLine=12976298;
 //BA.debugLineNum = 12976298;BA.debugLine="sb.append(\"(Select sum(QtyPteNeta) from tblGestio";
_sb.Append("(Select sum(QtyPteNeta) from tblGestionVentasCalculos t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and AlmOrigenGV=1)");
RDebugUtils.currentLine=12976299;
 //BA.debugLineNum = 12976299;BA.debugLine="sb.Append(\" where AlmOrigenGV=1\")";
_sb.Append(" where AlmOrigenGV=1");
RDebugUtils.currentLine=12976300;
 //BA.debugLineNum = 12976300;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976301;
 //BA.debugLineNum = 12976301;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976302;
 //BA.debugLineNum = 12976302;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 336;
return;
case 336:
//C
this.state = 33;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976303;
 //BA.debugLineNum = 12976303;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976303","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976304;
 //BA.debugLineNum = 12976304;BA.debugLine="If Not(Success) Then";
if (true) break;

case 33:
//if
this.state = 38;
if (parent.__c.Not(_success)) { 
this.state = 35;
}else {
this.state = 37;
}if (true) break;

case 35:
//C
this.state = 38;
RDebugUtils.currentLine=12976305;
 //BA.debugLineNum = 12976305;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976306;
 //BA.debugLineNum = 12976306;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 337;
return;
case 337:
//C
this.state = 38;
;
RDebugUtils.currentLine=12976307;
 //BA.debugLineNum = 12976307;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976308;
 //BA.debugLineNum = 12976308;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=12976310;
 //BA.debugLineNum = 12976310;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976310","Success SQLite update tblGestionVentasCalculos  Running Sum de QtyPteNeta en GestionVentas por artículo-talla",0);
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=12976314;
 //BA.debugLineNum = 12976314;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976315;
 //BA.debugLineNum = 12976315;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976316;
 //BA.debugLineNum = 12976316;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set QtyPteNetaAcum = ");
RDebugUtils.currentLine=12976317;
 //BA.debugLineNum = 12976317;BA.debugLine="sb.append(\"(Select sum(QtyPteNeta) from tblGestio";
_sb.Append("(Select sum(QtyPteNeta) from tblGestionVentasCalculos t2 where t2.ROWID<=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and t1.AlmOrigen=t2.AlmOrigen)");
RDebugUtils.currentLine=12976318;
 //BA.debugLineNum = 12976318;BA.debugLine="sb.Append(\" where AlmOrigenGV=0\")";
_sb.Append(" where AlmOrigenGV=0");
RDebugUtils.currentLine=12976319;
 //BA.debugLineNum = 12976319;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976320;
 //BA.debugLineNum = 12976320;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976321;
 //BA.debugLineNum = 12976321;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 338;
return;
case 338:
//C
this.state = 39;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976322;
 //BA.debugLineNum = 12976322;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976322","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976323;
 //BA.debugLineNum = 12976323;BA.debugLine="If Not(Success) Then";
if (true) break;

case 39:
//if
this.state = 44;
if (parent.__c.Not(_success)) { 
this.state = 41;
}else {
this.state = 43;
}if (true) break;

case 41:
//C
this.state = 44;
RDebugUtils.currentLine=12976324;
 //BA.debugLineNum = 12976324;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976325;
 //BA.debugLineNum = 12976325;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 339;
return;
case 339:
//C
this.state = 44;
;
RDebugUtils.currentLine=12976326;
 //BA.debugLineNum = 12976326;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976327;
 //BA.debugLineNum = 12976327;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=12976329;
 //BA.debugLineNum = 12976329;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976329","Success SQLite update tblGestionVentasCalculos  Running Sum de QtyPteNeta en GestionVentas por artículo-talla  almNoGV",0);
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=12976341;
 //BA.debugLineNum = 12976341;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976342;
 //BA.debugLineNum = 12976342;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976343;
 //BA.debugLineNum = 12976343;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set QtyDisponibleAcum = ");
RDebugUtils.currentLine=12976345;
 //BA.debugLineNum = 12976345;BA.debugLine="sb.append(\"(Select (StockLibre-QtyPteNetaAcum) fr";
_sb.Append("(Select (StockLibre-QtyPteNetaAcum) from tblGestionVentasCalculos t2 where t2.ROWID=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla and AlmOrigenGV=1)");
RDebugUtils.currentLine=12976346;
 //BA.debugLineNum = 12976346;BA.debugLine="sb.Append(\" where AlmOrigenGV=1\")";
_sb.Append(" where AlmOrigenGV=1");
RDebugUtils.currentLine=12976347;
 //BA.debugLineNum = 12976347;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976348;
 //BA.debugLineNum = 12976348;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976349;
 //BA.debugLineNum = 12976349;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 340;
return;
case 340:
//C
this.state = 45;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976350;
 //BA.debugLineNum = 12976350;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976350","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976351;
 //BA.debugLineNum = 12976351;BA.debugLine="If Not(Success) Then";
if (true) break;

case 45:
//if
this.state = 50;
if (parent.__c.Not(_success)) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=12976352;
 //BA.debugLineNum = 12976352;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976353;
 //BA.debugLineNum = 12976353;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 341;
return;
case 341:
//C
this.state = 50;
;
RDebugUtils.currentLine=12976354;
 //BA.debugLineNum = 12976354;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976355;
 //BA.debugLineNum = 12976355;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=12976357;
 //BA.debugLineNum = 12976357;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976357","Success SQLite update tblGestionVentasCalculos Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla",0);
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=12976362;
 //BA.debugLineNum = 12976362;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976363;
 //BA.debugLineNum = 12976363;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976364;
 //BA.debugLineNum = 12976364;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set QtyDisponibleAcum = ");
RDebugUtils.currentLine=12976366;
 //BA.debugLineNum = 12976366;BA.debugLine="sb.append(\"(Select (StockAlmNoGV-QtyPteNetaAcum)";
_sb.Append("(Select (StockAlmNoGV-QtyPteNetaAcum) from tblGestionVentasCalculos t2 where t2.ROWID=t1.rowid And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)");
RDebugUtils.currentLine=12976367;
 //BA.debugLineNum = 12976367;BA.debugLine="sb.Append(\" where AlmOrigenGV=0\")";
_sb.Append(" where AlmOrigenGV=0");
RDebugUtils.currentLine=12976368;
 //BA.debugLineNum = 12976368;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976369;
 //BA.debugLineNum = 12976369;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976370;
 //BA.debugLineNum = 12976370;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 342;
return;
case 342:
//C
this.state = 51;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976371;
 //BA.debugLineNum = 12976371;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976371","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976372;
 //BA.debugLineNum = 12976372;BA.debugLine="If Not(Success) Then";
if (true) break;

case 51:
//if
this.state = 56;
if (parent.__c.Not(_success)) { 
this.state = 53;
}else {
this.state = 55;
}if (true) break;

case 53:
//C
this.state = 56;
RDebugUtils.currentLine=12976373;
 //BA.debugLineNum = 12976373;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976374;
 //BA.debugLineNum = 12976374;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 343;
return;
case 343:
//C
this.state = 56;
;
RDebugUtils.currentLine=12976375;
 //BA.debugLineNum = 12976375;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976376;
 //BA.debugLineNum = 12976376;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=12976378;
 //BA.debugLineNum = 12976378;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976378","Success SQLite update tblGestionVentasCalculos Running Sum de QtyDisponibleAcum en GestionVentas por artículo-talla",0);
 if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=12976384;
 //BA.debugLineNum = 12976384;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976385;
 //BA.debugLineNum = 12976385;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976386;
 //BA.debugLineNum = 12976386;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set St";
_sb.Append("update tblGestionVentasCalculos set Status = ?");
RDebugUtils.currentLine=12976387;
 //BA.debugLineNum = 12976387;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{""}));
RDebugUtils.currentLine=12976388;
 //BA.debugLineNum = 12976388;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976389;
 //BA.debugLineNum = 12976389;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 344;
return;
case 344:
//C
this.state = 57;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976390;
 //BA.debugLineNum = 12976390;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976390","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976391;
 //BA.debugLineNum = 12976391;BA.debugLine="If Not(Success) Then";
if (true) break;

case 57:
//if
this.state = 62;
if (parent.__c.Not(_success)) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
RDebugUtils.currentLine=12976392;
 //BA.debugLineNum = 12976392;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976393;
 //BA.debugLineNum = 12976393;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 345;
return;
case 345:
//C
this.state = 62;
;
RDebugUtils.currentLine=12976394;
 //BA.debugLineNum = 12976394;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976395;
 //BA.debugLineNum = 12976395;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=12976397;
 //BA.debugLineNum = 12976397;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976397","Success SQLite update tblGestionVentasCalculos Limpiar Status",0);
 if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=12976400;
 //BA.debugLineNum = 12976400;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976401;
 //BA.debugLineNum = 12976401;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976402;
 //BA.debugLineNum = 12976402;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set Status = ?");
RDebugUtils.currentLine=12976403;
 //BA.debugLineNum = 12976403;BA.debugLine="sb.append(\" where (StockLibre-QtyPteNeta)>=0 and";
_sb.Append(" where (StockLibre-QtyPteNeta)>=0 and QtyDisponibleAcum>=0 and AlmOrigenGV=1");
RDebugUtils.currentLine=12976404;
 //BA.debugLineNum = 12976404;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"L+"}));
RDebugUtils.currentLine=12976405;
 //BA.debugLineNum = 12976405;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976406;
 //BA.debugLineNum = 12976406;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 346;
return;
case 346:
//C
this.state = 63;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976407;
 //BA.debugLineNum = 12976407;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976407","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976408;
 //BA.debugLineNum = 12976408;BA.debugLine="If Not(Success) Then";
if (true) break;

case 63:
//if
this.state = 68;
if (parent.__c.Not(_success)) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
RDebugUtils.currentLine=12976409;
 //BA.debugLineNum = 12976409;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976410;
 //BA.debugLineNum = 12976410;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 347;
return;
case 347:
//C
this.state = 68;
;
RDebugUtils.currentLine=12976411;
 //BA.debugLineNum = 12976411;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976412;
 //BA.debugLineNum = 12976412;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=12976414;
 //BA.debugLineNum = 12976414;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976414","Success SQLite update tblGestionVentasCalculos Status L+",0);
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=12976417;
 //BA.debugLineNum = 12976417;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976418;
 //BA.debugLineNum = 12976418;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976419;
 //BA.debugLineNum = 12976419;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set Status = ?");
RDebugUtils.currentLine=12976420;
 //BA.debugLineNum = 12976420;BA.debugLine="sb.append(\" where (StockAlmNoGV-QtyPteNeta)>=0 an";
_sb.Append(" where (StockAlmNoGV-QtyPteNeta)>=0 and QtyDisponibleAcum>=0 and AlmOrigenGV=0");
RDebugUtils.currentLine=12976421;
 //BA.debugLineNum = 12976421;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"L+"}));
RDebugUtils.currentLine=12976422;
 //BA.debugLineNum = 12976422;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976423;
 //BA.debugLineNum = 12976423;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 348;
return;
case 348:
//C
this.state = 69;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976424;
 //BA.debugLineNum = 12976424;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976424","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976425;
 //BA.debugLineNum = 12976425;BA.debugLine="If Not(Success) Then";
if (true) break;

case 69:
//if
this.state = 74;
if (parent.__c.Not(_success)) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 74;
RDebugUtils.currentLine=12976426;
 //BA.debugLineNum = 12976426;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976427;
 //BA.debugLineNum = 12976427;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 349;
return;
case 349:
//C
this.state = 74;
;
RDebugUtils.currentLine=12976428;
 //BA.debugLineNum = 12976428;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976429;
 //BA.debugLineNum = 12976429;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=12976431;
 //BA.debugLineNum = 12976431;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976431","Success SQLite update tblGestionVentasCalculos Status L+",0);
 if (true) break;

case 74:
//C
this.state = 75;
;
RDebugUtils.currentLine=12976434;
 //BA.debugLineNum = 12976434;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976435;
 //BA.debugLineNum = 12976435;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976436;
 //BA.debugLineNum = 12976436;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set Status = ?");
RDebugUtils.currentLine=12976437;
 //BA.debugLineNum = 12976437;BA.debugLine="sb.append(\" where (StockLibre-QtyPteNeta)>=0 and";
_sb.Append(" where (StockLibre-QtyPteNeta)>=0 and QtyDisponibleAcum<0  and AlmOrigenGV=1");
RDebugUtils.currentLine=12976438;
 //BA.debugLineNum = 12976438;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"L-"}));
RDebugUtils.currentLine=12976439;
 //BA.debugLineNum = 12976439;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976440;
 //BA.debugLineNum = 12976440;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 350;
return;
case 350:
//C
this.state = 75;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976441;
 //BA.debugLineNum = 12976441;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976441","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976442;
 //BA.debugLineNum = 12976442;BA.debugLine="If Not(Success) Then";
if (true) break;

case 75:
//if
this.state = 80;
if (parent.__c.Not(_success)) { 
this.state = 77;
}else {
this.state = 79;
}if (true) break;

case 77:
//C
this.state = 80;
RDebugUtils.currentLine=12976443;
 //BA.debugLineNum = 12976443;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976444;
 //BA.debugLineNum = 12976444;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 351;
return;
case 351:
//C
this.state = 80;
;
RDebugUtils.currentLine=12976445;
 //BA.debugLineNum = 12976445;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976446;
 //BA.debugLineNum = 12976446;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=12976448;
 //BA.debugLineNum = 12976448;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976448","Success SQLite update tblGestionVentasCalculos Status L-",0);
 if (true) break;

case 80:
//C
this.state = 81;
;
RDebugUtils.currentLine=12976451;
 //BA.debugLineNum = 12976451;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976452;
 //BA.debugLineNum = 12976452;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976453;
 //BA.debugLineNum = 12976453;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set Status = ?");
RDebugUtils.currentLine=12976454;
 //BA.debugLineNum = 12976454;BA.debugLine="sb.append(\" where (StockAlmNoGV-QtyPteNeta)>=0 an";
_sb.Append(" where (StockAlmNoGV-QtyPteNeta)>=0 and QtyDisponibleAcum<0 and AlmOrigenGV=0");
RDebugUtils.currentLine=12976455;
 //BA.debugLineNum = 12976455;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"L-"}));
RDebugUtils.currentLine=12976456;
 //BA.debugLineNum = 12976456;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976457;
 //BA.debugLineNum = 12976457;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 352;
return;
case 352:
//C
this.state = 81;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976458;
 //BA.debugLineNum = 12976458;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976458","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976459;
 //BA.debugLineNum = 12976459;BA.debugLine="If Not(Success) Then";
if (true) break;

case 81:
//if
this.state = 86;
if (parent.__c.Not(_success)) { 
this.state = 83;
}else {
this.state = 85;
}if (true) break;

case 83:
//C
this.state = 86;
RDebugUtils.currentLine=12976460;
 //BA.debugLineNum = 12976460;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976461;
 //BA.debugLineNum = 12976461;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 353;
return;
case 353:
//C
this.state = 86;
;
RDebugUtils.currentLine=12976462;
 //BA.debugLineNum = 12976462;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976463;
 //BA.debugLineNum = 12976463;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 85:
//C
this.state = 86;
RDebugUtils.currentLine=12976465;
 //BA.debugLineNum = 12976465;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976465","Success SQLite update tblGestionVentasCalculos Status L-",0);
 if (true) break;

case 86:
//C
this.state = 87;
;
RDebugUtils.currentLine=12976469;
 //BA.debugLineNum = 12976469;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976470;
 //BA.debugLineNum = 12976470;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976471;
 //BA.debugLineNum = 12976471;BA.debugLine="sb.Append(\"UPDATE tblGestionVentasCalculos SET ST";
_sb.Append("UPDATE tblGestionVentasCalculos SET STATUS=? WHERE Documento in (");
RDebugUtils.currentLine=12976472;
 //BA.debugLineNum = 12976472;BA.debugLine="sb.Append(\"Select tLineasDoc.Documento \")";
_sb.Append("Select tLineasDoc.Documento ");
RDebugUtils.currentLine=12976473;
 //BA.debugLineNum = 12976473;BA.debugLine="sb.append(\"FROM \")";
_sb.Append("FROM ");
RDebugUtils.currentLine=12976474;
 //BA.debugLineNum = 12976474;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
_sb.Append("(Select Documento, count(Linea) As NumLineas from tblGestionVentasCalculos group by Documento) tLineasDoc ");
RDebugUtils.currentLine=12976475;
 //BA.debugLineNum = 12976475;BA.debugLine="sb.append(\"LEFT JOIN \")";
_sb.Append("LEFT JOIN ");
RDebugUtils.currentLine=12976476;
 //BA.debugLineNum = 12976476;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
_sb.Append("(Select Documento, count(Linea) As NumLineasCompletas FROM tblGestionVentasCalculos WHERE Status='L+' GROUP BY Documento) tLineasDocCompletas ");
RDebugUtils.currentLine=12976477;
 //BA.debugLineNum = 12976477;BA.debugLine="sb.append(\"USING (Documento) \")";
_sb.Append("USING (Documento) ");
RDebugUtils.currentLine=12976478;
 //BA.debugLineNum = 12976478;BA.debugLine="sb.append(\"WHERE  tLineasDoc.NumLineas=coalesce(t";
_sb.Append("WHERE  tLineasDoc.NumLineas=coalesce(tLineasDocCompletas.NumLineasCompletas,0))");
RDebugUtils.currentLine=12976479;
 //BA.debugLineNum = 12976479;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("P+")}));
RDebugUtils.currentLine=12976480;
 //BA.debugLineNum = 12976480;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976481;
 //BA.debugLineNum = 12976481;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 354;
return;
case 354:
//C
this.state = 87;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976482;
 //BA.debugLineNum = 12976482;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976482","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976483;
 //BA.debugLineNum = 12976483;BA.debugLine="If Not(Success) Then";
if (true) break;

case 87:
//if
this.state = 92;
if (parent.__c.Not(_success)) { 
this.state = 89;
}else {
this.state = 91;
}if (true) break;

case 89:
//C
this.state = 92;
RDebugUtils.currentLine=12976484;
 //BA.debugLineNum = 12976484;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976485;
 //BA.debugLineNum = 12976485;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 355;
return;
case 355:
//C
this.state = 92;
;
RDebugUtils.currentLine=12976486;
 //BA.debugLineNum = 12976486;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976487;
 //BA.debugLineNum = 12976487;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 91:
//C
this.state = 92;
RDebugUtils.currentLine=12976489;
 //BA.debugLineNum = 12976489;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976489","Success SQLite update tblGestionVentasCalculos Status P+",0);
 if (true) break;

case 92:
//C
this.state = 93;
;
RDebugUtils.currentLine=12976492;
 //BA.debugLineNum = 12976492;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976493;
 //BA.debugLineNum = 12976493;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976494;
 //BA.debugLineNum = 12976494;BA.debugLine="sb.Append(\"UPDATE tblGestionVentasCalculos SET ST";
_sb.Append("UPDATE tblGestionVentasCalculos SET STATUS=? WHERE Documento in (");
RDebugUtils.currentLine=12976495;
 //BA.debugLineNum = 12976495;BA.debugLine="sb.Append(\"Select tLineasDoc.Documento \")";
_sb.Append("Select tLineasDoc.Documento ");
RDebugUtils.currentLine=12976496;
 //BA.debugLineNum = 12976496;BA.debugLine="sb.append(\"FROM \")";
_sb.Append("FROM ");
RDebugUtils.currentLine=12976497;
 //BA.debugLineNum = 12976497;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
_sb.Append("(Select Documento, count(Linea) As NumLineas from tblGestionVentasCalculos group by Documento) tLineasDoc ");
RDebugUtils.currentLine=12976498;
 //BA.debugLineNum = 12976498;BA.debugLine="sb.append(\"LEFT JOIN \")";
_sb.Append("LEFT JOIN ");
RDebugUtils.currentLine=12976499;
 //BA.debugLineNum = 12976499;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
_sb.Append("(Select Documento, count(Linea) As NumLineasCompletas FROM tblGestionVentasCalculos WHERE Status='L+' or Status='L-' GROUP BY Documento) tLineasDocCompletas ");
RDebugUtils.currentLine=12976500;
 //BA.debugLineNum = 12976500;BA.debugLine="sb.append(\"USING (Documento) \")";
_sb.Append("USING (Documento) ");
RDebugUtils.currentLine=12976501;
 //BA.debugLineNum = 12976501;BA.debugLine="sb.append(\"LEFT JOIN \")";
_sb.Append("LEFT JOIN ");
RDebugUtils.currentLine=12976502;
 //BA.debugLineNum = 12976502;BA.debugLine="sb.append(\"(Select Documento, count(Linea) As Num";
_sb.Append("(Select Documento, count(Linea) As NumLineasCompletasDispNeg FROM tblGestionVentasCalculos WHERE Status='L-' GROUP BY Documento) tLineasDocCompletasDispNeg ");
RDebugUtils.currentLine=12976503;
 //BA.debugLineNum = 12976503;BA.debugLine="sb.append(\"USING (Documento) \")";
_sb.Append("USING (Documento) ");
RDebugUtils.currentLine=12976504;
 //BA.debugLineNum = 12976504;BA.debugLine="sb.append(\"WHERE  tLineasDoc.NumLineas=coalesce(t";
_sb.Append("WHERE  tLineasDoc.NumLineas=coalesce(tLineasDocCompletas.NumLineasCompletas,0) and coalesce(tLineasDocCompletasDispNeg.NumLineasCompletasDispNeg,0)>0)");
RDebugUtils.currentLine=12976505;
 //BA.debugLineNum = 12976505;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("P-")}));
RDebugUtils.currentLine=12976506;
 //BA.debugLineNum = 12976506;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976507;
 //BA.debugLineNum = 12976507;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 356;
return;
case 356:
//C
this.state = 93;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976508;
 //BA.debugLineNum = 12976508;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976508","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976509;
 //BA.debugLineNum = 12976509;BA.debugLine="If Not(Success) Then";
if (true) break;

case 93:
//if
this.state = 98;
if (parent.__c.Not(_success)) { 
this.state = 95;
}else {
this.state = 97;
}if (true) break;

case 95:
//C
this.state = 98;
RDebugUtils.currentLine=12976510;
 //BA.debugLineNum = 12976510;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976511;
 //BA.debugLineNum = 12976511;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 357;
return;
case 357:
//C
this.state = 98;
;
RDebugUtils.currentLine=12976512;
 //BA.debugLineNum = 12976512;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976513;
 //BA.debugLineNum = 12976513;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 97:
//C
this.state = 98;
RDebugUtils.currentLine=12976515;
 //BA.debugLineNum = 12976515;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976515","Success SQLite update tblGestionVentasCalculos Status P-",0);
 if (true) break;

case 98:
//C
this.state = 99;
;
RDebugUtils.currentLine=12976518;
 //BA.debugLineNum = 12976518;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblRe";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblReservasDocumentoAlmZen");
RDebugUtils.currentLine=12976519;
 //BA.debugLineNum = 12976519;BA.debugLine="Wait For (ReservasDocumentoAlmZenProin) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), __ref._reservasdocumentoalmzenproin /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 358;
return;
case 358:
//C
this.state = 99;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12976520;
 //BA.debugLineNum = 12976520;BA.debugLine="If mRes.Get(\"Accion\")=\"Salir\" Then";
if (true) break;

case 99:
//if
this.state = 102;
if ((_mres.Get((Object)("Accion"))).equals((Object)("Salir"))) { 
this.state = 101;
}if (true) break;

case 101:
//C
this.state = 102;
RDebugUtils.currentLine=12976521;
 //BA.debugLineNum = 12976521;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976522;
 //BA.debugLineNum = 12976522;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 102:
//C
this.state = 103;
;
RDebugUtils.currentLine=12976524;
 //BA.debugLineNum = 12976524;BA.debugLine="Dim lstRegResAlmZen As List=mRes.Get(\"lstRegistro";
_lstregresalmzen = new anywheresoftware.b4a.objects.collections.List();
_lstregresalmzen = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRegistros"))));
RDebugUtils.currentLine=12976526;
 //BA.debugLineNum = 12976526;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblReserva";
parent._dbutils._insertmaps /*boolean*/ (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ ,"tblReservasDocumentoAlmZen",_lstregresalmzen);
RDebugUtils.currentLine=12976532;
 //BA.debugLineNum = 12976532;BA.debugLine="lstRegResAlmZen.Clear";
_lstregresalmzen.Clear();
RDebugUtils.currentLine=12976535;
 //BA.debugLineNum = 12976535;BA.debugLine="Wait For (ReservasDocumentoAlmZenProtec) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), __ref._reservasdocumentoalmzenprotec /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 359;
return;
case 359:
//C
this.state = 103;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12976536;
 //BA.debugLineNum = 12976536;BA.debugLine="If mRes.Get(\"Accion\")=\"Salir\" Then";
if (true) break;

case 103:
//if
this.state = 106;
if ((_mres.Get((Object)("Accion"))).equals((Object)("Salir"))) { 
this.state = 105;
}if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=12976537;
 //BA.debugLineNum = 12976537;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976538;
 //BA.debugLineNum = 12976538;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 106:
//C
this.state = 107;
;
RDebugUtils.currentLine=12976540;
 //BA.debugLineNum = 12976540;BA.debugLine="Dim lstRegResAlmZen As List=mRes.Get(\"lstRegistro";
_lstregresalmzen = new anywheresoftware.b4a.objects.collections.List();
_lstregresalmzen = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRegistros"))));
RDebugUtils.currentLine=12976542;
 //BA.debugLineNum = 12976542;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblReserva";
parent._dbutils._insertmaps /*boolean*/ (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ ,"tblReservasDocumentoAlmZen",_lstregresalmzen);
RDebugUtils.currentLine=12976548;
 //BA.debugLineNum = 12976548;BA.debugLine="lstRegResAlmZen.Clear";
_lstregresalmzen.Clear();
RDebugUtils.currentLine=12976552;
 //BA.debugLineNum = 12976552;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976553;
 //BA.debugLineNum = 12976553;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976554;
 //BA.debugLineNum = 12976554;BA.debugLine="sb.append(\"update tblGestionVentasCalculos as t1";
_sb.Append("update tblGestionVentasCalculos as t1 set ReservaAlmacen = ifnull((Select QtyReservaAlmZen from ");
RDebugUtils.currentLine=12976555;
 //BA.debugLineNum = 12976555;BA.debugLine="sb.append(\"(Select DocumentoReserva, Articulo, Ta";
_sb.Append("(Select DocumentoReserva, Articulo, Talla, Sum(qty) As QtyReservaAlmZen from tblReservasDocumentoAlmZen group by DocumentoReserva, Articulo, Talla) t2 ");
RDebugUtils.currentLine=12976556;
 //BA.debugLineNum = 12976556;BA.debugLine="sb.append(\"where t1.Documento=t2.DocumentoReserva";
_sb.Append("where t1.Documento=t2.DocumentoReserva And t1.Articulo=t2.Articulo And t1.Talla=t2.Talla),0)");
RDebugUtils.currentLine=12976557;
 //BA.debugLineNum = 12976557;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976558;
 //BA.debugLineNum = 12976558;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976559;
 //BA.debugLineNum = 12976559;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 360;
return;
case 360:
//C
this.state = 107;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976560;
 //BA.debugLineNum = 12976560;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976560","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976561;
 //BA.debugLineNum = 12976561;BA.debugLine="If Not(Success) Then";
if (true) break;

case 107:
//if
this.state = 112;
if (parent.__c.Not(_success)) { 
this.state = 109;
}else {
this.state = 111;
}if (true) break;

case 109:
//C
this.state = 112;
RDebugUtils.currentLine=12976562;
 //BA.debugLineNum = 12976562;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976563;
 //BA.debugLineNum = 12976563;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 361;
return;
case 361:
//C
this.state = 112;
;
RDebugUtils.currentLine=12976564;
 //BA.debugLineNum = 12976564;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976565;
 //BA.debugLineNum = 12976565;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 111:
//C
this.state = 112;
RDebugUtils.currentLine=12976567;
 //BA.debugLineNum = 12976567;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalcu";
parent.__c.LogImpl("812976567","Success SQLite update tblGestionVentasCalculos reservasAlmzen",0);
 if (true) break;

case 112:
//C
this.state = 113;
;
RDebugUtils.currentLine=12976570;
 //BA.debugLineNum = 12976570;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976571;
 //BA.debugLineNum = 12976571;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976572;
 //BA.debugLineNum = 12976572;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set ID";
_sb.Append("update tblGestionVentasCalculos set IDPrioridad=ROWID, IDPrioridadUsuario=ROWID");
RDebugUtils.currentLine=12976573;
 //BA.debugLineNum = 12976573;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976574;
 //BA.debugLineNum = 12976574;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976575;
 //BA.debugLineNum = 12976575;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 362;
return;
case 362:
//C
this.state = 113;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976576;
 //BA.debugLineNum = 12976576;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976576","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976577;
 //BA.debugLineNum = 12976577;BA.debugLine="If Not(Success) Then";
if (true) break;

case 113:
//if
this.state = 118;
if (parent.__c.Not(_success)) { 
this.state = 115;
}else {
this.state = 117;
}if (true) break;

case 115:
//C
this.state = 118;
RDebugUtils.currentLine=12976578;
 //BA.debugLineNum = 12976578;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976579;
 //BA.debugLineNum = 12976579;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 363;
return;
case 363:
//C
this.state = 118;
;
RDebugUtils.currentLine=12976580;
 //BA.debugLineNum = 12976580;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976581;
 //BA.debugLineNum = 12976581;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 117:
//C
this.state = 118;
RDebugUtils.currentLine=12976583;
 //BA.debugLineNum = 12976583;BA.debugLine="Log(\"Success SQLite update IDPrioridadUsuario\")";
parent.__c.LogImpl("812976583","Success SQLite update IDPrioridadUsuario",0);
 if (true) break;
;
RDebugUtils.currentLine=12976588;
 //BA.debugLineNum = 12976588;BA.debugLine="If CalcularFechas Then";

case 118:
//if
this.state = 313;
if (__ref._calcularfechas /*boolean*/ ) { 
this.state = 120;
}else {
this.state = 306;
}if (true) break;

case 120:
//C
this.state = 121;
RDebugUtils.currentLine=12976593;
 //BA.debugLineNum = 12976593;BA.debugLine="FechasPrometidasCompras";
__ref._fechasprometidascompras /*void*/ (null);
RDebugUtils.currentLine=12976594;
 //BA.debugLineNum = 12976594;BA.debugLine="Wait For FechasPrometidasCompras_Completed (Acci";
parent.__c.WaitFor("fechasprometidascompras_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 364;
return;
case 364:
//C
this.state = 121;
_accion = (String) result[1];
_lstregfp = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=12976595;
 //BA.debugLineNum = 12976595;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 121:
//if
this.state = 124;
if ((_accion).equals("Salir")) { 
this.state = 123;
}if (true) break;

case 123:
//C
this.state = 124;
RDebugUtils.currentLine=12976598;
 //BA.debugLineNum = 12976598;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 124:
//C
this.state = 125;
;
RDebugUtils.currentLine=12976600;
 //BA.debugLineNum = 12976600;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblF";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblFechasPrometidasCompra");
RDebugUtils.currentLine=12976601;
 //BA.debugLineNum = 12976601;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblFechas";
parent._dbutils._insertmaps /*boolean*/ (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ ,"tblFechasPrometidasCompra",_lstregfp);
RDebugUtils.currentLine=12976602;
 //BA.debugLineNum = 12976602;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
_regins = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblFechasPrometidasCompra")));
RDebugUtils.currentLine=12976603;
 //BA.debugLineNum = 12976603;BA.debugLine="If regIns<>lstRegFP.Size Then";
if (true) break;

case 125:
//if
this.state = 128;
if (_regins!=_lstregfp.getSize()) { 
this.state = 127;
}if (true) break;

case 127:
//C
this.state = 128;
RDebugUtils.currentLine=12976604;
 //BA.debugLineNum = 12976604;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite, revisar logs.","Error");
RDebugUtils.currentLine=12976605;
 //BA.debugLineNum = 12976605;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 365;
return;
case 365:
//C
this.state = 128;
;
 if (true) break;

case 128:
//C
this.state = 129;
;
RDebugUtils.currentLine=12976607;
 //BA.debugLineNum = 12976607;BA.debugLine="lstRegFP.Clear";
_lstregfp.Clear();
RDebugUtils.currentLine=12976609;
 //BA.debugLineNum = 12976609;BA.debugLine="PedidosComprasRecibidosPtesRecepcionar";
__ref._pedidoscomprasrecibidosptesrecepcionar /*void*/ (null);
RDebugUtils.currentLine=12976610;
 //BA.debugLineNum = 12976610;BA.debugLine="Wait For PedidosComprasRecibidosPtesRecepcionar_";
parent.__c.WaitFor("pedidoscomprasrecibidosptesrecepcionar_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 366;
return;
case 366:
//C
this.state = 129;
_accion = (String) result[1];
_lstregpcrec = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=12976611;
 //BA.debugLineNum = 12976611;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 129:
//if
this.state = 132;
if ((_accion).equals("Salir")) { 
this.state = 131;
}if (true) break;

case 131:
//C
this.state = 132;
RDebugUtils.currentLine=12976614;
 //BA.debugLineNum = 12976614;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 132:
//C
this.state = 133;
;
RDebugUtils.currentLine=12976616;
 //BA.debugLineNum = 12976616;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblP";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblPedidosCompraRecibidosPtesRecepcionar");
RDebugUtils.currentLine=12976617;
 //BA.debugLineNum = 12976617;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblPedido";
parent._dbutils._insertmaps /*boolean*/ (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ ,"tblPedidosCompraRecibidosPtesRecepcionar",_lstregpcrec);
RDebugUtils.currentLine=12976618;
 //BA.debugLineNum = 12976618;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
_regins = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblPedidosCompraRecibidosPtesRecepcionar")));
RDebugUtils.currentLine=12976619;
 //BA.debugLineNum = 12976619;BA.debugLine="If regIns<>lstRegPCRec.Size Then";
if (true) break;

case 133:
//if
this.state = 136;
if (_regins!=_lstregpcrec.getSize()) { 
this.state = 135;
}if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=12976620;
 //BA.debugLineNum = 12976620;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite, revisar logs.","Error");
RDebugUtils.currentLine=12976621;
 //BA.debugLineNum = 12976621;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 367;
return;
case 367:
//C
this.state = 136;
;
 if (true) break;

case 136:
//C
this.state = 137;
;
RDebugUtils.currentLine=12976623;
 //BA.debugLineNum = 12976623;BA.debugLine="lstRegPCRec.Clear";
_lstregpcrec.Clear();
RDebugUtils.currentLine=12976627;
 //BA.debugLineNum = 12976627;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976628;
 //BA.debugLineNum = 12976628;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976629;
 //BA.debugLineNum = 12976629;BA.debugLine="sb.Append(\"delete from tblFechasPrometidasCompra";
_sb.Append("delete from tblFechasPrometidasCompra As t1 where Not exists (");
RDebugUtils.currentLine=12976634;
 //BA.debugLineNum = 12976634;BA.debugLine="sb.Append(\"Select distinct Articulo, Talla from";
_sb.Append("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)");
RDebugUtils.currentLine=12976635;
 //BA.debugLineNum = 12976635;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976638;
 //BA.debugLineNum = 12976638;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976639;
 //BA.debugLineNum = 12976639;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 368;
return;
case 368:
//C
this.state = 137;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976640;
 //BA.debugLineNum = 12976640;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976640","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976641;
 //BA.debugLineNum = 12976641;BA.debugLine="If Not(Success) Then";
if (true) break;

case 137:
//if
this.state = 142;
if (parent.__c.Not(_success)) { 
this.state = 139;
}else {
this.state = 141;
}if (true) break;

case 139:
//C
this.state = 142;
RDebugUtils.currentLine=12976642;
 //BA.debugLineNum = 12976642;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976643;
 //BA.debugLineNum = 12976643;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 369;
return;
case 369:
//C
this.state = 142;
;
RDebugUtils.currentLine=12976644;
 //BA.debugLineNum = 12976644;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976645;
 //BA.debugLineNum = 12976645;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 141:
//C
this.state = 142;
RDebugUtils.currentLine=12976647;
 //BA.debugLineNum = 12976647;BA.debugLine="Log(\"Success delete from tblFechasPrometidasCom";
parent.__c.LogImpl("812976647","Success delete from tblFechasPrometidasCompra arts-tallas no en GV",0);
 if (true) break;

case 142:
//C
this.state = 143;
;
RDebugUtils.currentLine=12976651;
 //BA.debugLineNum = 12976651;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"update tblFechas";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("update tblFechasPrometidasCompra set sFechaProm=DATE(ROUND(FechaProm / 1000), 'unixepoch') ");
RDebugUtils.currentLine=12976655;
 //BA.debugLineNum = 12976655;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976656;
 //BA.debugLineNum = 12976656;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976657;
 //BA.debugLineNum = 12976657;BA.debugLine="sb.Append(\"delete from tblPedidosCompraRecibidos";
_sb.Append("delete from tblPedidosCompraRecibidosPtesRecepcionar As t1 where Not exists (");
RDebugUtils.currentLine=12976662;
 //BA.debugLineNum = 12976662;BA.debugLine="sb.Append(\"Select distinct Articulo, Talla from";
_sb.Append("Select distinct Articulo, Talla from tblGestionVentasCalculos t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla)");
RDebugUtils.currentLine=12976663;
 //BA.debugLineNum = 12976663;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976666;
 //BA.debugLineNum = 12976666;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976667;
 //BA.debugLineNum = 12976667;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 370;
return;
case 370:
//C
this.state = 143;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976668;
 //BA.debugLineNum = 12976668;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976668","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976669;
 //BA.debugLineNum = 12976669;BA.debugLine="If Not(Success) Then";
if (true) break;

case 143:
//if
this.state = 148;
if (parent.__c.Not(_success)) { 
this.state = 145;
}else {
this.state = 147;
}if (true) break;

case 145:
//C
this.state = 148;
RDebugUtils.currentLine=12976670;
 //BA.debugLineNum = 12976670;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976671;
 //BA.debugLineNum = 12976671;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 371;
return;
case 371:
//C
this.state = 148;
;
RDebugUtils.currentLine=12976672;
 //BA.debugLineNum = 12976672;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976673;
 //BA.debugLineNum = 12976673;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 147:
//C
this.state = 148;
RDebugUtils.currentLine=12976675;
 //BA.debugLineNum = 12976675;BA.debugLine="Log(\"Success delete from tblPedidosCompraRecibi";
parent.__c.LogImpl("812976675","Success delete from tblPedidosCompraRecibidosPtesRecepcionar arts-tallas no vendedor actual",0);
 if (true) break;

case 148:
//C
this.state = 149;
;
RDebugUtils.currentLine=12976678;
 //BA.debugLineNum = 12976678;BA.debugLine="OSUBsPendientesTerminaProductoNoCorteNoConfeccio";
__ref._osubspendientesterminaproductonocortenoconfeccion /*void*/ (null);
RDebugUtils.currentLine=12976679;
 //BA.debugLineNum = 12976679;BA.debugLine="Wait For OSUBsPendientesTerminaProductoNoCorteNo";
parent.__c.WaitFor("osubspendientesterminaproductonocortenoconfeccion_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 372;
return;
case 372:
//C
this.state = 149;
_accion = (String) result[1];
_lstregosubrec = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=12976680;
 //BA.debugLineNum = 12976680;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 149:
//if
this.state = 152;
if ((_accion).equals("Salir")) { 
this.state = 151;
}if (true) break;

case 151:
//C
this.state = 152;
RDebugUtils.currentLine=12976683;
 //BA.debugLineNum = 12976683;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 152:
//C
this.state = 153;
;
RDebugUtils.currentLine=12976685;
 //BA.debugLineNum = 12976685;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblO";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion");
RDebugUtils.currentLine=12976686;
 //BA.debugLineNum = 12976686;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblOSUBsP";
parent._dbutils._insertmaps /*boolean*/ (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ ,"tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion",_lstregosubrec);
RDebugUtils.currentLine=12976687;
 //BA.debugLineNum = 12976687;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
_regins = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion")));
RDebugUtils.currentLine=12976688;
 //BA.debugLineNum = 12976688;BA.debugLine="If regIns<>lstRegOSUBRec.Size Then";
if (true) break;

case 153:
//if
this.state = 156;
if (_regins!=_lstregosubrec.getSize()) { 
this.state = 155;
}if (true) break;

case 155:
//C
this.state = 156;
RDebugUtils.currentLine=12976689;
 //BA.debugLineNum = 12976689;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite, revisar logs.","Error");
RDebugUtils.currentLine=12976690;
 //BA.debugLineNum = 12976690;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 373;
return;
case 373:
//C
this.state = 156;
;
 if (true) break;

case 156:
//C
this.state = 157;
;
RDebugUtils.currentLine=12976692;
 //BA.debugLineNum = 12976692;BA.debugLine="lstRegOSUBRec.Clear";
_lstregosubrec.Clear();
RDebugUtils.currentLine=12976695;
 //BA.debugLineNum = 12976695;BA.debugLine="Dim TicksHoraCeroDia As Long=DateUtils.SetDate(D";
_tickshoracerodia = parent._dateutils._setdate(parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetMonth(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetDayOfMonth(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=12976696;
 //BA.debugLineNum = 12976696;BA.debugLine="Dim Periodo As Period";
_periodo = new b4j.example.dateutils._period();
RDebugUtils.currentLine=12976697;
 //BA.debugLineNum = 12976697;BA.debugLine="Periodo.Initialize";
_periodo.Initialize();
RDebugUtils.currentLine=12976698;
 //BA.debugLineNum = 12976698;BA.debugLine="Periodo.Days=1";
_periodo.Days = (int) (1);
RDebugUtils.currentLine=12976699;
 //BA.debugLineNum = 12976699;BA.debugLine="Dim TicksHoraCeroDiaSiguiente As Long=DateUtils.";
_tickshoracerodiasiguiente = parent._dateutils._addperiod(_tickshoracerodia,_periodo);
RDebugUtils.currentLine=12976704;
 //BA.debugLineNum = 12976704;BA.debugLine="Log(\"Mañana \" & DateTime.Date(TicksHoraCeroDiaSi";
parent.__c.LogImpl("812976704","Mañana "+parent.__c.DateTime.Date(_tickshoracerodiasiguiente),0);
RDebugUtils.currentLine=12976705;
 //BA.debugLineNum = 12976705;BA.debugLine="mSQLGestionventas.ExecNonQuery2(\"update tblOSUBs";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set FechaVencimientoAj=FechaVencimiento+?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay)}));
RDebugUtils.currentLine=12976706;
 //BA.debugLineNum = 12976706;BA.debugLine="mSQLGestionventas.ExecNonQuery2(\"update tblOSUBs";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set FechaVencimientoAj=? where FechaVencimiento<=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_tickshoracerodiasiguiente),(Object)(_tickshoracerodiasiguiente)}));
RDebugUtils.currentLine=12976708;
 //BA.debugLineNum = 12976708;BA.debugLine="mSQLGestionventas.ExecNonQuery2(\"update tblOSUBs";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion set sFechaProm=DATE(ROUND(FechaVencimiento+?/ 1000), 'unixepoch') ",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay)}));
RDebugUtils.currentLine=12976714;
 //BA.debugLineNum = 12976714;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976715;
 //BA.debugLineNum = 12976715;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976716;
 //BA.debugLineNum = 12976716;BA.debugLine="sb.Append(\"insert into tblStockDisponibleArticul";
_sb.Append("insert into tblStockDisponibleArticuloTallaFecha select Articulo, Talla, FechaProm+? , sum(QtyPteRecibir), sFechaProm from tblFechasPrometidasCompra");
RDebugUtils.currentLine=12976717;
 //BA.debugLineNum = 12976717;BA.debugLine="sb.Append(\" where AlmacenGV=1\")";
_sb.Append(" where AlmacenGV=1");
RDebugUtils.currentLine=12976718;
 //BA.debugLineNum = 12976718;BA.debugLine="sb.Append(\" group by Articulo, Talla, FechaProm,";
_sb.Append(" group by Articulo, Talla, FechaProm, sFechaProm");
RDebugUtils.currentLine=12976719;
 //BA.debugLineNum = 12976719;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay)}));
RDebugUtils.currentLine=12976720;
 //BA.debugLineNum = 12976720;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976721;
 //BA.debugLineNum = 12976721;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 374;
return;
case 374:
//C
this.state = 157;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976722;
 //BA.debugLineNum = 12976722;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976722","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976723;
 //BA.debugLineNum = 12976723;BA.debugLine="If Not(Success) Then";
if (true) break;

case 157:
//if
this.state = 162;
if (parent.__c.Not(_success)) { 
this.state = 159;
}else {
this.state = 161;
}if (true) break;

case 159:
//C
this.state = 162;
RDebugUtils.currentLine=12976724;
 //BA.debugLineNum = 12976724;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976725;
 //BA.debugLineNum = 12976725;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 375;
return;
case 375:
//C
this.state = 162;
;
RDebugUtils.currentLine=12976726;
 //BA.debugLineNum = 12976726;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976727;
 //BA.debugLineNum = 12976727;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 161:
//C
this.state = 162;
RDebugUtils.currentLine=12976730;
 //BA.debugLineNum = 12976730;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
parent.__c.LogImpl("812976730","Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaProm , sum(QtyPteRecibir) desde tblFechasPrometidasCompra",0);
 if (true) break;

case 162:
//C
this.state = 163;
;
RDebugUtils.currentLine=12976733;
 //BA.debugLineNum = 12976733;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976734;
 //BA.debugLineNum = 12976734;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976735;
 //BA.debugLineNum = 12976735;BA.debugLine="sb.Append(\"insert into tblStockDisponibleArticul";
_sb.Append("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV select Almacen, Articulo, Talla, FechaProm+? , sum(QtyPteRecibir), sFechaProm from tblFechasPrometidasCompra");
RDebugUtils.currentLine=12976736;
 //BA.debugLineNum = 12976736;BA.debugLine="sb.Append(\" where AlmacenGV=0\")";
_sb.Append(" where AlmacenGV=0");
RDebugUtils.currentLine=12976737;
 //BA.debugLineNum = 12976737;BA.debugLine="sb.Append(\" group by Almacen,Articulo, Talla, Fe";
_sb.Append(" group by Almacen,Articulo, Talla, FechaProm, sFechaProm");
RDebugUtils.currentLine=12976738;
 //BA.debugLineNum = 12976738;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay)}));
RDebugUtils.currentLine=12976739;
 //BA.debugLineNum = 12976739;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976740;
 //BA.debugLineNum = 12976740;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 376;
return;
case 376:
//C
this.state = 163;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976741;
 //BA.debugLineNum = 12976741;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976741","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976742;
 //BA.debugLineNum = 12976742;BA.debugLine="If Not(Success) Then";
if (true) break;

case 163:
//if
this.state = 168;
if (parent.__c.Not(_success)) { 
this.state = 165;
}else {
this.state = 167;
}if (true) break;

case 165:
//C
this.state = 168;
RDebugUtils.currentLine=12976743;
 //BA.debugLineNum = 12976743;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976744;
 //BA.debugLineNum = 12976744;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 377;
return;
case 377:
//C
this.state = 168;
;
RDebugUtils.currentLine=12976745;
 //BA.debugLineNum = 12976745;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976746;
 //BA.debugLineNum = 12976746;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 167:
//C
this.state = 168;
RDebugUtils.currentLine=12976749;
 //BA.debugLineNum = 12976749;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
parent.__c.LogImpl("812976749","Success SQLite insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV datos FechaProm , sum(QtyPteRecibir) desde tblFechasPrometidasCompra",0);
 if (true) break;

case 168:
//C
this.state = 169;
;
RDebugUtils.currentLine=12976753;
 //BA.debugLineNum = 12976753;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"insert int";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("insert into tblStockDisponibleArticuloTallaFecha select Articulo, Talla, FechaVencimientoAj, sum(TQtyPte), sFechaProm from tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion where FechaVencimientoAj>=? group by Articulo, Talla, FechaVencimientoAj,sFechaProm",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fechahoy)}));
RDebugUtils.currentLine=12976754;
 //BA.debugLineNum = 12976754;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976755;
 //BA.debugLineNum = 12976755;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 378;
return;
case 378:
//C
this.state = 169;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976756;
 //BA.debugLineNum = 12976756;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976756","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976757;
 //BA.debugLineNum = 12976757;BA.debugLine="If Not(Success) Then";
if (true) break;

case 169:
//if
this.state = 174;
if (parent.__c.Not(_success)) { 
this.state = 171;
}else {
this.state = 173;
}if (true) break;

case 171:
//C
this.state = 174;
RDebugUtils.currentLine=12976758;
 //BA.debugLineNum = 12976758;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976759;
 //BA.debugLineNum = 12976759;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 379;
return;
case 379:
//C
this.state = 174;
;
RDebugUtils.currentLine=12976760;
 //BA.debugLineNum = 12976760;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976761;
 //BA.debugLineNum = 12976761;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 173:
//C
this.state = 174;
RDebugUtils.currentLine=12976763;
 //BA.debugLineNum = 12976763;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
parent.__c.LogImpl("812976763","Success SQLite insert into tblStockDisponibleArticuloTallaFecha datos FechaVencimientoAj , sum(TQtyPte) desde tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion",0);
 if (true) break;

case 174:
//C
this.state = 175;
;
RDebugUtils.currentLine=12976769;
 //BA.debugLineNum = 12976769;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976770;
 //BA.debugLineNum = 12976770;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976771;
 //BA.debugLineNum = 12976771;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set RutaAplicable = Ruta, PlazoRutaAplicable=PlazoRuta");
RDebugUtils.currentLine=12976772;
 //BA.debugLineNum = 12976772;BA.debugLine="sb.append(\" where ArticuloCorte=? and Dual=?\")";
_sb.Append(" where ArticuloCorte=? and Dual=?");
RDebugUtils.currentLine=12976773;
 //BA.debugLineNum = 12976773;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"SI",BA.NumberToString(0)}));
RDebugUtils.currentLine=12976775;
 //BA.debugLineNum = 12976775;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976776;
 //BA.debugLineNum = 12976776;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set RutaAplicable = RutaDual, PlazoRutaAplicable=PlazoRutaDual");
RDebugUtils.currentLine=12976777;
 //BA.debugLineNum = 12976777;BA.debugLine="sb.append(\" where ArticuloCorte=? and Dual=?\")";
_sb.Append(" where ArticuloCorte=? and Dual=?");
RDebugUtils.currentLine=12976778;
 //BA.debugLineNum = 12976778;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"SI",BA.NumberToString(1)}));
RDebugUtils.currentLine=12976781;
 //BA.debugLineNum = 12976781;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976782;
 //BA.debugLineNum = 12976782;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976783;
 //BA.debugLineNum = 12976783;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set RutaAplicable = Ruta, PlazoRutaAplicable=PlazoRuta");
RDebugUtils.currentLine=12976784;
 //BA.debugLineNum = 12976784;BA.debugLine="sb.append(\" where ArticuloCorte=?\")";
_sb.Append(" where ArticuloCorte=?");
RDebugUtils.currentLine=12976785;
 //BA.debugLineNum = 12976785;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"NO"}));
RDebugUtils.currentLine=12976787;
 //BA.debugLineNum = 12976787;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976788;
 //BA.debugLineNum = 12976788;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 380;
return;
case 380:
//C
this.state = 175;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976789;
 //BA.debugLineNum = 12976789;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976789","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976790;
 //BA.debugLineNum = 12976790;BA.debugLine="If Not(Success) Then";
if (true) break;

case 175:
//if
this.state = 180;
if (parent.__c.Not(_success)) { 
this.state = 177;
}else {
this.state = 179;
}if (true) break;

case 177:
//C
this.state = 180;
RDebugUtils.currentLine=12976791;
 //BA.debugLineNum = 12976791;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976792;
 //BA.debugLineNum = 12976792;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 381;
return;
case 381:
//C
this.state = 180;
;
RDebugUtils.currentLine=12976793;
 //BA.debugLineNum = 12976793;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976794;
 //BA.debugLineNum = 12976794;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 179:
//C
this.state = 180;
RDebugUtils.currentLine=12976796;
 //BA.debugLineNum = 12976796;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812976796","Success SQLite update tblGestionVentasCalculos",0);
 if (true) break;

case 180:
//C
this.state = 181;
;
RDebugUtils.currentLine=12976802;
 //BA.debugLineNum = 12976802;BA.debugLine="ConfPlazoFechaEntregaPlan";
__ref._confplazofechaentregaplan /*void*/ (null);
RDebugUtils.currentLine=12976803;
 //BA.debugLineNum = 12976803;BA.debugLine="Wait For ConfPlazoFechaEntregaPlan_Completed (Ac";
parent.__c.WaitFor("confplazofechaentregaplan_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), null);
this.state = 382;
return;
case 382:
//C
this.state = 181;
_accion = (String) result[1];
_lstregconfpl = (anywheresoftware.b4a.objects.collections.List) result[2];
;
RDebugUtils.currentLine=12976804;
 //BA.debugLineNum = 12976804;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 181:
//if
this.state = 184;
if ((_accion).equals("Salir")) { 
this.state = 183;
}if (true) break;

case 183:
//C
this.state = 184;
RDebugUtils.currentLine=12976807;
 //BA.debugLineNum = 12976807;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 184:
//C
this.state = 185;
;
RDebugUtils.currentLine=12976809;
 //BA.debugLineNum = 12976809;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblC";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblConfPlazoFechaEntregaPlan");
RDebugUtils.currentLine=12976810;
 //BA.debugLineNum = 12976810;BA.debugLine="DBUtils.InsertMaps(mSQLGestionventas, \"tblConfPl";
parent._dbutils._insertmaps /*boolean*/ (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ ,"tblConfPlazoFechaEntregaPlan",_lstregconfpl);
RDebugUtils.currentLine=12976811;
 //BA.debugLineNum = 12976811;BA.debugLine="Dim regIns As Int=mSQLGestionventas.ExecQuerySin";
_regins = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblConfPlazoFechaEntregaPlan")));
RDebugUtils.currentLine=12976812;
 //BA.debugLineNum = 12976812;BA.debugLine="If regIns<>lstRegConfPL.Size Then";
if (true) break;

case 185:
//if
this.state = 188;
if (_regins!=_lstregconfpl.getSize()) { 
this.state = 187;
}if (true) break;

case 187:
//C
this.state = 188;
RDebugUtils.currentLine=12976813;
 //BA.debugLineNum = 12976813;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite, revisar logs.","Error");
RDebugUtils.currentLine=12976814;
 //BA.debugLineNum = 12976814;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 383;
return;
case 383:
//C
this.state = 188;
;
 if (true) break;

case 188:
//C
this.state = 189;
;
RDebugUtils.currentLine=12976816;
 //BA.debugLineNum = 12976816;BA.debugLine="lstRegConfPL.Clear";
_lstregconfpl.Clear();
RDebugUtils.currentLine=12976824;
 //BA.debugLineNum = 12976824;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblC";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblConfPlazoFechaEntregaPlanArticulosFabGV");
RDebugUtils.currentLine=12976825;
 //BA.debugLineNum = 12976825;BA.debugLine="Dim sbCP As StringBuilder";
_sbcp = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976826;
 //BA.debugLineNum = 12976826;BA.debugLine="sbCP.Initialize";
_sbcp.Initialize();
RDebugUtils.currentLine=12976828;
 //BA.debugLineNum = 12976828;BA.debugLine="sbCP.Append(\"insert into tblConfPlazoFechaEntreg";
_sbcp.Append("insert into tblConfPlazoFechaEntregaPlanArticulosFabGV ");
RDebugUtils.currentLine=12976830;
 //BA.debugLineNum = 12976830;BA.debugLine="sbCP.Append(\"Select tGV.Documento, tGV.Linea, tG";
_sbcp.Append("Select tGV.Documento, tGV.Linea, tGV.FechaDocumento, tGV.Articulo, tGV.Cliente, tGV.GRP, tGV.Ruta,");
RDebugUtils.currentLine=12976832;
 //BA.debugLineNum = 12976832;BA.debugLine="sbCP.Append(\"coalesce(t1.Plazo,0) As Plazo1,\")";
_sbcp.Append("coalesce(t1.Plazo,0) As Plazo1,");
RDebugUtils.currentLine=12976833;
 //BA.debugLineNum = 12976833;BA.debugLine="sbCP.Append(\"coalesce(t2.Plazo,0) As Plazo2,\")";
_sbcp.Append("coalesce(t2.Plazo,0) As Plazo2,");
RDebugUtils.currentLine=12976834;
 //BA.debugLineNum = 12976834;BA.debugLine="sbCP.Append(\"coalesce(t3.Plazo,0) As Plazo3,\")";
_sbcp.Append("coalesce(t3.Plazo,0) As Plazo3,");
RDebugUtils.currentLine=12976835;
 //BA.debugLineNum = 12976835;BA.debugLine="sbCP.Append(\"coalesce(t4.Plazo,0) As Plazo4,\")";
_sbcp.Append("coalesce(t4.Plazo,0) As Plazo4,");
RDebugUtils.currentLine=12976836;
 //BA.debugLineNum = 12976836;BA.debugLine="sbCP.Append(\"coalesce(t5.Plazo,0) As Plazo5,\")";
_sbcp.Append("coalesce(t5.Plazo,0) As Plazo5,");
RDebugUtils.currentLine=12976837;
 //BA.debugLineNum = 12976837;BA.debugLine="sbCP.Append(\"coalesce(t6.Plazo,0) As Plazo6,\")";
_sbcp.Append("coalesce(t6.Plazo,0) As Plazo6,");
RDebugUtils.currentLine=12976838;
 //BA.debugLineNum = 12976838;BA.debugLine="sbCP.Append(\"coalesce(t7.Plazo,0) As Plazo7,\")";
_sbcp.Append("coalesce(t7.Plazo,0) As Plazo7,");
RDebugUtils.currentLine=12976839;
 //BA.debugLineNum = 12976839;BA.debugLine="sbCP.Append(\"coalesce(t8.Plazo,0) As Plazo8,\")";
_sbcp.Append("coalesce(t8.Plazo,0) As Plazo8,");
RDebugUtils.currentLine=12976840;
 //BA.debugLineNum = 12976840;BA.debugLine="sbCP.Append(\"coalesce(t9.Plazo,0) As Plazo9,\")";
_sbcp.Append("coalesce(t9.Plazo,0) As Plazo9,");
RDebugUtils.currentLine=12976841;
 //BA.debugLineNum = 12976841;BA.debugLine="sbCP.Append(\"coalesce(t10.Plazo,0) As Plazo10,\")";
_sbcp.Append("coalesce(t10.Plazo,0) As Plazo10,");
RDebugUtils.currentLine=12976843;
 //BA.debugLineNum = 12976843;BA.debugLine="sbCP.Append(\"tGV.PlazoRutaAplicable,\")";
_sbcp.Append("tGV.PlazoRutaAplicable,");
RDebugUtils.currentLine=12976845;
 //BA.debugLineNum = 12976845;BA.debugLine="sbCP.Append(\"iif(coalesce(t1.Plazo,0)>0, t1.Plaz";
_sbcp.Append("iif(coalesce(t1.Plazo,0)>0, t1.Plazo,");
RDebugUtils.currentLine=12976846;
 //BA.debugLineNum = 12976846;BA.debugLine="sbCP.Append(\"iif(coalesce(t2.Plazo,0)>0, t2.Plaz";
_sbcp.Append("iif(coalesce(t2.Plazo,0)>0, t2.Plazo,");
RDebugUtils.currentLine=12976847;
 //BA.debugLineNum = 12976847;BA.debugLine="sbCP.Append(\"iif(coalesce(t3.Plazo,0)>0, t3.Plaz";
_sbcp.Append("iif(coalesce(t3.Plazo,0)>0, t3.Plazo,");
RDebugUtils.currentLine=12976848;
 //BA.debugLineNum = 12976848;BA.debugLine="sbCP.Append(\"iif(coalesce(t4.Plazo,0)>0, t4.Plaz";
_sbcp.Append("iif(coalesce(t4.Plazo,0)>0, t4.Plazo,");
RDebugUtils.currentLine=12976849;
 //BA.debugLineNum = 12976849;BA.debugLine="sbCP.Append(\"iif(coalesce(t5.Plazo,0)>0, t5.Plaz";
_sbcp.Append("iif(coalesce(t5.Plazo,0)>0, t5.Plazo,");
RDebugUtils.currentLine=12976850;
 //BA.debugLineNum = 12976850;BA.debugLine="sbCP.Append(\"iif(coalesce(t6.Plazo,0)>0, t6.Plaz";
_sbcp.Append("iif(coalesce(t6.Plazo,0)>0, t6.Plazo,");
RDebugUtils.currentLine=12976851;
 //BA.debugLineNum = 12976851;BA.debugLine="sbCP.Append(\"iif(coalesce(t7.Plazo,0)>0, t7.Plaz";
_sbcp.Append("iif(coalesce(t7.Plazo,0)>0, t7.Plazo,");
RDebugUtils.currentLine=12976852;
 //BA.debugLineNum = 12976852;BA.debugLine="sbCP.Append(\"iif(coalesce(t8.Plazo,0)>0, t8.Plaz";
_sbcp.Append("iif(coalesce(t8.Plazo,0)>0, t8.Plazo,");
RDebugUtils.currentLine=12976853;
 //BA.debugLineNum = 12976853;BA.debugLine="sbCP.Append(\"iif(coalesce(t9.Plazo,0)>0, t9.Plaz";
_sbcp.Append("iif(coalesce(t9.Plazo,0)>0, t9.Plazo,");
RDebugUtils.currentLine=12976854;
 //BA.debugLineNum = 12976854;BA.debugLine="sbCP.Append(\"iif(coalesce(t10.Plazo,0)>0,t10.Pla";
_sbcp.Append("iif(coalesce(t10.Plazo,0)>0,t10.Plazo,");
RDebugUtils.currentLine=12976855;
 //BA.debugLineNum = 12976855;BA.debugLine="sbCP.Append(\"iif(coalesce(tGV.PlazoRutaAplicable";
_sbcp.Append("iif(coalesce(tGV.PlazoRutaAplicable,0)>0,tGV.PlazoRutaAplicable,0))))))))))) As PlazoArtLinea, ");
RDebugUtils.currentLine=12976857;
 //BA.debugLineNum = 12976857;BA.debugLine="sbCP.Append(\"0 \") ' sumaremos luego los ticks de";
_sbcp.Append("0 ");
RDebugUtils.currentLine=12976859;
 //BA.debugLineNum = 12976859;BA.debugLine="sbCP.Append(\"from tblGestionVentasCalculos tGV \"";
_sbcp.Append("from tblGestionVentasCalculos tGV ");
RDebugUtils.currentLine=12976862;
 //BA.debugLineNum = 12976862;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente <>'' and GRP='' and Ruta<>'') t1 on tGV.Articulo=t1.Articulo and tGV.Cliente=t1.Cliente and tGV.RutaAplicable=t1.Ruta ");
RDebugUtils.currentLine=12976863;
 //BA.debugLineNum = 12976863;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente <>'' and GRP='' and Ruta='') t2 using(Articulo, Cliente) ");
RDebugUtils.currentLine=12976865;
 //BA.debugLineNum = 12976865;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP<>'' and Ruta<>'') t3 on tGV.Articulo=t3.Articulo and tGV.GRP=t3.GRP and tGV.RutaAplicable=t3.Ruta ");
RDebugUtils.currentLine=12976866;
 //BA.debugLineNum = 12976866;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP<>'' and Ruta='') t4 using(Articulo, GRP) ");
RDebugUtils.currentLine=12976868;
 //BA.debugLineNum = 12976868;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP='' and Ruta<>'') t5 on tGV.Articulo=t5.Articulo and tGV.RutaAplicable=t5.Ruta ");
RDebugUtils.currentLine=12976869;
 //BA.debugLineNum = 12976869;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo<>'' and Cliente ='' and GRP='' and Ruta='') t6 using(Articulo) ");
RDebugUtils.currentLine=12976871;
 //BA.debugLineNum = 12976871;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente <>'' and GRP='' and Ruta<>'') t7 on tGV.Cliente=t7.Cliente and tGV.RutaAplicable=t7.Ruta ");
RDebugUtils.currentLine=12976872;
 //BA.debugLineNum = 12976872;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente <>'' and GRP='' and Ruta='') t8 using(Cliente) ");
RDebugUtils.currentLine=12976874;
 //BA.debugLineNum = 12976874;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente ='' and GRP<>'' and Ruta<>'') t9 on tGV.GRP=t9.GRP and tGV.RutaAplicable=t9.Ruta ");
RDebugUtils.currentLine=12976875;
 //BA.debugLineNum = 12976875;BA.debugLine="sbCP.Append(\"left join (Select * from tblConfPla";
_sbcp.Append("left join (Select * from tblConfPlazoFechaEntregaPlan where Articulo='' and Cliente ='' and GRP<>'' and Ruta='') t10 using(GRP) ");
RDebugUtils.currentLine=12976879;
 //BA.debugLineNum = 12976879;BA.debugLine="sbCP.Append(\"where tGV.Fabricacion=?\")";
_sbcp.Append("where tGV.Fabricacion=?");
RDebugUtils.currentLine=12976880;
 //BA.debugLineNum = 12976880;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sbCP.ToStri";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sbcp.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1)}));
RDebugUtils.currentLine=12976883;
 //BA.debugLineNum = 12976883;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976884;
 //BA.debugLineNum = 12976884;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 384;
return;
case 384:
//C
this.state = 189;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976885;
 //BA.debugLineNum = 12976885;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976885","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976886;
 //BA.debugLineNum = 12976886;BA.debugLine="If Not(Success) Then";
if (true) break;

case 189:
//if
this.state = 194;
if (parent.__c.Not(_success)) { 
this.state = 191;
}else {
this.state = 193;
}if (true) break;

case 191:
//C
this.state = 194;
RDebugUtils.currentLine=12976887;
 //BA.debugLineNum = 12976887;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976888;
 //BA.debugLineNum = 12976888;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 385;
return;
case 385:
//C
this.state = 194;
;
RDebugUtils.currentLine=12976889;
 //BA.debugLineNum = 12976889;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976890;
 //BA.debugLineNum = 12976890;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 193:
//C
this.state = 194;
RDebugUtils.currentLine=12976892;
 //BA.debugLineNum = 12976892;BA.debugLine="Log(\"Success insert into tblConfPlazoFechaEntre";
parent.__c.LogImpl("812976892","Success insert into tblConfPlazoFechaEntregaPlanArticulosFabGV",0);
 if (true) break;

case 194:
//C
this.state = 195;
;
RDebugUtils.currentLine=12976897;
 //BA.debugLineNum = 12976897;BA.debugLine="Dim TpD As Long=DateTime.TicksPerDay";
_tpd = parent.__c.DateTime.TicksPerDay;
RDebugUtils.currentLine=12976898;
 //BA.debugLineNum = 12976898;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976899;
 //BA.debugLineNum = 12976899;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976900;
 //BA.debugLineNum = 12976900;BA.debugLine="sb.Append(\"update tblConfPlazoFechaEntregaPlanAr";
_sb.Append("update tblConfPlazoFechaEntregaPlanArticulosFabGV set FechaDocumentoMasPlazoArtLinea= FechaDocumento+(PlazoArtLinea * ?)");
RDebugUtils.currentLine=12976903;
 //BA.debugLineNum = 12976903;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_tpd)}));
RDebugUtils.currentLine=12976904;
 //BA.debugLineNum = 12976904;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976905;
 //BA.debugLineNum = 12976905;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 386;
return;
case 386:
//C
this.state = 195;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976906;
 //BA.debugLineNum = 12976906;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976906","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976907;
 //BA.debugLineNum = 12976907;BA.debugLine="If Not(Success) Then";
if (true) break;

case 195:
//if
this.state = 200;
if (parent.__c.Not(_success)) { 
this.state = 197;
}else {
this.state = 199;
}if (true) break;

case 197:
//C
this.state = 200;
RDebugUtils.currentLine=12976908;
 //BA.debugLineNum = 12976908;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976909;
 //BA.debugLineNum = 12976909;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 387;
return;
case 387:
//C
this.state = 200;
;
RDebugUtils.currentLine=12976910;
 //BA.debugLineNum = 12976910;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976911;
 //BA.debugLineNum = 12976911;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 199:
//C
this.state = 200;
RDebugUtils.currentLine=12976913;
 //BA.debugLineNum = 12976913;BA.debugLine="Log(\"Success SQLite update tblConfPlazoFechaEnt";
parent.__c.LogImpl("812976913","Success SQLite update tblConfPlazoFechaEntregaPlanArticulosFabGV",0);
 if (true) break;

case 200:
//C
this.state = 201;
;
RDebugUtils.currentLine=12976918;
 //BA.debugLineNum = 12976918;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976919;
 //BA.debugLineNum = 12976919;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976920;
 //BA.debugLineNum = 12976920;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos \")";
_sb.Append("update tblGestionVentasCalculos ");
RDebugUtils.currentLine=12976921;
 //BA.debugLineNum = 12976921;BA.debugLine="sb.Append(\"set PlazoTeoricoFabLinea = t2.PlazoAr";
_sb.Append("set PlazoTeoricoFabLinea = t2.PlazoArtLinea  ");
RDebugUtils.currentLine=12976922;
 //BA.debugLineNum = 12976922;BA.debugLine="sb.append(\"from (select Documento, Linea, PlazoA";
_sb.Append("from (select Documento, Linea, PlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV) as t2 ");
RDebugUtils.currentLine=12976923;
 //BA.debugLineNum = 12976923;BA.debugLine="sb.Append(\" where tblGestionVentasCalculos.Docum";
_sb.Append(" where tblGestionVentasCalculos.Documento=t2.Documento and tblGestionVentasCalculos.Linea=t2.Linea");
RDebugUtils.currentLine=12976924;
 //BA.debugLineNum = 12976924;BA.debugLine="sb.Append(\" and tblGestionVentasCalculos.Articul";
_sb.Append(" and tblGestionVentasCalculos.ArticuloCorte=?");
RDebugUtils.currentLine=12976925;
 //BA.debugLineNum = 12976925;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI")}));
RDebugUtils.currentLine=12976929;
 //BA.debugLineNum = 12976929;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976930;
 //BA.debugLineNum = 12976930;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976931;
 //BA.debugLineNum = 12976931;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos \")";
_sb.Append("update tblGestionVentasCalculos ");
RDebugUtils.currentLine=12976932;
 //BA.debugLineNum = 12976932;BA.debugLine="sb.Append(\"set FechaTeoricaFabLinea = t2.FechaDo";
_sb.Append("set FechaTeoricaFabLinea = t2.FechaDocumentoMasPlazoArtLinea  ");
RDebugUtils.currentLine=12976933;
 //BA.debugLineNum = 12976933;BA.debugLine="sb.append(\"from (select Documento, Linea, FechaD";
_sb.Append("from (select Documento, Linea, FechaDocumentoMasPlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV) as t2 ");
RDebugUtils.currentLine=12976934;
 //BA.debugLineNum = 12976934;BA.debugLine="sb.Append(\" where tblGestionVentasCalculos.Docum";
_sb.Append(" where tblGestionVentasCalculos.Documento=t2.Documento and tblGestionVentasCalculos.Linea=t2.Linea");
RDebugUtils.currentLine=12976935;
 //BA.debugLineNum = 12976935;BA.debugLine="sb.Append(\" and tblGestionVentasCalculos.Articul";
_sb.Append(" and tblGestionVentasCalculos.ArticuloCorte=?");
RDebugUtils.currentLine=12976936;
 //BA.debugLineNum = 12976936;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI")}));
RDebugUtils.currentLine=12976938;
 //BA.debugLineNum = 12976938;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976939;
 //BA.debugLineNum = 12976939;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 388;
return;
case 388:
//C
this.state = 201;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976940;
 //BA.debugLineNum = 12976940;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976940","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976941;
 //BA.debugLineNum = 12976941;BA.debugLine="If Not(Success) Then";
if (true) break;

case 201:
//if
this.state = 206;
if (parent.__c.Not(_success)) { 
this.state = 203;
}else {
this.state = 205;
}if (true) break;

case 203:
//C
this.state = 206;
RDebugUtils.currentLine=12976942;
 //BA.debugLineNum = 12976942;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976943;
 //BA.debugLineNum = 12976943;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 389;
return;
case 389:
//C
this.state = 206;
;
RDebugUtils.currentLine=12976944;
 //BA.debugLineNum = 12976944;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976945;
 //BA.debugLineNum = 12976945;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 205:
//C
this.state = 206;
RDebugUtils.currentLine=12976947;
 //BA.debugLineNum = 12976947;BA.debugLine="Log(\"Success SQLite update FechaPlazoRutaAplica";
parent.__c.LogImpl("812976947","Success SQLite update FechaPlazoRutaAplicable",0);
 if (true) break;

case 206:
//C
this.state = 207;
;
RDebugUtils.currentLine=12976951;
 //BA.debugLineNum = 12976951;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976952;
 //BA.debugLineNum = 12976952;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976953;
 //BA.debugLineNum = 12976953;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos \")";
_sb.Append("update tblGestionVentasCalculos ");
RDebugUtils.currentLine=12976954;
 //BA.debugLineNum = 12976954;BA.debugLine="sb.Append(\"set FechaTeoricaEntrega= iif(FechaMat";
_sb.Append("set FechaTeoricaEntrega= iif(FechaMaterial>0 and ArticuloCorte=?, FechaMaterial, FechaTeoricaFabLinea)");
RDebugUtils.currentLine=12976955;
 //BA.debugLineNum = 12976955;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI")}));
RDebugUtils.currentLine=12976957;
 //BA.debugLineNum = 12976957;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976958;
 //BA.debugLineNum = 12976958;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 390;
return;
case 390:
//C
this.state = 207;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976959;
 //BA.debugLineNum = 12976959;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976959","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976960;
 //BA.debugLineNum = 12976960;BA.debugLine="If Not(Success) Then";
if (true) break;

case 207:
//if
this.state = 212;
if (parent.__c.Not(_success)) { 
this.state = 209;
}else {
this.state = 211;
}if (true) break;

case 209:
//C
this.state = 212;
RDebugUtils.currentLine=12976961;
 //BA.debugLineNum = 12976961;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976962;
 //BA.debugLineNum = 12976962;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 391;
return;
case 391:
//C
this.state = 212;
;
RDebugUtils.currentLine=12976963;
 //BA.debugLineNum = 12976963;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976964;
 //BA.debugLineNum = 12976964;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 211:
//C
this.state = 212;
RDebugUtils.currentLine=12976966;
 //BA.debugLineNum = 12976966;BA.debugLine="Log(\"Success SQLite update FechaTeoricaEntrega\"";
parent.__c.LogImpl("812976966","Success SQLite update FechaTeoricaEntrega",0);
 if (true) break;

case 212:
//C
this.state = 213;
;
RDebugUtils.currentLine=12976971;
 //BA.debugLineNum = 12976971;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblS";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblStockDisponibleAcumuladoArticuloTallaFecha");
RDebugUtils.currentLine=12976972;
 //BA.debugLineNum = 12976972;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976973;
 //BA.debugLineNum = 12976973;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976974;
 //BA.debugLineNum = 12976974;BA.debugLine="sb.Append(\"insert into tblStockDisponibleAcumula";
_sb.Append("insert into tblStockDisponibleAcumuladoArticuloTallaFecha (Articulo, Talla, Fecha, QtyDisponible, QtyDisponibleAcumulada, sFecha) ");
RDebugUtils.currentLine=12976975;
 //BA.debugLineNum = 12976975;BA.debugLine="sb.Append(\"Select Articulo, Talla, Fecha,QtyDisp";
_sb.Append("Select Articulo, Talla, Fecha,QtyDisponible,");
RDebugUtils.currentLine=12976976;
 //BA.debugLineNum = 12976976;BA.debugLine="sb.Append(\"(Select sum(tS1.QtyDisponible) from t";
_sb.Append("(Select sum(tS1.QtyDisponible) from tblStockDisponibleArticuloTallaFecha tS1 ");
RDebugUtils.currentLine=12976977;
 //BA.debugLineNum = 12976977;BA.debugLine="sb.Append(\"where tS1.Articulo=tS.Articulo And tS";
_sb.Append("where tS1.Articulo=tS.Articulo And tS1.Talla=tS.Talla And tS1.Fecha<=tS.Fecha group by tS1.Articulo, tS1.Talla) QtyDisponibleAcumulada, ");
RDebugUtils.currentLine=12976978;
 //BA.debugLineNum = 12976978;BA.debugLine="sb.Append(\"sFecha \")";
_sb.Append("sFecha ");
RDebugUtils.currentLine=12976979;
 //BA.debugLineNum = 12976979;BA.debugLine="sb.Append(\"from tblStockDisponibleArticuloTallaF";
_sb.Append("from tblStockDisponibleArticuloTallaFecha tS ORDER BY Articulo, Talla, Fecha");
RDebugUtils.currentLine=12976980;
 //BA.debugLineNum = 12976980;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12976981;
 //BA.debugLineNum = 12976981;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12976982;
 //BA.debugLineNum = 12976982;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 392;
return;
case 392:
//C
this.state = 213;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12976983;
 //BA.debugLineNum = 12976983;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812976983","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12976984;
 //BA.debugLineNum = 12976984;BA.debugLine="If Not(Success) Then";
if (true) break;

case 213:
//if
this.state = 218;
if (parent.__c.Not(_success)) { 
this.state = 215;
}else {
this.state = 217;
}if (true) break;

case 215:
//C
this.state = 218;
RDebugUtils.currentLine=12976985;
 //BA.debugLineNum = 12976985;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12976986;
 //BA.debugLineNum = 12976986;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 393;
return;
case 393:
//C
this.state = 218;
;
RDebugUtils.currentLine=12976987;
 //BA.debugLineNum = 12976987;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12976988;
 //BA.debugLineNum = 12976988;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 217:
//C
this.state = 218;
RDebugUtils.currentLine=12976990;
 //BA.debugLineNum = 12976990;BA.debugLine="Log(\"Success SQLite delete from tblStockDisponi";
parent.__c.LogImpl("812976990","Success SQLite delete from tblStockDisponibleAcumuladoArticuloTallaFecha",0);
 if (true) break;

case 218:
//C
this.state = 219;
;
RDebugUtils.currentLine=12976995;
 //BA.debugLineNum = 12976995;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12976996;
 //BA.debugLineNum = 12976996;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12976998;
 //BA.debugLineNum = 12976998;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=");
RDebugUtils.currentLine=12976999;
 //BA.debugLineNum = 12976999;BA.debugLine="sb.Append(\"ifnull((Select Fecha from tblStockDis";
_sb.Append("ifnull((Select Fecha from tblStockDisponibleAcumuladoArticuloTallaFecha As t2 where t1.Articulo=t2.Articulo And t1.Talla=t2.Talla ");
RDebugUtils.currentLine=12977000;
 //BA.debugLineNum = 12977000;BA.debugLine="sb.Append(\"And t2.QtyDisponibleAcumulada>=t1.Qty";
_sb.Append("And t2.QtyDisponibleAcumulada>=t1.QtyPteNetaAcum and AlmOrigenGV=1 limit 1),0)");
RDebugUtils.currentLine=12977001;
 //BA.debugLineNum = 12977001;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977002;
 //BA.debugLineNum = 12977002;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977003;
 //BA.debugLineNum = 12977003;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 394;
return;
case 394:
//C
this.state = 219;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977004;
 //BA.debugLineNum = 12977004;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977004","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977005;
 //BA.debugLineNum = 12977005;BA.debugLine="If Not(Success) Then";
if (true) break;

case 219:
//if
this.state = 224;
if (parent.__c.Not(_success)) { 
this.state = 221;
}else {
this.state = 223;
}if (true) break;

case 221:
//C
this.state = 224;
RDebugUtils.currentLine=12977006;
 //BA.debugLineNum = 12977006;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977007;
 //BA.debugLineNum = 12977007;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 395;
return;
case 395:
//C
this.state = 224;
;
RDebugUtils.currentLine=12977008;
 //BA.debugLineNum = 12977008;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977009;
 //BA.debugLineNum = 12977009;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 223:
//C
this.state = 224;
RDebugUtils.currentLine=12977011;
 //BA.debugLineNum = 12977011;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812977011","Success SQLite update tblGestionVentasCalculos",0);
 if (true) break;

case 224:
//C
this.state = 225;
;
RDebugUtils.currentLine=12977020;
 //BA.debugLineNum = 12977020;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977021;
 //BA.debugLineNum = 12977021;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977022;
 //BA.debugLineNum = 12977022;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=");
RDebugUtils.currentLine=12977024;
 //BA.debugLineNum = 12977024;BA.debugLine="sb.append(\"(Select FechaDocumentoMasPlazoArtLine";
_sb.Append("(Select FechaDocumentoMasPlazoArtLinea from tblConfPlazoFechaEntregaPlanArticulosFabGV t2");
RDebugUtils.currentLine=12977025;
 //BA.debugLineNum = 12977025;BA.debugLine="sb.Append(\" where t1.Documento=t2.Documento and";
_sb.Append(" where t1.Documento=t2.Documento and t1.Linea=t2.Linea)");
RDebugUtils.currentLine=12977027;
 //BA.debugLineNum = 12977027;BA.debugLine="sb.Append(\" where t1.Fabricacion=? and t1.QtyDis";
_sb.Append(" where t1.Fabricacion=? and t1.QtyDisponibleAcum<?");
RDebugUtils.currentLine=12977029;
 //BA.debugLineNum = 12977029;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(1),(Object)(0)}));
RDebugUtils.currentLine=12977030;
 //BA.debugLineNum = 12977030;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977031;
 //BA.debugLineNum = 12977031;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 396;
return;
case 396:
//C
this.state = 225;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977032;
 //BA.debugLineNum = 12977032;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977032","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977033;
 //BA.debugLineNum = 12977033;BA.debugLine="If Not(Success) Then";
if (true) break;

case 225:
//if
this.state = 230;
if (parent.__c.Not(_success)) { 
this.state = 227;
}else {
this.state = 229;
}if (true) break;

case 227:
//C
this.state = 230;
RDebugUtils.currentLine=12977034;
 //BA.debugLineNum = 12977034;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977035;
 //BA.debugLineNum = 12977035;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 397;
return;
case 397:
//C
this.state = 230;
;
RDebugUtils.currentLine=12977036;
 //BA.debugLineNum = 12977036;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977037;
 //BA.debugLineNum = 12977037;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 229:
//C
this.state = 230;
RDebugUtils.currentLine=12977039;
 //BA.debugLineNum = 12977039;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812977039","Success SQLite update tblGestionVentasCalculos",0);
 if (true) break;

case 230:
//C
this.state = 231;
;
RDebugUtils.currentLine=12977044;
 //BA.debugLineNum = 12977044;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977045;
 //BA.debugLineNum = 12977045;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977046;
 //BA.debugLineNum = 12977046;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=FechaMaterial");
RDebugUtils.currentLine=12977047;
 //BA.debugLineNum = 12977047;BA.debugLine="sb.Append(\" where FechaMaterial>0 and ArticuloCo";
_sb.Append(" where FechaMaterial>0 and ArticuloCorte=?");
RDebugUtils.currentLine=12977048;
 //BA.debugLineNum = 12977048;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI")}));
RDebugUtils.currentLine=12977049;
 //BA.debugLineNum = 12977049;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977050;
 //BA.debugLineNum = 12977050;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 398;
return;
case 398:
//C
this.state = 231;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977051;
 //BA.debugLineNum = 12977051;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977051","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977052;
 //BA.debugLineNum = 12977052;BA.debugLine="If Not(Success) Then";
if (true) break;

case 231:
//if
this.state = 236;
if (parent.__c.Not(_success)) { 
this.state = 233;
}else {
this.state = 235;
}if (true) break;

case 233:
//C
this.state = 236;
RDebugUtils.currentLine=12977053;
 //BA.debugLineNum = 12977053;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977054;
 //BA.debugLineNum = 12977054;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 399;
return;
case 399:
//C
this.state = 236;
;
RDebugUtils.currentLine=12977055;
 //BA.debugLineNum = 12977055;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977056;
 //BA.debugLineNum = 12977056;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 235:
//C
this.state = 236;
RDebugUtils.currentLine=12977058;
 //BA.debugLineNum = 12977058;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812977058","Success SQLite update tblGestionVentasCalculos",0);
 if (true) break;

case 236:
//C
this.state = 237;
;
RDebugUtils.currentLine=12977063;
 //BA.debugLineNum = 12977063;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977064;
 //BA.debugLineNum = 12977064;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977065;
 //BA.debugLineNum = 12977065;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=FechaPlanificada");
RDebugUtils.currentLine=12977066;
 //BA.debugLineNum = 12977066;BA.debugLine="sb.Append(\" where FechaPlanificada>0 and Articul";
_sb.Append(" where FechaPlanificada>0 and ArticuloCorte=?");
RDebugUtils.currentLine=12977067;
 //BA.debugLineNum = 12977067;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI")}));
RDebugUtils.currentLine=12977068;
 //BA.debugLineNum = 12977068;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977069;
 //BA.debugLineNum = 12977069;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 400;
return;
case 400:
//C
this.state = 237;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977070;
 //BA.debugLineNum = 12977070;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977070","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977071;
 //BA.debugLineNum = 12977071;BA.debugLine="If Not(Success) Then";
if (true) break;

case 237:
//if
this.state = 242;
if (parent.__c.Not(_success)) { 
this.state = 239;
}else {
this.state = 241;
}if (true) break;

case 239:
//C
this.state = 242;
RDebugUtils.currentLine=12977072;
 //BA.debugLineNum = 12977072;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977073;
 //BA.debugLineNum = 12977073;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 401;
return;
case 401:
//C
this.state = 242;
;
RDebugUtils.currentLine=12977074;
 //BA.debugLineNum = 12977074;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977075;
 //BA.debugLineNum = 12977075;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 241:
//C
this.state = 242;
RDebugUtils.currentLine=12977077;
 //BA.debugLineNum = 12977077;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812977077","Success SQLite update tblGestionVentasCalculos",0);
 if (true) break;

case 242:
//C
this.state = 243;
;
RDebugUtils.currentLine=12977104;
 //BA.debugLineNum = 12977104;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977105;
 //BA.debugLineNum = 12977105;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977106;
 //BA.debugLineNum = 12977106;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
_sb.Append("update tblGestionVentasCalculos set FechaDisponibilidad=FechaDisponibilidad + ? where Personalizado=? and FechaDisponibilidad>0");
RDebugUtils.currentLine=12977107;
 //BA.debugLineNum = 12977107;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)((10*parent.__c.DateTime.TicksPerDay)),(Object)(1)}));
RDebugUtils.currentLine=12977108;
 //BA.debugLineNum = 12977108;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977109;
 //BA.debugLineNum = 12977109;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 402;
return;
case 402:
//C
this.state = 243;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977110;
 //BA.debugLineNum = 12977110;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977110","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977111;
 //BA.debugLineNum = 12977111;BA.debugLine="If Not(Success) Then";
if (true) break;

case 243:
//if
this.state = 248;
if (parent.__c.Not(_success)) { 
this.state = 245;
}else {
this.state = 247;
}if (true) break;

case 245:
//C
this.state = 248;
RDebugUtils.currentLine=12977112;
 //BA.debugLineNum = 12977112;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977113;
 //BA.debugLineNum = 12977113;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 403;
return;
case 403:
//C
this.state = 248;
;
RDebugUtils.currentLine=12977114;
 //BA.debugLineNum = 12977114;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977115;
 //BA.debugLineNum = 12977115;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 247:
//C
this.state = 248;
RDebugUtils.currentLine=12977117;
 //BA.debugLineNum = 12977117;BA.debugLine="Log(\"Success SQLite update FechaDisponibilidad\"";
parent.__c.LogImpl("812977117","Success SQLite update FechaDisponibilidad",0);
 if (true) break;

case 248:
//C
this.state = 249;
;
RDebugUtils.currentLine=12977122;
 //BA.debugLineNum = 12977122;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977123;
 //BA.debugLineNum = 12977123;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977124;
 //BA.debugLineNum = 12977124;BA.debugLine="sb.Append(\"insert into tblStockDisponibleArticul";
_sb.Append("insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV select AlmDest, Articulo, Talla, FechaDisponibilidad+? as Fecha, sum(QtyPte) as QtyDisponible, DATE(ROUND(FechaDisponibilidad+?/ 1000), 'unixepoch') as sFecha");
RDebugUtils.currentLine=12977125;
 //BA.debugLineNum = 12977125;BA.debugLine="sb.Append(\" from tblGestionVentasCalculos\")";
_sb.Append(" from tblGestionVentasCalculos");
RDebugUtils.currentLine=12977126;
 //BA.debugLineNum = 12977126;BA.debugLine="sb.Append(\" where AlmDest<>? and FechaDisponibil";
_sb.Append(" where AlmDest<>? and FechaDisponibilidad>0");
RDebugUtils.currentLine=12977127;
 //BA.debugLineNum = 12977127;BA.debugLine="sb.Append(\" group by AlmDest,Articulo, Talla, Fe";
_sb.Append(" group by AlmDest,Articulo, Talla, Fecha, sFecha");
RDebugUtils.currentLine=12977128;
 //BA.debugLineNum = 12977128;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.TicksPerDay),(Object)(parent.__c.DateTime.TicksPerDay),(Object)("")}));
RDebugUtils.currentLine=12977129;
 //BA.debugLineNum = 12977129;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977130;
 //BA.debugLineNum = 12977130;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 404;
return;
case 404:
//C
this.state = 249;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977131;
 //BA.debugLineNum = 12977131;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977131","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977132;
 //BA.debugLineNum = 12977132;BA.debugLine="If Not(Success) Then";
if (true) break;

case 249:
//if
this.state = 254;
if (parent.__c.Not(_success)) { 
this.state = 251;
}else {
this.state = 253;
}if (true) break;

case 251:
//C
this.state = 254;
RDebugUtils.currentLine=12977133;
 //BA.debugLineNum = 12977133;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977134;
 //BA.debugLineNum = 12977134;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 405;
return;
case 405:
//C
this.state = 254;
;
RDebugUtils.currentLine=12977135;
 //BA.debugLineNum = 12977135;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977136;
 //BA.debugLineNum = 12977136;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 253:
//C
this.state = 254;
RDebugUtils.currentLine=12977139;
 //BA.debugLineNum = 12977139;BA.debugLine="Log(\"Success SQLite insert into tblStockDisponi";
parent.__c.LogImpl("812977139","Success SQLite insert into tblStockDisponibleArticuloTallaFechaAlmacenesNoGV datos documentos alm destino<>'' , con fechadisponbilidad>0",0);
 if (true) break;

case 254:
//C
this.state = 255;
;
RDebugUtils.currentLine=12977143;
 //BA.debugLineNum = 12977143;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"delete from tblS";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV");
RDebugUtils.currentLine=12977144;
 //BA.debugLineNum = 12977144;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977145;
 //BA.debugLineNum = 12977145;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977146;
 //BA.debugLineNum = 12977146;BA.debugLine="sb.Append(\"insert into tblStockDisponibleAcumula";
_sb.Append("insert into tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV (Almacen, Articulo, Talla, Fecha, QtyDisponible, QtyDisponibleAcumulada, sFecha) ");
RDebugUtils.currentLine=12977147;
 //BA.debugLineNum = 12977147;BA.debugLine="sb.Append(\"Select Almacen, Articulo, Talla, Fech";
_sb.Append("Select Almacen, Articulo, Talla, Fecha,QtyDisponible,");
RDebugUtils.currentLine=12977148;
 //BA.debugLineNum = 12977148;BA.debugLine="sb.Append(\"(Select sum(tS1.QtyDisponible) from t";
_sb.Append("(Select sum(tS1.QtyDisponible) from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV tS1 ");
RDebugUtils.currentLine=12977149;
 //BA.debugLineNum = 12977149;BA.debugLine="sb.Append(\"where tS1.Almacen=tS.Almacen and tS1.";
_sb.Append("where tS1.Almacen=tS.Almacen and tS1.Articulo=tS.Articulo And tS1.Talla=tS.Talla And tS1.Fecha<=tS.Fecha group by tS1.Almacen, tS1.Articulo, tS1.Talla) QtyDisponibleAcumulada, ");
RDebugUtils.currentLine=12977150;
 //BA.debugLineNum = 12977150;BA.debugLine="sb.Append(\"sFecha \")";
_sb.Append("sFecha ");
RDebugUtils.currentLine=12977151;
 //BA.debugLineNum = 12977151;BA.debugLine="sb.Append(\"from tblStockDisponibleArticuloTallaF";
_sb.Append("from tblStockDisponibleArticuloTallaFechaAlmacenesNoGV tS ORDER BY Almacen, Articulo, Talla, Fecha");
RDebugUtils.currentLine=12977152;
 //BA.debugLineNum = 12977152;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977153;
 //BA.debugLineNum = 12977153;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977154;
 //BA.debugLineNum = 12977154;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 406;
return;
case 406:
//C
this.state = 255;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977155;
 //BA.debugLineNum = 12977155;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977155","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977156;
 //BA.debugLineNum = 12977156;BA.debugLine="If Not(Success) Then";
if (true) break;

case 255:
//if
this.state = 260;
if (parent.__c.Not(_success)) { 
this.state = 257;
}else {
this.state = 259;
}if (true) break;

case 257:
//C
this.state = 260;
RDebugUtils.currentLine=12977157;
 //BA.debugLineNum = 12977157;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977158;
 //BA.debugLineNum = 12977158;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 407;
return;
case 407:
//C
this.state = 260;
;
RDebugUtils.currentLine=12977159;
 //BA.debugLineNum = 12977159;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977160;
 //BA.debugLineNum = 12977160;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 259:
//C
this.state = 260;
RDebugUtils.currentLine=12977162;
 //BA.debugLineNum = 12977162;BA.debugLine="Log(\"Success SQLite delete from tblStockDisponi";
parent.__c.LogImpl("812977162","Success SQLite delete from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV",0);
 if (true) break;

case 260:
//C
this.state = 261;
;
RDebugUtils.currentLine=12977167;
 //BA.debugLineNum = 12977167;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977168;
 //BA.debugLineNum = 12977168;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977170;
 //BA.debugLineNum = 12977170;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=");
RDebugUtils.currentLine=12977171;
 //BA.debugLineNum = 12977171;BA.debugLine="sb.Append(\"ifnull((Select Fecha from tblStockDis";
_sb.Append("ifnull((Select Fecha from tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV As t2 where t1.AlmOrigen=t2.Almacen and t1.Articulo=t2.Articulo And t1.Talla=t2.Talla ");
RDebugUtils.currentLine=12977172;
 //BA.debugLineNum = 12977172;BA.debugLine="sb.Append(\"And t2.QtyDisponibleAcumulada>=t1.Qty";
_sb.Append("And t2.QtyDisponibleAcumulada>=t1.QtyPteNetaAcum and AlmOrigenGV=0 limit 1),0)");
RDebugUtils.currentLine=12977173;
 //BA.debugLineNum = 12977173;BA.debugLine="sb.Append(\" where AlmOrigenGV=0\")";
_sb.Append(" where AlmOrigenGV=0");
RDebugUtils.currentLine=12977174;
 //BA.debugLineNum = 12977174;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977175;
 //BA.debugLineNum = 12977175;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977176;
 //BA.debugLineNum = 12977176;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 408;
return;
case 408:
//C
this.state = 261;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977177;
 //BA.debugLineNum = 12977177;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977177","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977178;
 //BA.debugLineNum = 12977178;BA.debugLine="If Not(Success) Then";
if (true) break;

case 261:
//if
this.state = 266;
if (parent.__c.Not(_success)) { 
this.state = 263;
}else {
this.state = 265;
}if (true) break;

case 263:
//C
this.state = 266;
RDebugUtils.currentLine=12977179;
 //BA.debugLineNum = 12977179;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977180;
 //BA.debugLineNum = 12977180;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 409;
return;
case 409:
//C
this.state = 266;
;
RDebugUtils.currentLine=12977181;
 //BA.debugLineNum = 12977181;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977182;
 //BA.debugLineNum = 12977182;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 265:
//C
this.state = 266;
RDebugUtils.currentLine=12977184;
 //BA.debugLineNum = 12977184;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812977184","Success SQLite update tblGestionVentasCalculos",0);
 if (true) break;

case 266:
//C
this.state = 267;
;
RDebugUtils.currentLine=12977189;
 //BA.debugLineNum = 12977189;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977190;
 //BA.debugLineNum = 12977190;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977191;
 //BA.debugLineNum = 12977191;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidadVencida=iif(FechaDisponibilidad<?,'SI','NO') ");
RDebugUtils.currentLine=12977192;
 //BA.debugLineNum = 12977192;BA.debugLine="sb.Append(\" where FechaDisponibilidad>0\")";
_sb.Append(" where FechaDisponibilidad>0");
RDebugUtils.currentLine=12977193;
 //BA.debugLineNum = 12977193;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fechahoy)}));
RDebugUtils.currentLine=12977194;
 //BA.debugLineNum = 12977194;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977195;
 //BA.debugLineNum = 12977195;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 410;
return;
case 410:
//C
this.state = 267;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977196;
 //BA.debugLineNum = 12977196;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977196","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977197;
 //BA.debugLineNum = 12977197;BA.debugLine="If Not(Success) Then";
if (true) break;

case 267:
//if
this.state = 272;
if (parent.__c.Not(_success)) { 
this.state = 269;
}else {
this.state = 271;
}if (true) break;

case 269:
//C
this.state = 272;
RDebugUtils.currentLine=12977198;
 //BA.debugLineNum = 12977198;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977199;
 //BA.debugLineNum = 12977199;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 411;
return;
case 411:
//C
this.state = 272;
;
RDebugUtils.currentLine=12977200;
 //BA.debugLineNum = 12977200;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977201;
 //BA.debugLineNum = 12977201;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 271:
//C
this.state = 272;
RDebugUtils.currentLine=12977203;
 //BA.debugLineNum = 12977203;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812977203","Success SQLite update tblGestionVentasCalculos FechaDisponibilidadVencida",0);
 if (true) break;

case 272:
//C
this.state = 273;
;
RDebugUtils.currentLine=12977209;
 //BA.debugLineNum = 12977209;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977210;
 //BA.debugLineNum = 12977210;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977212;
 //BA.debugLineNum = 12977212;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
_sb.Append("update tblGestionVentasCalculos set FechaPrevVentasLinea=FechaDisponibilidad where PedidoAbierto=0 and FechaDisponibilidad>0 and FechaDisponibilidad>=FechaRequerida");
RDebugUtils.currentLine=12977213;
 //BA.debugLineNum = 12977213;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977214;
 //BA.debugLineNum = 12977214;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977215;
 //BA.debugLineNum = 12977215;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 412;
return;
case 412:
//C
this.state = 273;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977216;
 //BA.debugLineNum = 12977216;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977216","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977217;
 //BA.debugLineNum = 12977217;BA.debugLine="If Not(Success) Then";
if (true) break;

case 273:
//if
this.state = 278;
if (parent.__c.Not(_success)) { 
this.state = 275;
}else {
this.state = 277;
}if (true) break;

case 275:
//C
this.state = 278;
RDebugUtils.currentLine=12977218;
 //BA.debugLineNum = 12977218;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977219;
 //BA.debugLineNum = 12977219;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 413;
return;
case 413:
//C
this.state = 278;
;
RDebugUtils.currentLine=12977220;
 //BA.debugLineNum = 12977220;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977221;
 //BA.debugLineNum = 12977221;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 277:
//C
this.state = 278;
RDebugUtils.currentLine=12977223;
 //BA.debugLineNum = 12977223;BA.debugLine="Log(\"Success SQLite update FechaPrevVentasLinea";
parent.__c.LogImpl("812977223","Success SQLite update FechaPrevVentasLinea",0);
 if (true) break;

case 278:
//C
this.state = 279;
;
RDebugUtils.currentLine=12977228;
 //BA.debugLineNum = 12977228;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977229;
 //BA.debugLineNum = 12977229;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977230;
 //BA.debugLineNum = 12977230;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
_sb.Append("update tblGestionVentasCalculos set FechaPrevVentasLinea=FechaRequerida where PedidoAbierto=0 and FechaRequerida>0 and FechaDisponibilidad>0 and FechaRequerida>FechaDisponibilidad");
RDebugUtils.currentLine=12977231;
 //BA.debugLineNum = 12977231;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977232;
 //BA.debugLineNum = 12977232;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977233;
 //BA.debugLineNum = 12977233;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 414;
return;
case 414:
//C
this.state = 279;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977234;
 //BA.debugLineNum = 12977234;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977234","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977235;
 //BA.debugLineNum = 12977235;BA.debugLine="If Not(Success) Then";
if (true) break;

case 279:
//if
this.state = 284;
if (parent.__c.Not(_success)) { 
this.state = 281;
}else {
this.state = 283;
}if (true) break;

case 281:
//C
this.state = 284;
RDebugUtils.currentLine=12977236;
 //BA.debugLineNum = 12977236;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977237;
 //BA.debugLineNum = 12977237;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 415;
return;
case 415:
//C
this.state = 284;
;
RDebugUtils.currentLine=12977238;
 //BA.debugLineNum = 12977238;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977239;
 //BA.debugLineNum = 12977239;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 283:
//C
this.state = 284;
RDebugUtils.currentLine=12977241;
 //BA.debugLineNum = 12977241;BA.debugLine="Log(\"Success SQLite update FechaPrevVentasLinea";
parent.__c.LogImpl("812977241","Success SQLite update FechaPrevVentasLinea",0);
 if (true) break;

case 284:
//C
this.state = 285;
;
RDebugUtils.currentLine=12977246;
 //BA.debugLineNum = 12977246;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977247;
 //BA.debugLineNum = 12977247;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977248;
 //BA.debugLineNum = 12977248;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaPrevVentasLineaVencida=iif(FechaPrevVentasLinea<?,'SI','NO') ");
RDebugUtils.currentLine=12977249;
 //BA.debugLineNum = 12977249;BA.debugLine="sb.Append(\" where FechaPrevVentasLinea>0\")";
_sb.Append(" where FechaPrevVentasLinea>0");
RDebugUtils.currentLine=12977250;
 //BA.debugLineNum = 12977250;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fechahoy)}));
RDebugUtils.currentLine=12977251;
 //BA.debugLineNum = 12977251;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977252;
 //BA.debugLineNum = 12977252;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 416;
return;
case 416:
//C
this.state = 285;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977253;
 //BA.debugLineNum = 12977253;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977253","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977254;
 //BA.debugLineNum = 12977254;BA.debugLine="If Not(Success) Then";
if (true) break;

case 285:
//if
this.state = 290;
if (parent.__c.Not(_success)) { 
this.state = 287;
}else {
this.state = 289;
}if (true) break;

case 287:
//C
this.state = 290;
RDebugUtils.currentLine=12977255;
 //BA.debugLineNum = 12977255;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977256;
 //BA.debugLineNum = 12977256;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 417;
return;
case 417:
//C
this.state = 290;
;
RDebugUtils.currentLine=12977257;
 //BA.debugLineNum = 12977257;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977258;
 //BA.debugLineNum = 12977258;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 289:
//C
this.state = 290;
RDebugUtils.currentLine=12977260;
 //BA.debugLineNum = 12977260;BA.debugLine="Log(\"Success SQLite update tblGestionVentasCalc";
parent.__c.LogImpl("812977260","Success SQLite update tblGestionVentasCalculos FechaPrevVentasLineaVencida",0);
 if (true) break;

case 290:
//C
this.state = 291;
;
RDebugUtils.currentLine=12977264;
 //BA.debugLineNum = 12977264;BA.debugLine="Dim rs As ResultSet=mSQLGestionventas.ExecQuery(";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select distinct Documento from tblGestionVentasCalculos");
RDebugUtils.currentLine=12977265;
 //BA.debugLineNum = 12977265;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 291:
//do while
this.state = 298;
while (_rs.NextRow()) {
this.state = 293;
if (true) break;
}
if (true) break;

case 293:
//C
this.state = 294;
RDebugUtils.currentLine=12977266;
 //BA.debugLineNum = 12977266;BA.debugLine="Dim Doc As String=rs.GetString(\"Documento\")";
_doc = _rs.GetString("Documento");
RDebugUtils.currentLine=12977267;
 //BA.debugLineNum = 12977267;BA.debugLine="Dim NumLinDocSinFechaCalcPrevVentas As Int=jamT";
_numlindocsinfechacalcprevventas = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._fixnullint /*int*/ (null,(Object)(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblGestionVentasCalculos where Documento=? and FechaPrevVentasLinea<?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_doc,BA.NumberToString(_fechahoy)}))));
RDebugUtils.currentLine=12977269;
 //BA.debugLineNum = 12977269;BA.debugLine="If NumLinDocSinFechaCalcPrevVentas=0 Then";
if (true) break;

case 294:
//if
this.state = 297;
if (_numlindocsinfechacalcprevventas==0) { 
this.state = 296;
}if (true) break;

case 296:
//C
this.state = 297;
RDebugUtils.currentLine=12977270;
 //BA.debugLineNum = 12977270;BA.debugLine="Dim MaxFechaCalcPrevVentasDoc As Long=mSQLGest";
_maxfechacalcprevventasdoc = (long)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select max(FechaPrevVentasLinea) from tblGestionVentasCalculos where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_doc}))));
RDebugUtils.currentLine=12977272;
 //BA.debugLineNum = 12977272;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"update t";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblGestionVentasCalculos set FechaPrevVentasDocumento=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_maxfechacalcprevventasdoc),(Object)(_doc)}));
 if (true) break;

case 297:
//C
this.state = 291;
;
 if (true) break;

case 298:
//C
this.state = 299;
;
RDebugUtils.currentLine=12977275;
 //BA.debugLineNum = 12977275;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=12977276;
 //BA.debugLineNum = 12977276;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977277;
 //BA.debugLineNum = 12977277;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 418;
return;
case 418:
//C
this.state = 299;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977278;
 //BA.debugLineNum = 12977278;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977278","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977282;
 //BA.debugLineNum = 12977282;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(\"update tbl";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblGestionVentasCalculos set FechaPrevVentasDocumento=FechaPrevVentasLinea where FechaPrevVentasLinea>? and FechaRequerida>0",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fechahoy)}));
RDebugUtils.currentLine=12977283;
 //BA.debugLineNum = 12977283;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977284;
 //BA.debugLineNum = 12977284;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 419;
return;
case 419:
//C
this.state = 299;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977285;
 //BA.debugLineNum = 12977285;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977285","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977290;
 //BA.debugLineNum = 12977290;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=12977291;
 //BA.debugLineNum = 12977291;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=12977292;
 //BA.debugLineNum = 12977292;BA.debugLine="Log(DateTime.DateParse(\"01/01/2000\"))";
parent.__c.LogImpl("812977292",BA.NumberToString(parent.__c.DateTime.DateParse("01/01/2000")),0);
RDebugUtils.currentLine=12977293;
 //BA.debugLineNum = 12977293;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977294;
 //BA.debugLineNum = 12977294;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977295;
 //BA.debugLineNum = 12977295;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos set F";
_sb.Append("update tblGestionVentasCalculos set FechaCalculoActualCliente=0 where FechaCalculoActualCliente<"+BA.NumberToString(parent.__c.DateTime.DateParse("01/02/2000")));
RDebugUtils.currentLine=12977296;
 //BA.debugLineNum = 12977296;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=12977297;
 //BA.debugLineNum = 12977297;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977298;
 //BA.debugLineNum = 12977298;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977299;
 //BA.debugLineNum = 12977299;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 420;
return;
case 420:
//C
this.state = 299;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977300;
 //BA.debugLineNum = 12977300;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977300","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977301;
 //BA.debugLineNum = 12977301;BA.debugLine="If Not(Success) Then";
if (true) break;

case 299:
//if
this.state = 304;
if (parent.__c.Not(_success)) { 
this.state = 301;
}else {
this.state = 303;
}if (true) break;

case 301:
//C
this.state = 304;
RDebugUtils.currentLine=12977302;
 //BA.debugLineNum = 12977302;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977303;
 //BA.debugLineNum = 12977303;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 421;
return;
case 421:
//C
this.state = 304;
;
RDebugUtils.currentLine=12977304;
 //BA.debugLineNum = 12977304;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977305;
 //BA.debugLineNum = 12977305;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 303:
//C
this.state = 304;
RDebugUtils.currentLine=12977307;
 //BA.debugLineNum = 12977307;BA.debugLine="Log(\"Success SQLite update FechaCalculoActualCl";
parent.__c.LogImpl("812977307","Success SQLite update FechaCalculoActualCliente=01/01/2000",0);
 if (true) break;

case 304:
//C
this.state = 313;
;
 if (true) break;

case 306:
//C
this.state = 307;
RDebugUtils.currentLine=12977330;
 //BA.debugLineNum = 12977330;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977331;
 //BA.debugLineNum = 12977331;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977332;
 //BA.debugLineNum = 12977332;BA.debugLine="sb.Append(\"update tblGestionVentasCalculos As t1";
_sb.Append("update tblGestionVentasCalculos As t1 set FechaDisponibilidad=0, FechaDisponibilidadVencida='', FechaPrevVentasLinea=0, FechaPrevVentasdocumento=0");
RDebugUtils.currentLine=12977333;
 //BA.debugLineNum = 12977333;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977334;
 //BA.debugLineNum = 12977334;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.E";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977335;
 //BA.debugLineNum = 12977335;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 422;
return;
case 422:
//C
this.state = 307;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977336;
 //BA.debugLineNum = 12977336;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977336","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977337;
 //BA.debugLineNum = 12977337;BA.debugLine="If Not(Success) Then";
if (true) break;

case 307:
//if
this.state = 312;
if (parent.__c.Not(_success)) { 
this.state = 309;
}else {
this.state = 311;
}if (true) break;

case 309:
//C
this.state = 312;
RDebugUtils.currentLine=12977338;
 //BA.debugLineNum = 12977338;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977339;
 //BA.debugLineNum = 12977339;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 423;
return;
case 423:
//C
this.state = 312;
;
RDebugUtils.currentLine=12977340;
 //BA.debugLineNum = 12977340;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977341;
 //BA.debugLineNum = 12977341;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 311:
//C
this.state = 312;
RDebugUtils.currentLine=12977343;
 //BA.debugLineNum = 12977343;BA.debugLine="Log(\"Success SQLite update FechaDisponibilidad=";
parent.__c.LogImpl("812977343","Success SQLite update FechaDisponibilidad=0",0);
 if (true) break;

case 312:
//C
this.state = 313;
;
 if (true) break;

case 313:
//C
this.state = 314;
;
RDebugUtils.currentLine=12977368;
 //BA.debugLineNum = 12977368;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12977369;
 //BA.debugLineNum = 12977369;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12977370;
 //BA.debugLineNum = 12977370;BA.debugLine="sb.Append(\"insert into tblGestionVentas (\")";
_sb.Append("insert into tblGestionVentas (");
RDebugUtils.currentLine=12977371;
 //BA.debugLineNum = 12977371;BA.debugLine="sb.Append(\"IDPrioridad, IDPrioridadUsuario, Codig";
_sb.Append("IDPrioridad, IDPrioridadUsuario, CodigoResponsableCuenta,NombreResponsableCuenta, CodigoVendedor, NombreVendedor,");
RDebugUtils.currentLine=12977372;
 //BA.debugLineNum = 12977372;BA.debugLine="sb.Append(\"Documento,FechaDocumento, FechaPrometi";
_sb.Append("Documento,FechaDocumento, FechaPrometida, Cliente, NombreCliente, GRP, NombreGRP, DirEnv, CiudadDirEnvio, PedidoCliente, Stand_By,");
RDebugUtils.currentLine=12977373;
 //BA.debugLineNum = 12977373;BA.debugLine="sb.Append(\"PedidoBloqueado, PedidoAbierto, Linea,";
_sb.Append("PedidoBloqueado, PedidoAbierto, Linea, AlmOrigen, AlmOrigenGV, AlmDest, Personalizado, Fabricacion, CompraFab, Dual, Ruta, PlazoRuta, RutaDual, PlazoRutaDual, ArticuloCorte,FechaMaterial, FechaPlanificada, FechaRequerida, ");
RDebugUtils.currentLine=12977374;
 //BA.debugLineNum = 12977374;BA.debugLine="sb.Append(\"Ruta, Articulo, DescripcionArticulo, T";
_sb.Append("Ruta, Articulo, DescripcionArticulo, Talla,");
RDebugUtils.currentLine=12977375;
 //BA.debugLineNum = 12977375;BA.debugLine="sb.Append(\"QtyPte, Reserva, StockLibre, StockAlmN";
_sb.Append("QtyPte, Reserva, StockLibre, StockAlmNoGV, QtyPteNeta,QtyPteNetaAcum, QtyDisponibleAcum, Status, ReservaAlmacen, ImportePendiente, FechaDisponibilidad, FechaDisponibilidadVencida, FechaCalculoActualCliente, ");
RDebugUtils.currentLine=12977376;
 //BA.debugLineNum = 12977376;BA.debugLine="sb.Append(\"RutaAplicable, PlazoRutaAplicable,\")";
_sb.Append("RutaAplicable, PlazoRutaAplicable,");
RDebugUtils.currentLine=12977377;
 //BA.debugLineNum = 12977377;BA.debugLine="sb.Append(\"PlazoTeoricoFabLinea, FechaTeoricaFabL";
_sb.Append("PlazoTeoricoFabLinea, FechaTeoricaFabLinea, FechaTeoricaEntrega,");
RDebugUtils.currentLine=12977378;
 //BA.debugLineNum = 12977378;BA.debugLine="sb.Append(\"FechaPrevVentasLinea,FechaPrevVentasLi";
_sb.Append("FechaPrevVentasLinea,FechaPrevVentasLineaVencida, FechaPrevVentasDocumento) ");
RDebugUtils.currentLine=12977379;
 //BA.debugLineNum = 12977379;BA.debugLine="sb.Append(\"Select \")";
_sb.Append("Select ");
RDebugUtils.currentLine=12977380;
 //BA.debugLineNum = 12977380;BA.debugLine="sb.Append(\"IDPrioridad, IDPrioridadUsuario, Codig";
_sb.Append("IDPrioridad, IDPrioridadUsuario, CodigoResponsableCuenta,NombreResponsableCuenta, CodigoVendedor, NombreVendedor,");
RDebugUtils.currentLine=12977381;
 //BA.debugLineNum = 12977381;BA.debugLine="sb.Append(\"Documento,FechaDocumento, FechaPrometi";
_sb.Append("Documento,FechaDocumento, FechaPrometida, Cliente, NombreCliente, GRP, NombreGRP, DirEnv, CiudadDirEnvio, PedidoCliente, Stand_By,");
RDebugUtils.currentLine=12977382;
 //BA.debugLineNum = 12977382;BA.debugLine="sb.Append(\"PedidoBloqueado, PedidoAbierto, Linea,";
_sb.Append("PedidoBloqueado, PedidoAbierto, Linea, AlmOrigen, AlmOrigenGV, AlmDest, Personalizado, Fabricacion, CompraFab, Dual, Ruta, PlazoRuta, RutaDual, PlazoRutaDual, ArticuloCorte,FechaMaterial, FechaPlanificada, FechaRequerida,");
RDebugUtils.currentLine=12977383;
 //BA.debugLineNum = 12977383;BA.debugLine="sb.Append(\"Ruta, Articulo, DescripcionArticulo, T";
_sb.Append("Ruta, Articulo, DescripcionArticulo, Talla,");
RDebugUtils.currentLine=12977384;
 //BA.debugLineNum = 12977384;BA.debugLine="sb.Append(\"QtyPte, Reserva, StockLibre, StockAlmN";
_sb.Append("QtyPte, Reserva, StockLibre, StockAlmNoGV, QtyPteNeta,QtyPteNetaAcum, QtyDisponibleAcum, Status, ReservaAlmacen, ImportePendiente, FechaDisponibilidad, FechaDisponibilidadVencida, FechaCalculoActualCliente, ");
RDebugUtils.currentLine=12977385;
 //BA.debugLineNum = 12977385;BA.debugLine="sb.Append(\"RutaAplicable, PlazoRutaAplicable,\")";
_sb.Append("RutaAplicable, PlazoRutaAplicable,");
RDebugUtils.currentLine=12977386;
 //BA.debugLineNum = 12977386;BA.debugLine="sb.Append(\"PlazoTeoricoFabLinea, FechaTeoricaFabL";
_sb.Append("PlazoTeoricoFabLinea, FechaTeoricaFabLinea,FechaTeoricaEntrega,");
RDebugUtils.currentLine=12977387;
 //BA.debugLineNum = 12977387;BA.debugLine="sb.Append(\"FechaPrevVentasLinea, FechaPrevVentasL";
_sb.Append("FechaPrevVentasLinea, FechaPrevVentasLineaVencida,FechaPrevVentasDocumento ");
RDebugUtils.currentLine=12977388;
 //BA.debugLineNum = 12977388;BA.debugLine="sb.Append(\"from tblGestionVentasCalculos\")";
_sb.Append("from tblGestionVentasCalculos");
RDebugUtils.currentLine=12977391;
 //BA.debugLineNum = 12977391;BA.debugLine="mSQLGestionventas.AddNonQueryToBatch(sb.ToString,";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=12977392;
 //BA.debugLineNum = 12977392;BA.debugLine="Dim SenderFilter As Object = mSQLGestionventas.Ex";
_senderfilter = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=12977393;
 //BA.debugLineNum = 12977393;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _senderfilter);
this.state = 424;
return;
case 424:
//C
this.state = 314;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=12977394;
 //BA.debugLineNum = 12977394;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("812977394","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=12977395;
 //BA.debugLineNum = 12977395;BA.debugLine="If Not(Success) Then";
if (true) break;

case 314:
//if
this.state = 319;
if (parent.__c.Not(_success)) { 
this.state = 316;
}else {
this.state = 318;
}if (true) break;

case 316:
//C
this.state = 319;
RDebugUtils.currentLine=12977396;
 //BA.debugLineNum = 12977396;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SQLite";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SQLite "+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=12977397;
 //BA.debugLineNum = 12977397;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "actualizaciondatos"), _msa);
this.state = 425;
return;
case 425:
//C
this.state = 319;
;
RDebugUtils.currentLine=12977398;
 //BA.debugLineNum = 12977398;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=12977399;
 //BA.debugLineNum = 12977399;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
 if (true) break;

case 318:
//C
this.state = 319;
RDebugUtils.currentLine=12977401;
 //BA.debugLineNum = 12977401;BA.debugLine="Log(\"Success SQLite update tblGestionVentas\")";
parent.__c.LogImpl("812977401","Success SQLite update tblGestionVentas",0);
 if (true) break;

case 319:
//C
this.state = -1;
;
RDebugUtils.currentLine=12977404;
 //BA.debugLineNum = 12977404;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=12977405;
 //BA.debugLineNum = 12977405;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=12977406;
 //BA.debugLineNum = 12977406;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _datosgestionventas(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "datosgestionventas", false))
	 {Debug.delegate(ba, "datosgestionventas", null); return;}
ResumableSub_DatosGestionVentas rsub = new ResumableSub_DatosGestionVentas(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_DatosGestionVentas extends BA.ResumableSub {
public ResumableSub_DatosGestionVentas(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"GestionVenta";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"GestionVentasAmpliadaPlazos2",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "datosgestionventas"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query GestionVentas ","Error");
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "datosgestionventas"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13107212;
 //BA.debugLineNum = 13107212;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos en Gestión de Ventas.","Aviso");
RDebugUtils.currentLine=13107213;
 //BA.debugLineNum = 13107213;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "datosgestionventas"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=13107214;
 //BA.debugLineNum = 13107214;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13107216;
 //BA.debugLineNum = 13107216;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13107217;
 //BA.debugLineNum = 13107217;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
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
RDebugUtils.currentLine=13107220;
 //BA.debugLineNum = 13107220;BA.debugLine="CallSubDelayed3(Me,\"DatosGestionVentas_Completed\"";
parent.__c.CallSubDelayed3(ba,parent,"DatosGestionVentas_Completed",(Object)(_accion),(Object)(_lstregistros));
RDebugUtils.currentLine=13107221;
 //BA.debugLineNum = 13107221;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _existenciasarttallaalmacenlineasgestionventasalmnogv(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "existenciasarttallaalmacenlineasgestionventasalmnogv", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "existenciasarttallaalmacenlineasgestionventasalmnogv", null));}
ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV rsub = new ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV extends BA.ResumableSub {
public ResumableSub_ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=13172743;
 //BA.debugLineNum = 13172743;BA.debugLine="mRes.Put(\"lstRegistros\", lstRegistros)";
_mres.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"ExistenciasA";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"ExistenciasArtTallaAlmacenLineasGestionVentasAlmNoGV",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "existenciasarttallaalmacenlineasgestionventasalmnogv"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13172748;
 //BA.debugLineNum = 13172748;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13172749;
 //BA.debugLineNum = 13172749;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query GestionVentas ","Error");
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "existenciasarttallaalmacenlineasgestionventasalmnogv"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13172751;
 //BA.debugLineNum = 13172751;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos en Gestión de Ventas.","Aviso");
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "existenciasarttallaalmacenlineasgestionventasalmnogv"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=13172757;
 //BA.debugLineNum = 13172757;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13172760;
 //BA.debugLineNum = 13172760;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13172761;
 //BA.debugLineNum = 13172761;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=13172762;
 //BA.debugLineNum = 13172762;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=13172763;
 //BA.debugLineNum = 13172763;BA.debugLine="mRes.Put(\"lstRegistros\", lstRegistros)";
_mres.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
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
RDebugUtils.currentLine=13172766;
 //BA.debugLineNum = 13172766;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=13172767;
 //BA.debugLineNum = 13172767;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _reservasdocumentoalmzenproin(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "reservasdocumentoalmzenproin", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "reservasdocumentoalmzenproin", null));}
ResumableSub_ReservasDocumentoAlmZenProin rsub = new ResumableSub_ReservasDocumentoAlmZenProin(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReservasDocumentoAlmZenProin extends BA.ResumableSub {
public ResumableSub_ReservasDocumentoAlmZenProin(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mreg = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="Dim mReg As Map";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="mReg.Initialize";
_mreg.Initialize();
RDebugUtils.currentLine=13500422;
 //BA.debugLineNum = 13500422;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
_mreg.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=13500424;
 //BA.debugLineNum = 13500424;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlAlmProin,\"Em";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqlalmproin /*String*/ ,"EmbalajesReservasActivas",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "reservasdocumentoalmzenproin"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13500428;
 //BA.debugLineNum = 13500428;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13500429;
 //BA.debugLineNum = 13500429;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query EmbalajesReservasActivas Proin ","Error");
RDebugUtils.currentLine=13500430;
 //BA.debugLineNum = 13500430;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "reservasdocumentoalmzenproin"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=13500432;
 //BA.debugLineNum = 13500432;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13500434;
 //BA.debugLineNum = 13500434;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13500435;
 //BA.debugLineNum = 13500435;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=13500436;
 //BA.debugLineNum = 13500436;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13500438;
 //BA.debugLineNum = 13500438;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13500439;
 //BA.debugLineNum = 13500439;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=13500440;
 //BA.debugLineNum = 13500440;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=13500441;
 //BA.debugLineNum = 13500441;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
_mreg.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
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
RDebugUtils.currentLine=13500444;
 //BA.debugLineNum = 13500444;BA.debugLine="Return mReg";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mreg));return;};
RDebugUtils.currentLine=13500445;
 //BA.debugLineNum = 13500445;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _reservasdocumentoalmzenprotec(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "reservasdocumentoalmzenprotec", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "reservasdocumentoalmzenprotec", null));}
ResumableSub_ReservasDocumentoAlmZenProtec rsub = new ResumableSub_ReservasDocumentoAlmZenProtec(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReservasDocumentoAlmZenProtec extends BA.ResumableSub {
public ResumableSub_ReservasDocumentoAlmZenProtec(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mreg = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="Dim mReg As Map";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="mReg.Initialize";
_mreg.Initialize();
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
_mreg.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlAlmProtec,\"E";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqlalmprotec /*String*/ ,"EmbalajesReservasActivas",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13565961;
 //BA.debugLineNum = 13565961;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "reservasdocumentoalmzenprotec"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13565964;
 //BA.debugLineNum = 13565964;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13565965;
 //BA.debugLineNum = 13565965;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query EmbalajesReservasActivas Proin ","Error");
RDebugUtils.currentLine=13565966;
 //BA.debugLineNum = 13565966;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "reservasdocumentoalmzenprotec"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13565967;
 //BA.debugLineNum = 13565967;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=13565968;
 //BA.debugLineNum = 13565968;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13565970;
 //BA.debugLineNum = 13565970;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13565971;
 //BA.debugLineNum = 13565971;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
RDebugUtils.currentLine=13565972;
 //BA.debugLineNum = 13565972;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13565974;
 //BA.debugLineNum = 13565974;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13565975;
 //BA.debugLineNum = 13565975;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
RDebugUtils.currentLine=13565976;
 //BA.debugLineNum = 13565976;BA.debugLine="mReg.Put(\"Accion\", Accion)";
_mreg.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=13565977;
 //BA.debugLineNum = 13565977;BA.debugLine="mReg.Put(\"lstRegistros\", lstRegistros)";
_mreg.Put((Object)("lstRegistros"),(Object)(_lstregistros.getObject()));
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
RDebugUtils.currentLine=13565980;
 //BA.debugLineNum = 13565980;BA.debugLine="Return mReg";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mreg));return;};
RDebugUtils.currentLine=13565981;
 //BA.debugLineNum = 13565981;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _fechasprometidascompras(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "fechasprometidascompras", false))
	 {Debug.delegate(ba, "fechasprometidascompras", null); return;}
ResumableSub_FechasPrometidasCompras rsub = new ResumableSub_FechasPrometidasCompras(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_FechasPrometidasCompras extends BA.ResumableSub {
public ResumableSub_FechasPrometidasCompras(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"FechasPromet";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"FechasPrometidasCompra",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "fechasprometidascompras"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query GestionVentas ","Error");
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "fechasprometidascompras"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13238292;
 //BA.debugLineNum = 13238292;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13238294;
 //BA.debugLineNum = 13238294;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13238295;
 //BA.debugLineNum = 13238295;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
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
RDebugUtils.currentLine=13238298;
 //BA.debugLineNum = 13238298;BA.debugLine="CallSubDelayed3(Me,\"FechasPrometidasCompras_Compl";
parent.__c.CallSubDelayed3(ba,parent,"FechasPrometidasCompras_Completed",(Object)(_accion),(Object)(_lstregistros));
RDebugUtils.currentLine=13238299;
 //BA.debugLineNum = 13238299;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _pedidoscomprasrecibidosptesrecepcionar(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "pedidoscomprasrecibidosptesrecepcionar", false))
	 {Debug.delegate(ba, "pedidoscomprasrecibidosptesrecepcionar", null); return;}
ResumableSub_PedidosComprasRecibidosPtesRecepcionar rsub = new ResumableSub_PedidosComprasRecibidosPtesRecepcionar(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_PedidosComprasRecibidosPtesRecepcionar extends BA.ResumableSub {
public ResumableSub_PedidosComprasRecibidosPtesRecepcionar(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"PedidosCompr";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"PedidosCompraRecibidosPtesRecepcionar",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "pedidoscomprasrecibidosptesrecepcionar"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query PedidosCompraRecibidosPtesRecepcionar ","Error");
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "pedidoscomprasrecibidosptesrecepcionar"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13303824;
 //BA.debugLineNum = 13303824;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13303828;
 //BA.debugLineNum = 13303828;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13303830;
 //BA.debugLineNum = 13303830;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13303831;
 //BA.debugLineNum = 13303831;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
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
RDebugUtils.currentLine=13303834;
 //BA.debugLineNum = 13303834;BA.debugLine="CallSubDelayed3(Me,\"PedidosComprasRecibidosPtesRe";
parent.__c.CallSubDelayed3(ba,parent,"PedidosComprasRecibidosPtesRecepcionar_Completed",(Object)(_accion),(Object)(_lstregistros));
RDebugUtils.currentLine=13303835;
 //BA.debugLineNum = 13303835;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _osubspendientesterminaproductonocortenoconfeccion(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "osubspendientesterminaproductonocortenoconfeccion", false))
	 {Debug.delegate(ba, "osubspendientesterminaproductonocortenoconfeccion", null); return;}
ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion rsub = new ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion extends BA.ResumableSub {
public ResumableSub_OSUBsPendientesTerminaProductoNoCorteNoConfeccion(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"OSUBsPtesTer";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"OSUBsPtesTerminaProductoNoCorteNoConfeccionSumaArtVar",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "osubspendientesterminaproductonocortenoconfeccion"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query OSUBsPtesTerminaProductoNoCorteNoConfeccionSumaArtVar ","Error");
RDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "osubspendientesterminaproductonocortenoconfeccion"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13434896;
 //BA.debugLineNum = 13434896;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13434900;
 //BA.debugLineNum = 13434900;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13434902;
 //BA.debugLineNum = 13434902;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13434903;
 //BA.debugLineNum = 13434903;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
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
RDebugUtils.currentLine=13434906;
 //BA.debugLineNum = 13434906;BA.debugLine="CallSubDelayed3(Me,\"OSUBsPendientesTerminaProduct";
parent.__c.CallSubDelayed3(ba,parent,"OSUBsPendientesTerminaProductoNoCorteNoConfeccion_Completed",(Object)(_accion),(Object)(_lstregistros));
RDebugUtils.currentLine=13434907;
 //BA.debugLineNum = 13434907;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _confplazofechaentregaplan(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "confplazofechaentregaplan", false))
	 {Debug.delegate(ba, "confplazofechaentregaplan", null); return;}
ResumableSub_ConfPlazoFechaEntregaPlan rsub = new ResumableSub_ConfPlazoFechaEntregaPlan(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ConfPlazoFechaEntregaPlan extends BA.ResumableSub {
public ResumableSub_ConfPlazoFechaEntregaPlan(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"ConfPlazoFec";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"ConfPlazoFechaEntregaPlan",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=13369349;
 //BA.debugLineNum = 13369349;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "confplazofechaentregaplan"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13369352;
 //BA.debugLineNum = 13369352;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13369353;
 //BA.debugLineNum = 13369353;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query ConfPlazoFechaEntregaPlan ","Error");
RDebugUtils.currentLine=13369354;
 //BA.debugLineNum = 13369354;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "confplazofechaentregaplan"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13369355;
 //BA.debugLineNum = 13369355;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13369360;
 //BA.debugLineNum = 13369360;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13369364;
 //BA.debugLineNum = 13369364;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13369366;
 //BA.debugLineNum = 13369366;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13369367;
 //BA.debugLineNum = 13369367;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
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
RDebugUtils.currentLine=13369370;
 //BA.debugLineNum = 13369370;BA.debugLine="CallSubDelayed3(Me,\"ConfPlazoFechaEntregaPlan_Com";
parent.__c.CallSubDelayed3(ba,parent,"ConfPlazoFechaEntregaPlan_Completed",(Object)(_accion),(Object)(_lstregistros));
RDebugUtils.currentLine=13369371;
 //BA.debugLineNum = 13369371;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _borrarvbsscriptdireccionremitenteemailoutlookrepsol(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "borrarvbsscriptdireccionremitenteemailoutlookrepsol", false))
	 {return ((String) Debug.delegate(ba, "borrarvbsscriptdireccionremitenteemailoutlookrepsol", null));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub BorrarVBSScriptDireccionRemitenteEmailOutlookR";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc.vbs\")";
if (__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs")) { 
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc.vbs\")";
__c.File.Delete(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs");
 };
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="End Sub";
return "";
}
public String  _borrarvbsscriptenvioemailoutlookrepsol(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "borrarvbsscriptenvioemailoutlookrepsol", false))
	 {return ((String) Debug.delegate(ba, "borrarvbsscriptenvioemailoutlookrepsol", null));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub BorrarVBSScriptEnvioEmailOutlookREPSOL";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="If File.Exists(xui.DefaultFolder,\"smfpromc2.vbs\")";
if (__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs")) { 
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="File.Delete(xui.DefaultFolder,\"smfpromc2.vbs\")";
__c.File.Delete(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs");
 };
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookREPS";
__ref._borrarvbsscriptdireccionremitenteemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
__ref._borrarvbsscriptenvioemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="jamTableViewGestionVentas.GuardarConfiguracionCol";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="jamTableViewGestionVentas.LimpiarTabla";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargarepsolconfiguracionlogisticaalbaranesventa(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "cargarepsolconfiguracionlogisticaalbaranesventa", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargarepsolconfiguracionlogisticaalbaranesventa", null));}
ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta rsub = new ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta extends BA.ResumableSub {
public ResumableSub_CargaRepsolConfiguracionLogisticaAlbaranesVenta(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdataconf = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="Dim mDataConf As Map";
_mdataconf = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="mDataConf.Initialize";
_mdataconf.Initialize();
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=14155784;
 //BA.debugLineNum = 14155784;BA.debugLine="mRes.Put(\"mDataConf\",mDataConf)";
_mres.Put((Object)("mDataConf"),(Object)(_mdataconf.getObject()));
RDebugUtils.currentLine=14155785;
 //BA.debugLineNum = 14155785;BA.debugLine="Dim Comando As String=\"RepsolConfiguracionLogisti";
_comando = "RepsolConfiguracionLogisticaAlbaranesVenta";
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "cargarepsolconfiguracionlogisticaalbaranesventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14155790;
 //BA.debugLineNum = 14155790;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=14155791;
 //BA.debugLineNum = 14155791;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14155792;
 //BA.debugLineNum = 14155792;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=14155793;
 //BA.debugLineNum = 14155793;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=14155794;
 //BA.debugLineNum = 14155794;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=14155795;
 //BA.debugLineNum = 14155795;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=14155798;
 //BA.debugLineNum = 14155798;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=14155799;
 //BA.debugLineNum = 14155799;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14155800;
 //BA.debugLineNum = 14155800;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No existe la configuración necesaria para la conexión."),"Aviso");
RDebugUtils.currentLine=14155801;
 //BA.debugLineNum = 14155801;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "cargarepsolconfiguracionlogisticaalbaranesventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=14155802;
 //BA.debugLineNum = 14155802;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=14155803;
 //BA.debugLineNum = 14155803;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=14155805;
 //BA.debugLineNum = 14155805;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=14155806;
 //BA.debugLineNum = 14155806;BA.debugLine="mDataConf=lstReg.Get(0)";
_mdataconf = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=14155807;
 //BA.debugLineNum = 14155807;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=14155808;
 //BA.debugLineNum = 14155808;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=14155809;
 //BA.debugLineNum = 14155809;BA.debugLine="mRes.Put(\"mDataConf\", mDataConf)";
_mres.Put((Object)("mDataConf"),(Object)(_mdataconf.getObject()));
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
RDebugUtils.currentLine=14155813;
 //BA.debugLineNum = 14155813;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=14155814;
 //BA.debugLineNum = 14155814;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargarepsolinformacionlogisticaalbaranventa(b4j.docU.cgestionventas __ref,String _albarannav) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "cargarepsolinformacionlogisticaalbaranventa", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargarepsolinformacionlogisticaalbaranventa", new Object[] {_albarannav}));}
ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta rsub = new ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta(this,__ref,_albarannav);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta extends BA.ResumableSub {
public ResumableSub_CargaRepsolInformacionLogisticaAlbaranVenta(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _albarannav) {
this.parent = parent;
this.__ref = __ref;
this._albarannav = _albarannav;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _albarannav;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=14221318;
 //BA.debugLineNum = 14221318;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=14221320;
 //BA.debugLineNum = 14221320;BA.debugLine="Dim Comando As String=\"RepsolInformacionLogistica";
_comando = "RepsolInformacionLogisticaAlbaranVenta";
RDebugUtils.currentLine=14221321;
 //BA.debugLineNum = 14221321;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_albarannav)},parent);
RDebugUtils.currentLine=14221323;
 //BA.debugLineNum = 14221323;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "cargarepsolinformacionlogisticaalbaranventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14221324;
 //BA.debugLineNum = 14221324;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=14221325;
 //BA.debugLineNum = 14221325;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14221326;
 //BA.debugLineNum = 14221326;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=14221327;
 //BA.debugLineNum = 14221327;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=14221328;
 //BA.debugLineNum = 14221328;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=14221329;
 //BA.debugLineNum = 14221329;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=14221332;
 //BA.debugLineNum = 14221332;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14221333;
 //BA.debugLineNum = 14221333;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No existe el documento "+parent.__c.SmartStringFormatter("",(Object)(_albarannav))+" en navision, o no tiene lineas no corregidas de tipo producto."),"Aviso");
RDebugUtils.currentLine=14221334;
 //BA.debugLineNum = 14221334;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "cargarepsolinformacionlogisticaalbaranventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=14221335;
 //BA.debugLineNum = 14221335;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=14221336;
 //BA.debugLineNum = 14221336;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=14221338;
 //BA.debugLineNum = 14221338;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=14221339;
 //BA.debugLineNum = 14221339;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=14221340;
 //BA.debugLineNum = 14221340;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=14221341;
 //BA.debugLineNum = 14221341;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=14221344;
 //BA.debugLineNum = 14221344;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=14221345;
 //BA.debugLineNum = 14221345;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Private jamTableViewGestionVentas As jamTableView";
_jamtableviewgestionventas = new b4j.docU.jamtableview();
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Dim JamLoadingIndicator1  As JamLoadingIndicator";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=12386317;
 //BA.debugLineNum = 12386317;BA.debugLine="Private mSQLGestionventas As SQL";
_msqlgestionventas = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=12386320;
 //BA.debugLineNum = 12386320;BA.debugLine="Private txtCodigoVendedor As TextField";
_txtcodigovendedor = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=12386321;
 //BA.debugLineNum = 12386321;BA.debugLine="Private txtNombreVendedor As TextField";
_txtnombrevendedor = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=12386322;
 //BA.debugLineNum = 12386322;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=12386324;
 //BA.debugLineNum = 12386324;BA.debugLine="Private CalcularFechas As Boolean";
_calcularfechas = false;
RDebugUtils.currentLine=12386325;
 //BA.debugLineNum = 12386325;BA.debugLine="Dim Cal As GregorianCalendar";
_cal = new flm.b4j.calendar.b4jCalendar();
RDebugUtils.currentLine=12386326;
 //BA.debugLineNum = 12386326;BA.debugLine="Dim Locale As Locale";
_locale = new flm.b4j.calendar.b4jLocale();
RDebugUtils.currentLine=12386328;
 //BA.debugLineNum = 12386328;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=12386330;
 //BA.debugLineNum = 12386330;BA.debugLine="Private CarpetaFicherosCSVRepsol As String";
_carpetaficheroscsvrepsol = "";
RDebugUtils.currentLine=12386331;
 //BA.debugLineNum = 12386331;BA.debugLine="Private CarpetaFicherosPDFRepsol As String";
_carpetaficherospdfrepsol = "";
RDebugUtils.currentLine=12386332;
 //BA.debugLineNum = 12386332;BA.debugLine="Private BuzonCompartidoEmailEnvioInfoRepsol As St";
_buzoncompartidoemailenvioinforepsol = "";
RDebugUtils.currentLine=12386333;
 //BA.debugLineNum = 12386333;BA.debugLine="Private BuzonCompartidoEmailEnvioInfoRepsol As St";
_buzoncompartidoemailenvioinforepsol = "";
RDebugUtils.currentLine=12386334;
 //BA.debugLineNum = 12386334;BA.debugLine="Private DireccionSeleccionadaRemitenteEmailsRepso";
_direccionseleccionadaremitenteemailsrepsol = "";
RDebugUtils.currentLine=12386335;
 //BA.debugLineNum = 12386335;BA.debugLine="Private DireccionDestinoEmailsRepsol As String";
_direcciondestinoemailsrepsol = "";
RDebugUtils.currentLine=12386336;
 //BA.debugLineNum = 12386336;BA.debugLine="Private DireccionCCDestinoEmailsRepsol As String";
_direccionccdestinoemailsrepsol = "";
RDebugUtils.currentLine=12386337;
 //BA.debugLineNum = 12386337;BA.debugLine="End Sub";
return "";
}
public void  _crearemailinfologistica(b4j.docU.cgestionventas __ref,String _documento) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "crearemailinfologistica", false))
	 {Debug.delegate(ba, "crearemailinfologistica", new Object[] {_documento}); return;}
ResumableSub_CrearEmailInfoLogistica rsub = new ResumableSub_CrearEmailInfoLogistica(this,__ref,_documento);
rsub.resume(ba, null);
}
public static class ResumableSub_CrearEmailInfoLogistica extends BA.ResumableSub {
public ResumableSub_CrearEmailInfoLogistica(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _documento) {
this.parent = parent;
this.__ref = __ref;
this._documento = _documento;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _documento;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
Object _msa = null;
String _rutaficheropdfdocumento = "";
String _nombreficheropdfdocumento = "";
int _rint = 0;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.List _lstlineasalbaran = null;
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;
int _idx = 0;
String[] _arrh = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object[] _row = null;
String _dirficherosalbaranesventarepsol = "";
String _nombrefichero = "";
b4j.docU.csvparser _parser = null;
String _s = "";
String _rutaficherodocumento = "";
boolean _success = false;
String _sbbody = "";
String _emailsubject = "";
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
anywheresoftware.b4a.BA.IterableList group37;
int index37;
int groupLen37;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="JamLoadingIndicator1.MensajeLoading=$\"Cargando in";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Cargando información logística documento "+parent.__c.SmartStringFormatter("",(Object)(_documento))+"")));
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Wait For(CargaRepsolInformacionLogisticaAlbaranVe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), __ref._cargarepsolinformacionlogisticaalbaranventa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_documento));
this.state = 46;
return;
case 46:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="Log(lstReg)";
parent.__c.LogImpl("814352395",BA.ObjectToString(_lstreg),0);
RDebugUtils.currentLine=14352397;
 //BA.debugLineNum = 14352397;BA.debugLine="If lstReg.Size=0 Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_lstreg.getSize()==0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=14352398;
 //BA.debugLineNum = 14352398;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14352399;
 //BA.debugLineNum = 14352399;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay datos en el documento "+parent.__c.SmartStringFormatter("",(Object)(_documento))+" para generar el fichero. Revisar información en navision."),"Aviso");
RDebugUtils.currentLine=14352400;
 //BA.debugLineNum = 14352400;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 47;
return;
case 47:
//C
this.state = 8;
;
RDebugUtils.currentLine=14352401;
 //BA.debugLineNum = 14352401;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=14352404;
 //BA.debugLineNum = 14352404;BA.debugLine="Dim RutaFicheroPDFDocumento As String";
_rutaficheropdfdocumento = "";
RDebugUtils.currentLine=14352405;
 //BA.debugLineNum = 14352405;BA.debugLine="Dim NombreFicheroPDFDocumento As String=$\"${Docum";
_nombreficheropdfdocumento = (""+parent.__c.SmartStringFormatter("",(Object)(_documento))+".pdf");
RDebugUtils.currentLine=14352406;
 //BA.debugLineNum = 14352406;BA.debugLine="If File.Exists(CarpetaFicherosPDFRepsol,NombreFic";
if (true) break;

case 9:
//if
this.state = 18;
if (parent.__c.File.Exists(__ref._carpetaficherospdfrepsol /*String*/ ,_nombreficheropdfdocumento)) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 18;
RDebugUtils.currentLine=14352407;
 //BA.debugLineNum = 14352407;BA.debugLine="RutaFicheroPDFDocumento=File.Combine(CarpetaFich";
_rutaficheropdfdocumento = parent.__c.File.Combine(__ref._carpetaficherospdfrepsol /*String*/ ,_nombreficheropdfdocumento);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=14352409;
 //BA.debugLineNum = 14352409;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"No e";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("No existe el fichero "+parent.__c.SmartStringFormatter("",(Object)(_nombreficheropdfdocumento))+" en la carpeta "+parent.__c.SmartStringFormatter("",(Object)(__ref._carpetaficherospdfrepsol /*String*/ ))+"\n"+"¿Continuar? (Puedes añadir manualmente el PDF en el email"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 48;
return;
case 48:
//C
this.state = 14;
_rint = (int) result[1];
;
RDebugUtils.currentLine=14352411;
 //BA.debugLineNum = 14352411;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 14:
//if
this.state = 17;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=14352412;
 //BA.debugLineNum = 14352412;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14352413;
 //BA.debugLineNum = 14352413;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=14352417;
 //BA.debugLineNum = 14352417;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=14352418;
 //BA.debugLineNum = 14352418;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=14352420;
 //BA.debugLineNum = 14352420;BA.debugLine="Dim lstLineasAlbaran As List";
_lstlineasalbaran = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14352421;
 //BA.debugLineNum = 14352421;BA.debugLine="lstLineasAlbaran.Initialize";
_lstlineasalbaran.Initialize();
RDebugUtils.currentLine=14352423;
 //BA.debugLineNum = 14352423;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=14352425;
 //BA.debugLineNum = 14352425;BA.debugLine="Dim iDX As Int";
_idx = 0;
RDebugUtils.currentLine=14352426;
 //BA.debugLineNum = 14352426;BA.debugLine="Dim arrH(mData0.size) As String=mapKeysToArray(mD";
_arrh = __ref._mapkeystoarray /*String[]*/ (null,_mdata0);
RDebugUtils.currentLine=14352427;
 //BA.debugLineNum = 14352427;BA.debugLine="lstLineasAlbaran.Add(arrH)";
_lstlineasalbaran.Add((Object)(_arrh));
RDebugUtils.currentLine=14352429;
 //BA.debugLineNum = 14352429;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=14352430;
 //BA.debugLineNum = 14352430;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 19:
//for
this.state = 22;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group37 = _lstreg;
index37 = 0;
groupLen37 = group37.getSize();
this.state = 49;
if (true) break;

case 49:
//C
this.state = 22;
if (index37 < groupLen37) {
this.state = 21;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group37.Get(index37)));}
if (true) break;

case 50:
//C
this.state = 49;
index37++;
if (true) break;

case 21:
//C
this.state = 50;
RDebugUtils.currentLine=14352431;
 //BA.debugLineNum = 14352431;BA.debugLine="Log(mData)";
parent.__c.LogImpl("814352431",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=14352432;
 //BA.debugLineNum = 14352432;BA.debugLine="Dim row() As Object=mapValuesToArrayOfStringsCon";
_row = __ref._mapvaluestoarrayofstringsconcamposfecha /*Object[]*/ (null,_mdata);
RDebugUtils.currentLine=14352436;
 //BA.debugLineNum = 14352436;BA.debugLine="lstLineasAlbaran.Add(row)";
_lstlineasalbaran.Add((Object)(_row));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=14352439;
 //BA.debugLineNum = 14352439;BA.debugLine="DateTime.DateFormat=DateTime.DateFormat";
parent.__c.DateTime.setDateFormat(parent.__c.DateTime.getDateFormat());
RDebugUtils.currentLine=14352442;
 //BA.debugLineNum = 14352442;BA.debugLine="Dim DirFicherosAlbaranesVentaRepsol As String=Car";
_dirficherosalbaranesventarepsol = __ref._carpetaficheroscsvrepsol /*String*/ ;
RDebugUtils.currentLine=14352460;
 //BA.debugLineNum = 14352460;BA.debugLine="Dim NombreFichero As String=$\"${Documento}.csv\"$";
_nombrefichero = (""+parent.__c.SmartStringFormatter("",(Object)(_documento))+".csv");
RDebugUtils.currentLine=14352463;
 //BA.debugLineNum = 14352463;BA.debugLine="Dim parser As CSVParser";
_parser = new b4j.docU.csvparser();
RDebugUtils.currentLine=14352464;
 //BA.debugLineNum = 14352464;BA.debugLine="parser.Initialize";
_parser._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14352465;
 //BA.debugLineNum = 14352465;BA.debugLine="Dim s As String = parser.GenerateString(lstLineas";
_s = _parser._generatestring /*String*/ (null,_lstlineasalbaran,parent.__c.TAB);
RDebugUtils.currentLine=14352466;
 //BA.debugLineNum = 14352466;BA.debugLine="File.WriteString(DirFicherosAlbaranesVentaRepsol,";
parent.__c.File.WriteString(_dirficherosalbaranesventarepsol,_nombrefichero,_s);
RDebugUtils.currentLine=14352468;
 //BA.debugLineNum = 14352468;BA.debugLine="Dim RutaFicheroDocumento As String=File.Combine(D";
_rutaficherodocumento = parent.__c.File.Combine(_dirficherosalbaranesventarepsol,_nombrefichero);
RDebugUtils.currentLine=14352475;
 //BA.debugLineNum = 14352475;BA.debugLine="wait for(SeleccionarDireccionRemitenteEmailsREPSO";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), __ref._seleccionardireccionremitenteemailsrepsol /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 51;
return;
case 51:
//C
this.state = 23;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=14352476;
 //BA.debugLineNum = 14352476;BA.debugLine="If Not(Success) Then";
if (true) break;

case 23:
//if
this.state = 32;
if (parent.__c.Not(_success)) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 32;
RDebugUtils.currentLine=14352477;
 //BA.debugLineNum = 14352477;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14352478;
 //BA.debugLineNum = 14352478;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Es necesario";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Es necesario seleccionar la dirección desde la que enviar el correo al operador logístico.","Aviso");
RDebugUtils.currentLine=14352479;
 //BA.debugLineNum = 14352479;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 52;
return;
case 52:
//C
this.state = 32;
;
RDebugUtils.currentLine=14352480;
 //BA.debugLineNum = 14352480;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=14352482;
 //BA.debugLineNum = 14352482;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La direcci";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"La dirección DESDE la que se enviará el correo será:"+parent.__c.CRLF+parent.__c.CRLF+__ref._direccionseleccionadaremitenteemailsrepsol /*String*/ ,"Direccion envío email","Sí","Cancelar","",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=14352483;
 //BA.debugLineNum = 14352483;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 28;
_rint = (int) result[1];
;
RDebugUtils.currentLine=14352484;
 //BA.debugLineNum = 14352484;BA.debugLine="Select rInt";
if (true) break;

case 28:
//select
this.state = 31;
switch (BA.switchObjectToInt(_rint,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel)) {
case 0: {
this.state = 30;
if (true) break;
}
}
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=14352486;
 //BA.debugLineNum = 14352486;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14352487;
 //BA.debugLineNum = 14352487;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=14352491;
 //BA.debugLineNum = 14352491;BA.debugLine="Dim sbBody As String=HTMLBodyEmail";
_sbbody = __ref._htmlbodyemail /*String*/ (null);
RDebugUtils.currentLine=14352492;
 //BA.debugLineNum = 14352492;BA.debugLine="If DireccionCCDestinoEmailsRepsol=\"\" Then Direcci";
if (true) break;

case 33:
//if
this.state = 38;
if ((__ref._direccionccdestinoemailsrepsol /*String*/ ).equals("")) { 
this.state = 35;
;}if (true) break;

case 35:
//C
this.state = 38;
__ref._direccionccdestinoemailsrepsol /*String*/  = "None";
if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=14352494;
 //BA.debugLineNum = 14352494;BA.debugLine="Dim EmailSubject As String=$\"Albarán venta REPSOL";
_emailsubject = ("Albarán venta REPSOL "+parent.__c.SmartStringFormatter("",(Object)(_documento))+"");
RDebugUtils.currentLine=14352496;
 //BA.debugLineNum = 14352496;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Creando emai";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Creando email..."));
RDebugUtils.currentLine=14352497;
 //BA.debugLineNum = 14352497;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=14352498;
 //BA.debugLineNum = 14352498;BA.debugLine="wait for(EjecutarVBSScriptEnviarEmailREPSOL(Direc";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), __ref._ejecutarvbsscriptenviaremailrepsol /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._direccionseleccionadaremitenteemailsrepsol /*String*/ ,__ref._direcciondestinoemailsrepsol /*String*/ ,__ref._direccionccdestinoemailsrepsol /*String*/ ,_emailsubject,_sbbody,_rutaficherodocumento,_rutaficheropdfdocumento));
this.state = 54;
return;
case 54:
//C
this.state = 39;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14352500;
 //BA.debugLineNum = 14352500;BA.debugLine="Log(\"mRes: \" & mRes)";
parent.__c.LogImpl("814352500","mRes: "+BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=14352501;
 //BA.debugLineNum = 14352501;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=14352502;
 //BA.debugLineNum = 14352502;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
_exitcode = (int)(BA.ObjectToNumber(_mres.Get((Object)("ExitCode"))));
RDebugUtils.currentLine=14352503;
 //BA.debugLineNum = 14352503;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
_stdout = BA.ObjectToString(_mres.Get((Object)("StdOut")));
RDebugUtils.currentLine=14352504;
 //BA.debugLineNum = 14352504;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
_stderr = BA.ObjectToString(_mres.Get((Object)("StdErr")));
RDebugUtils.currentLine=14352505;
 //BA.debugLineNum = 14352505;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=14352506;
 //BA.debugLineNum = 14352506;BA.debugLine="If Success=False Then";
if (true) break;

case 39:
//if
this.state = 42;
if (_success==parent.__c.False) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=14352507;
 //BA.debugLineNum = 14352507;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt creación de email"+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=14352508;
 //BA.debugLineNum = 14352508;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 55;
return;
case 55:
//C
this.state = 42;
;
RDebugUtils.currentLine=14352509;
 //BA.debugLineNum = 14352509;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=14352511;
 //BA.debugLineNum = 14352511;BA.debugLine="If ExitCode=1 Then";

case 42:
//if
this.state = 45;
if (_exitcode==1) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=14352512;
 //BA.debugLineNum = 14352512;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt cre";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt creación email"+parent.__c.CRLF+_stderr,"Error");
RDebugUtils.currentLine=14352513;
 //BA.debugLineNum = 14352513;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 56;
return;
case 56:
//C
this.state = 45;
;
RDebugUtils.currentLine=14352514;
 //BA.debugLineNum = 14352514;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 45:
//C
this.state = -1;
;
RDebugUtils.currentLine=14352517;
 //BA.debugLineNum = 14352517;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"),(int) (250));
this.state = 57;
return;
case 57:
//C
this.state = -1;
;
RDebugUtils.currentLine=14352519;
 //BA.debugLineNum = 14352519;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Email creado\",";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Email creado","Aviso");
RDebugUtils.currentLine=14352520;
 //BA.debugLineNum = 14352520;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=14352522;
 //BA.debugLineNum = 14352522;BA.debugLine="Wait For(AbrirVentanaOutlookEmail($\"${EmailSubjec";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "crearemailinfologistica"), __ref._abrirventanaoutlookemail /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(""+parent.__c.SmartStringFormatter("",(Object)(_emailsubject))+" - Mensaje (HTML)"),_documento));
this.state = 59;
return;
case 59:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=14352524;
 //BA.debugLineNum = 14352524;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String[]  _mapkeystoarray(b4j.docU.cgestionventas __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "mapkeystoarray", false))
	 {return ((String[]) Debug.delegate(ba, "mapkeystoarray", new Object[] {_mdata}));}
String[] _arr = null;
int _idx = 0;
String _key = "";
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub mapKeysToArray(mData As Map) As String()";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim arr(mData.Size) As String";
_arr = new String[_mdata.getSize()];
java.util.Arrays.fill(_arr,"");
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim iDx As Int";
_idx = 0;
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="For Each key As String In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_key = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="arr(iDx)=key";
_arr[_idx] = _key;
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="iDx=iDx+1";
_idx = (int) (_idx+1);
 }
};
RDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="Return arr";
if (true) return _arr;
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="End Sub";
return null;
}
public Object[]  _mapvaluestoarrayofstringsconcamposfecha(b4j.docU.cgestionventas __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "mapvaluestoarrayofstringsconcamposfecha", false))
	 {return ((Object[]) Debug.delegate(ba, "mapvaluestoarrayofstringsconcamposfecha", new Object[] {_m}));}
String[] _arr = null;
int _i = 0;
Object _value = null;
Object _key = null;
String _svalue = "";
int _intvalue = 0;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="public Sub mapValuesToArrayOfStringsConCamposFecha";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim arr(m.Size) As String  'array size is double";
_arr = new String[_m.getSize()];
java.util.Arrays.fill(_arr,"");
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Dim i As Int=0";
_i = (int) (0);
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="For Each key As Object In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _m.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="value=m.Get(key)";
_value = _m.Get(_key);
RDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
__c.LogImpl("814483463",("key="+__c.SmartStringFormatter("",_key)+", value="+__c.SmartStringFormatter("",_value)+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
if ((BA.ObjectToString(_key)).toUpperCase().startsWith("FECHA")) { 
RDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="arr(i)=DateTime.Date(value)";
_arr[_i] = __c.DateTime.Date(BA.ObjectToLongNumber(_value));
 }else {
RDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="If value Is String Then";
if (_value instanceof String) { 
RDebugUtils.currentLine=14483468;
 //BA.debugLineNum = 14483468;BA.debugLine="Dim sValue As String=value";
_svalue = BA.ObjectToString(_value);
RDebugUtils.currentLine=14483469;
 //BA.debugLineNum = 14483469;BA.debugLine="sValue=sValue.Replace(TAB,\"\")";
_svalue = _svalue.replace(__c.TAB,"");
RDebugUtils.currentLine=14483470;
 //BA.debugLineNum = 14483470;BA.debugLine="arr(i)=sValue";
_arr[_i] = _svalue;
 }else {
RDebugUtils.currentLine=14483472;
 //BA.debugLineNum = 14483472;BA.debugLine="Dim intValue As Int=value";
_intvalue = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=14483473;
 //BA.debugLineNum = 14483473;BA.debugLine="Dim sValue As String=intValue";
_svalue = BA.NumberToString(_intvalue);
RDebugUtils.currentLine=14483474;
 //BA.debugLineNum = 14483474;BA.debugLine="arr(i)=sValue";
_arr[_i] = _svalue;
 };
 };
RDebugUtils.currentLine=14483477;
 //BA.debugLineNum = 14483477;BA.debugLine="i =i +1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=14483480;
 //BA.debugLineNum = 14483480;BA.debugLine="Return arr";
if (true) return (Object[])(_arr);
RDebugUtils.currentLine=14483481;
 //BA.debugLineNum = 14483481;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionardireccionremitenteemailsrepsol(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "seleccionardireccionremitenteemailsrepsol", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionardireccionremitenteemailsrepsol", null));}
ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL rsub = new ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL extends BA.ResumableSub {
public ResumableSub_SeleccionarDireccionRemitenteEmailsREPSOL(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
Object _msa = null;
String _sdireccionescuentasemail = "";
String[] _arrdireccionescuentasemail = null;
anywheresoftware.b4a.objects.collections.List _lstdireccionescuentasemail = null;
int _idx = 0;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
int step26;
int limit26;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="wait for(EjecutarVBSScriptDireccionesEmailREPSOL)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), __ref._ejecutarvbsscriptdireccionesemailrepsol /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 33;
return;
case 33:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="Log(\"mRes: \" & mRes)";
parent.__c.LogImpl("814811139","mRes: "+BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="Dim ExitCode As Int=mRes.Get(\"ExitCode\")";
_exitcode = (int)(BA.ObjectToNumber(_mres.Get((Object)("ExitCode"))));
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="Dim StdOut As String=mRes.Get(\"StdOut\")";
_stdout = BA.ObjectToString(_mres.Get((Object)("StdOut")));
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="Dim StdErr As String=mRes.Get(\"StdErr\")";
_stderr = BA.ObjectToString(_mres.Get((Object)("StdErr")));
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="If Success=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt direcciones email"+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
;
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;
;
RDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="If ExitCode=1 Then";

case 4:
//if
this.state = 7;
if (_exitcode==1) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error spt dir";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error spt direcciones email"+parent.__c.CRLF+_stderr,"Error");
RDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 7;
;
RDebugUtils.currentLine=14811154;
 //BA.debugLineNum = 14811154;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=14811156;
 //BA.debugLineNum = 14811156;BA.debugLine="Dim sDireccionesCuentasEmail As String=StdOut.Sub";
_sdireccionescuentasemail = _stdout.substring((int) (0),(int) (_stdout.length()-1));
RDebugUtils.currentLine=14811157;
 //BA.debugLineNum = 14811157;BA.debugLine="If sDireccionesCuentasEmail=\"\" Then";
if (true) break;

case 8:
//if
this.state = 11;
if ((_sdireccionescuentasemail).equals("")) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay direcciones de email configuradas."+parent.__c.CRLF+parent.__c.CRLF+"¿Outlook no instalado?","Aviso");
RDebugUtils.currentLine=14811159;
 //BA.debugLineNum = 14811159;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
RDebugUtils.currentLine=14811160;
 //BA.debugLineNum = 14811160;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=14811163;
 //BA.debugLineNum = 14811163;BA.debugLine="Dim ArrDireccionesCuentasEmail() As String=Regex.";
_arrdireccionescuentasemail = parent.__c.Regex.Split(",",_sdireccionescuentasemail);
RDebugUtils.currentLine=14811164;
 //BA.debugLineNum = 14811164;BA.debugLine="Dim lstDireccionesCuentasEmail As List";
_lstdireccionescuentasemail = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14811165;
 //BA.debugLineNum = 14811165;BA.debugLine="lstDireccionesCuentasEmail.Initialize";
_lstdireccionescuentasemail.Initialize();
RDebugUtils.currentLine=14811167;
 //BA.debugLineNum = 14811167;BA.debugLine="For iDx =0 To ArrDireccionesCuentasEmail.Length-1";
if (true) break;

case 12:
//for
this.state = 15;
step26 = 1;
limit26 = (int) (_arrdireccionescuentasemail.length-1);
_idx = (int) (0) ;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 15;
if ((step26 > 0 && _idx <= limit26) || (step26 < 0 && _idx >= limit26)) this.state = 14;
if (true) break;

case 38:
//C
this.state = 37;
_idx = ((int)(0 + _idx + step26)) ;
if (true) break;

case 14:
//C
this.state = 38;
RDebugUtils.currentLine=14811168;
 //BA.debugLineNum = 14811168;BA.debugLine="lstDireccionesCuentasEmail.Add(ArrDireccionesCue";
_lstdireccionescuentasemail.Add((Object)(_arrdireccionescuentasemail[_idx]));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=14811174;
 //BA.debugLineNum = 14811174;BA.debugLine="If lstDireccionesCuentasEmail.Size=0 Then";

case 15:
//if
this.state = 18;
if (_lstdireccionescuentasemail.getSize()==0) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=14811175;
 //BA.debugLineNum = 14811175;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay direcc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay direcciones de email configuradas."+parent.__c.CRLF+parent.__c.CRLF+"¿Outlook no instalado?","Aviso");
RDebugUtils.currentLine=14811176;
 //BA.debugLineNum = 14811176;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 18;
;
RDebugUtils.currentLine=14811177;
 //BA.debugLineNum = 14811177;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=14811182;
 //BA.debugLineNum = 14811182;BA.debugLine="Dialog.Title=\"Selecciona Cuenta para Enviar los E";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Cuenta para Enviar los Emails");
RDebugUtils.currentLine=14811183;
 //BA.debugLineNum = 14811183;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=14811184;
 //BA.debugLineNum = 14811184;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=14811185;
 //BA.debugLineNum = 14811185;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=14811186;
 //BA.debugLineNum = 14811186;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=14811187;
 //BA.debugLineNum = 14811187;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14811189;
 //BA.debugLineNum = 14811189;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=14811190;
 //BA.debugLineNum = 14811190;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=14811191;
 //BA.debugLineNum = 14811191;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=14811193;
 //BA.debugLineNum = 14811193;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=14811194;
 //BA.debugLineNum = 14811194;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=14811196;
 //BA.debugLineNum = 14811196;BA.debugLine="B4XListDlg.Options=lstDireccionesCuentasEmail";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstdireccionescuentasemail;
RDebugUtils.currentLine=14811197;
 //BA.debugLineNum = 14811197;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=14811199;
 //BA.debugLineNum = 14811199;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=14811206;
 //BA.debugLineNum = 14811206;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=14811207;
 //BA.debugLineNum = 14811207;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_bcancel.IsInitialized()) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=14811209;
 //BA.debugLineNum = 14811209;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=14811210;
 //BA.debugLineNum = 14811210;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=14811211;
 //BA.debugLineNum = 14811211;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=14811214;
 //BA.debugLineNum = 14811214;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardireccionremitenteemailsrepsol"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 23;
_rint = (int) result[1];
;
RDebugUtils.currentLine=14811215;
 //BA.debugLineNum = 14811215;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=14811218;
 //BA.debugLineNum = 14811218;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=14811222;
 //BA.debugLineNum = 14811222;BA.debugLine="DireccionSeleccionadaRemitenteEmailsRepsol=B4XLis";
__ref._direccionseleccionadaremitenteemailsrepsol /*String*/  = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=14811224;
 //BA.debugLineNum = 14811224;BA.debugLine="If DireccionSeleccionadaRemitenteEmailsRepsol=\"at";
if (true) break;

case 27:
//if
this.state = 32;
if ((__ref._direccionseleccionadaremitenteemailsrepsol /*String*/ ).equals("atencionalcliente@proin-pinilla.com")) { 
this.state = 29;
;}if (true) break;

case 29:
//C
this.state = 32;
__ref._direccionseleccionadaremitenteemailsrepsol /*String*/  = "Servicio de Atención al Cliente";
if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=14811226;
 //BA.debugLineNum = 14811226;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=14811269;
 //BA.debugLineNum = 14811269;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _htmlbodyemail(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "htmlbodyemail", false))
	 {return ((String) Debug.delegate(ba, "htmlbodyemail", null));}
String _strbodyhtml = "";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub HTMLBodyEmail As String";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Dim strBodyHTML As String";
_strbodyhtml = "";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="strBodyHTML = $\"<p>Buenos días<br><br> Adjunto el";
_strbodyhtml = ("<p>Buenos días<br><br>\n"+"Adjunto el albarán en pdf y el archivo csv para que procedáis a la preparación de la mercancía y su envío a la mayor brevedad posible.<br>\n"+"En caso de alguna incidencia por favor indicádnoslo.<br>\n"+"<br>Muchas gracias");
RDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="Return strBodyHTML";
if (true) return _strbodyhtml;
RDebugUtils.currentLine=15007751;
 //BA.debugLineNum = 15007751;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ejecutarvbsscriptenviaremailrepsol(b4j.docU.cgestionventas __ref,String _senderaddr,String _receiveraddr,String _ccreceiveraddr,String _subject,String _body,String _fileattch,String _fileattch2) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "ejecutarvbsscriptenviaremailrepsol", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ejecutarvbsscriptenviaremailrepsol", new Object[] {_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2}));}
ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL rsub = new ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL(this,__ref,_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptEnviarEmailREPSOL(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _senderaddr,String _receiveraddr,String _ccreceiveraddr,String _subject,String _body,String _fileattch,String _fileattch2) {
this.parent = parent;
this.__ref = __ref;
this._senderaddr = _senderaddr;
this._receiveraddr = _receiveraddr;
this._ccreceiveraddr = _ccreceiveraddr;
this._subject = _subject;
this._body = _body;
this._fileattch = _fileattch;
this._fileattch2 = _fileattch2;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _senderaddr;
String _receiveraddr;
String _ccreceiveraddr;
String _subject;
String _body;
String _fileattch;
String _fileattch2;
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="Body=Body.Replace(CRLF,\"<br>\")";
_body = _body.replace(parent.__c.CRLF,"<br>");
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=14942215;
 //BA.debugLineNum = 14942215;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
_shl.Initialize("shl","c:\\windows\\system32\\cscript.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"//nologo","smfpromc2.vbs",_senderaddr,_receiveraddr,_ccreceiveraddr,_subject,_body,_fileattch,_fileattch2}));
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
_shl.setWorkingDirectory(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder());
RDebugUtils.currentLine=14942217;
 //BA.debugLineNum = 14942217;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=14942218;
 //BA.debugLineNum = 14942218;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=14942219;
 //BA.debugLineNum = 14942219;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "ejecutarvbsscriptenviaremailrepsol"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=14942220;
 //BA.debugLineNum = 14942220;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=14942221;
 //BA.debugLineNum = 14942221;BA.debugLine="Log(\"Success: \" & Success)";
parent.__c.LogImpl("814942221","Success: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=14942222;
 //BA.debugLineNum = 14942222;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("814942222",_stdout,0);
RDebugUtils.currentLine=14942223;
 //BA.debugLineNum = 14942223;BA.debugLine="mRes.Put(\"Success\",True)";
_mres.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=14942224;
 //BA.debugLineNum = 14942224;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
_mres.Put((Object)("StdOut"),(Object)(_stdout));
RDebugUtils.currentLine=14942225;
 //BA.debugLineNum = 14942225;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
_mres.Put((Object)("StdErr"),(Object)(_stderr));
RDebugUtils.currentLine=14942226;
 //BA.debugLineNum = 14942226;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
_mres.Put((Object)("ExitCode"),(Object)(_exitcode));
RDebugUtils.currentLine=14942227;
 //BA.debugLineNum = 14942227;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=14942228;
 //BA.debugLineNum = 14942228;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _creartablassqlite(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "creartablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creartablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub CrearTablasSQLite";
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblFechasPrometidasCompra"}))));
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblFe";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblFechasPrometidasCompra");
 };
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910606;
 //BA.debugLineNum = 12910606;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblFechasPrometidasCompra (");
RDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910608;
 //BA.debugLineNum = 12910608;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
_sbcreartabla.Append("Linea INTEGER,");
RDebugUtils.currentLine=12910609;
 //BA.debugLineNum = 12910609;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910610;
 //BA.debugLineNum = 12910610;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910611;
 //BA.debugLineNum = 12910611;BA.debugLine="sbCrearTabla.Append(\"FechaProm INTEGER,\")";
_sbcreartabla.Append("FechaProm INTEGER,");
RDebugUtils.currentLine=12910612;
 //BA.debugLineNum = 12910612;BA.debugLine="sbCrearTabla.Append(\"FechaPromAj INTEGER,\")";
_sbcreartabla.Append("FechaPromAj INTEGER,");
RDebugUtils.currentLine=12910613;
 //BA.debugLineNum = 12910613;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Almacen TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910614;
 //BA.debugLineNum = 12910614;BA.debugLine="sbCrearTabla.Append(\"AlmacenGV INTEGER,\")";
_sbcreartabla.Append("AlmacenGV INTEGER,");
RDebugUtils.currentLine=12910615;
 //BA.debugLineNum = 12910615;BA.debugLine="sbCrearTabla.Append(\"QtyPteRecibir INTEGER,\")";
_sbcreartabla.Append("QtyPteRecibir INTEGER,");
RDebugUtils.currentLine=12910616;
 //BA.debugLineNum = 12910616;BA.debugLine="sbCrearTabla.Append(\"sFechaProm TEXT)\")";
_sbcreartabla.Append("sFechaProm TEXT)");
RDebugUtils.currentLine=12910617;
 //BA.debugLineNum = 12910617;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910619;
 //BA.debugLineNum = 12910619;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblPedidosCompraRecibidosPtesRecepcionar"}))));
RDebugUtils.currentLine=12910620;
 //BA.debugLineNum = 12910620;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910621;
 //BA.debugLineNum = 12910621;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblPe";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblPedidosCompraRecibidosPtesRecepcionar");
 };
RDebugUtils.currentLine=12910623;
 //BA.debugLineNum = 12910623;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910624;
 //BA.debugLineNum = 12910624;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910625;
 //BA.debugLineNum = 12910625;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblPedidosCompraRecibidosPtesRecepcionar (");
RDebugUtils.currentLine=12910626;
 //BA.debugLineNum = 12910626;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910627;
 //BA.debugLineNum = 12910627;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
_sbcreartabla.Append("Linea INTEGER,");
RDebugUtils.currentLine=12910628;
 //BA.debugLineNum = 12910628;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910629;
 //BA.debugLineNum = 12910629;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910630;
 //BA.debugLineNum = 12910630;BA.debugLine="sbCrearTabla.Append(\"QtyARecepcionar INTEGER)\")";
_sbcreartabla.Append("QtyARecepcionar INTEGER)");
RDebugUtils.currentLine=12910631;
 //BA.debugLineNum = 12910631;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910633;
 //BA.debugLineNum = 12910633;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion"}))));
RDebugUtils.currentLine=12910634;
 //BA.debugLineNum = 12910634;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910635;
 //BA.debugLineNum = 12910635;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblOS";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion");
 };
RDebugUtils.currentLine=12910637;
 //BA.debugLineNum = 12910637;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910638;
 //BA.debugLineNum = 12910638;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910639;
 //BA.debugLineNum = 12910639;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblOSUBsPendientesTerminaProductoNoCorteNoConfeccion (");
RDebugUtils.currentLine=12910640;
 //BA.debugLineNum = 12910640;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910641;
 //BA.debugLineNum = 12910641;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910642;
 //BA.debugLineNum = 12910642;BA.debugLine="sbCrearTabla.Append(\"TQtyPte INTEGER,\")";
_sbcreartabla.Append("TQtyPte INTEGER,");
RDebugUtils.currentLine=12910643;
 //BA.debugLineNum = 12910643;BA.debugLine="sbCrearTabla.Append(\"FechaVencimiento INTEGER,\")";
_sbcreartabla.Append("FechaVencimiento INTEGER,");
RDebugUtils.currentLine=12910644;
 //BA.debugLineNum = 12910644;BA.debugLine="sbCrearTabla.Append(\"FechaVencimientoAj INTEGER,\"";
_sbcreartabla.Append("FechaVencimientoAj INTEGER,");
RDebugUtils.currentLine=12910645;
 //BA.debugLineNum = 12910645;BA.debugLine="sbCrearTabla.Append(\"sFechaProm TEXT)\")";
_sbcreartabla.Append("sFechaProm TEXT)");
RDebugUtils.currentLine=12910646;
 //BA.debugLineNum = 12910646;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910649;
 //BA.debugLineNum = 12910649;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblStockDisponibleArticuloTallaFecha"}))));
RDebugUtils.currentLine=12910650;
 //BA.debugLineNum = 12910650;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910651;
 //BA.debugLineNum = 12910651;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblStockDisponibleArticuloTallaFecha");
 };
RDebugUtils.currentLine=12910653;
 //BA.debugLineNum = 12910653;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910654;
 //BA.debugLineNum = 12910654;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910655;
 //BA.debugLineNum = 12910655;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleArticuloTallaFecha (");
RDebugUtils.currentLine=12910656;
 //BA.debugLineNum = 12910656;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910657;
 //BA.debugLineNum = 12910657;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910658;
 //BA.debugLineNum = 12910658;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
_sbcreartabla.Append("Fecha INTEGER,");
RDebugUtils.currentLine=12910659;
 //BA.debugLineNum = 12910659;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
_sbcreartabla.Append("QtyDisponible INTEGER,");
RDebugUtils.currentLine=12910660;
 //BA.debugLineNum = 12910660;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
_sbcreartabla.Append("sFecha TEXT)");
RDebugUtils.currentLine=12910661;
 //BA.debugLineNum = 12910661;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910664;
 //BA.debugLineNum = 12910664;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblStockDisponibleArticuloTallaFechaAlmacenesNoGV"}))));
RDebugUtils.currentLine=12910665;
 //BA.debugLineNum = 12910665;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910666;
 //BA.debugLineNum = 12910666;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblStockDisponibleArticuloTallaFechaAlmacenesNoGV");
 };
RDebugUtils.currentLine=12910668;
 //BA.debugLineNum = 12910668;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910669;
 //BA.debugLineNum = 12910669;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910670;
 //BA.debugLineNum = 12910670;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleArticuloTallaFechaAlmacenesNoGV (");
RDebugUtils.currentLine=12910671;
 //BA.debugLineNum = 12910671;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Almacen TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910672;
 //BA.debugLineNum = 12910672;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910673;
 //BA.debugLineNum = 12910673;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910674;
 //BA.debugLineNum = 12910674;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
_sbcreartabla.Append("Fecha INTEGER,");
RDebugUtils.currentLine=12910675;
 //BA.debugLineNum = 12910675;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
_sbcreartabla.Append("QtyDisponible INTEGER,");
RDebugUtils.currentLine=12910676;
 //BA.debugLineNum = 12910676;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
_sbcreartabla.Append("sFecha TEXT)");
RDebugUtils.currentLine=12910677;
 //BA.debugLineNum = 12910677;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910679;
 //BA.debugLineNum = 12910679;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblStockDisponibleAcumuladoArticuloTallaFecha"}))));
RDebugUtils.currentLine=12910680;
 //BA.debugLineNum = 12910680;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910681;
 //BA.debugLineNum = 12910681;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblStockDisponibleAcumuladoArticuloTallaFecha");
 };
RDebugUtils.currentLine=12910683;
 //BA.debugLineNum = 12910683;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910684;
 //BA.debugLineNum = 12910684;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910685;
 //BA.debugLineNum = 12910685;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleAcumuladoArticuloTallaFecha (");
RDebugUtils.currentLine=12910686;
 //BA.debugLineNum = 12910686;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910687;
 //BA.debugLineNum = 12910687;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910688;
 //BA.debugLineNum = 12910688;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
_sbcreartabla.Append("Fecha INTEGER,");
RDebugUtils.currentLine=12910689;
 //BA.debugLineNum = 12910689;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
_sbcreartabla.Append("QtyDisponible INTEGER,");
RDebugUtils.currentLine=12910690;
 //BA.debugLineNum = 12910690;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcumulada INTEG";
_sbcreartabla.Append("QtyDisponibleAcumulada INTEGER,");
RDebugUtils.currentLine=12910691;
 //BA.debugLineNum = 12910691;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
_sbcreartabla.Append("sFecha TEXT)");
RDebugUtils.currentLine=12910692;
 //BA.debugLineNum = 12910692;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910694;
 //BA.debugLineNum = 12910694;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV"}))));
RDebugUtils.currentLine=12910695;
 //BA.debugLineNum = 12910695;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910696;
 //BA.debugLineNum = 12910696;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblSt";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV");
 };
RDebugUtils.currentLine=12910698;
 //BA.debugLineNum = 12910698;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910699;
 //BA.debugLineNum = 12910699;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910700;
 //BA.debugLineNum = 12910700;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblStockDisponibleAcumuladoArticuloTallaFechaAlmacenesNoGV (");
RDebugUtils.currentLine=12910701;
 //BA.debugLineNum = 12910701;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Almacen TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910702;
 //BA.debugLineNum = 12910702;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910703;
 //BA.debugLineNum = 12910703;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910704;
 //BA.debugLineNum = 12910704;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
_sbcreartabla.Append("Fecha INTEGER,");
RDebugUtils.currentLine=12910705;
 //BA.debugLineNum = 12910705;BA.debugLine="sbCrearTabla.Append(\"QtyDisponible INTEGER,\")";
_sbcreartabla.Append("QtyDisponible INTEGER,");
RDebugUtils.currentLine=12910706;
 //BA.debugLineNum = 12910706;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcumulada INTEG";
_sbcreartabla.Append("QtyDisponibleAcumulada INTEGER,");
RDebugUtils.currentLine=12910707;
 //BA.debugLineNum = 12910707;BA.debugLine="sbCrearTabla.Append(\"sFecha TEXT)\")";
_sbcreartabla.Append("sFecha TEXT)");
RDebugUtils.currentLine=12910708;
 //BA.debugLineNum = 12910708;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910710;
 //BA.debugLineNum = 12910710;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblReservasDocumentoAlmZen"}))));
RDebugUtils.currentLine=12910711;
 //BA.debugLineNum = 12910711;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910712;
 //BA.debugLineNum = 12910712;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblRe";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblReservasDocumentoAlmZen");
 };
RDebugUtils.currentLine=12910714;
 //BA.debugLineNum = 12910714;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910715;
 //BA.debugLineNum = 12910715;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910716;
 //BA.debugLineNum = 12910716;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblReservasDocumentoAlmZen (");
RDebugUtils.currentLine=12910717;
 //BA.debugLineNum = 12910717;BA.debugLine="sbCrearTabla.Append(\"IDEmbalajeReserva TEXT COLLA";
_sbcreartabla.Append("IDEmbalajeReserva TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910718;
 //BA.debugLineNum = 12910718;BA.debugLine="sbCrearTabla.Append(\"AlmacenFisico TEXT COLLATE N";
_sbcreartabla.Append("AlmacenFisico TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910719;
 //BA.debugLineNum = 12910719;BA.debugLine="sbCrearTabla.Append(\"DocumentoReserva TEXT COLLAT";
_sbcreartabla.Append("DocumentoReserva TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910720;
 //BA.debugLineNum = 12910720;BA.debugLine="sbCrearTabla.Append(\"IDEmbalajeReservaDocumento I";
_sbcreartabla.Append("IDEmbalajeReservaDocumento INTEGER,");
RDebugUtils.currentLine=12910721;
 //BA.debugLineNum = 12910721;BA.debugLine="sbCrearTabla.Append(\"LoteRecepcion INTEGER,\")";
_sbcreartabla.Append("LoteRecepcion INTEGER,");
RDebugUtils.currentLine=12910722;
 //BA.debugLineNum = 12910722;BA.debugLine="sbCrearTabla.Append(\"Estado INTEGER,\")";
_sbcreartabla.Append("Estado INTEGER,");
RDebugUtils.currentLine=12910723;
 //BA.debugLineNum = 12910723;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910724;
 //BA.debugLineNum = 12910724;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
_sbcreartabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910725;
 //BA.debugLineNum = 12910725;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910726;
 //BA.debugLineNum = 12910726;BA.debugLine="sbCrearTabla.Append(\"Qty REAL)\")";
_sbcreartabla.Append("Qty REAL)");
RDebugUtils.currentLine=12910727;
 //BA.debugLineNum = 12910727;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910732;
 //BA.debugLineNum = 12910732;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblGestionVentasCalculos"}))));
RDebugUtils.currentLine=12910733;
 //BA.debugLineNum = 12910733;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910734;
 //BA.debugLineNum = 12910734;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblGe";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblGestionVentasCalculos");
 };
RDebugUtils.currentLine=12910736;
 //BA.debugLineNum = 12910736;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910737;
 //BA.debugLineNum = 12910737;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910738;
 //BA.debugLineNum = 12910738;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblGestionVentasCalculos (");
RDebugUtils.currentLine=12910739;
 //BA.debugLineNum = 12910739;BA.debugLine="sbCrearTabla.Append(\"IDPrioridad INTEGER,\")";
_sbcreartabla.Append("IDPrioridad INTEGER,");
RDebugUtils.currentLine=12910740;
 //BA.debugLineNum = 12910740;BA.debugLine="sbCrearTabla.Append(\"IDPrioridadUsuario INTEGER,\"";
_sbcreartabla.Append("IDPrioridadUsuario INTEGER,");
RDebugUtils.currentLine=12910741;
 //BA.debugLineNum = 12910741;BA.debugLine="sbCrearTabla.Append(\"CodigoResponsableCuenta TEXT";
_sbcreartabla.Append("CodigoResponsableCuenta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910742;
 //BA.debugLineNum = 12910742;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910743;
 //BA.debugLineNum = 12910743;BA.debugLine="sbCrearTabla.Append(\"CodigoVendedor TEXT COLLATE";
_sbcreartabla.Append("CodigoVendedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910744;
 //BA.debugLineNum = 12910744;BA.debugLine="sbCrearTabla.Append(\"NombreVendedor TEXT COLLATE";
_sbcreartabla.Append("NombreVendedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910745;
 //BA.debugLineNum = 12910745;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910746;
 //BA.debugLineNum = 12910746;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
_sbcreartabla.Append("FechaDocumento INTEGER,");
RDebugUtils.currentLine=12910747;
 //BA.debugLineNum = 12910747;BA.debugLine="sbCrearTabla.Append(\"FechaPrometida INTEGER,\")";
_sbcreartabla.Append("FechaPrometida INTEGER,");
RDebugUtils.currentLine=12910748;
 //BA.debugLineNum = 12910748;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910749;
 //BA.debugLineNum = 12910749;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910750;
 //BA.debugLineNum = 12910750;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("GRP TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910751;
 //BA.debugLineNum = 12910751;BA.debugLine="sbCrearTabla.Append(\"NombreGRP TEXT COLLATE NOCAS";
_sbcreartabla.Append("NombreGRP TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910752;
 //BA.debugLineNum = 12910752;BA.debugLine="sbCrearTabla.Append(\"DirEnv TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("DirEnv TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910753;
 //BA.debugLineNum = 12910753;BA.debugLine="sbCrearTabla.Append(\"CiudadDirEnvio TEXT COLLATE";
_sbcreartabla.Append("CiudadDirEnvio TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910754;
 //BA.debugLineNum = 12910754;BA.debugLine="sbCrearTabla.Append(\"PedidoCliente TEXT COLLATE N";
_sbcreartabla.Append("PedidoCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910755;
 //BA.debugLineNum = 12910755;BA.debugLine="sbCrearTabla.Append(\"Stand_By INTEGER,\")";
_sbcreartabla.Append("Stand_By INTEGER,");
RDebugUtils.currentLine=12910756;
 //BA.debugLineNum = 12910756;BA.debugLine="sbCrearTabla.Append(\"PedidoBloqueado INTEGER,\")";
_sbcreartabla.Append("PedidoBloqueado INTEGER,");
RDebugUtils.currentLine=12910757;
 //BA.debugLineNum = 12910757;BA.debugLine="sbCrearTabla.Append(\"PedidoAbierto INTEGER,\")";
_sbcreartabla.Append("PedidoAbierto INTEGER,");
RDebugUtils.currentLine=12910758;
 //BA.debugLineNum = 12910758;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
_sbcreartabla.Append("Linea INTEGER,");
RDebugUtils.currentLine=12910759;
 //BA.debugLineNum = 12910759;BA.debugLine="sbCrearTabla.Append(\"AlmOrigen TEXT COLLATE NOCAS";
_sbcreartabla.Append("AlmOrigen TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910760;
 //BA.debugLineNum = 12910760;BA.debugLine="sbCrearTabla.Append(\"AlmOrigenGV INTEGER DEFAULT";
_sbcreartabla.Append("AlmOrigenGV INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910761;
 //BA.debugLineNum = 12910761;BA.debugLine="sbCrearTabla.Append(\"AlmDest TEXT COLLATE NOCASE,";
_sbcreartabla.Append("AlmDest TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910762;
 //BA.debugLineNum = 12910762;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
_sbcreartabla.Append("Personalizado INTEGER,");
RDebugUtils.currentLine=12910763;
 //BA.debugLineNum = 12910763;BA.debugLine="sbCrearTabla.Append(\"Fabricacion INTEGER,\")";
_sbcreartabla.Append("Fabricacion INTEGER,");
RDebugUtils.currentLine=12910764;
 //BA.debugLineNum = 12910764;BA.debugLine="sbCrearTabla.Append(\"CompraFab TEXT COLLATE NOCAS";
_sbcreartabla.Append("CompraFab TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910765;
 //BA.debugLineNum = 12910765;BA.debugLine="sbCrearTabla.Append(\"Dual INTEGER,\")";
_sbcreartabla.Append("Dual INTEGER,");
RDebugUtils.currentLine=12910766;
 //BA.debugLineNum = 12910766;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Ruta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910767;
 //BA.debugLineNum = 12910767;BA.debugLine="sbCrearTabla.Append(\"PlazoRuta TEXT COLLATE NOCAS";
_sbcreartabla.Append("PlazoRuta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910768;
 //BA.debugLineNum = 12910768;BA.debugLine="sbCrearTabla.Append(\"RutaDual TEXT COLLATE NOCASE";
_sbcreartabla.Append("RutaDual TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910769;
 //BA.debugLineNum = 12910769;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaDual TEXT COLLATE N";
_sbcreartabla.Append("PlazoRutaDual TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910770;
 //BA.debugLineNum = 12910770;BA.debugLine="sbCrearTabla.Append(\"ArticuloCorte TEXT COLLATE N";
_sbcreartabla.Append("ArticuloCorte TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910771;
 //BA.debugLineNum = 12910771;BA.debugLine="sbCrearTabla.Append(\"RutaAplicable TEXT COLLATE N";
_sbcreartabla.Append("RutaAplicable TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=12910772;
 //BA.debugLineNum = 12910772;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaAplicable INTEGER D";
_sbcreartabla.Append("PlazoRutaAplicable INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910773;
 //BA.debugLineNum = 12910773;BA.debugLine="sbCrearTabla.Append(\"PlazoTeoricoFabLinea INTEGER";
_sbcreartabla.Append("PlazoTeoricoFabLinea INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910774;
 //BA.debugLineNum = 12910774;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaFabLinea INTEGER";
_sbcreartabla.Append("FechaTeoricaFabLinea INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910775;
 //BA.debugLineNum = 12910775;BA.debugLine="sbCrearTabla.Append(\"FechaMaterial INTEGER,\")";
_sbcreartabla.Append("FechaMaterial INTEGER,");
RDebugUtils.currentLine=12910776;
 //BA.debugLineNum = 12910776;BA.debugLine="sbCrearTabla.Append(\"FechaPlanificada INTEGER,\")";
_sbcreartabla.Append("FechaPlanificada INTEGER,");
RDebugUtils.currentLine=12910777;
 //BA.debugLineNum = 12910777;BA.debugLine="sbCrearTabla.Append(\"FechaRequerida INTEGER,\")";
_sbcreartabla.Append("FechaRequerida INTEGER,");
RDebugUtils.currentLine=12910778;
 //BA.debugLineNum = 12910778;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaEntrega INTEGER";
_sbcreartabla.Append("FechaTeoricaEntrega INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910779;
 //BA.debugLineNum = 12910779;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910780;
 //BA.debugLineNum = 12910780;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
_sbcreartabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910781;
 //BA.debugLineNum = 12910781;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910782;
 //BA.debugLineNum = 12910782;BA.debugLine="sbCrearTabla.Append(\"QtyPte INTEGER,\")";
_sbcreartabla.Append("QtyPte INTEGER,");
RDebugUtils.currentLine=12910783;
 //BA.debugLineNum = 12910783;BA.debugLine="sbCrearTabla.Append(\"Reserva INTEGER,\")";
_sbcreartabla.Append("Reserva INTEGER,");
RDebugUtils.currentLine=12910784;
 //BA.debugLineNum = 12910784;BA.debugLine="sbCrearTabla.Append(\"QtyPteNeta INTEGER,\")";
_sbcreartabla.Append("QtyPteNeta INTEGER,");
RDebugUtils.currentLine=12910785;
 //BA.debugLineNum = 12910785;BA.debugLine="sbCrearTabla.Append(\"StockLibre INTEGER,\")";
_sbcreartabla.Append("StockLibre INTEGER,");
RDebugUtils.currentLine=12910786;
 //BA.debugLineNum = 12910786;BA.debugLine="sbCrearTabla.Append(\"StockAlmNoGV INTEGER DEFAULT";
_sbcreartabla.Append("StockAlmNoGV INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910787;
 //BA.debugLineNum = 12910787;BA.debugLine="sbCrearTabla.Append(\"QtyPteNetaAcum INTEGER DEFAU";
_sbcreartabla.Append("QtyPteNetaAcum INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910788;
 //BA.debugLineNum = 12910788;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcum INTEGER DE";
_sbcreartabla.Append("QtyDisponibleAcum INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910791;
 //BA.debugLineNum = 12910791;BA.debugLine="sbCrearTabla.Append(\"Status TEXT,\")";
_sbcreartabla.Append("Status TEXT,");
RDebugUtils.currentLine=12910792;
 //BA.debugLineNum = 12910792;BA.debugLine="sbCrearTabla.Append(\"ReservaAlmacen INTEGER,\")";
_sbcreartabla.Append("ReservaAlmacen INTEGER,");
RDebugUtils.currentLine=12910793;
 //BA.debugLineNum = 12910793;BA.debugLine="sbCrearTabla.Append(\"ImportePendiente REAL,\")";
_sbcreartabla.Append("ImportePendiente REAL,");
RDebugUtils.currentLine=12910794;
 //BA.debugLineNum = 12910794;BA.debugLine="sbCrearTabla.Append(\"FechaCalculoActualCliente IN";
_sbcreartabla.Append("FechaCalculoActualCliente INTEGER,");
RDebugUtils.currentLine=12910795;
 //BA.debugLineNum = 12910795;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidad INTEGER";
_sbcreartabla.Append("FechaDisponibilidad INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910796;
 //BA.debugLineNum = 12910796;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidadVencida T";
_sbcreartabla.Append("FechaDisponibilidadVencida TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=12910797;
 //BA.debugLineNum = 12910797;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLinea INTEGER";
_sbcreartabla.Append("FechaPrevVentasLinea INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910798;
 //BA.debugLineNum = 12910798;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLineaVencida";
_sbcreartabla.Append("FechaPrevVentasLineaVencida TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=12910800;
 //BA.debugLineNum = 12910800;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasDocumento INT";
_sbcreartabla.Append("FechaPrevVentasDocumento INTEGER DEFAULT 0)");
RDebugUtils.currentLine=12910803;
 //BA.debugLineNum = 12910803;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910805;
 //BA.debugLineNum = 12910805;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910806;
 //BA.debugLineNum = 12910806;BA.debugLine="sbCrearTabla.Append(\"CREATE INDEX idxArticuloTall";
_sbcreartabla.Append("CREATE INDEX idxArticuloTallatblGestionVentasCalculos ");
RDebugUtils.currentLine=12910807;
 //BA.debugLineNum = 12910807;BA.debugLine="sbCrearTabla.Append(\"ON tblGestionVentasCalculos";
_sbcreartabla.Append("ON tblGestionVentasCalculos (Articulo, Talla)");
RDebugUtils.currentLine=12910808;
 //BA.debugLineNum = 12910808;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910810;
 //BA.debugLineNum = 12910810;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblGestionVentas"}))));
RDebugUtils.currentLine=12910811;
 //BA.debugLineNum = 12910811;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910812;
 //BA.debugLineNum = 12910812;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblGe";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblGestionVentas");
 };
RDebugUtils.currentLine=12910814;
 //BA.debugLineNum = 12910814;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910815;
 //BA.debugLineNum = 12910815;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910816;
 //BA.debugLineNum = 12910816;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblGestionVentas (");
RDebugUtils.currentLine=12910817;
 //BA.debugLineNum = 12910817;BA.debugLine="sbCrearTabla.Append(\"IDPrioridad INTEGER,\")";
_sbcreartabla.Append("IDPrioridad INTEGER,");
RDebugUtils.currentLine=12910818;
 //BA.debugLineNum = 12910818;BA.debugLine="sbCrearTabla.Append(\"IDPrioridadUsuario INTEGER,\"";
_sbcreartabla.Append("IDPrioridadUsuario INTEGER,");
RDebugUtils.currentLine=12910819;
 //BA.debugLineNum = 12910819;BA.debugLine="sbCrearTabla.Append(\"CodigoResponsableCuenta TEXT";
_sbcreartabla.Append("CodigoResponsableCuenta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910820;
 //BA.debugLineNum = 12910820;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910821;
 //BA.debugLineNum = 12910821;BA.debugLine="sbCrearTabla.Append(\"CodigoVendedor TEXT COLLATE";
_sbcreartabla.Append("CodigoVendedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910822;
 //BA.debugLineNum = 12910822;BA.debugLine="sbCrearTabla.Append(\"NombreVendedor TEXT COLLATE";
_sbcreartabla.Append("NombreVendedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910823;
 //BA.debugLineNum = 12910823;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910824;
 //BA.debugLineNum = 12910824;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
_sbcreartabla.Append("FechaDocumento INTEGER,");
RDebugUtils.currentLine=12910825;
 //BA.debugLineNum = 12910825;BA.debugLine="sbCrearTabla.Append(\"FechaPrometida INTEGER,\")";
_sbcreartabla.Append("FechaPrometida INTEGER,");
RDebugUtils.currentLine=12910826;
 //BA.debugLineNum = 12910826;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910827;
 //BA.debugLineNum = 12910827;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910828;
 //BA.debugLineNum = 12910828;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("GRP TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910829;
 //BA.debugLineNum = 12910829;BA.debugLine="sbCrearTabla.Append(\"NombreGRP TEXT COLLATE NOCAS";
_sbcreartabla.Append("NombreGRP TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910830;
 //BA.debugLineNum = 12910830;BA.debugLine="sbCrearTabla.Append(\"DirEnv TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("DirEnv TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910831;
 //BA.debugLineNum = 12910831;BA.debugLine="sbCrearTabla.Append(\"CiudadDirEnvio TEXT COLLATE";
_sbcreartabla.Append("CiudadDirEnvio TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910832;
 //BA.debugLineNum = 12910832;BA.debugLine="sbCrearTabla.Append(\"PedidoCliente TEXT COLLATE N";
_sbcreartabla.Append("PedidoCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910833;
 //BA.debugLineNum = 12910833;BA.debugLine="sbCrearTabla.Append(\"Stand_By INTEGER,\")";
_sbcreartabla.Append("Stand_By INTEGER,");
RDebugUtils.currentLine=12910834;
 //BA.debugLineNum = 12910834;BA.debugLine="sbCrearTabla.Append(\"PedidoBloqueado INTEGER,\")";
_sbcreartabla.Append("PedidoBloqueado INTEGER,");
RDebugUtils.currentLine=12910835;
 //BA.debugLineNum = 12910835;BA.debugLine="sbCrearTabla.Append(\"PedidoAbierto INTEGER,\")";
_sbcreartabla.Append("PedidoAbierto INTEGER,");
RDebugUtils.currentLine=12910836;
 //BA.debugLineNum = 12910836;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
_sbcreartabla.Append("Linea INTEGER,");
RDebugUtils.currentLine=12910837;
 //BA.debugLineNum = 12910837;BA.debugLine="sbCrearTabla.Append(\"AlmOrigen TEXT COLLATE NOCAS";
_sbcreartabla.Append("AlmOrigen TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910838;
 //BA.debugLineNum = 12910838;BA.debugLine="sbCrearTabla.Append(\"AlmOrigenGV INTEGER DEFAULT";
_sbcreartabla.Append("AlmOrigenGV INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910839;
 //BA.debugLineNum = 12910839;BA.debugLine="sbCrearTabla.Append(\"AlmDest TEXT COLLATE NOCASE,";
_sbcreartabla.Append("AlmDest TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910840;
 //BA.debugLineNum = 12910840;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
_sbcreartabla.Append("Personalizado INTEGER,");
RDebugUtils.currentLine=12910841;
 //BA.debugLineNum = 12910841;BA.debugLine="sbCrearTabla.Append(\"Fabricacion INTEGER,\")";
_sbcreartabla.Append("Fabricacion INTEGER,");
RDebugUtils.currentLine=12910842;
 //BA.debugLineNum = 12910842;BA.debugLine="sbCrearTabla.Append(\"CompraFab TEXT COLLATE NOCAS";
_sbcreartabla.Append("CompraFab TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910843;
 //BA.debugLineNum = 12910843;BA.debugLine="sbCrearTabla.Append(\"Dual INTEGER,\")";
_sbcreartabla.Append("Dual INTEGER,");
RDebugUtils.currentLine=12910844;
 //BA.debugLineNum = 12910844;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Ruta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910845;
 //BA.debugLineNum = 12910845;BA.debugLine="sbCrearTabla.Append(\"PlazoRuta TEXT COLLATE NOCAS";
_sbcreartabla.Append("PlazoRuta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910846;
 //BA.debugLineNum = 12910846;BA.debugLine="sbCrearTabla.Append(\"RutaDual TEXT COLLATE NOCASE";
_sbcreartabla.Append("RutaDual TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910847;
 //BA.debugLineNum = 12910847;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaDual TEXT COLLATE N";
_sbcreartabla.Append("PlazoRutaDual TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910848;
 //BA.debugLineNum = 12910848;BA.debugLine="sbCrearTabla.Append(\"ArticuloCorte TEXT COLLATE N";
_sbcreartabla.Append("ArticuloCorte TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910849;
 //BA.debugLineNum = 12910849;BA.debugLine="sbCrearTabla.Append(\"RutaAplicable TEXT COLLATE N";
_sbcreartabla.Append("RutaAplicable TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=12910850;
 //BA.debugLineNum = 12910850;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaAplicable INTEGER D";
_sbcreartabla.Append("PlazoRutaAplicable INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910851;
 //BA.debugLineNum = 12910851;BA.debugLine="sbCrearTabla.Append(\"PlazoTeoricoFabLinea INTEGER";
_sbcreartabla.Append("PlazoTeoricoFabLinea INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910852;
 //BA.debugLineNum = 12910852;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaFabLinea INTEGER";
_sbcreartabla.Append("FechaTeoricaFabLinea INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910853;
 //BA.debugLineNum = 12910853;BA.debugLine="sbCrearTabla.Append(\"FechaMaterial INTEGER,\")";
_sbcreartabla.Append("FechaMaterial INTEGER,");
RDebugUtils.currentLine=12910854;
 //BA.debugLineNum = 12910854;BA.debugLine="sbCrearTabla.Append(\"FechaPlanificada INTEGER,\")";
_sbcreartabla.Append("FechaPlanificada INTEGER,");
RDebugUtils.currentLine=12910855;
 //BA.debugLineNum = 12910855;BA.debugLine="sbCrearTabla.Append(\"FechaRequerida INTEGER,\")";
_sbcreartabla.Append("FechaRequerida INTEGER,");
RDebugUtils.currentLine=12910856;
 //BA.debugLineNum = 12910856;BA.debugLine="sbCrearTabla.Append(\"FechaTeoricaEntrega INTEGER";
_sbcreartabla.Append("FechaTeoricaEntrega INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910857;
 //BA.debugLineNum = 12910857;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910858;
 //BA.debugLineNum = 12910858;BA.debugLine="sbCrearTabla.Append(\"DescripcionArticulo TEXT COL";
_sbcreartabla.Append("DescripcionArticulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910859;
 //BA.debugLineNum = 12910859;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910860;
 //BA.debugLineNum = 12910860;BA.debugLine="sbCrearTabla.Append(\"QtyPte INTEGER,\")";
_sbcreartabla.Append("QtyPte INTEGER,");
RDebugUtils.currentLine=12910861;
 //BA.debugLineNum = 12910861;BA.debugLine="sbCrearTabla.Append(\"Reserva INTEGER,\")";
_sbcreartabla.Append("Reserva INTEGER,");
RDebugUtils.currentLine=12910862;
 //BA.debugLineNum = 12910862;BA.debugLine="sbCrearTabla.Append(\"StockLibre INTEGER,\")";
_sbcreartabla.Append("StockLibre INTEGER,");
RDebugUtils.currentLine=12910863;
 //BA.debugLineNum = 12910863;BA.debugLine="sbCrearTabla.Append(\"StockAlmNoGV INTEGER default";
_sbcreartabla.Append("StockAlmNoGV INTEGER default 0,");
RDebugUtils.currentLine=12910864;
 //BA.debugLineNum = 12910864;BA.debugLine="sbCrearTabla.Append(\"QtyPteNeta INTEGER,\")";
_sbcreartabla.Append("QtyPteNeta INTEGER,");
RDebugUtils.currentLine=12910865;
 //BA.debugLineNum = 12910865;BA.debugLine="sbCrearTabla.Append(\"QtyPteNetaAcum INTEGER defau";
_sbcreartabla.Append("QtyPteNetaAcum INTEGER default 0,");
RDebugUtils.currentLine=12910866;
 //BA.debugLineNum = 12910866;BA.debugLine="sbCrearTabla.Append(\"QtyDisponibleAcum INTEGER de";
_sbcreartabla.Append("QtyDisponibleAcum INTEGER default 0,");
RDebugUtils.currentLine=12910867;
 //BA.debugLineNum = 12910867;BA.debugLine="sbCrearTabla.Append(\"Status TEXT,\")";
_sbcreartabla.Append("Status TEXT,");
RDebugUtils.currentLine=12910868;
 //BA.debugLineNum = 12910868;BA.debugLine="sbCrearTabla.Append(\"ReservaAlmacen INTEGER,\")";
_sbcreartabla.Append("ReservaAlmacen INTEGER,");
RDebugUtils.currentLine=12910869;
 //BA.debugLineNum = 12910869;BA.debugLine="sbCrearTabla.Append(\"QtyPteRecibir REAL default 0";
_sbcreartabla.Append("QtyPteRecibir REAL default 0,");
RDebugUtils.currentLine=12910870;
 //BA.debugLineNum = 12910870;BA.debugLine="sbCrearTabla.Append(\"ImportePendiente REAL,\")";
_sbcreartabla.Append("ImportePendiente REAL,");
RDebugUtils.currentLine=12910871;
 //BA.debugLineNum = 12910871;BA.debugLine="sbCrearTabla.Append(\"FechaCalculoActualCliente IN";
_sbcreartabla.Append("FechaCalculoActualCliente INTEGER,");
RDebugUtils.currentLine=12910872;
 //BA.debugLineNum = 12910872;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidad INTEGER";
_sbcreartabla.Append("FechaDisponibilidad INTEGER default 0,");
RDebugUtils.currentLine=12910873;
 //BA.debugLineNum = 12910873;BA.debugLine="sbCrearTabla.Append(\"FechaDisponibilidadVencida T";
_sbcreartabla.Append("FechaDisponibilidadVencida TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=12910874;
 //BA.debugLineNum = 12910874;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLinea INTEGER";
_sbcreartabla.Append("FechaPrevVentasLinea INTEGER default 0,");
RDebugUtils.currentLine=12910875;
 //BA.debugLineNum = 12910875;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasLineaVencida";
_sbcreartabla.Append("FechaPrevVentasLineaVencida TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=12910877;
 //BA.debugLineNum = 12910877;BA.debugLine="sbCrearTabla.Append(\"FechaPrevVentasDocumento INT";
_sbcreartabla.Append("FechaPrevVentasDocumento INTEGER default 0)");
RDebugUtils.currentLine=12910879;
 //BA.debugLineNum = 12910879;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910881;
 //BA.debugLineNum = 12910881;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910882;
 //BA.debugLineNum = 12910882;BA.debugLine="sbCrearTabla.Append(\"CREATE INDEX idxArticuloTall";
_sbcreartabla.Append("CREATE INDEX idxArticuloTallatblGestionVentas ");
RDebugUtils.currentLine=12910883;
 //BA.debugLineNum = 12910883;BA.debugLine="sbCrearTabla.Append(\"ON tblGestionVentas (Articul";
_sbcreartabla.Append("ON tblGestionVentas (Articulo, Talla)");
RDebugUtils.currentLine=12910884;
 //BA.debugLineNum = 12910884;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910886;
 //BA.debugLineNum = 12910886;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblConfPlazoFechaEntregaPlan"}))));
RDebugUtils.currentLine=12910887;
 //BA.debugLineNum = 12910887;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910888;
 //BA.debugLineNum = 12910888;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblCo";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblConfPlazoFechaEntregaPlan");
 };
RDebugUtils.currentLine=12910890;
 //BA.debugLineNum = 12910890;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910891;
 //BA.debugLineNum = 12910891;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910892;
 //BA.debugLineNum = 12910892;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblConfPlazoFechaEntregaPlan (");
RDebugUtils.currentLine=12910893;
 //BA.debugLineNum = 12910893;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910894;
 //BA.debugLineNum = 12910894;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910895;
 //BA.debugLineNum = 12910895;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("GRP TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910896;
 //BA.debugLineNum = 12910896;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Ruta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910897;
 //BA.debugLineNum = 12910897;BA.debugLine="sbCrearTabla.Append(\"Plazo INTEGER)\")";
_sbcreartabla.Append("Plazo INTEGER)");
RDebugUtils.currentLine=12910898;
 //BA.debugLineNum = 12910898;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910922;
 //BA.debugLineNum = 12910922;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblConfPlazoFechaEntregaPlanArticulosCorteGV"}))));
RDebugUtils.currentLine=12910923;
 //BA.debugLineNum = 12910923;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910924;
 //BA.debugLineNum = 12910924;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblCo";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblConfPlazoFechaEntregaPlanArticulosCorteGV");
 };
RDebugUtils.currentLine=12910927;
 //BA.debugLineNum = 12910927;BA.debugLine="Dim ntFP As Int=mSQLGestionventas.ExecQuerySingle";
_ntfp = (int)(Double.parseDouble(__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblConfPlazoFechaEntregaPlanArticulosFabGV"}))));
RDebugUtils.currentLine=12910928;
 //BA.debugLineNum = 12910928;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=12910929;
 //BA.debugLineNum = 12910929;BA.debugLine="mSQLGestionventas.ExecNonQuery(\"drop table tblCo";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblConfPlazoFechaEntregaPlanArticulosFabGV");
 };
RDebugUtils.currentLine=12910931;
 //BA.debugLineNum = 12910931;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12910932;
 //BA.debugLineNum = 12910932;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=12910933;
 //BA.debugLineNum = 12910933;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblConfPlazoFechaEntregaPlanArticulosFabGV (");
RDebugUtils.currentLine=12910934;
 //BA.debugLineNum = 12910934;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910935;
 //BA.debugLineNum = 12910935;BA.debugLine="sbCrearTabla.Append(\"Linea INTEGER,\")";
_sbcreartabla.Append("Linea INTEGER,");
RDebugUtils.currentLine=12910936;
 //BA.debugLineNum = 12910936;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento Long,\")";
_sbcreartabla.Append("FechaDocumento Long,");
RDebugUtils.currentLine=12910937;
 //BA.debugLineNum = 12910937;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910938;
 //BA.debugLineNum = 12910938;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910939;
 //BA.debugLineNum = 12910939;BA.debugLine="sbCrearTabla.Append(\"GRP TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("GRP TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910940;
 //BA.debugLineNum = 12910940;BA.debugLine="sbCrearTabla.Append(\"Ruta TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Ruta TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=12910941;
 //BA.debugLineNum = 12910941;BA.debugLine="sbCrearTabla.Append(\"Plazo1 INTEGER,\")";
_sbcreartabla.Append("Plazo1 INTEGER,");
RDebugUtils.currentLine=12910942;
 //BA.debugLineNum = 12910942;BA.debugLine="sbCrearTabla.Append(\"Plazo2 INTEGER,\")";
_sbcreartabla.Append("Plazo2 INTEGER,");
RDebugUtils.currentLine=12910943;
 //BA.debugLineNum = 12910943;BA.debugLine="sbCrearTabla.Append(\"Plazo3 INTEGER,\")";
_sbcreartabla.Append("Plazo3 INTEGER,");
RDebugUtils.currentLine=12910944;
 //BA.debugLineNum = 12910944;BA.debugLine="sbCrearTabla.Append(\"Plazo4 INTEGER,\")";
_sbcreartabla.Append("Plazo4 INTEGER,");
RDebugUtils.currentLine=12910945;
 //BA.debugLineNum = 12910945;BA.debugLine="sbCrearTabla.Append(\"Plazo5 INTEGER,\")";
_sbcreartabla.Append("Plazo5 INTEGER,");
RDebugUtils.currentLine=12910946;
 //BA.debugLineNum = 12910946;BA.debugLine="sbCrearTabla.Append(\"Plazo6 INTEGER,\")";
_sbcreartabla.Append("Plazo6 INTEGER,");
RDebugUtils.currentLine=12910947;
 //BA.debugLineNum = 12910947;BA.debugLine="sbCrearTabla.Append(\"Plazo7 INTEGER,\")";
_sbcreartabla.Append("Plazo7 INTEGER,");
RDebugUtils.currentLine=12910948;
 //BA.debugLineNum = 12910948;BA.debugLine="sbCrearTabla.Append(\"Plazo8 INTEGER,\")";
_sbcreartabla.Append("Plazo8 INTEGER,");
RDebugUtils.currentLine=12910949;
 //BA.debugLineNum = 12910949;BA.debugLine="sbCrearTabla.Append(\"Plazo9 INTEGER,\")";
_sbcreartabla.Append("Plazo9 INTEGER,");
RDebugUtils.currentLine=12910950;
 //BA.debugLineNum = 12910950;BA.debugLine="sbCrearTabla.Append(\"Plazo10 INTEGER,\")";
_sbcreartabla.Append("Plazo10 INTEGER,");
RDebugUtils.currentLine=12910951;
 //BA.debugLineNum = 12910951;BA.debugLine="sbCrearTabla.Append(\"PlazoRutaAplicable INTEGER D";
_sbcreartabla.Append("PlazoRutaAplicable INTEGER DEFAULT 0,");
RDebugUtils.currentLine=12910952;
 //BA.debugLineNum = 12910952;BA.debugLine="sbCrearTabla.Append(\"PlazoArtLinea INTEGER,\")";
_sbcreartabla.Append("PlazoArtLinea INTEGER,");
RDebugUtils.currentLine=12910953;
 //BA.debugLineNum = 12910953;BA.debugLine="sbCrearTabla.Append(\"FechaDocumentoMasPlazoArtLin";
_sbcreartabla.Append("FechaDocumentoMasPlazoArtLinea Long)");
RDebugUtils.currentLine=12910955;
 //BA.debugLineNum = 12910955;BA.debugLine="mSQLGestionventas.ExecNonQuery(sbCrearTabla.ToStr";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=12910992;
 //BA.debugLineNum = 12910992;BA.debugLine="End Sub";
return "";
}
public String  _crearvbsscriptdireccionremitenteemailoutlookrepsol(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "crearvbsscriptdireccionremitenteemailoutlookrepsol", false))
	 {return ((String) Debug.delegate(ba, "crearvbsscriptdireccionremitenteemailoutlookrepsol", null));}
String _svbscript = "";
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Sub CrearVBSScriptDireccionRemitenteEmailOutlookRE";
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookREPS";
__ref._borrarvbsscriptdireccionremitenteemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="Dim sVBscript As String";
_svbscript = "";
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
_svbscript = ("\n"+"		Option Explicit\n"+"		On Error Resume Next\n"+"		Dim xOLApp, olAccounts\n"+"		Dim objStdOut,objStdErr\n"+"			\n"+"		Set objStdOut = WScript.StdOut\n"+"		Set objStdErr = WScript.StdErr\n"+"			\n"+"	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"+"		Set xOLApp =GetObject(, \"Outlook.Application\")\n"+"		If Err.Number<>0 Then\n"+"			If Err.Number=429 Then\n"+"	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"			Else\n"+"	'MsgBox Err.Number & \" \" & Err.Description\n"+"				objStdErr.Write Err.Number & \" \" & Err.Description\n"+"			End If\n"+"			WScript.Quit (1) 'return code 1\n"+"		End If\n"+"\n"+"		Dim i\n"+"		For i = 1 To xOLApp.Session.Accounts.count\n"+"			objStdOut.Write xOLApp.Session.Accounts.Item(i) & \",\"\n"+"		Next\n"+"		Set xOLApp = Nothing\n"+"		If Err.Number<>0 Then\n"+"			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"+"			WScript.Quit (1)\n"+"		Else\n"+"			WScript.Quit (0)\n"+"		End If\n"+"			");
RDebugUtils.currentLine=14680127;
 //BA.debugLineNum = 14680127;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc.vbs\"";
__c.File.WriteString(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc.vbs",_svbscript);
RDebugUtils.currentLine=14680128;
 //BA.debugLineNum = 14680128;BA.debugLine="End Sub";
return "";
}
public String  _crearvbsscriptenvioemailoutlookhtmlrepsol(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "crearvbsscriptenvioemailoutlookhtmlrepsol", false))
	 {return ((String) Debug.delegate(ba, "crearvbsscriptenvioemailoutlookhtmlrepsol", null));}
String _svbscript = "";
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub CrearVBSScriptEnvioEmailOutlookHTMLREPSOL";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
__ref._borrarvbsscriptenvioemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Dim sVBscript As String";
_svbscript = "";
RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="sVBscript =$\" 		Option Explicit 		On Error Resume";
_svbscript = ("\n"+"		Option Explicit\n"+"		On Error Resume Next\n"+"\n"+"		Dim objStdOut,objStdErr\n"+"			\n"+"		Set objStdOut = WScript.StdOut\n"+"		Set objStdErr = WScript.StdErr\n"+"		\n"+"		Dim xOLApp\n"+"		Dim objMailItem\n"+"		\n"+"	'Dim OutAccount\n"+"		\n"+"		Dim signature\n"+"			\n"+"	'Set xOLApp = CreateObject(\"Outlook.Application\")\n"+"		Set xOLApp =GetObject(, \"Outlook.Application\")\n"+"		If Err.Number<>0 Then\n"+"			If Err.Number=429 Then\n"+"	'MsgBox \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"				objStdErr.Write \"Outlook debe estar instalado y abierto para poder enviar emails desde esta aplicaci\" + chr(243) + \"n (err 429)\"\n"+"			Else\n"+"	'MsgBox Err.Number & \" \" & Err.Description\n"+"				objStdErr.Write Err.Number & \" \" & Err.Description\n"+"			End If\n"+"			WScript.Quit (1) 'return code 1\n"+"		End If\n"+"		Set objMailItem = xOLApp.CreateItem(0)\n"+"		\n"+"   		objMailItem.Display\n"+"		signature = objMailItem.HTMLBody\n"+"		\n"+"	'Set OutAccount = xOLApp.Session.Accounts(WScript.Arguments(0))\n"+"		\n"+"		objMailItem.SentOnBehalfOfName = WScript.Arguments(0)\n"+"	'objMailItem.SendUsingAccount = WScript.Arguments(0)\n"+"	'objMailItem.SendUsingAccount = OutAccount\n"+"	'objMailItem.SentOnBehalfOfName = OutAccount\n"+"		\n"+"		objMailItem.To = WScript.Arguments(1)\n"+"		if WScript.Arguments(2)<>\"None\" then\n"+"			objMailItem.CC = WScript.Arguments(2)\n"+"		end if\n"+"		objMailItem.Subject = WScript.Arguments(3)\n"+"	'objMailItem.HTMLBody = WScript.Arguments(4) & \"<br><br>\" & objMailItem.HTMLBody & \"</p>\"\n"+"		objMailItem.HTMLBody = \"<p><br>\" & WScript.Arguments(4) & \"<br>\" & signature & \"</p>\"\n"+"		objMailItem.Attachments.Add WScript.Arguments(5)\n"+"		if WScript.Arguments(6)<>\"\" then\n"+"			objMailItem.Attachments.Add WScript.Arguments(6)\n"+"		end if\n"+"	'objMailItem.Send\n"+"		Set xOLApp = Nothing\n"+"		Set objMailItem = Nothing\n"+"		If Err.Number = 0 Then\n"+"			objStdOut.Write \"Email enviado\"\n"+"			WScript.Quit (0)\n"+"		Else\n"+"			objStdErr.Write Err.Number & \" Srce: \" & Err.Source & \" Desc: \" &  Err.Description\n"+"			WScript.Quit (1)\n"+"		End If\n"+"			");
RDebugUtils.currentLine=15073348;
 //BA.debugLineNum = 15073348;BA.debugLine="File.WriteString(xui.DefaultFolder,\"smfpromc2.vbs";
__c.File.WriteString(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"smfpromc2.vbs",_svbscript);
RDebugUtils.currentLine=15073349;
 //BA.debugLineNum = 15073349;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _ejecutarvbsscriptdireccionesemailrepsol(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "ejecutarvbsscriptdireccionesemailrepsol", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "ejecutarvbsscriptdireccionesemailrepsol", null));}
ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL rsub = new ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL extends BA.ResumableSub {
public ResumableSub_EjecutarVBSScriptDireccionesEmailREPSOL(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="shl.Initialize(\"shl\", \"c:\\windows\\system32\\cscrip";
_shl.Initialize("shl","c:\\windows\\system32\\cscript.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"//nologo","smfpromc.vbs"}));
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="shl.WorkingDirectory = xui.DefaultFolder";
_shl.setWorkingDirectory(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder());
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "ejecutarvbsscriptdireccionesemailrepsol"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="frm.RootPane.MouseCursor=fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="Log(\"Success\")";
parent.__c.LogImpl("814876682","Success",0);
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("814876683",_stdout,0);
RDebugUtils.currentLine=14876684;
 //BA.debugLineNum = 14876684;BA.debugLine="mRes.Put(\"Success\",True)";
_mres.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="mRes.Put(\"StdOut\",StdOut)";
_mres.Put((Object)("StdOut"),(Object)(_stdout));
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="mRes.Put(\"StdErr\",StdErr)";
_mres.Put((Object)("StdErr"),(Object)(_stderr));
RDebugUtils.currentLine=14876687;
 //BA.debugLineNum = 14876687;BA.debugLine="mRes.Put(\"ExitCode\",ExitCode)";
_mres.Put((Object)("ExitCode"),(Object)(_exitcode));
RDebugUtils.currentLine=14876688;
 //BA.debugLineNum = 14876688;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=14876689;
 //BA.debugLineNum = 14876689;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fechasprometidascomprasarticulotalla(b4j.docU.cgestionventas __ref,String _art,String _talla) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "fechasprometidascomprasarticulotalla", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fechasprometidascomprasarticulotalla", new Object[] {_art,_talla}));}
ResumableSub_FechasPrometidasComprasArticuloTalla rsub = new ResumableSub_FechasPrometidasComprasArticuloTalla(this,__ref,_art,_talla);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FechasPrometidasComprasArticuloTalla extends BA.ResumableSub {
public ResumableSub_FechasPrometidasComprasArticuloTalla(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _art,String _talla) {
this.parent = parent;
this.__ref = __ref;
this._art = _art;
this._talla = _talla;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _art;
String _talla;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"FechasPromet";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"FechasPrometidasCompraArticuloTalla",new Object[]{(Object)(_art),(Object)(_talla)},parent);
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "fechasprometidascomprasarticulotalla"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14024713;
 //BA.debugLineNum = 14024713;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=14024714;
 //BA.debugLineNum = 14024714;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query FechasPrometidasCompraArticuloTalla ","Error");
RDebugUtils.currentLine=14024715;
 //BA.debugLineNum = 14024715;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "fechasprometidascomprasarticulotalla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=14024716;
 //BA.debugLineNum = 14024716;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=14024721;
 //BA.debugLineNum = 14024721;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=14024722;
 //BA.debugLineNum = 14024722;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de fecha prometidas para el artículo "+_art+" talla "+_talla+".","Aviso");
RDebugUtils.currentLine=14024723;
 //BA.debugLineNum = 14024723;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "fechasprometidascomprasarticulotalla"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=14024724;
 //BA.debugLineNum = 14024724;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=14024726;
 //BA.debugLineNum = 14024726;BA.debugLine="lstReg=mresult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=14024727;
 //BA.debugLineNum = 14024727;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
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
RDebugUtils.currentLine=14024730;
 //BA.debugLineNum = 14024730;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14024731;
 //BA.debugLineNum = 14024731;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=14024732;
 //BA.debugLineNum = 14024732;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=14024733;
 //BA.debugLineNum = 14024733;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=14024734;
 //BA.debugLineNum = 14024734;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=14024735;
 //BA.debugLineNum = 14024735;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cgestionventas __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="End Sub";
return "";
}
public void  _generarexcelprevisionsemanalventas(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "generarexcelprevisionsemanalventas", false))
	 {Debug.delegate(ba, "generarexcelprevisionsemanalventas", null); return;}
ResumableSub_GenerarExcelPrevisionSemanalVentas rsub = new ResumableSub_GenerarExcelPrevisionSemanalVentas(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_GenerarExcelPrevisionSemanalVentas extends BA.ResumableSub {
public ResumableSub_GenerarExcelPrevisionSemanalVentas(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
Object _msa = null;
int _result = 0;
b4j.docU.xlutils _xl = null;
b4j.docU.xlworkbookwriter _workbook = null;
b4j.docU.xlsheetwriter _sheet1 = null;
int _rint = 0;
String _dateformatant = "";
String _timeformatant = "";
String _timezoneant = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
int _idxcolfechadisponibilidad = 0;
int _idxcolfecharequerida = 0;
int _idxcollineapedidoabierto = 0;
int _numcolsrs = 0;
b4j.docU.xlstyle _headerstyle = null;
int _idxcol = 0;
int[] _columnwidth = null;
int _cw = 0;
b4j.docU.xlstyle _fechasstyle = null;
anywheresoftware.b4a.objects.collections.List _rowstyles = null;
int _idxfila = 0;
long _fechaprevventaslinea = 0L;
long _fechaprevventasdocumento = 0L;
String _aliascampo = "";
b4j.docU.jamtableview._campoorigendatosjamtableview _ctv = null;
long _ticks = 0L;
long _tickshora0 = 0L;
long _tickshora0fechaprevventaslinea = 0L;
int _weekisofechaprevisionventas = 0;
int _yearisoprevisionventas = 0;
long _tickshora0fechaprevventasdocumento = 0L;
int _lasttablerow1 = 0;
int _ultimafila = 0;
String _userdocfolder = "";
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
int _hora = 0;
int _minutos = 0;
int _segundos = 0;
String _filename = "";
String _f = "";
boolean _success = false;
int step32;
int limit32;
int step47;
int limit47;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Calcular P";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Calcular Previsión de Ventas?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 82;
return;
case 82:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="CalcularFechas=Result=xui.DialogResponse_Positive";
__ref._calcularfechas /*boolean*/  = _result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive;
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="If CalcularFechas=False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._calcularfechas /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"En la última";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"En la última actualización de la tabla no se actualizó la Fecha de Disponibilidad."+" Es necesario actualizar estas fechas para Generar Excel de Prevision Semanal Ventas.","Aviso");
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 83;
return;
case 83:
//C
this.state = 4;
;
RDebugUtils.currentLine=13631500;
 //BA.debugLineNum = 13631500;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=13631526;
 //BA.debugLineNum = 13631526;BA.debugLine="Dim xl As XLUtils";
_xl = new b4j.docU.xlutils();
RDebugUtils.currentLine=13631527;
 //BA.debugLineNum = 13631527;BA.debugLine="xl.Initialize";
_xl._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13631528;
 //BA.debugLineNum = 13631528;BA.debugLine="Dim Workbook As XLWorkbookWriter = xl.CreateWrite";
_workbook = _xl._createwriterblank /*b4j.docU.xlworkbookwriter*/ (null);
RDebugUtils.currentLine=13631529;
 //BA.debugLineNum = 13631529;BA.debugLine="Dim sheet1 As XLSheetWriter = Workbook.CreateShee";
_sheet1 = _workbook._createsheetwriterbyname /*b4j.docU.xlsheetwriter*/ (null,"Datos");
RDebugUtils.currentLine=13631538;
 //BA.debugLineNum = 13631538;BA.debugLine="If jamTableViewGestionVentas.NumeroTotalRegistros";
if (true) break;

case 5:
//if
this.state = 14;
if (__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getnumerototalregistros /*int*/ (null)!=__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getnumerototalregistrosfiltrados /*int*/ (null)) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=13631539;
 //BA.debugLineNum = 13631539;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"La tabla e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"La tabla está filtrada. El cálculo se realizará sobre los registros filtrados."+parent.__c.CRLF+parent.__c.CRLF+"¿Continuar?","Tabla filtrada","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=13631540;
 //BA.debugLineNum = 13631540;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 84;
return;
case 84:
//C
this.state = 8;
_rint = (int) result[1];
;
RDebugUtils.currentLine=13631541;
 //BA.debugLineNum = 13631541;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 8:
//if
this.state = 13;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=13631544;
 //BA.debugLineNum = 13631544;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=13631545;
 //BA.debugLineNum = 13631545;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
_timeformatant = parent.__c.DateTime.getTimeFormat();
RDebugUtils.currentLine=13631546;
 //BA.debugLineNum = 13631546;BA.debugLine="Dim TimeZoneAnt As String=DateTime.TimeZoneOffset";
_timezoneant = BA.NumberToString(parent.__c.DateTime.getTimeZoneOffset());
RDebugUtils.currentLine=13631547;
 //BA.debugLineNum = 13631547;BA.debugLine="DateTime.DateFormat=\"dd-MM-yy\"";
parent.__c.DateTime.setDateFormat("dd-MM-yy");
RDebugUtils.currentLine=13631548;
 //BA.debugLineNum = 13631548;BA.debugLine="DateTime.TimeFormat=\"HH.mm.ss\"";
parent.__c.DateTime.setTimeFormat("HH.mm.ss");
RDebugUtils.currentLine=13631551;
 //BA.debugLineNum = 13631551;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._estadolabelsalirjamtableview /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=13631552;
 //BA.debugLineNum = 13631552;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=13631553;
 //BA.debugLineNum = 13631553;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(F";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._habilitarjamtableview /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=13631555;
 //BA.debugLineNum = 13631555;BA.debugLine="Dim rs As ResultSet=jamTableViewGestionVentas.Get";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._gettableviewresultset /*anywheresoftware.b4j.objects.SQL.ResultSetWrapper*/ (null);
RDebugUtils.currentLine=13631556;
 //BA.debugLineNum = 13631556;BA.debugLine="Dim idxColFechaDisponibilidad As Int";
_idxcolfechadisponibilidad = 0;
RDebugUtils.currentLine=13631557;
 //BA.debugLineNum = 13631557;BA.debugLine="Dim idxColFechaRequerida As Int";
_idxcolfecharequerida = 0;
RDebugUtils.currentLine=13631558;
 //BA.debugLineNum = 13631558;BA.debugLine="Dim idxColLineaPedidoAbierto As Int";
_idxcollineapedidoabierto = 0;
RDebugUtils.currentLine=13631559;
 //BA.debugLineNum = 13631559;BA.debugLine="Dim NumColsRs As Int=rs.ColumnCount";
_numcolsrs = _rs.getColumnCount();
RDebugUtils.currentLine=13631560;
 //BA.debugLineNum = 13631560;BA.debugLine="Dim HeaderStyle As XLStyle=Workbook.CreateStyle.F";
_headerstyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null)._fontcolor /*b4j.docU.xlstyle*/ (null,(short) (12),(int) (_xl._color_white /*short*/ ))._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_dark_teal /*short*/ );
RDebugUtils.currentLine=13631562;
 //BA.debugLineNum = 13631562;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
if (true) break;

case 15:
//for
this.state = 36;
step32 = 1;
limit32 = (int) (_rs.getColumnCount()-1);
_idxcol = (int) (0) ;
this.state = 85;
if (true) break;

case 85:
//C
this.state = 36;
if ((step32 > 0 && _idxcol <= limit32) || (step32 < 0 && _idxcol >= limit32)) this.state = 17;
if (true) break;

case 86:
//C
this.state = 85;
_idxcol = ((int)(0 + _idxcol + step32)) ;
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=13631563;
 //BA.debugLineNum = 13631563;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0), rs.Ge";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,(int) (0)),_rs.GetColumnName(_idxcol))._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_headerstyle);
RDebugUtils.currentLine=13631564;
 //BA.debugLineNum = 13631564;BA.debugLine="If rs.GetColumnName(idxCol)=\"FechaDisponibilidad";
if (true) break;

case 18:
//if
this.state = 23;
if ((_rs.GetColumnName(_idxcol)).equals("FechaDisponibilidad")) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_idxcolfechadisponibilidad = _idxcol;
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=13631565;
 //BA.debugLineNum = 13631565;BA.debugLine="If rs.GetColumnName(idxCol)=\"FechaRequerida\" The";
if (true) break;

case 24:
//if
this.state = 29;
if ((_rs.GetColumnName(_idxcol)).equals("FechaRequerida")) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
_idxcolfecharequerida = _idxcol;
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=13631566;
 //BA.debugLineNum = 13631566;BA.debugLine="If rs.GetColumnName(idxCol)=\"PedidoAbierto\" Then";
if (true) break;

case 30:
//if
this.state = 35;
if ((_rs.GetColumnName(_idxcol)).equals("PedidoAbierto")) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
_idxcollineapedidoabierto = _idxcol;
if (true) break;

case 35:
//C
this.state = 86;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=13631569;
 //BA.debugLineNum = 13631569;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,0),\"Año-Se";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,(int) (0)),"Año-Semana Prev.Ventas Linea")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_headerstyle);
RDebugUtils.currentLine=13631571;
 //BA.debugLineNum = 13631571;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol+1,0),\"Año-";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (_idxcol+1),(int) (0)),"Año-Semana Prev.Ventas Documento")._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_headerstyle);
RDebugUtils.currentLine=13631573;
 //BA.debugLineNum = 13631573;BA.debugLine="Dim Columnwidth(idxCol+1),Cw As Int   ' variables";
_columnwidth = new int[(int) (_idxcol+1)];
;
_cw = 0;
RDebugUtils.currentLine=13631576;
 //BA.debugLineNum = 13631576;BA.debugLine="Dim FechasStyle As XLStyle = Workbook.CreateStyle";
_fechasstyle = _workbook._createstyle /*b4j.docU.xlstyle*/ (null)._dataformat /*b4j.docU.xlstyle*/ (null,("dd\"/\"mm\"/\"yyyy"));
RDebugUtils.currentLine=13631577;
 //BA.debugLineNum = 13631577;BA.debugLine="Dim RowStyles As List = Array(Workbook.CreateStyl";
_rowstyles = new anywheresoftware.b4a.objects.collections.List();
_rowstyles = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_orange /*short*/ )),(Object)(_workbook._createstyle /*b4j.docU.xlstyle*/ (null)._foregroundcolor /*b4j.docU.xlstyle*/ (null,_xl._color_white /*short*/ ))});
RDebugUtils.currentLine=13631578;
 //BA.debugLineNum = 13631578;BA.debugLine="Dim idxFila As Int=1";
_idxfila = (int) (1);
RDebugUtils.currentLine=13631586;
 //BA.debugLineNum = 13631586;BA.debugLine="Dim FechaPrevVentasLinea As Long";
_fechaprevventaslinea = 0L;
RDebugUtils.currentLine=13631587;
 //BA.debugLineNum = 13631587;BA.debugLine="Dim FechaPrevVentasdocumento As Long";
_fechaprevventasdocumento = 0L;
RDebugUtils.currentLine=13631589;
 //BA.debugLineNum = 13631589;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 37:
//do while
this.state = 71;
while (_rs.NextRow()) {
this.state = 39;
if (true) break;
}
if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=13631591;
 //BA.debugLineNum = 13631591;BA.debugLine="For idxCol=0 To rs.ColumnCount-1";
if (true) break;

case 40:
//for
this.state = 63;
step47 = 1;
limit47 = (int) (_rs.getColumnCount()-1);
_idxcol = (int) (0) ;
this.state = 87;
if (true) break;

case 87:
//C
this.state = 63;
if ((step47 > 0 && _idxcol <= limit47) || (step47 < 0 && _idxcol >= limit47)) this.state = 42;
if (true) break;

case 88:
//C
this.state = 87;
_idxcol = ((int)(0 + _idxcol + step47)) ;
if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=13631592;
 //BA.debugLineNum = 13631592;BA.debugLine="Dim AliasCampo As String=rs.GetColumnName(idxCo";
_aliascampo = _rs.GetColumnName(_idxcol);
RDebugUtils.currentLine=13631593;
 //BA.debugLineNum = 13631593;BA.debugLine="Dim cTV As CampoOrigenDatosJamTableView=jamTabl";
_ctv = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getdatoscampoorigendatosjamtableviewaliascampo /*b4j.docU.jamtableview._campoorigendatosjamtableview*/ (null,_aliascampo);
RDebugUtils.currentLine=13631594;
 //BA.debugLineNum = 13631594;BA.debugLine="Select cTV.TipoDato";
if (true) break;

case 43:
//select
this.state = 62;
switch (BA.switchObjectToInt(_ctv.TipoDato /*String*/ ,"INTEGER","REAL","TEXT")) {
case 0: {
this.state = 45;
if (true) break;
}
case 1: {
this.state = 47;
if (true) break;
}
case 2: {
this.state = 59;
if (true) break;
}
default: {
this.state = 61;
if (true) break;
}
}
if (true) break;

case 45:
//C
this.state = 62;
RDebugUtils.currentLine=13631597;
 //BA.debugLineNum = 13631597;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFil";
_sheet1._putnumber /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_rs.GetInt(_aliascampo));
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=13631599;
 //BA.debugLineNum = 13631599;BA.debugLine="If cTV.EsFecha Then";
if (true) break;

case 48:
//if
this.state = 57;
if (_ctv.EsFecha /*boolean*/ ) { 
this.state = 50;
}else {
this.state = 56;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=13631610;
 //BA.debugLineNum = 13631610;BA.debugLine="Dim ticks As Long = rs.GetLong(AliasCampo)";
_ticks = _rs.GetLong(_aliascampo);
RDebugUtils.currentLine=13631612;
 //BA.debugLineNum = 13631612;BA.debugLine="If ticks > 0 Then";
if (true) break;

case 51:
//if
this.state = 54;
if (_ticks>0) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=13631613;
 //BA.debugLineNum = 13631613;BA.debugLine="Dim TicksHora0 As Long=DateUtils.SetDate(Da";
_tickshora0 = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_ticks),parent.__c.DateTime.GetMonth(_ticks),parent.__c.DateTime.GetDayOfMonth(_ticks));
RDebugUtils.currentLine=13631615;
 //BA.debugLineNum = 13631615;BA.debugLine="sheet1.PutDate(xl.AddressZero(idxCol,idxFil";
_sheet1._putdate /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_tickshora0)._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_fechasstyle);
 if (true) break;

case 54:
//C
this.state = 57;
;
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=13631620;
 //BA.debugLineNum = 13631620;BA.debugLine="sheet1.PutNumber(xl.AddressZero(idxCol,idxFi";
_sheet1._putnumber /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),parent.__c.Round2(_rs.GetDouble(_aliascampo),(int) (2)));
 if (true) break;

case 57:
//C
this.state = 62;
;
 if (true) break;

case 59:
//C
this.state = 62;
RDebugUtils.currentLine=13631624;
 //BA.debugLineNum = 13631624;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,idxFil";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_rs.GetString(_aliascampo));
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=13631627;
 //BA.debugLineNum = 13631627;BA.debugLine="sheet1.PutString(xl.AddressZero(idxCol,idxFil";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_idxcol,_idxfila),_rs.GetString(_aliascampo));
 if (true) break;

case 62:
//C
this.state = 88;
;
 if (true) break;
if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=13631647;
 //BA.debugLineNum = 13631647;BA.debugLine="FechaPrevVentasLinea=rs.GetLong(\"FechaPrevVentas";
_fechaprevventaslinea = _rs.GetLong("FechaPrevVentasLinea");
RDebugUtils.currentLine=13631649;
 //BA.debugLineNum = 13631649;BA.debugLine="FechaPrevVentasdocumento=rs.GetLong(\"FechaPrevVe";
_fechaprevventasdocumento = _rs.GetLong("FechaPrevVentasdocumento");
RDebugUtils.currentLine=13631652;
 //BA.debugLineNum = 13631652;BA.debugLine="If FechaPrevVentasLinea>0 Then";
if (true) break;

case 64:
//if
this.state = 67;
if (_fechaprevventaslinea>0) { 
this.state = 66;
}if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=13631653;
 //BA.debugLineNum = 13631653;BA.debugLine="Dim TicksHora0FechaPrevVentasLinea As Long=Date";
_tickshora0fechaprevventaslinea = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_fechaprevventaslinea),parent.__c.DateTime.GetMonth(_fechaprevventaslinea),parent.__c.DateTime.GetDayOfMonth(_fechaprevventaslinea));
RDebugUtils.currentLine=13631654;
 //BA.debugLineNum = 13631654;BA.debugLine="Cal.InitializeWith(TicksHora0FechaPrevVentasLin";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .InitializeWith(_tickshora0fechaprevventaslinea);
RDebugUtils.currentLine=13631655;
 //BA.debugLineNum = 13631655;BA.debugLine="Cal.MinimalDaysInFirstWeek=4";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .setMinimalDaysInFirstWeek((int) (4));
RDebugUtils.currentLine=13631656;
 //BA.debugLineNum = 13631656;BA.debugLine="Cal.FirstDayOfWeek=Cal.MONDAY";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .setFirstDayOfWeek(__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .MONDAY);
RDebugUtils.currentLine=13631657;
 //BA.debugLineNum = 13631657;BA.debugLine="Cal.toString";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .toString();
RDebugUtils.currentLine=13631658;
 //BA.debugLineNum = 13631658;BA.debugLine="Dim WeekISOFechaPrevisionVentas As Int= Cal.Get";
_weekisofechaprevisionventas = __ref._cal /*flm.b4j.calendar.b4jCalendar*/ .Get(__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .WEEK_OF_YEAR);
RDebugUtils.currentLine=13631659;
 //BA.debugLineNum = 13631659;BA.debugLine="Dim YearISOPrevisionVentas As Int=Cal.WeekYear";
_yearisoprevisionventas = __ref._cal /*flm.b4j.calendar.b4jCalendar*/ .getWeekYear();
RDebugUtils.currentLine=13631660;
 //BA.debugLineNum = 13631660;BA.debugLine="sheet1.PutString(xl.AddressZero(NumColsRs,idxFi";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_numcolsrs,_idxfila),BA.NumberToString(_yearisoprevisionventas)+"-"+parent.__c.NumberFormat2(_weekisofechaprevisionventas,(int) (2),(int) (0),(int) (0),parent.__c.False))._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_fechasstyle);
 if (true) break;
;
RDebugUtils.currentLine=13631665;
 //BA.debugLineNum = 13631665;BA.debugLine="If FechaPrevVentasdocumento>0 Then";

case 67:
//if
this.state = 70;
if (_fechaprevventasdocumento>0) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=13631666;
 //BA.debugLineNum = 13631666;BA.debugLine="Dim TicksHora0FechaPrevVentasDocumento As Long=";
_tickshora0fechaprevventasdocumento = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_fechaprevventasdocumento),parent.__c.DateTime.GetMonth(_fechaprevventasdocumento),parent.__c.DateTime.GetDayOfMonth(_fechaprevventasdocumento));
RDebugUtils.currentLine=13631667;
 //BA.debugLineNum = 13631667;BA.debugLine="Cal.InitializeWith(TicksHora0FechaPrevVentasDoc";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .InitializeWith(_tickshora0fechaprevventasdocumento);
RDebugUtils.currentLine=13631668;
 //BA.debugLineNum = 13631668;BA.debugLine="Cal.MinimalDaysInFirstWeek=4";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .setMinimalDaysInFirstWeek((int) (4));
RDebugUtils.currentLine=13631669;
 //BA.debugLineNum = 13631669;BA.debugLine="Cal.FirstDayOfWeek=Cal.MONDAY";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .setFirstDayOfWeek(__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .MONDAY);
RDebugUtils.currentLine=13631670;
 //BA.debugLineNum = 13631670;BA.debugLine="Cal.toString";
__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .toString();
RDebugUtils.currentLine=13631671;
 //BA.debugLineNum = 13631671;BA.debugLine="Dim WeekISOFechaPrevisionVentas As Int= Cal.Get";
_weekisofechaprevisionventas = __ref._cal /*flm.b4j.calendar.b4jCalendar*/ .Get(__ref._cal /*flm.b4j.calendar.b4jCalendar*/ .WEEK_OF_YEAR);
RDebugUtils.currentLine=13631672;
 //BA.debugLineNum = 13631672;BA.debugLine="Dim YearISOPrevisionVentas As Int=Cal.WeekYear";
_yearisoprevisionventas = __ref._cal /*flm.b4j.calendar.b4jCalendar*/ .getWeekYear();
RDebugUtils.currentLine=13631673;
 //BA.debugLineNum = 13631673;BA.debugLine="sheet1.PutString(xl.AddressZero(NumColsRs+1,idx";
_sheet1._putstring /*b4j.docU.xlsheetwriter*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (_numcolsrs+1),_idxfila),BA.NumberToString(_yearisoprevisionventas)+"-"+parent.__c.NumberFormat2(_weekisofechaprevisionventas,(int) (2),(int) (0),(int) (0),parent.__c.False))._setstyle /*b4j.docU.xlsheetwriter*/ (null,_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ ,_fechasstyle);
 if (true) break;

case 70:
//C
this.state = 37;
;
RDebugUtils.currentLine=13631717;
 //BA.debugLineNum = 13631717;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTable";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Procesando Fila "+BA.NumberToString(_idxfila)));
RDebugUtils.currentLine=13631718;
 //BA.debugLineNum = 13631718;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"),(int) (0));
this.state = 89;
return;
case 89:
//C
this.state = 37;
;
RDebugUtils.currentLine=13631719;
 //BA.debugLineNum = 13631719;BA.debugLine="idxFila=idxFila+1";
_idxfila = (int) (_idxfila+1);
 if (true) break;

case 71:
//C
this.state = 72;
;
RDebugUtils.currentLine=13631723;
 //BA.debugLineNum = 13631723;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=13631760;
 //BA.debugLineNum = 13631760;BA.debugLine="Dim LastTableRow1 As Int = sheet1.LastAccessed.Ro";
_lasttablerow1 = (int) (_sheet1._lastaccessed /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ +1);
RDebugUtils.currentLine=13631763;
 //BA.debugLineNum = 13631763;BA.debugLine="Dim UltimaFila As Int=idxFila";
_ultimafila = _idxfila;
RDebugUtils.currentLine=13631764;
 //BA.debugLineNum = 13631764;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTableV";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Generando fichero excel..."));
RDebugUtils.currentLine=13631765;
 //BA.debugLineNum = 13631765;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"),(int) (0));
this.state = 90;
return;
case 90:
//C
this.state = 72;
;
RDebugUtils.currentLine=13631789;
 //BA.debugLineNum = 13631789;BA.debugLine="sheet1.SetAutoFilter(xl.CreateXLRange(xl.AddressZ";
_sheet1._setautofilter /*b4j.docU.xlsheetwriter*/ (null,_xl._createxlrange /*b4j.docU.xlutils._xlrange*/ (null,_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (0),(int) (0)),_xl._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int) (_numcolsrs+1),_ultimafila)));
RDebugUtils.currentLine=13631814;
 //BA.debugLineNum = 13631814;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=13631815;
 //BA.debugLineNum = 13631815;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._estadolabelsalirjamtableview /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=13631816;
 //BA.debugLineNum = 13631816;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(T";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._habilitarjamtableview /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=13631818;
 //BA.debugLineNum = 13631818;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTableV";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)(""));
RDebugUtils.currentLine=13631822;
 //BA.debugLineNum = 13631822;BA.debugLine="Dim UserDocFolder As String=jamTableViewGestionVe";
_userdocfolder = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._finduserdocumentsfolder /*String*/ (null);
RDebugUtils.currentLine=13631823;
 //BA.debugLineNum = 13631823;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=13631824;
 //BA.debugLineNum = 13631824;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=13631825;
 //BA.debugLineNum = 13631825;BA.debugLine="fc.Title=\"Exportación Excel\"";
_fc.setTitle("Exportación Excel");
RDebugUtils.currentLine=13631826;
 //BA.debugLineNum = 13631826;BA.debugLine="fc.SetExtensionFilter(\"Ficheros Excel\", Array As";
_fc.SetExtensionFilter("Ficheros Excel",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.xlsx","*.xlsm","*.xls"}));
RDebugUtils.currentLine=13631827;
 //BA.debugLineNum = 13631827;BA.debugLine="Dim Hora As Int=DateTime.GetHour(DateTime.Now)";
_hora = parent.__c.DateTime.GetHour(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=13631828;
 //BA.debugLineNum = 13631828;BA.debugLine="Dim Minutos As Int=DateTime.GetMinute(DateTime.No";
_minutos = parent.__c.DateTime.GetMinute(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=13631829;
 //BA.debugLineNum = 13631829;BA.debugLine="Dim Segundos As Int=DateTime.GetMinute(DateTime.N";
_segundos = parent.__c.DateTime.GetMinute(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=13631830;
 //BA.debugLineNum = 13631830;BA.debugLine="fc.InitialFileName= \"Prevision Semanal Ventas \" &";
_fc.setInitialFileName("Prevision Semanal Ventas "+parent.__c.DateTime.Date(parent.__c.DateTime.getNow())+" "+BA.NumberToString(_hora)+"h"+BA.NumberToString(_minutos)+"m"+BA.NumberToString(_segundos)+"s"+".xlsx");
RDebugUtils.currentLine=13631831;
 //BA.debugLineNum = 13631831;BA.debugLine="fc.InitialDirectory=UserDocFolder";
_fc.setInitialDirectory(_userdocfolder);
RDebugUtils.currentLine=13631832;
 //BA.debugLineNum = 13631832;BA.debugLine="Dim fileName As String = fc.ShowSave(frm)";
_filename = _fc.ShowSave(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=13631833;
 //BA.debugLineNum = 13631833;BA.debugLine="If fileName=\"\" Then Return";
if (true) break;

case 72:
//if
this.state = 77;
if ((_filename).equals("")) { 
this.state = 74;
;}if (true) break;

case 74:
//C
this.state = 77;
if (true) return ;
if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=13631835;
 //BA.debugLineNum = 13631835;BA.debugLine="Dim f As String = Workbook.SaveAs(File.GetFilePar";
_f = _workbook._saveas /*String*/ (null,parent.__c.File.GetFileParent(_filename),parent.__c.File.GetName(_filename),parent.__c.True);
RDebugUtils.currentLine=13631836;
 //BA.debugLineNum = 13631836;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=13631837;
 //BA.debugLineNum = 13631837;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
parent.__c.DateTime.setTimeFormat(_timeformatant);
RDebugUtils.currentLine=13631838;
 //BA.debugLineNum = 13631838;BA.debugLine="Wait For (xl.OpenExcel(f)) Complete (Success As B";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _xl._openexcel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_f));
this.state = 91;
return;
case 91:
//C
this.state = 78;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=13631839;
 //BA.debugLineNum = 13631839;BA.debugLine="If Success=False Then";
if (true) break;

case 78:
//if
this.state = 81;
if (_success==parent.__c.False) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=13631840;
 //BA.debugLineNum = 13631840;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir el fichero excel "+_f,"Error");
RDebugUtils.currentLine=13631841;
 //BA.debugLineNum = 13631841;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "generarexcelprevisionsemanalventas"), _msa);
this.state = 92;
return;
case 92:
//C
this.state = 81;
;
RDebugUtils.currentLine=13631842;
 //BA.debugLineNum = 13631842;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 81:
//C
this.state = -1;
;
RDebugUtils.currentLine=13631845;
 //BA.debugLineNum = 13631845;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _generatestring(b4j.docU.cgestionventas __ref,anywheresoftware.b4a.objects.collections.List _table,String _separatorchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "generatestring", false))
	 {return ((String) Debug.delegate(ba, "generatestring", new Object[] {_table,_separatorchar}));}
String _eol = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String[] _row = null;
int _i = 0;
boolean _wrap = false;
String _word = "";
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub GenerateString (Table As List, SeparatorChar A";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim eol As String = Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="If Table.Size = 0 Then Return \"\"";
if (_table.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="For Each row() As String In Table";
{
final anywheresoftware.b4a.BA.IterableList group5 = _table;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_row = (String[])(group5.Get(index5));
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="For i = 0 To row.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_row.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="Dim Wrap As Boolean";
_wrap = false;
RDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="Dim word As String = row(i)";
_word = _row[_i];
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="If word.Contains(SeparatorChar) Then Wrap = Tru";
if (_word.contains(_separatorchar)) { 
_wrap = __c.True;};
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="If word.Contains(QUOTE) Then";
if (_word.contains(__c.QUOTE)) { 
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="Wrap = True";
_wrap = __c.True;
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="word = word.Replace(QUOTE, $\"\"\"\"$)";
_word = _word.replace(__c.QUOTE,("\"\""));
 };
RDebugUtils.currentLine=14614542;
 //BA.debugLineNum = 14614542;BA.debugLine="If Wrap Then";
if (_wrap) { 
RDebugUtils.currentLine=14614543;
 //BA.debugLineNum = 14614543;BA.debugLine="sb.Append(QUOTE).Append(word).Append(QUOTE)";
_sb.Append(__c.QUOTE).Append(_word).Append(__c.QUOTE);
 }else {
RDebugUtils.currentLine=14614545;
 //BA.debugLineNum = 14614545;BA.debugLine="sb.Append(word)";
_sb.Append(_word);
 };
RDebugUtils.currentLine=14614547;
 //BA.debugLineNum = 14614547;BA.debugLine="sb.Append(SeparatorChar)";
_sb.Append(_separatorchar);
 }
};
RDebugUtils.currentLine=14614549;
 //BA.debugLineNum = 14614549;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=14614550;
 //BA.debugLineNum = 14614550;BA.debugLine="sb.Append(eol)";
_sb.Append(_eol);
 }
};
RDebugUtils.currentLine=14614552;
 //BA.debugLineNum = 14614552;BA.debugLine="sb.Remove(sb.Length - eol.Length, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_eol.length()),_sb.getLength());
RDebugUtils.currentLine=14614553;
 //BA.debugLineNum = 14614553;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=14614554;
 //BA.debugLineNum = 14614554;BA.debugLine="End Sub";
return "";
}
public String  _inicio(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "inicio", false))
	 {return ((String) Debug.delegate(ba, "inicio", null));}
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub Inicio";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Utilidades.SetFormMaximized(frm)";
_utilidades._setformmaximized /*String*/ (__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="ResfreshDatosGestionVentas";
__ref._resfreshdatosgestionventas /*void*/ (null);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="End Sub";
return "";
}
public void  _resfreshdatosgestionventas(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "resfreshdatosgestionventas", false))
	 {Debug.delegate(ba, "resfreshdatosgestionventas", null); return;}
ResumableSub_ResfreshDatosGestionVentas rsub = new ResumableSub_ResfreshDatosGestionVentas(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ResfreshDatosGestionVentas extends BA.ResumableSub {
public ResumableSub_ResfreshDatosGestionVentas(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
Object _msa = null;
int _result = 0;
String _accion = "";
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdata = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._estadolabelsalirjamtableview /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Calcular d";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Calcular datos de fechas estimadas?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 24;
return;
case 24:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="CalcularFechas=Result=xui.DialogResponse_Positive";
__ref._calcularfechas /*boolean*/  = _result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive;
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Plaz";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcolumnavisible /*String*/ (null,"PlazoTeoricoFabLinea",__ref._calcularfechas /*boolean*/ );
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcolumnavisible /*String*/ (null,"FechaTeoricaEntrega",__ref._calcularfechas /*boolean*/ );
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcolumnavisible /*String*/ (null,"FechaDisponibilidad",__ref._calcularfechas /*boolean*/ );
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcolumnavisible /*String*/ (null,"FechaPrevVentasLinea",__ref._calcularfechas /*boolean*/ );
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcolumnavisible /*String*/ (null,"FechaPrevVentasLineaVencida",__ref._calcularfechas /*boolean*/ );
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="jamTableViewGestionVentas.SetColumnaVisible(\"Fech";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcolumnavisible /*String*/ (null,"FechaPrevVentasDocumento",__ref._calcularfechas /*boolean*/ );
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="If mSQLGestionventas.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12845072;
 //BA.debugLineNum = 12845072;BA.debugLine="mSQLGestionventas.Close";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .Close();
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=12845075;
 //BA.debugLineNum = 12845075;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(F";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._habilitarjamtableview /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="mSQLGestionventas.InitializeSQLite(xui.DefaultFol";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=12845078;
 //BA.debugLineNum = 12845078;BA.debugLine="CrearTablasSQLite";
__ref._creartablassqlite /*String*/ (null);
RDebugUtils.currentLine=12845080;
 //BA.debugLineNum = 12845080;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=12845081;
 //BA.debugLineNum = 12845081;BA.debugLine="wait for(ActualizacionDatos) complete (Accion As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "resfreshdatosgestionventas"), __ref._actualizaciondatos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 25;
return;
case 25:
//C
this.state = 5;
_accion = (String) result[1];
;
RDebugUtils.currentLine=12845084;
 //BA.debugLineNum = 12845084;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=12845085;
 //BA.debugLineNum = 12845085;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_accion).equals("Salir")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=12845086;
 //BA.debugLineNum = 12845086;BA.debugLine="MainMenu2.Show";
parent._mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=12845087;
 //BA.debugLineNum = 12845087;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=12845089;
 //BA.debugLineNum = 12845089;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=12845092;
 //BA.debugLineNum = 12845092;BA.debugLine="Dim cF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=12845093;
 //BA.debugLineNum = 12845093;BA.debugLine="cF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=12845094;
 //BA.debugLineNum = 12845094;BA.debugLine="cF.AliasCampoColumna=\"QtyDisponibleAcum\"";
_cf.AliasCampoColumna /*String*/  = "QtyDisponibleAcum";
RDebugUtils.currentLine=12845095;
 //BA.debugLineNum = 12845095;BA.debugLine="cF.NombreFuncionCellFactory=jamTableViewGestionVe";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._cellfactory_colorvalormenorcolorvalormayorigualcolumna /*String*/ ;
RDebugUtils.currentLine=12845097;
 //BA.debugLineNum = 12845097;BA.debugLine="cF.CellFactoryEnCallBack=True";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=12845098;
 //BA.debugLineNum = 12845098;BA.debugLine="cF.params=Array(0,\"Red\",\"Green\",\"#,##0.##\")";
_cf.params /*Object[]*/  = new Object[]{(Object)(0),(Object)("Red"),(Object)("Green"),(Object)("#,##0.##")};
RDebugUtils.currentLine=12845108;
 //BA.debugLineNum = 12845108;BA.debugLine="jamTableViewGestionVentas.SetCellFactory(cF)";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cf);
RDebugUtils.currentLine=12845110;
 //BA.debugLineNum = 12845110;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT));
RDebugUtils.currentLine=12845111;
 //BA.debugLineNum = 12845111;BA.debugLine="Dim rsData As ResultSet=mSQLGestionventas.ExecQue";
_rsdata = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdata = __ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblGestionVentas");
RDebugUtils.currentLine=12845112;
 //BA.debugLineNum = 12845112;BA.debugLine="Dim rSub As ResumableSub=jamTableViewGestionVenta";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdata.getObject()));
RDebugUtils.currentLine=12845113;
 //BA.debugLineNum = 12845113;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "resfreshdatosgestionventas"), _rsub);
this.state = 26;
return;
case 26:
//C
this.state = 9;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12845114;
 //BA.debugLineNum = 12845114;BA.debugLine="jamTableViewGestionVentas.SetMouseCursor(fx.Curso";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._setmousecursor /*String*/ (null,(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT));
RDebugUtils.currentLine=12845115;
 //BA.debugLineNum = 12845115;BA.debugLine="rsData.Close";
_rsdata.Close();
RDebugUtils.currentLine=12845116;
 //BA.debugLineNum = 12845116;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("812845116",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=12845118;
 //BA.debugLineNum = 12845118;BA.debugLine="jamTableViewGestionVentas.EstadoLabelSalirJamTabl";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._estadolabelsalirjamtableview /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=12845119;
 //BA.debugLineNum = 12845119;BA.debugLine="jamTableViewGestionVentas.HabilitarJamTableView(T";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._habilitarjamtableview /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=12845120;
 //BA.debugLineNum = 12845120;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 23;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=12845121;
 //BA.debugLineNum = 12845121;BA.debugLine="If \"\"<>mRes.Get(\"msgAviso\") Then";
if (true) break;

case 12:
//if
this.state = 15;
if (("").equals(BA.ObjectToString(_mres.Get((Object)("msgAviso")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=12845122;
 //BA.debugLineNum = 12845122;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=12845123;
 //BA.debugLineNum = 12845123;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 15;
;
 if (true) break;
;
RDebugUtils.currentLine=12845125;
 //BA.debugLineNum = 12845125;BA.debugLine="If \"\"<>mRes.Get(\"msgError\") Then";

case 15:
//if
this.state = 22;
if (("").equals(BA.ObjectToString(_mres.Get((Object)("msgError")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=12845126;
 //BA.debugLineNum = 12845126;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=12845127;
 //BA.debugLineNum = 12845127;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 18;
;
RDebugUtils.currentLine=12845129;
 //BA.debugLineNum = 12845129;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=12845130;
 //BA.debugLineNum = 12845130;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "resfreshdatosgestionventas"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 18;
_rint = (int) result[1];
;
RDebugUtils.currentLine=12845131;
 //BA.debugLineNum = 12845131;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=12845132;
 //BA.debugLineNum = 12845132;BA.debugLine="jamTableViewGestionVentas.AbrirCamposBuilder";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=12845133;
 //BA.debugLineNum = 12845133;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=12845137;
 //BA.debugLineNum = 12845137;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=12845141;
 //BA.debugLineNum = 12845141;BA.debugLine="mSQLGestionventas.close";
__ref._msqlgestionventas /*anywheresoftware.b4j.objects.SQL*/ .Close();
RDebugUtils.currentLine=12845143;
 //BA.debugLineNum = 12845143;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableviewgestionventas_accionsalirjamtableview(b4j.docU.cgestionventas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "jamtableviewgestionventas_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewgestionventas_accionsalirjamtableview", null));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub jamTableViewGestionVentas_AccionSalirJamTableV";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="jamTableViewGestionVentas.GuardarConfiguracionCol";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="jamTableViewGestionVentas.LimpiarTabla";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="End Sub";
return "";
}
public String  _jamtableviewgestionventas_cambioenfilaseleccionada(b4j.docU.cgestionventas __ref,anywheresoftware.b4a.objects.collections.List _lstdatosfilaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "jamtableviewgestionventas_cambioenfilaseleccionada", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewgestionventas_cambioenfilaseleccionada", new Object[] {_lstdatosfilaseleccionada}));}
String _stexto = "";
String _doc = "";
int _linea = 0;
String _cliente = "";
String _nombrecliente = "";
String _tipoartcomprafab = "";
b4j.docU.jamtableview._datoscamporegistrojamtableview _dc = null;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub jamTableViewGestionVentas_CambioEnFilaSeleccio";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Dim STexto As String";
_stexto = "";
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Dim Doc As String";
_doc = "";
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Dim Linea As Int";
_linea = 0;
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Dim Cliente As String";
_cliente = "";
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Dim NombreCliente As String";
_nombrecliente = "";
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Dim TipoArtCompraFab As String";
_tipoartcomprafab = "";
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="For Each dC As DatosCampoRegistroJamTableView In";
{
final anywheresoftware.b4a.BA.IterableList group7 = _lstdatosfilaseleccionada;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_dc = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group7.Get(index7));
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="If dC.AliasCampo=\"Documento\" Then";
if ((_dc.AliasCampo /*String*/ ).equals("Documento")) { 
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="Doc=dC.ValorCampo";
_doc = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
 };
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="If dC.AliasCampo=\"Linea\" Then";
if ((_dc.AliasCampo /*String*/ ).equals("Linea")) { 
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="Linea=dC.ValorCampo";
_linea = (int)(BA.ObjectToNumber(_dc.ValorCampo /*Object*/ ));
 };
RDebugUtils.currentLine=13893646;
 //BA.debugLineNum = 13893646;BA.debugLine="If dC.AliasCampo=\"Cliente\" Then";
if ((_dc.AliasCampo /*String*/ ).equals("Cliente")) { 
RDebugUtils.currentLine=13893647;
 //BA.debugLineNum = 13893647;BA.debugLine="Cliente=dC.ValorCampo";
_cliente = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
 };
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="If dC.AliasCampo=\"NombreCliente\" Then";
if ((_dc.AliasCampo /*String*/ ).equals("NombreCliente")) { 
RDebugUtils.currentLine=13893650;
 //BA.debugLineNum = 13893650;BA.debugLine="NombreCliente=dC.ValorCampo";
_nombrecliente = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
 };
RDebugUtils.currentLine=13893652;
 //BA.debugLineNum = 13893652;BA.debugLine="If dC.AliasCampo=\"Fabricacion\" Then";
if ((_dc.AliasCampo /*String*/ ).equals("Fabricacion")) { 
RDebugUtils.currentLine=13893653;
 //BA.debugLineNum = 13893653;BA.debugLine="If 0=dC.ValorCampo Then";
if (0==(double)(BA.ObjectToNumber(_dc.ValorCampo /*Object*/ ))) { 
RDebugUtils.currentLine=13893654;
 //BA.debugLineNum = 13893654;BA.debugLine="TipoArtCompraFab=\"Compra\"";
_tipoartcomprafab = "Compra";
 }else {
RDebugUtils.currentLine=13893656;
 //BA.debugLineNum = 13893656;BA.debugLine="TipoArtCompraFab=\"Fabricación\"";
_tipoartcomprafab = "Fabricación";
 };
 };
 }
};
RDebugUtils.currentLine=13893662;
 //BA.debugLineNum = 13893662;BA.debugLine="STexto=\"Documento: \" & Doc & \" Línea: \" & Linea &";
_stexto = "Documento: "+_doc+" Línea: "+BA.NumberToString(_linea)+" Cliente: "+_cliente+" "+_nombrecliente+" Tipo Art: "+_tipoartcomprafab;
RDebugUtils.currentLine=13893663;
 //BA.debugLineNum = 13893663;BA.debugLine="jamTableViewGestionVentas.TextoPanelInfoJamTableV";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)(_stexto));
RDebugUtils.currentLine=13893664;
 //BA.debugLineNum = 13893664;BA.debugLine="End Sub";
return "";
}
public void  _jamtableviewgestionventas_contextmenuitem_action(b4j.docU.cgestionventas __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "jamtableviewgestionventas_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewgestionventas_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action rsub = new ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewGestionVentas_ContextMenuItem_Action(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _tagmenuitem;
String _pedidosel = "";
int _filaseleccionada = 0;
Object _pobj = null;
Object _msa = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
String _articulosel = "";
anywheresoftware.b4a.objects.collections.List _lstinfofila = null;
b4j.docU.jamtableview._datoscamporegistrojamtableview _dc = null;
String _tallasel = "";
int _sistrepoarticulosel = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _dateformatant = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _mf = null;
String _docfp = "";
double _qtypterecfp = 0;
String _sqtypterecfp = "";
long _fechapromfp = 0L;
b4j.docU.b4xlongtexttemplate _b4xlongmsg = null;
int _rint = 0;
String _sres = "";
String _clientesel = "";
String _grpsel = "";
anywheresoftware.b4a.objects.collections.List _lstalbaranespedido = null;
anywheresoftware.b4a.objects.collections.Map _mdataalb = null;
String _salb = "";
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
String _sdocumentosel = "";
anywheresoftware.b4a.objects.collections.Map _malbaransel = null;
String _albaransel = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.BA.IterableList group28;
int index28;
int groupLen28;
anywheresoftware.b4a.BA.IterableList group67;
int index67;
int groupLen67;
anywheresoftware.b4a.BA.IterableList group124;
int index124;
int groupLen124;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Select TagMenuItem";
if (true) break;

case 1:
//select
this.state = 108;
switch (BA.switchObjectToInt(_tagmenuitem,"VerPedidoNAV","VerArticuloNAV","VerFechasPrometidasCompraArticuloNAV","EnviarEmailAlbaranTransnaturREPSOL")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 22;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
case 3: {
this.state = 67;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="Dim PedidoSel As String";
_pedidosel = "";
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="Dim pObj As Object=jamTableViewGestionVentas.Ge";
_pobj = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Documento");
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="PedidoSel=jamTableViewGestionVentas.FixNull(pOb";
_pedidosel = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._fixnull /*String*/ (null,_pobj);
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="If PedidoSel=\"\" Then";
if (true) break;

case 4:
//if
this.state = 7;
if ((_pedidosel).equals("")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Documento.","Error");
RDebugUtils.currentLine=13697042;
 //BA.debugLineNum = 13697042;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 109;
return;
case 109:
//C
this.state = 7;
;
RDebugUtils.currentLine=13697043;
 //BA.debugLineNum = 13697043;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=13697082;
 //BA.debugLineNum = 13697082;BA.debugLine="Select True";

case 7:
//select
this.state = 14;
switch (BA.switchObjectToInt(parent.__c.True,_pedidosel.startsWith("PV"),_pedidosel.startsWith("PT"))) {
case 0: {
this.state = 9;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
default: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 9:
//C
this.state = 14;
RDebugUtils.currentLine=13697084;
 //BA.debugLineNum = 13697084;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.Abri";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Pedido venta",(int) (42),"No.",_pedidosel);
 if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=13697086;
 //BA.debugLineNum = 13697086;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.Abri";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Pedido venta",(int) (5740),"No.",_pedidosel);
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=13697088;
 //BA.debugLineNum = 13697088;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=13697090;
 //BA.debugLineNum = 13697090;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 110;
return;
case 110:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=13697091;
 //BA.debugLineNum = 13697091;BA.debugLine="If success Then";
if (true) break;

case 15:
//if
this.state = 20;
if (_success) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
 if (true) break;

case 19:
//C
this.state = 20;
 if (true) break;

case 20:
//C
this.state = 108;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=13697098;
 //BA.debugLineNum = 13697098;BA.debugLine="Dim ArticuloSel As String";
_articulosel = "";
RDebugUtils.currentLine=13697099;
 //BA.debugLineNum = 13697099;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=13697100;
 //BA.debugLineNum = 13697100;BA.debugLine="Dim lstInfoFila As List=jamTableViewGestionVent";
_lstinfofila = new anywheresoftware.b4a.objects.collections.List();
_lstinfofila = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._datosregistroindicefila /*anywheresoftware.b4a.objects.collections.List*/ (null,_filaseleccionada);
RDebugUtils.currentLine=13697101;
 //BA.debugLineNum = 13697101;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
if (true) break;

case 23:
//for
this.state = 30;
group28 = _lstinfofila;
index28 = 0;
groupLen28 = group28.getSize();
this.state = 111;
if (true) break;

case 111:
//C
this.state = 30;
if (index28 < groupLen28) {
this.state = 25;
_dc = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group28.Get(index28));}
if (true) break;

case 112:
//C
this.state = 111;
index28++;
if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=13697102;
 //BA.debugLineNum = 13697102;BA.debugLine="If dc.Campo=\"Articulo\" Then";
if (true) break;

case 26:
//if
this.state = 29;
if ((_dc.Campo /*String*/ ).equals("Articulo")) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=13697103;
 //BA.debugLineNum = 13697103;BA.debugLine="ArticuloSel=dc.ValorCampo";
_articulosel = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
RDebugUtils.currentLine=13697104;
 //BA.debugLineNum = 13697104;BA.debugLine="Exit";
this.state = 30;
if (true) break;
 if (true) break;

case 29:
//C
this.state = 112;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=13697107;
 //BA.debugLineNum = 13697107;BA.debugLine="If ArticuloSel=\"\" Then";

case 30:
//if
this.state = 33;
if ((_articulosel).equals("")) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=13697108;
 //BA.debugLineNum = 13697108;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Artículo.","Error");
RDebugUtils.currentLine=13697109;
 //BA.debugLineNum = 13697109;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 113;
return;
case 113:
//C
this.state = 33;
;
RDebugUtils.currentLine=13697110;
 //BA.debugLineNum = 13697110;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=13697112;
 //BA.debugLineNum = 13697112;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Ficha producto",(int) (30),"No.",_articulosel);
RDebugUtils.currentLine=13697113;
 //BA.debugLineNum = 13697113;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 114;
return;
case 114:
//C
this.state = 34;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=13697114;
 //BA.debugLineNum = 13697114;BA.debugLine="If success Then";
if (true) break;

case 34:
//if
this.state = 39;
if (_success) { 
this.state = 36;
}else {
this.state = 38;
}if (true) break;

case 36:
//C
this.state = 39;
 if (true) break;

case 38:
//C
this.state = 39;
 if (true) break;

case 39:
//C
this.state = 108;
;
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=13697121;
 //BA.debugLineNum = 13697121;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=13697129;
 //BA.debugLineNum = 13697129;BA.debugLine="Dim ArticuloSel As String=jamTableViewGestionVe";
_articulosel = BA.ObjectToString(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Articulo"));
RDebugUtils.currentLine=13697130;
 //BA.debugLineNum = 13697130;BA.debugLine="If ArticuloSel=\"\" Then";
if (true) break;

case 42:
//if
this.state = 45;
if ((_articulosel).equals("")) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=13697131;
 //BA.debugLineNum = 13697131;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Artículo.","Error");
RDebugUtils.currentLine=13697132;
 //BA.debugLineNum = 13697132;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 115;
return;
case 115:
//C
this.state = 45;
;
RDebugUtils.currentLine=13697133;
 //BA.debugLineNum = 13697133;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=13697136;
 //BA.debugLineNum = 13697136;BA.debugLine="Dim TallaSel As String=jamTableViewGestionVenta";
_tallasel = BA.ObjectToString(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Talla"));
RDebugUtils.currentLine=13697137;
 //BA.debugLineNum = 13697137;BA.debugLine="Dim SistRepoArticuloSel As Int=jamTableViewGest";
_sistrepoarticulosel = (int)(BA.ObjectToNumber(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Fabricacion")));
RDebugUtils.currentLine=13697146;
 //BA.debugLineNum = 13697146;BA.debugLine="If SistRepoArticuloSel=1 Then";
if (true) break;

case 46:
//if
this.state = 49;
if (_sistrepoarticulosel==1) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=13697147;
 //BA.debugLineNum = 13697147;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"El artículo";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"El artículo "+_articulosel+" tiene sistema reposición Fabricación. No está disponible la información de fechas prometidas.","Aviso");
RDebugUtils.currentLine=13697148;
 //BA.debugLineNum = 13697148;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 116;
return;
case 116:
//C
this.state = 49;
;
RDebugUtils.currentLine=13697149;
 //BA.debugLineNum = 13697149;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=13697152;
 //BA.debugLineNum = 13697152;BA.debugLine="Wait For(FechasPrometidasComprasArticuloTalla(A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), __ref._fechasprometidascomprasarticulotalla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_articulosel,_tallasel));
this.state = 117;
return;
case 117:
//C
this.state = 50;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13697153;
 //BA.debugLineNum = 13697153;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=13697154;
 //BA.debugLineNum = 13697154;BA.debugLine="If Accion<>\"Continuar\" Then Return";
if (true) break;

case 50:
//if
this.state = 55;
if ((_accion).equals("Continuar") == false) { 
this.state = 52;
;}if (true) break;

case 52:
//C
this.state = 55;
if (true) return ;
if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=13697155;
 //BA.debugLineNum = 13697155;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=13697156;
 //BA.debugLineNum = 13697156;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=13697157;
 //BA.debugLineNum = 13697157;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=13697158;
 //BA.debugLineNum = 13697158;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=13697159;
 //BA.debugLineNum = 13697159;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=13697160;
 //BA.debugLineNum = 13697160;BA.debugLine="For Each mF As Map In lstReg";
if (true) break;

case 56:
//for
this.state = 65;
_mf = new anywheresoftware.b4a.objects.collections.Map();
group67 = _lstreg;
index67 = 0;
groupLen67 = group67.getSize();
this.state = 118;
if (true) break;

case 118:
//C
this.state = 65;
if (index67 < groupLen67) {
this.state = 58;
_mf = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group67.Get(index67)));}
if (true) break;

case 119:
//C
this.state = 118;
index67++;
if (true) break;

case 58:
//C
this.state = 59;
RDebugUtils.currentLine=13697161;
 //BA.debugLineNum = 13697161;BA.debugLine="Dim DocFP As String=mF.Get(\"Documento\")";
_docfp = BA.ObjectToString(_mf.Get((Object)("Documento")));
RDebugUtils.currentLine=13697162;
 //BA.debugLineNum = 13697162;BA.debugLine="Dim QtyPteRecFP As Double=mF.Get(\"QtyPteRecibi";
_qtypterecfp = (double)(BA.ObjectToNumber(_mf.Get((Object)("QtyPteRecibir"))));
RDebugUtils.currentLine=13697163;
 //BA.debugLineNum = 13697163;BA.debugLine="Dim SQtyPteRecFP As String=NumberFormat2(QtyPt";
_sqtypterecfp = parent.__c.NumberFormat2(_qtypterecfp,(int) (1),(int) (0),(int) (0),parent.__c.False);
RDebugUtils.currentLine=13697165;
 //BA.debugLineNum = 13697165;BA.debugLine="Dim FechaPromFP As Long=mF.Get(\"FechaProm\")";
_fechapromfp = BA.ObjectToLongNumber(_mf.Get((Object)("FechaProm")));
RDebugUtils.currentLine=13697166;
 //BA.debugLineNum = 13697166;BA.debugLine="sb.Append(\"Pedido: \" & DocFP & \"   Qty Pte: \"";
_sb.Append("Pedido: "+_docfp+"   Qty Pte: "+_sqtypterecfp);
RDebugUtils.currentLine=13697168;
 //BA.debugLineNum = 13697168;BA.debugLine="If FechaPromFP<DateUtils.SetDate(DateTime.GetY";
if (true) break;

case 59:
//if
this.state = 64;
if (_fechapromfp<parent._dateutils._setdate(parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetMonth(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetDayOfMonth(parent.__c.DateTime.getNow()))) { 
this.state = 61;
}else {
this.state = 63;
}if (true) break;

case 61:
//C
this.state = 64;
RDebugUtils.currentLine=13697169;
 //BA.debugLineNum = 13697169;BA.debugLine="sb.Append(\"   Fecha Prom: \" & DateTime.Date(F";
_sb.Append("   Fecha Prom: "+parent.__c.DateTime.Date(_fechapromfp)).Append("  (VENCIDA)").Append(parent.__c.CRLF);
 if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=13697171;
 //BA.debugLineNum = 13697171;BA.debugLine="sb.Append(\"   Fecha Prom: \" & DateTime.Date(F";
_sb.Append("   Fecha Prom: "+parent.__c.DateTime.Date(_fechapromfp)).Append(parent.__c.CRLF);
 if (true) break;

case 64:
//C
this.state = 119;
;
 if (true) break;
if (true) break;

case 65:
//C
this.state = 108;
;
RDebugUtils.currentLine=13697176;
 //BA.debugLineNum = 13697176;BA.debugLine="Dialog.Title=\"Fechas Prometidas Compra\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Fechas Prometidas Compra");
RDebugUtils.currentLine=13697177;
 //BA.debugLineNum = 13697177;BA.debugLine="Dim B4XLongMsg As B4XLongTextTemplate";
_b4xlongmsg = new b4j.docU.b4xlongtexttemplate();
RDebugUtils.currentLine=13697178;
 //BA.debugLineNum = 13697178;BA.debugLine="B4XLongMsg.Initialize";
_b4xlongmsg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13697179;
 //BA.debugLineNum = 13697179;BA.debugLine="B4XLongMsg.Resize(700dip,300dip)";
_b4xlongmsg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (700)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=13697180;
 //BA.debugLineNum = 13697180;BA.debugLine="B4XLongMsg.Text=sb.ToString";
_b4xlongmsg._text /*Object*/  = (Object)(_sb.ToString());
RDebugUtils.currentLine=13697181;
 //BA.debugLineNum = 13697181;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlongmsg),(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=13697183;
 //BA.debugLineNum = 13697183;BA.debugLine="Wait For(rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 120;
return;
case 120:
//C
this.state = 108;
_rint = (int) result[1];
;
RDebugUtils.currentLine=13697185;
 //BA.debugLineNum = 13697185;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=13697188;
 //BA.debugLineNum = 13697188;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Comproband";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Comprobando permisos..."));
RDebugUtils.currentLine=13697189;
 //BA.debugLineNum = 13697189;BA.debugLine="JamLoadingIndicator1.show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=13697190;
 //BA.debugLineNum = 13697190;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cRepsol"));
this.state = 121;
return;
case 121:
//C
this.state = 68;
_sres = (String) result[1];
;
RDebugUtils.currentLine=13697191;
 //BA.debugLineNum = 13697191;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=13697192;
 //BA.debugLineNum = 13697192;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 68:
//if
this.state = 73;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
this.state = 70;
;}if (true) break;

case 70:
//C
this.state = 73;
if (true) return ;
if (true) break;

case 73:
//C
this.state = 74;
;
RDebugUtils.currentLine=13697195;
 //BA.debugLineNum = 13697195;BA.debugLine="Dim FilaSeleccionada As Int=jamTableViewGestion";
_filaseleccionada = __ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=13697196;
 //BA.debugLineNum = 13697196;BA.debugLine="Dim PedidoSel As String";
_pedidosel = "";
RDebugUtils.currentLine=13697204;
 //BA.debugLineNum = 13697204;BA.debugLine="Dim PedidoSel As String=jamTableViewGestionVent";
_pedidosel = BA.ObjectToString(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Documento"));
RDebugUtils.currentLine=13697205;
 //BA.debugLineNum = 13697205;BA.debugLine="Dim ClienteSel As String=jamTableViewGestionVen";
_clientesel = BA.ObjectToString(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Cliente"));
RDebugUtils.currentLine=13697206;
 //BA.debugLineNum = 13697206;BA.debugLine="Dim GRPSel As String=jamTableViewGestionVentas.";
_grpsel = BA.ObjectToString(__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"GRP"));
RDebugUtils.currentLine=13697208;
 //BA.debugLineNum = 13697208;BA.debugLine="If GRPSel<>\"07506\" Then";
if (true) break;

case 74:
//if
this.state = 77;
if ((_grpsel).equals("07506") == false) { 
this.state = 76;
}if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=13697209;
 //BA.debugLineNum = 13697209;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=13697210;
 //BA.debugLineNum = 13697210;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"El pedido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("El pedido "+parent.__c.SmartStringFormatter("",(Object)(_pedidosel))+" no corresponde al GRP REPSOL"),"Aviso");
RDebugUtils.currentLine=13697211;
 //BA.debugLineNum = 13697211;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 122;
return;
case 122:
//C
this.state = 77;
;
RDebugUtils.currentLine=13697212;
 //BA.debugLineNum = 13697212;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 77:
//C
this.state = 78;
;
RDebugUtils.currentLine=13697215;
 //BA.debugLineNum = 13697215;BA.debugLine="JamLoadingIndicator1.MensajeLoading=$\"Buscando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(("Buscando albaranes del pedido "+parent.__c.SmartStringFormatter("",(Object)(_pedidosel))+"")));
RDebugUtils.currentLine=13697216;
 //BA.debugLineNum = 13697216;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=13697217;
 //BA.debugLineNum = 13697217;BA.debugLine="Wait For(ListaAlbaranesVentaRegistradosPedidoVe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), __ref._listaalbaranesventaregistradospedidoventa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_pedidosel));
this.state = 123;
return;
case 123:
//C
this.state = 78;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13697218;
 //BA.debugLineNum = 13697218;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=13697219;
 //BA.debugLineNum = 13697219;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 78:
//if
this.state = 81;
if ((_accion).equals("NOK")) { 
this.state = 80;
}if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=13697220;
 //BA.debugLineNum = 13697220;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=13697221;
 //BA.debugLineNum = 13697221;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 81:
//C
this.state = 82;
;
RDebugUtils.currentLine=13697224;
 //BA.debugLineNum = 13697224;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=13697225;
 //BA.debugLineNum = 13697225;BA.debugLine="If lstReg.Size=0 Then";
if (true) break;

case 82:
//if
this.state = 85;
if (_lstreg.getSize()==0) { 
this.state = 84;
}if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=13697226;
 //BA.debugLineNum = 13697226;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=13697227;
 //BA.debugLineNum = 13697227;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay alb";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay albaranes registrados para el pedido de venta "+parent.__c.SmartStringFormatter("",(Object)(_pedidosel))+""),"Aviso");
RDebugUtils.currentLine=13697228;
 //BA.debugLineNum = 13697228;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _msa);
this.state = 124;
return;
case 124:
//C
this.state = 85;
;
RDebugUtils.currentLine=13697229;
 //BA.debugLineNum = 13697229;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 85:
//C
this.state = 86;
;
RDebugUtils.currentLine=13697232;
 //BA.debugLineNum = 13697232;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=13697233;
 //BA.debugLineNum = 13697233;BA.debugLine="Dim lstAlbaranesPedido As List";
_lstalbaranespedido = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13697234;
 //BA.debugLineNum = 13697234;BA.debugLine="lstAlbaranesPedido.Initialize";
_lstalbaranespedido.Initialize();
RDebugUtils.currentLine=13697235;
 //BA.debugLineNum = 13697235;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=13697236;
 //BA.debugLineNum = 13697236;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=13697237;
 //BA.debugLineNum = 13697237;BA.debugLine="For Each mDataAlb As Map In lstReg";
if (true) break;

case 86:
//for
this.state = 89;
_mdataalb = new anywheresoftware.b4a.objects.collections.Map();
group124 = _lstreg;
index124 = 0;
groupLen124 = group124.getSize();
this.state = 125;
if (true) break;

case 125:
//C
this.state = 89;
if (index124 < groupLen124) {
this.state = 88;
_mdataalb = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group124.Get(index124)));}
if (true) break;

case 126:
//C
this.state = 125;
index124++;
if (true) break;

case 88:
//C
this.state = 126;
RDebugUtils.currentLine=13697238;
 //BA.debugLineNum = 13697238;BA.debugLine="Dim sAlb As String=$\"${mDataAlb.Get(\"Documento";
_salb = (""+parent.__c.SmartStringFormatter("",_mdataalb.Get((Object)("Documento")))+"  Fecha: "+parent.__c.SmartStringFormatter("date",_mdataalb.Get((Object)("FechaDocumento")))+" ");
RDebugUtils.currentLine=13697239;
 //BA.debugLineNum = 13697239;BA.debugLine="lstAlbaranesPedido.Add(sAlb)";
_lstalbaranespedido.Add((Object)(_salb));
 if (true) break;
if (true) break;

case 89:
//C
this.state = 90;
;
RDebugUtils.currentLine=13697241;
 //BA.debugLineNum = 13697241;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=13697242;
 //BA.debugLineNum = 13697242;BA.debugLine="Dialog.Title=\"Selecciona ALBARAN\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona ALBARAN");
RDebugUtils.currentLine=13697243;
 //BA.debugLineNum = 13697243;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=13697244;
 //BA.debugLineNum = 13697244;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=13697245;
 //BA.debugLineNum = 13697245;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=13697246;
 //BA.debugLineNum = 13697246;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=13697247;
 //BA.debugLineNum = 13697247;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13697249;
 //BA.debugLineNum = 13697249;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=13697250;
 //BA.debugLineNum = 13697250;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomLis";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=13697251;
 //BA.debugLineNum = 13697251;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=13697253;
 //BA.debugLineNum = 13697253;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=13697254;
 //BA.debugLineNum = 13697254;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=13697256;
 //BA.debugLineNum = 13697256;BA.debugLine="B4XListDlg.Options=lstAlbaranesPedido";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstalbaranespedido;
RDebugUtils.currentLine=13697257;
 //BA.debugLineNum = 13697257;BA.debugLine="B4XListDlg.Resize(600dip,300dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=13697259;
 //BA.debugLineNum = 13697259;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=13697261;
 //BA.debugLineNum = 13697261;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dia";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=13697262;
 //BA.debugLineNum = 13697262;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 90:
//if
this.state = 93;
if (_bcancel.IsInitialized()) { 
this.state = 92;
}if (true) break;

case 92:
//C
this.state = 93;
RDebugUtils.currentLine=13697264;
 //BA.debugLineNum = 13697264;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=13697265;
 //BA.debugLineNum = 13697265;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=13697266;
 //BA.debugLineNum = 13697266;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 93:
//C
this.state = 94;
;
RDebugUtils.currentLine=13697269;
 //BA.debugLineNum = 13697269;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), _rsub);
this.state = 127;
return;
case 127:
//C
this.state = 94;
_rint = (int) result[1];
;
RDebugUtils.currentLine=13697270;
 //BA.debugLineNum = 13697270;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 94:
//if
this.state = 97;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
RDebugUtils.currentLine=13697271;
 //BA.debugLineNum = 13697271;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 97:
//C
this.state = 98;
;
RDebugUtils.currentLine=13697274;
 //BA.debugLineNum = 13697274;BA.debugLine="Dim sDocumentoSel As String=B4XListDlg.Selected";
_sdocumentosel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=13697275;
 //BA.debugLineNum = 13697275;BA.debugLine="Dim mAlbaranSel As Map=lstReg.Get(lstAlbaranesP";
_malbaransel = new anywheresoftware.b4a.objects.collections.Map();
_malbaransel = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get(_lstalbaranespedido.IndexOf((Object)(_sdocumentosel)))));
RDebugUtils.currentLine=13697276;
 //BA.debugLineNum = 13697276;BA.debugLine="Dim AlbaranSel As String=mAlbaranSel.Get(\"Docum";
_albaransel = BA.ObjectToString(_malbaransel.Get((Object)("Documento")));
RDebugUtils.currentLine=13697278;
 //BA.debugLineNum = 13697278;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"¿en";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("¿enviar email a Transnatur correspondiente al albarán "+parent.__c.SmartStringFormatter("",(Object)(_albaransel))+"?"),"Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 128;
return;
case 128:
//C
this.state = 98;
_rint = (int) result[1];
;
RDebugUtils.currentLine=13697279;
 //BA.debugLineNum = 13697279;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 98:
//if
this.state = 103;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 100;
;}if (true) break;

case 100:
//C
this.state = 103;
if (true) return ;
if (true) break;

case 103:
//C
this.state = 104;
;
RDebugUtils.currentLine=13697286;
 //BA.debugLineNum = 13697286;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando c";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando configuración..."));
RDebugUtils.currentLine=13697287;
 //BA.debugLineNum = 13697287;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=13697289;
 //BA.debugLineNum = 13697289;BA.debugLine="Wait For(CargaRepsolConfiguracionLogisticaAlbar";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_contextmenuitem_action"), __ref._cargarepsolconfiguracionlogisticaalbaranesventa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 129;
return;
case 129:
//C
this.state = 104;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13697290;
 //BA.debugLineNum = 13697290;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=13697291;
 //BA.debugLineNum = 13697291;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 104:
//if
this.state = 107;
if ((_accion).equals("NOK")) { 
this.state = 106;
}if (true) break;

case 106:
//C
this.state = 107;
RDebugUtils.currentLine=13697292;
 //BA.debugLineNum = 13697292;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=13697294;
 //BA.debugLineNum = 13697294;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 107:
//C
this.state = 108;
;
RDebugUtils.currentLine=13697296;
 //BA.debugLineNum = 13697296;BA.debugLine="Dim mData As Map=mRes.Get(\"mDataConf\")";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mDataConf"))));
RDebugUtils.currentLine=13697297;
 //BA.debugLineNum = 13697297;BA.debugLine="CarpetaFicherosCSVRepsol=mData.Get(\"CampoString";
__ref._carpetaficheroscsvrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString1")));
RDebugUtils.currentLine=13697298;
 //BA.debugLineNum = 13697298;BA.debugLine="CarpetaFicherosPDFRepsol=mData.Get(\"CampoString";
__ref._carpetaficherospdfrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString5")));
RDebugUtils.currentLine=13697299;
 //BA.debugLineNum = 13697299;BA.debugLine="BuzonCompartidoEmailEnvioInfoRepsol=mData.Get(\"";
__ref._buzoncompartidoemailenvioinforepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString2")));
RDebugUtils.currentLine=13697300;
 //BA.debugLineNum = 13697300;BA.debugLine="DireccionDestinoEmailsRepsol=mData.Get(\"CampoSt";
__ref._direcciondestinoemailsrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString3")));
RDebugUtils.currentLine=13697301;
 //BA.debugLineNum = 13697301;BA.debugLine="DireccionCCDestinoEmailsRepsol=mData.Get(\"Campo";
__ref._direccionccdestinoemailsrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString4")));
RDebugUtils.currentLine=13697303;
 //BA.debugLineNum = 13697303;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookRE";
__ref._borrarvbsscriptdireccionremitenteemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=13697304;
 //BA.debugLineNum = 13697304;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
__ref._borrarvbsscriptenvioemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=13697306;
 //BA.debugLineNum = 13697306;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlookREP";
__ref._crearvbsscriptdireccionremitenteemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=13697307;
 //BA.debugLineNum = 13697307;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTMLREPSOL";
__ref._crearvbsscriptenvioemailoutlookhtmlrepsol /*String*/ (null);
RDebugUtils.currentLine=13697309;
 //BA.debugLineNum = 13697309;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=13697311;
 //BA.debugLineNum = 13697311;BA.debugLine="CrearEmailInfoLogistica(AlbaranSel)";
__ref._crearemailinfologistica /*void*/ (null,_albaransel);
 if (true) break;

case 108:
//C
this.state = -1;
;
RDebugUtils.currentLine=13697316;
 //BA.debugLineNum = 13697316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _listaalbaranesventaregistradospedidoventa(b4j.docU.cgestionventas __ref,String _pedidoventasel) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "listaalbaranesventaregistradospedidoventa", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "listaalbaranesventaregistradospedidoventa", new Object[] {_pedidoventasel}));}
ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta rsub = new ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta(this,__ref,_pedidoventasel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta extends BA.ResumableSub {
public ResumableSub_ListaAlbaranesVentaRegistradosPedidoVenta(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _pedidoventasel) {
this.parent = parent;
this.__ref = __ref;
this._pedidoventasel = _pedidoventasel;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _pedidoventasel;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="Dim Comando As String=\"ListaAlbaranesVentaRegistr";
_comando = "ListaAlbaranesVentaRegistradosPedidoVenta";
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_pedidoventasel)},parent);
RDebugUtils.currentLine=14090248;
 //BA.debugLineNum = 14090248;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "listaalbaranesventaregistradospedidoventa"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=14090251;
 //BA.debugLineNum = 14090251;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"Error de con";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("Error de conexion servidor/query "+parent.__c.SmartStringFormatter("",(Object)(_comando))+" "),"Error");
RDebugUtils.currentLine=14090253;
 //BA.debugLineNum = 14090253;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "listaalbaranesventaregistradospedidoventa"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=14090254;
 //BA.debugLineNum = 14090254;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=14090256;
 //BA.debugLineNum = 14090256;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=14090257;
 //BA.debugLineNum = 14090257;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay alba";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay albaranes de venta registrados (no anulados) para el pedido de venta "+parent.__c.SmartStringFormatter("",(Object)(_pedidoventasel))+""),"Aviso");
RDebugUtils.currentLine=14090258;
 //BA.debugLineNum = 14090258;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "listaalbaranesventaregistradospedidoventa"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=14090259;
 //BA.debugLineNum = 14090259;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=14090261;
 //BA.debugLineNum = 14090261;BA.debugLine="lstReg=mresult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=14090262;
 //BA.debugLineNum = 14090262;BA.debugLine="Accion=\"OK\"";
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
RDebugUtils.currentLine=14090265;
 //BA.debugLineNum = 14090265;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14090266;
 //BA.debugLineNum = 14090266;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=14090267;
 //BA.debugLineNum = 14090267;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=14090268;
 //BA.debugLineNum = 14090268;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=14090269;
 //BA.debugLineNum = 14090269;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=14090270;
 //BA.debugLineNum = 14090270;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableviewgestionventas_menubarmenuitem_action(b4j.docU.cgestionventas __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "jamtableviewgestionventas_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableviewgestionventas_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableViewGestionVentas_MenuBarMenuItem_Action(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _tagmenuitem;
String _sres = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _documentoseleccionado = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 24;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","PrevisionSemanalVentas","EnviarEmailAlbaranTransnaturREPSOL")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 24;
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="ResfreshDatosGestionVentas";
__ref._resfreshdatosgestionventas /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 24;
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="GenerarExcelPrevisionSemanalVentas";
__ref._generarexcelprevisionsemanalventas /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="JamLoadingIndicator1.show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="Wait For(Utilidades.CheckPermisosAplicacionUsua";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_menubarmenuitem_action"), parent._utilidades._checkpermisosaplicacionusuarioobjetopermiso /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"PermisosAplicacion",parent._main._nombreaplicacion /*String*/ ,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ,"cRepsol"));
this.state = 25;
return;
case 25:
//C
this.state = 8;
_sres = (String) result[1];
;
RDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="If sRes=\"NO\" Or sRes=\"ERROR\" Or sRes=\"DENIED\" T";
if (true) break;

case 8:
//if
this.state = 13;
if ((_sres).equals("NO") || (_sres).equals("ERROR") || (_sres).equals("DENIED")) { 
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
RDebugUtils.currentLine=12779533;
 //BA.debugLineNum = 12779533;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando c";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando configuración..."));
RDebugUtils.currentLine=12779534;
 //BA.debugLineNum = 12779534;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=12779536;
 //BA.debugLineNum = 12779536;BA.debugLine="Wait For(CargaRepsolConfiguracionLogisticaAlbar";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_menubarmenuitem_action"), __ref._cargarepsolconfiguracionlogisticaalbaranesventa /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=12779537;
 //BA.debugLineNum = 12779537;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=12779538;
 //BA.debugLineNum = 12779538;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 14:
//if
this.state = 17;
if ((_accion).equals("NOK")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=12779539;
 //BA.debugLineNum = 12779539;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=12779541;
 //BA.debugLineNum = 12779541;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=12779543;
 //BA.debugLineNum = 12779543;BA.debugLine="Dim mData As Map=mRes.Get(\"mDataConf\")";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mDataConf"))));
RDebugUtils.currentLine=12779544;
 //BA.debugLineNum = 12779544;BA.debugLine="CarpetaFicherosCSVRepsol=mData.Get(\"CampoString";
__ref._carpetaficheroscsvrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString1")));
RDebugUtils.currentLine=12779545;
 //BA.debugLineNum = 12779545;BA.debugLine="CarpetaFicherosPDFRepsol=mData.Get(\"CampoString";
__ref._carpetaficherospdfrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString5")));
RDebugUtils.currentLine=12779546;
 //BA.debugLineNum = 12779546;BA.debugLine="BuzonCompartidoEmailEnvioInfoRepsol=mData.Get(\"";
__ref._buzoncompartidoemailenvioinforepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString2")));
RDebugUtils.currentLine=12779547;
 //BA.debugLineNum = 12779547;BA.debugLine="DireccionDestinoEmailsRepsol=mData.Get(\"CampoSt";
__ref._direcciondestinoemailsrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString3")));
RDebugUtils.currentLine=12779548;
 //BA.debugLineNum = 12779548;BA.debugLine="DireccionCCDestinoEmailsRepsol=mData.Get(\"Campo";
__ref._direccionccdestinoemailsrepsol /*String*/  = BA.ObjectToString(_mdata.Get((Object)("CampoString4")));
RDebugUtils.currentLine=12779550;
 //BA.debugLineNum = 12779550;BA.debugLine="BorrarVBSScriptDireccionRemitenteEmailOutlookRE";
__ref._borrarvbsscriptdireccionremitenteemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=12779551;
 //BA.debugLineNum = 12779551;BA.debugLine="BorrarVBSScriptEnvioEmailOutlookREPSOL";
__ref._borrarvbsscriptenvioemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=12779553;
 //BA.debugLineNum = 12779553;BA.debugLine="CrearVBSScriptDireccionRemitenteEmailOutlookREP";
__ref._crearvbsscriptdireccionremitenteemailoutlookrepsol /*String*/ (null);
RDebugUtils.currentLine=12779554;
 //BA.debugLineNum = 12779554;BA.debugLine="CrearVBSScriptEnvioEmailOutlookHTMLREPSOL";
__ref._crearvbsscriptenvioemailoutlookhtmlrepsol /*String*/ (null);
RDebugUtils.currentLine=12779556;
 //BA.debugLineNum = 12779556;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=12779558;
 //BA.debugLineNum = 12779558;BA.debugLine="wait for(SeleccionarDocumentoREPSOL) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "jamtableviewgestionventas_menubarmenuitem_action"), __ref._seleccionardocumentorepsol /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 27;
return;
case 27:
//C
this.state = 18;
_documentoseleccionado = (String) result[1];
;
RDebugUtils.currentLine=12779559;
 //BA.debugLineNum = 12779559;BA.debugLine="If DocumentoSeleccionado=\"\" Then Return";
if (true) break;

case 18:
//if
this.state = 23;
if ((_documentoseleccionado).equals("")) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) return ;
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=12779561;
 //BA.debugLineNum = 12779561;BA.debugLine="CrearEmailInfoLogistica(DocumentoSeleccionado)";
__ref._crearemailinfologistica /*void*/ (null,_documentoseleccionado);
 if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=12779563;
 //BA.debugLineNum = 12779563;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionardocumentorepsol(b4j.docU.cgestionventas __ref) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "seleccionardocumentorepsol", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionardocumentorepsol", null));}
ResumableSub_SeleccionarDocumentoREPSOL rsub = new ResumableSub_SeleccionarDocumentoREPSOL(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionarDocumentoREPSOL extends BA.ResumableSub {
public ResumableSub_SeleccionarDocumentoREPSOL(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _documento = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Dialog.Title=\"Indica Documento\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Documento");
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="Dialog.TitleBarHeight=50dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (50));
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=14286860;
 //BA.debugLineNum = 14286860;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=14286862;
 //BA.debugLineNum = 14286862;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=14286863;
 //BA.debugLineNum = 14286863;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=14286864;
 //BA.debugLineNum = 14286864;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardocumentorepsol"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=14286865;
 //BA.debugLineNum = 14286865;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return \"\"";
if (true) break;

case 1:
//if
this.state = 6;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(""));return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=14286867;
 //BA.debugLineNum = 14286867;BA.debugLine="Dim Documento As String=InputDlg.Text";
_documento = _inputdlg._text /*String*/ ;
RDebugUtils.currentLine=14286869;
 //BA.debugLineNum = 14286869;BA.debugLine="If Documento=\"\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_documento).equals("")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=14286870;
 //BA.debugLineNum = 14286870;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha indi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha indicado documento","Aviso");
RDebugUtils.currentLine=14286871;
 //BA.debugLineNum = 14286871;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "seleccionardocumentorepsol"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=14286872;
 //BA.debugLineNum = 14286872;BA.debugLine="Return \"\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(""));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=14286875;
 //BA.debugLineNum = 14286875;BA.debugLine="Return Documento";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_documento));return;};
RDebugUtils.currentLine=14286877;
 //BA.debugLineNum = 14286877;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableviewgestionventas_validacionediciontablecell(b4j.docU.cgestionventas __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada,Object _valorvalidacion) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "jamtableviewgestionventas_validacionediciontablecell", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewgestionventas_validacionediciontablecell", new Object[] {_datosceldaseleccionada,_valorvalidacion}));}
String _aliascampo = "";
String _valorvalidacionnombrerespcuenta = "";
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub jamTableViewGestionVentas_ValidacionEdicionTab";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim AliasCampo As String=DatosCeldaSeleccionada.A";
_aliascampo = _datosceldaseleccionada.AliasCampo /*String*/ ;
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Select AliasCampo";
switch (BA.switchObjectToInt(_aliascampo,"NombreResponsableCuenta")) {
case 0: {
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="Dim ValorValidacionNombreRespCuenta As String=V";
_valorvalidacionnombrerespcuenta = BA.ObjectToString(_valorvalidacion);
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="If ValorValidacionNombreRespCuenta.ToUpperCase.";
if (_valorvalidacionnombrerespcuenta.toUpperCase().startsWith("ANA")) { 
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="jamTableViewGestionVentas.ValidacionEditedCell";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._validacioneditedcell /*String*/ (null,_datosceldaseleccionada,(Object)(_valorvalidacionnombrerespcuenta.toUpperCase()),__c.True);
 }else {
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="fx.Msgbox(frm,\"El nombre debe empezar por ANA.";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"El nombre debe empezar por ANA.","Error garrafal!!!");
RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="jamTableViewGestionVentas.ValidacionEditedCell";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._validacioneditedcell /*String*/ (null,_datosceldaseleccionada,_valorvalidacion,__c.False);
 };
 break; }
default: {
RDebugUtils.currentLine=13762572;
 //BA.debugLineNum = 13762572;BA.debugLine="jamTableViewGestionVentas.ValidacionEditedCell(";
__ref._jamtableviewgestionventas /*b4j.docU.jamtableview*/ ._validacioneditedcell /*String*/ (null,_datosceldaseleccionada,_valorvalidacion,__c.True);
 break; }
}
;
RDebugUtils.currentLine=13762575;
 //BA.debugLineNum = 13762575;BA.debugLine="End Sub";
return "";
}
public Object[]  _maptoarrayofstringsconcamposfecha(b4j.docU.cgestionventas __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "maptoarrayofstringsconcamposfecha", false))
	 {return ((Object[]) Debug.delegate(ba, "maptoarrayofstringsconcamposfecha", new Object[] {_m}));}
Object[] _arr = null;
int _i = 0;
Object _value = null;
Object _key = null;
int _intvalue = 0;
String _svalue = "";
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="public Sub mapToArrayOfStringsConCamposFecha(m As";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim arr(m.Size * 2) As Object  'array size is dou";
_arr = new Object[(int) (_m.getSize()*2)];
{
int d0 = _arr.length;
for (int i0 = 0;i0 < d0;i0++) {
_arr[i0] = new Object();
}
}
;
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Dim i As Int=0";
_i = (int) (0);
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="For Each key As Object In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _m.Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = group4.Get(index4);
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="value=m.Get(key)";
_value = _m.Get(_key);
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="LogColor($\"key=${key}, value=${value}\"$, xui.Col";
__c.LogImpl("814548999",("key="+__c.SmartStringFormatter("",_key)+", value="+__c.SmartStringFormatter("",_value)+""),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="arr(i)=key";
_arr[_i] = _key;
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="i = i +1";
_i = (int) (_i+1);
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="If key.As(String).ToUpperCase.StartsWith(\"FECHA\"";
if ((BA.ObjectToString(_key)).toUpperCase().startsWith("FECHA") && _i%2==0) { 
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="arr(i)=DateTime.Date(value)";
_arr[_i] = (Object)(__c.DateTime.Date(BA.ObjectToLongNumber(_value)));
 }else {
RDebugUtils.currentLine=14549005;
 //BA.debugLineNum = 14549005;BA.debugLine="If value Is String Then";
if (_value instanceof String) { 
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="arr(i)=value";
_arr[_i] = _value;
 }else {
RDebugUtils.currentLine=14549008;
 //BA.debugLineNum = 14549008;BA.debugLine="Dim intValue As Int=value";
_intvalue = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=14549009;
 //BA.debugLineNum = 14549009;BA.debugLine="Dim sValue As String=intValue";
_svalue = BA.NumberToString(_intvalue);
RDebugUtils.currentLine=14549010;
 //BA.debugLineNum = 14549010;BA.debugLine="arr(i)=sValue";
_arr[_i] = (Object)(_svalue);
 };
 };
RDebugUtils.currentLine=14549013;
 //BA.debugLineNum = 14549013;BA.debugLine="i =i +1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=14549016;
 //BA.debugLineNum = 14549016;BA.debugLine="Return arr";
if (true) return _arr;
RDebugUtils.currentLine=14549017;
 //BA.debugLineNum = 14549017;BA.debugLine="End Sub";
return null;
}
public void  _nombrevendedor(b4j.docU.cgestionventas __ref,String _codigovendedorsel) throws Exception{
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "nombrevendedor", false))
	 {Debug.delegate(ba, "nombrevendedor", new Object[] {_codigovendedorsel}); return;}
ResumableSub_NombreVendedor rsub = new ResumableSub_NombreVendedor(this,__ref,_codigovendedorsel);
rsub.resume(ba, null);
}
public static class ResumableSub_NombreVendedor extends BA.ResumableSub {
public ResumableSub_NombreVendedor(b4j.docU.cgestionventas parent,b4j.docU.cgestionventas __ref,String _codigovendedorsel) {
this.parent = parent;
this.__ref = __ref;
this._codigovendedorsel = _codigovendedorsel;
this.__ref = parent;
}
b4j.docU.cgestionventas __ref;
b4j.docU.cgestionventas parent;
String _codigovendedorsel;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cgestionventas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"NombreVended";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"NombreVendedor",(Object[])(new String[]{_codigovendedorsel}),parent);
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "nombrevendedor"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query NombreVendedor ","Error");
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "nombrevendedor"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=13041680;
 //BA.debugLineNum = 13041680;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=13041681;
 //BA.debugLineNum = 13041681;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay ningú";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay ningún vendedor registrado en Navision con el código "+_codigovendedorsel+".","Error");
RDebugUtils.currentLine=13041682;
 //BA.debugLineNum = 13041682;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cgestionventas", "nombrevendedor"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=13041683;
 //BA.debugLineNum = 13041683;BA.debugLine="Accion=\"SinDatos\"";
_accion = "SinDatos";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=13041685;
 //BA.debugLineNum = 13041685;BA.debugLine="lstRegistros=mresult.Get(\"lstRes\")";
_lstregistros = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=13041686;
 //BA.debugLineNum = 13041686;BA.debugLine="Accion=\"Continuar\"";
_accion = "Continuar";
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
RDebugUtils.currentLine=13041689;
 //BA.debugLineNum = 13041689;BA.debugLine="CallSubDelayed3(Me,\"NombreVendedor_Completed\",Acc";
parent.__c.CallSubDelayed3(ba,parent,"NombreVendedor_Completed",(Object)(_accion),(Object)(_lstregistros));
RDebugUtils.currentLine=13041690;
 //BA.debugLineNum = 13041690;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setforegroundwindow(b4j.docU.cgestionventas __ref,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="cgestionventas";
if (Debug.shouldDelegate(ba, "setforegroundwindow", false))
	 {return ((String) Debug.delegate(ba, "setforegroundwindow", new Object[] {_title}));}
anywheresoftware.b4j.object.JavaObject _wu = null;
anywheresoftware.b4j.object.JavaObject _user32 = null;
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
String _t = "";
Object _hwnd = null;
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub SetForegroundWindow(Title As String)";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Dim WU As JavaObject";
_wu = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
_wu.InitializeStatic("com.sun.jna.platform.WindowUtils");
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="Dim user32 As JavaObject";
_user32 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.pla";
_user32 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")));
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_wu.RunMethod("getAllWindows",new Object[]{(Object)(__c.False)})));
RDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="For Each JO As JavaObject In L";
_jo = new anywheresoftware.b4j.object.JavaObject();
{
final anywheresoftware.b4a.BA.IterableList group6 = _l;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group6.Get(index6)));
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
_t = BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(__c.Null)));
RDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="Log(t)";
__c.LogImpl("813959176",_t,0);
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="If t.Contains(Title) Then";
if (_t.contains(_title)) { 
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="Dim hwnd As Object = JO.RunMethod(\"getHWND\", Nu";
_hwnd = _jo.RunMethod("getHWND",(Object[])(__c.Null));
RDebugUtils.currentLine=13959179;
 //BA.debugLineNum = 13959179;BA.debugLine="user32.RunMethod(\"SetForegroundWindow\", Array(h";
_user32.RunMethod("SetForegroundWindow",new Object[]{_hwnd});
RDebugUtils.currentLine=13959180;
 //BA.debugLineNum = 13959180;BA.debugLine="user32.RunMethod(\"SetFocus\", Array(hwnd))";
_user32.RunMethod("SetFocus",new Object[]{_hwnd});
RDebugUtils.currentLine=13959181;
 //BA.debugLineNum = 13959181;BA.debugLine="user32.RunMethod(\"ShowWindow\", Array(hwnd, 9))'";
_user32.RunMethod("ShowWindow",new Object[]{_hwnd,(Object)(9)});
RDebugUtils.currentLine=13959182;
 //BA.debugLineNum = 13959182;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=13959185;
 //BA.debugLineNum = 13959185;BA.debugLine="Log(\"Window not found\")";
__c.LogImpl("813959185","Window not found",0);
RDebugUtils.currentLine=13959186;
 //BA.debugLineNum = 13959186;BA.debugLine="End Sub";
return "";
}
public static boolean SetForegroundWindow(String title, boolean justFind) {
    User32 user32 = com.sun.jna.platform.win32.User32.INSTANCE;
    for (com.sun.jna.platform.DesktopWindow s : com.sun.jna.platform.WindowUtils.getAllWindows(false)) {
        String t = s.getTitle();
        if (t.toLowerCase().equals(title.toLowerCase())) {
            if (!justFind) {
                user32.SetForegroundWindow(s.getHWND());
                user32.SetFocus(s.getHWND());
                user32.ShowWindow(s.getHWND(), 3);
            }
            return true;
        }
        
    }
    return false;
}






/*
*/




 public static void setColumnaWrapText(TableColumn tc,  final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Object>() {
				Text text = new Text();
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (empty) {
                        setGraphic(null);
                        return;
                    }
					String textoItem=(String)item;
                   // text.setWrappingWidth(getTableColumn().getWidth() - 10);
					text.wrappingWidthProperty().bind(getTableColumn().widthProperty().subtract(35));
                    text.setText(textoItem);
                    setGraphic(text);
					setPrefHeight(Control.USE_COMPUTED_SIZE);
                }
            };

		}
    });
}




Label label = new Label("My Label");


public static void setColorValorMenorColorValorMayorIgualColumna(TableColumn tc,  final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Number>() {
                @Override
                public void updateItem(Number item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						String str = args[0].toString(); 
						int valorInf = Integer.valueOf(str);
       					if((int)item < valorInf) {
							String sColorMenor =  String.valueOf(args[1]);
							Color colorMenor = Color.valueOf(sColorMenor);
							setTextFill(colorMenor);
       						//setText(""+item);
							//setStyle("-fx-alignment: CENTER-RIGHT;");
							String sFormato =  String.valueOf(args[3]);
							DecimalFormat df = new DecimalFormat(sFormato);
							setText(df.format(item.doubleValue()));
							setStyle("-fx-alignment: CENTER-RIGHT;");
      					} else {
							String sColorMayorIgual =  String.valueOf(args[2]);
							Color colorMayorIgual = Color.valueOf(sColorMayorIgual);
							setTextFill(colorMayorIgual);
       						//setText(""+item);
							//setStyle("-fx-alignment: CENTER-RIGHT;");
							String sFormato =  String.valueOf(args[3]);
							DecimalFormat df = new DecimalFormat(sFormato);
							setText(df.format(item.doubleValue()));
							setStyle("-fx-alignment: CENTER-RIGHT;");
      					}
     				}
	 				else {
	          			setText(null);
              			setTextFill(null);
						setStyle(null);
						setGraphic(null);
              			return;
	 				}
                }
            };
        }
    });
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


public static void setFormatoColumnaStatus(TableColumn tc,  final Object[] args)  throws Exception {
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Object>() {
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						
					
						//setStyle(sCSSStyle);
						
						
						String Status=(String)item;
						
						String sColorF=new String("");
						
						String sColorT=new String("");
						
						//String sColorB=new String("")
						
						
					     switch (Status) 
					        {
							
							// prefijo #99 = opacidad=60%
					            case "P+":      
									sColorT = "black";
									sColorF = "lime"; 
									//sColorB = "lime";

					                break;
									
					            case "P-": 
									sColorT = "black";
									sColorF = "orange";  
									//sColorB = "orange";
					              	break;
									
					            case "L+":  
									sColorT = "red";
									sColorF = "yellow";  
									//sColorB = "yellow";
					                break;
									
					            case "L-":  
									sColorT = "red";
									sColorF = "khaki";  
									//sColorB = "khaki";
					                break;

					            default: 
									sColorT = "black";
									sColorF = "transparent";
									//sColorB = "lightgray";

					                break;
					        }
					
						Color colorF = Color.valueOf(sColorF);
						Color colorFSemiTransparente=colorF.deriveColor(1,1,1,0.5);
						 String hexColorF = toHexString(colorFSemiTransparente);
						 
						 Color colorT = Color.valueOf(sColorT);
						 String hexColorT = toHexString(colorT);
						 
						// Color colorB = Color.valueOf(sColorB);
						// String hexColorB = toHexString(colorB);
						
						//setStyle("-fx-alignment: CENTER;-fx-border-color: "+ hexColorB + ";-fx-border-width: 1;");
						//setStyle(isSelected() ? 
						//	"-fx-border-color: red red red red;-fx-text-fill: black;-fx-border-width: 1px;-fx-background-color: lightskyblue;":
						//   "-fx-background-color: " + hexColorF +";-fx-opacity: 0.6;");
						  setStyle("-fx-text-fill:" + hexColorT +";-fx-background-color: " + hexColorF + ";-fx-background-insets: 0.5 0.5 0.5 0.5 ;");
						setAlignment(Pos.CENTER);
						//setBackground(new Background(new BackgroundFill(colorF, CornerRadii.EMPTY, new Insets(0.5))));
						//String sColorT =  String.valueOf(args[0]);
						//Color colorT = Color.valueOf(sColorT);
						//Paint colorT = Paint.valueOf(sColorT);
						//setTextFill(colorT);
       					setText(""+item);
					}
	 				else {
	          			setText(null);
              			//setTextFill(null);
						setStyle(null);
              			return;
	 				}
                }
            };
        }
    });
}

public static void setFormatoColumnaFechaVencida(TableColumn tc,  final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Long>() {
                @Override
                public void updateItem(Long item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
					
						setAlignment(Pos.CENTER);
						
						if (item!=0){
							SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
							String sFecha = sdf.format(new Date(item.longValue())); 
							setText(sFecha);
							
							Long TicksHoy=Long.parseLong((String.valueOf(args[0])));
							if (item<TicksHoy && item>0){
								String sColorF=String.valueOf(args[1]);
								Color colorF = Color.valueOf(sColorF);
								Color colorFSemiTransparente=colorF.deriveColor(1,1,1,0.75);
								String hexColorF = toHexString(colorFSemiTransparente);
								
								String sColorT=String.valueOf(args[2]);
								Color colorT = Color.valueOf(sColorT);
								String hexColorT = toHexString(colorT);
								
								setStyle("-fx-text-fill:" + hexColorT +";-fx-background-color: " + hexColorF + ";-fx-background-insets: 0.5 0.5 0.5 0.5 ;");
							}
							else {
								setStyle("-fx-text-fill: black;-fx-background-color: transparent;-fx-background-insets: 0.5 0.5 0.5 0.5 ;");
							}
						}
						else {
							setText(null);
              				setStyle(null);
						}
     				}
	 				else {
	          			setText(null);
              			//setTextFill(null);
						//setGraphic(null);
						setStyle(null);
              			return;
	 				}
                }
            };
        }
    });
} 


public static void setColumnaBooleanaNumericaColorNOSITextoVacio(TableColumn tc,   final Object[] args){
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param) {
            return new TableCell<Object, Object>() {
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						if((int)item == 0) {
							String sColorNO =  String.valueOf(args[0]);
							Color colorNO = Color.valueOf(sColorNO);
							String hexColorNO = toHexString(colorNO);
                      		//setTextFill(colorNO);
							setStyle("-fx-text-fill:" + hexColorNO +";");
       						setText("NO");
							setAlignment(Pos.CENTER);
      					} else {
       						setText(null);
							setStyle(null);
      					}
     				}
	 				else {
	          			setText(null);
              			//setTextFill(null);
						setStyle(null);
						//setGraphic(null);
              			return;
	 				}
                }
            };
        }
    });
}

}