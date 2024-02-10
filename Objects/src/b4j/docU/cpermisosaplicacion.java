package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cpermisosaplicacion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cpermisosaplicacion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cpermisosaplicacion.class).invoke(this, new Object[] {null});
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
public b4j.docU.jamtableview _jamtableview1 = null;
public b4j.docU.jamformregistro _jfreg = null;
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
public String  _initialize(b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=158072832;
 //BA.debugLineNum = 158072832;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=158072834;
 //BA.debugLineNum = 158072834;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cpermisosaplicacion __ref) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cpermisosaplicacion parent,b4j.docU.cpermisosaplicacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cpermisosaplicacion __ref;
b4j.docU.cpermisosaplicacion parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=158138370;
 //BA.debugLineNum = 158138370;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=158138371;
 //BA.debugLineNum = 158138371;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=158138372;
 //BA.debugLineNum = 158138372;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=158138373;
 //BA.debugLineNum = 158138373;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=158138374;
 //BA.debugLineNum = 158138374;BA.debugLine="frm.Icon = fx.LoadImage(File.DirAssets,\"key-perso";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(parent.__c.File.getDirAssets(),"key-person32.png").getObject()));
RDebugUtils.currentLine=158138375;
 //BA.debugLineNum = 158138375;BA.debugLine="frm.RootPane.LoadLayout(\"scrPermisosAplicacion\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrPermisosAplicacion");
RDebugUtils.currentLine=158138376;
 //BA.debugLineNum = 158138376;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "show"),(int) (0));
this.state = 10;
return;
case 10:
//C
this.state = 1;
;
RDebugUtils.currentLine=158138379;
 //BA.debugLineNum = 158138379;BA.debugLine="frm.Title=\"Permisos aplicacion\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Permisos aplicacion");
RDebugUtils.currentLine=158138381;
 //BA.debugLineNum = 158138381;BA.debugLine="Dialog.Initialize (frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=158138383;
 //BA.debugLineNum = 158138383;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=158138388;
 //BA.debugLineNum = 158138388;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=158138390;
 //BA.debugLineNum = 158138390;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=158138391;
 //BA.debugLineNum = 158138391;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Editar Permiso","EditarPermiso",BA.ObjectToString(parent.__c.Chr(((int)0xf044))));
RDebugUtils.currentLine=158138392;
 //BA.debugLineNum = 158138392;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Eliminar Permiso","EliminarPermiso",BA.ObjectToString(parent.__c.Chr(((int)0xf014))));
RDebugUtils.currentLine=158138393;
 //BA.debugLineNum = 158138393;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Copiar Permiso a Otro Usuario","CopiarPermisoOtroUsuario",BA.ObjectToString(parent.__c.Chr(((int)0xf0c5))));
RDebugUtils.currentLine=158138394;
 //BA.debugLineNum = 158138394;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Copiar Todos Permisos Aplicacion a Otro Usuario","CopiarTodosPermisosAplicacionOtroUsuario",BA.ObjectToString(parent.__c.Chr(((int)0xf0c5))));
RDebugUtils.currentLine=158138395;
 //BA.debugLineNum = 158138395;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Copiar Todos Permisos Todas Aplicaciones a Otro Usuario","CopiarTodosPermisosTodasAplicacionesOtroUsuario",BA.ObjectToString(parent.__c.Chr(((int)0xf0c5))));
RDebugUtils.currentLine=158138397;
 //BA.debugLineNum = 158138397;BA.debugLine="jamTableView1.AddMenuItemFontAwesomeToMenuInMenuB";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addmenuitemfontawesometomenuinmenubar /*String*/ (null,"Nuevo Permiso","NuevoPermiso",BA.ObjectToString(parent.__c.Chr(((int)0xf196))),__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ );
RDebugUtils.currentLine=158138400;
 //BA.debugLineNum = 158138400;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaPermisosAplicacion.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=158138401;
 //BA.debugLineNum = 158138401;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "show"), _rsub);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=158138402;
 //BA.debugLineNum = 158138402;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("9158138402",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=158138403;
 //BA.debugLineNum = 158138403;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=158138404;
 //BA.debugLineNum = 158138404;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=158138405;
 //BA.debugLineNum = 158138405;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "show"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 4;
;
RDebugUtils.currentLine=158138406;
 //BA.debugLineNum = 158138406;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=158138407;
 //BA.debugLineNum = 158138407;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=158138411;
 //BA.debugLineNum = 158138411;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";

case 4:
//if
this.state = 9;
if (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
if (true) break;

case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=158138413;
 //BA.debugLineNum = 158138413;BA.debugLine="mSQL.InitializeSQLite(Main.UserFolder, Main.Nombr";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(parent._main._userfolder /*String*/ ,parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=158138415;
 //BA.debugLineNum = 158138415;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=158138417;
 //BA.debugLineNum = 158138417;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=158138418;
 //BA.debugLineNum = 158138418;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatos(b4j.docU.cpermisosaplicacion __ref) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "actualizardatos", true))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.cpermisosaplicacion parent,b4j.docU.cpermisosaplicacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cpermisosaplicacion __ref;
b4j.docU.cpermisosaplicacion parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=158203907;
 //BA.debugLineNum = 158203907;BA.debugLine="Wait For(ActualizarDatosMysql) complete (mRes As";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatos"), __ref._actualizardatosmysql /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=158203908;
 //BA.debugLineNum = 158203908;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=158203909;
 //BA.debugLineNum = 158203909;BA.debugLine="If Accion<>\"OK\" Then";
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
RDebugUtils.currentLine=158203910;
 //BA.debugLineNum = 158203910;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=158203911;
 //BA.debugLineNum = 158203911;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=158203915;
 //BA.debugLineNum = 158203915;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblPermisosAplicacion order by ObjetoPermiso, IDUsuario");
RDebugUtils.currentLine=158203916;
 //BA.debugLineNum = 158203916;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=158203917;
 //BA.debugLineNum = 158203917;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=158203918;
 //BA.debugLineNum = 158203918;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=158203919;
 //BA.debugLineNum = 158203919;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=158203920;
 //BA.debugLineNum = 158203920;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
if (true) break;

case 8:
//if
this.state = 17;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=158203921;
 //BA.debugLineNum = 158203921;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 11:
//if
this.state = 16;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
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
RDebugUtils.currentLine=158203922;
 //BA.debugLineNum = 158203922;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=158203923;
 //BA.debugLineNum = 158203923;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 17;
;
 if (true) break;
;
RDebugUtils.currentLine=158203925;
 //BA.debugLineNum = 158203925;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";

case 17:
//if
this.state = 24;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=158203926;
 //BA.debugLineNum = 158203926;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=158203927;
 //BA.debugLineNum = 158203927;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 20;
;
RDebugUtils.currentLine=158203929;
 //BA.debugLineNum = 158203929;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=158203930;
 //BA.debugLineNum = 158203930;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatos"), _msa);
this.state = 30;
return;
case 30:
//C
this.state = 20;
_rint = (int) result[1];
;
RDebugUtils.currentLine=158203931;
 //BA.debugLineNum = 158203931;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 20:
//if
this.state = 23;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=158203932;
 //BA.debugLineNum = 158203932;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=158203933;
 //BA.debugLineNum = 158203933;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=158203936;
 //BA.debugLineNum = 158203936;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
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
RDebugUtils.currentLine=158203940;
 //BA.debugLineNum = 158203940;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=158203943;
 //BA.debugLineNum = 158203943;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosmysql(b4j.docU.cpermisosaplicacion __ref) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "actualizardatosmysql", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosmysql", null));}
ResumableSub_ActualizarDatosMysql rsub = new ResumableSub_ActualizarDatosMysql(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosMysql extends BA.ResumableSub {
public ResumableSub_ActualizarDatosMysql(b4j.docU.cpermisosaplicacion parent,b4j.docU.cpermisosaplicacion __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cpermisosaplicacion __ref;
b4j.docU.cpermisosaplicacion parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=158597121;
 //BA.debugLineNum = 158597121;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblPermisosAplicac";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblPermisosAplicacion");
RDebugUtils.currentLine=158597122;
 //BA.debugLineNum = 158597122;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=158597123;
 //BA.debugLineNum = 158597123;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=158597124;
 //BA.debugLineNum = 158597124;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=158597125;
 //BA.debugLineNum = 158597125;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=158597126;
 //BA.debugLineNum = 158597126;BA.debugLine="Dim Comando As String=\"PermisosAplicacionEdicion\"";
_comando = "PermisosAplicacionEdicion";
RDebugUtils.currentLine=158597127;
 //BA.debugLineNum = 158597127;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(Main.";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(parent._main._nombreaplicacion /*String*/ ),(Object)("Windows")},parent);
RDebugUtils.currentLine=158597129;
 //BA.debugLineNum = 158597129;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatosmysql"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=158597130;
 //BA.debugLineNum = 158597130;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=158597131;
 //BA.debugLineNum = 158597131;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=158597132;
 //BA.debugLineNum = 158597132;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatosmysql"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=158597133;
 //BA.debugLineNum = 158597133;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=158597134;
 //BA.debugLineNum = 158597134;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=158597137;
 //BA.debugLineNum = 158597137;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=158597138;
 //BA.debugLineNum = 158597138;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=158597139;
 //BA.debugLineNum = 158597139;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=158597140;
 //BA.debugLineNum = 158597140;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Permisos para la aplicación actual ","Aviso");
RDebugUtils.currentLine=158597141;
 //BA.debugLineNum = 158597141;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "actualizardatosmysql"), _msa);
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
RDebugUtils.currentLine=158597143;
 //BA.debugLineNum = 158597143;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=158597144;
 //BA.debugLineNum = 158597144;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=158597147;
 //BA.debugLineNum = 158597147;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=158597149;
 //BA.debugLineNum = 158597149;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblPermisosAplicacion\"";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblPermisosAplicacion",_lstreg);
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
RDebugUtils.currentLine=158597152;
 //BA.debugLineNum = 158597152;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=158597153;
 //BA.debugLineNum = 158597153;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.cpermisosaplicacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "salirmodulo", true))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=158466048;
 //BA.debugLineNum = 158466048;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=158466049;
 //BA.debugLineNum = 158466049;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=158466051;
 //BA.debugLineNum = 158466051;BA.debugLine="End Sub";
return "";
}
public String  _btnsalir_click(b4j.docU.cpermisosaplicacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "btnsalir_click", true))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=158400512;
 //BA.debugLineNum = 158400512;BA.debugLine="Private Sub btnSalir_Click";
RDebugUtils.currentLine=158400513;
 //BA.debugLineNum = 158400513;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=158400514;
 //BA.debugLineNum = 158400514;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cpermisosaplicacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
RDebugUtils.currentLine=158007296;
 //BA.debugLineNum = 158007296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=158007297;
 //BA.debugLineNum = 158007297;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=158007298;
 //BA.debugLineNum = 158007298;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=158007299;
 //BA.debugLineNum = 158007299;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=158007301;
 //BA.debugLineNum = 158007301;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=158007303;
 //BA.debugLineNum = 158007303;BA.debugLine="Private mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=158007308;
 //BA.debugLineNum = 158007308;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=158007309;
 //BA.debugLineNum = 158007309;BA.debugLine="Private jFReg As jamFormRegistro";
_jfreg = new b4j.docU.jamformregistro();
RDebugUtils.currentLine=158007310;
 //BA.debugLineNum = 158007310;BA.debugLine="End Sub";
return "";
}
public String  _copiarpermisootrousuario(b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "copiarpermisootrousuario", true))
	 {return ((String) Debug.delegate(ba, "copiarpermisootrousuario", new Object[] {_mdata}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=158924800;
 //BA.debugLineNum = 158924800;BA.debugLine="Sub CopiarPermisoOtroUsuario(mData As Map)";
RDebugUtils.currentLine=158924801;
 //BA.debugLineNum = 158924801;BA.debugLine="mData.put(\"IDUsuario\",\"\")";
_mdata.Put((Object)("IDUsuario"),(Object)(""));
RDebugUtils.currentLine=158924802;
 //BA.debugLineNum = 158924802;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=158924803;
 //BA.debugLineNum = 158924803;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=158924804;
 //BA.debugLineNum = 158924804;BA.debugLine="m.Put(\"Aplicacion\",Main.NombreAplicacion)";
_m.Put((Object)("Aplicacion"),(Object)(_main._nombreaplicacion /*String*/ ));
RDebugUtils.currentLine=158924805;
 //BA.debugLineNum = 158924805;BA.debugLine="m.Put(\"OS\",\"Windows\")";
_m.Put((Object)("OS"),(Object)("Windows"));
RDebugUtils.currentLine=158924806;
 //BA.debugLineNum = 158924806;BA.debugLine="m.Put(\"ObjetoPermiso\",mData.get(\"ObjetoPermiso\"))";
_m.Put((Object)("ObjetoPermiso"),_mdata.Get((Object)("ObjetoPermiso")));
RDebugUtils.currentLine=158924807;
 //BA.debugLineNum = 158924807;BA.debugLine="m.Put(\"TipoPermiso\",mData.get(\"TipoPermiso\"))";
_m.Put((Object)("TipoPermiso"),_mdata.Get((Object)("TipoPermiso")));
RDebugUtils.currentLine=158924808;
 //BA.debugLineNum = 158924808;BA.debugLine="jFReg.Initialize(Me,\"jFReg\",frm,\"Nuevo Permiso\",\"";
__ref._jfreg /*b4j.docU.jamformregistro*/ ._initialize /*String*/ (null,ba,this,"jFReg",__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Nuevo Permiso","Nuevo","PermisosAplicacionEdicionFormRegistro.json",_m);
RDebugUtils.currentLine=158924832;
 //BA.debugLineNum = 158924832;BA.debugLine="End Sub";
return "";
}
public void  _copiartodospermisosaplicacionotrousuario(b4j.docU.cpermisosaplicacion __ref,String _usuarioorigen) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "copiartodospermisosaplicacionotrousuario", true))
	 {Debug.delegate(ba, "copiartodospermisosaplicacionotrousuario", new Object[] {_usuarioorigen}); return;}
ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario rsub = new ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario(this,__ref,_usuarioorigen);
rsub.resume(ba, null);
}
public static class ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario extends BA.ResumableSub {
public ResumableSub_CopiarTodosPermisosAplicacionOtroUsuario(b4j.docU.cpermisosaplicacion parent,b4j.docU.cpermisosaplicacion __ref,String _usuarioorigen) {
this.parent = parent;
this.__ref = __ref;
this._usuarioorigen = _usuarioorigen;
this.__ref = parent;
}
b4j.docU.cpermisosaplicacion __ref;
b4j.docU.cpermisosaplicacion parent;
String _usuarioorigen;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
b4j.docU.b4xinputtemplate _inputdlg = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _rint = 0;
String _idusuariodestino = "";
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _aplicacion = "";
String _os = "";
String _objetopermiso = "";
String _tipopermiso = "";
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
anywheresoftware.b4a.BA.IterableList group37;
int index37;
int groupLen37;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=158990341;
 //BA.debugLineNum = 158990341;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=158990342;
 //BA.debugLineNum = 158990342;BA.debugLine="Dim Comando As String=\"PermisosAplicacionUsuario\"";
_comando = "PermisosAplicacionUsuario";
RDebugUtils.currentLine=158990343;
 //BA.debugLineNum = 158990343;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(Main.";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(parent._main._nombreaplicacion /*String*/ ),(Object)("Windows")},parent);
RDebugUtils.currentLine=158990345;
 //BA.debugLineNum = 158990345;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), null);
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=158990346;
 //BA.debugLineNum = 158990346;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=158990347;
 //BA.debugLineNum = 158990347;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=158990348;
 //BA.debugLineNum = 158990348;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 12;
;
RDebugUtils.currentLine=158990351;
 //BA.debugLineNum = 158990351;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=158990354;
 //BA.debugLineNum = 158990354;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=158990357;
 //BA.debugLineNum = 158990357;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Permisos para la aplicación actual, para el usuario con ID "+_usuarioorigen,"Aviso");
RDebugUtils.currentLine=158990358;
 //BA.debugLineNum = 158990358;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 36;
return;
case 36:
//C
this.state = 11;
;
RDebugUtils.currentLine=158990359;
 //BA.debugLineNum = 158990359;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=158990365;
 //BA.debugLineNum = 158990365;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
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
RDebugUtils.currentLine=158990372;
 //BA.debugLineNum = 158990372;BA.debugLine="Dialog.Title=\"Indica Usuario\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Indica Usuario");
RDebugUtils.currentLine=158990373;
 //BA.debugLineNum = 158990373;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=158990374;
 //BA.debugLineNum = 158990374;BA.debugLine="Dialog.OverlayColor=0x00FFFFFF";
__ref._dialog /*b4j.docU.b4xdialog*/ ._overlaycolor /*int*/  = ((int)0x00ffffff);
RDebugUtils.currentLine=158990375;
 //BA.debugLineNum = 158990375;BA.debugLine="Dim InputDlg As B4XInputTemplate";
_inputdlg = new b4j.docU.b4xinputtemplate();
RDebugUtils.currentLine=158990376;
 //BA.debugLineNum = 158990376;BA.debugLine="InputDlg.Initialize";
_inputdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=158990377;
 //BA.debugLineNum = 158990377;BA.debugLine="InputDlg.lblTitle.Text=\"\"";
_inputdlg._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText("");
RDebugUtils.currentLine=158990378;
 //BA.debugLineNum = 158990378;BA.debugLine="InputDlg.Text=\"\"";
_inputdlg._text /*String*/  = "";
RDebugUtils.currentLine=158990381;
 //BA.debugLineNum = 158990381;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(Inpu";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_inputdlg),(Object)("OK"),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=158990382;
 //BA.debugLineNum = 158990382;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRes";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=158990383;
 //BA.debugLineNum = 158990383;BA.debugLine="bOK.TextSize=15";
_bok.setTextSize(15);
RDebugUtils.currentLine=158990384;
 //BA.debugLineNum = 158990384;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=158990385;
 //BA.debugLineNum = 158990385;BA.debugLine="bCancel.TextSize=15";
_bcancel.setTextSize(15);
RDebugUtils.currentLine=158990386;
 //BA.debugLineNum = 158990386;BA.debugLine="bCancel.Left=bCancel.Left-20dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=158990387;
 //BA.debugLineNum = 158990387;BA.debugLine="bCancel.Width=bCancel.Width+20dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=158990388;
 //BA.debugLineNum = 158990388;BA.debugLine="Wait For (rSub) complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _rsub);
this.state = 37;
return;
case 37:
//C
this.state = 13;
_rint = (int) result[1];
;
RDebugUtils.currentLine=158990390;
 //BA.debugLineNum = 158990390;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=158990391;
 //BA.debugLineNum = 158990391;BA.debugLine="Dim IDUsuarioDestino As String=InputDlg.Text.Trim";
_idusuariodestino = _inputdlg._text /*String*/ .trim().toUpperCase();
RDebugUtils.currentLine=158990393;
 //BA.debugLineNum = 158990393;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=158990394;
 //BA.debugLineNum = 158990394;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=158990395;
 //BA.debugLineNum = 158990395;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 19:
//for
this.state = 22;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group37 = _lstreg;
index37 = 0;
groupLen37 = group37.getSize();
this.state = 38;
if (true) break;

case 38:
//C
this.state = 22;
if (index37 < groupLen37) {
this.state = 21;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group37.Get(index37)));}
if (true) break;

