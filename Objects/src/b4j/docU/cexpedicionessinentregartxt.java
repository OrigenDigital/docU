package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cexpedicionessinentregartxt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cexpedicionessinentregartxt", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cexpedicionessinentregartxt.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdocadjunta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechaalta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtkilos = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnexped1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnexped2 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombredestinatario = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtobservaciones = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpoblaciondestinatario = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtportee = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtreferencia1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdestino = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtestadoactual = null;
public anywheresoftware.b4a.objects.B4XCanvas _measurementcanvas = null;
public b4j.example.flexgrid _flexgriddialog = null;
public b4j.docU.jamcircularprogressbar _jamcircularprogressbar1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombrecliente = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombreresponsablecuenta = null;
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
public String  _initialize(b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=65994752;
 //BA.debugLineNum = 65994752;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=65994753;
 //BA.debugLineNum = 65994753;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=65994754;
 //BA.debugLineNum = 65994754;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=65994755;
 //BA.debugLineNum = 65994755;BA.debugLine="MeasurementCanvas.Initialize(p)";
__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=65994756;
 //BA.debugLineNum = 65994756;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=66060290;
 //BA.debugLineNum = 66060290;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=66060291;
 //BA.debugLineNum = 66060291;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=66060292;
 //BA.debugLineNum = 66060292;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=66060293;
 //BA.debugLineNum = 66060293;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=66060294;
 //BA.debugLineNum = 66060294;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=66060295;
 //BA.debugLineNum = 66060295;BA.debugLine="frm.RootPane.LoadLayout(\"scrExpedicionesSinEntreg";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrExpedicionesSinEntregarTXT");
RDebugUtils.currentLine=66060296;
 //BA.debugLineNum = 66060296;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "show"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=66060299;
 //BA.debugLineNum = 66060299;BA.debugLine="frm.Title=Main.PrefijoTitleForms &  \"  \" & \"Exped";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"  "+"Expediciones Sin Entregar TXT");
RDebugUtils.currentLine=66060301;
 //BA.debugLineNum = 66060301;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=66060304;
 //BA.debugLineNum = 66060304;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=66060314;
 //BA.debugLineNum = 66060314;BA.debugLine="JamTableCLV1.ColorPanelSeleccionado=0xFF87CEFA";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setcolorpanelseleccionado /*int*/ (null,((int)0xff87cefa));
RDebugUtils.currentLine=66060316;
 //BA.debugLineNum = 66060316;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._configurartableclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaExpedicionesSinEntregarTXT.json");
RDebugUtils.currentLine=66060317;
 //BA.debugLineNum = 66060317;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66060318;
 //BA.debugLineNum = 66060318;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("866060318",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=66060319;
 //BA.debugLineNum = 66060319;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=66060320;
 //BA.debugLineNum = 66060320;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=66060321;
 //BA.debugLineNum = 66060321;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=66060322;
 //BA.debugLineNum = 66060322;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=66060323;
 //BA.debugLineNum = 66060323;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=66060327;
 //BA.debugLineNum = 66060327;BA.debugLine="JamTableCLV1.AddMenuItemToMenuInMenuBar(\"Actualiz";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._addmenuitemtomenuinmenubar /*String*/ (null,"Actualizar","Actualizar",__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=66060330;
 //BA.debugLineNum = 66060330;BA.debugLine="JamTableCLV1.AlturaItems=190dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaitems /*int*/ (null,parent.__c.DipToCurrent((int) (190)));
RDebugUtils.currentLine=66060332;
 //BA.debugLineNum = 66060332;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmodoseleccionitems /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._modoseleccionindividualtemp /*String*/ );
RDebugUtils.currentLine=66060335;
 //BA.debugLineNum = 66060335;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
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
RDebugUtils.currentLine=66060337;
 //BA.debugLineNum = 66060337;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=66060338;
 //BA.debugLineNum = 66060338;BA.debugLine="mSQL.ExecNonQuery(\"PRAGMA journal_mode = wal\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("PRAGMA journal_mode = wal");
RDebugUtils.currentLine=66060340;
 //BA.debugLineNum = 66060340;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=66060342;
 //BA.debugLineNum = 66060342;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=66060343;
 //BA.debugLineNum = 66060343;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatos(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
String _dateformatant = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.objects.collections.List _lstregdocsexpptes = null;
Object _robj = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _micli = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;
int _numexpptes = 0;
int _intervalo = 0;
int _idxaqctestados = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsestados = null;
anywheresoftware.b4a.objects.collections.List _lstdatosestadosexpedicion = null;
anywheresoftware.b4a.objects.collections.Map _mdataestado = null;
String _estadoexp = "";
anywheresoftware.b4a.BA.IterableList group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=66125825;
 //BA.debugLineNum = 66125825;BA.debugLine="JamTableCLV1.Clear";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=66125830;
 //BA.debugLineNum = 66125830;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=66125831;
 //BA.debugLineNum = 66125831;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblExpedicionesSin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblExpedicionesSinEntregar");
RDebugUtils.currentLine=66125832;
 //BA.debugLineNum = 66125832;BA.debugLine="wait for(cmAuxTxT.ObtenerExpedicionesSinEntregarT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), parent._cmauxtxt._obtenerexpedicionessinentregartxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ());
this.state = 80;
return;
case 80:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66125834;
 //BA.debugLineNum = 66125834;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=66125835;
 //BA.debugLineNum = 66125835;BA.debugLine="If Accion<>\"OK\" Then";
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
RDebugUtils.currentLine=66125836;
 //BA.debugLineNum = 66125836;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=66125837;
 //BA.debugLineNum = 66125837;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=66125840;
 //BA.debugLineNum = 66125840;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=66125848;
 //BA.debugLineNum = 66125848;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=66125849;
 //BA.debugLineNum = 66125849;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblExpedicionesSinEntregar",_lstres);
RDebugUtils.currentLine=66125851;
 //BA.debugLineNum = 66125851;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=66125852;
 //BA.debugLineNum = 66125852;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=66125853;
 //BA.debugLineNum = 66125853;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblExpedicionesSinEntregar");
RDebugUtils.currentLine=66125854;
 //BA.debugLineNum = 66125854;BA.debugLine="Do While rs.nextrow";
if (true) break;

case 5:
//do while
this.state = 8;
while (_rs.NextRow()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
RDebugUtils.currentLine=66125858;
 //BA.debugLineNum = 66125858;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpedicionesS";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblExpedicionesSinEntregar set FechaSalida=? where CODORIGEN=? And CODDESTIN=? And NEXPED1=? And NEXPED2=? And ANO=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(parent.__c.DateTime.DateParse(_rs.GetString("FECHA_x0020_SALIDA"))),(Object)(_rs.GetString("CODORIGEN")),(Object)(_rs.GetString("CODDESTIN")),(Object)(_rs.GetInt("NEXPED1")),(Object)(_rs.GetInt("NEXPED2")),(Object)(_rs.GetString("ANO"))}));
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=66125861;
 //BA.debugLineNum = 66125861;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=66125862;
 //BA.debugLineNum = 66125862;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=66125863;
 //BA.debugLineNum = 66125863;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _senderfilter);
this.state = 81;
return;
case 81:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=66125864;
 //BA.debugLineNum = 66125864;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("866125864","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=66125866;
 //BA.debugLineNum = 66125866;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=66125868;
 //BA.debugLineNum = 66125868;BA.debugLine="Dim lstRegDocsExpPtes As List";
_lstregdocsexpptes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66125869;
 //BA.debugLineNum = 66125869;BA.debugLine="lstRegDocsExpPtes.Initialize";
_lstregdocsexpptes.Initialize();
RDebugUtils.currentLine=66125870;
 //BA.debugLineNum = 66125870;BA.debugLine="Wait For(DocumentosExpedicionesSinEntregarBatch)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), __ref._documentosexpedicionessinentregarbatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 82;
return;
case 82:
//C
this.state = 9;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66125871;
 //BA.debugLineNum = 66125871;BA.debugLine="Dim Success As Boolean=mRes.Get(\"Success\")";
_success = BA.ObjectToBoolean(_mres.Get((Object)("Success")));
RDebugUtils.currentLine=66125872;
 //BA.debugLineNum = 66125872;BA.debugLine="If Success Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=66125873;
 //BA.debugLineNum = 66125873;BA.debugLine="Dim lstRegDocsExpPtes As List=mRes.Get(\"lstReg\")";
_lstregdocsexpptes = new anywheresoftware.b4a.objects.collections.List();
_lstregdocsexpptes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=66125876;
 //BA.debugLineNum = 66125876;BA.debugLine="Wait For(EliminarTablaTemporalDocumentosReferenci";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), __ref._eliminartablatemporaldocumentosreferenciastte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 83;
return;
case 83:
//C
this.state = 13;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=66125878;
 //BA.debugLineNum = 66125878;BA.debugLine="If lstRegDocsExpPtes.Size>0 Then";
if (true) break;

case 13:
//if
this.state = 27;
if (_lstregdocsexpptes.getSize()>0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=66125909;
 //BA.debugLineNum = 66125909;BA.debugLine="For Each m As Map In lstRegDocsExpPtes";
if (true) break;

case 16:
//for
this.state = 26;
_m = new anywheresoftware.b4a.objects.collections.Map();
group33 = _lstregdocsexpptes;
index33 = 0;
groupLen33 = group33.getSize();
this.state = 84;
if (true) break;

case 84:
//C
this.state = 26;
if (index33 < groupLen33) {
this.state = 18;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group33.Get(index33)));}
if (true) break;

case 85:
//C
this.state = 84;
index33++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=66125912;
 //BA.debugLineNum = 66125912;BA.debugLine="Wait For(ClienteResponsableCuentaDocumento(m.Ge";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), __ref._clienteresponsablecuentadocumento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,BA.ObjectToString(_m.Get((Object)("Documento")))));
this.state = 86;
return;
case 86:
//C
this.state = 19;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66125913;
 //BA.debugLineNum = 66125913;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=66125914;
 //BA.debugLineNum = 66125914;BA.debugLine="If Accion=\"ErrConn\" Then";
if (true) break;

case 19:
//if
this.state = 22;
if ((_accion).equals("ErrConn")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=66125915;
 //BA.debugLineNum = 66125915;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=66125916;
 //BA.debugLineNum = 66125916;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=66125918;
 //BA.debugLineNum = 66125918;BA.debugLine="If Accion=\"OK\" Then";

case 22:
//if
this.state = 25;
if ((_accion).equals("OK")) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=66125919;
 //BA.debugLineNum = 66125919;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=66125920;
 //BA.debugLineNum = 66125920;BA.debugLine="Dim mICli As Map=lstReg.Get(0)";
_micli = new anywheresoftware.b4a.objects.collections.Map();
_micli = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=66125922;
 //BA.debugLineNum = 66125922;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblExpedicione";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblExpedicionesSinEntregar set NombreCliente=?, NombreResponsableCuenta=? where trim(REFERENCIA1)=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_micli.Get((Object)("NombreCliente")),_micli.Get((Object)("ResponsableCuenta")),_m.Get((Object)("ReferenciaExpedicionTransporte"))}));
 if (true) break;

case 25:
//C
this.state = 85;
;
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=66125927;
 //BA.debugLineNum = 66125927;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBa";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=66125928;
 //BA.debugLineNum = 66125928;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Su";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _senderfilter);
this.state = 87;
return;
case 87:
//C
this.state = 27;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=66125929;
 //BA.debugLineNum = 66125929;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("866125929","NonQuery: "+BA.ObjectToString(_success),0);
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=66125935;
 //BA.debugLineNum = 66125935;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblExpedicionesSinEntregar order by FechaSalida");
RDebugUtils.currentLine=66125936;
 //BA.debugLineNum = 66125936;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=66125937;
 //BA.debugLineNum = 66125937;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _rsub);
this.state = 88;
return;
case 88:
//C
this.state = 28;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66125938;
 //BA.debugLineNum = 66125938;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=66125939;
 //BA.debugLineNum = 66125939;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=66125940;
 //BA.debugLineNum = 66125940;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 28:
//if
this.state = 46;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=66125941;
 //BA.debugLineNum = 66125941;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 31:
//if
this.state = 38;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=66125942;
 //BA.debugLineNum = 66125942;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=66125943;
 //BA.debugLineNum = 66125943;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 89;
return;
case 89:
//C
this.state = 34;
;
RDebugUtils.currentLine=66125945;
 //BA.debugLineNum = 66125945;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=66125946;
 //BA.debugLineNum = 66125946;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 90;
return;
case 90:
//C
this.state = 34;
_rint = (int) result[1];
;
RDebugUtils.currentLine=66125947;
 //BA.debugLineNum = 66125947;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 34:
//if
this.state = 37;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=66125948;
 //BA.debugLineNum = 66125948;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=66125949;
 //BA.debugLineNum = 66125949;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=66125952;
 //BA.debugLineNum = 66125952;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=66125954;
 //BA.debugLineNum = 66125954;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 38:
//if
this.state = 45;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=66125955;
 //BA.debugLineNum = 66125955;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
if (true) break;

case 41:
//if
this.state = 44;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=66125956;
 //BA.debugLineNum = 66125956;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay Exp";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay Expediciones de TXT sin entregar.\n"+"(¿Error en webservice?)"),"Aviso");
RDebugUtils.currentLine=66125958;
 //BA.debugLineNum = 66125958;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 91;
return;
case 91:
//C
this.state = 44;
;
RDebugUtils.currentLine=66125959;
 //BA.debugLineNum = 66125959;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 44:
//C
this.state = 45;
;
RDebugUtils.currentLine=66125961;
 //BA.debugLineNum = 66125961;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=66125962;
 //BA.debugLineNum = 66125962;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 92;
return;
case 92:
//C
this.state = 45;
;
 if (true) break;

case 45:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=66125967;
 //BA.debugLineNum = 66125967;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Actualizar";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Actualizar de forma masiva los estados de las expediciciones pendientes?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=66125968;
 //BA.debugLineNum = 66125968;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 93;
return;
case 93:
//C
this.state = 47;
_rint = (int) result[1];
;
RDebugUtils.currentLine=66125969;
 //BA.debugLineNum = 66125969;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 47:
//if
this.state = 79;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=66125971;
 //BA.debugLineNum = 66125971;BA.debugLine="Dim NumExpPtes As Int=mSQL.ExecQuerySingleResult";
_numexpptes = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblExpedicionesSinEntregar")));
RDebugUtils.currentLine=66125972;
 //BA.debugLineNum = 66125972;BA.debugLine="Dim Intervalo As Int=100/NumExpPtes";
_intervalo = (int) (100/(double)_numexpptes);
RDebugUtils.currentLine=66125973;
 //BA.debugLineNum = 66125973;BA.debugLine="jamCircularProgressBar1.Visible=True";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvisible /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=66125974;
 //BA.debugLineNum = 66125974;BA.debugLine="Dim iDxAQctEstados As Int";
_idxaqctestados = 0;
RDebugUtils.currentLine=66125975;
 //BA.debugLineNum = 66125975;BA.debugLine="Dim rsEstados As ResultSet=mSQL.ExecQuery(\"selec";
_rsestados = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsestados = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblExpedicionesSinEntregar order by FechaSalida");
RDebugUtils.currentLine=66125976;
 //BA.debugLineNum = 66125976;BA.debugLine="Do While rsEstados.NextRow";
if (true) break;

case 50:
//do while
this.state = 59;
while (_rsestados.NextRow()) {
this.state = 52;
if (true) break;
}
if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=66125977;
 //BA.debugLineNum = 66125977;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(rs";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), parent._cmauxtxt._obtenerestadoexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_rsestados.GetString("CODORIGEN"),_rsestados.GetString("CODDESTIN"),_rsestados.GetInt("NEXPED1"),_rsestados.GetInt("NEXPED2"),_rsestados.GetString("ANO")));
this.state = 94;
return;
case 94:
//C
this.state = 53;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66125978;
 //BA.debugLineNum = 66125978;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=66125979;
 //BA.debugLineNum = 66125979;BA.debugLine="If Accion<>\"OK\" Then";
if (true) break;

case 53:
//if
this.state = 58;
if ((_accion).equals("OK") == false) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
RDebugUtils.currentLine=66125980;
 //BA.debugLineNum = 66125980;BA.debugLine="jamCircularProgressBar1.Value=0";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (0));
RDebugUtils.currentLine=66125981;
 //BA.debugLineNum = 66125981;BA.debugLine="jamCircularProgressBar1.Visible=False";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvisible /*boolean*/ (null,parent.__c.False);
RDebugUtils.currentLine=66125982;
 //BA.debugLineNum = 66125982;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha ac";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha actualizado el estado de las expediciones no entregadas","Error");
RDebugUtils.currentLine=66125983;
 //BA.debugLineNum = 66125983;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 95;
return;
case 95:
//C
this.state = 58;
;
RDebugUtils.currentLine=66125984;
 //BA.debugLineNum = 66125984;BA.debugLine="Exit";
this.state = 59;
if (true) break;
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=66125986;
 //BA.debugLineNum = 66125986;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=66125987;
 //BA.debugLineNum = 66125987;BA.debugLine="Dim mDataEstado As Map=lstDatosEstadosExpedici";
_mdataestado = new anywheresoftware.b4a.objects.collections.Map();
_mdataestado = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstdatosestadosexpedicion.Get((int) (0))));
RDebugUtils.currentLine=66125988;
 //BA.debugLineNum = 66125988;BA.debugLine="Dim EstadoExp As String=mDataEstado.Get(\"ESTAD";
