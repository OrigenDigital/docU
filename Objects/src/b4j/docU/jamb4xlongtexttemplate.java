package b4j.docU;

import anywheresoftware.b4a.debug.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javafx.scene.text.Font;
import javafx.scene.text.TextBoundsType;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jamb4xlongtexttemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamb4xlongtexttemplate", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jamb4xlongtexttemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public b4j.example.customlistview _customlistview1 = null;
public Object _text = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _textfont = null;
public float _textsize = 0f;
public int _textcolor = 0;
public int _textbackgroundcolor = 0;
public int _clvbackgroundcolor = 0;
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
public String  _addtextitem(b4j.docU.jamb4xlongtexttemplate __ref,Object _texto,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "addtextitem", true))
	 {return ((String) Debug.delegate(ba, "addtextitem", new Object[] {_texto,_value}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
b4j.example.customlistview._clvitem _item = null;
RDebugUtils.currentLine=143196160;
 //BA.debugLineNum = 143196160;BA.debugLine="Public Sub AddTextItem(Texto As Object, Value As O";
RDebugUtils.currentLine=143196170;
 //BA.debugLineNum = 143196170;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._createpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=143196171;
 //BA.debugLineNum = 143196171;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,BA.ObjectToString(__ref._text /*Object*/ ));
RDebugUtils.currentLine=143196172;
 //BA.debugLineNum = 143196172;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
_lbl.setHeight(__c.Max(__c.DipToCurrent((int) (50)),_lbl.getHeight()));
RDebugUtils.currentLine=143196174;
 //BA.debugLineNum = 143196174;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, CustomListView1.sv.S";
_pnl.AddView((javafx.scene.Node)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (2)),__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewContentWidth()-__c.DipToCurrent((int) (10)),_lbl.getHeight());
RDebugUtils.currentLine=143196178;
 //BA.debugLineNum = 143196178;BA.debugLine="If xui.IsB4i = False Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()==__c.False) { 
RDebugUtils.currentLine=143196179;
 //BA.debugLineNum = 143196179;BA.debugLine="lbl.TextColor = TextColor";
_lbl.setTextColor(__ref._textcolor /*int*/ );
 };
RDebugUtils.currentLine=143196181;
 //BA.debugLineNum = 143196181;BA.debugLine="pnl.Color = TextBackgroundColor";
_pnl.setColor(__ref._textbackgroundcolor /*int*/ );
RDebugUtils.currentLine=143196182;
 //BA.debugLineNum = 143196182;BA.debugLine="pnl.Height = lbl.Height + 2dip";
_pnl.setHeight(_lbl.getHeight()+__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=143196183;
 //BA.debugLineNum = 143196183;BA.debugLine="CustomListView1.InsertAt(0, pnl, Value)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._insertat((int) (0),_pnl,_value);
RDebugUtils.currentLine=143196184;
 //BA.debugLineNum = 143196184;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawListI";
_item = __ref._customlistview1 /*b4j.example.customlistview*/ ._getrawlistitem((int) (0));
RDebugUtils.currentLine=143196185;
 //BA.debugLineNum = 143196185;BA.debugLine="item.TextItem = True";
_item.TextItem = __c.True;
RDebugUtils.currentLine=143196186;
 //BA.debugLineNum = 143196186;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createpanel(b4j.docU.jamb4xlongtexttemplate __ref,String _paneleventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "createpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createpanel", new Object[] {_paneleventname}));}
RDebugUtils.currentLine=143261696;
 //BA.debugLineNum = 143261696;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
RDebugUtils.currentLine=143261697;
 //BA.debugLineNum = 143261697;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_paneleventname);
RDebugUtils.currentLine=143261698;
 //BA.debugLineNum = 143261698;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4j.docU.jamb4xlongtexttemplate __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_txt}));}
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xlbl = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
double _width = 0;
RDebugUtils.currentLine=143327232;
 //BA.debugLineNum = 143327232;BA.debugLine="Private Sub CreateLabel(txt As String) As B4XView";
RDebugUtils.currentLine=143327233;
 //BA.debugLineNum = 143327233;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=143327234;
 //BA.debugLineNum = 143327234;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
RDebugUtils.currentLine=143327239;
 //BA.debugLineNum = 143327239;BA.debugLine="Dim B4Xlbl As B4XView=lbl";
_b4xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_b4xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=143327241;
 //BA.debugLineNum = 143327241;BA.debugLine="B4Xlbl.Font = TextFont";
_b4xlbl.setFont(__ref._textfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=143327242;
 //BA.debugLineNum = 143327242;BA.debugLine="B4Xlbl.TextSize=TextSize";
_b4xlbl.setTextSize(__ref._textsize /*float*/ );
RDebugUtils.currentLine=143327243;
 //BA.debugLineNum = 143327243;BA.debugLine="B4Xlbl.TextColor=TextColor";
_b4xlbl.setTextColor(__ref._textcolor /*int*/ );
RDebugUtils.currentLine=143327244;
 //BA.debugLineNum = 143327244;BA.debugLine="B4Xlbl.Color=TextBackgroundColor";
_b4xlbl.setColor(__ref._textbackgroundcolor /*int*/ );
RDebugUtils.currentLine=143327245;
 //BA.debugLineNum = 143327245;BA.debugLine="B4Xlbl.SetTextAlignment(\"TOP\",\"LEFT\")";
_b4xlbl.SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=143327246;
 //BA.debugLineNum = 143327246;BA.debugLine="lbl.WrapText = True";
_lbl.setWrapText(__c.True);
RDebugUtils.currentLine=143327247;
 //BA.debugLineNum = 143327247;BA.debugLine="lbl.Text = txt";
_lbl.setText(_txt);
RDebugUtils.currentLine=143327248;
 //BA.debugLineNum = 143327248;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=143327249;
 //BA.debugLineNum = 143327249;BA.debugLine="Dim width As Double = CustomListView1.sv.ScrollVi";
_width = __ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getScrollViewContentWidth()-10;
RDebugUtils.currentLine=143327250;
 //BA.debugLineNum = 143327250;BA.debugLine="lbl.PrefHeight = 10dip + Round(jo.RunMethod(\"Meas";
_lbl.setPrefHeight(__c.DipToCurrent((int) (10))+__c.Round((double)(BA.ObjectToNumber(_jo.RunMethod("MeasureMultilineTextHeight",new Object[]{(Object)(_lbl.getFont().getObject()),(Object)(_txt),(Object)(_width)})))));
RDebugUtils.currentLine=143327251;
 //BA.debugLineNum = 143327251;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=143327252;
 //BA.debugLineNum = 143327252;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.jamb4xlongtexttemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
RDebugUtils.currentLine=142802944;
 //BA.debugLineNum = 142802944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=142802945;
 //BA.debugLineNum = 142802945;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=142802946;
 //BA.debugLineNum = 142802946;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=142802947;
 //BA.debugLineNum = 142802947;BA.debugLine="Public CustomListView1 As CustomListView";
_customlistview1 = new b4j.example.customlistview();
RDebugUtils.currentLine=142802948;
 //BA.debugLineNum = 142802948;BA.debugLine="Public Text As Object";
_text = new Object();
RDebugUtils.currentLine=142802949;
 //BA.debugLineNum = 142802949;BA.debugLine="Public TextFont As B4XFont";
_textfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=142802950;
 //BA.debugLineNum = 142802950;BA.debugLine="Public TextSize As Float";
_textsize = 0f;
RDebugUtils.currentLine=142802951;
 //BA.debugLineNum = 142802951;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=142802952;
 //BA.debugLineNum = 142802952;BA.debugLine="Public TextBackgroundColor As Int";
_textbackgroundcolor = 0;
RDebugUtils.currentLine=142802953;
 //BA.debugLineNum = 142802953;BA.debugLine="Public CLVBackgroundColor As Int";
_clvbackgroundcolor = 0;
RDebugUtils.currentLine=142802955;
 //BA.debugLineNum = 142802955;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4j.docU.jamb4xlongtexttemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=143130624;
 //BA.debugLineNum = 143130624;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=143130626;
 //BA.debugLineNum = 143130626;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.jamb4xlongtexttemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=142999552;
 //BA.debugLineNum = 142999552;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=142999553;
 //BA.debugLineNum = 142999553;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=142999554;
 //BA.debugLineNum = 142999554;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.jamb4xlongtexttemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _sv = null;
RDebugUtils.currentLine=142868480;
 //BA.debugLineNum = 142868480;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=142868481;
 //BA.debugLineNum = 142868481;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"mBase");
RDebugUtils.currentLine=142868482;
 //BA.debugLineNum = 142868482;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=142868483;
 //BA.debugLineNum = 142868483;BA.debugLine="mBase.LoadLayout(\"scrJamLongTextTemplate\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("scrJamLongTextTemplate",ba);
RDebugUtils.currentLine=142868484;
 //BA.debugLineNum = 142868484;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=142868485;
 //BA.debugLineNum = 142868485;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,0,(int) (0),0);
RDebugUtils.currentLine=142868486;
 //BA.debugLineNum = 142868486;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = Text";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextbackgroundcolor = __ref._textbackgroundcolor /*int*/ ;
RDebugUtils.currentLine=142868487;
 //BA.debugLineNum = 142868487;BA.debugLine="CustomListView1.DefaultTextColor = TextColor";
__ref._customlistview1 /*b4j.example.customlistview*/ ._defaulttextcolor = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=142868488;
 //BA.debugLineNum = 142868488;BA.debugLine="CustomListView1.sv.Color =TextBackgroundColor  '";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._textbackgroundcolor /*int*/ );
RDebugUtils.currentLine=142868490;
 //BA.debugLineNum = 142868490;BA.debugLine="Dim sv As Node = CustomListView1.sv";
_sv = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_sv = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.getObject()));
RDebugUtils.currentLine=142868491;
 //BA.debugLineNum = 142868491;BA.debugLine="sv.StyleClasses.Add(\"b4xdialog\")";
_sv.getStyleClasses().Add((Object)("b4xdialog"));
RDebugUtils.currentLine=142868493;
 //BA.debugLineNum = 142868493;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.docU.jamb4xlongtexttemplate __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=142934016;
 //BA.debugLineNum = 142934016;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
RDebugUtils.currentLine=142934017;
 //BA.debugLineNum = 142934017;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=142934018;
 //BA.debugLineNum = 142934018;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
__ref._customlistview1 /*b4j.example.customlistview*/ ._asview().SetLayoutAnimated((int) (0),0,0,_width,_height);
RDebugUtils.currentLine=142934019;
 //BA.debugLineNum = 142934019;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
__ref._customlistview1 /*b4j.example.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=142934020;
 //BA.debugLineNum = 142934020;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.docU.jamb4xlongtexttemplate __ref,b4j.docU.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamb4xlongtexttemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", new Object[] {_dialog}));}
RDebugUtils.currentLine=143065088;
 //BA.debugLineNum = 143065088;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
RDebugUtils.currentLine=143065089;
 //BA.debugLineNum = 143065089;BA.debugLine="CustomListView1.Clear";
__ref._customlistview1 /*b4j.example.customlistview*/ ._clear();
RDebugUtils.currentLine=143065091;
 //BA.debugLineNum = 143065091;BA.debugLine="AddTextItem(Text,\"\")";
__ref._addtextitem /*String*/ (null,__ref._text /*Object*/ ,(Object)(""));
RDebugUtils.currentLine=143065092;
 //BA.debugLineNum = 143065092;BA.debugLine="CustomListView1.sv.Color=CLVBackgroundColor";
__ref._customlistview1 /*b4j.example.customlistview*/ ._sv.setColor(__ref._clvbackgroundcolor /*int*/ );
RDebugUtils.currentLine=143065093;
 //BA.debugLineNum = 143065093;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
__ref._customlistview1 /*b4j.example.customlistview*/ ._getpanel((int) (0)).GetView((int) (0)).SetTextAlignment("TOP","LEFT");
RDebugUtils.currentLine=143065094;
 //BA.debugLineNum = 143065094;BA.debugLine="XUIViewsUtils.AddStubToCLVIfNeeded(CustomListView";
_xuiviewsutils._addstubtoclvifneeded /*String*/ (__ref._customlistview1 /*b4j.example.customlistview*/ ,__ref._textbackgroundcolor /*int*/ );
RDebugUtils.currentLine=143065095;
 //BA.debugLineNum = 143065095;BA.debugLine="End Sub";
return "";
}

public double MeasureMultilineTextHeight(Font f, String text, double width) throws Exception {
		Method m = Class.forName("com.sun.javafx.scene.control.skin.Utils").getDeclaredMethod("computeTextHeight",
				Font.class, String.class, double.class, TextBoundsType.class);
		m.setAccessible(true);
		return (Double)m.invoke(null, f, text, width, TextBoundsType.LOGICAL_VERTICAL_CENTER);
	}
}