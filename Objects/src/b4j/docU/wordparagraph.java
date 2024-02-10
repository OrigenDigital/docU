package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wordparagraph extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.wordparagraph", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.wordparagraph.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _xwpfparagraph = null;
public b4j.docU.worddocument _mdocument = null;
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
public String  _class_globals(b4j.docU.wordparagraph __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wordparagraph";
RDebugUtils.currentLine=217841664;
 //BA.debugLineNum = 217841664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=217841666;
 //BA.debugLineNum = 217841666;BA.debugLine="Public XWPFParagraph As JavaObject";
_xwpfparagraph = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=217841667;
 //BA.debugLineNum = 217841667;BA.debugLine="Public mDocument As WordDocument";
_mdocument = new b4j.docU.worddocument();
RDebugUtils.currentLine=217841669;
 //BA.debugLineNum = 217841669;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.wordparagraph __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _paragraph,b4j.docU.worddocument _document) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wordparagraph";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_paragraph,_document}));}
RDebugUtils.currentLine=217907200;
 //BA.debugLineNum = 217907200;BA.debugLine="Public Sub Initialize (Paragraph As JavaObject, Do";
RDebugUtils.currentLine=217907201;
 //BA.debugLineNum = 217907201;BA.debugLine="XWPFParagraph = Paragraph";
__ref._xwpfparagraph /*anywheresoftware.b4j.object.JavaObject*/  = _paragraph;
RDebugUtils.currentLine=217907202;
 //BA.debugLineNum = 217907202;BA.debugLine="mDocument = Document";
__ref._mdocument /*b4j.docU.worddocument*/  = _document;
RDebugUtils.currentLine=217907204;
 //BA.debugLineNum = 217907204;BA.debugLine="End Sub";
return "";
}
}