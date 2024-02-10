package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlutils extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.xlutils", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.xlutils.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _xladdress{
public boolean IsInitialized;
public int Col0Based;
public int Row0Based;
public void Initialize() {
IsInitialized = true;
Col0Based = 0;
Row0Based = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _xlrange{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.PoiSheetWrapper Sheet;
public b4j.docU.xlutils._xladdress FirstAddress;
public b4j.docU.xlutils._xladdress SecondAddress;
public String Name;
public void Initialize() {
IsInitialized = true;
Sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
FirstAddress = new b4j.docU.xlutils._xladdress();
SecondAddress = new b4j.docU.xlutils._xladdress();
Name = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.docU.xlreader _reader = null;
public String _createwriterpassword = "";
public short _color_black = (short)0;
public short _color_white = (short)0;
public short _color_red = (short)0;
public short _color_bright_green = (short)0;
public short _color_blue = (short)0;
public short _color_yellow = (short)0;
public short _color_pink = (short)0;
public short _color_turquoise = (short)0;
public short _color_dark_red = (short)0;
public short _color_green = (short)0;
public short _color_dark_blue = (short)0;
public short _color_dark_yellow = (short)0;
public short _color_violet = (short)0;
public short _color_teal = (short)0;
public short _color_grey_25_percent = (short)0;
public short _color_grey_50_percent = (short)0;
public short _color_cornflower_blue = (short)0;
public short _color_maroon = (short)0;
public short _color_lemon_chiffon = (short)0;
public short _color_light_turquoise1 = (short)0;
public short _color_orchid = (short)0;
public short _color_coral = (short)0;
public short _color_royal_blue = (short)0;
public short _color_light_cornflower_blue = (short)0;
public short _color_sky_blue = (short)0;
public short _color_light_turquoise = (short)0;
public short _color_light_green = (short)0;
public short _color_light_yellow = (short)0;
public short _color_pale_blue = (short)0;
public short _color_rose = (short)0;
public short _color_lavender = (short)0;
public short _color_tan = (short)0;
public short _color_light_blue = (short)0;
public short _color_aqua = (short)0;
public short _color_lime = (short)0;
public short _color_gold = (short)0;
public short _color_light_orange = (short)0;
public short _color_orange = (short)0;
public short _color_blue_grey = (short)0;
public short _color_grey_40_percent = (short)0;
public short _color_dark_teal = (short)0;
public short _color_sea_green = (short)0;
public short _color_dark_green = (short)0;
public short _color_olive_green = (short)0;
public short _color_brown = (short)0;
public short _color_plum = (short)0;
public short _color_indigo = (short)0;
public short _color_grey_80_percent = (short)0;
public short _color_automatic = (short)0;
public boolean _blankworkbookis2007 = false;
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
public String  _initialize(b4j.docU.xlutils __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=225968128;
 //BA.debugLineNum = 225968128;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=225968129;
 //BA.debugLineNum = 225968129;BA.debugLine="Reader.Initialize (Me)";
__ref._reader /*b4j.docU.xlreader*/ ._initialize /*String*/ (null,ba,(b4j.docU.xlutils)(this));
RDebugUtils.currentLine=225968130;
 //BA.debugLineNum = 225968130;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlworkbookwriter  _createwriterblank(b4j.docU.xlutils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createwriterblank", true))
	 {return ((b4j.docU.xlworkbookwriter) Debug.delegate(ba, "createwriterblank", null));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.docU.xlworkbookwriter _writer = null;
RDebugUtils.currentLine=226492416;
 //BA.debugLineNum = 226492416;BA.debugLine="Public Sub CreateWriterBlank As XLWorkbookWriter";
RDebugUtils.currentLine=226492417;
 //BA.debugLineNum = 226492417;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=226492418;
 //BA.debugLineNum = 226492418;BA.debugLine="wb.InitializeNew(BlankWorkbookIs2007)";
_wb.InitializeNew(__ref._blankworkbookis2007 /*boolean*/ );
RDebugUtils.currentLine=226492419;
 //BA.debugLineNum = 226492419;BA.debugLine="Dim writer As XLWorkbookWriter";
_writer = new b4j.docU.xlworkbookwriter();
RDebugUtils.currentLine=226492420;
 //BA.debugLineNum = 226492420;BA.debugLine="writer.Initialize(Me, wb, False)";
_writer._initialize /*String*/ (null,ba,(b4j.docU.xlutils)(this),_wb,__c.False);
RDebugUtils.currentLine=226492421;
 //BA.debugLineNum = 226492421;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=226492422;
 //BA.debugLineNum = 226492422;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlutils._xladdress  _addresszero(b4j.docU.xlutils __ref,int _col0based,int _row0based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresszero", true))
	 {return ((b4j.docU.xlutils._xladdress) Debug.delegate(ba, "addresszero", new Object[] {_col0based,_row0based}));}
b4j.docU.xlutils._xladdress _xa = null;
RDebugUtils.currentLine=226033664;
 //BA.debugLineNum = 226033664;BA.debugLine="Public Sub AddressZero (Col0Based As Int, Row0Base";
RDebugUtils.currentLine=226033665;
 //BA.debugLineNum = 226033665;BA.debugLine="Dim xa As XLAddress";
_xa = new b4j.docU.xlutils._xladdress();
RDebugUtils.currentLine=226033666;
 //BA.debugLineNum = 226033666;BA.debugLine="xa.Initialize";
_xa.Initialize();
RDebugUtils.currentLine=226033667;
 //BA.debugLineNum = 226033667;BA.debugLine="xa.Col0Based = Col0Based";
_xa.Col0Based /*int*/  = _col0based;
RDebugUtils.currentLine=226033668;
 //BA.debugLineNum = 226033668;BA.debugLine="xa.Row0Based = Row0Based";
_xa.Row0Based /*int*/  = _row0based;
RDebugUtils.currentLine=226033669;
 //BA.debugLineNum = 226033669;BA.debugLine="Return xa";
if (true) return _xa;
RDebugUtils.currentLine=226033670;
 //BA.debugLineNum = 226033670;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlutils._xlrange  _createxlrange(b4j.docU.xlutils __ref,b4j.docU.xlutils._xladdress _firstaddress,b4j.docU.xlutils._xladdress _secondaddress) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createxlrange", true))
	 {return ((b4j.docU.xlutils._xlrange) Debug.delegate(ba, "createxlrange", new Object[] {_firstaddress,_secondaddress}));}
b4j.docU.xlutils._xlrange _t1 = null;
RDebugUtils.currentLine=227082240;
 //BA.debugLineNum = 227082240;BA.debugLine="Public Sub CreateXLRange (FirstAddress As XLAddres";
RDebugUtils.currentLine=227082241;
 //BA.debugLineNum = 227082241;BA.debugLine="Dim t1 As XLRange";
_t1 = new b4j.docU.xlutils._xlrange();
RDebugUtils.currentLine=227082242;
 //BA.debugLineNum = 227082242;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=227082243;
 //BA.debugLineNum = 227082243;BA.debugLine="t1.FirstAddress = FirstAddress";
_t1.FirstAddress /*b4j.docU.xlutils._xladdress*/  = _firstaddress;
RDebugUtils.currentLine=227082244;
 //BA.debugLineNum = 227082244;BA.debugLine="t1.SecondAddress = SecondAddress";
_t1.SecondAddress /*b4j.docU.xlutils._xladdress*/  = _secondaddress;
RDebugUtils.currentLine=227082245;
 //BA.debugLineNum = 227082245;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=227082246;
 //BA.debugLineNum = 227082246;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _openexcel(b4j.docU.xlutils __ref,String _filepath) throws Exception{
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "openexcel", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "openexcel", new Object[] {_filepath}));}
ResumableSub_OpenExcel rsub = new ResumableSub_OpenExcel(this,__ref,_filepath);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenExcel extends BA.ResumableSub {
public ResumableSub_OpenExcel(b4j.docU.xlutils parent,b4j.docU.xlutils __ref,String _filepath) {
this.parent = parent;
this.__ref = __ref;
this._filepath = _filepath;
this.__ref = parent;
}
b4j.docU.xlutils __ref;
b4j.docU.xlutils parent;
String _filepath;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=227213314;
 //BA.debugLineNum = 227213314;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=227213315;
 //BA.debugLineNum = 227213315;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"cmd.exe\",";
_shl.InitializeDoNotHandleQuotes("shl","cmd.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("/c"),(Object)("start"),(Object)(("\"\"")),(Object)(("\""+parent.__c.SmartStringFormatter("",(Object)(_filepath))+"\""))}));
RDebugUtils.currentLine=227213316;
 //BA.debugLineNum = 227213316;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=227213317;
 //BA.debugLineNum = 227213317;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "openexcel"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=227213318;
 //BA.debugLineNum = 227213318;BA.debugLine="If ExitCode <> 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_exitcode!=0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=227213319;
 //BA.debugLineNum = 227213319;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("9227213319",_stdout,0);
