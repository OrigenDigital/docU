package b4j.docU;

import anywheresoftware.b4a.debug.*;
import java.nio.file.*;
import java.io.*;
	import java.math.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;

import anywheresoftware.b4a.BA;

public class utilidades extends Object{
public static utilidades mostCurrent = new utilidades();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.utilidades", null);
		ba.loadHtSubs(utilidades.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.utilidades", ba);
		}
	}
    public static Class<?> getObject() {
		return utilidades.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static anywheresoftware.b4a.objects.collections.Map  _dimensionespantalla() throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "dimensionespantalla", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "dimensionespantalla", null));}
anywheresoftware.b4a.objects.collections.Map _mdim = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub DimensionesPantalla As Map";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim mDim As Map";
_mdim = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="mDim.Initialize";
_mdim.Initialize();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="mDim.Put(\"X\",fx.PrimaryScreen.MaxX - fx.PrimarySc";
_mdim.Put((Object)("X"),(Object)(_fx.getPrimaryScreen().getMaxX()-_fx.getPrimaryScreen().getMinX()));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="mDim.Put(\"Y\",fx.PrimaryScreen.MaxY - fx.PrimarySc";
_mdim.Put((Object)("Y"),(Object)(_fx.getPrimaryScreen().getMaxY()-_fx.getPrimaryScreen().getMinY()));
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Return mDim";
if (true) return _mdim;
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="End Sub";
return null;
}
public static String  _centerformonscreen(anywheresoftware.b4j.objects.Form _f) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "centerformonscreen", false))
	 {return ((String) Debug.delegate(ba, "centerformonscreen", new Object[] {_f}));}
anywheresoftware.b4j.object.JavaObject _stage = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub CenterFormOnScreen(f As Form)";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim Stage As JavaObject = f";
_stage = new anywheresoftware.b4j.object.JavaObject();
_stage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Stage = Stage.GetField(\"stage\")";
_stage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_stage.GetField("stage")));
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Stage.RunMethod(\"centerOnScreen\",Null)";
_stage.RunMethod("centerOnScreen",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _msgboxxui(String _titulomsg,String _textomensaje) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "msgboxxui", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "msgboxxui", new Object[] {_titulomsg,_textomensaje}));}
ResumableSub_MsgBoxXUI rsub = new ResumableSub_MsgBoxXUI(null,_titulomsg,_textomensaje);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MsgBoxXUI extends BA.ResumableSub {
public ResumableSub_MsgBoxXUI(b4j.docU.utilidades parent,String _titulomsg,String _textomensaje) {
this.parent = parent;
this._titulomsg = _titulomsg;
this._textomensaje = _textomensaje;
}
b4j.docU.utilidades parent;
String _titulomsg;
String _textomensaje;
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(TextoMensaje,Ti";
_msa = parent._xui.MsgboxAsync(ba,_textomensaje,_titulomsg);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "msgboxxui"), _msa);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _setfonttobitmap(String _fonttext,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fonttype,float _fontsize,int _fontcolor) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setfonttobitmap", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "setfonttobitmap", new Object[] {_fonttext,_fonttype,_fontsize,_fontcolor}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub SetFontToBitmap (FontText As String, Fo";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (32)));
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(ba,_p);
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(FontText, xui";
_r = _cvs1.MeasureText(_fonttext,_xui.CreateFont2(_fonttype,_fontsize));
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="cvs1.DrawText(FontText, cvs1.TargetRect.CenterX,";
_cvs1.DrawText(_fonttext,_cvs1.getTargetRect().getCenterX(),_baseline,_xui.CreateFont2(_fonttype,_fontsize),_fontcolor,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="cvs1.Invalidate";
_cvs1.Invalidate();
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="cvs1.Release";
_cvs1.Release();
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _createb4xfont(String _fontfilename,float _fontsize,float _nativefontsize) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "createb4xfont", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "createb4xfont", new Object[] {_fontfilename,_fontsize,_nativefontsize}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub CreateB4XFont(FontFileName As String, F";
RDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="Return xui.CreateFont(fx.LoadFont(File.DirAssets,";
if (true) return _xui.CreateFont((javafx.scene.text.Font)(_fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),_fontfilename,_nativefontsize).getObject()),_fontsize);
RDebugUtils.currentLine=5767176;
 //BA.debugLineNum = 5767176;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkpermisosaplicacionusuarioobjetopermiso(String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario,String _nombreobjetopermiso) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "checkpermisosaplicacionusuarioobjetopermiso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkpermisosaplicacionusuarioobjetopermiso", new Object[] {_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso}));}
ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso rsub = new ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso extends BA.ResumableSub {
public ResumableSub_CheckPermisosAplicacionUsuarioObjetoPermiso(b4j.docU.utilidades parent,String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario,String _nombreobjetopermiso) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
this._nombreobjetopermiso = _nombreobjetopermiso;
}
b4j.docU.utilidades parent;
String _rdclinkcommandpermisos;
String _comandopermisos;
String _aplicacion;
String _usuario;
String _nombreobjetopermiso;
String _sres = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Wait For(PermisosAplicacionUsuarioObjetoPermiso(r";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _permisosaplicacionusuarioobjetopermiso(_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sres = (String) result[0];
;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Select Case sRes";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
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
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="Return \"ERROR\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("ERROR"));return;};
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="Return \"NO\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("NO"));return;};
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="Return \"ERROR\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("ERROR"));return;};
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a este módulo.","Aviso");
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisosaplicacionusuarioobjetopermiso"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 12;
;
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="Return \"DENIED\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("DENIED"));return;};
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="Return sRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_sres));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _finduserdocumentsfolder() throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "finduserdocumentsfolder", false))
	 {return ((String) Debug.delegate(ba, "finduserdocumentsfolder", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _fs = null;
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="public Sub FindUserDocumentsFolder As String";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="If DetectOS = \"windows\" Then";
if ((_detectos()).equals("windows")) { 
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Dim fs As JavaObject = jo.InitializeStatic(\"java";
_fs = new anywheresoftware.b4j.object.JavaObject();
_fs = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.InitializeStatic("javax.swing.filechooser.FileSystemView").RunMethod("getFileSystemView",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="Return fs.RunMethodJO(\"getDefaultDirectory\", Nul";
if (true) return BA.ObjectToString(_fs.RunMethodJO("getDefaultDirectory",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("getPath",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
 }else {
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Return GetSystemProperty(\"user.home\", \"\") & \"/Do";
if (true) return anywheresoftware.b4a.keywords.Common.GetSystemProperty("user.home","")+"/Documents";
 };
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _msgbox2xui(String _titulomsg,String _textomensaje,String _textook,String _textocancelar,String _textnok,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenicono) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "msgbox2xui", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "msgbox2xui", new Object[] {_titulomsg,_textomensaje,_textook,_textocancelar,_textnok,_imagenicono}));}
ResumableSub_MsgBox2XUI rsub = new ResumableSub_MsgBox2XUI(null,_titulomsg,_textomensaje,_textook,_textocancelar,_textnok,_imagenicono);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MsgBox2XUI extends BA.ResumableSub {
public ResumableSub_MsgBox2XUI(b4j.docU.utilidades parent,String _titulomsg,String _textomensaje,String _textook,String _textocancelar,String _textnok,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenicono) {
this.parent = parent;
this._titulomsg = _titulomsg;
this._textomensaje = _textomensaje;
this._textook = _textook;
this._textocancelar = _textocancelar;
this._textnok = _textnok;
this._imagenicono = _imagenicono;
}
b4j.docU.utilidades parent;
String _titulomsg;
String _textomensaje;
String _textook;
String _textocancelar;
String _textnok;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenicono;
Object _msa = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="If ImagenIcono.IsInitialized Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_imagenicono.IsInitialized()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(TextoMensaj";
_msa = parent._xui.Msgbox2Async(ba,_textomensaje,_titulomsg,_textook,_textocancelar,_textnok,(javafx.scene.image.Image)(_imagenicono.getObject()));
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "msgbox2xui"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(TextoMensaj";
_msa = parent._xui.Msgbox2Async(ba,_textomensaje,_titulomsg,_textook,_textocancelar,_textnok,(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="Sleep(0)";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "msgbox2xui"),(int) (0));
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
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="Wait For (msa) Msgbox_Result (rInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "msgbox2xui"), _msa);
this.state = 9;
return;
case 9:
//C
this.state = -1;
_rint = (int) result[0];
;
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="Return rInt";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_rint));return;};
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _addimagetolabel(anywheresoftware.b4j.objects.LabelWrapper _lbl,String _dirimage,String _fileimage) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "addimagetolabel", false))
	 {return ((String) Debug.delegate(ba, "addimagetolabel", new Object[] {_lbl,_dirimage,_fileimage}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlblsalir = null;
anywheresoftware.b4j.objects.ImageViewWrapper _imgv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _ximgv = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4j.object.JavaObject _jolblsalirjamtableview = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub AddImageToLabel(lbl As Label, DirImage As Stri";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim xLblSalir As B4XView=lbl";
_xlblsalir = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlblsalir = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="xLblSalir.Width=16dip";
_xlblsalir.setWidth(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="xLblSalir.Height=16dip";
_xlblsalir.setHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (16)));
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Dim imgV As ImageView";
_imgv = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="imgV.Initialize(\"\")";
_imgv.Initialize(ba,"");
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="Dim xImgV As B4XView=imgV";
_ximgv = new anywheresoftware.b4a.objects.B4XViewWrapper();
_ximgv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imgv.getObject()));
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="xImgV.Width=xLblSalir.Width";
_ximgv.setWidth(_xlblsalir.getWidth());
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="xImgV.Height=xLblSalir.Height";
_ximgv.setHeight(_xlblsalir.getHeight());
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="Dim bmp As B4XBitmap = xui.LoadBitmap(DirImage, F";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _xui.LoadBitmap(_dirimage,_fileimage);
RDebugUtils.currentLine=6946828;
 //BA.debugLineNum = 6946828;BA.debugLine="FillImageToView(bmp, xImgV)";
_fillimagetoview(_bmp,_ximgv);
RDebugUtils.currentLine=6946829;
 //BA.debugLineNum = 6946829;BA.debugLine="Dim JOlblSalirJamTableView As JavaObject=lbl";
_jolblsalirjamtableview = new anywheresoftware.b4j.object.JavaObject();
_jolblsalirjamtableview = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="JOlblSalirJamTableView.RunMethod(\"setGraphic\", Ar";
_jolblsalirjamtableview.RunMethod("setGraphic",new Object[]{(Object)(_imgv.getObject())});
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="End Sub";
return "";
}
public static String  _fillimagetoview(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,anywheresoftware.b4a.objects.B4XViewWrapper _imageview) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "fillimagetoview", false))
	 {return ((String) Debug.delegate(ba, "fillimagetoview", new Object[] {_bmp,_imageview}));}
float _bmpratio = 0f;
float _viewratio = 0f;
int _newheight = 0;
int _newwidth = 0;
float _scale = 0f;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub FillImageToView(bmp As B4XBitmap, ImageView As";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim bmpRatio As Float = bmp.Width / bmp.Height";
_bmpratio = (float) (_bmp.getWidth()/(double)_bmp.getHeight());
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim viewRatio As Float = ImageView.Width / ImageV";
_viewratio = (float) (_imageview.getWidth()/(double)_imageview.getHeight());
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="If viewRatio > bmpRatio Then";
if (_viewratio>_bmpratio) { 
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Dim NewHeight As Int = bmp.Width / viewRatio";
_newheight = (int) (_bmp.getWidth()/(double)_viewratio);
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="bmp = bmp.Crop(0, bmp.Height / 2 - NewHeight / 2";
_bmp = _bmp.Crop((int) (0),(int) (_bmp.getHeight()/(double)2-_newheight/(double)2),(int) (_bmp.getWidth()),_newheight);
 }else 
{RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="Else if viewRatio < bmpRatio Then";
if (_viewratio<_bmpratio) { 
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="Dim NewWidth As Int = bmp.Height * viewRatio";
_newwidth = (int) (_bmp.getHeight()*_viewratio);
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="bmp = bmp.Crop(bmp.Width / 2 - NewWidth / 2, 0,";
_bmp = _bmp.Crop((int) (_bmp.getWidth()/(double)2-_newwidth/(double)2),(int) (0),_newwidth,(int) (_bmp.getHeight()));
 }}
;
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="Dim scale As Float = 1";
_scale = (float) (1);
RDebugUtils.currentLine=7012366;
 //BA.debugLineNum = 7012366;BA.debugLine="ImageView.SetBitmap(bmp.Resize(ImageView.Width *";
_imageview.SetBitmap((javafx.scene.image.Image)(_bmp.Resize((int) (_imageview.getWidth()*_scale),(int) (_imageview.getHeight()*_scale),anywheresoftware.b4a.keywords.Common.True).getObject()));
RDebugUtils.currentLine=7012367;
 //BA.debugLineNum = 7012367;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _ajusteautomaxcolumna(anywheresoftware.b4j.objects.TableViewWrapper _tv) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "ajusteautomaxcolumna", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "ajusteautomaxcolumna", new Object[] {_tv}));}
int[] _colchars = null;
Object[] _row = null;
int _c = 0;
String _scontenido = "";
int _totalchars = 0;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _lstanchos = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="public Sub AjusteAutoMaxColumna(tv As TableView) A";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="Dim colChars(tv.ColumnsCount) As Int";
_colchars = new int[_tv.getColumnsCount()];
;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="For Each row() As Object In tv.Items";
{
final anywheresoftware.b4a.BA.IterableList group2 = _tv.getItems();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_row = (Object[])(group2.Get(index2));
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="For c = 0 To tv.ColumnsCount - 1";
{
final int step3 = 1;
final int limit3 = (int) (_tv.getColumnsCount()-1);
_c = (int) (0) ;
for (;_c <= limit3 ;_c = _c + step3 ) {
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Dim sContenido As String=row(c)";
_scontenido = BA.ObjectToString(_row[_c]);
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="colChars(c) = Max(sContenido.Length, colChars(c";
_colchars[_c] = (int) (anywheresoftware.b4a.keywords.Common.Max(_scontenido.length(),_colchars[_c]));
 }
};
 }
};
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="Dim totalChars As Int    ' Total length in chars";
_totalchars = 0;
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="For i = 0 To colChars.Length - 1";
{
final int step9 = 1;
final int limit9 = (int) (_colchars.length-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="If colChars(i) < tv.GetColumnHeader(i).Length Th";
if (_colchars[_i]<_tv.GetColumnHeader(_i).length()) { 
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="colChars(i) = tv.GetColumnHeader(i).Length";
_colchars[_i] = _tv.GetColumnHeader(_i).length();
 };
RDebugUtils.currentLine=3997711;
 //BA.debugLineNum = 3997711;BA.debugLine="totalChars = totalChars + colChars(i)";
_totalchars = (int) (_totalchars+_colchars[_i]);
 }
};
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="Dim lstAnchos As List";
_lstanchos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="lstAnchos.Initialize";
_lstanchos.Initialize();
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="For i = 0 To colChars.Length - 1";
{
final int step17 = 1;
final int limit17 = (int) (_colchars.length-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="Log(\"Ancho columna \" & tv.GetColumnHeader(i) & \"";
anywheresoftware.b4a.keywords.Common.LogImpl("83997719","Ancho columna "+_tv.GetColumnHeader(_i)+" = "+BA.NumberToString(((_colchars[_i]*8)+20)),0);
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="lstAnchos.Add(((colChars(i) * 8)+20))";
_lstanchos.Add((Object)(((_colchars[_i]*8)+20)));
 }
};
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="Return lstAnchos";
if (true) return _lstanchos;
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="End Sub";
return null;
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "application_error", false))
	 {return ((Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4j.object.JavaObject  _asjo(anywheresoftware.b4j.object.JavaObject _o) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "asjo", false))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_o}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub asJO(o As JavaObject)As JavaObject";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido() throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido", null));}
ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido rsub = new ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido extends BA.ResumableSub {
public ResumableSub_CargaDatosConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido(b4j.docU.utilidades parent) {
this.parent = parent;
}
b4j.docU.utilidades parent;
String _accion = "";
String _error = "";
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comando = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Dim mData0 As Map";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="mData0.Initialize";
_mdata0.Initialize();
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="Dim Comando As String=\"ConfiguracionHttpRequestEn";
_comando = "ConfiguracionHttpRequestEnvioCorreoDesdeBuzonCompartido";
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comando,(Object[])(anywheresoftware.b4a.keywords.Common.Null),utilidades.getObject());
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="Wait For DatosJRDC_Completed (mResult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="If mResult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="Error=$\"Error de conexion servidor/query ${Coman";
_error = ("Error de conexion servidor/query "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_comando))+".");
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="If mResult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=7274523;
 //BA.debugLineNum = 7274523;BA.debugLine="Error=$\"No existe configuración para envio auto";
