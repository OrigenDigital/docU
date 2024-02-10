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

public class canalisisdisponiblesalmacenarticulotalla extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.canalisisdisponiblesalmacenarticulotalla", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.canalisisdisponiblesalmacenarticulotalla.class).invoke(this, new Object[] {null});
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
public String  _initialize(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imgcom = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=41549829;
 //BA.debugLineNum = 41549829;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=41549831;
 //BA.debugLineNum = 41549831;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=41549833;
 //BA.debugLineNum = 41549833;BA.debugLine="frm.RootPane.LoadLayout(\"scrAnalisisDisponiblesAl";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrAnalisisDisponiblesAlmacenArticuloTalla");
RDebugUtils.currentLine=41549834;
 //BA.debugLineNum = 41549834;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "show"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=41549836;
 //BA.debugLineNum = 41549836;BA.debugLine="frm.Title=Main.PrefijoTitleForms & \"Análisis Disp";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle(parent._main._prefijotitleforms /*String*/ +"Análisis Disponibles Almacén Artículo Talla");
RDebugUtils.currentLine=41549838;
 //BA.debugLineNum = 41549838;BA.debugLine="If mSQL.IsInitialized Then mSQL.Close";
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
RDebugUtils.currentLine=41549839;
 //BA.debugLineNum = 41549839;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=41549841;
 //BA.debugLineNum = 41549841;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=41549850;
 //BA.debugLineNum = 41549850;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=41549851;
 //BA.debugLineNum = 41549851;BA.debugLine="jamTableView1.EstadoMenuItem(jamTableView1.MenuBa";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=41549857;
 //BA.debugLineNum = 41549857;BA.debugLine="jamTableView1.AddContextMenuItemSeparator";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=41549858;
 //BA.debugLineNum = 41549858;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=41549859;
 //BA.debugLineNum = 41549859;BA.debugLine="img.InitializeSample(File.DirAssets,\"navision.png";
_img.InitializeSample(parent.__c.File.getDirAssets(),"navision.png",24,24);
RDebugUtils.currentLine=41549861;
 //BA.debugLineNum = 41549861;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Artículo N";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Artículo NAV","VerArticuloNAV",_img);
RDebugUtils.currentLine=41549862;
 //BA.debugLineNum = 41549862;BA.debugLine="Dim imgCom As Image";
_imgcom = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=41549863;
 //BA.debugLineNum = 41549863;BA.debugLine="imgCom.InitializeSample(File.DirAssets,\"comment16";
_imgcom.InitializeSample(parent.__c.File.getDirAssets(),"comment16Freepik.png",16,16);
RDebugUtils.currentLine=41549864;
 //BA.debugLineNum = 41549864;BA.debugLine="jamTableView1.AddContextMenuItemImage(\"Estado/Com";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Estado/Comentario","EstadoComentario",_imgcom);
RDebugUtils.currentLine=41549865;
 //BA.debugLineNum = 41549865;BA.debugLine="jamTableView1.AddContextMenuItemFontAwesomeText(\"";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._addcontextmenuitemfontawesometext /*String*/ (null,"Copiar Estado-Comentario A Línea Siguiente","CopiarEstadoComentarioALineaSiguiente",BA.ObjectToString(parent.__c.Chr(((int)0xf0c5))));
RDebugUtils.currentLine=41549868;
 //BA.debugLineNum = 41549868;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.Configurar";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ListaAnalisisDisponiblesAlmacenArticuloTalla.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=41549869;
 //BA.debugLineNum = 41549869;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "show"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 7;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=41549870;
 //BA.debugLineNum = 41549870;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("841549870",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=41549871;
 //BA.debugLineNum = 41549871;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=41549872;
 //BA.debugLineNum = 41549872;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msgE";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=41549873;
 //BA.debugLineNum = 41549873;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "show"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 10;
;
RDebugUtils.currentLine=41549874;
 //BA.debugLineNum = 41549874;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=41549875;
 //BA.debugLineNum = 41549875;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=41549878;
 //BA.debugLineNum = 41549878;BA.debugLine="jamTableView1.AlturaFilas=0    ' 0 si se quiere q";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setalturafilas(null,0);
RDebugUtils.currentLine=41549882;
 //BA.debugLineNum = 41549882;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=41549883;
 //BA.debugLineNum = 41549883;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=41549884;
 //BA.debugLineNum = 41549884;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnafechasqlserver /*String*/ ;
RDebugUtils.currentLine=41549885;
 //BA.debugLineNum = 41549885;BA.debugLine="CF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=41549886;
 //BA.debugLineNum = 41549886;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=41549887;
 //BA.debugLineNum = 41549887;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"UltimoMovPositivo"}));
RDebugUtils.currentLine=41549889;
 //BA.debugLineNum = 41549889;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=41549890;
 //BA.debugLineNum = 41549890;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=41549891;
 //BA.debugLineNum = 41549891;BA.debugLine="CF.NombreFuncionCellFactory=jamTableView1.CellFac";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._cellfactory_columnawraptext /*String*/ ;
RDebugUtils.currentLine=41549892;
 //BA.debugLineNum = 41549892;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF, Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"DescripcionArticulo"}));
RDebugUtils.currentLine=41549917;
 //BA.debugLineNum = 41549917;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=41549918;
 //BA.debugLineNum = 41549918;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=41549919;
 //BA.debugLineNum = 41549919;BA.debugLine="CF.NombreFuncionCellFactory=\"setColumnaImagenCome";
_cf.NombreFuncionCellFactory /*String*/  = "setColumnaImagenComentario";
RDebugUtils.currentLine=41549920;
 //BA.debugLineNum = 41549920;BA.debugLine="CF.CellFactoryEnCallBack=True";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=41549921;
 //BA.debugLineNum = 41549921;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=41549925;
 //BA.debugLineNum = 41549925;BA.debugLine="imagencomentario=Utilidades.GetImageBytes(File.Di";
__ref._imagencomentario /*byte[]*/  = parent._utilidades._getimagebytes /*byte[]*/ (parent.__c.File.getDirAssets(),"comment16Freepik.png");
RDebugUtils.currentLine=41549933;
 //BA.debugLineNum = 41549933;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=41549934;
 //BA.debugLineNum = 41549934;BA.debugLine="jamTableView1.SetCellFactoryListaCampos(CF,Array";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setcellfactorylistacampos /*String*/ (null,_cf,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Comentarios"}));
RDebugUtils.currentLine=41549936;
 //BA.debugLineNum = 41549936;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=41549937;
 //BA.debugLineNum = 41549937;BA.debugLine="jamLoadingIndicator1.Initialize(Me,frm.RootPane)";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=41549938;
 //BA.debugLineNum = 41549938;BA.debugLine="jamLoadingIndicator1.EstiloLoadingIndicator=\"Five";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setestiloloadingindicator(null,"Five Lines 1");
RDebugUtils.currentLine=41549939;
 //BA.debugLineNum = 41549939;BA.debugLine="jamLoadingIndicator1.ColorPanelFondo=xui.Color_Tr";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setcolorpanelfondo /*int*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=41549940;
 //BA.debugLineNum = 41549940;BA.debugLine="jamLoadingIndicator1.ColorLoadingIndicator=0xFF69";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setcolorloadingindicator(null,((int)0xff696969));
RDebugUtils.currentLine=41549941;
 //BA.debugLineNum = 41549941;BA.debugLine="jamLoadingIndicator1.ColorMensaje=0xFF696969";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setcolormensaje(null,((int)0xff696969));
RDebugUtils.currentLine=41549943;
 //BA.debugLineNum = 41549943;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=41549945;
 //BA.debugLineNum = 41549945;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
RDebugUtils.currentLine=41549947;
 //BA.debugLineNum = 41549947;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _actualizardatos(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "actualizardatos", false))
	 {Debug.delegate(ba, "actualizardatos", null); return;}
ResumableSub_ActualizarDatos rsub = new ResumableSub_ActualizarDatos(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarDatos extends BA.ResumableSub {
public ResumableSub_ActualizarDatos(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
Object _senderfilter = null;
boolean _success = false;
Object _robj = null;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="Wait For(ActualizarDatosDisponiblesNAV) complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), __ref._actualizardatosdisponiblesnav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="If Accion<>\"OK\" Then";
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
RDebugUtils.currentLine=41877509;
 //BA.debugLineNum = 41877509;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=41877511;
 //BA.debugLineNum = 41877511;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=41877515;
 //BA.debugLineNum = 41877515;BA.debugLine="Wait For(ActualizarDatosEstadoComentariosAlmacenA";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), __ref._actualizardatosestadocomentariosalmacenarticulotalla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 35;
return;
case 35:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=41877516;
 //BA.debugLineNum = 41877516;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=41877517;
 //BA.debugLineNum = 41877517;BA.debugLine="If Accion<>\"OK\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_accion).equals("OK") == false) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=41877518;
 //BA.debugLineNum = 41877518;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=41877519;
 //BA.debugLineNum = 41877519;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=41877520;
 //BA.debugLineNum = 41877520;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=41877523;
 //BA.debugLineNum = 41877523;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=41877524;
 //BA.debugLineNum = 41877524;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=41877525;
 //BA.debugLineNum = 41877525;BA.debugLine="sb.Append(\"update tblAnalisisDisponiblesAlmacenAr";
_sb.Append("update tblAnalisisDisponiblesAlmacenArticuloTalla set Comentarios=1 from ");
RDebugUtils.currentLine=41877526;
 //BA.debugLineNum = 41877526;BA.debugLine="sb.append(\" (select Almacen,Articulo,Talla from t";
_sb.Append(" (select Almacen,Articulo,Talla from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla where Comentario<>? group by Almacen,Articulo,Talla having count(*)>0) as tNumLin");
RDebugUtils.currentLine=41877527;
 //BA.debugLineNum = 41877527;BA.debugLine="sb.Append(\" where tblAnalisisDisponiblesAlmacenAr";
_sb.Append(" where tblAnalisisDisponiblesAlmacenArticuloTalla.Almacen=tNumLin.Almacen and");
RDebugUtils.currentLine=41877528;
 //BA.debugLineNum = 41877528;BA.debugLine="sb.Append(\" tblAnalisisDisponiblesAlmacenArticulo";
_sb.Append(" tblAnalisisDisponiblesAlmacenArticuloTalla.Articulo=tNumLin.Articulo and tblAnalisisDisponiblesAlmacenArticuloTalla.Talla=tNumLin.Talla");
RDebugUtils.currentLine=41877529;
 //BA.debugLineNum = 41877529;BA.debugLine="mSQL.AddNonQueryToBatch(sb.ToString, Array As Obj";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("")}));
RDebugUtils.currentLine=41877531;
 //BA.debugLineNum = 41877531;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=41877532;
 //BA.debugLineNum = 41877532;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=41877533;
 //BA.debugLineNum = 41877533;BA.debugLine="sb.Append(\"update tblAnalisisDisponiblesAlmacenAr";
_sb.Append("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=tEst.Estado from ");
RDebugUtils.currentLine=41877534;
 //BA.debugLineNum = 41877534;BA.debugLine="sb.append(\" (select Almacen,Articulo,Talla, Estad";
_sb.Append(" (select Almacen,Articulo,Talla, Estado from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla) as tEst");
RDebugUtils.currentLine=41877535;
 //BA.debugLineNum = 41877535;BA.debugLine="sb.Append(\" where tblAnalisisDisponiblesAlmacenAr";
_sb.Append(" where tblAnalisisDisponiblesAlmacenArticuloTalla.Almacen=tEst.Almacen");
RDebugUtils.currentLine=41877536;
 //BA.debugLineNum = 41877536;BA.debugLine="sb.Append(\" and tblAnalisisDisponiblesAlmacenArti";
_sb.Append(" and tblAnalisisDisponiblesAlmacenArticuloTalla.Articulo=tEst.Articulo");
RDebugUtils.currentLine=41877537;
 //BA.debugLineNum = 41877537;BA.debugLine="sb.Append(\" and tblAnalisisDisponiblesAlmacenArti";
_sb.Append(" and tblAnalisisDisponiblesAlmacenArticuloTalla.Talla=tEst.Talla");
RDebugUtils.currentLine=41877538;
 //BA.debugLineNum = 41877538;BA.debugLine="mSQL.AddNonQueryToBatch(sb.ToString, Null)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=41877540;
 //BA.debugLineNum = 41877540;BA.debugLine="Dim SenderFilter As Object = mSQL.ExecNonQueryBat";
_senderfilter = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQueryBatch(ba,"SQL");
RDebugUtils.currentLine=41877541;
 //BA.debugLineNum = 41877541;BA.debugLine="Wait For (SenderFilter) SQL_NonQueryComplete (Suc";
parent.__c.WaitFor("sql_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _senderfilter);
this.state = 36;
return;
case 36:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=41877542;
 //BA.debugLineNum = 41877542;BA.debugLine="Log(\"NonQuery: \" & Success)";
parent.__c.LogImpl("841877542","NonQuery: "+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=41877543;
 //BA.debugLineNum = 41877543;BA.debugLine="If Success=False Then";
if (true) break;

case 9:
//if
this.state = 12;
if (_success==parent.__c.False) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=41877544;
 //BA.debugLineNum = 41877544;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=41877545;
 //BA.debugLineNum = 41877545;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Error\",\"No ha sid";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Error","No ha sido posible actualizar los datos SQLite."));
this.state = 37;
return;
case 37:
//C
this.state = 12;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=41877546;
 //BA.debugLineNum = 41877546;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=41877547;
 //BA.debugLineNum = 41877547;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=41877550;
 //BA.debugLineNum = 41877550;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblAnalisisDisponiblesAlmacenArticuloTalla order by Almacen, Articulo, Talla");
RDebugUtils.currentLine=41877552;
 //BA.debugLineNum = 41877552;BA.debugLine="Dim rSub As ResumableSub=jamTableView1.setdata(rs";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=41877553;
 //BA.debugLineNum = 41877553;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _rsub);
this.state = 38;
return;
case 38:
//C
this.state = 13;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=41877554;
 //BA.debugLineNum = 41877554;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=41877555;
 //BA.debugLineNum = 41877555;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=41877556;
 //BA.debugLineNum = 41877556;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 13:
//if
this.state = 33;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=41877557;
 //BA.debugLineNum = 41877557;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";
if (true) break;

case 16:
//if
this.state = 23;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=41877558;
 //BA.debugLineNum = 41877558;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=41877559;
 //BA.debugLineNum = 41877559;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 19;
;
RDebugUtils.currentLine=41877561;
 //BA.debugLineNum = 41877561;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"¿Abrir Ca";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"¿Abrir CamposBuilder?","","Sí","","No",(javafx.scene.image.Image)(parent.__c.Null));
RDebugUtils.currentLine=41877562;
 //BA.debugLineNum = 41877562;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _msa);
this.state = 40;
return;
case 40:
//C
this.state = 19;
_rint = (int) result[1];
;
RDebugUtils.currentLine=41877563;
 //BA.debugLineNum = 41877563;BA.debugLine="If rInt=xui.DialogResponse_Positive Then";
if (true) break;

case 19:
//if
this.state = 22;
if (_rint==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=41877564;
 //BA.debugLineNum = 41877564;BA.debugLine="jamTableView1.AbrirCamposBuilder";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._abrircamposbuilder /*void*/ (null);
RDebugUtils.currentLine=41877565;
 //BA.debugLineNum = 41877565;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=41877568;
 //BA.debugLineNum = 41877568;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;
;
RDebugUtils.currentLine=41877570;
 //BA.debugLineNum = 41877570;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";

case 23:
//if
this.state = 32;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=41877571;
 //BA.debugLineNum = 41877571;BA.debugLine="If True=mResultSetData.Get(\"ListaVacia\") Then R";
if (true) break;

case 26:
//if
this.state = 31;
if (parent.__c.True==BA.ObjectToBoolean(_mresultsetdata.Get((Object)("ListaVacia")))) { 
this.state = 28;
;}if (true) break;

case 28:
//C
this.state = 31;
if (true) return ;
if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=41877572;
 //BA.debugLineNum = 41877572;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=41877573;
 //BA.debugLineNum = 41877573;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatos"), _msa);
this.state = 41;
return;
case 41:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=41877578;
 //BA.debugLineNum = 41877578;BA.debugLine="fx.Msgbox(frm,\"Datos actualizados.\",\"Aviso\")";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Datos actualizados.","Aviso");
RDebugUtils.currentLine=41877582;
 //BA.debugLineNum = 41877582;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosdisponiblesnav(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "actualizardatosdisponiblesnav", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosdisponiblesnav", null));}
ResumableSub_ActualizarDatosDisponiblesNAV rsub = new ResumableSub_ActualizarDatosDisponiblesNAV(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosDisponiblesNAV extends BA.ResumableSub {
public ResumableSub_ActualizarDatosDisponiblesNAV(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando datos Disponible por Almacén Artículo Talla..."));
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="jamLoadingIndicator1.Show";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="mSQL.ExecNonQuery(\"DELETE from tblAnalisisDisponi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("DELETE from tblAnalisisDisponiblesAlmacenArticuloTalla");
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=42008581;
 //BA.debugLineNum = 42008581;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42008582;
 //BA.debugLineNum = 42008582;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=42008583;
 //BA.debugLineNum = 42008583;BA.debugLine="Dim sLinkJRDC As String=Main.rdcLinkNav";
_slinkjrdc = parent._main._rdclinknav /*String*/ ;
RDebugUtils.currentLine=42008584;
 //BA.debugLineNum = 42008584;BA.debugLine="Dim Comando As String=\"AnalisisDisponiblesAlmacen";
_comando = "AnalisisDisponiblesAlmacenArticuloTalla";
RDebugUtils.currentLine=42008585;
 //BA.debugLineNum = 42008585;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=42008587;
 //BA.debugLineNum = 42008587;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosdisponiblesnav"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42008588;
 //BA.debugLineNum = 42008588;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=42008589;
 //BA.debugLineNum = 42008589;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=42008590;
 //BA.debugLineNum = 42008590;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=42008591;
 //BA.debugLineNum = 42008591;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosdisponiblesnav"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=42008592;
 //BA.debugLineNum = 42008592;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=42008593;
 //BA.debugLineNum = 42008593;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=42008596;
 //BA.debugLineNum = 42008596;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=42008597;
 //BA.debugLineNum = 42008597;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=42008598;
 //BA.debugLineNum = 42008598;BA.debugLine="Accion=\"Sin Datos\"";
_accion = "Sin Datos";
RDebugUtils.currentLine=42008599;
 //BA.debugLineNum = 42008599;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=42008600;
 //BA.debugLineNum = 42008600;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de Analisis Disponibles Almacen Articulo Talla","Aviso");
RDebugUtils.currentLine=42008601;
 //BA.debugLineNum = 42008601;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosdisponiblesnav"), _msa);
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
RDebugUtils.currentLine=42008603;
 //BA.debugLineNum = 42008603;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=42008604;
 //BA.debugLineNum = 42008604;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=42008607;
 //BA.debugLineNum = 42008607;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=42008611;
 //BA.debugLineNum = 42008611;BA.debugLine="Utilidades.InsertarMapsSoloCamposCoincidentes(m";
parent._utilidades._insertarmapssolocamposcoincidentes /*String*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblAnalisisDisponiblesAlmacenArticuloTalla",_lstreg);
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
RDebugUtils.currentLine=42008614;
 //BA.debugLineNum = 42008614;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=42008615;
 //BA.debugLineNum = 42008615;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _salirmodulo(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="private Sub SalirModulo";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="jamTableView1.GuardarConfiguracionColumnasUsuario";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatosestadocomentariosalmacenarticulotalla(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "actualizardatosestadocomentariosalmacenarticulotalla", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatosestadocomentariosalmacenarticulotalla", null));}
ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla rsub = new ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla extends BA.ResumableSub {
public ResumableSub_ActualizarDatosEstadoComentariosAlmacenArticuloTalla(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="jamLoadingIndicator1.MensajeLoading=\"Actualizando";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._setmensajeloading(null,(Object)("Actualizando datos Estado-Comentarios por Almacén Artículo Talla..."));
RDebugUtils.currentLine=42074116;
 //BA.debugLineNum = 42074116;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=42074117;
 //BA.debugLineNum = 42074117;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42074118;
 //BA.debugLineNum = 42074118;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=42074119;
 //BA.debugLineNum = 42074119;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=42074120;
 //BA.debugLineNum = 42074120;BA.debugLine="Dim Comando As String=\"AnalisisDisponiblesEstadoC";
_comando = "AnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla";
RDebugUtils.currentLine=42074121;
 //BA.debugLineNum = 42074121;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Null, Me)";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,(Object[])(parent.__c.Null),parent);
RDebugUtils.currentLine=42074123;
 //BA.debugLineNum = 42074123;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosestadocomentariosalmacenarticulotalla"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42074124;
 //BA.debugLineNum = 42074124;BA.debugLine="jamLoadingIndicator1.close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=42074125;
 //BA.debugLineNum = 42074125;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=42074126;
 //BA.debugLineNum = 42074126;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=42074127;
 //BA.debugLineNum = 42074127;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "actualizardatosestadocomentariosalmacenarticulotalla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=42074128;
 //BA.debugLineNum = 42074128;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=42074129;
 //BA.debugLineNum = 42074129;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=42074132;
 //BA.debugLineNum = 42074132;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=42074134;
 //BA.debugLineNum = 42074134;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=42074135;
 //BA.debugLineNum = 42074135;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=42074139;
 //BA.debugLineNum = 42074139;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=42074140;
 //BA.debugLineNum = 42074140;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=42074143;
 //BA.debugLineNum = 42074143;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=42074147;
 //BA.debugLineNum = 42074147;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblAnalisisDisponibles";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla",_lstreg);
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
RDebugUtils.currentLine=42074150;
 //BA.debugLineNum = 42074150;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=42074151;
 //BA.debugLineNum = 42074151;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=41418759;
 //BA.debugLineNum = 41418759;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=41418760;
 //BA.debugLineNum = 41418760;BA.debugLine="Private jamTableView1 As jamTableView";
_jamtableview1 = new b4j.docU.jamtableview();
RDebugUtils.currentLine=41418762;
 //BA.debugLineNum = 41418762;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=41418763;
 //BA.debugLineNum = 41418763;BA.debugLine="Private jamLoadingIndicator1 As JamLoadingIndicat";
_jamloadingindicator1 = new b4j.docU.jamloadingindicator();
RDebugUtils.currentLine=41418764;
 //BA.debugLineNum = 41418764;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=41418766;
 //BA.debugLineNum = 41418766;BA.debugLine="Public PermisoModuloUsuario As String";
_permisomodulousuario = "";
RDebugUtils.currentLine=41418768;
 //BA.debugLineNum = 41418768;BA.debugLine="Private imagencomentario() As Byte";
_imagencomentario = new byte[(int) (0)];
;
RDebugUtils.currentLine=41418769;
 //BA.debugLineNum = 41418769;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _copiarestadocomentarioanalisisdispalmarttalla(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,String _almacendestino,String _articulodestino,String _talladestino,String _estadocopiado,String _comentariocopiado) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "copiarestadocomentarioanalisisdispalmarttalla", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "copiarestadocomentarioanalisisdispalmarttalla", new Object[] {_almacendestino,_articulodestino,_talladestino,_estadocopiado,_comentariocopiado}));}
ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla rsub = new ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla(this,__ref,_almacendestino,_articulodestino,_talladestino,_estadocopiado,_comentariocopiado);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla extends BA.ResumableSub {
public ResumableSub_CopiarEstadoComentarioAnalisisDispAlmArtTalla(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,String _almacendestino,String _articulodestino,String _talladestino,String _estadocopiado,String _comentariocopiado) {
this.parent = parent;
this.__ref = __ref;
this._almacendestino = _almacendestino;
this._articulodestino = _articulodestino;
this._talladestino = _talladestino;
this._estadocopiado = _estadocopiado;
this._comentariocopiado = _comentariocopiado;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
String _almacendestino;
String _articulodestino;
String _talladestino;
String _estadocopiado;
String _comentariocopiado;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.Map _mresp = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="Dim lstReg As List";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="lstReg.Initialize";
_lstreg.Initialize();
RDebugUtils.currentLine=42336260;
 //BA.debugLineNum = 42336260;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=42336261;
 //BA.debugLineNum = 42336261;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=42336262;
 //BA.debugLineNum = 42336262;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=42336263;
 //BA.debugLineNum = 42336263;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=42336264;
 //BA.debugLineNum = 42336264;BA.debugLine="mRes.Put(\"lstRegistros\",lstReg)";
_mres.Put((Object)("lstRegistros"),(Object)(_lstreg.getObject()));
RDebugUtils.currentLine=42336265;
 //BA.debugLineNum = 42336265;BA.debugLine="Dim Comando As String";
_comando = "";
RDebugUtils.currentLine=42336266;
 //BA.debugLineNum = 42336266;BA.debugLine="Comando=\"NuevoEditarEstadoComentarioAnalisisDispA";
_comando = "NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla";
RDebugUtils.currentLine=42336267;
 //BA.debugLineNum = 42336267;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,new Object[]{(Object)(parent.__c.DateTime.getNow()),(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ),(Object)(_almacendestino),(Object)(_articulodestino),(Object)(_talladestino),(Object)(_comentariocopiado),(Object)(_estadocopiado)},parent);
RDebugUtils.currentLine=42336270;
 //BA.debugLineNum = 42336270;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "copiarestadocomentarioanalisisdispalmarttalla"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42336272;
 //BA.debugLineNum = 42336272;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=42336273;
 //BA.debugLineNum = 42336273;BA.debugLine="jamLoadingIndicator1.Close";
__ref._jamloadingindicator1 /*b4j.docU.jamloadingindicator*/ ._close /*String*/ (null);
RDebugUtils.currentLine=42336275;
 //BA.debugLineNum = 42336275;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando,"Error");
RDebugUtils.currentLine=42336276;
 //BA.debugLineNum = 42336276;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "copiarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=42336277;
 //BA.debugLineNum = 42336277;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=42336278;
 //BA.debugLineNum = 42336278;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=42336280;
 //BA.debugLineNum = 42336280;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=42336282;
 //BA.debugLineNum = 42336282;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=42336283;
 //BA.debugLineNum = 42336283;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=42336285;
 //BA.debugLineNum = 42336285;BA.debugLine="lstReg=mResult.Get(\"lstRes\")";
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=42336286;
 //BA.debugLineNum = 42336286;BA.debugLine="Dim mResp As Map=lstReg.Get(0)";
_mresp = new anywheresoftware.b4a.objects.collections.Map();
_mresp = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=42336287;
 //BA.debugLineNum = 42336287;BA.debugLine="Dim sResp As String=mResp.GetValueAt(0)";
_sresp = BA.ObjectToString(_mresp.GetValueAt((int) (0)));
RDebugUtils.currentLine=42336288;
 //BA.debugLineNum = 42336288;BA.debugLine="If sResp.ToUpperCase.StartsWith(\"ERR\") Then";
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
RDebugUtils.currentLine=42336289;
 //BA.debugLineNum = 42336289;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error SP Nu";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error SP NuevoEditarEstadoComentarioAnalisisDispAlmArtTalla"+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Error");
RDebugUtils.currentLine=42336290;
 //BA.debugLineNum = 42336290;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "copiarestadocomentarioanalisisdispalmarttalla"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 16;
;
RDebugUtils.currentLine=42336291;
 //BA.debugLineNum = 42336291;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=42336292;
 //BA.debugLineNum = 42336292;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=42336294;
 //BA.debugLineNum = 42336294;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=42336295;
 //BA.debugLineNum = 42336295;BA.debugLine="mRes.Put(\"Accion\", Accion)";
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
RDebugUtils.currentLine=42336299;
 //BA.debugLineNum = 42336299;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=42336300;
 //BA.debugLineNum = 42336300;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _creaciontablassqlite(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblAnalisisDisponiblesAlmacenArticuloTalla"}))));
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAnalisisDisponi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblAnalisisDisponiblesAlmacenArticuloTalla");
 };
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=41943047;
 //BA.debugLineNum = 41943047;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
_sbcreartabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesAlmacenArticuloTalla] ([Almacen] TEXT, [NombreAlmacen] TEXT");
RDebugUtils.currentLine=41943048;
 //BA.debugLineNum = 41943048;BA.debugLine="sbCrearTabla.Append(\", [Bloqueado] TEXT, [Computa";
_sbcreartabla.Append(", [Bloqueado] TEXT, [ComputableExistencias] TEXT, [Inactivo] TEXT, [AlmacenGestCompras] TEXT, [AlmacenInterno] TEXT");
RDebugUtils.currentLine=41943049;
 //BA.debugLineNum = 41943049;BA.debugLine="sbCrearTabla.Append(\", [Taller] TEXT, [Deposito]";
_sbcreartabla.Append(", [Taller] TEXT, [Deposito] TEXT, [Renting] TEXT, [Articulo] TEXT, [DescripcionArticulo] TEXT, [Talla] TEXT, [Stock] REAL");
RDebugUtils.currentLine=41943050;
 //BA.debugLineNum = 41943050;BA.debugLine="sbCrearTabla.Append(\", [CosteUnitario] REAL, [Tot";
_sbcreartabla.Append(", [CosteUnitario] REAL, [TotalCosteStock] REAL, [ClienteExclusiva] TEXT, [NombreClienteExclusiva] TEXT, [StockNoConfigurado] TEXT");
RDebugUtils.currentLine=41943051;
 //BA.debugLineNum = 41943051;BA.debugLine="sbCrearTabla.Append(\", [SistemaReposicion] TEXT,";
_sbcreartabla.Append(", [SistemaReposicion] TEXT, [ArticuloBloqueado] TEXT, [ArticuloBloqueadoNoDisponible] TEXT, [GrupoContable] TEXT, [NombreRuta] TEXT");
RDebugUtils.currentLine=41943052;
 //BA.debugLineNum = 41943052;BA.debugLine="sbCrearTabla.Append(\", [RutaCorte] TEXT, [Proveed";
_sbcreartabla.Append(", [RutaCorte] TEXT, [ProveedorPredeterminado] TEXT, [NombreProveedorPredeterminado] TEXT, [UltimoMovPositivo] INTEGER, [UltimoMovVenta] INTEGER,[Cantidad3M] REAL");
RDebugUtils.currentLine=41943053;
 //BA.debugLineNum = 41943053;BA.debugLine="sbCrearTabla.Append(\", [Cantidad6M] REAL, [Cantid";
_sbcreartabla.Append(", [Cantidad6M] REAL, [Cantidad9M] REAL, [Cantidad12M] REAL, [Cantidad24M] REAL, [ArtTallaConMaxMin] TEXT, [StockMax] REAL, [StockMin] REAL, [NecConsumo] REAL");
RDebugUtils.currentLine=41943054;
 //BA.debugLineNum = 41943054;BA.debugLine="sbCrearTabla.Append(\", [NecVenta] REAL, [NecEnvio";
_sbcreartabla.Append(", [NecVenta] REAL, [NecEnvioTransf] REAL, [QtyPteRecTransf] REAL,[PteRecepcionTransf] REAL, [NecNeta] REAL, [Disponible] REAL, [CosteDisponible] REAL");
RDebugUtils.currentLine=41943055;
 //BA.debugLineNum = 41943055;BA.debugLine="sbCrearTabla.Append(\", [MesesConsumo6M] REAL, [Se";
_sbcreartabla.Append(", [MesesConsumo6M] REAL, [SegConsumo] TEXT, [Comentarios] INTEGER default 0, [Estado] TEXT default '')");
RDebugUtils.currentLine=41943056;
 //BA.debugLineNum = 41943056;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=41943059;
 //BA.debugLineNum = 41943059;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla"}))));
RDebugUtils.currentLine=41943060;
 //BA.debugLineNum = 41943060;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=41943061;
 //BA.debugLineNum = 41943061;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblAnalisisDisponi";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla");
 };
RDebugUtils.currentLine=41943063;
 //BA.debugLineNum = 41943063;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=41943064;
 //BA.debugLineNum = 41943064;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=41943065;
 //BA.debugLineNum = 41943065;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE If Not EXISTS [";
_sbcreartabla.Append("CREATE TABLE If Not EXISTS [tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla] ");
RDebugUtils.currentLine=41943066;
 //BA.debugLineNum = 41943066;BA.debugLine="sbCrearTabla.Append(\"([IDLin] INTEGER, [FechaLong";
_sbcreartabla.Append("([IDLin] INTEGER, [FechaLong] INTEGER, [Usuario] TEXT, [Almacen] TEXT, [Articulo] TEXT, [Talla] TEXT, [Comentario] TEXT, [Estado] TEXT)");
RDebugUtils.currentLine=41943067;
 //BA.debugLineNum = 41943067;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=41943069;
 //BA.debugLineNum = 41943069;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "frm_closerequest", false))
	 {return ((String) Debug.delegate(ba, "frm_closerequest", new Object[] {_eventdata}));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_accionsalirjamtableview(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "jamtableview1_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_accionsalirjamtableview", null));}
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Sub jamTableView1_AccionSalirJamTableView";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="End Sub";
return "";
}
public String  _jamtableview1_cambioenceldaseleccionada(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "jamtableview1_cambioenceldaseleccionada", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_cambioenceldaseleccionada", new Object[] {_datosceldaseleccionada}));}
int _lineaseltv = 0;
String _alm = "";
String _art = "";
String _desart = "";
String _tal = "";
double _stock = 0;
double _necneta = 0;
double _disponible = 0;
double _cantidad6m = 0;
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Sub jamTableView1_CambioEnCeldaSeleccionada(DatosC";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="Dim LineaSelTV As Int=DatosCeldaSeleccionada.Fila";
_lineaseltv = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="Dim Alm As String=jamTableView1.GetValorSQLCampoF";
_alm = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Almacen"));
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="Dim Art As String=jamTableView1.GetValorSQLCampoF";
_art = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Articulo"));
RDebugUtils.currentLine=42401796;
 //BA.debugLineNum = 42401796;BA.debugLine="Dim DesArt As String=jamTableView1.GetValorSQLCam";
_desart = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"DescripcionArticulo"));
RDebugUtils.currentLine=42401797;
 //BA.debugLineNum = 42401797;BA.debugLine="Dim Tal As String=jamTableView1.GetValorSQLCampoF";
_tal = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Talla"));
RDebugUtils.currentLine=42401798;
 //BA.debugLineNum = 42401798;BA.debugLine="Dim Stock As Double=jamTableView1.GetValorSQLCamp";
_stock = (double)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Stock")));
RDebugUtils.currentLine=42401799;
 //BA.debugLineNum = 42401799;BA.debugLine="Dim NecNeta As Double=jamTableView1.GetValorSQLCa";
_necneta = (double)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"NecNeta")));
RDebugUtils.currentLine=42401800;
 //BA.debugLineNum = 42401800;BA.debugLine="Dim Disponible As Double=jamTableView1.GetValorSQ";
_disponible = (double)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Disponible")));
RDebugUtils.currentLine=42401801;
 //BA.debugLineNum = 42401801;BA.debugLine="Dim Cantidad6M As Double=jamTableView1.GetValorSQ";
_cantidad6m = (double)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_lineaseltv,"Cantidad6M")));
RDebugUtils.currentLine=42401802;
 //BA.debugLineNum = 42401802;BA.debugLine="jamTableView1.TextoPanelInfoJamTableView=\"Almacén";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._settextopanelinfojamtableview /*Object*/ (null,(Object)("Almacén: "+_alm+" Artículo: "+_art+"  "+_desart+" Talla "+_tal+"  STOCK: "+_utilidades._formatonumerico2 /*String*/ (_stock,(int) (1),(int) (2),(int) (0),__c.True)+"  NecNeta: "+_utilidades._formatonumerico2 /*String*/ (_necneta,(int) (1),(int) (2),(int) (0),__c.True)+"  Disponible: "+_utilidades._formatonumerico2 /*String*/ (_disponible,(int) (1),(int) (2),(int) (0),__c.True)+"  Cantidad6M: "+_utilidades._formatonumerico2 /*String*/ (_cantidad6m,(int) (1),(int) (2),(int) (0),__c.True)));
