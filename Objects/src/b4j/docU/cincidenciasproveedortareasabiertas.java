package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cincidenciasproveedortareasabiertas extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cincidenciasproveedortareasabiertas", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cincidenciasproveedortareasabiertas.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public b4j.docU.jamtableview _jamtableview1 = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _permisomodulousuario = "";
public String _departamentoemisor = "";
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textareadialog = null;
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
public String  _initialize(b4j.docU.cincidenciasproveedortareasabiertas __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=32112642;
 //BA.debugLineNum = 32112642;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),_main._nombreaplicacion /*String*/ +".db",__c.True);
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cincidenciasproveedortareasabiertas parent,b4j.docU.cincidenciasproveedortareasabiertas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedortareasabiertas __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=32178179;
 //BA.debugLineNum = 32178179;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=32178181;
 //BA.debugLineNum = 32178181;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=32178182;
 //BA.debugLineNum = 32178182;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=32178183;
 //BA.debugLineNum = 32178183;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=32178185;
 //BA.debugLineNum = 32178185;BA.debugLine="frm.RootPane.LoadLayout(\"scrIncidenciasProveedorL";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrIncidenciasProveedorListaTareasPendientes");
RDebugUtils.currentLine=32178186;
 //BA.debugLineNum = 32178186;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "show"),(int) (0));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=32178188;
 //BA.debugLineNum = 32178188;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Lista Tareas";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Lista Tareas Pendientes Incidencias Proveedor");
RDebugUtils.currentLine=32178190;
 //BA.debugLineNum = 32178190;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=32178191;
 //BA.debugLineNum = 32178191;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=32178196;
 //BA.debugLineNum = 32178196;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=32178200;
 //BA.debugLineNum = 32178200;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=32178204;
 //BA.debugLineNum = 32178204;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=32178205;
 //BA.debugLineNum = 32178205;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.True);
RDebugUtils.currentLine=32178207;
 //BA.debugLineNum = 32178207;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Actualizar Datos","Actualizar",BA.ObjectToString(parent.__c.Chr(((int)0xf021))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=32178208;
 //BA.debugLineNum = 32178208;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=32178209;
 //BA.debugLineNum = 32178209;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Ficha Incidencia Proveedor","FichaIncidenciaProveedor",BA.ObjectToString(parent.__c.Chr(((int)0xf0f6))));
RDebugUtils.currentLine=32178210;
 //BA.debugLineNum = 32178210;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Ver Descripción Incidencia","VerDescripcionIncidencia",BA.ObjectToString(parent.__c.Chr(((int)0xf022))));
RDebugUtils.currentLine=32178216;
 //BA.debugLineNum = 32178216;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaIncidenciasProveedorTareasPendientes.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=32178217;
 //BA.debugLineNum = 32178217;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "show"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=32178218;
 //BA.debugLineNum = 32178218;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("832178218",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=32178219;
 //BA.debugLineNum = 32178219;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=32178220;
 //BA.debugLineNum = 32178220;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=32178221;
 //BA.debugLineNum = 32178221;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "show"), _msa);
this.state = 7;
return;
case 7:
//C
this.state = 4;
;
RDebugUtils.currentLine=32178222;
 //BA.debugLineNum = 32178222;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=32178223;
 //BA.debugLineNum = 32178223;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=32178229;
 //BA.debugLineNum = 32178229;BA.debugLine="jamTableView1.AsignarCellFactoryColumnaFecha(Arra";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._asignarcellfactorycolumnafecha /*String*/ (null,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("FechaTarea")}));
RDebugUtils.currentLine=32178232;
 //BA.debugLineNum = 32178232;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=32178234;
 //BA.debugLineNum = 32178234;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _abrirfichaincidenciaproveedor(b4j.docU.cincidenciasproveedortareasabiertas __ref,int _idincprovsel,String _incprov) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "abrirfichaincidenciaproveedor", false))
	 {return ((String) Debug.delegate(ba, "abrirfichaincidenciaproveedor", new Object[] {_idincprovsel,_incprov}));}
b4j.docU.cincidenciaproveedorficha _cfichaincprov = null;
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Sub AbrirFichaIncidenciaProveedor(IDIncProvSel As";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="Dim cFichaIncProv As cIncidenciaProveedorFicha";
_cfichaincprov = new b4j.docU.cincidenciaproveedorficha();
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="cFichaIncProv.Initialize(IDIncProvSel, IncProv)";
_cfichaincprov._initialize /*String*/ (null,ba,_idincprovsel,_incprov);
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="cFichaIncProv.DepartamentoEmisor=DepartamentoEmis";
_cfichaincprov._departamentoemisor /*String*/  = __ref._departamentoemisor /*String*/ ;
RDebugUtils.currentLine=32964612;
 //BA.debugLineNum = 32964612;BA.debugLine="cFichaIncProv.Show";
_cfichaincprov._show /*void*/ (null);
RDebugUtils.currentLine=32964613;
 //BA.debugLineNum = 32964613;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=32964614;
 //BA.debugLineNum = 32964614;BA.debugLine="End Sub";
return "";
}
public void  _actualizardatos(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cincidenciasproveedortareasabiertas parent,b4j.docU.cincidenciasproveedortareasabiertas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedortareasabiertas __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Cargando dat";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Cargando datos lista tareas pendientes incidencias proveedor..."));
RDebugUtils.currentLine=32505861;
 //BA.debugLineNum = 32505861;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=32505862;
 //BA.debugLineNum = 32505862;BA.debugLine="Wait For(ActualizarDatosLista) complete (mRes As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), __ref._actualizardatoslista /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=32505863;
 //BA.debugLineNum = 32505863;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=32505864;
 //BA.debugLineNum = 32505864;BA.debugLine="If Accion=\"Salir\" Then";
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
RDebugUtils.currentLine=32505865;
 //BA.debugLineNum = 32505865;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=32505866;
 //BA.debugLineNum = 32505866;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=32505867;
 //BA.debugLineNum = 32505867;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=32505875;
 //BA.debugLineNum = 32505875;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblIncidenciasProveedorListaTareasPendientes");