_estadoexp = BA.ObjectToString(_mdataestado.Get((Object)("ESTADO")));
RDebugUtils.currentLine=66125989;
 //BA.debugLineNum = 66125989;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesSinE";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblExpedicionesSinEntregar set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadoexp),(Object)(_rsestados.GetString("CODORIGEN")),(Object)(_rsestados.GetString("CODDESTIN")),(Object)(_rsestados.GetInt("NEXPED1")),(Object)(_rsestados.GetInt("NEXPED2")),(Object)(_rsestados.GetString("ANO"))}));
 if (true) break;

case 58:
//C
this.state = 50;
;
RDebugUtils.currentLine=66125992;
 //BA.debugLineNum = 66125992;BA.debugLine="iDxAQctEstados=iDxAQctEstados+1";
_idxaqctestados = (int) (_idxaqctestados+1);
RDebugUtils.currentLine=66125993;
 //BA.debugLineNum = 66125993;BA.debugLine="jamCircularProgressBar1.Value=Floor(iDxAQctEsta";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (parent.__c.Floor(_idxaqctestados*_intervalo)));
 if (true) break;

case 59:
//C
this.state = 60;
;
RDebugUtils.currentLine=66125995;
 //BA.debugLineNum = 66125995;BA.debugLine="rsEstados.Close";
_rsestados.Close();
RDebugUtils.currentLine=66125996;
 //BA.debugLineNum = 66125996;BA.debugLine="jamCircularProgressBar1.Value=0";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvalue /*float*/ (null,(float) (0));
RDebugUtils.currentLine=66125997;
 //BA.debugLineNum = 66125997;BA.debugLine="jamCircularProgressBar1.Visible=False";
__ref._jamcircularprogressbar1 /*b4j.docU.jamcircularprogressbar*/ ._setvisible /*boolean*/ (null,parent.__c.False);
RDebugUtils.currentLine=66125999;
 //BA.debugLineNum = 66125999;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * fro";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblExpedicionesSinEntregar order by FechaSalida");
RDebugUtils.currentLine=66126000;
 //BA.debugLineNum = 66126000;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=66126001;
 //BA.debugLineNum = 66126001;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _rsub);
this.state = 96;
return;
case 96:
//C
this.state = 60;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66126002;
 //BA.debugLineNum = 66126002;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=66126003;
 //BA.debugLineNum = 66126003;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=66126004;
 //BA.debugLineNum = 66126004;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 60:
//if
this.state = 78;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 62;
}if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=66126005;
 //BA.debugLineNum = 66126005;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 63:
//if
this.state = 70;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 65;
}if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=66126006;
 //BA.debugLineNum = 66126006;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=66126007;
 //BA.debugLineNum = 66126007;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 97;
return;
case 97:
//C
this.state = 66;
;
RDebugUtils.currentLine=66126009;
 //BA.debugLineNum = 66126009;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir C";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=66126010;
 //BA.debugLineNum = 66126010;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 98;
return;
case 98:
//C
this.state = 66;
_rint = (int) result[1];
;
RDebugUtils.currentLine=66126011;
 //BA.debugLineNum = 66126011;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 66:
//if
this.state = 69;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
RDebugUtils.currentLine=66126012;
 //BA.debugLineNum = 66126012;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=66126013;
 //BA.debugLineNum = 66126013;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=66126016;
 //BA.debugLineNum = 66126016;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=66126018;
 //BA.debugLineNum = 66126018;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 70:
//if
this.state = 77;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=66126019;
 //BA.debugLineNum = 66126019;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then";
if (true) break;

case 73:
//if
this.state = 76;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 75;
}if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=66126020;
 //BA.debugLineNum = 66126020;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No hay Ex";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No hay Expediciones de TXT sin entregar.\n"+"(¿Error en webservice?)"),"Aviso");
RDebugUtils.currentLine=66126022;
 //BA.debugLineNum = 66126022;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 99;
return;
case 99:
//C
this.state = 76;
;
RDebugUtils.currentLine=66126023;
 //BA.debugLineNum = 66126023;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 76:
//C
this.state = 77;
;
RDebugUtils.currentLine=66126025;
 //BA.debugLineNum = 66126025;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=66126026;
 //BA.debugLineNum = 66126026;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizardatos"), _msa);
this.state = 100;
return;
case 100:
//C
this.state = 77;
;
 if (true) break;

case 77:
//C
this.state = 78;
;
 if (true) break;

case 78:
//C
this.state = 79;
;
 if (true) break;

case 79:
//C
this.state = -1;
;
RDebugUtils.currentLine=66126041;
 //BA.debugLineNum = 66126041;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=66387968;
 //BA.debugLineNum = 66387968;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=66387969;
 //BA.debugLineNum = 66387969;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=66387970;
 //BA.debugLineNum = 66387970;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=66387971;
 //BA.debugLineNum = 66387971;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpedicionessinentregarbatch(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "documentosexpedicionessinentregarbatch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpedicionessinentregarbatch", null));}
ResumableSub_DocumentosExpedicionesSinEntregarBatch rsub = new ResumableSub_DocumentosExpedicionesSinEntregarBatch(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicionesSinEntregarBatch extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesSinEntregarBatch(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67436546;
 //BA.debugLineNum = 67436546;BA.debugLine="Dim mResult As Map";
_mresult = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67436547;
 //BA.debugLineNum = 67436547;BA.debugLine="mResult.Initialize";
_mresult.Initialize();
RDebugUtils.currentLine=67436548;
 //BA.debugLineNum = 67436548;BA.debugLine="mResult.Put(\"Success\", False)";
_mresult.Put((Object)("Success"),(Object)(parent.__c.False));
RDebugUtils.currentLine=67436550;
 //BA.debugLineNum = 67436550;BA.debugLine="Dim NumRegRef1Doc As Int=Utilidades.FixNullInt(mS";
_numregref1doc = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblExpedicionesSinEntregar where REFERENCIA1<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{""}))));
RDebugUtils.currentLine=67436551;
 //BA.debugLineNum = 67436551;BA.debugLine="If NumRegRef1Doc=0 Then Return mResult";
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
RDebugUtils.currentLine=67436553;
 //BA.debugLineNum = 67436553;BA.debugLine="Wait For(CrearTablaTemporalDocumentosReferenciasT";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), __ref._creartablatemporaldocumentosreferenciastte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 27;
return;
case 27:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67436554;
 //BA.debugLineNum = 67436554;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=67436555;
 //BA.debugLineNum = 67436555;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
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
RDebugUtils.currentLine=67436558;
 //BA.debugLineNum = 67436558;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67436559;
 //BA.debugLineNum = 67436559;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=67436564;
 //BA.debugLineNum = 67436564;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery2(\"select REFER";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery2("select REFERENCIA1 from tblExpedicionesSinEntregar where referencia1<>? order by REFERENCIA1",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{""}));
RDebugUtils.currentLine=67436565;
 //BA.debugLineNum = 67436565;BA.debugLine="Do While rs.NextRow";
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
RDebugUtils.currentLine=67436567;
 //BA.debugLineNum = 67436567;BA.debugLine="Log(\"REFERENCIA1 \" & rs.GetString(\"REFERENCIA1\")";
parent.__c.LogImpl("867436567","REFERENCIA1 "+_rs.GetString("REFERENCIA1"),0);
RDebugUtils.currentLine=67436569;
 //BA.debugLineNum = 67436569;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarDatosTablaTemporalDocumentosReferenciasTte",new Object[]{(Object)(_rs.GetString("REFERENCIA1"))});
RDebugUtils.currentLine=67436570;
 //BA.debugLineNum = 67436570;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=67436572;
 //BA.debugLineNum = 67436572;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=67436573;
 //BA.debugLineNum = 67436573;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 28;
return;
case 28:
//C
this.state = 17;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=67436574;
 //BA.debugLineNum = 67436574;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=67436575;
 //BA.debugLineNum = 67436575;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar los datos de documentos expedición en la tabla temporal tblreferenciasexpedicionestemp.","Error");
RDebugUtils.currentLine=67436576;
 //BA.debugLineNum = 67436576;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 20;
;
RDebugUtils.currentLine=67436577;
 //BA.debugLineNum = 67436577;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=67436580;
 //BA.debugLineNum = 67436580;BA.debugLine="Wait For(DocumentosExpedicionesPendientes) comple";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "documentosexpedicionessinentregarbatch"), __ref._documentosexpedicionespendientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67436581;
 //BA.debugLineNum = 67436581;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=67436582;
 //BA.debugLineNum = 67436582;BA.debugLine="If Accion<>\"OK\" Then Return mResult";
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
RDebugUtils.currentLine=67436584;
 //BA.debugLineNum = 67436584;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=67436585;
 //BA.debugLineNum = 67436585;BA.debugLine="mResult.put(\"Success\", True)";
_mresult.Put((Object)("Success"),(Object)(parent.__c.True));
RDebugUtils.currentLine=67436586;
 //BA.debugLineNum = 67436586;BA.debugLine="mResult.put(\"lstReg\", lstReg)";
_mresult.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=67436588;
 //BA.debugLineNum = 67436588;BA.debugLine="Return mResult";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mresult));return;};
RDebugUtils.currentLine=67436589;
 //BA.debugLineNum = 67436589;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _eliminartablatemporaldocumentosreferenciastte(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "eliminartablatemporaldocumentosreferenciastte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "eliminartablatemporaldocumentosreferenciastte", null));}
ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_EliminarTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=67633153;
 //BA.debugLineNum = 67633153;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"E";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EliminarTablaTemporalDocumentosReferenciasTte",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=67633154;
 //BA.debugLineNum = 67633154;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "eliminartablatemporaldocumentosreferenciastte"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=67633160;
 //BA.debugLineNum = 67633160;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=67633161;
 //BA.debugLineNum = 67633161;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _clienteresponsablecuentadocumento(b4j.docU.cexpedicionessinentregartxt __ref,String _doc) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "clienteresponsablecuentadocumento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "clienteresponsablecuentadocumento", new Object[] {_doc}));}
