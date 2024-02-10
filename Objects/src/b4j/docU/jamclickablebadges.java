package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jamclickablebadges extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamclickablebadges", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jamclickablebadges.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _jamclickablebadgedata{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper ParentView;
public String DataType;
public Object Value;
public anywheresoftware.b4a.objects.B4XViewWrapper Panel;
public int Radius;
public int BackGroundColor;
public int TextColor;
public float TextSize;
public int AnimationDuration;
public void Initialize() {
IsInitialized = true;
ParentView = new anywheresoftware.b4a.objects.B4XViewWrapper();
DataType = "";
Value = new Object();
Panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
Radius = 0;
BackGroundColor = 0;
TextColor = 0;
TextSize = 0f;
AnimationDuration = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _mcallback = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.collections.Map _mviews = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _stub = null;
public anywheresoftware.b4a.objects.collections.List _lstbadges = null;
public String _datatypestring = "";
public String _datatypeint = "";
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
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setbadge(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,b4j.docU.jamclickablebadges._jamclickablebadgedata _badgedata) throws Exception{
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "setbadge", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "setbadge", new Object[] {_view,_badgedata}));}
ResumableSub_SetBadge rsub = new ResumableSub_SetBadge(this,__ref,_view,_badgedata);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetBadge extends BA.ResumableSub {
public ResumableSub_SetBadge(b4j.docU.jamclickablebadges parent,b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,b4j.docU.jamclickablebadges._jamclickablebadgedata _badgedata) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this._badgedata = _badgedata;
this.__ref = parent;
}
b4j.docU.jamclickablebadges __ref;
b4j.docU.jamclickablebadges parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
b4j.docU.jamclickablebadges._jamclickablebadgedata _badgedata;
Object _robj = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamclickablebadges";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=123338754;
 //BA.debugLineNum = 123338754;BA.debugLine="If mViews.ContainsKey(view) Then";
if (true) break;

case 1:
//if
this.state = 48;
if (__ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_view.getObject()))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 48;
RDebugUtils.currentLine=123338755;
 //BA.debugLineNum = 123338755;BA.debugLine="wait for(ReplaceLabel(view, BadgeData.Value)) co";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamclickablebadges", "setbadge"), __ref._replacelabel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,_view,_badgedata.Value /*Object*/ ));
this.state = 49;
return;
case 49:
//C
this.state = 48;
_robj = (Object) result[1];
;
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=123338757;
 //BA.debugLineNum = 123338757;BA.debugLine="If BadgeData.BackGroundColor=0 Then BadgeData.Ba";
if (true) break;

case 6:
//if
this.state = 11;
if (_badgedata.BackGroundColor /*int*/ ==0) { 
this.state = 8;
;}if (true) break;

case 8:
//C
this.state = 11;
_badgedata.BackGroundColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red;
if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=123338758;
 //BA.debugLineNum = 123338758;BA.debugLine="If BadgeData.TextColor=0 Then BadgeData.TextColo";
if (true) break;

case 12:
//if
this.state = 17;
if (_badgedata.TextColor /*int*/ ==0) { 
this.state = 14;
;}if (true) break;

case 14:
//C
this.state = 17;
_badgedata.TextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
if (true) break;

case 17:
//C
this.state = 18;
;
RDebugUtils.currentLine=123338759;
 //BA.debugLineNum = 123338759;BA.debugLine="If BadgeData.TextSize=0 Then BadgeData.TextSize=";
if (true) break;

case 18:
//if
this.state = 23;
if (_badgedata.TextSize /*float*/ ==0) { 
this.state = 20;
;}if (true) break;

case 20:
//C
this.state = 23;
_badgedata.TextSize /*float*/  = (float) (16);
if (true) break;

case 23:
//C
this.state = 24;
;
RDebugUtils.currentLine=123338760;
 //BA.debugLineNum = 123338760;BA.debugLine="If BadgeData.DataType=Null Then BadgeData.DataTy";
if (true) break;

case 24:
//if
this.state = 29;
if (_badgedata.DataType /*String*/ == null) { 
this.state = 26;
;}if (true) break;

