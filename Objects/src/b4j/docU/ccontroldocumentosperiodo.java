package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class ccontroldocumentosperiodo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.ccontroldocumentosperiodo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.ccontroldocumentosperiodo.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechainicial = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechainicial = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtfechafinal = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btnselfechafinal = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btngetinfo = null;
public long _fechainiciallong = 0L;
public long _fechafinallong = 0L;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnumexpedicion = null;
public anywheresoftware.b4j.objects.ButtonWrapper _btntrazabilidadtransporte = null;
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
public String  _initialize(b4j.docU.ccontroldocumentosperiodo __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
boolean _rbool = false;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=56557571;
 //BA.debugLineNum = 56557571;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=56557572;
 //BA.debugLineNum = 56557572;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=56557573;
 //BA.debugLineNum = 56557573;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=56557574;
 //BA.debugLineNum = 56557574;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=56557575;
 //BA.debugLineNum = 56557575;BA.debugLine="frm.RootPane.LoadLayout(\"scrControlDocumentosPeri";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrControlDocumentosPeriodo");
RDebugUtils.currentLine=56557576;
 //BA.debugLineNum = 56557576;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "show"),(int) (0));
this.state = 15;
return;
case 15:
//C
this.state = 1;
;
RDebugUtils.currentLine=56557579;
 //BA.debugLineNum = 56557579;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Control Docum";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Control Documentos Periodo");
RDebugUtils.currentLine=56557581;
 //BA.debugLineNum = 56557581;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=56557583;
 //BA.debugLineNum = 56557583;BA.debugLine="JamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=56557585;
 //BA.debugLineNum = 56557585;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=56557600;
 //BA.debugLineNum = 56557600;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
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
RDebugUtils.currentLine=56557602;
 //BA.debugLineNum = 56557602;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=56557603;
 //BA.debugLineNum = 56557603;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=56557605;
 //BA.debugLineNum = 56557605;BA.debugLine="wait for(BorrarDatosBatchAnterioresMaquinaUsuario";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "show"), __ref._borrardatosbatchanterioresmaquinausuario /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 16;
return;
case 16:
//C
this.state = 7;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=56557606;
 //BA.debugLineNum = 56557606;BA.debugLine="If rBool=False Then";
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
RDebugUtils.currentLine=56557607;
 //BA.debugLineNum = 56557607;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56557608;
 //BA.debugLineNum = 56557608;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=56557611;
 //BA.debugLineNum = 56557611;BA.debugLine="UUIDSesion=GenerarUUIDv4";
__ref._uuidsesion /*String*/  = __ref._generaruuidv4 /*String*/ (null);
RDebugUtils.currentLine=56557612;
 //BA.debugLineNum = 56557612;BA.debugLine="TimestampBatchFaseDocs=DateTime.Now";
__ref._timestampbatchfasedocs /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=56557622;
 //BA.debugLineNum = 56557622;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.ConfigurarT";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._configurartableclv /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaControlDocumentosPeriodo.json");
RDebugUtils.currentLine=56557623;
 //BA.debugLineNum = 56557623;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "show"), _rsub);
this.state = 17;
return;
case 17:
//C
this.state = 11;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56557624;
 //BA.debugLineNum = 56557624;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("856557624",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=56557625;
 //BA.debugLineNum = 56557625;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=56557626;
 //BA.debugLineNum = 56557626;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=56557627;
 //BA.debugLineNum = 56557627;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "show"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
;
RDebugUtils.currentLine=56557628;
 //BA.debugLineNum = 56557628;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=56557629;
 //BA.debugLineNum = 56557629;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=56557633;
 //BA.debugLineNum = 56557633;BA.debugLine="JamTableCLV1.AddMenuItemToMenuInMenuBar(\"Actualiz";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._addmenuitemtomenuinmenubar /*String*/ (null,"Actualizar","Actualizar",__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=56557636;
 //BA.debugLineNum = 56557636;BA.debugLine="JamTableCLV1.AlturaItems=130dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaitems /*int*/ (null,parent.__c.DipToCurrent((int) (130)));
RDebugUtils.currentLine=56557638;
 //BA.debugLineNum = 56557638;BA.debugLine="JamTableCLV1.ModoSeleccionItems=JamTableCLV1.Modo";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setmodoseleccionitems /*String*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._modoseleccionmultiple /*String*/ );
RDebugUtils.currentLine=56557640;
 //BA.debugLineNum = 56557640;BA.debugLine="JamTableCLV1.AlturaSeparadorPaneles=2dip";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setalturaseparadorpaneles /*float*/ (null,(float) (parent.__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=56557646;
 //BA.debugLineNum = 56557646;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatos(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _rbool = false;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _docalmf = "";
String _almf = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.BA.IterableList group52;
int index52;
int groupLen52;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=56623108;
 //BA.debugLineNum = 56623108;BA.debugLine="JamTableCLV1.Clear";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=56623110;
 //BA.debugLineNum = 56623110;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblAlbVtaDepNavLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblAlbVtaDepNavLin");
RDebugUtils.currentLine=56623111;
 //BA.debugLineNum = 56623111;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblDocumentosPerio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblDocumentosPeriodo");
RDebugUtils.currentLine=56623114;
 //BA.debugLineNum = 56623114;BA.debugLine="Wait For(ActualizarDatosDocumentosNAV) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref._actualizardatosdocumentosnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 49;
return;
case 49:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56623115;
 //BA.debugLineNum = 56623115;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=56623116;
 //BA.debugLineNum = 56623116;BA.debugLine="If Accion<>\"OK\" Then";
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
RDebugUtils.currentLine=56623118;
 //BA.debugLineNum = 56623118;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56623119;
 //BA.debugLineNum = 56623119;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=56623122;
 //BA.debugLineNum = 56623122;BA.debugLine="mSQL.ExecNonQuery(\"update tblAlbVtaDepNavLin set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("update tblAlbVtaDepNavLin set Importe=Qty*Precio*(100-Descuento)/100");
RDebugUtils.currentLine=56623123;
 //BA.debugLineNum = 56623123;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where AlmOrig=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("ADESA"),(Object)("0237")}));
RDebugUtils.currentLine=56623124;
 //BA.debugLineNum = 56623124;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAlbVtaDepNavLin set";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAlbVtaDepNavLin set Almacen=? where GRC like ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("PROTEC"),(Object)("ROPA%")}));
RDebugUtils.currentLine=56623130;
 //BA.debugLineNum = 56623130;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=56623131;
 //BA.debugLineNum = 56623131;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=56623132;
 //BA.debugLineNum = 56623132;BA.debugLine="sb.Append(\"insert into tblDocumentosPeriodo (Fech";
_sb.Append("insert into tblDocumentosPeriodo (FechaDocumento, TipoDocumento, Documento, Cliente, NombreCliente, AlmacenDocumento, AlmacenFisico, ");
RDebugUtils.currentLine=56623133;
 //BA.debugLineNum = 56623133;BA.debugLine="sb.Append(\"Personalizado, Prioridad, Fase, FechaF";
_sb.Append("Personalizado, Prioridad, Fase, FechaFase, ResponsableFase, InfoAdicionalFase, NumExpedicion, Observaciones, TotalQty, TotalImp)");
RDebugUtils.currentLine=56623134;
 //BA.debugLineNum = 56623134;BA.debugLine="sb.Append(\" Select Fecha As FechaDocumento, TipoD";
_sb.Append(" Select Fecha As FechaDocumento, TipoDoc As TipoDocumento, Documento, Cliente, NombreCliente, AlmOrig As AlmacenDocumento , Almacen As AlmacenFisico,");
RDebugUtils.currentLine=56623135;
 //BA.debugLineNum = 56623135;BA.debugLine="sb.Append(\"'NO' As Personalizado, '' as Prioridad";
_sb.Append("'NO' As Personalizado, '' as Prioridad, '' as Fase, 0 as FechaFase, '' as ResponsableFase, '' as NumExpedicion, '' as InfoAdicionalFase, '' as Observaciones,");
RDebugUtils.currentLine=56623136;
 //BA.debugLineNum = 56623136;BA.debugLine="sb.Append(\"sum (Qty) As TotalQty, sum (Importe) A";
_sb.Append("sum (Qty) As TotalQty, sum (Importe) As TotalImp");
RDebugUtils.currentLine=56623137;
 //BA.debugLineNum = 56623137;BA.debugLine="sb.Append(\" from tblAlbVtaDepNavLin group by Fech";
_sb.Append(" from tblAlbVtaDepNavLin group by Fecha, TipoDoc, Documento, Cliente, NombreCliente, AlmOrig, Almacen");
RDebugUtils.currentLine=56623138;
 //BA.debugLineNum = 56623138;BA.debugLine="mSQL.ExecNonQuery(sb.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=56623140;
 //BA.debugLineNum = 56623140;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo s";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosPeriodo set Personalizado=? where Documento in (Select DISTINCT Documento from tblAlbVtaDepNavLin where Personalizado=1)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("SI")}));
RDebugUtils.currentLine=56623141;
 //BA.debugLineNum = 56623141;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo s";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosPeriodo set NombreResponsableCuenta=? where TipoDocumento=? or TipoDocumento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("N/A"),(Object)("CDEV"),(Object)("RTTrf")}));
RDebugUtils.currentLine=56623145;
 //BA.debugLineNum = 56623145;BA.debugLine="wait for(BorrarDatosBatchAnterioresUUIDSesion) co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref._borrardatosbatchanterioresuuidsesion /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 50;
return;
case 50:
//C
this.state = 5;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=56623146;
 //BA.debugLineNum = 56623146;BA.debugLine="If rBool=False Then";
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
RDebugUtils.currentLine=56623147;
 //BA.debugLineNum = 56623147;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=56623148;
 //BA.debugLineNum = 56623148;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56623149;
 //BA.debugLineNum = 56623149;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=56623152;
 //BA.debugLineNum = 56623152;BA.debugLine="wait for(InsertarLineasBatchDocumentos) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref._insertarlineasbatchdocumentos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 51;
return;
case 51:
//C
this.state = 9;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=56623153;
 //BA.debugLineNum = 56623153;BA.debugLine="If rBool=False Then";
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
RDebugUtils.currentLine=56623154;
 //BA.debugLineNum = 56623154;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=56623155;
 //BA.debugLineNum = 56623155;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56623156;
 //BA.debugLineNum = 56623156;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=56623159;
 //BA.debugLineNum = 56623159;BA.debugLine="wait for(FaseActualDocumentosBacthUUID) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref._faseactualdocumentosbacthuuid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 52;
return;
case 52:
//C
this.state = 13;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56623160;
 //BA.debugLineNum = 56623160;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=56623161;
 //BA.debugLineNum = 56623161;BA.debugLine="If Accion=\"Salir\" Then";
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
RDebugUtils.currentLine=56623162;
 //BA.debugLineNum = 56623162;BA.debugLine="JamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=56623163;
 //BA.debugLineNum = 56623163;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56623164;
 //BA.debugLineNum = 56623164;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=56623173;
 //BA.debugLineNum = 56623173;BA.debugLine="wait for(CargaDocumentosAlmacenManual) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), __ref._cargadocumentosalmacenmanual /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 53;
return;
case 53:
//C
this.state = 17;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56623174;
 //BA.debugLineNum = 56623174;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=56623175;
 //BA.debugLineNum = 56623175;BA.debugLine="If Accion=\"Salir\" Then";
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
RDebugUtils.currentLine=56623177;
 //BA.debugLineNum = 56623177;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56623178;
 //BA.debugLineNum = 56623178;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=56623180;
 //BA.debugLineNum = 56623180;BA.debugLine="If Accion=\"OK\" Then";

case 20:
//if
this.state = 27;
if ((_accion).equals("OK")) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=56623181;
 //BA.debugLineNum = 56623181;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=56623182;
 //BA.debugLineNum = 56623182;BA.debugLine="For Each m As Map In lstReg";
if (true) break;

case 23:
//for
this.state = 26;
_m = new anywheresoftware.b4a.objects.collections.Map();
group52 = _lstreg;
index52 = 0;
groupLen52 = group52.getSize();
this.state = 54;
if (true) break;

case 54:
//C
this.state = 26;
if (index52 < groupLen52) {
this.state = 25;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group52.Get(index52)));}
if (true) break;

