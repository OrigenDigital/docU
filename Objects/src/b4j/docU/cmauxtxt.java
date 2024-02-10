package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;

public class cmauxtxt extends Object{
public static cmauxtxt mostCurrent = new cmauxtxt();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cmauxtxt", null);
		ba.loadHtSubs(cmauxtxt.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.docU.cmauxtxt", ba);
		}
	}
    public static Class<?> getObject() {
		return cmauxtxt.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _usertxt = "";
public static String _pswtxt = "";
public static String _tokenwebtxt = "";
public static int _codigoclientetxt = 0;
public static b4j.example.cssutils _cssutils = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.docU.main _main = null;
public static b4j.docU.mainmenu2 _mainmenu2 = null;
public static b4j.docU.utilidades _utilidades = null;
public static b4j.docU.cmauxcorreosexpress _cmauxcorreosexpress = null;
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
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerurltrazabilidadexpediciontxt(String _numexpedicion) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "obtenerurltrazabilidadexpediciontxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenerurltrazabilidadexpediciontxt", new Object[] {_numexpedicion}));}
ResumableSub_ObtenerURLTrazabilidadExpedicionTXT rsub = new ResumableSub_ObtenerURLTrazabilidadExpedicionTXT(null,_numexpedicion);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerURLTrazabilidadExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerURLTrazabilidadExpedicionTXT(b4j.docU.cmauxtxt parent,String _numexpedicion) {
this.parent = parent;
this._numexpedicion = _numexpedicion;
}
b4j.docU.cmauxtxt parent;
String _numexpedicion;
String _accion = "";
String _url = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
Object _msa = null;
int _result = 0;
String _sresp = "";
String _codorigen = "";
String _coddestino = "";
int _nexped1 = 0;
String _nexped2 = "";
String _ano = "";
String _sresponse = "";
b4j.docU.xml2map _xm = null;
anywheresoftware.b4a.objects.collections.Map _mparseddata = null;
anywheresoftware.b4a.objects.collections.Map _menvelope = null;
anywheresoftware.b4a.objects.collections.Map _mbody = null;
anywheresoftware.b4a.objects.collections.Map _murltrackingresponse = null;
String _urltrackingresult = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94568450;
 //BA.debugLineNum = 94568450;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=94568451;
 //BA.debugLineNum = 94568451;BA.debugLine="Dim URL As String";
_url = "";
RDebugUtils.currentLine=94568452;
 //BA.debugLineNum = 94568452;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=94568453;
 //BA.debugLineNum = 94568453;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=94568455;
 //BA.debugLineNum = 94568455;BA.debugLine="If NumExpedicion.Length<23 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_numexpedicion.length()<23) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=94568456;
 //BA.debugLineNum = 94568456;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"El número d";
_msa = parent._xui.MsgboxAsync(ba,"El número de expedición es erróneo, revisar.","Error");
RDebugUtils.currentLine=94568457;
 //BA.debugLineNum = 94568457;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _msa);
this.state = 13;
return;
case 13:
//C
this.state = 4;
_result = (int) result[0];
;
RDebugUtils.currentLine=94568458;
 //BA.debugLineNum = 94568458;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=94568459;
 //BA.debugLineNum = 94568459;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=94568467;
 //BA.debugLineNum = 94568467;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _cargacredencialestxt());
this.state = 14;
return;
case 14:
//C
this.state = 5;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=94568468;
 //BA.debugLineNum = 94568468;BA.debugLine="If sResp=\"NOK\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_sresp).equals("NOK")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=94568469;
 //BA.debugLineNum = 94568469;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=94568470;
 //BA.debugLineNum = 94568470;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=94568473;
 //BA.debugLineNum = 94568473;BA.debugLine="Dim CodOrigen As String=NumExpedicion.SubString2(";
_codorigen = _numexpedicion.substring((int) (3),(int) (6));
RDebugUtils.currentLine=94568474;
 //BA.debugLineNum = 94568474;BA.debugLine="Dim CodDestino As String=NumExpedicion.SubString2";
_coddestino = _numexpedicion.substring((int) (6),(int) (9));
RDebugUtils.currentLine=94568475;
 //BA.debugLineNum = 94568475;BA.debugLine="Dim Nexped1 As Int=NumExpedicion.SubString2(9,12)";
_nexped1 = (int)(Double.parseDouble(_numexpedicion.substring((int) (9),(int) (12))));
RDebugUtils.currentLine=94568476;
 //BA.debugLineNum = 94568476;BA.debugLine="Dim Nexped2 As String=NumExpedicion.SubString2(12";
_nexped2 = _numexpedicion.substring((int) (12),(int) (19));
RDebugUtils.currentLine=94568477;
 //BA.debugLineNum = 94568477;BA.debugLine="Dim Ano As String=NumExpedicion.SubString2(19,23)";
_ano = _numexpedicion.substring((int) (19),(int) (23));
RDebugUtils.currentLine=94568478;
 //BA.debugLineNum = 94568478;BA.debugLine="Wait For(EnvioDatosWebServiceURLTrackingTxT(Codig";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _enviodatoswebserviceurltrackingtxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 15;
return;
case 15:
//C
this.state = 9;
_sresponse = (String) result[0];
;
RDebugUtils.currentLine=94568479;
 //BA.debugLineNum = 94568479;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 9:
//if
this.state = 12;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=94568480;
 //BA.debugLineNum = 94568480;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=94568482;
 //BA.debugLineNum = 94568482;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = parent._xui.MsgboxAsync(ba,"Ha fallado la llamada al web service de TXT solicitando URL Tracking."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+_sresponse+".","Error");
RDebugUtils.currentLine=94568483;
 //BA.debugLineNum = 94568483;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerurltrazabilidadexpediciontxt"), _msa);
this.state = 16;
return;
case 16:
//C
this.state = 12;
_result = (int) result[0];
;
RDebugUtils.currentLine=94568484;
 //BA.debugLineNum = 94568484;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=94568485;
 //BA.debugLineNum = 94568485;BA.debugLine="mRes.Put(\"URL\",URL)";
_mres.Put((Object)("URL"),(Object)(_url));
RDebugUtils.currentLine=94568487;
 //BA.debugLineNum = 94568487;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=94568490;
 //BA.debugLineNum = 94568490;BA.debugLine="Log(\"sresponse URLTRacking\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894568490","sresponse URLTRacking",0);
RDebugUtils.currentLine=94568491;
 //BA.debugLineNum = 94568491;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894568491","",0);
RDebugUtils.currentLine=94568492;
 //BA.debugLineNum = 94568492;BA.debugLine="Log(sResponse)";
anywheresoftware.b4a.keywords.Common.LogImpl("894568492",_sresponse,0);
RDebugUtils.currentLine=94568494;
 //BA.debugLineNum = 94568494;BA.debugLine="Dim xm As Xml2Map";
_xm = new b4j.docU.xml2map();
RDebugUtils.currentLine=94568495;
 //BA.debugLineNum = 94568495;BA.debugLine="xm.Initialize";
_xm._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=94568496;
 //BA.debugLineNum = 94568496;BA.debugLine="Dim mParsedData As Map";
_mparseddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=94568497;
 //BA.debugLineNum = 94568497;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
_mparseddata = _xm._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sresponse);
RDebugUtils.currentLine=94568503;
 //BA.debugLineNum = 94568503;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
_menvelope = new anywheresoftware.b4a.objects.collections.Map();
_menvelope = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparseddata.Get((Object)("soap:Envelope"))));
RDebugUtils.currentLine=94568507;
 //BA.debugLineNum = 94568507;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
_mbody = new anywheresoftware.b4a.objects.collections.Map();
_mbody = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_menvelope.Get((Object)("soap:Body"))));
RDebugUtils.currentLine=94568511;
 //BA.debugLineNum = 94568511;BA.debugLine="Dim mURLTrackingResponse As Map=mBody.Get(\"UrlTra";
_murltrackingresponse = new anywheresoftware.b4a.objects.collections.Map();
_murltrackingresponse = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbody.Get((Object)("UrlTrackingResponse"))));
RDebugUtils.currentLine=94568515;
 //BA.debugLineNum = 94568515;BA.debugLine="Dim URLTrackingResult As String=mURLTrackingRespo";
_urltrackingresult = BA.ObjectToString(_murltrackingresponse.Get((Object)("UrlTrackingResult")));
RDebugUtils.currentLine=94568516;
 //BA.debugLineNum = 94568516;BA.debugLine="mRes.Put(\"Accion\",\"OK\")";
_mres.Put((Object)("Accion"),(Object)("OK"));
RDebugUtils.currentLine=94568517;
 //BA.debugLineNum = 94568517;BA.debugLine="mRes.Put(\"URL\",URLTrackingResult)";
_mres.Put((Object)("URL"),(Object)(_urltrackingresult));
RDebugUtils.currentLine=94568519;
 //BA.debugLineNum = 94568519;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=94568522;
 //BA.debugLineNum = 94568522;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerbuscarexpedicionesperiodotxt(String _fechadesde,String _fechahasta) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "obtenerbuscarexpedicionesperiodotxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenerbuscarexpedicionesperiodotxt", new Object[] {_fechadesde,_fechahasta}));}
ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT rsub = new ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT(null,_fechadesde,_fechahasta);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT extends BA.ResumableSub {
public ResumableSub_ObtenerBuscarExpedicionesPeriodoTXT(b4j.docU.cmauxtxt parent,String _fechadesde,String _fechahasta) {
this.parent = parent;
this._fechadesde = _fechadesde;
this._fechahasta = _fechahasta;
}
b4j.docU.cmauxtxt parent;
String _fechadesde;
String _fechahasta;
String _accion = "";
String _url = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _sresp = "";
String _sresponse = "";
Object _msa = null;
int _result = 0;
b4j.docU.xml2map _xm = null;
anywheresoftware.b4a.objects.collections.Map _mparseddata = null;
anywheresoftware.b4a.objects.collections.Map _menvelope = null;
anywheresoftware.b4a.objects.collections.Map _mbody = null;
anywheresoftware.b4a.objects.collections.Map _mbuscarexpedicionesresponse = null;
anywheresoftware.b4a.objects.collections.Map _mbuscarexpedicionesresult = null;
anywheresoftware.b4a.objects.collections.Map _mdiffgram = null;
anywheresoftware.b4a.objects.collections.Map _mexpediciones = null;
anywheresoftware.b4a.objects.collections.List _lstdatosexpediciones = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
String _ref1 = "";
anywheresoftware.b4a.BA.IterableList group39;
int index39;
int groupLen39;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=95551493;
 //BA.debugLineNum = 95551493;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=95551494;
 //BA.debugLineNum = 95551494;BA.debugLine="Dim URL As String";
_url = "";
RDebugUtils.currentLine=95551495;
 //BA.debugLineNum = 95551495;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=95551496;
 //BA.debugLineNum = 95551496;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=95551498;
 //BA.debugLineNum = 95551498;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerbuscarexpedicionesperiodotxt"), _cargacredencialestxt());
this.state = 25;
return;
case 25:
//C
this.state = 1;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=95551499;
 //BA.debugLineNum = 95551499;BA.debugLine="If sResp=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_sresp).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=95551500;
 //BA.debugLineNum = 95551500;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=95551501;
 //BA.debugLineNum = 95551501;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=95551504;
 //BA.debugLineNum = 95551504;BA.debugLine="Wait For(EnvioDatosWebServiceBuscarExpedicionesPe";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerbuscarexpedicionesperiodotxt"), _enviodatoswebservicebuscarexpedicionesperiodotxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_fechadesde,_fechahasta));
this.state = 26;
return;
case 26:
//C
this.state = 5;
_sresponse = (String) result[0];
;
RDebugUtils.currentLine=95551505;
 //BA.debugLineNum = 95551505;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=95551506;
 //BA.debugLineNum = 95551506;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=95551508;
 //BA.debugLineNum = 95551508;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = parent._xui.MsgboxAsync(ba,"Ha fallado la llamada al web service de TXT solicitando BuscarExpediciones."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+_sresponse+".","Error");
RDebugUtils.currentLine=95551509;
 //BA.debugLineNum = 95551509;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerbuscarexpedicionesperiodotxt"), _msa);
this.state = 27;
return;
case 27:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=95551510;
 //BA.debugLineNum = 95551510;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=95551511;
 //BA.debugLineNum = 95551511;BA.debugLine="mRes.Put(\"URL\",URL)";
_mres.Put((Object)("URL"),(Object)(_url));
RDebugUtils.currentLine=95551513;
 //BA.debugLineNum = 95551513;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=95551521;
 //BA.debugLineNum = 95551521;BA.debugLine="Log(\"sresponse BuscarExpediciones\")";
anywheresoftware.b4a.keywords.Common.LogImpl("895551521","sresponse BuscarExpediciones",0);
RDebugUtils.currentLine=95551522;
 //BA.debugLineNum = 95551522;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("895551522","",0);
RDebugUtils.currentLine=95551523;
 //BA.debugLineNum = 95551523;BA.debugLine="Log(sResponse)";
anywheresoftware.b4a.keywords.Common.LogImpl("895551523",_sresponse,0);
RDebugUtils.currentLine=95551525;
 //BA.debugLineNum = 95551525;BA.debugLine="Dim xm As Xml2Map";
_xm = new b4j.docU.xml2map();
RDebugUtils.currentLine=95551526;
 //BA.debugLineNum = 95551526;BA.debugLine="xm.Initialize";
_xm._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=95551527;
 //BA.debugLineNum = 95551527;BA.debugLine="Dim mParsedData As Map";
_mparseddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=95551528;
 //BA.debugLineNum = 95551528;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
_mparseddata = _xm._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sresponse);
RDebugUtils.currentLine=95551534;
 //BA.debugLineNum = 95551534;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