RDebugUtils.currentLine=42401806;
 //BA.debugLineNum = 42401806;BA.debugLine="End Sub";
return "";
}
public void  _jamtableview1_celldobleclick(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "jamtableview1_celldobleclick", false))
	 {Debug.delegate(ba, "jamtableview1_celldobleclick", new Object[] {_datosceldaseleccionada}); return;}
ResumableSub_jamTableView1_CellDobleClick rsub = new ResumableSub_jamTableView1_CellDobleClick(this,__ref,_datosceldaseleccionada);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_CellDobleClick extends BA.ResumableSub {
public ResumableSub_jamTableView1_CellDobleClick(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada) {
this.parent = parent;
this.__ref = __ref;
this._datosceldaseleccionada = _datosceldaseleccionada;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _datosceldaseleccionada;
int _filaseleccionada = 0;
String _almacensel = "";
String _nombrealmacensel = "";
String _articulosel = "";
String _descripcionarticulosel = "";
String _tallasel = "";
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla _cestcom = null;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla _datosanalisisdisponiblefichaalmacenarticulotalla = null;
int _intcom = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="Dim FilaSeleccionada As Int=DatosCeldaSeleccionad";
_filaseleccionada = _datosceldaseleccionada.Fila /*int*/ ;
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="Dim AlmacenSel As String=jamTableView1.GetValorSQ";
_almacensel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Almacen"));
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="Dim NombreAlmacenSel As String=jamTableView1.GetV";
_nombrealmacensel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"NombreAlmacen"));
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="Dim ArticuloSel As String=jamTableView1.GetValorS";
_articulosel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Articulo"));
RDebugUtils.currentLine=42467333;
 //BA.debugLineNum = 42467333;BA.debugLine="Dim DescripcionArticuloSel As String=jamTableView";