_error = ("No existe configuración para envio automático de email nueva tarea incidencia.");
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=7274526;
 //BA.debugLineNum = 7274526;BA.debugLine="Dim lstReg As List=mResult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=7274527;
 //BA.debugLineNum = 7274527;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=7274528;
 //BA.debugLineNum = 7274528;BA.debugLine="Error=\"\"";
_error = "";
RDebugUtils.currentLine=7274530;
 //BA.debugLineNum = 7274530;BA.debugLine="Dim mData0 As Map=lstReg.Get(0)";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
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
RDebugUtils.currentLine=7274537;
 //BA.debugLineNum = 7274537;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=7274538;
 //BA.debugLineNum = 7274538;BA.debugLine="mRes.Put(\"Error\",Error)";
_mres.Put((Object)("Error"),(Object)(_error));
RDebugUtils.currentLine=7274539;
 //BA.debugLineNum = 7274539;BA.debugLine="mRes.Put(\"mData0\",mData0)";
_mres.Put((Object)("mData0"),(Object)(_mdata0.getObject()));
RDebugUtils.currentLine=7274540;
 //BA.debugLineNum = 7274540;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=7274541;
 //BA.debugLineNum = 7274541;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static double  _cdbl(Object _o) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "cdbl", false))
	 {return ((Double) Debug.delegate(ba, "cdbl", new Object[] {_o}));}
String _ox = "";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="public Sub CDbl(o As Object) As Double";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Try";
try {RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim ox As String = o";
_ox = BA.ObjectToString(_o);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="If(IsNumber(ox) And (ox.ToLowerCase.Contains(\".\"";
if ((anywheresoftware.b4a.keywords.Common.IsNumber(_ox) && (_ox.toLowerCase().contains(".") || _ox.toLowerCase().contains("e")))) { 
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="ox = NumberFormat2(o,0,9,0,False)";
_ox = anywheresoftware.b4a.keywords.Common.NumberFormat2((double)(BA.ObjectToNumber(_o)),(int) (0),(int) (9),(int) (0),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="ox = GetNumbers(ox)";
_ox = _getnumbers(_ox);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="If ox = \"\" Then ox = \"0\"";
if ((_ox).equals("")) { 
_ox = "0";};
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Return ox";
if (true) return (double)(Double.parseDouble(_ox));
 } 
       catch (Exception e10) {
			ba.setLastException(e10);RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="Return 0";
if (true) return 0;
 };
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="End Sub";
return 0;
}
public static String  _getnumbers(String _value) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "getnumbers", false))
	 {return ((String) Debug.delegate(ba, "getnumbers", new Object[] {_value}));}
int _strcnt = 0;
String _str = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _master = "";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="public Sub GetNumbers(value As String) As String";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim strCnt As Int";
_strcnt = 0;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="Dim master As String = \"0123456789-.\"";
_master = "0123456789-.";
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="For strCnt = 0 To value.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_value.length()-1);
_strcnt = (int) (0) ;
for (;_strcnt <= limit6 ;_strcnt = _strcnt + step6 ) {
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="str = value.CharAt(strCnt)";
_str = BA.ObjectToString(_value.charAt(_strcnt));
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="If master.IndexOf(str) >= 0 Then";
if (_master.indexOf(_str)>=0) { 
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="sb.Append(str)";
_sb.Append(_str);
 };
 }
};
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _checkpermisoaplicacionusuario(String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "checkpermisoaplicacionusuario", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "checkpermisoaplicacionusuario", new Object[] {_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario}));}
ResumableSub_CheckPermisoAplicacionUsuario rsub = new ResumableSub_CheckPermisoAplicacionUsuario(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CheckPermisoAplicacionUsuario extends BA.ResumableSub {
public ResumableSub_CheckPermisoAplicacionUsuario(b4j.docU.utilidades parent,String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
}
b4j.docU.utilidades parent;
String _rdclinkcommandpermisos;
String _comandopermisos;
String _aplicacion;
String _usuario;
String _sres = "";
Object _msa = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Wait For(PermisosAplicacionUsuarioObjetoPermiso(r";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisoaplicacionusuario"), _permisosaplicacionusuarioobjetopermiso(_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,"Aplicacion"));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_sres = (String) result[0];
;
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Select Case sRes";
if (true) break;

case 1:
//select
this.state = 12;
switch (BA.switchObjectToInt(_sres,"ErrConn","SinPermiso","ERROR","DENIED")) {
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
default: {
this.state = 11;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error de con";
_msa = parent._xui.MsgboxAsync(ba,"Error de conexion servidor/query.","Error");
RDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisoaplicacionusuario"), _msa);
this.state = 14;
return;
case 14:
//C
this.state = 12;
;
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 5:
//C
this.state = 12;
RDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="Return \"PermisoNoEspecificado\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("PermisoNoEspecificado"));return;};
 if (true) break;

case 7:
//C
this.state = 12;
RDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(sRes,\"Error\")";
_msa = parent._xui.MsgboxAsync(ba,_sres,"Error");
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisoaplicacionusuario"), _msa);
this.state = 15;
return;
case 15:
//C
this.state = 12;
;
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=4718608;
 //BA.debugLineNum = 4718608;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"No tienes pe";
_msa = parent._xui.MsgboxAsync(ba,"No tienes permiso para acceder a esta aplicacón.","Aviso");
RDebugUtils.currentLine=4718609;
 //BA.debugLineNum = 4718609;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "checkpermisoaplicacionusuario"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
;
RDebugUtils.currentLine=4718610;
 //BA.debugLineNum = 4718610;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
RDebugUtils.currentLine=4718611;
 //BA.debugLineNum = 4718611;BA.debugLine="Return Null";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,anywheresoftware.b4a.keywords.Common.Null);return;};
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4718613;
 //BA.debugLineNum = 4718613;BA.debugLine="Return sRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_sres));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=4718615;
 //BA.debugLineNum = 4718615;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _permisosaplicacionusuarioobjetopermiso(String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario,String _nombreobjetopermiso) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "permisosaplicacionusuarioobjetopermiso", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "permisosaplicacionusuarioobjetopermiso", new Object[] {_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso}));}
ResumableSub_PermisosAplicacionUsuarioObjetoPermiso rsub = new ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(null,_rdclinkcommandpermisos,_comandopermisos,_aplicacion,_usuario,_nombreobjetopermiso);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PermisosAplicacionUsuarioObjetoPermiso extends BA.ResumableSub {
public ResumableSub_PermisosAplicacionUsuarioObjetoPermiso(b4j.docU.utilidades parent,String _rdclinkcommandpermisos,String _comandopermisos,String _aplicacion,String _usuario,String _nombreobjetopermiso) {
this.parent = parent;
this._rdclinkcommandpermisos = _rdclinkcommandpermisos;
this._comandopermisos = _comandopermisos;
this._aplicacion = _aplicacion;
this._usuario = _usuario;
this._nombreobjetopermiso = _nombreobjetopermiso;
}
b4j.docU.utilidades parent;
String _rdclinkcommandpermisos;
String _comandopermisos;
String _aplicacion;
String _usuario;
String _nombreobjetopermiso;
String _sres = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstreg = null;
anywheresoftware.b4a.objects.collections.Map _mperm = null;
String _sperm = "";
String _permisoaplicaciontodosusuariostodosobjetos = "";
String _permisoaplicaciontodosusuariosobjeto = "";
String _permisoaplicacionusuariotodosobjetos = "";
String _permisoaplicacionusuarioobjeto = "";
String _osapp = "";
String _osperm = "";
String _userperm = "";
String _objetoperm = "";
String _tipoperm = "";
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim sRes As String";
_sres = "";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="JRDCQuery.DatosJRDC(rdcLinkCommandPermisos,Comand";
parent._jrdcquery._datosjrdc /*void*/ (_rdclinkcommandpermisos,_comandopermisos,new Object[]{(Object)(_aplicacion)},utilidades.getObject());
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "permisosaplicacionusuarioobjetopermiso"), null);
this.state = 112;
return;
case 112:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 111;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 111;
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="sRes=\"ErrConn\"";
_sres = "ErrConn";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 110;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 110;
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="sRes=\"SinPermiso\"";
_sres = "SinPermiso";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="Dim lstReg As List=mresult.Get(\"lstRes\")";
_lstreg = new anywheresoftware.b4a.objects.collections.List();
_lstreg = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="Dim mPerm As Map=lstReg.Get(0)";
_mperm = new anywheresoftware.b4a.objects.collections.Map();
_mperm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstreg.Get((int) (0))));
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Dim sPerm As String=mPerm.GetValueAt(0)";
_sperm = BA.ObjectToString(_mperm.GetValueAt((int) (0)));
RDebugUtils.currentLine=4849677;
 //BA.debugLineNum = 4849677;BA.debugLine="If sPerm.StartsWith(\"ERROR\") Then";
if (true) break;

case 11:
//if
this.state = 109;
if (_sperm.startsWith("ERROR")) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 109;
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="sRes=\"ERROR \" & sPerm";
_sres = "ERROR "+_sperm;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="Dim PermisoAplicacionTodosUsuariosTodosObjetos";
_permisoaplicaciontodosusuariostodosobjetos = "";
RDebugUtils.currentLine=4849681;
 //BA.debugLineNum = 4849681;BA.debugLine="Dim PermisoAplicacionTodosUsuariosObjeto As St";
_permisoaplicaciontodosusuariosobjeto = "";
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="Dim PermisoAplicacionUsuarioTodosObjetos As St";
_permisoaplicacionusuariotodosobjetos = "";
RDebugUtils.currentLine=4849683;
 //BA.debugLineNum = 4849683;BA.debugLine="Dim PermisoAplicacionUsuarioObjeto As String";
_permisoaplicacionusuarioobjeto = "";
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="Dim OSApp As String";
_osapp = "";
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="OSApp=\"Windows\"";
_osapp = "Windows";
RDebugUtils.currentLine=4849691;
 //BA.debugLineNum = 4849691;BA.debugLine="For Each mPerm As Map In lstReg";
if (true) break;

case 16:
//for
this.state = 52;
_mperm = new anywheresoftware.b4a.objects.collections.Map();
group22 = _lstreg;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 113;
if (true) break;

case 113:
//C
this.state = 52;
if (index22 < groupLen22) {
this.state = 18;
_mperm = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group22.Get(index22)));}
if (true) break;

case 114:
//C
this.state = 113;
index22++;
if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=4849692;
 //BA.debugLineNum = 4849692;BA.debugLine="Dim OSPerm As String=mPerm.Get(\"OS\")";
_osperm = BA.ObjectToString(_mperm.Get((Object)("OS")));
RDebugUtils.currentLine=4849693;
 //BA.debugLineNum = 4849693;BA.debugLine="If OSPerm<>\"\" And OSPerm.ToUpperCase<>OSApp.T";
if (true) break;

case 19:
//if
this.state = 24;
if ((_osperm).equals("") == false && (_osperm.toUpperCase()).equals(_osapp.toUpperCase()) == false) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
this.state = 114;
if (true) break;;
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="Dim UserPerm As String=mPerm.Get(\"IDUsuario\")";
_userperm = BA.ObjectToString(_mperm.Get((Object)("IDUsuario")));
RDebugUtils.currentLine=4849695;
 //BA.debugLineNum = 4849695;BA.debugLine="Dim ObjetoPerm As String=mPerm.Get(\"ObjetoPer";
_objetoperm = BA.ObjectToString(_mperm.Get((Object)("ObjetoPermiso")));
RDebugUtils.currentLine=4849696;
 //BA.debugLineNum = 4849696;BA.debugLine="Dim TipoPerm As String=mPerm.Get(\"TipoPermiso";
_tipoperm = BA.ObjectToString(_mperm.Get((Object)("TipoPermiso")));
RDebugUtils.currentLine=4849698;
 //BA.debugLineNum = 4849698;BA.debugLine="If UserPerm<>\"\" And UserPerm.ToUpperCase<>Usu";
if (true) break;

case 25:
//if
this.state = 30;
if ((_userperm).equals("") == false && (_userperm.toUpperCase()).equals(_usuario.toUpperCase()) == false) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
this.state = 114;
if (true) break;;
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=4849700;
 //BA.debugLineNum = 4849700;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";
if (true) break;

case 31:
//if
this.state = 34;
if ((_userperm.toUpperCase()).equals(_usuario.toUpperCase()) && (_objetoperm.toUpperCase()).equals(_nombreobjetopermiso.toUpperCase())) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=4849701;
 //BA.debugLineNum = 4849701;BA.debugLine="PermisoAplicacionUsuarioObjeto=TipoPerm";
_permisoaplicacionusuarioobjeto = _tipoperm;
RDebugUtils.currentLine=4849703;
 //BA.debugLineNum = 4849703;BA.debugLine="Exit";
this.state = 52;
if (true) break;
 if (true) break;
;
RDebugUtils.currentLine=4849706;
 //BA.debugLineNum = 4849706;BA.debugLine="If UserPerm.ToUpperCase=Usuario.ToUpperCase A";

