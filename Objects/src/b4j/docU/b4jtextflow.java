package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4jtextflow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.b4jtextflow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.b4jtextflow.class).invoke(this, new Object[] {null});
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
public String  _initialize(b4j.docU.b4jtextflow __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=251985920;
 //BA.debugLineNum = 251985920;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=251985921;
 //BA.debugLineNum = 251985921;BA.debugLine="Reset";
__ref._reset /*b4j.docU.b4jtextflow*/ (null);
RDebugUtils.currentLine=251985922;
 //BA.debugLineNum = 251985922;BA.debugLine="End Sub";
return "";
}
public b4j.docU.b4jtextflow  _reset(b4j.docU.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "reset", true))
	 {return ((b4j.docU.b4jtextflow) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=252051456;
 //BA.debugLineNum = 252051456;BA.debugLine="Public Sub Reset As B4JTextFlow";
RDebugUtils.currentLine=252051457;
 //BA.debugLineNum = 252051457;BA.debugLine="texts.Initialize";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=252051458;
 //BA.debugLineNum = 252051458;BA.debugLine="Return Me";
if (true) return (b4j.docU.b4jtextflow)(this);
RDebugUtils.currentLine=252051459;
 //BA.debugLineNum = 252051459;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4jtextflow  _append(b4j.docU.b4jtextflow __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4j.docU.b4jtextflow) Debug.delegate(ba, "append", new Object[] {_text}));}
RDebugUtils.currentLine=252116992;
 //BA.debugLineNum = 252116992;BA.debugLine="Public Sub Append(text As String) As B4JTextFlow";
RDebugUtils.currentLine=252116993;
 //BA.debugLineNum = 252116993;BA.debugLine="Dim lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=252116994;
 //BA.debugLineNum = 252116994;BA.debugLine="lastItem.InitializeNewInstance(\"javafx.scene.text";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .InitializeNewInstance("javafx.scene.text.Text",new Object[]{(Object)(_text)});
RDebugUtils.currentLine=252116995;
 //BA.debugLineNum = 252116995;BA.debugLine="texts.Add(lastItem)";
__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .getObject()));
RDebugUtils.currentLine=252116996;
 //BA.debugLineNum = 252116996;BA.debugLine="Return Me";
if (true) return (b4j.docU.b4jtextflow)(this);
RDebugUtils.currentLine=252116997;
 //BA.debugLineNum = 252116997;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4jtextflow  _setcolor(b4j.docU.b4jtextflow __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.docU.b4jtextflow) Debug.delegate(ba, "setcolor", new Object[] {_color}));}
RDebugUtils.currentLine=252248064;
 //BA.debugLineNum = 252248064;BA.debugLine="Public Sub SetColor(Color As Int) As B4JTextFlow";
RDebugUtils.currentLine=252248065;
 //BA.debugLineNum = 252248065;BA.debugLine="lastItem.RunMethod(\"setFill\", Array(fx.Colors.Fro";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFill",new Object[]{(Object)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Colors.From32Bit(_color))});
RDebugUtils.currentLine=252248066;
 //BA.debugLineNum = 252248066;BA.debugLine="Return Me";
if (true) return (b4j.docU.b4jtextflow)(this);
RDebugUtils.currentLine=252248067;
 //BA.debugLineNum = 252248067;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _createtextflow(b4j.docU.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "createtextflow", true))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "createtextflow", null));}
anywheresoftware.b4j.object.JavaObject _tf = null;
RDebugUtils.currentLine=252444672;
 //BA.debugLineNum = 252444672;BA.debugLine="Public Sub CreateTextFlow As Pane";
RDebugUtils.currentLine=252444673;
 //BA.debugLineNum = 252444673;BA.debugLine="Dim tf As JavaObject";
_tf = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=252444674;
 //BA.debugLineNum = 252444674;BA.debugLine="tf.InitializeNewInstance(\"javafx.scene.text.TextF";
_tf.InitializeNewInstance("javafx.scene.text.TextFlow",(Object[])(__c.Null));
RDebugUtils.currentLine=252444675;
 //BA.debugLineNum = 252444675;BA.debugLine="tf.RunMethod(\"setTextAlignment\", Array(\"CENTER\"))";
