package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wildcardlisting extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.wildcardlisting", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.wildcardlisting.class).invoke(this, new Object[] {null});
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
public String _eventname = "";
public Object _callback = null;
public anywheresoftware.b4a.objects.collections.List _dirlisting = null;
public anywheresoftware.b4a.objects.collections.List _filelisting = null;
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
public String  _initialize(b4j.docU.wildcardlisting __ref,anywheresoftware.b4a.BA _ba,Object _vcallback,String _veventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="wildcardlisting";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback,_veventname}));}
RDebugUtils.currentLine=109838336;
 //BA.debugLineNum = 109838336;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
RDebugUtils.currentLine=109838337;
 //BA.debugLineNum = 109838337;BA.debugLine="Log(\"wcl.Initialize(\"&vEventName&\")\")";
__c.LogImpl("8109838337","wcl.Initialize("+_veventname+")",0);
RDebugUtils.currentLine=109838338;
 //BA.debugLineNum = 109838338;BA.debugLine="EventName = vEventName";
__ref._eventname /*String*/  = _veventname;
RDebugUtils.currentLine=109838339;
 //BA.debugLineNum = 109838339;BA.debugLine="CallBack = vCallback";
__ref._callback /*Object*/  = _vcallback;
RDebugUtils.currentLine=109838340;
 //BA.debugLineNum = 109838340;BA.debugLine="DirListing.Initialize";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=109838341;
 //BA.debugLineNum = 109838341;BA.debugLine="FileListing.Initialize";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=109838342;
 //BA.debugLineNum = 109838342;BA.debugLine="End Sub";