case 34:
//if
this.state = 39;
if ((_userperm.toUpperCase()).equals(_usuario.toUpperCase()) && (_objetoperm).equals("")) { 
this.state = 36;
;}if (true) break;

case 36:
//C
this.state = 39;
_permisoaplicacionusuariotodosobjetos = _tipoperm;
if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=4849708;
 //BA.debugLineNum = 4849708;BA.debugLine="If ObjetoPerm.ToUpperCase=NombreObjetoPermiso";
if (true) break;

case 40:
//if
this.state = 45;
if ((_objetoperm.toUpperCase()).equals(_nombreobjetopermiso.toUpperCase()) && (_userperm).equals("")) { 
this.state = 42;
;}if (true) break;

case 42:
//C
this.state = 45;
_permisoaplicaciontodosusuariosobjeto = _tipoperm;
if (true) break;

case 45:
//C
this.state = 46;
;
RDebugUtils.currentLine=4849710;
 //BA.debugLineNum = 4849710;BA.debugLine="If UserPerm=\"\" And ObjetoPerm=\"\" Then Permiso";
if (true) break;

case 46:
//if
this.state = 51;
if ((_userperm).equals("") && (_objetoperm).equals("")) { 
this.state = 48;
;}if (true) break;

case 48:
//C
this.state = 51;
_permisoaplicaciontodosusuariostodosobjetos = _tipoperm;
if (true) break;

case 51:
//C
this.state = 114;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=4849715;
 //BA.debugLineNum = 4849715;BA.debugLine="If PermisoAplicacionTodosUsuariosTodosObjetos<";

case 52:
//if
this.state = 57;
if ((_permisoaplicaciontodosusuariostodosobjetos).equals("") == false) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_sres = _permisoaplicaciontodosusuariostodosobjetos;
if (true) break;

case 57:
//C
this.state = 58;
;
RDebugUtils.currentLine=4849716;
 //BA.debugLineNum = 4849716;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" Th";
if (true) break;

case 58:
//if
this.state = 63;
if ((_permisoaplicacionusuariotodosobjetos).equals("") == false) { 
this.state = 60;
;}if (true) break;

case 60:
//C
this.state = 63;
_sres = _permisoaplicacionusuariotodosobjetos;
if (true) break;

case 63:
//C
this.state = 64;
;
RDebugUtils.currentLine=4849717;
 //BA.debugLineNum = 4849717;BA.debugLine="If PermisoAplicacionTodosUsuariosObjeto<>\"\" Th";
if (true) break;

case 64:
//if
this.state = 69;
if ((_permisoaplicaciontodosusuariosobjeto).equals("") == false) { 
this.state = 66;
;}if (true) break;

case 66:
//C
this.state = 69;
_sres = _permisoaplicaciontodosusuariosobjeto;
if (true) break;

case 69:
//C
this.state = 70;
;
RDebugUtils.currentLine=4849720;
 //BA.debugLineNum = 4849720;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos<>\"\" An";
if (true) break;

case 70:
//if
this.state = 99;
if ((_permisoaplicacionusuariotodosobjetos).equals("") == false && (_permisoaplicaciontodosusuariosobjeto).equals("") == false && (_permisoaplicacionusuariotodosobjetos).equals(_permisoaplicaciontodosusuariosobjeto) == false) { 
this.state = 72;
}if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=4849721;
 //BA.debugLineNum = 4849721;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"ADMI";
if (true) break;

case 73:
//if
this.state = 98;
if ((_permisoaplicacionusuariotodosobjetos).equals("ADMIN")) { 
this.state = 75;
}else {
this.state = 77;
}if (true) break;

case 75:
//C
this.state = 98;
RDebugUtils.currentLine=4849722;
 //BA.debugLineNum = 4849722;BA.debugLine="sPerm=\"ADMIN\"";
_sperm = "ADMIN";
 if (true) break;

case 77:
//C
this.state = 78;
RDebugUtils.currentLine=4849724;
 //BA.debugLineNum = 4849724;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"DEN";
if (true) break;

case 78:
//if
this.state = 97;
if ((_permisoaplicacionusuariotodosobjetos).equals("DENIED") || (_permisoaplicaciontodosusuariosobjeto).equals("DENIED")) { 
this.state = 80;
}else {
this.state = 82;
}if (true) break;

case 80:
//C
this.state = 97;
RDebugUtils.currentLine=4849725;
 //BA.debugLineNum = 4849725;BA.debugLine="sPerm=\"DENIED\"";
_sperm = "DENIED";
 if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=4849727;
 //BA.debugLineNum = 4849727;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R\"";
if (true) break;

case 83:
//if
this.state = 96;
if ((_permisoaplicacionusuariotodosobjetos).equals("R") || (_permisoaplicaciontodosusuariosobjeto).equals("R")) { 
this.state = 85;
}else {
this.state = 87;
}if (true) break;

case 85:
//C
this.state = 96;
RDebugUtils.currentLine=4849728;
 //BA.debugLineNum = 4849728;BA.debugLine="sPerm=\"R\"";
_sperm = "R";
 if (true) break;

case 87:
//C
this.state = 88;
RDebugUtils.currentLine=4849730;
 //BA.debugLineNum = 4849730;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"R";
if (true) break;

case 88:
//if
this.state = 95;
if ((_permisoaplicacionusuariotodosobjetos).equals("RW") || (_permisoaplicaciontodosusuariosobjeto).equals("RW")) { 
this.state = 90;
}if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=4849731;
 //BA.debugLineNum = 4849731;BA.debugLine="sPerm=\"RW\"";
_sperm = "RW";
RDebugUtils.currentLine=4849733;
 //BA.debugLineNum = 4849733;BA.debugLine="If PermisoAplicacionUsuarioTodosObjetos=\"";
if (true) break;

case 91:
//if
this.state = 94;
if ((_permisoaplicacionusuariotodosobjetos).equals("ADMIN") || (_permisoaplicaciontodosusuariosobjeto).equals("ADMIN")) { 
this.state = 93;
}if (true) break;

case 93:
//C
this.state = 94;
RDebugUtils.currentLine=4849734;
 //BA.debugLineNum = 4849734;BA.debugLine="sPerm=\"ADMIN\"";
_sperm = "ADMIN";
 if (true) break;

case 94:
//C
this.state = 95;
;
 if (true) break;

case 95:
//C
this.state = 96;
;
 if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;

case 98:
//C
this.state = 99;
;
 if (true) break;
;
RDebugUtils.currentLine=4849741;
 //BA.debugLineNum = 4849741;BA.debugLine="If PermisoAplicacionUsuarioObjeto<>\"\" Then sRe";

case 99:
//if
this.state = 104;
if ((_permisoaplicacionusuarioobjeto).equals("") == false) { 
this.state = 101;
;}if (true) break;

case 101:
//C
this.state = 104;
_sres = _permisoaplicacionusuarioobjeto;
if (true) break;

case 104:
//C
this.state = 105;
;
RDebugUtils.currentLine=4849743;
 //BA.debugLineNum = 4849743;BA.debugLine="If sRes=\"\" Then";
if (true) break;

case 105:
//if
this.state = 108;
if ((_sres).equals("")) { 
this.state = 107;
}if (true) break;

case 107:
//C
this.state = 108;
RDebugUtils.currentLine=4849744;
 //BA.debugLineNum = 4849744;BA.debugLine="sRes=\"SinPermiso\"";
_sres = "SinPermiso";
 if (true) break;

case 108:
//C
this.state = 109;
;
 if (true) break;

case 109:
//C
this.state = 110;
;
 if (true) break;

case 110:
//C
this.state = 111;
;
 if (true) break;

case 111:
//C
this.state = -1;
;
RDebugUtils.currentLine=4849751;
 //BA.debugLineNum = 4849751;BA.debugLine="LogColor(\"Check Permiso \" & Aplicacion & \" USUARI";
anywheresoftware.b4a.keywords.Common.LogImpl("84849751","Check Permiso "+_aplicacion+" USUARIO: "+_usuario+" Nombre OBJETO Permiso: "+_nombreobjetopermiso+":"+"PERMISO: "+_sres,((int)0xffff1493));
RDebugUtils.currentLine=4849754;
 //BA.debugLineNum = 4849754;BA.debugLine="Return sRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_sres));return;};
RDebugUtils.currentLine=4849755;
 //BA.debugLineNum = 4849755;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static int  _cint(Object _o) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "cint", false))
	 {return ((Integer) Debug.delegate(ba, "cint", new Object[] {_o}));}
String _ox = "";
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="public Sub CInt(o As Object) As Int";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Try";
try {RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim ox As String = o";
_ox = BA.ObjectToString(_o);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="ox = GetNumbers(ox)";
_ox = _getnumbers(_ox);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="If ox = \"\" Then ox = \"0\"";
if ((_ox).equals("")) { 
_ox = "0";};
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Return Floor(ox)";
if (true) return (int) (anywheresoftware.b4a.keywords.Common.Floor((double)(Double.parseDouble(_ox))));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Return 0";
if (true) return (int) (0);
 };
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="End Sub";
return 0;
}
public static long  _clng(Object _o) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "clng", false))
	 {return ((Long) Debug.delegate(ba, "clng", new Object[] {_o}));}
String _ox = "";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="public Sub CLng(o As Object) As Long";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Try";
try {RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim ox As String = o";
_ox = BA.ObjectToString(_o);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="ox = GetNumbers(ox)";
_ox = _getnumbers(_ox);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="If ox = \"\" Then ox = \"0\"";
if ((_ox).equals("")) { 
_ox = "0";};
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Return Floor(ox)";
if (true) return (long) (anywheresoftware.b4a.keywords.Common.Floor((double)(Double.parseDouble(_ox))));
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="Return 0";
if (true) return (long) (0);
 };
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="End Sub";
return 0L;
}
public static String  _convertmillisecondstostring(long _t) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "convertmillisecondstostring", false))
	 {return ((String) Debug.delegate(ba, "convertmillisecondstostring", new Object[] {_t}));}
int _hours = 0;
int _minutes = 0;
int _seconds = 0;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub ConvertMillisecondsToString(t As Long) As Stri";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim hours, minutes, seconds As Int";
_hours = 0;
_minutes = 0;
_seconds = 0;
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="hours = t / DateTime.TicksPerHour";
_hours = (int) (_t/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="minutes = (t Mod DateTime.TicksPerHour) / DateTim";
_minutes = (int) ((_t%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerHour)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute);
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="seconds = (t Mod DateTime.TicksPerMinute) / DateT";
_seconds = (int) ((_t%anywheresoftware.b4a.keywords.Common.DateTime.TicksPerMinute)/(double)anywheresoftware.b4a.keywords.Common.DateTime.TicksPerSecond);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Return $\"$1.0{hours}:$2.0{minutes}:$2.0{seconds}\"";
if (true) return (""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_hours))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("2.0",(Object)(_minutes))+":"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("2.0",(Object)(_seconds))+"");
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="End Sub";
return "";
}
public static Object  _copyobject(Object _o) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "copyobject", false))
	 {return ((Object) Debug.delegate(ba, "copyobject", new Object[] {_o}));}
anywheresoftware.b4a.randomaccessfile.B4XSerializator _s = null;
RDebugUtils.currentLine=255066112;
 //BA.debugLineNum = 255066112;BA.debugLine="Sub CopyObject(o As Object) As Object";
RDebugUtils.currentLine=255066113;
 //BA.debugLineNum = 255066113;BA.debugLine="Dim s As B4XSerializator";
_s = new anywheresoftware.b4a.randomaccessfile.B4XSerializator();
RDebugUtils.currentLine=255066114;
 //BA.debugLineNum = 255066114;BA.debugLine="Return s.ConvertBytesToObject(s.ConvertObjectToBy";
if (true) return _s.ConvertBytesToObject(_s.ConvertObjectToBytes(_o));
RDebugUtils.currentLine=255066115;
 //BA.debugLineNum = 255066115;BA.debugLine="End Sub";
return null;
}
public static String  _cstr(Object _o) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "cstr", false))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="public Sub CStr(o As Object) As String";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="End Sub";
return "";
}
public static String  _detectos() throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "detectos", false))
	 {return ((String) Debug.delegate(ba, "detectos", null));}
String _os = "";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="private Sub DetectOS As String";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim os As String = GetSystemProperty(\"os.name\", \"";
_os = anywheresoftware.b4a.keywords.Common.GetSystemProperty("os.name","").toLowerCase();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="If os.Contains(\"win\") Then";
if (_os.contains("win")) { 
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Return \"windows\"";
if (true) return "windows";
 }else 
{RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Else If os.Contains(\"mac\") Then";
if (_os.contains("mac")) { 
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Return \"mac\"";
if (true) return "mac";
 }else {
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Return \"linux\"";
if (true) return "linux";
 }}
;
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="End Sub";
return "";
}
public static String  _eliminarduplicadostablasqlite(anywheresoftware.b4j.objects.SQL _msql,String _nombretabla) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "eliminarduplicadostablasqlite", false))
	 {return ((String) Debug.delegate(ba, "eliminarduplicadostablasqlite", new Object[] {_msql,_nombretabla}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub EliminarDuplicadosTablaSQLite(mSQL As SQL,Nomb";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="mSQL.ExecNonQuery($\" delete from ${NombreTabla} w";
_msql.ExecNonQuery(("\n"+"delete from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nombretabla))+" where RowID in\n"+"(Select RowID from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nombretabla))+"\n"+"where EXISTS\n"+"(Select 1 from "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nombretabla))+" t2\n"+"where "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nombretabla))+".NumTarifa=t2.NumTarifa\n"+"And "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nombretabla))+".ROWID>t2.ROWID))"));
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviaremailsolicitudpermisoobjetoapp(String _objeto) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "enviaremailsolicitudpermisoobjetoapp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviaremailsolicitudpermisoobjetoapp", new Object[] {_objeto}));}
ResumableSub_EnviarEmailSolicitudPermisoObjetoApp rsub = new ResumableSub_EnviarEmailSolicitudPermisoObjetoApp(null,_objeto);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnviarEmailSolicitudPermisoObjetoApp extends BA.ResumableSub {
public ResumableSub_EnviarEmailSolicitudPermisoObjetoApp(b4j.docU.utilidades parent,String _objeto) {
this.parent = parent;
this._objeto = _objeto;
}
b4j.docU.utilidades parent;
String _objeto;
anywheresoftware.b4a.net.SMTPWrapper _smtp = null;
Object _sendemail = null;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim SMTP As SMTP";
_smtp = new anywheresoftware.b4a.net.SMTPWrapper();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="SMTP.Initialize(Main.DatosConfiguracionAplicacion";
_smtp.Initialize(parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .ServidorEnvioEmail /*String*/ ,parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .PuertoEnvioEmail /*int*/ ,parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .DireccionEnvioEmail /*String*/ ,parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .PasswordEnvioEmail /*String*/ ,"SMTP");
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="SMTP.StartTLSMode = True";
_smtp.setStartTLSMode(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="SMTP.UseSSL = True 'Gmail requires SSL.";
_smtp.setUseSSL(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="If Main.DatosConfiguracionAplicacion.EmailDesarro";
if (true) break;

case 1:
//if
this.state = 19;
if ((parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .EmailDesarrollador1 /*String*/ ).equals("") == false || (parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .EmailDesarrollador2 /*String*/ ).equals("") == false) { 
this.state = 3;
}else {
this.state = 18;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="If Main.DatosConfiguracionAplicacion.EmailDesarr";
if (true) break;

case 4:
//if
this.state = 7;
if ((parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .EmailDesarrollador1 /*String*/ ).equals("") == false) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="SMTP.To.Add(Main.DatosConfiguracionAplicacion.E";
_smtp.getTo().Add((Object)(parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .EmailDesarrollador1 /*String*/ ));
 if (true) break;
;
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="If Main.DatosConfiguracionAplicacion.EmailDesarr";

case 7:
//if
this.state = 10;
if ((parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .EmailDesarrollador2 /*String*/ ).equals("") == false) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=4915212;
 //BA.debugLineNum = 4915212;BA.debugLine="SMTP.To.Add(Main.DatosConfiguracionAplicacion.E";
_smtp.getTo().Add((Object)(parent._main._datosconfiguracionaplicacion /*b4j.docU.main._datosconfiguracionaplicacion*/ .EmailDesarrollador2 /*String*/ ));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=4915215;
 //BA.debugLineNum = 4915215;BA.debugLine="SMTP.Subject = \"Solicitud permiso Usuario \" & Ma";
_smtp.setSubject("Solicitud permiso Usuario "+parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ +" aplicación: "+parent._main._nombreaplicacion /*String*/ +" modulo: "+_objeto);
RDebugUtils.currentLine=4915216;
 //BA.debugLineNum = 4915216;BA.debugLine="SMTP.Body = $\" 		Aplicación ${Main.NombreAplicac";
_smtp.setBody(("\n"+"		Aplicación "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._main._nombreaplicacion /*String*/ ))+"\n"+"		\n"+"		Versión "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._main._version /*String*/ ))+"\n"+"		\n"+"		Dispositivo"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .Dispositivo /*String*/ ))+"\n"+"		\n"+"		NombreUsuarioWindows"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(parent._main._datosusuario /*b4j.docU.main._datosusuario*/ .NombreUsuarioWindows /*String*/ ))+"\n"+"		\n"+"		Modulo "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_objeto))+"}\n"+"		"));
RDebugUtils.currentLine=4915228;
 //BA.debugLineNum = 4915228;BA.debugLine="Dim SendEmail As Object =SMTP.Send";
