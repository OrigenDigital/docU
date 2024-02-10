package b4j.docU;

import anywheresoftware.b4a.debug.*;
import javafx.scene.control.Label;
import javafx.application.Platform;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jammsgdialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jammsgdialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jammsgdialog.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public b4j.docU.b4xdialog _dialog = null;
public Object _mtextomensaje = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbasedialogo = null;
public int _mcoloroverlay = 0;
public int _mcolorfondodialogo = 0;
public boolean _mmovible = false;
public double _downx = 0;
public double _downy = 0;
public int _manchodialogo = 0;
public int _maltodialogo = 0;
public int _maxaltodialogomensajecorto = 0;
public int _minaltodialogomensajecorto = 0;
public String _malineacionverticalmsg = "";
public String _malineacionhorizontalmsg = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _mfuentetextomensaje = null;
public float _mtamanofuentetextomensaje = 0f;
public int _mcolortextomensaje = 0;
public int _mcolorfondomensaje = 0;
public Object _mtextotitulo = null;
public int _maltotitulo = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _mfuentetextotitulo = null;
public int _mcolortextotitulo = 0;
public float _mtamanofuentetitulo = 0f;
public int _mcolorfondotitulo = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mpaneltitulo = null;
public int _manchobordedialogo = 0;
public int _mcolorbordedialogo = 0;
public int _maltobotonesdialogo = 0;
public String _mtextobotonpositive = "";
public String _mtextobotoncancel = "";
public String _mtextobotonnegative = "";
public float _mtamanofuentebotonesdialogo = 0f;
public int _mcolorfondobotonpositive = 0;
public int _mcolorfondobotoncancel = 0;
public int _mcolorfondobotonnegative = 0;
public int _mcolortextobotonpositive = 0;
public int _mcolortextobotoncancel = 0;
public int _mcolortextobotonnegative = 0;
public String _mnombreficheroiconotitulo = "";
public String _alineacioncentro = "";
public String _alineacionizquierda = "";
public String _alineacionderecha = "";
public String _alineaciontop = "";
public String _alineacionbottom = "";
public anywheresoftware.b4a.objects.B4XCanvas _measurementcanvas = null;
public boolean _usab4xlongtexttemplate = false;
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
public int  _booleantoint(b4j.docU.jammsgdialog __ref,boolean _bool) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "booleantoint", true))
	 {return ((Integer) Debug.delegate(ba, "booleantoint", new Object[] {_bool}));}
RDebugUtils.currentLine=146145280;
 //BA.debugLineNum = 146145280;BA.debugLine="Sub BooleanToInt(Bool As Boolean) As Int";
RDebugUtils.currentLine=146145281;
 //BA.debugLineNum = 146145281;BA.debugLine="If Bool Then Return 1 Else Return 0";
if (_bool) { 
if (true) return (int) (1);}
else {
if (true) return (int) (0);};
RDebugUtils.currentLine=146145282;
 //BA.debugLineNum = 146145282;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.docU.jammsgdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
RDebugUtils.currentLine=143392768;
 //BA.debugLineNum = 143392768;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=143392770;
 //BA.debugLineNum = 143392770;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=143392772;
 //BA.debugLineNum = 143392772;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=143392774;
 //BA.debugLineNum = 143392774;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=143392777;
 //BA.debugLineNum = 143392777;BA.debugLine="Private mTextoMensaje As Object";
_mtextomensaje = new Object();
RDebugUtils.currentLine=143392778;
 //BA.debugLineNum = 143392778;BA.debugLine="Private mBaseDialogo As B4XView";
_mbasedialogo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=143392780;
 //BA.debugLineNum = 143392780;BA.debugLine="Private mColorOverlay As Int";
_mcoloroverlay = 0;
RDebugUtils.currentLine=143392781;
 //BA.debugLineNum = 143392781;BA.debugLine="Private mColorFondoDialogo As Int";
_mcolorfondodialogo = 0;
RDebugUtils.currentLine=143392785;
 //BA.debugLineNum = 143392785;BA.debugLine="Private mMovible As Boolean";
_mmovible = false;
RDebugUtils.currentLine=143392786;
 //BA.debugLineNum = 143392786;BA.debugLine="Private DownX As Double";
_downx = 0;
RDebugUtils.currentLine=143392787;
 //BA.debugLineNum = 143392787;BA.debugLine="Private DownY As Double";
_downy = 0;
RDebugUtils.currentLine=143392789;
 //BA.debugLineNum = 143392789;BA.debugLine="Private mAnchoDialogo As Int";
_manchodialogo = 0;
RDebugUtils.currentLine=143392790;
 //BA.debugLineNum = 143392790;BA.debugLine="Private mAltoDialogo As Int";
_maltodialogo = 0;
RDebugUtils.currentLine=143392791;
 //BA.debugLineNum = 143392791;BA.debugLine="Private const MaxAltoDialogoMensajeCorto As Int=1";
_maxaltodialogomensajecorto = __c.DipToCurrent((int) (180));
RDebugUtils.currentLine=143392792;
 //BA.debugLineNum = 143392792;BA.debugLine="Private const MinAltoDialogoMensajeCorto As Int=1";
_minaltodialogomensajecorto = __c.DipToCurrent((int) (140));
RDebugUtils.currentLine=143392793;
 //BA.debugLineNum = 143392793;BA.debugLine="Private mAlineacionVerticalMsg As String";
_malineacionverticalmsg = "";
RDebugUtils.currentLine=143392794;
 //BA.debugLineNum = 143392794;BA.debugLine="Private mAlineacionHorizontalMsg As String";
_malineacionhorizontalmsg = "";
RDebugUtils.currentLine=143392796;
 //BA.debugLineNum = 143392796;BA.debugLine="Private mFuenteTextoMensaje As B4XFont";
_mfuentetextomensaje = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=143392797;
 //BA.debugLineNum = 143392797;BA.debugLine="Private mTamanoFuenteTextoMensaje As Float";
_mtamanofuentetextomensaje = 0f;
RDebugUtils.currentLine=143392798;
 //BA.debugLineNum = 143392798;BA.debugLine="Private mColorTextoMensaje As Int";
_mcolortextomensaje = 0;
RDebugUtils.currentLine=143392799;
 //BA.debugLineNum = 143392799;BA.debugLine="Private mColorFondoMensaje As Int";
_mcolorfondomensaje = 0;
RDebugUtils.currentLine=143392801;
 //BA.debugLineNum = 143392801;BA.debugLine="Private mTextoTitulo As Object";
_mtextotitulo = new Object();
RDebugUtils.currentLine=143392802;
 //BA.debugLineNum = 143392802;BA.debugLine="Private mAltoTitulo As Int";
_maltotitulo = 0;
RDebugUtils.currentLine=143392803;
 //BA.debugLineNum = 143392803;BA.debugLine="Private mFuenteTextoTitulo As B4XFont";
_mfuentetextotitulo = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=143392804;
 //BA.debugLineNum = 143392804;BA.debugLine="Private mColorTextoTitulo As Int";
_mcolortextotitulo = 0;
RDebugUtils.currentLine=143392805;
 //BA.debugLineNum = 143392805;BA.debugLine="Private mTamanoFuenteTitulo As Float";
_mtamanofuentetitulo = 0f;
RDebugUtils.currentLine=143392806;
 //BA.debugLineNum = 143392806;BA.debugLine="Private mColorFondoTitulo As Int";
_mcolorfondotitulo = 0;
RDebugUtils.currentLine=143392807;
 //BA.debugLineNum = 143392807;BA.debugLine="Private mPanelTitulo As B4XView";
_mpaneltitulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=143392809;
 //BA.debugLineNum = 143392809;BA.debugLine="Private mAnchoBordeDialogo As Int";
_manchobordedialogo = 0;
RDebugUtils.currentLine=143392810;
 //BA.debugLineNum = 143392810;BA.debugLine="Private mColorBordeDialogo As Int";
_mcolorbordedialogo = 0;
RDebugUtils.currentLine=143392813;
 //BA.debugLineNum = 143392813;BA.debugLine="Private mAltoBotonesDialogo As Int";
_maltobotonesdialogo = 0;
RDebugUtils.currentLine=143392814;
 //BA.debugLineNum = 143392814;BA.debugLine="Private mTextoBotonPositive As String";
_mtextobotonpositive = "";
RDebugUtils.currentLine=143392815;
 //BA.debugLineNum = 143392815;BA.debugLine="Private mTextoBotonCancel As String";
_mtextobotoncancel = "";
RDebugUtils.currentLine=143392816;
 //BA.debugLineNum = 143392816;BA.debugLine="Private mTextoBotonNegative As String";
_mtextobotonnegative = "";
RDebugUtils.currentLine=143392817;
 //BA.debugLineNum = 143392817;BA.debugLine="Private mTamanoFuenteBotonesDialogo As Float";
_mtamanofuentebotonesdialogo = 0f;
RDebugUtils.currentLine=143392818;
 //BA.debugLineNum = 143392818;BA.debugLine="Private mColorFondoBotonPositive As Int";
_mcolorfondobotonpositive = 0;
RDebugUtils.currentLine=143392819;
 //BA.debugLineNum = 143392819;BA.debugLine="Private mColorFondoBotonCancel As Int";
_mcolorfondobotoncancel = 0;
RDebugUtils.currentLine=143392820;
 //BA.debugLineNum = 143392820;BA.debugLine="Private mColorFondoBotonNegative As Int";
_mcolorfondobotonnegative = 0;
RDebugUtils.currentLine=143392821;
 //BA.debugLineNum = 143392821;BA.debugLine="Private mColorTextoBotonPositive As Int";
_mcolortextobotonpositive = 0;
RDebugUtils.currentLine=143392822;
 //BA.debugLineNum = 143392822;BA.debugLine="Private mColorTextoBotonCancel As Int";
_mcolortextobotoncancel = 0;
RDebugUtils.currentLine=143392823;
 //BA.debugLineNum = 143392823;BA.debugLine="Private mColorTextoBotonNegative As Int";
_mcolortextobotonnegative = 0;
RDebugUtils.currentLine=143392825;
 //BA.debugLineNum = 143392825;BA.debugLine="Private mNombreFicheroIconoTitulo As String";
_mnombreficheroiconotitulo = "";
RDebugUtils.currentLine=143392827;
 //BA.debugLineNum = 143392827;BA.debugLine="Private CONST AlineacionCentro As String=\"CENTER\"";
_alineacioncentro = "CENTER";
RDebugUtils.currentLine=143392828;
 //BA.debugLineNum = 143392828;BA.debugLine="Private CONST AlineacionIzquierda As String=\"LEFT";
_alineacionizquierda = "LEFT";
RDebugUtils.currentLine=143392829;
 //BA.debugLineNum = 143392829;BA.debugLine="Private CONST AlineacionDerecha As String=\"RIGHT\"";
_alineacionderecha = "RIGHT";
RDebugUtils.currentLine=143392830;
 //BA.debugLineNum = 143392830;BA.debugLine="Private CONST AlineacionTop As String=\"TOP\"";
_alineaciontop = "TOP";
RDebugUtils.currentLine=143392831;
 //BA.debugLineNum = 143392831;BA.debugLine="Private CONST AlineacionBottom As String=\"BOTTOM\"";
_alineacionbottom = "BOTTOM";
RDebugUtils.currentLine=143392833;
 //BA.debugLineNum = 143392833;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
_measurementcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=143392835;
 //BA.debugLineNum = 143392835;BA.debugLine="Private UsaB4XLongTextTemplate As Boolean";
_usab4xlongtexttemplate = false;
RDebugUtils.currentLine=143392837;
 //BA.debugLineNum = 143392837;BA.debugLine="End Sub";
