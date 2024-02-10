package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class cclientftp extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.cclientftp", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.cclientftp.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.Form _frm = null;
public String _localpath = "";
public String _ftppath = "";
public anywheresoftware.b4a.net.FTPWrapper _sftp = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.docU.draganddrop _draganddrop1 = null;
public anywheresoftware.b4j.objects.SplitPaneWrapper _splitpane1 = null;
public anywheresoftware.b4j.objects.TreeViewWrapper _treeviewlocal = null;
public anywheresoftware.b4j.objects.TreeViewWrapper _treeviewftp = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _vlocalpath = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _vftppath = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textftp = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textuser = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _textpassword = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper _textinfo = null;
public b4j.docU.sd_loadingindicator _sd_loadingindicator1 = null;
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
public String  _buttonconn_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonconn_click", false))
	 {return ((String) Debug.delegate(ba, "buttonconn_click", null));}
String _host = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=52428800;
 //BA.debugLineNum = 52428800;BA.debugLine="Private Sub ButtonConn_Click";
RDebugUtils.currentLine=52428801;
 //BA.debugLineNum = 52428801;BA.debugLine="Dim host As String = TextFTP.Text";
_host = __ref._textftp /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=52428802;
 //BA.debugLineNum = 52428802;BA.debugLine="Dim M As Map = File.ReadMap(File.DirApp,\"save.map";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.File.ReadMap(__c.File.getDirApp(),"save.map");
RDebugUtils.currentLine=52428804;
 //BA.debugLineNum = 52428804;BA.debugLine="Dim M As Map = CreateMap(\"localpath\":LocalPath,\"h";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("localpath"),(Object)(__ref._localpath /*String*/ ),(Object)("host"),(Object)(""),(Object)("user"),(Object)(""),(Object)("password"),(Object)("")});
RDebugUtils.currentLine=52428805;
 //BA.debugLineNum = 52428805;BA.debugLine="m.Put(\"host\",host)";
_m.Put((Object)("host"),(Object)(_host));
RDebugUtils.currentLine=52428806;
 //BA.debugLineNum = 52428806;BA.debugLine="M.Put(\"user\",TextUser.Text)";
_m.Put((Object)("user"),(Object)(__ref._textuser /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=52428807;
 //BA.debugLineNum = 52428807;BA.debugLine="m.put(\"password\",TextPassword.Text)";
_m.Put((Object)("password"),(Object)(__ref._textpassword /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()));
RDebugUtils.currentLine=52428808;
 //BA.debugLineNum = 52428808;BA.debugLine="File.WriteMap(File.DirApp,\"save.map\",m)";
__c.File.WriteMap(__c.File.getDirApp(),"save.map",_m);
RDebugUtils.currentLine=52428810;
 //BA.debugLineNum = 52428810;BA.debugLine="sFTP.Initialize(\"sftp\",host.Replace(\"ftp://\",\"\").";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .Initialize(ba,"sftp",_host.replace("ftp://","").replace("/",""),(int) (21),__ref._textuser /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText(),__ref._textpassword /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText());
RDebugUtils.currentLine=52428812;
 //BA.debugLineNum = 52428812;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=52428813;
 //BA.debugLineNum = 52428813;BA.debugLine="End Sub";
return "";
}
public void  _refreshftp(b4j.docU.cclientftp __ref) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "refreshftp", false))
	 {Debug.delegate(ba, "refreshftp", null); return;}
ResumableSub_refreshftp rsub = new ResumableSub_refreshftp(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_refreshftp extends BA.ResumableSub {
public ResumableSub_refreshftp(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper _fname = null;
anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper _fti = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] group8;
int index8;
int groupLen8;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53870593;
 //BA.debugLineNum = 53870593;BA.debugLine="FTPPath=FTPPath.Replace(\"//\",\"/\")";
__ref._ftppath /*String*/  = __ref._ftppath /*String*/ .replace("//","/");
RDebugUtils.currentLine=53870594;
 //BA.debugLineNum = 53870594;BA.debugLine="If FTPPath=\"\" Then FTPPath=\"/\"";
if (true) break;

case 1:
//if
this.state = 6;
if ((__ref._ftppath /*String*/ ).equals("")) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._ftppath /*String*/  = "/";
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=53870595;
 //BA.debugLineNum = 53870595;BA.debugLine="vFTPpath.Text=FTPPath";
__ref._vftppath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._ftppath /*String*/ );
RDebugUtils.currentLine=53870596;
 //BA.debugLineNum = 53870596;BA.debugLine="sFTP.List(FTPPath)";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .List(ba,__ref._ftppath /*String*/ );
RDebugUtils.currentLine=53870598;
 //BA.debugLineNum = 53870598;BA.debugLine="Wait For sftp_ListCompleted (ServerPath As String";
parent.__c.WaitFor("sftp_listcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "refreshftp"), null);
this.state = 18;
return;
case 18:
//C
this.state = 7;
_serverpath = (String) result[1];
_success = (boolean) result[2];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[4];
;
RDebugUtils.currentLine=53870600;
 //BA.debugLineNum = 53870600;BA.debugLine="If ServerPath=FTPPath Then";
if (true) break;

case 7:
//if
this.state = 17;
if ((_serverpath).equals(__ref._ftppath /*String*/ )) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=53870601;
 //BA.debugLineNum = 53870601;BA.debugLine="TreeViewFTP.Root.Children.Clear";
__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Clear();
RDebugUtils.currentLine=53870602;
 //BA.debugLineNum = 53870602;BA.debugLine="For Each fname As FTPEntry In Folders";
if (true) break;

case 10:
//for
this.state = 13;
group8 = _folders;
index8 = 0;
groupLen8 = group8.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index8 < groupLen8) {
this.state = 12;
_fname = group8[index8];}
if (true) break;

case 20:
//C
this.state = 19;
index8++;
if (true) break;

case 12:
//C
this.state = 20;
RDebugUtils.currentLine=53870603;
 //BA.debugLineNum = 53870603;BA.debugLine="Dim fti As CheckboxTreeItem";
_fti = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
RDebugUtils.currentLine=53870604;
 //BA.debugLineNum = 53870604;BA.debugLine="fti.Initialize(\"ti\",fname.Name)";
_fti.Initialize(ba,"ti",_fname.getName());
RDebugUtils.currentLine=53870605;
 //BA.debugLineNum = 53870605;BA.debugLine="fti.Image=fx.LoadImageSample(File.DirAssets,\"fo";
_fti.setImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(parent.__c.File.getDirAssets(),"folder.png",16,16).getObject()));
RDebugUtils.currentLine=53870606;
 //BA.debugLineNum = 53870606;BA.debugLine="fti.Checked=False";
_fti.setChecked(parent.__c.False);
RDebugUtils.currentLine=53870607;
 //BA.debugLineNum = 53870607;BA.debugLine="TreeViewFTP.Root.Children.Add(fti)";
__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Add((Object)(_fti.getObject()));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=53870610;
 //BA.debugLineNum = 53870610;BA.debugLine="For Each fname As FTPEntry In Files";

case 13:
//for
this.state = 16;
group15 = _files;
index15 = 0;
groupLen15 = group15.length;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 15;
_fname = group15[index15];}
if (true) break;

case 22:
//C
this.state = 21;
index15++;
if (true) break;

case 15:
//C
this.state = 22;
RDebugUtils.currentLine=53870611;
 //BA.debugLineNum = 53870611;BA.debugLine="Dim fti As CheckboxTreeItem";
_fti = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
RDebugUtils.currentLine=53870612;
 //BA.debugLineNum = 53870612;BA.debugLine="fti.Initialize(\"ti\",fname.Name)";
_fti.Initialize(ba,"ti",_fname.getName());
RDebugUtils.currentLine=53870613;
 //BA.debugLineNum = 53870613;BA.debugLine="fti.Checked=False";
_fti.setChecked(parent.__c.False);
RDebugUtils.currentLine=53870614;
 //BA.debugLineNum = 53870614;BA.debugLine="TreeViewFTP.Root.Children.Add(fti)";
__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Add((Object)(_fti.getObject()));
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
 if (true) break;

case 17:
//C
this.state = -1;
;
RDebugUtils.currentLine=53870617;
 //BA.debugLineNum = 53870617;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _buttondisc_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttondisc_click", false))
	 {return ((String) Debug.delegate(ba, "buttondisc_click", null));}
RDebugUtils.currentLine=52494336;
 //BA.debugLineNum = 52494336;BA.debugLine="Private Sub ButtonDisc_Click";
RDebugUtils.currentLine=52494337;
 //BA.debugLineNum = 52494337;BA.debugLine="sFTP.Close";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .Close();
RDebugUtils.currentLine=52494338;
 //BA.debugLineNum = 52494338;BA.debugLine="End Sub";
return "";
}
public void  _buttondownload_click(b4j.docU.cclientftp __ref) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttondownload_click", false))
	 {Debug.delegate(ba, "buttondownload_click", null); return;}