_tf.RunMethod("setTextAlignment",new Object[]{(Object)("CENTER")});
RDebugUtils.currentLine=252444676;
 //BA.debugLineNum = 252444676;BA.debugLine="tf.RunMethodJO(\"getChildren\", Null).RunMethod(\"ad";
_tf.RunMethodJO("getChildren",(Object[])(__c.Null)).RunMethod("addAll",new Object[]{(Object)(__ref._texts /*anywheresoftware.b4a.objects.collections.List*/ .getObject())});
RDebugUtils.currentLine=252444677;
 //BA.debugLineNum = 252444677;BA.debugLine="Return tf";
if (true) return (anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper(), (javafx.scene.layout.Pane)(_tf.getObject()));
RDebugUtils.currentLine=252444678;
 //BA.debugLineNum = 252444678;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4jtextflow  _setfont(b4j.docU.b4jtextflow __ref,anywheresoftware.b4j.objects.JFX.FontWrapper _font) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setfont", true))
	 {return ((b4j.docU.b4jtextflow) Debug.delegate(ba, "setfont", new Object[] {_font}));}
RDebugUtils.currentLine=252182528;
 //BA.debugLineNum = 252182528;BA.debugLine="Public Sub SetFont(Font As Font) As B4JTextFlow";
RDebugUtils.currentLine=252182529;
 //BA.debugLineNum = 252182529;BA.debugLine="lastItem.RunMethod(\"setFont\", Array(Font))";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setFont",new Object[]{(Object)(_font.getObject())});
RDebugUtils.currentLine=252182530;
 //BA.debugLineNum = 252182530;BA.debugLine="Return Me";
if (true) return (b4j.docU.b4jtextflow)(this);
RDebugUtils.currentLine=252182531;
 //BA.debugLineNum = 252182531;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.b4jtextflow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
RDebugUtils.currentLine=251920384;
 //BA.debugLineNum = 251920384;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=251920385;
 //BA.debugLineNum = 251920385;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=251920386;
 //BA.debugLineNum = 251920386;BA.debugLine="Private texts As List";
_texts = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=251920387;
 //BA.debugLineNum = 251920387;BA.debugLine="Private lastItem As JavaObject";
_lastitem = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=251920388;
 //BA.debugLineNum = 251920388;BA.debugLine="End Sub";
return "";
}
public b4j.docU.b4jtextflow  _setstrikethrough(b4j.docU.b4jtextflow __ref,boolean _strikethrough) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setstrikethrough", true))
	 {return ((b4j.docU.b4jtextflow) Debug.delegate(ba, "setstrikethrough", new Object[] {_strikethrough}));}
RDebugUtils.currentLine=252379136;
 //BA.debugLineNum = 252379136;BA.debugLine="Public Sub SetStrikethrough(Strikethrough As Boole";
RDebugUtils.currentLine=252379137;
 //BA.debugLineNum = 252379137;BA.debugLine="lastItem.RunMethod(\"setStrikethrough\", Array(Stri";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setStrikethrough",new Object[]{(Object)(_strikethrough)});
RDebugUtils.currentLine=252379138;
 //BA.debugLineNum = 252379138;BA.debugLine="Return Me";
if (true) return (b4j.docU.b4jtextflow)(this);
RDebugUtils.currentLine=252379139;
 //BA.debugLineNum = 252379139;BA.debugLine="End Sub";
return null;
}
public b4j.docU.b4jtextflow  _setunderline(b4j.docU.b4jtextflow __ref,boolean _underline) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4jtextflow";
if (Debug.shouldDelegate(ba, "setunderline", true))
	 {return ((b4j.docU.b4jtextflow) Debug.delegate(ba, "setunderline", new Object[] {_underline}));}
RDebugUtils.currentLine=252313600;
 //BA.debugLineNum = 252313600;BA.debugLine="Public Sub SetUnderline(Underline As Boolean) As B";
RDebugUtils.currentLine=252313601;
 //BA.debugLineNum = 252313601;BA.debugLine="lastItem.RunMethod(\"setUnderline\", Array(Underlin";
__ref._lastitem /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setUnderline",new Object[]{(Object)(_underline)});
RDebugUtils.currentLine=252313602;
 //BA.debugLineNum = 252313602;BA.debugLine="Return Me";
if (true) return (b4j.docU.b4jtextflow)(this);
RDebugUtils.currentLine=252313603;
 //BA.debugLineNum = 252313603;BA.debugLine="End Sub";
return null;
}
}