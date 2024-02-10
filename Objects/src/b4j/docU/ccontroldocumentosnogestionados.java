package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class ccontroldocumentosnogestionados extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.ccontroldocumentosnogestionados", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.ccontroldocumentosnogestionados.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtalmacendocumento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtalmacenfisico = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtcliente = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdiasacum = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdocumento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechadocumento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechafase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechareferencia = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtinfoadicionalfase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombrecliente = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtobservaciones = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpersonalizado = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtprioridad = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtresponsablefase = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttipodocumento = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttotalimp = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txttotalqty = null;
public long _timestampbatchfasedocs = 0L;
public String _uuidsesion = "";
public long _fechainiciocontrol = 0L;
public String _sfechainiciocontrol = "";
public boolean _primeravisoinfoestablecerprioridad = false;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombreresponsablecuenta = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtnumeroalmacenesfisicos = null;
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
public String  _initialize(b4j.docU.ccontroldocumentosnogestionados __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=54329344;
 //BA.debugLineNum = 54329344;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=54329346;
 //BA.debugLineNum = 54329346;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4j.object.JavaObject _joclvdatosscrollpane = null;
boolean _rbool = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
String _sresp = "";
String _accion = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54394882;
 //BA.debugLineNum = 54394882;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=54394883;
 //BA.debugLineNum = 54394883;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=54394884;
 //BA.debugLineNum = 54394884;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=54394885;
 //BA.debugLineNum = 54394885;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=54394886;
 //BA.debugLineNum = 54394886;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=54394887;
 //BA.debugLineNum = 54394887;BA.debugLine="frm.RootPane.LoadLayout(\"scrControlDocumentosNoGe";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrControlDocumentosNoGestionados");
RDebugUtils.currentLine=54394888;
 //BA.debugLineNum = 54394888;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "show"),(int) (0));
this.state = 19;
return;
case 19:
//C
this.state = 1;
;
RDebugUtils.currentLine=54394890;
 //BA.debugLineNum = 54394890;BA.debugLine="Dim JOClvDatosScrollpane As JavaObject=JamTableCL";
_joclvdatosscrollpane = new anywheresoftware.b4j.object.JavaObject();
_joclvdatosscrollpane = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=54394891;
 //BA.debugLineNum = 54394891;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setHbarPolicy\",Ar";
_joclvdatosscrollpane.RunMethod("setHbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=54394892;
 //BA.debugLineNum = 54394892;BA.debugLine="JOClvDatosScrollpane.RunMethod(\"setVbarPolicy\",Ar";
_joclvdatosscrollpane.RunMethod("setVbarPolicy",new Object[]{(Object)("ALWAYS")});
RDebugUtils.currentLine=54394894;
 //BA.debugLineNum = 54394894;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Control Docum";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Control Documentos No Gestionados");
RDebugUtils.currentLine=54394896;
 //BA.debugLineNum = 54394896;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=54394898;
 //BA.debugLineNum = 54394898;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=True";
__ref._primeravisoinfoestablecerprioridad /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=54394900;
 //BA.debugLineNum = 54394900;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=54394902;
 //BA.debugLineNum = 54394902;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
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
RDebugUtils.currentLine=54394904;
 //BA.debugLineNum = 54394904;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=54394905;
 //BA.debugLineNum = 54394905;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=54394907;
 //BA.debugLineNum = 54394907;BA.debugLine="wait for(BorrarDatosFaseActualDocumentosBatchAnte";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "show"), __ref._borrardatosfaseactualdocumentosbatchanterioresmaquinausuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 20;
return;
case 20:
//C
this.state = 7;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=54394908;
 //BA.debugLineNum = 54394908;BA.debugLine="If rBool=False Then";
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
RDebugUtils.currentLine=54394909;
 //BA.debugLineNum = 54394909;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54394910;
 //BA.debugLineNum = 54394910;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=54394913;
 //BA.debugLineNum = 54394913;BA.debugLine="UUIDSesion=GenerarUUIDv4";
__ref._uuidsesion /*String*/  = __ref._generaruuidv4 /*String*/ (null);
RDebugUtils.currentLine=54394914;
 //BA.debugLineNum = 54394914;BA.debugLine="TimestampBatchFaseDocs=DateTime.Now";
__ref._timestampbatchfasedocs /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=54394924;
 //BA.debugLineNum = 54394924;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._configurartableclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaControlDocumentosNoGestionados2.json");
RDebugUtils.currentLine=54394925;
 //BA.debugLineNum = 54394925;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "show"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 11;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=54394926;
 //BA.debugLineNum = 54394926;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("854394926",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=54394927;
 //BA.debugLineNum = 54394927;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=54394928;
 //BA.debugLineNum = 54394928;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=54394929;
 //BA.debugLineNum = 54394929;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "show"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 14;
;
RDebugUtils.currentLine=54394930;
 //BA.debugLineNum = 54394930;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=54394931;
 //BA.debugLineNum = 54394931;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=54394934;
 //BA.debugLineNum = 54394934;BA.debugLine="JamTableCLV1.EstadoMenuItem(JamTableCLV1.MenuBarL";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._estadomenuitem /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=54394935;
 //BA.debugLineNum = 54394935;BA.debugLine="JamTableCLV1.AddMenuItemFontAwesomeToMenuInMenuBa";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Ver Fecha Inicio Control","VerFechaInicioControl",BA.ObjectToString(parent.__c.Chr(((int)0xf274))),__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=54394936;
 //BA.debugLineNum = 54394936;BA.debugLine="JamTableCLV1.AddMenuItemFontMaterialIconsToMenuIn";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._addmenuitemfontmaterialiconstomenuinmenubar /*String*/ (null,"Resetear Prioridades","ResetearPrioridades",BA.ObjectToString(parent.__c.Chr(((int)0xe16d))),__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=54394939;
 //BA.debugLineNum = 54394939;BA.debugLine="JamTableCLV1.AlturaItems=120dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaitems /*int*/ (null,parent.__c.DipToCurrent((int) (120)));
RDebugUtils.currentLine=54394941;
 //BA.debugLineNum = 54394941;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmodoseleccionitems /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._modoseleccionindividualtemp /*String*/ );
RDebugUtils.currentLine=54394943;
 //BA.debugLineNum = 54394943;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=4dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaseparadorpaneles /*float*/ (null,(float) (parent.__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=54394945;
 //BA.debugLineNum = 54394945;BA.debugLine="Wait For(CargarFechaInicioControl) complete (sRes";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "show"), __ref._cargarfechainiciocontrol /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 23;
return;
case 23:
//C
this.state = 15;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=54394946;
 //BA.debugLineNum = 54394946;BA.debugLine="Dim Accion As String=sResp";
_accion = _sresp;
RDebugUtils.currentLine=54394947;
 //BA.debugLineNum = 54394947;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 15:
//if
this.state = 18;
if ((_accion).equals("Salir")) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=54394948;
 //BA.debugLineNum = 54394948;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54394949;
 //BA.debugLineNum = 54394949;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=54394951;
 //BA.debugLineNum = 54394951;BA.debugLine="Log(\"FechaInicioControl: \" & FechaInicioControl &";
parent.__c.LogImpl("854394951","FechaInicioControl: "+BA.NumberToString(__ref._fechainiciocontrol /*long*/ )+"  , sFechaInicioControl: "+__ref._sfechainiciocontrol /*String*/ ,0);
RDebugUtils.currentLine=54394953;
 //BA.debugLineNum = 54394953;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=54394954;
 //BA.debugLineNum = 54394954;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _actualizarcolortfprioridad(b4j.docU.ccontroldocumentosnogestionados __ref,anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _tf,String _nombreprioridad) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "actualizarcolortfprioridad", false))
	 {return ((String) Debug.delegate(ba, "actualizarcolortfprioridad", new Object[] {_tf,_nombreprioridad}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xtf = null;
RDebugUtils.currentLine=55508992;
 //BA.debugLineNum = 55508992;BA.debugLine="Sub ActualizarColortFPrioridad(tF As TextField,Nom";
RDebugUtils.currentLine=55508993;
 //BA.debugLineNum = 55508993;BA.debugLine="Dim xtF As B4XView=tF";
_xtf = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xtf = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tf.getObject()));
RDebugUtils.currentLine=55508994;
 //BA.debugLineNum = 55508994;BA.debugLine="Select Case NombrePrioridad";
switch (BA.switchObjectToInt(_nombreprioridad,"A","B","C")) {
case 0: {
RDebugUtils.currentLine=55508996;
 //BA.debugLineNum = 55508996;BA.debugLine="xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize";
_xtf.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (_xtf.getTextSize())));
RDebugUtils.currentLine=55508997;
 //BA.debugLineNum = 55508997;BA.debugLine="xtF.Color=xui.Color_Red";
_xtf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=55508998;
 //BA.debugLineNum = 55508998;BA.debugLine="xtF.TextColor=xui.Color_White";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
 break; }
case 1: {
RDebugUtils.currentLine=55509000;
 //BA.debugLineNum = 55509000;BA.debugLine="xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize";
_xtf.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (_xtf.getTextSize())));
RDebugUtils.currentLine=55509001;
 //BA.debugLineNum = 55509001;BA.debugLine="xtF.Color=0xFFFFA500";
_xtf.setColor(((int)0xffffa500));
RDebugUtils.currentLine=55509002;
 //BA.debugLineNum = 55509002;BA.debugLine="xtF.TextColor=xui.Color_Black";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 break; }
case 2: {
RDebugUtils.currentLine=55509004;
 //BA.debugLineNum = 55509004;BA.debugLine="xtF.Font=xui.CreateDefaultBoldFont(xtF.TextSize";
_xtf.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (_xtf.getTextSize())));
RDebugUtils.currentLine=55509005;
 //BA.debugLineNum = 55509005;BA.debugLine="xtF.Color=xui.Color_Yellow";
_xtf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Yellow);
RDebugUtils.currentLine=55509006;
 //BA.debugLineNum = 55509006;BA.debugLine="xtF.TextColor=xui.Color_Black";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 break; }
default: {
RDebugUtils.currentLine=55509008;
 //BA.debugLineNum = 55509008;BA.debugLine="xtF.Font=xui.CreateDefaultFont(xtF.TextSize)";
_xtf.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (_xtf.getTextSize())));
RDebugUtils.currentLine=55509009;
 //BA.debugLineNum = 55509009;BA.debugLine="xtF.Color=xui.Color_White";
_xtf.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=55509010;
 //BA.debugLineNum = 55509010;BA.debugLine="xtF.TextColor=xui.Color_Black";
_xtf.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 break; }
}
;
RDebugUtils.currentLine=55509013;
 //BA.debugLineNum = 55509013;BA.debugLine="End Sub";