case 39:
//C
this.state = 38;
index37++;
if (true) break;

case 21:
//C
this.state = 39;
RDebugUtils.currentLine=158990396;
 //BA.debugLineNum = 158990396;BA.debugLine="Dim Aplicacion As String=mData.Get(\"Aplicacion\")";
_aplicacion = BA.ObjectToString(_mdata.Get((Object)("Aplicacion")));
RDebugUtils.currentLine=158990397;
 //BA.debugLineNum = 158990397;BA.debugLine="Dim OS As String=mData.Get(\"OS\")";
_os = BA.ObjectToString(_mdata.Get((Object)("OS")));
RDebugUtils.currentLine=158990398;
 //BA.debugLineNum = 158990398;BA.debugLine="Dim ObjetoPermiso As String=mData.Get(\"ObjetoPer";
_objetopermiso = BA.ObjectToString(_mdata.Get((Object)("ObjetoPermiso")));
RDebugUtils.currentLine=158990399;
 //BA.debugLineNum = 158990399;BA.debugLine="Dim TipoPermiso As String=mData.Get(\"TipoPermiso";
_tipopermiso = BA.ObjectToString(_mdata.Get((Object)("TipoPermiso")));
RDebugUtils.currentLine=158990400;
 //BA.debugLineNum = 158990400;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Nu";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("NuevoPermisoAplicacion",new Object[]{(Object)(_aplicacion),(Object)(_os),(Object)(_idusuariodestino),(Object)(_objetopermiso),(Object)(_tipopermiso)});