return "";
}
public int  _contrastcolor(b4j.docU.jammsgdialog __ref,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "contrastcolor", true))
	 {return ((Integer) Debug.delegate(ba, "contrastcolor", new Object[] {_c}));}
int _d = 0;
double _a = 0;
int[] _argb = null;
RDebugUtils.currentLine=146341888;
 //BA.debugLineNum = 146341888;BA.debugLine="Sub ContrastColor(C As Int) As Int";
RDebugUtils.currentLine=146341889;
 //BA.debugLineNum = 146341889;BA.debugLine="Dim d As Int";
_d = 0;
RDebugUtils.currentLine=146341890;
 //BA.debugLineNum = 146341890;BA.debugLine="Dim a As Double";
_a = 0;
RDebugUtils.currentLine=146341891;
 //BA.debugLineNum = 146341891;BA.debugLine="Dim argb() As Int";
_argb = new int[(int) (0)];
;
RDebugUtils.currentLine=146341892;
 //BA.debugLineNum = 146341892;BA.debugLine="argb = GetARGB(C)";
_argb = __ref._getargb /*int[]*/ (null,_c);
RDebugUtils.currentLine=146341894;
 //BA.debugLineNum = 146341894;BA.debugLine="a = 1 - ( 0.299 * argb(1) + 0.587 * argb(2) + 0.1";
_a = 1-(0.299*_argb[(int) (1)]+0.587*_argb[(int) (2)]+0.114*_argb[(int) (3)])/(double)255;
RDebugUtils.currentLine=146341896;
 //BA.debugLineNum = 146341896;BA.debugLine="If a < 0.5 Then";
if (_a<0.5) { 
RDebugUtils.currentLine=146341897;
 //BA.debugLineNum = 146341897;BA.debugLine="d = 0 ' bright Colors - black font";
_d = (int) (0);
RDebugUtils.currentLine=146341898;
 //BA.debugLineNum = 146341898;BA.debugLine="Return xui.Color_Black";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
 }else {
RDebugUtils.currentLine=146341900;
 //BA.debugLineNum = 146341900;BA.debugLine="d = 255 ' dark Colors - white font";
_d = (int) (255);
RDebugUtils.currentLine=146341901;
 //BA.debugLineNum = 146341901;BA.debugLine="Return xui.Color_White";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
 };
RDebugUtils.currentLine=146341904;
 //BA.debugLineNum = 146341904;BA.debugLine="Return  xui.Color_ARGB(a,d, d, d)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (_a),_d,_d,_d);
RDebugUtils.currentLine=146341905;
 //BA.debugLineNum = 146341905;BA.debugLine="End Sub";
return 0;
}
public int[]  _getargb(b4j.docU.jammsgdialog __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=146276352;
 //BA.debugLineNum = 146276352;BA.debugLine="Sub GetARGB(Color As Int) As Int()";
RDebugUtils.currentLine=146276353;
 //BA.debugLineNum = 146276353;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=146276354;
 //BA.debugLineNum = 146276354;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=146276355;
 //BA.debugLineNum = 146276355;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=146276356;
 //BA.debugLineNum = 146276356;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=146276357;
 //BA.debugLineNum = 146276357;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=146276358;
 //BA.debugLineNum = 146276358;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=146276359;
 //BA.debugLineNum = 146276359;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont  _getfuentelabelmensaje(b4j.docU.jammsgdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "getfuentelabelmensaje", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont) Debug.delegate(ba, "getfuentelabelmensaje", null));}
RDebugUtils.currentLine=143917056;
 //BA.debugLineNum = 143917056;BA.debugLine="Sub getFuenteLabelMensaje As B4XFont";
RDebugUtils.currentLine=143917057;
 //BA.debugLineNum = 143917057;BA.debugLine="Return mFuenteTextoMensaje";
if (true) return __ref._mfuentetextomensaje /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=143917058;
 //BA.debugLineNum = 143917058;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabelmensaje(b4j.docU.jammsgdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "getlabelmensaje", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabelmensaje", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlblmensaje = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xobj = null;
anywheresoftware.b4j.objects.ScrollPaneWrapper _scrpnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _scrpnlinnerpanel = null;
RDebugUtils.currentLine=143785984;
 //BA.debugLineNum = 143785984;BA.debugLine="private Sub getLabelMensaje As B4XView";
RDebugUtils.currentLine=143785985;
 //BA.debugLineNum = 143785985;BA.debugLine="Dim xlblMensaje As B4XView";
_xlblmensaje = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=143786006;
 //BA.debugLineNum = 143786006;BA.debugLine="Dim p As B4XView=getPanelMensaje";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=143786007;
 //BA.debugLineNum = 143786007;BA.debugLine="Dim xObj As B4XView=p.GetView(0)";
_xobj = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xobj = _p.GetView((int) (0));
RDebugUtils.currentLine=143786008;
 //BA.debugLineNum = 143786008;BA.debugLine="Select True";
switch (BA.switchObjectToInt(__c.True,_xobj.getObjectOrNull() instanceof javafx.scene.control.Label,_xobj.getObjectOrNull() instanceof javafx.scene.layout.Pane)) {
case 0: {
RDebugUtils.currentLine=143786010;
 //BA.debugLineNum = 143786010;BA.debugLine="xlblMensaje=p.GetView(0)";
_xlblmensaje = _p.GetView((int) (0));
 break; }
case 1: {
RDebugUtils.currentLine=143786017;
 //BA.debugLineNum = 143786017;BA.debugLine="Dim scrPnl As ScrollPane=xObj.GetView(0)";
_scrpnl = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_scrpnl = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(_xobj.GetView((int) (0)).getObject()));
RDebugUtils.currentLine=143786018;
 //BA.debugLineNum = 143786018;BA.debugLine="Dim scrPnlInnerPanel As B4XView=scrPnl.InnerNod";
_scrpnlinnerpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_scrpnlinnerpanel = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_scrpnl.getInnerNode().getObject()));
RDebugUtils.currentLine=143786022;
 //BA.debugLineNum = 143786022;BA.debugLine="xlblMensaje=scrPnlInnerPanel.GetView(0).GetView";
_xlblmensaje = _scrpnlinnerpanel.GetView((int) (0)).GetView((int) (0)).GetView((int) (0));
 break; }
}
;
RDebugUtils.currentLine=143786025;
 //BA.debugLineNum = 143786025;BA.debugLine="Return xlblMensaje";
if (true) return _xlblmensaje;
RDebugUtils.currentLine=143786026;
 //BA.debugLineNum = 143786026;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanelmensaje(b4j.docU.jammsgdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "getpanelmensaje", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanelmensaje", null));}
int _idxpanelmensaje = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xpanelmensaje = null;
RDebugUtils.currentLine=143720448;
 //BA.debugLineNum = 143720448;BA.debugLine="private Sub getPanelMensaje As B4XView";
RDebugUtils.currentLine=143720449;
 //BA.debugLineNum = 143720449;BA.debugLine="Dim iDxPanelMensaje As Int=Dialog.Base.NumberOfVi";
_idxpanelmensaje = (int) (__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
RDebugUtils.currentLine=143720450;
 //BA.debugLineNum = 143720450;BA.debugLine="Dim B4xPanelMensaje As B4XView=Dialog.Base.GetVie";
_b4xpanelmensaje = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xpanelmensaje = __ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_idxpanelmensaje);
RDebugUtils.currentLine=143720451;
 //BA.debugLineNum = 143720451;BA.debugLine="Return B4xPanelMensaje";
if (true) return _b4xpanelmensaje;
RDebugUtils.currentLine=143720452;
 //BA.debugLineNum = 143720452;BA.debugLine="End Sub";
return null;
}
public float  _gettamanofuentetextomensaje(b4j.docU.jammsgdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "gettamanofuentetextomensaje", true))
	 {return ((Float) Debug.delegate(ba, "gettamanofuentetextomensaje", null));}
RDebugUtils.currentLine=144834560;
 //BA.debugLineNum = 144834560;BA.debugLine="Sub getTamanoFuenteTextoMensaje As Float";
RDebugUtils.currentLine=144834561;
 //BA.debugLineNum = 144834561;BA.debugLine="Return mTamanoFuenteTextoMensaje";
if (true) return __ref._mtamanofuentetextomensaje /*float*/ ;
RDebugUtils.currentLine=144834562;
 //BA.debugLineNum = 144834562;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(b4j.docU.jammsgdialog __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _basedialogo) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_basedialogo}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=143458304;
 //BA.debugLineNum = 143458304;BA.debugLine="Public Sub Initialize(BaseDialogo As B4XView)";
RDebugUtils.currentLine=143458306;
 //BA.debugLineNum = 143458306;BA.debugLine="mBaseDialogo=BaseDialogo";
__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _basedialogo;
RDebugUtils.currentLine=143458308;
 //BA.debugLineNum = 143458308;BA.debugLine="mMovible=True";
__ref._mmovible /*boolean*/  = __c.True;
RDebugUtils.currentLine=143458311;
 //BA.debugLineNum = 143458311;BA.debugLine="SetTemaClaro";
__ref._settemaclaro /*String*/ (null);
RDebugUtils.currentLine=143458317;
 //BA.debugLineNum = 143458317;BA.debugLine="mColorOverlay=xui.Color_Transparent  ' color tran";
__ref._mcoloroverlay /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=143458323;
 //BA.debugLineNum = 143458323;BA.debugLine="mBaseDialogo=BaseDialogo";
__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _basedialogo;
RDebugUtils.currentLine=143458329;
 //BA.debugLineNum = 143458329;BA.debugLine="mAnchoDialogo=500dip";
__ref._manchodialogo /*int*/  = __c.DipToCurrent((int) (500));
RDebugUtils.currentLine=143458330;
 //BA.debugLineNum = 143458330;BA.debugLine="mAltoDialogo=180dip";
__ref._maltodialogo /*int*/  = __c.DipToCurrent((int) (180));
RDebugUtils.currentLine=143458334;
 //BA.debugLineNum = 143458334;BA.debugLine="mAlineacionVerticalMsg=\"CENTER\"";
__ref._malineacionverticalmsg /*String*/  = "CENTER";
RDebugUtils.currentLine=143458335;
 //BA.debugLineNum = 143458335;BA.debugLine="mAlineacionHorizontalMsg=\"CENTER\"";
__ref._malineacionhorizontalmsg /*String*/  = "CENTER";
RDebugUtils.currentLine=143458337;
 //BA.debugLineNum = 143458337;BA.debugLine="mAltoBotonesDialogo=30dip";
__ref._maltobotonesdialogo /*int*/  = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=143458341;
 //BA.debugLineNum = 143458341;BA.debugLine="mTextoBotonPositive=\"OK\"";
__ref._mtextobotonpositive /*String*/  = "OK";
RDebugUtils.currentLine=143458342;
 //BA.debugLineNum = 143458342;BA.debugLine="mTextoBotonCancel=\"\"";
__ref._mtextobotoncancel /*String*/  = "";
RDebugUtils.currentLine=143458343;
 //BA.debugLineNum = 143458343;BA.debugLine="mTextoBotonNegative=\"\"";
__ref._mtextobotonnegative /*String*/  = "";
RDebugUtils.currentLine=143458345;
 //BA.debugLineNum = 143458345;BA.debugLine="mTamanoFuenteBotonesDialogo=14";
__ref._mtamanofuentebotonesdialogo /*float*/  = (float) (14);
RDebugUtils.currentLine=143458349;
 //BA.debugLineNum = 143458349;BA.debugLine="mColorFondoBotonPositive=xui.Color_Transparent";
__ref._mcolorfondobotonpositive /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=143458350;
 //BA.debugLineNum = 143458350;BA.debugLine="mColorFondoBotonCancel=xui.Color_Transparent";
__ref._mcolorfondobotoncancel /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=143458351;
 //BA.debugLineNum = 143458351;BA.debugLine="mColorFondoBotonNegative=xui.Color_Transparent";
