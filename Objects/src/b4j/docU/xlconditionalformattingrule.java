package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlconditionalformattingrule extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xlconditionalformattingrule", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xlconditionalformattingrule.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _jrule = null;
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
public String  _class_globals(b4j.docU.xlconditionalformattingrule __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlconditionalformattingrule";
RDebugUtils.currentLine=218300416;
 //BA.debugLineNum = 218300416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=218300417;
 //BA.debugLineNum = 218300417;BA.debugLine="Public jRule As JavaObject";
_jrule = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=218300418;
 //BA.debugLineNum = 218300418;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlconditionalformattingrule  _fontstyle(b4j.docU.xlconditionalformattingrule __ref,boolean _italic,boolean _bold,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlconditionalformattingrule";
if (Debug.shouldDelegate(ba, "fontstyle", true))
	 {return ((b4j.docU.xlconditionalformattingrule) Debug.delegate(ba, "fontstyle", new Object[] {_italic,_bold,_color}));}
anywheresoftware.b4j.object.JavaObject _fontformatting = null;
RDebugUtils.currentLine=218497024;
 //BA.debugLineNum = 218497024;BA.debugLine="Public Sub FontStyle (Italic As Boolean, Bold As B";
RDebugUtils.currentLine=218497025;
 //BA.debugLineNum = 218497025;BA.debugLine="Dim FontFormatting As JavaObject = jRule.RunMetho";
_fontformatting = new anywheresoftware.b4j.object.JavaObject();
_fontformatting = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jrule /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createFontFormatting",(Object[])(__c.Null))));
RDebugUtils.currentLine=218497026;
 //BA.debugLineNum = 218497026;BA.debugLine="FontFormatting.RunMethod(\"setFontStyle\", Array(It";
_fontformatting.RunMethod("setFontStyle",new Object[]{(Object)(_italic),(Object)(_bold)});
RDebugUtils.currentLine=218497027;
 //BA.debugLineNum = 218497027;BA.debugLine="If Color > 0 Then";
if (_color>0) { 
RDebugUtils.currentLine=218497028;
 //BA.debugLineNum = 218497028;BA.debugLine="FontFormatting.RunMethod(\"setFontColorIndex\", Ar";
_fontformatting.RunMethod("setFontColorIndex",new Object[]{(Object)(_color)});
 };
RDebugUtils.currentLine=218497030;
 //BA.debugLineNum = 218497030;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlconditionalformattingrule)(this);
RDebugUtils.currentLine=218497031;
 //BA.debugLineNum = 218497031;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlconditionalformattingrule  _foregroundcolor(b4j.docU.xlconditionalformattingrule __ref,short _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlconditionalformattingrule";
if (Debug.shouldDelegate(ba, "foregroundcolor", true))
	 {return ((b4j.docU.xlconditionalformattingrule) Debug.delegate(ba, "foregroundcolor", new Object[] {_color}));}
anywheresoftware.b4j.object.JavaObject _patternformatting = null;
short _solid = (short)0;
RDebugUtils.currentLine=218431488;
 //BA.debugLineNum = 218431488;BA.debugLine="Public Sub ForegroundColor (Color As Short) As XLC";
RDebugUtils.currentLine=218431489;
 //BA.debugLineNum = 218431489;BA.debugLine="Dim patternformatting As JavaObject = jRule.RunMe";
_patternformatting = new anywheresoftware.b4j.object.JavaObject();
_patternformatting = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._jrule /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createPatternFormatting",(Object[])(__c.Null))));
RDebugUtils.currentLine=218431490;
 //BA.debugLineNum = 218431490;BA.debugLine="patternformatting.RunMethod(\"setFillBackgroundCol";
_patternformatting.RunMethod("setFillBackgroundColor",new Object[]{(Object)(_color)});
RDebugUtils.currentLine=218431491;
 //BA.debugLineNum = 218431491;BA.debugLine="Dim solid As Short = 1";
_solid = (short) (1);
RDebugUtils.currentLine=218431492;
 //BA.debugLineNum = 218431492;BA.debugLine="patternformatting.RunMethod(\"setFillPattern\", Arr";
_patternformatting.RunMethod("setFillPattern",new Object[]{(Object)(_solid)});
RDebugUtils.currentLine=218431493;
 //BA.debugLineNum = 218431493;BA.debugLine="Return Me";
if (true) return (b4j.docU.xlconditionalformattingrule)(this);
RDebugUtils.currentLine=218431494;
 //BA.debugLineNum = 218431494;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.docU.xlconditionalformattingrule __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _rule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlconditionalformattingrule";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_rule}));}
RDebugUtils.currentLine=218365952;
 //BA.debugLineNum = 218365952;BA.debugLine="Public Sub Initialize (Rule As JavaObject)";
RDebugUtils.currentLine=218365953;
 //BA.debugLineNum = 218365953;BA.debugLine="jRule = Rule";
__ref._jrule /*anywheresoftware.b4j.object.JavaObject*/  = _rule;
RDebugUtils.currentLine=218365954;
 //BA.debugLineNum = 218365954;BA.debugLine="End Sub";
return "";
}
}