case 26:
//C
this.state = 29;
_badgedata.DataType /*String*/  = __ref._datatypestring /*String*/ ;
if (true) break;

case 29:
//C
this.state = 30;
;
RDebugUtils.currentLine=123338761;
 //BA.debugLineNum = 123338761;BA.debugLine="If BadgeData.DataType=\"\" Then BadgeData.DataType";
if (true) break;

case 30:
//if
this.state = 35;
if ((_badgedata.DataType /*String*/ ).equals("")) { 
this.state = 32;
;}if (true) break;

case 32:
//C
this.state = 35;
_badgedata.DataType /*String*/  = __ref._datatypestring /*String*/ ;
if (true) break;

case 35:
//C
this.state = 36;
;
RDebugUtils.currentLine=123338762;
 //BA.debugLineNum = 123338762;BA.debugLine="If BadgeData.AnimationDuration=0 Then BadgeData.";
if (true) break;

case 36:
//if
this.state = 41;
if (_badgedata.AnimationDuration /*int*/ ==0) { 
this.state = 38;
;}if (true) break;

case 38:
//C
this.state = 41;
_badgedata.AnimationDuration /*int*/  = (int) (250);
if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=123338763;
 //BA.debugLineNum = 123338763;BA.debugLine="If BadgeData.Radius=0 Then BadgeData.Radius=15di";
if (true) break;

case 42:
//if
this.state = 47;
if (_badgedata.Radius /*int*/ ==0) { 
this.state = 44;
;}if (true) break;

case 44:
//C
this.state = 47;
_badgedata.Radius /*int*/  = parent.__c.DipToCurrent((int) (15));
if (true) break;

case 47:
//C
this.state = 48;
;
RDebugUtils.currentLine=123338765;
 //BA.debugLineNum = 123338765;BA.debugLine="mViews.Put(view, BadgeData)";
__ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_view.getObject()),(Object)(_badgedata));
RDebugUtils.currentLine=123338766;
 //BA.debugLineNum = 123338766;BA.debugLine="Dim p As B4XView = CreateNewPanel(view)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createnewpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_view);
RDebugUtils.currentLine=123338767;
 //BA.debugLineNum = 123338767;BA.debugLine="BadgeData.Panel=p";
_badgedata.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _p;
RDebugUtils.currentLine=123338768;
 //BA.debugLineNum = 123338768;BA.debugLine="BadgeData.ParentView=view";
_badgedata.ParentView /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
RDebugUtils.currentLine=123338769;
 //BA.debugLineNum = 123338769;BA.debugLine="CreateLabel(BadgeData)";
__ref._createlabel /*String*/ (null,_badgedata);
RDebugUtils.currentLine=123338770;
 //BA.debugLineNum = 123338770;BA.debugLine="p.SetLayoutAnimated(BadgeData.AnimationDuration,";
_p.SetLayoutAnimated(_badgedata.AnimationDuration /*int*/ ,__ref._getcx /*float*/ (null,_view)-_badgedata.Radius /*int*/ ,__ref._getcy /*float*/ (null,_view)-_badgedata.Radius /*int*/ ,_badgedata.Radius /*int*/ *2,_badgedata.Radius /*int*/ *2);
 if (true) break;