_descripcionarticulosel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"DescripcionArticulo"));
RDebugUtils.currentLine=42467334;
 //BA.debugLineNum = 42467334;BA.debugLine="Dim TallaSel As String=jamTableView1.GetValorSQLC";
_tallasel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Talla"));
RDebugUtils.currentLine=42467335;
 //BA.debugLineNum = 42467335;BA.debugLine="Dim cEstCom As cAnalisisDisponibleFichaEstadoCome";
_cestcom = new b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla();
RDebugUtils.currentLine=42467336;
 //BA.debugLineNum = 42467336;BA.debugLine="cEstCom.Initialize(Me, frm.RootPane,AlmacenSel, N";
_cestcom._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),_almacensel,_nombrealmacensel,_articulosel,_descripcionarticulosel,_tallasel);
RDebugUtils.currentLine=42467337;
 //BA.debugLineNum = 42467337;BA.debugLine="cEstCom.Show";
_cestcom._show /*void*/ (null);
RDebugUtils.currentLine=42467338;
 //BA.debugLineNum = 42467338;BA.debugLine="wait for cAnalisisDisponibleFichaEstadoComentario";
parent.__c.WaitFor("canalisisdisponiblefichaestadocomentarioalmacenarticulotalla_done", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_celldobleclick"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_datosanalisisdisponiblefichaalmacenarticulotalla = (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla) result[1];
;
RDebugUtils.currentLine=42467339;
 //BA.debugLineNum = 42467339;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticuloTal";
if (true) break;

case 1:
//if
this.state = 10;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.DatosModificados /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=42467340;
 //BA.debugLineNum = 42467340;BA.debugLine="Dim intCom As Int";
_intcom = 0;
RDebugUtils.currentLine=42467341;
 //BA.debugLineNum = 42467341;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticuloTa";
if (true) break;

case 4:
//if
this.state = 9;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.ConComentario /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=42467342;
 //BA.debugLineNum = 42467342;BA.debugLine="intCom=1";
_intcom = (int) (1);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=42467344;
 //BA.debugLineNum = 42467344;BA.debugLine="intCom=0";
_intcom = (int) (0);
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=42467346;
 //BA.debugLineNum = 42467346;BA.debugLine="jamTableView1.SQL.ExecNonQuery2(\"update tblOrige";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Estado /*String*/ ),(Object)(_intcom),(Object)(_almacensel),(Object)(_articulosel),(Object)(_tallasel)}));
RDebugUtils.currentLine=42467348;
 //BA.debugLineNum = 42467348;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponible";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Estado /*String*/ ),(Object)(_intcom),(Object)(_almacensel),(Object)(_articulosel),(Object)(_tallasel)}));
RDebugUtils.currentLine=42467350;
 //BA.debugLineNum = 42467350;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponible";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Estado /*String*/ ),(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Comentario /*String*/ ),(Object)(_almacensel),(Object)(_articulosel),(Object)(_tallasel)}));
RDebugUtils.currentLine=42467352;
 //BA.debugLineNum = 42467352;BA.debugLine="jamTableView1.RefrescarFilaTVMetodoSQL(FilaSelec";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,_filaseleccionada);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=42467354;
 //BA.debugLineNum = 42467354;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jamtableview1_contextmenuitem_action(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,String _tagmenuitem) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "jamtableview1_contextmenuitem_action", false))
	 {Debug.delegate(ba, "jamtableview1_contextmenuitem_action", new Object[] {_tagmenuitem}); return;}
ResumableSub_jamTableView1_ContextMenuItem_Action rsub = new ResumableSub_jamTableView1_ContextMenuItem_Action(this,__ref,_tagmenuitem);
rsub.resume(ba, null);
}
public static class ResumableSub_jamTableView1_ContextMenuItem_Action extends BA.ResumableSub {
public ResumableSub_jamTableView1_ContextMenuItem_Action(b4j.docU.canalisisdisponiblesalmacenarticulotalla parent,b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,String _tagmenuitem) {
this.parent = parent;
this.__ref = __ref;
this._tagmenuitem = _tagmenuitem;
this.__ref = parent;
}
b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref;
b4j.docU.canalisisdisponiblesalmacenarticulotalla parent;
String _tagmenuitem;
String _articulosel = "";
int _filaseleccionada = 0;
anywheresoftware.b4a.objects.collections.List _lstinfofila = null;
b4j.docU.jamtableview._datoscamporegistrojamtableview _dc = null;
Object _msa = null;
int _rint = 0;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
boolean _success = false;
String _almacensel = "";
String _nombrealmacensel = "";
String _descripcionarticulosel = "";
String _tallasel = "";
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla _cestcom = null;
b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla _datosanalisisdisponiblefichaalmacenarticulotalla = null;
int _intcom = 0;
Object _robj = null;
int _filadestino = 0;
String _almacendestino = "";
String _articulodestino = "";
String _talladestino = "";
String _estadocopiado = "";
String _comentariocopiado = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="Select Case TagMenuItem";
if (true) break;

case 1:
//select
this.state = 61;
switch (BA.switchObjectToInt(_tagmenuitem,"VerArticuloNAV","EstadoComentario","CopiarEstadoComentarioALineaSiguiente")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 26;
if (true) break;
}
case 2: {
this.state = 38;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=42270724;
 //BA.debugLineNum = 42270724;BA.debugLine="Dim ArticuloSel As String";
_articulosel = "";
RDebugUtils.currentLine=42270725;
 //BA.debugLineNum = 42270725;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=42270726;
 //BA.debugLineNum = 42270726;BA.debugLine="Dim lstInfoFila As List=jamTableView1.DatosRegi";
_lstinfofila = new anywheresoftware.b4a.objects.collections.List();
_lstinfofila = __ref._jamtableview1 /*b4j.docU.jamtableview*/ ._datosregistroindicefila /*anywheresoftware.b4a.objects.collections.List*/ (null,_filaseleccionada);
RDebugUtils.currentLine=42270727;
 //BA.debugLineNum = 42270727;BA.debugLine="For Each dc As DatosCampoRegistroJamTableView I";
if (true) break;

case 4:
//for
this.state = 11;
group6 = _lstinfofila;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 62;
if (true) break;

case 62:
//C
this.state = 11;
if (index6 < groupLen6) {
this.state = 6;
_dc = (b4j.docU.jamtableview._datoscamporegistrojamtableview)(group6.Get(index6));}
if (true) break;

case 63:
//C
this.state = 62;
index6++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=42270728;
 //BA.debugLineNum = 42270728;BA.debugLine="If dc.Campo=\"Articulo\" Then";
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
RDebugUtils.currentLine=42270729;
 //BA.debugLineNum = 42270729;BA.debugLine="ArticuloSel=dc.ValorCampo";
_articulosel = BA.ObjectToString(_dc.ValorCampo /*Object*/ );
RDebugUtils.currentLine=42270730;
 //BA.debugLineNum = 42270730;BA.debugLine="Exit";
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 63;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=42270733;
 //BA.debugLineNum = 42270733;BA.debugLine="If ArticuloSel=\"\" Then";

case 11:
//if
this.state = 14;
if ((_articulosel).equals("")) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=42270734;
 //BA.debugLineNum = 42270734;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No se ha en";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No se ha encontrado el campo Artículo.","Error");
RDebugUtils.currentLine=42270735;
 //BA.debugLineNum = 42270735;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 64;
return;
case 64:
//C
this.state = 14;
;
RDebugUtils.currentLine=42270736;
 //BA.debugLineNum = 42270736;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=42270738;
 //BA.debugLineNum = 42270738;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"¿Mos";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma","¿Mostrar en Navision la ficha del artículo "+_articulosel+"?","Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 65;
return;
case 65:
//C
this.state = 15;
_rint = (int) result[1];
;
RDebugUtils.currentLine=42270739;
 //BA.debugLineNum = 42270739;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 15:
//if
this.state = 20;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
if (true) return ;
if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=42270743;
 //BA.debugLineNum = 42270743;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Ficha producto",(int) (30),"No.",_articulosel);
RDebugUtils.currentLine=42270744;
 //BA.debugLineNum = 42270744;BA.debugLine="wait for(rSub) complete (success As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), _rsub);
this.state = 66;
return;
case 66:
//C
this.state = 21;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=42270745;
 //BA.debugLineNum = 42270745;BA.debugLine="If success=False Then";
if (true) break;

case 21:
//if
this.state = 24;
if (_success==parent.__c.False) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=42270746;
 //BA.debugLineNum = 42270746;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No ha sido";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No ha sido posible abrir el artículo seleccionado en Navision.","Error");
RDebugUtils.currentLine=42270747;
 //BA.debugLineNum = 42270747;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), _msa);
this.state = 67;
return;
case 67:
//C
this.state = 24;
;
 if (true) break;

case 24:
//C
this.state = 61;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=42270751;
 //BA.debugLineNum = 42270751;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=42270752;
 //BA.debugLineNum = 42270752;BA.debugLine="Dim AlmacenSel As String=jamTableView1.GetValor";
_almacensel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Almacen"));
RDebugUtils.currentLine=42270753;
 //BA.debugLineNum = 42270753;BA.debugLine="Dim NombreAlmacenSel As String=jamTableView1.Ge";
_nombrealmacensel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"NombreAlmacen"));
RDebugUtils.currentLine=42270754;
 //BA.debugLineNum = 42270754;BA.debugLine="Dim ArticuloSel As String=jamTableView1.GetValo";