return "";
}
public void  _actualizardatos(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdacum = null;
b4j.example.dateutils._period _perioddiasacum = null;
int _diasacum = 0;
String _docdiasac = "";
Object _senderfilter = null;
boolean _success = false;
boolean _rbool = false;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _docalmf = "";
String _almf = "";
String _docprioridad = "";
int _prioridad = 0;
String _nombreprioridad = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;
int _numdocsvariosalmacenes = 0;
anywheresoftware.b4a.BA.IterableList group64;
int index64;
int groupLen64;
anywheresoftware.b4a.BA.IterableList group80;
int index80;
int groupLen80;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54460418;
 //BA.debugLineNum = 54460418;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460420;
 //BA.debugLineNum = 54460420;BA.debugLine="JamTableCLV1.Clear";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=54460422;
 //BA.debugLineNum = 54460422;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAlbVtaDepNavLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblAlbVtaDepNavLin");
RDebugUtils.currentLine=54460423;
 //BA.debugLineNum = 54460423;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDocumentosSinGe";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblDocumentosSinGestionar");
RDebugUtils.currentLine=54460428;
 //BA.debugLineNum = 54460428;BA.debugLine="Wait For(ActualizarDatosDocumentosNAV) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref._actualizardatosdocumentosnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 79;
return;
case 79:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=54460429;
 //BA.debugLineNum = 54460429;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=54460430;
 //BA.debugLineNum = 54460430;BA.debugLine="If Accion<>\"OK\" Then";
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
RDebugUtils.currentLine=54460431;
 //BA.debugLineNum = 54460431;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54460432;
 //BA.debugLineNum = 54460432;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=54460435;
 //BA.debugLineNum = 54460435;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460437;
 //BA.debugLineNum = 54460437;BA.debugLine="mSQL.ExecNonQuery(\"update tblAlbVtaDepNavLin set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("update tblAlbVtaDepNavLin set Importe=Qty*Precio*(100-Descuento)/100");
RDebugUtils.currentLine=54460438;
 //BA.debugLineNum = 54460438;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where AlmOrig=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("ADESA"),(Object)("0237")}));
RDebugUtils.currentLine=54460439;
 //BA.debugLineNum = 54460439;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where GRC like ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("PROTEC"),(Object)("ROPA%")}));
RDebugUtils.currentLine=54460445;
 //BA.debugLineNum = 54460445;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=54460446;
 //BA.debugLineNum = 54460446;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=54460447;
 //BA.debugLineNum = 54460447;BA.debugLine="sb.Append(\"insert into tblDocumentosSinGestionar";
_sb.Append("insert into tblDocumentosSinGestionar (FechaDocumento, TipoDocumento, Documento, Cliente, NombreCliente, AlmacenDocumento, AlmacenFisico, Pedido, ");
RDebugUtils.currentLine=54460448;
 //BA.debugLineNum = 54460448;BA.debugLine="sb.Append(\"Personalizado, Prioridad, NombrePriori";
_sb.Append("Personalizado, Prioridad, NombrePrioridad, Fase, FechaFase, ResponsableFase, InfoAdicionalFase, Observaciones, TotalQty, TotalImp,NombreResponsableCuenta)");
RDebugUtils.currentLine=54460449;
 //BA.debugLineNum = 54460449;BA.debugLine="sb.Append(\" Select Fecha As FechaDocumento, TipoD";
_sb.Append(" Select Fecha As FechaDocumento, TipoDoc As TipoDocumento, Documento, Cliente, NombreCliente, AlmOrig As AlmacenDocumento , Almacen As AlmacenFisico, Pedido,");
RDebugUtils.currentLine=54460450;
 //BA.debugLineNum = 54460450;BA.debugLine="sb.Append(\"'NO' As Personalizado, 0 as Prioridad,";
_sb.Append("'NO' As Personalizado, 0 as Prioridad, 'Sin Prioridad' as NombrePrioridad, '' as Fase, 0 as FechaFase, '' as ResponsableFase, '' as InfoAdicionalFase, '' as Observaciones,");
RDebugUtils.currentLine=54460451;
 //BA.debugLineNum = 54460451;BA.debugLine="sb.Append(\"sum (Qty) As TotalQty, sum (Importe) A";
_sb.Append("sum (Qty) As TotalQty, sum (Importe) As TotalImp, NombreResponsableCuenta");
RDebugUtils.currentLine=54460452;
 //BA.debugLineNum = 54460452;BA.debugLine="sb.Append(\" from tblAlbVtaDepNavLin group by Fech";
_sb.Append(" from tblAlbVtaDepNavLin group by Fecha, TipoDoc, Documento, Cliente, NombreCliente, AlmOrig, Almacen, NombreResponsableCuenta");
RDebugUtils.currentLine=54460453;
 //BA.debugLineNum = 54460453;BA.debugLine="mSQL.ExecNonQuery(sb.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=54460455;
 //BA.debugLineNum = 54460455;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosSinGestionar set Personalizado=? where Documento in (Select DISTINCT Documento from tblAlbVtaDepNavLin where Personalizado=1)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI")}));
RDebugUtils.currentLine=54460457;
 //BA.debugLineNum = 54460457;BA.debugLine="Dim rsDAcum As ResultSet=mSQL.ExecQuery(\"select D";
_rsdacum = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdacum = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select Documento, FechaDocumento from tblDocumentosSinGestionar");
RDebugUtils.currentLine=54460458;
 //BA.debugLineNum = 54460458;BA.debugLine="Do While rsDAcum.NextRow";
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsdacum.NextRow()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
RDebugUtils.currentLine=54460459;
 //BA.debugLineNum = 54460459;BA.debugLine="Dim PeriodDiasAcum As Period=DateUtils.PeriodBet";
_perioddiasacum = parent._dateutils._periodbetweenindays(_rsdacum.GetLong("FechaDocumento"),parent.__c.DateTime.getNow());
RDebugUtils.currentLine=54460460;
 //BA.debugLineNum = 54460460;BA.debugLine="Dim DiasAcum As Int=PeriodDiasAcum.Days";
_diasacum = _perioddiasacum.Days;
RDebugUtils.currentLine=54460461;
 //BA.debugLineNum = 54460461;BA.debugLine="Dim DocDiasAc As String=rsDAcum.GetString(\"Docum";
_docdiasac = _rsdacum.GetString("Documento");
RDebugUtils.currentLine=54460462;
 //BA.debugLineNum = 54460462;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblDocumentosSin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblDocumentosSinGestionar set DiasAcumulados=? where Documento =?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_diasacum),(Object)(_docdiasac)}));
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=54460464;
 //BA.debugLineNum = 54460464;BA.debugLine="rsDAcum.Close";
_rsdacum.Close();
RDebugUtils.currentLine=54460465;
 //BA.debugLineNum = 54460465;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=54460466;
 //BA.debugLineNum = 54460466;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _senderfilter);
this.state = 80;
return;
case 80:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=54460467;
 //BA.debugLineNum = 54460467;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("854460467","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=54460469;
 //BA.debugLineNum = 54460469;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460470;
 //BA.debugLineNum = 54460470;BA.debugLine="wait for(BorrarDatosBatchAnterioresUUIDSesion) co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref._borrardatosbatchanterioresuuidsesion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 81;
return;
case 81:
//C
this.state = 9;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=54460471;
 //BA.debugLineNum = 54460471;BA.debugLine="If rBool=False Then";
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
RDebugUtils.currentLine=54460472;
 //BA.debugLineNum = 54460472;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54460473;
 //BA.debugLineNum = 54460473;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=54460475;
 //BA.debugLineNum = 54460475;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460476;
 //BA.debugLineNum = 54460476;BA.debugLine="wait for(InsertarLineasBatchDocumentos) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref._insertarlineasbatchdocumentos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 82;
return;
case 82:
//C
this.state = 13;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=54460477;
 //BA.debugLineNum = 54460477;BA.debugLine="If rBool=False Then";
if (true) break;

case 13:
//if
this.state = 16;
if (_rbool==parent.__c.False) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=54460478;
 //BA.debugLineNum = 54460478;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54460479;
 //BA.debugLineNum = 54460479;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=54460481;
 //BA.debugLineNum = 54460481;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460482;
 //BA.debugLineNum = 54460482;BA.debugLine="wait for(FaseActualDocumentosBacthUUID) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref._faseactualdocumentosbacthuuid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 83;
return;
case 83:
//C
this.state = 17;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=54460483;
 //BA.debugLineNum = 54460483;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=54460484;
 //BA.debugLineNum = 54460484;BA.debugLine="If Accion=\"Salir\" Then";
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
RDebugUtils.currentLine=54460485;
 //BA.debugLineNum = 54460485;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54460486;
 //BA.debugLineNum = 54460486;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=54460500;
 //BA.debugLineNum = 54460500;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460501;
 //BA.debugLineNum = 54460501;BA.debugLine="wait for(CargaDocumentosAlmacenManual) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref._cargadocumentosalmacenmanual /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 84;
return;
case 84:
//C
this.state = 21;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=54460502;
 //BA.debugLineNum = 54460502;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=54460503;
 //BA.debugLineNum = 54460503;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 21:
//if
this.state = 24;
if ((_accion).equals("Salir")) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=54460504;
 //BA.debugLineNum = 54460504;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54460505;
 //BA.debugLineNum = 54460505;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=54460507;
 //BA.debugLineNum = 54460507;BA.debugLine="If Accion=\"OK\" Then";

case 24:
//if
this.state = 31;
if ((_accion).equals("OK")) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=54460508;
 //BA.debugLineNum = 54460508;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=54460509;
 //BA.debugLineNum = 54460509;BA.debugLine="For Each m As Map In lstReg";
if (true) break;

case 27:
//for
this.state = 30;
_m = new anywheresoftware.b4a.objects.collections.Map();
group64 = _lstreg;
index64 = 0;
groupLen64 = group64.getSize();
this.state = 85;
if (true) break;

case 85:
//C
this.state = 30;
if (index64 < groupLen64) {
this.state = 29;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group64.Get(index64)));}
if (true) break;

case 86:
//C
this.state = 85;
index64++;
if (true) break;

case 29:
//C
this.state = 86;
RDebugUtils.currentLine=54460510;
 //BA.debugLineNum = 54460510;BA.debugLine="Dim DocAlmF As String=m.Get(\"Documento\")";
_docalmf = BA.ObjectToString(_m.Get((Object)("Documento")));
RDebugUtils.currentLine=54460511;
 //BA.debugLineNum = 54460511;BA.debugLine="Dim AlmF As String=m.Get(\"Almacen\")";
_almf = BA.ObjectToString(_m.Get((Object)("Almacen")));
RDebugUtils.currentLine=54460512;
 //BA.debugLineNum = 54460512;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGest";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosSinGestionar set AlmacenFisico=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_almf),(Object)(_docalmf)}));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=54460516;
 //BA.debugLineNum = 54460516;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460517;
 //BA.debugLineNum = 54460517;BA.debugLine="wait for(CargaPrioridadesDocumentos) complete (mR";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref._cargaprioridadesdocumentos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 87;
return;
case 87:
//C
this.state = 32;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=54460518;
 //BA.debugLineNum = 54460518;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=54460519;
 //BA.debugLineNum = 54460519;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 32:
//if
this.state = 35;
if ((_accion).equals("Salir")) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=54460520;
 //BA.debugLineNum = 54460520;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54460521;
 //BA.debugLineNum = 54460521;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=54460524;
 //BA.debugLineNum = 54460524;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460525;
 //BA.debugLineNum = 54460525;BA.debugLine="If Accion=\"OK\" Then";
if (true) break;

case 36:
//if
this.state = 43;
if ((_accion).equals("OK")) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=54460526;
 //BA.debugLineNum = 54460526;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=54460527;
 //BA.debugLineNum = 54460527;BA.debugLine="For Each m As Map In lstReg";
if (true) break;

case 39:
//for
this.state = 42;
_m = new anywheresoftware.b4a.objects.collections.Map();
group80 = _lstreg;
index80 = 0;
groupLen80 = group80.getSize();
this.state = 88;
if (true) break;

case 88:
//C
this.state = 42;
if (index80 < groupLen80) {
this.state = 41;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group80.Get(index80)));}
if (true) break;

case 89:
//C
this.state = 88;
index80++;
if (true) break;

case 41:
//C
this.state = 89;
RDebugUtils.currentLine=54460528;
 //BA.debugLineNum = 54460528;BA.debugLine="Dim DocPrioridad As String=m.Get(\"Documento\")";
_docprioridad = BA.ObjectToString(_m.Get((Object)("Documento")));
RDebugUtils.currentLine=54460529;
 //BA.debugLineNum = 54460529;BA.debugLine="Dim Prioridad As Int=m.Get(\"Prioridad\")";
_prioridad = (int)(BA.ObjectToNumber(_m.Get((Object)("Prioridad"))));
RDebugUtils.currentLine=54460530;
 //BA.debugLineNum = 54460530;BA.debugLine="Dim NombrePrioridad As String=m.Get(\"NombrePrio";
_nombreprioridad = BA.ObjectToString(_m.Get((Object)("NombrePrioridad")));
RDebugUtils.currentLine=54460531;
 //BA.debugLineNum = 54460531;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGest";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosSinGestionar set Prioridad=?, NombrePrioridad=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_prioridad),(Object)(_nombreprioridad),(Object)(_docprioridad)}));
 if (true) break;
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
RDebugUtils.currentLine=54460535;
 //BA.debugLineNum = 54460535;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosSinGestionar set Fase=? where Fase=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("NO INICIADO"),(Object)("")}));
RDebugUtils.currentLine=54460536;
 //BA.debugLineNum = 54460536;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosSinGestionar set NombreResponsableCuenta=? where TipoDocumento=? Or TipoDocumento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("N/A"),(Object)("CDEV"),(Object)("RTTrf")}));
RDebugUtils.currentLine=54460537;
 //BA.debugLineNum = 54460537;BA.debugLine="mSQL.ExecNonQuery($\"update tblDocumentosSinGestio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("update tblDocumentosSinGestionar set NumeroAlmacenesFisicos=tAux.NumAlmFis\n"+"		from (select Documento, count(AlmacenFisico) as NumAlmFis from tblDocumentosSinGestionar group by Documento) tAux\n"+"		where tblDocumentosSinGestionar.Documento=tAux.Documento"));
RDebugUtils.currentLine=54460540;
 //BA.debugLineNum = 54460540;BA.debugLine="mSQL.ExecNonQuery($\"update tblDocumentosSinGestio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("update tblDocumentosSinGestionar set VariosAlmacenesFisicos=case when NumeroAlmacenesFisicos>1 then 'SI' else 'NO' end"));
RDebugUtils.currentLine=54460542;
 //BA.debugLineNum = 54460542;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460543;
 //BA.debugLineNum = 54460543;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblDocumentosSinGestionar where Gestionado=0");
RDebugUtils.currentLine=54460544;
 //BA.debugLineNum = 54460544;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=54460545;
 //BA.debugLineNum = 54460545;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _rsub);
this.state = 90;
return;
case 90:
//C
this.state = 44;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=54460546;
 //BA.debugLineNum = 54460546;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=54460547;
 //BA.debugLineNum = 54460547;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 44:
//if
this.state = 64;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 46;
}if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=54460548;
 //BA.debugLineNum = 54460548;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 47:
//if
this.state = 54;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 49;
}if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=54460549;
 //BA.debugLineNum = 54460549;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460550;
 //BA.debugLineNum = 54460550;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=54460551;
 //BA.debugLineNum = 54460551;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 91;
return;
case 91:
//C
this.state = 50;
;
RDebugUtils.currentLine=54460553;
 //BA.debugLineNum = 54460553;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=54460554;
 //BA.debugLineNum = 54460554;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 92;
return;
case 92:
//C
this.state = 50;
_rint = (int) result[1];
;
RDebugUtils.currentLine=54460555;
 //BA.debugLineNum = 54460555;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 50:
//if
this.state = 53;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=54460556;
 //BA.debugLineNum = 54460556;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=54460557;
 //BA.debugLineNum = 54460557;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 53:
//C
this.state = 54;
;
RDebugUtils.currentLine=54460560;
 //BA.debugLineNum = 54460560;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=54460562;
 //BA.debugLineNum = 54460562;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 54:
//if
this.state = 63;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 56;
}if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=54460563;
 //BA.debugLineNum = 54460563;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460564;
 //BA.debugLineNum = 54460564;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 57:
//if
this.state = 62;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 59;
;}if (true) break;

case 59:
//C
this.state = 62;
if (true) return ;
if (true) break;

case 62:
//C
this.state = 63;
;
RDebugUtils.currentLine=54460565;
 //BA.debugLineNum = 54460565;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=54460566;
 //BA.debugLineNum = 54460566;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 93;
return;
case 93:
//C
this.state = 63;
;
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
RDebugUtils.currentLine=54460571;
 //BA.debugLineNum = 54460571;BA.debugLine="JamTableCLV1.SetMouseCursorWaitDeshabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursorwaitdeshabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460572;
 //BA.debugLineNum = 54460572;BA.debugLine="wait for(ActualizarFechaInicioControl) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), __ref._actualizarfechainiciocontrol /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 94;
