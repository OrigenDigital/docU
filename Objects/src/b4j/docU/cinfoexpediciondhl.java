package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cinfoexpediciondhl extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cinfoexpediciondhl", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cinfoexpediciondhl.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _usuariows = "";
public String _passwordws = "";
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
public String  _initialize(b4j.docU.cinfoexpediciondhl __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cinfoexpediciondhl";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=88604672;
 //BA.debugLineNum = 88604672;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=88604674;
 //BA.debugLineNum = 88604674;BA.debugLine="End Sub";
return "";
}
public void  _actualizarinfoexpediciondhl(b4j.docU.cinfoexpediciondhl __ref,String _iddatobuscado) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";
if (Debug.shouldDelegate(ba, "actualizarinfoexpediciondhl", false))
	 {Debug.delegate(ba, "actualizarinfoexpediciondhl", new Object[] {_iddatobuscado}); return;}
ResumableSub_ActualizarInfoExpedicionDHL rsub = new ResumableSub_ActualizarInfoExpedicionDHL(this,__ref,_iddatobuscado);
rsub.resume(ba, null);
}
public static class ResumableSub_ActualizarInfoExpedicionDHL extends BA.ResumableSub {
public ResumableSub_ActualizarInfoExpedicionDHL(b4j.docU.cinfoexpediciondhl parent,b4j.docU.cinfoexpediciondhl __ref,String _iddatobuscado) {
this.parent = parent;
this.__ref = __ref;
this._iddatobuscado = _iddatobuscado;
this.__ref = parent;
}
b4j.docU.cinfoexpediciondhl __ref;
b4j.docU.cinfoexpediciondhl parent;
String _iddatobuscado;
String _acciontracking = "";
anywheresoftware.b4a.objects.collections.List _lstresultadotracking = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _mcred = null;
String _creduser = "";
String _credpswd = "";
anywheresoftware.b4a.objects.StringUtils _su = null;
String _accesstoken = "";
String _cookie = "";
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
anywheresoftware.b4a.objects.collections.List _lsttoken = null;
String[] _datoscsv = null;
long _expiration = 0L;
anywheresoftware.b4a.objects.collections.Map _mjobresponse = null;
String _sresponse = "";
int _result = 0;
anywheresoftware.b4a.objects.collections.List _lstregistros = null;
anywheresoftware.b4j.objects.collections.JSONParser _jp = null;
String _dateformatant = "";
String _timeformatant = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
String _sfechahora = "";
String[] _fh = null;
long _lfechahora = 0L;
anywheresoftware.b4a.BA.IterableList group66;
int index66;
int groupLen66;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88801281;
 //BA.debugLineNum = 88801281;BA.debugLine="Dim AccionTracking As String";
_acciontracking = "";
RDebugUtils.currentLine=88801282;
 //BA.debugLineNum = 88801282;BA.debugLine="Dim lstResultadoTracking As List";
_lstresultadotracking = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88801283;
 //BA.debugLineNum = 88801283;BA.debugLine="lstResultadoTracking.Initialize";
_lstresultadotracking.Initialize();
RDebugUtils.currentLine=88801286;
 //BA.debugLineNum = 88801286;BA.debugLine="Wait For(CargaDatosWebServiceTransporte(1)) compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), __ref._cargadatoswebservicetransporte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (1)));
this.state = 34;
return;
case 34:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=88801287;
 //BA.debugLineNum = 88801287;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=88801289;
 //BA.debugLineNum = 88801289;BA.debugLine="If Accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=88801290;
 //BA.debugLineNum = 88801290;BA.debugLine="AccionTracking=\"ErrorWS\"";
_acciontracking = "ErrorWS";
RDebugUtils.currentLine=88801291;
 //BA.debugLineNum = 88801291;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error credenc";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Error credenciales DHL","Error");
RDebugUtils.currentLine=88801292;
 //BA.debugLineNum = 88801292;BA.debugLine="Wait For (msa) Msgbox_Result";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 35;
return;
case 35:
//C
this.state = 4;
;
RDebugUtils.currentLine=88801293;
 //BA.debugLineNum = 88801293;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=88801295;
 //BA.debugLineNum = 88801295;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=88801296;
 //BA.debugLineNum = 88801296;BA.debugLine="Dim mCred As Map=lstRes.Get(0)";
_mcred = new anywheresoftware.b4a.objects.collections.Map();
_mcred = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=88801297;
 //BA.debugLineNum = 88801297;BA.debugLine="Dim CredUser As String=mCred.Get(\"UsuarioWS\")";
_creduser = BA.ObjectToString(_mcred.Get((Object)("UsuarioWS")));
RDebugUtils.currentLine=88801298;
 //BA.debugLineNum = 88801298;BA.debugLine="Dim CredPswd As String=mCred.Get(\"PasswordWS\")";
_credpswd = BA.ObjectToString(_mcred.Get((Object)("PasswordWS")));
RDebugUtils.currentLine=88801301;
 //BA.debugLineNum = 88801301;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=88801302;
 //BA.debugLineNum = 88801302;BA.debugLine="Dim accessToken As String";
_accesstoken = "";
RDebugUtils.currentLine=88801303;
 //BA.debugLineNum = 88801303;BA.debugLine="Dim Cookie As String";
_cookie = "";
RDebugUtils.currentLine=88801304;
 //BA.debugLineNum = 88801304;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88801305;
 //BA.debugLineNum = 88801305;BA.debugLine="lstHeaders.Initialize";
_lstheaders.Initialize();
RDebugUtils.currentLine=88801306;
 //BA.debugLineNum = 88801306;BA.debugLine="lstHeaders.Add(Array As String(\"Expiration\",\"Toke";
_lstheaders.Add((Object)(new String[]{"Expiration","Token","Cookie"}));
RDebugUtils.currentLine=88801307;
 //BA.debugLineNum = 88801307;BA.debugLine="If File.Exists(Main.UserTempFolder,\"info.csv\") Th";
if (true) break;

case 5:
//if
this.state = 14;
if (parent.__c.File.Exists(parent._main._usertempfolder /*String*/ ,"info.csv")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=88801309;
 //BA.debugLineNum = 88801309;BA.debugLine="Dim lstToken As List=su.LoadCSV2(Main.UserTempFo";
_lsttoken = new anywheresoftware.b4a.objects.collections.List();
_lsttoken = _su.LoadCSV2(parent._main._usertempfolder /*String*/ ,"info.csv",BA.ObjectToChar(","),_lstheaders);
RDebugUtils.currentLine=88801310;
 //BA.debugLineNum = 88801310;BA.debugLine="Dim DatosCSV() As String=lstToken.Get(0)";
_datoscsv = (String[])(_lsttoken.Get((int) (0)));
RDebugUtils.currentLine=88801311;
 //BA.debugLineNum = 88801311;BA.debugLine="Dim Expiration As Long=DatosCSV(0)";
_expiration = (long)(Double.parseDouble(_datoscsv[(int) (0)]));
RDebugUtils.currentLine=88801312;
 //BA.debugLineNum = 88801312;BA.debugLine="If DateTime.Now<Expiration Then";
if (true) break;

case 8:
//if
this.state = 13;
if (parent.__c.DateTime.getNow()<_expiration) { 
this.state = 10;
}else {
this.state = 12;
}if (true) break;

case 10:
//C
this.state = 13;
RDebugUtils.currentLine=88801313;
 //BA.debugLineNum = 88801313;BA.debugLine="accessToken=DatosCSV(1)";
_accesstoken = _datoscsv[(int) (1)];
RDebugUtils.currentLine=88801314;
 //BA.debugLineNum = 88801314;BA.debugLine="Cookie=DatosCSV(2)";
_cookie = _datoscsv[(int) (2)];
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=88801316;
 //BA.debugLineNum = 88801316;BA.debugLine="File.Delete(Main.UserTempFolder,\"info.csv\")";
parent.__c.File.Delete(parent._main._usertempfolder /*String*/ ,"info.csv");
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
RDebugUtils.currentLine=88801320;
 //BA.debugLineNum = 88801320;BA.debugLine="If accessToken=\"\" Then";

case 14:
//if
this.state = 23;
if ((_accesstoken).equals("")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=88801322;
 //BA.debugLineNum = 88801322;BA.debugLine="Wait For(ObtenerTokensWebServiceDHL(CredUser,Cre";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), __ref._obtenertokenswebservicedhl /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_creduser,_credpswd));
this.state = 36;
return;
case 36:
//C
this.state = 17;
_mjobresponse = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=88801325;
 //BA.debugLineNum = 88801325;BA.debugLine="Dim sResponse As String=mJobResponse.Get(\"sRespu";
_sresponse = BA.ObjectToString(_mjobresponse.Get((Object)("sRespuestaWebService")));
RDebugUtils.currentLine=88801326;
 //BA.debugLineNum = 88801326;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 17:
//if
this.state = 22;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
RDebugUtils.currentLine=88801327;
 //BA.debugLineNum = 88801327;BA.debugLine="AccionTracking=\"ErrorWS\"";
_acciontracking = "ErrorWS";
RDebugUtils.currentLine=88801328;
 //BA.debugLineNum = 88801328;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Ha fallado la llamada al web  service de DHL"+parent.__c.CRLF+parent.__c.CRLF+"El error puede estar en el servidor de DHL, o en la conexion a internet. Inténtalo más tarde.","Error de comunicación");
RDebugUtils.currentLine=88801330;
 //BA.debugLineNum = 88801330;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 37;
return;
case 37:
//C
this.state = 22;
_result = (int) result[1];
;
RDebugUtils.currentLine=88801331;
 //BA.debugLineNum = 88801331;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=88801333;
 //BA.debugLineNum = 88801333;BA.debugLine="Dim Cookie As String=mJobResponse.Get(\"Cookie\")";
_cookie = BA.ObjectToString(_mjobresponse.Get((Object)("Cookie")));
RDebugUtils.currentLine=88801334;
 //BA.debugLineNum = 88801334;BA.debugLine="Log(\"Cookie \" & Cookie)";
parent.__c.LogImpl("888801334","Cookie "+_cookie,0);
RDebugUtils.currentLine=88801336;
 //BA.debugLineNum = 88801336;BA.debugLine="Dim accessToken As String=mJobResponse.Get(\"Tok";
_accesstoken = BA.ObjectToString(_mjobresponse.Get((Object)("Token")));
RDebugUtils.currentLine=88801337;
 //BA.debugLineNum = 88801337;BA.debugLine="Log(\"accessToken \" & accessToken)";
parent.__c.LogImpl("888801337","accessToken "+_accesstoken,0);
RDebugUtils.currentLine=88801340;
 //BA.debugLineNum = 88801340;BA.debugLine="Dim Expiration As Long=DateTime.Now+(DateTime.T";
_expiration = (long) (parent.__c.DateTime.getNow()+(parent.__c.DateTime.TicksPerMinute)*20);
RDebugUtils.currentLine=88801341;
 //BA.debugLineNum = 88801341;BA.debugLine="Dim lstRegistros As List";
_lstregistros = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=88801342;
 //BA.debugLineNum = 88801342;BA.debugLine="lstRegistros.Initialize";
_lstregistros.Initialize();
RDebugUtils.currentLine=88801343;
 //BA.debugLineNum = 88801343;BA.debugLine="lstRegistros.Add(Array As String(Expiration,acc";
_lstregistros.Add((Object)(new String[]{BA.NumberToString(_expiration),_accesstoken,_cookie}));
RDebugUtils.currentLine=88801344;
 //BA.debugLineNum = 88801344;BA.debugLine="su.SaveCSV2(Main.UserTempFolder,\"info.csv\",\",\",";
_su.SaveCSV2(parent._main._usertempfolder /*String*/ ,"info.csv",BA.ObjectToChar(","),_lstregistros,anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Expiration","Token","Cookie"}));
 if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=88801349;
 //BA.debugLineNum = 88801349;BA.debugLine="Wait For (EnvioDatosWebServiceDHL(IDDatoBuscado,a";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), __ref._enviodatoswebservicedhl /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_iddatobuscado,_accesstoken));
this.state = 38;
return;
case 38:
//C
this.state = 24;
_sresponse = (String) result[1];
;
RDebugUtils.currentLine=88801351;
 //BA.debugLineNum = 88801351;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 24:
//if
this.state = 33;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 33;
RDebugUtils.currentLine=88801352;
 //BA.debugLineNum = 88801352;BA.debugLine="AccionTracking=\"ErrorWS\"";
_acciontracking = "ErrorWS";
RDebugUtils.currentLine=88801353;
 //BA.debugLineNum = 88801353;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,"Ha fallado la llamada al web service de DHL."+parent.__c.CRLF+parent.__c.CRLF+_sresponse,"Error de comunicación");
RDebugUtils.currentLine=88801354;
 //BA.debugLineNum = 88801354;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "actualizarinfoexpediciondhl"), _msa);
this.state = 39;
return;
case 39:
//C
this.state = 33;
_result = (int) result[1];
;
 if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=88801357;
 //BA.debugLineNum = 88801357;BA.debugLine="Dim jp As JSONParser";
_jp = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=88801358;
 //BA.debugLineNum = 88801358;BA.debugLine="jp.Initialize(sResponse)";
_jp.Initialize(_sresponse);
RDebugUtils.currentLine=88801359;
 //BA.debugLineNum = 88801359;BA.debugLine="lstResultadoTracking=jp.NextArray";
_lstresultadotracking = _jp.NextArray();
RDebugUtils.currentLine=88801361;
 //BA.debugLineNum = 88801361;BA.debugLine="Dim DateFormatAnt As String=DateTime.DateFormat";
_dateformatant = parent.__c.DateTime.getDateFormat();
RDebugUtils.currentLine=88801362;
 //BA.debugLineNum = 88801362;BA.debugLine="Dim TimeFormatAnt As String=DateTime.TimeFormat";
_timeformatant = parent.__c.DateTime.getTimeFormat();
RDebugUtils.currentLine=88801363;
 //BA.debugLineNum = 88801363;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=88801364;
 //BA.debugLineNum = 88801364;BA.debugLine="DateTime.TimeFormat=\"HH-mm-ss\"";
parent.__c.DateTime.setTimeFormat("HH-mm-ss");
RDebugUtils.currentLine=88801365;
 //BA.debugLineNum = 88801365;BA.debugLine="For Each m As Map In lstResultadoTracking";
if (true) break;

case 29:
//for
this.state = 32;
_m = new anywheresoftware.b4a.objects.collections.Map();
group66 = _lstresultadotracking;
index66 = 0;
groupLen66 = group66.getSize();
this.state = 40;
if (true) break;

case 40:
//C
this.state = 32;
if (index66 < groupLen66) {
this.state = 31;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group66.Get(index66)));}
if (true) break;

case 41:
//C
this.state = 40;
index66++;
if (true) break;

case 31:
//C
this.state = 41;
RDebugUtils.currentLine=88801366;
 //BA.debugLineNum = 88801366;BA.debugLine="Log(\"m recibido\" & m)";
parent.__c.LogImpl("888801366","m recibido"+BA.ObjectToString(_m),0);
RDebugUtils.currentLine=88801367;
 //BA.debugLineNum = 88801367;BA.debugLine="Dim sFechaHora As String=m.Get(\"DateTime\")";
_sfechahora = BA.ObjectToString(_m.Get((Object)("DateTime")));
RDebugUtils.currentLine=88801368;
 //BA.debugLineNum = 88801368;BA.debugLine="sFechaHora=sFechaHora.Replace(\"T\",\" \")";
_sfechahora = _sfechahora.replace("T"," ");
RDebugUtils.currentLine=88801369;
 //BA.debugLineNum = 88801369;BA.debugLine="Dim Fh() As String=Regex.Split(\" \",sFechaHora)";
_fh = parent.__c.Regex.Split(" ",_sfechahora);
RDebugUtils.currentLine=88801370;
 //BA.debugLineNum = 88801370;BA.debugLine="Dim lFechaHora As Long=DateTime.DateTimeParse(F";
_lfechahora = parent.__c.DateTime.DateTimeParse(_fh[(int) (0)],_fh[(int) (1)]);
RDebugUtils.currentLine=88801371;
 //BA.debugLineNum = 88801371;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
parent.__c.DateTime.setDateFormat("dd/MM/yyyy");
RDebugUtils.currentLine=88801372;
 //BA.debugLineNum = 88801372;BA.debugLine="sFechaHora=DateTime.Date(lFechaHora) & \" \" & Da";
_sfechahora = parent.__c.DateTime.Date(_lfechahora)+" "+parent.__c.DateTime.Time(_lfechahora);
RDebugUtils.currentLine=88801373;
 //BA.debugLineNum = 88801373;BA.debugLine="Log(\"m modificado \" & m)";
parent.__c.LogImpl("888801373","m modificado "+BA.ObjectToString(_m),0);
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=88801375;
 //BA.debugLineNum = 88801375;BA.debugLine="DateTime.DateFormat=DateFormatAnt";
parent.__c.DateTime.setDateFormat(_dateformatant);
RDebugUtils.currentLine=88801376;
 //BA.debugLineNum = 88801376;BA.debugLine="DateTime.TimeFormat=TimeFormatAnt";
parent.__c.DateTime.setTimeFormat(_timeformatant);
 if (true) break;

case 33:
//C
this.state = -1;
;
RDebugUtils.currentLine=88801378;
 //BA.debugLineNum = 88801378;BA.debugLine="CallSubDelayed3(Me,\"ActualizarInfoExpedicionDHL_C";
parent.__c.CallSubDelayed3(ba,parent,"ActualizarInfoExpedicionDHL_Completed",(Object)(_acciontracking),(Object)(_lstresultadotracking));
RDebugUtils.currentLine=88801380;
 //BA.debugLineNum = 88801380;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatoswebservicetransporte(b4j.docU.cinfoexpediciondhl __ref,int _idtransportista) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";
if (Debug.shouldDelegate(ba, "cargadatoswebservicetransporte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatoswebservicetransporte", new Object[] {_idtransportista}));}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(this,__ref,_idtransportista);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cinfoexpediciondhl parent,b4j.docU.cinfoexpediciondhl __ref,int _idtransportista) {
this.parent = parent;
this.__ref = __ref;
this._idtransportista = _idtransportista;
this.__ref = parent;
}
b4j.docU.cinfoexpediciondhl __ref;
b4j.docU.cinfoexpediciondhl parent;
int _idtransportista;
String _accion = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88735746;
 //BA.debugLineNum = 88735746;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=88735747;
 //BA.debugLineNum = 88735747;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88735748;
 //BA.debugLineNum = 88735748;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=88735749;
 //BA.debugLineNum = 88735749;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=88735750;
 //BA.debugLineNum = 88735750;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