_articulosel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Articulo"));
RDebugUtils.currentLine=42270755;
 //BA.debugLineNum = 42270755;BA.debugLine="Dim DescripcionArticuloSel As String=jamTableVi";
_descripcionarticulosel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"DescripcionArticulo"));
RDebugUtils.currentLine=42270756;
 //BA.debugLineNum = 42270756;BA.debugLine="Dim TallaSel As String=jamTableView1.GetValorSQ";
_tallasel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Talla"));
RDebugUtils.currentLine=42270757;
 //BA.debugLineNum = 42270757;BA.debugLine="Dim cEstCom As cAnalisisDisponibleFichaEstadoCo";
_cestcom = new b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla();
RDebugUtils.currentLine=42270758;
 //BA.debugLineNum = 42270758;BA.debugLine="cEstCom.Initialize(Me, frm.RootPane,AlmacenSel,";
_cestcom._initialize /*String*/ (null,ba,parent,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())),_almacensel,_nombrealmacensel,_articulosel,_descripcionarticulosel,_tallasel);
RDebugUtils.currentLine=42270759;
 //BA.debugLineNum = 42270759;BA.debugLine="cEstCom.Show";
_cestcom._show /*void*/ (null);
RDebugUtils.currentLine=42270760;
 //BA.debugLineNum = 42270760;BA.debugLine="wait for cAnalisisDisponibleFichaEstadoComentar";