return;
case 94:
//C
this.state = 65;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=54460574;
 //BA.debugLineNum = 54460574;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54460576;
 //BA.debugLineNum = 54460576;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Datos actualiz";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=54460577;
 //BA.debugLineNum = 54460577;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 95;
return;
case 95:
//C
this.state = 65;
;
RDebugUtils.currentLine=54460579;
 //BA.debugLineNum = 54460579;BA.debugLine="Dim NumDocsVariosAlmacenes As Int=mSQL.ExecQueryS";
_numdocsvariosalmacenes = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select count(*) from tblDocumentosSinGestionar where NumeroAlmacenesFisicos>1")));
RDebugUtils.currentLine=54460580;
 //BA.debugLineNum = 54460580;BA.debugLine="If NumDocsVariosAlmacenes>0 Then";
if (true) break;

case 65:
//if
this.state = 78;
if (_numdocsvariosalmacenes>0) { 
this.state = 67;
}if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=54460581;
 //BA.debugLineNum = 54460581;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",$\"Hay";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma",("Hay documentos con más de 1 almacén físico teórico asignado.\n"+"¿Filtrar la tabla por esos documentos?"),"Sí","","No",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 96;
return;
case 96:
//C
this.state = 68;
_rint = (int) result[1];
;
RDebugUtils.currentLine=54460583;
 //BA.debugLineNum = 54460583;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 68:
//if
this.state = 77;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=54460584;
 //BA.debugLineNum = 54460584;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.AddFiltro";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._addfiltrocampovalorinicial /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"VariosAlmacenesFisicos",(Object)("SI"));
RDebugUtils.currentLine=54460585;
 //BA.debugLineNum = 54460585;BA.debugLine="wait for(rSub) complete (Success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _rsub);
this.state = 97;
return;
case 97:
//C
this.state = 71;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=54460586;
 //BA.debugLineNum = 54460586;BA.debugLine="If Success Then";
if (true) break;

case 71:
//if
this.state = 76;
if (_success) { 
this.state = 73;
}else {
this.state = 75;
}if (true) break;

case 73:
//C
this.state = 76;
 if (true) break;

case 75:
//C
this.state = 76;
RDebugUtils.currentLine=54460589;
 //BA.debugLineNum = 54460589;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible añadir el filtro de varios almacenes","Error");
RDebugUtils.currentLine=54460590;
 //BA.debugLineNum = 54460590;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatos"), _msa);
this.state = 98;
return;
case 98:
//C
this.state = 76;
;
 if (true) break;

case 76:
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
this.state = -1;
;
RDebugUtils.currentLine=54460595;
 //BA.debugLineNum = 54460595;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosdocumentosnav(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "actualizardatosdocumentosnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosdocumentosnav", null));}