_comandojrdc = "DatosWebServiceTransporte";
RDebugUtils.currentLine=88735751;
 //BA.debugLineNum = 88735751;BA.debugLine="JRDCQuery.DatosJRDC(\"http://192.168.10.20:17179/r";
parent._jrdcquery._datosjrdc /*void*/ ("http://192.168.10.20:17179/rdc",_comandojrdc,(Object[])(new String[]{BA.NumberToString(_idtransportista)}),parent);
RDebugUtils.currentLine=88735752;
 //BA.debugLineNum = 88735752;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
parent.__c.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=88735753;
 //BA.debugLineNum = 88735753;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(parent.__c.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=88735754;
 //BA.debugLineNum = 88735754;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=88735756;
 //BA.debugLineNum = 88735756;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(parent.__c.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=88735757;
 //BA.debugLineNum = 88735757;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=88735759;
 //BA.debugLineNum = 88735759;BA.debugLine="Dim lstRes As List=mresult.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=88735760;
 //BA.debugLineNum = 88735760;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=88735761;
 //BA.debugLineNum = 88735761;BA.debugLine="mRes.Put(\"lstRes\",lstRes)";
_mres.Put((Object)("lstRes"),(Object)(_lstres.getObject()));
 if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=88735764;
 //BA.debugLineNum = 88735764;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=88735765;
 //BA.debugLineNum = 88735765;BA.debugLine="Return mRes";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=88735766;
 //BA.debugLineNum = 88735766;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenertokenswebservicedhl(b4j.docU.cinfoexpediciondhl __ref,String _credenu,String _credenpswd) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";