ResumableSub_ClienteResponsableCuentaDocumento rsub = new ResumableSub_ClienteResponsableCuentaDocumento(this,__ref,_doc);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ClienteResponsableCuentaDocumento extends BA.ResumableSub {
public ResumableSub_ClienteResponsableCuentaDocumento(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref,String _doc) {
this.parent = parent;
this.__ref = __ref;
this._doc = _doc;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
String _doc;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67764225;
 //BA.debugLineNum = 67764225;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=67764228;
 //BA.debugLineNum = 67764228;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67764229;
 //BA.debugLineNum = 67764229;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=67764232;
 //BA.debugLineNum = 67764232;BA.debugLine="Dim comando As String";
_comando = "";
RDebugUtils.currentLine=67764233;
 //BA.debugLineNum = 67764233;BA.debugLine="Select True";
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
RDebugUtils.currentLine=67764235;
 //BA.debugLineNum = 67764235;BA.debugLine="comando=\"ClienteResponsableCuentaALBV\"";
_comando = "ClienteResponsableCuentaALBV";
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=67764237;
 //BA.debugLineNum = 67764237;BA.debugLine="comando=\"ClienteResponsableCuentaRT\"";
_comando = "ClienteResponsableCuentaRT";
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=67764239;
 //BA.debugLineNum = 67764239;BA.debugLine="Accion=\"ErrTipoDoc\"";
_accion = "ErrTipoDoc";
RDebugUtils.currentLine=67764240;
 //BA.debugLineNum = 67764240;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=67764241;
 //BA.debugLineNum = 67764241;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=67764243;
 //BA.debugLineNum = 67764243;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_doc)},parent);
RDebugUtils.currentLine=67764245;
 //BA.debugLineNum = 67764245;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "clienteresponsablecuentadocumento"), null);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67764246;
 //BA.debugLineNum = 67764246;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=67764247;
 //BA.debugLineNum = 67764247;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=67764248;
 //BA.debugLineNum = 67764248;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "clienteresponsablecuentadocumento"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
RDebugUtils.currentLine=67764249;
 //BA.debugLineNum = 67764249;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=67764250;
 //BA.debugLineNum = 67764250;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=67764253;
 //BA.debugLineNum = 67764253;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=67764254;
 //BA.debugLineNum = 67764254;BA.debugLine="Accion=\"SinResultado\"";
_accion = "SinResultado";
RDebugUtils.currentLine=67764255;
 //BA.debugLineNum = 67764255;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=67764257;
 //BA.debugLineNum = 67764257;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=67764258;
 //BA.debugLineNum = 67764258;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=67764259;
 //BA.debugLineNum = 67764259;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=67764260;
 //BA.debugLineNum = 67764260;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=67764264;
 //BA.debugLineNum = 67764264;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=67764265;
 //BA.debugLineNum = 67764265;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarestadoexpedicion(b4j.docU.cexpedicionessinentregartxt __ref,int _indexsel,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "actualizarestadoexpedicion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarestadoexpedicion", new Object[] {_indexsel,_lstestadosexpedicion}));}
ResumableSub_ActualizarEstadoExpedicion rsub = new ResumableSub_ActualizarEstadoExpedicion(this,__ref,_indexsel,_lstestadosexpedicion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarEstadoExpedicion extends BA.ResumableSub {
public ResumableSub_ActualizarEstadoExpedicion(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref,int _indexsel,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._indexsel = _indexsel;
this._lstestadosexpedicion = _lstestadosexpedicion;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
int _indexsel;
anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion;
anywheresoftware.b4a.objects.collections.Map _mestado = null;
String _estadoexp = "";
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xtf = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67108866;
 //BA.debugLineNum = 67108866;BA.debugLine="Log(\"Offset: \" & JamTableCLV1.sv.ScrollViewOffset";
parent.__c.LogImpl("867108866","Offset: "+BA.NumberToString(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY()),0);
RDebugUtils.currentLine=67108868;
 //BA.debugLineNum = 67108868;BA.debugLine="Dim mEstado As Map=lstEstadosExpedicion.Get(0)";
_mestado = new anywheresoftware.b4a.objects.collections.Map();
_mestado = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstestadosexpedicion.Get((int) (0))));
RDebugUtils.currentLine=67108869;
 //BA.debugLineNum = 67108869;BA.debugLine="Dim EstadoExp As String";
_estadoexp = "";
RDebugUtils.currentLine=67108870;
 //BA.debugLineNum = 67108870;BA.debugLine="If mEstado.ContainsKey(\"ESTADO\") Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_mestado.ContainsKey((Object)("ESTADO"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=67108871;
 //BA.debugLineNum = 67108871;BA.debugLine="EstadoExp=mEstado.get(\"ESTADO\")";
_estadoexp = BA.ObjectToString(_mestado.Get((Object)("ESTADO")));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=67108873;
 //BA.debugLineNum = 67108873;BA.debugLine="EstadoExp=\"ERROR, ESTADO SIN ACTUALIZAR \"";
_estadoexp = "ERROR, ESTADO SIN ACTUALIZAR ";
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=67108875;
 //BA.debugLineNum = 67108875;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_indexsel);
RDebugUtils.currentLine=67108876;
 //BA.debugLineNum = 67108876;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
if (true) break;

case 7:
//for
this.state = 14;
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
group10 = _pnl.GetAllViewsRecursive();
index10 = 0;
groupLen10 = group10.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 14;
if (index10 < groupLen10) {
this.state = 9;
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group10.Get(index10)));}
if (true) break;

case 28:
//C
this.state = 27;
index10++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=67108877;
 //BA.debugLineNum = 67108877;BA.debugLine="If n.Tag=\"ESTADO\" Then";
if (true) break;

case 10:
//if
this.state = 13;
if ((_n.getTag()).equals((Object)("ESTADO"))) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=67108878;
 //BA.debugLineNum = 67108878;BA.debugLine="Dim tF As TextField=n";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_tf = (anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper(), (javafx.scene.control.TextField)(_n.getObject()));
RDebugUtils.currentLine=67108879;
 //BA.debugLineNum = 67108879;BA.debugLine="tF.Text=EstadoExp";
_tf.setText(_estadoexp);
RDebugUtils.currentLine=67108880;
 //BA.debugLineNum = 67108880;BA.debugLine="Exit";
this.state = 14;
if (true) break;
 if (true) break;

case 13:
//C
this.state = 28;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=67108884;
 //BA.debugLineNum = 67108884;BA.debugLine="Dim xtF As B4XView=tF";
_xtf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xtf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
RDebugUtils.currentLine=67108885;
 //BA.debugLineNum = 67108885;BA.debugLine="If EstadoExp.StartsWith(\"ERROR\") Then";
if (true) break;

case 15:
//if
this.state = 26;
if (_estadoexp.startsWith("ERROR")) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 26;
RDebugUtils.currentLine=67108886;
 //BA.debugLineNum = 67108886;BA.debugLine="xtF.Color=xui.Color_Red";
_xtf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=67108887;
 //BA.debugLineNum = 67108887;BA.debugLine="xtF.TextColor=xui.Color_White";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=67108891;
 //BA.debugLineNum = 67108891;BA.debugLine="If EstadoExp.Contains(\"con incidencia\") Then";
if (true) break;

case 20:
//if
this.state = 25;
if (_estadoexp.contains("con incidencia")) { 
this.state = 22;
}else {
this.state = 24;
}if (true) break;

case 22:
//C
this.state = 25;
RDebugUtils.currentLine=67108892;
 //BA.debugLineNum = 67108892;BA.debugLine="xtF.Color=xui.Color_Red";
_xtf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=67108893;
 //BA.debugLineNum = 67108893;BA.debugLine="xtF.TextColor=xui.Color_White";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=67108895;
 //BA.debugLineNum = 67108895;BA.debugLine="xtF.Color=0xFFFFA500";
_xtf.setColor(((int)0xffffa500));
RDebugUtils.currentLine=67108896;
 //BA.debugLineNum = 67108896;BA.debugLine="xtF.TextColor=xui.Color_Black";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=67108900;
 //BA.debugLineNum = 67108900;BA.debugLine="Dim mData As Map=JamTableCLV1.GetDatosItemNodo(tF";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getdatositemnodo /*anywheresoftware.b4a.objects.collections.Map*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject())));
RDebugUtils.currentLine=67108901;
 //BA.debugLineNum = 67108901;BA.debugLine="mData.Put(\"ESTADO\",EstadoExp)";
_mdata.Put((Object)("ESTADO"),(Object)(_estadoexp));
RDebugUtils.currentLine=67108902;
 //BA.debugLineNum = 67108902;BA.debugLine="Log(\"Offset: \" & JamTableCLV1.sv.ScrollViewOffset";
parent.__c.LogImpl("867108902","Offset: "+BA.NumberToString(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY()),0);
RDebugUtils.currentLine=67108903;
 //BA.debugLineNum = 67108903;BA.debugLine="mSQL.ExecNonQuery2(\"update tblExpedicionesSinEntr";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblExpedicionesSinEntregar set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadoexp),_mdata.Get((Object)("CODORIGEN")),_mdata.Get((Object)("CODDESTIN")),_mdata.Get((Object)("NEXPED1")),_mdata.Get((Object)("NEXPED2")),_mdata.Get((Object)("ANO"))}));
RDebugUtils.currentLine=67108905;
 //BA.debugLineNum = 67108905;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set ESTADO=? where CODORIGEN=? and CODDESTIN=? and NEXPED1=? and NEXPED2=? and ANO=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadoexp),_mdata.Get((Object)("CODORIGEN")),_mdata.Get((Object)("CODDESTIN")),_mdata.Get((Object)("NEXPED1")),_mdata.Get((Object)("NEXPED2")),_mdata.Get((Object)("ANO"))}));
RDebugUtils.currentLine=67108908;
 //BA.debugLineNum = 67108908;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "actualizarestadoexpedicion"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=67108910;
 //BA.debugLineNum = 67108910;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=67108912;
 //BA.debugLineNum = 67108912;BA.debugLine="Log(\"Offset: \" & JamTableCLV1.sv.ScrollViewOffset";
parent.__c.LogImpl("867108912","Offset: "+BA.NumberToString(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY()),0);
RDebugUtils.currentLine=67108913;
 //BA.debugLineNum = 67108913;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnaccionesexpedicionsinentregar_click(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "btnaccionesexpedicionsinentregar_click", false))
	 {Debug.delegate(ba, "btnaccionesexpedicionsinentregar_click", null); return;}
ResumableSub_btnAccionesExpedicionSinEntregar_Click rsub = new ResumableSub_btnAccionesExpedicionSinEntregar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnAccionesExpedicionSinEntregar_Click extends BA.ResumableSub {
public ResumableSub_btnAccionesExpedicionSinEntregar_Click(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
int _idtransportetxt = 0;
String _numexpediciontxtmysql = "";
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
float _offset_before_update = 0f;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstdatosestadosexpedicion = null;
Object _robj = null;
anywheresoftware.b4a.objects.collections.List _lstdatosincidenciasexpedicion = null;
String _numexpedicion = "";
String _urltxt = "";
Object _msa = null;
int step33;
int limit33;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=66977795;
 //BA.debugLineNum = 66977795;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=66977796;
 //BA.debugLineNum = 66977796;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=66977797;
 //BA.debugLineNum = 66977797;BA.debugLine="Log(mData)";
parent.__c.LogImpl("866977797",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=66977798;
 //BA.debugLineNum = 66977798;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=66977800;
 //BA.debugLineNum = 66977800;BA.debugLine="Dim IDTransporteTXT As Int=7";
_idtransportetxt = (int) (7);
RDebugUtils.currentLine=66977801;
 //BA.debugLineNum = 66977801;BA.debugLine="Dim NumExpedicionTXTMySQL As String=\"001\" & mData";
_numexpediciontxtmysql = "001"+BA.ObjectToString(_mdata.Get((Object)("CODORIGEN")))+"000"+BA.ObjectToString(_mdata.Get((Object)("NEXPED1")))+BA.ObjectToString(_mdata.Get((Object)("NEXPED2")))+BA.ObjectToString(_mdata.Get((Object)("ANO")));
RDebugUtils.currentLine=66977803;
 //BA.debugLineNum = 66977803;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=66977805;
 //BA.debugLineNum = 66977805;BA.debugLine="Dialog.Title=\"Selecciona Acción\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Acción");
RDebugUtils.currentLine=66977806;
 //BA.debugLineNum = 66977806;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=66977807;
 //BA.debugLineNum = 66977807;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=66977808;
 //BA.debugLineNum = 66977808;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=66977809;
 //BA.debugLineNum = 66977809;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=66977810;
 //BA.debugLineNum = 66977810;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=66977812;
 //BA.debugLineNum = 66977812;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
parent._utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=66977813;
 //BA.debugLineNum = 66977813;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
parent._utilidades._setlightthemelist /*String*/ (_b4xlistdlg);
RDebugUtils.currentLine=66977816;
 //BA.debugLineNum = 66977816;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=66977817;
 //BA.debugLineNum = 66977817;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=66977818;
 //BA.debugLineNum = 66977818;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=66977820;
 //BA.debugLineNum = 66977820;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=66977821;
 //BA.debugLineNum = 66977821;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=66977823;
 //BA.debugLineNum = 66977823;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=66977824;
 //BA.debugLineNum = 66977824;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=66977825;
 //BA.debugLineNum = 66977825;BA.debugLine="lstOpciones.Add(\"Actualizar Estado Expedición\")";
_lstopciones.Add((Object)("Actualizar Estado Expedición"));
RDebugUtils.currentLine=66977826;
 //BA.debugLineNum = 66977826;BA.debugLine="lstOpciones.Add(\"Buscar Histórico Estados Expedic";
_lstopciones.Add((Object)("Buscar Histórico Estados Expedición"));
RDebugUtils.currentLine=66977827;
 //BA.debugLineNum = 66977827;BA.debugLine="lstOpciones.Add(\"Consulta Incidencias Expedición\"";
_lstopciones.Add((Object)("Consulta Incidencias Expedición"));
RDebugUtils.currentLine=66977828;
 //BA.debugLineNum = 66977828;BA.debugLine="lstOpciones.Add(\"Ficha Expedición Web TXT\")";
_lstopciones.Add((Object)("Ficha Expedición Web TXT"));
RDebugUtils.currentLine=66977829;
 //BA.debugLineNum = 66977829;BA.debugLine="lstOpciones.Add(\"Documentos NAV de la expedición\"";
_lstopciones.Add((Object)("Documentos NAV de la expedición"));
RDebugUtils.currentLine=66977831;
 //BA.debugLineNum = 66977831;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=66977833;
 //BA.debugLineNum = 66977833;BA.debugLine="B4XListDlg.Resize(500dip, 400dip)";
_b4xlistdlg._resize /*String*/ (null,parent.__c.DipToCurrent((int) (500)),parent.__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=66977834;
 //BA.debugLineNum = 66977834;BA.debugLine="B4XListDlg.CustomListView1.AsView.width=500dip";
_b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ._asview().setWidth(parent.__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=66977835;
 //BA.debugLineNum = 66977835;BA.debugLine="B4XListDlg.CustomListView1.AsView.Height=400dip";
_b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ._asview().setHeight(parent.__c.DipToCurrent((int) (400)));
RDebugUtils.currentLine=66977839;
 //BA.debugLineNum = 66977839;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=66977841;
 //BA.debugLineNum = 66977841;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step33 = 1;
limit33 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 55;
if (true) break;

case 55:
//C
this.state = 4;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 3;
if (true) break;

case 56:
//C
this.state = 55;
_i = ((int)(0 + _i + step33)) ;
if (true) break;

case 3:
//C
this.state = 56;
RDebugUtils.currentLine=66977842;
 //BA.debugLineNum = 66977842;BA.debugLine="xclv.ResizeItem(i,60dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (60)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=66977846;
 //BA.debugLineNum = 66977846;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=66977847;
 //BA.debugLineNum = 66977847;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=66977849;
 //BA.debugLineNum = 66977849;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=66977850;
 //BA.debugLineNum = 66977850;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=66977851;
 //BA.debugLineNum = 66977851;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=66977854;
 //BA.debugLineNum = 66977854;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), _rsub);
this.state = 57;
return;
case 57:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=66977856;
 //BA.debugLineNum = 66977856;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=66977857;
 //BA.debugLineNum = 66977857;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=66977859;
 //BA.debugLineNum = 66977859;BA.debugLine="JamTableCLV1.QuitarSeleccionTodosItems";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._quitarselecciontodositems /*String*/ (null);
RDebugUtils.currentLine=66977860;
 //BA.debugLineNum = 66977860;BA.debugLine="JamTableCLV1.SeleccionarItem(IndexSel)";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._seleccionaritem /*String*/ (null,_indexsel);
RDebugUtils.currentLine=66977862;
 //BA.debugLineNum = 66977862;BA.debugLine="Dim OpcionSel As String=B4XListDlg.SelectedItem";
_opcionsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=66977864;
 //BA.debugLineNum = 66977864;BA.debugLine="Select Case OpcionSel";
if (true) break;

case 15:
//select
this.state = 54;
switch (BA.switchObjectToInt(_opcionsel,"Actualizar Estado Expedición","Buscar Histórico Estados Expedición","Consulta Incidencias Expedición","Ficha Expedición Web TXT","Documentos NAV de la expedición")) {
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
this.state = 53;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=66977866;
 //BA.debugLineNum = 66977866;BA.debugLine="Dim offset_before_update As Float=  JamTableCLV";
_offset_before_update = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=66977867;
 //BA.debugLineNum = 66977867;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTabl";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=66977868;
 //BA.debugLineNum = 66977868;BA.debugLine="Wait For(cmAuxTxT.ObtenerEstadoExpedicionTXT(mD";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerestadoexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))),BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED1")))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED2")))),BA.ObjectToString(_mdata.Get((Object)("ANO")))));
this.state = 58;
return;
case 58:
//C
this.state = 18;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66977869;
 //BA.debugLineNum = 66977869;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=66977870;
 //BA.debugLineNum = 66977870;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=66977871;
 //BA.debugLineNum = 66977871;BA.debugLine="If Accion<>\"OK\" Then Return";
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
this.state = 54;
;
RDebugUtils.currentLine=66977872;
 //BA.debugLineNum = 66977872;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=66977874;
 //BA.debugLineNum = 66977874;BA.debugLine="wait for(ActualizarEstadoExpedicion(IndexSel, l";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), __ref._actualizarestadoexpedicion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_indexsel,_lstdatosestadosexpedicion));
this.state = 59;
return;
case 59:
//C
this.state = 54;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=66977875;
 //BA.debugLineNum = 66977875;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_update);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=66977878;
 //BA.debugLineNum = 66977878;BA.debugLine="Wait For(cmAuxTxT.ObtenerHistoricoEstadosExpedi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerhistoricoestadosexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))),BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED1")))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED2")))),BA.ObjectToString(_mdata.Get((Object)("ANO")))));
this.state = 60;
return;
case 60:
//C
this.state = 26;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66977879;
 //BA.debugLineNum = 66977879;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=66977880;
 //BA.debugLineNum = 66977880;BA.debugLine="If Accion<>\"OK\" Then Return";
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
this.state = 54;
;
RDebugUtils.currentLine=66977881;
 //BA.debugLineNum = 66977881;BA.debugLine="Dim lstDatosEstadosExpedicion As List=mRes.Get(";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=66977882;
 //BA.debugLineNum = 66977882;BA.debugLine="MostrarHistoricoEstadosExpedicion(lstDatosEstad";
__ref._mostrarhistoricoestadosexpedicion /*void*/ (null,_lstdatosestadosexpedicion);
 if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=66977884;
 //BA.debugLineNum = 66977884;BA.debugLine="Wait For(cmAuxTxT.ObtenerConsultaIncidenciasExp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerconsultaincidenciasexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))),BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED1")))),(int)(BA.ObjectToNumber(_mdata.Get((Object)("NEXPED2")))),BA.ObjectToString(_mdata.Get((Object)("ANO")))));
this.state = 61;
return;
case 61:
//C
this.state = 34;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66977885;
 //BA.debugLineNum = 66977885;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=66977886;
 //BA.debugLineNum = 66977886;BA.debugLine="If Accion<>\"OK\" Then Return";
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
this.state = 54;
;
RDebugUtils.currentLine=66977887;
 //BA.debugLineNum = 66977887;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List=mRes.";
_lstdatosincidenciasexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosincidenciasexpedicion = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=66977888;
 //BA.debugLineNum = 66977888;BA.debugLine="MostrarIncidenciasExpedicion(lstDatosIncidencia";
__ref._mostrarincidenciasexpedicion /*void*/ (null,_lstdatosincidenciasexpedicion);
 if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=66977891;
 //BA.debugLineNum = 66977891;BA.debugLine="Dim NumExpedicion As String=$\"${mData.Get(\"CODE";
_numexpedicion = (""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("CODEMPRESA")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("CODORIGEN")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("CODDESTIN")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("NEXPED1")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("NEXPED2")))+""+parent.__c.SmartStringFormatter("",_mdata.Get((Object)("ANO")))+"");
RDebugUtils.currentLine=66977892;
 //BA.debugLineNum = 66977892;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), parent._cmauxtxt._obtenerurltrazabilidadexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_numexpedicion));
this.state = 62;
return;
case 62:
//C
this.state = 42;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=66977893;
 //BA.debugLineNum = 66977893;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=66977894;
 //BA.debugLineNum = 66977894;BA.debugLine="If Accion=\"OK\" Then";
if (true) break;

case 42:
//if
this.state = 51;
if ((_accion).equals("OK")) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=66977895;
 //BA.debugLineNum = 66977895;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
_urltxt = BA.ObjectToString(_mres.Get((Object)("URL")));
RDebugUtils.currentLine=66977896;
 //BA.debugLineNum = 66977896;BA.debugLine="If URLtxt<>\"\" Then";
if (true) break;

case 45:
//if
this.state = 50;
if ((_urltxt).equals("") == false) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
RDebugUtils.currentLine=66977897;
 //BA.debugLineNum = 66977897;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .ShowExternalDocument(_urltxt);
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=66977899;
 //BA.debugLineNum = 66977899;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Método Url";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Método UrlTracking TXT devuelve cadena vacía.","Error");
RDebugUtils.currentLine=66977900;
 //BA.debugLineNum = 66977900;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "btnaccionesexpedicionsinentregar_click"), _msa);
this.state = 63;
return;
case 63:
//C
this.state = 50;
;
 if (true) break;

case 50:
//C
this.state = 51;
;
 if (true) break;

case 51:
//C
this.state = 54;
;
 if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=66977904;
 //BA.debugLineNum = 66977904;BA.debugLine="DatosExpedicionInternaExpedicionTransporte(IDTr";
__ref._datosexpedicioninternaexpediciontransporte /*void*/ (null,_idtransportetxt,_numexpediciontxtmysql);
 if (true) break;

case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=66977906;
 //BA.debugLineNum = 66977906;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarhistoricoestadosexpedicion(b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "mostrarhistoricoestadosexpedicion", false))
	 {Debug.delegate(ba, "mostrarhistoricoestadosexpedicion", new Object[] {_lstestadosexpedicion}); return;}
ResumableSub_MostrarHistoricoEstadosExpedicion rsub = new ResumableSub_MostrarHistoricoEstadosExpedicion(this,__ref,_lstestadosexpedicion);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarHistoricoEstadosExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarHistoricoEstadosExpedicion(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67174401;
 //BA.debugLineNum = 67174401;BA.debugLine="If lstEstadosExpedicion.Size=0 Then Return";
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
RDebugUtils.currentLine=67174403;
 //BA.debugLineNum = 67174403;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=67174404;
 //BA.debugLineNum = 67174404;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
RDebugUtils.currentLine=67174406;
 //BA.debugLineNum = 67174406;BA.debugLine="Dim lstEstadosAj As List";
_lstestadosaj = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67174407;
 //BA.debugLineNum = 67174407;BA.debugLine="lstEstadosAj.Initialize";
_lstestadosaj.Initialize();
RDebugUtils.currentLine=67174408;
 //BA.debugLineNum = 67174408;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
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
RDebugUtils.currentLine=67174412;
 //BA.debugLineNum = 67174412;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
RDebugUtils.currentLine=67174413;
 //BA.debugLineNum = 67174413;BA.debugLine="Dim TicksFecha As Long=DateTime.DateParse(mData.";
_ticksfecha = parent.__c.DateTime.DateParse(BA.ObjectToString(_mdata.Get((Object)("FECHAESTADO"))));
RDebugUtils.currentLine=67174414;
 //BA.debugLineNum = 67174414;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=67174415;
 //BA.debugLineNum = 67174415;BA.debugLine="Dim mDataAj As Map=CreateMap(\"Centro\":mData.Get(";
_mdataaj = new anywheresoftware.b4a.objects.collections.Map();
_mdataaj = parent.__c.createMap(new Object[] {(Object)("Centro"),_mdata.Get((Object)("CENTRO")),(Object)("Estado"),_mdata.Get((Object)("ESTADO")),(Object)("Fecha"),(Object)(parent.__c.DateTime.Date(_ticksfecha)+" "+parent.__c.DateTime.Time(_ticksfecha))});
RDebugUtils.currentLine=67174416;
 //BA.debugLineNum = 67174416;BA.debugLine="lstEstadosAj.Add(mDataAj)";
_lstestadosaj.Add((Object)(_mdataaj.getObject()));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=67174418;
 //BA.debugLineNum = 67174418;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=67174420;
 //BA.debugLineNum = 67174420;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
_pbaseflexgrid = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbaseflexgrid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=67174421;
 //BA.debugLineNum = 67174421;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (500)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY())));
RDebugUtils.currentLine=67174423;
 //BA.debugLineNum = 67174423;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
_pbaseflexgrid.LoadLayout("scrDialogFlexGrid",ba);
RDebugUtils.currentLine=67174425;
 //BA.debugLineNum = 67174425;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
_headersfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_headersfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15)).getObject()));
RDebugUtils.currentLine=67174426;
 //BA.debugLineNum = 67174426;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv7((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject())));
RDebugUtils.currentLine=67174428;
 //BA.debugLineNum = 67174428;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
_rowsfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_rowsfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)).getObject()));
RDebugUtils.currentLine=67174429;
 //BA.debugLineNum = 67174429;BA.debugLine="FlexGridDialog.Font=RowsFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject())));