RDebugUtils.currentLine=32505876;
 //BA.debugLineNum = 32505876;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=32505877;
 //BA.debugLineNum = 32505877;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=32505878;
 //BA.debugLineNum = 32505878;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=32505879;
 //BA.debugLineNum = 32505879;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=32505880;
 //BA.debugLineNum = 32505880;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 5:
//if
this.state = 25;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=32505881;
 //BA.debugLineNum = 32505881;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 8:
//if
this.state = 15;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=32505882;
 //BA.debugLineNum = 32505882;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=32505883;
 //BA.debugLineNum = 32505883;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
RDebugUtils.currentLine=32505885;
 //BA.debugLineNum = 32505885;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=32505886;
 //BA.debugLineNum = 32505886;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (int) result[1];
;
RDebugUtils.currentLine=32505887;
 //BA.debugLineNum = 32505887;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=32505888;
 //BA.debugLineNum = 32505888;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=32505889;
 //BA.debugLineNum = 32505889;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=32505892;
 //BA.debugLineNum = 32505892;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=32505894;
 //BA.debugLineNum = 32505894;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 15:
//if
this.state = 24;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=32505895;
 //BA.debugLineNum = 32505895;BA.debugLine="If True<>mResultSetData.Get(\"ListaVacia\") Then";
if (true) break;