_sendemail = _smtp.Send(ba);
RDebugUtils.currentLine=4915229;
 //BA.debugLineNum = 4915229;BA.debugLine="Wait For (SendEmail) SMTP_MessageSent(Success As";
anywheresoftware.b4a.keywords.Common.WaitFor("smtp_messagesent", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "enviaremailsolicitudpermisoobjetoapp"), _sendemail);
this.state = 20;
return;
case 20:
//C
this.state = 11;
_success = (boolean) result[0];
;
RDebugUtils.currentLine=4915230;
 //BA.debugLineNum = 4915230;BA.debugLine="If Success Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_success) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=4915232;
 //BA.debugLineNum = 4915232;BA.debugLine="Log(\"Error enviando email solicitud permiso\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84915232","Error enviando email solicitud permiso",0);
 if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
 if (true) break;

case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=4915238;
 //BA.debugLineNum = 4915238;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviarmensajehttppa(String _senderaccount,String _toaccounts,String _ccaccounts,String _ccoaccounts,String _subject,String _body) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "enviarmensajehttppa", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviarmensajehttppa", new Object[] {_senderaccount,_toaccounts,_ccaccounts,_ccoaccounts,_subject,_body}));}
ResumableSub_EnviarMensajeHttpPA rsub = new ResumableSub_EnviarMensajeHttpPA(null,_senderaccount,_toaccounts,_ccaccounts,_ccoaccounts,_subject,_body);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnviarMensajeHttpPA extends BA.ResumableSub {
public ResumableSub_EnviarMensajeHttpPA(b4j.docU.utilidades parent,String _senderaccount,String _toaccounts,String _ccaccounts,String _ccoaccounts,String _subject,String _body) {
this.parent = parent;
this._senderaccount = _senderaccount;
this._toaccounts = _toaccounts;
this._ccaccounts = _ccaccounts;
this._ccoaccounts = _ccoaccounts;
this._subject = _subject;
this._body = _body;
}
b4j.docU.utilidades parent;
String _senderaccount;
String _toaccounts;
String _ccaccounts;
String _ccoaccounts;
String _subject;
String _body;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mdata0 = null;
String _link = "";
anywheresoftware.b4a.objects.collections.Map _mdata = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jgen = null;
String _sjson = "";
b4j.docU.httpjob _job = null;
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Wait For(CargaDatosConfiguracionHttpRequestEnvioC";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "enviarmensajehttppa"), _cargadatosconfiguracionhttprequestenviocorreodesdebuzoncompartido());
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Return \"ERROR\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("ERROR"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Dim mData0 As Map=mRes.Get(\"mData0\")";
_mdata0 = new anywheresoftware.b4a.objects.collections.Map();
_mdata0 = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mres.Get((Object)("mData0"))));
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Dim Link As String=mData0.Get(\"Link\")";
_link = BA.ObjectToString(_mdata0.Get((Object)("Link")));
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="Dim mData As Map";
_mdata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="mData.Initialize";
_mdata.Initialize();
RDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="mData.Put(\"Remitente\",SenderAccount)";
_mdata.Put((Object)("Remitente"),(Object)(_senderaccount));
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="mData.Put(\"Destinatario\",ToAccounts)";
_mdata.Put((Object)("Destinatario"),(Object)(_toaccounts));
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="mData.Put(\"CC\",CCAccounts)";
_mdata.Put((Object)("CC"),(Object)(_ccaccounts));
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="mData.Put(\"CCO\",CCOAccounts)";
_mdata.Put((Object)("CCO"),(Object)(_ccoaccounts));
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="mData.Put(\"Asunto\",Subject)";
_mdata.Put((Object)("Asunto"),(Object)(_subject));
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="mData.Put(\"CuerpoMensaje\",Body)";
_mdata.Put((Object)("CuerpoMensaje"),(Object)(_body));
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="Dim jGEn As JSONGenerator";
_jgen = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="jGEn.Initialize(mData)";
_jgen.Initialize(_mdata);
RDebugUtils.currentLine=7208982;
 //BA.debugLineNum = 7208982;BA.debugLine="Dim sJSON As String=jGEn.ToString";
_sjson = _jgen.ToString();
RDebugUtils.currentLine=7208984;
 //BA.debugLineNum = 7208984;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=7208985;
 //BA.debugLineNum = 7208985;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",utilidades.getObject());
RDebugUtils.currentLine=7208987;
 //BA.debugLineNum = 7208987;BA.debugLine="job.PostString(Link,sJSON)";
_job._poststring /*String*/ (null,_link,_sjson);
RDebugUtils.currentLine=7208988;
 //BA.debugLineNum = 7208988;BA.debugLine="job.GetRequest.SetContentType(\"application/JSON\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/JSON");
RDebugUtils.currentLine=7208990;
 //BA.debugLineNum = 7208990;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "enviarmensajehttppa"), (Object)(_job));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=7208992;
 //BA.debugLineNum = 7208992;BA.debugLine="If j.Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=7208993;
 //BA.debugLineNum = 7208993;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
anywheresoftware.b4a.keywords.Common.LogImpl("87208993","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=7208994;
 //BA.debugLineNum = 7208994;BA.debugLine="Log(j.GetString)";
anywheresoftware.b4a.keywords.Common.LogImpl("87208994",_j._getstring /*String*/ (null),0);
RDebugUtils.currentLine=7208995;
 //BA.debugLineNum = 7208995;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=7208996;
 //BA.debugLineNum = 7208996;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7208997;
 //BA.debugLineNum = 7208997;BA.debugLine="Return sRespuestaWebService";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=7209000;
 //BA.debugLineNum = 7209000;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=7209001;
 //BA.debugLineNum = 7209001;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7209002;
 //BA.debugLineNum = 7209002;BA.debugLine="Return sErrorJobResponse";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=7209004;
 //BA.debugLineNum = 7209004;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _escapefield(String _f) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "escapefield", false))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return \"[\" & f & \"]\"";
if (true) return "["+_f+"]";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return "";
}
public static boolean  _esdouble(String _s) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "esdouble", false))
	 {return ((Boolean) Debug.delegate(ba, "esdouble", new Object[] {_s}));}
double _numdouble = 0;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub EsDouble(s As String) As Boolean";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="If IsNumber(s)=False Then Return False";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_s)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="s=asJO(Me).RunMethod(\"TextoSinNotacionCientifica\"";
_s = BA.ObjectToString(_asjo((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(utilidades.getObject()))).RunMethod("TextoSinNotacionCientifica",new Object[]{(Object)(_s)}));
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="If EsFraccional(s) Then";
if (_esfraccional(_s)) { 
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Try";
try {RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Dim NumDouble As Double=s";
_numdouble = (double)(Double.parseDouble(_s));
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=5373960;
 //BA.debugLineNum = 5373960;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("85373960",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 }else {
RDebugUtils.currentLine=5373964;
 //BA.debugLineNum = 5373964;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="End Sub";
return false;
}
public static boolean  _esfraccional(String _s) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "esfraccional", false))
	 {return ((Boolean) Debug.delegate(ba, "esfraccional", new Object[] {_s}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub EsFraccional(s As String) As Boolean";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Return IsNumber(s) And Regex.IsMatch(\"^-?(0|[1-9]";
if (true) return anywheresoftware.b4a.keywords.Common.IsNumber(_s) && anywheresoftware.b4a.keywords.Common.Regex.IsMatch("^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$",_s);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return false;
}
public static boolean  _esfloat(String _s) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "esfloat", false))
	 {return ((Boolean) Debug.delegate(ba, "esfloat", new Object[] {_s}));}
float _numdouble = 0f;
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub EsFloat(s As String) As Boolean";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If IsNumber(s)=False Then Return False";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_s)==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="s=asJO(Me).RunMethod(\"TextoSinNotacionCientifica\"";
_s = BA.ObjectToString(_asjo((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(utilidades.getObject()))).RunMethod("TextoSinNotacionCientifica",new Object[]{(Object)(_s)}));
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="If EsFraccional(s) Then";
if (_esfraccional(_s)) { 
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Try";
try {RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Dim NumDouble As Float=s";
_numdouble = (float)(Double.parseDouble(_s));
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("85439497",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 }else {
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="End Sub";
return false;
}
public static boolean  _esinteger(String _s) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "esinteger", false))
	 {return ((Boolean) Debug.delegate(ba, "esinteger", new Object[] {_s}));}
int _sint = 0;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub EsInteger(s As String) As Boolean";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="If IsNumber(s) And Regex.IsMatch(\"^-?(0|[1-9]\\d*)";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_s) && anywheresoftware.b4a.keywords.Common.Regex.IsMatch("^-?(0|[1-9]\\d*)$",_s)) { 
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Try";
try {RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Dim sInt As Int=s";
_sint = (int)(Double.parseDouble(_s));
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("85242886",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 }else {
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="End Sub";
return false;
}
public static boolean  _eslong(String _s) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "eslong", false))
	 {return ((Boolean) Debug.delegate(ba, "eslong", new Object[] {_s}));}
long _numlong = 0L;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub EsLong(s As String) As Boolean";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If EsInteger(s) Then";
if (_esinteger(_s)) { 
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Try";
try {RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim Numlong As Long=s";
_numlong = (long)(Double.parseDouble(_s));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e6) {
			ba.setLastException(e6);RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("85505030",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 }else {
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="End Sub";
return false;
}
public static boolean  _fileexistdirassets(String _filename) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "fileexistdirassets", false))
	 {return ((Boolean) Debug.delegate(ba, "fileexistdirassets", new Object[] {_filename}));}
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub FileExistDirAssets(FileName As String)";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="r.Target = Me";
_r.Target = utilidades.getObject();
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="r.Target = r.RunMethod(\"getClass\")";
_r.Target = _r.RunMethod("getClass");
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Dim In As InputStream = r.RunMethod2(\"getResource";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = (anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper(), (java.io.InputStream)(_r.RunMethod2("getResourceAsStream","/Files/"+_filename,"java.lang.String")));
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="If In.IsInitialized = False Then Return False";
if (_in.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="In.Close";
_in.Close();
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="End Sub";
return false;
}
public static long  _findnexttime(anywheresoftware.b4a.objects.collections.List _times) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "findnexttime", false))
	 {return ((Long) Debug.delegate(ba, "findnexttime", new Object[] {_times}));}
double _st = 0;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub FindNextTime(Times As List) As Long";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Times.Sort(True)";
_times.Sort(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="For Each st As Double In Times";
{
final anywheresoftware.b4a.BA.IterableList group2 = _times;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_st = (double)(BA.ObjectToNumber(group2.Get(index2)));
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="If SetHours(st) > DateTime.Now Then";
if (_sethours(_st)>anywheresoftware.b4a.keywords.Common.DateTime.getNow()) { 
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Return SetHours(st)";
if (true) return _sethours(_st);
 };
 }
};
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Return DateTime.Add(SetHours(Times.Get(0)), 0, 0,";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Add(_sethours((double)(BA.ObjectToNumber(_times.Get((int) (0))))),(int) (0),(int) (0),(int) (1));
RDebugUtils.currentLine=7340040;
 //BA.debugLineNum = 7340040;BA.debugLine="End Sub";
return 0L;
}
public static long  _sethours(double _st) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "sethours", false))
	 {return ((Long) Debug.delegate(ba, "sethours", new Object[] {_st}));}
int _hours = 0;
int _minutes = 0;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub SetHours(st As Double) As Long";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim hours As Int = Floor(st)";
_hours = (int) (anywheresoftware.b4a.keywords.Common.Floor(_st));
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Dim minutes As Int = Round(60 * (st - hours))";
_minutes = (int) (anywheresoftware.b4a.keywords.Common.Round(60*(_st-_hours)));
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Return DateUtils.SetDateAndTime(DateTime.GetYear(";
if (true) return _dateutils._setdateandtime(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow()),anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()),anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()),_hours,_minutes,(int) (0));
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="End Sub";
return 0L;
}
public static String  _fixnull(Object _sobj) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "fixnull", false))
	 {return ((String) Debug.delegate(ba, "fixnull", new Object[] {_sobj}));}
