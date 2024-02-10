package b4j.docU;

import anywheresoftware.b4a.debug.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jammsgdialogbbcodeview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jammsgdialogbbcodeview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jammsgdialogbbcodeview.class).invoke(this, new Object[] {null});
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
public Object _mcallback = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.docU.b4xdialog _dialog = null;
public Object _mtitle = null;
public Object _mmsgxd = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbasedialogo = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mdialogpanel = null;
public int _mcolorfondopanelmensaje = 0;
public int _mcoloroverlay = 0;
public int _mcolorbackground = 0;
public boolean _mlighttheme = false;
public boolean _mmovible = false;
public double _downx = 0;
public double _downy = 0;
public int _manchodialogo = 0;
public int _maltodialogo = 0;
public String _malineacionverticalmsg = "";
public String _malineacionhorizontalmsg = "";
public float _mtamanofuentetextomensaje = 0f;
public int _mcolortextomensaje = 0;
public int _maltotitulo = 0;
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
public b4j.docU.bctextengine _textengine = null;
public b4j.docU.bbcodeview _bbcodeviewdialog = null;
public String _urllinkclicked = "";
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
public String  _bbcodeviewdialog_linkclicked(b4j.docU.jammsgdialogbbcodeview __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "bbcodeviewdialog_linkclicked", true))
	 {return ((String) Debug.delegate(ba, "bbcodeviewdialog_linkclicked", new Object[] {_url}));}
RDebugUtils.currentLine=149291008;
 //BA.debugLineNum = 149291008;BA.debugLine="Private Sub BBCodeViewDialog_LinkClicked (URL As S";
RDebugUtils.currentLine=149291009;
 //BA.debugLineNum = 149291009;BA.debugLine="URLLinkClicked=URL";
__ref._urllinkclicked /*String*/  = _url;
RDebugUtils.currentLine=149291010;
 //BA.debugLineNum = 149291010;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=149291011;
 //BA.debugLineNum = 149291011;BA.debugLine="If SubExists(mCallBack,mEventName & \"_LinkClicked";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LinkClicked")) { 
RDebugUtils.currentLine=149291012;
 //BA.debugLineNum = 149291012;BA.debugLine="CallSub2(mCallBack,mEventName & \"_LinkClicked\",U";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LinkClicked",(Object)(_url));
 };
RDebugUtils.currentLine=149291014;
 //BA.debugLineNum = 149291014;BA.debugLine="End Sub";
return "";
}
public int  _booleantoint(b4j.docU.jammsgdialogbbcodeview __ref,boolean _bool) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "booleantoint", true))
	 {return ((Integer) Debug.delegate(ba, "booleantoint", new Object[] {_bool}));}
RDebugUtils.currentLine=148439040;
 //BA.debugLineNum = 148439040;BA.debugLine="Sub BooleanToInt(Bool As Boolean) As Int";
RDebugUtils.currentLine=148439041;
 //BA.debugLineNum = 148439041;BA.debugLine="If Bool Then Return 1 Else Return 0";
if (_bool) { 
if (true) return (int) (1);}
else {
if (true) return (int) (0);};
RDebugUtils.currentLine=148439042;
 //BA.debugLineNum = 148439042;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.docU.jammsgdialogbbcodeview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
RDebugUtils.currentLine=146472960;
 //BA.debugLineNum = 146472960;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=146472961;
 //BA.debugLineNum = 146472961;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=146472962;
 //BA.debugLineNum = 146472962;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=146472963;
 //BA.debugLineNum = 146472963;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=146472964;
 //BA.debugLineNum = 146472964;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4j.docU.b4xdialog();
RDebugUtils.currentLine=146472966;
 //BA.debugLineNum = 146472966;BA.debugLine="Private mTitle As Object";
_mtitle = new Object();
RDebugUtils.currentLine=146472967;
 //BA.debugLineNum = 146472967;BA.debugLine="Private mMsgXD As Object";
_mmsgxd = new Object();
RDebugUtils.currentLine=146472968;
 //BA.debugLineNum = 146472968;BA.debugLine="Private mBaseDialogo As B4XView";
_mbasedialogo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=146472969;
 //BA.debugLineNum = 146472969;BA.debugLine="Private mDialogPanel As B4XView";
_mdialogpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=146472970;
 //BA.debugLineNum = 146472970;BA.debugLine="Private mColorFondoPanelMensaje as Int";
_mcolorfondopanelmensaje = 0;
RDebugUtils.currentLine=146472972;
 //BA.debugLineNum = 146472972;BA.debugLine="Private mColorOverlay As Int";
_mcoloroverlay = 0;
RDebugUtils.currentLine=146472973;
 //BA.debugLineNum = 146472973;BA.debugLine="Private mColorBackground As Int";
_mcolorbackground = 0;
RDebugUtils.currentLine=146472975;
 //BA.debugLineNum = 146472975;BA.debugLine="Private mLightTheme As Boolean";
_mlighttheme = false;
RDebugUtils.currentLine=146472977;
 //BA.debugLineNum = 146472977;BA.debugLine="Private mMovible As Boolean";
_mmovible = false;
RDebugUtils.currentLine=146472978;
 //BA.debugLineNum = 146472978;BA.debugLine="Private DownX As Double";
_downx = 0;
RDebugUtils.currentLine=146472979;
 //BA.debugLineNum = 146472979;BA.debugLine="Private DownY As Double";
_downy = 0;
RDebugUtils.currentLine=146472981;
 //BA.debugLineNum = 146472981;BA.debugLine="Private mAnchoDialogo As Int";
_manchodialogo = 0;
RDebugUtils.currentLine=146472982;
 //BA.debugLineNum = 146472982;BA.debugLine="Private mAltoDialogo As Int";
_maltodialogo = 0;
RDebugUtils.currentLine=146472983;
 //BA.debugLineNum = 146472983;BA.debugLine="Private mAlineacionVerticalMsg As String";
_malineacionverticalmsg = "";
RDebugUtils.currentLine=146472984;
 //BA.debugLineNum = 146472984;BA.debugLine="Private mAlineacionHorizontalMsg As String";
_malineacionhorizontalmsg = "";
RDebugUtils.currentLine=146472985;
 //BA.debugLineNum = 146472985;BA.debugLine="Private mTamanoFuenteTextoMensaje As Float";
_mtamanofuentetextomensaje = 0f;
RDebugUtils.currentLine=146472986;
 //BA.debugLineNum = 146472986;BA.debugLine="Private mColorTextoMensaje As Int";
_mcolortextomensaje = 0;
RDebugUtils.currentLine=146472988;
 //BA.debugLineNum = 146472988;BA.debugLine="Private mAltoTitulo As Int";
_maltotitulo = 0;
RDebugUtils.currentLine=146472989;
 //BA.debugLineNum = 146472989;BA.debugLine="Private mTamanoFuenteTitulo As Float";
_mtamanofuentetitulo = 0f;
RDebugUtils.currentLine=146472990;
 //BA.debugLineNum = 146472990;BA.debugLine="Private mColorFondoTitulo As Int";
_mcolorfondotitulo = 0;
RDebugUtils.currentLine=146472991;
 //BA.debugLineNum = 146472991;BA.debugLine="Private mPanelTitulo As B4XView";
_mpaneltitulo = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=146472993;
 //BA.debugLineNum = 146472993;BA.debugLine="Private mAnchoBordeDialogo As Int";
_manchobordedialogo = 0;
RDebugUtils.currentLine=146472994;
 //BA.debugLineNum = 146472994;BA.debugLine="Private mColorBordeDialogo As Int";
_mcolorbordedialogo = 0;
RDebugUtils.currentLine=146472996;
 //BA.debugLineNum = 146472996;BA.debugLine="Private mAltoBotonesDialogo As Int";
_maltobotonesdialogo = 0;
RDebugUtils.currentLine=146472997;
 //BA.debugLineNum = 146472997;BA.debugLine="Private mTextoBotonPositive As String";
_mtextobotonpositive = "";
RDebugUtils.currentLine=146472998;
 //BA.debugLineNum = 146472998;BA.debugLine="Private mTextoBotonCancel As String";
_mtextobotoncancel = "";
RDebugUtils.currentLine=146472999;
 //BA.debugLineNum = 146472999;BA.debugLine="Private mTextoBotonNegative As String";
_mtextobotonnegative = "";
RDebugUtils.currentLine=146473000;
 //BA.debugLineNum = 146473000;BA.debugLine="Private mTamanoFuenteBotonesDialogo As Float";
_mtamanofuentebotonesdialogo = 0f;
RDebugUtils.currentLine=146473001;
 //BA.debugLineNum = 146473001;BA.debugLine="Private mColorFondoBotonPositive As Int";
_mcolorfondobotonpositive = 0;
RDebugUtils.currentLine=146473002;
 //BA.debugLineNum = 146473002;BA.debugLine="Private mColorFondoBotonCancel As Int";
_mcolorfondobotoncancel = 0;
RDebugUtils.currentLine=146473003;
 //BA.debugLineNum = 146473003;BA.debugLine="Private mColorFondoBotonNegative As Int";
_mcolorfondobotonnegative = 0;
RDebugUtils.currentLine=146473004;
 //BA.debugLineNum = 146473004;BA.debugLine="Private mColorTextoBotonPositive As Int";
_mcolortextobotonpositive = 0;
RDebugUtils.currentLine=146473005;
 //BA.debugLineNum = 146473005;BA.debugLine="Private mColorTextoBotonCancel As Int";
_mcolortextobotoncancel = 0;
RDebugUtils.currentLine=146473006;
 //BA.debugLineNum = 146473006;BA.debugLine="Private mColorTextoBotonNegative As Int";
_mcolortextobotonnegative = 0;
RDebugUtils.currentLine=146473008;
 //BA.debugLineNum = 146473008;BA.debugLine="Private mNombreFicheroIconoTitulo As String";
_mnombreficheroiconotitulo = "";
RDebugUtils.currentLine=146473010;
 //BA.debugLineNum = 146473010;BA.debugLine="Private CONST AlineacionCentro As String=\"CENTER\"";
_alineacioncentro = "CENTER";
RDebugUtils.currentLine=146473011;
 //BA.debugLineNum = 146473011;BA.debugLine="Private CONST AlineacionIzquierda As String=\"LEFT";
_alineacionizquierda = "LEFT";
RDebugUtils.currentLine=146473012;
 //BA.debugLineNum = 146473012;BA.debugLine="Private CONST AlineacionDerecha As String=\"RIGHT\"";
_alineacionderecha = "RIGHT";
RDebugUtils.currentLine=146473013;
 //BA.debugLineNum = 146473013;BA.debugLine="Private CONST AlineacionTop As String=\"TOP\"";
_alineaciontop = "TOP";
RDebugUtils.currentLine=146473014;
 //BA.debugLineNum = 146473014;BA.debugLine="Private CONST AlineacionBottom As String=\"BOTTOM\"";
_alineacionbottom = "BOTTOM";
RDebugUtils.currentLine=146473016;
 //BA.debugLineNum = 146473016;BA.debugLine="Private MeasurementCanvas As B4XCanvas";
_measurementcanvas = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=146473018;
 //BA.debugLineNum = 146473018;BA.debugLine="Private TextEngine As BCTextEngine";
_textengine = new b4j.docU.bctextengine();
RDebugUtils.currentLine=146473019;
 //BA.debugLineNum = 146473019;BA.debugLine="Public BBCodeViewDialog As BBCodeView";
_bbcodeviewdialog = new b4j.docU.bbcodeview();
RDebugUtils.currentLine=146473026;
 //BA.debugLineNum = 146473026;BA.debugLine="Public URLLinkClicked as string";
_urllinkclicked = "";
RDebugUtils.currentLine=146473027;
 //BA.debugLineNum = 146473027;BA.debugLine="End Sub";
return "";
}
public String  _colortohex(b4j.docU.jammsgdialogbbcodeview __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "colortohex", true))
	 {return ((String) Debug.delegate(ba, "colortohex", new Object[] {_clr}));}
anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
RDebugUtils.currentLine=148504576;
 //BA.debugLineNum = 148504576;BA.debugLine="Private Sub ColorToHex(clr As Int) As String";