if (Debug.shouldDelegate(ba, "obtenertokenswebservicedhl", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenertokenswebservicedhl", new Object[] {_credenu,_credenpswd}));}
ResumableSub_ObtenerTokensWebServiceDHL rsub = new ResumableSub_ObtenerTokensWebServiceDHL(this,__ref,_credenu,_credenpswd);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerTokensWebServiceDHL extends BA.ResumableSub {
public ResumableSub_ObtenerTokensWebServiceDHL(b4j.docU.cinfoexpediciondhl parent,b4j.docU.cinfoexpediciondhl __ref,String _credenu,String _credenpswd) {
this.parent = parent;
this.__ref = __ref;
this._credenu = _credenu;
this._credenpswd = _credenpswd;
this.__ref = parent;
}
b4j.docU.cinfoexpediciondhl __ref;
b4j.docU.cinfoexpediciondhl parent;
String _credenu;
String _credenpswd;
anywheresoftware.b4a.objects.collections.Map _mtokenjson = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _jp = null;
String _tokenjsonstring = "";
b4j.docU.httpjob _job = null;
String _accesstokenurl = "";
b4j.docU.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _mjobresponse = null;
String _srespuestawebservice = "";
anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _resp = null;
anywheresoftware.b4a.objects.collections.Map _headers = null;
String _key = "";
String _scookie = "";
String[] _cookiecomponents = null;
String _cookie = "";
String _serrorjobresponse = "";
anywheresoftware.b4a.BA.IterableList group23;
int index23;
int groupLen23;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88932354;
 //BA.debugLineNum = 88932354;BA.debugLine="Dim mTokenJSON As Map";
_mtokenjson = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88932355;
 //BA.debugLineNum = 88932355;BA.debugLine="mTokenJSON.Initialize";
_mtokenjson.Initialize();
RDebugUtils.currentLine=88932358;
 //BA.debugLineNum = 88932358;BA.debugLine="mTokenJSON.Put(\"Username\",CredenU)";
_mtokenjson.Put((Object)("Username"),(Object)(_credenu));
RDebugUtils.currentLine=88932360;
 //BA.debugLineNum = 88932360;BA.debugLine="mTokenJSON.Put(\"Password\",CredenPswd)";
_mtokenjson.Put((Object)("Password"),(Object)(_credenpswd));
RDebugUtils.currentLine=88932362;
 //BA.debugLineNum = 88932362;BA.debugLine="Dim jp As JSONGenerator";
_jp = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=88932363;
 //BA.debugLineNum = 88932363;BA.debugLine="jp.Initialize(mTokenJSON)";
_jp.Initialize(_mtokenjson);
RDebugUtils.currentLine=88932364;
 //BA.debugLineNum = 88932364;BA.debugLine="Dim TokenJSONstring As String";
_tokenjsonstring = "";
RDebugUtils.currentLine=88932365;
 //BA.debugLineNum = 88932365;BA.debugLine="TokenJSONstring=jp.ToString";
_tokenjsonstring = _jp.ToString();
RDebugUtils.currentLine=88932367;
 //BA.debugLineNum = 88932367;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=88932368;
 //BA.debugLineNum = 88932368;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=88932371;
 //BA.debugLineNum = 88932371;BA.debugLine="Dim AccessTokenURL As String=\"https://external.dh";
_accesstokenurl = "https://external.dhl.es/cimapi/api/v1/customer/authenticate";
RDebugUtils.currentLine=88932372;
 //BA.debugLineNum = 88932372;BA.debugLine="job.PostString(AccessTokenURL, TokenJSONstring)";
_job._poststring /*String*/ (null,_accesstokenurl,_tokenjsonstring);
RDebugUtils.currentLine=88932373;
 //BA.debugLineNum = 88932373;BA.debugLine="job.GetRequest.SetHeader(\"accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("accept","application/json");
RDebugUtils.currentLine=88932374;
 //BA.debugLineNum = 88932374;BA.debugLine="job.GetRequest.SetContentType(\"application/json\")";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=88932375;
 //BA.debugLineNum = 88932375;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=88932377;
 //BA.debugLineNum = 88932377;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "obtenertokenswebservicedhl"), (Object)(_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=88932378;
 //BA.debugLineNum = 88932378;BA.debugLine="Dim mJobResponse As Map";
_mjobresponse = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=88932379;
 //BA.debugLineNum = 88932379;BA.debugLine="mJobResponse.Initialize";
_mjobresponse.Initialize();
RDebugUtils.currentLine=88932380;
 //BA.debugLineNum = 88932380;BA.debugLine="If j.Success Then   ' la API de españa devuelve 1";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=88932382;
 //BA.debugLineNum = 88932382;BA.debugLine="Dim sRespuestaWebService As String=j.getstring";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=88932383;
 //BA.debugLineNum = 88932383;BA.debugLine="Dim resp As OkHttpResponse = job.Response";
_resp = _job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ ;
RDebugUtils.currentLine=88932384;
 //BA.debugLineNum = 88932384;BA.debugLine="Dim headers As Map  = resp.GetHeaders";
_headers = new anywheresoftware.b4a.objects.collections.Map();
_headers = _resp.GetHeaders();
RDebugUtils.currentLine=88932385;
 //BA.debugLineNum = 88932385;BA.debugLine="For Each key As String In headers.Keys";
if (true) break;

case 4:
//for
this.state = 7;
group23 = _headers.Keys();
index23 = 0;
groupLen23 = group23.getSize();
this.state = 12;
if (true) break;

case 12:
//C
this.state = 7;
if (index23 < groupLen23) {
this.state = 6;
_key = BA.ObjectToString(group23.Get(index23));}
if (true) break;

case 13:
//C
this.state = 12;
index23++;
if (true) break;

case 6:
//C
this.state = 13;
RDebugUtils.currentLine=88932386;
 //BA.debugLineNum = 88932386;BA.debugLine="Log($\"Header: ${key} = ${headers.Get(key)}\"$)";
parent.__c.LogImpl("888932386",("Header: "+parent.__c.SmartStringFormatter("",(Object)(_key))+" = "+parent.__c.SmartStringFormatter("",_headers.Get((Object)(_key)))+""),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
RDebugUtils.currentLine=88932389;
 //BA.debugLineNum = 88932389;BA.debugLine="Dim sCookie As String=resp.GetHeaders.Get(\"set-c";
_scookie = BA.ObjectToString(_resp.GetHeaders().Get((Object)("set-cookie")));
RDebugUtils.currentLine=88932390;
 //BA.debugLineNum = 88932390;BA.debugLine="sCookie=sCookie.Replace(\"[\",\"\").Replace(\"]\",\"\")";
_scookie = _scookie.replace("[","").replace("]","");
RDebugUtils.currentLine=88932391;
 //BA.debugLineNum = 88932391;BA.debugLine="Dim CookieComponents() As String =Regex.Split(\";";
_cookiecomponents = parent.__c.Regex.Split(";",_scookie);
RDebugUtils.currentLine=88932392;
 //BA.debugLineNum = 88932392;BA.debugLine="Dim Cookie As String= CookieComponents(0)";
_cookie = _cookiecomponents[(int) (0)];
RDebugUtils.currentLine=88932393;
 //BA.debugLineNum = 88932393;BA.debugLine="Log(\"set-cookie \" & Cookie)";
parent.__c.LogImpl("888932393","set-cookie "+_cookie,0);
RDebugUtils.currentLine=88932394;
 //BA.debugLineNum = 88932394;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=88932395;
 //BA.debugLineNum = 88932395;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sRespues";
_mjobresponse.Put((Object)("sRespuestaWebService"),(Object)(_srespuestawebservice));
RDebugUtils.currentLine=88932396;
 //BA.debugLineNum = 88932396;BA.debugLine="mJobResponse.Put(\"Cookie\",Cookie)";
_mjobresponse.Put((Object)("Cookie"),(Object)(_cookie));
RDebugUtils.currentLine=88932397;
 //BA.debugLineNum = 88932397;BA.debugLine="mJobResponse.Put(\"Token\",sRespuestaWebService.Re";
_mjobresponse.Put((Object)("Token"),(Object)(_srespuestawebservice.replace(parent.__c.QUOTE,"")));
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=88932400;
 //BA.debugLineNum = 88932400;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=88932401;
 //BA.debugLineNum = 88932401;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=88932402;
 //BA.debugLineNum = 88932402;BA.debugLine="mJobResponse.Put(\"sRespuestaWebService\",sErrorJo";
_mjobresponse.Put((Object)("sRespuestaWebService"),(Object)(_serrorjobresponse));
RDebugUtils.currentLine=88932403;
 //BA.debugLineNum = 88932403;BA.debugLine="mJobResponse.Put(\"Cookie\",\"\")";
_mjobresponse.Put((Object)("Cookie"),(Object)(""));
RDebugUtils.currentLine=88932404;
 //BA.debugLineNum = 88932404;BA.debugLine="mJobResponse.Put(\"Token\",\"\")";
_mjobresponse.Put((Object)("Token"),(Object)(""));
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=88932407;
 //BA.debugLineNum = 88932407;BA.debugLine="Return mJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_mjobresponse));return;};
RDebugUtils.currentLine=88932408;
 //BA.debugLineNum = 88932408;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebservicedhl(b4j.docU.cinfoexpediciondhl __ref,String _iddatoenviobuscado,String _token) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";
if (Debug.shouldDelegate(ba, "enviodatoswebservicedhl", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebservicedhl", new Object[] {_iddatoenviobuscado,_token}));}
ResumableSub_EnvioDatosWebServiceDHL rsub = new ResumableSub_EnvioDatosWebServiceDHL(this,__ref,_iddatoenviobuscado,_token);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceDHL extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceDHL(b4j.docU.cinfoexpediciondhl parent,b4j.docU.cinfoexpediciondhl __ref,String _iddatoenviobuscado,String _token) {
this.parent = parent;
this.__ref = __ref;
this._iddatoenviobuscado = _iddatoenviobuscado;
this._token = _token;
this.__ref = parent;
}
b4j.docU.cinfoexpediciondhl __ref;
b4j.docU.cinfoexpediciondhl parent;
String _iddatoenviobuscado;
String _token;
b4j.docU.httpjob _job = null;
String _urldhltracktrace = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88866818;
 //BA.debugLineNum = 88866818;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=88866819;
 //BA.debugLineNum = 88866819;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=88866821;
 //BA.debugLineNum = 88866821;BA.debugLine="Dim URLDhlTrackTrace As String=\"https://external.";
_urldhltracktrace = "https://external.dhl.es/cimapi/api/v1/customer/track?id="+_iddatoenviobuscado+"&idioma=es";
RDebugUtils.currentLine=88866822;
 //BA.debugLineNum = 88866822;BA.debugLine="job.Download(URLDhlTrackTrace)";
_job._download /*String*/ (null,_urldhltracktrace);
RDebugUtils.currentLine=88866824;
 //BA.debugLineNum = 88866824;BA.debugLine="job.GetRequest.SetHeader(\"Accept\",\"application/js";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Accept","application/json");
RDebugUtils.currentLine=88866825;
 //BA.debugLineNum = 88866825;BA.debugLine="job.GetRequest.SetHeader(\"Authorization\", \"Bearer";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetHeader("Authorization","Bearer "+_token);
RDebugUtils.currentLine=88866832;
 //BA.debugLineNum = 88866832;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=88866834;
 //BA.debugLineNum = 88866834;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "enviodatoswebservicedhl"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[1];
;
RDebugUtils.currentLine=88866836;
 //BA.debugLineNum = 88866836;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=88866837;
 //BA.debugLineNum = 88866837;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
parent.__c.LogImpl("888866837","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=88866839;
 //BA.debugLineNum = 88866839;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=88866840;
 //BA.debugLineNum = 88866840;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=88866841;
 //BA.debugLineNum = 88866841;BA.debugLine="Return sRespuestaWebService";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=88866844;
 //BA.debugLineNum = 88866844;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=88866845;
 //BA.debugLineNum = 88866845;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=88866846;
 //BA.debugLineNum = 88866846;BA.debugLine="Return sErrorJobResponse";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=88866848;
 //BA.debugLineNum = 88866848;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargacredenciales(b4j.docU.cinfoexpediciondhl __ref) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";
if (Debug.shouldDelegate(ba, "cargacredenciales", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargacredenciales", null));}
ResumableSub_CargaCredenciales rsub = new ResumableSub_CargaCredenciales(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaCredenciales extends BA.ResumableSub {
public ResumableSub_CargaCredenciales(b4j.docU.cinfoexpediciondhl parent,b4j.docU.cinfoexpediciondhl __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cinfoexpediciondhl __ref;
b4j.docU.cinfoexpediciondhl parent;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstresws = null;
anywheresoftware.b4a.objects.collections.Map _mdatosws = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cinfoexpediciondhl";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=88670210;
 //BA.debugLineNum = 88670210;BA.debugLine="Wait For(CargaDatosWebServiceTransporte(17)) comp";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cinfoexpediciondhl", "cargacredenciales"), __ref._cargadatoswebservicetransporte /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (17)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[1];
;
RDebugUtils.currentLine=88670211;
 //BA.debugLineNum = 88670211;BA.debugLine="Dim accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=88670212;
 //BA.debugLineNum = 88670212;BA.debugLine="If accion=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_accion).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=88670213;
 //BA.debugLineNum = 88670213;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=88670215;
 //BA.debugLineNum = 88670215;BA.debugLine="Dim lstResWS As List=mRes.Get(\"lstRes\")";
_lstresws = new anywheresoftware.b4a.objects.collections.List();
_lstresws = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=88670216;
 //BA.debugLineNum = 88670216;BA.debugLine="Dim mDatosWS As Map=lstResWS.Get(0)";
_mdatosws = new anywheresoftware.b4a.objects.collections.Map();
_mdatosws = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstresws.Get((int) (0))));
RDebugUtils.currentLine=88670218;
 //BA.debugLineNum = 88670218;BA.debugLine="UsuarioWS=mDatosWS.get(\"UsuarioWS\")";
__ref._usuariows /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("UsuarioWS")));
RDebugUtils.currentLine=88670219;
 //BA.debugLineNum = 88670219;BA.debugLine="PasswordWs=mDatosWS.get(\"PasswordWS\")";
__ref._passwordws /*String*/  = BA.ObjectToString(_mdatosws.Get((Object)("PasswordWS")));
RDebugUtils.currentLine=88670220;
 //BA.debugLineNum = 88670220;BA.debugLine="If UsuarioWS=\"\" Or PasswordWs=\"\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._usuariows /*String*/ ).equals("") || (__ref._passwordws /*String*/ ).equals("")) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=88670221;
 //BA.debugLineNum = 88670221;BA.debugLine="Return \"Error carga credenciales\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Error carga credenciales"));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=88670223;
 //BA.debugLineNum = 88670223;BA.debugLine="Return \"OK\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("OK"));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=88670225;
 //BA.debugLineNum = 88670225;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.docU.cinfoexpediciondhl __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cinfoexpediciondhl";
RDebugUtils.currentLine=88539136;
 //BA.debugLineNum = 88539136;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=88539137;
 //BA.debugLineNum = 88539137;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=88539138;
 //BA.debugLineNum = 88539138;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=88539139;
 //BA.debugLineNum = 88539139;BA.debugLine="Private UsuarioWS As String";
_usuariows = "";
RDebugUtils.currentLine=88539140;
 //BA.debugLineNum = 88539140;BA.debugLine="Private PasswordWs As String";
_passwordws = "";
RDebugUtils.currentLine=88539141;
 //BA.debugLineNum = 88539141;BA.debugLine="End Sub";
return "";
}
}