ResumableSub_ActualizarDatosDocumentosNAV rsub = new ResumableSub_ActualizarDatosDocumentosNAV(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosDocumentosNAV extends BA.ResumableSub {
public ResumableSub_ActualizarDatosDocumentosNAV(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _dateformatant = "";
String _sfechainiciocontrolnav = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54919169;
 //BA.debugLineNum = 54919169;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAlbVtaDepNavLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblAlbVtaDepNavLin");
RDebugUtils.currentLine=54919170;
 //BA.debugLineNum = 54919170;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=54919171;
 //BA.debugLineNum = 54919171;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=54919172;
 //BA.debugLineNum = 54919172;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=54919174;
 //BA.debugLineNum = 54919174;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=54919175;
 //BA.debugLineNum = 54919175;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=54919176;
 //BA.debugLineNum = 54919176;BA.debugLine="Dim sFechaInicioControlNAV As String=DateTime.Dat";
_sfechainiciocontrolnav = parent.__c.DateTime.Date(__ref._fechainiciocontrol /*long*/ );
RDebugUtils.currentLine=54919177;
 //BA.debugLineNum = 54919177;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=54919178;
 //BA.debugLineNum = 54919178;BA.debugLine="Dim Comando As String=\"InfoNavControlDocumentos\"";
_comando = "InfoNavControlDocumentos";
RDebugUtils.currentLine=54919179;
 //BA.debugLineNum = 54919179;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_sfechainiciocontrolnav)},parent);
RDebugUtils.currentLine=54919181;
 //BA.debugLineNum = 54919181;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatosdocumentosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=54919184;
 //BA.debugLineNum = 54919184;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=54919185;
 //BA.debugLineNum = 54919185;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54919186;
 //BA.debugLineNum = 54919186;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=54919187;
 //BA.debugLineNum = 54919187;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatosdocumentosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=54919188;
 //BA.debugLineNum = 54919188;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=54919189;
 //BA.debugLineNum = 54919189;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=54919192;
 //BA.debugLineNum = 54919192;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=54919193;
 //BA.debugLineNum = 54919193;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTabl";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=54919194;
 //BA.debugLineNum = 54919194;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=54919195;
 //BA.debugLineNum = 54919195;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=54919196;
 //BA.debugLineNum = 54919196;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Documentos no Gestionados.","Aviso");
RDebugUtils.currentLine=54919197;
 //BA.debugLineNum = 54919197;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizardatosdocumentosnav"), _msa);
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
RDebugUtils.currentLine=54919199;
 //BA.debugLineNum = 54919199;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=54919200;
 //BA.debugLineNum = 54919200;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=54919203;
 //BA.debugLineNum = 54919203;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=54919212;
 //BA.debugLineNum = 54919212;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblAlbVtaDepNavLin",_lstreg);
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
RDebugUtils.currentLine=54919215;
 //BA.debugLineNum = 54919215;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=54919216;
 //BA.debugLineNum = 54919216;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=54722560;
 //BA.debugLineNum = 54722560;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=54722561;
 //BA.debugLineNum = 54722561;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=54722562;
 //BA.debugLineNum = 54722562;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=54722563;
 //BA.debugLineNum = 54722563;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrardatosbatchanterioresuuidsesion(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "borrardatosbatchanterioresuuidsesion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrardatosbatchanterioresuuidsesion", null));}
ResumableSub_BorrarDatosBatchAnterioresUUIDSesion rsub = new ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarDatosBatchAnterioresUUIDSesion extends BA.ResumableSub {
public ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55705602;
 //BA.debugLineNum = 55705602;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55705603;
 //BA.debugLineNum = 55705603;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=55705604;
 //BA.debugLineNum = 55705604;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasFaseActualDocumentoBacthUUID",new Object[]{(Object)(__ref._uuidsesion /*String*/ )});
RDebugUtils.currentLine=55705605;
 //BA.debugLineNum = 55705605;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=55705606;
 //BA.debugLineNum = 55705606;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=55705607;
 //BA.debugLineNum = 55705607;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "borrardatosbatchanterioresuuidsesion"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=55705609;
 //BA.debugLineNum = 55705609;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=55705610;
 //BA.debugLineNum = 55705610;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=55705611;
 //BA.debugLineNum = 55705611;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthUUID","Error");
RDebugUtils.currentLine=55705612;
 //BA.debugLineNum = 55705612;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "borrardatosbatchanterioresuuidsesion"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=55705613;
 //BA.debugLineNum = 55705613;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=55705615;
 //BA.debugLineNum = 55705615;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=55705617;
 //BA.debugLineNum = 55705617;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _insertarlineasbatchdocumentos(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "insertarlineasbatchdocumentos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "insertarlineasbatchdocumentos", null));}
ResumableSub_InsertarLineasBatchDocumentos rsub = new ResumableSub_InsertarLineasBatchDocumentos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InsertarLineasBatchDocumentos extends BA.ResumableSub {
public ResumableSub_InsertarLineasBatchDocumentos(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55771137;
 //BA.debugLineNum = 55771137;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55771138;
 //BA.debugLineNum = 55771138;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=55771139;
 //BA.debugLineNum = 55771139;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select distin";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select distinct Documento from tblDocumentosSinGestionar");
RDebugUtils.currentLine=55771140;
 //BA.debugLineNum = 55771140;BA.debugLine="Do While rs.NextRow";
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
RDebugUtils.currentLine=55771141;
 //BA.debugLineNum = 55771141;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarLineaFaseActualDocumentoBatch",new Object[]{(Object)(__ref._timestampbatchfasedocs /*long*/ ),(Object)(__ref._uuidsesion /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ),(Object)(_rs.GetString("Documento"))});
RDebugUtils.currentLine=55771143;
 //BA.debugLineNum = 55771143;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=55771145;
 //BA.debugLineNum = 55771145;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=55771146;
 //BA.debugLineNum = 55771146;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=55771147;
 //BA.debugLineNum = 55771147;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "insertarlineasbatchdocumentos"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=55771149;
 //BA.debugLineNum = 55771149;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=55771150;
 //BA.debugLineNum = 55771150;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=55771151;
 //BA.debugLineNum = 55771151;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch","Error");
RDebugUtils.currentLine=55771152;
 //BA.debugLineNum = 55771152;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "insertarlineasbatchdocumentos"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=55771153;
 //BA.debugLineNum = 55771153;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=55771155;
 //BA.debugLineNum = 55771155;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=55771157;
 //BA.debugLineNum = 55771157;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _faseactualdocumentosbacthuuid(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "faseactualdocumentosbacthuuid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "faseactualdocumentosbacthuuid", null));}
ResumableSub_FaseActualDocumentosBacthUUID rsub = new ResumableSub_FaseActualDocumentosBacthUUID(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FaseActualDocumentosBacthUUID extends BA.ResumableSub {
public ResumableSub_FaseActualDocumentosBacthUUID(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55902209;
 //BA.debugLineNum = 55902209;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=55902212;
 //BA.debugLineNum = 55902212;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55902213;
 //BA.debugLineNum = 55902213;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=55902216;
 //BA.debugLineNum = 55902216;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"FaseActualDocumentosBacthUUID",new Object[]{(Object)(__ref._uuidsesion /*String*/ )},parent);
RDebugUtils.currentLine=55902218;
 //BA.debugLineNum = 55902218;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "faseactualdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=55902220;
 //BA.debugLineNum = 55902220;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=55902221;
 //BA.debugLineNum = 55902221;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=55902222;
 //BA.debugLineNum = 55902222;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query FaseActualDocumentosBacthUUID","Error");
RDebugUtils.currentLine=55902223;
 //BA.debugLineNum = 55902223;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "faseactualdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
RDebugUtils.currentLine=55902224;
 //BA.debugLineNum = 55902224;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=55902225;
 //BA.debugLineNum = 55902225;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=55902228;
 //BA.debugLineNum = 55902228;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=55902229;
 //BA.debugLineNum = 55902229;BA.debugLine="Accion=\"SinFaseActualDocumentos\"";
_accion = "SinFaseActualDocumentos";
RDebugUtils.currentLine=55902230;
 //BA.debugLineNum = 55902230;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=55902232;
 //BA.debugLineNum = 55902232;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=55902233;
 //BA.debugLineNum = 55902233;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=55902236;
 //BA.debugLineNum = 55902236;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=55902237;
 //BA.debugLineNum = 55902237;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=55902238;
 //BA.debugLineNum = 55902238;BA.debugLine="For Each m As Map In lstReg";
if (true) break;

case 11:
//for
this.state = 14;
_m = new anywheresoftware.b4a.objects.collections.Map();
group21 = _lstreg;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 14;
if (index21 < groupLen21) {
this.state = 13;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 24:
//C
this.state = 23;
index21++;
if (true) break;

case 13:
//C
this.state = 24;
RDebugUtils.currentLine=55902241;
 //BA.debugLineNum = 55902241;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblDocumentosS";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblDocumentosSinGestionar set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, Observaciones=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m.Get((Object)("Fase")),_m.Get((Object)("Gestionado")),_m.Get((Object)("FechaHoraMov")),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("ResponsableFase")))),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("InfoAdicionalFase")))),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("Obs")))),_m.Get((Object)("Documento"))}));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=55902244;
 //BA.debugLineNum = 55902244;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=55902245;
 //BA.debugLineNum = 55902245;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "faseactualdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=55902246;
 //BA.debugLineNum = 55902246;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("855902246","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=55902247;
 //BA.debugLineNum = 55902247;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=55902248;
 //BA.debugLineNum = 55902248;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=55902249;
 //BA.debugLineNum = 55902249;BA.debugLine="mRes.Put(\"Accion\", Accion)";
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
RDebugUtils.currentLine=55902253;
 //BA.debugLineNum = 55902253;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=55902254;
 //BA.debugLineNum = 55902254;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadocumentosalmacenmanual(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "cargadocumentosalmacenmanual", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadocumentosalmacenmanual", null));}
ResumableSub_CargaDocumentosAlmacenManual rsub = new ResumableSub_CargaDocumentosAlmacenManual(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDocumentosAlmacenManual extends BA.ResumableSub {
public ResumableSub_CargaDocumentosAlmacenManual(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55836673;
 //BA.debugLineNum = 55836673;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=55836674;
 //BA.debugLineNum = 55836674;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55836675;
 //BA.debugLineNum = 55836675;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=55836676;
 //BA.debugLineNum = 55836676;BA.debugLine="Dim Comando As String=\"DocumentosAlmacenManual\"";
_comando = "DocumentosAlmacenManual";
RDebugUtils.currentLine=55836677;
 //BA.debugLineNum = 55836677;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=55836679;
 //BA.debugLineNum = 55836679;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargadocumentosalmacenmanual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=55836681;
 //BA.debugLineNum = 55836681;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=55836682;
 //BA.debugLineNum = 55836682;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=55836683;
 //BA.debugLineNum = 55836683;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=55836684;
 //BA.debugLineNum = 55836684;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargadocumentosalmacenmanual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=55836685;
 //BA.debugLineNum = 55836685;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=55836686;
 //BA.debugLineNum = 55836686;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=55836689;
 //BA.debugLineNum = 55836689;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=55836690;
 //BA.debugLineNum = 55836690;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=55836691;
 //BA.debugLineNum = 55836691;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=55836693;
 //BA.debugLineNum = 55836693;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=55836694;
 //BA.debugLineNum = 55836694;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=55836695;
 //BA.debugLineNum = 55836695;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=55836696;
 //BA.debugLineNum = 55836696;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=55836699;
 //BA.debugLineNum = 55836699;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=55836700;
 //BA.debugLineNum = 55836700;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargaprioridadesdocumentos(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "cargaprioridadesdocumentos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargaprioridadesdocumentos", null));}
ResumableSub_CargaPrioridadesDocumentos rsub = new ResumableSub_CargaPrioridadesDocumentos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaPrioridadesDocumentos extends BA.ResumableSub {
public ResumableSub_CargaPrioridadesDocumentos(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56164355;
 //BA.debugLineNum = 56164355;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=56164356;
 //BA.debugLineNum = 56164356;BA.debugLine="Dim Comando As String=\"PrioridadesDocumentos\"";
_comando = "PrioridadesDocumentos";
RDebugUtils.currentLine=56164357;
 //BA.debugLineNum = 56164357;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=56164359;
 //BA.debugLineNum = 56164359;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargaprioridadesdocumentos"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56164360;
 //BA.debugLineNum = 56164360;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=56164361;
 //BA.debugLineNum = 56164361;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=56164362;
 //BA.debugLineNum = 56164362;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=56164363;
 //BA.debugLineNum = 56164363;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargaprioridadesdocumentos"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=56164364;
 //BA.debugLineNum = 56164364;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=56164365;
 //BA.debugLineNum = 56164365;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=56164368;
 //BA.debugLineNum = 56164368;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=56164369;
 //BA.debugLineNum = 56164369;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=56164370;
 //BA.debugLineNum = 56164370;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=56164372;
 //BA.debugLineNum = 56164372;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=56164373;
 //BA.debugLineNum = 56164373;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=56164374;
 //BA.debugLineNum = 56164374;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=56164375;
 //BA.debugLineNum = 56164375;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=56164378;
 //BA.debugLineNum = 56164378;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=56164379;
 //BA.debugLineNum = 56164379;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarfechainiciocontrol(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "actualizarfechainiciocontrol", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarfechainiciocontrol", null));}
ResumableSub_ActualizarFechaInicioControl rsub = new ResumableSub_ActualizarFechaInicioControl(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarFechaInicioControl extends BA.ResumableSub {
public ResumableSub_ActualizarFechaInicioControl(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
long _minfechadocnogestionado = 0L;
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
String _dateformatant = "";
String _sdatetimefechainiciocontrol = "";
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56098817;
 //BA.debugLineNum = 56098817;BA.debugLine="Dim MinFechaDocNoGestionado As Long=Utilidades.Fi";
_minfechadocnogestionado = parent._utilidades._fixnulllong /*long*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult("select min(FechaDocumento) from tblDocumentosSinGestionar where Gestionado=0")));
RDebugUtils.currentLine=56098818;
 //BA.debugLineNum = 56098818;BA.debugLine="If MinFechaDocNoGestionado=0 Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_minfechadocnogestionado==0) { 
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
RDebugUtils.currentLine=56098819;
 //BA.debugLineNum = 56098819;BA.debugLine="Log(DateTime.Date(MinFechaDocNoGestionado))";
parent.__c.LogImpl("856098819",parent.__c.DateTime.Date(_minfechadocnogestionado),0);
RDebugUtils.currentLine=56098821;
 //BA.debugLineNum = 56098821;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56098822;
 //BA.debugLineNum = 56098822;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=56098824;
 //BA.debugLineNum = 56098824;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=56098825;
 //BA.debugLineNum = 56098825;BA.debugLine="DateTime.DateFormat= \"yyyy-MM-dd HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=56098826;
 //BA.debugLineNum = 56098826;BA.debugLine="Dim sDateTimeFechaInicioControl As String=DateTim";
_sdatetimefechainiciocontrol = parent.__c.DateTime.Date(_minfechadocnogestionado);
RDebugUtils.currentLine=56098827;
 //BA.debugLineNum = 56098827;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=56098829;
 //BA.debugLineNum = 56098829;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("ActualizarFechaInicioControlDocumentosNoGestionados",new Object[]{(Object)(_sdatetimefechainiciocontrol)});
RDebugUtils.currentLine=56098830;
 //BA.debugLineNum = 56098830;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=56098831;
 //BA.debugLineNum = 56098831;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizarfechainiciocontrol"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=56098832;
 //BA.debugLineNum = 56098832;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTableC";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=56098833;
 //BA.debugLineNum = 56098833;BA.debugLine="If Success=False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_success==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=56098836;
 //BA.debugLineNum = 56098836;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=56098837;
 //BA.debugLineNum = 56098837;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=56098838;
 //BA.debugLineNum = 56098838;BA.debugLine="LogColor(\"No ha sido posible actualizar la fecha";
parent.__c.LogImpl("856098838","No ha sido posible actualizar la fecha de inicio del control a "+parent.__c.DateTime.Date(_minfechadocnogestionado),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=56098839;
 //BA.debugLineNum = 56098839;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=56098840;
 //BA.debugLineNum = 56098840;BA.debugLine="LogColor(\"Se mantiene en \" & sFechaInicioControl";
parent.__c.LogImpl("856098840","Se mantiene en "+__ref._sfechainiciocontrol /*String*/ +".",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=56098841;
 //BA.debugLineNum = 56098841;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=56098844;
 //BA.debugLineNum = 56098844;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=56098845;
 //BA.debugLineNum = 56098845;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarprioridaddocumento(b4j.docU.ccontroldocumentosnogestionados __ref,int _idtipoprioridad,String _docsel) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "actualizarprioridaddocumento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarprioridaddocumento", new Object[] {_idtipoprioridad,_docsel}));}
ResumableSub_ActualizarPrioridadDocumento rsub = new ResumableSub_ActualizarPrioridadDocumento(this,__ref,_idtipoprioridad,_docsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarPrioridadDocumento extends BA.ResumableSub {
public ResumableSub_ActualizarPrioridadDocumento(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref,int _idtipoprioridad,String _docsel) {
this.parent = parent;
this.__ref = __ref;
this._idtipoprioridad = _idtipoprioridad;
this._docsel = _docsel;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
int _idtipoprioridad;
String _docsel;
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56360963;
 //BA.debugLineNum = 56360963;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=56360965;
 //BA.debugLineNum = 56360965;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"A";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("ActualizarPrioridadDocumentoNoGestionado",new Object[]{(Object)(_docsel),(Object)(_idtipoprioridad),(Object)(_idtipoprioridad)});
RDebugUtils.currentLine=56360966;
 //BA.debugLineNum = 56360966;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=56360967;
 //BA.debugLineNum = 56360967;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizarprioridaddocumento"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=56360968;
 //BA.debugLineNum = 56360968;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=56360969;
 //BA.debugLineNum = 56360969;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar la prioridad para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=56360970;
 //BA.debugLineNum = 56360970;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "actualizarprioridaddocumento"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=56360971;
 //BA.debugLineNum = 56360971;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=56360974;
 //BA.debugLineNum = 56360974;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
RDebugUtils.currentLine=56360975;
 //BA.debugLineNum = 56360975;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrardatosfaseactualdocumentosbatchanterioresmaquinausuario(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario", null));}
ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario rsub = new ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario extends BA.ResumableSub {
public ResumableSub_BorrarDatosFaseActualDocumentosBatchAnterioresMaquinaUsuario(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55640066;
 //BA.debugLineNum = 55640066;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55640067;
 //BA.debugLineNum = 55640067;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=55640068;
 //BA.debugLineNum = 55640068;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario",new Object[]{(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ )});
RDebugUtils.currentLine=55640069;
 //BA.debugLineNum = 55640069;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=55640070;
 //BA.debugLineNum = 55640070;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=55640071;
 //BA.debugLineNum = 55640071;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=55640073;
 //BA.debugLineNum = 55640073;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=55640074;
 //BA.debugLineNum = 55640074;BA.debugLine="JamTableCLV1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmousecursordefaulthabilitartableclv /*String*/ (null);
RDebugUtils.currentLine=55640075;
 //BA.debugLineNum = 55640075;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthMaquinaUsuario","Error");
RDebugUtils.currentLine=55640076;
 //BA.debugLineNum = 55640076;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "borrardatosfaseactualdocumentosbatchanterioresmaquinausuario"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=55640077;
 //BA.debugLineNum = 55640077;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=55640079;
 //BA.debugLineNum = 55640079;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=55640081;
 //BA.debugLineNum = 55640081;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnactualizar_click(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "btnactualizar_click", false))
	 {return ((String) Debug.delegate(ba, "btnactualizar_click", null));}
RDebugUtils.currentLine=55246848;
 //BA.debugLineNum = 55246848;BA.debugLine="Private Sub btnActualizar_Click";
RDebugUtils.currentLine=55246849;
 //BA.debugLineNum = 55246849;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=55246850;
 //BA.debugLineNum = 55246850;BA.debugLine="End Sub";
return "";
}
public String  _btnejemplo_click(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "btnejemplo_click", false))
	 {return ((String) Debug.delegate(ba, "btnejemplo_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
RDebugUtils.currentLine=55312384;
 //BA.debugLineNum = 55312384;BA.debugLine="Private Sub btnEjemplo_Click";
RDebugUtils.currentLine=55312385;
 //BA.debugLineNum = 55312385;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=55312386;
 //BA.debugLineNum = 55312386;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=55312387;
 //BA.debugLineNum = 55312387;BA.debugLine="Log(mData)";
__c.LogImpl("855312387",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=55312388;
 //BA.debugLineNum = 55312388;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=55312389;
 //BA.debugLineNum = 55312389;BA.debugLine="End Sub";
return "";
}
public String  _btnfasesdoc_click(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "btnfasesdoc_click", false))
	 {return ((String) Debug.delegate(ba, "btnfasesdoc_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _docsel = "";
b4j.docU.cfasesdocumento _cfdoc = null;
RDebugUtils.currentLine=55574528;
 //BA.debugLineNum = 55574528;BA.debugLine="Private Sub btnFasesDoc_Click";
RDebugUtils.currentLine=55574529;
 //BA.debugLineNum = 55574529;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=55574530;
 //BA.debugLineNum = 55574530;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=55574531;
 //BA.debugLineNum = 55574531;BA.debugLine="Log(mData)";
__c.LogImpl("855574531",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=55574534;
 //BA.debugLineNum = 55574534;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=55574536;
 //BA.debugLineNum = 55574536;BA.debugLine="Dim cFDoc As cFasesDocumento";
_cfdoc = new b4j.docU.cfasesdocumento();
RDebugUtils.currentLine=55574537;
 //BA.debugLineNum = 55574537;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,DocSel)";
_cfdoc._initialize /*String*/ (null,ba,this,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),_docsel);
RDebugUtils.currentLine=55574538;
 //BA.debugLineNum = 55574538;BA.debugLine="cFDoc.Show";
_cfdoc._show /*void*/ (null);
RDebugUtils.currentLine=55574539;
 //BA.debugLineNum = 55574539;BA.debugLine="End Sub";
return "";
}
public void  _btnmostrardocumentoennavision_click(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "btnmostrardocumentoennavision_click", false))
	 {Debug.delegate(ba, "btnmostrardocumentoennavision_click", null); return;}
ResumableSub_btnMostrarDocumentoEnNavision_Click rsub = new ResumableSub_btnMostrarDocumentoEnNavision_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnMostrarDocumentoEnNavision_Click extends BA.ResumableSub {
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
String _docsel = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55967745;
 //BA.debugLineNum = 55967745;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=55967746;
 //BA.debugLineNum = 55967746;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=55967747;
 //BA.debugLineNum = 55967747;BA.debugLine="Log(mData)";
parent.__c.LogImpl("855967747",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=55967748;
 //BA.debugLineNum = 55967748;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=55967750;
 //BA.debugLineNum = 55967750;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=55967751;
 //BA.debugLineNum = 55967751;BA.debugLine="Select True";
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("CDEV"))) {
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
this.state = 8;
RDebugUtils.currentLine=55967753;
 //BA.debugLineNum = 55967753;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico Albaranes Venta",(int) (130),"No.",_docsel);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=55967755;
 //BA.debugLineNum = 55967755;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico recep. transferencia",(int) (5745),"No.",_docsel);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=55967757;
 //BA.debugLineNum = 55967757;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico envío devolución",(int) (6650),"No.",_docsel);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=55967763;
 //BA.debugLineNum = 55967763;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=55967765;
 //BA.debugLineNum = 55967765;BA.debugLine="If success Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_success) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=55967768;
 //BA.debugLineNum = 55967768;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir la ficha del documento "+_docsel+" en NAVISION.","Error");
RDebugUtils.currentLine=55967769;
 //BA.debugLineNum = 55967769;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnmostrardocumentoennavision_click"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=55967771;
 //BA.debugLineNum = 55967771;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=54657024;
 //BA.debugLineNum = 54657024;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=54657025;
 //BA.debugLineNum = 54657025;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54657026;
 //BA.debugLineNum = 54657026;BA.debugLine="End Sub";
return "";
}
public void  _btnselalmfisico_click(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "btnselalmfisico_click", false))
	 {Debug.delegate(ba, "btnselalmfisico_click", null); return;}
ResumableSub_btnSelAlmFisico_Click rsub = new ResumableSub_btnSelAlmFisico_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelAlmFisico_Click extends BA.ResumableSub {
public ResumableSub_btnSelAlmFisico_Click(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
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
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55377921;
 //BA.debugLineNum = 55377921;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=55377923;
 //BA.debugLineNum = 55377923;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=55377924;
 //BA.debugLineNum = 55377924;BA.debugLine="Log(mData)";
parent.__c.LogImpl("855377924",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=55377925;
 //BA.debugLineNum = 55377925;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=55377927;
 //BA.debugLineNum = 55377927;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=55377930;
 //BA.debugLineNum = 55377930;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=55377932;
 //BA.debugLineNum = 55377932;BA.debugLine="Dialog.Title=\"Selecciona Almacén Físico de Prepar";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Almacén Físico de Preparación");
RDebugUtils.currentLine=55377933;
 //BA.debugLineNum = 55377933;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=55377934;
 //BA.debugLineNum = 55377934;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=55377935;
 //BA.debugLineNum = 55377935;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=55377936;
 //BA.debugLineNum = 55377936;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=55377937;
 //BA.debugLineNum = 55377937;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=55377939;
 //BA.debugLineNum = 55377939;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=55377940;
 //BA.debugLineNum = 55377940;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=55377941;
 //BA.debugLineNum = 55377941;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=55377943;
 //BA.debugLineNum = 55377943;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=55377944;
 //BA.debugLineNum = 55377944;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=55377946;
 //BA.debugLineNum = 55377946;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
_lstopciones = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"PROIN","PROTEC","ADESA"});
RDebugUtils.currentLine=55377948;
 //BA.debugLineNum = 55377948;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=55377950;
 //BA.debugLineNum = 55377950;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=55377952;
 //BA.debugLineNum = 55377952;BA.debugLine="For i=0 To lstOpciones.size-1";
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
RDebugUtils.currentLine=55377953;
 //BA.debugLineNum = 55377953;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=55377957;
 //BA.debugLineNum = 55377957;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=55377958;
 //BA.debugLineNum = 55377958;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=55377960;
 //BA.debugLineNum = 55377960;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=55377961;
 //BA.debugLineNum = 55377961;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=55377962;
 //BA.debugLineNum = 55377962;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=55377965;
 //BA.debugLineNum = 55377965;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), _rsub);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=55377967;
 //BA.debugLineNum = 55377967;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=55377969;
 //BA.debugLineNum = 55377969;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=55377971;
 //BA.debugLineNum = 55377971;BA.debugLine="Dim AlmFis As String=B4XListDlg.SelectedItem";
_almfis = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=55377973;
 //BA.debugLineNum = 55377973;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55377974;
 //BA.debugLineNum = 55377974;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=55377976;
 //BA.debugLineNum = 55377976;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"B";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarDocumentoAlmacenManual",new Object[]{(Object)(_docsel)});
RDebugUtils.currentLine=55377977;
 //BA.debugLineNum = 55377977;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=55377978;
 //BA.debugLineNum = 55377978;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"I";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarDocumentoAlmacenManual",new Object[]{(Object)(_docsel),(Object)(_almfis)});
RDebugUtils.currentLine=55377979;
 //BA.debugLineNum = 55377979;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=55377980;
 //BA.debugLineNum = 55377980;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 26;
return;
case 26:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=55377981;
 //BA.debugLineNum = 55377981;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=55377982;
 //BA.debugLineNum = 55377982;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar el almacén físico para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=55377983;
 //BA.debugLineNum = 55377983;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 18;
;
RDebugUtils.currentLine=55377984;
 //BA.debugLineNum = 55377984;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=55377988;
 //BA.debugLineNum = 55377988;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set AlmacenFisico=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_almfis,_docsel}));
RDebugUtils.currentLine=55377989;
 //BA.debugLineNum = 55377989;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosSinGestio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosSinGestionar set AlmacenFisico=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_almfis,_docsel}));
RDebugUtils.currentLine=55378001;
 //BA.debugLineNum = 55378001;BA.debugLine="Dim mDataModif As Map";
_mdatamodif = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55378002;
 //BA.debugLineNum = 55378002;BA.debugLine="mDataModif.Initialize";
_mdatamodif.Initialize();
RDebugUtils.currentLine=55378003;
 //BA.debugLineNum = 55378003;BA.debugLine="mDataModif.Put(\"AlmacenFisico\",AlmFis)";
_mdatamodif.Put((Object)("AlmacenFisico"),(Object)(_almfis));
RDebugUtils.currentLine=55378004;
 //BA.debugLineNum = 55378004;BA.debugLine="wait for(JamTableCLV1.ActualizarValueItemCLV(Inde";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselalmfisico_click"), __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._actualizarvalueitemclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_indexsel,_mdatamodif));
this.state = 28;
return;
case 28:
//C
this.state = 19;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=55378005;
 //BA.debugLineNum = 55378005;BA.debugLine="If rBool=False Then";
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
RDebugUtils.currentLine=55378006;
 //BA.debugLineNum = 55378006;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=55378008;
 //BA.debugLineNum = 55378008;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselprioridad_click(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "btnselprioridad_click", false))
	 {Debug.delegate(ba, "btnselprioridad_click", null); return;}
ResumableSub_btnSelPrioridad_Click rsub = new ResumableSub_btnSelPrioridad_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelPrioridad_Click extends BA.ResumableSub {
public ResumableSub_btnSelPrioridad_Click(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
int _primerindexvisible = 0;
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
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
int step40;
int limit40;
anywheresoftware.b4a.BA.IterableList group54;
int index54;
int groupLen54;
anywheresoftware.b4a.BA.IterableList group69;
int index69;
int groupLen69;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=55443457;
 //BA.debugLineNum = 55443457;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=55443458;
 //BA.debugLineNum = 55443458;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=55443459;
 //BA.debugLineNum = 55443459;BA.debugLine="Log(mData)";
parent.__c.LogImpl("855443459",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=55443460;
 //BA.debugLineNum = 55443460;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=55443461;
 //BA.debugLineNum = 55443461;BA.debugLine="Dim PrimerIndexVisible As Int=JamTableCLV1.FirstV";
_primerindexvisible = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getfirstvisibleindex /*int*/ (null);
RDebugUtils.currentLine=55443463;
 //BA.debugLineNum = 55443463;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=55443464;
 //BA.debugLineNum = 55443464;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Asignar Pr";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Asignar Prioridad al documento "+_docsel+"?","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=55443465;
 //BA.debugLineNum = 55443465;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _msa);
this.state = 60;
return;
case 60:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=55443466;
 //BA.debugLineNum = 55443466;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=55443468;
 //BA.debugLineNum = 55443468;BA.debugLine="If PrimerAvisoInfoEstablecerPrioridad Then";
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
RDebugUtils.currentLine=55443469;
 //BA.debugLineNum = 55443469;BA.debugLine="PrimerAvisoInfoEstablecerPrioridad=False";
__ref._primeravisoinfoestablecerprioridad /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=55443470;
 //BA.debugLineNum = 55443470;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"A=Máxima prio";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"A=Máxima prioridad.","Información");
RDebugUtils.currentLine=55443471;
 //BA.debugLineNum = 55443471;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _msa);
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
RDebugUtils.currentLine=55443475;
 //BA.debugLineNum = 55443475;BA.debugLine="wait for(CargarTiposPrioridadesDocumentosNoGestio";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), __ref._cargartiposprioridadesdocumentosnogestionados /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 62;
return;
case 62:
//C
this.state = 11;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=55443476;
 //BA.debugLineNum = 55443476;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=55443477;
 //BA.debugLineNum = 55443477;BA.debugLine="If Accion<>\"OK\" Then Return";
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
RDebugUtils.currentLine=55443478;
 //BA.debugLineNum = 55443478;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55443479;
 //BA.debugLineNum = 55443479;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=55443480;
 //BA.debugLineNum = 55443480;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=55443484;
 //BA.debugLineNum = 55443484;BA.debugLine="For Each mPrioridad As Map In lstReg";
if (true) break;

case 17:
//for
this.state = 20;
_mprioridad = new anywheresoftware.b4a.objects.collections.Map();
group21 = _lstreg;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 63;
if (true) break;

case 63:
//C
this.state = 20;
if (index21 < groupLen21) {
this.state = 19;
_mprioridad = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 64:
//C
this.state = 63;
index21++;
if (true) break;

case 19:
//C
this.state = 64;
RDebugUtils.currentLine=55443486;
 //BA.debugLineNum = 55443486;BA.debugLine="Dim NombreTipoPrioridad As String";
_nombretipoprioridad = "";
RDebugUtils.currentLine=55443490;
 //BA.debugLineNum = 55443490;BA.debugLine="NombreTipoPrioridad=Utilidades.FixNull(mPriorid";
_nombretipoprioridad = parent._utilidades._fixnull /*String*/ (_mprioridad.Get((Object)("TituloPrioridad")));
RDebugUtils.currentLine=55443493;
 //BA.debugLineNum = 55443493;BA.debugLine="lstOpciones.Add(NombreTipoPrioridad)";
_lstopciones.Add((Object)(_nombretipoprioridad));
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=55443498;
 //BA.debugLineNum = 55443498;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=55443499;
 //BA.debugLineNum = 55443499;BA.debugLine="Dialog.Title=\"Selecciona Tipo de Prioridad\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Tipo de Prioridad");
RDebugUtils.currentLine=55443500;
 //BA.debugLineNum = 55443500;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=55443501;
 //BA.debugLineNum = 55443501;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=55443502;
 //BA.debugLineNum = 55443502;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=55443503;
 //BA.debugLineNum = 55443503;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=55443504;
 //BA.debugLineNum = 55443504;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=55443506;
 //BA.debugLineNum = 55443506;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=55443507;
 //BA.debugLineNum = 55443507;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=55443508;
 //BA.debugLineNum = 55443508;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=55443510;
 //BA.debugLineNum = 55443510;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=55443511;
 //BA.debugLineNum = 55443511;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=55443513;
 //BA.debugLineNum = 55443513;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=55443515;
 //BA.debugLineNum = 55443515;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=55443517;
 //BA.debugLineNum = 55443517;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 21:
//for
this.state = 24;
step40 = 1;
limit40 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 65;
if (true) break;

case 65:
//C
this.state = 24;
if ((step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40)) this.state = 23;
if (true) break;

case 66:
//C
this.state = 65;
_i = ((int)(0 + _i + step40)) ;
if (true) break;

case 23:
//C
this.state = 66;
RDebugUtils.currentLine=55443518;
 //BA.debugLineNum = 55443518;BA.debugLine="xclv.ResizeItem(i,(xclv.sv.Height/lstOpciones.si";
_xclv._resizeitem(_i,(int) ((_xclv._sv.getHeight()/(double)_lstopciones.getSize())-parent.__c.DipToCurrent((int) (4))));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=55443521;
 //BA.debugLineNum = 55443521;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=55443522;
 //BA.debugLineNum = 55443522;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=55443524;
 //BA.debugLineNum = 55443524;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=55443525;
 //BA.debugLineNum = 55443525;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=55443526;
 //BA.debugLineNum = 55443526;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=55443529;
 //BA.debugLineNum = 55443529;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _rsub);
this.state = 67;
return;
case 67:
//C
this.state = 29;
_rint = (int) result[1];
;
RDebugUtils.currentLine=55443531;
 //BA.debugLineNum = 55443531;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=55443535;
 //BA.debugLineNum = 55443535;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=55443539;
 //BA.debugLineNum = 55443539;BA.debugLine="Dim PrioridadSel As Int=-1";
_prioridadsel = (int) (-1);
RDebugUtils.currentLine=55443540;
 //BA.debugLineNum = 55443540;BA.debugLine="Dim NombrePrioridadSel As String=B4XListDlg.Selec";
_nombreprioridadsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=55443542;
 //BA.debugLineNum = 55443542;BA.debugLine="For Each mPr As Map In lstReg";
if (true) break;

case 35:
//for
this.state = 42;
_mpr = new anywheresoftware.b4a.objects.collections.Map();
group54 = _lstreg;
index54 = 0;
groupLen54 = group54.getSize();
this.state = 68;
if (true) break;

case 68:
//C
this.state = 42;
if (index54 < groupLen54) {
this.state = 37;
_mpr = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group54.Get(index54)));}
if (true) break;

case 69:
//C
this.state = 68;
index54++;
if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=55443543;
 //BA.debugLineNum = 55443543;BA.debugLine="Dim NombreTipoPrioridad As String=Utilidades.Fix";
_nombretipoprioridad = parent._utilidades._fixnull /*String*/ (_mpr.Get((Object)("TituloPrioridad")));
RDebugUtils.currentLine=55443544;
 //BA.debugLineNum = 55443544;BA.debugLine="If NombreTipoPrioridad=NombrePrioridadSel Then";
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
RDebugUtils.currentLine=55443545;
 //BA.debugLineNum = 55443545;BA.debugLine="PrioridadSel=mPr.Get(\"Prioridad\")";
_prioridadsel = (int)(BA.ObjectToNumber(_mpr.Get((Object)("Prioridad"))));
RDebugUtils.currentLine=55443546;
 //BA.debugLineNum = 55443546;BA.debugLine="Exit";
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
RDebugUtils.currentLine=55443549;
 //BA.debugLineNum = 55443549;BA.debugLine="If PrioridadSel=-1 Then";

case 42:
//if
this.state = 45;
if (_prioridadsel==-1) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=55443550;
 //BA.debugLineNum = 55443550;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar la prioridad para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=55443551;
 //BA.debugLineNum = 55443551;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), _msa);
this.state = 70;
return;
case 70:
//C
this.state = 45;
;
RDebugUtils.currentLine=55443552;
 //BA.debugLineNum = 55443552;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=55443555;
 //BA.debugLineNum = 55443555;BA.debugLine="Wait For(ActualizarPrioridadDocumento(PrioridadSe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "btnselprioridad_click"), __ref._actualizarprioridaddocumento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_prioridadsel,_docsel));
this.state = 71;
return;
case 71:
//C
this.state = 46;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=55443556;
 //BA.debugLineNum = 55443556;BA.debugLine="If Success=False Then Return";
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
RDebugUtils.currentLine=55443559;
 //BA.debugLineNum = 55443559;BA.debugLine="Dim pnl As B4XView=JamTableCLV1.GetPanel(IndexSel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_indexsel);
RDebugUtils.currentLine=55443560;
 //BA.debugLineNum = 55443560;BA.debugLine="For Each n As Node In pnl.GetAllViewsRecursive";
if (true) break;

case 52:
//for
this.state = 59;
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
group69 = _pnl.GetAllViewsRecursive();
index69 = 0;
groupLen69 = group69.getSize();
this.state = 72;
if (true) break;

case 72:
//C
this.state = 59;
if (index69 < groupLen69) {
this.state = 54;
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(group69.Get(index69)));}
if (true) break;

case 73:
//C
this.state = 72;
index69++;
if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=55443561;
 //BA.debugLineNum = 55443561;BA.debugLine="If n.Tag=\"Prioridad\" Then";
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
RDebugUtils.currentLine=55443562;
 //BA.debugLineNum = 55443562;BA.debugLine="Dim tF As TextField=n";
_tf = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
_tf = (anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper(), (javafx.scene.control.TextField)(_n.getObject()));
RDebugUtils.currentLine=55443563;
 //BA.debugLineNum = 55443563;BA.debugLine="tF.Text=NombreTipoPrioridad";
_tf.setText(_nombretipoprioridad);
RDebugUtils.currentLine=55443564;
 //BA.debugLineNum = 55443564;BA.debugLine="ActualizarColortFPrioridad(tF,NombreTipoPriorid";
__ref._actualizarcolortfprioridad /*String*/ (null,_tf,_nombretipoprioridad);
RDebugUtils.currentLine=55443565;
 //BA.debugLineNum = 55443565;BA.debugLine="Exit";
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
RDebugUtils.currentLine=55443568;
 //BA.debugLineNum = 55443568;BA.debugLine="mData.Put(\"Prioridad\",PrioridadSel)";
_mdata.Put((Object)("Prioridad"),(Object)(_prioridadsel));
RDebugUtils.currentLine=55443569;
 //BA.debugLineNum = 55443569;BA.debugLine="mData.Put(\"NombrePrioridad\",NombrePrioridadSel)";
_mdata.Put((Object)("NombrePrioridad"),(Object)(_nombreprioridadsel));
RDebugUtils.currentLine=55443570;
 //BA.debugLineNum = 55443570;BA.debugLine="JamTableCLV1.SQL.ExecNonQuery2(\"update tblOrigenD";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set Prioridad=?, NombrePrioridad=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_prioridadsel),(Object)(_nombreprioridadsel),(Object)(_docsel)}));
RDebugUtils.currentLine=55443572;
 //BA.debugLineNum = 55443572;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargartiposprioridadesdocumentosnogestionados(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "cargartiposprioridadesdocumentosnogestionados", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargartiposprioridadesdocumentosnogestionados", null));}
ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados rsub = new ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados extends BA.ResumableSub {
public ResumableSub_CargarTiposPrioridadesDocumentosNoGestionados(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=56295428;
 //BA.debugLineNum = 56295428;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=56295430;
 //BA.debugLineNum = 56295430;BA.debugLine="Dim Comando As String=\"TiposPrioridadesDocumentos";
_comando = "TiposPrioridadesDocumentosNoGestionados";
RDebugUtils.currentLine=56295431;
 //BA.debugLineNum = 56295431;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=56295433;
 //BA.debugLineNum = 56295433;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargartiposprioridadesdocumentosnogestionados"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56295435;
 //BA.debugLineNum = 56295435;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=56295436;
 //BA.debugLineNum = 56295436;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=56295437;
 //BA.debugLineNum = 56295437;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargartiposprioridadesdocumentosnogestionados"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=56295438;
 //BA.debugLineNum = 56295438;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=56295439;
 //BA.debugLineNum = 56295439;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=56295442;
 //BA.debugLineNum = 56295442;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=56295443;
 //BA.debugLineNum = 56295443;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=56295444;
 //BA.debugLineNum = 56295444;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=56295445;
 //BA.debugLineNum = 56295445;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de tipos de prioridad para documentos no gestionados","Aviso");
RDebugUtils.currentLine=56295446;
 //BA.debugLineNum = 56295446;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargartiposprioridadesdocumentosnogestionados"), _msa);
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
RDebugUtils.currentLine=56295448;
 //BA.debugLineNum = 56295448;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=56295449;
 //BA.debugLineNum = 56295449;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=56295450;
 //BA.debugLineNum = 56295450;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=56295451;
 //BA.debugLineNum = 56295451;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=56295454;
 //BA.debugLineNum = 56295454;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=56295455;
 //BA.debugLineNum = 56295455;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargarfechainiciocontrol(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "cargarfechainiciocontrol", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargarfechainiciocontrol", null));}
ResumableSub_CargarFechaInicioControl rsub = new ResumableSub_CargarFechaInicioControl(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargarFechaInicioControl extends BA.ResumableSub {
public ResumableSub_CargarFechaInicioControl(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
String _accion = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mfecha = null;
String _dateformatant = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56033281;
 //BA.debugLineNum = 56033281;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=56033285;
 //BA.debugLineNum = 56033285;BA.debugLine="Dim Comando As String=\"FechaInicioControlDocument";
_comando = "FechaInicioControlDocumentosNoGestionados";
RDebugUtils.currentLine=56033286;
 //BA.debugLineNum = 56033286;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=56033288;
 //BA.debugLineNum = 56033288;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargarfechainiciocontrol"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56033290;
 //BA.debugLineNum = 56033290;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=56033291;
 //BA.debugLineNum = 56033291;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=56033292;
 //BA.debugLineNum = 56033292;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargarfechainiciocontrol"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=56033293;
 //BA.debugLineNum = 56033293;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=56033297;
 //BA.debugLineNum = 56033297;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=56033298;
 //BA.debugLineNum = 56033298;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=56033300;
 //BA.debugLineNum = 56033300;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Fecha Inicio Control","Error");
RDebugUtils.currentLine=56033301;
 //BA.debugLineNum = 56033301;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "cargarfechainiciocontrol"), _msa);
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
RDebugUtils.currentLine=56033303;
 //BA.debugLineNum = 56033303;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=56033306;
 //BA.debugLineNum = 56033306;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=56033307;
 //BA.debugLineNum = 56033307;BA.debugLine="Dim mFecha As Map=lstReg.Get(0)";
_mfecha = new anywheresoftware.b4a.objects.collections.Map();
_mfecha = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=56033308;
 //BA.debugLineNum = 56033308;BA.debugLine="FechaInicioControl=mFecha.GetValueAt(0)";
__ref._fechainiciocontrol /*long*/  = BA.ObjectToLongNumber(_mfecha.GetValueAt((int) (0)));
RDebugUtils.currentLine=56033309;
 //BA.debugLineNum = 56033309;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=56033310;
 //BA.debugLineNum = 56033310;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=56033311;
 //BA.debugLineNum = 56033311;BA.debugLine="sFechaInicioControl=DateTime.Date(FechaInicioCo";
__ref._sfechainiciocontrol /*String*/  = parent.__c.DateTime.Date(__ref._fechainiciocontrol /*long*/ );
RDebugUtils.currentLine=56033312;
 //BA.debugLineNum = 56033312;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
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
RDebugUtils.currentLine=56033315;
 //BA.debugLineNum = 56033315;BA.debugLine="Return Accion";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_accion));return;};
RDebugUtils.currentLine=56033316;
 //BA.debugLineNum = 56033316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
RDebugUtils.currentLine=54263808;
 //BA.debugLineNum = 54263808;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=54263809;
 //BA.debugLineNum = 54263809;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=54263810;
 //BA.debugLineNum = 54263810;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=54263811;
 //BA.debugLineNum = 54263811;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=54263813;
 //BA.debugLineNum = 54263813;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=54263815;
 //BA.debugLineNum = 54263815;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=54263820;
 //BA.debugLineNum = 54263820;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
_jamtableclv1 = new b4j.docU.jamtableclv();
RDebugUtils.currentLine=54263821;
 //BA.debugLineNum = 54263821;BA.debugLine="Private txtAlmacenDocumento As TextField";
_txtalmacendocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263822;
 //BA.debugLineNum = 54263822;BA.debugLine="Private txtAlmacenFisico As TextField";
_txtalmacenfisico = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263823;
 //BA.debugLineNum = 54263823;BA.debugLine="Private txtCliente As TextField";
_txtcliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263824;
 //BA.debugLineNum = 54263824;BA.debugLine="Private txtDiasAcum As TextField";
_txtdiasacum = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263825;
 //BA.debugLineNum = 54263825;BA.debugLine="Private txtDocumento As TextField";
_txtdocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263826;
 //BA.debugLineNum = 54263826;BA.debugLine="Private txtFase As TextField";
_txtfase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263827;
 //BA.debugLineNum = 54263827;BA.debugLine="Private txtFechaDocumento As TextField";
_txtfechadocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263828;
 //BA.debugLineNum = 54263828;BA.debugLine="Private txtFechaFase As TextField";
_txtfechafase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263829;
 //BA.debugLineNum = 54263829;BA.debugLine="Private txtFechaReferencia As TextField";
_txtfechareferencia = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263830;
 //BA.debugLineNum = 54263830;BA.debugLine="Private txtInfoAdicionalFase As TextField";
_txtinfoadicionalfase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263831;
 //BA.debugLineNum = 54263831;BA.debugLine="Private txtNombreCliente As TextField";
_txtnombrecliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263832;
 //BA.debugLineNum = 54263832;BA.debugLine="Private txtObservaciones As TextField";
_txtobservaciones = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263833;
 //BA.debugLineNum = 54263833;BA.debugLine="Private txtPersonalizado As TextField";
_txtpersonalizado = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263834;
 //BA.debugLineNum = 54263834;BA.debugLine="Private txtPrioridad As TextField";
_txtprioridad = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263835;
 //BA.debugLineNum = 54263835;BA.debugLine="Private txtResponsableFase As TextField";
_txtresponsablefase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263836;
 //BA.debugLineNum = 54263836;BA.debugLine="Private txtTipoDocumento As TextField";
_txttipodocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263837;
 //BA.debugLineNum = 54263837;BA.debugLine="Private txtTotalImp As TextField";
_txttotalimp = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263838;
 //BA.debugLineNum = 54263838;BA.debugLine="Private txtTotalQty As TextField";
_txttotalqty = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263840;
 //BA.debugLineNum = 54263840;BA.debugLine="Private TimestampBatchFaseDocs As Long";
_timestampbatchfasedocs = 0L;
RDebugUtils.currentLine=54263841;
 //BA.debugLineNum = 54263841;BA.debugLine="Private UUIDSesion As String";
_uuidsesion = "";
RDebugUtils.currentLine=54263843;
 //BA.debugLineNum = 54263843;BA.debugLine="Private FechaInicioControl As Long";
_fechainiciocontrol = 0L;
RDebugUtils.currentLine=54263844;
 //BA.debugLineNum = 54263844;BA.debugLine="Private sFechaInicioControl As String";
_sfechainiciocontrol = "";
RDebugUtils.currentLine=54263846;
 //BA.debugLineNum = 54263846;BA.debugLine="Private PrimerAvisoInfoEstablecerPrioridad As Boo";
_primeravisoinfoestablecerprioridad = false;
RDebugUtils.currentLine=54263847;
 //BA.debugLineNum = 54263847;BA.debugLine="Private txtNombreResponsableCuenta As TextField";
_txtnombreresponsablecuenta = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=54263848;
 //BA.debugLineNum = 54263848;BA.debugLine="Private txtNumeroAlmacenesFisicos As B4XView";
_txtnumeroalmacenesfisicos = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=54263849;
 //BA.debugLineNum = 54263849;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=54853632;
 //BA.debugLineNum = 54853632;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=54853633;
 //BA.debugLineNum = 54853633;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblAlbVtaDepNavLin"}))));
RDebugUtils.currentLine=54853634;
 //BA.debugLineNum = 54853634;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=54853635;
 //BA.debugLineNum = 54853635;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAlbVtaDepNavLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblAlbVtaDepNavLin");
 };
RDebugUtils.currentLine=54853637;
 //BA.debugLineNum = 54853637;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=54853638;
 //BA.debugLineNum = 54853638;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=54853639;
 //BA.debugLineNum = 54853639;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblAlbVtaDepNavLin (");
RDebugUtils.currentLine=54853641;
 //BA.debugLineNum = 54853641;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
_sbcreartabla.Append("Fecha INTEGER,");
RDebugUtils.currentLine=54853642;
 //BA.debugLineNum = 54853642;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853643;
 //BA.debugLineNum = 54853643;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853644;
 //BA.debugLineNum = 54853644;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853645;
 //BA.debugLineNum = 54853645;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853646;
 //BA.debugLineNum = 54853646;BA.debugLine="sbCrearTabla.Append(\"GRC TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("GRC TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853647;
 //BA.debugLineNum = 54853647;BA.debugLine="sbCrearTabla.Append(\"AlmOrig TEXT COLLATE NOCASE,";
_sbcreartabla.Append("AlmOrig TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853648;
 //BA.debugLineNum = 54853648;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE";
_sbcreartabla.Append("Almacen TEXT COLLATE NOCASE default 'PROIN',");
RDebugUtils.currentLine=54853649;
 //BA.debugLineNum = 54853649;BA.debugLine="sbCrearTabla.Append(\"Qty REAL,\")";
_sbcreartabla.Append("Qty REAL,");
RDebugUtils.currentLine=54853650;
 //BA.debugLineNum = 54853650;BA.debugLine="sbCrearTabla.Append(\"Precio REAL,\")";
_sbcreartabla.Append("Precio REAL,");
RDebugUtils.currentLine=54853651;
 //BA.debugLineNum = 54853651;BA.debugLine="sbCrearTabla.Append(\"Descuento REAL,\")";
_sbcreartabla.Append("Descuento REAL,");
RDebugUtils.currentLine=54853652;
 //BA.debugLineNum = 54853652;BA.debugLine="sbCrearTabla.Append(\"Importe REAL default 0,\")";
_sbcreartabla.Append("Importe REAL default 0,");
RDebugUtils.currentLine=54853653;
 //BA.debugLineNum = 54853653;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
_sbcreartabla.Append("Personalizado INTEGER,");
RDebugUtils.currentLine=54853654;
 //BA.debugLineNum = 54853654;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("Pedido TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853655;
 //BA.debugLineNum = 54853655;BA.debugLine="sbCrearTabla.Append(\"FechaPedido TEXT COLLATE NOC";
_sbcreartabla.Append("FechaPedido TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853656;
 //BA.debugLineNum = 54853656;BA.debugLine="sbCrearTabla.Append(\"FechaProm INTEGER,\")";
_sbcreartabla.Append("FechaProm INTEGER,");
RDebugUtils.currentLine=54853657;
 //BA.debugLineNum = 54853657;BA.debugLine="sbCrearTabla.Append(\"FechaReq INTEGER,\")";
_sbcreartabla.Append("FechaReq INTEGER,");
RDebugUtils.currentLine=54853658;
 //BA.debugLineNum = 54853658;BA.debugLine="sbCrearTabla.Append(\"TipoDoc TEXT COLLATE NOCASE,";
_sbcreartabla.Append("TipoDoc TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853659;
 //BA.debugLineNum = 54853659;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '')");
RDebugUtils.currentLine=54853660;
 //BA.debugLineNum = 54853660;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=54853663;
 //BA.debugLineNum = 54853663;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblDocumentosSinGestionar"}))));
RDebugUtils.currentLine=54853664;
 //BA.debugLineNum = 54853664;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=54853665;
 //BA.debugLineNum = 54853665;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDocumentosSinGe";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblDocumentosSinGestionar");
 };
RDebugUtils.currentLine=54853667;
 //BA.debugLineNum = 54853667;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=54853668;
 //BA.debugLineNum = 54853668;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=54853669;
 //BA.debugLineNum = 54853669;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblDocumentosSinGestionar (");
RDebugUtils.currentLine=54853671;
 //BA.debugLineNum = 54853671;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
_sbcreartabla.Append("FechaDocumento INTEGER,");
RDebugUtils.currentLine=54853672;
 //BA.debugLineNum = 54853672;BA.debugLine="sbCrearTabla.Append(\"DiasAcumulados INTEGER defau";
_sbcreartabla.Append("DiasAcumulados INTEGER default 0,");
RDebugUtils.currentLine=54853673;
 //BA.debugLineNum = 54853673;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853674;
 //BA.debugLineNum = 54853674;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853675;
 //BA.debugLineNum = 54853675;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853676;
 //BA.debugLineNum = 54853676;BA.debugLine="sbCrearTabla.Append(\"AlmacenDocumento TEXT COLLAT";
_sbcreartabla.Append("AlmacenDocumento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853677;
 //BA.debugLineNum = 54853677;BA.debugLine="sbCrearTabla.Append(\"AlmacenFisico TEXT COLLATE N";
_sbcreartabla.Append("AlmacenFisico TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853678;
 //BA.debugLineNum = 54853678;BA.debugLine="sbCrearTabla.Append(\"NumeroAlmacenesFisicos INTEG";
_sbcreartabla.Append("NumeroAlmacenesFisicos INTEGER DEFAULT 1,");
RDebugUtils.currentLine=54853679;
 //BA.debugLineNum = 54853679;BA.debugLine="sbCrearTabla.Append(\"VariosAlmacenesFisicos TEXT";
_sbcreartabla.Append("VariosAlmacenesFisicos TEXT DEFAULT 'NO',");
RDebugUtils.currentLine=54853680;
 //BA.debugLineNum = 54853680;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("Pedido TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853681;
 //BA.debugLineNum = 54853681;BA.debugLine="sbCrearTabla.Append(\"TotalQty REAL,\")";
_sbcreartabla.Append("TotalQty REAL,");
RDebugUtils.currentLine=54853682;
 //BA.debugLineNum = 54853682;BA.debugLine="sbCrearTabla.Append(\"TotalImp REAL,\")";
_sbcreartabla.Append("TotalImp REAL,");
RDebugUtils.currentLine=54853683;
 //BA.debugLineNum = 54853683;BA.debugLine="sbCrearTabla.Append(\"Personalizado TEXT COLLATE N";
_sbcreartabla.Append("Personalizado TEXT COLLATE NOCASE default 'NO',");
RDebugUtils.currentLine=54853687;
 //BA.debugLineNum = 54853687;BA.debugLine="sbCrearTabla.Append(\"TipoDocumento TEXT COLLATE N";
_sbcreartabla.Append("TipoDocumento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=54853688;
 //BA.debugLineNum = 54853688;BA.debugLine="sbCrearTabla.Append(\"Prioridad Integer default 0,";
_sbcreartabla.Append("Prioridad Integer default 0,");
RDebugUtils.currentLine=54853689;
 //BA.debugLineNum = 54853689;BA.debugLine="sbCrearTabla.Append(\"NombrePrioridad TEXT COLLATE";
_sbcreartabla.Append("NombrePrioridad TEXT COLLATE NOCASE DEFAULT 'Sin Prioridad',");
RDebugUtils.currentLine=54853690;
 //BA.debugLineNum = 54853690;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT COLLATE NOCASE def";
_sbcreartabla.Append("Fase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=54853691;
 //BA.debugLineNum = 54853691;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER default 0";
_sbcreartabla.Append("Gestionado INTEGER default 0,");
RDebugUtils.currentLine=54853692;
 //BA.debugLineNum = 54853692;BA.debugLine="sbCrearTabla.Append(\"FechaFase INTEGER default 0,";
_sbcreartabla.Append("FechaFase INTEGER default 0,");
RDebugUtils.currentLine=54853693;
 //BA.debugLineNum = 54853693;BA.debugLine="sbCrearTabla.Append(\"ResponsableFase TEXT COLLATE";
_sbcreartabla.Append("ResponsableFase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=54853694;
 //BA.debugLineNum = 54853694;BA.debugLine="sbCrearTabla.Append(\"InfoAdicionalFase TEXT COLLA";
_sbcreartabla.Append("InfoAdicionalFase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=54853695;
 //BA.debugLineNum = 54853695;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
_sbcreartabla.Append("Observaciones TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=54853696;
 //BA.debugLineNum = 54853696;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '')");
RDebugUtils.currentLine=54853697;
 //BA.debugLineNum = 54853697;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=54853714;
 //BA.debugLineNum = 54853714;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.ccontroldocumentosnogestionados __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=54525952;
 //BA.debugLineNum = 54525952;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=54525953;
 //BA.debugLineNum = 54525953;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=54525954;
 //BA.debugLineNum = 54525954;BA.debugLine="End Sub";
return "";
}
public String  _generaruuidv4(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "generaruuidv4", false))
	 {return ((String) Debug.delegate(ba, "generaruuidv4", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
int _c = 0;
RDebugUtils.currentLine=54984704;
 //BA.debugLineNum = 54984704;BA.debugLine="Sub GenerarUUIDv4 As String";
RDebugUtils.currentLine=54984705;
 //BA.debugLineNum = 54984705;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=54984706;
 //BA.debugLineNum = 54984706;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=54984707;
 //BA.debugLineNum = 54984707;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
RDebugUtils.currentLine=54984708;
 //BA.debugLineNum = 54984708;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=54984709;
 //BA.debugLineNum = 54984709;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=54984710;
 //BA.debugLineNum = 54984710;BA.debugLine="Dim c As Int = Rnd(0, 16)";
_c = __c.Rnd((int) (0),(int) (16));
RDebugUtils.currentLine=54984711;
 //BA.debugLineNum = 54984711;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
if (_c<10) { 
_c = (int) (_c+48);}
else {
_c = (int) (_c+55);};
RDebugUtils.currentLine=54984712;
 //BA.debugLineNum = 54984712;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
if (_sb.getLength()==19) { 
_c = __c.Asc(BA.ObjectToChar("8"));};
RDebugUtils.currentLine=54984713;
 //BA.debugLineNum = 54984713;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
if (_sb.getLength()==14) { 
_c = __c.Asc(BA.ObjectToChar("4"));};
RDebugUtils.currentLine=54984714;
 //BA.debugLineNum = 54984714;BA.debugLine="sb.Append(Chr(c))";
_sb.Append(BA.ObjectToString(__c.Chr(_c)));
 }
};
 }
};
RDebugUtils.currentLine=54984717;
 //BA.debugLineNum = 54984717;BA.debugLine="Return sb.ToString.ToLowerCase";
if (true) return _sb.ToString().toLowerCase();
RDebugUtils.currentLine=54984718;
 //BA.debugLineNum = 54984718;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_accionsalirjamtableclv(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "jamtableclv1_accionsalirjamtableclv", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_accionsalirjamtableclv", null));}
RDebugUtils.currentLine=54591488;
 //BA.debugLineNum = 54591488;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
RDebugUtils.currentLine=54591489;
 //BA.debugLineNum = 54591489;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54591490;
 //BA.debugLineNum = 54591490;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemclick(b4j.docU.ccontroldocumentosnogestionados __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
RDebugUtils.currentLine=55115777;
 //BA.debugLineNum = 55115777;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
__c.LogImpl("855115778","Datos Item seleccionado ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=55115779;
 //BA.debugLineNum = 55115779;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=55115780;
 //BA.debugLineNum = 55115780;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("855115780",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=55115782;
 //BA.debugLineNum = 55115782;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemlongclick(b4j.docU.ccontroldocumentosnogestionados __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemlongclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
__c.LogImpl("855181314","Datos Item seleccionado botón secundario ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=55181315;
 //BA.debugLineNum = 55181315;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=55181316;
 //BA.debugLineNum = 55181316;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("855181316",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=55181318;
 //BA.debugLineNum = 55181318;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_loadlayoutpanelitem(b4j.docU.ccontroldocumentosnogestionados __ref,b4j.docU.jamtableclv._datositemindexclvjamtableclv _datositemindexclv) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "jamtableclv1_loadlayoutpanelitem", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_loadlayoutpanelitem", new Object[] {_datositemindexclv}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _numalmfisdoc = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _txtfaseb = null;
String _dateformatant = "";
String _timeformatant = "";
anywheresoftware.b4a.objects.B4XViewWrapper _txtfechafaseb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtinfoadfaseb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtobservacionesb = null;
anywheresoftware.b4a.objects.B4XViewWrapper _txtresponsablefaseb = null;
double _totalimp = 0;
double _totalqty = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _txtpersonalizadob = null;
RDebugUtils.currentLine=55050240;
 //BA.debugLineNum = 55050240;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
RDebugUtils.currentLine=55050241;
 //BA.debugLineNum = 55050241;BA.debugLine="Dim mData As Map = DatosItemIndexCLV.Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_datositemindexclv.Value /*Object*/ ));
RDebugUtils.currentLine=55050242;
 //BA.debugLineNum = 55050242;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _datositemindexclv.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=55050243;
 //BA.debugLineNum = 55050243;BA.debugLine="pnl.LoadLayout(\"scrItemControlDocumentosNoGestion";
_pnl.LoadLayout("scrItemControlDocumentosNoGestionados",ba);
RDebugUtils.currentLine=55050245;
 //BA.debugLineNum = 55050245;BA.debugLine="txtAlmacenDocumento.Text=mData.Get(\"AlmacenDocume";
__ref._txtalmacendocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("AlmacenDocumento"))));
RDebugUtils.currentLine=55050246;
 //BA.debugLineNum = 55050246;BA.debugLine="txtAlmacenFisico.Text=mData.Get(\"AlmacenFisico\")";
__ref._txtalmacenfisico /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("AlmacenFisico"))));
RDebugUtils.currentLine=55050247;
 //BA.debugLineNum = 55050247;BA.debugLine="Dim NumAlmFisDoc As Int=mData.get(\"NumeroAlmacene";
_numalmfisdoc = (int)(BA.ObjectToNumber(_mdata.Get((Object)("NumeroAlmacenesFisicos"))));
RDebugUtils.currentLine=55050248;
 //BA.debugLineNum = 55050248;BA.debugLine="txtNumeroAlmacenesFisicos.Text=NumAlmFisDoc";
__ref._txtnumeroalmacenesfisicos /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.NumberToString(_numalmfisdoc));
RDebugUtils.currentLine=55050249;
 //BA.debugLineNum = 55050249;BA.debugLine="If NumAlmFisDoc>1 Then";
if (_numalmfisdoc>1) { 
RDebugUtils.currentLine=55050250;
 //BA.debugLineNum = 55050250;BA.debugLine="txtNumeroAlmacenesFisicos.Textcolor=xui.Color_Wh";
__ref._txtnumeroalmacenesfisicos /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=55050251;
 //BA.debugLineNum = 55050251;BA.debugLine="txtNumeroAlmacenesFisicos.SetColorAndBorder(0xFF";
__ref._txtnumeroalmacenesfisicos /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(((int)0xffff2226),1,((int)0xff696969),3);
 }else {
RDebugUtils.currentLine=55050253;
 //BA.debugLineNum = 55050253;BA.debugLine="txtNumeroAlmacenesFisicos.TextColor=xui.Color_Bl";
__ref._txtnumeroalmacenesfisicos /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 };
RDebugUtils.currentLine=55050255;
 //BA.debugLineNum = 55050255;BA.debugLine="txtCliente.Text=mData.Get(\"Cliente\")";
__ref._txtcliente /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Cliente"))));
RDebugUtils.currentLine=55050258;
 //BA.debugLineNum = 55050258;BA.debugLine="txtDiasAcum.Text=mData.Get(\"DiasAcumulados\")";
__ref._txtdiasacum /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("DiasAcumulados"))));
RDebugUtils.currentLine=55050260;
 //BA.debugLineNum = 55050260;BA.debugLine="txtDocumento.Text=mData.Get(\"Documento\")";
__ref._txtdocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Documento"))));
RDebugUtils.currentLine=55050261;
 //BA.debugLineNum = 55050261;BA.debugLine="txtFase.Text=mData.Getdefault(\"Fase\",\"\")";
__ref._txtfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("Fase"),(Object)(""))));
RDebugUtils.currentLine=55050262;
 //BA.debugLineNum = 55050262;BA.debugLine="Dim txtfaseB As B4XView=txtFase";
_txtfaseb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtfaseb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=55050263;
 //BA.debugLineNum = 55050263;BA.debugLine="If txtFase.Text=\"NO INICIADO\" Then";
if ((__ref._txtfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()).equals("NO INICIADO")) { 
RDebugUtils.currentLine=55050264;
 //BA.debugLineNum = 55050264;BA.debugLine="txtfaseB.Textcolor=xui.Color_Black";
_txtfaseb.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=55050265;
 //BA.debugLineNum = 55050265;BA.debugLine="txtfaseB.SetColorAndBorder(0xFFFFA500,1,0xFF6969";
_txtfaseb.SetColorAndBorder(((int)0xffffa500),1,((int)0xff696969),3);
 }else {
RDebugUtils.currentLine=55050267;
 //BA.debugLineNum = 55050267;BA.debugLine="txtfaseB.TextColor=0xFFB22222";
_txtfaseb.setTextColor(((int)0xffb22222));
 };
RDebugUtils.currentLine=55050272;
 //BA.debugLineNum = 55050272;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=55050273;
 //BA.debugLineNum = 55050273;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=55050274;
 //BA.debugLineNum = 55050274;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
_timeformatant = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=55050275;
 //BA.debugLineNum = 55050275;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=55050276;
 //BA.debugLineNum = 55050276;BA.debugLine="txtFechaDocumento.Text=DateTime.Date(mData.Get(\"F";
__ref._txtfechadocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaDocumento")))));
RDebugUtils.currentLine=55050277;
 //BA.debugLineNum = 55050277;BA.debugLine="If mData.Getdefault(\"FechaFase\",0)>0 Then";
if ((double)(BA.ObjectToNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0))))>0) { 
RDebugUtils.currentLine=55050278;
 //BA.debugLineNum = 55050278;BA.debugLine="txtFechaFase.Text=DateTime.date(mData.Getdefault";
__ref._txtfechafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0))))+" "+__c.DateTime.Time(BA.ObjectToLongNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0)))));
 };
RDebugUtils.currentLine=55050280;
 //BA.debugLineNum = 55050280;BA.debugLine="Dim txtFechaFaseB As B4XView=txtFechaFase";
_txtfechafaseb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtfechafaseb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtfechafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=55050281;
 //BA.debugLineNum = 55050281;BA.debugLine="txtFechaFaseB.TextColor=0xFFB22222";
_txtfechafaseb.setTextColor(((int)0xffb22222));
RDebugUtils.currentLine=55050282;
 //BA.debugLineNum = 55050282;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=55050283;
 //BA.debugLineNum = 55050283;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
__c.DateTime.setTimeFormat(_timeformatant);
RDebugUtils.currentLine=55050285;
 //BA.debugLineNum = 55050285;BA.debugLine="txtInfoAdicionalFase.Text=mData.Getdefault(\"InfoA";
__ref._txtinfoadicionalfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("InfoAdicionalFase"),(Object)(""))));
RDebugUtils.currentLine=55050286;
 //BA.debugLineNum = 55050286;BA.debugLine="Dim txtInfoAdfaseB As B4XView=txtInfoAdicionalFas";
_txtinfoadfaseb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtinfoadfaseb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtinfoadicionalfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=55050287;
 //BA.debugLineNum = 55050287;BA.debugLine="txtInfoAdfaseB.TextColor=0xFFB22222";
_txtinfoadfaseb.setTextColor(((int)0xffb22222));
RDebugUtils.currentLine=55050288;
 //BA.debugLineNum = 55050288;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
__ref._txtnombrecliente /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreCliente"))));
RDebugUtils.currentLine=55050289;
 //BA.debugLineNum = 55050289;BA.debugLine="txtObservaciones.Text=mData.Getdefault(\"Observaci";
__ref._txtobservaciones /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("Observaciones"),(Object)(""))));
RDebugUtils.currentLine=55050290;
 //BA.debugLineNum = 55050290;BA.debugLine="Dim txtObservacionesB As B4XView=txtObservaciones";
_txtobservacionesb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtobservacionesb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtobservaciones /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=55050291;
 //BA.debugLineNum = 55050291;BA.debugLine="txtObservacionesB.TextColor=0xFFC71585";
_txtobservacionesb.setTextColor(((int)0xffc71585));
RDebugUtils.currentLine=55050292;
 //BA.debugLineNum = 55050292;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
__ref._txtpersonalizado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Personalizado"))));
RDebugUtils.currentLine=55050293;
 //BA.debugLineNum = 55050293;BA.debugLine="txtPrioridad.Text=mData.Getdefault(\"NombrePriorid";
__ref._txtprioridad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("NombrePrioridad"),(Object)("Sin Prioridad"))));
RDebugUtils.currentLine=55050294;
 //BA.debugLineNum = 55050294;BA.debugLine="ActualizarColortFPrioridad(txtPrioridad,txtPriori";
__ref._actualizarcolortfprioridad /*String*/ (null,__ref._txtprioridad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ ,__ref._txtprioridad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=55050295;
 //BA.debugLineNum = 55050295;BA.debugLine="txtResponsableFase.Text=mData.Getdefault(\"Respons";
__ref._txtresponsablefase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("ResponsableFase"),(Object)(""))));
RDebugUtils.currentLine=55050296;
 //BA.debugLineNum = 55050296;BA.debugLine="Dim txtResponsableFaseB As B4XView=txtResponsable";
_txtresponsablefaseb = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtresponsablefaseb = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtresponsablefase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=55050297;
 //BA.debugLineNum = 55050297;BA.debugLine="txtResponsableFaseB.TextColor=0xFFB22222";
_txtresponsablefaseb.setTextColor(((int)0xffb22222));
RDebugUtils.currentLine=55050298;
 //BA.debugLineNum = 55050298;BA.debugLine="txtTipoDocumento.Text=mData.Get(\"TipoDocumento\")";
__ref._txttipodocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("TipoDocumento"))));
RDebugUtils.currentLine=55050299;
 //BA.debugLineNum = 55050299;BA.debugLine="Dim TotalImp As Double=mData.Get(\"TotalImp\")";