RDebugUtils.currentLine=148504577;
 //BA.debugLineNum = 148504577;BA.debugLine="Dim bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
RDebugUtils.currentLine=148504578;
 //BA.debugLineNum = 148504578;BA.debugLine="Return bc.HexFromBytes(bc.IntsToBytes(Array As In";
if (true) return _bc.HexFromBytes(_bc.IntsToBytes(new int[]{_clr}));
RDebugUtils.currentLine=148504579;
 //BA.debugLineNum = 148504579;BA.debugLine="End Sub";
return "";
}
public int  _contrastcolor(b4j.docU.jammsgdialogbbcodeview __ref,int _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "contrastcolor", true))
	 {return ((Integer) Debug.delegate(ba, "contrastcolor", new Object[] {_c}));}
int _d = 0;
double _a = 0;
int[] _argb = null;
RDebugUtils.currentLine=148766720;
 //BA.debugLineNum = 148766720;BA.debugLine="Sub ContrastColor(C As Int) As Int";
RDebugUtils.currentLine=148766721;
 //BA.debugLineNum = 148766721;BA.debugLine="Dim d As Int";
_d = 0;
RDebugUtils.currentLine=148766722;
 //BA.debugLineNum = 148766722;BA.debugLine="Dim a As Double";
_a = 0;
RDebugUtils.currentLine=148766723;
 //BA.debugLineNum = 148766723;BA.debugLine="Dim argb() As Int";
_argb = new int[(int) (0)];
;
RDebugUtils.currentLine=148766724;
 //BA.debugLineNum = 148766724;BA.debugLine="argb = GetARGB(C)";
_argb = __ref._getargb /*int[]*/ (null,_c);
RDebugUtils.currentLine=148766726;
 //BA.debugLineNum = 148766726;BA.debugLine="a = 1 - ( 0.299 * argb(1) + 0.587 * argb(2) + 0.1";
_a = 1-(0.299*_argb[(int) (1)]+0.587*_argb[(int) (2)]+0.114*_argb[(int) (3)])/(double)255;
RDebugUtils.currentLine=148766728;
 //BA.debugLineNum = 148766728;BA.debugLine="If a < 0.5 Then";
if (_a<0.5) { 
RDebugUtils.currentLine=148766729;
 //BA.debugLineNum = 148766729;BA.debugLine="d = 0 ' bright Colors - black font";
_d = (int) (0);
RDebugUtils.currentLine=148766730;
 //BA.debugLineNum = 148766730;BA.debugLine="Return xui.Color_Black";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
 }else {
RDebugUtils.currentLine=148766732;
 //BA.debugLineNum = 148766732;BA.debugLine="d = 255 ' dark Colors - white font";
_d = (int) (255);
RDebugUtils.currentLine=148766733;
 //BA.debugLineNum = 148766733;BA.debugLine="Return xui.Color_White";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
 };
RDebugUtils.currentLine=148766736;
 //BA.debugLineNum = 148766736;BA.debugLine="Return  xui.Color_ARGB(a,d, d, d)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (_a),_d,_d,_d);
RDebugUtils.currentLine=148766737;
 //BA.debugLineNum = 148766737;BA.debugLine="End Sub";
return 0;
}
public int[]  _getargb(b4j.docU.jammsgdialogbbcodeview __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=148701184;
 //BA.debugLineNum = 148701184;BA.debugLine="Sub GetARGB(Color As Int) As Int()";
RDebugUtils.currentLine=148701185;
 //BA.debugLineNum = 148701185;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=148701186;
 //BA.debugLineNum = 148701186;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=148701187;
 //BA.debugLineNum = 148701187;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=148701188;
 //BA.debugLineNum = 148701188;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=148701189;
 //BA.debugLineNum = 148701189;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=148701190;
 //BA.debugLineNum = 148701190;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=148701191;
 //BA.debugLineNum = 148701191;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _createroundbitmap(b4j.docU.jammsgdialogbbcodeview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _input,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "createroundbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "createroundbitmap", new Object[] {_input,_size}));}
int _l = 0;
anywheresoftware.b4a.objects.B4XCanvas _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xview = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _path = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _res = null;
RDebugUtils.currentLine=149225472;
 //BA.debugLineNum = 149225472;BA.debugLine="Sub CreateRoundBitmap (Input As B4XBitmap, Size As";
RDebugUtils.currentLine=149225474;
 //BA.debugLineNum = 149225474;BA.debugLine="If Input.Width <> Input.Height Then";
if (_input.getWidth()!=_input.getHeight()) { 
RDebugUtils.currentLine=149225476;
 //BA.debugLineNum = 149225476;BA.debugLine="Dim l As Int = Min(Input.Width, Input.Height)";
_l = (int) (__c.Min(_input.getWidth(),_input.getHeight()));
RDebugUtils.currentLine=149225477;
 //BA.debugLineNum = 149225477;BA.debugLine="Input = Input.Crop(Input.Width / 2 - l / 2, Inpu";
_input = _input.Crop((int) (_input.getWidth()/(double)2-_l/(double)2),(int) (_input.getHeight()/(double)2-_l/(double)2),_l,_l);
 };
RDebugUtils.currentLine=149225479;
 //BA.debugLineNum = 149225479;BA.debugLine="Dim c As B4XCanvas";
_c = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=149225480;
 //BA.debugLineNum = 149225480;BA.debugLine="Dim xview As B4XView = xui.CreatePanel(\"\")";
_xview = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xview = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=149225481;
 //BA.debugLineNum = 149225481;BA.debugLine="xview.SetLayoutAnimated(0, 0, 0, Size, Size)";
_xview.SetLayoutAnimated((int) (0),0,0,_size,_size);
RDebugUtils.currentLine=149225482;
 //BA.debugLineNum = 149225482;BA.debugLine="c.Initialize(xview)";
_c.Initialize(ba,_xview);
RDebugUtils.currentLine=149225483;
 //BA.debugLineNum = 149225483;BA.debugLine="Dim path As B4XPath";
_path = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=149225484;
 //BA.debugLineNum = 149225484;BA.debugLine="path.InitializeOval(c.TargetRect)";
_path.InitializeOval(_c.getTargetRect());
RDebugUtils.currentLine=149225485;
 //BA.debugLineNum = 149225485;BA.debugLine="c.ClipPath(path)";
_c.ClipPath(_path);
RDebugUtils.currentLine=149225486;
 //BA.debugLineNum = 149225486;BA.debugLine="c.DrawBitmap(Input.Resize(Size, Size, False), c.T";
_c.DrawBitmap((javafx.scene.image.Image)(_input.Resize(_size,_size,__c.False).getObject()),_c.getTargetRect());
RDebugUtils.currentLine=149225487;
 //BA.debugLineNum = 149225487;BA.debugLine="c.RemoveClip";
_c.RemoveClip();
RDebugUtils.currentLine=149225489;
 //BA.debugLineNum = 149225489;BA.debugLine="If mAnchoBordeDialogo > 0 Then";
if (__ref._manchobordedialogo /*int*/ >0) { 
RDebugUtils.currentLine=149225490;
 //BA.debugLineNum = 149225490;BA.debugLine="c.DrawCircle(c.TargetRect.CenterX, c.TargetRect.";
_c.DrawCircle(_c.getTargetRect().getCenterX(),_c.getTargetRect().getCenterY(),(float) (_c.getTargetRect().getWidth()/(double)2-__c.DipToCurrent((int) (2))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__ref._manchobordedialogo /*int*/ ));
 };
RDebugUtils.currentLine=149225492;
 //BA.debugLineNum = 149225492;BA.debugLine="c.Invalidate";
_c.Invalidate();
RDebugUtils.currentLine=149225493;
 //BA.debugLineNum = 149225493;BA.debugLine="Dim res As B4XBitmap = c.CreateBitmap";
_res = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_res = _c.CreateBitmap();
RDebugUtils.currentLine=149225494;
 //BA.debugLineNum = 149225494;BA.debugLine="c.Release";
_c.Release();
RDebugUtils.currentLine=149225495;
 //BA.debugLineNum = 149225495;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=149225496;
 //BA.debugLineNum = 149225496;BA.debugLine="End Sub";
return null;
}
public String  _getcsscolorstringfromintcolor(b4j.docU.jammsgdialogbbcodeview __ref,int _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "getcsscolorstringfromintcolor", true))
	 {return ((String) Debug.delegate(ba, "getcsscolorstringfromintcolor", new Object[] {_value}));}
String _hexargb = "";
String _hexrgb = "";
RDebugUtils.currentLine=148570112;
 //BA.debugLineNum = 148570112;BA.debugLine="Private Sub GetCssColorStringFromIntColor(value As";
RDebugUtils.currentLine=148570113;
 //BA.debugLineNum = 148570113;BA.debugLine="Select value";
switch (_value) {
case 0x00ffffff: {
RDebugUtils.currentLine=148570115;
 //BA.debugLineNum = 148570115;BA.debugLine="Return \"transparent\"";
if (true) return "transparent";
 break; }
default: {
RDebugUtils.currentLine=148570119;
 //BA.debugLineNum = 148570119;BA.debugLine="Dim HexARGB As String=ColorToHex(value)";
_hexargb = __ref._colortohex /*String*/ (null,_value);
RDebugUtils.currentLine=148570120;
 //BA.debugLineNum = 148570120;BA.debugLine="If HexARGB.Length=6 Then";
if (_hexargb.length()==6) { 
RDebugUtils.currentLine=148570121;
 //BA.debugLineNum = 148570121;BA.debugLine="Return \"#\" & HexARGB";
if (true) return "#"+_hexargb;
 }else {
RDebugUtils.currentLine=148570123;
 //BA.debugLineNum = 148570123;BA.debugLine="Dim HexRGB As String=HexARGB.SubString2(2,8)";
_hexrgb = _hexargb.substring((int) (2),(int) (8));
RDebugUtils.currentLine=148570124;
 //BA.debugLineNum = 148570124;BA.debugLine="Return \"#\" & HexRGB";
if (true) return "#"+_hexrgb;
 };
 break; }
}
;
RDebugUtils.currentLine=148570127;
 //BA.debugLineNum = 148570127;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.jammsgdialogbbcodeview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4a.objects.B4XViewWrapper _basedialogo,Object _title,Object _msgxd) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_basedialogo,_title,_msgxd}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=146538496;
 //BA.debugLineNum = 146538496;BA.debugLine="Public Sub Initialize(CallBack As Object, EventNam";
RDebugUtils.currentLine=146538518;
 //BA.debugLineNum = 146538518;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=146538519;
 //BA.debugLineNum = 146538519;BA.debugLine="mEventName=EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=146538521;
 //BA.debugLineNum = 146538521;BA.debugLine="mBaseDialogo=BaseDialogo";
__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _basedialogo;
RDebugUtils.currentLine=146538523;
 //BA.debugLineNum = 146538523;BA.debugLine="mMovible=True";
__ref._mmovible /*boolean*/  = __c.True;
RDebugUtils.currentLine=146538525;
 //BA.debugLineNum = 146538525;BA.debugLine="mColorOverlay=0xaa000000";
__ref._mcoloroverlay /*int*/  = ((int)0xaa000000);
RDebugUtils.currentLine=146538526;
 //BA.debugLineNum = 146538526;BA.debugLine="mColorBackground=0xFF555555";
__ref._mcolorbackground /*int*/  = ((int)0xff555555);
RDebugUtils.currentLine=146538528;
 //BA.debugLineNum = 146538528;BA.debugLine="mTitle=Title";
__ref._mtitle /*Object*/  = _title;
RDebugUtils.currentLine=146538529;
 //BA.debugLineNum = 146538529;BA.debugLine="mMsgXD=MsgXD";
__ref._mmsgxd /*Object*/  = _msgxd;
RDebugUtils.currentLine=146538531;
 //BA.debugLineNum = 146538531;BA.debugLine="mAnchoDialogo=300dip";
__ref._manchodialogo /*int*/  = __c.DipToCurrent((int) (300));
RDebugUtils.currentLine=146538532;
 //BA.debugLineNum = 146538532;BA.debugLine="mAltoDialogo=200dip";