RDebugUtils.currentLine=158990401;
 //BA.debugLineNum = 158990401;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=158990403;
 //BA.debugLineNum = 158990403;BA.debugLine="If lstCommands.Size=0 Then Return";

case 22:
//if
this.state = 27;
if (_lstcommands.getSize()==0) { 
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
RDebugUtils.currentLine=158990404;
 //BA.debugLineNum = 158990404;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=158990405;
 //BA.debugLineNum = 158990405;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), null);
this.state = 40;
return;
case 40:
//C
this.state = 28;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=158990406;
 //BA.debugLineNum = 158990406;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=158990407;
 //BA.debugLineNum = 158990407;BA.debugLine="If result=False Then";
if (true) break;

case 28:
//if
this.state = 33;
if (_result==parent.__c.False) { 
this.state = 30;
}else {
this.state = 32;
}if (true) break;

case 30:
//C
this.state = 33;
RDebugUtils.currentLine=158990408;
 //BA.debugLineNum = 158990408;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query EliminarPermisoAplicacion","Error");
RDebugUtils.currentLine=158990409;
 //BA.debugLineNum = 158990409;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 33;
;
 if (true) break;

case 32:
//C
this.state = 33;
RDebugUtils.currentLine=158990411;
 //BA.debugLineNum = 158990411;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Registro elim";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Registro eliminado.","Aviso");
RDebugUtils.currentLine=158990412;
 //BA.debugLineNum = 158990412;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "copiartodospermisosaplicacionotrousuario"), _msa);
this.state = 42;
return;
case 42:
//C
this.state = 33;
;
RDebugUtils.currentLine=158990413;
 //BA.debugLineNum = 158990413;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=158990416;
 //BA.debugLineNum = 158990416;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _creaciontablassqlite(b4j.docU.cpermisosaplicacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", true))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=158531584;
 //BA.debugLineNum = 158531584;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=158531585;
 //BA.debugLineNum = 158531585;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblPermisosAplicacion"}))));
RDebugUtils.currentLine=158531586;
 //BA.debugLineNum = 158531586;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=158531587;
 //BA.debugLineNum = 158531587;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblPermisosAplicac";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblPermisosAplicacion");
 };