case 18:
//if
this.state = 23;
if (parent.__c.True!=BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=32505896;
 //BA.debugLineNum = 32505896;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDa";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=32505897;
 //BA.debugLineNum = 32505897;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatos"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 23;
;
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=32505899;
 //BA.debugLineNum = 32505899;BA.debugLine="jamTableView1.SetPlaceholderText(\"\")";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setplaceholdertext /*String*/ (null,"");
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
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=32505909;
 //BA.debugLineNum = 32505909;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatoslista(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "actualizardatoslista", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatoslista", null));}
ResumableSub_ActualizarDatosLista rsub = new ResumableSub_ActualizarDatosLista(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosLista extends BA.ResumableSub {
public ResumableSub_ActualizarDatosLista(b4j.docU.cincidenciasproveedortareasabiertas parent,b4j.docU.cincidenciasproveedortareasabiertas __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedortareasabiertas __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="mSQL.ExecNonQuery(\"delete from tblIncidenciasProv";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("delete from tblIncidenciasProveedorListaTareasPendientes");
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=32636933;
 //BA.debugLineNum = 32636933;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32636934;
 //BA.debugLineNum = 32636934;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=32636936;
 //BA.debugLineNum = 32636936;BA.debugLine="Dim Comando As String=\"IncidenciasProveedorTareas";
_comando = "IncidenciasProveedorTareasPendientes";
RDebugUtils.currentLine=32636937;
 //BA.debugLineNum = 32636937;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=32636939;
 //BA.debugLineNum = 32636939;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatoslista"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=32636941;
 //BA.debugLineNum = 32636941;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=32636942;
 //BA.debugLineNum = 32636942;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=32636943;
 //BA.debugLineNum = 32636943;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=32636944;
 //BA.debugLineNum = 32636944;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatoslista"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=32636945;
 //BA.debugLineNum = 32636945;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=32636946;
 //BA.debugLineNum = 32636946;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=32636949;
 //BA.debugLineNum = 32636949;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=32636950;
 //BA.debugLineNum = 32636950;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=32636951;
 //BA.debugLineNum = 32636951;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay tarea";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay tareas de incidencias de proveedor pendientes.","Aviso");
RDebugUtils.currentLine=32636952;
 //BA.debugLineNum = 32636952;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "actualizardatoslista"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=32636953;
 //BA.debugLineNum = 32636953;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=32636954;
 //BA.debugLineNum = 32636954;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=32636956;
 //BA.debugLineNum = 32636956;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=32636960;
 //BA.debugLineNum = 32636960;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=32636961;
 //BA.debugLineNum = 32636961;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=32636963;
 //BA.debugLineNum = 32636963;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblIncidenciasProveedorListaTareasPendientes",_lstreg);
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
RDebugUtils.currentLine=32636966;
 //BA.debugLineNum = 32636966;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=32636967;
 //BA.debugLineNum = 32636967;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.cincidenciasproveedortareasabiertas __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatoscabeceraincidencia(b4j.docU.cincidenciasproveedortareasabiertas __ref,int _idincsel,String _incidenciaproveedorsel) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "cargadatoscabeceraincidencia", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatoscabeceraincidencia", new Object[] {_idincsel,_incidenciaproveedorsel}));}
ResumableSub_CargaDatosCabeceraIncidencia rsub = new ResumableSub_CargaDatosCabeceraIncidencia(this,__ref,_idincsel,_incidenciaproveedorsel);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosCabeceraIncidencia extends BA.ResumableSub {
public ResumableSub_CargaDatosCabeceraIncidencia(b4j.docU.cincidenciasproveedortareasabiertas parent,b4j.docU.cincidenciasproveedortareasabiertas __ref,int _idincsel,String _incidenciaproveedorsel) {
this.parent = parent;
this.__ref = __ref;
this._idincsel = _idincsel;
this._incidenciaproveedorsel = _incidenciaproveedorsel;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedortareasabiertas __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
int _idincsel;
String _incidenciaproveedorsel;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="Dim mData0 As Map";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33095684;
 //BA.debugLineNum = 33095684;BA.debugLine="mData0.Initialize";
_mdata0.Initialize();
RDebugUtils.currentLine=33095685;
 //BA.debugLineNum = 33095685;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=33095686;
 //BA.debugLineNum = 33095686;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=33095687;
 //BA.debugLineNum = 33095687;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=33095688;
 //BA.debugLineNum = 33095688;BA.debugLine="mRes.Put(\"mData0\",mData0)";
_mres.Put((Object)("mData0"),(Object)(_mdata0.getObject()));
RDebugUtils.currentLine=33095689;
 //BA.debugLineNum = 33095689;BA.debugLine="Dim Comando As String=\"IncidenciasProveedorDatosC";
_comando = "IncidenciasProveedorDatosCabeceraIncidencia";
RDebugUtils.currentLine=33095690;
 //BA.debugLineNum = 33095690;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(_idincsel)},parent);
RDebugUtils.currentLine=33095692;
 //BA.debugLineNum = 33095692;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "cargadatoscabeceraincidencia"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=33095694;
 //BA.debugLineNum = 33095694;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=33095695;
 //BA.debugLineNum = 33095695;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=33095696;
 //BA.debugLineNum = 33095696;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=33095697;
 //BA.debugLineNum = 33095697;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "cargadatoscabeceraincidencia"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=33095698;
 //BA.debugLineNum = 33095698;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=33095699;
 //BA.debugLineNum = 33095699;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=33095702;
 //BA.debugLineNum = 33095702;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=33095703;
 //BA.debugLineNum = 33095703;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=33095704;
 //BA.debugLineNum = 33095704;BA.debugLine="Dim msa As Object=xui.MsgboxAsync($\"No existe l";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,("No existe la incidencia seleccionada ("+parent.__c.SmartStringFormatter("",(Object)(_incidenciaproveedorsel))+")"),"Aviso");
RDebugUtils.currentLine=33095705;
 //BA.debugLineNum = 33095705;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "cargadatoscabeceraincidencia"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 11;
;
RDebugUtils.currentLine=33095706;
 //BA.debugLineNum = 33095706;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=33095707;
 //BA.debugLineNum = 33095707;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=33095709;
 //BA.debugLineNum = 33095709;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=33095710;
 //BA.debugLineNum = 33095710;BA.debugLine="mData0=lstReg.Get(0)";
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=33095711;
 //BA.debugLineNum = 33095711;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=33095712;
 //BA.debugLineNum = 33095712;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=33095713;
 //BA.debugLineNum = 33095713;BA.debugLine="mRes.Put(\"mData0\", mData0)";
_mres.Put((Object)("mData0"),(Object)(_mdata0.getObject()));
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
RDebugUtils.currentLine=33095716;
 //BA.debugLineNum = 33095716;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=33095717;
 //BA.debugLineNum = 33095717;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=32047107;
 //BA.debugLineNum = 32047107;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=32047108;
 //BA.debugLineNum = 32047108;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=32047111;
 //BA.debugLineNum = 32047111;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=32047112;
 //BA.debugLineNum = 32047112;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=32047114;
 //BA.debugLineNum = 32047114;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=32047115;
 //BA.debugLineNum = 32047115;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=32047117;
 //BA.debugLineNum = 32047117;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=32047118;
 //BA.debugLineNum = 32047118;BA.debugLine="Public DepartamentoEmisor As String";
_departamentoemisor = "";
RDebugUtils.currentLine=32047121;
 //BA.debugLineNum = 32047121;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=32047122;
 //BA.debugLineNum = 32047122;BA.debugLine="Private TextAreaDialog As TextArea";
_textareadialog = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=32047123;
 //BA.debugLineNum = 32047123;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
String _screartabla = "";
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="mSQL.ExecNonQuery(\"drop table if exists tblIncide";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table if exists tblIncidenciasProveedorListaTareasPendientes");
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="Dim sCrearTabla As String=$\"CREATE TABLE IF NOT E";
_screartabla = ("CREATE TABLE IF NOT EXISTS [tblIncidenciasProveedorListaTareasPendientes] ([IDTarea] INTEGER\n"+"	, [IDIncidenciaProveedor] INTEGER, [IncidenciaProveedor] TEXT, [FechaTarea] INTEGER, [DepartamentoAsignadoTarea] TEXT\n"+"	, [Proveedor] TEXT, [NombreProveedor] TEXT, [DescripcionIncidencia] TEXT, [UsuarioCreacionTarea] TEXT, [DescripcionTarea] TEXT)");
RDebugUtils.currentLine=32571398;
 //BA.debugLineNum = 32571398;BA.debugLine="mSQL.ExecNonQuery(sCrearTabla)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_screartabla);
RDebugUtils.currentLine=32571401;
 //BA.debugLineNum = 32571401;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.cincidenciasproveedortareasabiertas __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.cincidenciasproveedortareasabiertas __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_celldobleclick(b4j.docU.cincidenciasproveedortareasabiertas __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}));}
int _filasel = 0;
int _idincidenciaproveedorsel = 0;
String _incidenciaproveedorsel = "";
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Sub jamTableView1_CellDobleClick(DatosCeldaSelecci";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="Dim FilaSel As Int=DatosCeldaSeleccionada.Fila";
_filasel = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaSel";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=32899075;
 //BA.debugLineNum = 32899075;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableView1";
_idincidenciaproveedorsel = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDIncidenciaProveedor")));
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableView";
_incidenciaproveedorsel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IncidenciaProveedor"));
RDebugUtils.currentLine=32899078;
 //BA.debugLineNum = 32899078;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProveed";
__ref._abrirfichaincidenciaproveedor /*String*/ (null,_idincidenciaproveedorsel,_incidenciaproveedorsel);
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_contextmenuitem_action(b4j.docU.cincidenciasproveedortareasabiertas __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}));}
int _filasel = 0;
int _idincidenciaproveedorsel = 0;
String _incidenciaproveedorsel = "";
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"FichaIncidenciaProveedor","VerDescripcionIncidencia")) {
case 0: {
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableVie";
_idincidenciaproveedorsel = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDIncidenciaProveedor")));
RDebugUtils.currentLine=32833541;
 //BA.debugLineNum = 32833541;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableVi";
_incidenciaproveedorsel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IncidenciaProveedor"));
RDebugUtils.currentLine=32833543;
 //BA.debugLineNum = 32833543;BA.debugLine="AbrirFichaIncidenciaProveedor(IDIncidenciaProve";
__ref._abrirfichaincidenciaproveedor /*String*/ (null,_idincidenciaproveedorsel,_incidenciaproveedorsel);
 break; }
case 1: {
RDebugUtils.currentLine=32833546;
 //BA.debugLineNum = 32833546;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=32833547;
 //BA.debugLineNum = 32833547;BA.debugLine="Dim IDIncidenciaProveedorSel As Int=jamTableVie";
_idincidenciaproveedorsel = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IDIncidenciaProveedor")));
RDebugUtils.currentLine=32833548;
 //BA.debugLineNum = 32833548;BA.debugLine="Dim IncidenciaProveedorSel As String=jamTableVi";
_incidenciaproveedorsel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filasel,"IncidenciaProveedor"));
RDebugUtils.currentLine=32833549;
 //BA.debugLineNum = 32833549;BA.debugLine="VerDecripcionIncidencia(IDIncidenciaProveedorSe";
__ref._verdecripcionincidencia /*void*/ (null,_idincidenciaproveedorsel,_incidenciaproveedorsel);
 break; }
}
;
RDebugUtils.currentLine=32833551;
 //BA.debugLineNum = 32833551;BA.debugLine="End Sub";