__ref._maltodialogo /*int*/  = __c.DipToCurrent((int) (200));
RDebugUtils.currentLine=146538534;
 //BA.debugLineNum = 146538534;BA.debugLine="mAlineacionVerticalMsg=\"CENTER\"";
__ref._malineacionverticalmsg /*String*/  = "CENTER";
RDebugUtils.currentLine=146538535;
 //BA.debugLineNum = 146538535;BA.debugLine="mAlineacionHorizontalMsg=\"CENTER\"";
__ref._malineacionhorizontalmsg /*String*/  = "CENTER";
RDebugUtils.currentLine=146538537;
 //BA.debugLineNum = 146538537;BA.debugLine="mAltoBotonesDialogo=40dip";
__ref._maltobotonesdialogo /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=146538538;
 //BA.debugLineNum = 146538538;BA.debugLine="mTextoBotonPositive=\"OK\"";
__ref._mtextobotonpositive /*String*/  = "OK";
RDebugUtils.currentLine=146538539;
 //BA.debugLineNum = 146538539;BA.debugLine="mTextoBotonCancel=\"\"";
__ref._mtextobotoncancel /*String*/  = "";
RDebugUtils.currentLine=146538540;
 //BA.debugLineNum = 146538540;BA.debugLine="mTextoBotonNegative=\"\"";
__ref._mtextobotonnegative /*String*/  = "";
RDebugUtils.currentLine=146538541;
 //BA.debugLineNum = 146538541;BA.debugLine="mTamanoFuenteBotonesDialogo=18";
__ref._mtamanofuentebotonesdialogo /*float*/  = (float) (18);
RDebugUtils.currentLine=146538542;
 //BA.debugLineNum = 146538542;BA.debugLine="mColorFondoBotonPositive=xui.Color_Transparent";
__ref._mcolorfondobotonpositive /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=146538543;
 //BA.debugLineNum = 146538543;BA.debugLine="mColorFondoBotonCancel=xui.Color_Transparent";
__ref._mcolorfondobotoncancel /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=146538544;
 //BA.debugLineNum = 146538544;BA.debugLine="mColorFondoBotonNegative=xui.Color_Transparent";
__ref._mcolorfondobotonnegative /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=146538545;
 //BA.debugLineNum = 146538545;BA.debugLine="mColorTextoBotonPositive=0xFF89D5FF";
__ref._mcolortextobotonpositive /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=146538546;
 //BA.debugLineNum = 146538546;BA.debugLine="mColorTextoBotonCancel=0xFF89D5FF";
__ref._mcolortextobotoncancel /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=146538547;
 //BA.debugLineNum = 146538547;BA.debugLine="mColorTextoBotonNegative=0xFF89D5FF";
__ref._mcolortextobotonnegative /*int*/  = ((int)0xff89d5ff);
RDebugUtils.currentLine=146538549;
 //BA.debugLineNum = 146538549;BA.debugLine="mLightTheme=False";
__ref._mlighttheme /*boolean*/  = __c.False;
RDebugUtils.currentLine=146538552;
 //BA.debugLineNum = 146538552;BA.debugLine="mAlineacionVerticalMsg=\"CENTER\"";
__ref._malineacionverticalmsg /*String*/  = "CENTER";
RDebugUtils.currentLine=146538553;
 //BA.debugLineNum = 146538553;BA.debugLine="mAlineacionHorizontalMsg=\"CENTER\"";
__ref._malineacionhorizontalmsg /*String*/  = "CENTER";
RDebugUtils.currentLine=146538554;
 //BA.debugLineNum = 146538554;BA.debugLine="mTamanoFuenteTextoMensaje=18";
__ref._mtamanofuentetextomensaje /*float*/  = (float) (18);
RDebugUtils.currentLine=146538555;
 //BA.debugLineNum = 146538555;BA.debugLine="mColorTextoMensaje=xui.Color_White";
__ref._mcolortextomensaje /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=146538557;
 //BA.debugLineNum = 146538557;BA.debugLine="mAltoTitulo=40dip";
__ref._maltotitulo /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=146538558;
 //BA.debugLineNum = 146538558;BA.debugLine="mTamanoFuenteTitulo=18";
__ref._mtamanofuentetitulo /*float*/  = (float) (18);
RDebugUtils.currentLine=146538559;
 //BA.debugLineNum = 146538559;BA.debugLine="mColorFondoTitulo=0xFF0083B8";
__ref._mcolorfondotitulo /*int*/  = ((int)0xff0083b8);
RDebugUtils.currentLine=146538561;
 //BA.debugLineNum = 146538561;BA.debugLine="mAnchoBordeDialogo=2dip";
__ref._manchobordedialogo /*int*/  = __c.DipToCurrent((int) (2));
RDebugUtils.currentLine=146538562;
 //BA.debugLineNum = 146538562;BA.debugLine="mColorBordeDialogo=xui.Color_Gray";
__ref._mcolorbordedialogo /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=146538564;
 //BA.debugLineNum = 146538564;BA.debugLine="mNombreFicheroIconoTitulo=\"\"";
__ref._mnombreficheroiconotitulo /*String*/  = "";
RDebugUtils.currentLine=146538566;
 //BA.debugLineNum = 146538566;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=146538567;
 //BA.debugLineNum = 146538567;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 1dip, 1dip)";
_p.SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=146538568;
 //BA.debugLineNum = 146538568;BA.debugLine="MeasurementCanvas.Initialize(p)";
__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,_p);
RDebugUtils.currentLine=146538571;
 //BA.debugLineNum = 146538571;BA.debugLine="TextEngine.Initialize(mBaseDialogo)";
