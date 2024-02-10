package b4j.docU;

import anywheresoftware.b4a.debug.*;
import javafx.util.Callback;
import javafx.scene.image.Image;
import javafx.geometry.Pos;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javafx.scene.image.Image;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import javafx.scene.image.ImageView;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableCell;
import java.io.IOException;
import java.io.File;
import java.io.Serializable;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class canalisisdisponiblesarticulotallaalmacenescomputables extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables.class).invoke(this, new Object[] {null});
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
public b4j.docU.jamloadingindicator _jamloadingindicator1 = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _permisomodulousuario = "";
public byte[] _imagencomentario = null;
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
public String  _initialize(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=42663941;
 //BA.debugLineNum = 42663941;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=42663942;
 //BA.debugLineNum = 42663942;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=42663943;
 //BA.debugLineNum = 42663943;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=42663945;
 //BA.debugLineNum = 42663945;BA.debugLine="frm.RootPane.LoadLayout(\"scrAnalisisDisponiblesAl";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrAnalisisDisponiblesAlmacenArticuloTalla");
RDebugUtils.currentLine=42663946;
 //BA.debugLineNum = 42663946;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "show"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=42663948;
 //BA.debugLineNum = 42663948;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Análisis Disp";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Análisis Disponibles Artículo Talla Almacenes Computables");
RDebugUtils.currentLine=42663950;
 //BA.debugLineNum = 42663950;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
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
RDebugUtils.currentLine=42663951;
 //BA.debugLineNum = 42663951;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=42663953;
 //BA.debugLineNum = 42663953;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=42663962;
 //BA.debugLineNum = 42663962;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=42663963;
 //BA.debugLineNum = 42663963;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=42663969;
 //BA.debugLineNum = 42663969;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=42663970;
 //BA.debugLineNum = 42663970;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=42663971;
 //BA.debugLineNum = 42663971;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.png";
_img.InitializeSample(parent.__c.File.getDirAssets(),"navision.png",24,24);
RDebugUtils.currentLine=42663973;
 //BA.debugLineNum = 42663973;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Artículo N";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Artículo NAV","VerArticuloNAV",_img);
RDebugUtils.currentLine=42663978;
 //BA.debugLineNum = 42663978;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaAnalisisDisponiblesArticuloTallaAlmacenesComputables.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=42663979;
 //BA.debugLineNum = 42663979;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42663980;
 //BA.debugLineNum = 42663980;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("842663980",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=42663981;
 //BA.debugLineNum = 42663981;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=42663982;
 //BA.debugLineNum = 42663982;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=42663983;
 //BA.debugLineNum = 42663983;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
RDebugUtils.currentLine=42663984;
 //BA.debugLineNum = 42663984;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=42663985;
 //BA.debugLineNum = 42663985;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=42663988;
 //BA.debugLineNum = 42663988;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=42663990;
 //BA.debugLineNum = 42663990;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=42663991;
 //BA.debugLineNum = 42663991;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=42663992;
 //BA.debugLineNum = 42663992;BA.debugLine="CF.NombreFuncionCellFactory=\"setColumnaImagenCome";
_cf.NombreFuncionCellFactory /*String*/  = "setColumnaImagenComentario";
RDebugUtils.currentLine=42663993;
 //BA.debugLineNum = 42663993;BA.debugLine="CF.CellFactoryEnCallBack=True";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=42663994;
 //BA.debugLineNum = 42663994;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=42663998;
 //BA.debugLineNum = 42663998;BA.debugLine="imagencomentario=Utilidades.GetImageBytes(File.Di";
__ref._imagencomentario /*byte[]*/  = parent._utilidades._getimagebytes /*byte[]*/ (parent.__c.File.getDirAssets(),"comment16Freepik.png");
RDebugUtils.currentLine=42664006;
 //BA.debugLineNum = 42664006;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=42664007;
 //BA.debugLineNum = 42664007;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Comentarios"}));
RDebugUtils.currentLine=42664042;
 //BA.debugLineNum = 42664042;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=42664043;
 //BA.debugLineNum = 42664043;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=42664045;
 //BA.debugLineNum = 42664045;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=42664047;
 //BA.debugLineNum = 42664047;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=42664049;
 //BA.debugLineNum = 42664049;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatos(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="Wait For(ActualizarDatosDisponibles) complete (mR";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), __ref._actualizardatosdisponibles /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 26;
return;
case 26:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="If Accion<>\"OK\" Then";
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
RDebugUtils.currentLine=42991621;
 //BA.debugLineNum = 42991621;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=42991622;
 //BA.debugLineNum = 42991622;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=42991628;
 //BA.debugLineNum = 42991628;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblAnalisisDisponiblesArticuloTallaAlmacenesComputables order by Articulo, Talla");
RDebugUtils.currentLine=42991630;
 //BA.debugLineNum = 42991630;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=42991631;
 //BA.debugLineNum = 42991631;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _rsub);
this.state = 27;
return;
case 27:
//C
this.state = 5;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42991632;
 //BA.debugLineNum = 42991632;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=42991633;
 //BA.debugLineNum = 42991633;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=42991634;
 //BA.debugLineNum = 42991634;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=42991635;
 //BA.debugLineNum = 42991635;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
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
RDebugUtils.currentLine=42991636;
 //BA.debugLineNum = 42991636;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=42991637;
 //BA.debugLineNum = 42991637;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 11;
;
RDebugUtils.currentLine=42991639;
 //BA.debugLineNum = 42991639;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=42991640;
 //BA.debugLineNum = 42991640;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _msa);
this.state = 29;
return;
case 29:
//C
this.state = 11;
_rint = (int) result[1];
;
RDebugUtils.currentLine=42991641;
 //BA.debugLineNum = 42991641;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=42991642;
 //BA.debugLineNum = 42991642;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=42991643;
 //BA.debugLineNum = 42991643;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=42991646;
 //BA.debugLineNum = 42991646;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=42991648;
 //BA.debugLineNum = 42991648;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 15:
//if
this.state = 24;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=42991649;
 //BA.debugLineNum = 42991649;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 18:
//if
this.state = 23;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
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
RDebugUtils.currentLine=42991650;
 //BA.debugLineNum = 42991650;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=42991651;
 //BA.debugLineNum = 42991651;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatos"), _msa);
this.state = 30;
return;
case 30:
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
RDebugUtils.currentLine=42991656;
 //BA.debugLineNum = 42991656;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=42991660;
 //BA.debugLineNum = 42991660;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosdisponibles(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "actualizardatosdisponibles", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosdisponibles", null));}
ResumableSub_ActualizarDatosDisponibles rsub = new ResumableSub_ActualizarDatosDisponibles(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosDisponibles extends BA.ResumableSub {
public ResumableSub_ActualizarDatosDisponibles(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando datos Disponible por Artículo Talla en Almacenes Computables..."));
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAnalisisDisponi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblAnalisisDisponiblesArticuloTallaAlmacenesComputables");
RDebugUtils.currentLine=43122692;
 //BA.debugLineNum = 43122692;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=43122694;
 //BA.debugLineNum = 43122694;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=43122695;
 //BA.debugLineNum = 43122695;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
_slinkjrdc = parent._main._rdclinknav /*String*/ ;
RDebugUtils.currentLine=43122696;
 //BA.debugLineNum = 43122696;BA.debugLine="Dim Comando As String=\"AnalisisDisponiblesArticul";
_comando = "AnalisisDisponiblesArticuloTallaAlmacenesComputables";
RDebugUtils.currentLine=43122697;
 //BA.debugLineNum = 43122697;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=43122699;
 //BA.debugLineNum = 43122699;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatosdisponibles"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=43122700;
 //BA.debugLineNum = 43122700;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=43122701;
 //BA.debugLineNum = 43122701;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=43122702;
 //BA.debugLineNum = 43122702;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=43122703;
 //BA.debugLineNum = 43122703;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatosdisponibles"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=43122704;
 //BA.debugLineNum = 43122704;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=43122705;
 //BA.debugLineNum = 43122705;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=43122708;
 //BA.debugLineNum = 43122708;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=43122709;
 //BA.debugLineNum = 43122709;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=43122710;
 //BA.debugLineNum = 43122710;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=43122711;
 //BA.debugLineNum = 43122711;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=43122712;
 //BA.debugLineNum = 43122712;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Analisis Disponibles Almacen Articulo Talla","Aviso");
RDebugUtils.currentLine=43122713;
 //BA.debugLineNum = 43122713;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "actualizardatosdisponibles"), _msa);
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
RDebugUtils.currentLine=43122715;
 //BA.debugLineNum = 43122715;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=43122716;
 //BA.debugLineNum = 43122716;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=43122719;
 //BA.debugLineNum = 43122719;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=43122723;
 //BA.debugLineNum = 43122723;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblAnalisisDisponibles";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblAnalisisDisponiblesArticuloTallaAlmacenesComputables",_lstreg);
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
RDebugUtils.currentLine=43122726;
 //BA.debugLineNum = 43122726;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=43122727;
 //BA.debugLineNum = 43122727;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=42926082;
 //BA.debugLineNum = 42926082;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=42926083;
 //BA.debugLineNum = 42926083;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=42926084;
 //BA.debugLineNum = 42926084;BA.debugLine="End Sub";
return "";
}
public String  _alternarexcluidoreclamacion(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "alternarexcluidoreclamacion", false))
	 {return ((String) Debug.delegate(ba, "alternarexcluidoreclamacion", new Object[] {_datosceldaseleccionada}));}
int _valoractual = 0;
int _nuevovalor = 0;
anywheresoftware.b4a.objects.collections.Map _mpk = null;
String _pedidosel = "";
String _lineasel = "";
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Sub AlternarExcluidoReclamacion(DatosCeldaSeleccio";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="Log(DatosCeldaSeleccionada)";
__c.LogImpl("843515905",BA.ObjectToString(_datosceldaseleccionada),0);
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="Dim ValorActual As Int= DatosCeldaSeleccionada.Va";
_valoractual = (int)(BA.ObjectToNumber(_datosceldaseleccionada.ValorCelda /*Object*/ ));
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="Dim NuevoValor As Int";
_nuevovalor = 0;
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="Select ValorActual";
switch (_valoractual) {
case 0: {
RDebugUtils.currentLine=43515910;
 //BA.debugLineNum = 43515910;BA.debugLine="NuevoValor=1";
_nuevovalor = (int) (1);
 break; }
case 1: {
RDebugUtils.currentLine=43515913;
 //BA.debugLineNum = 43515913;BA.debugLine="NuevoValor=0";
_nuevovalor = (int) (0);
 break; }
}
;
RDebugUtils.currentLine=43515915;
 //BA.debugLineNum = 43515915;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=43515916;
 //BA.debugLineNum = 43515916;BA.debugLine="Dim PedidoSel As String=mPK.Get(\"Pedido\")";
_pedidosel = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=43515917;
 //BA.debugLineNum = 43515917;BA.debugLine="Dim LineaSel As String=mPK.Get(\"Linea\")";
_lineasel = BA.ObjectToString(_mpk.Get((Object)("Linea")));
RDebugUtils.currentLine=43515918;
 //BA.debugLineNum = 43515918;BA.debugLine="mSQL.ExecNonQuery2(\"update tblDatosFechasPrometid";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblDatosFechasPrometidasPedidosCompraPendientes set ExcluidoReclamacion=? where Pedido=? and Linea=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_nuevovalor),(Object)(_pedidosel),(Object)(_lineasel)}));
RDebugUtils.currentLine=43515919;
 //BA.debugLineNum = 43515919;BA.debugLine="jamTableView1.RefrescarTablaValorCeldaEditada(Dat";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._refrescartablavalorceldaeditada /*String*/ (null,_datosceldaseleccionada.Fila /*int*/ ,_datosceldaseleccionada.Columna /*int*/ ,(Object)(_nuevovalor),_datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=43515920;
 //BA.debugLineNum = 43515920;BA.debugLine="jamTableView1.SeleccionarCelda(\"ExcluidoReclamaci";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._seleccionarcelda /*String*/ (null,"ExcluidoReclamacion",_datosceldaseleccionada.Fila /*int*/ );
RDebugUtils.currentLine=43515921;
 //BA.debugLineNum = 43515921;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=42532871;
 //BA.debugLineNum = 42532871;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=42532872;
 //BA.debugLineNum = 42532872;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=42532874;
 //BA.debugLineNum = 42532874;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=42532875;
 //BA.debugLineNum = 42532875;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=42532876;
 //BA.debugLineNum = 42532876;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=42532878;
 //BA.debugLineNum = 42532878;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=42532880;
 //BA.debugLineNum = 42532880;BA.debugLine="Private imagencomentario() As Byte";
_imagencomentario = new byte[(int) (0)];
;
RDebugUtils.currentLine=42532881;
 //BA.debugLineNum = 42532881;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblAnalisisDisponiblesArticuloTallaAlmacenesComputables"}))));
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=43057155;
 //BA.debugLineNum = 43057155;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAnalisisDisponi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblAnalisisDisponiblesArticuloTallaAlmacenesComputables");
 };
RDebugUtils.currentLine=43057157;
 //BA.debugLineNum = 43057157;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=43057158;
 //BA.debugLineNum = 43057158;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=43057159;
 //BA.debugLineNum = 43057159;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
_sbcreartabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesArticuloTallaAlmacenesComputables] (");
RDebugUtils.currentLine=43057160;
 //BA.debugLineNum = 43057160;BA.debugLine="sbCrearTabla.Append(\"  [Articulo] TEXT, [Descripc";
_sbcreartabla.Append("  [Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Stock] REAL");
RDebugUtils.currentLine=43057161;
 //BA.debugLineNum = 43057161;BA.debugLine="sbCrearTabla.Append(\", [CosteUnitario] REAL, [Tot";
_sbcreartabla.Append(", [CosteUnitario] REAL, [TotalCosteStock] REAL, [ClienteExclusiva] TEXT, [NombreClienteExclusiva] TEXT, [StockNoConfigurado] TEXT");
RDebugUtils.currentLine=43057162;
 //BA.debugLineNum = 43057162;BA.debugLine="sbCrearTabla.Append(\", [SistemaReposicion] TEXT,";
_sbcreartabla.Append(", [SistemaReposicion] TEXT, [ArticuloBloqueado] TEXT, [ArticuloBloqueadoNoDisponible] TEXT, [GrupoContable] TEXT, [NombreRuta] TEXT");
RDebugUtils.currentLine=43057163;
 //BA.debugLineNum = 43057163;BA.debugLine="sbCrearTabla.Append(\", [RutaCorte] TEXT, [Proveed";
_sbcreartabla.Append(", [RutaCorte] TEXT, [ProveedorPredeterminado] TEXT, [NombreProveedorPredeterminado] TEXT, [UltimoMovPositivo] INTEGER, [Cantidad3M] REAL");
RDebugUtils.currentLine=43057164;
 //BA.debugLineNum = 43057164;BA.debugLine="sbCrearTabla.Append(\", [Cantidad6M] REAL, [Cantid";
_sbcreartabla.Append(", [Cantidad6M] REAL, [Cantidad9M] REAL, [Cantidad12M] REAL, [Cantidad24M] REAL, [ArtTallaConMaxMin] TEXT, [NecConsumo] REAL");
RDebugUtils.currentLine=43057165;
 //BA.debugLineNum = 43057165;BA.debugLine="sbCrearTabla.Append(\", [NecVenta] REAL, [NecEnvio";
_sbcreartabla.Append(", [NecVenta] REAL, [NecEnvioTransf] REAL, [PteRecepcionTransf] REAL, [NecNeta] REAL, [Disponible] REAL, [CosteDisponible] REAL");
RDebugUtils.currentLine=43057166;
 //BA.debugLineNum = 43057166;BA.debugLine="sbCrearTabla.Append(\", [MesesConsumo6M] REAL, [Se";
_sbcreartabla.Append(", [MesesConsumo6M] REAL, [SegConsumo] TEXT, [Comentarios] INTEGER DEFAULT 0)");
RDebugUtils.currentLine=43057167;
 //BA.debugLineNum = 43057167;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=43057169;
 //BA.debugLineNum = 43057169;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cambioenceldaseleccionada(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
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
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
_lineaseltv = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="Dim mPK As Map=DatosCeldaSeleccionada.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _datosceldaseleccionada.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="Dim Pedido As String=mPK.Get(\"Pedido\")";
_pedido = BA.ObjectToString(_mpk.Get((Object)("Pedido")));
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="Dim Linea As Int=mPK.Get(\"Linea\")";
_linea = (int)(BA.ObjectToNumber(_mpk.Get((Object)("Linea"))));
RDebugUtils.currentLine=43384837;
 //BA.debugLineNum = 43384837;BA.debugLine="Dim NombreProveedor As String=jamTableView1.GetVa";
_nombreproveedor = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"NombreProveedor"));
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="Dim Articulo As String=jamTableView1.GetValorSQLC";
_articulo = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Articulo"));
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="Dim Descripcion As String=jamTableView1.GetValorS";
_descripcion = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"DescripcionArticulo"));
RDebugUtils.currentLine=43384840;
 //BA.debugLineNum = 43384840;BA.debugLine="Dim Talla As String=jamTableView1.GetValorSQLCamp";