_menvelope = new anywheresoftware.b4a.objects.collections.Map();
_menvelope = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparseddata.Get((Object)("soap:Envelope"))));
RDebugUtils.currentLine=95551538;
 //BA.debugLineNum = 95551538;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
_mbody = new anywheresoftware.b4a.objects.collections.Map();
_mbody = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_menvelope.Get((Object)("soap:Body"))));
RDebugUtils.currentLine=95551542;
 //BA.debugLineNum = 95551542;BA.debugLine="Dim mBuscarExpedicionesResponse As Map=mBody.Get(";
_mbuscarexpedicionesresponse = new anywheresoftware.b4a.objects.collections.Map();
_mbuscarexpedicionesresponse = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbody.Get((Object)("BuscarExpedicionesResponse"))));
RDebugUtils.currentLine=95551546;
 //BA.debugLineNum = 95551546;BA.debugLine="Dim mBuscarExpedicionesResult As Map=mBuscarExped";
_mbuscarexpedicionesresult = new anywheresoftware.b4a.objects.collections.Map();
_mbuscarexpedicionesresult = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbuscarexpedicionesresponse.Get((Object)("BuscarExpedicionesResult"))));
RDebugUtils.currentLine=95551557;
 //BA.debugLineNum = 95551557;BA.debugLine="Dim mDiffgram As Map=mBuscarExpedicionesResult.ge";
_mdiffgram = new anywheresoftware.b4a.objects.collections.Map();
_mdiffgram = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbuscarexpedicionesresult.Get((Object)("diffgr:diffgram"))));
RDebugUtils.currentLine=95551559;
 //BA.debugLineNum = 95551559;BA.debugLine="If mDiffgram.ContainsKey(\"Expediciones\") Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_mdiffgram.ContainsKey((Object)("Expediciones"))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=95551560;
 //BA.debugLineNum = 95551560;BA.debugLine="Dim mExpediciones As Map=mDiffgram.Get(\"Expedici";
_mexpediciones = new anywheresoftware.b4a.objects.collections.Map();
_mexpediciones = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdiffgram.Get((Object)("Expediciones"))));
RDebugUtils.currentLine=95551561;
 //BA.debugLineNum = 95551561;BA.debugLine="Dim lstDatosExpediciones As List=GetElements(mEx";
_lstdatosexpediciones = new anywheresoftware.b4a.objects.collections.List();
_lstdatosexpediciones = _getelements(_mexpediciones,"Expediciones");
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=95551563;
 //BA.debugLineNum = 95551563;BA.debugLine="Dim lstDatosExpediciones As List";
_lstdatosexpediciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=95551564;
 //BA.debugLineNum = 95551564;BA.debugLine="lstDatosExpediciones.Initialize";
_lstdatosexpediciones.Initialize();
 if (true) break;

case 14:
//C
this.state = 15;
;
RDebugUtils.currentLine=95551566;
 //BA.debugLineNum = 95551566;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=95551568;
 //BA.debugLineNum = 95551568;BA.debugLine="For Each m As Map In lstDatosExpediciones";
if (true) break;

case 15:
//for
this.state = 24;
_m = new anywheresoftware.b4a.objects.collections.Map();
group39 = _lstdatosexpediciones;
index39 = 0;
groupLen39 = group39.getSize();
this.state = 28;
if (true) break;

case 28:
//C
this.state = 24;
if (index39 < groupLen39) {
this.state = 17;
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group39.Get(index39)));}
if (true) break;

case 29:
//C
this.state = 28;
index39++;
if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=95551569;
 //BA.debugLineNum = 95551569;BA.debugLine="Dim Ref1 As String=m.Get(\"Referencia_x0020_1\")";
_ref1 = BA.ObjectToString(_m.Get((Object)("Referencia_x0020_1")));
RDebugUtils.currentLine=95551570;
 //BA.debugLineNum = 95551570;BA.debugLine="If Ref1=\"{Attributes={xml:space=preserve}, Text=";
if (true) break;

case 18:
//if
this.state = 23;
if ((_ref1).equals("{Attributes={xml:space=preserve}, Text= }")) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_m.Put((Object)("Referencia_x0020_1"),(Object)(""));
if (true) break;

case 23:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
;
RDebugUtils.currentLine=95551575;
 //BA.debugLineNum = 95551575;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=95551576;
 //BA.debugLineNum = 95551576;BA.debugLine="mRes.Put(\"lstRes\",lstDatosExpediciones)";
_mres.Put((Object)("lstRes"),(Object)(_lstdatosexpediciones.getObject()));
RDebugUtils.currentLine=95551577;
 //BA.debugLineNum = 95551577;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=95551580;
 //BA.debugLineNum = 95551580;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerestadoexpediciontxt(String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "obtenerestadoexpediciontxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenerestadoexpediciontxt", new Object[] {_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
ResumableSub_ObtenerEstadoExpedicionTXT rsub = new ResumableSub_ObtenerEstadoExpedicionTXT(null,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerEstadoExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerEstadoExpedicionTXT(b4j.docU.cmauxtxt parent,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) {
this.parent = parent;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
b4j.docU.cmauxtxt parent;
String _codorigen;
String _coddestino;
int _nexped1;
int _nexped2;
String _ano;
String _accion = "";
String _url = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _sresp = "";
String _sresponse = "";
Object _msa = null;
int _result = 0;
b4j.docU.xml2map _xm = null;
anywheresoftware.b4a.objects.collections.Map _mparseddata = null;
anywheresoftware.b4a.objects.collections.Map _menvelope = null;
anywheresoftware.b4a.objects.collections.Map _mbody = null;
anywheresoftware.b4a.objects.collections.Map _mbuscarestadoresponse = null;
anywheresoftware.b4a.objects.collections.Map _mbuscarestadoresult = null;
anywheresoftware.b4a.objects.collections.Map _mdiffgram = null;
anywheresoftware.b4a.objects.collections.Map _mestados = null;
anywheresoftware.b4a.objects.collections.List _lstdatosestadosexpedicion = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94961666;
 //BA.debugLineNum = 94961666;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=94961667;
 //BA.debugLineNum = 94961667;BA.debugLine="Dim URL As String";
_url = "";
RDebugUtils.currentLine=94961668;
 //BA.debugLineNum = 94961668;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=94961669;
 //BA.debugLineNum = 94961669;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=94961671;
 //BA.debugLineNum = 94961671;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _cargacredencialestxt());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=94961672;
 //BA.debugLineNum = 94961672;BA.debugLine="If sResp=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_sresp).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=94961673;
 //BA.debugLineNum = 94961673;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=94961674;
 //BA.debugLineNum = 94961674;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=94961682;
 //BA.debugLineNum = 94961682;BA.debugLine="Wait For(EnvioDatosWebServiceBuscarEstadoExpedici";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _enviodatoswebservicebuscarestadoexpediciontxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_sresponse = (String) result[0];
;
RDebugUtils.currentLine=94961683;
 //BA.debugLineNum = 94961683;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=94961684;
 //BA.debugLineNum = 94961684;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=94961686;
 //BA.debugLineNum = 94961686;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = parent._xui.MsgboxAsync(ba,"Ha fallado la llamada al web service de TXT solicitando BuscarEstadoExpedicionTxT."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+_sresponse+".","Error");
RDebugUtils.currentLine=94961687;
 //BA.debugLineNum = 94961687;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=94961688;
 //BA.debugLineNum = 94961688;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=94961689;
 //BA.debugLineNum = 94961689;BA.debugLine="mRes.Put(\"URL\",URL)";
_mres.Put((Object)("URL"),(Object)(_url));
RDebugUtils.currentLine=94961691;
 //BA.debugLineNum = 94961691;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=94961699;
 //BA.debugLineNum = 94961699;BA.debugLine="Log(\"sresponse BuscarEstadoExpedicion\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894961699","sresponse BuscarEstadoExpedicion",0);
RDebugUtils.currentLine=94961700;
 //BA.debugLineNum = 94961700;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894961700","",0);
RDebugUtils.currentLine=94961701;
 //BA.debugLineNum = 94961701;BA.debugLine="Log(sResponse)";
anywheresoftware.b4a.keywords.Common.LogImpl("894961701",_sresponse,0);
RDebugUtils.currentLine=94961703;
 //BA.debugLineNum = 94961703;BA.debugLine="Dim xm As Xml2Map";
_xm = new b4j.docU.xml2map();
RDebugUtils.currentLine=94961704;
 //BA.debugLineNum = 94961704;BA.debugLine="xm.Initialize";
_xm._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=94961705;
 //BA.debugLineNum = 94961705;BA.debugLine="Dim mParsedData As Map";
_mparseddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=94961706;
 //BA.debugLineNum = 94961706;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
_mparseddata = _xm._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sresponse);
RDebugUtils.currentLine=94961712;
 //BA.debugLineNum = 94961712;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
_menvelope = new anywheresoftware.b4a.objects.collections.Map();
_menvelope = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparseddata.Get((Object)("soap:Envelope"))));
RDebugUtils.currentLine=94961716;
 //BA.debugLineNum = 94961716;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
_mbody = new anywheresoftware.b4a.objects.collections.Map();
_mbody = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_menvelope.Get((Object)("soap:Body"))));
RDebugUtils.currentLine=94961720;
 //BA.debugLineNum = 94961720;BA.debugLine="Dim mBuscarEstadoResponse As Map=mBody.Get(\"Busca";
_mbuscarestadoresponse = new anywheresoftware.b4a.objects.collections.Map();
_mbuscarestadoresponse = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbody.Get((Object)("BuscarEstadoResponse"))));
RDebugUtils.currentLine=94961724;
 //BA.debugLineNum = 94961724;BA.debugLine="Dim mBuscarEstadoResult As Map=mBuscarEstadoRespo";
_mbuscarestadoresult = new anywheresoftware.b4a.objects.collections.Map();
_mbuscarestadoresult = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbuscarestadoresponse.Get((Object)("BuscarEstadoResult"))));
RDebugUtils.currentLine=94961729;
 //BA.debugLineNum = 94961729;BA.debugLine="Dim mDiffgram As Map=mBuscarEstadoResult.get(\"dif";