RDebugUtils.currentLine=227213320;
 //BA.debugLineNum = 227213320;BA.debugLine="Log(StdErr)";
parent.__c.LogImpl("9227213320",_stderr,0);
RDebugUtils.currentLine=227213321;
 //BA.debugLineNum = 227213321;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=227213323;
 //BA.debugLineNum = 227213323;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=227213324;
 //BA.debugLineNum = 227213324;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.docU.xlworkbookwriter  _createwriterfromtemplate(b4j.docU.xlutils __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createwriterfromtemplate", true))
	 {return ((b4j.docU.xlworkbookwriter) Debug.delegate(ba, "createwriterfromtemplate", new Object[] {_dir,_filename}));}
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
b4j.docU.xlworkbookwriter _writer = null;
RDebugUtils.currentLine=226557952;
 //BA.debugLineNum = 226557952;BA.debugLine="Public Sub CreateWriterFromTemplate (Dir As String";
RDebugUtils.currentLine=226557953;
 //BA.debugLineNum = 226557953;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
RDebugUtils.currentLine=226557954;
 //BA.debugLineNum = 226557954;BA.debugLine="wb.InitializeExisting(Dir, FileName, CreateWriter";
_wb.InitializeExisting(_dir,_filename,__ref._createwriterpassword /*String*/ ,__c.False);
RDebugUtils.currentLine=226557955;
 //BA.debugLineNum = 226557955;BA.debugLine="Dim writer As XLWorkbookWriter";
_writer = new b4j.docU.xlworkbookwriter();
RDebugUtils.currentLine=226557956;
 //BA.debugLineNum = 226557956;BA.debugLine="writer.Initialize(Me, wb, True)";
_writer._initialize /*String*/ (null,ba,(b4j.docU.xlutils)(this),_wb,__c.True);
RDebugUtils.currentLine=226557957;
 //BA.debugLineNum = 226557957;BA.debugLine="Return writer";
if (true) return _writer;
RDebugUtils.currentLine=226557958;
 //BA.debugLineNum = 226557958;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlutils._xladdress  _addressone(b4j.docU.xlutils __ref,String _columnname,int _row1based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addressone", true))
	 {return ((b4j.docU.xlutils._xladdress) Debug.delegate(ba, "addressone", new Object[] {_columnname,_row1based}));}
b4j.docU.xlutils._xladdress _xa = null;
byte[] _b = null;
int _i = 0;
int _cp = 0;
RDebugUtils.currentLine=226230272;
 //BA.debugLineNum = 226230272;BA.debugLine="Public Sub AddressOne(ColumnName As String, Row1Ba";
RDebugUtils.currentLine=226230273;
 //BA.debugLineNum = 226230273;BA.debugLine="Dim xa As XLAddress";
_xa = new b4j.docU.xlutils._xladdress();
RDebugUtils.currentLine=226230274;
 //BA.debugLineNum = 226230274;BA.debugLine="xa.Initialize";
_xa.Initialize();
RDebugUtils.currentLine=226230275;
 //BA.debugLineNum = 226230275;BA.debugLine="Dim b() As Byte = ColumnName.GetBytes(\"ASCII\")";
_b = _columnname.getBytes("ASCII");
RDebugUtils.currentLine=226230276;
 //BA.debugLineNum = 226230276;BA.debugLine="For i = 0 To b.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_b.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=226230277;
 //BA.debugLineNum = 226230277;BA.debugLine="Dim cp As Int = b(i)";
_cp = (int) (_b[_i]);
RDebugUtils.currentLine=226230278;
 //BA.debugLineNum = 226230278;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ *26+(_cp-((int)0x40)));
 }
};
RDebugUtils.currentLine=226230280;
 //BA.debugLineNum = 226230280;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ -1);
RDebugUtils.currentLine=226230281;
 //BA.debugLineNum = 226230281;BA.debugLine="xa.Row0Based = Row1Based - 1";
_xa.Row0Based /*int*/  = (int) (_row1based-1);
RDebugUtils.currentLine=226230282;
 //BA.debugLineNum = 226230282;BA.debugLine="Return xa";
if (true) return _xa;
RDebugUtils.currentLine=226230283;
 //BA.debugLineNum = 226230283;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlutils._xladdress  _addressname(b4j.docU.xlutils __ref,String _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addressname", true))
	 {return ((b4j.docU.xlutils._xladdress) Debug.delegate(ba, "addressname", new Object[] {_address}));}
b4j.docU.xlutils._xladdress _xa = null;
int _i = 0;
int _cp = 0;
RDebugUtils.currentLine=226164736;
 //BA.debugLineNum = 226164736;BA.debugLine="Public Sub AddressName (Address As String) As XLAd";
RDebugUtils.currentLine=226164737;
 //BA.debugLineNum = 226164737;BA.debugLine="Dim xa As XLAddress";
_xa = new b4j.docU.xlutils._xladdress();
RDebugUtils.currentLine=226164738;
 //BA.debugLineNum = 226164738;BA.debugLine="xa.Initialize";
_xa.Initialize();
RDebugUtils.currentLine=226164739;
 //BA.debugLineNum = 226164739;BA.debugLine="Address = Address.ToUpperCase";