ResumableSub_ButtonDownLoad_Click rsub = new ResumableSub_ButtonDownLoad_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonDownLoad_Click extends BA.ResumableSub {
public ResumableSub_ButtonDownLoad_Click(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper _tn = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53215233;
 //BA.debugLineNum = 53215233;BA.debugLine="SD_LoadingIndicator1.Show";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=53215234;
 //BA.debugLineNum = 53215234;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewFTP.Ro";
if (true) break;

case 1:
//for
this.state = 8;
_tn = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
group2 = __ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren();
index2 = 0;
groupLen2 = group2.getSize();
this.state = 9;
if (true) break;

case 9:
//C
this.state = 8;
if (index2 < groupLen2) {
this.state = 3;
_tn = (anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper(), (javafx.scene.control.CheckBoxTreeItem)(group2.Get(index2)));}
if (true) break;

case 10:
//C
this.state = 9;
index2++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=53215235;
 //BA.debugLineNum = 53215235;BA.debugLine="If tn.Checked Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_tn.getChecked()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=53215236;
 //BA.debugLineNum = 53215236;BA.debugLine="wait for (download(LocalPath,FTPPath,tn.Text,tn";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "buttondownload_click"), __ref._download /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._localpath /*String*/ ,__ref._ftppath /*String*/ ,_tn.getText(),_tn.getImage().IsInitialized()));
this.state = 11;
return;
case 11:
//C
this.state = 7;
_success = (boolean) result[1];
;
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=53215239;
 //BA.debugLineNum = 53215239;BA.debugLine="refreshtree";
__ref._refreshtree /*String*/ (null);
RDebugUtils.currentLine=53215240;
 //BA.debugLineNum = 53215240;BA.debugLine="SD_LoadingIndicator1.Hide";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=53215241;
 //BA.debugLineNum = 53215241;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _download(b4j.docU.cclientftp __ref,String _local_path,String _ftp_path,String _ftp_file,boolean _isdir) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "download", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "download", new Object[] {_local_path,_ftp_path,_ftp_file,_isdir}));}
ResumableSub_download rsub = new ResumableSub_download(this,__ref,_local_path,_ftp_path,_ftp_file,_isdir);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_download extends BA.ResumableSub {
public ResumableSub_download(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref,String _local_path,String _ftp_path,String _ftp_file,boolean _isdir) {
this.parent = parent;
this.__ref = __ref;
this._local_path = _local_path;
this._ftp_path = _ftp_path;
this._ftp_file = _ftp_file;
this._isdir = _isdir;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
String _local_path;
String _ftp_path;
String _ftp_file;
boolean _isdir;
boolean _res = false;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper _fname = null;
String _filename = "";
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] group6;
int index6;
int groupLen6;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54198273;
 //BA.debugLineNum = 54198273;BA.debugLine="Dim Res As Boolean = False";
_res = parent.__c.False;
RDebugUtils.currentLine=54198275;
 //BA.debugLineNum = 54198275;BA.debugLine="If IsDir Then";
if (true) break;

case 1:
//if
this.state = 13;
if (_isdir) { 
this.state = 3;
}else {
this.state = 12;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=54198276;
 //BA.debugLineNum = 54198276;BA.debugLine="sFTP.List(ftp_path & \"/\" & ftp_file)";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .List(ba,_ftp_path+"/"+_ftp_file);
RDebugUtils.currentLine=54198278;
 //BA.debugLineNum = 54198278;BA.debugLine="File.MakeDir(local_path, ftp_file)";
parent.__c.File.MakeDir(_local_path,_ftp_file);
RDebugUtils.currentLine=54198280;
 //BA.debugLineNum = 54198280;BA.debugLine="Wait For sftp_ListCompleted (ServerPath As Strin";
parent.__c.WaitFor("sftp_listcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "download"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_serverpath = (String) result[1];
_success = (boolean) result[2];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[4];
;
RDebugUtils.currentLine=54198282;
 //BA.debugLineNum = 54198282;BA.debugLine="For Each fname As FTPEntry In Folders";
if (true) break;

case 4:
//for
this.state = 7;
group6 = _folders;
index6 = 0;
groupLen6 = group6.length;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if (index6 < groupLen6) {
this.state = 6;
_fname = group6[index6];}
if (true) break;

case 16:
//C
this.state = 15;
index6++;
if (true) break;

case 6:
//C
this.state = 16;
RDebugUtils.currentLine=54198283;
 //BA.debugLineNum = 54198283;BA.debugLine="Dim filename As String = fname.Name";
_filename = _fname.getName();
RDebugUtils.currentLine=54198284;
 //BA.debugLineNum = 54198284;BA.debugLine="Wait For (download(File.Combine(local_path,ftp_";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "download"), __ref._download /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.File.Combine(_local_path,_ftp_file),_ftp_path+"/"+_ftp_file,_filename,parent.__c.True));
this.state = 17;
return;
case 17:
//C
this.state = 16;
_success = (boolean) result[1];
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=54198287;
 //BA.debugLineNum = 54198287;BA.debugLine="For Each fname As FTPEntry In Files";

case 7:
//for
this.state = 10;
group10 = _files;
index10 = 0;
groupLen10 = group10.length;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_fname = group10[index10];}
if (true) break;

case 19:
//C
this.state = 18;
index10++;
if (true) break;

case 9:
//C
this.state = 19;
RDebugUtils.currentLine=54198288;
 //BA.debugLineNum = 54198288;BA.debugLine="Dim filename As String = fname.Name";
_filename = _fname.getName();
RDebugUtils.currentLine=54198289;
 //BA.debugLineNum = 54198289;BA.debugLine="Wait For (download(File.Combine(local_path,ftp_";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "download"), __ref._download /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,parent.__c.File.Combine(_local_path,_ftp_file),_ftp_path+"/"+_ftp_file,_filename,parent.__c.False));
this.state = 20;
return;
case 20:
//C
this.state = 19;
_success = (boolean) result[1];
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=54198293;
 //BA.debugLineNum = 54198293;BA.debugLine="sFTP.DownloadFile(ftp_path & \"/\" & ftp_file,Fals";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .DownloadFile(ba,_ftp_path+"/"+_ftp_file,parent.__c.False,_local_path,_ftp_file);
RDebugUtils.currentLine=54198295;
 //BA.debugLineNum = 54198295;BA.debugLine="Wait For sftp_DownloadCompleted (ServerPath As S";
parent.__c.WaitFor("sftp_downloadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "download"), null);
this.state = 21;
return;
case 21:
//C
this.state = 13;
_serverpath = (String) result[1];
_success = (boolean) result[2];
;
RDebugUtils.currentLine=54198296;
 //BA.debugLineNum = 54198296;BA.debugLine="logInfo($\"Download file: ${ftp_path & \"/\" & ftp_";
__ref._loginfo /*String*/ (null,("Download file: "+parent.__c.SmartStringFormatter("",(Object)(_ftp_path+"/"+_ftp_file))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
RDebugUtils.currentLine=54198297;
 //BA.debugLineNum = 54198297;BA.debugLine="Res=Success";
_res = _success;
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=54198300;
 //BA.debugLineNum = 54198300;BA.debugLine="Return Res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=54198301;
 //BA.debugLineNum = 54198301;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refreshtree(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "refreshtree", false))
	 {return ((String) Debug.delegate(ba, "refreshtree", null));}
RDebugUtils.currentLine=53805056;
 //BA.debugLineNum = 53805056;BA.debugLine="Public Sub refreshtree";
RDebugUtils.currentLine=53805057;
 //BA.debugLineNum = 53805057;BA.debugLine="If LocalPath.EndsWith(\":\") Then LocalPath=LocalPa";
if (__ref._localpath /*String*/ .endsWith(":")) { 
__ref._localpath /*String*/  = __ref._localpath /*String*/ +"\\";};
RDebugUtils.currentLine=53805058;
 //BA.debugLineNum = 53805058;BA.debugLine="If File.Exists(LocalPath,\"\") = False Then LocalPa";
if (__c.File.Exists(__ref._localpath /*String*/ ,"")==__c.False) { 
__ref._localpath /*String*/  = "C:\\";};
RDebugUtils.currentLine=53805060;
 //BA.debugLineNum = 53805060;BA.debugLine="TreeViewLocal.Root.Children.Clear";
__ref._treeviewlocal /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Clear();
RDebugUtils.currentLine=53805061;
 //BA.debugLineNum = 53805061;BA.debugLine="vLocalPath.Text=LocalPath";
__ref._vlocalpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(__ref._localpath /*String*/ );
RDebugUtils.currentLine=53805062;
 //BA.debugLineNum = 53805062;BA.debugLine="scanpath(LocalPath,TreeViewLocal.Root)";
__ref._scanpath /*String*/ (null,__ref._localpath /*String*/ ,__ref._treeviewlocal /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot());
RDebugUtils.currentLine=53805063;
 //BA.debugLineNum = 53805063;BA.debugLine="End Sub";
return "";
}
public void  _buttonftpdel_click(b4j.docU.cclientftp __ref) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonftpdel_click", false))
	 {Debug.delegate(ba, "buttonftpdel_click", null); return;}
ResumableSub_ButtonFTPdel_Click rsub = new ResumableSub_ButtonFTPdel_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonFTPdel_Click extends BA.ResumableSub {
public ResumableSub_ButtonFTPdel_Click(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
int _result = 0;
anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper _tn = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53084161;
 //BA.debugLineNum = 53084161;BA.debugLine="Wait For (xui.Msgbox2Async(\"Are you sure?\",\"DELET";
parent.__c.WaitFor("msgbox_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "buttonftpdel_click"), __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Msgbox2Async(ba,"Are you sure?","DELETE","Ok","","No, no no",(javafx.scene.image.Image)(parent.__c.Null)));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_result = (int) result[1];
;
RDebugUtils.currentLine=53084162;
 //BA.debugLineNum = 53084162;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=53084163;
 //BA.debugLineNum = 53084163;BA.debugLine="SD_LoadingIndicator1.Show";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=53084164;
 //BA.debugLineNum = 53084164;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewFTP.R";
if (true) break;

case 4:
//for
this.state = 11;
_tn = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
group4 = __ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren();
index4 = 0;
groupLen4 = group4.getSize();
this.state = 14;
if (true) break;

case 14:
//C
this.state = 11;
if (index4 < groupLen4) {
this.state = 6;
_tn = (anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper(), (javafx.scene.control.CheckBoxTreeItem)(group4.Get(index4)));}
if (true) break;

case 15:
//C
this.state = 14;
index4++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=53084165;
 //BA.debugLineNum = 53084165;BA.debugLine="If tn.Checked Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_tn.getChecked()) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=53084166;
 //BA.debugLineNum = 53084166;BA.debugLine="wait for (deleteftp(FTPPath,tn.Text,tn.Image.I";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "buttonftpdel_click"), __ref._deleteftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._ftppath /*String*/ ,_tn.getText(),_tn.getImage().IsInitialized()));
this.state = 16;
return;
case 16:
//C
this.state = 10;
_success = (boolean) result[1];
;
 if (true) break;

case 10:
//C
this.state = 15;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=53084169;
 //BA.debugLineNum = 53084169;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=53084170;
 //BA.debugLineNum = 53084170;BA.debugLine="SD_LoadingIndicator1.Hide";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._hide /*String*/ (null);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=53084172;
 //BA.debugLineNum = 53084172;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _deleteftp(b4j.docU.cclientftp __ref,String _ftp_path,String _ftp_file,boolean _isdir) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "deleteftp", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "deleteftp", new Object[] {_ftp_path,_ftp_file,_isdir}));}
ResumableSub_deleteftp rsub = new ResumableSub_deleteftp(this,__ref,_ftp_path,_ftp_file,_isdir);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_deleteftp extends BA.ResumableSub {
public ResumableSub_deleteftp(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref,String _ftp_path,String _ftp_file,boolean _isdir) {
this.parent = parent;
this.__ref = __ref;
this._ftp_path = _ftp_path;
this._ftp_file = _ftp_file;
this._isdir = _isdir;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
String _ftp_path;
String _ftp_file;
boolean _isdir;
boolean _res = false;
String _serverpath = "";
boolean _success = false;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _folders = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] _files = null;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper _fname = null;
String _filename = "";
String _command = "";
int _replycode = 0;
String _replystring = "";
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] group5;
int index5;
int groupLen5;
anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[] group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54132737;
 //BA.debugLineNum = 54132737;BA.debugLine="Dim Res As Boolean = False";
_res = parent.__c.False;
RDebugUtils.currentLine=54132739;
 //BA.debugLineNum = 54132739;BA.debugLine="If IsDir Then";
if (true) break;

case 1:
//if
this.state = 13;
if (_isdir) { 
this.state = 3;
}else {
this.state = 12;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=54132740;
 //BA.debugLineNum = 54132740;BA.debugLine="sFTP.List(ftp_path & \"/\" & ftp_file)";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .List(ba,_ftp_path+"/"+_ftp_file);
RDebugUtils.currentLine=54132742;
 //BA.debugLineNum = 54132742;BA.debugLine="Wait For sftp_ListCompleted (ServerPath As Strin";
parent.__c.WaitFor("sftp_listcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "deleteftp"), null);
this.state = 14;
return;
case 14:
//C
this.state = 4;
_serverpath = (String) result[1];
_success = (boolean) result[2];
_folders = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[3];
_files = (anywheresoftware.b4a.net.FTPWrapper.FTPFileWrapper[]) result[4];
;
RDebugUtils.currentLine=54132744;
 //BA.debugLineNum = 54132744;BA.debugLine="For Each fname As FTPEntry In Folders";
if (true) break;

case 4:
//for
this.state = 7;
group5 = _folders;
index5 = 0;
groupLen5 = group5.length;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if (index5 < groupLen5) {
this.state = 6;
_fname = group5[index5];}
if (true) break;

case 16:
//C
this.state = 15;
index5++;
if (true) break;

case 6:
//C
this.state = 16;
RDebugUtils.currentLine=54132745;
 //BA.debugLineNum = 54132745;BA.debugLine="Dim filename As String = fname.Name";
_filename = _fname.getName();
RDebugUtils.currentLine=54132746;
 //BA.debugLineNum = 54132746;BA.debugLine="Wait For (deleteftp(ftp_path & \"/\" & ftp_file,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "deleteftp"), __ref._deleteftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ftp_path+"/"+_ftp_file,_filename,parent.__c.True));
this.state = 17;
return;
case 17:
//C
this.state = 16;
_success = (boolean) result[1];
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=54132749;
 //BA.debugLineNum = 54132749;BA.debugLine="For Each fname As FTPEntry In Files";

case 7:
//for
this.state = 10;
group9 = _files;
index9 = 0;
groupLen9 = group9.length;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index9 < groupLen9) {
this.state = 9;
_fname = group9[index9];}
if (true) break;

case 19:
//C
this.state = 18;
index9++;
if (true) break;

case 9:
//C
this.state = 19;
RDebugUtils.currentLine=54132750;
 //BA.debugLineNum = 54132750;BA.debugLine="Dim filename As String = fname.Name";
_filename = _fname.getName();
RDebugUtils.currentLine=54132751;
 //BA.debugLineNum = 54132751;BA.debugLine="Wait For (deleteftp(ftp_path & \"/\" & ftp_file,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "deleteftp"), __ref._deleteftp /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_ftp_path+"/"+_ftp_file,_filename,parent.__c.False));
this.state = 20;
return;
case 20:
//C
this.state = 19;
_success = (boolean) result[1];
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
RDebugUtils.currentLine=54132754;
 //BA.debugLineNum = 54132754;BA.debugLine="sFTP.SendCommand(\"RMD\",ftp_path & \"/\" & ftp_file";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .SendCommand(ba,"RMD",_ftp_path+"/"+_ftp_file);
RDebugUtils.currentLine=54132755;
 //BA.debugLineNum = 54132755;BA.debugLine="Wait For sftp_CommandCompleted (Command As Strin";
parent.__c.WaitFor("sftp_commandcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "deleteftp"), null);
this.state = 21;
return;
case 21:
//C
this.state = 13;
_command = (String) result[1];
_success = (boolean) result[2];
_replycode = (int) result[3];
_replystring = (String) result[4];
;
RDebugUtils.currentLine=54132756;
 //BA.debugLineNum = 54132756;BA.debugLine="logInfo($\"Delete path: ${ftp_path & \"/\" & ftp_fi";
__ref._loginfo /*String*/ (null,("Delete path: "+parent.__c.SmartStringFormatter("",(Object)(_ftp_path+"/"+_ftp_file))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=54132758;
 //BA.debugLineNum = 54132758;BA.debugLine="sFTP.DeleteFile(ftp_path & \"/\" & ftp_file)";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .DeleteFile(ba,_ftp_path+"/"+_ftp_file);
RDebugUtils.currentLine=54132760;
 //BA.debugLineNum = 54132760;BA.debugLine="Wait For sftp_DeleteCompleted (ServerPath As Str";
parent.__c.WaitFor("sftp_deletecompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "deleteftp"), null);
this.state = 22;
return;
case 22:
//C
this.state = 13;
_serverpath = (String) result[1];
_success = (boolean) result[2];
;
RDebugUtils.currentLine=54132761;
 //BA.debugLineNum = 54132761;BA.debugLine="logInfo($\"Delete file: ${ftp_path & \"/\" & ftp_fi";
__ref._loginfo /*String*/ (null,("Delete file: "+parent.__c.SmartStringFormatter("",(Object)(_ftp_path+"/"+_ftp_file))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
RDebugUtils.currentLine=54132762;
 //BA.debugLineNum = 54132762;BA.debugLine="Res=Success";
_res = _success;
 if (true) break;

case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=54132765;
 //BA.debugLineNum = 54132765;BA.debugLine="Return Res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=54132766;
 //BA.debugLineNum = 54132766;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _buttonftpup_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonftpup_click", false))
	 {return ((String) Debug.delegate(ba, "buttonftpup_click", null));}
int _i = 0;
RDebugUtils.currentLine=52887552;
 //BA.debugLineNum = 52887552;BA.debugLine="Private Sub ButtonFTPup_Click";
RDebugUtils.currentLine=52887553;
 //BA.debugLineNum = 52887553;BA.debugLine="If FTPPath<>\"/\"  Then";
if ((__ref._ftppath /*String*/ ).equals("/") == false) { 
RDebugUtils.currentLine=52887554;
 //BA.debugLineNum = 52887554;BA.debugLine="Dim i As Int = FTPPath.LastIndexOf(\"/\")";
_i = __ref._ftppath /*String*/ .lastIndexOf("/");
RDebugUtils.currentLine=52887555;
 //BA.debugLineNum = 52887555;BA.debugLine="FTPPath=FTPPath.SubString2(0,i)";
__ref._ftppath /*String*/  = __ref._ftppath /*String*/ .substring((int) (0),_i);
 };
RDebugUtils.currentLine=52887557;
 //BA.debugLineNum = 52887557;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=52887558;
 //BA.debugLineNum = 52887558;BA.debugLine="End Sub";
return "";
}
public String  _buttonhome_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonhome_click", false))
	 {return ((String) Debug.delegate(ba, "buttonhome_click", null));}
RDebugUtils.currentLine=52559872;
 //BA.debugLineNum = 52559872;BA.debugLine="Private Sub ButtonHome_Click";
RDebugUtils.currentLine=52559873;
 //BA.debugLineNum = 52559873;BA.debugLine="LocalPath=\"C:\\\"";
__ref._localpath /*String*/  = "C:\\";
RDebugUtils.currentLine=52559874;
 //BA.debugLineNum = 52559874;BA.debugLine="refreshtree";
__ref._refreshtree /*String*/ (null);
RDebugUtils.currentLine=52559875;
 //BA.debugLineNum = 52559875;BA.debugLine="End Sub";
return "";
}
public String  _buttonlocaldel_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonlocaldel_click", false))
	 {return ((String) Debug.delegate(ba, "buttonlocaldel_click", null));}
anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper _tn = null;
RDebugUtils.currentLine=53018624;
 //BA.debugLineNum = 53018624;BA.debugLine="Private Sub ButtonLocalDel_Click";
RDebugUtils.currentLine=53018625;
 //BA.debugLineNum = 53018625;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewLocal.";
_tn = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._treeviewlocal /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_tn = (anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper(), (javafx.scene.control.CheckBoxTreeItem)(group1.Get(index1)));
RDebugUtils.currentLine=53018626;
 //BA.debugLineNum = 53018626;BA.debugLine="If tn.Checked Then";
if (_tn.getChecked()) { 
RDebugUtils.currentLine=53018627;
 //BA.debugLineNum = 53018627;BA.debugLine="Log(tn.Text)";
__c.LogImpl("853018627",_tn.getText(),0);
 };
 }
};
RDebugUtils.currentLine=53018630;
 //BA.debugLineNum = 53018630;BA.debugLine="End Sub";
return "";
}
public String  _buttonlocalrefresh_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonlocalrefresh_click", false))
	 {return ((String) Debug.delegate(ba, "buttonlocalrefresh_click", null));}
RDebugUtils.currentLine=53346304;
 //BA.debugLineNum = 53346304;BA.debugLine="Private Sub ButtonLocalRefresh_Click";
RDebugUtils.currentLine=53346305;
 //BA.debugLineNum = 53346305;BA.debugLine="refreshtree";
__ref._refreshtree /*String*/ (null);
RDebugUtils.currentLine=53346306;
 //BA.debugLineNum = 53346306;BA.debugLine="End Sub";
return "";
}
public String  _buttonlocalup_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonlocalup_click", false))
	 {return ((String) Debug.delegate(ba, "buttonlocalup_click", null));}
int _i = 0;
RDebugUtils.currentLine=52953088;
 //BA.debugLineNum = 52953088;BA.debugLine="Private Sub ButtonLocalUp_Click";
RDebugUtils.currentLine=52953089;
 //BA.debugLineNum = 52953089;BA.debugLine="Dim i As Int = LocalPath.LastIndexOf(\"\\\")";
_i = __ref._localpath /*String*/ .lastIndexOf("\\");
RDebugUtils.currentLine=52953090;
 //BA.debugLineNum = 52953090;BA.debugLine="LocalPath=LocalPath.SubString2(0,i)";
__ref._localpath /*String*/  = __ref._localpath /*String*/ .substring((int) (0),_i);
RDebugUtils.currentLine=52953091;
 //BA.debugLineNum = 52953091;BA.debugLine="refreshtree";
__ref._refreshtree /*String*/ (null);
RDebugUtils.currentLine=52953092;
 //BA.debugLineNum = 52953092;BA.debugLine="End Sub";
return "";
}
public String  _buttonrefresh_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonrefresh_click", false))
	 {return ((String) Debug.delegate(ba, "buttonrefresh_click", null));}
RDebugUtils.currentLine=53280768;
 //BA.debugLineNum = 53280768;BA.debugLine="Private Sub ButtonRefresh_Click";
RDebugUtils.currentLine=53280769;
 //BA.debugLineNum = 53280769;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=53280770;
 //BA.debugLineNum = 53280770;BA.debugLine="End Sub";
return "";
}
public String  _buttonroot_click(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonroot_click", false))
	 {return ((String) Debug.delegate(ba, "buttonroot_click", null));}
RDebugUtils.currentLine=52625408;
 //BA.debugLineNum = 52625408;BA.debugLine="Private Sub ButtonRoot_Click";
RDebugUtils.currentLine=52625409;
 //BA.debugLineNum = 52625409;BA.debugLine="FTPPath=\"/\"";
__ref._ftppath /*String*/  = "/";
RDebugUtils.currentLine=52625410;
 //BA.debugLineNum = 52625410;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=52625411;
 //BA.debugLineNum = 52625411;BA.debugLine="End Sub";
return "";
}
public void  _buttonupload_click(b4j.docU.cclientftp __ref) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "buttonupload_click", false))
	 {Debug.delegate(ba, "buttonupload_click", null); return;}
ResumableSub_ButtonUpLoad_Click rsub = new ResumableSub_ButtonUpLoad_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonUpLoad_Click extends BA.ResumableSub {
public ResumableSub_ButtonUpLoad_Click(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper _tn = null;
String _filename = "";
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group2;
int index2;
int groupLen2;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53149697;
 //BA.debugLineNum = 53149697;BA.debugLine="SD_LoadingIndicator1.Show";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=53149699;
 //BA.debugLineNum = 53149699;BA.debugLine="For Each tn As CheckboxTreeItem In TreeViewLocal.";
if (true) break;

case 1:
//for
this.state = 14;
_tn = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
group2 = __ref._treeviewlocal /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren();
index2 = 0;
groupLen2 = group2.getSize();
this.state = 15;
if (true) break;

case 15:
//C
this.state = 14;
if (index2 < groupLen2) {
this.state = 3;
_tn = (anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper(), (javafx.scene.control.CheckBoxTreeItem)(group2.Get(index2)));}
if (true) break;

case 16:
//C
this.state = 15;
index2++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=53149700;
 //BA.debugLineNum = 53149700;BA.debugLine="If tn.Checked Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_tn.getChecked()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=53149701;
 //BA.debugLineNum = 53149701;BA.debugLine="Dim filename As String = File.Combine(LocalPath";
_filename = parent.__c.File.Combine(__ref._localpath /*String*/ ,_tn.getText());
RDebugUtils.currentLine=53149702;
 //BA.debugLineNum = 53149702;BA.debugLine="If File.IsDirectory(\"\",filename) Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent.__c.File.IsDirectory("",_filename)) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=53149703;
 //BA.debugLineNum = 53149703;BA.debugLine="Wait For (upload(filename,FTPPath & \"/\" & File";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "buttonupload_click"), __ref._upload /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filename,__ref._ftppath /*String*/ +"/"+parent.__c.File.GetName(_filename)));
this.state = 17;
return;
case 17:
//C
this.state = 12;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=53149704;
 //BA.debugLineNum = 53149704;BA.debugLine="logInfo($\"Create path: ${filename}: ${Success}";
__ref._loginfo /*String*/ (null,("Create path: "+parent.__c.SmartStringFormatter("",(Object)(_filename))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=53149706;
 //BA.debugLineNum = 53149706;BA.debugLine="Wait For (upload(filename,FTPPath)) complete (";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "buttonupload_click"), __ref._upload /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filename,__ref._ftppath /*String*/ ));
this.state = 18;
return;
case 18:
//C
this.state = 12;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=53149707;
 //BA.debugLineNum = 53149707;BA.debugLine="logInfo($\"Upload: ${filename}: ${Success}\"$)";
__ref._loginfo /*String*/ (null,("Upload: "+parent.__c.SmartStringFormatter("",(Object)(_filename))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
 if (true) break;

case 12:
//C
this.state = 13;
;
 if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=53149711;
 //BA.debugLineNum = 53149711;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=53149712;
 //BA.debugLineNum = 53149712;BA.debugLine="SD_LoadingIndicator1.Hide";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=53149713;
 //BA.debugLineNum = 53149713;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _upload(b4j.docU.cclientftp __ref,String _local_filepath,String _ftp_path) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "upload", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "upload", new Object[] {_local_filepath,_ftp_path}));}
ResumableSub_upload rsub = new ResumableSub_upload(this,__ref,_local_filepath,_ftp_path);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_upload extends BA.ResumableSub {
public ResumableSub_upload(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref,String _local_filepath,String _ftp_path) {
this.parent = parent;
this.__ref = __ref;
this._local_filepath = _local_filepath;
this._ftp_path = _ftp_path;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
String _local_filepath;
String _ftp_path;
boolean _res = false;
String _command = "";
boolean _success = false;
int _replycode = 0;
String _replystring = "";
String _filename = "";
String _ph = "";
String _fn = "";
String _serverpath = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=54067201;
 //BA.debugLineNum = 54067201;BA.debugLine="Dim Res As Boolean = False";
_res = parent.__c.False;
RDebugUtils.currentLine=54067203;
 //BA.debugLineNum = 54067203;BA.debugLine="If File.IsDirectory(\"\",local_filepath) Then";
if (true) break;

case 1:
//if
this.state = 26;
if (parent.__c.File.IsDirectory("",_local_filepath)) { 
this.state = 3;
}else {
this.state = 25;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=54067204;
 //BA.debugLineNum = 54067204;BA.debugLine="sFTP.SendCommand(\"MKD\", ftp_path)";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .SendCommand(ba,"MKD",_ftp_path);
RDebugUtils.currentLine=54067206;
 //BA.debugLineNum = 54067206;BA.debugLine="Wait For sftp_CommandCompleted (Command As Strin";
parent.__c.WaitFor("sftp_commandcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "upload"), null);
this.state = 27;
return;
case 27:
//C
this.state = 4;
_command = (String) result[1];
_success = (boolean) result[2];
_replycode = (int) result[3];
_replystring = (String) result[4];
;
RDebugUtils.currentLine=54067207;
 //BA.debugLineNum = 54067207;BA.debugLine="If ReplyCode=\"550\" Then Success=True";
if (true) break;

case 4:
//if
this.state = 9;
if (_replycode==(double)(Double.parseDouble("550"))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_success = parent.__c.True;
if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=54067208;
 //BA.debugLineNum = 54067208;BA.debugLine="Res=Success";
_res = _success;
RDebugUtils.currentLine=54067209;
 //BA.debugLineNum = 54067209;BA.debugLine="If Success Then";
if (true) break;

case 10:
//if
this.state = 23;
if (_success) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=54067210;
 //BA.debugLineNum = 54067210;BA.debugLine="For Each filename As String In File.ListFiles(l";
if (true) break;

case 13:
//for
this.state = 22;
group8 = parent.__c.File.ListFiles(_local_filepath);
index8 = 0;
groupLen8 = group8.getSize();
this.state = 28;
if (true) break;

case 28:
//C
this.state = 22;
if (index8 < groupLen8) {
this.state = 15;
_filename = BA.ObjectToString(group8.Get(index8));}
if (true) break;

case 29:
//C
this.state = 28;
index8++;
if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=54067211;
 //BA.debugLineNum = 54067211;BA.debugLine="If File.IsDirectory(local_filepath,filename) T";
if (true) break;

case 16:
//if
this.state = 21;
if (parent.__c.File.IsDirectory(_local_filepath,_filename)) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=54067213;
 //BA.debugLineNum = 54067213;BA.debugLine="Wait For (upload(local_filepath & \"\\\" & filen";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "upload"), __ref._upload /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_local_filepath+"\\"+_filename,_ftp_path+"/"+_filename));
this.state = 30;
return;
case 30:
//C
this.state = 21;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=54067214;
 //BA.debugLineNum = 54067214;BA.debugLine="logInfo($\"Create path: ${filename}: ${Success";
__ref._loginfo /*String*/ (null,("Create path: "+parent.__c.SmartStringFormatter("",(Object)(_filename))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=54067217;
 //BA.debugLineNum = 54067217;BA.debugLine="Wait For (upload(local_filepath & \"\\\" & filen";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "upload"), __ref._upload /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_local_filepath+"\\"+_filename,_ftp_path));
this.state = 31;
return;
case 31:
//C
this.state = 21;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=54067218;
 //BA.debugLineNum = 54067218;BA.debugLine="logInfo($\"Upload: ${filename}: ${Success}\"$)";
__ref._loginfo /*String*/ (null,("Upload: "+parent.__c.SmartStringFormatter("",(Object)(_filename))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
 if (true) break;

case 21:
//C
this.state = 29;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
;
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=54067223;
 //BA.debugLineNum = 54067223;BA.debugLine="Dim Ph As String = File.GetFileParent(local_file";
_ph = parent.__c.File.GetFileParent(_local_filepath);
RDebugUtils.currentLine=54067224;
 //BA.debugLineNum = 54067224;BA.debugLine="Dim fn As String = File.GetName(local_filepath)";
_fn = parent.__c.File.GetName(_local_filepath);
RDebugUtils.currentLine=54067225;
 //BA.debugLineNum = 54067225;BA.debugLine="sFTP.UploadFile(Ph,fn,False,ftp_path & \"/\" & fn)";
__ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .UploadFile(ba,_ph,_fn,parent.__c.False,_ftp_path+"/"+_fn);
RDebugUtils.currentLine=54067227;
 //BA.debugLineNum = 54067227;BA.debugLine="Wait For sftp_UploadCompleted (ServerPath As Str";
parent.__c.WaitFor("sftp_uploadcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "upload"), null);
this.state = 32;
return;
case 32:
//C
this.state = 26;
_serverpath = (String) result[1];
_success = (boolean) result[2];
;
RDebugUtils.currentLine=54067228;
 //BA.debugLineNum = 54067228;BA.debugLine="Res=Success";
_res = _success;
 if (true) break;

case 26:
//C
this.state = -1;
;
RDebugUtils.currentLine=54067231;
 //BA.debugLineNum = 54067231;BA.debugLine="Return Res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=54067232;
 //BA.debugLineNum = 54067232;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _loginfo(b4j.docU.cclientftp __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "loginfo", false))
	 {return ((String) Debug.delegate(ba, "loginfo", new Object[] {_text}));}
RDebugUtils.currentLine=54001664;
 //BA.debugLineNum = 54001664;BA.debugLine="Private Sub logInfo(Text As String)";
RDebugUtils.currentLine=54001665;
 //BA.debugLineNum = 54001665;BA.debugLine="TextInfo.Text=TextInfo.Text & Text & CRLF";
__ref._textinfo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .setText(__ref._textinfo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .getText()+_text+__c.CRLF);
RDebugUtils.currentLine=54001666;
 //BA.debugLineNum = 54001666;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
RDebugUtils.currentLine=52035584;
 //BA.debugLineNum = 52035584;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=52035585;
 //BA.debugLineNum = 52035585;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=52035586;
 //BA.debugLineNum = 52035586;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
RDebugUtils.currentLine=52035587;
 //BA.debugLineNum = 52035587;BA.debugLine="Private LocalPath As String = \"C:\\\"";
_localpath = "C:\\";
RDebugUtils.currentLine=52035588;
 //BA.debugLineNum = 52035588;BA.debugLine="Private FTPPath As String = \"/\"";
_ftppath = "/";
RDebugUtils.currentLine=52035589;
 //BA.debugLineNum = 52035589;BA.debugLine="Private sFTP As FTP";
_sftp = new anywheresoftware.b4a.net.FTPWrapper();
RDebugUtils.currentLine=52035591;
 //BA.debugLineNum = 52035591;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=52035593;
 //BA.debugLineNum = 52035593;BA.debugLine="Private DragAndDrop1 As DragAndDrop";
_draganddrop1 = new b4j.docU.draganddrop();
RDebugUtils.currentLine=52035595;
 //BA.debugLineNum = 52035595;BA.debugLine="Private SplitPane1 As SplitPane";
_splitpane1 = new anywheresoftware.b4j.objects.SplitPaneWrapper();
RDebugUtils.currentLine=52035596;
 //BA.debugLineNum = 52035596;BA.debugLine="Private TreeViewLocal As TreeView";
_treeviewlocal = new anywheresoftware.b4j.objects.TreeViewWrapper();
RDebugUtils.currentLine=52035597;
 //BA.debugLineNum = 52035597;BA.debugLine="Private TreeViewFTP As TreeView";
_treeviewftp = new anywheresoftware.b4j.objects.TreeViewWrapper();
RDebugUtils.currentLine=52035599;
 //BA.debugLineNum = 52035599;BA.debugLine="Private vLocalPath As TextField";
_vlocalpath = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=52035600;
 //BA.debugLineNum = 52035600;BA.debugLine="Private vFTPpath As TextField";
_vftppath = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=52035601;
 //BA.debugLineNum = 52035601;BA.debugLine="Private TextFTP As TextField";
_textftp = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=52035602;
 //BA.debugLineNum = 52035602;BA.debugLine="Private TextUser As TextField";
_textuser = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=52035603;
 //BA.debugLineNum = 52035603;BA.debugLine="Private TextPassword As TextField";
_textpassword = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
RDebugUtils.currentLine=52035604;
 //BA.debugLineNum = 52035604;BA.debugLine="Private TextInfo As TextArea";
_textinfo = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper();
RDebugUtils.currentLine=52035605;
 //BA.debugLineNum = 52035605;BA.debugLine="Private SD_LoadingIndicator1 As SD_LoadingIndicat";
_sd_loadingindicator1 = new b4j.docU.sd_loadingindicator();
RDebugUtils.currentLine=52035606;
 //BA.debugLineNum = 52035606;BA.debugLine="End Sub";
return "";
}
public void  _droptarget_dragdropped(b4j.docU.cclientftp __ref,b4j.docU.dragevent _e) throws Exception{
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "droptarget_dragdropped", false))
	 {Debug.delegate(ba, "droptarget_dragdropped", new Object[] {_e}); return;}
ResumableSub_DropTarget_DragDropped rsub = new ResumableSub_DropTarget_DragDropped(this,__ref,_e);
rsub.resume(ba, null);
}
public static class ResumableSub_DropTarget_DragDropped extends BA.ResumableSub {
public ResumableSub_DropTarget_DragDropped(b4j.docU.cclientftp parent,b4j.docU.cclientftp __ref,b4j.docU.dragevent _e) {
this.parent = parent;
this.__ref = __ref;
this._e = _e;
this.__ref = parent;
}
b4j.docU.cclientftp __ref;
b4j.docU.cclientftp parent;
b4j.docU.dragevent _e;
String _filename = "";
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group3;
int index3;
int groupLen3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="cclientftp";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=53739521;
 //BA.debugLineNum = 53739521;BA.debugLine="Log(\"drag dropped\")";
parent.__c.LogImpl("853739521","drag dropped",0);
RDebugUtils.currentLine=53739522;
 //BA.debugLineNum = 53739522;BA.debugLine="SD_LoadingIndicator1.Show";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._show /*String*/ (null);
RDebugUtils.currentLine=53739523;
 //BA.debugLineNum = 53739523;BA.debugLine="For Each filename As String In e.GetDragboard.Get";
if (true) break;

case 1:
//for
this.state = 10;
group3 = _e._getdragboard /*b4j.docU.dragboard*/ (null)._getfiles /*anywheresoftware.b4a.objects.collections.List*/ (null);
index3 = 0;
groupLen3 = group3.getSize();
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if (index3 < groupLen3) {
this.state = 3;
_filename = BA.ObjectToString(group3.Get(index3));}
if (true) break;

case 12:
//C
this.state = 11;
index3++;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=53739524;
 //BA.debugLineNum = 53739524;BA.debugLine="If File.IsDirectory(\"\",filename) Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent.__c.File.IsDirectory("",_filename)) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=53739525;
 //BA.debugLineNum = 53739525;BA.debugLine="Wait For (upload(filename,FTPPath & \"/\" & File.";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "droptarget_dragdropped"), __ref._upload /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filename,__ref._ftppath /*String*/ +"/"+parent.__c.File.GetName(_filename)));
this.state = 13;
return;
case 13:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=53739526;
 //BA.debugLineNum = 53739526;BA.debugLine="logInfo($\"Create path: ${filename}: ${Success}\"";
__ref._loginfo /*String*/ (null,("Create path: "+parent.__c.SmartStringFormatter("",(Object)(_filename))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=53739528;
 //BA.debugLineNum = 53739528;BA.debugLine="Wait For (upload(filename,FTPPath)) complete (S";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "cclientftp", "droptarget_dragdropped"), __ref._upload /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_filename,__ref._ftppath /*String*/ ));
this.state = 14;
return;
case 14:
//C
this.state = 9;
_success = (boolean) result[1];
;
RDebugUtils.currentLine=53739529;
 //BA.debugLineNum = 53739529;BA.debugLine="logInfo($\"Upload: ${filename}: ${Success}\"$)";
__ref._loginfo /*String*/ (null,("Upload: "+parent.__c.SmartStringFormatter("",(Object)(_filename))+": "+parent.__c.SmartStringFormatter("",(Object)(_success))+""));
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=53739533;
 //BA.debugLineNum = 53739533;BA.debugLine="e.SetDropCompleted(True)";
_e._setdropcompleted /*String*/ (null,parent.__c.True);
RDebugUtils.currentLine=53739534;
 //BA.debugLineNum = 53739534;BA.debugLine="SD_LoadingIndicator1.Hide";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=53739536;
 //BA.debugLineNum = 53739536;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=53739537;
 //BA.debugLineNum = 53739537;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _droptarget_dragentered(b4j.docU.cclientftp __ref,b4j.docU.dragevent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "droptarget_dragentered", false))
	 {return ((String) Debug.delegate(ba, "droptarget_dragentered", new Object[] {_e}));}
int _clr = 0;
RDebugUtils.currentLine=53477376;
 //BA.debugLineNum = 53477376;BA.debugLine="Sub DropTarget_DragEntered(e As DragEvent)";
RDebugUtils.currentLine=53477377;
 //BA.debugLineNum = 53477377;BA.debugLine="Log(\"DragEntered\")";
__c.LogImpl("853477377","DragEntered",0);
RDebugUtils.currentLine=53477378;
 //BA.debugLineNum = 53477378;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=53477379;
 //BA.debugLineNum = 53477379;BA.debugLine="If IsValidDropEvent(e) And sFTP.IsInitialized The";
if (__ref._isvaliddropevent /*boolean*/ (null,_e) && __ref._sftp /*anywheresoftware.b4a.net.FTPWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=53477380;
 //BA.debugLineNum = 53477380;BA.debugLine="clr = 0xFF007F46";
_clr = ((int)0xff007f46);
 }else {
RDebugUtils.currentLine=53477382;
 //BA.debugLineNum = 53477382;BA.debugLine="clr = 0xFFFF0000";
_clr = ((int)0xffff0000);
 };
RDebugUtils.currentLine=53477384;
 //BA.debugLineNum = 53477384;BA.debugLine="TreeViewFTP.As(B4XView).SetColorAndBorder(0xFFFFF";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getObject()))).SetColorAndBorder(((int)0xffffffff),__c.DipToCurrent((int) (4)),_clr,0);
RDebugUtils.currentLine=53477385;
 //BA.debugLineNum = 53477385;BA.debugLine="End Sub";
return "";
}
public boolean  _isvaliddropevent(b4j.docU.cclientftp __ref,b4j.docU.dragevent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "isvaliddropevent", false))
	 {return ((Boolean) Debug.delegate(ba, "isvaliddropevent", new Object[] {_e}));}
RDebugUtils.currentLine=53673984;
 //BA.debugLineNum = 53673984;BA.debugLine="Sub IsValidDropEvent(e As DragEvent) As Boolean";
RDebugUtils.currentLine=53673985;
 //BA.debugLineNum = 53673985;BA.debugLine="Return e.GetDragboard.HasFiles";
if (true) return _e._getdragboard /*b4j.docU.dragboard*/ (null)._hasfiles /*boolean*/ (null);
RDebugUtils.currentLine=53673996;
 //BA.debugLineNum = 53673996;BA.debugLine="End Sub";
return false;
}
public String  _droptarget_dragexited(b4j.docU.cclientftp __ref,b4j.docU.dragevent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "droptarget_dragexited", false))
	 {return ((String) Debug.delegate(ba, "droptarget_dragexited", new Object[] {_e}));}
RDebugUtils.currentLine=53542912;
 //BA.debugLineNum = 53542912;BA.debugLine="Sub DropTarget_DragExited(e As DragEvent)";
RDebugUtils.currentLine=53542913;
 //BA.debugLineNum = 53542913;BA.debugLine="TreeViewFTP.As(B4XView).SetColorAndBorder(0xFFFFF";
((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getObject()))).SetColorAndBorder(((int)0xffffffff),0,(int) (0),0);
RDebugUtils.currentLine=53542914;
 //BA.debugLineNum = 53542914;BA.debugLine="End Sub";
return "";
}
public String  _droptarget_dragover(b4j.docU.cclientftp __ref,b4j.docU.dragevent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "droptarget_dragover", false))
	 {return ((String) Debug.delegate(ba, "droptarget_dragover", new Object[] {_e}));}
RDebugUtils.currentLine=53608448;
 //BA.debugLineNum = 53608448;BA.debugLine="Sub DropTarget_DragOver(e As DragEvent)";
RDebugUtils.currentLine=53608449;
 //BA.debugLineNum = 53608449;BA.debugLine="If IsValidDropEvent(e) Then e.AcceptTransferModes";
if (__ref._isvaliddropevent /*boolean*/ (null,_e)) { 
_e._accepttransfermodes /*String*/ (null,(Object[])(_transfermode._copy /*Object*/ ));};
RDebugUtils.currentLine=53608450;
 //BA.debugLineNum = 53608450;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.cclientftp __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=52101120;
 //BA.debugLineNum = 52101120;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=52101121;
 //BA.debugLineNum = 52101121;BA.debugLine="Show";
__ref._show /*String*/ (null);
RDebugUtils.currentLine=52101122;
 //BA.debugLineNum = 52101122;BA.debugLine="End Sub";
return "";
}
public String  _show(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
anywheresoftware.b4j.object.JavaObject _joform = null;
anywheresoftware.b4j.object.JavaObject _jostage = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=52166656;
 //BA.debugLineNum = 52166656;BA.debugLine="Sub Show";
RDebugUtils.currentLine=52166657;
 //BA.debugLineNum = 52166657;BA.debugLine="frm.Initialize(\"frm\",Main.xScreen, Main.yscreen)";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Initialize(ba,"frm",_main._xscreen /*int*/ ,_main._yscreen /*int*/ );
RDebugUtils.currentLine=52166658;
 //BA.debugLineNum = 52166658;BA.debugLine="Dim joForm As JavaObject = frm";
_joform = new anywheresoftware.b4j.object.JavaObject();
_joform = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._frm /*anywheresoftware.b4j.objects.Form*/ ));
RDebugUtils.currentLine=52166659;
 //BA.debugLineNum = 52166659;BA.debugLine="Dim joStage As JavaObject = joForm.GetField(\"stag";
_jostage = new anywheresoftware.b4j.object.JavaObject();
_jostage = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_joform.GetField("stage")));
RDebugUtils.currentLine=52166660;
 //BA.debugLineNum = 52166660;BA.debugLine="joStage.RunMethod(\"setMaximized\", Array(True))";
_jostage.RunMethod("setMaximized",new Object[]{(Object)(__c.True)});
RDebugUtils.currentLine=52166662;
 //BA.debugLineNum = 52166662;BA.debugLine="frm.Icon = Main.IconoFormularios";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .setIcon((javafx.scene.image.Image)(_main._iconoformularios /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .getObject()));
RDebugUtils.currentLine=52166663;
 //BA.debugLineNum = 52166663;BA.debugLine="frm.RootPane.LoadLayout(\"mainFTP\")";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .getRootPane().LoadLayout(ba,"mainFTP");
RDebugUtils.currentLine=52166664;
 //BA.debugLineNum = 52166664;BA.debugLine="frm.Show";
__ref._frm /*anywheresoftware.b4j.objects.Form*/ .Show();
RDebugUtils.currentLine=52166666;
 //BA.debugLineNum = 52166666;BA.debugLine="SplitPane1.LoadLayout(\"local\")";
__ref._splitpane1 /*anywheresoftware.b4j.objects.SplitPaneWrapper*/ .LoadLayout(ba,"local");
RDebugUtils.currentLine=52166667;
 //BA.debugLineNum = 52166667;BA.debugLine="SplitPane1.LoadLayout(\"ftp\")";
__ref._splitpane1 /*anywheresoftware.b4j.objects.SplitPaneWrapper*/ .LoadLayout(ba,"ftp");
RDebugUtils.currentLine=52166669;
 //BA.debugLineNum = 52166669;BA.debugLine="DragAndDrop1.Initialize(Me)";
__ref._draganddrop1 /*b4j.docU.draganddrop*/ ._initialize /*String*/ (null,ba,this);
RDebugUtils.currentLine=52166670;
 //BA.debugLineNum = 52166670;BA.debugLine="DragAndDrop1.MakeDragTarget(TreeViewFTP, \"DropTar";
__ref._draganddrop1 /*b4j.docU.draganddrop*/ ._makedragtarget /*String*/ (null,(anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getObject())),"DropTarget");
RDebugUtils.currentLine=52166672;
 //BA.debugLineNum = 52166672;BA.debugLine="If File.Exists(File.DirApp,\"save.map\") Then";
if (__c.File.Exists(__c.File.getDirApp(),"save.map")) { 
RDebugUtils.currentLine=52166673;
 //BA.debugLineNum = 52166673;BA.debugLine="Dim M As Map = File.ReadMap(File.DirApp,\"save.ma";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.File.ReadMap(__c.File.getDirApp(),"save.map");
RDebugUtils.currentLine=52166674;
 //BA.debugLineNum = 52166674;BA.debugLine="LocalPath=M.Get(\"localpath\")";
__ref._localpath /*String*/  = BA.ObjectToString(_m.Get((Object)("localpath")));
RDebugUtils.currentLine=52166675;
 //BA.debugLineNum = 52166675;BA.debugLine="TextFTP.Text=M.Get(\"host\")";
__ref._textftp /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("host"))));
RDebugUtils.currentLine=52166676;
 //BA.debugLineNum = 52166676;BA.debugLine="TextUser.Text=M.Get(\"user\")";
__ref._textuser /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("user"))));
RDebugUtils.currentLine=52166677;
 //BA.debugLineNum = 52166677;BA.debugLine="TextPassword.Text=M.Get(\"password\")";
__ref._textpassword /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("password"))));
 }else {
RDebugUtils.currentLine=52166679;
 //BA.debugLineNum = 52166679;BA.debugLine="Dim M As Map = CreateMap(\"localpath\":LocalPath,\"";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("localpath"),(Object)(__ref._localpath /*String*/ ),(Object)("host"),(Object)(""),(Object)("user"),(Object)(""),(Object)("password"),(Object)("")});
RDebugUtils.currentLine=52166680;
 //BA.debugLineNum = 52166680;BA.debugLine="File.WriteMap(File.DirApp,\"save.map\",m)";
__c.File.WriteMap(__c.File.getDirApp(),"save.map",_m);
 };
RDebugUtils.currentLine=52166683;
 //BA.debugLineNum = 52166683;BA.debugLine="TreeViewFTP.SetCheckBoxesMode";
__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .SetCheckBoxesMode();
RDebugUtils.currentLine=52166684;
 //BA.debugLineNum = 52166684;BA.debugLine="TreeViewLocal.SetCheckBoxesMode";
__ref._treeviewlocal /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .SetCheckBoxesMode();
RDebugUtils.currentLine=52166686;
 //BA.debugLineNum = 52166686;BA.debugLine="SD_LoadingIndicator1.Hide";
__ref._sd_loadingindicator1 /*b4j.docU.sd_loadingindicator*/ ._hide /*String*/ (null);
RDebugUtils.currentLine=52166688;
 //BA.debugLineNum = 52166688;BA.debugLine="refreshtree";
__ref._refreshtree /*String*/ (null);
RDebugUtils.currentLine=52166689;
 //BA.debugLineNum = 52166689;BA.debugLine="End Sub";
return "";
}
public String  _menubar1_action(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "menubar1_action", false))
	 {return ((String) Debug.delegate(ba, "menubar1_action", null));}
anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mi = null;
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _choix = "";
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=52232192;
 //BA.debugLineNum = 52232192;BA.debugLine="Private Sub MenuBar1_Action";
RDebugUtils.currentLine=52232193;
 //BA.debugLineNum = 52232193;BA.debugLine="Dim mi As MenuItem = Sender";
_mi = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
_mi = (anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper(), (javafx.scene.control.MenuItem)(__c.Sender(ba)));
RDebugUtils.currentLine=52232195;
 //BA.debugLineNum = 52232195;BA.debugLine="Select mi.Text";
switch (BA.switchObjectToInt(_mi.getText(),"_Load","_Save")) {
case 0: {
RDebugUtils.currentLine=52232197;
 //BA.debugLineNum = 52232197;BA.debugLine="Dim FC As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=52232198;
 //BA.debugLineNum = 52232198;BA.debugLine="FC.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=52232199;
 //BA.debugLineNum = 52232199;BA.debugLine="FC.InitialDirectory = File.DirData(\"clientFTP\")";
_fc.setInitialDirectory(__c.File.DirData("clientFTP"));
RDebugUtils.currentLine=52232200;
 //BA.debugLineNum = 52232200;BA.debugLine="FC.InitialFileName = \"\"";
_fc.setInitialFileName("");
RDebugUtils.currentLine=52232201;
 //BA.debugLineNum = 52232201;BA.debugLine="FC.Title = \"Selezione il file Credenziali da ca";
_fc.setTitle("Selezione il file Credenziali da caricare");
RDebugUtils.currentLine=52232202;
 //BA.debugLineNum = 52232202;BA.debugLine="FC.SetExtensionFilter(\"Credenziali\", Array As S";
_fc.SetExtensionFilter("Credenziali",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.crd"}));
RDebugUtils.currentLine=52232203;
 //BA.debugLineNum = 52232203;BA.debugLine="Dim Choix As String = FC.ShowOpen(frm)";
_choix = _fc.ShowOpen(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=52232205;
 //BA.debugLineNum = 52232205;BA.debugLine="If Choix <> \"\" Then";
if ((_choix).equals("") == false) { 
RDebugUtils.currentLine=52232206;
 //BA.debugLineNum = 52232206;BA.debugLine="Dim M As Map = File.ReadMap(\"\",Choix)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.File.ReadMap("",_choix);
RDebugUtils.currentLine=52232207;
 //BA.debugLineNum = 52232207;BA.debugLine="TextFTP.Text=M.Get(\"host\")";
__ref._textftp /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("host"))));
RDebugUtils.currentLine=52232208;
 //BA.debugLineNum = 52232208;BA.debugLine="TextUser.Text=M.Get(\"user\")";
__ref._textuser /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("user"))));
RDebugUtils.currentLine=52232209;
 //BA.debugLineNum = 52232209;BA.debugLine="TextPassword.Text=M.Get(\"password\")";
__ref._textpassword /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .setText(BA.ObjectToString(_m.Get((Object)("password"))));
 };
 break; }
