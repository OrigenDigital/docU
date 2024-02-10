package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class dragevent extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.dragevent", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.dragevent.class).invoke(this, new Object[] {null});
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
public b4j.docU.dragboard  _getdragboard(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdragboard", true))
	 {return ((b4j.docU.dragboard) Debug.delegate(ba, "getdragboard", null));}
b4j.docU.dragboard _db = null;
RDebugUtils.currentLine=119668736;
 //BA.debugLineNum = 119668736;BA.debugLine="Public Sub GetDragboard As Dragboard";
RDebugUtils.currentLine=119668737;
 //BA.debugLineNum = 119668737;BA.debugLine="Dim DB As Dragboard";
_db = new b4j.docU.dragboard();
RDebugUtils.currentLine=119668738;
 //BA.debugLineNum = 119668738;BA.debugLine="DB.Initialize";
_db._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=119668739;
 //BA.debugLineNum = 119668739;BA.debugLine="DB.SetObject(TJO.RunMethod(\"getDragboard\",Null))";
_db._setobject /*String*/ (null,__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDragboard",(Object[])(__c.Null)));
RDebugUtils.currentLine=119668740;
 //BA.debugLineNum = 119668740;BA.debugLine="Return DB";
if (true) return _db;
RDebugUtils.currentLine=119668741;
 //BA.debugLineNum = 119668741;BA.debugLine="End Sub";
return null;
}
public String  _setdropcompleted(b4j.docU.dragevent __ref,boolean _istransferdone) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "setdropcompleted", true))
	 {return ((String) Debug.delegate(ba, "setdropcompleted", new Object[] {_istransferdone}));}
RDebugUtils.currentLine=120782848;
 //BA.debugLineNum = 120782848;BA.debugLine="Public Sub SetDropCompleted(IsTransferDone As Bool";
RDebugUtils.currentLine=120782849;
 //BA.debugLineNum = 120782849;BA.debugLine="TJO.RunMethod(\"setDropCompleted\",Array As Object";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDropCompleted",new Object[]{(Object)(_istransferdone)});
RDebugUtils.currentLine=120782850;
 //BA.debugLineNum = 120782850;BA.debugLine="End Sub";
return "";
}
public String  _accepttransfermodes(b4j.docU.dragevent __ref,Object[] _modes) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "accepttransfermodes", true))
	 {return ((String) Debug.delegate(ba, "accepttransfermodes", new Object[] {_modes}));}
RDebugUtils.currentLine=119472128;
 //BA.debugLineNum = 119472128;BA.debugLine="Public Sub AcceptTransferModes(Modes() As Object)";
RDebugUtils.currentLine=119472129;
 //BA.debugLineNum = 119472129;BA.debugLine="TJO.RunMethod(\"acceptTransferModes\",Array(Modes))";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("acceptTransferModes",new Object[]{(Object)(_modes)});
RDebugUtils.currentLine=119472130;
 //BA.debugLineNum = 119472130;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.dragevent __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=119406592;
 //BA.debugLineNum = 119406592;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=119406595;
 //BA.debugLineNum = 119406595;BA.debugLine="End Sub";
return "";
}
public String  _setobject(b4j.docU.dragevent __ref,Object _obj) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "setobject", true))
	 {return ((String) Debug.delegate(ba, "setobject", new Object[] {_obj}));}
RDebugUtils.currentLine=121176064;
 //BA.debugLineNum = 121176064;BA.debugLine="Public Sub SetObject(Obj As Object)";
RDebugUtils.currentLine=121176065;
 //BA.debugLineNum = 121176065;BA.debugLine="TJO = Obj";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_obj));
RDebugUtils.currentLine=121176066;
 //BA.debugLineNum = 121176066;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
RDebugUtils.currentLine=119341056;
 //BA.debugLineNum = 119341056;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=119341058;
 //BA.debugLineNum = 119341058;BA.debugLine="Private TJO As JavaObject";