case 55:
//C
this.state = 54;
index52++;
if (true) break;

case 25:
//C
this.state = 55;
RDebugUtils.currentLine=56623183;
 //BA.debugLineNum = 56623183;BA.debugLine="Dim DocAlmF As String=m.Get(\"Documento\")";
_docalmf = BA.ObjectToString(_m.Get((Object)("Documento")));
RDebugUtils.currentLine=56623184;
 //BA.debugLineNum = 56623184;BA.debugLine="Dim AlmF As String=m.Get(\"Almacen\")";
_almf = BA.ObjectToString(_m.Get((Object)("Almacen")));
RDebugUtils.currentLine=56623185;
 //BA.debugLineNum = 56623185;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosPeriodo set AlmacenFisico=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_almf),(Object)(_docalmf)}));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=56623189;
 //BA.debugLineNum = 56623189;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDocumentosPeriodo s";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDocumentosPeriodo set Fase=? where Fase=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("NO INICIADO"),(Object)("")}));
RDebugUtils.currentLine=56623191;
 //BA.debugLineNum = 56623191;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=56623193;
 //BA.debugLineNum = 56623193;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblDocumentosPeriodo");
RDebugUtils.currentLine=56623194;
 //BA.debugLineNum = 56623194;BA.debugLine="Dim rSub As ResumableSub=JamTableCLV1.setdata(rs)";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=56623195;
 //BA.debugLineNum = 56623195;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _rsub);
this.state = 56;
return;
case 56:
//C
this.state = 28;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=56623196;
 //BA.debugLineNum = 56623196;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=56623198;
 //BA.debugLineNum = 56623198;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 28:
//if
this.state = 48;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=56623199;
 //BA.debugLineNum = 56623199;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
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
RDebugUtils.currentLine=56623200;
 //BA.debugLineNum = 56623200;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=56623201;
 //BA.debugLineNum = 56623201;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _msa);
this.state = 57;
return;
case 57:
//C
this.state = 34;
;
RDebugUtils.currentLine=56623203;
 //BA.debugLineNum = 56623203;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=56623204;
 //BA.debugLineNum = 56623204;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _msa);
this.state = 58;
return;
case 58:
//C
this.state = 34;
_rint = (int) result[1];
;
RDebugUtils.currentLine=56623205;
 //BA.debugLineNum = 56623205;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=56623206;
 //BA.debugLineNum = 56623206;BA.debugLine="JamTableCLV1.AbrirCamposBuilder";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=56623207;
 //BA.debugLineNum = 56623207;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=56623210;
 //BA.debugLineNum = 56623210;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=56623212;
 //BA.debugLineNum = 56623212;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 38:
//if
this.state = 47;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 40;
}if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=56623213;
 //BA.debugLineNum = 56623213;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 41:
//if
this.state = 46;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 43;
;}if (true) break;

case 43:
//C
this.state = 46;
if (true) return ;
if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=56623214;
 //BA.debugLineNum = 56623214;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=56623215;
 //BA.debugLineNum = 56623215;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatos"), _msa);
this.state = 59;
return;
case 59:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=56623220;
 //BA.debugLineNum = 56623220;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=56623222;
 //BA.debugLineNum = 56623222;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosdocumentosnav(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "actualizardatosdocumentosnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosdocumentosnav", null));}
