package b4j.docU;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class jamtableclvclvdragger extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.docU", "b4j.docU.jamtableclvclvdragger", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.docU.jamtableclvclvdragger.class).invoke(this, new Object[] {null});
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
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public b4j.example.customlistview _list = null;
public int _pressedcolor = 0;
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
public String  _adddragbuttons(b4j.docU.jamtableclvclvdragger __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvclvdragger";
if (Debug.shouldDelegate(ba, "adddragbuttons", true))
	 {return ((String) Debug.delegate(ba, "adddragbuttons", null));}
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=181665792;
 //BA.debugLineNum = 181665792;BA.debugLine="Public Sub AddDragButtons";
RDebugUtils.currentLine=181665793;
 //BA.debugLineNum = 181665793;BA.debugLine="list.PressedColor = xui.Color_Transparent";
__ref._list /*b4j.example.customlistview*/ ._pressedcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent;
RDebugUtils.currentLine=181665794;
 //BA.debugLineNum = 181665794;BA.debugLine="Dim fnt As B4XFont = xui.CreateMaterialIcons(30)";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_fnt = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons((float) (30));
RDebugUtils.currentLine=181665795;
 //BA.debugLineNum = 181665795;BA.debugLine="For i = 0 To list.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._list /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=181665796;
 //BA.debugLineNum = 181665796;BA.debugLine="Dim p As B4XView = list.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._list /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=181665797;
 //BA.debugLineNum = 181665797;BA.debugLine="If IsLastViewADragLabel(p) = False Then";
if (__ref._islastviewadraglabel /*boolean*/ (null,_p)==__c.False) { 
RDebugUtils.currentLine=181665798;
 //BA.debugLineNum = 181665798;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=181665799;
 //BA.debugLineNum = 181665799;BA.debugLine="lbl.Initialize(\"drag\")";
_lbl.Initialize(ba,"drag");
RDebugUtils.currentLine=181665800;
 //BA.debugLineNum = 181665800;BA.debugLine="lbl.MouseCursor = fx.Cursors.HAND";
_lbl.setMouseCursor(__ref._fx /*anywheresoftware.b4j.objects.JFX*/ .Cursors.HAND);
RDebugUtils.currentLine=181665801;
 //BA.debugLineNum = 181665801;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=181665802;
 //BA.debugLineNum = 181665802;BA.debugLine="xlbl.Font = fnt";
_xlbl.setFont(_fnt);
RDebugUtils.currentLine=181665803;
 //BA.debugLineNum = 181665803;BA.debugLine="xlbl.Text = Chr(0xE25D)";
_xlbl.setText(BA.ObjectToString(__c.Chr(((int)0xe25d))));
RDebugUtils.currentLine=181665806;
 //BA.debugLineNum = 181665806;BA.debugLine="xlbl.TextColor = 0xFFFFA500";
_xlbl.setTextColor(((int)0xffffa500));
RDebugUtils.currentLine=181665807;
 //BA.debugLineNum = 181665807;BA.debugLine="xlbl.Tag = list";
_xlbl.setTag((Object)(__ref._list /*b4j.example.customlistview*/ ));
RDebugUtils.currentLine=181665809;
 //BA.debugLineNum = 181665809;BA.debugLine="p.AddView(xlbl, 2dip, p.Height / 2 - 15dip, 30d";
_p.AddView((javafx.scene.Node)(_xlbl.getObject()),__c.DipToCurrent((int) (2)),_p.getHeight()/(double)2-__c.DipToCurrent((int) (15)),__c.DipToCurrent((int) (30)),__c.DipToCurrent((int) (30)));
 };
 }
};
RDebugUtils.currentLine=181665812;
 //BA.debugLineNum = 181665812;BA.debugLine="End Sub";
