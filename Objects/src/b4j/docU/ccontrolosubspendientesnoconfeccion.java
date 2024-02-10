package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class ccontrolosubspendientesnoconfeccion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.ccontrolosubspendientesnoconfeccion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.ccontrolosubspendientesnoconfeccion.class).invoke(this, new Object[] {null});
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
public long _timestampbatchfasedocs = 0L;
public String _uuidsesion = "";
public boolean _primeravisoinfoestablecerprioridad = false;
public anywheresoftware.b4j.objects.ButtonWrapper _btnfasesdoc = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnmostrardocumentoennavision = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfecharequerida = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselprioridad = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtareafaseactual = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtarticulo = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdescripcion = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfaseactual = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechafaseactual = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechaof = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfecharequerida = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfinalizaproducto = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinfoadicionalfaseactual = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombreproveedor = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtobservaciones = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtosub = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtprioridad = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtproveedor = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtqtypte = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtrequieretransferenciacomponentes = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtruta = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdiasacumulados = null;
public long _fechahoyhora0 = 0L;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcliente = null;
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
public String  _initialize(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
boolean _rbool = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=58720259;
 //BA.debugLineNum = 58720259;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=58720260;
 //BA.debugLineNum = 58720260;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=58720261;
 //BA.debugLineNum = 58720261;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=58720262;
 //BA.debugLineNum = 58720262;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=58720263;
 //BA.debugLineNum = 58720263;BA.debugLine="frm.RootPane.LoadLayout(\"scrControlOSUBsPendiente";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrControlOSUBsPendientesNoConfeccion");
RDebugUtils.currentLine=58720264;
 //BA.debugLineNum = 58720264;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "show"),(int) (0));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
RDebugUtils.currentLine=58720267;
 //BA.debugLineNum = 58720267;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Control OSUBs";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Control OSUBs Pendientes No Confección");
RDebugUtils.currentLine=58720269;
 //BA.debugLineNum = 58720269;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=58720271;
 //BA.debugLineNum = 58720271;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=True";
__ref._primeravisoinfoestablecerprioridad /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=58720273;
 //BA.debugLineNum = 58720273;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=58720275;
 //BA.debugLineNum = 58720275;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
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
RDebugUtils.currentLine=58720277;
 //BA.debugLineNum = 58720277;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=58720278;
 //BA.debugLineNum = 58720278;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=58720280;
 //BA.debugLineNum = 58720280;BA.debugLine="wait for(BorrarDatosFaseActualDocumentosBatchAnte";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "show"), __ref._borrardatosfaseactualdocumentosbatchanterioresmaquinausuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 16;
return;
case 16:
//C
this.state = 7;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=58720281;
 //BA.debugLineNum = 58720281;BA.debugLine="If rBool=False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_rbool==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=58720282;
 //BA.debugLineNum = 58720282;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58720283;
 //BA.debugLineNum = 58720283;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=58720286;
 //BA.debugLineNum = 58720286;BA.debugLine="UUIDSesion=GenerarUUIDv4";
__ref._uuidsesion /*String*/  = __ref._generaruuidv4 /*String*/ (null);
RDebugUtils.currentLine=58720287;
 //BA.debugLineNum = 58720287;BA.debugLine="TimestampBatchFaseDocs=DateTime.Now";
__ref._timestampbatchfasedocs /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=58720297;
 //BA.debugLineNum = 58720297;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._configurartableclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaControlOSUBsPendientesNoCorteNoConfeccion.json");
RDebugUtils.currentLine=58720298;
 //BA.debugLineNum = 58720298;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "show"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58720299;
 //BA.debugLineNum = 58720299;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("858720299",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=58720300;
 //BA.debugLineNum = 58720300;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=58720301;
 //BA.debugLineNum = 58720301;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=58720302;
 //BA.debugLineNum = 58720302;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "show"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
RDebugUtils.currentLine=58720303;
 //BA.debugLineNum = 58720303;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=58720304;
 //BA.debugLineNum = 58720304;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=58720307;
 //BA.debugLineNum = 58720307;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarL";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._estadomenuitem /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=58720309;
 //BA.debugLineNum = 58720309;BA.debugLine="JamTableCLV1.AddMenuItemFontMaterialIconsToMenuIn";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Resetear Prioridades","ResetearPrioridades",BA.ObjectToString(parent.__c.Chr(((int)0xe16d))),__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=58720313;
 //BA.debugLineNum = 58720313;BA.debugLine="JamTableCLV1.AlturaItems=210dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaitems /*int*/ (null,parent.__c.DipToCurrent((int) (210)));
RDebugUtils.currentLine=58720314;
 //BA.debugLineNum = 58720314;BA.debugLine="JamTableCLV1.ColorSeparadorPaneles=0xFF696969";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setcolorseparadorpaneles(null,((int)0xff696969));
RDebugUtils.currentLine=58720315;
 //BA.debugLineNum = 58720315;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=2dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaseparadorpaneles /*float*/ (null,(float) (parent.__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=58720316;
 //BA.debugLineNum = 58720316;BA.debugLine="JamTableCLV1.ColorPanelSeleccionado=0xFF87CEFA";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setcolorpanelseleccionado /*int*/ (null,((int)0xff87cefa));
RDebugUtils.currentLine=58720318;
 //BA.debugLineNum = 58720318;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmodoseleccionitems /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._modoseleccionindividualperm /*String*/ );
RDebugUtils.currentLine=58720320;
 //BA.debugLineNum = 58720320;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=58720321;
 //BA.debugLineNum = 58720321;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatos(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _rbool = false;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="JamTableCLV1.Clear";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=58785796;
 //BA.debugLineNum = 58785796;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblPedFabPtesNoCor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblPedFabPtesNoCorteNoConf");
RDebugUtils.currentLine=58785797;
 //BA.debugLineNum = 58785797;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblOSUBsPendientes";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblOSUBsPendientesNoCorteNoConf");
RDebugUtils.currentLine=58785799;
 //BA.debugLineNum = 58785799;BA.debugLine="FechaHoyHora0=DateUtils.SetDate(DateTime.GetYear(";
__ref._fechahoyhora0 /*long*/  = parent._dateutils._setdate(parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetMonth(parent.__c.DateTime.getNow()),parent.__c.DateTime.GetDayOfMonth(parent.__c.DateTime.getNow()));
RDebugUtils.currentLine=58785802;
 //BA.debugLineNum = 58785802;BA.debugLine="Wait For(ActualizarDatosOSUBsPtesNAV) complete (m";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref._actualizardatososubsptesnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 42;
return;
case 42:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58785803;
 //BA.debugLineNum = 58785803;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=58785804;
 //BA.debugLineNum = 58785804;BA.debugLine="If Accion<>\"OK\" Then";
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
RDebugUtils.currentLine=58785805;
 //BA.debugLineNum = 58785805;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58785806;
 //BA.debugLineNum = 58785806;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=58785810;
 //BA.debugLineNum = 58785810;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=58785811;
 //BA.debugLineNum = 58785811;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=58785812;
 //BA.debugLineNum = 58785812;BA.debugLine="sb.Append(\"insert into tblOSUBsPendientesNoCorteN";
_sb.Append("insert into tblOSUBsPendientesNoCorteNoConf (OSUB, FechaOSUB, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta, QtyPte, TransfComp, FinalizaProducto)");
RDebugUtils.currentLine=58785813;
 //BA.debugLineNum = 58785813;BA.debugLine="sb.Append(\" Select PedidoFab As OSUB, FechaPedido";
_sb.Append(" Select PedidoFab As OSUB, FechaPedido As FechaOSUB, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta,sum(QtyPte) as QtyPte, TransfComp, FinalizaProducto");
RDebugUtils.currentLine=58785814;
 //BA.debugLineNum = 58785814;BA.debugLine="sb.Append(\" from tblPedFabPtesNoCorteNoConf group";
_sb.Append(" from tblPedFabPtesNoCorteNoConf group by PedidoFab, FechaPedido, Proveedor, NombreProveedor, Articulo, Descripcion, RutaOF, Cliente, NombreCliente, ResponsableCuenta,TransfComp, FinalizaProducto");
RDebugUtils.currentLine=58785815;
 //BA.debugLineNum = 58785815;BA.debugLine="mSQL.ExecNonQuery(sb.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=58785817;
 //BA.debugLineNum = 58785817;BA.debugLine="wait for(BorrarDatosBatchAnterioresUUIDSesion) co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref._borrardatosbatchanterioresuuidsesion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 43;
return;
case 43:
//C
this.state = 5;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=58785818;
 //BA.debugLineNum = 58785818;BA.debugLine="If rBool=False Then";
if (true) break;

case 5:
//if
this.state = 8;
if (_rbool==parent.__c.False) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=58785819;
 //BA.debugLineNum = 58785819;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58785820;
 //BA.debugLineNum = 58785820;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=58785823;
 //BA.debugLineNum = 58785823;BA.debugLine="wait for(InsertarLineasBatchDocumentos) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref._insertarlineasbatchdocumentos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 44;
return;
case 44:
//C
this.state = 9;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=58785824;
 //BA.debugLineNum = 58785824;BA.debugLine="If rBool=False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_rbool==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=58785825;
 //BA.debugLineNum = 58785825;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58785826;
 //BA.debugLineNum = 58785826;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=58785829;
 //BA.debugLineNum = 58785829;BA.debugLine="wait for(FaseActualDocumentosBacthUUID) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref._faseactualdocumentosbacthuuid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 45;
return;
case 45:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58785830;
 //BA.debugLineNum = 58785830;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=58785831;
 //BA.debugLineNum = 58785831;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((_accion).equals("Salir")) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=58785832;
 //BA.debugLineNum = 58785832;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58785833;
 //BA.debugLineNum = 58785833;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=58785859;
 //BA.debugLineNum = 58785859;BA.debugLine="wait for(FechasPrioridadVentasDocumentosBacthUUID";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), __ref._fechasprioridadventasdocumentosbacthuuid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 46;
return;
case 46:
//C
this.state = 17;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58785860;
 //BA.debugLineNum = 58785860;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=58785861;
 //BA.debugLineNum = 58785861;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 17:
//if
this.state = 20;
if ((_accion).equals("Salir")) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=58785862;
 //BA.debugLineNum = 58785862;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58785863;
 //BA.debugLineNum = 58785863;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=58785866;
 //BA.debugLineNum = 58785866;BA.debugLine="mSQL.ExecNonQuery2(\"update tblOSUBsPendientesNoCo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblOSUBsPendientesNoCorteNoConf set Fase=? where Fase=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("NO INICIADO"),(Object)("")}));
RDebugUtils.currentLine=58785868;
 //BA.debugLineNum = 58785868;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblOSUBsPendientesNoCorteNoConf");
RDebugUtils.currentLine=58785869;
 //BA.debugLineNum = 58785869;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=58785870;
 //BA.debugLineNum = 58785870;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _rsub);
this.state = 47;
return;
case 47:
//C
this.state = 21;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58785871;
 //BA.debugLineNum = 58785871;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=58785872;
 //BA.debugLineNum = 58785872;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 21:
//if
this.state = 41;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=58785873;
 //BA.debugLineNum = 58785873;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 24:
//if
this.state = 31;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=58785874;
 //BA.debugLineNum = 58785874;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=58785875;
 //BA.debugLineNum = 58785875;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 48;
return;
case 48:
//C
this.state = 27;
;
RDebugUtils.currentLine=58785877;
 //BA.debugLineNum = 58785877;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=58785878;
 //BA.debugLineNum = 58785878;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 49;
return;
case 49:
//C
this.state = 27;
_rint = (int) result[1];
;
RDebugUtils.currentLine=58785879;
 //BA.debugLineNum = 58785879;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 27:
//if
this.state = 30;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=58785880;
 //BA.debugLineNum = 58785880;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=58785881;
 //BA.debugLineNum = 58785881;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=58785884;
 //BA.debugLineNum = 58785884;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=58785886;
 //BA.debugLineNum = 58785886;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 31:
//if
this.state = 40;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=58785887;
 //BA.debugLineNum = 58785887;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 34:
//if
this.state = 39;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
if (true) return ;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=58785888;
 //BA.debugLineNum = 58785888;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=58785889;
 //BA.debugLineNum = 58785889;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 50;
return;
case 50:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;

case 41:
//C
this.state = -1;
;
RDebugUtils.currentLine=58785895;
 //BA.debugLineNum = 58785895;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Datos actualiz";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=58785896;
 //BA.debugLineNum = 58785896;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatos"), _msa);
this.state = 51;
return;
case 51:
//C
this.state = -1;
;
RDebugUtils.currentLine=58785898;
 //BA.debugLineNum = 58785898;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatososubsptesnav(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "actualizardatososubsptesnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatososubsptesnav", null));}
ResumableSub_ActualizarDatosOSUBsPtesNAV rsub = new ResumableSub_ActualizarDatosOSUBsPtesNAV(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosOSUBsPtesNAV extends BA.ResumableSub {
public ResumableSub_ActualizarDatosOSUBsPtesNAV(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblPedFabPtesNoCor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblPedFabPtesNoCorteNoConf");
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=59244547;
 //BA.debugLineNum = 59244547;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=59244548;
 //BA.debugLineNum = 59244548;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=59244554;
 //BA.debugLineNum = 59244554;BA.debugLine="Dim Comando As String=\"InfoPedidosFabPtesNoCorteN";
_comando = "InfoPedidosFabPtesNoCorteNoConfeccion";
RDebugUtils.currentLine=59244555;
 //BA.debugLineNum = 59244555;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Null,";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=59244557;
 //BA.debugLineNum = 59244557;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatososubsptesnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=59244559;
 //BA.debugLineNum = 59244559;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=59244560;
 //BA.debugLineNum = 59244560;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=59244561;
 //BA.debugLineNum = 59244561;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatososubsptesnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=59244562;
 //BA.debugLineNum = 59244562;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=59244563;
 //BA.debugLineNum = 59244563;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=59244566;
 //BA.debugLineNum = 59244566;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=59244567;
 //BA.debugLineNum = 59244567;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=59244568;
 //BA.debugLineNum = 59244568;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=59244569;
 //BA.debugLineNum = 59244569;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de OSUBs Pendientes No Corte No Confección","Aviso");
RDebugUtils.currentLine=59244570;
 //BA.debugLineNum = 59244570;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizardatososubsptesnav"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=59244572;
 //BA.debugLineNum = 59244572;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=59244573;
 //BA.debugLineNum = 59244573;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=59244576;
 //BA.debugLineNum = 59244576;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=59244584;
 //BA.debugLineNum = 59244584;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblPedFabPtesNoCorteNoConf",_lstreg);
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
RDebugUtils.currentLine=59244587;
 //BA.debugLineNum = 59244587;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=59244588;
 //BA.debugLineNum = 59244588;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=59047939;
 //BA.debugLineNum = 59047939;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrardatosbatchanterioresuuidsesion(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "borrardatosbatchanterioresuuidsesion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrardatosbatchanterioresuuidsesion", null));}
ResumableSub_BorrarDatosBatchAnterioresUUIDSesion rsub = new ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarDatosBatchAnterioresUUIDSesion extends BA.ResumableSub {
public ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=59965443;
 //BA.debugLineNum = 59965443;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=59965444;
 //BA.debugLineNum = 59965444;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasFaseActualDocumentoBacthUUID",new Object[]{(Object)(__ref._uuidsesion /*String*/ )});
RDebugUtils.currentLine=59965445;
 //BA.debugLineNum = 59965445;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=59965446;
 //BA.debugLineNum = 59965446;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=59965447;
 //BA.debugLineNum = 59965447;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosbatchanterioresuuidsesion"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=59965449;
 //BA.debugLineNum = 59965449;BA.debugLine="If result=False Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.__c.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=59965450;
 //BA.debugLineNum = 59965450;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthUUID","Error");
RDebugUtils.currentLine=59965451;
 //BA.debugLineNum = 59965451;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosbatchanterioresuuidsesion"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=59965452;
 //BA.debugLineNum = 59965452;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=59965454;
 //BA.debugLineNum = 59965454;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=59965456;
 //BA.debugLineNum = 59965456;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _insertarlineasbatchdocumentos(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "insertarlineasbatchdocumentos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "insertarlineasbatchdocumentos", null));}
ResumableSub_InsertarLineasBatchDocumentos rsub = new ResumableSub_InsertarLineasBatchDocumentos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InsertarLineasBatchDocumentos extends BA.ResumableSub {
public ResumableSub_InsertarLineasBatchDocumentos(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=60030979;
 //BA.debugLineNum = 60030979;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select distin";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select distinct OSUB from tblOSUBsPendientesNoCorteNoConf");
RDebugUtils.currentLine=60030980;
 //BA.debugLineNum = 60030980;BA.debugLine="Do While rs.NextRow";
if (true) break;

case 1:
//do while
this.state = 4;
while (_rs.NextRow()) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=60030981;
 //BA.debugLineNum = 60030981;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarLineaFaseActualDocumentoBatch",new Object[]{(Object)(__ref._timestampbatchfasedocs /*long*/ ),(Object)(__ref._uuidsesion /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ),(Object)(_rs.GetString("OSUB"))});
RDebugUtils.currentLine=60030982;
 //BA.debugLineNum = 60030982;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=60030984;
 //BA.debugLineNum = 60030984;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=60030985;
 //BA.debugLineNum = 60030985;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=60030986;
 //BA.debugLineNum = 60030986;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "insertarlineasbatchdocumentos"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=60030988;
 //BA.debugLineNum = 60030988;BA.debugLine="If result=False Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_result==parent.__c.False) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=60030989;
 //BA.debugLineNum = 60030989;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch","Error");
RDebugUtils.currentLine=60030990;
 //BA.debugLineNum = 60030990;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "insertarlineasbatchdocumentos"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=60030991;
 //BA.debugLineNum = 60030991;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=60030993;
 //BA.debugLineNum = 60030993;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=60030995;
 //BA.debugLineNum = 60030995;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _faseactualdocumentosbacthuuid(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "faseactualdocumentosbacthuuid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "faseactualdocumentosbacthuuid", null));}
ResumableSub_FaseActualDocumentosBacthUUID rsub = new ResumableSub_FaseActualDocumentosBacthUUID(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FaseActualDocumentosBacthUUID extends BA.ResumableSub {
public ResumableSub_FaseActualDocumentosBacthUUID(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=60162052;
 //BA.debugLineNum = 60162052;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60162053;
 //BA.debugLineNum = 60162053;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=60162056;
 //BA.debugLineNum = 60162056;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"FaseActualDocumentosBacthUUID",new Object[]{(Object)(__ref._uuidsesion /*String*/ )},parent);
RDebugUtils.currentLine=60162058;
 //BA.debugLineNum = 60162058;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "faseactualdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=60162059;
 //BA.debugLineNum = 60162059;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=60162060;
 //BA.debugLineNum = 60162060;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query FaseActualDocumentosBacthUUID","Error");
RDebugUtils.currentLine=60162061;
 //BA.debugLineNum = 60162061;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "faseactualdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
RDebugUtils.currentLine=60162062;
 //BA.debugLineNum = 60162062;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=60162063;
 //BA.debugLineNum = 60162063;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60162066;
 //BA.debugLineNum = 60162066;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 19;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 19;
RDebugUtils.currentLine=60162067;
 //BA.debugLineNum = 60162067;BA.debugLine="Accion=\"SinFaseActualDocumentos\"";
_accion = "SinFaseActualDocumentos";
RDebugUtils.currentLine=60162068;
 //BA.debugLineNum = 60162068;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=60162070;
 //BA.debugLineNum = 60162070;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=60162071;
 //BA.debugLineNum = 60162071;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=60162074;
 //BA.debugLineNum = 60162074;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=60162075;
 //BA.debugLineNum = 60162075;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=60162076;
 //BA.debugLineNum = 60162076;BA.debugLine="For Each m As Map In lstReg";
if (true) break;

case 11:
//for
this.state = 14;
_m = new anywheresoftware.b4a.objects.collections.Map();
group20 = _lstreg;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index20 < groupLen20) {
this.state = 13;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 24:
//C
this.state = 23;
index20++;
if (true) break;

case 13:
//C
this.state = 24;
RDebugUtils.currentLine=60162079;
 //BA.debugLineNum = 60162079;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblOSUBsPendie";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblOSUBsPendientesNoCorteNoConf set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, Observaciones=? where OSUB=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m.Get((Object)("Fase")),_m.Get((Object)("Gestionado")),_m.Get((Object)("FechaHoraMov")),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("ResponsableFase")))),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("InfoAdicionalFase")))),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("Obs")))),_m.Get((Object)("Documento"))}));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=60162082;
 //BA.debugLineNum = 60162082;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=60162083;
 //BA.debugLineNum = 60162083;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "faseactualdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=60162084;
 //BA.debugLineNum = 60162084;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("860162084","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=60162085;
 //BA.debugLineNum = 60162085;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=60162086;
 //BA.debugLineNum = 60162086;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=60162087;
 //BA.debugLineNum = 60162087;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 18:
//C
this.state = 19;
;
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
RDebugUtils.currentLine=60162091;
 //BA.debugLineNum = 60162091;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=60162092;
 //BA.debugLineNum = 60162092;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _fechasprioridadventasdocumentosbacthuuid(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "fechasprioridadventasdocumentosbacthuuid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "fechasprioridadventasdocumentosbacthuuid", null));}
ResumableSub_FechasPrioridadVentasDocumentosBacthUUID rsub = new ResumableSub_FechasPrioridadVentasDocumentosBacthUUID(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FechasPrioridadVentasDocumentosBacthUUID extends BA.ResumableSub {
public ResumableSub_FechasPrioridadVentasDocumentosBacthUUID(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60293121;
 //BA.debugLineNum = 60293121;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=60293124;
 //BA.debugLineNum = 60293124;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60293125;
 //BA.debugLineNum = 60293125;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=60293128;
 //BA.debugLineNum = 60293128;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"FechasPrioridadVentasDocumentosBacthUUID",new Object[]{(Object)(__ref._uuidsesion /*String*/ )},parent);
RDebugUtils.currentLine=60293130;
 //BA.debugLineNum = 60293130;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "fechasprioridadventasdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=60293131;
 //BA.debugLineNum = 60293131;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 20;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=60293132;
 //BA.debugLineNum = 60293132;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query FechasPrioridadVentasDocumentosBacthUUID","Error");
RDebugUtils.currentLine=60293133;
 //BA.debugLineNum = 60293133;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "fechasprioridadventasdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
RDebugUtils.currentLine=60293134;
 //BA.debugLineNum = 60293134;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=60293135;
 //BA.debugLineNum = 60293135;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60293138;
 //BA.debugLineNum = 60293138;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 19;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 19;
RDebugUtils.currentLine=60293139;
 //BA.debugLineNum = 60293139;BA.debugLine="Accion=\"SinFechasPrioridadVentasOSUBsPendientes";
_accion = "SinFechasPrioridadVentasOSUBsPendientes";
RDebugUtils.currentLine=60293140;
 //BA.debugLineNum = 60293140;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=60293142;
 //BA.debugLineNum = 60293142;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=60293143;
 //BA.debugLineNum = 60293143;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=60293146;
 //BA.debugLineNum = 60293146;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=60293147;
 //BA.debugLineNum = 60293147;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=60293148;
 //BA.debugLineNum = 60293148;BA.debugLine="For Each m As Map In lstReg";
if (true) break;

case 11:
//for
this.state = 14;
_m = new anywheresoftware.b4a.objects.collections.Map();
group20 = _lstreg;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index20 < groupLen20) {
this.state = 13;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 24:
//C
this.state = 23;
index20++;
if (true) break;

case 13:
//C
this.state = 24;
RDebugUtils.currentLine=60293150;
 //BA.debugLineNum = 60293150;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblOSUBsPendie";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblOSUBsPendientesNoCorteNoConf set PrioridadVentas=?, NombrePrioridadVentas=?, FechaRequeridaVentas=? where OSUB=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m.Get((Object)("IDPrioridadVentas")),_m.Get((Object)("PrioridadVentas")),_m.Get((Object)("FechaVentasLong")),_m.Get((Object)("PedidoFab"))}));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=60293153;
 //BA.debugLineNum = 60293153;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=60293154;
 //BA.debugLineNum = 60293154;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "fechasprioridadventasdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=60293155;
 //BA.debugLineNum = 60293155;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("860293155","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=60293156;
 //BA.debugLineNum = 60293156;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=60293157;
 //BA.debugLineNum = 60293157;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=60293158;
 //BA.debugLineNum = 60293158;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 18:
//C
this.state = 19;
;
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
RDebugUtils.currentLine=60293162;
 //BA.debugLineNum = 60293162;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=60293163;
 //BA.debugLineNum = 60293163;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarfechagestionorden(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _idtipof,String _ordenf,long _fechal,int _idu,String _nombreusu) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "actualizarfechagestionorden", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarfechagestionorden", new Object[] {_idtipof,_ordenf,_fechal,_idu,_nombreusu}));}
ResumableSub_ActualizarFechaGestionOrden rsub = new ResumableSub_ActualizarFechaGestionOrden(this,__ref,_idtipof,_ordenf,_fechal,_idu,_nombreusu);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarFechaGestionOrden extends BA.ResumableSub {
public ResumableSub_ActualizarFechaGestionOrden(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _idtipof,String _ordenf,long _fechal,int _idu,String _nombreusu) {
this.parent = parent;
this.__ref = __ref;
this._idtipof = _idtipof;
this._ordenf = _ordenf;
this._fechal = _fechal;
this._idu = _idu;
this._nombreusu = _nombreusu;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
int _idtipof;
String _ordenf;
long _fechal;
int _idu;
String _nombreusu;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mreg = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60686337;
 //BA.debugLineNum = 60686337;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=60686338;
 //BA.debugLineNum = 60686338;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60686339;
 //BA.debugLineNum = 60686339;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=60686340;
 //BA.debugLineNum = 60686340;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"NuevaFechaGestionOrdenFab",(Object[])(new String[]{BA.NumberToString(_idtipof),_ordenf,BA.NumberToString(_fechal),BA.NumberToString(_idu),_nombreusu}),parent);
RDebugUtils.currentLine=60686342;
 //BA.debugLineNum = 60686342;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarfechagestionorden"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=60686343;
 //BA.debugLineNum = 60686343;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=60686344;
 //BA.debugLineNum = 60686344;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query NuevaFechaGestionOrdenFab","Error");
RDebugUtils.currentLine=60686345;
 //BA.debugLineNum = 60686345;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarfechagestionorden"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=60686346;
 //BA.debugLineNum = 60686346;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60686348;
 //BA.debugLineNum = 60686348;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=60686351;
 //BA.debugLineNum = 60686351;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=60686352;
 //BA.debugLineNum = 60686352;BA.debugLine="Dim mReg As Map=lstReg.Get(0)";
_mreg = new anywheresoftware.b4a.objects.collections.Map();
_mreg = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=60686353;
 //BA.debugLineNum = 60686353;BA.debugLine="Dim sResp As String=mReg.GetValueAt(0)";
_sresp = BA.ObjectToString(_mreg.GetValueAt((int) (0)));
RDebugUtils.currentLine=60686354;
 //BA.debugLineNum = 60686354;BA.debugLine="If sResp<>\"OK\" Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((_sresp).equals("OK") == false) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=60686355;
 //BA.debugLineNum = 60686355;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sResp & CRLF";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,_sresp+parent.__c.CRLF+parent.__c.CRLF+"No se ha actualizado la fecha","Error");
RDebugUtils.currentLine=60686356;
 //BA.debugLineNum = 60686356;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarfechagestionorden"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=60686357;
 //BA.debugLineNum = 60686357;BA.debugLine="Accion=\"Error\"";
_accion = "Error";
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60686359;
 //BA.debugLineNum = 60686359;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
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
RDebugUtils.currentLine=60686363;
 //BA.debugLineNum = 60686363;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=60686364;
 //BA.debugLineNum = 60686364;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarprioridaddocumento(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _idtipoprioridad,String _docsel) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "actualizarprioridaddocumento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarprioridaddocumento", new Object[] {_idtipoprioridad,_docsel}));}
ResumableSub_ActualizarPrioridadDocumento rsub = new ResumableSub_ActualizarPrioridadDocumento(this,__ref,_idtipoprioridad,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarPrioridadDocumento extends BA.ResumableSub {
public ResumableSub_ActualizarPrioridadDocumento(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _idtipoprioridad,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._idtipoprioridad = _idtipoprioridad;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
int _idtipoprioridad;
String _docsel;
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60489730;
 //BA.debugLineNum = 60489730;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60489731;
 //BA.debugLineNum = 60489731;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=60489733;
 //BA.debugLineNum = 60489733;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("ActualizarPrioridadDocumentoNoGestionado",new Object[]{(Object)(_docsel),(Object)(_idtipoprioridad),(Object)(_idtipoprioridad)});
RDebugUtils.currentLine=60489734;
 //BA.debugLineNum = 60489734;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=60489735;
 //BA.debugLineNum = 60489735;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarprioridaddocumento"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=60489736;
 //BA.debugLineNum = 60489736;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=60489737;
 //BA.debugLineNum = 60489737;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar la prioridad para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=60489738;
 //BA.debugLineNum = 60489738;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizarprioridaddocumento"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=60489739;
 //BA.debugLineNum = 60489739;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=60489742;
 //BA.debugLineNum = 60489742;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=60489743;
 //BA.debugLineNum = 60489743;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizartblprioridadespedidosfab(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,String _pedidofab,int _prioridad,long _fecharequeridalong,String _usuario) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "actualizartblprioridadespedidosfab", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizartblprioridadespedidosfab", new Object[] {_pedidofab,_prioridad,_fecharequeridalong,_usuario}));}
ResumableSub_ActualizarTblPrioridadesPedidosFab rsub = new ResumableSub_ActualizarTblPrioridadesPedidosFab(this,__ref,_pedidofab,_prioridad,_fecharequeridalong,_usuario);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarTblPrioridadesPedidosFab extends BA.ResumableSub {
public ResumableSub_ActualizarTblPrioridadesPedidosFab(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref,String _pedidofab,int _prioridad,long _fecharequeridalong,String _usuario) {
this.parent = parent;
this.__ref = __ref;
this._pedidofab = _pedidofab;
this._prioridad = _prioridad;
this._fecharequeridalong = _fecharequeridalong;
this._usuario = _usuario;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
String _pedidofab;
int _prioridad;
long _fecharequeridalong;
String _usuario;
int _fechaexcel = 0;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60751873;
 //BA.debugLineNum = 60751873;BA.debugLine="Dim FechaExcel As Int=TicksToExcelDate(FechaReque";
_fechaexcel = (int)(Double.parseDouble(__ref._tickstoexceldate /*String*/ (null,_fecharequeridalong)));
RDebugUtils.currentLine=60751874;
 //BA.debugLineNum = 60751874;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("ActualizarPrioridadOrdenesFab",new Object[]{(Object)(_pedidofab),(Object)(_prioridad),(Object)(_fechaexcel),(Object)(_usuario),(Object)(_prioridad),(Object)(_fechaexcel),(Object)(_usuario)});
RDebugUtils.currentLine=60751875;
 //BA.debugLineNum = 60751875;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizartblprioridadespedidosfab"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)})));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=60751876;
 //BA.debugLineNum = 60751876;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=60751877;
 //BA.debugLineNum = 60751877;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar la tabla tblprioridadespedidosfab.","Error");
RDebugUtils.currentLine=60751878;
 //BA.debugLineNum = 60751878;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "actualizartblprioridadespedidosfab"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=60751880;
 //BA.debugLineNum = 60751880;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=60751882;
 //BA.debugLineNum = 60751882;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _tickstoexceldate(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,long _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "tickstoexceldate", false))
	 {return ((String) Debug.delegate(ba, "tickstoexceldate", new Object[] {_t}));}
long _excelunixdiff = 0L;
b4j.example.dateutils._period _p = null;
int _diasdesde0101970 = 0;
int _diasexcel = 0;
RDebugUtils.currentLine=60882944;
 //BA.debugLineNum = 60882944;BA.debugLine="Public Sub TicksToExcelDate(t As Long) As String";
RDebugUtils.currentLine=60882945;
 //BA.debugLineNum = 60882945;BA.debugLine="Dim ExcelUnixDiff As Long=25569             'd";
_excelunixdiff = (long) (25569);
RDebugUtils.currentLine=60882949;
 //BA.debugLineNum = 60882949;BA.debugLine="Dim p As Period=DateUtils.PeriodBetweenInDays(0,t";
_p = _dateutils._periodbetweenindays((long) (0),_t);
RDebugUtils.currentLine=60882950;
 //BA.debugLineNum = 60882950;BA.debugLine="Dim DiasDesde0101970 As Int=p.Days";
_diasdesde0101970 = _p.Days;
RDebugUtils.currentLine=60882953;
 //BA.debugLineNum = 60882953;BA.debugLine="Dim DiasExcel As Int=ExcelUnixDiff+DiasDesde01019";
_diasexcel = (int) (_excelunixdiff+_diasdesde0101970+1);
RDebugUtils.currentLine=60882954;
 //BA.debugLineNum = 60882954;BA.debugLine="Log(\"DiasExcel \" & DiasExcel)";
__c.LogImpl("860882954","DiasExcel "+BA.NumberToString(_diasexcel),0);
RDebugUtils.currentLine=60882955;
 //BA.debugLineNum = 60882955;BA.debugLine="Return(DiasExcel)";
if (true) return BA.NumberToString((_diasexcel));
RDebugUtils.currentLine=60882957;
 //BA.debugLineNum = 60882957;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrardatosfaseactualdocumentosbatchanterioresmaquinausuario(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario", null));}
ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario rsub = new ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario extends BA.ResumableSub {
public ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=59899907;
 //BA.debugLineNum = 59899907;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=59899908;
 //BA.debugLineNum = 59899908;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario",new Object[]{(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ )});
RDebugUtils.currentLine=59899909;
 //BA.debugLineNum = 59899909;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=59899910;
 //BA.debugLineNum = 59899910;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=59899911;
 //BA.debugLineNum = 59899911;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=59899913;
 //BA.debugLineNum = 59899913;BA.debugLine="If result=False Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent.__c.False) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=59899914;
 //BA.debugLineNum = 59899914;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthMaquinaUsuario","Error");
RDebugUtils.currentLine=59899915;
 //BA.debugLineNum = 59899915;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=59899916;
 //BA.debugLineNum = 59899916;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=59899918;
 //BA.debugLineNum = 59899918;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=59899920;
 //BA.debugLineNum = 59899920;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnactualizar_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnactualizar_click", false))
	 {return ((String) Debug.delegate(ba, "btnactualizar_click", null));}
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Private Sub btnActualizar_Click";
RDebugUtils.currentLine=59572225;
 //BA.debugLineNum = 59572225;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="End Sub";
return "";
}
public String  _btnejemplo_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnejemplo_click", false))
	 {return ((String) Debug.delegate(ba, "btnejemplo_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Private Sub btnEjemplo_Click";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=59637763;
 //BA.debugLineNum = 59637763;BA.debugLine="Log(mData)";
__c.LogImpl("859637763",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=59637764;
 //BA.debugLineNum = 59637764;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=59637765;
 //BA.debugLineNum = 59637765;BA.debugLine="End Sub";
return "";
}
public String  _btnfasesdoc_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnfasesdoc_click", false))
	 {return ((String) Debug.delegate(ba, "btnfasesdoc_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _docsel = "";
b4j.docU.cfasesdocumento _cfdoc = null;
RDebugUtils.currentLine=59834368;
 //BA.debugLineNum = 59834368;BA.debugLine="Private Sub btnFasesDoc_Click";
RDebugUtils.currentLine=59834369;
 //BA.debugLineNum = 59834369;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=59834370;
 //BA.debugLineNum = 59834370;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=59834371;
 //BA.debugLineNum = 59834371;BA.debugLine="Log(mData)";
__c.LogImpl("859834371",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=59834374;
 //BA.debugLineNum = 59834374;BA.debugLine="Dim DocSel As String=mData.Get(\"OSUB\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("OSUB")));
RDebugUtils.currentLine=59834376;
 //BA.debugLineNum = 59834376;BA.debugLine="Dim cFDoc As cFasesDocumento";
_cfdoc = new b4j.docU.cfasesdocumento();
RDebugUtils.currentLine=59834377;
 //BA.debugLineNum = 59834377;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,DocSel)";
_cfdoc._initialize /*String*/ (null,ba,this,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),_docsel);
RDebugUtils.currentLine=59834378;
 //BA.debugLineNum = 59834378;BA.debugLine="cFDoc.Show";
_cfdoc._show /*void*/ (null);
RDebugUtils.currentLine=59834379;
 //BA.debugLineNum = 59834379;BA.debugLine="End Sub";
return "";
}
public void  _btnmostrardocumentoennavision_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnmostrardocumentoennavision_click", false))
	 {Debug.delegate(ba, "btnmostrardocumentoennavision_click", null); return;}
ResumableSub_btnMostrarDocumentoEnNavision_Click rsub = new ResumableSub_btnMostrarDocumentoEnNavision_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnMostrarDocumentoEnNavision_Click extends BA.ResumableSub {
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
String _docsel = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=60227587;
 //BA.debugLineNum = 60227587;BA.debugLine="Log(mData)";
parent.__c.LogImpl("860227587",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=60227588;
 //BA.debugLineNum = 60227588;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=60227590;
 //BA.debugLineNum = 60227590;BA.debugLine="Dim DocSel As String=mData.Get(\"OSUB\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("OSUB")));
RDebugUtils.currentLine=60227600;
 //BA.debugLineNum = 60227600;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirLin";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Orden producción",(int) (50147),"No.",_docsel);
RDebugUtils.currentLine=60227605;
 //BA.debugLineNum = 60227605;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=60227607;
 //BA.debugLineNum = 60227607;BA.debugLine="If success Then";
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
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60227610;
 //BA.debugLineNum = 60227610;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir la ficha de la OSUB "+_docsel+" en NAVISION.","Error");
RDebugUtils.currentLine=60227611;
 //BA.debugLineNum = 60227611;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnmostrardocumentoennavision_click"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=60227613;
 //BA.debugLineNum = 60227613;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnmostrardocumentoennavision_mousepressed(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnmostrardocumentoennavision_mousepressed", false))
	 {return ((String) Debug.delegate(ba, "btnmostrardocumentoennavision_mousepressed", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=60948480;
 //BA.debugLineNum = 60948480;BA.debugLine="Private Sub btnMostrarDocumentoEnNavision_MousePre";
RDebugUtils.currentLine=60948481;
 //BA.debugLineNum = 60948481;BA.debugLine="Dim b As Button=Sender";
_b = new anywheresoftware.b4j.objects.ButtonWrapper();
_b = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=60948482;
 //BA.debugLineNum = 60948482;BA.debugLine="CSSUtils.SetBorder(b,2,fx.Colors.From32Bit(0xFF00";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_b.getObject())),2,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xff00ffff)))),0);
RDebugUtils.currentLine=60948483;
 //BA.debugLineNum = 60948483;BA.debugLine="End Sub";
return "";
}
public String  _btnmostrardocumentoennavision_mousereleased(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnmostrardocumentoennavision_mousereleased", false))
	 {return ((String) Debug.delegate(ba, "btnmostrardocumentoennavision_mousereleased", new Object[] {_eventdata}));}
anywheresoftware.b4j.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=61014016;
 //BA.debugLineNum = 61014016;BA.debugLine="Private Sub btnMostrarDocumentoEnNavision_MouseRel";
RDebugUtils.currentLine=61014017;
 //BA.debugLineNum = 61014017;BA.debugLine="Dim b As Button=Sender";
_b = new anywheresoftware.b4j.objects.ButtonWrapper();
_b = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=61014018;
 //BA.debugLineNum = 61014018;BA.debugLine="CSSUtils.SetBorder(b,2,fx.Colors.From32Bit(0xFF87";
_cssutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_b.getObject())),2,(anywheresoftware.b4j.objects.JFX.PaintWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.PaintWrapper(), (javafx.scene.paint.Paint)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(((int)0xff87cefa)))),0);
RDebugUtils.currentLine=61014019;
 //BA.debugLineNum = 61014019;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="End Sub";
return "";
}
public void  _btnselalmfisico_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnselalmfisico_click", false))
	 {Debug.delegate(ba, "btnselalmfisico_click", null); return;}
ResumableSub_btnSelAlmFisico_Click rsub = new ResumableSub_btnSelAlmFisico_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelAlmFisico_Click extends BA.ResumableSub {
public ResumableSub_btnSelAlmFisico_Click(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
String _docsel = "";
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
String _almfis = "";
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mdatamodif = null;
boolean _rbool = false;
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59703297;
 //BA.debugLineNum = 59703297;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=59703300;
 //BA.debugLineNum = 59703300;BA.debugLine="Log(mData)";
parent.__c.LogImpl("859703300",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=59703301;
 //BA.debugLineNum = 59703301;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=59703303;
 //BA.debugLineNum = 59703303;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=59703306;
 //BA.debugLineNum = 59703306;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=59703307;
 //BA.debugLineNum = 59703307;BA.debugLine="Dialog.Title=\"Selecciona Almacén Físico de Prepar";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Almacén Físico de Preparación");
RDebugUtils.currentLine=59703308;
 //BA.debugLineNum = 59703308;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=59703309;
 //BA.debugLineNum = 59703309;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=59703310;
 //BA.debugLineNum = 59703310;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=59703311;
 //BA.debugLineNum = 59703311;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=59703312;
 //BA.debugLineNum = 59703312;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=59703314;
 //BA.debugLineNum = 59703314;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=59703315;
 //BA.debugLineNum = 59703315;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=59703316;
 //BA.debugLineNum = 59703316;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=59703318;
 //BA.debugLineNum = 59703318;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=59703319;
 //BA.debugLineNum = 59703319;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=59703321;
 //BA.debugLineNum = 59703321;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
_lstopciones = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"PROIN","PROTEC","ADESA"});
RDebugUtils.currentLine=59703323;
 //BA.debugLineNum = 59703323;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=59703325;
 //BA.debugLineNum = 59703325;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=59703327;
 //BA.debugLineNum = 59703327;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step21 = 1;
limit21 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 4;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 3;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step21)) ;
if (true) break;

case 3:
//C
this.state = 24;
RDebugUtils.currentLine=59703328;
 //BA.debugLineNum = 59703328;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=59703332;
 //BA.debugLineNum = 59703332;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=59703333;
 //BA.debugLineNum = 59703333;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=59703335;
 //BA.debugLineNum = 59703335;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=59703336;
 //BA.debugLineNum = 59703336;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=59703337;
 //BA.debugLineNum = 59703337;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=59703340;
 //BA.debugLineNum = 59703340;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), _rsub);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=59703341;
 //BA.debugLineNum = 59703341;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=59703342;
 //BA.debugLineNum = 59703342;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=59703344;
 //BA.debugLineNum = 59703344;BA.debugLine="Dim AlmFis As String=B4XListDlg.SelectedItem";
_almfis = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=59703346;
 //BA.debugLineNum = 59703346;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=59703347;
 //BA.debugLineNum = 59703347;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=59703349;
 //BA.debugLineNum = 59703349;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"B";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarDocumentoAlmacenManual",new Object[]{(Object)(_docsel)});
RDebugUtils.currentLine=59703350;
 //BA.debugLineNum = 59703350;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=59703351;
 //BA.debugLineNum = 59703351;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"I";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarDocumentoAlmacenManual",new Object[]{(Object)(_docsel),(Object)(_almfis)});
RDebugUtils.currentLine=59703352;
 //BA.debugLineNum = 59703352;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=59703353;
 //BA.debugLineNum = 59703353;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 26;
return;
case 26:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=59703354;
 //BA.debugLineNum = 59703354;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=59703355;
 //BA.debugLineNum = 59703355;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar el almacén físico para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=59703356;
 //BA.debugLineNum = 59703356;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=59703360;
 //BA.debugLineNum = 59703360;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set AlmacenFisico=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_almfis,_docsel}));
RDebugUtils.currentLine=59703361;
 //BA.debugLineNum = 59703361;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOSUBsPe";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOSUBsPendientesNoCorteNoConf set AlmacenFisico=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_almfis,_docsel}));
RDebugUtils.currentLine=59703368;
 //BA.debugLineNum = 59703368;BA.debugLine="Dim mDataModif As Map";
_mdatamodif = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=59703369;
 //BA.debugLineNum = 59703369;BA.debugLine="mDataModif.Initialize";
_mdatamodif.Initialize();
RDebugUtils.currentLine=59703370;
 //BA.debugLineNum = 59703370;BA.debugLine="mDataModif.Put(\"AlmacenFisico\",AlmFis)";
_mdatamodif.Put((Object)("AlmacenFisico"),(Object)(_almfis));
RDebugUtils.currentLine=59703371;
 //BA.debugLineNum = 59703371;BA.debugLine="wait for(JamTableCLV1.ActualizarValueItemCLV(Inde";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselalmfisico_click"), __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._actualizarvalueitemclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_indexsel,_mdatamodif));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=59703372;
 //BA.debugLineNum = 59703372;BA.debugLine="If rBool=False Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_rbool==parent.__c.False) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=59703373;
 //BA.debugLineNum = 59703373;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=59703376;
 //BA.debugLineNum = 59703376;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnselfecharequerida_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnselfecharequerida_click", false))
	 {return ((String) Debug.delegate(ba, "btnselfecharequerida_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
RDebugUtils.currentLine=60555264;
 //BA.debugLineNum = 60555264;BA.debugLine="Private Sub btnSelFechaRequerida_Click";
RDebugUtils.currentLine=60555268;
 //BA.debugLineNum = 60555268;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=60555269;
 //BA.debugLineNum = 60555269;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=60555270;
 //BA.debugLineNum = 60555270;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))));
RDebugUtils.currentLine=60555271;
 //BA.debugLineNum = 60555271;BA.debugLine="EditarFechaRequeridaVentas(IndexSel, mData)";
__ref._editarfecharequeridaventas /*void*/ (null,_indexsel,_mdata);
RDebugUtils.currentLine=60555272;
 //BA.debugLineNum = 60555272;BA.debugLine="End Sub";
return "";
}
public void  _editarfecharequeridaventas(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _indexsel,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "editarfecharequeridaventas", false))
	 {Debug.delegate(ba, "editarfecharequeridaventas", new Object[] {_indexsel,_mdata}); return;}
ResumableSub_EditarFechaRequeridaVentas rsub = new ResumableSub_EditarFechaRequeridaVentas(this,__ref,_indexsel,_mdata);
rsub.resume(ba, null);
}
public static class ResumableSub_EditarFechaRequeridaVentas extends BA.ResumableSub {
public ResumableSub_EditarFechaRequeridaVentas(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _indexsel,anywheresoftware.b4a.objects.collections.Map _mdata) {
this.parent = parent;
this.__ref = __ref;
this._indexsel = _indexsel;
this._mdata = _mdata;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
int _indexsel;
anywheresoftware.b4a.objects.collections.Map _mdata;
String _osubsel = "";
int _idprioridadventas = 0;
float _offset_before_dialog = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
long _fechaactual = 0L;
String _dateformatant = "";
String _sfechaactual = "";
Object _msa = null;
int _rint = 0;
b4j.docU.b4xdatetemplate _b4xdatedlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
long _fecharequeridaventas = 0L;
String _accion = "";
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xtf = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group52;
int index52;
int groupLen52;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60620803;
 //BA.debugLineNum = 60620803;BA.debugLine="Log(mData)";
parent.__c.LogImpl("860620803",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=60620804;
 //BA.debugLineNum = 60620804;BA.debugLine="Dim OSUBSel As String=mData.Get(\"OSUB\")";
_osubsel = BA.ObjectToString(_mdata.Get((Object)("OSUB")));
RDebugUtils.currentLine=60620805;
 //BA.debugLineNum = 60620805;BA.debugLine="Dim IDPrioridadVentas As Int=mData.Get(\"Prioridad";
_idprioridadventas = (int)(BA.ObjectToNumber(_mdata.Get((Object)("PrioridadVentas"))));
RDebugUtils.currentLine=60620808;
 //BA.debugLineNum = 60620808;BA.debugLine="Dim offset_before_dialog As Float= JamTableCLV1.s";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=60620810;
 //BA.debugLineNum = 60620810;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_indexsel);
RDebugUtils.currentLine=60620812;
 //BA.debugLineNum = 60620812;BA.debugLine="Dim FechaActual As Long=mData.Get(\"FechaRequerida";
_fechaactual = BA.ObjectToLongNumber(_mdata.Get((Object)("FechaRequeridaVentas")));
RDebugUtils.currentLine=60620813;
 //BA.debugLineNum = 60620813;BA.debugLine="If FechaActual>0 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_fechaactual>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60620814;
 //BA.debugLineNum = 60620814;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=60620815;
 //BA.debugLineNum = 60620815;BA.debugLine="DateTime.DateFormat=\"dd/MM/yy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yy");
RDebugUtils.currentLine=60620816;
 //BA.debugLineNum = 60620816;BA.debugLine="Dim sFechaActual As String=DateTime.Date(FechaAc";
_sfechaactual = parent.__c.DateTime.Date(_fechaactual);
RDebugUtils.currentLine=60620817;
 //BA.debugLineNum = 60620817;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=60620829;
 //BA.debugLineNum = 60620829;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Ya hay una";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Ya hay una fecha Requerida Ventas grabada para la OSUB "+_osubsel+" ("+_sfechaactual+")."+parent.__c.CRLF+parent.__c.CRLF+"¿Editar la Fecha Requerida de Ventas?","Aviso","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=60620830;
 //BA.debugLineNum = 60620830;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), _msa);
this.state = 54;
return;
case 54:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=60620831;
 //BA.debugLineNum = 60620831;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=60620832;
 //BA.debugLineNum = 60620832;BA.debugLine="If rInt <>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 4:
//if
this.state = 9;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=60620835;
 //BA.debugLineNum = 60620835;BA.debugLine="Dialog.Title=\"Indica Fecha Requerida Ventas\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Requerida Ventas");
RDebugUtils.currentLine=60620837;
 //BA.debugLineNum = 60620837;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=60620838;
 //BA.debugLineNum = 60620838;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=60620839;
 //BA.debugLineNum = 60620839;BA.debugLine="If FechaActual>0 Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_fechaactual>0) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=60620840;
 //BA.debugLineNum = 60620840;BA.debugLine="B4XDateDlg.Date=FechaActual";
_b4xdatedlg._setdate /*long*/ (null,_fechaactual);
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60620842;
 //BA.debugLineNum = 60620842;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=60620845;
 //BA.debugLineNum = 60620845;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=60620846;
 //BA.debugLineNum = 60620846;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=60620847;
 //BA.debugLineNum = 60620847;BA.debugLine="If FechaActual>0 Then";
if (true) break;

case 17:
//if
this.state = 22;
if (_fechaactual>0) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=60620848;
 //BA.debugLineNum = 60620848;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)("Borrar"),(Object)("Cancelar"));
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=60620850;
 //BA.debugLineNum = 60620850;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4X";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=60620855;
 //BA.debugLineNum = 60620855;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=60620856;
 //BA.debugLineNum = 60620856;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=60620857;
 //BA.debugLineNum = 60620857;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=60620858;
 //BA.debugLineNum = 60620858;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=60620859;
 //BA.debugLineNum = 60620859;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), _rsub);
this.state = 55;
return;
case 55:
//C
this.state = 23;
_rint = (int) result[1];
;
RDebugUtils.currentLine=60620860;
 //BA.debugLineNum = 60620860;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=60620861;
 //BA.debugLineNum = 60620861;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then";
if (true) break;

case 23:
//if
this.state = 26;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=60620867;
 //BA.debugLineNum = 60620867;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha sele";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha seleccionado fecha."+parent.__c.CRLF,"Aviso");
RDebugUtils.currentLine=60620868;
 //BA.debugLineNum = 60620868;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), _msa);
this.state = 56;
return;
case 56:
//C
this.state = 26;
;
RDebugUtils.currentLine=60620870;
 //BA.debugLineNum = 60620870;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=60620872;
 //BA.debugLineNum = 60620872;BA.debugLine="If rInt=xui.DialogResponse_Negative Then";

case 26:
//if
this.state = 31;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=60620873;
 //BA.debugLineNum = 60620873;BA.debugLine="Dim FechaRequeridaVentas As Long=0";
_fecharequeridaventas = (long) (0);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=60620875;
 //BA.debugLineNum = 60620875;BA.debugLine="Dim FechaRequeridaVentas As Long=B4XDateDlg.Date";
_fecharequeridaventas = _b4xdatedlg._getdate /*long*/ (null);
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=60620879;
 //BA.debugLineNum = 60620879;BA.debugLine="Wait For(ActualizarFechaGestionOrden(1,OSUBSel,Fe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), __ref._actualizarfechagestionorden /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (1),_osubsel,_fecharequeridaventas,(int) (0),parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ));
this.state = 57;
return;
case 57:
//C
this.state = 32;
_accion = (String) result[1];
;
RDebugUtils.currentLine=60620880;
 //BA.debugLineNum = 60620880;BA.debugLine="If Accion=\"OK\" Then";
if (true) break;

case 32:
//if
this.state = 53;
if ((_accion).equals("OK")) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=60620881;
 //BA.debugLineNum = 60620881;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigen";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set [FechaRequeridaVentas]=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_fecharequeridaventas)}));
RDebugUtils.currentLine=60620882;
 //BA.debugLineNum = 60620882;BA.debugLine="mData.put(\"FechaRequeridaVentas\", FechaRequerida";
_mdata.Put((Object)("FechaRequeridaVentas"),(Object)(_fecharequeridaventas));
RDebugUtils.currentLine=60620884;
 //BA.debugLineNum = 60620884;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
if (true) break;

case 35:
//for
this.state = 52;
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
group52 = _pnl.GetAllViewsRecursive();
index52 = 0;
groupLen52 = group52.getSize();
this.state = 58;
if (true) break;

case 58:
//C
this.state = 52;
if (index52 < groupLen52) {
this.state = 37;
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group52.Get(index52)));}
if (true) break;

case 59:
//C
this.state = 58;
index52++;
if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=60620885;
 //BA.debugLineNum = 60620885;BA.debugLine="If n.Tag=\"FechaRequeridaVentas\" Then";
if (true) break;

case 38:
//if
this.state = 51;
if ((_n.getTag()).equals((Object)("FechaRequeridaVentas"))) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=60620886;
 //BA.debugLineNum = 60620886;BA.debugLine="Dim B4xtF As B4XView=n";
_b4xtf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xtf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_n.getObject()));
RDebugUtils.currentLine=60620887;
 //BA.debugLineNum = 60620887;BA.debugLine="If FechaRequeridaVentas=0 Then";
if (true) break;

case 41:
//if
this.state = 50;
if (_fecharequeridaventas==0) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 50;
RDebugUtils.currentLine=60620888;
 //BA.debugLineNum = 60620888;BA.debugLine="B4xtF.Text=\"\"";
_b4xtf.setText("");
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=60620890;
 //BA.debugLineNum = 60620890;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateForm";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=60620891;
 //BA.debugLineNum = 60620891;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=60620892;
 //BA.debugLineNum = 60620892;BA.debugLine="B4xtF.Text=DateTime.Date(FechaRequeridaVentas";
_b4xtf.setText(parent.__c.DateTime.Date(_fecharequeridaventas));
RDebugUtils.currentLine=60620893;
 //BA.debugLineNum = 60620893;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,FechaRequ";
if (true) break;

case 46:
//if
this.state = 49;
if (parent._dateutils._issameday(parent.__c.DateTime.getNow(),_fecharequeridaventas)) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=60620894;
 //BA.debugLineNum = 60620894;BA.debugLine="B4xtF.TextColor=xui.Color_Red";
_b4xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=60620896;
 //BA.debugLineNum = 60620896;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=60620899;
 //BA.debugLineNum = 60620899;BA.debugLine="Exit";
this.state = 52;
if (true) break;
 if (true) break;

case 51:
//C
this.state = 59;
;
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=60620910;
 //BA.debugLineNum = 60620910;BA.debugLine="wait for(ActualizarTblPrioridadesPedidosFab(OSUB";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "editarfecharequeridaventas"), __ref._actualizartblprioridadespedidosfab /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_osubsel,_idprioridadventas,_fecharequeridaventas,parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ));
this.state = 60;
return;
case 60:
//C
this.state = 53;
_success = (boolean) result[1];
;
 if (true) break;

case 53:
//C
this.state = -1;
;
RDebugUtils.currentLine=60620917;
 //BA.debugLineNum = 60620917;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselprioridad_click(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "btnselprioridad_click", false))
	 {Debug.delegate(ba, "btnselprioridad_click", null); return;}
ResumableSub_btnSelPrioridad_Click rsub = new ResumableSub_btnSelPrioridad_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelPrioridad_Click extends BA.ResumableSub {
public ResumableSub_btnSelPrioridad_Click(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
String _docsel = "";
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mprioridad = null;
String _nombretipoprioridad = "";
float _offset_before_dialog = 0f;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _prioridadsel = 0;
String _nombreprioridadsel = "";
anywheresoftware.b4a.objects.collections.Map _mpr = null;
boolean _success = false;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf = null;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
int step39;
int limit39;
anywheresoftware.b4a.BA.IterableList group53;
int index53;
int groupLen53;
anywheresoftware.b4a.BA.IterableList group68;
int index68;
int groupLen68;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=59768835;
 //BA.debugLineNum = 59768835;BA.debugLine="Log(mData)";
parent.__c.LogImpl("859768835",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=59768836;
 //BA.debugLineNum = 59768836;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=59768838;
 //BA.debugLineNum = 59768838;BA.debugLine="Dim DocSel As String=mData.Get(\"OSUB\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("OSUB")));
RDebugUtils.currentLine=59768839;
 //BA.debugLineNum = 59768839;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Asignar Pr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Asignar Prioridad al documento "+_docsel+"?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=59768840;
 //BA.debugLineNum = 59768840;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=59768841;
 //BA.debugLineNum = 59768841;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=59768843;
 //BA.debugLineNum = 59768843;BA.debugLine="If PrimerAvisoInfoEstablecerPrioridad Then";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._primeravisoinfoestablecerprioridad /*boolean*/ ) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=59768844;
 //BA.debugLineNum = 59768844;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=False";
__ref._primeravisoinfoestablecerprioridad /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=59768845;
 //BA.debugLineNum = 59768845;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"A=Máxima prio";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"A=Máxima prioridad.","Información");
RDebugUtils.currentLine=59768846;
 //BA.debugLineNum = 59768846;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _msa);
this.state = 61;
return;
case 61:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=59768850;
 //BA.debugLineNum = 59768850;BA.debugLine="wait for(CargarTiposPrioridadesDocumentosNoGestio";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), __ref._cargartiposprioridadesdocumentosnogestionados /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 62;
return;
case 62:
//C
this.state = 11;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=59768851;
 //BA.debugLineNum = 59768851;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=59768852;
 //BA.debugLineNum = 59768852;BA.debugLine="If Accion<>\"OK\" Then Return";
if (true) break;

case 11:
//if
this.state = 16;
if ((_accion).equals("OK") == false) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) return ;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=59768853;
 //BA.debugLineNum = 59768853;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=59768854;
 //BA.debugLineNum = 59768854;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=59768855;
 //BA.debugLineNum = 59768855;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=59768859;
 //BA.debugLineNum = 59768859;BA.debugLine="For Each mPrioridad As Map In lstReg";
if (true) break;

case 17:
//for
this.state = 20;
_mprioridad = new anywheresoftware.b4a.objects.collections.Map();
group20 = _lstreg;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 63;
if (true) break;

case 63:
//C
this.state = 20;
if (index20 < groupLen20) {
this.state = 19;
_mprioridad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 64:
//C
this.state = 63;
index20++;
if (true) break;

case 19:
//C
this.state = 64;
RDebugUtils.currentLine=59768861;
 //BA.debugLineNum = 59768861;BA.debugLine="Dim NombreTipoPrioridad As String";
_nombretipoprioridad = "";
RDebugUtils.currentLine=59768865;
 //BA.debugLineNum = 59768865;BA.debugLine="NombreTipoPrioridad=Utilidades.FixNull(mPriorida";
_nombretipoprioridad = parent._utilidades._fixnull /*String*/ (_mprioridad.Get((Object)("TituloPrioridad")));
RDebugUtils.currentLine=59768868;
 //BA.debugLineNum = 59768868;BA.debugLine="lstOpciones.Add(NombreTipoPrioridad)";
_lstopciones.Add((Object)(_nombretipoprioridad));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=59768873;
 //BA.debugLineNum = 59768873;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=59768875;
 //BA.debugLineNum = 59768875;BA.debugLine="Dialog.Title=\"Selecciona Tipo de Prioridad\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Tipo de Prioridad");
RDebugUtils.currentLine=59768876;
 //BA.debugLineNum = 59768876;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=59768877;
 //BA.debugLineNum = 59768877;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=59768878;
 //BA.debugLineNum = 59768878;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=59768879;
 //BA.debugLineNum = 59768879;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=59768880;
 //BA.debugLineNum = 59768880;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=59768882;
 //BA.debugLineNum = 59768882;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=59768883;
 //BA.debugLineNum = 59768883;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=59768884;
 //BA.debugLineNum = 59768884;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=59768886;
 //BA.debugLineNum = 59768886;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=59768887;
 //BA.debugLineNum = 59768887;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=59768889;
 //BA.debugLineNum = 59768889;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=59768891;
 //BA.debugLineNum = 59768891;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=59768893;
 //BA.debugLineNum = 59768893;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 21:
//for
this.state = 24;
step39 = 1;
limit39 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 65;
if (true) break;

case 65:
//C
this.state = 24;
if ((step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39)) this.state = 23;
if (true) break;

case 66:
//C
this.state = 65;
_i = ((int)(0 + _i + step39)) ;
if (true) break;

case 23:
//C
this.state = 66;
RDebugUtils.currentLine=59768894;
 //BA.debugLineNum = 59768894;BA.debugLine="xclv.ResizeItem(i,(xclv.sv.Height/lstOpciones.si";
_xclv._resizeitem(_i,(int) ((_xclv._sv.getHeight()/(double)_lstopciones.getSize())-parent.__c.DipToCurrent((int) (4))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=59768897;
 //BA.debugLineNum = 59768897;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=59768898;
 //BA.debugLineNum = 59768898;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 25:
//if
this.state = 28;
if (_bcancel.IsInitialized()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=59768900;
 //BA.debugLineNum = 59768900;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=59768901;
 //BA.debugLineNum = 59768901;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=59768902;
 //BA.debugLineNum = 59768902;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=59768905;
 //BA.debugLineNum = 59768905;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _rsub);
this.state = 67;
return;
case 67:
//C
this.state = 29;
_rint = (int) result[1];
;
RDebugUtils.currentLine=59768907;
 //BA.debugLineNum = 59768907;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=59768908;
 //BA.debugLineNum = 59768908;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 29:
//if
this.state = 34;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
if (true) return ;
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=59768910;
 //BA.debugLineNum = 59768910;BA.debugLine="Dim PrioridadSel As Int=-1";
_prioridadsel = (int) (-1);
RDebugUtils.currentLine=59768911;
 //BA.debugLineNum = 59768911;BA.debugLine="Dim NombrePrioridadSel As String=B4XListDlg.Selec";
_nombreprioridadsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=59768913;
 //BA.debugLineNum = 59768913;BA.debugLine="For Each mPr As Map In lstReg";
if (true) break;

case 35:
//for
this.state = 42;
_mpr = new anywheresoftware.b4a.objects.collections.Map();
group53 = _lstreg;
index53 = 0;
groupLen53 = group53.getSize();
this.state = 68;
if (true) break;

case 68:
//C
this.state = 42;
if (index53 < groupLen53) {
this.state = 37;
_mpr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group53.Get(index53)));}
if (true) break;

case 69:
//C
this.state = 68;
index53++;
if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=59768914;
 //BA.debugLineNum = 59768914;BA.debugLine="Dim NombreTipoPrioridad As String=Utilidades.Fix";
_nombretipoprioridad = parent._utilidades._fixnull /*String*/ (_mpr.Get((Object)("TituloPrioridad")));
RDebugUtils.currentLine=59768915;
 //BA.debugLineNum = 59768915;BA.debugLine="If NombreTipoPrioridad=NombrePrioridadSel Then";
if (true) break;

case 38:
//if
this.state = 41;
if ((_nombretipoprioridad).equals(_nombreprioridadsel)) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=59768916;
 //BA.debugLineNum = 59768916;BA.debugLine="PrioridadSel=mPr.Get(\"Prioridad\")";
_prioridadsel = (int)(BA.ObjectToNumber(_mpr.Get((Object)("Prioridad"))));
RDebugUtils.currentLine=59768917;
 //BA.debugLineNum = 59768917;BA.debugLine="Exit";
this.state = 42;
if (true) break;
 if (true) break;

case 41:
//C
this.state = 69;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=59768921;
 //BA.debugLineNum = 59768921;BA.debugLine="If PrioridadSel=-1 Then";

case 42:
//if
this.state = 45;
if (_prioridadsel==-1) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=59768922;
 //BA.debugLineNum = 59768922;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar la prioridad para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=59768923;
 //BA.debugLineNum = 59768923;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), _msa);
this.state = 70;
return;
case 70:
//C
this.state = 45;
;
RDebugUtils.currentLine=59768924;
 //BA.debugLineNum = 59768924;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=59768927;
 //BA.debugLineNum = 59768927;BA.debugLine="Wait For(ActualizarPrioridadDocumento(PrioridadSe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "btnselprioridad_click"), __ref._actualizarprioridaddocumento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_prioridadsel,_docsel));
this.state = 71;
return;
case 71:
//C
this.state = 46;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=59768928;
 //BA.debugLineNum = 59768928;BA.debugLine="If Success=False Then Return";
if (true) break;

case 46:
//if
this.state = 51;
if (_success==parent.__c.False) { 
this.state = 48;
;}if (true) break;

case 48:
//C
this.state = 51;
if (true) return ;
if (true) break;

case 51:
//C
this.state = 52;
;
RDebugUtils.currentLine=59768930;
 //BA.debugLineNum = 59768930;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_indexsel);
RDebugUtils.currentLine=59768931;
 //BA.debugLineNum = 59768931;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
if (true) break;

case 52:
//for
this.state = 59;
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
group68 = _pnl.GetAllViewsRecursive();
index68 = 0;
groupLen68 = group68.getSize();
this.state = 72;
if (true) break;

case 72:
//C
this.state = 59;
if (index68 < groupLen68) {
this.state = 54;
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group68.Get(index68)));}
if (true) break;

case 73:
//C
this.state = 72;
index68++;
if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=59768932;
 //BA.debugLineNum = 59768932;BA.debugLine="If n.Tag=\"Prioridad\" Then";
if (true) break;

case 55:
//if
this.state = 58;
if ((_n.getTag()).equals((Object)("Prioridad"))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=59768933;
 //BA.debugLineNum = 59768933;BA.debugLine="Dim tF As TextField=n";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_tf = (anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper(), (javafx.scene.control.TextField)(_n.getObject()));
RDebugUtils.currentLine=59768934;
 //BA.debugLineNum = 59768934;BA.debugLine="tF.Text=NombreTipoPrioridad";
_tf.setText(_nombretipoprioridad);
RDebugUtils.currentLine=59768935;
 //BA.debugLineNum = 59768935;BA.debugLine="Exit";
this.state = 59;
if (true) break;
 if (true) break;

case 58:
//C
this.state = 73;
;
 if (true) break;
if (true) break;

case 59:
//C
this.state = -1;
;
RDebugUtils.currentLine=59768938;
 //BA.debugLineNum = 59768938;BA.debugLine="mData.Put(\"Prioridad\",PrioridadSel)";
_mdata.Put((Object)("Prioridad"),(Object)(_prioridadsel));
RDebugUtils.currentLine=59768939;
 //BA.debugLineNum = 59768939;BA.debugLine="mData.Put(\"NombrePrioridad\",NombrePrioridadSel)";
_mdata.Put((Object)("NombrePrioridad"),(Object)(_nombreprioridadsel));
RDebugUtils.currentLine=59768940;
 //BA.debugLineNum = 59768940;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set PrioridadVentas=?, NombrePrioridadVentas=? where OSUB=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_prioridadsel),(Object)(_nombreprioridadsel),(Object)(_docsel)}));
RDebugUtils.currentLine=59768942;
 //BA.debugLineNum = 59768942;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargartiposprioridadesdocumentosnogestionados(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "cargartiposprioridadesdocumentosnogestionados", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargartiposprioridadesdocumentosnogestionados", null));}
ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados rsub = new ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados extends BA.ResumableSub {
public ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60424194;
 //BA.debugLineNum = 60424194;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=60424195;
 //BA.debugLineNum = 60424195;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60424196;
 //BA.debugLineNum = 60424196;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=60424198;
 //BA.debugLineNum = 60424198;BA.debugLine="Dim Comando As String=\"TiposPrioridadesDocumentos";
_comando = "TiposPrioridadesDocumentosNoGestionados";
RDebugUtils.currentLine=60424199;
 //BA.debugLineNum = 60424199;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=60424201;
 //BA.debugLineNum = 60424201;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "cargartiposprioridadesdocumentosnogestionados"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=60424203;
 //BA.debugLineNum = 60424203;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=60424204;
 //BA.debugLineNum = 60424204;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=60424205;
 //BA.debugLineNum = 60424205;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "cargartiposprioridadesdocumentosnogestionados"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=60424206;
 //BA.debugLineNum = 60424206;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=60424207;
 //BA.debugLineNum = 60424207;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60424210;
 //BA.debugLineNum = 60424210;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=60424211;
 //BA.debugLineNum = 60424211;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=60424212;
 //BA.debugLineNum = 60424212;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=60424213;
 //BA.debugLineNum = 60424213;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de tipos de prioridad para documentos no gestionados","Aviso");
RDebugUtils.currentLine=60424214;
 //BA.debugLineNum = 60424214;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "cargartiposprioridadesdocumentosnogestionados"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=60424216;
 //BA.debugLineNum = 60424216;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=60424217;
 //BA.debugLineNum = 60424217;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=60424218;
 //BA.debugLineNum = 60424218;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=60424219;
 //BA.debugLineNum = 60424219;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=60424222;
 //BA.debugLineNum = 60424222;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=60424223;
 //BA.debugLineNum = 60424223;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadocumentosalmacenmanual(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "cargadocumentosalmacenmanual", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadocumentosalmacenmanual", null));}
ResumableSub_CargaDocumentosAlmacenManual rsub = new ResumableSub_CargaDocumentosAlmacenManual(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDocumentosAlmacenManual extends BA.ResumableSub {
public ResumableSub_CargaDocumentosAlmacenManual(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60096513;
 //BA.debugLineNum = 60096513;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60096515;
 //BA.debugLineNum = 60096515;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=60096516;
 //BA.debugLineNum = 60096516;BA.debugLine="Dim Comando As String=\"DocumentosAlmacenManual\"";
_comando = "DocumentosAlmacenManual";
RDebugUtils.currentLine=60096517;
 //BA.debugLineNum = 60096517;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=60096519;
 //BA.debugLineNum = 60096519;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "cargadocumentosalmacenmanual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=60096521;
 //BA.debugLineNum = 60096521;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=60096522;
 //BA.debugLineNum = 60096522;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=60096523;
 //BA.debugLineNum = 60096523;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "cargadocumentosalmacenmanual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=60096524;
 //BA.debugLineNum = 60096524;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=60096525;
 //BA.debugLineNum = 60096525;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=60096528;
 //BA.debugLineNum = 60096528;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=60096529;
 //BA.debugLineNum = 60096529;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=60096530;
 //BA.debugLineNum = 60096530;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=60096532;
 //BA.debugLineNum = 60096532;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=60096533;
 //BA.debugLineNum = 60096533;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=60096534;
 //BA.debugLineNum = 60096534;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=60096535;
 //BA.debugLineNum = 60096535;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=60096538;
 //BA.debugLineNum = 60096538;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=60096539;
 //BA.debugLineNum = 60096539;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=58589191;
 //BA.debugLineNum = 58589191;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=58589196;
 //BA.debugLineNum = 58589196;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
_jamtableclv1 = new b4j.docU.jamtableclv();
RDebugUtils.currentLine=58589199;
 //BA.debugLineNum = 58589199;BA.debugLine="Private TimestampBatchFaseDocs As Long";
_timestampbatchfasedocs = 0L;
RDebugUtils.currentLine=58589200;
 //BA.debugLineNum = 58589200;BA.debugLine="Private UUIDSesion As String";
_uuidsesion = "";
RDebugUtils.currentLine=58589202;
 //BA.debugLineNum = 58589202;BA.debugLine="Private PrimerAvisoInfoEstablecerPrioridad As Boo";
_primeravisoinfoestablecerprioridad = false;
RDebugUtils.currentLine=58589203;
 //BA.debugLineNum = 58589203;BA.debugLine="Private btnFasesDoc As Button";
_btnfasesdoc = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=58589204;
 //BA.debugLineNum = 58589204;BA.debugLine="Private btnMostrarDocumentoEnNavision As Button";
_btnmostrardocumentoennavision = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=58589205;
 //BA.debugLineNum = 58589205;BA.debugLine="Private btnSelFechaRequerida As Button";
_btnselfecharequerida = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=58589206;
 //BA.debugLineNum = 58589206;BA.debugLine="Private btnSelPrioridad As Button";
_btnselprioridad = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=58589207;
 //BA.debugLineNum = 58589207;BA.debugLine="Private txtAreaFaseActual As TextField";
_txtareafaseactual = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589208;
 //BA.debugLineNum = 58589208;BA.debugLine="Private txtArticulo As TextField";
_txtarticulo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589209;
 //BA.debugLineNum = 58589209;BA.debugLine="Private txtDescripcion As TextField";
_txtdescripcion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589210;
 //BA.debugLineNum = 58589210;BA.debugLine="Private txtFaseActual As TextField";
_txtfaseactual = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589211;
 //BA.debugLineNum = 58589211;BA.debugLine="Private txtFechaFaseActual As TextField";
_txtfechafaseactual = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589212;
 //BA.debugLineNum = 58589212;BA.debugLine="Private txtFechaOF As TextField";
_txtfechaof = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589213;
 //BA.debugLineNum = 58589213;BA.debugLine="Private txtFechaRequerida As TextField";
_txtfecharequerida = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589214;
 //BA.debugLineNum = 58589214;BA.debugLine="Private txtFinalizaProducto As TextField";
_txtfinalizaproducto = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589215;
 //BA.debugLineNum = 58589215;BA.debugLine="Private txtInfoAdicionalFaseActual As TextField";
_txtinfoadicionalfaseactual = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589216;
 //BA.debugLineNum = 58589216;BA.debugLine="Private txtNombreProveedor As TextField";
_txtnombreproveedor = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589217;
 //BA.debugLineNum = 58589217;BA.debugLine="Private txtObservaciones As TextField";
_txtobservaciones = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589218;
 //BA.debugLineNum = 58589218;BA.debugLine="Private txtOSUB As TextField";
_txtosub = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589219;
 //BA.debugLineNum = 58589219;BA.debugLine="Private txtPrioridad As TextField";
_txtprioridad = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589220;
 //BA.debugLineNum = 58589220;BA.debugLine="Private txtProveedor As TextField";
_txtproveedor = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589221;
 //BA.debugLineNum = 58589221;BA.debugLine="Private txtQtyPte As TextField";
_txtqtypte = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589222;
 //BA.debugLineNum = 58589222;BA.debugLine="Private txtRequiereTransferenciaComponentes As Te";
_txtrequieretransferenciacomponentes = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589223;
 //BA.debugLineNum = 58589223;BA.debugLine="Private txtRuta As TextField";
_txtruta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589224;
 //BA.debugLineNum = 58589224;BA.debugLine="Private txtDiasAcumulados As TextField";
_txtdiasacumulados = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589226;
 //BA.debugLineNum = 58589226;BA.debugLine="Private FechaHoyHora0 As Long";
_fechahoyhora0 = 0L;
RDebugUtils.currentLine=58589227;
 //BA.debugLineNum = 58589227;BA.debugLine="Private txtCliente As TextField";
_txtcliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589228;
 //BA.debugLineNum = 58589228;BA.debugLine="Private txtNombreCliente As TextField";
_txtnombrecliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589229;
 //BA.debugLineNum = 58589229;BA.debugLine="Private txtNombreResponsableCuenta As TextField";
_txtnombreresponsablecuenta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=58589230;
 //BA.debugLineNum = 58589230;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblPedFabPtesNoCorteNoConf"}))));
RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=59179011;
 //BA.debugLineNum = 59179011;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblPedFabPtesNoCor";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblPedFabPtesNoCorteNoConf");
 };
RDebugUtils.currentLine=59179013;
 //BA.debugLineNum = 59179013;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=59179014;
 //BA.debugLineNum = 59179014;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=59179015;
 //BA.debugLineNum = 59179015;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblPedFabPtesNoCorteNoConf (");
RDebugUtils.currentLine=59179018;
 //BA.debugLineNum = 59179018;BA.debugLine="sbCrearTabla.Append(\"PedidoFab TEXT COLLATE NOCAS";
_sbcreartabla.Append("PedidoFab TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179019;
 //BA.debugLineNum = 59179019;BA.debugLine="sbCrearTabla.Append(\"FechaPedido INTEGER,\")";
_sbcreartabla.Append("FechaPedido INTEGER,");
RDebugUtils.currentLine=59179020;
 //BA.debugLineNum = 59179020;BA.debugLine="sbCrearTabla.Append(\"Proveedor TEXT COLLATE NOCAS";
_sbcreartabla.Append("Proveedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179021;
 //BA.debugLineNum = 59179021;BA.debugLine="sbCrearTabla.Append(\"NombreProveedor TEXT COLLATE";
_sbcreartabla.Append("NombreProveedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179022;
 //BA.debugLineNum = 59179022;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179023;
 //BA.debugLineNum = 59179023;BA.debugLine="sbCrearTabla.Append(\"Descripcion TEXT COLLATE NOC";
_sbcreartabla.Append("Descripcion TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179024;
 //BA.debugLineNum = 59179024;BA.debugLine="sbCrearTabla.Append(\"Talla TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Talla TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179025;
 //BA.debugLineNum = 59179025;BA.debugLine="sbCrearTabla.Append(\"RutaOF TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("RutaOF TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179026;
 //BA.debugLineNum = 59179026;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=59179027;
 //BA.debugLineNum = 59179027;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=59179028;
 //BA.debugLineNum = 59179028;BA.debugLine="sbCrearTabla.Append(\"ResponsableCuenta TEXT COLLA";
_sbcreartabla.Append("ResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=59179029;
 //BA.debugLineNum = 59179029;BA.debugLine="sbCrearTabla.Append(\"QtyRec REAL,\")";
_sbcreartabla.Append("QtyRec REAL,");
RDebugUtils.currentLine=59179030;
 //BA.debugLineNum = 59179030;BA.debugLine="sbCrearTabla.Append(\"QtyPte REAL,\")";
_sbcreartabla.Append("QtyPte REAL,");
RDebugUtils.currentLine=59179031;
 //BA.debugLineNum = 59179031;BA.debugLine="sbCrearTabla.Append(\"FechaRequerida REAL default";
_sbcreartabla.Append("FechaRequerida REAL default 0,");
RDebugUtils.currentLine=59179032;
 //BA.debugLineNum = 59179032;BA.debugLine="sbCrearTabla.Append(\"TransfComp INTEGER DEFAULT 0";
_sbcreartabla.Append("TransfComp INTEGER DEFAULT 0,");
RDebugUtils.currentLine=59179033;
 //BA.debugLineNum = 59179033;BA.debugLine="sbCrearTabla.Append(\"FinalizaProducto INTEGER DEF";
_sbcreartabla.Append("FinalizaProducto INTEGER DEFAULT 0)");
RDebugUtils.currentLine=59179034;
 //BA.debugLineNum = 59179034;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=59179036;
 //BA.debugLineNum = 59179036;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblOSUBsPendientesNoCorteNoConf"}))));
RDebugUtils.currentLine=59179037;
 //BA.debugLineNum = 59179037;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=59179038;
 //BA.debugLineNum = 59179038;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblOSUBsPendientes";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblOSUBsPendientesNoCorteNoConf");
 };
RDebugUtils.currentLine=59179040;
 //BA.debugLineNum = 59179040;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=59179041;
 //BA.debugLineNum = 59179041;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=59179042;
 //BA.debugLineNum = 59179042;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblOSUBsPendientesNoCorteNoConf (");
RDebugUtils.currentLine=59179045;
 //BA.debugLineNum = 59179045;BA.debugLine="sbCrearTabla.Append(\"OSUB TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("OSUB TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179046;
 //BA.debugLineNum = 59179046;BA.debugLine="sbCrearTabla.Append(\"FechaOSUB INTEGER,\")";
_sbcreartabla.Append("FechaOSUB INTEGER,");
RDebugUtils.currentLine=59179047;
 //BA.debugLineNum = 59179047;BA.debugLine="sbCrearTabla.Append(\"Proveedor TEXT COLLATE NOCAS";
_sbcreartabla.Append("Proveedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179048;
 //BA.debugLineNum = 59179048;BA.debugLine="sbCrearTabla.Append(\"NombreProveedor TEXT COLLATE";
_sbcreartabla.Append("NombreProveedor TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179049;
 //BA.debugLineNum = 59179049;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179050;
 //BA.debugLineNum = 59179050;BA.debugLine="sbCrearTabla.Append(\"Descripcion TEXT COLLATE NOC";
_sbcreartabla.Append("Descripcion TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179051;
 //BA.debugLineNum = 59179051;BA.debugLine="sbCrearTabla.Append(\"RutaOF TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("RutaOF TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=59179052;
 //BA.debugLineNum = 59179052;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=59179053;
 //BA.debugLineNum = 59179053;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=59179054;
 //BA.debugLineNum = 59179054;BA.debugLine="sbCrearTabla.Append(\"ResponsableCuenta TEXT COLLA";
_sbcreartabla.Append("ResponsableCuenta TEXT COLLATE NOCASE DEFAULT '',");
RDebugUtils.currentLine=59179055;
 //BA.debugLineNum = 59179055;BA.debugLine="sbCrearTabla.Append(\"QtyPte REAL,\")";
_sbcreartabla.Append("QtyPte REAL,");
RDebugUtils.currentLine=59179056;
 //BA.debugLineNum = 59179056;BA.debugLine="sbCrearTabla.Append(\"TransfComp INTEGER DEFAULT 0";
_sbcreartabla.Append("TransfComp INTEGER DEFAULT 0,");
RDebugUtils.currentLine=59179057;
 //BA.debugLineNum = 59179057;BA.debugLine="sbCrearTabla.Append(\"FinalizaProducto INTEGER DEF";
_sbcreartabla.Append("FinalizaProducto INTEGER DEFAULT 0,");
RDebugUtils.currentLine=59179058;
 //BA.debugLineNum = 59179058;BA.debugLine="sbCrearTabla.Append(\"PrioridadVentas INTEGER DEFA";
_sbcreartabla.Append("PrioridadVentas INTEGER DEFAULT 0,");
RDebugUtils.currentLine=59179059;
 //BA.debugLineNum = 59179059;BA.debugLine="sbCrearTabla.Append(\"NombrePrioridadVentas TEXT C";
_sbcreartabla.Append("NombrePrioridadVentas TEXT COLLATE NOCASE default 'Sin Prioridad',");
RDebugUtils.currentLine=59179060;
 //BA.debugLineNum = 59179060;BA.debugLine="sbCrearTabla.Append(\"FechaRequeridaVentas INTEGER";
_sbcreartabla.Append("FechaRequeridaVentas INTEGER DEFAULT 0,");
RDebugUtils.currentLine=59179061;
 //BA.debugLineNum = 59179061;BA.debugLine="sbCrearTabla.Append(\"IDFase INTEGER DEFAULT 0,\")";
_sbcreartabla.Append("IDFase INTEGER DEFAULT 0,");
RDebugUtils.currentLine=59179062;
 //BA.debugLineNum = 59179062;BA.debugLine="sbCrearTabla.Append(\"AreaFase TEXT COLLATE NOCASE";
_sbcreartabla.Append("AreaFase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=59179063;
 //BA.debugLineNum = 59179063;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT COLLATE NOCASE def";
_sbcreartabla.Append("Fase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=59179064;
 //BA.debugLineNum = 59179064;BA.debugLine="sbCrearTabla.Append(\"FechaFase INTEGER default 0,";
_sbcreartabla.Append("FechaFase INTEGER default 0,");
RDebugUtils.currentLine=59179065;
 //BA.debugLineNum = 59179065;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER default 0";
_sbcreartabla.Append("Gestionado INTEGER default 0,");
RDebugUtils.currentLine=59179066;
 //BA.debugLineNum = 59179066;BA.debugLine="sbCrearTabla.Append(\"IDResponsableFase INTEGER de";
_sbcreartabla.Append("IDResponsableFase INTEGER default 0,");
RDebugUtils.currentLine=59179067;
 //BA.debugLineNum = 59179067;BA.debugLine="sbCrearTabla.Append(\"ResponsableFase TEXT COLLATE";
_sbcreartabla.Append("ResponsableFase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=59179068;
 //BA.debugLineNum = 59179068;BA.debugLine="sbCrearTabla.Append(\"IDInfoAdicionalFase INTEGER";
_sbcreartabla.Append("IDInfoAdicionalFase INTEGER default 0,");
RDebugUtils.currentLine=59179069;
 //BA.debugLineNum = 59179069;BA.debugLine="sbCrearTabla.Append(\"InfoAdicionalFase TEXT COLLA";
_sbcreartabla.Append("InfoAdicionalFase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=59179070;
 //BA.debugLineNum = 59179070;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
_sbcreartabla.Append("Observaciones TEXT COLLATE NOCASE default '')");
RDebugUtils.currentLine=59179071;
 //BA.debugLineNum = 59179071;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=59179096;
 //BA.debugLineNum = 59179096;BA.debugLine="End Sub";
return "";
}
public String  _exceldatetostring(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,long _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "exceldatetostring", false))
	 {return ((String) Debug.delegate(ba, "exceldatetostring", new Object[] {_t}));}
long _excelunixdiff = 0L;
long _daysecs = 0L;
long _val = 0L;
RDebugUtils.currentLine=60817408;
 //BA.debugLineNum = 60817408;BA.debugLine="Public Sub ExcelDateToString(t As Long) As String";
RDebugUtils.currentLine=60817409;
 //BA.debugLineNum = 60817409;BA.debugLine="Dim ExcelUnixDiff As Long=25569             'days";
_excelunixdiff = (long) (25569);
RDebugUtils.currentLine=60817410;
 //BA.debugLineNum = 60817410;BA.debugLine="Dim  DaySecs As Long=86400             'number of";
_daysecs = (long) (86400);
RDebugUtils.currentLine=60817411;
 //BA.debugLineNum = 60817411;BA.debugLine="Dim val As Long";
_val = 0L;
RDebugUtils.currentLine=60817412;
 //BA.debugLineNum = 60817412;BA.debugLine="val=  (t - ExcelUnixDiff) * DaySecs";
_val = (long) ((_t-_excelunixdiff)*_daysecs);
RDebugUtils.currentLine=60817413;
 //BA.debugLineNum = 60817413;BA.debugLine="val=DateUtils.UnixTimeToTicks(val)";
_val = _dateutils._unixtimetoticks(_val);
RDebugUtils.currentLine=60817414;
 //BA.debugLineNum = 60817414;BA.debugLine="DateTime.DateFormat=\"dd-MMM-yyyy\"";
__c.DateTime.setDateFormat("dd-MMM-yyyy");
RDebugUtils.currentLine=60817415;
 //BA.debugLineNum = 60817415;BA.debugLine="Return(DateTime.Date(val))";
if (true) return (__c.DateTime.Date(_val));
RDebugUtils.currentLine=60817417;
 //BA.debugLineNum = 60817417;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="End Sub";
return "";
}
public String  _generaruuidv4(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "generaruuidv4", false))
	 {return ((String) Debug.delegate(ba, "generaruuidv4", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
int _c = 0;
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Sub GenerarUUIDv4 As String";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=59310083;
 //BA.debugLineNum = 59310083;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
RDebugUtils.currentLine=59310084;
 //BA.debugLineNum = 59310084;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=59310085;
 //BA.debugLineNum = 59310085;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=59310086;
 //BA.debugLineNum = 59310086;BA.debugLine="Dim c As Int = Rnd(0, 16)";
_c = __c.Rnd((int) (0),(int) (16));
RDebugUtils.currentLine=59310087;
 //BA.debugLineNum = 59310087;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
if (_c<10) { 
_c = (int) (_c+48);}
else {
_c = (int) (_c+55);};
RDebugUtils.currentLine=59310088;
 //BA.debugLineNum = 59310088;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
if (_sb.getLength()==19) { 
_c = __c.Asc(BA.ObjectToChar("8"));};
RDebugUtils.currentLine=59310089;
 //BA.debugLineNum = 59310089;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
if (_sb.getLength()==14) { 
_c = __c.Asc(BA.ObjectToChar("4"));};
RDebugUtils.currentLine=59310090;
 //BA.debugLineNum = 59310090;BA.debugLine="sb.Append(Chr(c))";
_sb.Append(BA.ObjectToString(__c.Chr(_c)));
 }
};
 }
};
RDebugUtils.currentLine=59310093;
 //BA.debugLineNum = 59310093;BA.debugLine="Return sb.ToString.ToLowerCase";
if (true) return _sb.ToString().toLowerCase();
RDebugUtils.currentLine=59310094;
 //BA.debugLineNum = 59310094;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_accionsalirjamtableclv(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "jamtableclv1_accionsalirjamtableclv", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_accionsalirjamtableclv", null));}
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemclick(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
__c.LogImpl("859441154","Datos Item seleccionado ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=59441155;
 //BA.debugLineNum = 59441155;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=59441156;
 //BA.debugLineNum = 59441156;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("859441156",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=59441158;
 //BA.debugLineNum = 59441158;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemlongclick(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemlongclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
__c.LogImpl("859506690","Datos Item seleccionado botón secundario ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=59506691;
 //BA.debugLineNum = 59506691;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=59506692;
 //BA.debugLineNum = 59506692;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("859506692",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=59506694;
 //BA.debugLineNum = 59506694;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_loadlayoutpanelitem(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,b4j.docU.jamtableclv._datositemindexclvjamtableclv _datositemindexclv) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "jamtableclv1_loadlayoutpanelitem", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_loadlayoutpanelitem", new Object[] {_datositemindexclv}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtfaseb = null;
String _dateformatant = "";
String _timeformatant = "";
anywheresoftware.b4a.objects.B4XViewWrapper _txtfechafaseb = null;
b4j.example.dateutils._period _perioddiasacum = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtinfoadfaseb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtobservacionesb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtfinalizaproductob = null;
double _qtypte = 0;
long _fechareqvtas = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _txtfecharequeridaventasb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xtf = null;
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="Dim mData As Map=DatosItemIndexCLV.Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_datositemindexclv.Value /*Object*/ ));
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="Dim Pnl As B4XView=DatosItemIndexCLV.Panel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _datositemindexclv.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=59375619;
 //BA.debugLineNum = 59375619;BA.debugLine="Pnl.LoadLayout(\"scrItemControlPedidosFabNoConfecc";
_pnl.LoadLayout("scrItemControlPedidosFabNoConfeccion2",ba);
RDebugUtils.currentLine=59375622;
 //BA.debugLineNum = 59375622;BA.debugLine="txtOSUB.Text=mData.Get(\"OSUB\")";
__ref._txtosub /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("OSUB"))));
RDebugUtils.currentLine=59375623;
 //BA.debugLineNum = 59375623;BA.debugLine="txtFaseActual.Text=mData.Getdefault(\"Fase\",\"\")";
__ref._txtfaseactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("Fase"),(Object)(""))));
RDebugUtils.currentLine=59375624;
 //BA.debugLineNum = 59375624;BA.debugLine="Dim txtfaseB As B4XView=txtFaseActual";
_txtfaseb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtfaseb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtfaseactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=59375625;
 //BA.debugLineNum = 59375625;BA.debugLine="txtfaseB.TextColor=0xFFB22222";
_txtfaseb.setTextColor(((int)0xffb22222));
RDebugUtils.currentLine=59375627;
 //BA.debugLineNum = 59375627;BA.debugLine="txtAreaFaseActual.Text=mData.get(\"AreaFase\")";
__ref._txtareafaseactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("AreaFase"))));
RDebugUtils.currentLine=59375629;
 //BA.debugLineNum = 59375629;BA.debugLine="txtRuta.Text=mData.Get(\"RutaOF\")";
__ref._txtruta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("RutaOF"))));
RDebugUtils.currentLine=59375631;
 //BA.debugLineNum = 59375631;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=59375632;
 //BA.debugLineNum = 59375632;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=59375633;
 //BA.debugLineNum = 59375633;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
_timeformatant = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=59375634;
 //BA.debugLineNum = 59375634;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=59375635;
 //BA.debugLineNum = 59375635;BA.debugLine="txtFechaOF.Text=DateTime.Date(mData.Get(\"FechaOSU";
__ref._txtfechaof /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaOSUB")))));
RDebugUtils.currentLine=59375636;
 //BA.debugLineNum = 59375636;BA.debugLine="If mData.Getdefault(\"FechaFase\",0)>0 Then";
if ((double)(BA.ObjectToNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0))))>0) { 
RDebugUtils.currentLine=59375637;
 //BA.debugLineNum = 59375637;BA.debugLine="txtFechaFaseActual.Text=DateTime.date(mData.Getd";
__ref._txtfechafaseactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0))))+" "+__c.DateTime.Time(BA.ObjectToLongNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0)))));
 };
RDebugUtils.currentLine=59375639;
 //BA.debugLineNum = 59375639;BA.debugLine="Dim txtFechaFaseB As B4XView=txtFechaFaseActual";
_txtfechafaseb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtfechafaseb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtfechafaseactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=59375640;
 //BA.debugLineNum = 59375640;BA.debugLine="txtFechaFaseB.TextColor=0xFFB22222";
_txtfechafaseb.setTextColor(((int)0xffb22222));
RDebugUtils.currentLine=59375641;
 //BA.debugLineNum = 59375641;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=59375642;
 //BA.debugLineNum = 59375642;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
__c.DateTime.setTimeFormat(_timeformatant);
RDebugUtils.currentLine=59375644;
 //BA.debugLineNum = 59375644;BA.debugLine="Dim PeriodDiasAcum As Period=DateUtils.PeriodBetw";
_perioddiasacum = _dateutils._periodbetweenindays(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaOSUB"))),__c.DateTime.getNow());
RDebugUtils.currentLine=59375645;
 //BA.debugLineNum = 59375645;BA.debugLine="txtDiasAcumulados.Text=PeriodDiasAcum.Days";
__ref._txtdiasacumulados /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_perioddiasacum.Days));
RDebugUtils.currentLine=59375647;
 //BA.debugLineNum = 59375647;BA.debugLine="txtInfoAdicionalFaseActual.Text=mData.Getdefault(";
__ref._txtinfoadicionalfaseactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("InfoAdicionalFase"),(Object)(""))));
RDebugUtils.currentLine=59375648;
 //BA.debugLineNum = 59375648;BA.debugLine="Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFas";
_txtinfoadfaseb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtinfoadfaseb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtinfoadicionalfaseactual /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=59375649;
 //BA.debugLineNum = 59375649;BA.debugLine="txtInfoAdfaseB.TextColor=0xFFB22222";
_txtinfoadfaseb.setTextColor(((int)0xffb22222));
RDebugUtils.currentLine=59375650;
 //BA.debugLineNum = 59375650;BA.debugLine="txtProveedor.Text=mData.Get(\"Proveedor\")";
__ref._txtproveedor /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Proveedor"))));
RDebugUtils.currentLine=59375651;
 //BA.debugLineNum = 59375651;BA.debugLine="txtNombreProveedor.Text=mData.Get(\"NombreProveedo";
__ref._txtnombreproveedor /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreProveedor"))));
RDebugUtils.currentLine=59375652;
 //BA.debugLineNum = 59375652;BA.debugLine="txtObservaciones.Text=mData.Getdefault(\"Observaci";
__ref._txtobservaciones /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("Observaciones"),(Object)(""))));
RDebugUtils.currentLine=59375653;
 //BA.debugLineNum = 59375653;BA.debugLine="Dim txtObservacionesB As B4XView=txtObservaciones";
_txtobservacionesb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtobservacionesb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtobservaciones /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=59375654;
 //BA.debugLineNum = 59375654;BA.debugLine="txtObservacionesB.TextColor=0xFFC71585";
_txtobservacionesb.setTextColor(((int)0xffc71585));
RDebugUtils.currentLine=59375655;
 //BA.debugLineNum = 59375655;BA.debugLine="txtArticulo.Text=mData.Get(\"Articulo\")";
__ref._txtarticulo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Articulo"))));
RDebugUtils.currentLine=59375656;
 //BA.debugLineNum = 59375656;BA.debugLine="txtDescripcion.Text=mData.Get(\"Descripcion\")";
__ref._txtdescripcion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Descripcion"))));
RDebugUtils.currentLine=59375664;
 //BA.debugLineNum = 59375664;BA.debugLine="If 0=mData.get(\"FinalizaProducto\") Then";
if (0==(double)(BA.ObjectToNumber(_mdata.Get((Object)("FinalizaProducto"))))) { 
RDebugUtils.currentLine=59375665;
 //BA.debugLineNum = 59375665;BA.debugLine="txtFinalizaProducto.Text=\"NO\"";
__ref._txtfinalizaproducto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("NO");
 }else {
RDebugUtils.currentLine=59375667;
 //BA.debugLineNum = 59375667;BA.debugLine="txtFinalizaProducto.Text=\"SI\"";
__ref._txtfinalizaproducto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("SI");
RDebugUtils.currentLine=59375668;
 //BA.debugLineNum = 59375668;BA.debugLine="Dim txtFinalizaProductoB As B4XView=txtFinalizaP";
_txtfinalizaproductob = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtfinalizaproductob = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtfinalizaproducto /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=59375669;
 //BA.debugLineNum = 59375669;BA.debugLine="txtFinalizaProductoB.Color=0xFF7FFF00";
_txtfinalizaproductob.setColor(((int)0xff7fff00));
 };
RDebugUtils.currentLine=59375672;
 //BA.debugLineNum = 59375672;BA.debugLine="If 0=mData.get(\"TransfComp\") Then";
if (0==(double)(BA.ObjectToNumber(_mdata.Get((Object)("TransfComp"))))) { 
RDebugUtils.currentLine=59375673;
 //BA.debugLineNum = 59375673;BA.debugLine="txtRequiereTransferenciaComponentes.Text=\"NO\"";
__ref._txtrequieretransferenciacomponentes /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("NO");
 }else {
RDebugUtils.currentLine=59375675;
 //BA.debugLineNum = 59375675;BA.debugLine="txtRequiereTransferenciaComponentes.Text=\"SI\"";
__ref._txtrequieretransferenciacomponentes /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("SI");
 };
RDebugUtils.currentLine=59375678;
 //BA.debugLineNum = 59375678;BA.debugLine="Dim QtyPte As Double=mData.Get(\"QtyPte\")";
_qtypte = (double)(BA.ObjectToNumber(_mdata.Get((Object)("QtyPte"))));
RDebugUtils.currentLine=59375679;
 //BA.debugLineNum = 59375679;BA.debugLine="txtQtyPte.Text=Utilidades.FormatoNumerico2(QtyPte";
__ref._txtqtypte /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_utilidades._formatonumerico2 /*String*/ (_qtypte,(int) (1),(int) (0),(int) (0),__c.True));
RDebugUtils.currentLine=59375681;
 //BA.debugLineNum = 59375681;BA.debugLine="Dim FechaReqVtas As Long=mData.Get(\"FechaRequerid";
_fechareqvtas = BA.ObjectToLongNumber(_mdata.Get((Object)("FechaRequeridaVentas")));
RDebugUtils.currentLine=59375682;
 //BA.debugLineNum = 59375682;BA.debugLine="If FechaReqVtas=0 Then";
if (_fechareqvtas==0) { 
RDebugUtils.currentLine=59375683;
 //BA.debugLineNum = 59375683;BA.debugLine="txtFechaRequerida.Text=\"\"";
__ref._txtfecharequerida /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText("");
 }else {
RDebugUtils.currentLine=59375685;
 //BA.debugLineNum = 59375685;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=59375686;
 //BA.debugLineNum = 59375686;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=59375687;
 //BA.debugLineNum = 59375687;BA.debugLine="txtFechaRequerida.Text=DateTime.Date(FechaReqVta";
__ref._txtfecharequerida /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(_fechareqvtas));
RDebugUtils.currentLine=59375688;
 //BA.debugLineNum = 59375688;BA.debugLine="If FechaHoyHora0>FechaReqVtas Then";
if (__ref._fechahoyhora0 /*long*/ >_fechareqvtas) { 
RDebugUtils.currentLine=59375689;
 //BA.debugLineNum = 59375689;BA.debugLine="Dim txtFechaRequeridaVentasB As B4XView=txtFech";
_txtfecharequeridaventasb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtfecharequeridaventasb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtfecharequerida /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=59375690;
 //BA.debugLineNum = 59375690;BA.debugLine="txtFechaRequeridaVentasB.TextColor=xui.Color_Re";
_txtfecharequeridaventasb.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=59375691;
 //BA.debugLineNum = 59375691;BA.debugLine="txtFechaRequeridaVentasB.Font=xui.CreateDefault";
_txtfecharequeridaventasb.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)));
 };
RDebugUtils.currentLine=59375700;
 //BA.debugLineNum = 59375700;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
 };
RDebugUtils.currentLine=59375703;
 //BA.debugLineNum = 59375703;BA.debugLine="txtCliente.Text=mData.Get(\"Cliente\")";
__ref._txtcliente /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Cliente"))));
RDebugUtils.currentLine=59375704;
 //BA.debugLineNum = 59375704;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
__ref._txtnombrecliente /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreCliente"))));
RDebugUtils.currentLine=59375705;
 //BA.debugLineNum = 59375705;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Respon";
__ref._txtnombreresponsablecuenta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("ResponsableCuenta"))));
RDebugUtils.currentLine=59375706;
 //BA.debugLineNum = 59375706;BA.debugLine="Dim B4xtF As B4XView=txtNombreResponsableCuenta";