_tjo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=119341060;
 //BA.debugLineNum = 119341060;BA.debugLine="End Sub";
return "";
}
public Object  _getacceptedtransfermode(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getacceptedtransfermode", true))
	 {return ((Object) Debug.delegate(ba, "getacceptedtransfermode", null));}
RDebugUtils.currentLine=119537664;
 //BA.debugLineNum = 119537664;BA.debugLine="Public Sub GetAcceptedTransferMode As Object";
RDebugUtils.currentLine=119537665;
 //BA.debugLineNum = 119537665;BA.debugLine="Return TJO.RunMethod(\"getAcceptedTransferMode\",N";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getAcceptedTransferMode",(Object[])(__c.Null));
RDebugUtils.currentLine=119537666;
 //BA.debugLineNum = 119537666;BA.debugLine="End Sub";
return null;
}
public Object  _getacceptingobject(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getacceptingobject", true))
	 {return ((Object) Debug.delegate(ba, "getacceptingobject", null));}
RDebugUtils.currentLine=119603200;
 //BA.debugLineNum = 119603200;BA.debugLine="Public Sub GetAcceptingObject As Object";
RDebugUtils.currentLine=119603201;
 //BA.debugLineNum = 119603201;BA.debugLine="Return TJO.RunMethod(\"getAcceptingObject\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getAcceptingObject",(Object[])(__c.Null));
RDebugUtils.currentLine=119603202;
 //BA.debugLineNum = 119603202;BA.debugLine="End Sub";
return null;
}
public String[]  _getdataids(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdataids", true))
	 {return ((String[]) Debug.delegate(ba, "getdataids", null));}
anywheresoftware.b4j.object.JavaObject _reflectarray = null;
anywheresoftware.b4j.object.JavaObject _dataformat = null;
String[] _strings = null;
int _i = 0;
String[] _s = null;
String[] _strings2 = null;
String _str = "";
int _j = 0;
RDebugUtils.currentLine=120848384;
 //BA.debugLineNum = 120848384;BA.debugLine="Public Sub GetDataIds As String()";
RDebugUtils.currentLine=120848385;
 //BA.debugLineNum = 120848385;BA.debugLine="Dim ReflectArray As JavaObject";
_reflectarray = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=120848386;
 //BA.debugLineNum = 120848386;BA.debugLine="ReflectArray.InitializeStatic(\"java.lang.reflect.";
_reflectarray.InitializeStatic("java.lang.reflect.Array");
RDebugUtils.currentLine=120848387;
 //BA.debugLineNum = 120848387;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=120848388;
 //BA.debugLineNum = 120848388;BA.debugLine="DataFormat.InitializeArray(\"javafx.scene.input.Da";
_dataformat.InitializeArray("javafx.scene.input.DataFormat",(Object[])(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getDragboard",(Object[])(__c.Null)).RunMethodJO("getContentTypes",(Object[])(__c.Null)).RunMethod("toArray",(Object[])(__c.Null))));
RDebugUtils.currentLine=120848389;
 //BA.debugLineNum = 120848389;BA.debugLine="Dim Strings(ReflectArray.RunMethod(\"getLength\",Ar";
_strings = new String[(int)(BA.ObjectToNumber(_reflectarray.RunMethod("getLength",new Object[]{(Object)(_dataformat.getObject())})))];
java.util.Arrays.fill(_strings,"");
RDebugUtils.currentLine=120848390;
 //BA.debugLineNum = 120848390;BA.debugLine="For i = 0  To Strings.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_strings.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=120848391;
 //BA.debugLineNum = 120848391;BA.debugLine="Dim S(1) As String";
_s = new String[(int) (1)];
java.util.Arrays.fill(_s,"");
RDebugUtils.currentLine=120848392;
 //BA.debugLineNum = 120848392;BA.debugLine="Dim Strings2() As String = ReflectArray.RunMetho";
_strings2 = (String[])(_reflectarray.RunMethodJO("get",new Object[]{(Object)(_dataformat.getObject()),(Object)(_i)}).RunMethodJO("getIdentifiers",(Object[])(__c.Null)).RunMethod("toArray",new Object[]{(Object)(_s)}));
RDebugUtils.currentLine=120848393;
 //BA.debugLineNum = 120848393;BA.debugLine="Dim Str As String";
_str = "";
RDebugUtils.currentLine=120848394;
 //BA.debugLineNum = 120848394;BA.debugLine="For j = 0 To Strings2.Length - 1";
{
final int step10 = 1;
final int limit10 = (int) (_strings2.length-1);
_j = (int) (0) ;
for (;_j <= limit10 ;_j = _j + step10 ) {
RDebugUtils.currentLine=120848395;
 //BA.debugLineNum = 120848395;BA.debugLine="Str = Str & Strings2(j) & \",\"";
_str = _str+_strings2[_j]+",";
 }
};
RDebugUtils.currentLine=120848397;
 //BA.debugLineNum = 120848397;BA.debugLine="Str = Str.SubString2(0,Str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
RDebugUtils.currentLine=120848398;
 //BA.debugLineNum = 120848398;BA.debugLine="Strings(i) = Str";
_strings[_i] = _str;
 }
};
RDebugUtils.currentLine=120848400;
 //BA.debugLineNum = 120848400;BA.debugLine="Return Strings";
if (true) return _strings;
RDebugUtils.currentLine=120848401;
 //BA.debugLineNum = 120848401;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getdataidslist(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdataidslist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getdataidslist", null));}
RDebugUtils.currentLine=120913920;
 //BA.debugLineNum = 120913920;BA.debugLine="Public Sub GetDataIDsList As List";
RDebugUtils.currentLine=120913921;
 //BA.debugLineNum = 120913921;BA.debugLine="Return GetDataIds";
if (true) return anywheresoftware.b4a.keywords.Common.ArrayToList(__ref._getdataids /*String[]*/ (null));
RDebugUtils.currentLine=120913922;
 //BA.debugLineNum = 120913922;BA.debugLine="End Sub";
return null;
}
public Object  _getdataobjectforid(b4j.docU.dragevent __ref,String _dataid) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getdataobjectforid", true))
	 {return ((Object) Debug.delegate(ba, "getdataobjectforid", new Object[] {_dataid}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
anywheresoftware.b4j.object.JavaObject _ldf = null;
RDebugUtils.currentLine=120979456;
 //BA.debugLineNum = 120979456;BA.debugLine="Public Sub GetDataObjectForId(DataId As String) As";
RDebugUtils.currentLine=120979457;
 //BA.debugLineNum = 120979457;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=120979458;
 //BA.debugLineNum = 120979458;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input.D";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=120979459;
 //BA.debugLineNum = 120979459;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"loo";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(_dataid)})));
RDebugUtils.currentLine=120979460;
 //BA.debugLineNum = 120979460;BA.debugLine="If LDF.IsInitialized = False Then LDF.InitializeN";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{_dataid})});};
RDebugUtils.currentLine=120979461;
 //BA.debugLineNum = 120979461;BA.debugLine="Return TJO.RunMethodJO(\"getDragboard\",Null).RunMe";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getDragboard",(Object[])(__c.Null)).RunMethod("getContent",new Object[]{(Object)(_ldf.getObject())});
RDebugUtils.currentLine=120979462;
 //BA.debugLineNum = 120979462;BA.debugLine="End Sub";
return null;
}
public Object  _geteventsource(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "geteventsource", true))
	 {return ((Object) Debug.delegate(ba, "geteventsource", null));}
RDebugUtils.currentLine=119930880;
 //BA.debugLineNum = 119930880;BA.debugLine="Public Sub GetEventSource As Object";
RDebugUtils.currentLine=119930881;
 //BA.debugLineNum = 119930881;BA.debugLine="Return TJO.RunMethod(\"getSource\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSource",(Object[])(__c.Null));
RDebugUtils.currentLine=119930882;
 //BA.debugLineNum = 119930882;BA.debugLine="End Sub";
return null;
}
public Object  _geteventtarget(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "geteventtarget", true))
	 {return ((Object) Debug.delegate(ba, "geteventtarget", null));}