return "";
}
public void  _verdecripcionincidencia(b4j.docU.cincidenciasproveedortareasabiertas __ref,int _idincsel,String _incidenciaproveedorsel) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "verdecripcionincidencia", false))
	 {Debug.delegate(ba, "verdecripcionincidencia", new Object[] {_idincsel,_incidenciaproveedorsel}); return;}
ResumableSub_VerDecripcionIncidencia rsub = new ResumableSub_VerDecripcionIncidencia(this,__ref,_idincsel,_incidenciaproveedorsel);
rsub.resume(ba, null);
}
public static class ResumableSub_VerDecripcionIncidencia extends BA.ResumableSub {
public ResumableSub_VerDecripcionIncidencia(b4j.docU.cincidenciasproveedortareasabiertas parent,b4j.docU.cincidenciasproveedortareasabiertas __ref,int _idincsel,String _incidenciaproveedorsel) {
this.parent = parent;
this.__ref = __ref;
this._idincsel = _idincsel;
this._incidenciaproveedorsel = _incidenciaproveedorsel;
this.__ref = parent;
}
b4j.docU.cincidenciasproveedortareasabiertas __ref;
b4j.docU.cincidenciasproveedortareasabiertas parent;
int _idincsel;
String _incidenciaproveedorsel;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;
String _descripcionincidencia = "";
int _dialogtitlebarheightant = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pbasetextarea = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"\"";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)(""));
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="Wait For(CargaDatosCabeceraIncidencia(IDIncSel, I";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "verdecripcionincidencia"), __ref._cargadatoscabeceraincidencia /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_idincsel,_incidenciaproveedorsel));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=33030149;
 //BA.debugLineNum = 33030149;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=33030150;
 //BA.debugLineNum = 33030150;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=33030152;
 //BA.debugLineNum = 33030152;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=33030155;
 //BA.debugLineNum = 33030155;BA.debugLine="Dim mData0 As Map=mRes.Get(\"mData0\")";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mData0"))));