RDebugUtils.currentLine=67174430;
 //BA.debugLineNum = 67174430;BA.debugLine="Dim NumColumnasTablaTotales As Int=mDataAj.Size";
_numcolumnastablatotales = _mdataaj.getSize();
RDebugUtils.currentLine=67174431;
 //BA.debugLineNum = 67174431;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
_anchoscolumnas = new int[_numcolumnastablatotales];
;
RDebugUtils.currentLine=67174432;
 //BA.debugLineNum = 67174432;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv1(_numcolumnastablatotales);
RDebugUtils.currentLine=67174433;
 //BA.debugLineNum = 67174433;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=67174435;
 //BA.debugLineNum = 67174435;BA.debugLine="For Each k As String In mDataAj.Keys";
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
RDebugUtils.currentLine=67174437;
 //BA.debugLineNum = 67174437;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvv4(_colindex,_k);
RDebugUtils.currentLine=67174439;
 //BA.debugLineNum = 67174439;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=67174440;
 //BA.debugLineNum = 67174440;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
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
RDebugUtils.currentLine=67174441;
 //BA.debugLineNum = 67174441;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=67174442;
 //BA.debugLineNum = 67174442;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 17:
//C
this.state = 40;
;
RDebugUtils.currentLine=67174445;
 //BA.debugLineNum = 67174445;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=67174448;
 //BA.debugLineNum = 67174448;BA.debugLine="For Each mDatos As Map In lstEstadosAj";

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
RDebugUtils.currentLine=67174449;
 //BA.debugLineNum = 67174449;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
_fila = new String[_numcolumnastablatotales];
java.util.Arrays.fill(_fila,"");
RDebugUtils.currentLine=67174450;
 //BA.debugLineNum = 67174450;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=67174451;
 //BA.debugLineNum = 67174451;BA.debugLine="For Each k As String In mDatos.Keys";
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
RDebugUtils.currentLine=67174452;
 //BA.debugLineNum = 67174452;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
_fila[_colindex] = BA.ObjectToString(_mdatos.Get((Object)(_k)));
RDebugUtils.currentLine=67174453;
 //BA.debugLineNum = 67174453;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=67174454;
 //BA.debugLineNum = 67174454;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
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
RDebugUtils.currentLine=67174455;
 //BA.debugLineNum = 67174455;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=67174456;
 //BA.debugLineNum = 67174456;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 27:
//C
this.state = 44;
;
RDebugUtils.currentLine=67174458;
 //BA.debugLineNum = 67174458;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;