_address = _address.toUpperCase();
RDebugUtils.currentLine=226164740;
 //BA.debugLineNum = 226164740;BA.debugLine="For i = 0 To Address.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_address.length()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=226164741;
 //BA.debugLineNum = 226164741;BA.debugLine="Dim cp As Int = Asc(Address.CharAt(i))";
_cp = __c.Asc(_address.charAt(_i));
RDebugUtils.currentLine=226164742;
 //BA.debugLineNum = 226164742;BA.debugLine="If cp >= 0x41 And cp <=	0x5A Then";
if (_cp>=((int)0x41) && _cp<=((int)0x5a)) { 
RDebugUtils.currentLine=226164743;
 //BA.debugLineNum = 226164743;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ *26+(_cp-((int)0x40)));
 }else 
{RDebugUtils.currentLine=226164744;
 //BA.debugLineNum = 226164744;BA.debugLine="Else If cp >= 0x30 And cp <= 0x39 Then";
if (_cp>=((int)0x30) && _cp<=((int)0x39)) { 
RDebugUtils.currentLine=226164745;
 //BA.debugLineNum = 226164745;BA.debugLine="xa.Row0Based = xa.Row0Based * 10 + cp - 0x30";
_xa.Row0Based /*int*/  = (int) (_xa.Row0Based /*int*/ *10+_cp-((int)0x30));
 }}
;
 }
};
RDebugUtils.currentLine=226164748;
 //BA.debugLineNum = 226164748;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ -1);
RDebugUtils.currentLine=226164749;
 //BA.debugLineNum = 226164749;BA.debugLine="xa.Row0Based = xa.Row0Based - 1";
_xa.Row0Based /*int*/  = (int) (_xa.Row0Based /*int*/ -1);
RDebugUtils.currentLine=226164750;
 //BA.debugLineNum = 226164750;BA.debugLine="Return xa";