RDebugUtils.currentLine=158531589;
 //BA.debugLineNum = 158531589;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=158531590;
 //BA.debugLineNum = 158531590;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=158531591;
 //BA.debugLineNum = 158531591;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblPermisosAplicacion (");
RDebugUtils.currentLine=158531593;
 //BA.debugLineNum = 158531593;BA.debugLine="sbCrearTabla.Append(\"IDLin INTEGER,\")";
_sbcreartabla.Append("IDLin INTEGER,");
RDebugUtils.currentLine=158531594;
 //BA.debugLineNum = 158531594;BA.debugLine="sbCrearTabla.Append(\"Aplicacion TEXT COLLATE NOCA";
_sbcreartabla.Append("Aplicacion TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=158531595;
 //BA.debugLineNum = 158531595;BA.debugLine="sbCrearTabla.Append(\"OS TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("OS TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=158531596;
 //BA.debugLineNum = 158531596;BA.debugLine="sbCrearTabla.Append(\"IDUsuario TEXT COLLATE NOCAS";
_sbcreartabla.Append("IDUsuario TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=158531597;
 //BA.debugLineNum = 158531597;BA.debugLine="sbCrearTabla.Append(\"ObjetoPermiso TEXT COLLATE N";
_sbcreartabla.Append("ObjetoPermiso TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=158531598;
 //BA.debugLineNum = 158531598;BA.debugLine="sbCrearTabla.Append(\"TipoPermiso TEXT COLLATE NOC";
_sbcreartabla.Append("TipoPermiso TEXT COLLATE NOCASE)");
RDebugUtils.currentLine=158531599;
 //BA.debugLineNum = 158531599;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=158531602;
 //BA.debugLineNum = 158531602;BA.debugLine="End Sub";
return "";
}
public String  _editarpermiso(b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "editarpermiso", true))
	 {return ((String) Debug.delegate(ba, "editarpermiso", new Object[] {_mdata}));}
RDebugUtils.currentLine=158793728;
 //BA.debugLineNum = 158793728;BA.debugLine="Sub EditarPermiso(mData As Map)";
RDebugUtils.currentLine=158793729;
 //BA.debugLineNum = 158793729;BA.debugLine="jFReg.Initialize(Me,\"jFReg\",frm,\"Editar Permiso\",";
__ref._jfreg /*b4j.docU.jamformregistro*/ ._initialize /*String*/ (null,ba,this,"jFReg",__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Editar Permiso","Editar","PermisosAplicacionEdicionFormRegistro.json",_mdata);
RDebugUtils.currentLine=158793731;
 //BA.debugLineNum = 158793731;BA.debugLine="End Sub";
return "";
}
public void  _eliminarpermiso(b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.Map _mdata) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "eliminarpermiso", true))
	 {Debug.delegate(ba, "eliminarpermiso", new Object[] {_mdata}); return;}