__ref._mcolorfondobotonnegative /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=143458361;
 //BA.debugLineNum = 143458361;BA.debugLine="mTamanoFuenteTextoMensaje=14";
__ref._mtamanofuentetextomensaje /*float*/  = (float) (14);
RDebugUtils.currentLine=143458369;
 //BA.debugLineNum = 143458369;BA.debugLine="Try";
try {RDebugUtils.currentLine=143458370;
 //BA.debugLineNum = 143458370;BA.debugLine="mFuenteTextoMensaje=xui.CreateFont(fx.CreateFont";
__ref._mfuentetextomensaje /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont((javafx.scene.text.Font)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .CreateFont("Arial",__ref._mtamanofuentetextomensaje /*float*/ ,__c.False,__c.False).getObject()),__ref._mtamanofuentetextomensaje /*float*/ );
 } 
       catch (Exception e22) {
			ba.setLastException(e22);RDebugUtils.currentLine=143458372;
 //BA.debugLineNum = 143458372;BA.debugLine="mFuenteTextoMensaje=xui.CreateDefaultFont(mTaman";
__ref._mfuentetextomensaje /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(__ref._mtamanofuentetextomensaje /*float*/ );
 };
RDebugUtils.currentLine=143458378;
 //BA.debugLineNum = 143458378;BA.debugLine="mAltoTitulo=40dip";
__ref._maltotitulo /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=143458380;
 //BA.debugLineNum = 143458380;BA.debugLine="mTamanoFuenteTitulo=14";
__ref._mtamanofuentetitulo /*float*/  = (float) (14);
RDebugUtils.currentLine=143458389;
 //BA.debugLineNum = 143458389;BA.debugLine="Try";
try {RDebugUtils.currentLine=143458390;
 //BA.debugLineNum = 143458390;BA.debugLine="mFuenteTextoTitulo=xui.CreateFont(fx.CreateFont(";
__ref._mfuentetextotitulo /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont((javafx.scene.text.Font)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .CreateFont("Arial",__ref._mtamanofuentetitulo /*float*/ ,__c.False,__c.False).getObject()),__ref._mtamanofuentetitulo /*float*/ );
 } 
       catch (Exception e29) {
			ba.setLastException(e29);RDebugUtils.currentLine=143458392;
 //BA.debugLineNum = 143458392;BA.debugLine="mFuenteTextoTitulo=xui.CreateDefaultFont(mTamano";
__ref._mfuentetextotitulo /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(__ref._mtamanofuentetitulo /*float*/ );
 };
RDebugUtils.currentLine=143458400;
 //BA.debugLineNum = 143458400;BA.debugLine="mAnchoBordeDialogo=2dip";
__ref._manchobordedialogo /*int*/  = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=143458403;
 //BA.debugLineNum = 143458403;BA.debugLine="mNombreFicheroIconoTitulo=\"\"";
__ref._mnombreficheroiconotitulo /*String*/  = "";
RDebugUtils.currentLine=143458407;
 //BA.debugLineNum = 143458407;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")  ' necesar";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=143458408;
 //BA.debugLineNum = 143458408;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=143458409;
 //BA.debugLineNum = 143458409;BA.debugLine="MeasurementCanvas.Initialize(p)";
__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=143458413;
 //BA.debugLineNum = 143458413;BA.debugLine="End Sub";
