package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cexpedicionesnoentregadasdhl extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cexpedicionesnoentregadasdhl", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cexpedicionesnoentregadasdhl.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.SFtpWrapper _sftpdhl = null;
public String _nombreultimofichero = "";
public anywheresoftware.b4j.objects.ButtonWrapper _btnsalir = null;
public b4j.docU.jamtableview _jamtableviewexpedicionesnoentregadas = null;
public b4j.docU.b4xdialog _dialog = null;
public anywheresoftware.b4j.objects.SQL _msql = null;
public String _usuariows = "";
public String _passwordws = "";
public String _accesstoken = "";
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
public String  _initialize(b4j.docU.cexpedicionesnoentregadasdhl __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=62193664;
 //BA.debugLineNum = 62193664;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=62193666;
 //BA.debugLineNum = 62193666;BA.debugLine="End Sub";
return "";
}
public void  _show(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "show", false))
	 {Debug.delegate(ba, "show", null); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imgnav = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imgdhl = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
b4j.docU.jamtableview._datoscellfactoryjamtableview _cf = null;
String _sresp = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62259202;
 //BA.debugLineNum = 62259202;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yScreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",parent._main._xscreen /*int*/ ,parent._main._yscreen /*int*/ );
RDebugUtils.currentLine=62259203;
 //BA.debugLineNum = 62259203;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(parent._main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=62259205;
 //BA.debugLineNum = 62259205;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=62259206;
 //BA.debugLineNum = 62259206;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"sta";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=62259207;
 //BA.debugLineNum = 62259207;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=62259208;
 //BA.debugLineNum = 62259208;BA.debugLine="frm.RootPane.LoadLayout(\"scrExpedicionesDHLNoEnt";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"scrExpedicionesDHLNoEntregadas");
RDebugUtils.currentLine=62259209;
 //BA.debugLineNum = 62259209;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "show"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 1;
;
RDebugUtils.currentLine=62259210;
 //BA.debugLineNum = 62259210;BA.debugLine="frm.Title=\"Expediciones DHL\"";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setTitle("Expediciones DHL");
RDebugUtils.currentLine=62259212;
 //BA.debugLineNum = 62259212;BA.debugLine="If Not(File.Exists(xui.DefaultFolder,\"hosts.txt\"";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.Not(parent.__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"hosts.txt"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=62259213;
 //BA.debugLineNum = 62259213;BA.debugLine="File.WriteString(xui.DefaultFolder,\"hosts.txt\",";
parent.__c.File.WriteString(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"hosts.txt","");
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=62259218;
 //BA.debugLineNum = 62259218;BA.debugLine="jamTableViewExpedicionesNoEntregadas.EstadoMenuI";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._menubaracciones /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=62259219;
 //BA.debugLineNum = 62259219;BA.debugLine="jamTableViewExpedicionesNoEntregadas.EstadoMenuI";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._estadomenuitem /*String*/ (null,__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._menubarlinea /*String*/ ,parent.__c.False);
RDebugUtils.currentLine=62259221;
 //BA.debugLineNum = 62259221;BA.debugLine="jamTableViewExpedicionesNoEntregadas.AddContextM";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._addcontextmenuitemseparator /*String*/ (null);
RDebugUtils.currentLine=62259222;
 //BA.debugLineNum = 62259222;BA.debugLine="Dim imgNAV As Image";
_imgnav = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=62259223;
 //BA.debugLineNum = 62259223;BA.debugLine="imgNAV.InitializeSample(File.DirAssets,\"navision";
_imgnav.InitializeSample(parent.__c.File.getDirAssets(),"navision.png",24,24);
RDebugUtils.currentLine=62259224;
 //BA.debugLineNum = 62259224;BA.debugLine="jamTableViewExpedicionesNoEntregadas.AddContextM";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Documentos NAV de la expedición","Documentos NAV de la expedicion",_imgnav);
RDebugUtils.currentLine=62259225;
 //BA.debugLineNum = 62259225;BA.debugLine="Dim imgDHL As Image";
_imgdhl = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=62259226;
 //BA.debugLineNum = 62259226;BA.debugLine="imgDHL.InitializeSample(File.DirAssets,\"DHLsq.pn";
_imgdhl.InitializeSample(parent.__c.File.getDirAssets(),"DHLsq.png",24,24);
RDebugUtils.currentLine=62259227;
 //BA.debugLineNum = 62259227;BA.debugLine="jamTableViewExpedicionesNoEntregadas.AddContextM";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._addcontextmenuitemimage /*String*/ (null,"Trazabilidad Expedición Web DHL","TrazabilidadExpedicionWebDHL",_imgdhl);
RDebugUtils.currentLine=62259229;
 //BA.debugLineNum = 62259229;BA.debugLine="Dim rSub As ResumableSub=jamTableViewExpedicione";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._configurartableview /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,"ExpedicionesNoEntregadasDHL.json",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=62259230;
 //BA.debugLineNum = 62259230;BA.debugLine="wait for (rSub) complete (mRes As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "show"), _rsub);
this.state = 14;
return;
case 14:
//C
this.state = 5;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=62259231;
 //BA.debugLineNum = 62259231;BA.debugLine="Log(mRes)";
parent.__c.LogImpl("862259231",BA.ObjectToString(_mres),0);
RDebugUtils.currentLine=62259232;
 //BA.debugLineNum = 62259232;BA.debugLine="If Not(mRes.Get(\"FlagOK\")) Then";
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
RDebugUtils.currentLine=62259233;
 //BA.debugLineNum = 62259233;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mRes.Get(\"msg";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mres.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=62259234;
 //BA.debugLineNum = 62259234;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "show"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 8;
;
RDebugUtils.currentLine=62259235;
 //BA.debugLineNum = 62259235;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=62259236;
 //BA.debugLineNum = 62259236;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=62259239;
 //BA.debugLineNum = 62259239;BA.debugLine="Dim CF As DatosCellFactoryJamTableView";
_cf = new b4j.docU.jamtableview._datoscellfactoryjamtableview();
RDebugUtils.currentLine=62259240;
 //BA.debugLineNum = 62259240;BA.debugLine="CF.Initialize";
_cf.Initialize();
RDebugUtils.currentLine=62259241;
 //BA.debugLineNum = 62259241;BA.debugLine="CF.AliasCampoColumna=\"Fecha\"";
_cf.AliasCampoColumna /*String*/  = "Fecha";
RDebugUtils.currentLine=62259242;
 //BA.debugLineNum = 62259242;BA.debugLine="CF.NombreFuncionCellFactory=jamTableViewExpedici";
_cf.NombreFuncionCellFactory /*String*/  = __ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._cellfactory_columnafecha /*String*/ ;
RDebugUtils.currentLine=62259243;
 //BA.debugLineNum = 62259243;BA.debugLine="CF.CellFactoryEnCallBack=False";
_cf.CellFactoryEnCallBack /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=62259244;
 //BA.debugLineNum = 62259244;BA.debugLine="CF.params=Null";
_cf.params /*Object[]*/  = (Object[])(parent.__c.Null);
RDebugUtils.currentLine=62259245;
 //BA.debugLineNum = 62259245;BA.debugLine="jamTableViewExpedicionesNoEntregadas.SetCellFact";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._setcellfactory /*String*/ (null,_cf);
RDebugUtils.currentLine=62259247;
 //BA.debugLineNum = 62259247;BA.debugLine="Dialog.Initialize(frm.RootPane)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject())));
RDebugUtils.currentLine=62259251;
 //BA.debugLineNum = 62259251;BA.debugLine="mSQL.InitializeSQLite(xui.DefaultFolder,Main.Nomb";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .InitializeSQLite(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),parent._main._nombreaplicacion /*String*/ +".db",parent.__c.True);
RDebugUtils.currentLine=62259253;
 //BA.debugLineNum = 62259253;BA.debugLine="CreacionTablasSQLite";
__ref._creaciontablassqlite /*String*/ (null);
RDebugUtils.currentLine=62259256;
 //BA.debugLineNum = 62259256;BA.debugLine="sFtpDHL.Initialize(\"sftpDHL\", \"tak3uada\", \"xfG2&r";
__ref._sftpdhl /*anywheresoftware.b4a.objects.SFtpWrapper*/ .Initialize(ba,"sftpDHL","tak3uada","xfG2&rNpe!fD8QYP","sftp3.dhl.com",(int) (4222));
RDebugUtils.currentLine=62259258;
 //BA.debugLineNum = 62259258;BA.debugLine="sFtpDHL.SetKnownHostsStore(xui.DefaultFolder, \"ho";
__ref._sftpdhl /*anywheresoftware.b4a.objects.SFtpWrapper*/ .SetKnownHostsStore(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),"hosts.txt");
RDebugUtils.currentLine=62259260;
 //BA.debugLineNum = 62259260;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=62259262;
 //BA.debugLineNum = 62259262;BA.debugLine="Dim joForm As JavaObject=asJO(frm)";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ )));
RDebugUtils.currentLine=62259263;
 //BA.debugLineNum = 62259263;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=62259264;
 //BA.debugLineNum = 62259264;BA.debugLine="joStage.RunMethod(\"setMaximized\",Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(parent.__c.True)});
RDebugUtils.currentLine=62259268;
 //BA.debugLineNum = 62259268;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=62259270;
 //BA.debugLineNum = 62259270;BA.debugLine="Wait For(CargaCredenciales) complete (sResp As St";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "show"), __ref._cargacredenciales /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null));
this.state = 16;
return;
case 16:
//C
this.state = 9;
_sresp = (String) result[1];
;
RDebugUtils.currentLine=62259271;
 //BA.debugLineNum = 62259271;BA.debugLine="If sResp<>\"OK\" Then";
if (true) break;

case 9:
//if
this.state = 12;
if ((_sresp).equals("OK") == false) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=62259273;
 //BA.debugLineNum = 62259273;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error carga c";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error carga credenciales DHL"+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=62259274;
 //BA.debugLineNum = 62259274;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "show"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
RDebugUtils.currentLine=62259275;
 //BA.debugLineNum = 62259275;BA.debugLine="btnSalir_Click";
__ref._btnsalir_click /*String*/ (null);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=62259281;
 //BA.debugLineNum = 62259281;BA.debugLine="sFtpDHL.List(\"out/work\")";
__ref._sftpdhl /*anywheresoftware.b4a.objects.SFtpWrapper*/ .List(ba,"out/work");
RDebugUtils.currentLine=62259285;
 //BA.debugLineNum = 62259285;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizardatostabla(b4j.docU.cexpedicionesnoentregadasdhl __ref,anywheresoftware.b4a.objects.collections.List _lstdatos) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "actualizardatostabla", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizardatostabla", new Object[] {_lstdatos}));}