case 28:
//C
this.state = 42;
;
RDebugUtils.currentLine=67174460;
 //BA.debugLineNum = 67174460;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._v7((Object[])(_fila),parent.__c.False);
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=67174464;
 //BA.debugLineNum = 67174464;BA.debugLine="Dim AnchoTotalTabla As Int";
_anchototaltabla = 0;
RDebugUtils.currentLine=67174465;
 //BA.debugLineNum = 67174465;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
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
RDebugUtils.currentLine=67174466;
 //BA.debugLineNum = 67174466;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv5(_colindex,_anchoscolumnas[_colindex]);
RDebugUtils.currentLine=67174467;
 //BA.debugLineNum = 67174467;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
_anchototaltabla = (int) (_anchototaltabla+_anchoscolumnas[_colindex]);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=67174470;
 //BA.debugLineNum = 67174470;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";

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
RDebugUtils.currentLine=67174471;
 //BA.debugLineNum = 67174471;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvvvv5(_rowindex,parent.__c.DipToCurrent((int) (50)));
 if (true) break;
if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=67174473;
 //BA.debugLineNum = 67174473;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
_altototal = (int) (parent.__c.Min(parent.__c.DipToCurrent((int) (50))*(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6())+parent.__c.DipToCurrent((int) (50)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY()))));
RDebugUtils.currentLine=67174474;
 //BA.debugLineNum = 67174474;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setWidth(_anchototaltabla);
RDebugUtils.currentLine=67174475;
 //BA.debugLineNum = 67174475;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setHeight(_altototal);
RDebugUtils.currentLine=67174477;
 //BA.debugLineNum = 67174477;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,_anchototaltabla+parent.__c.DipToCurrent((int) (30)),_altototal+parent.__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=67174479;
 //BA.debugLineNum = 67174479;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "mostrarhistoricoestadosexpedicion"),(int) (100));
this.state = 49;
return;
case 49:
//C
this.state = -1;
;
RDebugUtils.currentLine=67174480;
 //BA.debugLineNum = 67174480;BA.debugLine="FlexGridDialog.Invalidate";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvv1();
RDebugUtils.currentLine=67174482;
 //BA.debugLineNum = 67174482;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=67174484;
 //BA.debugLineNum = 67174484;BA.debugLine="Dialog.Title=\"Histórico Estados Expedición\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Histórico Estados Expedición");
RDebugUtils.currentLine=67174485;
 //BA.debugLineNum = 67174485;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_pbaseflexgrid,(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=67174486;
 //BA.debugLineNum = 67174486;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=67174487;
 //BA.debugLineNum = 67174487;BA.debugLine="bOK.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=67174488;
 //BA.debugLineNum = 67174488;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "mostrarhistoricoestadosexpedicion"), _rsub);
this.state = 50;
return;
case 50:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=67174490;
 //BA.debugLineNum = 67174490;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=67174491;
 //BA.debugLineNum = 67174491;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarincidenciasexpedicion(b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4a.objects.collections.List _lstincidenciasexpedicion) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "mostrarincidenciasexpedicion", false))
	 {Debug.delegate(ba, "mostrarincidenciasexpedicion", new Object[] {_lstincidenciasexpedicion}); return;}
ResumableSub_MostrarIncidenciasExpedicion rsub = new ResumableSub_MostrarIncidenciasExpedicion(this,__ref,_lstincidenciasexpedicion);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarIncidenciasExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarIncidenciasExpedicion(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4a.objects.collections.List _lstincidenciasexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstincidenciasexpedicion = _lstincidenciasexpedicion;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
anywheresoftware.b4a.objects.collections.List _lstincidenciasexpedicion;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _dateformatant = "";
anywheresoftware.b4a.objects.collections.List _lstincidenciasaj = null;
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
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;
anywheresoftware.b4a.BA.IterableList group28;
int index28;
int groupLen28;
anywheresoftware.b4a.BA.IterableList group37;
int index37;
int groupLen37;
anywheresoftware.b4a.BA.IterableList group40;
int index40;
int groupLen40;
int step52;
int limit52;
int step56;
int limit56;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67239937;
 //BA.debugLineNum = 67239937;BA.debugLine="For Each mData As Map In lstIncidenciasExpedicion";
if (true) break;

case 1:
//for
this.state = 4;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group1 = _lstincidenciasexpedicion;
index1 = 0;
groupLen1 = group1.getSize();
this.state = 40;
if (true) break;

case 40:
//C
this.state = 4;
if (index1 < groupLen1) {
this.state = 3;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group1.Get(index1)));}
if (true) break;

case 41:
//C
this.state = 40;
index1++;
if (true) break;

case 3:
//C
this.state = 41;
RDebugUtils.currentLine=67239938;
 //BA.debugLineNum = 67239938;BA.debugLine="Log(mData)";
parent.__c.LogImpl("867239938",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=67239940;
 //BA.debugLineNum = 67239940;BA.debugLine="If lstIncidenciasExpedicion.Size=0 Then Return";

case 4:
//if
this.state = 9;
if (_lstincidenciasexpedicion.getSize()==0) { 
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
RDebugUtils.currentLine=67239942;
 //BA.debugLineNum = 67239942;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=67239943;
 //BA.debugLineNum = 67239943;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
RDebugUtils.currentLine=67239945;
 //BA.debugLineNum = 67239945;BA.debugLine="Dim lstIncidenciasAj As List";
_lstincidenciasaj = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67239946;
 //BA.debugLineNum = 67239946;BA.debugLine="lstIncidenciasAj.Initialize";
_lstincidenciasaj.Initialize();
RDebugUtils.currentLine=67239947;
 //BA.debugLineNum = 67239947;BA.debugLine="For Each mData As Map In lstIncidenciasExpedicion";
if (true) break;

case 10:
//for
this.state = 13;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group9 = _lstincidenciasexpedicion;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 42;
if (true) break;

case 42:
//C
this.state = 13;
if (index9 < groupLen9) {
this.state = 12;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));}
if (true) break;

case 43:
//C
this.state = 42;
index9++;
if (true) break;

case 12:
//C
this.state = 43;
RDebugUtils.currentLine=67239951;
 //BA.debugLineNum = 67239951;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ssXXX\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
RDebugUtils.currentLine=67239952;
 //BA.debugLineNum = 67239952;BA.debugLine="Dim TicksFecha As Long=DateTime.DateParse(mData.";
_ticksfecha = parent.__c.DateTime.DateParse(BA.ObjectToString(_mdata.Get((Object)("FECHA"))));
RDebugUtils.currentLine=67239953;
 //BA.debugLineNum = 67239953;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=67239954;
 //BA.debugLineNum = 67239954;BA.debugLine="Dim mDataAj As Map=CreateMap(\"CodigoIncidencia\":";
_mdataaj = new anywheresoftware.b4a.objects.collections.Map();
_mdataaj = parent.__c.createMap(new Object[] {(Object)("CodigoIncidencia"),_mdata.Get((Object)("CODINCIDENCIA")),(Object)("Descripcion"),_mdata.Get((Object)("DESCRIPCION")),(Object)("Fecha"),(Object)(parent.__c.DateTime.Date(_ticksfecha)+" "+parent.__c.DateTime.Time(_ticksfecha))});
RDebugUtils.currentLine=67239955;
 //BA.debugLineNum = 67239955;BA.debugLine="lstIncidenciasAj.Add(mDataAj)";
_lstincidenciasaj.Add((Object)(_mdataaj.getObject()));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=67239957;
 //BA.debugLineNum = 67239957;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=67239959;
 //BA.debugLineNum = 67239959;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
_pbaseflexgrid = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbaseflexgrid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=67239960;
 //BA.debugLineNum = 67239960;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (500)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY())));
RDebugUtils.currentLine=67239962;
 //BA.debugLineNum = 67239962;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
_pbaseflexgrid.LoadLayout("scrDialogFlexGrid",ba);
RDebugUtils.currentLine=67239964;
 //BA.debugLineNum = 67239964;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
_headersfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_headersfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15)).getObject()));
RDebugUtils.currentLine=67239965;
 //BA.debugLineNum = 67239965;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv7((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject())));
RDebugUtils.currentLine=67239967;
 //BA.debugLineNum = 67239967;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
_rowsfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_rowsfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)).getObject()));
RDebugUtils.currentLine=67239968;
 //BA.debugLineNum = 67239968;BA.debugLine="FlexGridDialog.Font=RowsFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject())));
RDebugUtils.currentLine=67239969;
 //BA.debugLineNum = 67239969;BA.debugLine="Dim NumColumnasTablaTotales As Int=mDataAj.Size";
_numcolumnastablatotales = _mdataaj.getSize();
RDebugUtils.currentLine=67239970;
 //BA.debugLineNum = 67239970;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
_anchoscolumnas = new int[_numcolumnastablatotales];
;
RDebugUtils.currentLine=67239971;
 //BA.debugLineNum = 67239971;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv1(_numcolumnastablatotales);
RDebugUtils.currentLine=67239972;
 //BA.debugLineNum = 67239972;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=67239974;
 //BA.debugLineNum = 67239974;BA.debugLine="For Each k As String In mDataAj.Keys";
if (true) break;

case 14:
//for
this.state = 21;
group28 = _mdataaj.Keys();
index28 = 0;
groupLen28 = group28.getSize();
this.state = 44;
if (true) break;

case 44:
//C
this.state = 21;
if (index28 < groupLen28) {
this.state = 16;
_k = BA.ObjectToString(group28.Get(index28));}
if (true) break;

case 45:
//C
this.state = 44;
index28++;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=67239976;
 //BA.debugLineNum = 67239976;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvv4(_colindex,_k);
RDebugUtils.currentLine=67239978;
 //BA.debugLineNum = 67239978;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=67239979;
 //BA.debugLineNum = 67239979;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
if (true) break;

case 17:
//if
this.state = 20;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=67239980;
 //BA.debugLineNum = 67239980;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=67239981;
 //BA.debugLineNum = 67239981;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 20:
//C
this.state = 45;
;
RDebugUtils.currentLine=67239984;
 //BA.debugLineNum = 67239984;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=67239987;
 //BA.debugLineNum = 67239987;BA.debugLine="For Each mDatos As Map In lstIncidenciasAj";

case 21:
//for
this.state = 32;
_mdatos = new anywheresoftware.b4a.objects.collections.Map();
group37 = _lstincidenciasaj;
index37 = 0;
groupLen37 = group37.getSize();
this.state = 46;
if (true) break;

case 46:
//C
this.state = 32;
if (index37 < groupLen37) {
this.state = 23;
_mdatos = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group37.Get(index37)));}
if (true) break;

case 47:
//C
this.state = 46;
index37++;
if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=67239988;
 //BA.debugLineNum = 67239988;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
_fila = new String[_numcolumnastablatotales];
java.util.Arrays.fill(_fila,"");
RDebugUtils.currentLine=67239989;
 //BA.debugLineNum = 67239989;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=67239990;
 //BA.debugLineNum = 67239990;BA.debugLine="For Each k As String In mDatos.Keys";
if (true) break;

case 24:
//for
this.state = 31;
group40 = _mdatos.Keys();
index40 = 0;
groupLen40 = group40.getSize();
this.state = 48;
if (true) break;

case 48:
//C
this.state = 31;
if (index40 < groupLen40) {
this.state = 26;
_k = BA.ObjectToString(group40.Get(index40));}
if (true) break;

case 49:
//C
this.state = 48;
index40++;
if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=67239991;
 //BA.debugLineNum = 67239991;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
_fila[_colindex] = BA.ObjectToString(_mdatos.Get((Object)(_k)));
RDebugUtils.currentLine=67239992;
 //BA.debugLineNum = 67239992;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=67239993;
 //BA.debugLineNum = 67239993;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
if (true) break;

case 27:
//if
this.state = 30;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=67239994;
 //BA.debugLineNum = 67239994;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=67239995;
 //BA.debugLineNum = 67239995;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 30:
//C
this.state = 49;
;
RDebugUtils.currentLine=67239997;
 //BA.debugLineNum = 67239997;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;

case 31:
//C
this.state = 47;
;
RDebugUtils.currentLine=67239999;
 //BA.debugLineNum = 67239999;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._v7((Object[])(_fila),parent.__c.False);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=67240003;
 //BA.debugLineNum = 67240003;BA.debugLine="Dim AnchoTotalTabla As Int";
_anchototaltabla = 0;
RDebugUtils.currentLine=67240004;
 //BA.debugLineNum = 67240004;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
if (true) break;

case 33:
//for
this.state = 36;
step52 = 1;
limit52 = (int) (_numcolumnastablatotales-1);
_colindex = (int) (0) ;
this.state = 50;
if (true) break;

case 50:
//C
this.state = 36;
if ((step52 > 0 && _colindex <= limit52) || (step52 < 0 && _colindex >= limit52)) this.state = 35;
if (true) break;

case 51:
//C
this.state = 50;
_colindex = ((int)(0 + _colindex + step52)) ;
if (true) break;

case 35:
//C
this.state = 51;
RDebugUtils.currentLine=67240005;
 //BA.debugLineNum = 67240005;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv5(_colindex,_anchoscolumnas[_colindex]);
RDebugUtils.currentLine=67240006;
 //BA.debugLineNum = 67240006;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
_anchototaltabla = (int) (_anchototaltabla+_anchoscolumnas[_colindex]);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=67240009;
 //BA.debugLineNum = 67240009;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";

case 36:
//for
this.state = 39;
step56 = 1;
limit56 = (int) (__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6()-1);
_rowindex = (int) (0) ;
this.state = 52;
if (true) break;

case 52:
//C
this.state = 39;
if ((step56 > 0 && _rowindex <= limit56) || (step56 < 0 && _rowindex >= limit56)) this.state = 38;
if (true) break;

case 53:
//C
this.state = 52;
_rowindex = ((int)(0 + _rowindex + step56)) ;
if (true) break;

case 38:
//C
this.state = 53;
RDebugUtils.currentLine=67240010;
 //BA.debugLineNum = 67240010;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvvvv5(_rowindex,parent.__c.DipToCurrent((int) (50)));
 if (true) break;
if (true) break;