_mdiffgram = new anywheresoftware.b4a.objects.collections.Map();
_mdiffgram = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbuscarestadoresult.Get((Object)("diffgr:diffgram"))));
RDebugUtils.currentLine=94961731;
 //BA.debugLineNum = 94961731;BA.debugLine="Dim mEstados As Map=mDiffgram.Get(\"ESTADO\")";
_mestados = new anywheresoftware.b4a.objects.collections.Map();
_mestados = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdiffgram.Get((Object)("ESTADO"))));
RDebugUtils.currentLine=94961733;
 //BA.debugLineNum = 94961733;BA.debugLine="If mEstados.IsInitialized=False Then  ' no datos";
if (true) break;

case 9:
//if
this.state = 14;
if (_mestados.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=94961734;
 //BA.debugLineNum = 94961734;BA.debugLine="Dim lstDatosEstadosExpedicion As List";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=94961735;
 //BA.debugLineNum = 94961735;BA.debugLine="lstDatosEstadosExpedicion.Initialize";
_lstdatosestadosexpedicion.Initialize();
RDebugUtils.currentLine=94961736;
 //BA.debugLineNum = 94961736;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No hay dato";
_msa = parent._xui.MsgboxAsync(ba,"No hay datos de estados para la expedicion seleccionada ("+_codorigen+_coddestino+BA.NumberToString(_nexped1)+BA.NumberToString(_nexped2)+_ano+") .","Aviso");
RDebugUtils.currentLine=94961737;
 //BA.debugLineNum = 94961737;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerestadoexpediciontxt"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=94961738;
 //BA.debugLineNum = 94961738;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=94961740;
 //BA.debugLineNum = 94961740;BA.debugLine="Dim lstDatosEstadosExpedicion As List=GetElement";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = _getelements(_mestados,"ESTADO");
RDebugUtils.currentLine=94961741;
 //BA.debugLineNum = 94961741;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=94961744;
 //BA.debugLineNum = 94961744;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=94961745;
 //BA.debugLineNum = 94961745;BA.debugLine="mRes.Put(\"lstRes\",lstDatosEstadosExpedicion)";
_mres.Put((Object)("lstRes"),(Object)(_lstdatosestadosexpedicion.getObject()));
RDebugUtils.currentLine=94961746;
 //BA.debugLineNum = 94961746;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=94961748;
 //BA.debugLineNum = 94961748;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerhistoricoestadosexpediciontxt(String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "obtenerhistoricoestadosexpediciontxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenerhistoricoestadosexpediciontxt", new Object[] {_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
ResumableSub_ObtenerHistoricoEstadosExpedicionTXT rsub = new ResumableSub_ObtenerHistoricoEstadosExpedicionTXT(null,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerHistoricoEstadosExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerHistoricoEstadosExpedicionTXT(b4j.docU.cmauxtxt parent,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) {
this.parent = parent;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
b4j.docU.cmauxtxt parent;
String _codorigen;
String _coddestino;
int _nexped1;
int _nexped2;
String _ano;
String _accion = "";
String _url = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _sresp = "";
String _sresponse = "";
Object _msa = null;
int _result = 0;
b4j.docU.xml2map _xm = null;
anywheresoftware.b4a.objects.collections.Map _mparseddata = null;
anywheresoftware.b4a.objects.collections.Map _menvelope = null;
anywheresoftware.b4a.objects.collections.Map _mbody = null;
anywheresoftware.b4a.objects.collections.Map _mbuscarhistoricoestadosresponse = null;
anywheresoftware.b4a.objects.collections.Map _mbuscarhistoricoestadosresult = null;
anywheresoftware.b4a.objects.collections.Map _mdiffgram = null;
anywheresoftware.b4a.objects.collections.Map _mestados = null;
anywheresoftware.b4a.objects.collections.List _lstdatosestadosexpedicion = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=95158274;
 //BA.debugLineNum = 95158274;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=95158275;
 //BA.debugLineNum = 95158275;BA.debugLine="Dim URL As String";
_url = "";
RDebugUtils.currentLine=95158276;
 //BA.debugLineNum = 95158276;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=95158277;
 //BA.debugLineNum = 95158277;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=95158279;
 //BA.debugLineNum = 95158279;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _cargacredencialestxt());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=95158280;
 //BA.debugLineNum = 95158280;BA.debugLine="If sResp=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_sresp).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=95158281;
 //BA.debugLineNum = 95158281;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=95158282;
 //BA.debugLineNum = 95158282;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=95158290;
 //BA.debugLineNum = 95158290;BA.debugLine="Wait For(EnvioDatosWebServiceBuscarHistoricoEstad";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _enviodatoswebservicebuscarhistoricoestadosexpediciontxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_sresponse = (String) result[0];
;
RDebugUtils.currentLine=95158291;
 //BA.debugLineNum = 95158291;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=95158292;
 //BA.debugLineNum = 95158292;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=95158294;
 //BA.debugLineNum = 95158294;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = parent._xui.MsgboxAsync(ba,"Ha fallado la llamada al web service de TXT solicitando URL Tracking."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+_sresponse+".","Error");
RDebugUtils.currentLine=95158295;
 //BA.debugLineNum = 95158295;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=95158296;
 //BA.debugLineNum = 95158296;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=95158297;
 //BA.debugLineNum = 95158297;BA.debugLine="mRes.Put(\"URL\",URL)";
_mres.Put((Object)("URL"),(Object)(_url));
RDebugUtils.currentLine=95158299;
 //BA.debugLineNum = 95158299;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=95158307;
 //BA.debugLineNum = 95158307;BA.debugLine="Log(\"sresponse BuscarHistoricoEstados\")";
anywheresoftware.b4a.keywords.Common.LogImpl("895158307","sresponse BuscarHistoricoEstados",0);
RDebugUtils.currentLine=95158308;
 //BA.debugLineNum = 95158308;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("895158308","",0);
RDebugUtils.currentLine=95158309;
 //BA.debugLineNum = 95158309;BA.debugLine="Log(sResponse)";
anywheresoftware.b4a.keywords.Common.LogImpl("895158309",_sresponse,0);
RDebugUtils.currentLine=95158311;
 //BA.debugLineNum = 95158311;BA.debugLine="Dim xm As Xml2Map";
_xm = new b4j.docU.xml2map();
RDebugUtils.currentLine=95158312;
 //BA.debugLineNum = 95158312;BA.debugLine="xm.Initialize";
_xm._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=95158313;
 //BA.debugLineNum = 95158313;BA.debugLine="Dim mParsedData As Map";
_mparseddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=95158314;
 //BA.debugLineNum = 95158314;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
_mparseddata = _xm._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sresponse);
RDebugUtils.currentLine=95158320;
 //BA.debugLineNum = 95158320;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
_menvelope = new anywheresoftware.b4a.objects.collections.Map();
_menvelope = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparseddata.Get((Object)("soap:Envelope"))));
RDebugUtils.currentLine=95158324;
 //BA.debugLineNum = 95158324;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
_mbody = new anywheresoftware.b4a.objects.collections.Map();
_mbody = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_menvelope.Get((Object)("soap:Body"))));
RDebugUtils.currentLine=95158328;
 //BA.debugLineNum = 95158328;BA.debugLine="Dim mBuscarHistoricoEstadosResponse As Map=mBody.";
_mbuscarhistoricoestadosresponse = new anywheresoftware.b4a.objects.collections.Map();
_mbuscarhistoricoestadosresponse = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbody.Get((Object)("BuscarHistoricoEstadosResponse"))));
RDebugUtils.currentLine=95158332;
 //BA.debugLineNum = 95158332;BA.debugLine="Dim mBuscarHistoricoEstadosResult As Map=mBuscarH";
_mbuscarhistoricoestadosresult = new anywheresoftware.b4a.objects.collections.Map();
_mbuscarhistoricoestadosresult = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbuscarhistoricoestadosresponse.Get((Object)("BuscarHistoricoEstadosResult"))));
RDebugUtils.currentLine=95158337;
 //BA.debugLineNum = 95158337;BA.debugLine="Dim mDiffgram As Map=mBuscarHistoricoEstadosResul";
_mdiffgram = new anywheresoftware.b4a.objects.collections.Map();
_mdiffgram = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbuscarhistoricoestadosresult.Get((Object)("diffgr:diffgram"))));
RDebugUtils.currentLine=95158339;
 //BA.debugLineNum = 95158339;BA.debugLine="Dim mEstados As Map=mDiffgram.Get(\"ESTADO\")";
_mestados = new anywheresoftware.b4a.objects.collections.Map();
_mestados = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdiffgram.Get((Object)("ESTADO"))));
RDebugUtils.currentLine=95158341;
 //BA.debugLineNum = 95158341;BA.debugLine="If mEstados.IsInitialized=False Then  ' no datos";
if (true) break;

case 9:
//if
this.state = 14;
if (_mestados.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=95158342;
 //BA.debugLineNum = 95158342;BA.debugLine="Dim lstDatosEstadosExpedicion As List";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=95158343;
 //BA.debugLineNum = 95158343;BA.debugLine="lstDatosEstadosExpedicion.Initialize";
_lstdatosestadosexpedicion.Initialize();
RDebugUtils.currentLine=95158344;
 //BA.debugLineNum = 95158344;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No hay dato";
_msa = parent._xui.MsgboxAsync(ba,"No hay datos de estados para la expedicion seleccionada.","Aviso");
RDebugUtils.currentLine=95158345;
 //BA.debugLineNum = 95158345;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerhistoricoestadosexpediciontxt"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=95158346;
 //BA.debugLineNum = 95158346;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=95158348;
 //BA.debugLineNum = 95158348;BA.debugLine="Dim lstDatosEstadosExpedicion As List=GetElement";
_lstdatosestadosexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosestadosexpedicion = _getelements(_mestados,"ESTADO");
RDebugUtils.currentLine=95158349;
 //BA.debugLineNum = 95158349;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=95158352;
 //BA.debugLineNum = 95158352;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=95158353;
 //BA.debugLineNum = 95158353;BA.debugLine="mRes.Put(\"lstRes\",lstDatosEstadosExpedicion)";
_mres.Put((Object)("lstRes"),(Object)(_lstdatosestadosexpedicion.getObject()));
RDebugUtils.currentLine=95158354;
 //BA.debugLineNum = 95158354;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=95158356;
 //BA.debugLineNum = 95158356;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerconsultaincidenciasexpediciontxt(String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "obtenerconsultaincidenciasexpediciontxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenerconsultaincidenciasexpediciontxt", new Object[] {_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT rsub = new ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT(null,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT extends BA.ResumableSub {
public ResumableSub_ObtenerConsultaIncidenciasExpedicionTXT(b4j.docU.cmauxtxt parent,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) {
this.parent = parent;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
b4j.docU.cmauxtxt parent;
String _codorigen;
String _coddestino;
int _nexped1;
int _nexped2;
String _ano;
String _accion = "";
String _url = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _sresp = "";
String _sresponse = "";
Object _msa = null;
int _result = 0;
b4j.docU.xml2map _xm = null;
anywheresoftware.b4a.objects.collections.Map _mparseddata = null;
anywheresoftware.b4a.objects.collections.Map _menvelope = null;
anywheresoftware.b4a.objects.collections.Map _mbody = null;
anywheresoftware.b4a.objects.collections.Map _mconsultaincidenciasresponse = null;
anywheresoftware.b4a.objects.collections.Map _mconsultaincidenciasresult = null;
anywheresoftware.b4a.objects.collections.Map _mdiffgram = null;
anywheresoftware.b4a.objects.collections.List _lstdatosincidenciasexpedicion = null;
anywheresoftware.b4a.objects.collections.Map _mincidencias = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=95354882;
 //BA.debugLineNum = 95354882;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=95354883;
 //BA.debugLineNum = 95354883;BA.debugLine="Dim URL As String";
_url = "";
RDebugUtils.currentLine=95354884;
 //BA.debugLineNum = 95354884;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=95354885;
 //BA.debugLineNum = 95354885;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=95354887;
 //BA.debugLineNum = 95354887;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _cargacredencialestxt());
this.state = 15;
return;
case 15:
//C
this.state = 1;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=95354888;
 //BA.debugLineNum = 95354888;BA.debugLine="If sResp=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_sresp).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=95354889;
 //BA.debugLineNum = 95354889;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=95354890;
 //BA.debugLineNum = 95354890;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=95354898;
 //BA.debugLineNum = 95354898;BA.debugLine="Wait For(EnvioDatosWebServiceConsultaIncidenciasE";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _enviodatoswebserviceconsultaincidenciasexpediciontxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt,_codorigen,_coddestino,_nexped1,_nexped2,_ano));
this.state = 16;
return;
case 16:
//C
this.state = 5;
_sresponse = (String) result[0];
;
RDebugUtils.currentLine=95354899;
 //BA.debugLineNum = 95354899;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=95354900;
 //BA.debugLineNum = 95354900;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=95354902;
 //BA.debugLineNum = 95354902;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = parent._xui.MsgboxAsync(ba,"Ha fallado la llamada al web service de TXT solicitando URL Tracking."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+_sresponse+".","Error");
RDebugUtils.currentLine=95354903;
 //BA.debugLineNum = 95354903;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _msa);
this.state = 17;
return;
case 17:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=95354904;
 //BA.debugLineNum = 95354904;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=95354905;
 //BA.debugLineNum = 95354905;BA.debugLine="mRes.Put(\"URL\",URL)";
_mres.Put((Object)("URL"),(Object)(_url));
RDebugUtils.currentLine=95354907;
 //BA.debugLineNum = 95354907;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=95354915;
 //BA.debugLineNum = 95354915;BA.debugLine="Log(\"sresponse ConsultaIncidencias\")";
anywheresoftware.b4a.keywords.Common.LogImpl("895354915","sresponse ConsultaIncidencias",0);
RDebugUtils.currentLine=95354916;
 //BA.debugLineNum = 95354916;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("895354916","",0);
RDebugUtils.currentLine=95354917;
 //BA.debugLineNum = 95354917;BA.debugLine="Log(sResponse)";
anywheresoftware.b4a.keywords.Common.LogImpl("895354917",_sresponse,0);
RDebugUtils.currentLine=95354919;
 //BA.debugLineNum = 95354919;BA.debugLine="Dim xm As Xml2Map";
_xm = new b4j.docU.xml2map();
RDebugUtils.currentLine=95354920;
 //BA.debugLineNum = 95354920;BA.debugLine="xm.Initialize";
_xm._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=95354921;
 //BA.debugLineNum = 95354921;BA.debugLine="Dim mParsedData As Map";
_mparseddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=95354922;
 //BA.debugLineNum = 95354922;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
_mparseddata = _xm._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sresponse);
RDebugUtils.currentLine=95354928;
 //BA.debugLineNum = 95354928;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
_menvelope = new anywheresoftware.b4a.objects.collections.Map();
_menvelope = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparseddata.Get((Object)("soap:Envelope"))));
RDebugUtils.currentLine=95354932;
 //BA.debugLineNum = 95354932;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
