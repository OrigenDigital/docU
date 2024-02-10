package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class draganddrop extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.draganddrop", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.draganddrop.class).invoke(this, new Object[] {null});
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
public Object _mode = null;
public String[] _dataid = null;
public Object[] _dataobject = null;
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _dragboardimg = null;
public double _dragboardimgoffsetx = 0;
public double _dragboardimgoffsety = 0;
public boolean _startdrag = false;
public Object _callback = null;
public String _seventname = "";
public String _teventname = "";
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
public String  _initialize(b4j.docU.draganddrop __ref,anywheresoftware.b4a.BA _ba,Object _vcallback) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_vcallback}));}
RDebugUtils.currentLine=116719616;
 //BA.debugLineNum = 116719616;BA.debugLine="Public Sub Initialize(vCallBack As Object)";
RDebugUtils.currentLine=116719617;
 //BA.debugLineNum = 116719617;BA.debugLine="CallBack = vCallBack";
__ref._callback /*Object*/  = _vcallback;
RDebugUtils.currentLine=116719618;
 //BA.debugLineNum = 116719618;BA.debugLine="TransferMode.Initialize";
_transfermode._initialize /*String*/ ();
RDebugUtils.currentLine=116719619;
 //BA.debugLineNum = 116719619;BA.debugLine="End Sub";
return "";
}
public String  _makedragtarget(b4j.docU.draganddrop __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _pnode,String _veventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "makedragtarget", true))
	 {return ((String) Debug.delegate(ba, "makedragtarget", new Object[] {_pnode,_veventname}));}
Object _event = null;
RDebugUtils.currentLine=117178368;
 //BA.debugLineNum = 117178368;BA.debugLine="Public Sub MakeDragTarget(pNode As Node, vEventNam";
RDebugUtils.currentLine=117178369;
 //BA.debugLineNum = 117178369;BA.debugLine="tEventName = vEventName";
__ref._teventname /*String*/  = _veventname;
RDebugUtils.currentLine=117178370;
 //BA.debugLineNum = 117178370;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragOver\") T";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragOver")) { 
RDebugUtils.currentLine=117178371;
 //BA.debugLineNum = 117178371;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragOver",__c.Null);
RDebugUtils.currentLine=117178372;
 //BA.debugLineNum = 117178372;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragOver\",Array(Even";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragOver",new Object[]{_event});
 };
RDebugUtils.currentLine=117178374;
 //BA.debugLineNum = 117178374;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragEntered\"";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragEntered")) { 
RDebugUtils.currentLine=117178375;
 //BA.debugLineNum = 117178375;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragEntered",__c.Null);
RDebugUtils.currentLine=117178376;
 //BA.debugLineNum = 117178376;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragEntered\",Array(E";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragEntered",new Object[]{_event});
 };
RDebugUtils.currentLine=117178378;
 //BA.debugLineNum = 117178378;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragExited\")";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragExited")) { 
RDebugUtils.currentLine=117178379;
 //BA.debugLineNum = 117178379;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragExited",__c.Null);
RDebugUtils.currentLine=117178380;
 //BA.debugLineNum = 117178380;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragExited\",Array(Ev";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragExited",new Object[]{_event});
 };
RDebugUtils.currentLine=117178382;
 //BA.debugLineNum = 117178382;BA.debugLine="If SubExists(CallBack,tEventName & \"_DragDropped\"";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragDropped")) { 
RDebugUtils.currentLine=117178383;
 //BA.debugLineNum = 117178383;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragDropped",__c.Null);
RDebugUtils.currentLine=117178384;
 //BA.debugLineNum = 117178384;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDropped\",Array(E";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragDropped",new Object[]{_event});
 };
RDebugUtils.currentLine=117178386;
 //BA.debugLineNum = 117178386;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.object.JavaObject  _asjo(b4j.docU.draganddrop __ref,anywheresoftware.b4j.object.JavaObject _jo) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "asjo", true))
	 {return ((anywheresoftware.b4j.object.JavaObject) Debug.delegate(ba, "asjo", new Object[] {_jo}));}
RDebugUtils.currentLine=117571584;
 //BA.debugLineNum = 117571584;BA.debugLine="Private Sub AsJO(JO As JavaObject) As JavaObject";
RDebugUtils.currentLine=117571585;
 //BA.debugLineNum = 117571585;BA.debugLine="Return JO";