return "";
}
public String  _resize(b4j.docU.jamtableclvclvdragger __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvclvdragger";
if (Debug.shouldDelegate(ba, "resize", true))
	 {return ((String) Debug.delegate(ba, "resize", null));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=181469184;
 //BA.debugLineNum = 181469184;BA.debugLine="Public Sub Resize";
RDebugUtils.currentLine=181469185;
 //BA.debugLineNum = 181469185;BA.debugLine="For i = 0 To list.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._list /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=181469186;
 //BA.debugLineNum = 181469186;BA.debugLine="Dim p As B4XView = list.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._list /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=181469187;
 //BA.debugLineNum = 181469187;BA.debugLine="Dim v As B4XView = p.GetView(p.NumberOfViews - 1";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _p.GetView((int) (_p.getNumberOfViews()-1));
RDebugUtils.currentLine=181469188;
 //BA.debugLineNum = 181469188;BA.debugLine="If v Is Label And v.Tag = list Then";
if (_v.getObjectOrNull() instanceof javafx.scene.control.Label && (_v.getTag()).equals((Object)(__ref._list /*b4j.example.customlistview*/ ))) { 
RDebugUtils.currentLine=181469189;
 //BA.debugLineNum = 181469189;BA.debugLine="v.Left = p.Width - 32dip";
_v.setLeft(_p.getWidth()-__c.DipToCurrent((int) (32)));
 };
 }
};
RDebugUtils.currentLine=181469192;
 //BA.debugLineNum = 181469192;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.docU.jamtableclvclvdragger __ref,anywheresoftware.b4a.BA _ba,Object _callback,b4j.example.customlistview _clv) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="jamtableclvclvdragger";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_clv}));}
RDebugUtils.currentLine=181403648;
 //BA.debugLineNum = 181403648;BA.debugLine="Public Sub Initialize (Callback As Object, clv As";
RDebugUtils.currentLine=181403649;
 //BA.debugLineNum = 181403649;BA.debugLine="mCallback=Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=181403650;
 //BA.debugLineNum = 181403650;BA.debugLine="list = clv";
__ref._list /*b4j.example.customlistview*/  = _clv;
RDebugUtils.currentLine=181403651;
 //BA.debugLineNum = 181403651;BA.debugLine="PressedColor = list.PressedColor";
__ref._pressedcolor /*int*/  = __ref._list /*b4j.example.customlistview*/ ._pressedcolor;
RDebugUtils.currentLine=181403652;
 //BA.debugLineNum = 181403652;BA.debugLine="End Sub";