_mbody = new anywheresoftware.b4a.objects.collections.Map();
_mbody = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_menvelope.Get((Object)("soap:Body"))));
RDebugUtils.currentLine=95354936;
 //BA.debugLineNum = 95354936;BA.debugLine="Dim mConsultaIncidenciasResponse  As Map=mBody.Ge";
_mconsultaincidenciasresponse = new anywheresoftware.b4a.objects.collections.Map();
_mconsultaincidenciasresponse = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbody.Get((Object)("ConsultaIncidenciasResponse"))));
RDebugUtils.currentLine=95354940;
 //BA.debugLineNum = 95354940;BA.debugLine="Dim mConsultaIncidenciasResult As Map=mConsultaIn";
_mconsultaincidenciasresult = new anywheresoftware.b4a.objects.collections.Map();
_mconsultaincidenciasresult = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mconsultaincidenciasresponse.Get((Object)("ConsultaIncidenciasResult"))));
RDebugUtils.currentLine=95354950;
 //BA.debugLineNum = 95354950;BA.debugLine="Dim mDiffgram As Map=mConsultaIncidenciasResult.g";
_mdiffgram = new anywheresoftware.b4a.objects.collections.Map();
_mdiffgram = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mconsultaincidenciasresult.Get((Object)("diffgr:diffgram"))));
RDebugUtils.currentLine=95354952;
 //BA.debugLineNum = 95354952;BA.debugLine="If mDiffgram.ContainsKey(\"Incidencias\")=False The";
if (true) break;

case 9:
//if
this.state = 14;
if (_mdiffgram.ContainsKey((Object)("Incidencias"))==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=95354953;
 //BA.debugLineNum = 95354953;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List";
_lstdatosincidenciasexpedicion = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=95354954;
 //BA.debugLineNum = 95354954;BA.debugLine="lstDatosIncidenciasExpedicion.Initialize";
_lstdatosincidenciasexpedicion.Initialize();
RDebugUtils.currentLine=95354955;
 //BA.debugLineNum = 95354955;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"No hay dato";
_msa = parent._xui.MsgboxAsync(ba,"No hay datos de incidencias para la expedicion seleccionada.","Aviso");
RDebugUtils.currentLine=95354956;
 //BA.debugLineNum = 95354956;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerconsultaincidenciasexpediciontxt"), _msa);
this.state = 18;
return;
case 18:
//C
this.state = 14;
_result = (int) result[0];
;
RDebugUtils.currentLine=95354957;
 //BA.debugLineNum = 95354957;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=95354959;
 //BA.debugLineNum = 95354959;BA.debugLine="Dim mIncidencias As Map=mDiffgram.Get(\"Incidenci";
_mincidencias = new anywheresoftware.b4a.objects.collections.Map();
_mincidencias = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdiffgram.Get((Object)("Incidencias"))));
RDebugUtils.currentLine=95354960;
 //BA.debugLineNum = 95354960;BA.debugLine="Dim lstDatosIncidenciasExpedicion As List=GetEle";
_lstdatosincidenciasexpedicion = new anywheresoftware.b4a.objects.collections.List();
_lstdatosincidenciasexpedicion = _getelements(_mincidencias,"Incidencias");
RDebugUtils.currentLine=95354961;
 //BA.debugLineNum = 95354961;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=95354964;
 //BA.debugLineNum = 95354964;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=95354965;
 //BA.debugLineNum = 95354965;BA.debugLine="mRes.Put(\"lstRes\",lstDatosIncidenciasExpedicion)";
_mres.Put((Object)("lstRes"),(Object)(_lstdatosincidenciasexpedicion.getObject()));
RDebugUtils.currentLine=95354966;
 //BA.debugLineNum = 95354966;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=95354968;
 //BA.debugLineNum = 95354968;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _obtenerexpedicionessinentregartxt() throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "obtenerexpedicionessinentregartxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "obtenerexpedicionessinentregartxt", null));}
ResumableSub_ObtenerExpedicionesSinEntregarTXT rsub = new ResumableSub_ObtenerExpedicionesSinEntregarTXT(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ObtenerExpedicionesSinEntregarTXT extends BA.ResumableSub {
public ResumableSub_ObtenerExpedicionesSinEntregarTXT(b4j.docU.cmauxtxt parent) {
this.parent = parent;
}
b4j.docU.cmauxtxt parent;
String _accion = "";
String _url = "";
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _sresp = "";
String _sresponse = "";
Object _msa = null;
int _result = 0;
anywheresoftware.b4a.objects.collections.List _lstdatosexpediciones = null;
b4j.docU.xml2map _xm = null;
anywheresoftware.b4a.objects.collections.Map _mparseddata = null;
anywheresoftware.b4a.objects.collections.Map _menvelope = null;
anywheresoftware.b4a.objects.collections.Map _mbody = null;
anywheresoftware.b4a.objects.collections.Map _mexpedicionessinentregarresponse = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _mexpedicionessinentregarresult = null;
anywheresoftware.b4a.objects.collections.Map _mdiffgram = null;
anywheresoftware.b4a.objects.collections.Map _mexpediciones = null;
anywheresoftware.b4a.BA.IterableList group31;
int index31;
int groupLen31;
anywheresoftware.b4a.BA.IterableList group36;
int index36;
int groupLen36;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94765061;
 //BA.debugLineNum = 94765061;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=94765062;
 //BA.debugLineNum = 94765062;BA.debugLine="Dim URL As String";
_url = "";
RDebugUtils.currentLine=94765063;
 //BA.debugLineNum = 94765063;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=94765064;
 //BA.debugLineNum = 94765064;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=94765066;
 //BA.debugLineNum = 94765066;BA.debugLine="wait for(CargaCredencialesTXT) complete (sResp As";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerexpedicionessinentregartxt"), _cargacredencialestxt());
this.state = 26;
return;
case 26:
//C
this.state = 1;
_sresp = (String) result[0];
;
RDebugUtils.currentLine=94765067;
 //BA.debugLineNum = 94765067;BA.debugLine="If sResp=\"NOK\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_sresp).equals("NOK")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=94765068;
 //BA.debugLineNum = 94765068;BA.debugLine="mRes.Put(\"Accion\",\"NOK\")";
_mres.Put((Object)("Accion"),(Object)("NOK"));
RDebugUtils.currentLine=94765069;
 //BA.debugLineNum = 94765069;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=94765072;
 //BA.debugLineNum = 94765072;BA.debugLine="Wait For(EnvioDatosWebServiceExpedicionesSinEntre";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerexpedicionessinentregartxt"), _enviodatoswebserviceexpedicionessinentregartxt(BA.NumberToString(parent._codigoclientetxt),parent._usertxt,parent._pswtxt,parent._tokenwebtxt));
this.state = 27;
return;
case 27:
//C
this.state = 5;
_sresponse = (String) result[0];
;
RDebugUtils.currentLine=94765073;
 //BA.debugLineNum = 94765073;BA.debugLine="If sResponse.StartsWith(\"ERROR HTTPJob\") Then  '";
if (true) break;

case 5:
//if
this.state = 8;
if (_sresponse.startsWith("ERROR HTTPJob")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
RDebugUtils.currentLine=94765074;
 //BA.debugLineNum = 94765074;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
RDebugUtils.currentLine=94765077;
 //BA.debugLineNum = 94765077;BA.debugLine="Dim msa As Object = xui.MsgboxAsync(\"Ha fallado";
_msa = parent._xui.MsgboxAsync(ba,"Ha fallado la llamada al web service de TXT solicitando URL Tracking."+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+_sresponse+".","Error");
RDebugUtils.currentLine=94765078;
 //BA.debugLineNum = 94765078;BA.debugLine="Wait For (msa) Msgbox_Result (Result As Int)";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "obtenerexpedicionessinentregartxt"), _msa);
this.state = 28;
return;
case 28:
//C
this.state = 8;
_result = (int) result[0];
;
RDebugUtils.currentLine=94765079;
 //BA.debugLineNum = 94765079;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=94765080;
 //BA.debugLineNum = 94765080;BA.debugLine="mRes.Put(\"URL\",URL)";
_mres.Put((Object)("URL"),(Object)(_url));
RDebugUtils.currentLine=94765082;
 //BA.debugLineNum = 94765082;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
 if (true) break;

case 8:
//C
this.state = 9;
;
RDebugUtils.currentLine=94765090;
 //BA.debugLineNum = 94765090;BA.debugLine="Log(\"sresponse Expediciones Sin Entregar\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894765090","sresponse Expediciones Sin Entregar",0);
RDebugUtils.currentLine=94765091;
 //BA.debugLineNum = 94765091;BA.debugLine="Log(\"\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894765091","",0);
RDebugUtils.currentLine=94765092;
 //BA.debugLineNum = 94765092;BA.debugLine="Log(sResponse)";
anywheresoftware.b4a.keywords.Common.LogImpl("894765092",_sresponse,0);
RDebugUtils.currentLine=94765094;
 //BA.debugLineNum = 94765094;BA.debugLine="Dim lstDatosExpediciones As List";
_lstdatosexpediciones = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=94765095;
 //BA.debugLineNum = 94765095;BA.debugLine="lstDatosExpediciones.Initialize";
_lstdatosexpediciones.Initialize();
RDebugUtils.currentLine=94765097;
 //BA.debugLineNum = 94765097;BA.debugLine="Dim xm As Xml2Map";
_xm = new b4j.docU.xml2map();
RDebugUtils.currentLine=94765098;
 //BA.debugLineNum = 94765098;BA.debugLine="xm.Initialize";
_xm._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=94765099;
 //BA.debugLineNum = 94765099;BA.debugLine="Dim mParsedData As Map";
_mparseddata = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=94765100;
 //BA.debugLineNum = 94765100;BA.debugLine="mParsedData = xm.Parse(sResponse)  '";
_mparseddata = _xm._parse /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sresponse);
RDebugUtils.currentLine=94765106;
 //BA.debugLineNum = 94765106;BA.debugLine="Dim mEnvelope As Map=mParsedData.get(\"soap:Envelo";
_menvelope = new anywheresoftware.b4a.objects.collections.Map();
_menvelope = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mparseddata.Get((Object)("soap:Envelope"))));
RDebugUtils.currentLine=94765110;
 //BA.debugLineNum = 94765110;BA.debugLine="Dim mBody As Map=mEnvelope.get(\"soap:Body\")";