if (true) return _jo;
RDebugUtils.currentLine=117571586;
 //BA.debugLineNum = 117571586;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper  _asmouseevent(b4j.docU.draganddrop __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "asmouseevent", true))
	 {return ((anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) Debug.delegate(ba, "asmouseevent", new Object[] {_m}));}
RDebugUtils.currentLine=117506048;
 //BA.debugLineNum = 117506048;BA.debugLine="Private Sub AsMouseEvent(M As MouseEvent) As Mouse";
RDebugUtils.currentLine=117506049;
 //BA.debugLineNum = 117506049;BA.debugLine="Return M";
if (true) return _m;
RDebugUtils.currentLine=117506050;
 //BA.debugLineNum = 117506050;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.docU.draganddrop __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
RDebugUtils.currentLine=116654080;
 //BA.debugLineNum = 116654080;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=116654081;
 //BA.debugLineNum = 116654081;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=116654082;
 //BA.debugLineNum = 116654082;BA.debugLine="Private Mode As Object";
_mode = new Object();
RDebugUtils.currentLine=116654083;
 //BA.debugLineNum = 116654083;BA.debugLine="Private DataID() As String";
_dataid = new String[(int) (0)];
java.util.Arrays.fill(_dataid,"");
RDebugUtils.currentLine=116654084;
 //BA.debugLineNum = 116654084;BA.debugLine="Private DataObject() As Object";
_dataobject = new Object[(int) (0)];
{
int d0 = _dataobject.length;
for (int i0 = 0;i0 < d0;i0++) {
_dataobject[i0] = new Object();
}
}
;
RDebugUtils.currentLine=116654085;
 //BA.debugLineNum = 116654085;BA.debugLine="Private DragboardImg As Image";
_dragboardimg = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=116654086;
 //BA.debugLineNum = 116654086;BA.debugLine="Private DragboardImgOffsetX,DragboardImgOffsetY A";
_dragboardimgoffsetx = 0;
_dragboardimgoffsety = 0;
RDebugUtils.currentLine=116654087;
 //BA.debugLineNum = 116654087;BA.debugLine="Private StartDrag As Boolean";
_startdrag = false;
RDebugUtils.currentLine=116654088;
 //BA.debugLineNum = 116654088;BA.debugLine="Private CallBack As Object";
_callback = new Object();
RDebugUtils.currentLine=116654089;
 //BA.debugLineNum = 116654089;BA.debugLine="Private sEventName,tEventName As String";
_seventname = "";
_teventname = "";
RDebugUtils.currentLine=116654090;
 //BA.debugLineNum = 116654090;BA.debugLine="End Sub";
return "";
}
public Object  _dragdetected_event(b4j.docU.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragdetected_event", true))
	 {return ((Object) Debug.delegate(ba, "dragdetected_event", new Object[] {_methodname,_args}));}
anywheresoftware.b4j.object.JavaObject _dataformat = null;
b4j.docU.dragboard _db = null;
int _i = 0;
anywheresoftware.b4j.object.JavaObject _ldf = null;
anywheresoftware.b4j.object.JavaObject _clipboardcontent = null;
RDebugUtils.currentLine=116850688;
 //BA.debugLineNum = 116850688;BA.debugLine="Private Sub DragDetected_Event(MethodName As Stri";
RDebugUtils.currentLine=116850690;
 //BA.debugLineNum = 116850690;BA.debugLine="CallSub2(CallBack,sEventName & \"_DragDetected\",A";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDetected",(Object)(__ref._asmouseevent /*anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper*/ (null,(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper(), (javafx.scene.input.MouseEvent)(_args[(int) (0)])))));
RDebugUtils.currentLine=116850692;
 //BA.debugLineNum = 116850692;BA.debugLine="If StartDrag Then";
if (__ref._startdrag /*boolean*/ ) { 
RDebugUtils.currentLine=116850693;
 //BA.debugLineNum = 116850693;BA.debugLine="Dim DataFormat As JavaObject";
_dataformat = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=116850694;
 //BA.debugLineNum = 116850694;BA.debugLine="DataFormat.InitializeStatic(\"javafx.scene.input";
_dataformat.InitializeStatic("javafx.scene.input.DataFormat");
RDebugUtils.currentLine=116850695;
 //BA.debugLineNum = 116850695;BA.debugLine="Dim DB As Dragboard";
_db = new b4j.docU.dragboard();
RDebugUtils.currentLine=116850696;
 //BA.debugLineNum = 116850696;BA.debugLine="DB.Initialize";
_db._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=116850697;
 //BA.debugLineNum = 116850697;BA.debugLine="DB.SetObject(AsJO(Args(0)).RunMethodJO(\"getSour";
_db._setobject /*String*/ (null,__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_args[(int) (0)]))).RunMethodJO("getSource",(Object[])(__c.Null)).RunMethod("startDragAndDrop",new Object[]{__ref._mode /*Object*/ }));
RDebugUtils.currentLine=116850698;
 //BA.debugLineNum = 116850698;BA.debugLine="For i = 0 To DataID.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._dataid /*String[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=116850699;
 //BA.debugLineNum = 116850699;BA.debugLine="Dim LDF As JavaObject = DataFormat.RunMethod(\"";