String _svalue = "";
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="public Sub FixNull(sObj As Object) As String";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim sValue As String";
_svalue = "";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="sValue = \"\"";
_svalue = "";
 }else {
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="sValue = CStr(sObj)";
_svalue = _cstr(_sobj);
 };
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="sValue = sValue.Replace(\"NULL\",\"\").Replace(\"null\"";
_svalue = _svalue.replace("NULL","").replace("null","");
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Return sValue";
if (true) return _svalue;
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="End Sub";
return "";
}
public static double  _fixnulldouble(Object _sobj) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "fixnulldouble", false))
	 {return ((Double) Debug.delegate(ba, "fixnulldouble", new Object[] {_sobj}));}
double _dvalue = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="public Sub FixNullDouble(sObj As Object) As Double";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim dValue As Double";
_dvalue = 0;
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="dValue = 0";
_dvalue = 0;
 }else {
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="dValue = CDbl(sObj)";
_dvalue = _cdbl(_sobj);
 };
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="Return dValue";
if (true) return _dvalue;
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="End Sub";
return 0;
}
public static int  _fixnullint(Object _sobj) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "fixnullint", false))
	 {return ((Integer) Debug.delegate(ba, "fixnullint", new Object[] {_sobj}));}
int _dvalue = 0;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="public Sub FixNullInt(sObj As Object) As Int";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim dValue As Int";
_dvalue = 0;
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="dValue = 0";
_dvalue = (int) (0);
 }else {
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="dValue = CInt(sObj)";
_dvalue = _cint(_sobj);
 };
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Return dValue";
if (true) return _dvalue;
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="End Sub";
return 0;
}
public static long  _fixnulllong(Object _sobj) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "fixnulllong", false))
	 {return ((Long) Debug.delegate(ba, "fixnulllong", new Object[] {_sobj}));}
long _dvalue = 0L;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="public Sub FixNullLong(sObj As Object) As Long";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim dValue As Long";
_dvalue = 0L;
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="If sObj = Null Then";
if (_sobj== null) { 
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="dValue = 0";
_dvalue = (long) (0);
 }else {
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="dValue = CLng(sObj)";
_dvalue = _clng(_sobj);
 };
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Return dValue";
if (true) return _dvalue;
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="End Sub";
return 0L;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _fontawesometobitmap(String _text,float _fontsize,int _color) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "fontawesometobitmap", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "fontawesometobitmap", new Object[] {_text,_fontsize,_color}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub FontAwesomeToBitmap (Text As String, FontSize";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim p As Pane = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_xui.CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, FontSize+2dip, FontS";
_p.SetLayoutAnimated((int) (0),0,0,_fontsize+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),_fontsize+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)));
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())));
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Dim fnt As B4XFont = xui.CreateFontAwesome(FontSi";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = _xui.CreateFontAwesome(_fontsize);
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="cvs1.DrawText(Text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(_text,_cvs1.getTargetRect().getCenterX(),_baseline,_fnt,_color,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="cvs1.Release";
_cvs1.Release();
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="End Sub";
return null;
}
public static String  _formatonumerico(double _numero,int _minintegers,int _maxfracciones) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "formatonumerico", false))
	 {return ((String) Debug.delegate(ba, "formatonumerico", new Object[] {_numero,_minintegers,_maxfracciones}));}
b4j.docU.b4xformatter _formatter = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub FormatoNumerico(Numero As Double, MinIn";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim formatter As B4XFormatter";
_formatter = new b4j.docU.b4xformatter();
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="formatter.Initialize";
_formatter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="formatter.GetDefaultFormat.MinimumIntegers = MinI";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = _minintegers;
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="formatter.GetDefaultFormat.MaximumFractions = Max";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = _maxfracciones;
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="formatter.GetDefaultFormat.DecimalPoint=\",\"";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).DecimalPoint /*String*/  = ",";
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Return formatter.Format(Numero)";
if (true) return _formatter._format /*String*/ (null,_numero);
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="End Sub";
return "";
}
public static String  _formatonumerico2(double _numero,int _minintegers,int _maxfracciones,int _minfracciones,boolean _usaragrupacion) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "formatonumerico2", false))
	 {return ((String) Debug.delegate(ba, "formatonumerico2", new Object[] {_numero,_minintegers,_maxfracciones,_minfracciones,_usaragrupacion}));}
b4j.docU.b4xformatter _formatter = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub FormatoNumerico2(Numero As Double, MinI";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim formatter As B4XFormatter";
_formatter = new b4j.docU.b4xformatter();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="formatter.Initialize";
_formatter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="formatter.GetDefaultFormat.MinimumIntegers = MinI";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = _minintegers;
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="formatter.GetDefaultFormat.MaximumFractions = Max";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = _maxfracciones;
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="formatter.GetDefaultFormat.MinimumFractions = Min";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MinimumFractions /*int*/  = _minfracciones;
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="formatter.GetDefaultFormat.DecimalPoint=\",\"";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).DecimalPoint /*String*/  = ",";
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="If UsarAgrupacion Then";
if (_usaragrupacion) { 
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\".\"";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = ".";
 }else {
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\"\"";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = "";
 };
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="Return formatter.Format(Numero)";
if (true) return _formatter._format /*String*/ (null,_numero);
RDebugUtils.currentLine=3801101;
 //BA.debugLineNum = 3801101;BA.debugLine="End Sub";
return "";
}
public static String  _formatonumerico3(double _numero,int _minintegers,int _maxfracciones,int _minfracciones,boolean _usaragrupacion,String _prefijo,String _sufijo) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "formatonumerico3", false))
	 {return ((String) Debug.delegate(ba, "formatonumerico3", new Object[] {_numero,_minintegers,_maxfracciones,_minfracciones,_usaragrupacion,_prefijo,_sufijo}));}
b4j.docU.b4xformatter _formatter = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub FormatoNumerico3(Numero As Double, MinI";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim formatter As B4XFormatter";
_formatter = new b4j.docU.b4xformatter();
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="formatter.Initialize";
_formatter._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="formatter.GetDefaultFormat.MinimumIntegers = MinI";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MinimumIntegers /*int*/  = _minintegers;
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="formatter.GetDefaultFormat.MaximumFractions = Max";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MaximumFractions /*int*/  = _maxfracciones;
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="formatter.GetDefaultFormat.MinimumFractions = Min";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).MinimumFractions /*int*/  = _minfracciones;
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="formatter.GetDefaultFormat.DecimalPoint=\",\"";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).DecimalPoint /*String*/  = ",";
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="If UsarAgrupacion Then";
if (_usaragrupacion) { 
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\".\"";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = ".";
 }else {
RDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="formatter.GetDefaultFormat.GroupingCharacter=\"\"";
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).GroupingCharacter /*String*/  = "";
 };
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="If Prefijo<>\"\" Then formatter.GetDefaultFormat.Pr";
if ((_prefijo).equals("") == false) { 
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).Prefix /*String*/  = _prefijo;};
RDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="If Sufijo<>\"\" Then formatter.GetDefaultFormat.Pos";
if ((_sufijo).equals("") == false) { 
_formatter._getdefaultformat /*b4j.docU.b4xformatter._b4xformatdata*/ (null).Postfix /*String*/  = _sufijo;};
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="Return formatter.Format(Numero)";
if (true) return _formatter._format /*String*/ (null,_numero);
RDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="End Sub";
return "";
}
public static String  _generaruuidv4() throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "generaruuidv4", false))
	 {return ((String) Debug.delegate(ba, "generaruuidv4", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _stp = 0;
int _n = 0;
int _c = 0;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="public Sub GenerarUUIDv4 As String";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="For Each stp As Int In Array(8, 4, 4, 4, 12)";
{
final Object[] group3 = new Object[]{(Object)(8),(Object)(4),(Object)(4),(Object)(4),(Object)(12)};
final int groupLen3 = group3.length
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stp = (int)(BA.ObjectToNumber(group3[index3]));
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="If sb.Length > 0 Then sb.Append(\"-\")";
if (_sb.getLength()>0) { 
_sb.Append("-");};
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="For n = 1 To stp";
{
final int step5 = 1;
final int limit5 = _stp;
_n = (int) (1) ;
for (;_n <= limit5 ;_n = _n + step5 ) {
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="Dim c As Int = Rnd(0, 16)";
_c = anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (16));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="If c < 10 Then c = c + 48 Else c = c + 55";
if (_c<10) { 
_c = (int) (_c+48);}
else {
_c = (int) (_c+55);};
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="If sb.Length = 19 Then c = Asc(\"8\")";
if (_sb.getLength()==19) { 
_c = anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar("8"));};
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="If sb.Length = 14 Then c = Asc(\"4\")";
if (_sb.getLength()==14) { 
_c = anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar("4"));};
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="sb.Append(Chr(c))";
_sb.Append(BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_c)));
 }
};
 }
};
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="Return sb.ToString.ToLowerCase";
if (true) return _sb.ToString().toLowerCase();
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="End Sub";
return "";
}
public static String  _get_hash(String _text,String _algorithm) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "get_hash", false))
	 {return ((String) Debug.delegate(ba, "get_hash", new Object[] {_text,_algorithm}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper _md = null;
byte[] _data = null;
byte[] _encrypted = null;
String _res = "";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Get_Hash(Text As String, algorithm As String)";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Dim md As MessageDigest";
_md = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper();
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Dim encrypted() As Byte";
_encrypted = new byte[(int) (0)];
;
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="data = bc.StringToBytes(Text, \"UTF-8\")";
_data = _bc.StringToBytes(_text,"UTF-8");
RDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="encrypted = md.GetMessageDigest(data, algorithm)";
_encrypted = _md.GetMessageDigest(_data,_algorithm);
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Dim res As String = bc.HexFromBytes(encrypted)";
_res = _bc.HexFromBytes(_encrypted);
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="Return (res)";
if (true) return (_res);
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="End Sub";
return "";
}
public static String  _getfiletype(String _filepath) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "getfiletype", false))
	 {return ((String) Debug.delegate(ba, "getfiletype", new Object[] {_filepath}));}
anywheresoftware.b4j.object.JavaObject _mediatype = null;
String _filetype = "";
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub GetFileType(FilePath As String) As String";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim MediaType As JavaObject";
_mediatype = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="MediaType.InitializeStatic(\"com.google.common.net";
_mediatype.InitializeStatic("com.google.common.net.MediaType");
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Dim fileType As String = asJO(Me).RunMethod(\"getT";
_filetype = BA.ObjectToString(_asjo((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(utilidades.getObject()))).RunMethod("getType",new Object[]{(Object)(_filepath)}));
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Log(fileType)";
anywheresoftware.b4a.keywords.Common.LogImpl("84128774",_filetype,0);
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="If fileType<>\"null\" Then";
if ((_filetype).equals("null") == false) { 
RDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="If MediaType.RunMethodJO(\"parse\",Array(fileType)";
if (BA.ObjectToBoolean(_mediatype.RunMethodJO("parse",new Object[]{(Object)(_filetype)}).RunMethod("is",new Object[]{_mediatype.GetField("ANY_IMAGE_TYPE")}))) { 
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="Log(\"Image file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84128778","Image file",0);
 }else 
{RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="else if MediaType.RunMethodJO(\"parse\",Array(file";
if (BA.ObjectToBoolean(_mediatype.RunMethodJO("parse",new Object[]{(Object)(_filetype)}).RunMethod("is",new Object[]{_mediatype.GetField("ANY_VIDEO_TYPE")}))) { 
RDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="Log(\"Video file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84128780","Video file",0);
 }else 
{RDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="else if MediaType.RunMethodJO(\"parse\",Array(file";
if (BA.ObjectToBoolean(_mediatype.RunMethodJO("parse",new Object[]{(Object)(_filetype)}).RunMethod("is",new Object[]{_mediatype.GetField("ANY_TEXT_TYPE")}))) { 
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="Log(\"Text file\")";
anywheresoftware.b4a.keywords.Common.LogImpl("84128782","Text file",0);
 }else {
RDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Log(\"File is  : \"&MediaType.RunMethod(\"parse\",A";
anywheresoftware.b4a.keywords.Common.LogImpl("84128784","File is  : "+BA.ObjectToString(_mediatype.RunMethod("parse",new Object[]{(Object)(_filetype)})),0);
 }}}
;
 };
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="Return fileType";
if (true) return _filetype;
RDebugUtils.currentLine=4128788;
 //BA.debugLineNum = 4128788;BA.debugLine="End Sub";
return "";
}
public static byte[]  _getimagebytes(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "getimagebytes", false))
	 {return ((byte[]) Debug.delegate(ba, "getimagebytes", new Object[] {_dir,_filename}));}
byte[] _bytes = null;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub GetImageBytes(Dir As String, Filename As Strin";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim bytes() As Byte = Bit.InputStreamToBytes(File";
_bytes = anywheresoftware.b4a.keywords.Common.Bit.InputStreamToBytes((java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(_dir,_filename).getObject()));
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Return bytes";
if (true) return _bytes;
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="End Sub";
return null;
}
public static String  _getsha1md5string(String _hstring) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "getsha1md5string", false))
	 {return ((String) Debug.delegate(ba, "getsha1md5string", new Object[] {_hstring}));}
anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper _md = null;
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bytecon = null;
byte[] _passwordhash = null;
byte[] _passwordhash2 = null;
String _md5string = "";
String _sha1string = "";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub GetSHA1MD5String(hString As String) As String";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="Dim md As MessageDigest";
_md = new anywheresoftware.b4a.agraham.encryption.CipherWrapper.MessageDigestWrapper();
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Dim ByteCon As ByteConverter";
_bytecon = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Dim passwordhash() As Byte";
_passwordhash = new byte[(int) (0)];
;
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="Dim passwordhash2() As Byte";
_passwordhash2 = new byte[(int) (0)];
;
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="passwordhash = md.GetMessageDigest(hString.GetByt";
_passwordhash = _md.GetMessageDigest(_hstring.getBytes("UTF8"),"MD5");
RDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="Dim md5string As String";
_md5string = "";
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="md5string = ByteCon.HexFromBytes(passwordhash)";
_md5string = _bytecon.HexFromBytes(_passwordhash);
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="md5string = md5string.ToLowerCase";
_md5string = _md5string.toLowerCase();
RDebugUtils.currentLine=6225930;
 //BA.debugLineNum = 6225930;BA.debugLine="Log(md5string)";
anywheresoftware.b4a.keywords.Common.LogImpl("86225930",_md5string,0);
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="passwordhash2 = md.GetMessageDigest(md5string.Get";
_passwordhash2 = _md.GetMessageDigest(_md5string.getBytes("UTF8"),"SHA-1");
RDebugUtils.currentLine=6225932;
 //BA.debugLineNum = 6225932;BA.debugLine="Dim SHA1string As String";
_sha1string = "";
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="SHA1string = ByteCon.HexFromBytes(passwordhash2)";
_sha1string = _bytecon.HexFromBytes(_passwordhash2);
RDebugUtils.currentLine=6225934;
 //BA.debugLineNum = 6225934;BA.debugLine="SHA1string = SHA1string.ToLowerCase";