if (true) return _xa;
RDebugUtils.currentLine=226164751;
 //BA.debugLineNum = 226164751;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellscript(b4j.docU.xlutils __ref,String _s) throws Exception{
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "powershellscript", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "powershellscript", new Object[] {_s}));}
ResumableSub_PowerShellScript rsub = new ResumableSub_PowerShellScript(this,__ref,_s);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellScript extends BA.ResumableSub {
public ResumableSub_PowerShellScript(b4j.docU.xlutils parent,b4j.docU.xlutils __ref,String _s) {
this.parent = parent;
this.__ref = __ref;
this._s = _s;
this.__ref = parent;
}
b4j.docU.xlutils __ref;
b4j.docU.xlutils parent;
String _s;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=227344385;
 //BA.debugLineNum = 227344385;BA.debugLine="s = s.Replace(CRLF, \";\").Replace(\"\"\"\", \"'\")";
_s = _s.replace(parent.__c.CRLF,";").replace("\"","'");
RDebugUtils.currentLine=227344386;
 //BA.debugLineNum = 227344386;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
RDebugUtils.currentLine=227344387;
 //BA.debugLineNum = 227344387;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"powershel";
_shl.InitializeDoNotHandleQuotes("shl","powershell.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("-Command"),(Object)(_s)}));
RDebugUtils.currentLine=227344388;
 //BA.debugLineNum = 227344388;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
RDebugUtils.currentLine=227344389;
 //BA.debugLineNum = 227344389;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "powershellscript"), null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_success = (boolean) result[1];
_exitcode = (int) result[2];
_stdout = (String) result[3];
_stderr = (String) result[4];
;
RDebugUtils.currentLine=227344390;
 //BA.debugLineNum = 227344390;BA.debugLine="Dim res As ShellSyncResult";
_res = new anywheresoftware.b4j.objects.Shell.ShellSyncResult();
RDebugUtils.currentLine=227344391;
 //BA.debugLineNum = 227344391;BA.debugLine="res.ExitCode = ExitCode";
_res.ExitCode = _exitcode;
RDebugUtils.currentLine=227344392;
 //BA.debugLineNum = 227344392;BA.debugLine="res.StdErr = StdErr";
_res.StdErr = _stderr;
RDebugUtils.currentLine=227344393;
 //BA.debugLineNum = 227344393;BA.debugLine="res.StdOut = StdOut";
_res.StdOut = _stdout;
RDebugUtils.currentLine=227344394;
 //BA.debugLineNum = 227344394;BA.debugLine="res.Success = Success";
_res.Success = _success;
RDebugUtils.currentLine=227344395;
 //BA.debugLineNum = 227344395;BA.debugLine="If StdErr <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((_stderr).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=227344396;
 //BA.debugLineNum = 227344396;BA.debugLine="Log(StdErr)";
parent.__c.LogImpl("9227344396",_stderr,0);
RDebugUtils.currentLine=227344397;
 //BA.debugLineNum = 227344397;BA.debugLine="If ExitCode = 0 Then res.ExitCode = 1";
if (true) break;

case 4:
//if
this.state = 9;
if (_exitcode==0) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_res.ExitCode = (int) (1);
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=227344399;
 //BA.debugLineNum = 227344399;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
RDebugUtils.currentLine=227344400;
 //BA.debugLineNum = 227344400;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4j.docU.xlutils._xlrange  _rangestringornametorange(b4j.docU.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,String _rangeorname) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "rangestringornametorange", true))
	 {return ((b4j.docU.xlutils._xlrange) Debug.delegate(ba, "rangestringornametorange", new Object[] {_poiworkbook,_rangeorname}));}
String _referstoformula = "";
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _name = null;
RDebugUtils.currentLine=226820096;
 //BA.debugLineNum = 226820096;BA.debugLine="Public Sub RangeStringOrNameToRange (PoiWorkbook A";
RDebugUtils.currentLine=226820097;
 //BA.debugLineNum = 226820097;BA.debugLine="Dim RefersToFormula As String";
_referstoformula = "";
RDebugUtils.currentLine=226820098;
 //BA.debugLineNum = 226820098;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
RDebugUtils.currentLine=226820099;
 //BA.debugLineNum = 226820099;BA.debugLine="Dim name As JavaObject = jo.RunMethod(\"getName\",";
_name = new anywheresoftware.b4j.object.JavaObject();
_name = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getName",new Object[]{(Object)(_rangeorname)})));
RDebugUtils.currentLine=226820100;
 //BA.debugLineNum = 226820100;BA.debugLine="If name.IsInitialized Then";
if (_name.IsInitialized()) { 
RDebugUtils.currentLine=226820101;
 //BA.debugLineNum = 226820101;BA.debugLine="RefersToFormula  = name.RunMethod(\"getRefersToFo";
_referstoformula = BA.ObjectToString(_name.RunMethod("getRefersToFormula",(Object[])(__c.Null)));
 }else {
RDebugUtils.currentLine=226820103;
 //BA.debugLineNum = 226820103;BA.debugLine="RefersToFormula = RangeOrName";
_referstoformula = _rangeorname;
 };
RDebugUtils.currentLine=226820105;
 //BA.debugLineNum = 226820105;BA.debugLine="Return FormulaToRange(PoiWorkbook, RefersToFormul";
if (true) return __ref._formulatorange /*b4j.docU.xlutils._xlrange*/ (null,_poiworkbook,_referstoformula,_rangeorname);
RDebugUtils.currentLine=226820106;
 //BA.debugLineNum = 226820106;BA.debugLine="End Sub";
return null;
}
public String  _addresstostring(b4j.docU.xlutils __ref,b4j.docU.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresstostring", true))
	 {return ((String) Debug.delegate(ba, "addresstostring", new Object[] {_address}));}
RDebugUtils.currentLine=226361344;
 //BA.debugLineNum = 226361344;BA.debugLine="Public Sub AddressToString (Address As XLAddress)";
RDebugUtils.currentLine=226361345;
 //BA.debugLineNum = 226361345;BA.debugLine="Return AddressToStringAbs(Address, False, False)";
if (true) return __ref._addresstostringabs /*String*/ (null,_address,__c.False,__c.False);
RDebugUtils.currentLine=226361346;
 //BA.debugLineNum = 226361346;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _xlrangetocellrangeaddress(b4j.docU.xlutils __ref,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "xlrangetocellrangeaddress", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "xlrangetocellrangeaddress", new Object[] {_range}));}
anywheresoftware.b4j.object.JavaObject _cellrange = null;
RDebugUtils.currentLine=226885632;
 //BA.debugLineNum = 226885632;BA.debugLine="Public Sub XLRangeToCellRangeAddress (Range As XLR";
RDebugUtils.currentLine=226885633;
 //BA.debugLineNum = 226885633;BA.debugLine="Dim CellRange As JavaObject";
_cellrange = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=226885634;
 //BA.debugLineNum = 226885634;BA.debugLine="CellRange.InitializeNewInstance(\"org.apache.poi.s";
_cellrange.InitializeNewInstance("org.apache.poi.ss.util.CellRangeAddress",new Object[]{(Object)(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ .Col0Based /*int*/ )});
RDebugUtils.currentLine=226885635;
 //BA.debugLineNum = 226885635;BA.debugLine="Return CellRange";
if (true) return _cellrange;
RDebugUtils.currentLine=226885636;
 //BA.debugLineNum = 226885636;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _xlrangetoareareference(b4j.docU.xlutils __ref,b4j.docU.xlworkbookwriter _workbook,b4j.docU.xlutils._xlrange _range) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "xlrangetoareareference", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "xlrangetoareareference", new Object[] {_workbook,_range}));}
anywheresoftware.b4j.object.JavaObject _cellreference1 = null;
anywheresoftware.b4j.object.JavaObject _cellreference2 = null;
anywheresoftware.b4j.object.JavaObject _areareference = null;
RDebugUtils.currentLine=226951168;
 //BA.debugLineNum = 226951168;BA.debugLine="Public Sub XLRangeToAreaReference (Workbook As XLW";
RDebugUtils.currentLine=226951169;
 //BA.debugLineNum = 226951169;BA.debugLine="Dim CellReference1 = XLAddressToCellReference(Ran";
_cellreference1 = new anywheresoftware.b4j.object.JavaObject();
_cellreference1 = __ref._xladdresstocellreference /*anywheresoftware.b4j.object.JavaObject*/ (null,_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.FirstAddress /*b4j.docU.xlutils._xladdress*/ );
RDebugUtils.currentLine=226951170;
 //BA.debugLineNum = 226951170;BA.debugLine="Dim CellReference2 = XLAddressToCellReference(Ran";
_cellreference2 = new anywheresoftware.b4j.object.JavaObject();
_cellreference2 = __ref._xladdresstocellreference /*anywheresoftware.b4j.object.JavaObject*/ (null,_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.SecondAddress /*b4j.docU.xlutils._xladdress*/ );
RDebugUtils.currentLine=226951171;
 //BA.debugLineNum = 226951171;BA.debugLine="Dim AreaReference As JavaObject";
_areareference = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=226951172;
 //BA.debugLineNum = 226951172;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
_areareference.InitializeNewInstance("org.apache.poi.ss.util.AreaReference",new Object[]{(Object)(_cellreference1.getObject()),(Object)(_cellreference2.getObject()),(Object)(_workbook._getversionname /*String*/ (null))});
RDebugUtils.currentLine=226951173;
 //BA.debugLineNum = 226951173;BA.debugLine="Return AreaReference";
if (true) return _areareference;
RDebugUtils.currentLine=226951174;
 //BA.debugLineNum = 226951174;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlutils._xlrange  _areareferencetoxlrange(b4j.docU.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,anywheresoftware.b4j.object.JavaObject _areareference) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "areareferencetoxlrange", true))
	 {return ((b4j.docU.xlutils._xlrange) Debug.delegate(ba, "areareferencetoxlrange", new Object[] {_poiworkbook,_areareference}));}
b4j.docU.xlutils._xlrange _res = null;
anywheresoftware.b4j.object.JavaObject _firstcell = null;
anywheresoftware.b4j.object.JavaObject _lastcell = null;
RDebugUtils.currentLine=226754560;
 //BA.debugLineNum = 226754560;BA.debugLine="Public Sub AreaReferenceToXLRange (PoiWorkbook As";
RDebugUtils.currentLine=226754561;
 //BA.debugLineNum = 226754561;BA.debugLine="Dim res As XLRange";
_res = new b4j.docU.xlutils._xlrange();
RDebugUtils.currentLine=226754562;
 //BA.debugLineNum = 226754562;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=226754563;
 //BA.debugLineNum = 226754563;BA.debugLine="Dim FirstCell = AreaReference.RunMethod(\"getFirst";
_firstcell = new anywheresoftware.b4j.object.JavaObject();
_firstcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_areareference.RunMethod("getFirstCell",(Object[])(__c.Null))));
_lastcell = new anywheresoftware.b4j.object.JavaObject();
_lastcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_areareference.RunMethod("getLastCell",(Object[])(__c.Null))));
RDebugUtils.currentLine=226754564;
 //BA.debugLineNum = 226754564;BA.debugLine="res.FirstAddress = AddressZero(FirstCell.RunMetho";
_res.FirstAddress /*b4j.docU.xlutils._xladdress*/  = __ref._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int)(BA.ObjectToNumber(_firstcell.RunMethod("getCol",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_firstcell.RunMethod("getRow",(Object[])(__c.Null)))));
RDebugUtils.currentLine=226754565;
 //BA.debugLineNum = 226754565;BA.debugLine="res.SecondAddress = AddressZero(LastCell.RunMetho";
