package b4j.docU;

import anywheresoftware.b4a.debug.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jamloadingindicator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamloadingindicator", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jamloadingindicator.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mparent = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbaseloadingindicator = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _index = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public int _mancholoadingindicator = 0;
public String _mdrawingsubname = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _background = null;
public int _mcolorpanelfondo = 0;
public String _mestilo = "";
public int _mcolorindicator = 0;
public int _mduracionciclo = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mpanelfondoloadingindicatorcanvasmensaje = null;
public int _mcolorpanelfondoloadingindicatorcanvasmensaje = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlabelmensaje = null;
public Object _mmensajeloading = null;
public float _mtamanofuentemensaje = 0f;
public int _mcolorfondolabelmensaje = 0;
public int _mcolormensaje = 0;
public int _mancholabelmensaje = 0;
public String _malineacionhorizontalmensaje = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _mlabelcontroltiempoproceso = null;
public anywheresoftware.b4a.objects.collections.List _mlstestilos = null;
public boolean _mmostrartiempoproceso = false;
public long _ticksiniciocontroltiempoproceso = 0L;
public anywheresoftware.b4a.objects.Timer _timercontroltiempoproceso = null;
public int _mintervalotimercontroltiempoproceso = 0;
public String _mtextocontroltiempoproceso = "";
public String _jamloadingindicatorestilo_threecircles1 = "";
public String _jamloadingindicatorestilo_threecircles1b = "";
public String _jamloadingindicatorestilo_threecircles2 = "";
public String _jamloadingindicatorestilo_threecircles3 = "";
public String _jamloadingindicatorestilo_singlecircle = "";
public String _jamloadingindicatorestilo_fivelines1 = "";
public String _jamloadingindicatorestilo_tenlines = "";
public String _jamloadingindicatorestilo_arc1 = "";
public String _jamloadingindicatorestilo_arc2 = "";
public String _jamloadingindicatorestilo_pacman = "";
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
public String  _show(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4j.objects.LabelWrapper _lblmensaje = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
int _alturaespaciobajoloadingindicator = 0;
double _hlabelmensaje = 0;
anywheresoftware.b4j.objects.LabelWrapper _lblcontroltiempo = null;
double _pnlleft = 0;
double _pnltop = 0;
double _pnlwidth = 0;
double _pnlheight = 0;
RDebugUtils.currentLine=141754368;
 //BA.debugLineNum = 141754368;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=141754370;
 //BA.debugLineNum = 141754370;BA.debugLine="If Background.IsInitialized Then";
if (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=141754371;
 //BA.debugLineNum = 141754371;BA.debugLine="Background.Visible = False";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=141754373;
 //BA.debugLineNum = 141754373;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=141754376;
 //BA.debugLineNum = 141754376;BA.debugLine="Background= xui.CreatePanel(\"background\")";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"background");
RDebugUtils.currentLine=141754377;
 //BA.debugLineNum = 141754377;BA.debugLine="Background.Tag = \"JamLoadingIndicator_background\"";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)("JamLoadingIndicator_background"));
RDebugUtils.currentLine=141754378;
 //BA.debugLineNum = 141754378;BA.debugLine="Background.Color=mColorPanelFondo";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mcolorpanelfondo /*int*/ );
RDebugUtils.currentLine=141754379;
 //BA.debugLineNum = 141754379;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),0,0,__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=141754380;
 //BA.debugLineNum = 141754380;BA.debugLine="mBaseLoadingIndicator =xui.CreatePanel(\"\")";
__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=141754381;
 //BA.debugLineNum = 141754381;BA.debugLine="Background.AddView(mBaseLoadingIndicator,Max(0,(B";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2)-__c.DipToCurrent((int) (25))),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)-__c.DipToCurrent((int) (25))),__ref._mancholoadingindicator /*int*/ ,__ref._mancholoadingindicator /*int*/ );
RDebugUtils.currentLine=141754384;
 //BA.debugLineNum = 141754384;BA.debugLine="Dim lblMensaje As Label";
_lblmensaje = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=141754385;
 //BA.debugLineNum = 141754385;BA.debugLine="lblMensaje.Initialize(\"\")";
_lblmensaje.Initialize(ba,"");
RDebugUtils.currentLine=141754386;
 //BA.debugLineNum = 141754386;BA.debugLine="mLabelMensaje=lblMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblmensaje.getObject()));
RDebugUtils.currentLine=141754387;
 //BA.debugLineNum = 141754387;BA.debugLine="mLabelMensaje.TextSize=mTamanoFuenteMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize(__ref._mtamanofuentemensaje /*float*/ );
RDebugUtils.currentLine=141754388;
 //BA.debugLineNum = 141754388;BA.debugLine="mLabelMensaje.Color=mColorFondoLabelMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mcolorfondolabelmensaje /*int*/ );
RDebugUtils.currentLine=141754389;
 //BA.debugLineNum = 141754389;BA.debugLine="mLabelMensaje.TextColor=mColorMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._mcolormensaje /*int*/ );
RDebugUtils.currentLine=141754390;
 //BA.debugLineNum = 141754390;BA.debugLine="mLabelMensaje.Text=mMensajeLoading";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__ref._mmensajeloading /*Object*/ ));
RDebugUtils.currentLine=141754391;
 //BA.debugLineNum = 141754391;BA.debugLine="mLabelMensaje.SetTextAlignment(\"CENTER\",\"CENTER\")";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=141754393;
 //BA.debugLineNum = 141754393;BA.debugLine="Dim lblMensaje As Label=mLabelMensaje";
_lblmensaje = new anywheresoftware.b4j.objects.LabelWrapper();
_lblmensaje = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=141754394;
 //BA.debugLineNum = 141754394;BA.debugLine="Dim jo As JavaObject = lblMensaje";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lblmensaje.getObject()));
RDebugUtils.currentLine=141754395;
 //BA.debugLineNum = 141754395;BA.debugLine="jo.RunMethod(\"setTextAlignment\", Array(mAlineacio";
_jo.RunMethod("setTextAlignment",new Object[]{(Object)(__ref._malineacionhorizontalmensaje /*String*/ )});
RDebugUtils.currentLine=141754397;
 //BA.debugLineNum = 141754397;BA.debugLine="mLabelMensaje.Width=mAnchoLabelMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mancholabelmensaje /*int*/ );
RDebugUtils.currentLine=141754399;
 //BA.debugLineNum = 141754399;BA.debugLine="Dim AlturaEspacioBajoLoadingIndicator As Int=Back";
_alturaespaciobajoloadingindicator = (int) (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=141754400;
 //BA.debugLineNum = 141754400;BA.debugLine="Dim hLabelMensaje As Double";
_hlabelmensaje = 0;
RDebugUtils.currentLine=141754407;
 //BA.debugLineNum = 141754407;BA.debugLine="lblMensaje.WrapText = True";
_lblmensaje.setWrapText(__c.True);
RDebugUtils.currentLine=141754408;
 //BA.debugLineNum = 141754408;BA.debugLine="hLabelMensaje=Min(MedirAlturaTextoMultilinea(mLab";
_hlabelmensaje = __c.Min(__ref._mediralturatextomultilinea /*double*/ (null,__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont(),__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),BA.ObjectToString(__ref._mmensajeloading /*Object*/ )),_alturaespaciobajoloadingindicator-__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=141754409;
 //BA.debugLineNum = 141754409;BA.debugLine="mLabelMensaje.Height=hLabelMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_hlabelmensaje);
RDebugUtils.currentLine=141754410;
 //BA.debugLineNum = 141754410;BA.debugLine="Background.AddView(mLabelMensaje,Max(0,(Backgroun";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._mancholabelmensaje /*int*/ )/(double)2),__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (5)),__ref._mancholabelmensaje /*int*/ ,_hlabelmensaje);
RDebugUtils.currentLine=141754414;
 //BA.debugLineNum = 141754414;BA.debugLine="Dim lblControlTiempo As Label";
_lblcontroltiempo = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=141754415;
 //BA.debugLineNum = 141754415;BA.debugLine="lblControlTiempo.Initialize(\"\")";
_lblcontroltiempo.Initialize(ba,"");
RDebugUtils.currentLine=141754419;
 //BA.debugLineNum = 141754419;BA.debugLine="mLabelControlTiempoProceso=lblControlTiempo";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lblcontroltiempo.getObject()));
RDebugUtils.currentLine=141754420;
 //BA.debugLineNum = 141754420;BA.debugLine="mLabelControlTiempoProceso.TextSize=Max(mTamanoFu";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize(__c.Max(__ref._mtamanofuentemensaje /*float*/ -2,4));
RDebugUtils.currentLine=141754421;
 //BA.debugLineNum = 141754421;BA.debugLine="mLabelControlTiempoProceso.TextColor=mColorMensaj";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._mcolormensaje /*int*/ );
RDebugUtils.currentLine=141754422;
 //BA.debugLineNum = 141754422;BA.debugLine="mLabelControlTiempoProceso.SetTextAlignment(\"CENT";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=141754423;
 //BA.debugLineNum = 141754423;BA.debugLine="mLabelControlTiempoProceso.Width=mAnchoLabelMensa";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mancholabelmensaje /*int*/ );
RDebugUtils.currentLine=141754425;
 //BA.debugLineNum = 141754425;BA.debugLine="mLabelControlTiempoProceso.Height=mLabelControlTi";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTextSize()+__c.DipToCurrent((int) (4)));
RDebugUtils.currentLine=141754426;
 //BA.debugLineNum = 141754426;BA.debugLine="Background.AddView(mLabelControlTiempoProceso,Max";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._mancholabelmensaje /*int*/ )/(double)2),__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (5)),__ref._mancholabelmensaje /*int*/ ,_hlabelmensaje);
RDebugUtils.currentLine=141754428;
 //BA.debugLineNum = 141754428;BA.debugLine="mlstEstilos.initialize";
__ref._mlstestilos /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=141754429;
 //BA.debugLineNum = 141754429;BA.debugLine="mlstEstilos.addAll(Array As String(\"Three Circles";
__ref._mlstestilos /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Three Circles 1","Three Circles 1b","Three Circles 2","Three Circles 3","Single Circle","Five Lines 1","Ten Lines","Arc 1","Arc 2","PacMan"}));
RDebugUtils.currentLine=141754433;
 //BA.debugLineNum = 141754433;BA.debugLine="mDrawingSubName=\"Draw_\" & mEstilo.Replace(\" \", \"\"";
__ref._mdrawingsubname /*String*/  = "Draw_"+__ref._mestilo /*String*/ .replace(" ","");
RDebugUtils.currentLine=141754434;
 //BA.debugLineNum = 141754434;BA.debugLine="cvs.Initialize(mBaseLoadingIndicator)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(ba,__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=141754436;
 //BA.debugLineNum = 141754436;BA.debugLine="If mPanelFondoLoadingIndicatorCanvasMensaje.IsIni";
if (__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=141754437;
 //BA.debugLineNum = 141754437;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje=xui.Cre";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=141754438;
 //BA.debugLineNum = 141754438;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetColo";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mcolorpanelfondoloadingindicatorcanvasmensaje /*int*/ ,0,(int) (0),__c.DipToCurrent((int) (5)));
 };
RDebugUtils.currentLine=141754440;
 //BA.debugLineNum = 141754440;BA.debugLine="Dim PnlLeft As Double=Min(mBaseLoadingIndicator.L";
_pnlleft = __c.Min(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__c.Min(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()))-__c.DipToCurrent((int) (5));
RDebugUtils.currentLine=141754441;
 //BA.debugLineNum = 141754441;BA.debugLine="Dim PnlTop As Double=Min(mBaseLoadingIndicator.To";
_pnltop = __c.Min(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__c.Min(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()))-__c.DipToCurrent((int) (5));
RDebugUtils.currentLine=141754442;
 //BA.debugLineNum = 141754442;BA.debugLine="Dim PnlWidth As Double=Max(mBaseLoadingIndicator.";
_pnlwidth = __c.Max(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()))+__c.DipToCurrent((int) (10));
RDebugUtils.currentLine=141754443;
 //BA.debugLineNum = 141754443;BA.debugLine="Dim PnlHeight As Double=mBaseLoadingIndicator.Hei";
_pnlheight = __ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (15));
RDebugUtils.currentLine=141754444;
 //BA.debugLineNum = 141754444;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetLayou";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_pnlleft,_pnltop,_pnlwidth,_pnlheight);
RDebugUtils.currentLine=141754445;
 //BA.debugLineNum = 141754445;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.Color=mC";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mcolorpanelfondoloadingindicatorcanvasmensaje /*int*/ );
RDebugUtils.currentLine=141754446;
 //BA.debugLineNum = 141754446;BA.debugLine="If mPanelFondoLoadingIndicatorCanvasMensaje.Paren";
if (__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=141754447;
 //BA.debugLineNum = 141754447;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.RemoveV";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=141754449;
 //BA.debugLineNum = 141754449;BA.debugLine="Background.AddView(mPanelFondoLoadingIndicatorCan";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((javafx.scene.Node)(__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_pnlwidth)/(double)2),_pnltop,_pnlwidth,_pnlheight);
RDebugUtils.currentLine=141754450;
 //BA.debugLineNum = 141754450;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SendToBa";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SendToBack();
RDebugUtils.currentLine=141754452;
 //BA.debugLineNum = 141754452;BA.debugLine="Background.Visible = True";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=141754453;
 //BA.debugLineNum = 141754453;BA.debugLine="MainLoop";
__ref._mainloop /*void*/ (null);
RDebugUtils.currentLine=141754454;
 //BA.debugLineNum = 141754454;BA.debugLine="End Sub";
return "";
}
public String  _close(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "close", true))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=141819904;
 //BA.debugLineNum = 141819904;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=141819905;
 //BA.debugLineNum = 141819905;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=141819906;
 //BA.debugLineNum = 141819906;BA.debugLine="DetenerControlTiempoProceso";
