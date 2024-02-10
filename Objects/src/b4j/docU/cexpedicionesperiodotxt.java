package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cexpedicionesperiodotxt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cexpedicionesperiodotxt", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cexpedicionesperiodotxt.class).invoke(this, new Object[] {null});
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
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public b4j.docU.jamtableclv _jamtableclv1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtano = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtbultos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcoddestin = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodempresa = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcodorigen = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcpostaldestinatario = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdirecciondestinatario = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechaalta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtkilos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnexped1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnexped2 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombredestinatario = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpoblaciondestinatario = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtreferencia1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdestino = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtestadoactual = null;
public anywheresoftware.b4a.objects.B4XCanvas _measurementcanvas = null;
public b4j.example.flexgrid _flexgriddialog = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechainicial = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechainicial = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechafinal = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechafinal = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btngetinfo = null;
public long _fechainiciallong = 0L;
public long _fechafinallong = 0L;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechasalida = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechaentrega = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombrecliente = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnombreresponsablecuenta = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txttipo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblindicadorestado = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtentregado = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblindicadortipo = null;
public b4j.docU.jamcircularprogressbar _jamcircularprogressbar1 = null;
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
public String  _initialize(b4j.docU.cexpedicionesperiodotxt __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=63897601;
 //BA.debugLineNum = 63897601;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=63897602;
 //BA.debugLineNum = 63897602;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=63897603;
 //BA.debugLineNum = 63897603;BA.debugLine="MeasurementCanvas.Initialize(p)";
__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=63897605;
 //BA.debugLineNum = 63897605;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63963138;
 //BA.debugLineNum = 63963138;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=63963139;
 //BA.debugLineNum = 63963139;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=63963140;
 //BA.debugLineNum = 63963140;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=63963141;
 //BA.debugLineNum = 63963141;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=63963142;
 //BA.debugLineNum = 63963142;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=63963143;
 //BA.debugLineNum = 63963143;BA.debugLine="frm.RootPane.LoadLayout(\"scrExpedicionesPeriodoTX";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrExpedicionesPeriodoTXT");
RDebugUtils.currentLine=63963144;
 //BA.debugLineNum = 63963144;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "show"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=63963147;
 //BA.debugLineNum = 63963147;BA.debugLine="frm.Title=Main.PrefijoTitleForms &  \"  \" & \"Exped";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"  "+"Expediciones Periodo TXT");
RDebugUtils.currentLine=63963149;
 //BA.debugLineNum = 63963149;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=63963152;
 //BA.debugLineNum = 63963152;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=63963154;
 //BA.debugLineNum = 63963154;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=63963161;
 //BA.debugLineNum = 63963161;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarA";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._estadomenuitem /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=63963162;
 //BA.debugLineNum = 63963162;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarL";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._estadomenuitem /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=63963163;
 //BA.debugLineNum = 63963163;BA.debugLine="JamTableCLV1.AddMenuItemToMenuInMenuBar(\"Actualiz";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._addmenuitemtomenuinmenubar /*String*/ (null,"Actualizar Status Expediciones No Entregadas","ActualizarStatusExpedicionesNoEntregadas",__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=63963165;
 //BA.debugLineNum = 63963165;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._configurartableclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaExpedicionesPeriodoTXT.json");
RDebugUtils.currentLine=63963166;
 //BA.debugLineNum = 63963166;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63963167;
 //BA.debugLineNum = 63963167;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("863963167",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=63963168;
 //BA.debugLineNum = 63963168;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=63963169;
 //BA.debugLineNum = 63963169;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=63963170;
 //BA.debugLineNum = 63963170;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=63963171;
 //BA.debugLineNum = 63963171;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=63963172;
 //BA.debugLineNum = 63963172;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=63963179;
 //BA.debugLineNum = 63963179;BA.debugLine="JamTableCLV1.AlturaItems=180dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaitems /*int*/ (null,parent.__c.DipToCurrent((int) (180)));
RDebugUtils.currentLine=63963181;
 //BA.debugLineNum = 63963181;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmodoseleccionitems /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._modoseleccionindividualperm /*String*/ );
RDebugUtils.currentLine=63963183;
 //BA.debugLineNum = 63963183;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=2dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaseparadorpaneles /*float*/ (null,(float) (parent.__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=63963184;
 //BA.debugLineNum = 63963184;BA.debugLine="JamTableCLV1.ColorSeparadorPaneles=0xFF696969";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setcolorseparadorpaneles(null,((int)0xff696969));
RDebugUtils.currentLine=63963186;
 //BA.debugLineNum = 63963186;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
if (true) break;

case 5:
//if
this.state = 10;
if (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=63963188;
 //BA.debugLineNum = 63963188;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=63963190;
 //BA.debugLineNum = 63963190;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=63963193;
 //BA.debugLineNum = 63963193;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatos(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
String _dateformatant = "";
String _sfechadesde = "";
String _sfechahasta = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _lstregdocsexpperiodo = null;
boolean _success = false;
Object _robj = null;
int _ndoc = 0;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _micli = null;
anywheresoftware.b4a.objects.collections.Map _minfoexp = null;
String _refexp = "";
Object _senderfilter = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
anywheresoftware.b4a.BA.IterableList group40;
int index40;
int groupLen40;
anywheresoftware.b4a.BA.IterableList group49;
int index49;
int groupLen49;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64028675;
 //BA.debugLineNum = 64028675;BA.debugLine="jamLoadingIndicator1.DuracionCiclo=1000";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setduracionciclo(null,(int) (1000));
RDebugUtils.currentLine=64028677;
 //BA.debugLineNum = 64028677;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(""));
RDebugUtils.currentLine=64028678;
 //BA.debugLineNum = 64028678;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=64028680;
 //BA.debugLineNum = 64028680;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=64028682;
 //BA.debugLineNum = 64028682;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=64028683;
 //BA.debugLineNum = 64028683;BA.debugLine="Dim SFechaDesde As String=DateTime.Date(FechaInic";
_sfechadesde = parent.__c.DateTime.Date(__ref._fechainiciallong /*long*/ );
RDebugUtils.currentLine=64028684;
 //BA.debugLineNum = 64028684;BA.debugLine="Dim SFechaHasta As String=DateTime.Date(FechaFina";
_sfechahasta = parent.__c.DateTime.Date(__ref._fechafinallong /*long*/ );
RDebugUtils.currentLine=64028687;
 //BA.debugLineNum = 64028687;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=64028689;
 //BA.debugLineNum = 64028689;BA.debugLine="JamTableCLV1.Clear";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=64028691;
 //BA.debugLineNum = 64028691;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblExpedicionesPer";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblExpedicionesPeriodoTXT");
RDebugUtils.currentLine=64028692;
 //BA.debugLineNum = 64028692;BA.debugLine="wait for(cmAuxTxT.ObtenerBuscarExpedicionesPeriod";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), parent._cmauxtxt._obtenerbuscarexpedicionesperiodotxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_sfechadesde,_sfechahasta));
this.state = 59;
return;
case 59:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64028693;
 //BA.debugLineNum = 64028693;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=64028694;
 //BA.debugLineNum = 64028694;BA.debugLine="If Accion<>\"OK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("OK") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=64028695;
 //BA.debugLineNum = 64028695;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=64028696;
 //BA.debugLineNum = 64028696;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=64028699;
 //BA.debugLineNum = 64028699;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=64028700;
 //BA.debugLineNum = 64028700;BA.debugLine="If lstRes.Size>0 Then";
if (true) break;

case 5:
//if
this.state = 12;
if (_lstres.getSize()>0) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=64028702;
 //BA.debugLineNum = 64028702;BA.debugLine="Dim mData As Map=lstRes.Get(0)";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=64028703;
 //BA.debugLineNum = 64028703;BA.debugLine="For Each k As String In mData.Keys";
if (true) break;

case 8:
//for
this.state = 11;
group20 = _mdata.Keys();
index20 = 0;
groupLen20 = group20.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 11;
if (index20 < groupLen20) {
this.state = 10;
_k = BA.ObjectToString(group20.Get(index20));}
if (true) break;

case 61:
//C
this.state = 60;
index20++;
if (true) break;

case 10:
//C
this.state = 61;
RDebugUtils.currentLine=64028704;
 //BA.debugLineNum = 64028704;BA.debugLine="Log(\"\")";
parent.__c.LogImpl("864028704","",0);
RDebugUtils.currentLine=64028705;
 //BA.debugLineNum = 64028705;BA.debugLine="Log(k & \": \" & mData.Get(k))";
parent.__c.LogImpl("864028705",_k+": "+BA.ObjectToString(_mdata.Get((Object)(_k))),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=64028711;
 //BA.debugLineNum = 64028711;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblExpedicionesPeriodoTXT",_lstres);
RDebugUtils.currentLine=64028731;
 //BA.debugLineNum = 64028731;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblExpedicionesPeriodoTXT set EstadoActual=? where  Fecha_x0020_Entrega<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("ENTREGADO"),(Object)("")}));
RDebugUtils.currentLine=64028732;
 //BA.debugLineNum = 64028732;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblExpedicionesPeriodoTXT set Entregado=? where  Fecha_x0020_Entrega<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI"),(Object)("")}));
RDebugUtils.currentLine=64028733;
 //BA.debugLineNum = 64028733;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblExpedicionesPeriodoTXT set EstadoActual=? where  Fecha_x0020_Entrega=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("PENDIENTE DE ACTUALIZAR"),(Object)("")}));
RDebugUtils.currentLine=64028734;
 //BA.debugLineNum = 64028734;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblExpedicionesPeriodoTXT set Entregado=? where  Fecha_x0020_Entrega=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("NO"),(Object)("")}));
RDebugUtils.currentLine=64028739;
 //BA.debugLineNum = 64028739;BA.debugLine="Dim lstRegDocsExpPeriodo As List";
_lstregdocsexpperiodo = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=64028740;
 //BA.debugLineNum = 64028740;BA.debugLine="lstRegDocsExpPeriodo.Initialize";
_lstregdocsexpperiodo.Initialize();
RDebugUtils.currentLine=64028741;
 //BA.debugLineNum = 64028741;BA.debugLine="Wait For(DocumentosExpedicionesPeriodoBatch) comp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), __ref._documentosexpedicionesperiodobatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 62;
return;
case 62:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64028742;
 //BA.debugLineNum = 64028742;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=64028743;
 //BA.debugLineNum = 64028743;BA.debugLine="If Success Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_success) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=64028744;
 //BA.debugLineNum = 64028744;BA.debugLine="Dim lstRegDocsExpPeriodo As List=mRes.Get(\"lstRe";
_lstregdocsexpperiodo = new anywheresoftware.b4a.objects.collections.List();
_lstregdocsexpperiodo = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=64028747;
 //BA.debugLineNum = 64028747;BA.debugLine="Wait For(EliminarTablaTemporalDocumentosReferenci";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), __ref._eliminartablatemporaldocumentosreferenciastte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 63;
return;
case 63:
//C
this.state = 17;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=64028749;
 //BA.debugLineNum = 64028749;BA.debugLine="If lstRegDocsExpPeriodo.Size>0 Then";
if (true) break;

case 17:
//if
this.state = 39;
if (_lstregdocsexpperiodo.getSize()>0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=64028804;
 //BA.debugLineNum = 64028804;BA.debugLine="Dim nDoc As Int=1";
_ndoc = (int) (1);
RDebugUtils.currentLine=64028805;
 //BA.debugLineNum = 64028805;BA.debugLine="For Each m As Map In lstRegDocsExpPeriodo";
if (true) break;

case 20:
//for
this.state = 38;
_m = new anywheresoftware.b4a.objects.collections.Map();
group40 = _lstregdocsexpperiodo;
index40 = 0;
groupLen40 = group40.getSize();
this.state = 64;
if (true) break;

case 64:
//C
this.state = 38;
if (index40 < groupLen40) {
this.state = 22;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group40.Get(index40)));}
if (true) break;

case 65:
//C
this.state = 64;
index40++;
if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=64028807;
 //BA.debugLineNum = 64028807;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizan";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando info "+BA.ObjectToString(_m.Get((Object)("Documento")))+" ("+BA.NumberToString(_ndoc)+" de "+BA.NumberToString(_lstregdocsexpperiodo.getSize())+") ..."));
RDebugUtils.currentLine=64028808;
 //BA.debugLineNum = 64028808;BA.debugLine="Wait For(ClienteResponsableCuentaDocumento(m.Ge";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), __ref._clienteresponsablecuentadocumento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,BA.ObjectToString(_m.Get((Object)("Documento")))));
this.state = 66;
return;
case 66:
//C
this.state = 23;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64028809;
 //BA.debugLineNum = 64028809;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=64028810;
 //BA.debugLineNum = 64028810;BA.debugLine="If Accion=\"ErrConn\" Then";
if (true) break;

case 23:
//if
this.state = 26;
if ((_accion).equals("ErrConn")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 if (true) break;
;
RDebugUtils.currentLine=64028813;
 //BA.debugLineNum = 64028813;BA.debugLine="If Accion=\"OK\" Then";

case 26:
//if
this.state = 37;
if ((_accion).equals("OK")) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=64028814;
 //BA.debugLineNum = 64028814;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=64028815;
 //BA.debugLineNum = 64028815;BA.debugLine="Dim mICli As Map=lstReg.Get(0)";
_micli = new anywheresoftware.b4a.objects.collections.Map();
_micli = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=64028820;
 //BA.debugLineNum = 64028820;BA.debugLine="For Each mInfoExp As Map In lstRegDocsExpPerio";
if (true) break;

case 29:
//for
this.state = 36;
_minfoexp = new anywheresoftware.b4a.objects.collections.Map();
group49 = _lstregdocsexpperiodo;
index49 = 0;
groupLen49 = group49.getSize();
this.state = 67;
if (true) break;

case 67:
//C
this.state = 36;
if (index49 < groupLen49) {
this.state = 31;
_minfoexp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group49.Get(index49)));}
if (true) break;

case 68:
//C
this.state = 67;
index49++;
if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=64028821;
 //BA.debugLineNum = 64028821;BA.debugLine="Dim RefExp As String=mInfoExp.Get(\"Referencia";
_refexp = BA.ObjectToString(_minfoexp.Get((Object)("ReferenciaExpedicionTransporte")));
RDebugUtils.currentLine=64028822;
 //BA.debugLineNum = 64028822;BA.debugLine="If RefExp=m.Get(\"ReferenciaExpedicionTranspor";
if (true) break;

case 32:
//if
this.state = 35;
if ((_refexp).equals(BA.ObjectToString(_m.Get((Object)("ReferenciaExpedicionTransporte"))))) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=64028826;
 //BA.debugLineNum = 64028826;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpedicio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblExpedicionesPeriodoTXT set NombreCliente=?, NombreResponsableCuenta=? where Referencia_x0020_1=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_micli.Get((Object)("NombreCliente")),_micli.Get((Object)("ResponsableCuenta")),(Object)(_refexp)}));
RDebugUtils.currentLine=64028827;
 //BA.debugLineNum = 64028827;BA.debugLine="Exit";
this.state = 36;
if (true) break;
 if (true) break;

case 35:
//C
this.state = 68;
;
 if (true) break;
if (true) break;

case 36:
//C
this.state = 37;
;
 if (true) break;

case 37:
//C
this.state = 65;
;
RDebugUtils.currentLine=64028831;
 //BA.debugLineNum = 64028831;BA.debugLine="nDoc=nDoc+1";
_ndoc = (int) (_ndoc+1);
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=64028834;
 //BA.debugLineNum = 64028834;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBa";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=64028835;
 //BA.debugLineNum = 64028835;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _senderfilter);
this.state = 69;
return;
case 69:
//C
this.state = 39;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=64028836;
 //BA.debugLineNum = 64028836;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("864028836","NonQuery: "+BA.ObjectToString(_success),0);
 if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=64028844;
 //BA.debugLineNum = 64028844;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=64028846;
 //BA.debugLineNum = 64028846;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblExpedicionesPeriodoTXT order by Fecha_x0020_Alta, NExped1, Nexped2");
RDebugUtils.currentLine=64028847;
 //BA.debugLineNum = 64028847;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=64028848;
 //BA.debugLineNum = 64028848;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _rsub);
this.state = 70;
return;
case 70:
//C
this.state = 40;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64028851;
 //BA.debugLineNum = 64028851;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=64028852;
 //BA.debugLineNum = 64028852;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 40:
//if
this.state = 58;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 42;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=64028853;
 //BA.debugLineNum = 64028853;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 43:
//if
this.state = 50;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=64028854;
 //BA.debugLineNum = 64028854;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=64028855;
 //BA.debugLineNum = 64028855;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 71;
return;
case 71:
//C
this.state = 46;
;
RDebugUtils.currentLine=64028857;
 //BA.debugLineNum = 64028857;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=64028858;
 //BA.debugLineNum = 64028858;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 72;
return;
case 72:
//C
this.state = 46;
_rint = (int) result[1];
;
RDebugUtils.currentLine=64028859;
 //BA.debugLineNum = 64028859;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 46:
//if
this.state = 49;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=64028860;
 //BA.debugLineNum = 64028860;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=64028861;
 //BA.debugLineNum = 64028861;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=64028864;
 //BA.debugLineNum = 64028864;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=64028866;
 //BA.debugLineNum = 64028866;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 50:
//if
this.state = 57;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=64028867;
 //BA.debugLineNum = 64028867;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
if (true) break;

case 53:
//if
this.state = 56;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=64028868;
 //BA.debugLineNum = 64028868;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay expe";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay expediciones de TXT en el periodo seleccionado","Aviso");
RDebugUtils.currentLine=64028869;
 //BA.debugLineNum = 64028869;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 73;
return;
case 73:
//C
this.state = 56;
;
RDebugUtils.currentLine=64028870;
 //BA.debugLineNum = 64028870;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=64028872;
 //BA.debugLineNum = 64028872;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=64028873;
 //BA.debugLineNum = 64028873;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 74;
return;
case 74:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=64028878;
 //BA.debugLineNum = 64028878;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Datos actualiz";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=64028879;
 //BA.debugLineNum = 64028879;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizardatos"), _msa);
this.state = 75;
return;
case 75:
//C
this.state = -1;
;
RDebugUtils.currentLine=64028881;
 //BA.debugLineNum = 64028881;BA.debugLine="ActualizarStatusExpedicionesNoEntregadas";
__ref._actualizarstatusexpedicionesnoentregadas /*void*/ (null);
RDebugUtils.currentLine=64028883;
 //BA.debugLineNum = 64028883;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=64290816;
 //BA.debugLineNum = 64290816;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=64290817;
 //BA.debugLineNum = 64290817;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=64290818;
 //BA.debugLineNum = 64290818;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=64290819;
 //BA.debugLineNum = 64290819;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpedicionesperiodobatch(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "documentosexpedicionesperiodobatch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpedicionesperiodobatch", null));}
ResumableSub_DocumentosExpedicionesPeriodoBatch rsub = new ResumableSub_DocumentosExpedicionesPeriodoBatch(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicionesPeriodoBatch extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPeriodoBatch(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
int _numregref1doc = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65536002;
 //BA.debugLineNum = 65536002;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=65536003;
 //BA.debugLineNum = 65536003;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=65536004;
 //BA.debugLineNum = 65536004;BA.debugLine="mResult.Put(\"Success\", False)";
_mresult.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=65536006;
 //BA.debugLineNum = 65536006;BA.debugLine="Dim NumRegRef1Doc As Int=Utilidades.FixNullInt(mS";
_numregref1doc = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblExpedicionesPeriodoTXT where Referencia_x0020_1<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{""}))));
RDebugUtils.currentLine=65536007;
 //BA.debugLineNum = 65536007;BA.debugLine="If NumRegRef1Doc=0 Then Return mResult";