_res.SecondAddress /*b4j.docU.xlutils._xladdress*/  = __ref._addresszero /*b4j.docU.xlutils._xladdress*/ (null,(int)(BA.ObjectToNumber(_lastcell.RunMethod("getCol",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_lastcell.RunMethod("getRow",(Object[])(__c.Null)))));
RDebugUtils.currentLine=226754566;
 //BA.debugLineNum = 226754566;BA.debugLine="res.Sheet = PoiWorkbook.GetSheetByName(FirstCell.";
_res.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _poiworkbook.GetSheetByName(BA.ObjectToString(_firstcell.RunMethod("getSheetName",(Object[])(__c.Null))));
RDebugUtils.currentLine=226754567;
 //BA.debugLineNum = 226754567;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=226754568;
 //BA.debugLineNum = 226754568;BA.debugLine="End Sub";
return null;
}
public String  _addressonetostring(b4j.docU.xlutils __ref,String _columnname,int _row1based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addressonetostring", true))
	 {return ((String) Debug.delegate(ba, "addressonetostring", new Object[] {_columnname,_row1based}));}
RDebugUtils.currentLine=226295808;
 //BA.debugLineNum = 226295808;BA.debugLine="Public Sub AddressOneToString(ColumnName As String";
RDebugUtils.currentLine=226295809;
 //BA.debugLineNum = 226295809;BA.debugLine="Return AddressToString(AddressOne(ColumnName, Row";
if (true) return __ref._addresstostring /*String*/ (null,__ref._addressone /*b4j.docU.xlutils._xladdress*/ (null,_columnname,_row1based));
RDebugUtils.currentLine=226295810;
 //BA.debugLineNum = 226295810;BA.debugLine="End Sub";
return "";
}
public String  _addresstostringabs(b4j.docU.xlutils __ref,b4j.docU.xlutils._xladdress _address,boolean _absolutecolumn,boolean _absoluterow) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresstostringabs", true))
	 {return ((String) Debug.delegate(ba, "addresstostringabs", new Object[] {_address,_absolutecolumn,_absoluterow}));}
int _c = 0;
String _col = "";
int _cmod = 0;
RDebugUtils.currentLine=226426880;
 //BA.debugLineNum = 226426880;BA.debugLine="Public Sub AddressToStringAbs(Address As XLAddress";
RDebugUtils.currentLine=226426881;
 //BA.debugLineNum = 226426881;BA.debugLine="Dim c As Int = Address.Col0Based + 1";
_c = (int) (_address.Col0Based /*int*/ +1);
RDebugUtils.currentLine=226426882;
 //BA.debugLineNum = 226426882;BA.debugLine="If Address.Col0Based < 0 Or Address.Row0Based < 0";
if (_address.Col0Based /*int*/ <0 || _address.Row0Based /*int*/ <0) { 
if (true) return "N/A";};
RDebugUtils.currentLine=226426883;
 //BA.debugLineNum = 226426883;BA.debugLine="Dim col As String";
_col = "";
RDebugUtils.currentLine=226426884;
 //BA.debugLineNum = 226426884;BA.debugLine="Do While c > 0";
while (_c>0) {
RDebugUtils.currentLine=226426885;
 //BA.debugLineNum = 226426885;BA.debugLine="Dim cmod As Int = c Mod 26";
_cmod = (int) (_c%26);
RDebugUtils.currentLine=226426886;
 //BA.debugLineNum = 226426886;BA.debugLine="If cmod = 0 Then cmod = 26";
if (_cmod==0) { 
_cmod = (int) (26);};
RDebugUtils.currentLine=226426887;
 //BA.debugLineNum = 226426887;BA.debugLine="col = Chr(0x40 + cmod) & col";
_col = BA.ObjectToString(__c.Chr((int) (((int)0x40)+_cmod)))+_col;
RDebugUtils.currentLine=226426888;
 //BA.debugLineNum = 226426888;BA.debugLine="c = Floor((c - 1) / 26)";
_c = (int) (__c.Floor((_c-1)/(double)26));
 }
;
RDebugUtils.currentLine=226426890;
 //BA.debugLineNum = 226426890;BA.debugLine="If AbsoluteColumn Then col = \"$\" & col";
if (_absolutecolumn) { 
_col = "$"+_col;};
RDebugUtils.currentLine=226426891;
 //BA.debugLineNum = 226426891;BA.debugLine="If AbsoluteRow Then col = col & \"$\"";
if (_absoluterow) { 
_col = _col+"$";};
RDebugUtils.currentLine=226426892;
 //BA.debugLineNum = 226426892;BA.debugLine="col = col & (Address.Row0Based + 1)";
_col = _col+BA.NumberToString((_address.Row0Based /*int*/ +1));
RDebugUtils.currentLine=226426893;
 //BA.debugLineNum = 226426893;BA.debugLine="Return col";
if (true) return _col;
RDebugUtils.currentLine=226426894;
 //BA.debugLineNum = 226426894;BA.debugLine="End Sub";
return "";
}
public String  _addresszerotostring(b4j.docU.xlutils __ref,int _col0based,int _row0based) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "addresszerotostring", true))
	 {return ((String) Debug.delegate(ba, "addresszerotostring", new Object[] {_col0based,_row0based}));}
RDebugUtils.currentLine=226099200;
 //BA.debugLineNum = 226099200;BA.debugLine="Public Sub AddressZeroToString(Col0Based As Int, R";
RDebugUtils.currentLine=226099201;
 //BA.debugLineNum = 226099201;BA.debugLine="Return AddressToString(AddressZero(Col0Based, Row";
if (true) return __ref._addresstostring /*String*/ (null,__ref._addresszero /*b4j.docU.xlutils._xladdress*/ (null,_col0based,_row0based));
RDebugUtils.currentLine=226099202;
 //BA.debugLineNum = 226099202;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.xlutils __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
RDebugUtils.currentLine=225902592;
 //BA.debugLineNum = 225902592;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=225902593;
 //BA.debugLineNum = 225902593;BA.debugLine="Public Reader As XLReader";
_reader = new b4j.docU.xlreader();
RDebugUtils.currentLine=225902594;
 //BA.debugLineNum = 225902594;BA.debugLine="Type XLAddress (Col0Based As Int, Row0Based As In";
;
RDebugUtils.currentLine=225902595;
 //BA.debugLineNum = 225902595;BA.debugLine="Type XLRange (Sheet As PoiSheet, FirstAddress As";
;
RDebugUtils.currentLine=225902596;
 //BA.debugLineNum = 225902596;BA.debugLine="Public CreateWriterPassword As String";
_createwriterpassword = "";
RDebugUtils.currentLine=225902597;
 //BA.debugLineNum = 225902597;BA.debugLine="Public COLOR_BLACK = 8 As Short";
_color_black = (short) (8);
RDebugUtils.currentLine=225902598;
 //BA.debugLineNum = 225902598;BA.debugLine="Public COLOR_WHITE = 9 As Short";
_color_white = (short) (9);
RDebugUtils.currentLine=225902599;
 //BA.debugLineNum = 225902599;BA.debugLine="Public COLOR_RED = 10 As Short";
_color_red = (short) (10);
RDebugUtils.currentLine=225902600;
 //BA.debugLineNum = 225902600;BA.debugLine="Public COLOR_BRIGHT_GREEN = 11 As Short";
_color_bright_green = (short) (11);
RDebugUtils.currentLine=225902601;
 //BA.debugLineNum = 225902601;BA.debugLine="Public COLOR_BLUE = 12 As Short";
_color_blue = (short) (12);
RDebugUtils.currentLine=225902602;
 //BA.debugLineNum = 225902602;BA.debugLine="Public COLOR_YELLOW = 13 As Short";
_color_yellow = (short) (13);
RDebugUtils.currentLine=225902603;
 //BA.debugLineNum = 225902603;BA.debugLine="Public COLOR_PINK = 14 As Short";