RDebugUtils.currentLine=119996416;
 //BA.debugLineNum = 119996416;BA.debugLine="Public Sub GetEventTarget As Object";
RDebugUtils.currentLine=119996417;
 //BA.debugLineNum = 119996417;BA.debugLine="Return TJO.RunMethod(\"getTarget\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getTarget",(Object[])(__c.Null));
RDebugUtils.currentLine=119996418;
 //BA.debugLineNum = 119996418;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _geteventtype(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "geteventtype", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "geteventtype", null));}
RDebugUtils.currentLine=119734272;
 //BA.debugLineNum = 119734272;BA.debugLine="Public Sub GetEventType As JavaObject";
RDebugUtils.currentLine=119734273;
 //BA.debugLineNum = 119734273;BA.debugLine="Return TJO.RunMethod(\"getEventType\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getEventType",(Object[])(__c.Null))));
RDebugUtils.currentLine=119734274;
 //BA.debugLineNum = 119734274;BA.debugLine="End Sub";
return null;
}
public Object  _getgesturesource(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getgesturesource", true))
	 {return ((Object) Debug.delegate(ba, "getgesturesource", null));}
RDebugUtils.currentLine=119799808;
 //BA.debugLineNum = 119799808;BA.debugLine="Public Sub GetGestureSource As Object";
RDebugUtils.currentLine=119799809;
 //BA.debugLineNum = 119799809;BA.debugLine="Return TJO.RunMethod(\"getGestureSource\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getGestureSource",(Object[])(__c.Null));
RDebugUtils.currentLine=119799810;
 //BA.debugLineNum = 119799810;BA.debugLine="End Sub";
return null;
}
public Object  _getgesturetarget(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getgesturetarget", true))
	 {return ((Object) Debug.delegate(ba, "getgesturetarget", null));}
RDebugUtils.currentLine=119865344;
 //BA.debugLineNum = 119865344;BA.debugLine="Public Sub GetGestureTarget As Object";
RDebugUtils.currentLine=119865345;
 //BA.debugLineNum = 119865345;BA.debugLine="Return TJO.RunMethod(\"getGestureTarget\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getGestureTarget",(Object[])(__c.Null));
RDebugUtils.currentLine=119865346;
 //BA.debugLineNum = 119865346;BA.debugLine="End Sub";
return null;
}
public Object  _getobject(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getobject", true))
	 {return ((Object) Debug.delegate(ba, "getobject", null));}
RDebugUtils.currentLine=121044992;
 //BA.debugLineNum = 121044992;BA.debugLine="Public Sub GetObject As Object";
RDebugUtils.currentLine=121044993;
 //BA.debugLineNum = 121044993;BA.debugLine="Return TJO";
if (true) return (Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .getObject());
RDebugUtils.currentLine=121044994;
 //BA.debugLineNum = 121044994;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getobjectjo(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getobjectjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getobjectjo", null));}
RDebugUtils.currentLine=121110528;
 //BA.debugLineNum = 121110528;BA.debugLine="Public Sub GetObjectJO As JavaObject";
RDebugUtils.currentLine=121110529;
 //BA.debugLineNum = 121110529;BA.debugLine="Return TJO";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ ;
RDebugUtils.currentLine=121110530;
 //BA.debugLineNum = 121110530;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getpickresult(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getpickresult", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "getpickresult", null));}
RDebugUtils.currentLine=120061952;
 //BA.debugLineNum = 120061952;BA.debugLine="Public Sub GetPickResult As JavaObject";
RDebugUtils.currentLine=120061953;
 //BA.debugLineNum = 120061953;BA.debugLine="Return TJO.RunMethod(\"getPickResult\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getPickResult",(Object[])(__c.Null))));
RDebugUtils.currentLine=120061954;
 //BA.debugLineNum = 120061954;BA.debugLine="End Sub";
return null;
}
public double  _getscenex(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getscenex", true))
	 {return ((Double) Debug.delegate(ba, "getscenex", null));}
RDebugUtils.currentLine=120127488;
 //BA.debugLineNum = 120127488;BA.debugLine="Public Sub GetSceneX As Double";
RDebugUtils.currentLine=120127489;
 //BA.debugLineNum = 120127489;BA.debugLine="Return TJO.RunMethod(\"getSceneX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSceneX",(Object[])(__c.Null))));
RDebugUtils.currentLine=120127490;
 //BA.debugLineNum = 120127490;BA.debugLine="End Sub";
return 0;
}
public double  _getsceney(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getsceney", true))
	 {return ((Double) Debug.delegate(ba, "getsceney", null));}
RDebugUtils.currentLine=120193024;
 //BA.debugLineNum = 120193024;BA.debugLine="Public Sub GetSceneY As Double";
RDebugUtils.currentLine=120193025;
 //BA.debugLineNum = 120193025;BA.debugLine="Return TJO.RunMethod(\"getSceneY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getSceneY",(Object[])(__c.Null))));
RDebugUtils.currentLine=120193026;
 //BA.debugLineNum = 120193026;BA.debugLine="End Sub";
return 0;
}
public double  _getscreenx(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getscreenx", true))
	 {return ((Double) Debug.delegate(ba, "getscreenx", null));}
RDebugUtils.currentLine=120258560;
 //BA.debugLineNum = 120258560;BA.debugLine="Public Sub GetScreenX As Double";
RDebugUtils.currentLine=120258561;
 //BA.debugLineNum = 120258561;BA.debugLine="Return TJO.RunMethod(\"getScreenX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getScreenX",(Object[])(__c.Null))));
RDebugUtils.currentLine=120258562;
 //BA.debugLineNum = 120258562;BA.debugLine="End Sub";
return 0;
}
public double  _getscreeny(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getscreeny", true))
	 {return ((Double) Debug.delegate(ba, "getscreeny", null));}
RDebugUtils.currentLine=120324096;
 //BA.debugLineNum = 120324096;BA.debugLine="Public Sub GetScreenY As Double";
RDebugUtils.currentLine=120324097;
 //BA.debugLineNum = 120324097;BA.debugLine="Return TJO.RunMethod(\"getScreenY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getScreenY",(Object[])(__c.Null))));
RDebugUtils.currentLine=120324098;
 //BA.debugLineNum = 120324098;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "gettag", true))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=121307136;
 //BA.debugLineNum = 121307136;BA.debugLine="Public Sub GetTag As Object";
RDebugUtils.currentLine=121307137;
 //BA.debugLineNum = 121307137;BA.debugLine="Return TJO.RunMethod(\"getUserData\",Null)";
if (true) return __ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getUserData",(Object[])(__c.Null));
RDebugUtils.currentLine=121307138;
 //BA.debugLineNum = 121307138;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _gettransfermode(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "gettransfermode", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "gettransfermode", null));}
RDebugUtils.currentLine=120389632;
 //BA.debugLineNum = 120389632;BA.debugLine="Public Sub GetTransferMode As JavaObject";
RDebugUtils.currentLine=120389633;
 //BA.debugLineNum = 120389633;BA.debugLine="Return TJO.RunMethod(\"getTransferMode\",Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getTransferMode",(Object[])(__c.Null))));
RDebugUtils.currentLine=120389634;
 //BA.debugLineNum = 120389634;BA.debugLine="End Sub";
return null;
}
public double  _getx(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getx", true))
	 {return ((Double) Debug.delegate(ba, "getx", null));}
RDebugUtils.currentLine=120455168;
 //BA.debugLineNum = 120455168;BA.debugLine="Public Sub getX As Double";
RDebugUtils.currentLine=120455169;
 //BA.debugLineNum = 120455169;BA.debugLine="Return TJO.RunMethod(\"getX\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getX",(Object[])(__c.Null))));
RDebugUtils.currentLine=120455170;
 //BA.debugLineNum = 120455170;BA.debugLine="End Sub";
return 0;
}
public double  _gety(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "gety", true))
	 {return ((Double) Debug.delegate(ba, "gety", null));}
