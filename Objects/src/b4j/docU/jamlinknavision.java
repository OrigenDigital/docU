package b4j.docU;

import anywheresoftware.b4a.debug.*;
import com.sun.jna.platform.win32.*;

import anywheresoftware.b4a.BA;

public class jamlinknavision extends Object{
public static jamlinknavision mostCurrent = new jamlinknavision();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamlinknavision", null);
		ba.loadHtSubs(jamlinknavision.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.jamlinknavision", ba);
		}
	}
    public static Class<?> getObject() {
		return jamlinknavision.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
public static b4j.docU.cmauxtxt _cmauxtxt = null;
public static b4j.docU.jrdcquery _jrdcquery = null;
public static b4j.docU.dbutils _dbutils = null;
public static b4j.docU.transfermode _transfermode = null;
public static b4j.docU.jamrecordformbuilder _jamrecordformbuilder = null;
public static b4j.docU.b4xcollections _b4xcollections = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _abrirlinkfichanav(String _titulowindow,int _codigopaginanav,String _campoclave,String _valorregistro) throws Exception{
RDebugUtils.currentModule="jamlinknavision";
if (Debug.shouldDelegate(ba, "abrirlinkfichanav", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "abrirlinkfichanav", new Object[] {_titulowindow,_codigopaginanav,_campoclave,_valorregistro}));}
ResumableSub_AbrirLinkFichaNAV rsub = new ResumableSub_AbrirLinkFichaNAV(null,_titulowindow,_codigopaginanav,_campoclave,_valorregistro);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AbrirLinkFichaNAV extends BA.ResumableSub {
public ResumableSub_AbrirLinkFichaNAV(b4j.docU.jamlinknavision parent,String _titulowindow,int _codigopaginanav,String _campoclave,String _valorregistro) {
this.parent = parent;
this._titulowindow = _titulowindow;
this._codigopaginanav = _codigopaginanav;
this._campoclave = _campoclave;
this._valorregistro = _valorregistro;
}
b4j.docU.jamlinknavision parent;
String _titulowindow;
int _codigopaginanav;
String _campoclave;
String _valorregistro;
anywheresoftware.b4j.object.JavaObject _wu = null;
anywheresoftware.b4a.objects.collections.List _l = null;
boolean _flagok = false;
anywheresoftware.b4j.object.JavaObject _jo = null;
String _t = "";
Object _msa = null;
int _rint = 0;
String _navfilepath = "";
String _filtroregistro = "";
String _navhyperlink = "";
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
int _i = 0;
anywheresoftware.b4j.object.JavaObject _user32 = null;
anywheresoftware.b4a.BA.IterableList group6;
int index6;
int groupLen6;
int step35;
int limit35;
anywheresoftware.b4a.BA.IterableList group43;
int index43;
int groupLen43;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamlinknavision";

    while (true) {
try {

        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=139788291;
 //BA.debugLineNum = 139788291;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
anywheresoftware.b4a.keywords.Common.LogImpl("9139788291","Buscando window title "+_titulowindow,0);
RDebugUtils.currentLine=139788294;
 //BA.debugLineNum = 139788294;BA.debugLine="Dim WU As JavaObject";
_wu = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=139788295;
 //BA.debugLineNum = 139788295;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.WindowU";
_wu.InitializeStatic("com.sun.jna.platform.WindowUtils");
RDebugUtils.currentLine=139788296;
 //BA.debugLineNum = 139788296;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",Arra";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_wu.RunMethod("getAllWindows",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.False)})));
RDebugUtils.currentLine=139788297;
 //BA.debugLineNum = 139788297;BA.debugLine="Dim FlagOk As Boolean";
_flagok = false;
RDebugUtils.currentLine=139788298;
 //BA.debugLineNum = 139788298;BA.debugLine="For Each JO As JavaObject In L";
if (true) break;

case 1:
//for
this.state = 8;
_jo = new anywheresoftware.b4j.object.JavaObject();
group6 = _l;
index6 = 0;
groupLen6 = group6.getSize();
this.state = 63;
if (true) break;

case 63:
//C
this.state = 8;
if (index6 < groupLen6) {
this.state = 3;
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group6.Get(index6)));}
if (true) break;

case 64:
//C
this.state = 63;
index6++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=139788299;
 //BA.debugLineNum = 139788299;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Null)";
_t = BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=139788301;
 //BA.debugLineNum = 139788301;BA.debugLine="Log(\"window title\" & t)";
anywheresoftware.b4a.keywords.Common.LogImpl("9139788301","window title"+_t,0);
RDebugUtils.currentLine=139788305;
 //BA.debugLineNum = 139788305;BA.debugLine="If t.Contains(TituloWindow) And t.Contains(Valor";
if (true) break;

case 4:
//if
this.state = 7;
if (_t.contains(_titulowindow) && _t.contains(_valorregistro)) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=139788312;
 //BA.debugLineNum = 139788312;BA.debugLine="FlagOk=True";
_flagok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=139788313;
 //BA.debugLineNum = 139788313;BA.debugLine="Exit";
this.state = 8;
if (true) break;
 if (true) break;

case 7:
//C
this.state = 64;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=139788317;
 //BA.debugLineNum = 139788317;BA.debugLine="If FlagOk Then";

case 8:
//if
this.state = 21;
if (_flagok) { 
this.state = 10;
}if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=139788318;
 //BA.debugLineNum = 139788318;BA.debugLine="Dim msa As Object = xui.Msgbox2Async(\"Ya hay una";
_msa = parent._xui.Msgbox2Async(ba,"Ya hay una ventana abierta con el título: "+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(anywheresoftware.b4a.keywords.Common.Null)))+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF,"Aviso","Abrir Nueva","Cancelar","Abrir Actual",(javafx.scene.image.Image)(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=139788319;
 //BA.debugLineNum = 139788319;BA.debugLine="Wait For (msa) Msgbox_Result (RInt As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 65;
return;
case 65:
//C
this.state = 11;
_rint = (int) result[0];
;
RDebugUtils.currentLine=139788320;
 //BA.debugLineNum = 139788320;BA.debugLine="If RInt=xui.DialogResponse_Cancel Then Return Fa";
if (true) break;

case 11:
//if
this.state = 16;
if (_rint==parent._xui.DialogResponse_Cancel) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=139788321;
 //BA.debugLineNum = 139788321;BA.debugLine="If RInt =xui.DialogResponse_Negative Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_rint==parent._xui.DialogResponse_Negative) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=139788328;
 //BA.debugLineNum = 139788328;BA.debugLine="SetForegroundWindow(t,False)";
_setforegroundwindow(_t,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=139788329;
 //BA.debugLineNum = 139788329;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 20:
//C
this.state = 21;
;
 if (true) break;

case 21:
//C
this.state = 22;
;
RDebugUtils.currentLine=139788333;
 //BA.debugLineNum = 139788333;BA.debugLine="Dim NavFilePath As String=\"C:\\Program Files (x86)";
_navfilepath = "C:\\Program Files (x86)\\Microsoft Dynamics NAV\\90\\RoleTailored Client\\Microsoft.Dynamics.Nav.Client.exe";
RDebugUtils.currentLine=139788335;
 //BA.debugLineNum = 139788335;BA.debugLine="Dim FiltroRegistro As String=\"&$filter='\" & Campo";
_filtroregistro = "&$filter='"+_campoclave+"'%20IS%20"+_valorregistro;
RDebugUtils.currentLine=139788337;
 //BA.debugLineNum = 139788337;BA.debugLine="Dim NAVHyperlink As String=\"Dynamicsnav://NAVISIO";
_navhyperlink = "Dynamicsnav://NAVISION2012:7046/PROIN/PROIN%20PINILLA/runpage?page="+BA.NumberToString(_codigopaginanav)+_filtroregistro;
RDebugUtils.currentLine=139788339;
 //BA.debugLineNum = 139788339;BA.debugLine="Log(\"Microsoft.Dynamics.Nav.Client.exe \" & NAVHyp";
anywheresoftware.b4a.keywords.Common.LogImpl("9139788339","Microsoft.Dynamics.Nav.Client.exe "+_navhyperlink,0);
RDebugUtils.currentLine=139788340;
 //BA.debugLineNum = 139788340;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=139788341;
 //BA.debugLineNum = 139788341;BA.debugLine="shl.Initialize(\"shl\",NavFilePath, Array As String";
_shl.Initialize("shl",_navfilepath,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{_navhyperlink}));
RDebugUtils.currentLine=139788343;
 //BA.debugLineNum = 139788343;BA.debugLine="Try";
if (true) break;

case 22:
//try
this.state = 62;
this.catchState = 55;
this.state = 24;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 55;
RDebugUtils.currentLine=139788344;
 //BA.debugLineNum = 139788344;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=139788345;
 //BA.debugLineNum = 139788345;BA.debugLine="Log(\"try Success\")";
anywheresoftware.b4a.keywords.Common.LogImpl("9139788345","try Success",0);
RDebugUtils.currentLine=139788346;
 //BA.debugLineNum = 139788346;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolea";
anywheresoftware.b4a.keywords.Common.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamlinknavision", "abrirlinkfichanav"), null);
this.state = 66;
return;
case 66:
//C
this.state = 25;
_success = (boolean) result[0];
_exitcode = (int) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
RDebugUtils.currentLine=139788347;
 //BA.debugLineNum = 139788347;BA.debugLine="If Success Then";
if (true) break;

case 25:
//if
this.state = 53;
if (_success) { 
this.state = 27;
}else {
this.state = 46;
}if (true) break;

case 27:
//C
this.state = 28;
RDebugUtils.currentLine=139788377;
 //BA.debugLineNum = 139788377;BA.debugLine="Dim FlagOk As Boolean";
_flagok = false;
RDebugUtils.currentLine=139788378;
 //BA.debugLineNum = 139788378;BA.debugLine="For i=0 To 3 ' intentarlo 3 veces ... por si na";
if (true) break;

case 28:
//for
this.state = 44;
step35 = 1;
limit35 = (int) (3);
_i = (int) (0) ;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 44;
if ((step35 > 0 && _i <= limit35) || (step35 < 0 && _i >= limit35)) this.state = 30;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step35)) ;
if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=139788379;
 //BA.debugLineNum = 139788379;BA.debugLine="Sleep(1000) ' dar tiempo a que la ventana se a";