_ldf = new anywheresoftware.b4j.object.JavaObject();
_ldf = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_dataformat.RunMethod("lookupMimeType",new Object[]{(Object)(__ref._dataid /*String[]*/ [_i])})));
RDebugUtils.currentLine=116850700;
 //BA.debugLineNum = 116850700;BA.debugLine="If LDF.IsInitialized = False Then LDF.Initiali";
if (_ldf.IsInitialized()==__c.False) { 
_ldf.InitializeNewInstance("javafx.scene.input.DataFormat",new Object[]{(Object)(new String[]{__ref._dataid /*String[]*/ [_i]})});};
RDebugUtils.currentLine=116850701;
 //BA.debugLineNum = 116850701;BA.debugLine="If DragboardImg.IsInitialized Then DB.SetDragV";
if (__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ .IsInitialized()) { 
_db._setdragview /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ (null,__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/ ,__ref._dragboardimgoffsetx /*double*/ ,__ref._dragboardimgoffsety /*double*/ );};
RDebugUtils.currentLine=116850702;
 //BA.debugLineNum = 116850702;BA.debugLine="Dim ClipboardContent As JavaObject";
_clipboardcontent = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=116850703;
 //BA.debugLineNum = 116850703;BA.debugLine="ClipboardContent.InitializeNewInstance(\"javafx";
_clipboardcontent.InitializeNewInstance("javafx.scene.input.ClipboardContent",(Object[])(__c.Null));
RDebugUtils.currentLine=116850704;
 //BA.debugLineNum = 116850704;BA.debugLine="If DataObject(i) Is Image Then";
if (__ref._dataobject /*Object[]*/ [_i] instanceof javafx.scene.image.Image) { 
RDebugUtils.currentLine=116850705;
 //BA.debugLineNum = 116850705;BA.debugLine="ClipboardContent.RunMethod(\"putImage\",Array(D";
_clipboardcontent.RunMethod("putImage",new Object[]{__ref._dataobject /*Object[]*/ [_i]});
 }else {
RDebugUtils.currentLine=116850707;
 //BA.debugLineNum = 116850707;BA.debugLine="ClipboardContent.RunMethod(\"put\",Array(LDF,Da";
_clipboardcontent.RunMethod("put",new Object[]{(Object)(_ldf.getObject()),__ref._dataobject /*Object[]*/ [_i]});
 };
RDebugUtils.currentLine=116850709;
 //BA.debugLineNum = 116850709;BA.debugLine="DB.setContent(ClipboardContent)";
_db._setcontent /*String*/ (null,(Object)(_clipboardcontent.getObject()));
 }
};
 };
RDebugUtils.currentLine=116850713;
 //BA.debugLineNum = 116850713;BA.debugLine="End Sub";
