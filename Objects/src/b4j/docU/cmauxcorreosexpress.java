package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class cmauxcorreosexpress extends Object{
public static cmauxcorreosexpress mostCurrent = new cmauxcorreosexpress();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cmauxcorreosexpress", null);
		ba.loadHtSubs(cmauxcorreosexpress.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.cmauxcorreosexpress", ba);
		}
	}
    public static Class<?> getObject() {
		return cmauxcorreosexpress.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.objects.collections.List _lstcodigosincidenciascorreosexpress = null;
public static anywheresoftware.b4a.objects.collections.List _lstestadoscorreosexpress = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static String  _cargalistaestadoscorreosexpress() throws Exception{
RDebugUtils.currentModule="cmauxcorreosexpress";
if (Debug.shouldDelegate(ba, "cargalistaestadoscorreosexpress", false))
	 {return ((String) Debug.delegate(ba, "cargalistaestadoscorreosexpress", null));}
anywheresoftware.b4a.objects.StringUtils _su = null;
RDebugUtils.currentLine=94175232;
 //BA.debugLineNum = 94175232;BA.debugLine="Sub CargaListaEstadosCorreosExpress";
RDebugUtils.currentLine=94175233;
 //BA.debugLineNum = 94175233;BA.debugLine="lstEstadosCorreosExpress.Initialize";
_lstestadoscorreosexpress.Initialize();
RDebugUtils.currentLine=94175234;
 //BA.debugLineNum = 94175234;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=94175235;
 //BA.debugLineNum = 94175235;BA.debugLine="lstEstadosCorreosExpress=su.LoadCSV(File.DirAsset";
_lstestadoscorreosexpress = _su.LoadCSV(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"CodigosEstadosCorreosExpress.csv",BA.ObjectToChar(";"));
RDebugUtils.currentLine=94175236;
 //BA.debugLineNum = 94175236;BA.debugLine="End Sub";
return "";
}
public static String  _cargalistaincidenciascorreosexpress() throws Exception{
RDebugUtils.currentModule="cmauxcorreosexpress";
if (Debug.shouldDelegate(ba, "cargalistaincidenciascorreosexpress", false))
	 {return ((String) Debug.delegate(ba, "cargalistaincidenciascorreosexpress", null));}
anywheresoftware.b4a.objects.StringUtils _su = null;
RDebugUtils.currentLine=94240768;
 //BA.debugLineNum = 94240768;BA.debugLine="Sub CargaListaIncidenciasCorreosExpress";
RDebugUtils.currentLine=94240769;
 //BA.debugLineNum = 94240769;BA.debugLine="lstCodigosIncidenciasCorreosExpress.Initialize";
_lstcodigosincidenciascorreosexpress.Initialize();
RDebugUtils.currentLine=94240770;
 //BA.debugLineNum = 94240770;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=94240771;
 //BA.debugLineNum = 94240771;BA.debugLine="lstCodigosIncidenciasCorreosExpress=su.LoadCSV(Fi";
_lstcodigosincidenciascorreosexpress = _su.LoadCSV(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"CodigosIncidenciasCorreosExpress.csv",BA.ObjectToChar(";"));
RDebugUtils.currentLine=94240772;
 //BA.debugLineNum = 94240772;BA.debugLine="End Sub";
return "";
}
}