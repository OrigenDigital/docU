package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class textflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.textflow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.textflow.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _texts = null;
public anywheresoftware.b4j.object.JavaObject _lastitem = null;
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
public b4j.docU.textflow  _addtext(b4j.docU.textflow __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "addtext", false))
	 {return ((b4j.docU.textflow) Debug.delegate(ba, "addtext", new Object[] {_text}));}
RDebugUtils.currentLine=109379584;
 //BA.debugLineNum = 109379584;BA.debugLine="Public Sub AddText(text As String) As TextFlow";
RDebugUtils.currentLine=109379585;
 //BA.debugLineNum = 109379585;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=109379586;
 //BA.debugLineNum = 109379586;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=109379587;
 //BA.debugLineNum = 109379587;BA.debugLine="texts.Add(lastItem)";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .getObject()));
RDebugUtils.currentLine=109379588;
 //BA.debugLineNum = 109379588;BA.debugLine="Return Me";
if (true) return (b4j.docU.textflow)(this);
RDebugUtils.currentLine=109379589;
 //BA.debugLineNum = 109379589;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.textflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
RDebugUtils.currentLine=109248512;
 //BA.debugLineNum = 109248512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=109248513;
 //BA.debugLineNum = 109248513;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=109248514;
 //BA.debugLineNum = 109248514;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=109248515;
 //BA.debugLineNum = 109248515;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=109248516;
 //BA.debugLineNum = 109248516;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow(b4j.docU.textflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "createtextflow", false))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "createtextflow", null));}
anywheresoftware.b4j.object.JavaObject _tf = null;
RDebugUtils.currentLine=109707264;
 //BA.debugLineNum = 109707264;BA.debugLine="Public Sub CreateTextFlow As Pane";
RDebugUtils.currentLine=109707265;
 //BA.debugLineNum = 109707265;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=109707266;
 //BA.debugLineNum = 109707266;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
RDebugUtils.currentLine=109707267;
 //BA.debugLineNum = 109707267;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=109707268;
 //BA.debugLineNum = 109707268;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
RDebugUtils.currentLine=109707269;
 //BA.debugLineNum = 109707269;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.textflow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=109314048;
 //BA.debugLineNum = 109314048;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=109314049;
 //BA.debugLineNum = 109314049;BA.debugLine="texts.Initialize";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=109314050;
 //BA.debugLineNum = 109314050;BA.debugLine="End Sub";
return "";
}
public b4j.docU.textflow  _setcolor(b4j.docU.textflow __ref,anywheresoftware.b4j.objects.JFX.PaintWrapper _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setcolor", false))
	 {return ((b4j.docU.textflow) Debug.delegate(ba, "setcolor", new Object[] {_color}));}
RDebugUtils.currentLine=109510656;
 //BA.debugLineNum = 109510656;BA.debugLine="Public Sub SetColor(Color As Paint) As TextFlow";
RDebugUtils.currentLine=109510657;
 //BA.debugLineNum = 109510657;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(Color))";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFill",new Object[]{(Object)(_color.getObject())});
RDebugUtils.currentLine=109510658;
 //BA.debugLineNum = 109510658;BA.debugLine="Return Me";
if (true) return (b4j.docU.textflow)(this);
RDebugUtils.currentLine=109510659;
 //BA.debugLineNum = 109510659;BA.debugLine="End Sub";
return null;
}
public b4j.docU.textflow  _setfont(b4j.docU.textflow __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setfont", false))
	 {return ((b4j.docU.textflow) Debug.delegate(ba, "setfont", new Object[] {_font}));}
RDebugUtils.currentLine=109445120;
 //BA.debugLineNum = 109445120;BA.debugLine="Public Sub SetFont(Font As Font) As TextFlow";
RDebugUtils.currentLine=109445121;
 //BA.debugLineNum = 109445121;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
RDebugUtils.currentLine=109445122;
 //BA.debugLineNum = 109445122;BA.debugLine="Return Me";
if (true) return (b4j.docU.textflow)(this);
RDebugUtils.currentLine=109445123;
 //BA.debugLineNum = 109445123;BA.debugLine="End Sub";
return null;
}
public b4j.docU.textflow  _setstrikethrough(b4j.docU.textflow __ref,boolean _strikethrough) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setstrikethrough", false))
	 {return ((b4j.docU.textflow) Debug.delegate(ba, "setstrikethrough", new Object[] {_strikethrough}));}
RDebugUtils.currentLine=109641728;
 //BA.debugLineNum = 109641728;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
RDebugUtils.currentLine=109641729;
 //BA.debugLineNum = 109641729;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
RDebugUtils.currentLine=109641730;
 //BA.debugLineNum = 109641730;BA.debugLine="Return Me";
if (true) return (b4j.docU.textflow)(this);
RDebugUtils.currentLine=109641731;
 //BA.debugLineNum = 109641731;BA.debugLine="End Sub";
return null;
}
public b4j.docU.textflow  _setunderline(b4j.docU.textflow __ref,boolean _underline) throws Exception{
__ref = this;
RDebugUtils.currentModule="textflow";
if (Debug.shouldDelegate(ba, "setunderline", false))
	 {return ((b4j.docU.textflow) Debug.delegate(ba, "setunderline", new Object[] {_underline}));}
RDebugUtils.currentLine=109576192;
 //BA.debugLineNum = 109576192;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As T";
RDebugUtils.currentLine=109576193;
 //BA.debugLineNum = 109576193;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setUnderline",new Object[]{(Object)(_underline)});
RDebugUtils.currentLine=109576194;
 //BA.debugLineNum = 109576194;BA.debugLine="Return Me";
if (true) return (b4j.docU.textflow)(this);
RDebugUtils.currentLine=109576195;
 //BA.debugLineNum = 109576195;BA.debugLine="End Sub";
return null;
}
}