__ref._textengine /*b4j.docU.bctextengine*/ ._initialize /*String*/ (null,ba,__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=146538572;
 //BA.debugLineNum = 146538572;BA.debugLine="Dialog.Initialize(mBaseDialogo)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=146538583;
 //BA.debugLineNum = 146538583;BA.debugLine="mDialogPanel= xui.CreatePanel(\"\")";
__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=146538584;
 //BA.debugLineNum = 146538584;BA.debugLine="mDialogPanel.SetLayoutAnimated(0, 0, 0, mAnchoDia";
__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._manchodialogo /*int*/ -__c.DipToCurrent((int) (5)),__ref._maltodialogo /*int*/ -__ref._maltotitulo /*int*/ -__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=146538585;
 //BA.debugLineNum = 146538585;BA.debugLine="mDialogPanel.LoadLayout(\"scrjammsgdialogbbcodevie";
__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("scrjammsgdialogbbcodeview",ba);
RDebugUtils.currentLine=146538589;
 //BA.debugLineNum = 146538589;BA.debugLine="End Sub";
return "";
}
public double  _measuremultilinetextheight(b4j.docU.jammsgdialogbbcodeview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font,double _width,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "measuremultilinetextheight", true))
	 {return ((Double) Debug.delegate(ba, "measuremultilinetextheight", new Object[] {_font,_width,_text}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=148635648;
 //BA.debugLineNum = 148635648;BA.debugLine="Sub MeasureMultilineTextHeight (Font As B4XFont, W";
RDebugUtils.currentLine=148635649;
 //BA.debugLineNum = 148635649;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=148635650;
 //BA.debugLineNum = 148635650;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_font.getObject()),(Object)(_text),(Object)(_width)})));
RDebugUtils.currentLine=148635651;
 //BA.debugLineNum = 148635651;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _mostraraviso(b4j.docU.jammsgdialogbbcodeview __ref) throws Exception{
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "mostraraviso", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "mostraraviso", null));}
ResumableSub_MostrarAviso rsub = new ResumableSub_MostrarAviso(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_MostrarAviso extends BA.ResumableSub {
public ResumableSub_MostrarAviso(b4j.docU.jammsgdialogbbcodeview parent,b4j.docU.jammsgdialogbbcodeview __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jammsgdialogbbcodeview __ref;
b4j.docU.jammsgdialogbbcodeview parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rsub = null;
int _numerobotonesdialog = 0;
double _whueco = 0;
double _wtotalhuecos = 0;
double _wdispbotones = 0;
double _anchobotonesdialog = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _lbltitle = null;
anywheresoftware.b4j.objects.LabelWrapper _lblt = null;
int _htitulo = 0;
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
anywheresoftware.b4j.objects.ScrollPaneWrapper _sp = null;
int _rint = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jammsgdialogbbcodeview";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=148373506;
 //BA.debugLineNum = 148373506;BA.debugLine="If mAltoDialogo<300dip Then mAltoDialogo=300dip";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._maltodialogo /*int*/ <parent.__c.DipToCurrent((int) (300))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._maltodialogo /*int*/  = parent.__c.DipToCurrent((int) (300));
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=148373507;
 //BA.debugLineNum = 148373507;BA.debugLine="If mAnchoDialogo<240dip Then mAnchoDialogo=240dip";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._manchodialogo /*int*/ <parent.__c.DipToCurrent((int) (240))) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
__ref._manchodialogo /*int*/  = parent.__c.DipToCurrent((int) (240));
if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=148373510;
 //BA.debugLineNum = 148373510;BA.debugLine="If mAltoDialogo>0.9*mBaseDialogo.Height Then mAlt";
if (true) break;

case 13:
//if
this.state = 18;
if (__ref._maltodialogo /*int*/ >0.9*__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
this.state = 15;
;}if (true) break;

case 15:
//C
this.state = 18;
__ref._maltodialogo /*int*/  = (int) (0.9*__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-parent.__c.DipToCurrent((int) (210)));
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=148373511;
 //BA.debugLineNum = 148373511;BA.debugLine="If mAnchoDialogo>0.9*mBaseDialogo.Width Then mAnc";
if (true) break;

case 19:
//if
this.state = 24;
if (__ref._manchodialogo /*int*/ >0.9*__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
__ref._manchodialogo /*int*/  = (int) (0.9*__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
if (true) break;

case 24:
//C
this.state = 25;
;
RDebugUtils.currentLine=148373519;
 //BA.debugLineNum = 148373519;BA.debugLine="Dialog.OverlayColor=mColorOverlay";
__ref._dialog /*b4j.docU.b4xdialog*/ ._overlaycolor /*int*/  = __ref._mcoloroverlay /*int*/ ;
RDebugUtils.currentLine=148373521;
 //BA.debugLineNum = 148373521;BA.debugLine="Dialog.BackgroundColor=mColorBackground";
__ref._dialog /*b4j.docU.b4xdialog*/ ._backgroundcolor /*int*/  = __ref._mcolorbackground /*int*/ ;
RDebugUtils.currentLine=148373523;
 //BA.debugLineNum = 148373523;BA.debugLine="Dialog.Title=mTitle";
__ref._dialog /*b4j.docU.b4xdialog*/ ._title /*Object*/  = __ref._mtitle /*Object*/ ;
RDebugUtils.currentLine=148373525;
 //BA.debugLineNum = 148373525;BA.debugLine="Dialog.BorderColor=mColorBordeDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._bordercolor /*int*/  = __ref._mcolorbordedialogo /*int*/ ;
RDebugUtils.currentLine=148373526;
 //BA.debugLineNum = 148373526;BA.debugLine="Dialog.BorderWidth=mAnchoBordeDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._borderwidth /*int*/  = __ref._manchobordedialogo /*int*/ ;
RDebugUtils.currentLine=148373528;
 //BA.debugLineNum = 148373528;BA.debugLine="Dialog.TitleBarFont=xui.CreateDefaultFont(mTamano";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(__ref._mtamanofuentetitulo /*float*/ );
RDebugUtils.currentLine=148373529;
 //BA.debugLineNum = 148373529;BA.debugLine="Dialog.TitleBarColor=mColorFondoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarcolor /*int*/  = __ref._mcolorfondotitulo /*int*/ ;
RDebugUtils.currentLine=148373530;
 //BA.debugLineNum = 148373530;BA.debugLine="Dialog.TitleBarHeight=mAltoTitulo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = __ref._maltotitulo /*int*/ ;
RDebugUtils.currentLine=148373535;
 //BA.debugLineNum = 148373535;BA.debugLine="Dialog.ButtonsFont=xui.CreateDefaultFont(18)";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (18));
RDebugUtils.currentLine=148373536;
 //BA.debugLineNum = 148373536;BA.debugLine="Dialog.ButtonsHeight=mAltoBotonesDialogo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/  = __ref._maltobotonesdialogo /*int*/ ;
RDebugUtils.currentLine=148373541;
 //BA.debugLineNum = 148373541;BA.debugLine="If mLightTheme Then SetLightThemeDialog(Dialog)";
if (true) break;

case 25:
//if
this.state = 30;
if (__ref._mlighttheme /*boolean*/ ) { 
this.state = 27;
;}if (true) break;

case 27:
//C
this.state = 30;
__ref._setlightthemedialog /*String*/ (null,__ref._dialog /*b4j.docU.b4xdialog*/ );
if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=148373546;
 //BA.debugLineNum = 148373546;BA.debugLine="mDialogPanel.SetLayoutAnimated(0, 0, 0, mAnchoDia";
__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__ref._manchodialogo /*int*/ -parent.__c.DipToCurrent((int) (4)),__ref._maltodialogo /*int*/ -__ref._maltobotonesdialogo /*int*/ -__ref._maltotitulo /*int*/ -parent.__c.DipToCurrent((int) (6)));
RDebugUtils.currentLine=148373547;
 //BA.debugLineNum = 148373547;BA.debugLine="if mColorFondoPanelMensaje<>0 then";
if (true) break;

case 31:
//if
this.state = 34;
if (__ref._mcolorfondopanelmensaje /*int*/ !=0) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=148373548;
 //BA.debugLineNum = 148373548;BA.debugLine="mDialogPanel.SetColorAndBorder(mColorFondoPanelM";
__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mcolorfondopanelmensaje /*int*/ ,0,(int) (0),0);
 if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=148373551;
 //BA.debugLineNum = 148373551;BA.debugLine="BBCodeViewDialog.TextEngine = TextEngine";
__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._settextengine /*b4j.docU.bctextengine*/ (null,__ref._textengine /*b4j.docU.bctextengine*/ );
RDebugUtils.currentLine=148373553;
 //BA.debugLineNum = 148373553;BA.debugLine="TextEngine.SpaceBetweenLines = 1.85 * Measurement";
__ref._textengine /*b4j.docU.bctextengine*/ ._setspacebetweenlines /*float*/ (null,(float) (1.85*__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText("X",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont(__ref._mtamanofuentetextomensaje /*float*/ )).getHeight()));
RDebugUtils.currentLine=148373556;
 //BA.debugLineNum = 148373556;BA.debugLine="BBCodeViewDialog.Text=\"[color=\" & GetCssColorStri";
__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._settext /*String*/ (null,"[color="+__ref._getcsscolorstringfromintcolor /*String*/ (null,__ref._mcolortextomensaje /*int*/ )+"][TextSize="+BA.NumberToString(__ref._mtamanofuentetextomensaje /*float*/ )+"]"+BA.ObjectToString(__ref._mmsgxd /*Object*/ )+"[/TextSize][/color]");
RDebugUtils.currentLine=148373559;
 //BA.debugLineNum = 148373559;BA.debugLine="Dim rSub As ResumableSub=Dialog.ShowCustom(mDialo";
_rsub = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rsub = __ref._dialog /*b4j.docU.b4xdialog*/ ._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(__ref._mtextobotonpositive /*String*/ ),(Object)(__ref._mtextobotonnegative /*String*/ ),(Object)(__ref._mtextobotoncancel /*String*/ ));
RDebugUtils.currentLine=148373561;
 //BA.debugLineNum = 148373561;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jammsgdialogbbcodeview", "mostraraviso"),(int) (0));
this.state = 90;
return;
case 90:
//C
this.state = 35;
;
RDebugUtils.currentLine=148373567;
 //BA.debugLineNum = 148373567;BA.debugLine="log(\"mDialogPanel: \" & mDialogPanel.width & \", \"";
parent.__c.LogImpl("9148373567","mDialogPanel: "+BA.NumberToString(__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())+", "+BA.NumberToString(__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),0);
RDebugUtils.currentLine=148373568;
 //BA.debugLineNum = 148373568;BA.debugLine="log(\"Dialog.Base: \" & Dialog.Base.width & \", \" &";
parent.__c.LogImpl("9148373568","Dialog.Base: "+BA.NumberToString(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())+", "+BA.NumberToString(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),0);
RDebugUtils.currentLine=148373570;
 //BA.debugLineNum = 148373570;BA.debugLine="BBCodeViewDialog.mBase.Height=mDialogPanel.Height";
__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=148373571;
 //BA.debugLineNum = 148373571;BA.debugLine="BBCodeViewDialog.mBase.Width=mDialogPanel.width";
__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=148373572;
 //BA.debugLineNum = 148373572;BA.debugLine="BBCodeViewDialog.sv.Height=mDialogPanel.Height";
__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=148373573;
 //BA.debugLineNum = 148373573;BA.debugLine="BBCodeViewDialog.sv.Width=mDialogPanel.width";
__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=148373575;
 //BA.debugLineNum = 148373575;BA.debugLine="Dim  NumeroBotonesDialog As Int";
_numerobotonesdialog = 0;
RDebugUtils.currentLine=148373576;
 //BA.debugLineNum = 148373576;BA.debugLine="NumeroBotonesDialog=BooleanToInt(mTextoBotonPosit";
_numerobotonesdialog = (int) (__ref._booleantoint /*int*/ (null,__ref._mtextobotonpositive /*String*/ .length()>0)+__ref._booleantoint /*int*/ (null,__ref._mtextobotoncancel /*String*/ .length()>0)+__ref._booleantoint /*int*/ (null,__ref._mtextobotonnegative /*String*/ .length()>0));
RDebugUtils.currentLine=148373577;
 //BA.debugLineNum = 148373577;BA.debugLine="Dim wHueco As Double=10dip";
_whueco = parent.__c.DipToCurrent((int) (10));
RDebugUtils.currentLine=148373578;
 //BA.debugLineNum = 148373578;BA.debugLine="Dim wTotalHuecos As Double=wHueco*(NumeroBotonesD";
_wtotalhuecos = _whueco*(_numerobotonesdialog+1);
RDebugUtils.currentLine=148373579;
 //BA.debugLineNum = 148373579;BA.debugLine="Dim wDispBotones As Double=Dialog.Base.Width-wTot";
_wdispbotones = __ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_wtotalhuecos;
RDebugUtils.currentLine=148373580;
 //BA.debugLineNum = 148373580;BA.debugLine="Dim AnchoBotonesDialog As Double=wDispBotones/Num";
_anchobotonesdialog = _wdispbotones/(double)_numerobotonesdialog;
RDebugUtils.currentLine=148373582;
 //BA.debugLineNum = 148373582;BA.debugLine="Dialog.Base.Top=Max(5dip,(Dialog.mParent.Height-m";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(parent.__c.Max(parent.__c.DipToCurrent((int) (5)),(__ref._dialog /*b4j.docU.b4xdialog*/ ._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._maltodialogo /*int*/ )/(double)2));
RDebugUtils.currentLine=148373584;
 //BA.debugLineNum = 148373584;BA.debugLine="Dialog.TitleBar.Width=Dialog.Base.Width-Dialog.Bo";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._dialog /*b4j.docU.b4xdialog*/ ._borderwidth /*int*/ *2);
RDebugUtils.currentLine=148373585;
 //BA.debugLineNum = 148373585;BA.debugLine="Dim lblTitle As B4XView=Dialog.TitleBar.GetView(0";
_lbltitle = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbltitle = __ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=148373586;
 //BA.debugLineNum = 148373586;BA.debugLine="lblTitle.Width=Dialog.TitleBar.Width";
_lbltitle.setWidth(__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=148373587;
 //BA.debugLineNum = 148373587;BA.debugLine="lblTitle.SetTextAlignment(\"CENTER\",\"CENTER\")";
_lbltitle.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=148373588;
 //BA.debugLineNum = 148373588;BA.debugLine="Dim lblT As Label=Dialog.TitleBar.GetView(0)";
_lblt = new anywheresoftware.b4j.objects.LabelWrapper();
_lblt = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).getObject()));
RDebugUtils.currentLine=148373590;
 //BA.debugLineNum = 148373590;BA.debugLine="lblT.WrapText = True";
_lblt.setWrapText(parent.__c.True);
RDebugUtils.currentLine=148373591;
 //BA.debugLineNum = 148373591;BA.debugLine="Dim hTitulo As Int=MeasureMultilineTextHeight(Dia";
_htitulo = (int) (__ref._measuremultilinetextheight /*double*/ (null,__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._manchodialogo /*int*/ -parent.__c.DipToCurrent((int) (10)),BA.ObjectToString(__ref._mtitle /*Object*/ )));
RDebugUtils.currentLine=148373600;
 //BA.debugLineNum = 148373600;BA.debugLine="Dialog.TitleBarHeight=hTitulo+5dip";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebarheight /*int*/  = (int) (_htitulo+parent.__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=148373603;
 //BA.debugLineNum = 148373603;BA.debugLine="If mNombreFicheroIconoTitulo<>\"\" Then";
if (true) break;

case 35:
//if
this.state = 38;
if ((__ref._mnombreficheroiconotitulo /*String*/ ).equals("") == false) { 
this.state = 37;
}if (true) break;

case 37:
//C
this.state = 38;
RDebugUtils.currentLine=148373604;
 //BA.debugLineNum = 148373604;BA.debugLine="Private ivIcon As ImageView";
_ivicon = new anywheresoftware.b4j.objects.ImageViewWrapper();
RDebugUtils.currentLine=148373605;
 //BA.debugLineNum = 148373605;BA.debugLine="ivIcon.Initialize(\"\")";
_ivicon.Initialize(ba,"");
RDebugUtils.currentLine=148373606;
 //BA.debugLineNum = 148373606;BA.debugLine="Dim MedidaLadoIcono As Double=Min(Min(20dip,Dial";
_medidaladoicono = parent.__c.Min(parent.__c.Min(parent.__c.DipToCurrent((int) (20)),__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),parent.__c.Min(parent.__c.DipToCurrent((int) (20)),__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=148373607;
 //BA.debugLineNum = 148373607;BA.debugLine="Dialog.TitleBar.AddView(ivIcon,5dip,5dip,MedidaL";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(_ivicon.getObject()),parent.__c.DipToCurrent((int) (5)),parent.__c.DipToCurrent((int) (5)),_medidaladoicono,_medidaladoicono);
RDebugUtils.currentLine=148373609;
 //BA.debugLineNum = 148373609;BA.debugLine="Dim B4XivIcon As B4XView=ivIcon";
_b4xivicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xivicon = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_ivicon.getObject()));
RDebugUtils.currentLine=148373610;
 //BA.debugLineNum = 148373610;BA.debugLine="B4XivIcon.SetBitmap(xui.LoadBitmapResize(File.Di";
_b4xivicon.SetBitmap((javafx.scene.image.Image)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .LoadBitmapResize(parent.__c.File.getDirAssets(),__ref._mnombreficheroiconotitulo /*String*/ ,(int) (_medidaladoicono),(int) (_medidaladoicono),parent.__c.True).getObject()));
 if (true) break;

case 38:
//C
this.state = 39;
;
RDebugUtils.currentLine=148373613;
 //BA.debugLineNum = 148373613;BA.debugLine="mPanelTitulo=xui.CreatePanel(\"mPanelTitulo\")";
__ref._mpaneltitulo /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mPanelTitulo");
RDebugUtils.currentLine=148373614;
 //BA.debugLineNum = 148373614;BA.debugLine="Dialog.TitleBar.AddView(mPanelTitulo,0,0,Dialog.T";
__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpaneltitulo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=148373617;
 //BA.debugLineNum = 148373617;BA.debugLine="Dim fnt As B4XFont=xui.CreateFont(Dialog.ButtonsF";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont((javafx.scene.text.Font)(__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getObject()),__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=148373624;
 //BA.debugLineNum = 148373624;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
if (true) break;