ResumableSub_ActualizarDatosTabla rsub = new ResumableSub_ActualizarDatosTabla(this,__ref,_lstdatos);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarDatosTabla extends BA.ResumableSub {
public ResumableSub_ActualizarDatosTabla(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,anywheresoftware.b4a.objects.collections.List _lstdatos) {
this.parent = parent;
this.__ref = __ref;
this._lstdatos = _lstdatos;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
anywheresoftware.b4a.objects.collections.List _lstdatos;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.collections.Map _mresultsetdata = null;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="Dim rs As ResultSet=mSQL.ExecQuery(\"select * from";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = __ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("select * from tblExpedicionesIncidenciasDHL");
RDebugUtils.currentLine=63176708;
 //BA.debugLineNum = 63176708;BA.debugLine="Dim rSub As ResumableSub=jamTableViewExpediciones";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_rs.getObject()));
RDebugUtils.currentLine=63176709;
 //BA.debugLineNum = 63176709;BA.debugLine="Wait For (rSub) complete (mResultSetData As Map)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "actualizardatostabla"), _rsub);
this.state = 12;
return;
case 12:
//C
this.state = 1;
_mresultsetdata = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63176710;
 //BA.debugLineNum = 63176710;BA.debugLine="lstDatos.Initialize";
_lstdatos.Initialize();
RDebugUtils.currentLine=63176711;
 //BA.debugLineNum = 63176711;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=63176712;
 //BA.debugLineNum = 63176712;BA.debugLine="If Not(mResultSetData.Get(\"FlagOK\")) Then";
if (true) break;

case 1:
//if
this.state = 11;
if (parent.__c.Not(BA.ObjectToBoolean(_mresultsetdata.Get((Object)("FlagOK"))))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=63176713;
 //BA.debugLineNum = 63176713;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgAviso\") Then";
if (true) break;

case 4:
//if
this.state = 7;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso")))) == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=63176714;
 //BA.debugLineNum = 63176714;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgAviso"))),"Aviso");
RDebugUtils.currentLine=63176715;
 //BA.debugLineNum = 63176715;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "actualizardatostabla"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 7;
;
 if (true) break;
;
RDebugUtils.currentLine=63176717;
 //BA.debugLineNum = 63176717;BA.debugLine="If \"\"<>mResultSetData.Get(\"msgError\") Then";

case 7:
//if
this.state = 10;
if (("").equals(BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))) == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=63176718;
 //BA.debugLineNum = 63176718;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(mResultSetDat";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToString(_mresultsetdata.Get((Object)("msgError")))+parent.__c.CRLF+parent.__c.CRLF+"Avisa al administrador de la aplicación.","Error");
RDebugUtils.currentLine=63176719;
 //BA.debugLineNum = 63176719;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "actualizardatostabla"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 10;
;
RDebugUtils.currentLine=63176720;
 //BA.debugLineNum = 63176720;BA.debugLine="ExitApplication";
parent.__c.ExitApplication();
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = -1;
;
RDebugUtils.currentLine=63176723;
 //BA.debugLineNum = 63176723;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=63176724;
 //BA.debugLineNum = 63176724;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _actualizarinfoexpediciondhl(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _iddatobuscado) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "actualizarinfoexpediciondhl", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "actualizarinfoexpediciondhl", new Object[] {_iddatobuscado}));}
ResumableSub_ActualizarInfoExpedicionDHL rsub = new ResumableSub_ActualizarInfoExpedicionDHL(this,__ref,_iddatobuscado);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ActualizarInfoExpedicionDHL extends BA.ResumableSub {
public ResumableSub_ActualizarInfoExpedicionDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,String _iddatobuscado) {
this.parent = parent;
this.__ref = __ref;
this._iddatobuscado = _iddatobuscado;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
String _iddatobuscado;
String _acciontracking = "";
anywheresoftware.b4a.objects.collections.List _lstresultadotracking = null;
String _sresponse = "";
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.Map _mrestrack = null;
anywheresoftware.b4j.objects.collections.JSONParser _jp = null;
String _dateformatant = "";
String _timeformatant = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sfechahora = "";
String[] _fh = null;
long _lfechahora = 0L;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63569921;
 //BA.debugLineNum = 63569921;BA.debugLine="Dim AccionTracking As String";
_acciontracking = "";
RDebugUtils.currentLine=63569922;
 //BA.debugLineNum = 63569922;BA.debugLine="Dim lstResultadoTracking As List";
_lstresultadotracking = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=63569923;
 //BA.debugLineNum = 63569923;BA.debugLine="lstResultadoTracking.Initialize";
_lstresultadotracking.Initialize();
RDebugUtils.currentLine=63569946;
 //BA.debugLineNum = 63569946;BA.debugLine="Wait For (EnvioDatosWebServiceDHL(IDDatoBuscado,a";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "actualizarinfoexpediciondhl"), __ref._enviodatoswebservicedhl /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_iddatobuscado,__ref._accesstoken /*String*/ ));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_sresponse = (String) result[1];
;
RDebugUtils.currentLine=63569948;
 //BA.debugLineNum = 63569948;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 1:
//if
this.state = 10;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 10;
RDebugUtils.currentLine=63569949;
 //BA.debugLineNum = 63569949;BA.debugLine="AccionTracking=\"ErrorWS\"";
_acciontracking = "ErrorWS";
RDebugUtils.currentLine=63569950;
 //BA.debugLineNum = 63569950;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Ha fallado la llamada al web service de DHL."+parent.__c.CRLF+parent.__c.CRLF+_sresponse,"Error de comunicación");
RDebugUtils.currentLine=63569951;
 //BA.debugLineNum = 63569951;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 12;
return;
case 12:
//C
this.state = 10;
_result = (int) result[1];
;
RDebugUtils.currentLine=63569952;
 //BA.debugLineNum = 63569952;BA.debugLine="Dim mResTrack As Map";
_mrestrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63569953;
 //BA.debugLineNum = 63569953;BA.debugLine="mResTrack.Initialize";
_mrestrack.Initialize();
RDebugUtils.currentLine=63569954;
 //BA.debugLineNum = 63569954;BA.debugLine="mResTrack.Put(\"AccionTracking\",AccionTracking)";
_mrestrack.Put((Object)("AccionTracking"),(Object)(_acciontracking));
RDebugUtils.currentLine=63569955;
 //BA.debugLineNum = 63569955;BA.debugLine="Return mResTrack";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mrestrack));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=63569958;
 //BA.debugLineNum = 63569958;BA.debugLine="Log(sResponse)";
parent.__c.LogImpl("863569958",_sresponse,0);
RDebugUtils.currentLine=63569959;
 //BA.debugLineNum = 63569959;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=63569960;
 //BA.debugLineNum = 63569960;BA.debugLine="jp.Initialize(sResponse)";
_jp.Initialize(_sresponse);
RDebugUtils.currentLine=63569961;
 //BA.debugLineNum = 63569961;BA.debugLine="lstResultadoTracking=jp.NextArray";
_lstresultadotracking = _jp.NextArray();
RDebugUtils.currentLine=63569968;
 //BA.debugLineNum = 63569968;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=63569969;
 //BA.debugLineNum = 63569969;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
_timeformatant = parent.__c.DateTime.getTimeFormat();
RDebugUtils.currentLine=63569973;
 //BA.debugLineNum = 63569973;BA.debugLine="For Each m As Map In lstResultadoTracking";
if (true) break;

case 6:
//for
this.state = 9;
_m = new anywheresoftware.b4a.objects.collections.Map();
group20 = _lstresultadotracking;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 9;
if (index20 < groupLen20) {
this.state = 8;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 14:
//C
this.state = 13;
index20++;
if (true) break;

case 8:
//C
this.state = 14;
RDebugUtils.currentLine=63569974;
 //BA.debugLineNum = 63569974;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd'T'HH:mm:ss\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd'T'HH:mm:ss");
RDebugUtils.currentLine=63569975;
 //BA.debugLineNum = 63569975;BA.debugLine="Log(\"m recibido\" & m)";
parent.__c.LogImpl("863569975","m recibido"+BA.ObjectToString(_m),0);
RDebugUtils.currentLine=63569976;
 //BA.debugLineNum = 63569976;BA.debugLine="Dim sFechaHora As String=m.Get(\"DateTime\")";
_sfechahora = BA.ObjectToString(_m.Get((Object)("DateTime")));
RDebugUtils.currentLine=63569977;
 //BA.debugLineNum = 63569977;BA.debugLine="sFechaHora=sFechaHora.Replace(\"T\",\" \")";
_sfechahora = _sfechahora.replace("T"," ");
RDebugUtils.currentLine=63569978;
 //BA.debugLineNum = 63569978;BA.debugLine="Dim Fh() As String=Regex.Split(\" \",sFechaHora)";
_fh = parent.__c.Regex.Split(" ",_sfechahora);
RDebugUtils.currentLine=63569979;
 //BA.debugLineNum = 63569979;BA.debugLine="Dim lFechaHora As Long=DateTime.DateParse(m.Get";
_lfechahora = parent.__c.DateTime.DateParse(BA.ObjectToString(_m.Get((Object)("DateTime"))));
RDebugUtils.currentLine=63569980;
 //BA.debugLineNum = 63569980;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=63569981;
 //BA.debugLineNum = 63569981;BA.debugLine="sFechaHora=DateTime.Date(lFechaHora) & \" \" & Fh";
_sfechahora = parent.__c.DateTime.Date(_lfechahora)+" "+_fh[(int) (1)];
RDebugUtils.currentLine=63569982;
 //BA.debugLineNum = 63569982;BA.debugLine="Log(\"m modificado \" & m)";
parent.__c.LogImpl("863569982","m modificado "+BA.ObjectToString(_m),0);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=63569984;
 //BA.debugLineNum = 63569984;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=63569985;
 //BA.debugLineNum = 63569985;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
parent.__c.DateTime.setTimeFormat(_timeformatant);
RDebugUtils.currentLine=63569987;
 //BA.debugLineNum = 63569987;BA.debugLine="Dim mResTrack As Map";
_mrestrack = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63569988;
 //BA.debugLineNum = 63569988;BA.debugLine="mResTrack.Initialize";
_mrestrack.Initialize();
RDebugUtils.currentLine=63569989;
 //BA.debugLineNum = 63569989;BA.debugLine="mResTrack.Put(\"AccionTracking\",AccionTracking)";
_mrestrack.Put((Object)("AccionTracking"),(Object)(_acciontracking));
RDebugUtils.currentLine=63569990;
 //BA.debugLineNum = 63569990;BA.debugLine="mResTrack.Put(\"lstResultadoTracking\",lstResultad";
_mrestrack.Put((Object)("lstResultadoTracking"),(Object)(_lstresultadotracking.getObject()));
RDebugUtils.currentLine=63569991;
 //BA.debugLineNum = 63569991;BA.debugLine="Return mResTrack";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mrestrack));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=63569994;
 //BA.debugLineNum = 63569994;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebservicedhl(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _iddatoenviobuscado,String _token) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "enviodatoswebservicedhl", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebservicedhl", new Object[] {_iddatoenviobuscado,_token}));}
ResumableSub_EnvioDatosWebServiceDHL rsub = new ResumableSub_EnvioDatosWebServiceDHL(this,__ref,_iddatoenviobuscado,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceDHL extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,String _iddatoenviobuscado,String _token) {
this.parent = parent;
this.__ref = __ref;
this._iddatoenviobuscado = _iddatoenviobuscado;
this._token = _token;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
String _iddatoenviobuscado;
String _token;
b4j.docU.httpjob _job = null;
String _urldhltracktrace = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63635458;
 //BA.debugLineNum = 63635458;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=63635459;
 //BA.debugLineNum = 63635459;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=63635462;
 //BA.debugLineNum = 63635462;BA.debugLine="Dim URLDhlTrackTrace As String=\"https://external.";
_urldhltracktrace = "https://external.dhl.es/cimapi/api/v1/customer/track?id="+_iddatoenviobuscado+"&idioma=es";
RDebugUtils.currentLine=63635463;
 //BA.debugLineNum = 63635463;BA.debugLine="job.Download(URLDhlTrackTrace)";
_job._download /*String*/ (null,_urldhltracktrace);
RDebugUtils.currentLine=63635465;
 //BA.debugLineNum = 63635465;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=63635466;
 //BA.debugLineNum = 63635466;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=63635473;
 //BA.debugLineNum = 63635473;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=63635475;
 //BA.debugLineNum = 63635475;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "enviodatoswebservicedhl"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=63635477;
 //BA.debugLineNum = 63635477;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=63635478;
 //BA.debugLineNum = 63635478;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("863635478","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=63635480;
 //BA.debugLineNum = 63635480;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=63635481;
 //BA.debugLineNum = 63635481;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=63635482;
 //BA.debugLineNum = 63635482;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=63635485;
 //BA.debugLineNum = 63635485;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=63635486;
 //BA.debugLineNum = 63635486;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=63635487;
 //BA.debugLineNum = 63635487;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=63635489;
 //BA.debugLineNum = 63635489;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.cexpedicionesnoentregadasdhl __ref,anywheresoftware.b4j.object.JavaObject _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=62324736;
 //BA.debugLineNum = 62324736;BA.debugLine="private Sub asJO(o As JavaObject) As JavaObject";
RDebugUtils.currentLine=62324737;
 //BA.debugLineNum = 62324737;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=62324738;
 //BA.debugLineNum = 62324738;BA.debugLine="End Sub";
return null;
}
public String  _btnsalir_click(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "btnsalir_click", false))
	 {return ((String) Debug.delegate(ba, "btnsalir_click", null));}
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Sub btnSalir_Click";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="SalirModulo";
__ref._salirmodulo /*String*/ (null);
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="End Sub";
return "";
}
public String  _salirmodulo(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "salirmodulo", false))
	 {return ((String) Debug.delegate(ba, "salirmodulo", null));}
RDebugUtils.currentLine=62980096;
 //BA.debugLineNum = 62980096;BA.debugLine="Sub SalirModulo";
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=62980098;
 //BA.debugLineNum = 62980098;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=62980099;
 //BA.debugLineNum = 62980099;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargacredenciales(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "cargacredenciales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargacredenciales", null));}
ResumableSub_CargaCredenciales rsub = new ResumableSub_CargaCredenciales(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaCredenciales extends BA.ResumableSub {
public ResumableSub_CargaCredenciales(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstresws = null;
anywheresoftware.b4a.objects.collections.Map _mdatosws = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63438850;
 //BA.debugLineNum = 63438850;BA.debugLine="Wait For(CargaDatosWebServiceTransporte(1)) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "cargacredenciales"), __ref._cargadatoswebservicetransporte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (1)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63438851;
 //BA.debugLineNum = 63438851;BA.debugLine="Dim accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=63438852;
 //BA.debugLineNum = 63438852;BA.debugLine="If accion=\"NOK\" Then";
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
RDebugUtils.currentLine=63438853;
 //BA.debugLineNum = 63438853;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=63438855;
 //BA.debugLineNum = 63438855;BA.debugLine="Dim lstResWS As List=mRes.Get(\"lstRes\")";
_lstresws = new anywheresoftware.b4a.objects.collections.List();
_lstresws = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=63438856;
 //BA.debugLineNum = 63438856;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
_mdatosws = new anywheresoftware.b4a.objects.collections.Map();
_mdatosws = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstresws.Get((int) (0))));
RDebugUtils.currentLine=63438858;
 //BA.debugLineNum = 63438858;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
__ref._usuariows /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("UsuarioWS")));
RDebugUtils.currentLine=63438859;
 //BA.debugLineNum = 63438859;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