ResumableSub_EliminarPermiso rsub = new ResumableSub_EliminarPermiso(this,__ref,_mdata);
rsub.resume(ba, null);
}
public static class ResumableSub_EliminarPermiso extends BA.ResumableSub {
public ResumableSub_EliminarPermiso(b4j.docU.cpermisosaplicacion parent,b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.Map _mdata) {
this.parent = parent;
this.__ref = __ref;
this._mdata = _mdata;
this.__ref = parent;
}
b4j.docU.cpermisosaplicacion __ref;
b4j.docU.cpermisosaplicacion parent;
anywheresoftware.b4a.objects.collections.Map _mdata;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _k = "";
Object _msa = null;
int _rint = 0;
int _idlin = 0;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=158859265;
 //BA.debugLineNum = 158859265;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=158859266;
 //BA.debugLineNum = 158859266;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=158859267;
 //BA.debugLineNum = 158859267;BA.debugLine="For Each k As String In mData.Keys";
if (true) break;

case 1:
//for
this.state = 4;
group3 = _mdata.Keys();
index3 = 0;
groupLen3 = group3.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 4;
if (index3 < groupLen3) {
this.state = 3;
_k = BA.ObjectToString(group3.Get(index3));}
if (true) break;

case 18:
//C
this.state = 17;
index3++;
if (true) break;

case 3:
//C
this.state = 18;
RDebugUtils.currentLine=158859268;
 //BA.debugLineNum = 158859268;BA.debugLine="sb.Append(k).Append(\": \").Append(mData.Get(k)).A";
_sb.Append(_k).Append(": ").Append(BA.ObjectToString(_mdata.Get((Object)(_k)))).Append(parent.__c.CRLF);
 if (true) break;
if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=158859270;
 //BA.debugLineNum = 158859270;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Eliminar e";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Eliminar el registro de permiso seleccionado?"+parent.__c.CRLF+parent.__c.CRLF+_sb.ToString(),"","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=158859271;
 //BA.debugLineNum = 158859271;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "eliminarpermiso"), _msa);
this.state = 19;
return;
case 19:
//C
this.state = 5;
_rint = (int) result[1];
;
RDebugUtils.currentLine=158859272;
 //BA.debugLineNum = 158859272;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
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
RDebugUtils.currentLine=158859273;
 //BA.debugLineNum = 158859273;BA.debugLine="Dim IDLin As Int=mData.Get(\"IDLin\")";
_idlin = (int)(BA.ObjectToNumber(_mdata.Get((Object)("IDLin"))));
RDebugUtils.currentLine=158859275;
 //BA.debugLineNum = 158859275;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Eli";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EliminarPermisoAplicacion",new Object[]{(Object)(_idlin)});
RDebugUtils.currentLine=158859277;
 //BA.debugLineNum = 158859277;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_cmd)}),parent);
RDebugUtils.currentLine=158859278;
 //BA.debugLineNum = 158859278;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "eliminarpermiso"), null);
this.state = 20;
return;
case 20:
//C
this.state = 11;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=158859279;
 //BA.debugLineNum = 158859279;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=158859280;
 //BA.debugLineNum = 158859280;BA.debugLine="If result=False Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_result==parent.__c.False) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=158859281;
 //BA.debugLineNum = 158859281;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query EliminarPermisoAplicacion","Error");
RDebugUtils.currentLine=158859282;
 //BA.debugLineNum = 158859282;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "eliminarpermiso"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=158859284;
 //BA.debugLineNum = 158859284;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Registro elim";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Registro eliminado.","Aviso");
RDebugUtils.currentLine=158859285;
 //BA.debugLineNum = 158859285;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "eliminarpermiso"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=158859286;
 //BA.debugLineNum = 158859286;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=158859288;
 //BA.debugLineNum = 158859288;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _frm_closerequest(b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "frm_closerequest", true))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=158269440;
 //BA.debugLineNum = 158269440;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=158269441;
 //BA.debugLineNum = 158269441;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=158269442;
 //BA.debugLineNum = 158269442;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.cpermisosaplicacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", true))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=158334976;
 //BA.debugLineNum = 158334976;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=158334977;
 //BA.debugLineNum = 158334977;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=158334978;
 //BA.debugLineNum = 158334978;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_contextmenuitem_action(b4j.docU.cpermisosaplicacion __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", true))
	 {return ((String) Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}));}