case 39:
//if
this.state = 50;
if ((__ref._mtextobotonpositive /*String*/ ).equals("") == false) { 
this.state = 41;
}if (true) break;

case 41:
//C
this.state = 42;
RDebugUtils.currentLine=148373625;
 //BA.debugLineNum = 148373625;BA.debugLine="Dim bOK As B4XView=Dialog.GetButton(xui.DialogRe";
_bok = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bok = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=148373626;
 //BA.debugLineNum = 148373626;BA.debugLine="bOK.TextSize=mTamanoFuenteBotonesDialogo";
_bok.setTextSize(__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=148373627;
 //BA.debugLineNum = 148373627;BA.debugLine="Dim TextWidthBOk As Int = MeasurementCanvas.Meas";
_textwidthbok = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._mtextobotonpositive /*String*/ ,_fnt).getWidth());
RDebugUtils.currentLine=148373628;
 //BA.debugLineNum = 148373628;BA.debugLine="bOK.Width=AnchoBotonesDialog";
_bok.setWidth(_anchobotonesdialog);
RDebugUtils.currentLine=148373629;
 //BA.debugLineNum = 148373629;BA.debugLine="Select Case NumeroBotonesDialog";
if (true) break;

case 42:
//select
this.state = 49;
switch (_numerobotonesdialog) {
case 1: {
this.state = 44;
if (true) break;
}
case 2: {
this.state = 46;
if (true) break;
}
case 3: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 44:
//C
this.state = 49;
RDebugUtils.currentLine=148373631;
 //BA.debugLineNum = 148373631;BA.debugLine="bOK.Left=(Dialog.Base.Width-AnchoBotonesDialog";
_bok.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_anchobotonesdialog)/(double)2);
 if (true) break;

case 46:
//C
this.state = 49;
RDebugUtils.currentLine=148373633;
 //BA.debugLineNum = 148373633;BA.debugLine="bOK.Left=wHueco";
_bok.setLeft(_whueco);
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=148373635;
 //BA.debugLineNum = 148373635;BA.debugLine="bOK.Left=wHueco";
_bok.setLeft(_whueco);
 if (true) break;

case 49:
//C
this.state = 50;
;
RDebugUtils.currentLine=148373638;
 //BA.debugLineNum = 148373638;BA.debugLine="bOK.SetTextAlignment(mAlineacionVerticalMsg, mAl";
_bok.SetTextAlignment(__ref._malineacionverticalmsg /*String*/ ,__ref._malineacionhorizontalmsg /*String*/ );
RDebugUtils.currentLine=148373639;
 //BA.debugLineNum = 148373639;BA.debugLine="bOK.Top=Dialog.Base.Height-Dialog.ButtonsHeight-";
_bok.setTop(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=148373640;
 //BA.debugLineNum = 148373640;BA.debugLine="bOK.Color=mColorFondoBotonPositive";
_bok.setColor(__ref._mcolorfondobotonpositive /*int*/ );
RDebugUtils.currentLine=148373641;
 //BA.debugLineNum = 148373641;BA.debugLine="bOK.TextColor=mColorTextoBotonPositive";
_bok.setTextColor(__ref._mcolortextobotonpositive /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=148373645;
 //BA.debugLineNum = 148373645;BA.debugLine="If mTextoBotonCancel<>\"\" Then";

case 50:
//if
this.state = 67;
if ((__ref._mtextobotoncancel /*String*/ ).equals("") == false) { 
this.state = 52;
}if (true) break;

case 52:
//C
this.state = 53;
RDebugUtils.currentLine=148373646;
 //BA.debugLineNum = 148373646;BA.debugLine="Dim bCancel As B4XView=Dialog.GetButton(xui.Dial";
_bcancel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bcancel = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Cancel);
RDebugUtils.currentLine=148373647;
 //BA.debugLineNum = 148373647;BA.debugLine="bCancel.TextSize=mTamanoFuenteBotonesDialogo";
_bcancel.setTextSize(__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=148373648;
 //BA.debugLineNum = 148373648;BA.debugLine="Dim TextWidthBCancel As Int = MeasurementCanvas.";
_textwidthbcancel = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._mtextobotoncancel /*String*/ ,_fnt).getWidth());
RDebugUtils.currentLine=148373649;
 //BA.debugLineNum = 148373649;BA.debugLine="bCancel.Width=AnchoBotonesDialog";
_bcancel.setWidth(_anchobotonesdialog);
RDebugUtils.currentLine=148373650;
 //BA.debugLineNum = 148373650;BA.debugLine="Select Case NumeroBotonesDialog";
if (true) break;

case 53:
//select
this.state = 66;
switch (_numerobotonesdialog) {
case 1: {
this.state = 55;
if (true) break;
}
case 2: {
this.state = 57;
if (true) break;
}
case 3: {
this.state = 65;
if (true) break;
}
}
if (true) break;

case 55:
//C
this.state = 66;
RDebugUtils.currentLine=148373652;
 //BA.debugLineNum = 148373652;BA.debugLine="bCancel.Left=(Dialog.Base.Width-AnchoBotonesDi";
_bcancel.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_anchobotonesdialog)/(double)2);
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=148373654;
 //BA.debugLineNum = 148373654;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
if (true) break;

case 58:
//if
this.state = 63;
if ((__ref._mtextobotonpositive /*String*/ ).equals("") == false) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
RDebugUtils.currentLine=148373655;
 //BA.debugLineNum = 148373655;BA.debugLine="bCancel.Left= wHueco+AnchoBotonesDialog+wHuec";
_bcancel.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=148373657;
 //BA.debugLineNum = 148373657;BA.debugLine="bCancel.Left= wHueco";
_bcancel.setLeft(_whueco);
 if (true) break;

case 63:
//C
this.state = 66;
;
 if (true) break;

case 65:
//C
this.state = 66;
RDebugUtils.currentLine=148373660;
 //BA.debugLineNum = 148373660;BA.debugLine="bCancel.Left=wHueco+AnchoBotonesDialog+wHueco";
_bcancel.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 66:
//C
this.state = 67;
;
RDebugUtils.currentLine=148373663;
 //BA.debugLineNum = 148373663;BA.debugLine="bCancel.SetTextAlignment(mAlineacionVerticalMsg,";
_bcancel.SetTextAlignment(__ref._malineacionverticalmsg /*String*/ ,__ref._malineacionhorizontalmsg /*String*/ );
RDebugUtils.currentLine=148373664;
 //BA.debugLineNum = 148373664;BA.debugLine="bCancel.Top=Dialog.Base.Height-Dialog.ButtonsHei";
_bcancel.setTop(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=148373665;
 //BA.debugLineNum = 148373665;BA.debugLine="bCancel.Color=mColorFondoBotonCancel";
_bcancel.setColor(__ref._mcolorfondobotoncancel /*int*/ );
RDebugUtils.currentLine=148373666;
 //BA.debugLineNum = 148373666;BA.debugLine="bCancel.textColor=mColorTextoBotonCancel";
_bcancel.setTextColor(__ref._mcolortextobotoncancel /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=148373670;
 //BA.debugLineNum = 148373670;BA.debugLine="If mTextoBotonNegative<>\"\" Then";

case 67:
//if
this.state = 84;
if ((__ref._mtextobotonnegative /*String*/ ).equals("") == false) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=148373671;
 //BA.debugLineNum = 148373671;BA.debugLine="Dim bNegative As B4XView=Dialog.GetButton(xui.Di";
_bnegative = new anywheresoftware.b4a.objects.B4XViewWrapper();
_bnegative = __ref._dialog /*b4j.docU.b4xdialog*/ ._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Negative);
RDebugUtils.currentLine=148373672;
 //BA.debugLineNum = 148373672;BA.debugLine="bNegative.TextSize=mTamanoFuenteBotonesDialogo";
_bnegative.setTextSize(__ref._mtamanofuentebotonesdialogo /*float*/ );
RDebugUtils.currentLine=148373673;
 //BA.debugLineNum = 148373673;BA.debugLine="Dim TextWidthBNo As Int = MeasurementCanvas.Meas";
_textwidthbno = (int) (__ref._measurementcanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(__ref._mtextobotonnegative /*String*/ ,_fnt).getWidth());
RDebugUtils.currentLine=148373674;
 //BA.debugLineNum = 148373674;BA.debugLine="bNegative.Width=AnchoBotonesDialog";
_bnegative.setWidth(_anchobotonesdialog);
RDebugUtils.currentLine=148373675;
 //BA.debugLineNum = 148373675;BA.debugLine="Select Case NumeroBotonesDialog";
if (true) break;

case 70:
//select
this.state = 83;
switch (_numerobotonesdialog) {
case 1: {
this.state = 72;
if (true) break;
}
case 2: {
this.state = 74;
if (true) break;
}
case 3: {
this.state = 82;
if (true) break;
}
}
if (true) break;

case 72:
//C
this.state = 83;
RDebugUtils.currentLine=148373677;
 //BA.debugLineNum = 148373677;BA.debugLine="bNegative.Left=(Dialog.Base.Width-AnchoBotones";
_bnegative.setLeft((__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_anchobotonesdialog)/(double)2);
 if (true) break;

case 74:
//C
this.state = 75;
RDebugUtils.currentLine=148373679;
 //BA.debugLineNum = 148373679;BA.debugLine="If mTextoBotonPositive<>\"\" Then";
if (true) break;

case 75:
//if
this.state = 80;
if ((__ref._mtextobotonpositive /*String*/ ).equals("") == false) { 
this.state = 77;
}else {
this.state = 79;
}if (true) break;

case 77:
//C
this.state = 80;
RDebugUtils.currentLine=148373680;
 //BA.debugLineNum = 148373680;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
_bnegative.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=148373682;
 //BA.debugLineNum = 148373682;BA.debugLine="bNegative.Left= wHueco+AnchoBotonesDialog+wHu";
_bnegative.setLeft(_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 80:
//C
this.state = 83;
;
 if (true) break;

case 82:
//C
this.state = 83;
RDebugUtils.currentLine=148373685;
 //BA.debugLineNum = 148373685;BA.debugLine="bNegative.Left=wHueco+AnchoBotonesDialog+wHuec";
_bnegative.setLeft(_whueco+_anchobotonesdialog+_whueco+_anchobotonesdialog+_whueco);
 if (true) break;

case 83:
//C
this.state = 84;
;
RDebugUtils.currentLine=148373688;
 //BA.debugLineNum = 148373688;BA.debugLine="bNegative.SetTextAlignment(mAlineacionVerticalMs";
_bnegative.SetTextAlignment(__ref._malineacionverticalmsg /*String*/ ,__ref._malineacionhorizontalmsg /*String*/ );
RDebugUtils.currentLine=148373689;
 //BA.debugLineNum = 148373689;BA.debugLine="bNegative.Top=Dialog.Base.Height-Dialog.ButtonsH";
_bnegative.setTop(__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._buttonsheight /*int*/ -parent.__c.DipToCurrent((int) (3)));
RDebugUtils.currentLine=148373690;
 //BA.debugLineNum = 148373690;BA.debugLine="bNegative.Color=mColorFondoBotonNegative";
_bnegative.setColor(__ref._mcolorfondobotonnegative /*int*/ );
RDebugUtils.currentLine=148373691;
 //BA.debugLineNum = 148373691;BA.debugLine="bNegative.TextColor=mColorTextoBotonNegative";
_bnegative.setTextColor(__ref._mcolortextobotonnegative /*int*/ );
 if (true) break;
;
RDebugUtils.currentLine=148373698;
 //BA.debugLineNum = 148373698;BA.debugLine="If BBCodeViewDialog.Paragraph.Height>mDialogPanel";

case 84:
//if
this.state = 89;
if (__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._paragraph /*b4j.docU.bctextengine._bcparagraph*/ .Height /*int*/ >__ref._mdialogpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
this.state = 86;
}else {
this.state = 88;
}if (true) break;

case 86:
//C
this.state = 89;
RDebugUtils.currentLine=148373700;
 //BA.debugLineNum = 148373700;BA.debugLine="Dim sp As ScrollPane = BBCodeViewDialog.sv";
_sp = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sp = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=148373701;
 //BA.debugLineNum = 148373701;BA.debugLine="sp.SetVScrollVisibility(\"ALWAYS\")";
_sp.SetVScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"ALWAYS"));
 if (true) break;