case 39:
//C
this.state = -1;
;
RDebugUtils.currentLine=67240012;
 //BA.debugLineNum = 67240012;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
_altototal = (int) (parent.__c.Min(parent.__c.DipToCurrent((int) (50))*(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6())+parent.__c.DipToCurrent((int) (50)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY()))));
RDebugUtils.currentLine=67240013;
 //BA.debugLineNum = 67240013;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setWidth(_anchototaltabla);
RDebugUtils.currentLine=67240014;
 //BA.debugLineNum = 67240014;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setHeight(_altototal);
RDebugUtils.currentLine=67240016;
 //BA.debugLineNum = 67240016;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,_anchototaltabla+parent.__c.DipToCurrent((int) (30)),_altototal+parent.__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=67240018;
 //BA.debugLineNum = 67240018;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "mostrarincidenciasexpedicion"),(int) (100));
this.state = 54;
return;
case 54:
//C
this.state = -1;
;
RDebugUtils.currentLine=67240019;
 //BA.debugLineNum = 67240019;BA.debugLine="FlexGridDialog.Invalidate";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvv1();
RDebugUtils.currentLine=67240021;
 //BA.debugLineNum = 67240021;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=67240022;
 //BA.debugLineNum = 67240022;BA.debugLine="Dialog.Title=\"Histórico Incidencias Expedición\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Histórico Incidencias Expedición");
RDebugUtils.currentLine=67240023;
 //BA.debugLineNum = 67240023;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_pbaseflexgrid,(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=67240024;
 //BA.debugLineNum = 67240024;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=67240025;
 //BA.debugLineNum = 67240025;BA.debugLine="bOK.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=67240026;
 //BA.debugLineNum = 67240026;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "mostrarincidenciasexpedicion"), _rsub);
this.state = 55;
return;
case 55:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=67240027;
 //BA.debugLineNum = 67240027;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=67240029;
 //BA.debugLineNum = 67240029;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _datosexpedicioninternaexpediciontransporte(b4j.docU.cexpedicionessinentregartxt __ref,int _idtransporte,String _numexp) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "datosexpedicioninternaexpediciontransporte", false))
	 {Debug.delegate(ba, "datosexpedicioninternaexpediciontransporte", new Object[] {_idtransporte,_numexp}); return;}
ResumableSub_DatosExpedicionInternaExpedicionTransporte rsub = new ResumableSub_DatosExpedicionInternaExpedicionTransporte(this,__ref,_idtransporte,_numexp);
rsub.resume(ba, null);
}
public static class ResumableSub_DatosExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_DatosExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref,int _idtransporte,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67305473;
 //BA.debugLineNum = 67305473;BA.debugLine="Wait For(ExpedicionInternaExpedicionTransporte(ID";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "datosexpedicioninternaexpediciontransporte"), __ref._expedicioninternaexpediciontransporte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idtransporte,_numexp));
this.state = 39;
return;
case 39:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67305474;
 //BA.debugLineNum = 67305474;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=67305475;
 //BA.debugLineNum = 67305475;BA.debugLine="If Accion<>\"OK\" Then Return";
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
RDebugUtils.currentLine=67305476;
 //BA.debugLineNum = 67305476;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=67305479;
 //BA.debugLineNum = 67305479;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=67305480;
 //BA.debugLineNum = 67305480;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=67305482;
 //BA.debugLineNum = 67305482;BA.debugLine="For Each mData As Map In lstReg";
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
RDebugUtils.currentLine=67305483;
 //BA.debugLineNum = 67305483;BA.debugLine="Dim DocExp As String=mData.Get(\"Documento\")";
_docexp = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=67305484;
 //BA.debugLineNum = 67305484;BA.debugLine="If DocExp<>\"\" Then";
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
RDebugUtils.currentLine=67305485;
 //BA.debugLineNum = 67305485;BA.debugLine="lstOpciones.Add(mData.Get(\"Documento\"))";
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
RDebugUtils.currentLine=67305490;
 //BA.debugLineNum = 67305490;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=67305492;
 //BA.debugLineNum = 67305492;BA.debugLine="Dialog.Title=\"Selecciona Documento NAV\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Documento NAV");
RDebugUtils.currentLine=67305493;
 //BA.debugLineNum = 67305493;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=67305494;
 //BA.debugLineNum = 67305494;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=67305495;
 //BA.debugLineNum = 67305495;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=67305496;
 //BA.debugLineNum = 67305496;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=67305497;
 //BA.debugLineNum = 67305497;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=67305499;
 //BA.debugLineNum = 67305499;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
parent._utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=67305500;
 //BA.debugLineNum = 67305500;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
parent._utilidades._setlightthemelist /*String*/ (_b4xlistdlg);
RDebugUtils.currentLine=67305503;
 //BA.debugLineNum = 67305503;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=67305504;
 //BA.debugLineNum = 67305504;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=67305505;
 //BA.debugLineNum = 67305505;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=67305507;
 //BA.debugLineNum = 67305507;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=67305508;
 //BA.debugLineNum = 67305508;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=67305512;
 //BA.debugLineNum = 67305512;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=67305516;
 //BA.debugLineNum = 67305516;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=67305518;
 //BA.debugLineNum = 67305518;BA.debugLine="For i=0 To lstOpciones.size-1";
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
RDebugUtils.currentLine=67305519;
 //BA.debugLineNum = 67305519;BA.debugLine="xclv.ResizeItem(i,60dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (60)));
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=67305523;
 //BA.debugLineNum = 67305523;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=67305524;
 //BA.debugLineNum = 67305524;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=67305526;
 //BA.debugLineNum = 67305526;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=67305527;
 //BA.debugLineNum = 67305527;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=67305528;
 //BA.debugLineNum = 67305528;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=67305531;
 //BA.debugLineNum = 67305531;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "datosexpedicioninternaexpediciontransporte"), _rsub);
this.state = 44;
return;
case 44:
//C
this.state = 23;
_rint = (int) result[1];
;
RDebugUtils.currentLine=67305533;
 //BA.debugLineNum = 67305533;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=67305534;
 //BA.debugLineNum = 67305534;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=67305536;
 //BA.debugLineNum = 67305536;BA.debugLine="Dim DocSel As String=B4XListDlg.SelectedItem";
_docsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=67305537;
 //BA.debugLineNum = 67305537;BA.debugLine="Select True";
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
RDebugUtils.currentLine=67305539;
 //BA.debugLineNum = 67305539;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico Albaranes Venta",(int) (130),"No.",_docsel);
 if (true) break;

case 33:
//C
this.state = 38;
RDebugUtils.currentLine=67305541;
 //BA.debugLineNum = 67305541;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico recep. transferencia",(int) (5745),"No.",_docsel);
 if (true) break;

case 35:
//C
this.state = 38;
RDebugUtils.currentLine=67305543;
 //BA.debugLineNum = 67305543;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico envío devolución",(int) (6650),"No.",_docsel);
 if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=67305545;
 //BA.debugLineNum = 67305545;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No es posible abrir la ficha de navision del documento "+_docsel,"Aviso");
RDebugUtils.currentLine=67305546;
 //BA.debugLineNum = 67305546;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "datosexpedicioninternaexpediciontransporte"), _msa);
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
RDebugUtils.currentLine=67305548;
 //BA.debugLineNum = 67305548;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnactualizar_click(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "btnactualizar_click", false))
	 {return ((String) Debug.delegate(ba, "btnactualizar_click", null));}
RDebugUtils.currentLine=66846720;
 //BA.debugLineNum = 66846720;BA.debugLine="Private Sub btnActualizar_Click";
RDebugUtils.currentLine=66846721;
 //BA.debugLineNum = 66846721;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=66846722;
 //BA.debugLineNum = 66846722;BA.debugLine="End Sub";