_talla = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Talla"));
RDebugUtils.currentLine=43384841;
 //BA.debugLineNum = 43384841;BA.debugLine="Dim sTalla As String=IIf(Talla<>\"\",\"Talla: \" & Ta";
_stalla = BA.ObjectToString((((_talla).equals("") == false) ? ((Object)("Talla: "+_talla)) : ((Object)(""))));
RDebugUtils.currentLine=43384842;
 //BA.debugLineNum = 43384842;BA.debugLine="Dim QtyPte As Int=jamTableView1.GetValorSQLCampoF";
_qtypte = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"QtyPendiente")));
RDebugUtils.currentLine=43384843;
 //BA.debugLineNum = 43384843;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = __c.DateTime.getDateFormat();
RDebugUtils.currentLine=43384844;
 //BA.debugLineNum = 43384844;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=43384845;
 //BA.debugLineNum = 43384845;BA.debugLine="Dim FechaPrometidaLong As Long=jamTableView1.GetV";
_fechaprometidalong = BA.ObjectToLongNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"FechaPrometida"));
RDebugUtils.currentLine=43384846;
 //BA.debugLineNum = 43384846;BA.debugLine="Dim sFechaPrometida As String=IIf(FechaPrometidaL";
_sfechaprometida = BA.ObjectToString(((_fechaprometidalong>0) ? ((Object)("Fecha Prometida: "+__c.DateTime.Date(_fechaprometidalong))) : ((Object)("SIN FECHA PROMETIDA"))));
RDebugUtils.currentLine=43384847;
 //BA.debugLineNum = 43384847;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=43384848;
 //BA.debugLineNum = 43384848;BA.debugLine="Dim PendienteSeguimiento As Int=jamTableView1.Get";