return "";
}
public boolean  _islastviewadraglabel(b4j.docU.jamtableclvclvdragger __ref,anywheresoftware.b4a.objects.B4XViewWrapper _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvclvdragger";
if (Debug.shouldDelegate(ba, "islastviewadraglabel", true))
	 {return ((Boolean) Debug.delegate(ba, "islastviewadraglabel", new Object[] {_p}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=181600256;
 //BA.debugLineNum = 181600256;BA.debugLine="Private Sub IsLastViewADragLabel (p As B4XView) As";
RDebugUtils.currentLine=181600257;
 //BA.debugLineNum = 181600257;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=181600258;
 //BA.debugLineNum = 181600258;BA.debugLine="Dim v As B4XView = p.GetView(p.NumberOfViews - 1";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = _p.GetView((int) (_p.getNumberOfViews()-1));
RDebugUtils.currentLine=181600259;
 //BA.debugLineNum = 181600259;BA.debugLine="Return v Is Label And v.Tag = list";
if (true) return _v.getObjectOrNull() instanceof javafx.scene.control.Label && (_v.getTag()).equals((Object)(__ref._list /*b4j.example.customlistview*/ ));
 };
RDebugUtils.currentLine=181600261;
 //BA.debugLineNum = 181600261;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=181600262;
 //BA.debugLineNum = 181600262;BA.debugLine="End Sub";
return false;
}
public String  _class_globals(b4j.docU.jamtableclvclvdragger __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvclvdragger";
RDebugUtils.currentLine=181338112;
 //BA.debugLineNum = 181338112;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=181338113;
 //BA.debugLineNum = 181338113;BA.debugLine="Private mCallback As Object";
_mcallback = new Object();
RDebugUtils.currentLine=181338114;
 //BA.debugLineNum = 181338114;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=181338115;
 //BA.debugLineNum = 181338115;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=181338116;
 //BA.debugLineNum = 181338116;BA.debugLine="Private list As CustomListView";
_list = new b4j.example.customlistview();
RDebugUtils.currentLine=181338117;
 //BA.debugLineNum = 181338117;BA.debugLine="Private PressedColor As Int";
_pressedcolor = 0;
RDebugUtils.currentLine=181338118;
 //BA.debugLineNum = 181338118;BA.debugLine="End Sub";
return "";
}
public void  _drag_mousepressed(b4j.docU.jamtableclvclvdragger __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
RDebugUtils.currentModule="jamtableclvclvdragger";
if (Debug.shouldDelegate(ba, "drag_mousepressed", true))
	 {Debug.delegate(ba, "drag_mousepressed", new Object[] {_eventdata}); return;}
ResumableSub_Drag_MousePressed rsub = new ResumableSub_Drag_MousePressed(this,__ref,_eventdata);
rsub.resume(ba, null);
}
public static class ResumableSub_Drag_MousePressed extends BA.ResumableSub {
public ResumableSub_Drag_MousePressed(b4j.docU.jamtableclvclvdragger parent,b4j.docU.jamtableclvclvdragger __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) {
this.parent = parent;
this.__ref = __ref;
this._eventdata = _eventdata;
this.__ref = parent;
}
b4j.docU.jamtableclvclvdragger __ref;
b4j.docU.jamtableclvclvdragger parent;
anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _liststarty = 0;
int _top = 0;
int _listy = 0;
int _delta = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="jamtableclvclvdragger";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=181731329;
 //BA.debugLineNum = 181731329;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent.__c.Sender(ba)));
RDebugUtils.currentLine=181731330;
 //BA.debugLineNum = 181731330;BA.debugLine="Dim list As CustomListView = lbl.Tag";
parent._list = (b4j.example.customlistview)(_lbl.getTag());
RDebugUtils.currentLine=181731331;
 //BA.debugLineNum = 181731331;BA.debugLine="Dim pnl As B4XView = list.GetPanel(list.GetItemFr";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._list /*b4j.example.customlistview*/ ._getpanel(__ref._list /*b4j.example.customlistview*/ ._getitemfromview(_lbl)).getParent();
RDebugUtils.currentLine=181731332;
 //BA.debugLineNum = 181731332;BA.debugLine="pnl.GetView(0).SetColorAndBorder(xui.Color_Transp";
_pnl.GetView((int) (0)).SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,parent.__c.DipToCurrent((int) (3)),((int)0xff503acd),0);
RDebugUtils.currentLine=181731333;
 //BA.debugLineNum = 181731333;BA.debugLine="Dim ListStartY As Int = EventData.Y + lbl.Top + p";
_liststarty = (int) (_eventdata.getY()+_lbl.getTop()+_pnl.getTop());
RDebugUtils.currentLine=181731334;
 //BA.debugLineNum = 181731334;BA.debugLine="pnl.BringToFront";
_pnl.BringToFront();
RDebugUtils.currentLine=181731335;
 //BA.debugLineNum = 181731335;BA.debugLine="Dim Top As Int = pnl.Top";
_top = (int) (_pnl.getTop());
RDebugUtils.currentLine=181731336;
 //BA.debugLineNum = 181731336;BA.debugLine="Do While True";
if (true) break;

case 1:
//do while
this.state = 10;
while (parent.__c.True) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=181731337;
 //BA.debugLineNum = 181731337;BA.debugLine="Wait For (lbl) Drag_MouseDragged (EventData As M";
parent.__c.WaitFor("drag_mousedragged", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "jamtableclvclvdragger", "drag_mousepressed"), (Object)(_lbl.getObject()));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_eventdata = (anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper) result[1];
;
RDebugUtils.currentLine=181731338;
 //BA.debugLineNum = 181731338;BA.debugLine="If pnl.Top < list.sv.ScrollViewOffsetY Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_pnl.getTop()<__ref._list /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY()) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=181731340;
 //BA.debugLineNum = 181731340;BA.debugLine="Else If list.sv.ScrollViewOffsetY + list.sv.Heig";
if (__ref._list /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY()+__ref._list /*b4j.example.customlistview*/ ._sv.getHeight()<_pnl.getTop()+_pnl.getHeight()) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=181731339;
 //BA.debugLineNum = 181731339;BA.debugLine="list.sv.ScrollViewOffsetY = Max(0, list.sv.Scro";
__ref._list /*b4j.example.customlistview*/ ._sv.setScrollViewOffsetY(parent.__c.Max(0,__ref._list /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY()-parent.__c.DipToCurrent((int) (10))));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=181731341;
 //BA.debugLineNum = 181731341;BA.debugLine="list.sv.ScrollViewOffsetY = list.sv.ScrollViewO";
__ref._list /*b4j.example.customlistview*/ ._sv.setScrollViewOffsetY(__ref._list /*b4j.example.customlistview*/ ._sv.getScrollViewOffsetY()+parent.__c.DipToCurrent((int) (10)));
 if (true) break;

case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=181731343;
 //BA.debugLineNum = 181731343;BA.debugLine="Dim ListY As Int = EventData.Y + lbl.Top + pnl.T";
_listy = (int) (_eventdata.getY()+_lbl.getTop()+_pnl.getTop());
RDebugUtils.currentLine=181731344;
 //BA.debugLineNum = 181731344;BA.debugLine="Dim delta As Int = ListY - ListStartY";
_delta = (int) (_listy-_liststarty);
RDebugUtils.currentLine=181731345;
 //BA.debugLineNum = 181731345;BA.debugLine="pnl.Top = Top + delta";
_pnl.setTop(_top+_delta);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=181731347;
 //BA.debugLineNum = 181731347;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _drag_mousereleased(b4j.docU.jamtableclvclvdragger __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvclvdragger";
if (Debug.shouldDelegate(ba, "drag_mousereleased", true))
	 {return ((String) Debug.delegate(ba, "drag_mousereleased", new Object[] {_eventdata}));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _index = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
int _offset = 0;
int _newindex = 0;
b4j.example.customlistview._clvitem _underlyingitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _actualitem = null;
b4j.example.customlistview._clvitem _rawitem = null;
RDebugUtils.currentLine=181796864;
 //BA.debugLineNum = 181796864;BA.debugLine="Private Sub Drag_MouseReleased (EventData As Mouse";
RDebugUtils.currentLine=181796865;
 //BA.debugLineNum = 181796865;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=181796866;
 //BA.debugLineNum = 181796866;BA.debugLine="Dim list As CustomListView = lbl.Tag";
_list = (b4j.example.customlistview)(_lbl.getTag());
RDebugUtils.currentLine=181796867;
 //BA.debugLineNum = 181796867;BA.debugLine="Dim index As Int = list.GetItemFromView(lbl)";
_index = __ref._list /*b4j.example.customlistview*/ ._getitemfromview(_lbl);
RDebugUtils.currentLine=181796868;
 //BA.debugLineNum = 181796868;BA.debugLine="Dim pnl As B4XView = list.GetPanel(index).Parent";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._list /*b4j.example.customlistview*/ ._getpanel(_index).getParent();
RDebugUtils.currentLine=181796869;
 //BA.debugLineNum = 181796869;BA.debugLine="Dim Offset As Int = pnl.Top + pnl.Height / 2";
_offset = (int) (_pnl.getTop()+_pnl.getHeight()/(double)2);
RDebugUtils.currentLine=181796870;
 //BA.debugLineNum = 181796870;BA.debugLine="Dim NewIndex As Int = list.FindIndexFromOffset(Of";
_newindex = __ref._list /*b4j.example.customlistview*/ ._findindexfromoffset(_offset);
RDebugUtils.currentLine=181796871;
 //BA.debugLineNum = 181796871;BA.debugLine="Dim UnderlyingItem As CLVItem = list.GetRawListIt";
_underlyingitem = __ref._list /*b4j.example.customlistview*/ ._getrawlistitem(_newindex);
RDebugUtils.currentLine=181796872;
 //BA.debugLineNum = 181796872;BA.debugLine="If Offset - UnderlyingItem.Offset > UnderlyingIte";
if (_offset-_underlyingitem.Offset>_underlyingitem.Size/(double)2) { 
_newindex = (int) (_newindex+1);};
RDebugUtils.currentLine=181796873;
 //BA.debugLineNum = 181796873;BA.debugLine="Dim ActualItem As B4XView = pnl.GetView(0)";
_actualitem = new anywheresoftware.b4a.objects.B4XViewWrapper();
_actualitem = _pnl.GetView((int) (0));
RDebugUtils.currentLine=181796874;
 //BA.debugLineNum = 181796874;BA.debugLine="ActualItem.SetColorAndBorder(pnl.Color, 0dip, xui";
_actualitem.SetColorAndBorder(_pnl.getColor(),__c.DipToCurrent((int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,0);
RDebugUtils.currentLine=181796875;
 //BA.debugLineNum = 181796875;BA.debugLine="Dim RawItem As CLVItem = list.GetRawListItem(inde";
_rawitem = __ref._list /*b4j.example.customlistview*/ ._getrawlistitem(_index);
RDebugUtils.currentLine=181796876;
 //BA.debugLineNum = 181796876;BA.debugLine="list.RemoveAt(index)";
__ref._list /*b4j.example.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=181796877;
 //BA.debugLineNum = 181796877;BA.debugLine="If NewIndex > index Then NewIndex = NewIndex - 1";
if (_newindex>_index) { 
_newindex = (int) (_newindex-1);};
RDebugUtils.currentLine=181796878;
 //BA.debugLineNum = 181796878;BA.debugLine="NewIndex = Max(0, Min(list.Size, NewIndex))";
_newindex = (int) (__c.Max(0,__c.Min(__ref._list /*b4j.example.customlistview*/ ._getsize(),_newindex)));
RDebugUtils.currentLine=181796879;
 //BA.debugLineNum = 181796879;BA.debugLine="list.InsertAt(NewIndex, ActualItem, RawItem.Value";
__ref._list /*b4j.example.customlistview*/ ._insertat(_newindex,_actualitem,_rawitem.Value);
RDebugUtils.currentLine=181796880;
 //BA.debugLineNum = 181796880;BA.debugLine="list.GetRawListItem(NewIndex).TextItem = RawItem.";
__ref._list /*b4j.example.customlistview*/ ._getrawlistitem(_newindex).TextItem = _rawitem.TextItem;
RDebugUtils.currentLine=181796882;
 //BA.debugLineNum = 181796882;BA.debugLine="Log(\"Drag_MouseReleased\")";
__c.LogImpl("9181796882","Drag_MouseReleased",0);
RDebugUtils.currentLine=181796883;
 //BA.debugLineNum = 181796883;BA.debugLine="CallSubDelayed(mCallback,\"RecalcularIDOrdenColumn";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,"RecalcularIDOrdenColumnas");
RDebugUtils.currentLine=181796884;
 //BA.debugLineNum = 181796884;BA.debugLine="End Sub";
return "";
}
public String  _removedragbuttons(b4j.docU.jamtableclvclvdragger __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="jamtableclvclvdragger";
if (Debug.shouldDelegate(ba, "removedragbuttons", true))
	 {return ((String) Debug.delegate(ba, "removedragbuttons", null));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=181534720;
 //BA.debugLineNum = 181534720;BA.debugLine="Public Sub RemoveDragButtons";
RDebugUtils.currentLine=181534721;
 //BA.debugLineNum = 181534721;BA.debugLine="For i = 0 To list.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._list /*b4j.example.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=181534722;
 //BA.debugLineNum = 181534722;BA.debugLine="Dim p As B4XView = list.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._list /*b4j.example.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=181534723;
 //BA.debugLineNum = 181534723;BA.debugLine="If IsLastViewADragLabel(p) Then";
if (__ref._islastviewadraglabel /*boolean*/ (null,_p)) { 
RDebugUtils.currentLine=181534724;
 //BA.debugLineNum = 181534724;BA.debugLine="p.GetView(p.NumberOfViews - 1).RemoveViewFromPa";
_p.GetView((int) (_p.getNumberOfViews()-1)).RemoveViewFromParent();
 };
 }
};
RDebugUtils.currentLine=181534727;
 //BA.debugLineNum = 181534727;BA.debugLine="list.PressedColor = PressedColor";
__ref._list /*b4j.example.customlistview*/ ._pressedcolor = __ref._pressedcolor /*int*/ ;
RDebugUtils.currentLine=181534728;
 //BA.debugLineNum = 181534728;BA.debugLine="End Sub";
return "";
}
}