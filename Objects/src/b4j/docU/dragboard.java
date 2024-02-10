package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dragboard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.dragboard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.dragboard.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _tjo = null;
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
public anywheresoftware.b4a.objects.collections.List  _getfiles(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getfiles", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getfiles", null));}
RDebugUtils.currentLine=118226944;
 //BA.debugLineNum = 118226944;BA.debugLine="Public Sub GetFiles As List";
RDebugUtils.currentLine=118226945;
 //BA.debugLineNum = 118226945;BA.debugLine="Return TJO.RunMethod(\"getFiles\",Null)";
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getFiles",(Object[])(__c.Null))));
RDebugUtils.currentLine=118226946;
 //BA.debugLineNum = 118226946;BA.debugLine="End Sub";
return null;
}
public boolean  _hasfiles(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasfiles", true))
	 {return ((Boolean) Debug.delegate(ba, "hasfiles", null));}
RDebugUtils.currentLine=118685696;
 //BA.debugLineNum = 118685696;BA.debugLine="Public Sub HasFiles As Boolean";
RDebugUtils.currentLine=118685697;
 //BA.debugLineNum = 118685697;BA.debugLine="Return TJO.RunMethod(\"hasFiles\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasFiles",(Object[])(__c.Null)));
RDebugUtils.currentLine=118685698;
 //BA.debugLineNum = 118685698;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4j.docU.dragboard __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=117702656;
 //BA.debugLineNum = 117702656;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=117702658;
 //BA.debugLineNum = 117702658;BA.debugLine="End Sub";
return "";
}
public String  _setobject(b4j.docU.dragboard __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setobject", true))
	 {return ((String) Debug.delegate(ba, "setobject", new Object[] {_obj}));}
RDebugUtils.currentLine=119275520;
 //BA.debugLineNum = 119275520;BA.debugLine="Public Sub SetObject(Obj As Object)";
RDebugUtils.currentLine=119275521;
 //BA.debugLineNum = 119275521;BA.debugLine="TJO = Obj";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_obj));
RDebugUtils.currentLine=119275522;
 //BA.debugLineNum = 119275522;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _setdragview(b4j.docU.dragboard __ref,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img,double _xoffset,double _yoffset) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setdragview", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "setdragview", new Object[] {_img,_xoffset,_yoffset}));}
RDebugUtils.currentLine=117768192;
 //BA.debugLineNum = 117768192;BA.debugLine="Public Sub SetDragView(Img As Image,XOffset As Dou";
RDebugUtils.currentLine=117768193;
 //BA.debugLineNum = 117768193;BA.debugLine="Return TJO.RunMethod(\"setDragView\",Array(Img,XOf";
if (true) return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDragView",new Object[]{(Object)(_img.getObject()),(Object)(_xoffset),(Object)(_yoffset)})));
RDebugUtils.currentLine=117768194;
 //BA.debugLineNum = 117768194;BA.debugLine="End Sub";
return null;
}
public String  _setcontent(b4j.docU.dragboard __ref,Object _content) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((String) Debug.delegate(ba, "setcontent", new Object[] {_content}));}
RDebugUtils.currentLine=119078912;
 //BA.debugLineNum = 119078912;BA.debugLine="Public Sub SetContent(Content As Object)";
RDebugUtils.currentLine=119078913;
 //BA.debugLineNum = 119078913;BA.debugLine="TJO.RunMethod(\"setContent\",Array(Content))";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setContent",new Object[]{_content});
RDebugUtils.currentLine=119078914;
 //BA.debugLineNum = 119078914;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
RDebugUtils.currentLine=117637120;
 //BA.debugLineNum = 117637120;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=117637122;
 //BA.debugLineNum = 117637122;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=117637124;
 //BA.debugLineNum = 117637124;BA.debugLine="End Sub";