return "";
}
public String  _settemaclaro(b4j.docU.jammsgdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settemaclaro", true))
	 {return ((String) Debug.delegate(ba, "settemaclaro", null));}
RDebugUtils.currentLine=143523840;
 //BA.debugLineNum = 143523840;BA.debugLine="public Sub SetTemaClaro";
RDebugUtils.currentLine=143523841;
 //BA.debugLineNum = 143523841;BA.debugLine="mColorFondoDialogo=0xFFDCDCDC   ' gainsboro";
__ref._mcolorfondodialogo /*int*/  = ((int)0xffdcdcdc);
RDebugUtils.currentLine=143523842;
 //BA.debugLineNum = 143523842;BA.debugLine="mColorBordeDialogo=xui.Color_Gray";
__ref._mcolorbordedialogo /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=143523844;
 //BA.debugLineNum = 143523844;BA.debugLine="mColorFondoTitulo=0xFFB22222  ' firebrick";
__ref._mcolorfondotitulo /*int*/  = ((int)0xffb22222);
RDebugUtils.currentLine=143523845;
 //BA.debugLineNum = 143523845;BA.debugLine="mColorTextoTitulo=xui.Color_White";
__ref._mcolortextotitulo /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=143523847;
 //BA.debugLineNum = 143523847;BA.debugLine="mColorTextoBotonPositive=xui.Color_Black";
__ref._mcolortextobotonpositive /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=143523848;
 //BA.debugLineNum = 143523848;BA.debugLine="mColorTextoBotonCancel=xui.Color_Black";
__ref._mcolortextobotoncancel /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=143523849;
 //BA.debugLineNum = 143523849;BA.debugLine="mColorTextoBotonNegative=xui.Color_Black";
__ref._mcolortextobotonnegative /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=143523851;
 //BA.debugLineNum = 143523851;BA.debugLine="mColorTextoMensaje=xui.Color_Black";
__ref._mcolortextomensaje /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=143523852;
 //BA.debugLineNum = 143523852;BA.debugLine="mColorFondoMensaje=mColorFondoDialogo";
__ref._mcolorfondomensaje /*int*/  = __ref._mcolorfondodialogo /*int*/ ;
RDebugUtils.currentLine=143523853;
 //BA.debugLineNum = 143523853;BA.debugLine="End Sub";
return "";
}
public double  _measuremultilinetextheight(b4j.docU.jammsgdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font,double _width,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "measuremultilinetextheight", true))
	 {return ((Double) Debug.delegate(ba, "measuremultilinetextheight", new Object[] {_font,_width,_text}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=146210816;
 //BA.debugLineNum = 146210816;BA.debugLine="Sub MeasureMultilineTextHeight (Font As B4XFont, W";
RDebugUtils.currentLine=146210817;
 //BA.debugLineNum = 146210817;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=146210818;
 //BA.debugLineNum = 146210818;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_font.getObject()),(Object)(_text),(Object)(_width)})));
RDebugUtils.currentLine=146210819;
 //BA.debugLineNum = 146210819;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mostraraviso(b4j.docU.jammsgdialog __ref) throws Exception{
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "mostraraviso", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mostraraviso", null));}
ResumableSub_MostrarAviso rsub = new ResumableSub_MostrarAviso(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MostrarAviso extends BA.ResumableSub {
public ResumableSub_MostrarAviso(b4j.docU.jammsgdialog parent,b4j.docU.jammsgdialog __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jammsgdialog __ref;
b4j.docU.jammsgdialog parent;
int _htitulo = 0;
int _hlbldummymensaje = 0;
b4j.docU.jamb4xlongtexttemplate _dltxt = null;
b4j.example.customlistview _clvlt = null;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _numerobotonesdialog = 0;
double _whueco = 0;
double _wtotalhuecos = 0;
double _wdispbotones = 0;
double _anchobotonesdialog = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pinterior = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xlbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
anywheresoftware.b4j.objects.LabelWrapper _lblt = null;
anywheresoftware.b4j.objects.ImageViewWrapper _ivicon = null;
double _medidaladoicono = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xivicon = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XViewWrapper _bok = null;
int _textwidthbok = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bcancel = null;
int _textwidthbcancel = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _bnegative = null;
int _textwidthbno = 0;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jammsgdialog";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=146079748;
 //BA.debugLineNum = 146079748;BA.debugLine="Dim Dialog As B4XDialog";
parent._dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=146079749;
 //BA.debugLineNum = 146079749;BA.debugLine="Dialog.Initialize(mBaseDialogo)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=146079751;
 //BA.debugLineNum = 146079751;BA.debugLine="Dialog.OverlayColor=mColorOverlay";
__ref._dialog /*b4j.docU.b4xdialog*/ ._overlaycolor /*int*/  = __ref._mcoloroverlay /*int*/ ;
RDebugUtils.currentLine=146079753;
 //BA.debugLineNum = 146079753;BA.debugLine="Dialog.BackgroundColor=mColorFondoDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._backgroundcolor /*int*/  = __ref._mcolorfondodialogo /*int*/ ;
RDebugUtils.currentLine=146079755;
 //BA.debugLineNum = 146079755;BA.debugLine="Dialog.BorderColor=mColorBordeDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._bordercolor /*int*/  = __ref._mcolorbordedialogo /*int*/ ;
RDebugUtils.currentLine=146079756;
 //BA.debugLineNum = 146079756;BA.debugLine="Dialog.BorderWidth=mAnchoBordeDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._borderwidth /*int*/  = __ref._manchobordedialogo /*int*/ ;
RDebugUtils.currentLine=146079758;
 //BA.debugLineNum = 146079758;BA.debugLine="Dialog.Title=mTextoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = __ref._mtextotitulo /*Object*/ ;
RDebugUtils.currentLine=146079759;
 //BA.debugLineNum = 146079759;BA.debugLine="Dialog.TitleBarFont=mFuenteTextoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._mfuentetextotitulo /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=146079761;
 //BA.debugLineNum = 146079761;BA.debugLine="Dialog.TitleBarTextColor=mColorTextoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebartextcolor /*int*/  = __ref._mcolortextotitulo /*int*/ ;
RDebugUtils.currentLine=146079762;
 //BA.debugLineNum = 146079762;BA.debugLine="Dialog.TitleBarColor=mColorFondoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarcolor /*int*/  = __ref._mcolorfondotitulo /*int*/ ;
RDebugUtils.currentLine=146079763;
 //BA.debugLineNum = 146079763;BA.debugLine="Dialog.TitleBarHeight=mAltoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = __ref._maltotitulo /*int*/ ;
RDebugUtils.currentLine=146079767;
 //BA.debugLineNum = 146079767;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=146079768;
 //BA.debugLineNum = 146079768;BA.debugLine="Dialog.ButtonsHeight=mAltoBotonesDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/  = __ref._maltobotonesdialogo /*int*/ ;
RDebugUtils.currentLine=146079771;
 //BA.debugLineNum = 146079771;BA.debugLine="Dim hTitulo As Int=MeasureMultilineTextHeight(xui";
_htitulo = (int) (__ref._measuremultilinetextheight /*double*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._mfuentetextotitulo /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._mtamanofuentetitulo /*float*/ ),__ref._manchodialogo /*int*/ -parent.__c.DipToCurrent((int) (10)),BA.ObjectToString(__ref._mtextotitulo /*Object*/ )));
RDebugUtils.currentLine=146079772;
 //BA.debugLineNum = 146079772;BA.debugLine="hTitulo=hTitulo+5dip";
_htitulo = (int) (_htitulo+parent.__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=146079773;
 //BA.debugLineNum = 146079773;BA.debugLine="Dim hlblDummyMensaje As Int=MeasureMultilineTextH";
_hlbldummymensaje = (int) (__ref._measuremultilinetextheight /*double*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont2(__ref._mfuentetextomensaje /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._mtamanofuentetextomensaje /*float*/ ),__ref._manchodialogo /*int*/ -parent.__c.DipToCurrent((int) (10)),BA.ObjectToString(__ref._mtextomensaje /*Object*/ )));
RDebugUtils.currentLine=146079774;
 //BA.debugLineNum = 146079774;BA.debugLine="hlblDummyMensaje=hlblDummyMensaje";
_hlbldummymensaje = _hlbldummymensaje;
RDebugUtils.currentLine=146079793;
 //BA.debugLineNum = 146079793;BA.debugLine="Dialog.TitleBarHeight=Min(Max(hTitulo,mAltoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = (int) (parent.__c.Min(parent.__c.Max(_htitulo,__ref._maltotitulo /*int*/ ),__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2));
RDebugUtils.currentLine=146079794;
 //BA.debugLineNum = 146079794;BA.debugLine="mAltoTitulo=Dialog.TitleBarHeight";
__ref._maltotitulo /*int*/  = __ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/ ;
RDebugUtils.currentLine=146079802;
 //BA.debugLineNum = 146079802;BA.debugLine="If hlblDummyMensaje>MaxAltoDialogoMensajeCorto-mA";
if (true) break;

case 1:
//if
this.state = 12;
if (_hlbldummymensaje>__ref._maxaltodialogomensajecorto /*int*/ -__ref._maltotitulo /*int*/ -__ref._maltobotonesdialogo /*int*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=146079804;
 //BA.debugLineNum = 146079804;BA.debugLine="UsaB4XLongTextTemplate=True";
__ref._usab4xlongtexttemplate /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=146079808;
 //BA.debugLineNum = 146079808;BA.debugLine="Dim Dltxt As jamB4XLongTextTemplate";
_dltxt = new b4j.docU.jamb4xlongtexttemplate();
RDebugUtils.currentLine=146079809;
 //BA.debugLineNum = 146079809;BA.debugLine="Dltxt.Initialize";
_dltxt._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=146079810;
 //BA.debugLineNum = 146079810;BA.debugLine="Dltxt.Text=mTextoMensaje";
_dltxt._text /*Object*/  = __ref._mtextomensaje /*Object*/ ;
RDebugUtils.currentLine=146079811;
 //BA.debugLineNum = 146079811;BA.debugLine="Dltxt.TextBackgroundColor=mColorFondoMensaje";
_dltxt._textbackgroundcolor /*int*/  = __ref._mcolorfondomensaje /*int*/ ;
RDebugUtils.currentLine=146079812;
 //BA.debugLineNum = 146079812;BA.debugLine="Dltxt.TextColor=mColorTextoMensaje";
_dltxt._textcolor /*int*/  = __ref._mcolortextomensaje /*int*/ ;
RDebugUtils.currentLine=146079813;
 //BA.debugLineNum = 146079813;BA.debugLine="Dltxt.TextFont=mFuenteTextoMensaje";
_dltxt._textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._mfuentetextomensaje /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=146079814;
 //BA.debugLineNum = 146079814;BA.debugLine="Dltxt.TextSize=mTamanoFuenteTextoMensaje";
_dltxt._textsize /*float*/  = __ref._mtamanofuentetextomensaje /*float*/ ;
RDebugUtils.currentLine=146079815;
 //BA.debugLineNum = 146079815;BA.debugLine="Dltxt.CLVBackgroundColor=mColorFondoDialogo";
_dltxt._clvbackgroundcolor /*int*/  = __ref._mcolorfondodialogo /*int*/ ;
RDebugUtils.currentLine=146079816;
 //BA.debugLineNum = 146079816;BA.debugLine="Dltxt.CustomListView1.sv.Color=mColorFondoDialog";
_dltxt._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._mcolorfondodialogo /*int*/ );
RDebugUtils.currentLine=146079818;
 //BA.debugLineNum = 146079818;BA.debugLine="Dim clvLT As CustomListView=Dltxt.CustomListView";
_clvlt = _dltxt._customlistview1 /*b4j.example.customlistview*/ ;
RDebugUtils.currentLine=146079838;
 //BA.debugLineNum = 146079838;BA.debugLine="Dltxt.Resize(mAnchoDialogo-5dip,Max(mAltoDialogo";
_dltxt._resize /*String*/ (null,(int) (__ref._manchodialogo /*int*/ -parent.__c.DipToCurrent((int) (5))),(int) (parent.__c.Max(__ref._maltodialogo /*int*/ -__ref._maltobotonesdialogo /*int*/ +__ref._mtamanofuentetextomensaje /*float*/ /(double)2,parent.__c.DipToCurrent((int) (100)))));
RDebugUtils.currentLine=146079847;
 //BA.debugLineNum = 146079847;BA.debugLine="Dim rSub As ResumableSub=Dialog.Showtemplate(Dlt";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(_dltxt),(Object)(__ref._mtextobotonpositive /*String*/ ),(Object)(__ref._mtextobotonnegative /*String*/ ),(Object)(__ref._mtextobotoncancel /*String*/ ));
RDebugUtils.currentLine=146079848;
 //BA.debugLineNum = 146079848;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jammsgdialog", "mostraraviso"),(int) (0));
this.state = 67;
return;
case 67:
//C
this.state = 12;
;
RDebugUtils.currentLine=146079849;
 //BA.debugLineNum = 146079849;BA.debugLine="Dim p As B4XView=getPanelMensaje";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=146079850;
 //BA.debugLineNum = 146079850;BA.debugLine="p.Color=mColorFondoMensaje";
_p.setColor(__ref._mcolorfondomensaje /*int*/ );
RDebugUtils.currentLine=146079881;
 //BA.debugLineNum = 146079881;BA.debugLine="Dim  NumeroBotonesDialog As Int";
_numerobotonesdialog = 0;
RDebugUtils.currentLine=146079882;
 //BA.debugLineNum = 146079882;BA.debugLine="NumeroBotonesDialog=BooleanToInt(mTextoBotonPosi";
_numerobotonesdialog = (int) (__ref._booleantoint /*int*/ (null,__ref._mtextobotonpositive /*String*/ .length()>0)+__ref._booleantoint /*int*/ (null,__ref._mtextobotoncancel /*String*/ .length()>0)+__ref._booleantoint /*int*/ (null,__ref._mtextobotonnegative /*String*/ .length()>0));
RDebugUtils.currentLine=146079883;
 //BA.debugLineNum = 146079883;BA.debugLine="Dim wHueco As Double=10dip";
_whueco = parent.__c.DipToCurrent((int) (10));
RDebugUtils.currentLine=146079884;
 //BA.debugLineNum = 146079884;BA.debugLine="Dim wTotalHuecos As Double=wHueco*(NumeroBotones";
_wtotalhuecos = _whueco*(_numerobotonesdialog+1);
RDebugUtils.currentLine=146079885;
 //BA.debugLineNum = 146079885;BA.debugLine="Dim wDispBotones As Double=Dialog.Base.Width-wTo";
_wdispbotones = __ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_wtotalhuecos;
RDebugUtils.currentLine=146079886;
 //BA.debugLineNum = 146079886;BA.debugLine="Dim AnchoBotonesDialog As Double=wDispBotones/Nu";
_anchobotonesdialog = _wdispbotones/(double)_numerobotonesdialog;
RDebugUtils.currentLine=146079900;
 //BA.debugLineNum = 146079900;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jammsgdialog", "mostraraviso"),(int) (0));
this.state = 68;
return;
case 68:
//C
this.state = 12;
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=146079914;
 //BA.debugLineNum = 146079914;BA.debugLine="UsaB4XLongTextTemplate=False";
__ref._usab4xlongtexttemplate /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=146079915;
 //BA.debugLineNum = 146079915;BA.debugLine="Dim rSub As ResumableSub=Dialog.Show(mTextoMensa";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._show /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mtextomensaje /*Object*/ ,(Object)(__ref._mtextobotonpositive /*String*/ ),(Object)(__ref._mtextobotonnegative /*String*/ ),(Object)(__ref._mtextobotoncancel /*String*/ ));
RDebugUtils.currentLine=146079916;
 //BA.debugLineNum = 146079916;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jammsgdialog", "mostraraviso"),(int) (0));
this.state = 69;
return;
case 69:
//C
this.state = 6;
;
RDebugUtils.currentLine=146079921;
 //BA.debugLineNum = 146079921;BA.debugLine="mAltoDialogo=Max(hlblDummyMensaje+mAltoTitulo+mA";
__ref._maltodialogo /*int*/  = (int) (parent.__c.Max(_hlbldummymensaje+__ref._maltotitulo /*int*/ +__ref._maltobotonesdialogo /*int*/ +parent.__c.DipToCurrent((int) (15)),__ref._minaltodialogomensajecorto /*int*/ ));
RDebugUtils.currentLine=146079923;
 //BA.debugLineNum = 146079923;BA.debugLine="Dialog.Base.Width=mAnchoDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._manchodialogo /*int*/ );
RDebugUtils.currentLine=146079924;
 //BA.debugLineNum = 146079924;BA.debugLine="Dialog.Base.Height=mAltoDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._maltodialogo /*int*/ );
RDebugUtils.currentLine=146079925;
 //BA.debugLineNum = 146079925;BA.debugLine="Dialog.Base.Left=Max(10dip,(mBaseDialogo.Width-D";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(parent.__c.Max(parent.__c.DipToCurrent((int) (10)),(__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())/(double)2));
RDebugUtils.currentLine=146079927;
 //BA.debugLineNum = 146079927;BA.debugLine="Dim  NumeroBotonesDialog As Int";
_numerobotonesdialog = 0;
RDebugUtils.currentLine=146079928;
 //BA.debugLineNum = 146079928;BA.debugLine="NumeroBotonesDialog=BooleanToInt(mTextoBotonPosi";
_numerobotonesdialog = (int) (__ref._booleantoint /*int*/ (null,__ref._mtextobotonpositive /*String*/ .length()>0)+__ref._booleantoint /*int*/ (null,__ref._mtextobotoncancel /*String*/ .length()>0)+__ref._booleantoint /*int*/ (null,__ref._mtextobotonnegative /*String*/ .length()>0));
RDebugUtils.currentLine=146079929;
 //BA.debugLineNum = 146079929;BA.debugLine="Dim wHueco As Double=10dip";
_whueco = parent.__c.DipToCurrent((int) (10));
RDebugUtils.currentLine=146079930;
 //BA.debugLineNum = 146079930;BA.debugLine="Dim wTotalHuecos As Double=wHueco*(NumeroBotones";
_wtotalhuecos = _whueco*(_numerobotonesdialog+1);
RDebugUtils.currentLine=146079931;
 //BA.debugLineNum = 146079931;BA.debugLine="Dim wDispBotones As Double=Dialog.Base.Width-wTo";
_wdispbotones = __ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_wtotalhuecos;
RDebugUtils.currentLine=146079932;
 //BA.debugLineNum = 146079932;BA.debugLine="Dim AnchoBotonesDialog As Double=wDispBotones/Nu";
_anchobotonesdialog = _wdispbotones/(double)_numerobotonesdialog;
RDebugUtils.currentLine=146079934;
 //BA.debugLineNum = 146079934;BA.debugLine="If mTextoTitulo=\"\" Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((__ref._mtextotitulo /*Object*/ ).equals((Object)(""))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=146079935;
 //BA.debugLineNum = 146079935;BA.debugLine="Dim pInterior As B4XView=Dialog.Base.GetView(Nu";
_pinterior = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pinterior = __ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_numerobotonesdialog);
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=146079937;
 //BA.debugLineNum = 146079937;BA.debugLine="Dim pInterior As B4XView=Dialog.Base.GetView(Nu";
_pinterior = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pinterior = __ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (_numerobotonesdialog+1));
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=146079939;
 //BA.debugLineNum = 146079939;BA.debugLine="pInterior.Width=Dialog.Base.Width-4dip";
_pinterior.setWidth(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-parent.__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=146079940;
 //BA.debugLineNum = 146079940;BA.debugLine="pInterior.Height=Dialog.Base.Height-mAltoTitulo-";
_pinterior.setHeight(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._maltotitulo /*int*/ -__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ );
RDebugUtils.currentLine=146079941;
 //BA.debugLineNum = 146079941;BA.debugLine="pInterior.Color=mColorFondoMensaje";
_pinterior.setColor(__ref._mcolorfondomensaje /*int*/ );
RDebugUtils.currentLine=146079943;
 //BA.debugLineNum = 146079943;BA.debugLine="Dim b4xlbl As B4XView=pInterior.Getview(0)";
_b4xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xlbl = _pinterior.GetView((int) (0));
RDebugUtils.currentLine=146079944;
 //BA.debugLineNum = 146079944;BA.debugLine="b4xlbl.TextColor=mColorTextoMensaje";
_b4xlbl.setTextColor(__ref._mcolortextomensaje /*int*/ );
RDebugUtils.currentLine=146079945;
 //BA.debugLineNum = 146079945;BA.debugLine="b4xlbl.TextSize=mTamanoFuenteTextoMensaje";
_b4xlbl.setTextSize(__ref._mtamanofuentetextomensaje /*float*/ );
RDebugUtils.currentLine=146079946;
 //BA.debugLineNum = 146079946;BA.debugLine="b4xlbl.Width=pInterior.Width-5dip";
_b4xlbl.setWidth(_pinterior.getWidth()-parent.__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=146079947;
 //BA.debugLineNum = 146079947;BA.debugLine="b4xlbl.Height=pInterior.Height";
_b4xlbl.setHeight(_pinterior.getHeight());
RDebugUtils.currentLine=146079948;
 //BA.debugLineNum = 146079948;BA.debugLine="b4xlbl.SetTextAlignment(mAlineacionVerticalMsg,m";
_b4xlbl.SetTextAlignment(__ref._malineacionverticalmsg /*String*/ ,__ref._malineacionhorizontalmsg /*String*/ );
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=146079953;
 //BA.debugLineNum = 146079953;BA.debugLine="Dialog.Base.Top=Max(5dip,(mBaseDialogo.Height-mAl";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(parent.__c.Max(parent.__c.DipToCurrent((int) (5)),(__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._maltodialogo /*int*/ )/(double)2));
RDebugUtils.currentLine=146079955;
 //BA.debugLineNum = 146079955;BA.debugLine="If mTextoTitulo<>\"\" Then";
if (true) break;

case 13:
//if
this.state = 20;
if ((__ref._mtextotitulo /*Object*/ ).equals((Object)("")) == false) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=146079956;
 //BA.debugLineNum = 146079956;BA.debugLine="Dialog.TitleBar.Width=Dialog.Base.Width-Dialog.B";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._dialog /*b4j.docU.b4xdialog*/ ._borderwidth /*int*/ *2);
RDebugUtils.currentLine=146079957;
 //BA.debugLineNum = 146079957;BA.debugLine="Dim lblTitle As B4XView=Dialog.TitleBar.GetView(";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbltitle = __ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=146079958;
 //BA.debugLineNum = 146079958;BA.debugLine="lblTitle.Width=Dialog.TitleBar.Width";
_lbltitle.setWidth(__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=146079959;
 //BA.debugLineNum = 146079959;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\",\"CENTER\")";
_lbltitle.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=146079960;
 //BA.debugLineNum = 146079960;BA.debugLine="Dim lblT As Label=Dialog.TitleBar.GetView(0)";
_lblt = new anywheresoftware.b4j.objects.LabelWrapper();
_lblt = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getObject()));
RDebugUtils.currentLine=146079962;
 //BA.debugLineNum = 146079962;BA.debugLine="lblT.WrapText = True";
_lblt.setWrapText(parent.__c.True);
RDebugUtils.currentLine=146079969;
 //BA.debugLineNum = 146079969;BA.debugLine="If mNombreFicheroIconoTitulo<>\"\" Then";
if (true) break;

case 16:
//if
this.state = 19;
if ((__ref._mnombreficheroiconotitulo /*String*/ ).equals("") == false) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=146079970;
 //BA.debugLineNum = 146079970;BA.debugLine="Private ivIcon As ImageView";
_ivicon = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=146079971;
 //BA.debugLineNum = 146079971;BA.debugLine="ivIcon.Initialize(\"\")";
_ivicon.Initialize(ba,"");
RDebugUtils.currentLine=146079972;
 //BA.debugLineNum = 146079972;BA.debugLine="Dim MedidaLadoIcono As Double=Min(Min(20dip,Dia";
_medidaladoicono = parent.__c.Min(parent.__c.Min(parent.__c.DipToCurrent((int) (20)),__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),parent.__c.Min(parent.__c.DipToCurrent((int) (20)),__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=146079973;
 //BA.debugLineNum = 146079973;BA.debugLine="Dialog.TitleBar.AddView(ivIcon,5dip,5dip,Medida";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_ivicon.getObject()),parent.__c.DipToCurrent((int) (5)),parent.__c.DipToCurrent((int) (5)),_medidaladoicono,_medidaladoicono);
RDebugUtils.currentLine=146079975;
 //BA.debugLineNum = 146079975;BA.debugLine="Dim B4XivIcon As B4XView=ivIcon";
_b4xivicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xivicon = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ivicon.getObject()));
RDebugUtils.currentLine=146079976;
 //BA.debugLineNum = 146079976;BA.debugLine="B4XivIcon.SetBitmap(xui.LoadBitmapResize(File.D";
_b4xivicon.SetBitmap((javafx.scene.image.Image)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(parent.__c.File.getDirAssets(),__ref._mnombreficheroiconotitulo /*String*/ ,(int) (_medidaladoicono),(int) (_medidaladoicono),parent.__c.True).getObject()));
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=146079980;
 //BA.debugLineNum = 146079980;BA.debugLine="mPanelTitulo=xui.CreatePanel(\"mPanelTitulo\")  '";
__ref._mpaneltitulo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mPanelTitulo");
RDebugUtils.currentLine=146079981;
 //BA.debugLineNum = 146079981;BA.debugLine="Dialog.TitleBar.AddView(mPanelTitulo,0,0,Dialog.";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpaneltitulo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=146079985;
 //BA.debugLineNum = 146079985;BA.debugLine="Dim fnt As B4XFont=xui.CreateFont(Dialog.ButtonsF";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont((javafx.scene.text.Font)(__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject()),__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=146079991;
 //BA.debugLineNum = 146079991;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
if (true) break;

case 21:
//if
this.state = 32;
if ((__ref._mtextobotonpositive /*String*/ ).equals("") == false) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=146079992;
 //BA.debugLineNum = 146079992;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRe";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=146079993;
 //BA.debugLineNum = 146079993;BA.debugLine="bOK.TextSize=mTamanoFuenteBotonesDialogo";
_bok.setTextSize(__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=146079994;
 //BA.debugLineNum = 146079994;BA.debugLine="Dim TextWidthBOk As Int = MeasurementCanvas.Meas";
_textwidthbok = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._mtextobotonpositive /*String*/ ,_fnt).getWidth());
RDebugUtils.currentLine=146079996;
 //BA.debugLineNum = 146079996;BA.debugLine="bOK.Width=AnchoBotonesDialog";