return "";
}
public String  _btnejemplo_click(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "btnejemplo_click", false))
	 {return ((String) Debug.delegate(ba, "btnejemplo_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
RDebugUtils.currentLine=66912256;
 //BA.debugLineNum = 66912256;BA.debugLine="Private Sub btnEjemplo_Click";
RDebugUtils.currentLine=66912257;
 //BA.debugLineNum = 66912257;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=66912258;
 //BA.debugLineNum = 66912258;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=66912259;
 //BA.debugLineNum = 66912259;BA.debugLine="Log(mData)";
__c.LogImpl("866912259",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=66912260;
 //BA.debugLineNum = 66912260;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=66912261;
 //BA.debugLineNum = 66912261;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=66322432;
 //BA.debugLineNum = 66322432;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=66322433;
 //BA.debugLineNum = 66322433;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=66322434;
 //BA.debugLineNum = 66322434;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
RDebugUtils.currentLine=65929216;
 //BA.debugLineNum = 65929216;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=65929217;
 //BA.debugLineNum = 65929217;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=65929218;
 //BA.debugLineNum = 65929218;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=65929219;
 //BA.debugLineNum = 65929219;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=65929221;
 //BA.debugLineNum = 65929221;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=65929223;
 //BA.debugLineNum = 65929223;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=65929228;
 //BA.debugLineNum = 65929228;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
_jamtableclv1 = new b4j.docU.jamtableclv();
RDebugUtils.currentLine=65929229;
 //BA.debugLineNum = 65929229;BA.debugLine="Private txtANO As TextField";
_txtano = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929230;
 //BA.debugLineNum = 65929230;BA.debugLine="Private txtBULTOS As TextField";
_txtbultos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929231;
 //BA.debugLineNum = 65929231;BA.debugLine="Private txtCODDESTIN As TextField";
_txtcoddestin = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929232;
 //BA.debugLineNum = 65929232;BA.debugLine="Private txtCODEMPRESA As TextField";
_txtcodempresa = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929233;
 //BA.debugLineNum = 65929233;BA.debugLine="Private txtCODORIGEN As TextField";
_txtcodorigen = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929234;
 //BA.debugLineNum = 65929234;BA.debugLine="Private txtCPOSTALDESTINATARIO As TextField";
_txtcpostaldestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929235;
 //BA.debugLineNum = 65929235;BA.debugLine="Private txtDIRECCIONDESTINATARIO As TextField";
_txtdirecciondestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929236;
 //BA.debugLineNum = 65929236;BA.debugLine="Private txtDOCADJUNTA As TextField";
_txtdocadjunta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929237;
 //BA.debugLineNum = 65929237;BA.debugLine="Private txtFECHAALTA As TextField";
_txtfechaalta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929238;
 //BA.debugLineNum = 65929238;BA.debugLine="Private txtKILOS As TextField";
_txtkilos = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929239;
 //BA.debugLineNum = 65929239;BA.debugLine="Private txtNEXPED1 As TextField";
_txtnexped1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929240;
 //BA.debugLineNum = 65929240;BA.debugLine="Private txtNEXPED2 As TextField";
_txtnexped2 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929241;
 //BA.debugLineNum = 65929241;BA.debugLine="Private txtNOMBREDESTINATARIO As TextField";
_txtnombredestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929242;
 //BA.debugLineNum = 65929242;BA.debugLine="Private txtOBSERVACIONES As TextField";
_txtobservaciones = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929243;
 //BA.debugLineNum = 65929243;BA.debugLine="Private txtPOBLACIONDESTINATARIO As TextField";
_txtpoblaciondestinatario = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929244;
 //BA.debugLineNum = 65929244;BA.debugLine="Private txtPORTEE As TextField";
_txtportee = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929245;
 //BA.debugLineNum = 65929245;BA.debugLine="Private txtREFERENCIA1 As TextField";
_txtreferencia1 = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929246;
 //BA.debugLineNum = 65929246;BA.debugLine="Private txtDestino As TextField";
_txtdestino = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929247;
 //BA.debugLineNum = 65929247;BA.debugLine="Private txtEstadoActual As TextField";
_txtestadoactual = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929249;
 //BA.debugLineNum = 65929249;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
_measurementcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=65929251;
 //BA.debugLineNum = 65929251;BA.debugLine="Private FlexGridDialog As FlexGrid";
_flexgriddialog = new b4j.example.flexgrid();
RDebugUtils.currentLine=65929252;
 //BA.debugLineNum = 65929252;BA.debugLine="Private jamCircularProgressBar1 As jamCircularPro";
_jamcircularprogressbar1 = new b4j.docU.jamcircularprogressbar();
RDebugUtils.currentLine=65929253;
 //BA.debugLineNum = 65929253;BA.debugLine="Private txtNombreCliente As TextField";
_txtnombrecliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929254;
 //BA.debugLineNum = 65929254;BA.debugLine="Private txtNombreResponsableCuenta As TextField";
_txtnombreresponsablecuenta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=65929257;
 //BA.debugLineNum = 65929257;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=66519040;
 //BA.debugLineNum = 66519040;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=66519041;
 //BA.debugLineNum = 66519041;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblExpedicionesSinEntregar"}))));
RDebugUtils.currentLine=66519042;
 //BA.debugLineNum = 66519042;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=66519043;
 //BA.debugLineNum = 66519043;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblExpedicionesSin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblExpedicionesSinEntregar");
 };
RDebugUtils.currentLine=66519045;
 //BA.debugLineNum = 66519045;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=66519046;
 //BA.debugLineNum = 66519046;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=66519047;
 //BA.debugLineNum = 66519047;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblExpedicionesSinEntregar (");
RDebugUtils.currentLine=66519049;
 //BA.debugLineNum = 66519049;BA.debugLine="sbCrearTabla.Append(\"CODEMPRESA TEXT COLLATE NOCA";
_sbcreartabla.Append("CODEMPRESA TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=66519050;
 //BA.debugLineNum = 66519050;BA.debugLine="sbCrearTabla.Append(\"CODORIGEN TEXT COLLATE NOCAS";
_sbcreartabla.Append("CODORIGEN TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=66519051;
 //BA.debugLineNum = 66519051;BA.debugLine="sbCrearTabla.Append(\"CODDESTIN TEXT COLLATE NOCAS";
_sbcreartabla.Append("CODDESTIN TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=66519052;
 //BA.debugLineNum = 66519052;BA.debugLine="sbCrearTabla.Append(\"NEXPED1 INTEGER,\")";
_sbcreartabla.Append("NEXPED1 INTEGER,");
RDebugUtils.currentLine=66519053;
 //BA.debugLineNum = 66519053;BA.debugLine="sbCrearTabla.Append(\"NEXPED2 INTEGER,\")";
_sbcreartabla.Append("NEXPED2 INTEGER,");
RDebugUtils.currentLine=66519054;
 //BA.debugLineNum = 66519054;BA.debugLine="sbCrearTabla.Append(\"ANO TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("ANO TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=66519055;
 //BA.debugLineNum = 66519055;BA.debugLine="sbCrearTabla.Append(\"FECHA_x0020_SALIDA TEXT COLL";
_sbcreartabla.Append("FECHA_x0020_SALIDA TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=66519056;
 //BA.debugLineNum = 66519056;BA.debugLine="sbCrearTabla.Append(\"FechaSalida INTEGER DEFAULT";
_sbcreartabla.Append("FechaSalida INTEGER DEFAULT 0,");
RDebugUtils.currentLine=66519057;
 //BA.debugLineNum = 66519057;BA.debugLine="sbCrearTabla.Append(\"DESTINO TEXT,\")";
_sbcreartabla.Append("DESTINO TEXT,");
RDebugUtils.currentLine=66519058;
 //BA.debugLineNum = 66519058;BA.debugLine="sbCrearTabla.Append(\"DESTINATARIO TEXT,\")";
_sbcreartabla.Append("DESTINATARIO TEXT,");
RDebugUtils.currentLine=66519059;
 //BA.debugLineNum = 66519059;BA.debugLine="sbCrearTabla.Append(\"DIRECCION TEXT,\")";
_sbcreartabla.Append("DIRECCION TEXT,");
RDebugUtils.currentLine=66519060;
 //BA.debugLineNum = 66519060;BA.debugLine="sbCrearTabla.Append(\"CP TEXT,\")";
_sbcreartabla.Append("CP TEXT,");
RDebugUtils.currentLine=66519061;
 //BA.debugLineNum = 66519061;BA.debugLine="sbCrearTabla.Append(\"POBLACION TEXT,\")";
_sbcreartabla.Append("POBLACION TEXT,");
RDebugUtils.currentLine=66519062;
 //BA.debugLineNum = 66519062;BA.debugLine="sbCrearTabla.Append(\"REFERENCIA1 TEXT COLLATE NOC";
_sbcreartabla.Append("REFERENCIA1 TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=66519063;
 //BA.debugLineNum = 66519063;BA.debugLine="sbCrearTabla.Append(\"REFERENCIA2 TEXT COLLATE NOC";
_sbcreartabla.Append("REFERENCIA2 TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=66519064;
 //BA.debugLineNum = 66519064;BA.debugLine="sbCrearTabla.Append(\"BULTOS INTEGER,\")";
_sbcreartabla.Append("BULTOS INTEGER,");
RDebugUtils.currentLine=66519065;
 //BA.debugLineNum = 66519065;BA.debugLine="sbCrearTabla.Append(\"KILOS INTEGER,\")";
_sbcreartabla.Append("KILOS INTEGER,");
RDebugUtils.currentLine=66519066;
 //BA.debugLineNum = 66519066;BA.debugLine="sbCrearTabla.Append(\"ESTADO TEXT COLLATE NOCASE D";
_sbcreartabla.Append("ESTADO TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=66519067;
 //BA.debugLineNum = 66519067;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=66519068;
 //BA.debugLineNum = 66519068;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE DEFAULT '')");
RDebugUtils.currentLine=66519069;
 //BA.debugLineNum = 66519069;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=66519072;
 //BA.debugLineNum = 66519072;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _creartablatemporaldocumentosnavexpedicionespendientestxt(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "creartablatemporaldocumentosnavexpedicionespendientestxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "creartablatemporaldocumentosnavexpedicionespendientestxt", null));}
ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT rsub = new ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosNAVExpedicionesPendientesTXT(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67698689;
 //BA.debugLineNum = 67698689;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=67698692;
 //BA.debugLineNum = 67698692;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67698693;
 //BA.debugLineNum = 67698693;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=67698696;
 //BA.debugLineNum = 67698696;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,\"CrearTablaTe";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,"CrearTablaTemporalDocumentosExpedicionesPendientes",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=67698698;
 //BA.debugLineNum = 67698698;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67698699;
 //BA.debugLineNum = 67698699;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=67698700;
 //BA.debugLineNum = 67698700;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query CrearTablaTemporalDocumentosExpedicionesPendientes","Error");
RDebugUtils.currentLine=67698701;
 //BA.debugLineNum = 67698701;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=67698702;
 //BA.debugLineNum = 67698702;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=67698703;
 //BA.debugLineNum = 67698703;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=67698706;
 //BA.debugLineNum = 67698706;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=67698709;
 //BA.debugLineNum = 67698709;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=67698710;
 //BA.debugLineNum = 67698710;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=67698711;
 //BA.debugLineNum = 67698711;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=67698712;
 //BA.debugLineNum = 67698712;BA.debugLine="If sResp.ToUpperCase=\"OK\" Then";
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
RDebugUtils.currentLine=67698713;
 //BA.debugLineNum = 67698713;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=67698714;
 //BA.debugLineNum = 67698714;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=67698716;
 //BA.debugLineNum = 67698716;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP CrearTablaTemporalDocumentosExpedicionesPendientes "+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=67698717;
 //BA.debugLineNum = 67698717;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosnavexpedicionespendientestxt"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=67698718;
 //BA.debugLineNum = 67698718;BA.debugLine="Accion=\"ERROR SP\"";
_accion = "ERROR SP";
RDebugUtils.currentLine=67698719;
 //BA.debugLineNum = 67698719;BA.debugLine="mRes.Put(\"Accion\", Accion)";
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
RDebugUtils.currentLine=67698723;
 //BA.debugLineNum = 67698723;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=67698724;
 //BA.debugLineNum = 67698724;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _creartablatemporaldocumentosreferenciastte(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "creartablatemporaldocumentosreferenciastte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "creartablatemporaldocumentosreferenciastte", null));}
ResumableSub_CrearTablaTemporalDocumentosReferenciasTte rsub = new ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CrearTablaTemporalDocumentosReferenciasTte extends BA.ResumableSub {
public ResumableSub_CrearTablaTemporalDocumentosReferenciasTte(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67502081;
 //BA.debugLineNum = 67502081;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=67502084;
 //BA.debugLineNum = 67502084;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67502085;
 //BA.debugLineNum = 67502085;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=67502088;
 //BA.debugLineNum = 67502088;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"CrearTablaTemporalDocumentosReferenciasTte",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=67502090;
 //BA.debugLineNum = 67502090;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosreferenciastte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67502091;
 //BA.debugLineNum = 67502091;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=67502092;
 //BA.debugLineNum = 67502092;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query CrearTablaTemporalDocumentosReferenciasTte","Error");
RDebugUtils.currentLine=67502093;
 //BA.debugLineNum = 67502093;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=67502094;
 //BA.debugLineNum = 67502094;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=67502095;
 //BA.debugLineNum = 67502095;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=67502098;
 //BA.debugLineNum = 67502098;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=67502101;
 //BA.debugLineNum = 67502101;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=67502102;
 //BA.debugLineNum = 67502102;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=67502103;
 //BA.debugLineNum = 67502103;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=67502104;
 //BA.debugLineNum = 67502104;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
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
RDebugUtils.currentLine=67502105;
 //BA.debugLineNum = 67502105;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Cr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP CrearTablaTemporalDocumentosReferenciasTte"+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=67502106;
 //BA.debugLineNum = 67502106;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "creartablatemporaldocumentosreferenciastte"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=67502107;
 //BA.debugLineNum = 67502107;BA.debugLine="Accion=\"ERROR SP\"";
_accion = "ERROR SP";
RDebugUtils.currentLine=67502108;
 //BA.debugLineNum = 67502108;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=67502110;
 //BA.debugLineNum = 67502110;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=67502111;
 //BA.debugLineNum = 67502111;BA.debugLine="mRes.Put(\"Accion\", Accion)";
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
RDebugUtils.currentLine=67502115;
 //BA.debugLineNum = 67502115;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=67502116;
 //BA.debugLineNum = 67502116;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _expedicioninternaexpediciontransporte(b4j.docU.cexpedicionessinentregartxt __ref,int _idtransporte,String _numexp) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "expedicioninternaexpediciontransporte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "expedicioninternaexpediciontransporte", new Object[] {_idtransporte,_numexp}));}
ResumableSub_ExpedicionInternaExpedicionTransporte rsub = new ResumableSub_ExpedicionInternaExpedicionTransporte(this,__ref,_idtransporte,_numexp);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_ExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref,int _idtransporte,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
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
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67371010;
 //BA.debugLineNum = 67371010;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=67371011;
 //BA.debugLineNum = 67371011;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67371012;
 //BA.debugLineNum = 67371012;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=67371013;
 //BA.debugLineNum = 67371013;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=67371014;
 //BA.debugLineNum = 67371014;BA.debugLine="Dim Comando As String=\"DatosExpedicionInternaExpe";
_comando = "DatosExpedicionInternaExpedicionTransporte";
RDebugUtils.currentLine=67371017;
 //BA.debugLineNum = 67371017;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTra";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_idtransporte),(Object)(_numexp)},parent);
RDebugUtils.currentLine=67371019;
 //BA.debugLineNum = 67371019;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67371020;
 //BA.debugLineNum = 67371020;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=67371021;
 //BA.debugLineNum = 67371021;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=67371022;
 //BA.debugLineNum = 67371022;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=67371023;
 //BA.debugLineNum = 67371023;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=67371024;
 //BA.debugLineNum = 67371024;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=67371027;
 //BA.debugLineNum = 67371027;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=67371028;
 //BA.debugLineNum = 67371028;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=67371029;
 //BA.debugLineNum = 67371029;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=67371030;
 //BA.debugLineNum = 67371030;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso");
RDebugUtils.currentLine=67371031;
 //BA.debugLineNum = 67371031;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), _msa);
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
RDebugUtils.currentLine=67371034;
 //BA.debugLineNum = 67371034;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=67371035;
 //BA.debugLineNum = 67371035;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
_mrespuesta = new anywheresoftware.b4a.objects.collections.Map();
_mrespuesta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=67371036;
 //BA.debugLineNum = 67371036;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
_sresp = BA.ObjectToString(_mrespuesta.GetValueAt((int) (0)));
RDebugUtils.currentLine=67371037;
 //BA.debugLineNum = 67371037;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
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
RDebugUtils.currentLine=67371038;
 //BA.debugLineNum = 67371038;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error recuperando datos del SP "+_comando+"."+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Aviso");
RDebugUtils.currentLine=67371039;
 //BA.debugLineNum = 67371039;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "expedicioninternaexpediciontransporte"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=67371040;
 //BA.debugLineNum = 67371040;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=67371041;
 //BA.debugLineNum = 67371041;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=67371043;
 //BA.debugLineNum = 67371043;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=67371044;
 //BA.debugLineNum = 67371044;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=67371045;
 //BA.debugLineNum = 67371045;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=67371049;
 //BA.debugLineNum = 67371049;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=67371050;
 //BA.debugLineNum = 67371050;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpedicionespendientes(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "documentosexpedicionespendientes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpedicionespendientes", null));}
ResumableSub_DocumentosExpedicionesPendientes rsub = new ResumableSub_DocumentosExpedicionesPendientes(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicionesPendientes extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionesPendientes(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67567617;
 //BA.debugLineNum = 67567617;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=67567620;
 //BA.debugLineNum = 67567620;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=67567621;
 //BA.debugLineNum = 67567621;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=67567624;
 //BA.debugLineNum = 67567624;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"DocumentosReferenciasExpedicionesTte",(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=67567626;
 //BA.debugLineNum = 67567626;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "documentosexpedicionespendientes"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=67567627;
 //BA.debugLineNum = 67567627;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=67567628;
 //BA.debugLineNum = 67567628;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query DocumentosReferenciasExpedicionesTte","Error");
RDebugUtils.currentLine=67567629;
 //BA.debugLineNum = 67567629;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "documentosexpedicionespendientes"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=67567630;
 //BA.debugLineNum = 67567630;BA.debugLine="Accion=\"ErrConn\"";
_accion = "ErrConn";
RDebugUtils.currentLine=67567631;
 //BA.debugLineNum = 67567631;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=67567634;
 //BA.debugLineNum = 67567634;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=67567635;
 //BA.debugLineNum = 67567635;BA.debugLine="Accion=\"SinDocumentos\"";
_accion = "SinDocumentos";
RDebugUtils.currentLine=67567636;
 //BA.debugLineNum = 67567636;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=67567638;
 //BA.debugLineNum = 67567638;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=67567639;
 //BA.debugLineNum = 67567639;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=67567640;
 //BA.debugLineNum = 67567640;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=67567641;
 //BA.debugLineNum = 67567641;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=67567644;
 //BA.debugLineNum = 67567644;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=67567645;
 //BA.debugLineNum = 67567645;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=66191361;
 //BA.debugLineNum = 66191361;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="End Sub";
return "";
}
public String  _generaruuidv4(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "generaruuidv4", false))
	 {return ((String) Debug.delegate(ba, "generaruuidv4", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
int _c = 0;
RDebugUtils.currentLine=66584576;
 //BA.debugLineNum = 66584576;BA.debugLine="Sub GenerarUUIDv4 As String";
RDebugUtils.currentLine=66584577;
 //BA.debugLineNum = 66584577;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=66584578;
 //BA.debugLineNum = 66584578;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=66584579;
 //BA.debugLineNum = 66584579;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
RDebugUtils.currentLine=66584580;
 //BA.debugLineNum = 66584580;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=66584581;
 //BA.debugLineNum = 66584581;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=66584582;
 //BA.debugLineNum = 66584582;BA.debugLine="Dim c As Int = Rnd(0, 16)";
_c = __c.Rnd((int) (0),(int) (16));
RDebugUtils.currentLine=66584583;
 //BA.debugLineNum = 66584583;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
if (_c<10) { 
_c = (int) (_c+48);}
else {
_c = (int) (_c+55);};
RDebugUtils.currentLine=66584584;
 //BA.debugLineNum = 66584584;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
if (_sb.getLength()==19) { 
_c = __c.Asc(BA.ObjectToChar("8"));};
RDebugUtils.currentLine=66584585;
 //BA.debugLineNum = 66584585;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
if (_sb.getLength()==14) { 
_c = __c.Asc(BA.ObjectToChar("4"));};
RDebugUtils.currentLine=66584586;
 //BA.debugLineNum = 66584586;BA.debugLine="sb.Append(Chr(c))";
_sb.Append(BA.ObjectToString(__c.Chr(_c)));
 }
};
 }
};
RDebugUtils.currentLine=66584589;
 //BA.debugLineNum = 66584589;BA.debugLine="Return sb.ToString.ToLowerCase";
if (true) return _sb.ToString().toLowerCase();
RDebugUtils.currentLine=66584590;
 //BA.debugLineNum = 66584590;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_accionsalirjamtableclv(b4j.docU.cexpedicionessinentregartxt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_accionsalirjamtableclv", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_accionsalirjamtableclv", null));}
RDebugUtils.currentLine=66256896;
 //BA.debugLineNum = 66256896;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
RDebugUtils.currentLine=66256897;
 //BA.debugLineNum = 66256897;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=66256898;
 //BA.debugLineNum = 66256898;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemclick(b4j.docU.cexpedicionessinentregartxt __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=66715648;
 //BA.debugLineNum = 66715648;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
RDebugUtils.currentLine=66715649;
 //BA.debugLineNum = 66715649;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=66715650;
 //BA.debugLineNum = 66715650;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
__c.LogImpl("866715650","Datos Item seleccionado ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=66715651;
 //BA.debugLineNum = 66715651;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=66715652;
 //BA.debugLineNum = 66715652;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("866715652",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=66715654;
 //BA.debugLineNum = 66715654;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemlongclick(b4j.docU.cexpedicionessinentregartxt __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemlongclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=66781184;
 //BA.debugLineNum = 66781184;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
RDebugUtils.currentLine=66781185;
 //BA.debugLineNum = 66781185;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=66781186;
 //BA.debugLineNum = 66781186;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
__c.LogImpl("866781186","Datos Item seleccionado botón secundario ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=66781187;
 //BA.debugLineNum = 66781187;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=66781188;
 //BA.debugLineNum = 66781188;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("866781188",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=66781190;
 //BA.debugLineNum = 66781190;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_loadlayoutpanelitem(b4j.docU.cexpedicionessinentregartxt __ref,b4j.docU.jamtableclv._datositemindexclvjamtableclv _datositemindexclv) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_loadlayoutpanelitem", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_loadlayoutpanelitem", new Object[] {_datositemindexclv}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
String _estadoexp = "";
anywheresoftware.b4a.objects.B4XViewWrapper _xtf = null;
RDebugUtils.currentLine=66650112;
 //BA.debugLineNum = 66650112;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
RDebugUtils.currentLine=66650113;
 //BA.debugLineNum = 66650113;BA.debugLine="Dim mData As Map=DatosItemIndexCLV.Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_datositemindexclv.Value /*Object*/ ));
RDebugUtils.currentLine=66650114;
 //BA.debugLineNum = 66650114;BA.debugLine="Dim Pnl As B4XView=DatosItemIndexCLV.Panel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _datositemindexclv.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=66650115;
 //BA.debugLineNum = 66650115;BA.debugLine="Pnl.LoadLayout(\"scrItemExpedicionSinEntregarTxt\")";
_pnl.LoadLayout("scrItemExpedicionSinEntregarTxt",ba);
RDebugUtils.currentLine=66650118;
 //BA.debugLineNum = 66650118;BA.debugLine="txtANO.Text=mData.Get(\"ANO\")";
__ref._txtano /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("ANO"))));
RDebugUtils.currentLine=66650119;
 //BA.debugLineNum = 66650119;BA.debugLine="txtBULTOS.Text=mData.Get(\"BULTOS\")";
__ref._txtbultos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("BULTOS"))));
RDebugUtils.currentLine=66650120;
 //BA.debugLineNum = 66650120;BA.debugLine="txtCODDESTIN.Text=mData.Get(\"CODDESTIN\")";
__ref._txtcoddestin /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("CODDESTIN"))));
RDebugUtils.currentLine=66650121;
 //BA.debugLineNum = 66650121;BA.debugLine="txtCODEMPRESA.Text=mData.Get(\"CODEMPRESA\")";
__ref._txtcodempresa /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("CODEMPRESA"))));
RDebugUtils.currentLine=66650122;
 //BA.debugLineNum = 66650122;BA.debugLine="txtCODORIGEN.Text=mData.Get(\"CODORIGEN\")";
__ref._txtcodorigen /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("CODORIGEN"))));
RDebugUtils.currentLine=66650123;
 //BA.debugLineNum = 66650123;BA.debugLine="txtCPOSTALDESTINATARIO.Text=mData.Get(\"CP\")";