return "";
}
public Object  _getcontent(b4j.docU.dragboard __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((Object) Debug.delegate(ba, "getcontent", new Object[] {_str}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
anywheresoftware.b4j.object.JavaObject _ldf = null;
RDebugUtils.currentLine=118161408;
 //BA.debugLineNum = 118161408;BA.debugLine="Public Sub GetContent(Str As String) As Object";
RDebugUtils.currentLine=118161409;
 //BA.debugLineNum = 118161409;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=118161410;
 //BA.debugLineNum = 118161410;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=118161411;
 //BA.debugLineNum = 118161411;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(_str)})));
RDebugUtils.currentLine=118161412;
 //BA.debugLineNum = 118161412;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{_str})});};
RDebugUtils.currentLine=118161413;
 //BA.debugLineNum = 118161413;BA.debugLine="Return TJO.RunMethod(\"getContent\",Array As Object";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getContent",new Object[]{(Object)(_ldf.getObject())});
RDebugUtils.currentLine=118161414;
 //BA.debugLineNum = 118161414;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getdragview(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getdragview", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "getdragview", null));}
RDebugUtils.currentLine=117833728;
 //BA.debugLineNum = 117833728;BA.debugLine="Public Sub GetDragView As Image";
RDebugUtils.currentLine=117833729;
 //BA.debugLineNum = 117833729;BA.debugLine="Return TJO.RunMethod(\"getDragView\",Null)";
if (true) return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragView",(Object[])(__c.Null))));
RDebugUtils.currentLine=117833730;
 //BA.debugLineNum = 117833730;BA.debugLine="End Sub";
return null;
}
public double  _getdragviewoffsetx(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getdragviewoffsetx", true))
	 {return ((Double) Debug.delegate(ba, "getdragviewoffsetx", null));}
RDebugUtils.currentLine=117899264;
 //BA.debugLineNum = 117899264;BA.debugLine="Public Sub GetDragViewOffsetX As Double";
RDebugUtils.currentLine=117899265;
 //BA.debugLineNum = 117899265;BA.debugLine="Return TJO.RunMethod(\"getDragViewOffsetX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragViewOffsetX",(Object[])(__c.Null))));
RDebugUtils.currentLine=117899266;
 //BA.debugLineNum = 117899266;BA.debugLine="End Sub";
return 0;
}
public double  _getdragviewoffsety(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getdragviewoffsety", true))
	 {return ((Double) Debug.delegate(ba, "getdragviewoffsety", null));}
RDebugUtils.currentLine=117964800;
 //BA.debugLineNum = 117964800;BA.debugLine="Public Sub GetDragViewOffsetY As Double";
RDebugUtils.currentLine=117964801;
 //BA.debugLineNum = 117964801;BA.debugLine="Return TJO.RunMethod(\"getDragViewOffsetY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragViewOffsetY",(Object[])(__c.Null))));
RDebugUtils.currentLine=117964802;
 //BA.debugLineNum = 117964802;BA.debugLine="End Sub";
return 0;
}
public String  _gethtml(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "gethtml", true))
	 {return ((String) Debug.delegate(ba, "gethtml", null));}
RDebugUtils.currentLine=118292480;
 //BA.debugLineNum = 118292480;BA.debugLine="Public Sub GetHtml As String";
RDebugUtils.currentLine=118292481;
 //BA.debugLineNum = 118292481;BA.debugLine="Return TJO.RunMethod(\"getHtml\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getHtml",(Object[])(__c.Null)));
RDebugUtils.currentLine=118292482;
 //BA.debugLineNum = 118292482;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getimage(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getimage", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "getimage", null));}
RDebugUtils.currentLine=118358016;
 //BA.debugLineNum = 118358016;BA.debugLine="Public Sub GetImage As Image";
RDebugUtils.currentLine=118358017;
 //BA.debugLineNum = 118358017;BA.debugLine="Return TJO.RunMethod(\"getImage\",Null)";
if (true) return (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getImage",(Object[])(__c.Null))));
RDebugUtils.currentLine=118358018;
 //BA.debugLineNum = 118358018;BA.debugLine="End Sub";
return null;
}
public Object  _getobject(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getobject", true))
	 {return ((Object) Debug.delegate(ba, "getobject", null));}
RDebugUtils.currentLine=119144448;
 //BA.debugLineNum = 119144448;BA.debugLine="Public Sub GetObject As Object";
RDebugUtils.currentLine=119144449;
 //BA.debugLineNum = 119144449;BA.debugLine="Return TJO";
if (true) return (Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .getObject());
RDebugUtils.currentLine=119144450;
 //BA.debugLineNum = 119144450;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getobjectjo(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getobjectjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getobjectjo", null));}
RDebugUtils.currentLine=119209984;
 //BA.debugLineNum = 119209984;BA.debugLine="Public Sub GetObjectJO As JavaObject";
RDebugUtils.currentLine=119209985;
 //BA.debugLineNum = 119209985;BA.debugLine="Return TJO";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ ;
RDebugUtils.currentLine=119209986;
 //BA.debugLineNum = 119209986;BA.debugLine="End Sub";
return null;
}
public String  _getrtf(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getrtf", true))
	 {return ((String) Debug.delegate(ba, "getrtf", null));}
RDebugUtils.currentLine=118423552;
 //BA.debugLineNum = 118423552;BA.debugLine="Public Sub GetRtf As String";
RDebugUtils.currentLine=118423553;
 //BA.debugLineNum = 118423553;BA.debugLine="Return TJO.RunMethod(\"getRtf\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getRtf",(Object[])(__c.Null)));
RDebugUtils.currentLine=118423554;
 //BA.debugLineNum = 118423554;BA.debugLine="End Sub";
return "";
}
public String  _getstring(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=118489088;
 //BA.debugLineNum = 118489088;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=118489089;
 //BA.debugLineNum = 118489089;BA.debugLine="Return TJO.RunMethod(\"getString\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getString",(Object[])(__c.Null)));
RDebugUtils.currentLine=118489090;
 //BA.debugLineNum = 118489090;BA.debugLine="End Sub";
return "";
}
public String  _geturl(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "geturl", true))
	 {return ((String) Debug.delegate(ba, "geturl", null));}
