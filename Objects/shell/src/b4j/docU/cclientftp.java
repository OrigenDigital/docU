
package b4j.docU;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cclientftp {
    public static RemoteObject myClass;
	public cclientftp() {
	}
    public static PCBA staticBA = new PCBA(null, cclientftp.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _frm = RemoteObject.declareNull("anywheresoftware.b4j.objects.Form");
public static RemoteObject _localpath = RemoteObject.createImmutable("");
public static RemoteObject _ftppath = RemoteObject.createImmutable("");
public static RemoteObject _sftp = RemoteObject.declareNull("anywheresoftware.b4a.net.FTPWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _draganddrop1 = RemoteObject.declareNull("b4j.docU.draganddrop");
public static RemoteObject _splitpane1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.SplitPaneWrapper");
public static RemoteObject _treeviewlocal = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper");
public static RemoteObject _treeviewftp = RemoteObject.declareNull("anywheresoftware.b4j.objects.TreeViewWrapper");
public static RemoteObject _vlocalpath = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _vftppath = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textftp = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textuser = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textpassword = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper");
public static RemoteObject _textinfo = RemoteObject.declareNull("anywheresoftware.b4j.objects.TextInputControlWrapper.TextAreaWrapper");
public static RemoteObject _sd_loadingindicator1 = RemoteObject.declareNull("b4j.docU.sd_loadingindicator");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4j.example.dateutils");
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
public static b4j.docU.jamlinknavision _jamlinknavision = null;
public static b4j.docU.cmpermisos _cmpermisos = null;
public static b4j.docU.jamtableviewcamposbuilder _jamtableviewcamposbuilder = null;
public static b4j.docU.httputils2service _httputils2service = null;
public static b4j.docU.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"DateUtils",_ref.getField(false, "_dateutils"),"DragAndDrop1",_ref.getField(false, "_draganddrop1"),"frm",_ref.getField(false, "_frm"),"FTPPath",_ref.getField(false, "_ftppath"),"fx",_ref.getField(false, "_fx"),"LocalPath",_ref.getField(false, "_localpath"),"SD_LoadingIndicator1",_ref.getField(false, "_sd_loadingindicator1"),"sFTP",_ref.getField(false, "_sftp"),"SplitPane1",_ref.getField(false, "_splitpane1"),"TextFTP",_ref.getField(false, "_textftp"),"TextInfo",_ref.getField(false, "_textinfo"),"TextPassword",_ref.getField(false, "_textpassword"),"TextUser",_ref.getField(false, "_textuser"),"TreeViewFTP",_ref.getField(false, "_treeviewftp"),"TreeViewLocal",_ref.getField(false, "_treeviewlocal"),"vFTPpath",_ref.getField(false, "_vftppath"),"vLocalPath",_ref.getField(false, "_vlocalpath"),"xui",_ref.getField(false, "_xui")};
}
}