int _filasel = 0;
anywheresoftware.b4a.objects.collections.Map _mdreg = null;
RDebugUtils.currentLine=158662656;
 //BA.debugLineNum = 158662656;BA.debugLine="Sub jamTableView1_ContextMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=158662657;
 //BA.debugLineNum = 158662657;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"EditarPermiso","EliminarPermiso","CopiarPermisoOtroUsuario","CopiarTodosPermisosAplicacionOtroUsuario","CopiarTodosPermisosTodasAplicacionesOtroUsuario")) {
case 0: {
RDebugUtils.currentLine=158662659;
 //BA.debugLineNum = 158662659;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=158662660;
 //BA.debugLineNum = 158662660;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
_mdreg = new anywheresoftware.b4a.objects.collections.Map();
_mdreg = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datospkregistroindicefila /*anywheresoftware.b4a.objects.collections.Map*/ (null,_filasel);
RDebugUtils.currentLine=158662661;
 //BA.debugLineNum = 158662661;BA.debugLine="Log(mDReg)";
__c.LogImpl("9158662661",BA.ObjectToString(_mdreg),0);
RDebugUtils.currentLine=158662662;
 //BA.debugLineNum = 158662662;BA.debugLine="EditarPermiso(mDReg)";
__ref._editarpermiso /*String*/ (null,_mdreg);
 break; }
case 1: {
RDebugUtils.currentLine=158662664;
 //BA.debugLineNum = 158662664;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=158662665;
 //BA.debugLineNum = 158662665;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
_mdreg = new anywheresoftware.b4a.objects.collections.Map();
_mdreg = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datospkregistroindicefila /*anywheresoftware.b4a.objects.collections.Map*/ (null,_filasel);
RDebugUtils.currentLine=158662666;
 //BA.debugLineNum = 158662666;BA.debugLine="Log(mDReg)";
__c.LogImpl("9158662666",BA.ObjectToString(_mdreg),0);
RDebugUtils.currentLine=158662667;
 //BA.debugLineNum = 158662667;BA.debugLine="EliminarPermiso(mDReg)";
__ref._eliminarpermiso /*void*/ (null,_mdreg);
 break; }
case 2: {
RDebugUtils.currentLine=158662670;
 //BA.debugLineNum = 158662670;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=158662671;
 //BA.debugLineNum = 158662671;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
_mdreg = new anywheresoftware.b4a.objects.collections.Map();
_mdreg = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datospkregistroindicefila /*anywheresoftware.b4a.objects.collections.Map*/ (null,_filasel);
RDebugUtils.currentLine=158662672;
 //BA.debugLineNum = 158662672;BA.debugLine="Log(mDReg)";
__c.LogImpl("9158662672",BA.ObjectToString(_mdreg),0);
RDebugUtils.currentLine=158662673;
 //BA.debugLineNum = 158662673;BA.debugLine="CopiarPermisoOtroUsuario(mDReg)";
__ref._copiarpermisootrousuario /*String*/ (null,_mdreg);
 break; }
case 3: {
RDebugUtils.currentLine=158662676;
 //BA.debugLineNum = 158662676;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=158662677;
 //BA.debugLineNum = 158662677;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
_mdreg = new anywheresoftware.b4a.objects.collections.Map();
_mdreg = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datospkregistroindicefila /*anywheresoftware.b4a.objects.collections.Map*/ (null,_filasel);
RDebugUtils.currentLine=158662678;
 //BA.debugLineNum = 158662678;BA.debugLine="Log(mDReg)";
__c.LogImpl("9158662678",BA.ObjectToString(_mdreg),0);
RDebugUtils.currentLine=158662679;
 //BA.debugLineNum = 158662679;BA.debugLine="CopiarTodosPermisosAplicacionOtroUsuario(mDReg)";
__ref._copiartodospermisosaplicacionotrousuario /*void*/ (null,BA.ObjectToString(_mdreg));
 break; }
case 4: {
RDebugUtils.currentLine=158662681;
 //BA.debugLineNum = 158662681;BA.debugLine="Dim FilaSel As Int=jamTableView1.GetIndiceFilaS";
_filasel = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindicefilaseleccionada /*int*/ (null);
RDebugUtils.currentLine=158662682;
 //BA.debugLineNum = 158662682;BA.debugLine="Dim mDReg As Map=jamTableView1.DatosPKRegistroI";
_mdreg = new anywheresoftware.b4a.objects.collections.Map();
_mdreg = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datospkregistroindicefila /*anywheresoftware.b4a.objects.collections.Map*/ (null,_filasel);
RDebugUtils.currentLine=158662683;
 //BA.debugLineNum = 158662683;BA.debugLine="Log(mDReg)";
__c.LogImpl("9158662683",BA.ObjectToString(_mdreg),0);
RDebugUtils.currentLine=158662684;
 //BA.debugLineNum = 158662684;BA.debugLine="CopiarPermisoOtroUsuario(mDReg)";
__ref._copiarpermisootrousuario /*String*/ (null,_mdreg);
 break; }
}
;
RDebugUtils.currentLine=158662686;
 //BA.debugLineNum = 158662686;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_menubarmenuitem_action(b4j.docU.cpermisosaplicacion __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", true))
	 {return ((String) Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}));}