_totalimp = (double)(BA.ObjectToNumber(_mdata.Get((Object)("TotalImp"))));
RDebugUtils.currentLine=55050300;
 //BA.debugLineNum = 55050300;BA.debugLine="txtTotalImp.Text=Utilidades.FormatoNumerico2(Tota";
__ref._txttotalimp /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_utilidades._formatonumerico2 /*String*/ (_totalimp,(int) (1),(int) (0),(int) (0),__c.True));
RDebugUtils.currentLine=55050301;
 //BA.debugLineNum = 55050301;BA.debugLine="Dim TotalQty As Double=mData.Get(\"TotalQty\")";
_totalqty = (double)(BA.ObjectToNumber(_mdata.Get((Object)("TotalQty"))));
RDebugUtils.currentLine=55050302;
 //BA.debugLineNum = 55050302;BA.debugLine="txtTotalQty.Text=Utilidades.FormatoNumerico2(Tota";
__ref._txttotalqty /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_utilidades._formatonumerico2 /*String*/ (_totalqty,(int) (1),(int) (0),(int) (0),__c.True));
RDebugUtils.currentLine=55050303;
 //BA.debugLineNum = 55050303;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
__ref._txtpersonalizado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Personalizado"))));
RDebugUtils.currentLine=55050304;
 //BA.debugLineNum = 55050304;BA.debugLine="Dim txtPersonalizadoB As B4XView=txtPersonalizado";