_pendienteseguimiento = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"PendienteSeguimiento")));
RDebugUtils.currentLine=43384849;
 //BA.debugLineNum = 43384849;BA.debugLine="Dim sPendienteSeguimiento As String=IIf(Pendiente";
_spendienteseguimiento = BA.ObjectToString(((_pendienteseguimiento==1) ? ((Object)("PENDIENTE SEGUIMIENTO")) : ((Object)(""))));
RDebugUtils.currentLine=43384851;
 //BA.debugLineNum = 43384851;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Pedido:";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Pedido: "+_pedido+" Línea:"+BA.NumberToString(_linea)+"  "+_nombreproveedor+"  "+_articulo+"  "+_descripcion+"  "+_stalla+"  QtyPte: "+BA.NumberToString(_qtypte)+"  "+_sfechaprometida+" "+_spendienteseguimiento));
RDebugUtils.currentLine=43384853;
 //BA.debugLineNum = 43384853;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cellclick(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "jamtableview1_cellclick", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cellclick", new Object[] {_datosceldaseleccionada}));}
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Sub jamTableView1_CellClick(DatosCeldaSeleccionada";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="Select DatosCeldaSeleccionada.AliasCampo";
switch (BA.switchObjectToInt(_datosceldaseleccionada.AliasCampo /*String*/ ,"ExcluidoReclamacion")) {
case 0: {
RDebugUtils.currentLine=43450371;
 //BA.debugLineNum = 43450371;BA.debugLine="AlternarExcluidoReclamacion(DatosCeldaSeleccion";
__ref._alternarexcluidoreclamacion /*String*/ (null,_datosceldaseleccionada);
 break; }
}
;
RDebugUtils.currentLine=43450373;
 //BA.debugLineNum = 43450373;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_contextmenuitem_action(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_ContextMenuItem_Action rsub = new ResumableSub_jamTableView1_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
String _tagmenuitem;
String _articulosel = "";
int _filaseleccionada = 0;
anywheresoftware.b4a.objects.collections.List _lstinfofila = null;
b4j.docU.jamtableview._datoscamporegistrojamtableview _dc = null;
Object _msa = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 19;
switch (BA.switchObjectToInt(_tagmenuitem,"VerArticuloNAV")) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=43319300;
 //BA.debugLineNum = 43319300;BA.debugLine="Dim ArticuloSel As String";
_articulosel = "";
RDebugUtils.currentLine=43319301;
 //BA.debugLineNum = 43319301;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=43319302;
 //BA.debugLineNum = 43319302;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
_lstinfofila = new anywheresoftware.b4a.objects.collections.List();
_lstinfofila = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datosregistroindicefila /*anywheresoftware.b4a.objects.collections.List*/ (null,_filaseleccionada);
RDebugUtils.currentLine=43319303;
 //BA.debugLineNum = 43319303;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
if (true) break;

case 4:
//for
this.state = 11;
group6 = _lstinfofila;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 11;
if (index6 < groupLen6) {
this.state = 6;
_dc = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group6.Get(index6));}
if (true) break;