_bok.setWidth(_anchobotonesdialog);
RDebugUtils.currentLine=146079997;
 //BA.debugLineNum = 146079997;BA.debugLine="Select Case NumeroBotonesDialog";
if (true) break;

case 24:
//select
this.state = 31;
switch (_numerobotonesdialog) {
case 1: {
this.state = 26;
if (true) break;
}
case 2: {
this.state = 28;
if (true) break;
}
case 3: {
this.state = 30;
if (true) break;
}
}
if (true) break;

case 26:
//C
this.state = 31;
RDebugUtils.currentLine=146079999;
 //BA.debugLineNum = 146079999;BA.debugLine="bOK.Left=(Dialog.Base.Width-AnchoBotonesDialog";
_bok.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_anchobotonesdialog)/(double)2);
 if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=146080001;
 //BA.debugLineNum = 146080001;BA.debugLine="bOK.Left=wHueco";
_bok.setLeft(_whueco);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=146080003;
 //BA.debugLineNum = 146080003;BA.debugLine="bOK.Left=wHueco";
_bok.setLeft(_whueco);
 if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=146080006;
 //BA.debugLineNum = 146080006;BA.debugLine="bOK.SetTextAlignment(\"CENTER\", \"CENTER\")";
_bok.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=146080007;
 //BA.debugLineNum = 146080007;BA.debugLine="bOK.Top=Dialog.Base.Height-Dialog.ButtonsHeight-";
_bok.setTop(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=146080008;
 //BA.debugLineNum = 146080008;BA.debugLine="bOK.Color=mColorFondoBotonPositive";
_bok.setColor(__ref._mcolorfondobotonpositive /*int*/ );
RDebugUtils.currentLine=146080009;
 //BA.debugLineNum = 146080009;BA.debugLine="bOK.TextColor=mColorTextoBotonPositive";
_bok.setTextColor(__ref._mcolortextobotonpositive /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=146080013;
 //BA.debugLineNum = 146080013;BA.debugLine="If mTextoBotonCancel<>\"\" Then";

case 32:
//if
this.state = 49;
if ((__ref._mtextobotoncancel /*String*/ ).equals("") == false) { 
this.state = 34;
}if (true) break;

case 34:
//C
this.state = 35;
RDebugUtils.currentLine=146080014;
 //BA.debugLineNum = 146080014;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dial";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=146080015;
 //BA.debugLineNum = 146080015;BA.debugLine="bCancel.TextSize=mTamanoFuenteBotonesDialogo";
_bcancel.setTextSize(__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=146080016;
 //BA.debugLineNum = 146080016;BA.debugLine="Dim TextWidthBCancel As Int = MeasurementCanvas.";
_textwidthbcancel = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._mtextobotoncancel /*String*/ ,_fnt).getWidth());
RDebugUtils.currentLine=146080017;
 //BA.debugLineNum = 146080017;BA.debugLine="bCancel.Width=AnchoBotonesDialog";
_bcancel.setWidth(_anchobotonesdialog);
RDebugUtils.currentLine=146080018;
 //BA.debugLineNum = 146080018;BA.debugLine="Select Case NumeroBotonesDialog";
if (true) break;

case 35:
//select
this.state = 48;
switch (_numerobotonesdialog) {
case 1: {
this.state = 37;
if (true) break;
}
case 2: {
this.state = 39;
if (true) break;
}
case 3: {
this.state = 47;
if (true) break;
}
}
if (true) break;

case 37:
//C
this.state = 48;
RDebugUtils.currentLine=146080020;
 //BA.debugLineNum = 146080020;BA.debugLine="bCancel.Left=(Dialog.Base.Width-AnchoBotonesDi";
_bcancel.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_anchobotonesdialog)/(double)2);
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=146080022;
 //BA.debugLineNum = 146080022;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
if (true) break;

case 40:
//if
this.state = 45;
if ((__ref._mtextobotonpositive /*String*/ ).equals("") == false) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 45;
RDebugUtils.currentLine=146080023;
 //BA.debugLineNum = 146080023;BA.debugLine="bCancel.Left= wHueco+AnchoBotonesDialog+wHuec";
_bcancel.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 44:
//C
this.state = 45;
RDebugUtils.currentLine=146080025;
 //BA.debugLineNum = 146080025;BA.debugLine="bCancel.Left= wHueco";
_bcancel.setLeft(_whueco);
 if (true) break;

case 45:
//C
this.state = 48;
;
 if (true) break;

case 47:
//C
this.state = 48;
RDebugUtils.currentLine=146080028;
 //BA.debugLineNum = 146080028;BA.debugLine="bCancel.Left=wHueco+AnchoBotonesDialog+wHueco";
_bcancel.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 48:
//C
this.state = 49;
;
RDebugUtils.currentLine=146080031;
 //BA.debugLineNum = 146080031;BA.debugLine="bCancel.SetTextAlignment(\"CENTER\", \"CENTER\")";
_bcancel.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=146080032;
 //BA.debugLineNum = 146080032;BA.debugLine="bCancel.Top=Dialog.Base.Height-Dialog.ButtonsHei";
