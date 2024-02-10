package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class recentfilesmanagerrecordformbuilder extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.recentfilesmanagerrecordformbuilder", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.recentfilesmanagerrecordformbuilder.class).invoke(this, new Object[] {null});
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
public b4j.docU.b4xorderedmap _recentfiles = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _recentfileslistfile = "";
public anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _mfilesmenu = null;
public String _recentfiletag = "";
public int _maxfiles = 0;
public Object _mcallback = null;
public String _meventname = "";
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
public String  _savelist(b4j.docU.recentfilesmanagerrecordformbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="recentfilesmanagerrecordformbuilder";
if (Debug.shouldDelegate(ba, "savelist", true))
	 {return ((String) Debug.delegate(ba, "savelist", null));}
anywheresoftware.b4a.objects.collections.List _files = null;
String _k = "";
RDebugUtils.currentLine=139657216;
 //BA.debugLineNum = 139657216;BA.debugLine="Public Sub SaveList";
RDebugUtils.currentLine=139657217;
 //BA.debugLineNum = 139657217;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=139657218;
 //BA.debugLineNum = 139657218;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=139657219;
 //BA.debugLineNum = 139657219;BA.debugLine="For Each k As String In RecentFiles.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=139657220;
 //BA.debugLineNum = 139657220;BA.debugLine="files.Add(RecentFiles.Get(k))";
_files.Add(__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_k)));
 }
};
RDebugUtils.currentLine=139657222;
 //BA.debugLineNum = 139657222;BA.debugLine="File.WriteList(xui.DefaultFolder, RecentFilesList";
__c.File.WriteList(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),__ref._recentfileslistfile /*String*/ ,_files);
RDebugUtils.currentLine=139657223;
 //BA.debugLineNum = 139657223;BA.debugLine="End Sub";
return "";
}
public String  _addfile(b4j.docU.recentfilesmanagerrecordformbuilder __ref,String _fullpath) throws Exception{
__ref = this;
RDebugUtils.currentModule="recentfilesmanagerrecordformbuilder";
if (Debug.shouldDelegate(ba, "addfile", true))
	 {return ((String) Debug.delegate(ba, "addfile", new Object[] {_fullpath}));}
String _name = "";
RDebugUtils.currentLine=139591680;
 //BA.debugLineNum = 139591680;BA.debugLine="Public Sub AddFile (FullPath As String)";
RDebugUtils.currentLine=139591681;
 //BA.debugLineNum = 139591681;BA.debugLine="If FullPath = \"\" Then Return";
if ((_fullpath).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=139591682;
 //BA.debugLineNum = 139591682;BA.debugLine="Dim name As String = File.GetName(FullPath)";
_name = __c.File.GetName(_fullpath);
RDebugUtils.currentLine=139591683;
 //BA.debugLineNum = 139591683;BA.debugLine="RecentFiles.Remove(name)";
__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(_name));
RDebugUtils.currentLine=139591684;
 //BA.debugLineNum = 139591684;BA.debugLine="RecentFiles.Put(name, FullPath)";
__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_name),(Object)(_fullpath));
RDebugUtils.currentLine=139591685;
 //BA.debugLineNum = 139591685;BA.debugLine="Do While RecentFiles.Size > MaxFiles";
while (__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._getsize /*int*/ (null)>__ref._maxfiles /*int*/ ) {
RDebugUtils.currentLine=139591686;
 //BA.debugLineNum = 139591686;BA.debugLine="RecentFiles.Remove(RecentFiles.Keys.Get(0))";
__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (0)));
 }
;
RDebugUtils.currentLine=139591688;
 //BA.debugLineNum = 139591688;BA.debugLine="UpdateRecentList";
__ref._updaterecentlist /*String*/ (null);
RDebugUtils.currentLine=139591689;
 //BA.debugLineNum = 139591689;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.recentfilesmanagerrecordformbuilder __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname,anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper _filesmenu) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="recentfilesmanagerrecordformbuilder";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname,_filesmenu}));}
String _f = "";
RDebugUtils.currentLine=139395072;
 //BA.debugLineNum = 139395072;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=139395073;
 //BA.debugLineNum = 139395073;BA.debugLine="mCallback = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=139395074;
 //BA.debugLineNum = 139395074;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=139395075;
 //BA.debugLineNum = 139395075;BA.debugLine="RecentFiles = B4XCollections.CreateOrderedMap";
__ref._recentfiles /*b4j.docU.b4xorderedmap*/  = _b4xcollections._createorderedmap /*b4j.docU.b4xorderedmap*/ ();
RDebugUtils.currentLine=139395076;
 //BA.debugLineNum = 139395076;BA.debugLine="mFilesMenu = FilesMenu";