parent.__c.WaitFor("canalisisdisponiblefichaestadocomentarioalmacenarticulotalla_done", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), null);
this.state = 68;
return;
case 68:
//C
this.state = 27;
_datosanalisisdisponiblefichaalmacenarticulotalla = (b4j.docU.canalisisdisponiblefichaestadocomentarioalmacenarticulotalla._tipodatosanalisisdisponiblefichaalmacenarticulotalla) result[1];
;
RDebugUtils.currentLine=42270761;
 //BA.debugLineNum = 42270761;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticuloT";
if (true) break;

case 27:
//if
this.state = 36;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.DatosModificados /*boolean*/ ) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=42270762;
 //BA.debugLineNum = 42270762;BA.debugLine="Dim intCom As Int";
_intcom = 0;
RDebugUtils.currentLine=42270763;
 //BA.debugLineNum = 42270763;BA.debugLine="If DatosAnalisisDisponibleFichaAlmacenArticulo";
if (true) break;

case 30:
//if
this.state = 35;
if (_datosanalisisdisponiblefichaalmacenarticulotalla.ConComentario /*boolean*/ ) { 
this.state = 32;
}else {
this.state = 34;
}if (true) break;

case 32:
//C
this.state = 35;
RDebugUtils.currentLine=42270764;
 //BA.debugLineNum = 42270764;BA.debugLine="intCom=1";