case 48:
//C
this.state = -1;
;
RDebugUtils.currentLine=123338772;
 //BA.debugLineNum = 123338772;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=123338773;
 //BA.debugLineNum = 123338773;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _replacelabel(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,Object _value) throws Exception{
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "replacelabel", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "replacelabel", new Object[] {_view,_value}));}
ResumableSub_ReplaceLabel rsub = new ResumableSub_ReplaceLabel(this,__ref,_view,_value);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_ReplaceLabel extends BA.ResumableSub {
public ResumableSub_ReplaceLabel(b4j.docU.jamclickablebadges parent,b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this._value = _value;
this.__ref = parent;
}
b4j.docU.jamclickablebadges __ref;
b4j.docU.jamclickablebadges parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
Object _value;
b4j.docU.jamclickablebadges._jamclickablebadgedata _databadge = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamclickablebadges";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=123469825;
 //BA.debugLineNum = 123469825;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataBad";
_databadge = __ref._getdatabadge /*b4j.docU.jamclickablebadges._jamclickablebadgedata*/ (null,(Object)(_view.getObject()));
RDebugUtils.currentLine=123469826;
 //BA.debugLineNum = 123469826;BA.debugLine="Dim lbl As B4XView = GetLabel(GetPanel(view))";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,__ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject())));
RDebugUtils.currentLine=123469827;
 //BA.debugLineNum = 123469827;BA.debugLine="lbl.SetLayoutAnimated(DataBadge.AnimationDuration";
_lbl.SetLayoutAnimated((int) (_databadge.AnimationDuration /*int*/ /(double)2),_databadge.Radius /*int*/ +parent.__c.DipToCurrent((int) (8)),0,_databadge.Radius /*int*/ *2,_databadge.Radius /*int*/ *2);
RDebugUtils.currentLine=123469828;
 //BA.debugLineNum = 123469828;BA.debugLine="DataBadge.Value=Value";
_databadge.Value /*Object*/  = _value;
RDebugUtils.currentLine=123469829;
 //BA.debugLineNum = 123469829;BA.debugLine="CreateLabel(DataBadge)";
__ref._createlabel /*String*/ (null,_databadge);
RDebugUtils.currentLine=123469830;
 //BA.debugLineNum = 123469830;BA.debugLine="Sleep(DataBadge.AnimationDuration / 2)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamclickablebadges", "replacelabel"),(int) (_databadge.AnimationDuration /*int*/ /(double)2));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=123469831;
 //BA.debugLineNum = 123469831;BA.debugLine="lbl.RemoveViewFromParent";
_lbl.RemoveViewFromParent();
RDebugUtils.currentLine=123469832;
 //BA.debugLineNum = 123469832;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=123469833;
 //BA.debugLineNum = 123469833;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=123273216;
 //BA.debugLineNum = 123273216;BA.debugLine="Public Sub Initialize(CallBack As Object, EventNam";
RDebugUtils.currentLine=123273217;
 //BA.debugLineNum = 123273217;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=123273218;
 //BA.debugLineNum = 123273218;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=123273219;
 //BA.debugLineNum = 123273219;BA.debugLine="mViews.Initialize";
__ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=123273220;
 //BA.debugLineNum = 123273220;BA.debugLine="lstBadges.Initialize";
__ref._lstbadges /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=123273221;
 //BA.debugLineNum = 123273221;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.docU.jamclickablebadges __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
RDebugUtils.currentLine=123207680;
 //BA.debugLineNum = 123207680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=123207681;
 //BA.debugLineNum = 123207681;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=123207683;
 //BA.debugLineNum = 123207683;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=123207684;
 //BA.debugLineNum = 123207684;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=123207692;
 //BA.debugLineNum = 123207692;BA.debugLine="Private mViews As Map";
_mviews = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=123207693;
 //BA.debugLineNum = 123207693;BA.debugLine="Private stub As B4XView 'ignore";
_stub = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=123207698;
 //BA.debugLineNum = 123207698;BA.debugLine="Private lstBadges As List";
_lstbadges = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=123207700;
 //BA.debugLineNum = 123207700;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=123207704;
 //BA.debugLineNum = 123207704;BA.debugLine="Type JamClickableBadgeData(ParentView As B4XView,";
;
RDebugUtils.currentLine=123207707;
 //BA.debugLineNum = 123207707;BA.debugLine="Public const DataTypeString As String=\"string\"";
_datatypestring = "string";
RDebugUtils.currentLine=123207708;
 //BA.debugLineNum = 123207708;BA.debugLine="Public const DataTypeInt As String=\"int\"";
_datatypeint = "int";
RDebugUtils.currentLine=123207709;
 //BA.debugLineNum = 123207709;BA.debugLine="End Sub";
return "";
}
public String  _createlabel(b4j.docU.jamclickablebadges __ref,b4j.docU.jamclickablebadges._jamclickablebadgedata _databadge) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((String) Debug.delegate(ba, "createlabel", new Object[] {_databadge}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _svalue = "";
int _intvalue = 0;
int _duration = 0;
RDebugUtils.currentLine=123928576;
 //BA.debugLineNum = 123928576;BA.debugLine="Private Sub CreateLabel(DataBadge As JamClickableB";
RDebugUtils.currentLine=123928577;
 //BA.debugLineNum = 123928577;BA.debugLine="Dim p As B4XView=DataBadge.Panel";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _databadge.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=123928578;
 //BA.debugLineNum = 123928578;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=123928579;
 //BA.debugLineNum = 123928579;BA.debugLine="lbl.Initialize(\"lblBadge\")";
_lbl.Initialize(ba,"lblBadge");
RDebugUtils.currentLine=123928580;
 //BA.debugLineNum = 123928580;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=123928581;
 //BA.debugLineNum = 123928581;BA.debugLine="xlbl.Font = xui.CreateDefaultBoldFont(DataBadge.T";
_xlbl.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont(_databadge.TextSize /*float*/ ));
RDebugUtils.currentLine=123928582;
 //BA.debugLineNum = 123928582;BA.debugLine="xlbl.TextColor = DataBadge.TextColor";
_xlbl.setTextColor(_databadge.TextColor /*int*/ );
RDebugUtils.currentLine=123928583;
 //BA.debugLineNum = 123928583;BA.debugLine="Select Case DataBadge.DataType";
switch (BA.switchObjectToInt(_databadge.DataType /*String*/ ,"string","int")) {
case 0: {
RDebugUtils.currentLine=123928585;
 //BA.debugLineNum = 123928585;BA.debugLine="Dim sValue As String=DataBadge.Value";
_svalue = BA.ObjectToString(_databadge.Value /*Object*/ );
RDebugUtils.currentLine=123928586;
 //BA.debugLineNum = 123928586;BA.debugLine="xlbl.Text = sValue";
_xlbl.setText(_svalue);
 break; }
case 1: {
RDebugUtils.currentLine=123928588;
 //BA.debugLineNum = 123928588;BA.debugLine="Dim intValue As Int=DataBadge.Value";
_intvalue = (int)(BA.ObjectToNumber(_databadge.Value /*Object*/ ));
RDebugUtils.currentLine=123928589;
 //BA.debugLineNum = 123928589;BA.debugLine="xlbl.Text =intValue";
_xlbl.setText(BA.NumberToString(_intvalue));
 break; }
}
;
RDebugUtils.currentLine=123928592;
 //BA.debugLineNum = 123928592;BA.debugLine="p.AddView(xlbl, DataBadge.Radius, DataBadge.Radiu";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),_databadge.Radius /*int*/ ,_databadge.Radius /*int*/ -__c.Max((_databadge.TextSize /*float*/ /(double)2),0),0,0);
RDebugUtils.currentLine=123928593;
 //BA.debugLineNum = 123928593;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=123928594;
 //BA.debugLineNum = 123928594;BA.debugLine="Dim duration As Int = DataBadge.AnimationDuration";
_duration = _databadge.AnimationDuration /*int*/ ;
RDebugUtils.currentLine=123928595;
 //BA.debugLineNum = 123928595;BA.debugLine="xlbl.SetLayoutAnimated(duration, 0, 0, DataBadge.";
_xlbl.SetLayoutAnimated(_duration,0,0,_databadge.Radius /*int*/ *2,_databadge.Radius /*int*/ *2);
RDebugUtils.currentLine=123928596;
 //BA.debugLineNum = 123928596;BA.debugLine="xlbl.Visible = False";
_xlbl.setVisible(__c.False);
RDebugUtils.currentLine=123928597;
 //BA.debugLineNum = 123928597;BA.debugLine="xlbl.SetVisibleAnimated(DataBadge.AnimationDurati";
_xlbl.SetVisibleAnimated(ba,_databadge.AnimationDuration /*int*/ ,__c.True);
RDebugUtils.currentLine=123928598;
 //BA.debugLineNum = 123928598;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createnewpanel(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "createnewpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createnewpanel", new Object[] {_view}));}
b4j.docU.jamclickablebadges._jamclickablebadgedata _databadge = null;
anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xp = null;
anywheresoftware.b4a.objects.B4XViewWrapper _parent = null;
RDebugUtils.currentLine=123863040;
 //BA.debugLineNum = 123863040;BA.debugLine="Private Sub CreateNewPanel(view As B4XView) As B4X";
RDebugUtils.currentLine=123863041;
 //BA.debugLineNum = 123863041;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataBad";
_databadge = __ref._getdatabadge /*b4j.docU.jamclickablebadges._jamclickablebadgedata*/ (null,(Object)(_view.getObject()));
RDebugUtils.currentLine=123863043;
 //BA.debugLineNum = 123863043;BA.debugLine="Dim p As Pane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=123863047;
 //BA.debugLineNum = 123863047;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
RDebugUtils.currentLine=123863051;
 //BA.debugLineNum = 123863051;BA.debugLine="Dim xp As B4XView = p";
_xp = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xp = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=123863052;
 //BA.debugLineNum = 123863052;BA.debugLine="xp.SetColorAndBorder(DataBadge.BackGroundColor, 0";
_xp.SetColorAndBorder(_databadge.BackGroundColor /*int*/ ,0,_databadge.BackGroundColor /*int*/ ,_databadge.Radius /*int*/ );
RDebugUtils.currentLine=123863055;
 //BA.debugLineNum = 123863055;BA.debugLine="Dim parent As B4XView = view.Parent";
_parent = new anywheresoftware.b4a.objects.B4XViewWrapper();
_parent = _view.getParent();
RDebugUtils.currentLine=123863056;
 //BA.debugLineNum = 123863056;BA.debugLine="parent.AddView(xp, GetCx(view), GetCy(view), 0, 0";
_parent.AddView((javafx.scene.Node)(_xp.getObject()),__ref._getcx /*float*/ (null,_view),__ref._getcy /*float*/ (null,_view),0,0);
RDebugUtils.currentLine=123863057;
 //BA.debugLineNum = 123863057;BA.debugLine="Return p";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_p.getObject()));
RDebugUtils.currentLine=123863058;
 //BA.debugLineNum = 123863058;BA.debugLine="End Sub";
return null;
}
public b4j.docU.jamclickablebadges._jamclickablebadgedata  _getdatabadge(b4j.docU.jamclickablebadges __ref,Object _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "getdatabadge", true))
	 {return ((b4j.docU.jamclickablebadges._jamclickablebadgedata) Debug.delegate(ba, "getdatabadge", new Object[] {_view}));}