RDebugUtils.currentLine=120520704;
 //BA.debugLineNum = 120520704;BA.debugLine="Public Sub getY As Double";
RDebugUtils.currentLine=120520705;
 //BA.debugLineNum = 120520705;BA.debugLine="Return TJO.RunMethod(\"getY\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getY",(Object[])(__c.Null))));
RDebugUtils.currentLine=120520706;
 //BA.debugLineNum = 120520706;BA.debugLine="End Sub";
return 0;
}
public double  _getz(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "getz", true))
	 {return ((Double) Debug.delegate(ba, "getz", null));}
RDebugUtils.currentLine=120586240;
 //BA.debugLineNum = 120586240;BA.debugLine="Public Sub getZ As Double";
RDebugUtils.currentLine=120586241;
 //BA.debugLineNum = 120586241;BA.debugLine="Return TJO.RunMethod(\"getZ\",Null)";
if (true) return (double)(BA.ObjectToNumber(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getZ",(Object[])(__c.Null))));
RDebugUtils.currentLine=120586242;
 //BA.debugLineNum = 120586242;BA.debugLine="End Sub";
return 0;
}
public boolean  _isaccepted(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "isaccepted", true))
	 {return ((Boolean) Debug.delegate(ba, "isaccepted", null));}
RDebugUtils.currentLine=120651776;
 //BA.debugLineNum = 120651776;BA.debugLine="Public Sub IsAccepted As Boolean";
