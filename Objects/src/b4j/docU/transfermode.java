package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class transfermode extends Object{
public static transfermode mostCurrent = new transfermode();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.transfermode", null);
		ba.loadHtSubs(transfermode.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.transfermode", ba);
		}
	}
    public static Class<?> getObject() {
		return transfermode.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.JavaObject _tjo = null;
public static Object _any = null;
public static Object _copy_or_move = null;
public static Object _copy = null;
public static Object _move = null;
public static Object _link = null;
public static boolean _initialized = false;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static String  _initialize() throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", null));}
RDebugUtils.currentLine=121438208;
 //BA.debugLineNum = 121438208;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=121438209;
 //BA.debugLineNum = 121438209;BA.debugLine="If Initialized Then Return";
if (_initialized) { 
if (true) return "";};
RDebugUtils.currentLine=121438210;
 //BA.debugLineNum = 121438210;BA.debugLine="TJO.InitializeStatic(\"javafx.scene.input.Transfer";
_tjo.InitializeStatic("javafx.scene.input.TransferMode");
RDebugUtils.currentLine=121438211;
 //BA.debugLineNum = 121438211;BA.debugLine="UpdateConstants";
_updateconstants();
RDebugUtils.currentLine=121438212;
 //BA.debugLineNum = 121438212;BA.debugLine="Initialized = True";
_initialized = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=121438213;
 //BA.debugLineNum = 121438213;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.object.JavaObject  _asjo(anywheresoftware.b4j.object.JavaObject _jo) throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "asjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_jo}));}
RDebugUtils.currentLine=121634816;
 //BA.debugLineNum = 121634816;BA.debugLine="Private Sub ASJO(JO As JavaObject) As JavaObject";
RDebugUtils.currentLine=121634817;
 //BA.debugLineNum = 121634817;BA.debugLine="Return JO";
if (true) return _jo;
RDebugUtils.currentLine=121634818;
 //BA.debugLineNum = 121634818;BA.debugLine="End Sub";
return null;
}
public static String  _updateconstants() throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "updateconstants", true))
	 {return ((String) Debug.delegate(ba, "updateconstants", null));}
anywheresoftware.b4j.object.JavaObject _arr = null;
RDebugUtils.currentLine=121503744;
 //BA.debugLineNum = 121503744;BA.debugLine="Private Sub UpdateConstants";
RDebugUtils.currentLine=121503745;
 //BA.debugLineNum = 121503745;BA.debugLine="ANY = TJO.GetField(\"ANY\")";
_any = _tjo.GetField("ANY");
RDebugUtils.currentLine=121503746;
 //BA.debugLineNum = 121503746;BA.debugLine="COPY_OR_MOVE = TJO.GetField(\"COPY_OR_MOVE\")";
_copy_or_move = _tjo.GetField("COPY_OR_MOVE");
RDebugUtils.currentLine=121503748;
 //BA.debugLineNum = 121503748;BA.debugLine="Dim Arr As JavaObject";
_arr = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=121503749;
 //BA.debugLineNum = 121503749;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
_arr.InitializeArray("javafx.scene.input.TransferMode",new Object[]{_tjo.RunMethod("valueOf",new Object[]{(Object)("COPY")})});
RDebugUtils.currentLine=121503750;
 //BA.debugLineNum = 121503750;BA.debugLine="COPY = Arr";
_copy = (Object)(_arr.getObject());
RDebugUtils.currentLine=121503751;
 //BA.debugLineNum = 121503751;BA.debugLine="Dim Arr As JavaObject";
_arr = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=121503752;
 //BA.debugLineNum = 121503752;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
_arr.InitializeArray("javafx.scene.input.TransferMode",new Object[]{_tjo.RunMethod("valueOf",new Object[]{(Object)("MOVE")})});
RDebugUtils.currentLine=121503753;
 //BA.debugLineNum = 121503753;BA.debugLine="MOVE = Arr";
_move = (Object)(_arr.getObject());
RDebugUtils.currentLine=121503754;
 //BA.debugLineNum = 121503754;BA.debugLine="Dim Arr As JavaObject";
_arr = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=121503755;
 //BA.debugLineNum = 121503755;BA.debugLine="Arr.InitializeArray(\"javafx.scene.input.TransferM";
_arr.InitializeArray("javafx.scene.input.TransferMode",new Object[]{_tjo.RunMethod("valueOf",new Object[]{(Object)("LINK")})});
RDebugUtils.currentLine=121503756;
 //BA.debugLineNum = 121503756;BA.debugLine="LINK = Arr";
_link = (Object)(_arr.getObject());
RDebugUtils.currentLine=121503757;
 //BA.debugLineNum = 121503757;BA.debugLine="End Sub";
return "";
}
public static String  _tostring(Object _mode) throws Exception{
RDebugUtils.currentModule="transfermode";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", new Object[] {_mode}));}
RDebugUtils.currentLine=121569280;
 //BA.debugLineNum = 121569280;BA.debugLine="Public Sub ToString(Mode As Object) As String";
RDebugUtils.currentLine=121569281;
 //BA.debugLineNum = 121569281;BA.debugLine="Return ASJO(Mode).RunMethod(\"toString\",Null)";
if (true) return BA.ObjectToString(_asjo((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_mode))).RunMethod("toString",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=121569282;
 //BA.debugLineNum = 121569282;BA.debugLine="End Sub";
return "";
}
}