case 21:
//C
this.state = 20;
index6++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=43319304;
 //BA.debugLineNum = 43319304;BA.debugLine="If dc.Campo=\"Articulo\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_dc.Campo /*String*/ ).equals("Articulo")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=43319305;
 //BA.debugLineNum = 43319305;BA.debugLine="ArticuloSel=dc.ValorCampo";
_articulosel = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
RDebugUtils.currentLine=43319306;
 //BA.debugLineNum = 43319306;BA.debugLine="Exit";
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 21;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=43319309;
 //BA.debugLineNum = 43319309;BA.debugLine="If ArticuloSel=\"\" Then";

case 11:
//if
this.state = 14;
if ((_articulosel).equals("")) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=43319310;
 //BA.debugLineNum = 43319310;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Artículo.","Error");
RDebugUtils.currentLine=43319311;
 //BA.debugLineNum = 43319311;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 14;
;
RDebugUtils.currentLine=43319312;
 //BA.debugLineNum = 43319312;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=43319314;
 //BA.debugLineNum = 43319314;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Ficha producto",(int) (30),"No.",_articulosel);
RDebugUtils.currentLine=43319315;
 //BA.debugLineNum = 43319315;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 23;
return;
case 23:
//C
this.state = 15;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=43319316;
 //BA.debugLineNum = 43319316;BA.debugLine="If success=False Then";
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
RDebugUtils.currentLine=43319317;
 //BA.debugLineNum = 43319317;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir el artículo seleccionado en Navision.","Error");