if (true) break;

case 1:
//if
this.state = 6;
if (_numregref1doc==0) { 
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
RDebugUtils.currentLine=65536009;
 //BA.debugLineNum = 65536009;BA.debugLine="Wait For(CrearTablaTemporalDocumentosReferenciasT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), __ref._creartablatemporaldocumentosreferenciastte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 27;
return;
case 27:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65536010;
 //BA.debugLineNum = 65536010;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=65536011;
 //BA.debugLineNum = 65536011;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
if (true) break;

case 7:
//if
this.state = 12;
if ((_accion).equals("OK") == false) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=65536014;
 //BA.debugLineNum = 65536014;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=65536015;
 //BA.debugLineNum = 65536015;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=65536020;
 //BA.debugLineNum = 65536020;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select Refer";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select Referencia_x0020_1 from tblExpedicionesPeriodoTXT where Referencia_x0020_1<>? order by Referencia_x0020_1",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{""}));
RDebugUtils.currentLine=65536021;
 //BA.debugLineNum = 65536021;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 13:
//do while
this.state = 16;
while (_rs.NextRow()) {
this.state = 15;
if (true) break;
}
if (true) break;

case 15:
//C
this.state = 13;
RDebugUtils.currentLine=65536023;
 //BA.debugLineNum = 65536023;BA.debugLine="Log(\"Referencia_x0020_1 \" & rs.GetString(\"Refere";
parent.__c.LogImpl("865536023","Referencia_x0020_1 "+_rs.GetString("Referencia_x0020_1"),0);
RDebugUtils.currentLine=65536025;
 //BA.debugLineNum = 65536025;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarDatosTablaTemporalDocumentosReferenciasTte",new Object[]{(Object)(_rs.GetString("Referencia_x0020_1"))});
RDebugUtils.currentLine=65536026;
 //BA.debugLineNum = 65536026;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=65536028;
 //BA.debugLineNum = 65536028;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=65536029;
 //BA.debugLineNum = 65536029;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 28;
return;
case 28:
//C
this.state = 17;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=65536030;
 //BA.debugLineNum = 65536030;BA.debugLine="If Success=False Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_success==parent.__c.False) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=65536031;
 //BA.debugLineNum = 65536031;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.","Error");
RDebugUtils.currentLine=65536032;
 //BA.debugLineNum = 65536032;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 20;
;
RDebugUtils.currentLine=65536033;
 //BA.debugLineNum = 65536033;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=65536036;
 //BA.debugLineNum = 65536036;BA.debugLine="Wait For(DocumentosExpedicionesPeriodo) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodobatch"), __ref._documentosexpedicionesperiodo /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65536037;
 //BA.debugLineNum = 65536037;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=65536038;
 //BA.debugLineNum = 65536038;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
if (true) break;

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
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=65536040;
 //BA.debugLineNum = 65536040;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=65536041;
 //BA.debugLineNum = 65536041;BA.debugLine="mResult.put(\"Success\", True)";
_mresult.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=65536042;
 //BA.debugLineNum = 65536042;BA.debugLine="mResult.put(\"lstReg\", lstReg)";
_mresult.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=65536044;
 //BA.debugLineNum = 65536044;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=65536045;
 //BA.debugLineNum = 65536045;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _eliminartablatemporaldocumentosreferenciastte(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "eliminartablatemporaldocumentosreferenciastte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "eliminartablatemporaldocumentosreferenciastte", null));}
ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=65732609;
 //BA.debugLineNum = 65732609;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"E";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EliminarTablaTemporalDocumentosReferenciasTte",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=65732610;
 //BA.debugLineNum = 65732610;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "eliminartablatemporaldocumentosreferenciastte"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=65732616;
 //BA.debugLineNum = 65732616;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=65732617;
 //BA.debugLineNum = 65732617;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _clienteresponsablecuentadocumento(b4j.docU.cexpedicionesperiodotxt __ref,String _doc) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "clienteresponsablecuentadocumento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "clienteresponsablecuentadocumento", new Object[] {_doc}));}
ResumableSub_ClienteResponsableCuentaDocumento rsub = new ResumableSub_ClienteResponsableCuentaDocumento(this,__ref,_doc);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ClienteResponsableCuentaDocumento extends BA.ResumableSub {
public ResumableSub_ClienteResponsableCuentaDocumento(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref,String _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
String _doc;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65798145;
 //BA.debugLineNum = 65798145;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=65798148;
 //BA.debugLineNum = 65798148;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=65798149;
 //BA.debugLineNum = 65798149;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=65798152;
 //BA.debugLineNum = 65798152;BA.debugLine="Dim comando As String";
_comando = "";
RDebugUtils.currentLine=65798153;
 //BA.debugLineNum = 65798153;BA.debugLine="Select True";
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
RDebugUtils.currentLine=65798155;
 //BA.debugLineNum = 65798155;BA.debugLine="comando=\"ClienteResponsableCuentaALBV\"";
_comando = "ClienteResponsableCuentaALBV";
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=65798157;
 //BA.debugLineNum = 65798157;BA.debugLine="comando=\"ClienteResponsableCuentaRT\"";
_comando = "ClienteResponsableCuentaRT";
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=65798159;
 //BA.debugLineNum = 65798159;BA.debugLine="Accion=\"ErrTipoDoc\"";
_accion = "ErrTipoDoc";
RDebugUtils.currentLine=65798160;
 //BA.debugLineNum = 65798160;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=65798161;
 //BA.debugLineNum = 65798161;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=65798163;
 //BA.debugLineNum = 65798163;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_doc)},parent);
RDebugUtils.currentLine=65798165;
 //BA.debugLineNum = 65798165;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "clienteresponsablecuentadocumento"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65798166;
 //BA.debugLineNum = 65798166;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=65798167;
 //BA.debugLineNum = 65798167;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=65798168;
 //BA.debugLineNum = 65798168;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "clienteresponsablecuentadocumento"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
RDebugUtils.currentLine=65798169;
 //BA.debugLineNum = 65798169;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=65798170;
 //BA.debugLineNum = 65798170;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=65798173;
 //BA.debugLineNum = 65798173;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=65798174;
 //BA.debugLineNum = 65798174;BA.debugLine="Accion=\"SinResultado\"";
_accion = "SinResultado";
RDebugUtils.currentLine=65798175;
 //BA.debugLineNum = 65798175;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=65798177;
 //BA.debugLineNum = 65798177;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=65798178;
 //BA.debugLineNum = 65798178;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=65798179;
 //BA.debugLineNum = 65798179;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=65798180;
 //BA.debugLineNum = 65798180;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=65798184;
 //BA.debugLineNum = 65798184;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=65798185;
 //BA.debugLineNum = 65798185;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizarstatusexpedicionesnoentregadas(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "actualizarstatusexpedicionesnoentregadas", false))
	 {Debug.delegate(ba, "actualizarstatusexpedicionesnoentregadas", null); return;}
ResumableSub_ActualizarStatusExpedicionesNoEntregadas rsub = new ResumableSub_ActualizarStatusExpedicionesNoEntregadas(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarStatusExpedicionesNoEntregadas extends BA.ResumableSub {
public ResumableSub_ActualizarStatusExpedicionesNoEntregadas(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
Object _msa = null;
int _rint = 0;
int _numexpptes = 0;
int _intervalo = 0;
int _idxaqctestados = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsestados = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstdatosestadosexpedicion = null;
anywheresoftware.b4a.objects.collections.Map _mdataestado = null;
String _estadoexp = "";
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65470465;
 //BA.debugLineNum = 65470465;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualizar";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Actualizar Status expediciones pendientes de entrega?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=65470466;
 //BA.debugLineNum = 65470466;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=65470468;
 //BA.debugLineNum = 65470468;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=65470470;
 //BA.debugLineNum = 65470470;BA.debugLine="Dim NumExpPtes As Int=mSQL.ExecQuerySingleResult2";
_numexpptes = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblExpedicionesPeriodoTXT where Entregado=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"NO"}))));
RDebugUtils.currentLine=65470471;
 //BA.debugLineNum = 65470471;BA.debugLine="Dim Intervalo As Int=100/NumExpPtes";
_intervalo = (int) (100/(double)_numexpptes);
RDebugUtils.currentLine=65470472;
 //BA.debugLineNum = 65470472;BA.debugLine="jamCircularProgressBar1.Visible=True";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvisible /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=65470473;
 //BA.debugLineNum = 65470473;BA.debugLine="Dim iDxAQctEstados As Int";
_idxaqctestados = 0;
RDebugUtils.currentLine=65470474;
 //BA.debugLineNum = 65470474;BA.debugLine="Dim rsEstados As ResultSet=mSQL.ExecQuery2(\"selec";
_rsestados = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsestados = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select * from tblExpedicionesPeriodoTXT where Entregado=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"NO"}));
RDebugUtils.currentLine=65470475;
 //BA.debugLineNum = 65470475;BA.debugLine="Do While rsEstados.NextRow";
if (true) break;

case 7:
//do while
this.state = 16;
while (_rsestados.NextRow()) {
this.state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=65470476;
 //BA.debugLineNum = 65470476;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(rsE";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), parent._cmauxtxt._obtenerestadoexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_rsestados.GetString("CODORIGEN"),_rsestados.GetString("CODDESTIN"),_rsestados.GetInt("NEXPED1"),_rsestados.GetInt("NEXPED2"),_rsestados.GetString("ANO")));
this.state = 37;
return;
case 37:
//C
this.state = 10;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65470477;
 //BA.debugLineNum = 65470477;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=65470478;
 //BA.debugLineNum = 65470478;BA.debugLine="If Accion<>\"OK\" Then";
if (true) break;

case 10:
//if
this.state = 15;
if ((_accion).equals("OK") == false) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=65470485;
 //BA.debugLineNum = 65470485;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=65470486;
 //BA.debugLineNum = 65470486;BA.debugLine="Dim mDataEstado As Map=lstDatosEstadosExpedicio";
_mdataestado = new anywheresoftware.b4a.objects.collections.Map();
_mdataestado = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatosestadosexpedicion.Get((int) (0))));
RDebugUtils.currentLine=65470487;
 //BA.debugLineNum = 65470487;BA.debugLine="Dim EstadoExp As String=mDataEstado.Get(\"ESTADO";
_estadoexp = BA.ObjectToString(_mdataestado.Get((Object)("ESTADO")));
RDebugUtils.currentLine=65470491;
 //BA.debugLineNum = 65470491;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpediciones";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblExpedicionesPeriodoTXT set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadoexp),(Object)(_rsestados.GetString("CODORIGEN")),(Object)(_rsestados.GetString("CODDESTIN")),(Object)(_rsestados.GetInt("NEXPED1")),(Object)(_rsestados.GetInt("NEXPED2")),(Object)(_rsestados.GetString("ANO"))}));
 if (true) break;