__ref._passwordws /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("PasswordWS")));
RDebugUtils.currentLine=63438860;
 //BA.debugLineNum = 63438860;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._usuariows /*String*/ ).equals("") || (__ref._passwordws /*String*/ ).equals("")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=63438861;
 //BA.debugLineNum = 63438861;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=63438863;
 //BA.debugLineNum = 63438863;BA.debugLine="Return \"OK\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("OK"));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=63438865;
 //BA.debugLineNum = 63438865;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatoswebservicetransporte(b4j.docU.cexpedicionesnoentregadasdhl __ref,int _idtransportista) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "cargadatoswebservicetransporte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatoswebservicetransporte", new Object[] {_idtransportista}));}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(this,__ref,_idtransportista);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,int _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
int _idtransportista;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63504386;
 //BA.debugLineNum = 63504386;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=63504387;
 //BA.debugLineNum = 63504387;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63504388;
 //BA.debugLineNum = 63504388;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=63504389;
 //BA.debugLineNum = 63504389;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=63504390;
 //BA.debugLineNum = 63504390;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
_comandojrdc = "DatosWebServiceTransporte";
RDebugUtils.currentLine=63504391;
 //BA.debugLineNum = 63504391;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
parent._jrdcquery._datosjrdc /*void*/ ("http://192.168.10.20:17179/rdc",_comandojrdc,(Object[])(new String[]{BA.NumberToString(_idtransportista)}),parent);
RDebugUtils.currentLine=63504392;
 //BA.debugLineNum = 63504392;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63504393;
 //BA.debugLineNum = 63504393;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=63504394;
 //BA.debugLineNum = 63504394;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=63504396;
 //BA.debugLineNum = 63504396;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=63504397;
 //BA.debugLineNum = 63504397;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=63504399;
 //BA.debugLineNum = 63504399;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=63504400;
 //BA.debugLineNum = 63504400;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=63504401;
 //BA.debugLineNum = 63504401;BA.debugLine="mRes.Put(\"lstRes\",lstRes)";
_mres.Put((Object)("lstRes"),(Object)(_lstres.getObject()));
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
RDebugUtils.currentLine=63504404;
 //BA.debugLineNum = 63504404;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=63504405;
 //BA.debugLineNum = 63504405;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=63504406;
 //BA.debugLineNum = 63504406;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargatokewebservicedhl(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "cargatokewebservicedhl", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargatokewebservicedhl", null));}