b4j.docU.jamclickablebadges._jamclickablebadgedata _databadge = null;
RDebugUtils.currentLine=123535360;
 //BA.debugLineNum = 123535360;BA.debugLine="Public Sub GetDataBadge(view As Object) As JamClic";
RDebugUtils.currentLine=123535362;
 //BA.debugLineNum = 123535362;BA.debugLine="If mViews.ContainsKey(view) Then";
if (__ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey(_view)) { 
RDebugUtils.currentLine=123535363;
 //BA.debugLineNum = 123535363;BA.debugLine="Dim DataBadge As JamClickableBadgeData=mViews.Ge";
_databadge = (b4j.docU.jamclickablebadges._jamclickablebadgedata)(__ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_view));
 }else {
RDebugUtils.currentLine=123535365;
 //BA.debugLineNum = 123535365;BA.debugLine="Dim DataBadge As JamClickableBadgeData";
_databadge = new b4j.docU.jamclickablebadges._jamclickablebadgedata();
RDebugUtils.currentLine=123535366;
 //BA.debugLineNum = 123535366;BA.debugLine="DataBadge.Initialize";
_databadge.Initialize();
 };
RDebugUtils.currentLine=123535368;
 //BA.debugLineNum = 123535368;BA.debugLine="Return	DataBadge";