__ref._detenercontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=141819907;
 //BA.debugLineNum = 141819907;BA.debugLine="If Background.IsInitialized Then";
if (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=141819908;
 //BA.debugLineNum = 141819908;BA.debugLine="Background.Visible = False";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=141819909;
 //BA.debugLineNum = 141819909;BA.debugLine="Background.RemoveAllViews";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=141819911;
 //BA.debugLineNum = 141819911;BA.debugLine="Background.RemoveViewFromParent";
__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=141819913;
 //BA.debugLineNum = 141819913;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.jamloadingindicator __ref,anywheresoftware.b4a.BA _ba,Object _callback,anywheresoftware.b4a.objects.B4XViewWrapper _parent) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_parent}));}
RDebugUtils.currentLine=139984896;
 //BA.debugLineNum = 139984896;BA.debugLine="Public Sub Initialize (Callback As Object, Parent";
RDebugUtils.currentLine=139984900;
 //BA.debugLineNum = 139984900;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=139984901;
 //BA.debugLineNum = 139984901;BA.debugLine="mParent=Parent";
__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _parent;
RDebugUtils.currentLine=139984904;
 //BA.debugLineNum = 139984904;BA.debugLine="mColorPanelFondo=0xaa000000";
__ref._mcolorpanelfondo /*int*/  = ((int)0xaa000000);
RDebugUtils.currentLine=139984905;
 //BA.debugLineNum = 139984905;BA.debugLine="mMensajeLoading=\"\"";
__ref._mmensajeloading /*Object*/  = (Object)("");
RDebugUtils.currentLine=139984910;
 //BA.debugLineNum = 139984910;BA.debugLine="mAnchoLabelMensaje=0.8*mParent.Width";
__ref._mancholabelmensaje /*int*/  = (int) (0.8*__ref._mparent /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=139984913;
 //BA.debugLineNum = 139984913;BA.debugLine="mAnchoLoadingIndicator=50dip";
__ref._mancholoadingindicator /*int*/  = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=139984915;
 //BA.debugLineNum = 139984915;BA.debugLine="mColorMensaje=xui.Color_Cyan";
__ref._mcolormensaje /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Cyan;
RDebugUtils.currentLine=139984919;
 //BA.debugLineNum = 139984919;BA.debugLine="mEstilo=JamLoadingIndicatorEstilo_FiveLines1";
__ref._mestilo /*String*/  = __ref._jamloadingindicatorestilo_fivelines1 /*String*/ ;
RDebugUtils.currentLine=139984928;
 //BA.debugLineNum = 139984928;BA.debugLine="mColorMensaje=xui.Color_White";
__ref._mcolormensaje /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=139984929;
 //BA.debugLineNum = 139984929;BA.debugLine="mColorIndicator=xui.Color_White";
__ref._mcolorindicator /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=139984930;
 //BA.debugLineNum = 139984930;BA.debugLine="mColorFondoLabelMensaje=0x00FFFFFF";
__ref._mcolorfondolabelmensaje /*int*/  = ((int)0x00ffffff);
RDebugUtils.currentLine=139984931;
 //BA.debugLineNum = 139984931;BA.debugLine="mTamanoFuenteMensaje=14";
__ref._mtamanofuentemensaje /*float*/  = (float) (14);
RDebugUtils.currentLine=139984932;
 //BA.debugLineNum = 139984932;BA.debugLine="mAlineacionHorizontalMensaje=\"CENTER\"";
__ref._malineacionhorizontalmensaje /*String*/  = "CENTER";
RDebugUtils.currentLine=139984934;
 //BA.debugLineNum = 139984934;BA.debugLine="mColorPanelFondoLoadingIndicatorCanvasMensaje=xui";
__ref._mcolorpanelfondoloadingindicatorcanvasmensaje /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=139984935;
 //BA.debugLineNum = 139984935;BA.debugLine="mDuracionCiclo=1000";
__ref._mduracionciclo /*int*/  = (int) (1000);
RDebugUtils.currentLine=139984937;
 //BA.debugLineNum = 139984937;BA.debugLine="mMostrarTiempoProceso=True";
__ref._mmostrartiempoproceso /*boolean*/  = __c.True;
RDebugUtils.currentLine=139984938;
 //BA.debugLineNum = 139984938;BA.debugLine="mIntervaloTimerControlTiempoProceso=1000";
__ref._mintervalotimercontroltiempoproceso /*int*/  = (int) (1000);
RDebugUtils.currentLine=139984939;
 //BA.debugLineNum = 139984939;BA.debugLine="mTextoControlTiempoProceso=\"\"";
__ref._mtextocontroltiempoproceso /*String*/  = "";
RDebugUtils.currentLine=139984942;
 //BA.debugLineNum = 139984942;BA.debugLine="End Sub";
return "";
}
public String  _setestiloloadingindicator(b4j.docU.jamloadingindicator __ref,String _estiloloadingindicator) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setestiloloadingindicator", true))
	 {return ((String) Debug.delegate(ba, "setestiloloadingindicator", new Object[] {_estiloloadingindicator}));}
RDebugUtils.currentLine=141426688;
 //BA.debugLineNum = 141426688;BA.debugLine="Public Sub setEstiloLoadingIndicator(EstiloLoading";
RDebugUtils.currentLine=141426689;
 //BA.debugLineNum = 141426689;BA.debugLine="mEstilo=EstiloLoadingIndicator";
__ref._mestilo /*String*/  = _estiloloadingindicator;
RDebugUtils.currentLine=141426690;
 //BA.debugLineNum = 141426690;BA.debugLine="End Sub";
return "";
}
public String  _setcolorpanelfondo(b4j.docU.jamloadingindicator __ref,int _colorpanelfondo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setcolorpanelfondo", true))
	 {return ((String) Debug.delegate(ba, "setcolorpanelfondo", new Object[] {_colorpanelfondo}));}
RDebugUtils.currentLine=140115968;
 //BA.debugLineNum = 140115968;BA.debugLine="Public Sub setColorPanelFondo(ColorPanelFondo As I";
RDebugUtils.currentLine=140115969;
 //BA.debugLineNum = 140115969;BA.debugLine="mColorPanelFondo=ColorPanelFondo";
__ref._mcolorpanelfondo /*int*/  = _colorpanelfondo;
RDebugUtils.currentLine=140115970;
 //BA.debugLineNum = 140115970;BA.debugLine="End Sub";
return "";
}
public String  _setcolorloadingindicator(b4j.docU.jamloadingindicator __ref,int _colorloadingindicator) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setcolorloadingindicator", true))
	 {return ((String) Debug.delegate(ba, "setcolorloadingindicator", new Object[] {_colorloadingindicator}));}