_color_pink = (short) (14);
RDebugUtils.currentLine=225902604;
 //BA.debugLineNum = 225902604;BA.debugLine="Public COLOR_TURQUOISE = 15 As Short";
_color_turquoise = (short) (15);
RDebugUtils.currentLine=225902605;
 //BA.debugLineNum = 225902605;BA.debugLine="Public COLOR_DARK_RED = 16 As Short";
_color_dark_red = (short) (16);
RDebugUtils.currentLine=225902606;
 //BA.debugLineNum = 225902606;BA.debugLine="Public COLOR_GREEN = 17 As Short";
_color_green = (short) (17);
RDebugUtils.currentLine=225902607;
 //BA.debugLineNum = 225902607;BA.debugLine="Public COLOR_DARK_BLUE = 18 As Short";
_color_dark_blue = (short) (18);
RDebugUtils.currentLine=225902608;
 //BA.debugLineNum = 225902608;BA.debugLine="Public COLOR_DARK_YELLOW = 19 As Short";
_color_dark_yellow = (short) (19);
RDebugUtils.currentLine=225902609;
 //BA.debugLineNum = 225902609;BA.debugLine="Public COLOR_VIOLET = 20 As Short";
_color_violet = (short) (20);
RDebugUtils.currentLine=225902610;
 //BA.debugLineNum = 225902610;BA.debugLine="Public COLOR_TEAL = 21 As Short";
_color_teal = (short) (21);
RDebugUtils.currentLine=225902611;
 //BA.debugLineNum = 225902611;BA.debugLine="Public COLOR_GREY_25_PERCENT = 22 As Short";
_color_grey_25_percent = (short) (22);
RDebugUtils.currentLine=225902612;
 //BA.debugLineNum = 225902612;BA.debugLine="Public COLOR_GREY_50_PERCENT = 23 As Short";
_color_grey_50_percent = (short) (23);
RDebugUtils.currentLine=225902613;
 //BA.debugLineNum = 225902613;BA.debugLine="Public COLOR_CORNFLOWER_BLUE = 24 As Short";
_color_cornflower_blue = (short) (24);
RDebugUtils.currentLine=225902614;
 //BA.debugLineNum = 225902614;BA.debugLine="Public COLOR_MAROON = 25 As Short";
_color_maroon = (short) (25);
RDebugUtils.currentLine=225902615;
 //BA.debugLineNum = 225902615;BA.debugLine="Public COLOR_LEMON_CHIFFON = 26 As Short";
_color_lemon_chiffon = (short) (26);
RDebugUtils.currentLine=225902616;
 //BA.debugLineNum = 225902616;BA.debugLine="Public COLOR_LIGHT_TURQUOISE1 = 27 As Short";
_color_light_turquoise1 = (short) (27);
RDebugUtils.currentLine=225902617;
 //BA.debugLineNum = 225902617;BA.debugLine="Public COLOR_ORCHID = 28 As Short";
_color_orchid = (short) (28);
RDebugUtils.currentLine=225902618;
 //BA.debugLineNum = 225902618;BA.debugLine="Public COLOR_CORAL = 29 As Short";
_color_coral = (short) (29);
RDebugUtils.currentLine=225902619;
 //BA.debugLineNum = 225902619;BA.debugLine="Public COLOR_ROYAL_BLUE = 30 As Short";
_color_royal_blue = (short) (30);
RDebugUtils.currentLine=225902620;
 //BA.debugLineNum = 225902620;BA.debugLine="Public COLOR_LIGHT_CORNFLOWER_BLUE = 31 As Short";
_color_light_cornflower_blue = (short) (31);
RDebugUtils.currentLine=225902621;
 //BA.debugLineNum = 225902621;BA.debugLine="Public COLOR_SKY_BLUE = 40 As Short";
_color_sky_blue = (short) (40);
RDebugUtils.currentLine=225902622;
 //BA.debugLineNum = 225902622;BA.debugLine="Public COLOR_LIGHT_TURQUOISE = 41 As Short";
_color_light_turquoise = (short) (41);
RDebugUtils.currentLine=225902623;
 //BA.debugLineNum = 225902623;BA.debugLine="Public COLOR_LIGHT_GREEN = 42 As Short";
_color_light_green = (short) (42);
RDebugUtils.currentLine=225902624;
 //BA.debugLineNum = 225902624;BA.debugLine="Public COLOR_LIGHT_YELLOW = 43 As Short";
_color_light_yellow = (short) (43);
RDebugUtils.currentLine=225902625;
 //BA.debugLineNum = 225902625;BA.debugLine="Public COLOR_PALE_BLUE = 44 As Short";
_color_pale_blue = (short) (44);
RDebugUtils.currentLine=225902626;
 //BA.debugLineNum = 225902626;BA.debugLine="Public COLOR_ROSE = 45 As Short";
_color_rose = (short) (45);
RDebugUtils.currentLine=225902627;
 //BA.debugLineNum = 225902627;BA.debugLine="Public COLOR_LAVENDER = 46 As Short";
_color_lavender = (short) (46);
RDebugUtils.currentLine=225902628;
 //BA.debugLineNum = 225902628;BA.debugLine="Public COLOR_TAN = 47 As Short";
_color_tan = (short) (47);
RDebugUtils.currentLine=225902629;
 //BA.debugLineNum = 225902629;BA.debugLine="Public COLOR_LIGHT_BLUE = 48 As Short";
_color_light_blue = (short) (48);
RDebugUtils.currentLine=225902630;
 //BA.debugLineNum = 225902630;BA.debugLine="Public COLOR_AQUA = 49 As Short";
_color_aqua = (short) (49);
RDebugUtils.currentLine=225902631;
 //BA.debugLineNum = 225902631;BA.debugLine="Public COLOR_LIME = 50 As Short";
_color_lime = (short) (50);
RDebugUtils.currentLine=225902632;
 //BA.debugLineNum = 225902632;BA.debugLine="Public COLOR_GOLD = 51 As Short";
_color_gold = (short) (51);
RDebugUtils.currentLine=225902633;
 //BA.debugLineNum = 225902633;BA.debugLine="Public COLOR_LIGHT_ORANGE = 52 As Short";
_color_light_orange = (short) (52);
RDebugUtils.currentLine=225902634;
 //BA.debugLineNum = 225902634;BA.debugLine="Public COLOR_ORANGE = 53 As Short";
_color_orange = (short) (53);
RDebugUtils.currentLine=225902635;
 //BA.debugLineNum = 225902635;BA.debugLine="Public COLOR_BLUE_GREY = 54 As Short";
_color_blue_grey = (short) (54);
RDebugUtils.currentLine=225902636;
 //BA.debugLineNum = 225902636;BA.debugLine="Public COLOR_GREY_40_PERCENT = 55 As Short";
_color_grey_40_percent = (short) (55);
RDebugUtils.currentLine=225902637;
 //BA.debugLineNum = 225902637;BA.debugLine="Public COLOR_DARK_TEAL = 56 As Short";
_color_dark_teal = (short) (56);
RDebugUtils.currentLine=225902638;
 //BA.debugLineNum = 225902638;BA.debugLine="Public COLOR_SEA_GREEN = 57 As Short";