if (true) return _databadge;
RDebugUtils.currentLine=123535369;
 //BA.debugLineNum = 123535369;BA.debugLine="End Sub";
return null;
}
public float  _getcx(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "getcx", true))
	 {return ((Float) Debug.delegate(ba, "getcx", new Object[] {_view}));}
float _cx = 0f;
RDebugUtils.currentLine=123666432;
 //BA.debugLineNum = 123666432;BA.debugLine="private Sub GetCx(view As B4XView) As Float";
RDebugUtils.currentLine=123666433;
 //BA.debugLineNum = 123666433;BA.debugLine="Dim cx As Float= view.Left + view.Width";
_cx = (float) (_view.getLeft()+_view.getWidth());
RDebugUtils.currentLine=123666434;
 //BA.debugLineNum = 123666434;BA.debugLine="Return cx";
if (true) return _cx;
RDebugUtils.currentLine=123666435;
 //BA.debugLineNum = 123666435;BA.debugLine="End Sub";
return 0f;
}
public float  _getcy(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "getcy", true))
	 {return ((Float) Debug.delegate(ba, "getcy", new Object[] {_view}));}
float _cy = 0f;
RDebugUtils.currentLine=123731968;
 //BA.debugLineNum = 123731968;BA.debugLine="private Sub GetCy(view As B4XView) As Float";