case 1: {
RDebugUtils.currentLine=52232212;
 //BA.debugLineNum = 52232212;BA.debugLine="Dim FC As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
RDebugUtils.currentLine=52232213;
 //BA.debugLineNum = 52232213;BA.debugLine="FC.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=52232214;
 //BA.debugLineNum = 52232214;BA.debugLine="FC.InitialDirectory = File.DirData(\"clientFTP\")";
_fc.setInitialDirectory(__c.File.DirData("clientFTP"));
RDebugUtils.currentLine=52232215;
 //BA.debugLineNum = 52232215;BA.debugLine="FC.InitialFileName = \"\"";
_fc.setInitialFileName("");
RDebugUtils.currentLine=52232216;
 //BA.debugLineNum = 52232216;BA.debugLine="FC.Title = \"Salva file Credenziali\"";
_fc.setTitle("Salva file Credenziali");
RDebugUtils.currentLine=52232217;
 //BA.debugLineNum = 52232217;BA.debugLine="FC.SetExtensionFilter(\"Credenziali\", Array As S";
_fc.SetExtensionFilter("Credenziali",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.crd"}));
RDebugUtils.currentLine=52232218;
 //BA.debugLineNum = 52232218;BA.debugLine="Dim Choix As String = FC.ShowSave(frm)";
_choix = _fc.ShowSave(__ref._frm /*anywheresoftware.b4j.objects.Form*/ );
RDebugUtils.currentLine=52232220;
 //BA.debugLineNum = 52232220;BA.debugLine="If Choix <> \"\" Then";
if ((_choix).equals("") == false) { 
RDebugUtils.currentLine=52232221;
 //BA.debugLineNum = 52232221;BA.debugLine="Dim M As Map = CreateMap(\"host\":TextFTP.Text,\"";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {(Object)("host"),(Object)(__ref._textftp /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()),(Object)("user"),(Object)(__ref._textuser /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText()),(Object)("password"),(Object)(__ref._textpassword /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText())});
RDebugUtils.currentLine=52232222;
 //BA.debugLineNum = 52232222;BA.debugLine="File.WriteMap(\"\",Choix,m)";
__c.File.WriteMap("",_choix,_m);
 };
 break; }
}
;
RDebugUtils.currentLine=52232225;
 //BA.debugLineNum = 52232225;BA.debugLine="End Sub";