RDebugUtils.currentLine=43319318;
 //BA.debugLineNum = 43319318;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 24;
return;
case 24:
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
RDebugUtils.currentLine=43319322;
 //BA.debugLineNum = 43319322;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_menubarmenuitem_action(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_MenuBarMenuItem_Action rsub = new ResumableSub_jamTableView1_MenuBarMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_MenuBarMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_MenuBarMenuItem_Action(b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent,b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables __ref;
b4j.docU.canalisisdisponiblesarticulotallaalmacenescomputables parent;
String _tagmenuitem;
String _seleccionardireccionremitenteemails = "";
boolean _rbool = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesarticulotallaalmacenescomputables";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar","SeleccionarCuentaRemitenteEmail")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=43253764;
 //BA.debugLineNum = 43253764;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=43253766;
 //BA.debugLineNum = 43253766;BA.debugLine="wait for (SeleccionarDireccionRemitenteEmails)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesarticulotallaalmacenescomputables", "jamtableview1_menubarmenuitem_action"), (Object)(_seleccionardireccionremitenteemails));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_rbool = (boolean) result[1];
;
RDebugUtils.currentLine=43253767;
 //BA.debugLineNum = 43253767;BA.debugLine="If rBool=False Then Return";
if (true) break;

case 6:
//if
this.state = 11;
if (_rbool==parent.__c.False) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
if (true) return ;
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
RDebugUtils.currentLine=43253769;
 //BA.debugLineNum = 43253769;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