__ref._mfilesmenu /*anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper*/  = _filesmenu;
RDebugUtils.currentLine=139395077;
 //BA.debugLineNum = 139395077;BA.debugLine="If File.Exists(xui.DefaultFolder, RecentFilesList";
if (__c.File.Exists(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),__ref._recentfileslistfile /*String*/ )) { 
RDebugUtils.currentLine=139395078;
 //BA.debugLineNum = 139395078;BA.debugLine="For Each f As String In File.ReadList(xui.Defaul";
{
final anywheresoftware.b4a.BA.IterableList group6 = __c.File.ReadList(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getDefaultFolder(),__ref._recentfileslistfile /*String*/ );
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_f = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=139395079;
 //BA.debugLineNum = 139395079;BA.debugLine="If File.Exists(f, \"\") Then RecentFiles.Put(File";
if (__c.File.Exists(_f,"")) { 
__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._put /*String*/ (null,(Object)(__c.File.GetName(_f)),(Object)(_f));};
 }
};
RDebugUtils.currentLine=139395081;
 //BA.debugLineNum = 139395081;BA.debugLine="RecentFiles.Remove(\"\")";
__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._remove /*String*/ (null,(Object)(""));
 };
RDebugUtils.currentLine=139395083;
 //BA.debugLineNum = 139395083;BA.debugLine="UpdateRecentList";
__ref._updaterecentlist /*String*/ (null);
RDebugUtils.currentLine=139395084;
 //BA.debugLineNum = 139395084;BA.debugLine="End Sub";
return "";
}
public String  _updaterecentlist(b4j.docU.recentfilesmanagerrecordformbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="recentfilesmanagerrecordformbuilder";
if (Debug.shouldDelegate(ba, "updaterecentlist", true))
	 {return ((String) Debug.delegate(ba, "updaterecentlist", null));}
int _i = 0;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _m = null;
anywheresoftware.b4j.object.JavaObject _josepmi = null;
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _sep = null;
anywheresoftware.b4a.objects.collections.List _keys = null;
String _f = "";
RDebugUtils.currentLine=139460608;
 //BA.debugLineNum = 139460608;BA.debugLine="Private Sub UpdateRecentList";
RDebugUtils.currentLine=139460609;
 //BA.debugLineNum = 139460609;BA.debugLine="For i = mFilesMenu.MenuItems.Size - 1 To 0 Step -";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._mfilesmenu /*anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper*/ .getMenuItems().getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=139460610;
 //BA.debugLineNum = 139460610;BA.debugLine="Dim m As MenuItem = mFilesMenu.MenuItems.Get(i)";
_m = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_m = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(__ref._mfilesmenu /*anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper*/ .getMenuItems().Get(_i)));
RDebugUtils.currentLine=139460611;
 //BA.debugLineNum = 139460611;BA.debugLine="If m.Tag <> Null And m.Tag = RecentFileTag Then";
if (_m.getTag()!= null && (_m.getTag()).equals((Object)(__ref._recentfiletag /*String*/ ))) { 
RDebugUtils.currentLine=139460612;
 //BA.debugLineNum = 139460612;BA.debugLine="mFilesMenu.MenuItems.RemoveAt(i)";
__ref._mfilesmenu /*anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper*/ .getMenuItems().RemoveAt(_i);
 };
 }
};
RDebugUtils.currentLine=139460615;
 //BA.debugLineNum = 139460615;BA.debugLine="If RecentFiles.Size > 0 Then";
if (__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=139460616;
 //BA.debugLineNum = 139460616;BA.debugLine="Dim joSepMi As JavaObject";
_josepmi = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=139460617;
 //BA.debugLineNum = 139460617;BA.debugLine="Dim sep As MenuItem = joSepMi.InitializeNewInsta";
_sep = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_sep = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(_josepmi.InitializeNewInstance("javafx.scene.control.SeparatorMenuItem",(Object[])(__c.Null)).getObject()));
RDebugUtils.currentLine=139460618;
 //BA.debugLineNum = 139460618;BA.debugLine="sep.Tag = RecentFileTag";
_sep.setTag((Object)(__ref._recentfiletag /*String*/ ));
RDebugUtils.currentLine=139460619;
 //BA.debugLineNum = 139460619;BA.debugLine="mFilesMenu.MenuItems.Add(sep)";
__ref._mfilesmenu /*anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper*/ .getMenuItems().Add((Object)(_sep.getObject()));
RDebugUtils.currentLine=139460620;
 //BA.debugLineNum = 139460620;BA.debugLine="Dim keys As List = RecentFiles.Keys";