return "";
}
public String  _scanpath(b4j.docU.cclientftp __ref,String _path,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "scanpath", false))
	 {return ((String) Debug.delegate(ba, "scanpath", new Object[] {_path,_ti}));}
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper _fti = null;
String _fname = "";
RDebugUtils.currentLine=53936128;
 //BA.debugLineNum = 53936128;BA.debugLine="Private Sub scanpath(path As String, ti As TreeIte";
RDebugUtils.currentLine=53936129;
 //BA.debugLineNum = 53936129;BA.debugLine="Dim l As List = File.ListFiles(path)";
_l = new anywheresoftware.b4a.objects.collections.List();
_l = __c.File.ListFiles(_path);
RDebugUtils.currentLine=53936131;
 //BA.debugLineNum = 53936131;BA.debugLine="If path.EndsWith(\":\\\")=False Then";
if (_path.endsWith(":\\")==__c.False) { 
RDebugUtils.currentLine=53936132;
 //BA.debugLineNum = 53936132;BA.debugLine="Dim fti As CheckboxTreeItem";
_fti = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
RDebugUtils.currentLine=53936133;
 //BA.debugLineNum = 53936133;BA.debugLine="fti.Initialize(\"ti\",\"..\")";
_fti.Initialize(ba,"ti","..");
RDebugUtils.currentLine=53936134;
 //BA.debugLineNum = 53936134;BA.debugLine="fti.Checked=False";
_fti.setChecked(__c.False);
RDebugUtils.currentLine=53936135;
 //BA.debugLineNum = 53936135;BA.debugLine="fti.Image=fx.LoadImageSample(File.DirAssets,\"fol";
_fti.setImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(__c.File.getDirAssets(),"folder.png",16,16).getObject()));
RDebugUtils.currentLine=53936136;
 //BA.debugLineNum = 53936136;BA.debugLine="ti.Children.Add(fti)";
