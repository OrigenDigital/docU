package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class wildcardlisting_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private EventName As String";
wildcardlisting._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",wildcardlisting._eventname);
 //BA.debugLineNum = 8;BA.debugLine="Private CallBack As Object";
wildcardlisting._callback = RemoteObject.createNew ("Object");__ref.setField("_callback",wildcardlisting._callback);
 //BA.debugLineNum = 9;BA.debugLine="Private DirListing As List";
wildcardlisting._dirlisting = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_dirlisting",wildcardlisting._dirlisting);
 //BA.debugLineNum = 10;BA.debugLine="Private FileListing As List";
wildcardlisting._filelisting = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_filelisting",wildcardlisting._filelisting);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearlists(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearLists (wildcardlisting) ","wildcardlisting",55,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("clearlists")) { return __ref.runUserSub(false, "wildcardlisting","clearlists", __ref);}
 BA.debugLineNum = 133;BA.debugLine="Sub ClearLists";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="If DirListing.IsInitialized Then";
Debug.ShouldStop(32);
if (__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 135;BA.debugLine="DirListing.Clear";
Debug.ShouldStop(64);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 137;BA.debugLine="DirListing.Initialize";
Debug.ShouldStop(256);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 139;BA.debugLine="If FileListing.IsInitialized Then";
Debug.ShouldStop(1024);
if (__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 140;BA.debugLine="FileListing.Clear";
Debug.ShouldStop(2048);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 142;BA.debugLine="FileListing.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdirs(RemoteObject __ref,RemoteObject _path,RemoteObject _recursive,RemoteObject _wildcards,RemoteObject _sorted,RemoteObject _ascending,RemoteObject _vlistfiles,RemoteObject _vlistdirs) throws Exception{
try {
		Debug.PushSubsStack("GetDirs (wildcardlisting) ","wildcardlisting",55,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("getdirs")) { return __ref.runUserSub(false, "wildcardlisting","getdirs", __ref, _path, _recursive, _wildcards, _sorted, _ascending, _vlistfiles, _vlistdirs);}
RemoteObject _getcards = null;
RemoteObject _mask = RemoteObject.createImmutable("");
RemoteObject _pattern = RemoteObject.createImmutable("");
RemoteObject _filesfound = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
int _l = 0;
RemoteObject _testitem = RemoteObject.createImmutable("");
Debug.locals.put("Path", _path);
Debug.locals.put("Recursive", _recursive);
Debug.locals.put("WildCards", _wildcards);
Debug.locals.put("Sorted", _sorted);
Debug.locals.put("Ascending", _ascending);
Debug.locals.put("vListFiles", _vlistfiles);
Debug.locals.put("vListDirs", _vlistdirs);
 BA.debugLineNum = 147;BA.debugLine="Private Sub GetDirs(Path As String, Recursive As B";
Debug.ShouldStop(262144);
 BA.debugLineNum = 150;BA.debugLine="Dim GetCards() As String = Regex.Split(\",\", WildC";
Debug.ShouldStop(2097152);
_getcards = wildcardlisting.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(",")),(Object)(_wildcards));Debug.locals.put("GetCards", _getcards);Debug.locals.put("GetCards", _getcards);
 BA.debugLineNum = 151;BA.debugLine="Dim mask As String";
Debug.ShouldStop(4194304);
_mask = RemoteObject.createImmutable("");Debug.locals.put("mask", _mask);
 BA.debugLineNum = 152;BA.debugLine="Dim pattern As String";
Debug.ShouldStop(8388608);
_pattern = RemoteObject.createImmutable("");Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 153;BA.debugLine="If File.IsDirectory(\"\", Path) Then";
Debug.ShouldStop(16777216);
if (wildcardlisting.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(BA.ObjectToString("")),(Object)(_path)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 154;BA.debugLine="Dim FilesFound As List = File.ListFiles(Path)";
Debug.ShouldStop(33554432);
_filesfound = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_filesfound = wildcardlisting.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_path));Debug.locals.put("FilesFound", _filesfound);Debug.locals.put("FilesFound", _filesfound);
 BA.debugLineNum = 155;BA.debugLine="For i = 0 To FilesFound.Size -1";