RDebugUtils.currentLine=141492224;
 //BA.debugLineNum = 141492224;BA.debugLine="Public Sub setColorLoadingIndicator(ColorLoadingIn";
RDebugUtils.currentLine=141492225;
 //BA.debugLineNum = 141492225;BA.debugLine="mColorIndicator=ColorLoadingIndicator";
__ref._mcolorindicator /*int*/  = _colorloadingindicator;
RDebugUtils.currentLine=141492226;
 //BA.debugLineNum = 141492226;BA.debugLine="End Sub";
return "";
}
public String  _setcolormensaje(b4j.docU.jamloadingindicator __ref,int _colormensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setcolormensaje", true))
	 {return ((String) Debug.delegate(ba, "setcolormensaje", new Object[] {_colormensaje}));}
RDebugUtils.currentLine=141230080;
 //BA.debugLineNum = 141230080;BA.debugLine="Public Sub setColorMensaje(ColorMensaje As Int)";
RDebugUtils.currentLine=141230082;
 //BA.debugLineNum = 141230082;BA.debugLine="mColorMensaje=ColorMensaje";
__ref._mcolormensaje /*int*/  = _colormensaje;
RDebugUtils.currentLine=141230083;
 //BA.debugLineNum = 141230083;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=141230084;
 //BA.debugLineNum = 141230084;BA.debugLine="End Sub";
return "";
}
public String  _setmensajeloading(b4j.docU.jamloadingindicator __ref,Object _mensajeloading) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setmensajeloading", true))
	 {return ((String) Debug.delegate(ba, "setmensajeloading", new Object[] {_mensajeloading}));}
RDebugUtils.currentLine=141033472;
 //BA.debugLineNum = 141033472;BA.debugLine="Public Sub setMensajeLoading(MensajeLoading As Obj";
RDebugUtils.currentLine=141033474;
 //BA.debugLineNum = 141033474;BA.debugLine="mMensajeLoading=MensajeLoading";
__ref._mmensajeloading /*Object*/  = _mensajeloading;
RDebugUtils.currentLine=141033475;
 //BA.debugLineNum = 141033475;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=141033476;
 //BA.debugLineNum = 141033476;BA.debugLine="End Sub";
return "";
}
public String  _iniciarcontroltiempoproceso(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "iniciarcontroltiempoproceso", true))
	 {return ((String) Debug.delegate(ba, "iniciarcontroltiempoproceso", null));}
RDebugUtils.currentLine=140574720;
 //BA.debugLineNum = 140574720;BA.debugLine="public Sub IniciarControlTiempoProceso";
RDebugUtils.currentLine=140574721;
 //BA.debugLineNum = 140574721;BA.debugLine="If TimerControlTiempoProceso.IsInitialized=False";
if (__ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=140574722;
 //BA.debugLineNum = 140574722;BA.debugLine="TimerControlTiempoProceso.Initialize(\"TimerContr";
__ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"TimerControlTiempoProceso",(long) (__ref._mintervalotimercontroltiempoproceso /*int*/ ));
 };
RDebugUtils.currentLine=140574724;
 //BA.debugLineNum = 140574724;BA.debugLine="TimerControlTiempoProceso.Enabled=True";
__ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
RDebugUtils.currentLine=140574725;
 //BA.debugLineNum = 140574725;BA.debugLine="ReiniciarTiempoInicioControlTiempoProceso";
__ref._reiniciartiempoiniciocontroltiempoproceso /*String*/ (null);
RDebugUtils.currentLine=140574727;
 //BA.debugLineNum = 140574727;BA.debugLine="End Sub";
return "";
}
public String  _setduracionciclo(b4j.docU.jamloadingindicator __ref,int _duracionciclo) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setduracionciclo", true))
	 {return ((String) Debug.delegate(ba, "setduracionciclo", new Object[] {_duracionciclo}));}
RDebugUtils.currentLine=141557760;
 //BA.debugLineNum = 141557760;BA.debugLine="Public Sub setDuracionCiclo(DuracionCiclo As Int)";
RDebugUtils.currentLine=141557761;
 //BA.debugLineNum = 141557761;BA.debugLine="mDuracionCiclo=DuracionCiclo";
__ref._mduracionciclo /*int*/  = _duracionciclo;
RDebugUtils.currentLine=141557762;
 //BA.debugLineNum = 141557762;BA.debugLine="End Sub";
return "";
}
public String  _detenercontroltiempoproceso(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "detenercontroltiempoproceso", true))
	 {return ((String) Debug.delegate(ba, "detenercontroltiempoproceso", null));}
RDebugUtils.currentLine=140640256;
 //BA.debugLineNum = 140640256;BA.debugLine="public Sub DetenerControlTiempoProceso";
RDebugUtils.currentLine=140640257;
 //BA.debugLineNum = 140640257;BA.debugLine="If TimerControlTiempoProceso.IsInitialized Then";
if (__ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .IsInitialized()) { 
RDebugUtils.currentLine=140640258;
 //BA.debugLineNum = 140640258;BA.debugLine="TimerControlTiempoProceso.Enabled=False";
__ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
 };
RDebugUtils.currentLine=140640260;
 //BA.debugLineNum = 140640260;BA.debugLine="End Sub";
return "";
}
public String  _actualizarmensajeloading(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "actualizarmensajeloading", true))
	 {return ((String) Debug.delegate(ba, "actualizarmensajeloading", null));}
int _alturaespaciobajoloadingindicator = 0;
double _hlabelmensaje = 0;
anywheresoftware.b4j.objects.LabelWrapper _lblmensaje = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
double _pnlleft = 0;
double _pnltop = 0;
double _pnlwidth = 0;
double _pnlheight = 0;
RDebugUtils.currentLine=141361152;
 //BA.debugLineNum = 141361152;BA.debugLine="Private Sub ActualizarMensajeLoading";
RDebugUtils.currentLine=141361153;
 //BA.debugLineNum = 141361153;BA.debugLine="If mLabelMensaje.IsInitialized=False Then Return";
if (__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=141361154;
 //BA.debugLineNum = 141361154;BA.debugLine="mLabelMensaje.Text=mMensajeLoading";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToString(__ref._mmensajeloading /*Object*/ ));
RDebugUtils.currentLine=141361155;
 //BA.debugLineNum = 141361155;BA.debugLine="mLabelMensaje.TextSize=mTamanoFuenteMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextSize(__ref._mtamanofuentemensaje /*float*/ );
RDebugUtils.currentLine=141361156;
 //BA.debugLineNum = 141361156;BA.debugLine="mLabelMensaje.TextColor=mColorMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._mcolormensaje /*int*/ );
RDebugUtils.currentLine=141361157;
 //BA.debugLineNum = 141361157;BA.debugLine="mLabelMensaje.Left=Max(0,(Background.Width-mAncho";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft(__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._mancholabelmensaje /*int*/ )/(double)2));
RDebugUtils.currentLine=141361158;
 //BA.debugLineNum = 141361158;BA.debugLine="mLabelMensaje.Width=mAnchoLabelMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(__ref._mancholabelmensaje /*int*/ );
RDebugUtils.currentLine=141361160;
 //BA.debugLineNum = 141361160;BA.debugLine="mBaseLoadingIndicator.SetLayoutAnimated(0,Max(0,(";
__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2)-(__ref._mancholoadingindicator /*int*/ /(double)2)),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)-(__ref._mancholoadingindicator /*int*/ /(double)2)),__ref._mancholoadingindicator /*int*/ ,__ref._mancholoadingindicator /*int*/ );
RDebugUtils.currentLine=141361162;
 //BA.debugLineNum = 141361162;BA.debugLine="Dim AlturaEspacioBajoLoadingIndicator As Int=Back";
_alturaespaciobajoloadingindicator = (int) (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (5))));
RDebugUtils.currentLine=141361163;
 //BA.debugLineNum = 141361163;BA.debugLine="Dim hLabelMensaje As Double";
_hlabelmensaje = 0;
RDebugUtils.currentLine=141361168;
 //BA.debugLineNum = 141361168;BA.debugLine="hLabelMensaje=Min(MedirAlturaTextoMultilinea(mLab";
_hlabelmensaje = __c.Min(__ref._mediralturatextomultilinea /*double*/ (null,__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getFont(),__ref._mancholabelmensaje /*int*/ ,BA.ObjectToString(__ref._mmensajeloading /*Object*/ )),_alturaespaciobajoloadingindicator-__c.DipToCurrent((int) (10)));
RDebugUtils.currentLine=141361170;
 //BA.debugLineNum = 141361170;BA.debugLine="mLabelMensaje.Height=hLabelMensaje";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(_hlabelmensaje);
RDebugUtils.currentLine=141361177;
 //BA.debugLineNum = 141361177;BA.debugLine="Dim lblMensaje As Label=mLabelMensaje";
_lblmensaje = new anywheresoftware.b4j.objects.LabelWrapper();
_lblmensaje = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=141361178;
 //BA.debugLineNum = 141361178;BA.debugLine="Dim jo As JavaObject = lblMensaje";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lblmensaje.getObject()));
RDebugUtils.currentLine=141361179;
 //BA.debugLineNum = 141361179;BA.debugLine="jo.RunMethod(\"setTextAlignment\", Array(mAlineacio";