_bcancel.setTop(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=146080033;
 //BA.debugLineNum = 146080033;BA.debugLine="bCancel.Color=mColorFondoBotonCancel";
_bcancel.setColor(__ref._mcolorfondobotoncancel /*int*/ );
RDebugUtils.currentLine=146080034;
 //BA.debugLineNum = 146080034;BA.debugLine="bCancel.textColor=mColorTextoBotonCancel";
_bcancel.setTextColor(__ref._mcolortextobotoncancel /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=146080038;
 //BA.debugLineNum = 146080038;BA.debugLine="If mTextoBotonNegative<>\"\" Then";

case 49:
//if
this.state = 66;
if ((__ref._mtextobotonnegative /*String*/ ).equals("") == false) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=146080039;
 //BA.debugLineNum = 146080039;BA.debugLine="Dim bNegative As B4XView=Dialog.GetButton(xui.Di";
_bnegative = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bnegative = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative);
RDebugUtils.currentLine=146080040;
 //BA.debugLineNum = 146080040;BA.debugLine="bNegative.TextSize=mTamanoFuenteBotonesDialogo";
_bnegative.setTextSize(__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=146080041;
 //BA.debugLineNum = 146080041;BA.debugLine="Dim TextWidthBNo As Int = MeasurementCanvas.Meas";
_textwidthbno = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._mtextobotonnegative /*String*/ ,_fnt).getWidth());
RDebugUtils.currentLine=146080042;
 //BA.debugLineNum = 146080042;BA.debugLine="bNegative.Width=AnchoBotonesDialog";
_bnegative.setWidth(_anchobotonesdialog);
RDebugUtils.currentLine=146080043;
 //BA.debugLineNum = 146080043;BA.debugLine="Select Case NumeroBotonesDialog";
if (true) break;

case 52:
//select
this.state = 65;
switch (_numerobotonesdialog) {
case 1: {
this.state = 54;
if (true) break;
}
case 2: {
this.state = 56;
if (true) break;
}
case 3: {
this.state = 64;
if (true) break;
}
}
if (true) break;

case 54:
//C
this.state = 65;
RDebugUtils.currentLine=146080045;
 //BA.debugLineNum = 146080045;BA.debugLine="bNegative.Left=(Dialog.Base.Width-AnchoBotones";
_bnegative.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_anchobotonesdialog)/(double)2);
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=146080047;
 //BA.debugLineNum = 146080047;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
if (true) break;

case 57:
//if
this.state = 62;
if ((__ref._mtextobotonpositive /*String*/ ).equals("") == false) { 
this.state = 59;
}else {
this.state = 61;
}if (true) break;

case 59:
//C
this.state = 62;
RDebugUtils.currentLine=146080048;
 //BA.debugLineNum = 146080048;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
_bnegative.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 61:
//C
this.state = 62;
RDebugUtils.currentLine=146080050;
 //BA.debugLineNum = 146080050;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
_bnegative.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 62:
//C
this.state = 65;
;
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=146080053;
 //BA.debugLineNum = 146080053;BA.debugLine="bNegative.Left=wHueco+AnchoBotonesDialog+wHuec";