return null;
}
public Object  _dragdone_event(b4j.docU.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragdone_event", true))
	 {return ((Object) Debug.delegate(ba, "dragdone_event", new Object[] {_methodname,_args}));}
b4j.docU.dragevent _de = null;
RDebugUtils.currentLine=116916224;
 //BA.debugLineNum = 116916224;BA.debugLine="Private Sub DragDone_Event(MethodName As String,A";
RDebugUtils.currentLine=116916225;
 //BA.debugLineNum = 116916225;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.docU.dragevent();
RDebugUtils.currentLine=116916226;
 //BA.debugLineNum = 116916226;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=116916227;
 //BA.debugLineNum = 116916227;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=116916228;
 //BA.debugLineNum = 116916228;BA.debugLine="CallSub2(CallBack,sEventName & \"_DragDone\",DE)";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDone",(Object)(_de));
RDebugUtils.currentLine=116916229;
 //BA.debugLineNum = 116916229;BA.debugLine="End Sub";
return null;
}
public Object  _dragdropped_event(b4j.docU.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragdropped_event", true))
	 {return ((Object) Debug.delegate(ba, "dragdropped_event", new Object[] {_methodname,_args}));}
b4j.docU.dragevent _de = null;
RDebugUtils.currentLine=117440512;
 //BA.debugLineNum = 117440512;BA.debugLine="Private Sub DragDropped_Event(MethodName As Strin";
RDebugUtils.currentLine=117440513;
 //BA.debugLineNum = 117440513;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.docU.dragevent();
RDebugUtils.currentLine=117440514;
 //BA.debugLineNum = 117440514;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=117440515;
 //BA.debugLineNum = 117440515;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=117440516;
 //BA.debugLineNum = 117440516;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragDropped\",DE";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragDropped",(Object)(_de));
RDebugUtils.currentLine=117440517;
 //BA.debugLineNum = 117440517;BA.debugLine="End Sub";
return null;
}
public Object  _dragentered_event(b4j.docU.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragentered_event", true))
	 {return ((Object) Debug.delegate(ba, "dragentered_event", new Object[] {_methodname,_args}));}
b4j.docU.dragevent _de = null;
RDebugUtils.currentLine=117309440;
 //BA.debugLineNum = 117309440;BA.debugLine="Private Sub DragEntered_Event(MethodName As Strin";
RDebugUtils.currentLine=117309441;
 //BA.debugLineNum = 117309441;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.docU.dragevent();
RDebugUtils.currentLine=117309442;
 //BA.debugLineNum = 117309442;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=117309443;
 //BA.debugLineNum = 117309443;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=117309444;
 //BA.debugLineNum = 117309444;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragEntered\",DE";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragEntered",(Object)(_de));
RDebugUtils.currentLine=117309445;
 //BA.debugLineNum = 117309445;BA.debugLine="End Sub";
return null;
}
public Object  _dragexited_event(b4j.docU.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragexited_event", true))
	 {return ((Object) Debug.delegate(ba, "dragexited_event", new Object[] {_methodname,_args}));}
b4j.docU.dragevent _de = null;
RDebugUtils.currentLine=117374976;
 //BA.debugLineNum = 117374976;BA.debugLine="Private Sub DragExited_Event(MethodName As String";
RDebugUtils.currentLine=117374977;
 //BA.debugLineNum = 117374977;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.docU.dragevent();
RDebugUtils.currentLine=117374978;
 //BA.debugLineNum = 117374978;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=117374979;
 //BA.debugLineNum = 117374979;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=117374980;
 //BA.debugLineNum = 117374980;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragExited\",DE)";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragExited",(Object)(_de));
RDebugUtils.currentLine=117374981;
 //BA.debugLineNum = 117374981;BA.debugLine="End Sub";
return null;
}
public Object  _dragover_event(b4j.docU.draganddrop __ref,String _methodname,Object[] _args) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "dragover_event", true))
	 {return ((Object) Debug.delegate(ba, "dragover_event", new Object[] {_methodname,_args}));}
b4j.docU.dragevent _de = null;
RDebugUtils.currentLine=117243904;
 //BA.debugLineNum = 117243904;BA.debugLine="Private Sub DragOver_Event(MethodName As String,A";
RDebugUtils.currentLine=117243905;
 //BA.debugLineNum = 117243905;BA.debugLine="Dim DE As DragEvent";
_de = new b4j.docU.dragevent();
RDebugUtils.currentLine=117243906;
 //BA.debugLineNum = 117243906;BA.debugLine="DE.Initialize";
_de._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=117243907;
 //BA.debugLineNum = 117243907;BA.debugLine="DE.SetObject(Args(0))";
_de._setobject /*String*/ (null,_args[(int) (0)]);
RDebugUtils.currentLine=117243908;
 //BA.debugLineNum = 117243908;BA.debugLine="CallSub2(CallBack,tEventName & \"_DragOver\",DE)";
__c.CallSubNew2(ba,__ref._callback /*Object*/ ,__ref._teventname /*String*/ +"_DragOver",(Object)(_de));
RDebugUtils.currentLine=117243909;
 //BA.debugLineNum = 117243909;BA.debugLine="End Sub";