_jo.RunMethod("setTextAlignment",new Object[]{(Object)(__ref._malineacionhorizontalmensaje /*String*/ )});
RDebugUtils.currentLine=141361183;
 //BA.debugLineNum = 141361183;BA.debugLine="mLabelMensaje.SetLayoutAnimated(0,Max(0,(Backgrou";
__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._mancholabelmensaje /*int*/ )/(double)2),__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (5)),__ref._mancholabelmensaje /*int*/ ,_hlabelmensaje);
RDebugUtils.currentLine=141361184;
 //BA.debugLineNum = 141361184;BA.debugLine="mLabelControlTiempoProceso.SetLayoutAnimated(0,Ma";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.Max(0,(__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._mancholabelmensaje /*int*/ )/(double)2),__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()+__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (5)),__ref._mancholabelmensaje /*int*/ ,_hlabelmensaje);
RDebugUtils.currentLine=141361186;
 //BA.debugLineNum = 141361186;BA.debugLine="If mPanelFondoLoadingIndicatorCanvasMensaje.IsIni";
if (__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=141361187;
 //BA.debugLineNum = 141361187;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje=xui.Cre";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=141361188;
 //BA.debugLineNum = 141361188;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetColo";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mcolorpanelfondoloadingindicatorcanvasmensaje /*int*/ ,0,(int) (0),__c.DipToCurrent((int) (5)));
 };
RDebugUtils.currentLine=141361190;
 //BA.debugLineNum = 141361190;BA.debugLine="Dim PnlLeft As Double=Min(mBaseLoadingIndicator.L";
_pnlleft = __c.Min(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__c.Min(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()))-__c.DipToCurrent((int) (5));
RDebugUtils.currentLine=141361191;
 //BA.debugLineNum = 141361191;BA.debugLine="Dim PnlTop As Double=Min(mBaseLoadingIndicator.To";
_pnltop = __c.Min(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__c.Min(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()))-__c.DipToCurrent((int) (5));
RDebugUtils.currentLine=141361192;
 //BA.debugLineNum = 141361192;BA.debugLine="Dim PnlWidth As Double=Max(mBaseLoadingIndicator.";
_pnlwidth = __c.Max(__ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__c.Max(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()))+__c.DipToCurrent((int) (10));
RDebugUtils.currentLine=141361193;
 //BA.debugLineNum = 141361193;BA.debugLine="Dim PnlHeight As Double=mBaseLoadingIndicator.Hei";
_pnlheight = __ref._mbaseloadingindicator /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()+__c.DipToCurrent((int) (15));
RDebugUtils.currentLine=141361194;
 //BA.debugLineNum = 141361194;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SetLayou";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_pnlleft,_pnltop,_pnlwidth,_pnlheight);
RDebugUtils.currentLine=141361195;
 //BA.debugLineNum = 141361195;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.Color=mC";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._mcolorpanelfondoloadingindicatorcanvasmensaje /*int*/ );
RDebugUtils.currentLine=141361197;
 //BA.debugLineNum = 141361197;BA.debugLine="mPanelFondoLoadingIndicatorCanvasMensaje.SendToBa";
__ref._mpanelfondoloadingindicatorcanvasmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SendToBack();
RDebugUtils.currentLine=141361198;
 //BA.debugLineNum = 141361198;BA.debugLine="End Sub";
return "";
}
public double  _mediralturatextomultilinea(b4j.docU.jamloadingindicator __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fuente,double _ancho,String _texto) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "mediralturatextomultilinea", true))
	 {return ((Double) Debug.delegate(ba, "mediralturatextomultilinea", new Object[] {_fuente,_ancho,_texto}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=142737408;
 //BA.debugLineNum = 142737408;BA.debugLine="Sub MedirAlturaTextoMultilinea (Fuente As B4XFont,";
RDebugUtils.currentLine=142737409;
 //BA.debugLineNum = 142737409;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=142737410;
 //BA.debugLineNum = 142737410;BA.debugLine="Return jo.RunMethod(\"MeasureMultilineTextHeight\",";
if (true) return (double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_fuente.getObject()),(Object)(_texto),(Object)(_ancho)})));
RDebugUtils.currentLine=142737411;
 //BA.debugLineNum = 142737411;BA.debugLine="End Sub";
return 0;
}
public String  _background_mouseclicked(b4j.docU.jamloadingindicator __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "background_mouseclicked", true))
	 {return ((String) Debug.delegate(ba, "background_mouseclicked", new Object[] {_eventdata}));}
RDebugUtils.currentLine=141885440;
 //BA.debugLineNum = 141885440;BA.debugLine="Private Sub Background_MouseClicked (EventData As";
RDebugUtils.currentLine=141885441;
 //BA.debugLineNum = 141885441;BA.debugLine="EventData.Consume";
_eventdata.Consume();
RDebugUtils.currentLine=141885442;
 //BA.debugLineNum = 141885442;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
RDebugUtils.currentLine=139919360;
 //BA.debugLineNum = 139919360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=139919362;
 //BA.debugLineNum = 139919362;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=139919363;
 //BA.debugLineNum = 139919363;BA.debugLine="Private mParent As B4XView";
_mparent = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=139919364;
 //BA.debugLineNum = 139919364;BA.debugLine="Private mBaseLoadingIndicator As B4XView";
_mbaseloadingindicator = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=139919366;
 //BA.debugLineNum = 139919366;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=139919367;
 //BA.debugLineNum = 139919367;BA.debugLine="Private index As Int";
_index = 0;
RDebugUtils.currentLine=139919368;
 //BA.debugLineNum = 139919368;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=139919369;
 //BA.debugLineNum = 139919369;BA.debugLine="Private mAnchoLoadingIndicator As Int";
_mancholoadingindicator = 0;
RDebugUtils.currentLine=139919371;
 //BA.debugLineNum = 139919371;BA.debugLine="Private mDrawingSubName As String";
_mdrawingsubname = "";
RDebugUtils.currentLine=139919373;
 //BA.debugLineNum = 139919373;BA.debugLine="Private Background As B4XView  ' panel para imped";
_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=139919374;
 //BA.debugLineNum = 139919374;BA.debugLine="Private mColorPanelFondo As Int";
_mcolorpanelfondo = 0;
RDebugUtils.currentLine=139919375;
 //BA.debugLineNum = 139919375;BA.debugLine="Private mEstilo As String";
_mestilo = "";
RDebugUtils.currentLine=139919376;
 //BA.debugLineNum = 139919376;BA.debugLine="Private mColorIndicator As Int";
_mcolorindicator = 0;
RDebugUtils.currentLine=139919377;
 //BA.debugLineNum = 139919377;BA.debugLine="Private mDuracionCiclo As Int";
_mduracionciclo = 0;
RDebugUtils.currentLine=139919379;
 //BA.debugLineNum = 139919379;BA.debugLine="Public mPanelFondoLoadingIndicatorCanvasMensaje A";
_mpanelfondoloadingindicatorcanvasmensaje = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=139919380;
 //BA.debugLineNum = 139919380;BA.debugLine="Public mColorPanelFondoLoadingIndicatorCanvasMens";
_mcolorpanelfondoloadingindicatorcanvasmensaje = 0;
RDebugUtils.currentLine=139919381;
 //BA.debugLineNum = 139919381;BA.debugLine="Public mLabelMensaje As B4XView";
_mlabelmensaje = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=139919382;
 //BA.debugLineNum = 139919382;BA.debugLine="Private mMensajeLoading As Object";
_mmensajeloading = new Object();
RDebugUtils.currentLine=139919383;
 //BA.debugLineNum = 139919383;BA.debugLine="Private mTamanoFuenteMensaje As Float";
_mtamanofuentemensaje = 0f;
RDebugUtils.currentLine=139919384;
 //BA.debugLineNum = 139919384;BA.debugLine="Private mColorFondoLabelMensaje As Int";
_mcolorfondolabelmensaje = 0;
RDebugUtils.currentLine=139919385;
 //BA.debugLineNum = 139919385;BA.debugLine="Private mColorMensaje As Int";
_mcolormensaje = 0;
RDebugUtils.currentLine=139919386;
 //BA.debugLineNum = 139919386;BA.debugLine="Private mAnchoLabelMensaje As Int";
_mancholabelmensaje = 0;
RDebugUtils.currentLine=139919387;
 //BA.debugLineNum = 139919387;BA.debugLine="Private mAlineacionHorizontalMensaje As String";
_malineacionhorizontalmensaje = "";
RDebugUtils.currentLine=139919389;
 //BA.debugLineNum = 139919389;BA.debugLine="Private mLabelControlTiempoProceso As B4XView";
_mlabelcontroltiempoproceso = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=139919391;
 //BA.debugLineNum = 139919391;BA.debugLine="Private mlstEstilos As List";
_mlstestilos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=139919394;
 //BA.debugLineNum = 139919394;BA.debugLine="Private mMostrarTiempoProceso As Boolean";
_mmostrartiempoproceso = false;
RDebugUtils.currentLine=139919395;
 //BA.debugLineNum = 139919395;BA.debugLine="Private TicksInicioControlTiempoProceso As Long";
_ticksiniciocontroltiempoproceso = 0L;
RDebugUtils.currentLine=139919396;
 //BA.debugLineNum = 139919396;BA.debugLine="Private TimerControlTiempoProceso As Timer";
_timercontroltiempoproceso = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=139919397;
 //BA.debugLineNum = 139919397;BA.debugLine="Private mIntervaloTimerControlTiempoProceso As In";
_mintervalotimercontroltiempoproceso = 0;
RDebugUtils.currentLine=139919398;
 //BA.debugLineNum = 139919398;BA.debugLine="Private mTextoControlTiempoProceso As String";
_mtextocontroltiempoproceso = "";
RDebugUtils.currentLine=139919400;
 //BA.debugLineNum = 139919400;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
_jamloadingindicatorestilo_threecircles1 = "Three Circles 1";
RDebugUtils.currentLine=139919401;
 //BA.debugLineNum = 139919401;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