//import javafx.scene.Node;
//import javafx.scene.layout.HBox;





// Pasar imagen como argumento
public void setColumnaImagenComentario(TableColumn tc,  final Object[] args) throws Exception{
	try{
    tc.setCellFactory(new Callback<TableColumn, TableCell>() {
        @Override
        public TableCell call(TableColumn param){
            return new TableCell<Object, Object>() {
                @Override
                public void updateItem(Object item, boolean empty) {
                    super.updateItem(item, empty);
                    if (!isEmpty()){
						
       					if((int)item == 0) {
							setText(null);
							setGraphic(null);
      					}
						else {	
							//String sFile=String.valueOf(args[0]);
							//InputStream fis=anywheresoftware.b4a.objects.streams.File.OpenInput(anywheresoftware.b4a.objects.streams.File.DirAssets,sFile);
							//InputStream fis=args[0];
							//Image imagen = new Image("../files/"+sFile);
							/*
						    ByteArrayOutputStream out = new ByteArrayOutputStream();
						    ObjectOutputStream os = new ObjectOutputStream(out);
						    os.writeObject(args[0]);
						   
							ByteArrayInputStream bis = new ByteArrayInputStream(out.toByteArray());
     	 					//BufferedImage imagen = ImageIO.read(bis);
     	 					javafx.scene.image.Image imagen = ImageIO.read(bis);
							
							
							byte[] bytes=args[0];
							InputStream is = new ByteArrayInputStream(bytes);
        					BufferedImage newBi = ImageIO.read(is);
							*/
							
							Image imagen=new Image(new ByteArrayInputStream(_imagencomentario));
							ImageView imageView=new ImageView();
							imageView.setImage(imagen);
							setGraphic(imageView);
							setAlignment(Pos.CENTER);
						}
     				}
	 				else {
	          			setText(null);
						setGraphic(null);
              			return;
	 				}
                }
            };
        }
    });
	}
	catch (Exception e) {
		System.out.println(e); 
	}
} 





}