_sha1string = _sha1string.toLowerCase();
RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="Log(SHA1string)";
anywheresoftware.b4a.keywords.Common.LogImpl("86225935",_sha1string,0);
RDebugUtils.currentLine=6225936;
 //BA.debugLineNum = 6225936;BA.debugLine="Return SHA1string";
if (true) return _sha1string;
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _gettablepragma(anywheresoftware.b4j.objects.SQL _sql,String _tablename) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "gettablepragma", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "gettablepragma", new Object[] {_sql,_tablename}));}
anywheresoftware.b4a.objects.collections.List _lstfields = null;
String _tbquery = "";
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _rs = null;
anywheresoftware.b4a.objects.collections.Map _columnparmsmap = null;
int _i = 0;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub GetTablePragma(SQL As SQL,TableName As String)";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Private lstFields As List";
_lstfields = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="lstFields.Initialize";
_lstfields.Initialize();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Private TBQuery As String";
_tbquery = "";
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="TBQuery = \"PRAGMA table_info(\" & TableName & \")\"";
_tbquery = "PRAGMA table_info("+_tablename+")";
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Dim rs As ResultSet=SQL.ExecQuery(TBQuery)";
_rs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_rs = _sql.ExecQuery(_tbquery);
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Do While rs.NextRow";
while (_rs.NextRow()) {
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="Dim ColumnParmsMap As Map";
_columnparmsmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="ColumnParmsMap.Initialize";
_columnparmsmap.Initialize();
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="For i=0 To rs.ColumnCount-1";
{
final int step9 = 1;
final int limit9 = (int) (_rs.getColumnCount()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="Log (\"     \" & i & \": \" &  rs.GetColumnName(i)";
anywheresoftware.b4a.keywords.Common.LogImpl("84063243","     "+BA.NumberToString(_i)+": "+_rs.GetColumnName(_i)+"->"+_rs.GetString2(_i),0);
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="ColumnParmsMap.Put(rs.GetColumnName(i), rs.GetS";
_columnparmsmap.Put((Object)(_rs.GetColumnName(_i)),(Object)(_rs.GetString2(_i)));
 }
};
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="lstFields.Add(ColumnParmsMap)";
_lstfields.Add((Object)(_columnparmsmap.getObject()));
 }
;
RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="Return lstFields";
if (true) return _lstfields;
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="End Sub";
return null;
}
public static String  _insertarmapssolocamposcoincidentes(anywheresoftware.b4j.objects.SQL _msql,String _tablename,anywheresoftware.b4a.objects.collections.List _listofmaps) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "insertarmapssolocamposcoincidentes", false))
	 {return ((String) Debug.delegate(ba, "insertarmapssolocamposcoincidentes", new Object[] {_msql,_tablename,_listofmaps}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _lstmapscampostabla = null;
anywheresoftware.b4a.objects.collections.List _lstnombrescampostabla = null;
anywheresoftware.b4a.objects.collections.Map _mcampostabla = null;
String _nombrecampo = "";
int _i1 = 0;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
int _i2 = 0;
String _nombrekey = "";
String _col = "";
Object _value = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub InsertarMapsSoloCamposCoincidentes(mSQL As SQL";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim sb, columns, values As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="If ListOfMaps.Size > 1 And ListOfMaps.Get(0) = Li";
if (_listofmaps.getSize()>1 && (_listofmaps.Get((int) (0))).equals(_listofmaps.Get((int) (1)))) { 
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="LogColor(\"ERROR InsertarMapsSoloCamposCoincident";
anywheresoftware.b4a.keywords.Common.LogImpl("84325380","ERROR InsertarMapsSoloCamposCoincidentes, hay al menos 1 mapa repetido",_xui.Color_Red);
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Dim lstMapsCamposTabla As List=GetTablePragma(mSQ";
_lstmapscampostabla = new anywheresoftware.b4a.objects.collections.List();
_lstmapscampostabla = _gettablepragma(_msql,_tablename);
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="Dim lstNombresCamposTabla As List";
_lstnombrescampostabla = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="lstNombresCamposTabla.Initialize";
_lstnombrescampostabla.Initialize();
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="For Each mCamposTabla As Map In lstMapsCamposTabl";
_mcampostabla = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group9 = _lstmapscampostabla;
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_mcampostabla = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group9.Get(index9)));
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="Dim NombreCampo As String=mCamposTabla.Get(\"name";
_nombrecampo = BA.ObjectToString(_mcampostabla.Get((Object)("name")));
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="lstNombresCamposTabla.Add(NombreCampo)";
_lstnombrescampostabla.Add((Object)(_nombrecampo));
 }
};
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="mSQL.BeginTransaction";
_msql.BeginTransaction();
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="Try";
try {RDebugUtils.currentLine=4325393;
 //BA.debugLineNum = 4325393;BA.debugLine="For i1 = 0 To ListOfMaps.Size - 1";
{
final int step15 = 1;
final int limit15 = (int) (_listofmaps.getSize()-1);
_i1 = (int) (0) ;
for (;_i1 <= limit15 ;_i1 = _i1 + step15 ) {
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4325395;
 //BA.debugLineNum = 4325395;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=4325396;
 //BA.debugLineNum = 4325396;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4325398;
 //BA.debugLineNum = 4325398;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=4325399;
 //BA.debugLineNum = 4325399;BA.debugLine="sb.Append(\"INSERT INTO [\" & TableName & \"] (\")";
_sb.Append("INSERT INTO ["+_tablename+"] (");
RDebugUtils.currentLine=4325400;
 //BA.debugLineNum = 4325400;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4325401;
 //BA.debugLineNum = 4325401;BA.debugLine="m = ListOfMaps.Get(i1)";
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_listofmaps.Get(_i1)));
RDebugUtils.currentLine=4325402;
 //BA.debugLineNum = 4325402;BA.debugLine="For i2 = 0 To m.Size - 1";
{
final int step24 = 1;
final int limit24 = (int) (_m.getSize()-1);
_i2 = (int) (0) ;
for (;_i2 <= limit24 ;_i2 = _i2 + step24 ) {
RDebugUtils.currentLine=4325403;
 //BA.debugLineNum = 4325403;BA.debugLine="Dim NombreKey As String=m.GetKeyAt(i2)";
_nombrekey = BA.ObjectToString(_m.GetKeyAt(_i2));
RDebugUtils.currentLine=4325404;
 //BA.debugLineNum = 4325404;BA.debugLine="If lstNombresCamposTabla.IndexOf(NombreKey)>-1";
if (_lstnombrescampostabla.IndexOf((Object)(_nombrekey))>-1) { 
RDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="Dim col As String";
_col = "";
RDebugUtils.currentLine=4325406;
 //BA.debugLineNum = 4325406;BA.debugLine="Dim value As Object";
_value = new Object();
RDebugUtils.currentLine=4325407;
 //BA.debugLineNum = 4325407;BA.debugLine="col = m.GetKeyAt(i2)";
_col = BA.ObjectToString(_m.GetKeyAt(_i2));
RDebugUtils.currentLine=4325408;
 //BA.debugLineNum = 4325408;BA.debugLine="value = m.GetValueAt(i2)";
_value = _m.GetValueAt(_i2);
RDebugUtils.currentLine=4325409;
 //BA.debugLineNum = 4325409;BA.debugLine="If i2 > 0 And columns.Length>0 Then";
if (_i2>0 && _columns.getLength()>0) { 
RDebugUtils.currentLine=4325410;
 //BA.debugLineNum = 4325410;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=4325411;
 //BA.debugLineNum = 4325411;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=4325413;
 //BA.debugLineNum = 4325413;BA.debugLine="columns.Append(\"[\").Append(col).Append(\"]\")";
_columns.Append("[").Append(_col).Append("]");
RDebugUtils.currentLine=4325414;
 //BA.debugLineNum = 4325414;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
RDebugUtils.currentLine=4325415;
 //BA.debugLineNum = 4325415;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }else {
RDebugUtils.currentLine=4325418;
 //BA.debugLineNum = 4325418;BA.debugLine="LogColor(\"AVISO InsertarMapsSoloCamposCoincid";
anywheresoftware.b4a.keywords.Common.LogImpl("84325418","AVISO InsertarMapsSoloCamposCoincidentes: Campo "+_nombrekey+" no existe en tabla "+_tablename+"...¿error?",_xui.Color_Magenta);
 };
 }
};
RDebugUtils.currentLine=4325422;
 //BA.debugLineNum = 4325422;BA.debugLine="sb.Append(columns.ToString).Append(\") VALUES (\"";
_sb.Append(_columns.ToString()).Append(") VALUES (").Append(_values.ToString()).Append(")");
RDebugUtils.currentLine=4325423;
 //BA.debugLineNum = 4325423;BA.debugLine="If i1 = 0 Then Log(\"InsertMaps (first query out";
if (_i1==0) { 
anywheresoftware.b4a.keywords.Common.LogImpl("84325423","InsertMaps (first query out of "+BA.NumberToString(_listofmaps.getSize())+"): "+_sb.ToString(),0);};
RDebugUtils.currentLine=4325424;
 //BA.debugLineNum = 4325424;BA.debugLine="mSQL.ExecNonQuery2(sb.ToString, listOfValues)";
_msql.ExecNonQuery2(_sb.ToString(),_listofvalues);
 }
};
RDebugUtils.currentLine=4325426;
 //BA.debugLineNum = 4325426;BA.debugLine="mSQL.TransactionSuccessful";
_msql.TransactionSuccessful();
 } 
       catch (Exception e48) {
			ba.setLastException(e48);RDebugUtils.currentLine=4325429;
 //BA.debugLineNum = 4325429;BA.debugLine="LogColor(\"ERROR InsertarMapsSoloCamposCoincident";
anywheresoftware.b4a.keywords.Common.LogImpl("84325429","ERROR InsertarMapsSoloCamposCoincidentes "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),_xui.Color_Red);
RDebugUtils.currentLine=4325430;
 //BA.debugLineNum = 4325430;BA.debugLine="mSQL.Rollback";
_msql.Rollback();
 };
RDebugUtils.currentLine=4325432;
 //BA.debugLineNum = 4325432;BA.debugLine="End Sub";
return "";
}
public static boolean  _iscellinternaldateformatted(anywheresoftware.b4j.objects.PoiCellWrapper _cell) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "iscellinternaldateformatted", false))
	 {return ((Boolean) Debug.delegate(ba, "iscellinternaldateformatted", new Object[] {_cell}));}
anywheresoftware.b4j.object.JavaObject _jodateformated = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub isCellInternalDateFormatted(Cell As PoiCell) A";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim JODateFormated As JavaObject";
_jodateformated = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="JODateFormated.InitializeStatic(\"org.apache.poi.s";
_jodateformated.InitializeStatic("org.apache.poi.ss.usermodel.DateUtil");
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Return JODateFormated.RunMethod(\"isCellInternalDa";
if (true) return BA.ObjectToBoolean(_jodateformated.RunMethod("isCellInternalDateFormatted",new Object[]{(Object)(_cell.getObject())}));
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="End Sub";
return false;
}
public static int  _isogetweekofyear(long _ticks) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "isogetweekofyear", false))
	 {return ((Integer) Debug.delegate(ba, "isogetweekofyear", new Object[] {_ticks}));}
int _offset = 0;
long _firstday = 0L;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub isoGetWeekOfYear(ticks As Long) As Int";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim offset As Int =  0";
_offset = (int) (0);
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim FirstDay As Long  = DateUtils.SetDate(DateTim";
_firstday = _dateutils._setdate(anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_ticks),(int) (1),(int) (1));
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="If DateTime.GetDayOfWeek(FirstDay) >5 Then ' is T";
if (anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfWeek(_firstday)>5) { 
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Do While(DateTime.GetDayOfWeek(FirstDay) <> 1) '";
while ((anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfWeek(_firstday)!=1)) {
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="FirstDay=DateTime.Add (FirstDay,0,0,1)";
_firstday = anywheresoftware.b4a.keywords.Common.DateTime.Add(_firstday,(int) (0),(int) (0),(int) (1));
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="offset=offset-1";
_offset = (int) (_offset-1);
 }
;
 }else {
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="Do While(DateTime.GetDayOfWeek(FirstDay) <> 1) '";
while ((anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfWeek(_firstday)!=1)) {
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="FirstDay=DateTime.Add (FirstDay,0,0,-1)";
_firstday = anywheresoftware.b4a.keywords.Common.DateTime.Add(_firstday,(int) (0),(int) (0),(int) (-1));
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="offset=offset+1";
_offset = (int) (_offset+1);
 }
;
 };
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="Return Floor((DateTime.GetDayOfYear(ticks) + offs";
if (true) return (int) (anywheresoftware.b4a.keywords.Common.Floor((anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfYear(_ticks)+_offset)/(double)7)+1);
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _jsontocsv(String _s,boolean _header,String _delimiter) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "jsontocsv", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "jsontocsv", new Object[] {_s,_header,_delimiter}));}
ResumableSub_JSONtoCSV rsub = new ResumableSub_JSONtoCSV(null,_s,_header,_delimiter);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_JSONtoCSV extends BA.ResumableSub {
public ResumableSub_JSONtoCSV(b4j.docU.utilidades parent,String _s,boolean _header,String _delimiter) {
this.parent = parent;
this._s = _s;
this._header = _header;
this._delimiter = _delimiter;
}
b4j.docU.utilidades parent;
String _s;
boolean _header;
String _delimiter;
anywheresoftware.b4j.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _jmap = null;
anywheresoftware.b4a.objects.collections.List _vlist = null;
Object _robj = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.collections.Map _lilwalker = null;
int _i = 0;
String _key = "";
String _v = "";
boolean _fieldhascommas = false;
boolean _fieldhasquote = false;
anywheresoftware.b4a.BA.IterableList group22;
int index22;
int groupLen22;
anywheresoftware.b4a.BA.IterableList group27;
int index27;
int groupLen27;
anywheresoftware.b4a.BA.IterableList group35;
int index35;
int groupLen35;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="utilidades";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim jmap As Map";
_jmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Dim vlist As List";
_vlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="vlist.Initialize";
_vlist.Initialize();
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="json.Initialize(s)";
_json.Initialize(_s);
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("86881289",anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="wait for(MsgBoxXUI(\"Error\",\"Error initializing o";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "jsontocsv"), _msgboxxui("Error","Error initializing our parser..."));
this.state = 56;
return;
case 56:
//C
this.state = 6;
_robj = (Object) result[0];
;
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="Return \"\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(""));return;};
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="Try";

case 6:
//try
this.state = 11;
this.catchState = 0;
this.catchState = 10;
this.state = 8;
if (true) break;

case 8:
//C
this.state = 11;
this.catchState = 10;
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="jmap = json.NextObject";
_jmap = _json.NextObject();
 if (true) break;

case 10:
//C
this.state = 11;
this.catchState = 0;
RDebugUtils.currentLine=6881297;
 //BA.debugLineNum = 6881297;BA.debugLine="Log(LastException.Message)";