_mbody = new anywheresoftware.b4a.objects.collections.Map();
_mbody = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_menvelope.Get((Object)("soap:Body"))));
RDebugUtils.currentLine=94765114;
 //BA.debugLineNum = 94765114;BA.debugLine="Dim mExpedicionesSinEntregarResponse As Map=mBody";
_mexpedicionessinentregarresponse = new anywheresoftware.b4a.objects.collections.Map();
_mexpedicionessinentregarresponse = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mbody.Get((Object)("ExpedicionesSinEntregarResponse"))));
RDebugUtils.currentLine=94765115;
 //BA.debugLineNum = 94765115;BA.debugLine="For Each k As String In mExpedicionesSinEntregarR";
if (true) break;

case 9:
//for
this.state = 12;
group31 = _mexpedicionessinentregarresponse.Keys();
index31 = 0;
groupLen31 = group31.getSize();
this.state = 29;
if (true) break;

case 29:
//C
this.state = 12;
if (index31 < groupLen31) {
this.state = 11;
_k = BA.ObjectToString(group31.Get(index31));}
if (true) break;

case 30:
//C
this.state = 29;
index31++;
if (true) break;

case 11:
//C
this.state = 30;
RDebugUtils.currentLine=94765116;
 //BA.debugLineNum = 94765116;BA.debugLine="Log(\"mExpedicionesSinEntregarResponse: \" & k & \"";
anywheresoftware.b4a.keywords.Common.LogImpl("894765116","mExpedicionesSinEntregarResponse: "+_k+": "+BA.ObjectToString(_mexpedicionessinentregarresponse.Get((Object)(_k))),0);
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=94765118;
 //BA.debugLineNum = 94765118;BA.debugLine="If mExpedicionesSinEntregarResponse.ContainsKey(\"";

case 12:
//if
this.state = 25;
if (_mexpedicionessinentregarresponse.ContainsKey((Object)("ExpedicionesSinEntregarResult"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=94765119;
 //BA.debugLineNum = 94765119;BA.debugLine="Dim mExpedicionesSinEntregarResult As Map=mExped";
_mexpedicionessinentregarresult = new anywheresoftware.b4a.objects.collections.Map();
_mexpedicionessinentregarresult = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mexpedicionessinentregarresponse.Get((Object)("ExpedicionesSinEntregarResult"))));
RDebugUtils.currentLine=94765120;
 //BA.debugLineNum = 94765120;BA.debugLine="For Each k As String In mExpedicionesSinEntregar";
if (true) break;

case 15:
//for
this.state = 18;
group36 = _mexpedicionessinentregarresult.Keys();
index36 = 0;
groupLen36 = group36.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 18;
if (index36 < groupLen36) {
this.state = 17;
_k = BA.ObjectToString(group36.Get(index36));}
if (true) break;

case 32:
//C
this.state = 31;
index36++;
if (true) break;

case 17:
//C
this.state = 32;
RDebugUtils.currentLine=94765121;
 //BA.debugLineNum = 94765121;BA.debugLine="Log(\"mExpedicionesSinEntregarResult: \" & k & \":";
anywheresoftware.b4a.keywords.Common.LogImpl("894765121","mExpedicionesSinEntregarResult: "+_k+": "+BA.ObjectToString(_mexpedicionessinentregarresult.Get((Object)(_k))),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = 19;
;
RDebugUtils.currentLine=94765124;
 //BA.debugLineNum = 94765124;BA.debugLine="Dim mDiffgram As Map=mExpedicionesSinEntregarRes";
_mdiffgram = new anywheresoftware.b4a.objects.collections.Map();
_mdiffgram = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mexpedicionessinentregarresult.Get((Object)("diffgr:diffgram"))));
RDebugUtils.currentLine=94765126;
 //BA.debugLineNum = 94765126;BA.debugLine="If mDiffgram.ContainsKey(\"EXPEDICIONES\")=False T";
if (true) break;

case 19:
//if
this.state = 24;
if (_mdiffgram.ContainsKey((Object)("EXPEDICIONES"))==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 21;
}else {
this.state = 23;
}if (true) break;

case 21:
//C
this.state = 24;
RDebugUtils.currentLine=94765127;
 //BA.debugLineNum = 94765127;BA.debugLine="Log(\"Sin Expediciones pendientes\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894765127","Sin Expediciones pendientes",0);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=94765129;
 //BA.debugLineNum = 94765129;BA.debugLine="Dim mExpediciones As Map=mDiffgram.get(\"EXPEDIC";
_mexpediciones = new anywheresoftware.b4a.objects.collections.Map();
_mexpediciones = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_mdiffgram.Get((Object)("EXPEDICIONES"))));
RDebugUtils.currentLine=94765130;
 //BA.debugLineNum = 94765130;BA.debugLine="Log(\"Hay Expediciones pendientes\")";
anywheresoftware.b4a.keywords.Common.LogImpl("894765130","Hay Expediciones pendientes",0);
RDebugUtils.currentLine=94765140;
 //BA.debugLineNum = 94765140;BA.debugLine="lstDatosExpediciones=GetElements(mExpediciones,";
_lstdatosexpediciones = _getelements(_mexpediciones,"EXPEDICIONES");
 if (true) break;

case 24:
//C
this.state = 25;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=94765144;
 //BA.debugLineNum = 94765144;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
RDebugUtils.currentLine=94765146;
 //BA.debugLineNum = 94765146;BA.debugLine="mRes.Put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=94765147;
 //BA.debugLineNum = 94765147;BA.debugLine="mRes.Put(\"lstRes\",lstDatosExpediciones)";
_mres.Put((Object)("lstRes"),(Object)(_lstdatosexpediciones.getObject()));
RDebugUtils.currentLine=94765148;
 //BA.debugLineNum = 94765148;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=94765151;
 //BA.debugLineNum = 94765151;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargacredencialestxt() throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "cargacredencialestxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargacredencialestxt", null));}
ResumableSub_CargaCredencialesTXT rsub = new ResumableSub_CargaCredencialesTXT(null);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaCredencialesTXT extends BA.ResumableSub {
public ResumableSub_CargaCredencialesTXT(b4j.docU.cmauxtxt parent) {
this.parent = parent;
}
b4j.docU.cmauxtxt parent;
int _codigotransportista = 0;
anywheresoftware.b4a.objects.collections.Map _mres = null;
String _accion = "";
Object _msa = null;
anywheresoftware.b4a.objects.collections.List _lstres = null;
anywheresoftware.b4a.objects.collections.Map _mcred = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94502913;
 //BA.debugLineNum = 94502913;BA.debugLine="Dim CodigoTransportista As Int=7";
_codigotransportista = (int) (7);
RDebugUtils.currentLine=94502916;
 //BA.debugLineNum = 94502916;BA.debugLine="wait for (CargaDatosWebServiceTransporte(CodigoTr";
anywheresoftware.b4a.keywords.Common.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "cargacredencialestxt"), _cargadatoswebservicetransporte(_codigotransportista));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_mres = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=94502917;
 //BA.debugLineNum = 94502917;BA.debugLine="Dim Accion As String=mRes.Get(\"Accion\")";
_accion = BA.ObjectToString(_mres.Get((Object)("Accion")));
RDebugUtils.currentLine=94502918;
 //BA.debugLineNum = 94502918;BA.debugLine="If Accion=\"NOK\" Then";
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
RDebugUtils.currentLine=94502919;
 //BA.debugLineNum = 94502919;BA.debugLine="Dim msa As Object=xui.MsgboxAsync(\"Error credenc";
_msa = parent._xui.MsgboxAsync(ba,"Error credenciales TXT","Error");
RDebugUtils.currentLine=94502920;
 //BA.debugLineNum = 94502920;BA.debugLine="Wait For (msa) Msgbox_Result";
anywheresoftware.b4a.keywords.Common.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "cargacredencialestxt"), _msa);
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=94502921;
 //BA.debugLineNum = 94502921;BA.debugLine="Return \"NOK\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("NOK"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=94502923;
 //BA.debugLineNum = 94502923;BA.debugLine="Dim lstRes As List=mRes.Get(\"lstRes\")";
_lstres = new anywheresoftware.b4a.objects.collections.List();
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mres.Get((Object)("lstRes"))));
RDebugUtils.currentLine=94502924;
 //BA.debugLineNum = 94502924;BA.debugLine="Dim mCred As Map=lstRes.Get(0)";
_mcred = new anywheresoftware.b4a.objects.collections.Map();
_mcred = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lstres.Get((int) (0))));
RDebugUtils.currentLine=94502925;
 //BA.debugLineNum = 94502925;BA.debugLine="UserTXT=mCred.Get(\"UsuarioWS\")";
parent._usertxt = BA.ObjectToString(_mcred.Get((Object)("UsuarioWS")));
RDebugUtils.currentLine=94502926;
 //BA.debugLineNum = 94502926;BA.debugLine="PswTXT=mCred.Get(\"PasswordWS\")";
parent._pswtxt = BA.ObjectToString(_mcred.Get((Object)("PasswordWS")));
RDebugUtils.currentLine=94502928;
 //BA.debugLineNum = 94502928;BA.debugLine="TokenWebTXT=mCred.Get(\"TokenWeb\")";
parent._tokenwebtxt = BA.ObjectToString(_mcred.Get((Object)("TokenWeb")));
RDebugUtils.currentLine=94502929;
 //BA.debugLineNum = 94502929;BA.debugLine="Return \"OK\"";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)("OK"));return;};
RDebugUtils.currentLine=94502930;
 //BA.debugLineNum = 94502930;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _cargadatoswebservicetransporte(int _idtransportista) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "cargadatoswebservicetransporte", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "cargadatoswebservicetransporte", new Object[] {_idtransportista}));}