Debug.ShouldStop(67108864);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_filesfound.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 156;BA.debugLine="If File.IsDirectory(Path,FilesFound.Get(i)) The";
Debug.ShouldStop(134217728);
if (wildcardlisting.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_path),(Object)(BA.ObjectToString(_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 158;BA.debugLine="Log(Path&\"\\\"&FilesFound.Get(i))";
Debug.ShouldStop(536870912);
wildcardlisting.__c.runVoidMethod ("LogImpl","8110166027",RemoteObject.concat(_path,RemoteObject.createImmutable("\\"),_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 159;BA.debugLine="If FilesFound.Get(i) = \"$RECYCLE.BIN\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("$RECYCLE.BIN")))) { 
 }else 
{ BA.debugLineNum = 160;BA.debugLine="else If FilesFound.Get(i) = \"System Volume Inf";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("System Volume Information")))) { 
 }else {
 BA.debugLineNum = 162;BA.debugLine="If vListDirs Then";
Debug.ShouldStop(2);
if (_vlistdirs.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="DirListing.Add(Path&\"\\\"&FilesFound.Get(i))";
Debug.ShouldStop(4);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.concat(_path,RemoteObject.createImmutable("\\"),_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))));
 };
 BA.debugLineNum = 165;BA.debugLine="If Recursive Then";
Debug.ShouldStop(16);
if (_recursive.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 166;BA.debugLine="GetDirs(Path&\"\\\"&FilesFound.Get(i), Recursiv";
Debug.ShouldStop(32);
__ref.runClassMethod (b4j.docU.wildcardlisting.class, "_getdirs" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_path,RemoteObject.createImmutable("\\"),_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),(Object)(_recursive),(Object)(_wildcards),(Object)(_sorted),(Object)(_ascending),(Object)(_vlistfiles),(Object)(_vlistdirs));
 };
 }}
;
 }else {
 BA.debugLineNum = 170;BA.debugLine="Log(Path&\"\\\"&FilesFound.Get(i))";
Debug.ShouldStop(512);
wildcardlisting.__c.runVoidMethod ("LogImpl","8110166039",RemoteObject.concat(_path,RemoteObject.createImmutable("\\"),_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))),0);
 BA.debugLineNum = 171;BA.debugLine="If vListFiles Then";