_color_sea_green = (short) (57);
RDebugUtils.currentLine=225902639;
 //BA.debugLineNum = 225902639;BA.debugLine="Public COLOR_DARK_GREEN = 58 As Short";
_color_dark_green = (short) (58);
RDebugUtils.currentLine=225902640;
 //BA.debugLineNum = 225902640;BA.debugLine="Public COLOR_OLIVE_GREEN = 59 As Short";
_color_olive_green = (short) (59);
RDebugUtils.currentLine=225902641;
 //BA.debugLineNum = 225902641;BA.debugLine="Public COLOR_BROWN = 60 As Short";
_color_brown = (short) (60);
RDebugUtils.currentLine=225902642;
 //BA.debugLineNum = 225902642;BA.debugLine="Public COLOR_PLUM = 61 As Short";
_color_plum = (short) (61);
RDebugUtils.currentLine=225902643;
 //BA.debugLineNum = 225902643;BA.debugLine="Public COLOR_INDIGO = 62 As Short";
_color_indigo = (short) (62);
RDebugUtils.currentLine=225902644;
 //BA.debugLineNum = 225902644;BA.debugLine="Public COLOR_GREY_80_PERCENT = 63 As Short";
_color_grey_80_percent = (short) (63);
RDebugUtils.currentLine=225902645;
 //BA.debugLineNum = 225902645;BA.debugLine="Public COLOR_AUTOMATIC = 64 As Short";
_color_automatic = (short) (64);
RDebugUtils.currentLine=225902646;
 //BA.debugLineNum = 225902646;BA.debugLine="Public BlankWorkbookIs2007 As Boolean = True";
_blankworkbookis2007 = __c.True;
RDebugUtils.currentLine=225902647;
 //BA.debugLineNum = 225902647;BA.debugLine="End Sub";
return "";
}
public b4j.docU.xlutils._xlrange  _createxlrangewithsheet(b4j.docU.xlutils __ref,b4j.docU.xlutils._xladdress _firstaddress,b4j.docU.xlutils._xladdress _secondaddress,anywheresoftware.b4j.objects.PoiSheetWrapper _poisheet) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "createxlrangewithsheet", true))
	 {return ((b4j.docU.xlutils._xlrange) Debug.delegate(ba, "createxlrangewithsheet", new Object[] {_firstaddress,_secondaddress,_poisheet}));}
b4j.docU.xlutils._xlrange _t1 = null;
RDebugUtils.currentLine=227147776;
 //BA.debugLineNum = 227147776;BA.debugLine="Public Sub CreateXLRangeWithSheet (FirstAddress As";
RDebugUtils.currentLine=227147777;
 //BA.debugLineNum = 227147777;BA.debugLine="Dim t1 As XLRange";
_t1 = new b4j.docU.xlutils._xlrange();
RDebugUtils.currentLine=227147778;
 //BA.debugLineNum = 227147778;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=227147779;
 //BA.debugLineNum = 227147779;BA.debugLine="t1.FirstAddress = FirstAddress";
_t1.FirstAddress /*b4j.docU.xlutils._xladdress*/  = _firstaddress;
RDebugUtils.currentLine=227147780;
 //BA.debugLineNum = 227147780;BA.debugLine="t1.SecondAddress = SecondAddress";
_t1.SecondAddress /*b4j.docU.xlutils._xladdress*/  = _secondaddress;
RDebugUtils.currentLine=227147781;
 //BA.debugLineNum = 227147781;BA.debugLine="t1.Sheet = PoiSheet";
_t1.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _poisheet;
RDebugUtils.currentLine=227147782;
 //BA.debugLineNum = 227147782;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=227147783;
 //BA.debugLineNum = 227147783;BA.debugLine="End Sub";
