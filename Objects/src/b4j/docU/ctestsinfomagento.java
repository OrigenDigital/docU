package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class ctestsinfomagento extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.ctestsinfomagento", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.ctestsinfomagento.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnsalir = null;
public b4j.docU.jamtableview _jamtableview1 = null;
public b4j.docU.b4xdialog _dialog = null;
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public b4j.example.flexgrid _flexgriddialog = null;
public anywheresoftware.b4a.objects.B4XCanvas _measurementcanvas = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _permisomodulousuario = "";
public String _tk = "";
public b4j.docU.b4xcombobox _b4xcomboboxtablasb2b = null;
public b4j.docU.b4xcombobox _b4xcomboboxstores = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textareahttpresponse = null;
public anywheresoftware.b4j.objects.SplitPaneWrapper _splitpane1 = null;
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
public String  _initialize(b4j.docU.ctestsinfomagento __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=102301696;
 //BA.debugLineNum = 102301696;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=102301698;
 //BA.debugLineNum = 102301698;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=102301702;
 //BA.debugLineNum = 102301702;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=102301703;
 //BA.debugLineNum = 102301703;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=102301704;
 //BA.debugLineNum = 102301704;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=102301705;
 //BA.debugLineNum = 102301705;BA.debugLine="MeasurementCanvas.Initialize(p)";
__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=102301706;
 //BA.debugLineNum = 102301706;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.objects.ImageViewWrapper _imgv = null;
anywheresoftware.b4j.object.JavaObject _btnjo = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
Object _robj = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=102367234;
 //BA.debugLineNum = 102367234;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=102367235;
 //BA.debugLineNum = 102367235;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=102367237;
 //BA.debugLineNum = 102367237;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=102367238;
 //BA.debugLineNum = 102367238;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=102367239;
 //BA.debugLineNum = 102367239;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=102367242;
 //BA.debugLineNum = 102367242;BA.debugLine="frm.RootPane.LoadLayout(\"scrTestMagento\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrTestMagento");
RDebugUtils.currentLine=102367243;
 //BA.debugLineNum = 102367243;BA.debugLine="SplitPane1.LoadLayout(\"scrTestMagentoJamTableView";
__ref._splitpane1 /*anywheresoftware.b4j.objects.SplitPaneWrapper*/ .LoadLayout(ba,"scrTestMagentoJamTableView");
RDebugUtils.currentLine=102367244;
 //BA.debugLineNum = 102367244;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=102367245;
 //BA.debugLineNum = 102367245;BA.debugLine="SplitPane1.LoadLayout(\"scrTestMagentoHTTPResponse";
__ref._splitpane1 /*anywheresoftware.b4j.objects.SplitPaneWrapper*/ .LoadLayout(ba,"scrTestMagentoHTTPResponse");
RDebugUtils.currentLine=102367247;
 //BA.debugLineNum = 102367247;BA.debugLine="jamTableView1.EstadoMenuItem(\"Actualizar\",False)";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,"Actualizar",parent.__c.False);
RDebugUtils.currentLine=102367249;
 //BA.debugLineNum = 102367249;BA.debugLine="Dim img As Image=xui.LoadBitmapResize(File.DirAss";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_img = (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(parent.__c.File.getDirAssets(),"twotone_exit_black_24dp.png",(int) (16),(int) (16),parent.__c.True).getObject()));
RDebugUtils.currentLine=102367250;
 //BA.debugLineNum = 102367250;BA.debugLine="Dim imgV As ImageView";
_imgv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=102367251;
 //BA.debugLineNum = 102367251;BA.debugLine="imgV.Initialize(\"\")";
_imgv.Initialize(ba,"");
RDebugUtils.currentLine=102367252;
 //BA.debugLineNum = 102367252;BA.debugLine="imgV.SetImage(img)";
_imgv.SetImage((javafx.scene.image.Image)(_img.getObject()));
RDebugUtils.currentLine=102367253;
 //BA.debugLineNum = 102367253;BA.debugLine="Dim btnJO As JavaObject=btnSalir";
_btnjo = new anywheresoftware.b4j.object.JavaObject();
_btnjo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._btnsalir /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=102367254;
 //BA.debugLineNum = 102367254;BA.debugLine="btnJO.RunMethod(\"setGraphic\",Array(imgV))";
_btnjo.RunMethod("setGraphic",new Object[]{(Object)(_imgv.getObject())});
RDebugUtils.currentLine=102367257;
 //BA.debugLineNum = 102367257;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"B2B\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"B2B");
RDebugUtils.currentLine=102367329;
 //BA.debugLineNum = 102367329;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=102367330;
 //BA.debugLineNum = 102367330;BA.debugLine="JamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=102367338;
 //BA.debugLineNum = 102367338;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=102367342;
 //BA.debugLineNum = 102367342;BA.debugLine="Wait For(CargaDatosCredenciales) complete (mRes A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "show"), __ref._cargadatoscredenciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=102367343;
 //BA.debugLineNum = 102367343;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=102367344;
 //BA.debugLineNum = 102367344;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=102367345;
 //BA.debugLineNum = 102367345;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error cre";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "show"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error credenciales."));
this.state = 7;
return;
case 7:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=102367346;
 //BA.debugLineNum = 102367346;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=102367348;
 //BA.debugLineNum = 102367348;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=102367349;
 //BA.debugLineNum = 102367349;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=102367350;
 //BA.debugLineNum = 102367350;BA.debugLine="tk=mData0.GetValueAt(0)";
__ref._tk /*String*/  = BA.ObjectToString(_mdata0.GetValueAt((int) (0)));
RDebugUtils.currentLine=102367352;
 //BA.debugLineNum = 102367352;BA.debugLine="B4XComboBoxTablasB2B.SetItems(Array As String(\"\",";
__ref._b4xcomboboxtablasb2b /*b4j.docU.b4xcombobox*/ ._setitems /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"","Stores","Grupos Cliente","Clientes","Direcciones Cliente","Categorias Productos","Productos","Valores Atributo size (Tallas Productos)","Pedidos"}));
RDebugUtils.currentLine=102367354;
 //BA.debugLineNum = 102367354;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosmysql(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "actualizardatosmysql", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosmysql", null));}
ResumableSub_ActualizarDatosMysql rsub = new ResumableSub_ActualizarDatosMysql(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosMysql extends BA.ResumableSub {
public ResumableSub_ActualizarDatosMysql(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=102825985;
 //BA.debugLineNum = 102825985;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblDatosFormulario";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblDatosFormulario");
RDebugUtils.currentLine=102825986;
 //BA.debugLineNum = 102825986;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=102825987;
 //BA.debugLineNum = 102825987;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=102825988;
 //BA.debugLineNum = 102825988;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=102825989;
 //BA.debugLineNum = 102825989;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
_slinkjrdc = parent._main._rdclinknav /*String*/ ;
RDebugUtils.currentLine=102825990;
 //BA.debugLineNum = 102825990;BA.debugLine="Dim Comando As String=\"\"";
_comando = "";
RDebugUtils.currentLine=102825991;
 //BA.debugLineNum = 102825991;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=102825993;
 //BA.debugLineNum = 102825993;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "actualizardatosmysql"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=102825994;
 //BA.debugLineNum = 102825994;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=102825995;
 //BA.debugLineNum = 102825995;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=102825996;
 //BA.debugLineNum = 102825996;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "actualizardatosmysql"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=102825997;
 //BA.debugLineNum = 102825997;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=102825998;
 //BA.debugLineNum = 102825998;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=102826001;
 //BA.debugLineNum = 102826001;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=102826002;
 //BA.debugLineNum = 102826002;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=102826003;
 //BA.debugLineNum = 102826003;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=102826004;
 //BA.debugLineNum = 102826004;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de .............","Aviso");
RDebugUtils.currentLine=102826005;
 //BA.debugLineNum = 102826005;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "actualizardatosmysql"), _msa);
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
RDebugUtils.currentLine=102826007;
 //BA.debugLineNum = 102826007;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=102826008;
 //BA.debugLineNum = 102826008;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=102826011;
 //BA.debugLineNum = 102826011;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=102826019;
 //BA.debugLineNum = 102826019;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblDatosFormulario\",ls";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblDatosFormulario",_lstreg);
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
RDebugUtils.currentLine=102826022;
 //BA.debugLineNum = 102826022;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=102826023;
 //BA.debugLineNum = 102826023;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _alternarexcluidoreclamacion(b4j.docU.ctestsinfomagento __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "alternarexcluidoreclamacion", false))
	 {return ((String) Debug.delegate(ba, "alternarexcluidoreclamacion", new Object[] {_datosceldaseleccionada}));}
int _valoractual = 0;
int _nuevovalor = 0;
anywheresoftware.b4a.objects.collections.Map _mpk = null;
String _pedidosel = "";
String _lineasel = "";
RDebugUtils.currentLine=103219200;
 //BA.debugLineNum = 103219200;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
RDebugUtils.currentLine=103219201;
 //BA.debugLineNum = 103219201;BA.debugLine="Log(DatosCeldaSeleccionada)";
__c.LogImpl("8103219201",BA.ObjectToString(_datosceldaseleccionada),0);
RDebugUtils.currentLine=103219202;
 //BA.debugLineNum = 103219202;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
_valoractual = (int)(BA.ObjectToNumber(_datosceldaseleccionada.ValorCelda /*Object*/ ));
RDebugUtils.currentLine=103219203;
 //BA.debugLineNum = 103219203;BA.debugLine="Dim NuevoValor As Int";
_nuevovalor = 0;
RDebugUtils.currentLine=103219204;
 //BA.debugLineNum = 103219204;BA.debugLine="Select ValorActual";
switch (_valoractual) {
case 0: {
RDebugUtils.currentLine=103219206;
 //BA.debugLineNum = 103219206;BA.debugLine="NuevoValor=1";
_nuevovalor = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=103219209;
 //BA.debugLineNum = 103219209;BA.debugLine="NuevoValor=0";
_nuevovalor = (int) (0);
 break; }
}
;
RDebugUtils.currentLine=103219211;
 //BA.debugLineNum = 103219211;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=103219212;
 //BA.debugLineNum = 103219212;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
_pedidosel = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=103219213;
 //BA.debugLineNum = 103219213;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
_lineasel = BA.ObjectToString(_mpk.Get((Object)("Linea")));
RDebugUtils.currentLine=103219214;
 //BA.debugLineNum = 103219214;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nuevovalor),(Object)(_pedidosel),(Object)(_lineasel)}));
RDebugUtils.currentLine=103219215;
 //BA.debugLineNum = 103219215;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._refrescartablavalorceldaeditada /*String*/ (null,_datosceldaseleccionada.Fila /*int*/ ,_datosceldaseleccionada.Columna /*int*/ ,(Object)(_nuevovalor),_datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=103219216;
 //BA.debugLineNum = 103219216;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._seleccionarcelda /*String*/ (null,"ExcluidoReclamacion",_datosceldaseleccionada.Fila /*int*/ );
RDebugUtils.currentLine=103219217;
 //BA.debugLineNum = 103219217;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.ctestsinfomagento __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=102498304;
 //BA.debugLineNum = 102498304;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=102498305;
 //BA.debugLineNum = 102498305;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=102498306;
 //BA.debugLineNum = 102498306;BA.debugLine="End Sub";
return null;
}
public String  _b4xcomboboxstores_selectedindexchanged(b4j.docU.ctestsinfomagento __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "b4xcomboboxstores_selectedindexchanged", false))
	 {return ((String) Debug.delegate(ba, "b4xcomboboxstores_selectedindexchanged", new Object[] {_index}));}
RDebugUtils.currentLine=105644032;
 //BA.debugLineNum = 105644032;BA.debugLine="Private Sub B4XComboBoxStores_SelectedIndexChanged";
RDebugUtils.currentLine=105644034;
 //BA.debugLineNum = 105644034;BA.debugLine="End Sub";
return "";
}
public void  _b4xcomboboxtablasb2b_selectedindexchanged(b4j.docU.ctestsinfomagento __ref,int _index) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "b4xcomboboxtablasb2b_selectedindexchanged", false))
	 {Debug.delegate(ba, "b4xcomboboxtablasb2b_selectedindexchanged", new Object[] {_index}); return;}
ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged rsub = new ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged(this,__ref,_index);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged extends BA.ResumableSub {
public ResumableSub_B4XComboBoxTablasB2B_SelectedIndexChanged(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _index;
String _itemseleccionado = "";
int _idclientesel = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105578497;
 //BA.debugLineNum = 105578497;BA.debugLine="Dim ItemSeleccionado As String=B4XComboBoxTablasB";
_itemseleccionado = BA.ObjectToString(__ref._b4xcomboboxtablasb2b /*b4j.docU.b4xcombobox*/ ._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Get(_index));
RDebugUtils.currentLine=105578498;
 //BA.debugLineNum = 105578498;BA.debugLine="Select Case ItemSeleccionado";
if (true) break;

case 1:
//select
this.state = 26;
switch (BA.switchObjectToInt(_itemseleccionado,"","Stores","Grupos Cliente","Clientes","Direcciones Cliente","Productos","Valores Atributo size (Tallas Productos)","Pedidos","Categorias Productos")) {
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
this.state = 9;
if (true) break;
}
case 4: {
this.state = 11;
if (true) break;
}
case 5: {
this.state = 19;
if (true) break;
}
case 6: {
this.state = 21;
if (true) break;
}
case 7: {
this.state = 23;
if (true) break;
}
case 8: {
this.state = 25;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 26;
RDebugUtils.currentLine=105578500;
 //BA.debugLineNum = 105578500;BA.debugLine="jamTableView1.LimpiarTabla";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=105578501;
 //BA.debugLineNum = 105578501;BA.debugLine="TextAreaHTTPResponse.Text=\"\"";
__ref._textareahttpresponse /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText("");
 if (true) break;

case 5:
//C
this.state = 26;
RDebugUtils.currentLine=105578503;
 //BA.debugLineNum = 105578503;BA.debugLine="MostrarListaStoresMagento";
__ref._mostrarlistastoresmagento /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 26;
RDebugUtils.currentLine=105578505;
 //BA.debugLineNum = 105578505;BA.debugLine="MostrarListaGruposClienteMagento";
__ref._mostrarlistagruposclientemagento /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 26;
RDebugUtils.currentLine=105578507;
 //BA.debugLineNum = 105578507;BA.debugLine="MostrarListaClientesMagento";
__ref._mostrarlistaclientesmagento /*void*/ (null);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=105578509;
 //BA.debugLineNum = 105578509;BA.debugLine="Wait For(SeleccionarCliente) complete (IDClient";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "b4xcomboboxtablasb2b_selectedindexchanged"), __ref._seleccionarcliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 27;
return;
case 27:
//C
this.state = 12;
_idclientesel = (int) result[1];
;
RDebugUtils.currentLine=105578510;
 //BA.debugLineNum = 105578510;BA.debugLine="If IDClienteSel=-1 Then Return";
if (true) break;

case 12:
//if
this.state = 17;
if (_idclientesel==-1) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
if (true) return ;
if (true) break;

case 17:
//C
this.state = 26;
;
RDebugUtils.currentLine=105578511;
 //BA.debugLineNum = 105578511;BA.debugLine="MostrarDireccionesClienteMagento(IDClienteSel)";
__ref._mostrardireccionesclientemagento /*void*/ (null,_idclientesel);
 if (true) break;

case 19:
//C
this.state = 26;
RDebugUtils.currentLine=105578513;
 //BA.debugLineNum = 105578513;BA.debugLine="MostrarListaProductosMagento";
__ref._mostrarlistaproductosmagento /*void*/ (null);
 if (true) break;

case 21:
//C
this.state = 26;
RDebugUtils.currentLine=105578515;
 //BA.debugLineNum = 105578515;BA.debugLine="MostrarValoresAtributoSizeProductos";
__ref._mostrarvaloresatributosizeproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=105578517;
 //BA.debugLineNum = 105578517;BA.debugLine="MostrarPedidos";
__ref._mostrarpedidos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=105578519;
 //BA.debugLineNum = 105578519;BA.debugLine="MostrarListaCategoriasMagento";
__ref._mostrarlistacategoriasmagento /*void*/ (null);
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=105578522;
 //BA.debugLineNum = 105578522;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarlistastoresmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrarlistastoresmagento", false))
	 {Debug.delegate(ba, "mostrarlistastoresmagento", null); return;}
ResumableSub_MostrarListaStoresMagento rsub = new ResumableSub_MostrarListaStoresMagento(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarListaStoresMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaStoresMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.objects.collections.List _lstmaprecords = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsrowids = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
int _result = 0;
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
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103350273;
 //BA.debugLineNum = 103350273;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Sto";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Stores..."));
RDebugUtils.currentLine=103350274;
 //BA.debugLineNum = 103350274;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=103350275;
 //BA.debugLineNum = 103350275;BA.debugLine="Wait For(CargaListaStoresMagento) complete (Succe";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"), __ref._cargalistastoresmagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=103350276;
 //BA.debugLineNum = 103350276;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=103350277;
 //BA.debugLineNum = 103350277;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=103350278;
 //BA.debugLineNum = 103350278;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Stores B2B"));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=103350279;
 //BA.debugLineNum = 103350279;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=103350282;
 //BA.debugLineNum = 103350282;BA.debugLine="Dim lstMapRecords As List";
_lstmaprecords = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=103350283;
 //BA.debugLineNum = 103350283;BA.debugLine="lstMapRecords.Initialize";
_lstmaprecords.Initialize();
RDebugUtils.currentLine=103350284;
 //BA.debugLineNum = 103350284;BA.debugLine="Dim rsRowIDs As ResultSet=mSQL.ExecQuery(\"select";
_rsrowids = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsrowids = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select rowid from tblB2BStores");
RDebugUtils.currentLine=103350285;
 //BA.debugLineNum = 103350285;BA.debugLine="Do While rsRowIDs.NextRow";
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsrowids.NextRow()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
RDebugUtils.currentLine=103350286;
 //BA.debugLineNum = 103350286;BA.debugLine="Dim mData As Map=DBUtils.ExecuteMap(mSQL,\"select";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"select * from tblB2BStores where rowid=?",new String[]{BA.NumberToString(_rsrowids.GetInt("rowId"))});
RDebugUtils.currentLine=103350287;
 //BA.debugLineNum = 103350287;BA.debugLine="lstMapRecords.Add(mData)";
_lstmaprecords.Add((Object)(_mdata.getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=103350289;
 //BA.debugLineNum = 103350289;BA.debugLine="rsRowIDs.Close";
_rsrowids.Close();
RDebugUtils.currentLine=103350291;
 //BA.debugLineNum = 103350291;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
_pbaseflexgrid = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbaseflexgrid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=103350292;
 //BA.debugLineNum = 103350292;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (500)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY())));
RDebugUtils.currentLine=103350293;
 //BA.debugLineNum = 103350293;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
_pbaseflexgrid.LoadLayout("scrDialogFlexGrid",ba);
RDebugUtils.currentLine=103350295;
 //BA.debugLineNum = 103350295;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
_headersfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_headersfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15)).getObject()));
RDebugUtils.currentLine=103350296;
 //BA.debugLineNum = 103350296;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv7((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject())));
RDebugUtils.currentLine=103350298;
 //BA.debugLineNum = 103350298;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
_rowsfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_rowsfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)).getObject()));
RDebugUtils.currentLine=103350299;
 //BA.debugLineNum = 103350299;BA.debugLine="FlexGridDialog.Font=RowsFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject())));
RDebugUtils.currentLine=103350300;
 //BA.debugLineNum = 103350300;BA.debugLine="Dim NumColumnasTablaTotales As Int=mData.Size";
_numcolumnastablatotales = _mdata.getSize();
RDebugUtils.currentLine=103350301;
 //BA.debugLineNum = 103350301;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
_anchoscolumnas = new int[_numcolumnastablatotales];
;
RDebugUtils.currentLine=103350302;
 //BA.debugLineNum = 103350302;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv1(_numcolumnastablatotales);
RDebugUtils.currentLine=103350303;
 //BA.debugLineNum = 103350303;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=103350304;
 //BA.debugLineNum = 103350304;BA.debugLine="For Each k As String In mData.Keys";
if (true) break;

case 9:
//for
this.state = 16;
group28 = _mdata.Keys();
index28 = 0;
groupLen28 = group28.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 16;
if (index28 < groupLen28) {
this.state = 11;
_k = BA.ObjectToString(group28.Get(index28));}
if (true) break;

case 38:
//C
this.state = 37;
index28++;
if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=103350305;
 //BA.debugLineNum = 103350305;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvv4(_colindex,_k);
RDebugUtils.currentLine=103350307;
 //BA.debugLineNum = 103350307;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=103350308;
 //BA.debugLineNum = 103350308;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
if (true) break;

case 12:
//if
this.state = 15;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=103350309;
 //BA.debugLineNum = 103350309;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=103350310;
 //BA.debugLineNum = 103350310;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 15:
//C
this.state = 38;
;
RDebugUtils.currentLine=103350313;
 //BA.debugLineNum = 103350313;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=103350316;
 //BA.debugLineNum = 103350316;BA.debugLine="For Each mDatos As Map In lstMapRecords";

case 16:
//for
this.state = 27;
_mdatos = new anywheresoftware.b4a.objects.collections.Map();
group37 = _lstmaprecords;
index37 = 0;
groupLen37 = group37.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 27;
if (index37 < groupLen37) {
this.state = 18;
_mdatos = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group37.Get(index37)));}
if (true) break;

case 40:
//C
this.state = 39;
index37++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=103350317;
 //BA.debugLineNum = 103350317;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
_fila = new String[_numcolumnastablatotales];
java.util.Arrays.fill(_fila,"");
RDebugUtils.currentLine=103350318;
 //BA.debugLineNum = 103350318;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=103350319;
 //BA.debugLineNum = 103350319;BA.debugLine="For Each k As String In mDatos.Keys";
if (true) break;

case 19:
//for
this.state = 26;
group40 = _mdatos.Keys();
index40 = 0;
groupLen40 = group40.getSize();
this.state = 41;
if (true) break;

case 41:
//C
this.state = 26;
if (index40 < groupLen40) {
this.state = 21;
_k = BA.ObjectToString(group40.Get(index40));}
if (true) break;

case 42:
//C
this.state = 41;
index40++;
if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=103350320;
 //BA.debugLineNum = 103350320;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
_fila[_colindex] = BA.ObjectToString(_mdatos.Get((Object)(_k)));
RDebugUtils.currentLine=103350321;
 //BA.debugLineNum = 103350321;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=103350322;
 //BA.debugLineNum = 103350322;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
if (true) break;

case 22:
//if
this.state = 25;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=103350323;
 //BA.debugLineNum = 103350323;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=103350324;
 //BA.debugLineNum = 103350324;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 25:
//C
this.state = 42;
;
RDebugUtils.currentLine=103350326;
 //BA.debugLineNum = 103350326;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 40;
;
RDebugUtils.currentLine=103350328;
 //BA.debugLineNum = 103350328;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._v7((Object[])(_fila),parent.__c.False);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=103350332;
 //BA.debugLineNum = 103350332;BA.debugLine="Dim AnchoTotalTabla As Int";
_anchototaltabla = 0;
RDebugUtils.currentLine=103350333;
 //BA.debugLineNum = 103350333;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
if (true) break;

case 28:
//for
this.state = 31;
step52 = 1;
limit52 = (int) (_numcolumnastablatotales-1);
_colindex = (int) (0) ;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 31;
if ((step52 > 0 && _colindex <= limit52) || (step52 < 0 && _colindex >= limit52)) this.state = 30;
if (true) break;

case 44:
//C
this.state = 43;
_colindex = ((int)(0 + _colindex + step52)) ;
if (true) break;

case 30:
//C
this.state = 44;
RDebugUtils.currentLine=103350334;
 //BA.debugLineNum = 103350334;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv5(_colindex,_anchoscolumnas[_colindex]);
RDebugUtils.currentLine=103350335;
 //BA.debugLineNum = 103350335;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
_anchototaltabla = (int) (_anchototaltabla+_anchoscolumnas[_colindex]);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=103350338;
 //BA.debugLineNum = 103350338;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";

case 31:
//for
this.state = 34;
step56 = 1;
limit56 = (int) (__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6()-1);
_rowindex = (int) (0) ;
this.state = 45;
if (true) break;

case 45:
//C
this.state = 34;
if ((step56 > 0 && _rowindex <= limit56) || (step56 < 0 && _rowindex >= limit56)) this.state = 33;
if (true) break;

case 46:
//C
this.state = 45;
_rowindex = ((int)(0 + _rowindex + step56)) ;
if (true) break;

case 33:
//C
this.state = 46;
RDebugUtils.currentLine=103350339;
 //BA.debugLineNum = 103350339;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvvvv5(_rowindex,parent.__c.DipToCurrent((int) (50)));
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=103350341;
 //BA.debugLineNum = 103350341;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
_altototal = (int) (parent.__c.Min(parent.__c.DipToCurrent((int) (50))*(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6())+parent.__c.DipToCurrent((int) (50)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY()))));
RDebugUtils.currentLine=103350342;
 //BA.debugLineNum = 103350342;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setWidth(_anchototaltabla);
RDebugUtils.currentLine=103350343;
 //BA.debugLineNum = 103350343;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setHeight(_altototal);
RDebugUtils.currentLine=103350345;
 //BA.debugLineNum = 103350345;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,_anchototaltabla+parent.__c.DipToCurrent((int) (30)),_altototal+parent.__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=103350346;
 //BA.debugLineNum = 103350346;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"),(int) (100));
this.state = 47;
return;
case 47:
//C
this.state = -1;
;
RDebugUtils.currentLine=103350347;
 //BA.debugLineNum = 103350347;BA.debugLine="FlexGridDialog.Invalidate";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvv1();
RDebugUtils.currentLine=103350349;
 //BA.debugLineNum = 103350349;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=103350351;
 //BA.debugLineNum = 103350351;BA.debugLine="Dialog.Title=\"Datos Stores\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Datos Stores");
RDebugUtils.currentLine=103350352;
 //BA.debugLineNum = 103350352;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_pbaseflexgrid,(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=103350353;
 //BA.debugLineNum = 103350353;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=103350354;
 //BA.debugLineNum = 103350354;BA.debugLine="bOK.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=103350355;
 //BA.debugLineNum = 103350355;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistastoresmagento"), _rsub);
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=103350356;
 //BA.debugLineNum = 103350356;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarlistagruposclientemagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrarlistagruposclientemagento", false))
	 {Debug.delegate(ba, "mostrarlistagruposclientemagento", null); return;}
ResumableSub_MostrarListaGruposClienteMagento rsub = new ResumableSub_MostrarListaGruposClienteMagento(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarListaGruposClienteMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaGruposClienteMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.objects.collections.List _lstmaprecords = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsrowids = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
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
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
int _result = 0;
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
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103546881;
 //BA.debugLineNum = 103546881;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Gru";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Grupos Cliente..."));
RDebugUtils.currentLine=103546882;
 //BA.debugLineNum = 103546882;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=103546883;
 //BA.debugLineNum = 103546883;BA.debugLine="Wait For(CargaListaGruposClienteMagento) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"), __ref._cargalistagruposclientemagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=103546884;
 //BA.debugLineNum = 103546884;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=103546885;
 //BA.debugLineNum = 103546885;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=103546886;
 //BA.debugLineNum = 103546886;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Grupos Cliente B2B"));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=103546887;
 //BA.debugLineNum = 103546887;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=103546890;
 //BA.debugLineNum = 103546890;BA.debugLine="Dim lstMapRecords As List";
_lstmaprecords = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=103546891;
 //BA.debugLineNum = 103546891;BA.debugLine="lstMapRecords.Initialize";
_lstmaprecords.Initialize();
RDebugUtils.currentLine=103546892;
 //BA.debugLineNum = 103546892;BA.debugLine="Dim rsRowIDs As ResultSet=mSQL.ExecQuery(\"select";
_rsrowids = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsrowids = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select rowid from tblB2BGruposCliente");
RDebugUtils.currentLine=103546893;
 //BA.debugLineNum = 103546893;BA.debugLine="Do While rsRowIDs.NextRow";
if (true) break;

case 5:
//do while
this.state = 8;
while (_rsrowids.NextRow()) {
this.state = 7;
if (true) break;
}
if (true) break;

case 7:
//C
this.state = 5;
RDebugUtils.currentLine=103546894;
 //BA.debugLineNum = 103546894;BA.debugLine="Dim mData As Map=DBUtils.ExecuteMap(mSQL,\"select";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
_mdata = parent._dbutils._executemap /*anywheresoftware.b4a.objects.collections.Map*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"select * from tblB2BGruposCliente where rowid=?",new String[]{BA.NumberToString(_rsrowids.GetInt("rowId"))});
RDebugUtils.currentLine=103546895;
 //BA.debugLineNum = 103546895;BA.debugLine="lstMapRecords.Add(mData)";
_lstmaprecords.Add((Object)(_mdata.getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=103546897;
 //BA.debugLineNum = 103546897;BA.debugLine="rsRowIDs.Close";
_rsrowids.Close();
RDebugUtils.currentLine=103546899;
 //BA.debugLineNum = 103546899;BA.debugLine="Dim pBaseFlexGrid As B4XView = xui.CreatePanel(\"\"";
_pbaseflexgrid = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbaseflexgrid = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=103546900;
 //BA.debugLineNum = 103546900;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, 500dip,";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (500)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY())));
RDebugUtils.currentLine=103546901;
 //BA.debugLineNum = 103546901;BA.debugLine="pBaseFlexGrid.LoadLayout(\"scrDialogFlexGrid\")";
_pbaseflexgrid.LoadLayout("scrDialogFlexGrid",ba);
RDebugUtils.currentLine=103546903;
 //BA.debugLineNum = 103546903;BA.debugLine="Dim HeadersFont As Font=xui.CreateDefaultfont(15)";
_headersfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_headersfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15)).getObject()));
RDebugUtils.currentLine=103546904;
 //BA.debugLineNum = 103546904;BA.debugLine="FlexGridDialog.HeaderFont=HeadersFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv7((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject())));
RDebugUtils.currentLine=103546906;
 //BA.debugLineNum = 103546906;BA.debugLine="Dim RowsFont As Font=xui.CreateDefaultfont(14)";
_rowsfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_rowsfont = (anywheresoftware.b4j.objects.JFX.FontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.JFX.FontWrapper(), (javafx.scene.text.Font)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)).getObject()));
RDebugUtils.currentLine=103546907;
 //BA.debugLineNum = 103546907;BA.debugLine="FlexGridDialog.Font=RowsFont";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._setvvvvvvvvvvvvvvvv4((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject())));
RDebugUtils.currentLine=103546908;
 //BA.debugLineNum = 103546908;BA.debugLine="Dim NumColumnasTablaTotales As Int=mData.Size";
_numcolumnastablatotales = _mdata.getSize();
RDebugUtils.currentLine=103546909;
 //BA.debugLineNum = 103546909;BA.debugLine="Dim AnchosColumnas(NumColumnasTablaTotales) As In";
_anchoscolumnas = new int[_numcolumnastablatotales];
;
RDebugUtils.currentLine=103546910;
 //BA.debugLineNum = 103546910;BA.debugLine="FlexGridDialog.SetColsNumber(NumColumnasTablaTota";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv1(_numcolumnastablatotales);
RDebugUtils.currentLine=103546911;
 //BA.debugLineNum = 103546911;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=103546912;
 //BA.debugLineNum = 103546912;BA.debugLine="For Each k As String In mData.Keys";
if (true) break;

case 9:
//for
this.state = 16;
group28 = _mdata.Keys();
index28 = 0;
groupLen28 = group28.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 16;
if (index28 < groupLen28) {
this.state = 11;
_k = BA.ObjectToString(group28.Get(index28));}
if (true) break;

case 38:
//C
this.state = 37;
index28++;
if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=103546913;
 //BA.debugLineNum = 103546913;BA.debugLine="FlexGridDialog.SetColName(ColIndex,k)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvv4(_colindex,_k);
RDebugUtils.currentLine=103546915;
 //BA.debugLineNum = 103546915;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex)";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=103546916;
 //BA.debugLineNum = 103546916;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(Fl";
if (true) break;

case 12:
//if
this.state = 15;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=103546917;
 //BA.debugLineNum = 103546917;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(Flex";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv2()[_colindex],(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_headersfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=103546918;
 //BA.debugLineNum = 103546918;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 15:
//C
this.state = 38;
;
RDebugUtils.currentLine=103546921;
 //BA.debugLineNum = 103546921;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=103546924;
 //BA.debugLineNum = 103546924;BA.debugLine="For Each mDatos As Map In lstMapRecords";

case 16:
//for
this.state = 27;
_mdatos = new anywheresoftware.b4a.objects.collections.Map();
group37 = _lstmaprecords;
index37 = 0;
groupLen37 = group37.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 27;
if (index37 < groupLen37) {
this.state = 18;
_mdatos = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group37.Get(index37)));}
if (true) break;

case 40:
//C
this.state = 39;
index37++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=103546925;
 //BA.debugLineNum = 103546925;BA.debugLine="Dim Fila(NumColumnasTablaTotales) As String";
_fila = new String[_numcolumnastablatotales];
java.util.Arrays.fill(_fila,"");
RDebugUtils.currentLine=103546926;
 //BA.debugLineNum = 103546926;BA.debugLine="Dim ColIndex As Int";
_colindex = 0;
RDebugUtils.currentLine=103546927;
 //BA.debugLineNum = 103546927;BA.debugLine="For Each k As String In mDatos.Keys";
if (true) break;

case 19:
//for
this.state = 26;
group40 = _mdatos.Keys();
index40 = 0;
groupLen40 = group40.getSize();
this.state = 41;
if (true) break;

case 41:
//C
this.state = 26;
if (index40 < groupLen40) {
this.state = 21;
_k = BA.ObjectToString(group40.Get(index40));}
if (true) break;

case 42:
//C
this.state = 41;
index40++;
if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=103546928;
 //BA.debugLineNum = 103546928;BA.debugLine="Fila(ColIndex)=mDatos.get(k)";
_fila[_colindex] = BA.ObjectToString(_mdatos.Get((Object)(_k)));
RDebugUtils.currentLine=103546929;
 //BA.debugLineNum = 103546929;BA.debugLine="Dim AnchoColumna As Int=AnchosColumnas(ColIndex";
_anchocolumna = _anchoscolumnas[_colindex];
RDebugUtils.currentLine=103546930;
 //BA.debugLineNum = 103546930;BA.debugLine="If AnchoColumna<MeasurementCanvas.MeasureText(m";
if (true) break;

case 22:
//if
this.state = 25;
if (_anchocolumna<__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40))) { 
this.state = 24;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=103546931;
 //BA.debugLineNum = 103546931;BA.debugLine="AnchoColumna=MeasurementCanvas.MeasureText(mDa";
_anchocolumna = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(BA.ObjectToString(_mdatos.Get((Object)(_k))),(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont(), (javafx.scene.text.Font)(_rowsfont.getObject()))).getWidth()+parent.__c.DipToCurrent((int) (40)));
RDebugUtils.currentLine=103546932;
 //BA.debugLineNum = 103546932;BA.debugLine="AnchosColumnas(ColIndex)=AnchoColumna";
_anchoscolumnas[_colindex] = _anchocolumna;
 if (true) break;

case 25:
//C
this.state = 42;
;
RDebugUtils.currentLine=103546934;
 //BA.debugLineNum = 103546934;BA.debugLine="ColIndex=ColIndex+1";
_colindex = (int) (_colindex+1);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 40;
;
RDebugUtils.currentLine=103546936;
 //BA.debugLineNum = 103546936;BA.debugLine="FlexGridDialog.AddRow(Fila,False)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._v7((Object[])(_fila),parent.__c.False);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=103546940;
 //BA.debugLineNum = 103546940;BA.debugLine="Dim AnchoTotalTabla As Int";
_anchototaltabla = 0;
RDebugUtils.currentLine=103546941;
 //BA.debugLineNum = 103546941;BA.debugLine="For ColIndex=0 To NumColumnasTablaTotales-1";
if (true) break;

case 28:
//for
this.state = 31;
step52 = 1;
limit52 = (int) (_numcolumnastablatotales-1);
_colindex = (int) (0) ;
this.state = 43;
if (true) break;

case 43:
//C
this.state = 31;
if ((step52 > 0 && _colindex <= limit52) || (step52 < 0 && _colindex >= limit52)) this.state = 30;
if (true) break;

case 44:
//C
this.state = 43;
_colindex = ((int)(0 + _colindex + step52)) ;
if (true) break;

case 30:
//C
this.state = 44;
RDebugUtils.currentLine=103546942;
 //BA.debugLineNum = 103546942;BA.debugLine="FlexGridDialog.SetColWidth(ColIndex,AnchosColumn";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvv5(_colindex,_anchoscolumnas[_colindex]);
RDebugUtils.currentLine=103546943;
 //BA.debugLineNum = 103546943;BA.debugLine="AnchoTotalTabla=AnchoTotalTabla+AnchosColumnas(C";
_anchototaltabla = (int) (_anchototaltabla+_anchoscolumnas[_colindex]);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=103546946;
 //BA.debugLineNum = 103546946;BA.debugLine="For RowIndex=0 To FlexGridDialog.RowCount-1";

case 31:
//for
this.state = 34;
step56 = 1;
limit56 = (int) (__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6()-1);
_rowindex = (int) (0) ;
this.state = 45;
if (true) break;

case 45:
//C
this.state = 34;
if ((step56 > 0 && _rowindex <= limit56) || (step56 < 0 && _rowindex >= limit56)) this.state = 33;
if (true) break;

case 46:
//C
this.state = 45;
_rowindex = ((int)(0 + _rowindex + step56)) ;
if (true) break;

case 33:
//C
this.state = 46;
RDebugUtils.currentLine=103546947;
 //BA.debugLineNum = 103546947;BA.debugLine="FlexGridDialog.SetRowHeight(RowIndex,50dip)";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvvvvvvv5(_rowindex,parent.__c.DipToCurrent((int) (50)));
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=103546949;
 //BA.debugLineNum = 103546949;BA.debugLine="Dim AltoTotal As Int=Min(50dip*(FlexGridDialog.Ro";
_altototal = (int) (parent.__c.Min(parent.__c.DipToCurrent((int) (50))*(__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvvv6())+parent.__c.DipToCurrent((int) (50)),(0.75*(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMaxY()-__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .getPrimaryScreen().getMinY()))));
RDebugUtils.currentLine=103546950;
 //BA.debugLineNum = 103546950;BA.debugLine="FlexGridDialog.Base.Width=AnchoTotalTabla";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setWidth(_anchototaltabla);
RDebugUtils.currentLine=103546951;
 //BA.debugLineNum = 103546951;BA.debugLine="FlexGridDialog.Base.Height=AltoTotal";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._getvvvvvvvvvvvvv0().setHeight(_altototal);
RDebugUtils.currentLine=103546953;
 //BA.debugLineNum = 103546953;BA.debugLine="pBaseFlexGrid.SetLayoutAnimated(0, 0, 0, AnchoTot";
_pbaseflexgrid.SetLayoutAnimated((int) (0),0,0,_anchototaltabla+parent.__c.DipToCurrent((int) (30)),_altototal+parent.__c.DipToCurrent((int) (60)));
RDebugUtils.currentLine=103546954;
 //BA.debugLineNum = 103546954;BA.debugLine="Sleep(100)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"),(int) (100));
this.state = 47;
return;
case 47:
//C
this.state = -1;
;
RDebugUtils.currentLine=103546955;
 //BA.debugLineNum = 103546955;BA.debugLine="FlexGridDialog.Invalidate";
__ref._flexgriddialog /*b4j.example.flexgrid*/ ._vvvvvvv1();
RDebugUtils.currentLine=103546957;
 //BA.debugLineNum = 103546957;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=103546959;
 //BA.debugLineNum = 103546959;BA.debugLine="Dialog.Title=\"Datos Grupos Cliente\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Datos Grupos Cliente");
RDebugUtils.currentLine=103546960;
 //BA.debugLineNum = 103546960;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseF";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_pbaseflexgrid,(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=103546961;
 //BA.debugLineNum = 103546961;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=103546962;
 //BA.debugLineNum = 103546962;BA.debugLine="bOK.TextSize=16";
_bok.setTextSize(16);
RDebugUtils.currentLine=103546963;
 //BA.debugLineNum = 103546963;BA.debugLine="Wait For (rSub) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistagruposclientemagento"), _rsub);
this.state = 48;
return;
case 48:
//C
this.state = -1;
_result = (int) result[1];
;
RDebugUtils.currentLine=103546964;
 //BA.debugLineNum = 103546964;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarlistaclientesmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrarlistaclientesmagento", false))
	 {Debug.delegate(ba, "mostrarlistaclientesmagento", null); return;}
ResumableSub_MostrarListaClientesMagento rsub = new ResumableSub_MostrarListaClientesMagento(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarListaClientesMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaClientesMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsclientes = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103743489;
 //BA.debugLineNum = 103743489;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Cli";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Clientes..."));
RDebugUtils.currentLine=103743490;
 //BA.debugLineNum = 103743490;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=103743491;
 //BA.debugLineNum = 103743491;BA.debugLine="Wait For(CargaListaClientesMagento) complete (Suc";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), __ref._cargalistaclientesmagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=103743492;
 //BA.debugLineNum = 103743492;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=103743493;
 //BA.debugLineNum = 103743493;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=103743494;
 //BA.debugLineNum = 103743494;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Clientes B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=103743495;
 //BA.debugLineNum = 103743495;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=103743501;
 //BA.debugLineNum = 103743501;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BClientes.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=103743502;
 //BA.debugLineNum = 103743502;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=103743503;
 //BA.debugLineNum = 103743503;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8103743503",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=103743504;
 //BA.debugLineNum = 103743504;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=103743505;
 //BA.debugLineNum = 103743505;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=103743506;
 //BA.debugLineNum = 103743506;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=103743507;
 //BA.debugLineNum = 103743507;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=103743508;
 //BA.debugLineNum = 103743508;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=103743509;
 //BA.debugLineNum = 103743509;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=103743512;
 //BA.debugLineNum = 103743512;BA.debugLine="jamTableView1.AddContextMenuItemFontMaterialIcons";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontmaterialiconstext /*String*/ (null,"Direcciones Cliente","DireccionesClientes",BA.ObjectToString(parent.__c.Chr(((int)0xe0c8))));
RDebugUtils.currentLine=103743514;
 //BA.debugLineNum = 103743514;BA.debugLine="Dim rsClientes As ResultSet=mSQL.ExecQuery(\"selec";
_rsclientes = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsclientes = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BClientes");
RDebugUtils.currentLine=103743515;
 //BA.debugLineNum = 103743515;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsclientes.getObject()));
RDebugUtils.currentLine=103743516;
 //BA.debugLineNum = 103743516;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=103743517;
 //BA.debugLineNum = 103743517;BA.debugLine="rsClientes.close";
_rsclientes.Close();
RDebugUtils.currentLine=103743518;
 //BA.debugLineNum = 103743518;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=103743519;
 //BA.debugLineNum = 103743519;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=103743520;
 //BA.debugLineNum = 103743520;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=103743521;
 //BA.debugLineNum = 103743521;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=103743522;
 //BA.debugLineNum = 103743522;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=103743524;
 //BA.debugLineNum = 103743524;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=103743525;
 //BA.debugLineNum = 103743525;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=103743526;
 //BA.debugLineNum = 103743526;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=103743527;
 //BA.debugLineNum = 103743527;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=103743528;
 //BA.debugLineNum = 103743528;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=103743531;
 //BA.debugLineNum = 103743531;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=103743533;
 //BA.debugLineNum = 103743533;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=103743534;
 //BA.debugLineNum = 103743534;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=103743535;
 //BA.debugLineNum = 103743535;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=103743536;
 //BA.debugLineNum = 103743536;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaclientesmagento"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=103743539;
 //BA.debugLineNum = 103743539;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _seleccionarcliente(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "seleccionarcliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "seleccionarcliente", null));}
ResumableSub_SeleccionarCliente rsub = new ResumableSub_SeleccionarCliente(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SeleccionarCliente extends BA.ResumableSub {
public ResumableSub_SeleccionarCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
int _idclientesel = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104595457;
 //BA.debugLineNum = 104595457;BA.debugLine="Dialog.Title=\"Indica ID Cliente\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica ID Cliente");
RDebugUtils.currentLine=104595458;
 //BA.debugLineNum = 104595458;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=104595459;
 //BA.debugLineNum = 104595459;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
__ref._dialog /*b4j.docU.b4xdialog*/ ._overlaycolor /*int*/  = ((int)0x00ffffff);
RDebugUtils.currentLine=104595460;
 //BA.debugLineNum = 104595460;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=104595461;
 //BA.debugLineNum = 104595461;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=104595462;
 //BA.debugLineNum = 104595462;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=104595463;
 //BA.debugLineNum = 104595463;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=104595464;
 //BA.debugLineNum = 104595464;BA.debugLine="InputDlg.ConfigureForNumbers(False,False)";
_inputdlg._configurefornumbers /*String*/ (null,parent.__c.False,parent.__c.False);
RDebugUtils.currentLine=104595466;
 //BA.debugLineNum = 104595466;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=104595467;
 //BA.debugLineNum = 104595467;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=104595468;
 //BA.debugLineNum = 104595468;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=104595469;
 //BA.debugLineNum = 104595469;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=104595470;
 //BA.debugLineNum = 104595470;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=104595471;
 //BA.debugLineNum = 104595471;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=104595472;
 //BA.debugLineNum = 104595472;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=104595473;
 //BA.debugLineNum = 104595473;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "seleccionarcliente"), _rsub);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=104595475;
 //BA.debugLineNum = 104595475;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(-1));return;};
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=104595476;
 //BA.debugLineNum = 104595476;BA.debugLine="Dim IDClienteSel As Int=InputDlg.Text";
_idclientesel = (int)(Double.parseDouble(_inputdlg._text /*String*/ ));
RDebugUtils.currentLine=104595477;
 //BA.debugLineNum = 104595477;BA.debugLine="Return IDClienteSel";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_idclientesel));return;};
RDebugUtils.currentLine=104595478;
 //BA.debugLineNum = 104595478;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrardireccionesclientemagento(b4j.docU.ctestsinfomagento __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrardireccionesclientemagento", false))
	 {Debug.delegate(ba, "mostrardireccionesclientemagento", new Object[] {_idclientesel}); return;}
ResumableSub_MostrarDireccionesClienteMagento rsub = new ResumableSub_MostrarDireccionesClienteMagento(this,__ref,_idclientesel);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarDireccionesClienteMagento extends BA.ResumableSub {
public ResumableSub_MostrarDireccionesClienteMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel;
b4j.docU.b4xlisttemplate _b4xlistdlg = null;
float _textsize = 0f;
b4j.example.customlistview _xclv = null;
anywheresoftware.b4j.objects.LabelWrapper _dlbl = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _opcion = "";
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104660996;
 //BA.debugLineNum = 104660996;BA.debugLine="Dialog.Title=\"Selecciona Tipo Dirección\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Tipo Dirección");
RDebugUtils.currentLine=104660997;
 //BA.debugLineNum = 104660997;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=104660998;
 //BA.debugLineNum = 104660998;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=104660999;
 //BA.debugLineNum = 104660999;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=104661000;
 //BA.debugLineNum = 104661000;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=104661001;
 //BA.debugLineNum = 104661001;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=104661003;
 //BA.debugLineNum = 104661003;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=104661004;
 //BA.debugLineNum = 104661004;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=104661005;
 //BA.debugLineNum = 104661005;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Wh";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=104661007;
 //BA.debugLineNum = 104661007;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=104661008;
 //BA.debugLineNum = 104661008;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=104661010;
 //BA.debugLineNum = 104661010;BA.debugLine="Dim lstOpciones As List=Array As String(\"Default";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
_lstopciones = anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Default Shipping Adress","Default Billing Address","Todas"});
RDebugUtils.currentLine=104661012;
 //BA.debugLineNum = 104661012;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=104661014;
 //BA.debugLineNum = 104661014;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=104661016;
 //BA.debugLineNum = 104661016;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 1:
//for
this.state = 4;
step15 = 1;
limit15 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 4;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 3;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 3:
//C
this.state = 24;
RDebugUtils.currentLine=104661017;
 //BA.debugLineNum = 104661017;BA.debugLine="xclv.ResizeItem(i,80dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (80)));
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=104661021;
 //BA.debugLineNum = 104661021;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=104661022;
 //BA.debugLineNum = 104661022;BA.debugLine="If bCancel.IsInitialized Then";
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
RDebugUtils.currentLine=104661024;
 //BA.debugLineNum = 104661024;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=104661025;
 //BA.debugLineNum = 104661025;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=104661026;
 //BA.debugLineNum = 104661026;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=104661029;
 //BA.debugLineNum = 104661029;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardireccionesclientemagento"), _rsub);
this.state = 25;
return;
case 25:
//C
this.state = 9;
_rint = (int) result[1];
;
RDebugUtils.currentLine=104661030;
 //BA.debugLineNum = 104661030;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=104661031;
 //BA.debugLineNum = 104661031;BA.debugLine="Dim Opcion As String= B4XListDlg.SelectedItem";
_opcion = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=104661033;
 //BA.debugLineNum = 104661033;BA.debugLine="Select Case Opcion";
if (true) break;

case 15:
//select
this.state = 22;
switch (BA.switchObjectToInt(_opcion,"Default Shipping Adress","Default Billing Address","Todas")) {
case 0: {
this.state = 17;
if (true) break;
}
case 1: {
this.state = 19;
if (true) break;
}
case 2: {
this.state = 21;
if (true) break;
}
}
if (true) break;

case 17:
//C
this.state = 22;
RDebugUtils.currentLine=104661035;
 //BA.debugLineNum = 104661035;BA.debugLine="MostrarDireccionDefectoEnvioCliente(IDClienteSe";
__ref._mostrardirecciondefectoenviocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idclientesel);
 if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=104661037;
 //BA.debugLineNum = 104661037;BA.debugLine="MostrarDireccionDefectoFacturacionCliente(IDCli";
__ref._mostrardirecciondefectofacturacioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idclientesel);
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=104661039;
 //BA.debugLineNum = 104661039;BA.debugLine="MostrarTodasDireccionesCliente(IDClienteSel)";
__ref._mostrartodasdireccionescliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idclientesel);
RDebugUtils.currentLine=104661040;
 //BA.debugLineNum = 104661040;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=104661042;
 //BA.debugLineNum = 104661042;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarlistaproductosmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrarlistaproductosmagento", false))
	 {Debug.delegate(ba, "mostrarlistaproductosmagento", null); return;}
ResumableSub_MostrarListaProductosMagento rsub = new ResumableSub_MostrarListaProductosMagento(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarListaProductosMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaProductosMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsclientes = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104136705;
 //BA.debugLineNum = 104136705;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Lis";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Lista Productos..."));
RDebugUtils.currentLine=104136706;
 //BA.debugLineNum = 104136706;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=104136707;
 //BA.debugLineNum = 104136707;BA.debugLine="Wait For(CargaListaProductosMagento) complete (Su";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), __ref._cargalistaproductosmagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=104136708;
 //BA.debugLineNum = 104136708;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=104136709;
 //BA.debugLineNum = 104136709;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104136710;
 //BA.debugLineNum = 104136710;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Productos B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=104136711;
 //BA.debugLineNum = 104136711;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=104136718;
 //BA.debugLineNum = 104136718;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BProductos.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=104136719;
 //BA.debugLineNum = 104136719;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=104136720;
 //BA.debugLineNum = 104136720;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8104136720",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=104136721;
 //BA.debugLineNum = 104136721;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=104136722;
 //BA.debugLineNum = 104136722;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104136723;
 //BA.debugLineNum = 104136723;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=104136724;
 //BA.debugLineNum = 104136724;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=104136725;
 //BA.debugLineNum = 104136725;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=104136726;
 //BA.debugLineNum = 104136726;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=104136729;
 //BA.debugLineNum = 104136729;BA.debugLine="Dim rsClientes As ResultSet=mSQL.ExecQuery(\"selec";
_rsclientes = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsclientes = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BProductos");
RDebugUtils.currentLine=104136730;
 //BA.debugLineNum = 104136730;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsclientes.getObject()));
RDebugUtils.currentLine=104136731;
 //BA.debugLineNum = 104136731;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=104136732;
 //BA.debugLineNum = 104136732;BA.debugLine="rsClientes.close";
_rsclientes.Close();
RDebugUtils.currentLine=104136733;
 //BA.debugLineNum = 104136733;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104136734;
 //BA.debugLineNum = 104136734;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=104136735;
 //BA.debugLineNum = 104136735;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=104136736;
 //BA.debugLineNum = 104136736;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=104136737;
 //BA.debugLineNum = 104136737;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=104136739;
 //BA.debugLineNum = 104136739;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=104136740;
 //BA.debugLineNum = 104136740;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=104136741;
 //BA.debugLineNum = 104136741;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=104136742;
 //BA.debugLineNum = 104136742;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=104136743;
 //BA.debugLineNum = 104136743;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=104136746;
 //BA.debugLineNum = 104136746;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=104136748;
 //BA.debugLineNum = 104136748;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=104136749;
 //BA.debugLineNum = 104136749;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=104136750;
 //BA.debugLineNum = 104136750;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=104136751;
 //BA.debugLineNum = 104136751;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistaproductosmagento"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=104136754;
 //BA.debugLineNum = 104136754;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mostrarvaloresatributosizeproductos(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrarvaloresatributosizeproductos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mostrarvaloresatributosizeproductos", null));}
ResumableSub_MostrarValoresAtributoSizeProductos rsub = new ResumableSub_MostrarValoresAtributoSizeProductos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MostrarValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_MostrarValoresAtributoSizeProductos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdireccionesclientes = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105250817;
 //BA.debugLineNum = 105250817;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Val";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Valores Atributo Size Productos..."));
RDebugUtils.currentLine=105250818;
 //BA.debugLineNum = 105250818;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=105250819;
 //BA.debugLineNum = 105250819;BA.debugLine="Wait For(CargaValoresAtributoSizeProductos) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), __ref._cargavaloresatributosizeproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=105250820;
 //BA.debugLineNum = 105250820;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=105250821;
 //BA.debugLineNum = 105250821;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105250822;
 //BA.debugLineNum = 105250822;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargandoValores Atributo Size Productos B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=105250823;
 //BA.debugLineNum = 105250823;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=105250829;
 //BA.debugLineNum = 105250829;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BProductAttributeSize.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=105250830;
 //BA.debugLineNum = 105250830;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105250831;
 //BA.debugLineNum = 105250831;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8105250831",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=105250832;
 //BA.debugLineNum = 105250832;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=105250833;
 //BA.debugLineNum = 105250833;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105250834;
 //BA.debugLineNum = 105250834;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105250835;
 //BA.debugLineNum = 105250835;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=105250836;
 //BA.debugLineNum = 105250836;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=105250837;
 //BA.debugLineNum = 105250837;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=105250840;
 //BA.debugLineNum = 105250840;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
_rsdireccionesclientes = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdireccionesclientes = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BAtributoSizeProducts order by label");
RDebugUtils.currentLine=105250841;
 //BA.debugLineNum = 105250841;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdireccionesclientes.getObject()));
RDebugUtils.currentLine=105250842;
 //BA.debugLineNum = 105250842;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105250843;
 //BA.debugLineNum = 105250843;BA.debugLine="rsDireccionesClientes.close";
_rsdireccionesclientes.Close();
RDebugUtils.currentLine=105250844;
 //BA.debugLineNum = 105250844;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105250845;
 //BA.debugLineNum = 105250845;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=105250846;
 //BA.debugLineNum = 105250846;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=105250847;
 //BA.debugLineNum = 105250847;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105250848;
 //BA.debugLineNum = 105250848;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=105250850;
 //BA.debugLineNum = 105250850;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=105250851;
 //BA.debugLineNum = 105250851;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=105250852;
 //BA.debugLineNum = 105250852;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=105250853;
 //BA.debugLineNum = 105250853;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=105250854;
 //BA.debugLineNum = 105250854;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=105250857;
 //BA.debugLineNum = 105250857;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=105250859;
 //BA.debugLineNum = 105250859;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=105250860;
 //BA.debugLineNum = 105250860;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=105250861;
 //BA.debugLineNum = 105250861;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=105250862;
 //BA.debugLineNum = 105250862;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarvaloresatributosizeproductos"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=105250866;
 //BA.debugLineNum = 105250866;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mostrarpedidos(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrarpedidos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mostrarpedidos", null));}
ResumableSub_MostrarPedidos rsub = new ResumableSub_MostrarPedidos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MostrarPedidos extends BA.ResumableSub {
public ResumableSub_MostrarPedidos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rspedidos = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105447425;
 //BA.debugLineNum = 105447425;BA.debugLine="TextAreaHTTPResponse.Text=\"\"";
__ref._textareahttpresponse /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText("");
RDebugUtils.currentLine=105447426;
 //BA.debugLineNum = 105447426;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Ped";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Pedidos..."));
RDebugUtils.currentLine=105447427;
 //BA.debugLineNum = 105447427;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=105447428;
 //BA.debugLineNum = 105447428;BA.debugLine="Wait For(CargaPedidos) complete (Success As Boole";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), __ref._cargapedidos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=105447429;
 //BA.debugLineNum = 105447429;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=105447430;
 //BA.debugLineNum = 105447430;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105447431;
 //BA.debugLineNum = 105447431;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Pedidos (Orders) B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=105447432;
 //BA.debugLineNum = 105447432;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=105447438;
 //BA.debugLineNum = 105447438;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BPedidos2.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=105447439;
 //BA.debugLineNum = 105447439;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105447440;
 //BA.debugLineNum = 105447440;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8105447440",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=105447441;
 //BA.debugLineNum = 105447441;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=105447442;
 //BA.debugLineNum = 105447442;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105447443;
 //BA.debugLineNum = 105447443;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105447444;
 //BA.debugLineNum = 105447444;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=105447445;
 //BA.debugLineNum = 105447445;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=105447446;
 //BA.debugLineNum = 105447446;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=105447449;
 //BA.debugLineNum = 105447449;BA.debugLine="Dim rsPedidos As ResultSet=mSQL.ExecQuery(\"select";
_rspedidos = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rspedidos = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BOrders");
RDebugUtils.currentLine=105447450;
 //BA.debugLineNum = 105447450;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rspedidos.getObject()));
RDebugUtils.currentLine=105447451;
 //BA.debugLineNum = 105447451;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105447452;
 //BA.debugLineNum = 105447452;BA.debugLine="rsPedidos.close";
_rspedidos.Close();
RDebugUtils.currentLine=105447453;
 //BA.debugLineNum = 105447453;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105447454;
 //BA.debugLineNum = 105447454;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=105447455;
 //BA.debugLineNum = 105447455;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=105447456;
 //BA.debugLineNum = 105447456;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105447457;
 //BA.debugLineNum = 105447457;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=105447459;
 //BA.debugLineNum = 105447459;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=105447460;
 //BA.debugLineNum = 105447460;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=105447461;
 //BA.debugLineNum = 105447461;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=105447462;
 //BA.debugLineNum = 105447462;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=105447463;
 //BA.debugLineNum = 105447463;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=105447466;
 //BA.debugLineNum = 105447466;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=105447468;
 //BA.debugLineNum = 105447468;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=105447469;
 //BA.debugLineNum = 105447469;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=105447470;
 //BA.debugLineNum = 105447470;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=105447471;
 //BA.debugLineNum = 105447471;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarpedidos"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=105447475;
 //BA.debugLineNum = 105447475;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _mostrarlistacategoriasmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrarlistacategoriasmagento", false))
	 {Debug.delegate(ba, "mostrarlistacategoriasmagento", null); return;}
ResumableSub_MostrarListaCategoriasMagento rsub = new ResumableSub_MostrarListaCategoriasMagento(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MostrarListaCategoriasMagento extends BA.ResumableSub {
public ResumableSub_MostrarListaCategoriasMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsclientes = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105709570;
 //BA.debugLineNum = 105709570;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Lis";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Lista Categorias..."));
RDebugUtils.currentLine=105709571;
 //BA.debugLineNum = 105709571;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=105709572;
 //BA.debugLineNum = 105709572;BA.debugLine="Wait For(CargaListaCategoriasMagento) complete (S";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), __ref._cargalistacategoriasmagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=105709573;
 //BA.debugLineNum = 105709573;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105709574;
 //BA.debugLineNum = 105709574;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=105709575;
 //BA.debugLineNum = 105709575;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando categorias B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=105709576;
 //BA.debugLineNum = 105709576;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=105709583;
 //BA.debugLineNum = 105709583;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BProductos.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=105709584;
 //BA.debugLineNum = 105709584;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105709585;
 //BA.debugLineNum = 105709585;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8105709585",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=105709586;
 //BA.debugLineNum = 105709586;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=105709587;
 //BA.debugLineNum = 105709587;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105709588;
 //BA.debugLineNum = 105709588;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105709589;
 //BA.debugLineNum = 105709589;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=105709590;
 //BA.debugLineNum = 105709590;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=105709591;
 //BA.debugLineNum = 105709591;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=105709594;
 //BA.debugLineNum = 105709594;BA.debugLine="Dim rsClientes As ResultSet=mSQL.ExecQuery(\"selec";
_rsclientes = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsclientes = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BCategorias");
RDebugUtils.currentLine=105709595;
 //BA.debugLineNum = 105709595;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsclientes.getObject()));
RDebugUtils.currentLine=105709596;
 //BA.debugLineNum = 105709596;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105709597;
 //BA.debugLineNum = 105709597;BA.debugLine="rsClientes.close";
_rsclientes.Close();
RDebugUtils.currentLine=105709598;
 //BA.debugLineNum = 105709598;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105709599;
 //BA.debugLineNum = 105709599;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=105709600;
 //BA.debugLineNum = 105709600;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=105709601;
 //BA.debugLineNum = 105709601;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105709602;
 //BA.debugLineNum = 105709602;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=105709604;
 //BA.debugLineNum = 105709604;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=105709605;
 //BA.debugLineNum = 105709605;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=105709606;
 //BA.debugLineNum = 105709606;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=105709607;
 //BA.debugLineNum = 105709607;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=105709608;
 //BA.debugLineNum = 105709608;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=105709611;
 //BA.debugLineNum = 105709611;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=105709613;
 //BA.debugLineNum = 105709613;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=105709614;
 //BA.debugLineNum = 105709614;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) return ;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=105709615;
 //BA.debugLineNum = 105709615;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=105709616;
 //BA.debugLineNum = 105709616;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrarlistacategoriasmagento"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=105709619;
 //BA.debugLineNum = 105709619;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btninfopedidoclientemagento_click(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "btninfopedidoclientemagento_click", false))
	 {Debug.delegate(ba, "btninfopedidoclientemagento_click", null); return;}
ResumableSub_btnInfoPedidoClienteMagento_Click rsub = new ResumableSub_btnInfoPedidoClienteMagento_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnInfoPedidoClienteMagento_Click extends BA.ResumableSub {
public ResumableSub_btnInfoPedidoClienteMagento_Click(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
Object _msa = null;
int _rint = 0;
String _tipoidentificador = "";
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _idsel = 0;
String _sresp = "";
anywheresoftware.b4a.objects.collections.Map _mdatapedido = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
double _tax_amount = 0;
double _tax_invoiced = 0;
int _customer_note_notify = 0;
int _shipping_discount_amount = 0;
int _base_discount_tax_compensation_invoiced = 0;
String _customer_firstname = "";
double _discount_amount = 0;
anywheresoftware.b4a.objects.collections.Map _billing_address = null;
String _firstname = "";
String _address_type = "";
int _customer_address_id = 0;
String _city = "";
String _postcode = "";
int _region_id = 0;
String _telephone = "";
int _idbilling_address = 0;
String _lastname = "";
int _parent_id = 0;
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
String _calle = "";
String _region = "";
String _country_id = "";
String _email = "";
String _region_code = "";
double _total_paid = 0;
String _increment_id = "";
anywheresoftware.b4a.objects.collections.Map _payment = null;
double _base_amount_ordered = 0;
double _amount_paid = 0;
String _method = "";
String _cc_last4 = "";
int _shipping_captured = 0;
String _account_status = "";
double _amount_ordered = 0;
int _paymentid = 0;
double _base_amount_paid = 0;
int _shipping_amount = 0;
anywheresoftware.b4a.objects.collections.List _additional_information = null;
String _coladditional_information = "";
int _base_shipping_amount = 0;
int _base_shipping_captured = 0;
String _state = "";
int _base_shipping_tax_amount = 0;
double _base_grand_total = 0;
int _billing_address_id = 0;
String _customer_lastname = "";
int _quote_id = 0;
int _shipping_invoiced = 0;
int _discount_tax_compensation_amount = 0;
int _weight = 0;
int _idpedido = 0;
double _base_total_invoiced = 0;
int _base_subtotal_invoiced = 0;
String _applied_rule_ids = "";
double _subtotal_incl_tax = 0;
int _base_shipping_discount_tax_compensation_amnt = 0;
int _subtotal = 0;
int _base_shipping_incl_tax = 0;
String _customer_email = "";
int _base_discount_invoiced = 0;
double _total_invoiced = 0;
int _base_to_global_rate = 0;
int _customer_is_guest = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
int _original_price = 0;
int _free_shipping = 0;
double _tax_percent = 0;
double _price_incl_tax = 0;
double _price = 0;
int _product_id = 0;
double _base_row_total = 0;
String _sku = "";
int _base_original_price = 0;
int _row_weight = 0;
int _base_amount_refunded = 0;
double _base_price_incl_tax = 0;
int _no_discount = 0;
String _name = "";
int _discount_percent = 0;
int _order_id = 0;
int _discount_tax_compensation_invoiced = 0;
String _created_at = "";
int _qty_shipped = 0;
int _qty_ordered = 0;
int _row_total = 0;
int _qty_canceled = 0;
anywheresoftware.b4a.objects.collections.Map _product_option = null;
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
anywheresoftware.b4a.objects.collections.List _configurable_item_options = null;
String _talla = "";
anywheresoftware.b4a.objects.collections.Map _colconfigurable_item_options = null;
int _option_value = 0;
String _option_id = "";
int _amount_refunded = 0;
String _updated_at = "";
int _base_price = 0;
int _qty_invoiced = 0;
int _row_invoiced = 0;
double _row_total_incl_tax = 0;
double _base_tax_amount = 0;
int _store_id = 0;
int _item_id = 0;
int _base_discount_amount = 0;
double _base_row_total_incl_tax = 0;
int _base_discount_tax_compensation_amount = 0;
String _product_type = "";
int _qty_refunded = 0;
int _base_row_invoiced = 0;
int _is_qty_decimal = 0;
int _discount_invoiced = 0;
double _base_tax_invoiced = 0;
String _global_currency_code = "";
String _status = "";
int _is_virtual = 0;
int _base_total_invoiced_cost = 0;
anywheresoftware.b4a.objects.collections.List _status_histories = null;
String _store_currency_code = "";
int _total_item_count = 0;
int _shipping_tax_amount = 0;
int _store_to_base_rate = 0;
int _base_shipping_discount_amount = 0;
String _store_name = "";
double _grand_total = 0;
String _base_currency_code = "";
double _base_total_paid = 0;
int _shipping_discount_tax_compensation_amount = 0;
int _total_due = 0;
int _total_qty_ordered = 0;
anywheresoftware.b4a.objects.collections.Map _pgw = null;
anywheresoftware.b4a.objects.collections.List _extrinsic = null;
anywheresoftware.b4a.objects.collections.List _extra_data = null;
anywheresoftware.b4a.objects.collections.List _posr_data = null;
anywheresoftware.b4a.objects.collections.List _originator = null;
String _entity_id = "";
anywheresoftware.b4a.objects.collections.List _poom_data = null;
String _po_number = "";
anywheresoftware.b4a.objects.collections.List _shipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _colshipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _shipping = null;
anywheresoftware.b4a.objects.collections.Map _total = null;
int _shipping_incl_tax = 0;
int _base_shipping_invoiced = 0;
anywheresoftware.b4a.objects.collections.Map _address = null;
int _idaddress = 0;
anywheresoftware.b4a.objects.collections.List _carts = null;
anywheresoftware.b4a.objects.collections.List _payment_additional_info = null;
anywheresoftware.b4a.objects.collections.Map _colpayment_additional_info = null;
String _value = "";
String _key = "";
anywheresoftware.b4a.objects.collections.List _applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colapplied_taxes = null;
double _amount = 0;
String _code = "";
double _base_amount = 0;
String _title = "";
double _percent = 0;
anywheresoftware.b4a.objects.collections.List _item_applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colitem_applied_taxes = null;
String _type = "";
String _converting_from_quote = "";
anywheresoftware.b4a.objects.collections.List _contacts = null;
String _shipping_description = "";
int _store_to_order_rate = 0;
int _subtotal_invoiced = 0;
int _base_to_order_rate = 0;
int _base_subtotal = 0;
String _protect_code = "";
String _customer_dob = "";
int _base_total_due = 0;
double _base_subtotal_incl_tax = 0;
int _customer_id = 0;
int _customer_group_id = 0;
String _order_currency_code = "";
int _customer_gender = 0;
anywheresoftware.b4a.BA.IterableList group58;
int index58;
int groupLen58;
anywheresoftware.b4a.BA.IterableList group81;
int index81;
int groupLen81;
anywheresoftware.b4a.BA.IterableList group111;
int index111;
int groupLen111;
anywheresoftware.b4a.BA.IterableList group147;
int index147;
int groupLen147;
anywheresoftware.b4a.BA.IterableList group209;
int index209;
int groupLen209;
anywheresoftware.b4a.BA.IterableList group237;
int index237;
int groupLen237;
anywheresoftware.b4a.BA.IterableList group245;
int index245;
int groupLen245;
anywheresoftware.b4a.BA.IterableList group252;
int index252;
int groupLen252;
anywheresoftware.b4a.BA.IterableList group259;
int index259;
int groupLen259;
anywheresoftware.b4a.BA.IterableList group269;
int index269;
int groupLen269;
anywheresoftware.b4a.BA.IterableList group271;
int index271;
int groupLen271;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104464386;
 //BA.debugLineNum = 104464386;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Selecciona";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Selecciona tipo de identificador","Tipo identificador","ID Pedido","Cancelar","Numero pedido",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=104464387;
 //BA.debugLineNum = 104464387;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "btninfopedidoclientemagento_click"), _msa);
this.state = 87;
return;
case 87:
//C
this.state = 1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=104464388;
 //BA.debugLineNum = 104464388;BA.debugLine="If rInt=xui.DialogResponse_Cancel Then Return";
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
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=104464389;
 //BA.debugLineNum = 104464389;BA.debugLine="Dim TipoIdentificador As String";
_tipoidentificador = "";
RDebugUtils.currentLine=104464390;
 //BA.debugLineNum = 104464390;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=104464391;
 //BA.debugLineNum = 104464391;BA.debugLine="TipoIdentificador=\"ID Pedido\"";
_tipoidentificador = "ID Pedido";
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=104464393;
 //BA.debugLineNum = 104464393;BA.debugLine="TipoIdentificador=\"Numero Pedido\"";
_tipoidentificador = "Numero Pedido";
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=104464396;
 //BA.debugLineNum = 104464396;BA.debugLine="Dialog.Title=$\"Indica ${TipoIdentificador}\"$";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)(("Indica "+parent.__c.SmartStringFormatter("",(Object)(_tipoidentificador))+""));
RDebugUtils.currentLine=104464397;
 //BA.debugLineNum = 104464397;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=104464398;
 //BA.debugLineNum = 104464398;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
__ref._dialog /*b4j.docU.b4xdialog*/ ._overlaycolor /*int*/  = ((int)0x00ffffff);
RDebugUtils.currentLine=104464399;
 //BA.debugLineNum = 104464399;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=104464400;
 //BA.debugLineNum = 104464400;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=104464401;
 //BA.debugLineNum = 104464401;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=104464402;
 //BA.debugLineNum = 104464402;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=104464403;
 //BA.debugLineNum = 104464403;BA.debugLine="InputDlg.ConfigureForNumbers(False,False)";
_inputdlg._configurefornumbers /*String*/ (null,parent.__c.False,parent.__c.False);
RDebugUtils.currentLine=104464405;
 //BA.debugLineNum = 104464405;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=104464406;
 //BA.debugLineNum = 104464406;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=104464407;
 //BA.debugLineNum = 104464407;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=104464408;
 //BA.debugLineNum = 104464408;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=104464409;
 //BA.debugLineNum = 104464409;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=104464410;
 //BA.debugLineNum = 104464410;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=104464411;
 //BA.debugLineNum = 104464411;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=104464412;
 //BA.debugLineNum = 104464412;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "btninfopedidoclientemagento_click"), _rsub);
this.state = 88;
return;
case 88:
//C
this.state = 13;
_rint = (int) result[1];
;
RDebugUtils.currentLine=104464414;
 //BA.debugLineNum = 104464414;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 13:
//if
this.state = 18;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
if (true) return ;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=104464415;
 //BA.debugLineNum = 104464415;BA.debugLine="Dim IDSel As Int=InputDlg.Text";
_idsel = (int)(Double.parseDouble(_inputdlg._text /*String*/ ));
RDebugUtils.currentLine=104464417;
 //BA.debugLineNum = 104464417;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidoCli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "btninfopedidoclientemagento_click"), __ref._enviodatosapimagentoinformacionpedidocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ,_tipoidentificador,_idsel));
this.state = 89;
return;
case 89:
//C
this.state = 19;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=104464418;
 //BA.debugLineNum = 104464418;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return";
if (true) break;

case 19:
//if
this.state = 24;
if (_sresp.startsWith("ERROR")) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
if (true) return ;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=104464420;
 //BA.debugLineNum = 104464420;BA.debugLine="TextAreaHTTPResponse.Text=sResp";
__ref._textareahttpresponse /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(_sresp);
RDebugUtils.currentLine=104464422;
 //BA.debugLineNum = 104464422;BA.debugLine="Dim mDataPedido As Map";
_mdatapedido = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=104464423;
 //BA.debugLineNum = 104464423;BA.debugLine="mDataPedido.Initialize";
_mdatapedido.Initialize();
RDebugUtils.currentLine=104464425;
 //BA.debugLineNum = 104464425;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=104464426;
 //BA.debugLineNum = 104464426;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=104464427;
 //BA.debugLineNum = 104464427;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=104464428;
 //BA.debugLineNum = 104464428;BA.debugLine="Dim tax_amount As Double = root.Getdefault(\"tax_a";
_tax_amount = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("tax_amount"),(Object)(0))));
RDebugUtils.currentLine=104464429;
 //BA.debugLineNum = 104464429;BA.debugLine="Dim tax_invoiced As Double = root.Getdefault(\"tax";
_tax_invoiced = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464430;
 //BA.debugLineNum = 104464430;BA.debugLine="Dim customer_note_notify As Int = root.Getdefault";
_customer_note_notify = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_note_notify"),(Object)(0))));
RDebugUtils.currentLine=104464431;
 //BA.debugLineNum = 104464431;BA.debugLine="Dim shipping_discount_amount As Int = root.Getdef";
_shipping_discount_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=104464432;
 //BA.debugLineNum = 104464432;BA.debugLine="Dim base_discount_tax_compensation_invoiced As In";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464433;
 //BA.debugLineNum = 104464433;BA.debugLine="Dim customer_firstname As String = root.Get(\"cust";
_customer_firstname = BA.ObjectToString(_root.Get((Object)("customer_firstname")));
RDebugUtils.currentLine=104464434;
 //BA.debugLineNum = 104464434;BA.debugLine="mDataPedido.Put(\"customer_firstname\",customer_fir";
_mdatapedido.Put((Object)("customer_firstname"),(Object)(_customer_firstname));
RDebugUtils.currentLine=104464435;
 //BA.debugLineNum = 104464435;BA.debugLine="Dim discount_amount As Double = root.Getdefault(\"";
_discount_amount = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_amount"),(Object)(0))));
RDebugUtils.currentLine=104464436;
 //BA.debugLineNum = 104464436;BA.debugLine="Dim billing_address As Map = root.Get(\"billing_ad";
_billing_address = new anywheresoftware.b4a.objects.collections.Map();
_billing_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("billing_address"))));
RDebugUtils.currentLine=104464437;
 //BA.debugLineNum = 104464437;BA.debugLine="Log(\"billing_address\" & billing_address)";
parent.__c.LogImpl("8104464437","billing_address"+BA.ObjectToString(_billing_address),0);
RDebugUtils.currentLine=104464438;
 //BA.debugLineNum = 104464438;BA.debugLine="mDataPedido.Put(\"billing_address\",billing_address";
_mdatapedido.Put((Object)("billing_address"),(Object)(_billing_address.getObject()));
RDebugUtils.currentLine=104464439;
 //BA.debugLineNum = 104464439;BA.debugLine="Dim firstname As String = billing_address.Get(\"fi";
_firstname = BA.ObjectToString(_billing_address.Get((Object)("firstname")));
RDebugUtils.currentLine=104464440;
 //BA.debugLineNum = 104464440;BA.debugLine="Dim address_type As String = billing_address.Get(";
_address_type = BA.ObjectToString(_billing_address.Get((Object)("address_type")));
RDebugUtils.currentLine=104464441;
 //BA.debugLineNum = 104464441;BA.debugLine="Dim customer_address_id As Int = billing_address.";
_customer_address_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("customer_address_id"),(Object)(0))));
RDebugUtils.currentLine=104464442;
 //BA.debugLineNum = 104464442;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
_city = BA.ObjectToString(_billing_address.Get((Object)("city")));
RDebugUtils.currentLine=104464443;
 //BA.debugLineNum = 104464443;BA.debugLine="Dim postcode As String = billing_address.Get(\"pos";
_postcode = BA.ObjectToString(_billing_address.Get((Object)("postcode")));
RDebugUtils.currentLine=104464444;
 //BA.debugLineNum = 104464444;BA.debugLine="Dim region_id As Int = billing_address.Getdefault";
_region_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("region_id"),(Object)(0))));
RDebugUtils.currentLine=104464445;
 //BA.debugLineNum = 104464445;BA.debugLine="Dim telephone As String = billing_address.Get(\"te";
_telephone = BA.ObjectToString(_billing_address.Get((Object)("telephone")));
RDebugUtils.currentLine=104464447;
 //BA.debugLineNum = 104464447;BA.debugLine="Dim IDbilling_address As Int = billing_address.Ge";
_idbilling_address = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("entity_id"),(Object)(0))));
RDebugUtils.currentLine=104464448;
 //BA.debugLineNum = 104464448;BA.debugLine="Dim lastname As String = billing_address.Get(\"las";
_lastname = BA.ObjectToString(_billing_address.Get((Object)("lastname")));
RDebugUtils.currentLine=104464449;
 //BA.debugLineNum = 104464449;BA.debugLine="Dim parent_id As Int = billing_address.Getdefault";
_parent_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("parent_id"),(Object)(0))));
RDebugUtils.currentLine=104464450;
 //BA.debugLineNum = 104464450;BA.debugLine="Dim street As List = billing_address.Get(\"street\"";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_billing_address.Get((Object)("street"))));
RDebugUtils.currentLine=104464451;
 //BA.debugLineNum = 104464451;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 25:
//for
this.state = 28;
group58 = _street;
index58 = 0;
groupLen58 = group58.getSize();
this.state = 90;
if (true) break;

case 90:
//C
this.state = 28;
if (index58 < groupLen58) {
this.state = 27;
_colstreet = BA.ObjectToString(group58.Get(index58));}
if (true) break;

case 91:
//C
this.state = 90;
index58++;
if (true) break;

case 27:
//C
this.state = 91;
RDebugUtils.currentLine=104464452;
 //BA.debugLineNum = 104464452;BA.debugLine="Log(colstreet)";
parent.__c.LogImpl("8104464452",_colstreet,0);
RDebugUtils.currentLine=104464453;
 //BA.debugLineNum = 104464453;BA.debugLine="Dim Calle As String=colstreet";
_calle = _colstreet;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=104464455;
 //BA.debugLineNum = 104464455;BA.debugLine="Dim region As String = billing_address.Get(\"regio";
_region = BA.ObjectToString(_billing_address.Get((Object)("region")));
RDebugUtils.currentLine=104464456;
 //BA.debugLineNum = 104464456;BA.debugLine="Dim country_id As String = billing_address.Get(\"c";
_country_id = BA.ObjectToString(_billing_address.Get((Object)("country_id")));
RDebugUtils.currentLine=104464457;
 //BA.debugLineNum = 104464457;BA.debugLine="Dim email As String = billing_address.Get(\"email\"";
_email = BA.ObjectToString(_billing_address.Get((Object)("email")));
RDebugUtils.currentLine=104464458;
 //BA.debugLineNum = 104464458;BA.debugLine="Dim region_code As String = billing_address.Get(\"";
_region_code = BA.ObjectToString(_billing_address.Get((Object)("region_code")));
RDebugUtils.currentLine=104464459;
 //BA.debugLineNum = 104464459;BA.debugLine="Dim total_paid As Double = root.Getdefault(\"total";
_total_paid = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("total_paid"),(Object)(0))));
RDebugUtils.currentLine=104464460;
 //BA.debugLineNum = 104464460;BA.debugLine="Dim increment_id As String = root.Get(\"increment_";
_increment_id = BA.ObjectToString(_root.Get((Object)("increment_id")));
RDebugUtils.currentLine=104464461;
 //BA.debugLineNum = 104464461;BA.debugLine="Dim payment As Map = root.Get(\"payment\")";
_payment = new anywheresoftware.b4a.objects.collections.Map();
_payment = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("payment"))));
RDebugUtils.currentLine=104464462;
 //BA.debugLineNum = 104464462;BA.debugLine="Log(\"payment\" & payment)";
parent.__c.LogImpl("8104464462","payment"+BA.ObjectToString(_payment),0);
RDebugUtils.currentLine=104464463;
 //BA.debugLineNum = 104464463;BA.debugLine="Dim base_amount_ordered As Double = payment.Getde";
_base_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=104464464;
 //BA.debugLineNum = 104464464;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"a";
_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_paid"),(Object)(0))));
RDebugUtils.currentLine=104464465;
 //BA.debugLineNum = 104464465;BA.debugLine="Dim method As String = payment.Get(\"method\")";
_method = BA.ObjectToString(_payment.Get((Object)("method")));
RDebugUtils.currentLine=104464466;
 //BA.debugLineNum = 104464466;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
_cc_last4 = BA.ObjectToString(_payment.Get((Object)("cc_last4")));
RDebugUtils.currentLine=104464467;
 //BA.debugLineNum = 104464467;BA.debugLine="Dim shipping_captured As Int = payment.Getdefault";
_shipping_captured = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("shipping_captured"),(Object)(0))));
RDebugUtils.currentLine=104464468;
 //BA.debugLineNum = 104464468;BA.debugLine="Dim account_status As String = payment.Get(\"accou";
_account_status = BA.ObjectToString(_payment.Get((Object)("account_status")));
RDebugUtils.currentLine=104464469;
 //BA.debugLineNum = 104464469;BA.debugLine="Dim amount_ordered As Double = payment.Getdefault";
_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=104464471;
 //BA.debugLineNum = 104464471;BA.debugLine="Dim PaymentID As Int = payment.Getdefault(\"entity";
_paymentid = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("entity_id"),(Object)(0))));
RDebugUtils.currentLine=104464472;
 //BA.debugLineNum = 104464472;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefau";
_base_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_paid"),(Object)(0))));
RDebugUtils.currentLine=104464473;
 //BA.debugLineNum = 104464473;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(\"";
_shipping_amount = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=104464474;
 //BA.debugLineNum = 104464474;BA.debugLine="Dim additional_information As List = payment.Get(";
_additional_information = new anywheresoftware.b4a.objects.collections.List();
_additional_information = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_payment.Get((Object)("additional_information"))));
RDebugUtils.currentLine=104464475;
 //BA.debugLineNum = 104464475;BA.debugLine="For Each coladditional_information As String In a";
if (true) break;

case 29:
//for
this.state = 32;
group81 = _additional_information;
index81 = 0;
groupLen81 = group81.getSize();
this.state = 92;
if (true) break;

case 92:
//C
this.state = 32;
if (index81 < groupLen81) {
this.state = 31;
_coladditional_information = BA.ObjectToString(group81.Get(index81));}
if (true) break;

case 93:
//C
this.state = 92;
index81++;
if (true) break;

case 31:
//C
this.state = 93;
RDebugUtils.currentLine=104464476;
 //BA.debugLineNum = 104464476;BA.debugLine="Log(coladditional_information)";
parent.__c.LogImpl("8104464476",_coladditional_information,0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=104464478;
 //BA.debugLineNum = 104464478;BA.debugLine="Dim base_shipping_amount As Int = payment.Getdefa";
_base_shipping_amount = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=104464479;
 //BA.debugLineNum = 104464479;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
_parent_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("parent_id"))));
RDebugUtils.currentLine=104464480;
 //BA.debugLineNum = 104464480;BA.debugLine="Dim base_shipping_captured As Int = payment.Getde";
_base_shipping_captured = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_shipping_captured"),(Object)(0))));
RDebugUtils.currentLine=104464481;
 //BA.debugLineNum = 104464481;BA.debugLine="Dim state As String = root.Get(\"state\")";
_state = BA.ObjectToString(_root.Get((Object)("state")));
RDebugUtils.currentLine=104464482;
 //BA.debugLineNum = 104464482;BA.debugLine="Dim base_shipping_tax_amount As Int = root.Getdef";
_base_shipping_tax_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=104464483;
 //BA.debugLineNum = 104464483;BA.debugLine="Dim base_grand_total As Double = root.Getdefault(";
_base_grand_total = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_grand_total"),(Object)(0))));
RDebugUtils.currentLine=104464484;
 //BA.debugLineNum = 104464484;BA.debugLine="Dim billing_address_id As Int = root.Get(\"billing";
_billing_address_id = (int)(BA.ObjectToNumber(_root.Get((Object)("billing_address_id"))));
RDebugUtils.currentLine=104464485;
 //BA.debugLineNum = 104464485;BA.debugLine="Dim customer_lastname As String = root.Get(\"custo";
_customer_lastname = BA.ObjectToString(_root.Get((Object)("customer_lastname")));
RDebugUtils.currentLine=104464486;
 //BA.debugLineNum = 104464486;BA.debugLine="Dim quote_id As Int = root.Getdefault(\"quote_id\",";
_quote_id = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("quote_id"),(Object)(0))));
RDebugUtils.currentLine=104464487;
 //BA.debugLineNum = 104464487;BA.debugLine="Dim shipping_invoiced As Int = root.Getdefault(\"s";
_shipping_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464488;
 //BA.debugLineNum = 104464488;BA.debugLine="Dim discount_tax_compensation_amount As Int = roo";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=104464489;
 //BA.debugLineNum = 104464489;BA.debugLine="Dim weight As Int = root.Getdefault(\"weight\",0)";
_weight = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("weight"),(Object)(0))));
RDebugUtils.currentLine=104464491;
 //BA.debugLineNum = 104464491;BA.debugLine="Dim IDPedido As Int = root.Get(\"entity_id\")";
_idpedido = (int)(BA.ObjectToNumber(_root.Get((Object)("entity_id"))));
RDebugUtils.currentLine=104464492;
 //BA.debugLineNum = 104464492;BA.debugLine="Dim base_total_invoiced As Double = root.Getdefau";
_base_total_invoiced = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464493;
 //BA.debugLineNum = 104464493;BA.debugLine="Dim base_shipping_amount As Int = root.Getdefault";
_base_shipping_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=104464494;
 //BA.debugLineNum = 104464494;BA.debugLine="Dim base_subtotal_invoiced As Int = root.Getdefau";
_base_subtotal_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_subtotal_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464495;
 //BA.debugLineNum = 104464495;BA.debugLine="Dim applied_rule_ids As String = root.Get(\"applie";
_applied_rule_ids = BA.ObjectToString(_root.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=104464496;
 //BA.debugLineNum = 104464496;BA.debugLine="Dim subtotal_incl_tax As Double = root.Getdefault";
_subtotal_incl_tax = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("subtotal_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464497;
 //BA.debugLineNum = 104464497;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_discount_tax_compensation_amnt"),(Object)(0))));
RDebugUtils.currentLine=104464498;
 //BA.debugLineNum = 104464498;BA.debugLine="Dim subtotal As Int = root.Getdefault(\"subtotal\",";
_subtotal = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("subtotal"),(Object)(0))));
RDebugUtils.currentLine=104464499;
 //BA.debugLineNum = 104464499;BA.debugLine="Dim base_shipping_incl_tax As Int = root.Getdefau";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464500;
 //BA.debugLineNum = 104464500;BA.debugLine="Dim customer_email As String = root.Get(\"customer";
_customer_email = BA.ObjectToString(_root.Get((Object)("customer_email")));
RDebugUtils.currentLine=104464501;
 //BA.debugLineNum = 104464501;BA.debugLine="Dim base_discount_invoiced As Int = root.Getdefau";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464502;
 //BA.debugLineNum = 104464502;BA.debugLine="Dim total_invoiced As Double = root.Getdefault(\"t";
_total_invoiced = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464503;
 //BA.debugLineNum = 104464503;BA.debugLine="Dim base_to_global_rate As Int = root.Getdefault(";
_base_to_global_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_to_global_rate"),(Object)(0))));
RDebugUtils.currentLine=104464504;
 //BA.debugLineNum = 104464504;BA.debugLine="Dim customer_is_guest As Int = root.Getdefault(\"c";
_customer_is_guest = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_is_guest"),(Object)(0))));
RDebugUtils.currentLine=104464505;
 //BA.debugLineNum = 104464505;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=104464506;
 //BA.debugLineNum = 104464506;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 33:
//for
this.state = 48;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group111 = _items;
index111 = 0;
groupLen111 = group111.getSize();
this.state = 94;
if (true) break;

case 94:
//C
this.state = 48;
if (index111 < groupLen111) {
this.state = 35;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group111.Get(index111)));}
if (true) break;

case 95:
//C
this.state = 94;
index111++;
if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=104464507;
 //BA.debugLineNum = 104464507;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(\"";
_tax_amount = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_amount"),(Object)(0))));
RDebugUtils.currentLine=104464508;
 //BA.debugLineNum = 104464508;BA.debugLine="Dim tax_invoiced As Double = colitems.Getdefault";
_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464509;
 //BA.debugLineNum = 104464509;BA.debugLine="Dim original_price As Int = colitems.Getdefault(";
_original_price = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("original_price"),(Object)(0))));
RDebugUtils.currentLine=104464510;
 //BA.debugLineNum = 104464510;BA.debugLine="Dim free_shipping As Int = colitems.Getdefault(\"";
_free_shipping = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("free_shipping"),(Object)(0))));
RDebugUtils.currentLine=104464511;
 //BA.debugLineNum = 104464511;BA.debugLine="Dim base_discount_tax_compensation_invoiced As I";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464512;
 //BA.debugLineNum = 104464512;BA.debugLine="Dim discount_amount As Double = colitems.Getdefa";
_discount_amount = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_amount"),(Object)(0))));
RDebugUtils.currentLine=104464513;
 //BA.debugLineNum = 104464513;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault(";
_tax_percent = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_percent"),(Object)(0))));
RDebugUtils.currentLine=104464514;
 //BA.debugLineNum = 104464514;BA.debugLine="Dim price_incl_tax As Double = colitems.Getdefau";
_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("price_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464515;
 //BA.debugLineNum = 104464515;BA.debugLine="Dim price As Double = colitems.Getdefault(\"price";
_price = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("price"),(Object)(0))));
RDebugUtils.currentLine=104464516;
 //BA.debugLineNum = 104464516;BA.debugLine="Dim product_id As Int = colitems.Get(\"product_id";
_product_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("product_id"))));
RDebugUtils.currentLine=104464517;
 //BA.debugLineNum = 104464517;BA.debugLine="Dim base_row_total As Double = colitems.Getdefau";
_base_row_total = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_row_total"),(Object)(0))));
RDebugUtils.currentLine=104464518;
 //BA.debugLineNum = 104464518;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=104464519;
 //BA.debugLineNum = 104464519;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=104464520;
 //BA.debugLineNum = 104464520;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("weight"))));
RDebugUtils.currentLine=104464521;
 //BA.debugLineNum = 104464521;BA.debugLine="Dim base_original_price As Int = colitems.Getdef";
_base_original_price = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_original_price"),(Object)(0))));
RDebugUtils.currentLine=104464522;
 //BA.debugLineNum = 104464522;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weight";
_row_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_weight"))));
RDebugUtils.currentLine=104464523;
 //BA.debugLineNum = 104464523;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=104464524;
 //BA.debugLineNum = 104464524;BA.debugLine="Dim base_amount_refunded As Int = colitems.Getde";
_base_amount_refunded = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_amount_refunded"),(Object)(0))));
RDebugUtils.currentLine=104464525;
 //BA.debugLineNum = 104464525;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Get";
_base_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_price_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464526;
 //BA.debugLineNum = 104464526;BA.debugLine="Dim no_discount As Int = colitems.Getdefault(\"no";
_no_discount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("no_discount"),(Object)(0))));
RDebugUtils.currentLine=104464527;
 //BA.debugLineNum = 104464527;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=104464528;
 //BA.debugLineNum = 104464528;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464529;
 //BA.debugLineNum = 104464529;BA.debugLine="Dim discount_percent As Int = colitems.Getdefaul";
_discount_percent = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_percent"),(Object)(0))));
RDebugUtils.currentLine=104464530;
 //BA.debugLineNum = 104464530;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
_order_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("order_id"))));
RDebugUtils.currentLine=104464531;
 //BA.debugLineNum = 104464531;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464532;
 //BA.debugLineNum = 104464532;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=104464533;
 //BA.debugLineNum = 104464533;BA.debugLine="Dim qty_shipped As Int = colitems.Getdefault(\"qt";
_qty_shipped = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("qty_shipped"),(Object)(0))));
RDebugUtils.currentLine=104464534;
 //BA.debugLineNum = 104464534;BA.debugLine="Dim qty_ordered As Int = colitems.Getdefault(\"qt";
_qty_ordered = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("qty_ordered"),(Object)(0))));
RDebugUtils.currentLine=104464535;
 //BA.debugLineNum = 104464535;BA.debugLine="Dim row_total As Int = colitems.Getdefault(\"row_";
_row_total = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("row_total"),(Object)(0))));
RDebugUtils.currentLine=104464536;
 //BA.debugLineNum = 104464536;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_canc";
_qty_canceled = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_canceled"))));
RDebugUtils.currentLine=104464537;
 //BA.debugLineNum = 104464537;BA.debugLine="Dim product_option As Map = IIf(colitems.Get(\"pr";
_product_option = new anywheresoftware.b4a.objects.collections.Map();
_product_option = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(((_colitems.Get((Object)("product_option"))== null) ? ((Object)(parent.__c.createMap(new Object[] {(Object)(""),(Object)("")}).getObject())) : (_colitems.Get((Object)("product_option"))))));
RDebugUtils.currentLine=104464538;
 //BA.debugLineNum = 104464538;BA.debugLine="Dim extension_attributes As Map = product_option";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_product_option.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=104464539;
 //BA.debugLineNum = 104464539;BA.debugLine="If extension_attributes.IsInitialized Then";
if (true) break;

case 36:
//if
this.state = 47;
if (_extension_attributes.IsInitialized()) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=104464540;
 //BA.debugLineNum = 104464540;BA.debugLine="Dim configurable_item_options As List = extensi";
_configurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_configurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=104464541;
 //BA.debugLineNum = 104464541;BA.debugLine="Dim Talla As String";
_talla = "";
RDebugUtils.currentLine=104464542;
 //BA.debugLineNum = 104464542;BA.debugLine="For Each colconfigurable_item_options As Map In";
if (true) break;

case 39:
//for
this.state = 46;
_colconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group147 = _configurable_item_options;
index147 = 0;
groupLen147 = group147.getSize();
this.state = 96;
if (true) break;

case 96:
//C
this.state = 46;
if (index147 < groupLen147) {
this.state = 41;
_colconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group147.Get(index147)));}
if (true) break;

case 97:
//C
this.state = 96;
index147++;
if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=104464543;
 //BA.debugLineNum = 104464543;BA.debugLine="Dim option_value As Int = colconfigurable_item";
_option_value = (int)(BA.ObjectToNumber(_colconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=104464544;
 //BA.debugLineNum = 104464544;BA.debugLine="Dim option_id As String = colconfigurable_item";
_option_id = BA.ObjectToString(_colconfigurable_item_options.Get((Object)("option_id")));
RDebugUtils.currentLine=104464545;
 //BA.debugLineNum = 104464545;BA.debugLine="If option_id=142 Then";
if (true) break;

case 42:
//if
this.state = 45;
if ((_option_id).equals(BA.NumberToString(142))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=104464546;
 //BA.debugLineNum = 104464546;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select lab";
_talla = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_option_value)}));
 if (true) break;

case 45:
//C
this.state = 97;
;
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
;
 if (true) break;

case 47:
//C
this.state = 95;
;
RDebugUtils.currentLine=104464550;
 //BA.debugLineNum = 104464550;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amoun";
_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("amount_refunded"))));
RDebugUtils.currentLine=104464551;
 //BA.debugLineNum = 104464551;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=104464552;
 //BA.debugLineNum = 104464552;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_price";
_base_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_price"))));
RDebugUtils.currentLine=104464553;
 //BA.debugLineNum = 104464553;BA.debugLine="Dim qty_invoiced As Int = colitems.Getdefault(\"q";
_qty_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("qty_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464554;
 //BA.debugLineNum = 104464554;BA.debugLine="Dim row_invoiced As Int = colitems.Getdefault(\"r";
_row_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("row_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464555;
 //BA.debugLineNum = 104464555;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get(";
_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("row_total_incl_tax"))));
RDebugUtils.currentLine=104464556;
 //BA.debugLineNum = 104464556;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=104464557;
 //BA.debugLineNum = 104464557;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"store";
_store_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_id"),(Object)(0))));
RDebugUtils.currentLine=104464558;
 //BA.debugLineNum = 104464558;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
_item_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("item_id"))));
RDebugUtils.currentLine=104464559;
 //BA.debugLineNum = 104464559;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=104464560;
 //BA.debugLineNum = 104464560;BA.debugLine="Dim base_row_total_incl_tax As Double = colitems";
_base_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total_incl_tax"))));
RDebugUtils.currentLine=104464561;
 //BA.debugLineNum = 104464561;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_tax_compensation_amount"))));
RDebugUtils.currentLine=104464562;
 //BA.debugLineNum = 104464562;BA.debugLine="Dim product_type As String = colitems.Get(\"produ";
_product_type = BA.ObjectToString(_colitems.Get((Object)("product_type")));
RDebugUtils.currentLine=104464563;
 //BA.debugLineNum = 104464563;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_refu";
_qty_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_refunded"))));
RDebugUtils.currentLine=104464564;
 //BA.debugLineNum = 104464564;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"bas";
_base_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_invoiced"))));
RDebugUtils.currentLine=104464565;
 //BA.debugLineNum = 104464565;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault(";
_is_qty_decimal = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("is_qty_decimal"),(Object)(0))));
RDebugUtils.currentLine=104464566;
 //BA.debugLineNum = 104464566;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464567;
 //BA.debugLineNum = 104464567;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Getde";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_tax_invoiced"),(Object)(0))));
 if (true) break;
if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=104464569;
 //BA.debugLineNum = 104464569;BA.debugLine="Dim global_currency_code As String = root.Get(\"gl";
_global_currency_code = BA.ObjectToString(_root.Get((Object)("global_currency_code")));
RDebugUtils.currentLine=104464570;
 //BA.debugLineNum = 104464570;BA.debugLine="Dim status As String = root.Get(\"status\")";
_status = BA.ObjectToString(_root.Get((Object)("status")));
RDebugUtils.currentLine=104464571;
 //BA.debugLineNum = 104464571;BA.debugLine="Dim is_virtual As Int = root.Getdefault(\"is_virtu";
_is_virtual = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("is_virtual"),(Object)(0))));
RDebugUtils.currentLine=104464572;
 //BA.debugLineNum = 104464572;BA.debugLine="Dim base_total_invoiced_cost As Int = root.Getdef";
_base_total_invoiced_cost = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_invoiced_cost"),(Object)(0))));
RDebugUtils.currentLine=104464573;
 //BA.debugLineNum = 104464573;BA.debugLine="Dim discount_tax_compensation_invoiced As Int = r";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464574;
 //BA.debugLineNum = 104464574;BA.debugLine="Dim status_histories As List = root.Get(\"status_h";
_status_histories = new anywheresoftware.b4a.objects.collections.List();
_status_histories = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("status_histories"))));
RDebugUtils.currentLine=104464575;
 //BA.debugLineNum = 104464575;BA.debugLine="Dim store_currency_code As String = root.Get(\"sto";
_store_currency_code = BA.ObjectToString(_root.Get((Object)("store_currency_code")));
RDebugUtils.currentLine=104464576;
 //BA.debugLineNum = 104464576;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
_created_at = BA.ObjectToString(_root.Get((Object)("created_at")));
RDebugUtils.currentLine=104464577;
 //BA.debugLineNum = 104464577;BA.debugLine="Dim total_item_count As Int = root.Get(\"total_ite";
_total_item_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_item_count"))));
RDebugUtils.currentLine=104464578;
 //BA.debugLineNum = 104464578;BA.debugLine="Dim shipping_tax_amount As Int = root.Getdefault(";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=104464579;
 //BA.debugLineNum = 104464579;BA.debugLine="Dim store_to_base_rate As Int = root.Getdefault(\"";
_store_to_base_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("store_to_base_rate"),(Object)(0))));
RDebugUtils.currentLine=104464580;
 //BA.debugLineNum = 104464580;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
_updated_at = BA.ObjectToString(_root.Get((Object)("updated_at")));
RDebugUtils.currentLine=104464581;
 //BA.debugLineNum = 104464581;BA.debugLine="Dim base_shipping_discount_amount As Int = root.G";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=104464582;
 //BA.debugLineNum = 104464582;BA.debugLine="Dim store_name As String = root.Get(\"store_name\")";
_store_name = BA.ObjectToString(_root.Get((Object)("store_name")));
RDebugUtils.currentLine=104464583;
 //BA.debugLineNum = 104464583;BA.debugLine="Dim grand_total As Double = root.Get(\"grand_total";
_grand_total = (double)(BA.ObjectToNumber(_root.Get((Object)("grand_total"))));
RDebugUtils.currentLine=104464584;
 //BA.debugLineNum = 104464584;BA.debugLine="Dim base_currency_code As String = root.Get(\"base";
_base_currency_code = BA.ObjectToString(_root.Get((Object)("base_currency_code")));
RDebugUtils.currentLine=104464585;
 //BA.debugLineNum = 104464585;BA.debugLine="Dim base_total_paid As Double = root.Getdefault(\"";
_base_total_paid = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_paid"),(Object)(0))));
RDebugUtils.currentLine=104464586;
 //BA.debugLineNum = 104464586;BA.debugLine="Dim base_tax_amount As Double = root.Getdefault(\"";
_base_tax_amount = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=104464587;
 //BA.debugLineNum = 104464587;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_root.Get((Object)("store_id"))));
RDebugUtils.currentLine=104464588;
 //BA.debugLineNum = 104464588;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=104464589;
 //BA.debugLineNum = 104464589;BA.debugLine="Dim total_due As Int = root.Get(\"total_due\")";
_total_due = (int)(BA.ObjectToNumber(_root.Get((Object)("total_due"))));
RDebugUtils.currentLine=104464590;
 //BA.debugLineNum = 104464590;BA.debugLine="Dim total_qty_ordered As Int = root.Getdefault(\"t";
_total_qty_ordered = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("total_qty_ordered"),(Object)(0))));
RDebugUtils.currentLine=104464591;
 //BA.debugLineNum = 104464591;BA.debugLine="Dim base_discount_amount As Int = root.Getdefault";
_base_discount_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=104464592;
 //BA.debugLineNum = 104464592;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=104464593;
 //BA.debugLineNum = 104464593;BA.debugLine="Log(\"extension_attributes\" & extension_attributes";
parent.__c.LogImpl("8104464593","extension_attributes"+BA.ObjectToString(_extension_attributes),0);
RDebugUtils.currentLine=104464594;
 //BA.debugLineNum = 104464594;BA.debugLine="Dim pgw As Map = extension_attributes.Get(\"pgw\")";
_pgw = new anywheresoftware.b4a.objects.collections.Map();
_pgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_extension_attributes.Get((Object)("pgw"))));
RDebugUtils.currentLine=104464595;
 //BA.debugLineNum = 104464595;BA.debugLine="Log(\"pgw\" & pgw)";
parent.__c.LogImpl("8104464595","pgw"+BA.ObjectToString(_pgw),0);
RDebugUtils.currentLine=104464596;
 //BA.debugLineNum = 104464596;BA.debugLine="Dim extrinsic As List = pgw.Get(\"extrinsic\")";
_extrinsic = new anywheresoftware.b4a.objects.collections.List();
_extrinsic = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("extrinsic"))));
RDebugUtils.currentLine=104464597;
 //BA.debugLineNum = 104464597;BA.debugLine="Dim extra_data As List = pgw.Get(\"extra_data\")";
_extra_data = new anywheresoftware.b4a.objects.collections.List();
_extra_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("extra_data"))));
RDebugUtils.currentLine=104464598;
 //BA.debugLineNum = 104464598;BA.debugLine="Dim posr_data As List = pgw.Get(\"posr_data\")";
_posr_data = new anywheresoftware.b4a.objects.collections.List();
_posr_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("posr_data"))));
RDebugUtils.currentLine=104464599;
 //BA.debugLineNum = 104464599;BA.debugLine="Dim originator As List = pgw.Get(\"originator\")";
_originator = new anywheresoftware.b4a.objects.collections.List();
_originator = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("originator"))));
RDebugUtils.currentLine=104464600;
 //BA.debugLineNum = 104464600;BA.debugLine="Dim entity_id As String = pgw.Get(\"entity_id\")";
_entity_id = BA.ObjectToString(_pgw.Get((Object)("entity_id")));
RDebugUtils.currentLine=104464601;
 //BA.debugLineNum = 104464601;BA.debugLine="Dim poom_data As List = pgw.Get(\"poom_data\")";
_poom_data = new anywheresoftware.b4a.objects.collections.List();
_poom_data = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_pgw.Get((Object)("poom_data"))));
RDebugUtils.currentLine=104464602;
 //BA.debugLineNum = 104464602;BA.debugLine="Dim po_number As String=pgw.Get(\"po_number\")";
_po_number = BA.ObjectToString(_pgw.Get((Object)("po_number")));
RDebugUtils.currentLine=104464603;
 //BA.debugLineNum = 104464603;BA.debugLine="Dim shipping_assignments As List = extension_attr";
_shipping_assignments = new anywheresoftware.b4a.objects.collections.List();
_shipping_assignments = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("shipping_assignments"))));
RDebugUtils.currentLine=104464604;
 //BA.debugLineNum = 104464604;BA.debugLine="For Each colshipping_assignments As Map In shippi";
if (true) break;

case 49:
//for
this.state = 60;
_colshipping_assignments = new anywheresoftware.b4a.objects.collections.Map();
group209 = _shipping_assignments;
index209 = 0;
groupLen209 = group209.getSize();
this.state = 98;
if (true) break;

case 98:
//C
this.state = 60;
if (index209 < groupLen209) {
this.state = 51;
_colshipping_assignments = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group209.Get(index209)));}
if (true) break;

case 99:
//C
this.state = 98;
index209++;
if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=104464605;
 //BA.debugLineNum = 104464605;BA.debugLine="Dim shipping As Map = colshipping_assignments.Ge";
_shipping = new anywheresoftware.b4a.objects.collections.Map();
_shipping = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colshipping_assignments.Get((Object)("shipping"))));
RDebugUtils.currentLine=104464606;
 //BA.debugLineNum = 104464606;BA.debugLine="Log(\"shipping\" & shipping)";
parent.__c.LogImpl("8104464606","shipping"+BA.ObjectToString(_shipping),0);
RDebugUtils.currentLine=104464607;
 //BA.debugLineNum = 104464607;BA.debugLine="Dim total As Map = shipping.Get(\"total\")";
_total = new anywheresoftware.b4a.objects.collections.Map();
_total = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_shipping.Get((Object)("total"))));
RDebugUtils.currentLine=104464608;
 //BA.debugLineNum = 104464608;BA.debugLine="Dim shipping_amount As Int = total.Get(\"shipping";
_shipping_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_amount"))));
RDebugUtils.currentLine=104464609;
 //BA.debugLineNum = 104464609;BA.debugLine="Dim base_shipping_amount As Int = total.Get(\"bas";
_base_shipping_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("base_shipping_amount"))));
RDebugUtils.currentLine=104464610;
 //BA.debugLineNum = 104464610;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=104464611;
 //BA.debugLineNum = 104464611;BA.debugLine="Dim shipping_discount_amount As Int = total.Getd";
_shipping_discount_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=104464612;
 //BA.debugLineNum = 104464612;BA.debugLine="Dim base_shipping_discount_amount As Int = total";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_discount_amount"),(Object)(0))));
RDebugUtils.currentLine=104464613;
 //BA.debugLineNum = 104464613;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_discount_tax_compensation_amnt"),(Object)(0))));
RDebugUtils.currentLine=104464614;
 //BA.debugLineNum = 104464614;BA.debugLine="Dim base_shipping_incl_tax As Int = total.Getdef";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464615;
 //BA.debugLineNum = 104464615;BA.debugLine="Dim shipping_invoiced As Int = total.Getdefault(";
_shipping_invoiced = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464616;
 //BA.debugLineNum = 104464616;BA.debugLine="Dim shipping_incl_tax As Int = total.Getdefault(";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464617;
 //BA.debugLineNum = 104464617;BA.debugLine="Dim base_shipping_invoiced As Int = total.Getdef";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464618;
 //BA.debugLineNum = 104464618;BA.debugLine="Dim base_shipping_tax_amount As Int = total.Getd";
_base_shipping_tax_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("base_shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=104464619;
 //BA.debugLineNum = 104464619;BA.debugLine="Dim shipping_tax_amount As Int = total.Getdefaul";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_total.GetDefault((Object)("shipping_tax_amount"),(Object)(0))));
RDebugUtils.currentLine=104464620;
 //BA.debugLineNum = 104464620;BA.debugLine="Dim address As Map = shipping.Get(\"address\")";
_address = new anywheresoftware.b4a.objects.collections.Map();
_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_shipping.Get((Object)("address"))));
RDebugUtils.currentLine=104464621;
 //BA.debugLineNum = 104464621;BA.debugLine="Dim firstname As String = address.Get(\"firstname";
_firstname = BA.ObjectToString(_address.Get((Object)("firstname")));
RDebugUtils.currentLine=104464622;
 //BA.debugLineNum = 104464622;BA.debugLine="Dim address_type As String = address.Get(\"addres";
_address_type = BA.ObjectToString(_address.Get((Object)("address_type")));
RDebugUtils.currentLine=104464623;
 //BA.debugLineNum = 104464623;BA.debugLine="Dim customer_address_id As Int = address.Getdefa";
_customer_address_id = (int)(BA.ObjectToNumber(_address.GetDefault((Object)("customer_address_id"),(Object)(0))));
RDebugUtils.currentLine=104464624;
 //BA.debugLineNum = 104464624;BA.debugLine="Dim city As String = address.Get(\"city\")";
_city = BA.ObjectToString(_address.Get((Object)("city")));
RDebugUtils.currentLine=104464625;
 //BA.debugLineNum = 104464625;BA.debugLine="Dim postcode As String = address.Get(\"postcode\")";
_postcode = BA.ObjectToString(_address.Get((Object)("postcode")));
RDebugUtils.currentLine=104464626;
 //BA.debugLineNum = 104464626;BA.debugLine="Dim region_id As Int = address.Getdefault(\"regio";
_region_id = (int)(BA.ObjectToNumber(_address.GetDefault((Object)("region_id"),(Object)(0))));
RDebugUtils.currentLine=104464627;
 //BA.debugLineNum = 104464627;BA.debugLine="Dim telephone As String = address.Get(\"telephone";
_telephone = BA.ObjectToString(_address.Get((Object)("telephone")));
RDebugUtils.currentLine=104464629;
 //BA.debugLineNum = 104464629;BA.debugLine="Dim IDAddress As Int = address.Getdefault(\"entit";
_idaddress = (int)(BA.ObjectToNumber(_address.GetDefault((Object)("entity_id"),(Object)(0))));
RDebugUtils.currentLine=104464630;
 //BA.debugLineNum = 104464630;BA.debugLine="Dim lastname As String = address.Get(\"lastname\")";
_lastname = BA.ObjectToString(_address.Get((Object)("lastname")));
RDebugUtils.currentLine=104464631;
 //BA.debugLineNum = 104464631;BA.debugLine="Dim parent_id As Int = address.Getdefault(\"paren";
_parent_id = (int)(BA.ObjectToNumber(_address.GetDefault((Object)("parent_id"),(Object)(0))));
RDebugUtils.currentLine=104464632;
 //BA.debugLineNum = 104464632;BA.debugLine="Dim street As List = address.Get(\"street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_address.Get((Object)("street"))));
RDebugUtils.currentLine=104464633;
 //BA.debugLineNum = 104464633;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 52:
//for
this.state = 55;
group237 = _street;
index237 = 0;
groupLen237 = group237.getSize();
this.state = 100;
if (true) break;

case 100:
//C
this.state = 55;
if (index237 < groupLen237) {
this.state = 54;
_colstreet = BA.ObjectToString(group237.Get(index237));}
if (true) break;

case 101:
//C
this.state = 100;
index237++;
if (true) break;

case 54:
//C
this.state = 101;
 if (true) break;
if (true) break;

case 55:
//C
this.state = 56;
;
RDebugUtils.currentLine=104464635;
 //BA.debugLineNum = 104464635;BA.debugLine="Dim region As String = address.Get(\"region\")";
_region = BA.ObjectToString(_address.Get((Object)("region")));
RDebugUtils.currentLine=104464636;
 //BA.debugLineNum = 104464636;BA.debugLine="Dim country_id As String = address.Get(\"country_";
_country_id = BA.ObjectToString(_address.Get((Object)("country_id")));
RDebugUtils.currentLine=104464637;
 //BA.debugLineNum = 104464637;BA.debugLine="Dim email As String = address.Get(\"email\")";
_email = BA.ObjectToString(_address.Get((Object)("email")));
RDebugUtils.currentLine=104464638;
 //BA.debugLineNum = 104464638;BA.debugLine="Dim region_code As String = address.Get(\"region_";
_region_code = BA.ObjectToString(_address.Get((Object)("region_code")));
RDebugUtils.currentLine=104464639;
 //BA.debugLineNum = 104464639;BA.debugLine="Dim method As String = shipping.Get(\"method\")";
_method = BA.ObjectToString(_shipping.Get((Object)("method")));
RDebugUtils.currentLine=104464640;
 //BA.debugLineNum = 104464640;BA.debugLine="Dim items As List = colshipping_assignments.Get(";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colshipping_assignments.Get((Object)("items"))));
RDebugUtils.currentLine=104464641;
 //BA.debugLineNum = 104464641;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 56:
//for
this.state = 59;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group245 = _items;
index245 = 0;
groupLen245 = group245.getSize();
this.state = 102;
if (true) break;

case 102:
//C
this.state = 59;
if (index245 < groupLen245) {
this.state = 58;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group245.Get(index245)));}
if (true) break;

case 103:
//C
this.state = 102;
index245++;
if (true) break;

case 58:
//C
this.state = 103;
RDebugUtils.currentLine=104464642;
 //BA.debugLineNum = 104464642;BA.debugLine="Log(\"colitems\" & colitems)";
parent.__c.LogImpl("8104464642","colitems"+BA.ObjectToString(_colitems),0);
 if (true) break;
if (true) break;

case 59:
//C
this.state = 99;
;
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=104464700;
 //BA.debugLineNum = 104464700;BA.debugLine="Dim carts As List = extension_attributes.Get(\"car";
_carts = new anywheresoftware.b4a.objects.collections.List();
_carts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("carts"))));
RDebugUtils.currentLine=104464701;
 //BA.debugLineNum = 104464701;BA.debugLine="If extension_attributes.ContainsKey(\"payment_addi";
if (true) break;

case 61:
//if
this.state = 68;
if (_extension_attributes.ContainsKey((Object)("payment_additional_info"))) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=104464702;
 //BA.debugLineNum = 104464702;BA.debugLine="Dim payment_additional_info As List = extension_";
_payment_additional_info = new anywheresoftware.b4a.objects.collections.List();
_payment_additional_info = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("payment_additional_info"))));
RDebugUtils.currentLine=104464703;
 //BA.debugLineNum = 104464703;BA.debugLine="For Each colpayment_additional_info As Map In pa";
if (true) break;

case 64:
//for
this.state = 67;
_colpayment_additional_info = new anywheresoftware.b4a.objects.collections.Map();
group252 = _payment_additional_info;
index252 = 0;
groupLen252 = group252.getSize();
this.state = 104;
if (true) break;

case 104:
//C
this.state = 67;
if (index252 < groupLen252) {
this.state = 66;
_colpayment_additional_info = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group252.Get(index252)));}
if (true) break;

case 105:
//C
this.state = 104;
index252++;
if (true) break;

case 66:
//C
this.state = 105;
RDebugUtils.currentLine=104464704;
 //BA.debugLineNum = 104464704;BA.debugLine="Dim value As String = colpayment_additional_inf";
_value = BA.ObjectToString(_colpayment_additional_info.Get((Object)("value")));
RDebugUtils.currentLine=104464705;
 //BA.debugLineNum = 104464705;BA.debugLine="Dim key As String = colpayment_additional_info.";
_key = BA.ObjectToString(_colpayment_additional_info.Get((Object)("key")));
 if (true) break;
if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;
;
RDebugUtils.currentLine=104464708;
 //BA.debugLineNum = 104464708;BA.debugLine="If extension_attributes.ContainsKey(\"applied_taxe";

case 68:
//if
this.state = 75;
if (_extension_attributes.ContainsKey((Object)("applied_taxes"))) { 
this.state = 70;
}if (true) break;

case 70:
//C
this.state = 71;
RDebugUtils.currentLine=104464709;
 //BA.debugLineNum = 104464709;BA.debugLine="Dim applied_taxes As List = extension_attributes";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=104464710;
 //BA.debugLineNum = 104464710;BA.debugLine="For Each colapplied_taxes As Map In applied_taxe";
if (true) break;

case 71:
//for
this.state = 74;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group259 = _applied_taxes;
index259 = 0;
groupLen259 = group259.getSize();
this.state = 106;
if (true) break;

case 106:
//C
this.state = 74;
if (index259 < groupLen259) {
this.state = 73;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group259.Get(index259)));}
if (true) break;

case 107:
//C
this.state = 106;
index259++;
if (true) break;

case 73:
//C
this.state = 107;
RDebugUtils.currentLine=104464711;
 //BA.debugLineNum = 104464711;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"am";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=104464712;
 //BA.debugLineNum = 104464712;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"code";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=104464713;
 //BA.debugLineNum = 104464713;BA.debugLine="Dim base_amount As Double = colapplied_taxes.Ge";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=104464714;
 //BA.debugLineNum = 104464714;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"tit";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=104464715;
 //BA.debugLineNum = 104464715;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"p";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 74:
//C
this.state = 75;
;
 if (true) break;
;
RDebugUtils.currentLine=104464718;
 //BA.debugLineNum = 104464718;BA.debugLine="If extension_attributes.ContainsKey(\"item_applied";

case 75:
//if
this.state = 86;
if (_extension_attributes.ContainsKey((Object)("item_applied_taxes"))) { 
this.state = 77;
}if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=104464719;
 //BA.debugLineNum = 104464719;BA.debugLine="Dim item_applied_taxes As List = extension_attri";
_item_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_item_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("item_applied_taxes"))));
RDebugUtils.currentLine=104464720;
 //BA.debugLineNum = 104464720;BA.debugLine="For Each colitem_applied_taxes As Map In item_ap";
if (true) break;

case 78:
//for
this.state = 85;
_colitem_applied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group269 = _item_applied_taxes;
index269 = 0;
groupLen269 = group269.getSize();
this.state = 108;
if (true) break;

case 108:
//C
this.state = 85;
if (index269 < groupLen269) {
this.state = 80;
_colitem_applied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group269.Get(index269)));}
if (true) break;

case 109:
//C
this.state = 108;
index269++;
if (true) break;

case 80:
//C
this.state = 81;
RDebugUtils.currentLine=104464721;
 //BA.debugLineNum = 104464721;BA.debugLine="Dim applied_taxes As List = colitem_applied_tax";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitem_applied_taxes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=104464722;
 //BA.debugLineNum = 104464722;BA.debugLine="For Each colapplied_taxes As Map In applied_tax";
if (true) break;

case 81:
//for
this.state = 84;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group271 = _applied_taxes;
index271 = 0;
groupLen271 = group271.getSize();
this.state = 110;
if (true) break;

case 110:
//C
this.state = 84;
if (index271 < groupLen271) {
this.state = 83;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group271.Get(index271)));}
if (true) break;

case 111:
//C
this.state = 110;
index271++;
if (true) break;

case 83:
//C
this.state = 111;
RDebugUtils.currentLine=104464723;
 //BA.debugLineNum = 104464723;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"a";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=104464724;
 //BA.debugLineNum = 104464724;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"cod";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=104464725;
 //BA.debugLineNum = 104464725;BA.debugLine="Dim base_amount As Double = colapplied_taxes.G";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=104464726;
 //BA.debugLineNum = 104464726;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"ti";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=104464727;
 //BA.debugLineNum = 104464727;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 84:
//C
this.state = 109;
;
RDebugUtils.currentLine=104464729;
 //BA.debugLineNum = 104464729;BA.debugLine="Dim Type As String = colitem_applied_taxes.Get(";
_type = BA.ObjectToString(_colitem_applied_taxes.Get((Object)("type")));
 if (true) break;
if (true) break;

case 85:
//C
this.state = 86;
;
 if (true) break;

case 86:
//C
this.state = -1;
;
RDebugUtils.currentLine=104464732;
 //BA.debugLineNum = 104464732;BA.debugLine="Dim converting_from_quote As String = extension_a";
_converting_from_quote = BA.ObjectToString(_extension_attributes.Get((Object)("converting_from_quote")));
RDebugUtils.currentLine=104464733;
 //BA.debugLineNum = 104464733;BA.debugLine="Dim contacts As List = extension_attributes.Get(\"";
_contacts = new anywheresoftware.b4a.objects.collections.List();
_contacts = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("contacts"))));
RDebugUtils.currentLine=104464734;
 //BA.debugLineNum = 104464734;BA.debugLine="Dim shipping_description As String = root.Get(\"sh";
_shipping_description = BA.ObjectToString(_root.Get((Object)("shipping_description")));
RDebugUtils.currentLine=104464735;
 //BA.debugLineNum = 104464735;BA.debugLine="Dim store_to_order_rate As Int = root.Getdefault(";
_store_to_order_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("store_to_order_rate"),(Object)(0))));
RDebugUtils.currentLine=104464736;
 //BA.debugLineNum = 104464736;BA.debugLine="Dim shipping_amount As Int = root.Getdefault(\"shi";
_shipping_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=104464737;
 //BA.debugLineNum = 104464737;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=104464738;
 //BA.debugLineNum = 104464738;BA.debugLine="Dim subtotal_invoiced As Int = root.Getdefault(\"s";
_subtotal_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("subtotal_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464739;
 //BA.debugLineNum = 104464739;BA.debugLine="Dim base_to_order_rate As Int = root.Getdefault(\"";
_base_to_order_rate = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_to_order_rate"),(Object)(0))));
RDebugUtils.currentLine=104464740;
 //BA.debugLineNum = 104464740;BA.debugLine="Dim base_subtotal As Int = root.Getdefault(\"base_";
_base_subtotal = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_subtotal"),(Object)(0))));
RDebugUtils.currentLine=104464741;
 //BA.debugLineNum = 104464741;BA.debugLine="Dim protect_code As String = root.Get(\"protect_co";
_protect_code = BA.ObjectToString(_root.Get((Object)("protect_code")));
RDebugUtils.currentLine=104464742;
 //BA.debugLineNum = 104464742;BA.debugLine="Dim customer_dob As String = root.Get(\"customer_d";
_customer_dob = BA.ObjectToString(_root.Get((Object)("customer_dob")));
RDebugUtils.currentLine=104464743;
 //BA.debugLineNum = 104464743;BA.debugLine="Dim base_total_due As Int = root.Getdefault(\"base";
_base_total_due = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_total_due"),(Object)(0))));
RDebugUtils.currentLine=104464744;
 //BA.debugLineNum = 104464744;BA.debugLine="Dim base_subtotal_incl_tax As Double = root.Getde";
_base_subtotal_incl_tax = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_subtotal_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464745;
 //BA.debugLineNum = 104464745;BA.debugLine="Dim customer_id As Int = root.Getdefault(\"custome";
_customer_id = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_id"),(Object)(0))));
RDebugUtils.currentLine=104464746;
 //BA.debugLineNum = 104464746;BA.debugLine="Dim customer_group_id As Int = root.Getdefault(\"c";
_customer_group_id = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_group_id"),(Object)(0))));
RDebugUtils.currentLine=104464747;
 //BA.debugLineNum = 104464747;BA.debugLine="Dim discount_invoiced As Int = root.Getdefault(\"d";
_discount_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464748;
 //BA.debugLineNum = 104464748;BA.debugLine="Dim order_currency_code As String = root.Get(\"ord";
_order_currency_code = BA.ObjectToString(_root.Get((Object)("order_currency_code")));
RDebugUtils.currentLine=104464749;
 //BA.debugLineNum = 104464749;BA.debugLine="Dim base_tax_invoiced As Double = root.Getdefault";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_root.GetDefault((Object)("base_tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464750;
 //BA.debugLineNum = 104464750;BA.debugLine="Dim customer_gender As Int = root.Getdefault(\"cus";
_customer_gender = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("customer_gender"),(Object)(0))));
RDebugUtils.currentLine=104464751;
 //BA.debugLineNum = 104464751;BA.debugLine="Dim shipping_incl_tax As Int = root.Getdefault(\"s";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=104464752;
 //BA.debugLineNum = 104464752;BA.debugLine="Dim base_shipping_invoiced As Int = root.Getdefau";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_root.GetDefault((Object)("base_shipping_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104464756;
 //BA.debugLineNum = 104464756;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacionpedidocliente(b4j.docU.ctestsinfomagento __ref,String _token,String _tipoidentificador,int _idsel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacionpedidocliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacionpedidocliente", new Object[] {_token,_tipoidentificador,_idsel}));}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(this,__ref,_token,_tipoidentificador,_idsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidoCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token,String _tipoidentificador,int _idsel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._tipoidentificador = _tipoidentificador;
this._idsel = _idsel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
String _tipoidentificador;
int _idsel;
String _squeryapi = "";
b4j.docU.httpjob _job = null;
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104529922;
 //BA.debugLineNum = 104529922;BA.debugLine="If TipoIdentificador=\"ID Pedido\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_tipoidentificador).equals("ID Pedido")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=104529923;
 //BA.debugLineNum = 104529923;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-web";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/orders/"+parent.__c.SmartStringFormatter("",(Object)(_idsel))+"");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=104529925;
 //BA.debugLineNum = 104529925;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-web";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/orders/search?\n"+"	searchCriteria[filterGroups][0][filters][0][field]=increment_id&\n"+"	searchCriteria[filterGroups][0][filters][0][value]="+parent.__c.SmartStringFormatter("",(Object)(_idsel))+"&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=eq");
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=104529931;
 //BA.debugLineNum = 104529931;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=104529932;
 //BA.debugLineNum = 104529932;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=104529935;
 //BA.debugLineNum = 104529935;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=104529937;
 //BA.debugLineNum = 104529937;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=104529938;
 //BA.debugLineNum = 104529938;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=104529940;
 //BA.debugLineNum = 104529940;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=104529942;
 //BA.debugLineNum = 104529942;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacionpedidocliente"), (Object)(_job));
this.state = 13;
return;
case 13:
//C
this.state = 7;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=104529944;
 //BA.debugLineNum = 104529944;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=104529945;
 //BA.debugLineNum = 104529945;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8104529945","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=104529946;
 //BA.debugLineNum = 104529946;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8104529946",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=104529947;
 //BA.debugLineNum = 104529947;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=104529948;
 //BA.debugLineNum = 104529948;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104529949;
 //BA.debugLineNum = 104529949;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=104529952;
 //BA.debugLineNum = 104529952;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=104529953;
 //BA.debugLineNum = 104529953;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104529954;
 //BA.debugLineNum = 104529954;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=104529956;
 //BA.debugLineNum = 104529956;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnlistapedidosmagento_click(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "btnlistapedidosmagento_click", false))
	 {Debug.delegate(ba, "btnlistapedidosmagento_click", null); return;}
ResumableSub_btnListaPedidosMagento_Click rsub = new ResumableSub_btnListaPedidosMagento_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnListaPedidosMagento_Click extends BA.ResumableSub {
public ResumableSub_btnListaPedidosMagento_Click(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _total_count = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
String _customer_firstname = "";
anywheresoftware.b4a.objects.collections.Map _billing_address = null;
String _firstname = "";
String _address_type = "";
int _customer_address_id = 0;
String _city = "";
String _postcode = "";
int _region_id = 0;
String _telephone = "";
int _entity_id = 0;
String _lastname = "";
int _parent_id = 0;
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
String _region = "";
String _country_id = "";
String _email = "";
String _region_code = "";
double _total_paid = 0;
String _increment_id = "";
anywheresoftware.b4a.objects.collections.Map _payment = null;
double _base_amount_ordered = 0;
double _amount_paid = 0;
String _method = "";
String _cc_last4 = "";
String _account_status = "";
double _amount_ordered = 0;
double _base_amount_paid = 0;
int _shipping_amount = 0;
anywheresoftware.b4a.objects.collections.List _additional_information = null;
String _coladditional_information = "";
int _base_shipping_amount = 0;
String _state = "";
double _base_grand_total = 0;
int _billing_address_id = 0;
String _customer_lastname = "";
int _quote_id = 0;
int _shipping_invoiced = 0;
int _discount_tax_compensation_amount = 0;
int _weight = 0;
int _idpedido = 0;
double _base_total_invoiced = 0;
int _base_subtotal_invoiced = 0;
String _applied_rule_ids = "";
double _subtotal_incl_tax = 0;
int _base_shipping_discount_tax_compensation_amnt = 0;
int _subtotal = 0;
int _base_shipping_incl_tax = 0;
String _customer_email = "";
int _base_discount_invoiced = 0;
double _total_invoiced = 0;
int _base_to_global_rate = 0;
int _customer_is_guest = 0;
double _tax_amount = 0;
double _tax_invoiced = 0;
int _original_price = 0;
int _free_shipping = 0;
int _base_discount_tax_compensation_invoiced = 0;
int _discount_amount = 0;
double _tax_percent = 0;
double _price_incl_tax = 0;
int _price = 0;
int _product_id = 0;
int _base_row_total = 0;
String _sku = "";
int _base_original_price = 0;
int _row_weight = 0;
int _base_amount_refunded = 0;
double _base_price_incl_tax = 0;
int _no_discount = 0;
String _name = "";
int _discount_percent = 0;
int _order_id = 0;
int _discount_tax_compensation_invoiced = 0;
String _created_at = "";
int _qty_shipped = 0;
int _qty_ordered = 0;
int _row_total = 0;
int _qty_canceled = 0;
anywheresoftware.b4a.objects.collections.Map _product_option = null;
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
anywheresoftware.b4a.objects.collections.List _configurable_item_options = null;
anywheresoftware.b4a.objects.collections.Map _colconfigurable_item_options = null;
int _option_value = 0;
String _option_id = "";
int _amount_refunded = 0;
String _updated_at = "";
int _base_price = 0;
int _qty_invoiced = 0;
int _row_invoiced = 0;
double _row_total_incl_tax = 0;
double _base_tax_amount = 0;
int _store_id = 0;
int _item_id = 0;
int _base_discount_amount = 0;
double _base_row_total_incl_tax = 0;
int _base_discount_tax_compensation_amount = 0;
String _product_type = "";
int _qty_refunded = 0;
int _base_row_invoiced = 0;
int _is_qty_decimal = 0;
int _discount_invoiced = 0;
double _base_tax_invoiced = 0;
String _global_currency_code = "";
String _status = "";
int _is_virtual = 0;
int _base_total_invoiced_cost = 0;
anywheresoftware.b4a.objects.collections.List _status_histories = null;
String _store_currency_code = "";
int _total_item_count = 0;
int _shipping_tax_amount = 0;
int _store_to_base_rate = 0;
int _base_shipping_discount_amount = 0;
String _store_name = "";
double _grand_total = 0;
String _base_currency_code = "";
double _base_total_paid = 0;
int _shipping_discount_tax_compensation_amount = 0;
int _total_due = 0;
int _total_qty_ordered = 0;
anywheresoftware.b4a.objects.collections.List _shipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _colshipping_assignments = null;
anywheresoftware.b4a.objects.collections.Map _shipping = null;
anywheresoftware.b4a.objects.collections.Map _total = null;
int _shipping_discount_amount = 0;
int _shipping_incl_tax = 0;
int _base_shipping_invoiced = 0;
int _base_shipping_tax_amount = 0;
anywheresoftware.b4a.objects.collections.Map _address = null;
anywheresoftware.b4a.objects.collections.List _payment_additional_info = null;
anywheresoftware.b4a.objects.collections.Map _colpayment_additional_info = null;
String _value = "";
String _key = "";
anywheresoftware.b4a.objects.collections.List _applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colapplied_taxes = null;
double _amount = 0;
String _code = "";
double _base_amount = 0;
String _title = "";
double _percent = 0;
anywheresoftware.b4a.objects.collections.List _item_applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colitem_applied_taxes = null;
String _type = "";
String _converting_from_quote = "";
String _shipping_description = "";
int _store_to_order_rate = 0;
int _subtotal_invoiced = 0;
int _base_to_order_rate = 0;
int _base_subtotal = 0;
String _protect_code = "";
String _customer_dob = "";
int _base_total_due = 0;
double _base_subtotal_incl_tax = 0;
int _customer_id = 0;
int _customer_group_id = 0;
String _order_currency_code = "";
int _customer_gender = 0;
anywheresoftware.b4a.objects.collections.Map _search_criteria = null;
anywheresoftware.b4a.objects.collections.List _filter_groups = null;
int _page_size = 0;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;
anywheresoftware.b4a.BA.IterableList group23;
int index23;
int groupLen23;
anywheresoftware.b4a.BA.IterableList group43;
int index43;
int groupLen43;
anywheresoftware.b4a.BA.IterableList group71;
int index71;
int groupLen71;
anywheresoftware.b4a.BA.IterableList group106;
int index106;
int groupLen106;
anywheresoftware.b4a.BA.IterableList group157;
int index157;
int groupLen157;
anywheresoftware.b4a.BA.IterableList group184;
int index184;
int groupLen184;
anywheresoftware.b4a.BA.IterableList group192;
int index192;
int groupLen192;
anywheresoftware.b4a.BA.IterableList group226;
int index226;
int groupLen226;
anywheresoftware.b4a.BA.IterableList group252;
int index252;
int groupLen252;
anywheresoftware.b4a.BA.IterableList group257;
int index257;
int groupLen257;
anywheresoftware.b4a.BA.IterableList group265;
int index265;
int groupLen265;
anywheresoftware.b4a.BA.IterableList group267;
int index267;
int groupLen267;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104333314;
 //BA.debugLineNum = 104333314;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidos(t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "btnlistapedidosmagento_click"), __ref._enviodatosapimagentoinformacionpedidos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 71;
return;
case 71:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=104333315;
 //BA.debugLineNum = 104333315;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.startsWith("ERROR")) { 
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
RDebugUtils.currentLine=104333317;
 //BA.debugLineNum = 104333317;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=104333318;
 //BA.debugLineNum = 104333318;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=104333319;
 //BA.debugLineNum = 104333319;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=104333320;
 //BA.debugLineNum = 104333320;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
_total_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_count"))));
RDebugUtils.currentLine=104333321;
 //BA.debugLineNum = 104333321;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=104333322;
 //BA.debugLineNum = 104333322;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 7:
//for
this.state = 70;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group8 = _items;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 72;
if (true) break;

case 72:
//C
this.state = 70;
if (index8 < groupLen8) {
this.state = 9;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group8.Get(index8)));}
if (true) break;

case 73:
//C
this.state = 72;
index8++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=104333323;
 //BA.debugLineNum = 104333323;BA.debugLine="Log(\"ColItems: \" & colitems)";
parent.__c.LogImpl("8104333323","ColItems: "+BA.ObjectToString(_colitems),0);
RDebugUtils.currentLine=104333329;
 //BA.debugLineNum = 104333329;BA.debugLine="Dim customer_firstname As String = colitems.Get(";
_customer_firstname = BA.ObjectToString(_colitems.Get((Object)("customer_firstname")));
RDebugUtils.currentLine=104333331;
 //BA.debugLineNum = 104333331;BA.debugLine="Dim billing_address As Map = colitems.Get(\"billi";
_billing_address = new anywheresoftware.b4a.objects.collections.Map();
_billing_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("billing_address"))));
RDebugUtils.currentLine=104333332;
 //BA.debugLineNum = 104333332;BA.debugLine="Dim firstname As String = billing_address.Get(\"f";
_firstname = BA.ObjectToString(_billing_address.Get((Object)("firstname")));
RDebugUtils.currentLine=104333333;
 //BA.debugLineNum = 104333333;BA.debugLine="Dim address_type As String = billing_address.Get";
_address_type = BA.ObjectToString(_billing_address.Get((Object)("address_type")));
RDebugUtils.currentLine=104333334;
 //BA.debugLineNum = 104333334;BA.debugLine="Dim customer_address_id As Int = billing_address";
_customer_address_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("customer_address_id"),(Object)(-1))));
RDebugUtils.currentLine=104333335;
 //BA.debugLineNum = 104333335;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
_city = BA.ObjectToString(_billing_address.Get((Object)("city")));
RDebugUtils.currentLine=104333336;
 //BA.debugLineNum = 104333336;BA.debugLine="Dim postcode As String = billing_address.Get(\"po";
_postcode = BA.ObjectToString(_billing_address.Get((Object)("postcode")));
RDebugUtils.currentLine=104333337;
 //BA.debugLineNum = 104333337;BA.debugLine="Dim region_id As Int = billing_address.Getdefaul";
_region_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("region_id"),(Object)(0))));
RDebugUtils.currentLine=104333338;
 //BA.debugLineNum = 104333338;BA.debugLine="Dim telephone As String = billing_address.Get(\"t";
_telephone = BA.ObjectToString(_billing_address.Get((Object)("telephone")));
RDebugUtils.currentLine=104333339;
 //BA.debugLineNum = 104333339;BA.debugLine="Dim entity_id As Int = billing_address.Get(\"enti";
_entity_id = (int)(BA.ObjectToNumber(_billing_address.Get((Object)("entity_id"))));
RDebugUtils.currentLine=104333340;
 //BA.debugLineNum = 104333340;BA.debugLine="Dim lastname As String = billing_address.Get(\"la";
_lastname = BA.ObjectToString(_billing_address.Get((Object)("lastname")));
RDebugUtils.currentLine=104333341;
 //BA.debugLineNum = 104333341;BA.debugLine="Dim parent_id As Int = billing_address.Get(\"pare";
_parent_id = (int)(BA.ObjectToNumber(_billing_address.Get((Object)("parent_id"))));
RDebugUtils.currentLine=104333342;
 //BA.debugLineNum = 104333342;BA.debugLine="Dim street As List = billing_address.Get(\"street";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_billing_address.Get((Object)("street"))));
RDebugUtils.currentLine=104333343;
 //BA.debugLineNum = 104333343;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 10:
//for
this.state = 13;
group23 = _street;
index23 = 0;
groupLen23 = group23.getSize();
this.state = 74;
if (true) break;

case 74:
//C
this.state = 13;
if (index23 < groupLen23) {
this.state = 12;
_colstreet = BA.ObjectToString(group23.Get(index23));}
if (true) break;

case 75:
//C
this.state = 74;
index23++;
if (true) break;

case 12:
//C
this.state = 75;
RDebugUtils.currentLine=104333344;
 //BA.debugLineNum = 104333344;BA.debugLine="Log(\"colstreet:\" & colstreet)";
parent.__c.LogImpl("8104333344","colstreet:"+_colstreet,0);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=104333346;
 //BA.debugLineNum = 104333346;BA.debugLine="Dim region As String = billing_address.Get(\"regi";
_region = BA.ObjectToString(_billing_address.Get((Object)("region")));
RDebugUtils.currentLine=104333347;
 //BA.debugLineNum = 104333347;BA.debugLine="Dim country_id As String = billing_address.Get(\"";
_country_id = BA.ObjectToString(_billing_address.Get((Object)("country_id")));
RDebugUtils.currentLine=104333348;
 //BA.debugLineNum = 104333348;BA.debugLine="Dim email As String = billing_address.Get(\"email";
_email = BA.ObjectToString(_billing_address.Get((Object)("email")));
RDebugUtils.currentLine=104333349;
 //BA.debugLineNum = 104333349;BA.debugLine="Dim region_code As String = billing_address.Get(";
_region_code = BA.ObjectToString(_billing_address.Get((Object)("region_code")));
RDebugUtils.currentLine=104333350;
 //BA.debugLineNum = 104333350;BA.debugLine="Dim total_paid As Double = colitems.Getdefault(\"";
_total_paid = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_paid"),(Object)(0))));
RDebugUtils.currentLine=104333351;
 //BA.debugLineNum = 104333351;BA.debugLine="Dim increment_id As String = colitems.Get(\"incre";
_increment_id = BA.ObjectToString(_colitems.Get((Object)("increment_id")));
RDebugUtils.currentLine=104333352;
 //BA.debugLineNum = 104333352;BA.debugLine="Dim payment As Map = colitems.Get(\"payment\")";
_payment = new anywheresoftware.b4a.objects.collections.Map();
_payment = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("payment"))));
RDebugUtils.currentLine=104333353;
 //BA.debugLineNum = 104333353;BA.debugLine="Dim base_amount_ordered As Double = payment.Getd";
_base_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=104333354;
 //BA.debugLineNum = 104333354;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"";
_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_paid"),(Object)(0))));
RDebugUtils.currentLine=104333355;
 //BA.debugLineNum = 104333355;BA.debugLine="Dim method As String = payment.Get(\"method\")";
_method = BA.ObjectToString(_payment.Get((Object)("method")));
RDebugUtils.currentLine=104333356;
 //BA.debugLineNum = 104333356;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
_cc_last4 = BA.ObjectToString(_payment.Get((Object)("cc_last4")));
RDebugUtils.currentLine=104333358;
 //BA.debugLineNum = 104333358;BA.debugLine="Dim account_status As String = payment.Get(\"acco";
_account_status = BA.ObjectToString(_payment.Get((Object)("account_status")));
RDebugUtils.currentLine=104333359;
 //BA.debugLineNum = 104333359;BA.debugLine="Dim amount_ordered As Double = payment.Getdefaul";
_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=104333360;
 //BA.debugLineNum = 104333360;BA.debugLine="Dim entity_id As Int = payment.Get(\"entity_id\")";
_entity_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("entity_id"))));
RDebugUtils.currentLine=104333361;
 //BA.debugLineNum = 104333361;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefa";
_base_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_paid"),(Object)(0))));
RDebugUtils.currentLine=104333362;
 //BA.debugLineNum = 104333362;BA.debugLine="Dim shipping_amount As Int = payment.Get(\"shippi";
_shipping_amount = (int)(BA.ObjectToNumber(_payment.Get((Object)("shipping_amount"))));
RDebugUtils.currentLine=104333363;
 //BA.debugLineNum = 104333363;BA.debugLine="Dim additional_information As List = payment.Get";
_additional_information = new anywheresoftware.b4a.objects.collections.List();
_additional_information = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_payment.Get((Object)("additional_information"))));
RDebugUtils.currentLine=104333364;
 //BA.debugLineNum = 104333364;BA.debugLine="For Each coladditional_information As String In";
if (true) break;

case 14:
//for
this.state = 17;
group43 = _additional_information;
index43 = 0;
groupLen43 = group43.getSize();
this.state = 76;
if (true) break;

case 76:
//C
this.state = 17;
if (index43 < groupLen43) {
this.state = 16;
_coladditional_information = BA.ObjectToString(group43.Get(index43));}
if (true) break;

case 77:
//C
this.state = 76;
index43++;
if (true) break;

case 16:
//C
this.state = 77;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=104333366;
 //BA.debugLineNum = 104333366;BA.debugLine="Dim base_shipping_amount As Int = payment.Get(\"b";
_base_shipping_amount = (int)(BA.ObjectToNumber(_payment.Get((Object)("base_shipping_amount"))));
RDebugUtils.currentLine=104333367;
 //BA.debugLineNum = 104333367;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
_parent_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("parent_id"))));
RDebugUtils.currentLine=104333369;
 //BA.debugLineNum = 104333369;BA.debugLine="Dim state As String = colitems.Get(\"state\")";
_state = BA.ObjectToString(_colitems.Get((Object)("state")));
RDebugUtils.currentLine=104333371;
 //BA.debugLineNum = 104333371;BA.debugLine="Dim base_grand_total As Double = colitems.Get(\"b";
_base_grand_total = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_grand_total"))));
RDebugUtils.currentLine=104333372;
 //BA.debugLineNum = 104333372;BA.debugLine="Dim billing_address_id As Int = colitems.Get(\"bi";
_billing_address_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("billing_address_id"))));
RDebugUtils.currentLine=104333373;
 //BA.debugLineNum = 104333373;BA.debugLine="Dim customer_lastname As String = colitems.Get(\"";
_customer_lastname = BA.ObjectToString(_colitems.Get((Object)("customer_lastname")));
RDebugUtils.currentLine=104333374;
 //BA.debugLineNum = 104333374;BA.debugLine="Dim quote_id As Int = colitems.Get(\"quote_id\")";
_quote_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("quote_id"))));
RDebugUtils.currentLine=104333375;
 //BA.debugLineNum = 104333375;BA.debugLine="Dim shipping_invoiced As Int = colitems.Getdefau";
_shipping_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=104333376;
 //BA.debugLineNum = 104333376;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_tax_compensation_amount"))));
RDebugUtils.currentLine=104333377;
 //BA.debugLineNum = 104333377;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("weight"))));
RDebugUtils.currentLine=104333378;
 //BA.debugLineNum = 104333378;BA.debugLine="Dim entity_id As Int = colitems.Get(\"entity_id\")";
_entity_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("entity_id"))));
RDebugUtils.currentLine=104333379;
 //BA.debugLineNum = 104333379;BA.debugLine="Dim IDPedido As Int = colitems.Get(\"entity_id\")";
_idpedido = (int)(BA.ObjectToNumber(_colitems.Get((Object)("entity_id"))));
RDebugUtils.currentLine=104333380;
 //BA.debugLineNum = 104333380;BA.debugLine="Dim base_total_invoiced As Double = colitems.Get";
_base_total_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104333381;
 //BA.debugLineNum = 104333381;BA.debugLine="Dim base_shipping_amount As Int = colitems.Get(\"";
_base_shipping_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_shipping_amount"))));
RDebugUtils.currentLine=104333382;
 //BA.debugLineNum = 104333382;BA.debugLine="Dim base_subtotal_invoiced As Int = colitems.Get";
_base_subtotal_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_subtotal_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104333383;
 //BA.debugLineNum = 104333383;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=104333384;
 //BA.debugLineNum = 104333384;BA.debugLine="Dim subtotal_incl_tax As Double = colitems.Get(\"";
_subtotal_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("subtotal_incl_tax"))));
RDebugUtils.currentLine=104333385;
 //BA.debugLineNum = 104333385;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_shipping_discount_tax_compensation_amnt"))));
RDebugUtils.currentLine=104333386;
 //BA.debugLineNum = 104333386;BA.debugLine="Dim subtotal As Int = colitems.Get(\"subtotal\")";
_subtotal = (int)(BA.ObjectToNumber(_colitems.Get((Object)("subtotal"))));
RDebugUtils.currentLine=104333387;
 //BA.debugLineNum = 104333387;BA.debugLine="Dim base_shipping_incl_tax As Int = colitems.Get";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_shipping_incl_tax"))));
RDebugUtils.currentLine=104333388;
 //BA.debugLineNum = 104333388;BA.debugLine="Dim customer_email As String = colitems.Get(\"cus";
_customer_email = BA.ObjectToString(_colitems.Get((Object)("customer_email")));
RDebugUtils.currentLine=104333389;
 //BA.debugLineNum = 104333389;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104333390;
 //BA.debugLineNum = 104333390;BA.debugLine="Dim total_invoiced As Double = colitems.Getdefau";
_total_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104333391;
 //BA.debugLineNum = 104333391;BA.debugLine="Dim base_to_global_rate As Int = colitems.Get(\"b";
_base_to_global_rate = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_to_global_rate"))));
RDebugUtils.currentLine=104333392;
 //BA.debugLineNum = 104333392;BA.debugLine="Dim customer_is_guest As Int = colitems.Get(\"cus";
_customer_is_guest = (int)(BA.ObjectToNumber(_colitems.Get((Object)("customer_is_guest"))));
RDebugUtils.currentLine=104333393;
 //BA.debugLineNum = 104333393;BA.debugLine="Dim items As List = colitems.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("items"))));
RDebugUtils.currentLine=104333394;
 //BA.debugLineNum = 104333394;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 18:
//for
this.state = 29;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group71 = _items;
index71 = 0;
groupLen71 = group71.getSize();
this.state = 78;
if (true) break;

case 78:
//C
this.state = 29;
if (index71 < groupLen71) {
this.state = 20;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group71.Get(index71)));}
if (true) break;

case 79:
//C
this.state = 78;
index71++;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=104333395;
 //BA.debugLineNum = 104333395;BA.debugLine="Dim tax_amount As Double = Utilidades.FixNullDo";
_tax_amount = parent._utilidades._fixnulldouble /*double*/ (_colitems.Get((Object)("tax_amount")));
RDebugUtils.currentLine=104333396;
 //BA.debugLineNum = 104333396;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"tax_";
_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("tax_invoiced"))));
RDebugUtils.currentLine=104333397;
 //BA.debugLineNum = 104333397;BA.debugLine="Dim original_price As Int = colitems.Get(\"origi";
_original_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("original_price"))));
RDebugUtils.currentLine=104333398;
 //BA.debugLineNum = 104333398;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"free_s";
_free_shipping = (int)(BA.ObjectToNumber(_colitems.Get((Object)("free_shipping"))));
RDebugUtils.currentLine=104333399;
 //BA.debugLineNum = 104333399;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
_base_discount_tax_compensation_invoiced = parent._utilidades._fixnullint /*int*/ (_colitems.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(0)));
RDebugUtils.currentLine=104333400;
 //BA.debugLineNum = 104333400;BA.debugLine="Dim discount_amount As Int = Utilidades.FixNull";
_discount_amount = parent._utilidades._fixnullint /*int*/ (_colitems.Get((Object)("discount_amount")));
RDebugUtils.currentLine=104333401;
 //BA.debugLineNum = 104333401;BA.debugLine="Dim tax_percent As Double = Utilidades.FixNullD";
_tax_percent = parent._utilidades._fixnulldouble /*double*/ (_colitems.Get((Object)("tax_percent")));
RDebugUtils.currentLine=104333402;
 //BA.debugLineNum = 104333402;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
_price_incl_tax = parent._utilidades._fixnulldouble /*double*/ (_colitems.GetDefault((Object)("price_incl_tax"),(Object)(0)));
RDebugUtils.currentLine=104333403;
 //BA.debugLineNum = 104333403;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("price"))));
RDebugUtils.currentLine=104333404;
 //BA.debugLineNum = 104333404;BA.debugLine="Dim product_id As Int = colitems.Get(\"product_i";
_product_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("product_id"))));
RDebugUtils.currentLine=104333405;
 //BA.debugLineNum = 104333405;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"base_";
_base_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total"))));
RDebugUtils.currentLine=104333406;
 //BA.debugLineNum = 104333406;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=104333407;
 //BA.debugLineNum = 104333407;BA.debugLine="Dim discount_tax_compensation_amount As Int = U";
_discount_tax_compensation_amount = parent._utilidades._fixnullint /*int*/ (_colitems.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0)));
RDebugUtils.currentLine=104333408;
 //BA.debugLineNum = 104333408;BA.debugLine="Dim weight As Int = Utilidades.FixNullInt(colit";
_weight = parent._utilidades._fixnullint /*int*/ (_colitems.GetDefault((Object)("weight"),(Object)(-1)));
RDebugUtils.currentLine=104333409;
 //BA.debugLineNum = 104333409;BA.debugLine="Dim base_original_price As Int = colitems.GetDE";
_base_original_price = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_original_price"),(Object)(0))));
RDebugUtils.currentLine=104333410;
 //BA.debugLineNum = 104333410;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weigh";
_row_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_weight"))));
RDebugUtils.currentLine=104333411;
 //BA.debugLineNum = 104333411;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=104333412;
 //BA.debugLineNum = 104333412;BA.debugLine="Dim base_amount_refunded As Int = colitems.Get(";
_base_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_amount_refunded"))));
RDebugUtils.currentLine=104333413;
 //BA.debugLineNum = 104333413;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Ge";
_base_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_price_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=104333414;
 //BA.debugLineNum = 104333414;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_disco";
_no_discount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("no_discount"))));
RDebugUtils.currentLine=104333415;
 //BA.debugLineNum = 104333415;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=104333416;
 //BA.debugLineNum = 104333416;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Ge";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_invoiced"))));
RDebugUtils.currentLine=104333417;
 //BA.debugLineNum = 104333417;BA.debugLine="Dim discount_percent As Int = colitems.Get(\"dis";
_discount_percent = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_percent"))));
RDebugUtils.currentLine=104333418;
 //BA.debugLineNum = 104333418;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
_order_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("order_id"))));
RDebugUtils.currentLine=104333419;
 //BA.debugLineNum = 104333419;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104333420;
 //BA.debugLineNum = 104333420;BA.debugLine="Dim created_at As String = colitems.Get(\"create";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=104333421;
 //BA.debugLineNum = 104333421;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_ship";
_qty_shipped = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_shipped"))));
RDebugUtils.currentLine=104333422;
 //BA.debugLineNum = 104333422;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_orde";
_qty_ordered = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_ordered"))));
RDebugUtils.currentLine=104333423;
 //BA.debugLineNum = 104333423;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_total\"";
_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_total"))));
RDebugUtils.currentLine=104333424;
 //BA.debugLineNum = 104333424;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_can";
_qty_canceled = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_canceled"))));
RDebugUtils.currentLine=104333425;
 //BA.debugLineNum = 104333425;BA.debugLine="Dim product_option As Map = colitems.Get(\"produ";
_product_option = new anywheresoftware.b4a.objects.collections.Map();
_product_option = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("product_option"))));
RDebugUtils.currentLine=104333426;
 //BA.debugLineNum = 104333426;BA.debugLine="If product_option.IsInitialized Then";
if (true) break;

case 21:
//if
this.state = 28;
if (_product_option.IsInitialized()) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=104333427;
 //BA.debugLineNum = 104333427;BA.debugLine="Dim extension_attributes As Map = product_opti";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_product_option.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=104333428;
 //BA.debugLineNum = 104333428;BA.debugLine="Dim configurable_item_options As List = extens";
_configurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_configurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=104333429;
 //BA.debugLineNum = 104333429;BA.debugLine="For Each colconfigurable_item_options As Map I";
if (true) break;

case 24:
//for
this.state = 27;
_colconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group106 = _configurable_item_options;
index106 = 0;
groupLen106 = group106.getSize();
this.state = 80;
if (true) break;

case 80:
//C
this.state = 27;
if (index106 < groupLen106) {
this.state = 26;
_colconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group106.Get(index106)));}
if (true) break;

case 81:
//C
this.state = 80;
index106++;
if (true) break;

case 26:
//C
this.state = 81;
RDebugUtils.currentLine=104333430;
 //BA.debugLineNum = 104333430;BA.debugLine="Dim option_value As Int = colconfigurable_ite";
_option_value = (int)(BA.ObjectToNumber(_colconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=104333431;
 //BA.debugLineNum = 104333431;BA.debugLine="Dim option_id As String = colconfigurable_ite";
_option_id = BA.ObjectToString(_colconfigurable_item_options.Get((Object)("option_id")));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = 79;
;
RDebugUtils.currentLine=104333434;
 //BA.debugLineNum = 104333434;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amou";
_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("amount_refunded"))));
RDebugUtils.currentLine=104333435;
 //BA.debugLineNum = 104333435;BA.debugLine="Dim updated_at As String = colitems.Get(\"update";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=104333436;
 //BA.debugLineNum = 104333436;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_pric";
_base_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_price"))));
RDebugUtils.currentLine=104333437;
 //BA.debugLineNum = 104333437;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_inv";
_qty_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_invoiced"))));
RDebugUtils.currentLine=104333438;
 //BA.debugLineNum = 104333438;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_inv";
_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_invoiced"))));
RDebugUtils.currentLine=104333439;
 //BA.debugLineNum = 104333439;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get";
_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("row_total_incl_tax"))));
RDebugUtils.currentLine=104333440;
 //BA.debugLineNum = 104333440;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"b";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=104333441;
 //BA.debugLineNum = 104333441;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("store_id"))));
RDebugUtils.currentLine=104333442;
 //BA.debugLineNum = 104333442;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
_item_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("item_id"))));
RDebugUtils.currentLine=104333443;
 //BA.debugLineNum = 104333443;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=104333444;
 //BA.debugLineNum = 104333444;BA.debugLine="Dim base_row_total_incl_tax As Double = colitem";
_base_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total_incl_tax"))));
RDebugUtils.currentLine=104333445;
 //BA.debugLineNum = 104333445;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=104333446;
 //BA.debugLineNum = 104333446;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
_product_type = BA.ObjectToString(_colitems.Get((Object)("product_type")));
RDebugUtils.currentLine=104333447;
 //BA.debugLineNum = 104333447;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_ref";
_qty_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_refunded"))));
RDebugUtils.currentLine=104333448;
 //BA.debugLineNum = 104333448;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"ba";
_base_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_invoiced"))));
RDebugUtils.currentLine=104333449;
 //BA.debugLineNum = 104333449;BA.debugLine="Dim is_qty_decimal As Int = colitems.Get(\"is_qt";
_is_qty_decimal = (int)(BA.ObjectToNumber(_colitems.Get((Object)("is_qty_decimal"))));
RDebugUtils.currentLine=104333450;
 //BA.debugLineNum = 104333450;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(\"di";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_invoiced"))));
RDebugUtils.currentLine=104333451;
 //BA.debugLineNum = 104333451;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_invoiced"))));
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=104333453;
 //BA.debugLineNum = 104333453;BA.debugLine="Dim global_currency_code As String = colitems.Ge";
_global_currency_code = BA.ObjectToString(_colitems.Get((Object)("global_currency_code")));
RDebugUtils.currentLine=104333454;
 //BA.debugLineNum = 104333454;BA.debugLine="Dim status As String = colitems.Get(\"status\")";
_status = BA.ObjectToString(_colitems.Get((Object)("status")));
RDebugUtils.currentLine=104333455;
 //BA.debugLineNum = 104333455;BA.debugLine="Dim is_virtual As Int = colitems.Getdefault(\"is_";
_is_virtual = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("is_virtual"),(Object)(0))));
RDebugUtils.currentLine=104333456;
 //BA.debugLineNum = 104333456;BA.debugLine="Dim base_total_invoiced_cost As Int = colitems.G";
_base_total_invoiced_cost = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_invoiced_cost"),(Object)(-1))));
RDebugUtils.currentLine=104333457;
 //BA.debugLineNum = 104333457;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=104333458;
 //BA.debugLineNum = 104333458;BA.debugLine="Dim status_histories As List = colitems.Get(\"sta";
_status_histories = new anywheresoftware.b4a.objects.collections.List();
_status_histories = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("status_histories"))));
RDebugUtils.currentLine=104333459;
 //BA.debugLineNum = 104333459;BA.debugLine="Dim store_currency_code As String = colitems.Get";
_store_currency_code = BA.ObjectToString(_colitems.Get((Object)("store_currency_code")));
RDebugUtils.currentLine=104333460;
 //BA.debugLineNum = 104333460;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=104333461;
 //BA.debugLineNum = 104333461;BA.debugLine="Dim total_item_count As Int = colitems.Getdefaul";
_total_item_count = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_item_count"),(Object)(-1))));
RDebugUtils.currentLine=104333462;
 //BA.debugLineNum = 104333462;BA.debugLine="Dim shipping_tax_amount As Int = colitems.Getdef";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_tax_amount"),(Object)(-1))));
RDebugUtils.currentLine=104333463;
 //BA.debugLineNum = 104333463;BA.debugLine="Dim store_to_base_rate As Int = colitems.Getdefa";
_store_to_base_rate = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_to_base_rate"),(Object)(1))));
RDebugUtils.currentLine=104333464;
 //BA.debugLineNum = 104333464;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=104333465;
 //BA.debugLineNum = 104333465;BA.debugLine="Dim base_shipping_discount_amount As Int = colit";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_shipping_discount_amount"),(Object)(-1))));
RDebugUtils.currentLine=104333466;
 //BA.debugLineNum = 104333466;BA.debugLine="Dim store_name As String = colitems.Get(\"store_n";
_store_name = BA.ObjectToString(_colitems.Get((Object)("store_name")));
RDebugUtils.currentLine=104333467;
 //BA.debugLineNum = 104333467;BA.debugLine="Dim grand_total As Double = colitems.Getdefault(";
_grand_total = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("grand_total"),(Object)(-1))));
RDebugUtils.currentLine=104333468;
 //BA.debugLineNum = 104333468;BA.debugLine="Dim base_currency_code As String = colitems.Get(";
_base_currency_code = BA.ObjectToString(_colitems.Get((Object)("base_currency_code")));
RDebugUtils.currentLine=104333469;
 //BA.debugLineNum = 104333469;BA.debugLine="Dim base_total_paid As Double = colitems.Getdefa";
_base_total_paid = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_paid"),(Object)(-1))));
RDebugUtils.currentLine=104333470;
 //BA.debugLineNum = 104333470;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=104333471;
 //BA.debugLineNum = 104333471;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("store_id"))));
RDebugUtils.currentLine=104333472;
 //BA.debugLineNum = 104333472;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=104333473;
 //BA.debugLineNum = 104333473;BA.debugLine="Dim total_due As Int = colitems.Getdefault(\"tota";
_total_due = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_due"),(Object)(-1))));
RDebugUtils.currentLine=104333474;
 //BA.debugLineNum = 104333474;BA.debugLine="Dim total_qty_ordered As Int = colitems.Getdefau";
_total_qty_ordered = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_qty_ordered"),(Object)(-1))));
RDebugUtils.currentLine=104333475;
 //BA.debugLineNum = 104333475;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=104333476;
 //BA.debugLineNum = 104333476;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=104333477;
 //BA.debugLineNum = 104333477;BA.debugLine="If extension_attributes.IsInitialized Then";
if (true) break;

case 30:
//if
this.state = 69;
if (_extension_attributes.IsInitialized()) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=104333478;
 //BA.debugLineNum = 104333478;BA.debugLine="Dim shipping_assignments As List = extension_at";
_shipping_assignments = new anywheresoftware.b4a.objects.collections.List();
_shipping_assignments = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("shipping_assignments"))));
RDebugUtils.currentLine=104333479;
 //BA.debugLineNum = 104333479;BA.debugLine="If shipping_assignments.IsInitialized Then";
if (true) break;

case 33:
//if
this.state = 52;
if (_shipping_assignments.IsInitialized()) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=104333480;
 //BA.debugLineNum = 104333480;BA.debugLine="For Each colshipping_assignments As Map In shi";
if (true) break;

case 36:
//for
this.state = 51;
_colshipping_assignments = new anywheresoftware.b4a.objects.collections.Map();
group157 = _shipping_assignments;
index157 = 0;
groupLen157 = group157.getSize();
this.state = 82;
if (true) break;

case 82:
//C
this.state = 51;
if (index157 < groupLen157) {
this.state = 38;
_colshipping_assignments = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group157.Get(index157)));}
if (true) break;

case 83:
//C
this.state = 82;
index157++;
if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=104333481;
 //BA.debugLineNum = 104333481;BA.debugLine="Dim shipping As Map = colshipping_assignments";
_shipping = new anywheresoftware.b4a.objects.collections.Map();
_shipping = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colshipping_assignments.Get((Object)("shipping"))));
RDebugUtils.currentLine=104333482;
 //BA.debugLineNum = 104333482;BA.debugLine="Dim total As Map = shipping.Get(\"total\")";
_total = new anywheresoftware.b4a.objects.collections.Map();
_total = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_shipping.Get((Object)("total"))));
RDebugUtils.currentLine=104333483;
 //BA.debugLineNum = 104333483;BA.debugLine="Dim shipping_amount As Int = total.Get(\"shipp";
_shipping_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_amount"))));
RDebugUtils.currentLine=104333484;
 //BA.debugLineNum = 104333484;BA.debugLine="Dim base_shipping_amount As Int = total.Get(\"";
_base_shipping_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("base_shipping_amount"))));
RDebugUtils.currentLine=104333485;
 //BA.debugLineNum = 104333485;BA.debugLine="Dim shipping_discount_tax_compensation_amount";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_discount_tax_compensation_amount"))));
RDebugUtils.currentLine=104333486;
 //BA.debugLineNum = 104333486;BA.debugLine="Dim shipping_discount_amount As Int = total.G";
_shipping_discount_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_discount_amount"))));
RDebugUtils.currentLine=104333487;
 //BA.debugLineNum = 104333487;BA.debugLine="Dim base_shipping_discount_amount As Int = to";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("base_shipping_discount_amount"))));
RDebugUtils.currentLine=104333488;
 //BA.debugLineNum = 104333488;BA.debugLine="Dim base_shipping_discount_tax_compensation_a";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_total.Get((Object)("base_shipping_discount_tax_compensation_amnt"))));
RDebugUtils.currentLine=104333489;
 //BA.debugLineNum = 104333489;BA.debugLine="Dim base_shipping_incl_tax As Int = total.Get";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_total.Get((Object)("base_shipping_incl_tax"))));
RDebugUtils.currentLine=104333490;
 //BA.debugLineNum = 104333490;BA.debugLine="Dim shipping_invoiced As Int = total.Get(\"shi";
_shipping_invoiced = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_invoiced"))));
RDebugUtils.currentLine=104333491;
 //BA.debugLineNum = 104333491;BA.debugLine="Dim shipping_incl_tax As Int = total.Get(\"shi";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_incl_tax"))));
RDebugUtils.currentLine=104333492;
 //BA.debugLineNum = 104333492;BA.debugLine="Dim base_shipping_invoiced As Int = total.Get";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_total.Get((Object)("base_shipping_invoiced"))));
RDebugUtils.currentLine=104333493;
 //BA.debugLineNum = 104333493;BA.debugLine="Dim base_shipping_tax_amount As Int = total.G";
_base_shipping_tax_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("base_shipping_tax_amount"))));
RDebugUtils.currentLine=104333494;
 //BA.debugLineNum = 104333494;BA.debugLine="Dim shipping_tax_amount As Int = total.Get(\"s";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_total.Get((Object)("shipping_tax_amount"))));
RDebugUtils.currentLine=104333495;
 //BA.debugLineNum = 104333495;BA.debugLine="Dim address As Map = shipping.Get(\"address\")";
_address = new anywheresoftware.b4a.objects.collections.Map();
_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_shipping.Get((Object)("address"))));
RDebugUtils.currentLine=104333496;
 //BA.debugLineNum = 104333496;BA.debugLine="Dim firstname As String = address.Get(\"firstn";
_firstname = BA.ObjectToString(_address.Get((Object)("firstname")));
RDebugUtils.currentLine=104333497;
 //BA.debugLineNum = 104333497;BA.debugLine="Dim address_type As String = address.Get(\"add";
_address_type = BA.ObjectToString(_address.Get((Object)("address_type")));
RDebugUtils.currentLine=104333498;
 //BA.debugLineNum = 104333498;BA.debugLine="Dim customer_address_id As Int = address.Get(";
_customer_address_id = (int)(BA.ObjectToNumber(_address.Get((Object)("customer_address_id"))));
RDebugUtils.currentLine=104333499;
 //BA.debugLineNum = 104333499;BA.debugLine="Dim city As String = address.Get(\"city\")";
_city = BA.ObjectToString(_address.Get((Object)("city")));
RDebugUtils.currentLine=104333500;
 //BA.debugLineNum = 104333500;BA.debugLine="Dim postcode As String = address.Get(\"postcod";
_postcode = BA.ObjectToString(_address.Get((Object)("postcode")));
RDebugUtils.currentLine=104333501;
 //BA.debugLineNum = 104333501;BA.debugLine="Dim region_id As Int = address.Get(\"region_id";
_region_id = (int)(BA.ObjectToNumber(_address.Get((Object)("region_id"))));
RDebugUtils.currentLine=104333502;
 //BA.debugLineNum = 104333502;BA.debugLine="Dim telephone As String = address.Get(\"teleph";
_telephone = BA.ObjectToString(_address.Get((Object)("telephone")));
RDebugUtils.currentLine=104333503;
 //BA.debugLineNum = 104333503;BA.debugLine="Dim entity_id As Int = address.Get(\"entity_id";
_entity_id = (int)(BA.ObjectToNumber(_address.Get((Object)("entity_id"))));
RDebugUtils.currentLine=104333504;
 //BA.debugLineNum = 104333504;BA.debugLine="Dim lastname As String = address.Get(\"lastnam";
_lastname = BA.ObjectToString(_address.Get((Object)("lastname")));
RDebugUtils.currentLine=104333505;
 //BA.debugLineNum = 104333505;BA.debugLine="Dim parent_id As Int = address.Get(\"parent_id";
_parent_id = (int)(BA.ObjectToNumber(_address.Get((Object)("parent_id"))));
RDebugUtils.currentLine=104333506;
 //BA.debugLineNum = 104333506;BA.debugLine="Dim street As List = address.Get(\"street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_address.Get((Object)("street"))));
RDebugUtils.currentLine=104333507;
 //BA.debugLineNum = 104333507;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 39:
//for
this.state = 42;
group184 = _street;
index184 = 0;
groupLen184 = group184.getSize();
this.state = 84;
if (true) break;

case 84:
//C
this.state = 42;
if (index184 < groupLen184) {
this.state = 41;
_colstreet = BA.ObjectToString(group184.Get(index184));}
if (true) break;

case 85:
//C
this.state = 84;
index184++;
if (true) break;

case 41:
//C
this.state = 85;
 if (true) break;
if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=104333509;
 //BA.debugLineNum = 104333509;BA.debugLine="Dim region As String = address.Get(\"region\")";
_region = BA.ObjectToString(_address.Get((Object)("region")));
RDebugUtils.currentLine=104333510;
 //BA.debugLineNum = 104333510;BA.debugLine="Dim country_id As String = address.Get(\"count";
_country_id = BA.ObjectToString(_address.Get((Object)("country_id")));
RDebugUtils.currentLine=104333511;
 //BA.debugLineNum = 104333511;BA.debugLine="Dim email As String = address.Get(\"email\")";
_email = BA.ObjectToString(_address.Get((Object)("email")));
RDebugUtils.currentLine=104333512;
 //BA.debugLineNum = 104333512;BA.debugLine="Dim region_code As String = address.Get(\"regi";
_region_code = BA.ObjectToString(_address.Get((Object)("region_code")));
RDebugUtils.currentLine=104333513;
 //BA.debugLineNum = 104333513;BA.debugLine="Dim method As String = shipping.Get(\"method\")";
_method = BA.ObjectToString(_shipping.Get((Object)("method")));
RDebugUtils.currentLine=104333514;
 //BA.debugLineNum = 104333514;BA.debugLine="Dim items As List = colshipping_assignments.G";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colshipping_assignments.Get((Object)("items"))));
RDebugUtils.currentLine=104333515;
 //BA.debugLineNum = 104333515;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 43:
//for
this.state = 50;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group192 = _items;
index192 = 0;
groupLen192 = group192.getSize();
this.state = 86;
if (true) break;

case 86:
//C
this.state = 50;
if (index192 < groupLen192) {
this.state = 45;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group192.Get(index192)));}
if (true) break;

case 87:
//C
this.state = 86;
index192++;
if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=104333516;
 //BA.debugLineNum = 104333516;BA.debugLine="Dim tax_amount As Double = colitems.Get(\"tax";
_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("tax_amount"))));
RDebugUtils.currentLine=104333517;
 //BA.debugLineNum = 104333517;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"t";
_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("tax_invoiced"))));
RDebugUtils.currentLine=104333518;
 //BA.debugLineNum = 104333518;BA.debugLine="Dim original_price As Int = colitems.Get(\"or";
_original_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("original_price"))));
RDebugUtils.currentLine=104333519;
 //BA.debugLineNum = 104333519;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"fre";
_free_shipping = (int)(BA.ObjectToNumber(_colitems.Get((Object)("free_shipping"))));
RDebugUtils.currentLine=104333520;
 //BA.debugLineNum = 104333520;BA.debugLine="Dim base_discount_tax_compensation_invoiced";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_tax_compensation_invoiced"))));
RDebugUtils.currentLine=104333521;
 //BA.debugLineNum = 104333521;BA.debugLine="Dim discount_amount As Int = colitems.Get(\"d";
_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_amount"))));
RDebugUtils.currentLine=104333522;
 //BA.debugLineNum = 104333522;BA.debugLine="Dim tax_percent As Double = colitems.Get(\"ta";
_tax_percent = (double)(BA.ObjectToNumber(_colitems.Get((Object)("tax_percent"))));
RDebugUtils.currentLine=104333523;
 //BA.debugLineNum = 104333523;BA.debugLine="Dim price_incl_tax As Double = Utilidades.Fi";
_price_incl_tax = parent._utilidades._fixnulldouble /*double*/ (_colitems.GetDefault((Object)("price_incl_tax"),(Object)(0)));
RDebugUtils.currentLine=104333524;
 //BA.debugLineNum = 104333524;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("price"))));
RDebugUtils.currentLine=104333525;
 //BA.debugLineNum = 104333525;BA.debugLine="Dim product_id As Int = colitems.Get(\"produc";
_product_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("product_id"))));
RDebugUtils.currentLine=104333526;
 //BA.debugLineNum = 104333526;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"ba";
_base_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total"))));
RDebugUtils.currentLine=104333527;
 //BA.debugLineNum = 104333527;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=104333528;
 //BA.debugLineNum = 104333528;BA.debugLine="Dim discount_tax_compensation_amount As Int";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_tax_compensation_amount"))));
RDebugUtils.currentLine=104333529;
 //BA.debugLineNum = 104333529;BA.debugLine="Dim weight As Int = colitems.Get(\"weight\")";
_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("weight"))));
RDebugUtils.currentLine=104333530;
 //BA.debugLineNum = 104333530;BA.debugLine="Dim base_original_price As Int = colitems.Ge";
_base_original_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_original_price"))));
RDebugUtils.currentLine=104333531;
 //BA.debugLineNum = 104333531;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_we";
_row_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_weight"))));
RDebugUtils.currentLine=104333532;
 //BA.debugLineNum = 104333532;BA.debugLine="Dim applied_rule_ids As String = colitems.Ge";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=104333533;
 //BA.debugLineNum = 104333533;BA.debugLine="Dim base_amount_refunded As Int = colitems.G";
_base_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_amount_refunded"))));
RDebugUtils.currentLine=104333534;
 //BA.debugLineNum = 104333534;BA.debugLine="Dim base_price_incl_tax As Double = colitems";
_base_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_price_incl_tax"))));
RDebugUtils.currentLine=104333535;
 //BA.debugLineNum = 104333535;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_di";
_no_discount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("no_discount"))));
RDebugUtils.currentLine=104333536;
 //BA.debugLineNum = 104333536;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=104333537;
 //BA.debugLineNum = 104333537;BA.debugLine="Dim base_discount_invoiced As Int = colitems";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_invoiced"))));
RDebugUtils.currentLine=104333538;
 //BA.debugLineNum = 104333538;BA.debugLine="Dim discount_percent As Int = colitems.Get(\"";
_discount_percent = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_percent"))));
RDebugUtils.currentLine=104333539;
 //BA.debugLineNum = 104333539;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id";
_order_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("order_id"))));
RDebugUtils.currentLine=104333540;
 //BA.debugLineNum = 104333540;BA.debugLine="Dim discount_tax_compensation_invoiced As In";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_tax_compensation_invoiced"))));
RDebugUtils.currentLine=104333541;
 //BA.debugLineNum = 104333541;BA.debugLine="Dim created_at As String = colitems.Get(\"cre";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=104333542;
 //BA.debugLineNum = 104333542;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_s";
_qty_shipped = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_shipped"))));
RDebugUtils.currentLine=104333543;
 //BA.debugLineNum = 104333543;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_o";
_qty_ordered = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_ordered"))));
RDebugUtils.currentLine=104333544;
 //BA.debugLineNum = 104333544;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_tot";
_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_total"))));
RDebugUtils.currentLine=104333545;
 //BA.debugLineNum = 104333545;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_";
_qty_canceled = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_canceled"))));
RDebugUtils.currentLine=104333546;
 //BA.debugLineNum = 104333546;BA.debugLine="Dim product_option As Map = colitems.Get(\"pr";
_product_option = new anywheresoftware.b4a.objects.collections.Map();
_product_option = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("product_option"))));
RDebugUtils.currentLine=104333547;
 //BA.debugLineNum = 104333547;BA.debugLine="Dim extension_attributes As Map = product_op";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_product_option.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=104333548;
 //BA.debugLineNum = 104333548;BA.debugLine="Dim configurable_item_options As List = exte";
_configurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_configurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=104333549;
 //BA.debugLineNum = 104333549;BA.debugLine="For Each colconfigurable_item_options As Map";
if (true) break;

case 46:
//for
this.state = 49;
_colconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group226 = _configurable_item_options;
index226 = 0;
groupLen226 = group226.getSize();
this.state = 88;
if (true) break;

case 88:
//C
this.state = 49;
if (index226 < groupLen226) {
this.state = 48;
_colconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group226.Get(index226)));}
if (true) break;

case 89:
//C
this.state = 88;
index226++;
if (true) break;

case 48:
//C
this.state = 89;
RDebugUtils.currentLine=104333550;
 //BA.debugLineNum = 104333550;BA.debugLine="Dim option_value As Int = colconfigurable_i";
_option_value = (int)(BA.ObjectToNumber(_colconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=104333551;
 //BA.debugLineNum = 104333551;BA.debugLine="Dim option_id As String = colconfigurable_i";
_option_id = BA.ObjectToString(_colconfigurable_item_options.Get((Object)("option_id")));
 if (true) break;
if (true) break;

case 49:
//C
this.state = 87;
;
RDebugUtils.currentLine=104333553;
 //BA.debugLineNum = 104333553;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"a";
_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("amount_refunded"))));
RDebugUtils.currentLine=104333554;
 //BA.debugLineNum = 104333554;BA.debugLine="Dim updated_at As String = colitems.Get(\"upd";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=104333555;
 //BA.debugLineNum = 104333555;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_p";
_base_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_price"))));
RDebugUtils.currentLine=104333556;
 //BA.debugLineNum = 104333556;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_";
_qty_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_invoiced"))));
RDebugUtils.currentLine=104333557;
 //BA.debugLineNum = 104333557;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_";
_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_invoiced"))));
RDebugUtils.currentLine=104333558;
 //BA.debugLineNum = 104333558;BA.debugLine="Dim row_total_incl_tax As Double = colitems.";
_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("row_total_incl_tax"))));
RDebugUtils.currentLine=104333559;
 //BA.debugLineNum = 104333559;BA.debugLine="Dim base_tax_amount As Double = colitems.Get";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=104333560;
 //BA.debugLineNum = 104333560;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id";
_store_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("store_id"))));
RDebugUtils.currentLine=104333561;
 //BA.debugLineNum = 104333561;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
_item_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("item_id"))));
RDebugUtils.currentLine=104333562;
 //BA.debugLineNum = 104333562;BA.debugLine="Dim base_discount_amount As Int = colitems.G";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=104333563;
 //BA.debugLineNum = 104333563;BA.debugLine="Dim base_row_total_incl_tax As Double = coli";
_base_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total_incl_tax"))));
RDebugUtils.currentLine=104333564;
 //BA.debugLineNum = 104333564;BA.debugLine="Dim base_discount_tax_compensation_amount As";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_tax_compensation_amount"))));
RDebugUtils.currentLine=104333565;
 //BA.debugLineNum = 104333565;BA.debugLine="Dim product_type As String = colitems.Get(\"p";
_product_type = BA.ObjectToString(_colitems.Get((Object)("product_type")));
RDebugUtils.currentLine=104333566;
 //BA.debugLineNum = 104333566;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_";
_qty_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_refunded"))));
RDebugUtils.currentLine=104333567;
 //BA.debugLineNum = 104333567;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(";
_base_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_invoiced"))));
RDebugUtils.currentLine=104333568;
 //BA.debugLineNum = 104333568;BA.debugLine="Dim is_qty_decimal As Int = colitems.Get(\"is";
_is_qty_decimal = (int)(BA.ObjectToNumber(_colitems.Get((Object)("is_qty_decimal"))));
RDebugUtils.currentLine=104333569;
 //BA.debugLineNum = 104333569;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_invoiced"))));
RDebugUtils.currentLine=104333570;
 //BA.debugLineNum = 104333570;BA.debugLine="Dim base_tax_invoiced As Double = colitems.G";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_invoiced"))));
 if (true) break;
if (true) break;

case 50:
//C
this.state = 83;
;
 if (true) break;
if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=104333576;
 //BA.debugLineNum = 104333576;BA.debugLine="Dim payment_additional_info As List = extension";
_payment_additional_info = new anywheresoftware.b4a.objects.collections.List();
_payment_additional_info = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("payment_additional_info"))));
RDebugUtils.currentLine=104333577;
 //BA.debugLineNum = 104333577;BA.debugLine="For Each colpayment_additional_info As Map In p";
if (true) break;

case 53:
//for
this.state = 56;
_colpayment_additional_info = new anywheresoftware.b4a.objects.collections.Map();
group252 = _payment_additional_info;
index252 = 0;
groupLen252 = group252.getSize();
this.state = 90;
if (true) break;

case 90:
//C
this.state = 56;
if (index252 < groupLen252) {
this.state = 55;
_colpayment_additional_info = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group252.Get(index252)));}
if (true) break;

case 91:
//C
this.state = 90;
index252++;
if (true) break;

case 55:
//C
this.state = 91;
RDebugUtils.currentLine=104333578;
 //BA.debugLineNum = 104333578;BA.debugLine="Dim value As String = colpayment_additional_in";
_value = BA.ObjectToString(_colpayment_additional_info.Get((Object)("value")));
RDebugUtils.currentLine=104333579;
 //BA.debugLineNum = 104333579;BA.debugLine="Dim key As String = colpayment_additional_info";
_key = BA.ObjectToString(_colpayment_additional_info.Get((Object)("key")));
 if (true) break;
if (true) break;

case 56:
//C
this.state = 57;
;
RDebugUtils.currentLine=104333581;
 //BA.debugLineNum = 104333581;BA.debugLine="Dim applied_taxes As List = extension_attribute";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=104333582;
 //BA.debugLineNum = 104333582;BA.debugLine="For Each colapplied_taxes As Map In applied_tax";
if (true) break;

case 57:
//for
this.state = 60;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group257 = _applied_taxes;
index257 = 0;
groupLen257 = group257.getSize();
this.state = 92;
if (true) break;

case 92:
//C
this.state = 60;
if (index257 < groupLen257) {
this.state = 59;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group257.Get(index257)));}
if (true) break;

case 93:
//C
this.state = 92;
index257++;
if (true) break;

case 59:
//C
this.state = 93;
RDebugUtils.currentLine=104333583;
 //BA.debugLineNum = 104333583;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"a";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=104333584;
 //BA.debugLineNum = 104333584;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"cod";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=104333585;
 //BA.debugLineNum = 104333585;BA.debugLine="Dim base_amount As Double = colapplied_taxes.G";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=104333586;
 //BA.debugLineNum = 104333586;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"ti";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=104333587;
 //BA.debugLineNum = 104333587;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(\"";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=104333589;
 //BA.debugLineNum = 104333589;BA.debugLine="Dim item_applied_taxes As List = extension_attr";
_item_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_item_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("item_applied_taxes"))));
RDebugUtils.currentLine=104333590;
 //BA.debugLineNum = 104333590;BA.debugLine="For Each colitem_applied_taxes As Map In item_a";
if (true) break;

case 61:
//for
this.state = 68;
_colitem_applied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group265 = _item_applied_taxes;
index265 = 0;
groupLen265 = group265.getSize();
this.state = 94;
if (true) break;

case 94:
//C
this.state = 68;
if (index265 < groupLen265) {
this.state = 63;
_colitem_applied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group265.Get(index265)));}
if (true) break;

case 95:
//C
this.state = 94;
index265++;
if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=104333591;
 //BA.debugLineNum = 104333591;BA.debugLine="Dim applied_taxes As List = colitem_applied_ta";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitem_applied_taxes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=104333592;
 //BA.debugLineNum = 104333592;BA.debugLine="For Each colapplied_taxes As Map In applied_ta";
if (true) break;

case 64:
//for
this.state = 67;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group267 = _applied_taxes;
index267 = 0;
groupLen267 = group267.getSize();
this.state = 96;
if (true) break;

case 96:
//C
this.state = 67;
if (index267 < groupLen267) {
this.state = 66;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group267.Get(index267)));}
if (true) break;

case 97:
//C
this.state = 96;
index267++;
if (true) break;

case 66:
//C
this.state = 97;
RDebugUtils.currentLine=104333593;
 //BA.debugLineNum = 104333593;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=104333594;
 //BA.debugLineNum = 104333594;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"co";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=104333595;
 //BA.debugLineNum = 104333595;BA.debugLine="Dim base_amount As Double = colapplied_taxes.";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=104333596;
 //BA.debugLineNum = 104333596;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"t";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=104333597;
 //BA.debugLineNum = 104333597;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 67:
//C
this.state = 95;
;
RDebugUtils.currentLine=104333599;
 //BA.debugLineNum = 104333599;BA.debugLine="Dim Type As String = colitem_applied_taxes.Get";
_type = BA.ObjectToString(_colitem_applied_taxes.Get((Object)("type")));
 if (true) break;
if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=104333601;
 //BA.debugLineNum = 104333601;BA.debugLine="Dim converting_from_quote As String = extension";
_converting_from_quote = BA.ObjectToString(_extension_attributes.Get((Object)("converting_from_quote")));
 if (true) break;

case 69:
//C
this.state = 73;
;
RDebugUtils.currentLine=104333604;
 //BA.debugLineNum = 104333604;BA.debugLine="Dim shipping_description As String = colitems.Ge";
_shipping_description = BA.ObjectToString(_colitems.Get((Object)("shipping_description")));
RDebugUtils.currentLine=104333605;
 //BA.debugLineNum = 104333605;BA.debugLine="Dim store_to_order_rate As Int = colitems.Getdef";
_store_to_order_rate = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_to_order_rate"),(Object)(-1))));
RDebugUtils.currentLine=104333606;
 //BA.debugLineNum = 104333606;BA.debugLine="Dim shipping_amount As Int = colitems.Getdefault";
_shipping_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_amount"),(Object)(-1))));
RDebugUtils.currentLine=104333607;
 //BA.debugLineNum = 104333607;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=104333608;
 //BA.debugLineNum = 104333608;BA.debugLine="Dim subtotal_invoiced As Int = colitems.Getdefau";
_subtotal_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("subtotal_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=104333609;
 //BA.debugLineNum = 104333609;BA.debugLine="Dim base_to_order_rate As Int = colitems.Getdefa";
_base_to_order_rate = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_to_order_rate"),(Object)(-1))));
RDebugUtils.currentLine=104333610;
 //BA.debugLineNum = 104333610;BA.debugLine="Dim base_subtotal As Int = colitems.Getdefault(\"";
_base_subtotal = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_subtotal"),(Object)(-1))));
RDebugUtils.currentLine=104333611;
 //BA.debugLineNum = 104333611;BA.debugLine="Dim protect_code As String = colitems.Get(\"prote";
_protect_code = BA.ObjectToString(_colitems.Get((Object)("protect_code")));
RDebugUtils.currentLine=104333612;
 //BA.debugLineNum = 104333612;BA.debugLine="Dim customer_dob As String = colitems.Get(\"custo";
_customer_dob = BA.ObjectToString(_colitems.Get((Object)("customer_dob")));
RDebugUtils.currentLine=104333613;
 //BA.debugLineNum = 104333613;BA.debugLine="Dim base_total_due As Int = colitems.Getdefault(";
_base_total_due = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_due"),(Object)(-1))));
RDebugUtils.currentLine=104333614;
 //BA.debugLineNum = 104333614;BA.debugLine="Dim base_subtotal_incl_tax As Double = colitems.";
_base_subtotal_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_subtotal_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=104333615;
 //BA.debugLineNum = 104333615;BA.debugLine="Dim customer_id As Int = colitems.Getdefault(\"cu";
_customer_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("customer_id"),(Object)(-1))));
RDebugUtils.currentLine=104333616;
 //BA.debugLineNum = 104333616;BA.debugLine="Dim customer_group_id As Int = colitems.Getdefau";
_customer_group_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("customer_group_id"),(Object)(-1))));
RDebugUtils.currentLine=104333617;
 //BA.debugLineNum = 104333617;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=104333618;
 //BA.debugLineNum = 104333618;BA.debugLine="Dim order_currency_code As String = colitems.Get";
_order_currency_code = BA.ObjectToString(_colitems.Get((Object)("order_currency_code")));
RDebugUtils.currentLine=104333619;
 //BA.debugLineNum = 104333619;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(\"";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_invoiced"))));
RDebugUtils.currentLine=104333620;
 //BA.debugLineNum = 104333620;BA.debugLine="Dim customer_gender As Int = colitems.Getdefault";
_customer_gender = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("customer_gender"),(Object)(-1))));
RDebugUtils.currentLine=104333621;
 //BA.debugLineNum = 104333621;BA.debugLine="Dim shipping_incl_tax As Int = colitems.Getdefau";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=104333622;
 //BA.debugLineNum = 104333622;BA.debugLine="Dim base_shipping_invoiced As Int = colitems.Get";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_shipping_invoiced"),(Object)(-1))));
 if (true) break;
if (true) break;

case 70:
//C
this.state = -1;
;
RDebugUtils.currentLine=104333624;
 //BA.debugLineNum = 104333624;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
_search_criteria = new anywheresoftware.b4a.objects.collections.Map();
_search_criteria = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("search_criteria"))));
RDebugUtils.currentLine=104333625;
 //BA.debugLineNum = 104333625;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
_filter_groups = new anywheresoftware.b4a.objects.collections.List();
_filter_groups = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_criteria.Get((Object)("filter_groups"))));
RDebugUtils.currentLine=104333626;
 //BA.debugLineNum = 104333626;BA.debugLine="Dim page_size As Int = search_criteria.Get(\"page_";
_page_size = (int)(BA.ObjectToNumber(_search_criteria.Get((Object)("page_size"))));
RDebugUtils.currentLine=104333629;
 //BA.debugLineNum = 104333629;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacionpedidos(b4j.docU.ctestsinfomagento __ref,String _token) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacionpedidos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacionpedidos", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoInformacionPedidos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionPedidos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionPedidos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104398850;
 //BA.debugLineNum = 104398850;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=104398851;
 //BA.debugLineNum = 104398851;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=104398855;
 //BA.debugLineNum = 104398855;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/orders/?searchCriteria[pageSize] = 0\n"+"	&searchCriteria[filterGroups][0][filters][0][field]=store_id&\n"+"	searchCriteria[filterGroups][0][filters][0][value]=32,35,37,38&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=in");
RDebugUtils.currentLine=104398860;
 //BA.debugLineNum = 104398860;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=104398862;
 //BA.debugLineNum = 104398862;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=104398863;
 //BA.debugLineNum = 104398863;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=104398865;
 //BA.debugLineNum = 104398865;BA.debugLine="job.GetRequest.Timeout=30000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (30000));
RDebugUtils.currentLine=104398867;
 //BA.debugLineNum = 104398867;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacionpedidos"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=104398869;
 //BA.debugLineNum = 104398869;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=104398870;
 //BA.debugLineNum = 104398870;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8104398870","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=104398871;
 //BA.debugLineNum = 104398871;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8104398871",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=104398872;
 //BA.debugLineNum = 104398872;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=104398873;
 //BA.debugLineNum = 104398873;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104398874;
 //BA.debugLineNum = 104398874;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=104398877;
 //BA.debugLineNum = 104398877;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=104398878;
 //BA.debugLineNum = 104398878;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104398879;
 //BA.debugLineNum = 104398879;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=104398881;
 //BA.debugLineNum = 104398881;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnsalir_click(b4j.docU.ctestsinfomagento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=102629376;
 //BA.debugLineNum = 102629376;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=102629377;
 //BA.debugLineNum = 102629377;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=102629378;
 //BA.debugLineNum = 102629378;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.ctestsinfomagento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=102694912;
 //BA.debugLineNum = 102694912;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=102694913;
 //BA.debugLineNum = 102694913;BA.debugLine="If jamTableView1.IsInitialized Then";
if (__ref._jamtableview1 /*b4j.docU.jamtableview*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=102694914;
 //BA.debugLineNum = 102694914;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuari";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
 };
RDebugUtils.currentLine=102694916;
 //BA.debugLineNum = 102694916;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=102694917;
 //BA.debugLineNum = 102694917;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=102694918;
 //BA.debugLineNum = 102694918;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatoscredenciales(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargadatoscredenciales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatoscredenciales", null));}
ResumableSub_CargaDatosCredenciales rsub = new ResumableSub_CargaDatosCredenciales(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosCredenciales extends BA.ResumableSub {
public ResumableSub_CargaDatosCredenciales(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103284738;
 //BA.debugLineNum = 103284738;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=103284739;
 //BA.debugLineNum = 103284739;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=103284740;
 //BA.debugLineNum = 103284740;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=103284741;
 //BA.debugLineNum = 103284741;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=103284742;
 //BA.debugLineNum = 103284742;BA.debugLine="ComandoJRDC=\"TokenB2BPruebas\"";
_comandojrdc = "TokenB2BPruebas";
RDebugUtils.currentLine=103284743;
 //BA.debugLineNum = 103284743;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comandojrdc,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=103284744;
 //BA.debugLineNum = 103284744;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargadatoscredenciales"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=103284745;
 //BA.debugLineNum = 103284745;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=103284746;
 //BA.debugLineNum = 103284746;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=103284748;
 //BA.debugLineNum = 103284748;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=103284749;
 //BA.debugLineNum = 103284749;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=103284751;
 //BA.debugLineNum = 103284751;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=103284752;
 //BA.debugLineNum = 103284752;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=103284753;
 //BA.debugLineNum = 103284753;BA.debugLine="mRes.Put(\"lstReg\",lstReg)";
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
RDebugUtils.currentLine=103284756;
 //BA.debugLineNum = 103284756;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=103284757;
 //BA.debugLineNum = 103284757;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=103284758;
 //BA.debugLineNum = 103284758;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadirecciondefectoenviocliente(b4j.docU.ctestsinfomagento __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargadirecciondefectoenviocliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadirecciondefectoenviocliente", new Object[] {_idclientesel}));}
ResumableSub_CargaDireccionDefectoEnvioCliente rsub = new ResumableSub_CargaDireccionDefectoEnvioCliente(this,__ref,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDireccionDefectoEnvioCliente extends BA.ResumableSub {
public ResumableSub_CargaDireccionDefectoEnvioCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel;
String _sresp = "";
Object _robj = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _firstname = "";
String _city = "";
int _region_id = 0;
String _postcode = "";
String _telephone = "";
String _default_shipping = "";
String _lastname = "";
String _code = "";
String _customer_code = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
anywheresoftware.b4a.objects.collections.Map _colcustom_attributes = null;
String _value = "";
String _attribute_code = "";
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
String _street1 = "";
String _street2 = "";
String _street3 = "";
String _company = "";
int _id = 0;
int _customer_id = 0;
anywheresoftware.b4a.objects.collections.Map _mregion = null;
String _region = "";
String _region_code = "";
String _country_id = "";
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group28;
int index28;
int groupLen28;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104857601;
 //BA.debugLineNum = 104857601;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BDireccionesCliente");
RDebugUtils.currentLine=104857602;
 //BA.debugLineNum = 104857602;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaDireccionDef";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargadirecciondefectoenviocliente"), __ref._enviodatosapimagentobusquedadirecciondefectoenviocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ,_idclientesel));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=104857603;
 //BA.debugLineNum = 104857603;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=104857604;
 //BA.debugLineNum = 104857604;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104857605;
 //BA.debugLineNum = 104857605;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargadirecciondefectoenviocliente"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Direccion Defecto Envio Cliente B2B"));
this.state = 38;
return;
case 38:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=104857606;
 //BA.debugLineNum = 104857606;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=104857609;
 //BA.debugLineNum = 104857609;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=104857610;
 //BA.debugLineNum = 104857610;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=104857611;
 //BA.debugLineNum = 104857611;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=104857612;
 //BA.debugLineNum = 104857612;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
_firstname = BA.ObjectToString(_root.Get((Object)("firstname")));
RDebugUtils.currentLine=104857613;
 //BA.debugLineNum = 104857613;BA.debugLine="Dim city As String = root.Get(\"city\")";
_city = BA.ObjectToString(_root.Get((Object)("city")));
RDebugUtils.currentLine=104857614;
 //BA.debugLineNum = 104857614;BA.debugLine="Dim region_id As Int = root.Get(\"region_id\")";
_region_id = (int)(BA.ObjectToNumber(_root.Get((Object)("region_id"))));
RDebugUtils.currentLine=104857615;
 //BA.debugLineNum = 104857615;BA.debugLine="Dim postcode As String = root.Get(\"postcode\")";
_postcode = BA.ObjectToString(_root.Get((Object)("postcode")));
RDebugUtils.currentLine=104857616;
 //BA.debugLineNum = 104857616;BA.debugLine="Dim telephone As String = root.Get(\"telephone\")";
_telephone = BA.ObjectToString(_root.Get((Object)("telephone")));
RDebugUtils.currentLine=104857617;
 //BA.debugLineNum = 104857617;BA.debugLine="Dim default_shipping As String = root.Get(\"defaul";
_default_shipping = BA.ObjectToString(_root.Get((Object)("default_shipping")));
RDebugUtils.currentLine=104857618;
 //BA.debugLineNum = 104857618;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
_lastname = BA.ObjectToString(_root.Get((Object)("lastname")));
RDebugUtils.currentLine=104857619;
 //BA.debugLineNum = 104857619;BA.debugLine="Dim code As String";
_code = "";
RDebugUtils.currentLine=104857620;
 //BA.debugLineNum = 104857620;BA.debugLine="Dim customer_code As String";
_customer_code = "";
RDebugUtils.currentLine=104857621;
 //BA.debugLineNum = 104857621;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=104857622;
 //BA.debugLineNum = 104857622;BA.debugLine="For Each colcustom_attributes As Map In custom_at";
if (true) break;

case 5:
//for
this.state = 20;
_colcustom_attributes = new anywheresoftware.b4a.objects.collections.Map();
group21 = _custom_attributes;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 20;
if (index21 < groupLen21) {
this.state = 7;
_colcustom_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 40:
//C
this.state = 39;
index21++;
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=104857623;
 //BA.debugLineNum = 104857623;BA.debugLine="Dim value As String = colcustom_attributes.Get(\"";
_value = BA.ObjectToString(_colcustom_attributes.Get((Object)("value")));
RDebugUtils.currentLine=104857624;
 //BA.debugLineNum = 104857624;BA.debugLine="Dim attribute_code As String = colcustom_attribu";
_attribute_code = BA.ObjectToString(_colcustom_attributes.Get((Object)("attribute_code")));
RDebugUtils.currentLine=104857625;
 //BA.debugLineNum = 104857625;BA.debugLine="If attribute_code=\"code\" Then code=value";
if (true) break;

case 8:
//if
this.state = 13;
if ((_attribute_code).equals("code")) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_code = _value;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=104857626;
 //BA.debugLineNum = 104857626;BA.debugLine="If attribute_code=\"customer_code\" Then customer_";
if (true) break;

case 14:
//if
this.state = 19;
if ((_attribute_code).equals("customer_code")) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_customer_code = _value;
if (true) break;

case 19:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=104857628;
 //BA.debugLineNum = 104857628;BA.debugLine="Dim street As List = root.Get(\"street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("street"))));
RDebugUtils.currentLine=104857629;
 //BA.debugLineNum = 104857629;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 21:
//for
this.state = 24;
group28 = _street;
index28 = 0;
groupLen28 = group28.getSize();
this.state = 41;
if (true) break;

case 41:
//C
this.state = 24;
if (index28 < groupLen28) {
this.state = 23;
_colstreet = BA.ObjectToString(group28.Get(index28));}
if (true) break;

case 42:
//C
this.state = 41;
index28++;
if (true) break;

case 23:
//C
this.state = 42;
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=104857632;
 //BA.debugLineNum = 104857632;BA.debugLine="Dim Street1 As String=street.Get(0)";
_street1 = BA.ObjectToString(_street.Get((int) (0)));
RDebugUtils.currentLine=104857633;
 //BA.debugLineNum = 104857633;BA.debugLine="Dim street2 As String";
_street2 = "";
RDebugUtils.currentLine=104857634;
 //BA.debugLineNum = 104857634;BA.debugLine="Dim street3 As String";
_street3 = "";
RDebugUtils.currentLine=104857635;
 //BA.debugLineNum = 104857635;BA.debugLine="If street.Size>1 Then street2=street.Get(1)";
if (true) break;

case 25:
//if
this.state = 30;
if (_street.getSize()>1) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_street2 = BA.ObjectToString(_street.Get((int) (1)));
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=104857636;
 //BA.debugLineNum = 104857636;BA.debugLine="If street.Size>2 Then street3=street.Get(2)";
if (true) break;

case 31:
//if
this.state = 36;
if (_street.getSize()>2) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_street3 = BA.ObjectToString(_street.Get((int) (2)));
if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=104857637;
 //BA.debugLineNum = 104857637;BA.debugLine="root.Put(\"Street1\",Street1)";
_root.Put((Object)("Street1"),(Object)(_street1));
RDebugUtils.currentLine=104857638;
 //BA.debugLineNum = 104857638;BA.debugLine="root.Put(\"Street2\",street2)";
_root.Put((Object)("Street2"),(Object)(_street2));
RDebugUtils.currentLine=104857639;
 //BA.debugLineNum = 104857639;BA.debugLine="root.Put(\"Street3\",street3)";
_root.Put((Object)("Street3"),(Object)(_street3));
RDebugUtils.currentLine=104857640;
 //BA.debugLineNum = 104857640;BA.debugLine="Dim company As String = root.Get(\"company\")";
_company = BA.ObjectToString(_root.Get((Object)("company")));
RDebugUtils.currentLine=104857641;
 //BA.debugLineNum = 104857641;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=104857642;
 //BA.debugLineNum = 104857642;BA.debugLine="Dim customer_id As Int = root.Get(\"customer_id\")";
_customer_id = (int)(BA.ObjectToNumber(_root.Get((Object)("customer_id"))));
RDebugUtils.currentLine=104857643;
 //BA.debugLineNum = 104857643;BA.debugLine="Dim mregion As Map = root.Get(\"region\")";
_mregion = new anywheresoftware.b4a.objects.collections.Map();
_mregion = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("region"))));
RDebugUtils.currentLine=104857644;
 //BA.debugLineNum = 104857644;BA.debugLine="Dim region_id As Int = mregion.Get(\"region_id\")";
_region_id = (int)(BA.ObjectToNumber(_mregion.Get((Object)("region_id"))));
RDebugUtils.currentLine=104857645;
 //BA.debugLineNum = 104857645;BA.debugLine="Dim region As String = mregion.Get(\"region\")";
_region = BA.ObjectToString(_mregion.Get((Object)("region")));
RDebugUtils.currentLine=104857646;
 //BA.debugLineNum = 104857646;BA.debugLine="root.Put(\"region\",region)";
_root.Put((Object)("region"),(Object)(_region));
RDebugUtils.currentLine=104857647;
 //BA.debugLineNum = 104857647;BA.debugLine="Dim region_code As String = mregion.Get(\"region_c";
_region_code = BA.ObjectToString(_mregion.Get((Object)("region_code")));
RDebugUtils.currentLine=104857648;
 //BA.debugLineNum = 104857648;BA.debugLine="Dim country_id As String = root.Get(\"country_id\")";
_country_id = BA.ObjectToString(_root.Get((Object)("country_id")));
RDebugUtils.currentLine=104857650;
 //BA.debugLineNum = 104857650;BA.debugLine="root.Put(\"default_billing\",\"\")";
_root.Put((Object)("default_billing"),(Object)(""));
RDebugUtils.currentLine=104857651;
 //BA.debugLineNum = 104857651;BA.debugLine="root.Put(\"code\",code)";
_root.Put((Object)("code"),(Object)(_code));
RDebugUtils.currentLine=104857652;
 //BA.debugLineNum = 104857652;BA.debugLine="root.Put(\"customer_code\",customer_code)";
_root.Put((Object)("customer_code"),(Object)(_customer_code));
RDebugUtils.currentLine=104857656;
 //BA.debugLineNum = 104857656;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BDireccionesCliente",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_root.getObject())}));
RDebugUtils.currentLine=104857657;
 //BA.debugLineNum = 104857657;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=104857658;
 //BA.debugLineNum = 104857658;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentobusquedadirecciondefectoenviocliente(b4j.docU.ctestsinfomagento __ref,String _token,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentobusquedadirecciondefectoenviocliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentobusquedadirecciondefectoenviocliente", new Object[] {_token,_idclientesel}));}
ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente(this,__ref,_token,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoEnvioCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
int _idclientesel;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104923138;
 //BA.debugLineNum = 104923138;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=104923139;
 //BA.debugLineNum = 104923139;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=104923141;
 //BA.debugLineNum = 104923141;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"+parent.__c.SmartStringFormatter("",(Object)(_idclientesel))+"/shippingAddress");
RDebugUtils.currentLine=104923143;
 //BA.debugLineNum = 104923143;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=104923145;
 //BA.debugLineNum = 104923145;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=104923146;
 //BA.debugLineNum = 104923146;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=104923148;
 //BA.debugLineNum = 104923148;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=104923150;
 //BA.debugLineNum = 104923150;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedadirecciondefectoenviocliente"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=104923152;
 //BA.debugLineNum = 104923152;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=104923153;
 //BA.debugLineNum = 104923153;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8104923153","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=104923154;
 //BA.debugLineNum = 104923154;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8104923154",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=104923155;
 //BA.debugLineNum = 104923155;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=104923156;
 //BA.debugLineNum = 104923156;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104923157;
 //BA.debugLineNum = 104923157;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=104923160;
 //BA.debugLineNum = 104923160;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=104923161;
 //BA.debugLineNum = 104923161;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104923162;
 //BA.debugLineNum = 104923162;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=104923164;
 //BA.debugLineNum = 104923164;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadirecciondefectofacturacioncliente(b4j.docU.ctestsinfomagento __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargadirecciondefectofacturacioncliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadirecciondefectofacturacioncliente", new Object[] {_idclientesel}));}
ResumableSub_CargaDireccionDefectoFacturacionCliente rsub = new ResumableSub_CargaDireccionDefectoFacturacionCliente(this,__ref,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDireccionDefectoFacturacionCliente extends BA.ResumableSub {
public ResumableSub_CargaDireccionDefectoFacturacionCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel;
String _sresp = "";
Object _robj = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _firstname = "";
String _city = "";
int _region_id = 0;
String _postcode = "";
String _telephone = "";
String _default_shipping = "";
String _lastname = "";
String _code = "";
String _customer_code = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
anywheresoftware.b4a.objects.collections.Map _colcustom_attributes = null;
String _value = "";
String _attribute_code = "";
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
String _street1 = "";
String _street2 = "";
String _street3 = "";
String _company = "";
int _id = 0;
int _customer_id = 0;
anywheresoftware.b4a.objects.collections.Map _mregion = null;
String _region = "";
String _region_code = "";
String _country_id = "";
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group28;
int index28;
int groupLen28;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105054209;
 //BA.debugLineNum = 105054209;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BDireccionesCliente");
RDebugUtils.currentLine=105054210;
 //BA.debugLineNum = 105054210;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaDireccionDef";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargadirecciondefectofacturacioncliente"), __ref._enviodatosapimagentobusquedadirecciondefectofacturacioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ,_idclientesel));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=105054211;
 //BA.debugLineNum = 105054211;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=105054212;
 //BA.debugLineNum = 105054212;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105054213;
 //BA.debugLineNum = 105054213;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargadirecciondefectofacturacioncliente"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Direccion Defecto Facturacion Cliente B2B"));
this.state = 38;
return;
case 38:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=105054214;
 //BA.debugLineNum = 105054214;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=105054217;
 //BA.debugLineNum = 105054217;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=105054218;
 //BA.debugLineNum = 105054218;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=105054219;
 //BA.debugLineNum = 105054219;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=105054220;
 //BA.debugLineNum = 105054220;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
_firstname = BA.ObjectToString(_root.Get((Object)("firstname")));
RDebugUtils.currentLine=105054221;
 //BA.debugLineNum = 105054221;BA.debugLine="Dim city As String = root.Get(\"city\")";
_city = BA.ObjectToString(_root.Get((Object)("city")));
RDebugUtils.currentLine=105054222;
 //BA.debugLineNum = 105054222;BA.debugLine="Dim region_id As Int = root.Get(\"region_id\")";
_region_id = (int)(BA.ObjectToNumber(_root.Get((Object)("region_id"))));
RDebugUtils.currentLine=105054223;
 //BA.debugLineNum = 105054223;BA.debugLine="Dim postcode As String = root.Get(\"postcode\")";
_postcode = BA.ObjectToString(_root.Get((Object)("postcode")));
RDebugUtils.currentLine=105054224;
 //BA.debugLineNum = 105054224;BA.debugLine="Dim telephone As String = root.Get(\"telephone\")";
_telephone = BA.ObjectToString(_root.Get((Object)("telephone")));
RDebugUtils.currentLine=105054225;
 //BA.debugLineNum = 105054225;BA.debugLine="Dim default_shipping As String = root.Get(\"defaul";
_default_shipping = BA.ObjectToString(_root.Get((Object)("default_shipping")));
RDebugUtils.currentLine=105054226;
 //BA.debugLineNum = 105054226;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
_lastname = BA.ObjectToString(_root.Get((Object)("lastname")));
RDebugUtils.currentLine=105054227;
 //BA.debugLineNum = 105054227;BA.debugLine="Dim code As String";
_code = "";
RDebugUtils.currentLine=105054228;
 //BA.debugLineNum = 105054228;BA.debugLine="Dim customer_code As String";
_customer_code = "";
RDebugUtils.currentLine=105054229;
 //BA.debugLineNum = 105054229;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=105054230;
 //BA.debugLineNum = 105054230;BA.debugLine="For Each colcustom_attributes As Map In custom_at";
if (true) break;

case 5:
//for
this.state = 20;
_colcustom_attributes = new anywheresoftware.b4a.objects.collections.Map();
group21 = _custom_attributes;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 20;
if (index21 < groupLen21) {
this.state = 7;
_colcustom_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 40:
//C
this.state = 39;
index21++;
if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=105054231;
 //BA.debugLineNum = 105054231;BA.debugLine="Dim value As String = colcustom_attributes.Get(\"";
_value = BA.ObjectToString(_colcustom_attributes.Get((Object)("value")));
RDebugUtils.currentLine=105054232;
 //BA.debugLineNum = 105054232;BA.debugLine="Dim attribute_code As String = colcustom_attribu";
_attribute_code = BA.ObjectToString(_colcustom_attributes.Get((Object)("attribute_code")));
RDebugUtils.currentLine=105054233;
 //BA.debugLineNum = 105054233;BA.debugLine="If attribute_code=\"code\" Then code=value";
if (true) break;

case 8:
//if
this.state = 13;
if ((_attribute_code).equals("code")) { 
this.state = 10;
;}if (true) break;

case 10:
//C
this.state = 13;
_code = _value;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=105054234;
 //BA.debugLineNum = 105054234;BA.debugLine="If attribute_code=\"customer_code\" Then customer_";
if (true) break;

case 14:
//if
this.state = 19;
if ((_attribute_code).equals("customer_code")) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
_customer_code = _value;
if (true) break;

case 19:
//C
this.state = 40;
;
 if (true) break;
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=105054236;
 //BA.debugLineNum = 105054236;BA.debugLine="Dim street As List = root.Get(\"street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("street"))));
RDebugUtils.currentLine=105054237;
 //BA.debugLineNum = 105054237;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 21:
//for
this.state = 24;
group28 = _street;
index28 = 0;
groupLen28 = group28.getSize();
this.state = 41;
if (true) break;

case 41:
//C
this.state = 24;
if (index28 < groupLen28) {
this.state = 23;
_colstreet = BA.ObjectToString(group28.Get(index28));}
if (true) break;

case 42:
//C
this.state = 41;
index28++;
if (true) break;

case 23:
//C
this.state = 42;
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=105054240;
 //BA.debugLineNum = 105054240;BA.debugLine="Dim Street1 As String=street.Get(0)";
_street1 = BA.ObjectToString(_street.Get((int) (0)));
RDebugUtils.currentLine=105054241;
 //BA.debugLineNum = 105054241;BA.debugLine="Dim street2 As String";
_street2 = "";
RDebugUtils.currentLine=105054242;
 //BA.debugLineNum = 105054242;BA.debugLine="Dim street3 As String";
_street3 = "";
RDebugUtils.currentLine=105054243;
 //BA.debugLineNum = 105054243;BA.debugLine="If street.Size>1 Then street2=street.Get(1)";
if (true) break;

case 25:
//if
this.state = 30;
if (_street.getSize()>1) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
_street2 = BA.ObjectToString(_street.Get((int) (1)));
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=105054244;
 //BA.debugLineNum = 105054244;BA.debugLine="If street.Size>2 Then street3=street.Get(2)";
if (true) break;

case 31:
//if
this.state = 36;
if (_street.getSize()>2) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_street3 = BA.ObjectToString(_street.Get((int) (2)));
if (true) break;

case 36:
//C
this.state = -1;
;
RDebugUtils.currentLine=105054245;
 //BA.debugLineNum = 105054245;BA.debugLine="root.Put(\"Street1\",Street1)";
_root.Put((Object)("Street1"),(Object)(_street1));
RDebugUtils.currentLine=105054246;
 //BA.debugLineNum = 105054246;BA.debugLine="root.Put(\"Street2\",street2)";
_root.Put((Object)("Street2"),(Object)(_street2));
RDebugUtils.currentLine=105054247;
 //BA.debugLineNum = 105054247;BA.debugLine="root.Put(\"Street3\",street3)";
_root.Put((Object)("Street3"),(Object)(_street3));
RDebugUtils.currentLine=105054248;
 //BA.debugLineNum = 105054248;BA.debugLine="Dim company As String = root.Get(\"company\")";
_company = BA.ObjectToString(_root.Get((Object)("company")));
RDebugUtils.currentLine=105054249;
 //BA.debugLineNum = 105054249;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=105054250;
 //BA.debugLineNum = 105054250;BA.debugLine="Dim customer_id As Int = root.Get(\"customer_id\")";
_customer_id = (int)(BA.ObjectToNumber(_root.Get((Object)("customer_id"))));
RDebugUtils.currentLine=105054251;
 //BA.debugLineNum = 105054251;BA.debugLine="Dim mregion As Map = root.Get(\"region\")";
_mregion = new anywheresoftware.b4a.objects.collections.Map();
_mregion = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("region"))));
RDebugUtils.currentLine=105054252;
 //BA.debugLineNum = 105054252;BA.debugLine="Dim region_id As Int = mregion.Get(\"region_id\")";
_region_id = (int)(BA.ObjectToNumber(_mregion.Get((Object)("region_id"))));
RDebugUtils.currentLine=105054253;
 //BA.debugLineNum = 105054253;BA.debugLine="Dim region As String = mregion.Get(\"region\")";
_region = BA.ObjectToString(_mregion.Get((Object)("region")));
RDebugUtils.currentLine=105054254;
 //BA.debugLineNum = 105054254;BA.debugLine="root.Put(\"region\",region)";
_root.Put((Object)("region"),(Object)(_region));
RDebugUtils.currentLine=105054255;
 //BA.debugLineNum = 105054255;BA.debugLine="Dim region_code As String = mregion.Get(\"region_c";
_region_code = BA.ObjectToString(_mregion.Get((Object)("region_code")));
RDebugUtils.currentLine=105054256;
 //BA.debugLineNum = 105054256;BA.debugLine="Dim country_id As String = root.Get(\"country_id\")";
_country_id = BA.ObjectToString(_root.Get((Object)("country_id")));
RDebugUtils.currentLine=105054258;
 //BA.debugLineNum = 105054258;BA.debugLine="root.Put(\"default_shipping\",\"\")";
_root.Put((Object)("default_shipping"),(Object)(""));
RDebugUtils.currentLine=105054259;
 //BA.debugLineNum = 105054259;BA.debugLine="root.Put(\"code\",code)";
_root.Put((Object)("code"),(Object)(_code));
RDebugUtils.currentLine=105054260;
 //BA.debugLineNum = 105054260;BA.debugLine="root.Put(\"customer_code\",customer_code)";
_root.Put((Object)("customer_code"),(Object)(_customer_code));
RDebugUtils.currentLine=105054263;
 //BA.debugLineNum = 105054263;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BDireccionesCliente",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_root.getObject())}));
RDebugUtils.currentLine=105054264;
 //BA.debugLineNum = 105054264;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=105054265;
 //BA.debugLineNum = 105054265;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentobusquedadirecciondefectofacturacioncliente(b4j.docU.ctestsinfomagento __ref,String _token,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentobusquedadirecciondefectofacturacioncliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentobusquedadirecciondefectofacturacioncliente", new Object[] {_token,_idclientesel}));}
ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente(this,__ref,_token,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionDefectoFacturacionCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
int _idclientesel;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105119746;
 //BA.debugLineNum = 105119746;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=105119747;
 //BA.debugLineNum = 105119747;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=105119749;
 //BA.debugLineNum = 105119749;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"+parent.__c.SmartStringFormatter("",(Object)(_idclientesel))+"/billingAddress");
RDebugUtils.currentLine=105119751;
 //BA.debugLineNum = 105119751;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=105119753;
 //BA.debugLineNum = 105119753;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=105119754;
 //BA.debugLineNum = 105119754;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=105119756;
 //BA.debugLineNum = 105119756;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=105119758;
 //BA.debugLineNum = 105119758;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedadirecciondefectofacturacioncliente"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=105119760;
 //BA.debugLineNum = 105119760;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=105119761;
 //BA.debugLineNum = 105119761;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8105119761","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=105119762;
 //BA.debugLineNum = 105119762;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8105119762",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=105119763;
 //BA.debugLineNum = 105119763;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=105119764;
 //BA.debugLineNum = 105119764;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=105119765;
 //BA.debugLineNum = 105119765;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=105119768;
 //BA.debugLineNum = 105119768;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=105119769;
 //BA.debugLineNum = 105119769;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=105119770;
 //BA.debugLineNum = 105119770;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=105119772;
 //BA.debugLineNum = 105119772;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargainfoclientemagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargainfoclientemagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargainfoclientemagento", null));}
ResumableSub_CargaInfoClienteMagento rsub = new ResumableSub_CargaInfoClienteMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaInfoClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaInfoClienteMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel = 0;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
String _sk = "";
int _store_id = 0;
String _firstname = "";
anywheresoftware.b4a.objects.collections.List _addresses = null;
String _created_at = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
String _is_subscribed = "";
String _lastname = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
anywheresoftware.b4a.objects.collections.Map _colcustom_attributes = null;
String _value = "";
String _attribute_code = "";
String _updated_at = "";
int _disable_auto_group_change = 0;
int _group_id = 0;
int _id = 0;
int _website_id = 0;
String _email = "";
String _created_in = "";
anywheresoftware.b4a.objects.collections.Map _maddress = null;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
anywheresoftware.b4a.BA.IterableList group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103940098;
 //BA.debugLineNum = 103940098;BA.debugLine="Wait For(SeleccionarCliente) complete (IDClienteS";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargainfoclientemagento"), __ref._seleccionarcliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 29;
return;
case 29:
//C
this.state = 1;
_idclientesel = (int) result[1];
;
RDebugUtils.currentLine=103940099;
 //BA.debugLineNum = 103940099;BA.debugLine="If IDClienteSel=-1 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (_idclientesel==-1) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=103940101;
 //BA.debugLineNum = 103940101;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCliente(t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargainfoclientemagento"), __ref._enviodatosapimagentoinformacioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ,_idclientesel));
this.state = 30;
return;
case 30:
//C
this.state = 7;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=103940102;
 //BA.debugLineNum = 103940102;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_sresp.startsWith("ERROR")) { 
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
this.state = 13;
;
RDebugUtils.currentLine=103940104;
 //BA.debugLineNum = 103940104;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=103940105;
 //BA.debugLineNum = 103940105;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=103940106;
 //BA.debugLineNum = 103940106;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=103940107;
 //BA.debugLineNum = 103940107;BA.debugLine="For Each sK As String In root.Keys";
if (true) break;

case 13:
//for
this.state = 16;
group8 = _root.Keys();
index8 = 0;
groupLen8 = group8.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 16;
if (index8 < groupLen8) {
this.state = 15;
_sk = BA.ObjectToString(group8.Get(index8));}
if (true) break;

case 32:
//C
this.state = 31;
index8++;
if (true) break;

case 15:
//C
this.state = 32;
RDebugUtils.currentLine=103940108;
 //BA.debugLineNum = 103940108;BA.debugLine="Log(sK & \": \" & root.Get(sK))";
parent.__c.LogImpl("8103940108",_sk+": "+BA.ObjectToString(_root.Get((Object)(_sk))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=103940110;
 //BA.debugLineNum = 103940110;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_root.Get((Object)("store_id"))));
RDebugUtils.currentLine=103940111;
 //BA.debugLineNum = 103940111;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
_firstname = BA.ObjectToString(_root.Get((Object)("firstname")));
RDebugUtils.currentLine=103940112;
 //BA.debugLineNum = 103940112;BA.debugLine="Dim addresses As List = root.Get(\"addresses\")";
_addresses = new anywheresoftware.b4a.objects.collections.List();
_addresses = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("addresses"))));
RDebugUtils.currentLine=103940113;
 //BA.debugLineNum = 103940113;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
_created_at = BA.ObjectToString(_root.Get((Object)("created_at")));
RDebugUtils.currentLine=103940114;
 //BA.debugLineNum = 103940114;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=103940115;
 //BA.debugLineNum = 103940115;BA.debugLine="Dim is_subscribed As String = extension_attribute";
_is_subscribed = BA.ObjectToString(_extension_attributes.Get((Object)("is_subscribed")));
RDebugUtils.currentLine=103940116;
 //BA.debugLineNum = 103940116;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
_lastname = BA.ObjectToString(_root.Get((Object)("lastname")));
RDebugUtils.currentLine=103940117;
 //BA.debugLineNum = 103940117;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=103940118;
 //BA.debugLineNum = 103940118;BA.debugLine="If custom_attributes.IsInitialized Then";
if (true) break;

case 17:
//if
this.state = 24;
if (_custom_attributes.IsInitialized()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=103940119;
 //BA.debugLineNum = 103940119;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
if (true) break;

case 20:
//for
this.state = 23;
_colcustom_attributes = new anywheresoftware.b4a.objects.collections.Map();
group20 = _custom_attributes;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 33;
if (true) break;

case 33:
//C
this.state = 23;
if (index20 < groupLen20) {
this.state = 22;
_colcustom_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 34:
//C
this.state = 33;
index20++;
if (true) break;

case 22:
//C
this.state = 34;
RDebugUtils.currentLine=103940120;
 //BA.debugLineNum = 103940120;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
_value = BA.ObjectToString(_colcustom_attributes.Get((Object)("value")));
RDebugUtils.currentLine=103940121;
 //BA.debugLineNum = 103940121;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
_attribute_code = BA.ObjectToString(_colcustom_attributes.Get((Object)("attribute_code")));
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=103940124;
 //BA.debugLineNum = 103940124;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
_updated_at = BA.ObjectToString(_root.Get((Object)("updated_at")));
RDebugUtils.currentLine=103940125;
 //BA.debugLineNum = 103940125;BA.debugLine="Dim disable_auto_group_change As Int = root.Get(\"";
_disable_auto_group_change = (int)(BA.ObjectToNumber(_root.Get((Object)("disable_auto_group_change"))));
RDebugUtils.currentLine=103940126;
 //BA.debugLineNum = 103940126;BA.debugLine="Dim group_id As Int = root.Get(\"group_id\")";
_group_id = (int)(BA.ObjectToNumber(_root.Get((Object)("group_id"))));
RDebugUtils.currentLine=103940127;
 //BA.debugLineNum = 103940127;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=103940128;
 //BA.debugLineNum = 103940128;BA.debugLine="Dim website_id As Int = root.Get(\"website_id\")";
_website_id = (int)(BA.ObjectToNumber(_root.Get((Object)("website_id"))));
RDebugUtils.currentLine=103940129;
 //BA.debugLineNum = 103940129;BA.debugLine="Dim email As String = root.Get(\"email\")";
_email = BA.ObjectToString(_root.Get((Object)("email")));
RDebugUtils.currentLine=103940130;
 //BA.debugLineNum = 103940130;BA.debugLine="Dim created_in As String = root.Get(\"created_in\")";
_created_in = BA.ObjectToString(_root.Get((Object)("created_in")));
RDebugUtils.currentLine=103940131;
 //BA.debugLineNum = 103940131;BA.debugLine="For Each mAddress As Map In addresses";
if (true) break;

case 25:
//for
this.state = 28;
_maddress = new anywheresoftware.b4a.objects.collections.Map();
group32 = _addresses;
index32 = 0;
groupLen32 = group32.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 28;
if (index32 < groupLen32) {
this.state = 27;
_maddress = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group32.Get(index32)));}
if (true) break;

case 36:
//C
this.state = 35;
index32++;
if (true) break;

case 27:
//C
this.state = 36;
RDebugUtils.currentLine=103940132;
 //BA.debugLineNum = 103940132;BA.debugLine="Log(\"Address: \" & mAddress)";
parent.__c.LogImpl("8103940132","Address: "+BA.ObjectToString(_maddress),0);
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=103940134;
 //BA.debugLineNum = 103940134;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=103940135;
 //BA.debugLineNum = 103940135;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacioncliente(b4j.docU.ctestsinfomagento __ref,String _token,int _idcliente) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacioncliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacioncliente", new Object[] {_token,_idcliente}));}
ResumableSub_EnvioDatosAPIMagentoInformacionCliente rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionCliente(this,__ref,_token,_idcliente);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token,int _idcliente) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idcliente = _idcliente;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
int _idcliente;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104071170;
 //BA.debugLineNum = 104071170;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=104071171;
 //BA.debugLineNum = 104071171;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=104071173;
 //BA.debugLineNum = 104071173;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"+parent.__c.SmartStringFormatter("",(Object)(_idcliente))+"");
RDebugUtils.currentLine=104071175;
 //BA.debugLineNum = 104071175;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=104071177;
 //BA.debugLineNum = 104071177;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=104071178;
 //BA.debugLineNum = 104071178;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=104071180;
 //BA.debugLineNum = 104071180;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=104071182;
 //BA.debugLineNum = 104071182;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacioncliente"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=104071184;
 //BA.debugLineNum = 104071184;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=104071185;
 //BA.debugLineNum = 104071185;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8104071185","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=104071186;
 //BA.debugLineNum = 104071186;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8104071186",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=104071187;
 //BA.debugLineNum = 104071187;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=104071188;
 //BA.debugLineNum = 104071188;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104071189;
 //BA.debugLineNum = 104071189;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=104071192;
 //BA.debugLineNum = 104071192;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=104071193;
 //BA.debugLineNum = 104071193;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104071194;
 //BA.debugLineNum = 104071194;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=104071196;
 //BA.debugLineNum = 104071196;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargainfodireccionesclientemagento(b4j.docU.ctestsinfomagento __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargainfodireccionesclientemagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargainfodireccionesclientemagento", new Object[] {_idclientesel}));}
ResumableSub_CargaInfoDireccionesClienteMagento rsub = new ResumableSub_CargaInfoDireccionesClienteMagento(this,__ref,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaInfoDireccionesClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaInfoDireccionesClienteMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _store_id = 0;
String _firstname = "";
anywheresoftware.b4a.objects.collections.List _addresses = null;
String _created_at = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
String _is_subscribed = "";
String _lastname = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
String _code = "";
String _customer_code = "";
anywheresoftware.b4a.objects.collections.Map _colcustom_attributes = null;
String _value = "";
String _attribute_code = "";
String _updated_at = "";
int _disable_auto_group_change = 0;
int _group_id = 0;
int _id = 0;
int _website_id = 0;
String _email = "";
String _created_in = "";
anywheresoftware.b4a.objects.collections.Map _maddress = null;
String _street = "";
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
anywheresoftware.b4a.BA.IterableList group32;
int index32;
int groupLen32;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104005640;
 //BA.debugLineNum = 104005640;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BDireccionesC";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BDireccionesCliente");
RDebugUtils.currentLine=104005642;
 //BA.debugLineNum = 104005642;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCliente(t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargainfodireccionesclientemagento"), __ref._enviodatosapimagentoinformacioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ,_idclientesel));
this.state = 31;
return;
case 31:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=104005643;
 //BA.debugLineNum = 104005643;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.startsWith("ERROR")) { 
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
RDebugUtils.currentLine=104005645;
 //BA.debugLineNum = 104005645;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=104005646;
 //BA.debugLineNum = 104005646;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=104005647;
 //BA.debugLineNum = 104005647;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=104005651;
 //BA.debugLineNum = 104005651;BA.debugLine="Dim store_id As Int = root.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_root.Get((Object)("store_id"))));
RDebugUtils.currentLine=104005652;
 //BA.debugLineNum = 104005652;BA.debugLine="Dim firstname As String = root.Get(\"firstname\")";
_firstname = BA.ObjectToString(_root.Get((Object)("firstname")));
RDebugUtils.currentLine=104005653;
 //BA.debugLineNum = 104005653;BA.debugLine="Dim addresses As List = root.Get(\"addresses\")";
_addresses = new anywheresoftware.b4a.objects.collections.List();
_addresses = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("addresses"))));
RDebugUtils.currentLine=104005654;
 //BA.debugLineNum = 104005654;BA.debugLine="Dim created_at As String = root.Get(\"created_at\")";
_created_at = BA.ObjectToString(_root.Get((Object)("created_at")));
RDebugUtils.currentLine=104005655;
 //BA.debugLineNum = 104005655;BA.debugLine="Dim extension_attributes As Map = root.Get(\"exten";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=104005656;
 //BA.debugLineNum = 104005656;BA.debugLine="Dim is_subscribed As String = extension_attribute";
_is_subscribed = BA.ObjectToString(_extension_attributes.Get((Object)("is_subscribed")));
RDebugUtils.currentLine=104005657;
 //BA.debugLineNum = 104005657;BA.debugLine="Dim lastname As String = root.Get(\"lastname\")";
_lastname = BA.ObjectToString(_root.Get((Object)("lastname")));
RDebugUtils.currentLine=104005658;
 //BA.debugLineNum = 104005658;BA.debugLine="Dim custom_attributes As List = root.Get(\"custom_";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=104005659;
 //BA.debugLineNum = 104005659;BA.debugLine="Dim code As String";
_code = "";
RDebugUtils.currentLine=104005660;
 //BA.debugLineNum = 104005660;BA.debugLine="Dim customer_code As String";
_customer_code = "";
RDebugUtils.currentLine=104005661;
 //BA.debugLineNum = 104005661;BA.debugLine="If custom_attributes.IsInitialized Then";
if (true) break;

case 7:
//if
this.state = 26;
if (_custom_attributes.IsInitialized()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=104005662;
 //BA.debugLineNum = 104005662;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
if (true) break;

case 10:
//for
this.state = 25;
_colcustom_attributes = new anywheresoftware.b4a.objects.collections.Map();
group18 = _custom_attributes;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 32;
if (true) break;

case 32:
//C
this.state = 25;
if (index18 < groupLen18) {
this.state = 12;
_colcustom_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group18.Get(index18)));}
if (true) break;

case 33:
//C
this.state = 32;
index18++;
if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=104005663;
 //BA.debugLineNum = 104005663;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
_value = BA.ObjectToString(_colcustom_attributes.Get((Object)("value")));
RDebugUtils.currentLine=104005664;
 //BA.debugLineNum = 104005664;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
_attribute_code = BA.ObjectToString(_colcustom_attributes.Get((Object)("attribute_code")));
RDebugUtils.currentLine=104005665;
 //BA.debugLineNum = 104005665;BA.debugLine="If attribute_code=\"code\" Then code=value";
if (true) break;

case 13:
//if
this.state = 18;
if ((_attribute_code).equals("code")) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
_code = _value;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=104005666;
 //BA.debugLineNum = 104005666;BA.debugLine="If attribute_code=\"customer_code\" Then customer";
if (true) break;

case 19:
//if
this.state = 24;
if ((_attribute_code).equals("customer_code")) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_customer_code = _value;
if (true) break;

case 24:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=104005670;
 //BA.debugLineNum = 104005670;BA.debugLine="Dim updated_at As String = root.Get(\"updated_at\")";
_updated_at = BA.ObjectToString(_root.Get((Object)("updated_at")));
RDebugUtils.currentLine=104005671;
 //BA.debugLineNum = 104005671;BA.debugLine="Dim disable_auto_group_change As Int = root.Get(\"";
_disable_auto_group_change = (int)(BA.ObjectToNumber(_root.Get((Object)("disable_auto_group_change"))));
RDebugUtils.currentLine=104005672;
 //BA.debugLineNum = 104005672;BA.debugLine="Dim group_id As Int = root.Get(\"group_id\")";
_group_id = (int)(BA.ObjectToNumber(_root.Get((Object)("group_id"))));
RDebugUtils.currentLine=104005673;
 //BA.debugLineNum = 104005673;BA.debugLine="Dim id As Int = root.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_root.Get((Object)("id"))));
RDebugUtils.currentLine=104005674;
 //BA.debugLineNum = 104005674;BA.debugLine="Dim website_id As Int = root.Get(\"website_id\")";
_website_id = (int)(BA.ObjectToNumber(_root.Get((Object)("website_id"))));
RDebugUtils.currentLine=104005675;
 //BA.debugLineNum = 104005675;BA.debugLine="Dim email As String = root.Get(\"email\")";
_email = BA.ObjectToString(_root.Get((Object)("email")));
RDebugUtils.currentLine=104005676;
 //BA.debugLineNum = 104005676;BA.debugLine="Dim created_in As String = root.Get(\"created_in\")";
_created_in = BA.ObjectToString(_root.Get((Object)("created_in")));
RDebugUtils.currentLine=104005677;
 //BA.debugLineNum = 104005677;BA.debugLine="For Each mAddress As Map In addresses";
if (true) break;

case 27:
//for
this.state = 30;
_maddress = new anywheresoftware.b4a.objects.collections.Map();
group32 = _addresses;
index32 = 0;
groupLen32 = group32.getSize();
this.state = 34;
if (true) break;

case 34:
//C
this.state = 30;
if (index32 < groupLen32) {
this.state = 29;
_maddress = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group32.Get(index32)));}
if (true) break;

case 35:
//C
this.state = 34;
index32++;
if (true) break;

case 29:
//C
this.state = 35;
RDebugUtils.currentLine=104005678;
 //BA.debugLineNum = 104005678;BA.debugLine="Log(\"Address: \" & mAddress)";
parent.__c.LogImpl("8104005678","Address: "+BA.ObjectToString(_maddress),0);
RDebugUtils.currentLine=104005679;
 //BA.debugLineNum = 104005679;BA.debugLine="Dim Street As String=mAddress.Get(\"Street\")";
_street = BA.ObjectToString(_maddress.Get((Object)("Street")));
RDebugUtils.currentLine=104005688;
 //BA.debugLineNum = 104005688;BA.debugLine="mAddress.Put(\"code\",code)";
_maddress.Put((Object)("code"),(Object)(_code));
RDebugUtils.currentLine=104005689;
 //BA.debugLineNum = 104005689;BA.debugLine="mAddress.Put(\"customer_code\",customer_code)";
_maddress.Put((Object)("customer_code"),(Object)(_customer_code));
RDebugUtils.currentLine=104005690;
 //BA.debugLineNum = 104005690;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BDireccionesCliente",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_maddress.getObject())}));
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=104005693;
 //BA.debugLineNum = 104005693;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=104005694;
 //BA.debugLineNum = 104005694;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistacategoriasmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargalistacategoriasmagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistacategoriasmagento", null));}
ResumableSub_CargaListaCategoriasMagento rsub = new ResumableSub_CargaListaCategoriasMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaCategoriasMagento extends BA.ResumableSub {
public ResumableSub_CargaListaCategoriasMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105775107;
 //BA.debugLineNum = 105775107;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BCategoriasPr";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BCategoriasProductos");
RDebugUtils.currentLine=105775109;
 //BA.debugLineNum = 105775109;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionCategoria";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargalistacategoriasmagento"), __ref._enviodatosapimagentoinformacioncategoriasproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=105775110;
 //BA.debugLineNum = 105775110;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.startsWith("ERROR")) { 
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
this.state = -1;
;
RDebugUtils.currentLine=105775112;
 //BA.debugLineNum = 105775112;BA.debugLine="Log(sResp)";
parent.__c.LogImpl("8105775112",_sresp,0);
RDebugUtils.currentLine=105775114;
 //BA.debugLineNum = 105775114;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=105775115;
 //BA.debugLineNum = 105775115;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacioncategoriasproductos(b4j.docU.ctestsinfomagento __ref,String _token) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacioncategoriasproductos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacioncategoriasproductos", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionCategoriasProductos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105840642;
 //BA.debugLineNum = 105840642;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=105840643;
 //BA.debugLineNum = 105840643;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=105840647;
 //BA.debugLineNum = 105840647;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/categories/list");
RDebugUtils.currentLine=105840649;
 //BA.debugLineNum = 105840649;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=105840651;
 //BA.debugLineNum = 105840651;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=105840652;
 //BA.debugLineNum = 105840652;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=105840654;
 //BA.debugLineNum = 105840654;BA.debugLine="job.GetRequest.Timeout=30000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (30000));
RDebugUtils.currentLine=105840656;
 //BA.debugLineNum = 105840656;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacioncategoriasproductos"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=105840658;
 //BA.debugLineNum = 105840658;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=105840659;
 //BA.debugLineNum = 105840659;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8105840659","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=105840660;
 //BA.debugLineNum = 105840660;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8105840660",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=105840661;
 //BA.debugLineNum = 105840661;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=105840662;
 //BA.debugLineNum = 105840662;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=105840663;
 //BA.debugLineNum = 105840663;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=105840666;
 //BA.debugLineNum = 105840666;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=105840667;
 //BA.debugLineNum = 105840667;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=105840668;
 //BA.debugLineNum = 105840668;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=105840670;
 //BA.debugLineNum = 105840670;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistaclientesmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargalistaclientesmagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistaclientesmagento", null));}
ResumableSub_CargaListaClientesMagento rsub = new ResumableSub_CargaListaClientesMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaClientesMagento extends BA.ResumableSub {
public ResumableSub_CargaListaClientesMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _total_count = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
int _id = 0;
String _sk = "";
int _store_id = 0;
String _firstname = "";
anywheresoftware.b4a.objects.collections.List _addresses = null;
anywheresoftware.b4a.objects.collections.Map _coladdresses = null;
String _city = "";
int _region_id = 0;
String _postcode = "";
String _telephone = "";
String _default_shipping = "";
String _lastname = "";
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
int _customer_id = 0;
anywheresoftware.b4a.objects.collections.Map _region = null;
String _regiona = "";
String _region_code = "";
String _default_billing = "";
String _country_id = "";
int _gender = 0;
String _created_at = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
String _is_subscribed = "";
String _updated_at = "";
int _disable_auto_group_change = 0;
int _group_id = 0;
String _dob = "";
int _website_id = 0;
String _email = "";
String _created_in = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
int _is_blocked = 0;
int _is_commercial = 0;
String _company = "";
String _code = "";
String _customer_group_code = "";
String _customer_group_name = "";
String _language = "";
anywheresoftware.b4a.objects.collections.Map _mattribute = null;
anywheresoftware.b4a.objects.collections.Map _search_criteria = null;
anywheresoftware.b4a.objects.collections.List _filter_groups = null;
anywheresoftware.b4a.objects.collections.Map _colfilter_groups = null;
anywheresoftware.b4a.objects.collections.List _filters = null;
anywheresoftware.b4a.objects.collections.Map _colfilters = null;
String _field = "";
String _condition_type = "";
String _value = "";
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;
anywheresoftware.b4a.BA.IterableList group68;
int index68;
int groupLen68;
anywheresoftware.b4a.BA.IterableList group91;
int index91;
int groupLen91;
anywheresoftware.b4a.BA.IterableList group93;
int index93;
int groupLen93;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103809025;
 //BA.debugLineNum = 103809025;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BClientes\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BClientes");
RDebugUtils.currentLine=103809026;
 //BA.debugLineNum = 103809026;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaClientes(tk)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargalistaclientesmagento"), __ref._enviodatosapimagentobusquedaclientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 90;
return;
case 90:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=103809027;
 //BA.debugLineNum = 103809027;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.startsWith("ERROR")) { 
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
RDebugUtils.currentLine=103809028;
 //BA.debugLineNum = 103809028;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=103809029;
 //BA.debugLineNum = 103809029;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=103809030;
 //BA.debugLineNum = 103809030;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=103809031;
 //BA.debugLineNum = 103809031;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
_total_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_count"))));
RDebugUtils.currentLine=103809032;
 //BA.debugLineNum = 103809032;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=103809033;
 //BA.debugLineNum = 103809033;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 7:
//for
this.state = 81;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group9 = _items;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 91;
if (true) break;

case 91:
//C
this.state = 81;
if (index9 < groupLen9) {
this.state = 9;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));}
if (true) break;

case 92:
//C
this.state = 91;
index9++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=103809034;
 //BA.debugLineNum = 103809034;BA.debugLine="Log(\"ColItems: \" & colitems)";
parent.__c.LogImpl("8103809034","ColItems: "+BA.ObjectToString(_colitems),0);
RDebugUtils.currentLine=103809036;
 //BA.debugLineNum = 103809036;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("id"))));
RDebugUtils.currentLine=103809037;
 //BA.debugLineNum = 103809037;BA.debugLine="If id=66 Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_id==66) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=103809038;
 //BA.debugLineNum = 103809038;BA.debugLine="Log(\"Mary J\")";
parent.__c.LogImpl("8103809038","Mary J",0);
 if (true) break;
;
RDebugUtils.currentLine=103809041;
 //BA.debugLineNum = 103809041;BA.debugLine="For Each sK As String In colitems.Keys";

case 13:
//for
this.state = 16;
group15 = _colitems.Keys();
index15 = 0;
groupLen15 = group15.getSize();
this.state = 93;
if (true) break;

case 93:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 15;
_sk = BA.ObjectToString(group15.Get(index15));}
if (true) break;

case 94:
//C
this.state = 93;
index15++;
if (true) break;

case 15:
//C
this.state = 94;
RDebugUtils.currentLine=103809042;
 //BA.debugLineNum = 103809042;BA.debugLine="Log(sK & \": \" & colitems.Get(sK))";
parent.__c.LogImpl("8103809042",_sk+": "+BA.ObjectToString(_colitems.Get((Object)(_sk))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=103809044;
 //BA.debugLineNum = 103809044;BA.debugLine="Dim store_id As Int = colitems.Get(\"store_id\")";
_store_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("store_id"))));
RDebugUtils.currentLine=103809045;
 //BA.debugLineNum = 103809045;BA.debugLine="Dim firstname As String = colitems.Get(\"firstnam";
_firstname = BA.ObjectToString(_colitems.Get((Object)("firstname")));
RDebugUtils.currentLine=103809046;
 //BA.debugLineNum = 103809046;BA.debugLine="Dim addresses As List = colitems.Get(\"addresses\"";
_addresses = new anywheresoftware.b4a.objects.collections.List();
_addresses = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("addresses"))));
RDebugUtils.currentLine=103809047;
 //BA.debugLineNum = 103809047;BA.debugLine="For Each coladdresses As Map In addresses";
if (true) break;

case 17:
//for
this.state = 24;
_coladdresses = new anywheresoftware.b4a.objects.collections.Map();
group21 = _addresses;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 95;
if (true) break;

case 95:
//C
this.state = 24;
if (index21 < groupLen21) {
this.state = 19;
_coladdresses = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group21.Get(index21)));}
if (true) break;

case 96:
//C
this.state = 95;
index21++;
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=103809049;
 //BA.debugLineNum = 103809049;BA.debugLine="Log(\"coladdresses: \" & coladdresses)";
parent.__c.LogImpl("8103809049","coladdresses: "+BA.ObjectToString(_coladdresses),0);
RDebugUtils.currentLine=103809050;
 //BA.debugLineNum = 103809050;BA.debugLine="Dim firstname As String = coladdresses.Get(\"fir";
_firstname = BA.ObjectToString(_coladdresses.Get((Object)("firstname")));
RDebugUtils.currentLine=103809051;
 //BA.debugLineNum = 103809051;BA.debugLine="Dim city As String = coladdresses.Get(\"city\")";
_city = BA.ObjectToString(_coladdresses.Get((Object)("city")));
RDebugUtils.currentLine=103809052;
 //BA.debugLineNum = 103809052;BA.debugLine="Dim region_id As Int = coladdresses.Get(\"region";
_region_id = (int)(BA.ObjectToNumber(_coladdresses.Get((Object)("region_id"))));
RDebugUtils.currentLine=103809053;
 //BA.debugLineNum = 103809053;BA.debugLine="Dim postcode As String = coladdresses.Get(\"post";
_postcode = BA.ObjectToString(_coladdresses.Get((Object)("postcode")));
RDebugUtils.currentLine=103809054;
 //BA.debugLineNum = 103809054;BA.debugLine="Dim telephone As String = coladdresses.Get(\"tel";
_telephone = BA.ObjectToString(_coladdresses.Get((Object)("telephone")));
RDebugUtils.currentLine=103809055;
 //BA.debugLineNum = 103809055;BA.debugLine="Dim default_shipping As String = coladdresses.G";
_default_shipping = BA.ObjectToString(_coladdresses.Get((Object)("default_shipping")));
RDebugUtils.currentLine=103809056;
 //BA.debugLineNum = 103809056;BA.debugLine="Dim lastname As String = coladdresses.Get(\"last";
_lastname = BA.ObjectToString(_coladdresses.Get((Object)("lastname")));
RDebugUtils.currentLine=103809057;
 //BA.debugLineNum = 103809057;BA.debugLine="Dim street As List = coladdresses.Get(\"street\")";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_coladdresses.Get((Object)("street"))));
RDebugUtils.currentLine=103809058;
 //BA.debugLineNum = 103809058;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 20:
//for
this.state = 23;
group31 = _street;
index31 = 0;
groupLen31 = group31.getSize();
this.state = 97;
if (true) break;

case 97:
//C
this.state = 23;
if (index31 < groupLen31) {
this.state = 22;
_colstreet = BA.ObjectToString(group31.Get(index31));}
if (true) break;

case 98:
//C
this.state = 97;
index31++;
if (true) break;

case 22:
//C
this.state = 98;
 if (true) break;
if (true) break;

case 23:
//C
this.state = 96;
;
RDebugUtils.currentLine=103809060;
 //BA.debugLineNum = 103809060;BA.debugLine="Dim id As Int = coladdresses.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_coladdresses.Get((Object)("id"))));
RDebugUtils.currentLine=103809061;
 //BA.debugLineNum = 103809061;BA.debugLine="Dim customer_id As Int = coladdresses.Get(\"cust";
_customer_id = (int)(BA.ObjectToNumber(_coladdresses.Get((Object)("customer_id"))));
RDebugUtils.currentLine=103809062;
 //BA.debugLineNum = 103809062;BA.debugLine="Dim region As Map = coladdresses.Get(\"region\")";
_region = new anywheresoftware.b4a.objects.collections.Map();
_region = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_coladdresses.Get((Object)("region"))));
RDebugUtils.currentLine=103809063;
 //BA.debugLineNum = 103809063;BA.debugLine="Dim region_id As Int = region.Get(\"region_id\")";
_region_id = (int)(BA.ObjectToNumber(_region.Get((Object)("region_id"))));
RDebugUtils.currentLine=103809064;
 //BA.debugLineNum = 103809064;BA.debugLine="Dim regionA As String = region.Get(\"region\")";
_regiona = BA.ObjectToString(_region.Get((Object)("region")));
RDebugUtils.currentLine=103809065;
 //BA.debugLineNum = 103809065;BA.debugLine="Dim region_code As String = region.Get(\"region_";
_region_code = BA.ObjectToString(_region.Get((Object)("region_code")));
RDebugUtils.currentLine=103809066;
 //BA.debugLineNum = 103809066;BA.debugLine="Dim default_billing As String = coladdresses.Ge";
_default_billing = BA.ObjectToString(_coladdresses.Get((Object)("default_billing")));
RDebugUtils.currentLine=103809067;
 //BA.debugLineNum = 103809067;BA.debugLine="Dim country_id As String = coladdresses.Get(\"co";
_country_id = BA.ObjectToString(_coladdresses.Get((Object)("country_id")));
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=103809069;
 //BA.debugLineNum = 103809069;BA.debugLine="Dim gender As Int = colitems.Getdefault(\"gender\"";
_gender = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("gender"),(Object)(0))));
RDebugUtils.currentLine=103809070;
 //BA.debugLineNum = 103809070;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=103809071;
 //BA.debugLineNum = 103809071;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=103809072;
 //BA.debugLineNum = 103809072;BA.debugLine="Dim is_subscribed As String = extension_attribut";
_is_subscribed = BA.ObjectToString(_extension_attributes.Get((Object)("is_subscribed")));
RDebugUtils.currentLine=103809073;
 //BA.debugLineNum = 103809073;BA.debugLine="Dim default_shipping As String = colitems.Get(\"d";
_default_shipping = BA.ObjectToString(_colitems.Get((Object)("default_shipping")));
RDebugUtils.currentLine=103809074;
 //BA.debugLineNum = 103809074;BA.debugLine="Dim lastname As String = colitems.Get(\"lastname\"";
_lastname = BA.ObjectToString(_colitems.Get((Object)("lastname")));
RDebugUtils.currentLine=103809075;
 //BA.debugLineNum = 103809075;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=103809076;
 //BA.debugLineNum = 103809076;BA.debugLine="Dim disable_auto_group_change As Int = colitems.";
_disable_auto_group_change = (int)(BA.ObjectToNumber(_colitems.Get((Object)("disable_auto_group_change"))));
RDebugUtils.currentLine=103809077;
 //BA.debugLineNum = 103809077;BA.debugLine="Dim group_id As Int = colitems.Get(\"group_id\")";
_group_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("group_id"))));
RDebugUtils.currentLine=103809078;
 //BA.debugLineNum = 103809078;BA.debugLine="Dim dob As String = colitems.Get(\"dob\")";
_dob = BA.ObjectToString(_colitems.Get((Object)("dob")));
RDebugUtils.currentLine=103809079;
 //BA.debugLineNum = 103809079;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("id"))));
RDebugUtils.currentLine=103809080;
 //BA.debugLineNum = 103809080;BA.debugLine="Dim default_billing As String = colitems.Get(\"de";
_default_billing = BA.ObjectToString(_colitems.Get((Object)("default_billing")));
RDebugUtils.currentLine=103809081;
 //BA.debugLineNum = 103809081;BA.debugLine="Dim website_id As Int = colitems.Get(\"website_id";
_website_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("website_id"))));
RDebugUtils.currentLine=103809082;
 //BA.debugLineNum = 103809082;BA.debugLine="Dim email As String = colitems.Get(\"email\")";
_email = BA.ObjectToString(_colitems.Get((Object)("email")));
RDebugUtils.currentLine=103809083;
 //BA.debugLineNum = 103809083;BA.debugLine="Dim created_in As String = colitems.Get(\"created";
_created_in = BA.ObjectToString(_colitems.Get((Object)("created_in")));
RDebugUtils.currentLine=103809084;
 //BA.debugLineNum = 103809084;BA.debugLine="Dim custom_attributes As List=colitems.Get(\"cust";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=103809085;
 //BA.debugLineNum = 103809085;BA.debugLine="Dim is_blocked As Int=0";
_is_blocked = (int) (0);
RDebugUtils.currentLine=103809086;
 //BA.debugLineNum = 103809086;BA.debugLine="Dim is_commercial As Int=0";
_is_commercial = (int) (0);
RDebugUtils.currentLine=103809087;
 //BA.debugLineNum = 103809087;BA.debugLine="Dim company As String=\"\"";
_company = "";
RDebugUtils.currentLine=103809088;
 //BA.debugLineNum = 103809088;BA.debugLine="Dim code As String=\"\"";
_code = "";
RDebugUtils.currentLine=103809089;
 //BA.debugLineNum = 103809089;BA.debugLine="Dim customer_group_code As String=\"\"";
_customer_group_code = "";
RDebugUtils.currentLine=103809090;
 //BA.debugLineNum = 103809090;BA.debugLine="Dim customer_group_name As String=\"\"";
_customer_group_name = "";
RDebugUtils.currentLine=103809091;
 //BA.debugLineNum = 103809091;BA.debugLine="Dim language As String=\"\"";
_language = "";
RDebugUtils.currentLine=103809092;
 //BA.debugLineNum = 103809092;BA.debugLine="Dim country_id As String=\"\"";
_country_id = "";
RDebugUtils.currentLine=103809093;
 //BA.debugLineNum = 103809093;BA.debugLine="If custom_attributes.IsInitialized Then";
if (true) break;

case 25:
//if
this.state = 80;
if (_custom_attributes.IsInitialized()) { 
this.state = 27;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=103809094;
 //BA.debugLineNum = 103809094;BA.debugLine="Log(custom_attributes)";
parent.__c.LogImpl("8103809094",BA.ObjectToString(_custom_attributes),0);
RDebugUtils.currentLine=103809095;
 //BA.debugLineNum = 103809095;BA.debugLine="For Each mAttribute As Map In custom_attributes";
if (true) break;

case 28:
//for
this.state = 79;
_mattribute = new anywheresoftware.b4a.objects.collections.Map();
group68 = _custom_attributes;
index68 = 0;
groupLen68 = group68.getSize();
this.state = 99;
if (true) break;

case 99:
//C
this.state = 79;
if (index68 < groupLen68) {
this.state = 30;
_mattribute = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group68.Get(index68)));}
if (true) break;

case 100:
//C
this.state = 99;
index68++;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=103809096;
 //BA.debugLineNum = 103809096;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_blocke";
if (true) break;

case 31:
//if
this.state = 36;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("is_blocked"))) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_is_blocked = (int)(BA.ObjectToNumber(_mattribute.Get((Object)("value"))));
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=103809097;
 //BA.debugLineNum = 103809097;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"is_commer";
if (true) break;

case 37:
//if
this.state = 42;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("is_commercial"))) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_is_commercial = (int)(BA.ObjectToNumber(_mattribute.Get((Object)("value"))));
if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=103809098;
 //BA.debugLineNum = 103809098;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"company\"";
if (true) break;

case 43:
//if
this.state = 48;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("company"))) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
_company = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=103809099;
 //BA.debugLineNum = 103809099;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"code\" The";
if (true) break;

case 49:
//if
this.state = 54;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("code"))) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
_code = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=103809100;
 //BA.debugLineNum = 103809100;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
if (true) break;

case 55:
//if
this.state = 60;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("customer_group_code"))) { 
this.state = 57;
;}if (true) break;

case 57:
//C
this.state = 60;
_customer_group_code = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=103809101;
 //BA.debugLineNum = 103809101;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"customer_";
if (true) break;

case 61:
//if
this.state = 66;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("customer_group_name"))) { 
this.state = 63;
;}if (true) break;

case 63:
//C
this.state = 66;
_customer_group_name = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=103809102;
 //BA.debugLineNum = 103809102;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"language\"";
if (true) break;

case 67:
//if
this.state = 72;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("language"))) { 
this.state = 69;
;}if (true) break;

case 69:
//C
this.state = 72;
_language = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 72:
//C
this.state = 73;
;
RDebugUtils.currentLine=103809103;
 //BA.debugLineNum = 103809103;BA.debugLine="If mAttribute.Get(\"attribute_code\")=\"country_i";
if (true) break;

case 73:
//if
this.state = 78;
if ((_mattribute.Get((Object)("attribute_code"))).equals((Object)("country_id"))) { 
this.state = 75;
;}if (true) break;

case 75:
//C
this.state = 78;
_country_id = BA.ObjectToString(_mattribute.Get((Object)("value")));
if (true) break;

case 78:
//C
this.state = 100;
;
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
;
RDebugUtils.currentLine=103809106;
 //BA.debugLineNum = 103809106;BA.debugLine="colitems.put(\"is_blocked\",is_blocked)";
_colitems.Put((Object)("is_blocked"),(Object)(_is_blocked));
RDebugUtils.currentLine=103809107;
 //BA.debugLineNum = 103809107;BA.debugLine="colitems.put(\"is_commercial\",is_commercial)";
_colitems.Put((Object)("is_commercial"),(Object)(_is_commercial));
RDebugUtils.currentLine=103809108;
 //BA.debugLineNum = 103809108;BA.debugLine="colitems.put(\"company\",company)";
_colitems.Put((Object)("company"),(Object)(_company));
RDebugUtils.currentLine=103809109;
 //BA.debugLineNum = 103809109;BA.debugLine="colitems.put(\"code\",code)";
_colitems.Put((Object)("code"),(Object)(_code));
RDebugUtils.currentLine=103809110;
 //BA.debugLineNum = 103809110;BA.debugLine="colitems.put(\"customer_group_code\",customer_gro";
_colitems.Put((Object)("customer_group_code"),(Object)(_customer_group_code));
RDebugUtils.currentLine=103809111;
 //BA.debugLineNum = 103809111;BA.debugLine="colitems.put(\"customer_group_name\",customer_gro";
_colitems.Put((Object)("customer_group_name"),(Object)(_customer_group_name));
RDebugUtils.currentLine=103809112;
 //BA.debugLineNum = 103809112;BA.debugLine="colitems.put(\"language\",language)";
_colitems.Put((Object)("language"),(Object)(_language));
RDebugUtils.currentLine=103809113;
 //BA.debugLineNum = 103809113;BA.debugLine="colitems.put(\"country_id\",country_id)";
_colitems.Put((Object)("country_id"),(Object)(_country_id));
 if (true) break;

case 80:
//C
this.state = 92;
;
 if (true) break;
if (true) break;

case 81:
//C
this.state = 82;
;
RDebugUtils.currentLine=103809119;
 //BA.debugLineNum = 103809119;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BClientes",_items);
RDebugUtils.currentLine=103809120;
 //BA.debugLineNum = 103809120;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
_search_criteria = new anywheresoftware.b4a.objects.collections.Map();
_search_criteria = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("search_criteria"))));
RDebugUtils.currentLine=103809121;
 //BA.debugLineNum = 103809121;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
_filter_groups = new anywheresoftware.b4a.objects.collections.List();
_filter_groups = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_criteria.Get((Object)("filter_groups"))));
RDebugUtils.currentLine=103809122;
 //BA.debugLineNum = 103809122;BA.debugLine="For Each colfilter_groups As Map In filter_groups";
if (true) break;

case 82:
//for
this.state = 89;
_colfilter_groups = new anywheresoftware.b4a.objects.collections.Map();
group91 = _filter_groups;
index91 = 0;
groupLen91 = group91.getSize();
this.state = 101;
if (true) break;

case 101:
//C
this.state = 89;
if (index91 < groupLen91) {
this.state = 84;
_colfilter_groups = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group91.Get(index91)));}
if (true) break;

case 102:
//C
this.state = 101;
index91++;
if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=103809123;
 //BA.debugLineNum = 103809123;BA.debugLine="Dim filters As List = colfilter_groups.Get(\"filt";
_filters = new anywheresoftware.b4a.objects.collections.List();
_filters = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colfilter_groups.Get((Object)("filters"))));
RDebugUtils.currentLine=103809124;
 //BA.debugLineNum = 103809124;BA.debugLine="For Each colfilters As Map In filters";
if (true) break;

case 85:
//for
this.state = 88;
_colfilters = new anywheresoftware.b4a.objects.collections.Map();
group93 = _filters;
index93 = 0;
groupLen93 = group93.getSize();
this.state = 103;
if (true) break;

case 103:
//C
this.state = 88;
if (index93 < groupLen93) {
this.state = 87;
_colfilters = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group93.Get(index93)));}
if (true) break;

case 104:
//C
this.state = 103;
index93++;
if (true) break;

case 87:
//C
this.state = 104;
RDebugUtils.currentLine=103809125;
 //BA.debugLineNum = 103809125;BA.debugLine="Dim field As String = colfilters.Get(\"field\")";
_field = BA.ObjectToString(_colfilters.Get((Object)("field")));
RDebugUtils.currentLine=103809126;
 //BA.debugLineNum = 103809126;BA.debugLine="Dim condition_type As String = colfilters.Get(\"";
_condition_type = BA.ObjectToString(_colfilters.Get((Object)("condition_type")));
RDebugUtils.currentLine=103809127;
 //BA.debugLineNum = 103809127;BA.debugLine="Dim value As String = colfilters.Get(\"value\")";
_value = BA.ObjectToString(_colfilters.Get((Object)("value")));
 if (true) break;
if (true) break;

case 88:
//C
this.state = 102;
;
 if (true) break;
if (true) break;

case 89:
//C
this.state = -1;
;
RDebugUtils.currentLine=103809130;
 //BA.debugLineNum = 103809130;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=103809131;
 //BA.debugLineNum = 103809131;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentobusquedaclientes(b4j.docU.ctestsinfomagento __ref,String _token) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentobusquedaclientes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentobusquedaclientes", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoBusquedaClientes rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaClientes extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaClientes(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103874562;
 //BA.debugLineNum = 103874562;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=103874563;
 //BA.debugLineNum = 103874563;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=103874568;
 //BA.debugLineNum = 103874568;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/search?\n"+"	searchCriteria[filterGroups][0][filters][0][field]=firstname&\n"+"	searchCriteria[filterGroups][0][filters][0][value]=%&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=like");
RDebugUtils.currentLine=103874573;
 //BA.debugLineNum = 103874573;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=103874575;
 //BA.debugLineNum = 103874575;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=103874576;
 //BA.debugLineNum = 103874576;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=103874578;
 //BA.debugLineNum = 103874578;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=103874580;
 //BA.debugLineNum = 103874580;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedaclientes"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=103874582;
 //BA.debugLineNum = 103874582;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=103874583;
 //BA.debugLineNum = 103874583;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8103874583","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=103874584;
 //BA.debugLineNum = 103874584;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8103874584",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=103874585;
 //BA.debugLineNum = 103874585;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=103874586;
 //BA.debugLineNum = 103874586;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=103874587;
 //BA.debugLineNum = 103874587;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=103874590;
 //BA.debugLineNum = 103874590;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=103874591;
 //BA.debugLineNum = 103874591;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=103874592;
 //BA.debugLineNum = 103874592;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=103874594;
 //BA.debugLineNum = 103874594;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistagruposclientemagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargalistagruposclientemagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistagruposclientemagento", null));}
ResumableSub_CargaListaGruposClienteMagento rsub = new ResumableSub_CargaListaGruposClienteMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaGruposClienteMagento extends BA.ResumableSub {
public ResumableSub_CargaListaGruposClienteMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _total_count = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
String _code = "";
int _tax_class_id = 0;
int _id = 0;
String _tax_class_name = "";
anywheresoftware.b4a.objects.collections.Map _search_criteria = null;
anywheresoftware.b4a.objects.collections.List _filter_groups = null;
anywheresoftware.b4a.objects.collections.Map _colfilter_groups = null;
anywheresoftware.b4a.objects.collections.List _filters = null;
anywheresoftware.b4a.objects.collections.Map _colfilters = null;
String _field = "";
String _condition_type = "";
String _value = "";
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103612417;
 //BA.debugLineNum = 103612417;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BGruposClient";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BGruposCliente");
RDebugUtils.currentLine=103612418;
 //BA.debugLineNum = 103612418;BA.debugLine="wait for(EnvioDatosAPIMagentoBusquedaGruposClient";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargalistagruposclientemagento"), __ref._enviodatosapimagentobusquedagruposclientes /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 19;
return;
case 19:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=103612419;
 //BA.debugLineNum = 103612419;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (_sresp.startsWith("ERROR")) { 
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
RDebugUtils.currentLine=103612421;
 //BA.debugLineNum = 103612421;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=103612422;
 //BA.debugLineNum = 103612422;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=103612423;
 //BA.debugLineNum = 103612423;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=103612424;
 //BA.debugLineNum = 103612424;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
_total_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_count"))));
RDebugUtils.currentLine=103612425;
 //BA.debugLineNum = 103612425;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=103612426;
 //BA.debugLineNum = 103612426;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 7:
//for
this.state = 10;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group9 = _items;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 10;
if (index9 < groupLen9) {
this.state = 9;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));}
if (true) break;

case 21:
//C
this.state = 20;
index9++;
if (true) break;

case 9:
//C
this.state = 21;
RDebugUtils.currentLine=103612427;
 //BA.debugLineNum = 103612427;BA.debugLine="Dim code As String = colitems.Get(\"code\")";
_code = BA.ObjectToString(_colitems.Get((Object)("code")));
RDebugUtils.currentLine=103612428;
 //BA.debugLineNum = 103612428;BA.debugLine="Dim tax_class_id As Int = colitems.Get(\"tax_clas";
_tax_class_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("tax_class_id"))));
RDebugUtils.currentLine=103612429;
 //BA.debugLineNum = 103612429;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("id"))));
RDebugUtils.currentLine=103612430;
 //BA.debugLineNum = 103612430;BA.debugLine="Dim tax_class_name As String = colitems.Get(\"tax";
_tax_class_name = BA.ObjectToString(_colitems.Get((Object)("tax_class_name")));
RDebugUtils.currentLine=103612431;
 //BA.debugLineNum = 103612431;BA.debugLine="Log(colitems)";
parent.__c.LogImpl("8103612431",BA.ObjectToString(_colitems),0);
RDebugUtils.currentLine=103612432;
 //BA.debugLineNum = 103612432;BA.debugLine="Log(\"\")";
parent.__c.LogImpl("8103612432","",0);
RDebugUtils.currentLine=103612433;
 //BA.debugLineNum = 103612433;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BGruposCli";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("insert into tblB2BGruposCliente (code, tax_class_id, id, tax_class_name) values (?,?,?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_code),(Object)(_tax_class_id),(Object)(_id),(Object)(_tax_class_name)}));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=103612436;
 //BA.debugLineNum = 103612436;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
_search_criteria = new anywheresoftware.b4a.objects.collections.Map();
_search_criteria = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("search_criteria"))));
RDebugUtils.currentLine=103612437;
 //BA.debugLineNum = 103612437;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
_filter_groups = new anywheresoftware.b4a.objects.collections.List();
_filter_groups = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_criteria.Get((Object)("filter_groups"))));
RDebugUtils.currentLine=103612438;
 //BA.debugLineNum = 103612438;BA.debugLine="For Each colfilter_groups As Map In filter_groups";
if (true) break;

case 11:
//for
this.state = 18;
_colfilter_groups = new anywheresoftware.b4a.objects.collections.Map();
group20 = _filter_groups;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 22;
if (true) break;

case 22:
//C
this.state = 18;
if (index20 < groupLen20) {
this.state = 13;
_colfilter_groups = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 23:
//C
this.state = 22;
index20++;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=103612439;
 //BA.debugLineNum = 103612439;BA.debugLine="Dim filters As List = colfilter_groups.Get(\"filt";
_filters = new anywheresoftware.b4a.objects.collections.List();
_filters = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colfilter_groups.Get((Object)("filters"))));
RDebugUtils.currentLine=103612440;
 //BA.debugLineNum = 103612440;BA.debugLine="For Each colfilters As Map In filters";
if (true) break;

case 14:
//for
this.state = 17;
_colfilters = new anywheresoftware.b4a.objects.collections.Map();
group22 = _filters;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 24;
if (true) break;

case 24:
//C
this.state = 17;
if (index22 < groupLen22) {
this.state = 16;
_colfilters = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group22.Get(index22)));}
if (true) break;

case 25:
//C
this.state = 24;
index22++;
if (true) break;

case 16:
//C
this.state = 25;
RDebugUtils.currentLine=103612441;
 //BA.debugLineNum = 103612441;BA.debugLine="Dim field As String = colfilters.Get(\"field\")";
_field = BA.ObjectToString(_colfilters.Get((Object)("field")));
RDebugUtils.currentLine=103612442;
 //BA.debugLineNum = 103612442;BA.debugLine="Dim condition_type As String = colfilters.Get(\"";
_condition_type = BA.ObjectToString(_colfilters.Get((Object)("condition_type")));
RDebugUtils.currentLine=103612443;
 //BA.debugLineNum = 103612443;BA.debugLine="Dim value As String = colfilters.Get(\"value\")";
_value = BA.ObjectToString(_colfilters.Get((Object)("value")));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 23;
;
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
;
RDebugUtils.currentLine=103612446;
 //BA.debugLineNum = 103612446;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=103612448;
 //BA.debugLineNum = 103612448;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentobusquedagruposclientes(b4j.docU.ctestsinfomagento __ref,String _token) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentobusquedagruposclientes", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentobusquedagruposclientes", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaGruposClientes(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103677954;
 //BA.debugLineNum = 103677954;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=103677955;
 //BA.debugLineNum = 103677955;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=103677957;
 //BA.debugLineNum = 103677957;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customerGroups/search?\n"+"	searchCriteria[filterGroups][0][filters][0][field]=code&\n"+"	searchCriteria[filterGroups][0][filters][0][value]=%&\n"+"	searchCriteria[filterGroups][0][filters][0][condition_type]=like");
RDebugUtils.currentLine=103677962;
 //BA.debugLineNum = 103677962;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=103677964;
 //BA.debugLineNum = 103677964;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=103677965;
 //BA.debugLineNum = 103677965;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=103677967;
 //BA.debugLineNum = 103677967;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=103677969;
 //BA.debugLineNum = 103677969;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedagruposclientes"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=103677971;
 //BA.debugLineNum = 103677971;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=103677972;
 //BA.debugLineNum = 103677972;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8103677972","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=103677973;
 //BA.debugLineNum = 103677973;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8103677973",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=103677974;
 //BA.debugLineNum = 103677974;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=103677975;
 //BA.debugLineNum = 103677975;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=103677976;
 //BA.debugLineNum = 103677976;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=103677979;
 //BA.debugLineNum = 103677979;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=103677980;
 //BA.debugLineNum = 103677980;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=103677981;
 //BA.debugLineNum = 103677981;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=103677983;
 //BA.debugLineNum = 103677983;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistaproductosmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargalistaproductosmagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistaproductosmagento", null));}
ResumableSub_CargaListaProductosMagento rsub = new ResumableSub_CargaListaProductosMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaProductosMagento extends BA.ResumableSub {
public ResumableSub_CargaListaProductosMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _total_count = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.List _lsttallas = null;
anywheresoftware.b4a.objects.collections.List _lstunidadesmedida = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
int _visibility = 0;
String _type_id = "";
String _created_at = "";
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
anywheresoftware.b4a.objects.collections.List _website_ids = null;
int _colwebsite_ids = 0;
anywheresoftware.b4a.objects.collections.List _category_links = null;
anywheresoftware.b4a.objects.collections.Map _colcategory_links = null;
String _category_id = "";
int _position = 0;
anywheresoftware.b4a.objects.collections.List _tier_prices = null;
String _sku = "";
anywheresoftware.b4a.objects.collections.List _custom_attributes = null;
int _idtalla = 0;
String _unidadmedida = "";
anywheresoftware.b4a.objects.collections.Map _colcustom_attributes = null;
String _value = "";
String _attribute_code = "";
int _attribute_set_id = 0;
String _updated_at = "";
int _price = 0;
anywheresoftware.b4a.objects.collections.List _media_gallery_entries = null;
anywheresoftware.b4a.objects.collections.Map _colmedia_gallery_entries = null;
anywheresoftware.b4a.objects.collections.List _types = null;
String _coltypes = "";
String _fichero = "";
String _media_type = "";
String _disabled = "";
int _id = 0;
String _label = "";
String _name = "";
anywheresoftware.b4a.objects.collections.List _options = null;
anywheresoftware.b4a.objects.collections.List _product_links = null;
anywheresoftware.b4a.objects.collections.Map _colproduct_links = null;
String _link_type = "";
String _linked_product_sku = "";
String _linked_product_type = "";
int _status = 0;
anywheresoftware.b4a.objects.collections.Map _search_criteria = null;
anywheresoftware.b4a.objects.collections.List _filter_groups = null;
int _current_page = 0;
int _page_size = 0;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;
anywheresoftware.b4a.BA.IterableList group26;
int index26;
int groupLen26;
anywheresoftware.b4a.BA.IterableList group36;
int index36;
int groupLen36;
anywheresoftware.b4a.BA.IterableList group55;
int index55;
int groupLen55;
anywheresoftware.b4a.BA.IterableList group57;
int index57;
int groupLen57;
anywheresoftware.b4a.BA.IterableList group71;
int index71;
int groupLen71;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104202242;
 //BA.debugLineNum = 104202242;BA.debugLine="wait for(CargaValoresAtributoSizeProductos) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargalistaproductosmagento"), __ref._cargavaloresatributosizeproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 52;
return;
case 52:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=104202243;
 //BA.debugLineNum = 104202243;BA.debugLine="If Not(Success) Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(_success)) { 
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
RDebugUtils.currentLine=104202248;
 //BA.debugLineNum = 104202248;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BProductos\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BProductos");
RDebugUtils.currentLine=104202250;
 //BA.debugLineNum = 104202250;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionProductos";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargalistaproductosmagento"), __ref._enviodatosapimagentoinformacionproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 53;
return;
case 53:
//C
this.state = 7;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=104202251;
 //BA.debugLineNum = 104202251;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then Return False";
if (true) break;

case 7:
//if
this.state = 12;
if (_sresp.startsWith("ERROR")) { 
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
this.state = 13;
;
RDebugUtils.currentLine=104202253;
 //BA.debugLineNum = 104202253;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=104202254;
 //BA.debugLineNum = 104202254;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=104202255;
 //BA.debugLineNum = 104202255;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=104202256;
 //BA.debugLineNum = 104202256;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
_total_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_count"))));
RDebugUtils.currentLine=104202257;
 //BA.debugLineNum = 104202257;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=104202258;
 //BA.debugLineNum = 104202258;BA.debugLine="Dim lstTallas As List";
_lsttallas = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=104202259;
 //BA.debugLineNum = 104202259;BA.debugLine="lstTallas.Initialize";
_lsttallas.Initialize();
RDebugUtils.currentLine=104202260;
 //BA.debugLineNum = 104202260;BA.debugLine="Dim lstUnidadesMedida As List";
_lstunidadesmedida = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=104202261;
 //BA.debugLineNum = 104202261;BA.debugLine="lstUnidadesMedida.Initialize";
_lstunidadesmedida.Initialize();
RDebugUtils.currentLine=104202262;
 //BA.debugLineNum = 104202262;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 13:
//for
this.state = 51;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group15 = _items;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 54;
if (true) break;

case 54:
//C
this.state = 51;
if (index15 < groupLen15) {
this.state = 15;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group15.Get(index15)));}
if (true) break;

case 55:
//C
this.state = 54;
index15++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=104202263;
 //BA.debugLineNum = 104202263;BA.debugLine="Log(\"colitems:\" & colitems)";
parent.__c.LogImpl("8104202263","colitems:"+BA.ObjectToString(_colitems),0);
RDebugUtils.currentLine=104202264;
 //BA.debugLineNum = 104202264;BA.debugLine="Dim visibility As Int = colitems.Get(\"visibility";
_visibility = (int)(BA.ObjectToNumber(_colitems.Get((Object)("visibility"))));
RDebugUtils.currentLine=104202265;
 //BA.debugLineNum = 104202265;BA.debugLine="Dim type_id As String = colitems.Get(\"type_id\")";
_type_id = BA.ObjectToString(_colitems.Get((Object)("type_id")));
RDebugUtils.currentLine=104202266;
 //BA.debugLineNum = 104202266;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=104202267;
 //BA.debugLineNum = 104202267;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=104202268;
 //BA.debugLineNum = 104202268;BA.debugLine="Dim website_ids As List = extension_attributes.G";
_website_ids = new anywheresoftware.b4a.objects.collections.List();
_website_ids = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("website_ids"))));
RDebugUtils.currentLine=104202269;
 //BA.debugLineNum = 104202269;BA.debugLine="For Each colwebsite_ids As Int In website_ids";
if (true) break;

case 16:
//for
this.state = 19;
group22 = _website_ids;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 56;
if (true) break;

case 56:
//C
this.state = 19;
if (index22 < groupLen22) {
this.state = 18;
_colwebsite_ids = (int)(BA.ObjectToNumber(group22.Get(index22)));}
if (true) break;

case 57:
//C
this.state = 56;
index22++;
if (true) break;

case 18:
//C
this.state = 57;
 if (true) break;
if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=104202272;
 //BA.debugLineNum = 104202272;BA.debugLine="Dim category_links As List = extension_attribute";
_category_links = new anywheresoftware.b4a.objects.collections.List();
_category_links = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("category_links"))));
RDebugUtils.currentLine=104202273;
 //BA.debugLineNum = 104202273;BA.debugLine="If category_links.IsInitialized Then";
if (true) break;

case 20:
//if
this.state = 27;
if (_category_links.IsInitialized()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=104202274;
 //BA.debugLineNum = 104202274;BA.debugLine="For Each colcategory_links As Map In category_l";
if (true) break;

case 23:
//for
this.state = 26;
_colcategory_links = new anywheresoftware.b4a.objects.collections.Map();
group26 = _category_links;
index26 = 0;
groupLen26 = group26.getSize();
this.state = 58;
if (true) break;

case 58:
//C
this.state = 26;
if (index26 < groupLen26) {
this.state = 25;
_colcategory_links = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group26.Get(index26)));}
if (true) break;

case 59:
//C
this.state = 58;
index26++;
if (true) break;

case 25:
//C
this.state = 59;
RDebugUtils.currentLine=104202275;
 //BA.debugLineNum = 104202275;BA.debugLine="Dim category_id As String = colcategory_links.";
_category_id = BA.ObjectToString(_colcategory_links.Get((Object)("category_id")));
RDebugUtils.currentLine=104202276;
 //BA.debugLineNum = 104202276;BA.debugLine="Dim position As Int = colcategory_links.Get(\"p";
_position = (int)(BA.ObjectToNumber(_colcategory_links.Get((Object)("position"))));
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
RDebugUtils.currentLine=104202279;
 //BA.debugLineNum = 104202279;BA.debugLine="Dim tier_prices As List = colitems.Get(\"tier_pri";
_tier_prices = new anywheresoftware.b4a.objects.collections.List();
_tier_prices = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("tier_prices"))));
RDebugUtils.currentLine=104202280;
 //BA.debugLineNum = 104202280;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=104202291;
 //BA.debugLineNum = 104202291;BA.debugLine="Dim custom_attributes As List = colitems.Get(\"cu";
_custom_attributes = new anywheresoftware.b4a.objects.collections.List();
_custom_attributes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("custom_attributes"))));
RDebugUtils.currentLine=104202292;
 //BA.debugLineNum = 104202292;BA.debugLine="Dim IDTalla As Int=-1";
_idtalla = (int) (-1);
RDebugUtils.currentLine=104202293;
 //BA.debugLineNum = 104202293;BA.debugLine="Dim UnidadMedida As String";
_unidadmedida = "";
RDebugUtils.currentLine=104202294;
 //BA.debugLineNum = 104202294;BA.debugLine="For Each colcustom_attributes As Map In custom_a";
if (true) break;

case 28:
//for
this.state = 38;
_colcustom_attributes = new anywheresoftware.b4a.objects.collections.Map();
group36 = _custom_attributes;
index36 = 0;
groupLen36 = group36.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 38;
if (index36 < groupLen36) {
this.state = 30;
_colcustom_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group36.Get(index36)));}
if (true) break;

case 61:
//C
this.state = 60;
index36++;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=104202295;
 //BA.debugLineNum = 104202295;BA.debugLine="Log(colcustom_attributes.Get(\"attribute_code\")";
parent.__c.LogImpl("8104202295",BA.ObjectToString(_colcustom_attributes.Get((Object)("attribute_code")))+": "+BA.ObjectToString(_colcustom_attributes.Get((Object)("value"))),0);
RDebugUtils.currentLine=104202296;
 //BA.debugLineNum = 104202296;BA.debugLine="Dim value As String = colcustom_attributes.Get(";
_value = BA.ObjectToString(_colcustom_attributes.Get((Object)("value")));
RDebugUtils.currentLine=104202300;
 //BA.debugLineNum = 104202300;BA.debugLine="Dim attribute_code As String = colcustom_attrib";
_attribute_code = BA.ObjectToString(_colcustom_attributes.Get((Object)("attribute_code")));
RDebugUtils.currentLine=104202301;
 //BA.debugLineNum = 104202301;BA.debugLine="If attribute_code=\"size\" Then";
if (true) break;

case 31:
//if
this.state = 34;
if ((_attribute_code).equals("size")) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=104202302;
 //BA.debugLineNum = 104202302;BA.debugLine="Log(\"size\")";
parent.__c.LogImpl("8104202302","size",0);
RDebugUtils.currentLine=104202303;
 //BA.debugLineNum = 104202303;BA.debugLine="IDTalla=value";
_idtalla = (int)(Double.parseDouble(_value));
 if (true) break;
;
RDebugUtils.currentLine=104202305;
 //BA.debugLineNum = 104202305;BA.debugLine="If attribute_code=\"unidad_medida\" Then";

case 34:
//if
this.state = 37;
if ((_attribute_code).equals("unidad_medida")) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=104202306;
 //BA.debugLineNum = 104202306;BA.debugLine="Log(\"unidad_medida\")";
parent.__c.LogImpl("8104202306","unidad_medida",0);
RDebugUtils.currentLine=104202307;
 //BA.debugLineNum = 104202307;BA.debugLine="UnidadMedida=value";
_unidadmedida = _value;
 if (true) break;

case 37:
//C
this.state = 61;
;
 if (true) break;
if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=104202310;
 //BA.debugLineNum = 104202310;BA.debugLine="colitems.Put(\"IDTalla\",IDTalla)";
_colitems.Put((Object)("IDTalla"),(Object)(_idtalla));
RDebugUtils.currentLine=104202311;
 //BA.debugLineNum = 104202311;BA.debugLine="colitems.Put(\"UnidadMedida\",UnidadMedida)";
_colitems.Put((Object)("UnidadMedida"),(Object)(_unidadmedida));
RDebugUtils.currentLine=104202312;
 //BA.debugLineNum = 104202312;BA.debugLine="Dim attribute_set_id As Int = colitems.Get(\"attr";
_attribute_set_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("attribute_set_id"))));
RDebugUtils.currentLine=104202313;
 //BA.debugLineNum = 104202313;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=104202314;
 //BA.debugLineNum = 104202314;BA.debugLine="Dim price As Int = colitems.Getdefault(\"price\",0";
_price = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("price"),(Object)(0))));
RDebugUtils.currentLine=104202315;
 //BA.debugLineNum = 104202315;BA.debugLine="Dim media_gallery_entries As List = colitems.Get";
_media_gallery_entries = new anywheresoftware.b4a.objects.collections.List();
_media_gallery_entries = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("media_gallery_entries"))));
RDebugUtils.currentLine=104202316;
 //BA.debugLineNum = 104202316;BA.debugLine="For Each colmedia_gallery_entries As Map In medi";
if (true) break;

case 39:
//for
this.state = 46;
_colmedia_gallery_entries = new anywheresoftware.b4a.objects.collections.Map();
group55 = _media_gallery_entries;
index55 = 0;
groupLen55 = group55.getSize();
this.state = 62;
if (true) break;

case 62:
//C
this.state = 46;
if (index55 < groupLen55) {
this.state = 41;
_colmedia_gallery_entries = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group55.Get(index55)));}
if (true) break;

case 63:
//C
this.state = 62;
index55++;
if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=104202317;
 //BA.debugLineNum = 104202317;BA.debugLine="Dim types As List = colmedia_gallery_entries.Ge";
_types = new anywheresoftware.b4a.objects.collections.List();
_types = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colmedia_gallery_entries.Get((Object)("types"))));
RDebugUtils.currentLine=104202318;
 //BA.debugLineNum = 104202318;BA.debugLine="For Each coltypes As String In types";
if (true) break;

case 42:
//for
this.state = 45;
group57 = _types;
index57 = 0;
groupLen57 = group57.getSize();
this.state = 64;
if (true) break;

case 64:
//C
this.state = 45;
if (index57 < groupLen57) {
this.state = 44;
_coltypes = BA.ObjectToString(group57.Get(index57));}
if (true) break;

case 65:
//C
this.state = 64;
index57++;
if (true) break;

case 44:
//C
this.state = 65;
 if (true) break;
if (true) break;

case 45:
//C
this.state = 63;
;
RDebugUtils.currentLine=104202320;
 //BA.debugLineNum = 104202320;BA.debugLine="Dim Fichero As String = colmedia_gallery_entrie";
_fichero = BA.ObjectToString(_colmedia_gallery_entries.Get((Object)("file")));
RDebugUtils.currentLine=104202321;
 //BA.debugLineNum = 104202321;BA.debugLine="Dim media_type As String = colmedia_gallery_ent";
_media_type = BA.ObjectToString(_colmedia_gallery_entries.Get((Object)("media_type")));
RDebugUtils.currentLine=104202322;
 //BA.debugLineNum = 104202322;BA.debugLine="Dim disabled As String = colmedia_gallery_entri";
_disabled = BA.ObjectToString(_colmedia_gallery_entries.Get((Object)("disabled")));
RDebugUtils.currentLine=104202323;
 //BA.debugLineNum = 104202323;BA.debugLine="Dim id As Int = colmedia_gallery_entries.Get(\"i";
_id = (int)(BA.ObjectToNumber(_colmedia_gallery_entries.Get((Object)("id"))));
RDebugUtils.currentLine=104202324;
 //BA.debugLineNum = 104202324;BA.debugLine="Dim label As String = colmedia_gallery_entries.";
_label = BA.ObjectToString(_colmedia_gallery_entries.Get((Object)("label")));
RDebugUtils.currentLine=104202325;
 //BA.debugLineNum = 104202325;BA.debugLine="Dim position As Int = colmedia_gallery_entries.";
_position = (int)(BA.ObjectToNumber(_colmedia_gallery_entries.Get((Object)("position"))));
 if (true) break;
if (true) break;

case 46:
//C
this.state = 47;
;
RDebugUtils.currentLine=104202327;
 //BA.debugLineNum = 104202327;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=104202328;
 //BA.debugLineNum = 104202328;BA.debugLine="Dim options As List = colitems.Get(\"options\")";
_options = new anywheresoftware.b4a.objects.collections.List();
_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("options"))));
RDebugUtils.currentLine=104202329;
 //BA.debugLineNum = 104202329;BA.debugLine="Dim id As Int = colitems.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("id"))));
RDebugUtils.currentLine=104202330;
 //BA.debugLineNum = 104202330;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=104202334;
 //BA.debugLineNum = 104202334;BA.debugLine="Dim product_links As List = colitems.Get(\"produc";
_product_links = new anywheresoftware.b4a.objects.collections.List();
_product_links = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("product_links"))));
RDebugUtils.currentLine=104202335;
 //BA.debugLineNum = 104202335;BA.debugLine="For Each colproduct_links As Map In product_link";
if (true) break;

case 47:
//for
this.state = 50;
_colproduct_links = new anywheresoftware.b4a.objects.collections.Map();
group71 = _product_links;
index71 = 0;
groupLen71 = group71.getSize();
this.state = 66;
if (true) break;

case 66:
//C
this.state = 50;
if (index71 < groupLen71) {
this.state = 49;
_colproduct_links = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group71.Get(index71)));}
if (true) break;

case 67:
//C
this.state = 66;
index71++;
if (true) break;

case 49:
//C
this.state = 67;
RDebugUtils.currentLine=104202336;
 //BA.debugLineNum = 104202336;BA.debugLine="Dim link_type As String = colproduct_links.Get(";
_link_type = BA.ObjectToString(_colproduct_links.Get((Object)("link_type")));
RDebugUtils.currentLine=104202337;
 //BA.debugLineNum = 104202337;BA.debugLine="Dim linked_product_sku As String = colproduct_l";
_linked_product_sku = BA.ObjectToString(_colproduct_links.Get((Object)("linked_product_sku")));
RDebugUtils.currentLine=104202338;
 //BA.debugLineNum = 104202338;BA.debugLine="Dim linked_product_type As String = colproduct_";
_linked_product_type = BA.ObjectToString(_colproduct_links.Get((Object)("linked_product_type")));
RDebugUtils.currentLine=104202339;
 //BA.debugLineNum = 104202339;BA.debugLine="Dim position As Int = colproduct_links.Get(\"pos";
_position = (int)(BA.ObjectToNumber(_colproduct_links.Get((Object)("position"))));
RDebugUtils.currentLine=104202340;
 //BA.debugLineNum = 104202340;BA.debugLine="Dim sku As String = colproduct_links.Get(\"sku\")";
_sku = BA.ObjectToString(_colproduct_links.Get((Object)("sku")));
 if (true) break;
if (true) break;

case 50:
//C
this.state = 55;
;
RDebugUtils.currentLine=104202342;
 //BA.debugLineNum = 104202342;BA.debugLine="Dim status As Int = colitems.Get(\"status\")";
_status = (int)(BA.ObjectToNumber(_colitems.Get((Object)("status"))));
 if (true) break;
if (true) break;

case 51:
//C
this.state = -1;
;
RDebugUtils.currentLine=104202345;
 //BA.debugLineNum = 104202345;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BProductos",_items);
RDebugUtils.currentLine=104202347;
 //BA.debugLineNum = 104202347;BA.debugLine="mSQL.ExecNonQuery($\"update tblB2BProductos set Ta";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(("update tblB2BProductos set Talla=tTallas.Talla\n"+"	from (select value as IDTalla, label as Talla from tblB2BAtributoSizeProducts) tTallas\n"+"	where tblB2BProductos.IDTalla=tTallas.IDTalla\n"+"	"));
RDebugUtils.currentLine=104202352;
 //BA.debugLineNum = 104202352;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
_search_criteria = new anywheresoftware.b4a.objects.collections.Map();
_search_criteria = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("search_criteria"))));
RDebugUtils.currentLine=104202353;
 //BA.debugLineNum = 104202353;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
_filter_groups = new anywheresoftware.b4a.objects.collections.List();
_filter_groups = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_criteria.Get((Object)("filter_groups"))));
RDebugUtils.currentLine=104202354;
 //BA.debugLineNum = 104202354;BA.debugLine="Dim current_page As Int = search_criteria.Getdefa";
_current_page = (int)(BA.ObjectToNumber(_search_criteria.GetDefault((Object)("current_page"),(Object)(0))));
RDebugUtils.currentLine=104202355;
 //BA.debugLineNum = 104202355;BA.debugLine="Dim page_size As Int = search_criteria.Getdefault";
_page_size = (int)(BA.ObjectToNumber(_search_criteria.GetDefault((Object)("page_size"),(Object)(0))));
RDebugUtils.currentLine=104202357;
 //BA.debugLineNum = 104202357;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=104202358;
 //BA.debugLineNum = 104202358;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargavaloresatributosizeproductos(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargavaloresatributosizeproductos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargavaloresatributosizeproductos", null));}
ResumableSub_CargaValoresAtributoSizeProductos rsub = new ResumableSub_CargaValoresAtributoSizeProductos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_CargaValoresAtributoSizeProductos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _sresp = "";
Object _robj = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105316353;
 //BA.debugLineNum = 105316353;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BAtributoSize";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BAtributoSizeProducts");
RDebugUtils.currentLine=105316354;
 //BA.debugLineNum = 105316354;BA.debugLine="wait for(EnvioDatosAPIMagentoValoresAtributoSizeP";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargavaloresatributosizeproductos"), __ref._enviodatosapimagentovaloresatributosizeproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=105316355;
 //BA.debugLineNum = 105316355;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=105316356;
 //BA.debugLineNum = 105316356;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105316357;
 //BA.debugLineNum = 105316357;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargavaloresatributosizeproductos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Valores atributo size (talla) B2B"));
this.state = 6;
return;
case 6:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=105316358;
 //BA.debugLineNum = 105316358;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=105316361;
 //BA.debugLineNum = 105316361;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=105316362;
 //BA.debugLineNum = 105316362;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=105316363;
 //BA.debugLineNum = 105316363;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=105316371;
 //BA.debugLineNum = 105316371;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mSQ";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BAtributoSizeProducts",_root);
RDebugUtils.currentLine=105316372;
 //BA.debugLineNum = 105316372;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=105316373;
 //BA.debugLineNum = 105316373;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentoinformacionproductos(b4j.docU.ctestsinfomagento __ref,String _token) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentoinformacionproductos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentoinformacionproductos", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoInformacionProductos rsub = new ResumableSub_EnvioDatosAPIMagentoInformacionProductos(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoInformacionProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoInformacionProductos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104267778;
 //BA.debugLineNum = 104267778;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=104267779;
 //BA.debugLineNum = 104267779;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=104267784;
 //BA.debugLineNum = 104267784;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/products/?searchCriteria[pageSize] = 0");
RDebugUtils.currentLine=104267790;
 //BA.debugLineNum = 104267790;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=104267792;
 //BA.debugLineNum = 104267792;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=104267793;
 //BA.debugLineNum = 104267793;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=104267795;
 //BA.debugLineNum = 104267795;BA.debugLine="job.GetRequest.Timeout=30000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (30000));
RDebugUtils.currentLine=104267797;
 //BA.debugLineNum = 104267797;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentoinformacionproductos"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=104267799;
 //BA.debugLineNum = 104267799;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=104267800;
 //BA.debugLineNum = 104267800;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8104267800","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=104267801;
 //BA.debugLineNum = 104267801;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8104267801",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=104267802;
 //BA.debugLineNum = 104267802;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=104267803;
 //BA.debugLineNum = 104267803;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104267804;
 //BA.debugLineNum = 104267804;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=104267807;
 //BA.debugLineNum = 104267807;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=104267808;
 //BA.debugLineNum = 104267808;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104267809;
 //BA.debugLineNum = 104267809;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=104267811;
 //BA.debugLineNum = 104267811;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargalistastoresmagento(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargalistastoresmagento", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargalistastoresmagento", null));}
ResumableSub_CargaListaStoresMagento rsub = new ResumableSub_CargaListaStoresMagento(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaListaStoresMagento extends BA.ResumableSub {
public ResumableSub_CargaListaStoresMagento(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _sresp = "";
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _root = null;
anywheresoftware.b4a.objects.collections.Map _colroot = null;
String _code = "";
int _default_store_id = 0;
String _name = "";
int _root_category_id = 0;
int _id = 0;
int _website_id = 0;
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103415809;
 //BA.debugLineNum = 103415809;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BStores\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BStores");
RDebugUtils.currentLine=103415810;
 //BA.debugLineNum = 103415810;BA.debugLine="wait for(EnvioDatosAPIMagentoListaStores(tk)) com";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargalistastoresmagento"), __ref._enviodatosapimagentolistastores /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=103415811;
 //BA.debugLineNum = 103415811;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_sresp.startsWith("ERROR")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=103415812;
 //BA.debugLineNum = 103415812;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=103415814;
 //BA.debugLineNum = 103415814;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=103415815;
 //BA.debugLineNum = 103415815;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=103415816;
 //BA.debugLineNum = 103415816;BA.debugLine="Dim root As List = parser.NextArray";
_root = new anywheresoftware.b4a.objects.collections.List();
_root = _parser.NextArray();
RDebugUtils.currentLine=103415817;
 //BA.debugLineNum = 103415817;BA.debugLine="For Each colroot As Map In root";
if (true) break;

case 5:
//for
this.state = 8;
_colroot = new anywheresoftware.b4a.objects.collections.Map();
group9 = _root;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 10;
if (true) break;

case 10:
//C
this.state = 8;
if (index9 < groupLen9) {
this.state = 7;
_colroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));}
if (true) break;

case 11:
//C
this.state = 10;
index9++;
if (true) break;

case 7:
//C
this.state = 11;
RDebugUtils.currentLine=103415818;
 //BA.debugLineNum = 103415818;BA.debugLine="Dim code As String = colroot.Get(\"code\")";
_code = BA.ObjectToString(_colroot.Get((Object)("code")));
RDebugUtils.currentLine=103415819;
 //BA.debugLineNum = 103415819;BA.debugLine="Dim default_store_id As Int = colroot.Getdefault";
_default_store_id = (int)(BA.ObjectToNumber(_colroot.GetDefault((Object)("default_store_id"),(Object)(-1))));
RDebugUtils.currentLine=103415820;
 //BA.debugLineNum = 103415820;BA.debugLine="Dim name As String = colroot.Get(\"name\")";
_name = BA.ObjectToString(_colroot.Get((Object)("name")));
RDebugUtils.currentLine=103415821;
 //BA.debugLineNum = 103415821;BA.debugLine="Dim root_category_id As Int = colroot.Getdefault";
_root_category_id = (int)(BA.ObjectToNumber(_colroot.GetDefault((Object)("root_category_id"),(Object)(-1))));
RDebugUtils.currentLine=103415822;
 //BA.debugLineNum = 103415822;BA.debugLine="Dim id As Int = colroot.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_colroot.Get((Object)("id"))));
RDebugUtils.currentLine=103415823;
 //BA.debugLineNum = 103415823;BA.debugLine="Dim website_id As Int = colroot.Get(\"website_id\"";
_website_id = (int)(BA.ObjectToNumber(_colroot.Get((Object)("website_id"))));
RDebugUtils.currentLine=103415825;
 //BA.debugLineNum = 103415825;BA.debugLine="Log(\"code: \" & code & \" Name: \" & name & \" ID: \"";
parent.__c.LogImpl("8103415825","code: "+_code+" Name: "+_name+" ID: "+BA.NumberToString(_id),0);
RDebugUtils.currentLine=103415826;
 //BA.debugLineNum = 103415826;BA.debugLine="Log(\" \")";
parent.__c.LogImpl("8103415826"," ",0);
RDebugUtils.currentLine=103415827;
 //BA.debugLineNum = 103415827;BA.debugLine="mSQL.ExecNonQuery2($\"insert into tblB2BStores (c";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2(("insert into tblB2BStores (code, default_store_id, name, root_category_id, id, website_id) values (?,?,?,?,?,?)"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_code),(Object)(_default_store_id),(Object)(_name),(Object)(_root_category_id),(Object)(_id),(Object)(_website_id)}));
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=103415832;
 //BA.debugLineNum = 103415832;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=103415833;
 //BA.debugLineNum = 103415833;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentolistastores(b4j.docU.ctestsinfomagento __ref,String _token) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentolistastores", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentolistastores", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoListaStores rsub = new ResumableSub_EnvioDatosAPIMagentoListaStores(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoListaStores extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoListaStores(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103481346;
 //BA.debugLineNum = 103481346;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=103481347;
 //BA.debugLineNum = 103481347;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=103481350;
 //BA.debugLineNum = 103481350;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/store/storeGroups");
RDebugUtils.currentLine=103481352;
 //BA.debugLineNum = 103481352;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=103481354;
 //BA.debugLineNum = 103481354;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=103481355;
 //BA.debugLineNum = 103481355;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=103481357;
 //BA.debugLineNum = 103481357;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=103481359;
 //BA.debugLineNum = 103481359;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentolistastores"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=103481361;
 //BA.debugLineNum = 103481361;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=103481362;
 //BA.debugLineNum = 103481362;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8103481362","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=103481363;
 //BA.debugLineNum = 103481363;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8103481363",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=103481364;
 //BA.debugLineNum = 103481364;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=103481365;
 //BA.debugLineNum = 103481365;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=103481366;
 //BA.debugLineNum = 103481366;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=103481369;
 //BA.debugLineNum = 103481369;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=103481370;
 //BA.debugLineNum = 103481370;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=103481371;
 //BA.debugLineNum = 103481371;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=103481373;
 //BA.debugLineNum = 103481373;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargapedidos(b4j.docU.ctestsinfomagento __ref) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "cargapedidos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargapedidos", null));}
ResumableSub_CargaPedidos rsub = new ResumableSub_CargaPedidos(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaPedidos extends BA.ResumableSub {
public ResumableSub_CargaPedidos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
boolean _success = false;
String _sresp = "";
Object _robj = null;
anywheresoftware.b4j.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _root = null;
int _total_count = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4a.objects.collections.Map _colitems = null;
anywheresoftware.b4a.objects.collections.Map _extension_attributes = null;
String _po_number = "";
anywheresoftware.b4a.objects.collections.Map _pgw = null;
String _customer_firstname = "";
anywheresoftware.b4a.objects.collections.Map _billing_address = null;
String _firstname = "";
String _address_type = "";
int _customer_address_id = 0;
String _city = "";
String _postcode = "";
int _region_id = 0;
String _telephone = "";
int _entity_id = 0;
String _lastname = "";
int _parent_id = 0;
anywheresoftware.b4a.objects.collections.List _street = null;
String _colstreet = "";
String _region = "";
String _country_id = "";
String _email = "";
String _region_code = "";
double _total_paid = 0;
String _increment_id = "";
anywheresoftware.b4a.objects.collections.Map _payment = null;
double _base_amount_ordered = 0;
double _amount_paid = 0;
String _method = "";
String _cc_last4 = "";
String _account_status = "";
double _amount_ordered = 0;
double _base_amount_paid = 0;
int _shipping_amount = 0;
anywheresoftware.b4a.objects.collections.List _additional_information = null;
String _coladditional_information = "";
int _base_shipping_amount = 0;
String _state = "";
double _base_grand_total = 0;
int _billing_address_id = 0;
String _customer_lastname = "";
int _quote_id = 0;
int _shipping_invoiced = 0;
int _discount_tax_compensation_amount = 0;
int _weight = 0;
int _idpedido = 0;
double _base_total_invoiced = 0;
int _base_subtotal_invoiced = 0;
String _applied_rule_ids = "";
double _subtotal_incl_tax = 0;
int _base_shipping_discount_tax_compensation_amnt = 0;
int _subtotal = 0;
int _base_shipping_incl_tax = 0;
String _customer_email = "";
int _base_discount_invoiced = 0;
double _total_invoiced = 0;
int _base_to_global_rate = 0;
int _customer_is_guest = 0;
double _tax_amount = 0;
double _tax_invoiced = 0;
int _original_price = 0;
int _free_shipping = 0;
int _base_discount_tax_compensation_invoiced = 0;
int _discount_amount = 0;
double _tax_percent = 0;
double _price_incl_tax = 0;
int _price = 0;
int _product_id = 0;
int _base_row_total = 0;
String _sku = "";
int _base_original_price = 0;
int _row_weight = 0;
int _base_amount_refunded = 0;
double _base_price_incl_tax = 0;
int _no_discount = 0;
String _name = "";
int _discount_percent = 0;
int _order_id = 0;
int _discount_tax_compensation_invoiced = 0;
String _created_at = "";
int _qty_shipped = 0;
int _qty_ordered = 0;
int _row_total = 0;
int _qty_canceled = 0;
anywheresoftware.b4a.objects.collections.Map _product_option = null;
String _talla = "";
anywheresoftware.b4a.objects.collections.List _configurable_item_options = null;
anywheresoftware.b4a.objects.collections.Map _colconfigurable_item_options = null;
int _option_value = 0;
String _option_id = "";
int _amount_refunded = 0;
String _updated_at = "";
int _base_price = 0;
int _qty_invoiced = 0;
int _row_invoiced = 0;
double _row_total_incl_tax = 0;
double _base_tax_amount = 0;
int _store_id = 0;
int _item_id = 0;
int _base_discount_amount = 0;
double _base_row_total_incl_tax = 0;
int _base_discount_tax_compensation_amount = 0;
String _product_type = "";
int _qty_refunded = 0;
int _base_row_invoiced = 0;
int _is_qty_decimal = 0;
int _discount_invoiced = 0;
double _base_tax_invoiced = 0;
String _global_currency_code = "";
String _status = "";
int _is_virtual = 0;
int _base_total_invoiced_cost = 0;
anywheresoftware.b4a.objects.collections.List _status_histories = null;
String _store_currency_code = "";
int _total_item_count = 0;
int _shipping_tax_amount = 0;
int _store_to_base_rate = 0;
int _base_shipping_discount_amount = 0;
String _store_name = "";
double _grand_total = 0;
String _base_currency_code = "";
double _base_total_paid = 0;
int _shipping_discount_tax_compensation_amount = 0;
int _total_due = 0;
int _total_qty_ordered = 0;
anywheresoftware.b4a.objects.collections.List _shipping_assignments = null;
anywheresoftware.b4a.objects.collections.List _payment_additional_info = null;
anywheresoftware.b4a.objects.collections.Map _colpayment_additional_info = null;
String _value = "";
String _key = "";
anywheresoftware.b4a.objects.collections.List _applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colapplied_taxes = null;
double _amount = 0;
String _code = "";
double _base_amount = 0;
String _title = "";
double _percent = 0;
anywheresoftware.b4a.objects.collections.List _item_applied_taxes = null;
anywheresoftware.b4a.objects.collections.Map _colitem_applied_taxes = null;
String _type = "";
String _converting_from_quote = "";
String _shipping_description = "";
int _store_to_order_rate = 0;
int _subtotal_invoiced = 0;
int _base_to_order_rate = 0;
int _base_subtotal = 0;
String _protect_code = "";
String _customer_dob = "";
int _base_total_due = 0;
double _base_subtotal_incl_tax = 0;
int _customer_id = 0;
int _customer_group_id = 0;
String _order_currency_code = "";
int _customer_gender = 0;
int _shipping_incl_tax = 0;
int _base_shipping_invoiced = 0;
anywheresoftware.b4a.objects.collections.Map _search_criteria = null;
anywheresoftware.b4a.objects.collections.List _filter_groups = null;
int _page_size = 0;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
anywheresoftware.b4a.BA.IterableList group40;
int index40;
int groupLen40;
anywheresoftware.b4a.BA.IterableList group60;
int index60;
int groupLen60;
anywheresoftware.b4a.BA.IterableList group88;
int index88;
int groupLen88;
anywheresoftware.b4a.BA.IterableList group125;
int index125;
int groupLen125;
anywheresoftware.b4a.BA.IterableList group183;
int index183;
int groupLen183;
anywheresoftware.b4a.BA.IterableList group190;
int index190;
int groupLen190;
anywheresoftware.b4a.BA.IterableList group200;
int index200;
int groupLen200;
anywheresoftware.b4a.BA.IterableList group202;
int index202;
int groupLen202;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105512962;
 //BA.debugLineNum = 105512962;BA.debugLine="wait for(CargaValoresAtributoSizeProductos) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargapedidos"), __ref._cargavaloresatributosizeproductos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 83;
return;
case 83:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=105512963;
 //BA.debugLineNum = 105512963;BA.debugLine="If Not(Success) Then Return False";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Not(_success)) { 
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
RDebugUtils.currentLine=105512965;
 //BA.debugLineNum = 105512965;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblB2BOrders\")";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblB2BOrders");
RDebugUtils.currentLine=105512966;
 //BA.debugLineNum = 105512966;BA.debugLine="wait for(EnvioDatosAPIMagentoInformacionPedidos(t";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargapedidos"), __ref._enviodatosapimagentoinformacionpedidos /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._tk /*String*/ ));
this.state = 84;
return;
case 84:
//C
this.state = 7;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=105512967;
 //BA.debugLineNum = 105512967;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_sresp.startsWith("ERROR")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=105512968;
 //BA.debugLineNum = 105512968;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105512969;
 //BA.debugLineNum = 105512969;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "cargapedidos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Pedidos B2B"));
this.state = 85;
return;
case 85:
//C
this.state = 10;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=105512970;
 //BA.debugLineNum = 105512970;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=105512973;
 //BA.debugLineNum = 105512973;BA.debugLine="TextAreaHTTPResponse.Text=sResp";
__ref._textareahttpresponse /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(_sresp);
RDebugUtils.currentLine=105512975;
 //BA.debugLineNum = 105512975;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=105512976;
 //BA.debugLineNum = 105512976;BA.debugLine="parser.Initialize(sResp)";
_parser.Initialize(_sresp);
RDebugUtils.currentLine=105512977;
 //BA.debugLineNum = 105512977;BA.debugLine="Dim root As Map = parser.NextObject";
_root = new anywheresoftware.b4a.objects.collections.Map();
_root = _parser.NextObject();
RDebugUtils.currentLine=105512978;
 //BA.debugLineNum = 105512978;BA.debugLine="Dim total_count As Int = root.Get(\"total_count\")";
_total_count = (int)(BA.ObjectToNumber(_root.Get((Object)("total_count"))));
RDebugUtils.currentLine=105512979;
 //BA.debugLineNum = 105512979;BA.debugLine="Dim items As List = root.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_root.Get((Object)("items"))));
RDebugUtils.currentLine=105512980;
 //BA.debugLineNum = 105512980;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 11:
//for
this.state = 82;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group16 = _items;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 86;
if (true) break;

case 86:
//C
this.state = 82;
if (index16 < groupLen16) {
this.state = 13;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group16.Get(index16)));}
if (true) break;

case 87:
//C
this.state = 86;
index16++;
if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=105512981;
 //BA.debugLineNum = 105512981;BA.debugLine="Log(\"ColItems: \" & colitems)";
parent.__c.LogImpl("8105512981","ColItems: "+BA.ObjectToString(_colitems),0);
RDebugUtils.currentLine=105512987;
 //BA.debugLineNum = 105512987;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=105512988;
 //BA.debugLineNum = 105512988;BA.debugLine="Dim po_number As String";
_po_number = "";
RDebugUtils.currentLine=105512989;
 //BA.debugLineNum = 105512989;BA.debugLine="If extension_attributes.IsInitialized Then";
if (true) break;

case 14:
//if
this.state = 21;
if (_extension_attributes.IsInitialized()) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=105512990;
 //BA.debugLineNum = 105512990;BA.debugLine="Dim pgw As Map=extension_attributes.Get(\"pgw\")";
_pgw = new anywheresoftware.b4a.objects.collections.Map();
_pgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_extension_attributes.Get((Object)("pgw"))));
RDebugUtils.currentLine=105512991;
 //BA.debugLineNum = 105512991;BA.debugLine="If pgw.IsInitialized Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_pgw.IsInitialized()) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=105512992;
 //BA.debugLineNum = 105512992;BA.debugLine="po_number=pgw.Getdefault(\"po_number\",\"\")";
_po_number = BA.ObjectToString(_pgw.GetDefault((Object)("po_number"),(Object)("")));
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
RDebugUtils.currentLine=105513004;
 //BA.debugLineNum = 105513004;BA.debugLine="colitems.put(\"po_number\",po_number)";
_colitems.Put((Object)("po_number"),(Object)(_po_number));
RDebugUtils.currentLine=105513005;
 //BA.debugLineNum = 105513005;BA.debugLine="Dim customer_firstname As String = colitems.Get(";
_customer_firstname = BA.ObjectToString(_colitems.Get((Object)("customer_firstname")));
RDebugUtils.currentLine=105513007;
 //BA.debugLineNum = 105513007;BA.debugLine="Dim billing_address As Map = colitems.Get(\"billi";
_billing_address = new anywheresoftware.b4a.objects.collections.Map();
_billing_address = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("billing_address"))));
RDebugUtils.currentLine=105513008;
 //BA.debugLineNum = 105513008;BA.debugLine="Dim firstname As String = billing_address.Get(\"f";
_firstname = BA.ObjectToString(_billing_address.Get((Object)("firstname")));
RDebugUtils.currentLine=105513009;
 //BA.debugLineNum = 105513009;BA.debugLine="Dim address_type As String = billing_address.Get";
_address_type = BA.ObjectToString(_billing_address.Get((Object)("address_type")));
RDebugUtils.currentLine=105513010;
 //BA.debugLineNum = 105513010;BA.debugLine="Dim customer_address_id As Int = billing_address";
_customer_address_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("customer_address_id"),(Object)(-1))));
RDebugUtils.currentLine=105513011;
 //BA.debugLineNum = 105513011;BA.debugLine="Dim city As String = billing_address.Get(\"city\")";
_city = BA.ObjectToString(_billing_address.Get((Object)("city")));
RDebugUtils.currentLine=105513012;
 //BA.debugLineNum = 105513012;BA.debugLine="Dim postcode As String = billing_address.Get(\"po";
_postcode = BA.ObjectToString(_billing_address.Get((Object)("postcode")));
RDebugUtils.currentLine=105513013;
 //BA.debugLineNum = 105513013;BA.debugLine="Dim region_id As Int = billing_address.Getdefaul";
_region_id = (int)(BA.ObjectToNumber(_billing_address.GetDefault((Object)("region_id"),(Object)(0))));
RDebugUtils.currentLine=105513014;
 //BA.debugLineNum = 105513014;BA.debugLine="Dim telephone As String = billing_address.Get(\"t";
_telephone = BA.ObjectToString(_billing_address.Get((Object)("telephone")));
RDebugUtils.currentLine=105513015;
 //BA.debugLineNum = 105513015;BA.debugLine="Dim entity_id As Int = billing_address.Get(\"enti";
_entity_id = (int)(BA.ObjectToNumber(_billing_address.Get((Object)("entity_id"))));
RDebugUtils.currentLine=105513016;
 //BA.debugLineNum = 105513016;BA.debugLine="Dim lastname As String = billing_address.Get(\"la";
_lastname = BA.ObjectToString(_billing_address.Get((Object)("lastname")));
RDebugUtils.currentLine=105513017;
 //BA.debugLineNum = 105513017;BA.debugLine="Dim parent_id As Int = billing_address.Get(\"pare";
_parent_id = (int)(BA.ObjectToNumber(_billing_address.Get((Object)("parent_id"))));
RDebugUtils.currentLine=105513018;
 //BA.debugLineNum = 105513018;BA.debugLine="Dim street As List = billing_address.Get(\"street";
_street = new anywheresoftware.b4a.objects.collections.List();
_street = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_billing_address.Get((Object)("street"))));
RDebugUtils.currentLine=105513019;
 //BA.debugLineNum = 105513019;BA.debugLine="For Each colstreet As String In street";
if (true) break;

case 22:
//for
this.state = 25;
group40 = _street;
index40 = 0;
groupLen40 = group40.getSize();
this.state = 88;
if (true) break;

case 88:
//C
this.state = 25;
if (index40 < groupLen40) {
this.state = 24;
_colstreet = BA.ObjectToString(group40.Get(index40));}
if (true) break;

case 89:
//C
this.state = 88;
index40++;
if (true) break;

case 24:
//C
this.state = 89;
RDebugUtils.currentLine=105513020;
 //BA.debugLineNum = 105513020;BA.debugLine="Log(\"colstreet:\" & colstreet)";
parent.__c.LogImpl("8105513020","colstreet:"+_colstreet,0);
 if (true) break;
if (true) break;

case 25:
//C
this.state = 26;
;
RDebugUtils.currentLine=105513022;
 //BA.debugLineNum = 105513022;BA.debugLine="Dim region As String = billing_address.Get(\"regi";
_region = BA.ObjectToString(_billing_address.Get((Object)("region")));
RDebugUtils.currentLine=105513023;
 //BA.debugLineNum = 105513023;BA.debugLine="Dim country_id As String = billing_address.Get(\"";
_country_id = BA.ObjectToString(_billing_address.Get((Object)("country_id")));
RDebugUtils.currentLine=105513024;
 //BA.debugLineNum = 105513024;BA.debugLine="Dim email As String = billing_address.Get(\"email";
_email = BA.ObjectToString(_billing_address.Get((Object)("email")));
RDebugUtils.currentLine=105513025;
 //BA.debugLineNum = 105513025;BA.debugLine="Dim region_code As String = billing_address.Get(";
_region_code = BA.ObjectToString(_billing_address.Get((Object)("region_code")));
RDebugUtils.currentLine=105513026;
 //BA.debugLineNum = 105513026;BA.debugLine="Dim total_paid As Double = colitems.Getdefault(\"";
_total_paid = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_paid"),(Object)(0))));
RDebugUtils.currentLine=105513027;
 //BA.debugLineNum = 105513027;BA.debugLine="Dim increment_id As String = colitems.Get(\"incre";
_increment_id = BA.ObjectToString(_colitems.Get((Object)("increment_id")));
RDebugUtils.currentLine=105513028;
 //BA.debugLineNum = 105513028;BA.debugLine="Dim payment As Map = colitems.Get(\"payment\")";
_payment = new anywheresoftware.b4a.objects.collections.Map();
_payment = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("payment"))));
RDebugUtils.currentLine=105513029;
 //BA.debugLineNum = 105513029;BA.debugLine="Dim base_amount_ordered As Double = payment.Getd";
_base_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=105513030;
 //BA.debugLineNum = 105513030;BA.debugLine="Dim amount_paid As Double = payment.Getdefault(\"";
_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_paid"),(Object)(0))));
RDebugUtils.currentLine=105513031;
 //BA.debugLineNum = 105513031;BA.debugLine="Dim method As String = payment.Get(\"method\")";
_method = BA.ObjectToString(_payment.Get((Object)("method")));
RDebugUtils.currentLine=105513032;
 //BA.debugLineNum = 105513032;BA.debugLine="Dim cc_last4 As String = payment.Get(\"cc_last4\")";
_cc_last4 = BA.ObjectToString(_payment.Get((Object)("cc_last4")));
RDebugUtils.currentLine=105513034;
 //BA.debugLineNum = 105513034;BA.debugLine="Dim account_status As String = payment.Get(\"acco";
_account_status = BA.ObjectToString(_payment.Get((Object)("account_status")));
RDebugUtils.currentLine=105513035;
 //BA.debugLineNum = 105513035;BA.debugLine="Dim amount_ordered As Double = payment.Getdefaul";
_amount_ordered = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("amount_ordered"),(Object)(0))));
RDebugUtils.currentLine=105513036;
 //BA.debugLineNum = 105513036;BA.debugLine="Dim entity_id As Int = payment.Get(\"entity_id\")";
_entity_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("entity_id"))));
RDebugUtils.currentLine=105513037;
 //BA.debugLineNum = 105513037;BA.debugLine="Dim base_amount_paid As Double = payment.Getdefa";
_base_amount_paid = (double)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_amount_paid"),(Object)(0))));
RDebugUtils.currentLine=105513038;
 //BA.debugLineNum = 105513038;BA.debugLine="Dim shipping_amount As Int = payment.Getdefault(";
_shipping_amount = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=105513039;
 //BA.debugLineNum = 105513039;BA.debugLine="Dim additional_information As List = payment.Get";
_additional_information = new anywheresoftware.b4a.objects.collections.List();
_additional_information = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_payment.Get((Object)("additional_information"))));
RDebugUtils.currentLine=105513040;
 //BA.debugLineNum = 105513040;BA.debugLine="For Each coladditional_information As String In";
if (true) break;

case 26:
//for
this.state = 29;
group60 = _additional_information;
index60 = 0;
groupLen60 = group60.getSize();
this.state = 90;
if (true) break;

case 90:
//C
this.state = 29;
if (index60 < groupLen60) {
this.state = 28;
_coladditional_information = BA.ObjectToString(group60.Get(index60));}
if (true) break;

case 91:
//C
this.state = 90;
index60++;
if (true) break;

case 28:
//C
this.state = 91;
 if (true) break;
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=105513042;
 //BA.debugLineNum = 105513042;BA.debugLine="Dim base_shipping_amount As Int = payment.Getdef";
_base_shipping_amount = (int)(BA.ObjectToNumber(_payment.GetDefault((Object)("base_shipping_amount"),(Object)(0))));
RDebugUtils.currentLine=105513043;
 //BA.debugLineNum = 105513043;BA.debugLine="Dim parent_id As Int = payment.Get(\"parent_id\")";
_parent_id = (int)(BA.ObjectToNumber(_payment.Get((Object)("parent_id"))));
RDebugUtils.currentLine=105513045;
 //BA.debugLineNum = 105513045;BA.debugLine="Dim state As String = colitems.Get(\"state\")";
_state = BA.ObjectToString(_colitems.Get((Object)("state")));
RDebugUtils.currentLine=105513047;
 //BA.debugLineNum = 105513047;BA.debugLine="Dim base_grand_total As Double = colitems.Get(\"b";
_base_grand_total = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_grand_total"))));
RDebugUtils.currentLine=105513048;
 //BA.debugLineNum = 105513048;BA.debugLine="Dim billing_address_id As Int = colitems.Get(\"bi";
_billing_address_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("billing_address_id"))));
RDebugUtils.currentLine=105513049;
 //BA.debugLineNum = 105513049;BA.debugLine="Dim customer_lastname As String = colitems.Get(\"";
_customer_lastname = BA.ObjectToString(_colitems.Get((Object)("customer_lastname")));
RDebugUtils.currentLine=105513050;
 //BA.debugLineNum = 105513050;BA.debugLine="Dim quote_id As Int = colitems.Getdefault(\"quote";
_quote_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("quote_id"),(Object)(0))));
RDebugUtils.currentLine=105513051;
 //BA.debugLineNum = 105513051;BA.debugLine="Dim shipping_invoiced As Int = colitems.Getdefau";
_shipping_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=105513052;
 //BA.debugLineNum = 105513052;BA.debugLine="Dim discount_tax_compensation_amount As Int = co";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=105513053;
 //BA.debugLineNum = 105513053;BA.debugLine="Dim weight As Int = colitems.Getdefault(\"weight\"";
_weight = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("weight"),(Object)(0))));
RDebugUtils.currentLine=105513054;
 //BA.debugLineNum = 105513054;BA.debugLine="Dim entity_id As Int = colitems.Get(\"entity_id\")";
_entity_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("entity_id"))));
RDebugUtils.currentLine=105513055;
 //BA.debugLineNum = 105513055;BA.debugLine="Dim IDPedido As Int = colitems.Get(\"entity_id\")";
_idpedido = (int)(BA.ObjectToNumber(_colitems.Get((Object)("entity_id"))));
RDebugUtils.currentLine=105513056;
 //BA.debugLineNum = 105513056;BA.debugLine="Dim base_total_invoiced As Double = colitems.Get";
_base_total_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513057;
 //BA.debugLineNum = 105513057;BA.debugLine="Dim base_shipping_amount As Int = colitems.Get(\"";
_base_shipping_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_shipping_amount"))));
RDebugUtils.currentLine=105513058;
 //BA.debugLineNum = 105513058;BA.debugLine="Dim base_subtotal_invoiced As Int = colitems.Get";
_base_subtotal_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_subtotal_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513059;
 //BA.debugLineNum = 105513059;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"a";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=105513060;
 //BA.debugLineNum = 105513060;BA.debugLine="Dim subtotal_incl_tax As Double = colitems.Getde";
_subtotal_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("subtotal_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=105513061;
 //BA.debugLineNum = 105513061;BA.debugLine="Dim base_shipping_discount_tax_compensation_amnt";
_base_shipping_discount_tax_compensation_amnt = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_shipping_discount_tax_compensation_amnt"),(Object)(0))));
RDebugUtils.currentLine=105513062;
 //BA.debugLineNum = 105513062;BA.debugLine="Dim subtotal As Int = colitems.Get(\"subtotal\")";
_subtotal = (int)(BA.ObjectToNumber(_colitems.Get((Object)("subtotal"))));
RDebugUtils.currentLine=105513063;
 //BA.debugLineNum = 105513063;BA.debugLine="Dim base_shipping_incl_tax As Int = colitems.Get";
_base_shipping_incl_tax = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_shipping_incl_tax"),(Object)(0))));
RDebugUtils.currentLine=105513064;
 //BA.debugLineNum = 105513064;BA.debugLine="Dim customer_email As String = colitems.Get(\"cus";
_customer_email = BA.ObjectToString(_colitems.Get((Object)("customer_email")));
RDebugUtils.currentLine=105513065;
 //BA.debugLineNum = 105513065;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Get";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513066;
 //BA.debugLineNum = 105513066;BA.debugLine="Dim total_invoiced As Double = colitems.Getdefau";
_total_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513067;
 //BA.debugLineNum = 105513067;BA.debugLine="Dim base_to_global_rate As Int = colitems.Get(\"b";
_base_to_global_rate = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_to_global_rate"))));
RDebugUtils.currentLine=105513068;
 //BA.debugLineNum = 105513068;BA.debugLine="Dim customer_is_guest As Int = colitems.Get(\"cus";
_customer_is_guest = (int)(BA.ObjectToNumber(_colitems.Get((Object)("customer_is_guest"))));
RDebugUtils.currentLine=105513069;
 //BA.debugLineNum = 105513069;BA.debugLine="Dim items As List = colitems.Get(\"items\")";
_items = new anywheresoftware.b4a.objects.collections.List();
_items = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("items"))));
RDebugUtils.currentLine=105513070;
 //BA.debugLineNum = 105513070;BA.debugLine="For Each colitems As Map In items";
if (true) break;

case 30:
//for
this.state = 45;
_colitems = new anywheresoftware.b4a.objects.collections.Map();
group88 = _items;
index88 = 0;
groupLen88 = group88.getSize();
this.state = 92;
if (true) break;

case 92:
//C
this.state = 45;
if (index88 < groupLen88) {
this.state = 32;
_colitems = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group88.Get(index88)));}
if (true) break;

case 93:
//C
this.state = 92;
index88++;
if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=105513071;
 //BA.debugLineNum = 105513071;BA.debugLine="colitems.Put(\"po_number\",po_number)";
_colitems.Put((Object)("po_number"),(Object)(_po_number));
RDebugUtils.currentLine=105513072;
 //BA.debugLineNum = 105513072;BA.debugLine="Dim tax_amount As Double = colitems.Getdefault(";
_tax_amount = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_amount"),(Object)(0))));
RDebugUtils.currentLine=105513073;
 //BA.debugLineNum = 105513073;BA.debugLine="Dim tax_invoiced As Double = colitems.Get(\"tax_";
_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("tax_invoiced"))));
RDebugUtils.currentLine=105513074;
 //BA.debugLineNum = 105513074;BA.debugLine="Dim original_price As Int = colitems.Get(\"origi";
_original_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("original_price"))));
RDebugUtils.currentLine=105513075;
 //BA.debugLineNum = 105513075;BA.debugLine="Dim free_shipping As Int = colitems.Get(\"free_s";
_free_shipping = (int)(BA.ObjectToNumber(_colitems.Get((Object)("free_shipping"))));
RDebugUtils.currentLine=105513076;
 //BA.debugLineNum = 105513076;BA.debugLine="Dim base_discount_tax_compensation_invoiced As";
_base_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513077;
 //BA.debugLineNum = 105513077;BA.debugLine="Dim discount_amount As Int = colitems.Getdefaul";
_discount_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_amount"),(Object)(0))));
RDebugUtils.currentLine=105513078;
 //BA.debugLineNum = 105513078;BA.debugLine="Dim tax_percent As Double = colitems.Getdefault";
_tax_percent = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("tax_percent"),(Object)(0))));
RDebugUtils.currentLine=105513079;
 //BA.debugLineNum = 105513079;BA.debugLine="Dim price_incl_tax As Double = Utilidades.FixNu";
_price_incl_tax = parent._utilidades._fixnulldouble /*double*/ (_colitems.GetDefault((Object)("price_incl_tax"),(Object)(0)));
RDebugUtils.currentLine=105513080;
 //BA.debugLineNum = 105513080;BA.debugLine="Dim price As Int = colitems.Get(\"price\")";
_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("price"))));
RDebugUtils.currentLine=105513081;
 //BA.debugLineNum = 105513081;BA.debugLine="Dim product_id As Int = colitems.Getdefault(\"pr";
_product_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("product_id"),(Object)(-1))));
RDebugUtils.currentLine=105513082;
 //BA.debugLineNum = 105513082;BA.debugLine="Dim base_row_total As Int = colitems.Get(\"base_";
_base_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total"))));
RDebugUtils.currentLine=105513083;
 //BA.debugLineNum = 105513083;BA.debugLine="Dim sku As String = colitems.Get(\"sku\")";
_sku = BA.ObjectToString(_colitems.Get((Object)("sku")));
RDebugUtils.currentLine=105513084;
 //BA.debugLineNum = 105513084;BA.debugLine="Dim discount_tax_compensation_amount As Int = c";
_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_amount"),(Object)(0))));
RDebugUtils.currentLine=105513085;
 //BA.debugLineNum = 105513085;BA.debugLine="Dim weight As Int = colitems.Getdefault(\"weight";
_weight = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("weight"),(Object)(-1))));
RDebugUtils.currentLine=105513086;
 //BA.debugLineNum = 105513086;BA.debugLine="Dim base_original_price As Int = colitems.GetDE";
_base_original_price = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_original_price"),(Object)(0))));
RDebugUtils.currentLine=105513087;
 //BA.debugLineNum = 105513087;BA.debugLine="Dim row_weight As Int = colitems.Get(\"row_weigh";
_row_weight = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_weight"))));
RDebugUtils.currentLine=105513088;
 //BA.debugLineNum = 105513088;BA.debugLine="Dim applied_rule_ids As String = colitems.Get(\"";
_applied_rule_ids = BA.ObjectToString(_colitems.Get((Object)("applied_rule_ids")));
RDebugUtils.currentLine=105513089;
 //BA.debugLineNum = 105513089;BA.debugLine="Dim base_amount_refunded As Int = colitems.Get(";
_base_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_amount_refunded"))));
RDebugUtils.currentLine=105513090;
 //BA.debugLineNum = 105513090;BA.debugLine="Dim base_price_incl_tax As Double = colitems.Ge";
_base_price_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_price_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=105513091;
 //BA.debugLineNum = 105513091;BA.debugLine="Dim no_discount As Int = colitems.Get(\"no_disco";
_no_discount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("no_discount"))));
RDebugUtils.currentLine=105513092;
 //BA.debugLineNum = 105513092;BA.debugLine="Dim name As String = colitems.Get(\"name\")";
_name = BA.ObjectToString(_colitems.Get((Object)("name")));
RDebugUtils.currentLine=105513093;
 //BA.debugLineNum = 105513093;BA.debugLine="Dim base_discount_invoiced As Int = colitems.Ge";
_base_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_invoiced"))));
RDebugUtils.currentLine=105513094;
 //BA.debugLineNum = 105513094;BA.debugLine="Dim discount_percent As Int = colitems.Getdefau";
_discount_percent = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_percent"),(Object)(0))));
RDebugUtils.currentLine=105513095;
 //BA.debugLineNum = 105513095;BA.debugLine="Dim order_id As Int = colitems.Get(\"order_id\")";
_order_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("order_id"))));
RDebugUtils.currentLine=105513096;
 //BA.debugLineNum = 105513096;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513097;
 //BA.debugLineNum = 105513097;BA.debugLine="Dim created_at As String = colitems.Get(\"create";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=105513098;
 //BA.debugLineNum = 105513098;BA.debugLine="Dim qty_shipped As Int = colitems.Get(\"qty_ship";
_qty_shipped = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_shipped"))));
RDebugUtils.currentLine=105513099;
 //BA.debugLineNum = 105513099;BA.debugLine="Dim qty_ordered As Int = colitems.Get(\"qty_orde";
_qty_ordered = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_ordered"))));
RDebugUtils.currentLine=105513100;
 //BA.debugLineNum = 105513100;BA.debugLine="Dim row_total As Int = colitems.Get(\"row_total\"";
_row_total = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_total"))));
RDebugUtils.currentLine=105513101;
 //BA.debugLineNum = 105513101;BA.debugLine="Dim qty_canceled As Int = colitems.Get(\"qty_can";
_qty_canceled = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_canceled"))));
RDebugUtils.currentLine=105513102;
 //BA.debugLineNum = 105513102;BA.debugLine="Dim product_option As Map = colitems.Get(\"produ";
_product_option = new anywheresoftware.b4a.objects.collections.Map();
_product_option = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("product_option"))));
RDebugUtils.currentLine=105513103;
 //BA.debugLineNum = 105513103;BA.debugLine="Dim Talla As String";
_talla = "";
RDebugUtils.currentLine=105513104;
 //BA.debugLineNum = 105513104;BA.debugLine="If product_option.IsInitialized Then";
if (true) break;

case 33:
//if
this.state = 44;
if (_product_option.IsInitialized()) { 
this.state = 35;
}if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=105513105;
 //BA.debugLineNum = 105513105;BA.debugLine="Dim extension_attributes As Map = product_opti";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_product_option.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=105513106;
 //BA.debugLineNum = 105513106;BA.debugLine="Dim configurable_item_options As List = extens";
_configurable_item_options = new anywheresoftware.b4a.objects.collections.List();
_configurable_item_options = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("configurable_item_options"))));
RDebugUtils.currentLine=105513107;
 //BA.debugLineNum = 105513107;BA.debugLine="For Each colconfigurable_item_options As Map I";
if (true) break;

case 36:
//for
this.state = 43;
_colconfigurable_item_options = new anywheresoftware.b4a.objects.collections.Map();
group125 = _configurable_item_options;
index125 = 0;
groupLen125 = group125.getSize();
this.state = 94;
if (true) break;

case 94:
//C
this.state = 43;
if (index125 < groupLen125) {
this.state = 38;
_colconfigurable_item_options = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group125.Get(index125)));}
if (true) break;

case 95:
//C
this.state = 94;
index125++;
if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=105513108;
 //BA.debugLineNum = 105513108;BA.debugLine="Dim option_value As Int = colconfigurable_ite";
_option_value = (int)(BA.ObjectToNumber(_colconfigurable_item_options.Get((Object)("option_value"))));
RDebugUtils.currentLine=105513109;
 //BA.debugLineNum = 105513109;BA.debugLine="Dim option_id As String = colconfigurable_ite";
_option_id = BA.ObjectToString(_colconfigurable_item_options.Get((Object)("option_id")));
RDebugUtils.currentLine=105513110;
 //BA.debugLineNum = 105513110;BA.debugLine="If option_id=142 Then";
if (true) break;

case 39:
//if
this.state = 42;
if ((_option_id).equals(BA.NumberToString(142))) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=105513111;
 //BA.debugLineNum = 105513111;BA.debugLine="Talla=mSQL.ExecQuerySingleResult2(\"select la";
_talla = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("select label from tblB2BAtributoSizeProducts where value=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.NumberToString(_option_value)}));
 if (true) break;

case 42:
//C
this.state = 95;
;
 if (true) break;
if (true) break;

case 43:
//C
this.state = 44;
;
 if (true) break;

case 44:
//C
this.state = 93;
;
RDebugUtils.currentLine=105513115;
 //BA.debugLineNum = 105513115;BA.debugLine="colitems.Put(\"Talla\",Talla)";
_colitems.Put((Object)("Talla"),(Object)(_talla));
RDebugUtils.currentLine=105513116;
 //BA.debugLineNum = 105513116;BA.debugLine="Dim amount_refunded As Int = colitems.Get(\"amou";
_amount_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("amount_refunded"))));
RDebugUtils.currentLine=105513117;
 //BA.debugLineNum = 105513117;BA.debugLine="Dim updated_at As String = colitems.Get(\"update";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=105513118;
 //BA.debugLineNum = 105513118;BA.debugLine="Dim base_price As Int = colitems.Get(\"base_pric";
_base_price = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_price"))));
RDebugUtils.currentLine=105513119;
 //BA.debugLineNum = 105513119;BA.debugLine="Dim qty_invoiced As Int = colitems.Get(\"qty_inv";
_qty_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_invoiced"))));
RDebugUtils.currentLine=105513120;
 //BA.debugLineNum = 105513120;BA.debugLine="Dim row_invoiced As Int = colitems.Get(\"row_inv";
_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("row_invoiced"))));
RDebugUtils.currentLine=105513121;
 //BA.debugLineNum = 105513121;BA.debugLine="Dim row_total_incl_tax As Double = colitems.Get";
_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("row_total_incl_tax"))));
RDebugUtils.currentLine=105513122;
 //BA.debugLineNum = 105513122;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"b";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=105513123;
 //BA.debugLineNum = 105513123;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"stor";
_store_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_id"),(Object)(0))));
RDebugUtils.currentLine=105513124;
 //BA.debugLineNum = 105513124;BA.debugLine="Dim item_id As Int = colitems.Get(\"item_id\")";
_item_id = (int)(BA.ObjectToNumber(_colitems.Get((Object)("item_id"))));
RDebugUtils.currentLine=105513125;
 //BA.debugLineNum = 105513125;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=105513126;
 //BA.debugLineNum = 105513126;BA.debugLine="Dim base_row_total_incl_tax As Double = colitem";
_base_row_total_incl_tax = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_total_incl_tax"))));
RDebugUtils.currentLine=105513127;
 //BA.debugLineNum = 105513127;BA.debugLine="Dim base_discount_tax_compensation_amount As In";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=105513128;
 //BA.debugLineNum = 105513128;BA.debugLine="Dim product_type As String = colitems.Get(\"prod";
_product_type = BA.ObjectToString(_colitems.Get((Object)("product_type")));
RDebugUtils.currentLine=105513129;
 //BA.debugLineNum = 105513129;BA.debugLine="Dim qty_refunded As Int = colitems.Get(\"qty_ref";
_qty_refunded = (int)(BA.ObjectToNumber(_colitems.Get((Object)("qty_refunded"))));
RDebugUtils.currentLine=105513130;
 //BA.debugLineNum = 105513130;BA.debugLine="Dim base_row_invoiced As Int = colitems.Get(\"ba";
_base_row_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_row_invoiced"))));
RDebugUtils.currentLine=105513131;
 //BA.debugLineNum = 105513131;BA.debugLine="Dim is_qty_decimal As Int = colitems.Getdefault";
_is_qty_decimal = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("is_qty_decimal"),(Object)(0))));
RDebugUtils.currentLine=105513132;
 //BA.debugLineNum = 105513132;BA.debugLine="Dim discount_invoiced As Int = colitems.Get(\"di";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.Get((Object)("discount_invoiced"))));
RDebugUtils.currentLine=105513133;
 //BA.debugLineNum = 105513133;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Get(";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_invoiced"))));
 if (true) break;
if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=105513135;
 //BA.debugLineNum = 105513135;BA.debugLine="Dim global_currency_code As String = colitems.Ge";
_global_currency_code = BA.ObjectToString(_colitems.Get((Object)("global_currency_code")));
RDebugUtils.currentLine=105513136;
 //BA.debugLineNum = 105513136;BA.debugLine="Dim status As String = colitems.Get(\"status\")";
_status = BA.ObjectToString(_colitems.Get((Object)("status")));
RDebugUtils.currentLine=105513137;
 //BA.debugLineNum = 105513137;BA.debugLine="Dim is_virtual As Int = colitems.Getdefault(\"is_";
_is_virtual = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("is_virtual"),(Object)(0))));
RDebugUtils.currentLine=105513138;
 //BA.debugLineNum = 105513138;BA.debugLine="Dim base_total_invoiced_cost As Int = colitems.G";
_base_total_invoiced_cost = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_invoiced_cost"),(Object)(-1))));
RDebugUtils.currentLine=105513139;
 //BA.debugLineNum = 105513139;BA.debugLine="Dim discount_tax_compensation_invoiced As Int =";
_discount_tax_compensation_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_tax_compensation_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513140;
 //BA.debugLineNum = 105513140;BA.debugLine="Dim status_histories As List = colitems.Get(\"sta";
_status_histories = new anywheresoftware.b4a.objects.collections.List();
_status_histories = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitems.Get((Object)("status_histories"))));
RDebugUtils.currentLine=105513141;
 //BA.debugLineNum = 105513141;BA.debugLine="Dim store_currency_code As String = colitems.Get";
_store_currency_code = BA.ObjectToString(_colitems.Get((Object)("store_currency_code")));
RDebugUtils.currentLine=105513142;
 //BA.debugLineNum = 105513142;BA.debugLine="Dim created_at As String = colitems.Get(\"created";
_created_at = BA.ObjectToString(_colitems.Get((Object)("created_at")));
RDebugUtils.currentLine=105513143;
 //BA.debugLineNum = 105513143;BA.debugLine="Dim total_item_count As Int = colitems.Getdefaul";
_total_item_count = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_item_count"),(Object)(-1))));
RDebugUtils.currentLine=105513144;
 //BA.debugLineNum = 105513144;BA.debugLine="Dim shipping_tax_amount As Int = colitems.Getdef";
_shipping_tax_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_tax_amount"),(Object)(-1))));
RDebugUtils.currentLine=105513145;
 //BA.debugLineNum = 105513145;BA.debugLine="Dim store_to_base_rate As Int = colitems.Getdefa";
_store_to_base_rate = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_to_base_rate"),(Object)(1))));
RDebugUtils.currentLine=105513146;
 //BA.debugLineNum = 105513146;BA.debugLine="Dim updated_at As String = colitems.Get(\"updated";
_updated_at = BA.ObjectToString(_colitems.Get((Object)("updated_at")));
RDebugUtils.currentLine=105513147;
 //BA.debugLineNum = 105513147;BA.debugLine="Dim base_shipping_discount_amount As Int = colit";
_base_shipping_discount_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_shipping_discount_amount"),(Object)(-1))));
RDebugUtils.currentLine=105513148;
 //BA.debugLineNum = 105513148;BA.debugLine="Dim store_name As String = colitems.Get(\"store_n";
_store_name = BA.ObjectToString(_colitems.Get((Object)("store_name")));
RDebugUtils.currentLine=105513149;
 //BA.debugLineNum = 105513149;BA.debugLine="Dim grand_total As Double = colitems.Getdefault(";
_grand_total = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("grand_total"),(Object)(-1))));
RDebugUtils.currentLine=105513150;
 //BA.debugLineNum = 105513150;BA.debugLine="Dim base_currency_code As String = colitems.Get(";
_base_currency_code = BA.ObjectToString(_colitems.Get((Object)("base_currency_code")));
RDebugUtils.currentLine=105513151;
 //BA.debugLineNum = 105513151;BA.debugLine="Dim base_total_paid As Double = colitems.Getdefa";
_base_total_paid = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_paid"),(Object)(-1))));
RDebugUtils.currentLine=105513152;
 //BA.debugLineNum = 105513152;BA.debugLine="Dim base_tax_amount As Double = colitems.Get(\"ba";
_base_tax_amount = (double)(BA.ObjectToNumber(_colitems.Get((Object)("base_tax_amount"))));
RDebugUtils.currentLine=105513153;
 //BA.debugLineNum = 105513153;BA.debugLine="Dim store_id As Int = colitems.Getdefault(\"store";
_store_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_id"),(Object)(0))));
RDebugUtils.currentLine=105513154;
 //BA.debugLineNum = 105513154;BA.debugLine="Dim shipping_discount_tax_compensation_amount As";
_shipping_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=105513155;
 //BA.debugLineNum = 105513155;BA.debugLine="Dim total_due As Int = colitems.Getdefault(\"tota";
_total_due = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_due"),(Object)(-1))));
RDebugUtils.currentLine=105513156;
 //BA.debugLineNum = 105513156;BA.debugLine="Dim total_qty_ordered As Int = colitems.Getdefau";
_total_qty_ordered = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("total_qty_ordered"),(Object)(-1))));
RDebugUtils.currentLine=105513157;
 //BA.debugLineNum = 105513157;BA.debugLine="Dim base_discount_amount As Int = colitems.Get(\"";
_base_discount_amount = (int)(BA.ObjectToNumber(_colitems.Get((Object)("base_discount_amount"))));
RDebugUtils.currentLine=105513158;
 //BA.debugLineNum = 105513158;BA.debugLine="Dim extension_attributes As Map = colitems.Get(\"";
_extension_attributes = new anywheresoftware.b4a.objects.collections.Map();
_extension_attributes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_colitems.Get((Object)("extension_attributes"))));
RDebugUtils.currentLine=105513159;
 //BA.debugLineNum = 105513159;BA.debugLine="If extension_attributes.IsInitialized Then";
if (true) break;

case 46:
//if
this.state = 81;
if (_extension_attributes.IsInitialized()) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=105513160;
 //BA.debugLineNum = 105513160;BA.debugLine="Dim shipping_assignments As List = extension_at";
_shipping_assignments = new anywheresoftware.b4a.objects.collections.List();
_shipping_assignments = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("shipping_assignments"))));
RDebugUtils.currentLine=105513161;
 //BA.debugLineNum = 105513161;BA.debugLine="If shipping_assignments.IsInitialized Then";
if (true) break;

case 49:
//if
this.state = 52;
if (_shipping_assignments.IsInitialized()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=105513258;
 //BA.debugLineNum = 105513258;BA.debugLine="Dim payment_additional_info As List = extension";
_payment_additional_info = new anywheresoftware.b4a.objects.collections.List();
_payment_additional_info = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("payment_additional_info"))));
RDebugUtils.currentLine=105513259;
 //BA.debugLineNum = 105513259;BA.debugLine="If payment_additional_info.IsInitialized Then";
if (true) break;

case 53:
//if
this.state = 60;
if (_payment_additional_info.IsInitialized()) { 
this.state = 55;
}if (true) break;

case 55:
//C
this.state = 56;
RDebugUtils.currentLine=105513260;
 //BA.debugLineNum = 105513260;BA.debugLine="For Each colpayment_additional_info As Map In";
if (true) break;

case 56:
//for
this.state = 59;
_colpayment_additional_info = new anywheresoftware.b4a.objects.collections.Map();
group183 = _payment_additional_info;
index183 = 0;
groupLen183 = group183.getSize();
this.state = 96;
if (true) break;

case 96:
//C
this.state = 59;
if (index183 < groupLen183) {
this.state = 58;
_colpayment_additional_info = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group183.Get(index183)));}
if (true) break;

case 97:
//C
this.state = 96;
index183++;
if (true) break;

case 58:
//C
this.state = 97;
RDebugUtils.currentLine=105513261;
 //BA.debugLineNum = 105513261;BA.debugLine="Dim value As String = colpayment_additional_i";
_value = BA.ObjectToString(_colpayment_additional_info.Get((Object)("value")));
RDebugUtils.currentLine=105513262;
 //BA.debugLineNum = 105513262;BA.debugLine="Dim key As String = colpayment_additional_inf";
_key = BA.ObjectToString(_colpayment_additional_info.Get((Object)("key")));
 if (true) break;
if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=105513265;
 //BA.debugLineNum = 105513265;BA.debugLine="Dim applied_taxes As List = extension_attribute";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=105513266;
 //BA.debugLineNum = 105513266;BA.debugLine="If applied_taxes.IsInitialized Then";
if (true) break;

case 61:
//if
this.state = 68;
if (_applied_taxes.IsInitialized()) { 
this.state = 63;
}if (true) break;

case 63:
//C
this.state = 64;
RDebugUtils.currentLine=105513267;
 //BA.debugLineNum = 105513267;BA.debugLine="For Each colapplied_taxes As Map In applied_ta";
if (true) break;

case 64:
//for
this.state = 67;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group190 = _applied_taxes;
index190 = 0;
groupLen190 = group190.getSize();
this.state = 98;
if (true) break;

case 98:
//C
this.state = 67;
if (index190 < groupLen190) {
this.state = 66;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group190.Get(index190)));}
if (true) break;

case 99:
//C
this.state = 98;
index190++;
if (true) break;

case 66:
//C
this.state = 99;
RDebugUtils.currentLine=105513268;
 //BA.debugLineNum = 105513268;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(\"";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=105513269;
 //BA.debugLineNum = 105513269;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"co";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=105513270;
 //BA.debugLineNum = 105513270;BA.debugLine="Dim base_amount As Double = colapplied_taxes.";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=105513271;
 //BA.debugLineNum = 105513271;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"t";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=105513272;
 //BA.debugLineNum = 105513272;BA.debugLine="Dim percent As Double = colapplied_taxes.Get(";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 67:
//C
this.state = 68;
;
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=105513275;
 //BA.debugLineNum = 105513275;BA.debugLine="Dim item_applied_taxes As List = extension_attr";
_item_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_item_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_extension_attributes.Get((Object)("item_applied_taxes"))));
RDebugUtils.currentLine=105513276;
 //BA.debugLineNum = 105513276;BA.debugLine="If item_applied_taxes.IsInitialized Then";
if (true) break;

case 69:
//if
this.state = 80;
if (_item_applied_taxes.IsInitialized()) { 
this.state = 71;
}if (true) break;

case 71:
//C
this.state = 72;
RDebugUtils.currentLine=105513277;
 //BA.debugLineNum = 105513277;BA.debugLine="For Each colitem_applied_taxes As Map In item_";
if (true) break;

case 72:
//for
this.state = 79;
_colitem_applied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group200 = _item_applied_taxes;
index200 = 0;
groupLen200 = group200.getSize();
this.state = 100;
if (true) break;

case 100:
//C
this.state = 79;
if (index200 < groupLen200) {
this.state = 74;
_colitem_applied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group200.Get(index200)));}
if (true) break;

case 101:
//C
this.state = 100;
index200++;
if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=105513278;
 //BA.debugLineNum = 105513278;BA.debugLine="Dim applied_taxes As List = colitem_applied_t";
_applied_taxes = new anywheresoftware.b4a.objects.collections.List();
_applied_taxes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_colitem_applied_taxes.Get((Object)("applied_taxes"))));
RDebugUtils.currentLine=105513279;
 //BA.debugLineNum = 105513279;BA.debugLine="For Each colapplied_taxes As Map In applied_t";
if (true) break;

case 75:
//for
this.state = 78;
_colapplied_taxes = new anywheresoftware.b4a.objects.collections.Map();
group202 = _applied_taxes;
index202 = 0;
groupLen202 = group202.getSize();
this.state = 102;
if (true) break;

case 102:
//C
this.state = 78;
if (index202 < groupLen202) {
this.state = 77;
_colapplied_taxes = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group202.Get(index202)));}
if (true) break;

case 103:
//C
this.state = 102;
index202++;
if (true) break;

case 77:
//C
this.state = 103;
RDebugUtils.currentLine=105513280;
 //BA.debugLineNum = 105513280;BA.debugLine="Dim amount As Double = colapplied_taxes.Get(";
_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("amount"))));
RDebugUtils.currentLine=105513281;
 //BA.debugLineNum = 105513281;BA.debugLine="Dim code As String = colapplied_taxes.Get(\"c";
_code = BA.ObjectToString(_colapplied_taxes.Get((Object)("code")));
RDebugUtils.currentLine=105513282;
 //BA.debugLineNum = 105513282;BA.debugLine="Dim base_amount As Double = colapplied_taxes";
_base_amount = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("base_amount"))));
RDebugUtils.currentLine=105513283;
 //BA.debugLineNum = 105513283;BA.debugLine="Dim title As String = colapplied_taxes.Get(\"";
_title = BA.ObjectToString(_colapplied_taxes.Get((Object)("title")));
RDebugUtils.currentLine=105513284;
 //BA.debugLineNum = 105513284;BA.debugLine="Dim percent As Double = colapplied_taxes.Get";
_percent = (double)(BA.ObjectToNumber(_colapplied_taxes.Get((Object)("percent"))));
 if (true) break;
if (true) break;

case 78:
//C
this.state = 101;
;
RDebugUtils.currentLine=105513286;
 //BA.debugLineNum = 105513286;BA.debugLine="Dim Type As String = colitem_applied_taxes.Ge";
_type = BA.ObjectToString(_colitem_applied_taxes.Get((Object)("type")));
 if (true) break;
if (true) break;

case 79:
//C
this.state = 80;
;
 if (true) break;

case 80:
//C
this.state = 81;
;
RDebugUtils.currentLine=105513289;
 //BA.debugLineNum = 105513289;BA.debugLine="Dim converting_from_quote As String = extension";
_converting_from_quote = BA.ObjectToString(_extension_attributes.Get((Object)("converting_from_quote")));
RDebugUtils.currentLine=105513291;
 //BA.debugLineNum = 105513291;BA.debugLine="Dim pgw As Map=extension_attributes.Get(\"pgw\")";
_pgw = new anywheresoftware.b4a.objects.collections.Map();
_pgw = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_extension_attributes.Get((Object)("pgw"))));
 if (true) break;

case 81:
//C
this.state = 87;
;
RDebugUtils.currentLine=105513294;
 //BA.debugLineNum = 105513294;BA.debugLine="Dim shipping_description As String = colitems.Ge";
_shipping_description = BA.ObjectToString(_colitems.Get((Object)("shipping_description")));
RDebugUtils.currentLine=105513295;
 //BA.debugLineNum = 105513295;BA.debugLine="Dim store_to_order_rate As Int = colitems.Getdef";
_store_to_order_rate = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("store_to_order_rate"),(Object)(-1))));
RDebugUtils.currentLine=105513296;
 //BA.debugLineNum = 105513296;BA.debugLine="Dim shipping_amount As Int = colitems.Getdefault";
_shipping_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_amount"),(Object)(-1))));
RDebugUtils.currentLine=105513297;
 //BA.debugLineNum = 105513297;BA.debugLine="Dim base_discount_tax_compensation_amount As Int";
_base_discount_tax_compensation_amount = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_discount_tax_compensation_amount"),(Object)(-1))));
RDebugUtils.currentLine=105513298;
 //BA.debugLineNum = 105513298;BA.debugLine="Dim subtotal_invoiced As Int = colitems.Getdefau";
_subtotal_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("subtotal_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=105513299;
 //BA.debugLineNum = 105513299;BA.debugLine="Dim base_to_order_rate As Int = colitems.Getdefa";
_base_to_order_rate = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_to_order_rate"),(Object)(-1))));
RDebugUtils.currentLine=105513300;
 //BA.debugLineNum = 105513300;BA.debugLine="Dim base_subtotal As Int = colitems.Getdefault(\"";
_base_subtotal = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_subtotal"),(Object)(-1))));
RDebugUtils.currentLine=105513301;
 //BA.debugLineNum = 105513301;BA.debugLine="Dim protect_code As String = colitems.Get(\"prote";
_protect_code = BA.ObjectToString(_colitems.Get((Object)("protect_code")));
RDebugUtils.currentLine=105513302;
 //BA.debugLineNum = 105513302;BA.debugLine="Dim customer_dob As String = colitems.Get(\"custo";
_customer_dob = BA.ObjectToString(_colitems.Get((Object)("customer_dob")));
RDebugUtils.currentLine=105513303;
 //BA.debugLineNum = 105513303;BA.debugLine="Dim base_total_due As Int = colitems.Getdefault(";
_base_total_due = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_total_due"),(Object)(-1))));
RDebugUtils.currentLine=105513304;
 //BA.debugLineNum = 105513304;BA.debugLine="Dim base_subtotal_incl_tax As Double = colitems.";
_base_subtotal_incl_tax = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_subtotal_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=105513305;
 //BA.debugLineNum = 105513305;BA.debugLine="Dim customer_id As Int = colitems.Getdefault(\"cu";
_customer_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("customer_id"),(Object)(-1))));
RDebugUtils.currentLine=105513306;
 //BA.debugLineNum = 105513306;BA.debugLine="Dim customer_group_id As Int = colitems.Getdefau";
_customer_group_id = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("customer_group_id"),(Object)(-1))));
RDebugUtils.currentLine=105513307;
 //BA.debugLineNum = 105513307;BA.debugLine="Dim discount_invoiced As Int = colitems.Getdefau";
_discount_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("discount_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=105513308;
 //BA.debugLineNum = 105513308;BA.debugLine="Dim order_currency_code As String = colitems.Get";
_order_currency_code = BA.ObjectToString(_colitems.Get((Object)("order_currency_code")));
RDebugUtils.currentLine=105513309;
 //BA.debugLineNum = 105513309;BA.debugLine="Dim base_tax_invoiced As Double = colitems.Getde";
_base_tax_invoiced = (double)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_tax_invoiced"),(Object)(0))));
RDebugUtils.currentLine=105513310;
 //BA.debugLineNum = 105513310;BA.debugLine="Dim customer_gender As Int = colitems.Getdefault";
_customer_gender = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("customer_gender"),(Object)(-1))));
RDebugUtils.currentLine=105513311;
 //BA.debugLineNum = 105513311;BA.debugLine="Dim shipping_incl_tax As Int = colitems.Getdefau";
_shipping_incl_tax = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("shipping_incl_tax"),(Object)(-1))));
RDebugUtils.currentLine=105513312;
 //BA.debugLineNum = 105513312;BA.debugLine="Dim base_shipping_invoiced As Int = colitems.Get";
_base_shipping_invoiced = (int)(BA.ObjectToNumber(_colitems.GetDefault((Object)("base_shipping_invoiced"),(Object)(-1))));
RDebugUtils.currentLine=105513316;
 //BA.debugLineNum = 105513316;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(mS";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblB2BOrders",_items);
 if (true) break;
if (true) break;

case 82:
//C
this.state = -1;
;
RDebugUtils.currentLine=105513319;
 //BA.debugLineNum = 105513319;BA.debugLine="Dim search_criteria As Map = root.Get(\"search_cri";
_search_criteria = new anywheresoftware.b4a.objects.collections.Map();
_search_criteria = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_root.Get((Object)("search_criteria"))));
RDebugUtils.currentLine=105513320;
 //BA.debugLineNum = 105513320;BA.debugLine="Dim filter_groups As List = search_criteria.Get(\"";
_filter_groups = new anywheresoftware.b4a.objects.collections.List();
_filter_groups = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_search_criteria.Get((Object)("filter_groups"))));
RDebugUtils.currentLine=105513321;
 //BA.debugLineNum = 105513321;BA.debugLine="Dim page_size As Int = search_criteria.Get(\"page_";
_page_size = (int)(BA.ObjectToNumber(_search_criteria.Get((Object)("page_size"))));
RDebugUtils.currentLine=105513326;
 //BA.debugLineNum = 105513326;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=105513327;
 //BA.debugLineNum = 105513327;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentovaloresatributosizeproductos(b4j.docU.ctestsinfomagento __ref,String _token) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentovaloresatributosizeproductos", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentovaloresatributosizeproductos", new Object[] {_token}));}
ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos rsub = new ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(this,__ref,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoValoresAtributoSizeProductos(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105381890;
 //BA.debugLineNum = 105381890;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=105381891;
 //BA.debugLineNum = 105381891;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=105381893;
 //BA.debugLineNum = 105381893;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/products/attributes/size/options");
RDebugUtils.currentLine=105381895;
 //BA.debugLineNum = 105381895;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=105381897;
 //BA.debugLineNum = 105381897;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=105381898;
 //BA.debugLineNum = 105381898;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=105381900;
 //BA.debugLineNum = 105381900;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=105381902;
 //BA.debugLineNum = 105381902;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentovaloresatributosizeproductos"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=105381904;
 //BA.debugLineNum = 105381904;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=105381905;
 //BA.debugLineNum = 105381905;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8105381905","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=105381906;
 //BA.debugLineNum = 105381906;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8105381906",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=105381907;
 //BA.debugLineNum = 105381907;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=105381908;
 //BA.debugLineNum = 105381908;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=105381909;
 //BA.debugLineNum = 105381909;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=105381912;
 //BA.debugLineNum = 105381912;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=105381913;
 //BA.debugLineNum = 105381913;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=105381914;
 //BA.debugLineNum = 105381914;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=105381916;
 //BA.debugLineNum = 105381916;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.ctestsinfomagento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
RDebugUtils.currentLine=102236160;
 //BA.debugLineNum = 102236160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=102236162;
 //BA.debugLineNum = 102236162;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=102236163;
 //BA.debugLineNum = 102236163;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=102236164;
 //BA.debugLineNum = 102236164;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=102236167;
 //BA.debugLineNum = 102236167;BA.debugLine="Private btnSalir As B4XView";
_btnsalir = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=102236168;
 //BA.debugLineNum = 102236168;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=102236170;
 //BA.debugLineNum = 102236170;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=102236171;
 //BA.debugLineNum = 102236171;BA.debugLine="Dim JamLoadingIndicator1 As JamLoadingIndicator";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=102236173;
 //BA.debugLineNum = 102236173;BA.debugLine="Private FlexGridDialog As FlexGrid";
_flexgriddialog = new b4j.example.flexgrid();
RDebugUtils.currentLine=102236174;
 //BA.debugLineNum = 102236174;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
_measurementcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=102236176;
 //BA.debugLineNum = 102236176;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=102236178;
 //BA.debugLineNum = 102236178;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=102236183;
 //BA.debugLineNum = 102236183;BA.debugLine="Private tk As  String";
_tk = "";
RDebugUtils.currentLine=102236185;
 //BA.debugLineNum = 102236185;BA.debugLine="Private B4XComboBoxTablasB2B As B4XComboBox";
_b4xcomboboxtablasb2b = new b4j.docU.b4xcombobox();
RDebugUtils.currentLine=102236186;
 //BA.debugLineNum = 102236186;BA.debugLine="Private B4XComboBoxStores As B4XComboBox";
_b4xcomboboxstores = new b4j.docU.b4xcombobox();
RDebugUtils.currentLine=102236187;
 //BA.debugLineNum = 102236187;BA.debugLine="Private TextAreaHTTPResponse As TextArea";
_textareahttpresponse = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=102236188;
 //BA.debugLineNum = 102236188;BA.debugLine="Private SplitPane1 As SplitPane";
_splitpane1 = new anywheresoftware.b4j.objects.SplitPaneWrapper();
RDebugUtils.currentLine=102236189;
 //BA.debugLineNum = 102236189;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.ctestsinfomagento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=102760448;
 //BA.debugLineNum = 102760448;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=102760450;
 //BA.debugLineNum = 102760450;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BSto";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BStores");
RDebugUtils.currentLine=102760451;
 //BA.debugLineNum = 102760451;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BSt";
_screartabla = ("CREATE TABLE tblB2BStores (\n"+"	code TEXT,default_store_id INTEGER , name TEXT, root_category_id INT, id INTEGER, website_id INTEGER\n"+"	)");
RDebugUtils.currentLine=102760454;
 //BA.debugLineNum = 102760454;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760456;
 //BA.debugLineNum = 102760456;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BGru";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BGruposCliente");
RDebugUtils.currentLine=102760457;
 //BA.debugLineNum = 102760457;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE tblB2BGr";
_screartabla = ("CREATE TABLE tblB2BGruposCliente (\n"+"	code TEXT,tax_class_id INTEGER , id INTEGER, tax_class_name TEXT\n"+"	)");
RDebugUtils.currentLine=102760460;
 //BA.debugLineNum = 102760460;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760462;
 //BA.debugLineNum = 102760462;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCli";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BClientes");
RDebugUtils.currentLine=102760463;
 //BA.debugLineNum = 102760463;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
_screartabla = ("CREATE TABLE IF NOT EXISTS [tblB2BClientes] ([store_id] INTEGER, [firstname] TEXT\n"+"	, [addresses] TEXT, [created_at] TEXT, [extension_attributes] TEXT, [default_shipping] INTEGER default 0, [lastname] TEXT, gender INTEGER default 0, dob INTEGER default 0\n"+"	, [custom_attributes] TEXT, [updated_at] TEXT, [disable_auto_group_change] INTEGER, [group_id] INTEGER, [id] INTEGER\n"+"	, [default_billing] INTEGER default 0, [website_id] INTEGER, [email] TEXT PRIMARY KEY, [created_in] TEXT, [is_blocked] INTEGER default 0\n"+"	, [is_commercial] INTEGER default 0, [company] TEXT default '', [code] TEXT default '', [customer_group_code] TEXT default '', [customer_group_name] TEXT default ''\n"+"	, [language] TEXT default '', [country_id] TEXT '')");
RDebugUtils.currentLine=102760469;
 //BA.debugLineNum = 102760469;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760471;
 //BA.debugLineNum = 102760471;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BPro";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BProductos");
RDebugUtils.currentLine=102760472;
 //BA.debugLineNum = 102760472;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BProductos] ([visibility] INTEGER, [type_id] TEXT, [created_at] TEXT\n"+"	, [extension_attributes] TEXT, [tier_prices] TEXT, [custom_attributes] TEXT, IDTalla INTEGER default -1, Talla TEXT default '', UnidadMedida TEXT default ''\n"+"	, [attribute_set_id] INTEGER, [updated_at] TEXT, [price] INTEGER default 0\n"+"	, [media_gallery_entries] TEXT, [name] TEXT, [options] TEXT, [id] INTEGER, [sku] TEXT PRIMARY KEY, [product_links] TEXT, [status] INTEGER, weight INTEGER default 0\n"+"	)");
RDebugUtils.currentLine=102760477;
 //BA.debugLineNum = 102760477;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760479;
 //BA.debugLineNum = 102760479;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BDir";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BDireccionesCliente");
RDebugUtils.currentLine=102760480;
 //BA.debugLineNum = 102760480;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BDireccionesCliente] ([firstname] TEXT,[lastname] TEXT, [city] TEXT\n"+"	, customer_code TEXT defalut'' , code TEXT default'', [region_id] INTEGER\n"+"	, [postcode] TEXT, [telephone] INTEGER, [default_shipping] TEXT default '', [default_billing] TEXT default '',[custom_attributes] TEXT\n"+"	, [street] TEXT default '', [street1] TEXT default '', [street2] TEXT default '', [street3] TEXT default '', [company] TEXT\n"+"	, [id] INTEGER, [customer_id] INTEGER, [region] TEXT, [country_id] TEXT)");
RDebugUtils.currentLine=102760485;
 //BA.debugLineNum = 102760485;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760488;
 //BA.debugLineNum = 102760488;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BAtributoSizeProducts");
RDebugUtils.currentLine=102760489;
 //BA.debugLineNum = 102760489;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BAtributoSizeProducts] ([label] TEXT, [value] INTEGER)");
RDebugUtils.currentLine=102760490;
 //BA.debugLineNum = 102760490;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760492;
 //BA.debugLineNum = 102760492;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BAtr";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BAtributoUnidadMedidaProductos");
RDebugUtils.currentLine=102760493;
 //BA.debugLineNum = 102760493;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BAtributoUnidadMedidaProductos] ([label] TEXT, [value] INTEGER)");
RDebugUtils.currentLine=102760494;
 //BA.debugLineNum = 102760494;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760509;
 //BA.debugLineNum = 102760509;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BOrd";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BOrders");
RDebugUtils.currentLine=102760510;
 //BA.debugLineNum = 102760510;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BOrders] ([order_id] INTEGER,  [created_at] TEXT, [store_id] INTEGER default 0\n"+"	, [po_number] TEXT default ''\n"+"	, [item_id] INTEGER,[product_id] INTEGER default 0, [sku] TEXT, [name] TEXT, [Talla] TEXT DEFAULT '', parent_id TEXT default ''\n"+"	,[original_price] INTEGER default 0\n"+"	, [free_shipping] INTEGER default 0, [discount_amount] REAL default 0, [tax_percent] REAL default 0\n"+"	, [price] REAL default 0, [base_row_total] REAL\n"+"	,  [base_original_price] REAL default 0\n"+"	, [qty_shipped] INTEGER, [qty_ordered] INTEGER\n"+"	, [row_total] REAL, [qty_canceled] INTEGER, [product_option] TEXT, [updated_at] TEXT, [base_price] REAL\n"+"	, [qty_invoiced] INTEGER, [row_invoiced] INTEGER\n"+"	,  [product_type] TEXT\n"+"	, [qty_refunded] INTEGER, [base_row_invoiced] INTEGER, [is_qty_decimal] INTEGER default 0)");
RDebugUtils.currentLine=102760522;
 //BA.debugLineNum = 102760522;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760524;
 //BA.debugLineNum = 102760524;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblB2BCat";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblB2BCategoriasProductos");
RDebugUtils.currentLine=102760525;
 //BA.debugLineNum = 102760525;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE If Not E";
_screartabla = ("CREATE TABLE If Not EXISTS [tblB2BCategoriasProductos] ([label] TEXT, [value] INTEGER)");
RDebugUtils.currentLine=102760526;
 //BA.debugLineNum = 102760526;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=102760530;
 //BA.debugLineNum = 102760530;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatosapimagentobusquedadireccionescliente(b4j.docU.ctestsinfomagento __ref,String _token,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "enviodatosapimagentobusquedadireccionescliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatosapimagentobusquedadireccionescliente", new Object[] {_token,_idclientesel}));}
ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente rsub = new ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente(this,__ref,_token,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente extends BA.ResumableSub {
public ResumableSub_EnvioDatosAPIMagentoBusquedaDireccionesCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _token,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._token = _token;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _token;
int _idclientesel;
b4j.docU.httpjob _job = null;
String _squeryapi = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104792066;
 //BA.debugLineNum = 104792066;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=104792067;
 //BA.debugLineNum = 104792067;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=104792069;
 //BA.debugLineNum = 104792069;BA.debugLine="Dim sQueryAPI As String=$\"https://proingroup-webs";
_squeryapi = ("https://proingroup-webstorepre.com/index.php/rest/V1/customers/"+parent.__c.SmartStringFormatter("",(Object)(_idclientesel))+"/Addreses");
RDebugUtils.currentLine=104792071;
 //BA.debugLineNum = 104792071;BA.debugLine="job.Download(sQueryAPI)";
_job._download /*String*/ (null,_squeryapi);
RDebugUtils.currentLine=104792073;
 //BA.debugLineNum = 104792073;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=104792074;
 //BA.debugLineNum = 104792074;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=104792076;
 //BA.debugLineNum = 104792076;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=104792078;
 //BA.debugLineNum = 104792078;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "enviodatosapimagentobusquedadireccionescliente"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=104792080;
 //BA.debugLineNum = 104792080;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=104792081;
 //BA.debugLineNum = 104792081;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("8104792081","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=104792082;
 //BA.debugLineNum = 104792082;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("8104792082",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=104792083;
 //BA.debugLineNum = 104792083;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=104792084;
 //BA.debugLineNum = 104792084;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104792085;
 //BA.debugLineNum = 104792085;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=104792088;
 //BA.debugLineNum = 104792088;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=104792089;
 //BA.debugLineNum = 104792089;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=104792090;
 //BA.debugLineNum = 104792090;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=104792092;
 //BA.debugLineNum = 104792092;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.ctestsinfomagento __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=102563840;
 //BA.debugLineNum = 102563840;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=102563841;
 //BA.debugLineNum = 102563841;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=102563842;
 //BA.debugLineNum = 102563842;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.Form  _getform(b4j.docU.ctestsinfomagento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "getform", false))
	 {return ((anywheresoftware.b4j.objects.Form) Debug.delegate(ba, "getform", null));}
RDebugUtils.currentLine=102432768;
 //BA.debugLineNum = 102432768;BA.debugLine="Sub getForm As Form";
RDebugUtils.currentLine=102432769;
 //BA.debugLineNum = 102432769;BA.debugLine="Return frm";
if (true) return __ref._frm /*anywheresoftware.b4j.objects.Form*/ ;
RDebugUtils.currentLine=102432770;
 //BA.debugLineNum = 102432770;BA.debugLine="End Sub";
return null;
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.ctestsinfomagento __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=102891520;
 //BA.debugLineNum = 102891520;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=102891521;
 //BA.debugLineNum = 102891521;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=102891522;
 //BA.debugLineNum = 102891522;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cambioenceldaseleccionada(b4j.docU.ctestsinfomagento __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "jamtableview1_cambioenceldaseleccionada", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cambioenceldaseleccionada", new Object[] {_datosceldaseleccionada}));}
int _lineaseltv = 0;
anywheresoftware.b4a.objects.collections.Map _mpk = null;
String _pedido = "";
int _linea = 0;
String _nombreproveedor = "";
String _articulo = "";
String _descripcion = "";
String _talla = "";
String _stalla = "";
int _qtypte = 0;
String _dateformatant = "";
long _fechaprometidalong = 0L;
String _sfechaprometida = "";
int _pendienteseguimiento = 0;
String _spendienteseguimiento = "";
RDebugUtils.currentLine=103088128;
 //BA.debugLineNum = 103088128;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
RDebugUtils.currentLine=103088129;
 //BA.debugLineNum = 103088129;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
_lineaseltv = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=103088130;
 //BA.debugLineNum = 103088130;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=103088131;
 //BA.debugLineNum = 103088131;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
_pedido = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=103088132;
 //BA.debugLineNum = 103088132;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
_linea = (int)(BA.ObjectToNumber(_mpk.Get((Object)("Linea"))));
RDebugUtils.currentLine=103088133;
 //BA.debugLineNum = 103088133;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
_nombreproveedor = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"NombreProveedor"));
RDebugUtils.currentLine=103088134;
 //BA.debugLineNum = 103088134;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
_articulo = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Articulo"));
RDebugUtils.currentLine=103088135;
 //BA.debugLineNum = 103088135;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
_descripcion = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"DescripcionArticulo"));
RDebugUtils.currentLine=103088136;
 //BA.debugLineNum = 103088136;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
_talla = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Talla"));
RDebugUtils.currentLine=103088137;
 //BA.debugLineNum = 103088137;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
_stalla = BA.ObjectToString((((_talla).equals("") == false) ? ((Object)("Talla: "+_talla)) : ((Object)(""))));
RDebugUtils.currentLine=103088138;
 //BA.debugLineNum = 103088138;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
_qtypte = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"QtyPendiente")));
RDebugUtils.currentLine=103088139;
 //BA.debugLineNum = 103088139;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=103088140;
 //BA.debugLineNum = 103088140;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=103088141;
 //BA.debugLineNum = 103088141;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
_fechaprometidalong = BA.ObjectToLongNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"FechaPrometida"));
RDebugUtils.currentLine=103088142;
 //BA.debugLineNum = 103088142;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
_sfechaprometida = BA.ObjectToString(((_fechaprometidalong>0) ? ((Object)("Fecha Prometida: "+__c.DateTime.Date(_fechaprometidalong))) : ((Object)("SIN FECHA PROMETIDA"))));
RDebugUtils.currentLine=103088143;
 //BA.debugLineNum = 103088143;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=103088144;
 //BA.debugLineNum = 103088144;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
_pendienteseguimiento = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"PendienteSeguimiento")));
RDebugUtils.currentLine=103088145;
 //BA.debugLineNum = 103088145;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
_spendienteseguimiento = BA.ObjectToString(((_pendienteseguimiento==1) ? ((Object)("PENDIENTE SEGUIMIENTO")) : ((Object)(""))));
RDebugUtils.currentLine=103088147;
 //BA.debugLineNum = 103088147;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Pedido: "+_pedido+" Línea:"+BA.NumberToString(_linea)+"  "+_nombreproveedor+"  "+_articulo+"  "+_descripcion+"  "+_stalla+"  QtyPte: "+BA.NumberToString(_qtypte)+"  "+_sfechaprometida+" "+_spendienteseguimiento));
RDebugUtils.currentLine=103088149;
 //BA.debugLineNum = 103088149;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cellclick(b4j.docU.ctestsinfomagento __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "jamtableview1_cellclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cellclick", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=103153664;
 //BA.debugLineNum = 103153664;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
RDebugUtils.currentLine=103153665;
 //BA.debugLineNum = 103153665;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
switch (BA.switchObjectToInt(_datosceldaseleccionada.AliasCampo /*String*/ ,"ExcluidoReclamacion")) {
case 0: {
RDebugUtils.currentLine=103153667;
 //BA.debugLineNum = 103153667;BA.debugLine="AlternarExcluidoReclamacion(DatosCeldaSeleccion";
__ref._alternarexcluidoreclamacion /*String*/ (null,_datosceldaseleccionada);
 break; }
}
;
RDebugUtils.currentLine=103153669;
 //BA.debugLineNum = 103153669;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_contextmenuitem_action(b4j.docU.ctestsinfomagento __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_ContextMenuItem_Action rsub = new ResumableSub_jamTableView1_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _tagmenuitem;
int _filasel = 0;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
String _pedidosel = "";
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
String _articulosel = "";
int _filaseleccionada = 0;
anywheresoftware.b4a.objects.collections.List _lstinfofila = null;
b4j.docU.jamtableview._datoscamporegistrojamtableview _dc = null;
String _idclientesel = "";
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=103022593;
 //BA.debugLineNum = 103022593;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 33;
switch (BA.switchObjectToInt(_tagmenuitem,"VerPedidoCompraNAV","VerArticuloNAV","DireccionesClientes")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 32;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=103022595;
 //BA.debugLineNum = 103022595;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=103022596;
 //BA.debugLineNum = 103022596;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getdatosceldaaliascampofilatv /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null,"Pedido",_filasel);
RDebugUtils.currentLine=103022597;
 //BA.debugLineNum = 103022597;BA.debugLine="Dim PedidoSel As String=DCS.ValorCelda";
_pedidosel = BA.ObjectToString(_dcs.ValorCelda /*Object*/ );
RDebugUtils.currentLine=103022598;
 //BA.debugLineNum = 103022598;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Ver el p";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Ver el pedido de compra "+_pedidosel+" en NAVISION?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=103022599;
 //BA.debugLineNum = 103022599;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 34;
return;
case 34:
//C
this.state = 4;
_rint = (int) result[1];
;
RDebugUtils.currentLine=103022600;
 //BA.debugLineNum = 103022600;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
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
RDebugUtils.currentLine=103022601;
 //BA.debugLineNum = 103022601;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Pedido compra",(int) (50),"No.",_pedidosel);
RDebugUtils.currentLine=103022602;
 //BA.debugLineNum = 103022602;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 35;
return;
case 35:
//C
this.state = 10;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=103022603;
 //BA.debugLineNum = 103022603;BA.debugLine="If success=False Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_success==parent.__c.False) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=103022604;
 //BA.debugLineNum = 103022604;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir el pedido seleccionado en Navision.","Error");
RDebugUtils.currentLine=103022605;
 //BA.debugLineNum = 103022605;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 33;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=103022609;
 //BA.debugLineNum = 103022609;BA.debugLine="Dim ArticuloSel As String";
_articulosel = "";
RDebugUtils.currentLine=103022610;
 //BA.debugLineNum = 103022610;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=103022611;
 //BA.debugLineNum = 103022611;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
_lstinfofila = new anywheresoftware.b4a.objects.collections.List();
_lstinfofila = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datosregistroindicefila /*anywheresoftware.b4a.objects.collections.List*/ (null,_filaseleccionada);
RDebugUtils.currentLine=103022612;
 //BA.debugLineNum = 103022612;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
if (true) break;

case 16:
//for
this.state = 23;
group19 = _lstinfofila;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 23;
if (index19 < groupLen19) {
this.state = 18;
_dc = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group19.Get(index19));}
if (true) break;

case 38:
//C
this.state = 37;
index19++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=103022613;
 //BA.debugLineNum = 103022613;BA.debugLine="If dc.Campo=\"Articulo\" Then";
if (true) break;

case 19:
//if
this.state = 22;
if ((_dc.Campo /*String*/ ).equals("Articulo")) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=103022614;
 //BA.debugLineNum = 103022614;BA.debugLine="ArticuloSel=dc.ValorCampo";
_articulosel = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
RDebugUtils.currentLine=103022615;
 //BA.debugLineNum = 103022615;BA.debugLine="Exit";
this.state = 23;
if (true) break;
 if (true) break;

case 22:
//C
this.state = 38;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=103022618;
 //BA.debugLineNum = 103022618;BA.debugLine="If ArticuloSel=\"\" Then";

case 23:
//if
this.state = 26;
if ((_articulosel).equals("")) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=103022619;
 //BA.debugLineNum = 103022619;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Artículo.","Error");
RDebugUtils.currentLine=103022620;
 //BA.debugLineNum = 103022620;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 26;
;
RDebugUtils.currentLine=103022621;
 //BA.debugLineNum = 103022621;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=103022623;
 //BA.debugLineNum = 103022623;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Ficha producto",(int) (30),"No.",_articulosel);
RDebugUtils.currentLine=103022624;
 //BA.debugLineNum = 103022624;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 40;
return;
case 40:
//C
this.state = 27;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=103022625;
 //BA.debugLineNum = 103022625;BA.debugLine="If success=False Then";
if (true) break;

case 27:
//if
this.state = 30;
if (_success==parent.__c.False) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=103022626;
 //BA.debugLineNum = 103022626;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir el artículo seleccionado en Navision.","Error");
RDebugUtils.currentLine=103022627;
 //BA.debugLineNum = 103022627;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 30;
;
 if (true) break;

case 30:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=103022631;
 //BA.debugLineNum = 103022631;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=103022633;
 //BA.debugLineNum = 103022633;BA.debugLine="Dim IDClienteSel As String=jamTableView1.GetVal";
_idclientesel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"id"));
RDebugUtils.currentLine=103022635;
 //BA.debugLineNum = 103022635;BA.debugLine="MostrarDireccionesClienteMagento(IDClienteSel)";
__ref._mostrardireccionesclientemagento /*void*/ (null,(int)(Double.parseDouble(_idclientesel)));
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=103022637;
 //BA.debugLineNum = 103022637;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.ctestsinfomagento __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
String _tagmenuitem;
String _seleccionardireccionremitenteemails = "";
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=102957057;
 //BA.debugLineNum = 102957057;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_tagmenuitem,"SeleccionarCuentaRemitenteEmail")) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=102957062;
 //BA.debugLineNum = 102957062;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "jamtableview1_menubarmenuitem_action"), (Object)(_seleccionardireccionremitenteemails));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=102957063;
 //BA.debugLineNum = 102957063;BA.debugLine="If rBool=False Then Return";
if (true) break;

case 4:
//if
this.state = 9;
if (_rbool==parent.__c.False) { 
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
this.state = -1;
;
RDebugUtils.currentLine=102957065;
 //BA.debugLineNum = 102957065;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mostrardirecciondefectoenviocliente(b4j.docU.ctestsinfomagento __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrardirecciondefectoenviocliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mostrardirecciondefectoenviocliente", new Object[] {_idclientesel}));}
ResumableSub_MostrarDireccionDefectoEnvioCliente rsub = new ResumableSub_MostrarDireccionDefectoEnvioCliente(this,__ref,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MostrarDireccionDefectoEnvioCliente extends BA.ResumableSub {
public ResumableSub_MostrarDireccionDefectoEnvioCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdireccionesclientes = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104726529;
 //BA.debugLineNum = 104726529;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Dir";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Direccion Defecto Envío Cliente..."));
RDebugUtils.currentLine=104726530;
 //BA.debugLineNum = 104726530;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=104726531;
 //BA.debugLineNum = 104726531;BA.debugLine="Wait For(CargaDireccionDefectoEnvioCliente(IDClie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), __ref._cargadirecciondefectoenviocliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idclientesel));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=104726532;
 //BA.debugLineNum = 104726532;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=104726533;
 //BA.debugLineNum = 104726533;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104726534;
 //BA.debugLineNum = 104726534;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Direccion Defecto Envío Cliente B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=104726535;
 //BA.debugLineNum = 104726535;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=104726541;
 //BA.debugLineNum = 104726541;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BDireccionesCliente.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=104726542;
 //BA.debugLineNum = 104726542;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=104726543;
 //BA.debugLineNum = 104726543;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8104726543",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=104726544;
 //BA.debugLineNum = 104726544;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=104726545;
 //BA.debugLineNum = 104726545;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104726546;
 //BA.debugLineNum = 104726546;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=104726547;
 //BA.debugLineNum = 104726547;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=104726548;
 //BA.debugLineNum = 104726548;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=104726549;
 //BA.debugLineNum = 104726549;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=104726552;
 //BA.debugLineNum = 104726552;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
_rsdireccionesclientes = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdireccionesclientes = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BDireccionesCliente");
RDebugUtils.currentLine=104726553;
 //BA.debugLineNum = 104726553;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdireccionesclientes.getObject()));
RDebugUtils.currentLine=104726554;
 //BA.debugLineNum = 104726554;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=104726555;
 //BA.debugLineNum = 104726555;BA.debugLine="rsDireccionesClientes.close";
_rsdireccionesclientes.Close();
RDebugUtils.currentLine=104726556;
 //BA.debugLineNum = 104726556;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104726557;
 //BA.debugLineNum = 104726557;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=104726558;
 //BA.debugLineNum = 104726558;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=104726559;
 //BA.debugLineNum = 104726559;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=104726560;
 //BA.debugLineNum = 104726560;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=104726562;
 //BA.debugLineNum = 104726562;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=104726563;
 //BA.debugLineNum = 104726563;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=104726564;
 //BA.debugLineNum = 104726564;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=104726565;
 //BA.debugLineNum = 104726565;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=104726566;
 //BA.debugLineNum = 104726566;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=104726569;
 //BA.debugLineNum = 104726569;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=104726571;
 //BA.debugLineNum = 104726571;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=104726572;
 //BA.debugLineNum = 104726572;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=104726573;
 //BA.debugLineNum = 104726573;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=104726574;
 //BA.debugLineNum = 104726574;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectoenviocliente"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=104726578;
 //BA.debugLineNum = 104726578;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mostrardirecciondefectofacturacioncliente(b4j.docU.ctestsinfomagento __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrardirecciondefectofacturacioncliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mostrardirecciondefectofacturacioncliente", new Object[] {_idclientesel}));}
ResumableSub_MostrarDireccionDefectoFacturacionCliente rsub = new ResumableSub_MostrarDireccionDefectoFacturacionCliente(this,__ref,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MostrarDireccionDefectoFacturacionCliente extends BA.ResumableSub {
public ResumableSub_MostrarDireccionDefectoFacturacionCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdireccionesclientes = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=104988673;
 //BA.debugLineNum = 104988673;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Dir";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Direccion Defecto Facturación Cliente..."));
RDebugUtils.currentLine=104988674;
 //BA.debugLineNum = 104988674;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=104988675;
 //BA.debugLineNum = 104988675;BA.debugLine="Wait For(CargaDireccionDefectoFacturacionCliente(";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), __ref._cargadirecciondefectofacturacioncliente /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idclientesel));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=104988676;
 //BA.debugLineNum = 104988676;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=104988677;
 //BA.debugLineNum = 104988677;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104988678;
 //BA.debugLineNum = 104988678;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Direccion Defecto Facturacion Cliente B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=104988679;
 //BA.debugLineNum = 104988679;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=104988685;
 //BA.debugLineNum = 104988685;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BDireccionesCliente.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=104988686;
 //BA.debugLineNum = 104988686;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=104988687;
 //BA.debugLineNum = 104988687;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8104988687",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=104988688;
 //BA.debugLineNum = 104988688;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=104988689;
 //BA.debugLineNum = 104988689;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104988690;
 //BA.debugLineNum = 104988690;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=104988691;
 //BA.debugLineNum = 104988691;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=104988692;
 //BA.debugLineNum = 104988692;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=104988693;
 //BA.debugLineNum = 104988693;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=104988696;
 //BA.debugLineNum = 104988696;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
_rsdireccionesclientes = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdireccionesclientes = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BDireccionesCliente");
RDebugUtils.currentLine=104988697;
 //BA.debugLineNum = 104988697;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdireccionesclientes.getObject()));
RDebugUtils.currentLine=104988698;
 //BA.debugLineNum = 104988698;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=104988699;
 //BA.debugLineNum = 104988699;BA.debugLine="rsDireccionesClientes.close";
_rsdireccionesclientes.Close();
RDebugUtils.currentLine=104988700;
 //BA.debugLineNum = 104988700;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=104988701;
 //BA.debugLineNum = 104988701;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=104988702;
 //BA.debugLineNum = 104988702;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=104988703;
 //BA.debugLineNum = 104988703;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=104988704;
 //BA.debugLineNum = 104988704;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=104988706;
 //BA.debugLineNum = 104988706;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=104988707;
 //BA.debugLineNum = 104988707;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=104988708;
 //BA.debugLineNum = 104988708;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=104988709;
 //BA.debugLineNum = 104988709;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=104988710;
 //BA.debugLineNum = 104988710;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=104988713;
 //BA.debugLineNum = 104988713;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=104988715;
 //BA.debugLineNum = 104988715;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=104988716;
 //BA.debugLineNum = 104988716;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=104988717;
 //BA.debugLineNum = 104988717;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=104988718;
 //BA.debugLineNum = 104988718;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrardirecciondefectofacturacioncliente"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=104988722;
 //BA.debugLineNum = 104988722;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mostrartodasdireccionescliente(b4j.docU.ctestsinfomagento __ref,int _idclientesel) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";
if (Debug.shouldDelegate(ba, "mostrartodasdireccionescliente", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mostrartodasdireccionescliente", new Object[] {_idclientesel}));}
ResumableSub_MostrarTodasDireccionesCliente rsub = new ResumableSub_MostrarTodasDireccionesCliente(this,__ref,_idclientesel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MostrarTodasDireccionesCliente extends BA.ResumableSub {
public ResumableSub_MostrarTodasDireccionesCliente(b4j.docU.ctestsinfomagento parent,b4j.docU.ctestsinfomagento __ref,int _idclientesel) {
this.parent = parent;
this.__ref = __ref;
this._idclientesel = _idclientesel;
this.__ref = parent;
}
b4j.docU.ctestsinfomagento __ref;
b4j.docU.ctestsinfomagento parent;
int _idclientesel;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rsdireccionesclientes = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="ctestsinfomagento";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=105185281;
 //BA.debugLineNum = 105185281;BA.debugLine="JamLoadingIndicator1.MensajeLoading=\"Cargando Dir";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando Direcciones Cliente..."));
RDebugUtils.currentLine=105185282;
 //BA.debugLineNum = 105185282;BA.debugLine="JamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=105185283;
 //BA.debugLineNum = 105185283;BA.debugLine="Wait For(CargaInfoDireccionesClienteMagento(IDCli";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), __ref._cargainfodireccionesclientemagento /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idclientesel));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=105185284;
 //BA.debugLineNum = 105185284;BA.debugLine="If Not(Success) Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(_success)) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=105185285;
 //BA.debugLineNum = 105185285;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105185286;
 //BA.debugLineNum = 105185286;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"Error car";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","Error cargando Direcciones Cliente B2B"));
this.state = 31;
return;
case 31:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=105185287;
 //BA.debugLineNum = 105185287;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=105185293;
 //BA.debugLineNum = 105185293;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaB2BDireccionesCliente.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=105185294;
 //BA.debugLineNum = 105185294;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _rsub);
this.state = 32;
return;
case 32:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105185295;
 //BA.debugLineNum = 105185295;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("8105185295",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=105185296;
 //BA.debugLineNum = 105185296;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 8;
if (parent.__c.Not(BA.ObjectToBoolean(_mres.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=105185297;
 //BA.debugLineNum = 105185297;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105185298;
 //BA.debugLineNum = 105185298;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105185299;
 //BA.debugLineNum = 105185299;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 33;
return;
case 33:
//C
this.state = 8;
;
RDebugUtils.currentLine=105185300;
 //BA.debugLineNum = 105185300;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=105185301;
 //BA.debugLineNum = 105185301;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=105185304;
 //BA.debugLineNum = 105185304;BA.debugLine="Dim rsDireccionesClientes As ResultSet=mSQL.ExecQ";
_rsdireccionesclientes = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rsdireccionesclientes = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblB2BDireccionesCliente");
RDebugUtils.currentLine=105185305;
 //BA.debugLineNum = 105185305;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rsdireccionesclientes.getObject()));
RDebugUtils.currentLine=105185306;
 //BA.debugLineNum = 105185306;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _rsub);
this.state = 34;
return;
case 34:
//C
this.state = 9;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=105185307;
 //BA.debugLineNum = 105185307;BA.debugLine="rsDireccionesClientes.close";
_rsdireccionesclientes.Close();
RDebugUtils.currentLine=105185308;
 //BA.debugLineNum = 105185308;BA.debugLine="JamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=105185309;
 //BA.debugLineNum = 105185309;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 9:
//if
this.state = 29;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=105185310;
 //BA.debugLineNum = 105185310;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 12:
//if
this.state = 19;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=105185311;
 //BA.debugLineNum = 105185311;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=105185312;
 //BA.debugLineNum = 105185312;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 15;
;
RDebugUtils.currentLine=105185314;
 //BA.debugLineNum = 105185314;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=105185315;
 //BA.debugLineNum = 105185315;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=105185316;
 //BA.debugLineNum = 105185316;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 15:
//if
this.state = 18;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=105185317;
 //BA.debugLineNum = 105185317;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=105185318;
 //BA.debugLineNum = 105185318;BA.debugLine="Return";
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
 if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=105185321;
 //BA.debugLineNum = 105185321;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=105185323;
 //BA.debugLineNum = 105185323;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 19:
//if
this.state = 28;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=105185324;
 //BA.debugLineNum = 105185324;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
if (true) {
parent.__c.ReturnFromResumableSub(this,null);return;};
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=105185325;
 //BA.debugLineNum = 105185325;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=105185326;
 //BA.debugLineNum = 105185326;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "ctestsinfomagento", "mostrartodasdireccionescliente"), _msa);
this.state = 37;
return;
case 37:
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
RDebugUtils.currentLine=105185330;
 //BA.debugLineNum = 105185330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}