case 88:
//C
this.state = 89;
RDebugUtils.currentLine=148373712;
 //BA.debugLineNum = 148373712;BA.debugLine="Dim sp As ScrollPane = BBCodeViewDialog.sv";
_sp = new anywheresoftware.b4j.objects.ScrollPaneWrapper();
_sp = (anywheresoftware.b4j.objects.ScrollPaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ScrollPaneWrapper(), (javafx.scene.control.ScrollPane)(__ref._bbcodeviewdialog /*b4j.docU.bbcodeview*/ ._sv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=148373713;
 //BA.debugLineNum = 148373713;BA.debugLine="sp.SetVScrollVisibility(\"NEVER\")";
_sp.SetVScrollVisibility(BA.getEnumFromString(javafx.scene.control.ScrollPane.ScrollBarPolicy.class,"NEVER"));
 if (true) break;

case 89:
//C
this.state = -1;
;
RDebugUtils.currentLine=148373723;
 //BA.debugLineNum = 148373723;BA.debugLine="Wait For (rSub) Complete (rInt As Int)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jammsgdialogbbcodeview", "mostraraviso"), _rsub);
this.state = 91;
return;
case 91:
//C
this.state = -1;
_rint = (int) result[1];
;
RDebugUtils.currentLine=148373725;
 //BA.debugLineNum = 148373725;BA.debugLine="Return rInt";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_rint));return;};
RDebugUtils.currentLine=148373726;
 //BA.debugLineNum = 148373726;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setlightthemedialog(b4j.docU.jammsgdialogbbcodeview __ref,b4j.docU.b4xdialog _dlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setlightthemedialog", true))
	 {return ((String) Debug.delegate(ba, "setlightthemedialog", new Object[] {_dlg}));}
RDebugUtils.currentLine=148832256;
 //BA.debugLineNum = 148832256;BA.debugLine="Sub SetLightThemeDialog(Dlg As B4XDialog)";
RDebugUtils.currentLine=148832257;
 //BA.debugLineNum = 148832257;BA.debugLine="Dlg.BackgroundColor = xui.Color_White";
_dlg._backgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=148832258;
 //BA.debugLineNum = 148832258;BA.debugLine="Dlg.ButtonsColor = xui.Color_White";
_dlg._buttonscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=148832259;
 //BA.debugLineNum = 148832259;BA.debugLine="Dlg.BorderColor = xui.Color_Gray";
_dlg._bordercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=148832260;
 //BA.debugLineNum = 148832260;BA.debugLine="Dlg.ButtonsTextColor = xui.Color_ARGB(0xFF, 0x00,";
_dlg._buttonstextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x00),((int)0x7d),((int)0xc3));
RDebugUtils.currentLine=148832261;
 //BA.debugLineNum = 148832261;BA.debugLine="End Sub";
return "";
}
public String  _mpaneltitulo_touch(b4j.docU.jammsgdialogbbcodeview __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "mpaneltitulo_touch", true))
	 {return ((String) Debug.delegate(ba, "mpaneltitulo_touch", new Object[] {_action,_x,_y}));}
int _nuevotop = 0;
int _nuevoleft = 0;
RDebugUtils.currentLine=149159936;
 //BA.debugLineNum = 149159936;BA.debugLine="Private Sub mPanelTitulo_Touch(Action As Int, X As";
RDebugUtils.currentLine=149159938;
 //BA.debugLineNum = 149159938;BA.debugLine="If mMovible Then";
if (__ref._mmovible /*boolean*/ ) { 
RDebugUtils.currentLine=149159939;
 //BA.debugLineNum = 149159939;BA.debugLine="If Action = Dialog.TitleBar.TOUCH_ACTION_DOWN Th";
if (_action==__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=149159940;
 //BA.debugLineNum = 149159940;BA.debugLine="DownX  = X";
__ref._downx /*double*/  = _x;
RDebugUtils.currentLine=149159941;
 //BA.debugLineNum = 149159941;BA.debugLine="DownY  = y";
__ref._downy /*double*/  = _y;
 }else 
{RDebugUtils.currentLine=149159942;
 //BA.debugLineNum = 149159942;BA.debugLine="Else if Action = Dialog.TitleBar.TOUCH_ACTION_MO";
if (_action==__ref._dialog /*b4j.docU.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=149159943;
 //BA.debugLineNum = 149159943;BA.debugLine="Dim NuevoTop as int=Dialog.Base.Top + y - DownY";
_nuevotop = (int) (__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+_y-__ref._downy /*double*/ );
RDebugUtils.currentLine=149159944;
 //BA.debugLineNum = 149159944;BA.debugLine="Dim NuevoLeft as int=Dialog.Base.Left + x - Dow";
_nuevoleft = (int) (__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+_x-__ref._downx /*double*/ );
RDebugUtils.currentLine=149159946;
 //BA.debugLineNum = 149159946;BA.debugLine="if NuevoTop<mBaseDialogo.Top then NuevoTop=mBa";
if (_nuevotop<__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()) { 
_nuevotop = (int) (__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());};
RDebugUtils.currentLine=149159947;
 //BA.debugLineNum = 149159947;BA.debugLine="if NuevoTop>mBaseDialogo.Height-Dialog.Base.He";
if (_nuevotop>__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
_nuevotop = (int) (__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=149159948;
 //BA.debugLineNum = 149159948;BA.debugLine="if NuevoLeft<mBaseDialogo.Left then NuevoLeft=";
if (_nuevoleft<__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()) { 
_nuevoleft = (int) (__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft());};
RDebugUtils.currentLine=149159949;
 //BA.debugLineNum = 149159949;BA.debugLine="if NuevoLeft>mBaseDialogo.Width-Dialog.Base.Wi";
if (_nuevoleft>__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()) { 
_nuevoleft = (int) (__ref._mbasedialogo /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());};
RDebugUtils.currentLine=149159957;
 //BA.debugLineNum = 149159957;BA.debugLine="Dialog.Base.Top =  NuevoTop";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(_nuevotop);
RDebugUtils.currentLine=149159958;
 //BA.debugLineNum = 149159958;BA.debugLine="Dialog.Base.Left = NuevoLeft";
__ref._dialog /*b4j.docU.b4xdialog*/ ._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(_nuevoleft);
 }}
;
 };
RDebugUtils.currentLine=149159961;
 //BA.debugLineNum = 149159961;BA.debugLine="End Sub";
return "";
}
public String  _setaltobotonesdialogo(b4j.docU.jammsgdialogbbcodeview __ref,int _altobotonesdialogo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setaltobotonesdialogo", true))
	 {return ((String) Debug.delegate(ba, "setaltobotonesdialogo", new Object[] {_altobotonesdialogo}));}
RDebugUtils.currentLine=147390464;
 //BA.debugLineNum = 147390464;BA.debugLine="Sub setAltoBotonesDialogo(AltoBotonesDialogo As In";
RDebugUtils.currentLine=147390465;
 //BA.debugLineNum = 147390465;BA.debugLine="mAltoBotonesDialogo=AltoBotonesDialogo";
__ref._maltobotonesdialogo /*int*/  = _altobotonesdialogo;
RDebugUtils.currentLine=147390466;
 //BA.debugLineNum = 147390466;BA.debugLine="End Sub";
return "";
}
public String  _setaltodialogo(b4j.docU.jammsgdialogbbcodeview __ref,int _altodlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setaltodialogo", true))
	 {return ((String) Debug.delegate(ba, "setaltodialogo", new Object[] {_altodlg}));}
RDebugUtils.currentLine=146931712;
 //BA.debugLineNum = 146931712;BA.debugLine="Sub setAltoDialogo(AltoDlg As Int)";
RDebugUtils.currentLine=146931713;
 //BA.debugLineNum = 146931713;BA.debugLine="mAltoDialogo=AltoDlg";
__ref._maltodialogo /*int*/  = _altodlg;
RDebugUtils.currentLine=146931714;
 //BA.debugLineNum = 146931714;BA.debugLine="End Sub";
return "";
}
public String  _setaltotitulo(b4j.docU.jammsgdialogbbcodeview __ref,int _altotitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setaltotitulo", true))
	 {return ((String) Debug.delegate(ba, "setaltotitulo", new Object[] {_altotitulo}));}
RDebugUtils.currentLine=146997248;
 //BA.debugLineNum = 146997248;BA.debugLine="Sub setAltoTitulo(AltoTitulo As Int)";
RDebugUtils.currentLine=146997249;
 //BA.debugLineNum = 146997249;BA.debugLine="mAltoTitulo=AltoTitulo";
__ref._maltotitulo /*int*/  = _altotitulo;
RDebugUtils.currentLine=146997250;
 //BA.debugLineNum = 146997250;BA.debugLine="End Sub";
return "";
}
public String  _setanchobordedialogo(b4j.docU.jammsgdialogbbcodeview __ref,int _anchobordedialogo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setanchobordedialogo", true))
	 {return ((String) Debug.delegate(ba, "setanchobordedialogo", new Object[] {_anchobordedialogo}));}
RDebugUtils.currentLine=148307968;
 //BA.debugLineNum = 148307968;BA.debugLine="Sub setAnchoBordeDialogo(AnchoBordeDialogo As Int)";
RDebugUtils.currentLine=148307969;
 //BA.debugLineNum = 148307969;BA.debugLine="mAnchoBordeDialogo=AnchoBordeDialogo";
__ref._manchobordedialogo /*int*/  = _anchobordedialogo;
RDebugUtils.currentLine=148307970;
 //BA.debugLineNum = 148307970;BA.debugLine="End Sub";
return "";
}
public String  _setanchodialogo(b4j.docU.jammsgdialogbbcodeview __ref,int _anchodlg) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setanchodialogo", true))
	 {return ((String) Debug.delegate(ba, "setanchodialogo", new Object[] {_anchodlg}));}
RDebugUtils.currentLine=146866176;
 //BA.debugLineNum = 146866176;BA.debugLine="Sub setAnchoDialogo(AnchoDlg As Int)";
RDebugUtils.currentLine=146866177;
 //BA.debugLineNum = 146866177;BA.debugLine="mAnchoDialogo=AnchoDlg";
__ref._manchodialogo /*int*/  = _anchodlg;
RDebugUtils.currentLine=146866178;
 //BA.debugLineNum = 146866178;BA.debugLine="End Sub";
return "";
}
public String  _setcolorbackground(b4j.docU.jammsgdialogbbcodeview __ref,int _colorbackground) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolorbackground", true))
	 {return ((String) Debug.delegate(ba, "setcolorbackground", new Object[] {_colorbackground}));}
RDebugUtils.currentLine=146735104;
 //BA.debugLineNum = 146735104;BA.debugLine="Sub setColorBackground(ColorBackground As Int)";
RDebugUtils.currentLine=146735105;
 //BA.debugLineNum = 146735105;BA.debugLine="mColorBackground=ColorBackground";
__ref._mcolorbackground /*int*/  = _colorbackground;
RDebugUtils.currentLine=146735106;
 //BA.debugLineNum = 146735106;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondobotoncancel(b4j.docU.jammsgdialogbbcodeview __ref,int _colorbotoncancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolorfondobotoncancel", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondobotoncancel", new Object[] {_colorbotoncancel}));}
RDebugUtils.currentLine=147718144;
 //BA.debugLineNum = 147718144;BA.debugLine="Sub setColorFondoBotonCancel(ColorBotonCancel As I";
RDebugUtils.currentLine=147718145;
 //BA.debugLineNum = 147718145;BA.debugLine="mColorFondoBotonCancel=ColorBotonCancel";
__ref._mcolorfondobotoncancel /*int*/  = _colorbotoncancel;
RDebugUtils.currentLine=147718146;
 //BA.debugLineNum = 147718146;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondobotonnegative(b4j.docU.jammsgdialogbbcodeview __ref,int _colorbotonnegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolorfondobotonnegative", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondobotonnegative", new Object[] {_colorbotonnegative}));}