ResumableSub_CargaDatosWebServiceTransporte rsub = new ResumableSub_CargaDatosWebServiceTransporte(null,_idtransportista);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CargaDatosWebServiceTransporte extends BA.ResumableSub {
public ResumableSub_CargaDatosWebServiceTransporte(b4j.docU.cmauxtxt parent,int _idtransportista) {
this.parent = parent;
this._idtransportista = _idtransportista;
}
b4j.docU.cmauxtxt parent;
int _idtransportista;
String _accion = "";
anywheresoftware.b4a.objects.collections.List _lstres = null;
String _comandojrdc = "";
anywheresoftware.b4a.objects.collections.Map _mresult = null;
anywheresoftware.b4a.objects.collections.Map _mres = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94437378;
 //BA.debugLineNum = 94437378;BA.debugLine="Dim Accion As String";
_accion = "";
RDebugUtils.currentLine=94437379;
 //BA.debugLineNum = 94437379;BA.debugLine="Dim lstRes As List";
_lstres = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=94437380;
 //BA.debugLineNum = 94437380;BA.debugLine="lstRes.Initialize";
_lstres.Initialize();
RDebugUtils.currentLine=94437381;
 //BA.debugLineNum = 94437381;BA.debugLine="Dim ComandoJRDC As String";
_comandojrdc = "";
RDebugUtils.currentLine=94437382;
 //BA.debugLineNum = 94437382;BA.debugLine="ComandoJRDC=\"DatosWebServiceTransporte\"";
_comandojrdc = "DatosWebServiceTransporte";
RDebugUtils.currentLine=94437383;
 //BA.debugLineNum = 94437383;BA.debugLine="JRDCQuery.DatosJRDC(Main.rdclinkMySqlDatosComunes";
parent._jrdcquery._datosjrdc /*void*/ (parent._main._rdclinkmysqldatoscomunes /*String*/ ,_comandojrdc,(Object[])(new String[]{BA.NumberToString(_idtransportista)}),cmauxtxt.getObject());
RDebugUtils.currentLine=94437384;
 //BA.debugLineNum = 94437384;BA.debugLine="Wait For DatosJRDC_Completed (mresult As Map)";
anywheresoftware.b4a.keywords.Common.WaitFor("datosjrdc_completed", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "cargadatoswebservicetransporte"), null);
this.state = 13;
return;
case 13:
//C
this.state = 1;
_mresult = (anywheresoftware.b4a.objects.collections.Map) result[0];
;
RDebugUtils.currentLine=94437385;
 //BA.debugLineNum = 94437385;BA.debugLine="If mresult.Get(\"ConnOK\")=False Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_mresult.Get((Object)("ConnOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=94437386;
 //BA.debugLineNum = 94437386;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=94437388;
 //BA.debugLineNum = 94437388;BA.debugLine="If mresult.Get(\"ReqOK\")=False Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_mresult.Get((Object)("ReqOK"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=94437389;
 //BA.debugLineNum = 94437389;BA.debugLine="Accion=\"NOK\"";
_accion = "NOK";
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=94437391;
 //BA.debugLineNum = 94437391;BA.debugLine="lstRes=mresult.Get(\"lstRes\")";
_lstres = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_mresult.Get((Object)("lstRes"))));
RDebugUtils.currentLine=94437392;
 //BA.debugLineNum = 94437392;BA.debugLine="Accion=\"OK\"";
_accion = "OK";
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
RDebugUtils.currentLine=94437395;
 //BA.debugLineNum = 94437395;BA.debugLine="Dim mRes As Map";
_mres = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=94437396;
 //BA.debugLineNum = 94437396;BA.debugLine="mRes.Initialize";
_mres.Initialize();
RDebugUtils.currentLine=94437397;
 //BA.debugLineNum = 94437397;BA.debugLine="mRes.put(\"Accion\",Accion)";
_mres.Put((Object)("Accion"),(Object)(_accion));
RDebugUtils.currentLine=94437398;
 //BA.debugLineNum = 94437398;BA.debugLine="mRes.put(\"lstRes\",lstRes)";
_mres.Put((Object)("lstRes"),(Object)(_lstres.getObject()));
RDebugUtils.currentLine=94437399;
 //BA.debugLineNum = 94437399;BA.debugLine="Return mRes";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_mres));return;};
RDebugUtils.currentLine=94437401;
 //BA.debugLineNum = 94437401;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebservicebuscarestadoexpediciontxt(String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "enviodatoswebservicebuscarestadoexpediciontxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebservicebuscarestadoexpediciontxt", new Object[] {_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT rsub = new ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceBuscarEstadoExpedicionTxT(b4j.docU.cmauxtxt parent,String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
b4j.docU.cmauxtxt parent;
String _codcliente;
String _user;
String _pwd;
String _tokenweb;
String _codorigen;
String _coddestino;
int _nexped1;
int _nexped2;
String _ano;
String _xml = "";
b4j.docU.httpjob _job = null;
String _urlwebservicetxt = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=95027203;
 //BA.debugLineNum = 95027203;BA.debugLine="Dim xml As String=XmlSoapBuscarEstadoExpedicionTx";
_xml = _xmlsoapbuscarestadoexpediciontxt("001",(int)(Double.parseDouble(_codcliente)),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
RDebugUtils.currentLine=95027206;
 //BA.debugLineNum = 95027206;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=95027207;
 //BA.debugLineNum = 95027207;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",cmauxtxt.getObject());
RDebugUtils.currentLine=95027208;
 //BA.debugLineNum = 95027208;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
_urlwebservicetxt = "http://ws.txt.es/webserviceTXT.asmx";
RDebugUtils.currentLine=95027209;
 //BA.debugLineNum = 95027209;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
_job._poststring /*String*/ (null,_urlwebservicetxt,_xml);
RDebugUtils.currentLine=95027210;
 //BA.debugLineNum = 95027210;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/soap+xml");
RDebugUtils.currentLine=95027211;
 //BA.debugLineNum = 95027211;BA.debugLine="job.GetRequest.Timeout=30000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (30000));
RDebugUtils.currentLine=95027213;
 //BA.debugLineNum = 95027213;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "enviodatoswebservicebuscarestadoexpediciontxt"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=95027214;
 //BA.debugLineNum = 95027214;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=95027215;
 //BA.debugLineNum = 95027215;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
anywheresoftware.b4a.keywords.Common.LogImpl("895027215","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=95027217;
 //BA.debugLineNum = 95027217;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=95027218;
 //BA.debugLineNum = 95027218;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95027219;
 //BA.debugLineNum = 95027219;BA.debugLine="Return sRespuestaWebService";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=95027221;
 //BA.debugLineNum = 95027221;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=95027222;
 //BA.debugLineNum = 95027222;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95027223;
 //BA.debugLineNum = 95027223;BA.debugLine="Return sErrorJobResponse";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=95027225;
 //BA.debugLineNum = 95027225;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xmlsoapbuscarestadoexpediciontxt(String _codempresa,int _codcliente,String _usuario,String _passw,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "xmlsoapbuscarestadoexpediciontxt", false))
	 {return ((String) Debug.delegate(ba, "xmlsoapbuscarestadoexpediciontxt", new Object[] {_codempresa,_codcliente,_usuario,_passw,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
String _xlmstr = "";
RDebugUtils.currentLine=95092736;
 //BA.debugLineNum = 95092736;BA.debugLine="Sub XmlSoapBuscarEstadoExpedicionTxT(CodEmpresa As";
RDebugUtils.currentLine=95092739;
 //BA.debugLineNum = 95092739;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
_xlmstr = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"  <soap12:Header>\n"+"	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"      <CodCliente>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codcliente))+"</CodCliente>\n"+"      <Usuario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usuario))+"</Usuario>\n"+"      <Password>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_passw))+"</Password>\n"+"      <Token>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tokenweb))+"</Token>\n"+"	</cLoginCredential>\n"+"  </soap12:Header>\n"+"  <soap12:Body>\n"+"    <BuscarEstado xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"		<CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"		<CodOrigen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codorigen))+"</CodOrigen>\n"+"		<CodDestin>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_coddestino))+"</CodDestin>\n"+"		<Nexped1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_nexped1))+"</Nexped1>\n"+"		<Nexped2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nexped2))+"</Nexped2>\n"+"		<Ano>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ano))+"</Ano>\n"+"    </BuscarEstado>\n"+"  </soap12:Body>\n"+"</soap12:Envelope>");
RDebugUtils.currentLine=95092761;
 //BA.debugLineNum = 95092761;BA.debugLine="Return xlmStr";
if (true) return _xlmstr;
RDebugUtils.currentLine=95092762;
 //BA.debugLineNum = 95092762;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebservicebuscarexpedicionesperiodotxt(String _codcliente,String _user,String _pwd,String _tokenweb,String _fechadesde,String _fechahasta) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "enviodatoswebservicebuscarexpedicionesperiodotxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebservicebuscarexpedicionesperiodotxt", new Object[] {_codcliente,_user,_pwd,_tokenweb,_fechadesde,_fechahasta}));}
ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT rsub = new ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT(null,_codcliente,_user,_pwd,_tokenweb,_fechadesde,_fechahasta);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceBuscarExpedicionesPeriodoTxT(b4j.docU.cmauxtxt parent,String _codcliente,String _user,String _pwd,String _tokenweb,String _fechadesde,String _fechahasta) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._fechadesde = _fechadesde;
this._fechahasta = _fechahasta;
}
b4j.docU.cmauxtxt parent;
String _codcliente;
String _user;
String _pwd;
String _tokenweb;
String _fechadesde;
String _fechahasta;
String _xml = "";
b4j.docU.httpjob _job = null;
String _urlwebservicetxt = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=95617027;
 //BA.debugLineNum = 95617027;BA.debugLine="Dim xml As String=XmlSoapBuscarExpedicionesPeriod";
_xml = _xmlsoapbuscarexpedicionesperiodotxt("001",(int)(Double.parseDouble(_codcliente)),_user,_pwd,_tokenweb,_fechadesde,_fechahasta);
RDebugUtils.currentLine=95617030;
 //BA.debugLineNum = 95617030;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=95617031;
 //BA.debugLineNum = 95617031;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",cmauxtxt.getObject());
RDebugUtils.currentLine=95617032;
 //BA.debugLineNum = 95617032;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
_urlwebservicetxt = "http://ws.txt.es/webserviceTXT.asmx";
RDebugUtils.currentLine=95617033;
 //BA.debugLineNum = 95617033;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
_job._poststring /*String*/ (null,_urlwebservicetxt,_xml);
RDebugUtils.currentLine=95617034;
 //BA.debugLineNum = 95617034;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/soap+xml");
RDebugUtils.currentLine=95617035;
 //BA.debugLineNum = 95617035;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=95617037;
 //BA.debugLineNum = 95617037;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "enviodatoswebservicebuscarexpedicionesperiodotxt"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=95617038;
 //BA.debugLineNum = 95617038;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=95617039;
 //BA.debugLineNum = 95617039;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
anywheresoftware.b4a.keywords.Common.LogImpl("895617039","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=95617041;
 //BA.debugLineNum = 95617041;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=95617042;
 //BA.debugLineNum = 95617042;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95617043;
 //BA.debugLineNum = 95617043;BA.debugLine="Return sRespuestaWebService";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=95617045;
 //BA.debugLineNum = 95617045;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=95617046;
 //BA.debugLineNum = 95617046;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95617047;
 //BA.debugLineNum = 95617047;BA.debugLine="Return sErrorJobResponse";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=95617049;
 //BA.debugLineNum = 95617049;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xmlsoapbuscarexpedicionesperiodotxt(String _codempresa,int _codcliente,String _usuario,String _passw,String _tokenweb,String _fechadesde,String _fechahasta) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "xmlsoapbuscarexpedicionesperiodotxt", false))
	 {return ((String) Debug.delegate(ba, "xmlsoapbuscarexpedicionesperiodotxt", new Object[] {_codempresa,_codcliente,_usuario,_passw,_tokenweb,_fechadesde,_fechahasta}));}
String _xlmstr = "";
RDebugUtils.currentLine=95682560;
 //BA.debugLineNum = 95682560;BA.debugLine="Sub XmlSoapBuscarExpedicionesPeriodoTxT(CodEmpresa";
RDebugUtils.currentLine=95682563;
 //BA.debugLineNum = 95682563;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
_xlmstr = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"  <soap12:Header>\n"+"	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"      <CodCliente>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codcliente))+"</CodCliente>\n"+"      <Usuario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usuario))+"</Usuario>\n"+"      <Password>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_passw))+"</Password>\n"+"      <Token>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tokenweb))+"</Token>\n"+"	</cLoginCredential>\n"+"  </soap12:Header>\n"+"  <soap12:Body>\n"+"    <BuscarExpediciones xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <FechaDesde>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fechadesde))+"</FechaDesde>\n"+"      <FechaHasta>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_fechahasta))+"</FechaHasta>\n"+"    </BuscarExpediciones>\n"+"  </soap12:Body>\n"+"</soap12:Envelope>");
RDebugUtils.currentLine=95682581;
 //BA.debugLineNum = 95682581;BA.debugLine="Return xlmStr";