_bnegative.setLeft(_whueco+_anchobotonesdialog+_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 65:
//C
this.state = 66;
;
RDebugUtils.currentLine=146080056;
 //BA.debugLineNum = 146080056;BA.debugLine="bNegative.SetTextAlignment(\"CENTER\", \"CENTER\")";
_bnegative.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=146080057;
 //BA.debugLineNum = 146080057;BA.debugLine="bNegative.Top=Dialog.Base.Height-Dialog.ButtonsH";
_bnegative.setTop(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=146080058;
 //BA.debugLineNum = 146080058;BA.debugLine="bNegative.Color=mColorFondoBotonNegative";
_bnegative.setColor(__ref._mcolorfondobotonnegative /*int*/ );
RDebugUtils.currentLine=146080059;
 //BA.debugLineNum = 146080059;BA.debugLine="bNegative.TextColor=mColorTextoBotonNegative";
_bnegative.setTextColor(__ref._mcolortextobotonnegative /*int*/ );
 if (true) break;

case 66:
//C
this.state = -1;
;
RDebugUtils.currentLine=146080105;
 //BA.debugLineNum = 146080105;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jammsgdialog", "mostraraviso"), _rsub);
this.state = 70;
return;
case 70:
//C
this.state = -1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=146080107;
 //BA.debugLineNum = 146080107;BA.debugLine="Return rInt";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rint));return;};
RDebugUtils.currentLine=146080108;
 //BA.debugLineNum = 146080108;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _mpaneltitulo_touch(b4j.docU.jammsgdialog __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "mpaneltitulo_touch", true))
	 {return ((String) Debug.delegate(ba, "mpaneltitulo_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=146407424;
 //BA.debugLineNum = 146407424;BA.debugLine="Private Sub mPanelTitulo_Touch(Action As Int, X As";
RDebugUtils.currentLine=146407426;
 //BA.debugLineNum = 146407426;BA.debugLine="If mMovible Then";
if (__ref._mmovible /*boolean*/ ) { 
RDebugUtils.currentLine=146407428;
 //BA.debugLineNum = 146407428;BA.debugLine="If Action = Dialog.TitleBar.TOUCH_ACTION_DOWN Th";
if (_action==__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=146407429;
 //BA.debugLineNum = 146407429;BA.debugLine="DownX  = X";
__ref._downx /*double*/  = _x;
RDebugUtils.currentLine=146407430;
 //BA.debugLineNum = 146407430;BA.debugLine="DownY  = y";
__ref._downy /*double*/  = _y;
 }else 
{RDebugUtils.currentLine=146407431;
 //BA.debugLineNum = 146407431;BA.debugLine="Else if Action = Dialog.TitleBar.TOUCH_ACTION_MO";
if (_action==__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=146407432;
 //BA.debugLineNum = 146407432;BA.debugLine="Dialog.Base.Top = Min(Max(Dialog.Base.Top + y -";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(__c.Min(__c.Max(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*double*/ ,0),__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=146407433;
 //BA.debugLineNum = 146407433;BA.debugLine="Dialog.Base.Left = Min(Max(Dialog.Base.Left + x";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.Min(__c.Max(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_x-__ref._downx /*double*/ ,0),__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
 }}
;
 };
RDebugUtils.currentLine=146407436;
 //BA.debugLineNum = 146407436;BA.debugLine="End Sub";
return "";
}
public String  _setalineacionhorizontalmsg(b4j.docU.jammsgdialog __ref,String _alineacionhorizontal) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setalineacionhorizontalmsg", true))
	 {return ((String) Debug.delegate(ba, "setalineacionhorizontalmsg", new Object[] {_alineacionhorizontal}));}
RDebugUtils.currentLine=145031168;
 //BA.debugLineNum = 145031168;BA.debugLine="Sub setAlineacionHorizontalMsg(AlineacionHorizonta";
RDebugUtils.currentLine=145031169;
 //BA.debugLineNum = 145031169;BA.debugLine="mAlineacionHorizontalMsg=AlineacionHorizontal";
__ref._malineacionhorizontalmsg /*String*/  = _alineacionhorizontal;
RDebugUtils.currentLine=145031170;
 //BA.debugLineNum = 145031170;BA.debugLine="End Sub";
return "";
}
public String  _setalineacionverticalmsg(b4j.docU.jammsgdialog __ref,String _alineacionvertical) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setalineacionverticalmsg", true))
	 {return ((String) Debug.delegate(ba, "setalineacionverticalmsg", new Object[] {_alineacionvertical}));}
RDebugUtils.currentLine=144965632;
 //BA.debugLineNum = 144965632;BA.debugLine="Sub setAlineacionVerticalMsg(AlineacionVertical As";
RDebugUtils.currentLine=144965633;
 //BA.debugLineNum = 144965633;BA.debugLine="mAlineacionVerticalMsg=AlineacionVertical";
__ref._malineacionverticalmsg /*String*/  = _alineacionvertical;
RDebugUtils.currentLine=144965634;
 //BA.debugLineNum = 144965634;BA.debugLine="End Sub";
return "";
}
public String  _setaltobotonesdialogo(b4j.docU.jammsgdialog __ref,int _altobotonesdialogo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setaltobotonesdialogo", true))
	 {return ((String) Debug.delegate(ba, "setaltobotonesdialogo", new Object[] {_altobotonesdialogo}));}
RDebugUtils.currentLine=145096704;
 //BA.debugLineNum = 145096704;BA.debugLine="Sub setAltoBotonesDialogo(AltoBotonesDialogo As In";
RDebugUtils.currentLine=145096705;
 //BA.debugLineNum = 145096705;BA.debugLine="mAltoBotonesDialogo=AltoBotonesDialogo";
__ref._maltobotonesdialogo /*int*/  = _altobotonesdialogo;
RDebugUtils.currentLine=145096706;
 //BA.debugLineNum = 145096706;BA.debugLine="End Sub";
return "";
}
public String  _setaltodialogo(b4j.docU.jammsgdialog __ref,int _altodlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setaltodialogo", true))
	 {return ((String) Debug.delegate(ba, "setaltodialogo", new Object[] {_altodlg}));}
RDebugUtils.currentLine=144179200;
 //BA.debugLineNum = 144179200;BA.debugLine="Sub setAltoDialogo(AltoDlg As Int)";
RDebugUtils.currentLine=144179201;
 //BA.debugLineNum = 144179201;BA.debugLine="mAltoDialogo=Min(AltoDlg, 0.9*mBaseDialogo.Height";
__ref._maltodialogo /*int*/  = (int) (__c.Min(_altodlg,0.9*__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=144179202;
 //BA.debugLineNum = 144179202;BA.debugLine="End Sub";
return "";
}
public String  _setaltotitulo(b4j.docU.jammsgdialog __ref,int _altotitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setaltotitulo", true))
	 {return ((String) Debug.delegate(ba, "setaltotitulo", new Object[] {_altotitulo}));}
RDebugUtils.currentLine=144310272;
 //BA.debugLineNum = 144310272;BA.debugLine="Sub setAltoTitulo(AltoTitulo As Int)";
RDebugUtils.currentLine=144310273;
 //BA.debugLineNum = 144310273;BA.debugLine="mAltoTitulo=AltoTitulo";
__ref._maltotitulo /*int*/  = _altotitulo;
RDebugUtils.currentLine=144310274;
 //BA.debugLineNum = 144310274;BA.debugLine="End Sub";
return "";
}
public String  _setanchobordedialogo(b4j.docU.jammsgdialog __ref,int _anchobordedialogo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setanchobordedialogo", true))
	 {return ((String) Debug.delegate(ba, "setanchobordedialogo", new Object[] {_anchobordedialogo}));}
RDebugUtils.currentLine=146014208;
 //BA.debugLineNum = 146014208;BA.debugLine="Sub setAnchoBordeDialogo(AnchoBordeDialogo As Int)";
RDebugUtils.currentLine=146014209;
 //BA.debugLineNum = 146014209;BA.debugLine="mAnchoBordeDialogo=AnchoBordeDialogo";
__ref._manchobordedialogo /*int*/  = _anchobordedialogo;
RDebugUtils.currentLine=146014210;
 //BA.debugLineNum = 146014210;BA.debugLine="End Sub";
return "";
}
public String  _setanchodialogo(b4j.docU.jammsgdialog __ref,int _anchodlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setanchodialogo", true))
	 {return ((String) Debug.delegate(ba, "setanchodialogo", new Object[] {_anchodlg}));}
RDebugUtils.currentLine=144113664;
 //BA.debugLineNum = 144113664;BA.debugLine="Sub setAnchoDialogo(AnchoDlg As Int)";
RDebugUtils.currentLine=144113665;
 //BA.debugLineNum = 144113665;BA.debugLine="mAnchoDialogo=AnchoDlg";
__ref._manchodialogo /*int*/  = _anchodlg;
RDebugUtils.currentLine=144113666;
 //BA.debugLineNum = 144113666;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondobotoncancel(b4j.docU.jammsgdialog __ref,int _colorbotoncancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolorfondobotoncancel", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondobotoncancel", new Object[] {_colorbotoncancel}));}
RDebugUtils.currentLine=145424384;
 //BA.debugLineNum = 145424384;BA.debugLine="Sub setColorFondoBotonCancel(ColorBotonCancel As I";
RDebugUtils.currentLine=145424385;
 //BA.debugLineNum = 145424385;BA.debugLine="mColorFondoBotonCancel=ColorBotonCancel";
__ref._mcolorfondobotoncancel /*int*/  = _colorbotoncancel;
RDebugUtils.currentLine=145424386;
 //BA.debugLineNum = 145424386;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondobotonnegative(b4j.docU.jammsgdialog __ref,int _colorbotonnegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolorfondobotonnegative", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondobotonnegative", new Object[] {_colorbotonnegative}));}
RDebugUtils.currentLine=145620992;
 //BA.debugLineNum = 145620992;BA.debugLine="Sub setColorFondoBotonNegative(ColorBotonNegative";
RDebugUtils.currentLine=145620993;
 //BA.debugLineNum = 145620993;BA.debugLine="mColorFondoBotonNegative=ColorBotonNegative";
__ref._mcolorfondobotonnegative /*int*/  = _colorbotonnegative;
RDebugUtils.currentLine=145620994;
 //BA.debugLineNum = 145620994;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondobotonpositive(b4j.docU.jammsgdialog __ref,int _colorbotonpositive) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolorfondobotonpositive", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondobotonpositive", new Object[] {_colorbotonpositive}));}
RDebugUtils.currentLine=145227776;
 //BA.debugLineNum = 145227776;BA.debugLine="Sub setColorFondoBotonPositive(ColorBotonPositive";
RDebugUtils.currentLine=145227777;
 //BA.debugLineNum = 145227777;BA.debugLine="mColorFondoBotonPositive=ColorBotonPositive";
__ref._mcolorfondobotonpositive /*int*/  = _colorbotonpositive;
RDebugUtils.currentLine=145227778;
 //BA.debugLineNum = 145227778;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondodialogo(b4j.docU.jammsgdialog __ref,int _colorbackground) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolorfondodialogo", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondodialogo", new Object[] {_colorbackground}));}
RDebugUtils.currentLine=144048128;
 //BA.debugLineNum = 144048128;BA.debugLine="Sub setColorFondoDialogo(ColorBackground As Int)";
RDebugUtils.currentLine=144048129;
 //BA.debugLineNum = 144048129;BA.debugLine="mColorFondoDialogo=ColorBackground";
__ref._mcolorfondodialogo /*int*/  = _colorbackground;
RDebugUtils.currentLine=144048130;
 //BA.debugLineNum = 144048130;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondomensaje(b4j.docU.jammsgdialog __ref,int _colorfondomensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolorfondomensaje", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondomensaje", new Object[] {_colorfondomensaje}));}
RDebugUtils.currentLine=144703488;
 //BA.debugLineNum = 144703488;BA.debugLine="Sub setColorFondoMensaje(ColorFondoMensaje As Int)";
RDebugUtils.currentLine=144703489;
 //BA.debugLineNum = 144703489;BA.debugLine="mColorFondoMensaje=ColorFondoMensaje";
__ref._mcolorfondomensaje /*int*/  = _colorfondomensaje;
RDebugUtils.currentLine=144703490;
 //BA.debugLineNum = 144703490;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondotitulo(b4j.docU.jammsgdialog __ref,int _colorfondotitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolorfondotitulo", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondotitulo", new Object[] {_colorfondotitulo}));}
RDebugUtils.currentLine=144572416;
 //BA.debugLineNum = 144572416;BA.debugLine="Sub setColorFondoTitulo(ColorFondoTitulo As Int)";
RDebugUtils.currentLine=144572417;
 //BA.debugLineNum = 144572417;BA.debugLine="mColorFondoTitulo=ColorFondoTitulo";
__ref._mcolorfondotitulo /*int*/  = _colorfondotitulo;
RDebugUtils.currentLine=144572418;
 //BA.debugLineNum = 144572418;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondotodosbotones(b4j.docU.jammsgdialog __ref,int _colorfondotodosbotones) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolorfondotodosbotones", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondotodosbotones", new Object[] {_colorfondotodosbotones}));}
RDebugUtils.currentLine=145752064;
 //BA.debugLineNum = 145752064;BA.debugLine="Sub setColorFondoTodosBotones(ColorFondoTodosBoton";
RDebugUtils.currentLine=145752065;
 //BA.debugLineNum = 145752065;BA.debugLine="mColorFondoBotonPositive=ColorFondoTodosBotones";
__ref._mcolorfondobotonpositive /*int*/  = _colorfondotodosbotones;
RDebugUtils.currentLine=145752066;
 //BA.debugLineNum = 145752066;BA.debugLine="mColorFondoBotonCancel=ColorFondoTodosBotones";
__ref._mcolorfondobotoncancel /*int*/  = _colorfondotodosbotones;
RDebugUtils.currentLine=145752067;
 //BA.debugLineNum = 145752067;BA.debugLine="mColorFondoBotonNegative=ColorFondoTodosBotones";
__ref._mcolorfondobotonnegative /*int*/  = _colorfondotodosbotones;
RDebugUtils.currentLine=145752068;
 //BA.debugLineNum = 145752068;BA.debugLine="End Sub";
return "";
}
public String  _setcoloroverlay(b4j.docU.jammsgdialog __ref,int _coloroverlay) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcoloroverlay", true))
	 {return ((String) Debug.delegate(ba, "setcoloroverlay", new Object[] {_coloroverlay}));}
RDebugUtils.currentLine=143982592;
 //BA.debugLineNum = 143982592;BA.debugLine="Sub setColorOverlay(ColorOverlay As Int)";
RDebugUtils.currentLine=143982593;
 //BA.debugLineNum = 143982593;BA.debugLine="mColorOverlay=ColorOverlay";
__ref._mcoloroverlay /*int*/  = _coloroverlay;
RDebugUtils.currentLine=143982594;
 //BA.debugLineNum = 143982594;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextobotoncancel(b4j.docU.jammsgdialog __ref,int _colorbotoncancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolortextobotoncancel", true))
	 {return ((String) Debug.delegate(ba, "setcolortextobotoncancel", new Object[] {_colorbotoncancel}));}
RDebugUtils.currentLine=145489920;
 //BA.debugLineNum = 145489920;BA.debugLine="Sub setColorTextoBotonCancel(ColorBotonCancel As I";
RDebugUtils.currentLine=145489921;
 //BA.debugLineNum = 145489921;BA.debugLine="mColorTextoBotonCancel=ColorBotonCancel";
__ref._mcolortextobotoncancel /*int*/  = _colorbotoncancel;
RDebugUtils.currentLine=145489922;
 //BA.debugLineNum = 145489922;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextobotonnegative(b4j.docU.jammsgdialog __ref,int _colorbotonnegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolortextobotonnegative", true))
	 {return ((String) Debug.delegate(ba, "setcolortextobotonnegative", new Object[] {_colorbotonnegative}));}
RDebugUtils.currentLine=145686528;
 //BA.debugLineNum = 145686528;BA.debugLine="Sub setColorTextoBotonNegative(ColorBotonNegative";
RDebugUtils.currentLine=145686529;
 //BA.debugLineNum = 145686529;BA.debugLine="mColorTextoBotonNegative=ColorBotonNegative";
__ref._mcolortextobotonnegative /*int*/  = _colorbotonnegative;
RDebugUtils.currentLine=145686530;
 //BA.debugLineNum = 145686530;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextobotonpositive(b4j.docU.jammsgdialog __ref,int _colorbotonpositive) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolortextobotonpositive", true))
	 {return ((String) Debug.delegate(ba, "setcolortextobotonpositive", new Object[] {_colorbotonpositive}));}
RDebugUtils.currentLine=145293312;
 //BA.debugLineNum = 145293312;BA.debugLine="Sub setColorTextoBotonPositive(ColorBotonPositive";
RDebugUtils.currentLine=145293313;
 //BA.debugLineNum = 145293313;BA.debugLine="mColorTextoBotonPositive=ColorBotonPositive";
__ref._mcolortextobotonpositive /*int*/  = _colorbotonpositive;
RDebugUtils.currentLine=145293314;
 //BA.debugLineNum = 145293314;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextomensaje(b4j.docU.jammsgdialog __ref,int _colortextomensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolortextomensaje", true))
	 {return ((String) Debug.delegate(ba, "setcolortextomensaje", new Object[] {_colortextomensaje}));}
RDebugUtils.currentLine=144769024;
 //BA.debugLineNum = 144769024;BA.debugLine="Sub setColorTextoMensaje(ColorTextoMensaje As Int)";
RDebugUtils.currentLine=144769025;
 //BA.debugLineNum = 144769025;BA.debugLine="mColorTextoMensaje=ColorTextoMensaje";
__ref._mcolortextomensaje /*int*/  = _colortextomensaje;
RDebugUtils.currentLine=144769026;
 //BA.debugLineNum = 144769026;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextotitulo(b4j.docU.jammsgdialog __ref,int _colortextotitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolortextotitulo", true))
	 {return ((String) Debug.delegate(ba, "setcolortextotitulo", new Object[] {_colortextotitulo}));}
RDebugUtils.currentLine=144506880;
 //BA.debugLineNum = 144506880;BA.debugLine="Sub setColorTextoTitulo(ColorTextoTitulo As Int)";
RDebugUtils.currentLine=144506881;
 //BA.debugLineNum = 144506881;BA.debugLine="mColorTextoTitulo=ColorTextoTitulo";
__ref._mcolortextotitulo /*int*/  = _colortextotitulo;
RDebugUtils.currentLine=144506882;
 //BA.debugLineNum = 144506882;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextotodosbotones(b4j.docU.jammsgdialog __ref,int _colortextotodosbotones) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setcolortextotodosbotones", true))
	 {return ((String) Debug.delegate(ba, "setcolortextotodosbotones", new Object[] {_colortextotodosbotones}));}
RDebugUtils.currentLine=145817600;
 //BA.debugLineNum = 145817600;BA.debugLine="Sub setColorTextoTodosBotones(ColorTextoTodosBoton";
RDebugUtils.currentLine=145817601;
 //BA.debugLineNum = 145817601;BA.debugLine="mColorTextoBotonPositive=ColorTextoTodosBotones";
__ref._mcolortextobotonpositive /*int*/  = _colortextotodosbotones;
RDebugUtils.currentLine=145817602;
 //BA.debugLineNum = 145817602;BA.debugLine="mColorTextoBotonCancel=ColorTextoTodosBotones";
__ref._mcolortextobotoncancel /*int*/  = _colortextotodosbotones;
RDebugUtils.currentLine=145817603;
 //BA.debugLineNum = 145817603;BA.debugLine="mColorTextoBotonNegative=ColorTextoTodosBotones";
__ref._mcolortextobotonnegative /*int*/  = _colortextotodosbotones;
RDebugUtils.currentLine=145817604;
 //BA.debugLineNum = 145817604;BA.debugLine="End Sub";
return "";
}
public String  _setfuentelabelmensaje(b4j.docU.jammsgdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setfuentelabelmensaje", true))
	 {return ((String) Debug.delegate(ba, "setfuentelabelmensaje", new Object[] {_xfont}));}
RDebugUtils.currentLine=143851520;
 //BA.debugLineNum = 143851520;BA.debugLine="Sub setFuenteLabelMensaje(xFont As B4XFont)";
RDebugUtils.currentLine=143851523;
 //BA.debugLineNum = 143851523;BA.debugLine="mFuenteTextoMensaje=xFont";
__ref._mfuentetextomensaje /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=143851524;
 //BA.debugLineNum = 143851524;BA.debugLine="End Sub";
return "";
}
public String  _setfuentetextotitulo(b4j.docU.jammsgdialog __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setfuentetextotitulo", true))
	 {return ((String) Debug.delegate(ba, "setfuentetextotitulo", new Object[] {_xfont}));}
RDebugUtils.currentLine=144375808;
 //BA.debugLineNum = 144375808;BA.debugLine="Sub setFuenteTextoTitulo(xFont As B4XFont)";
RDebugUtils.currentLine=144375811;
 //BA.debugLineNum = 144375811;BA.debugLine="mFuenteTextoTitulo=xFont";
__ref._mfuentetextotitulo /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=144375812;
 //BA.debugLineNum = 144375812;BA.debugLine="End Sub";
return "";
}
public String  _setmovible(b4j.docU.jammsgdialog __ref,boolean _movible) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setmovible", true))
	 {return ((String) Debug.delegate(ba, "setmovible", new Object[] {_movible}));}
RDebugUtils.currentLine=143654912;
 //BA.debugLineNum = 143654912;BA.debugLine="Sub setMovible(Movible As Boolean)";
RDebugUtils.currentLine=143654913;
 //BA.debugLineNum = 143654913;BA.debugLine="mMovible=Movible";
__ref._mmovible /*boolean*/  = _movible;
RDebugUtils.currentLine=143654914;
 //BA.debugLineNum = 143654914;BA.debugLine="End Sub";
return "";
}
public String  _setnombreficheroiconobarratitulo(b4j.docU.jammsgdialog __ref,String _nombreficheroicono) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "setnombreficheroiconobarratitulo", true))
	 {return ((String) Debug.delegate(ba, "setnombreficheroiconobarratitulo", new Object[] {_nombreficheroicono}));}