anywheresoftware.b4a.keywords.Common.LogImpl("86881297",anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),0);
RDebugUtils.currentLine=6881298;
 //BA.debugLineNum = 6881298;BA.debugLine="wait for(MsgBoxXUI(\"Error\",\"Some problem reading";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "utilidades", "jsontocsv"), _msgboxxui("Error","Some problem reading the json..."));
this.state = 57;
return;
case 57:
//C
this.state = 11;
_robj = (Object) result[0];
;
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="Return \"\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(""));return;};
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
;
RDebugUtils.currentLine=6881302;
 //BA.debugLineNum = 6881302;BA.debugLine="vlist = jmap.Get(\"root\")";
_vlist = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jmap.Get((Object)("root"))));
RDebugUtils.currentLine=6881303;
 //BA.debugLineNum = 6881303;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6881304;
 //BA.debugLineNum = 6881304;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6881308;
 //BA.debugLineNum = 6881308;BA.debugLine="For Each lilwalker As Map In vlist";
if (true) break;

case 12:
//for
this.state = 55;
_lilwalker = new anywheresoftware.b4a.objects.collections.Map();
group22 = _vlist;
index22 = 0;
groupLen22 = group22.getSize();
this.state = 58;
if (true) break;

case 58:
//C
this.state = 55;
if (index22 < groupLen22) {
this.state = 14;
_lilwalker = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group22.Get(index22)));}
if (true) break;

case 59:
//C
this.state = 58;
index22++;
if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=6881309;
 //BA.debugLineNum = 6881309;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6881310;
 //BA.debugLineNum = 6881310;BA.debugLine="If header Then";
if (true) break;

case 15:
//if
this.state = 28;
if (_header) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=6881311;
 //BA.debugLineNum = 6881311;BA.debugLine="header = False";
_header = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6881312;
 //BA.debugLineNum = 6881312;BA.debugLine="i = 0";
_i = (int) (0);
RDebugUtils.currentLine=6881313;
 //BA.debugLineNum = 6881313;BA.debugLine="For Each key As String In lilwalker.Keys";
if (true) break;

case 18:
//for
this.state = 27;
group27 = _lilwalker.Keys();
index27 = 0;
groupLen27 = group27.getSize();
this.state = 60;
if (true) break;

case 60:
//C
this.state = 27;
if (index27 < groupLen27) {
this.state = 20;
_key = BA.ObjectToString(group27.Get(index27));}
if (true) break;

case 61:
//C
this.state = 60;
index27++;
if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=6881314;
 //BA.debugLineNum = 6881314;BA.debugLine="If i > 0 Then sb.Append(delimiter)";
if (true) break;

case 21:
//if
this.state = 26;
if (_i>0) { 
this.state = 23;
;}if (true) break;

case 23:
//C
this.state = 26;
_sb.Append(_delimiter);
if (true) break;

case 26:
//C
this.state = 61;
;
RDebugUtils.currentLine=6881315;
 //BA.debugLineNum = 6881315;BA.debugLine="sb.Append( key )";
_sb.Append(_key);
RDebugUtils.currentLine=6881316;
 //BA.debugLineNum = 6881316;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 if (true) break;
if (true) break;

case 27:
//C
this.state = 28;
;
RDebugUtils.currentLine=6881318;
 //BA.debugLineNum = 6881318;BA.debugLine="sb.Append(CRLF)";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=6881321;
 //BA.debugLineNum = 6881321;BA.debugLine="i = 0";
_i = (int) (0);
RDebugUtils.currentLine=6881322;
 //BA.debugLineNum = 6881322;BA.debugLine="For Each v As String In lilwalker.Values";
if (true) break;

case 29:
//for
this.state = 54;
group35 = _lilwalker.Values();
index35 = 0;
groupLen35 = group35.getSize();
this.state = 62;
if (true) break;

case 62:
//C
this.state = 54;
if (index35 < groupLen35) {
this.state = 31;
_v = BA.ObjectToString(group35.Get(index35));}
if (true) break;

case 63:
//C
this.state = 62;
index35++;
if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=6881323;
 //BA.debugLineNum = 6881323;BA.debugLine="If i > 0 Then sb.Append(delimiter)";
if (true) break;

case 32:
//if
this.state = 37;
if (_i>0) { 
this.state = 34;
;}if (true) break;

case 34:
//C
this.state = 37;
_sb.Append(_delimiter);
if (true) break;

case 37:
//C
this.state = 38;
;
RDebugUtils.currentLine=6881326;
 //BA.debugLineNum = 6881326;BA.debugLine="Dim fieldHasCommas As Boolean = False";
_fieldhascommas = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6881327;
 //BA.debugLineNum = 6881327;BA.debugLine="Dim fieldHasQuote As Boolean = False";
_fieldhasquote = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6881329;
 //BA.debugLineNum = 6881329;BA.debugLine="If v.Contains(delimiter) Then fieldHasCommas =";
if (true) break;

case 38:
//if
this.state = 43;
if (_v.contains(_delimiter)) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
_fieldhascommas = anywheresoftware.b4a.keywords.Common.True;
if (true) break;

case 43:
//C
this.state = 44;
;
RDebugUtils.currentLine=6881330;
 //BA.debugLineNum = 6881330;BA.debugLine="If v.Contains(QUOTE) Then fieldHasQuote = True";
if (true) break;

case 44:
//if
this.state = 49;
if (_v.contains(anywheresoftware.b4a.keywords.Common.QUOTE)) { 
this.state = 46;
;}if (true) break;

case 46:
//C
this.state = 49;
_fieldhasquote = anywheresoftware.b4a.keywords.Common.True;
if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=6881331;
 //BA.debugLineNum = 6881331;BA.debugLine="v = v.Replace(QUOTE, QUOTE & QUOTE)";
_v = _v.replace(anywheresoftware.b4a.keywords.Common.QUOTE,anywheresoftware.b4a.keywords.Common.QUOTE+anywheresoftware.b4a.keywords.Common.QUOTE);
RDebugUtils.currentLine=6881332;
 //BA.debugLineNum = 6881332;BA.debugLine="If fieldHasCommas Or fieldHasQuote Then";
if (true) break;

case 50:
//if
this.state = 53;
if (_fieldhascommas || _fieldhasquote) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=6881333;
 //BA.debugLineNum = 6881333;BA.debugLine="v = QUOTE & v & QUOTE";
_v = anywheresoftware.b4a.keywords.Common.QUOTE+_v+anywheresoftware.b4a.keywords.Common.QUOTE;
 if (true) break;

case 53:
//C
this.state = 63;
;
RDebugUtils.currentLine=6881336;
 //BA.debugLineNum = 6881336;BA.debugLine="sb.Append(v)";
_sb.Append(_v);
RDebugUtils.currentLine=6881337;
 //BA.debugLineNum = 6881337;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 if (true) break;
if (true) break;

case 54:
//C
this.state = 59;
;
RDebugUtils.currentLine=6881339;
 //BA.debugLineNum = 6881339;BA.debugLine="sb.Append(CRLF)";
_sb.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 if (true) break;
if (true) break;

case 55:
//C
this.state = -1;
;
RDebugUtils.currentLine=6881341;
 //BA.debugLineNum = 6881341;BA.debugLine="Return(sb.ToString)";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)((_sb.ToString())));return;};
RDebugUtils.currentLine=6881342;
 //BA.debugLineNum = 6881342;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static String  _logstringcreartabladesdemap(String _tablename,anywheresoftware.b4a.objects.collections.Map _mapprimerregistro,String _primarykey) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "logstringcreartabladesdemap", false))
	 {return ((String) Debug.delegate(ba, "logstringcreartabladesdemap", new Object[] {_tablename,_mapprimerregistro,_primarykey}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
String _field = "";
String _ftype = "";
String _svalor = "";
String _query = "";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub LogStringCrearTablaDesdeMap(TableName A";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="If MapPrimerRegistro.IsInitialized=False Then";
if (_mapprimerregistro.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="LogColor(\"******** Crear Tabla***********\",xui.C";
anywheresoftware.b4a.keywords.Common.LogImpl("85177346","******** Crear Tabla***********",_xui.Color_Blue);
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="LogColor(\"Mapa Registro no inicializado\",xui.Col";
anywheresoftware.b4a.keywords.Common.LogImpl("85177347","Mapa Registro no inicializado",_xui.Color_Blue);
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="LogColor(\"******** Fin Crear Tabla***********\",x";
anywheresoftware.b4a.keywords.Common.LogImpl("85177348","******** Fin Crear Tabla***********",_xui.Color_Blue);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="If MapPrimerRegistro.Size=0 Then";
if (_mapprimerregistro.getSize()==0) { 
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="LogColor(\"******** Crear Tabla***********\",xui.C";
anywheresoftware.b4a.keywords.Common.LogImpl("85177352","******** Crear Tabla***********",_xui.Color_Blue);
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="LogColor(\"Mapa Registro vacío\",xui.Color_Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("85177353","Mapa Registro vacío",_xui.Color_Blue);
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="LogColor(\"******** Fin Crear Tabla***********\",x";
anywheresoftware.b4a.keywords.Common.LogImpl("85177354","******** Fin Crear Tabla***********",_xui.Color_Blue);
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=5177358;
 //BA.debugLineNum = 5177358;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=5177359;
 //BA.debugLineNum = 5177359;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="For i = 0 To MapPrimerRegistro.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mapprimerregistro.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="Dim field, ftype, sValor As String";
_field = "";
_ftype = "";
_svalor = "";
RDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="field = MapPrimerRegistro.GetKeyAt(i)";
_field = BA.ObjectToString(_mapprimerregistro.GetKeyAt(_i));
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="sValor=MapPrimerRegistro.Get(field)";
_svalor = BA.ObjectToString(_mapprimerregistro.Get((Object)(_field)));
RDebugUtils.currentLine=5177364;
 //BA.debugLineNum = 5177364;BA.debugLine="Select True";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.True,_esinteger(_svalor),_eslong(_svalor),_esfraccional(_svalor))) {
case 0: {
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="ftype=DBUtils.DB_INTEGER";
_ftype = _dbutils._db_integer /*String*/ ;
 break; }
case 1: {
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="ftype=DBUtils.DB_INTEGER";
_ftype = _dbutils._db_integer /*String*/ ;
 break; }
case 2: {
RDebugUtils.currentLine=5177370;
 //BA.debugLineNum = 5177370;BA.debugLine="ftype=DBUtils.DB_REAL";
_ftype = _dbutils._db_real /*String*/ ;
 break; }
default: {
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="ftype=DBUtils.DB_TEXT";
_ftype = _dbutils._db_text /*String*/ ;
 break; }
}
;
RDebugUtils.currentLine=5177374;
 //BA.debugLineNum = 5177374;BA.debugLine="If i > 0 Then sb.Append(\", \")";
if (_i>0) { 
_sb.Append(", ");};
RDebugUtils.currentLine=5177375;
 //BA.debugLineNum = 5177375;BA.debugLine="sb.Append(EscapeField(field)).Append(\" \").Append";
_sb.Append(_escapefield(_field)).Append(" ").Append(_ftype);
RDebugUtils.currentLine=5177376;
 //BA.debugLineNum = 5177376;BA.debugLine="If field = PrimaryKey Then sb.Append(\" PRIMARY K";
if ((_field).equals(_primarykey)) { 
_sb.Append(" PRIMARY KEY");};
 }
};
RDebugUtils.currentLine=5177378;
 //BA.debugLineNum = 5177378;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=5177379;
 //BA.debugLineNum = 5177379;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tablename)+" "+_sb.ToString();
RDebugUtils.currentLine=5177384;
 //BA.debugLineNum = 5177384;BA.debugLine="LogColor(\"******** Crear Tabla***********\",xui.Co";
anywheresoftware.b4a.keywords.Common.LogImpl("85177384","******** Crear Tabla***********",_xui.Color_Blue);
RDebugUtils.currentLine=5177385;
 //BA.debugLineNum = 5177385;BA.debugLine="LogColor(query,xui.Color_Blue)";
anywheresoftware.b4a.keywords.Common.LogImpl("85177385",_query,_xui.Color_Blue);
RDebugUtils.currentLine=5177386;
 //BA.debugLineNum = 5177386;BA.debugLine="LogColor(\"******** Fin Crear Tabla***********\",xu";
anywheresoftware.b4a.keywords.Common.LogImpl("85177386","******** Fin Crear Tabla***********",_xui.Color_Blue);
RDebugUtils.currentLine=5177387;
 //BA.debugLineNum = 5177387;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _materialiconstobitmap(String _text,float _fontsize,int _color) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "materialiconstobitmap", false))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "materialiconstobitmap", new Object[] {_text,_fontsize,_color}));}
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub MaterialIconsToBitmap (Text As String, FontSiz";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim p As Pane = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_xui.CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, FontSize+2dip, FontS";
_p.SetLayoutAnimated((int) (0),0,0,_fontsize+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)),_fontsize+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (2)));
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(ba,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject())));
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Dim fnt As B4XFont = xui.CreateMaterialIcons(Font";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = _xui.CreateMaterialIcons(_fontsize);
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(Text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="cvs1.DrawText(Text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(_text,_cvs1.getTargetRect().getCenterX(),_baseline,_fnt,_color,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"CENTER"));
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="cvs1.Release";
_cvs1.Release();
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="End Sub";
return null;
}
public static double  _measuremultilinetextheight(anywheresoftware.b4j.objects.JFX.FontWrapper _font,double _width,String _text) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "measuremultilinetextheight", false))
	 {return ((Double) Debug.delegate(ba, "measuremultilinetextheight", new Object[] {_font,_width,_text}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub MeasureMultilineTextHeight (Font As Font, Widt";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(utilidades.getObject()));
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_font.getObject()),(Object)(_text),(Object)(_width)})));
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="End Sub";
return 0;
}
public static String  _poigetformattedcellvalue(anywheresoftware.b4j.objects.PoiCellWrapper _excelcell) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "poigetformattedcellvalue", false))
	 {return ((String) Debug.delegate(ba, "poigetformattedcellvalue", new Object[] {_excelcell}));}