case 15:
//C
this.state = 7;
;
RDebugUtils.currentLine=65470494;
 //BA.debugLineNum = 65470494;BA.debugLine="iDxAQctEstados=iDxAQctEstados+1";
_idxaqctestados = (int) (_idxaqctestados+1);
RDebugUtils.currentLine=65470495;
 //BA.debugLineNum = 65470495;BA.debugLine="jamCircularProgressBar1.Value=Floor(iDxAQctEstad";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (parent.__c.Floor(_idxaqctestados*_intervalo)));
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=65470497;
 //BA.debugLineNum = 65470497;BA.debugLine="rsEstados.Close";
_rsestados.Close();
RDebugUtils.currentLine=65470499;
 //BA.debugLineNum = 65470499;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=65470500;
 //BA.debugLineNum = 65470500;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _senderfilter);
this.state = 38;
return;
case 38:
//C
this.state = 17;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=65470501;
 //BA.debugLineNum = 65470501;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("865470501","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=65470504;
 //BA.debugLineNum = 65470504;BA.debugLine="jamCircularProgressBar1.Value=0";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (0));
RDebugUtils.currentLine=65470505;
 //BA.debugLineNum = 65470505;BA.debugLine="jamCircularProgressBar1.Visible=False";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvisible /*boolean*/ (null,parent.__c.False);
RDebugUtils.currentLine=65470507;
 //BA.debugLineNum = 65470507;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblExpedicionesPeriodoTXT order by Fecha_x0020_Alta, NExped1, Nexped2");
RDebugUtils.currentLine=65470508;
 //BA.debugLineNum = 65470508;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=65470509;
 //BA.debugLineNum = 65470509;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _rsub);
this.state = 39;
return;
case 39:
//C
this.state = 17;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65470510;
 //BA.debugLineNum = 65470510;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=65470511;
 //BA.debugLineNum = 65470511;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=65470512;
 //BA.debugLineNum = 65470512;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 17:
//if
this.state = 35;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=65470513;
 //BA.debugLineNum = 65470513;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 20:
//if
this.state = 27;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=65470514;
 //BA.debugLineNum = 65470514;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=65470515;
 //BA.debugLineNum = 65470515;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 23;
;
RDebugUtils.currentLine=65470517;
 //BA.debugLineNum = 65470517;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=65470518;
 //BA.debugLineNum = 65470518;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 23;
_rint = (int) result[1];
;
RDebugUtils.currentLine=65470519;
 //BA.debugLineNum = 65470519;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=65470520;
 //BA.debugLineNum = 65470520;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=65470521;
 //BA.debugLineNum = 65470521;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=65470524;
 //BA.debugLineNum = 65470524;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=65470526;
 //BA.debugLineNum = 65470526;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 27:
//if
this.state = 34;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=65470527;
 //BA.debugLineNum = 65470527;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
if (true) break;

case 30:
//if
this.state = 33;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=65470528;
 //BA.debugLineNum = 65470528;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay Exp";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay Expediciones de TXT sin entregar.\n"+"(¿Error en webservice?)"),"Aviso");
RDebugUtils.currentLine=65470530;
 //BA.debugLineNum = 65470530;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 33;
;
RDebugUtils.currentLine=65470531;
 //BA.debugLineNum = 65470531;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 33:
//C
this.state = 34;
;
RDebugUtils.currentLine=65470533;
 //BA.debugLineNum = 65470533;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=65470534;
 //BA.debugLineNum = 65470534;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "actualizarstatusexpedicionesnoentregadas"), _msa);
this.state = 43;
return;
case 43:
//C
this.state = 34;
;
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
RDebugUtils.currentLine=65470538;
 //BA.debugLineNum = 65470538;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _actualizarestadoexpedicion(b4j.docU.cexpedicionesperiodotxt __ref,int _idxitem,anywheresoftware.b4a.objects.collections.Map _mdata,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "actualizarestadoexpedicion", false))
	 {return ((String) Debug.delegate(ba, "actualizarestadoexpedicion", new Object[] {_idxitem,_mdata,_lstestadosexpedicion}));}
anywheresoftware.b4a.objects.collections.Map _mdataestadoactual = null;
String _estadoactual = "";
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
boolean _entregado = false;
anywheresoftware.b4a.objects.B4XViewWrapper _xnent = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xne = null;
RDebugUtils.currentLine=65077248;
 //BA.debugLineNum = 65077248;BA.debugLine="Sub ActualizarEstadoExpedicion(IDxItem As Int, mDa";
RDebugUtils.currentLine=65077250;
 //BA.debugLineNum = 65077250;BA.debugLine="For Each mDataEstadoActual As Map In lstEstadosEx";
_mdataestadoactual = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _lstestadosexpedicion;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mdataestadoactual = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
RDebugUtils.currentLine=65077251;
 //BA.debugLineNum = 65077251;BA.debugLine="Log(mDataEstadoActual)";
__c.LogImpl("865077251",BA.ObjectToString(_mdataestadoactual),0);
 }
};
RDebugUtils.currentLine=65077253;
 //BA.debugLineNum = 65077253;BA.debugLine="Dim EstadoActual As String=mDataEstadoActual.Get(";
_estadoactual = BA.ObjectToString(_mdataestadoactual.Get((Object)("ESTADO")));
RDebugUtils.currentLine=65077257;
 //BA.debugLineNum = 65077257;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesPeriodo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblExpedicionesPeriodoTXT set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadoactual),_mdata.Get((Object)("CODORIGEN")),_mdata.Get((Object)("CODDESTIN")),_mdata.Get((Object)("NEXPED1")),_mdata.Get((Object)("NEXPED2")),_mdata.Get((Object)("ANO"))}));
RDebugUtils.currentLine=65077259;
 //BA.debugLineNum = 65077259;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set EstadoActual=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadoactual),_mdata.Get((Object)("CODORIGEN")),_mdata.Get((Object)("CODDESTIN")),_mdata.Get((Object)("NEXPED1")),_mdata.Get((Object)("NEXPED2")),_mdata.Get((Object)("ANO"))}));
RDebugUtils.currentLine=65077263;
 //BA.debugLineNum = 65077263;BA.debugLine="Dim p As B4XView=JamTableCLV1.GetPanel(IDxItem)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_idxitem);
RDebugUtils.currentLine=65077264;
 //BA.debugLineNum = 65077264;BA.debugLine="Dim Entregado As Boolean";
_entregado = false;
RDebugUtils.currentLine=65077265;
 //BA.debugLineNum = 65077265;BA.debugLine="For Each xNEnt As B4XView In p.GetAllViewsRecursi";
_xnent = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group9 = _p.GetAllViewsRecursive();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_xnent = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group9.Get(index9)));
RDebugUtils.currentLine=65077266;
 //BA.debugLineNum = 65077266;BA.debugLine="If xNEnt.Tag=\"Entregado\" Then";
if ((_xnent.getTag()).equals((Object)("Entregado"))) { 
RDebugUtils.currentLine=65077267;
 //BA.debugLineNum = 65077267;BA.debugLine="Entregado=xNEnt.text=\"SI\"";
_entregado = (_xnent.getText()).equals("SI");
RDebugUtils.currentLine=65077268;
 //BA.debugLineNum = 65077268;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=65077271;
 //BA.debugLineNum = 65077271;BA.debugLine="For Each xNE As B4XView In p.GetAllViewsRecursive";
_xne = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group15 = _p.GetAllViewsRecursive();
final int groupLen15 = group15.getSize()
;int index15 = 0;
;
for (; index15 < groupLen15;index15++){
_xne = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group15.Get(index15)));
RDebugUtils.currentLine=65077272;
 //BA.debugLineNum = 65077272;BA.debugLine="If xNE.Tag=\"EstadoActual\" Then";
if ((_xne.getTag()).equals((Object)("EstadoActual"))) { 
RDebugUtils.currentLine=65077273;
 //BA.debugLineNum = 65077273;BA.debugLine="xNE.Text=EstadoActual";
_xne.setText(_estadoactual);
RDebugUtils.currentLine=65077274;
 //BA.debugLineNum = 65077274;BA.debugLine="If Entregado Then";
if (_entregado) { 
RDebugUtils.currentLine=65077275;
 //BA.debugLineNum = 65077275;BA.debugLine="xNE.TextColor=xui.Color_Blue";
_xne.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
 }else {
RDebugUtils.currentLine=65077277;
 //BA.debugLineNum = 65077277;BA.debugLine="xNE.TextColor=0xFFDC143C";
_xne.setTextColor(((int)0xffdc143c));
 };
RDebugUtils.currentLine=65077279;
 //BA.debugLineNum = 65077279;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=65077283;
 //BA.debugLineNum = 65077283;BA.debugLine="End Sub";
return "";
}
public void  _btnaccionesexpedicionsinentregar_click(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "btnaccionesexpedicionsinentregar_click", false))
	 {Debug.delegate(ba, "btnaccionesexpedicionsinentregar_click", null); return;}