_b4xtf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xtf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtnombreresponsablecuenta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=59375708;
 //BA.debugLineNum = 59375708;BA.debugLine="B4xtF.SetColorAndBorder(0xFFFFA500,1dip,0xFF69696";
_b4xtf.SetColorAndBorder(((int)0xffffa500),__c.DipToCurrent((int) (1)),((int)0xff696969),3);
RDebugUtils.currentLine=59375709;
 //BA.debugLineNum = 59375709;BA.debugLine="End Sub";
return "";
}
public void  _jamtableclv1_menubarmenuitem_action(b4j.docU.ccontrolosubspendientesnoconfeccion __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "jamtableclv1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableclv1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_JamTableCLV1_MenuBarMenuItem_Action rsub = new ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_JamTableCLV1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
String _tagmenuitem;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstdatoslineasseleccionadas = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 14;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","ResetearPrioridades","EjemploAccionLineasSeleccionadas","")) {
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
case 3: {
this.state = 13;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 14;
RDebugUtils.currentLine=59113475;
 //BA.debugLineNum = 59113475;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 14;
RDebugUtils.currentLine=59113479;
 //BA.debugLineNum = 59113479;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Función desh";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Función deshabilitada."+parent.__c.CRLF+parent.__c.CRLF+"Si es necesaria su utilización , avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=59113480;
 //BA.debugLineNum = 59113480;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 14;
;
RDebugUtils.currentLine=59113481;
 //BA.debugLineNum = 59113481;BA.debugLine="Return";
if (true) return ;
RDebugUtils.currentLine=59113483;
 //BA.debugLineNum = 59113483;BA.debugLine="ResetearPrioridades";
__ref._resetearprioridades /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=59113486;
 //BA.debugLineNum = 59113486;BA.debugLine="Dim lstDatosLineasSeleccionadas As List=JamTabl";
_lstdatoslineasseleccionadas = new anywheresoftware.b4a.objects.collections.List();
_lstdatoslineasseleccionadas = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getdatositemsseleccionados /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=59113487;
 //BA.debugLineNum = 59113487;BA.debugLine="For Each mData As Map In lstDatosLineasSeleccio";
if (true) break;

case 8:
//for
this.state = 11;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group11 = _lstdatoslineasseleccionadas;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 10;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group11.Get(index11)));}
if (true) break;