RDebugUtils.currentLine=120651777;
 //BA.debugLineNum = 120651777;BA.debugLine="Return TJO.RunMethod(\"isAccepted\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("isAccepted",(Object[])(__c.Null)));
RDebugUtils.currentLine=120651778;
 //BA.debugLineNum = 120651778;BA.debugLine="End Sub";
return false;
}
public boolean  _isdropcompleted(b4j.docU.dragevent __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "isdropcompleted", true))
	 {return ((Boolean) Debug.delegate(ba, "isdropcompleted", null));}
RDebugUtils.currentLine=120717312;
 //BA.debugLineNum = 120717312;BA.debugLine="Public Sub IsDropCompleted As Boolean";
RDebugUtils.currentLine=120717313;
 //BA.debugLineNum = 120717313;BA.debugLine="Return TJO.RunMethod(\"isDropCompleted\",Null)";
if (true) return BA.ObjectToBoolean(__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("isDropCompleted",(Object[])(__c.Null)));
RDebugUtils.currentLine=120717314;
 //BA.debugLineNum = 120717314;BA.debugLine="End Sub";
return false;
}
public String  _settag(b4j.docU.dragevent __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="dragevent";
if (Debug.shouldDelegate(ba, "settag", true))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_tag}));}
RDebugUtils.currentLine=121241600;
 //BA.debugLineNum = 121241600;BA.debugLine="Public Sub SetTag(Tag As Object)";
RDebugUtils.currentLine=121241601;
 //BA.debugLineNum = 121241601;BA.debugLine="TJO.RunMethod(\"setUserData\",Array(Tag))";
__ref._tjo /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setUserData",new Object[]{_tag});
RDebugUtils.currentLine=121241602;
 //BA.debugLineNum = 121241602;BA.debugLine="End Sub";
return "";
}
}