if (true) return _xlmstr;
RDebugUtils.currentLine=95682582;
 //BA.debugLineNum = 95682582;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebservicebuscarhistoricoestadosexpediciontxt(String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "enviodatoswebservicebuscarhistoricoestadosexpediciontxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebservicebuscarhistoricoestadosexpediciontxt", new Object[] {_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT rsub = new ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceBuscarHistoricoEstadosExpedicionTxT(b4j.docU.cmauxtxt parent,String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
b4j.docU.cmauxtxt parent;
String _codcliente;
String _user;
String _pwd;
String _tokenweb;
String _codorigen;
String _coddestino;
int _nexped1;
int _nexped2;
String _ano;
String _xml = "";
b4j.docU.httpjob _job = null;
String _urlwebservicetxt = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=95223811;
 //BA.debugLineNum = 95223811;BA.debugLine="Dim xml As String=XmlSoapBuscarHistoricoEstadosEx";
_xml = _xmlsoapbuscarhistoricoestadosexpediciontxt("001",(int)(Double.parseDouble(_codcliente)),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
RDebugUtils.currentLine=95223814;
 //BA.debugLineNum = 95223814;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=95223815;
 //BA.debugLineNum = 95223815;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",cmauxtxt.getObject());
RDebugUtils.currentLine=95223816;
 //BA.debugLineNum = 95223816;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
_urlwebservicetxt = "http://ws.txt.es/webserviceTXT.asmx";
RDebugUtils.currentLine=95223817;
 //BA.debugLineNum = 95223817;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
_job._poststring /*String*/ (null,_urlwebservicetxt,_xml);
RDebugUtils.currentLine=95223818;
 //BA.debugLineNum = 95223818;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/soap+xml");
RDebugUtils.currentLine=95223819;
 //BA.debugLineNum = 95223819;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=95223821;
 //BA.debugLineNum = 95223821;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "enviodatoswebservicebuscarhistoricoestadosexpediciontxt"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=95223822;
 //BA.debugLineNum = 95223822;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=95223823;
 //BA.debugLineNum = 95223823;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
anywheresoftware.b4a.keywords.Common.LogImpl("895223823","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=95223825;
 //BA.debugLineNum = 95223825;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=95223826;
 //BA.debugLineNum = 95223826;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95223827;
 //BA.debugLineNum = 95223827;BA.debugLine="Return sRespuestaWebService";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=95223829;
 //BA.debugLineNum = 95223829;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=95223830;
 //BA.debugLineNum = 95223830;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95223831;
 //BA.debugLineNum = 95223831;BA.debugLine="Return sErrorJobResponse";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=95223833;
 //BA.debugLineNum = 95223833;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xmlsoapbuscarhistoricoestadosexpediciontxt(String _codempresa,int _codcliente,String _usuario,String _passw,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "xmlsoapbuscarhistoricoestadosexpediciontxt", false))
	 {return ((String) Debug.delegate(ba, "xmlsoapbuscarhistoricoestadosexpediciontxt", new Object[] {_codempresa,_codcliente,_usuario,_passw,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
String _xlmstr = "";
RDebugUtils.currentLine=95289344;
 //BA.debugLineNum = 95289344;BA.debugLine="Sub XmlSoapBuscarHistoricoEstadosExpedicionTxT(Cod";
RDebugUtils.currentLine=95289347;
 //BA.debugLineNum = 95289347;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
_xlmstr = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"  <soap12:Header>\n"+"	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"      <CodCliente>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codcliente))+"</CodCliente>\n"+"      <Usuario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usuario))+"</Usuario>\n"+"      <Password>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_passw))+"</Password>\n"+"      <Token>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tokenweb))+"</Token>\n"+"	</cLoginCredential>\n"+"  </soap12:Header>\n"+"  <soap12:Body>\n"+"    <BuscarHistoricoEstados xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"		<CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"		<CodOrigen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codorigen))+"</CodOrigen>\n"+"		<CodDestin>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_coddestino))+"</CodDestin>\n"+"		<Nexped1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_nexped1))+"</Nexped1>\n"+"		<Nexped2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nexped2))+"</Nexped2>\n"+"		<Ano>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ano))+"</Ano>\n"+"    </BuscarHistoricoEstados>\n"+"  </soap12:Body>\n"+"</soap12:Envelope>");
RDebugUtils.currentLine=95289369;
 //BA.debugLineNum = 95289369;BA.debugLine="Return xlmStr";
if (true) return _xlmstr;
RDebugUtils.currentLine=95289370;
 //BA.debugLineNum = 95289370;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebserviceconsultaincidenciasexpediciontxt(String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "enviodatoswebserviceconsultaincidenciasexpediciontxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebserviceconsultaincidenciasexpediciontxt", new Object[] {_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT rsub = new ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceConsultaIncidenciasExpedicionTxT(b4j.docU.cmauxtxt parent,String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
b4j.docU.cmauxtxt parent;
String _codcliente;
String _user;
String _pwd;
String _tokenweb;
String _codorigen;
String _coddestino;
int _nexped1;
int _nexped2;
String _ano;
String _xml = "";
b4j.docU.httpjob _job = null;
String _urlwebservicetxt = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=95420419;
 //BA.debugLineNum = 95420419;BA.debugLine="Dim xml As String=XmlSoapConsultaIncidenciasExped";
_xml = _xmlsoapconsultaincidenciasexpediciontxt("001",(int)(Double.parseDouble(_codcliente)),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
RDebugUtils.currentLine=95420422;
 //BA.debugLineNum = 95420422;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=95420423;
 //BA.debugLineNum = 95420423;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",cmauxtxt.getObject());
RDebugUtils.currentLine=95420424;
 //BA.debugLineNum = 95420424;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
_urlwebservicetxt = "http://ws.txt.es/webserviceTXT.asmx";
RDebugUtils.currentLine=95420425;
 //BA.debugLineNum = 95420425;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
_job._poststring /*String*/ (null,_urlwebservicetxt,_xml);
RDebugUtils.currentLine=95420426;
 //BA.debugLineNum = 95420426;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/soap+xml");
RDebugUtils.currentLine=95420427;
 //BA.debugLineNum = 95420427;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=95420429;
 //BA.debugLineNum = 95420429;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "enviodatoswebserviceconsultaincidenciasexpediciontxt"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=95420430;
 //BA.debugLineNum = 95420430;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=95420431;
 //BA.debugLineNum = 95420431;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
anywheresoftware.b4a.keywords.Common.LogImpl("895420431","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=95420433;
 //BA.debugLineNum = 95420433;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=95420434;
 //BA.debugLineNum = 95420434;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95420435;
 //BA.debugLineNum = 95420435;BA.debugLine="Return sRespuestaWebService";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=95420437;
 //BA.debugLineNum = 95420437;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=95420438;
 //BA.debugLineNum = 95420438;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=95420439;
 //BA.debugLineNum = 95420439;BA.debugLine="Return sErrorJobResponse";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=95420441;
 //BA.debugLineNum = 95420441;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xmlsoapconsultaincidenciasexpediciontxt(String _codempresa,int _codcliente,String _usuario,String _passw,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,int _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "xmlsoapconsultaincidenciasexpediciontxt", false))
	 {return ((String) Debug.delegate(ba, "xmlsoapconsultaincidenciasexpediciontxt", new Object[] {_codempresa,_codcliente,_usuario,_passw,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
String _xlmstr = "";
RDebugUtils.currentLine=95485952;
 //BA.debugLineNum = 95485952;BA.debugLine="Sub XmlSoapConsultaIncidenciasExpedicionTxT(CodEmp";
RDebugUtils.currentLine=95485955;
 //BA.debugLineNum = 95485955;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
_xlmstr = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"  <soap12:Body>\n"+"    <ConsultaIncidencias xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"      <CodCliente>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codcliente))+"</CodCliente>\n"+"      <Usuario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usuario))+"</Usuario>\n"+"      <Password>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_passw))+"</Password>\n"+"      <Token>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tokenweb))+"</Token>\n"+"      <CodOrigen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codorigen))+"</CodOrigen>\n"+"      <CodDestin>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_coddestino))+"</CodDestin>\n"+"      <Nexped1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_nexped1))+"</Nexped1>\n"+"      <Nexped2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nexped2))+"</Nexped2>\n"+"      <Ano>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ano))+"</Ano>\n"+"    </ConsultaIncidencias>\n"+"  </soap12:Body>\n"+"</soap12:Envelope>");
RDebugUtils.currentLine=95485972;
 //BA.debugLineNum = 95485972;BA.debugLine="Return xlmStr";
if (true) return _xlmstr;
RDebugUtils.currentLine=95485973;
 //BA.debugLineNum = 95485973;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebserviceexpedicionessinentregartxt(String _codcliente,String _user,String _pwd,String _tokenweb) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "enviodatoswebserviceexpedicionessinentregartxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebserviceexpedicionessinentregartxt", new Object[] {_codcliente,_user,_pwd,_tokenweb}));}
ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT rsub = new ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT(null,_codcliente,_user,_pwd,_tokenweb);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceExpedicionesSinEntregarTxT(b4j.docU.cmauxtxt parent,String _codcliente,String _user,String _pwd,String _tokenweb) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
}
b4j.docU.cmauxtxt parent;
String _codcliente;
String _user;
String _pwd;
String _tokenweb;
String _xml = "";
b4j.docU.httpjob _job = null;
String _urlwebservicetxt = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94830594;
 //BA.debugLineNum = 94830594;BA.debugLine="Dim xml As String=XmlSoapExpedicionesSinEntregarT";
_xml = _xmlsoapexpedicionessinentregartxt("001",(int)(Double.parseDouble(_codcliente)),_user,_pwd,_tokenweb);
RDebugUtils.currentLine=94830596;
 //BA.debugLineNum = 94830596;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=94830597;
 //BA.debugLineNum = 94830597;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",cmauxtxt.getObject());
RDebugUtils.currentLine=94830598;
 //BA.debugLineNum = 94830598;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
_urlwebservicetxt = "http://ws.txt.es/webserviceTXT.asmx";
RDebugUtils.currentLine=94830599;
 //BA.debugLineNum = 94830599;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
_job._poststring /*String*/ (null,_urlwebservicetxt,_xml);
RDebugUtils.currentLine=94830600;
 //BA.debugLineNum = 94830600;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/soap+xml");
RDebugUtils.currentLine=94830601;
 //BA.debugLineNum = 94830601;BA.debugLine="job.GetRequest.Timeout=30000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (30000));
RDebugUtils.currentLine=94830603;
 //BA.debugLineNum = 94830603;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "enviodatoswebserviceexpedicionessinentregartxt"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=94830604;
 //BA.debugLineNum = 94830604;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=94830605;
 //BA.debugLineNum = 94830605;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