RDebugUtils.currentLine=147914752;
 //BA.debugLineNum = 147914752;BA.debugLine="Sub setColorFondoBotonNegative(ColorBotonNegative";
RDebugUtils.currentLine=147914753;
 //BA.debugLineNum = 147914753;BA.debugLine="mColorFondoBotonNegative=ColorBotonNegative";
__ref._mcolorfondobotonnegative /*int*/  = _colorbotonnegative;
RDebugUtils.currentLine=147914754;
 //BA.debugLineNum = 147914754;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondobotonpositive(b4j.docU.jammsgdialogbbcodeview __ref,int _colorbotonpositive) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolorfondobotonpositive", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondobotonpositive", new Object[] {_colorbotonpositive}));}
RDebugUtils.currentLine=147521536;
 //BA.debugLineNum = 147521536;BA.debugLine="Sub setColorFondoBotonPositive(ColorBotonPositive";
RDebugUtils.currentLine=147521537;
 //BA.debugLineNum = 147521537;BA.debugLine="mColorFondoBotonPositive=ColorBotonPositive";
__ref._mcolorfondobotonpositive /*int*/  = _colorbotonpositive;
RDebugUtils.currentLine=147521538;
 //BA.debugLineNum = 147521538;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondopanelmensaje(b4j.docU.jammsgdialogbbcodeview __ref,int _colorfondopanelmensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolorfondopanelmensaje", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondopanelmensaje", new Object[] {_colorfondopanelmensaje}));}
RDebugUtils.currentLine=147193856;
 //BA.debugLineNum = 147193856;BA.debugLine="Sub setColorFondoPanelMensaje(ColorFondoPanelMensa";
RDebugUtils.currentLine=147193857;
 //BA.debugLineNum = 147193857;BA.debugLine="mColorFondoPanelMensaje=ColorFondoPanelMensaje";
__ref._mcolorfondopanelmensaje /*int*/  = _colorfondopanelmensaje;
RDebugUtils.currentLine=147193858;
 //BA.debugLineNum = 147193858;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondotitulo(b4j.docU.jammsgdialogbbcodeview __ref,int _colorfondotitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolorfondotitulo", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondotitulo", new Object[] {_colorfondotitulo}));}
RDebugUtils.currentLine=147128320;
 //BA.debugLineNum = 147128320;BA.debugLine="Sub setColorFondoTitulo(ColorFondoTitulo As Int)";
RDebugUtils.currentLine=147128321;
 //BA.debugLineNum = 147128321;BA.debugLine="mColorFondoTitulo=ColorFondoTitulo";
__ref._mcolorfondotitulo /*int*/  = _colorfondotitulo;
RDebugUtils.currentLine=147128322;
 //BA.debugLineNum = 147128322;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondotodosbotones(b4j.docU.jammsgdialogbbcodeview __ref,int _colorfondotodosbotones) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolorfondotodosbotones", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondotodosbotones", new Object[] {_colorfondotodosbotones}));}
RDebugUtils.currentLine=148045824;
 //BA.debugLineNum = 148045824;BA.debugLine="Sub setColorFondoTodosBotones(ColorFondoTodosBoton";
RDebugUtils.currentLine=148045825;
 //BA.debugLineNum = 148045825;BA.debugLine="mColorFondoBotonPositive=ColorFondoTodosBotones";
__ref._mcolorfondobotonpositive /*int*/  = _colorfondotodosbotones;
RDebugUtils.currentLine=148045826;
 //BA.debugLineNum = 148045826;BA.debugLine="mColorFondoBotonCancel=ColorFondoTodosBotones";
__ref._mcolorfondobotoncancel /*int*/  = _colorfondotodosbotones;
RDebugUtils.currentLine=148045827;
 //BA.debugLineNum = 148045827;BA.debugLine="mColorFondoBotonNegative=ColorFondoTodosBotones";
__ref._mcolorfondobotonnegative /*int*/  = _colorfondotodosbotones;
RDebugUtils.currentLine=148045828;
 //BA.debugLineNum = 148045828;BA.debugLine="End Sub";
return "";
}
public String  _setcoloroverlay(b4j.docU.jammsgdialogbbcodeview __ref,int _coloroverlay) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcoloroverlay", true))
	 {return ((String) Debug.delegate(ba, "setcoloroverlay", new Object[] {_coloroverlay}));}
RDebugUtils.currentLine=146669568;
 //BA.debugLineNum = 146669568;BA.debugLine="Sub setColorOverlay(ColorOverlay As Int)";
RDebugUtils.currentLine=146669569;
 //BA.debugLineNum = 146669569;BA.debugLine="mColorOverlay=ColorOverlay";
__ref._mcoloroverlay /*int*/  = _coloroverlay;
RDebugUtils.currentLine=146669570;
 //BA.debugLineNum = 146669570;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextobotoncancel(b4j.docU.jammsgdialogbbcodeview __ref,int _colorbotoncancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolortextobotoncancel", true))
	 {return ((String) Debug.delegate(ba, "setcolortextobotoncancel", new Object[] {_colorbotoncancel}));}
RDebugUtils.currentLine=147783680;
 //BA.debugLineNum = 147783680;BA.debugLine="Sub setColorTextoBotonCancel(ColorBotonCancel As I";
RDebugUtils.currentLine=147783681;
 //BA.debugLineNum = 147783681;BA.debugLine="mColorTextoBotonCancel=ColorBotonCancel";
__ref._mcolortextobotoncancel /*int*/  = _colorbotoncancel;
RDebugUtils.currentLine=147783682;
 //BA.debugLineNum = 147783682;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextobotonnegative(b4j.docU.jammsgdialogbbcodeview __ref,int _colorbotonnegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolortextobotonnegative", true))
	 {return ((String) Debug.delegate(ba, "setcolortextobotonnegative", new Object[] {_colorbotonnegative}));}
RDebugUtils.currentLine=147980288;
 //BA.debugLineNum = 147980288;BA.debugLine="Sub setColorTextoBotonNegative(ColorBotonNegative";
RDebugUtils.currentLine=147980289;
 //BA.debugLineNum = 147980289;BA.debugLine="mColorTextoBotonNegative=ColorBotonNegative";
__ref._mcolortextobotonnegative /*int*/  = _colorbotonnegative;
RDebugUtils.currentLine=147980290;
 //BA.debugLineNum = 147980290;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextobotonpositive(b4j.docU.jammsgdialogbbcodeview __ref,int _colorbotonpositive) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolortextobotonpositive", true))
	 {return ((String) Debug.delegate(ba, "setcolortextobotonpositive", new Object[] {_colorbotonpositive}));}
RDebugUtils.currentLine=147587072;
 //BA.debugLineNum = 147587072;BA.debugLine="Sub setColorTextoBotonPositive(ColorBotonPositive";
RDebugUtils.currentLine=147587073;
 //BA.debugLineNum = 147587073;BA.debugLine="mColorTextoBotonPositive=ColorBotonPositive";
__ref._mcolortextobotonpositive /*int*/  = _colorbotonpositive;
RDebugUtils.currentLine=147587074;
 //BA.debugLineNum = 147587074;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextomensaje(b4j.docU.jammsgdialogbbcodeview __ref,int _colortextomensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolortextomensaje", true))
	 {return ((String) Debug.delegate(ba, "setcolortextomensaje", new Object[] {_colortextomensaje}));}
RDebugUtils.currentLine=147259392;
 //BA.debugLineNum = 147259392;BA.debugLine="Sub setColorTextoMensaje(ColorTextoMensaje As Int)";
RDebugUtils.currentLine=147259393;
 //BA.debugLineNum = 147259393;BA.debugLine="mColorTextoMensaje=ColorTextoMensaje";
__ref._mcolortextomensaje /*int*/  = _colortextomensaje;
RDebugUtils.currentLine=147259394;
 //BA.debugLineNum = 147259394;BA.debugLine="End Sub";
return "";
}
public String  _setcolortextotodosbotones(b4j.docU.jammsgdialogbbcodeview __ref,int _colortextotodosbotones) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setcolortextotodosbotones", true))
	 {return ((String) Debug.delegate(ba, "setcolortextotodosbotones", new Object[] {_colortextotodosbotones}));}
RDebugUtils.currentLine=148111360;
 //BA.debugLineNum = 148111360;BA.debugLine="Sub setColorTextoTodosBotones(ColorTextoTodosBoton";
RDebugUtils.currentLine=148111361;
 //BA.debugLineNum = 148111361;BA.debugLine="mColorTextoBotonPositive=ColorTextoTodosBotones";
__ref._mcolortextobotonpositive /*int*/  = _colortextotodosbotones;
RDebugUtils.currentLine=148111362;
 //BA.debugLineNum = 148111362;BA.debugLine="mColorTextoBotonCancel=ColorTextoTodosBotones";
__ref._mcolortextobotoncancel /*int*/  = _colortextotodosbotones;
RDebugUtils.currentLine=148111363;
 //BA.debugLineNum = 148111363;BA.debugLine="mColorTextoBotonNegative=ColorTextoTodosBotones";
__ref._mcolortextobotonnegative /*int*/  = _colortextotodosbotones;
RDebugUtils.currentLine=148111364;
 //BA.debugLineNum = 148111364;BA.debugLine="End Sub";
return "";
}
public String  _setlighttheme(b4j.docU.jammsgdialogbbcodeview __ref,boolean _lighttheme) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setlighttheme", true))
	 {return ((String) Debug.delegate(ba, "setlighttheme", new Object[] {_lighttheme}));}
RDebugUtils.currentLine=146800640;
 //BA.debugLineNum = 146800640;BA.debugLine="Sub setLightTheme(LightTheme As Boolean)";
RDebugUtils.currentLine=146800641;
 //BA.debugLineNum = 146800641;BA.debugLine="mLightTheme=LightTheme";
__ref._mlighttheme /*boolean*/  = _lighttheme;
RDebugUtils.currentLine=146800642;
 //BA.debugLineNum = 146800642;BA.debugLine="mColorTextoMensaje=xui.Color_Black";
__ref._mcolortextomensaje /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=146800643;
 //BA.debugLineNum = 146800643;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemedate(b4j.docU.jammsgdialogbbcodeview __ref,b4j.docU.b4xdatetemplate _datetemplate) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setlightthemedate", true))
	 {return ((String) Debug.delegate(ba, "setlightthemedate", new Object[] {_datetemplate}));}
int _textcolor = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _x = null;
RDebugUtils.currentLine=149094400;
 //BA.debugLineNum = 149094400;BA.debugLine="Sub SetLightThemeDate(datetemplate As B4XDateTempl";
RDebugUtils.currentLine=149094401;
 //BA.debugLineNum = 149094401;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=149094402;
 //BA.debugLineNum = 149094402;BA.debugLine="datetemplate.DaysInWeekColor = xui.Color_Black";
_datetemplate._daysinweekcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=149094403;
 //BA.debugLineNum = 149094403;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x39),((int)0xd7),((int)0xce));
RDebugUtils.currentLine=149094404;
 //BA.debugLineNum = 149094404;BA.debugLine="datetemplate.HighlightedColor = xui.Color_ARGB(0x";
_datetemplate._highlightedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x00),((int)0xce),((int)0xff));
RDebugUtils.currentLine=149094405;
 //BA.debugLineNum = 149094405;BA.debugLine="datetemplate.DaysInMonthColor = TextColor";
_datetemplate._daysinmonthcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=149094406;
 //BA.debugLineNum = 149094406;BA.debugLine="datetemplate.lblMonth.TextColor = TextColor";
_datetemplate._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=149094407;
 //BA.debugLineNum = 149094407;BA.debugLine="datetemplate.lblYear.TextColor = TextColor";
_datetemplate._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=149094408;
 //BA.debugLineNum = 149094408;BA.debugLine="datetemplate.SelectedColor = xui.Color_ARGB(0xFF,";
_datetemplate._selectedcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0xff),((int)0xa7),((int)0x61));
RDebugUtils.currentLine=149094409;
 //BA.debugLineNum = 149094409;BA.debugLine="For Each x As B4XView In Array(datetemplate.btnMo";