ResumableSub_btnAccionesExpedicionSinEntregar_Click rsub = new ResumableSub_btnAccionesExpedicionSinEntregar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAccionesExpedicionSinEntregar_Click extends BA.ResumableSub {
public ResumableSub_btnAccionesExpedicionSinEntregar_Click(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
float _offset_before_dialog = 0f;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _opcionsel = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstdatosestadosexpedicion = null;
anywheresoftware.b4a.objects.collections.List _lstdatosincidenciasexpedicion = null;
String _nexped1 = "";
String _numexpedicion = "";
String _urltxt = "";
Object _msa = null;
int _idtransportetxt = 0;
String _numexpediciontxtmysql = "";
int step30;
int limit30;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64815105;
 //BA.debugLineNum = 64815105;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=64815106;
 //BA.debugLineNum = 64815106;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=64815107;
 //BA.debugLineNum = 64815107;BA.debugLine="Log(mData)";
parent.__c.LogImpl("864815107",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=64815108;
 //BA.debugLineNum = 64815108;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=64815110;
 //BA.debugLineNum = 64815110;BA.debugLine="JamTableCLV1.SeleccionarItem(IndexSel)";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._seleccionaritem /*String*/ (null,_indexsel);
RDebugUtils.currentLine=64815112;
 //BA.debugLineNum = 64815112;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=64815114;
 //BA.debugLineNum = 64815114;BA.debugLine="Dialog.Title=\"Selecciona Acción\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Acción");
RDebugUtils.currentLine=64815115;
 //BA.debugLineNum = 64815115;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=64815116;
 //BA.debugLineNum = 64815116;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=64815117;
 //BA.debugLineNum = 64815117;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=64815118;
 //BA.debugLineNum = 64815118;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=64815119;
 //BA.debugLineNum = 64815119;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=64815121;
 //BA.debugLineNum = 64815121;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=64815122;
 //BA.debugLineNum = 64815122;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=64815123;
 //BA.debugLineNum = 64815123;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=64815125;
 //BA.debugLineNum = 64815125;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=64815126;
 //BA.debugLineNum = 64815126;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=64815128;
 //BA.debugLineNum = 64815128;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=64815129;
 //BA.debugLineNum = 64815129;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=64815130;
 //BA.debugLineNum = 64815130;BA.debugLine="lstOpciones.Add(\"Actualizar Estado Expedición\")";
_lstopciones.Add((Object)("Actualizar Estado Expedición"));
RDebugUtils.currentLine=64815131;
 //BA.debugLineNum = 64815131;BA.debugLine="lstOpciones.Add(\"Histórico Estados Expedición\")";
_lstopciones.Add((Object)("Histórico Estados Expedición"));
RDebugUtils.currentLine=64815132;
 //BA.debugLineNum = 64815132;BA.debugLine="lstOpciones.Add(\"Consulta Incidencias Expedición\"";
_lstopciones.Add((Object)("Consulta Incidencias Expedición"));
RDebugUtils.currentLine=64815133;
 //BA.debugLineNum = 64815133;BA.debugLine="lstOpciones.Add(\"Ficha Expedición Web TXT\")";
_lstopciones.Add((Object)("Ficha Expedición Web TXT"));
RDebugUtils.currentLine=64815134;
 //BA.debugLineNum = 64815134;BA.debugLine="lstOpciones.Add(\"Documentos NAV de la expedición\"";
_lstopciones.Add((Object)("Documentos NAV de la expedición"));
RDebugUtils.currentLine=64815136;
 //BA.debugLineNum = 64815136;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=64815139;
 //BA.debugLineNum = 64815139;BA.debugLine="B4XListDlg.Resize(500dip, 400dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (500)),parent.__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=64815140;
 //BA.debugLineNum = 64815140;BA.debugLine="B4XListDlg.CustomListView1.AsView.width=500dip";
_b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ._asview().setWidth(parent.__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=64815141;
 //BA.debugLineNum = 64815141;BA.debugLine="B4XListDlg.CustomListView1.AsView.Height=400dip";
_b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ._asview().setHeight(parent.__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=64815143;
 //BA.debugLineNum = 64815143;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=64815145;
 //BA.debugLineNum = 64815145;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step30 = 1;
limit30 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 61;
if (true) break;

case 61:
//C
this.state = 4;
if ((step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30)) this.state = 3;
if (true) break;

case 62:
//C
this.state = 61;
_i = ((int)(0 + _i + step30)) ;
if (true) break;

case 3:
//C
this.state = 62;
RDebugUtils.currentLine=64815146;
 //BA.debugLineNum = 64815146;BA.debugLine="xclv.ResizeItem(i,60dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (60)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=64815150;
 //BA.debugLineNum = 64815150;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=64815151;
 //BA.debugLineNum = 64815151;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=64815153;
 //BA.debugLineNum = 64815153;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=64815154;
 //BA.debugLineNum = 64815154;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=64815155;
 //BA.debugLineNum = 64815155;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=64815158;
 //BA.debugLineNum = 64815158;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), _rsub);
this.state = 63;
return;
case 63:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=64815160;
 //BA.debugLineNum = 64815160;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=64815163;
 //BA.debugLineNum = 64815163;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
this.state = 15;
;
RDebugUtils.currentLine=64815167;
 //BA.debugLineNum = 64815167;BA.debugLine="Dim OpcionSel As String=B4XListDlg.SelectedItem";
_opcionsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=64815169;
 //BA.debugLineNum = 64815169;BA.debugLine="Select Case OpcionSel";
if (true) break;

case 15:
//select
this.state = 60;
switch (BA.switchObjectToInt(_opcionsel,"Actualizar Estado Expedición","Histórico Estados Expedición","Consulta Incidencias Expedición","Ficha Expedición Web TXT","Documentos NAV de la expedición")) {
case 0: {
this.state = 17;
if (true) break;
}
case 1: {
this.state = 25;
if (true) break;
}
case 2: {
this.state = 33;
if (true) break;
}
case 3: {
this.state = 41;
if (true) break;
}
case 4: {
this.state = 59;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=64815172;
 //BA.debugLineNum = 64815172;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarpare";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitarparenttableclv /*String*/ (null);
RDebugUtils.currentLine=64815173;
 //BA.debugLineNum = 64815173;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(mD";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerestadoexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))),BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED1")))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED2")))),BA.ObjectToString(_mdata.Get((Object)("ANO")))));
this.state = 64;
return;
case 64:
//C
this.state = 18;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64815174;
 //BA.debugLineNum = 64815174;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=64815175;
 //BA.debugLineNum = 64815175;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=64815176;
 //BA.debugLineNum = 64815176;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 18:
//if
this.state = 23;
if ((_accion).equals("OK") == false) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
if (true) return ;
if (true) break;

case 23:
//C
this.state = 60;
;
RDebugUtils.currentLine=64815177;
 //BA.debugLineNum = 64815177;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=64815179;
 //BA.debugLineNum = 64815179;BA.debugLine="ActualizarEstadoExpedicion(IndexSel,mData, lstD";
__ref._actualizarestadoexpedicion /*String*/ (null,_indexsel,_mdata,_lstdatosestadosexpedicion);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=64815182;
 //BA.debugLineNum = 64815182;BA.debugLine="Wait For(cmAuxTxT.ObtenerHistoricoEstadosExpedi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerhistoricoestadosexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))),BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED1")))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED2")))),BA.ObjectToString(_mdata.Get((Object)("ANO")))));
this.state = 65;
return;
case 65:
//C
this.state = 26;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64815183;
 //BA.debugLineNum = 64815183;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=64815184;
 //BA.debugLineNum = 64815184;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 26:
//if
this.state = 31;
if ((_accion).equals("OK") == false) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) return ;
if (true) break;

case 31:
//C
this.state = 60;
;
RDebugUtils.currentLine=64815185;
 //BA.debugLineNum = 64815185;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=64815186;
 //BA.debugLineNum = 64815186;BA.debugLine="MostrarHistoricoEstadosExpedicion(lstDatosEstad";
__ref._mostrarhistoricoestadosexpedicion /*void*/ (null,_lstdatosestadosexpedicion);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=64815188;
 //BA.debugLineNum = 64815188;BA.debugLine="Wait For(cmAuxTxT.ObtenerConsultaIncidenciasExp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerconsultaincidenciasexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))),BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED1")))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED2")))),BA.ObjectToString(_mdata.Get((Object)("ANO")))));
this.state = 66;
return;
case 66:
//C
this.state = 34;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64815189;
 //BA.debugLineNum = 64815189;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=64815190;
 //BA.debugLineNum = 64815190;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 34:
//if
this.state = 39;
if ((_accion).equals("OK") == false) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
if (true) return ;
if (true) break;

case 39:
//C
this.state = 60;
;
RDebugUtils.currentLine=64815191;
 //BA.debugLineNum = 64815191;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List=mRes.";
_lstdatosincidenciasexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosincidenciasexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=64815192;
 //BA.debugLineNum = 64815192;BA.debugLine="MostrarIncidenciasExpedicion(lstDatosIncidencia";
__ref._mostrarincidenciasexpedicion /*String*/ (null,_lstdatosincidenciasexpedicion);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=64815196;
 //BA.debugLineNum = 64815196;BA.debugLine="Dim nExped1 As String=mData.Get(\"NEXPED1\")";
_nexped1 = BA.ObjectToString(_mdata.Get((Object)("NEXPED1")));
RDebugUtils.currentLine=64815197;
 //BA.debugLineNum = 64815197;BA.debugLine="If nExped1=\"0\" Then nExped1=\"000\"";
if (true) break;

case 42:
//if
this.state = 47;
if ((_nexped1).equals("0")) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
_nexped1 = "000";
if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=64815198;
 //BA.debugLineNum = 64815198;BA.debugLine="Dim NumExpedicion As String=$\"${mData.Get(\"CODE";
_numexpedicion = (""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("CODEMPRESA")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("CODORIGEN")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("CODDESTIN")))+""+parent.__c.SmartStringFormatter("",(Object)(_nexped1))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("NEXPED2")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("ANO")))+"");
RDebugUtils.currentLine=64815199;
 //BA.debugLineNum = 64815199;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerurltrazabilidadexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_numexpedicion));
this.state = 67;
return;
case 67:
//C
this.state = 48;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64815200;
 //BA.debugLineNum = 64815200;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=64815201;
 //BA.debugLineNum = 64815201;BA.debugLine="If Accion=\"OK\" Then";
if (true) break;

case 48:
//if
this.state = 57;
if ((_accion).equals("OK")) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=64815202;
 //BA.debugLineNum = 64815202;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
_urltxt = BA.ObjectToString(_mres.Get((Object)("URL")));
RDebugUtils.currentLine=64815203;
 //BA.debugLineNum = 64815203;BA.debugLine="If URLtxt<>\"\" Then";
if (true) break;

case 51:
//if
this.state = 56;
if ((_urltxt).equals("") == false) { 
this.state = 53;
}else {
this.state = 55;
}if (true) break;

case 53:
//C
this.state = 56;
RDebugUtils.currentLine=64815204;
 //BA.debugLineNum = 64815204;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .ShowExternalDocument(_urltxt);
 if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=64815206;
 //BA.debugLineNum = 64815206;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Método Url";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Método UrlTracking TXT devuelve cadena vacía.","Error");
RDebugUtils.currentLine=64815207;
 //BA.debugLineNum = 64815207;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnaccionesexpedicionsinentregar_click"), _msa);
this.state = 68;
return;
case 68:
//C
this.state = 56;
;
 if (true) break;

case 56:
//C
this.state = 57;
;
 if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=64815212;
 //BA.debugLineNum = 64815212;BA.debugLine="Dim IDTransporteTXT As Int=7";
_idtransportetxt = (int) (7);
RDebugUtils.currentLine=64815213;
 //BA.debugLineNum = 64815213;BA.debugLine="Dim NumExpedicionTXTMySQL As String=\"001\" & mDa";
_numexpediciontxtmysql = "001"+BA.ObjectToString(_mdata.Get((Object)("CODORIGEN")))+"000"+BA.ObjectToString(_mdata.Get((Object)("NEXPED1")))+BA.ObjectToString(_mdata.Get((Object)("NEXPED2")))+BA.ObjectToString(_mdata.Get((Object)("ANO")));
RDebugUtils.currentLine=64815214;
 //BA.debugLineNum = 64815214;BA.debugLine="DatosExpedicionInternaExpedicionTransporte(IDTr";
__ref._datosexpedicioninternaexpediciontransporte /*void*/ (null,_idtransportetxt,_numexpediciontxtmysql);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=64815216;
 //BA.debugLineNum = 64815216;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarhistoricoestadosexpedicion(b4j.docU.cexpedicionesperiodotxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "mostrarhistoricoestadosexpedicion", false))
	 {Debug.delegate(ba, "mostrarhistoricoestadosexpedicion", new Object[] {_lstestadosexpedicion}); return;}
ResumableSub_MostrarHistoricoEstadosExpedicion rsub = new ResumableSub_MostrarHistoricoEstadosExpedicion(this,__ref,_lstestadosexpedicion);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarHistoricoEstadosExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarHistoricoEstadosExpedicion(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.List _lstestadosaj = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
long _ticksfecha = 0L;
anywheresoftware.b4a.objects.collections.Map _mdataaj = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pbaseflexgrid = null;
anywheresoftware.b4j.objects.JFX.FontWrapper _headersfont = null;
anywheresoftware.b4j.objects.JFX.FontWrapper _rowsfont = null;
int _numcolumnastablatotales = 0;
int[] _anchoscolumnas = null;
int _colindex = 0;
String _k = "";
int _anchocolumna = 0;
anywheresoftware.b4a.objects.collections.Map _mdatos = null;
String[] _fila = null;
int _anchototaltabla = 0;
int _rowindex = 0;
int _altototal = 0;
float _offset_before_dialog = 0f;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
int _result = 0;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;
anywheresoftware.b4a.BA.IterableList group34;
int index34;
int groupLen34;
anywheresoftware.b4a.BA.IterableList group37;
int index37;
int groupLen37;
int step49;
int limit49;
int step53;
int limit53;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65142785;
 //BA.debugLineNum = 65142785;BA.debugLine="If lstEstadosExpedicion.Size=0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_lstestadosexpedicion.getSize()==0) { 
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
RDebugUtils.currentLine=65142787;
 //BA.debugLineNum = 65142787;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=65142788;
 //BA.debugLineNum = 65142788;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
RDebugUtils.currentLine=65142790;
 //BA.debugLineNum = 65142790;BA.debugLine="Dim lstEstadosAj As List";
_lstestadosaj = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=65142791;
 //BA.debugLineNum = 65142791;BA.debugLine="lstEstadosAj.Initialize";
_lstestadosaj.Initialize();
RDebugUtils.currentLine=65142792;
 //BA.debugLineNum = 65142792;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
if (true) break;

case 7:
//for
this.state = 10;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group6 = _lstestadosexpedicion;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 10;
if (index6 < groupLen6) {
this.state = 9;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));}
if (true) break;

case 38:
//C
this.state = 37;
index6++;
if (true) break;

case 9:
//C
this.state = 38;
RDebugUtils.currentLine=65142796;
 //BA.debugLineNum = 65142796;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
RDebugUtils.currentLine=65142797;
 //BA.debugLineNum = 65142797;BA.debugLine="Dim TicksFecha As Long=DateTime.DateParse(mData.";
_ticksfecha = parent.__c.DateTime.DateParse(BA.ObjectToString(_mdata.Get((Object)("FECHAESTADO"))));
RDebugUtils.currentLine=65142798;
 //BA.debugLineNum = 65142798;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=65142799;
 //BA.debugLineNum = 65142799;BA.debugLine="Dim mDataAj As Map=CreateMap(\"Centro\":mData.Get(";
_mdataaj = new anywheresoftware.b4a.objects.collections.Map();
_mdataaj = parent.__c.createMap(new Object[] {(Object)("Centro"),_mdata.Get((Object)("CENTRO")),(Object)("Estado"),_mdata.Get((Object)("ESTADO")),(Object)("Fecha"),(Object)(parent.__c.DateTime.Date(_ticksfecha)+" "+parent.__c.DateTime.Time(_ticksfecha))});
RDebugUtils.currentLine=65142800;
 //BA.debugLineNum = 65142800;BA.debugLine="lstEstadosAj.Add(mDataAj)";
_lstestadosaj.Add((Object)(_mdataaj.getObject()));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=65142802;
 //BA.debugLineNum = 65142802;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=65142804;
 //BA.debugLineNum = 65142804;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
_pbaseflexgrid = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbaseflexgrid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=65142805;
 //BA.debugLineNum = 65142805;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (500)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY())));
RDebugUtils.currentLine=65142807;
 //BA.debugLineNum = 65142807;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
_pbaseflexgrid.LoadLayout("scrDialogFlexGrid",ba);
RDebugUtils.currentLine=65142809;
 //BA.debugLineNum = 65142809;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
_headersfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_headersfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15)).getObject()));
RDebugUtils.currentLine=65142810;
 //BA.debugLineNum = 65142810;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv7((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject())));
RDebugUtils.currentLine=65142812;
 //BA.debugLineNum = 65142812;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
_rowsfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_rowsfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)).getObject()));
RDebugUtils.currentLine=65142813;
 //BA.debugLineNum = 65142813;BA.debugLine="FlexGridDialog.Font=RowsFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject())));
RDebugUtils.currentLine=65142814;
 //BA.debugLineNum = 65142814;BA.debugLine="Dim NumColumnasTablaTotales As Int=mDataAj.Size";
_numcolumnastablatotales = _mdataaj.getSize();
RDebugUtils.currentLine=65142815;
 //BA.debugLineNum = 65142815;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
_anchoscolumnas = new int[_numcolumnastablatotales];
;
RDebugUtils.currentLine=65142816;
 //BA.debugLineNum = 65142816;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv1(_numcolumnastablatotales);
RDebugUtils.currentLine=65142817;
 //BA.debugLineNum = 65142817;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=65142819;
 //BA.debugLineNum = 65142819;BA.debugLine="For Each k As String In mDataAj.Keys";
if (true) break;

case 11:
//for
this.state = 18;
group25 = _mdataaj.Keys();
index25 = 0;
groupLen25 = group25.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 18;
if (index25 < groupLen25) {
this.state = 13;
_k = BA.ObjectToString(group25.Get(index25));}
if (true) break;

case 40:
//C
this.state = 39;
index25++;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=65142821;
 //BA.debugLineNum = 65142821;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvv4(_colindex,_k);
RDebugUtils.currentLine=65142823;
 //BA.debugLineNum = 65142823;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=65142824;
 //BA.debugLineNum = 65142824;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
if (true) break;

case 14:
//if
this.state = 17;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=65142825;
 //BA.debugLineNum = 65142825;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=65142826;
 //BA.debugLineNum = 65142826;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 17:
//C
this.state = 40;
;
RDebugUtils.currentLine=65142829;
 //BA.debugLineNum = 65142829;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=65142832;
 //BA.debugLineNum = 65142832;BA.debugLine="For Each mDatos As Map In lstEstadosAj";

case 18:
//for
this.state = 29;
_mdatos = new anywheresoftware.b4a.objects.collections.Map();
group34 = _lstestadosaj;
index34 = 0;
groupLen34 = group34.getSize();
this.state = 41;
if (true) break;

case 41:
//C
this.state = 29;
if (index34 < groupLen34) {
this.state = 20;
_mdatos = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group34.Get(index34)));}
if (true) break;

case 42:
//C
this.state = 41;
index34++;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=65142833;
 //BA.debugLineNum = 65142833;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
_fila = new String[_numcolumnastablatotales];
java.util.Arrays.fill(_fila,"");
RDebugUtils.currentLine=65142834;
 //BA.debugLineNum = 65142834;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=65142835;
 //BA.debugLineNum = 65142835;BA.debugLine="For Each k As String In mDatos.Keys";
if (true) break;

case 21:
//for
this.state = 28;
group37 = _mdatos.Keys();
index37 = 0;
groupLen37 = group37.getSize();
this.state = 43;
if (true) break;

case 43:
//C
this.state = 28;
if (index37 < groupLen37) {
this.state = 23;
_k = BA.ObjectToString(group37.Get(index37));}
if (true) break;

case 44:
//C
this.state = 43;
index37++;
if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=65142836;
 //BA.debugLineNum = 65142836;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
_fila[_colindex] = BA.ObjectToString(_mdatos.Get((Object)(_k)));
RDebugUtils.currentLine=65142837;
 //BA.debugLineNum = 65142837;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=65142838;
 //BA.debugLineNum = 65142838;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
if (true) break;

case 24:
//if
this.state = 27;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=65142839;
 //BA.debugLineNum = 65142839;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=65142840;
 //BA.debugLineNum = 65142840;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 27:
//C
this.state = 44;
;
RDebugUtils.currentLine=65142842;
 //BA.debugLineNum = 65142842;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 42;
;
RDebugUtils.currentLine=65142844;
 //BA.debugLineNum = 65142844;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._v7((Object[])(_fila),parent.__c.False);
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=65142848;
 //BA.debugLineNum = 65142848;BA.debugLine="Dim AnchoTotalTabla As Int";
_anchototaltabla = 0;
RDebugUtils.currentLine=65142849;
 //BA.debugLineNum = 65142849;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