_jamloadingindicatorestilo_threecircles1b = "Three Circles 1b";
RDebugUtils.currentLine=139919402;
 //BA.debugLineNum = 139919402;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
_jamloadingindicatorestilo_threecircles2 = "Three Circles 2";
RDebugUtils.currentLine=139919403;
 //BA.debugLineNum = 139919403;BA.debugLine="Public Const JamLoadingIndicatorEstilo_ThreeCircl";
_jamloadingindicatorestilo_threecircles3 = "Three Circles 3";
RDebugUtils.currentLine=139919404;
 //BA.debugLineNum = 139919404;BA.debugLine="Public Const JamLoadingIndicatorEstilo_SingleCirc";
_jamloadingindicatorestilo_singlecircle = "Single Circle";
RDebugUtils.currentLine=139919405;
 //BA.debugLineNum = 139919405;BA.debugLine="Public Const JamLoadingIndicatorEstilo_FiveLines1";
_jamloadingindicatorestilo_fivelines1 = "Five Lines 1";
RDebugUtils.currentLine=139919406;
 //BA.debugLineNum = 139919406;BA.debugLine="Public Const JamLoadingIndicatorEstilo_TenLines A";
_jamloadingindicatorestilo_tenlines = "TenLines";
RDebugUtils.currentLine=139919407;
 //BA.debugLineNum = 139919407;BA.debugLine="Public Const JamLoadingIndicatorEstilo_Arc1 As St";
_jamloadingindicatorestilo_arc1 = "Arc 1";
RDebugUtils.currentLine=139919408;
 //BA.debugLineNum = 139919408;BA.debugLine="Public Const JamLoadingIndicatorEstilo_Arc2 As St";
_jamloadingindicatorestilo_arc2 = "Arc 2";
RDebugUtils.currentLine=139919409;
 //BA.debugLineNum = 139919409;BA.debugLine="Public Const JamLoadingIndicatorEstilo_PacMan As";
_jamloadingindicatorestilo_pacman = "PacMan";
RDebugUtils.currentLine=139919413;
 //BA.debugLineNum = 139919413;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc1(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_arc1", true))
	 {return ((String) Debug.delegate(ba, "draw_arc1", new Object[] {_progress}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
RDebugUtils.currentLine=142278656;
 //BA.debugLineNum = 142278656;BA.debugLine="Private Sub Draw_Arc1 (Progress As Float)";
RDebugUtils.currentLine=142278657;
 //BA.debugLineNum = 142278657;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=142278658;
 //BA.debugLineNum = 142278658;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=142278659;
 //BA.debugLineNum = 142278659;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
RDebugUtils.currentLine=142278660;
 //BA.debugLineNum = 142278660;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
RDebugUtils.currentLine=142278662;
 //BA.debugLineNum = 142278662;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (-(1-_progress)*2*360));
 };
RDebugUtils.currentLine=142278664;
 //BA.debugLineNum = 142278664;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=142278665;
 //BA.debugLineNum = 142278665;BA.debugLine="cvs.DrawRect(cvs.TargetRect, mColorIndicator, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._mcolorindicator /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=142278666;
 //BA.debugLineNum = 142278666;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=142278667;
 //BA.debugLineNum = 142278667;BA.debugLine="End Sub";
return "";
}
public String  _draw_arc2(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_arc2", true))
	 {return ((String) Debug.delegate(ba, "draw_arc2", new Object[] {_progress}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
float _r = 0f;
RDebugUtils.currentLine=142344192;
 //BA.debugLineNum = 142344192;BA.debugLine="Private Sub Draw_Arc2 (Progress As Float)";
RDebugUtils.currentLine=142344193;
 //BA.debugLineNum = 142344193;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=142344194;
 //BA.debugLineNum = 142344194;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=142344195;
 //BA.debugLineNum = 142344195;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
RDebugUtils.currentLine=142344196;
 //BA.debugLineNum = 142344196;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (_progress*2*360));
 }else {
RDebugUtils.currentLine=142344198;
 //BA.debugLineNum = 142344198;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
_p.InitializeArc(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,(float) (-90),(float) (360-(_progress-0.5)*2*360));
 };
RDebugUtils.currentLine=142344200;
 //BA.debugLineNum = 142344200;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=142344201;
 //BA.debugLineNum = 142344201;BA.debugLine="cvs.DrawRect(cvs.TargetRect, mColorIndicator, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._mcolorindicator /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=142344202;
 //BA.debugLineNum = 142344202;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
RDebugUtils.currentLine=142344203;
 //BA.debugLineNum = 142344203;BA.debugLine="End Sub";
return "";
}
public String  _draw_fivelines1(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_fivelines1", true))
	 {return ((String) Debug.delegate(ba, "draw_fivelines1", new Object[] {_progress}));}
int _minr = 0;
int _maxr = 0;
int _dx = 0;
int _i = 0;
float _r = 0f;
RDebugUtils.currentLine=142213120;
 //BA.debugLineNum = 142213120;BA.debugLine="Private Sub Draw_FiveLines1(Progress As Float)";
RDebugUtils.currentLine=142213121;
 //BA.debugLineNum = 142213121;BA.debugLine="Dim MinR As Int = 10dip";
_minr = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=142213122;
 //BA.debugLineNum = 142213122;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Height / 2";
_maxr = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)2);
RDebugUtils.currentLine=142213123;
 //BA.debugLineNum = 142213123;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
_dx = (int) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()-__c.DipToCurrent((int) (2)))/(double)5);
RDebugUtils.currentLine=142213124;
 //BA.debugLineNum = 142213124;BA.debugLine="For i = 0 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=142213125;
 //BA.debugLineNum = 142213125;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-30*_i));
RDebugUtils.currentLine=142213126;
 //BA.debugLineNum = 142213126;BA.debugLine="cvs.DrawLine(2dip + i * dx, cvs.TargetRect.Cente";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r),(float) (__c.DipToCurrent((int) (2))+_i*_dx),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r),__ref._mcolorindicator /*int*/ ,(float) (__c.DipToCurrent((int) (4))));
 }
};
RDebugUtils.currentLine=142213128;
 //BA.debugLineNum = 142213128;BA.debugLine="End Sub";
return "";
}
public String  _draw_pacman(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_pacman", true))
	 {return ((String) Debug.delegate(ba, "draw_pacman", new Object[] {_progress}));}
int _dotr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _angle = 0;
int _cx = 0;
int _cy = 0;
int _r = 0;
RDebugUtils.currentLine=142409728;
 //BA.debugLineNum = 142409728;BA.debugLine="Private Sub Draw_PacMan(Progress As Float)";
RDebugUtils.currentLine=142409729;
 //BA.debugLineNum = 142409729;BA.debugLine="Dim DotR As Int = 5dip";
_dotr = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=142409730;
 //BA.debugLineNum = 142409730;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.Width - DotR - Prog";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()-_dotr-_progress*(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (10)))),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_dotr),__ref._setalpha /*int*/ (null,__ref._mcolorindicator /*int*/ ,(int) (255-200*_progress)),__c.True,(float) (0));
RDebugUtils.currentLine=142409731;
 //BA.debugLineNum = 142409731;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=142409732;
 //BA.debugLineNum = 142409732;BA.debugLine="Dim angle As Int = 70 * SinD(Progress * 180)";
_angle = (int) (70*__c.SinD(_progress*180));
RDebugUtils.currentLine=142409733;
 //BA.debugLineNum = 142409733;BA.debugLine="Dim cx As Int = cvs.TargetRect.CenterX - 5dip";
_cx = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=142409734;
 //BA.debugLineNum = 142409734;BA.debugLine="Dim cy As Int = cvs.TargetRect.CenterY";
_cy = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY());
RDebugUtils.currentLine=142409735;
 //BA.debugLineNum = 142409735;BA.debugLine="Dim r As Int = cvs.TargetRect.CenterY - 5dip";
_r = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=142409736;
 //BA.debugLineNum = 142409736;BA.debugLine="If angle = 0 Then";
if (_angle==0) { 
RDebugUtils.currentLine=142409737;
 //BA.debugLineNum = 142409737;BA.debugLine="cvs.DrawCircle(cx, cy, r, mColorIndicator, True,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_cx),(float) (_cy),(float) (_r),__ref._mcolorindicator /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=142409739;
 //BA.debugLineNum = 142409739;BA.debugLine="p.InitializeArc(cx, cy , r, -angle / 2, -(360-an";
_p.InitializeArc((float) (_cx),(float) (_cy),(float) (_r),(float) (-_angle/(double)2),(float) (-(360-_angle)));
RDebugUtils.currentLine=142409740;
 //BA.debugLineNum = 142409740;BA.debugLine="cvs.ClipPath(p)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClipPath(_p);
RDebugUtils.currentLine=142409741;
 //BA.debugLineNum = 142409741;BA.debugLine="cvs.DrawRect(cvs.TargetRect, mColorIndicator, Tr";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect(),__ref._mcolorindicator /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=142409742;
 //BA.debugLineNum = 142409742;BA.debugLine="cvs.RemoveClip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .RemoveClip();
 };
RDebugUtils.currentLine=142409745;
 //BA.debugLineNum = 142409745;BA.debugLine="End Sub";
return "";
}
public int  _setalpha(b4j.docU.jamloadingindicator __ref,int _c,int _alpha) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setalpha", true))
	 {return ((Integer) Debug.delegate(ba, "setalpha", new Object[] {_c,_alpha}));}
RDebugUtils.currentLine=142147584;
 //BA.debugLineNum = 142147584;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
RDebugUtils.currentLine=142147585;
 //BA.debugLineNum = 142147585;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
if (true) return (int) (__c.Bit.And(((int)0xffffff),_c)+__c.Bit.ShiftLeft(_alpha,(int) (24)));
RDebugUtils.currentLine=142147586;
 //BA.debugLineNum = 142147586;BA.debugLine="End Sub";