anywheresoftware.b4a.keywords.Common.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamlinknavision", "abrirlinkfichanav"),(int) (1000));
this.state = 69;
return;
case 69:
//C
this.state = 31;
;
RDebugUtils.currentLine=139788380;
 //BA.debugLineNum = 139788380;BA.debugLine="Log(\"Buscando window title \" & TituloWindow)";
anywheresoftware.b4a.keywords.Common.LogImpl("9139788380","Buscando window title "+_titulowindow,0);
RDebugUtils.currentLine=139788381;
 //BA.debugLineNum = 139788381;BA.debugLine="Dim WU As JavaObject";
_wu = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=139788382;
 //BA.debugLineNum = 139788382;BA.debugLine="WU.InitializeStatic(\"com.sun.jna.platform.Wind";
_wu.InitializeStatic("com.sun.jna.platform.WindowUtils");
RDebugUtils.currentLine=139788383;
 //BA.debugLineNum = 139788383;BA.debugLine="Dim user32 As JavaObject";
_user32 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=139788384;
 //BA.debugLineNum = 139788384;BA.debugLine="user32 = user32.InitializeStatic(\"com.sun.jna.";
_user32 = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_user32.InitializeStatic("com.sun.jna.platform.win32.User32").GetField("INSTANCE")));
RDebugUtils.currentLine=139788385;
 //BA.debugLineNum = 139788385;BA.debugLine="Dim L As List = WU.RunMethod(\"getAllWindows\",A";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_wu.RunMethod("getAllWindows",new Object[]{(Object)(anywheresoftware.b4a.keywords.Common.False)})));