return null;
}
public String  _makedragsource(b4j.docU.draganddrop __ref,anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _pnode,String _veventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "makedragsource", true))
	 {return ((String) Debug.delegate(ba, "makedragsource", new Object[] {_pnode,_veventname}));}
Object _event = null;
RDebugUtils.currentLine=116785152;
 //BA.debugLineNum = 116785152;BA.debugLine="Public Sub MakeDragSource(pNode As Node, vEventNam";
RDebugUtils.currentLine=116785153;
 //BA.debugLineNum = 116785153;BA.debugLine="sEventName = vEventName";
__ref._seventname /*String*/  = _veventname;
RDebugUtils.currentLine=116785154;
 //BA.debugLineNum = 116785154;BA.debugLine="If SubExists(CallBack,sEventName & \"_DragDetected";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDetected")) { 
RDebugUtils.currentLine=116785155;
 //BA.debugLineNum = 116785155;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragDetected",__c.Null);
RDebugUtils.currentLine=116785156;
 //BA.debugLineNum = 116785156;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDetected\",Array(";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragDetected",new Object[]{_event});
 };
RDebugUtils.currentLine=116785159;
 //BA.debugLineNum = 116785159;BA.debugLine="If SubExists(CallBack,sEventName & \"_DragDone\") T";
if (__c.SubExists(ba,__ref._callback /*Object*/ ,__ref._seventname /*String*/ +"_DragDone")) { 
RDebugUtils.currentLine=116785160;
 //BA.debugLineNum = 116785160;BA.debugLine="Dim Event As Object = AsJO(pNode).CreateEvent(\"j";
_event = __ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).CreateEvent(ba,"javafx.event.EventHandler","DragDone",__c.Null);
RDebugUtils.currentLine=116785161;
 //BA.debugLineNum = 116785161;BA.debugLine="AsJO(pNode).RunMethod(\"setOnDragDone\",Array(Even";
__ref._asjo /*anywheresoftware.b4j.object.JavaObject*/ (null,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnode.getObject()))).RunMethod("setOnDragDone",new Object[]{_event});
 };
RDebugUtils.currentLine=116785164;
 //BA.debugLineNum = 116785164;BA.debugLine="End Sub";
return "";
}
public String  _setdragmodeanddata(b4j.docU.draganddrop __ref,Object _tmode,String[] _dataids,Object[] _dataobjects) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "setdragmodeanddata", true))
	 {return ((String) Debug.delegate(ba, "setdragmodeanddata", new Object[] {_tmode,_dataids,_dataobjects}));}
RDebugUtils.currentLine=116981760;
 //BA.debugLineNum = 116981760;BA.debugLine="Public Sub SetDragModeAndData(tMode As Object,Data";
RDebugUtils.currentLine=116981761;
 //BA.debugLineNum = 116981761;BA.debugLine="Mode = tMode";
__ref._mode /*Object*/  = _tmode;
RDebugUtils.currentLine=116981762;
 //BA.debugLineNum = 116981762;BA.debugLine="DataID = DataIDs";
__ref._dataid /*String[]*/  = _dataids;
RDebugUtils.currentLine=116981763;
 //BA.debugLineNum = 116981763;BA.debugLine="DataObject = DataObjects";
__ref._dataobject /*Object[]*/  = _dataobjects;
RDebugUtils.currentLine=116981764;
 //BA.debugLineNum = 116981764;BA.debugLine="StartDrag = True";
__ref._startdrag /*boolean*/  = __c.True;
RDebugUtils.currentLine=116981765;
 //BA.debugLineNum = 116981765;BA.debugLine="DragboardImg = Null";
__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/  = (anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper(), (javafx.scene.image.Image)(__c.Null));
RDebugUtils.currentLine=116981766;
 //BA.debugLineNum = 116981766;BA.debugLine="DragboardImgOffsetX = 0";
__ref._dragboardimgoffsetx /*double*/  = 0;
RDebugUtils.currentLine=116981767;
 //BA.debugLineNum = 116981767;BA.debugLine="DragboardImgOffsetY = 0";
__ref._dragboardimgoffsety /*double*/  = 0;
RDebugUtils.currentLine=116981768;
 //BA.debugLineNum = 116981768;BA.debugLine="End Sub";