Debug.ShouldStop(1024);
if (_vlistfiles.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 172;BA.debugLine="For l = 0 To GetCards.Length -1";
Debug.ShouldStop(2048);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_getcards.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_l = 0 ;
for (;(step22 > 0 && _l <= limit22) || (step22 < 0 && _l >= limit22) ;_l = ((int)(0 + _l + step22))  ) {
Debug.locals.put("l", _l);
 BA.debugLineNum = 173;BA.debugLine="Dim TestItem As String = FilesFound.Get(i";
Debug.ShouldStop(4096);
_testitem = BA.ObjectToString(_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("TestItem", _testitem);Debug.locals.put("TestItem", _testitem);
 BA.debugLineNum = 174;BA.debugLine="mask = GetCards(l).Trim";
Debug.ShouldStop(8192);
_mask = _getcards.getArrayElement(true,BA.numberCast(int.class, _l)).runMethod(true,"trim");Debug.locals.put("mask", _mask);
 BA.debugLineNum = 175;BA.debugLine="pattern = \"^\"&mask.Replace(\".\",\"\\.\").Replace";
Debug.ShouldStop(16384);
_pattern = RemoteObject.concat(RemoteObject.createImmutable("^"),_mask.runMethod(true,"replace",(Object)(BA.ObjectToString(".")),(Object)(RemoteObject.createImmutable("\\."))).runMethod(true,"replace",(Object)(BA.ObjectToString("*")),(Object)(RemoteObject.createImmutable(".+"))).runMethod(true,"replace",(Object)(BA.ObjectToString("?")),(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable("$"));Debug.locals.put("pattern", _pattern);
 BA.debugLineNum = 176;BA.debugLine="If Regex.IsMatch(pattern,TestItem) = True Th";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",wildcardlisting.__c.getField(false,"Regex").runMethod(true,"IsMatch",(Object)(_pattern),(Object)(_testitem)),wildcardlisting.__c.getField(true,"True"))) { 
 BA.debugLineNum = 177;BA.debugLine="FileListing.Add(Path&\"\\\"&FilesFound.Get(i))";
Debug.ShouldStop(65536);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.concat(_path,RemoteObject.createImmutable("\\"),_filesfound.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i)))))));
 };
 }
}Debug.locals.put("l", _l);
;
 };
 };
 }
}Debug.locals.put("i", _i);
;
 }else {
 BA.debugLineNum = 184;BA.debugLine="If SubExists(CallBack, EventName & \"_DirListingE";
Debug.ShouldStop(8388608);
if (wildcardlisting.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DirListingError")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 185;BA.debugLine="CallSub2(CallBack, EventName & \"_DirListingErro";
Debug.ShouldStop(16777216);
wildcardlisting.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_DirListingError"))),(Object)((RemoteObject.concat(RemoteObject.createImmutable("La ruta seleccionada ''"),_path,RemoteObject.createImmutable("'' debe ser un directorio válido.")))));
 }else {
 BA.debugLineNum = 187;BA.debugLine="Log(\"Event sub DirListingError not found\")";
Debug.ShouldStop(67108864);
wildcardlisting.__c.runVoidMethod ("LogImpl","8110166056",RemoteObject.createImmutable("Event sub DirListingError not found"),0);
 };
 };
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (wildcardlisting) ","wildcardlisting",55,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "wildcardlisting","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallback", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (vCallback As Object, vEvent";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Log(\"wcl.Initialize(\"&vEventName&\")\")";
Debug.ShouldStop(65536);
wildcardlisting.__c.runVoidMethod ("LogImpl","8109838337",RemoteObject.concat(RemoteObject.createImmutable("wcl.Initialize("),_veventname,RemoteObject.createImmutable(")")),0);
 BA.debugLineNum = 18;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(131072);
__ref.setField ("_eventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 19;BA.debugLine="CallBack = vCallback";
Debug.ShouldStop(262144);
__ref.setField ("_callback" /*RemoteObject*/ ,_vcallback);
 BA.debugLineNum = 20;BA.debugLine="DirListing.Initialize";
Debug.ShouldStop(524288);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 21;BA.debugLine="FileListing.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listfiles(RemoteObject __ref,RemoteObject _path,RemoteObject _recursive,RemoteObject _wildcards,RemoteObject _sorted,RemoteObject _ascending) throws Exception{
try {
		Debug.PushSubsStack("ListFiles (wildcardlisting) ","wildcardlisting",55,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("listfiles")) { return __ref.runUserSub(false, "wildcardlisting","listfiles", __ref, _path, _recursive, _wildcards, _sorted, _ascending);}
Debug.locals.put("Path", _path);
Debug.locals.put("Recursive", _recursive);
Debug.locals.put("WildCards", _wildcards);
Debug.locals.put("Sorted", _sorted);
Debug.locals.put("Ascending", _ascending);
 BA.debugLineNum = 71;BA.debugLine="Sub ListFiles(Path As String, Recursive As Boolean";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="Log(\"ListFiles(\"&Path&\",\"&WildCards&\")\")";
Debug.ShouldStop(128);
wildcardlisting.__c.runVoidMethod ("LogImpl","8109969409",RemoteObject.concat(RemoteObject.createImmutable("ListFiles("),_path,RemoteObject.createImmutable(","),_wildcards,RemoteObject.createImmutable(")")),0);
 BA.debugLineNum = 73;BA.debugLine="If DirListing.IsInitialized Then";
Debug.ShouldStop(256);
if (__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 74;BA.debugLine="DirListing.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 76;BA.debugLine="DirListing.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 78;BA.debugLine="If FileListing.IsInitialized Then";
Debug.ShouldStop(8192);
if (__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="FileListing.Clear";
Debug.ShouldStop(16384);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 81;BA.debugLine="FileListing.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 83;BA.debugLine="GetDirs(Path, Recursive, WildCards, Sorted, Ascen";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.wildcardlisting.class, "_getdirs" /*RemoteObject*/ ,(Object)(_path),(Object)(_recursive),(Object)(_wildcards),(Object)(_sorted),(Object)(_ascending),(Object)(wildcardlisting.__c.getField(true,"True")),(Object)(wildcardlisting.__c.getField(true,"False")));
 BA.debugLineNum = 84;BA.debugLine="Log(\"Filelisting.Size = \"&FileListing.Size)";
Debug.ShouldStop(524288);
wildcardlisting.__c.runVoidMethod ("LogImpl","8109969421",RemoteObject.concat(RemoteObject.createImmutable("Filelisting.Size = "),__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runMethod(true,"getSize")),0);
 BA.debugLineNum = 85;BA.debugLine="If Sorted Then";
Debug.ShouldStop(1048576);
if (_sorted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="FileListing.SortCaseInsensitive(Ascending)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("SortCaseInsensitive",(Object)(_ascending));
 };
 BA.debugLineNum = 88;BA.debugLine="If SubExists(CallBack, EventName & \"_ListFilesFin";
Debug.ShouldStop(8388608);
if (wildcardlisting.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ListFilesFinish")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 89;BA.debugLine="CallSubDelayed2(CallBack, EventName & \"_ListFile";
Debug.ShouldStop(16777216);
wildcardlisting.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ListFilesFinish"))),(Object)((__ref.getField(false,"_filelisting" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 91;BA.debugLine="Log(\"Event sub ListFilesFinish should be fire bu";
Debug.ShouldStop(67108864);
wildcardlisting.__c.runVoidMethod ("LogImpl","8109969428",RemoteObject.createImmutable("Event sub ListFilesFinish should be fire but cannot be found"),0);
 };
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listfilesandfolders(RemoteObject __ref,RemoteObject _path,RemoteObject _recursive,RemoteObject _wildcards,RemoteObject _sorted,RemoteObject _ascending) throws Exception{
try {
		Debug.PushSubsStack("ListFilesAndFolders (wildcardlisting) ","wildcardlisting",55,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("listfilesandfolders")) { return __ref.runUserSub(false, "wildcardlisting","listfilesandfolders", __ref, _path, _recursive, _wildcards, _sorted, _ascending);}
Debug.locals.put("Path", _path);
Debug.locals.put("Recursive", _recursive);
Debug.locals.put("WildCards", _wildcards);
Debug.locals.put("Sorted", _sorted);
Debug.locals.put("Ascending", _ascending);
 BA.debugLineNum = 112;BA.debugLine="Sub ListFilesAndFolders(Path As String, Recursive";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Log(\"ListFilesAndFolders(\"&Path&\",\"&WildCards&\")\"";
Debug.ShouldStop(65536);
wildcardlisting.__c.runVoidMethod ("LogImpl","8110034945",RemoteObject.concat(RemoteObject.createImmutable("ListFilesAndFolders("),_path,RemoteObject.createImmutable(","),_wildcards,RemoteObject.createImmutable(")")),0);
 BA.debugLineNum = 114;BA.debugLine="ClearLists";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4j.docU.wildcardlisting.class, "_clearlists" /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="GetDirs(Path, Recursive, WildCards, Sorted, Ascen";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4j.docU.wildcardlisting.class, "_getdirs" /*RemoteObject*/ ,(Object)(_path),(Object)(_recursive),(Object)(_wildcards),(Object)(_sorted),(Object)(_ascending),(Object)(wildcardlisting.__c.getField(true,"True")),(Object)(wildcardlisting.__c.getField(true,"True")));
 BA.debugLineNum = 116;BA.debugLine="Log(\"Filelisting.Size = \"&FileListing.Size)";
Debug.ShouldStop(524288);
wildcardlisting.__c.runVoidMethod ("LogImpl","8110034948",RemoteObject.concat(RemoteObject.createImmutable("Filelisting.Size = "),__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runMethod(true,"getSize")),0);
 BA.debugLineNum = 117;BA.debugLine="Log(\"Dirlisting.Size = \"&DirListing.Size)";
Debug.ShouldStop(1048576);
wildcardlisting.__c.runVoidMethod ("LogImpl","8110034949",RemoteObject.concat(RemoteObject.createImmutable("Dirlisting.Size = "),__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runMethod(true,"getSize")),0);
 BA.debugLineNum = 118;BA.debugLine="If Sorted Then";
Debug.ShouldStop(2097152);
if (_sorted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 119;BA.debugLine="DirListing.SortCaseInsensitive(Ascending)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("SortCaseInsensitive",(Object)(_ascending));
 };
 BA.debugLineNum = 121;BA.debugLine="If Sorted Then";
Debug.ShouldStop(16777216);
if (_sorted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 122;BA.debugLine="FileListing.SortCaseInsensitive(Ascending)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_filelisting" /*RemoteObject*/ ).runVoidMethod ("SortCaseInsensitive",(Object)(_ascending));
 };
 BA.debugLineNum = 124;BA.debugLine="If SubExists(CallBack, EventName & \"_FilesAndFold";
Debug.ShouldStop(134217728);
if (wildcardlisting.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FilesAndFoldersFinish")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 125;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_FilesAnd";
Debug.ShouldStop(268435456);
wildcardlisting.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_FilesAndFoldersFinish"))),(Object)((__ref.getField(false,"_dirlisting" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_filelisting" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 127;BA.debugLine="Log(\"Event sub FilesAndFoldersFinish should be f";
Debug.ShouldStop(1073741824);
wildcardlisting.__c.runVoidMethod ("LogImpl","8110034959",RemoteObject.createImmutable("Event sub FilesAndFoldersFinish should be fire but cannot be found"),0);
 };
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listfolders(RemoteObject __ref,RemoteObject _path,RemoteObject _recursive,RemoteObject _sorted,RemoteObject _ascending) throws Exception{
try {
		Debug.PushSubsStack("ListFolders (wildcardlisting) ","wildcardlisting",55,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("listfolders")) { return __ref.runUserSub(false, "wildcardlisting","listfolders", __ref, _path, _recursive, _sorted, _ascending);}
Debug.locals.put("Path", _path);
Debug.locals.put("Recursive", _recursive);
Debug.locals.put("Sorted", _sorted);
Debug.locals.put("Ascending", _ascending);
 BA.debugLineNum = 35;BA.debugLine="Sub ListFolders(Path As String, Recursive As Boole";
Debug.ShouldStop(4);
 BA.debugLineNum = 36;BA.debugLine="Log(\"ListFolders(\"&Path&\")\")";
Debug.ShouldStop(8);
wildcardlisting.__c.runVoidMethod ("LogImpl","8109903873",RemoteObject.concat(RemoteObject.createImmutable("ListFolders("),_path,RemoteObject.createImmutable(")")),0);
 BA.debugLineNum = 37;BA.debugLine="If DirListing.IsInitialized Then";
Debug.ShouldStop(16);
if (__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 38;BA.debugLine="DirListing.Clear";
Debug.ShouldStop(32);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 40;BA.debugLine="DirListing.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 42;BA.debugLine="GetDirs(Path, Recursive, \"\", Sorted, Ascending, F";
Debug.ShouldStop(512);
__ref.runClassMethod (b4j.docU.wildcardlisting.class, "_getdirs" /*RemoteObject*/ ,(Object)(_path),(Object)(_recursive),(Object)(BA.ObjectToString("")),(Object)(_sorted),(Object)(_ascending),(Object)(wildcardlisting.__c.getField(true,"False")),(Object)(wildcardlisting.__c.getField(true,"True")));
 BA.debugLineNum = 43;BA.debugLine="Log(\"Dirlisting.Size = \"&DirListing.Size)";
Debug.ShouldStop(1024);
wildcardlisting.__c.runVoidMethod ("LogImpl","8109903880",RemoteObject.concat(RemoteObject.createImmutable("Dirlisting.Size = "),__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runMethod(true,"getSize")),0);
 BA.debugLineNum = 44;BA.debugLine="If Sorted Then";
Debug.ShouldStop(2048);
if (_sorted.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 45;BA.debugLine="DirListing.SortCaseInsensitive(Ascending)";
Debug.ShouldStop(4096);
__ref.getField(false,"_dirlisting" /*RemoteObject*/ ).runVoidMethod ("SortCaseInsensitive",(Object)(_ascending));
 };
 BA.debugLineNum = 47;BA.debugLine="If SubExists(CallBack, EventName & \"_ListFoldersF";
Debug.ShouldStop(16384);
if (wildcardlisting.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ListFoldersFinish")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 48;BA.debugLine="CallSubDelayed2(CallBack, EventName & \"_ListFold";
Debug.ShouldStop(32768);
wildcardlisting.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ListFoldersFinish"))),(Object)((__ref.getField(false,"_dirlisting" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 50;BA.debugLine="Log(\"Event sub ListFoldersFinish should be fire";
Debug.ShouldStop(131072);
wildcardlisting.__c.runVoidMethod ("LogImpl","8109903887",RemoteObject.createImmutable("Event sub ListFoldersFinish should be fire but cannot be found"),0);
 };
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}