return null;
}
public b4j.docU.xlutils._xlrange  _formulatorange(b4j.docU.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,String _formula,String _name) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "formulatorange", true))
	 {return ((b4j.docU.xlutils._xlrange) Debug.delegate(ba, "formulatorange", new Object[] {_poiworkbook,_formula,_name}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _areareference = null;
b4j.docU.xlutils._xlrange _res = null;
RDebugUtils.currentLine=226689024;
 //BA.debugLineNum = 226689024;BA.debugLine="Private Sub FormulaToRange (PoiWorkbook As PoiWork";
RDebugUtils.currentLine=226689025;
 //BA.debugLineNum = 226689025;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
RDebugUtils.currentLine=226689026;
 //BA.debugLineNum = 226689026;BA.debugLine="Dim AreaReference As JavaObject";
_areareference = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=226689027;
 //BA.debugLineNum = 226689027;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
_areareference.InitializeNewInstance("org.apache.poi.ss.util.AreaReference",new Object[]{(Object)(_formula),_jo.RunMethod("getSpreadsheetVersion",(Object[])(__c.Null))});
RDebugUtils.currentLine=226689028;
 //BA.debugLineNum = 226689028;BA.debugLine="Dim res As XLRange = AreaReferenceToXLRange(PoiWo";
_res = __ref._areareferencetoxlrange /*b4j.docU.xlutils._xlrange*/ (null,_poiworkbook,_areareference);
RDebugUtils.currentLine=226689029;
 //BA.debugLineNum = 226689029;BA.debugLine="res.Name = Name";
_res.Name /*String*/  = _name;
RDebugUtils.currentLine=226689030;
 //BA.debugLineNum = 226689030;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=226689031;
 //BA.debugLineNum = 226689031;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getworkbookrangenames(b4j.docU.xlutils __ref,anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "getworkbookrangenames", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getworkbookrangenames", new Object[] {_poiworkbook}));}
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.List _names = null;
anywheresoftware.b4j.object.JavaObject _name = null;
String _formula = "";
String _namename = "";
RDebugUtils.currentLine=226623488;
 //BA.debugLineNum = 226623488;BA.debugLine="Public Sub GetWorkbookRangeNames (PoiWorkbook As P";
RDebugUtils.currentLine=226623489;
 //BA.debugLineNum = 226623489;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=226623490;
 //BA.debugLineNum = 226623490;BA.debugLine="res.Initialize";
_res.Initialize();
RDebugUtils.currentLine=226623491;
 //BA.debugLineNum = 226623491;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
RDebugUtils.currentLine=226623492;
 //BA.debugLineNum = 226623492;BA.debugLine="Dim names As List = jo.RunMethod(\"getAllNames\", N";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jo.RunMethod("getAllNames",(Object[])(__c.Null))));
RDebugUtils.currentLine=226623493;
 //BA.debugLineNum = 226623493;BA.debugLine="For Each name As JavaObject In names";
_name = new anywheresoftware.b4j.object.JavaObject();
{
final anywheresoftware.b4a.BA.IterableList group5 = _names;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=226623494;
 //BA.debugLineNum = 226623494;BA.debugLine="Dim Formula As String = name.RunMethod(\"getRefer";
_formula = BA.ObjectToString(_name.RunMethod("getRefersToFormula",(Object[])(__c.Null)));
RDebugUtils.currentLine=226623495;
 //BA.debugLineNum = 226623495;BA.debugLine="Dim NameName As String = name.RunMethod(\"getName";
_namename = BA.ObjectToString(_name.RunMethod("getNameName",(Object[])(__c.Null)));
RDebugUtils.currentLine=226623496;
 //BA.debugLineNum = 226623496;BA.debugLine="Try";
try {RDebugUtils.currentLine=226623497;
 //BA.debugLineNum = 226623497;BA.debugLine="res.Add(FormulaToRange(PoiWorkbook, Formula , N";
_res.Add((Object)(__ref._formulatorange /*b4j.docU.xlutils._xlrange*/ (null,_poiworkbook,_formula,_namename)));
 } 
       catch (Exception e11) {
			ba.setLastException(e11);RDebugUtils.currentLine=226623499;
 //BA.debugLineNum = 226623499;BA.debugLine="Log($\"info: cannot get range of: ${NameName} -";
__c.LogImpl("9226623499",("info: cannot get range of: "+__c.SmartStringFormatter("",(Object)(_namename))+" - "+__c.SmartStringFormatter("",(Object)(_formula))+" "),0);
 };
 }
};
RDebugUtils.currentLine=226623502;
 //BA.debugLineNum = 226623502;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=226623503;
 //BA.debugLineNum = 226623503;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellconverttopdf(b4j.docU.xlutils __ref,String _inputfile,String _outputfile,int _sheetindex,boolean _openpdf) throws Exception{
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "powershellconverttopdf", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "powershellconverttopdf", new Object[] {_inputfile,_outputfile,_sheetindex,_openpdf}));}
ResumableSub_PowerShellConvertToPdf rsub = new ResumableSub_PowerShellConvertToPdf(this,__ref,_inputfile,_outputfile,_sheetindex,_openpdf);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellConvertToPdf extends BA.ResumableSub {
public ResumableSub_PowerShellConvertToPdf(b4j.docU.xlutils parent,b4j.docU.xlutils __ref,String _inputfile,String _outputfile,int _sheetindex,boolean _openpdf) {
this.parent = parent;
this.__ref = __ref;
this._inputfile = _inputfile;
this._outputfile = _outputfile;
this._sheetindex = _sheetindex;
this._openpdf = _openpdf;
this.__ref = parent;
}
b4j.docU.xlutils __ref;
b4j.docU.xlutils parent;
String _inputfile;
String _outputfile;
int _sheetindex;
boolean _openpdf;
String _objecttoconvert = "";
String _s = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="xlutils";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=227278849;
 //BA.debugLineNum = 227278849;BA.debugLine="File.Delete(OutputFile, \"\")";
parent.__c.File.Delete(_outputfile,"");
RDebugUtils.currentLine=227278850;
 //BA.debugLineNum = 227278850;BA.debugLine="If File.Exists(OutputFile, \"\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.File.Exists(_outputfile,"")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=227278851;
 //BA.debugLineNum = 227278851;BA.debugLine="Log(\"Cannot delete output file\")";
parent.__c.LogImpl("9227278851","Cannot delete output file",0);
RDebugUtils.currentLine=227278852;
 //BA.debugLineNum = 227278852;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=227278854;
 //BA.debugLineNum = 227278854;BA.debugLine="Dim ObjectToConvert As String";
_objecttoconvert = "";
RDebugUtils.currentLine=227278855;
 //BA.debugLineNum = 227278855;BA.debugLine="If SheetIndex < 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_sheetindex<0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=227278856;
 //BA.debugLineNum = 227278856;BA.debugLine="ObjectToConvert = \"$workbook\"";
_objecttoconvert = "$workbook";
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=227278858;
 //BA.debugLineNum = 227278858;BA.debugLine="ObjectToConvert = $\"$workbook.Sheets[${SheetInde";
_objecttoconvert = ("$workbook.Sheets["+parent.__c.SmartStringFormatter("",(Object)(_sheetindex+1))+"]");
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=227278860;
 //BA.debugLineNum = 227278860;BA.debugLine="Dim s As String = $\" 	& {$objExcel = New-Object -";
_s = ("\n"+"	& {$objExcel = New-Object -ComObject excel.application\n"+"$workbook = $objExcel.workbooks.open('"+parent.__c.SmartStringFormatter("",(Object)(_inputfile))+"', 3)\n"+""+parent.__c.SmartStringFormatter("",(Object)(_objecttoconvert))+".ExportAsFixedFormat($xlFixedFormat::xlTypePDF, '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"')\n"+"$objExcel.Workbooks.close()\n"+"$objExcel.Quit()}");
RDebugUtils.currentLine=227278866;
 //BA.debugLineNum = 227278866;BA.debugLine="Wait For (PowerShellScript(s)) Complete (Result A";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "powershellconverttopdf"), __ref._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_s));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[1];
;
RDebugUtils.currentLine=227278867;
 //BA.debugLineNum = 227278867;BA.debugLine="If Result.ExitCode <> 0 Then Return False";
if (true) break;

case 11:
//if
this.state = 16;
if (_result.ExitCode!=0) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=227278868;
 //BA.debugLineNum = 227278868;BA.debugLine="If OpenPdf Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_openpdf) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=227278869;
 //BA.debugLineNum = 227278869;BA.debugLine="Wait For (PowerShellScript($\"& {Invoke-Item '${O";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "xlutils", "powershellconverttopdf"), __ref._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,("& {Invoke-Item '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"'}")));
this.state = 22;
return;
case 22:
//C
this.state = 20;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[1];
;
RDebugUtils.currentLine=227278870;
 //BA.debugLineNum = 227278870;BA.debugLine="Return Result.ExitCode = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result.ExitCode==0));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=227278872;
 //BA.debugLineNum = 227278872;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=227278873;
 //BA.debugLineNum = 227278873;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4j.object.JavaObject  _xladdresstocellreference(b4j.docU.xlutils __ref,String _sheetname,b4j.docU.xlutils._xladdress _address) throws Exception{
__ref = this;
RDebugUtils.currentModule="xlutils";
if (Debug.shouldDelegate(ba, "xladdresstocellreference", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "xladdresstocellreference", new Object[] {_sheetname,_address}));}
anywheresoftware.b4j.object.JavaObject _cellreference1 = null;
RDebugUtils.currentLine=227016704;
 //BA.debugLineNum = 227016704;BA.debugLine="Public Sub XLAddressToCellReference (SheetName As";
RDebugUtils.currentLine=227016705;
 //BA.debugLineNum = 227016705;BA.debugLine="Dim CellReference1 As JavaObject";
_cellreference1 = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=227016706;
 //BA.debugLineNum = 227016706;BA.debugLine="CellReference1.InitializeNewInstance(\"org.apache.";
_cellreference1.InitializeNewInstance("org.apache.poi.ss.util.CellReference",new Object[]{(Object)(_sheetname),(Object)(_address.Row0Based /*int*/ ),(Object)(_address.Col0Based /*int*/ ),(Object)(__c.True),(Object)(__c.True)});
RDebugUtils.currentLine=227016707;
 //BA.debugLineNum = 227016707;BA.debugLine="Return CellReference1";
if (true) return _cellreference1;
RDebugUtils.currentLine=227016708;
 //BA.debugLineNum = 227016708;BA.debugLine="End Sub";
return null;
}
}