RDebugUtils.currentLine=118554624;
 //BA.debugLineNum = 118554624;BA.debugLine="Public Sub GetUrl As String";
RDebugUtils.currentLine=118554625;
 //BA.debugLineNum = 118554625;BA.debugLine="Return TJO.RunMethod(\"getUrl\",Null)";
if (true) return BA.ObjectToString(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getUrl",(Object[])(__c.Null)));
RDebugUtils.currentLine=118554626;
 //BA.debugLineNum = 118554626;BA.debugLine="End Sub";
return "";
}
public boolean  _hascontent(b4j.docU.dragboard __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hascontent", true))
	 {return ((Boolean) Debug.delegate(ba, "hascontent", new Object[] {_str}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
anywheresoftware.b4j.object.JavaObject _ldf = null;
RDebugUtils.currentLine=118620160;
 //BA.debugLineNum = 118620160;BA.debugLine="Public Sub HasContent(Str As String) As Boolean";
RDebugUtils.currentLine=118620161;
 //BA.debugLineNum = 118620161;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=118620162;
 //BA.debugLineNum = 118620162;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=118620163;
 //BA.debugLineNum = 118620163;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(_str)})));
RDebugUtils.currentLine=118620164;
 //BA.debugLineNum = 118620164;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{_str})});};
RDebugUtils.currentLine=118620165;
 //BA.debugLineNum = 118620165;BA.debugLine="Return TJO.RunMethod(\"hasContent\",Array As Obje";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasContent",new Object[]{(Object)(_ldf.getObject())}));
RDebugUtils.currentLine=118620166;
 //BA.debugLineNum = 118620166;BA.debugLine="End Sub";
return false;
}
public boolean  _hashtml(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hashtml", true))
	 {return ((Boolean) Debug.delegate(ba, "hashtml", null));}
RDebugUtils.currentLine=118751232;
 //BA.debugLineNum = 118751232;BA.debugLine="Public Sub HasHtml As Boolean";
RDebugUtils.currentLine=118751233;
 //BA.debugLineNum = 118751233;BA.debugLine="Return TJO.RunMethod(\"hasHtml\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasHtml",(Object[])(__c.Null)));
RDebugUtils.currentLine=118751234;
 //BA.debugLineNum = 118751234;BA.debugLine="End Sub";
return false;
}
public boolean  _hasimage(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasimage", true))
	 {return ((Boolean) Debug.delegate(ba, "hasimage", null));}
RDebugUtils.currentLine=118816768;
 //BA.debugLineNum = 118816768;BA.debugLine="Public Sub HasImage As Boolean";
RDebugUtils.currentLine=118816769;
 //BA.debugLineNum = 118816769;BA.debugLine="Return TJO.RunMethod(\"hasImage\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasImage",(Object[])(__c.Null)));
RDebugUtils.currentLine=118816770;
 //BA.debugLineNum = 118816770;BA.debugLine="End Sub";
return false;
}
public boolean  _hasrtf(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasrtf", true))
	 {return ((Boolean) Debug.delegate(ba, "hasrtf", null));}
RDebugUtils.currentLine=118882304;
 //BA.debugLineNum = 118882304;BA.debugLine="Public Sub HasRtf As Boolean";
RDebugUtils.currentLine=118882305;
 //BA.debugLineNum = 118882305;BA.debugLine="Return TJO.RunMethod(\"hasRtf\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasRtf",(Object[])(__c.Null)));
RDebugUtils.currentLine=118882306;
 //BA.debugLineNum = 118882306;BA.debugLine="End Sub";
return false;
}
public boolean  _hasstring(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasstring", true))
	 {return ((Boolean) Debug.delegate(ba, "hasstring", null));}
RDebugUtils.currentLine=118947840;
 //BA.debugLineNum = 118947840;BA.debugLine="Public Sub HasString As Boolean";
RDebugUtils.currentLine=118947841;
 //BA.debugLineNum = 118947841;BA.debugLine="Return TJO.RunMethod(\"hasString\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasString",(Object[])(__c.Null)));
RDebugUtils.currentLine=118947842;
 //BA.debugLineNum = 118947842;BA.debugLine="End Sub";
return false;
}
public boolean  _hasurl(b4j.docU.dragboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "hasurl", true))
	 {return ((Boolean) Debug.delegate(ba, "hasurl", null));}
RDebugUtils.currentLine=119013376;
 //BA.debugLineNum = 119013376;BA.debugLine="Public Sub HasUrl As Boolean";
RDebugUtils.currentLine=119013377;
 //BA.debugLineNum = 119013377;BA.debugLine="Return TJO.RunMethod(\"hasUrl\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("hasUrl",(Object[])(__c.Null)));
RDebugUtils.currentLine=119013378;
 //BA.debugLineNum = 119013378;BA.debugLine="End Sub";
return false;
}
public String  _setdragviewoffsetx(b4j.docU.dragboard __ref,double _offsetx) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setdragviewoffsetx", true))
	 {return ((String) Debug.delegate(ba, "setdragviewoffsetx", new Object[] {_offsetx}));}
RDebugUtils.currentLine=118030336;
 //BA.debugLineNum = 118030336;BA.debugLine="Public Sub SetDragViewOffsetX(OffsetX As Double)";
RDebugUtils.currentLine=118030337;
 //BA.debugLineNum = 118030337;BA.debugLine="TJO.RunMethod(\"setDragViewOffsetX\",Array As Obje";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDragViewOffsetX",new Object[]{(Object)(_offsetx)});
RDebugUtils.currentLine=118030338;
 //BA.debugLineNum = 118030338;BA.debugLine="End Sub";
return "";
}
public String  _setdragviewoffsety(b4j.docU.dragboard __ref,double _offsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragboard";
if (Debug.shouldDelegate(ba, "setdragviewoffsety", true))
	 {return ((String) Debug.delegate(ba, "setdragviewoffsety", new Object[] {_offsety}));}
RDebugUtils.currentLine=118095872;
 //BA.debugLineNum = 118095872;BA.debugLine="Public Sub SetDragViewOffsetY(OffsetY As Double)";
RDebugUtils.currentLine=118095873;
 //BA.debugLineNum = 118095873;BA.debugLine="TJO.RunMethod(\"setDragViewOffsetY\",Array As Obje";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDragViewOffsetY",new Object[]{(Object)(_offsety)});
RDebugUtils.currentLine=118095874;
 //BA.debugLineNum = 118095874;BA.debugLine="End Sub";
return "";
}
}