anywheresoftware.b4a.keywords.Common.LogImpl("894830605","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=94830607;
 //BA.debugLineNum = 94830607;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=94830608;
 //BA.debugLineNum = 94830608;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=94830609;
 //BA.debugLineNum = 94830609;BA.debugLine="Return sRespuestaWebService";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=94830611;
 //BA.debugLineNum = 94830611;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=94830612;
 //BA.debugLineNum = 94830612;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=94830613;
 //BA.debugLineNum = 94830613;BA.debugLine="Return sErrorJobResponse";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=94830615;
 //BA.debugLineNum = 94830615;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xmlsoapexpedicionessinentregartxt(String _codempresa,int _codcliente,String _usuario,String _passw,String _tokenweb) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "xmlsoapexpedicionessinentregartxt", false))
	 {return ((String) Debug.delegate(ba, "xmlsoapexpedicionessinentregartxt", new Object[] {_codempresa,_codcliente,_usuario,_passw,_tokenweb}));}
String _xlmstr = "";
RDebugUtils.currentLine=94896128;
 //BA.debugLineNum = 94896128;BA.debugLine="Sub XmlSoapExpedicionesSinEntregarTxT(CodEmpresa A";
RDebugUtils.currentLine=94896129;
 //BA.debugLineNum = 94896129;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
_xlmstr = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"  <soap12:Header>\n"+"	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"      <CodCliente>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codcliente))+"</CodCliente>\n"+"      <Usuario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usuario))+"</Usuario>\n"+"      <Password>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_passw))+"</Password>\n"+"      <Token>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tokenweb))+"</Token>\n"+"	</cLoginCredential>\n"+"  </soap12:Header>\n"+"  <soap12:Body>\n"+"    <ExpedicionesSinEntregar xmlns=\"https://ws.txt.es/webserviceTXT.asmx\" />\n"+"  </soap12:Body>\n"+"</soap12:Envelope>");
RDebugUtils.currentLine=94896144;
 //BA.debugLineNum = 94896144;BA.debugLine="Return xlmStr";
if (true) return _xlmstr;
RDebugUtils.currentLine=94896145;
 //BA.debugLineNum = 94896145;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _enviodatoswebserviceurltrackingtxt(String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,String _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "enviodatoswebserviceurltrackingtxt", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "enviodatoswebserviceurltrackingtxt", new Object[] {_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
ResumableSub_EnvioDatosWebServiceURLTrackingTxT rsub = new ResumableSub_EnvioDatosWebServiceURLTrackingTxT(null,_codcliente,_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_EnvioDatosWebServiceURLTrackingTxT extends BA.ResumableSub {
public ResumableSub_EnvioDatosWebServiceURLTrackingTxT(b4j.docU.cmauxtxt parent,String _codcliente,String _user,String _pwd,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,String _nexped2,String _ano) {
this.parent = parent;
this._codcliente = _codcliente;
this._user = _user;
this._pwd = _pwd;
this._tokenweb = _tokenweb;
this._codorigen = _codorigen;
this._coddestino = _coddestino;
this._nexped1 = _nexped1;
this._nexped2 = _nexped2;
this._ano = _ano;
}
b4j.docU.cmauxtxt parent;
String _codcliente;
String _user;
String _pwd;
String _tokenweb;
String _codorigen;
String _coddestino;
int _nexped1;
String _nexped2;
String _ano;
String _xml = "";
b4j.docU.httpjob _job = null;
String _urlwebservicetxt = "";
b4j.docU.httpjob _j = null;
String _srespuestawebservice = "";
String _serrorjobresponse = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cmauxtxt";

    while (true) {
        switch (state) {
            case -1:
{
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=94633987;
 //BA.debugLineNum = 94633987;BA.debugLine="Dim xml As String=XmlSoapURLTrackingTxT(\"001\",Cod";
_xml = _xmlsoapurltrackingtxt("001",(int)(Double.parseDouble(_codcliente)),_user,_pwd,_tokenweb,_codorigen,_coddestino,_nexped1,(long)(Double.parseDouble(_nexped2)),_ano);
RDebugUtils.currentLine=94633990;
 //BA.debugLineNum = 94633990;BA.debugLine="Dim job As HttpJob";
_job = new b4j.docU.httpjob();
RDebugUtils.currentLine=94633991;
 //BA.debugLineNum = 94633991;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize /*String*/ (null,ba,"",cmauxtxt.getObject());
RDebugUtils.currentLine=94633992;
 //BA.debugLineNum = 94633992;BA.debugLine="Dim URLWebServiceTXT As String=\"http://ws.txt.es/";
_urlwebservicetxt = "http://ws.txt.es/webserviceTXT.asmx";
RDebugUtils.currentLine=94633993;
 //BA.debugLineNum = 94633993;BA.debugLine="job.PostString(URLWebServiceTXT, xml)";
_job._poststring /*String*/ (null,_urlwebservicetxt,_xml);
RDebugUtils.currentLine=94633994;
 //BA.debugLineNum = 94633994;BA.debugLine="job.GetRequest.SetContentType(\"application/soap+x";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/soap+xml");
RDebugUtils.currentLine=94633995;
 //BA.debugLineNum = 94633995;BA.debugLine="job.GetRequest.Timeout=15000";
_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).setTimeout((int) (15000));
RDebugUtils.currentLine=94633997;
 //BA.debugLineNum = 94633997;BA.debugLine="Wait For (job) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cmauxtxt", "enviodatoswebserviceurltrackingtxt"), (Object)(_job));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4j.docU.httpjob) result[0];
;
RDebugUtils.currentLine=94633998;
 //BA.debugLineNum = 94633998;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=94633999;
 //BA.debugLineNum = 94633999;BA.debugLine="Log(\"job.response.StatusCode: \" & job.response.S";
anywheresoftware.b4a.keywords.Common.LogImpl("894633999","job.response.StatusCode: "+BA.NumberToString(_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/ .getStatusCode()),0);
RDebugUtils.currentLine=94634001;
 //BA.debugLineNum = 94634001;BA.debugLine="Dim sRespuestaWebService As String=j.GetString";
_srespuestawebservice = _j._getstring /*String*/ (null);
RDebugUtils.currentLine=94634002;
 //BA.debugLineNum = 94634002;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=94634003;
 //BA.debugLineNum = 94634003;BA.debugLine="Return sRespuestaWebService";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_srespuestawebservice));return;};
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=94634005;
 //BA.debugLineNum = 94634005;BA.debugLine="Dim sErrorJobResponse As String=\"ERROR HTTPJob \"";
_serrorjobresponse = "ERROR HTTPJob "+_j._errormessage /*String*/ ;
RDebugUtils.currentLine=94634006;
 //BA.debugLineNum = 94634006;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=94634007;
 //BA.debugLineNum = 94634007;BA.debugLine="Return sErrorJobResponse";
if (true) {
anywheresoftware.b4a.keywords.Common.ReturnFromResumableSub(this,(Object)(_serrorjobresponse));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=94634009;
 //BA.debugLineNum = 94634009;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _xmlsoapurltrackingtxt(String _codempresa,int _codcliente,String _usuario,String _passw,String _tokenweb,String _codorigen,String _coddestino,int _nexped1,long _nexped2,String _ano) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "xmlsoapurltrackingtxt", false))
	 {return ((String) Debug.delegate(ba, "xmlsoapurltrackingtxt", new Object[] {_codempresa,_codcliente,_usuario,_passw,_tokenweb,_codorigen,_coddestino,_nexped1,_nexped2,_ano}));}
String _xlmstr = "";
RDebugUtils.currentLine=94699520;
 //BA.debugLineNum = 94699520;BA.debugLine="Sub XmlSoapURLTrackingTxT(CodEmpresa As String, Co";
RDebugUtils.currentLine=94699522;
 //BA.debugLineNum = 94699522;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
_xlmstr = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"	<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"	<soap12:Header>\n"+"	<cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"      <CodCliente>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codcliente))+"</CodCliente>\n"+"      <Usuario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usuario))+"</Usuario>\n"+"      <Password>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_passw))+"</Password>\n"+"      <Token>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tokenweb))+"</Token>\n"+"	</cLoginCredential>\n"+"	</soap12:Header>\n"+"	<soap12:Body>\n"+"	<UrlTracking xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"	<CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"	<CodOrigen>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codorigen))+"</CodOrigen>\n"+"	<CodDestin>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_coddestino))+"</CodDestin>\n"+"	<Nexped1>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_nexped1))+"</Nexped1>\n"+"	<Nexped2>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_nexped2))+"</Nexped2>\n"+"	<Ano>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_ano))+"</Ano>\n"+"	</UrlTracking>\n"+"	</soap12:Body>\n"+"	</soap12:Envelope>");
RDebugUtils.currentLine=94699544;
 //BA.debugLineNum = 94699544;BA.debugLine="Return xlmStr";
if (true) return _xlmstr;
RDebugUtils.currentLine=94699545;
 //BA.debugLineNum = 94699545;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _getelements(anywheresoftware.b4a.objects.collections.Map _m,String _key) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "getelements", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getelements", new Object[] {_m,_key}));}
anywheresoftware.b4a.objects.collections.List _res = null;
Object _value = null;
RDebugUtils.currentLine=94371840;
 //BA.debugLineNum = 94371840;BA.debugLine="Sub GetElements (m As Map, key As String) As List";
RDebugUtils.currentLine=94371841;
 //BA.debugLineNum = 94371841;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=94371842;
 //BA.debugLineNum = 94371842;BA.debugLine="If m.ContainsKey(key) = False Then";
if (_m.ContainsKey((Object)(_key))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=94371843;
 //BA.debugLineNum = 94371843;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=94371844;
 //BA.debugLineNum = 94371844;BA.debugLine="Return res";
if (true) return _res;
 }else {
RDebugUtils.currentLine=94371846;
 //BA.debugLineNum = 94371846;BA.debugLine="Dim value As Object = m.Get(key)";
_value = _m.Get((Object)(_key));
RDebugUtils.currentLine=94371847;
 //BA.debugLineNum = 94371847;BA.debugLine="If value Is List Then Return value";
if (_value instanceof java.util.List) { 
if (true) return (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_value));};
RDebugUtils.currentLine=94371848;
 //BA.debugLineNum = 94371848;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=94371849;
 //BA.debugLineNum = 94371849;BA.debugLine="res.Add(value)";
_res.Add(_value);
RDebugUtils.currentLine=94371850;
 //BA.debugLineNum = 94371850;BA.debugLine="Return res";
if (true) return _res;
 };
RDebugUtils.currentLine=94371852;
 //BA.debugLineNum = 94371852;BA.debugLine="End Sub";
return null;
}
public static String  _xmlsoapexpediciones_incidenciasexpediciontxt(String _codempresa,int _codcliente,String _usuario,String _passw,String _tokenweb,long _idexpedicion) throws Exception{
RDebugUtils.currentModule="cmauxtxt";
if (Debug.shouldDelegate(ba, "xmlsoapexpediciones_incidenciasexpediciontxt", false))
	 {return ((String) Debug.delegate(ba, "xmlsoapexpediciones_incidenciasexpediciontxt", new Object[] {_codempresa,_codcliente,_usuario,_passw,_tokenweb,_idexpedicion}));}
String _xlmstr = "";
RDebugUtils.currentLine=95748096;
 //BA.debugLineNum = 95748096;BA.debugLine="Sub XmlSoapExpediciones_IncidenciasExpedicionTxT(C";
RDebugUtils.currentLine=95748098;
 //BA.debugLineNum = 95748098;BA.debugLine="Dim xlmStr As String=$\"<?xml version=\"1.0\" encodi";
_xlmstr = ("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"+"<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n"+"  <soap12:Header>\n"+"    <cLoginCredential xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <CodEmpresa>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_codempresa))+"</CodEmpresa>\n"+"      <CodCliente>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_codcliente))+"</CodCliente>\n"+"      <Usuario>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_usuario))+"</Usuario>\n"+"      <Password>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_passw))+"</Password>\n"+"      <Token>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_tokenweb))+"</Token>\n"+"    </cLoginCredential>ººº\n"+"  </soap12:Header>\n"+"  <soap12:Body>\n"+"    <Expediciones_Incidencias xmlns=\"https://ws.txt.es/webserviceTXT.asmx\">\n"+"      <IdExpedicion>"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("1.0",(Object)(_idexpedicion))+"</IdExpedicion>\n"+"    </Expediciones_Incidencias>\n"+"  </soap12:Body>\n"+"</soap12:Envelope>");
RDebugUtils.currentLine=95748115;
 //BA.debugLineNum = 95748115;BA.debugLine="Return xlmStr";
if (true) return _xlmstr;
RDebugUtils.currentLine=95748116;
 //BA.debugLineNum = 95748116;BA.debugLine="End Sub";
return "";
}
}