anywheresoftware.b4j.object.JavaObject _jocell = null;
anywheresoftware.b4j.object.JavaObject _jodataformatter = null;
anywheresoftware.b4j.object.JavaObject _joconditionalformattingevaluator = null;
anywheresoftware.b4j.object.JavaObject _joformulaevaluator = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub PoiGetFormattedCellValue(ExcelCell As PoiCell)";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim JOCell As JavaObject = ExcelCell";
_jocell = new anywheresoftware.b4j.object.JavaObject();
_jocell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_excelcell.getObject()));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim JODataFormatter As JavaObject";
_jodataformatter = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim JOConditionalFormattingEvaluator As JavaObjec";
_joconditionalformattingevaluator = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim JOFormulaEvaluator As JavaObject =JOCell.RunM";
_joformulaevaluator = new anywheresoftware.b4j.object.JavaObject();
_joformulaevaluator = _jocell.RunMethodJO("getSheet",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("getWorkbook",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("getCreationHelper",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("createFormulaEvaluator",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="JOConditionalFormattingEvaluator.InitializeNewIns";
_joconditionalformattingevaluator.InitializeNewInstance("org.apache.poi.ss.formula.ConditionalFormattingEvaluator",new Object[]{(Object)(_jocell.RunMethodJO("getSheet",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("getWorkbook",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).getObject()),(Object)(_jocell.RunMethodJO("getSheet",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("getWorkbook",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("getCreationHelper",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethodJO("createFormulaEvaluator",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).getObject())});
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Return JODataFormatter.InitializeNewInstance(\"org";
if (true) return BA.ObjectToString(_jodataformatter.InitializeNewInstance("org.apache.poi.ss.usermodel.DataFormatter",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("formatCellValue",new Object[]{(Object)(_jocell.getObject()),(Object)(_joformulaevaluator.getObject()),(Object)(_joconditionalformattingevaluator.getObject())}));
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="End Sub";
return "";
}
public static String  _resizetofit(anywheresoftware.b4j.objects.TableViewWrapper _tv,int _columnindex) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "resizetofit", false))
	 {return ((String) Debug.delegate(ba, "resizetofit", new Object[] {_tv,_columnindex}));}
int _javaversion = 0;
anywheresoftware.b4j.object.JavaObject _tvjo = null;
anywheresoftware.b4j.agraham.reflection.Reflection _r = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub ResizeToFit(tv As TableView, ColumnIndex As In";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim JavaVersion As Int=	GetSystemProperty(\"java.v";
_javaversion = (int)(Double.parseDouble(anywheresoftware.b4a.keywords.Common.GetSystemProperty("java.version","").substring((int) (0),(int) (2))));
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="If JavaVersion>=11 Then Return";
if (_javaversion>=11) { 
if (true) return "";};
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Dim tvjo As JavaObject = tv";
_tvjo = new anywheresoftware.b4j.object.JavaObject();
_tvjo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_tv.getObject()));
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4j.agraham.reflection.Reflection();
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="r.Target = tvjo.RunMethod(\"getSkin\", Null)";
_r.Target = _tvjo.RunMethod("getSkin",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="r.RunMethod4(\"resizeColumnToFitContent\", Array(";
_r.RunMethod4("resizeColumnToFitContent",new Object[]{_tvjo.RunMethodJO("getColumns",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("get",new Object[]{(Object)(_columnindex)}),(Object)(-1)},new String[]{"javafx.scene.control.TableColumn","java.lang.int"});
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="End Sub";
return "";
}
public static String  _setformiconified(anywheresoftware.b4j.objects.Form _f,boolean _state) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setformiconified", false))
	 {return ((String) Debug.delegate(ba, "setformiconified", new Object[] {_f,_state}));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub SetFormIconified(f As Form, State As Boolean)";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim joForm As JavaObject = f";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="joStage.RunMethod(\"setMinimized\", Array(State))";
_jostage.RunMethod("setMinimized",new Object[]{(Object)(_state)});
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="End Sub";
return "";
}
public static String  _setformmaximized(anywheresoftware.b4j.objects.Form _f) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setformmaximized", false))
	 {return ((String) Debug.delegate(ba, "setformmaximized", new Object[] {_f}));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub SetFormMaximized(f As Form)";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim joForm As JavaObject = f";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_f));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.True)});
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemedate(b4j.docU.b4xdatetemplate _datetemplate) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setlightthemedate", false))
	 {return ((String) Debug.delegate(ba, "setlightthemedate", new Object[] {_datetemplate}));}
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
_datetemplate._daysinweekcolor /*int*/  = _xui.Color_Black;
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0x39),((int)0xd7),((int)0xce));
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
_datetemplate._highlightedcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0x00),((int)0xce),((int)0xff));
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
_datetemplate._daysinmonthcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
_datetemplate._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
_datetemplate._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0xff),((int)0xa7),((int)0x61));
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group9 = new Object[]{(Object)(_datetemplate._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen9 = group9.length
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group9[index9]));
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="x.Color = xui.Color_Transparent";
_x.setColor(_xui.Color_Transparent);
 }
};
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemedialog(b4j.docU.b4xdialog _dlg) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setlightthemedialog", false))
	 {return ((String) Debug.delegate(ba, "setlightthemedialog", new Object[] {_dlg}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub SetLightThemeDialog(dlg As B4XDialog)";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="dlg.BackgroundColor = xui.Color_White";
_dlg._backgroundcolor /*int*/  = _xui.Color_White;
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="dlg.ButtonsColor = xui.Color_White";
_dlg._buttonscolor /*int*/  = _xui.Color_White;
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="dlg.BorderColor = xui.Color_Gray";
_dlg._bordercolor /*int*/  = _xui.Color_Gray;
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
_dlg._buttonstextcolor /*int*/  = _xui.Color_ARGB(((int)0xff),((int)0x00),((int)0x7d),((int)0xc3));
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemeinput(b4j.docU.b4xinputtemplate _input) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setlightthemeinput", false))
	 {return ((String) Debug.delegate(ba, "setlightthemeinput", new Object[] {_input}));}
int _textcolor = 0;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="input.TextField1.TextColor = TextColor";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="input.lblTitle.TextColor = TextColor";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
_input._setbordercolor /*String*/ (null,_textcolor,_xui.Color_Red);
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemelist(b4j.docU.b4xlisttemplate _list) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setlightthemelist", false))
	 {return ((String) Debug.delegate(ba, "setlightthemelist", new Object[] {_list}));}
int _textcolor = 0;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(_xui.Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(_xui.Color_White);
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = _xui.Color_White;
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="End Sub";
return "";
}
public static String  _setlightthemesearch(b4j.docU.b4xsearchtemplate _search) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setlightthemesearch", false))
	 {return ((String) Debug.delegate(ba, "setlightthemesearch", new Object[] {_search}));}
int _textcolor = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = _xui.Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(_textcolor);
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(_xui.Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=4587525;
 //BA.debugLineNum = 4587525;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(_xui.Color_White);
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = _xui.Color_White;
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=4587529;
 //BA.debugLineNum = 4587529;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="End Sub";
return "";
}
public static String  _setpagesize(b4j.docU.worddocument _doc,long _width,long _height) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "setpagesize", false))
	 {return ((String) Debug.delegate(ba, "setpagesize", new Object[] {_doc,_width,_height}));}
anywheresoftware.b4j.object.JavaObject _document = null;
anywheresoftware.b4j.object.JavaObject _body = null;
anywheresoftware.b4j.object.JavaObject _section = null;
anywheresoftware.b4j.object.JavaObject _pagesize = null;
anywheresoftware.b4j.object.JavaObject _biginteger = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub SetPageSize(doc As WordDocument, Width";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim document As JavaObject = doc.XWPFDocument.Run";
_document = new anywheresoftware.b4j.object.JavaObject();
_document = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_doc._xwpfdocument /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDocument",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim body As JavaObject = document.RunMethod(\"getB";
_body = new anywheresoftware.b4j.object.JavaObject();
_body = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_document.RunMethod("getBody",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="If body.RunMethod(\"isSetSectPr\", Null).As(Boolean";
if ((BA.ObjectToBoolean(_body.RunMethod("isSetSectPr",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="body.RunMethod(\"addNewSectPr\", Null)";
_body.RunMethod("addNewSectPr",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 };
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="Dim section As JavaObject = body.RunMethod(\"getSe";
_section = new anywheresoftware.b4j.object.JavaObject();
_section = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_body.RunMethod("getSectPr",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="If section.RunMethod(\"isSetPgSz\", Null).As(Boolea";
if ((BA.ObjectToBoolean(_section.RunMethod("isSetPgSz",(Object[])(anywheresoftware.b4a.keywords.Common.Null))))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="section.RunMethod(\"addNewPgSz\", Null)";
_section.RunMethod("addNewPgSz",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 };
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="Dim pageSize As JavaObject = section.RunMethod(\"g";
_pagesize = new anywheresoftware.b4j.object.JavaObject();
_pagesize = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_section.RunMethod("getPgSz",(Object[])(anywheresoftware.b4a.keywords.Common.Null))));
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="Dim BigInteger As JavaObject";
_biginteger = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="BigInteger.InitializeStatic(\"java.math.BigInteger";
_biginteger.InitializeStatic("java.math.BigInteger");
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="pageSize.RunMethod(\"setW\", Array(BigInteger.RunMe";
_pagesize.RunMethod("setW",new Object[]{_biginteger.RunMethod("valueOf",new Object[]{(Object)(_width*20)})});
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="pageSize.RunMethod(\"setH\", Array(BigInteger.RunMe";
_pagesize.RunMethod("setH",new Object[]{_biginteger.RunMethod("valueOf",new Object[]{(Object)(_height*20)})});
RDebugUtils.currentLine=6488079;
 //BA.debugLineNum = 6488079;BA.debugLine="End Sub";
return "";
}
public static String  _settooltipfont(anywheresoftware.b4j.objects.NodeWrapper.ControlWrapper.ConcreteControlWrapper _n,anywheresoftware.b4j.objects.JFX.FontWrapper _f) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "settooltipfont", false))
	 {return ((String) Debug.delegate(ba, "settooltipfont", new Object[] {_n,_f}));}
anywheresoftware.b4j.object.JavaObject _jon = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub SetToolTipFont(N As Control,F As Font)";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim JoN As JavaObject = N";
_jon = new anywheresoftware.b4j.object.JavaObject();
_jon = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_n.getObject()));
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="JoN.RunMethodJO(\"getTooltip\",Null).RunMethod(\"set";
_jon.RunMethodJO("getTooltip",(Object[])(anywheresoftware.b4a.keywords.Common.Null)).RunMethod("setFont",new Object[]{(Object)(_f.getObject())});
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _texttoimageawesome(String _s,double _fontsize) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "texttoimageawesome", false))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "texttoimageawesome", new Object[] {_s,_fontsize}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="private Sub TextToImageAwesome(s As String, FontSi";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="lbl.Font = fx.CreateFontAwesome(FontSize)";
_lbl.setFont(_fx.CreateFontAwesome(_fontsize));
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="lbl.Text = s";
_lbl.setText(_s);
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="Dim p As Pane=xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_xui.CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="p.AddNode(lbl, -1, -1, -1, -1)";
_p.AddNode((javafx.scene.Node)(_lbl.getObject()),-1,-1,-1,-1);
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="img = lbl.Snapshot2(fx.Colors.Transparent) ' snap";
_img = _lbl.Snapshot2(_fx.Colors.Transparent);
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="lbl.Visible = False";
_lbl.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5898253;
 //BA.debugLineNum = 5898253;BA.debugLine="p.RemoveNodeAt(p.NumberOfNodes-1)";
_p.RemoveNodeAt((int) (_p.getNumberOfNodes()-1));
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="Return img";
if (true) return _img;
RDebugUtils.currentLine=5898255;
 //BA.debugLineNum = 5898255;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _texttoimagematerialicons(String _s,double _fontsize) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "texttoimagematerialicons", false))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "texttoimagematerialicons", new Object[] {_s,_fontsize}));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="private Sub TextToImageMaterialIcons(s As String,";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="lbl.Font = fx.CreateMaterialIcons(FontSize)";
_lbl.setFont(_fx.CreateMaterialIcons(_fontsize));
RDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="lbl.Text = s";
_lbl.setText(_s);
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="Dim p As Pane=xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
_p = (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_xui.CreatePanel(ba,"").getObject()));
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="p.AddNode(lbl, -1, -1, -1, -1)";
_p.AddNode((javafx.scene.Node)(_lbl.getObject()),-1,-1,-1,-1);
RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="img = lbl.Snapshot2(fx.Colors.Transparent) ' snap";
_img = _lbl.Snapshot2(_fx.Colors.Transparent);
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="lbl.Visible = False";
_lbl.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="p.RemoveNodeAt(p.NumberOfNodes-1)";
_p.RemoveNodeAt((int) (_p.getNumberOfNodes()-1));
RDebugUtils.currentLine=5963790;
 //BA.debugLineNum = 5963790;BA.debugLine="Return img";
if (true) return _img;
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="End Sub";
return null;
}
public static Object  _tickstodate(long _ticks) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "tickstodate", false))
	 {return ((Object) Debug.delegate(ba, "tickstodate", new Object[] {_ticks}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub TicksToDate (ticks As Long) As Object";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="jo.InitializeNewInstance(\"java.util.Date\", Array(";
_jo.InitializeNewInstance("java.util.Date",new Object[]{(Object)(_ticks)});
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Return jo";
if (true) return (Object)(_jo.getObject());
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="End Sub";
return null;
}
public static String  _tiempodesdeticks(long _ticksdato) throws Exception{
RDebugUtils.currentModule="utilidades";
if (Debug.shouldDelegate(ba, "tiempodesdeticks", false))
	 {return ((String) Debug.delegate(ba, "tiempodesdeticks", new Object[] {_ticksdato}));}
b4j.example.dateutils._period _p = null;
String _stiempodesdedato = "";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub TiempoDesdeTicks(TicksDato As Long) As String";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim p As Period";
_p = new b4j.example.dateutils._period();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="p = DateUtils.PeriodBetweenInDays(TicksDato,DateT";
_p = _dateutils._periodbetweenindays(_ticksdato,anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim sTiempoDesdeDato As String";
_stiempodesdedato = "";
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="If p.Days>0 Then";
if (_p.Days>0) { 
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$1.0{p.Day";
_stiempodesdedato = _stiempodesdedato+(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_p.Days))+" días ");
 };
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="If p.Hours>0 Then";
if (_p.Hours>0) { 
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$2.0{p.Hou";
_stiempodesdedato = _stiempodesdedato+(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("2.0",(Object)(_p.Hours))+" h ");
 };
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="If p.Minutes>0 Then";
if (_p.Minutes>0) { 
RDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$2.0{p.Min";
_stiempodesdedato = _stiempodesdedato+(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("2.0",(Object)(_p.Minutes))+" m ");
 };
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="If p.Seconds>0 Then";
if (_p.Seconds>0) { 
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="sTiempoDesdeDato=sTiempoDesdeDato & $\"$2.0{p.Sec";
_stiempodesdedato = _stiempodesdedato+(""+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("2.0",(Object)(_p.Seconds))+" s ");
 };
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="Return sTiempoDesdeDato";
if (true) return _stiempodesdedato;
RDebugUtils.currentLine=6619154;
 //BA.debugLineNum = 6619154;BA.debugLine="End Sub";
return "";
}
public static String getType(String filePath) throws IOException , SecurityException{
 return Files.probeContentType(Paths.get(filePath));
}
	public static String TextoSinNotacionCientifica(Object o){
		String s=new BigDecimal(o.toString()).toPlainString();
		return s;
	}		
public static double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
}