RDebugUtils.currentLine=139788386;
 //BA.debugLineNum = 139788386;BA.debugLine="For Each JO As JavaObject In L";
if (true) break;

case 31:
//for
this.state = 38;
_jo = new anywheresoftware.b4j.object.JavaObject();
group43 = _l;
index43 = 0;
groupLen43 = group43.getSize();
this.state = 70;
if (true) break;

case 70:
//C
this.state = 38;
if (index43 < groupLen43) {
this.state = 33;
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group43.Get(index43)));}
if (true) break;

case 71:
//C
this.state = 70;
index43++;
if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=139788387;
 //BA.debugLineNum = 139788387;BA.debugLine="Dim t As String = JO.RunMethod(\"getTitle\",Nul";
_t = BA.ObjectToString(_jo.RunMethod("getTitle",(Object[])(anywheresoftware.b4a.keywords.Common.Null)));
RDebugUtils.currentLine=139788389;
 //BA.debugLineNum = 139788389;BA.debugLine="If t.Contains(TituloWindow) And t.Contains(Va";
if (true) break;

case 34:
//if
this.state = 37;
if (_t.contains(_titulowindow) && _t.contains(_valorregistro)) { 
this.state = 36;
}if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=139788390;
 //BA.debugLineNum = 139788390;BA.debugLine="SetForegroundWindow(t,False)";