_ti.getChildren().Add((Object)(_fti.getObject()));
 };
RDebugUtils.currentLine=53936138;
 //BA.debugLineNum = 53936138;BA.debugLine="If l.IsInitialized Then";
if (_l.IsInitialized()) { 
RDebugUtils.currentLine=53936139;
 //BA.debugLineNum = 53936139;BA.debugLine="l.Sort(True)";
_l.Sort(__c.True);
RDebugUtils.currentLine=53936140;
 //BA.debugLineNum = 53936140;BA.debugLine="For Each fname As String In l";
{
final anywheresoftware.b4a.BA.IterableList group11 = _l;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_fname = BA.ObjectToString(group11.Get(index11));
RDebugUtils.currentLine=53936141;
 //BA.debugLineNum = 53936141;BA.debugLine="If fname.StartsWith(\"$\")=False Then";
if (_fname.startsWith("$")==__c.False) { 
RDebugUtils.currentLine=53936142;
 //BA.debugLineNum = 53936142;BA.debugLine="If File.IsDirectory(path,fname) Then";
if (__c.File.IsDirectory(_path,_fname)) { 
RDebugUtils.currentLine=53936143;
 //BA.debugLineNum = 53936143;BA.debugLine="Dim fti As CheckboxTreeItem";
_fti = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
RDebugUtils.currentLine=53936144;
 //BA.debugLineNum = 53936144;BA.debugLine="fti.Initialize(\"ti\",fname)";
_fti.Initialize(ba,"ti",_fname);
RDebugUtils.currentLine=53936145;
 //BA.debugLineNum = 53936145;BA.debugLine="fti.Image=fx.LoadImageSample(File.DirAssets,\"";
_fti.setImage((javafx.scene.image.Image)(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .LoadImageSample(__c.File.getDirAssets(),"folder.png",16,16).getObject()));
RDebugUtils.currentLine=53936146;
 //BA.debugLineNum = 53936146;BA.debugLine="fti.Checked=False";
_fti.setChecked(__c.False);
RDebugUtils.currentLine=53936147;
 //BA.debugLineNum = 53936147;BA.debugLine="ti.Children.Add(fti)";
_ti.getChildren().Add((Object)(_fti.getObject()));
 };
 };
 }
};
RDebugUtils.currentLine=53936151;
 //BA.debugLineNum = 53936151;BA.debugLine="For Each fname As String In l";
{
final anywheresoftware.b4a.BA.IterableList group22 = _l;
final int groupLen22 = group22.getSize()
;int index22 = 0;
;
for (; index22 < groupLen22;index22++){
_fname = BA.ObjectToString(group22.Get(index22));
RDebugUtils.currentLine=53936152;
 //BA.debugLineNum = 53936152;BA.debugLine="If fname.StartsWith(\"$\")=False Then";
if (_fname.startsWith("$")==__c.False) { 
RDebugUtils.currentLine=53936153;
 //BA.debugLineNum = 53936153;BA.debugLine="If File.IsDirectory(path,fname)=False Then";
if (__c.File.IsDirectory(_path,_fname)==__c.False) { 
RDebugUtils.currentLine=53936154;
 //BA.debugLineNum = 53936154;BA.debugLine="Dim fti As CheckboxTreeItem";
_fti = new anywheresoftware.b4j.objects.TreeViewWrapper.CheckBoxTreeItemWrapper();
RDebugUtils.currentLine=53936155;
 //BA.debugLineNum = 53936155;BA.debugLine="fti.Initialize(\"ti\",fname)";
_fti.Initialize(ba,"ti",_fname);
RDebugUtils.currentLine=53936156;
 //BA.debugLineNum = 53936156;BA.debugLine="fti.Checked=False";
_fti.setChecked(__c.False);
RDebugUtils.currentLine=53936157;
 //BA.debugLineNum = 53936157;BA.debugLine="ti.Children.Add(fti)";
_ti.getChildren().Add((Object)(_fti.getObject()));
 };
 };
 }
};
 };
