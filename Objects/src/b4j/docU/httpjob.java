package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.httpjob", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _invalidurl = "";
public String _defaultscheme = "";
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
public String  _initialize(b4j.docU.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=211288064;
 //BA.debugLineNum = 211288064;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=211288065;
 //BA.debugLineNum = 211288065;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=211288066;
 //BA.debugLineNum = 211288066;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=211288067;
 //BA.debugLineNum = 211288067;BA.debugLine="End Sub";
return "";
}
public String  _download(b4j.docU.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=212074496;
 //BA.debugLineNum = 212074496;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=212074497;
 //BA.debugLineNum = 212074497;BA.debugLine="Try";
try {RDebugUtils.currentLine=212074498;
 //BA.debugLineNum = 212074498;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=212074499;
 //BA.debugLineNum = 212074499;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=212074501;
 //BA.debugLineNum = 212074501;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9212074501",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=212074502;
 //BA.debugLineNum = 212074502;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=212074504;
 //BA.debugLineNum = 212074504;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=212074505;
 //BA.debugLineNum = 212074505;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4j.docU.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=212795392;
 //BA.debugLineNum = 212795392;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=212795393;
 //BA.debugLineNum = 212795393;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=212795394;
 //BA.debugLineNum = 212795394;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=212795395;
 //BA.debugLineNum = 212795395;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=212795396;
 //BA.debugLineNum = 212795396;BA.debugLine="End Sub";
return null;
}
public String  _release(b4j.docU.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release", true))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=212402176;
 //BA.debugLineNum = 212402176;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=212402178;
 //BA.debugLineNum = 212402178;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=212402180;
 //BA.debugLineNum = 212402180;BA.debugLine="End Sub";
return "";
}
public String  _postbytes(b4j.docU.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=211484672;
 //BA.debugLineNum = 211484672;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=211484673;
 //BA.debugLineNum = 211484673;BA.debugLine="Try";
try {RDebugUtils.currentLine=211484674;
 //BA.debugLineNum = 211484674;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=211484675;
 //BA.debugLineNum = 211484675;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=211484677;
 //BA.debugLineNum = 211484677;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9211484677",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=211484678;
 //BA.debugLineNum = 211484678;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=211484680;
 //BA.debugLineNum = 211484680;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=211484681;
 //BA.debugLineNum = 211484681;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4j.docU.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=212598784;
 //BA.debugLineNum = 212598784;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=212598785;
 //BA.debugLineNum = 212598785;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=212598786;
 //BA.debugLineNum = 212598786;BA.debugLine="End Sub";
return null;
}
public String  _poststring(b4j.docU.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=211419136;
 //BA.debugLineNum = 211419136;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=211419137;
 //BA.debugLineNum = 211419137;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=211419138;
 //BA.debugLineNum = 211419138;BA.debugLine="End Sub";
return "";
}
public String  _getstring(b4j.docU.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=212467712;
 //BA.debugLineNum = 212467712;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=212467713;
 //BA.debugLineNum = 212467713;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=212467714;
 //BA.debugLineNum = 212467714;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _getbitmap(b4j.docU.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _b = null;
RDebugUtils.currentLine=212729856;
 //BA.debugLineNum = 212729856;BA.debugLine="Public Sub GetBitmap As Image";
RDebugUtils.currentLine=212729857;
 //BA.debugLineNum = 212729857;BA.debugLine="Dim b As Image";
_b = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=212729858;
 //BA.debugLineNum = 212729858;BA.debugLine="b = fx.LoadImage(HttpUtils2Service.TempFolder, ta";
_b = __ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImage(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=212729859;
 //BA.debugLineNum = 212729859;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=212729860;
 //BA.debugLineNum = 212729860;BA.debugLine="End Sub";
return null;
}
public String  _complete(b4j.docU.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=212664320;
 //BA.debugLineNum = 212664320;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=212664321;
 //BA.debugLineNum = 212664321;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=212664322;
 //BA.debugLineNum = 212664322;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=212664323;
 //BA.debugLineNum = 212664323;BA.debugLine="End Sub";
return "";
}
public String  _addscheme(b4j.docU.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=211353600;
 //BA.debugLineNum = 211353600;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=211353601;
 //BA.debugLineNum = 211353601;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=211353602;
 //BA.debugLineNum = 211353602;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=211353603;
 //BA.debugLineNum = 211353603;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=211222528;
 //BA.debugLineNum = 211222528;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=211222529;
 //BA.debugLineNum = 211222529;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=211222530;
 //BA.debugLineNum = 211222530;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=211222531;
 //BA.debugLineNum = 211222531;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=211222532;
 //BA.debugLineNum = 211222532;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=211222533;
 //BA.debugLineNum = 211222533;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=211222539;
 //BA.debugLineNum = 211222539;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=211222541;
 //BA.debugLineNum = 211222541;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=211222542;
 //BA.debugLineNum = 211222542;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=211222551;
 //BA.debugLineNum = 211222551;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=211222552;
 //BA.debugLineNum = 211222552;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=211222554;
 //BA.debugLineNum = 211222554;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=211222556;
 //BA.debugLineNum = 211222556;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=211222557;
 //BA.debugLineNum = 211222557;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=211222558;
 //BA.debugLineNum = 211222558;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4j.docU.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=212271104;
 //BA.debugLineNum = 212271104;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=212271105;
 //BA.debugLineNum = 212271105;BA.debugLine="Try";
try {RDebugUtils.currentLine=212271106;
 //BA.debugLineNum = 212271106;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=212271107;
 //BA.debugLineNum = 212271107;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=212271109;
 //BA.debugLineNum = 212271109;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9212271109",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=212271110;
 //BA.debugLineNum = 212271110;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=212271112;
 //BA.debugLineNum = 212271112;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=212271113;
 //BA.debugLineNum = 212271113;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4j.docU.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=212336640;
 //BA.debugLineNum = 212336640;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=212336641;
 //BA.debugLineNum = 212336641;BA.debugLine="Try";
try {RDebugUtils.currentLine=212336642;
 //BA.debugLineNum = 212336642;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=212336643;
 //BA.debugLineNum = 212336643;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=212336645;
 //BA.debugLineNum = 212336645;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9212336645",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=212336646;
 //BA.debugLineNum = 212336646;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=212336648;
 //BA.debugLineNum = 212336648;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=212336649;
 //BA.debugLineNum = 212336649;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4j.docU.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink", true))
	 {return ((String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=212205568;
 //BA.debugLineNum = 212205568;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=212205569;
 //BA.debugLineNum = 212205569;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=212205570;
 //BA.debugLineNum = 212205570;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=212205571;
 //BA.debugLineNum = 212205571;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=212205572;
 //BA.debugLineNum = 212205572;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=212205573;
 //BA.debugLineNum = 212205573;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=212205574;
 //BA.debugLineNum = 212205574;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=212205575;
 //BA.debugLineNum = 212205575;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=212205576;
 //BA.debugLineNum = 212205576;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=212205577;
 //BA.debugLineNum = 212205577;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=212205579;
 //BA.debugLineNum = 212205579;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=212205580;
 //BA.debugLineNum = 212205580;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4j.docU.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=212140032;
 //BA.debugLineNum = 212140032;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=212140033;
 //BA.debugLineNum = 212140033;BA.debugLine="Try";
try {RDebugUtils.currentLine=212140034;
 //BA.debugLineNum = 212140034;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=212140035;
 //BA.debugLineNum = 212140035;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=212140037;
 //BA.debugLineNum = 212140037;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9212140037",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=212140038;
 //BA.debugLineNum = 212140038;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=212140040;
 //BA.debugLineNum = 212140040;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=212140041;
 //BA.debugLineNum = 212140041;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(b4j.docU.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=212533248;
 //BA.debugLineNum = 212533248;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=212533252;
 //BA.debugLineNum = 212533252;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=212533253;
 //BA.debugLineNum = 212533253;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=212533254;
 //BA.debugLineNum = 212533254;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=212533255;
 //BA.debugLineNum = 212533255;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=212533256;
 //BA.debugLineNum = 212533256;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=212533258;
 //BA.debugLineNum = 212533258;BA.debugLine="End Sub";
return "";
}
public String  _head(b4j.docU.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=211812352;
 //BA.debugLineNum = 211812352;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=211812353;
 //BA.debugLineNum = 211812353;BA.debugLine="Try";
try {RDebugUtils.currentLine=211812354;
 //BA.debugLineNum = 211812354;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=211812355;
 //BA.debugLineNum = 211812355;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=211812357;
 //BA.debugLineNum = 211812357;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9211812357",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=211812358;
 //BA.debugLineNum = 211812358;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=211812360;
 //BA.debugLineNum = 211812360;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=211812361;
 //BA.debugLineNum = 211812361;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4j.docU.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=211943424;
 //BA.debugLineNum = 211943424;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=211943425;
 //BA.debugLineNum = 211943425;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=211943426;
 //BA.debugLineNum = 211943426;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=211943428;
 //BA.debugLineNum = 211943428;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=211943430;
 //BA.debugLineNum = 211943430;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=211943431;
 //BA.debugLineNum = 211943431;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4j.docU.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=211746816;
 //BA.debugLineNum = 211746816;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=211746817;
 //BA.debugLineNum = 211746817;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=211746825;
 //BA.debugLineNum = 211746825;BA.debugLine="Try";
try {RDebugUtils.currentLine=211746826;
 //BA.debugLineNum = 211746826;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=211746828;
 //BA.debugLineNum = 211746828;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9211746828",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=211746829;
 //BA.debugLineNum = 211746829;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=211746833;
 //BA.debugLineNum = 211746833;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=211746834;
 //BA.debugLineNum = 211746834;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4j.docU.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=211681280;
 //BA.debugLineNum = 211681280;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=211681281;
 //BA.debugLineNum = 211681281;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=211681282;
 //BA.debugLineNum = 211681282;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4j.docU.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile", true))
	 {return ((String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename}));}
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=212008960;
 //BA.debugLineNum = 212008960;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=212008961;
 //BA.debugLineNum = 212008961;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=212008966;
 //BA.debugLineNum = 212008966;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=212008967;
 //BA.debugLineNum = 212008967;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=212008968;
 //BA.debugLineNum = 212008968;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("9212008968","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=212008969;
 //BA.debugLineNum = 212008969;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=212008971;
 //BA.debugLineNum = 212008971;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=212008972;
 //BA.debugLineNum = 212008972;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=212008973;
 //BA.debugLineNum = 212008973;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=212008974;
 //BA.debugLineNum = 212008974;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=212008977;
 //BA.debugLineNum = 212008977;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=212008978;
 //BA.debugLineNum = 212008978;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=212008979;
 //BA.debugLineNum = 212008979;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=212008980;
 //BA.debugLineNum = 212008980;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=212008982;
 //BA.debugLineNum = 212008982;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=212008983;
 //BA.debugLineNum = 212008983;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=212008986;
 //BA.debugLineNum = 212008986;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4j.docU.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart", true))
	 {return ((String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files}));}
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
b4j.docU.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=211877888;
 //BA.debugLineNum = 211877888;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=211877889;
 //BA.debugLineNum = 211877889;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=211877890;
 //BA.debugLineNum = 211877890;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=211877891;
 //BA.debugLineNum = 211877891;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=211877892;
 //BA.debugLineNum = 211877892;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=211877893;
 //BA.debugLineNum = 211877893;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=211877894;
 //BA.debugLineNum = 211877894;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=211877895;
 //BA.debugLineNum = 211877895;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=211877896;
 //BA.debugLineNum = 211877896;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=211877897;
 //BA.debugLineNum = 211877897;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=211877898;
 //BA.debugLineNum = 211877898;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=211877899;
 //BA.debugLineNum = 211877899;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=211877904;
 //BA.debugLineNum = 211877904;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=211877905;
 //BA.debugLineNum = 211877905;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=211877908;
 //BA.debugLineNum = 211877908;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=211877909;
 //BA.debugLineNum = 211877909;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4j.docU.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=211877910;
 //BA.debugLineNum = 211877910;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=211877911;
 //BA.debugLineNum = 211877911;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=211877917;
 //BA.debugLineNum = 211877917;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=211877918;
 //BA.debugLineNum = 211877918;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=211877919;
 //BA.debugLineNum = 211877919;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=211877920;
 //BA.debugLineNum = 211877920;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=211877923;
 //BA.debugLineNum = 211877923;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=211877924;
 //BA.debugLineNum = 211877924;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=211877927;
 //BA.debugLineNum = 211877927;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=211877928;
 //BA.debugLineNum = 211877928;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=211877929;
 //BA.debugLineNum = 211877929;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=211877930;
 //BA.debugLineNum = 211877930;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=211877931;
 //BA.debugLineNum = 211877931;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=211877932;
 //BA.debugLineNum = 211877932;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4j.docU.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=211615744;
 //BA.debugLineNum = 211615744;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=211615745;
 //BA.debugLineNum = 211615745;BA.debugLine="Try";
try {RDebugUtils.currentLine=211615746;
 //BA.debugLineNum = 211615746;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=211615747;
 //BA.debugLineNum = 211615747;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=211615749;
 //BA.debugLineNum = 211615749;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("9211615749",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=211615750;
 //BA.debugLineNum = 211615750;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=211615752;
 //BA.debugLineNum = 211615752;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=211615753;
 //BA.debugLineNum = 211615753;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4j.docU.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=211550208;
 //BA.debugLineNum = 211550208;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=211550209;
 //BA.debugLineNum = 211550209;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=211550210;
 //BA.debugLineNum = 211550210;BA.debugLine="End Sub";
return "";
}
}