_intcom = (int) (1);
 if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=42270766;
 //BA.debugLineNum = 42270766;BA.debugLine="intCom=0";
_intcom = (int) (0);
 if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=42270768;
 //BA.debugLineNum = 42270768;BA.debugLine="jamTableView1.SQL.ExecNonQuery2(\"update tblOri";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Estado /*String*/ ),(Object)(_intcom),(Object)(_almacensel),(Object)(_articulosel),(Object)(_tallasel)}));
RDebugUtils.currentLine=42270770;
 //BA.debugLineNum = 42270770;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponib";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Estado /*String*/ ),(Object)(_intcom),(Object)(_almacensel),(Object)(_articulosel),(Object)(_tallasel)}));
RDebugUtils.currentLine=42270772;
 //BA.debugLineNum = 42270772;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponib";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Estado /*String*/ ),(Object)(_datosanalisisdisponiblefichaalmacenarticulotalla.Comentario /*String*/ ),(Object)(_almacensel),(Object)(_articulosel),(Object)(_tallasel)}));
RDebugUtils.currentLine=42270774;
 //BA.debugLineNum = 42270774;BA.debugLine="jamTableView1.RefrescarFilaTVMetodoSQL(FilaSel";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,_filaseleccionada);
 if (true) break;

case 36:
//C
this.state = 61;
;
 if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=42270778;
 //BA.debugLineNum = 42270778;BA.debugLine="Dim FilaSeleccionada As Int=jamTableView1.Indic";