RDebugUtils.currentLine=33030156;
 //BA.debugLineNum = 33030156;BA.debugLine="Dim DescripcionIncidencia As String=mData0.Get(\"D";
_descripcionincidencia = BA.ObjectToString(_mdata0.Get((Object)("DescripcionIncidencia")));
RDebugUtils.currentLine=33030158;
 //BA.debugLineNum = 33030158;BA.debugLine="Dim DialogTitleBarHeightAnt As Int=Dialog.TitleBa";
_dialogtitlebarheightant = __ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/ ;
RDebugUtils.currentLine=33030159;
 //BA.debugLineNum = 33030159;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=33030160;
 //BA.debugLineNum = 33030160;BA.debugLine="Dialog.Title=$\"Descripción de la incidencia.\"$";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)(("Descripción de la incidencia."));
RDebugUtils.currentLine=33030162;
 //BA.debugLineNum = 33030162;BA.debugLine="Dim pBaseTextArea As B4XView = xui.CreatePanel(\"\"";
_pbasetextarea = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pbasetextarea = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33030163;
 //BA.debugLineNum = 33030163;BA.debugLine="pBaseTextArea.SetLayoutAnimated(0, 0, 0, 600dip,";
_pbasetextarea.SetLayoutAnimated((int) (0),0,0,parent.__c.DipToCurrent((int) (600)),parent.__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=33030164;
 //BA.debugLineNum = 33030164;BA.debugLine="pBaseTextArea.LoadLayout(\"scrDialogTextArea\")";
_pbasetextarea.LoadLayout("scrDialogTextArea",ba);
RDebugUtils.currentLine=33030166;
 //BA.debugLineNum = 33030166;BA.debugLine="TextAreaDialog.Text=DescripcionIncidencia";
__ref._textareadialog /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(_descripcionincidencia);
RDebugUtils.currentLine=33030167;
 //BA.debugLineNum = 33030167;BA.debugLine="TextAreaDialog.As(JavaObject).RunMethod(\"setFont\"";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._textareadialog /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .getObject()))).RunMethod("setFont",new Object[]{(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)).ToNativeFont().getObject())});
RDebugUtils.currentLine=33030168;
 //BA.debugLineNum = 33030168;BA.debugLine="TextAreaDialog.As(JavaObject).RunMethod(\"setEdita";
((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._textareadialog /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .getObject()))).RunMethod("setEditable",new Object[]{(Object)(parent.__c.False)});
RDebugUtils.currentLine=33030170;
 //BA.debugLineNum = 33030170;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(pBaseT";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_pbasetextarea,(Object)("OK"),(Object)(""),(Object)(""));
RDebugUtils.currentLine=33030178;
 //BA.debugLineNum = 33030178;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=33030179;
 //BA.debugLineNum = 33030179;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=33030180;
 //BA.debugLineNum = 33030180;BA.debugLine="bOK.Left=5dip";
_bok.setLeft(parent.__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=33030182;
 //BA.debugLineNum = 33030182;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cincidenciasproveedortareasabiertas", "verdecripcionincidencia"), _rsub);
this.state = 6;
return;
case 6:
//C
this.state = -1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=33030183;
 //BA.debugLineNum = 33030183;BA.debugLine="Dialog.TitleBarHeight=DialogTitleBarHeightAnt";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = _dialogtitlebarheightant;
RDebugUtils.currentLine=33030186;
 //BA.debugLineNum = 33030186;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableview1_menubarmenuitem_action(b4j.docU.cincidenciasproveedortareasabiertas __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cincidenciasproveedortareasabiertas";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar")) {
case 0: {
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 break; }
}
;
RDebugUtils.currentLine=32768007;
 //BA.debugLineNum = 32768007;BA.debugLine="End Sub";
return "";
}
}