if (true) break;

case 30:
//for
this.state = 33;
step49 = 1;
limit49 = (int) (_numcolumnastablatotales-1);
_colindex = (int) (0) ;
this.state = 45;
if (true) break;

case 45:
//C
this.state = 33;
if ((step49 > 0 && _colindex <= limit49) || (step49 < 0 && _colindex >= limit49)) this.state = 32;
if (true) break;

case 46:
//C
this.state = 45;
_colindex = ((int)(0 + _colindex + step49)) ;
if (true) break;

case 32:
//C
this.state = 46;
RDebugUtils.currentLine=65142850;
 //BA.debugLineNum = 65142850;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv5(_colindex,_anchoscolumnas[_colindex]);
RDebugUtils.currentLine=65142851;
 //BA.debugLineNum = 65142851;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
_anchototaltabla = (int) (_anchototaltabla+_anchoscolumnas[_colindex]);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=65142854;
 //BA.debugLineNum = 65142854;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";

case 33:
//for
this.state = 36;
step53 = 1;
limit53 = (int) (__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6()-1);
_rowindex = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 36;
if ((step53 > 0 && _rowindex <= limit53) || (step53 < 0 && _rowindex >= limit53)) this.state = 35;
if (true) break;

case 48:
//C
this.state = 47;
_rowindex = ((int)(0 + _rowindex + step53)) ;
if (true) break;

case 35:
//C
this.state = 48;
RDebugUtils.currentLine=65142855;
 //BA.debugLineNum = 65142855;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvvvv5(_rowindex,parent.__c.DipToCurrent((int) (50)));
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=65142857;
 //BA.debugLineNum = 65142857;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
_altototal = (int) (parent.__c.Min(parent.__c.DipToCurrent((int) (50))*(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6())+parent.__c.DipToCurrent((int) (50)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY()))));
RDebugUtils.currentLine=65142858;
 //BA.debugLineNum = 65142858;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setWidth(_anchototaltabla);
RDebugUtils.currentLine=65142859;
 //BA.debugLineNum = 65142859;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setHeight(_altototal);
RDebugUtils.currentLine=65142861;
 //BA.debugLineNum = 65142861;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,_anchototaltabla+parent.__c.DipToCurrent((int) (30)),_altototal+parent.__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=65142863;
 //BA.debugLineNum = 65142863;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "mostrarhistoricoestadosexpedicion"),(int) (100));
this.state = 49;
return;
case 49:
//C
this.state = -1;
;
RDebugUtils.currentLine=65142864;
 //BA.debugLineNum = 65142864;BA.debugLine="FlexGridDialog.Invalidate";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvv1();
RDebugUtils.currentLine=65142866;
 //BA.debugLineNum = 65142866;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=65142868;
 //BA.debugLineNum = 65142868;BA.debugLine="Dialog.Title=\"Histórico Estados Expedición\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Histórico Estados Expedición");
RDebugUtils.currentLine=65142869;
 //BA.debugLineNum = 65142869;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_pbaseflexgrid,(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=65142870;
 //BA.debugLineNum = 65142870;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=65142871;
 //BA.debugLineNum = 65142871;BA.debugLine="bOK.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=65142872;
 //BA.debugLineNum = 65142872;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "mostrarhistoricoestadosexpedicion"), _rsub);
this.state = 50;
return;
case 50:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=65142874;
 //BA.debugLineNum = 65142874;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=65142875;
 //BA.debugLineNum = 65142875;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mostrarincidenciasexpedicion(b4j.docU.cexpedicionesperiodotxt __ref,anywheresoftware.b4a.objects.collections.List _lstincidenciasexpedicion) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "mostrarincidenciasexpedicion", false))
	 {return ((String) Debug.delegate(ba, "mostrarincidenciasexpedicion", new Object[] {_lstincidenciasexpedicion}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
RDebugUtils.currentLine=65208320;
 //BA.debugLineNum = 65208320;BA.debugLine="Sub MostrarIncidenciasExpedicion(lstIncidenciasExp";
RDebugUtils.currentLine=65208321;
 //BA.debugLineNum = 65208321;BA.debugLine="For Each mData As Map In lstIncidenciasExpedicion";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group1 = _lstincidenciasexpedicion;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));
RDebugUtils.currentLine=65208322;
 //BA.debugLineNum = 65208322;BA.debugLine="Log(mData)";
__c.LogImpl("865208322",BA.ObjectToString(_mdata),0);
 }
};
RDebugUtils.currentLine=65208326;
 //BA.debugLineNum = 65208326;BA.debugLine="End Sub";
return "";
}
public void  _datosexpedicioninternaexpediciontransporte(b4j.docU.cexpedicionesperiodotxt __ref,int _idtransporte,String _numexp) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "datosexpedicioninternaexpediciontransporte", false))
	 {Debug.delegate(ba, "datosexpedicioninternaexpediciontransporte", new Object[] {_idtransporte,_numexp}); return;}
ResumableSub_DatosExpedicionInternaExpedicionTransporte rsub = new ResumableSub_DatosExpedicionInternaExpedicionTransporte(this,__ref,_idtransporte,_numexp);
rsub.resume(ba, null);
}
public static class ResumableSub_DatosExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_DatosExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref,int _idtransporte,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
int _idtransporte;
String _numexp;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _docexp = "";
float _offset_before_dialog = 0f;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _docsel = "";
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group7;
int index7;
int groupLen7;
int step29;
int limit29;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64880641;
 //BA.debugLineNum = 64880641;BA.debugLine="Wait For(ExpedicionInternaExpedicionTransporte(ID";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "datosexpedicioninternaexpediciontransporte"), __ref._expedicioninternaexpediciontransporte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idtransporte,_numexp));
this.state = 39;
return;
case 39:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64880642;
 //BA.debugLineNum = 64880642;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=64880643;
 //BA.debugLineNum = 64880643;BA.debugLine="If Accion<>\"OK\" Then Return";
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
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=64880644;
 //BA.debugLineNum = 64880644;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=64880647;
 //BA.debugLineNum = 64880647;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=64880648;
 //BA.debugLineNum = 64880648;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=64880650;
 //BA.debugLineNum = 64880650;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 7:
//for
this.state = 14;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group7 = _lstreg;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 40;
if (true) break;

case 40:
//C
this.state = 14;
if (index7 < groupLen7) {
this.state = 9;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));}
if (true) break;

case 41:
//C
this.state = 40;
index7++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=64880651;
 //BA.debugLineNum = 64880651;BA.debugLine="Dim DocExp As String=mData.Get(\"Documento\")";
_docexp = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=64880652;
 //BA.debugLineNum = 64880652;BA.debugLine="If DocExp<>\"\" Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((_docexp).equals("") == false) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=64880653;
 //BA.debugLineNum = 64880653;BA.debugLine="lstOpciones.Add(mData.Get(\"Documento\"))";
_lstopciones.Add(_mdata.Get((Object)("Documento")));
 if (true) break;

case 13:
//C
this.state = 41;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=64880658;
 //BA.debugLineNum = 64880658;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=64880660;
 //BA.debugLineNum = 64880660;BA.debugLine="Dialog.Title=\"Selecciona Documento NAV\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Documento NAV");
RDebugUtils.currentLine=64880661;
 //BA.debugLineNum = 64880661;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=64880662;
 //BA.debugLineNum = 64880662;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=64880663;
 //BA.debugLineNum = 64880663;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=64880664;
 //BA.debugLineNum = 64880664;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=64880665;
 //BA.debugLineNum = 64880665;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=64880667;
 //BA.debugLineNum = 64880667;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
parent._utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=64880668;
 //BA.debugLineNum = 64880668;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
parent._utilidades._setlightthemelist /*String*/ (_b4xlistdlg);
RDebugUtils.currentLine=64880671;
 //BA.debugLineNum = 64880671;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=64880672;
 //BA.debugLineNum = 64880672;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=64880673;
 //BA.debugLineNum = 64880673;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=64880675;
 //BA.debugLineNum = 64880675;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=64880676;
 //BA.debugLineNum = 64880676;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=64880680;
 //BA.debugLineNum = 64880680;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=64880684;
 //BA.debugLineNum = 64880684;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=64880686;
 //BA.debugLineNum = 64880686;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 15:
//for
this.state = 18;
step29 = 1;
limit29 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 42;
if (true) break;

case 42:
//C
this.state = 18;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 17;
if (true) break;

case 43:
//C
this.state = 42;
_i = ((int)(0 + _i + step29)) ;
if (true) break;

case 17:
//C
this.state = 43;
RDebugUtils.currentLine=64880687;
 //BA.debugLineNum = 64880687;BA.debugLine="xclv.ResizeItem(i,60dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (60)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=64880691;
 //BA.debugLineNum = 64880691;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=64880692;
 //BA.debugLineNum = 64880692;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=64880694;
 //BA.debugLineNum = 64880694;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=64880695;
 //BA.debugLineNum = 64880695;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=64880696;
 //BA.debugLineNum = 64880696;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=64880699;
 //BA.debugLineNum = 64880699;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "datosexpedicioninternaexpediciontransporte"), _rsub);
this.state = 44;
return;
case 44:
//C
this.state = 23;
_rint = (int) result[1];
;
RDebugUtils.currentLine=64880701;
 //BA.debugLineNum = 64880701;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=64880702;
 //BA.debugLineNum = 64880702;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 23:
//if
this.state = 28;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
if (true) return ;
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=64880704;
 //BA.debugLineNum = 64880704;BA.debugLine="Dim DocSel As String=B4XListDlg.SelectedItem";
_docsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=64880705;
 //BA.debugLineNum = 64880705;BA.debugLine="Select True";
if (true) break;

case 29:
//select
this.state = 38;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("CDEV"))) {
case 0: {
this.state = 31;
if (true) break;
}
case 1: {
this.state = 33;
if (true) break;
}
case 2: {
this.state = 35;
if (true) break;
}
default: {
this.state = 37;
if (true) break;
}
}
if (true) break;

case 31:
//C
this.state = 38;
RDebugUtils.currentLine=64880707;
 //BA.debugLineNum = 64880707;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico Albaranes Venta",(int) (130),"No.",_docsel);
 if (true) break;

case 33:
//C
this.state = 38;
RDebugUtils.currentLine=64880709;
 //BA.debugLineNum = 64880709;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico recep. transferencia",(int) (5745),"No.",_docsel);
 if (true) break;

case 35:
//C
this.state = 38;
RDebugUtils.currentLine=64880711;
 //BA.debugLineNum = 64880711;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico envío devolución",(int) (6650),"No.",_docsel);
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=64880713;
 //BA.debugLineNum = 64880713;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No es posible abrir la ficha de navision del documento "+_docsel,"Aviso");
RDebugUtils.currentLine=64880714;
 //BA.debugLineNum = 64880714;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "datosexpedicioninternaexpediciontransporte"), _msa);
this.state = 45;
return;
case 45:
//C
this.state = 38;
;
 if (true) break;