return 0;
}
public String  _draw_singlecircle(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_singlecircle", true))
	 {return ((String) Debug.delegate(ba, "draw_singlecircle", new Object[] {_progress}));}
int _i = 0;
RDebugUtils.currentLine=142082048;
 //BA.debugLineNum = 142082048;BA.debugLine="Private Sub Draw_SingleCircle(Progress As Float)";
RDebugUtils.currentLine=142082049;
 //BA.debugLineNum = 142082049;BA.debugLine="For i = 0 To 2";
{
final int step1 = 1;
final int limit1 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=142082050;
 //BA.debugLineNum = 142082050;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Targe";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()*_progress),__ref._setalpha /*int*/ (null,__ref._mcolorindicator /*int*/ ,(int) (255-255*_progress)),__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=142082052;
 //BA.debugLineNum = 142082052;BA.debugLine="End Sub";
return "";
}
public String  _draw_tenlines(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_tenlines", true))
	 {return ((String) Debug.delegate(ba, "draw_tenlines", new Object[] {_progress}));}
float _r = 0f;
boolean _b = false;
int _spess = 0;
int _i = 0;
float _alpha = 0f;
RDebugUtils.currentLine=142606336;
 //BA.debugLineNum = 142606336;BA.debugLine="Private Sub Draw_TenLines (Progress As Float)";
RDebugUtils.currentLine=142606337;
 //BA.debugLineNum = 142606337;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
_r = (float) (__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2);
RDebugUtils.currentLine=142606338;
 //BA.debugLineNum = 142606338;BA.debugLine="Dim B As Boolean = False";
_b = __c.False;
RDebugUtils.currentLine=142606339;
 //BA.debugLineNum = 142606339;BA.debugLine="Dim Spess As Int = 5dip";
_spess = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=142606341;
 //BA.debugLineNum = 142606341;BA.debugLine="For i=0 To 9";
{
final int step4 = 1;
final int limit4 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=142606343;
 //BA.debugLineNum = 142606343;BA.debugLine="Dim Alpha As Float = i*36";
_alpha = (float) (_i*36);
RDebugUtils.currentLine=142606345;
 //BA.debugLineNum = 142606345;BA.debugLine="If Alpha>Progress*360 And B=False Then";
if (_alpha>_progress*360 && _b==__c.False) { 
RDebugUtils.currentLine=142606346;
 //BA.debugLineNum = 142606346;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * CosD(";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.CosD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.SinD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r/(double)2)*__c.CosD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r/(double)2)*__c.SinD((_i-1)*36)),__c.Bit.And(__ref._mcolorindicator /*int*/ ,((int)0xaaffffff)),(float) (_spess));
RDebugUtils.currentLine=142606347;
 //BA.debugLineNum = 142606347;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * CosD(";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.CosD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r/(double)2)*__c.CosD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r/(double)2)*__c.SinD(_alpha)),__ref._mcolorindicator /*int*/ ,(float) (_spess));
RDebugUtils.currentLine=142606348;
 //BA.debugLineNum = 142606348;BA.debugLine="B=True";
_b = __c.True;
 }else {
RDebugUtils.currentLine=142606350;
 //BA.debugLineNum = 142606350;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX + r * CosD(";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.CosD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+(_r/(double)2)*__c.CosD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+(_r/(double)2)*__c.SinD(_alpha)),__c.Bit.And(__ref._mcolorindicator /*int*/ ,((int)0x55ffffff)),(float) (_spess));
 };
 }
};
RDebugUtils.currentLine=142606354;
 //BA.debugLineNum = 142606354;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles1(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles1", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles1", new Object[] {_progress}));}
float _maxr = 0f;
float _r = 0f;
int _i = 0;
int _alpha = 0;
RDebugUtils.currentLine=141950976;
 //BA.debugLineNum = 141950976;BA.debugLine="Private Sub Draw_ThreeCircles1 (Progress As Float)";
RDebugUtils.currentLine=141950977;
 //BA.debugLineNum = 141950977;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
_maxr = (float) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2-__c.DipToCurrent((int) (20)))/(double)2);
RDebugUtils.currentLine=141950978;
 //BA.debugLineNum = 141950978;BA.debugLine="Dim r As Float = 10dip + MaxR + MaxR * Sin(Progre";
_r = (float) (__c.DipToCurrent((int) (10))+_maxr+_maxr*__c.Sin(_progress*2*__c.cPI));
RDebugUtils.currentLine=141950979;
 //BA.debugLineNum = 141950979;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=141950980;
 //BA.debugLineNum = 141950980;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
_alpha = (int) (_i*120+_progress*360);
RDebugUtils.currentLine=141950981;
 //BA.debugLineNum = 141950981;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__ref._mcolorindicator /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=141950983;
 //BA.debugLineNum = 141950983;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles1b(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles1b", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles1b", new Object[] {_progress}));}
float _maxr = 0f;
float _r = 0f;
int _i = 0;
int _alpha = 0;
RDebugUtils.currentLine=142475264;
 //BA.debugLineNum = 142475264;BA.debugLine="Private Sub Draw_ThreeCircles1b (Progress As Float";
RDebugUtils.currentLine=142475265;
 //BA.debugLineNum = 142475265;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
_maxr = (float) ((__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2-__c.DipToCurrent((int) (20)))/(double)2);
RDebugUtils.currentLine=142475266;
 //BA.debugLineNum = 142475266;BA.debugLine="Dim r As Float = 15dip + MaxR + MaxR * Sin(Progre";
_r = (float) (__c.DipToCurrent((int) (15))+_maxr+_maxr*__c.Sin(_progress*1*__c.cPI));
RDebugUtils.currentLine=142475267;
 //BA.debugLineNum = 142475267;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=142475268;
 //BA.debugLineNum = 142475268;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
_alpha = (int) (_i*120+_progress*360);
RDebugUtils.currentLine=142475269;
 //BA.debugLineNum = 142475269;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__ref._mcolorindicator /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
 }
};
RDebugUtils.currentLine=142475271;
 //BA.debugLineNum = 142475271;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (__c.DipToCurrent((int) (7))),__ref._mcolorindicator /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=142475272;
 //BA.debugLineNum = 142475272;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX,cvs.TargetR";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,__ref._mcolorindicator /*int*/ ,__c.False,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=142475273;
 //BA.debugLineNum = 142475273;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles2(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles2", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles2", new Object[] {_progress}));}
int _minr = 0;
int _maxr = 0;
int _i = 0;
float _r = 0f;
RDebugUtils.currentLine=142016512;
 //BA.debugLineNum = 142016512;BA.debugLine="Private Sub Draw_ThreeCircles2 (Progress As Float)";
RDebugUtils.currentLine=142016513;
 //BA.debugLineNum = 142016513;BA.debugLine="Dim MinR As Int = 5dip";
_minr = __c.DipToCurrent((int) (5));
RDebugUtils.currentLine=142016514;
 //BA.debugLineNum = 142016514;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Width / 2 / 3 -";
_maxr = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)2/(double)3-_minr-__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=142016515;
 //BA.debugLineNum = 142016515;BA.debugLine="For i = 0 To 2";
{
final int step3 = 1;
final int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=142016516;
 //BA.debugLineNum = 142016516;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*__c.SinD(_progress*360-60*_i));
RDebugUtils.currentLine=142016517;
 //BA.debugLineNum = 142016517;BA.debugLine="cvs.DrawCircle(MaxR + MinR + (MinR + MaxR + 2dip";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_maxr+_minr+(_minr+_maxr+__c.DipToCurrent((int) (2)))*2*_i),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),_r,__ref._mcolorindicator /*int*/ ,__c.True,(float) (0));
 }
};
RDebugUtils.currentLine=142016519;
 //BA.debugLineNum = 142016519;BA.debugLine="End Sub";
return "";
}
public String  _draw_threecircles3(b4j.docU.jamloadingindicator __ref,float _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "draw_threecircles3", true))
	 {return ((String) Debug.delegate(ba, "draw_threecircles3", new Object[] {_progress}));}
float _r = 0f;
boolean _b = false;
int _i = 0;
float _alpha = 0f;
RDebugUtils.currentLine=142540800;
 //BA.debugLineNum = 142540800;BA.debugLine="Private Sub Draw_ThreeCircles3 (Progress As Float)";
RDebugUtils.currentLine=142540801;
 //BA.debugLineNum = 142540801;BA.debugLine="Dim r As Float = Min(cvs.TargetRect.Width,cvs.Tar";
_r = (float) (__c.Min(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight())/(double)2-__c.DipToCurrent((int) (7)));
RDebugUtils.currentLine=142540802;
 //BA.debugLineNum = 142540802;BA.debugLine="Dim B As Boolean = False";
_b = __c.False;
RDebugUtils.currentLine=142540804;
 //BA.debugLineNum = 142540804;BA.debugLine="For i=0 To 9";
{
final int step3 = 1;
final int limit3 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=142540806;
 //BA.debugLineNum = 142540806;BA.debugLine="Dim Alpha As Float = i*36";
_alpha = (float) (_i*36);
RDebugUtils.currentLine=142540808;
 //BA.debugLineNum = 142540808;BA.debugLine="If Alpha>Progress*360 And B=False Then";
if (_alpha>_progress*360 && _b==__c.False) { 
RDebugUtils.currentLine=142540809;
 //BA.debugLineNum = 142540809;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD((_i-1)*36)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD((_i-1)*36)),(float) (__c.DipToCurrent((int) (7))),__c.Bit.And(__ref._mcolorindicator /*int*/ ,((int)0xaaffffff)),__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=142540810;
 //BA.debugLineNum = 142540810;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__ref._mcolorindicator /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=142540811;
 //BA.debugLineNum = 142540811;BA.debugLine="B=True";
_b = __c.True;
 }else {
RDebugUtils.currentLine=142540813;
 //BA.debugLineNum = 142540813;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * Sin";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX()+_r*__c.SinD(_alpha)),(float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()+_r*__c.CosD(_alpha)),(float) (__c.DipToCurrent((int) (7))),__c.Bit.And(__ref._mcolorindicator /*int*/ ,((int)0x55ffffff)),__c.True,(float) (__c.DipToCurrent((int) (1))));
 };
 }
};
RDebugUtils.currentLine=142540817;
 //BA.debugLineNum = 142540817;BA.debugLine="End Sub";