RDebugUtils.currentLine=123731969;
 //BA.debugLineNum = 123731969;BA.debugLine="Dim cy As Float= view.Top";
_cy = (float) (_view.getTop());
RDebugUtils.currentLine=123731970;
 //BA.debugLineNum = 123731970;BA.debugLine="Return cy";
if (true) return _cy;
RDebugUtils.currentLine=123731971;
 //BA.debugLineNum = 123731971;BA.debugLine="End Sub";
return 0f;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabel(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _panel) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "getlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabel", new Object[] {_panel}));}
RDebugUtils.currentLine=123797504;
 //BA.debugLineNum = 123797504;BA.debugLine="Private Sub GetLabel(panel As B4XView) As B4XView";
RDebugUtils.currentLine=123797505;
 //BA.debugLineNum = 123797505;BA.debugLine="Return panel.GetView(panel.NumberOfViews - 1)";
if (true) return _panel.GetView((int) (_panel.getNumberOfViews()-1));
RDebugUtils.currentLine=123797506;
 //BA.debugLineNum = 123797506;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4j.docU.jamclickablebadges __ref,Object _view) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_view}));}
b4j.docU.jamclickablebadges._jamclickablebadgedata _databadge = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=123600896;
 //BA.debugLineNum = 123600896;BA.debugLine="Private Sub GetPanel (view As Object) As B4XView";
RDebugUtils.currentLine=123600898;
 //BA.debugLineNum = 123600898;BA.debugLine="Dim DataBadge As JamClickableBadgeData=mViews.Get";
_databadge = (b4j.docU.jamclickablebadges._jamclickablebadgedata)(__ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_view));
RDebugUtils.currentLine=123600899;
 //BA.debugLineNum = 123600899;BA.debugLine="Dim p As B4XView=DataBadge.panel";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _databadge.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=123600900;
 //BA.debugLineNum = 123600900;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=123600901;
 //BA.debugLineNum = 123600901;BA.debugLine="End Sub";