RDebugUtils.currentLine=158728192;
 //BA.debugLineNum = 158728192;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=158728193;
 //BA.debugLineNum = 158728193;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"NuevoPermiso")) {
case 0: {
RDebugUtils.currentLine=158728195;
 //BA.debugLineNum = 158728195;BA.debugLine="NuevoPermiso";
__ref._nuevopermiso /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=158728197;
 //BA.debugLineNum = 158728197;BA.debugLine="End Sub";
return "";
}
public String  _nuevopermiso(b4j.docU.cpermisosaplicacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "nuevopermiso", true))
	 {return ((String) Debug.delegate(ba, "nuevopermiso", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=159055872;
 //BA.debugLineNum = 159055872;BA.debugLine="Sub NuevoPermiso";
RDebugUtils.currentLine=159055873;
 //BA.debugLineNum = 159055873;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=159055874;
 //BA.debugLineNum = 159055874;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=159055875;
 //BA.debugLineNum = 159055875;BA.debugLine="m.Put(\"Aplicacion\",Main.NombreAplicacion)";
_m.Put((Object)("Aplicacion"),(Object)(_main._nombreaplicacion /*String*/ ));
RDebugUtils.currentLine=159055876;
 //BA.debugLineNum = 159055876;BA.debugLine="m.Put(\"OS\",\"Windows\")";
_m.Put((Object)("OS"),(Object)("Windows"));
RDebugUtils.currentLine=159055877;
 //BA.debugLineNum = 159055877;BA.debugLine="jFReg.Initialize(Me,\"jFReg\",frm,\"Nuevo Permiso\",\"";
__ref._jfreg /*b4j.docU.jamformregistro*/ ._initialize /*String*/ (null,ba,this,"jFReg",__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Nuevo Permiso","Nuevo","PermisosAplicacionEdicionFormRegistro.json",_m);
RDebugUtils.currentLine=159055878;
 //BA.debugLineNum = 159055878;BA.debugLine="End Sub";
return "";
}
public void  _jfreg_grabaredicionregistro(b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.List _lstinfocampojamformregistro) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "jfreg_grabaredicionregistro", true))
	 {Debug.delegate(ba, "jfreg_grabaredicionregistro", new Object[] {_lstinfocampojamformregistro}); return;}
ResumableSub_jFReg_GrabarEdicionRegistro rsub = new ResumableSub_jFReg_GrabarEdicionRegistro(this,__ref,_lstinfocampojamformregistro);
rsub.resume(ba, null);
}
public static class ResumableSub_jFReg_GrabarEdicionRegistro extends BA.ResumableSub {
public ResumableSub_jFReg_GrabarEdicionRegistro(b4j.docU.cpermisosaplicacion parent,b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.List _lstinfocampojamformregistro) {
this.parent = parent;
this.__ref = __ref;
this._lstinfocampojamformregistro = _lstinfocampojamformregistro;
this.__ref = parent;
}
b4j.docU.cpermisosaplicacion __ref;
b4j.docU.cpermisosaplicacion parent;
anywheresoftware.b4a.objects.collections.List _lstinfocampojamformregistro;
int _idlin = 0;
String _aplicacion = "";
String _os = "";
String _idusuario = "";
String _objetopermiso = "";
String _tipopermiso = "";
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=159121409;
 //BA.debugLineNum = 159121409;BA.debugLine="Dim IDLin As Int=jFReg.DatosCampoSeleccionado(\"ID";
_idlin = (int)(BA.ObjectToNumber(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"IDLin").ValorOutputCampo /*Object*/ ));
RDebugUtils.currentLine=159121410;
 //BA.debugLineNum = 159121410;BA.debugLine="Dim Aplicacion As String=jFReg.DatosCampoSeleccio";
_aplicacion = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"Aplicacion").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159121411;
 //BA.debugLineNum = 159121411;BA.debugLine="Dim OS As String=jFReg.DatosCampoSeleccionado(\"OS";
_os = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"OS").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159121412;
 //BA.debugLineNum = 159121412;BA.debugLine="Dim IDUsuario As String=jFReg.DatosCampoSeleccion";
_idusuario = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"IDUsuario").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159121413;
 //BA.debugLineNum = 159121413;BA.debugLine="Dim ObjetoPermiso As String=jFReg.DatosCampoSelec";
_objetopermiso = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"ObjetoPermiso").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159121414;
 //BA.debugLineNum = 159121414;BA.debugLine="Dim TipoPermiso As String=jFReg.DatosCampoSelecci";
_tipopermiso = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"TipoPermiso").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159121415;
 //BA.debugLineNum = 159121415;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursorwaitdeshabilitartableview /*String*/ (null);
RDebugUtils.currentLine=159121416;
 //BA.debugLineNum = 159121416;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=159121417;
 //BA.debugLineNum = 159121417;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=159121418;
 //BA.debugLineNum = 159121418;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Edi";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("EditarPermisoAplicacion",new Object[]{(Object)(_aplicacion),(Object)(_os),(Object)(_idusuario),(Object)(_objetopermiso),(Object)(_tipopermiso),(Object)(_idlin)});
RDebugUtils.currentLine=159121419;
 //BA.debugLineNum = 159121419;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=159121420;
 //BA.debugLineNum = 159121420;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=159121421;
 //BA.debugLineNum = 159121421;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "jfreg_grabaredicionregistro"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=159121422;
 //BA.debugLineNum = 159121422;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=159121423;
 //BA.debugLineNum = 159121423;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=159121424;
 //BA.debugLineNum = 159121424;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query EditarPermisoAplicacion","Error");
RDebugUtils.currentLine=159121425;
 //BA.debugLineNum = 159121425;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "jfreg_grabaredicionregistro"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=159121427;
 //BA.debugLineNum = 159121427;BA.debugLine="jFReg.CerrarFormRegistro";