__ref._txtcpostaldestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("CP"))));
RDebugUtils.currentLine=66650124;
 //BA.debugLineNum = 66650124;BA.debugLine="txtDIRECCIONDESTINATARIO.Text=mData.Get(\"DIRECCIO";
__ref._txtdirecciondestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("DIRECCION"))));
RDebugUtils.currentLine=66650126;
 //BA.debugLineNum = 66650126;BA.debugLine="txtKILOS.Text=mData.Get(\"KILOS\")";
__ref._txtkilos /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("KILOS"))));
RDebugUtils.currentLine=66650127;
 //BA.debugLineNum = 66650127;BA.debugLine="txtNEXPED1.Text=mData.Get(\"NEXPED1\")";
__ref._txtnexped1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NEXPED1"))));
RDebugUtils.currentLine=66650128;
 //BA.debugLineNum = 66650128;BA.debugLine="txtNEXPED2.Text=mData.Get(\"NEXPED2\")";
__ref._txtnexped2 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NEXPED2"))));
RDebugUtils.currentLine=66650129;
 //BA.debugLineNum = 66650129;BA.debugLine="txtNOMBREDESTINATARIO.Text=mData.Get(\"DESTINATARI";
__ref._txtnombredestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("DESTINATARIO"))));
RDebugUtils.currentLine=66650130;
 //BA.debugLineNum = 66650130;BA.debugLine="txtDestino.Text=mData.Get(\"DESTINO\")";
__ref._txtdestino /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("DESTINO"))));
RDebugUtils.currentLine=66650131;
 //BA.debugLineNum = 66650131;BA.debugLine="txtPOBLACIONDESTINATARIO.Text=mData.Get(\"POBLACIO";
__ref._txtpoblaciondestinatario /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("POBLACION"))));
RDebugUtils.currentLine=66650132;
 //BA.debugLineNum = 66650132;BA.debugLine="txtREFERENCIA1.Text=mData.Get(\"REFERENCIA1\")";
__ref._txtreferencia1 /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("REFERENCIA1"))));
RDebugUtils.currentLine=66650138;
 //BA.debugLineNum = 66650138;BA.debugLine="txtFECHAALTA.Text=mData.Get(\"FECHA_x0020_SALIDA\")";
__ref._txtfechaalta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("FECHA_x0020_SALIDA"))));
RDebugUtils.currentLine=66650140;
 //BA.debugLineNum = 66650140;BA.debugLine="Dim EstadoExp As String=mData.Get(\"ESTADO\")";
_estadoexp = BA.ObjectToString(_mdata.Get((Object)("ESTADO")));
RDebugUtils.currentLine=66650141;
 //BA.debugLineNum = 66650141;BA.debugLine="Dim xtF As B4XView=txtEstadoActual";
_xtf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xtf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtestadoactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=66650142;
 //BA.debugLineNum = 66650142;BA.debugLine="If EstadoExp=\"\" Then";
if ((_estadoexp).equals("")) { 
RDebugUtils.currentLine=66650143;
 //BA.debugLineNum = 66650143;BA.debugLine="EstadoExp=\"ESTADO PENDIENTE DE ACTUALIZAR\"";
_estadoexp = "ESTADO PENDIENTE DE ACTUALIZAR";
RDebugUtils.currentLine=66650144;
 //BA.debugLineNum = 66650144;BA.debugLine="xtF.Color=xui.Color_LightGray";
_xtf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_LightGray);
RDebugUtils.currentLine=66650145;
 //BA.debugLineNum = 66650145;BA.debugLine="xtF.TextColor=xui.Color_Red";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
 }else {
RDebugUtils.currentLine=66650147;
 //BA.debugLineNum = 66650147;BA.debugLine="If EstadoExp.Contains(\"con incidencia\") Then";
if (_estadoexp.contains("con incidencia")) { 
RDebugUtils.currentLine=66650148;
 //BA.debugLineNum = 66650148;BA.debugLine="xtF.Color=xui.Color_Red";
_xtf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=66650149;
 //BA.debugLineNum = 66650149;BA.debugLine="xtF.TextColor=xui.Color_White";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 }else {
RDebugUtils.currentLine=66650151;
 //BA.debugLineNum = 66650151;BA.debugLine="xtF.Color=0xFFFFA500";
_xtf.setColor(((int)0xffffa500));
RDebugUtils.currentLine=66650152;
 //BA.debugLineNum = 66650152;BA.debugLine="xtF.TextColor=xui.Color_Black";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 };
 };
RDebugUtils.currentLine=66650156;
 //BA.debugLineNum = 66650156;BA.debugLine="txtEstadoActual.Text=EstadoExp";
__ref._txtestadoactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_estadoexp);
RDebugUtils.currentLine=66650157;
 //BA.debugLineNum = 66650157;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
__ref._txtnombrecliente /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreCliente"))));
RDebugUtils.currentLine=66650158;
 //BA.debugLineNum = 66650158;BA.debugLine="Dim xtF As B4XView=txtNombreResponsableCuenta";
_xtf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xtf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnombreresponsablecuenta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=66650159;
 //BA.debugLineNum = 66650159;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Nombre";
__ref._txtnombreresponsablecuenta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreResponsableCuenta"))));
RDebugUtils.currentLine=66650160;
 //BA.debugLineNum = 66650160;BA.debugLine="If txtNombreResponsableCuenta.Text<>\"\" Then";
if ((__ref._txtnombreresponsablecuenta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("") == false) { 
RDebugUtils.currentLine=66650161;
 //BA.debugLineNum = 66650161;BA.debugLine="xtF.Color=0xFFFFA500";
_xtf.setColor(((int)0xffffa500));
 };
RDebugUtils.currentLine=66650163;
 //BA.debugLineNum = 66650163;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_menubarmenuitem_action(b4j.docU.cexpedicionessinentregartxt __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "jamtableclv1_menubarmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_menubarmenuitem_action", new Object[] {_tagmenuitem}));}
anywheresoftware.b4a.objects.collections.List _lstdatoslineasseleccionadas = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
RDebugUtils.currentLine=66453504;
 //BA.debugLineNum = 66453504;BA.debugLine="Sub JamTableCLV1_MenuBarMenuItem_Action(TagMenuIte";
RDebugUtils.currentLine=66453505;
 //BA.debugLineNum = 66453505;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","EjemploAccionLineasSeleccionadas","")) {
case 0: {
RDebugUtils.currentLine=66453507;
 //BA.debugLineNum = 66453507;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=66453509;
 //BA.debugLineNum = 66453509;BA.debugLine="Dim lstDatosLineasSeleccionadas As List=JamTabl";
_lstdatoslineasseleccionadas = new anywheresoftware.b4a.objects.collections.List();
_lstdatoslineasseleccionadas = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getdatositemsseleccionados /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=66453510;
 //BA.debugLineNum = 66453510;BA.debugLine="For Each mData As Map In lstDatosLineasSeleccio";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group6 = _lstdatoslineasseleccionadas;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group6.Get(index6)));
RDebugUtils.currentLine=66453511;
 //BA.debugLineNum = 66453511;BA.debugLine="LogColor(\"DatosLineaSeleccionada : \" & mData,";
__c.LogImpl("866453511","DatosLineaSeleccionada : "+BA.ObjectToString(_mdata),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
 }
};
 break; }
case 2: {
 break; }
}
;
RDebugUtils.currentLine=66453515;
 //BA.debugLineNum = 66453515;BA.debugLine="End Sub";
return "";
}
public void  _mostrarestadosexpedicion(b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";
if (Debug.shouldDelegate(ba, "mostrarestadosexpedicion", false))
	 {Debug.delegate(ba, "mostrarestadosexpedicion", new Object[] {_lstestadosexpedicion}); return;}
ResumableSub_MostrarEstadosExpedicion rsub = new ResumableSub_MostrarEstadosExpedicion(this,__ref,_lstestadosexpedicion);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarEstadosExpedicion extends BA.ResumableSub {
public ResumableSub_MostrarEstadosExpedicion(b4j.docU.cexpedicionessinentregartxt parent,b4j.docU.cexpedicionessinentregartxt __ref,anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion) {
this.parent = parent;
this.__ref = __ref;
this._lstestadosexpedicion = _lstestadosexpedicion;
this.__ref = parent;
}
b4j.docU.cexpedicionessinentregartxt __ref;
b4j.docU.cexpedicionessinentregartxt parent;
anywheresoftware.b4a.objects.collections.List _lstestadosexpedicion;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _msa = null;
anywheresoftware.b4a.BA.IterableList group1;
int index1;
int groupLen1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionessinentregartxt";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=67043329;
 //BA.debugLineNum = 67043329;BA.debugLine="For Each mData As Map In lstEstadosExpedicion";
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
RDebugUtils.currentLine=67043330;
 //BA.debugLineNum = 67043330;BA.debugLine="Log(mData)";
parent.__c.LogImpl("867043330",BA.ObjectToString(_mdata),0);
 if (true) break;
if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=67043332;
 //BA.debugLineNum = 67043332;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mData.Get(\"ESTA";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mdata.Get((Object)("ESTADO"))),"Estado actual");
RDebugUtils.currentLine=67043333;
 //BA.debugLineNum = 67043333;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionessinentregartxt", "mostrarestadosexpedicion"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=67043334;
 //BA.debugLineNum = 67043334;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}