ResumableSub_ActualizarDatosDocumentosNAV rsub = new ResumableSub_ActualizarDatosDocumentosNAV(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosDocumentosNAV extends BA.ResumableSub {
public ResumableSub_ActualizarDatosDocumentosNAV(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _dateformatant = "";
String _comando = "";
String _sfechain = "";
String _sfechafin = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAlbVtaDepNavLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblAlbVtaDepNavLin");
RDebugUtils.currentLine=57081858;
 //BA.debugLineNum = 57081858;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=57081859;
 //BA.debugLineNum = 57081859;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57081860;
 //BA.debugLineNum = 57081860;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=57081862;
 //BA.debugLineNum = 57081862;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=57081863;
 //BA.debugLineNum = 57081863;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=57081864;
 //BA.debugLineNum = 57081864;BA.debugLine="Dim Comando As String=\"InfoNavControlDocumentosPe";
_comando = "InfoNavControlDocumentosPeriodo";
RDebugUtils.currentLine=57081865;
 //BA.debugLineNum = 57081865;BA.debugLine="Dim sFechaIn As String=DateTime.Date(FechaInicial";
_sfechain = parent.__c.DateTime.Date(__ref._fechainiciallong /*long*/ );
RDebugUtils.currentLine=57081866;
 //BA.debugLineNum = 57081866;BA.debugLine="Dim sFechaFin As String=DateTime.Date(FechaFinalL";
_sfechafin = parent.__c.DateTime.Date(__ref._fechafinallong /*long*/ );
RDebugUtils.currentLine=57081867;
 //BA.debugLineNum = 57081867;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=57081868;
 //BA.debugLineNum = 57081868;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdcLinkNav,Comando,Array";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinknav /*String*/ ,_comando,new Object[]{(Object)(_sfechain),(Object)(_sfechafin)},parent);
RDebugUtils.currentLine=57081870;
 //BA.debugLineNum = 57081870;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatosdocumentosnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=57081871;
 //BA.debugLineNum = 57081871;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=57081872;
 //BA.debugLineNum = 57081872;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=57081873;
 //BA.debugLineNum = 57081873;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=57081874;
 //BA.debugLineNum = 57081874;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatosdocumentosnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=57081875;
 //BA.debugLineNum = 57081875;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=57081876;
 //BA.debugLineNum = 57081876;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=57081879;
 //BA.debugLineNum = 57081879;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=57081880;
 //BA.debugLineNum = 57081880;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=57081881;
 //BA.debugLineNum = 57081881;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=57081882;
 //BA.debugLineNum = 57081882;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Documentos para el periodo seleccionado.","Aviso");
RDebugUtils.currentLine=57081883;
 //BA.debugLineNum = 57081883;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "actualizardatosdocumentosnav"), _msa);
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
RDebugUtils.currentLine=57081885;
 //BA.debugLineNum = 57081885;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=57081886;
 //BA.debugLineNum = 57081886;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=57081889;
 //BA.debugLineNum = 57081889;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=57081897;
 //BA.debugLineNum = 57081897;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblAlbVtaDepNavLin\",ls";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblAlbVtaDepNavLin",_lstreg);
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
RDebugUtils.currentLine=57081900;
 //BA.debugLineNum = 57081900;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=57081901;
 //BA.debugLineNum = 57081901;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=56885248;
 //BA.debugLineNum = 56885248;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=56885250;
 //BA.debugLineNum = 56885250;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=56885251;
 //BA.debugLineNum = 56885251;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrardatosbatchanterioresuuidsesion(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "borrardatosbatchanterioresuuidsesion", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrardatosbatchanterioresuuidsesion", null));}
ResumableSub_BorrarDatosBatchAnterioresUUIDSesion rsub = new ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarDatosBatchAnterioresUUIDSesion extends BA.ResumableSub {
public ResumableSub_BorrarDatosBatchAnterioresUUIDSesion(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57933827;
 //BA.debugLineNum = 57933827;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=57933828;
 //BA.debugLineNum = 57933828;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasFaseActualDocumentoBacthUUID",new Object[]{(Object)(__ref._uuidsesion /*String*/ )});
RDebugUtils.currentLine=57933829;
 //BA.debugLineNum = 57933829;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=57933830;
 //BA.debugLineNum = 57933830;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=57933831;
 //BA.debugLineNum = 57933831;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresuuidsesion"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=57933833;
 //BA.debugLineNum = 57933833;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=57933835;
 //BA.debugLineNum = 57933835;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthUUID","Error");
RDebugUtils.currentLine=57933836;
 //BA.debugLineNum = 57933836;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresuuidsesion"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=57933837;
 //BA.debugLineNum = 57933837;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=57933839;
 //BA.debugLineNum = 57933839;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=57933841;
 //BA.debugLineNum = 57933841;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _insertarlineasbatchdocumentos(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "insertarlineasbatchdocumentos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "insertarlineasbatchdocumentos", null));}
ResumableSub_InsertarLineasBatchDocumentos rsub = new ResumableSub_InsertarLineasBatchDocumentos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_InsertarLineasBatchDocumentos extends BA.ResumableSub {
public ResumableSub_InsertarLineasBatchDocumentos(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select distin";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select distinct Documento from tblDocumentosPeriodo");
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="Do While rs.NextRow";
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
RDebugUtils.currentLine=57999365;
 //BA.debugLineNum = 57999365;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"In";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarLineaFaseActualDocumentoBatch",new Object[]{(Object)(__ref._timestampbatchfasedocs /*long*/ ),(Object)(__ref._uuidsesion /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ),(Object)(_rs.GetString("Documento"))});
RDebugUtils.currentLine=57999366;
 //BA.debugLineNum = 57999366;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=57999368;
 //BA.debugLineNum = 57999368;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=57999369;
 //BA.debugLineNum = 57999369;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=57999370;
 //BA.debugLineNum = 57999370;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "insertarlineasbatchdocumentos"), null);
this.state = 11;
return;
case 11:
//C
this.state = 5;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=57999372;
 //BA.debugLineNum = 57999372;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=57999373;
 //BA.debugLineNum = 57999373;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query InsertarLineaFaseActualDocumentoBatch","Error");
RDebugUtils.currentLine=57999374;
 //BA.debugLineNum = 57999374;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "insertarlineasbatchdocumentos"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
;
RDebugUtils.currentLine=57999375;
 //BA.debugLineNum = 57999375;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=57999377;
 //BA.debugLineNum = 57999377;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=57999379;
 //BA.debugLineNum = 57999379;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _faseactualdocumentosbacthuuid(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "faseactualdocumentosbacthuuid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "faseactualdocumentosbacthuuid", null));}
ResumableSub_FaseActualDocumentosBacthUUID rsub = new ResumableSub_FaseActualDocumentosBacthUUID(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_FaseActualDocumentosBacthUUID extends BA.ResumableSub {
public ResumableSub_FaseActualDocumentosBacthUUID(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=58195972;
 //BA.debugLineNum = 58195972;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58195973;
 //BA.debugLineNum = 58195973;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=58195976;
 //BA.debugLineNum = 58195976;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,"FaseActualDocumentosBacthUUID",new Object[]{(Object)(__ref._uuidsesion /*String*/ )},parent);
RDebugUtils.currentLine=58195978;
 //BA.debugLineNum = 58195978;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "faseactualdocumentosbacthuuid"), null);
this.state = 21;
return;
case 21:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58195979;
 //BA.debugLineNum = 58195979;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=58195980;
 //BA.debugLineNum = 58195980;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query FaseActualDocumentosBacthUUID","Error");
RDebugUtils.currentLine=58195981;
 //BA.debugLineNum = 58195981;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "faseactualdocumentosbacthuuid"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 20;
;
RDebugUtils.currentLine=58195982;
 //BA.debugLineNum = 58195982;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=58195983;
 //BA.debugLineNum = 58195983;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=58195986;
 //BA.debugLineNum = 58195986;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=58195987;
 //BA.debugLineNum = 58195987;BA.debugLine="Accion=\"SinFaseActualDocumentos\"";
_accion = "SinFaseActualDocumentos";
RDebugUtils.currentLine=58195988;
 //BA.debugLineNum = 58195988;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=58195990;
 //BA.debugLineNum = 58195990;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=58195991;
 //BA.debugLineNum = 58195991;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=58195994;
 //BA.debugLineNum = 58195994;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=58195995;
 //BA.debugLineNum = 58195995;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
_mres.Put((Object)("lstReg"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=58195996;
 //BA.debugLineNum = 58195996;BA.debugLine="For Each m As Map In lstReg";
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
RDebugUtils.currentLine=58195999;
 //BA.debugLineNum = 58195999;BA.debugLine="mSQL.AddNonQueryToBatch(\"update tblDocumentosP";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch("update tblDocumentosPeriodo set Fase=?, Gestionado=?, FechaFase=?, ResponsableFase=?, InfoAdicionalFase=?, NumExpedicion=?, Observaciones=? where Documento=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m.Get((Object)("Fase")),_m.Get((Object)("Gestionado")),_m.Get((Object)("FechaHoraMov")),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("ResponsableFase")))),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("InfoAdicionalFase")))),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("NumExpedicion")))),(Object)(parent._utilidades._fixnull /*String*/ (_m.Get((Object)("Obs")))),_m.Get((Object)("Documento"))}));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=58196002;
 //BA.debugLineNum = 58196002;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryB";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=58196003;
 //BA.debugLineNum = 58196003;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (S";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "faseactualdocumentosbacthuuid"), _senderfilter);
this.state = 25;
return;
case 25:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=58196004;
 //BA.debugLineNum = 58196004;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("858196004","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=58196005;
 //BA.debugLineNum = 58196005;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=58196006;
 //BA.debugLineNum = 58196006;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=58196007;
 //BA.debugLineNum = 58196007;BA.debugLine="mRes.Put(\"Accion\", Accion)";
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
RDebugUtils.currentLine=58196011;
 //BA.debugLineNum = 58196011;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=58196012;
 //BA.debugLineNum = 58196012;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadocumentosalmacenmanual(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "cargadocumentosalmacenmanual", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadocumentosalmacenmanual", null));}
ResumableSub_CargaDocumentosAlmacenManual rsub = new ResumableSub_CargaDocumentosAlmacenManual(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDocumentosAlmacenManual extends BA.ResumableSub {
public ResumableSub_CargaDocumentosAlmacenManual(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58130435;
 //BA.debugLineNum = 58130435;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=58130436;
 //BA.debugLineNum = 58130436;BA.debugLine="Dim Comando As String=\"DocumentosAlmacenManual\"";
_comando = "DocumentosAlmacenManual";
RDebugUtils.currentLine=58130437;
 //BA.debugLineNum = 58130437;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=58130439;
 //BA.debugLineNum = 58130439;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "cargadocumentosalmacenmanual"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58130441;
 //BA.debugLineNum = 58130441;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=58130442;
 //BA.debugLineNum = 58130442;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=58130443;
 //BA.debugLineNum = 58130443;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "cargadocumentosalmacenmanual"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=58130444;
 //BA.debugLineNum = 58130444;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=58130445;
 //BA.debugLineNum = 58130445;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=58130448;
 //BA.debugLineNum = 58130448;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=58130449;
 //BA.debugLineNum = 58130449;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=58130450;
 //BA.debugLineNum = 58130450;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=58130452;
 //BA.debugLineNum = 58130452;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=58130453;
 //BA.debugLineNum = 58130453;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=58130454;
 //BA.debugLineNum = 58130454;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=58130455;
 //BA.debugLineNum = 58130455;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=58130458;
 //BA.debugLineNum = 58130458;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=58130459;
 //BA.debugLineNum = 58130459;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrardatosbatchanterioresmaquinausuario(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "borrardatosbatchanterioresmaquinausuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrardatosbatchanterioresmaquinausuario", null));}
ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario rsub = new ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario extends BA.ResumableSub {
public ResumableSub_BorrarDatosBatchAnterioresMaquinaUsuario(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57868291;
 //BA.debugLineNum = 57868291;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=57868292;
 //BA.debugLineNum = 57868292;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarLineasFaseActualDocumentoBacthMaquinaUsuario",new Object[]{(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ )});
RDebugUtils.currentLine=57868293;
 //BA.debugLineNum = 57868293;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=57868294;
 //BA.debugLineNum = 57868294;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=57868295;
 //BA.debugLineNum = 57868295;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresmaquinausuario"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=57868297;
 //BA.debugLineNum = 57868297;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=57868298;
 //BA.debugLineNum = 57868298;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query BorrarLineasFaseActualDocumentoBacthMaquinaUsuario","Error");
RDebugUtils.currentLine=57868299;
 //BA.debugLineNum = 57868299;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "borrardatosbatchanterioresmaquinausuario"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=57868300;
 //BA.debugLineNum = 57868300;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=57868302;
 //BA.debugLineNum = 57868302;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=57868304;
 //BA.debugLineNum = 57868304;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _borrardocumentosalmacenmanualnoenbatch(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "borrardocumentosalmacenmanualnoenbatch", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "borrardocumentosalmacenmanualnoenbatch", null));}
ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch rsub = new ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch extends BA.ResumableSub {
public ResumableSub_BorrarDocumentosAlmacenManualNoEnBatch(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=58064899;
 //BA.debugLineNum = 58064899;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Bor";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarDocumentosAlmacenManualNoEnBatch",new Object[]{(Object)(__ref._uuidsesion /*String*/ )});
RDebugUtils.currentLine=58064900;
 //BA.debugLineNum = 58064900;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=58064902;
 //BA.debugLineNum = 58064902;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=58064903;
 //BA.debugLineNum = 58064903;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "borrardocumentosalmacenmanualnoenbatch"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=58064905;
 //BA.debugLineNum = 58064905;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=58064906;
 //BA.debugLineNum = 58064906;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query BorrarDocumentosAlmacenManualNoEnBatch","Error");
RDebugUtils.currentLine=58064907;
 //BA.debugLineNum = 58064907;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "borrardocumentosalmacenmanualnoenbatch"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
RDebugUtils.currentLine=58064908;
 //BA.debugLineNum = 58064908;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=58064910;
 //BA.debugLineNum = 58064910;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=58064912;
 //BA.debugLineNum = 58064912;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnactualizar_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnactualizar_click", false))
	 {return ((String) Debug.delegate(ba, "btnactualizar_click", null));}
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Private Sub btnActualizar_Click";
RDebugUtils.currentLine=57409537;
 //BA.debugLineNum = 57409537;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="End Sub";
return "";
}
public String  _btndocnav_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btndocnav_click", false))
	 {return ((String) Debug.delegate(ba, "btndocnav_click", null));}
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Private Sub btnDocNAV_Click";
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="End Sub";
return "";
}
public String  _btnejemplo_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnejemplo_click", false))
	 {return ((String) Debug.delegate(ba, "btnejemplo_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Private Sub btnEjemplo_Click";
RDebugUtils.currentLine=57475073;
 //BA.debugLineNum = 57475073;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=57475074;
 //BA.debugLineNum = 57475074;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=57475075;
 //BA.debugLineNum = 57475075;BA.debugLine="Log(mData)";
__c.LogImpl("857475075",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=57475076;
 //BA.debugLineNum = 57475076;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=57475077;
 //BA.debugLineNum = 57475077;BA.debugLine="End Sub";
return "";
}
public String  _btnfasesdoc_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnfasesdoc_click", false))
	 {return ((String) Debug.delegate(ba, "btnfasesdoc_click", null));}
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _docsel = "";
b4j.docU.cfasesdocumento _cfdoc = null;
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Private Sub btnFasesDoc_Click";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=57737219;
 //BA.debugLineNum = 57737219;BA.debugLine="Log(mData)";
__c.LogImpl("857737219",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=57737222;
 //BA.debugLineNum = 57737222;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=57737224;
 //BA.debugLineNum = 57737224;BA.debugLine="Dim cFDoc As cFasesDocumento";
_cfdoc = new b4j.docU.cfasesdocumento();
RDebugUtils.currentLine=57737225;
 //BA.debugLineNum = 57737225;BA.debugLine="cFDoc.Initialize(Me, frm.RootPane,DocSel)";
_cfdoc._initialize /*String*/ (null,ba,this,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),_docsel);
RDebugUtils.currentLine=57737226;
 //BA.debugLineNum = 57737226;BA.debugLine="cFDoc.Show";
_cfdoc._show /*void*/ (null);
RDebugUtils.currentLine=57737227;
 //BA.debugLineNum = 57737227;BA.debugLine="End Sub";
return "";
}
public void  _btngetinfo_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btngetinfo_click", false))
	 {Debug.delegate(ba, "btngetinfo_click", null); return;}
ResumableSub_btnGetInfo_Click rsub = new ResumableSub_btnGetInfo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnGetInfo_Click extends BA.ResumableSub {
public ResumableSub_btnGetInfo_Click(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="If FechaFinalLong=0 Or FechaInicialLong=0 Then";
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
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Indica fecha";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Indica fecha inicial y fecha final.","Error");
RDebugUtils.currentLine=58327043;
 //BA.debugLineNum = 58327043;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btngetinfo_click"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 4;
;
RDebugUtils.currentLine=58327044;
 //BA.debugLineNum = 58327044;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=58327046;
 //BA.debugLineNum = 58327046;BA.debugLine="If FechaFinalLong<FechaInicialLong Then";

case 4:
//if
this.state = 7;
if (__ref._fechafinallong /*long*/ <__ref._fechainiciallong /*long*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=58327047;
 //BA.debugLineNum = 58327047;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La fecha fina";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"La fecha final no puede ser anterior a la fecha inicial.","Error");
RDebugUtils.currentLine=58327048;
 //BA.debugLineNum = 58327048;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btngetinfo_click"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
RDebugUtils.currentLine=58327049;
 //BA.debugLineNum = 58327049;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=58327051;
 //BA.debugLineNum = 58327051;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=58327052;
 //BA.debugLineNum = 58327052;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnmostrardocumentoennavision_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnmostrardocumentoennavision_click", false))
	 {Debug.delegate(ba, "btnmostrardocumentoennavision_click", null); return;}
ResumableSub_btnMostrarDocumentoEnNavision_Click rsub = new ResumableSub_btnMostrarDocumentoEnNavision_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnMostrarDocumentoEnNavision_Click extends BA.ResumableSub {
public ResumableSub_btnMostrarDocumentoEnNavision_Click(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
String _docsel = "";
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=58261507;
 //BA.debugLineNum = 58261507;BA.debugLine="Log(mData)";
parent.__c.LogImpl("858261507",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=58261508;
 //BA.debugLineNum = 58261508;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=58261510;
 //BA.debugLineNum = 58261510;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=58261511;
 //BA.debugLineNum = 58261511;BA.debugLine="Select True";
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
RDebugUtils.currentLine=58261513;
 //BA.debugLineNum = 58261513;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico Albaranes Venta",(int) (130),"No.",_docsel);
 if (true) break;

case 5:
//C
this.state = 8;
RDebugUtils.currentLine=58261515;
 //BA.debugLineNum = 58261515;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico recep. transferencia",(int) (5745),"No.",_docsel);
 if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=58261517;
 //BA.debugLineNum = 58261517;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico envío devolución",(int) (6650),"No.",_docsel);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=58261523;
 //BA.debugLineNum = 58261523;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btnmostrardocumentoennavision_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=58261525;
 //BA.debugLineNum = 58261525;BA.debugLine="If success Then";
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
RDebugUtils.currentLine=58261528;
 //BA.debugLineNum = 58261528;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir la ficha del documento "+_docsel+" en NAVISION.","Error");
RDebugUtils.currentLine=58261529;
 //BA.debugLineNum = 58261529;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btnmostrardocumentoennavision_click"), _msa);
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
RDebugUtils.currentLine=58261531;
 //BA.debugLineNum = 58261531;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="End Sub";
return "";
}
public void  _btnselalmfisico_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnselalmfisico_click", false))
	 {Debug.delegate(ba, "btnselalmfisico_click", null); return;}
ResumableSub_btnSelAlmFisico_Click rsub = new ResumableSub_btnSelAlmFisico_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelAlmFisico_Click extends BA.ResumableSub {
public ResumableSub_btnSelAlmFisico_Click(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
int step21;
int limit21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=57606147;
 //BA.debugLineNum = 57606147;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=57606148;
 //BA.debugLineNum = 57606148;BA.debugLine="Log(mData)";
parent.__c.LogImpl("857606148",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=57606149;
 //BA.debugLineNum = 57606149;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=57606151;
 //BA.debugLineNum = 57606151;BA.debugLine="Dim DocSel As String=mData.Get(\"Documento\")";
_docsel = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=57606154;
 //BA.debugLineNum = 57606154;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=57606156;
 //BA.debugLineNum = 57606156;BA.debugLine="Dialog.Title=\"Selecciona Almacén Físico de Prepar";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Almacén Físico de Preparación");
RDebugUtils.currentLine=57606157;
 //BA.debugLineNum = 57606157;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=57606158;
 //BA.debugLineNum = 57606158;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=57606159;
 //BA.debugLineNum = 57606159;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=57606160;
 //BA.debugLineNum = 57606160;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=57606161;
 //BA.debugLineNum = 57606161;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=57606163;
 //BA.debugLineNum = 57606163;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=57606164;
 //BA.debugLineNum = 57606164;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=57606165;
 //BA.debugLineNum = 57606165;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=57606167;
 //BA.debugLineNum = 57606167;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=57606168;
 //BA.debugLineNum = 57606168;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=57606170;
 //BA.debugLineNum = 57606170;BA.debugLine="Dim lstOpciones As List=Array As String(\"PROIN\",\"";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
_lstopciones = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"PROIN","PROTEC","ADESA"});
RDebugUtils.currentLine=57606172;
 //BA.debugLineNum = 57606172;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=57606174;
 //BA.debugLineNum = 57606174;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=57606176;
 //BA.debugLineNum = 57606176;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step21 = 1;
limit21 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 4;
if ((step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21)) this.state = 3;
if (true) break;

case 20:
//C
this.state = 19;
_i = ((int)(0 + _i + step21)) ;
if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=57606177;
 //BA.debugLineNum = 57606177;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=57606181;
 //BA.debugLineNum = 57606181;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=57606182;
 //BA.debugLineNum = 57606182;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=57606184;
 //BA.debugLineNum = 57606184;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=57606185;
 //BA.debugLineNum = 57606185;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=57606186;
 //BA.debugLineNum = 57606186;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=57606189;
 //BA.debugLineNum = 57606189;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btnselalmfisico_click"), _rsub);
this.state = 21;
return;
case 21:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=57606191;
 //BA.debugLineNum = 57606191;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=57606193;
 //BA.debugLineNum = 57606193;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=57606195;
 //BA.debugLineNum = 57606195;BA.debugLine="Dim AlmFis As String=B4XListDlg.SelectedItem";
_almfis = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=57606200;
 //BA.debugLineNum = 57606200;BA.debugLine="Dim lstComandos As List";
_lstcomandos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57606201;
 //BA.debugLineNum = 57606201;BA.debugLine="lstComandos.Initialize";
_lstcomandos.Initialize();
RDebugUtils.currentLine=57606203;
 //BA.debugLineNum = 57606203;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"B";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("BorrarDocumentoAlmacenManual",new Object[]{(Object)(_docsel)});
RDebugUtils.currentLine=57606204;
 //BA.debugLineNum = 57606204;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=57606205;
 //BA.debugLineNum = 57606205;BA.debugLine="Dim cmd As DBCommand = JRDCQuery.CreateCommand(\"I";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("InsertarDocumentoAlmacenManual",new Object[]{(Object)(_docsel),(Object)(_almfis)});
RDebugUtils.currentLine=57606206;
 //BA.debugLineNum = 57606206;BA.debugLine="lstComandos.Add(cmd)";
_lstcomandos.Add((Object)(_cmd));
RDebugUtils.currentLine=57606207;
 //BA.debugLineNum = 57606207;BA.debugLine="wait for (JRDCQuery.ExecuteBatch(Main.rdclinkMySq";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btnselalmfisico_click"), parent._jrdcquery._executebatch /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcomandos));
this.state = 22;
return;
case 22:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=57606208;
 //BA.debugLineNum = 57606208;BA.debugLine="If Success=False Then";
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
RDebugUtils.currentLine=57606209;
 //BA.debugLineNum = 57606209;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido po";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible actualizar el almacén físico para el documento "+_docsel+".","Error");
RDebugUtils.currentLine=57606210;
 //BA.debugLineNum = 57606210;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btnselalmfisico_click"), _msa);
this.state = 23;
return;
case 23:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=57606215;
 //BA.debugLineNum = 57606215;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselfechafinal_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnselfechafinal_click", false))
	 {Debug.delegate(ba, "btnselfechafinal_click", null); return;}
ResumableSub_btnSelFechaFinal_Click rsub = new ResumableSub_btnSelFechaFinal_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFechaFinal_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaFinal_Click(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
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
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="Dialog.Title=\"Indica Fecha Final\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Final");
RDebugUtils.currentLine=58392580;
 //BA.debugLineNum = 58392580;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=58392581;
 //BA.debugLineNum = 58392581;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=58392582;
 //BA.debugLineNum = 58392582;BA.debugLine="If FechaFinalLong=0 Then";
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
RDebugUtils.currentLine=58392583;
 //BA.debugLineNum = 58392583;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=58392585;
 //BA.debugLineNum = 58392585;BA.debugLine="B4XDateDlg.Date=FechaFinalLong";
_b4xdatedlg._setdate /*long*/ (null,__ref._fechafinallong /*long*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=58392587;
 //BA.debugLineNum = 58392587;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=58392588;
 //BA.debugLineNum = 58392588;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=58392589;
 //BA.debugLineNum = 58392589;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=58392592;
 //BA.debugLineNum = 58392592;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=58392593;
 //BA.debugLineNum = 58392593;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=58392594;
 //BA.debugLineNum = 58392594;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=58392595;
 //BA.debugLineNum = 58392595;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=58392596;
 //BA.debugLineNum = 58392596;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btnselfechafinal_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=58392597;
 //BA.debugLineNum = 58392597;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=58392598;
 //BA.debugLineNum = 58392598;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=58392599;
 //BA.debugLineNum = 58392599;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=58392601;
 //BA.debugLineNum = 58392601;BA.debugLine="Dim FechaFinSel As Long=B4XDateDlg.Date";
_fechafinsel = _b4xdatedlg._getdate /*long*/ (null);
RDebugUtils.currentLine=58392603;
 //BA.debugLineNum = 58392603;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=58392604;
 //BA.debugLineNum = 58392604;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=58392605;
 //BA.debugLineNum = 58392605;BA.debugLine="Dim FechaFinalHora As Long=FechaFinSel";
_fechafinalhora = _fechafinsel;
RDebugUtils.currentLine=58392606;
 //BA.debugLineNum = 58392606;BA.debugLine="FechaFinalLong=DateUtils.SetDate(DateTime.GetYear";
__ref._fechafinallong /*long*/  = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_fechafinalhora),parent.__c.DateTime.GetMonth(_fechafinalhora),parent.__c.DateTime.GetDayOfMonth(_fechafinalhora));
RDebugUtils.currentLine=58392607;
 //BA.debugLineNum = 58392607;BA.debugLine="FechaFinalLong=FechaFinalLong+DateTime.TicksPerDa";
__ref._fechafinallong /*long*/  = (long) (__ref._fechafinallong /*long*/ +parent.__c.DateTime.TicksPerDay-1);
RDebugUtils.currentLine=58392608;
 //BA.debugLineNum = 58392608;BA.debugLine="txtFechaFinal.Text=DateTime.Date(FechaFinalLong)";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechafinallong /*long*/ ));
RDebugUtils.currentLine=58392609;
 //BA.debugLineNum = 58392609;BA.debugLine="Log(DateUtils.TicksToString(FechaFinalLong))";
parent.__c.LogImpl("858392609",parent._dateutils._tickstostring(__ref._fechafinallong /*long*/ ),0);
RDebugUtils.currentLine=58392611;
 //BA.debugLineNum = 58392611;BA.debugLine="If FechaInicialLong=0 Then";
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
RDebugUtils.currentLine=58392612;
 //BA.debugLineNum = 58392612;BA.debugLine="FechaInicialLong=FechaFinalLong";
__ref._fechainiciallong /*long*/  = __ref._fechafinallong /*long*/ ;
RDebugUtils.currentLine=58392613;
 //BA.debugLineNum = 58392613;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialL";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechainiciallong /*long*/ ));
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=58392616;
 //BA.debugLineNum = 58392616;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=58392618;
 //BA.debugLineNum = 58392618;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnselfechainicial_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnselfechainicial_click", false))
	 {Debug.delegate(ba, "btnselfechainicial_click", null); return;}
ResumableSub_btnSelFechaInicial_Click rsub = new ResumableSub_btnSelFechaInicial_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSelFechaInicial_Click extends BA.ResumableSub {
public ResumableSub_btnSelFechaInicial_Click(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
float _offset_before_dialog = 0f;
b4j.docU.b4xdatetemplate _b4xdatedlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
long _fechainsel = 0L;
String _dateformatant = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="Dim offset_before_dialog As Float=  JamTableCLV1.";
_offset_before_dialog = (float) (__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getScrollViewOffsetY());
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="Dialog.Title=\"Indica Fecha Inicial\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Fecha Inicial");
RDebugUtils.currentLine=58458116;
 //BA.debugLineNum = 58458116;BA.debugLine="Dim B4XDateDlg As B4XDateTemplate";
_b4xdatedlg = new b4j.docU.b4xdatetemplate();
RDebugUtils.currentLine=58458117;
 //BA.debugLineNum = 58458117;BA.debugLine="B4XDateDlg.Initialize";
_b4xdatedlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=58458118;
 //BA.debugLineNum = 58458118;BA.debugLine="If FechaInicialLong=0 Then";
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
RDebugUtils.currentLine=58458119;
 //BA.debugLineNum = 58458119;BA.debugLine="B4XDateDlg.Date=DateTime.Now";
_b4xdatedlg._setdate /*long*/ (null,parent.__c.DateTime.getNow());
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=58458121;
 //BA.debugLineNum = 58458121;BA.debugLine="B4XDateDlg.Date=FechaInicialLong";
_b4xdatedlg._setdate /*long*/ (null,__ref._fechainiciallong /*long*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=58458123;
 //BA.debugLineNum = 58458123;BA.debugLine="B4XDateDlg.CloseOnSelection=True";
_b4xdatedlg._closeonselection /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=58458124;
 //BA.debugLineNum = 58458124;BA.debugLine="B4XDateDlg.FirstDay=1";
_b4xdatedlg._firstday /*int*/  = (int) (1);
RDebugUtils.currentLine=58458125;
 //BA.debugLineNum = 58458125;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XD";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xdatedlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=58458128;
 //BA.debugLineNum = 58458128;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=58458129;
 //BA.debugLineNum = 58458129;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=58458130;
 //BA.debugLineNum = 58458130;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=58458131;
 //BA.debugLineNum = 58458131;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=58458132;
 //BA.debugLineNum = 58458132;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btnselfechainicial_click"), _rsub);
this.state = 15;
return;
case 15:
//C
this.state = 7;
_rint = (int) result[1];
;
RDebugUtils.currentLine=58458133;
 //BA.debugLineNum = 58458133;BA.debugLine="JamTableCLV1.sv.ScrollViewOffsetY=offset_before_d";
__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getsv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setScrollViewOffsetY(_offset_before_dialog);
RDebugUtils.currentLine=58458134;
 //BA.debugLineNum = 58458134;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=58458135;
 //BA.debugLineNum = 58458135;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=58458137;
 //BA.debugLineNum = 58458137;BA.debugLine="Dim FechaInSel As Long=B4XDateDlg.Date";
_fechainsel = _b4xdatedlg._getdate /*long*/ (null);
RDebugUtils.currentLine=58458140;
 //BA.debugLineNum = 58458140;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=58458141;
 //BA.debugLineNum = 58458141;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=58458143;
 //BA.debugLineNum = 58458143;BA.debugLine="FechaInicialLong=DateUtils.SetDate(DateTime.GetYe";
__ref._fechainiciallong /*long*/  = parent._dateutils._setdate(parent.__c.DateTime.GetYear(_fechainsel),parent.__c.DateTime.GetMonth(_fechainsel),parent.__c.DateTime.GetDayOfMonth(_fechainsel));
RDebugUtils.currentLine=58458144;
 //BA.debugLineNum = 58458144;BA.debugLine="txtFechaInicial.Text=DateTime.date(FechaInicialLo";
__ref._txtfechainicial /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechainiciallong /*long*/ ));
RDebugUtils.currentLine=58458145;
 //BA.debugLineNum = 58458145;BA.debugLine="Log(DateUtils.TicksToString(FechaInicialLong))";
parent.__c.LogImpl("858458145",parent._dateutils._tickstostring(__ref._fechainiciallong /*long*/ ),0);
RDebugUtils.currentLine=58458147;
 //BA.debugLineNum = 58458147;BA.debugLine="If FechaFinalLong=0 Then";
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
RDebugUtils.currentLine=58458148;
 //BA.debugLineNum = 58458148;BA.debugLine="FechaFinalLong=FechaInicialLong";
__ref._fechafinallong /*long*/  = __ref._fechainiciallong /*long*/ ;
RDebugUtils.currentLine=58458149;
 //BA.debugLineNum = 58458149;BA.debugLine="txtFechaFinal.Text=DateTime.date(FechaFinalLong)";
__ref._txtfechafinal /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(parent.__c.DateTime.Date(__ref._fechafinallong /*long*/ ));
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=58458151;
 //BA.debugLineNum = 58458151;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=58458153;
 //BA.debugLineNum = 58458153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnselprioridad_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btnselprioridad_click", false))
	 {return ((String) Debug.delegate(ba, "btnselprioridad_click", null));}
RDebugUtils.currentLine=57671680;
 //BA.debugLineNum = 57671680;BA.debugLine="Private Sub btnSelPrioridad_Click";
RDebugUtils.currentLine=57671682;
 //BA.debugLineNum = 57671682;BA.debugLine="End Sub";
return "";
}
public void  _btntrazabilidadtransporte_click(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "btntrazabilidadtransporte_click", false))
	 {Debug.delegate(ba, "btntrazabilidadtransporte_click", null); return;}
ResumableSub_btnTrazabilidadTransporte_Click rsub = new ResumableSub_btnTrazabilidadTransporte_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnTrazabilidadTransporte_Click extends BA.ResumableSub {
public ResumableSub_btnTrazabilidadTransporte_Click(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4j.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
int _indexsel = 0;
String _responsablefase = "";
String _numexpedicion = "";
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57540609;
 //BA.debugLineNum = 57540609;BA.debugLine="Dim btn As Button=Sender";
_btn = new anywheresoftware.b4j.objects.ButtonWrapper();
_btn = (anywheresoftware.b4j.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ButtonWrapper(), (javafx.scene.control.Button)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=57540611;
 //BA.debugLineNum = 57540611;BA.debugLine="Dim mData As Map=JamTableCLV1.GetValue(JamTableCL";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getvalue /*Object*/ (null,__ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject()))))));
RDebugUtils.currentLine=57540612;
 //BA.debugLineNum = 57540612;BA.debugLine="Log(mData)";
parent.__c.LogImpl("857540612",BA.ObjectToString(_mdata),0);
RDebugUtils.currentLine=57540613;
 //BA.debugLineNum = 57540613;BA.debugLine="Dim IndexSel As Int=JamTableCLV1.GetItemFromView(";
_indexsel = __ref._jamtableclv1 /*b4j.docU.jamtableclv*/ ._getitemfromview /*int*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_btn.getObject())));
RDebugUtils.currentLine=57540615;
 //BA.debugLineNum = 57540615;BA.debugLine="Dim ResponsableFase As String=mData.Get(\"Responsa";
_responsablefase = BA.ObjectToString(_mdata.Get((Object)("ResponsableFase")));
RDebugUtils.currentLine=57540616;
 //BA.debugLineNum = 57540616;BA.debugLine="Dim NumExpedicion As String=mData.Get(\"NumExpedic";
_numexpedicion = BA.ObjectToString(_mdata.Get((Object)("NumExpedicion")));
RDebugUtils.currentLine=57540617;
 //BA.debugLineNum = 57540617;BA.debugLine="If NumExpedicion<>\"\" And ResponsableFase<>\"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((_numexpedicion).equals("") == false && (_responsablefase).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=57540618;
 //BA.debugLineNum = 57540618;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Ver traza";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Ver trazabilidad de transporte?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=57540619;
 //BA.debugLineNum = 57540619;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "btntrazabilidadtransporte_click"), _msa);
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=57540620;
 //BA.debugLineNum = 57540620;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=57540621;
 //BA.debugLineNum = 57540621;BA.debugLine="TrazabilidadTransporte(mData)";
__ref._trazabilidadtransporte /*void*/ (null,_mdata);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=57540624;
 //BA.debugLineNum = 57540624;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _trazabilidadtransporte(b4j.docU.ccontroldocumentosperiodo __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "trazabilidadtransporte", false))
	 {Debug.delegate(ba, "trazabilidadtransporte", new Object[] {_mdata}); return;}
ResumableSub_TrazabilidadTransporte rsub = new ResumableSub_TrazabilidadTransporte(this,__ref,_mdata);
rsub.resume(ba, null);
}
public static class ResumableSub_TrazabilidadTransporte extends BA.ResumableSub {
public ResumableSub_TrazabilidadTransporte(b4j.docU.ccontroldocumentosperiodo parent,b4j.docU.ccontroldocumentosperiodo __ref,anywheresoftware.b4a.objects.collections.Map _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
this.__ref = parent;
}
b4j.docU.ccontroldocumentosperiodo __ref;
b4j.docU.ccontroldocumentosperiodo parent;
anywheresoftware.b4a.objects.collections.Map _mdata;
String _transporte = "";
String _expedicion = "";
String _expediciondhl = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
String _urltxt = "";
Object _msa = null;
b4j.docU.cinfoexpedicioncorreosexpress _cinfoexpedcorreosexp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ccontroldocumentosperiodo";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="Dim Transporte As String=mData.Get(\"ResponsableFa";
_transporte = BA.ObjectToString(_mdata.Get((Object)("ResponsableFase")));
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="Transporte=Transporte.ToUpperCase";
_transporte = _transporte.toUpperCase();
RDebugUtils.currentLine=58523651;
 //BA.debugLineNum = 58523651;BA.debugLine="Dim Expedicion As String=mData.Get(\"NumExpedicion";
_expedicion = BA.ObjectToString(_mdata.Get((Object)("NumExpedicion")));
RDebugUtils.currentLine=58523652;
 //BA.debugLineNum = 58523652;BA.debugLine="Expedicion=Expedicion.ToUpperCase";
_expedicion = _expedicion.toUpperCase();
RDebugUtils.currentLine=58523653;
 //BA.debugLineNum = 58523653;BA.debugLine="Select Case Transporte";
if (true) break;

case 1:
//select
this.state = 26;
switch (BA.switchObjectToInt(_transporte,"DHL","TXT","CORREOS EXPRESS")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 11;
if (true) break;
}
case 2: {
this.state = 23;
if (true) break;
}
default: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=58523657;
 //BA.debugLineNum = 58523657;BA.debugLine="Dim ExpedicionDHL As String";
_expediciondhl = "";
RDebugUtils.currentLine=58523658;
 //BA.debugLineNum = 58523658;BA.debugLine="If Expedicion.Length>=20 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_expedicion.length()>=20) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=58523659;
 //BA.debugLineNum = 58523659;BA.debugLine="ExpedicionDHL=Expedicion.SubString2(8,10)&Expe";
_expediciondhl = _expedicion.substring((int) (8),(int) (10))+_expedicion.substring((int) (12),(int) (20));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=58523661;
 //BA.debugLineNum = 58523661;BA.debugLine="ExpedicionDHL=Expedicion";
_expediciondhl = _expedicion;
 if (true) break;

case 9:
//C
this.state = 26;
;
RDebugUtils.currentLine=58523663;
 //BA.debugLineNum = 58523663;BA.debugLine="fx.ShowExternalDocument(\"https://clientesparcel";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .ShowExternalDocument("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo="+_expediciondhl+"&anno=2017&lang=sp");
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=58523666;
 //BA.debugLineNum = 58523666;BA.debugLine="wait for(cmAuxTxT.ObtenerURLTrazabilidadExpedic";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "trazabilidadtransporte"), parent._cmauxtxt._obtenerurltrazabilidadexpediciontxt /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_expedicion));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=58523667;
 //BA.debugLineNum = 58523667;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=58523668;
 //BA.debugLineNum = 58523668;BA.debugLine="If Accion=\"OK\" Then";
if (true) break;

case 12:
//if
this.state = 21;
if ((_accion).equals("OK")) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=58523669;
 //BA.debugLineNum = 58523669;BA.debugLine="Dim URLtxt As String=mRes.Get(\"URL\")";
_urltxt = BA.ObjectToString(_mres.Get((Object)("URL")));
RDebugUtils.currentLine=58523670;
 //BA.debugLineNum = 58523670;BA.debugLine="If URLtxt<>\"\" Then";
if (true) break;

case 15:
//if
this.state = 20;
if ((_urltxt).equals("") == false) { 
this.state = 17;
}else {
this.state = 19;
}if (true) break;

case 17:
//C
this.state = 20;
RDebugUtils.currentLine=58523671;
 //BA.debugLineNum = 58523671;BA.debugLine="fx.ShowExternalDocument(URLtxt)";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .ShowExternalDocument(_urltxt);
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=58523673;
 //BA.debugLineNum = 58523673;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Método Url";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Método UrlTracking TXT devuelve cadena vacía.","Error");
RDebugUtils.currentLine=58523674;
 //BA.debugLineNum = 58523674;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "trazabilidadtransporte"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 20;
;
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

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=58523679;
 //BA.debugLineNum = 58523679;BA.debugLine="Dim cInfoExpedCorreosExp As cInfoExpedicionCorr";
_cinfoexpedcorreosexp = new b4j.docU.cinfoexpedicioncorreosexpress();
RDebugUtils.currentLine=58523680;
 //BA.debugLineNum = 58523680;BA.debugLine="cInfoExpedCorreosExp.Initialize(Expedicion)";
_cinfoexpedcorreosexp._initialize /*String*/ (null,ba,_expedicion);
RDebugUtils.currentLine=58523681;
 //BA.debugLineNum = 58523681;BA.debugLine="cInfoExpedCorreosExp.Show";
_cinfoexpedcorreosexp._show /*void*/ (null);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=58523684;
 //BA.debugLineNum = 58523684;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No es posible obtener información de trazabilidad de esta expedición mediante este formulario."+parent.__c.CRLF+parent.__c.CRLF+"Consultar con Logística.","Error");
RDebugUtils.currentLine=58523686;
 //BA.debugLineNum = 58523686;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ccontroldocumentosperiodo", "trazabilidadtransporte"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=58523691;
 //BA.debugLineNum = 58523691;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=56426499;
 //BA.debugLineNum = 56426499;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=56426501;
 //BA.debugLineNum = 56426501;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=56426503;
 //BA.debugLineNum = 56426503;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=56426506;
 //BA.debugLineNum = 56426506;BA.debugLine="Private JamTableCLV1 As JamTableCLV";
_jamtableclv1 = new b4j.docU.jamtableclv();
RDebugUtils.currentLine=56426507;
 //BA.debugLineNum = 56426507;BA.debugLine="Private txtAlmacenDocumento As TextField";
_txtalmacendocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426508;
 //BA.debugLineNum = 56426508;BA.debugLine="Private txtAlmacenFisico As TextField";
_txtalmacenfisico = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426509;
 //BA.debugLineNum = 56426509;BA.debugLine="Private txtCliente As TextField";
_txtcliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426510;
 //BA.debugLineNum = 56426510;BA.debugLine="Private txtDiasAcum As TextField";
_txtdiasacum = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426511;
 //BA.debugLineNum = 56426511;BA.debugLine="Private txtDocumento As TextField";
_txtdocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426512;
 //BA.debugLineNum = 56426512;BA.debugLine="Private txtFase As TextField";
_txtfase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426513;
 //BA.debugLineNum = 56426513;BA.debugLine="Private txtFechaDocumento As TextField";
_txtfechadocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426514;
 //BA.debugLineNum = 56426514;BA.debugLine="Private txtFechaFase As TextField";
_txtfechafase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426515;
 //BA.debugLineNum = 56426515;BA.debugLine="Private txtFechaReferencia As TextField";
_txtfechareferencia = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426516;
 //BA.debugLineNum = 56426516;BA.debugLine="Private txtInfoAdicionalFase As TextField";
_txtinfoadicionalfase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426517;
 //BA.debugLineNum = 56426517;BA.debugLine="Private txtNombreCliente As TextField";
_txtnombrecliente = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426518;
 //BA.debugLineNum = 56426518;BA.debugLine="Private txtObservaciones As TextField";
_txtobservaciones = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426519;
 //BA.debugLineNum = 56426519;BA.debugLine="Private txtPersonalizado As TextField";
_txtpersonalizado = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426520;
 //BA.debugLineNum = 56426520;BA.debugLine="Private txtPrioridad As TextField";
_txtprioridad = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426521;
 //BA.debugLineNum = 56426521;BA.debugLine="Private txtResponsableFase As TextField";
_txtresponsablefase = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426522;
 //BA.debugLineNum = 56426522;BA.debugLine="Private txtTipoDocumento As TextField";
_txttipodocumento = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426523;
 //BA.debugLineNum = 56426523;BA.debugLine="Private txtTotalImp As TextField";
_txttotalimp = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426524;
 //BA.debugLineNum = 56426524;BA.debugLine="Private txtTotalQty As TextField";
_txttotalqty = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426526;
 //BA.debugLineNum = 56426526;BA.debugLine="Private TimestampBatchFaseDocs As Long";
_timestampbatchfasedocs = 0L;
RDebugUtils.currentLine=56426527;
 //BA.debugLineNum = 56426527;BA.debugLine="Private UUIDSesion As String";
_uuidsesion = "";
RDebugUtils.currentLine=56426529;
 //BA.debugLineNum = 56426529;BA.debugLine="Private txtFechaInicial As TextField";
_txtfechainicial = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426530;
 //BA.debugLineNum = 56426530;BA.debugLine="Private btnSelFechaInicial As Button";
_btnselfechainicial = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=56426531;
 //BA.debugLineNum = 56426531;BA.debugLine="Private txtFechaFinal As TextField";
_txtfechafinal = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426532;
 //BA.debugLineNum = 56426532;BA.debugLine="Private btnSelFechaFinal As Button";
_btnselfechafinal = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=56426533;
 //BA.debugLineNum = 56426533;BA.debugLine="Private btnGetInfo As Button";
_btngetinfo = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=56426534;
 //BA.debugLineNum = 56426534;BA.debugLine="Private FechaInicialLong, FechaFinalLong As Long";
_fechainiciallong = 0L;
_fechafinallong = 0L;
RDebugUtils.currentLine=56426536;
 //BA.debugLineNum = 56426536;BA.debugLine="Private txtNumExpedicion As TextField";
_txtnumexpedicion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=56426537;
 //BA.debugLineNum = 56426537;BA.debugLine="Private btnTrazabilidadTransporte As Button";
_btntrazabilidadtransporte = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=56426539;
 //BA.debugLineNum = 56426539;BA.debugLine="Private JamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=56426540;
 //BA.debugLineNum = 56426540;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=57016321;
 //BA.debugLineNum = 57016321;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblAlbVtaDepNavLin"}))));
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=57016323;
 //BA.debugLineNum = 57016323;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAlbVtaDepNavLin";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblAlbVtaDepNavLin");
 };
RDebugUtils.currentLine=57016325;
 //BA.debugLineNum = 57016325;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=57016326;
 //BA.debugLineNum = 57016326;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=57016327;
 //BA.debugLineNum = 57016327;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblAlbVtaDepNavLin (");
RDebugUtils.currentLine=57016329;
 //BA.debugLineNum = 57016329;BA.debugLine="sbCrearTabla.Append(\"Fecha INTEGER,\")";
_sbcreartabla.Append("Fecha INTEGER,");
RDebugUtils.currentLine=57016330;
 //BA.debugLineNum = 57016330;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016331;
 //BA.debugLineNum = 57016331;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016332;
 //BA.debugLineNum = 57016332;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016333;
 //BA.debugLineNum = 57016333;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=57016334;
 //BA.debugLineNum = 57016334;BA.debugLine="sbCrearTabla.Append(\"Articulo TEXT COLLATE NOCASE";
_sbcreartabla.Append("Articulo TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016335;
 //BA.debugLineNum = 57016335;BA.debugLine="sbCrearTabla.Append(\"GRC TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("GRC TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016336;
 //BA.debugLineNum = 57016336;BA.debugLine="sbCrearTabla.Append(\"AlmOrig TEXT COLLATE NOCASE,";
_sbcreartabla.Append("AlmOrig TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016337;
 //BA.debugLineNum = 57016337;BA.debugLine="sbCrearTabla.Append(\"Almacen TEXT COLLATE NOCASE";
_sbcreartabla.Append("Almacen TEXT COLLATE NOCASE default 'PROIN',");
RDebugUtils.currentLine=57016338;
 //BA.debugLineNum = 57016338;BA.debugLine="sbCrearTabla.Append(\"Qty REAL,\")";
_sbcreartabla.Append("Qty REAL,");
RDebugUtils.currentLine=57016339;
 //BA.debugLineNum = 57016339;BA.debugLine="sbCrearTabla.Append(\"Precio REAL,\")";
_sbcreartabla.Append("Precio REAL,");
RDebugUtils.currentLine=57016340;
 //BA.debugLineNum = 57016340;BA.debugLine="sbCrearTabla.Append(\"Descuento REAL,\")";
_sbcreartabla.Append("Descuento REAL,");
RDebugUtils.currentLine=57016341;
 //BA.debugLineNum = 57016341;BA.debugLine="sbCrearTabla.Append(\"Importe REAL default 0,\")";
_sbcreartabla.Append("Importe REAL default 0,");
RDebugUtils.currentLine=57016342;
 //BA.debugLineNum = 57016342;BA.debugLine="sbCrearTabla.Append(\"Personalizado INTEGER,\")";
_sbcreartabla.Append("Personalizado INTEGER,");
RDebugUtils.currentLine=57016343;
 //BA.debugLineNum = 57016343;BA.debugLine="sbCrearTabla.Append(\"Pedido TEXT COLLATE NOCASE,\"";
_sbcreartabla.Append("Pedido TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016344;
 //BA.debugLineNum = 57016344;BA.debugLine="sbCrearTabla.Append(\"FechaPedido TEXT COLLATE NOC";
_sbcreartabla.Append("FechaPedido TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016345;
 //BA.debugLineNum = 57016345;BA.debugLine="sbCrearTabla.Append(\"FechaProm INTEGER,\")";
_sbcreartabla.Append("FechaProm INTEGER,");
RDebugUtils.currentLine=57016346;
 //BA.debugLineNum = 57016346;BA.debugLine="sbCrearTabla.Append(\"FechaReq INTEGER,\")";
_sbcreartabla.Append("FechaReq INTEGER,");
RDebugUtils.currentLine=57016347;
 //BA.debugLineNum = 57016347;BA.debugLine="sbCrearTabla.Append(\"TipoDoc TEXT COLLATE NOCASE)";
_sbcreartabla.Append("TipoDoc TEXT COLLATE NOCASE)");
RDebugUtils.currentLine=57016348;
 //BA.debugLineNum = 57016348;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=57016351;
 //BA.debugLineNum = 57016351;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblDocumentosPeriodo"}))));
RDebugUtils.currentLine=57016352;
 //BA.debugLineNum = 57016352;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=57016353;
 //BA.debugLineNum = 57016353;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblDocumentosPerio";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblDocumentosPeriodo");
 };
RDebugUtils.currentLine=57016355;
 //BA.debugLineNum = 57016355;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=57016356;
 //BA.debugLineNum = 57016356;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=57016357;
 //BA.debugLineNum = 57016357;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblDocumentosPeriodo (");
RDebugUtils.currentLine=57016359;
 //BA.debugLineNum = 57016359;BA.debugLine="sbCrearTabla.Append(\"FechaDocumento INTEGER,\")";
_sbcreartabla.Append("FechaDocumento INTEGER,");
RDebugUtils.currentLine=57016360;
 //BA.debugLineNum = 57016360;BA.debugLine="sbCrearTabla.Append(\"Documento TEXT COLLATE NOCAS";
_sbcreartabla.Append("Documento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016361;
 //BA.debugLineNum = 57016361;BA.debugLine="sbCrearTabla.Append(\"Cliente TEXT COLLATE NOCASE,";
_sbcreartabla.Append("Cliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016362;
 //BA.debugLineNum = 57016362;BA.debugLine="sbCrearTabla.Append(\"NombreCliente TEXT COLLATE N";
_sbcreartabla.Append("NombreCliente TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016363;
 //BA.debugLineNum = 57016363;BA.debugLine="sbCrearTabla.Append(\"NombreResponsableCuenta TEXT";
_sbcreartabla.Append("NombreResponsableCuenta TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=57016364;
 //BA.debugLineNum = 57016364;BA.debugLine="sbCrearTabla.Append(\"AlmacenDocumento TEXT COLLAT";
_sbcreartabla.Append("AlmacenDocumento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016365;
 //BA.debugLineNum = 57016365;BA.debugLine="sbCrearTabla.Append(\"AlmacenFisico TEXT COLLATE N";
_sbcreartabla.Append("AlmacenFisico TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016366;
 //BA.debugLineNum = 57016366;BA.debugLine="sbCrearTabla.Append(\"TotalQty REAL,\")";
_sbcreartabla.Append("TotalQty REAL,");
RDebugUtils.currentLine=57016367;
 //BA.debugLineNum = 57016367;BA.debugLine="sbCrearTabla.Append(\"TotalImp REAL,\")";
_sbcreartabla.Append("TotalImp REAL,");
RDebugUtils.currentLine=57016368;
 //BA.debugLineNum = 57016368;BA.debugLine="sbCrearTabla.Append(\"Personalizado TEXT COLLATE N";
_sbcreartabla.Append("Personalizado TEXT COLLATE NOCASE default 'NO',");
RDebugUtils.currentLine=57016372;
 //BA.debugLineNum = 57016372;BA.debugLine="sbCrearTabla.Append(\"TipoDocumento TEXT COLLATE N";
_sbcreartabla.Append("TipoDocumento TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=57016373;
 //BA.debugLineNum = 57016373;BA.debugLine="sbCrearTabla.Append(\"Prioridad TEXT COLLATE NOCAS";
_sbcreartabla.Append("Prioridad TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=57016374;
 //BA.debugLineNum = 57016374;BA.debugLine="sbCrearTabla.Append(\"Fase TEXT COLLATE NOCASE def";
_sbcreartabla.Append("Fase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=57016375;
 //BA.debugLineNum = 57016375;BA.debugLine="sbCrearTabla.Append(\"Gestionado INTEGER default 0";
_sbcreartabla.Append("Gestionado INTEGER default 0,");
RDebugUtils.currentLine=57016376;
 //BA.debugLineNum = 57016376;BA.debugLine="sbCrearTabla.Append(\"FechaFase INTEGER default 0,";
_sbcreartabla.Append("FechaFase INTEGER default 0,");
RDebugUtils.currentLine=57016377;
 //BA.debugLineNum = 57016377;BA.debugLine="sbCrearTabla.Append(\"ResponsableFase TEXT COLLATE";
_sbcreartabla.Append("ResponsableFase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=57016378;
 //BA.debugLineNum = 57016378;BA.debugLine="sbCrearTabla.Append(\"InfoAdicionalFase TEXT COLLA";
_sbcreartabla.Append("InfoAdicionalFase TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=57016379;
 //BA.debugLineNum = 57016379;BA.debugLine="sbCrearTabla.Append(\"NumExpedicion TEXT COLLATE N";
_sbcreartabla.Append("NumExpedicion TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=57016380;
 //BA.debugLineNum = 57016380;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
_sbcreartabla.Append("Observaciones TEXT COLLATE NOCASE default '')");
RDebugUtils.currentLine=57016381;
 //BA.debugLineNum = 57016381;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=57016398;
 //BA.debugLineNum = 57016398;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.ccontroldocumentosperiodo __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="End Sub";
return "";
}
public String  _generaruuidv4(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "generaruuidv4", false))
	 {return ((String) Debug.delegate(ba, "generaruuidv4", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
int _c = 0;
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Sub GenerarUUIDv4 As String";
RDebugUtils.currentLine=57147393;
 //BA.debugLineNum = 57147393;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=57147395;
 //BA.debugLineNum = 57147395;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
RDebugUtils.currentLine=57147396;
 //BA.debugLineNum = 57147396;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=57147397;
 //BA.debugLineNum = 57147397;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=57147398;
 //BA.debugLineNum = 57147398;BA.debugLine="Dim c As Int = Rnd(0, 16)";
_c = __c.Rnd((int) (0),(int) (16));
RDebugUtils.currentLine=57147399;
 //BA.debugLineNum = 57147399;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
if (_c<10) { 
_c = (int) (_c+48);}
else {
_c = (int) (_c+55);};
RDebugUtils.currentLine=57147400;
 //BA.debugLineNum = 57147400;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
if (_sb.getLength()==19) { 
_c = __c.Asc(BA.ObjectToChar("8"));};
RDebugUtils.currentLine=57147401;
 //BA.debugLineNum = 57147401;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
if (_sb.getLength()==14) { 
_c = __c.Asc(BA.ObjectToChar("4"));};
RDebugUtils.currentLine=57147402;
 //BA.debugLineNum = 57147402;BA.debugLine="sb.Append(Chr(c))";
_sb.Append(BA.ObjectToString(__c.Chr(_c)));
 }
};
 }
};
RDebugUtils.currentLine=57147405;
 //BA.debugLineNum = 57147405;BA.debugLine="Return sb.ToString.ToLowerCase";
if (true) return _sb.ToString().toLowerCase();
RDebugUtils.currentLine=57147406;
 //BA.debugLineNum = 57147406;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_accionsalirjamtableclv(b4j.docU.ccontroldocumentosperiodo __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "jamtableclv1_accionsalirjamtableclv", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_accionsalirjamtableclv", null));}
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Sub JamTableCLV1_AccionSalirJamTableCLV";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemclick(b4j.docU.ccontroldocumentosperiodo __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=57278464;
 //BA.debugLineNum = 57278464;BA.debugLine="Sub JamTableCLV1_ItemClick(Index As Int, Value As";
RDebugUtils.currentLine=57278465;
 //BA.debugLineNum = 57278465;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=57278466;
 //BA.debugLineNum = 57278466;BA.debugLine="Log(\"Datos Item seleccionado (\" & Index & \"): \" )";
__c.LogImpl("857278466","Datos Item seleccionado ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=57278467;
 //BA.debugLineNum = 57278467;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=57278468;
 //BA.debugLineNum = 57278468;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("857278468",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=57278470;
 //BA.debugLineNum = 57278470;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_itemlongclick(b4j.docU.ccontroldocumentosperiodo __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "jamtableclv1_itemlongclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_itemlongclick", new Object[] {_index,_value}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
Object _k = null;
RDebugUtils.currentLine=57344000;
 //BA.debugLineNum = 57344000;BA.debugLine="Sub JamTableCLV1_ItemLongClick(Index As Int, Value";
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="Dim mData As Map=Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_value));
RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="Log(\"Datos Item seleccionado botón secundario (\"";
__c.LogImpl("857344002","Datos Item seleccionado botón secundario ("+BA.NumberToString(_index)+"): ",0);
RDebugUtils.currentLine=57344003;
 //BA.debugLineNum = 57344003;BA.debugLine="For Each k In mData.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mdata.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = group3.Get(index3);
RDebugUtils.currentLine=57344004;
 //BA.debugLineNum = 57344004;BA.debugLine="Log(k & \": \" & mData.Get(k))";
__c.LogImpl("857344004",BA.ObjectToString(_k)+": "+BA.ObjectToString(_mdata.Get(_k)),0);
 }
};
RDebugUtils.currentLine=57344006;
 //BA.debugLineNum = 57344006;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_loadlayoutpanelitem(b4j.docU.ccontroldocumentosperiodo __ref,b4j.docU.jamtableclv._datositemindexclvjamtableclv _datositemindexclv) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "jamtableclv1_loadlayoutpanelitem", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_loadlayoutpanelitem", new Object[] {_datositemindexclv}));}
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
b4j.example.dateutils._period _perioddiasacum = null;
String _dateformatant = "";
String _timeformatant = "";
double _totalimp = 0;
double _totalqty = 0;
String _responsablefase = "";
String _numexpedicion = "";
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Sub JamTableCLV1_LoadLayoutPanelItem(DatosItemInde";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="Dim mData As Map=DatosItemIndexCLV.Value";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_datositemindexclv.Value /*Object*/ ));
RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="Dim pnl As B4XView=DatosItemIndexCLV.Panel";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = _datositemindexclv.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=57212931;
 //BA.debugLineNum = 57212931;BA.debugLine="pnl.LoadLayout(\"scrItemControlDocumentosPeriodo\")";
_pnl.LoadLayout("scrItemControlDocumentosPeriodo",ba);
RDebugUtils.currentLine=57212933;
 //BA.debugLineNum = 57212933;BA.debugLine="txtAlmacenDocumento.Text=mData.Get(\"AlmacenDocume";
__ref._txtalmacendocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("AlmacenDocumento"))));
RDebugUtils.currentLine=57212934;
 //BA.debugLineNum = 57212934;BA.debugLine="txtAlmacenFisico.Text=mData.Get(\"AlmacenFisico\")";
__ref._txtalmacenfisico /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("AlmacenFisico"))));
RDebugUtils.currentLine=57212935;
 //BA.debugLineNum = 57212935;BA.debugLine="txtCliente.Text=mData.Get(\"Cliente\")";
__ref._txtcliente /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Cliente"))));
RDebugUtils.currentLine=57212936;
 //BA.debugLineNum = 57212936;BA.debugLine="Dim PeriodDiasAcum As Period=DateUtils.PeriodBetw";
_perioddiasacum = _dateutils._periodbetweenindays(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaDocumento"))),__c.DateTime.getNow());
RDebugUtils.currentLine=57212937;
 //BA.debugLineNum = 57212937;BA.debugLine="txtDiasAcum.Text=PeriodDiasAcum.Days";
__ref._txtdiasacum /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.NumberToString(_perioddiasacum.Days));
RDebugUtils.currentLine=57212938;
 //BA.debugLineNum = 57212938;BA.debugLine="txtDocumento.Text=mData.Get(\"Documento\")";
__ref._txtdocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Documento"))));
RDebugUtils.currentLine=57212939;
 //BA.debugLineNum = 57212939;BA.debugLine="txtFase.Text=mData.Getdefault(\"Fase\",\"\")";
__ref._txtfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("Fase"),(Object)(""))));
RDebugUtils.currentLine=57212941;
 //BA.debugLineNum = 57212941;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=57212942;
 //BA.debugLineNum = 57212942;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=57212943;
 //BA.debugLineNum = 57212943;BA.debugLine="Dim TimeFormatAnt As String=DateTime.timeFormat";
_timeformatant = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=57212944;
 //BA.debugLineNum = 57212944;BA.debugLine="DateTime.TimeFormat	=\"HH:mm\"";
__c.DateTime.setTimeFormat("HH:mm");
RDebugUtils.currentLine=57212945;
 //BA.debugLineNum = 57212945;BA.debugLine="txtFechaDocumento.Text=DateTime.Date(mData.Get(\"F";
__ref._txtfechadocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.Get((Object)("FechaDocumento")))));
RDebugUtils.currentLine=57212946;
 //BA.debugLineNum = 57212946;BA.debugLine="If mData.Getdefault(\"FechaFase\",0)>0 Then";
if ((double)(BA.ObjectToNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0))))>0) { 
RDebugUtils.currentLine=57212947;
 //BA.debugLineNum = 57212947;BA.debugLine="txtFechaFase.Text=DateTime.date(mData.Getdefault";
__ref._txtfechafase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__c.DateTime.Date(BA.ObjectToLongNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0))))+" "+__c.DateTime.Time(BA.ObjectToLongNumber(_mdata.GetDefault((Object)("FechaFase"),(Object)(0)))));
 };
RDebugUtils.currentLine=57212949;
 //BA.debugLineNum = 57212949;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=57212950;
 //BA.debugLineNum = 57212950;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
__c.DateTime.setTimeFormat(_timeformatant);
RDebugUtils.currentLine=57212952;
 //BA.debugLineNum = 57212952;BA.debugLine="txtInfoAdicionalFase.Text=mData.Getdefault(\"InfoA";
__ref._txtinfoadicionalfase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("InfoAdicionalFase"),(Object)(""))));
RDebugUtils.currentLine=57212953;
 //BA.debugLineNum = 57212953;BA.debugLine="txtNombreCliente.Text=mData.Get(\"NombreCliente\")";
__ref._txtnombrecliente /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("NombreCliente"))));
RDebugUtils.currentLine=57212954;
 //BA.debugLineNum = 57212954;BA.debugLine="txtObservaciones.Text=mData.Getdefault(\"Observaci";
__ref._txtobservaciones /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("Observaciones"),(Object)(""))));
RDebugUtils.currentLine=57212955;
 //BA.debugLineNum = 57212955;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
__ref._txtpersonalizado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Personalizado"))));
RDebugUtils.currentLine=57212956;
 //BA.debugLineNum = 57212956;BA.debugLine="txtPrioridad.Text=mData.Getdefault(\"Prioridad\",\"\"";
__ref._txtprioridad /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("Prioridad"),(Object)(""))));
RDebugUtils.currentLine=57212957;
 //BA.debugLineNum = 57212957;BA.debugLine="txtResponsableFase.Text=mData.Getdefault(\"Respons";
__ref._txtresponsablefase /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("ResponsableFase"),(Object)(""))));
RDebugUtils.currentLine=57212958;
 //BA.debugLineNum = 57212958;BA.debugLine="txtTipoDocumento.Text=mData.Get(\"TipoDocumento\")";