_setforegroundwindow(_t,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=139788391;
 //BA.debugLineNum = 139788391;BA.debugLine="FlagOk=True";
_flagok = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=139788392;
 //BA.debugLineNum = 139788392;BA.debugLine="Exit";
this.state = 38;
if (true) break;
 if (true) break;

case 37:
//C
this.state = 71;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=139788395;
 //BA.debugLineNum = 139788395;BA.debugLine="If FlagOk Then Exit";

case 38:
//if
this.state = 43;
if (_flagok) { 
this.state = 40;
;}if (true) break;

case 40:
//C
this.state = 43;
this.state = 44;
if (true) break;
if (true) break;

case 43:
//C
this.state = 68;
;
 if (true) break;
if (true) break;

case 44:
//C
this.state = 53;
;
RDebugUtils.currentLine=139788397;
 //BA.debugLineNum = 139788397;BA.debugLine="Return True";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.True));return;};
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=139788406;
 //BA.debugLineNum = 139788406;BA.debugLine="If StdErr.Contains(shl.WorkingDirectory) Then";
if (true) break;

case 47:
//if
this.state = 52;
if (_stderr.contains(_shl.getWorkingDirectory())) { 
this.state = 49;
}else {
this.state = 51;
}if (true) break;

case 49:
//C
this.state = 52;
RDebugUtils.currentLine=139788407;
 //BA.debugLineNum = 139788407;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicaci";
_msa = parent._xui.MsgboxAsync(ba,"La aplicación NAVISION no está instalada en el directorio predeterminado.","Error");
RDebugUtils.currentLine=139788408;
 //BA.debugLineNum = 139788408;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 72;
return;
case 72:
//C
this.state = 52;
;
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=139788410;
 //BA.debugLineNum = 139788410;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(StdErr,\"Erro";
_msa = parent._xui.MsgboxAsync(ba,_stderr,"Error");
RDebugUtils.currentLine=139788411;
 //BA.debugLineNum = 139788411;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 73;
return;
case 73:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
RDebugUtils.currentLine=139788413;
 //BA.debugLineNum = 139788413;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;

case 53:
//C
this.state = 62;
;
 if (true) break;

case 55:
//C
this.state = 56;
this.catchState = 0;
RDebugUtils.currentLine=139788417;
 //BA.debugLineNum = 139788417;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("9139788417",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(ba)),0);
RDebugUtils.currentLine=139788418;
 //BA.debugLineNum = 139788418;BA.debugLine="If LastException.Message.Contains(shl.WorkingDir";
if (true) break;

case 56:
//if
this.state = 61;
if (anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage().contains(_shl.getWorkingDirectory())) { 
this.state = 58;
}else {
this.state = 60;
}if (true) break;

case 58:
//C
this.state = 61;
RDebugUtils.currentLine=139788419;
 //BA.debugLineNum = 139788419;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"La aplicació";
_msa = parent._xui.MsgboxAsync(ba,"La aplicación NAVISION no está instalada en el directorio predeterminado.","Error");
RDebugUtils.currentLine=139788420;
 //BA.debugLineNum = 139788420;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 74;
return;
case 74:
//C
this.state = 61;
;
 if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=139788422;
 //BA.debugLineNum = 139788422;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(LastException";
_msa = parent._xui.MsgboxAsync(ba,anywheresoftware.b4a.keywords.Common.LastException(ba).getMessage(),"Error");
RDebugUtils.currentLine=139788423;
 //BA.debugLineNum = 139788423;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamlinknavision", "abrirlinkfichanav"), _msa);
this.state = 75;
return;
case 75:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = 62;
;
RDebugUtils.currentLine=139788425;
 //BA.debugLineNum = 139788425;BA.debugLine="Return False";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(anywheresoftware.b4a.keywords.Common.False));return;};
 if (true) break;
if (true) break;

case 62:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=139788427;
 //BA.debugLineNum = 139788427;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public static boolean  _setforegroundwindow(String _title,boolean _justfind) throws Exception{
RDebugUtils.currentModule="jamlinknavision";
if (Debug.shouldDelegate(ba, "setforegroundwindow", true))
	 {return ((Boolean) Debug.delegate(ba, "setforegroundwindow", new Object[] {_title,_justfind}));}
RDebugUtils.currentLine=139853824;
 //BA.debugLineNum = 139853824;BA.debugLine="Sub SetForegroundWindow(Title As String, JustFind";
RDebugUtils.currentLine=139853825;
 //BA.debugLineNum = 139853825;BA.debugLine="Return Me.As(JavaObject).RunMethod(\"SetForeground";
if (true) return BA.ObjectToBoolean(((anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(jamlinknavision.getObject()))).RunMethod("SetForegroundWindow",new Object[]{(Object)(_title),(Object)(_justfind)}));
RDebugUtils.currentLine=139853826;
 //BA.debugLineNum = 139853826;BA.debugLine="End Sub";
return false;
}
public static boolean SetForegroundWindow(String title, boolean justFind) {
    User32 user32 = com.sun.jna.platform.win32.User32.INSTANCE;
    for (com.sun.jna.platform.DesktopWindow s : com.sun.jna.platform.WindowUtils.getAllWindows(false)) {
        String t = s.getTitle();
        if (t.toLowerCase().equals(title.toLowerCase())) {
            if (!justFind) {
                user32.SetForegroundWindow(s.getHWND());
                user32.SetFocus(s.getHWND());
                user32.ShowWindow(s.getHWND(), 3);
            }
            return true;
        }
        
    }
    return false;
}
}