return "";
}
public double  _getancholabelmensaje(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "getancholabelmensaje", true))
	 {return ((Double) Debug.delegate(ba, "getancholabelmensaje", null));}
RDebugUtils.currentLine=140443648;
 //BA.debugLineNum = 140443648;BA.debugLine="Public Sub getAnchoLabelMensaje As Double";
RDebugUtils.currentLine=140443649;
 //BA.debugLineNum = 140443649;BA.debugLine="Return mAnchoLabelMensaje";
if (true) return __ref._mancholabelmensaje /*int*/ ;
RDebugUtils.currentLine=140443650;
 //BA.debugLineNum = 140443650;BA.debugLine="End Sub";
return 0;
}
public double  _getancholoadingindicator(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "getancholoadingindicator", true))
	 {return ((Double) Debug.delegate(ba, "getancholoadingindicator", null));}
RDebugUtils.currentLine=140312576;
 //BA.debugLineNum = 140312576;BA.debugLine="Public Sub getAnchoLoadingIndicator As Double";
RDebugUtils.currentLine=140312577;
 //BA.debugLineNum = 140312577;BA.debugLine="Return mAnchoLoadingIndicator";
if (true) return __ref._mancholoadingindicator /*int*/ ;
RDebugUtils.currentLine=140312578;
 //BA.debugLineNum = 140312578;BA.debugLine="End Sub";
return 0;
}
public int  _getcolorpanelfondo(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "getcolorpanelfondo", true))
	 {return ((Integer) Debug.delegate(ba, "getcolorpanelfondo", null));}
RDebugUtils.currentLine=140050432;
 //BA.debugLineNum = 140050432;BA.debugLine="Public Sub getColorPanelFondo As Int";
RDebugUtils.currentLine=140050433;
 //BA.debugLineNum = 140050433;BA.debugLine="Return mColorPanelFondo";
if (true) return __ref._mcolorpanelfondo /*int*/ ;
RDebugUtils.currentLine=140050434;
 //BA.debugLineNum = 140050434;BA.debugLine="End Sub";
return 0;
}
public int  _getcolorpanelfondoloadingindicatorcanvasmensaje(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "getcolorpanelfondoloadingindicatorcanvasmensaje", true))
	 {return ((Integer) Debug.delegate(ba, "getcolorpanelfondoloadingindicatorcanvasmensaje", null));}
RDebugUtils.currentLine=140181504;
 //BA.debugLineNum = 140181504;BA.debugLine="Public Sub getColorPanelFondoLoadingIndicatorCanva";
RDebugUtils.currentLine=140181505;
 //BA.debugLineNum = 140181505;BA.debugLine="Return mColorPanelFondoLoadingIndicatorCanvasMens";
if (true) return __ref._mcolorpanelfondoloadingindicatorcanvasmensaje /*int*/ ;
RDebugUtils.currentLine=140181506;
 //BA.debugLineNum = 140181506;BA.debugLine="End Sub";
return 0;
}
public boolean  _getcontroltiempoprocesoactivado(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "getcontroltiempoprocesoactivado", true))
	 {return ((Boolean) Debug.delegate(ba, "getcontroltiempoprocesoactivado", null));}
RDebugUtils.currentLine=140705792;
 //BA.debugLineNum = 140705792;BA.debugLine="public Sub getControlTiempoProcesoActivado As Bool";
RDebugUtils.currentLine=140705793;
 //BA.debugLineNum = 140705793;BA.debugLine="Return TimerControlTiempoProceso.Enabled";
if (true) return __ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .getEnabled();
RDebugUtils.currentLine=140705794;
 //BA.debugLineNum = 140705794;BA.debugLine="End Sub";
return false;
}
public boolean  _getisshowing(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "getisshowing", true))
	 {return ((Boolean) Debug.delegate(ba, "getisshowing", null));}
RDebugUtils.currentLine=141623296;
 //BA.debugLineNum = 141623296;BA.debugLine="Public Sub getIsShowing As Boolean";
RDebugUtils.currentLine=141623297;
 //BA.debugLineNum = 141623297;BA.debugLine="If Background.IsInitialized Then";
if (__ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=141623298;
 //BA.debugLineNum = 141623298;BA.debugLine="Return Background.Visible";
if (true) return __ref._background /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible();
 }else {
RDebugUtils.currentLine=141623300;
 //BA.debugLineNum = 141623300;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=141623302;
 //BA.debugLineNum = 141623302;BA.debugLine="End Sub";
return false;
}
public String  _reiniciartiempoiniciocontroltiempoproceso(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "reiniciartiempoiniciocontroltiempoproceso", true))
	 {return ((String) Debug.delegate(ba, "reiniciartiempoiniciocontroltiempoproceso", null));}
RDebugUtils.currentLine=140836864;
 //BA.debugLineNum = 140836864;BA.debugLine="Public Sub ReiniciarTiempoInicioControlTiempoProce";
RDebugUtils.currentLine=140836865;
 //BA.debugLineNum = 140836865;BA.debugLine="TicksInicioControlTiempoProceso=DateTime.Now";
__ref._ticksiniciocontroltiempoproceso /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=140836866;
 //BA.debugLineNum = 140836866;BA.debugLine="End Sub";
return "";
}
public void  _mainloop(b4j.docU.jamloadingindicator __ref) throws Exception{
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "mainloop", true))
	 {Debug.delegate(ba, "mainloop", null); return;}