__ref._jfreg /*b4j.docU.jamformregistro*/ ._cerrarformregistro /*String*/ (null);
RDebugUtils.currentLine=159121428;
 //BA.debugLineNum = 159121428;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=159121431;
 //BA.debugLineNum = 159121431;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jfreg_grabarnuevoregistro(b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.List _lstdatoscamposregistronuevo) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";
if (Debug.shouldDelegate(ba, "jfreg_grabarnuevoregistro", true))
	 {Debug.delegate(ba, "jfreg_grabarnuevoregistro", new Object[] {_lstdatoscamposregistronuevo}); return;}
ResumableSub_jFReg_GrabarNuevoRegistro rsub = new ResumableSub_jFReg_GrabarNuevoRegistro(this,__ref,_lstdatoscamposregistronuevo);
rsub.resume(ba, null);
}
public static class ResumableSub_jFReg_GrabarNuevoRegistro extends BA.ResumableSub {
public ResumableSub_jFReg_GrabarNuevoRegistro(b4j.docU.cpermisosaplicacion parent,b4j.docU.cpermisosaplicacion __ref,anywheresoftware.b4a.objects.collections.List _lstdatoscamposregistronuevo) {
this.parent = parent;
this.__ref = __ref;
this._lstdatoscamposregistronuevo = _lstdatoscamposregistronuevo;
this.__ref = parent;
}
b4j.docU.cpermisosaplicacion __ref;
b4j.docU.cpermisosaplicacion parent;
anywheresoftware.b4a.objects.collections.List _lstdatoscamposregistronuevo;
String _aplicacion = "";
String _os = "";
String _idusuario = "";
String _objetopermiso = "";
String _tipopermiso = "";
anywheresoftware.b4a.objects.collections.List _lstcommands = null;
b4j.docU.main._dbcommand _cmd = null;
boolean _result = false;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cpermisosaplicacion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=159186945;
 //BA.debugLineNum = 159186945;BA.debugLine="Dim Aplicacion As String=jFReg.DatosCampoSeleccio";
_aplicacion = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"Aplicacion").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159186946;
 //BA.debugLineNum = 159186946;BA.debugLine="Dim OS As String=jFReg.DatosCampoSeleccionado(\"OS";
_os = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"OS").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159186947;
 //BA.debugLineNum = 159186947;BA.debugLine="Dim IDUsuario As String=jFReg.DatosCampoSeleccion";
_idusuario = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"IDUsuario").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159186948;
 //BA.debugLineNum = 159186948;BA.debugLine="Dim ObjetoPermiso As String=jFReg.DatosCampoSelec";
_objetopermiso = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"ObjetoPermiso").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159186949;
 //BA.debugLineNum = 159186949;BA.debugLine="Dim TipoPermiso As String=jFReg.DatosCampoSelecci";
_tipopermiso = BA.ObjectToString(__ref._jfreg /*b4j.docU.jamformregistro*/ ._datoscamposeleccionado /*b4j.docU.jamformregistro._infocampojamformregistro*/ (null,"TipoPermiso").ValorOutputCampo /*Object*/ );
RDebugUtils.currentLine=159186950;
 //BA.debugLineNum = 159186950;BA.debugLine="jamTableView1.SetMouseCursorWaitDeshabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursorwaitdeshabilitartableview /*String*/ (null);
RDebugUtils.currentLine=159186951;
 //BA.debugLineNum = 159186951;BA.debugLine="Dim lstCommands As List";
_lstcommands = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=159186952;
 //BA.debugLineNum = 159186952;BA.debugLine="lstCommands.Initialize";
_lstcommands.Initialize();
RDebugUtils.currentLine=159186953;
 //BA.debugLineNum = 159186953;BA.debugLine="Dim cmd As DBCommand=JRDCQuery.CreateCommand(\"Nue";
_cmd = parent._jrdcquery._createcommand /*b4j.docU.main._dbcommand*/ ("NuevoPermisoAplicacion",new Object[]{(Object)(_aplicacion),(Object)(_os),(Object)(_idusuario),(Object)(_objetopermiso),(Object)(_tipopermiso)});
RDebugUtils.currentLine=159186954;
 //BA.debugLineNum = 159186954;BA.debugLine="lstCommands.Add(cmd)";
_lstcommands.Add((Object)(_cmd));
RDebugUtils.currentLine=159186955;
 //BA.debugLineNum = 159186955;BA.debugLine="JRDCQuery.EjecutarBatch(Main.rdclinkMySqlDatosCom";
parent._jrdcquery._ejecutarbatch /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_lstcommands,parent);
RDebugUtils.currentLine=159186956;
 //BA.debugLineNum = 159186956;BA.debugLine="Wait For EjecutarBatch_Completed (result As Boole";
parent.__c.WaitFor("ejecutarbatch_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "jfreg_grabarnuevoregistro"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (boolean) result[1];
;
RDebugUtils.currentLine=159186957;
 //BA.debugLineNum = 159186957;BA.debugLine="jamTableView1.SetMouseCursorDefaultHabilitarTable";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setmousecursordefaulthabilitartableview /*String*/ (null);
RDebugUtils.currentLine=159186958;
 //BA.debugLineNum = 159186958;BA.debugLine="If result=False Then";
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
RDebugUtils.currentLine=159186959;
 //BA.debugLineNum = 159186959;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query NuevoPermisoAplicacion","Error");
RDebugUtils.currentLine=159186960;
 //BA.debugLineNum = 159186960;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cpermisosaplicacion", "jfreg_grabarnuevoregistro"), _msa);
this.state = 8;
return;
case 8:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=159186962;
 //BA.debugLineNum = 159186962;BA.debugLine="jFReg.CerrarFormRegistro";
__ref._jfreg /*b4j.docU.jamformregistro*/ ._cerrarformregistro /*String*/ (null);
RDebugUtils.currentLine=159186963;
 //BA.debugLineNum = 159186963;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=159186965;
 //BA.debugLineNum = 159186965;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}