RDebugUtils.currentLine=145948672;
 //BA.debugLineNum = 145948672;BA.debugLine="Sub setNombreFicheroIconoBarraTitulo(NombreFichero";
RDebugUtils.currentLine=145948673;
 //BA.debugLineNum = 145948673;BA.debugLine="mNombreFicheroIconoTitulo=NombreFicheroIcono";
__ref._mnombreficheroiconotitulo /*String*/  = _nombreficheroicono;
RDebugUtils.currentLine=145948674;
 //BA.debugLineNum = 145948674;BA.debugLine="End Sub";
return "";
}
public String  _settamanofuentetextomensaje(b4j.docU.jammsgdialog __ref,float _tamanofuentetextomensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settamanofuentetextomensaje", true))
	 {return ((String) Debug.delegate(ba, "settamanofuentetextomensaje", new Object[] {_tamanofuentetextomensaje}));}
RDebugUtils.currentLine=144900096;
 //BA.debugLineNum = 144900096;BA.debugLine="Sub setTamanoFuenteTextoMensaje(TamanoFuenteTextoM";
RDebugUtils.currentLine=144900097;
 //BA.debugLineNum = 144900097;BA.debugLine="mTamanoFuenteTextoMensaje=TamanoFuenteTextoMensaj";
__ref._mtamanofuentetextomensaje /*float*/  = _tamanofuentetextomensaje;
RDebugUtils.currentLine=144900098;
 //BA.debugLineNum = 144900098;BA.debugLine="End Sub";
return "";
}
public String  _settamanofuentetitulo(b4j.docU.jammsgdialog __ref,float _tamanofuentetitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settamanofuentetitulo", true))
	 {return ((String) Debug.delegate(ba, "settamanofuentetitulo", new Object[] {_tamanofuentetitulo}));}
RDebugUtils.currentLine=144441344;
 //BA.debugLineNum = 144441344;BA.debugLine="Sub setTamanoFuenteTitulo(TamanoFuenteTitulo As Fl";
RDebugUtils.currentLine=144441345;
 //BA.debugLineNum = 144441345;BA.debugLine="mTamanoFuenteTitulo=TamanoFuenteTitulo";
__ref._mtamanofuentetitulo /*float*/  = _tamanofuentetitulo;
RDebugUtils.currentLine=144441346;
 //BA.debugLineNum = 144441346;BA.debugLine="End Sub";
return "";
}
public String  _settamanotextotodosbotones(b4j.docU.jammsgdialog __ref,float _tamanotextotodosbotones) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settamanotextotodosbotones", true))
	 {return ((String) Debug.delegate(ba, "settamanotextotodosbotones", new Object[] {_tamanotextotodosbotones}));}
RDebugUtils.currentLine=145883136;
 //BA.debugLineNum = 145883136;BA.debugLine="Sub setTamanoTextoTodosBotones(TamanoTextoTodosBot";
RDebugUtils.currentLine=145883137;
 //BA.debugLineNum = 145883137;BA.debugLine="mTamanoFuenteBotonesDialogo=TamanoTextoTodosBoton";
__ref._mtamanofuentebotonesdialogo /*float*/  = _tamanotextotodosbotones;
RDebugUtils.currentLine=145883138;
 //BA.debugLineNum = 145883138;BA.debugLine="End Sub";
return "";
}
public String  _settemaoscuro(b4j.docU.jammsgdialog __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settemaoscuro", true))
	 {return ((String) Debug.delegate(ba, "settemaoscuro", null));}
RDebugUtils.currentLine=143589376;
 //BA.debugLineNum = 143589376;BA.debugLine="Public Sub SetTemaOscuro";
RDebugUtils.currentLine=143589378;
 //BA.debugLineNum = 143589378;BA.debugLine="mColorFondoDialogo=0xFF646464";
__ref._mcolorfondodialogo /*int*/  = ((int)0xff646464);
RDebugUtils.currentLine=143589379;
 //BA.debugLineNum = 143589379;BA.debugLine="mColorBordeDialogo=xui.Color_Gray";
__ref._mcolorbordedialogo /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=143589381;
 //BA.debugLineNum = 143589381;BA.debugLine="mColorFondoTitulo=0xFF0083B8  ' azul título dialo";
__ref._mcolorfondotitulo /*int*/  = ((int)0xff0083b8);
RDebugUtils.currentLine=143589382;
 //BA.debugLineNum = 143589382;BA.debugLine="mColorTextoTitulo=xui.Color_White";
__ref._mcolortextotitulo /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=143589384;
 //BA.debugLineNum = 143589384;BA.debugLine="mColorTextoBotonPositive=0xFF89D5FF";
__ref._mcolortextobotonpositive /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=143589385;
 //BA.debugLineNum = 143589385;BA.debugLine="mColorTextoBotonCancel=0xFF89D5FF";
__ref._mcolortextobotoncancel /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=143589386;
 //BA.debugLineNum = 143589386;BA.debugLine="mColorTextoBotonNegative=0xFF89D5FF";
__ref._mcolortextobotonnegative /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=143589388;
 //BA.debugLineNum = 143589388;BA.debugLine="mColorTextoMensaje=xui.Color_White";
__ref._mcolortextomensaje /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=143589389;
 //BA.debugLineNum = 143589389;BA.debugLine="mColorFondoMensaje=mColorFondoDialogo";
__ref._mcolorfondomensaje /*int*/  = __ref._mcolorfondodialogo /*int*/ ;
RDebugUtils.currentLine=143589390;
 //BA.debugLineNum = 143589390;BA.debugLine="End Sub";
return "";
}
public String  _settextobotoncancel(b4j.docU.jammsgdialog __ref,String _textobotoncancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settextobotoncancel", true))
	 {return ((String) Debug.delegate(ba, "settextobotoncancel", new Object[] {_textobotoncancel}));}
RDebugUtils.currentLine=145358848;
 //BA.debugLineNum = 145358848;BA.debugLine="Sub setTextoBotonCancel(TextoBotonCancel As String";
RDebugUtils.currentLine=145358849;
 //BA.debugLineNum = 145358849;BA.debugLine="mTextoBotonCancel=TextoBotonCancel";
__ref._mtextobotoncancel /*String*/  = _textobotoncancel;
RDebugUtils.currentLine=145358850;
 //BA.debugLineNum = 145358850;BA.debugLine="End Sub";
return "";
}
public String  _settextobotonnegative(b4j.docU.jammsgdialog __ref,String _textobotonnegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settextobotonnegative", true))
	 {return ((String) Debug.delegate(ba, "settextobotonnegative", new Object[] {_textobotonnegative}));}
RDebugUtils.currentLine=145555456;
 //BA.debugLineNum = 145555456;BA.debugLine="Sub setTextoBotonNegative(TextoBotonNegative As St";
RDebugUtils.currentLine=145555457;
 //BA.debugLineNum = 145555457;BA.debugLine="mTextoBotonNegative=TextoBotonNegative";
__ref._mtextobotonnegative /*String*/  = _textobotonnegative;
RDebugUtils.currentLine=145555458;
 //BA.debugLineNum = 145555458;BA.debugLine="End Sub";
return "";
}
public String  _settextobotonpositive(b4j.docU.jammsgdialog __ref,String _textobotonpositive) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settextobotonpositive", true))
	 {return ((String) Debug.delegate(ba, "settextobotonpositive", new Object[] {_textobotonpositive}));}
RDebugUtils.currentLine=145162240;
 //BA.debugLineNum = 145162240;BA.debugLine="Sub setTextoBotonPositive(TextoBotonPositive As St";
RDebugUtils.currentLine=145162241;
 //BA.debugLineNum = 145162241;BA.debugLine="mTextoBotonPositive=TextoBotonPositive";
__ref._mtextobotonpositive /*String*/  = _textobotonpositive;
RDebugUtils.currentLine=145162242;
 //BA.debugLineNum = 145162242;BA.debugLine="End Sub";
return "";
}
public String  _settextomensaje(b4j.docU.jammsgdialog __ref,Object _textomensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settextomensaje", true))
	 {return ((String) Debug.delegate(ba, "settextomensaje", new Object[] {_textomensaje}));}
RDebugUtils.currentLine=144637952;
 //BA.debugLineNum = 144637952;BA.debugLine="Sub setTextoMensaje(TextoMensaje As Object)";
RDebugUtils.currentLine=144637953;
 //BA.debugLineNum = 144637953;BA.debugLine="mTextoMensaje=TextoMensaje";
__ref._mtextomensaje /*Object*/  = _textomensaje;
RDebugUtils.currentLine=144637954;
 //BA.debugLineNum = 144637954;BA.debugLine="End Sub";
return "";
}
public String  _settextotitulo(b4j.docU.jammsgdialog __ref,Object _textotitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialog";
if (Debug.shouldDelegate(ba, "settextotitulo", true))
	 {return ((String) Debug.delegate(ba, "settextotitulo", new Object[] {_textotitulo}));}
RDebugUtils.currentLine=144244736;
 //BA.debugLineNum = 144244736;BA.debugLine="Sub setTextoTitulo(TextoTitulo As Object)";
RDebugUtils.currentLine=144244737;
 //BA.debugLineNum = 144244737;BA.debugLine="mTextoTitulo=TextoTitulo";
__ref._mtextotitulo /*Object*/  = _textotitulo;
RDebugUtils.currentLine=144244738;
 //BA.debugLineNum = 144244738;BA.debugLine="End Sub";
return "";
}
	public void RefrescarLabelFont(Label label, Font font){
	//Platform.runLater(() -> label.setFont(font));
    Platform.runLater(new Runnable() {
        @Override
        public void run() {
            label.setFont(font);
        }
    });
}
public double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
}