case 17:
//C
this.state = 16;
index11++;
if (true) break;

case 10:
//C
this.state = 17;
RDebugUtils.currentLine=59113488;
 //BA.debugLineNum = 59113488;BA.debugLine="LogColor(\"DatosLineaSeleccionada : \" & mData,";
parent.__c.LogImpl("859113488","DatosLineaSeleccionada : "+BA.ObjectToString(_mdata),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=59113492;
 //BA.debugLineNum = 59113492;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _resetearprioridades(b4j.docU.ccontrolosubspendientesnoconfeccion __ref) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";
if (Debug.shouldDelegate(ba, "resetearprioridades", false))
	 {Debug.delegate(ba, "resetearprioridades", null); return;}
ResumableSub_ResetearPrioridades rsub = new ResumableSub_ResetearPrioridades(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ResetearPrioridades extends BA.ResumableSub {
public ResumableSub_ResetearPrioridades(b4j.docU.ccontrolosubspendientesnoconfeccion parent,b4j.docU.ccontrolosubspendientesnoconfeccion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontrolosubspendientesnoconfeccion __ref;
b4j.docU.ccontrolosubspendientesnoconfeccion parent;
int _numdocsconprioridad = 0;
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontrolosubspendientesnoconfeccion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=60358657;
 //BA.debugLineNum = 60358657;BA.debugLine="Dim NumDocsConPrioridad As Int=Utilidades.FixNull";
_numdocsconprioridad = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblOSUBsPendientesNoCorteNoConf where Gestionado=? and Prioridad<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0),""}))));
RDebugUtils.currentLine=60358658;
 //BA.debugLineNum = 60358658;BA.debugLine="If NumDocsConPrioridad=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_numdocsconprioridad==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=60358659;
 //BA.debugLineNum = 60358659;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay ningun";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay ninguna OSUB con prioridad establecida.","Aviso");