RDebugUtils.currentLine=53936162;
 //BA.debugLineNum = 53936162;BA.debugLine="End Sub";
return "";
}
public String  _sftp_uploadprogress(b4j.docU.cclientftp __ref,String _serverpath,long _totaluploaded,long _total) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "sftp_uploadprogress", false))
	 {return ((String) Debug.delegate(ba, "sftp_uploadprogress", new Object[] {_serverpath,_totaluploaded,_total}));}
RDebugUtils.currentLine=53411840;
 //BA.debugLineNum = 53411840;BA.debugLine="Private Sub sftp_UploadProgress (ServerPath As Str";
RDebugUtils.currentLine=53411842;
 //BA.debugLineNum = 53411842;BA.debugLine="End Sub";
return "";
}
public String  _textinfo_textchanged(b4j.docU.cclientftp __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "textinfo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "textinfo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=52822016;
 //BA.debugLineNum = 52822016;BA.debugLine="Private Sub TextInfo_TextChanged (Old As String, N";
RDebugUtils.currentLine=52822017;
 //BA.debugLineNum = 52822017;BA.debugLine="TextInfo.SetSelection(New.Length,New.Length)";
__ref._textinfo /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper*/ .SetSelection(_new.length(),_new.length());
RDebugUtils.currentLine=52822018;
 //BA.debugLineNum = 52822018;BA.debugLine="End Sub";
return "";
}
public String  _treeviewftp_selecteditemchanged(b4j.docU.cclientftp __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _selecteditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "treeviewftp_selecteditemchanged", false))
	 {return ((String) Debug.delegate(ba, "treeviewftp_selecteditemchanged", new Object[] {_selecteditem}));}