__ref._txttipodocumento /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("TipoDocumento"))));
RDebugUtils.currentLine=57212959;
 //BA.debugLineNum = 57212959;BA.debugLine="Dim TotalImp As Double=mData.Get(\"TotalImp\")";
_totalimp = (double)(BA.ObjectToNumber(_mdata.Get((Object)("TotalImp"))));
RDebugUtils.currentLine=57212960;
 //BA.debugLineNum = 57212960;BA.debugLine="txtTotalImp.Text=Utilidades.FormatoNumerico2(Tota";
__ref._txttotalimp /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_utilidades._formatonumerico2 /*String*/ (_totalimp,(int) (1),(int) (0),(int) (0),__c.True));
RDebugUtils.currentLine=57212961;
 //BA.debugLineNum = 57212961;BA.debugLine="Dim TotalQty As Double=mData.Get(\"TotalQty\")";
_totalqty = (double)(BA.ObjectToNumber(_mdata.Get((Object)("TotalQty"))));
RDebugUtils.currentLine=57212962;
 //BA.debugLineNum = 57212962;BA.debugLine="txtTotalQty.Text=Utilidades.FormatoNumerico2(Tota";
__ref._txttotalqty /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(_utilidades._formatonumerico2 /*String*/ (_totalqty,(int) (1),(int) (0),(int) (0),__c.True));
RDebugUtils.currentLine=57212963;
 //BA.debugLineNum = 57212963;BA.debugLine="txtPersonalizado.Text=mData.Get(\"Personalizado\")";