case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=64880716;
 //BA.debugLineNum = 64880716;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnejemplo_click(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "btnejemplo_click", false))
	 {return ((String) Debug.delegate(ba, "btnejemplo_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
RDebugUtils.currentLine=64749568;
 //BA.debugLineNum = 64749568;BA.debugLine="Private Sub btnEjemplo_Click";
RDebugUtils.currentLine=64749569;
 //BA.debugLineNum = 64749569;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=64749570;
 //BA.debugLineNum = 64749570;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=64749571;
 //BA.debugLineNum = 64749571;BA.debugLine="Log(mData)";
__c.LogImpl("864749571",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=64749572;
 //BA.debugLineNum = 64749572;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=64749573;
 //BA.debugLineNum = 64749573;BA.debugLine="End Sub";
return "";
}
public void  _btngetinfo_click(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "btngetinfo_click", false))
	 {Debug.delegate(ba, "btngetinfo_click", null); return;}
ResumableSub_btnGetInfo_Click rsub = new ResumableSub_btnGetInfo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGetInfo_Click extends BA.ResumableSub {
public ResumableSub_btnGetInfo_Click(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65273857;
 //BA.debugLineNum = 65273857;BA.debugLine="If FechaFinalLong=0 Or FechaInicialLong=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._fechafinallong /*long*/ ==0 || __ref._fechainiciallong /*long*/ ==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=65273858;
 //BA.debugLineNum = 65273858;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica fecha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Indica fecha inicial y fecha final.","Error");
RDebugUtils.currentLine=65273859;
 //BA.debugLineNum = 65273859;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btngetinfo_click"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 4;
;
RDebugUtils.currentLine=65273860;
 //BA.debugLineNum = 65273860;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=65273862;
 //BA.debugLineNum = 65273862;BA.debugLine="If FechaFinalLong<FechaInicialLong Then";

case 4:
//if
this.state = 7;
if (__ref._fechafinallong /*long*/ <__ref._fechainiciallong /*long*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=65273863;
 //BA.debugLineNum = 65273863;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fina";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha final no puede ser anterior a la fecha inicial.","Error");
RDebugUtils.currentLine=65273864;
 //BA.debugLineNum = 65273864;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btngetinfo_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
RDebugUtils.currentLine=65273865;
 //BA.debugLineNum = 65273865;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=65273867;
 //BA.debugLineNum = 65273867;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=65273868;
 //BA.debugLineNum = 65273868;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=64225280;
 //BA.debugLineNum = 64225280;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=64225281;
 //BA.debugLineNum = 64225281;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=64225282;
 //BA.debugLineNum = 64225282;BA.debugLine="End Sub";
return "";
}
public void  _btnselfechafinal_click(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "btnselfechafinal_click", false))
	 {Debug.delegate(ba, "btnselfechafinal_click", null); return;}
ResumableSub_btnSelFechaFinal_Click rsub = new ResumableSub_btnSelFechaFinal_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFechaFinal_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaFinal_Click(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
float _offset_before_dialog = 0f;
b4j.docU.b4xdatetemplate _b4xdatedlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
long _fechafinsel = 0L;
String _dateformatant = "";
long _fechafinalhora = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65339426;
 //BA.debugLineNum = 65339426;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=65339427;
 //BA.debugLineNum = 65339427;BA.debugLine="Dialog.Title=\"Indica Fecha Final\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Final");
RDebugUtils.currentLine=65339429;
 //BA.debugLineNum = 65339429;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=65339430;
 //BA.debugLineNum = 65339430;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=65339431;
 //BA.debugLineNum = 65339431;BA.debugLine="If FechaFinalLong=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._fechafinallong /*long*/ ==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=65339432;
 //BA.debugLineNum = 65339432;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=65339434;
 //BA.debugLineNum = 65339434;BA.debugLine="B4XDateDlg.Date=FechaFinalLong";
_b4xdatedlg._setdate /*long*/ (null,__ref._fechafinallong /*long*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=65339436;
 //BA.debugLineNum = 65339436;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=65339437;
 //BA.debugLineNum = 65339437;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=65339438;
 //BA.debugLineNum = 65339438;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=65339441;
 //BA.debugLineNum = 65339441;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=65339442;
 //BA.debugLineNum = 65339442;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=65339443;
 //BA.debugLineNum = 65339443;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=65339444;
 //BA.debugLineNum = 65339444;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=65339445;
 //BA.debugLineNum = 65339445;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnselfechafinal_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=65339446;
 //BA.debugLineNum = 65339446;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=65339447;
 //BA.debugLineNum = 65339447;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=65339448;
 //BA.debugLineNum = 65339448;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=65339450;
 //BA.debugLineNum = 65339450;BA.debugLine="Dim FechaFinSel As Long=B4XDateDlg.Date";
_fechafinsel = _b4xdatedlg._getdate /*long*/ (null);
RDebugUtils.currentLine=65339452;
 //BA.debugLineNum = 65339452;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=65339453;
 //BA.debugLineNum = 65339453;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=65339454;
 //BA.debugLineNum = 65339454;BA.debugLine="Dim FechaFinalHora As Long=FechaFinSel";
_fechafinalhora = _fechafinsel;
RDebugUtils.currentLine=65339455;
 //BA.debugLineNum = 65339455;BA.debugLine="FechaFinalLong=DateUtils.SetDate(DateTime.GetYear";
__ref._fechafinallong /*long*/  = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_fechafinalhora),parent.__c.DateTime.GetMonth(_fechafinalhora),parent.__c.DateTime.GetDayOfMonth(_fechafinalhora));
RDebugUtils.currentLine=65339456;
 //BA.debugLineNum = 65339456;BA.debugLine="FechaFinalLong=FechaFinalLong+DateTime.TicksPerDa";
__ref._fechafinallong /*long*/  = (long) (__ref._fechafinallong /*long*/ +parent.__c.DateTime.TicksPerDay-1);
RDebugUtils.currentLine=65339457;
 //BA.debugLineNum = 65339457;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinalLong)";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechafinallong /*long*/ ));
RDebugUtils.currentLine=65339458;
 //BA.debugLineNum = 65339458;BA.debugLine="Log(DateUtils.TicksToString(FechaFinalLong))";
parent.__c.LogImpl("865339458",parent._dateutils._tickstostring(__ref._fechafinallong /*long*/ ),0);
RDebugUtils.currentLine=65339460;
 //BA.debugLineNum = 65339460;BA.debugLine="If FechaInicialLong=0 Then";
if (true) break;

case 11:
//if
this.state = 14;
if (__ref._fechainiciallong /*long*/ ==0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=65339461;
 //BA.debugLineNum = 65339461;BA.debugLine="FechaInicialLong=FechaFinalLong";
__ref._fechainiciallong /*long*/  = __ref._fechafinallong /*long*/ ;
RDebugUtils.currentLine=65339462;
 //BA.debugLineNum = 65339462;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialL";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechainiciallong /*long*/ ));
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=65339465;
 //BA.debugLineNum = 65339465;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=65339466;
 //BA.debugLineNum = 65339466;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselfechainicial_click(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "btnselfechainicial_click", false))
	 {Debug.delegate(ba, "btnselfechainicial_click", null); return;}
ResumableSub_btnSelFechaInicial_Click rsub = new ResumableSub_btnSelFechaInicial_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFechaInicial_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaInicial_Click(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
float _offset_before_dialog = 0f;
b4j.docU.b4xdatetemplate _b4xdatedlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
long _fechainsel = 0L;
String _dateformatant = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65404960;
 //BA.debugLineNum = 65404960;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=65404961;
 //BA.debugLineNum = 65404961;BA.debugLine="Dialog.Title=\"Indica Fecha Inicial\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Inicial");
RDebugUtils.currentLine=65404963;
 //BA.debugLineNum = 65404963;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=65404964;
 //BA.debugLineNum = 65404964;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=65404965;
 //BA.debugLineNum = 65404965;BA.debugLine="If FechaInicialLong=0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._fechainiciallong /*long*/ ==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=65404966;
 //BA.debugLineNum = 65404966;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=65404968;
 //BA.debugLineNum = 65404968;BA.debugLine="B4XDateDlg.Date=FechaInicialLong";
_b4xdatedlg._setdate /*long*/ (null,__ref._fechainiciallong /*long*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=65404970;
 //BA.debugLineNum = 65404970;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=65404971;
 //BA.debugLineNum = 65404971;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=65404972;
 //BA.debugLineNum = 65404972;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=65404975;
 //BA.debugLineNum = 65404975;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=65404976;
 //BA.debugLineNum = 65404976;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=65404977;
 //BA.debugLineNum = 65404977;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=65404978;
 //BA.debugLineNum = 65404978;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=65404979;
 //BA.debugLineNum = 65404979;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "btnselfechainicial_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=65404980;
 //BA.debugLineNum = 65404980;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=65404981;
 //BA.debugLineNum = 65404981;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=65404982;
 //BA.debugLineNum = 65404982;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=65404984;
 //BA.debugLineNum = 65404984;BA.debugLine="Dim FechaInSel As Long=B4XDateDlg.Date";
_fechainsel = _b4xdatedlg._getdate /*long*/ (null);
RDebugUtils.currentLine=65404987;
 //BA.debugLineNum = 65404987;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=65404988;
 //BA.debugLineNum = 65404988;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=65404990;
 //BA.debugLineNum = 65404990;BA.debugLine="FechaInicialLong=DateUtils.SetDate(DateTime.GetYe";
__ref._fechainiciallong /*long*/  = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_fechainsel),parent.__c.DateTime.GetMonth(_fechainsel),parent.__c.DateTime.GetDayOfMonth(_fechainsel));
RDebugUtils.currentLine=65404991;
 //BA.debugLineNum = 65404991;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialLo";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechainiciallong /*long*/ ));
RDebugUtils.currentLine=65404992;
 //BA.debugLineNum = 65404992;BA.debugLine="Log(DateUtils.TicksToString(FechaInicialLong))";
parent.__c.LogImpl("865404992",parent._dateutils._tickstostring(__ref._fechainiciallong /*long*/ ),0);
RDebugUtils.currentLine=65404994;
 //BA.debugLineNum = 65404994;BA.debugLine="If FechaFinalLong=0 Then";
if (true) break;

case 11:
//if
this.state = 14;
if (__ref._fechafinallong /*long*/ ==0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=65404995;
 //BA.debugLineNum = 65404995;BA.debugLine="FechaFinalLong=FechaInicialLong";
__ref._fechafinallong /*long*/  = __ref._fechainiciallong /*long*/ ;
RDebugUtils.currentLine=65404996;
 //BA.debugLineNum = 65404996;BA.debugLine="txtFechaFinal.Text=DateTime.date(FechaFinalLong)";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechafinallong /*long*/ ));
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=65404998;
 //BA.debugLineNum = 65404998;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=65405000;
 //BA.debugLineNum = 65405000;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=63832065;
 //BA.debugLineNum = 63832065;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=63832067;
 //BA.debugLineNum = 63832067;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=63832069;
 //BA.debugLineNum = 63832069;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=63832071;
 //BA.debugLineNum = 63832071;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=63832076;
 //BA.debugLineNum = 63832076;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
_jamtableclv1 = new b4j.docU.jamtableclv();
RDebugUtils.currentLine=63832077;
 //BA.debugLineNum = 63832077;BA.debugLine="Private txtANO As TextField";
_txtano = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832078;
 //BA.debugLineNum = 63832078;BA.debugLine="Private txtBULTOS As TextField";
_txtbultos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832079;
 //BA.debugLineNum = 63832079;BA.debugLine="Private txtCODDESTIN As TextField";
_txtcoddestin = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832080;
 //BA.debugLineNum = 63832080;BA.debugLine="Private txtCODEMPRESA As TextField";
_txtcodempresa = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832081;
 //BA.debugLineNum = 63832081;BA.debugLine="Private txtCODORIGEN As TextField";
_txtcodorigen = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832082;
 //BA.debugLineNum = 63832082;BA.debugLine="Private txtCPOSTALDESTINATARIO As TextField";
_txtcpostaldestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832083;
 //BA.debugLineNum = 63832083;BA.debugLine="Private txtDIRECCIONDESTINATARIO As TextField";
_txtdirecciondestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832085;
 //BA.debugLineNum = 63832085;BA.debugLine="Private txtFECHAALTA As TextField";
_txtfechaalta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832086;
 //BA.debugLineNum = 63832086;BA.debugLine="Private txtKILOS As TextField";
_txtkilos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832087;
 //BA.debugLineNum = 63832087;BA.debugLine="Private txtNEXPED1 As TextField";
_txtnexped1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832088;
 //BA.debugLineNum = 63832088;BA.debugLine="Private txtNEXPED2 As TextField";
_txtnexped2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832089;
 //BA.debugLineNum = 63832089;BA.debugLine="Private txtNOMBREDESTINATARIO As TextField";
_txtnombredestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832091;
 //BA.debugLineNum = 63832091;BA.debugLine="Private txtPOBLACIONDESTINATARIO As TextField";
_txtpoblaciondestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832093;
 //BA.debugLineNum = 63832093;BA.debugLine="Private txtREFERENCIA1 As TextField";
_txtreferencia1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832094;
 //BA.debugLineNum = 63832094;BA.debugLine="Private txtDestino As TextField";
_txtdestino = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832095;
 //BA.debugLineNum = 63832095;BA.debugLine="Private txtEstadoActual As B4XView";
_txtestadoactual = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=63832097;
 //BA.debugLineNum = 63832097;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
_measurementcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=63832099;
 //BA.debugLineNum = 63832099;BA.debugLine="Private FlexGridDialog As FlexGrid";
_flexgriddialog = new b4j.example.flexgrid();
RDebugUtils.currentLine=63832100;
 //BA.debugLineNum = 63832100;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=63832101;
 //BA.debugLineNum = 63832101;BA.debugLine="Private txtFechaInicial As TextField";
_txtfechainicial = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832102;
 //BA.debugLineNum = 63832102;BA.debugLine="Private btnSelFechaInicial As Button";
_btnselfechainicial = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=63832103;
 //BA.debugLineNum = 63832103;BA.debugLine="Private txtFechaFinal As TextField";
_txtfechafinal = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832104;
 //BA.debugLineNum = 63832104;BA.debugLine="Private btnSelFechaFinal As Button";
_btnselfechafinal = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=63832105;
 //BA.debugLineNum = 63832105;BA.debugLine="Private btnGetInfo As Button";
_btngetinfo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=63832107;
 //BA.debugLineNum = 63832107;BA.debugLine="Private FechaInicialLong, FechaFinalLong As Long";
_fechainiciallong = 0L;
_fechafinallong = 0L;
RDebugUtils.currentLine=63832108;
 //BA.debugLineNum = 63832108;BA.debugLine="Private txtFechaSalida As TextField";
_txtfechasalida = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832109;
 //BA.debugLineNum = 63832109;BA.debugLine="Private txtFechaEntrega As TextField";
_txtfechaentrega = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832110;
 //BA.debugLineNum = 63832110;BA.debugLine="Private txtNombreCliente As TextField";
_txtnombrecliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=63832111;
 //BA.debugLineNum = 63832111;BA.debugLine="Private txtNombreResponsableCuenta As B4XView";
_txtnombreresponsablecuenta = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=63832112;
 //BA.debugLineNum = 63832112;BA.debugLine="Private txtTipo As B4XView";
_txttipo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=63832113;
 //BA.debugLineNum = 63832113;BA.debugLine="Private lblIndicadorEstado As B4XView";
_lblindicadorestado = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=63832114;
 //BA.debugLineNum = 63832114;BA.debugLine="Private txtEntregado As B4XView";
_txtentregado = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=63832115;
 //BA.debugLineNum = 63832115;BA.debugLine="Private lblIndicadorTipo As B4XView";
_lblindicadortipo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=63832118;
 //BA.debugLineNum = 63832118;BA.debugLine="Private jamCircularProgressBar1 As jamCircularPro";
_jamcircularprogressbar1 = new b4j.docU.jamcircularprogressbar();
RDebugUtils.currentLine=63832119;
 //BA.debugLineNum = 63832119;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=63832120;
 //BA.debugLineNum = 63832120;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=64421888;
 //BA.debugLineNum = 64421888;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=64421889;
 //BA.debugLineNum = 64421889;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblExpedicionesPeriodoTXT"}))));
RDebugUtils.currentLine=64421890;
 //BA.debugLineNum = 64421890;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=64421891;
 //BA.debugLineNum = 64421891;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblExpedicionesPer";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblExpedicionesPeriodoTXT");
 };
RDebugUtils.currentLine=64421893;
 //BA.debugLineNum = 64421893;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=64421894;
 //BA.debugLineNum = 64421894;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=64421895;
 //BA.debugLineNum = 64421895;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblExpedicionesPeriodoTXT (");
RDebugUtils.currentLine=64421897;
 //BA.debugLineNum = 64421897;BA.debugLine="sbCrearTabla.Append(\"CODEMPRESA TEXT COLLATE NOCA";
_sbcreartabla.Append("CODEMPRESA TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=64421898;
 //BA.debugLineNum = 64421898;BA.debugLine="sbCrearTabla.Append(\"CODORIGEN TEXT COLLATE NOCAS";
_sbcreartabla.Append("CODORIGEN TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=64421899;
 //BA.debugLineNum = 64421899;BA.debugLine="sbCrearTabla.Append(\"CODDESTIN TEXT COLLATE NOCAS";
_sbcreartabla.Append("CODDESTIN TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=64421900;
 //BA.debugLineNum = 64421900;BA.debugLine="sbCrearTabla.Append(\"NEXPED1 INTEGER,\")";
_sbcreartabla.Append("NEXPED1 INTEGER,");
RDebugUtils.currentLine=64421901;
 //BA.debugLineNum = 64421901;BA.debugLine="sbCrearTabla.Append(\"NEXPED2 INTEGER,\")";
_sbcreartabla.Append("NEXPED2 INTEGER,");
RDebugUtils.currentLine=64421902;
 //BA.debugLineNum = 64421902;BA.debugLine="sbCrearTabla.Append(\"ANO TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("ANO TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=64421903;
 //BA.debugLineNum = 64421903;BA.debugLine="sbCrearTabla.Append(\"Fecha_x0020_salida TEXT COLL";
_sbcreartabla.Append("Fecha_x0020_salida TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=64421904;
 //BA.debugLineNum = 64421904;BA.debugLine="sbCrearTabla.Append(\"Fecha_x0020_Alta TEXT COLLAT";
_sbcreartabla.Append("Fecha_x0020_Alta TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=64421905;
 //BA.debugLineNum = 64421905;BA.debugLine="sbCrearTabla.Append(\"Fecha_x0020_Entrega TEXT COL";
_sbcreartabla.Append("Fecha_x0020_Entrega TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=64421906;
 //BA.debugLineNum = 64421906;BA.debugLine="sbCrearTabla.Append(\"Nombre_x0020_Destinatario TE";
_sbcreartabla.Append("Nombre_x0020_Destinatario TEXT DEFAULT '',");
RDebugUtils.currentLine=64421907;
 //BA.debugLineNum = 64421907;BA.debugLine="sbCrearTabla.Append(\"Dirección_x0020_Destinatario";
_sbcreartabla.Append("Dirección_x0020_Destinatario TEXT DEFAULT '',");
RDebugUtils.currentLine=64421908;
 //BA.debugLineNum = 64421908;BA.debugLine="sbCrearTabla.Append(\"Código_x0020_Postal_x0020_De";
_sbcreartabla.Append("Código_x0020_Postal_x0020_Destinatario TEXT DEFAULT '',");
RDebugUtils.currentLine=64421909;
 //BA.debugLineNum = 64421909;BA.debugLine="sbCrearTabla.Append(\"Población_x0020_Destinatario";
_sbcreartabla.Append("Población_x0020_Destinatario TEXT DEFAULT '',");
RDebugUtils.currentLine=64421910;
 //BA.debugLineNum = 64421910;BA.debugLine="sbCrearTabla.Append(\"Referencia_x0020_1 TEXT DEFA";
_sbcreartabla.Append("Referencia_x0020_1 TEXT DEFAULT '',");
RDebugUtils.currentLine=64421911;
 //BA.debugLineNum = 64421911;BA.debugLine="sbCrearTabla.Append(\"Bultos INTEGER DEFAULT 0,\")";
_sbcreartabla.Append("Bultos INTEGER DEFAULT 0,");
RDebugUtils.currentLine=64421912;
 //BA.debugLineNum = 64421912;BA.debugLine="sbCrearTabla.Append(\"Kilos_x0020_Reales INTEGER D";
_sbcreartabla.Append("Kilos_x0020_Reales INTEGER DEFAULT 0,");
RDebugUtils.currentLine=64421913;
 //BA.debugLineNum = 64421913;BA.debugLine="sbCrearTabla.Append(\"Volumen INTEGER DEFAULT 0,\")";
_sbcreartabla.Append("Volumen INTEGER DEFAULT 0,");
RDebugUtils.currentLine=64421914;
 //BA.debugLineNum = 64421914;BA.debugLine="sbCrearTabla.Append(\"Tipo TEXT COLLATE NOCASE DEF";
_sbcreartabla.Append("Tipo TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=64421915;
 //BA.debugLineNum = 64421915;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=64421916;
 //BA.debugLineNum = 64421916;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=64421917;
 //BA.debugLineNum = 64421917;BA.debugLine="sbCrearTabla.Append(\"Entregado TEXT COLLATE NOCAS";
_sbcreartabla.Append("Entregado TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=64421918;
 //BA.debugLineNum = 64421918;BA.debugLine="sbCrearTabla.Append(\"EstadoActual TEXT COLLATE NO";
_sbcreartabla.Append("EstadoActual TEXT COLLATE NOCASE DEFAULT '')");
RDebugUtils.currentLine=64421919;
 //BA.debugLineNum = 64421919;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=64421922;
 //BA.debugLineNum = 64421922;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _creartablatemporaldocumentosnavexpedicionespendientestxt(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "creartablatemporaldocumentosnavexpedicionespendientestxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "creartablatemporaldocumentosnavexpedicionespendientestxt", null));}
ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT rsub = new ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65863681;
 //BA.debugLineNum = 65863681;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=65863684;
 //BA.debugLineNum = 65863684;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=65863685;
 //BA.debugLineNum = 65863685;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=65863688;
 //BA.debugLineNum = 65863688;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"CrearTablaTe";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"CrearTablaTemporalDocumentosExpedicionesPendientes",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=65863690;
 //BA.debugLineNum = 65863690;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65863691;
 //BA.debugLineNum = 65863691;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=65863692;
 //BA.debugLineNum = 65863692;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query CrearTablaTemporalDocumentosExpedicionesPendientes","Error");
RDebugUtils.currentLine=65863693;
 //BA.debugLineNum = 65863693;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=65863694;
 //BA.debugLineNum = 65863694;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=65863695;
 //BA.debugLineNum = 65863695;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=65863698;
 //BA.debugLineNum = 65863698;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=65863701;
 //BA.debugLineNum = 65863701;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=65863702;
 //BA.debugLineNum = 65863702;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=65863703;
 //BA.debugLineNum = 65863703;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=65863704;
 //BA.debugLineNum = 65863704;BA.debugLine="If sResp.ToUpperCase=\"OK\" Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((_sresp.toUpperCase()).equals("OK")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=65863705;
 //BA.debugLineNum = 65863705;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=65863706;
 //BA.debugLineNum = 65863706;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=65863708;
 //BA.debugLineNum = 65863708;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP CrearTablaTemporalDocumentosExpedicionesPendientes "+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=65863709;
 //BA.debugLineNum = 65863709;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=65863710;
 //BA.debugLineNum = 65863710;BA.debugLine="Accion=\"ERROR SP\"";
_accion = "ERROR SP";
RDebugUtils.currentLine=65863711;
 //BA.debugLineNum = 65863711;BA.debugLine="mRes.Put(\"Accion\", Accion)";
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
RDebugUtils.currentLine=65863715;
 //BA.debugLineNum = 65863715;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=65863716;
 //BA.debugLineNum = 65863716;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _creartablatemporaldocumentosreferenciastte(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "creartablatemporaldocumentosreferenciastte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "creartablatemporaldocumentosreferenciastte", null));}
ResumableSub_CrearTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65601537;
 //BA.debugLineNum = 65601537;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=65601540;
 //BA.debugLineNum = 65601540;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=65601541;
 //BA.debugLineNum = 65601541;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=65601544;
 //BA.debugLineNum = 65601544;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"CrearTablaTemporalDocumentosReferenciasTte",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=65601546;
 //BA.debugLineNum = 65601546;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosreferenciastte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65601547;
 //BA.debugLineNum = 65601547;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=65601548;
 //BA.debugLineNum = 65601548;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query CrearTablaTemporalDocumentosReferenciasTte","Error");
RDebugUtils.currentLine=65601549;
 //BA.debugLineNum = 65601549;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=65601550;
 //BA.debugLineNum = 65601550;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=65601551;
 //BA.debugLineNum = 65601551;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=65601554;
 //BA.debugLineNum = 65601554;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=65601557;
 //BA.debugLineNum = 65601557;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=65601558;
 //BA.debugLineNum = 65601558;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=65601559;
 //BA.debugLineNum = 65601559;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=65601560;
 //BA.debugLineNum = 65601560;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
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
RDebugUtils.currentLine=65601561;
 //BA.debugLineNum = 65601561;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP CrearTablaTemporalDocumentosReferenciasTte"+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=65601562;
 //BA.debugLineNum = 65601562;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=65601563;
 //BA.debugLineNum = 65601563;BA.debugLine="Accion=\"ERROR SP\"";
_accion = "ERROR SP";
RDebugUtils.currentLine=65601564;
 //BA.debugLineNum = 65601564;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=65601566;
 //BA.debugLineNum = 65601566;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=65601567;
 //BA.debugLineNum = 65601567;BA.debugLine="mRes.Put(\"Accion\", Accion)";
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
RDebugUtils.currentLine=65601571;
 //BA.debugLineNum = 65601571;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=65601572;
 //BA.debugLineNum = 65601572;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _expedicioninternaexpediciontransporte(b4j.docU.cexpedicionesperiodotxt __ref,int _idtransporte,String _numexp) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "expedicioninternaexpediciontransporte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "expedicioninternaexpediciontransporte", new Object[] {_idtransporte,_numexp}));}
ResumableSub_ExpedicionInternaExpedicionTransporte rsub = new ResumableSub_ExpedicionInternaExpedicionTransporte(this,__ref,_idtransporte,_numexp);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_ExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref,int _idtransporte,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
int _idtransporte;
String _numexp;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mrespuesta = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64946178;
 //BA.debugLineNum = 64946178;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=64946179;
 //BA.debugLineNum = 64946179;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=64946180;
 //BA.debugLineNum = 64946180;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=64946181;
 //BA.debugLineNum = 64946181;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=64946182;
 //BA.debugLineNum = 64946182;BA.debugLine="Dim Comando As String=\"DatosExpedicionInternaExpe";
_comando = "DatosExpedicionInternaExpedicionTransporte";
RDebugUtils.currentLine=64946185;
 //BA.debugLineNum = 64946185;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTra";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_idtransporte),(Object)(_numexp)},parent);
RDebugUtils.currentLine=64946187;
 //BA.debugLineNum = 64946187;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=64946188;
 //BA.debugLineNum = 64946188;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=64946189;
 //BA.debugLineNum = 64946189;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=64946190;
 //BA.debugLineNum = 64946190;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=64946191;
 //BA.debugLineNum = 64946191;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=64946192;
 //BA.debugLineNum = 64946192;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=64946195;
 //BA.debugLineNum = 64946195;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=64946196;
 //BA.debugLineNum = 64946196;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=64946197;
 //BA.debugLineNum = 64946197;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=64946198;
 //BA.debugLineNum = 64946198;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso");
RDebugUtils.currentLine=64946199;
 //BA.debugLineNum = 64946199;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 17;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=64946202;
 //BA.debugLineNum = 64946202;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=64946203;
 //BA.debugLineNum = 64946203;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
_mrespuesta = new anywheresoftware.b4a.objects.collections.Map();
_mrespuesta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=64946204;
 //BA.debugLineNum = 64946204;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
_sresp = BA.ObjectToString(_mrespuesta.GetValueAt((int) (0)));
RDebugUtils.currentLine=64946205;
 //BA.debugLineNum = 64946205;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_sresp.startsWith("ERROR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=64946206;
 //BA.debugLineNum = 64946206;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error recuperando datos del SP "+_comando+"."+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Aviso");
RDebugUtils.currentLine=64946207;
 //BA.debugLineNum = 64946207;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=64946208;
 //BA.debugLineNum = 64946208;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=64946209;
 //BA.debugLineNum = 64946209;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=64946211;
 //BA.debugLineNum = 64946211;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=64946212;
 //BA.debugLineNum = 64946212;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=64946213;
 //BA.debugLineNum = 64946213;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
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
RDebugUtils.currentLine=64946217;
 //BA.debugLineNum = 64946217;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=64946218;
 //BA.debugLineNum = 64946218;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpedicionesperiodo(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "documentosexpedicionesperiodo", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpedicionesperiodo", null));}
ResumableSub_DocumentosExpedicionesPeriodo rsub = new ResumableSub_DocumentosExpedicionesPeriodo(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicionesPeriodo extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPeriodo(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65667073;
 //BA.debugLineNum = 65667073;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=65667076;
 //BA.debugLineNum = 65667076;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=65667077;
 //BA.debugLineNum = 65667077;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=65667080;
 //BA.debugLineNum = 65667080;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"DocumentosReferenciasExpedicionesTte",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=65667082;
 //BA.debugLineNum = 65667082;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodo"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=65667083;
 //BA.debugLineNum = 65667083;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=65667084;
 //BA.debugLineNum = 65667084;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query DocumentosReferenciasExpedicionesTte","Error");
RDebugUtils.currentLine=65667085;
 //BA.debugLineNum = 65667085;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "documentosexpedicionesperiodo"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=65667086;
 //BA.debugLineNum = 65667086;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=65667087;
 //BA.debugLineNum = 65667087;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=65667090;
 //BA.debugLineNum = 65667090;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=65667091;
 //BA.debugLineNum = 65667091;BA.debugLine="Accion=\"SinDocumentos\"";
_accion = "SinDocumentos";
RDebugUtils.currentLine=65667092;
 //BA.debugLineNum = 65667092;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=65667094;
 //BA.debugLineNum = 65667094;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=65667095;
 //BA.debugLineNum = 65667095;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=65667096;
 //BA.debugLineNum = 65667096;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=65667097;
 //BA.debugLineNum = 65667097;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=65667100;
 //BA.debugLineNum = 65667100;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=65667101;
 //BA.debugLineNum = 65667101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cexpedicionesperiodotxt __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=64094208;
 //BA.debugLineNum = 64094208;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=64094209;
 //BA.debugLineNum = 64094209;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=64094210;
 //BA.debugLineNum = 64094210;BA.debugLine="End Sub";
return "";
}
public String  _generaruuidv4(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "generaruuidv4", false))
	 {return ((String) Debug.delegate(ba, "generaruuidv4", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
int _c = 0;
RDebugUtils.currentLine=64487424;
 //BA.debugLineNum = 64487424;BA.debugLine="Sub GenerarUUIDv4 As String";
RDebugUtils.currentLine=64487425;
 //BA.debugLineNum = 64487425;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=64487426;
 //BA.debugLineNum = 64487426;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=64487427;
 //BA.debugLineNum = 64487427;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
RDebugUtils.currentLine=64487428;
 //BA.debugLineNum = 64487428;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=64487429;
 //BA.debugLineNum = 64487429;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=64487430;
 //BA.debugLineNum = 64487430;BA.debugLine="Dim c As Int = Rnd(0, 16)";
_c = __c.Rnd((int) (0),(int) (16));
RDebugUtils.currentLine=64487431;
 //BA.debugLineNum = 64487431;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
if (_c<10) { 
_c = (int) (_c+48);}
else {
_c = (int) (_c+55);};
RDebugUtils.currentLine=64487432;
 //BA.debugLineNum = 64487432;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
if (_sb.getLength()==19) { 
_c = __c.Asc(BA.ObjectToChar("8"));};
RDebugUtils.currentLine=64487433;
 //BA.debugLineNum = 64487433;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
if (_sb.getLength()==14) { 
_c = __c.Asc(BA.ObjectToChar("4"));};
RDebugUtils.currentLine=64487434;
 //BA.debugLineNum = 64487434;BA.debugLine="sb.Append(Chr(c))";
_sb.Append(BA.ObjectToString(__c.Chr(_c)));
 }
};
 }
};
RDebugUtils.currentLine=64487437;
 //BA.debugLineNum = 64487437;BA.debugLine="Return sb.ToString.ToLowerCase";
if (true) return _sb.ToString().toLowerCase();
RDebugUtils.currentLine=64487438;
 //BA.debugLineNum = 64487438;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_accionsalirjamtableclv(b4j.docU.cexpedicionesperiodotxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_accionsalirjamtableclv", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_accionsalirjamtableclv", null));}
RDebugUtils.currentLine=64159744;
 //BA.debugLineNum = 64159744;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
RDebugUtils.currentLine=64159745;
 //BA.debugLineNum = 64159745;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=64159746;
 //BA.debugLineNum = 64159746;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemclick(b4j.docU.cexpedicionesperiodotxt __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=64618496;
 //BA.debugLineNum = 64618496;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
RDebugUtils.currentLine=64618497;
 //BA.debugLineNum = 64618497;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=64618498;
 //BA.debugLineNum = 64618498;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
__c.LogImpl("864618498","Datos Item seleccionado ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=64618499;
 //BA.debugLineNum = 64618499;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=64618500;
 //BA.debugLineNum = 64618500;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("864618500",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=64618502;
 //BA.debugLineNum = 64618502;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemlongclick(b4j.docU.cexpedicionesperiodotxt __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemlongclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=64684032;
 //BA.debugLineNum = 64684032;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
RDebugUtils.currentLine=64684033;
 //BA.debugLineNum = 64684033;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=64684034;
 //BA.debugLineNum = 64684034;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
__c.LogImpl("864684034","Datos Item seleccionado botón secundario ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=64684035;
 //BA.debugLineNum = 64684035;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=64684036;
 //BA.debugLineNum = 64684036;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("864684036",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=64684038;
 //BA.debugLineNum = 64684038;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_loadlayoutpanelitem(b4j.docU.cexpedicionesperiodotxt __ref,b4j.docU.jamtableclv._datositemindexclvjamtableclv _datositemindexclv) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_loadlayoutpanelitem", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_loadlayoutpanelitem", new Object[] {_datositemindexclv}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
String _tipo = "";
String _estadoactual = "";
RDebugUtils.currentLine=64552960;
 //BA.debugLineNum = 64552960;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
RDebugUtils.currentLine=64552961;
 //BA.debugLineNum = 64552961;BA.debugLine="Dim mData As Map = DatosItemIndexCLV.Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_datositemindexclv.Value /*Object*/ ));
RDebugUtils.currentLine=64552962;
 //BA.debugLineNum = 64552962;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _datositemindexclv.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=64552963;
 //BA.debugLineNum = 64552963;BA.debugLine="pnl.LoadLayout(\"scrItemExpedicionesPeriodoTxT\")";
_pnl.LoadLayout("scrItemExpedicionesPeriodoTxT",ba);
RDebugUtils.currentLine=64552966;
 //BA.debugLineNum = 64552966;BA.debugLine="txtANO.Text=mData.Get(\"ANO\")";
__ref._txtano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("ANO"))));
RDebugUtils.currentLine=64552967;
 //BA.debugLineNum = 64552967;BA.debugLine="txtBULTOS.Text=mData.Get(\"Bultos\")";
__ref._txtbultos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Bultos"))));
RDebugUtils.currentLine=64552968;
 //BA.debugLineNum = 64552968;BA.debugLine="txtCODDESTIN.Text=mData.Get(\"CODDESTIN\")";
__ref._txtcoddestin /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))));
RDebugUtils.currentLine=64552969;
 //BA.debugLineNum = 64552969;BA.debugLine="txtCODEMPRESA.Text=mData.Get(\"CODEMPRESA\")";
__ref._txtcodempresa /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("CODEMPRESA"))));
RDebugUtils.currentLine=64552970;
 //BA.debugLineNum = 64552970;BA.debugLine="txtCODORIGEN.Text=mData.Get(\"CODORIGEN\")";
__ref._txtcodorigen /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))));
RDebugUtils.currentLine=64552971;
 //BA.debugLineNum = 64552971;BA.debugLine="txtCPOSTALDESTINATARIO.Text=mData.Get(\"Código_x00";