RDebugUtils.currentLine=60358660;
 //BA.debugLineNum = 60358660;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=60358661;
 //BA.debugLineNum = 60358661;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=60358664;
 //BA.debugLineNum = 60358664;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear t";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear todas las prioridades de OSUBs establecidas?"+parent.__c.CRLF+parent.__c.CRLF+"Esta acción no es reversible.","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=60358665;
 //BA.debugLineNum = 60358665;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=60358666;
 //BA.debugLineNum = 60358666;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
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
RDebugUtils.currentLine=60358668;
 //BA.debugLineNum = 60358668;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=60358669;
 //BA.debugLineNum = 60358669;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=60358671;
 //BA.debugLineNum = 60358671;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"R";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("ResetearPrioridadesDocumentosNoGestionados",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=60358672;
 //BA.debugLineNum = 60358672;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=60358673;
 //BA.debugLineNum = 60358673;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=60358674;
 //BA.debugLineNum = 60358674;BA.debugLine="If Success=False Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_success==parent.__c.False) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=60358675;
 //BA.debugLineNum = 60358675;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible resetear las prioridades de las OSUBs.","Error");
RDebugUtils.currentLine=60358676;
 //BA.debugLineNum = 60358676;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=60358678;
 //BA.debugLineNum = 60358678;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se han resete";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Se han reseteado todas las prioridades de las OSUBs.","Aviso");
RDebugUtils.currentLine=60358679;
 //BA.debugLineNum = 60358679;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontrolosubspendientesnoconfeccion", "resetearprioridades"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=60358681;
 //BA.debugLineNum = 60358681;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=60358682;
 //BA.debugLineNum = 60358682;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}