return "";
}
public String  _setdragmodeanddata2(b4j.docU.draganddrop __ref,Object _tmode,String[] _dataids,Object[] _dataobjects,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _dragboardimage) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "setdragmodeanddata2", true))
	 {return ((String) Debug.delegate(ba, "setdragmodeanddata2", new Object[] {_tmode,_dataids,_dataobjects,_dragboardimage}));}
RDebugUtils.currentLine=117047296;
 //BA.debugLineNum = 117047296;BA.debugLine="Public Sub SetDragModeAndData2(tMode As Object,Dat";
RDebugUtils.currentLine=117047297;
 //BA.debugLineNum = 117047297;BA.debugLine="Mode = tMode";
__ref._mode /*Object*/  = _tmode;
RDebugUtils.currentLine=117047298;
 //BA.debugLineNum = 117047298;BA.debugLine="DataID = DataIDs";
__ref._dataid /*String[]*/  = _dataids;
RDebugUtils.currentLine=117047299;
 //BA.debugLineNum = 117047299;BA.debugLine="DataObject = DataObjects";
__ref._dataobject /*Object[]*/  = _dataobjects;
RDebugUtils.currentLine=117047300;
 //BA.debugLineNum = 117047300;BA.debugLine="StartDrag = True";
__ref._startdrag /*boolean*/  = __c.True;
RDebugUtils.currentLine=117047301;
 //BA.debugLineNum = 117047301;BA.debugLine="DragboardImg = DragboardImage";
__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/  = _dragboardimage;
RDebugUtils.currentLine=117047302;
 //BA.debugLineNum = 117047302;BA.debugLine="DragboardImgOffsetX = 0";
__ref._dragboardimgoffsetx /*double*/  = 0;
RDebugUtils.currentLine=117047303;
 //BA.debugLineNum = 117047303;BA.debugLine="DragboardImgOffsetY = 0";
__ref._dragboardimgoffsety /*double*/  = 0;
RDebugUtils.currentLine=117047304;
 //BA.debugLineNum = 117047304;BA.debugLine="End Sub";
return "";
}
public String  _setdragmodeanddata3(b4j.docU.draganddrop __ref,Object _tmode,String[] _dataids,Object[] _dataobjects,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _dragboardimage,double _imageoffsetx,double _imageoffsety) throws Exception{
__ref = this;
RDebugUtils.currentModule="draganddrop";
if (Debug.shouldDelegate(ba, "setdragmodeanddata3", true))
	 {return ((String) Debug.delegate(ba, "setdragmodeanddata3", new Object[] {_tmode,_dataids,_dataobjects,_dragboardimage,_imageoffsetx,_imageoffsety}));}
RDebugUtils.currentLine=117112832;
 //BA.debugLineNum = 117112832;BA.debugLine="Public Sub SetDragModeAndData3(tMode As Object,Dat";
RDebugUtils.currentLine=117112833;
 //BA.debugLineNum = 117112833;BA.debugLine="Mode = tMode";
__ref._mode /*Object*/  = _tmode;
RDebugUtils.currentLine=117112834;
 //BA.debugLineNum = 117112834;BA.debugLine="DataID = DataIDs";
__ref._dataid /*String[]*/  = _dataids;
RDebugUtils.currentLine=117112835;
 //BA.debugLineNum = 117112835;BA.debugLine="DataObject = DataObjects";
__ref._dataobject /*Object[]*/  = _dataobjects;
RDebugUtils.currentLine=117112836;
 //BA.debugLineNum = 117112836;BA.debugLine="StartDrag = True";
__ref._startdrag /*boolean*/  = __c.True;
RDebugUtils.currentLine=117112837;
 //BA.debugLineNum = 117112837;BA.debugLine="DragboardImg = DragboardImage";
__ref._dragboardimg /*anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper*/  = _dragboardimage;
RDebugUtils.currentLine=117112838;
 //BA.debugLineNum = 117112838;BA.debugLine="DragboardImgOffsetX = ImageOffsetX";
__ref._dragboardimgoffsetx /*double*/  = _imageoffsetx;
RDebugUtils.currentLine=117112839;
 //BA.debugLineNum = 117112839;BA.debugLine="DragboardImgOffsetY = ImageOffsetY";
__ref._dragboardimgoffsety /*double*/  = _imageoffsety;
RDebugUtils.currentLine=117112840;
 //BA.debugLineNum = 117112840;BA.debugLine="End Sub";
return "";
}
}