ResumableSub_MainLoop rsub = new ResumableSub_MainLoop(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_MainLoop extends BA.ResumableSub {
public ResumableSub_MainLoop(b4j.docU.jamloadingindicator parent,b4j.docU.jamloadingindicator __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.jamloadingindicator __ref;
b4j.docU.jamloadingindicator parent;
int _myindex = 0;
long _n = 0L;
float _progress = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamloadingindicator";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=141688833;
 //BA.debugLineNum = 141688833;BA.debugLine="index = index + 1";
__ref._index /*int*/  = (int) (__ref._index /*int*/ +1);
RDebugUtils.currentLine=141688834;
 //BA.debugLineNum = 141688834;BA.debugLine="Dim MyIndex As Int = index";
_myindex = __ref._index /*int*/ ;
RDebugUtils.currentLine=141688835;
 //BA.debugLineNum = 141688835;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=141688836;
 //BA.debugLineNum = 141688836;BA.debugLine="Do While MyIndex = index";
if (true) break;

case 1:
//do while
this.state = 4;
while (_myindex==__ref._index /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=141688837;
 //BA.debugLineNum = 141688837;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / mDu";
_progress = (float) ((parent.__c.DateTime.getNow()-_n)/(double)__ref._mduracionciclo /*int*/ );
RDebugUtils.currentLine=141688838;
 //BA.debugLineNum = 141688838;BA.debugLine="progress = progress - Floor(progress)";
_progress = (float) (_progress-parent.__c.Floor(_progress));
RDebugUtils.currentLine=141688839;
 //BA.debugLineNum = 141688839;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=141688840;
 //BA.debugLineNum = 141688840;BA.debugLine="CallSub2(Me, mDrawingSubName, progress)";
parent.__c.CallSubDebug2(ba,parent,__ref._mdrawingsubname /*String*/ ,(Object)(_progress));
RDebugUtils.currentLine=141688841;
 //BA.debugLineNum = 141688841;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=141688842;
 //BA.debugLineNum = 141688842;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamloadingindicator", "mainloop"),(int) (10));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=141688844;
 //BA.debugLineNum = 141688844;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setalineacionhorizontalmensaje(b4j.docU.jamloadingindicator __ref,String _alineacionhorizontalmensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setalineacionhorizontalmensaje", true))
	 {return ((String) Debug.delegate(ba, "setalineacionhorizontalmensaje", new Object[] {_alineacionhorizontalmensaje}));}
anywheresoftware.b4j.objects.LabelWrapper _lblmensaje = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=141295616;
 //BA.debugLineNum = 141295616;BA.debugLine="Public Sub setAlineacionHorizontalMensaje(Alineaci";
RDebugUtils.currentLine=141295618;
 //BA.debugLineNum = 141295618;BA.debugLine="Dim lblMensaje As Label=mLabelMensaje";
_lblmensaje = new anywheresoftware.b4j.objects.LabelWrapper();
_lblmensaje = (anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(__ref._mlabelmensaje /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=141295619;
 //BA.debugLineNum = 141295619;BA.debugLine="mAlineacionHorizontalMensaje=AlineacionHorizontal";
__ref._malineacionhorizontalmensaje /*String*/  = _alineacionhorizontalmensaje;
RDebugUtils.currentLine=141295620;
 //BA.debugLineNum = 141295620;BA.debugLine="Dim jo As JavaObject = lblMensaje";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lblmensaje.getObject()));
RDebugUtils.currentLine=141295621;
 //BA.debugLineNum = 141295621;BA.debugLine="jo.RunMethod(\"setTextAlignment\", Array(mAlineacio";
_jo.RunMethod("setTextAlignment",new Object[]{(Object)(__ref._malineacionhorizontalmensaje /*String*/ )});
RDebugUtils.currentLine=141295622;
 //BA.debugLineNum = 141295622;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=141295623;
 //BA.debugLineNum = 141295623;BA.debugLine="End Sub";
return "";
}
public String  _setancholabelmensaje(b4j.docU.jamloadingindicator __ref,double _ancholabelmensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setancholabelmensaje", true))
	 {return ((String) Debug.delegate(ba, "setancholabelmensaje", new Object[] {_ancholabelmensaje}));}
RDebugUtils.currentLine=140509184;
 //BA.debugLineNum = 140509184;BA.debugLine="Public Sub setAnchoLabelMensaje(AnchoLabelMensaje";
RDebugUtils.currentLine=140509185;
 //BA.debugLineNum = 140509185;BA.debugLine="mAnchoLabelMensaje=AnchoLabelMensaje";
__ref._mancholabelmensaje /*int*/  = (int) (_ancholabelmensaje);
RDebugUtils.currentLine=140509186;
 //BA.debugLineNum = 140509186;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=140509187;
 //BA.debugLineNum = 140509187;BA.debugLine="End Sub";
return "";
}
public String  _setancholoadingindicator(b4j.docU.jamloadingindicator __ref,double _ancholoadingindicator) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setancholoadingindicator", true))
	 {return ((String) Debug.delegate(ba, "setancholoadingindicator", new Object[] {_ancholoadingindicator}));}
RDebugUtils.currentLine=140378112;
 //BA.debugLineNum = 140378112;BA.debugLine="Public Sub setAnchoLoadingIndicator(AnchoLoadingIn";
RDebugUtils.currentLine=140378113;
 //BA.debugLineNum = 140378113;BA.debugLine="mAnchoLoadingIndicator=AnchoLoadingIndicator";
__ref._mancholoadingindicator /*int*/  = (int) (_ancholoadingindicator);
RDebugUtils.currentLine=140378114;
 //BA.debugLineNum = 140378114;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=140378115;
 //BA.debugLineNum = 140378115;BA.debugLine="End Sub";
return "";
}
public String  _setcolorfondolabelmensaje(b4j.docU.jamloadingindicator __ref,int _colorfondolabelmensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setcolorfondolabelmensaje", true))
	 {return ((String) Debug.delegate(ba, "setcolorfondolabelmensaje", new Object[] {_colorfondolabelmensaje}));}
RDebugUtils.currentLine=141099008;
 //BA.debugLineNum = 141099008;BA.debugLine="Public Sub setColorFondoLabelMensaje(ColorFondoLab";
RDebugUtils.currentLine=141099010;
 //BA.debugLineNum = 141099010;BA.debugLine="mColorFondoLabelMensaje=ColorFondoLabelMensaje";
__ref._mcolorfondolabelmensaje /*int*/  = _colorfondolabelmensaje;
RDebugUtils.currentLine=141099011;
 //BA.debugLineNum = 141099011;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=141099012;
 //BA.debugLineNum = 141099012;BA.debugLine="End Sub";
return "";
}
public String  _setcolorpanelfondoloadingindicatorcanvasmensaje(b4j.docU.jamloadingindicator __ref,int _colorpanelfondoloadingindicatorcanvasmensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setcolorpanelfondoloadingindicatorcanvasmensaje", true))
	 {return ((String) Debug.delegate(ba, "setcolorpanelfondoloadingindicatorcanvasmensaje", new Object[] {_colorpanelfondoloadingindicatorcanvasmensaje}));}
RDebugUtils.currentLine=140247040;
 //BA.debugLineNum = 140247040;BA.debugLine="Public Sub setColorPanelFondoLoadingIndicatorCanva";
RDebugUtils.currentLine=140247041;
 //BA.debugLineNum = 140247041;BA.debugLine="mColorPanelFondoLoadingIndicatorCanvasMensaje=Col";
__ref._mcolorpanelfondoloadingindicatorcanvasmensaje /*int*/  = _colorpanelfondoloadingindicatorcanvasmensaje;
RDebugUtils.currentLine=140247042;
 //BA.debugLineNum = 140247042;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=140247043;
 //BA.debugLineNum = 140247043;BA.debugLine="End Sub";
return "";
}
public String  _setintervalomediciontiempoproceso(b4j.docU.jamloadingindicator __ref,int _intervalomediciontiempoproceso) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setintervalomediciontiempoproceso", true))
	 {return ((String) Debug.delegate(ba, "setintervalomediciontiempoproceso", new Object[] {_intervalomediciontiempoproceso}));}
RDebugUtils.currentLine=140902400;
 //BA.debugLineNum = 140902400;BA.debugLine="Public Sub setIntervaloMedicionTiempoProceso(Inter";
RDebugUtils.currentLine=140902401;
 //BA.debugLineNum = 140902401;BA.debugLine="mIntervaloTimerControlTiempoProceso=IntervaloMedi";
__ref._mintervalotimercontroltiempoproceso /*int*/  = _intervalomediciontiempoproceso;
RDebugUtils.currentLine=140902402;
 //BA.debugLineNum = 140902402;BA.debugLine="If IntervaloMedicionTiempoProceso>0 Then";
if (_intervalomediciontiempoproceso>0) { 
RDebugUtils.currentLine=140902403;
 //BA.debugLineNum = 140902403;BA.debugLine="If TimerControlTiempoProceso.IsInitialized Then";
if (__ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .IsInitialized()) { 
RDebugUtils.currentLine=140902404;
 //BA.debugLineNum = 140902404;BA.debugLine="TimerControlTiempoProceso.Interval=mIntervaloTi";
__ref._timercontroltiempoproceso /*anywheresoftware.b4a.objects.Timer*/ .setInterval((long) (__ref._mintervalotimercontroltiempoproceso /*int*/ ));
 };
 };
RDebugUtils.currentLine=140902407;
 //BA.debugLineNum = 140902407;BA.debugLine="End Sub";
return "";
}
public String  _setmostrartiempoproceso(b4j.docU.jamloadingindicator __ref,boolean _mostrartiempoproceso) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "setmostrartiempoproceso", true))
	 {return ((String) Debug.delegate(ba, "setmostrartiempoproceso", new Object[] {_mostrartiempoproceso}));}
RDebugUtils.currentLine=140771328;
 //BA.debugLineNum = 140771328;BA.debugLine="Public Sub setMostrarTiempoProceso(MostrarTiempoPr";
RDebugUtils.currentLine=140771329;
 //BA.debugLineNum = 140771329;BA.debugLine="mMostrarTiempoProceso=MostrarTiempoProceso";
__ref._mmostrartiempoproceso /*boolean*/  = _mostrartiempoproceso;
RDebugUtils.currentLine=140771330;
 //BA.debugLineNum = 140771330;BA.debugLine="End Sub";
return "";
}
public String  _settamanofuentemensaje(b4j.docU.jamloadingindicator __ref,float _tamanofuentemensaje) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "settamanofuentemensaje", true))
	 {return ((String) Debug.delegate(ba, "settamanofuentemensaje", new Object[] {_tamanofuentemensaje}));}
RDebugUtils.currentLine=141164544;
 //BA.debugLineNum = 141164544;BA.debugLine="Public Sub setTamanoFuenteMensaje(TamanoFuenteMens";
RDebugUtils.currentLine=141164546;
 //BA.debugLineNum = 141164546;BA.debugLine="mTamanoFuenteMensaje=TamanoFuenteMensaje";
__ref._mtamanofuentemensaje /*float*/  = _tamanofuentemensaje;
RDebugUtils.currentLine=141164547;
 //BA.debugLineNum = 141164547;BA.debugLine="ActualizarMensajeLoading";
__ref._actualizarmensajeloading /*String*/ (null);
RDebugUtils.currentLine=141164548;
 //BA.debugLineNum = 141164548;BA.debugLine="End Sub";
return "";
}
public String  _settextocontroltiempoproceso(b4j.docU.jamloadingindicator __ref,String _textocontroltiempoproceso) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "settextocontroltiempoproceso", true))
	 {return ((String) Debug.delegate(ba, "settextocontroltiempoproceso", new Object[] {_textocontroltiempoproceso}));}
RDebugUtils.currentLine=140967936;
 //BA.debugLineNum = 140967936;BA.debugLine="Public Sub setTextoControlTiempoProceso(TextoContr";
RDebugUtils.currentLine=140967937;
 //BA.debugLineNum = 140967937;BA.debugLine="mTextoControlTiempoProceso=TextoControlTiempoProc";
__ref._mtextocontroltiempoproceso /*String*/  = _textocontroltiempoproceso;
RDebugUtils.currentLine=140967938;
 //BA.debugLineNum = 140967938;BA.debugLine="End Sub";
return "";
}
public String  _timercontroltiempoproceso_tick(b4j.docU.jamloadingindicator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamloadingindicator";
if (Debug.shouldDelegate(ba, "timercontroltiempoproceso_tick", true))
	 {return ((String) Debug.delegate(ba, "timercontroltiempoproceso_tick", null));}
String _timeformatant = "";
RDebugUtils.currentLine=142671872;
 //BA.debugLineNum = 142671872;BA.debugLine="Sub TimerControlTiempoProceso_Tick";
RDebugUtils.currentLine=142671873;
 //BA.debugLineNum = 142671873;BA.debugLine="If mMostrarTiempoProceso Then";
if (__ref._mmostrartiempoproceso /*boolean*/ ) { 
RDebugUtils.currentLine=142671880;
 //BA.debugLineNum = 142671880;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
_timeformatant = __c.DateTime.getTimeFormat();
RDebugUtils.currentLine=142671881;
 //BA.debugLineNum = 142671881;BA.debugLine="DateTime.Timeformat=\"mm:ss\"";
__c.DateTime.setTimeFormat("mm:ss");
RDebugUtils.currentLine=142671882;
 //BA.debugLineNum = 142671882;BA.debugLine="mLabelControlTiempoProceso.Text=$\"$Time{DateTime";
__ref._mlabelcontroltiempoproceso /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText((""+__c.SmartStringFormatter("time",(Object)(__c.DateTime.getNow()-__ref._ticksiniciocontroltiempoproceso /*long*/ ))+""));
RDebugUtils.currentLine=142671883;
 //BA.debugLineNum = 142671883;BA.debugLine="DateTime.Timeformat=TimeFormatAnt";
__c.DateTime.setTimeFormat(_timeformatant);
 };
RDebugUtils.currentLine=142671891;
 //BA.debugLineNum = 142671891;BA.debugLine="End Sub";
return "";
}
public double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
  Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
  Font.class, String.class, double.class, TextBoundsType.class);
  m.setAccessible(true);
  return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
  }
}