__ref._txtcpostaldestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Código_x0020_Postal_x0020_Destinatario"))));
RDebugUtils.currentLine=64552972;
 //BA.debugLineNum = 64552972;BA.debugLine="txtDIRECCIONDESTINATARIO.Text=mData.Get(\"Direcció";
__ref._txtdirecciondestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Dirección_x0020_Destinatario"))));
RDebugUtils.currentLine=64552974;
 //BA.debugLineNum = 64552974;BA.debugLine="txtKILOS.Text=mData.Get(\"Kilos_x0020_Reales\")";
__ref._txtkilos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Kilos_x0020_Reales"))));
RDebugUtils.currentLine=64552975;
 //BA.debugLineNum = 64552975;BA.debugLine="txtNEXPED1.Text=mData.Get(\"NEXPED1\")";
__ref._txtnexped1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NEXPED1"))));
RDebugUtils.currentLine=64552976;
 //BA.debugLineNum = 64552976;BA.debugLine="txtNEXPED2.Text=mData.Get(\"NEXPED2\")";
__ref._txtnexped2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NEXPED2"))));
RDebugUtils.currentLine=64552977;
 //BA.debugLineNum = 64552977;BA.debugLine="txtNOMBREDESTINATARIO.Text=mData.Get(\"Nombre_x002";