__ref._txtpersonalizado /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.Get((Object)("Personalizado"))));
RDebugUtils.currentLine=57212965;
 //BA.debugLineNum = 57212965;BA.debugLine="txtNumExpedicion.Text=mData.GetDefault(\"NumExpedi";
__ref._txtnumexpedicion /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_mdata.GetDefault((Object)("NumExpedicion"),(Object)(""))));
RDebugUtils.currentLine=57212967;
 //BA.debugLineNum = 57212967;BA.debugLine="Dim ResponsableFase As String=mData.Get(\"Responsa";
_responsablefase = BA.ObjectToString(_mdata.Get((Object)("ResponsableFase")));
RDebugUtils.currentLine=57212968;
 //BA.debugLineNum = 57212968;BA.debugLine="Dim NumExpedicion As String=mData.Get(\"NumExpedic";
_numexpedicion = BA.ObjectToString(_mdata.Get((Object)("NumExpedicion")));
RDebugUtils.currentLine=57212970;
 //BA.debugLineNum = 57212970;BA.debugLine="btnTrazabilidadTransporte.Visible= NumExpedicion<";
__ref._btntrazabilidadtransporte /*anywheresoftware.b4j.objects.ButtonWrapper*/ .setVisible((_numexpedicion).equals("") == false && (_responsablefase).equals("") == false);
RDebugUtils.currentLine=57212972;
 //BA.debugLineNum = 57212972;BA.debugLine="End Sub";
return "";
}
public String  _jamtableclv1_menubarmenuitem_action(b4j.docU.ccontroldocumentosperiodo __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="ccontroldocumentosperiodo";
if (Debug.shouldDelegate(ba, "jamtableclv1_menubarmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableclv1_menubarmenuitem_action", new Object[] {_tagmenuitem}));}
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Sub JamTableCLV1_MenuBarMenuItem_Action(TagMenuIte";
RDebugUtils.currentLine=56950785;
 //BA.debugLineNum = 56950785;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar")) {
case 0: {
RDebugUtils.currentLine=56950787;
 //BA.debugLineNum = 56950787;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 break; }
}
;
RDebugUtils.currentLine=56950795;
 //BA.debugLineNum = 56950795;BA.debugLine="End Sub";
return "";
}
}