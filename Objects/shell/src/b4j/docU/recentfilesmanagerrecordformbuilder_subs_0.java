package b4j.docU;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class recentfilesmanagerrecordformbuilder_subs_0 {


public static RemoteObject  _addfile(RemoteObject __ref,RemoteObject _fullpath) throws Exception{
try {
		Debug.PushSubsStack("AddFile (recentfilesmanagerrecordformbuilder) ","recentfilesmanagerrecordformbuilder",77,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("addfile")) { return __ref.runUserSub(false, "recentfilesmanagerrecordformbuilder","addfile", __ref, _fullpath);}
RemoteObject _name = RemoteObject.createImmutable("");
Debug.locals.put("FullPath", _fullpath);
 BA.debugLineNum = 58;BA.debugLine="Public Sub AddFile (FullPath As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If FullPath = \"\" Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_fullpath,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 60;BA.debugLine="Dim name As String = File.GetName(FullPath)";
Debug.JustUpdateDeviceLine();
_name = recentfilesmanagerrecordformbuilder.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_fullpath));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 61;BA.debugLine="RecentFiles.Remove(name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((_name)));
 BA.debugLineNum = 62;BA.debugLine="RecentFiles.Put(name, FullPath)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((_name)),(Object)((_fullpath)));
 BA.debugLineNum = 63;BA.debugLine="Do While RecentFiles.Size > MaxFiles";
Debug.JustUpdateDeviceLine();
while (RemoteObject.solveBoolean(">",__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_maxfiles" /*RemoteObject*/ )))) {
 BA.debugLineNum = 64;BA.debugLine="RecentFiles.Remove(RecentFiles.Keys.Get(0))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0)))));
 }
;
 BA.debugLineNum = 66;BA.debugLine="UpdateRecentList";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.recentfilesmanagerrecordformbuilder.class, "_updaterecentlist" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private RecentFiles As B4XOrderedMap";
recentfilesmanagerrecordformbuilder._recentfiles = RemoteObject.createNew ("b4j.docU.b4xorderedmap");__ref.setField("_recentfiles",recentfilesmanagerrecordformbuilder._recentfiles);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI";
recentfilesmanagerrecordformbuilder._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",recentfilesmanagerrecordformbuilder._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private const RecentFilesListFile As String = \"Re";
recentfilesmanagerrecordformbuilder._recentfileslistfile = BA.ObjectToString("RecentFiles.txt");__ref.setField("_recentfileslistfile",recentfilesmanagerrecordformbuilder._recentfileslistfile);
 //BA.debugLineNum = 7;BA.debugLine="Private mFilesMenu As Menu";
recentfilesmanagerrecordformbuilder._mfilesmenu = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper");__ref.setField("_mfilesmenu",recentfilesmanagerrecordformbuilder._mfilesmenu);
 //BA.debugLineNum = 8;BA.debugLine="Private const RecentFileTag As String = \"RecentFi";
recentfilesmanagerrecordformbuilder._recentfiletag = BA.ObjectToString("RecentFile");__ref.setField("_recentfiletag",recentfilesmanagerrecordformbuilder._recentfiletag);
 //BA.debugLineNum = 9;BA.debugLine="Public MaxFiles As Int = 5";
recentfilesmanagerrecordformbuilder._maxfiles = BA.numberCast(int.class, 5);__ref.setField("_maxfiles",recentfilesmanagerrecordformbuilder._maxfiles);
 //BA.debugLineNum = 10;BA.debugLine="Private mCallback As Object";
recentfilesmanagerrecordformbuilder._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",recentfilesmanagerrecordformbuilder._mcallback);
 //BA.debugLineNum = 11;BA.debugLine="Private mEventName As String";
recentfilesmanagerrecordformbuilder._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",recentfilesmanagerrecordformbuilder._meventname);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _filesmenu) throws Exception{
try {
		Debug.PushSubsStack("Initialize (recentfilesmanagerrecordformbuilder) ","recentfilesmanagerrecordformbuilder",77,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "recentfilesmanagerrecordformbuilder","initialize", __ref, _ba, _callback, _eventname, _filesmenu);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _f = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("FilesMenu", _filesmenu);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="mCallback = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 16;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 17;BA.debugLine="RecentFiles = B4XCollections.CreateOrderedMap";
Debug.JustUpdateDeviceLine();
__ref.setField ("_recentfiles" /*RemoteObject*/ ,recentfilesmanagerrecordformbuilder._b4xcollections.runMethod(false,"_createorderedmap" /*RemoteObject*/ ));
 BA.debugLineNum = 18;BA.debugLine="mFilesMenu = FilesMenu";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mfilesmenu" /*RemoteObject*/ ,_filesmenu);
 BA.debugLineNum = 19;BA.debugLine="If File.Exists(xui.DefaultFolder, RecentFilesList";
Debug.JustUpdateDeviceLine();
if (recentfilesmanagerrecordformbuilder.__c.getField(false,"File").runMethod(true,"Exists",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(__ref.getField(true,"_recentfileslistfile" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 20;BA.debugLine="For Each f As String In File.ReadList(xui.Defaul";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = recentfilesmanagerrecordformbuilder.__c.getField(false,"File").runMethod(false,"ReadList",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(__ref.getField(true,"_recentfileslistfile" /*RemoteObject*/ )));
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_f = BA.ObjectToString(group6.runMethod(false,"Get",index6));Debug.locals.put("f", _f);
Debug.locals.put("f", _f);
 BA.debugLineNum = 21;BA.debugLine="If File.Exists(f, \"\") Then RecentFiles.Put(File";
Debug.JustUpdateDeviceLine();
if (recentfilesmanagerrecordformbuilder.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_f),(Object)(RemoteObject.createImmutable(""))).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_put" /*RemoteObject*/ ,(Object)((recentfilesmanagerrecordformbuilder.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_f)))),(Object)((_f)));};
 }
}Debug.locals.put("f", _f);
;
 BA.debugLineNum = 23;BA.debugLine="RecentFiles.Remove(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_remove" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable(""))));
 };
 BA.debugLineNum = 25;BA.debugLine="UpdateRecentList";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.docU.recentfilesmanagerrecordformbuilder.class, "_updaterecentlist" /*RemoteObject*/ );
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mnurecentfile_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("mnuRecentFile_Action (recentfilesmanagerrecordformbuilder) ","recentfilesmanagerrecordformbuilder",77,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("mnurecentfile_action")) { return __ref.runUserSub(false, "recentfilesmanagerrecordformbuilder","mnurecentfile_action", __ref);}
RemoteObject _mi = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
RemoteObject _f = RemoteObject.createImmutable("");
 BA.debugLineNum = 51;BA.debugLine="Private Sub mnuRecentFile_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Dim mi As MenuItem = Sender";