_filaseleccionada = (int)(BA.ObjectToNumber(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._indicesfilasseleccionadas /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0))));
RDebugUtils.currentLine=42270779;
 //BA.debugLineNum = 42270779;BA.debugLine="If jamTableView1.IndiceUltimaFilaVisible=FilaSe";
if (true) break;

case 39:
//if
this.state = 42;
if (__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getindiceultimafilavisible /*int*/ (null)==_filaseleccionada) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=42270780;
 //BA.debugLineNum = 42270780;BA.debugLine="wait for(Utilidades.MsgBoxXUI(\"Aviso\",\"La fila";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), parent._utilidades._msgboxxui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Aviso","La fila a copiar no puede ser la última fila visible"));
this.state = 69;
return;
case 69:
//C
this.state = 42;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=42270781;
 //BA.debugLineNum = 42270781;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 42:
//C
this.state = 43;
;
RDebugUtils.currentLine=42270783;
 //BA.debugLineNum = 42270783;BA.debugLine="wait for(Utilidades.MsgBox2XUI(\"Confirma\",\"Copi";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), parent._utilidades._msgbox2xui /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Confirma","Copiar el Estado-Comentario correspondiente a la fila seleccionada, a la fila siguiente?","Sí","Cancelar","",(anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(parent.__c.Null))));