return null;
}
public String  _lblbadge_mousereleased(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "lblbadge_mousereleased", true))
	 {return ((String) Debug.delegate(ba, "lblbadge_mousereleased", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lblbadge = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
boolean _bfound = false;
anywheresoftware.b4a.objects.B4XViewWrapper _b4xv = null;
b4j.docU.jamclickablebadges._jamclickablebadgedata _databadge = null;
RDebugUtils.currentLine=123994112;
 //BA.debugLineNum = 123994112;BA.debugLine="Sub lblBadge_MouseReleased (EventData As MouseEven";
RDebugUtils.currentLine=123994113;
 //BA.debugLineNum = 123994113;BA.debugLine="Dim lblBadge As B4XView=Sender";
_lblbadge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lblbadge = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=123994114;
 //BA.debugLineNum = 123994114;BA.debugLine="If SubExists(mCallBack,mEventName & \"_BadgeClick\"";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BadgeClick")) { 
RDebugUtils.currentLine=123994115;
 //BA.debugLineNum = 123994115;BA.debugLine="Dim p As B4XView=lblBadge.Parent";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _lblbadge.getParent();
RDebugUtils.currentLine=123994117;
 //BA.debugLineNum = 123994117;BA.debugLine="Dim bFound As Boolean";
_bfound = false;
RDebugUtils.currentLine=123994118;
 //BA.debugLineNum = 123994118;BA.debugLine="For Each B4Xv As B4XView In mViews.Keys";
_b4xv = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_b4xv = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=123994119;
 //BA.debugLineNum = 123994119;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataB";
_databadge = __ref._getdatabadge /*b4j.docU.jamclickablebadges._jamclickablebadgedata*/ (null,(Object)(_b4xv.getObject()));
RDebugUtils.currentLine=123994120;
 //BA.debugLineNum = 123994120;BA.debugLine="If p=DataBadge.Panel Then";
if ((_p).equals(_databadge.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ )) { 
RDebugUtils.currentLine=123994121;
 //BA.debugLineNum = 123994121;BA.debugLine="bFound=True";
_bfound = __c.True;
RDebugUtils.currentLine=123994122;
 //BA.debugLineNum = 123994122;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=123994125;
 //BA.debugLineNum = 123994125;BA.debugLine="If bFound Then CallSub2(mCallBack,mEventName & \"";
if (_bfound) { 
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_BadgeClick",(Object)(_databadge));};
 };
RDebugUtils.currentLine=123994127;
 //BA.debugLineNum = 123994127;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _removebadge(b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
RDebugUtils.currentModule="jamclickablebadges";
if (Debug.shouldDelegate(ba, "removebadge", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "removebadge", new Object[] {_view}));}
ResumableSub_RemoveBadge rsub = new ResumableSub_RemoveBadge(this,__ref,_view);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_RemoveBadge extends BA.ResumableSub {
public ResumableSub_RemoveBadge(b4j.docU.jamclickablebadges parent,b4j.docU.jamclickablebadges __ref,anywheresoftware.b4a.objects.B4XViewWrapper _view) {
this.parent = parent;
this.__ref = __ref;
this._view = _view;
this.__ref = parent;
}
b4j.docU.jamclickablebadges __ref;
b4j.docU.jamclickablebadges parent;
anywheresoftware.b4a.objects.B4XViewWrapper _view;
b4j.docU.jamclickablebadges._jamclickablebadgedata _databadge = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamclickablebadges";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=123404289;
 //BA.debugLineNum = 123404289;BA.debugLine="Dim DataBadge As JamClickableBadgeData=GetDataBad";
_databadge = __ref._getdatabadge /*b4j.docU.jamclickablebadges._jamclickablebadgedata*/ (null,(Object)(_view.getObject()));
RDebugUtils.currentLine=123404290;
 //BA.debugLineNum = 123404290;BA.debugLine="Dim p As B4XView = GetPanel(view)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,(Object)(_view.getObject()));
RDebugUtils.currentLine=123404291;
 //BA.debugLineNum = 123404291;BA.debugLine="GetLabel(p).RemoveViewFromParent";
__ref._getlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_p).RemoveViewFromParent();
RDebugUtils.currentLine=123404292;
 //BA.debugLineNum = 123404292;BA.debugLine="mViews.Remove(view)";
__ref._mviews /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_view.getObject()));
RDebugUtils.currentLine=123404293;
 //BA.debugLineNum = 123404293;BA.debugLine="p.SetLayoutAnimated(DataBadge.AnimationDuration,";
_p.SetLayoutAnimated(_databadge.AnimationDuration /*int*/ ,__ref._getcx /*float*/ (null,_view),__ref._getcy /*float*/ (null,_view),0,0);
RDebugUtils.currentLine=123404294;
 //BA.debugLineNum = 123404294;BA.debugLine="Sleep(DataBadge.AnimationDuration)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamclickablebadges", "removebadge"),_databadge.AnimationDuration /*int*/ );
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=123404295;
 //BA.debugLineNum = 123404295;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
RDebugUtils.currentLine=123404296;
 //BA.debugLineNum = 123404296;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
RDebugUtils.currentLine=123404297;
 //BA.debugLineNum = 123404297;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}