String _v = "";
int _i = 0;
RDebugUtils.currentLine=52363264;
 //BA.debugLineNum = 52363264;BA.debugLine="Private Sub TreeViewFTP_SelectedItemChanged (Selec";
RDebugUtils.currentLine=52363265;
 //BA.debugLineNum = 52363265;BA.debugLine="If SelectedItem.IsInitialized Then";
if (_selecteditem.IsInitialized()) { 
RDebugUtils.currentLine=52363266;
 //BA.debugLineNum = 52363266;BA.debugLine="TreeViewFTP.Root.Children.Clear";
__ref._treeviewftp /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Clear();
RDebugUtils.currentLine=52363267;
 //BA.debugLineNum = 52363267;BA.debugLine="Dim V As String = SelectedItem.Text";
_v = _selecteditem.getText();
RDebugUtils.currentLine=52363268;
 //BA.debugLineNum = 52363268;BA.debugLine="If V=\"..\" Then";
if ((_v).equals("..")) { 
RDebugUtils.currentLine=52363269;
 //BA.debugLineNum = 52363269;BA.debugLine="If FTPPath<>\"/\"  Then";
if ((__ref._ftppath /*String*/ ).equals("/") == false) { 
RDebugUtils.currentLine=52363270;
 //BA.debugLineNum = 52363270;BA.debugLine="Dim i As Int = FTPPath.LastIndexOf(\"/\")";
_i = __ref._ftppath /*String*/ .lastIndexOf("/");
RDebugUtils.currentLine=52363271;
 //BA.debugLineNum = 52363271;BA.debugLine="FTPPath=FTPPath.SubString2(0,i)";
__ref._ftppath /*String*/  = __ref._ftppath /*String*/ .substring((int) (0),_i);
 };
 }else {
RDebugUtils.currentLine=52363274;
 //BA.debugLineNum = 52363274;BA.debugLine="If SelectedItem.Image.IsInitialized Then FTPPat";
if (_selecteditem.getImage().IsInitialized()) { 
__ref._ftppath /*String*/  = __ref._ftppath /*String*/ +"/"+_v;};
 };
RDebugUtils.currentLine=52363276;
 //BA.debugLineNum = 52363276;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
 };