_txtpersonalizadob = new anywheresoftware.b4a.objects.B4XViewWrapper();
_txtpersonalizadob = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._txtpersonalizado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getObject()));
RDebugUtils.currentLine=55050305;
 //BA.debugLineNum = 55050305;BA.debugLine="If txtPersonalizadoB.Text=\"SI\" Then";
if ((_txtpersonalizadob.getText()).equals("SI")) { 
RDebugUtils.currentLine=55050306;
 //BA.debugLineNum = 55050306;BA.debugLine="txtPersonalizadoB.Textcolor=xui.Color_Black";
_txtpersonalizadob.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=55050307;
 //BA.debugLineNum = 55050307;BA.debugLine="txtPersonalizadoB.SetColorAndBorder(0xFFFFA500,1";
_txtpersonalizadob.SetColorAndBorder(((int)0xffffa500),1,((int)0xff696969),3);
 }else {
RDebugUtils.currentLine=55050309;
 //BA.debugLineNum = 55050309;BA.debugLine="txtPersonalizadoB.TextColor=xui.Color_Black";
_txtpersonalizadob.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
 };
RDebugUtils.currentLine=55050311;
 //BA.debugLineNum = 55050311;BA.debugLine="txtNombreResponsableCuenta.Text=mData.Get(\"Nombre";