this.state = 70;
return;
case 70:
//C
this.state = 43;
_rint = (int) result[1];
;
RDebugUtils.currentLine=42270784;
 //BA.debugLineNum = 42270784;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Retur";
if (true) break;

case 43:
//if
this.state = 48;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 45;
;}if (true) break;

case 45:
//C
this.state = 48;
if (true) return ;
if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=42270786;
 //BA.debugLineNum = 42270786;BA.debugLine="Dim AlmacenSel As String=jamTableView1.GetValor";
_almacensel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Almacen"));
RDebugUtils.currentLine=42270788;
 //BA.debugLineNum = 42270788;BA.debugLine="Dim ArticuloSel As String=jamTableView1.GetValo";
_articulosel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Articulo"));
RDebugUtils.currentLine=42270790;
 //BA.debugLineNum = 42270790;BA.debugLine="Dim TallaSel As String=jamTableView1.GetValorSQ";
_tallasel = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Talla"));
RDebugUtils.currentLine=42270792;
 //BA.debugLineNum = 42270792;BA.debugLine="Dim FilaDestino As Int=FilaSeleccionada+1";
_filadestino = (int) (_filaseleccionada+1);
RDebugUtils.currentLine=42270793;
 //BA.debugLineNum = 42270793;BA.debugLine="Dim AlmacenDestino As String=jamTableView1.GetV";
_almacendestino = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filadestino,"Almacen"));
RDebugUtils.currentLine=42270795;
 //BA.debugLineNum = 42270795;BA.debugLine="Dim ArticuloDestino As String=jamTableView1.Get";
_articulodestino = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filadestino,"Articulo"));
RDebugUtils.currentLine=42270797;
 //BA.debugLineNum = 42270797;BA.debugLine="Dim TallaDestino As String=jamTableView1.GetVal";
_talladestino = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filadestino,"Talla"));
RDebugUtils.currentLine=42270799;
 //BA.debugLineNum = 42270799;BA.debugLine="Dim EstadoCopiado As String=jamTableView1.GetVa";
_estadocopiado = BA.ObjectToString(__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getvalorsqlcampofila /*Object*/ (null,_filaseleccionada,"Estado"));
RDebugUtils.currentLine=42270800;
 //BA.debugLineNum = 42270800;BA.debugLine="Dim ComentarioCopiado As String=Utilidades.FixN";
_comentariocopiado = parent._utilidades._fixnull /*String*/ ((Object)(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select Comentario from tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_almacensel,_articulosel,_tallasel}))));
RDebugUtils.currentLine=42270802;
 //BA.debugLineNum = 42270802;BA.debugLine="Wait For(CopiarEstadoComentarioAnalisisDispAlmA";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "canalisisdisponiblesalmacenarticulotalla", "jamtableview1_contextmenuitem_action"), __ref._copiarestadocomentarioanalisisdispalmarttalla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_almacendestino,_articulodestino,_talladestino,_estadocopiado,_comentariocopiado));
this.state = 71;
return;
case 71:
//C
this.state = 49;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=42270803;
 //BA.debugLineNum = 42270803;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=42270804;
 //BA.debugLineNum = 42270804;BA.debugLine="If Accion=\"NOK\" Then Return";
if (true) break;

case 49:
//if
this.state = 54;
if ((_accion).equals("NOK")) { 
this.state = 51;
;}if (true) break;

case 51:
//C
this.state = 54;
if (true) return ;
if (true) break;

case 54:
//C
this.state = 55;
;
RDebugUtils.currentLine=42270806;
 //BA.debugLineNum = 42270806;BA.debugLine="Dim intCom As Int";
_intcom = 0;
RDebugUtils.currentLine=42270807;
 //BA.debugLineNum = 42270807;BA.debugLine="If ComentarioCopiado<>\"\" Then";
if (true) break;

case 55:
//if
this.state = 60;
if ((_comentariocopiado).equals("") == false) { 
this.state = 57;
}else {
this.state = 59;
}if (true) break;

case 57:
//C
this.state = 60;
RDebugUtils.currentLine=42270808;
 //BA.debugLineNum = 42270808;BA.debugLine="intCom=1";
_intcom = (int) (1);
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=42270810;
 //BA.debugLineNum = 42270810;BA.debugLine="intCom=0";
_intcom = (int) (0);
 if (true) break;

case 60:
//C
this.state = 61;
;
RDebugUtils.currentLine=42270812;
 //BA.debugLineNum = 42270812;BA.debugLine="jamTableView1.SQL.ExecNonQuery2(\"update tblOrig";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._getsql /*anywheresoftware.b4j.objects.SQL*/ (null).ExecNonQuery2("update tblOrigenDatos set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadocopiado),(Object)(_intcom),(Object)(_almacendestino),(Object)(_articulodestino),(Object)(_talladestino)}));
RDebugUtils.currentLine=42270814;
 //BA.debugLineNum = 42270814;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponibl";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisDisponiblesAlmacenArticuloTalla set Estado=?, Comentarios=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadocopiado),(Object)(_intcom),(Object)(_almacendestino),(Object)(_articulodestino),(Object)(_talladestino)}));
RDebugUtils.currentLine=42270816;
 //BA.debugLineNum = 42270816;BA.debugLine="mSQL.ExecNonQuery2(\"update tblAnalisisDisponibl";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("update tblAnalisisDisponiblesEstadoComentariosAlmacenArticuloTalla set Estado=?, Comentario=? where Almacen=? and Articulo=? and Talla=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estadocopiado),(Object)(_comentariocopiado),(Object)(_almacendestino),(Object)(_articulodestino),(Object)(_talladestino)}));
RDebugUtils.currentLine=42270818;
 //BA.debugLineNum = 42270818;BA.debugLine="jamTableView1.RefrescarFilaTVMetodoSQL(FilaDest";
__ref._jamtableview1 /*b4j.docU.jamtableview*/ ._refrescarfilatvmetodosql /*String*/ (null,_filadestino);
 if (true) break;

case 61:
//C
this.state = -1;
;
RDebugUtils.currentLine=42270822;
 //BA.debugLineNum = 42270822;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableview1_menubarmenuitem_action(b4j.docU.canalisisdisponiblesalmacenarticulotalla __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="canalisisdisponiblesalmacenarticulotalla";
if (Debug.shouldDelegate(ba, "jamtableview1_menubarmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableview1_menubarmenuitem_action", new Object[] {_tagmenuitem}));}
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Sub jamTableView1_MenuBarMenuItem_Action(TagMenuIt";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="Select Case TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"Actualizar")) {
case 0: {
RDebugUtils.currentLine=42205188;
 //BA.debugLineNum = 42205188;BA.debugLine="ActualizarDatos";
__ref._actualizardatos /*void*/ (null);
 break; }
}
;
RDebugUtils.currentLine=42205193;
 //BA.debugLineNum = 42205193;BA.debugLine="End Sub";
return "";
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