_keys = new anywheresoftware.b4a.objects.collections.List();
_keys = __ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=139460621;
 //BA.debugLineNum = 139460621;BA.debugLine="For i = keys.Size - 1 To 0 Step -1";
{
final int step13 = -1;
final int limit13 = (int) (0);
_i = (int) (_keys.getSize()-1) ;
for (;_i >= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=139460622;
 //BA.debugLineNum = 139460622;BA.debugLine="Dim f As String = keys.Get(i)";
_f = BA.ObjectToString(_keys.Get(_i));
RDebugUtils.currentLine=139460623;
 //BA.debugLineNum = 139460623;BA.debugLine="Dim m As MenuItem";
_m = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
RDebugUtils.currentLine=139460624;
 //BA.debugLineNum = 139460624;BA.debugLine="m.Initialize(File.GetName(f), \"mnuRecentFile\")";
_m.Initialize(ba,__c.File.GetName(_f),"mnuRecentFile");
RDebugUtils.currentLine=139460625;
 //BA.debugLineNum = 139460625;BA.debugLine="m.Tag = RecentFileTag";
_m.setTag((Object)(__ref._recentfiletag /*String*/ ));
RDebugUtils.currentLine=139460626;
 //BA.debugLineNum = 139460626;BA.debugLine="mFilesMenu.MenuItems.Add(m)";
__ref._mfilesmenu /*anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper*/ .getMenuItems().Add((Object)(_m.getObject()));
 }
};
 };
RDebugUtils.currentLine=139460629;
 //BA.debugLineNum = 139460629;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.recentfilesmanagerrecordformbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="recentfilesmanagerrecordformbuilder";
RDebugUtils.currentLine=139329536;
 //BA.debugLineNum = 139329536;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=139329537;
 //BA.debugLineNum = 139329537;BA.debugLine="Private RecentFiles As B4XOrderedMap";
_recentfiles = new b4j.docU.b4xorderedmap();
RDebugUtils.currentLine=139329538;
 //BA.debugLineNum = 139329538;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=139329539;
 //BA.debugLineNum = 139329539;BA.debugLine="Private const RecentFilesListFile As String = \"Re";
_recentfileslistfile = "RecentFiles.txt";
RDebugUtils.currentLine=139329540;
 //BA.debugLineNum = 139329540;BA.debugLine="Private mFilesMenu As Menu";
_mfilesmenu = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuWrapper();
RDebugUtils.currentLine=139329541;
 //BA.debugLineNum = 139329541;BA.debugLine="Private const RecentFileTag As String = \"RecentFi";
_recentfiletag = "RecentFile";
RDebugUtils.currentLine=139329542;
 //BA.debugLineNum = 139329542;BA.debugLine="Public MaxFiles As Int = 5";
_maxfiles = (int) (5);
RDebugUtils.currentLine=139329543;
 //BA.debugLineNum = 139329543;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=139329544;
 //BA.debugLineNum = 139329544;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=139329545;
 //BA.debugLineNum = 139329545;BA.debugLine="End Sub";
return "";
}
public String  _mnurecentfile_action(b4j.docU.recentfilesmanagerrecordformbuilder __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="recentfilesmanagerrecordformbuilder";
if (Debug.shouldDelegate(ba, "mnurecentfile_action", true))
	 {return ((String) Debug.delegate(ba, "mnurecentfile_action", null));}
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
String _f = "";
RDebugUtils.currentLine=139526144;
 //BA.debugLineNum = 139526144;BA.debugLine="Private Sub mnuRecentFile_Action";
RDebugUtils.currentLine=139526145;
 //BA.debugLineNum = 139526145;BA.debugLine="Dim mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(__c.Sender(ba)));
RDebugUtils.currentLine=139526146;
 //BA.debugLineNum = 139526146;BA.debugLine="Dim f As String = RecentFiles.GetDefault(mi.Text,";
_f = BA.ObjectToString(__ref._recentfiles /*b4j.docU.b4xorderedmap*/ ._getdefault /*Object*/ (null,(Object)(_mi.getText()),(Object)("")));
RDebugUtils.currentLine=139526147;
 //BA.debugLineNum = 139526147;BA.debugLine="If f = \"\" Then Return";
if ((_f).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=139526148;
 //BA.debugLineNum = 139526148;BA.debugLine="CallSub2(mCallback, mEventName & \"_Click\", f)";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click",(Object)(_f));
RDebugUtils.currentLine=139526149;
 //BA.debugLineNum = 139526149;BA.debugLine="End Sub";
return "";
}
}