_x = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final Object[] group9 = new Object[]{(Object)(_datetemplate._btnmonthleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnmonthright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_datetemplate._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject())};
final int groupLen9 = group9.length
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_x = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group9[index9]));
RDebugUtils.currentLine=149094410;
 //BA.debugLineNum = 149094410;BA.debugLine="x.Color = xui.Color_Transparent";
_x.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
 }
};
RDebugUtils.currentLine=149094412;
 //BA.debugLineNum = 149094412;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemeinput(b4j.docU.jammsgdialogbbcodeview __ref,b4j.docU.b4xinputtemplate _input) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setlightthemeinput", true))
	 {return ((String) Debug.delegate(ba, "setlightthemeinput", new Object[] {_input}));}
int _textcolor = 0;
RDebugUtils.currentLine=148963328;
 //BA.debugLineNum = 148963328;BA.debugLine="Sub SetLightThemeInput(input As B4XInputTemplate)";
RDebugUtils.currentLine=148963329;
 //BA.debugLineNum = 148963329;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=148963330;
 //BA.debugLineNum = 148963330;BA.debugLine="input.TextField1.TextColor = TextColor";
_input._textfield1 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=148963331;
 //BA.debugLineNum = 148963331;BA.debugLine="input.lblTitle.TextColor = TextColor";
_input._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);
RDebugUtils.currentLine=148963332;
 //BA.debugLineNum = 148963332;BA.debugLine="input.SetBorderColor(TextColor, xui.Color_Red)";
_input._setbordercolor /*String*/ (null,_textcolor,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
RDebugUtils.currentLine=148963333;
 //BA.debugLineNum = 148963333;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemelist(b4j.docU.jammsgdialogbbcodeview __ref,b4j.docU.b4xlisttemplate _list) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setlightthemelist", true))
	 {return ((String) Debug.delegate(ba, "setlightthemelist", new Object[] {_list}));}
int _textcolor = 0;
RDebugUtils.currentLine=148897792;
 //BA.debugLineNum = 148897792;BA.debugLine="Sub SetLightThemeList(list As B4XListTemplate)";
RDebugUtils.currentLine=148897793;
 //BA.debugLineNum = 148897793;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=148897794;
 //BA.debugLineNum = 148897794;BA.debugLine="list.CustomListView1.sv.ScrollViewInnerPanel.Colo";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=148897795;
 //BA.debugLineNum = 148897795;BA.debugLine="list.CustomListView1.sv.Color = xui.Color_White";
_list._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=148897796;
 //BA.debugLineNum = 148897796;BA.debugLine="list.CustomListView1.DefaultTextBackgroundColor =";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=148897797;
 //BA.debugLineNum = 148897797;BA.debugLine="list.CustomListView1.DefaultTextColor = TextColor";
_list._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=148897798;
 //BA.debugLineNum = 148897798;BA.debugLine="End Sub";
return "";
}
public String  _setlightthemesearch(b4j.docU.jammsgdialogbbcodeview __ref,b4j.docU.b4xsearchtemplate _search) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setlightthemesearch", true))
	 {return ((String) Debug.delegate(ba, "setlightthemesearch", new Object[] {_search}));}
int _textcolor = 0;
RDebugUtils.currentLine=149028864;
 //BA.debugLineNum = 149028864;BA.debugLine="Sub SetLightThemeSearch(search As B4XSearchTemplat";
RDebugUtils.currentLine=149028865;
 //BA.debugLineNum = 149028865;BA.debugLine="Dim TextColor As Int = xui.Color_ARGB(0xFF, 0x5B,";
_textcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0x5b),((int)0x5b),((int)0x5b));
RDebugUtils.currentLine=149028866;
 //BA.debugLineNum = 149028866;BA.debugLine="search.SearchField.TextField.TextColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setTextColor(_textcolor);
RDebugUtils.currentLine=149028867;
 //BA.debugLineNum = 149028867;BA.debugLine="search.SearchField.NonFocusedHintColor = TextColo";
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._nonfocusedhintcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=149028868;
 //BA.debugLineNum = 149028868;BA.debugLine="search.CustomListView1.sv.ScrollViewInnerPanel.Co";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewInnerPanel().setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB(((int)0xff),((int)0xdf),((int)0xdf),((int)0xdf)));
RDebugUtils.currentLine=149028869;
 //BA.debugLineNum = 149028869;BA.debugLine="search.CustomListView1.sv.Color = xui.Color_White";
_search._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White);
RDebugUtils.currentLine=149028870;
 //BA.debugLineNum = 149028870;BA.debugLine="search.CustomListView1.DefaultTextBackgroundColor";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=149028871;
 //BA.debugLineNum = 149028871;BA.debugLine="search.CustomListView1.DefaultTextColor = TextCol";
_search._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = _textcolor;
RDebugUtils.currentLine=149028872;
 //BA.debugLineNum = 149028872;BA.debugLine="If search.SearchField.lblV.IsInitialized Then sea";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=149028873;
 //BA.debugLineNum = 149028873;BA.debugLine="If search.SearchField.lblClear.IsInitialized Then";
if (_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
_search._searchfield /*b4j.docU.b4xfloattextfield*/ ._lblclear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(_textcolor);};
RDebugUtils.currentLine=149028874;
 //BA.debugLineNum = 149028874;BA.debugLine="End Sub";
return "";
}
public String  _setmovible(b4j.docU.jammsgdialogbbcodeview __ref,boolean _movible) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setmovible", true))
	 {return ((String) Debug.delegate(ba, "setmovible", new Object[] {_movible}));}
RDebugUtils.currentLine=146604032;
 //BA.debugLineNum = 146604032;BA.debugLine="Sub setMovible(Movible As Boolean)";
RDebugUtils.currentLine=146604033;
 //BA.debugLineNum = 146604033;BA.debugLine="mMovible=Movible";
__ref._mmovible /*boolean*/  = _movible;
RDebugUtils.currentLine=146604034;
 //BA.debugLineNum = 146604034;BA.debugLine="End Sub";
return "";
}
public String  _setnombreficheroiconobarratitulo(b4j.docU.jammsgdialogbbcodeview __ref,String _nombreficheroicono) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "setnombreficheroiconobarratitulo", true))
	 {return ((String) Debug.delegate(ba, "setnombreficheroiconobarratitulo", new Object[] {_nombreficheroicono}));}
RDebugUtils.currentLine=148242432;
 //BA.debugLineNum = 148242432;BA.debugLine="Sub setNombreFicheroIconoBarraTitulo(NombreFichero";
RDebugUtils.currentLine=148242433;
 //BA.debugLineNum = 148242433;BA.debugLine="mNombreFicheroIconoTitulo=NombreFicheroIcono";
__ref._mnombreficheroiconotitulo /*String*/  = _nombreficheroicono;
RDebugUtils.currentLine=148242434;
 //BA.debugLineNum = 148242434;BA.debugLine="End Sub";
return "";
}
public String  _settamanofuentetextomensaje(b4j.docU.jammsgdialogbbcodeview __ref,float _tamanofuentetextomensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "settamanofuentetextomensaje", true))
	 {return ((String) Debug.delegate(ba, "settamanofuentetextomensaje", new Object[] {_tamanofuentetextomensaje}));}
RDebugUtils.currentLine=147324928;
 //BA.debugLineNum = 147324928;BA.debugLine="Sub setTamanoFuenteTextoMensaje(TamanoFuenteTextoM";
RDebugUtils.currentLine=147324929;
 //BA.debugLineNum = 147324929;BA.debugLine="mTamanoFuenteTextoMensaje=TamanoFuenteTextoMensaj";
__ref._mtamanofuentetextomensaje /*float*/  = _tamanofuentetextomensaje;
RDebugUtils.currentLine=147324930;
 //BA.debugLineNum = 147324930;BA.debugLine="End Sub";
return "";
}
public String  _settamanofuentetitulo(b4j.docU.jammsgdialogbbcodeview __ref,float _tamanofuentetitulo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "settamanofuentetitulo", true))
	 {return ((String) Debug.delegate(ba, "settamanofuentetitulo", new Object[] {_tamanofuentetitulo}));}
RDebugUtils.currentLine=147062784;
 //BA.debugLineNum = 147062784;BA.debugLine="Sub setTamanoFuenteTitulo(TamanoFuenteTitulo As Fl";
RDebugUtils.currentLine=147062785;
 //BA.debugLineNum = 147062785;BA.debugLine="mTamanoFuenteTitulo=TamanoFuenteTitulo";
__ref._mtamanofuentetitulo /*float*/  = _tamanofuentetitulo;
RDebugUtils.currentLine=147062786;
 //BA.debugLineNum = 147062786;BA.debugLine="End Sub";
return "";
}
public String  _settamanotextotodosbotones(b4j.docU.jammsgdialogbbcodeview __ref,float _tamanotextotodosbotones) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "settamanotextotodosbotones", true))
	 {return ((String) Debug.delegate(ba, "settamanotextotodosbotones", new Object[] {_tamanotextotodosbotones}));}
RDebugUtils.currentLine=148176896;
 //BA.debugLineNum = 148176896;BA.debugLine="Sub setTamanoTextoTodosBotones(TamanoTextoTodosBot";
RDebugUtils.currentLine=148176897;
 //BA.debugLineNum = 148176897;BA.debugLine="mTamanoFuenteBotonesDialogo=TamanoTextoTodosBoton";
__ref._mtamanofuentebotonesdialogo /*float*/  = _tamanotextotodosbotones;
RDebugUtils.currentLine=148176898;
 //BA.debugLineNum = 148176898;BA.debugLine="End Sub";
return "";
}
public String  _settextobotoncancel(b4j.docU.jammsgdialogbbcodeview __ref,String _textobotoncancel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "settextobotoncancel", true))
	 {return ((String) Debug.delegate(ba, "settextobotoncancel", new Object[] {_textobotoncancel}));}
RDebugUtils.currentLine=147652608;
 //BA.debugLineNum = 147652608;BA.debugLine="Sub setTextoBotonCancel(TextoBotonCancel As String";
RDebugUtils.currentLine=147652609;
 //BA.debugLineNum = 147652609;BA.debugLine="mTextoBotonCancel=TextoBotonCancel";
__ref._mtextobotoncancel /*String*/  = _textobotoncancel;
RDebugUtils.currentLine=147652610;
 //BA.debugLineNum = 147652610;BA.debugLine="End Sub";
return "";
}
public String  _settextobotonnegative(b4j.docU.jammsgdialogbbcodeview __ref,String _textobotonnegative) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "settextobotonnegative", true))
	 {return ((String) Debug.delegate(ba, "settextobotonnegative", new Object[] {_textobotonnegative}));}
RDebugUtils.currentLine=147849216;
 //BA.debugLineNum = 147849216;BA.debugLine="Sub setTextoBotonNegative(TextoBotonNegative As St";
RDebugUtils.currentLine=147849217;
 //BA.debugLineNum = 147849217;BA.debugLine="mTextoBotonNegative=TextoBotonNegative";
__ref._mtextobotonnegative /*String*/  = _textobotonnegative;
RDebugUtils.currentLine=147849218;
 //BA.debugLineNum = 147849218;BA.debugLine="End Sub";
return "";
}
public String  _settextobotonpositive(b4j.docU.jammsgdialogbbcodeview __ref,String _textobotonpositive) throws Exception{
__ref = this;
RDebugUtils.currentModule="jammsgdialogbbcodeview";
if (Debug.shouldDelegate(ba, "settextobotonpositive", true))
	 {return ((String) Debug.delegate(ba, "settextobotonpositive", new Object[] {_textobotonpositive}));}
RDebugUtils.currentLine=147456000;
 //BA.debugLineNum = 147456000;BA.debugLine="Sub setTextoBotonPositive(TextoBotonPositive As St";
RDebugUtils.currentLine=147456001;
 //BA.debugLineNum = 147456001;BA.debugLine="mTextoBotonPositive=TextoBotonPositive";
__ref._mtextobotonpositive /*String*/  = _textobotonpositive;
RDebugUtils.currentLine=147456002;
 //BA.debugLineNum = 147456002;BA.debugLine="End Sub";
return "";
}
public double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
}