RDebugUtils.currentLine=52363278;
 //BA.debugLineNum = 52363278;BA.debugLine="End Sub";
return "";
}
public String  _treeviewlocal_selecteditemchanged(b4j.docU.cclientftp __ref,anywheresoftware.b4j.objects.TreeViewWrapper.ConcreteTreeItemWrapper _selecteditem) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "treeviewlocal_selecteditemchanged", false))
	 {return ((String) Debug.delegate(ba, "treeviewlocal_selecteditemchanged", new Object[] {_selecteditem}));}
String _v = "";
int _i = 0;
RDebugUtils.currentLine=52297728;
 //BA.debugLineNum = 52297728;BA.debugLine="Private Sub TreeViewLocal_SelectedItemChanged (Sel";
RDebugUtils.currentLine=52297729;
 //BA.debugLineNum = 52297729;BA.debugLine="If SelectedItem.IsInitialized Then";
if (_selecteditem.IsInitialized()) { 
RDebugUtils.currentLine=52297730;
 //BA.debugLineNum = 52297730;BA.debugLine="TreeViewLocal.Root.Children.Clear";
__ref._treeviewlocal /*anywheresoftware.b4j.objects.TreeViewWrapper*/ .getRoot().getChildren().Clear();
RDebugUtils.currentLine=52297731;
 //BA.debugLineNum = 52297731;BA.debugLine="Dim V As String = SelectedItem.Text";
_v = _selecteditem.getText();
RDebugUtils.currentLine=52297732;
 //BA.debugLineNum = 52297732;BA.debugLine="If V=\"..\" Then";
if ((_v).equals("..")) { 
RDebugUtils.currentLine=52297733;
 //BA.debugLineNum = 52297733;BA.debugLine="Dim i As Int = LocalPath.LastIndexOf(\"\\\")";
_i = __ref._localpath /*String*/ .lastIndexOf("\\");
RDebugUtils.currentLine=52297734;
 //BA.debugLineNum = 52297734;BA.debugLine="LocalPath=LocalPath.SubString2(0,i)";
__ref._localpath /*String*/  = __ref._localpath /*String*/ .substring((int) (0),_i);
 }else {
RDebugUtils.currentLine=52297736;
 //BA.debugLineNum = 52297736;BA.debugLine="If File.IsDirectory(LocalPath,v) Then LocalPath";
if (__c.File.IsDirectory(__ref._localpath /*String*/ ,_v)) { 
__ref._localpath /*String*/  = __c.File.Combine(__ref._localpath /*String*/ ,_v);};
 };
RDebugUtils.currentLine=52297738;
 //BA.debugLineNum = 52297738;BA.debugLine="refreshtree";
__ref._refreshtree /*String*/ (null);
 };
RDebugUtils.currentLine=52297740;
 //BA.debugLineNum = 52297740;BA.debugLine="End Sub";
return "";
}
public String  _vftppath_action(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "vftppath_action", false))
	 {return ((String) Debug.delegate(ba, "vftppath_action", null));}
RDebugUtils.currentLine=52756480;
 //BA.debugLineNum = 52756480;BA.debugLine="Private Sub vFTPpath_Action";
RDebugUtils.currentLine=52756481;
 //BA.debugLineNum = 52756481;BA.debugLine="FTPPath=vFTPpath.Text";
__ref._ftppath /*String*/  = __ref._vftppath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=52756482;
 //BA.debugLineNum = 52756482;BA.debugLine="refreshftp";
__ref._refreshftp /*void*/ (null);
RDebugUtils.currentLine=52756483;
 //BA.debugLineNum = 52756483;BA.debugLine="End Sub";
return "";
}
public String  _vlocalpath_action(b4j.docU.cclientftp __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cclientftp";
if (Debug.shouldDelegate(ba, "vlocalpath_action", false))
	 {return ((String) Debug.delegate(ba, "vlocalpath_action", null));}
RDebugUtils.currentLine=52690944;
 //BA.debugLineNum = 52690944;BA.debugLine="Private Sub VlocalPath_Action";
RDebugUtils.currentLine=52690945;
 //BA.debugLineNum = 52690945;BA.debugLine="LocalPath=vLocalPath.Text";
__ref._localpath /*String*/  = __ref._vlocalpath /*anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper*/ .getText();
RDebugUtils.currentLine=52690946;
 //BA.debugLineNum = 52690946;BA.debugLine="refreshtree";
__ref._refreshtree /*String*/ (null);
RDebugUtils.currentLine=52690947;
 //BA.debugLineNum = 52690947;BA.debugLine="End Sub";
return "";
}
}