Debug.JustUpdateDeviceLine();
_mi = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_mi = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper"), recentfilesmanagerrecordformbuilder.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("mi", _mi);Debug.locals.put("mi", _mi);
 BA.debugLineNum = 53;BA.debugLine="Dim f As String = RecentFiles.GetDefault(mi.Text,";
Debug.JustUpdateDeviceLine();
_f = BA.ObjectToString(__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getdefault" /*RemoteObject*/ ,(Object)((_mi.runMethod(true,"getText"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 54;BA.debugLine="If f = \"\" Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_f,BA.ObjectToString(""))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 55;BA.debugLine="CallSub2(mCallback, mEventName & \"_Click\", f)";
Debug.JustUpdateDeviceLine();
recentfilesmanagerrecordformbuilder.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"))),(Object)((_f)));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _savelist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SaveList (recentfilesmanagerrecordformbuilder) ","recentfilesmanagerrecordformbuilder",77,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("savelist")) { return __ref.runUserSub(false, "recentfilesmanagerrecordformbuilder","savelist", __ref);}
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
 BA.debugLineNum = 69;BA.debugLine="Public Sub SaveList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="Dim files As List";
Debug.JustUpdateDeviceLine();
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("files", _files);
 BA.debugLineNum = 71;BA.debugLine="files.Initialize";
Debug.JustUpdateDeviceLine();
_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="For Each k As String In RecentFiles.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ );
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 73;BA.debugLine="files.Add(RecentFiles.Get(k))";
Debug.JustUpdateDeviceLine();
_files.runVoidMethod ("Add",(Object)(__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_get" /*RemoteObject*/ ,(Object)((_k)))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 75;BA.debugLine="File.WriteList(xui.DefaultFolder, RecentFilesList";
Debug.JustUpdateDeviceLine();
recentfilesmanagerrecordformbuilder.__c.getField(false,"File").runVoidMethod ("WriteList",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"getDefaultFolder")),(Object)(__ref.getField(true,"_recentfileslistfile" /*RemoteObject*/ )),(Object)(_files));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterecentlist(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateRecentList (recentfilesmanagerrecordformbuilder) ","recentfilesmanagerrecordformbuilder",77,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("updaterecentlist")) { return __ref.runUserSub(false, "recentfilesmanagerrecordformbuilder","updaterecentlist", __ref);}
int _i = 0;
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
RemoteObject _josepmi = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _sep = RemoteObject.declareNull("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
RemoteObject _keys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _f = RemoteObject.createImmutable("");
 BA.debugLineNum = 28;BA.debugLine="Private Sub UpdateRecentList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="For i = mFilesMenu.MenuItems.Size - 1 To 0 Step -";
Debug.JustUpdateDeviceLine();
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mfilesmenu" /*RemoteObject*/ ).runMethod(false,"getMenuItems").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 30;BA.debugLine="Dim m As MenuItem = mFilesMenu.MenuItems.Get(i)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_m = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper"), __ref.getField(false,"_mfilesmenu" /*RemoteObject*/ ).runMethod(false,"getMenuItems").runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 31;BA.debugLine="If m.Tag <> Null And m.Tag = RecentFileTag Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_m.runMethod(false,"getTag")) && RemoteObject.solveBoolean("=",_m.runMethod(false,"getTag"),(__ref.getField(true,"_recentfiletag" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 32;BA.debugLine="mFilesMenu.MenuItems.RemoveAt(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mfilesmenu" /*RemoteObject*/ ).runMethod(false,"getMenuItems").runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 35;BA.debugLine="If RecentFiles.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 36;BA.debugLine="Dim joSepMi As JavaObject";
Debug.JustUpdateDeviceLine();
_josepmi = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("joSepMi", _josepmi);
 BA.debugLineNum = 37;BA.debugLine="Dim sep As MenuItem = joSepMi.InitializeNewInsta";
Debug.JustUpdateDeviceLine();
_sep = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");
_sep = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper"), _josepmi.runMethod(false,"InitializeNewInstance",(Object)(BA.ObjectToString("javafx.scene.control.SeparatorMenuItem")),(Object)((recentfilesmanagerrecordformbuilder.__c.getField(false,"Null")))).getObject());Debug.locals.put("sep", _sep);Debug.locals.put("sep", _sep);
 BA.debugLineNum = 38;BA.debugLine="sep.Tag = RecentFileTag";
Debug.JustUpdateDeviceLine();
_sep.runMethod(false,"setTag",(__ref.getField(true,"_recentfiletag" /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="mFilesMenu.MenuItems.Add(sep)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mfilesmenu" /*RemoteObject*/ ).runMethod(false,"getMenuItems").runVoidMethod ("Add",(Object)((_sep.getObject())));
 BA.debugLineNum = 40;BA.debugLine="Dim keys As List = RecentFiles.Keys";
Debug.JustUpdateDeviceLine();
_keys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_keys = __ref.getField(false,"_recentfiles" /*RemoteObject*/ ).runClassMethod (b4j.docU.b4xorderedmap.class, "_getkeys" /*RemoteObject*/ );Debug.locals.put("keys", _keys);Debug.locals.put("keys", _keys);
 BA.debugLineNum = 41;BA.debugLine="For i = keys.Size - 1 To 0 Step -1";
Debug.JustUpdateDeviceLine();
{
final int step13 = -1;
final int limit13 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_keys.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 42;BA.debugLine="Dim f As String = keys.Get(i)";
Debug.JustUpdateDeviceLine();
_f = BA.ObjectToString(_keys.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("f", _f);Debug.locals.put("f", _f);
 BA.debugLineNum = 43;BA.debugLine="Dim m As MenuItem";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper");Debug.locals.put("m", _m);
 BA.debugLineNum = 44;BA.debugLine="m.Initialize(File.GetName(f), \"mnuRecentFile\")";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(recentfilesmanagerrecordformbuilder.__c.getField(false,"File").runMethod(true,"GetName",(Object)(_f))),(Object)(RemoteObject.createImmutable("mnuRecentFile")));
 BA.debugLineNum = 45;BA.debugLine="m.Tag = RecentFileTag";
Debug.JustUpdateDeviceLine();
_m.runMethod(false,"setTag",(__ref.getField(true,"_recentfiletag" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="mFilesMenu.MenuItems.Add(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mfilesmenu" /*RemoteObject*/ ).runMethod(false,"getMenuItems").runVoidMethod ("Add",(Object)((_m.getObject())));
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}