__ref._txtnombreresponsablecuenta /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreResponsableCuenta"))));
RDebugUtils.currentLine=55050313;
 //BA.debugLineNum = 55050313;BA.debugLine="End Sub";
return "";
}
public void  _jamtableclv1_menubarmenuitem_action(b4j.docU.ccontroldocumentosnogestionados __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "jamtableclv1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableclv1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_JamTableCLV1_MenuBarMenuItem_Action rsub = new ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_JamTableCLV1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_JamTableCLV1_MenuBarMenuItem_Action(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
String _tagmenuitem;
String _sresp = "";
String _accion = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54788097;
 //BA.debugLineNum = 54788097;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","VerFechaInicioControl","ResetearPrioridades")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=54788099;
 //BA.debugLineNum = 54788099;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=54788101;
 //BA.debugLineNum = 54788101;BA.debugLine="Wait For(CargarFechaInicioControl) complete (sR";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "jamtableclv1_menubarmenuitem_action"), __ref._cargarfechainiciocontrol /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=54788102;
 //BA.debugLineNum = 54788102;BA.debugLine="Dim Accion As String=sResp";
_accion = _sresp;
RDebugUtils.currentLine=54788103;
 //BA.debugLineNum = 54788103;BA.debugLine="If Accion=\"Salir\" Then";
if (true) break;

case 6:
//if
this.state = 9;
if ((_accion).equals("Salir")) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=54788104;
 //BA.debugLineNum = 54788104;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=54788105;
 //BA.debugLineNum = 54788105;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=54788107;
 //BA.debugLineNum = 54788107;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha de";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha de inicio del control es "+__ref._sfechainiciocontrol /*String*/ +".","Fecha Inicio Control");
RDebugUtils.currentLine=54788108;
 //BA.debugLineNum = 54788108;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "jamtableclv1_menubarmenuitem_action"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=54788111;
 //BA.debugLineNum = 54788111;BA.debugLine="ResetearPrioridades";
__ref._resetearprioridades /*void*/ (null);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=54788120;
 //BA.debugLineNum = 54788120;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _resetearprioridades(b4j.docU.ccontroldocumentosnogestionados __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";
if (Debug.shouldDelegate(ba, "resetearprioridades", false))
	 {Debug.delegate(ba, "resetearprioridades", null); return;}
ResumableSub_ResetearPrioridades rsub = new ResumableSub_ResetearPrioridades(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ResetearPrioridades extends BA.ResumableSub {
public ResumableSub_ResetearPrioridades(b4j.docU.ccontroldocumentosnogestionados parent,b4j.docU.ccontroldocumentosnogestionados __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosnogestionados __ref;
b4j.docU.ccontroldocumentosnogestionados parent;
int _numdocsconprioridad = 0;
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.objects.collections.List _lstcomandos = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosnogestionados";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="Dim NumDocsConPrioridad As Int=Utilidades.FixNull";
_numdocsconprioridad = parent._utilidades._fixnullint /*int*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select count(*) from tblDocumentosSinGestionar where Gestionado=? and Prioridad<>?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(0),""}))));
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="If NumDocsConPrioridad=0 Then";
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
RDebugUtils.currentLine=56229891;
 //BA.debugLineNum = 56229891;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay ningún";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay ningún documento con prioridad establecida.","Aviso");
RDebugUtils.currentLine=56229892;
 //BA.debugLineNum = 56229892;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=56229893;
 //BA.debugLineNum = 56229893;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=56229896;
 //BA.debugLineNum = 56229896;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Resetear t";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Resetear todas las prioridades de documentos establecidas?"+parent.__c.CRLF+parent.__c.CRLF+"Esta acción no es reversible.","Confirma","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=56229897;
 //BA.debugLineNum = 56229897;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=56229898;
 //BA.debugLineNum = 56229898;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=56229900;
 //BA.debugLineNum = 56229900;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56229901;
 //BA.debugLineNum = 56229901;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=56229903;
 //BA.debugLineNum = 56229903;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"R";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("ResetearPrioridadesDocumentosNoGestionados",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=56229904;
 //BA.debugLineNum = 56229904;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=56229905;
 //BA.debugLineNum = 56229905;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 19;
return;
case 19:
//C
this.state = 11;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=56229906;
 //BA.debugLineNum = 56229906;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=56229907;
 //BA.debugLineNum = 56229907;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible resetear las prioridades de los documentos.","Error");
RDebugUtils.currentLine=56229908;
 //BA.debugLineNum = 56229908;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
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
RDebugUtils.currentLine=56229910;
 //BA.debugLineNum = 56229910;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Se han resete";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Se han reseteado todas las prioridades de los documentos.","Aviso");
RDebugUtils.currentLine=56229911;
 //BA.debugLineNum = 56229911;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosnogestionados", "resetearprioridades"), _msa);
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
RDebugUtils.currentLine=56229913;
 //BA.debugLineNum = 56229913;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=56229914;
 //BA.debugLineNum = 56229914;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}