ResumableSub_CargaTokeWebServiceDHL rsub = new ResumableSub_CargaTokeWebServiceDHL(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaTokeWebServiceDHL extends BA.ResumableSub {
public ResumableSub_CargaTokeWebServiceDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
anywheresoftware.b4a.objects.StringUtils _su = null;
String _cookie = "";
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
anywheresoftware.b4a.objects.collections.List _lsttoken = null;
String[] _datoscsv = null;
long _expiration = 0L;
anywheresoftware.b4a.objects.collections.Map _mjobresponse = null;
String _sresponse = "";
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63700994;
 //BA.debugLineNum = 63700994;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=63700996;
 //BA.debugLineNum = 63700996;BA.debugLine="accessToken=\"\"";
__ref._accesstoken /*String*/  = "";
RDebugUtils.currentLine=63700997;
 //BA.debugLineNum = 63700997;BA.debugLine="Dim Cookie As String";
_cookie = "";
RDebugUtils.currentLine=63700998;
 //BA.debugLineNum = 63700998;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=63700999;
 //BA.debugLineNum = 63700999;BA.debugLine="lstHeaders.Initialize";
_lstheaders.Initialize();
RDebugUtils.currentLine=63701000;
 //BA.debugLineNum = 63701000;BA.debugLine="lstHeaders.Add(Array As String(\"Expiration\",\"Toke";
_lstheaders.Add((Object)(new String[]{"Expiration","Token","Cookie"}));
RDebugUtils.currentLine=63701001;
 //BA.debugLineNum = 63701001;BA.debugLine="If File.Exists(Main.UserTempFolder,\"info.csv\") Th";
if (true) break;

case 1:
//if
this.state = 10;
if (parent.__c.File.Exists(parent._main._usertempfolder /*String*/ ,"info.csv")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=63701003;
 //BA.debugLineNum = 63701003;BA.debugLine="Dim lstToken As List=su.LoadCSV2(Main.UserTempFo";
_lsttoken = new anywheresoftware.b4a.objects.collections.List();
_lsttoken = _su.LoadCSV2(parent._main._usertempfolder /*String*/ ,"info.csv",BA.ObjectToChar(","),_lstheaders);
RDebugUtils.currentLine=63701004;
 //BA.debugLineNum = 63701004;BA.debugLine="Dim DatosCSV() As String=lstToken.Get(0)";
_datoscsv = (String[])(_lsttoken.Get((int) (0)));
RDebugUtils.currentLine=63701005;
 //BA.debugLineNum = 63701005;BA.debugLine="Dim Expiration As Long=DatosCSV(0)";
_expiration = (long)(Double.parseDouble(_datoscsv[(int) (0)]));
RDebugUtils.currentLine=63701006;
 //BA.debugLineNum = 63701006;BA.debugLine="If DateTime.Now<Expiration Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.DateTime.getNow()<_expiration) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=63701007;
 //BA.debugLineNum = 63701007;BA.debugLine="accessToken=DatosCSV(1)";
__ref._accesstoken /*String*/  = _datoscsv[(int) (1)];
RDebugUtils.currentLine=63701008;
 //BA.debugLineNum = 63701008;BA.debugLine="Cookie=DatosCSV(2)";
_cookie = _datoscsv[(int) (2)];
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=63701010;
 //BA.debugLineNum = 63701010;BA.debugLine="File.Delete(Main.UserTempFolder,\"info.csv\")";
parent.__c.File.Delete(parent._main._usertempfolder /*String*/ ,"info.csv");
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;
;
RDebugUtils.currentLine=63701014;
 //BA.debugLineNum = 63701014;BA.debugLine="If accessToken=\"\" Then";

case 10:
//if
this.state = 19;
if ((__ref._accesstoken /*String*/ ).equals("")) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=63701016;
 //BA.debugLineNum = 63701016;BA.debugLine="Wait For(ObtenerTokensWebServiceDHL(UsuarioWS,Pa";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "cargatokewebservicedhl"), __ref._obtenertokenswebservicedhl /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._usuariows /*String*/ ,__ref._passwordws /*String*/ ));
this.state = 20;
return;
case 20:
//C
this.state = 13;
_mjobresponse = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63701019;
 //BA.debugLineNum = 63701019;BA.debugLine="Dim sResponse As String=mJobResponse.Get(\"sRespu";
_sresponse = BA.ObjectToString(_mjobresponse.Get((Object)("sRespuestaWebService")));
RDebugUtils.currentLine=63701020;
 //BA.debugLineNum = 63701020;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 13:
//if
this.state = 18;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=63701022;
 //BA.debugLineNum = 63701022;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Ha fallado la llamada al web  service de DHL"+parent.__c.CRLF+parent.__c.CRLF+"El error puede estar en el servidor de DHL, o en la conexion a internet. Inténtalo más tarde.","Error de comunicación");
RDebugUtils.currentLine=63701024;
 //BA.debugLineNum = 63701024;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "cargatokewebservicedhl"), _msa);
this.state = 21;
return;
case 21:
//C
this.state = 18;
_result = (int) result[1];
;
RDebugUtils.currentLine=63701025;
 //BA.debugLineNum = 63701025;BA.debugLine="Return \"ErrorWS\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("ErrorWS"));return;};
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=63701027;
 //BA.debugLineNum = 63701027;BA.debugLine="Dim Cookie As String=mJobResponse.Get(\"Cookie\")";
_cookie = BA.ObjectToString(_mjobresponse.Get((Object)("Cookie")));
RDebugUtils.currentLine=63701028;
 //BA.debugLineNum = 63701028;BA.debugLine="Log(\"Cookie \" & Cookie)";
parent.__c.LogImpl("863701028","Cookie "+_cookie,0);
RDebugUtils.currentLine=63701030;
 //BA.debugLineNum = 63701030;BA.debugLine="accessToken=mJobResponse.Get(\"Token\")";
__ref._accesstoken /*String*/  = BA.ObjectToString(_mjobresponse.Get((Object)("Token")));
RDebugUtils.currentLine=63701031;
 //BA.debugLineNum = 63701031;BA.debugLine="Log(\"accessToken \" & accessToken)";
parent.__c.LogImpl("863701031","accessToken "+__ref._accesstoken /*String*/ ,0);
RDebugUtils.currentLine=63701034;
 //BA.debugLineNum = 63701034;BA.debugLine="Dim Expiration As Long=DateTime.Now+(DateTime.T";
_expiration = (long) (parent.__c.DateTime.getNow()+(parent.__c.DateTime.TicksPerMinute)*20);
RDebugUtils.currentLine=63701035;
 //BA.debugLineNum = 63701035;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=63701036;
 //BA.debugLineNum = 63701036;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=63701037;
 //BA.debugLineNum = 63701037;BA.debugLine="lstRegistros.Add(Array As String(Expiration,acc";
_lstregistros.Add((Object)(new String[]{BA.NumberToString(_expiration),__ref._accesstoken /*String*/ ,_cookie}));
RDebugUtils.currentLine=63701038;
 //BA.debugLineNum = 63701038;BA.debugLine="su.SaveCSV2(Main.UserTempFolder,\"info.csv\",\",\",";
_su.SaveCSV2(parent._main._usertempfolder /*String*/ ,"info.csv",BA.ObjectToChar(","),_lstregistros,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Expiration","Token","Cookie"}));
RDebugUtils.currentLine=63701039;
 //BA.debugLineNum = 63701039;BA.debugLine="Return \"OK\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("OK"));return;};
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
RDebugUtils.currentLine=63701043;
 //BA.debugLineNum = 63701043;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenertokenswebservicedhl(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _credenu,String _credenpswd) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "obtenertokenswebservicedhl", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenertokenswebservicedhl", new Object[] {_credenu,_credenpswd}));}
ResumableSub_ObtenerTokensWebServiceDHL rsub = new ResumableSub_ObtenerTokensWebServiceDHL(this,__ref,_credenu,_credenpswd);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerTokensWebServiceDHL extends BA.ResumableSub {
public ResumableSub_ObtenerTokensWebServiceDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,String _credenu,String _credenpswd) {
this.parent = parent;
this.__ref = __ref;
this._credenu = _credenu;
this._credenpswd = _credenpswd;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
String _credenu;
String _credenpswd;
anywheresoftware.b4a.objects.collections.Map _mtokenjson = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jp = null;
String _tokenjsonstring = "";
b4j.docU.httpjob _job = null;
String _accesstokenurl = "";
b4j.docU.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _mjobresponse = null;
String _srespuestawebservice = "";
anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _resp = null;
anywheresoftware.b4a.objects.collections.Map _headers = null;
String _key = "";
String _scookie = "";
String[] _cookiecomponents = null;
String _cookie = "";
String _serrorjobresponse = "";
anywheresoftware.b4a.BA.IterableList group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63766530;
 //BA.debugLineNum = 63766530;BA.debugLine="Dim mTokenJSON As Map";
_mtokenjson = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63766531;
 //BA.debugLineNum = 63766531;BA.debugLine="mTokenJSON.Initialize";
_mtokenjson.Initialize();
RDebugUtils.currentLine=63766534;
 //BA.debugLineNum = 63766534;BA.debugLine="mTokenJSON.Put(\"Username\",CredenU)";
_mtokenjson.Put((Object)("Username"),(Object)(_credenu));
RDebugUtils.currentLine=63766536;
 //BA.debugLineNum = 63766536;BA.debugLine="mTokenJSON.Put(\"Password\",CredenPswd)";
_mtokenjson.Put((Object)("Password"),(Object)(_credenpswd));
RDebugUtils.currentLine=63766538;
 //BA.debugLineNum = 63766538;BA.debugLine="Dim jp As JSONGenerator";
_jp = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=63766539;
 //BA.debugLineNum = 63766539;BA.debugLine="jp.Initialize(mTokenJSON)";
_jp.Initialize(_mtokenjson);
RDebugUtils.currentLine=63766540;
 //BA.debugLineNum = 63766540;BA.debugLine="Dim TokenJSONstring As String";
_tokenjsonstring = "";
RDebugUtils.currentLine=63766541;
 //BA.debugLineNum = 63766541;BA.debugLine="TokenJSONstring=jp.ToString";
_tokenjsonstring = _jp.ToString();
RDebugUtils.currentLine=63766543;
 //BA.debugLineNum = 63766543;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=63766544;
 //BA.debugLineNum = 63766544;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=63766547;
 //BA.debugLineNum = 63766547;BA.debugLine="Dim AccessTokenURL As String=\"https://external.dh";
_accesstokenurl = "https://external.dhl.es/cimapi/api/v1/customer/authenticate";
RDebugUtils.currentLine=63766548;
 //BA.debugLineNum = 63766548;BA.debugLine="job.PostString(AccessTokenURL, TokenJSONstring)";
_job._poststring /*String*/ (null,_accesstokenurl,_tokenjsonstring);
RDebugUtils.currentLine=63766549;
 //BA.debugLineNum = 63766549;BA.debugLine="job.GetRequest.SetHeader(\"accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("accept","application/json");
RDebugUtils.currentLine=63766550;
 //BA.debugLineNum = 63766550;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=63766551;
 //BA.debugLineNum = 63766551;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=63766553;
 //BA.debugLineNum = 63766553;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "obtenertokenswebservicedhl"), (Object)(_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=63766554;
 //BA.debugLineNum = 63766554;BA.debugLine="Dim mJobResponse As Map";
_mjobresponse = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63766555;
 //BA.debugLineNum = 63766555;BA.debugLine="mJobResponse.Initialize";
_mjobresponse.Initialize();
RDebugUtils.currentLine=63766556;
 //BA.debugLineNum = 63766556;BA.debugLine="If j.Success Then   ' la API de españa devuelve 1";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=63766558;
 //BA.debugLineNum = 63766558;BA.debugLine="Dim sRespuestaWebService As String=j.getstring";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=63766559;
 //BA.debugLineNum = 63766559;BA.debugLine="Dim resp As OkHttpResponse = job.Response";
_resp = _job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ ;
RDebugUtils.currentLine=63766560;
 //BA.debugLineNum = 63766560;BA.debugLine="Dim headers As Map  = resp.GetHeaders";
_headers = new anywheresoftware.b4a.objects.collections.Map();
_headers = _resp.GetHeaders();
RDebugUtils.currentLine=63766561;
 //BA.debugLineNum = 63766561;BA.debugLine="For Each key As String In headers.Keys";
if (true) break;

case 4:
//for
this.state = 7;
group23 = _headers.Keys();
index23 = 0;
groupLen23 = group23.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index23 < groupLen23) {
this.state = 6;
_key = BA.ObjectToString(group23.Get(index23));}
if (true) break;

case 13:
//C
this.state = 12;
index23++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=63766562;
 //BA.debugLineNum = 63766562;BA.debugLine="Log($\"Header: ${key} = ${headers.Get(key)}\"$)";
parent.__c.LogImpl("863766562",("Header: "+parent.__c.SmartStringFormatter("",(Object)(_key))+" = "+parent.__c.SmartStringFormatter("",_headers.Get((Object)(_key)))+""),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=63766565;
 //BA.debugLineNum = 63766565;BA.debugLine="Dim sCookie As String=resp.GetHeaders.Get(\"set-c";
_scookie = BA.ObjectToString(_resp.GetHeaders().Get((Object)("set-cookie")));
RDebugUtils.currentLine=63766566;
 //BA.debugLineNum = 63766566;BA.debugLine="sCookie=sCookie.Replace(\"[\",\"\").Replace(\"]\",\"\")";
_scookie = _scookie.replace("[","").replace("]","");
RDebugUtils.currentLine=63766567;
 //BA.debugLineNum = 63766567;BA.debugLine="Dim CookieComponents() As String =Regex.Split(\";";
_cookiecomponents = parent.__c.Regex.Split(";",_scookie);
RDebugUtils.currentLine=63766568;
 //BA.debugLineNum = 63766568;BA.debugLine="Dim Cookie As String= CookieComponents(0)";
_cookie = _cookiecomponents[(int) (0)];
RDebugUtils.currentLine=63766569;
 //BA.debugLineNum = 63766569;BA.debugLine="Log(\"set-cookie \" & Cookie)";
parent.__c.LogImpl("863766569","set-cookie "+_cookie,0);
RDebugUtils.currentLine=63766570;
 //BA.debugLineNum = 63766570;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=63766571;
 //BA.debugLineNum = 63766571;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sRespues";
_mjobresponse.Put((Object)("sRespuestaWebService"),(Object)(_srespuestawebservice));
RDebugUtils.currentLine=63766572;
 //BA.debugLineNum = 63766572;BA.debugLine="mJobResponse.Put(\"Cookie\",Cookie)";
_mjobresponse.Put((Object)("Cookie"),(Object)(_cookie));
RDebugUtils.currentLine=63766573;
 //BA.debugLineNum = 63766573;BA.debugLine="mJobResponse.Put(\"Token\",sRespuestaWebService.Re";
_mjobresponse.Put((Object)("Token"),(Object)(_srespuestawebservice.replace(parent.__c.QUOTE,"")));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=63766576;
 //BA.debugLineNum = 63766576;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=63766577;
 //BA.debugLineNum = 63766577;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=63766578;
 //BA.debugLineNum = 63766578;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sErrorJo";
_mjobresponse.Put((Object)("sRespuestaWebService"),(Object)(_serrorjobresponse));
RDebugUtils.currentLine=63766579;
 //BA.debugLineNum = 63766579;BA.debugLine="mJobResponse.Put(\"Cookie\",\"\")";
_mjobresponse.Put((Object)("Cookie"),(Object)(""));
RDebugUtils.currentLine=63766580;
 //BA.debugLineNum = 63766580;BA.debugLine="mJobResponse.Put(\"Token\",\"\")";
_mjobresponse.Put((Object)("Token"),(Object)(""));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=63766583;
 //BA.debugLineNum = 63766583;BA.debugLine="Return mJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mjobresponse));return;};
RDebugUtils.currentLine=63766584;
 //BA.debugLineNum = 63766584;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
RDebugUtils.currentLine=62128128;
 //BA.debugLineNum = 62128128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=62128130;
 //BA.debugLineNum = 62128130;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=62128131;
 //BA.debugLineNum = 62128131;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=62128132;
 //BA.debugLineNum = 62128132;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=62128134;
 //BA.debugLineNum = 62128134;BA.debugLine="Private sFtpDHL As SFtp";
_sftpdhl = new anywheresoftware.b4a.objects.SFtpWrapper();
RDebugUtils.currentLine=62128138;
 //BA.debugLineNum = 62128138;BA.debugLine="Private NombreUltimoFichero As String";
_nombreultimofichero = "";
RDebugUtils.currentLine=62128139;
 //BA.debugLineNum = 62128139;BA.debugLine="Private btnSalir As Button";
_btnsalir = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=62128140;
 //BA.debugLineNum = 62128140;BA.debugLine="Private jamTableViewExpedicionesNoEntregadas As j";
_jamtableviewexpedicionesnoentregadas = new b4j.docU.jamtableview();
RDebugUtils.currentLine=62128142;
 //BA.debugLineNum = 62128142;BA.debugLine="Dim Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=62128143;
 //BA.debugLineNum = 62128143;BA.debugLine="Dim mSQL As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
RDebugUtils.currentLine=62128145;
 //BA.debugLineNum = 62128145;BA.debugLine="Private UsuarioWS As String";
_usuariows = "";
RDebugUtils.currentLine=62128146;
 //BA.debugLineNum = 62128146;BA.debugLine="Private PasswordWs As String";
_passwordws = "";
RDebugUtils.currentLine=62128147;
 //BA.debugLineNum = 62128147;BA.debugLine="Private accessToken As String";
_accesstoken = "";
RDebugUtils.currentLine=62128148;
 //BA.debugLineNum = 62128148;BA.debugLine="End Sub";
return "";
}
public String  _creaciontablassqlite(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "creaciontablassqlite", false))
	 {return ((String) Debug.delegate(ba, "creaciontablassqlite", null));}
int _ntfp = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sbcreartabla = null;
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Sub CreacionTablasSQLite";
RDebugUtils.currentLine=62849025;
 //BA.debugLineNum = 62849025;BA.debugLine="Dim ntFP As Int=mSQL.ExecQuerySingleResult2(\"Sele";
_ntfp = (int)(Double.parseDouble(__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuerySingleResult2("Select count(*) FROM sqlite_master WHERE Type='table' AND name=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"tblExpedicionesIncidenciasDHL"}))));
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="If ntFP>0 Then";
if (_ntfp>0) { 
RDebugUtils.currentLine=62849027;
 //BA.debugLineNum = 62849027;BA.debugLine="mSQL.ExecNonQuery(\"drop table tblExpedicionesInc";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("drop table tblExpedicionesIncidenciasDHL");
 };
RDebugUtils.currentLine=62849029;
 //BA.debugLineNum = 62849029;BA.debugLine="Dim sbCrearTabla As StringBuilder";
_sbcreartabla = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=62849030;
 //BA.debugLineNum = 62849030;BA.debugLine="sbCrearTabla.Initialize";
_sbcreartabla.Initialize();
RDebugUtils.currentLine=62849031;
 //BA.debugLineNum = 62849031;BA.debugLine="sbCrearTabla.Append(\"CREATE TABLE IF NOT EXISTS t";
_sbcreartabla.Append("CREATE TABLE IF NOT EXISTS tblExpedicionesIncidenciasDHL (");
RDebugUtils.currentLine=62849034;
 //BA.debugLineNum = 62849034;BA.debugLine="sbCrearTabla.Append(\"NumExpedicion TEXT COLLATE N";
_sbcreartabla.Append("NumExpedicion TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=62849035;
 //BA.debugLineNum = 62849035;BA.debugLine="sbCrearTabla.Append(\"Referencia TEXT COLLATE NOCA";
_sbcreartabla.Append("Referencia TEXT COLLATE NOCASE default '',");
RDebugUtils.currentLine=62849036;
 //BA.debugLineNum = 62849036;BA.debugLine="sbCrearTabla.Append(\"DescripcionSituacion TEXT CO";
_sbcreartabla.Append("DescripcionSituacion TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=62849037;
 //BA.debugLineNum = 62849037;BA.debugLine="sbCrearTabla.Append(\"Fecha TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Fecha TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=62849038;
 //BA.debugLineNum = 62849038;BA.debugLine="sbCrearTabla.Append(\"Hora TEXT COLLATE NOCASE,\")";
_sbcreartabla.Append("Hora TEXT COLLATE NOCASE,");
RDebugUtils.currentLine=62849039;
 //BA.debugLineNum = 62849039;BA.debugLine="sbCrearTabla.Append(\"Observaciones TEXT COLLATE N";
_sbcreartabla.Append("Observaciones TEXT COLLATE NOCASE)");
RDebugUtils.currentLine=62849041;
 //BA.debugLineNum = 62849041;BA.debugLine="mSQL.ExecNonQuery(sbCrearTabla.ToString)";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_sbcreartabla.ToString());
RDebugUtils.currentLine=62849043;
 //BA.debugLineNum = 62849043;BA.debugLine="End Sub";
return "";
}
public void  _datosdocumentosexpediciondhl(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _numexp) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "datosdocumentosexpediciondhl", false))
	 {Debug.delegate(ba, "datosdocumentosexpediciondhl", new Object[] {_numexp}); return;}
ResumableSub_DatosDocumentosExpedicionDHL rsub = new ResumableSub_DatosDocumentosExpedicionDHL(this,__ref,_numexp);
rsub.resume(ba, null);
}
public static class ResumableSub_DatosDocumentosExpedicionDHL extends BA.ResumableSub {
public ResumableSub_DatosDocumentosExpedicionDHL(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
String _numexp;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.List _lstopciones = null;
anywheresoftware.b4a.objects.collections.Map _mdata = null;
String _docexp = "";
long _fecha = 0L;
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
int step33;
int limit33;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63307777;
 //BA.debugLineNum = 63307777;BA.debugLine="Wait For(DocumentosExpedicionDHLNoWebService(NumE";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "datosdocumentosexpediciondhl"), __ref._documentosexpediciondhlnowebservice /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_numexp));
this.state = 47;
return;
case 47:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63307778;
 //BA.debugLineNum = 63307778;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=63307779;
 //BA.debugLineNum = 63307779;BA.debugLine="If Accion<>\"OK\" Then Return";
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
RDebugUtils.currentLine=63307780;
 //BA.debugLineNum = 63307780;BA.debugLine="Dim lstReg As List=mRes.Get(\"lstReg\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstReg"))));
RDebugUtils.currentLine=63307783;
 //BA.debugLineNum = 63307783;BA.debugLine="Dim lstOpciones As List";
_lstopciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=63307784;
 //BA.debugLineNum = 63307784;BA.debugLine="lstOpciones.Initialize";
_lstopciones.Initialize();
RDebugUtils.currentLine=63307786;
 //BA.debugLineNum = 63307786;BA.debugLine="For Each mData As Map In lstReg";
if (true) break;

case 7:
//for
this.state = 22;
_mdata = new anywheresoftware.b4a.objects.collections.Map();
group7 = _lstreg;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 48;
if (true) break;

case 48:
//C
this.state = 22;
if (index7 < groupLen7) {
this.state = 9;
_mdata = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group7.Get(index7)));}
if (true) break;

case 49:
//C
this.state = 48;
index7++;
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=63307787;
 //BA.debugLineNum = 63307787;BA.debugLine="Dim DocExp As String=mData.Get(\"Documento\")";
_docexp = BA.ObjectToString(_mdata.Get((Object)("Documento")));
RDebugUtils.currentLine=63307788;
 //BA.debugLineNum = 63307788;BA.debugLine="Dim Fecha As Long=mData.Get(\"FechaHoraMov\")";
_fecha = BA.ObjectToLongNumber(_mdata.Get((Object)("FechaHoraMov")));
RDebugUtils.currentLine=63307789;
 //BA.debugLineNum = 63307789;BA.debugLine="If DateTime.GetYear(Fecha)=DateTime.GetYear(Date";
if (true) break;

case 10:
//if
this.state = 21;
if (parent.__c.DateTime.GetYear(_fecha)==parent.__c.DateTime.GetYear(parent.__c.DateTime.getNow())) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=63307790;
 //BA.debugLineNum = 63307790;BA.debugLine="If DocExp<>\"\" Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((_docexp).equals("") == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=63307791;
 //BA.debugLineNum = 63307791;BA.debugLine="If lstOpciones.IndexOf(DocExp)=-1 Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_lstopciones.IndexOf((Object)(_docexp))==-1) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=63307792;
 //BA.debugLineNum = 63307792;BA.debugLine="lstOpciones.Add(mData.Get(\"Documento\"))";
_lstopciones.Add(_mdata.Get((Object)("Documento")));
 if (true) break;

case 19:
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
this.state = 49;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=63307801;
 //BA.debugLineNum = 63307801;BA.debugLine="Dialog.Title=\"Selecciona Documento NAV\"";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = (Object)("Selecciona Documento NAV");
RDebugUtils.currentLine=63307802;
 //BA.debugLineNum = 63307802;BA.debugLine="Dialog.TitleBarHeight=60dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = parent.__c.DipToCurrent((int) (60));
RDebugUtils.currentLine=63307803;
 //BA.debugLineNum = 63307803;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=63307804;
 //BA.debugLineNum = 63307804;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(20)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (20));
RDebugUtils.currentLine=63307805;
 //BA.debugLineNum = 63307805;BA.debugLine="Dim B4XListDlg As B4XListTemplate";
_b4xlistdlg = new b4j.docU.b4xlisttemplate();
RDebugUtils.currentLine=63307806;
 //BA.debugLineNum = 63307806;BA.debugLine="B4XListDlg.Initialize";
_b4xlistdlg._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=63307808;
 //BA.debugLineNum = 63307808;BA.debugLine="Utilidades.SetLightThemeDialog(Dialog)";
parent._utilidades._setlightthemedialog /*String*/ (__ref._dialog /*b4j.docU.b4xdialog*/ );
RDebugUtils.currentLine=63307809;
 //BA.debugLineNum = 63307809;BA.debugLine="Utilidades.SetLightThemeList(B4XListDlg)";
parent._utilidades._setlightthemelist /*String*/ (_b4xlistdlg);
RDebugUtils.currentLine=63307812;
 //BA.debugLineNum = 63307812;BA.debugLine="Dim TextSize As Float = 18 'FLOAT";
_textsize = (float) (18);
RDebugUtils.currentLine=63307813;
 //BA.debugLineNum = 63307813;BA.debugLine="Dim xclv As CustomListView=B4XListDlg.CustomListV";
_xclv = _b4xlistdlg._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=63307814;
 //BA.debugLineNum = 63307814;BA.debugLine="xclv.sv.ScrollViewInnerPanel.Color = xui.Color_Gr";
_xclv._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=63307816;
 //BA.debugLineNum = 63307816;BA.debugLine="Dim dlbl As Label=xclv.DesignerLabel";
_dlbl = new anywheresoftware.b4j.objects.LabelWrapper();
_dlbl = _xclv._designerlabel;
RDebugUtils.currentLine=63307817;
 //BA.debugLineNum = 63307817;BA.debugLine="dlbl.TextSize=TextSize";
_dlbl.setTextSize(_textsize);
RDebugUtils.currentLine=63307821;
 //BA.debugLineNum = 63307821;BA.debugLine="B4XListDlg.Options=lstOpciones";
_b4xlistdlg._options /*anywheresoftware.b4a.objects.collections.List*/  = _lstopciones;
RDebugUtils.currentLine=63307825;
 //BA.debugLineNum = 63307825;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowTemplate(B4XL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_b4xlistdlg),(Object)(""),(Object)(""),(Object)("Cancelar"));
RDebugUtils.currentLine=63307827;
 //BA.debugLineNum = 63307827;BA.debugLine="For i=0 To lstOpciones.size-1";
if (true) break;

case 23:
//for
this.state = 26;
step33 = 1;
limit33 = (int) (_lstopciones.getSize()-1);
_i = (int) (0) ;
this.state = 50;
if (true) break;

case 50:
//C
this.state = 26;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 25;
if (true) break;

case 51:
//C
this.state = 50;
_i = ((int)(0 + _i + step33)) ;
if (true) break;

case 25:
//C
this.state = 51;
RDebugUtils.currentLine=63307828;
 //BA.debugLineNum = 63307828;BA.debugLine="xclv.ResizeItem(i,60dip)";
_xclv._resizeitem(_i,parent.__c.DipToCurrent((int) (60)));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=63307832;
 //BA.debugLineNum = 63307832;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dialo";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=63307833;
 //BA.debugLineNum = 63307833;BA.debugLine="If bCancel.IsInitialized Then";
if (true) break;

case 27:
//if
this.state = 30;
if (_bcancel.IsInitialized()) { 
this.state = 29;
}if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=63307835;
 //BA.debugLineNum = 63307835;BA.debugLine="bCancel.Left=bCancel.Left-50dip";
_bcancel.setLeft(_bcancel.getLeft()-parent.__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=63307836;
 //BA.debugLineNum = 63307836;BA.debugLine="bCancel.Width=bCancel.Width+30dip";
_bcancel.setWidth(_bcancel.getWidth()+parent.__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=63307837;
 //BA.debugLineNum = 63307837;BA.debugLine="bCancel.TextSize=18";
_bcancel.setTextSize(18);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=63307840;
 //BA.debugLineNum = 63307840;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "datosdocumentosexpediciondhl"), _rsub);
this.state = 52;
return;
case 52:
//C
this.state = 31;
_rint = (int) result[1];
;
RDebugUtils.currentLine=63307843;
 //BA.debugLineNum = 63307843;BA.debugLine="If rInt<>xui.DialogResponse_Positive Then Return";
if (true) break;

case 31:
//if
this.state = 36;
if (_rint!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
if (true) return ;
if (true) break;

case 36:
//C
this.state = 37;
;
RDebugUtils.currentLine=63307845;
 //BA.debugLineNum = 63307845;BA.debugLine="Dim DocSel As String=B4XListDlg.SelectedItem";
_docsel = _b4xlistdlg._selecteditem /*String*/ ;
RDebugUtils.currentLine=63307846;
 //BA.debugLineNum = 63307846;BA.debugLine="Select True";
if (true) break;

case 37:
//select
this.state = 46;
switch (BA.switchObjectToInt(parent.__c.True,_docsel.startsWith("ALBV"),_docsel.startsWith("RT"),_docsel.startsWith("CDEV"))) {
case 0: {
this.state = 39;
if (true) break;
}
case 1: {
this.state = 41;
if (true) break;
}
case 2: {
this.state = 43;
if (true) break;
}
default: {
this.state = 45;
if (true) break;
}
}
if (true) break;

case 39:
//C
this.state = 46;
RDebugUtils.currentLine=63307848;
 //BA.debugLineNum = 63307848;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico Albaranes Venta",(int) (130),"No.",_docsel);
 if (true) break;

case 41:
//C
this.state = 46;
RDebugUtils.currentLine=63307850;
 //BA.debugLineNum = 63307850;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico recep. transferencia",(int) (5745),"No.",_docsel);
 if (true) break;

case 43:
//C
this.state = 46;
RDebugUtils.currentLine=63307852;
 //BA.debugLineNum = 63307852;BA.debugLine="Dim rSub As ResumableSub=jamLinkNavision.AbrirL";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = parent._jamlinknavision._abrirlinkfichanav /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ("Histórico envío devolución",(int) (6650),"No.",_docsel);
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=63307854;
 //BA.debugLineNum = 63307854;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No es posibl";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No es posible abrir la ficha de navision del documento "+_docsel,"Aviso");
RDebugUtils.currentLine=63307855;
 //BA.debugLineNum = 63307855;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "datosdocumentosexpediciondhl"), _msa);
this.state = 53;
return;
case 53:
//C
this.state = 46;
;
 if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=63307857;
 //BA.debugLineNum = 63307857;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _documentosexpediciondhlnowebservice(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _numexp) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "documentosexpediciondhlnowebservice", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "documentosexpediciondhlnowebservice", new Object[] {_numexp}));}
ResumableSub_DocumentosExpedicionDHLNoWebService rsub = new ResumableSub_DocumentosExpedicionDHLNoWebService(this,__ref,_numexp);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_DocumentosExpedicionDHLNoWebService extends BA.ResumableSub {
public ResumableSub_DocumentosExpedicionDHLNoWebService(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
String _numexp;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _slinkjrdc = "";
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63242242;
 //BA.debugLineNum = 63242242;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=63242243;
 //BA.debugLineNum = 63242243;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63242244;
 //BA.debugLineNum = 63242244;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=63242245;
 //BA.debugLineNum = 63242245;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=63242246;
 //BA.debugLineNum = 63242246;BA.debugLine="Dim Comando As String=\"DocumentosExpedicionDHLNoW";
_comando = "DocumentosExpedicionDHLNoWebService";
RDebugUtils.currentLine=63242248;
 //BA.debugLineNum = 63242248;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(NumEx";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_numexp)},parent);
RDebugUtils.currentLine=63242250;
 //BA.debugLineNum = 63242250;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "documentosexpediciondhlnowebservice"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63242251;
 //BA.debugLineNum = 63242251;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=63242252;
 //BA.debugLineNum = 63242252;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=63242253;
 //BA.debugLineNum = 63242253;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "documentosexpediciondhlnowebservice"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=63242254;
 //BA.debugLineNum = 63242254;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=63242255;
 //BA.debugLineNum = 63242255;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=63242258;
 //BA.debugLineNum = 63242258;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=63242259;
 //BA.debugLineNum = 63242259;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=63242260;
 //BA.debugLineNum = 63242260;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=63242261;
 //BA.debugLineNum = 63242261;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de documentos NAV para la expedicion de DHL seleccionada ("+_numexp+")","Aviso");
RDebugUtils.currentLine=63242262;
 //BA.debugLineNum = 63242262;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "documentosexpediciondhlnowebservice"), _msa);
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
RDebugUtils.currentLine=63242264;
 //BA.debugLineNum = 63242264;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=63242265;
 //BA.debugLineNum = 63242265;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=63242266;
 //BA.debugLineNum = 63242266;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=63242267;
 //BA.debugLineNum = 63242267;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=63242270;
 //BA.debugLineNum = 63242270;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=63242271;
 //BA.debugLineNum = 63242271;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _expedicioninternaexpediciontransporte(b4j.docU.cexpedicionesnoentregadasdhl __ref,int _idtransporte,String _numexp) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "expedicioninternaexpediciontransporte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "expedicioninternaexpediciontransporte", new Object[] {_idtransporte,_numexp}));}
ResumableSub_ExpedicionInternaExpedicionTransporte rsub = new ResumableSub_ExpedicionInternaExpedicionTransporte(this,__ref,_idtransporte,_numexp);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ExpedicionInternaExpedicionTransporte extends BA.ResumableSub {
public ResumableSub_ExpedicionInternaExpedicionTransporte(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,int _idtransporte,String _numexp) {
this.parent = parent;
this.__ref = __ref;
this._idtransporte = _idtransporte;
this._numexp = _numexp;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
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
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=63373314;
 //BA.debugLineNum = 63373314;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=63373315;
 //BA.debugLineNum = 63373315;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63373316;
 //BA.debugLineNum = 63373316;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=63373317;
 //BA.debugLineNum = 63373317;BA.debugLine="Dim sLinkJRDC As String=Main.rdclinkMySqlDatosCom";
_slinkjrdc = parent._main._rdclinkmysqldatoscomunes /*String*/ ;
RDebugUtils.currentLine=63373318;
 //BA.debugLineNum = 63373318;BA.debugLine="Dim Comando As String=\"DatosExpedicionInternaExpe";
_comando = "DatosExpedicionInternaExpedicionTransporte";
RDebugUtils.currentLine=63373321;
 //BA.debugLineNum = 63373321;BA.debugLine="JRDCQuery.DatosJRDC(sLinkJRDC,Comando,Array(IDTra";
parent._jrdcquery._datosjrdc /*void*/ (_slinkjrdc,_comando,new Object[]{(Object)(_idtransporte),(Object)(_numexp)},parent);
RDebugUtils.currentLine=63373323;
 //BA.debugLineNum = 63373323;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), null);
this.state = 19;
return;
case 19:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=63373324;
 //BA.debugLineNum = 63373324;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
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
RDebugUtils.currentLine=63373325;
 //BA.debugLineNum = 63373325;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de cone";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error de conexion servidor/query "+_comando+".","Error");
RDebugUtils.currentLine=63373326;
 //BA.debugLineNum = 63373326;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), _msa);
this.state = 20;
return;
case 20:
//C
this.state = 18;
;
RDebugUtils.currentLine=63373327;
 //BA.debugLineNum = 63373327;BA.debugLine="Accion=\"Salir\"";
_accion = "Salir";
RDebugUtils.currentLine=63373328;
 //BA.debugLineNum = 63373328;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=63373331;
 //BA.debugLineNum = 63373331;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
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
RDebugUtils.currentLine=63373332;
 //BA.debugLineNum = 63373332;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=63373333;
 //BA.debugLineNum = 63373333;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=63373334;
 //BA.debugLineNum = 63373334;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No hay datos";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"No hay datos de expedicion interna para el transporte y número de expedición seleccionados.","Aviso");
RDebugUtils.currentLine=63373335;
 //BA.debugLineNum = 63373335;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), _msa);
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
RDebugUtils.currentLine=63373338;
 //BA.debugLineNum = 63373338;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=63373339;
 //BA.debugLineNum = 63373339;BA.debugLine="Dim mRespuesta As Map=lstReg.Get(0)";
_mrespuesta = new anywheresoftware.b4a.objects.collections.Map();
_mrespuesta = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=63373340;
 //BA.debugLineNum = 63373340;BA.debugLine="Dim sResp As String=mRespuesta.GetValueAt(0)";
_sresp = BA.ObjectToString(_mrespuesta.GetValueAt((int) (0)));
RDebugUtils.currentLine=63373341;
 //BA.debugLineNum = 63373341;BA.debugLine="If sResp.StartsWith(\"ERROR\") Then";
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
RDebugUtils.currentLine=63373342;
 //BA.debugLineNum = 63373342;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error recup";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error recuperando datos del SP "+_comando+"."+parent.__c.CRLF+parent.__c.CRLF+_sresp,"Aviso");
RDebugUtils.currentLine=63373343;
 //BA.debugLineNum = 63373343;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "expedicioninternaexpediciontransporte"), _msa);
this.state = 22;
return;
case 22:
//C
this.state = 16;
;
RDebugUtils.currentLine=63373344;
 //BA.debugLineNum = 63373344;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=63373345;
 //BA.debugLineNum = 63373345;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=63373347;
 //BA.debugLineNum = 63373347;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=63373348;
 //BA.debugLineNum = 63373348;BA.debugLine="mRes.Put(\"Accion\", Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=63373349;
 //BA.debugLineNum = 63373349;BA.debugLine="mRes.Put(\"lstReg\", lstReg)";
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
RDebugUtils.currentLine=63373353;
 //BA.debugLineNum = 63373353;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=63373354;
 //BA.debugLineNum = 63373354;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _incidenciaspendientes(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "incidenciaspendientes", false))
	 {Debug.delegate(ba, "incidenciaspendientes", null); return;}
ResumableSub_IncidenciasPendientes rsub = new ResumableSub_IncidenciasPendientes(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_IncidenciasPendientes extends BA.ResumableSub {
public ResumableSub_IncidenciasPendientes(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
anywheresoftware.b4a.objects.collections.List _lstcodigosestadosdhl = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
anywheresoftware.b4a.objects.collections.List _lstenviosrepartidos = null;
anywheresoftware.b4a.objects.collections.List _lstenviosnoentregadosdhl = null;
anywheresoftware.b4a.objects.collections.List _lstlineasfichero = null;
String _dateformatant = "";
int _i = 0;
String _slin = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _clavesituacion = "";
String _puntogeneracion = "";
String _evento = "";
String _motivo = "";
String _descripcionsituacion = "";
String[] _sclave = null;
String _d = "";
String _descripcionsituacioncorregida = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _ma = null;
String _sfecha = "";
String _shora = "";
String _observaciones = "";
String _observacionescorregidas = "";
String _numexprepartida = "";
Object _robj = null;
int step13;
int limit13;
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;
anywheresoftware.b4a.BA.IterableList group66;
int index66;
int groupLen66;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="Dim lstCodigosEstadosDHL As List";
_lstcodigosestadosdhl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62783491;
 //BA.debugLineNum = 62783491;BA.debugLine="lstCodigosEstadosDHL.Initialize";
_lstcodigosestadosdhl.Initialize();
RDebugUtils.currentLine=62783492;
 //BA.debugLineNum = 62783492;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=62783494;
 //BA.debugLineNum = 62783494;BA.debugLine="lstCodigosEstadosDHL=su.LoadCSV(File.DirAssets,\"i";
_lstcodigosestadosdhl = _su.LoadCSV(parent.__c.File.getDirAssets(),"incidencias_carretera.csv",BA.ObjectToChar(";"));
RDebugUtils.currentLine=62783496;
 //BA.debugLineNum = 62783496;BA.debugLine="Dim lstEnviosRepartidos As List";
_lstenviosrepartidos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62783497;
 //BA.debugLineNum = 62783497;BA.debugLine="lstEnviosRepartidos.Initialize";
_lstenviosrepartidos.Initialize();
RDebugUtils.currentLine=62783499;
 //BA.debugLineNum = 62783499;BA.debugLine="Dim lstEnviosNoEntregadosDHL As List";
_lstenviosnoentregadosdhl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62783500;
 //BA.debugLineNum = 62783500;BA.debugLine="lstEnviosNoEntregadosDHL.Initialize";
_lstenviosnoentregadosdhl.Initialize();
RDebugUtils.currentLine=62783501;
 //BA.debugLineNum = 62783501;BA.debugLine="Dim lstLineasFichero As List";
_lstlineasfichero = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62783503;
 //BA.debugLineNum = 62783503;BA.debugLine="lstLineasFichero = File.ReadList(xui.DefaultFolde";
_lstlineasfichero = parent.__c.File.ReadList(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),__ref._nombreultimofichero /*String*/ );
RDebugUtils.currentLine=62783504;
 //BA.debugLineNum = 62783504;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=62783506;
 //BA.debugLineNum = 62783506;BA.debugLine="DateTime.DateFormat=\"yyyyMMdd\"";
parent.__c.DateTime.setDateFormat("yyyyMMdd");
RDebugUtils.currentLine=62783508;
 //BA.debugLineNum = 62783508;BA.debugLine="For i = 0 To lstLineasFichero.Size - 1";
if (true) break;

case 1:
//for
this.state = 28;
step13 = 1;
limit13 = (int) (_lstlineasfichero.getSize()-1);
_i = (int) (0) ;
this.state = 33;
if (true) break;

case 33:
//C
this.state = 28;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 3;
if (true) break;

case 34:
//C
this.state = 33;
_i = ((int)(0 + _i + step13)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=62783509;
 //BA.debugLineNum = 62783509;BA.debugLine="LogColor(lstLineasFichero.Get(i),xui.Color_Blue)";
parent.__c.LogImpl("862783509",BA.ObjectToString(_lstlineasfichero.Get(_i)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Blue);
RDebugUtils.currentLine=62783510;
 //BA.debugLineNum = 62783510;BA.debugLine="Dim sLin As String=lstLineasFichero.Get(i)";
_slin = BA.ObjectToString(_lstlineasfichero.Get(_i));
RDebugUtils.currentLine=62783511;
 //BA.debugLineNum = 62783511;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=62783512;
 //BA.debugLineNum = 62783512;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=62783513;
 //BA.debugLineNum = 62783513;BA.debugLine="m.Put(\"NumExpedicion\",sLin.SubString2(47,62))";
_m.Put((Object)("NumExpedicion"),(Object)(_slin.substring((int) (47),(int) (62))));
RDebugUtils.currentLine=62783514;
 //BA.debugLineNum = 62783514;BA.debugLine="m.Put(\"Referencia\",sLin.SubString2(12,46).Trim)";
_m.Put((Object)("Referencia"),(Object)(_slin.substring((int) (12),(int) (46)).trim()));
RDebugUtils.currentLine=62783516;
 //BA.debugLineNum = 62783516;BA.debugLine="Dim ClaveSituacion As String=sLin.SubString2(64,";
_clavesituacion = _slin.substring((int) (64),(int) (66)).trim();
RDebugUtils.currentLine=62783517;
 //BA.debugLineNum = 62783517;BA.debugLine="Dim PuntoGeneracion As String=sLin.SubString2(14";
_puntogeneracion = _slin.substring((int) (140),(int) (143));
RDebugUtils.currentLine=62783518;
 //BA.debugLineNum = 62783518;BA.debugLine="Dim Evento As String=sLin.SubString2(143,146)";
_evento = _slin.substring((int) (143),(int) (146));
RDebugUtils.currentLine=62783519;
 //BA.debugLineNum = 62783519;BA.debugLine="Dim Motivo As String=sLin.SubString2(146,149)";
_motivo = _slin.substring((int) (146),(int) (149));
RDebugUtils.currentLine=62783520;
 //BA.debugLineNum = 62783520;BA.debugLine="Dim DescripcionSituacion As String";
_descripcionsituacion = "";
RDebugUtils.currentLine=62783521;
 //BA.debugLineNum = 62783521;BA.debugLine="For Each sClave() As String In lstCodigosEstados";
if (true) break;

case 4:
//for
this.state = 11;
group25 = _lstcodigosestadosdhl;
index25 = 0;
groupLen25 = group25.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 11;
if (index25 < groupLen25) {
this.state = 6;
_sclave = (String[])(group25.Get(index25));}
if (true) break;

case 36:
//C
this.state = 35;
index25++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=62783523;
 //BA.debugLineNum = 62783523;BA.debugLine="If sClave(0) & \"#/#\" & sClave(3) & \"#/#\" & sCla";
if (true) break;

case 7:
//if
this.state = 10;
if ((_sclave[(int) (0)]+"#/#"+_sclave[(int) (3)]+"#/#"+_sclave[(int) (4)]).equals(_clavesituacion+"#/#"+_evento+"#/#"+_motivo)) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=62783524;
 //BA.debugLineNum = 62783524;BA.debugLine="DescripcionSituacion=sClave(1)";
_descripcionsituacion = _sclave[(int) (1)];
RDebugUtils.currentLine=62783525;
 //BA.debugLineNum = 62783525;BA.debugLine="Exit";
this.state = 11;
if (true) break;
 if (true) break;

case 10:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=62783528;
 //BA.debugLineNum = 62783528;BA.debugLine="Dim d As String =DescripcionSituacion";
_d = _descripcionsituacion;
RDebugUtils.currentLine=62783529;
 //BA.debugLineNum = 62783529;BA.debugLine="Dim DescripcionSituacionCorregida As String";
_descripcionsituacioncorregida = "";
RDebugUtils.currentLine=62783530;
 //BA.debugLineNum = 62783530;BA.debugLine="Dim ma As Matcher";
_ma = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=62783531;
 //BA.debugLineNum = 62783531;BA.debugLine="ma = Regex.Matcher(\"(-?[0-9]+(?:[,.][0-9]+)?)\",d";
_ma = parent.__c.Regex.Matcher("(-?[0-9]+(?:[,.][0-9]+)?)",_d);
RDebugUtils.currentLine=62783532;
 //BA.debugLineNum = 62783532;BA.debugLine="If ma.Find Then";
if (true) break;

case 12:
//if
this.state = 17;
if (_ma.Find()) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=62783533;
 //BA.debugLineNum = 62783533;BA.debugLine="Log(ma.Match)";
parent.__c.LogImpl("862783533",_ma.getMatch(),0);
RDebugUtils.currentLine=62783534;
 //BA.debugLineNum = 62783534;BA.debugLine="DescripcionSituacionCorregida=ma.Match";
_descripcionsituacioncorregida = _ma.getMatch();
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=62783536;
 //BA.debugLineNum = 62783536;BA.debugLine="DescripcionSituacionCorregida=DescripcionSituac";
_descripcionsituacioncorregida = _descripcionsituacion;
 if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=62783538;
 //BA.debugLineNum = 62783538;BA.debugLine="m.Put(\"DescripcionSituacion\",DescripcionSituacio";
_m.Put((Object)("DescripcionSituacion"),(Object)(_descripcionsituacioncorregida));
RDebugUtils.currentLine=62783539;
 //BA.debugLineNum = 62783539;BA.debugLine="Dim sFecha As String=sLin.SubString2(66,74)";
_sfecha = _slin.substring((int) (66),(int) (74));
RDebugUtils.currentLine=62783540;
 //BA.debugLineNum = 62783540;BA.debugLine="m.Put(\"Fecha\",DateTime.DateParse(sFecha))";
_m.Put((Object)("Fecha"),(Object)(parent.__c.DateTime.DateParse(_sfecha)));
RDebugUtils.currentLine=62783541;
 //BA.debugLineNum = 62783541;BA.debugLine="Dim sHora As String=sLin.SubString2(74,80)";
_shora = _slin.substring((int) (74),(int) (80));
RDebugUtils.currentLine=62783543;
 //BA.debugLineNum = 62783543;BA.debugLine="m.Put(\"Hora\",sHora.SubString2(0,2) & \":\" & sHora";
_m.Put((Object)("Hora"),(Object)(_shora.substring((int) (0),(int) (2))+":"+_shora.substring((int) (2),(int) (4))+"."+_shora.substring((int) (4))));
RDebugUtils.currentLine=62783544;
 //BA.debugLineNum = 62783544;BA.debugLine="Dim Observaciones As String=sLin.SubString2(90,1";
_observaciones = _slin.substring((int) (90),(int) (140));
RDebugUtils.currentLine=62783545;
 //BA.debugLineNum = 62783545;BA.debugLine="Dim ObservacionesCorregidas As String";
_observacionescorregidas = "";
RDebugUtils.currentLine=62783546;
 //BA.debugLineNum = 62783546;BA.debugLine="Dim d As String =Observaciones";
_d = _observaciones;
RDebugUtils.currentLine=62783547;
 //BA.debugLineNum = 62783547;BA.debugLine="Dim ma As Matcher";
_ma = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=62783548;
 //BA.debugLineNum = 62783548;BA.debugLine="ma = Regex.Matcher(\"(-?[0-9]+(?:[,.][0-9]+)?)\",d";
_ma = parent.__c.Regex.Matcher("(-?[0-9]+(?:[,.][0-9]+)?)",_d);
RDebugUtils.currentLine=62783549;
 //BA.debugLineNum = 62783549;BA.debugLine="If ma.Find Then";
if (true) break;

case 18:
//if
this.state = 23;
if (_ma.Find()) { 
this.state = 20;
}else {
this.state = 22;
}if (true) break;

case 20:
//C
this.state = 23;
RDebugUtils.currentLine=62783550;
 //BA.debugLineNum = 62783550;BA.debugLine="Log(ma.Match)";
parent.__c.LogImpl("862783550",_ma.getMatch(),0);
RDebugUtils.currentLine=62783551;
 //BA.debugLineNum = 62783551;BA.debugLine="ObservacionesCorregidas=ma.Match";
_observacionescorregidas = _ma.getMatch();
 if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=62783553;
 //BA.debugLineNum = 62783553;BA.debugLine="ObservacionesCorregidas=Observaciones";
_observacionescorregidas = _observaciones;
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=62783555;
 //BA.debugLineNum = 62783555;BA.debugLine="m.Put(\"Observaciones\",ObservacionesCorregidas)";
_m.Put((Object)("Observaciones"),(Object)(_observacionescorregidas));
RDebugUtils.currentLine=62783556;
 //BA.debugLineNum = 62783556;BA.debugLine="LogColor(\"Estado Expedicion \" & m,xui.Color_Gray";
parent.__c.LogImpl("862783556","Estado Expedicion "+BA.ObjectToString(_m),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray);
RDebugUtils.currentLine=62783557;
 //BA.debugLineNum = 62783557;BA.debugLine="lstEnviosNoEntregadosDHL.Add(m)";
_lstenviosnoentregadosdhl.Add((Object)(_m.getObject()));
RDebugUtils.currentLine=62783558;
 //BA.debugLineNum = 62783558;BA.debugLine="If DescripcionSituacion=\"repartido\" Then";
if (true) break;

case 24:
//if
this.state = 27;
if ((_descripcionsituacion).equals("repartido")) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=62783559;
 //BA.debugLineNum = 62783559;BA.debugLine="lstEnviosRepartidos.Add(m.Get(\"NumExpedicion\"))";
_lstenviosrepartidos.Add(_m.Get((Object)("NumExpedicion")));
 if (true) break;

case 27:
//C
this.state = 34;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=62783563;
 //BA.debugLineNum = 62783563;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=62783566;
 //BA.debugLineNum = 62783566;BA.debugLine="DBUtils.InsertMaps(mSQL,\"tblExpedicionesIncidenci";
parent._dbutils._insertmaps /*boolean*/ (__ref._msql /*anywheresoftware.b4j.objects.SQL*/ ,"tblExpedicionesIncidenciasDHL",_lstenviosnoentregadosdhl);
RDebugUtils.currentLine=62783568;
 //BA.debugLineNum = 62783568;BA.debugLine="For Each NumExpRepartida As String In lstEnviosRe";
if (true) break;

case 29:
//for
this.state = 32;
group66 = _lstenviosrepartidos;
index66 = 0;
groupLen66 = group66.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 32;
if (index66 < groupLen66) {
this.state = 31;
_numexprepartida = BA.ObjectToString(group66.Get(index66));}
if (true) break;

case 38:
//C
this.state = 37;
index66++;
if (true) break;

case 31:
//C
this.state = 38;
RDebugUtils.currentLine=62783569;
 //BA.debugLineNum = 62783569;BA.debugLine="mSQL.ExecNonQuery2(\"delete from tblExpedicionesI";
__ref._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery2("delete from tblExpedicionesIncidenciasDHL where NumExpedicion=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_numexprepartida)}));
 if (true) break;
if (true) break;

case 32:
//C
this.state = -1;
;
RDebugUtils.currentLine=62783587;
 //BA.debugLineNum = 62783587;BA.debugLine="wait for (ActualizarDatosTabla(lstEnviosNoEntrega";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "incidenciaspendientes"), __ref._actualizardatostabla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_lstenviosnoentregadosdhl));
this.state = 39;
return;
case 39:
//C
this.state = -1;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=62783588;
 //BA.debugLineNum = 62783588;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _jamtableviewexpedicionesnoentregadas_accionsalirjamtableview(b4j.docU.cexpedicionesnoentregadasdhl __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "jamtableviewexpedicionesnoentregadas_accionsalirjamtableview", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewexpedicionesnoentregadas_accionsalirjamtableview", null));}
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Sub jamTableViewExpedicionesNoEntregadas_AccionSal";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="jamTableViewExpedicionesNoEntregadas.GuardarConfi";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._guardarconfiguracioncolumnasusuario /*String*/ (null);
RDebugUtils.currentLine=63045634;
 //BA.debugLineNum = 63045634;BA.debugLine="jamTableViewExpedicionesNoEntregadas.LimpiarTabla";
__ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._limpiartabla /*String*/ (null);
RDebugUtils.currentLine=63045635;
 //BA.debugLineNum = 63045635;BA.debugLine="frm.Close";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Close();
RDebugUtils.currentLine=63045636;
 //BA.debugLineNum = 63045636;BA.debugLine="MainMenu2.Show";
_mainmenu2._show /*void*/ ();
RDebugUtils.currentLine=63045637;
 //BA.debugLineNum = 63045637;BA.debugLine="End Sub";
return "";
}
public String  _jamtableviewexpedicionesnoentregadas_contextmenuitem_action(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _tagmenuitem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "jamtableviewexpedicionesnoentregadas_contextmenuitem_action", false))
	 {return ((String) Debug.delegate(ba, "jamtableviewexpedicionesnoentregadas_contextmenuitem_action", new Object[] {_tagmenuitem}));}
int _idtransportedhl = 0;
b4j.docU.jamtableview._datosceldaseleccionadajamtableview _dcs = null;
anywheresoftware.b4a.objects.collections.Map _mpk = null;
String _expediciondhl = "";
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Sub jamTableViewExpedicionesNoEntregadas_ContextMe";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="Select TagMenuItem";
switch (BA.switchObjectToInt(_tagmenuitem,"Documentos NAV de la expedicion","TrazabilidadExpedicionWebDHL")) {
case 0: {
RDebugUtils.currentLine=63111171;
 //BA.debugLineNum = 63111171;BA.debugLine="Dim IDTransporteDHL As Int=1";
_idtransportedhl = (int) (1);
RDebugUtils.currentLine=63111172;
 //BA.debugLineNum = 63111172;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=63111173;
 //BA.debugLineNum = 63111173;BA.debugLine="Dim mPK As Map=DCS.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _dcs.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=63111174;
 //BA.debugLineNum = 63111174;BA.debugLine="Dim ExpedicionDHL As String=mPK.Get(\"NumExpedic";
_expediciondhl = BA.ObjectToString(_mpk.Get((Object)("NumExpedicion")));
RDebugUtils.currentLine=63111175;
 //BA.debugLineNum = 63111175;BA.debugLine="DatosDocumentosExpedicionDHL(ExpedicionDHL.Trim";
__ref._datosdocumentosexpediciondhl /*void*/ (null,_expediciondhl.trim());
 break; }
case 1: {
RDebugUtils.currentLine=63111178;
 //BA.debugLineNum = 63111178;BA.debugLine="Dim DCS As DatosCeldaSeleccionadaJamTableView=j";
_dcs = __ref._jamtableviewexpedicionesnoentregadas /*b4j.docU.jamtableview*/ ._getdatosceldaseleccionada /*b4j.docU.jamtableview._datosceldaseleccionadajamtableview*/ (null);
RDebugUtils.currentLine=63111179;
 //BA.debugLineNum = 63111179;BA.debugLine="Dim mPK As Map=DCS.mDataPK";
_mpk = new anywheresoftware.b4a.objects.collections.Map();
_mpk = _dcs.mDataPK /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=63111180;
 //BA.debugLineNum = 63111180;BA.debugLine="Dim ExpedicionDHL As String=mPK.Get(\"NumExpedic";
_expediciondhl = BA.ObjectToString(_mpk.Get((Object)("NumExpedicion")));
RDebugUtils.currentLine=63111181;
 //BA.debugLineNum = 63111181;BA.debugLine="fx.ShowExternalDocument(\"https://clientesparcel";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .ShowExternalDocument("https://clientesparcel.dhl.es/seguimientoenvios/integra/SeguimientoDocumentos.aspx?codigo="+_expediciondhl+"&anno=2017&lang=sp");
 break; }
}
;
RDebugUtils.currentLine=63111183;
 //BA.debugLineNum = 63111183;BA.debugLine="End Sub";
return "";
}
public String  _sftpdhl_downloadcompleted(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _serverpath,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "sftpdhl_downloadcompleted", false))
	 {return ((String) Debug.delegate(ba, "sftpdhl_downloadcompleted", new Object[] {_serverpath,_success}));}
RDebugUtils.currentLine=62717952;
 //BA.debugLineNum = 62717952;BA.debugLine="Sub sftpDHL_DownloadCompleted (ServerPath As Strin";
RDebugUtils.currentLine=62717953;
 //BA.debugLineNum = 62717953;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="If Not(Success) Then";
if (__c.Not(_success)) { 
RDebugUtils.currentLine=62717955;
 //BA.debugLineNum = 62717955;BA.debugLine="fx.Msgbox(frm,\"Error descargando fichero de esta";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Error descargando fichero de estado expediciones.","Error");
RDebugUtils.currentLine=62717956;
 //BA.debugLineNum = 62717956;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=62717958;
 //BA.debugLineNum = 62717958;BA.debugLine="IncidenciasPendientes";
__ref._incidenciaspendientes /*void*/ (null);
RDebugUtils.currentLine=62717959;
 //BA.debugLineNum = 62717959;BA.debugLine="End Sub";
return "";
}
public void  _sftpdhl_listcompleted(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _serverpath,boolean _success,anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _folders,anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _files) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "sftpdhl_listcompleted", false))
	 {Debug.delegate(ba, "sftpdhl_listcompleted", new Object[] {_serverpath,_success,_folders,_files}); return;}
ResumableSub_sftpDHL_ListCompleted rsub = new ResumableSub_sftpDHL_ListCompleted(this,__ref,_serverpath,_success,_folders,_files);
rsub.resume(ba, null);
}
public static class ResumableSub_sftpDHL_ListCompleted extends BA.ResumableSub {
public ResumableSub_sftpDHL_ListCompleted(b4j.docU.cexpedicionesnoentregadasdhl parent,b4j.docU.cexpedicionesnoentregadasdhl __ref,String _serverpath,boolean _success,anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _folders,anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _files) {
this.parent = parent;
this.__ref = __ref;
this._serverpath = _serverpath;
this._success = _success;
this._folders = _folders;
this._files = _files;
this.__ref = parent;
}
b4j.docU.cexpedicionesnoentregadasdhl __ref;
b4j.docU.cexpedicionesnoentregadasdhl parent;
String _serverpath;
boolean _success;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _folders;
anywheresoftware.b4a.objects.SFtpWrapper.SFTPFileWrapper[] _files;
anywheresoftware.b4a.objects.collections.List _lstenviosnoentregadosdhl = null;
Object _robj = null;
int _i = 0;
long _fechalongultimofichero = 0L;
String _rutaultimofichero = "";
int step14;
int limit14;
int step19;
int limit19;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=62652417;
 //BA.debugLineNum = 62652417;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.DEFAULT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.DEFAULT);
RDebugUtils.currentLine=62652418;
 //BA.debugLineNum = 62652418;BA.debugLine="If Files.Length=0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_files.length==0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=62652419;
 //BA.debugLineNum = 62652419;BA.debugLine="Dim lstEnviosNoEntregadosDHL As List";
_lstenviosnoentregadosdhl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62652420;
 //BA.debugLineNum = 62652420;BA.debugLine="lstEnviosNoEntregadosDHL.Initialize";
_lstenviosnoentregadosdhl.Initialize();
RDebugUtils.currentLine=62652421;
 //BA.debugLineNum = 62652421;BA.debugLine="wait for (ActualizarDatosTabla(lstEnviosNoEntreg";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cexpedicionesnoentregadasdhl", "sftpdhl_listcompleted"), __ref._actualizardatostabla /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_lstenviosnoentregadosdhl));
this.state = 29;
return;
case 29:
//C
this.state = 4;
_robj = (Object) result[1];
;
RDebugUtils.currentLine=62652422;
 //BA.debugLineNum = 62652422;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=62652424;
 //BA.debugLineNum = 62652424;BA.debugLine="Log(ServerPath)";
parent.__c.LogImpl("862652424",_serverpath,0);
RDebugUtils.currentLine=62652425;
 //BA.debugLineNum = 62652425;BA.debugLine="If Success = False Then";
if (true) break;

case 5:
//if
this.state = 22;
if (_success==parent.__c.False) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 22;
RDebugUtils.currentLine=62652426;
 //BA.debugLineNum = 62652426;BA.debugLine="Log(LastException.Message)";
parent.__c.LogImpl("862652426",parent.__c.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=62652427;
 //BA.debugLineNum = 62652427;BA.debugLine="fx.Msgbox(frm,\"Error listando carpeta FTP.\" & CR";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,"Error listando carpeta FTP."+parent.__c.CRLF+parent.__c.CRLF+parent.__c.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=62652428;
 //BA.debugLineNum = 62652428;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=62652430;
 //BA.debugLineNum = 62652430;BA.debugLine="For i = 0 To Folders.Length - 1";
if (true) break;

case 10:
//for
this.state = 13;
step14 = 1;
limit14 = (int) (_folders.length-1);
_i = (int) (0) ;
this.state = 30;
if (true) break;

case 30:
//C
this.state = 13;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 12;
if (true) break;

case 31:
//C
this.state = 30;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 12:
//C
this.state = 31;
RDebugUtils.currentLine=62652431;
 //BA.debugLineNum = 62652431;BA.debugLine="Log(Folders(i).Name)";
parent.__c.LogImpl("862652431",_folders[_i].getName(),0);
RDebugUtils.currentLine=62652432;
 //BA.debugLineNum = 62652432;BA.debugLine="Log(DateTime.Date(Folders(i).Timestamp))";
parent.__c.LogImpl("862652432",parent.__c.DateTime.Date(_folders[_i].getTimestamp()),0);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=62652435;
 //BA.debugLineNum = 62652435;BA.debugLine="Dim FechaLongUltimoFichero As Long";
_fechalongultimofichero = 0L;
RDebugUtils.currentLine=62652436;
 //BA.debugLineNum = 62652436;BA.debugLine="For i = 0 To Files.Length - 1";
if (true) break;

case 14:
//for
this.state = 21;
step19 = 1;
limit19 = (int) (_files.length-1);
_i = (int) (0) ;
this.state = 32;
if (true) break;

case 32:
//C
this.state = 21;
if ((step19 > 0 && _i <= limit19) || (step19 < 0 && _i >= limit19)) this.state = 16;
if (true) break;

case 33:
//C
this.state = 32;
_i = ((int)(0 + _i + step19)) ;
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=62652437;
 //BA.debugLineNum = 62652437;BA.debugLine="Log(Files(i).Name & \", \" & Files(i).Size & \", \"";
parent.__c.LogImpl("862652437",_files[_i].getName()+", "+BA.NumberToString(_files[_i].getSize())+", "+parent.__c.DateTime.Date(_files[_i].getTimestamp()),0);
RDebugUtils.currentLine=62652438;
 //BA.debugLineNum = 62652438;BA.debugLine="If Files(i).Timestamp> FechaLongUltimoFichero T";
if (true) break;

case 17:
//if
this.state = 20;
if (_files[_i].getTimestamp()>_fechalongultimofichero) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=62652439;
 //BA.debugLineNum = 62652439;BA.debugLine="NombreUltimoFichero=Files(i).Name";
__ref._nombreultimofichero /*String*/  = _files[_i].getName();
RDebugUtils.currentLine=62652440;
 //BA.debugLineNum = 62652440;BA.debugLine="FechaLongUltimoFichero=Files(i).Timestamp";
_fechalongultimofichero = _files[_i].getTimestamp();
 if (true) break;

case 20:
//C
this.state = 33;
;
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=62652444;
 //BA.debugLineNum = 62652444;BA.debugLine="Log(\"********NombreUltimoFichero*******\")";
parent.__c.LogImpl("862652444","********NombreUltimoFichero*******",0);
RDebugUtils.currentLine=62652445;
 //BA.debugLineNum = 62652445;BA.debugLine="Log(NombreUltimoFichero)";
parent.__c.LogImpl("862652445",__ref._nombreultimofichero /*String*/ ,0);
RDebugUtils.currentLine=62652447;
 //BA.debugLineNum = 62652447;BA.debugLine="If File.Exists(xui.DefaultFolder,NombreUltimoFich";
if (true) break;

case 23:
//if
this.state = 28;
if (parent.__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),__ref._nombreultimofichero /*String*/ )==parent.__c.False) { 
this.state = 25;
}else {
this.state = 27;
}if (true) break;

case 25:
//C
this.state = 28;
RDebugUtils.currentLine=62652448;
 //BA.debugLineNum = 62652448;BA.debugLine="Dim RutaUltimoFichero As String=\"out/work\" & \"/\"";
_rutaultimofichero = "out/work"+"/"+__ref._nombreultimofichero /*String*/ ;
RDebugUtils.currentLine=62652449;
 //BA.debugLineNum = 62652449;BA.debugLine="frm.RootPane.MouseCursor= fx.Cursors.WAIT";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.WAIT);
RDebugUtils.currentLine=62652451;
 //BA.debugLineNum = 62652451;BA.debugLine="sFtpDHL.DownloadFile(RutaUltimoFichero, xui.Defa";
__ref._sftpdhl /*anywheresoftware.b4a.objects.SFtpWrapper*/ .DownloadFile(ba,_rutaultimofichero,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),__ref._nombreultimofichero /*String*/ );
 if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=62652453;
 //BA.debugLineNum = 62652453;BA.debugLine="IncidenciasPendientes";
__ref._incidenciaspendientes /*void*/ (null);
 if (true) break;

case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=62652455;
 //BA.debugLineNum = 62652455;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sftpdhl_promptyesno(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "sftpdhl_promptyesno", false))
	 {return ((String) Debug.delegate(ba, "sftpdhl_promptyesno", new Object[] {_message}));}
RDebugUtils.currentLine=62390272;
 //BA.debugLineNum = 62390272;BA.debugLine="Sub sftpDHL_PromptYesNo (Message As String)";
RDebugUtils.currentLine=62390278;
 //BA.debugLineNum = 62390278;BA.debugLine="sFtpDHL.SetPromptResult(True)";
__ref._sftpdhl /*anywheresoftware.b4a.objects.SFtpWrapper*/ .SetPromptResult(__c.True);
RDebugUtils.currentLine=62390279;
 //BA.debugLineNum = 62390279;BA.debugLine="End Sub";
return "";
}
public String  _sftpdhl_showmessage(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _message) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "sftpdhl_showmessage", false))
	 {return ((String) Debug.delegate(ba, "sftpdhl_showmessage", new Object[] {_message}));}
RDebugUtils.currentLine=62455808;
 //BA.debugLineNum = 62455808;BA.debugLine="Sub sftpDHL_ShowMessage (Message As String)";
RDebugUtils.currentLine=62455809;
 //BA.debugLineNum = 62455809;BA.debugLine="fx.Msgbox(frm,Message, \"\")";
__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Msgbox(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ,_message,"");
RDebugUtils.currentLine=62455810;
 //BA.debugLineNum = 62455810;BA.debugLine="End Sub";
return "";
}
public String  _sftpdhl_uploadcompleted(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _serverpath,boolean _success) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "sftpdhl_uploadcompleted", false))
	 {return ((String) Debug.delegate(ba, "sftpdhl_uploadcompleted", new Object[] {_serverpath,_success}));}
RDebugUtils.currentLine=62586880;
 //BA.debugLineNum = 62586880;BA.debugLine="Sub sftpDHL_UploadCompleted (ServerPath As String,";
RDebugUtils.currentLine=62586881;
 //BA.debugLineNum = 62586881;BA.debugLine="Log(ServerPath & \", Success=\" & Success)";
__c.LogImpl("862586881",_serverpath+", Success="+BA.ObjectToString(_success),0);
RDebugUtils.currentLine=62586882;
 //BA.debugLineNum = 62586882;BA.debugLine="If Success = False Then Log(LastException.Message";
if (_success==__c.False) { 
__c.LogImpl("862586882",__c.LastException(ba).getMessage(),0);};
RDebugUtils.currentLine=62586883;
 //BA.debugLineNum = 62586883;BA.debugLine="End Sub";
return "";
}
public String  _sftpdhl_uploadprogress(b4j.docU.cexpedicionesnoentregadasdhl __ref,String _serverpath,long _totaluploaded,long _total) throws Exception{
__ref = this;
RDebugUtils.currentModule="cexpedicionesnoentregadasdhl";
if (Debug.shouldDelegate(ba, "sftpdhl_uploadprogress", false))
	 {return ((String) Debug.delegate(ba, "sftpdhl_uploadprogress", new Object[] {_serverpath,_totaluploaded,_total}));}
String _s = "";
RDebugUtils.currentLine=62521344;
 //BA.debugLineNum = 62521344;BA.debugLine="Sub sftpDHL_UploadProgress (ServerPath As String,";
RDebugUtils.currentLine=62521345;
 //BA.debugLineNum = 62521345;BA.debugLine="Dim s As String";
_s = "";
RDebugUtils.currentLine=62521346;
 //BA.debugLineNum = 62521346;BA.debugLine="s = \"Uploaded \" & Round(TotalUploaded / 1000) & \"";
_s = "Uploaded "+BA.NumberToString(__c.Round(_totaluploaded/(double)1000))+"KB";
RDebugUtils.currentLine=62521347;
 //BA.debugLineNum = 62521347;BA.debugLine="If Total > 0 Then s = s & \" out of \" & Round(Tota";
if (_total>0) { 
_s = _s+" out of "+BA.NumberToString(__c.Round(_total/(double)1000))+"KB";};
RDebugUtils.currentLine=62521348;
 //BA.debugLineNum = 62521348;BA.debugLine="Log(s)";
__c.LogImpl("862521348",_s,0);
RDebugUtils.currentLine=62521349;
 //BA.debugLineNum = 62521349;BA.debugLine="End Sub";
return "";
}
}