__ref._txtnombredestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Nombre_x0020_Destinatario"))));
RDebugUtils.currentLine=64552979;
 //BA.debugLineNum = 64552979;BA.debugLine="txtDestino.Text=\"\"";
__ref._txtdestino /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
RDebugUtils.currentLine=64552980;
 //BA.debugLineNum = 64552980;BA.debugLine="txtPOBLACIONDESTINATARIO.Text=mData.Get(\"Població";
__ref._txtpoblaciondestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Población_x0020_Destinatario"))));
RDebugUtils.currentLine=64552981;
 //BA.debugLineNum = 64552981;BA.debugLine="txtREFERENCIA1.Text=mData.Get(\"Referencia_x0020_1";
__ref._txtreferencia1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Referencia_x0020_1"))));
RDebugUtils.currentLine=64552987;
 //BA.debugLineNum = 64552987;BA.debugLine="txtFECHAALTA.Text=mData.Get(\"Fecha_x0020_Alta\")";
__ref._txtfechaalta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Fecha_x0020_Alta"))));
RDebugUtils.currentLine=64552989;
 //BA.debugLineNum = 64552989;BA.debugLine="txtFechaEntrega.Text=mData.Get(\"Fecha_x0020_Entre";
__ref._txtfechaentrega /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Fecha_x0020_Entrega"))));
RDebugUtils.currentLine=64552990;
 //BA.debugLineNum = 64552990;BA.debugLine="txtFechaSalida.Text=mData.Get(\"Fecha_x0020_salida";
__ref._txtfechasalida /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Fecha_x0020_salida"))));
RDebugUtils.currentLine=64552992;
 //BA.debugLineNum = 64552992;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Nombre";
__ref._txtnombreresponsablecuenta /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreResponsableCuenta"))));
RDebugUtils.currentLine=64552993;
 //BA.debugLineNum = 64552993;BA.debugLine="If txtNombreResponsableCuenta.Text<>\"\" Then";
if ((__ref._txtnombreresponsablecuenta /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()).equals("") == false) { 
RDebugUtils.currentLine=64552994;
 //BA.debugLineNum = 64552994;BA.debugLine="txtNombreResponsableCuenta.Color=0xFFFFA500";
__ref._txtnombreresponsablecuenta /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xffffa500));
 };
RDebugUtils.currentLine=64552996;
 //BA.debugLineNum = 64552996;BA.debugLine="Dim Tipo As String=mData.Get(\"Tipo\")";
_tipo = BA.ObjectToString(_mdata.Get((Object)("Tipo")));
RDebugUtils.currentLine=64552997;
 //BA.debugLineNum = 64552997;BA.debugLine="txtTipo.Text=Tipo";
__ref._txttipo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_tipo);
RDebugUtils.currentLine=64552998;
 //BA.debugLineNum = 64552998;BA.debugLine="If Tipo=\"LLEGADAS\" Then";
if ((_tipo).equals("LLEGADAS")) { 
RDebugUtils.currentLine=64552999;
 //BA.debugLineNum = 64552999;BA.debugLine="lblIndicadorTipo.Color=0xFFF0E68C";
__ref._lblindicadortipo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xfff0e68c));
RDebugUtils.currentLine=64553000;
 //BA.debugLineNum = 64553000;BA.debugLine="lblIndicadorTipo.Text=Chr(0xF090)";
__ref._lblindicadortipo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xf090))));
 }else {
RDebugUtils.currentLine=64553002;
 //BA.debugLineNum = 64553002;BA.debugLine="lblIndicadorTipo.Color=0xC0FF7F50";
__ref._lblindicadortipo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xc0ff7f50));
RDebugUtils.currentLine=64553003;
 //BA.debugLineNum = 64553003;BA.debugLine="lblIndicadorTipo.Text=Chr(0xF08B)";
__ref._lblindicadortipo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__c.Chr(((int)0xf08b))));
 };
RDebugUtils.currentLine=64553006;
 //BA.debugLineNum = 64553006;BA.debugLine="Dim EstadoActual As String=mData.Get(\"EstadoActua";
_estadoactual = BA.ObjectToString(_mdata.Get((Object)("EstadoActual")));
RDebugUtils.currentLine=64553008;
 //BA.debugLineNum = 64553008;BA.debugLine="If EstadoActual=\"PENDIENTE DE ACTUALIZAR\" Then";
if ((_estadoactual).equals("PENDIENTE DE ACTUALIZAR")) { 
RDebugUtils.currentLine=64553009;
 //BA.debugLineNum = 64553009;BA.debugLine="txtEstadoActual.TextColor=xui.Color_Gray";
__ref._txtestadoactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=64553010;
 //BA.debugLineNum = 64553010;BA.debugLine="txtEstadoActual.Text=\"STATUS PENDIENTE DE ACTUAL";
__ref._txtestadoactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("STATUS PENDIENTE DE ACTUALIZAR");
 }else {
RDebugUtils.currentLine=64553012;
 //BA.debugLineNum = 64553012;BA.debugLine="txtEstadoActual.Text=EstadoActual";
__ref._txtestadoactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(_estadoactual);
RDebugUtils.currentLine=64553013;
 //BA.debugLineNum = 64553013;BA.debugLine="If EstadoActual.ToUpperCase.StartsWith(\"ENTREGAD";
if (_estadoactual.toUpperCase().startsWith("ENTREGADO")) { 
RDebugUtils.currentLine=64553014;
 //BA.debugLineNum = 64553014;BA.debugLine="txtEstadoActual.TextColor=xui.Color_Blue";
__ref._txtestadoactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
 }else {
RDebugUtils.currentLine=64553016;
 //BA.debugLineNum = 64553016;BA.debugLine="txtEstadoActual.TextColor=0xFFDC143C";
__ref._txtestadoactual /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(((int)0xffdc143c));
 };
 };
RDebugUtils.currentLine=64553019;
 //BA.debugLineNum = 64553019;BA.debugLine="txtEntregado.Text=mData.Get(\"Entregado\")";
__ref._txtentregado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Entregado"))));
RDebugUtils.currentLine=64553020;
 //BA.debugLineNum = 64553020;BA.debugLine="If EstadoActual=\"ENTREGADO\" Then";
if ((_estadoactual).equals("ENTREGADO")) { 
RDebugUtils.currentLine=64553021;
 //BA.debugLineNum = 64553021;BA.debugLine="lblIndicadorEstado.Color=0xFF7FFF00";
__ref._lblindicadorestado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xff7fff00));
 }else {
RDebugUtils.currentLine=64553023;
 //BA.debugLineNum = 64553023;BA.debugLine="lblIndicadorEstado.Color=0xFFFF4500";
__ref._lblindicadorestado /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(((int)0xffff4500));
 };
RDebugUtils.currentLine=64553025;
 //BA.debugLineNum = 64553025;BA.debugLine="End Sub";
return "";
}
public void  _jamtableclv1_menubarmenuitem_action(b4j.docU.cexpedicionesperiodotxt __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableclv1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_JamTableCLV1_MenuBarMenuItem_Action rsub = new ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_JamTableCLV1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
String _tagmenuitem;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstdatoslineasseleccionadas = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=64356353;
 //BA.debugLineNum = 64356353;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 19;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","EjemploAccionLineasSeleccionadas","ActualizarStatusExpedicionesNoEntregadas")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 12;
if (true) break;
}
case 2: {
this.state = 18;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=64356355;
 //BA.debugLineNum = 64356355;BA.debugLine="If FechaFinalLong=0 Or FechaInicialLong=0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (__ref._fechafinallong /*long*/ ==0 || __ref._fechainiciallong /*long*/ ==0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=64356356;
 //BA.debugLineNum = 64356356;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica fech";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Indica fecha inicial y fecha final.","Error");
RDebugUtils.currentLine=64356357;
 //BA.debugLineNum = 64356357;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 7;
;
RDebugUtils.currentLine=64356358;
 //BA.debugLineNum = 64356358;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=64356360;
 //BA.debugLineNum = 64356360;BA.debugLine="If FechaFinalLong<FechaInicialLong Then";

case 7:
//if
this.state = 10;
if (__ref._fechafinallong /*long*/ <__ref._fechainiciallong /*long*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=64356361;
 //BA.debugLineNum = 64356361;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fi";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha final no puede ser anterior a la fecha inicial.","Error");
RDebugUtils.currentLine=64356362;
 //BA.debugLineNum = 64356362;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 10;
;
RDebugUtils.currentLine=64356363;
 //BA.debugLineNum = 64356363;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 19;
;
RDebugUtils.currentLine=64356365;
 //BA.debugLineNum = 64356365;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=64356367;
 //BA.debugLineNum = 64356367;BA.debugLine="Dim lstDatosLineasSeleccionadas As List=JamTabl";
_lstdatoslineasseleccionadas = new anywheresoftware.b4a.objects.collections.List();
_lstdatoslineasseleccionadas = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getdatositemsseleccionados /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=64356368;
 //BA.debugLineNum = 64356368;BA.debugLine="For Each mData As Map In lstDatosLineasSeleccio";
if (true) break;

case 13:
//for
this.state = 16;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group16 = _lstdatoslineasseleccionadas;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 16;
if (index16 < groupLen16) {
this.state = 15;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group16.Get(index16)));}
if (true) break;

case 23:
//C
this.state = 22;
index16++;
if (true) break;

case 15:
//C
this.state = 23;
RDebugUtils.currentLine=64356369;
 //BA.debugLineNum = 64356369;BA.debugLine="LogColor(\"DatosLineaSeleccionada : \" & mData,";
parent.__c.LogImpl("864356369","DatosLineaSeleccionada : "+BA.ObjectToString(_mdata),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=64356372;
 //BA.debugLineNum = 64356372;BA.debugLine="ActualizarStatusExpedicionesNoEntregadas";
__ref._actualizarstatusexpedicionesnoentregadas /*void*/ (null);
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=64356374;
 //BA.debugLineNum = 64356374;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarestadosexpedicion(b4j.docU.cexpedicionesperiodotxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";
if (Debug.shouldDelegate(ba, "mostrarestadosexpedicion", false))
	 {Debug.delegate(ba, "mostrarestadosexpedicion", new Object[] {_lstestadosexpedicion}); return;}
ResumableSub_MostrarEstadosExpedicion rsub = new ResumableSub_MostrarEstadosExpedicion(this,__ref,_lstestadosexpedicion);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarEstadosExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarEstadosExpedicion(b4j.docU.cexpedicionesperiodotxt parent,b4j.docU.cexpedicionesperiodotxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
this.__ref = parent;
}
b4j.docU.cexpedicionesperiodotxt __ref;
b4j.docU.cexpedicionesperiodotxt parent;
anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesperiodotxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=65011713;
 //BA.debugLineNum = 65011713;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
if (true) break;

case 1:
//for
this.state = 4;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group1 = _lstestadosexpedicion;
index1 = 0;
groupLen1 = group1.getSize();
this.state = 5;
if (true) break;

case 5:
//C
this.state = 4;
if (index1 < groupLen1) {
this.state = 3;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));}
if (true) break;

case 6:
//C
this.state = 5;
index1++;
if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=65011714;
 //BA.debugLineNum = 65011714;BA.debugLine="Log(mData)";
parent.__c.LogImpl("865011714",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=65011716;
 //BA.debugLineNum = 65011716;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mData.Get(\"ESTA";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mdata.Get((Object)("ESTADO"))),"Estado actual");
RDebugUtils.currentLine=65011717;
 //BA.debugLineNum = 65011717;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesperiodotxt", "mostrarestadosexpedicion"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=65011718;
 //BA.debugLineNum = 65011718;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}