return "";
}
public String  _clearlists(b4j.docU.wildcardlisting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wildcardlisting";
if (Debug.shouldDelegate(ba, "clearlists", false))
	 {return ((String) Debug.delegate(ba, "clearlists", null));}
RDebugUtils.currentLine=110100480;
 //BA.debugLineNum = 110100480;BA.debugLine="Sub ClearLists";
RDebugUtils.currentLine=110100481;
 //BA.debugLineNum = 110100481;BA.debugLine="If DirListing.IsInitialized Then";
if (__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=110100482;
 //BA.debugLineNum = 110100482;BA.debugLine="DirListing.Clear";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 }else {
RDebugUtils.currentLine=110100484;
 //BA.debugLineNum = 110100484;BA.debugLine="DirListing.Initialize";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=110100486;
 //BA.debugLineNum = 110100486;BA.debugLine="If FileListing.IsInitialized Then";
if (__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=110100487;
 //BA.debugLineNum = 110100487;BA.debugLine="FileListing.Clear";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 }else {
RDebugUtils.currentLine=110100489;
 //BA.debugLineNum = 110100489;BA.debugLine="FileListing.Initialize";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=110100491;
 //BA.debugLineNum = 110100491;BA.debugLine="End Sub";
return "";
}
public String  _listfiles(b4j.docU.wildcardlisting __ref,String _path,boolean _recursive,String _wildcards,boolean _sorted,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="wildcardlisting";
if (Debug.shouldDelegate(ba, "listfiles", false))
	 {return ((String) Debug.delegate(ba, "listfiles", new Object[] {_path,_recursive,_wildcards,_sorted,_ascending}));}
RDebugUtils.currentLine=109969408;
 //BA.debugLineNum = 109969408;BA.debugLine="Sub ListFiles(Path As String, Recursive As Boolean";
RDebugUtils.currentLine=109969409;
 //BA.debugLineNum = 109969409;BA.debugLine="Log(\"ListFiles(\"&Path&\",\"&WildCards&\")\")";
__c.LogImpl("8109969409","ListFiles("+_path+","+_wildcards+")",0);
RDebugUtils.currentLine=109969410;
 //BA.debugLineNum = 109969410;BA.debugLine="If DirListing.IsInitialized Then";
if (__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=109969411;
 //BA.debugLineNum = 109969411;BA.debugLine="DirListing.Clear";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 }else {
RDebugUtils.currentLine=109969413;
 //BA.debugLineNum = 109969413;BA.debugLine="DirListing.Initialize";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=109969415;
 //BA.debugLineNum = 109969415;BA.debugLine="If FileListing.IsInitialized Then";
if (__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=109969416;
 //BA.debugLineNum = 109969416;BA.debugLine="FileListing.Clear";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 }else {
RDebugUtils.currentLine=109969418;
 //BA.debugLineNum = 109969418;BA.debugLine="FileListing.Initialize";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=109969420;
 //BA.debugLineNum = 109969420;BA.debugLine="GetDirs(Path, Recursive, WildCards, Sorted, Ascen";
__ref._getdirs /*String*/ (null,_path,_recursive,_wildcards,_sorted,_ascending,__c.True,__c.False);
RDebugUtils.currentLine=109969421;
 //BA.debugLineNum = 109969421;BA.debugLine="Log(\"Filelisting.Size = \"&FileListing.Size)";
__c.LogImpl("8109969421","Filelisting.Size = "+BA.NumberToString(__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
RDebugUtils.currentLine=109969422;
 //BA.debugLineNum = 109969422;BA.debugLine="If Sorted Then";
if (_sorted) { 
RDebugUtils.currentLine=109969423;
 //BA.debugLineNum = 109969423;BA.debugLine="FileListing.SortCaseInsensitive(Ascending)";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
 };
RDebugUtils.currentLine=109969425;
 //BA.debugLineNum = 109969425;BA.debugLine="If SubExists(CallBack, EventName & \"_ListFilesFin";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ListFilesFinish")) { 
RDebugUtils.currentLine=109969426;
 //BA.debugLineNum = 109969426;BA.debugLine="CallSubDelayed2(CallBack, EventName & \"_ListFile";
__c.CallSubDelayed2(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ListFilesFinish",(Object)(__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ ));
 }else {
RDebugUtils.currentLine=109969428;
 //BA.debugLineNum = 109969428;BA.debugLine="Log(\"Event sub ListFilesFinish should be fire bu";
__c.LogImpl("8109969428","Event sub ListFilesFinish should be fire but cannot be found",0);
 };
RDebugUtils.currentLine=109969430;
 //BA.debugLineNum = 109969430;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.wildcardlisting __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="wildcardlisting";
RDebugUtils.currentLine=109772800;
 //BA.debugLineNum = 109772800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=109772801;
 //BA.debugLineNum = 109772801;BA.debugLine="Private EventName As String";
_eventname = "";
RDebugUtils.currentLine=109772802;
 //BA.debugLineNum = 109772802;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=109772803;
 //BA.debugLineNum = 109772803;BA.debugLine="Private DirListing As List";
_dirlisting = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=109772804;
 //BA.debugLineNum = 109772804;BA.debugLine="Private FileListing As List";
_filelisting = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=109772805;
 //BA.debugLineNum = 109772805;BA.debugLine="End Sub";
return "";
}
public String  _getdirs(b4j.docU.wildcardlisting __ref,String _path,boolean _recursive,String _wildcards,boolean _sorted,boolean _ascending,boolean _vlistfiles,boolean _vlistdirs) throws Exception{
__ref = this;
RDebugUtils.currentModule="wildcardlisting";
if (Debug.shouldDelegate(ba, "getdirs", false))
	 {return ((String) Debug.delegate(ba, "getdirs", new Object[] {_path,_recursive,_wildcards,_sorted,_ascending,_vlistfiles,_vlistdirs}));}
String[] _getcards = null;
String _mask = "";
String _pattern = "";
anywheresoftware.b4a.objects.collections.List _filesfound = null;
int _i = 0;
int _l = 0;
String _testitem = "";
RDebugUtils.currentLine=110166016;
 //BA.debugLineNum = 110166016;BA.debugLine="Private Sub GetDirs(Path As String, Recursive As B";
RDebugUtils.currentLine=110166019;
 //BA.debugLineNum = 110166019;BA.debugLine="Dim GetCards() As String = Regex.Split(\",\", WildC";
_getcards = __c.Regex.Split(",",_wildcards);
RDebugUtils.currentLine=110166020;
 //BA.debugLineNum = 110166020;BA.debugLine="Dim mask As String";
_mask = "";
RDebugUtils.currentLine=110166021;
 //BA.debugLineNum = 110166021;BA.debugLine="Dim pattern As String";
_pattern = "";
RDebugUtils.currentLine=110166022;
 //BA.debugLineNum = 110166022;BA.debugLine="If File.IsDirectory(\"\", Path) Then";
if (__c.File.IsDirectory("",_path)) { 
RDebugUtils.currentLine=110166023;
 //BA.debugLineNum = 110166023;BA.debugLine="Dim FilesFound As List = File.ListFiles(Path)";
_filesfound = new anywheresoftware.b4a.objects.collections.List();
_filesfound = __c.File.ListFiles(_path);
RDebugUtils.currentLine=110166024;
 //BA.debugLineNum = 110166024;BA.debugLine="For i = 0 To FilesFound.Size -1";
{
final int step6 = 1;
final int limit6 = (int) (_filesfound.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=110166025;
 //BA.debugLineNum = 110166025;BA.debugLine="If File.IsDirectory(Path,FilesFound.Get(i)) The";
if (__c.File.IsDirectory(_path,BA.ObjectToString(_filesfound.Get(_i)))) { 
RDebugUtils.currentLine=110166027;
 //BA.debugLineNum = 110166027;BA.debugLine="Log(Path&\"\\\"&FilesFound.Get(i))";
__c.LogImpl("8110166027",_path+"\\"+BA.ObjectToString(_filesfound.Get(_i)),0);
RDebugUtils.currentLine=110166028;
 //BA.debugLineNum = 110166028;BA.debugLine="If FilesFound.Get(i) = \"$RECYCLE.BIN\" Then";
if ((_filesfound.Get(_i)).equals((Object)("$RECYCLE.BIN"))) { 
 }else 
{RDebugUtils.currentLine=110166029;
 //BA.debugLineNum = 110166029;BA.debugLine="else If FilesFound.Get(i) = \"System Volume Inf";
if ((_filesfound.Get(_i)).equals((Object)("System Volume Information"))) { 
 }else {
RDebugUtils.currentLine=110166031;
 //BA.debugLineNum = 110166031;BA.debugLine="If vListDirs Then";
if (_vlistdirs) { 
RDebugUtils.currentLine=110166032;
 //BA.debugLineNum = 110166032;BA.debugLine="DirListing.Add(Path&\"\\\"&FilesFound.Get(i))";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_path+"\\"+BA.ObjectToString(_filesfound.Get(_i))));
 };
RDebugUtils.currentLine=110166034;
 //BA.debugLineNum = 110166034;BA.debugLine="If Recursive Then";
if (_recursive) { 
RDebugUtils.currentLine=110166035;
 //BA.debugLineNum = 110166035;BA.debugLine="GetDirs(Path&\"\\\"&FilesFound.Get(i), Recursiv";
__ref._getdirs /*String*/ (null,_path+"\\"+BA.ObjectToString(_filesfound.Get(_i)),_recursive,_wildcards,_sorted,_ascending,_vlistfiles,_vlistdirs);
 };
 }}
;
 }else {
RDebugUtils.currentLine=110166039;
 //BA.debugLineNum = 110166039;BA.debugLine="Log(Path&\"\\\"&FilesFound.Get(i))";
__c.LogImpl("8110166039",_path+"\\"+BA.ObjectToString(_filesfound.Get(_i)),0);
RDebugUtils.currentLine=110166040;
 //BA.debugLineNum = 110166040;BA.debugLine="If vListFiles Then";
if (_vlistfiles) { 
RDebugUtils.currentLine=110166041;
 //BA.debugLineNum = 110166041;BA.debugLine="For l = 0 To GetCards.Length -1";
{
final int step22 = 1;
final int limit22 = (int) (_getcards.length-1);
_l = (int) (0) ;
for (;_l <= limit22 ;_l = _l + step22 ) {
RDebugUtils.currentLine=110166042;
 //BA.debugLineNum = 110166042;BA.debugLine="Dim TestItem As String = FilesFound.Get(i";
_testitem = BA.ObjectToString(_filesfound.Get(_i));
RDebugUtils.currentLine=110166043;
 //BA.debugLineNum = 110166043;BA.debugLine="mask = GetCards(l).Trim";
_mask = _getcards[_l].trim();
RDebugUtils.currentLine=110166044;
 //BA.debugLineNum = 110166044;BA.debugLine="pattern = \"^\"&mask.Replace(\".\",\"\\.\").Replace";
_pattern = "^"+_mask.replace(".","\\.").replace("*",".+").replace("?",".")+"$";
RDebugUtils.currentLine=110166045;
 //BA.debugLineNum = 110166045;BA.debugLine="If Regex.IsMatch(pattern,TestItem) = True Th";
if (__c.Regex.IsMatch(_pattern,_testitem)==__c.True) { 
RDebugUtils.currentLine=110166046;
 //BA.debugLineNum = 110166046;BA.debugLine="FileListing.Add(Path&\"\\\"&FilesFound.Get(i))";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_path+"\\"+BA.ObjectToString(_filesfound.Get(_i))));
 };
 }
};
 };
 };
 }
};
 }else {
RDebugUtils.currentLine=110166053;
 //BA.debugLineNum = 110166053;BA.debugLine="If SubExists(CallBack, EventName & \"_DirListingE";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_DirListingError")) { 
RDebugUtils.currentLine=110166054;
 //BA.debugLineNum = 110166054;BA.debugLine="CallSub2(CallBack, EventName & \"_DirListingErro";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_DirListingError",(Object)("La ruta seleccionada ''"+_path+"'' debe ser un directorio válido."));
 }else {
RDebugUtils.currentLine=110166056;
 //BA.debugLineNum = 110166056;BA.debugLine="Log(\"Event sub DirListingError not found\")";
__c.LogImpl("8110166056","Event sub DirListingError not found",0);
 };
 };
RDebugUtils.currentLine=110166059;
 //BA.debugLineNum = 110166059;BA.debugLine="End Sub";
return "";
}
public String  _listfilesandfolders(b4j.docU.wildcardlisting __ref,String _path,boolean _recursive,String _wildcards,boolean _sorted,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="wildcardlisting";
if (Debug.shouldDelegate(ba, "listfilesandfolders", false))
	 {return ((String) Debug.delegate(ba, "listfilesandfolders", new Object[] {_path,_recursive,_wildcards,_sorted,_ascending}));}
RDebugUtils.currentLine=110034944;
 //BA.debugLineNum = 110034944;BA.debugLine="Sub ListFilesAndFolders(Path As String, Recursive";
RDebugUtils.currentLine=110034945;
 //BA.debugLineNum = 110034945;BA.debugLine="Log(\"ListFilesAndFolders(\"&Path&\",\"&WildCards&\")\"";
__c.LogImpl("8110034945","ListFilesAndFolders("+_path+","+_wildcards+")",0);
RDebugUtils.currentLine=110034946;
 //BA.debugLineNum = 110034946;BA.debugLine="ClearLists";
__ref._clearlists /*String*/ (null);
RDebugUtils.currentLine=110034947;
 //BA.debugLineNum = 110034947;BA.debugLine="GetDirs(Path, Recursive, WildCards, Sorted, Ascen";
__ref._getdirs /*String*/ (null,_path,_recursive,_wildcards,_sorted,_ascending,__c.True,__c.True);
RDebugUtils.currentLine=110034948;
 //BA.debugLineNum = 110034948;BA.debugLine="Log(\"Filelisting.Size = \"&FileListing.Size)";
__c.LogImpl("8110034948","Filelisting.Size = "+BA.NumberToString(__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
RDebugUtils.currentLine=110034949;
 //BA.debugLineNum = 110034949;BA.debugLine="Log(\"Dirlisting.Size = \"&DirListing.Size)";
__c.LogImpl("8110034949","Dirlisting.Size = "+BA.NumberToString(__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
RDebugUtils.currentLine=110034950;
 //BA.debugLineNum = 110034950;BA.debugLine="If Sorted Then";
if (_sorted) { 
RDebugUtils.currentLine=110034951;
 //BA.debugLineNum = 110034951;BA.debugLine="DirListing.SortCaseInsensitive(Ascending)";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
 };
RDebugUtils.currentLine=110034953;
 //BA.debugLineNum = 110034953;BA.debugLine="If Sorted Then";
if (_sorted) { 
RDebugUtils.currentLine=110034954;
 //BA.debugLineNum = 110034954;BA.debugLine="FileListing.SortCaseInsensitive(Ascending)";
__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
 };
RDebugUtils.currentLine=110034956;
 //BA.debugLineNum = 110034956;BA.debugLine="If SubExists(CallBack, EventName & \"_FilesAndFold";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_FilesAndFoldersFinish")) { 
RDebugUtils.currentLine=110034957;
 //BA.debugLineNum = 110034957;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_FilesAnd";
__c.CallSubDelayed3(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_FilesAndFoldersFinish",(Object)(__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ ),(Object)(__ref._filelisting /*anywheresoftware.b4a.objects.collections.List*/ ));
 }else {
RDebugUtils.currentLine=110034959;
 //BA.debugLineNum = 110034959;BA.debugLine="Log(\"Event sub FilesAndFoldersFinish should be f";
__c.LogImpl("8110034959","Event sub FilesAndFoldersFinish should be fire but cannot be found",0);
 };
RDebugUtils.currentLine=110034961;
 //BA.debugLineNum = 110034961;BA.debugLine="End Sub";
return "";
}
public String  _listfolders(b4j.docU.wildcardlisting __ref,String _path,boolean _recursive,boolean _sorted,boolean _ascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="wildcardlisting";
if (Debug.shouldDelegate(ba, "listfolders", false))
	 {return ((String) Debug.delegate(ba, "listfolders", new Object[] {_path,_recursive,_sorted,_ascending}));}
RDebugUtils.currentLine=109903872;
 //BA.debugLineNum = 109903872;BA.debugLine="Sub ListFolders(Path As String, Recursive As Boole";
RDebugUtils.currentLine=109903873;
 //BA.debugLineNum = 109903873;BA.debugLine="Log(\"ListFolders(\"&Path&\")\")";
__c.LogImpl("8109903873","ListFolders("+_path+")",0);
RDebugUtils.currentLine=109903874;
 //BA.debugLineNum = 109903874;BA.debugLine="If DirListing.IsInitialized Then";
if (__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
RDebugUtils.currentLine=109903875;
 //BA.debugLineNum = 109903875;BA.debugLine="DirListing.Clear";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 }else {
RDebugUtils.currentLine=109903877;
 //BA.debugLineNum = 109903877;BA.debugLine="DirListing.Initialize";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=109903879;
 //BA.debugLineNum = 109903879;BA.debugLine="GetDirs(Path, Recursive, \"\", Sorted, Ascending, F";
__ref._getdirs /*String*/ (null,_path,_recursive,"",_sorted,_ascending,__c.False,__c.True);
RDebugUtils.currentLine=109903880;
 //BA.debugLineNum = 109903880;BA.debugLine="Log(\"Dirlisting.Size = \"&DirListing.Size)";
__c.LogImpl("8109903880","Dirlisting.Size = "+BA.NumberToString(__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
RDebugUtils.currentLine=109903881;
 //BA.debugLineNum = 109903881;BA.debugLine="If Sorted Then";
if (_sorted) { 
RDebugUtils.currentLine=109903882;
 //BA.debugLineNum = 109903882;BA.debugLine="DirListing.SortCaseInsensitive(Ascending)";
__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ .SortCaseInsensitive(_ascending);
 };
RDebugUtils.currentLine=109903884;
 //BA.debugLineNum = 109903884;BA.debugLine="If SubExists(CallBack, EventName & \"_ListFoldersF";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ListFoldersFinish")) { 
RDebugUtils.currentLine=109903885;
 //BA.debugLineNum = 109903885;BA.debugLine="CallSubDelayed2(CallBack, EventName & \"_ListFold";
__c.CallSubDelayed2(ba,__ref._callback /*Object*/ ,__ref._eventname /*String*/ +"_ListFoldersFinish",(Object)(__ref._dirlisting /*anywheresoftware.b4a.objects.collections.List*/ ));
 }else {
RDebugUtils.currentLine=109903887;
 //BA.debugLineNum = 109903887;BA.debugLine="Log(\"Event sub ListFoldersFinish should be fire";
__c.LogImpl("8109903887","Event sub ListFoldersFinish should be fire but cannot be found",0);
 };
RDebugUtils.currentLine=109903889;
 //BA.debugLineNum = 109903889;BA.debugLine="End Sub";
return "";
}
}